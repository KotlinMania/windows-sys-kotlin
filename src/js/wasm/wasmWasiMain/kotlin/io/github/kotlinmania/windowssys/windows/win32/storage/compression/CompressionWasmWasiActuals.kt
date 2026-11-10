@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.compression

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

public actual fun closeCompressor(compressorhandle: CompressorHandle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun closeDecompressor(decompressorhandle: DecompressorHandle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun compress(compressorhandle: CompressorHandle, uncompresseddata: COpaquePointer?, uncompresseddatasize: ULong, compressedbuffer: COpaquePointer?, compressedbuffersize: ULong, compresseddatasize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createCompressor(algorithm: CompressAlgorithm, allocationroutines: COpaquePointer?, compressorhandle: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createDecompressor(algorithm: CompressAlgorithm, allocationroutines: COpaquePointer?, decompressorhandle: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun decompress(decompressorhandle: DecompressorHandle, compresseddata: COpaquePointer?, compresseddatasize: ULong, uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: ULong, uncompresseddatasize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: COpaquePointer?, compressinformationsize: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: COpaquePointer?, compressinformationsize: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun resetCompressor(compressorhandle: CompressorHandle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun resetDecompressor(decompressorhandle: DecompressorHandle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: COpaquePointer?, compressinformationsize: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: COpaquePointer?, compressinformationsize: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
