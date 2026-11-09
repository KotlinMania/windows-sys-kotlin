package io.github.kotlinmania.windowssys.windows.wdk.system.memory

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public expect fun NtMapViewOfSection(sectionhandle: HANDLE, processhandle: HANDLE, baseaddress: Long, zerobits: ULong, commitsize: ULong, sectionoffset: Long, viewsize: Long, inheritdisposition: SECTION_INHERIT, allocationtype: UInt, win32protect: UInt): NTSTATUS

public expect fun NtOpenSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS

public expect fun NtUnmapViewOfSection(processhandle: HANDLE, baseaddress: Long): NTSTATUS

public expect fun ZwMapViewOfSection(sectionhandle: HANDLE, processhandle: HANDLE, baseaddress: Long, zerobits: ULong, commitsize: ULong, sectionoffset: Long, viewsize: Long, inheritdisposition: SECTION_INHERIT, allocationtype: UInt, win32protect: UInt): NTSTATUS

public expect fun ZwOpenSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS

public expect fun ZwUnmapViewOfSection(processhandle: HANDLE, baseaddress: Long): NTSTATUS
