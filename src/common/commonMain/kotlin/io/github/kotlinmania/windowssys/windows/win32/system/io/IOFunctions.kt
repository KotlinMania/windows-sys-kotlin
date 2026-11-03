package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL

public fun interface FnCallback {
    public operator fun invoke(dwerrorcode: UInt, dwnumberofbytestransfered: UInt, lpoverlapped: Long)
}

public fun BindIoCompletionCallback(filehandle: Foundation.HANDLE, function: LPOVERLAPPED_COMPLETION_ROUTINE, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "BindIoCompletionCallback", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), Win32DynamicFfi.objectSlot(function), flags.toLong())).toInt()
}

public fun CancelIo(hfile: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CancelIo", longArrayOf(Win32DynamicFfi.objectSlot(hfile))).toInt()
}

public fun CancelIoEx(hfile: Foundation.HANDLE, lpoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CancelIoEx", longArrayOf(Win32DynamicFfi.objectSlot(hfile), lpoverlapped)).toInt()
}

public fun CancelSynchronousIo(hthread: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CancelSynchronousIo", longArrayOf(Win32DynamicFfi.objectSlot(hthread))).toInt()
}

public fun CreateIoCompletionPort(filehandle: Foundation.HANDLE, existingcompletionport: Foundation.HANDLE, completionkey: ULong, numberofconcurrentthreads: UInt): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateIoCompletionPort", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), Win32DynamicFfi.objectSlot(existingcompletionport), completionkey.toLong(), numberofconcurrentthreads.toLong()))
    return Foundation.HANDLE()
}

public fun DeviceIoControl(hdevice: Foundation.HANDLE, dwiocontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DeviceIoControl", longArrayOf(Win32DynamicFfi.objectSlot(hdevice), dwiocontrolcode.toLong(), lpinbuffer, ninbuffersize.toLong(), lpoutbuffer, noutbuffersize.toLong(), lpbytesreturned, lpoverlapped)).toInt()
}

public fun GetOverlappedResult(hfile: Foundation.HANDLE, lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: BOOL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetOverlappedResult", longArrayOf(Win32DynamicFfi.objectSlot(hfile), lpoverlapped, lpnumberofbytestransferred, bwait.toLong())).toInt()
}

public fun GetOverlappedResultEx(hfile: Foundation.HANDLE, lpoverlapped: Long, lpnumberofbytestransferred: Long, dwmilliseconds: UInt, balertable: BOOL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetOverlappedResultEx", longArrayOf(Win32DynamicFfi.objectSlot(hfile), lpoverlapped, lpnumberofbytestransferred, dwmilliseconds.toLong(), balertable.toLong())).toInt()
}

public fun GetQueuedCompletionStatus(completionport: Foundation.HANDLE, lpnumberofbytestransferred: Long, lpcompletionkey: Long, lpoverlapped: Long, dwmilliseconds: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetQueuedCompletionStatus", longArrayOf(Win32DynamicFfi.objectSlot(completionport), lpnumberofbytestransferred, lpcompletionkey, lpoverlapped, dwmilliseconds.toLong())).toInt()
}

public fun GetQueuedCompletionStatusEx(completionport: Foundation.HANDLE, lpcompletionportentries: Long, ulcount: UInt, ulnumentriesremoved: Long, dwmilliseconds: UInt, falertable: BOOL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetQueuedCompletionStatusEx", longArrayOf(Win32DynamicFfi.objectSlot(completionport), lpcompletionportentries, ulcount.toLong(), ulnumentriesremoved, dwmilliseconds.toLong(), falertable.toLong())).toInt()
}

public fun PostQueuedCompletionStatus(completionport: Foundation.HANDLE, dwnumberofbytestransferred: UInt, dwcompletionkey: ULong, lpoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "PostQueuedCompletionStatus", longArrayOf(Win32DynamicFfi.objectSlot(completionport), dwnumberofbytestransferred.toLong(), dwcompletionkey.toLong(), lpoverlapped)).toInt()
}
