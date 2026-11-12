@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.shutdown

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
    external fun windowssysWindowsWin32SystemShutdownAbortSystemShutdownA(lpmachinename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemShutdownAbortSystemShutdownW(lpmachinename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemShutdownCheckForHiberboot(phiberboot: Long, bclearflag: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemShutdownExitWindowsEx(uflags: Int, dwreason: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemShutdownInitiateShutdownA(lpmachinename: Long, lpmessage: Long, dwgraceperiod: Int, dwshutdownflags: Int, dwreason: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemShutdownInitiateShutdownW(lpmachinename: Long, lpmessage: Long, dwgraceperiod: Int, dwshutdownflags: Int, dwreason: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemShutdownInitiateSystemShutdownA(lpmachinename: Long, lpmessage: Long, dwtimeout: Int, bforceappsclosed: Int, brebootaftershutdown: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemShutdownInitiateSystemShutdownExA(lpmachinename: Long, lpmessage: Long, dwtimeout: Int, bforceappsclosed: Int, brebootaftershutdown: Int, dwreason: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemShutdownInitiateSystemShutdownExW(lpmachinename: Long, lpmessage: Long, dwtimeout: Int, bforceappsclosed: Int, brebootaftershutdown: Int, dwreason: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemShutdownInitiateSystemShutdownW(lpmachinename: Long, lpmessage: Long, dwtimeout: Int, bforceappsclosed: Int, brebootaftershutdown: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemShutdownLockWorkStation(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemShutdownShutdownBlockReasonCreate(hwnd: Long, pwszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemShutdownShutdownBlockReasonDestroy(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemShutdownShutdownBlockReasonQuery(hwnd: Long, pwszbuff: Long, pcchbuff: Long): Int
}

public actual fun abortSystemShutdownA(lpmachinename: Pcstr): Bool =
    WindowsWin32SystemShutdownJniBridge.windowssysWindowsWin32SystemShutdownAbortSystemShutdownA(lpmachinename.rawAddress)

public actual fun abortSystemShutdownW(lpmachinename: Pcwstr): Bool =
    WindowsWin32SystemShutdownJniBridge.windowssysWindowsWin32SystemShutdownAbortSystemShutdownW(lpmachinename.rawAddress)

public actual fun checkForHiberboot(phiberboot: MutPtr<Boolean>, bclearflag: Boolean): UInt =
    WindowsWin32SystemShutdownJniBridge.windowssysWindowsWin32SystemShutdownCheckForHiberboot(phiberboot.rawAddress, bclearflag).toUInt()

public actual fun exitWindowsEx(uflags: ExitWindowsFlags, dwreason: ShutdownReason): Bool =
    WindowsWin32SystemShutdownJniBridge.windowssysWindowsWin32SystemShutdownExitWindowsEx(uflags.toInt(), dwreason.toInt())

public actual fun initiateShutdownA(lpmachinename: Pcstr, lpmessage: Pcstr, dwgraceperiod: UInt, dwshutdownflags: ShutdownFlags, dwreason: ShutdownReason): UInt =
    WindowsWin32SystemShutdownJniBridge.windowssysWindowsWin32SystemShutdownInitiateShutdownA(lpmachinename.rawAddress, lpmessage.rawAddress, dwgraceperiod.toInt(), dwshutdownflags.toInt(), dwreason.toInt()).toUInt()

public actual fun initiateShutdownW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwgraceperiod: UInt, dwshutdownflags: ShutdownFlags, dwreason: ShutdownReason): UInt =
    WindowsWin32SystemShutdownJniBridge.windowssysWindowsWin32SystemShutdownInitiateShutdownW(lpmachinename.rawAddress, lpmessage.rawAddress, dwgraceperiod.toInt(), dwshutdownflags.toInt(), dwreason.toInt()).toUInt()

public actual fun initiateSystemShutdownA(lpmachinename: Pcstr, lpmessage: Pcstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool): Bool =
    WindowsWin32SystemShutdownJniBridge.windowssysWindowsWin32SystemShutdownInitiateSystemShutdownA(lpmachinename.rawAddress, lpmessage.rawAddress, dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown)

public actual fun initiateSystemShutdownExA(lpmachinename: Pcstr, lpmessage: Pcstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool, dwreason: ShutdownReason): Bool =
    WindowsWin32SystemShutdownJniBridge.windowssysWindowsWin32SystemShutdownInitiateSystemShutdownExA(lpmachinename.rawAddress, lpmessage.rawAddress, dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown, dwreason.toInt())

public actual fun initiateSystemShutdownExW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool, dwreason: ShutdownReason): Bool =
    WindowsWin32SystemShutdownJniBridge.windowssysWindowsWin32SystemShutdownInitiateSystemShutdownExW(lpmachinename.rawAddress, lpmessage.rawAddress, dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown, dwreason.toInt())

public actual fun initiateSystemShutdownW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool): Bool =
    WindowsWin32SystemShutdownJniBridge.windowssysWindowsWin32SystemShutdownInitiateSystemShutdownW(lpmachinename.rawAddress, lpmessage.rawAddress, dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown)

public actual fun lockWorkStation(): Bool =
    WindowsWin32SystemShutdownJniBridge.windowssysWindowsWin32SystemShutdownLockWorkStation()

public actual fun shutdownBlockReasonCreate(hwnd: Hwnd, pwszreason: Pcwstr): Bool =
    WindowsWin32SystemShutdownJniBridge.windowssysWindowsWin32SystemShutdownShutdownBlockReasonCreate(hwnd.rawAddress, pwszreason.rawAddress)

public actual fun shutdownBlockReasonDestroy(hwnd: Hwnd): Bool =
    WindowsWin32SystemShutdownJniBridge.windowssysWindowsWin32SystemShutdownShutdownBlockReasonDestroy(hwnd.rawAddress)

public actual fun shutdownBlockReasonQuery(hwnd: Hwnd, pwszbuff: Pwstr, pcchbuff: MutPtr<UInt>): Bool =
    WindowsWin32SystemShutdownJniBridge.windowssysWindowsWin32SystemShutdownShutdownBlockReasonQuery(hwnd.rawAddress, pwszbuff.rawAddress, pcchbuff.rawAddress)
