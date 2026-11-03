package io.github.kotlinmania.windowssys.windows.wdk.system.threading

import io.github.kotlinmania.windowssys.Win32DynamicFfi

public fun NtCancelTimer(timerhandle: Win32.Foundation.HANDLE, currentstate: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtCancelTimer", longArrayOf(Win32DynamicFfi.objectSlot(timerhandle), currentstate))
    return Win32.Foundation.NTSTATUS()
}

public fun NtCreateTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long, timertype: Win32.System.Kernel.TIMER_TYPE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtCreateTimer", longArrayOf(timerhandle, desiredaccess.toLong(), objectattributes, Win32DynamicFfi.objectSlot(timertype)))
    return Win32.Foundation.NTSTATUS()
}

public fun NtOpenEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtOpenEvent", longArrayOf(eventhandle, desiredaccess.toLong(), objectattributes))
    return Win32.Foundation.NTSTATUS()
}

public fun NtOpenProcess(processhandle: Long, desiredaccess: UInt, objectattributes: Long, clientid: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtOpenProcess", longArrayOf(processhandle, desiredaccess.toLong(), objectattributes, clientid))
    return Win32.Foundation.NTSTATUS()
}

public fun NtOpenTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtOpenTimer", longArrayOf(timerhandle, desiredaccess.toLong(), objectattributes))
    return Win32.Foundation.NTSTATUS()
}

public fun NtQueryInformationProcess(processhandle: Win32.Foundation.HANDLE, processinformationclass: PROCESSINFOCLASS, processinformation: Long, processinformationlength: UInt, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtQueryInformationProcess", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), processinformationclass.toLong(), processinformation, processinformationlength.toLong(), returnlength))
    return Win32.Foundation.NTSTATUS()
}

public fun NtQueryInformationThread(threadhandle: Win32.Foundation.HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtQueryInformationThread", longArrayOf(Win32DynamicFfi.objectSlot(threadhandle), threadinformationclass.toLong(), threadinformation, threadinformationlength.toLong(), returnlength))
    return Win32.Foundation.NTSTATUS()
}

public fun NtSetInformationThread(threadhandle: Win32.Foundation.HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtSetInformationThread", longArrayOf(Win32DynamicFfi.objectSlot(threadhandle), threadinformationclass.toLong(), threadinformation, threadinformationlength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtSetTimer(timerhandle: Win32.Foundation.HANDLE, duetime: Long, timerapcroutine: SystemServices.PTIMER_APC_ROUTINE, timercontext: Long, resumetimer: Boolean, period: Int, previousstate: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtSetTimer", longArrayOf(Win32DynamicFfi.objectSlot(timerhandle), duetime, Win32DynamicFfi.objectSlot(timerapcroutine), timercontext, if (resumetimer) 1L else 0L, period.toLong(), previousstate))
    return Win32.Foundation.NTSTATUS()
}

public fun NtSetTimerEx(timerhandle: Win32.Foundation.HANDLE, timersetinformationclass: TIMER_SET_INFORMATION_CLASS, timersetinformation: Long, timersetinformationlength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtSetTimerEx", longArrayOf(Win32DynamicFfi.objectSlot(timerhandle), timersetinformationclass.toLong(), timersetinformation, timersetinformationlength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtTerminateProcess(processhandle: Win32.Foundation.HANDLE, exitstatus: Win32.Foundation.NTSTATUS): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtTerminateProcess", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), Win32DynamicFfi.objectSlot(exitstatus)))
    return Win32.Foundation.NTSTATUS()
}

public fun NtWaitForSingleObject(handle: Win32.Foundation.HANDLE, alertable: Boolean, timeout: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtWaitForSingleObject", longArrayOf(Win32DynamicFfi.objectSlot(handle), if (alertable) 1L else 0L, timeout))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwCancelTimer(timerhandle: Win32.Foundation.HANDLE, currentstate: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwCancelTimer", longArrayOf(Win32DynamicFfi.objectSlot(timerhandle), currentstate))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwCreateTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long, timertype: Win32.System.Kernel.TIMER_TYPE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateTimer", longArrayOf(timerhandle, desiredaccess.toLong(), objectattributes, Win32DynamicFfi.objectSlot(timertype)))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwOpenEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenEvent", longArrayOf(eventhandle, desiredaccess.toLong(), objectattributes))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwOpenProcess(processhandle: Long, desiredaccess: UInt, objectattributes: Long, clientid: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenProcess", longArrayOf(processhandle, desiredaccess.toLong(), objectattributes, clientid))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwOpenTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenTimer", longArrayOf(timerhandle, desiredaccess.toLong(), objectattributes))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQueryInformationProcess(processhandle: Win32.Foundation.HANDLE, processinformationclass: PROCESSINFOCLASS, processinformation: Long, processinformationlength: UInt, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryInformationProcess", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), processinformationclass.toLong(), processinformation, processinformationlength.toLong(), returnlength))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQueryInformationThread(threadhandle: Win32.Foundation.HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryInformationThread", longArrayOf(Win32DynamicFfi.objectSlot(threadhandle), threadinformationclass.toLong(), threadinformation, threadinformationlength.toLong(), returnlength))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwSetInformationThread(threadhandle: Win32.Foundation.HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwSetInformationThread", longArrayOf(Win32DynamicFfi.objectSlot(threadhandle), threadinformationclass.toLong(), threadinformation, threadinformationlength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwSetTimer(timerhandle: Win32.Foundation.HANDLE, duetime: Long, timerapcroutine: SystemServices.PTIMER_APC_ROUTINE, timercontext: Long, resumetimer: Boolean, period: Int, previousstate: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwSetTimer", longArrayOf(Win32DynamicFfi.objectSlot(timerhandle), duetime, Win32DynamicFfi.objectSlot(timerapcroutine), timercontext, if (resumetimer) 1L else 0L, period.toLong(), previousstate))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwSetTimerEx(timerhandle: Win32.Foundation.HANDLE, timersetinformationclass: TIMER_SET_INFORMATION_CLASS, timersetinformation: Long, timersetinformationlength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwSetTimerEx", longArrayOf(Win32DynamicFfi.objectSlot(timerhandle), timersetinformationclass.toLong(), timersetinformation, timersetinformationlength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwTerminateProcess(processhandle: Win32.Foundation.HANDLE, exitstatus: Win32.Foundation.NTSTATUS): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwTerminateProcess", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), Win32DynamicFfi.objectSlot(exitstatus)))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwWaitForSingleObject(handle: Win32.Foundation.HANDLE, alertable: Boolean, timeout: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwWaitForSingleObject", longArrayOf(Win32DynamicFfi.objectSlot(handle), if (alertable) 1L else 0L, timeout))
    return Win32.Foundation.NTSTATUS()
}
