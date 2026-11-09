@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.compression

import io.github.kotlinmania.windowssys.core.BOOL

private object WindowsWin32StorageCompressionJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_CloseCompressor(compressorhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_CloseDecompressor(decompressorhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_Compress(compressorhandle: Long, uncompresseddata: Long, uncompresseddatasize: Long, compressedbuffer: Long, compressedbuffersize: Long, compresseddatasize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_CreateCompressor(algorithm: Int, allocationroutines: Long, compressorhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_CreateDecompressor(algorithm: Int, allocationroutines: Long, decompressorhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_Decompress(decompressorhandle: Long, compresseddata: Long, compresseddatasize: Long, uncompressedbuffer: Long, uncompressedbuffersize: Long, uncompresseddatasize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_QueryCompressorInformation(compressorhandle: Long, compressinformationclass: Int, compressinformation: Long, compressinformationsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_QueryDecompressorInformation(decompressorhandle: Long, compressinformationclass: Int, compressinformation: Long, compressinformationsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_ResetCompressor(compressorhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_ResetDecompressor(decompressorhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_SetCompressorInformation(compressorhandle: Long, compressinformationclass: Int, compressinformation: Long, compressinformationsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_compression_SetDecompressorInformation(decompressorhandle: Long, compressinformationclass: Int, compressinformation: Long, compressinformationsize: Long): Int
}

public actual fun CloseCompressor(compressorhandle: COMPRESSOR_HANDLE): BOOL =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_CloseCompressor(compressorhandle)

public actual fun CloseDecompressor(decompressorhandle: DECOMPRESSOR_HANDLE): BOOL =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_CloseDecompressor(decompressorhandle)

public actual fun Compress(compressorhandle: COMPRESSOR_HANDLE, uncompresseddata: Long, uncompresseddatasize: ULong, compressedbuffer: Long, compressedbuffersize: ULong, compresseddatasize: Long): BOOL =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_Compress(compressorhandle, uncompresseddata, uncompresseddatasize.toLong(), compressedbuffer, compressedbuffersize.toLong(), compresseddatasize)

public actual fun CreateCompressor(algorithm: COMPRESS_ALGORITHM, allocationroutines: Long, compressorhandle: Long): BOOL =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_CreateCompressor(algorithm.toInt(), allocationroutines, compressorhandle)

public actual fun CreateDecompressor(algorithm: COMPRESS_ALGORITHM, allocationroutines: Long, decompressorhandle: Long): BOOL =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_CreateDecompressor(algorithm.toInt(), allocationroutines, decompressorhandle)

public actual fun Decompress(decompressorhandle: DECOMPRESSOR_HANDLE, compresseddata: Long, compresseddatasize: ULong, uncompressedbuffer: Long, uncompressedbuffersize: ULong, uncompresseddatasize: Long): BOOL =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_Decompress(decompressorhandle, compresseddata, compresseddatasize.toLong(), uncompressedbuffer, uncompressedbuffersize.toLong(), uncompresseddatasize)

public actual fun QueryCompressorInformation(compressorhandle: COMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_QueryCompressorInformation(compressorhandle, compressinformationclass, compressinformation, compressinformationsize.toLong())

public actual fun QueryDecompressorInformation(decompressorhandle: DECOMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_QueryDecompressorInformation(decompressorhandle, compressinformationclass, compressinformation, compressinformationsize.toLong())

public actual fun ResetCompressor(compressorhandle: COMPRESSOR_HANDLE): BOOL =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_ResetCompressor(compressorhandle)

public actual fun ResetDecompressor(decompressorhandle: DECOMPRESSOR_HANDLE): BOOL =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_ResetDecompressor(decompressorhandle)

public actual fun SetCompressorInformation(compressorhandle: COMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_SetCompressorInformation(compressorhandle, compressinformationclass, compressinformation, compressinformationsize.toLong())

public actual fun SetDecompressorInformation(decompressorhandle: DECOMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL =
    WindowsWin32StorageCompressionJniBridge.windowssys_windows_win32_storage_compression_SetDecompressorInformation(decompressorhandle, compressinformationclass, compressinformation, compressinformationsize.toLong())
