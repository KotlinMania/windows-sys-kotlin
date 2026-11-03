@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys

// Hide require('@kotlinmania/windowssys-native-bindings') behind new Function so webpack browser bundles never scan it statically.
private fun loadNodeWin32Addon(): dynamic =
    js(
        "(function(){ try { var rq = (new Function('return typeof require === \"function\" ? require : null'))(); if (!rq) return null; return rq('@kotlinmania/windowssys-native-bindings'); } catch (e) { return null; } })()",
    )

internal actual object Win32DynamicFfi {
    private val addon: dynamic = loadNodeWin32Addon()
    private var arena = ByteArray(65536)
    private var arenaOffset = 64
    private val objectHandles = HashMap<Any, Long>()
    private var nextHandleId = 0x1000_0000L

    private fun packLoHi(
        lo: Int,
        hi: Int,
    ): Long = (hi.toLong() shl 32) or (lo.toLong() and 0xFFFF_FFFFL)

    actual fun isWindowsHost(): Boolean = addon != null && (addon.isWindowsHost() as Boolean)

    actual fun invoke(
        dll: String,
        symbol: String,
        args: LongArray,
    ): Long {
        val mod = addon ?: throw UnsupportedOperationException("Win32 dynamic FFI ($dll!$symbol) requires a Windows Node.js host")
        val flat = IntArray(args.size * 2)
        for (i in args.indices) {
            flat[i * 2] = args[i].toInt()
            flat[i * 2 + 1] = (args[i] ushr 32).toInt()
        }
        val res = mod.invokeLoHi(dll, symbol, flat)
        val status = res[2] as Int
        if (status == -2) {
            throw UnsupportedOperationException("Win32 dynamic FFI ($dll!$symbol) requires a Windows host")
        }
        if (status != 0) {
            throw IllegalStateException("Win32 symbol resolution failed ($status): $dll!$symbol")
        }
        return packLoHi(res[0] as Int, res[1] as Int)
    }

    actual fun invokeFp(
        dll: String,
        symbol: String,
        fpMask: Int,
        returnIsFloat32: Boolean,
        args: LongArray,
    ): Double {
        val mod = addon ?: throw UnsupportedOperationException("Win32 dynamic FFI ($dll!$symbol) requires a Windows Node.js host")
        val flat = IntArray(args.size * 2)
        for (i in args.indices) {
            flat[i * 2] = args[i].toInt()
            flat[i * 2 + 1] = (args[i] ushr 32).toInt()
        }
        val res = mod.invokeFpPair(dll, symbol, fpMask, if (returnIsFloat32) 1 else 0, flat)
        val status = res[1] as Int
        if (status == -2) {
            throw UnsupportedOperationException("Win32 dynamic FFI ($dll!$symbol) requires a Windows host")
        }
        if (status != 0) {
            throw IllegalStateException("Win32 symbol resolution failed ($status): $dll!$symbol")
        }
        return res[0] as Double
    }

    actual fun invokePtr(
        fnPtr: Long,
        args: LongArray,
    ): Long {
        val mod = addon ?: throw UnsupportedOperationException("Win32 dynamic FFI (<fnptr>) requires a Windows Node.js host")
        val flat = IntArray(args.size * 2)
        for (i in args.indices) {
            flat[i * 2] = args[i].toInt()
            flat[i * 2 + 1] = (args[i] ushr 32).toInt()
        }
        val res = mod.invokePtrLoHi(fnPtr.toInt(), (fnPtr ushr 32).toInt(), flat)
        val status = res[2] as Int
        if (status == -2) {
            throw UnsupportedOperationException("Win32 dynamic FFI (<fnptr>) requires a Windows host")
        }
        if (status != 0) {
            throw IllegalStateException("Win32 function pointer call failed ($status)")
        }
        return packLoHi(res[0] as Int, res[1] as Int)
    }

    actual fun guidSlot(
        data1: UInt,
        data2: UShort,
        data3: UShort,
        data4: UByteArray,
    ): Long {
        val bytes = ByteArray(16)
        val d1 = data1.toInt()
        val d2 = data2.toInt()
        val d3 = data3.toInt()
        bytes[0] = (d1 and 0xFF).toByte()
        bytes[1] = ((d1 ushr 8) and 0xFF).toByte()
        bytes[2] = ((d1 ushr 16) and 0xFF).toByte()
        bytes[3] = ((d1 ushr 24) and 0xFF).toByte()
        bytes[4] = (d2 and 0xFF).toByte()
        bytes[5] = ((d2 ushr 8) and 0xFF).toByte()
        bytes[6] = (d3 and 0xFF).toByte()
        bytes[7] = ((d3 ushr 8) and 0xFF).toByte()
        val limit = minOf(8, data4.size)
        for (i in 0 until limit) {
            bytes[8 + i] = data4[i].toByte()
        }
        val ptr = allocZeroed(16)
        writeBytes(ptr, bytes)
        return ptr
    }

    actual fun objectSlot(value: Any?): Long {
        if (value == null) return 0L
        return objectHandles.getOrPut(value) { nextHandleId++ }
    }

    actual fun allocZeroed(size: Int): Long {
        val n = maxOf(size, 1)
        val mod = addon
        if (mod != null) {
            val pair = mod.allocZeroedLoHi(n)
            return packLoHi(pair[0] as Int, pair[1] as Int)
        }
        val aligned = (arenaOffset + 7) and -8
        if (aligned + n > arena.size) {
            arena = arena.copyOf(maxOf(arena.size * 2, aligned + n + 4096))
        }
        arenaOffset = aligned + n
        return aligned.toLong()
    }

    actual fun freeMem(address: Long) {
        val mod = addon
        if (mod != null && address != 0L) {
            mod.freeMemLoHi(address.toInt(), (address ushr 32).toInt())
        }
    }

    actual fun readBytes(
        address: Long,
        length: Int,
    ): ByteArray {
        if (length <= 0 || address == 0L) return ByteArray(0)
        val mod = addon
        if (mod != null) {
            val raw = mod.readBytesLoHi(address.toInt(), (address ushr 32).toInt(), length)
            val out = ByteArray(length)
            for (i in 0 until length) {
                out[i] = (raw[i] as Int).toByte()
            }
            return out
        }
        val start = address.toInt()
        return arena.copyOfRange(start, start + length)
    }

    actual fun writeBytes(
        address: Long,
        source: ByteArray,
    ) {
        if (source.isEmpty() || address == 0L) return
        val mod = addon
        if (mod != null) {
            val ints = IntArray(source.size) { source[it].toInt() and 0xFF }
            mod.writeBytesLoHi(address.toInt(), (address ushr 32).toInt(), ints)
            return
        }
        source.copyInto(arena, destinationOffset = address.toInt())
    }
}
