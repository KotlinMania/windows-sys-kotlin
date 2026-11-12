@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.compression

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssysWindowsWin32StorageCompressionCloseCompressor
import io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssysWindowsWin32StorageCompressionCloseDecompressor
import io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssysWindowsWin32StorageCompressionCompress
import io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssysWindowsWin32StorageCompressionCreateCompressor
import io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssysWindowsWin32StorageCompressionCreateDecompressor
import io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssysWindowsWin32StorageCompressionDecompress
import io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssysWindowsWin32StorageCompressionQueryCompressorInformation
import io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssysWindowsWin32StorageCompressionQueryDecompressorInformation
import io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssysWindowsWin32StorageCompressionResetCompressor
import io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssysWindowsWin32StorageCompressionResetDecompressor
import io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssysWindowsWin32StorageCompressionSetCompressorInformation
import io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssysWindowsWin32StorageCompressionSetDecompressorInformation
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun closeCompressor(compressorhandle: CompressorHandle): Bool =
    windowssysWindowsWin32StorageCompressionCloseCompressor(compressorhandle.rawAddress.toCPointer<ByteVar>())

public actual fun closeDecompressor(decompressorhandle: DecompressorHandle): Bool =
    windowssysWindowsWin32StorageCompressionCloseDecompressor(decompressorhandle.rawAddress.toCPointer<ByteVar>())

public actual fun compress(compressorhandle: CompressorHandle, uncompresseddata: ConstPtr<CVoid>, uncompresseddatasize: ULong, compressedbuffer: MutPtr<CVoid>, compressedbuffersize: ULong, compresseddatasize: MutPtr<ULong>): Bool =
    windowssysWindowsWin32StorageCompressionCompress(compressorhandle.rawAddress.toCPointer<ByteVar>(), uncompresseddata.rawAddress.toCPointer<ByteVar>(), uncompresseddatasize, compressedbuffer.rawAddress.toCPointer<ByteVar>(), compressedbuffersize, compresseddatasize.rawAddress.toCPointer<ByteVar>())

public actual fun createCompressor(algorithm: CompressAlgorithm, allocationroutines: ConstPtr<CompressAllocationRoutines>, compressorhandle: MutPtr<CompressorHandle>): Bool =
    windowssysWindowsWin32StorageCompressionCreateCompressor(algorithm, allocationroutines.rawAddress.toCPointer<ByteVar>(), compressorhandle.rawAddress.toCPointer<ByteVar>())

public actual fun createDecompressor(algorithm: CompressAlgorithm, allocationroutines: ConstPtr<CompressAllocationRoutines>, decompressorhandle: MutPtr<DecompressorHandle>): Bool =
    windowssysWindowsWin32StorageCompressionCreateDecompressor(algorithm, allocationroutines.rawAddress.toCPointer<ByteVar>(), decompressorhandle.rawAddress.toCPointer<ByteVar>())

public actual fun decompress(decompressorhandle: DecompressorHandle, compresseddata: ConstPtr<CVoid>, compresseddatasize: ULong, uncompressedbuffer: MutPtr<CVoid>, uncompressedbuffersize: ULong, uncompresseddatasize: MutPtr<ULong>): Bool =
    windowssysWindowsWin32StorageCompressionDecompress(decompressorhandle.rawAddress.toCPointer<ByteVar>(), compresseddata.rawAddress.toCPointer<ByteVar>(), compresseddatasize, uncompressedbuffer.rawAddress.toCPointer<ByteVar>(), uncompressedbuffersize, uncompresseddatasize.rawAddress.toCPointer<ByteVar>())

public actual fun queryCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: MutPtr<CVoid>, compressinformationsize: ULong): Bool =
    windowssysWindowsWin32StorageCompressionQueryCompressorInformation(compressorhandle.rawAddress.toCPointer<ByteVar>(), compressinformationclass, compressinformation.rawAddress.toCPointer<ByteVar>(), compressinformationsize)

public actual fun queryDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: MutPtr<CVoid>, compressinformationsize: ULong): Bool =
    windowssysWindowsWin32StorageCompressionQueryDecompressorInformation(decompressorhandle.rawAddress.toCPointer<ByteVar>(), compressinformationclass, compressinformation.rawAddress.toCPointer<ByteVar>(), compressinformationsize)

public actual fun resetCompressor(compressorhandle: CompressorHandle): Bool =
    windowssysWindowsWin32StorageCompressionResetCompressor(compressorhandle.rawAddress.toCPointer<ByteVar>())

public actual fun resetDecompressor(decompressorhandle: DecompressorHandle): Bool =
    windowssysWindowsWin32StorageCompressionResetDecompressor(decompressorhandle.rawAddress.toCPointer<ByteVar>())

public actual fun setCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: ConstPtr<CVoid>, compressinformationsize: ULong): Bool =
    windowssysWindowsWin32StorageCompressionSetCompressorInformation(compressorhandle.rawAddress.toCPointer<ByteVar>(), compressinformationclass, compressinformation.rawAddress.toCPointer<ByteVar>(), compressinformationsize)

public actual fun setDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: ConstPtr<CVoid>, compressinformationsize: ULong): Bool =
    windowssysWindowsWin32StorageCompressionSetDecompressorInformation(decompressorhandle.rawAddress.toCPointer<ByteVar>(), compressinformationclass, compressinformation.rawAddress.toCPointer<ByteVar>(), compressinformationsize)
