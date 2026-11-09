@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.system.com.APTTYPE

private val _windowsWin32SystemComponentservicesNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun CoCreateActivity(piunknown: Long, riid: Long, ppobj: Long): HRESULT =
    if (_windowsWin32SystemComponentservicesNapiAddon != null) (_windowsWin32SystemComponentservicesNapiAddon.windowssys_windows_win32_system_componentservices_CoCreateActivity(piunknown.toString(), riid.toString(), ppobj.toString()) as Int) else 0

public actual fun CoEnterServiceDomain(pconfigobject: Long): HRESULT =
    if (_windowsWin32SystemComponentservicesNapiAddon != null) (_windowsWin32SystemComponentservicesNapiAddon.windowssys_windows_win32_system_componentservices_CoEnterServiceDomain(pconfigobject.toString()) as Int) else 0

public actual fun CoGetDefaultContext(apttype: APTTYPE, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32SystemComponentservicesNapiAddon != null) (_windowsWin32SystemComponentservicesNapiAddon.windowssys_windows_win32_system_componentservices_CoGetDefaultContext(apttype, riid.toString(), ppv.toString()) as Int) else 0

public actual fun CoLeaveServiceDomain(punkstatus: Long) {
    if (_windowsWin32SystemComponentservicesNapiAddon != null) {
        _windowsWin32SystemComponentservicesNapiAddon.windowssys_windows_win32_system_componentservices_CoLeaveServiceDomain(punkstatus.toString())
    }
}

public actual fun GetDispenserManager(param0: Long): HRESULT =
    if (_windowsWin32SystemComponentservicesNapiAddon != null) (_windowsWin32SystemComponentservicesNapiAddon.windowssys_windows_win32_system_componentservices_GetDispenserManager(param0.toString()) as Int) else 0

public actual fun GetManagedExtensions(dwexts: Long): HRESULT =
    if (_windowsWin32SystemComponentservicesNapiAddon != null) (_windowsWin32SystemComponentservicesNapiAddon.windowssys_windows_win32_system_componentservices_GetManagedExtensions(dwexts.toString()) as Int) else 0

public actual fun MTSCreateActivity(riid: Long, ppobj: Long): HRESULT =
    if (_windowsWin32SystemComponentservicesNapiAddon != null) (_windowsWin32SystemComponentservicesNapiAddon.windowssys_windows_win32_system_componentservices_MTSCreateActivity(riid.toString(), ppobj.toString()) as Int) else 0

public actual fun RecycleSurrogate(lreasoncode: Int): HRESULT =
    if (_windowsWin32SystemComponentservicesNapiAddon != null) (_windowsWin32SystemComponentservicesNapiAddon.windowssys_windows_win32_system_componentservices_RecycleSurrogate(lreasoncode) as Int) else 0

public actual fun SafeRef(rid: Long, punk: Long): Long =
    if (_windowsWin32SystemComponentservicesNapiAddon != null) (_windowsWin32SystemComponentservicesNapiAddon.windowssys_windows_win32_system_componentservices_SafeRef(rid.toString(), punk.toString()) as String).toLong() else 0L
