@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32MediaDxmediaobjectsNapiAddon(): Boolean

private val _windowsWin32MediaDxmediaobjectsNapiAvailable: Boolean = _initWindowsWin32MediaDxmediaobjectsNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_dxmediaobjects_dMOEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_media_dxmediaobjects_dMOEnum(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_dxmediaobjects_dMOGetName(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_dxmediaobjects_dMOGetName(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_dxmediaobjects_dMOGetTypes(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_media_dxmediaobjects_dMOGetTypes(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_dxmediaobjects_dMORegister(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_media_dxmediaobjects_dMORegister(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_dxmediaobjects_dMOUnregister(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_dxmediaobjects_dMOUnregister(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_dxmediaobjects_moCopyMediaType(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_dxmediaobjects_moCopyMediaType(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_dxmediaobjects_moCreateMediaType(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_dxmediaobjects_moCreateMediaType(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_dxmediaobjects_moDeleteMediaType(p0)")
private external fun _wasm_windowssys_windows_win32_media_dxmediaobjects_moDeleteMediaType(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_dxmediaobjects_moDuplicateMediaType(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_dxmediaobjects_moDuplicateMediaType(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_dxmediaobjects_moFreeMediaType(p0)")
private external fun _wasm_windowssys_windows_win32_media_dxmediaobjects_moFreeMediaType(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_dxmediaobjects_moInitMediaType(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_dxmediaobjects_moInitMediaType(p0: String, p1: Int): Int

public actual fun dMOEnum(guidcategory: COpaquePointer?, dwflags: UInt, cintypes: UInt, pintypes: COpaquePointer?, couttypes: UInt, pouttypes: COpaquePointer?, ppenum: COpaquePointer?): Hresult =
    if (_windowsWin32MediaDxmediaobjectsNapiAvailable) _wasm_windowssys_windows_win32_media_dxmediaobjects_dMOEnum((guidcategory?.value ?: 0L).toString(), dwflags.toInt(), cintypes.toInt(), (pintypes?.value ?: 0L).toString(), couttypes.toInt(), (pouttypes?.value ?: 0L).toString(), (ppenum?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dMOGetName(clsiddmo: COpaquePointer?, szname: Pwstr): Hresult =
    if (_windowsWin32MediaDxmediaobjectsNapiAvailable) _wasm_windowssys_windows_win32_media_dxmediaobjects_dMOGetName((clsiddmo?.value ?: 0L).toString(), (szname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dMOGetTypes(clsiddmo: COpaquePointer?, ulinputtypesrequested: UInt, pulinputtypessupplied: COpaquePointer?, pinputtypes: COpaquePointer?, uloutputtypesrequested: UInt, puloutputtypessupplied: COpaquePointer?, poutputtypes: COpaquePointer?): Hresult =
    if (_windowsWin32MediaDxmediaobjectsNapiAvailable) _wasm_windowssys_windows_win32_media_dxmediaobjects_dMOGetTypes((clsiddmo?.value ?: 0L).toString(), ulinputtypesrequested.toInt(), (pulinputtypessupplied?.value ?: 0L).toString(), (pinputtypes?.value ?: 0L).toString(), uloutputtypesrequested.toInt(), (puloutputtypessupplied?.value ?: 0L).toString(), (poutputtypes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dMORegister(szname: Pcwstr, clsiddmo: COpaquePointer?, guidcategory: COpaquePointer?, dwflags: UInt, cintypes: UInt, pintypes: COpaquePointer?, couttypes: UInt, pouttypes: COpaquePointer?): Hresult =
    if (_windowsWin32MediaDxmediaobjectsNapiAvailable) _wasm_windowssys_windows_win32_media_dxmediaobjects_dMORegister((szname?.value ?: 0L).toString(), (clsiddmo?.value ?: 0L).toString(), (guidcategory?.value ?: 0L).toString(), dwflags.toInt(), cintypes.toInt(), (pintypes?.value ?: 0L).toString(), couttypes.toInt(), (pouttypes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dMOUnregister(clsiddmo: COpaquePointer?, guidcategory: COpaquePointer?): Hresult =
    if (_windowsWin32MediaDxmediaobjectsNapiAvailable) _wasm_windowssys_windows_win32_media_dxmediaobjects_dMOUnregister((clsiddmo?.value ?: 0L).toString(), (guidcategory?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moCopyMediaType(pmtdest: COpaquePointer?, pmtsrc: COpaquePointer?): Hresult =
    if (_windowsWin32MediaDxmediaobjectsNapiAvailable) _wasm_windowssys_windows_win32_media_dxmediaobjects_moCopyMediaType((pmtdest?.value ?: 0L).toString(), (pmtsrc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moCreateMediaType(ppmt: COpaquePointer?, cbformat: UInt): Hresult =
    if (_windowsWin32MediaDxmediaobjectsNapiAvailable) _wasm_windowssys_windows_win32_media_dxmediaobjects_moCreateMediaType((ppmt?.value ?: 0L).toString(), cbformat.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moDeleteMediaType(pmt: COpaquePointer?): Hresult =
    if (_windowsWin32MediaDxmediaobjectsNapiAvailable) _wasm_windowssys_windows_win32_media_dxmediaobjects_moDeleteMediaType((pmt?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moDuplicateMediaType(ppmtdest: COpaquePointer?, pmtsrc: COpaquePointer?): Hresult =
    if (_windowsWin32MediaDxmediaobjectsNapiAvailable) _wasm_windowssys_windows_win32_media_dxmediaobjects_moDuplicateMediaType((ppmtdest?.value ?: 0L).toString(), (pmtsrc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moFreeMediaType(pmt: COpaquePointer?): Hresult =
    if (_windowsWin32MediaDxmediaobjectsNapiAvailable) _wasm_windowssys_windows_win32_media_dxmediaobjects_moFreeMediaType((pmt?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moInitMediaType(pmt: COpaquePointer?, cbformat: UInt): Hresult =
    if (_windowsWin32MediaDxmediaobjectsNapiAvailable) _wasm_windowssys_windows_win32_media_dxmediaobjects_moInitMediaType((pmt?.value ?: 0L).toString(), cbformat.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
