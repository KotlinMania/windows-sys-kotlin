@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.recovery

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.ApplicationRecoveryCallback

// The host must provide the C companion wrapper exports in import module windowssys.
@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRecoveryApplicationRecoveryFinished")
private external fun wasiWindowssysWindowsWin32SystemRecoveryApplicationRecoveryFinished(bsuccess: Int): Unit

public actual fun applicationRecoveryFinished(bsuccess: Bool): Unit =
    wasiWindowssysWindowsWin32SystemRecoveryApplicationRecoveryFinished(bsuccess)

public actual fun applicationRecoveryInProgress(pbcancelled: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRecoveryApplicationRecoveryInProgress")

public actual fun getApplicationRecoveryCallback(hprocess: Handle, precoverycallback: MutPtr<ApplicationRecoveryCallback>, ppvparameter: MutPtr<MutPtr<CVoid>>, pdwpinginterval: MutPtr<UInt>, pdwflags: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRecoveryGetApplicationRecoveryCallback")

public actual fun getApplicationRestartSettings(hprocess: Handle, pwzcommandline: Pwstr, pcchsize: MutPtr<UInt>, pdwflags: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRecoveryGetApplicationRestartSettings")

public actual fun registerApplicationRecoveryCallback(precoveycallback: ApplicationRecoveryCallback, pvparameter: ConstPtr<CVoid>, dwpinginterval: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRecoveryRegisterApplicationRecoveryCallback")

public actual fun registerApplicationRestart(pwzcommandline: Pcwstr, dwflags: RegisterApplicationRestartFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRecoveryRegisterApplicationRestart")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRecoveryUnregisterApplicationRecoveryCallback")
private external fun wasiWindowssysWindowsWin32SystemRecoveryUnregisterApplicationRecoveryCallback(): Int

public actual fun unregisterApplicationRecoveryCallback(): Hresult =
    wasiWindowssysWindowsWin32SystemRecoveryUnregisterApplicationRecoveryCallback().toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRecoveryUnregisterApplicationRestart")
private external fun wasiWindowssysWindowsWin32SystemRecoveryUnregisterApplicationRestart(): Int

public actual fun unregisterApplicationRestart(): Hresult =
    wasiWindowssysWindowsWin32SystemRecoveryUnregisterApplicationRestart().toInt()
