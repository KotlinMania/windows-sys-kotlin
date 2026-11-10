@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.compression

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

private object WindowsWin32StorageCompressionJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_closeCompressor(compressorhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_closeDecompressor(decompressorhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_compress(compressorhandle: Long, uncompresseddata: Long, uncompresseddatasize: Long, compressedbuffer: Long, compressedbuffersize: Long, compresseddatasize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_createCompressor(algorithm: Int, allocationroutines: Long, compressorhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_createDecompressor(algorithm: Int, allocationroutines: Long, decompressorhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_decompress(decompressorhandle: Long, compresseddata: Long, compresseddatasize: Long, uncompressedbuffer: Long, uncompressedbuffersize: Long, uncompresseddatasize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_queryCompressorInformation(compressorhandle: Long, compressinformationclass: Int, compressinformation: Long, compressinformationsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_queryDecompressorInformation(decompressorhandle: Long, compressinformationclass: Int, compressinformation: Long, compressinformationsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_resetCompressor(compressorhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_resetDecompressor(decompressorhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_setCompressorInformation(compressorhandle: Long, compressinformationclass: Int, compressinformation: Long, compressinformationsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_setDecompressorInformation(decompressorhandle: Long, compressinformationclass: Int, compressinformation: Long, compressinformationsize: Long): Int
}

public actual fun closeCompressor(compressorhandle: CompressorHandle): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_closeCompressor((compressorhandle?.value ?: 0L))

public actual fun closeDecompressor(decompressorhandle: DecompressorHandle): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_closeDecompressor((decompressorhandle?.value ?: 0L))

public actual fun compress(compressorhandle: CompressorHandle, uncompresseddata: COpaquePointer?, uncompresseddatasize: ULong, compressedbuffer: COpaquePointer?, compressedbuffersize: ULong, compresseddatasize: COpaquePointer?): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_compress((compressorhandle?.value ?: 0L), (uncompresseddata?.value ?: 0L), uncompresseddatasize.toLong(), (compressedbuffer?.value ?: 0L), compressedbuffersize.toLong(), (compresseddatasize?.value ?: 0L))

public actual fun createCompressor(algorithm: CompressAlgorithm, allocationroutines: COpaquePointer?, compressorhandle: COpaquePointer?): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_createCompressor(algorithm.toInt(), (allocationroutines?.value ?: 0L), (compressorhandle?.value ?: 0L))

public actual fun createDecompressor(algorithm: CompressAlgorithm, allocationroutines: COpaquePointer?, decompressorhandle: COpaquePointer?): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_createDecompressor(algorithm.toInt(), (allocationroutines?.value ?: 0L), (decompressorhandle?.value ?: 0L))

public actual fun decompress(decompressorhandle: DecompressorHandle, compresseddata: COpaquePointer?, compresseddatasize: ULong, uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: ULong, uncompresseddatasize: COpaquePointer?): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_decompress((decompressorhandle?.value ?: 0L), (compresseddata?.value ?: 0L), compresseddatasize.toLong(), (uncompressedbuffer?.value ?: 0L), uncompressedbuffersize.toLong(), (uncompresseddatasize?.value ?: 0L))

public actual fun queryCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: COpaquePointer?, compressinformationsize: ULong): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_queryCompressorInformation((compressorhandle?.value ?: 0L), compressinformationclass, (compressinformation?.value ?: 0L), compressinformationsize.toLong())

public actual fun queryDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: COpaquePointer?, compressinformationsize: ULong): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_queryDecompressorInformation((decompressorhandle?.value ?: 0L), compressinformationclass, (compressinformation?.value ?: 0L), compressinformationsize.toLong())

public actual fun resetCompressor(compressorhandle: CompressorHandle): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_resetCompressor((compressorhandle?.value ?: 0L))

public actual fun resetDecompressor(decompressorhandle: DecompressorHandle): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_resetDecompressor((decompressorhandle?.value ?: 0L))

public actual fun setCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: COpaquePointer?, compressinformationsize: ULong): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_setCompressorInformation((compressorhandle?.value ?: 0L), compressinformationclass, (compressinformation?.value ?: 0L), compressinformationsize.toLong())

public actual fun setDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: COpaquePointer?, compressinformationsize: ULong): Bool =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_setDecompressorInformation((decompressorhandle?.value ?: 0L), compressinformationclass, (compressinformation?.value ?: 0L), compressinformationsize.toLong())
