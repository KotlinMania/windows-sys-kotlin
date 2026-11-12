@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Wndenumproc

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun broadcastSystemMessageA(flags: UInt, lpinfo: MutPtr, msg: UInt, wparam: Wparam, lparam: Lparam): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageA")

public actual fun broadcastSystemMessageExA(flags: BroadcastSystemMessageFlags, lpinfo: MutPtr, msg: UInt, wparam: Wparam, lparam: Lparam, pbsminfo: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExA")

public actual fun broadcastSystemMessageExW(flags: BroadcastSystemMessageFlags, lpinfo: MutPtr, msg: UInt, wparam: Wparam, lparam: Lparam, pbsminfo: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExW")

public actual fun broadcastSystemMessageW(flags: BroadcastSystemMessageFlags, lpinfo: MutPtr, msg: UInt, wparam: Wparam, lparam: Lparam): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageW")

public actual fun closeDesktop(hdesktop: Hdesk): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsCloseDesktop")

public actual fun closeWindowStation(hwinsta: Hwinsta): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsCloseWindowStation")

public actual fun createDesktopA(lpszdesktop: Pcstr, lpszdevice: Pcstr, pdevmode: ConstPtr, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr): Hdesk =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopA")

public actual fun createDesktopExA(lpszdesktop: Pcstr, lpszdevice: Pcstr, pdevmode: ConstPtr, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr, ulheapsize: UInt, pvoid: ConstPtr): Hdesk =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExA")

public actual fun createDesktopExW(lpszdesktop: Pcwstr, lpszdevice: Pcwstr, pdevmode: ConstPtr, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr, ulheapsize: UInt, pvoid: ConstPtr): Hdesk =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExW")

public actual fun createDesktopW(lpszdesktop: Pcwstr, lpszdevice: Pcwstr, pdevmode: ConstPtr, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr): Hdesk =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopW")

public actual fun createWindowStationA(lpwinsta: Pcstr, dwflags: UInt, dwdesiredaccess: UInt, lpsa: ConstPtr): Hwinsta =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationA")

public actual fun createWindowStationW(lpwinsta: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt, lpsa: ConstPtr): Hwinsta =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationW")

public actual fun enumDesktopWindows(hdesktop: Hdesk, lpfn: Wndenumproc, lparam: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopWindows")

public actual fun enumDesktopsA(hwinsta: Hwinsta, lpenumfunc: Desktopenumproca, lparam: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsA")

public actual fun enumDesktopsW(hwinsta: Hwinsta, lpenumfunc: Desktopenumprocw, lparam: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsW")

public actual fun enumWindowStationsA(lpenumfunc: Winstaenumproca, lparam: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsA")

public actual fun enumWindowStationsW(lpenumfunc: Winstaenumprocw, lparam: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsW")

public actual fun getProcessWindowStation(): Hwinsta =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsGetProcessWindowStation")

public actual fun getThreadDesktop(dwthreadid: UInt): Hdesk =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsGetThreadDesktop")

public actual fun getUserObjectInformationA(hobj: Handle, nindex: UserObjectInformationIndex, pvinfo: MutPtr, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationA")

public actual fun getUserObjectInformationW(hobj: Handle, nindex: UserObjectInformationIndex, pvinfo: MutPtr, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationW")

public actual fun openDesktopA(lpszdesktop: Pcstr, dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: UInt): Hdesk =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopA")

public actual fun openDesktopW(lpszdesktop: Pcwstr, dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: UInt): Hdesk =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopW")

public actual fun openInputDesktop(dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: DesktopAccessFlags): Hdesk =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsOpenInputDesktop")

public actual fun openWindowStationA(lpszwinsta: Pcstr, finherit: Bool, dwdesiredaccess: UInt): Hwinsta =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationA")

public actual fun openWindowStationW(lpszwinsta: Pcwstr, finherit: Bool, dwdesiredaccess: UInt): Hwinsta =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationW")

public actual fun setProcessWindowStation(hwinsta: Hwinsta): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsSetProcessWindowStation")

public actual fun setThreadDesktop(hdesktop: Hdesk): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsSetThreadDesktop")

public actual fun setUserObjectInformationA(hobj: Handle, nindex: Int, pvinfo: ConstPtr, nlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationA")

public actual fun setUserObjectInformationW(hobj: Handle, nindex: Int, pvinfo: ConstPtr, nlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationW")

public actual fun switchDesktop(hdesktop: Hdesk): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemStationsanddesktopsSwitchDesktop")
