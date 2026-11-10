package io.github.kotlinmania.windowssys.windows.win32.security.wintrust

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun openPersonalTrustDBDialog(hwndparent: Hwnd): Bool

public expect fun openPersonalTrustDBDialogEx(hwndparent: Hwnd, dwflags: UInt, pvreserved: COpaquePointer?): Bool

public expect fun wTHelperCertCheckValidSignature(pprovdata: COpaquePointer?): Hresult

public expect fun wTHelperCertIsSelfSigned(dwencoding: UInt, pcert: COpaquePointer?): Bool

public expect fun wTHelperGetProvCertFromChain(psgnr: COpaquePointer?, idxcert: UInt): COpaquePointer?

public expect fun wTHelperGetProvPrivateDataFromChain(pprovdata: COpaquePointer?, pgproviderid: COpaquePointer?): COpaquePointer?

public expect fun wTHelperGetProvSignerFromChain(pprovdata: COpaquePointer?, idxsigner: UInt, fcountersigner: Bool, idxcountersigner: UInt): COpaquePointer?

public expect fun wTHelperProvDataFromStateData(hstatedata: Handle): COpaquePointer?

public expect fun winVerifyTrust(hwnd: Hwnd, pgactionid: COpaquePointer?, pwvtdata: COpaquePointer?): Int

public expect fun winVerifyTrustEx(hwnd: Hwnd, pgactionid: COpaquePointer?, pwintrustdata: COpaquePointer?): Int

public expect fun wintrustAddActionID(pgactionid: COpaquePointer?, fdwflags: UInt, psprovinfo: COpaquePointer?): Bool

public expect fun wintrustAddDefaultForUsage(pszusageoid: Pcstr, psdefusage: COpaquePointer?): Bool

public expect fun wintrustGetDefaultForUsage(dwaction: WintrustGetDefaultForUsageAction, pszusageoid: Pcstr, psusage: COpaquePointer?): Bool

public expect fun wintrustGetRegPolicyFlags(pdwpolicyflags: COpaquePointer?)

public expect fun wintrustLoadFunctionPointers(pgactionid: COpaquePointer?, ppfns: COpaquePointer?): Bool

public expect fun wintrustRemoveActionID(pgactionid: COpaquePointer?): Bool

public expect fun wintrustSetDefaultIncludePEPageHashes(fincludepepagehashes: Bool)

public expect fun wintrustSetRegPolicyFlags(dwpolicyflags: WintrustPolicyFlags): Bool
