@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.pipes

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_FLAGS_AND_ATTRIBUTES

private val _windowsWin32SystemPipesNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun CallNamedPipeA(lpnamedpipename: PCSTR, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesread: Long, ntimeout: UInt): BOOL =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_CallNamedPipeA(lpnamedpipename.toString(), lpinbuffer.toString(), ninbuffersize.toInt(), lpoutbuffer.toString(), noutbuffersize.toInt(), lpbytesread.toString(), ntimeout.toInt()) as Int) else 0

public actual fun CallNamedPipeW(lpnamedpipename: PCWSTR, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesread: Long, ntimeout: UInt): BOOL =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_CallNamedPipeW(lpnamedpipename.toString(), lpinbuffer.toString(), ninbuffersize.toInt(), lpoutbuffer.toString(), noutbuffersize.toInt(), lpbytesread.toString(), ntimeout.toInt()) as Int) else 0

public actual fun ConnectNamedPipe(hnamedpipe: HANDLE, lpoverlapped: Long): BOOL =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_ConnectNamedPipe(hnamedpipe.toString(), lpoverlapped.toString()) as Int) else 0

public actual fun CreateNamedPipeA(lpname: PCSTR, dwopenmode: FILE_FLAGS_AND_ATTRIBUTES, dwpipemode: NAMED_PIPE_MODE, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: Long): HANDLE =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_CreateNamedPipeA(lpname.toString(), dwopenmode.toInt(), dwpipemode.toInt(), nmaxinstances.toInt(), noutbuffersize.toInt(), ninbuffersize.toInt(), ndefaulttimeout.toInt(), lpsecurityattributes.toString()) as String).toLong() else 0L

public actual fun CreateNamedPipeW(lpname: PCWSTR, dwopenmode: FILE_FLAGS_AND_ATTRIBUTES, dwpipemode: NAMED_PIPE_MODE, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: Long): HANDLE =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_CreateNamedPipeW(lpname.toString(), dwopenmode.toInt(), dwpipemode.toInt(), nmaxinstances.toInt(), noutbuffersize.toInt(), ninbuffersize.toInt(), ndefaulttimeout.toInt(), lpsecurityattributes.toString()) as String).toLong() else 0L

public actual fun CreatePipe(hreadpipe: Long, hwritepipe: Long, lppipeattributes: Long, nsize: UInt): BOOL =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_CreatePipe(hreadpipe.toString(), hwritepipe.toString(), lppipeattributes.toString(), nsize.toInt()) as Int) else 0

public actual fun DisconnectNamedPipe(hnamedpipe: HANDLE): BOOL =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_DisconnectNamedPipe(hnamedpipe.toString()) as Int) else 0

public actual fun GetNamedPipeClientComputerNameA(pipe: HANDLE, clientcomputername: PSTR, clientcomputernamelength: UInt): BOOL =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_GetNamedPipeClientComputerNameA(pipe.toString(), clientcomputername.toString(), clientcomputernamelength.toInt()) as Int) else 0

public actual fun GetNamedPipeClientComputerNameW(pipe: HANDLE, clientcomputername: PWSTR, clientcomputernamelength: UInt): BOOL =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_GetNamedPipeClientComputerNameW(pipe.toString(), clientcomputername.toString(), clientcomputernamelength.toInt()) as Int) else 0

public actual fun GetNamedPipeClientProcessId(pipe: HANDLE, clientprocessid: Long): BOOL =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_GetNamedPipeClientProcessId(pipe.toString(), clientprocessid.toString()) as Int) else 0

public actual fun GetNamedPipeClientSessionId(pipe: HANDLE, clientsessionid: Long): BOOL =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_GetNamedPipeClientSessionId(pipe.toString(), clientsessionid.toString()) as Int) else 0

public actual fun GetNamedPipeHandleStateA(hnamedpipe: HANDLE, lpstate: Long, lpcurinstances: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long, lpusername: PSTR, nmaxusernamesize: UInt): BOOL =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_GetNamedPipeHandleStateA(hnamedpipe.toString(), lpstate.toString(), lpcurinstances.toString(), lpmaxcollectioncount.toString(), lpcollectdatatimeout.toString(), lpusername.toString(), nmaxusernamesize.toInt()) as Int) else 0

public actual fun GetNamedPipeHandleStateW(hnamedpipe: HANDLE, lpstate: Long, lpcurinstances: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long, lpusername: PWSTR, nmaxusernamesize: UInt): BOOL =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_GetNamedPipeHandleStateW(hnamedpipe.toString(), lpstate.toString(), lpcurinstances.toString(), lpmaxcollectioncount.toString(), lpcollectdatatimeout.toString(), lpusername.toString(), nmaxusernamesize.toInt()) as Int) else 0

public actual fun GetNamedPipeInfo(hnamedpipe: HANDLE, lpflags: Long, lpoutbuffersize: Long, lpinbuffersize: Long, lpmaxinstances: Long): BOOL =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_GetNamedPipeInfo(hnamedpipe.toString(), lpflags.toString(), lpoutbuffersize.toString(), lpinbuffersize.toString(), lpmaxinstances.toString()) as Int) else 0

public actual fun GetNamedPipeServerProcessId(pipe: HANDLE, serverprocessid: Long): BOOL =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_GetNamedPipeServerProcessId(pipe.toString(), serverprocessid.toString()) as Int) else 0

public actual fun GetNamedPipeServerSessionId(pipe: HANDLE, serversessionid: Long): BOOL =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_GetNamedPipeServerSessionId(pipe.toString(), serversessionid.toString()) as Int) else 0

public actual fun ImpersonateNamedPipeClient(hnamedpipe: HANDLE): BOOL =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_ImpersonateNamedPipeClient(hnamedpipe.toString()) as Int) else 0

public actual fun PeekNamedPipe(hnamedpipe: HANDLE, lpbuffer: Long, nbuffersize: UInt, lpbytesread: Long, lptotalbytesavail: Long, lpbytesleftthismessage: Long): BOOL =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_PeekNamedPipe(hnamedpipe.toString(), lpbuffer.toString(), nbuffersize.toInt(), lpbytesread.toString(), lptotalbytesavail.toString(), lpbytesleftthismessage.toString()) as Int) else 0

public actual fun SetNamedPipeHandleState(hnamedpipe: HANDLE, lpmode: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long): BOOL =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_SetNamedPipeHandleState(hnamedpipe.toString(), lpmode.toString(), lpmaxcollectioncount.toString(), lpcollectdatatimeout.toString()) as Int) else 0

public actual fun TransactNamedPipe(hnamedpipe: HANDLE, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesread: Long, lpoverlapped: Long): BOOL =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_TransactNamedPipe(hnamedpipe.toString(), lpinbuffer.toString(), ninbuffersize.toInt(), lpoutbuffer.toString(), noutbuffersize.toInt(), lpbytesread.toString(), lpoverlapped.toString()) as Int) else 0

public actual fun WaitNamedPipeA(lpnamedpipename: PCSTR, ntimeout: UInt): BOOL =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_WaitNamedPipeA(lpnamedpipename.toString(), ntimeout.toInt()) as Int) else 0

public actual fun WaitNamedPipeW(lpnamedpipename: PCWSTR, ntimeout: UInt): BOOL =
    if (_windowsWin32SystemPipesNapiAddon != null) (_windowsWin32SystemPipesNapiAddon.windowssys_windows_win32_system_pipes_WaitNamedPipeW(lpnamedpipename.toString(), ntimeout.toInt()) as Int) else 0
