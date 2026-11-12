package io.github.kotlinmania.windowssys.windows.win32.system.jobobjects

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes

public expect fun assignProcessToJobObject(hjob: Handle, hprocess: Handle): Bool

public expect fun createJobObjectA(lpjobattributes: ConstPtr<SecurityAttributes>, lpname: Pcstr): Handle

public expect fun createJobObjectW(lpjobattributes: ConstPtr<SecurityAttributes>, lpname: Pcwstr): Handle

public expect fun createJobSet(numjob: UInt, userjobset: ConstPtr<JobSetArray>, flags: UInt): Bool

public expect fun freeMemoryJobObject(buffer: ConstPtr<CVoid>)

public expect fun isProcessInJob(processhandle: Handle, jobhandle: Handle, result: MutPtr<Bool>): Bool

public expect fun openJobObjectA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle

public expect fun openJobObjectW(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcwstr): Handle

public expect fun queryInformationJobObject(hjob: Handle, jobobjectinformationclass: Jobobjectinfoclass, lpjobobjectinformation: MutPtr<CVoid>, cbjobobjectinformationlength: UInt, lpreturnlength: MutPtr<UInt>): Bool

public expect fun queryIoRateControlInformationJobObject(hjob: Handle, volumename: Pcwstr, infoblocks: MutPtr<MutPtr<JobobjectIoRateControlInformation>>, infoblockcount: MutPtr<UInt>): UInt

public expect fun setInformationJobObject(hjob: Handle, jobobjectinformationclass: Jobobjectinfoclass, lpjobobjectinformation: ConstPtr<CVoid>, cbjobobjectinformationlength: UInt): Bool

public expect fun setIoRateControlInformationJobObject(hjob: Handle, ioratecontrolinfo: ConstPtr<JobobjectIoRateControlInformation>): UInt

public expect fun terminateJobObject(hjob: Handle, uexitcode: UInt): Bool

public expect fun userHandleGrantAccess(huserhandle: Handle, hjob: Handle, bgrant: Bool): Bool
