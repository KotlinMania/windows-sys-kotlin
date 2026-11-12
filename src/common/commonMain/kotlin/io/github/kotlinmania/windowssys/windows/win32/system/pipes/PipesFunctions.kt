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

public expect fun callNamedPipeA(lpnamedpipename: Pcstr, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesread: MutPtr<UInt>, ntimeout: UInt): Bool

public expect fun callNamedPipeW(lpnamedpipename: Pcwstr, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesread: MutPtr<UInt>, ntimeout: UInt): Bool

public expect fun connectNamedPipe(hnamedpipe: Handle, lpoverlapped: MutPtr<Overlapped>): Bool

public expect fun createNamedPipeA(lpname: Pcstr, dwopenmode: FileFlagsAndAttributes, dwpipemode: NamedPipeMode, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>): Handle

public expect fun createNamedPipeW(lpname: Pcwstr, dwopenmode: FileFlagsAndAttributes, dwpipemode: NamedPipeMode, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>): Handle

public expect fun createPipe(hreadpipe: MutPtr<Handle>, hwritepipe: MutPtr<Handle>, lppipeattributes: ConstPtr<SecurityAttributes>, nsize: UInt): Bool

public expect fun disconnectNamedPipe(hnamedpipe: Handle): Bool

public expect fun getNamedPipeClientComputerNameA(pipe: Handle, clientcomputername: Pstr, clientcomputernamelength: UInt): Bool

public expect fun getNamedPipeClientComputerNameW(pipe: Handle, clientcomputername: Pwstr, clientcomputernamelength: UInt): Bool

public expect fun getNamedPipeClientProcessId(pipe: Handle, clientprocessid: MutPtr<UInt>): Bool

public expect fun getNamedPipeClientSessionId(pipe: Handle, clientsessionid: MutPtr<UInt>): Bool

public expect fun getNamedPipeHandleStateA(hnamedpipe: Handle, lpstate: MutPtr<NamedPipeMode>, lpcurinstances: MutPtr<UInt>, lpmaxcollectioncount: MutPtr<UInt>, lpcollectdatatimeout: MutPtr<UInt>, lpusername: Pstr, nmaxusernamesize: UInt): Bool

public expect fun getNamedPipeHandleStateW(hnamedpipe: Handle, lpstate: MutPtr<NamedPipeMode>, lpcurinstances: MutPtr<UInt>, lpmaxcollectioncount: MutPtr<UInt>, lpcollectdatatimeout: MutPtr<UInt>, lpusername: Pwstr, nmaxusernamesize: UInt): Bool

public expect fun getNamedPipeInfo(hnamedpipe: Handle, lpflags: MutPtr<NamedPipeMode>, lpoutbuffersize: MutPtr<UInt>, lpinbuffersize: MutPtr<UInt>, lpmaxinstances: MutPtr<UInt>): Bool

public expect fun getNamedPipeServerProcessId(pipe: Handle, serverprocessid: MutPtr<UInt>): Bool

public expect fun getNamedPipeServerSessionId(pipe: Handle, serversessionid: MutPtr<UInt>): Bool

public expect fun impersonateNamedPipeClient(hnamedpipe: Handle): Bool

public expect fun peekNamedPipe(hnamedpipe: Handle, lpbuffer: MutPtr<CVoid>, nbuffersize: UInt, lpbytesread: MutPtr<UInt>, lptotalbytesavail: MutPtr<UInt>, lpbytesleftthismessage: MutPtr<UInt>): Bool

public expect fun setNamedPipeHandleState(hnamedpipe: Handle, lpmode: ConstPtr<NamedPipeMode>, lpmaxcollectioncount: ConstPtr<UInt>, lpcollectdatatimeout: ConstPtr<UInt>): Bool

public expect fun transactNamedPipe(hnamedpipe: Handle, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesread: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool

public expect fun waitNamedPipeA(lpnamedpipename: Pcstr, ntimeout: UInt): Bool

public expect fun waitNamedPipeW(lpnamedpipename: Pcwstr, ntimeout: UInt): Bool
