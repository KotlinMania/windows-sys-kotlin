@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

private val _windowsWin32DevicesEnumerationPnpNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun SwDeviceClose(hswdevice: HSWDEVICE) {
    if (_windowsWin32DevicesEnumerationPnpNapiAddon != null) {
        _windowsWin32DevicesEnumerationPnpNapiAddon.windowssys_windows_win32_devices_enumeration_pnp_SwDeviceClose(hswdevice.toString())
    }
}

public actual fun SwDeviceCreate(pszenumeratorname: PCWSTR, pszparentdeviceinstance: PCWSTR, pcreateinfo: Long, cpropertycount: UInt, pproperties: Long, pcallback: SW_DEVICE_CREATE_CALLBACK, pcontext: Long, phswdevice: Long): HRESULT =
    if (_windowsWin32DevicesEnumerationPnpNapiAddon != null) (_windowsWin32DevicesEnumerationPnpNapiAddon.windowssys_windows_win32_devices_enumeration_pnp_SwDeviceCreate(pszenumeratorname.toString(), pszparentdeviceinstance.toString(), pcreateinfo.toString(), cpropertycount.toInt(), pproperties.toString(), pcallback.toLong().toString(), pcontext.toString(), phswdevice.toString()) as Int) else 0

public actual fun SwDeviceGetLifetime(hswdevice: HSWDEVICE, plifetime: Long): HRESULT =
    if (_windowsWin32DevicesEnumerationPnpNapiAddon != null) (_windowsWin32DevicesEnumerationPnpNapiAddon.windowssys_windows_win32_devices_enumeration_pnp_SwDeviceGetLifetime(hswdevice.toString(), plifetime.toString()) as Int) else 0

public actual fun SwDeviceInterfacePropertySet(hswdevice: HSWDEVICE, pszdeviceinterfaceid: PCWSTR, cpropertycount: UInt, pproperties: Long): HRESULT =
    if (_windowsWin32DevicesEnumerationPnpNapiAddon != null) (_windowsWin32DevicesEnumerationPnpNapiAddon.windowssys_windows_win32_devices_enumeration_pnp_SwDeviceInterfacePropertySet(hswdevice.toString(), pszdeviceinterfaceid.toString(), cpropertycount.toInt(), pproperties.toString()) as Int) else 0

public actual fun SwDeviceInterfaceRegister(hswdevice: HSWDEVICE, pinterfaceclassguid: Long, pszreferencestring: PCWSTR, cpropertycount: UInt, pproperties: Long, fenabled: BOOL, ppszdeviceinterfaceid: Long): HRESULT =
    if (_windowsWin32DevicesEnumerationPnpNapiAddon != null) (_windowsWin32DevicesEnumerationPnpNapiAddon.windowssys_windows_win32_devices_enumeration_pnp_SwDeviceInterfaceRegister(hswdevice.toString(), pinterfaceclassguid.toString(), pszreferencestring.toString(), cpropertycount.toInt(), pproperties.toString(), fenabled, ppszdeviceinterfaceid.toString()) as Int) else 0

public actual fun SwDeviceInterfaceSetState(hswdevice: HSWDEVICE, pszdeviceinterfaceid: PCWSTR, fenabled: BOOL): HRESULT =
    if (_windowsWin32DevicesEnumerationPnpNapiAddon != null) (_windowsWin32DevicesEnumerationPnpNapiAddon.windowssys_windows_win32_devices_enumeration_pnp_SwDeviceInterfaceSetState(hswdevice.toString(), pszdeviceinterfaceid.toString(), fenabled) as Int) else 0

public actual fun SwDevicePropertySet(hswdevice: HSWDEVICE, cpropertycount: UInt, pproperties: Long): HRESULT =
    if (_windowsWin32DevicesEnumerationPnpNapiAddon != null) (_windowsWin32DevicesEnumerationPnpNapiAddon.windowssys_windows_win32_devices_enumeration_pnp_SwDevicePropertySet(hswdevice.toString(), cpropertycount.toInt(), pproperties.toString()) as Int) else 0

public actual fun SwDeviceSetLifetime(hswdevice: HSWDEVICE, lifetime: SW_DEVICE_LIFETIME): HRESULT =
    if (_windowsWin32DevicesEnumerationPnpNapiAddon != null) (_windowsWin32DevicesEnumerationPnpNapiAddon.windowssys_windows_win32_devices_enumeration_pnp_SwDeviceSetLifetime(hswdevice.toString(), lifetime) as Int) else 0

public actual fun SwMemFree(pmem: Long) {
    if (_windowsWin32DevicesEnumerationPnpNapiAddon != null) {
        _windowsWin32DevicesEnumerationPnpNapiAddon.windowssys_windows_win32_devices_enumeration_pnp_SwMemFree(pmem.toString())
    }
}
