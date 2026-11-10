@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.com.Apttype

private val _windowsWin32SystemComponentservicesNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun coCreateActivity(piunknown: COpaquePointer?, riid: COpaquePointer?, ppobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComponentservicesNapiAddon != null) (_windowsWin32SystemComponentservicesNapiAddon.windowssys_windows_win32_system_componentservices_coCreateActivity((piunknown?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coEnterServiceDomain(pconfigobject: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComponentservicesNapiAddon != null) (_windowsWin32SystemComponentservicesNapiAddon.windowssys_windows_win32_system_componentservices_coEnterServiceDomain((pconfigobject?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetDefaultContext(apttype: Apttype, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComponentservicesNapiAddon != null) (_windowsWin32SystemComponentservicesNapiAddon.windowssys_windows_win32_system_componentservices_coGetDefaultContext(apttype, (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coLeaveServiceDomain(punkstatus: COpaquePointer?) {
    if (_windowsWin32SystemComponentservicesNapiAddon != null) {
        _windowsWin32SystemComponentservicesNapiAddon.windowssys_windows_win32_system_componentservices_coLeaveServiceDomain((punkstatus?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getDispenserManager(param0: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComponentservicesNapiAddon != null) (_windowsWin32SystemComponentservicesNapiAddon.windowssys_windows_win32_system_componentservices_getDispenserManager((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getManagedExtensions(dwexts: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComponentservicesNapiAddon != null) (_windowsWin32SystemComponentservicesNapiAddon.windowssys_windows_win32_system_componentservices_getManagedExtensions((dwexts?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mTSCreateActivity(riid: COpaquePointer?, ppobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComponentservicesNapiAddon != null) (_windowsWin32SystemComponentservicesNapiAddon.windowssys_windows_win32_system_componentservices_mTSCreateActivity((riid?.value ?: 0L).toString(), (ppobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recycleSurrogate(lreasoncode: Int): Hresult =
    if (_windowsWin32SystemComponentservicesNapiAddon != null) (_windowsWin32SystemComponentservicesNapiAddon.windowssys_windows_win32_system_componentservices_recycleSurrogate(lreasoncode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeRef(rid: COpaquePointer?, punk: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComponentservicesNapiAddon != null) (_windowsWin32SystemComponentservicesNapiAddon.windowssys_windows_win32_system_componentservices_safeRef((rid?.value ?: 0L).toString(), (punk?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")
