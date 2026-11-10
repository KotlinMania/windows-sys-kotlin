@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemIoNapiAddon(): Boolean

private val _windowsWin32SystemIoNapiAvailable: Boolean = _initWindowsWin32SystemIoNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_io_bindIoCompletionCallback(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_io_bindIoCompletionCallback(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_io_cancelIo(p0)")
private external fun _wasm_windowssys_windows_win32_system_io_cancelIo(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_io_cancelIoEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_io_cancelIoEx(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_io_cancelSynchronousIo(p0)")
private external fun _wasm_windowssys_windows_win32_system_io_cancelSynchronousIo(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_io_createIoCompletionPort(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_io_createIoCompletionPort(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_io_deviceIoControl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_io_deviceIoControl(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_io_getOverlappedResult(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_io_getOverlappedResult(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_io_getOverlappedResultEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_io_getOverlappedResultEx(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_io_getQueuedCompletionStatus(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_io_getQueuedCompletionStatus(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_io_getQueuedCompletionStatusEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_io_getQueuedCompletionStatusEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_io_postQueuedCompletionStatus(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_io_postQueuedCompletionStatus(p0: String, p1: Int, p2: String, p3: String): Int

public actual fun bindIoCompletionCallback(filehandle: Handle, function: LpoverlappedCompletionRoutine, flags: UInt): Bool =
    if (_windowsWin32SystemIoNapiAvailable) _wasm_windowssys_windows_win32_system_io_bindIoCompletionCallback((filehandle?.value ?: 0L).toString(), 0L.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelIo(hfile: Handle): Bool =
    if (_windowsWin32SystemIoNapiAvailable) _wasm_windowssys_windows_win32_system_io_cancelIo((hfile?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelIoEx(hfile: Handle, lpoverlapped: COpaquePointer?): Bool =
    if (_windowsWin32SystemIoNapiAvailable) _wasm_windowssys_windows_win32_system_io_cancelIoEx((hfile?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelSynchronousIo(hthread: Handle): Bool =
    if (_windowsWin32SystemIoNapiAvailable) _wasm_windowssys_windows_win32_system_io_cancelSynchronousIo((hthread?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIoCompletionPort(filehandle: Handle, existingcompletionport: Handle, completionkey: ULong, numberofconcurrentthreads: UInt): Handle =
    if (_windowsWin32SystemIoNapiAvailable) _wasm_windowssys_windows_win32_system_io_createIoCompletionPort((filehandle?.value ?: 0L).toString(), (existingcompletionport?.value ?: 0L).toString(), completionkey.toString(), numberofconcurrentthreads.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deviceIoControl(hdevice: Handle, dwiocontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    if (_windowsWin32SystemIoNapiAvailable) _wasm_windowssys_windows_win32_system_io_deviceIoControl((hdevice?.value ?: 0L).toString(), dwiocontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOverlappedResult(hfile: Handle, lpoverlapped: COpaquePointer?, lpnumberofbytestransferred: COpaquePointer?, bwait: Bool): Bool =
    if (_windowsWin32SystemIoNapiAvailable) _wasm_windowssys_windows_win32_system_io_getOverlappedResult((hfile?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString(), (lpnumberofbytestransferred?.value ?: 0L).toString(), bwait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOverlappedResultEx(hfile: Handle, lpoverlapped: COpaquePointer?, lpnumberofbytestransferred: COpaquePointer?, dwmilliseconds: UInt, balertable: Bool): Bool =
    if (_windowsWin32SystemIoNapiAvailable) _wasm_windowssys_windows_win32_system_io_getOverlappedResultEx((hfile?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString(), (lpnumberofbytestransferred?.value ?: 0L).toString(), dwmilliseconds.toInt(), balertable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getQueuedCompletionStatus(completionport: Handle, lpnumberofbytestransferred: COpaquePointer?, lpcompletionkey: COpaquePointer?, lpoverlapped: COpaquePointer?, dwmilliseconds: UInt): Bool =
    if (_windowsWin32SystemIoNapiAvailable) _wasm_windowssys_windows_win32_system_io_getQueuedCompletionStatus((completionport?.value ?: 0L).toString(), (lpnumberofbytestransferred?.value ?: 0L).toString(), (lpcompletionkey?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString(), dwmilliseconds.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getQueuedCompletionStatusEx(completionport: Handle, lpcompletionportentries: COpaquePointer?, ulcount: UInt, ulnumentriesremoved: COpaquePointer?, dwmilliseconds: UInt, falertable: Bool): Bool =
    if (_windowsWin32SystemIoNapiAvailable) _wasm_windowssys_windows_win32_system_io_getQueuedCompletionStatusEx((completionport?.value ?: 0L).toString(), (lpcompletionportentries?.value ?: 0L).toString(), ulcount.toInt(), (ulnumentriesremoved?.value ?: 0L).toString(), dwmilliseconds.toInt(), falertable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun postQueuedCompletionStatus(completionport: Handle, dwnumberofbytestransferred: UInt, dwcompletionkey: ULong, lpoverlapped: COpaquePointer?): Bool =
    if (_windowsWin32SystemIoNapiAvailable) _wasm_windowssys_windows_win32_system_io_postQueuedCompletionStatus((completionport?.value ?: 0L).toString(), dwnumberofbytestransferred.toInt(), dwcompletionkey.toString(), (lpoverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
