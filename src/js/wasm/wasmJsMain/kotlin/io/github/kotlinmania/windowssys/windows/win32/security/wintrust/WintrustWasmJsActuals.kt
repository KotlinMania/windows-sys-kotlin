@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.wintrust

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public actual fun OpenPersonalTrustDBDialog(hwndparent: HWND): BOOL =
    0

public actual fun OpenPersonalTrustDBDialogEx(hwndparent: HWND, dwflags: UInt, pvreserved: Long): BOOL =
    0

public actual fun WTHelperCertCheckValidSignature(pprovdata: Long): HRESULT =
    0

public actual fun WTHelperCertIsSelfSigned(dwencoding: UInt, pcert: Long): BOOL =
    0

public actual fun WTHelperGetProvCertFromChain(psgnr: Long, idxcert: UInt): Long =
    0L

public actual fun WTHelperGetProvPrivateDataFromChain(pprovdata: Long, pgproviderid: Long): Long =
    0L

public actual fun WTHelperGetProvSignerFromChain(pprovdata: Long, idxsigner: UInt, fcountersigner: BOOL, idxcountersigner: UInt): Long =
    0L

public actual fun WTHelperProvDataFromStateData(hstatedata: HANDLE): Long =
    0L

public actual fun WinVerifyTrust(hwnd: HWND, pgactionid: Long, pwvtdata: Long): Int =
    0

public actual fun WinVerifyTrustEx(hwnd: HWND, pgactionid: Long, pwintrustdata: Long): Int =
    0

public actual fun WintrustAddActionID(pgactionid: Long, fdwflags: UInt, psprovinfo: Long): BOOL =
    0

public actual fun WintrustAddDefaultForUsage(pszusageoid: PCSTR, psdefusage: Long): BOOL =
    0

public actual fun WintrustGetDefaultForUsage(dwaction: WINTRUST_GET_DEFAULT_FOR_USAGE_ACTION, pszusageoid: PCSTR, psusage: Long): BOOL =
    0

public actual fun WintrustGetRegPolicyFlags(pdwpolicyflags: Long) {
}

public actual fun WintrustLoadFunctionPointers(pgactionid: Long, ppfns: Long): BOOL =
    0

public actual fun WintrustRemoveActionID(pgactionid: Long): BOOL =
    0

public actual fun WintrustSetDefaultIncludePEPageHashes(fincludepepagehashes: BOOL) {
}

public actual fun WintrustSetRegPolicyFlags(dwpolicyflags: WINTRUST_POLICY_FLAGS): BOOL =
    0
