@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Wndenumproc

private object WindowsWin32SystemStationsanddesktopsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageA(flags: Int, lpinfo: Long, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageExA(flags: Int, lpinfo: Long, msg: Int, wparam: Long, lparam: Long, pbsminfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageExW(flags: Int, lpinfo: Long, msg: Int, wparam: Long, lparam: Long, pbsminfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageW(flags: Int, lpinfo: Long, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_closeDesktop(hdesktop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_closeWindowStation(hwinsta: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_createDesktopA(lpszdesktop: Long, lpszdevice: Long, pdevmode: Long, dwflags: Int, dwdesiredaccess: Int, lpsa: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_createDesktopExA(lpszdesktop: Long, lpszdevice: Long, pdevmode: Long, dwflags: Int, dwdesiredaccess: Int, lpsa: Long, ulheapsize: Int, pvoid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_createDesktopExW(lpszdesktop: Long, lpszdevice: Long, pdevmode: Long, dwflags: Int, dwdesiredaccess: Int, lpsa: Long, ulheapsize: Int, pvoid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_createDesktopW(lpszdesktop: Long, lpszdevice: Long, pdevmode: Long, dwflags: Int, dwdesiredaccess: Int, lpsa: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_createWindowStationA(lpwinsta: Long, dwflags: Int, dwdesiredaccess: Int, lpsa: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_createWindowStationW(lpwinsta: Long, dwflags: Int, dwdesiredaccess: Int, lpsa: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_enumDesktopsA(hwinsta: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_enumDesktopsW(hwinsta: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_enumWindowStationsA(lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_enumWindowStationsW(lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_getProcessWindowStation(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_getThreadDesktop(dwthreadid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_getUserObjectInformationA(hobj: Long, nindex: Int, pvinfo: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_getUserObjectInformationW(hobj: Long, nindex: Int, pvinfo: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_openDesktopA(lpszdesktop: Long, dwflags: Int, finherit: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_openDesktopW(lpszdesktop: Long, dwflags: Int, finherit: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_openInputDesktop(dwflags: Int, finherit: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_openWindowStationA(lpszwinsta: Long, finherit: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_openWindowStationW(lpszwinsta: Long, finherit: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_setProcessWindowStation(hwinsta: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_setThreadDesktop(hdesktop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_setUserObjectInformationA(hobj: Long, nindex: Int, pvinfo: Long, nlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_setUserObjectInformationW(hobj: Long, nindex: Int, pvinfo: Long, nlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_stationsanddesktops_switchDesktop(hdesktop: Long): Int
}

public actual fun broadcastSystemMessageA(flags: UInt, lpinfo: COpaquePointer?, msg: UInt, wparam: Wparam, lparam: Lparam): Int =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageA(flags.toInt(), (lpinfo?.value ?: 0L), msg.toInt(), wparam.toLong(), lparam)

public actual fun broadcastSystemMessageExA(flags: BroadcastSystemMessageFlags, lpinfo: COpaquePointer?, msg: UInt, wparam: Wparam, lparam: Lparam, pbsminfo: COpaquePointer?): Int =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageExA(flags.toInt(), (lpinfo?.value ?: 0L), msg.toInt(), wparam.toLong(), lparam, (pbsminfo?.value ?: 0L))

public actual fun broadcastSystemMessageExW(flags: BroadcastSystemMessageFlags, lpinfo: COpaquePointer?, msg: UInt, wparam: Wparam, lparam: Lparam, pbsminfo: COpaquePointer?): Int =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageExW(flags.toInt(), (lpinfo?.value ?: 0L), msg.toInt(), wparam.toLong(), lparam, (pbsminfo?.value ?: 0L))

public actual fun broadcastSystemMessageW(flags: BroadcastSystemMessageFlags, lpinfo: COpaquePointer?, msg: UInt, wparam: Wparam, lparam: Lparam): Int =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageW(flags.toInt(), (lpinfo?.value ?: 0L), msg.toInt(), wparam.toLong(), lparam)

public actual fun closeDesktop(hdesktop: Hdesk): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_closeDesktop((hdesktop?.value ?: 0L))

public actual fun closeWindowStation(hwinsta: Hwinsta): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_closeWindowStation((hwinsta?.value ?: 0L))

public actual fun createDesktopA(lpszdesktop: Pcstr, lpszdevice: Pcstr, pdevmode: COpaquePointer?, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: COpaquePointer?): Hdesk =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_createDesktopA((lpszdesktop?.value ?: 0L), (lpszdevice?.value ?: 0L), (pdevmode?.value ?: 0L), dwflags.toInt(), dwdesiredaccess.toInt(), (lpsa?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createDesktopExA(lpszdesktop: Pcstr, lpszdevice: Pcstr, pdevmode: COpaquePointer?, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: COpaquePointer?, ulheapsize: UInt, pvoid: COpaquePointer?): Hdesk =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_createDesktopExA((lpszdesktop?.value ?: 0L), (lpszdevice?.value ?: 0L), (pdevmode?.value ?: 0L), dwflags.toInt(), dwdesiredaccess.toInt(), (lpsa?.value ?: 0L), ulheapsize.toInt(), (pvoid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createDesktopExW(lpszdesktop: Pcwstr, lpszdevice: Pcwstr, pdevmode: COpaquePointer?, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: COpaquePointer?, ulheapsize: UInt, pvoid: COpaquePointer?): Hdesk =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_createDesktopExW((lpszdesktop?.value ?: 0L), (lpszdevice?.value ?: 0L), (pdevmode?.value ?: 0L), dwflags.toInt(), dwdesiredaccess.toInt(), (lpsa?.value ?: 0L), ulheapsize.toInt(), (pvoid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createDesktopW(lpszdesktop: Pcwstr, lpszdevice: Pcwstr, pdevmode: COpaquePointer?, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: COpaquePointer?): Hdesk =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_createDesktopW((lpszdesktop?.value ?: 0L), (lpszdevice?.value ?: 0L), (pdevmode?.value ?: 0L), dwflags.toInt(), dwdesiredaccess.toInt(), (lpsa?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createWindowStationA(lpwinsta: Pcstr, dwflags: UInt, dwdesiredaccess: UInt, lpsa: COpaquePointer?): Hwinsta =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_createWindowStationA((lpwinsta?.value ?: 0L), dwflags.toInt(), dwdesiredaccess.toInt(), (lpsa?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createWindowStationW(lpwinsta: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt, lpsa: COpaquePointer?): Hwinsta =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_createWindowStationW((lpwinsta?.value ?: 0L), dwflags.toInt(), dwdesiredaccess.toInt(), (lpsa?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun enumDesktopWindows(hdesktop: Hdesk, lpfn: Wndenumproc, lparam: Lparam): Bool =
    0

public actual fun enumDesktopsA(hwinsta: Hwinsta, lpenumfunc: Desktopenumproca, lparam: Lparam): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_enumDesktopsA((hwinsta?.value ?: 0L), 0L, lparam)

public actual fun enumDesktopsW(hwinsta: Hwinsta, lpenumfunc: Desktopenumprocw, lparam: Lparam): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_enumDesktopsW((hwinsta?.value ?: 0L), 0L, lparam)

public actual fun enumWindowStationsA(lpenumfunc: Winstaenumproca, lparam: Lparam): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_enumWindowStationsA(0L, lparam)

public actual fun enumWindowStationsW(lpenumfunc: Winstaenumprocw, lparam: Lparam): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_enumWindowStationsW(0L, lparam)

public actual fun getProcessWindowStation(): Hwinsta =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_getProcessWindowStation().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getThreadDesktop(dwthreadid: UInt): Hdesk =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_getThreadDesktop(dwthreadid.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getUserObjectInformationA(hobj: Handle, nindex: UserObjectInformationIndex, pvinfo: COpaquePointer?, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_getUserObjectInformationA((hobj?.value ?: 0L), nindex, (pvinfo?.value ?: 0L), nlength.toInt(), (lpnlengthneeded?.value ?: 0L))

public actual fun getUserObjectInformationW(hobj: Handle, nindex: UserObjectInformationIndex, pvinfo: COpaquePointer?, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_getUserObjectInformationW((hobj?.value ?: 0L), nindex, (pvinfo?.value ?: 0L), nlength.toInt(), (lpnlengthneeded?.value ?: 0L))

public actual fun openDesktopA(lpszdesktop: Pcstr, dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: UInt): Hdesk =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_openDesktopA((lpszdesktop?.value ?: 0L), dwflags.toInt(), finherit, dwdesiredaccess.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openDesktopW(lpszdesktop: Pcwstr, dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: UInt): Hdesk =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_openDesktopW((lpszdesktop?.value ?: 0L), dwflags.toInt(), finherit, dwdesiredaccess.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openInputDesktop(dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: DesktopAccessFlags): Hdesk =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_openInputDesktop(dwflags.toInt(), finherit, dwdesiredaccess.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openWindowStationA(lpszwinsta: Pcstr, finherit: Bool, dwdesiredaccess: UInt): Hwinsta =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_openWindowStationA((lpszwinsta?.value ?: 0L), finherit, dwdesiredaccess.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openWindowStationW(lpszwinsta: Pcwstr, finherit: Bool, dwdesiredaccess: UInt): Hwinsta =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_openWindowStationW((lpszwinsta?.value ?: 0L), finherit, dwdesiredaccess.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setProcessWindowStation(hwinsta: Hwinsta): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_setProcessWindowStation((hwinsta?.value ?: 0L))

public actual fun setThreadDesktop(hdesktop: Hdesk): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_setThreadDesktop((hdesktop?.value ?: 0L))

public actual fun setUserObjectInformationA(hobj: Handle, nindex: Int, pvinfo: COpaquePointer?, nlength: UInt): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_setUserObjectInformationA((hobj?.value ?: 0L), nindex, (pvinfo?.value ?: 0L), nlength.toInt())

public actual fun setUserObjectInformationW(hobj: Handle, nindex: Int, pvinfo: COpaquePointer?, nlength: UInt): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_setUserObjectInformationW((hobj?.value ?: 0L), nindex, (pvinfo?.value ?: 0L), nlength.toInt())

public actual fun switchDesktop(hdesktop: Hdesk): Bool =
    WindowsWin32SystemStationsanddesktopsJniBridge.windowssys_windows_win32_system_stationsanddesktops_switchDesktop((hdesktop?.value ?: 0L))
