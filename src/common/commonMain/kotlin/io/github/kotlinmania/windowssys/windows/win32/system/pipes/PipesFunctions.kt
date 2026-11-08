package io.github.kotlinmania.windowssys.windows.win32.system.pipes

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_FLAGS_AND_ATTRIBUTES

public fun CallNamedPipeA(lpnamedpipename: PCSTR, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesread: Long, ntimeout: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CallNamedPipeA", longArrayOf(lpnamedpipename, lpinbuffer, ninbuffersize.toLong(), lpoutbuffer, noutbuffersize.toLong(), lpbytesread, ntimeout.toLong())).toInt()
}

public fun CallNamedPipeW(lpnamedpipename: PCWSTR, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesread: Long, ntimeout: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CallNamedPipeW", longArrayOf(lpnamedpipename, lpinbuffer, ninbuffersize.toLong(), lpoutbuffer, noutbuffersize.toLong(), lpbytesread, ntimeout.toLong())).toInt()
}

public fun ConnectNamedPipe(hnamedpipe: HANDLE, lpoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ConnectNamedPipe", longArrayOf(hnamedpipe, lpoverlapped)).toInt()
}

public fun CreateNamedPipeA(lpname: PCSTR, dwopenmode: FILE_FLAGS_AND_ATTRIBUTES, dwpipemode: NAMED_PIPE_MODE, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: Long): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateNamedPipeA", longArrayOf(lpname, dwopenmode.toLong(), dwpipemode.toLong(), nmaxinstances.toLong(), noutbuffersize.toLong(), ninbuffersize.toLong(), ndefaulttimeout.toLong(), lpsecurityattributes))
}

public fun CreateNamedPipeW(lpname: PCWSTR, dwopenmode: FILE_FLAGS_AND_ATTRIBUTES, dwpipemode: NAMED_PIPE_MODE, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: Long): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateNamedPipeW", longArrayOf(lpname, dwopenmode.toLong(), dwpipemode.toLong(), nmaxinstances.toLong(), noutbuffersize.toLong(), ninbuffersize.toLong(), ndefaulttimeout.toLong(), lpsecurityattributes))
}

public fun CreatePipe(hreadpipe: Long, hwritepipe: Long, lppipeattributes: Long, nsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreatePipe", longArrayOf(hreadpipe, hwritepipe, lppipeattributes, nsize.toLong())).toInt()
}

public fun DisconnectNamedPipe(hnamedpipe: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DisconnectNamedPipe", longArrayOf(hnamedpipe)).toInt()
}

public fun GetNamedPipeClientComputerNameA(pipe: HANDLE, clientcomputername: PSTR, clientcomputernamelength: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNamedPipeClientComputerNameA", longArrayOf(pipe, clientcomputername, clientcomputernamelength.toLong())).toInt()
}

public fun GetNamedPipeClientComputerNameW(pipe: HANDLE, clientcomputername: PWSTR, clientcomputernamelength: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNamedPipeClientComputerNameW", longArrayOf(pipe, clientcomputername, clientcomputernamelength.toLong())).toInt()
}

public fun GetNamedPipeClientProcessId(pipe: HANDLE, clientprocessid: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNamedPipeClientProcessId", longArrayOf(pipe, clientprocessid)).toInt()
}

public fun GetNamedPipeClientSessionId(pipe: HANDLE, clientsessionid: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNamedPipeClientSessionId", longArrayOf(pipe, clientsessionid)).toInt()
}

public fun GetNamedPipeHandleStateA(hnamedpipe: HANDLE, lpstate: Long, lpcurinstances: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long, lpusername: PSTR, nmaxusernamesize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNamedPipeHandleStateA", longArrayOf(hnamedpipe, lpstate, lpcurinstances, lpmaxcollectioncount, lpcollectdatatimeout, lpusername, nmaxusernamesize.toLong())).toInt()
}

public fun GetNamedPipeHandleStateW(hnamedpipe: HANDLE, lpstate: Long, lpcurinstances: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long, lpusername: PWSTR, nmaxusernamesize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNamedPipeHandleStateW", longArrayOf(hnamedpipe, lpstate, lpcurinstances, lpmaxcollectioncount, lpcollectdatatimeout, lpusername, nmaxusernamesize.toLong())).toInt()
}

public fun GetNamedPipeInfo(hnamedpipe: HANDLE, lpflags: Long, lpoutbuffersize: Long, lpinbuffersize: Long, lpmaxinstances: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNamedPipeInfo", longArrayOf(hnamedpipe, lpflags, lpoutbuffersize, lpinbuffersize, lpmaxinstances)).toInt()
}

public fun GetNamedPipeServerProcessId(pipe: HANDLE, serverprocessid: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNamedPipeServerProcessId", longArrayOf(pipe, serverprocessid)).toInt()
}

public fun GetNamedPipeServerSessionId(pipe: HANDLE, serversessionid: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNamedPipeServerSessionId", longArrayOf(pipe, serversessionid)).toInt()
}

public fun ImpersonateNamedPipeClient(hnamedpipe: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ImpersonateNamedPipeClient", longArrayOf(hnamedpipe)).toInt()
}

public fun PeekNamedPipe(hnamedpipe: HANDLE, lpbuffer: Long, nbuffersize: UInt, lpbytesread: Long, lptotalbytesavail: Long, lpbytesleftthismessage: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "PeekNamedPipe", longArrayOf(hnamedpipe, lpbuffer, nbuffersize.toLong(), lpbytesread, lptotalbytesavail, lpbytesleftthismessage)).toInt()
}

public fun SetNamedPipeHandleState(hnamedpipe: HANDLE, lpmode: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetNamedPipeHandleState", longArrayOf(hnamedpipe, lpmode, lpmaxcollectioncount, lpcollectdatatimeout)).toInt()
}

public fun TransactNamedPipe(hnamedpipe: HANDLE, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesread: Long, lpoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "TransactNamedPipe", longArrayOf(hnamedpipe, lpinbuffer, ninbuffersize.toLong(), lpoutbuffer, noutbuffersize.toLong(), lpbytesread, lpoverlapped)).toInt()
}

public fun WaitNamedPipeA(lpnamedpipename: PCSTR, ntimeout: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WaitNamedPipeA", longArrayOf(lpnamedpipename, ntimeout.toLong())).toInt()
}

public fun WaitNamedPipeW(lpnamedpipename: PCWSTR, ntimeout: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WaitNamedPipeW", longArrayOf(lpnamedpipename, ntimeout.toLong())).toInt()
}
