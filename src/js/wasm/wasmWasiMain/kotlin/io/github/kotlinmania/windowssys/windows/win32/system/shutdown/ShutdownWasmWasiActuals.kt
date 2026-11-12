@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.shutdown

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun abortSystemShutdownA(lpmachinename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemShutdownAbortSystemShutdownA")

public actual fun abortSystemShutdownW(lpmachinename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemShutdownAbortSystemShutdownW")

public actual fun checkForHiberboot(phiberboot: MutPtr<Boolean>, bclearflag: Boolean): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemShutdownCheckForHiberboot")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemShutdownExitWindowsEx")
private external fun wasiWindowssysWindowsWin32SystemShutdownExitWindowsEx(uflags: Int, dwreason: Int): Int

public actual fun exitWindowsEx(uflags: ExitWindowsFlags, dwreason: ShutdownReason): Bool =
    wasiWindowssysWindowsWin32SystemShutdownExitWindowsEx(uflags.toInt(), dwreason.toInt())

public actual fun initiateShutdownA(lpmachinename: Pcstr, lpmessage: Pcstr, dwgraceperiod: UInt, dwshutdownflags: ShutdownFlags, dwreason: ShutdownReason): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemShutdownInitiateShutdownA")

public actual fun initiateShutdownW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwgraceperiod: UInt, dwshutdownflags: ShutdownFlags, dwreason: ShutdownReason): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemShutdownInitiateShutdownW")

public actual fun initiateSystemShutdownA(lpmachinename: Pcstr, lpmessage: Pcstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemShutdownInitiateSystemShutdownA")

public actual fun initiateSystemShutdownExA(lpmachinename: Pcstr, lpmessage: Pcstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool, dwreason: ShutdownReason): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemShutdownInitiateSystemShutdownExA")

public actual fun initiateSystemShutdownExW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool, dwreason: ShutdownReason): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemShutdownInitiateSystemShutdownExW")

public actual fun initiateSystemShutdownW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemShutdownInitiateSystemShutdownW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemShutdownLockWorkStation")
private external fun wasiWindowssysWindowsWin32SystemShutdownLockWorkStation(): Int

public actual fun lockWorkStation(): Bool =
    wasiWindowssysWindowsWin32SystemShutdownLockWorkStation()

public actual fun shutdownBlockReasonCreate(hwnd: Hwnd, pwszreason: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemShutdownShutdownBlockReasonCreate")

public actual fun shutdownBlockReasonDestroy(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemShutdownShutdownBlockReasonDestroy")

public actual fun shutdownBlockReasonQuery(hwnd: Hwnd, pwszbuff: Pwstr, pcchbuff: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemShutdownShutdownBlockReasonQuery")
