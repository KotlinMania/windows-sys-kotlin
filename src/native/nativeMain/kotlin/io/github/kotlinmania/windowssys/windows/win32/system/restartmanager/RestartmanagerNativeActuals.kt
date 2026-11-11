@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssys_windows_win32_system_restartmanager_rmAddFilter
import io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssys_windows_win32_system_restartmanager_rmCancelCurrentTask
import io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssys_windows_win32_system_restartmanager_rmEndSession
import io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssys_windows_win32_system_restartmanager_rmGetFilterList
import io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssys_windows_win32_system_restartmanager_rmGetList
import io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssys_windows_win32_system_restartmanager_rmJoinSession
import io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssys_windows_win32_system_restartmanager_rmRegisterResources
import io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssys_windows_win32_system_restartmanager_rmRemoveFilter
import io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssys_windows_win32_system_restartmanager_rmRestart
import io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssys_windows_win32_system_restartmanager_rmShutdown
import io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssys_windows_win32_system_restartmanager_rmStartSession
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun rmAddFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: COpaquePointer?, strserviceshortname: Pcwstr, filteraction: RmFilterAction): Win32Error =
    windowssys_windows_win32_system_restartmanager_rmAddFilter(dwsessionhandle, strmodulename?.value?.toCPointer<ByteVar>(), pprocess?.value?.toCPointer<ByteVar>(), strserviceshortname?.value?.toCPointer<ByteVar>(), filteraction)

public actual fun rmCancelCurrentTask(dwsessionhandle: UInt): Win32Error =
    windowssys_windows_win32_system_restartmanager_rmCancelCurrentTask(dwsessionhandle)

public actual fun rmEndSession(dwsessionhandle: UInt): Win32Error =
    windowssys_windows_win32_system_restartmanager_rmEndSession(dwsessionhandle)

public actual fun rmGetFilterList(dwsessionhandle: UInt, pbfilterbuf: COpaquePointer?, cbfilterbuf: UInt, cbfilterbufneeded: COpaquePointer?): Win32Error =
    windowssys_windows_win32_system_restartmanager_rmGetFilterList(dwsessionhandle, pbfilterbuf?.value?.toCPointer<ByteVar>(), cbfilterbuf, cbfilterbufneeded?.value?.toCPointer<ByteVar>())

public actual fun rmGetList(dwsessionhandle: UInt, pnprocinfoneeded: COpaquePointer?, pnprocinfo: COpaquePointer?, rgaffectedapps: COpaquePointer?, lpdwrebootreasons: COpaquePointer?): Win32Error =
    windowssys_windows_win32_system_restartmanager_rmGetList(dwsessionhandle, pnprocinfoneeded?.value?.toCPointer<ByteVar>(), pnprocinfo?.value?.toCPointer<ByteVar>(), rgaffectedapps?.value?.toCPointer<ByteVar>(), lpdwrebootreasons?.value?.toCPointer<ByteVar>())

public actual fun rmJoinSession(psessionhandle: COpaquePointer?, strsessionkey: Pcwstr): Win32Error =
    windowssys_windows_win32_system_restartmanager_rmJoinSession(psessionhandle?.value?.toCPointer<ByteVar>(), strsessionkey?.value?.toCPointer<ByteVar>())

public actual fun rmRegisterResources(dwsessionhandle: UInt, nfiles: UInt, rgsfilenames: COpaquePointer?, napplications: UInt, rgapplications: COpaquePointer?, nservices: UInt, rgsservicenames: COpaquePointer?): Win32Error =
    windowssys_windows_win32_system_restartmanager_rmRegisterResources(dwsessionhandle, nfiles, rgsfilenames?.value?.toCPointer<ByteVar>(), napplications, rgapplications?.value?.toCPointer<ByteVar>(), nservices, rgsservicenames?.value?.toCPointer<ByteVar>())

public actual fun rmRemoveFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: COpaquePointer?, strserviceshortname: Pcwstr): Win32Error =
    windowssys_windows_win32_system_restartmanager_rmRemoveFilter(dwsessionhandle, strmodulename?.value?.toCPointer<ByteVar>(), pprocess?.value?.toCPointer<ByteVar>(), strserviceshortname?.value?.toCPointer<ByteVar>())

public actual fun rmRestart(dwsessionhandle: UInt, dwrestartflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error =
    windowssys_windows_win32_system_restartmanager_rmRestart(dwsessionhandle, dwrestartflags, 0L.toCPointer<ByteVar>())

public actual fun rmShutdown(dwsessionhandle: UInt, lactionflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error =
    windowssys_windows_win32_system_restartmanager_rmShutdown(dwsessionhandle, lactionflags, 0L.toCPointer<ByteVar>())

public actual fun rmStartSession(psessionhandle: COpaquePointer?, dwsessionflags: UInt, strsessionkey: Pwstr): Win32Error =
    windowssys_windows_win32_system_restartmanager_rmStartSession(psessionhandle?.value?.toCPointer<ByteVar>(), dwsessionflags, strsessionkey?.value?.toCPointer<ByteVar>())
