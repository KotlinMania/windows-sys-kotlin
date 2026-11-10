@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.com.Apttype

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemComponentservicesNapiAddon(): Boolean

private val _windowsWin32SystemComponentservicesNapiAvailable: Boolean = _initWindowsWin32SystemComponentservicesNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_componentservices_coCreateActivity(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_componentservices_coCreateActivity(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_componentservices_coEnterServiceDomain(p0)")
private external fun _wasm_windowssys_windows_win32_system_componentservices_coEnterServiceDomain(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_componentservices_coGetDefaultContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_componentservices_coGetDefaultContext(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_componentservices_coLeaveServiceDomain(p0)")
private external fun _wasm_windowssys_windows_win32_system_componentservices_coLeaveServiceDomain(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_componentservices_getDispenserManager(p0)")
private external fun _wasm_windowssys_windows_win32_system_componentservices_getDispenserManager(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_componentservices_getManagedExtensions(p0)")
private external fun _wasm_windowssys_windows_win32_system_componentservices_getManagedExtensions(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_componentservices_mTSCreateActivity(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_componentservices_mTSCreateActivity(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_componentservices_recycleSurrogate(p0)")
private external fun _wasm_windowssys_windows_win32_system_componentservices_recycleSurrogate(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_componentservices_safeRef(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_componentservices_safeRef(p0: String, p1: String): String

public actual fun coCreateActivity(piunknown: COpaquePointer?, riid: COpaquePointer?, ppobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComponentservicesNapiAvailable) _wasm_windowssys_windows_win32_system_componentservices_coCreateActivity((piunknown?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppobj?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coEnterServiceDomain(pconfigobject: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComponentservicesNapiAvailable) _wasm_windowssys_windows_win32_system_componentservices_coEnterServiceDomain((pconfigobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetDefaultContext(apttype: Apttype, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComponentservicesNapiAvailable) _wasm_windowssys_windows_win32_system_componentservices_coGetDefaultContext(apttype, (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coLeaveServiceDomain(punkstatus: COpaquePointer?) {
    if (_windowsWin32SystemComponentservicesNapiAvailable) {
        _wasm_windowssys_windows_win32_system_componentservices_coLeaveServiceDomain((punkstatus?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getDispenserManager(param0: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComponentservicesNapiAvailable) _wasm_windowssys_windows_win32_system_componentservices_getDispenserManager((param0?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getManagedExtensions(dwexts: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComponentservicesNapiAvailable) _wasm_windowssys_windows_win32_system_componentservices_getManagedExtensions((dwexts?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mTSCreateActivity(riid: COpaquePointer?, ppobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComponentservicesNapiAvailable) _wasm_windowssys_windows_win32_system_componentservices_mTSCreateActivity((riid?.value ?: 0L).toString(), (ppobj?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recycleSurrogate(lreasoncode: Int): Hresult =
    if (_windowsWin32SystemComponentservicesNapiAvailable) _wasm_windowssys_windows_win32_system_componentservices_recycleSurrogate(lreasoncode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeRef(rid: COpaquePointer?, punk: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComponentservicesNapiAvailable) _wasm_windowssys_windows_win32_system_componentservices_safeRef((rid?.value ?: 0L).toString(), (punk?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")
