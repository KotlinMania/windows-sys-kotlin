package io.github.kotlinmania.windowssys.internal

import java.io.File

internal object WindowssysJni {
    init {
        try {
            System.loadLibrary("windowssys_jni")
        } catch (error: UnsatisfiedLinkError) {
            val os = System.getProperty("os.name", "").lowercase()
            val arch =
                when (System.getProperty("os.arch", "").lowercase()) {
                    "aarch64", "arm64" -> "aarch64"
                    "amd64", "x86_64" -> "x86_64"
                    else -> throw UnsatisfiedLinkError("Unsupported JNI architecture: ${System.getProperty("os.arch")}")
                }
            val platform =
                when {
                    os.contains("mac") || os.contains("darwin") -> "macos"
                    os.contains("windows") -> "windows"
                    os.contains("linux") -> "linux"
                    else -> throw UnsatisfiedLinkError("Unsupported JNI host: $os")
                }
            val mapped = System.mapLibraryName("windowssys_jni")
            val resource = "/io/github/kotlinmania/windowssys/native/$platform-$arch/$mapped"
            val stream =
                WindowssysJni::class.java.getResourceAsStream(resource)
                    ?: throw UnsatisfiedLinkError("Missing packaged JNI library $resource").apply { initCause(error) }
            val extracted = File.createTempFile("kotlinmania-windowssys-", "." + mapped.substringAfterLast('.'))
            extracted.deleteOnExit()
            stream.use { input -> extracted.outputStream().use { input.copyTo(it) } }
            System.load(extracted.absolutePath)
        }
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
