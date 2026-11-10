@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Wndenumproc
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun broadcastSystemMessageA(flags: UInt, lpinfo: COpaquePointer?, msg: UInt, wparam: Wparam, lparam: Lparam): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageA(flags, lpinfo?.value?.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun broadcastSystemMessageExA(flags: BroadcastSystemMessageFlags, lpinfo: COpaquePointer?, msg: UInt, wparam: Wparam, lparam: Lparam, pbsminfo: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageExA(flags, lpinfo?.value?.toCPointer<ByteVar>(), msg, wparam, lparam, pbsminfo?.value?.toCPointer<ByteVar>())

public actual fun broadcastSystemMessageExW(flags: BroadcastSystemMessageFlags, lpinfo: COpaquePointer?, msg: UInt, wparam: Wparam, lparam: Lparam, pbsminfo: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageExW(flags, lpinfo?.value?.toCPointer<ByteVar>(), msg, wparam, lparam, pbsminfo?.value?.toCPointer<ByteVar>())

public actual fun broadcastSystemMessageW(flags: BroadcastSystemMessageFlags, lpinfo: COpaquePointer?, msg: UInt, wparam: Wparam, lparam: Lparam): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageW(flags, lpinfo?.value?.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun closeDesktop(hdesktop: Hdesk): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_closeDesktop(hdesktop?.value?.toCPointer<ByteVar>())

public actual fun closeWindowStation(hwinsta: Hwinsta): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_closeWindowStation(hwinsta?.value?.toCPointer<ByteVar>())

public actual fun createDesktopA(lpszdesktop: Pcstr, lpszdevice: Pcstr, pdevmode: COpaquePointer?, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: COpaquePointer?): Hdesk =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_createDesktopA(lpszdesktop?.value?.toCPointer<ByteVar>(), lpszdevice?.value?.toCPointer<ByteVar>(), pdevmode?.value?.toCPointer<ByteVar>(), dwflags, dwdesiredaccess, lpsa?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createDesktopExA(lpszdesktop: Pcstr, lpszdevice: Pcstr, pdevmode: COpaquePointer?, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: COpaquePointer?, ulheapsize: UInt, pvoid: COpaquePointer?): Hdesk =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_createDesktopExA(lpszdesktop?.value?.toCPointer<ByteVar>(), lpszdevice?.value?.toCPointer<ByteVar>(), pdevmode?.value?.toCPointer<ByteVar>(), dwflags, dwdesiredaccess, lpsa?.value?.toCPointer<ByteVar>(), ulheapsize, pvoid?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createDesktopExW(lpszdesktop: Pcwstr, lpszdevice: Pcwstr, pdevmode: COpaquePointer?, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: COpaquePointer?, ulheapsize: UInt, pvoid: COpaquePointer?): Hdesk =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_createDesktopExW(lpszdesktop?.value?.toCPointer<ByteVar>(), lpszdevice?.value?.toCPointer<ByteVar>(), pdevmode?.value?.toCPointer<ByteVar>(), dwflags, dwdesiredaccess, lpsa?.value?.toCPointer<ByteVar>(), ulheapsize, pvoid?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createDesktopW(lpszdesktop: Pcwstr, lpszdevice: Pcwstr, pdevmode: COpaquePointer?, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: COpaquePointer?): Hdesk =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_createDesktopW(lpszdesktop?.value?.toCPointer<ByteVar>(), lpszdevice?.value?.toCPointer<ByteVar>(), pdevmode?.value?.toCPointer<ByteVar>(), dwflags, dwdesiredaccess, lpsa?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createWindowStationA(lpwinsta: Pcstr, dwflags: UInt, dwdesiredaccess: UInt, lpsa: COpaquePointer?): Hwinsta =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_createWindowStationA(lpwinsta?.value?.toCPointer<ByteVar>(), dwflags, dwdesiredaccess, lpsa?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createWindowStationW(lpwinsta: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt, lpsa: COpaquePointer?): Hwinsta =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_createWindowStationW(lpwinsta?.value?.toCPointer<ByteVar>(), dwflags, dwdesiredaccess, lpsa?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun enumDesktopWindows(hdesktop: Hdesk, lpfn: Wndenumproc, lparam: Lparam): Bool =
    0

public actual fun enumDesktopsA(hwinsta: Hwinsta, lpenumfunc: Desktopenumproca, lparam: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_enumDesktopsA(hwinsta?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumDesktopsW(hwinsta: Hwinsta, lpenumfunc: Desktopenumprocw, lparam: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_enumDesktopsW(hwinsta?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumWindowStationsA(lpenumfunc: Winstaenumproca, lparam: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_enumWindowStationsA(0L.toCPointer<ByteVar>(), lparam)

public actual fun enumWindowStationsW(lpenumfunc: Winstaenumprocw, lparam: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_enumWindowStationsW(0L.toCPointer<ByteVar>(), lparam)

public actual fun getProcessWindowStation(): Hwinsta =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_getProcessWindowStation()?.let { COpaquePointer(it.toLong()) }

public actual fun getThreadDesktop(dwthreadid: UInt): Hdesk =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_getThreadDesktop(dwthreadid)?.let { COpaquePointer(it.toLong()) }

public actual fun getUserObjectInformationA(hobj: Handle, nindex: UserObjectInformationIndex, pvinfo: COpaquePointer?, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_getUserObjectInformationA(hobj?.value?.toCPointer<ByteVar>(), nindex, pvinfo?.value?.toCPointer<ByteVar>(), nlength, lpnlengthneeded?.value?.toCPointer<ByteVar>())

public actual fun getUserObjectInformationW(hobj: Handle, nindex: UserObjectInformationIndex, pvinfo: COpaquePointer?, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_getUserObjectInformationW(hobj?.value?.toCPointer<ByteVar>(), nindex, pvinfo?.value?.toCPointer<ByteVar>(), nlength, lpnlengthneeded?.value?.toCPointer<ByteVar>())

public actual fun openDesktopA(lpszdesktop: Pcstr, dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: UInt): Hdesk =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_openDesktopA(lpszdesktop?.value?.toCPointer<ByteVar>(), dwflags, finherit, dwdesiredaccess)?.let { COpaquePointer(it.toLong()) }

public actual fun openDesktopW(lpszdesktop: Pcwstr, dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: UInt): Hdesk =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_openDesktopW(lpszdesktop?.value?.toCPointer<ByteVar>(), dwflags, finherit, dwdesiredaccess)?.let { COpaquePointer(it.toLong()) }

public actual fun openInputDesktop(dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: DesktopAccessFlags): Hdesk =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_openInputDesktop(dwflags, finherit, dwdesiredaccess)?.let { COpaquePointer(it.toLong()) }

public actual fun openWindowStationA(lpszwinsta: Pcstr, finherit: Bool, dwdesiredaccess: UInt): Hwinsta =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_openWindowStationA(lpszwinsta?.value?.toCPointer<ByteVar>(), finherit, dwdesiredaccess)?.let { COpaquePointer(it.toLong()) }

public actual fun openWindowStationW(lpszwinsta: Pcwstr, finherit: Bool, dwdesiredaccess: UInt): Hwinsta =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_openWindowStationW(lpszwinsta?.value?.toCPointer<ByteVar>(), finherit, dwdesiredaccess)?.let { COpaquePointer(it.toLong()) }

public actual fun setProcessWindowStation(hwinsta: Hwinsta): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_setProcessWindowStation(hwinsta?.value?.toCPointer<ByteVar>())

public actual fun setThreadDesktop(hdesktop: Hdesk): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_setThreadDesktop(hdesktop?.value?.toCPointer<ByteVar>())

public actual fun setUserObjectInformationA(hobj: Handle, nindex: Int, pvinfo: COpaquePointer?, nlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_setUserObjectInformationA(hobj?.value?.toCPointer<ByteVar>(), nindex, pvinfo?.value?.toCPointer<ByteVar>(), nlength)

public actual fun setUserObjectInformationW(hobj: Handle, nindex: Int, pvinfo: COpaquePointer?, nlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_setUserObjectInformationW(hobj?.value?.toCPointer<ByteVar>(), nindex, pvinfo?.value?.toCPointer<ByteVar>(), nlength)

public actual fun switchDesktop(hdesktop: Hdesk): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssys_windows_win32_system_stationsanddesktops_switchDesktop(hdesktop?.value?.toCPointer<ByteVar>())
