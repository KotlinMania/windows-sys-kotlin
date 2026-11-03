package io.github.kotlinmania.windowssys.windows.win32.security.wintrust

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR

public fun OpenPersonalTrustDBDialog(hwndparent: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "OpenPersonalTrustDBDialog", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent))).toInt()
}

public fun OpenPersonalTrustDBDialogEx(hwndparent: Foundation.HWND, dwflags: UInt, pvreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "OpenPersonalTrustDBDialogEx", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), dwflags.toLong(), pvreserved)).toInt()
}

public fun WTHelperCertCheckValidSignature(pprovdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("wintrust.dll", "WTHelperCertCheckValidSignature", longArrayOf(pprovdata)).toInt()
}

public fun WTHelperCertIsSelfSigned(dwencoding: UInt, pcert: Long): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "WTHelperCertIsSelfSigned", longArrayOf(dwencoding.toLong(), pcert)).toInt()
}

public fun WTHelperGetProvCertFromChain(psgnr: Long, idxcert: UInt): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "WTHelperGetProvCertFromChain", longArrayOf(psgnr, idxcert.toLong()))
}

public fun WTHelperGetProvPrivateDataFromChain(pprovdata: Long, pgproviderid: Long): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "WTHelperGetProvPrivateDataFromChain", longArrayOf(pprovdata, pgproviderid))
}

public fun WTHelperGetProvSignerFromChain(pprovdata: Long, idxsigner: UInt, fcountersigner: BOOL, idxcountersigner: UInt): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "WTHelperGetProvSignerFromChain", longArrayOf(pprovdata, idxsigner.toLong(), fcountersigner.toLong(), idxcountersigner.toLong()))
}

public fun WTHelperProvDataFromStateData(hstatedata: Foundation.HANDLE): Long {
    return Win32DynamicFfi.invoke("wintrust.dll", "WTHelperProvDataFromStateData", longArrayOf(Win32DynamicFfi.objectSlot(hstatedata)))
}

public fun WinVerifyTrust(hwnd: Foundation.HWND, pgactionid: Long, pwvtdata: Long): Int {
    return Win32DynamicFfi.invoke("wintrust.dll", "WinVerifyTrust", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pgactionid, pwvtdata)).toInt()
}

public fun WinVerifyTrustEx(hwnd: Foundation.HWND, pgactionid: Long, pwintrustdata: Long): Int {
    return Win32DynamicFfi.invoke("wintrust.dll", "WinVerifyTrustEx", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pgactionid, pwintrustdata)).toInt()
}

public fun WintrustAddActionID(pgactionid: Long, fdwflags: UInt, psprovinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "WintrustAddActionID", longArrayOf(pgactionid, fdwflags.toLong(), psprovinfo)).toInt()
}

public fun WintrustAddDefaultForUsage(pszusageoid: PCSTR, psdefusage: Long): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "WintrustAddDefaultForUsage", longArrayOf(pszusageoid, psdefusage)).toInt()
}

public fun WintrustGetDefaultForUsage(dwaction: WINTRUST_GET_DEFAULT_FOR_USAGE_ACTION, pszusageoid: PCSTR, psusage: Long): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "WintrustGetDefaultForUsage", longArrayOf(dwaction.toLong(), pszusageoid, psusage)).toInt()
}

public fun WintrustGetRegPolicyFlags(pdwpolicyflags: Long) {
    Win32DynamicFfi.invoke("wintrust.dll", "WintrustGetRegPolicyFlags", longArrayOf(pdwpolicyflags))
}

public fun WintrustLoadFunctionPointers(pgactionid: Long, ppfns: Long): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "WintrustLoadFunctionPointers", longArrayOf(pgactionid, ppfns)).toInt()
}

public fun WintrustRemoveActionID(pgactionid: Long): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "WintrustRemoveActionID", longArrayOf(pgactionid)).toInt()
}

public fun WintrustSetDefaultIncludePEPageHashes(fincludepepagehashes: BOOL) {
    Win32DynamicFfi.invoke("wintrust.dll", "WintrustSetDefaultIncludePEPageHashes", longArrayOf(fincludepepagehashes.toLong()))
}

public fun WintrustSetRegPolicyFlags(dwpolicyflags: WINTRUST_POLICY_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("wintrust.dll", "WintrustSetRegPolicyFlags", longArrayOf(dwpolicyflags.toLong())).toInt()
}
