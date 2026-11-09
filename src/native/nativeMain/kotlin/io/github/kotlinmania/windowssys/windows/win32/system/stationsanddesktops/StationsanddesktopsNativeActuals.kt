@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.WNDENUMPROC
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun BroadcastSystemMessageA(flags: UInt, lpinfo: Long, msg: UInt, wparam: WPARAM, lparam: LPARAM): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_BroadcastSystemMessageA(flags, lpinfo.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun BroadcastSystemMessageExA(flags: BROADCAST_SYSTEM_MESSAGE_FLAGS, lpinfo: Long, msg: UInt, wparam: WPARAM, lparam: LPARAM, pbsminfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_BroadcastSystemMessageExA(flags, lpinfo.toCPointer<ByteVar>(), msg, wparam, lparam, pbsminfo.toCPointer<ByteVar>())

public actual fun BroadcastSystemMessageExW(flags: BROADCAST_SYSTEM_MESSAGE_FLAGS, lpinfo: Long, msg: UInt, wparam: WPARAM, lparam: LPARAM, pbsminfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_BroadcastSystemMessageExW(flags, lpinfo.toCPointer<ByteVar>(), msg, wparam, lparam, pbsminfo.toCPointer<ByteVar>())

public actual fun BroadcastSystemMessageW(flags: BROADCAST_SYSTEM_MESSAGE_FLAGS, lpinfo: Long, msg: UInt, wparam: WPARAM, lparam: LPARAM): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_BroadcastSystemMessageW(flags, lpinfo.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun CloseDesktop(hdesktop: HDESK): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_CloseDesktop(hdesktop.toCPointer<ByteVar>())

public actual fun CloseWindowStation(hwinsta: HWINSTA): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_CloseWindowStation(hwinsta.toCPointer<ByteVar>())

public actual fun CreateDesktopA(lpszdesktop: PCSTR, lpszdevice: PCSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long): HDESK =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_CreateDesktopA(lpszdesktop.toCPointer<ByteVar>(), lpszdevice.toCPointer<ByteVar>(), pdevmode.toCPointer<ByteVar>(), dwflags, dwdesiredaccess, lpsa.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateDesktopExA(lpszdesktop: PCSTR, lpszdevice: PCSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long, ulheapsize: UInt, pvoid: Long): HDESK =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_CreateDesktopExA(lpszdesktop.toCPointer<ByteVar>(), lpszdevice.toCPointer<ByteVar>(), pdevmode.toCPointer<ByteVar>(), dwflags, dwdesiredaccess, lpsa.toCPointer<ByteVar>(), ulheapsize, pvoid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateDesktopExW(lpszdesktop: PCWSTR, lpszdevice: PCWSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long, ulheapsize: UInt, pvoid: Long): HDESK =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_CreateDesktopExW(lpszdesktop.toCPointer<ByteVar>(), lpszdevice.toCPointer<ByteVar>(), pdevmode.toCPointer<ByteVar>(), dwflags, dwdesiredaccess, lpsa.toCPointer<ByteVar>(), ulheapsize, pvoid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateDesktopW(lpszdesktop: PCWSTR, lpszdevice: PCWSTR, pdevmode: Long, dwflags: DESKTOP_CONTROL_FLAGS, dwdesiredaccess: UInt, lpsa: Long): HDESK =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_CreateDesktopW(lpszdesktop.toCPointer<ByteVar>(), lpszdevice.toCPointer<ByteVar>(), pdevmode.toCPointer<ByteVar>(), dwflags, dwdesiredaccess, lpsa.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateWindowStationA(lpwinsta: PCSTR, dwflags: UInt, dwdesiredaccess: UInt, lpsa: Long): HWINSTA =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_CreateWindowStationA(lpwinsta.toCPointer<ByteVar>(), dwflags, dwdesiredaccess, lpsa.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateWindowStationW(lpwinsta: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt, lpsa: Long): HWINSTA =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_CreateWindowStationW(lpwinsta.toCPointer<ByteVar>(), dwflags, dwdesiredaccess, lpsa.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun EnumDesktopWindows(hdesktop: HDESK, lpfn: WNDENUMPROC, lparam: LPARAM): BOOL =
    0

public actual fun EnumDesktopsA(hwinsta: HWINSTA, lpenumfunc: DESKTOPENUMPROCA, lparam: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_EnumDesktopsA(hwinsta.toCPointer<ByteVar>(), lpenumfunc.toLong().toCPointer<ByteVar>(), lparam)

public actual fun EnumDesktopsW(hwinsta: HWINSTA, lpenumfunc: DESKTOPENUMPROCW, lparam: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_EnumDesktopsW(hwinsta.toCPointer<ByteVar>(), lpenumfunc.toLong().toCPointer<ByteVar>(), lparam)

public actual fun EnumWindowStationsA(lpenumfunc: WINSTAENUMPROCA, lparam: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_EnumWindowStationsA(lpenumfunc.toLong().toCPointer<ByteVar>(), lparam)

public actual fun EnumWindowStationsW(lpenumfunc: WINSTAENUMPROCW, lparam: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_EnumWindowStationsW(lpenumfunc.toLong().toCPointer<ByteVar>(), lparam)

public actual fun GetProcessWindowStation(): HWINSTA =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_GetProcessWindowStation()?.toLong() ?: 0L

public actual fun GetThreadDesktop(dwthreadid: UInt): HDESK =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_GetThreadDesktop(dwthreadid)?.toLong() ?: 0L

public actual fun GetUserObjectInformationA(hobj: HANDLE, nindex: USER_OBJECT_INFORMATION_INDEX, pvinfo: Long, nlength: UInt, lpnlengthneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_GetUserObjectInformationA(hobj.toCPointer<ByteVar>(), nindex, pvinfo.toCPointer<ByteVar>(), nlength, lpnlengthneeded.toCPointer<ByteVar>())

public actual fun GetUserObjectInformationW(hobj: HANDLE, nindex: USER_OBJECT_INFORMATION_INDEX, pvinfo: Long, nlength: UInt, lpnlengthneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_GetUserObjectInformationW(hobj.toCPointer<ByteVar>(), nindex, pvinfo.toCPointer<ByteVar>(), nlength, lpnlengthneeded.toCPointer<ByteVar>())

public actual fun OpenDesktopA(lpszdesktop: PCSTR, dwflags: DESKTOP_CONTROL_FLAGS, finherit: BOOL, dwdesiredaccess: UInt): HDESK =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_OpenDesktopA(lpszdesktop.toCPointer<ByteVar>(), dwflags, finherit, dwdesiredaccess)?.toLong() ?: 0L

public actual fun OpenDesktopW(lpszdesktop: PCWSTR, dwflags: DESKTOP_CONTROL_FLAGS, finherit: BOOL, dwdesiredaccess: UInt): HDESK =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_OpenDesktopW(lpszdesktop.toCPointer<ByteVar>(), dwflags, finherit, dwdesiredaccess)?.toLong() ?: 0L

public actual fun OpenInputDesktop(dwflags: DESKTOP_CONTROL_FLAGS, finherit: BOOL, dwdesiredaccess: DESKTOP_ACCESS_FLAGS): HDESK =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_OpenInputDesktop(dwflags, finherit, dwdesiredaccess)?.toLong() ?: 0L

public actual fun OpenWindowStationA(lpszwinsta: PCSTR, finherit: BOOL, dwdesiredaccess: UInt): HWINSTA =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_OpenWindowStationA(lpszwinsta.toCPointer<ByteVar>(), finherit, dwdesiredaccess)?.toLong() ?: 0L

public actual fun OpenWindowStationW(lpszwinsta: PCWSTR, finherit: BOOL, dwdesiredaccess: UInt): HWINSTA =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_OpenWindowStationW(lpszwinsta.toCPointer<ByteVar>(), finherit, dwdesiredaccess)?.toLong() ?: 0L

public actual fun SetProcessWindowStation(hwinsta: HWINSTA): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_SetProcessWindowStation(hwinsta.toCPointer<ByteVar>())

public actual fun SetThreadDesktop(hdesktop: HDESK): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_SetThreadDesktop(hdesktop.toCPointer<ByteVar>())

public actual fun SetUserObjectInformationA(hobj: HANDLE, nindex: Int, pvinfo: Long, nlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_SetUserObjectInformationA(hobj.toCPointer<ByteVar>(), nindex, pvinfo.toCPointer<ByteVar>(), nlength)

public actual fun SetUserObjectInformationW(hobj: HANDLE, nindex: Int, pvinfo: Long, nlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_SetUserObjectInformationW(hobj.toCPointer<ByteVar>(), nindex, pvinfo.toCPointer<ByteVar>(), nlength)

public actual fun SwitchDesktop(hdesktop: HDESK): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_SwitchDesktop(hdesktop.toCPointer<ByteVar>())
