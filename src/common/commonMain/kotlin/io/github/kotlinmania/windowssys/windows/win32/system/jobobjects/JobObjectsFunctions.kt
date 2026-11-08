package io.github.kotlinmania.windowssys.windows.win32.system.jobobjects

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun AssignProcessToJobObject(hjob: HANDLE, hprocess: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "AssignProcessToJobObject", longArrayOf(hjob, hprocess)).toInt()
}

public fun CreateJobObjectA(lpjobattributes: Long, lpname: PCSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateJobObjectA", longArrayOf(lpjobattributes, lpname))
}

public fun CreateJobObjectW(lpjobattributes: Long, lpname: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateJobObjectW", longArrayOf(lpjobattributes, lpname))
}

public fun CreateJobSet(numjob: UInt, userjobset: Long, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateJobSet", longArrayOf(numjob.toLong(), userjobset, flags.toLong())).toInt()
}

public fun FreeMemoryJobObject(buffer: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "FreeMemoryJobObject", longArrayOf(buffer))
}

public fun IsProcessInJob(processhandle: HANDLE, jobhandle: HANDLE, result: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsProcessInJob", longArrayOf(processhandle, jobhandle, result)).toInt()
}

public fun OpenJobObjectA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "OpenJobObjectA", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), lpname))
}

public fun OpenJobObjectW(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "OpenJobObjectW", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), lpname))
}

public fun QueryInformationJobObject(hjob: HANDLE, jobobjectinformationclass: JOBOBJECTINFOCLASS, lpjobobjectinformation: Long, cbjobobjectinformationlength: UInt, lpreturnlength: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryInformationJobObject", longArrayOf(hjob, jobobjectinformationclass.toLong(), lpjobobjectinformation, cbjobobjectinformationlength.toLong(), lpreturnlength)).toInt()
}

public fun QueryIoRateControlInformationJobObject(hjob: HANDLE, volumename: PCWSTR, infoblocks: Long, infoblockcount: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryIoRateControlInformationJobObject", longArrayOf(hjob, volumename, infoblocks, infoblockcount)).toUInt()
}

public fun SetInformationJobObject(hjob: HANDLE, jobobjectinformationclass: JOBOBJECTINFOCLASS, lpjobobjectinformation: Long, cbjobobjectinformationlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetInformationJobObject", longArrayOf(hjob, jobobjectinformationclass.toLong(), lpjobobjectinformation, cbjobobjectinformationlength.toLong())).toInt()
}

public fun SetIoRateControlInformationJobObject(hjob: HANDLE, ioratecontrolinfo: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetIoRateControlInformationJobObject", longArrayOf(hjob, ioratecontrolinfo)).toUInt()
}

public fun TerminateJobObject(hjob: HANDLE, uexitcode: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "TerminateJobObject", longArrayOf(hjob, uexitcode.toLong())).toInt()
}

public fun UserHandleGrantAccess(huserhandle: HANDLE, hjob: HANDLE, bgrant: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "UserHandleGrantAccess", longArrayOf(huserhandle, hjob, bgrant.toLong())).toInt()
}
