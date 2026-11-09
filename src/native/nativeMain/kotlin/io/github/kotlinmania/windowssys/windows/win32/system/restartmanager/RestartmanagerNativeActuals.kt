@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun RmAddFilter(dwsessionhandle: UInt, strmodulename: PCWSTR, pprocess: Long, strserviceshortname: PCWSTR, filteraction: RM_FILTER_ACTION): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssys_windows_win32_system_restartmanager_RmAddFilter(dwsessionhandle, strmodulename.toCPointer<ByteVar>(), pprocess.toCPointer<ByteVar>(), strserviceshortname.toCPointer<ByteVar>(), filteraction)

public actual fun RmCancelCurrentTask(dwsessionhandle: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssys_windows_win32_system_restartmanager_RmCancelCurrentTask(dwsessionhandle)

public actual fun RmEndSession(dwsessionhandle: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssys_windows_win32_system_restartmanager_RmEndSession(dwsessionhandle)

public actual fun RmGetFilterList(dwsessionhandle: UInt, pbfilterbuf: Long, cbfilterbuf: UInt, cbfilterbufneeded: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssys_windows_win32_system_restartmanager_RmGetFilterList(dwsessionhandle, pbfilterbuf.toCPointer<ByteVar>(), cbfilterbuf, cbfilterbufneeded.toCPointer<ByteVar>())

public actual fun RmGetList(dwsessionhandle: UInt, pnprocinfoneeded: Long, pnprocinfo: Long, rgaffectedapps: Long, lpdwrebootreasons: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssys_windows_win32_system_restartmanager_RmGetList(dwsessionhandle, pnprocinfoneeded.toCPointer<ByteVar>(), pnprocinfo.toCPointer<ByteVar>(), rgaffectedapps.toCPointer<ByteVar>(), lpdwrebootreasons.toCPointer<ByteVar>())

public actual fun RmJoinSession(psessionhandle: Long, strsessionkey: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssys_windows_win32_system_restartmanager_RmJoinSession(psessionhandle.toCPointer<ByteVar>(), strsessionkey.toCPointer<ByteVar>())

public actual fun RmRegisterResources(dwsessionhandle: UInt, nfiles: UInt, rgsfilenames: Long, napplications: UInt, rgapplications: Long, nservices: UInt, rgsservicenames: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssys_windows_win32_system_restartmanager_RmRegisterResources(dwsessionhandle, nfiles, rgsfilenames.toCPointer<ByteVar>(), napplications, rgapplications.toCPointer<ByteVar>(), nservices, rgsservicenames.toCPointer<ByteVar>())

public actual fun RmRemoveFilter(dwsessionhandle: UInt, strmodulename: PCWSTR, pprocess: Long, strserviceshortname: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssys_windows_win32_system_restartmanager_RmRemoveFilter(dwsessionhandle, strmodulename.toCPointer<ByteVar>(), pprocess.toCPointer<ByteVar>(), strserviceshortname.toCPointer<ByteVar>())

public actual fun RmRestart(dwsessionhandle: UInt, dwrestartflags: UInt, fnstatus: RM_WRITE_STATUS_CALLBACK): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssys_windows_win32_system_restartmanager_RmRestart(dwsessionhandle, dwrestartflags, fnstatus.toLong().toCPointer<ByteVar>())

public actual fun RmShutdown(dwsessionhandle: UInt, lactionflags: UInt, fnstatus: RM_WRITE_STATUS_CALLBACK): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssys_windows_win32_system_restartmanager_RmShutdown(dwsessionhandle, lactionflags, fnstatus.toLong().toCPointer<ByteVar>())

public actual fun RmStartSession(psessionhandle: Long, dwsessionflags: UInt, strsessionkey: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.restartmanager.cinterop.windowssys_windows_win32_system_restartmanager_RmStartSession(psessionhandle.toCPointer<ByteVar>(), dwsessionflags, strsessionkey.toCPointer<ByteVar>())
