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

public expect fun certSelectionGetSerializedBlob(pcsi: ConstPtr<CertSelectuiInput>, ppoutbuffer: MutPtr<MutPtr<CVoid>>, puloutbuffersize: MutPtr<UInt>): Hresult

public expect fun cryptUIDlgCertMgr(pcryptuicertmgr: ConstPtr<CryptuiCertMgrStruct>): Bool

public expect fun cryptUIDlgSelectCertificateFromStore(hcertstore: Hcertstore, hwnd: Hwnd, pwsztitle: Pcwstr, pwszdisplaystring: Pcwstr, dwdontusecolumn: UInt, dwflags: UInt, pvreserved: ConstPtr<CVoid>): MutPtr<CertContext>

public expect fun cryptUIDlgViewCertificateA(pcertviewinfo: ConstPtr<CryptuiViewcertificateStructa>, pfpropertieschanged: MutPtr<Bool>): Bool

public expect fun cryptUIDlgViewCertificateW(pcertviewinfo: ConstPtr<CryptuiViewcertificateStructw>, pfpropertieschanged: MutPtr<Bool>): Bool

public expect fun cryptUIDlgViewContext(dwcontexttype: UInt, pvcontext: ConstPtr<CVoid>, hwnd: Hwnd, pwsztitle: Pcwstr, dwflags: UInt, pvreserved: ConstPtr<CVoid>): Bool

public expect fun cryptUIWizDigitalSign(dwflags: UInt, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pdigitalsigninfo: ConstPtr<CryptuiWizDigitalSignInfo>, ppsigncontext: MutPtr<MutPtr<CryptuiWizDigitalSignContext>>): Bool

public expect fun cryptUIWizExport(dwflags: CryptuiWizFlags, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pexportinfo: ConstPtr<CryptuiWizExportInfo>, pvoid: ConstPtr<CVoid>): Bool

public expect fun cryptUIWizFreeDigitalSignContext(psigncontext: ConstPtr<CryptuiWizDigitalSignContext>): Bool

public expect fun cryptUIWizImport(dwflags: CryptuiWizFlags, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pimportsrc: ConstPtr<CryptuiWizImportSrcInfo>, hdestcertstore: Hcertstore): Bool
