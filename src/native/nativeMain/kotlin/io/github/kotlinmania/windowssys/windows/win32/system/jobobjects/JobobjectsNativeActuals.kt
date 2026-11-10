@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.jobobjects

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun assignProcessToJobObject(hjob: Handle, hprocess: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_assignProcessToJobObject(hjob?.value?.toCPointer<ByteVar>(), hprocess?.value?.toCPointer<ByteVar>())

public actual fun createJobObjectA(lpjobattributes: COpaquePointer?, lpname: Pcstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_createJobObjectA(lpjobattributes?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createJobObjectW(lpjobattributes: COpaquePointer?, lpname: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_createJobObjectW(lpjobattributes?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createJobSet(numjob: UInt, userjobset: COpaquePointer?, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_createJobSet(numjob, userjobset?.value?.toCPointer<ByteVar>(), flags)

public actual fun freeMemoryJobObject(buffer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_freeMemoryJobObject(buffer?.value?.toCPointer<ByteVar>())
}

public actual fun isProcessInJob(processhandle: Handle, jobhandle: Handle, result: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_isProcessInJob(processhandle?.value?.toCPointer<ByteVar>(), jobhandle?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun openJobObjectA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_openJobObjectA(dwdesiredaccess, binherithandle, lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun openJobObjectW(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_openJobObjectW(dwdesiredaccess, binherithandle, lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun queryInformationJobObject(hjob: Handle, jobobjectinformationclass: Jobobjectinfoclass, lpjobobjectinformation: COpaquePointer?, cbjobobjectinformationlength: UInt, lpreturnlength: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_queryInformationJobObject(hjob?.value?.toCPointer<ByteVar>(), jobobjectinformationclass, lpjobobjectinformation?.value?.toCPointer<ByteVar>(), cbjobobjectinformationlength, lpreturnlength?.value?.toCPointer<ByteVar>())

public actual fun queryIoRateControlInformationJobObject(hjob: Handle, volumename: Pcwstr, infoblocks: COpaquePointer?, infoblockcount: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_queryIoRateControlInformationJobObject(hjob?.value?.toCPointer<ByteVar>(), volumename?.value?.toCPointer<ByteVar>(), infoblocks?.value?.toCPointer<ByteVar>(), infoblockcount?.value?.toCPointer<ByteVar>())

public actual fun setInformationJobObject(hjob: Handle, jobobjectinformationclass: Jobobjectinfoclass, lpjobobjectinformation: COpaquePointer?, cbjobobjectinformationlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_setInformationJobObject(hjob?.value?.toCPointer<ByteVar>(), jobobjectinformationclass, lpjobobjectinformation?.value?.toCPointer<ByteVar>(), cbjobobjectinformationlength)

public actual fun setIoRateControlInformationJobObject(hjob: Handle, ioratecontrolinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_setIoRateControlInformationJobObject(hjob?.value?.toCPointer<ByteVar>(), ioratecontrolinfo?.value?.toCPointer<ByteVar>())

public actual fun terminateJobObject(hjob: Handle, uexitcode: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_terminateJobObject(hjob?.value?.toCPointer<ByteVar>(), uexitcode)

public actual fun userHandleGrantAccess(huserhandle: Handle, hjob: Handle, bgrant: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.jobobjects.cinterop.windowssys_windows_win32_system_jobobjects_userHandleGrantAccess(huserhandle?.value?.toCPointer<ByteVar>(), hjob?.value?.toCPointer<ByteVar>(), bgrant)
