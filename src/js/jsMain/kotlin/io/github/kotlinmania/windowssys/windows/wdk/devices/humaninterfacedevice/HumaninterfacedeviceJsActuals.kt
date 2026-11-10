@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private val _windowsWdkDevicesHumaninterfacedeviceNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun vhfAsyncOperationComplete(vhfoperationhandle: COpaquePointer?, completionstatus: Ntstatus): Ntstatus =
    if (_windowsWdkDevicesHumaninterfacedeviceNapiAddon != null) (_windowsWdkDevicesHumaninterfacedeviceNapiAddon.windowssys_windows_wdk_devices_humaninterfacedevice_vhfAsyncOperationComplete((vhfoperationhandle?.value ?: 0L).toString(), completionstatus) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vhfCreate(vhfconfig: COpaquePointer?, vhfhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkDevicesHumaninterfacedeviceNapiAddon != null) (_windowsWdkDevicesHumaninterfacedeviceNapiAddon.windowssys_windows_wdk_devices_humaninterfacedevice_vhfCreate((vhfconfig?.value ?: 0L).toString(), (vhfhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vhfDelete(vhfhandle: COpaquePointer?, wait: Boolean) {
    if (_windowsWdkDevicesHumaninterfacedeviceNapiAddon != null) {
        _windowsWdkDevicesHumaninterfacedeviceNapiAddon.windowssys_windows_wdk_devices_humaninterfacedevice_vhfDelete((vhfhandle?.value ?: 0L).toString(), wait)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun vhfReadReportSubmit(vhfhandle: COpaquePointer?, hidtransferpacket: COpaquePointer?): Ntstatus =
    if (_windowsWdkDevicesHumaninterfacedeviceNapiAddon != null) (_windowsWdkDevicesHumaninterfacedeviceNapiAddon.windowssys_windows_wdk_devices_humaninterfacedevice_vhfReadReportSubmit((vhfhandle?.value ?: 0L).toString(), (hidtransferpacket?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vhfStart(vhfhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkDevicesHumaninterfacedeviceNapiAddon != null) (_windowsWdkDevicesHumaninterfacedeviceNapiAddon.windowssys_windows_wdk_devices_humaninterfacedevice_vhfStart((vhfhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
