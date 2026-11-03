package io.github.kotlinmania.windowssys.internal

internal object WindowssysJni {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun isWindowsHost(): Boolean

    @JvmStatic
    external fun invoke(
        dll: String,
        symbol: String,
        args: LongArray,
    ): Long

    @JvmStatic
    external fun invokeFp(
        dll: String,
        symbol: String,
        fpMask: Int,
        returnIsFloat32: Boolean,
        args: LongArray,
    ): Double

    @JvmStatic
    external fun invokePtr(
        fnPtr: Long,
        args: LongArray,
    ): Long

    @JvmStatic
    external fun guidSlot(
        d1: Int,
        d2: Short,
        d3: Short,
        d4: ByteArray,
    ): Long

    @JvmStatic
    external fun allocZeroed(size: Int): Long

    @JvmStatic
    external fun freeMem(address: Long)

    @JvmStatic
    external fun readBytes(
        address: Long,
        length: Int,
    ): ByteArray

    @JvmStatic
    external fun writeBytes(
        address: Long,
        source: ByteArray,
    )
}
