package io.github.kotlinmania.windowssys.windows.wdk.system.memory

import io.github.kotlinmania.windowssys.Win32DynamicFfi

public fun NtMapViewOfSection(sectionhandle: Win32.Foundation.HANDLE, processhandle: Win32.Foundation.HANDLE, baseaddress: Long, zerobits: ULong, commitsize: ULong, sectionoffset: Long, viewsize: Long, inheritdisposition: SECTION_INHERIT, allocationtype: UInt, win32protect: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtMapViewOfSection", longArrayOf(Win32DynamicFfi.objectSlot(sectionhandle), Win32DynamicFfi.objectSlot(processhandle), baseaddress, zerobits.toLong(), commitsize.toLong(), sectionoffset, viewsize, inheritdisposition.toLong(), allocationtype.toLong(), win32protect.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtOpenSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtOpenSection", longArrayOf(sectionhandle, desiredaccess.toLong(), objectattributes))
    return Win32.Foundation.NTSTATUS()
}

public fun NtUnmapViewOfSection(processhandle: Win32.Foundation.HANDLE, baseaddress: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtUnmapViewOfSection", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), baseaddress))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwMapViewOfSection(sectionhandle: Win32.Foundation.HANDLE, processhandle: Win32.Foundation.HANDLE, baseaddress: Long, zerobits: ULong, commitsize: ULong, sectionoffset: Long, viewsize: Long, inheritdisposition: SECTION_INHERIT, allocationtype: UInt, win32protect: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwMapViewOfSection", longArrayOf(Win32DynamicFfi.objectSlot(sectionhandle), Win32DynamicFfi.objectSlot(processhandle), baseaddress, zerobits.toLong(), commitsize.toLong(), sectionoffset, viewsize, inheritdisposition.toLong(), allocationtype.toLong(), win32protect.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwOpenSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenSection", longArrayOf(sectionhandle, desiredaccess.toLong(), objectattributes))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwUnmapViewOfSection(processhandle: Win32.Foundation.HANDLE, baseaddress: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwUnmapViewOfSection", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), baseaddress))
    return Win32.Foundation.NTSTATUS()
}
