@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.shutdown

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun abortSystemShutdownA(lpmachinename: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_abortSystemShutdownA(lpmachinename?.value?.toCPointer<ByteVar>())

public actual fun abortSystemShutdownW(lpmachinename: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_abortSystemShutdownW(lpmachinename?.value?.toCPointer<ByteVar>())

public actual fun checkForHiberboot(phiberboot: COpaquePointer?, bclearflag: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_checkForHiberboot(phiberboot?.value?.toCPointer<ByteVar>(), bclearflag)

public actual fun exitWindowsEx(uflags: ExitWindowsFlags, dwreason: ShutdownReason): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_exitWindowsEx(uflags, dwreason)

public actual fun initiateShutdownA(lpmachinename: Pcstr, lpmessage: Pcstr, dwgraceperiod: UInt, dwshutdownflags: ShutdownFlags, dwreason: ShutdownReason): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_initiateShutdownA(lpmachinename?.value?.toCPointer<ByteVar>(), lpmessage?.value?.toCPointer<ByteVar>(), dwgraceperiod, dwshutdownflags, dwreason)

public actual fun initiateShutdownW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwgraceperiod: UInt, dwshutdownflags: ShutdownFlags, dwreason: ShutdownReason): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_initiateShutdownW(lpmachinename?.value?.toCPointer<ByteVar>(), lpmessage?.value?.toCPointer<ByteVar>(), dwgraceperiod, dwshutdownflags, dwreason)

public actual fun initiateSystemShutdownA(lpmachinename: Pcstr, lpmessage: Pcstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_initiateSystemShutdownA(lpmachinename?.value?.toCPointer<ByteVar>(), lpmessage?.value?.toCPointer<ByteVar>(), dwtimeout, bforceappsclosed, brebootaftershutdown)

public actual fun initiateSystemShutdownExA(lpmachinename: Pcstr, lpmessage: Pcstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool, dwreason: ShutdownReason): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_initiateSystemShutdownExA(lpmachinename?.value?.toCPointer<ByteVar>(), lpmessage?.value?.toCPointer<ByteVar>(), dwtimeout, bforceappsclosed, brebootaftershutdown, dwreason)

public actual fun initiateSystemShutdownExW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool, dwreason: ShutdownReason): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_initiateSystemShutdownExW(lpmachinename?.value?.toCPointer<ByteVar>(), lpmessage?.value?.toCPointer<ByteVar>(), dwtimeout, bforceappsclosed, brebootaftershutdown, dwreason)

public actual fun initiateSystemShutdownW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_initiateSystemShutdownW(lpmachinename?.value?.toCPointer<ByteVar>(), lpmessage?.value?.toCPointer<ByteVar>(), dwtimeout, bforceappsclosed, brebootaftershutdown)

public actual fun lockWorkStation(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_lockWorkStation()

public actual fun shutdownBlockReasonCreate(hwnd: Hwnd, pwszreason: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_shutdownBlockReasonCreate(hwnd?.value?.toCPointer<ByteVar>(), pwszreason?.value?.toCPointer<ByteVar>())

public actual fun shutdownBlockReasonDestroy(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_shutdownBlockReasonDestroy(hwnd?.value?.toCPointer<ByteVar>())

public actual fun shutdownBlockReasonQuery(hwnd: Hwnd, pwszbuff: Pwstr, pcchbuff: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.shutdown.cinterop.windowssys_windows_win32_system_shutdown_shutdownBlockReasonQuery(hwnd?.value?.toCPointer<ByteVar>(), pwszbuff?.value?.toCPointer<ByteVar>(), pcchbuff?.value?.toCPointer<ByteVar>())
