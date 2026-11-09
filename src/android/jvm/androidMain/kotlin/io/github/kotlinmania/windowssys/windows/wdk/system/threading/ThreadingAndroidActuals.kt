@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.threading

import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.PTIMER_APC_ROUTINE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TIMER_TYPE

private object WindowsWdkSystemThreadingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_NtCancelTimer(timerhandle: Long, currentstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_NtCreateTimer(timerhandle: Long, desiredaccess: Int, objectattributes: Long, timertype: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_NtOpenEvent(eventhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_NtOpenProcess(processhandle: Long, desiredaccess: Int, objectattributes: Long, clientid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_NtOpenTimer(timerhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_NtQueryInformationProcess(processhandle: Long, processinformationclass: Int, processinformation: Long, processinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_NtQueryInformationThread(threadhandle: Long, threadinformationclass: Int, threadinformation: Long, threadinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_NtSetInformationThread(threadhandle: Long, threadinformationclass: Int, threadinformation: Long, threadinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_NtSetTimerEx(timerhandle: Long, timersetinformationclass: Int, timersetinformation: Long, timersetinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_NtTerminateProcess(processhandle: Long, exitstatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_NtWaitForSingleObject(handle: Long, alertable: Boolean, timeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_ZwCancelTimer(timerhandle: Long, currentstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_ZwCreateTimer(timerhandle: Long, desiredaccess: Int, objectattributes: Long, timertype: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_ZwOpenEvent(eventhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_ZwOpenProcess(processhandle: Long, desiredaccess: Int, objectattributes: Long, clientid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_ZwOpenTimer(timerhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_ZwQueryInformationProcess(processhandle: Long, processinformationclass: Int, processinformation: Long, processinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_ZwQueryInformationThread(threadhandle: Long, threadinformationclass: Int, threadinformation: Long, threadinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_ZwSetInformationThread(threadhandle: Long, threadinformationclass: Int, threadinformation: Long, threadinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_ZwSetTimerEx(timerhandle: Long, timersetinformationclass: Int, timersetinformation: Long, timersetinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_ZwTerminateProcess(processhandle: Long, exitstatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_ZwWaitForSingleObject(handle: Long, alertable: Boolean, timeout: Long): Int
}

public actual fun NtCancelTimer(timerhandle: HANDLE, currentstate: Long): NTSTATUS =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_NtCancelTimer(timerhandle, currentstate)

public actual fun NtCreateTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long, timertype: TIMER_TYPE): NTSTATUS =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_NtCreateTimer(timerhandle, desiredaccess.toInt(), objectattributes, timertype)

public actual fun NtOpenEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_NtOpenEvent(eventhandle, desiredaccess.toInt(), objectattributes)

public actual fun NtOpenProcess(processhandle: Long, desiredaccess: UInt, objectattributes: Long, clientid: Long): NTSTATUS =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_NtOpenProcess(processhandle, desiredaccess.toInt(), objectattributes, clientid)

public actual fun NtOpenTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_NtOpenTimer(timerhandle, desiredaccess.toInt(), objectattributes)

public actual fun NtQueryInformationProcess(processhandle: HANDLE, processinformationclass: PROCESSINFOCLASS, processinformation: Long, processinformationlength: UInt, returnlength: Long): NTSTATUS =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_NtQueryInformationProcess(processhandle, processinformationclass, processinformation, processinformationlength.toInt(), returnlength)

public actual fun NtQueryInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt, returnlength: Long): NTSTATUS =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_NtQueryInformationThread(threadhandle, threadinformationclass, threadinformation, threadinformationlength.toInt(), returnlength)

public actual fun NtSetInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt): NTSTATUS =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_NtSetInformationThread(threadhandle, threadinformationclass, threadinformation, threadinformationlength.toInt())

public actual fun NtSetTimer(timerhandle: HANDLE, duetime: Long, timerapcroutine: PTIMER_APC_ROUTINE, timercontext: Long, resumetimer: Boolean, period: Int, previousstate: Long): NTSTATUS =
    0

public actual fun NtSetTimerEx(timerhandle: HANDLE, timersetinformationclass: TIMER_SET_INFORMATION_CLASS, timersetinformation: Long, timersetinformationlength: UInt): NTSTATUS =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_NtSetTimerEx(timerhandle, timersetinformationclass, timersetinformation, timersetinformationlength.toInt())

public actual fun NtTerminateProcess(processhandle: HANDLE, exitstatus: NTSTATUS): NTSTATUS =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_NtTerminateProcess(processhandle, exitstatus)

public actual fun NtWaitForSingleObject(handle: HANDLE, alertable: Boolean, timeout: Long): NTSTATUS =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_NtWaitForSingleObject(handle, alertable, timeout)

public actual fun ZwCancelTimer(timerhandle: HANDLE, currentstate: Long): NTSTATUS =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_ZwCancelTimer(timerhandle, currentstate)

public actual fun ZwCreateTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long, timertype: TIMER_TYPE): NTSTATUS =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_ZwCreateTimer(timerhandle, desiredaccess.toInt(), objectattributes, timertype)

public actual fun ZwOpenEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_ZwOpenEvent(eventhandle, desiredaccess.toInt(), objectattributes)

public actual fun ZwOpenProcess(processhandle: Long, desiredaccess: UInt, objectattributes: Long, clientid: Long): NTSTATUS =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_ZwOpenProcess(processhandle, desiredaccess.toInt(), objectattributes, clientid)

public actual fun ZwOpenTimer(timerhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_ZwOpenTimer(timerhandle, desiredaccess.toInt(), objectattributes)

public actual fun ZwQueryInformationProcess(processhandle: HANDLE, processinformationclass: PROCESSINFOCLASS, processinformation: Long, processinformationlength: UInt, returnlength: Long): NTSTATUS =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_ZwQueryInformationProcess(processhandle, processinformationclass, processinformation, processinformationlength.toInt(), returnlength)

public actual fun ZwQueryInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt, returnlength: Long): NTSTATUS =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_ZwQueryInformationThread(threadhandle, threadinformationclass, threadinformation, threadinformationlength.toInt(), returnlength)

public actual fun ZwSetInformationThread(threadhandle: HANDLE, threadinformationclass: THREADINFOCLASS, threadinformation: Long, threadinformationlength: UInt): NTSTATUS =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_ZwSetInformationThread(threadhandle, threadinformationclass, threadinformation, threadinformationlength.toInt())

public actual fun ZwSetTimer(timerhandle: HANDLE, duetime: Long, timerapcroutine: PTIMER_APC_ROUTINE, timercontext: Long, resumetimer: Boolean, period: Int, previousstate: Long): NTSTATUS =
    0

public actual fun ZwSetTimerEx(timerhandle: HANDLE, timersetinformationclass: TIMER_SET_INFORMATION_CLASS, timersetinformation: Long, timersetinformationlength: UInt): NTSTATUS =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_ZwSetTimerEx(timerhandle, timersetinformationclass, timersetinformation, timersetinformationlength.toInt())

public actual fun ZwTerminateProcess(processhandle: HANDLE, exitstatus: NTSTATUS): NTSTATUS =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_ZwTerminateProcess(processhandle, exitstatus)

public actual fun ZwWaitForSingleObject(handle: HANDLE, alertable: Boolean, timeout: Long): NTSTATUS =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_ZwWaitForSingleObject(handle, alertable, timeout)
