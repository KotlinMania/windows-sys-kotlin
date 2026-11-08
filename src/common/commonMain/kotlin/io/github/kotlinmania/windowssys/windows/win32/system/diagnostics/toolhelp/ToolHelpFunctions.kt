package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun CreateToolhelp32Snapshot(dwflags: CREATE_TOOLHELP_SNAPSHOT_FLAGS, th32processid: UInt): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateToolhelp32Snapshot", longArrayOf(dwflags.toLong(), th32processid.toLong()))
}

public fun Heap32First(lphe: Long, th32processid: UInt, th32heapid: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Heap32First", longArrayOf(lphe, th32processid.toLong(), th32heapid.toLong())).toInt()
}

public fun Heap32ListFirst(hsnapshot: HANDLE, lphl: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Heap32ListFirst", longArrayOf(hsnapshot, lphl)).toInt()
}

public fun Heap32ListNext(hsnapshot: HANDLE, lphl: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Heap32ListNext", longArrayOf(hsnapshot, lphl)).toInt()
}

public fun Heap32Next(lphe: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Heap32Next", longArrayOf(lphe)).toInt()
}

public fun Module32First(hsnapshot: HANDLE, lpme: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Module32First", longArrayOf(hsnapshot, lpme)).toInt()
}

public fun Module32FirstW(hsnapshot: HANDLE, lpme: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Module32FirstW", longArrayOf(hsnapshot, lpme)).toInt()
}

public fun Module32Next(hsnapshot: HANDLE, lpme: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Module32Next", longArrayOf(hsnapshot, lpme)).toInt()
}

public fun Module32NextW(hsnapshot: HANDLE, lpme: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Module32NextW", longArrayOf(hsnapshot, lpme)).toInt()
}

public fun Process32First(hsnapshot: HANDLE, lppe: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Process32First", longArrayOf(hsnapshot, lppe)).toInt()
}

public fun Process32FirstW(hsnapshot: HANDLE, lppe: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Process32FirstW", longArrayOf(hsnapshot, lppe)).toInt()
}

public fun Process32Next(hsnapshot: HANDLE, lppe: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Process32Next", longArrayOf(hsnapshot, lppe)).toInt()
}

public fun Process32NextW(hsnapshot: HANDLE, lppe: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Process32NextW", longArrayOf(hsnapshot, lppe)).toInt()
}

public fun Thread32First(hsnapshot: HANDLE, lpte: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Thread32First", longArrayOf(hsnapshot, lpte)).toInt()
}

public fun Thread32Next(hsnapshot: HANDLE, lpte: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Thread32Next", longArrayOf(hsnapshot, lpte)).toInt()
}

public fun Toolhelp32ReadProcessMemory(th32processid: UInt, lpbaseaddress: Long, lpbuffer: Long, cbread: ULong, lpnumberofbytesread: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Toolhelp32ReadProcessMemory", longArrayOf(th32processid.toLong(), lpbaseaddress, lpbuffer, cbread.toLong(), lpnumberofbytesread)).toInt()
}
