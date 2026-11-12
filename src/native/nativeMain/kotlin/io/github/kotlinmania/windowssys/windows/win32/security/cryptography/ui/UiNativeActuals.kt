@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.Hcertstore
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssysWindowsWin32SecurityCryptographyUiCertSelectionGetSerializedBlob
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgCertMgr
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgSelectCertificateFromStore
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewCertificateA
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewCertificateW
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssysWindowsWin32SecurityCryptographyUiCryptUIWizDigitalSign
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssysWindowsWin32SecurityCryptographyUiCryptUIWizExport
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssysWindowsWin32SecurityCryptographyUiCryptUIWizFreeDigitalSignContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui.cinterop.windowssysWindowsWin32SecurityCryptographyUiCryptUIWizImport
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun certSelectionGetSerializedBlob(pcsi: ConstPtr, ppoutbuffer: MutPtr, puloutbuffersize: MutPtr): Hresult =
    windowssysWindowsWin32SecurityCryptographyUiCertSelectionGetSerializedBlob(pcsi.rawAddress.toCPointer<ByteVar>(), ppoutbuffer.rawAddress.toCPointer<ByteVar>(), puloutbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun cryptUIDlgCertMgr(pcryptuicertmgr: ConstPtr): Bool =
    windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgCertMgr(pcryptuicertmgr.rawAddress.toCPointer<ByteVar>())

public actual fun cryptUIDlgSelectCertificateFromStore(hcertstore: Hcertstore, hwnd: Hwnd, pwsztitle: Pcwstr, pwszdisplaystring: Pcwstr, dwdontusecolumn: UInt, dwflags: UInt, pvreserved: ConstPtr): MutPtr =
    MutPtr(windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgSelectCertificateFromStore(hcertstore.rawAddress.toCPointer<ByteVar>(), hwnd.rawAddress.toCPointer<ByteVar>(), pwsztitle.rawAddress.toCPointer<ByteVar>(), pwszdisplaystring.rawAddress.toCPointer<ByteVar>(), dwdontusecolumn, dwflags, pvreserved.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun cryptUIDlgViewCertificateA(pcertviewinfo: ConstPtr, pfpropertieschanged: MutPtr): Bool =
    windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewCertificateA(pcertviewinfo.rawAddress.toCPointer<ByteVar>(), pfpropertieschanged.rawAddress.toCPointer<ByteVar>())

public actual fun cryptUIDlgViewCertificateW(pcertviewinfo: ConstPtr, pfpropertieschanged: MutPtr): Bool =
    windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewCertificateW(pcertviewinfo.rawAddress.toCPointer<ByteVar>(), pfpropertieschanged.rawAddress.toCPointer<ByteVar>())

public actual fun cryptUIDlgViewContext(dwcontexttype: UInt, pvcontext: ConstPtr, hwnd: Hwnd, pwsztitle: Pcwstr, dwflags: UInt, pvreserved: ConstPtr): Bool =
    windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewContext(dwcontexttype, pvcontext.rawAddress.toCPointer<ByteVar>(), hwnd.rawAddress.toCPointer<ByteVar>(), pwsztitle.rawAddress.toCPointer<ByteVar>(), dwflags, pvreserved.rawAddress.toCPointer<ByteVar>())

public actual fun cryptUIWizDigitalSign(dwflags: UInt, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pdigitalsigninfo: ConstPtr, ppsigncontext: MutPtr): Bool =
    windowssysWindowsWin32SecurityCryptographyUiCryptUIWizDigitalSign(dwflags, hwndparent.rawAddress.toCPointer<ByteVar>(), pwszwizardtitle.rawAddress.toCPointer<ByteVar>(), pdigitalsigninfo.rawAddress.toCPointer<ByteVar>(), ppsigncontext.rawAddress.toCPointer<ByteVar>())

public actual fun cryptUIWizExport(dwflags: CryptuiWizFlags, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pexportinfo: ConstPtr, pvoid: ConstPtr): Bool =
    windowssysWindowsWin32SecurityCryptographyUiCryptUIWizExport(dwflags, hwndparent.rawAddress.toCPointer<ByteVar>(), pwszwizardtitle.rawAddress.toCPointer<ByteVar>(), pexportinfo.rawAddress.toCPointer<ByteVar>(), pvoid.rawAddress.toCPointer<ByteVar>())

public actual fun cryptUIWizFreeDigitalSignContext(psigncontext: ConstPtr): Bool =
    windowssysWindowsWin32SecurityCryptographyUiCryptUIWizFreeDigitalSignContext(psigncontext.rawAddress.toCPointer<ByteVar>())

public actual fun cryptUIWizImport(dwflags: CryptuiWizFlags, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pimportsrc: ConstPtr, hdestcertstore: Hcertstore): Bool =
    windowssysWindowsWin32SecurityCryptographyUiCryptUIWizImport(dwflags, hwndparent.rawAddress.toCPointer<ByteVar>(), pwszwizardtitle.rawAddress.toCPointer<ByteVar>(), pimportsrc.rawAddress.toCPointer<ByteVar>(), hdestcertstore.rawAddress.toCPointer<ByteVar>())
