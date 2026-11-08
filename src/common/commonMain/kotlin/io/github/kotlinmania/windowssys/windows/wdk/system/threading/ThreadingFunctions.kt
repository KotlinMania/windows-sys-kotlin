package io.github.kotlinmania.windowssys.windows.wdk.system.threading

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.PTIMER_APC_ROUTINE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TIMER_TYPE

public fun NtCancelTimer(timerhandle: HANDLE, currentstate: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtCancelTimer", longArrayOf(timerhandle, currentstate)).toInt()
}

public fun NtCreateTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long, timertype: TIMER_TYPE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtCreateTimer", longArrayOf(timerhandle, desiredaccess.toLong(), objectattributes, timertype.toLong())).toInt()
}

public fun NtOpenEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtOpenEvent", longArrayOf(eventhandle, desiredaccess.toLong(), objectattributes)).toInt()
}

public fun NtOpenProcess(processhandle: Long, desiredaccess: UInt, objectattributes: Long, clientid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtOpenProcess", longArrayOf(processhandle, desiredaccess.toLong(), objectattributes, clientid)).toInt()
}

public fun NtOpenTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtOpenTimer", longArrayOf(timerhandle, desiredaccess.toLong(), objectattributes)).toInt()
}

public fun NtQueryInformationProcess(processhandle: HANDLE, processinformationclass: PROCESSINFOCLASS, processinformation: Long, processinformationlength: UInt, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQueryInformationProcess", longArrayOf(processhandle, processinformationclass.toLong(), processinformation, processinformationlength.toLong(), returnlength)).toInt()
}

public fun NtQueryInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQueryInformationThread", longArrayOf(threadhandle, threadinformationclass.toLong(), threadinformation, threadinformationlength.toLong(), returnlength)).toInt()
}

public fun NtSetInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtSetInformationThread", longArrayOf(threadhandle, threadinformationclass.toLong(), threadinformation, threadinformationlength.toLong())).toInt()
}

public fun NtSetTimer(timerhandle: HANDLE, duetime: Long, timerapcroutine: PTIMER_APC_ROUTINE, timercontext: Long, resumetimer: Boolean, period: Int, previousstate: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtSetTimer", longArrayOf(timerhandle, duetime, Win32DynamicFfi.objectSlot(timerapcroutine), timercontext, if (resumetimer) 1L else 0L, period.toLong(), previousstate)).toInt()
}

public fun NtSetTimerEx(timerhandle: HANDLE, timersetinformationclass: TIMER_SET_INFORMATION_CLASS, timersetinformation: Long, timersetinformationlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtSetTimerEx", longArrayOf(timerhandle, timersetinformationclass.toLong(), timersetinformation, timersetinformationlength.toLong())).toInt()
}

public fun NtTerminateProcess(processhandle: HANDLE, exitstatus: NTSTATUS): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtTerminateProcess", longArrayOf(processhandle, exitstatus.toLong())).toInt()
}

public fun NtWaitForSingleObject(handle: HANDLE, alertable: Boolean, timeout: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtWaitForSingleObject", longArrayOf(handle, if (alertable) 1L else 0L, timeout)).toInt()
}

public fun ZwCancelTimer(timerhandle: HANDLE, currentstate: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwCancelTimer", longArrayOf(timerhandle, currentstate)).toInt()
}

public fun ZwCreateTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long, timertype: TIMER_TYPE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateTimer", longArrayOf(timerhandle, desiredaccess.toLong(), objectattributes, timertype.toLong())).toInt()
}

public fun ZwOpenEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenEvent", longArrayOf(eventhandle, desiredaccess.toLong(), objectattributes)).toInt()
}

public fun ZwOpenProcess(processhandle: Long, desiredaccess: UInt, objectattributes: Long, clientid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenProcess", longArrayOf(processhandle, desiredaccess.toLong(), objectattributes, clientid)).toInt()
}

public fun ZwOpenTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenTimer", longArrayOf(timerhandle, desiredaccess.toLong(), objectattributes)).toInt()
}

public fun ZwQueryInformationProcess(processhandle: HANDLE, processinformationclass: PROCESSINFOCLASS, processinformation: Long, processinformationlength: UInt, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryInformationProcess", longArrayOf(processhandle, processinformationclass.toLong(), processinformation, processinformationlength.toLong(), returnlength)).toInt()
}

public fun ZwQueryInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryInformationThread", longArrayOf(threadhandle, threadinformationclass.toLong(), threadinformation, threadinformationlength.toLong(), returnlength)).toInt()
}

public fun ZwSetInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwSetInformationThread", longArrayOf(threadhandle, threadinformationclass.toLong(), threadinformation, threadinformationlength.toLong())).toInt()
}

public fun ZwSetTimer(timerhandle: HANDLE, duetime: Long, timerapcroutine: PTIMER_APC_ROUTINE, timercontext: Long, resumetimer: Boolean, period: Int, previousstate: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwSetTimer", longArrayOf(timerhandle, duetime, Win32DynamicFfi.objectSlot(timerapcroutine), timercontext, if (resumetimer) 1L else 0L, period.toLong(), previousstate)).toInt()
}

public fun ZwSetTimerEx(timerhandle: HANDLE, timersetinformationclass: TIMER_SET_INFORMATION_CLASS, timersetinformation: Long, timersetinformationlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwSetTimerEx", longArrayOf(timerhandle, timersetinformationclass.toLong(), timersetinformation, timersetinformationlength.toLong())).toInt()
}

public fun ZwTerminateProcess(processhandle: HANDLE, exitstatus: NTSTATUS): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwTerminateProcess", longArrayOf(processhandle, exitstatus.toLong())).toInt()
}

public fun ZwWaitForSingleObject(handle: HANDLE, alertable: Boolean, timeout: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwWaitForSingleObject", longArrayOf(handle, if (alertable) 1L else 0L, timeout)).toInt()
}
