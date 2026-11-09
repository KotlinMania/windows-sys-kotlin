@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.HCERTSTORE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun CertSelectionGetSerializedBlob(pcsi: Long, ppoutbuffer: Long, puloutbuffersize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssys_windows_win32_security_cryptography_ui_CertSelectionGetSerializedBlob(pcsi.toCPointer<ByteVar>(), ppoutbuffer.toCPointer<ByteVar>(), puloutbuffersize.toCPointer<ByteVar>())

public actual fun CryptUIDlgCertMgr(pcryptuicertmgr: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssys_windows_win32_security_cryptography_ui_CryptUIDlgCertMgr(pcryptuicertmgr.toCPointer<ByteVar>())

public actual fun CryptUIDlgSelectCertificateFromStore(hcertstore: HCERTSTORE, hwnd: HWND, pwsztitle: PCWSTR, pwszdisplaystring: PCWSTR, dwdontusecolumn: UInt, dwflags: UInt, pvreserved: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssys_windows_win32_security_cryptography_ui_CryptUIDlgSelectCertificateFromStore(hcertstore.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), pwsztitle.toCPointer<ByteVar>(), pwszdisplaystring.toCPointer<ByteVar>(), dwdontusecolumn, dwflags, pvreserved.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CryptUIDlgViewCertificateA(pcertviewinfo: Long, pfpropertieschanged: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssys_windows_win32_security_cryptography_ui_CryptUIDlgViewCertificateA(pcertviewinfo.toCPointer<ByteVar>(), pfpropertieschanged.toCPointer<ByteVar>())

public actual fun CryptUIDlgViewCertificateW(pcertviewinfo: Long, pfpropertieschanged: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssys_windows_win32_security_cryptography_ui_CryptUIDlgViewCertificateW(pcertviewinfo.toCPointer<ByteVar>(), pfpropertieschanged.toCPointer<ByteVar>())

public actual fun CryptUIDlgViewContext(dwcontexttype: UInt, pvcontext: Long, hwnd: HWND, pwsztitle: PCWSTR, dwflags: UInt, pvreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssys_windows_win32_security_cryptography_ui_CryptUIDlgViewContext(dwcontexttype, pvcontext.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), pwsztitle.toCPointer<ByteVar>(), dwflags, pvreserved.toCPointer<ByteVar>())

public actual fun CryptUIWizDigitalSign(dwflags: UInt, hwndparent: HWND, pwszwizardtitle: PCWSTR, pdigitalsigninfo: Long, ppsigncontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssys_windows_win32_security_cryptography_ui_CryptUIWizDigitalSign(dwflags, hwndparent.toCPointer<ByteVar>(), pwszwizardtitle.toCPointer<ByteVar>(), pdigitalsigninfo.toCPointer<ByteVar>(), ppsigncontext.toCPointer<ByteVar>())

public actual fun CryptUIWizExport(dwflags: CRYPTUI_WIZ_FLAGS, hwndparent: HWND, pwszwizardtitle: PCWSTR, pexportinfo: Long, pvoid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssys_windows_win32_security_cryptography_ui_CryptUIWizExport(dwflags, hwndparent.toCPointer<ByteVar>(), pwszwizardtitle.toCPointer<ByteVar>(), pexportinfo.toCPointer<ByteVar>(), pvoid.toCPointer<ByteVar>())

public actual fun CryptUIWizFreeDigitalSignContext(psigncontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssys_windows_win32_security_cryptography_ui_CryptUIWizFreeDigitalSignContext(psigncontext.toCPointer<ByteVar>())

public actual fun CryptUIWizImport(dwflags: CRYPTUI_WIZ_FLAGS, hwndparent: HWND, pwszwizardtitle: PCWSTR, pimportsrc: Long, hdestcertstore: HCERTSTORE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssys_windows_win32_security_cryptography_ui_CryptUIWizImport(dwflags, hwndparent.toCPointer<ByteVar>(), pwszwizardtitle.toCPointer<ByteVar>(), pimportsrc.toCPointer<ByteVar>(), hdestcertstore.toCPointer<ByteVar>())
