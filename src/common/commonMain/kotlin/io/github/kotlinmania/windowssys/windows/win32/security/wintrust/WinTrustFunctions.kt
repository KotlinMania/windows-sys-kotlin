package io.github.kotlinmania.windowssys.windows.win32.security.wintrust

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public expect fun OpenPersonalTrustDBDialog(hwndparent: HWND): BOOL

public expect fun OpenPersonalTrustDBDialogEx(hwndparent: HWND, dwflags: UInt, pvreserved: Long): BOOL

public expect fun WTHelperCertCheckValidSignature(pprovdata: Long): HRESULT

public expect fun WTHelperCertIsSelfSigned(dwencoding: UInt, pcert: Long): BOOL

public expect fun WTHelperGetProvCertFromChain(psgnr: Long, idxcert: UInt): Long

public expect fun WTHelperGetProvPrivateDataFromChain(pprovdata: Long, pgproviderid: Long): Long

public expect fun WTHelperGetProvSignerFromChain(pprovdata: Long, idxsigner: UInt, fcountersigner: BOOL, idxcountersigner: UInt): Long

public expect fun WTHelperProvDataFromStateData(hstatedata: HANDLE): Long

public expect fun WinVerifyTrust(hwnd: HWND, pgactionid: Long, pwvtdata: Long): Int

public expect fun WinVerifyTrustEx(hwnd: HWND, pgactionid: Long, pwintrustdata: Long): Int

public expect fun WintrustAddActionID(pgactionid: Long, fdwflags: UInt, psprovinfo: Long): BOOL

public expect fun WintrustAddDefaultForUsage(pszusageoid: PCSTR, psdefusage: Long): BOOL

public expect fun WintrustGetDefaultForUsage(dwaction: WINTRUST_GET_DEFAULT_FOR_USAGE_ACTION, pszusageoid: PCSTR, psusage: Long): BOOL

public expect fun WintrustGetRegPolicyFlags(pdwpolicyflags: Long)

public expect fun WintrustLoadFunctionPointers(pgactionid: Long, ppfns: Long): BOOL

public expect fun WintrustRemoveActionID(pgactionid: Long): BOOL

public expect fun WintrustSetDefaultIncludePEPageHashes(fincludepepagehashes: BOOL)

public expect fun WintrustSetRegPolicyFlags(dwpolicyflags: WINTRUST_POLICY_FLAGS): BOOL
