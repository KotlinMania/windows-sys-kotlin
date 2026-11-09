@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.compression

import io.github.kotlinmania.windowssys.core.BOOL
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun CloseCompressor(compressorhandle: COMPRESSOR_HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_CloseCompressor(compressorhandle.toCPointer<ByteVar>())

public actual fun CloseDecompressor(decompressorhandle: DECOMPRESSOR_HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_CloseDecompressor(decompressorhandle.toCPointer<ByteVar>())

public actual fun Compress(compressorhandle: COMPRESSOR_HANDLE, uncompresseddata: Long, uncompresseddatasize: ULong, compressedbuffer: Long, compressedbuffersize: ULong, compresseddatasize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_Compress(compressorhandle.toCPointer<ByteVar>(), uncompresseddata.toCPointer<ByteVar>(), uncompresseddatasize, compressedbuffer.toCPointer<ByteVar>(), compressedbuffersize, compresseddatasize.toCPointer<ByteVar>())

public actual fun CreateCompressor(algorithm: COMPRESS_ALGORITHM, allocationroutines: Long, compressorhandle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_CreateCompressor(algorithm, allocationroutines.toCPointer<ByteVar>(), compressorhandle.toCPointer<ByteVar>())

public actual fun CreateDecompressor(algorithm: COMPRESS_ALGORITHM, allocationroutines: Long, decompressorhandle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_CreateDecompressor(algorithm, allocationroutines.toCPointer<ByteVar>(), decompressorhandle.toCPointer<ByteVar>())

public actual fun Decompress(decompressorhandle: DECOMPRESSOR_HANDLE, compresseddata: Long, compresseddatasize: ULong, uncompressedbuffer: Long, uncompressedbuffersize: ULong, uncompresseddatasize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_Decompress(decompressorhandle.toCPointer<ByteVar>(), compresseddata.toCPointer<ByteVar>(), compresseddatasize, uncompressedbuffer.toCPointer<ByteVar>(), uncompressedbuffersize, uncompresseddatasize.toCPointer<ByteVar>())

public actual fun QueryCompressorInformation(compressorhandle: COMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_QueryCompressorInformation(compressorhandle.toCPointer<ByteVar>(), compressinformationclass, compressinformation.toCPointer<ByteVar>(), compressinformationsize)

public actual fun QueryDecompressorInformation(decompressorhandle: DECOMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_QueryDecompressorInformation(decompressorhandle.toCPointer<ByteVar>(), compressinformationclass, compressinformation.toCPointer<ByteVar>(), compressinformationsize)

public actual fun ResetCompressor(compressorhandle: COMPRESSOR_HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_ResetCompressor(compressorhandle.toCPointer<ByteVar>())

public actual fun ResetDecompressor(decompressorhandle: DECOMPRESSOR_HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_ResetDecompressor(decompressorhandle.toCPointer<ByteVar>())

public actual fun SetCompressorInformation(compressorhandle: COMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_SetCompressorInformation(compressorhandle.toCPointer<ByteVar>(), compressinformationclass, compressinformation.toCPointer<ByteVar>(), compressinformationsize)

public actual fun SetDecompressorInformation(decompressorhandle: DECOMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.compression.cinterop.windowssys_windows_win32_storage_compression_SetDecompressorInformation(decompressorhandle.toCPointer<ByteVar>(), compressinformationclass, compressinformation.toCPointer<ByteVar>(), compressinformationsize)
