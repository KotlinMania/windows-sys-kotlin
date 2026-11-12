@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

private object WindowsWin32SystemRestartmanagerJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemRestartmanagerRmAddFilter(dwsessionhandle: Int, strmodulename: Long, pprocess: Long, strserviceshortname: Long, filteraction: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRestartmanagerRmCancelCurrentTask(dwsessionhandle: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRestartmanagerRmEndSession(dwsessionhandle: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRestartmanagerRmGetFilterList(dwsessionhandle: Int, pbfilterbuf: Long, cbfilterbuf: Int, cbfilterbufneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRestartmanagerRmGetList(dwsessionhandle: Int, pnprocinfoneeded: Long, pnprocinfo: Long, rgaffectedapps: Long, lpdwrebootreasons: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRestartmanagerRmJoinSession(psessionhandle: Long, strsessionkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRestartmanagerRmRegisterResources(dwsessionhandle: Int, nfiles: Int, rgsfilenames: Long, napplications: Int, rgapplications: Long, nservices: Int, rgsservicenames: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRestartmanagerRmRemoveFilter(dwsessionhandle: Int, strmodulename: Long, pprocess: Long, strserviceshortname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRestartmanagerRmRestart(dwsessionhandle: Int, dwrestartflags: Int, fnstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRestartmanagerRmShutdown(dwsessionhandle: Int, lactionflags: Int, fnstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRestartmanagerRmStartSession(psessionhandle: Long, dwsessionflags: Int, strsessionkey: Long): Int
}

public actual fun rmAddFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: ConstPtr, strserviceshortname: Pcwstr, filteraction: RmFilterAction): Win32Error =
    WindowsWin32SystemRestartmanagerJniBridge.windowssysWindowsWin32SystemRestartmanagerRmAddFilter(dwsessionhandle.toInt(), strmodulename.rawAddress, pprocess.rawAddress, strserviceshortname.rawAddress, filteraction).toUInt()

public actual fun rmCancelCurrentTask(dwsessionhandle: UInt): Win32Error =
    WindowsWin32SystemRestartmanagerJniBridge.windowssysWindowsWin32SystemRestartmanagerRmCancelCurrentTask(dwsessionhandle.toInt()).toUInt()

public actual fun rmEndSession(dwsessionhandle: UInt): Win32Error =
    WindowsWin32SystemRestartmanagerJniBridge.windowssysWindowsWin32SystemRestartmanagerRmEndSession(dwsessionhandle.toInt()).toUInt()

public actual fun rmGetFilterList(dwsessionhandle: UInt, pbfilterbuf: MutPtr, cbfilterbuf: UInt, cbfilterbufneeded: MutPtr): Win32Error =
    WindowsWin32SystemRestartmanagerJniBridge.windowssysWindowsWin32SystemRestartmanagerRmGetFilterList(dwsessionhandle.toInt(), pbfilterbuf.rawAddress, cbfilterbuf.toInt(), cbfilterbufneeded.rawAddress).toUInt()

public actual fun rmGetList(dwsessionhandle: UInt, pnprocinfoneeded: MutPtr, pnprocinfo: MutPtr, rgaffectedapps: MutPtr, lpdwrebootreasons: MutPtr): Win32Error =
    WindowsWin32SystemRestartmanagerJniBridge.windowssysWindowsWin32SystemRestartmanagerRmGetList(dwsessionhandle.toInt(), pnprocinfoneeded.rawAddress, pnprocinfo.rawAddress, rgaffectedapps.rawAddress, lpdwrebootreasons.rawAddress).toUInt()

public actual fun rmJoinSession(psessionhandle: MutPtr, strsessionkey: Pcwstr): Win32Error =
    WindowsWin32SystemRestartmanagerJniBridge.windowssysWindowsWin32SystemRestartmanagerRmJoinSession(psessionhandle.rawAddress, strsessionkey.rawAddress).toUInt()

public actual fun rmRegisterResources(dwsessionhandle: UInt, nfiles: UInt, rgsfilenames: ConstPtr, napplications: UInt, rgapplications: ConstPtr, nservices: UInt, rgsservicenames: ConstPtr): Win32Error =
    WindowsWin32SystemRestartmanagerJniBridge.windowssysWindowsWin32SystemRestartmanagerRmRegisterResources(dwsessionhandle.toInt(), nfiles.toInt(), rgsfilenames.rawAddress, napplications.toInt(), rgapplications.rawAddress, nservices.toInt(), rgsservicenames.rawAddress).toUInt()

public actual fun rmRemoveFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: ConstPtr, strserviceshortname: Pcwstr): Win32Error =
    WindowsWin32SystemRestartmanagerJniBridge.windowssysWindowsWin32SystemRestartmanagerRmRemoveFilter(dwsessionhandle.toInt(), strmodulename.rawAddress, pprocess.rawAddress, strserviceshortname.rawAddress).toUInt()

public actual fun rmRestart(dwsessionhandle: UInt, dwrestartflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error =
    WindowsWin32SystemRestartmanagerJniBridge.windowssysWindowsWin32SystemRestartmanagerRmRestart(dwsessionhandle.toInt(), dwrestartflags.toInt(), 0L).toUInt()

public actual fun rmShutdown(dwsessionhandle: UInt, lactionflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error =
    WindowsWin32SystemRestartmanagerJniBridge.windowssysWindowsWin32SystemRestartmanagerRmShutdown(dwsessionhandle.toInt(), lactionflags.toInt(), 0L).toUInt()

public actual fun rmStartSession(psessionhandle: MutPtr, dwsessionflags: UInt, strsessionkey: Pwstr): Win32Error =
    WindowsWin32SystemRestartmanagerJniBridge.windowssysWindowsWin32SystemRestartmanagerRmStartSession(psessionhandle.rawAddress, dwsessionflags.toInt(), strsessionkey.rawAddress).toUInt()
