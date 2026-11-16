package io.github.kotlinmania.windowssys.windows.win32.storage.compression

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

public expect fun closeCompressor(compressorhandle: CompressorHandle): Bool

public expect fun closeDecompressor(decompressorhandle: DecompressorHandle): Bool

public expect fun compress(compressorhandle: CompressorHandle, uncompresseddata: ConstPtr, uncompresseddatasize: ULong, compressedbuffer: MutPtr, compressedbuffersize: ULong, compresseddatasize: MutPtr): Bool

public expect fun createCompressor(algorithm: CompressAlgorithm, allocationroutines: ConstPtr, compressorhandle: MutPtr): Bool

public expect fun createDecompressor(algorithm: CompressAlgorithm, allocationroutines: ConstPtr, decompressorhandle: MutPtr): Bool

public expect fun decompress(decompressorhandle: DecompressorHandle, compresseddata: ConstPtr, compresseddatasize: ULong, uncompressedbuffer: MutPtr, uncompressedbuffersize: ULong, uncompresseddatasize: MutPtr): Bool

public expect fun queryCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: MutPtr, compressinformationsize: ULong): Bool

public expect fun queryDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: MutPtr, compressinformationsize: ULong): Bool

public expect fun resetCompressor(compressorhandle: CompressorHandle): Bool

public expect fun resetDecompressor(decompressorhandle: DecompressorHandle): Bool

public expect fun setCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: ConstPtr, compressinformationsize: ULong): Bool

public expect fun setDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: ConstPtr, compressinformationsize: ULong): Bool
