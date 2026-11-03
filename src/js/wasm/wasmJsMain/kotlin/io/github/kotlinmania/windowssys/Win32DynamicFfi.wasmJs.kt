@file:OptIn(ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys

// Hide require('@kotlinmania/windowssys-native-bindings') behind new Function so webpack browser bundles never scan it statically.
private fun wasmHasNodeWin32Addon(): Boolean =
    js(
        "{ try { var rq = (new Function('return typeof require === \"function\" ? require : null'))(); if (!rq) return false; var m = rq('@kotlinmania/windowssys-native-bindings'); globalThis.__kmWin32Addon = m; return !!m; } catch (e) { return false; } }",
    )

private fun wasmAddonIsWindowsHost(): Boolean =
    js("{ return !!(globalThis.__kmWin32Addon && globalThis.__kmWin32Addon.isWindowsHost()); }")

private fun wasmAddonInvokeCsv(
    dll: String,
    symbol: String,
    flatCsv: String,
): String =
    js(
        "{ var parts = flatCsv.length === 0 ? [] : flatCsv.split(',').map(Number); var r = globalThis.__kmWin32Addon.invokeLoHi(dll, symbol, parts); return r[0] + ',' + r[1] + ',' + r[2]; }",
    )

private fun wasmAddonInvokeFpCsv(
    dll: String,
    symbol: String,
    fpMask: Int,
    retF32: Int,
    flatCsv: String,
): String =
    js(
        "{ var parts = flatCsv.length === 0 ? [] : flatCsv.split(',').map(Number); var r = globalThis.__kmWin32Addon.invokeFpPair(dll, symbol, fpMask, retF32, parts); return r[0] + ',' + r[1]; }",
    )

private fun wasmAddonInvokePtrCsv(
    lo: Int,
    hi: Int,
    flatCsv: String,
): String =
    js(
        "{ var parts = flatCsv.length === 0 ? [] : flatCsv.split(',').map(Number); var r = globalThis.__kmWin32Addon.invokePtrLoHi(lo, hi, parts); return r[0] + ',' + r[1] + ',' + r[2]; }",
    )

private fun wasmAddonAllocCsv(size: Int): String =
    js("{ var r = globalThis.__kmWin32Addon.allocZeroedLoHi(size); return r[0] + ',' + r[1]; }")

private fun wasmAddonFree(
    lo: Int,
    hi: Int,
): Unit =
    js("{ globalThis.__kmWin32Addon.freeMemLoHi(lo, hi); }")

private fun wasmAddonReadCsv(
    lo: Int,
    hi: Int,
    length: Int,
): String =
    js("{ var r = globalThis.__kmWin32Addon.readBytesLoHi(lo, hi, length); return Array.from(r).join(','); }")

private fun wasmAddonWriteCsv(
    lo: Int,
    hi: Int,
    bytesCsv: String,
): Unit =
    js(
        "{ var arr = bytesCsv.length === 0 ? [] : bytesCsv.split(',').map(Number); globalThis.__kmWin32Addon.writeBytesLoHi(lo, hi, arr); }",
    )

internal actual object Win32DynamicFfi {
    private val hasAddon: Boolean = wasmHasNodeWin32Addon()
    private var arena = ByteArray(65536)
    private var arenaOffset = 64
    private val objectHandles = HashMap<Any, Long>()
    private var nextHandleId = 0x1000_0000L

    private fun packLoHi(
        lo: Int,
        hi: Int,
    ): Long = (hi.toLong() shl 32) or (lo.toLong() and 0xFFFF_FFFFL)

    private fun encodeArgsCsv(args: LongArray): String {
        if (args.isEmpty()) return ""
        val sb = StringBuilder(args.size * 12)
        for (i in args.indices) {
            if (i > 0) sb.append(',')
            sb.append(args[i].toInt())
            sb.append(',')
            sb.append((args[i] ushr 32).toInt())
        }
        return sb.toString()
    }

    actual fun isWindowsHost(): Boolean = hasAddon && wasmAddonIsWindowsHost()

    actual fun invoke(
        dll: String,
        symbol: String,
        args: LongArray,
    ): Long {
        if (!hasAddon) {
            throw UnsupportedOperationException("Win32 dynamic FFI ($dll!$symbol) requires a Windows Node.js host")
        }
        val parts = wasmAddonInvokeCsv(dll, symbol, encodeArgsCsv(args)).split(',')
        val status = parts[2].toInt()
        if (status == -2) {
            throw UnsupportedOperationException("Win32 dynamic FFI ($dll!$symbol) requires a Windows host")
        }
        if (status != 0) {
            throw IllegalStateException("Win32 symbol resolution failed ($status): $dll!$symbol")
        }
        return packLoHi(parts[0].toInt(), parts[1].toInt())
    }

    actual fun invokeFp(
        dll: String,
        symbol: String,
        fpMask: Int,
        returnIsFloat32: Boolean,
        args: LongArray,
    ): Double {
        if (!hasAddon) {
            throw UnsupportedOperationException("Win32 dynamic FFI ($dll!$symbol) requires a Windows Node.js host")
        }
        val parts = wasmAddonInvokeFpCsv(dll, symbol, fpMask, if (returnIsFloat32) 1 else 0, encodeArgsCsv(args)).split(',')
        val status = parts[1].toInt()
        if (status == -2) {
            throw UnsupportedOperationException("Win32 dynamic FFI ($dll!$symbol) requires a Windows host")
        }
        if (status != 0) {
            throw IllegalStateException("Win32 symbol resolution failed ($status): $dll!$symbol")
        }
        return parts[0].toDouble()
    }

    actual fun invokePtr(
        fnPtr: Long,
        args: LongArray,
    ): Long {
        if (!hasAddon) {
            throw UnsupportedOperationException("Win32 dynamic FFI (<fnptr>) requires a Windows Node.js host")
        }
        val parts = wasmAddonInvokePtrCsv(fnPtr.toInt(), (fnPtr ushr 32).toInt(), encodeArgsCsv(args)).split(',')
        val status = parts[2].toInt()
        if (status == -2) {
            throw UnsupportedOperationException("Win32 dynamic FFI (<fnptr>) requires a Windows host")
        }
        if (status != 0) {
            throw IllegalStateException("Win32 function pointer call failed ($status)")
        }
        return packLoHi(parts[0].toInt(), parts[1].toInt())
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
        if (hasAddon) {
            val parts = wasmAddonAllocCsv(n).split(',')
            return packLoHi(parts[0].toInt(), parts[1].toInt())
        }
        val aligned = (arenaOffset + 7) and -8
        if (aligned + n > arena.size) {
            arena = arena.copyOf(maxOf(arena.size * 2, aligned + n + 4096))
        }
        arenaOffset = aligned + n
        return aligned.toLong()
    }

    actual fun freeMem(address: Long) {
        if (hasAddon && address != 0L) {
            wasmAddonFree(address.toInt(), (address ushr 32).toInt())
        }
    }

    actual fun readBytes(
        address: Long,
        length: Int,
    ): ByteArray {
        if (length <= 0 || address == 0L) return ByteArray(0)
        if (hasAddon) {
            val csv = wasmAddonReadCsv(address.toInt(), (address ushr 32).toInt(), length)
            if (csv.isEmpty()) return ByteArray(0)
            val parts = csv.split(',')
            return ByteArray(parts.size) { parts[it].toInt().toByte() }
        }
        val start = address.toInt()
        return arena.copyOfRange(start, start + length)
    }

    actual fun writeBytes(
        address: Long,
        source: ByteArray,
    ) {
        if (source.isEmpty() || address == 0L) return
        if (hasAddon) {
            val csv = source.joinToString(",") { (it.toInt() and 0xFF).toString() }
            wasmAddonWriteCsv(address.toInt(), (address ushr 32).toInt(), csv)
            return
        }
        source.copyInto(arena, destinationOffset = address.toInt())
    }
}
