@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.pipes

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_FLAGS_AND_ATTRIBUTES

private object WindowsWin32SystemPipesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_CallNamedPipeA(lpnamedpipename: Long, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesread: Long, ntimeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_CallNamedPipeW(lpnamedpipename: Long, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesread: Long, ntimeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_ConnectNamedPipe(hnamedpipe: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_CreateNamedPipeA(lpname: Long, dwopenmode: Int, dwpipemode: Int, nmaxinstances: Int, noutbuffersize: Int, ninbuffersize: Int, ndefaulttimeout: Int, lpsecurityattributes: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_CreateNamedPipeW(lpname: Long, dwopenmode: Int, dwpipemode: Int, nmaxinstances: Int, noutbuffersize: Int, ninbuffersize: Int, ndefaulttimeout: Int, lpsecurityattributes: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_CreatePipe(hreadpipe: Long, hwritepipe: Long, lppipeattributes: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_DisconnectNamedPipe(hnamedpipe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_GetNamedPipeClientComputerNameA(pipe: Long, clientcomputername: Long, clientcomputernamelength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_GetNamedPipeClientComputerNameW(pipe: Long, clientcomputername: Long, clientcomputernamelength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_GetNamedPipeClientProcessId(pipe: Long, clientprocessid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_GetNamedPipeClientSessionId(pipe: Long, clientsessionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_GetNamedPipeHandleStateA(hnamedpipe: Long, lpstate: Long, lpcurinstances: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long, lpusername: Long, nmaxusernamesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_GetNamedPipeHandleStateW(hnamedpipe: Long, lpstate: Long, lpcurinstances: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long, lpusername: Long, nmaxusernamesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_GetNamedPipeInfo(hnamedpipe: Long, lpflags: Long, lpoutbuffersize: Long, lpinbuffersize: Long, lpmaxinstances: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_GetNamedPipeServerProcessId(pipe: Long, serverprocessid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_GetNamedPipeServerSessionId(pipe: Long, serversessionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_ImpersonateNamedPipeClient(hnamedpipe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_PeekNamedPipe(hnamedpipe: Long, lpbuffer: Long, nbuffersize: Int, lpbytesread: Long, lptotalbytesavail: Long, lpbytesleftthismessage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_SetNamedPipeHandleState(hnamedpipe: Long, lpmode: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_TransactNamedPipe(hnamedpipe: Long, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesread: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_WaitNamedPipeA(lpnamedpipename: Long, ntimeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_pipes_WaitNamedPipeW(lpnamedpipename: Long, ntimeout: Int): Int
}

public actual fun CallNamedPipeA(lpnamedpipename: PCSTR, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesread: Long, ntimeout: UInt): BOOL =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_CallNamedPipeA(lpnamedpipename, lpinbuffer, ninbuffersize.toInt(), lpoutbuffer, noutbuffersize.toInt(), lpbytesread, ntimeout.toInt())

public actual fun CallNamedPipeW(lpnamedpipename: PCWSTR, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesread: Long, ntimeout: UInt): BOOL =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_CallNamedPipeW(lpnamedpipename, lpinbuffer, ninbuffersize.toInt(), lpoutbuffer, noutbuffersize.toInt(), lpbytesread, ntimeout.toInt())

public actual fun ConnectNamedPipe(hnamedpipe: HANDLE, lpoverlapped: Long): BOOL =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_ConnectNamedPipe(hnamedpipe, lpoverlapped)

public actual fun CreateNamedPipeA(lpname: PCSTR, dwopenmode: FILE_FLAGS_AND_ATTRIBUTES, dwpipemode: NAMED_PIPE_MODE, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: Long): HANDLE =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_CreateNamedPipeA(lpname, dwopenmode.toInt(), dwpipemode.toInt(), nmaxinstances.toInt(), noutbuffersize.toInt(), ninbuffersize.toInt(), ndefaulttimeout.toInt(), lpsecurityattributes)

public actual fun CreateNamedPipeW(lpname: PCWSTR, dwopenmode: FILE_FLAGS_AND_ATTRIBUTES, dwpipemode: NAMED_PIPE_MODE, nmaxinstances: UInt, noutbuffersize: UInt, ninbuffersize: UInt, ndefaulttimeout: UInt, lpsecurityattributes: Long): HANDLE =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_CreateNamedPipeW(lpname, dwopenmode.toInt(), dwpipemode.toInt(), nmaxinstances.toInt(), noutbuffersize.toInt(), ninbuffersize.toInt(), ndefaulttimeout.toInt(), lpsecurityattributes)

public actual fun CreatePipe(hreadpipe: Long, hwritepipe: Long, lppipeattributes: Long, nsize: UInt): BOOL =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_CreatePipe(hreadpipe, hwritepipe, lppipeattributes, nsize.toInt())

public actual fun DisconnectNamedPipe(hnamedpipe: HANDLE): BOOL =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_DisconnectNamedPipe(hnamedpipe)

public actual fun GetNamedPipeClientComputerNameA(pipe: HANDLE, clientcomputername: PSTR, clientcomputernamelength: UInt): BOOL =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_GetNamedPipeClientComputerNameA(pipe, clientcomputername, clientcomputernamelength.toInt())

public actual fun GetNamedPipeClientComputerNameW(pipe: HANDLE, clientcomputername: PWSTR, clientcomputernamelength: UInt): BOOL =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_GetNamedPipeClientComputerNameW(pipe, clientcomputername, clientcomputernamelength.toInt())

public actual fun GetNamedPipeClientProcessId(pipe: HANDLE, clientprocessid: Long): BOOL =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_GetNamedPipeClientProcessId(pipe, clientprocessid)

public actual fun GetNamedPipeClientSessionId(pipe: HANDLE, clientsessionid: Long): BOOL =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_GetNamedPipeClientSessionId(pipe, clientsessionid)

public actual fun GetNamedPipeHandleStateA(hnamedpipe: HANDLE, lpstate: Long, lpcurinstances: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long, lpusername: PSTR, nmaxusernamesize: UInt): BOOL =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_GetNamedPipeHandleStateA(hnamedpipe, lpstate, lpcurinstances, lpmaxcollectioncount, lpcollectdatatimeout, lpusername, nmaxusernamesize.toInt())

public actual fun GetNamedPipeHandleStateW(hnamedpipe: HANDLE, lpstate: Long, lpcurinstances: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long, lpusername: PWSTR, nmaxusernamesize: UInt): BOOL =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_GetNamedPipeHandleStateW(hnamedpipe, lpstate, lpcurinstances, lpmaxcollectioncount, lpcollectdatatimeout, lpusername, nmaxusernamesize.toInt())

public actual fun GetNamedPipeInfo(hnamedpipe: HANDLE, lpflags: Long, lpoutbuffersize: Long, lpinbuffersize: Long, lpmaxinstances: Long): BOOL =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_GetNamedPipeInfo(hnamedpipe, lpflags, lpoutbuffersize, lpinbuffersize, lpmaxinstances)

public actual fun GetNamedPipeServerProcessId(pipe: HANDLE, serverprocessid: Long): BOOL =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_GetNamedPipeServerProcessId(pipe, serverprocessid)

public actual fun GetNamedPipeServerSessionId(pipe: HANDLE, serversessionid: Long): BOOL =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_GetNamedPipeServerSessionId(pipe, serversessionid)

public actual fun ImpersonateNamedPipeClient(hnamedpipe: HANDLE): BOOL =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_ImpersonateNamedPipeClient(hnamedpipe)

public actual fun PeekNamedPipe(hnamedpipe: HANDLE, lpbuffer: Long, nbuffersize: UInt, lpbytesread: Long, lptotalbytesavail: Long, lpbytesleftthismessage: Long): BOOL =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_PeekNamedPipe(hnamedpipe, lpbuffer, nbuffersize.toInt(), lpbytesread, lptotalbytesavail, lpbytesleftthismessage)

public actual fun SetNamedPipeHandleState(hnamedpipe: HANDLE, lpmode: Long, lpmaxcollectioncount: Long, lpcollectdatatimeout: Long): BOOL =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_SetNamedPipeHandleState(hnamedpipe, lpmode, lpmaxcollectioncount, lpcollectdatatimeout)

public actual fun TransactNamedPipe(hnamedpipe: HANDLE, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesread: Long, lpoverlapped: Long): BOOL =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_TransactNamedPipe(hnamedpipe, lpinbuffer, ninbuffersize.toInt(), lpoutbuffer, noutbuffersize.toInt(), lpbytesread, lpoverlapped)

public actual fun WaitNamedPipeA(lpnamedpipename: PCSTR, ntimeout: UInt): BOOL =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_WaitNamedPipeA(lpnamedpipename, ntimeout.toInt())

public actual fun WaitNamedPipeW(lpnamedpipename: PCWSTR, ntimeout: UInt): BOOL =
    WindowsWin32SystemPipesJniBridge.windowssys_windows_win32_system_pipes_WaitNamedPipeW(lpnamedpipename, ntimeout.toInt())
