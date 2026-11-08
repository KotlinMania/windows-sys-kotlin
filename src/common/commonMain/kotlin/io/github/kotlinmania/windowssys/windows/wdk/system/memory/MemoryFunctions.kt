package io.github.kotlinmania.windowssys.windows.wdk.system.memory

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public fun NtMapViewOfSection(sectionhandle: HANDLE, processhandle: HANDLE, baseaddress: Long, zerobits: ULong, commitsize: ULong, sectionoffset: Long, viewsize: Long, inheritdisposition: SECTION_INHERIT, allocationtype: UInt, win32protect: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtMapViewOfSection", longArrayOf(sectionhandle, processhandle, baseaddress, zerobits.toLong(), commitsize.toLong(), sectionoffset, viewsize, inheritdisposition.toLong(), allocationtype.toLong(), win32protect.toLong())).toInt()
}

public fun NtOpenSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtOpenSection", longArrayOf(sectionhandle, desiredaccess.toLong(), objectattributes)).toInt()
}

public fun NtUnmapViewOfSection(processhandle: HANDLE, baseaddress: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtUnmapViewOfSection", longArrayOf(processhandle, baseaddress)).toInt()
}

public fun ZwMapViewOfSection(sectionhandle: HANDLE, processhandle: HANDLE, baseaddress: Long, zerobits: ULong, commitsize: ULong, sectionoffset: Long, viewsize: Long, inheritdisposition: SECTION_INHERIT, allocationtype: UInt, win32protect: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwMapViewOfSection", longArrayOf(sectionhandle, processhandle, baseaddress, zerobits.toLong(), commitsize.toLong(), sectionoffset, viewsize, inheritdisposition.toLong(), allocationtype.toLong(), win32protect.toLong())).toInt()
}

public fun ZwOpenSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenSection", longArrayOf(sectionhandle, desiredaccess.toLong(), objectattributes)).toInt()
}

public fun ZwUnmapViewOfSection(processhandle: HANDLE, baseaddress: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwUnmapViewOfSection", longArrayOf(processhandle, baseaddress)).toInt()
}
