@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssys_windows_win32_system_io_bindIoCompletionCallback
import io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssys_windows_win32_system_io_cancelIo
import io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssys_windows_win32_system_io_cancelIoEx
import io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssys_windows_win32_system_io_cancelSynchronousIo
import io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssys_windows_win32_system_io_createIoCompletionPort
import io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssys_windows_win32_system_io_deviceIoControl
import io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssys_windows_win32_system_io_getOverlappedResult
import io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssys_windows_win32_system_io_getOverlappedResultEx
import io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssys_windows_win32_system_io_getQueuedCompletionStatus
import io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssys_windows_win32_system_io_getQueuedCompletionStatusEx
import io.github.kotlinmania.windowssys.windows.win32.system.io.cinterop.windowssys_windows_win32_system_io_postQueuedCompletionStatus
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun bindIoCompletionCallback(filehandle: Handle, function: LpoverlappedCompletionRoutine, flags: UInt): Bool =
    windowssys_windows_win32_system_io_bindIoCompletionCallback(filehandle?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), flags)

public actual fun cancelIo(hfile: Handle): Bool =
    windowssys_windows_win32_system_io_cancelIo(hfile?.value?.toCPointer<ByteVar>())

public actual fun cancelIoEx(hfile: Handle, lpoverlapped: COpaquePointer?): Bool =
    windowssys_windows_win32_system_io_cancelIoEx(hfile?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun cancelSynchronousIo(hthread: Handle): Bool =
    windowssys_windows_win32_system_io_cancelSynchronousIo(hthread?.value?.toCPointer<ByteVar>())

public actual fun createIoCompletionPort(filehandle: Handle, existingcompletionport: Handle, completionkey: ULong, numberofconcurrentthreads: UInt): Handle =
    windowssys_windows_win32_system_io_createIoCompletionPort(filehandle?.value?.toCPointer<ByteVar>(), existingcompletionport?.value?.toCPointer<ByteVar>(), completionkey, numberofconcurrentthreads)?.let { COpaquePointer(it.toLong()) }

public actual fun deviceIoControl(hdevice: Handle, dwiocontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    windowssys_windows_win32_system_io_deviceIoControl(hdevice?.value?.toCPointer<ByteVar>(), dwiocontrolcode, lpinbuffer?.value?.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun getOverlappedResult(hfile: Handle, lpoverlapped: COpaquePointer?, lpnumberofbytestransferred: COpaquePointer?, bwait: Bool): Bool =
    windowssys_windows_win32_system_io_getOverlappedResult(hfile?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>(), lpnumberofbytestransferred?.value?.toCPointer<ByteVar>(), bwait)

public actual fun getOverlappedResultEx(hfile: Handle, lpoverlapped: COpaquePointer?, lpnumberofbytestransferred: COpaquePointer?, dwmilliseconds: UInt, balertable: Bool): Bool =
    windowssys_windows_win32_system_io_getOverlappedResultEx(hfile?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>(), lpnumberofbytestransferred?.value?.toCPointer<ByteVar>(), dwmilliseconds, balertable)

public actual fun getQueuedCompletionStatus(completionport: Handle, lpnumberofbytestransferred: COpaquePointer?, lpcompletionkey: COpaquePointer?, lpoverlapped: COpaquePointer?, dwmilliseconds: UInt): Bool =
    windowssys_windows_win32_system_io_getQueuedCompletionStatus(completionport?.value?.toCPointer<ByteVar>(), lpnumberofbytestransferred?.value?.toCPointer<ByteVar>(), lpcompletionkey?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>(), dwmilliseconds)

public actual fun getQueuedCompletionStatusEx(completionport: Handle, lpcompletionportentries: COpaquePointer?, ulcount: UInt, ulnumentriesremoved: COpaquePointer?, dwmilliseconds: UInt, falertable: Bool): Bool =
    windowssys_windows_win32_system_io_getQueuedCompletionStatusEx(completionport?.value?.toCPointer<ByteVar>(), lpcompletionportentries?.value?.toCPointer<ByteVar>(), ulcount, ulnumentriesremoved?.value?.toCPointer<ByteVar>(), dwmilliseconds, falertable)

public actual fun postQueuedCompletionStatus(completionport: Handle, dwnumberofbytestransferred: UInt, dwcompletionkey: ULong, lpoverlapped: COpaquePointer?): Bool =
    windowssys_windows_win32_system_io_postQueuedCompletionStatus(completionport?.value?.toCPointer<ByteVar>(), dwnumberofbytestransferred, dwcompletionkey, lpoverlapped?.value?.toCPointer<ByteVar>())
