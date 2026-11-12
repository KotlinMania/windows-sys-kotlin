@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.jobobjects

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemJobobjectsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemJobobjectsAssignProcessToJobObject(hjob: Long, hprocess: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJobobjectsCreateJobObjectA(lpjobattributes: Long, lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemJobobjectsCreateJobObjectW(lpjobattributes: Long, lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemJobobjectsCreateJobSet(numjob: Int, userjobset: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJobobjectsFreeMemoryJobObject(buffer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemJobobjectsIsProcessInJob(processhandle: Long, jobhandle: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJobobjectsOpenJobObjectA(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemJobobjectsOpenJobObjectW(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemJobobjectsQueryInformationJobObject(hjob: Long, jobobjectinformationclass: Int, lpjobobjectinformation: Long, cbjobobjectinformationlength: Int, lpreturnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJobobjectsQueryIoRateControlInformationJobObject(hjob: Long, volumename: Long, infoblocks: Long, infoblockcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJobobjectsSetInformationJobObject(hjob: Long, jobobjectinformationclass: Int, lpjobobjectinformation: Long, cbjobobjectinformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJobobjectsSetIoRateControlInformationJobObject(hjob: Long, ioratecontrolinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJobobjectsTerminateJobObject(hjob: Long, uexitcode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemJobobjectsUserHandleGrantAccess(huserhandle: Long, hjob: Long, bgrant: Int): Int
}

public actual fun assignProcessToJobObject(hjob: Handle, hprocess: Handle): Bool =
    WindowsWin32SystemJobobjectsJniBridge.windowssysWindowsWin32SystemJobobjectsAssignProcessToJobObject(hjob.rawAddress, hprocess.rawAddress)

public actual fun createJobObjectA(lpjobattributes: ConstPtr, lpname: Pcstr): Handle =
    MutPtr(WindowsWin32SystemJobobjectsJniBridge.windowssysWindowsWin32SystemJobobjectsCreateJobObjectA(lpjobattributes.rawAddress, lpname.rawAddress))

public actual fun createJobObjectW(lpjobattributes: ConstPtr, lpname: Pcwstr): Handle =
    MutPtr(WindowsWin32SystemJobobjectsJniBridge.windowssysWindowsWin32SystemJobobjectsCreateJobObjectW(lpjobattributes.rawAddress, lpname.rawAddress))

public actual fun createJobSet(numjob: UInt, userjobset: ConstPtr, flags: UInt): Bool =
    WindowsWin32SystemJobobjectsJniBridge.windowssysWindowsWin32SystemJobobjectsCreateJobSet(numjob.toInt(), userjobset.rawAddress, flags.toInt())

public actual fun freeMemoryJobObject(buffer: ConstPtr) {
    WindowsWin32SystemJobobjectsJniBridge.windowssysWindowsWin32SystemJobobjectsFreeMemoryJobObject(buffer.rawAddress)
}

public actual fun isProcessInJob(processhandle: Handle, jobhandle: Handle, result: MutPtr): Bool =
    WindowsWin32SystemJobobjectsJniBridge.windowssysWindowsWin32SystemJobobjectsIsProcessInJob(processhandle.rawAddress, jobhandle.rawAddress, result.rawAddress)

public actual fun openJobObjectA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    MutPtr(WindowsWin32SystemJobobjectsJniBridge.windowssysWindowsWin32SystemJobobjectsOpenJobObjectA(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress))

public actual fun openJobObjectW(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcwstr): Handle =
    MutPtr(WindowsWin32SystemJobobjectsJniBridge.windowssysWindowsWin32SystemJobobjectsOpenJobObjectW(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress))

public actual fun queryInformationJobObject(hjob: Handle, jobobjectinformationclass: Jobobjectinfoclass, lpjobobjectinformation: MutPtr, cbjobobjectinformationlength: UInt, lpreturnlength: MutPtr): Bool =
    WindowsWin32SystemJobobjectsJniBridge.windowssysWindowsWin32SystemJobobjectsQueryInformationJobObject(hjob.rawAddress, jobobjectinformationclass, lpjobobjectinformation.rawAddress, cbjobobjectinformationlength.toInt(), lpreturnlength.rawAddress)

public actual fun queryIoRateControlInformationJobObject(hjob: Handle, volumename: Pcwstr, infoblocks: MutPtr, infoblockcount: MutPtr): UInt =
    WindowsWin32SystemJobobjectsJniBridge.windowssysWindowsWin32SystemJobobjectsQueryIoRateControlInformationJobObject(hjob.rawAddress, volumename.rawAddress, infoblocks.rawAddress, infoblockcount.rawAddress).toUInt()

public actual fun setInformationJobObject(hjob: Handle, jobobjectinformationclass: Jobobjectinfoclass, lpjobobjectinformation: ConstPtr, cbjobobjectinformationlength: UInt): Bool =
    WindowsWin32SystemJobobjectsJniBridge.windowssysWindowsWin32SystemJobobjectsSetInformationJobObject(hjob.rawAddress, jobobjectinformationclass, lpjobobjectinformation.rawAddress, cbjobobjectinformationlength.toInt())

public actual fun setIoRateControlInformationJobObject(hjob: Handle, ioratecontrolinfo: ConstPtr): UInt =
    WindowsWin32SystemJobobjectsJniBridge.windowssysWindowsWin32SystemJobobjectsSetIoRateControlInformationJobObject(hjob.rawAddress, ioratecontrolinfo.rawAddress).toUInt()

public actual fun terminateJobObject(hjob: Handle, uexitcode: UInt): Bool =
    WindowsWin32SystemJobobjectsJniBridge.windowssysWindowsWin32SystemJobobjectsTerminateJobObject(hjob.rawAddress, uexitcode.toInt())

public actual fun userHandleGrantAccess(huserhandle: Handle, hjob: Handle, bgrant: Bool): Bool =
    WindowsWin32SystemJobobjectsJniBridge.windowssysWindowsWin32SystemJobobjectsUserHandleGrantAccess(huserhandle.rawAddress, hjob.rawAddress, bgrant)
