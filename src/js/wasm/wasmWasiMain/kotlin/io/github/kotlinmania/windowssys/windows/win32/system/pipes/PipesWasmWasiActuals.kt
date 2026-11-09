@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.pipes

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_FLAGS_AND_ATTRIBUTES

public actual fun CallNamedPipeA(lpnamedpipename: PCSTR, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesread: Long, ntimeout: UInt): BOOL =
    0

public actual fun CallNamedPipeW(lpnamedpipename: PCWSTR, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesread: Long, ntimeout: UInt): BOOL =
    0

public actual fun ConnectNamedPipe(hnamedpipe: HANDLE, lpoverlapped: Long): BOOL =
    0

public actual fun CreateNamedPipeA(lpname: PCSTR, dwopenmode: FILE_FLAGS_AND_ATTRIBUTES, dwpipemode: NAMED_PIPE_MODE, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: Long): HANDLE =
    0L

public actual fun CreateNamedPipeW(lpname: PCWSTR, dwopenmode: FILE_FLAGS_AND_ATTRIBUTES, dwpipemode: NAMED_PIPE_MODE, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: Long): HANDLE =
    0L

public actual fun CreatePipe(hreadpipe: Long, hwritepipe: Long, lppipeattributes: Long, nsize: UInt): BOOL =
    0

public actual fun DisconnectNamedPipe(hnamedpipe: HANDLE): BOOL =
    0

public actual fun GetNamedPipeClientComputerNameA(pipe: HANDLE, clientcomputername: PSTR, clientcomputernamelength: UInt): BOOL =
    0

public actual fun GetNamedPipeClientComputerNameW(pipe: HANDLE, clientcomputername: PWSTR, clientcomputernamelength: UInt): BOOL =
    0

public actual fun GetNamedPipeClientProcessId(pipe: HANDLE, clientprocessid: Long): BOOL =
    0

public actual fun GetNamedPipeClientSessionId(pipe: HANDLE, clientsessionid: Long): BOOL =
    0

public actual fun GetNamedPipeHandleStateA(hnamedpipe: HANDLE, lpstate: Long, lpcurinstances: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long, lpusername: PSTR, nmaxusernamesize: UInt): BOOL =
    0

public actual fun GetNamedPipeHandleStateW(hnamedpipe: HANDLE, lpstate: Long, lpcurinstances: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long, lpusername: PWSTR, nmaxusernamesize: UInt): BOOL =
    0

public actual fun GetNamedPipeInfo(hnamedpipe: HANDLE, lpflags: Long, lpoutbuffersize: Long, lpinbuffersize: Long, lpmaxinstances: Long): BOOL =
    0

public actual fun GetNamedPipeServerProcessId(pipe: HANDLE, serverprocessid: Long): BOOL =
    0

public actual fun GetNamedPipeServerSessionId(pipe: HANDLE, serversessionid: Long): BOOL =
    0

public actual fun ImpersonateNamedPipeClient(hnamedpipe: HANDLE): BOOL =
    0

public actual fun PeekNamedPipe(hnamedpipe: HANDLE, lpbuffer: Long, nbuffersize: UInt, lpbytesread: Long, lptotalbytesavail: Long, lpbytesleftthismessage: Long): BOOL =
    0

public actual fun SetNamedPipeHandleState(hnamedpipe: HANDLE, lpmode: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long): BOOL =
    0

public actual fun TransactNamedPipe(hnamedpipe: HANDLE, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesread: Long, lpoverlapped: Long): BOOL =
    0

public actual fun WaitNamedPipeA(lpnamedpipename: PCSTR, ntimeout: UInt): BOOL =
    0

public actual fun WaitNamedPipeW(lpnamedpipename: PCWSTR, ntimeout: UInt): BOOL =
    0
