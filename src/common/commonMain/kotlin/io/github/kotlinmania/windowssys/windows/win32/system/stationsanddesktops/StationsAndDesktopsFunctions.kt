package io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Devmodea
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Devmodew
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Wndenumproc

public expect fun broadcastSystemMessageA(flags: UInt, lpinfo: MutPtr<UInt>, msg: UInt, wparam: Wparam, lparam: Lparam): Int

public expect fun broadcastSystemMessageExA(flags: BroadcastSystemMessageFlags, lpinfo: MutPtr<BroadcastSystemMessageInfo>, msg: UInt, wparam: Wparam, lparam: Lparam, pbsminfo: MutPtr<Bsminfo>): Int

public expect fun broadcastSystemMessageExW(flags: BroadcastSystemMessageFlags, lpinfo: MutPtr<BroadcastSystemMessageInfo>, msg: UInt, wparam: Wparam, lparam: Lparam, pbsminfo: MutPtr<Bsminfo>): Int

public expect fun broadcastSystemMessageW(flags: BroadcastSystemMessageFlags, lpinfo: MutPtr<BroadcastSystemMessageInfo>, msg: UInt, wparam: Wparam, lparam: Lparam): Int

public expect fun closeDesktop(hdesktop: Hdesk): Bool

public expect fun closeWindowStation(hwinsta: Hwinsta): Bool

public expect fun createDesktopA(lpszdesktop: Pcstr, lpszdevice: Pcstr, pdevmode: ConstPtr<Devmodea>, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr<SecurityAttributes>): Hdesk

public expect fun createDesktopExA(lpszdesktop: Pcstr, lpszdevice: Pcstr, pdevmode: ConstPtr<Devmodea>, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr<SecurityAttributes>, ulheapsize: UInt, pvoid: ConstPtr<CVoid>): Hdesk

public expect fun createDesktopExW(lpszdesktop: Pcwstr, lpszdevice: Pcwstr, pdevmode: ConstPtr<Devmodew>, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr<SecurityAttributes>, ulheapsize: UInt, pvoid: ConstPtr<CVoid>): Hdesk

public expect fun createDesktopW(lpszdesktop: Pcwstr, lpszdevice: Pcwstr, pdevmode: ConstPtr<Devmodew>, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr<SecurityAttributes>): Hdesk

public expect fun createWindowStationA(lpwinsta: Pcstr, dwflags: UInt, dwdesiredaccess: UInt, lpsa: ConstPtr<SecurityAttributes>): Hwinsta

public expect fun createWindowStationW(lpwinsta: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt, lpsa: ConstPtr<SecurityAttributes>): Hwinsta

public expect fun enumDesktopWindows(hdesktop: Hdesk, lpfn: Wndenumproc, lparam: Lparam): Bool

public expect fun enumDesktopsA(hwinsta: Hwinsta, lpenumfunc: Desktopenumproca, lparam: Lparam): Bool

public expect fun enumDesktopsW(hwinsta: Hwinsta, lpenumfunc: Desktopenumprocw, lparam: Lparam): Bool

public expect fun enumWindowStationsA(lpenumfunc: Winstaenumproca, lparam: Lparam): Bool

public expect fun enumWindowStationsW(lpenumfunc: Winstaenumprocw, lparam: Lparam): Bool

public expect fun getProcessWindowStation(): Hwinsta

public expect fun getThreadDesktop(dwthreadid: UInt): Hdesk

public expect fun getUserObjectInformationA(hobj: Handle, nindex: UserObjectInformationIndex, pvinfo: MutPtr<CVoid>, nlength: UInt, lpnlengthneeded: MutPtr<UInt>): Bool

public expect fun getUserObjectInformationW(hobj: Handle, nindex: UserObjectInformationIndex, pvinfo: MutPtr<CVoid>, nlength: UInt, lpnlengthneeded: MutPtr<UInt>): Bool

public expect fun openDesktopA(lpszdesktop: Pcstr, dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: UInt): Hdesk

public expect fun openDesktopW(lpszdesktop: Pcwstr, dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: UInt): Hdesk

public expect fun openInputDesktop(dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: DesktopAccessFlags): Hdesk

public expect fun openWindowStationA(lpszwinsta: Pcstr, finherit: Bool, dwdesiredaccess: UInt): Hwinsta

public expect fun openWindowStationW(lpszwinsta: Pcwstr, finherit: Bool, dwdesiredaccess: UInt): Hwinsta

public expect fun setProcessWindowStation(hwinsta: Hwinsta): Bool

public expect fun setThreadDesktop(hdesktop: Hdesk): Bool

public expect fun setUserObjectInformationA(hobj: Handle, nindex: Int, pvinfo: ConstPtr<CVoid>, nlength: UInt): Bool

public expect fun setUserObjectInformationW(hobj: Handle, nindex: Int, pvinfo: ConstPtr<CVoid>, nlength: UInt): Bool

public expect fun switchDesktop(hdesktop: Hdesk): Bool
