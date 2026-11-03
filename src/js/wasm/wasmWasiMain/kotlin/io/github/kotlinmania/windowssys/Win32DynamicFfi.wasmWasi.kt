@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys

internal actual object Win32DynamicFfi {
    private var arena = ByteArray(65536)
    private var arenaOffset = 64
    private val objectHandles = HashMap<Any, Long>()
    private var nextHandleId = 0x1000_0000L

    actual fun isWindowsHost(): Boolean = false

    actual fun invoke(
        dll: String,
        symbol: String,
        args: LongArray,
    ): Long = throw UnsupportedOperationException("Win32 dynamic FFI ($dll!$symbol) is unavailable on WASI")

    actual fun invokeFp(
        dll: String,
        symbol: String,
        fpMask: Int,
        returnIsFloat32: Boolean,
        args: LongArray,
    ): Double = throw UnsupportedOperationException("Win32 dynamic FFI ($dll!$symbol) is unavailable on WASI")

    actual fun invokePtr(
        fnPtr: Long,
        args: LongArray,
    ): Long = throw UnsupportedOperationException("Win32 dynamic FFI (<fnptr>) is unavailable on WASI")

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
        val aligned = (arenaOffset + 7) and -8
        if (aligned + n > arena.size) {
            arena = arena.copyOf(maxOf(arena.size * 2, aligned + n + 4096))
        }
        arenaOffset = aligned + n
        return aligned.toLong()
    }

    actual fun freeMem(address: Long) {
        if (address == 0L) return
    }

    actual fun readBytes(
        address: Long,
        length: Int,
    ): ByteArray {
        if (length <= 0 || address == 0L) return ByteArray(0)
        val start = address.toInt()
        return arena.copyOfRange(start, start + length)
    }

    actual fun writeBytes(
        address: Long,
        source: ByteArray,
    ) {
        if (source.isEmpty() || address == 0L) return
        source.copyInto(arena, destinationOffset = address.toInt())
    }
}
