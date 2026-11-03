package io.github.kotlinmania.windowssys.windows.win32.system.jobobjects

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun AssignProcessToJobObject(hjob: Foundation.HANDLE, hprocess: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "AssignProcessToJobObject", longArrayOf(Win32DynamicFfi.objectSlot(hjob), Win32DynamicFfi.objectSlot(hprocess))).toInt()
}

public fun CreateJobObjectA(lpjobattributes: Long, lpname: PCSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateJobObjectA", longArrayOf(lpjobattributes, lpname))
    return Foundation.HANDLE()
}

public fun CreateJobObjectW(lpjobattributes: Long, lpname: PCWSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateJobObjectW", longArrayOf(lpjobattributes, lpname))
    return Foundation.HANDLE()
}

public fun CreateJobSet(numjob: UInt, userjobset: Long, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateJobSet", longArrayOf(numjob.toLong(), userjobset, flags.toLong())).toInt()
}

public fun FreeMemoryJobObject(buffer: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "FreeMemoryJobObject", longArrayOf(buffer))
}

public fun IsProcessInJob(processhandle: Foundation.HANDLE, jobhandle: Foundation.HANDLE, result: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsProcessInJob", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), Win32DynamicFfi.objectSlot(jobhandle), result)).toInt()
}

public fun OpenJobObjectA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "OpenJobObjectA", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), lpname))
    return Foundation.HANDLE()
}

public fun OpenJobObjectW(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCWSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "OpenJobObjectW", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), lpname))
    return Foundation.HANDLE()
}

public fun QueryInformationJobObject(hjob: Foundation.HANDLE, jobobjectinformationclass: JOBOBJECTINFOCLASS, lpjobobjectinformation: Long, cbjobobjectinformationlength: UInt, lpreturnlength: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryInformationJobObject", longArrayOf(Win32DynamicFfi.objectSlot(hjob), jobobjectinformationclass.toLong(), lpjobobjectinformation, cbjobobjectinformationlength.toLong(), lpreturnlength)).toInt()
}

public fun QueryIoRateControlInformationJobObject(hjob: Foundation.HANDLE, volumename: PCWSTR, infoblocks: Long, infoblockcount: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryIoRateControlInformationJobObject", longArrayOf(Win32DynamicFfi.objectSlot(hjob), volumename, infoblocks, infoblockcount)).toUInt()
}

public fun SetInformationJobObject(hjob: Foundation.HANDLE, jobobjectinformationclass: JOBOBJECTINFOCLASS, lpjobobjectinformation: Long, cbjobobjectinformationlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetInformationJobObject", longArrayOf(Win32DynamicFfi.objectSlot(hjob), jobobjectinformationclass.toLong(), lpjobobjectinformation, cbjobobjectinformationlength.toLong())).toInt()
}

public fun SetIoRateControlInformationJobObject(hjob: Foundation.HANDLE, ioratecontrolinfo: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetIoRateControlInformationJobObject", longArrayOf(Win32DynamicFfi.objectSlot(hjob), ioratecontrolinfo)).toUInt()
}

public fun TerminateJobObject(hjob: Foundation.HANDLE, uexitcode: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "TerminateJobObject", longArrayOf(Win32DynamicFfi.objectSlot(hjob), uexitcode.toLong())).toInt()
}

public fun UserHandleGrantAccess(huserhandle: Foundation.HANDLE, hjob: Foundation.HANDLE, bgrant: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "UserHandleGrantAccess", longArrayOf(Win32DynamicFfi.objectSlot(huserhandle), Win32DynamicFfi.objectSlot(hjob), bgrant.toLong())).toInt()
}
