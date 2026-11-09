package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public expect fun CreateToolhelp32Snapshot(dwflags: CREATE_TOOLHELP_SNAPSHOT_FLAGS, th32processid: UInt): HANDLE

public expect fun Heap32First(lphe: Long, th32processid: UInt, th32heapid: ULong): BOOL

public expect fun Heap32ListFirst(hsnapshot: HANDLE, lphl: Long): BOOL

public expect fun Heap32ListNext(hsnapshot: HANDLE, lphl: Long): BOOL

public expect fun Heap32Next(lphe: Long): BOOL

public expect fun Module32First(hsnapshot: HANDLE, lpme: Long): BOOL

public expect fun Module32FirstW(hsnapshot: HANDLE, lpme: Long): BOOL

public expect fun Module32Next(hsnapshot: HANDLE, lpme: Long): BOOL

public expect fun Module32NextW(hsnapshot: HANDLE, lpme: Long): BOOL

public expect fun Process32First(hsnapshot: HANDLE, lppe: Long): BOOL

public expect fun Process32FirstW(hsnapshot: HANDLE, lppe: Long): BOOL

public expect fun Process32Next(hsnapshot: HANDLE, lppe: Long): BOOL

public expect fun Process32NextW(hsnapshot: HANDLE, lppe: Long): BOOL

public expect fun Thread32First(hsnapshot: HANDLE, lpte: Long): BOOL

public expect fun Thread32Next(hsnapshot: HANDLE, lpte: Long): BOOL

public expect fun Toolhelp32ReadProcessMemory(th32processid: UInt, lpbaseaddress: Long, lpbuffer: Long, cbread: ULong, lpnumberofbytesread: Long): BOOL
