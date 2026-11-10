@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.Hcertstore

public actual fun certSelectionGetSerializedBlob(pcsi: COpaquePointer?, ppoutbuffer: COpaquePointer?, puloutbuffersize: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptUIDlgCertMgr(pcryptuicertmgr: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptUIDlgSelectCertificateFromStore(hcertstore: Hcertstore, hwnd: Hwnd, pwsztitle: Pcwstr, pwszdisplaystring: Pcwstr, dwdontusecolumn: UInt, dwflags: UInt, pvreserved: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptUIDlgViewCertificateA(pcertviewinfo: COpaquePointer?, pfpropertieschanged: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptUIDlgViewCertificateW(pcertviewinfo: COpaquePointer?, pfpropertieschanged: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptUIDlgViewContext(dwcontexttype: UInt, pvcontext: COpaquePointer?, hwnd: Hwnd, pwsztitle: Pcwstr, dwflags: UInt, pvreserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptUIWizDigitalSign(dwflags: UInt, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pdigitalsigninfo: COpaquePointer?, ppsigncontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptUIWizExport(dwflags: CryptuiWizFlags, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pexportinfo: COpaquePointer?, pvoid: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptUIWizFreeDigitalSignContext(psigncontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptUIWizImport(dwflags: CryptuiWizFlags, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pimportsrc: COpaquePointer?, hdestcertstore: Hcertstore): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
