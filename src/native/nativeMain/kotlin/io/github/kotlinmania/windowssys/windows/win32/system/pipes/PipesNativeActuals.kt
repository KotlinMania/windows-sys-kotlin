@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.pipes

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileFlagsAndAttributes
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun callNamedPipeA(lpnamedpipename: Pcstr, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesread: COpaquePointer?, ntimeout: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_callNamedPipeA(lpnamedpipename?.value?.toCPointer<ByteVar>(), lpinbuffer?.value?.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), noutbuffersize, lpbytesread?.value?.toCPointer<ByteVar>(), ntimeout)

public actual fun callNamedPipeW(lpnamedpipename: Pcwstr, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesread: COpaquePointer?, ntimeout: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_callNamedPipeW(lpnamedpipename?.value?.toCPointer<ByteVar>(), lpinbuffer?.value?.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), noutbuffersize, lpbytesread?.value?.toCPointer<ByteVar>(), ntimeout)

public actual fun connectNamedPipe(hnamedpipe: Handle, lpoverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_connectNamedPipe(hnamedpipe?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun createNamedPipeA(lpname: Pcstr, dwopenmode: FileFlagsAndAttributes, dwpipemode: NamedPipeMode, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_createNamedPipeA(lpname?.value?.toCPointer<ByteVar>(), dwopenmode, dwpipemode, nmaxinstances, noutbuffersize, ninbuffersize, ndefaulttimeout, lpsecurityattributes?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createNamedPipeW(lpname: Pcwstr, dwopenmode: FileFlagsAndAttributes, dwpipemode: NamedPipeMode, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_createNamedPipeW(lpname?.value?.toCPointer<ByteVar>(), dwopenmode, dwpipemode, nmaxinstances, noutbuffersize, ninbuffersize, ndefaulttimeout, lpsecurityattributes?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createPipe(hreadpipe: COpaquePointer?, hwritepipe: COpaquePointer?, lppipeattributes: COpaquePointer?, nsize: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_createPipe(hreadpipe?.value?.toCPointer<ByteVar>(), hwritepipe?.value?.toCPointer<ByteVar>(), lppipeattributes?.value?.toCPointer<ByteVar>(), nsize)

public actual fun disconnectNamedPipe(hnamedpipe: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_disconnectNamedPipe(hnamedpipe?.value?.toCPointer<ByteVar>())

public actual fun getNamedPipeClientComputerNameA(pipe: Handle, clientcomputername: Pstr, clientcomputernamelength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_getNamedPipeClientComputerNameA(pipe?.value?.toCPointer<ByteVar>(), clientcomputername?.value?.toCPointer<ByteVar>(), clientcomputernamelength)

public actual fun getNamedPipeClientComputerNameW(pipe: Handle, clientcomputername: Pwstr, clientcomputernamelength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_getNamedPipeClientComputerNameW(pipe?.value?.toCPointer<ByteVar>(), clientcomputername?.value?.toCPointer<ByteVar>(), clientcomputernamelength)

public actual fun getNamedPipeClientProcessId(pipe: Handle, clientprocessid: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_getNamedPipeClientProcessId(pipe?.value?.toCPointer<ByteVar>(), clientprocessid?.value?.toCPointer<ByteVar>())

public actual fun getNamedPipeClientSessionId(pipe: Handle, clientsessionid: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_getNamedPipeClientSessionId(pipe?.value?.toCPointer<ByteVar>(), clientsessionid?.value?.toCPointer<ByteVar>())

public actual fun getNamedPipeHandleStateA(hnamedpipe: Handle, lpstate: COpaquePointer?, lpcurinstances: COpaquePointer?, lpmaxcollectioncount: COpaquePointer?, lpcollectdatatimeout: COpaquePointer?, lpusername: Pstr, nmaxusernamesize: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_getNamedPipeHandleStateA(hnamedpipe?.value?.toCPointer<ByteVar>(), lpstate?.value?.toCPointer<ByteVar>(), lpcurinstances?.value?.toCPointer<ByteVar>(), lpmaxcollectioncount?.value?.toCPointer<ByteVar>(), lpcollectdatatimeout?.value?.toCPointer<ByteVar>(), lpusername?.value?.toCPointer<ByteVar>(), nmaxusernamesize)

public actual fun getNamedPipeHandleStateW(hnamedpipe: Handle, lpstate: COpaquePointer?, lpcurinstances: COpaquePointer?, lpmaxcollectioncount: COpaquePointer?, lpcollectdatatimeout: COpaquePointer?, lpusername: Pwstr, nmaxusernamesize: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_getNamedPipeHandleStateW(hnamedpipe?.value?.toCPointer<ByteVar>(), lpstate?.value?.toCPointer<ByteVar>(), lpcurinstances?.value?.toCPointer<ByteVar>(), lpmaxcollectioncount?.value?.toCPointer<ByteVar>(), lpcollectdatatimeout?.value?.toCPointer<ByteVar>(), lpusername?.value?.toCPointer<ByteVar>(), nmaxusernamesize)

public actual fun getNamedPipeInfo(hnamedpipe: Handle, lpflags: COpaquePointer?, lpoutbuffersize: COpaquePointer?, lpinbuffersize: COpaquePointer?, lpmaxinstances: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_getNamedPipeInfo(hnamedpipe?.value?.toCPointer<ByteVar>(), lpflags?.value?.toCPointer<ByteVar>(), lpoutbuffersize?.value?.toCPointer<ByteVar>(), lpinbuffersize?.value?.toCPointer<ByteVar>(), lpmaxinstances?.value?.toCPointer<ByteVar>())

public actual fun getNamedPipeServerProcessId(pipe: Handle, serverprocessid: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_getNamedPipeServerProcessId(pipe?.value?.toCPointer<ByteVar>(), serverprocessid?.value?.toCPointer<ByteVar>())

public actual fun getNamedPipeServerSessionId(pipe: Handle, serversessionid: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_getNamedPipeServerSessionId(pipe?.value?.toCPointer<ByteVar>(), serversessionid?.value?.toCPointer<ByteVar>())

public actual fun impersonateNamedPipeClient(hnamedpipe: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_impersonateNamedPipeClient(hnamedpipe?.value?.toCPointer<ByteVar>())

public actual fun peekNamedPipe(hnamedpipe: Handle, lpbuffer: COpaquePointer?, nbuffersize: UInt, lpbytesread: COpaquePointer?, lptotalbytesavail: COpaquePointer?, lpbytesleftthismessage: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_peekNamedPipe(hnamedpipe?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nbuffersize, lpbytesread?.value?.toCPointer<ByteVar>(), lptotalbytesavail?.value?.toCPointer<ByteVar>(), lpbytesleftthismessage?.value?.toCPointer<ByteVar>())

public actual fun setNamedPipeHandleState(hnamedpipe: Handle, lpmode: COpaquePointer?, lpmaxcollectioncount: COpaquePointer?, lpcollectdatatimeout: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_setNamedPipeHandleState(hnamedpipe?.value?.toCPointer<ByteVar>(), lpmode?.value?.toCPointer<ByteVar>(), lpmaxcollectioncount?.value?.toCPointer<ByteVar>(), lpcollectdatatimeout?.value?.toCPointer<ByteVar>())

public actual fun transactNamedPipe(hnamedpipe: Handle, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesread: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_transactNamedPipe(hnamedpipe?.value?.toCPointer<ByteVar>(), lpinbuffer?.value?.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), noutbuffersize, lpbytesread?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun waitNamedPipeA(lpnamedpipename: Pcstr, ntimeout: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_waitNamedPipeA(lpnamedpipename?.value?.toCPointer<ByteVar>(), ntimeout)

public actual fun waitNamedPipeW(lpnamedpipename: Pcwstr, ntimeout: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.pipes.cinterop.windowssys_windows_win32_system_pipes_waitNamedPipeW(lpnamedpipename?.value?.toCPointer<ByteVar>(), ntimeout)
