@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32SystemDiagnosticsToolhelpNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun CreateToolhelp32Snapshot(dwflags: CREATE_TOOLHELP_SNAPSHOT_FLAGS, th32processid: UInt): HANDLE =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_CreateToolhelp32Snapshot(dwflags.toInt(), th32processid.toInt()) as String).toLong() else 0L

public actual fun Heap32First(lphe: Long, th32processid: UInt, th32heapid: ULong): BOOL =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_Heap32First(lphe.toString(), th32processid.toInt(), th32heapid.toString()) as Int) else 0

public actual fun Heap32ListFirst(hsnapshot: HANDLE, lphl: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_Heap32ListFirst(hsnapshot.toString(), lphl.toString()) as Int) else 0

public actual fun Heap32ListNext(hsnapshot: HANDLE, lphl: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_Heap32ListNext(hsnapshot.toString(), lphl.toString()) as Int) else 0

public actual fun Heap32Next(lphe: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_Heap32Next(lphe.toString()) as Int) else 0

public actual fun Module32First(hsnapshot: HANDLE, lpme: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_Module32First(hsnapshot.toString(), lpme.toString()) as Int) else 0

public actual fun Module32FirstW(hsnapshot: HANDLE, lpme: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_Module32FirstW(hsnapshot.toString(), lpme.toString()) as Int) else 0

public actual fun Module32Next(hsnapshot: HANDLE, lpme: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_Module32Next(hsnapshot.toString(), lpme.toString()) as Int) else 0

public actual fun Module32NextW(hsnapshot: HANDLE, lpme: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_Module32NextW(hsnapshot.toString(), lpme.toString()) as Int) else 0

public actual fun Process32First(hsnapshot: HANDLE, lppe: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_Process32First(hsnapshot.toString(), lppe.toString()) as Int) else 0

public actual fun Process32FirstW(hsnapshot: HANDLE, lppe: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_Process32FirstW(hsnapshot.toString(), lppe.toString()) as Int) else 0

public actual fun Process32Next(hsnapshot: HANDLE, lppe: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_Process32Next(hsnapshot.toString(), lppe.toString()) as Int) else 0

public actual fun Process32NextW(hsnapshot: HANDLE, lppe: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_Process32NextW(hsnapshot.toString(), lppe.toString()) as Int) else 0

public actual fun Thread32First(hsnapshot: HANDLE, lpte: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_Thread32First(hsnapshot.toString(), lpte.toString()) as Int) else 0

public actual fun Thread32Next(hsnapshot: HANDLE, lpte: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_Thread32Next(hsnapshot.toString(), lpte.toString()) as Int) else 0

public actual fun Toolhelp32ReadProcessMemory(th32processid: UInt, lpbaseaddress: Long, lpbuffer: Long, cbread: ULong, lpnumberofbytesread: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_Toolhelp32ReadProcessMemory(th32processid.toInt(), lpbaseaddress.toString(), lpbuffer.toString(), cbread.toString(), lpnumberofbytesread.toString()) as Int) else 0
