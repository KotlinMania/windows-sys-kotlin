package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.Hcertstore

public expect fun certSelectionGetSerializedBlob(pcsi: ConstPtr, ppoutbuffer: MutPtr, puloutbuffersize: MutPtr): Hresult

public expect fun cryptUIDlgCertMgr(pcryptuicertmgr: ConstPtr): Bool

public expect fun cryptUIDlgSelectCertificateFromStore(hcertstore: Hcertstore, hwnd: Hwnd, pwsztitle: Pcwstr, pwszdisplaystring: Pcwstr, dwdontusecolumn: UInt, dwflags: UInt, pvreserved: ConstPtr): MutPtr

public expect fun cryptUIDlgViewCertificateA(pcertviewinfo: ConstPtr, pfpropertieschanged: MutPtr): Bool

public expect fun cryptUIDlgViewCertificateW(pcertviewinfo: ConstPtr, pfpropertieschanged: MutPtr): Bool

public expect fun cryptUIDlgViewContext(dwcontexttype: UInt, pvcontext: ConstPtr, hwnd: Hwnd, pwsztitle: Pcwstr, dwflags: UInt, pvreserved: ConstPtr): Bool

public expect fun cryptUIWizDigitalSign(dwflags: UInt, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pdigitalsigninfo: ConstPtr, ppsigncontext: MutPtr): Bool

public expect fun cryptUIWizExport(dwflags: CryptuiWizFlags, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pexportinfo: ConstPtr, pvoid: ConstPtr): Bool

public expect fun cryptUIWizFreeDigitalSignContext(psigncontext: ConstPtr): Bool

public expect fun cryptUIWizImport(dwflags: CryptuiWizFlags, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pimportsrc: ConstPtr, hdestcertstore: Hcertstore): Bool
