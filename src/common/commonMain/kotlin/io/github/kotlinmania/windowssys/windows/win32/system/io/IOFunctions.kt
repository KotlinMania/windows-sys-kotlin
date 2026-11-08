package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun interface FnCallback {
    public operator fun invoke(dwerrorcode: UInt, dwnumberofbytestransfered: UInt, lpoverlapped: Long)
}

public fun BindIoCompletionCallback(filehandle: HANDLE, function: LPOVERLAPPED_COMPLETION_ROUTINE, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "BindIoCompletionCallback", longArrayOf(filehandle, Win32DynamicFfi.objectSlot(function), flags.toLong())).toInt()
}

public fun CancelIo(hfile: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CancelIo", longArrayOf(hfile)).toInt()
}

public fun CancelIoEx(hfile: HANDLE, lpoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CancelIoEx", longArrayOf(hfile, lpoverlapped)).toInt()
}

public fun CancelSynchronousIo(hthread: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CancelSynchronousIo", longArrayOf(hthread)).toInt()
}

public fun CreateIoCompletionPort(filehandle: HANDLE, existingcompletionport: HANDLE, completionkey: ULong, numberofconcurrentthreads: UInt): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateIoCompletionPort", longArrayOf(filehandle, existingcompletionport, completionkey.toLong(), numberofconcurrentthreads.toLong()))
}

public fun DeviceIoControl(hdevice: HANDLE, dwiocontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DeviceIoControl", longArrayOf(hdevice, dwiocontrolcode.toLong(), lpinbuffer, ninbuffersize.toLong(), lpoutbuffer, noutbuffersize.toLong(), lpbytesreturned, lpoverlapped)).toInt()
}

public fun GetOverlappedResult(hfile: HANDLE, lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: BOOL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetOverlappedResult", longArrayOf(hfile, lpoverlapped, lpnumberofbytestransferred, bwait.toLong())).toInt()
}

public fun GetOverlappedResultEx(hfile: HANDLE, lpoverlapped: Long, lpnumberofbytestransferred: Long, dwmilliseconds: UInt, balertable: BOOL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetOverlappedResultEx", longArrayOf(hfile, lpoverlapped, lpnumberofbytestransferred, dwmilliseconds.toLong(), balertable.toLong())).toInt()
}

public fun GetQueuedCompletionStatus(completionport: HANDLE, lpnumberofbytestransferred: Long, lpcompletionkey: Long, lpoverlapped: Long, dwmilliseconds: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetQueuedCompletionStatus", longArrayOf(completionport, lpnumberofbytestransferred, lpcompletionkey, lpoverlapped, dwmilliseconds.toLong())).toInt()
}

public fun GetQueuedCompletionStatusEx(completionport: HANDLE, lpcompletionportentries: Long, ulcount: UInt, ulnumentriesremoved: Long, dwmilliseconds: UInt, falertable: BOOL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetQueuedCompletionStatusEx", longArrayOf(completionport, lpcompletionportentries, ulcount.toLong(), ulnumentriesremoved, dwmilliseconds.toLong(), falertable.toLong())).toInt()
}

public fun PostQueuedCompletionStatus(completionport: HANDLE, dwnumberofbytestransferred: UInt, dwcompletionkey: ULong, lpoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "PostQueuedCompletionStatus", longArrayOf(completionport, dwnumberofbytestransferred.toLong(), dwcompletionkey.toLong(), lpoverlapped)).toInt()
}
