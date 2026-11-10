@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.pipes

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileFlagsAndAttributes

private object WindowsWin32SystemPipesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_callNamedPipeA(lpnamedpipename: Long, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesread: Long, ntimeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_callNamedPipeW(lpnamedpipename: Long, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesread: Long, ntimeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_connectNamedPipe(hnamedpipe: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_createNamedPipeA(lpname: Long, dwopenmode: Int, dwpipemode: Int, nmaxinstances: Int, noutbuffersize: Int, ninbuffersize: Int, ndefaulttimeout: Int, lpsecurityattributes: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_createNamedPipeW(lpname: Long, dwopenmode: Int, dwpipemode: Int, nmaxinstances: Int, noutbuffersize: Int, ninbuffersize: Int, ndefaulttimeout: Int, lpsecurityattributes: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_createPipe(hreadpipe: Long, hwritepipe: Long, lppipeattributes: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_disconnectNamedPipe(hnamedpipe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_getNamedPipeClientComputerNameA(pipe: Long, clientcomputername: Long, clientcomputernamelength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_getNamedPipeClientComputerNameW(pipe: Long, clientcomputername: Long, clientcomputernamelength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_getNamedPipeClientProcessId(pipe: Long, clientprocessid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_getNamedPipeClientSessionId(pipe: Long, clientsessionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_getNamedPipeHandleStateA(hnamedpipe: Long, lpstate: Long, lpcurinstances: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long, lpusername: Long, nmaxusernamesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_getNamedPipeHandleStateW(hnamedpipe: Long, lpstate: Long, lpcurinstances: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long, lpusername: Long, nmaxusernamesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_getNamedPipeInfo(hnamedpipe: Long, lpflags: Long, lpoutbuffersize: Long, lpinbuffersize: Long, lpmaxinstances: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_getNamedPipeServerProcessId(pipe: Long, serverprocessid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_getNamedPipeServerSessionId(pipe: Long, serversessionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_impersonateNamedPipeClient(hnamedpipe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_peekNamedPipe(hnamedpipe: Long, lpbuffer: Long, nbuffersize: Int, lpbytesread: Long, lptotalbytesavail: Long, lpbytesleftthismessage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_setNamedPipeHandleState(hnamedpipe: Long, lpmode: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_transactNamedPipe(hnamedpipe: Long, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesread: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_waitNamedPipeA(lpnamedpipename: Long, ntimeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_waitNamedPipeW(lpnamedpipename: Long, ntimeout: Int): Int
}

public actual fun callNamedPipeA(lpnamedpipename: Pcstr, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesread: COpaquePointer?, ntimeout: UInt): Bool =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_callNamedPipeA((lpnamedpipename?.value ?: 0L), (lpinbuffer?.value ?: 0L), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), noutbuffersize.toInt(), (lpbytesread?.value ?: 0L), ntimeout.toInt())

public actual fun callNamedPipeW(lpnamedpipename: Pcwstr, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesread: COpaquePointer?, ntimeout: UInt): Bool =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_callNamedPipeW((lpnamedpipename?.value ?: 0L), (lpinbuffer?.value ?: 0L), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), noutbuffersize.toInt(), (lpbytesread?.value ?: 0L), ntimeout.toInt())

public actual fun connectNamedPipe(hnamedpipe: Handle, lpoverlapped: COpaquePointer?): Bool =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_connectNamedPipe((hnamedpipe?.value ?: 0L), (lpoverlapped?.value ?: 0L))

public actual fun createNamedPipeA(lpname: Pcstr, dwopenmode: FileFlagsAndAttributes, dwpipemode: NamedPipeMode, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: COpaquePointer?): Handle =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_createNamedPipeA((lpname?.value ?: 0L), dwopenmode.toInt(), dwpipemode.toInt(), nmaxinstances.toInt(), noutbuffersize.toInt(), ninbuffersize.toInt(), ndefaulttimeout.toInt(), (lpsecurityattributes?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createNamedPipeW(lpname: Pcwstr, dwopenmode: FileFlagsAndAttributes, dwpipemode: NamedPipeMode, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: COpaquePointer?): Handle =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_createNamedPipeW((lpname?.value ?: 0L), dwopenmode.toInt(), dwpipemode.toInt(), nmaxinstances.toInt(), noutbuffersize.toInt(), ninbuffersize.toInt(), ndefaulttimeout.toInt(), (lpsecurityattributes?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createPipe(hreadpipe: COpaquePointer?, hwritepipe: COpaquePointer?, lppipeattributes: COpaquePointer?, nsize: UInt): Bool =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_createPipe((hreadpipe?.value ?: 0L), (hwritepipe?.value ?: 0L), (lppipeattributes?.value ?: 0L), nsize.toInt())

public actual fun disconnectNamedPipe(hnamedpipe: Handle): Bool =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_disconnectNamedPipe((hnamedpipe?.value ?: 0L))

public actual fun getNamedPipeClientComputerNameA(pipe: Handle, clientcomputername: Pstr, clientcomputernamelength: UInt): Bool =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_getNamedPipeClientComputerNameA((pipe?.value ?: 0L), (clientcomputername?.value ?: 0L), clientcomputernamelength.toInt())

public actual fun getNamedPipeClientComputerNameW(pipe: Handle, clientcomputername: Pwstr, clientcomputernamelength: UInt): Bool =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_getNamedPipeClientComputerNameW((pipe?.value ?: 0L), (clientcomputername?.value ?: 0L), clientcomputernamelength.toInt())

public actual fun getNamedPipeClientProcessId(pipe: Handle, clientprocessid: COpaquePointer?): Bool =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_getNamedPipeClientProcessId((pipe?.value ?: 0L), (clientprocessid?.value ?: 0L))

public actual fun getNamedPipeClientSessionId(pipe: Handle, clientsessionid: COpaquePointer?): Bool =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_getNamedPipeClientSessionId((pipe?.value ?: 0L), (clientsessionid?.value ?: 0L))

public actual fun getNamedPipeHandleStateA(hnamedpipe: Handle, lpstate: COpaquePointer?, lpcurinstances: COpaquePointer?, lpmaxcollectioncount: COpaquePointer?, lpcollectdatatimeout: COpaquePointer?, lpusername: Pstr, nmaxusernamesize: UInt): Bool =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_getNamedPipeHandleStateA((hnamedpipe?.value ?: 0L), (lpstate?.value ?: 0L), (lpcurinstances?.value ?: 0L), (lpmaxcollectioncount?.value ?: 0L), (lpcollectdatatimeout?.value ?: 0L), (lpusername?.value ?: 0L), nmaxusernamesize.toInt())

public actual fun getNamedPipeHandleStateW(hnamedpipe: Handle, lpstate: COpaquePointer?, lpcurinstances: COpaquePointer?, lpmaxcollectioncount: COpaquePointer?, lpcollectdatatimeout: COpaquePointer?, lpusername: Pwstr, nmaxusernamesize: UInt): Bool =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_getNamedPipeHandleStateW((hnamedpipe?.value ?: 0L), (lpstate?.value ?: 0L), (lpcurinstances?.value ?: 0L), (lpmaxcollectioncount?.value ?: 0L), (lpcollectdatatimeout?.value ?: 0L), (lpusername?.value ?: 0L), nmaxusernamesize.toInt())

public actual fun getNamedPipeInfo(hnamedpipe: Handle, lpflags: COpaquePointer?, lpoutbuffersize: COpaquePointer?, lpinbuffersize: COpaquePointer?, lpmaxinstances: COpaquePointer?): Bool =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_getNamedPipeInfo((hnamedpipe?.value ?: 0L), (lpflags?.value ?: 0L), (lpoutbuffersize?.value ?: 0L), (lpinbuffersize?.value ?: 0L), (lpmaxinstances?.value ?: 0L))

public actual fun getNamedPipeServerProcessId(pipe: Handle, serverprocessid: COpaquePointer?): Bool =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_getNamedPipeServerProcessId((pipe?.value ?: 0L), (serverprocessid?.value ?: 0L))

public actual fun getNamedPipeServerSessionId(pipe: Handle, serversessionid: COpaquePointer?): Bool =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_getNamedPipeServerSessionId((pipe?.value ?: 0L), (serversessionid?.value ?: 0L))

public actual fun impersonateNamedPipeClient(hnamedpipe: Handle): Bool =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_impersonateNamedPipeClient((hnamedpipe?.value ?: 0L))

public actual fun peekNamedPipe(hnamedpipe: Handle, lpbuffer: COpaquePointer?, nbuffersize: UInt, lpbytesread: COpaquePointer?, lptotalbytesavail: COpaquePointer?, lpbytesleftthismessage: COpaquePointer?): Bool =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_peekNamedPipe((hnamedpipe?.value ?: 0L), (lpbuffer?.value ?: 0L), nbuffersize.toInt(), (lpbytesread?.value ?: 0L), (lptotalbytesavail?.value ?: 0L), (lpbytesleftthismessage?.value ?: 0L))

public actual fun setNamedPipeHandleState(hnamedpipe: Handle, lpmode: COpaquePointer?, lpmaxcollectioncount: COpaquePointer?, lpcollectdatatimeout: COpaquePointer?): Bool =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_setNamedPipeHandleState((hnamedpipe?.value ?: 0L), (lpmode?.value ?: 0L), (lpmaxcollectioncount?.value ?: 0L), (lpcollectdatatimeout?.value ?: 0L))

public actual fun transactNamedPipe(hnamedpipe: Handle, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesread: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_transactNamedPipe((hnamedpipe?.value ?: 0L), (lpinbuffer?.value ?: 0L), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), noutbuffersize.toInt(), (lpbytesread?.value ?: 0L), (lpoverlapped?.value ?: 0L))

public actual fun waitNamedPipeA(lpnamedpipename: Pcstr, ntimeout: UInt): Bool =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_waitNamedPipeA((lpnamedpipename?.value ?: 0L), ntimeout.toInt())

public actual fun waitNamedPipeW(lpnamedpipename: Pcwstr, ntimeout: UInt): Bool =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_waitNamedPipeW((lpnamedpipename?.value ?: 0L), ntimeout.toInt())
