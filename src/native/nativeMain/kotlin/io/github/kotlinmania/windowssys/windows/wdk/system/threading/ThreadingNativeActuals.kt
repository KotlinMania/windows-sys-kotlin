@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.threading

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.PtimerApcRoutine
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TimerType
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ntCancelTimer(timerhandle: Handle, currentstate: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_ntCancelTimer(timerhandle?.value?.toCPointer<ByteVar>(), currentstate?.value?.toCPointer<ByteVar>())

public actual fun ntCreateTimer(timerhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, timertype: TimerType): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_ntCreateTimer(timerhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), timertype)

public actual fun ntOpenEvent(eventhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_ntOpenEvent(eventhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>())

public actual fun ntOpenProcess(processhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, clientid: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_ntOpenProcess(processhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), clientid?.value?.toCPointer<ByteVar>())

public actual fun ntOpenTimer(timerhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_ntOpenTimer(timerhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>())

public actual fun ntQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: COpaquePointer?, processinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_ntQueryInformationProcess(processhandle?.value?.toCPointer<ByteVar>(), processinformationclass, processinformation?.value?.toCPointer<ByteVar>(), processinformationlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun ntQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: COpaquePointer?, threadinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_ntQueryInformationThread(threadhandle?.value?.toCPointer<ByteVar>(), threadinformationclass, threadinformation?.value?.toCPointer<ByteVar>(), threadinformationlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun ntSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: COpaquePointer?, threadinformationlength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_ntSetInformationThread(threadhandle?.value?.toCPointer<ByteVar>(), threadinformationclass, threadinformation?.value?.toCPointer<ByteVar>(), threadinformationlength)

public actual fun ntSetTimer(timerhandle: Handle, duetime: COpaquePointer?, timerapcroutine: PtimerApcRoutine, timercontext: COpaquePointer?, resumetimer: Boolean, period: Int, previousstate: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_ntSetTimer(timerhandle?.value?.toCPointer<ByteVar>(), duetime?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), timercontext?.value?.toCPointer<ByteVar>(), resumetimer, period, previousstate?.value?.toCPointer<ByteVar>())

public actual fun ntSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: COpaquePointer?, timersetinformationlength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_ntSetTimerEx(timerhandle?.value?.toCPointer<ByteVar>(), timersetinformationclass, timersetinformation?.value?.toCPointer<ByteVar>(), timersetinformationlength)

public actual fun ntTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_ntTerminateProcess(processhandle?.value?.toCPointer<ByteVar>(), exitstatus)

public actual fun ntWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_ntWaitForSingleObject(handle?.value?.toCPointer<ByteVar>(), alertable, timeout?.value?.toCPointer<ByteVar>())

public actual fun zwCancelTimer(timerhandle: Handle, currentstate: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_zwCancelTimer(timerhandle?.value?.toCPointer<ByteVar>(), currentstate?.value?.toCPointer<ByteVar>())

public actual fun zwCreateTimer(timerhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, timertype: TimerType): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_zwCreateTimer(timerhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), timertype)

public actual fun zwOpenEvent(eventhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_zwOpenEvent(eventhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>())

public actual fun zwOpenProcess(processhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, clientid: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_zwOpenProcess(processhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), clientid?.value?.toCPointer<ByteVar>())

public actual fun zwOpenTimer(timerhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_zwOpenTimer(timerhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>())

public actual fun zwQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: COpaquePointer?, processinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_zwQueryInformationProcess(processhandle?.value?.toCPointer<ByteVar>(), processinformationclass, processinformation?.value?.toCPointer<ByteVar>(), processinformationlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun zwQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: COpaquePointer?, threadinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_zwQueryInformationThread(threadhandle?.value?.toCPointer<ByteVar>(), threadinformationclass, threadinformation?.value?.toCPointer<ByteVar>(), threadinformationlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun zwSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: COpaquePointer?, threadinformationlength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_zwSetInformationThread(threadhandle?.value?.toCPointer<ByteVar>(), threadinformationclass, threadinformation?.value?.toCPointer<ByteVar>(), threadinformationlength)

public actual fun zwSetTimer(timerhandle: Handle, duetime: COpaquePointer?, timerapcroutine: PtimerApcRoutine, timercontext: COpaquePointer?, resumetimer: Boolean, period: Int, previousstate: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_zwSetTimer(timerhandle?.value?.toCPointer<ByteVar>(), duetime?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), timercontext?.value?.toCPointer<ByteVar>(), resumetimer, period, previousstate?.value?.toCPointer<ByteVar>())

public actual fun zwSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: COpaquePointer?, timersetinformationlength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_zwSetTimerEx(timerhandle?.value?.toCPointer<ByteVar>(), timersetinformationclass, timersetinformation?.value?.toCPointer<ByteVar>(), timersetinformationlength)

public actual fun zwTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_zwTerminateProcess(processhandle?.value?.toCPointer<ByteVar>(), exitstatus)

public actual fun zwWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssys_windows_wdk_system_threading_zwWaitForSingleObject(handle?.value?.toCPointer<ByteVar>(), alertable, timeout?.value?.toCPointer<ByteVar>())
