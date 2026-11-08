package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.HCERTSTORE

public fun CertSelectionGetSerializedBlob(pcsi: Long, ppoutbuffer: Long, puloutbuffersize: Long): HRESULT {
    return Win32DynamicFfi.invoke("cryptui.dll", "CertSelectionGetSerializedBlob", longArrayOf(pcsi, ppoutbuffer, puloutbuffersize)).toInt()
}

public fun CryptUIDlgCertMgr(pcryptuicertmgr: Long): BOOL {
    return Win32DynamicFfi.invoke("cryptui.dll", "CryptUIDlgCertMgr", longArrayOf(pcryptuicertmgr)).toInt()
}

public fun CryptUIDlgSelectCertificateFromStore(hcertstore: HCERTSTORE, hwnd: HWND, pwsztitle: PCWSTR, pwszdisplaystring: PCWSTR, dwdontusecolumn: UInt, dwflags: UInt, pvreserved: Long): Long {
    return Win32DynamicFfi.invoke("cryptui.dll", "CryptUIDlgSelectCertificateFromStore", longArrayOf(hcertstore, hwnd, pwsztitle, pwszdisplaystring, dwdontusecolumn.toLong(), dwflags.toLong(), pvreserved))
}

public fun CryptUIDlgViewCertificateA(pcertviewinfo: Long, pfpropertieschanged: Long): BOOL {
    return Win32DynamicFfi.invoke("cryptui.dll", "CryptUIDlgViewCertificateA", longArrayOf(pcertviewinfo, pfpropertieschanged)).toInt()
}

public fun CryptUIDlgViewCertificateW(pcertviewinfo: Long, pfpropertieschanged: Long): BOOL {
    return Win32DynamicFfi.invoke("cryptui.dll", "CryptUIDlgViewCertificateW", longArrayOf(pcertviewinfo, pfpropertieschanged)).toInt()
}

public fun CryptUIDlgViewContext(dwcontexttype: UInt, pvcontext: Long, hwnd: HWND, pwsztitle: PCWSTR, dwflags: UInt, pvreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("cryptui.dll", "CryptUIDlgViewContext", longArrayOf(dwcontexttype.toLong(), pvcontext, hwnd, pwsztitle, dwflags.toLong(), pvreserved)).toInt()
}

public fun CryptUIWizDigitalSign(dwflags: UInt, hwndparent: HWND, pwszwizardtitle: PCWSTR, pdigitalsigninfo: Long, ppsigncontext: Long): BOOL {
    return Win32DynamicFfi.invoke("cryptui.dll", "CryptUIWizDigitalSign", longArrayOf(dwflags.toLong(), hwndparent, pwszwizardtitle, pdigitalsigninfo, ppsigncontext)).toInt()
}

public fun CryptUIWizExport(dwflags: CRYPTUI_WIZ_FLAGS, hwndparent: HWND, pwszwizardtitle: PCWSTR, pexportinfo: Long, pvoid: Long): BOOL {
    return Win32DynamicFfi.invoke("cryptui.dll", "CryptUIWizExport", longArrayOf(dwflags.toLong(), hwndparent, pwszwizardtitle, pexportinfo, pvoid)).toInt()
}

public fun CryptUIWizFreeDigitalSignContext(psigncontext: Long): BOOL {
    return Win32DynamicFfi.invoke("cryptui.dll", "CryptUIWizFreeDigitalSignContext", longArrayOf(psigncontext)).toInt()
}

public fun CryptUIWizImport(dwflags: CRYPTUI_WIZ_FLAGS, hwndparent: HWND, pwszwizardtitle: PCWSTR, pimportsrc: Long, hdestcertstore: HCERTSTORE): BOOL {
    return Win32DynamicFfi.invoke("cryptui.dll", "CryptUIWizImport", longArrayOf(dwflags.toLong(), hwndparent, pwszwizardtitle, pimportsrc, hdestcertstore)).toInt()
}
