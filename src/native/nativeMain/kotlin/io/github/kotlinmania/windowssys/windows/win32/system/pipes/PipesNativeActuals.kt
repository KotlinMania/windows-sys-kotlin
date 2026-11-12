@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssysWindowsWin32SystemPipesCallNamedPipeA
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssysWindowsWin32SystemPipesCallNamedPipeW
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssysWindowsWin32SystemPipesConnectNamedPipe
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssysWindowsWin32SystemPipesCreateNamedPipeA
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssysWindowsWin32SystemPipesCreateNamedPipeW
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssysWindowsWin32SystemPipesCreatePipe
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssysWindowsWin32SystemPipesDisconnectNamedPipe
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameA
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameW
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssysWindowsWin32SystemPipesGetNamedPipeClientProcessId
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssysWindowsWin32SystemPipesGetNamedPipeClientSessionId
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssysWindowsWin32SystemPipesGetNamedPipeHandleStateA
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssysWindowsWin32SystemPipesGetNamedPipeHandleStateW
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssysWindowsWin32SystemPipesGetNamedPipeInfo
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssysWindowsWin32SystemPipesGetNamedPipeServerProcessId
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssysWindowsWin32SystemPipesGetNamedPipeServerSessionId
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssysWindowsWin32SystemPipesImpersonateNamedPipeClient
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssysWindowsWin32SystemPipesPeekNamedPipe
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssysWindowsWin32SystemPipesSetNamedPipeHandleState
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssysWindowsWin32SystemPipesTransactNamedPipe
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssysWindowsWin32SystemPipesWaitNamedPipeA
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssysWindowsWin32SystemPipesWaitNamedPipeW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun callNamedPipeA(lpnamedpipename: Pcstr, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesread: MutPtr<UInt>, ntimeout: UInt): Bool =
    windowssysWindowsWin32SystemPipesCallNamedPipeA(lpnamedpipename.rawAddress.toCPointer<ByteVar>(), lpinbuffer.rawAddress.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer.rawAddress.toCPointer<ByteVar>(), noutbuffersize, lpbytesread.rawAddress.toCPointer<ByteVar>(), ntimeout)

public actual fun callNamedPipeW(lpnamedpipename: Pcwstr, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesread: MutPtr<UInt>, ntimeout: UInt): Bool =
    windowssysWindowsWin32SystemPipesCallNamedPipeW(lpnamedpipename.rawAddress.toCPointer<ByteVar>(), lpinbuffer.rawAddress.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer.rawAddress.toCPointer<ByteVar>(), noutbuffersize, lpbytesread.rawAddress.toCPointer<ByteVar>(), ntimeout)

public actual fun connectNamedPipe(hnamedpipe: Handle, lpoverlapped: MutPtr<Overlapped>): Bool =
    windowssysWindowsWin32SystemPipesConnectNamedPipe(hnamedpipe.rawAddress.toCPointer<ByteVar>(), lpoverlapped.rawAddress.toCPointer<ByteVar>())

public actual fun createNamedPipeA(lpname: Pcstr, dwopenmode: FileFlagsAndAttributes, dwpipemode: NamedPipeMode, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>): Handle =
    MutPtr(windowssysWindowsWin32SystemPipesCreateNamedPipeA(lpname.rawAddress.toCPointer<ByteVar>(), dwopenmode, dwpipemode, nmaxinstances, noutbuffersize, ninbuffersize, ndefaulttimeout, lpsecurityattributes.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun createNamedPipeW(lpname: Pcwstr, dwopenmode: FileFlagsAndAttributes, dwpipemode: NamedPipeMode, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>): Handle =
    MutPtr(windowssysWindowsWin32SystemPipesCreateNamedPipeW(lpname.rawAddress.toCPointer<ByteVar>(), dwopenmode, dwpipemode, nmaxinstances, noutbuffersize, ninbuffersize, ndefaulttimeout, lpsecurityattributes.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun createPipe(hreadpipe: MutPtr<Handle>, hwritepipe: MutPtr<Handle>, lppipeattributes: ConstPtr<SecurityAttributes>, nsize: UInt): Bool =
    windowssysWindowsWin32SystemPipesCreatePipe(hreadpipe.rawAddress.toCPointer<ByteVar>(), hwritepipe.rawAddress.toCPointer<ByteVar>(), lppipeattributes.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun disconnectNamedPipe(hnamedpipe: Handle): Bool =
    windowssysWindowsWin32SystemPipesDisconnectNamedPipe(hnamedpipe.rawAddress.toCPointer<ByteVar>())

public actual fun getNamedPipeClientComputerNameA(pipe: Handle, clientcomputername: Pstr, clientcomputernamelength: UInt): Bool =
    windowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameA(pipe.rawAddress.toCPointer<ByteVar>(), clientcomputername.rawAddress.toCPointer<ByteVar>(), clientcomputernamelength)

public actual fun getNamedPipeClientComputerNameW(pipe: Handle, clientcomputername: Pwstr, clientcomputernamelength: UInt): Bool =
    windowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameW(pipe.rawAddress.toCPointer<ByteVar>(), clientcomputername.rawAddress.toCPointer<ByteVar>(), clientcomputernamelength)

public actual fun getNamedPipeClientProcessId(pipe: Handle, clientprocessid: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemPipesGetNamedPipeClientProcessId(pipe.rawAddress.toCPointer<ByteVar>(), clientprocessid.rawAddress.toCPointer<ByteVar>())

public actual fun getNamedPipeClientSessionId(pipe: Handle, clientsessionid: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemPipesGetNamedPipeClientSessionId(pipe.rawAddress.toCPointer<ByteVar>(), clientsessionid.rawAddress.toCPointer<ByteVar>())

public actual fun getNamedPipeHandleStateA(hnamedpipe: Handle, lpstate: MutPtr<NamedPipeMode>, lpcurinstances: MutPtr<UInt>, lpmaxcollectioncount: MutPtr<UInt>, lpcollectdatatimeout: MutPtr<UInt>, lpusername: Pstr, nmaxusernamesize: UInt): Bool =
    windowssysWindowsWin32SystemPipesGetNamedPipeHandleStateA(hnamedpipe.rawAddress.toCPointer<ByteVar>(), lpstate.rawAddress.toCPointer<ByteVar>(), lpcurinstances.rawAddress.toCPointer<ByteVar>(), lpmaxcollectioncount.rawAddress.toCPointer<ByteVar>(), lpcollectdatatimeout.rawAddress.toCPointer<ByteVar>(), lpusername.rawAddress.toCPointer<ByteVar>(), nmaxusernamesize)

public actual fun getNamedPipeHandleStateW(hnamedpipe: Handle, lpstate: MutPtr<NamedPipeMode>, lpcurinstances: MutPtr<UInt>, lpmaxcollectioncount: MutPtr<UInt>, lpcollectdatatimeout: MutPtr<UInt>, lpusername: Pwstr, nmaxusernamesize: UInt): Bool =
    windowssysWindowsWin32SystemPipesGetNamedPipeHandleStateW(hnamedpipe.rawAddress.toCPointer<ByteVar>(), lpstate.rawAddress.toCPointer<ByteVar>(), lpcurinstances.rawAddress.toCPointer<ByteVar>(), lpmaxcollectioncount.rawAddress.toCPointer<ByteVar>(), lpcollectdatatimeout.rawAddress.toCPointer<ByteVar>(), lpusername.rawAddress.toCPointer<ByteVar>(), nmaxusernamesize)

public actual fun getNamedPipeInfo(hnamedpipe: Handle, lpflags: MutPtr<NamedPipeMode>, lpoutbuffersize: MutPtr<UInt>, lpinbuffersize: MutPtr<UInt>, lpmaxinstances: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemPipesGetNamedPipeInfo(hnamedpipe.rawAddress.toCPointer<ByteVar>(), lpflags.rawAddress.toCPointer<ByteVar>(), lpoutbuffersize.rawAddress.toCPointer<ByteVar>(), lpinbuffersize.rawAddress.toCPointer<ByteVar>(), lpmaxinstances.rawAddress.toCPointer<ByteVar>())

public actual fun getNamedPipeServerProcessId(pipe: Handle, serverprocessid: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemPipesGetNamedPipeServerProcessId(pipe.rawAddress.toCPointer<ByteVar>(), serverprocessid.rawAddress.toCPointer<ByteVar>())

public actual fun getNamedPipeServerSessionId(pipe: Handle, serversessionid: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemPipesGetNamedPipeServerSessionId(pipe.rawAddress.toCPointer<ByteVar>(), serversessionid.rawAddress.toCPointer<ByteVar>())

public actual fun impersonateNamedPipeClient(hnamedpipe: Handle): Bool =
    windowssysWindowsWin32SystemPipesImpersonateNamedPipeClient(hnamedpipe.rawAddress.toCPointer<ByteVar>())

public actual fun peekNamedPipe(hnamedpipe: Handle, lpbuffer: MutPtr<CVoid>, nbuffersize: UInt, lpbytesread: MutPtr<UInt>, lptotalbytesavail: MutPtr<UInt>, lpbytesleftthismessage: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemPipesPeekNamedPipe(hnamedpipe.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), nbuffersize, lpbytesread.rawAddress.toCPointer<ByteVar>(), lptotalbytesavail.rawAddress.toCPointer<ByteVar>(), lpbytesleftthismessage.rawAddress.toCPointer<ByteVar>())

public actual fun setNamedPipeHandleState(hnamedpipe: Handle, lpmode: ConstPtr<NamedPipeMode>, lpmaxcollectioncount: ConstPtr<UInt>, lpcollectdatatimeout: ConstPtr<UInt>): Bool =
    windowssysWindowsWin32SystemPipesSetNamedPipeHandleState(hnamedpipe.rawAddress.toCPointer<ByteVar>(), lpmode.rawAddress.toCPointer<ByteVar>(), lpmaxcollectioncount.rawAddress.toCPointer<ByteVar>(), lpcollectdatatimeout.rawAddress.toCPointer<ByteVar>())

public actual fun transactNamedPipe(hnamedpipe: Handle, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesread: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool =
    windowssysWindowsWin32SystemPipesTransactNamedPipe(hnamedpipe.rawAddress.toCPointer<ByteVar>(), lpinbuffer.rawAddress.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer.rawAddress.toCPointer<ByteVar>(), noutbuffersize, lpbytesread.rawAddress.toCPointer<ByteVar>(), lpoverlapped.rawAddress.toCPointer<ByteVar>())

public actual fun waitNamedPipeA(lpnamedpipename: Pcstr, ntimeout: UInt): Bool =
    windowssysWindowsWin32SystemPipesWaitNamedPipeA(lpnamedpipename.rawAddress.toCPointer<ByteVar>(), ntimeout)

public actual fun waitNamedPipeW(lpnamedpipename: Pcwstr, ntimeout: UInt): Bool =
    windowssysWindowsWin32SystemPipesWaitNamedPipeW(lpnamedpipename.rawAddress.toCPointer<ByteVar>(), ntimeout)
