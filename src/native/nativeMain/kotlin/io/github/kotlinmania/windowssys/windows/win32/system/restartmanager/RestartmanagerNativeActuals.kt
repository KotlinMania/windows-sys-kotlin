@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssysWindowsWin32SystemRestartmanagerRmAddFilter
import io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssysWindowsWin32SystemRestartmanagerRmCancelCurrentTask
import io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssysWindowsWin32SystemRestartmanagerRmEndSession
import io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssysWindowsWin32SystemRestartmanagerRmGetFilterList
import io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssysWindowsWin32SystemRestartmanagerRmGetList
import io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssysWindowsWin32SystemRestartmanagerRmJoinSession
import io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssysWindowsWin32SystemRestartmanagerRmRegisterResources
import io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssysWindowsWin32SystemRestartmanagerRmRemoveFilter
import io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssysWindowsWin32SystemRestartmanagerRmRestart
import io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssysWindowsWin32SystemRestartmanagerRmShutdown
import io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssysWindowsWin32SystemRestartmanagerRmStartSession
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun rmAddFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: ConstPtr, strserviceshortname: Pcwstr, filteraction: RmFilterAction): Win32Error =
    windowssysWindowsWin32SystemRestartmanagerRmAddFilter(dwsessionhandle, strmodulename.rawAddress.toCPointer<ByteVar>(), pprocess.rawAddress.toCPointer<ByteVar>(), strserviceshortname.rawAddress.toCPointer<ByteVar>(), filteraction)

public actual fun rmCancelCurrentTask(dwsessionhandle: UInt): Win32Error =
    windowssysWindowsWin32SystemRestartmanagerRmCancelCurrentTask(dwsessionhandle)

public actual fun rmEndSession(dwsessionhandle: UInt): Win32Error =
    windowssysWindowsWin32SystemRestartmanagerRmEndSession(dwsessionhandle)

public actual fun rmGetFilterList(dwsessionhandle: UInt, pbfilterbuf: MutPtr, cbfilterbuf: UInt, cbfilterbufneeded: MutPtr): Win32Error =
    windowssysWindowsWin32SystemRestartmanagerRmGetFilterList(dwsessionhandle, pbfilterbuf.rawAddress.toCPointer<ByteVar>(), cbfilterbuf, cbfilterbufneeded.rawAddress.toCPointer<ByteVar>())

public actual fun rmGetList(dwsessionhandle: UInt, pnprocinfoneeded: MutPtr, pnprocinfo: MutPtr, rgaffectedapps: MutPtr, lpdwrebootreasons: MutPtr): Win32Error =
    windowssysWindowsWin32SystemRestartmanagerRmGetList(dwsessionhandle, pnprocinfoneeded.rawAddress.toCPointer<ByteVar>(), pnprocinfo.rawAddress.toCPointer<ByteVar>(), rgaffectedapps.rawAddress.toCPointer<ByteVar>(), lpdwrebootreasons.rawAddress.toCPointer<ByteVar>())

public actual fun rmJoinSession(psessionhandle: MutPtr, strsessionkey: Pcwstr): Win32Error =
    windowssysWindowsWin32SystemRestartmanagerRmJoinSession(psessionhandle.rawAddress.toCPointer<ByteVar>(), strsessionkey.rawAddress.toCPointer<ByteVar>())

public actual fun rmRegisterResources(dwsessionhandle: UInt, nfiles: UInt, rgsfilenames: ConstPtr, napplications: UInt, rgapplications: ConstPtr, nservices: UInt, rgsservicenames: ConstPtr): Win32Error =
    windowssysWindowsWin32SystemRestartmanagerRmRegisterResources(dwsessionhandle, nfiles, rgsfilenames.rawAddress.toCPointer<ByteVar>(), napplications, rgapplications.rawAddress.toCPointer<ByteVar>(), nservices, rgsservicenames.rawAddress.toCPointer<ByteVar>())

public actual fun rmRemoveFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: ConstPtr, strserviceshortname: Pcwstr): Win32Error =
    windowssysWindowsWin32SystemRestartmanagerRmRemoveFilter(dwsessionhandle, strmodulename.rawAddress.toCPointer<ByteVar>(), pprocess.rawAddress.toCPointer<ByteVar>(), strserviceshortname.rawAddress.toCPointer<ByteVar>())

public actual fun rmRestart(dwsessionhandle: UInt, dwrestartflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error =
    windowssysWindowsWin32SystemRestartmanagerRmRestart(dwsessionhandle, dwrestartflags, 0L.toCPointer<ByteVar>())

public actual fun rmShutdown(dwsessionhandle: UInt, lactionflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error =
    windowssysWindowsWin32SystemRestartmanagerRmShutdown(dwsessionhandle, lactionflags, 0L.toCPointer<ByteVar>())

public actual fun rmStartSession(psessionhandle: MutPtr, dwsessionflags: UInt, strsessionkey: Pwstr): Win32Error =
    windowssysWindowsWin32SystemRestartmanagerRmStartSession(psessionhandle.rawAddress.toCPointer<ByteVar>(), dwsessionflags, strsessionkey.rawAddress.toCPointer<ByteVar>())
