@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssysWindowsWin32SystemIoBindIoCompletionCallback
import io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssysWindowsWin32SystemIoCancelIo
import io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssysWindowsWin32SystemIoCancelIoEx
import io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssysWindowsWin32SystemIoCancelSynchronousIo
import io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssysWindowsWin32SystemIoCreateIoCompletionPort
import io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssysWindowsWin32SystemIoDeviceIoControl
import io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssysWindowsWin32SystemIoGetOverlappedResult
import io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssysWindowsWin32SystemIoGetOverlappedResultEx
import io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssysWindowsWin32SystemIoGetQueuedCompletionStatus
import io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssysWindowsWin32SystemIoGetQueuedCompletionStatusEx
import io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssysWindowsWin32SystemIoPostQueuedCompletionStatus
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun bindIoCompletionCallback(filehandle: Handle, function: LpoverlappedCompletionRoutine, flags: UInt): Bool =
    windowssysWindowsWin32SystemIoBindIoCompletionCallback(filehandle.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), flags)

public actual fun cancelIo(hfile: Handle): Bool =
    windowssysWindowsWin32SystemIoCancelIo(hfile.rawAddress.toCPointer<ByteVar>())

public actual fun cancelIoEx(hfile: Handle, lpoverlapped: ConstPtr): Bool =
    windowssysWindowsWin32SystemIoCancelIoEx(hfile.rawAddress.toCPointer<ByteVar>(), lpoverlapped.rawAddress.toCPointer<ByteVar>())

public actual fun cancelSynchronousIo(hthread: Handle): Bool =
    windowssysWindowsWin32SystemIoCancelSynchronousIo(hthread.rawAddress.toCPointer<ByteVar>())

public actual fun createIoCompletionPort(filehandle: Handle, existingcompletionport: Handle, completionkey: ULong, numberofconcurrentthreads: UInt): Handle =
    MutPtr(windowssysWindowsWin32SystemIoCreateIoCompletionPort(filehandle.rawAddress.toCPointer<ByteVar>(), existingcompletionport.rawAddress.toCPointer<ByteVar>(), completionkey, numberofconcurrentthreads)?.toLong() ?: 0L)

public actual fun deviceIoControl(hdevice: Handle, dwiocontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpoverlapped: MutPtr): Bool =
    windowssysWindowsWin32SystemIoDeviceIoControl(hdevice.rawAddress.toCPointer<ByteVar>(), dwiocontrolcode, lpinbuffer.rawAddress.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer.rawAddress.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned.rawAddress.toCPointer<ByteVar>(), lpoverlapped.rawAddress.toCPointer<ByteVar>())

public actual fun getOverlappedResult(hfile: Handle, lpoverlapped: ConstPtr, lpnumberofbytestransferred: MutPtr, bwait: Bool): Bool =
    windowssysWindowsWin32SystemIoGetOverlappedResult(hfile.rawAddress.toCPointer<ByteVar>(), lpoverlapped.rawAddress.toCPointer<ByteVar>(), lpnumberofbytestransferred.rawAddress.toCPointer<ByteVar>(), bwait)

public actual fun getOverlappedResultEx(hfile: Handle, lpoverlapped: ConstPtr, lpnumberofbytestransferred: MutPtr, dwmilliseconds: UInt, balertable: Bool): Bool =
    windowssysWindowsWin32SystemIoGetOverlappedResultEx(hfile.rawAddress.toCPointer<ByteVar>(), lpoverlapped.rawAddress.toCPointer<ByteVar>(), lpnumberofbytestransferred.rawAddress.toCPointer<ByteVar>(), dwmilliseconds, balertable)

public actual fun getQueuedCompletionStatus(completionport: Handle, lpnumberofbytestransferred: MutPtr, lpcompletionkey: MutPtr, lpoverlapped: MutPtr, dwmilliseconds: UInt): Bool =
    windowssysWindowsWin32SystemIoGetQueuedCompletionStatus(completionport.rawAddress.toCPointer<ByteVar>(), lpnumberofbytestransferred.rawAddress.toCPointer<ByteVar>(), lpcompletionkey.rawAddress.toCPointer<ByteVar>(), lpoverlapped.rawAddress.toCPointer<ByteVar>(), dwmilliseconds)

public actual fun getQueuedCompletionStatusEx(completionport: Handle, lpcompletionportentries: MutPtr, ulcount: UInt, ulnumentriesremoved: MutPtr, dwmilliseconds: UInt, falertable: Bool): Bool =
    windowssysWindowsWin32SystemIoGetQueuedCompletionStatusEx(completionport.rawAddress.toCPointer<ByteVar>(), lpcompletionportentries.rawAddress.toCPointer<ByteVar>(), ulcount, ulnumentriesremoved.rawAddress.toCPointer<ByteVar>(), dwmilliseconds, falertable)

public actual fun postQueuedCompletionStatus(completionport: Handle, dwnumberofbytestransferred: UInt, dwcompletionkey: ULong, lpoverlapped: ConstPtr): Bool =
    windowssysWindowsWin32SystemIoPostQueuedCompletionStatus(completionport.rawAddress.toCPointer<ByteVar>(), dwnumberofbytestransferred, dwcompletionkey, lpoverlapped.rawAddress.toCPointer<ByteVar>())
