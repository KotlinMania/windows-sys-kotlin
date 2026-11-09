@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.compression

import io.github.kotlinmania.windowssys.core.BOOL

private val _windowsWin32StorageCompressionNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun CloseCompressor(compressorhandle: COMPRESSOR_HANDLE): BOOL =
    if (_windowsWin32StorageCompressionNapiAddon != null) (_windowsWin32StorageCompressionNapiAddon.windowssys_windows_win32_storage_compression_CloseCompressor(compressorhandle.toString()) as Int) else 0

public actual fun CloseDecompressor(decompressorhandle: DECOMPRESSOR_HANDLE): BOOL =
    if (_windowsWin32StorageCompressionNapiAddon != null) (_windowsWin32StorageCompressionNapiAddon.windowssys_windows_win32_storage_compression_CloseDecompressor(decompressorhandle.toString()) as Int) else 0

public actual fun Compress(compressorhandle: COMPRESSOR_HANDLE, uncompresseddata: Long, uncompresseddatasize: ULong, compressedbuffer: Long, compressedbuffersize: ULong, compresseddatasize: Long): BOOL =
    if (_windowsWin32StorageCompressionNapiAddon != null) (_windowsWin32StorageCompressionNapiAddon.windowssys_windows_win32_storage_compression_Compress(compressorhandle.toString(), uncompresseddata.toString(), uncompresseddatasize.toString(), compressedbuffer.toString(), compressedbuffersize.toString(), compresseddatasize.toString()) as Int) else 0

public actual fun CreateCompressor(algorithm: COMPRESS_ALGORITHM, allocationroutines: Long, compressorhandle: Long): BOOL =
    if (_windowsWin32StorageCompressionNapiAddon != null) (_windowsWin32StorageCompressionNapiAddon.windowssys_windows_win32_storage_compression_CreateCompressor(algorithm.toInt(), allocationroutines.toString(), compressorhandle.toString()) as Int) else 0

public actual fun CreateDecompressor(algorithm: COMPRESS_ALGORITHM, allocationroutines: Long, decompressorhandle: Long): BOOL =
    if (_windowsWin32StorageCompressionNapiAddon != null) (_windowsWin32StorageCompressionNapiAddon.windowssys_windows_win32_storage_compression_CreateDecompressor(algorithm.toInt(), allocationroutines.toString(), decompressorhandle.toString()) as Int) else 0

public actual fun Decompress(decompressorhandle: DECOMPRESSOR_HANDLE, compresseddata: Long, compresseddatasize: ULong, uncompressedbuffer: Long, uncompressedbuffersize: ULong, uncompresseddatasize: Long): BOOL =
    if (_windowsWin32StorageCompressionNapiAddon != null) (_windowsWin32StorageCompressionNapiAddon.windowssys_windows_win32_storage_compression_Decompress(decompressorhandle.toString(), compresseddata.toString(), compresseddatasize.toString(), uncompressedbuffer.toString(), uncompressedbuffersize.toString(), uncompresseddatasize.toString()) as Int) else 0

public actual fun QueryCompressorInformation(compressorhandle: COMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL =
    if (_windowsWin32StorageCompressionNapiAddon != null) (_windowsWin32StorageCompressionNapiAddon.windowssys_windows_win32_storage_compression_QueryCompressorInformation(compressorhandle.toString(), compressinformationclass, compressinformation.toString(), compressinformationsize.toString()) as Int) else 0

public actual fun QueryDecompressorInformation(decompressorhandle: DECOMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL =
    if (_windowsWin32StorageCompressionNapiAddon != null) (_windowsWin32StorageCompressionNapiAddon.windowssys_windows_win32_storage_compression_QueryDecompressorInformation(decompressorhandle.toString(), compressinformationclass, compressinformation.toString(), compressinformationsize.toString()) as Int) else 0

public actual fun ResetCompressor(compressorhandle: COMPRESSOR_HANDLE): BOOL =
    if (_windowsWin32StorageCompressionNapiAddon != null) (_windowsWin32StorageCompressionNapiAddon.windowssys_windows_win32_storage_compression_ResetCompressor(compressorhandle.toString()) as Int) else 0

public actual fun ResetDecompressor(decompressorhandle: DECOMPRESSOR_HANDLE): BOOL =
    if (_windowsWin32StorageCompressionNapiAddon != null) (_windowsWin32StorageCompressionNapiAddon.windowssys_windows_win32_storage_compression_ResetDecompressor(decompressorhandle.toString()) as Int) else 0

public actual fun SetCompressorInformation(compressorhandle: COMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL =
    if (_windowsWin32StorageCompressionNapiAddon != null) (_windowsWin32StorageCompressionNapiAddon.windowssys_windows_win32_storage_compression_SetCompressorInformation(compressorhandle.toString(), compressinformationclass, compressinformation.toString(), compressinformationsize.toString()) as Int) else 0

public actual fun SetDecompressorInformation(decompressorhandle: DECOMPRESSOR_HANDLE, compressinformationclass: COMPRESS_INFORMATION_CLASS, compressinformation: Long, compressinformationsize: ULong): BOOL =
    if (_windowsWin32StorageCompressionNapiAddon != null) (_windowsWin32StorageCompressionNapiAddon.windowssys_windows_win32_storage_compression_SetDecompressorInformation(decompressorhandle.toString(), compressinformationclass, compressinformation.toString(), compressinformationsize.toString()) as Int) else 0
