@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.securitycenter

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun wscGetAntiMalwareUri(ppszuri: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSecuritycenterWscGetAntiMalwareUri")

public actual fun wscGetSecurityProviderHealth(providers: UInt, phealth: MutPtr<WscSecurityProviderHealth>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSecuritycenterWscGetSecurityProviderHealth")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemSecuritycenterWscQueryAntiMalwareUri")
private external fun wasiWindowssysWindowsWin32SystemSecuritycenterWscQueryAntiMalwareUri(): Int

public actual fun wscQueryAntiMalwareUri(): Hresult =
    wasiWindowssysWindowsWin32SystemSecuritycenterWscQueryAntiMalwareUri().toInt()

public actual fun wscRegisterForChanges(reserved: MutPtr<CVoid>, phcallbackregistration: MutPtr<Handle>, lpcallbackaddress: LpthreadStartRoutine, pcontext: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSecuritycenterWscRegisterForChanges")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemSecuritycenterWscRegisterForUserNotifications")
private external fun wasiWindowssysWindowsWin32SystemSecuritycenterWscRegisterForUserNotifications(): Int

public actual fun wscRegisterForUserNotifications(): Hresult =
    wasiWindowssysWindowsWin32SystemSecuritycenterWscRegisterForUserNotifications().toInt()

public actual fun wscUnRegisterChanges(hregistrationhandle: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSecuritycenterWscUnRegisterChanges")
