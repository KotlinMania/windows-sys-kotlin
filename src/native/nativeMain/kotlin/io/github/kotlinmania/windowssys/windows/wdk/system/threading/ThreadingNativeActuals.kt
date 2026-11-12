@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.threading

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectAttributes
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
import io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.ClientId
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ntCancelTimer(timerhandle: Handle, currentstate: MutPtr<Boolean>): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtCancelTimer(timerhandle.rawAddress.toCPointer<ByteVar>(), currentstate.rawAddress.toCPointer<ByteVar>())

public actual fun ntCreateTimer(timerhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, timertype: TimerType): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtCreateTimer(timerhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>(), timertype)

public actual fun ntOpenEvent(eventhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtOpenEvent(eventhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>())

public actual fun ntOpenProcess(processhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, clientid: ConstPtr<ClientId>): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtOpenProcess(processhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>(), clientid.rawAddress.toCPointer<ByteVar>())

public actual fun ntOpenTimer(timerhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtOpenTimer(timerhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>())

public actual fun ntQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: MutPtr<CVoid>, processinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtQueryInformationProcess(processhandle.rawAddress.toCPointer<ByteVar>(), processinformationclass, processinformation.rawAddress.toCPointer<ByteVar>(), processinformationlength, returnlength.rawAddress.toCPointer<ByteVar>())

public actual fun ntQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: MutPtr<CVoid>, threadinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtQueryInformationThread(threadhandle.rawAddress.toCPointer<ByteVar>(), threadinformationclass, threadinformation.rawAddress.toCPointer<ByteVar>(), threadinformationlength, returnlength.rawAddress.toCPointer<ByteVar>())

public actual fun ntSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: ConstPtr<CVoid>, threadinformationlength: UInt): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtSetInformationThread(threadhandle.rawAddress.toCPointer<ByteVar>(), threadinformationclass, threadinformation.rawAddress.toCPointer<ByteVar>(), threadinformationlength)

public actual fun ntSetTimer(timerhandle: Handle, duetime: ConstPtr<Long>, timerapcroutine: PtimerApcRoutine, timercontext: ConstPtr<CVoid>, resumetimer: Boolean, period: Int, previousstate: MutPtr<Boolean>): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtSetTimer(timerhandle.rawAddress.toCPointer<ByteVar>(), duetime.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), timercontext.rawAddress.toCPointer<ByteVar>(), resumetimer, period, previousstate.rawAddress.toCPointer<ByteVar>())

public actual fun ntSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: MutPtr<CVoid>, timersetinformationlength: UInt): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtSetTimerEx(timerhandle.rawAddress.toCPointer<ByteVar>(), timersetinformationclass, timersetinformation.rawAddress.toCPointer<ByteVar>(), timersetinformationlength)

public actual fun ntTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtTerminateProcess(processhandle.rawAddress.toCPointer<ByteVar>(), exitstatus)

public actual fun ntWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: MutPtr<Long>): Ntstatus =
    windowssysWindowsWdkSystemThreadingNtWaitForSingleObject(handle.rawAddress.toCPointer<ByteVar>(), alertable, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun zwCancelTimer(timerhandle: Handle, currentstate: MutPtr<Boolean>): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwCancelTimer(timerhandle.rawAddress.toCPointer<ByteVar>(), currentstate.rawAddress.toCPointer<ByteVar>())

public actual fun zwCreateTimer(timerhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, timertype: TimerType): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwCreateTimer(timerhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>(), timertype)

public actual fun zwOpenEvent(eventhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwOpenEvent(eventhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>())

public actual fun zwOpenProcess(processhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, clientid: ConstPtr<ClientId>): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwOpenProcess(processhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>(), clientid.rawAddress.toCPointer<ByteVar>())

public actual fun zwOpenTimer(timerhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwOpenTimer(timerhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>())

public actual fun zwQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: MutPtr<CVoid>, processinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwQueryInformationProcess(processhandle.rawAddress.toCPointer<ByteVar>(), processinformationclass, processinformation.rawAddress.toCPointer<ByteVar>(), processinformationlength, returnlength.rawAddress.toCPointer<ByteVar>())

public actual fun zwQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: MutPtr<CVoid>, threadinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwQueryInformationThread(threadhandle.rawAddress.toCPointer<ByteVar>(), threadinformationclass, threadinformation.rawAddress.toCPointer<ByteVar>(), threadinformationlength, returnlength.rawAddress.toCPointer<ByteVar>())

public actual fun zwSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: ConstPtr<CVoid>, threadinformationlength: UInt): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwSetInformationThread(threadhandle.rawAddress.toCPointer<ByteVar>(), threadinformationclass, threadinformation.rawAddress.toCPointer<ByteVar>(), threadinformationlength)

public actual fun zwSetTimer(timerhandle: Handle, duetime: ConstPtr<Long>, timerapcroutine: PtimerApcRoutine, timercontext: ConstPtr<CVoid>, resumetimer: Boolean, period: Int, previousstate: MutPtr<Boolean>): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwSetTimer(timerhandle.rawAddress.toCPointer<ByteVar>(), duetime.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), timercontext.rawAddress.toCPointer<ByteVar>(), resumetimer, period, previousstate.rawAddress.toCPointer<ByteVar>())

public actual fun zwSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: MutPtr<CVoid>, timersetinformationlength: UInt): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwSetTimerEx(timerhandle.rawAddress.toCPointer<ByteVar>(), timersetinformationclass, timersetinformation.rawAddress.toCPointer<ByteVar>(), timersetinformationlength)

public actual fun zwTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwTerminateProcess(processhandle.rawAddress.toCPointer<ByteVar>(), exitstatus)

public actual fun zwWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: ConstPtr<Long>): Ntstatus =
    windowssysWindowsWdkSystemThreadingZwWaitForSingleObject(handle.rawAddress.toCPointer<ByteVar>(), alertable, timeout.rawAddress.toCPointer<ByteVar>())
