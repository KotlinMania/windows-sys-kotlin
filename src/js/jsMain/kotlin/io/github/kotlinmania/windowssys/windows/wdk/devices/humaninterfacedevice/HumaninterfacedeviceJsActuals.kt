@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

private val _windowsWdkDevicesHumaninterfacedeviceNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun VhfAsyncOperationComplete(vhfoperationhandle: Long, completionstatus: NTSTATUS): NTSTATUS =
    if (_windowsWdkDevicesHumaninterfacedeviceNapiAddon != null) (_windowsWdkDevicesHumaninterfacedeviceNapiAddon.windowssys_windows_wdk_devices_humaninterfacedevice_VhfAsyncOperationComplete(vhfoperationhandle.toString(), completionstatus) as Int) else 0

public actual fun VhfCreate(vhfconfig: Long, vhfhandle: Long): NTSTATUS =
    if (_windowsWdkDevicesHumaninterfacedeviceNapiAddon != null) (_windowsWdkDevicesHumaninterfacedeviceNapiAddon.windowssys_windows_wdk_devices_humaninterfacedevice_VhfCreate(vhfconfig.toString(), vhfhandle.toString()) as Int) else 0

public actual fun VhfDelete(vhfhandle: Long, wait: Boolean) {
    if (_windowsWdkDevicesHumaninterfacedeviceNapiAddon != null) {
        _windowsWdkDevicesHumaninterfacedeviceNapiAddon.windowssys_windows_wdk_devices_humaninterfacedevice_VhfDelete(vhfhandle.toString(), wait)
    }
}

public actual fun VhfReadReportSubmit(vhfhandle: Long, hidtransferpacket: Long): NTSTATUS =
    if (_windowsWdkDevicesHumaninterfacedeviceNapiAddon != null) (_windowsWdkDevicesHumaninterfacedeviceNapiAddon.windowssys_windows_wdk_devices_humaninterfacedevice_VhfReadReportSubmit(vhfhandle.toString(), hidtransferpacket.toString()) as Int) else 0

public actual fun VhfStart(vhfhandle: Long): NTSTATUS =
    if (_windowsWdkDevicesHumaninterfacedeviceNapiAddon != null) (_windowsWdkDevicesHumaninterfacedeviceNapiAddon.windowssys_windows_wdk_devices_humaninterfacedevice_VhfStart(vhfhandle.toString()) as Int) else 0
