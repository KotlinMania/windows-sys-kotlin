package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.HCERTSTORE

public expect fun CertSelectionGetSerializedBlob(pcsi: Long, ppoutbuffer: Long, puloutbuffersize: Long): HRESULT

public expect fun CryptUIDlgCertMgr(pcryptuicertmgr: Long): BOOL

public expect fun CryptUIDlgSelectCertificateFromStore(hcertstore: HCERTSTORE, hwnd: HWND, pwsztitle: PCWSTR, pwszdisplaystring: PCWSTR, dwdontusecolumn: UInt, dwflags: UInt, pvreserved: Long): Long

public expect fun CryptUIDlgViewCertificateA(pcertviewinfo: Long, pfpropertieschanged: Long): BOOL

public expect fun CryptUIDlgViewCertificateW(pcertviewinfo: Long, pfpropertieschanged: Long): BOOL

public expect fun CryptUIDlgViewContext(dwcontexttype: UInt, pvcontext: Long, hwnd: HWND, pwsztitle: PCWSTR, dwflags: UInt, pvreserved: Long): BOOL

public expect fun CryptUIWizDigitalSign(dwflags: UInt, hwndparent: HWND, pwszwizardtitle: PCWSTR, pdigitalsigninfo: Long, ppsigncontext: Long): BOOL

public expect fun CryptUIWizExport(dwflags: CRYPTUI_WIZ_FLAGS, hwndparent: HWND, pwszwizardtitle: PCWSTR, pexportinfo: Long, pvoid: Long): BOOL

public expect fun CryptUIWizFreeDigitalSignContext(psigncontext: Long): BOOL

public expect fun CryptUIWizImport(dwflags: CRYPTUI_WIZ_FLAGS, hwndparent: HWND, pwszwizardtitle: PCWSTR, pimportsrc: Long, hdestcertstore: HCERTSTORE): BOOL
