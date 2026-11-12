package io.github.kotlinmania.windowssys.windows.wdk.system.threading

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectAttributes
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.PtimerApcRoutine
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TimerType
import io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.ClientId

public expect fun ntCancelTimer(timerhandle: Handle, currentstate: MutPtr<Boolean>): Ntstatus

public expect fun ntCreateTimer(timerhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, timertype: TimerType): Ntstatus

public expect fun ntOpenEvent(eventhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus

public expect fun ntOpenProcess(processhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, clientid: ConstPtr<ClientId>): Ntstatus

public expect fun ntOpenTimer(timerhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus

public expect fun ntQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: MutPtr<CVoid>, processinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus

public expect fun ntQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: MutPtr<CVoid>, threadinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus

public expect fun ntSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: ConstPtr<CVoid>, threadinformationlength: UInt): Ntstatus

public expect fun ntSetTimer(timerhandle: Handle, duetime: ConstPtr<Long>, timerapcroutine: PtimerApcRoutine, timercontext: ConstPtr<CVoid>, resumetimer: Boolean, period: Int, previousstate: MutPtr<Boolean>): Ntstatus

public expect fun ntSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: MutPtr<CVoid>, timersetinformationlength: UInt): Ntstatus

public expect fun ntTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus

public expect fun ntWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: MutPtr<Long>): Ntstatus

public expect fun zwCancelTimer(timerhandle: Handle, currentstate: MutPtr<Boolean>): Ntstatus

public expect fun zwCreateTimer(timerhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, timertype: TimerType): Ntstatus

public expect fun zwOpenEvent(eventhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus

public expect fun zwOpenProcess(processhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, clientid: ConstPtr<ClientId>): Ntstatus

public expect fun zwOpenTimer(timerhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus

public expect fun zwQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: MutPtr<CVoid>, processinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus

public expect fun zwQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: MutPtr<CVoid>, threadinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus

public expect fun zwSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: ConstPtr<CVoid>, threadinformationlength: UInt): Ntstatus

public expect fun zwSetTimer(timerhandle: Handle, duetime: ConstPtr<Long>, timerapcroutine: PtimerApcRoutine, timercontext: ConstPtr<CVoid>, resumetimer: Boolean, period: Int, previousstate: MutPtr<Boolean>): Ntstatus

public expect fun zwSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: MutPtr<CVoid>, timersetinformationlength: UInt): Ntstatus

public expect fun zwTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus

public expect fun zwWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: ConstPtr<Long>): Ntstatus
