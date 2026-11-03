package io.github.kotlinmania.windowssys.windows.win32.system.kernel

import io.github.kotlinmania.windowssys.Win32DynamicFfi

public fun RtlFirstEntrySList(listhead: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlFirstEntrySList", longArrayOf(listhead))
}

public fun RtlInitializeSListHead(listhead: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlInitializeSListHead", longArrayOf(listhead))
}

public fun RtlInterlockedFlushSList(listhead: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlInterlockedFlushSList", longArrayOf(listhead))
}

public fun RtlInterlockedPopEntrySList(listhead: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlInterlockedPopEntrySList", longArrayOf(listhead))
}

public fun RtlInterlockedPushEntrySList(listhead: Long, listentry: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlInterlockedPushEntrySList", longArrayOf(listhead, listentry))
}

public fun RtlInterlockedPushListSListEx(listhead: Long, list: Long, listend: Long, count: UInt): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlInterlockedPushListSListEx", longArrayOf(listhead, list, listend, count.toLong()))
}

public fun RtlQueryDepthSList(listhead: Long): UShort {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlQueryDepthSList", longArrayOf(listhead)).toUShort()
}
