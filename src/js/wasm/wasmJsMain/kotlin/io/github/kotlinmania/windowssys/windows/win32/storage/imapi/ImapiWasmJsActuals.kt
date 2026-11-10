@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.imapi

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatebuffer
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatemore
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpfreebuffer

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32StorageImapiNapiAddon(): Boolean

private val _windowsWin32StorageImapiNapiAvailable: Boolean = _initWindowsWin32StorageImapiNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_imapi_closeIMsgSession(p0)")
private external fun _wasm_windowssys_windows_win32_storage_imapi_closeIMsgSession(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_imapi_getAttribIMsgOnIStg(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_imapi_getAttribIMsgOnIStg(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_imapi_mapStorageSCode(p0)")
private external fun _wasm_windowssys_windows_win32_storage_imapi_mapStorageSCode(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_imapi_openIMsgSession(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_imapi_openIMsgSession(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_imapi_setAttribIMsgOnIStg(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_imapi_setAttribIMsgOnIStg(p0: String, p1: String, p2: String, p3: String): Int

public actual fun closeIMsgSession(lpmsgsess: Lpmsgsess) {
    if (_windowsWin32StorageImapiNapiAvailable) {
        _wasm_windowssys_windows_win32_storage_imapi_closeIMsgSession(lpmsgsess.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getAttribIMsgOnIStg(lpobject: COpaquePointer?, lpproptagarray: COpaquePointer?, lpppropattrarray: COpaquePointer?): Hresult =
    if (_windowsWin32StorageImapiNapiAvailable) _wasm_windowssys_windows_win32_storage_imapi_getAttribIMsgOnIStg((lpobject?.value ?: 0L).toString(), (lpproptagarray?.value ?: 0L).toString(), (lpppropattrarray?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapStorageSCode(stgscode: Int): Int =
    if (_windowsWin32StorageImapiNapiAvailable) _wasm_windowssys_windows_win32_storage_imapi_mapStorageSCode(stgscode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openIMsgOnIStg(lpmsgsess: Lpmsgsess, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: COpaquePointer?, lpmapisup: COpaquePointer?, lpstg: COpaquePointer?, lpfmsgcallrelease: COpaquePointer?, ulcallerdata: UInt, ulflags: UInt, lppmsg: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openIMsgSession(lpmalloc: COpaquePointer?, ulflags: UInt, lppmsgsess: COpaquePointer?): Int =
    if (_windowsWin32StorageImapiNapiAvailable) _wasm_windowssys_windows_win32_storage_imapi_openIMsgSession((lpmalloc?.value ?: 0L).toString(), ulflags.toInt(), (lppmsgsess?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAttribIMsgOnIStg(lpobject: COpaquePointer?, lpproptags: COpaquePointer?, lppropattrs: COpaquePointer?, lpppropproblems: COpaquePointer?): Hresult =
    if (_windowsWin32StorageImapiNapiAvailable) _wasm_windowssys_windows_win32_storage_imapi_setAttribIMsgOnIStg((lpobject?.value ?: 0L).toString(), (lpproptags?.value ?: 0L).toString(), (lppropattrs?.value ?: 0L).toString(), (lpppropproblems?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
