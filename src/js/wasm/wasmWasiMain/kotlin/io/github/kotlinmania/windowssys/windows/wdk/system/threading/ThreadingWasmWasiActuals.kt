@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.threading

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.PtimerApcRoutine
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TimerType

public actual fun ntCancelTimer(timerhandle: Handle, currentstate: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntCreateTimer(timerhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, timertype: TimerType): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntOpenEvent(eventhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntOpenProcess(processhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, clientid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntOpenTimer(timerhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: COpaquePointer?, processinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: COpaquePointer?, threadinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: COpaquePointer?, threadinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntSetTimer(timerhandle: Handle, duetime: COpaquePointer?, timerapcroutine: PtimerApcRoutine, timercontext: COpaquePointer?, resumetimer: Boolean, period: Int, previousstate: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: COpaquePointer?, timersetinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwCancelTimer(timerhandle: Handle, currentstate: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwCreateTimer(timerhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, timertype: TimerType): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwOpenEvent(eventhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwOpenProcess(processhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, clientid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwOpenTimer(timerhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: COpaquePointer?, processinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: COpaquePointer?, threadinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: COpaquePointer?, threadinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwSetTimer(timerhandle: Handle, duetime: COpaquePointer?, timerapcroutine: PtimerApcRoutine, timercontext: COpaquePointer?, resumetimer: Boolean, period: Int, previousstate: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: COpaquePointer?, timersetinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
