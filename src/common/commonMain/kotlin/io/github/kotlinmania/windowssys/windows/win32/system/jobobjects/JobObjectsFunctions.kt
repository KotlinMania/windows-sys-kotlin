package io.github.kotlinmania.windowssys.windows.win32.system.jobobjects

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun assignProcessToJobObject(hjob: Handle, hprocess: Handle): Bool

public expect fun createJobObjectA(lpjobattributes: ConstPtr, lpname: Pcstr): Handle

public expect fun createJobObjectW(lpjobattributes: ConstPtr, lpname: Pcwstr): Handle

public expect fun createJobSet(numjob: UInt, userjobset: ConstPtr, flags: UInt): Bool

public expect fun freeMemoryJobObject(buffer: ConstPtr)

public expect fun isProcessInJob(processhandle: Handle, jobhandle: Handle, result: MutPtr): Bool

public expect fun openJobObjectA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle

public expect fun openJobObjectW(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcwstr): Handle

public expect fun queryInformationJobObject(hjob: Handle, jobobjectinformationclass: Jobobjectinfoclass, lpjobobjectinformation: MutPtr, cbjobobjectinformationlength: UInt, lpreturnlength: MutPtr): Bool

public expect fun queryIoRateControlInformationJobObject(hjob: Handle, volumename: Pcwstr, infoblocks: MutPtr, infoblockcount: MutPtr): UInt

public expect fun setInformationJobObject(hjob: Handle, jobobjectinformationclass: Jobobjectinfoclass, lpjobobjectinformation: ConstPtr, cbjobobjectinformationlength: UInt): Bool

public expect fun setIoRateControlInformationJobObject(hjob: Handle, ioratecontrolinfo: ConstPtr): UInt

public expect fun terminateJobObject(hjob: Handle, uexitcode: UInt): Bool

public expect fun userHandleGrantAccess(huserhandle: Handle, hjob: Handle, bgrant: Bool): Bool
