@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

public actual fun dtcGetTransactionManager(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: COpaquePointer?, iDwreserved1: UInt, iWcbreserved2: UShort, iPvreserved2: COpaquePointer?, oPpvobject: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dtcGetTransactionManagerC(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: COpaquePointer?, iDwreserved1: UInt, iWcbreserved2: UShort, iPvreserved2: COpaquePointer?, oPpvobject: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dtcGetTransactionManagerExA(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: COpaquePointer?, iGrfoptions: UInt, iPvconfigparams: COpaquePointer?, oPpvobject: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dtcGetTransactionManagerExW(iPwszhost: Pcwstr, iPwsztmname: Pcwstr, iRiid: COpaquePointer?, iGrfoptions: UInt, iPvconfigparams: COpaquePointer?, oPpvobject: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
