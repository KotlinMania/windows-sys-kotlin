@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun BindIoCompletionCallback(filehandle: HANDLE, function: LPOVERLAPPED_COMPLETION_ROUTINE, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssys_windows_win32_system_io_BindIoCompletionCallback(filehandle.toCPointer<ByteVar>(), function.toLong().toCPointer<ByteVar>(), flags)

public actual fun CancelIo(hfile: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssys_windows_win32_system_io_CancelIo(hfile.toCPointer<ByteVar>())

public actual fun CancelIoEx(hfile: HANDLE, lpoverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssys_windows_win32_system_io_CancelIoEx(hfile.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>())

public actual fun CancelSynchronousIo(hthread: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssys_windows_win32_system_io_CancelSynchronousIo(hthread.toCPointer<ByteVar>())

public actual fun CreateIoCompletionPort(filehandle: HANDLE, existingcompletionport: HANDLE, completionkey: ULong, numberofconcurrentthreads: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssys_windows_win32_system_io_CreateIoCompletionPort(filehandle.toCPointer<ByteVar>(), existingcompletionport.toCPointer<ByteVar>(), completionkey, numberofconcurrentthreads)?.toLong() ?: 0L

public actual fun DeviceIoControl(hdevice: HANDLE, dwiocontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpoverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssys_windows_win32_system_io_DeviceIoControl(hdevice.toCPointer<ByteVar>(), dwiocontrolcode, lpinbuffer.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>())

public actual fun GetOverlappedResult(hfile: HANDLE, lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssys_windows_win32_system_io_GetOverlappedResult(hfile.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>(), lpnumberofbytestransferred.toCPointer<ByteVar>(), bwait)

public actual fun GetOverlappedResultEx(hfile: HANDLE, lpoverlapped: Long, lpnumberofbytestransferred: Long, dwmilliseconds: UInt, balertable: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssys_windows_win32_system_io_GetOverlappedResultEx(hfile.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>(), lpnumberofbytestransferred.toCPointer<ByteVar>(), dwmilliseconds, balertable)

public actual fun GetQueuedCompletionStatus(completionport: HANDLE, lpnumberofbytestransferred: Long, lpcompletionkey: Long, lpoverlapped: Long, dwmilliseconds: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssys_windows_win32_system_io_GetQueuedCompletionStatus(completionport.toCPointer<ByteVar>(), lpnumberofbytestransferred.toCPointer<ByteVar>(), lpcompletionkey.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>(), dwmilliseconds)

public actual fun GetQueuedCompletionStatusEx(completionport: HANDLE, lpcompletionportentries: Long, ulcount: UInt, ulnumentriesremoved: Long, dwmilliseconds: UInt, falertable: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssys_windows_win32_system_io_GetQueuedCompletionStatusEx(completionport.toCPointer<ByteVar>(), lpcompletionportentries.toCPointer<ByteVar>(), ulcount, ulnumentriesremoved.toCPointer<ByteVar>(), dwmilliseconds, falertable)

public actual fun PostQueuedCompletionStatus(completionport: HANDLE, dwnumberofbytestransferred: UInt, dwcompletionkey: ULong, lpoverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssys_windows_win32_system_io_PostQueuedCompletionStatus(completionport.toCPointer<ByteVar>(), dwnumberofbytestransferred, dwcompletionkey, lpoverlapped.toCPointer<ByteVar>())
