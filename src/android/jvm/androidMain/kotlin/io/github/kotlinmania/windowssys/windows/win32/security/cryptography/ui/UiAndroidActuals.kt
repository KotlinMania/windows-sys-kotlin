@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
    external fun windowssysWindowsWin32SecurityCryptographyUiCertSelectionGetSerializedBlob(pcsi: Long, ppoutbuffer: Long, puloutbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgCertMgr(pcryptuicertmgr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgSelectCertificateFromStore(hcertstore: Long, hwnd: Long, pwsztitle: Long, pwszdisplaystring: Long, dwdontusecolumn: Int, dwflags: Int, pvreserved: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewCertificateA(pcertviewinfo: Long, pfpropertieschanged: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewCertificateW(pcertviewinfo: Long, pfpropertieschanged: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewContext(dwcontexttype: Int, pvcontext: Long, hwnd: Long, pwsztitle: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyUiCryptUIWizDigitalSign(dwflags: Int, hwndparent: Long, pwszwizardtitle: Long, pdigitalsigninfo: Long, ppsigncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyUiCryptUIWizExport(dwflags: Int, hwndparent: Long, pwszwizardtitle: Long, pexportinfo: Long, pvoid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyUiCryptUIWizFreeDigitalSignContext(psigncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyUiCryptUIWizImport(dwflags: Int, hwndparent: Long, pwszwizardtitle: Long, pimportsrc: Long, hdestcertstore: Long): Int
}

public actual fun certSelectionGetSerializedBlob(pcsi: ConstPtr, ppoutbuffer: MutPtr, puloutbuffersize: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssysWindowsWin32SecurityCryptographyUiCertSelectionGetSerializedBlob(pcsi.rawAddress, ppoutbuffer.rawAddress, puloutbuffersize.rawAddress)

public actual fun cryptUIDlgCertMgr(pcryptuicertmgr: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgCertMgr(pcryptuicertmgr.rawAddress)

public actual fun cryptUIDlgSelectCertificateFromStore(hcertstore: Hcertstore, hwnd: Hwnd, pwsztitle: Pcwstr, pwszdisplaystring: Pcwstr, dwdontusecolumn: UInt, dwflags: UInt, pvreserved: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyUiJniBridge.windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgSelectCertificateFromStore(hcertstore.rawAddress, hwnd.rawAddress, pwsztitle.rawAddress, pwszdisplaystring.rawAddress, dwdontusecolumn.toInt(), dwflags.toInt(), pvreserved.rawAddress))

public actual fun cryptUIDlgViewCertificateA(pcertviewinfo: ConstPtr, pfpropertieschanged: MutPtr): Bool =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewCertificateA(pcertviewinfo.rawAddress, pfpropertieschanged.rawAddress)

public actual fun cryptUIDlgViewCertificateW(pcertviewinfo: ConstPtr, pfpropertieschanged: MutPtr): Bool =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewCertificateW(pcertviewinfo.rawAddress, pfpropertieschanged.rawAddress)

public actual fun cryptUIDlgViewContext(dwcontexttype: UInt, pvcontext: ConstPtr, hwnd: Hwnd, pwsztitle: Pcwstr, dwflags: UInt, pvreserved: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewContext(dwcontexttype.toInt(), pvcontext.rawAddress, hwnd.rawAddress, pwsztitle.rawAddress, dwflags.toInt(), pvreserved.rawAddress)

public actual fun cryptUIWizDigitalSign(dwflags: UInt, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pdigitalsigninfo: ConstPtr, ppsigncontext: MutPtr): Bool =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssysWindowsWin32SecurityCryptographyUiCryptUIWizDigitalSign(dwflags.toInt(), hwndparent.rawAddress, pwszwizardtitle.rawAddress, pdigitalsigninfo.rawAddress, ppsigncontext.rawAddress)

public actual fun cryptUIWizExport(dwflags: CryptuiWizFlags, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pexportinfo: ConstPtr, pvoid: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssysWindowsWin32SecurityCryptographyUiCryptUIWizExport(dwflags.toInt(), hwndparent.rawAddress, pwszwizardtitle.rawAddress, pexportinfo.rawAddress, pvoid.rawAddress)

public actual fun cryptUIWizFreeDigitalSignContext(psigncontext: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssysWindowsWin32SecurityCryptographyUiCryptUIWizFreeDigitalSignContext(psigncontext.rawAddress)

public actual fun cryptUIWizImport(dwflags: CryptuiWizFlags, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pimportsrc: ConstPtr, hdestcertstore: Hcertstore): Bool =
    WindowsWin32SecurityCryptographyUiJniBridge.windowssysWindowsWin32SecurityCryptographyUiCryptUIWizImport(dwflags.toInt(), hwndparent.rawAddress, pwszwizardtitle.rawAddress, pimportsrc.rawAddress, hdestcertstore.rawAddress)
