@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemIoNapiAddon(): Boolean

private val windowsWin32SystemIoNapiAvailable: Boolean = initWindowsWin32SystemIoNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemIoBindIoCompletionCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemIoBindIoCompletionCallback(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemIoCancelIo(p0)")
private external fun wasmWindowssysWindowsWin32SystemIoCancelIo(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemIoCancelIoEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemIoCancelIoEx(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemIoCancelSynchronousIo(p0)")
private external fun wasmWindowssysWindowsWin32SystemIoCancelSynchronousIo(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemIoCreateIoCompletionPort(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemIoCreateIoCompletionPort(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemIoDeviceIoControl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemIoDeviceIoControl(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemIoGetOverlappedResult(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemIoGetOverlappedResult(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemIoGetOverlappedResultEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemIoGetOverlappedResultEx(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemIoGetQueuedCompletionStatus(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemIoGetQueuedCompletionStatus(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemIoGetQueuedCompletionStatusEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemIoGetQueuedCompletionStatusEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemIoPostQueuedCompletionStatus(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemIoPostQueuedCompletionStatus(p0: String, p1: Int, p2: String, p3: String): Int

public actual fun bindIoCompletionCallback(filehandle: Handle, function: LpoverlappedCompletionRoutine, flags: UInt): Bool =
    if (windowsWin32SystemIoNapiAvailable) wasmWindowssysWindowsWin32SystemIoBindIoCompletionCallback(filehandle.rawAddress.toString(), 0L.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelIo(hfile: Handle): Bool =
    if (windowsWin32SystemIoNapiAvailable) wasmWindowssysWindowsWin32SystemIoCancelIo(hfile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelIoEx(hfile: Handle, lpoverlapped: ConstPtr<Overlapped>): Bool =
    if (windowsWin32SystemIoNapiAvailable) wasmWindowssysWindowsWin32SystemIoCancelIoEx(hfile.rawAddress.toString(), lpoverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelSynchronousIo(hthread: Handle): Bool =
    if (windowsWin32SystemIoNapiAvailable) wasmWindowssysWindowsWin32SystemIoCancelSynchronousIo(hthread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIoCompletionPort(filehandle: Handle, existingcompletionport: Handle, completionkey: ULong, numberofconcurrentthreads: UInt): Handle =
    if (windowsWin32SystemIoNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemIoCreateIoCompletionPort(filehandle.rawAddress.toString(), existingcompletionport.rawAddress.toString(), completionkey.toString(), numberofconcurrentthreads.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deviceIoControl(hdevice: Handle, dwiocontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32SystemIoNapiAvailable) wasmWindowssysWindowsWin32SystemIoDeviceIoControl(hdevice.rawAddress.toString(), dwiocontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpoverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOverlappedResult(hfile: Handle, lpoverlapped: ConstPtr<Overlapped>, lpnumberofbytestransferred: MutPtr<UInt>, bwait: Bool): Bool =
    if (windowsWin32SystemIoNapiAvailable) wasmWindowssysWindowsWin32SystemIoGetOverlappedResult(hfile.rawAddress.toString(), lpoverlapped.rawAddress.toString(), lpnumberofbytestransferred.rawAddress.toString(), bwait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOverlappedResultEx(hfile: Handle, lpoverlapped: ConstPtr<Overlapped>, lpnumberofbytestransferred: MutPtr<UInt>, dwmilliseconds: UInt, balertable: Bool): Bool =
    if (windowsWin32SystemIoNapiAvailable) wasmWindowssysWindowsWin32SystemIoGetOverlappedResultEx(hfile.rawAddress.toString(), lpoverlapped.rawAddress.toString(), lpnumberofbytestransferred.rawAddress.toString(), dwmilliseconds.toInt(), balertable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getQueuedCompletionStatus(completionport: Handle, lpnumberofbytestransferred: MutPtr<UInt>, lpcompletionkey: MutPtr<ULong>, lpoverlapped: MutPtr<MutPtr<Overlapped>>, dwmilliseconds: UInt): Bool =
    if (windowsWin32SystemIoNapiAvailable) wasmWindowssysWindowsWin32SystemIoGetQueuedCompletionStatus(completionport.rawAddress.toString(), lpnumberofbytestransferred.rawAddress.toString(), lpcompletionkey.rawAddress.toString(), lpoverlapped.rawAddress.toString(), dwmilliseconds.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getQueuedCompletionStatusEx(completionport: Handle, lpcompletionportentries: MutPtr<OverlappedEntry>, ulcount: UInt, ulnumentriesremoved: MutPtr<UInt>, dwmilliseconds: UInt, falertable: Bool): Bool =
    if (windowsWin32SystemIoNapiAvailable) wasmWindowssysWindowsWin32SystemIoGetQueuedCompletionStatusEx(completionport.rawAddress.toString(), lpcompletionportentries.rawAddress.toString(), ulcount.toInt(), ulnumentriesremoved.rawAddress.toString(), dwmilliseconds.toInt(), falertable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun postQueuedCompletionStatus(completionport: Handle, dwnumberofbytestransferred: UInt, dwcompletionkey: ULong, lpoverlapped: ConstPtr<Overlapped>): Bool =
    if (windowsWin32SystemIoNapiAvailable) wasmWindowssysWindowsWin32SystemIoPostQueuedCompletionStatus(completionport.rawAddress.toString(), dwnumberofbytestransferred.toInt(), dwcompletionkey.toString(), lpoverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
