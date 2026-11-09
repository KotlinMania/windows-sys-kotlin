@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.jobobjects

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AssignProcessToJobObject(hjob: HANDLE, hprocess: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_AssignProcessToJobObject(hjob.toCPointer<ByteVar>(), hprocess.toCPointer<ByteVar>())

public actual fun CreateJobObjectA(lpjobattributes: Long, lpname: PCSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_CreateJobObjectA(lpjobattributes.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateJobObjectW(lpjobattributes: Long, lpname: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_CreateJobObjectW(lpjobattributes.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateJobSet(numjob: UInt, userjobset: Long, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_CreateJobSet(numjob, userjobset.toCPointer<ByteVar>(), flags)

public actual fun FreeMemoryJobObject(buffer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_FreeMemoryJobObject(buffer.toCPointer<ByteVar>())
}

public actual fun IsProcessInJob(processhandle: HANDLE, jobhandle: HANDLE, result: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_IsProcessInJob(processhandle.toCPointer<ByteVar>(), jobhandle.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun OpenJobObjectA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_OpenJobObjectA(dwdesiredaccess, binherithandle, lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun OpenJobObjectW(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_OpenJobObjectW(dwdesiredaccess, binherithandle, lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun QueryInformationJobObject(hjob: HANDLE, jobobjectinformationclass: JOBOBJECTINFOCLASS, lpjobobjectinformation: Long, cbjobobjectinformationlength: UInt, lpreturnlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_QueryInformationJobObject(hjob.toCPointer<ByteVar>(), jobobjectinformationclass, lpjobobjectinformation.toCPointer<ByteVar>(), cbjobobjectinformationlength, lpreturnlength.toCPointer<ByteVar>())

public actual fun QueryIoRateControlInformationJobObject(hjob: HANDLE, volumename: PCWSTR, infoblocks: Long, infoblockcount: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_QueryIoRateControlInformationJobObject(hjob.toCPointer<ByteVar>(), volumename.toCPointer<ByteVar>(), infoblocks.toCPointer<ByteVar>(), infoblockcount.toCPointer<ByteVar>())

public actual fun SetInformationJobObject(hjob: HANDLE, jobobjectinformationclass: JOBOBJECTINFOCLASS, lpjobobjectinformation: Long, cbjobobjectinformationlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_SetInformationJobObject(hjob.toCPointer<ByteVar>(), jobobjectinformationclass, lpjobobjectinformation.toCPointer<ByteVar>(), cbjobobjectinformationlength)

public actual fun SetIoRateControlInformationJobObject(hjob: HANDLE, ioratecontrolinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_SetIoRateControlInformationJobObject(hjob.toCPointer<ByteVar>(), ioratecontrolinfo.toCPointer<ByteVar>())

public actual fun TerminateJobObject(hjob: HANDLE, uexitcode: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_TerminateJobObject(hjob.toCPointer<ByteVar>(), uexitcode)

public actual fun UserHandleGrantAccess(huserhandle: HANDLE, hjob: HANDLE, bgrant: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_UserHandleGrantAccess(huserhandle.toCPointer<ByteVar>(), hjob.toCPointer<ByteVar>(), bgrant)
