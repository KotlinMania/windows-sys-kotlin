@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys

internal expect object Win32DynamicFfi {
    fun isWindowsHost(): Boolean

    fun invoke(
        dll: String,
        symbol: String,
        args: LongArray,
    ): Long

    fun invokeFp(
        dll: String,
        symbol: String,
        fpMask: Int,
        returnIsFloat32: Boolean,
        args: LongArray,
    ): Double

    fun invokePtr(
        fnPtr: Long,
        args: LongArray,
    ): Long

    fun guidSlot(
        data1: UInt,
        data2: UShort,
        data3: UShort,
        data4: UByteArray,
    ): Long

    fun objectSlot(value: Any?): Long

    fun allocZeroed(size: Int): Long

    fun freeMem(address: Long)

    fun readBytes(
        address: Long,
        length: Int,
    ): ByteArray

    fun writeBytes(
        address: Long,
        source: ByteArray,
    )
}

internal object Win32LiteralPool {
    private val utf8Interned = HashMap<String, Long>()
    private val utf16Interned = HashMap<String, Long>()

    fun utf8Pointer(literal: String): Long {
        utf8Interned[literal]?.let { return it }
        val encoded = literal.encodeToByteArray()
        val nullTerminated = ByteArray(encoded.size + 1)
        encoded.copyInto(nullTerminated, destinationOffset = 0)
        val ptr = Win32DynamicFfi.allocZeroed(nullTerminated.size)
        Win32DynamicFfi.writeBytes(ptr, nullTerminated)
        utf8Interned[literal] = ptr
        return ptr
    }

    fun utf16Pointer(literal: String): Long {
        utf16Interned[literal]?.let { return it }
        val units = literal.length
        val nullTerminated = ByteArray((units + 1) * 2)
        for (i in 0 until units) {
            val code = literal[i].code
            nullTerminated[i * 2] = (code and 0xFF).toByte()
            nullTerminated[i * 2 + 1] = ((code ushr 8) and 0xFF).toByte()
        }
        val ptr = Win32DynamicFfi.allocZeroed(nullTerminated.size)
        Win32DynamicFfi.writeBytes(ptr, nullTerminated)
        utf16Interned[literal] = ptr
        return ptr
    }
}
