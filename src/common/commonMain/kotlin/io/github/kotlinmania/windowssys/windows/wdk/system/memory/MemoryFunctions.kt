package io.github.kotlinmania.windowssys.windows.wdk.system.memory

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public expect fun ntMapViewOfSection(sectionhandle: Handle, processhandle: Handle, baseaddress: COpaquePointer?, zerobits: ULong, commitsize: ULong, sectionoffset: COpaquePointer?, viewsize: COpaquePointer?, inheritdisposition: SectionInherit, allocationtype: UInt, win32protect: UInt): Ntstatus

public expect fun ntOpenSection(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus

public expect fun ntUnmapViewOfSection(processhandle: Handle, baseaddress: COpaquePointer?): Ntstatus

public expect fun zwMapViewOfSection(sectionhandle: Handle, processhandle: Handle, baseaddress: COpaquePointer?, zerobits: ULong, commitsize: ULong, sectionoffset: COpaquePointer?, viewsize: COpaquePointer?, inheritdisposition: SectionInherit, allocationtype: UInt, win32protect: UInt): Ntstatus

public expect fun zwOpenSection(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus

public expect fun zwUnmapViewOfSection(processhandle: Handle, baseaddress: COpaquePointer?): Ntstatus
