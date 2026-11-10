@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.Hcertstore

private object WindowsWin32SecurityCryptographyUiJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_ui_certSelectionGetSerializedBlob(pcsi: Long, ppoutbuffer: Long, puloutbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_ui_cryptUIDlgCertMgr(pcryptuicertmgr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_ui_cryptUIDlgSelectCertificateFromStore(hcertstore: Long, hwnd: Long, pwsztitle: Long, pwszdisplaystring: Long, dwdontusecolumn: Int, dwflags: Int, pvreserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_ui_cryptUIDlgViewCertificateA(pcertviewinfo: Long, pfpropertieschanged: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_ui_cryptUIDlgViewCertificateW(pcertviewinfo: Long, pfpropertieschanged: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_ui_cryptUIDlgViewContext(dwcontexttype: Int, pvcontext: Long, hwnd: Long, pwsztitle: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_ui_cryptUIWizDigitalSign(dwflags: Int, hwndparent: Long, pwszwizardtitle: Long, pdigitalsigninfo: Long, ppsigncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_ui_cryptUIWizExport(dwflags: Int, hwndparent: Long, pwszwizardtitle: Long, pexportinfo: Long, pvoid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_ui_cryptUIWizFreeDigitalSignContext(psigncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_ui_cryptUIWizImport(dwflags: Int, hwndparent: Long, pwszwizardtitle: Long, pimportsrc: Long, hdestcertstore: Long): Int
}

public actual fun certSelectionGetSerializedBlob(pcsi: COpaquePointer?, ppoutbuffer: COpaquePointer?, puloutbuffersize: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssys_windows_win32_security_cryptography_ui_certSelectionGetSerializedBlob((pcsi?.value ?: 0L), (ppoutbuffer?.value ?: 0L), (puloutbuffersize?.value ?: 0L))

public actual fun cryptUIDlgCertMgr(pcryptuicertmgr: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssys_windows_win32_security_cryptography_ui_cryptUIDlgCertMgr((pcryptuicertmgr?.value ?: 0L))

public actual fun cryptUIDlgSelectCertificateFromStore(hcertstore: Hcertstore, hwnd: Hwnd, pwsztitle: Pcwstr, pwszdisplaystring: Pcwstr, dwdontusecolumn: UInt, dwflags: UInt, pvreserved: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssys_windows_win32_security_cryptography_ui_cryptUIDlgSelectCertificateFromStore((hcertstore?.value ?: 0L), (hwnd?.value ?: 0L), (pwsztitle?.value ?: 0L), (pwszdisplaystring?.value ?: 0L), dwdontusecolumn.toInt(), dwflags.toInt(), (pvreserved?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptUIDlgViewCertificateA(pcertviewinfo: COpaquePointer?, pfpropertieschanged: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssys_windows_win32_security_cryptography_ui_cryptUIDlgViewCertificateA((pcertviewinfo?.value ?: 0L), (pfpropertieschanged?.value ?: 0L))

public actual fun cryptUIDlgViewCertificateW(pcertviewinfo: COpaquePointer?, pfpropertieschanged: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssys_windows_win32_security_cryptography_ui_cryptUIDlgViewCertificateW((pcertviewinfo?.value ?: 0L), (pfpropertieschanged?.value ?: 0L))

public actual fun cryptUIDlgViewContext(dwcontexttype: UInt, pvcontext: COpaquePointer?, hwnd: Hwnd, pwsztitle: Pcwstr, dwflags: UInt, pvreserved: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssys_windows_win32_security_cryptography_ui_cryptUIDlgViewContext(dwcontexttype.toInt(), (pvcontext?.value ?: 0L), (hwnd?.value ?: 0L), (pwsztitle?.value ?: 0L), dwflags.toInt(), (pvreserved?.value ?: 0L))

public actual fun cryptUIWizDigitalSign(dwflags: UInt, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pdigitalsigninfo: COpaquePointer?, ppsigncontext: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssys_windows_win32_security_cryptography_ui_cryptUIWizDigitalSign(dwflags.toInt(), (hwndparent?.value ?: 0L), (pwszwizardtitle?.value ?: 0L), (pdigitalsigninfo?.value ?: 0L), (ppsigncontext?.value ?: 0L))

public actual fun cryptUIWizExport(dwflags: CryptuiWizFlags, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pexportinfo: COpaquePointer?, pvoid: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssys_windows_win32_security_cryptography_ui_cryptUIWizExport(dwflags.toInt(), (hwndparent?.value ?: 0L), (pwszwizardtitle?.value ?: 0L), (pexportinfo?.value ?: 0L), (pvoid?.value ?: 0L))

public actual fun cryptUIWizFreeDigitalSignContext(psigncontext: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssys_windows_win32_security_cryptography_ui_cryptUIWizFreeDigitalSignContext((psigncontext?.value ?: 0L))

public actual fun cryptUIWizImport(dwflags: CryptuiWizFlags, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pimportsrc: COpaquePointer?, hdestcertstore: Hcertstore): Bool =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssys_windows_win32_security_cryptography_ui_cryptUIWizImport(dwflags.toInt(), (hwndparent?.value ?: 0L), (pwszwizardtitle?.value ?: 0L), (pimportsrc?.value ?: 0L), (hdestcertstore?.value ?: 0L))
