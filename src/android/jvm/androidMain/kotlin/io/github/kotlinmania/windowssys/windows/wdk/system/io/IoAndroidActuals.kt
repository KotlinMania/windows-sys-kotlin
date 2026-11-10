@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.io

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine

private object WindowsWdkSystemIoJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_system_io_ntDeviceIoControlFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, iocontrolcode: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int): Int
}

public actual fun ntDeviceIoControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, iocontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    WindowsWdkSystemIoJniBridge.windowssys_windows_wdk_system_io_ntDeviceIoControlFile((filehandle?.value ?: 0L), (event?.value ?: 0L), 0L, (apccontext?.value ?: 0L), (iostatusblock?.value ?: 0L), iocontrolcode.toInt(), (inputbuffer?.value ?: 0L), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L), outputbufferlength.toInt())
