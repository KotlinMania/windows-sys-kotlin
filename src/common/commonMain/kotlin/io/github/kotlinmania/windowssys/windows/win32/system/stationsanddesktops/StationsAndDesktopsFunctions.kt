package io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.WNDENUMPROC

public expect fun BroadcastSystemMessageA(flags: UInt, lpinfo: Long, msg: UInt, wparam: WPARAM, lparam: LPARAM): Int

public expect fun BroadcastSystemMessageExA(flags: BROADCAST_SYSTEM_MESSAGE_FLAGS, lpinfo: Long, msg: UInt, wparam: WPARAM, lparam: LPARAM, pbsminfo: Long): Int

public expect fun BroadcastSystemMessageExW(flags: BROADCAST_SYSTEM_MESSAGE_FLAGS, lpinfo: Long, msg: UInt, wparam: WPARAM, lparam: LPARAM, pbsminfo: Long): Int

public expect fun BroadcastSystemMessageW(flags: BROADCAST_SYSTEM_MESSAGE_FLAGS, lpinfo: Long, msg: UInt, wparam: WPARAM, lparam: LPARAM): Int

public expect fun CloseDesktop(hdesktop: HDESK): BOOL

public expect fun CloseWindowStation(hwinsta: HWINSTA): BOOL

public expect fun CreateDesktopA(lpszdesktop: PCSTR, lpszdevice: PCSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long): HDESK

public expect fun CreateDesktopExA(lpszdesktop: PCSTR, lpszdevice: PCSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long, ulheapsize: UInt, pvoid: Long): HDESK

public expect fun CreateDesktopExW(lpszdesktop: PCWSTR, lpszdevice: PCWSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long, ulheapsize: UInt, pvoid: Long): HDESK

public expect fun CreateDesktopW(lpszdesktop: PCWSTR, lpszdevice: PCWSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long): HDESK

public expect fun CreateWindowStationA(lpwinsta: PCSTR, dwflags: UInt, dwdesiredaccess: UInt, lpsa: Long): HWINSTA

public expect fun CreateWindowStationW(lpwinsta: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt, lpsa: Long): HWINSTA

public expect fun EnumDesktopWindows(hdesktop: HDESK, lpfn: WNDENUMPROC, lparam: LPARAM): BOOL

public expect fun EnumDesktopsA(hwinsta: HWINSTA, lpenumfunc: DESKTOPENUMPROCA, lparam: LPARAM): BOOL

public expect fun EnumDesktopsW(hwinsta: HWINSTA, lpenumfunc: DESKTOPENUMPROCW, lparam: LPARAM): BOOL

public expect fun EnumWindowStationsA(lpenumfunc: WINSTAENUMPROCA, lparam: LPARAM): BOOL

public expect fun EnumWindowStationsW(lpenumfunc: WINSTAENUMPROCW, lparam: LPARAM): BOOL

public expect fun GetProcessWindowStation(): HWINSTA

public expect fun GetThreadDesktop(dwthreadid: UInt): HDESK

public expect fun GetUserObjectInformationA(hobj: HANDLE, nindex: USER_OBJECT_INFORMATION_INDEX, pvinfo: Long, nlength: UInt, lpnlengthneeded: Long): BOOL

public expect fun GetUserObjectInformationW(hobj: HANDLE, nindex: USER_OBJECT_INFORMATION_INDEX, pvinfo: Long, nlength: UInt, lpnlengthneeded: Long): BOOL

public expect fun OpenDesktopA(lpszdesktop: PCSTR, dwflags: DESKTOP_CONTROL_FLAGS, finherit: BOOL, dwdesiredaccess: UInt): HDESK

public expect fun OpenDesktopW(lpszdesktop: PCWSTR, dwflags: DESKTOP_CONTROL_FLAGS, finherit: BOOL, dwdesiredaccess: UInt): HDESK

public expect fun OpenInputDesktop(dwflags: DESKTOP_CONTROL_FLAGS, finherit: BOOL, dwdesiredaccess: DESKTOP_ACCESS_FLAGS): HDESK

public expect fun OpenWindowStationA(lpszwinsta: PCSTR, finherit: BOOL, dwdesiredaccess: UInt): HWINSTA

public expect fun OpenWindowStationW(lpszwinsta: PCWSTR, finherit: BOOL, dwdesiredaccess: UInt): HWINSTA

public expect fun SetProcessWindowStation(hwinsta: HWINSTA): BOOL

public expect fun SetThreadDesktop(hdesktop: HDESK): BOOL

public expect fun SetUserObjectInformationA(hobj: HANDLE, nindex: Int, pvinfo: Long, nlength: UInt): BOOL

public expect fun SetUserObjectInformationW(hobj: HANDLE, nindex: Int, pvinfo: Long, nlength: UInt): BOOL

public expect fun SwitchDesktop(hdesktop: HDESK): BOOL
