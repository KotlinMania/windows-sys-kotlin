@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.Hcertstore

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun certSelectionGetSerializedBlob(pcsi: ConstPtr<CertSelectuiInput>, ppoutbuffer: MutPtr<MutPtr<CVoid>>, puloutbuffersize: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyUiCertSelectionGetSerializedBlob")

public actual fun cryptUIDlgCertMgr(pcryptuicertmgr: ConstPtr<CryptuiCertMgrStruct>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgCertMgr")

public actual fun cryptUIDlgSelectCertificateFromStore(hcertstore: Hcertstore, hwnd: Hwnd, pwsztitle: Pcwstr, pwszdisplaystring: Pcwstr, dwdontusecolumn: UInt, dwflags: UInt, pvreserved: ConstPtr<CVoid>): MutPtr<CertContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgSelectCertificateFromStore")

public actual fun cryptUIDlgViewCertificateA(pcertviewinfo: ConstPtr<CryptuiViewcertificateStructa>, pfpropertieschanged: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewCertificateA")

public actual fun cryptUIDlgViewCertificateW(pcertviewinfo: ConstPtr<CryptuiViewcertificateStructw>, pfpropertieschanged: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewCertificateW")

public actual fun cryptUIDlgViewContext(dwcontexttype: UInt, pvcontext: ConstPtr<CVoid>, hwnd: Hwnd, pwsztitle: Pcwstr, dwflags: UInt, pvreserved: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewContext")

public actual fun cryptUIWizDigitalSign(dwflags: UInt, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pdigitalsigninfo: ConstPtr<CryptuiWizDigitalSignInfo>, ppsigncontext: MutPtr<MutPtr<CryptuiWizDigitalSignContext>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyUiCryptUIWizDigitalSign")

public actual fun cryptUIWizExport(dwflags: CryptuiWizFlags, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pexportinfo: ConstPtr<CryptuiWizExportInfo>, pvoid: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyUiCryptUIWizExport")

public actual fun cryptUIWizFreeDigitalSignContext(psigncontext: ConstPtr<CryptuiWizDigitalSignContext>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyUiCryptUIWizFreeDigitalSignContext")

public actual fun cryptUIWizImport(dwflags: CryptuiWizFlags, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pimportsrc: ConstPtr<CryptuiWizImportSrcInfo>, hdestcertstore: Hcertstore): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyUiCryptUIWizImport")
