@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val _windowsWin32SystemIoNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun bindIoCompletionCallback(filehandle: Handle, function: LpoverlappedCompletionRoutine, flags: UInt): Bool =
    if (_windowsWin32SystemIoNapiAddon != null) (_windowsWin32SystemIoNapiAddon.windowssys_windows_win32_system_io_bindIoCompletionCallback((filehandle?.value ?: 0L).toString(), 0L.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelIo(hfile: Handle): Bool =
    if (_windowsWin32SystemIoNapiAddon != null) (_windowsWin32SystemIoNapiAddon.windowssys_windows_win32_system_io_cancelIo((hfile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelIoEx(hfile: Handle, lpoverlapped: COpaquePointer?): Bool =
    if (_windowsWin32SystemIoNapiAddon != null) (_windowsWin32SystemIoNapiAddon.windowssys_windows_win32_system_io_cancelIoEx((hfile?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelSynchronousIo(hthread: Handle): Bool =
    if (_windowsWin32SystemIoNapiAddon != null) (_windowsWin32SystemIoNapiAddon.windowssys_windows_win32_system_io_cancelSynchronousIo((hthread?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIoCompletionPort(filehandle: Handle, existingcompletionport: Handle, completionkey: ULong, numberofconcurrentthreads: UInt): Handle =
    if (_windowsWin32SystemIoNapiAddon != null) (_windowsWin32SystemIoNapiAddon.windowssys_windows_win32_system_io_createIoCompletionPort((filehandle?.value ?: 0L).toString(), (existingcompletionport?.value ?: 0L).toString(), completionkey.toString(), numberofconcurrentthreads.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deviceIoControl(hdevice: Handle, dwiocontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    if (_windowsWin32SystemIoNapiAddon != null) (_windowsWin32SystemIoNapiAddon.windowssys_windows_win32_system_io_deviceIoControl((hdevice?.value ?: 0L).toString(), dwiocontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOverlappedResult(hfile: Handle, lpoverlapped: COpaquePointer?, lpnumberofbytestransferred: COpaquePointer?, bwait: Bool): Bool =
    if (_windowsWin32SystemIoNapiAddon != null) (_windowsWin32SystemIoNapiAddon.windowssys_windows_win32_system_io_getOverlappedResult((hfile?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString(), (lpnumberofbytestransferred?.value ?: 0L).toString(), bwait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOverlappedResultEx(hfile: Handle, lpoverlapped: COpaquePointer?, lpnumberofbytestransferred: COpaquePointer?, dwmilliseconds: UInt, balertable: Bool): Bool =
    if (_windowsWin32SystemIoNapiAddon != null) (_windowsWin32SystemIoNapiAddon.windowssys_windows_win32_system_io_getOverlappedResultEx((hfile?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString(), (lpnumberofbytestransferred?.value ?: 0L).toString(), dwmilliseconds.toInt(), balertable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getQueuedCompletionStatus(completionport: Handle, lpnumberofbytestransferred: COpaquePointer?, lpcompletionkey: COpaquePointer?, lpoverlapped: COpaquePointer?, dwmilliseconds: UInt): Bool =
    if (_windowsWin32SystemIoNapiAddon != null) (_windowsWin32SystemIoNapiAddon.windowssys_windows_win32_system_io_getQueuedCompletionStatus((completionport?.value ?: 0L).toString(), (lpnumberofbytestransferred?.value ?: 0L).toString(), (lpcompletionkey?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString(), dwmilliseconds.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getQueuedCompletionStatusEx(completionport: Handle, lpcompletionportentries: COpaquePointer?, ulcount: UInt, ulnumentriesremoved: COpaquePointer?, dwmilliseconds: UInt, falertable: Bool): Bool =
    if (_windowsWin32SystemIoNapiAddon != null) (_windowsWin32SystemIoNapiAddon.windowssys_windows_win32_system_io_getQueuedCompletionStatusEx((completionport?.value ?: 0L).toString(), (lpcompletionportentries?.value ?: 0L).toString(), ulcount.toInt(), (ulnumentriesremoved?.value ?: 0L).toString(), dwmilliseconds.toInt(), falertable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun postQueuedCompletionStatus(completionport: Handle, dwnumberofbytestransferred: UInt, dwcompletionkey: ULong, lpoverlapped: COpaquePointer?): Bool =
    if (_windowsWin32SystemIoNapiAddon != null) (_windowsWin32SystemIoNapiAddon.windowssys_windows_win32_system_io_postQueuedCompletionStatus((completionport?.value ?: 0L).toString(), dwnumberofbytestransferred.toInt(), dwcompletionkey.toString(), (lpoverlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
