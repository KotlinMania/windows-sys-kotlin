@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.compression

import io.github.kotlinmania.windowssys.core.BOOL

public actual fun CloseCompressor(compressorhandle: COMPRESSOR_HANDLE): BOOL =
    0

public actual fun CloseDecompressor(decompressorhandle: DECOMPRESSOR_HANDLE): BOOL =
    0

public actual fun Compress(compressorhandle: COMPRESSOR_HANDLE, uncompresseddata: Long, uncompresseddatasize: ULong, compressedbuffer: Long, compressedbuffersize: ULong, compresseddatasize: Long): BOOL =
    0

public actual fun CreateCompressor(algorithm: COMPRESS_ALGORITHM, allocationroutines: Long, compressorhandle: Long): BOOL =
    0

public actual fun CreateDecompressor(algorithm: COMPRESS_ALGORITHM, allocationroutines: Long, decompressorhandle: Long): BOOL =
    0

public actual fun Decompress(decompressorhandle: DECOMPRESSOR_HANDLE, compresseddata: Long, compresseddatasize: ULong, uncompressedbuffer: Long, uncompressedbuffersize: ULong, uncompresseddatasize: Long): BOOL =
    0

public actual fun QueryCompressorInformation(compressorhandle: COMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL =
    0

public actual fun QueryDecompressorInformation(decompressorhandle: DECOMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL =
    0

public actual fun ResetCompressor(compressorhandle: COMPRESSOR_HANDLE): BOOL =
    0

public actual fun ResetDecompressor(decompressorhandle: DECOMPRESSOR_HANDLE): BOOL =
    0

public actual fun SetCompressorInformation(compressorhandle: COMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL =
    0

public actual fun SetDecompressorInformation(decompressorhandle: DECOMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL =
    0
