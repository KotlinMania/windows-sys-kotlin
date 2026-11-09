package io.github.kotlinmania.windowssys.windows.win32.storage.compression

import io.github.kotlinmania.windowssys.core.BOOL

public expect fun CloseCompressor(compressorhandle: COMPRESSOR_HANDLE): BOOL

public expect fun CloseDecompressor(decompressorhandle: DECOMPRESSOR_HANDLE): BOOL

public expect fun Compress(compressorhandle: COMPRESSOR_HANDLE, uncompresseddata: Long, uncompresseddatasize: ULong, compressedbuffer: Long, compressedbuffersize: ULong, compresseddatasize: Long): BOOL

public expect fun CreateCompressor(algorithm: COMPRESS_ALGORITHM, allocationroutines: Long, compressorhandle: Long): BOOL

public expect fun CreateDecompressor(algorithm: COMPRESS_ALGORITHM, allocationroutines: Long, decompressorhandle: Long): BOOL

public expect fun Decompress(decompressorhandle: DECOMPRESSOR_HANDLE, compresseddata: Long, compresseddatasize: ULong, uncompressedbuffer: Long, uncompressedbuffersize: ULong, uncompresseddatasize: Long): BOOL

public expect fun QueryCompressorInformation(compressorhandle: COMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL

public expect fun QueryDecompressorInformation(decompressorhandle: DECOMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL

public expect fun ResetCompressor(compressorhandle: COMPRESSOR_HANDLE): BOOL

public expect fun ResetDecompressor(decompressorhandle: DECOMPRESSOR_HANDLE): BOOL

public expect fun SetCompressorInformation(compressorhandle: COMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL

public expect fun SetDecompressorInformation(decompressorhandle: DECOMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL
