@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.compression

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32StorageCompressionNapiAddon(): Boolean

private val _windowsWin32StorageCompressionNapiAvailable: Boolean = _initWindowsWin32StorageCompressionNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_compression_closeCompressor(p0)")
private external fun _wasm_windowssys_windows_win32_storage_compression_closeCompressor(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_compression_closeDecompressor(p0)")
private external fun _wasm_windowssys_windows_win32_storage_compression_closeDecompressor(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_compression_compress(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_compression_compress(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_compression_createCompressor(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_compression_createCompressor(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_compression_createDecompressor(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_compression_createDecompressor(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_compression_decompress(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_compression_decompress(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_compression_queryCompressorInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_compression_queryCompressorInformation(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_compression_queryDecompressorInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_compression_queryDecompressorInformation(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_compression_resetCompressor(p0)")
private external fun _wasm_windowssys_windows_win32_storage_compression_resetCompressor(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_compression_resetDecompressor(p0)")
private external fun _wasm_windowssys_windows_win32_storage_compression_resetDecompressor(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_compression_setCompressorInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_compression_setCompressorInformation(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_compression_setDecompressorInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_compression_setDecompressorInformation(p0: String, p1: Int, p2: String, p3: String): Int

public actual fun closeCompressor(compressorhandle: CompressorHandle): Bool =
    if (_windowsWin32StorageCompressionNapiAvailable) _wasm_windowssys_windows_win32_storage_compression_closeCompressor((compressorhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeDecompressor(decompressorhandle: DecompressorHandle): Bool =
    if (_windowsWin32StorageCompressionNapiAvailable) _wasm_windowssys_windows_win32_storage_compression_closeDecompressor((decompressorhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compress(compressorhandle: CompressorHandle, uncompresseddata: COpaquePointer?, uncompresseddatasize: ULong, compressedbuffer: COpaquePointer?, compressedbuffersize: ULong, compresseddatasize: COpaquePointer?): Bool =
    if (_windowsWin32StorageCompressionNapiAvailable) _wasm_windowssys_windows_win32_storage_compression_compress((compressorhandle?.value ?: 0L).toString(), (uncompresseddata?.value ?: 0L).toString(), uncompresseddatasize.toString(), (compressedbuffer?.value ?: 0L).toString(), compressedbuffersize.toString(), (compresseddatasize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCompressor(algorithm: CompressAlgorithm, allocationroutines: COpaquePointer?, compressorhandle: COpaquePointer?): Bool =
    if (_windowsWin32StorageCompressionNapiAvailable) _wasm_windowssys_windows_win32_storage_compression_createCompressor(algorithm.toInt(), (allocationroutines?.value ?: 0L).toString(), (compressorhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDecompressor(algorithm: CompressAlgorithm, allocationroutines: COpaquePointer?, decompressorhandle: COpaquePointer?): Bool =
    if (_windowsWin32StorageCompressionNapiAvailable) _wasm_windowssys_windows_win32_storage_compression_createDecompressor(algorithm.toInt(), (allocationroutines?.value ?: 0L).toString(), (decompressorhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decompress(decompressorhandle: DecompressorHandle, compresseddata: COpaquePointer?, compresseddatasize: ULong, uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: ULong, uncompresseddatasize: COpaquePointer?): Bool =
    if (_windowsWin32StorageCompressionNapiAvailable) _wasm_windowssys_windows_win32_storage_compression_decompress((decompressorhandle?.value ?: 0L).toString(), (compresseddata?.value ?: 0L).toString(), compresseddatasize.toString(), (uncompressedbuffer?.value ?: 0L).toString(), uncompressedbuffersize.toString(), (uncompresseddatasize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: COpaquePointer?, compressinformationsize: ULong): Bool =
    if (_windowsWin32StorageCompressionNapiAvailable) _wasm_windowssys_windows_win32_storage_compression_queryCompressorInformation((compressorhandle?.value ?: 0L).toString(), compressinformationclass, (compressinformation?.value ?: 0L).toString(), compressinformationsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: COpaquePointer?, compressinformationsize: ULong): Bool =
    if (_windowsWin32StorageCompressionNapiAvailable) _wasm_windowssys_windows_win32_storage_compression_queryDecompressorInformation((decompressorhandle?.value ?: 0L).toString(), compressinformationclass, (compressinformation?.value ?: 0L).toString(), compressinformationsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetCompressor(compressorhandle: CompressorHandle): Bool =
    if (_windowsWin32StorageCompressionNapiAvailable) _wasm_windowssys_windows_win32_storage_compression_resetCompressor((compressorhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetDecompressor(decompressorhandle: DecompressorHandle): Bool =
    if (_windowsWin32StorageCompressionNapiAvailable) _wasm_windowssys_windows_win32_storage_compression_resetDecompressor((decompressorhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: COpaquePointer?, compressinformationsize: ULong): Bool =
    if (_windowsWin32StorageCompressionNapiAvailable) _wasm_windowssys_windows_win32_storage_compression_setCompressorInformation((compressorhandle?.value ?: 0L).toString(), compressinformationclass, (compressinformation?.value ?: 0L).toString(), compressinformationsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: COpaquePointer?, compressinformationsize: ULong): Bool =
    if (_windowsWin32StorageCompressionNapiAvailable) _wasm_windowssys_windows_win32_storage_compression_setDecompressorInformation((decompressorhandle?.value ?: 0L).toString(), compressinformationclass, (compressinformation?.value ?: 0L).toString(), compressinformationsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
