package io.github.kotlinmania.windowssys.windows.wdk.system.threading

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.PtimerApcRoutine
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TimerType

public expect fun ntCancelTimer(timerhandle: Handle, currentstate: MutPtr): Ntstatus

public expect fun ntCreateTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, timertype: TimerType): Ntstatus

public expect fun ntOpenEvent(eventhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus

public expect fun ntOpenProcess(processhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, clientid: ConstPtr): Ntstatus

public expect fun ntOpenTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus

public expect fun ntQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: MutPtr, processinformationlength: UInt, returnlength: MutPtr): Ntstatus

public expect fun ntQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: MutPtr, threadinformationlength: UInt, returnlength: MutPtr): Ntstatus

public expect fun ntSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: ConstPtr, threadinformationlength: UInt): Ntstatus

public expect fun ntSetTimer(timerhandle: Handle, duetime: ConstPtr, timerapcroutine: PtimerApcRoutine, timercontext: ConstPtr, resumetimer: Boolean, period: Int, previousstate: MutPtr): Ntstatus

public expect fun ntSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: MutPtr, timersetinformationlength: UInt): Ntstatus

public expect fun ntTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus

public expect fun ntWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: MutPtr): Ntstatus

public expect fun zwCancelTimer(timerhandle: Handle, currentstate: MutPtr): Ntstatus

public expect fun zwCreateTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, timertype: TimerType): Ntstatus

public expect fun zwOpenEvent(eventhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus

public expect fun zwOpenProcess(processhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, clientid: ConstPtr): Ntstatus

public expect fun zwOpenTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus

public expect fun zwQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: MutPtr, processinformationlength: UInt, returnlength: MutPtr): Ntstatus

public expect fun zwQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: MutPtr, threadinformationlength: UInt, returnlength: MutPtr): Ntstatus

public expect fun zwSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: ConstPtr, threadinformationlength: UInt): Ntstatus

public expect fun zwSetTimer(timerhandle: Handle, duetime: ConstPtr, timerapcroutine: PtimerApcRoutine, timercontext: ConstPtr, resumetimer: Boolean, period: Int, previousstate: MutPtr): Ntstatus

public expect fun zwSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: MutPtr, timersetinformationlength: UInt): Ntstatus

public expect fun zwTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus

public expect fun zwWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: ConstPtr): Ntstatus
