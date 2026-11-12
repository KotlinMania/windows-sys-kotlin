package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun bindIoCompletionCallback(filehandle: Handle, function: LpoverlappedCompletionRoutine, flags: UInt): Bool

public expect fun cancelIo(hfile: Handle): Bool

public expect fun cancelIoEx(hfile: Handle, lpoverlapped: ConstPtr<Overlapped>): Bool

public expect fun cancelSynchronousIo(hthread: Handle): Bool

public expect fun createIoCompletionPort(filehandle: Handle, existingcompletionport: Handle, completionkey: ULong, numberofconcurrentthreads: UInt): Handle

public expect fun deviceIoControl(hdevice: Handle, dwiocontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool

public expect fun getOverlappedResult(hfile: Handle, lpoverlapped: ConstPtr<Overlapped>, lpnumberofbytestransferred: MutPtr<UInt>, bwait: Bool): Bool

public expect fun getOverlappedResultEx(hfile: Handle, lpoverlapped: ConstPtr<Overlapped>, lpnumberofbytestransferred: MutPtr<UInt>, dwmilliseconds: UInt, balertable: Bool): Bool

public expect fun getQueuedCompletionStatus(completionport: Handle, lpnumberofbytestransferred: MutPtr<UInt>, lpcompletionkey: MutPtr<ULong>, lpoverlapped: MutPtr<MutPtr<Overlapped>>, dwmilliseconds: UInt): Bool

public expect fun getQueuedCompletionStatusEx(completionport: Handle, lpcompletionportentries: MutPtr<OverlappedEntry>, ulcount: UInt, ulnumentriesremoved: MutPtr<UInt>, dwmilliseconds: UInt, falertable: Bool): Bool

public expect fun postQueuedCompletionStatus(completionport: Handle, dwnumberofbytestransferred: UInt, dwcompletionkey: ULong, lpoverlapped: ConstPtr<Overlapped>): Bool
