@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.threading

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.PtimerApcRoutine
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TimerType

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun ntCancelTimer(timerhandle: Handle, currentstate: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingNtCancelTimer")

public actual fun ntCreateTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, timertype: TimerType): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingNtCreateTimer")

public actual fun ntOpenEvent(eventhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingNtOpenEvent")

public actual fun ntOpenProcess(processhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, clientid: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingNtOpenProcess")

public actual fun ntOpenTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingNtOpenTimer")

public actual fun ntQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: MutPtr, processinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingNtQueryInformationProcess")

public actual fun ntQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: MutPtr, threadinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingNtQueryInformationThread")

public actual fun ntSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: ConstPtr, threadinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingNtSetInformationThread")

public actual fun ntSetTimer(timerhandle: Handle, duetime: ConstPtr, timerapcroutine: PtimerApcRoutine, timercontext: ConstPtr, resumetimer: Boolean, period: Int, previousstate: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingNtSetTimer")

public actual fun ntSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: MutPtr, timersetinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingNtSetTimerEx")

public actual fun ntTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingNtTerminateProcess")

public actual fun ntWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingNtWaitForSingleObject")

public actual fun zwCancelTimer(timerhandle: Handle, currentstate: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingZwCancelTimer")

public actual fun zwCreateTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, timertype: TimerType): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingZwCreateTimer")

public actual fun zwOpenEvent(eventhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingZwOpenEvent")

public actual fun zwOpenProcess(processhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, clientid: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingZwOpenProcess")

public actual fun zwOpenTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingZwOpenTimer")

public actual fun zwQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: MutPtr, processinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingZwQueryInformationProcess")

public actual fun zwQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: MutPtr, threadinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingZwQueryInformationThread")

public actual fun zwSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: ConstPtr, threadinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingZwSetInformationThread")

public actual fun zwSetTimer(timerhandle: Handle, duetime: ConstPtr, timerapcroutine: PtimerApcRoutine, timercontext: ConstPtr, resumetimer: Boolean, period: Int, previousstate: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingZwSetTimer")

public actual fun zwSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: MutPtr, timersetinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingZwSetTimerEx")

public actual fun zwTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingZwTerminateProcess")

public actual fun zwWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemThreadingZwWaitForSingleObject")
