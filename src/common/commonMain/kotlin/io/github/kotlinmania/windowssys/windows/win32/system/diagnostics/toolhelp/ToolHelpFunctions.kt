package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun createToolhelp32Snapshot(dwflags: CreateToolhelpSnapshotFlags, th32processid: UInt): Handle

public expect fun heap32First(lphe: MutPtr<Heapentry32>, th32processid: UInt, th32heapid: ULong): Bool

public expect fun heap32ListFirst(hsnapshot: Handle, lphl: MutPtr<Heaplist32>): Bool

public expect fun heap32ListNext(hsnapshot: Handle, lphl: MutPtr<Heaplist32>): Bool

public expect fun heap32Next(lphe: MutPtr<Heapentry32>): Bool

public expect fun module32First(hsnapshot: Handle, lpme: MutPtr<Moduleentry32>): Bool

public expect fun module32FirstW(hsnapshot: Handle, lpme: MutPtr<Moduleentry32w>): Bool

public expect fun module32Next(hsnapshot: Handle, lpme: MutPtr<Moduleentry32>): Bool

public expect fun module32NextW(hsnapshot: Handle, lpme: MutPtr<Moduleentry32w>): Bool

public expect fun process32First(hsnapshot: Handle, lppe: MutPtr<Processentry32>): Bool

public expect fun process32FirstW(hsnapshot: Handle, lppe: MutPtr<Processentry32w>): Bool

public expect fun process32Next(hsnapshot: Handle, lppe: MutPtr<Processentry32>): Bool

public expect fun process32NextW(hsnapshot: Handle, lppe: MutPtr<Processentry32w>): Bool

public expect fun thread32First(hsnapshot: Handle, lpte: MutPtr<Threadentry32>): Bool

public expect fun thread32Next(hsnapshot: Handle, lpte: MutPtr<Threadentry32>): Bool

public expect fun toolhelp32ReadProcessMemory(th32processid: UInt, lpbaseaddress: ConstPtr<CVoid>, lpbuffer: MutPtr<CVoid>, cbread: ULong, lpnumberofbytesread: MutPtr<ULong>): Bool
