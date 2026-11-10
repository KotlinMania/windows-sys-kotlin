@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWdkDevicesHumaninterfacedeviceNapiAddon(): Boolean

private val _windowsWdkDevicesHumaninterfacedeviceNapiAvailable: Boolean = _initWindowsWdkDevicesHumaninterfacedeviceNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_devices_humaninterfacedevice_vhfAsyncOperationComplete(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_devices_humaninterfacedevice_vhfAsyncOperationComplete(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_devices_humaninterfacedevice_vhfCreate(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_devices_humaninterfacedevice_vhfCreate(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_devices_humaninterfacedevice_vhfDelete(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_devices_humaninterfacedevice_vhfDelete(p0: String, p1: Boolean)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_devices_humaninterfacedevice_vhfReadReportSubmit(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_devices_humaninterfacedevice_vhfReadReportSubmit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_devices_humaninterfacedevice_vhfStart(p0)")
private external fun _wasm_windowssys_windows_wdk_devices_humaninterfacedevice_vhfStart(p0: String): Int

public actual fun vhfAsyncOperationComplete(vhfoperationhandle: COpaquePointer?, completionstatus: Ntstatus): Ntstatus =
    if (_windowsWdkDevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_wdk_devices_humaninterfacedevice_vhfAsyncOperationComplete((vhfoperationhandle?.value ?: 0L).toString(), completionstatus) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vhfCreate(vhfconfig: COpaquePointer?, vhfhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkDevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_wdk_devices_humaninterfacedevice_vhfCreate((vhfconfig?.value ?: 0L).toString(), (vhfhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vhfDelete(vhfhandle: COpaquePointer?, wait: Boolean) {
    if (_windowsWdkDevicesHumaninterfacedeviceNapiAvailable) {
        _wasm_windowssys_windows_wdk_devices_humaninterfacedevice_vhfDelete((vhfhandle?.value ?: 0L).toString(), wait)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun vhfReadReportSubmit(vhfhandle: COpaquePointer?, hidtransferpacket: COpaquePointer?): Ntstatus =
    if (_windowsWdkDevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_wdk_devices_humaninterfacedevice_vhfReadReportSubmit((vhfhandle?.value ?: 0L).toString(), (hidtransferpacket?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vhfStart(vhfhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkDevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_wdk_devices_humaninterfacedevice_vhfStart((vhfhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
