package io.github.kotlinmania.windowssys.windows.wdk.system.threading

import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.PTIMER_APC_ROUTINE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TIMER_TYPE

public expect fun NtCancelTimer(timerhandle: HANDLE, currentstate: Long): NTSTATUS

public expect fun NtCreateTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long, timertype: TIMER_TYPE): NTSTATUS

public expect fun NtOpenEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS

public expect fun NtOpenProcess(processhandle: Long, desiredaccess: UInt, objectattributes: Long, clientid: Long): NTSTATUS

public expect fun NtOpenTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS

public expect fun NtQueryInformationProcess(processhandle: HANDLE, processinformationclass: PROCESSINFOCLASS, processinformation: Long, processinformationlength: UInt, returnlength: Long): NTSTATUS

public expect fun NtQueryInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt, returnlength: Long): NTSTATUS

public expect fun NtSetInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt): NTSTATUS

public expect fun NtSetTimer(timerhandle: HANDLE, duetime: Long, timerapcroutine: PTIMER_APC_ROUTINE, timercontext: Long, resumetimer: Boolean, period: Int, previousstate: Long): NTSTATUS

public expect fun NtSetTimerEx(timerhandle: HANDLE, timersetinformationclass: TIMER_SET_INFORMATION_CLASS, timersetinformation: Long, timersetinformationlength: UInt): NTSTATUS

public expect fun NtTerminateProcess(processhandle: HANDLE, exitstatus: NTSTATUS): NTSTATUS

public expect fun NtWaitForSingleObject(handle: HANDLE, alertable: Boolean, timeout: Long): NTSTATUS

public expect fun ZwCancelTimer(timerhandle: HANDLE, currentstate: Long): NTSTATUS

public expect fun ZwCreateTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long, timertype: TIMER_TYPE): NTSTATUS

public expect fun ZwOpenEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS

public expect fun ZwOpenProcess(processhandle: Long, desiredaccess: UInt, objectattributes: Long, clientid: Long): NTSTATUS

public expect fun ZwOpenTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS

public expect fun ZwQueryInformationProcess(processhandle: HANDLE, processinformationclass: PROCESSINFOCLASS, processinformation: Long, processinformationlength: UInt, returnlength: Long): NTSTATUS

public expect fun ZwQueryInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt, returnlength: Long): NTSTATUS

public expect fun ZwSetInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt): NTSTATUS

public expect fun ZwSetTimer(timerhandle: HANDLE, duetime: Long, timerapcroutine: PTIMER_APC_ROUTINE, timercontext: Long, resumetimer: Boolean, period: Int, previousstate: Long): NTSTATUS

public expect fun ZwSetTimerEx(timerhandle: HANDLE, timersetinformationclass: TIMER_SET_INFORMATION_CLASS, timersetinformation: Long, timersetinformationlength: UInt): NTSTATUS

public expect fun ZwTerminateProcess(processhandle: HANDLE, exitstatus: NTSTATUS): NTSTATUS

public expect fun ZwWaitForSingleObject(handle: HANDLE, alertable: Boolean, timeout: Long): NTSTATUS
