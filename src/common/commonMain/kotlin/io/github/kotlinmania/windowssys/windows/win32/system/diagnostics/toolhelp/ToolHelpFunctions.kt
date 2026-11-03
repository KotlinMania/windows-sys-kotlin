package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL

public fun CreateToolhelp32Snapshot(dwflags: CREATE_TOOLHELP_SNAPSHOT_FLAGS, th32processid: UInt): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateToolhelp32Snapshot", longArrayOf(dwflags.toLong(), th32processid.toLong()))
    return Foundation.HANDLE()
}

public fun Heap32First(lphe: Long, th32processid: UInt, th32heapid: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Heap32First", longArrayOf(lphe, th32processid.toLong(), th32heapid.toLong())).toInt()
}

public fun Heap32ListFirst(hsnapshot: Foundation.HANDLE, lphl: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Heap32ListFirst", longArrayOf(Win32DynamicFfi.objectSlot(hsnapshot), lphl)).toInt()
}

public fun Heap32ListNext(hsnapshot: Foundation.HANDLE, lphl: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Heap32ListNext", longArrayOf(Win32DynamicFfi.objectSlot(hsnapshot), lphl)).toInt()
}

public fun Heap32Next(lphe: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Heap32Next", longArrayOf(lphe)).toInt()
}

public fun Module32First(hsnapshot: Foundation.HANDLE, lpme: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Module32First", longArrayOf(Win32DynamicFfi.objectSlot(hsnapshot), lpme)).toInt()
}

public fun Module32FirstW(hsnapshot: Foundation.HANDLE, lpme: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Module32FirstW", longArrayOf(Win32DynamicFfi.objectSlot(hsnapshot), lpme)).toInt()
}

public fun Module32Next(hsnapshot: Foundation.HANDLE, lpme: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Module32Next", longArrayOf(Win32DynamicFfi.objectSlot(hsnapshot), lpme)).toInt()
}

public fun Module32NextW(hsnapshot: Foundation.HANDLE, lpme: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Module32NextW", longArrayOf(Win32DynamicFfi.objectSlot(hsnapshot), lpme)).toInt()
}

public fun Process32First(hsnapshot: Foundation.HANDLE, lppe: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Process32First", longArrayOf(Win32DynamicFfi.objectSlot(hsnapshot), lppe)).toInt()
}

public fun Process32FirstW(hsnapshot: Foundation.HANDLE, lppe: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Process32FirstW", longArrayOf(Win32DynamicFfi.objectSlot(hsnapshot), lppe)).toInt()
}

public fun Process32Next(hsnapshot: Foundation.HANDLE, lppe: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Process32Next", longArrayOf(Win32DynamicFfi.objectSlot(hsnapshot), lppe)).toInt()
}

public fun Process32NextW(hsnapshot: Foundation.HANDLE, lppe: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Process32NextW", longArrayOf(Win32DynamicFfi.objectSlot(hsnapshot), lppe)).toInt()
}

public fun Thread32First(hsnapshot: Foundation.HANDLE, lpte: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Thread32First", longArrayOf(Win32DynamicFfi.objectSlot(hsnapshot), lpte)).toInt()
}

public fun Thread32Next(hsnapshot: Foundation.HANDLE, lpte: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Thread32Next", longArrayOf(Win32DynamicFfi.objectSlot(hsnapshot), lpte)).toInt()
}

public fun Toolhelp32ReadProcessMemory(th32processid: UInt, lpbaseaddress: Long, lpbuffer: Long, cbread: ULong, lpnumberofbytesread: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Toolhelp32ReadProcessMemory", longArrayOf(th32processid.toLong(), lpbaseaddress, lpbuffer, cbread.toLong(), lpnumberofbytesread)).toInt()
}
