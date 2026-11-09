package io.github.kotlinmania.windowssys.windows.win32.system.pipes

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_FLAGS_AND_ATTRIBUTES

public expect fun CallNamedPipeA(lpnamedpipename: PCSTR, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesread: Long, ntimeout: UInt): BOOL

public expect fun CallNamedPipeW(lpnamedpipename: PCWSTR, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesread: Long, ntimeout: UInt): BOOL

public expect fun ConnectNamedPipe(hnamedpipe: HANDLE, lpoverlapped: Long): BOOL

public expect fun CreateNamedPipeA(lpname: PCSTR, dwopenmode: FILE_FLAGS_AND_ATTRIBUTES, dwpipemode: NAMED_PIPE_MODE, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: Long): HANDLE

public expect fun CreateNamedPipeW(lpname: PCWSTR, dwopenmode: FILE_FLAGS_AND_ATTRIBUTES, dwpipemode: NAMED_PIPE_MODE, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: Long): HANDLE

public expect fun CreatePipe(hreadpipe: Long, hwritepipe: Long, lppipeattributes: Long, nsize: UInt): BOOL

public expect fun DisconnectNamedPipe(hnamedpipe: HANDLE): BOOL

public expect fun GetNamedPipeClientComputerNameA(pipe: HANDLE, clientcomputername: PSTR, clientcomputernamelength: UInt): BOOL

public expect fun GetNamedPipeClientComputerNameW(pipe: HANDLE, clientcomputername: PWSTR, clientcomputernamelength: UInt): BOOL

public expect fun GetNamedPipeClientProcessId(pipe: HANDLE, clientprocessid: Long): BOOL

public expect fun GetNamedPipeClientSessionId(pipe: HANDLE, clientsessionid: Long): BOOL

public expect fun GetNamedPipeHandleStateA(hnamedpipe: HANDLE, lpstate: Long, lpcurinstances: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long, lpusername: PSTR, nmaxusernamesize: UInt): BOOL

public expect fun GetNamedPipeHandleStateW(hnamedpipe: HANDLE, lpstate: Long, lpcurinstances: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long, lpusername: PWSTR, nmaxusernamesize: UInt): BOOL

public expect fun GetNamedPipeInfo(hnamedpipe: HANDLE, lpflags: Long, lpoutbuffersize: Long, lpinbuffersize: Long, lpmaxinstances: Long): BOOL

public expect fun GetNamedPipeServerProcessId(pipe: HANDLE, serverprocessid: Long): BOOL

public expect fun GetNamedPipeServerSessionId(pipe: HANDLE, serversessionid: Long): BOOL

public expect fun ImpersonateNamedPipeClient(hnamedpipe: HANDLE): BOOL

public expect fun PeekNamedPipe(hnamedpipe: HANDLE, lpbuffer: Long, nbuffersize: UInt, lpbytesread: Long, lptotalbytesavail: Long, lpbytesleftthismessage: Long): BOOL

public expect fun SetNamedPipeHandleState(hnamedpipe: HANDLE, lpmode: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long): BOOL

public expect fun TransactNamedPipe(hnamedpipe: HANDLE, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesread: Long, lpoverlapped: Long): BOOL

public expect fun WaitNamedPipeA(lpnamedpipename: PCSTR, ntimeout: UInt): BOOL

public expect fun WaitNamedPipeW(lpnamedpipename: PCWSTR, ntimeout: UInt): BOOL
