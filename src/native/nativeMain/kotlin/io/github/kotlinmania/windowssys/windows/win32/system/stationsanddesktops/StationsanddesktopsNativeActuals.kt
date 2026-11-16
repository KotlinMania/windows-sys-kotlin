@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageA
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExA
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExW
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageW
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsCloseDesktop
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsCloseWindowStation
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopA
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExA
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExW
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopW
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationA
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationW
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsA
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsW
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsA
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsW
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsGetProcessWindowStation
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsGetThreadDesktop
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationA
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationW
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopA
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopW
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsOpenInputDesktop
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationA
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationW
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsSetProcessWindowStation
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsSetThreadDesktop
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationA
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationW
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.cinterop.windowssysWindowsWin32SystemStationsanddesktopsSwitchDesktop
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Wndenumproc
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun broadcastSystemMessageA(flags: UInt, lpinfo: MutPtr, msg: UInt, wparam: Wparam, lparam: Lparam): Int =
    windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageA(flags, lpinfo.rawAddress.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun broadcastSystemMessageExA(flags: BroadcastSystemMessageFlags, lpinfo: MutPtr, msg: UInt, wparam: Wparam, lparam: Lparam, pbsminfo: MutPtr): Int =
    windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExA(flags, lpinfo.rawAddress.toCPointer<ByteVar>(), msg, wparam, lparam, pbsminfo.rawAddress.toCPointer<ByteVar>())

public actual fun broadcastSystemMessageExW(flags: BroadcastSystemMessageFlags, lpinfo: MutPtr, msg: UInt, wparam: Wparam, lparam: Lparam, pbsminfo: MutPtr): Int =
    windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExW(flags, lpinfo.rawAddress.toCPointer<ByteVar>(), msg, wparam, lparam, pbsminfo.rawAddress.toCPointer<ByteVar>())

public actual fun broadcastSystemMessageW(flags: BroadcastSystemMessageFlags, lpinfo: MutPtr, msg: UInt, wparam: Wparam, lparam: Lparam): Int =
    windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageW(flags, lpinfo.rawAddress.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun closeDesktop(hdesktop: Hdesk): Bool =
    windowssysWindowsWin32SystemStationsanddesktopsCloseDesktop(hdesktop.rawAddress.toCPointer<ByteVar>())

public actual fun closeWindowStation(hwinsta: Hwinsta): Bool =
    windowssysWindowsWin32SystemStationsanddesktopsCloseWindowStation(hwinsta.rawAddress.toCPointer<ByteVar>())

public actual fun createDesktopA(lpszdesktop: Pcstr, lpszdevice: Pcstr, pdevmode: ConstPtr, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr): Hdesk =
    MutPtr(windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopA(lpszdesktop.rawAddress.toCPointer<ByteVar>(), lpszdevice.rawAddress.toCPointer<ByteVar>(), pdevmode.rawAddress.toCPointer<ByteVar>(), dwflags, dwdesiredaccess, lpsa.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun createDesktopExA(lpszdesktop: Pcstr, lpszdevice: Pcstr, pdevmode: ConstPtr, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr, ulheapsize: UInt, pvoid: ConstPtr): Hdesk =
    MutPtr(windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExA(lpszdesktop.rawAddress.toCPointer<ByteVar>(), lpszdevice.rawAddress.toCPointer<ByteVar>(), pdevmode.rawAddress.toCPointer<ByteVar>(), dwflags, dwdesiredaccess, lpsa.rawAddress.toCPointer<ByteVar>(), ulheapsize, pvoid.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun createDesktopExW(lpszdesktop: Pcwstr, lpszdevice: Pcwstr, pdevmode: ConstPtr, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr, ulheapsize: UInt, pvoid: ConstPtr): Hdesk =
    MutPtr(windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExW(lpszdesktop.rawAddress.toCPointer<ByteVar>(), lpszdevice.rawAddress.toCPointer<ByteVar>(), pdevmode.rawAddress.toCPointer<ByteVar>(), dwflags, dwdesiredaccess, lpsa.rawAddress.toCPointer<ByteVar>(), ulheapsize, pvoid.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun createDesktopW(lpszdesktop: Pcwstr, lpszdevice: Pcwstr, pdevmode: ConstPtr, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr): Hdesk =
    MutPtr(windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopW(lpszdesktop.rawAddress.toCPointer<ByteVar>(), lpszdevice.rawAddress.toCPointer<ByteVar>(), pdevmode.rawAddress.toCPointer<ByteVar>(), dwflags, dwdesiredaccess, lpsa.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun createWindowStationA(lpwinsta: Pcstr, dwflags: UInt, dwdesiredaccess: UInt, lpsa: ConstPtr): Hwinsta =
    MutPtr(windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationA(lpwinsta.rawAddress.toCPointer<ByteVar>(), dwflags, dwdesiredaccess, lpsa.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun createWindowStationW(lpwinsta: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt, lpsa: ConstPtr): Hwinsta =
    MutPtr(windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationW(lpwinsta.rawAddress.toCPointer<ByteVar>(), dwflags, dwdesiredaccess, lpsa.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun enumDesktopWindows(hdesktop: Hdesk, lpfn: Wndenumproc, lparam: Lparam): Bool =
    0

public actual fun enumDesktopsA(hwinsta: Hwinsta, lpenumfunc: Desktopenumproca, lparam: Lparam): Bool =
    windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsA(hwinsta.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumDesktopsW(hwinsta: Hwinsta, lpenumfunc: Desktopenumprocw, lparam: Lparam): Bool =
    windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsW(hwinsta.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumWindowStationsA(lpenumfunc: Winstaenumproca, lparam: Lparam): Bool =
    windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsA(0L.toCPointer<ByteVar>(), lparam)

public actual fun enumWindowStationsW(lpenumfunc: Winstaenumprocw, lparam: Lparam): Bool =
    windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsW(0L.toCPointer<ByteVar>(), lparam)

public actual fun getProcessWindowStation(): Hwinsta =
    MutPtr(windowssysWindowsWin32SystemStationsanddesktopsGetProcessWindowStation()?.toLong() ?: 0L)

public actual fun getThreadDesktop(dwthreadid: UInt): Hdesk =
    MutPtr(windowssysWindowsWin32SystemStationsanddesktopsGetThreadDesktop(dwthreadid)?.toLong() ?: 0L)

public actual fun getUserObjectInformationA(hobj: Handle, nindex: UserObjectInformationIndex, pvinfo: MutPtr, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationA(hobj.rawAddress.toCPointer<ByteVar>(), nindex, pvinfo.rawAddress.toCPointer<ByteVar>(), nlength, lpnlengthneeded.rawAddress.toCPointer<ByteVar>())

public actual fun getUserObjectInformationW(hobj: Handle, nindex: UserObjectInformationIndex, pvinfo: MutPtr, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationW(hobj.rawAddress.toCPointer<ByteVar>(), nindex, pvinfo.rawAddress.toCPointer<ByteVar>(), nlength, lpnlengthneeded.rawAddress.toCPointer<ByteVar>())

public actual fun openDesktopA(lpszdesktop: Pcstr, dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: UInt): Hdesk =
    MutPtr(windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopA(lpszdesktop.rawAddress.toCPointer<ByteVar>(), dwflags, finherit, dwdesiredaccess)?.toLong() ?: 0L)

public actual fun openDesktopW(lpszdesktop: Pcwstr, dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: UInt): Hdesk =
    MutPtr(windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopW(lpszdesktop.rawAddress.toCPointer<ByteVar>(), dwflags, finherit, dwdesiredaccess)?.toLong() ?: 0L)

public actual fun openInputDesktop(dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: DesktopAccessFlags): Hdesk =
    MutPtr(windowssysWindowsWin32SystemStationsanddesktopsOpenInputDesktop(dwflags, finherit, dwdesiredaccess)?.toLong() ?: 0L)

public actual fun openWindowStationA(lpszwinsta: Pcstr, finherit: Bool, dwdesiredaccess: UInt): Hwinsta =
    MutPtr(windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationA(lpszwinsta.rawAddress.toCPointer<ByteVar>(), finherit, dwdesiredaccess)?.toLong() ?: 0L)

public actual fun openWindowStationW(lpszwinsta: Pcwstr, finherit: Bool, dwdesiredaccess: UInt): Hwinsta =
    MutPtr(windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationW(lpszwinsta.rawAddress.toCPointer<ByteVar>(), finherit, dwdesiredaccess)?.toLong() ?: 0L)

public actual fun setProcessWindowStation(hwinsta: Hwinsta): Bool =
    windowssysWindowsWin32SystemStationsanddesktopsSetProcessWindowStation(hwinsta.rawAddress.toCPointer<ByteVar>())

public actual fun setThreadDesktop(hdesktop: Hdesk): Bool =
    windowssysWindowsWin32SystemStationsanddesktopsSetThreadDesktop(hdesktop.rawAddress.toCPointer<ByteVar>())

public actual fun setUserObjectInformationA(hobj: Handle, nindex: Int, pvinfo: ConstPtr, nlength: UInt): Bool =
    windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationA(hobj.rawAddress.toCPointer<ByteVar>(), nindex, pvinfo.rawAddress.toCPointer<ByteVar>(), nlength)

public actual fun setUserObjectInformationW(hobj: Handle, nindex: Int, pvinfo: ConstPtr, nlength: UInt): Bool =
    windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationW(hobj.rawAddress.toCPointer<ByteVar>(), nindex, pvinfo.rawAddress.toCPointer<ByteVar>(), nlength)

public actual fun switchDesktop(hdesktop: Hdesk): Bool =
    windowssysWindowsWin32SystemStationsanddesktopsSwitchDesktop(hdesktop.rawAddress.toCPointer<ByteVar>())
