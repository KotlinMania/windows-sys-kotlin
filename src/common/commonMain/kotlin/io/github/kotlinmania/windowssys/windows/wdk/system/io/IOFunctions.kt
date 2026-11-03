package io.github.kotlinmania.windowssys.windows.wdk.system.io

import io.github.kotlinmania.windowssys.Win32DynamicFfi

public fun NtDeviceIoControlFile(filehandle: Win32.Foundation.HANDLE, event: Win32.Foundation.HANDLE, apcroutine: Win32.System.IO.PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, iocontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtDeviceIoControlFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), Win32DynamicFfi.objectSlot(event), Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, iocontrolcode.toLong(), inputbuffer, inputbufferlength.toLong(), outputbuffer, outputbufferlength.toLong()))
    return Win32.Foundation.NTSTATUS()
}
