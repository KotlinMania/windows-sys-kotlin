@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

private object WindowsWin32SystemRestartmanagerJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_restartmanager_rmAddFilter(dwsessionhandle: Int, strmodulename: Long, pprocess: Long, strserviceshortname: Long, filteraction: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restartmanager_rmCancelCurrentTask(dwsessionhandle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restartmanager_rmEndSession(dwsessionhandle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restartmanager_rmGetFilterList(dwsessionhandle: Int, pbfilterbuf: Long, cbfilterbuf: Int, cbfilterbufneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restartmanager_rmGetList(dwsessionhandle: Int, pnprocinfoneeded: Long, pnprocinfo: Long, rgaffectedapps: Long, lpdwrebootreasons: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restartmanager_rmJoinSession(psessionhandle: Long, strsessionkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restartmanager_rmRegisterResources(dwsessionhandle: Int, nfiles: Int, rgsfilenames: Long, napplications: Int, rgapplications: Long, nservices: Int, rgsservicenames: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restartmanager_rmRemoveFilter(dwsessionhandle: Int, strmodulename: Long, pprocess: Long, strserviceshortname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restartmanager_rmRestart(dwsessionhandle: Int, dwrestartflags: Int, fnstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restartmanager_rmShutdown(dwsessionhandle: Int, lactionflags: Int, fnstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restartmanager_rmStartSession(psessionhandle: Long, dwsessionflags: Int, strsessionkey: Long): Int
}

public actual fun rmAddFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: COpaquePointer?, strserviceshortname: Pcwstr, filteraction: RmFilterAction): Win32Error =
    WindowsWin32SystemRestartmanagerJniBridge.windowssys_windows_win32_system_restartmanager_rmAddFilter(dwsessionhandle.toInt(), (strmodulename?.value ?: 0L), (pprocess?.value ?: 0L), (strserviceshortname?.value ?: 0L), filteraction).toUInt()

public actual fun rmCancelCurrentTask(dwsessionhandle: UInt): Win32Error =
    WindowsWin32SystemRestartmanagerJniBridge.windowssys_windows_win32_system_restartmanager_rmCancelCurrentTask(dwsessionhandle.toInt()).toUInt()

public actual fun rmEndSession(dwsessionhandle: UInt): Win32Error =
    WindowsWin32SystemRestartmanagerJniBridge.windowssys_windows_win32_system_restartmanager_rmEndSession(dwsessionhandle.toInt()).toUInt()

public actual fun rmGetFilterList(dwsessionhandle: UInt, pbfilterbuf: COpaquePointer?, cbfilterbuf: UInt, cbfilterbufneeded: COpaquePointer?): Win32Error =
    WindowsWin32SystemRestartmanagerJniBridge.windowssys_windows_win32_system_restartmanager_rmGetFilterList(dwsessionhandle.toInt(), (pbfilterbuf?.value ?: 0L), cbfilterbuf.toInt(), (cbfilterbufneeded?.value ?: 0L)).toUInt()

public actual fun rmGetList(dwsessionhandle: UInt, pnprocinfoneeded: COpaquePointer?, pnprocinfo: COpaquePointer?, rgaffectedapps: COpaquePointer?, lpdwrebootreasons: COpaquePointer?): Win32Error =
    WindowsWin32SystemRestartmanagerJniBridge.windowssys_windows_win32_system_restartmanager_rmGetList(dwsessionhandle.toInt(), (pnprocinfoneeded?.value ?: 0L), (pnprocinfo?.value ?: 0L), (rgaffectedapps?.value ?: 0L), (lpdwrebootreasons?.value ?: 0L)).toUInt()

public actual fun rmJoinSession(psessionhandle: COpaquePointer?, strsessionkey: Pcwstr): Win32Error =
    WindowsWin32SystemRestartmanagerJniBridge.windowssys_windows_win32_system_restartmanager_rmJoinSession((psessionhandle?.value ?: 0L), (strsessionkey?.value ?: 0L)).toUInt()

public actual fun rmRegisterResources(dwsessionhandle: UInt, nfiles: UInt, rgsfilenames: COpaquePointer?, napplications: UInt, rgapplications: COpaquePointer?, nservices: UInt, rgsservicenames: COpaquePointer?): Win32Error =
    WindowsWin32SystemRestartmanagerJniBridge.windowssys_windows_win32_system_restartmanager_rmRegisterResources(dwsessionhandle.toInt(), nfiles.toInt(), (rgsfilenames?.value ?: 0L), napplications.toInt(), (rgapplications?.value ?: 0L), nservices.toInt(), (rgsservicenames?.value ?: 0L)).toUInt()

public actual fun rmRemoveFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: COpaquePointer?, strserviceshortname: Pcwstr): Win32Error =
    WindowsWin32SystemRestartmanagerJniBridge.windowssys_windows_win32_system_restartmanager_rmRemoveFilter(dwsessionhandle.toInt(), (strmodulename?.value ?: 0L), (pprocess?.value ?: 0L), (strserviceshortname?.value ?: 0L)).toUInt()

public actual fun rmRestart(dwsessionhandle: UInt, dwrestartflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error =
    WindowsWin32SystemRestartmanagerJniBridge.windowssys_windows_win32_system_restartmanager_rmRestart(dwsessionhandle.toInt(), dwrestartflags.toInt(), 0L).toUInt()

public actual fun rmShutdown(dwsessionhandle: UInt, lactionflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error =
    WindowsWin32SystemRestartmanagerJniBridge.windowssys_windows_win32_system_restartmanager_rmShutdown(dwsessionhandle.toInt(), lactionflags.toInt(), 0L).toUInt()

public actual fun rmStartSession(psessionhandle: COpaquePointer?, dwsessionflags: UInt, strsessionkey: Pwstr): Win32Error =
    WindowsWin32SystemRestartmanagerJniBridge.windowssys_windows_win32_system_restartmanager_rmStartSession((psessionhandle?.value ?: 0L), dwsessionflags.toInt(), (strsessionkey?.value ?: 0L)).toUInt()
