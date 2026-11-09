@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32SystemIoJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_io_BindIoCompletionCallback(filehandle: Long, function: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_io_CancelIo(hfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_io_CancelIoEx(hfile: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_io_CancelSynchronousIo(hthread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_io_CreateIoCompletionPort(filehandle: Long, existingcompletionport: Long, completionkey: Long, numberofconcurrentthreads: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_io_DeviceIoControl(hdevice: Long, dwiocontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_io_GetOverlappedResult(hfile: Long, lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_io_GetOverlappedResultEx(hfile: Long, lpoverlapped: Long, lpnumberofbytestransferred: Long, dwmilliseconds: Int, balertable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_io_GetQueuedCompletionStatus(completionport: Long, lpnumberofbytestransferred: Long, lpcompletionkey: Long, lpoverlapped: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_io_GetQueuedCompletionStatusEx(completionport: Long, lpcompletionportentries: Long, ulcount: Int, ulnumentriesremoved: Long, dwmilliseconds: Int, falertable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_io_PostQueuedCompletionStatus(completionport: Long, dwnumberofbytestransferred: Int, dwcompletionkey: Long, lpoverlapped: Long): Int
}

public actual fun BindIoCompletionCallback(filehandle: HANDLE, function: LPOVERLAPPED_COMPLETION_ROUTINE, flags: UInt): BOOL =
    WindowsWin32SystemIoJniBridge.windowssys_windows_win32_system_io_BindIoCompletionCallback(filehandle, function.toLong(), flags.toInt())

public actual fun CancelIo(hfile: HANDLE): BOOL =
    WindowsWin32SystemIoJniBridge.windowssys_windows_win32_system_io_CancelIo(hfile)

public actual fun CancelIoEx(hfile: HANDLE, lpoverlapped: Long): BOOL =
    WindowsWin32SystemIoJniBridge.windowssys_windows_win32_system_io_CancelIoEx(hfile, lpoverlapped)

public actual fun CancelSynchronousIo(hthread: HANDLE): BOOL =
    WindowsWin32SystemIoJniBridge.windowssys_windows_win32_system_io_CancelSynchronousIo(hthread)

public actual fun CreateIoCompletionPort(filehandle: HANDLE, existingcompletionport: HANDLE, completionkey: ULong, numberofconcurrentthreads: UInt): HANDLE =
    WindowsWin32SystemIoJniBridge.windowssys_windows_win32_system_io_CreateIoCompletionPort(filehandle, existingcompletionport, completionkey.toLong(), numberofconcurrentthreads.toInt())

public actual fun DeviceIoControl(hdevice: HANDLE, dwiocontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpoverlapped: Long): BOOL =
    WindowsWin32SystemIoJniBridge.windowssys_windows_win32_system_io_DeviceIoControl(hdevice, dwiocontrolcode.toInt(), lpinbuffer, ninbuffersize.toInt(), lpoutbuffer, noutbuffersize.toInt(), lpbytesreturned, lpoverlapped)

public actual fun GetOverlappedResult(hfile: HANDLE, lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: BOOL): BOOL =
    WindowsWin32SystemIoJniBridge.windowssys_windows_win32_system_io_GetOverlappedResult(hfile, lpoverlapped, lpnumberofbytestransferred, bwait)

public actual fun GetOverlappedResultEx(hfile: HANDLE, lpoverlapped: Long, lpnumberofbytestransferred: Long, dwmilliseconds: UInt, balertable: BOOL): BOOL =
    WindowsWin32SystemIoJniBridge.windowssys_windows_win32_system_io_GetOverlappedResultEx(hfile, lpoverlapped, lpnumberofbytestransferred, dwmilliseconds.toInt(), balertable)

public actual fun GetQueuedCompletionStatus(completionport: HANDLE, lpnumberofbytestransferred: Long, lpcompletionkey: Long, lpoverlapped: Long, dwmilliseconds: UInt): BOOL =
    WindowsWin32SystemIoJniBridge.windowssys_windows_win32_system_io_GetQueuedCompletionStatus(completionport, lpnumberofbytestransferred, lpcompletionkey, lpoverlapped, dwmilliseconds.toInt())

public actual fun GetQueuedCompletionStatusEx(completionport: HANDLE, lpcompletionportentries: Long, ulcount: UInt, ulnumentriesremoved: Long, dwmilliseconds: UInt, falertable: BOOL): BOOL =
    WindowsWin32SystemIoJniBridge.windowssys_windows_win32_system_io_GetQueuedCompletionStatusEx(completionport, lpcompletionportentries, ulcount.toInt(), ulnumentriesremoved, dwmilliseconds.toInt(), falertable)

public actual fun PostQueuedCompletionStatus(completionport: HANDLE, dwnumberofbytestransferred: UInt, dwcompletionkey: ULong, lpoverlapped: Long): BOOL =
    WindowsWin32SystemIoJniBridge.windowssys_windows_win32_system_io_PostQueuedCompletionStatus(completionport, dwnumberofbytestransferred.toInt(), dwcompletionkey.toLong(), lpoverlapped)
