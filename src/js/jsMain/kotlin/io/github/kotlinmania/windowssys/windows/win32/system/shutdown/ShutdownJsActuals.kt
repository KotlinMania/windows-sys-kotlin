@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.shutdown

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private val _windowsWin32SystemShutdownNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun AbortSystemShutdownA(lpmachinename: PCSTR): BOOL =
    if (_windowsWin32SystemShutdownNapiAddon != null) (_windowsWin32SystemShutdownNapiAddon.windowssys_windows_win32_system_shutdown_AbortSystemShutdownA(lpmachinename.toString()) as Int) else 0

public actual fun AbortSystemShutdownW(lpmachinename: PCWSTR): BOOL =
    if (_windowsWin32SystemShutdownNapiAddon != null) (_windowsWin32SystemShutdownNapiAddon.windowssys_windows_win32_system_shutdown_AbortSystemShutdownW(lpmachinename.toString()) as Int) else 0

public actual fun CheckForHiberboot(phiberboot: Long, bclearflag: Boolean): UInt =
    if (_windowsWin32SystemShutdownNapiAddon != null) (_windowsWin32SystemShutdownNapiAddon.windowssys_windows_win32_system_shutdown_CheckForHiberboot(phiberboot.toString(), bclearflag) as Int).toUInt() else 0u

public actual fun ExitWindowsEx(uflags: EXIT_WINDOWS_FLAGS, dwreason: SHUTDOWN_REASON): BOOL =
    if (_windowsWin32SystemShutdownNapiAddon != null) (_windowsWin32SystemShutdownNapiAddon.windowssys_windows_win32_system_shutdown_ExitWindowsEx(uflags.toInt(), dwreason.toInt()) as Int) else 0

public actual fun InitiateShutdownA(lpmachinename: PCSTR, lpmessage: PCSTR, dwgraceperiod: UInt, dwshutdownflags: SHUTDOWN_FLAGS, dwreason: SHUTDOWN_REASON): UInt =
    if (_windowsWin32SystemShutdownNapiAddon != null) (_windowsWin32SystemShutdownNapiAddon.windowssys_windows_win32_system_shutdown_InitiateShutdownA(lpmachinename.toString(), lpmessage.toString(), dwgraceperiod.toInt(), dwshutdownflags.toInt(), dwreason.toInt()) as Int).toUInt() else 0u

public actual fun InitiateShutdownW(lpmachinename: PCWSTR, lpmessage: PCWSTR, dwgraceperiod: UInt, dwshutdownflags: SHUTDOWN_FLAGS, dwreason: SHUTDOWN_REASON): UInt =
    if (_windowsWin32SystemShutdownNapiAddon != null) (_windowsWin32SystemShutdownNapiAddon.windowssys_windows_win32_system_shutdown_InitiateShutdownW(lpmachinename.toString(), lpmessage.toString(), dwgraceperiod.toInt(), dwshutdownflags.toInt(), dwreason.toInt()) as Int).toUInt() else 0u

public actual fun InitiateSystemShutdownA(lpmachinename: PCSTR, lpmessage: PCSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL): BOOL =
    if (_windowsWin32SystemShutdownNapiAddon != null) (_windowsWin32SystemShutdownNapiAddon.windowssys_windows_win32_system_shutdown_InitiateSystemShutdownA(lpmachinename.toString(), lpmessage.toString(), dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown) as Int) else 0

public actual fun InitiateSystemShutdownExA(lpmachinename: PCSTR, lpmessage: PCSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL, dwreason: SHUTDOWN_REASON): BOOL =
    if (_windowsWin32SystemShutdownNapiAddon != null) (_windowsWin32SystemShutdownNapiAddon.windowssys_windows_win32_system_shutdown_InitiateSystemShutdownExA(lpmachinename.toString(), lpmessage.toString(), dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown, dwreason.toInt()) as Int) else 0

public actual fun InitiateSystemShutdownExW(lpmachinename: PCWSTR, lpmessage: PCWSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL, dwreason: SHUTDOWN_REASON): BOOL =
    if (_windowsWin32SystemShutdownNapiAddon != null) (_windowsWin32SystemShutdownNapiAddon.windowssys_windows_win32_system_shutdown_InitiateSystemShutdownExW(lpmachinename.toString(), lpmessage.toString(), dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown, dwreason.toInt()) as Int) else 0

public actual fun InitiateSystemShutdownW(lpmachinename: PCWSTR, lpmessage: PCWSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL): BOOL =
    if (_windowsWin32SystemShutdownNapiAddon != null) (_windowsWin32SystemShutdownNapiAddon.windowssys_windows_win32_system_shutdown_InitiateSystemShutdownW(lpmachinename.toString(), lpmessage.toString(), dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown) as Int) else 0

public actual fun LockWorkStation(): BOOL =
    if (_windowsWin32SystemShutdownNapiAddon != null) (_windowsWin32SystemShutdownNapiAddon.windowssys_windows_win32_system_shutdown_LockWorkStation() as Int) else 0

public actual fun ShutdownBlockReasonCreate(hwnd: HWND, pwszreason: PCWSTR): BOOL =
    if (_windowsWin32SystemShutdownNapiAddon != null) (_windowsWin32SystemShutdownNapiAddon.windowssys_windows_win32_system_shutdown_ShutdownBlockReasonCreate(hwnd.toString(), pwszreason.toString()) as Int) else 0

public actual fun ShutdownBlockReasonDestroy(hwnd: HWND): BOOL =
    if (_windowsWin32SystemShutdownNapiAddon != null) (_windowsWin32SystemShutdownNapiAddon.windowssys_windows_win32_system_shutdown_ShutdownBlockReasonDestroy(hwnd.toString()) as Int) else 0

public actual fun ShutdownBlockReasonQuery(hwnd: HWND, pwszbuff: PWSTR, pcchbuff: Long): BOOL =
    if (_windowsWin32SystemShutdownNapiAddon != null) (_windowsWin32SystemShutdownNapiAddon.windowssys_windows_win32_system_shutdown_ShutdownBlockReasonQuery(hwnd.toString(), pwszbuff.toString(), pcchbuff.toString()) as Int) else 0
