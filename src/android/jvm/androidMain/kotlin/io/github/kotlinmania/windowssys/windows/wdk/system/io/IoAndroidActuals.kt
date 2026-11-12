@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.io

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine

private object WindowsWdkSystemIoJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWdkSystemIoNtDeviceIoControlFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, iocontrolcode: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int): Int
}

public actual fun ntDeviceIoControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, iocontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt): Ntstatus =
    WindowsWdkSystemIoJniBridge.windowssysWindowsWdkSystemIoNtDeviceIoControlFile(filehandle.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, iostatusblock.rawAddress, iocontrolcode.toInt(), inputbuffer.rawAddress, inputbufferlength.toInt(), outputbuffer.rawAddress, outputbufferlength.toInt())
