@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.WNDENUMPROC

private val _windowsWin32SystemStationsanddesktopsNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun BroadcastSystemMessageA(flags: UInt, lpinfo: Long, msg: UInt, wparam: WPARAM, lparam: LPARAM): Int =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_BroadcastSystemMessageA(flags.toInt(), lpinfo.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else 0

public actual fun BroadcastSystemMessageExA(flags: BROADCAST_SYSTEM_MESSAGE_FLAGS, lpinfo: Long, msg: UInt, wparam: WPARAM, lparam: LPARAM, pbsminfo: Long): Int =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_BroadcastSystemMessageExA(flags.toInt(), lpinfo.toString(), msg.toInt(), wparam.toString(), lparam.toString(), pbsminfo.toString()) as Int) else 0

public actual fun BroadcastSystemMessageExW(flags: BROADCAST_SYSTEM_MESSAGE_FLAGS, lpinfo: Long, msg: UInt, wparam: WPARAM, lparam: LPARAM, pbsminfo: Long): Int =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_BroadcastSystemMessageExW(flags.toInt(), lpinfo.toString(), msg.toInt(), wparam.toString(), lparam.toString(), pbsminfo.toString()) as Int) else 0

public actual fun BroadcastSystemMessageW(flags: BROADCAST_SYSTEM_MESSAGE_FLAGS, lpinfo: Long, msg: UInt, wparam: WPARAM, lparam: LPARAM): Int =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_BroadcastSystemMessageW(flags.toInt(), lpinfo.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else 0

public actual fun CloseDesktop(hdesktop: HDESK): BOOL =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_CloseDesktop(hdesktop.toString()) as Int) else 0

public actual fun CloseWindowStation(hwinsta: HWINSTA): BOOL =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_CloseWindowStation(hwinsta.toString()) as Int) else 0

public actual fun CreateDesktopA(lpszdesktop: PCSTR, lpszdevice: PCSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long): HDESK =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_CreateDesktopA(lpszdesktop.toString(), lpszdevice.toString(), pdevmode.toString(), dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.toString()) as String).toLong() else 0L

public actual fun CreateDesktopExA(lpszdesktop: PCSTR, lpszdevice: PCSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long, ulheapsize: UInt, pvoid: Long): HDESK =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_CreateDesktopExA(lpszdesktop.toString(), lpszdevice.toString(), pdevmode.toString(), dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.toString(), ulheapsize.toInt(), pvoid.toString()) as String).toLong() else 0L

public actual fun CreateDesktopExW(lpszdesktop: PCWSTR, lpszdevice: PCWSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long, ulheapsize: UInt, pvoid: Long): HDESK =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_CreateDesktopExW(lpszdesktop.toString(), lpszdevice.toString(), pdevmode.toString(), dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.toString(), ulheapsize.toInt(), pvoid.toString()) as String).toLong() else 0L

public actual fun CreateDesktopW(lpszdesktop: PCWSTR, lpszdevice: PCWSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long): HDESK =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_CreateDesktopW(lpszdesktop.toString(), lpszdevice.toString(), pdevmode.toString(), dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.toString()) as String).toLong() else 0L

public actual fun CreateWindowStationA(lpwinsta: PCSTR, dwflags: UInt, dwdesiredaccess: UInt, lpsa: Long): HWINSTA =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_CreateWindowStationA(lpwinsta.toString(), dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.toString()) as String).toLong() else 0L

public actual fun CreateWindowStationW(lpwinsta: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt, lpsa: Long): HWINSTA =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_CreateWindowStationW(lpwinsta.toString(), dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.toString()) as String).toLong() else 0L

public actual fun EnumDesktopWindows(hdesktop: HDESK, lpfn: WNDENUMPROC, lparam: LPARAM): BOOL =
    0

public actual fun EnumDesktopsA(hwinsta: HWINSTA, lpenumfunc: DESKTOPENUMPROCA, lparam: LPARAM): BOOL =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_EnumDesktopsA(hwinsta.toString(), lpenumfunc.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun EnumDesktopsW(hwinsta: HWINSTA, lpenumfunc: DESKTOPENUMPROCW, lparam: LPARAM): BOOL =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_EnumDesktopsW(hwinsta.toString(), lpenumfunc.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun EnumWindowStationsA(lpenumfunc: WINSTAENUMPROCA, lparam: LPARAM): BOOL =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_EnumWindowStationsA(lpenumfunc.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun EnumWindowStationsW(lpenumfunc: WINSTAENUMPROCW, lparam: LPARAM): BOOL =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_EnumWindowStationsW(lpenumfunc.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun GetProcessWindowStation(): HWINSTA =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_GetProcessWindowStation() as String).toLong() else 0L

public actual fun GetThreadDesktop(dwthreadid: UInt): HDESK =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_GetThreadDesktop(dwthreadid.toInt()) as String).toLong() else 0L

public actual fun GetUserObjectInformationA(hobj: HANDLE, nindex: USER_OBJECT_INFORMATION_INDEX, pvinfo: Long, nlength: UInt, lpnlengthneeded: Long): BOOL =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_GetUserObjectInformationA(hobj.toString(), nindex, pvinfo.toString(), nlength.toInt(), lpnlengthneeded.toString()) as Int) else 0

public actual fun GetUserObjectInformationW(hobj: HANDLE, nindex: USER_OBJECT_INFORMATION_INDEX, pvinfo: Long, nlength: UInt, lpnlengthneeded: Long): BOOL =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_GetUserObjectInformationW(hobj.toString(), nindex, pvinfo.toString(), nlength.toInt(), lpnlengthneeded.toString()) as Int) else 0

public actual fun OpenDesktopA(lpszdesktop: PCSTR, dwflags: DESKTOP_CONTROL_FLAGS, finherit: BOOL, dwdesiredaccess: UInt): HDESK =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_OpenDesktopA(lpszdesktop.toString(), dwflags.toInt(), finherit, dwdesiredaccess.toInt()) as String).toLong() else 0L

public actual fun OpenDesktopW(lpszdesktop: PCWSTR, dwflags: DESKTOP_CONTROL_FLAGS, finherit: BOOL, dwdesiredaccess: UInt): HDESK =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_OpenDesktopW(lpszdesktop.toString(), dwflags.toInt(), finherit, dwdesiredaccess.toInt()) as String).toLong() else 0L

public actual fun OpenInputDesktop(dwflags: DESKTOP_CONTROL_FLAGS, finherit: BOOL, dwdesiredaccess: DESKTOP_ACCESS_FLAGS): HDESK =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_OpenInputDesktop(dwflags.toInt(), finherit, dwdesiredaccess.toInt()) as String).toLong() else 0L

public actual fun OpenWindowStationA(lpszwinsta: PCSTR, finherit: BOOL, dwdesiredaccess: UInt): HWINSTA =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_OpenWindowStationA(lpszwinsta.toString(), finherit, dwdesiredaccess.toInt()) as String).toLong() else 0L

public actual fun OpenWindowStationW(lpszwinsta: PCWSTR, finherit: BOOL, dwdesiredaccess: UInt): HWINSTA =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_OpenWindowStationW(lpszwinsta.toString(), finherit, dwdesiredaccess.toInt()) as String).toLong() else 0L

public actual fun SetProcessWindowStation(hwinsta: HWINSTA): BOOL =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_SetProcessWindowStation(hwinsta.toString()) as Int) else 0

public actual fun SetThreadDesktop(hdesktop: HDESK): BOOL =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_SetThreadDesktop(hdesktop.toString()) as Int) else 0

public actual fun SetUserObjectInformationA(hobj: HANDLE, nindex: Int, pvinfo: Long, nlength: UInt): BOOL =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_SetUserObjectInformationA(hobj.toString(), nindex, pvinfo.toString(), nlength.toInt()) as Int) else 0

public actual fun SetUserObjectInformationW(hobj: HANDLE, nindex: Int, pvinfo: Long, nlength: UInt): BOOL =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_SetUserObjectInformationW(hobj.toString(), nindex, pvinfo.toString(), nlength.toInt()) as Int) else 0

public actual fun SwitchDesktop(hdesktop: HDESK): BOOL =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_SwitchDesktop(hdesktop.toString()) as Int) else 0
