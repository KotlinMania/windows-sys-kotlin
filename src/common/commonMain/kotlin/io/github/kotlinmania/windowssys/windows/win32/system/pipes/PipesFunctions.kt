package io.github.kotlinmania.windowssys.windows.win32.system.pipes

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun CallNamedPipeA(lpnamedpipename: PCSTR, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesread: Long, ntimeout: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CallNamedPipeA", longArrayOf(lpnamedpipename, lpinbuffer, ninbuffersize.toLong(), lpoutbuffer, noutbuffersize.toLong(), lpbytesread, ntimeout.toLong())).toInt()
}

public fun CallNamedPipeW(lpnamedpipename: PCWSTR, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesread: Long, ntimeout: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CallNamedPipeW", longArrayOf(lpnamedpipename, lpinbuffer, ninbuffersize.toLong(), lpoutbuffer, noutbuffersize.toLong(), lpbytesread, ntimeout.toLong())).toInt()
}

public fun ConnectNamedPipe(hnamedpipe: Foundation.HANDLE, lpoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ConnectNamedPipe", longArrayOf(Win32DynamicFfi.objectSlot(hnamedpipe), lpoverlapped)).toInt()
}

public fun CreateNamedPipeA(lpname: PCSTR, dwopenmode: Storage.FileSystem.FILE_FLAGS_AND_ATTRIBUTES, dwpipemode: NAMED_PIPE_MODE, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: Long): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateNamedPipeA", longArrayOf(lpname, Win32DynamicFfi.objectSlot(dwopenmode), dwpipemode.toLong(), nmaxinstances.toLong(), noutbuffersize.toLong(), ninbuffersize.toLong(), ndefaulttimeout.toLong(), lpsecurityattributes))
    return Foundation.HANDLE()
}

public fun CreateNamedPipeW(lpname: PCWSTR, dwopenmode: Storage.FileSystem.FILE_FLAGS_AND_ATTRIBUTES, dwpipemode: NAMED_PIPE_MODE, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: Long): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateNamedPipeW", longArrayOf(lpname, Win32DynamicFfi.objectSlot(dwopenmode), dwpipemode.toLong(), nmaxinstances.toLong(), noutbuffersize.toLong(), ninbuffersize.toLong(), ndefaulttimeout.toLong(), lpsecurityattributes))
    return Foundation.HANDLE()
}

public fun CreatePipe(hreadpipe: Long, hwritepipe: Long, lppipeattributes: Long, nsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreatePipe", longArrayOf(hreadpipe, hwritepipe, lppipeattributes, nsize.toLong())).toInt()
}

public fun DisconnectNamedPipe(hnamedpipe: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DisconnectNamedPipe", longArrayOf(Win32DynamicFfi.objectSlot(hnamedpipe))).toInt()
}

public fun GetNamedPipeClientComputerNameA(pipe: Foundation.HANDLE, clientcomputername: PSTR, clientcomputernamelength: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNamedPipeClientComputerNameA", longArrayOf(Win32DynamicFfi.objectSlot(pipe), clientcomputername, clientcomputernamelength.toLong())).toInt()
}

public fun GetNamedPipeClientComputerNameW(pipe: Foundation.HANDLE, clientcomputername: PWSTR, clientcomputernamelength: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNamedPipeClientComputerNameW", longArrayOf(Win32DynamicFfi.objectSlot(pipe), clientcomputername, clientcomputernamelength.toLong())).toInt()
}

public fun GetNamedPipeClientProcessId(pipe: Foundation.HANDLE, clientprocessid: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNamedPipeClientProcessId", longArrayOf(Win32DynamicFfi.objectSlot(pipe), clientprocessid)).toInt()
}

public fun GetNamedPipeClientSessionId(pipe: Foundation.HANDLE, clientsessionid: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNamedPipeClientSessionId", longArrayOf(Win32DynamicFfi.objectSlot(pipe), clientsessionid)).toInt()
}

public fun GetNamedPipeHandleStateA(hnamedpipe: Foundation.HANDLE, lpstate: Long, lpcurinstances: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long, lpusername: PSTR, nmaxusernamesize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNamedPipeHandleStateA", longArrayOf(Win32DynamicFfi.objectSlot(hnamedpipe), lpstate, lpcurinstances, lpmaxcollectioncount, lpcollectdatatimeout, lpusername, nmaxusernamesize.toLong())).toInt()
}

public fun GetNamedPipeHandleStateW(hnamedpipe: Foundation.HANDLE, lpstate: Long, lpcurinstances: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long, lpusername: PWSTR, nmaxusernamesize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNamedPipeHandleStateW", longArrayOf(Win32DynamicFfi.objectSlot(hnamedpipe), lpstate, lpcurinstances, lpmaxcollectioncount, lpcollectdatatimeout, lpusername, nmaxusernamesize.toLong())).toInt()
}

public fun GetNamedPipeInfo(hnamedpipe: Foundation.HANDLE, lpflags: Long, lpoutbuffersize: Long, lpinbuffersize: Long, lpmaxinstances: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNamedPipeInfo", longArrayOf(Win32DynamicFfi.objectSlot(hnamedpipe), lpflags, lpoutbuffersize, lpinbuffersize, lpmaxinstances)).toInt()
}

public fun GetNamedPipeServerProcessId(pipe: Foundation.HANDLE, serverprocessid: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNamedPipeServerProcessId", longArrayOf(Win32DynamicFfi.objectSlot(pipe), serverprocessid)).toInt()
}

public fun GetNamedPipeServerSessionId(pipe: Foundation.HANDLE, serversessionid: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNamedPipeServerSessionId", longArrayOf(Win32DynamicFfi.objectSlot(pipe), serversessionid)).toInt()
}

public fun ImpersonateNamedPipeClient(hnamedpipe: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ImpersonateNamedPipeClient", longArrayOf(Win32DynamicFfi.objectSlot(hnamedpipe))).toInt()
}

public fun PeekNamedPipe(hnamedpipe: Foundation.HANDLE, lpbuffer: Long, nbuffersize: UInt, lpbytesread: Long, lptotalbytesavail: Long, lpbytesleftthismessage: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "PeekNamedPipe", longArrayOf(Win32DynamicFfi.objectSlot(hnamedpipe), lpbuffer, nbuffersize.toLong(), lpbytesread, lptotalbytesavail, lpbytesleftthismessage)).toInt()
}

public fun SetNamedPipeHandleState(hnamedpipe: Foundation.HANDLE, lpmode: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetNamedPipeHandleState", longArrayOf(Win32DynamicFfi.objectSlot(hnamedpipe), lpmode, lpmaxcollectioncount, lpcollectdatatimeout)).toInt()
}

public fun TransactNamedPipe(hnamedpipe: Foundation.HANDLE, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesread: Long, lpoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "TransactNamedPipe", longArrayOf(Win32DynamicFfi.objectSlot(hnamedpipe), lpinbuffer, ninbuffersize.toLong(), lpoutbuffer, noutbuffersize.toLong(), lpbytesread, lpoverlapped)).toInt()
}

public fun WaitNamedPipeA(lpnamedpipename: PCSTR, ntimeout: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WaitNamedPipeA", longArrayOf(lpnamedpipename, ntimeout.toLong())).toInt()
}

public fun WaitNamedPipeW(lpnamedpipename: PCWSTR, ntimeout: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WaitNamedPipeW", longArrayOf(lpnamedpipename, ntimeout.toLong())).toInt()
}
