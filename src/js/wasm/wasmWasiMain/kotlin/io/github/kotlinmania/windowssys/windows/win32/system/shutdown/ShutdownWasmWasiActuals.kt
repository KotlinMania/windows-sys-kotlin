@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.shutdown

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public actual fun abortSystemShutdownA(lpmachinename: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun abortSystemShutdownW(lpmachinename: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun checkForHiberboot(phiberboot: COpaquePointer?, bclearflag: Boolean): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exitWindowsEx(uflags: ExitWindowsFlags, dwreason: ShutdownReason): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initiateShutdownA(lpmachinename: Pcstr, lpmessage: Pcstr, dwgraceperiod: UInt, dwshutdownflags: ShutdownFlags, dwreason: ShutdownReason): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initiateShutdownW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwgraceperiod: UInt, dwshutdownflags: ShutdownFlags, dwreason: ShutdownReason): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initiateSystemShutdownA(lpmachinename: Pcstr, lpmessage: Pcstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initiateSystemShutdownExA(lpmachinename: Pcstr, lpmessage: Pcstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool, dwreason: ShutdownReason): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initiateSystemShutdownExW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool, dwreason: ShutdownReason): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initiateSystemShutdownW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lockWorkStation(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shutdownBlockReasonCreate(hwnd: Hwnd, pwszreason: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shutdownBlockReasonDestroy(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shutdownBlockReasonQuery(hwnd: Hwnd, pwszbuff: Pwstr, pcchbuff: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
