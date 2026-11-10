@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.compression

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun closeCompressor(compressorhandle: CompressorHandle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_closeCompressor(compressorhandle?.value?.toCPointer<ByteVar>())

public actual fun closeDecompressor(decompressorhandle: DecompressorHandle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_closeDecompressor(decompressorhandle?.value?.toCPointer<ByteVar>())

public actual fun compress(compressorhandle: CompressorHandle, uncompresseddata: COpaquePointer?, uncompresseddatasize: ULong, compressedbuffer: COpaquePointer?, compressedbuffersize: ULong, compresseddatasize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_compress(compressorhandle?.value?.toCPointer<ByteVar>(), uncompresseddata?.value?.toCPointer<ByteVar>(), uncompresseddatasize, compressedbuffer?.value?.toCPointer<ByteVar>(), compressedbuffersize, compresseddatasize?.value?.toCPointer<ByteVar>())

public actual fun createCompressor(algorithm: CompressAlgorithm, allocationroutines: COpaquePointer?, compressorhandle: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_createCompressor(algorithm, allocationroutines?.value?.toCPointer<ByteVar>(), compressorhandle?.value?.toCPointer<ByteVar>())

public actual fun createDecompressor(algorithm: CompressAlgorithm, allocationroutines: COpaquePointer?, decompressorhandle: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_createDecompressor(algorithm, allocationroutines?.value?.toCPointer<ByteVar>(), decompressorhandle?.value?.toCPointer<ByteVar>())

public actual fun decompress(decompressorhandle: DecompressorHandle, compresseddata: COpaquePointer?, compresseddatasize: ULong, uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: ULong, uncompresseddatasize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_decompress(decompressorhandle?.value?.toCPointer<ByteVar>(), compresseddata?.value?.toCPointer<ByteVar>(), compresseddatasize, uncompressedbuffer?.value?.toCPointer<ByteVar>(), uncompressedbuffersize, uncompresseddatasize?.value?.toCPointer<ByteVar>())

public actual fun queryCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: COpaquePointer?, compressinformationsize: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_queryCompressorInformation(compressorhandle?.value?.toCPointer<ByteVar>(), compressinformationclass, compressinformation?.value?.toCPointer<ByteVar>(), compressinformationsize)

public actual fun queryDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: COpaquePointer?, compressinformationsize: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_queryDecompressorInformation(decompressorhandle?.value?.toCPointer<ByteVar>(), compressinformationclass, compressinformation?.value?.toCPointer<ByteVar>(), compressinformationsize)

public actual fun resetCompressor(compressorhandle: CompressorHandle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_resetCompressor(compressorhandle?.value?.toCPointer<ByteVar>())

public actual fun resetDecompressor(decompressorhandle: DecompressorHandle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_resetDecompressor(decompressorhandle?.value?.toCPointer<ByteVar>())

public actual fun setCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: COpaquePointer?, compressinformationsize: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_setCompressorInformation(compressorhandle?.value?.toCPointer<ByteVar>(), compressinformationclass, compressinformation?.value?.toCPointer<ByteVar>(), compressinformationsize)

public actual fun setDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: COpaquePointer?, compressinformationsize: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_setDecompressorInformation(decompressorhandle?.value?.toCPointer<ByteVar>(), compressinformationclass, compressinformation?.value?.toCPointer<ByteVar>(), compressinformationsize)
