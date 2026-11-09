package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public expect fun BindIoCompletionCallback(filehandle: HANDLE, function: LPOVERLAPPED_COMPLETION_ROUTINE, flags: UInt): BOOL

public expect fun CancelIo(hfile: HANDLE): BOOL

public expect fun CancelIoEx(hfile: HANDLE, lpoverlapped: Long): BOOL

public expect fun CancelSynchronousIo(hthread: HANDLE): BOOL

public expect fun CreateIoCompletionPort(filehandle: HANDLE, existingcompletionport: HANDLE, completionkey: ULong, numberofconcurrentthreads: UInt): HANDLE

public expect fun DeviceIoControl(hdevice: HANDLE, dwiocontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpoverlapped: Long): BOOL

public expect fun GetOverlappedResult(hfile: HANDLE, lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: BOOL): BOOL

public expect fun GetOverlappedResultEx(hfile: HANDLE, lpoverlapped: Long, lpnumberofbytestransferred: Long, dwmilliseconds: UInt, balertable: BOOL): BOOL

public expect fun GetQueuedCompletionStatus(completionport: HANDLE, lpnumberofbytestransferred: Long, lpcompletionkey: Long, lpoverlapped: Long, dwmilliseconds: UInt): BOOL

public expect fun GetQueuedCompletionStatusEx(completionport: HANDLE, lpcompletionportentries: Long, ulcount: UInt, ulnumentriesremoved: Long, dwmilliseconds: UInt, falertable: BOOL): BOOL

public expect fun PostQueuedCompletionStatus(completionport: HANDLE, dwnumberofbytestransferred: UInt, dwcompletionkey: ULong, lpoverlapped: Long): BOOL
