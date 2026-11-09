@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.memory

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public actual fun NtMapViewOfSection(sectionhandle: HANDLE, processhandle: HANDLE, baseaddress: Long, zerobits: ULong, commitsize: ULong, sectionoffset: Long, viewsize: Long, inheritdisposition: SECTION_INHERIT, allocationtype: UInt, win32protect: UInt): NTSTATUS =
    0

public actual fun NtOpenSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    0

public actual fun NtUnmapViewOfSection(processhandle: HANDLE, baseaddress: Long): NTSTATUS =
    0

public actual fun ZwMapViewOfSection(sectionhandle: HANDLE, processhandle: HANDLE, baseaddress: Long, zerobits: ULong, commitsize: ULong, sectionoffset: Long, viewsize: Long, inheritdisposition: SECTION_INHERIT, allocationtype: UInt, win32protect: UInt): NTSTATUS =
    0

public actual fun ZwOpenSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    0

public actual fun ZwUnmapViewOfSection(processhandle: HANDLE, baseaddress: Long): NTSTATUS =
    0
