package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun createToolhelp32Snapshot(dwflags: CreateToolhelpSnapshotFlags, th32processid: UInt): Handle

public expect fun heap32First(lphe: COpaquePointer?, th32processid: UInt, th32heapid: ULong): Bool

public expect fun heap32ListFirst(hsnapshot: Handle, lphl: COpaquePointer?): Bool

public expect fun heap32ListNext(hsnapshot: Handle, lphl: COpaquePointer?): Bool

public expect fun heap32Next(lphe: COpaquePointer?): Bool

public expect fun module32First(hsnapshot: Handle, lpme: COpaquePointer?): Bool

public expect fun module32FirstW(hsnapshot: Handle, lpme: COpaquePointer?): Bool

public expect fun module32Next(hsnapshot: Handle, lpme: COpaquePointer?): Bool

public expect fun module32NextW(hsnapshot: Handle, lpme: COpaquePointer?): Bool

public expect fun process32First(hsnapshot: Handle, lppe: COpaquePointer?): Bool

public expect fun process32FirstW(hsnapshot: Handle, lppe: COpaquePointer?): Bool

public expect fun process32Next(hsnapshot: Handle, lppe: COpaquePointer?): Bool

public expect fun process32NextW(hsnapshot: Handle, lppe: COpaquePointer?): Bool

public expect fun thread32First(hsnapshot: Handle, lpte: COpaquePointer?): Bool

public expect fun thread32Next(hsnapshot: Handle, lpte: COpaquePointer?): Bool

public expect fun toolhelp32ReadProcessMemory(th32processid: UInt, lpbaseaddress: COpaquePointer?, lpbuffer: COpaquePointer?, cbread: ULong, lpnumberofbytesread: COpaquePointer?): Bool
