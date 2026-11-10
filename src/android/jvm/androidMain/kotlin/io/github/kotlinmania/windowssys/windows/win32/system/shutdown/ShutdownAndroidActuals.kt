@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.shutdown

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32SystemShutdownJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_abortSystemShutdownA(lpmachinename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_abortSystemShutdownW(lpmachinename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_checkForHiberboot(phiberboot: Long, bclearflag: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_exitWindowsEx(uflags: Int, dwreason: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_initiateShutdownA(lpmachinename: Long, lpmessage: Long, dwgraceperiod: Int, dwshutdownflags: Int, dwreason: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_initiateShutdownW(lpmachinename: Long, lpmessage: Long, dwgraceperiod: Int, dwshutdownflags: Int, dwreason: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_initiateSystemShutdownA(lpmachinename: Long, lpmessage: Long, dwtimeout: Int, bforceappsclosed: Int, brebootaftershutdown: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_initiateSystemShutdownExA(lpmachinename: Long, lpmessage: Long, dwtimeout: Int, bforceappsclosed: Int, brebootaftershutdown: Int, dwreason: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_initiateSystemShutdownExW(lpmachinename: Long, lpmessage: Long, dwtimeout: Int, bforceappsclosed: Int, brebootaftershutdown: Int, dwreason: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_initiateSystemShutdownW(lpmachinename: Long, lpmessage: Long, dwtimeout: Int, bforceappsclosed: Int, brebootaftershutdown: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_lockWorkStation(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_shutdownBlockReasonCreate(hwnd: Long, pwszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_shutdownBlockReasonDestroy(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_shutdown_shutdownBlockReasonQuery(hwnd: Long, pwszbuff: Long, pcchbuff: Long): Int
}

public actual fun abortSystemShutdownA(lpmachinename: Pcstr): Bool =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_abortSystemShutdownA((lpmachinename?.value ?: 0L))

public actual fun abortSystemShutdownW(lpmachinename: Pcwstr): Bool =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_abortSystemShutdownW((lpmachinename?.value ?: 0L))

public actual fun checkForHiberboot(phiberboot: COpaquePointer?, bclearflag: Boolean): UInt =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_checkForHiberboot((phiberboot?.value ?: 0L), bclearflag).toUInt()

public actual fun exitWindowsEx(uflags: ExitWindowsFlags, dwreason: ShutdownReason): Bool =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_exitWindowsEx(uflags.toInt(), dwreason.toInt())

public actual fun initiateShutdownA(lpmachinename: Pcstr, lpmessage: Pcstr, dwgraceperiod: UInt, dwshutdownflags: ShutdownFlags, dwreason: ShutdownReason): UInt =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_initiateShutdownA((lpmachinename?.value ?: 0L), (lpmessage?.value ?: 0L), dwgraceperiod.toInt(), dwshutdownflags.toInt(), dwreason.toInt()).toUInt()

public actual fun initiateShutdownW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwgraceperiod: UInt, dwshutdownflags: ShutdownFlags, dwreason: ShutdownReason): UInt =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_initiateShutdownW((lpmachinename?.value ?: 0L), (lpmessage?.value ?: 0L), dwgraceperiod.toInt(), dwshutdownflags.toInt(), dwreason.toInt()).toUInt()

public actual fun initiateSystemShutdownA(lpmachinename: Pcstr, lpmessage: Pcstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool): Bool =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_initiateSystemShutdownA((lpmachinename?.value ?: 0L), (lpmessage?.value ?: 0L), dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown)

public actual fun initiateSystemShutdownExA(lpmachinename: Pcstr, lpmessage: Pcstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool, dwreason: ShutdownReason): Bool =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_initiateSystemShutdownExA((lpmachinename?.value ?: 0L), (lpmessage?.value ?: 0L), dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown, dwreason.toInt())

public actual fun initiateSystemShutdownExW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool, dwreason: ShutdownReason): Bool =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_initiateSystemShutdownExW((lpmachinename?.value ?: 0L), (lpmessage?.value ?: 0L), dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown, dwreason.toInt())

public actual fun initiateSystemShutdownW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool): Bool =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_initiateSystemShutdownW((lpmachinename?.value ?: 0L), (lpmessage?.value ?: 0L), dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown)

public actual fun lockWorkStation(): Bool =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_lockWorkStation()

public actual fun shutdownBlockReasonCreate(hwnd: Hwnd, pwszreason: Pcwstr): Bool =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_shutdownBlockReasonCreate((hwnd?.value ?: 0L), (pwszreason?.value ?: 0L))

public actual fun shutdownBlockReasonDestroy(hwnd: Hwnd): Bool =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_shutdownBlockReasonDestroy((hwnd?.value ?: 0L))

public actual fun shutdownBlockReasonQuery(hwnd: Hwnd, pwszbuff: Pwstr, pcchbuff: COpaquePointer?): Bool =
    WindowsWin32SystemShutdownJniBridge.windowssys_windows_win32_system_shutdown_shutdownBlockReasonQuery((hwnd?.value ?: 0L), (pwszbuff?.value ?: 0L), (pcchbuff?.value ?: 0L))
