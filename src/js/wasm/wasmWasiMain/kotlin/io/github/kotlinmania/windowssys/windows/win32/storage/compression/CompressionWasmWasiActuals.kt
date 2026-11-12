@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.compression

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun closeCompressor(compressorhandle: CompressorHandle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCompressionCloseCompressor")

public actual fun closeDecompressor(decompressorhandle: DecompressorHandle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCompressionCloseDecompressor")

public actual fun compress(compressorhandle: CompressorHandle, uncompresseddata: ConstPtr, uncompresseddatasize: ULong, compressedbuffer: MutPtr, compressedbuffersize: ULong, compresseddatasize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCompressionCompress")

public actual fun createCompressor(algorithm: CompressAlgorithm, allocationroutines: ConstPtr, compressorhandle: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCompressionCreateCompressor")

public actual fun createDecompressor(algorithm: CompressAlgorithm, allocationroutines: ConstPtr, decompressorhandle: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCompressionCreateDecompressor")

public actual fun decompress(decompressorhandle: DecompressorHandle, compresseddata: ConstPtr, compresseddatasize: ULong, uncompressedbuffer: MutPtr, uncompressedbuffersize: ULong, uncompresseddatasize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCompressionDecompress")

public actual fun queryCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: MutPtr, compressinformationsize: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCompressionQueryCompressorInformation")

public actual fun queryDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: MutPtr, compressinformationsize: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCompressionQueryDecompressorInformation")

public actual fun resetCompressor(compressorhandle: CompressorHandle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCompressionResetCompressor")

public actual fun resetDecompressor(decompressorhandle: DecompressorHandle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCompressionResetDecompressor")

public actual fun setCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: ConstPtr, compressinformationsize: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCompressionSetCompressorInformation")

public actual fun setDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: ConstPtr, compressinformationsize: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageCompressionSetDecompressorInformation")
