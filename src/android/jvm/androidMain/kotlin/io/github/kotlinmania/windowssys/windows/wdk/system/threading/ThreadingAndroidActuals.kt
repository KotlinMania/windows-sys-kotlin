@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.threading

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.PtimerApcRoutine
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TimerType

private object WindowsWdkSystemThreadingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_ntCancelTimer(timerhandle: Long, currentstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_ntCreateTimer(timerhandle: Long, desiredaccess: Int, objectattributes: Long, timertype: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_ntOpenEvent(eventhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_ntOpenProcess(processhandle: Long, desiredaccess: Int, objectattributes: Long, clientid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_ntOpenTimer(timerhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_ntQueryInformationProcess(processhandle: Long, processinformationclass: Int, processinformation: Long, processinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_ntQueryInformationThread(threadhandle: Long, threadinformationclass: Int, threadinformation: Long, threadinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_ntSetInformationThread(threadhandle: Long, threadinformationclass: Int, threadinformation: Long, threadinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_ntSetTimer(timerhandle: Long, duetime: Long, timerapcroutine: Long, timercontext: Long, resumetimer: Boolean, period: Int, previousstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_ntSetTimerEx(timerhandle: Long, timersetinformationclass: Int, timersetinformation: Long, timersetinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_ntTerminateProcess(processhandle: Long, exitstatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_ntWaitForSingleObject(handle: Long, alertable: Boolean, timeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_zwCancelTimer(timerhandle: Long, currentstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_zwCreateTimer(timerhandle: Long, desiredaccess: Int, objectattributes: Long, timertype: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_zwOpenEvent(eventhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_zwOpenProcess(processhandle: Long, desiredaccess: Int, objectattributes: Long, clientid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_zwOpenTimer(timerhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_zwQueryInformationProcess(processhandle: Long, processinformationclass: Int, processinformation: Long, processinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_zwQueryInformationThread(threadhandle: Long, threadinformationclass: Int, threadinformation: Long, threadinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_zwSetInformationThread(threadhandle: Long, threadinformationclass: Int, threadinformation: Long, threadinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_zwSetTimer(timerhandle: Long, duetime: Long, timerapcroutine: Long, timercontext: Long, resumetimer: Boolean, period: Int, previousstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_zwSetTimerEx(timerhandle: Long, timersetinformationclass: Int, timersetinformation: Long, timersetinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_zwTerminateProcess(processhandle: Long, exitstatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_threading_zwWaitForSingleObject(handle: Long, alertable: Boolean, timeout: Long): Int
}

public actual fun ntCancelTimer(timerhandle: Handle, currentstate: COpaquePointer?): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_ntCancelTimer((timerhandle?.value ?: 0L), (currentstate?.value ?: 0L))

public actual fun ntCreateTimer(timerhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, timertype: TimerType): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_ntCreateTimer((timerhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), timertype)

public actual fun ntOpenEvent(eventhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_ntOpenEvent((eventhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L))

public actual fun ntOpenProcess(processhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, clientid: COpaquePointer?): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_ntOpenProcess((processhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (clientid?.value ?: 0L))

public actual fun ntOpenTimer(timerhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_ntOpenTimer((timerhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L))

public actual fun ntQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: COpaquePointer?, processinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_ntQueryInformationProcess((processhandle?.value ?: 0L), processinformationclass, (processinformation?.value ?: 0L), processinformationlength.toInt(), (returnlength?.value ?: 0L))

public actual fun ntQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: COpaquePointer?, threadinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_ntQueryInformationThread((threadhandle?.value ?: 0L), threadinformationclass, (threadinformation?.value ?: 0L), threadinformationlength.toInt(), (returnlength?.value ?: 0L))

public actual fun ntSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: COpaquePointer?, threadinformationlength: UInt): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_ntSetInformationThread((threadhandle?.value ?: 0L), threadinformationclass, (threadinformation?.value ?: 0L), threadinformationlength.toInt())

public actual fun ntSetTimer(timerhandle: Handle, duetime: COpaquePointer?, timerapcroutine: PtimerApcRoutine, timercontext: COpaquePointer?, resumetimer: Boolean, period: Int, previousstate: COpaquePointer?): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_ntSetTimer((timerhandle?.value ?: 0L), (duetime?.value ?: 0L), 0L, (timercontext?.value ?: 0L), resumetimer, period, (previousstate?.value ?: 0L))

public actual fun ntSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: COpaquePointer?, timersetinformationlength: UInt): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_ntSetTimerEx((timerhandle?.value ?: 0L), timersetinformationclass, (timersetinformation?.value ?: 0L), timersetinformationlength.toInt())

public actual fun ntTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_ntTerminateProcess((processhandle?.value ?: 0L), exitstatus)

public actual fun ntWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: COpaquePointer?): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_ntWaitForSingleObject((handle?.value ?: 0L), alertable, (timeout?.value ?: 0L))

public actual fun zwCancelTimer(timerhandle: Handle, currentstate: COpaquePointer?): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_zwCancelTimer((timerhandle?.value ?: 0L), (currentstate?.value ?: 0L))

public actual fun zwCreateTimer(timerhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, timertype: TimerType): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_zwCreateTimer((timerhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), timertype)

public actual fun zwOpenEvent(eventhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_zwOpenEvent((eventhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L))

public actual fun zwOpenProcess(processhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, clientid: COpaquePointer?): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_zwOpenProcess((processhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (clientid?.value ?: 0L))

public actual fun zwOpenTimer(timerhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_zwOpenTimer((timerhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L))

public actual fun zwQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: COpaquePointer?, processinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_zwQueryInformationProcess((processhandle?.value ?: 0L), processinformationclass, (processinformation?.value ?: 0L), processinformationlength.toInt(), (returnlength?.value ?: 0L))

public actual fun zwQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: COpaquePointer?, threadinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_zwQueryInformationThread((threadhandle?.value ?: 0L), threadinformationclass, (threadinformation?.value ?: 0L), threadinformationlength.toInt(), (returnlength?.value ?: 0L))

public actual fun zwSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: COpaquePointer?, threadinformationlength: UInt): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_zwSetInformationThread((threadhandle?.value ?: 0L), threadinformationclass, (threadinformation?.value ?: 0L), threadinformationlength.toInt())

public actual fun zwSetTimer(timerhandle: Handle, duetime: COpaquePointer?, timerapcroutine: PtimerApcRoutine, timercontext: COpaquePointer?, resumetimer: Boolean, period: Int, previousstate: COpaquePointer?): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_zwSetTimer((timerhandle?.value ?: 0L), (duetime?.value ?: 0L), 0L, (timercontext?.value ?: 0L), resumetimer, period, (previousstate?.value ?: 0L))

public actual fun zwSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: COpaquePointer?, timersetinformationlength: UInt): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_zwSetTimerEx((timerhandle?.value ?: 0L), timersetinformationclass, (timersetinformation?.value ?: 0L), timersetinformationlength.toInt())

public actual fun zwTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_zwTerminateProcess((processhandle?.value ?: 0L), exitstatus)

public actual fun zwWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: COpaquePointer?): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssys_windows_wdk_system_threading_zwWaitForSingleObject((handle?.value ?: 0L), alertable, (timeout?.value ?: 0L))
