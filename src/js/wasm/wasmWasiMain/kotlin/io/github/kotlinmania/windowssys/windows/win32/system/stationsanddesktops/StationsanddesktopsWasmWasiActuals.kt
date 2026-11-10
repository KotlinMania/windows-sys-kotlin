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

public actual fun broadcastSystemMessageA(flags: UInt, lpinfo: COpaquePointer?, msg: UInt, wparam: Wparam, lparam: Lparam): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun broadcastSystemMessageExA(flags: BroadcastSystemMessageFlags, lpinfo: COpaquePointer?, msg: UInt, wparam: Wparam, lparam: Lparam, pbsminfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun broadcastSystemMessageExW(flags: BroadcastSystemMessageFlags, lpinfo: COpaquePointer?, msg: UInt, wparam: Wparam, lparam: Lparam, pbsminfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun broadcastSystemMessageW(flags: BroadcastSystemMessageFlags, lpinfo: COpaquePointer?, msg: UInt, wparam: Wparam, lparam: Lparam): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun closeDesktop(hdesktop: Hdesk): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun closeWindowStation(hwinsta: Hwinsta): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createDesktopA(lpszdesktop: Pcstr, lpszdevice: Pcstr, pdevmode: COpaquePointer?, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: COpaquePointer?): Hdesk =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createDesktopExA(lpszdesktop: Pcstr, lpszdevice: Pcstr, pdevmode: COpaquePointer?, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: COpaquePointer?, ulheapsize: UInt, pvoid: COpaquePointer?): Hdesk =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createDesktopExW(lpszdesktop: Pcwstr, lpszdevice: Pcwstr, pdevmode: COpaquePointer?, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: COpaquePointer?, ulheapsize: UInt, pvoid: COpaquePointer?): Hdesk =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createDesktopW(lpszdesktop: Pcwstr, lpszdevice: Pcwstr, pdevmode: COpaquePointer?, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: COpaquePointer?): Hdesk =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createWindowStationA(lpwinsta: Pcstr, dwflags: UInt, dwdesiredaccess: UInt, lpsa: COpaquePointer?): Hwinsta =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createWindowStationW(lpwinsta: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt, lpsa: COpaquePointer?): Hwinsta =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumDesktopWindows(hdesktop: Hdesk, lpfn: Wndenumproc, lparam: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumDesktopsA(hwinsta: Hwinsta, lpenumfunc: Desktopenumproca, lparam: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumDesktopsW(hwinsta: Hwinsta, lpenumfunc: Desktopenumprocw, lparam: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumWindowStationsA(lpenumfunc: Winstaenumproca, lparam: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumWindowStationsW(lpenumfunc: Winstaenumprocw, lparam: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getProcessWindowStation(): Hwinsta =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThreadDesktop(dwthreadid: UInt): Hdesk =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getUserObjectInformationA(hobj: Handle, nindex: UserObjectInformationIndex, pvinfo: COpaquePointer?, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getUserObjectInformationW(hobj: Handle, nindex: UserObjectInformationIndex, pvinfo: COpaquePointer?, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openDesktopA(lpszdesktop: Pcstr, dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: UInt): Hdesk =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openDesktopW(lpszdesktop: Pcwstr, dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: UInt): Hdesk =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openInputDesktop(dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: DesktopAccessFlags): Hdesk =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openWindowStationA(lpszwinsta: Pcstr, finherit: Bool, dwdesiredaccess: UInt): Hwinsta =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openWindowStationW(lpszwinsta: Pcwstr, finherit: Bool, dwdesiredaccess: UInt): Hwinsta =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setProcessWindowStation(hwinsta: Hwinsta): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setThreadDesktop(hdesktop: Hdesk): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setUserObjectInformationA(hobj: Handle, nindex: Int, pvinfo: COpaquePointer?, nlength: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setUserObjectInformationW(hobj: Handle, nindex: Int, pvinfo: COpaquePointer?, nlength: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun switchDesktop(hdesktop: Hdesk): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
