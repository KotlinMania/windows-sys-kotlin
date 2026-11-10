@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemIoJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_io_bindIoCompletionCallback(filehandle: Long, function: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_io_cancelIo(hfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_io_cancelIoEx(hfile: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_io_cancelSynchronousIo(hthread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_io_createIoCompletionPort(filehandle: Long, existingcompletionport: Long, completionkey: Long, numberofconcurrentthreads: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_io_deviceIoControl(hdevice: Long, dwiocontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_io_getOverlappedResult(hfile: Long, lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_io_getOverlappedResultEx(hfile: Long, lpoverlapped: Long, lpnumberofbytestransferred: Long, dwmilliseconds: Int, balertable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_io_getQueuedCompletionStatus(completionport: Long, lpnumberofbytestransferred: Long, lpcompletionkey: Long, lpoverlapped: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_io_getQueuedCompletionStatusEx(completionport: Long, lpcompletionportentries: Long, ulcount: Int, ulnumentriesremoved: Long, dwmilliseconds: Int, falertable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_io_postQueuedCompletionStatus(completionport: Long, dwnumberofbytestransferred: Int, dwcompletionkey: Long, lpoverlapped: Long): Int
}

public actual fun bindIoCompletionCallback(filehandle: Handle, function: LpoverlappedCompletionRoutine, flags: UInt): Bool =
    WindowsWin32SystemIoJniBridge.windowssys_windows_win32_system_io_bindIoCompletionCallback((filehandle?.value ?: 0L), 0L, flags.toInt())

public actual fun cancelIo(hfile: Handle): Bool =
    WindowsWin32SystemIoJniBridge.windowssys_windows_win32_system_io_cancelIo((hfile?.value ?: 0L))

public actual fun cancelIoEx(hfile: Handle, lpoverlapped: COpaquePointer?): Bool =
    WindowsWin32SystemIoJniBridge.windowssys_windows_win32_system_io_cancelIoEx((hfile?.value ?: 0L), (lpoverlapped?.value ?: 0L))

public actual fun cancelSynchronousIo(hthread: Handle): Bool =
    WindowsWin32SystemIoJniBridge.windowssys_windows_win32_system_io_cancelSynchronousIo((hthread?.value ?: 0L))

public actual fun createIoCompletionPort(filehandle: Handle, existingcompletionport: Handle, completionkey: ULong, numberofconcurrentthreads: UInt): Handle =
    WindowsWin32SystemIoJniBridge.windowssys_windows_win32_system_io_createIoCompletionPort((filehandle?.value ?: 0L), (existingcompletionport?.value ?: 0L), completionkey.toLong(), numberofconcurrentthreads.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun deviceIoControl(hdevice: Handle, dwiocontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    WindowsWin32SystemIoJniBridge.windowssys_windows_win32_system_io_deviceIoControl((hdevice?.value ?: 0L), dwiocontrolcode.toInt(), (lpinbuffer?.value ?: 0L), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L), (lpoverlapped?.value ?: 0L))

public actual fun getOverlappedResult(hfile: Handle, lpoverlapped: COpaquePointer?, lpnumberofbytestransferred: COpaquePointer?, bwait: Bool): Bool =
    WindowsWin32SystemIoJniBridge.windowssys_windows_win32_system_io_getOverlappedResult((hfile?.value ?: 0L), (lpoverlapped?.value ?: 0L), (lpnumberofbytestransferred?.value ?: 0L), bwait)

public actual fun getOverlappedResultEx(hfile: Handle, lpoverlapped: COpaquePointer?, lpnumberofbytestransferred: COpaquePointer?, dwmilliseconds: UInt, balertable: Bool): Bool =
    WindowsWin32SystemIoJniBridge.windowssys_windows_win32_system_io_getOverlappedResultEx((hfile?.value ?: 0L), (lpoverlapped?.value ?: 0L), (lpnumberofbytestransferred?.value ?: 0L), dwmilliseconds.toInt(), balertable)

public actual fun getQueuedCompletionStatus(completionport: Handle, lpnumberofbytestransferred: COpaquePointer?, lpcompletionkey: COpaquePointer?, lpoverlapped: COpaquePointer?, dwmilliseconds: UInt): Bool =
    WindowsWin32SystemIoJniBridge.windowssys_windows_win32_system_io_getQueuedCompletionStatus((completionport?.value ?: 0L), (lpnumberofbytestransferred?.value ?: 0L), (lpcompletionkey?.value ?: 0L), (lpoverlapped?.value ?: 0L), dwmilliseconds.toInt())

public actual fun getQueuedCompletionStatusEx(completionport: Handle, lpcompletionportentries: COpaquePointer?, ulcount: UInt, ulnumentriesremoved: COpaquePointer?, dwmilliseconds: UInt, falertable: Bool): Bool =
    WindowsWin32SystemIoJniBridge.windowssys_windows_win32_system_io_getQueuedCompletionStatusEx((completionport?.value ?: 0L), (lpcompletionportentries?.value ?: 0L), ulcount.toInt(), (ulnumentriesremoved?.value ?: 0L), dwmilliseconds.toInt(), falertable)

public actual fun postQueuedCompletionStatus(completionport: Handle, dwnumberofbytestransferred: UInt, dwcompletionkey: ULong, lpoverlapped: COpaquePointer?): Bool =
    WindowsWin32SystemIoJniBridge.windowssys_windows_win32_system_io_postQueuedCompletionStatus((completionport?.value ?: 0L), dwnumberofbytestransferred.toInt(), dwcompletionkey.toLong(), (lpoverlapped?.value ?: 0L))
