@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.pipes

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileFlagsAndAttributes

private val _windowsWin32SystemPipesNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun callNamedPipeA(lpnamedpipename: Pcstr, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesread: COpaquePointer?, ntimeout: UInt): Bool =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_callNamedPipeA((lpnamedpipename?.value ?: 0L).toString(), (lpinbuffer?.value ?: 0L).toString(), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), noutbuffersize.toInt(), (lpbytesread?.value ?: 0L).toString(), ntimeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callNamedPipeW(lpnamedpipename: Pcwstr, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesread: COpaquePointer?, ntimeout: UInt): Bool =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_callNamedPipeW((lpnamedpipename?.value ?: 0L).toString(), (lpinbuffer?.value ?: 0L).toString(), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), noutbuffersize.toInt(), (lpbytesread?.value ?: 0L).toString(), ntimeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectNamedPipe(hnamedpipe: Handle, lpoverlapped: COpaquePointer?): Bool =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_connectNamedPipe((hnamedpipe?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createNamedPipeA(lpname: Pcstr, dwopenmode: FileFlagsAndAttributes, dwpipemode: NamedPipeMode, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: COpaquePointer?): Handle =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_createNamedPipeA((lpname?.value ?: 0L).toString(), dwopenmode.toInt(), dwpipemode.toInt(), nmaxinstances.toInt(), noutbuffersize.toInt(), ninbuffersize.toInt(), ndefaulttimeout.toInt(), (lpsecurityattributes?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createNamedPipeW(lpname: Pcwstr, dwopenmode: FileFlagsAndAttributes, dwpipemode: NamedPipeMode, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: COpaquePointer?): Handle =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_createNamedPipeW((lpname?.value ?: 0L).toString(), dwopenmode.toInt(), dwpipemode.toInt(), nmaxinstances.toInt(), noutbuffersize.toInt(), ninbuffersize.toInt(), ndefaulttimeout.toInt(), (lpsecurityattributes?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPipe(hreadpipe: COpaquePointer?, hwritepipe: COpaquePointer?, lppipeattributes: COpaquePointer?, nsize: UInt): Bool =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_createPipe((hreadpipe?.value ?: 0L).toString(), (hwritepipe?.value ?: 0L).toString(), (lppipeattributes?.value ?: 0L).toString(), nsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disconnectNamedPipe(hnamedpipe: Handle): Bool =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_disconnectNamedPipe((hnamedpipe?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeClientComputerNameA(pipe: Handle, clientcomputername: Pstr, clientcomputernamelength: UInt): Bool =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_getNamedPipeClientComputerNameA((pipe?.value ?: 0L).toString(), (clientcomputername?.value ?: 0L).toString(), clientcomputernamelength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeClientComputerNameW(pipe: Handle, clientcomputername: Pwstr, clientcomputernamelength: UInt): Bool =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_getNamedPipeClientComputerNameW((pipe?.value ?: 0L).toString(), (clientcomputername?.value ?: 0L).toString(), clientcomputernamelength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeClientProcessId(pipe: Handle, clientprocessid: COpaquePointer?): Bool =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_getNamedPipeClientProcessId((pipe?.value ?: 0L).toString(), (clientprocessid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeClientSessionId(pipe: Handle, clientsessionid: COpaquePointer?): Bool =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_getNamedPipeClientSessionId((pipe?.value ?: 0L).toString(), (clientsessionid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeHandleStateA(hnamedpipe: Handle, lpstate: COpaquePointer?, lpcurinstances: COpaquePointer?, lpmaxcollectioncount: COpaquePointer?, lpcollectdatatimeout: COpaquePointer?, lpusername: Pstr, nmaxusernamesize: UInt): Bool =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_getNamedPipeHandleStateA((hnamedpipe?.value ?: 0L).toString(), (lpstate?.value ?: 0L).toString(), (lpcurinstances?.value ?: 0L).toString(), (lpmaxcollectioncount?.value ?: 0L).toString(), (lpcollectdatatimeout?.value ?: 0L).toString(), (lpusername?.value ?: 0L).toString(), nmaxusernamesize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeHandleStateW(hnamedpipe: Handle, lpstate: COpaquePointer?, lpcurinstances: COpaquePointer?, lpmaxcollectioncount: COpaquePointer?, lpcollectdatatimeout: COpaquePointer?, lpusername: Pwstr, nmaxusernamesize: UInt): Bool =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_getNamedPipeHandleStateW((hnamedpipe?.value ?: 0L).toString(), (lpstate?.value ?: 0L).toString(), (lpcurinstances?.value ?: 0L).toString(), (lpmaxcollectioncount?.value ?: 0L).toString(), (lpcollectdatatimeout?.value ?: 0L).toString(), (lpusername?.value ?: 0L).toString(), nmaxusernamesize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeInfo(hnamedpipe: Handle, lpflags: COpaquePointer?, lpoutbuffersize: COpaquePointer?, lpinbuffersize: COpaquePointer?, lpmaxinstances: COpaquePointer?): Bool =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_getNamedPipeInfo((hnamedpipe?.value ?: 0L).toString(), (lpflags?.value ?: 0L).toString(), (lpoutbuffersize?.value ?: 0L).toString(), (lpinbuffersize?.value ?: 0L).toString(), (lpmaxinstances?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeServerProcessId(pipe: Handle, serverprocessid: COpaquePointer?): Bool =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_getNamedPipeServerProcessId((pipe?.value ?: 0L).toString(), (serverprocessid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedPipeServerSessionId(pipe: Handle, serversessionid: COpaquePointer?): Bool =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_getNamedPipeServerSessionId((pipe?.value ?: 0L).toString(), (serversessionid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun impersonateNamedPipeClient(hnamedpipe: Handle): Bool =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_impersonateNamedPipeClient((hnamedpipe?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peekNamedPipe(hnamedpipe: Handle, lpbuffer: COpaquePointer?, nbuffersize: UInt, lpbytesread: COpaquePointer?, lptotalbytesavail: COpaquePointer?, lpbytesleftthismessage: COpaquePointer?): Bool =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_peekNamedPipe((hnamedpipe?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nbuffersize.toInt(), (lpbytesread?.value ?: 0L).toString(), (lptotalbytesavail?.value ?: 0L).toString(), (lpbytesleftthismessage?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setNamedPipeHandleState(hnamedpipe: Handle, lpmode: COpaquePointer?, lpmaxcollectioncount: COpaquePointer?, lpcollectdatatimeout: COpaquePointer?): Bool =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_setNamedPipeHandleState((hnamedpipe?.value ?: 0L).toString(), (lpmode?.value ?: 0L).toString(), (lpmaxcollectioncount?.value ?: 0L).toString(), (lpcollectdatatimeout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transactNamedPipe(hnamedpipe: Handle, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesread: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_transactNamedPipe((hnamedpipe?.value ?: 0L).toString(), (lpinbuffer?.value ?: 0L).toString(), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), noutbuffersize.toInt(), (lpbytesread?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitNamedPipeA(lpnamedpipename: Pcstr, ntimeout: UInt): Bool =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_waitNamedPipeA((lpnamedpipename?.value ?: 0L).toString(), ntimeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitNamedPipeW(lpnamedpipename: Pcwstr, ntimeout: UInt): Bool =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_waitNamedPipeW((lpnamedpipename?.value ?: 0L).toString(), ntimeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
