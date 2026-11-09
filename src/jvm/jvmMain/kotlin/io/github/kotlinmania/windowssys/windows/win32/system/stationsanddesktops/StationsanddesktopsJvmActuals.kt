@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.WNDENUMPROC

private object WindowsWin32SystemStationsanddesktopsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_BroadcastSystemMessageA(flags: Int, lpinfo: Long, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_BroadcastSystemMessageExA(flags: Int, lpinfo: Long, msg: Int, wparam: Long, lparam: Long, pbsminfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_BroadcastSystemMessageExW(flags: Int, lpinfo: Long, msg: Int, wparam: Long, lparam: Long, pbsminfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_BroadcastSystemMessageW(flags: Int, lpinfo: Long, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_CloseDesktop(hdesktop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_CloseWindowStation(hwinsta: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_CreateDesktopA(lpszdesktop: Long, lpszdevice: Long, pdevmode: Long, dwflags: Int, dwdesiredaccess: Int, lpsa: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_CreateDesktopExA(lpszdesktop: Long, lpszdevice: Long, pdevmode: Long, dwflags: Int, dwdesiredaccess: Int, lpsa: Long, ulheapsize: Int, pvoid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_CreateDesktopExW(lpszdesktop: Long, lpszdevice: Long, pdevmode: Long, dwflags: Int, dwdesiredaccess: Int, lpsa: Long, ulheapsize: Int, pvoid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_CreateDesktopW(lpszdesktop: Long, lpszdevice: Long, pdevmode: Long, dwflags: Int, dwdesiredaccess: Int, lpsa: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_CreateWindowStationA(lpwinsta: Long, dwflags: Int, dwdesiredaccess: Int, lpsa: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_CreateWindowStationW(lpwinsta: Long, dwflags: Int, dwdesiredaccess: Int, lpsa: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_EnumDesktopsA(hwinsta: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_EnumDesktopsW(hwinsta: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_EnumWindowStationsA(lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_EnumWindowStationsW(lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_GetProcessWindowStation(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_GetThreadDesktop(dwthreadid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_GetUserObjectInformationA(hobj: Long, nindex: Int, pvinfo: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_GetUserObjectInformationW(hobj: Long, nindex: Int, pvinfo: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_OpenDesktopA(lpszdesktop: Long, dwflags: Int, finherit: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_OpenDesktopW(lpszdesktop: Long, dwflags: Int, finherit: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_OpenInputDesktop(dwflags: Int, finherit: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_OpenWindowStationA(lpszwinsta: Long, finherit: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_OpenWindowStationW(lpszwinsta: Long, finherit: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_SetProcessWindowStation(hwinsta: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_SetThreadDesktop(hdesktop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_SetUserObjectInformationA(hobj: Long, nindex: Int, pvinfo: Long, nlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_SetUserObjectInformationW(hobj: Long, nindex: Int, pvinfo: Long, nlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_SwitchDesktop(hdesktop: Long): Int
}

public actual fun BroadcastSystemMessageA(flags: UInt, lpinfo: Long, msg: UInt, wparam: WPARAM, lparam: LPARAM): Int =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_BroadcastSystemMessageA(flags.toInt(), lpinfo, msg.toInt(), wparam.toLong(), lparam)

public actual fun BroadcastSystemMessageExA(flags: BROADCAST_SYSTEM_MESSAGE_FLAGS, lpinfo: Long, msg: UInt, wparam: WPARAM, lparam: LPARAM, pbsminfo: Long): Int =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_BroadcastSystemMessageExA(flags.toInt(), lpinfo, msg.toInt(), wparam.toLong(), lparam, pbsminfo)

public actual fun BroadcastSystemMessageExW(flags: BROADCAST_SYSTEM_MESSAGE_FLAGS, lpinfo: Long, msg: UInt, wparam: WPARAM, lparam: LPARAM, pbsminfo: Long): Int =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_BroadcastSystemMessageExW(flags.toInt(), lpinfo, msg.toInt(), wparam.toLong(), lparam, pbsminfo)

public actual fun BroadcastSystemMessageW(flags: BROADCAST_SYSTEM_MESSAGE_FLAGS, lpinfo: Long, msg: UInt, wparam: WPARAM, lparam: LPARAM): Int =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_BroadcastSystemMessageW(flags.toInt(), lpinfo, msg.toInt(), wparam.toLong(), lparam)

public actual fun CloseDesktop(hdesktop: HDESK): BOOL =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_CloseDesktop(hdesktop)

public actual fun CloseWindowStation(hwinsta: HWINSTA): BOOL =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_CloseWindowStation(hwinsta)

public actual fun CreateDesktopA(lpszdesktop: PCSTR, lpszdevice: PCSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long): HDESK =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_CreateDesktopA(lpszdesktop, lpszdevice, pdevmode, dwflags.toInt(), dwdesiredaccess.toInt(), lpsa)

public actual fun CreateDesktopExA(lpszdesktop: PCSTR, lpszdevice: PCSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long, ulheapsize: UInt, pvoid: Long): HDESK =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_CreateDesktopExA(lpszdesktop, lpszdevice, pdevmode, dwflags.toInt(), dwdesiredaccess.toInt(), lpsa, ulheapsize.toInt(), pvoid)

public actual fun CreateDesktopExW(lpszdesktop: PCWSTR, lpszdevice: PCWSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long, ulheapsize: UInt, pvoid: Long): HDESK =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_CreateDesktopExW(lpszdesktop, lpszdevice, pdevmode, dwflags.toInt(), dwdesiredaccess.toInt(), lpsa, ulheapsize.toInt(), pvoid)

public actual fun CreateDesktopW(lpszdesktop: PCWSTR, lpszdevice: PCWSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long): HDESK =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_CreateDesktopW(lpszdesktop, lpszdevice, pdevmode, dwflags.toInt(), dwdesiredaccess.toInt(), lpsa)

public actual fun CreateWindowStationA(lpwinsta: PCSTR, dwflags: UInt, dwdesiredaccess: UInt, lpsa: Long): HWINSTA =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_CreateWindowStationA(lpwinsta, dwflags.toInt(), dwdesiredaccess.toInt(), lpsa)

public actual fun CreateWindowStationW(lpwinsta: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt, lpsa: Long): HWINSTA =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_CreateWindowStationW(lpwinsta, dwflags.toInt(), dwdesiredaccess.toInt(), lpsa)

public actual fun EnumDesktopWindows(hdesktop: HDESK, lpfn: WNDENUMPROC, lparam: LPARAM): BOOL =
    0

public actual fun EnumDesktopsA(hwinsta: HWINSTA, lpenumfunc: DESKTOPENUMPROCA, lparam: LPARAM): BOOL =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_EnumDesktopsA(hwinsta, lpenumfunc.toLong(), lparam)

public actual fun EnumDesktopsW(hwinsta: HWINSTA, lpenumfunc: DESKTOPENUMPROCW, lparam: LPARAM): BOOL =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_EnumDesktopsW(hwinsta, lpenumfunc.toLong(), lparam)

public actual fun EnumWindowStationsA(lpenumfunc: WINSTAENUMPROCA, lparam: LPARAM): BOOL =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_EnumWindowStationsA(lpenumfunc.toLong(), lparam)

public actual fun EnumWindowStationsW(lpenumfunc: WINSTAENUMPROCW, lparam: LPARAM): BOOL =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_EnumWindowStationsW(lpenumfunc.toLong(), lparam)

public actual fun GetProcessWindowStation(): HWINSTA =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_GetProcessWindowStation()

public actual fun GetThreadDesktop(dwthreadid: UInt): HDESK =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_GetThreadDesktop(dwthreadid.toInt())

public actual fun GetUserObjectInformationA(hobj: HANDLE, nindex: USER_OBJECT_INFORMATION_INDEX, pvinfo: Long, nlength: UInt, lpnlengthneeded: Long): BOOL =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_GetUserObjectInformationA(hobj, nindex, pvinfo, nlength.toInt(), lpnlengthneeded)

public actual fun GetUserObjectInformationW(hobj: HANDLE, nindex: USER_OBJECT_INFORMATION_INDEX, pvinfo: Long, nlength: UInt, lpnlengthneeded: Long): BOOL =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_GetUserObjectInformationW(hobj, nindex, pvinfo, nlength.toInt(), lpnlengthneeded)

public actual fun OpenDesktopA(lpszdesktop: PCSTR, dwflags: DESKTOP_CONTROL_FLAGS, finherit: BOOL, dwdesiredaccess: UInt): HDESK =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_OpenDesktopA(lpszdesktop, dwflags.toInt(), finherit, dwdesiredaccess.toInt())

public actual fun OpenDesktopW(lpszdesktop: PCWSTR, dwflags: DESKTOP_CONTROL_FLAGS, finherit: BOOL, dwdesiredaccess: UInt): HDESK =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_OpenDesktopW(lpszdesktop, dwflags.toInt(), finherit, dwdesiredaccess.toInt())

public actual fun OpenInputDesktop(dwflags: DESKTOP_CONTROL_FLAGS, finherit: BOOL, dwdesiredaccess: DESKTOP_ACCESS_FLAGS): HDESK =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_OpenInputDesktop(dwflags.toInt(), finherit, dwdesiredaccess.toInt())

public actual fun OpenWindowStationA(lpszwinsta: PCSTR, finherit: BOOL, dwdesiredaccess: UInt): HWINSTA =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_OpenWindowStationA(lpszwinsta, finherit, dwdesiredaccess.toInt())

public actual fun OpenWindowStationW(lpszwinsta: PCWSTR, finherit: BOOL, dwdesiredaccess: UInt): HWINSTA =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_OpenWindowStationW(lpszwinsta, finherit, dwdesiredaccess.toInt())

public actual fun SetProcessWindowStation(hwinsta: HWINSTA): BOOL =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_SetProcessWindowStation(hwinsta)

public actual fun SetThreadDesktop(hdesktop: HDESK): BOOL =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_SetThreadDesktop(hdesktop)

public actual fun SetUserObjectInformationA(hobj: HANDLE, nindex: Int, pvinfo: Long, nlength: UInt): BOOL =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_SetUserObjectInformationA(hobj, nindex, pvinfo, nlength.toInt())

public actual fun SetUserObjectInformationW(hobj: HANDLE, nindex: Int, pvinfo: Long, nlength: UInt): BOOL =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_SetUserObjectInformationW(hobj, nindex, pvinfo, nlength.toInt())

public actual fun SwitchDesktop(hdesktop: HDESK): BOOL =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_SwitchDesktop(hdesktop)
