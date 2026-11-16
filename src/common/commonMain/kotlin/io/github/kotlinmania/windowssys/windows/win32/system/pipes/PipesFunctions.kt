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

public expect fun callNamedPipeA(lpnamedpipename: Pcstr, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesread: MutPtr, ntimeout: UInt): Bool

public expect fun callNamedPipeW(lpnamedpipename: Pcwstr, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesread: MutPtr, ntimeout: UInt): Bool

public expect fun connectNamedPipe(hnamedpipe: Handle, lpoverlapped: MutPtr): Bool

public expect fun createNamedPipeA(lpname: Pcstr, dwopenmode: FileFlagsAndAttributes, dwpipemode: NamedPipeMode, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: ConstPtr): Handle

public expect fun createNamedPipeW(lpname: Pcwstr, dwopenmode: FileFlagsAndAttributes, dwpipemode: NamedPipeMode, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: ConstPtr): Handle

public expect fun createPipe(hreadpipe: MutPtr, hwritepipe: MutPtr, lppipeattributes: ConstPtr, nsize: UInt): Bool

public expect fun disconnectNamedPipe(hnamedpipe: Handle): Bool

public expect fun getNamedPipeClientComputerNameA(pipe: Handle, clientcomputername: Pstr, clientcomputernamelength: UInt): Bool

public expect fun getNamedPipeClientComputerNameW(pipe: Handle, clientcomputername: Pwstr, clientcomputernamelength: UInt): Bool

public expect fun getNamedPipeClientProcessId(pipe: Handle, clientprocessid: MutPtr): Bool

public expect fun getNamedPipeClientSessionId(pipe: Handle, clientsessionid: MutPtr): Bool

public expect fun getNamedPipeHandleStateA(hnamedpipe: Handle, lpstate: MutPtr, lpcurinstances: MutPtr, lpmaxcollectioncount: MutPtr, lpcollectdatatimeout: MutPtr, lpusername: Pstr, nmaxusernamesize: UInt): Bool

public expect fun getNamedPipeHandleStateW(hnamedpipe: Handle, lpstate: MutPtr, lpcurinstances: MutPtr, lpmaxcollectioncount: MutPtr, lpcollectdatatimeout: MutPtr, lpusername: Pwstr, nmaxusernamesize: UInt): Bool

public expect fun getNamedPipeInfo(hnamedpipe: Handle, lpflags: MutPtr, lpoutbuffersize: MutPtr, lpinbuffersize: MutPtr, lpmaxinstances: MutPtr): Bool

public expect fun getNamedPipeServerProcessId(pipe: Handle, serverprocessid: MutPtr): Bool

public expect fun getNamedPipeServerSessionId(pipe: Handle, serversessionid: MutPtr): Bool

public expect fun impersonateNamedPipeClient(hnamedpipe: Handle): Bool

public expect fun peekNamedPipe(hnamedpipe: Handle, lpbuffer: MutPtr, nbuffersize: UInt, lpbytesread: MutPtr, lptotalbytesavail: MutPtr, lpbytesleftthismessage: MutPtr): Bool

public expect fun setNamedPipeHandleState(hnamedpipe: Handle, lpmode: ConstPtr, lpmaxcollectioncount: ConstPtr, lpcollectdatatimeout: ConstPtr): Bool

public expect fun transactNamedPipe(hnamedpipe: Handle, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesread: MutPtr, lpoverlapped: MutPtr): Bool

public expect fun waitNamedPipeA(lpnamedpipename: Pcstr, ntimeout: UInt): Bool

public expect fun waitNamedPipeW(lpnamedpipename: Pcwstr, ntimeout: UInt): Bool
