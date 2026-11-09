@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR

private object WindowsWin32SystemRestartmanagerJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_restartmanager_RmAddFilter(dwsessionhandle: Int, strmodulename: Long, pprocess: Long, strserviceshortname: Long, filteraction: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restartmanager_RmCancelCurrentTask(dwsessionhandle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restartmanager_RmEndSession(dwsessionhandle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restartmanager_RmGetFilterList(dwsessionhandle: Int, pbfilterbuf: Long, cbfilterbuf: Int, cbfilterbufneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restartmanager_RmGetList(dwsessionhandle: Int, pnprocinfoneeded: Long, pnprocinfo: Long, rgaffectedapps: Long, lpdwrebootreasons: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restartmanager_RmJoinSession(psessionhandle: Long, strsessionkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restartmanager_RmRegisterResources(dwsessionhandle: Int, nfiles: Int, rgsfilenames: Long, napplications: Int, rgapplications: Long, nservices: Int, rgsservicenames: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restartmanager_RmRemoveFilter(dwsessionhandle: Int, strmodulename: Long, pprocess: Long, strserviceshortname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restartmanager_RmRestart(dwsessionhandle: Int, dwrestartflags: Int, fnstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restartmanager_RmShutdown(dwsessionhandle: Int, lactionflags: Int, fnstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restartmanager_RmStartSession(psessionhandle: Long, dwsessionflags: Int, strsessionkey: Long): Int
}

public actual fun RmAddFilter(dwsessionhandle: UInt, strmodulename: PCWSTR, pprocess: Long, strserviceshortname: PCWSTR, filteraction: RM_FILTER_ACTION): WIN32_ERROR =
    WindowsWin32SystemRestartmanagerJniBridge.windowssys_windows_win32_system_restartmanager_RmAddFilter(dwsessionhandle.toInt(), strmodulename, pprocess, strserviceshortname, filteraction).toUInt()

public actual fun RmCancelCurrentTask(dwsessionhandle: UInt): WIN32_ERROR =
    WindowsWin32SystemRestartmanagerJniBridge.windowssys_windows_win32_system_restartmanager_RmCancelCurrentTask(dwsessionhandle.toInt()).toUInt()

public actual fun RmEndSession(dwsessionhandle: UInt): WIN32_ERROR =
    WindowsWin32SystemRestartmanagerJniBridge.windowssys_windows_win32_system_restartmanager_RmEndSession(dwsessionhandle.toInt()).toUInt()

public actual fun RmGetFilterList(dwsessionhandle: UInt, pbfilterbuf: Long, cbfilterbuf: UInt, cbfilterbufneeded: Long): WIN32_ERROR =
    WindowsWin32SystemRestartmanagerJniBridge.windowssys_windows_win32_system_restartmanager_RmGetFilterList(dwsessionhandle.toInt(), pbfilterbuf, cbfilterbuf.toInt(), cbfilterbufneeded).toUInt()

public actual fun RmGetList(dwsessionhandle: UInt, pnprocinfoneeded: Long, pnprocinfo: Long, rgaffectedapps: Long, lpdwrebootreasons: Long): WIN32_ERROR =
    WindowsWin32SystemRestartmanagerJniBridge.windowssys_windows_win32_system_restartmanager_RmGetList(dwsessionhandle.toInt(), pnprocinfoneeded, pnprocinfo, rgaffectedapps, lpdwrebootreasons).toUInt()

public actual fun RmJoinSession(psessionhandle: Long, strsessionkey: PCWSTR): WIN32_ERROR =
    WindowsWin32SystemRestartmanagerJniBridge.windowssys_windows_win32_system_restartmanager_RmJoinSession(psessionhandle, strsessionkey).toUInt()

public actual fun RmRegisterResources(dwsessionhandle: UInt, nfiles: UInt, rgsfilenames: Long, napplications: UInt, rgapplications: Long, nservices: UInt, rgsservicenames: Long): WIN32_ERROR =
    WindowsWin32SystemRestartmanagerJniBridge.windowssys_windows_win32_system_restartmanager_RmRegisterResources(dwsessionhandle.toInt(), nfiles.toInt(), rgsfilenames, napplications.toInt(), rgapplications, nservices.toInt(), rgsservicenames).toUInt()

public actual fun RmRemoveFilter(dwsessionhandle: UInt, strmodulename: PCWSTR, pprocess: Long, strserviceshortname: PCWSTR): WIN32_ERROR =
    WindowsWin32SystemRestartmanagerJniBridge.windowssys_windows_win32_system_restartmanager_RmRemoveFilter(dwsessionhandle.toInt(), strmodulename, pprocess, strserviceshortname).toUInt()

public actual fun RmRestart(dwsessionhandle: UInt, dwrestartflags: UInt, fnstatus: RM_WRITE_STATUS_CALLBACK): WIN32_ERROR =
    WindowsWin32SystemRestartmanagerJniBridge.windowssys_windows_win32_system_restartmanager_RmRestart(dwsessionhandle.toInt(), dwrestartflags.toInt(), fnstatus.toLong()).toUInt()

public actual fun RmShutdown(dwsessionhandle: UInt, lactionflags: UInt, fnstatus: RM_WRITE_STATUS_CALLBACK): WIN32_ERROR =
    WindowsWin32SystemRestartmanagerJniBridge.windowssys_windows_win32_system_restartmanager_RmShutdown(dwsessionhandle.toInt(), lactionflags.toInt(), fnstatus.toLong()).toUInt()

public actual fun RmStartSession(psessionhandle: Long, dwsessionflags: UInt, strsessionkey: PWSTR): WIN32_ERROR =
    WindowsWin32SystemRestartmanagerJniBridge.windowssys_windows_win32_system_restartmanager_RmStartSession(psessionhandle, dwsessionflags.toInt(), strsessionkey).toUInt()
