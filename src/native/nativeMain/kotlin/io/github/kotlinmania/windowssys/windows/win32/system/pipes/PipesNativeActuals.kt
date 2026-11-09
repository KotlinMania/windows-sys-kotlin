@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.pipes

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_FLAGS_AND_ATTRIBUTES
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun CallNamedPipeA(lpnamedpipename: PCSTR, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesread: Long, ntimeout: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_CallNamedPipeA(lpnamedpipename.toCPointer<ByteVar>(), lpinbuffer.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer.toCPointer<ByteVar>(), noutbuffersize, lpbytesread.toCPointer<ByteVar>(), ntimeout)

public actual fun CallNamedPipeW(lpnamedpipename: PCWSTR, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesread: Long, ntimeout: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_CallNamedPipeW(lpnamedpipename.toCPointer<ByteVar>(), lpinbuffer.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer.toCPointer<ByteVar>(), noutbuffersize, lpbytesread.toCPointer<ByteVar>(), ntimeout)

public actual fun ConnectNamedPipe(hnamedpipe: HANDLE, lpoverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_ConnectNamedPipe(hnamedpipe.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>())

public actual fun CreateNamedPipeA(lpname: PCSTR, dwopenmode: FILE_FLAGS_AND_ATTRIBUTES, dwpipemode: NAMED_PIPE_MODE, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_CreateNamedPipeA(lpname.toCPointer<ByteVar>(), dwopenmode, dwpipemode, nmaxinstances, noutbuffersize, ninbuffersize, ndefaulttimeout, lpsecurityattributes.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateNamedPipeW(lpname: PCWSTR, dwopenmode: FILE_FLAGS_AND_ATTRIBUTES, dwpipemode: NAMED_PIPE_MODE, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_CreateNamedPipeW(lpname.toCPointer<ByteVar>(), dwopenmode, dwpipemode, nmaxinstances, noutbuffersize, ninbuffersize, ndefaulttimeout, lpsecurityattributes.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreatePipe(hreadpipe: Long, hwritepipe: Long, lppipeattributes: Long, nsize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_CreatePipe(hreadpipe.toCPointer<ByteVar>(), hwritepipe.toCPointer<ByteVar>(), lppipeattributes.toCPointer<ByteVar>(), nsize)

public actual fun DisconnectNamedPipe(hnamedpipe: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_DisconnectNamedPipe(hnamedpipe.toCPointer<ByteVar>())

public actual fun GetNamedPipeClientComputerNameA(pipe: HANDLE, clientcomputername: PSTR, clientcomputernamelength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_GetNamedPipeClientComputerNameA(pipe.toCPointer<ByteVar>(), clientcomputername.toCPointer<ByteVar>(), clientcomputernamelength)

public actual fun GetNamedPipeClientComputerNameW(pipe: HANDLE, clientcomputername: PWSTR, clientcomputernamelength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_GetNamedPipeClientComputerNameW(pipe.toCPointer<ByteVar>(), clientcomputername.toCPointer<ByteVar>(), clientcomputernamelength)

public actual fun GetNamedPipeClientProcessId(pipe: HANDLE, clientprocessid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_GetNamedPipeClientProcessId(pipe.toCPointer<ByteVar>(), clientprocessid.toCPointer<ByteVar>())

public actual fun GetNamedPipeClientSessionId(pipe: HANDLE, clientsessionid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_GetNamedPipeClientSessionId(pipe.toCPointer<ByteVar>(), clientsessionid.toCPointer<ByteVar>())

public actual fun GetNamedPipeHandleStateA(hnamedpipe: HANDLE, lpstate: Long, lpcurinstances: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long, lpusername: PSTR, nmaxusernamesize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_GetNamedPipeHandleStateA(hnamedpipe.toCPointer<ByteVar>(), lpstate.toCPointer<ByteVar>(), lpcurinstances.toCPointer<ByteVar>(), lpmaxcollectioncount.toCPointer<ByteVar>(), lpcollectdatatimeout.toCPointer<ByteVar>(), lpusername.toCPointer<ByteVar>(), nmaxusernamesize)

public actual fun GetNamedPipeHandleStateW(hnamedpipe: HANDLE, lpstate: Long, lpcurinstances: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long, lpusername: PWSTR, nmaxusernamesize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_GetNamedPipeHandleStateW(hnamedpipe.toCPointer<ByteVar>(), lpstate.toCPointer<ByteVar>(), lpcurinstances.toCPointer<ByteVar>(), lpmaxcollectioncount.toCPointer<ByteVar>(), lpcollectdatatimeout.toCPointer<ByteVar>(), lpusername.toCPointer<ByteVar>(), nmaxusernamesize)

public actual fun GetNamedPipeInfo(hnamedpipe: HANDLE, lpflags: Long, lpoutbuffersize: Long, lpinbuffersize: Long, lpmaxinstances: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_GetNamedPipeInfo(hnamedpipe.toCPointer<ByteVar>(), lpflags.toCPointer<ByteVar>(), lpoutbuffersize.toCPointer<ByteVar>(), lpinbuffersize.toCPointer<ByteVar>(), lpmaxinstances.toCPointer<ByteVar>())

public actual fun GetNamedPipeServerProcessId(pipe: HANDLE, serverprocessid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_GetNamedPipeServerProcessId(pipe.toCPointer<ByteVar>(), serverprocessid.toCPointer<ByteVar>())

public actual fun GetNamedPipeServerSessionId(pipe: HANDLE, serversessionid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_GetNamedPipeServerSessionId(pipe.toCPointer<ByteVar>(), serversessionid.toCPointer<ByteVar>())

public actual fun ImpersonateNamedPipeClient(hnamedpipe: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_ImpersonateNamedPipeClient(hnamedpipe.toCPointer<ByteVar>())

public actual fun PeekNamedPipe(hnamedpipe: HANDLE, lpbuffer: Long, nbuffersize: UInt, lpbytesread: Long, lptotalbytesavail: Long, lpbytesleftthismessage: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_PeekNamedPipe(hnamedpipe.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), nbuffersize, lpbytesread.toCPointer<ByteVar>(), lptotalbytesavail.toCPointer<ByteVar>(), lpbytesleftthismessage.toCPointer<ByteVar>())

public actual fun SetNamedPipeHandleState(hnamedpipe: HANDLE, lpmode: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_SetNamedPipeHandleState(hnamedpipe.toCPointer<ByteVar>(), lpmode.toCPointer<ByteVar>(), lpmaxcollectioncount.toCPointer<ByteVar>(), lpcollectdatatimeout.toCPointer<ByteVar>())

public actual fun TransactNamedPipe(hnamedpipe: HANDLE, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesread: Long, lpoverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_TransactNamedPipe(hnamedpipe.toCPointer<ByteVar>(), lpinbuffer.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer.toCPointer<ByteVar>(), noutbuffersize, lpbytesread.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>())

public actual fun WaitNamedPipeA(lpnamedpipename: PCSTR, ntimeout: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_WaitNamedPipeA(lpnamedpipename.toCPointer<ByteVar>(), ntimeout)

public actual fun WaitNamedPipeW(lpnamedpipename: PCWSTR, ntimeout: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_WaitNamedPipeW(lpnamedpipename.toCPointer<ByteVar>(), ntimeout)
