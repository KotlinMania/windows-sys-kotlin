@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.securitycenter

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine

public actual fun wscGetAntiMalwareUri(ppszuri: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wscGetSecurityProviderHealth(providers: UInt, phealth: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wscQueryAntiMalwareUri(): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wscRegisterForChanges(reserved: COpaquePointer?, phcallbackregistration: COpaquePointer?, lpcallbackaddress: LpthreadStartRoutine, pcontext: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wscRegisterForUserNotifications(): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wscUnRegisterChanges(hregistrationhandle: Handle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
