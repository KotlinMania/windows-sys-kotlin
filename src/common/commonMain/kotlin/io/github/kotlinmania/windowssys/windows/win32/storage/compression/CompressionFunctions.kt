package io.github.kotlinmania.windowssys.windows.win32.storage.compression

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL

public fun CloseCompressor(compressorhandle: COMPRESSOR_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("cabinet.dll", "CloseCompressor", longArrayOf(compressorhandle)).toInt()
}

public fun CloseDecompressor(decompressorhandle: DECOMPRESSOR_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("cabinet.dll", "CloseDecompressor", longArrayOf(decompressorhandle)).toInt()
}

public fun Compress(compressorhandle: COMPRESSOR_HANDLE, uncompresseddata: Long, uncompresseddatasize: ULong, compressedbuffer: Long, compressedbuffersize: ULong, compresseddatasize: Long): BOOL {
    return Win32DynamicFfi.invoke("cabinet.dll", "Compress", longArrayOf(compressorhandle, uncompresseddata, uncompresseddatasize.toLong(), compressedbuffer, compressedbuffersize.toLong(), compresseddatasize)).toInt()
}

public fun CreateCompressor(algorithm: COMPRESS_ALGORITHM, allocationroutines: Long, compressorhandle: Long): BOOL {
    return Win32DynamicFfi.invoke("cabinet.dll", "CreateCompressor", longArrayOf(algorithm.toLong(), allocationroutines, compressorhandle)).toInt()
}

public fun CreateDecompressor(algorithm: COMPRESS_ALGORITHM, allocationroutines: Long, decompressorhandle: Long): BOOL {
    return Win32DynamicFfi.invoke("cabinet.dll", "CreateDecompressor", longArrayOf(algorithm.toLong(), allocationroutines, decompressorhandle)).toInt()
}

public fun Decompress(decompressorhandle: DECOMPRESSOR_HANDLE, compresseddata: Long, compresseddatasize: ULong, uncompressedbuffer: Long, uncompressedbuffersize: ULong, uncompresseddatasize: Long): BOOL {
    return Win32DynamicFfi.invoke("cabinet.dll", "Decompress", longArrayOf(decompressorhandle, compresseddata, compresseddatasize.toLong(), uncompressedbuffer, uncompressedbuffersize.toLong(), uncompresseddatasize)).toInt()
}

public fun QueryCompressorInformation(compressorhandle: COMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL {
    return Win32DynamicFfi.invoke("cabinet.dll", "QueryCompressorInformation", longArrayOf(compressorhandle, compressinformationclass.toLong(), compressinformation, compressinformationsize.toLong())).toInt()
}

public fun QueryDecompressorInformation(decompressorhandle: DECOMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL {
    return Win32DynamicFfi.invoke("cabinet.dll", "QueryDecompressorInformation", longArrayOf(decompressorhandle, compressinformationclass.toLong(), compressinformation, compressinformationsize.toLong())).toInt()
}

public fun ResetCompressor(compressorhandle: COMPRESSOR_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("cabinet.dll", "ResetCompressor", longArrayOf(compressorhandle)).toInt()
}

public fun ResetDecompressor(decompressorhandle: DECOMPRESSOR_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("cabinet.dll", "ResetDecompressor", longArrayOf(decompressorhandle)).toInt()
}

public fun SetCompressorInformation(compressorhandle: COMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL {
    return Win32DynamicFfi.invoke("cabinet.dll", "SetCompressorInformation", longArrayOf(compressorhandle, compressinformationclass.toLong(), compressinformation, compressinformationsize.toLong())).toInt()
}

public fun SetDecompressorInformation(decompressorhandle: DECOMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL {
    return Win32DynamicFfi.invoke("cabinet.dll", "SetDecompressorInformation", longArrayOf(decompressorhandle, compressinformationclass.toLong(), compressinformation, compressinformationsize.toLong())).toInt()
}
