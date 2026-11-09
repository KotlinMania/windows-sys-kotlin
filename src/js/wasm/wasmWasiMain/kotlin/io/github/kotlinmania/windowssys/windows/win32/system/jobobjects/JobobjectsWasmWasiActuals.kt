@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.jobobjects

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public actual fun AssignProcessToJobObject(hjob: HANDLE, hprocess: HANDLE): BOOL =
    0

public actual fun CreateJobObjectA(lpjobattributes: Long, lpname: PCSTR): HANDLE =
    0L

public actual fun CreateJobObjectW(lpjobattributes: Long, lpname: PCWSTR): HANDLE =
    0L

public actual fun CreateJobSet(numjob: UInt, userjobset: Long, flags: UInt): BOOL =
    0

public actual fun FreeMemoryJobObject(buffer: Long) {
}

public actual fun IsProcessInJob(processhandle: HANDLE, jobhandle: HANDLE, result: Long): BOOL =
    0

public actual fun OpenJobObjectA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): HANDLE =
    0L

public actual fun OpenJobObjectW(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCWSTR): HANDLE =
    0L

public actual fun QueryInformationJobObject(hjob: HANDLE, jobobjectinformationclass: JOBOBJECTINFOCLASS, lpjobobjectinformation: Long, cbjobobjectinformationlength: UInt, lpreturnlength: Long): BOOL =
    0

public actual fun QueryIoRateControlInformationJobObject(hjob: HANDLE, volumename: PCWSTR, infoblocks: Long, infoblockcount: Long): UInt =
    0u

public actual fun SetInformationJobObject(hjob: HANDLE, jobobjectinformationclass: JOBOBJECTINFOCLASS, lpjobobjectinformation: Long, cbjobobjectinformationlength: UInt): BOOL =
    0

public actual fun SetIoRateControlInformationJobObject(hjob: HANDLE, ioratecontrolinfo: Long): UInt =
    0u

public actual fun TerminateJobObject(hjob: HANDLE, uexitcode: UInt): BOOL =
    0

public actual fun UserHandleGrantAccess(huserhandle: HANDLE, hjob: HANDLE, bgrant: BOOL): BOOL =
    0
