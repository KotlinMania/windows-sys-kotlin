@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.HCERTSTORE

public actual fun CertSelectionGetSerializedBlob(pcsi: Long, ppoutbuffer: Long, puloutbuffersize: Long): HRESULT =
    0

public actual fun CryptUIDlgCertMgr(pcryptuicertmgr: Long): BOOL =
    0

public actual fun CryptUIDlgSelectCertificateFromStore(hcertstore: HCERTSTORE, hwnd: HWND, pwsztitle: PCWSTR, pwszdisplaystring: PCWSTR, dwdontusecolumn: UInt, dwflags: UInt, pvreserved: Long): Long =
    0L

public actual fun CryptUIDlgViewCertificateA(pcertviewinfo: Long, pfpropertieschanged: Long): BOOL =
    0

public actual fun CryptUIDlgViewCertificateW(pcertviewinfo: Long, pfpropertieschanged: Long): BOOL =
    0

public actual fun CryptUIDlgViewContext(dwcontexttype: UInt, pvcontext: Long, hwnd: HWND, pwsztitle: PCWSTR, dwflags: UInt, pvreserved: Long): BOOL =
    0

public actual fun CryptUIWizDigitalSign(dwflags: UInt, hwndparent: HWND, pwszwizardtitle: PCWSTR, pdigitalsigninfo: Long, ppsigncontext: Long): BOOL =
    0

public actual fun CryptUIWizExport(dwflags: CRYPTUI_WIZ_FLAGS, hwndparent: HWND, pwszwizardtitle: PCWSTR, pexportinfo: Long, pvoid: Long): BOOL =
    0

public actual fun CryptUIWizFreeDigitalSignContext(psigncontext: Long): BOOL =
    0

public actual fun CryptUIWizImport(dwflags: CRYPTUI_WIZ_FLAGS, hwndparent: HWND, pwszwizardtitle: PCWSTR, pimportsrc: Long, hdestcertstore: HCERTSTORE): BOOL =
    0
