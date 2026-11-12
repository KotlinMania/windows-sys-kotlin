@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.compression

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

private object WindowsWin32StorageCompressionJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32StorageCompressionJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32StorageCompressionCloseCompressor(compressorhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCompressionCloseDecompressor(decompressorhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCompressionCompress(compressorhandle: Long, uncompresseddata: Long, uncompresseddatasize: Long, compressedbuffer: Long, compressedbuffersize: Long, compresseddatasize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCompressionCreateCompressor(algorithm: Int, allocationroutines: Long, compressorhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCompressionCreateDecompressor(algorithm: Int, allocationroutines: Long, decompressorhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCompressionDecompress(decompressorhandle: Long, compresseddata: Long, compresseddatasize: Long, uncompressedbuffer: Long, uncompressedbuffersize: Long, uncompresseddatasize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCompressionQueryCompressorInformation(compressorhandle: Long, compressinformationclass: Int, compressinformation: Long, compressinformationsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCompressionQueryDecompressorInformation(decompressorhandle: Long, compressinformationclass: Int, compressinformation: Long, compressinformationsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCompressionResetCompressor(compressorhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCompressionResetDecompressor(decompressorhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCompressionSetCompressorInformation(compressorhandle: Long, compressinformationclass: Int, compressinformation: Long, compressinformationsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCompressionSetDecompressorInformation(decompressorhandle: Long, compressinformationclass: Int, compressinformation: Long, compressinformationsize: Long): Int
}

public actual fun closeCompressor(compressorhandle: CompressorHandle): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssysWindowsWin32StorageCompressionCloseCompressor(compressorhandle.rawAddress)

public actual fun closeDecompressor(decompressorhandle: DecompressorHandle): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssysWindowsWin32StorageCompressionCloseDecompressor(decompressorhandle.rawAddress)

public actual fun compress(compressorhandle: CompressorHandle, uncompresseddata: ConstPtr<CVoid>, uncompresseddatasize: ULong, compressedbuffer: MutPtr<CVoid>, compressedbuffersize: ULong, compresseddatasize: MutPtr<ULong>): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssysWindowsWin32StorageCompressionCompress(compressorhandle.rawAddress, uncompresseddata.rawAddress, uncompresseddatasize.toLong(), compressedbuffer.rawAddress, compressedbuffersize.toLong(), compresseddatasize.rawAddress)

public actual fun createCompressor(algorithm: CompressAlgorithm, allocationroutines: ConstPtr<CompressAllocationRoutines>, compressorhandle: MutPtr<CompressorHandle>): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssysWindowsWin32StorageCompressionCreateCompressor(algorithm.toInt(), allocationroutines.rawAddress, compressorhandle.rawAddress)

public actual fun createDecompressor(algorithm: CompressAlgorithm, allocationroutines: ConstPtr<CompressAllocationRoutines>, decompressorhandle: MutPtr<DecompressorHandle>): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssysWindowsWin32StorageCompressionCreateDecompressor(algorithm.toInt(), allocationroutines.rawAddress, decompressorhandle.rawAddress)

public actual fun decompress(decompressorhandle: DecompressorHandle, compresseddata: ConstPtr<CVoid>, compresseddatasize: ULong, uncompressedbuffer: MutPtr<CVoid>, uncompressedbuffersize: ULong, uncompresseddatasize: MutPtr<ULong>): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssysWindowsWin32StorageCompressionDecompress(decompressorhandle.rawAddress, compresseddata.rawAddress, compresseddatasize.toLong(), uncompressedbuffer.rawAddress, uncompressedbuffersize.toLong(), uncompresseddatasize.rawAddress)

public actual fun queryCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: MutPtr<CVoid>, compressinformationsize: ULong): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssysWindowsWin32StorageCompressionQueryCompressorInformation(compressorhandle.rawAddress, compressinformationclass, compressinformation.rawAddress, compressinformationsize.toLong())

public actual fun queryDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: MutPtr<CVoid>, compressinformationsize: ULong): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssysWindowsWin32StorageCompressionQueryDecompressorInformation(decompressorhandle.rawAddress, compressinformationclass, compressinformation.rawAddress, compressinformationsize.toLong())

public actual fun resetCompressor(compressorhandle: CompressorHandle): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssysWindowsWin32StorageCompressionResetCompressor(compressorhandle.rawAddress)

public actual fun resetDecompressor(decompressorhandle: DecompressorHandle): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssysWindowsWin32StorageCompressionResetDecompressor(decompressorhandle.rawAddress)

public actual fun setCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: ConstPtr<CVoid>, compressinformationsize: ULong): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssysWindowsWin32StorageCompressionSetCompressorInformation(compressorhandle.rawAddress, compressinformationclass, compressinformation.rawAddress, compressinformationsize.toLong())

public actual fun setDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: ConstPtr<CVoid>, compressinformationsize: ULong): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssysWindowsWin32StorageCompressionSetDecompressorInformation(decompressorhandle.rawAddress, compressinformationclass, compressinformation.rawAddress, compressinformationsize.toLong())
