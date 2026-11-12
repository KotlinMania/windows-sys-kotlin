@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.licenseprotection

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun registerLicenseKeyWithExpiration(licensekey: Pcwstr, validityindays: UInt, status: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityLicenseprotectionRegisterLicenseKeyWithExpiration")

public actual fun validateLicenseKeyProtection(licensekey: Pcwstr, notvalidbefore: MutPtr, notvalidafter: MutPtr, status: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityLicenseprotectionValidateLicenseKeyProtection")
