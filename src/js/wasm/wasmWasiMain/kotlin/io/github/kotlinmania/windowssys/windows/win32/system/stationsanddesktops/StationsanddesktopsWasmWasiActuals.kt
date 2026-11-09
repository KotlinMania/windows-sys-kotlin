@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.WNDENUMPROC

public actual fun BroadcastSystemMessageA(flags: UInt, lpinfo: Long, msg: UInt, wparam: WPARAM, lparam: LPARAM): Int =
    0

public actual fun BroadcastSystemMessageExA(flags: BROADCAST_SYSTEM_MESSAGE_FLAGS, lpinfo: Long, msg: UInt, wparam: WPARAM, lparam: LPARAM, pbsminfo: Long): Int =
    0

public actual fun BroadcastSystemMessageExW(flags: BROADCAST_SYSTEM_MESSAGE_FLAGS, lpinfo: Long, msg: UInt, wparam: WPARAM, lparam: LPARAM, pbsminfo: Long): Int =
    0

public actual fun BroadcastSystemMessageW(flags: BROADCAST_SYSTEM_MESSAGE_FLAGS, lpinfo: Long, msg: UInt, wparam: WPARAM, lparam: LPARAM): Int =
    0

public actual fun CloseDesktop(hdesktop: HDESK): BOOL =
    0

public actual fun CloseWindowStation(hwinsta: HWINSTA): BOOL =
    0

public actual fun CreateDesktopA(lpszdesktop: PCSTR, lpszdevice: PCSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long): HDESK =
    0L

public actual fun CreateDesktopExA(lpszdesktop: PCSTR, lpszdevice: PCSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long, ulheapsize: UInt, pvoid: Long): HDESK =
    0L

public actual fun CreateDesktopExW(lpszdesktop: PCWSTR, lpszdevice: PCWSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long, ulheapsize: UInt, pvoid: Long): HDESK =
    0L

public actual fun CreateDesktopW(lpszdesktop: PCWSTR, lpszdevice: PCWSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long): HDESK =
    0L

public actual fun CreateWindowStationA(lpwinsta: PCSTR, dwflags: UInt, dwdesiredaccess: UInt, lpsa: Long): HWINSTA =
    0L

public actual fun CreateWindowStationW(lpwinsta: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt, lpsa: Long): HWINSTA =
    0L

public actual fun EnumDesktopWindows(hdesktop: HDESK, lpfn: WNDENUMPROC, lparam: LPARAM): BOOL =
    0

public actual fun EnumDesktopsA(hwinsta: HWINSTA, lpenumfunc: DESKTOPENUMPROCA, lparam: LPARAM): BOOL =
    0

public actual fun EnumDesktopsW(hwinsta: HWINSTA, lpenumfunc: DESKTOPENUMPROCW, lparam: LPARAM): BOOL =
    0

public actual fun EnumWindowStationsA(lpenumfunc: WINSTAENUMPROCA, lparam: LPARAM): BOOL =
    0

public actual fun EnumWindowStationsW(lpenumfunc: WINSTAENUMPROCW, lparam: LPARAM): BOOL =
    0

public actual fun GetProcessWindowStation(): HWINSTA =
    0L

public actual fun GetThreadDesktop(dwthreadid: UInt): HDESK =
    0L

public actual fun GetUserObjectInformationA(hobj: HANDLE, nindex: USER_OBJECT_INFORMATION_INDEX, pvinfo: Long, nlength: UInt, lpnlengthneeded: Long): BOOL =
    0

public actual fun GetUserObjectInformationW(hobj: HANDLE, nindex: USER_OBJECT_INFORMATION_INDEX, pvinfo: Long, nlength: UInt, lpnlengthneeded: Long): BOOL =
    0

public actual fun OpenDesktopA(lpszdesktop: PCSTR, dwflags: DESKTOP_CONTROL_FLAGS, finherit: BOOL, dwdesiredaccess: UInt): HDESK =
    0L

public actual fun OpenDesktopW(lpszdesktop: PCWSTR, dwflags: DESKTOP_CONTROL_FLAGS, finherit: BOOL, dwdesiredaccess: UInt): HDESK =
    0L

public actual fun OpenInputDesktop(dwflags: DESKTOP_CONTROL_FLAGS, finherit: BOOL, dwdesiredaccess: DESKTOP_ACCESS_FLAGS): HDESK =
    0L

public actual fun OpenWindowStationA(lpszwinsta: PCSTR, finherit: BOOL, dwdesiredaccess: UInt): HWINSTA =
    0L

public actual fun OpenWindowStationW(lpszwinsta: PCWSTR, finherit: BOOL, dwdesiredaccess: UInt): HWINSTA =
    0L

public actual fun SetProcessWindowStation(hwinsta: HWINSTA): BOOL =
    0

public actual fun SetThreadDesktop(hdesktop: HDESK): BOOL =
    0

public actual fun SetUserObjectInformationA(hobj: HANDLE, nindex: Int, pvinfo: Long, nlength: UInt): BOOL =
    0

public actual fun SetUserObjectInformationW(hobj: HANDLE, nindex: Int, pvinfo: Long, nlength: UInt): BOOL =
    0

public actual fun SwitchDesktop(hdesktop: HDESK): BOOL =
    0
