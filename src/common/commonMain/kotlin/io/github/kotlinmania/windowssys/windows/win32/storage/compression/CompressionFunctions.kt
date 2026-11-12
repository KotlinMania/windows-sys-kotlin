package io.github.kotlinmania.windowssys.windows.win32.storage.compression

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

public expect fun closeCompressor(compressorhandle: CompressorHandle): Bool

public expect fun closeDecompressor(decompressorhandle: DecompressorHandle): Bool

public expect fun compress(compressorhandle: CompressorHandle, uncompresseddata: ConstPtr<CVoid>, uncompresseddatasize: ULong, compressedbuffer: MutPtr<CVoid>, compressedbuffersize: ULong, compresseddatasize: MutPtr<ULong>): Bool

public expect fun createCompressor(algorithm: CompressAlgorithm, allocationroutines: ConstPtr<CompressAllocationRoutines>, compressorhandle: MutPtr<CompressorHandle>): Bool

public expect fun createDecompressor(algorithm: CompressAlgorithm, allocationroutines: ConstPtr<CompressAllocationRoutines>, decompressorhandle: MutPtr<DecompressorHandle>): Bool

public expect fun decompress(decompressorhandle: DecompressorHandle, compresseddata: ConstPtr<CVoid>, compresseddatasize: ULong, uncompressedbuffer: MutPtr<CVoid>, uncompressedbuffersize: ULong, uncompresseddatasize: MutPtr<ULong>): Bool

public expect fun queryCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: MutPtr<CVoid>, compressinformationsize: ULong): Bool

public expect fun queryDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: MutPtr<CVoid>, compressinformationsize: ULong): Bool

public expect fun resetCompressor(compressorhandle: CompressorHandle): Bool

public expect fun resetDecompressor(decompressorhandle: DecompressorHandle): Bool

public expect fun setCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: ConstPtr<CVoid>, compressinformationsize: ULong): Bool

public expect fun setDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: ConstPtr<CVoid>, compressinformationsize: ULong): Bool
