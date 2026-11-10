package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun bindIoCompletionCallback(filehandle: Handle, function: LpoverlappedCompletionRoutine, flags: UInt): Bool

public expect fun cancelIo(hfile: Handle): Bool

public expect fun cancelIoEx(hfile: Handle, lpoverlapped: COpaquePointer?): Bool

public expect fun cancelSynchronousIo(hthread: Handle): Bool

public expect fun createIoCompletionPort(filehandle: Handle, existingcompletionport: Handle, completionkey: ULong, numberofconcurrentthreads: UInt): Handle

public expect fun deviceIoControl(hdevice: Handle, dwiocontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool

public expect fun getOverlappedResult(hfile: Handle, lpoverlapped: COpaquePointer?, lpnumberofbytestransferred: COpaquePointer?, bwait: Bool): Bool

public expect fun getOverlappedResultEx(hfile: Handle, lpoverlapped: COpaquePointer?, lpnumberofbytestransferred: COpaquePointer?, dwmilliseconds: UInt, balertable: Bool): Bool

public expect fun getQueuedCompletionStatus(completionport: Handle, lpnumberofbytestransferred: COpaquePointer?, lpcompletionkey: COpaquePointer?, lpoverlapped: COpaquePointer?, dwmilliseconds: UInt): Bool

public expect fun getQueuedCompletionStatusEx(completionport: Handle, lpcompletionportentries: COpaquePointer?, ulcount: UInt, ulnumentriesremoved: COpaquePointer?, dwmilliseconds: UInt, falertable: Bool): Bool

public expect fun postQueuedCompletionStatus(completionport: Handle, dwnumberofbytestransferred: UInt, dwcompletionkey: ULong, lpoverlapped: COpaquePointer?): Bool
