@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val windowsWin32SystemIoNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun bindIoCompletionCallback(filehandle: Handle, function: LpoverlappedCompletionRoutine, flags: UInt): Bool =
    if (windowsWin32SystemIoNapiAddon != null) (windowsWin32SystemIoNapiAddon.windowssysWindowsWin32SystemIoBindIoCompletionCallback(filehandle.rawAddress.toString(), 0L.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelIo(hfile: Handle): Bool =
    if (windowsWin32SystemIoNapiAddon != null) (windowsWin32SystemIoNapiAddon.windowssysWindowsWin32SystemIoCancelIo(hfile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelIoEx(hfile: Handle, lpoverlapped: ConstPtr<Overlapped>): Bool =
    if (windowsWin32SystemIoNapiAddon != null) (windowsWin32SystemIoNapiAddon.windowssysWindowsWin32SystemIoCancelIoEx(hfile.rawAddress.toString(), lpoverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelSynchronousIo(hthread: Handle): Bool =
    if (windowsWin32SystemIoNapiAddon != null) (windowsWin32SystemIoNapiAddon.windowssysWindowsWin32SystemIoCancelSynchronousIo(hthread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIoCompletionPort(filehandle: Handle, existingcompletionport: Handle, completionkey: ULong, numberofconcurrentthreads: UInt): Handle =
    if (windowsWin32SystemIoNapiAddon != null) MutPtr((windowsWin32SystemIoNapiAddon.windowssysWindowsWin32SystemIoCreateIoCompletionPort(filehandle.rawAddress.toString(), existingcompletionport.rawAddress.toString(), completionkey.toString(), numberofconcurrentthreads.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deviceIoControl(hdevice: Handle, dwiocontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32SystemIoNapiAddon != null) (windowsWin32SystemIoNapiAddon.windowssysWindowsWin32SystemIoDeviceIoControl(hdevice.rawAddress.toString(), dwiocontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpoverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOverlappedResult(hfile: Handle, lpoverlapped: ConstPtr<Overlapped>, lpnumberofbytestransferred: MutPtr<UInt>, bwait: Bool): Bool =
    if (windowsWin32SystemIoNapiAddon != null) (windowsWin32SystemIoNapiAddon.windowssysWindowsWin32SystemIoGetOverlappedResult(hfile.rawAddress.toString(), lpoverlapped.rawAddress.toString(), lpnumberofbytestransferred.rawAddress.toString(), bwait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOverlappedResultEx(hfile: Handle, lpoverlapped: ConstPtr<Overlapped>, lpnumberofbytestransferred: MutPtr<UInt>, dwmilliseconds: UInt, balertable: Bool): Bool =
    if (windowsWin32SystemIoNapiAddon != null) (windowsWin32SystemIoNapiAddon.windowssysWindowsWin32SystemIoGetOverlappedResultEx(hfile.rawAddress.toString(), lpoverlapped.rawAddress.toString(), lpnumberofbytestransferred.rawAddress.toString(), dwmilliseconds.toInt(), balertable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getQueuedCompletionStatus(completionport: Handle, lpnumberofbytestransferred: MutPtr<UInt>, lpcompletionkey: MutPtr<ULong>, lpoverlapped: MutPtr<MutPtr<Overlapped>>, dwmilliseconds: UInt): Bool =
    if (windowsWin32SystemIoNapiAddon != null) (windowsWin32SystemIoNapiAddon.windowssysWindowsWin32SystemIoGetQueuedCompletionStatus(completionport.rawAddress.toString(), lpnumberofbytestransferred.rawAddress.toString(), lpcompletionkey.rawAddress.toString(), lpoverlapped.rawAddress.toString(), dwmilliseconds.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getQueuedCompletionStatusEx(completionport: Handle, lpcompletionportentries: MutPtr<OverlappedEntry>, ulcount: UInt, ulnumentriesremoved: MutPtr<UInt>, dwmilliseconds: UInt, falertable: Bool): Bool =
    if (windowsWin32SystemIoNapiAddon != null) (windowsWin32SystemIoNapiAddon.windowssysWindowsWin32SystemIoGetQueuedCompletionStatusEx(completionport.rawAddress.toString(), lpcompletionportentries.rawAddress.toString(), ulcount.toInt(), ulnumentriesremoved.rawAddress.toString(), dwmilliseconds.toInt(), falertable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun postQueuedCompletionStatus(completionport: Handle, dwnumberofbytestransferred: UInt, dwcompletionkey: ULong, lpoverlapped: ConstPtr<Overlapped>): Bool =
    if (windowsWin32SystemIoNapiAddon != null) (windowsWin32SystemIoNapiAddon.windowssysWindowsWin32SystemIoPostQueuedCompletionStatus(completionport.rawAddress.toString(), dwnumberofbytestransferred.toInt(), dwcompletionkey.toString(), lpoverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
