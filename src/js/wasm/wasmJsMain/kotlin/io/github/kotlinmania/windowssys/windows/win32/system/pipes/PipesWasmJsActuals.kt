@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.pipes

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileFlagsAndAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemPipesNapiAddon(): Boolean

private val windowsWin32SystemPipesNapiAvailable: Boolean = initWindowsWin32SystemPipesNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPipesCallNamedPipeA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemPipesCallNamedPipeA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPipesCallNamedPipeW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemPipesCallNamedPipeW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPipesConnectNamedPipe(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPipesConnectNamedPipe(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPipesCreateNamedPipeA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemPipesCreateNamedPipeA(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPipesCreateNamedPipeW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemPipesCreateNamedPipeW(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPipesCreatePipe(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPipesCreatePipe(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPipesDisconnectNamedPipe(p0)")
private external fun wasmWindowssysWindowsWin32SystemPipesDisconnectNamedPipe(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPipesGetNamedPipeClientProcessId(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPipesGetNamedPipeClientProcessId(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPipesGetNamedPipeClientSessionId(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPipesGetNamedPipeClientSessionId(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPipesGetNamedPipeHandleStateA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemPipesGetNamedPipeHandleStateA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPipesGetNamedPipeHandleStateW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemPipesGetNamedPipeHandleStateW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPipesGetNamedPipeInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPipesGetNamedPipeInfo(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPipesGetNamedPipeServerProcessId(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPipesGetNamedPipeServerProcessId(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPipesGetNamedPipeServerSessionId(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPipesGetNamedPipeServerSessionId(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPipesImpersonateNamedPipeClient(p0)")
private external fun wasmWindowssysWindowsWin32SystemPipesImpersonateNamedPipeClient(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPipesPeekNamedPipe(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemPipesPeekNamedPipe(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPipesSetNamedPipeHandleState(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPipesSetNamedPipeHandleState(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPipesTransactNamedPipe(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemPipesTransactNamedPipe(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPipesWaitNamedPipeA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPipesWaitNamedPipeA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPipesWaitNamedPipeW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPipesWaitNamedPipeW(p0: String, p1: Int): Int

public actual fun callNamedPipeA(lpnamedpipename: Pcstr, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesread: MutPtr<UInt>, ntimeout: UInt): Bool =
    if (windowsWin32SystemPipesNapiAvailable) wasmWindowssysWindowsWin32SystemPipesCallNamedPipeA(lpnamedpipename.rawAddress.toString(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesread.rawAddress.toString(), ntimeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callNamedPipeW(lpnamedpipename: Pcwstr, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesread: MutPtr<UInt>, ntimeout: UInt): Bool =
    if (windowsWin32SystemPipesNapiAvailable) wasmWindowssysWindowsWin32SystemPipesCallNamedPipeW(lpnamedpipename.rawAddress.toString(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesread.rawAddress.toString(), ntimeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectNamedPipe(hnamedpipe: Handle, lpoverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32SystemPipesNapiAvailable) wasmWindowssysWindowsWin32SystemPipesConnectNamedPipe(hnamedpipe.rawAddress.toString(), lpoverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createNamedPipeA(lpname: Pcstr, dwopenmode: FileFlagsAndAttributes, dwpipemode: NamedPipeMode, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>): Handle =
    if (windowsWin32SystemPipesNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemPipesCreateNamedPipeA(lpname.rawAddress.toString(), dwopenmode.toInt(), dwpipemode.toInt(), nmaxinstances.toInt(), noutbuffersize.toInt(), ninbuffersize.toInt(), ndefaulttimeout.toInt(), lpsecurityattributes.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createNamedPipeW(lpname: Pcwstr, dwopenmode: FileFlagsAndAttributes, dwpipemode: NamedPipeMode, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>): Handle =
    if (windowsWin32SystemPipesNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemPipesCreateNamedPipeW(lpname.rawAddress.toString(), dwopenmode.toInt(), dwpipemode.toInt(), nmaxinstances.toInt(), noutbuffersize.toInt(), ninbuffersize.toInt(), ndefaulttimeout.toInt(), lpsecurityattributes.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPipe(hreadpipe: MutPtr<Handle>, hwritepipe: MutPtr<Handle>, lppipeattributes: ConstPtr<SecurityAttributes>, nsize: UInt): Bool =
    if (windowsWin32SystemPipesNapiAvailable) wasmWindowssysWindowsWin32SystemPipesCreatePipe(hreadpipe.rawAddress.toString(), hwritepipe.rawAddress.toString(), lppipeattributes.rawAddress.toString(), nsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disconnectNamedPipe(hnamedpipe: Handle): Bool =
    if (windowsWin32SystemPipesNapiAvailable) wasmWindowssysWindowsWin32SystemPipesDisconnectNamedPipe(hnamedpipe.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeClientComputerNameA(pipe: Handle, clientcomputername: Pstr, clientcomputernamelength: UInt): Bool =
    if (windowsWin32SystemPipesNapiAvailable) wasmWindowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameA(pipe.rawAddress.toString(), clientcomputername.rawAddress.toString(), clientcomputernamelength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeClientComputerNameW(pipe: Handle, clientcomputername: Pwstr, clientcomputernamelength: UInt): Bool =
    if (windowsWin32SystemPipesNapiAvailable) wasmWindowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameW(pipe.rawAddress.toString(), clientcomputername.rawAddress.toString(), clientcomputernamelength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeClientProcessId(pipe: Handle, clientprocessid: MutPtr<UInt>): Bool =
    if (windowsWin32SystemPipesNapiAvailable) wasmWindowssysWindowsWin32SystemPipesGetNamedPipeClientProcessId(pipe.rawAddress.toString(), clientprocessid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeClientSessionId(pipe: Handle, clientsessionid: MutPtr<UInt>): Bool =
    if (windowsWin32SystemPipesNapiAvailable) wasmWindowssysWindowsWin32SystemPipesGetNamedPipeClientSessionId(pipe.rawAddress.toString(), clientsessionid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeHandleStateA(hnamedpipe: Handle, lpstate: MutPtr<NamedPipeMode>, lpcurinstances: MutPtr<UInt>, lpmaxcollectioncount: MutPtr<UInt>, lpcollectdatatimeout: MutPtr<UInt>, lpusername: Pstr, nmaxusernamesize: UInt): Bool =
    if (windowsWin32SystemPipesNapiAvailable) wasmWindowssysWindowsWin32SystemPipesGetNamedPipeHandleStateA(hnamedpipe.rawAddress.toString(), lpstate.rawAddress.toString(), lpcurinstances.rawAddress.toString(), lpmaxcollectioncount.rawAddress.toString(), lpcollectdatatimeout.rawAddress.toString(), lpusername.rawAddress.toString(), nmaxusernamesize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeHandleStateW(hnamedpipe: Handle, lpstate: MutPtr<NamedPipeMode>, lpcurinstances: MutPtr<UInt>, lpmaxcollectioncount: MutPtr<UInt>, lpcollectdatatimeout: MutPtr<UInt>, lpusername: Pwstr, nmaxusernamesize: UInt): Bool =
    if (windowsWin32SystemPipesNapiAvailable) wasmWindowssysWindowsWin32SystemPipesGetNamedPipeHandleStateW(hnamedpipe.rawAddress.toString(), lpstate.rawAddress.toString(), lpcurinstances.rawAddress.toString(), lpmaxcollectioncount.rawAddress.toString(), lpcollectdatatimeout.rawAddress.toString(), lpusername.rawAddress.toString(), nmaxusernamesize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeInfo(hnamedpipe: Handle, lpflags: MutPtr<NamedPipeMode>, lpoutbuffersize: MutPtr<UInt>, lpinbuffersize: MutPtr<UInt>, lpmaxinstances: MutPtr<UInt>): Bool =
    if (windowsWin32SystemPipesNapiAvailable) wasmWindowssysWindowsWin32SystemPipesGetNamedPipeInfo(hnamedpipe.rawAddress.toString(), lpflags.rawAddress.toString(), lpoutbuffersize.rawAddress.toString(), lpinbuffersize.rawAddress.toString(), lpmaxinstances.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeServerProcessId(pipe: Handle, serverprocessid: MutPtr<UInt>): Bool =
    if (windowsWin32SystemPipesNapiAvailable) wasmWindowssysWindowsWin32SystemPipesGetNamedPipeServerProcessId(pipe.rawAddress.toString(), serverprocessid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeServerSessionId(pipe: Handle, serversessionid: MutPtr<UInt>): Bool =
    if (windowsWin32SystemPipesNapiAvailable) wasmWindowssysWindowsWin32SystemPipesGetNamedPipeServerSessionId(pipe.rawAddress.toString(), serversessionid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun impersonateNamedPipeClient(hnamedpipe: Handle): Bool =
    if (windowsWin32SystemPipesNapiAvailable) wasmWindowssysWindowsWin32SystemPipesImpersonateNamedPipeClient(hnamedpipe.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peekNamedPipe(hnamedpipe: Handle, lpbuffer: MutPtr<CVoid>, nbuffersize: UInt, lpbytesread: MutPtr<UInt>, lptotalbytesavail: MutPtr<UInt>, lpbytesleftthismessage: MutPtr<UInt>): Bool =
    if (windowsWin32SystemPipesNapiAvailable) wasmWindowssysWindowsWin32SystemPipesPeekNamedPipe(hnamedpipe.rawAddress.toString(), lpbuffer.rawAddress.toString(), nbuffersize.toInt(), lpbytesread.rawAddress.toString(), lptotalbytesavail.rawAddress.toString(), lpbytesleftthismessage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setNamedPipeHandleState(hnamedpipe: Handle, lpmode: ConstPtr<NamedPipeMode>, lpmaxcollectioncount: ConstPtr<UInt>, lpcollectdatatimeout: ConstPtr<UInt>): Bool =
    if (windowsWin32SystemPipesNapiAvailable) wasmWindowssysWindowsWin32SystemPipesSetNamedPipeHandleState(hnamedpipe.rawAddress.toString(), lpmode.rawAddress.toString(), lpmaxcollectioncount.rawAddress.toString(), lpcollectdatatimeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transactNamedPipe(hnamedpipe: Handle, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesread: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32SystemPipesNapiAvailable) wasmWindowssysWindowsWin32SystemPipesTransactNamedPipe(hnamedpipe.rawAddress.toString(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesread.rawAddress.toString(), lpoverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitNamedPipeA(lpnamedpipename: Pcstr, ntimeout: UInt): Bool =
    if (windowsWin32SystemPipesNapiAvailable) wasmWindowssysWindowsWin32SystemPipesWaitNamedPipeA(lpnamedpipename.rawAddress.toString(), ntimeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitNamedPipeW(lpnamedpipename: Pcwstr, ntimeout: UInt): Bool =
    if (windowsWin32SystemPipesNapiAvailable) wasmWindowssysWindowsWin32SystemPipesWaitNamedPipeW(lpnamedpipename.rawAddress.toString(), ntimeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
