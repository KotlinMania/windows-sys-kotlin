@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public actual fun acquireDeveloperLicense(hwndparent: Hwnd, pexpiration: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun checkDeveloperLicense(pexpiration: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeDeveloperLicense(hwndparent: Hwnd): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
