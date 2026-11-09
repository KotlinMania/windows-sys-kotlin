@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.shutdown

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private object WindowsWin32SystemShutdownJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_AbortSystemShutdownA(lpmachinename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_AbortSystemShutdownW(lpmachinename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_CheckForHiberboot(phiberboot: Long, bclearflag: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_ExitWindowsEx(uflags: Int, dwreason: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_InitiateShutdownA(lpmachinename: Long, lpmessage: Long, dwgraceperiod: Int, dwshutdownflags: Int, dwreason: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_InitiateShutdownW(lpmachinename: Long, lpmessage: Long, dwgraceperiod: Int, dwshutdownflags: Int, dwreason: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_InitiateSystemShutdownA(lpmachinename: Long, lpmessage: Long, dwtimeout: Int, bforceappsclosed: Int, brebootaftershutdown: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_InitiateSystemShutdownExA(lpmachinename: Long, lpmessage: Long, dwtimeout: Int, bforceappsclosed: Int, brebootaftershutdown: Int, dwreason: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_InitiateSystemShutdownExW(lpmachinename: Long, lpmessage: Long, dwtimeout: Int, bforceappsclosed: Int, brebootaftershutdown: Int, dwreason: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_InitiateSystemShutdownW(lpmachinename: Long, lpmessage: Long, dwtimeout: Int, bforceappsclosed: Int, brebootaftershutdown: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_LockWorkStation(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_ShutdownBlockReasonCreate(hwnd: Long, pwszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_ShutdownBlockReasonDestroy(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_ShutdownBlockReasonQuery(hwnd: Long, pwszbuff: Long, pcchbuff: Long): Int
}

public actual fun AbortSystemShutdownA(lpmachinename: PCSTR): BOOL =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_AbortSystemShutdownA(lpmachinename)

public actual fun AbortSystemShutdownW(lpmachinename: PCWSTR): BOOL =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_AbortSystemShutdownW(lpmachinename)

public actual fun CheckForHiberboot(phiberboot: Long, bclearflag: Boolean): UInt =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_CheckForHiberboot(phiberboot, bclearflag).toUInt()

public actual fun ExitWindowsEx(uflags: EXIT_WINDOWS_FLAGS, dwreason: SHUTDOWN_REASON): BOOL =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_ExitWindowsEx(uflags.toInt(), dwreason.toInt())

public actual fun InitiateShutdownA(lpmachinename: PCSTR, lpmessage: PCSTR, dwgraceperiod: UInt, dwshutdownflags: SHUTDOWN_FLAGS, dwreason: SHUTDOWN_REASON): UInt =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_InitiateShutdownA(lpmachinename, lpmessage, dwgraceperiod.toInt(), dwshutdownflags.toInt(), dwreason.toInt()).toUInt()

public actual fun InitiateShutdownW(lpmachinename: PCWSTR, lpmessage: PCWSTR, dwgraceperiod: UInt, dwshutdownflags: SHUTDOWN_FLAGS, dwreason: SHUTDOWN_REASON): UInt =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_InitiateShutdownW(lpmachinename, lpmessage, dwgraceperiod.toInt(), dwshutdownflags.toInt(), dwreason.toInt()).toUInt()

public actual fun InitiateSystemShutdownA(lpmachinename: PCSTR, lpmessage: PCSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL): BOOL =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_InitiateSystemShutdownA(lpmachinename, lpmessage, dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown)

public actual fun InitiateSystemShutdownExA(lpmachinename: PCSTR, lpmessage: PCSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL, dwreason: SHUTDOWN_REASON): BOOL =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_InitiateSystemShutdownExA(lpmachinename, lpmessage, dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown, dwreason.toInt())

public actual fun InitiateSystemShutdownExW(lpmachinename: PCWSTR, lpmessage: PCWSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL, dwreason: SHUTDOWN_REASON): BOOL =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_InitiateSystemShutdownExW(lpmachinename, lpmessage, dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown, dwreason.toInt())

public actual fun InitiateSystemShutdownW(lpmachinename: PCWSTR, lpmessage: PCWSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL): BOOL =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_InitiateSystemShutdownW(lpmachinename, lpmessage, dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown)

public actual fun LockWorkStation(): BOOL =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_LockWorkStation()

public actual fun ShutdownBlockReasonCreate(hwnd: HWND, pwszreason: PCWSTR): BOOL =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_ShutdownBlockReasonCreate(hwnd, pwszreason)

public actual fun ShutdownBlockReasonDestroy(hwnd: HWND): BOOL =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_ShutdownBlockReasonDestroy(hwnd)

public actual fun ShutdownBlockReasonQuery(hwnd: HWND, pwszbuff: PWSTR, pcchbuff: Long): BOOL =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_ShutdownBlockReasonQuery(hwnd, pwszbuff, pcchbuff)
