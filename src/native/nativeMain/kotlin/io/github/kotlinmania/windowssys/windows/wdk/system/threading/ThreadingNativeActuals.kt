@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.threading

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.PtimerApcRoutine
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingNtCancelTimer
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingNtCreateTimer
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingNtOpenEvent
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingNtOpenProcess
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingNtOpenTimer
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingNtQueryInformationProcess
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingNtQueryInformationThread
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingNtSetInformationThread
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingNtSetTimer
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingNtSetTimerEx
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingNtTerminateProcess
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingNtWaitForSingleObject
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingZwCancelTimer
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingZwCreateTimer
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingZwOpenEvent
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingZwOpenProcess
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingZwOpenTimer
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingZwQueryInformationProcess
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingZwQueryInformationThread
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingZwSetInformationThread
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingZwSetTimer
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingZwSetTimerEx
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingZwTerminateProcess
import io.github.kotlinmania.windowssys.windows.wdk.system.threading.cinterop.windowssysWindowsWdkSystemThreadingZwWaitForSingleObject
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TimerType
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ntCancelTimer(timerhandle: Handle, currentstate: MutPtr): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtCancelTimer(timerhandle.rawAddress.toCPointer<ByteVar>(), currentstate.rawAddress.toCPointer<ByteVar>())

public actual fun ntCreateTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, timertype: TimerType): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtCreateTimer(timerhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>(), timertype)

public actual fun ntOpenEvent(eventhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtOpenEvent(eventhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>())

public actual fun ntOpenProcess(processhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, clientid: ConstPtr): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtOpenProcess(processhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>(), clientid.rawAddress.toCPointer<ByteVar>())

public actual fun ntOpenTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtOpenTimer(timerhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>())

public actual fun ntQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: MutPtr, processinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtQueryInformationProcess(processhandle.rawAddress.toCPointer<ByteVar>(), processinformationclass, processinformation.rawAddress.toCPointer<ByteVar>(), processinformationlength, returnlength.rawAddress.toCPointer<ByteVar>())

public actual fun ntQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: MutPtr, threadinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtQueryInformationThread(threadhandle.rawAddress.toCPointer<ByteVar>(), threadinformationclass, threadinformation.rawAddress.toCPointer<ByteVar>(), threadinformationlength, returnlength.rawAddress.toCPointer<ByteVar>())

public actual fun ntSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: ConstPtr, threadinformationlength: UInt): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtSetInformationThread(threadhandle.rawAddress.toCPointer<ByteVar>(), threadinformationclass, threadinformation.rawAddress.toCPointer<ByteVar>(), threadinformationlength)

public actual fun ntSetTimer(timerhandle: Handle, duetime: ConstPtr, timerapcroutine: PtimerApcRoutine, timercontext: ConstPtr, resumetimer: Boolean, period: Int, previousstate: MutPtr): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtSetTimer(timerhandle.rawAddress.toCPointer<ByteVar>(), duetime.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), timercontext.rawAddress.toCPointer<ByteVar>(), resumetimer, period, previousstate.rawAddress.toCPointer<ByteVar>())

public actual fun ntSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: MutPtr, timersetinformationlength: UInt): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtSetTimerEx(timerhandle.rawAddress.toCPointer<ByteVar>(), timersetinformationclass, timersetinformation.rawAddress.toCPointer<ByteVar>(), timersetinformationlength)

public actual fun ntTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtTerminateProcess(processhandle.rawAddress.toCPointer<ByteVar>(), exitstatus)

public actual fun ntWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: MutPtr): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtWaitForSingleObject(handle.rawAddress.toCPointer<ByteVar>(), alertable, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun zwCancelTimer(timerhandle: Handle, currentstate: MutPtr): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwCancelTimer(timerhandle.rawAddress.toCPointer<ByteVar>(), currentstate.rawAddress.toCPointer<ByteVar>())

public actual fun zwCreateTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, timertype: TimerType): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwCreateTimer(timerhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>(), timertype)

public actual fun zwOpenEvent(eventhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwOpenEvent(eventhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>())

public actual fun zwOpenProcess(processhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, clientid: ConstPtr): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwOpenProcess(processhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>(), clientid.rawAddress.toCPointer<ByteVar>())

public actual fun zwOpenTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwOpenTimer(timerhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>())

public actual fun zwQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: MutPtr, processinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwQueryInformationProcess(processhandle.rawAddress.toCPointer<ByteVar>(), processinformationclass, processinformation.rawAddress.toCPointer<ByteVar>(), processinformationlength, returnlength.rawAddress.toCPointer<ByteVar>())

public actual fun zwQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: MutPtr, threadinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwQueryInformationThread(threadhandle.rawAddress.toCPointer<ByteVar>(), threadinformationclass, threadinformation.rawAddress.toCPointer<ByteVar>(), threadinformationlength, returnlength.rawAddress.toCPointer<ByteVar>())

public actual fun zwSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: ConstPtr, threadinformationlength: UInt): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwSetInformationThread(threadhandle.rawAddress.toCPointer<ByteVar>(), threadinformationclass, threadinformation.rawAddress.toCPointer<ByteVar>(), threadinformationlength)

public actual fun zwSetTimer(timerhandle: Handle, duetime: ConstPtr, timerapcroutine: PtimerApcRoutine, timercontext: ConstPtr, resumetimer: Boolean, period: Int, previousstate: MutPtr): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwSetTimer(timerhandle.rawAddress.toCPointer<ByteVar>(), duetime.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), timercontext.rawAddress.toCPointer<ByteVar>(), resumetimer, period, previousstate.rawAddress.toCPointer<ByteVar>())

public actual fun zwSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: MutPtr, timersetinformationlength: UInt): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwSetTimerEx(timerhandle.rawAddress.toCPointer<ByteVar>(), timersetinformationclass, timersetinformation.rawAddress.toCPointer<ByteVar>(), timersetinformationlength)

public actual fun zwTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwTerminateProcess(processhandle.rawAddress.toCPointer<ByteVar>(), exitstatus)

public actual fun zwWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: ConstPtr): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwWaitForSingleObject(handle.rawAddress.toCPointer<ByteVar>(), alertable, timeout.rawAddress.toCPointer<ByteVar>())
