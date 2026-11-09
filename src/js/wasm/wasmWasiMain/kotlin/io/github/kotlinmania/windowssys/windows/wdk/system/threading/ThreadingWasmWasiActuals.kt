@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.threading

import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.PTIMER_APC_ROUTINE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TIMER_TYPE

public actual fun NtCancelTimer(timerhandle: HANDLE, currentstate: Long): NTSTATUS =
    0

public actual fun NtCreateTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long, timertype: TIMER_TYPE): NTSTATUS =
    0

public actual fun NtOpenEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    0

public actual fun NtOpenProcess(processhandle: Long, desiredaccess: UInt, objectattributes: Long, clientid: Long): NTSTATUS =
    0

public actual fun NtOpenTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    0

public actual fun NtQueryInformationProcess(processhandle: HANDLE, processinformationclass: PROCESSINFOCLASS, processinformation: Long, processinformationlength: UInt, returnlength: Long): NTSTATUS =
    0

public actual fun NtQueryInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt, returnlength: Long): NTSTATUS =
    0

public actual fun NtSetInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt): NTSTATUS =
    0

public actual fun NtSetTimer(timerhandle: HANDLE, duetime: Long, timerapcroutine: PTIMER_APC_ROUTINE, timercontext: Long, resumetimer: Boolean, period: Int, previousstate: Long): NTSTATUS =
    0

public actual fun NtSetTimerEx(timerhandle: HANDLE, timersetinformationclass: TIMER_SET_INFORMATION_CLASS, timersetinformation: Long, timersetinformationlength: UInt): NTSTATUS =
    0

public actual fun NtTerminateProcess(processhandle: HANDLE, exitstatus: NTSTATUS): NTSTATUS =
    0

public actual fun NtWaitForSingleObject(handle: HANDLE, alertable: Boolean, timeout: Long): NTSTATUS =
    0

public actual fun ZwCancelTimer(timerhandle: HANDLE, currentstate: Long): NTSTATUS =
    0

public actual fun ZwCreateTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long, timertype: TIMER_TYPE): NTSTATUS =
    0

public actual fun ZwOpenEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    0

public actual fun ZwOpenProcess(processhandle: Long, desiredaccess: UInt, objectattributes: Long, clientid: Long): NTSTATUS =
    0

public actual fun ZwOpenTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    0

public actual fun ZwQueryInformationProcess(processhandle: HANDLE, processinformationclass: PROCESSINFOCLASS, processinformation: Long, processinformationlength: UInt, returnlength: Long): NTSTATUS =
    0

public actual fun ZwQueryInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt, returnlength: Long): NTSTATUS =
    0

public actual fun ZwSetInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt): NTSTATUS =
    0

public actual fun ZwSetTimer(timerhandle: HANDLE, duetime: Long, timerapcroutine: PTIMER_APC_ROUTINE, timercontext: Long, resumetimer: Boolean, period: Int, previousstate: Long): NTSTATUS =
    0

public actual fun ZwSetTimerEx(timerhandle: HANDLE, timersetinformationclass: TIMER_SET_INFORMATION_CLASS, timersetinformation: Long, timersetinformationlength: UInt): NTSTATUS =
    0

public actual fun ZwTerminateProcess(processhandle: HANDLE, exitstatus: NTSTATUS): NTSTATUS =
    0

public actual fun ZwWaitForSingleObject(handle: HANDLE, alertable: Boolean, timeout: Long): NTSTATUS =
    0
