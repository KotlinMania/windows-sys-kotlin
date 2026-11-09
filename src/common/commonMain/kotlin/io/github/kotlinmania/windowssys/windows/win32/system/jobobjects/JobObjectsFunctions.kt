package io.github.kotlinmania.windowssys.windows.win32.system.jobobjects

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public expect fun AssignProcessToJobObject(hjob: HANDLE, hprocess: HANDLE): BOOL

public expect fun CreateJobObjectA(lpjobattributes: Long, lpname: PCSTR): HANDLE

public expect fun CreateJobObjectW(lpjobattributes: Long, lpname: PCWSTR): HANDLE

public expect fun CreateJobSet(numjob: UInt, userjobset: Long, flags: UInt): BOOL

public expect fun FreeMemoryJobObject(buffer: Long)

public expect fun IsProcessInJob(processhandle: HANDLE, jobhandle: HANDLE, result: Long): BOOL

public expect fun OpenJobObjectA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): HANDLE

public expect fun OpenJobObjectW(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCWSTR): HANDLE

public expect fun QueryInformationJobObject(hjob: HANDLE, jobobjectinformationclass: JOBOBJECTINFOCLASS, lpjobobjectinformation: Long, cbjobobjectinformationlength: UInt, lpreturnlength: Long): BOOL

public expect fun QueryIoRateControlInformationJobObject(hjob: HANDLE, volumename: PCWSTR, infoblocks: Long, infoblockcount: Long): UInt

public expect fun SetInformationJobObject(hjob: HANDLE, jobobjectinformationclass: JOBOBJECTINFOCLASS, lpjobobjectinformation: Long, cbjobobjectinformationlength: UInt): BOOL

public expect fun SetIoRateControlInformationJobObject(hjob: HANDLE, ioratecontrolinfo: Long): UInt

public expect fun TerminateJobObject(hjob: HANDLE, uexitcode: UInt): BOOL

public expect fun UserHandleGrantAccess(huserhandle: HANDLE, hjob: HANDLE, bgrant: BOOL): BOOL
