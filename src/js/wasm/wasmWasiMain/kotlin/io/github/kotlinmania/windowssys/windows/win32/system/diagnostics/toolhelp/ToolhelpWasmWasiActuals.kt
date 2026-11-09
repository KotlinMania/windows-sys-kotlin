@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public actual fun CreateToolhelp32Snapshot(dwflags: CREATE_TOOLHELP_SNAPSHOT_FLAGS, th32processid: UInt): HANDLE =
    0L

public actual fun Heap32First(lphe: Long, th32processid: UInt, th32heapid: ULong): BOOL =
    0

public actual fun Heap32ListFirst(hsnapshot: HANDLE, lphl: Long): BOOL =
    0

public actual fun Heap32ListNext(hsnapshot: HANDLE, lphl: Long): BOOL =
    0

public actual fun Heap32Next(lphe: Long): BOOL =
    0

public actual fun Module32First(hsnapshot: HANDLE, lpme: Long): BOOL =
    0

public actual fun Module32FirstW(hsnapshot: HANDLE, lpme: Long): BOOL =
    0

public actual fun Module32Next(hsnapshot: HANDLE, lpme: Long): BOOL =
    0

public actual fun Module32NextW(hsnapshot: HANDLE, lpme: Long): BOOL =
    0

public actual fun Process32First(hsnapshot: HANDLE, lppe: Long): BOOL =
    0

public actual fun Process32FirstW(hsnapshot: HANDLE, lppe: Long): BOOL =
    0

public actual fun Process32Next(hsnapshot: HANDLE, lppe: Long): BOOL =
    0

public actual fun Process32NextW(hsnapshot: HANDLE, lppe: Long): BOOL =
    0

public actual fun Thread32First(hsnapshot: HANDLE, lpte: Long): BOOL =
    0

public actual fun Thread32Next(hsnapshot: HANDLE, lpte: Long): BOOL =
    0

public actual fun Toolhelp32ReadProcessMemory(th32processid: UInt, lpbaseaddress: Long, lpbuffer: Long, cbread: ULong, lpnumberofbytesread: Long): BOOL =
    0
