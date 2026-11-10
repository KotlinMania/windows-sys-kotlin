@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.io

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ntDeviceIoControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, iocontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.io.cinterop.windowssys_windows_wdk_system_io_ntDeviceIoControlFile(filehandle?.value?.toCPointer<ByteVar>(), event?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), apccontext?.value?.toCPointer<ByteVar>(), iostatusblock?.value?.toCPointer<ByteVar>(), iocontrolcode, inputbuffer?.value?.toCPointer<ByteVar>(), inputbufferlength, outputbuffer?.value?.toCPointer<ByteVar>(), outputbufferlength)
