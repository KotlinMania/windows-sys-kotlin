@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.HCERTSTORE

private object WindowsWin32SecurityCryptographyUiJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_ui_CertSelectionGetSerializedBlob(pcsi: Long, ppoutbuffer: Long, puloutbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_ui_CryptUIDlgCertMgr(pcryptuicertmgr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_ui_CryptUIDlgSelectCertificateFromStore(hcertstore: Long, hwnd: Long, pwsztitle: Long, pwszdisplaystring: Long, dwdontusecolumn: Int, dwflags: Int, pvreserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_ui_CryptUIDlgViewCertificateA(pcertviewinfo: Long, pfpropertieschanged: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_ui_CryptUIDlgViewCertificateW(pcertviewinfo: Long, pfpropertieschanged: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_ui_CryptUIDlgViewContext(dwcontexttype: Int, pvcontext: Long, hwnd: Long, pwsztitle: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_ui_CryptUIWizDigitalSign(dwflags: Int, hwndparent: Long, pwszwizardtitle: Long, pdigitalsigninfo: Long, ppsigncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_ui_CryptUIWizExport(dwflags: Int, hwndparent: Long, pwszwizardtitle: Long, pexportinfo: Long, pvoid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_ui_CryptUIWizFreeDigitalSignContext(psigncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_ui_CryptUIWizImport(dwflags: Int, hwndparent: Long, pwszwizardtitle: Long, pimportsrc: Long, hdestcertstore: Long): Int
}

public actual fun CertSelectionGetSerializedBlob(pcsi: Long, ppoutbuffer: Long, puloutbuffersize: Long): HRESULT =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssys_windows_win32_security_cryptography_ui_CertSelectionGetSerializedBlob(pcsi, ppoutbuffer, puloutbuffersize)

public actual fun CryptUIDlgCertMgr(pcryptuicertmgr: Long): BOOL =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssys_windows_win32_security_cryptography_ui_CryptUIDlgCertMgr(pcryptuicertmgr)

public actual fun CryptUIDlgSelectCertificateFromStore(hcertstore: HCERTSTORE, hwnd: HWND, pwsztitle: PCWSTR, pwszdisplaystring: PCWSTR, dwdontusecolumn: UInt, dwflags: UInt, pvreserved: Long): Long =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssys_windows_win32_security_cryptography_ui_CryptUIDlgSelectCertificateFromStore(hcertstore, hwnd, pwsztitle, pwszdisplaystring, dwdontusecolumn.toInt(), dwflags.toInt(), pvreserved)

public actual fun CryptUIDlgViewCertificateA(pcertviewinfo: Long, pfpropertieschanged: Long): BOOL =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssys_windows_win32_security_cryptography_ui_CryptUIDlgViewCertificateA(pcertviewinfo, pfpropertieschanged)

public actual fun CryptUIDlgViewCertificateW(pcertviewinfo: Long, pfpropertieschanged: Long): BOOL =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssys_windows_win32_security_cryptography_ui_CryptUIDlgViewCertificateW(pcertviewinfo, pfpropertieschanged)

public actual fun CryptUIDlgViewContext(dwcontexttype: UInt, pvcontext: Long, hwnd: HWND, pwsztitle: PCWSTR, dwflags: UInt, pvreserved: Long): BOOL =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssys_windows_win32_security_cryptography_ui_CryptUIDlgViewContext(dwcontexttype.toInt(), pvcontext, hwnd, pwsztitle, dwflags.toInt(), pvreserved)

public actual fun CryptUIWizDigitalSign(dwflags: UInt, hwndparent: HWND, pwszwizardtitle: PCWSTR, pdigitalsigninfo: Long, ppsigncontext: Long): BOOL =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssys_windows_win32_security_cryptography_ui_CryptUIWizDigitalSign(dwflags.toInt(), hwndparent, pwszwizardtitle, pdigitalsigninfo, ppsigncontext)

public actual fun CryptUIWizExport(dwflags: CRYPTUI_WIZ_FLAGS, hwndparent: HWND, pwszwizardtitle: PCWSTR, pexportinfo: Long, pvoid: Long): BOOL =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssys_windows_win32_security_cryptography_ui_CryptUIWizExport(dwflags.toInt(), hwndparent, pwszwizardtitle, pexportinfo, pvoid)

public actual fun CryptUIWizFreeDigitalSignContext(psigncontext: Long): BOOL =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssys_windows_win32_security_cryptography_ui_CryptUIWizFreeDigitalSignContext(psigncontext)

public actual fun CryptUIWizImport(dwflags: CRYPTUI_WIZ_FLAGS, hwndparent: HWND, pwszwizardtitle: PCWSTR, pimportsrc: Long, hdestcertstore: HCERTSTORE): BOOL =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssys_windows_win32_security_cryptography_ui_CryptUIWizImport(dwflags.toInt(), hwndparent, pwszwizardtitle, pimportsrc, hdestcertstore)
