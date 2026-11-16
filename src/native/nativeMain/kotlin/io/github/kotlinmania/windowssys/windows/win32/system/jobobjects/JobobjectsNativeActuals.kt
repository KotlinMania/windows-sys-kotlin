@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.jobobjects

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssysWindowsWin32SystemJobobjectsAssignProcessToJobObject
import io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssysWindowsWin32SystemJobobjectsCreateJobObjectA
import io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssysWindowsWin32SystemJobobjectsCreateJobObjectW
import io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssysWindowsWin32SystemJobobjectsCreateJobSet
import io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssysWindowsWin32SystemJobobjectsFreeMemoryJobObject
import io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssysWindowsWin32SystemJobobjectsIsProcessInJob
import io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssysWindowsWin32SystemJobobjectsOpenJobObjectA
import io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssysWindowsWin32SystemJobobjectsOpenJobObjectW
import io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssysWindowsWin32SystemJobobjectsQueryInformationJobObject
import io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssysWindowsWin32SystemJobobjectsQueryIoRateControlInformationJobObject
import io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssysWindowsWin32SystemJobobjectsSetInformationJobObject
import io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssysWindowsWin32SystemJobobjectsSetIoRateControlInformationJobObject
import io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssysWindowsWin32SystemJobobjectsTerminateJobObject
import io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssysWindowsWin32SystemJobobjectsUserHandleGrantAccess
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun assignProcessToJobObject(hjob: Handle, hprocess: Handle): Bool =
    windowssysWindowsWin32SystemJobobjectsAssignProcessToJobObject(hjob.rawAddress.toCPointer<ByteVar>(), hprocess.rawAddress.toCPointer<ByteVar>())

public actual fun createJobObjectA(lpjobattributes: ConstPtr, lpname: Pcstr): Handle =
    MutPtr(windowssysWindowsWin32SystemJobobjectsCreateJobObjectA(lpjobattributes.rawAddress.toCPointer<ByteVar>(), lpname.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun createJobObjectW(lpjobattributes: ConstPtr, lpname: Pcwstr): Handle =
    MutPtr(windowssysWindowsWin32SystemJobobjectsCreateJobObjectW(lpjobattributes.rawAddress.toCPointer<ByteVar>(), lpname.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun createJobSet(numjob: UInt, userjobset: ConstPtr, flags: UInt): Bool =
    windowssysWindowsWin32SystemJobobjectsCreateJobSet(numjob, userjobset.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun freeMemoryJobObject(buffer: ConstPtr) {
    windowssysWindowsWin32SystemJobobjectsFreeMemoryJobObject(buffer.rawAddress.toCPointer<ByteVar>())
}

public actual fun isProcessInJob(processhandle: Handle, jobhandle: Handle, result: MutPtr): Bool =
    windowssysWindowsWin32SystemJobobjectsIsProcessInJob(processhandle.rawAddress.toCPointer<ByteVar>(), jobhandle.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())

public actual fun openJobObjectA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    MutPtr(windowssysWindowsWin32SystemJobobjectsOpenJobObjectA(dwdesiredaccess, binherithandle, lpname.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun openJobObjectW(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcwstr): Handle =
    MutPtr(windowssysWindowsWin32SystemJobobjectsOpenJobObjectW(dwdesiredaccess, binherithandle, lpname.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun queryInformationJobObject(hjob: Handle, jobobjectinformationclass: Jobobjectinfoclass, lpjobobjectinformation: MutPtr, cbjobobjectinformationlength: UInt, lpreturnlength: MutPtr): Bool =
    windowssysWindowsWin32SystemJobobjectsQueryInformationJobObject(hjob.rawAddress.toCPointer<ByteVar>(), jobobjectinformationclass, lpjobobjectinformation.rawAddress.toCPointer<ByteVar>(), cbjobobjectinformationlength, lpreturnlength.rawAddress.toCPointer<ByteVar>())

public actual fun queryIoRateControlInformationJobObject(hjob: Handle, volumename: Pcwstr, infoblocks: MutPtr, infoblockcount: MutPtr): UInt =
    windowssysWindowsWin32SystemJobobjectsQueryIoRateControlInformationJobObject(hjob.rawAddress.toCPointer<ByteVar>(), volumename.rawAddress.toCPointer<ByteVar>(), infoblocks.rawAddress.toCPointer<ByteVar>(), infoblockcount.rawAddress.toCPointer<ByteVar>())

public actual fun setInformationJobObject(hjob: Handle, jobobjectinformationclass: Jobobjectinfoclass, lpjobobjectinformation: ConstPtr, cbjobobjectinformationlength: UInt): Bool =
    windowssysWindowsWin32SystemJobobjectsSetInformationJobObject(hjob.rawAddress.toCPointer<ByteVar>(), jobobjectinformationclass, lpjobobjectinformation.rawAddress.toCPointer<ByteVar>(), cbjobobjectinformationlength)

public actual fun setIoRateControlInformationJobObject(hjob: Handle, ioratecontrolinfo: ConstPtr): UInt =
    windowssysWindowsWin32SystemJobobjectsSetIoRateControlInformationJobObject(hjob.rawAddress.toCPointer<ByteVar>(), ioratecontrolinfo.rawAddress.toCPointer<ByteVar>())

public actual fun terminateJobObject(hjob: Handle, uexitcode: UInt): Bool =
    windowssysWindowsWin32SystemJobobjectsTerminateJobObject(hjob.rawAddress.toCPointer<ByteVar>(), uexitcode)

public actual fun userHandleGrantAccess(huserhandle: Handle, hjob: Handle, bgrant: Bool): Bool =
    windowssysWindowsWin32SystemJobobjectsUserHandleGrantAccess(huserhandle.rawAddress.toCPointer<ByteVar>(), hjob.rawAddress.toCPointer<ByteVar>(), bgrant)
