@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.threading

import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.PTIMER_APC_ROUTINE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TIMER_TYPE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun NtCancelTimer(timerhandle: HANDLE, currentstate: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_NtCancelTimer(timerhandle.toCPointer<ByteVar>(), currentstate.toCPointer<ByteVar>())

public actual fun NtCreateTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long, timertype: TIMER_TYPE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_NtCreateTimer(timerhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), timertype)

public actual fun NtOpenEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_NtOpenEvent(eventhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>())

public actual fun NtOpenProcess(processhandle: Long, desiredaccess: UInt, objectattributes: Long, clientid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_NtOpenProcess(processhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), clientid.toCPointer<ByteVar>())

public actual fun NtOpenTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_NtOpenTimer(timerhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>())

public actual fun NtQueryInformationProcess(processhandle: HANDLE, processinformationclass: PROCESSINFOCLASS, processinformation: Long, processinformationlength: UInt, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_NtQueryInformationProcess(processhandle.toCPointer<ByteVar>(), processinformationclass, processinformation.toCPointer<ByteVar>(), processinformationlength, returnlength.toCPointer<ByteVar>())

public actual fun NtQueryInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_NtQueryInformationThread(threadhandle.toCPointer<ByteVar>(), threadinformationclass, threadinformation.toCPointer<ByteVar>(), threadinformationlength, returnlength.toCPointer<ByteVar>())

public actual fun NtSetInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_NtSetInformationThread(threadhandle.toCPointer<ByteVar>(), threadinformationclass, threadinformation.toCPointer<ByteVar>(), threadinformationlength)

public actual fun NtSetTimer(timerhandle: HANDLE, duetime: Long, timerapcroutine: PTIMER_APC_ROUTINE, timercontext: Long, resumetimer: Boolean, period: Int, previousstate: Long): NTSTATUS =
    0

public actual fun NtSetTimerEx(timerhandle: HANDLE, timersetinformationclass: TIMER_SET_INFORMATION_CLASS, timersetinformation: Long, timersetinformationlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_NtSetTimerEx(timerhandle.toCPointer<ByteVar>(), timersetinformationclass, timersetinformation.toCPointer<ByteVar>(), timersetinformationlength)

public actual fun NtTerminateProcess(processhandle: HANDLE, exitstatus: NTSTATUS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_NtTerminateProcess(processhandle.toCPointer<ByteVar>(), exitstatus)

public actual fun NtWaitForSingleObject(handle: HANDLE, alertable: Boolean, timeout: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_NtWaitForSingleObject(handle.toCPointer<ByteVar>(), alertable, timeout.toCPointer<ByteVar>())

public actual fun ZwCancelTimer(timerhandle: HANDLE, currentstate: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_ZwCancelTimer(timerhandle.toCPointer<ByteVar>(), currentstate.toCPointer<ByteVar>())

public actual fun ZwCreateTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long, timertype: TIMER_TYPE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_ZwCreateTimer(timerhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), timertype)

public actual fun ZwOpenEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_ZwOpenEvent(eventhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>())

public actual fun ZwOpenProcess(processhandle: Long, desiredaccess: UInt, objectattributes: Long, clientid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_ZwOpenProcess(processhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), clientid.toCPointer<ByteVar>())

public actual fun ZwOpenTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_ZwOpenTimer(timerhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>())

public actual fun ZwQueryInformationProcess(processhandle: HANDLE, processinformationclass: PROCESSINFOCLASS, processinformation: Long, processinformationlength: UInt, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_ZwQueryInformationProcess(processhandle.toCPointer<ByteVar>(), processinformationclass, processinformation.toCPointer<ByteVar>(), processinformationlength, returnlength.toCPointer<ByteVar>())

public actual fun ZwQueryInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_ZwQueryInformationThread(threadhandle.toCPointer<ByteVar>(), threadinformationclass, threadinformation.toCPointer<ByteVar>(), threadinformationlength, returnlength.toCPointer<ByteVar>())

public actual fun ZwSetInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_ZwSetInformationThread(threadhandle.toCPointer<ByteVar>(), threadinformationclass, threadinformation.toCPointer<ByteVar>(), threadinformationlength)

public actual fun ZwSetTimer(timerhandle: HANDLE, duetime: Long, timerapcroutine: PTIMER_APC_ROUTINE, timercontext: Long, resumetimer: Boolean, period: Int, previousstate: Long): NTSTATUS =
    0

public actual fun ZwSetTimerEx(timerhandle: HANDLE, timersetinformationclass: TIMER_SET_INFORMATION_CLASS, timersetinformation: Long, timersetinformationlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_ZwSetTimerEx(timerhandle.toCPointer<ByteVar>(), timersetinformationclass, timersetinformation.toCPointer<ByteVar>(), timersetinformationlength)

public actual fun ZwTerminateProcess(processhandle: HANDLE, exitstatus: NTSTATUS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_ZwTerminateProcess(processhandle.toCPointer<ByteVar>(), exitstatus)

public actual fun ZwWaitForSingleObject(handle: HANDLE, alertable: Boolean, timeout: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_ZwWaitForSingleObject(handle.toCPointer<ByteVar>(), alertable, timeout.toCPointer<ByteVar>())
