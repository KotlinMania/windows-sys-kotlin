package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun bindIoCompletionCallback(filehandle: Handle, function: LpoverlappedCompletionRoutine, flags: UInt): Bool

public expect fun cancelIo(hfile: Handle): Bool

public expect fun cancelIoEx(hfile: Handle, lpoverlapped: ConstPtr): Bool

public expect fun cancelSynchronousIo(hthread: Handle): Bool

public expect fun createIoCompletionPort(filehandle: Handle, existingcompletionport: Handle, completionkey: ULong, numberofconcurrentthreads: UInt): Handle

public expect fun deviceIoControl(hdevice: Handle, dwiocontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpoverlapped: MutPtr): Bool

public expect fun getOverlappedResult(hfile: Handle, lpoverlapped: ConstPtr, lpnumberofbytestransferred: MutPtr, bwait: Bool): Bool

public expect fun getOverlappedResultEx(hfile: Handle, lpoverlapped: ConstPtr, lpnumberofbytestransferred: MutPtr, dwmilliseconds: UInt, balertable: Bool): Bool

public expect fun getQueuedCompletionStatus(completionport: Handle, lpnumberofbytestransferred: MutPtr, lpcompletionkey: MutPtr, lpoverlapped: MutPtr, dwmilliseconds: UInt): Bool

public expect fun getQueuedCompletionStatusEx(completionport: Handle, lpcompletionportentries: MutPtr, ulcount: UInt, ulnumentriesremoved: MutPtr, dwmilliseconds: UInt, falertable: Bool): Bool

public expect fun postQueuedCompletionStatus(completionport: Handle, dwnumberofbytestransferred: UInt, dwcompletionkey: ULong, lpoverlapped: ConstPtr): Bool
