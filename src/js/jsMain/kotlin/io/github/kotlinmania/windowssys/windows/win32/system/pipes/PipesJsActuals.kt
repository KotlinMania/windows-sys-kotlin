@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.pipes

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileFlagsAndAttributes

private val windowsWin32SystemPipesNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun callNamedPipeA(lpnamedpipename: Pcstr, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesread: MutPtr, ntimeout: UInt): Bool =
    if (windowsWin32SystemPipesNapiAddon != null) (windowsWin32SystemPipesNapiAddon.windowssysWindowsWin32SystemPipesCallNamedPipeA(lpnamedpipename.rawAddress.toString(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesread.rawAddress.toString(), ntimeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callNamedPipeW(lpnamedpipename: Pcwstr, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesread: MutPtr, ntimeout: UInt): Bool =
    if (windowsWin32SystemPipesNapiAddon != null) (windowsWin32SystemPipesNapiAddon.windowssysWindowsWin32SystemPipesCallNamedPipeW(lpnamedpipename.rawAddress.toString(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesread.rawAddress.toString(), ntimeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectNamedPipe(hnamedpipe: Handle, lpoverlapped: MutPtr): Bool =
    if (windowsWin32SystemPipesNapiAddon != null) (windowsWin32SystemPipesNapiAddon.windowssysWindowsWin32SystemPipesConnectNamedPipe(hnamedpipe.rawAddress.toString(), lpoverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createNamedPipeA(lpname: Pcstr, dwopenmode: FileFlagsAndAttributes, dwpipemode: NamedPipeMode, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: ConstPtr): Handle =
    if (windowsWin32SystemPipesNapiAddon != null) MutPtr((windowsWin32SystemPipesNapiAddon.windowssysWindowsWin32SystemPipesCreateNamedPipeA(lpname.rawAddress.toString(), dwopenmode.toInt(), dwpipemode.toInt(), nmaxinstances.toInt(), noutbuffersize.toInt(), ninbuffersize.toInt(), ndefaulttimeout.toInt(), lpsecurityattributes.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createNamedPipeW(lpname: Pcwstr, dwopenmode: FileFlagsAndAttributes, dwpipemode: NamedPipeMode, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: ConstPtr): Handle =
    if (windowsWin32SystemPipesNapiAddon != null) MutPtr((windowsWin32SystemPipesNapiAddon.windowssysWindowsWin32SystemPipesCreateNamedPipeW(lpname.rawAddress.toString(), dwopenmode.toInt(), dwpipemode.toInt(), nmaxinstances.toInt(), noutbuffersize.toInt(), ninbuffersize.toInt(), ndefaulttimeout.toInt(), lpsecurityattributes.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPipe(hreadpipe: MutPtr, hwritepipe: MutPtr, lppipeattributes: ConstPtr, nsize: UInt): Bool =
    if (windowsWin32SystemPipesNapiAddon != null) (windowsWin32SystemPipesNapiAddon.windowssysWindowsWin32SystemPipesCreatePipe(hreadpipe.rawAddress.toString(), hwritepipe.rawAddress.toString(), lppipeattributes.rawAddress.toString(), nsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disconnectNamedPipe(hnamedpipe: Handle): Bool =
    if (windowsWin32SystemPipesNapiAddon != null) (windowsWin32SystemPipesNapiAddon.windowssysWindowsWin32SystemPipesDisconnectNamedPipe(hnamedpipe.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeClientComputerNameA(pipe: Handle, clientcomputername: Pstr, clientcomputernamelength: UInt): Bool =
    if (windowsWin32SystemPipesNapiAddon != null) (windowsWin32SystemPipesNapiAddon.windowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameA(pipe.rawAddress.toString(), clientcomputername.rawAddress.toString(), clientcomputernamelength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeClientComputerNameW(pipe: Handle, clientcomputername: Pwstr, clientcomputernamelength: UInt): Bool =
    if (windowsWin32SystemPipesNapiAddon != null) (windowsWin32SystemPipesNapiAddon.windowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameW(pipe.rawAddress.toString(), clientcomputername.rawAddress.toString(), clientcomputernamelength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeClientProcessId(pipe: Handle, clientprocessid: MutPtr): Bool =
    if (windowsWin32SystemPipesNapiAddon != null) (windowsWin32SystemPipesNapiAddon.windowssysWindowsWin32SystemPipesGetNamedPipeClientProcessId(pipe.rawAddress.toString(), clientprocessid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeClientSessionId(pipe: Handle, clientsessionid: MutPtr): Bool =
    if (windowsWin32SystemPipesNapiAddon != null) (windowsWin32SystemPipesNapiAddon.windowssysWindowsWin32SystemPipesGetNamedPipeClientSessionId(pipe.rawAddress.toString(), clientsessionid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeHandleStateA(hnamedpipe: Handle, lpstate: MutPtr, lpcurinstances: MutPtr, lpmaxcollectioncount: MutPtr, lpcollectdatatimeout: MutPtr, lpusername: Pstr, nmaxusernamesize: UInt): Bool =
    if (windowsWin32SystemPipesNapiAddon != null) (windowsWin32SystemPipesNapiAddon.windowssysWindowsWin32SystemPipesGetNamedPipeHandleStateA(hnamedpipe.rawAddress.toString(), lpstate.rawAddress.toString(), lpcurinstances.rawAddress.toString(), lpmaxcollectioncount.rawAddress.toString(), lpcollectdatatimeout.rawAddress.toString(), lpusername.rawAddress.toString(), nmaxusernamesize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeHandleStateW(hnamedpipe: Handle, lpstate: MutPtr, lpcurinstances: MutPtr, lpmaxcollectioncount: MutPtr, lpcollectdatatimeout: MutPtr, lpusername: Pwstr, nmaxusernamesize: UInt): Bool =
    if (windowsWin32SystemPipesNapiAddon != null) (windowsWin32SystemPipesNapiAddon.windowssysWindowsWin32SystemPipesGetNamedPipeHandleStateW(hnamedpipe.rawAddress.toString(), lpstate.rawAddress.toString(), lpcurinstances.rawAddress.toString(), lpmaxcollectioncount.rawAddress.toString(), lpcollectdatatimeout.rawAddress.toString(), lpusername.rawAddress.toString(), nmaxusernamesize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeInfo(hnamedpipe: Handle, lpflags: MutPtr, lpoutbuffersize: MutPtr, lpinbuffersize: MutPtr, lpmaxinstances: MutPtr): Bool =
    if (windowsWin32SystemPipesNapiAddon != null) (windowsWin32SystemPipesNapiAddon.windowssysWindowsWin32SystemPipesGetNamedPipeInfo(hnamedpipe.rawAddress.toString(), lpflags.rawAddress.toString(), lpoutbuffersize.rawAddress.toString(), lpinbuffersize.rawAddress.toString(), lpmaxinstances.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeServerProcessId(pipe: Handle, serverprocessid: MutPtr): Bool =
    if (windowsWin32SystemPipesNapiAddon != null) (windowsWin32SystemPipesNapiAddon.windowssysWindowsWin32SystemPipesGetNamedPipeServerProcessId(pipe.rawAddress.toString(), serverprocessid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeServerSessionId(pipe: Handle, serversessionid: MutPtr): Bool =
    if (windowsWin32SystemPipesNapiAddon != null) (windowsWin32SystemPipesNapiAddon.windowssysWindowsWin32SystemPipesGetNamedPipeServerSessionId(pipe.rawAddress.toString(), serversessionid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun impersonateNamedPipeClient(hnamedpipe: Handle): Bool =
    if (windowsWin32SystemPipesNapiAddon != null) (windowsWin32SystemPipesNapiAddon.windowssysWindowsWin32SystemPipesImpersonateNamedPipeClient(hnamedpipe.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peekNamedPipe(hnamedpipe: Handle, lpbuffer: MutPtr, nbuffersize: UInt, lpbytesread: MutPtr, lptotalbytesavail: MutPtr, lpbytesleftthismessage: MutPtr): Bool =
    if (windowsWin32SystemPipesNapiAddon != null) (windowsWin32SystemPipesNapiAddon.windowssysWindowsWin32SystemPipesPeekNamedPipe(hnamedpipe.rawAddress.toString(), lpbuffer.rawAddress.toString(), nbuffersize.toInt(), lpbytesread.rawAddress.toString(), lptotalbytesavail.rawAddress.toString(), lpbytesleftthismessage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setNamedPipeHandleState(hnamedpipe: Handle, lpmode: ConstPtr, lpmaxcollectioncount: ConstPtr, lpcollectdatatimeout: ConstPtr): Bool =
    if (windowsWin32SystemPipesNapiAddon != null) (windowsWin32SystemPipesNapiAddon.windowssysWindowsWin32SystemPipesSetNamedPipeHandleState(hnamedpipe.rawAddress.toString(), lpmode.rawAddress.toString(), lpmaxcollectioncount.rawAddress.toString(), lpcollectdatatimeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transactNamedPipe(hnamedpipe: Handle, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesread: MutPtr, lpoverlapped: MutPtr): Bool =
    if (windowsWin32SystemPipesNapiAddon != null) (windowsWin32SystemPipesNapiAddon.windowssysWindowsWin32SystemPipesTransactNamedPipe(hnamedpipe.rawAddress.toString(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesread.rawAddress.toString(), lpoverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitNamedPipeA(lpnamedpipename: Pcstr, ntimeout: UInt): Bool =
    if (windowsWin32SystemPipesNapiAddon != null) (windowsWin32SystemPipesNapiAddon.windowssysWindowsWin32SystemPipesWaitNamedPipeA(lpnamedpipename.rawAddress.toString(), ntimeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitNamedPipeW(lpnamedpipename: Pcwstr, ntimeout: UInt): Bool =
    if (windowsWin32SystemPipesNapiAddon != null) (windowsWin32SystemPipesNapiAddon.windowssysWindowsWin32SystemPipesWaitNamedPipeW(lpnamedpipename.rawAddress.toString(), ntimeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
