@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.jobobjects

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32SystemJobobjectsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_AssignProcessToJobObject(hjob: Long, hprocess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_CreateJobObjectA(lpjobattributes: Long, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_CreateJobObjectW(lpjobattributes: Long, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_CreateJobSet(numjob: Int, userjobset: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_FreeMemoryJobObject(buffer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_IsProcessInJob(processhandle: Long, jobhandle: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_OpenJobObjectA(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_OpenJobObjectW(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_QueryInformationJobObject(hjob: Long, jobobjectinformationclass: Int, lpjobobjectinformation: Long, cbjobobjectinformationlength: Int, lpreturnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_QueryIoRateControlInformationJobObject(hjob: Long, volumename: Long, infoblocks: Long, infoblockcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_SetInformationJobObject(hjob: Long, jobobjectinformationclass: Int, lpjobobjectinformation: Long, cbjobobjectinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_SetIoRateControlInformationJobObject(hjob: Long, ioratecontrolinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_TerminateJobObject(hjob: Long, uexitcode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_jobobjects_UserHandleGrantAccess(huserhandle: Long, hjob: Long, bgrant: Int): Int
}

public actual fun AssignProcessToJobObject(hjob: HANDLE, hprocess: HANDLE): BOOL =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_AssignProcessToJobObject(hjob, hprocess)

public actual fun CreateJobObjectA(lpjobattributes: Long, lpname: PCSTR): HANDLE =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_CreateJobObjectA(lpjobattributes, lpname)

public actual fun CreateJobObjectW(lpjobattributes: Long, lpname: PCWSTR): HANDLE =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_CreateJobObjectW(lpjobattributes, lpname)

public actual fun CreateJobSet(numjob: UInt, userjobset: Long, flags: UInt): BOOL =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_CreateJobSet(numjob.toInt(), userjobset, flags.toInt())

public actual fun FreeMemoryJobObject(buffer: Long) {
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_FreeMemoryJobObject(buffer)
}

public actual fun IsProcessInJob(processhandle: HANDLE, jobhandle: HANDLE, result: Long): BOOL =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_IsProcessInJob(processhandle, jobhandle, result)

public actual fun OpenJobObjectA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): HANDLE =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_OpenJobObjectA(dwdesiredaccess.toInt(), binherithandle, lpname)

public actual fun OpenJobObjectW(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCWSTR): HANDLE =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_OpenJobObjectW(dwdesiredaccess.toInt(), binherithandle, lpname)

public actual fun QueryInformationJobObject(hjob: HANDLE, jobobjectinformationclass: JOBOBJECTINFOCLASS, lpjobobjectinformation: Long, cbjobobjectinformationlength: UInt, lpreturnlength: Long): BOOL =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_QueryInformationJobObject(hjob, jobobjectinformationclass, lpjobobjectinformation, cbjobobjectinformationlength.toInt(), lpreturnlength)

public actual fun QueryIoRateControlInformationJobObject(hjob: HANDLE, volumename: PCWSTR, infoblocks: Long, infoblockcount: Long): UInt =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_QueryIoRateControlInformationJobObject(hjob, volumename, infoblocks, infoblockcount).toUInt()

public actual fun SetInformationJobObject(hjob: HANDLE, jobobjectinformationclass: JOBOBJECTINFOCLASS, lpjobobjectinformation: Long, cbjobobjectinformationlength: UInt): BOOL =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_SetInformationJobObject(hjob, jobobjectinformationclass, lpjobobjectinformation, cbjobobjectinformationlength.toInt())

public actual fun SetIoRateControlInformationJobObject(hjob: HANDLE, ioratecontrolinfo: Long): UInt =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_SetIoRateControlInformationJobObject(hjob, ioratecontrolinfo).toUInt()

public actual fun TerminateJobObject(hjob: HANDLE, uexitcode: UInt): BOOL =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_TerminateJobObject(hjob, uexitcode.toInt())

public actual fun UserHandleGrantAccess(huserhandle: HANDLE, hjob: HANDLE, bgrant: BOOL): BOOL =
    WindowsWin32SystemJobobjectsJniBridge.windowssys_windows_win32_system_jobobjects_UserHandleGrantAccess(huserhandle, hjob, bgrant)
