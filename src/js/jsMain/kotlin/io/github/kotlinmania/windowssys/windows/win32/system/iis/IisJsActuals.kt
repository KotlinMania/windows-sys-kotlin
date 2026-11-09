@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.iis

import io.github.kotlinmania.windowssys.core.BOOL

private val _windowsWin32SystemIisNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun GetExtensionVersion(pver: Long): BOOL =
    if (_windowsWin32SystemIisNapiAddon != null) (_windowsWin32SystemIisNapiAddon.windowssys_windows_win32_system_iis_GetExtensionVersion(pver.toString()) as Int) else 0

public actual fun GetFilterVersion(pver: Long): BOOL =
    if (_windowsWin32SystemIisNapiAddon != null) (_windowsWin32SystemIisNapiAddon.windowssys_windows_win32_system_iis_GetFilterVersion(pver.toString()) as Int) else 0

public actual fun HttpExtensionProc(pecb: Long): UInt =
    if (_windowsWin32SystemIisNapiAddon != null) (_windowsWin32SystemIisNapiAddon.windowssys_windows_win32_system_iis_HttpExtensionProc(pecb.toString()) as Int).toUInt() else 0u

public actual fun HttpFilterProc(pfc: Long, notificationtype: UInt, pvnotification: Long): UInt =
    if (_windowsWin32SystemIisNapiAddon != null) (_windowsWin32SystemIisNapiAddon.windowssys_windows_win32_system_iis_HttpFilterProc(pfc.toString(), notificationtype.toInt(), pvnotification.toString()) as Int).toUInt() else 0u
