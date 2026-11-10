@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.jobobjects

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemJobobjectsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_assignProcessToJobObject(hjob: Long, hprocess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_createJobObjectA(lpjobattributes: Long, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_createJobObjectW(lpjobattributes: Long, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_createJobSet(numjob: Int, userjobset: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_freeMemoryJobObject(buffer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_isProcessInJob(processhandle: Long, jobhandle: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_openJobObjectA(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_openJobObjectW(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_queryInformationJobObject(hjob: Long, jobobjectinformationclass: Int, lpjobobjectinformation: Long, cbjobobjectinformationlength: Int, lpreturnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_queryIoRateControlInformationJobObject(hjob: Long, volumename: Long, infoblocks: Long, infoblockcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_setInformationJobObject(hjob: Long, jobobjectinformationclass: Int, lpjobobjectinformation: Long, cbjobobjectinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_setIoRateControlInformationJobObject(hjob: Long, ioratecontrolinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_terminateJobObject(hjob: Long, uexitcode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_userHandleGrantAccess(huserhandle: Long, hjob: Long, bgrant: Int): Int
}

public actual fun assignProcessToJobObject(hjob: Handle, hprocess: Handle): Bool =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_assignProcessToJobObject((hjob?.value ?: 0L), (hprocess?.value ?: 0L))

public actual fun createJobObjectA(lpjobattributes: COpaquePointer?, lpname: Pcstr): Handle =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_createJobObjectA((lpjobattributes?.value ?: 0L), (lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createJobObjectW(lpjobattributes: COpaquePointer?, lpname: Pcwstr): Handle =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_createJobObjectW((lpjobattributes?.value ?: 0L), (lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createJobSet(numjob: UInt, userjobset: COpaquePointer?, flags: UInt): Bool =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_createJobSet(numjob.toInt(), (userjobset?.value ?: 0L), flags.toInt())

public actual fun freeMemoryJobObject(buffer: COpaquePointer?) {
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_freeMemoryJobObject((buffer?.value ?: 0L))
}

public actual fun isProcessInJob(processhandle: Handle, jobhandle: Handle, result: COpaquePointer?): Bool =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_isProcessInJob((processhandle?.value ?: 0L), (jobhandle?.value ?: 0L), (result?.value ?: 0L))

public actual fun openJobObjectA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_openJobObjectA(dwdesiredaccess.toInt(), binherithandle, (lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openJobObjectW(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcwstr): Handle =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_openJobObjectW(dwdesiredaccess.toInt(), binherithandle, (lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun queryInformationJobObject(hjob: Handle, jobobjectinformationclass: Jobobjectinfoclass, lpjobobjectinformation: COpaquePointer?, cbjobobjectinformationlength: UInt, lpreturnlength: COpaquePointer?): Bool =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_queryInformationJobObject((hjob?.value ?: 0L), jobobjectinformationclass, (lpjobobjectinformation?.value ?: 0L), cbjobobjectinformationlength.toInt(), (lpreturnlength?.value ?: 0L))

public actual fun queryIoRateControlInformationJobObject(hjob: Handle, volumename: Pcwstr, infoblocks: COpaquePointer?, infoblockcount: COpaquePointer?): UInt =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_queryIoRateControlInformationJobObject((hjob?.value ?: 0L), (volumename?.value ?: 0L), (infoblocks?.value ?: 0L), (infoblockcount?.value ?: 0L)).toUInt()

public actual fun setInformationJobObject(hjob: Handle, jobobjectinformationclass: Jobobjectinfoclass, lpjobobjectinformation: COpaquePointer?, cbjobobjectinformationlength: UInt): Bool =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_setInformationJobObject((hjob?.value ?: 0L), jobobjectinformationclass, (lpjobobjectinformation?.value ?: 0L), cbjobobjectinformationlength.toInt())

public actual fun setIoRateControlInformationJobObject(hjob: Handle, ioratecontrolinfo: COpaquePointer?): UInt =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_setIoRateControlInformationJobObject((hjob?.value ?: 0L), (ioratecontrolinfo?.value ?: 0L)).toUInt()

public actual fun terminateJobObject(hjob: Handle, uexitcode: UInt): Bool =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_terminateJobObject((hjob?.value ?: 0L), uexitcode.toInt())

public actual fun userHandleGrantAccess(huserhandle: Handle, hjob: Handle, bgrant: Bool): Bool =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_userHandleGrantAccess((huserhandle?.value ?: 0L), (hjob?.value ?: 0L), bgrant)
