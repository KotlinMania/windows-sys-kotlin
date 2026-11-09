@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32SystemIoNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun BindIoCompletionCallback(filehandle: HANDLE, function: LPOVERLAPPED_COMPLETION_ROUTINE, flags: UInt): BOOL =
    if (_windowsWin32SystemIoNapiAddon != null) (_windowsWin32SystemIoNapiAddon.windowssys_windows_win32_system_io_BindIoCompletionCallback(filehandle.toString(), function.toLong().toString(), flags.toInt()) as Int) else 0

public actual fun CancelIo(hfile: HANDLE): BOOL =
    if (_windowsWin32SystemIoNapiAddon != null) (_windowsWin32SystemIoNapiAddon.windowssys_windows_win32_system_io_CancelIo(hfile.toString()) as Int) else 0

public actual fun CancelIoEx(hfile: HANDLE, lpoverlapped: Long): BOOL =
    if (_windowsWin32SystemIoNapiAddon != null) (_windowsWin32SystemIoNapiAddon.windowssys_windows_win32_system_io_CancelIoEx(hfile.toString(), lpoverlapped.toString()) as Int) else 0

public actual fun CancelSynchronousIo(hthread: HANDLE): BOOL =
    if (_windowsWin32SystemIoNapiAddon != null) (_windowsWin32SystemIoNapiAddon.windowssys_windows_win32_system_io_CancelSynchronousIo(hthread.toString()) as Int) else 0

public actual fun CreateIoCompletionPort(filehandle: HANDLE, existingcompletionport: HANDLE, completionkey: ULong, numberofconcurrentthreads: UInt): HANDLE =
    if (_windowsWin32SystemIoNapiAddon != null) (_windowsWin32SystemIoNapiAddon.windowssys_windows_win32_system_io_CreateIoCompletionPort(filehandle.toString(), existingcompletionport.toString(), completionkey.toString(), numberofconcurrentthreads.toInt()) as String).toLong() else 0L

public actual fun DeviceIoControl(hdevice: HANDLE, dwiocontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpoverlapped: Long): BOOL =
    if (_windowsWin32SystemIoNapiAddon != null) (_windowsWin32SystemIoNapiAddon.windowssys_windows_win32_system_io_DeviceIoControl(hdevice.toString(), dwiocontrolcode.toInt(), lpinbuffer.toString(), ninbuffersize.toInt(), lpoutbuffer.toString(), noutbuffersize.toInt(), lpbytesreturned.toString(), lpoverlapped.toString()) as Int) else 0

public actual fun GetOverlappedResult(hfile: HANDLE, lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: BOOL): BOOL =
    if (_windowsWin32SystemIoNapiAddon != null) (_windowsWin32SystemIoNapiAddon.windowssys_windows_win32_system_io_GetOverlappedResult(hfile.toString(), lpoverlapped.toString(), lpnumberofbytestransferred.toString(), bwait) as Int) else 0

public actual fun GetOverlappedResultEx(hfile: HANDLE, lpoverlapped: Long, lpnumberofbytestransferred: Long, dwmilliseconds: UInt, balertable: BOOL): BOOL =
    if (_windowsWin32SystemIoNapiAddon != null) (_windowsWin32SystemIoNapiAddon.windowssys_windows_win32_system_io_GetOverlappedResultEx(hfile.toString(), lpoverlapped.toString(), lpnumberofbytestransferred.toString(), dwmilliseconds.toInt(), balertable) as Int) else 0

public actual fun GetQueuedCompletionStatus(completionport: HANDLE, lpnumberofbytestransferred: Long, lpcompletionkey: Long, lpoverlapped: Long, dwmilliseconds: UInt): BOOL =
    if (_windowsWin32SystemIoNapiAddon != null) (_windowsWin32SystemIoNapiAddon.windowssys_windows_win32_system_io_GetQueuedCompletionStatus(completionport.toString(), lpnumberofbytestransferred.toString(), lpcompletionkey.toString(), lpoverlapped.toString(), dwmilliseconds.toInt()) as Int) else 0

public actual fun GetQueuedCompletionStatusEx(completionport: HANDLE, lpcompletionportentries: Long, ulcount: UInt, ulnumentriesremoved: Long, dwmilliseconds: UInt, falertable: BOOL): BOOL =
    if (_windowsWin32SystemIoNapiAddon != null) (_windowsWin32SystemIoNapiAddon.windowssys_windows_win32_system_io_GetQueuedCompletionStatusEx(completionport.toString(), lpcompletionportentries.toString(), ulcount.toInt(), ulnumentriesremoved.toString(), dwmilliseconds.toInt(), falertable) as Int) else 0

public actual fun PostQueuedCompletionStatus(completionport: HANDLE, dwnumberofbytestransferred: UInt, dwcompletionkey: ULong, lpoverlapped: Long): BOOL =
    if (_windowsWin32SystemIoNapiAddon != null) (_windowsWin32SystemIoNapiAddon.windowssys_windows_win32_system_io_PostQueuedCompletionStatus(completionport.toString(), dwnumberofbytestransferred.toInt(), dwcompletionkey.toString(), lpoverlapped.toString()) as Int) else 0
