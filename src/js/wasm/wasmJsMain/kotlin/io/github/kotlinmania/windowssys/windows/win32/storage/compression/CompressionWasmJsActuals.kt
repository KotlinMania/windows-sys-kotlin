@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.compression

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32StorageCompressionNapiAddon(): Boolean

private val windowsWin32StorageCompressionNapiAvailable: Boolean = initWindowsWin32StorageCompressionNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCompressionCloseCompressor(p0)")
private external fun wasmWindowssysWindowsWin32StorageCompressionCloseCompressor(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCompressionCloseDecompressor(p0)")
private external fun wasmWindowssysWindowsWin32StorageCompressionCloseDecompressor(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCompressionCompress(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageCompressionCompress(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCompressionCreateCompressor(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageCompressionCreateCompressor(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCompressionCreateDecompressor(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageCompressionCreateDecompressor(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCompressionDecompress(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageCompressionDecompress(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCompressionQueryCompressorInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageCompressionQueryCompressorInformation(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCompressionQueryDecompressorInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageCompressionQueryDecompressorInformation(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCompressionResetCompressor(p0)")
private external fun wasmWindowssysWindowsWin32StorageCompressionResetCompressor(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCompressionResetDecompressor(p0)")
private external fun wasmWindowssysWindowsWin32StorageCompressionResetDecompressor(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCompressionSetCompressorInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageCompressionSetCompressorInformation(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCompressionSetDecompressorInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageCompressionSetDecompressorInformation(p0: String, p1: Int, p2: String, p3: String): Int

public actual fun closeCompressor(compressorhandle: CompressorHandle): Bool =
    if (windowsWin32StorageCompressionNapiAvailable) wasmWindowssysWindowsWin32StorageCompressionCloseCompressor(compressorhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeDecompressor(decompressorhandle: DecompressorHandle): Bool =
    if (windowsWin32StorageCompressionNapiAvailable) wasmWindowssysWindowsWin32StorageCompressionCloseDecompressor(decompressorhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compress(compressorhandle: CompressorHandle, uncompresseddata: ConstPtr<CVoid>, uncompresseddatasize: ULong, compressedbuffer: MutPtr<CVoid>, compressedbuffersize: ULong, compresseddatasize: MutPtr<ULong>): Bool =
    if (windowsWin32StorageCompressionNapiAvailable) wasmWindowssysWindowsWin32StorageCompressionCompress(compressorhandle.rawAddress.toString(), uncompresseddata.rawAddress.toString(), uncompresseddatasize.toString(), compressedbuffer.rawAddress.toString(), compressedbuffersize.toString(), compresseddatasize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCompressor(algorithm: CompressAlgorithm, allocationroutines: ConstPtr<CompressAllocationRoutines>, compressorhandle: MutPtr<CompressorHandle>): Bool =
    if (windowsWin32StorageCompressionNapiAvailable) wasmWindowssysWindowsWin32StorageCompressionCreateCompressor(algorithm.toInt(), allocationroutines.rawAddress.toString(), compressorhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDecompressor(algorithm: CompressAlgorithm, allocationroutines: ConstPtr<CompressAllocationRoutines>, decompressorhandle: MutPtr<DecompressorHandle>): Bool =
    if (windowsWin32StorageCompressionNapiAvailable) wasmWindowssysWindowsWin32StorageCompressionCreateDecompressor(algorithm.toInt(), allocationroutines.rawAddress.toString(), decompressorhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decompress(decompressorhandle: DecompressorHandle, compresseddata: ConstPtr<CVoid>, compresseddatasize: ULong, uncompressedbuffer: MutPtr<CVoid>, uncompressedbuffersize: ULong, uncompresseddatasize: MutPtr<ULong>): Bool =
    if (windowsWin32StorageCompressionNapiAvailable) wasmWindowssysWindowsWin32StorageCompressionDecompress(decompressorhandle.rawAddress.toString(), compresseddata.rawAddress.toString(), compresseddatasize.toString(), uncompressedbuffer.rawAddress.toString(), uncompressedbuffersize.toString(), uncompresseddatasize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: MutPtr<CVoid>, compressinformationsize: ULong): Bool =
    if (windowsWin32StorageCompressionNapiAvailable) wasmWindowssysWindowsWin32StorageCompressionQueryCompressorInformation(compressorhandle.rawAddress.toString(), compressinformationclass, compressinformation.rawAddress.toString(), compressinformationsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: MutPtr<CVoid>, compressinformationsize: ULong): Bool =
    if (windowsWin32StorageCompressionNapiAvailable) wasmWindowssysWindowsWin32StorageCompressionQueryDecompressorInformation(decompressorhandle.rawAddress.toString(), compressinformationclass, compressinformation.rawAddress.toString(), compressinformationsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetCompressor(compressorhandle: CompressorHandle): Bool =
    if (windowsWin32StorageCompressionNapiAvailable) wasmWindowssysWindowsWin32StorageCompressionResetCompressor(compressorhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetDecompressor(decompressorhandle: DecompressorHandle): Bool =
    if (windowsWin32StorageCompressionNapiAvailable) wasmWindowssysWindowsWin32StorageCompressionResetDecompressor(decompressorhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: ConstPtr<CVoid>, compressinformationsize: ULong): Bool =
    if (windowsWin32StorageCompressionNapiAvailable) wasmWindowssysWindowsWin32StorageCompressionSetCompressorInformation(compressorhandle.rawAddress.toString(), compressinformationclass, compressinformation.rawAddress.toString(), compressinformationsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: ConstPtr<CVoid>, compressinformationsize: ULong): Bool =
    if (windowsWin32StorageCompressionNapiAvailable) wasmWindowssysWindowsWin32StorageCompressionSetDecompressorInformation(decompressorhandle.rawAddress.toString(), compressinformationclass, compressinformation.rawAddress.toString(), compressinformationsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
