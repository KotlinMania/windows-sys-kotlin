@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32DevicesEnumerationPnpNapiAddon(): Boolean

private val _windowsWin32DevicesEnumerationPnpNapiAvailable: Boolean = _initWindowsWin32DevicesEnumerationPnpNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_enumeration_pnp_swDeviceClose(p0)")
private external fun _wasm_windowssys_windows_win32_devices_enumeration_pnp_swDeviceClose(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_enumeration_pnp_swDeviceCreate(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_devices_enumeration_pnp_swDeviceCreate(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_enumeration_pnp_swDeviceGetLifetime(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_enumeration_pnp_swDeviceGetLifetime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_enumeration_pnp_swDeviceInterfacePropertySet(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_enumeration_pnp_swDeviceInterfacePropertySet(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_enumeration_pnp_swDeviceInterfaceRegister(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_devices_enumeration_pnp_swDeviceInterfaceRegister(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_enumeration_pnp_swDeviceInterfaceSetState(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_enumeration_pnp_swDeviceInterfaceSetState(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_enumeration_pnp_swDevicePropertySet(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_enumeration_pnp_swDevicePropertySet(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_enumeration_pnp_swDeviceSetLifetime(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_enumeration_pnp_swDeviceSetLifetime(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_enumeration_pnp_swMemFree(p0)")
private external fun _wasm_windowssys_windows_win32_devices_enumeration_pnp_swMemFree(p0: String)

public actual fun swDeviceClose(hswdevice: Hswdevice) {
    if (_windowsWin32DevicesEnumerationPnpNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_enumeration_pnp_swDeviceClose((hswdevice?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun swDeviceCreate(pszenumeratorname: Pcwstr, pszparentdeviceinstance: Pcwstr, pcreateinfo: COpaquePointer?, cpropertycount: UInt, pproperties: COpaquePointer?, pcallback: SwDeviceCreateCallback, pcontext: COpaquePointer?, phswdevice: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesEnumerationPnpNapiAvailable) _wasm_windowssys_windows_win32_devices_enumeration_pnp_swDeviceCreate((pszenumeratorname?.value ?: 0L).toString(), (pszparentdeviceinstance?.value ?: 0L).toString(), (pcreateinfo?.value ?: 0L).toString(), cpropertycount.toInt(), (pproperties?.value ?: 0L).toString(), 0L.toString(), (pcontext?.value ?: 0L).toString(), (phswdevice?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swDeviceGetLifetime(hswdevice: Hswdevice, plifetime: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesEnumerationPnpNapiAvailable) _wasm_windowssys_windows_win32_devices_enumeration_pnp_swDeviceGetLifetime((hswdevice?.value ?: 0L).toString(), (plifetime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swDeviceInterfacePropertySet(hswdevice: Hswdevice, pszdeviceinterfaceid: Pcwstr, cpropertycount: UInt, pproperties: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesEnumerationPnpNapiAvailable) _wasm_windowssys_windows_win32_devices_enumeration_pnp_swDeviceInterfacePropertySet((hswdevice?.value ?: 0L).toString(), (pszdeviceinterfaceid?.value ?: 0L).toString(), cpropertycount.toInt(), (pproperties?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swDeviceInterfaceRegister(hswdevice: Hswdevice, pinterfaceclassguid: COpaquePointer?, pszreferencestring: Pcwstr, cpropertycount: UInt, pproperties: COpaquePointer?, fenabled: Bool, ppszdeviceinterfaceid: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesEnumerationPnpNapiAvailable) _wasm_windowssys_windows_win32_devices_enumeration_pnp_swDeviceInterfaceRegister((hswdevice?.value ?: 0L).toString(), (pinterfaceclassguid?.value ?: 0L).toString(), (pszreferencestring?.value ?: 0L).toString(), cpropertycount.toInt(), (pproperties?.value ?: 0L).toString(), fenabled, (ppszdeviceinterfaceid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swDeviceInterfaceSetState(hswdevice: Hswdevice, pszdeviceinterfaceid: Pcwstr, fenabled: Bool): Hresult =
    if (_windowsWin32DevicesEnumerationPnpNapiAvailable) _wasm_windowssys_windows_win32_devices_enumeration_pnp_swDeviceInterfaceSetState((hswdevice?.value ?: 0L).toString(), (pszdeviceinterfaceid?.value ?: 0L).toString(), fenabled) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swDevicePropertySet(hswdevice: Hswdevice, cpropertycount: UInt, pproperties: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesEnumerationPnpNapiAvailable) _wasm_windowssys_windows_win32_devices_enumeration_pnp_swDevicePropertySet((hswdevice?.value ?: 0L).toString(), cpropertycount.toInt(), (pproperties?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swDeviceSetLifetime(hswdevice: Hswdevice, lifetime: SwDeviceLifetime): Hresult =
    if (_windowsWin32DevicesEnumerationPnpNapiAvailable) _wasm_windowssys_windows_win32_devices_enumeration_pnp_swDeviceSetLifetime((hswdevice?.value ?: 0L).toString(), lifetime) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swMemFree(pmem: COpaquePointer?) {
    if (_windowsWin32DevicesEnumerationPnpNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_enumeration_pnp_swMemFree((pmem?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
