@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.Hcertstore
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun certSelectionGetSerializedBlob(pcsi: COpaquePointer?, ppoutbuffer: COpaquePointer?, puloutbuffersize: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssys_windows_win32_security_cryptography_ui_certSelectionGetSerializedBlob(pcsi?.value?.toCPointer<ByteVar>(), ppoutbuffer?.value?.toCPointer<ByteVar>(), puloutbuffersize?.value?.toCPointer<ByteVar>())

public actual fun cryptUIDlgCertMgr(pcryptuicertmgr: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssys_windows_win32_security_cryptography_ui_cryptUIDlgCertMgr(pcryptuicertmgr?.value?.toCPointer<ByteVar>())

public actual fun cryptUIDlgSelectCertificateFromStore(hcertstore: Hcertstore, hwnd: Hwnd, pwsztitle: Pcwstr, pwszdisplaystring: Pcwstr, dwdontusecolumn: UInt, dwflags: UInt, pvreserved: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssys_windows_win32_security_cryptography_ui_cryptUIDlgSelectCertificateFromStore(hcertstore?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), pwsztitle?.value?.toCPointer<ByteVar>(), pwszdisplaystring?.value?.toCPointer<ByteVar>(), dwdontusecolumn, dwflags, pvreserved?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cryptUIDlgViewCertificateA(pcertviewinfo: COpaquePointer?, pfpropertieschanged: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssys_windows_win32_security_cryptography_ui_cryptUIDlgViewCertificateA(pcertviewinfo?.value?.toCPointer<ByteVar>(), pfpropertieschanged?.value?.toCPointer<ByteVar>())

public actual fun cryptUIDlgViewCertificateW(pcertviewinfo: COpaquePointer?, pfpropertieschanged: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssys_windows_win32_security_cryptography_ui_cryptUIDlgViewCertificateW(pcertviewinfo?.value?.toCPointer<ByteVar>(), pfpropertieschanged?.value?.toCPointer<ByteVar>())

public actual fun cryptUIDlgViewContext(dwcontexttype: UInt, pvcontext: COpaquePointer?, hwnd: Hwnd, pwsztitle: Pcwstr, dwflags: UInt, pvreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssys_windows_win32_security_cryptography_ui_cryptUIDlgViewContext(dwcontexttype, pvcontext?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), pwsztitle?.value?.toCPointer<ByteVar>(), dwflags, pvreserved?.value?.toCPointer<ByteVar>())

public actual fun cryptUIWizDigitalSign(dwflags: UInt, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pdigitalsigninfo: COpaquePointer?, ppsigncontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssys_windows_win32_security_cryptography_ui_cryptUIWizDigitalSign(dwflags, hwndparent?.value?.toCPointer<ByteVar>(), pwszwizardtitle?.value?.toCPointer<ByteVar>(), pdigitalsigninfo?.value?.toCPointer<ByteVar>(), ppsigncontext?.value?.toCPointer<ByteVar>())

public actual fun cryptUIWizExport(dwflags: CryptuiWizFlags, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pexportinfo: COpaquePointer?, pvoid: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssys_windows_win32_security_cryptography_ui_cryptUIWizExport(dwflags, hwndparent?.value?.toCPointer<ByteVar>(), pwszwizardtitle?.value?.toCPointer<ByteVar>(), pexportinfo?.value?.toCPointer<ByteVar>(), pvoid?.value?.toCPointer<ByteVar>())

public actual fun cryptUIWizFreeDigitalSignContext(psigncontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssys_windows_win32_security_cryptography_ui_cryptUIWizFreeDigitalSignContext(psigncontext?.value?.toCPointer<ByteVar>())

public actual fun cryptUIWizImport(dwflags: CryptuiWizFlags, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pimportsrc: COpaquePointer?, hdestcertstore: Hcertstore): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssys_windows_win32_security_cryptography_ui_cryptUIWizImport(dwflags, hwndparent?.value?.toCPointer<ByteVar>(), pwszwizardtitle?.value?.toCPointer<ByteVar>(), pimportsrc?.value?.toCPointer<ByteVar>(), hdestcertstore?.value?.toCPointer<ByteVar>())
