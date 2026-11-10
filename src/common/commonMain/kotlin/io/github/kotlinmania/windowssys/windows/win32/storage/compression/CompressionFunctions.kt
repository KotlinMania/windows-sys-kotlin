package io.github.kotlinmania.windowssys.windows.win32.storage.compression

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

public expect fun closeCompressor(compressorhandle: CompressorHandle): Bool

public expect fun closeDecompressor(decompressorhandle: DecompressorHandle): Bool

public expect fun compress(compressorhandle: CompressorHandle, uncompresseddata: COpaquePointer?, uncompresseddatasize: ULong, compressedbuffer: COpaquePointer?, compressedbuffersize: ULong, compresseddatasize: COpaquePointer?): Bool

public expect fun createCompressor(algorithm: CompressAlgorithm, allocationroutines: COpaquePointer?, compressorhandle: COpaquePointer?): Bool

public expect fun createDecompressor(algorithm: CompressAlgorithm, allocationroutines: COpaquePointer?, decompressorhandle: COpaquePointer?): Bool

public expect fun decompress(decompressorhandle: DecompressorHandle, compresseddata: COpaquePointer?, compresseddatasize: ULong, uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: ULong, uncompresseddatasize: COpaquePointer?): Bool

public expect fun queryCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: COpaquePointer?, compressinformationsize: ULong): Bool

public expect fun queryDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: COpaquePointer?, compressinformationsize: ULong): Bool

public expect fun resetCompressor(compressorhandle: CompressorHandle): Bool

public expect fun resetDecompressor(decompressorhandle: DecompressorHandle): Bool

public expect fun setCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: COpaquePointer?, compressinformationsize: ULong): Bool

public expect fun setDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: COpaquePointer?, compressinformationsize: ULong): Bool
