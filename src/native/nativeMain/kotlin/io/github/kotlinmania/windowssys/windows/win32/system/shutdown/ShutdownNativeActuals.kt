@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.shutdown

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssysWindowsWin32SystemShutdownAbortSystemShutdownA
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssysWindowsWin32SystemShutdownAbortSystemShutdownW
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssysWindowsWin32SystemShutdownCheckForHiberboot
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssysWindowsWin32SystemShutdownExitWindowsEx
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssysWindowsWin32SystemShutdownInitiateShutdownA
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssysWindowsWin32SystemShutdownInitiateShutdownW
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssysWindowsWin32SystemShutdownInitiateSystemShutdownA
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssysWindowsWin32SystemShutdownInitiateSystemShutdownExA
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssysWindowsWin32SystemShutdownInitiateSystemShutdownExW
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssysWindowsWin32SystemShutdownInitiateSystemShutdownW
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssysWindowsWin32SystemShutdownLockWorkStation
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssysWindowsWin32SystemShutdownShutdownBlockReasonCreate
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssysWindowsWin32SystemShutdownShutdownBlockReasonDestroy
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssysWindowsWin32SystemShutdownShutdownBlockReasonQuery
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun abortSystemShutdownA(lpmachinename: Pcstr): Bool =
    windowssysWindowsWin32SystemShutdownAbortSystemShutdownA(lpmachinename.rawAddress.toCPointer<ByteVar>())

public actual fun abortSystemShutdownW(lpmachinename: Pcwstr): Bool =
    windowssysWindowsWin32SystemShutdownAbortSystemShutdownW(lpmachinename.rawAddress.toCPointer<ByteVar>())

public actual fun checkForHiberboot(phiberboot: MutPtr<Boolean>, bclearflag: Boolean): UInt =
    windowssysWindowsWin32SystemShutdownCheckForHiberboot(phiberboot.rawAddress.toCPointer<ByteVar>(), bclearflag)

public actual fun exitWindowsEx(uflags: ExitWindowsFlags, dwreason: ShutdownReason): Bool =
    windowssysWindowsWin32SystemShutdownExitWindowsEx(uflags, dwreason)

public actual fun initiateShutdownA(lpmachinename: Pcstr, lpmessage: Pcstr, dwgraceperiod: UInt, dwshutdownflags: ShutdownFlags, dwreason: ShutdownReason): UInt =
    windowssysWindowsWin32SystemShutdownInitiateShutdownA(lpmachinename.rawAddress.toCPointer<ByteVar>(), lpmessage.rawAddress.toCPointer<ByteVar>(), dwgraceperiod, dwshutdownflags, dwreason)

public actual fun initiateShutdownW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwgraceperiod: UInt, dwshutdownflags: ShutdownFlags, dwreason: ShutdownReason): UInt =
    windowssysWindowsWin32SystemShutdownInitiateShutdownW(lpmachinename.rawAddress.toCPointer<ByteVar>(), lpmessage.rawAddress.toCPointer<ByteVar>(), dwgraceperiod, dwshutdownflags, dwreason)

public actual fun initiateSystemShutdownA(lpmachinename: Pcstr, lpmessage: Pcstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool): Bool =
    windowssysWindowsWin32SystemShutdownInitiateSystemShutdownA(lpmachinename.rawAddress.toCPointer<ByteVar>(), lpmessage.rawAddress.toCPointer<ByteVar>(), dwtimeout, bforceappsclosed, brebootaftershutdown)

public actual fun initiateSystemShutdownExA(lpmachinename: Pcstr, lpmessage: Pcstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool, dwreason: ShutdownReason): Bool =
    windowssysWindowsWin32SystemShutdownInitiateSystemShutdownExA(lpmachinename.rawAddress.toCPointer<ByteVar>(), lpmessage.rawAddress.toCPointer<ByteVar>(), dwtimeout, bforceappsclosed, brebootaftershutdown, dwreason)

public actual fun initiateSystemShutdownExW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool, dwreason: ShutdownReason): Bool =
    windowssysWindowsWin32SystemShutdownInitiateSystemShutdownExW(lpmachinename.rawAddress.toCPointer<ByteVar>(), lpmessage.rawAddress.toCPointer<ByteVar>(), dwtimeout, bforceappsclosed, brebootaftershutdown, dwreason)

public actual fun initiateSystemShutdownW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool): Bool =
    windowssysWindowsWin32SystemShutdownInitiateSystemShutdownW(lpmachinename.rawAddress.toCPointer<ByteVar>(), lpmessage.rawAddress.toCPointer<ByteVar>(), dwtimeout, bforceappsclosed, brebootaftershutdown)

public actual fun lockWorkStation(): Bool =
    windowssysWindowsWin32SystemShutdownLockWorkStation()

public actual fun shutdownBlockReasonCreate(hwnd: Hwnd, pwszreason: Pcwstr): Bool =
    windowssysWindowsWin32SystemShutdownShutdownBlockReasonCreate(hwnd.rawAddress.toCPointer<ByteVar>(), pwszreason.rawAddress.toCPointer<ByteVar>())

public actual fun shutdownBlockReasonDestroy(hwnd: Hwnd): Bool =
    windowssysWindowsWin32SystemShutdownShutdownBlockReasonDestroy(hwnd.rawAddress.toCPointer<ByteVar>())

public actual fun shutdownBlockReasonQuery(hwnd: Hwnd, pwszbuff: Pwstr, pcchbuff: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemShutdownShutdownBlockReasonQuery(hwnd.rawAddress.toCPointer<ByteVar>(), pwszbuff.rawAddress.toCPointer<ByteVar>(), pcchbuff.rawAddress.toCPointer<ByteVar>())
