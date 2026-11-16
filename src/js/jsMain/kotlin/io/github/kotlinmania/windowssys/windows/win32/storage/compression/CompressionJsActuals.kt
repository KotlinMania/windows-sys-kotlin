@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.compression

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

private val windowsWin32StorageCompressionNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun closeCompressor(compressorhandle: CompressorHandle): Bool =
    if (windowsWin32StorageCompressionNapiAddon != null) (windowsWin32StorageCompressionNapiAddon.windowssysWindowsWin32StorageCompressionCloseCompressor(compressorhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeDecompressor(decompressorhandle: DecompressorHandle): Bool =
    if (windowsWin32StorageCompressionNapiAddon != null) (windowsWin32StorageCompressionNapiAddon.windowssysWindowsWin32StorageCompressionCloseDecompressor(decompressorhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compress(compressorhandle: CompressorHandle, uncompresseddata: ConstPtr, uncompresseddatasize: ULong, compressedbuffer: MutPtr, compressedbuffersize: ULong, compresseddatasize: MutPtr): Bool =
    if (windowsWin32StorageCompressionNapiAddon != null) (windowsWin32StorageCompressionNapiAddon.windowssysWindowsWin32StorageCompressionCompress(compressorhandle.rawAddress.toString(), uncompresseddata.rawAddress.toString(), uncompresseddatasize.toString(), compressedbuffer.rawAddress.toString(), compressedbuffersize.toString(), compresseddatasize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCompressor(algorithm: CompressAlgorithm, allocationroutines: ConstPtr, compressorhandle: MutPtr): Bool =
    if (windowsWin32StorageCompressionNapiAddon != null) (windowsWin32StorageCompressionNapiAddon.windowssysWindowsWin32StorageCompressionCreateCompressor(algorithm.toInt(), allocationroutines.rawAddress.toString(), compressorhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDecompressor(algorithm: CompressAlgorithm, allocationroutines: ConstPtr, decompressorhandle: MutPtr): Bool =
    if (windowsWin32StorageCompressionNapiAddon != null) (windowsWin32StorageCompressionNapiAddon.windowssysWindowsWin32StorageCompressionCreateDecompressor(algorithm.toInt(), allocationroutines.rawAddress.toString(), decompressorhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decompress(decompressorhandle: DecompressorHandle, compresseddata: ConstPtr, compresseddatasize: ULong, uncompressedbuffer: MutPtr, uncompressedbuffersize: ULong, uncompresseddatasize: MutPtr): Bool =
    if (windowsWin32StorageCompressionNapiAddon != null) (windowsWin32StorageCompressionNapiAddon.windowssysWindowsWin32StorageCompressionDecompress(decompressorhandle.rawAddress.toString(), compresseddata.rawAddress.toString(), compresseddatasize.toString(), uncompressedbuffer.rawAddress.toString(), uncompressedbuffersize.toString(), uncompresseddatasize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: MutPtr, compressinformationsize: ULong): Bool =
    if (windowsWin32StorageCompressionNapiAddon != null) (windowsWin32StorageCompressionNapiAddon.windowssysWindowsWin32StorageCompressionQueryCompressorInformation(compressorhandle.rawAddress.toString(), compressinformationclass, compressinformation.rawAddress.toString(), compressinformationsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: MutPtr, compressinformationsize: ULong): Bool =
    if (windowsWin32StorageCompressionNapiAddon != null) (windowsWin32StorageCompressionNapiAddon.windowssysWindowsWin32StorageCompressionQueryDecompressorInformation(decompressorhandle.rawAddress.toString(), compressinformationclass, compressinformation.rawAddress.toString(), compressinformationsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetCompressor(compressorhandle: CompressorHandle): Bool =
    if (windowsWin32StorageCompressionNapiAddon != null) (windowsWin32StorageCompressionNapiAddon.windowssysWindowsWin32StorageCompressionResetCompressor(compressorhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetDecompressor(decompressorhandle: DecompressorHandle): Bool =
    if (windowsWin32StorageCompressionNapiAddon != null) (windowsWin32StorageCompressionNapiAddon.windowssysWindowsWin32StorageCompressionResetDecompressor(decompressorhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCompressorInformation(compressorhandle: CompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: ConstPtr, compressinformationsize: ULong): Bool =
    if (windowsWin32StorageCompressionNapiAddon != null) (windowsWin32StorageCompressionNapiAddon.windowssysWindowsWin32StorageCompressionSetCompressorInformation(compressorhandle.rawAddress.toString(), compressinformationclass, compressinformation.rawAddress.toString(), compressinformationsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDecompressorInformation(decompressorhandle: DecompressorHandle, compressinformationclass: CompressInformationClass, compressinformation: ConstPtr, compressinformationsize: ULong): Bool =
    if (windowsWin32StorageCompressionNapiAddon != null) (windowsWin32StorageCompressionNapiAddon.windowssysWindowsWin32StorageCompressionSetDecompressorInformation(decompressorhandle.rawAddress.toString(), compressinformationclass, compressinformation.rawAddress.toString(), compressinformationsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
