package io.github.kotlinmania.windowssys.windows.wdk.system.io

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.system.io.PIO_APC_ROUTINE

public fun NtDeviceIoControlFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, iocontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtDeviceIoControlFile", longArrayOf(filehandle, event, Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, iocontrolcode.toLong(), inputbuffer, inputbufferlength.toLong(), outputbuffer, outputbufferlength.toLong())).toInt()
}
