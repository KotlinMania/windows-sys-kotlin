@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.shutdown

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun AbortSystemShutdownA(lpmachinename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_AbortSystemShutdownA(lpmachinename.toCPointer<ByteVar>())

public actual fun AbortSystemShutdownW(lpmachinename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_AbortSystemShutdownW(lpmachinename.toCPointer<ByteVar>())

public actual fun CheckForHiberboot(phiberboot: Long, bclearflag: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_CheckForHiberboot(phiberboot.toCPointer<ByteVar>(), bclearflag)

public actual fun ExitWindowsEx(uflags: EXIT_WINDOWS_FLAGS, dwreason: SHUTDOWN_REASON): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_ExitWindowsEx(uflags, dwreason)

public actual fun InitiateShutdownA(lpmachinename: PCSTR, lpmessage: PCSTR, dwgraceperiod: UInt, dwshutdownflags: SHUTDOWN_FLAGS, dwreason: SHUTDOWN_REASON): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_InitiateShutdownA(lpmachinename.toCPointer<ByteVar>(), lpmessage.toCPointer<ByteVar>(), dwgraceperiod, dwshutdownflags, dwreason)

public actual fun InitiateShutdownW(lpmachinename: PCWSTR, lpmessage: PCWSTR, dwgraceperiod: UInt, dwshutdownflags: SHUTDOWN_FLAGS, dwreason: SHUTDOWN_REASON): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_InitiateShutdownW(lpmachinename.toCPointer<ByteVar>(), lpmessage.toCPointer<ByteVar>(), dwgraceperiod, dwshutdownflags, dwreason)

public actual fun InitiateSystemShutdownA(lpmachinename: PCSTR, lpmessage: PCSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_InitiateSystemShutdownA(lpmachinename.toCPointer<ByteVar>(), lpmessage.toCPointer<ByteVar>(), dwtimeout, bforceappsclosed, brebootaftershutdown)

public actual fun InitiateSystemShutdownExA(lpmachinename: PCSTR, lpmessage: PCSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL, dwreason: SHUTDOWN_REASON): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_InitiateSystemShutdownExA(lpmachinename.toCPointer<ByteVar>(), lpmessage.toCPointer<ByteVar>(), dwtimeout, bforceappsclosed, brebootaftershutdown, dwreason)

public actual fun InitiateSystemShutdownExW(lpmachinename: PCWSTR, lpmessage: PCWSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL, dwreason: SHUTDOWN_REASON): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_InitiateSystemShutdownExW(lpmachinename.toCPointer<ByteVar>(), lpmessage.toCPointer<ByteVar>(), dwtimeout, bforceappsclosed, brebootaftershutdown, dwreason)

public actual fun InitiateSystemShutdownW(lpmachinename: PCWSTR, lpmessage: PCWSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_InitiateSystemShutdownW(lpmachinename.toCPointer<ByteVar>(), lpmessage.toCPointer<ByteVar>(), dwtimeout, bforceappsclosed, brebootaftershutdown)

public actual fun LockWorkStation(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_LockWorkStation()

public actual fun ShutdownBlockReasonCreate(hwnd: HWND, pwszreason: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_ShutdownBlockReasonCreate(hwnd.toCPointer<ByteVar>(), pwszreason.toCPointer<ByteVar>())

public actual fun ShutdownBlockReasonDestroy(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_ShutdownBlockReasonDestroy(hwnd.toCPointer<ByteVar>())

public actual fun ShutdownBlockReasonQuery(hwnd: HWND, pwszbuff: PWSTR, pcchbuff: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_ShutdownBlockReasonQuery(hwnd.toCPointer<ByteVar>(), pwszbuff.toCPointer<ByteVar>(), pcchbuff.toCPointer<ByteVar>())
