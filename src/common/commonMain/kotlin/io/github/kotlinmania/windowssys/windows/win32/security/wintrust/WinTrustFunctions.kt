package io.github.kotlinmania.windowssys.windows.win32.security.wintrust

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun openPersonalTrustDBDialog(hwndparent: Hwnd): Bool

public expect fun openPersonalTrustDBDialogEx(hwndparent: Hwnd, dwflags: UInt, pvreserved: MutPtr): Bool

public expect fun wTHelperCertCheckValidSignature(pprovdata: MutPtr): Hresult

public expect fun wTHelperCertIsSelfSigned(dwencoding: UInt, pcert: MutPtr): Bool

public expect fun wTHelperGetProvCertFromChain(psgnr: MutPtr, idxcert: UInt): MutPtr

public expect fun wTHelperGetProvPrivateDataFromChain(pprovdata: MutPtr, pgproviderid: MutPtr): MutPtr

public expect fun wTHelperGetProvSignerFromChain(pprovdata: MutPtr, idxsigner: UInt, fcountersigner: Bool, idxcountersigner: UInt): MutPtr

public expect fun wTHelperProvDataFromStateData(hstatedata: Handle): MutPtr

public expect fun winVerifyTrust(hwnd: Hwnd, pgactionid: MutPtr, pwvtdata: MutPtr): Int

public expect fun winVerifyTrustEx(hwnd: Hwnd, pgactionid: MutPtr, pwintrustdata: MutPtr): Int

public expect fun wintrustAddActionID(pgactionid: ConstPtr, fdwflags: UInt, psprovinfo: ConstPtr): Bool

public expect fun wintrustAddDefaultForUsage(pszusageoid: Pcstr, psdefusage: ConstPtr): Bool

public expect fun wintrustGetDefaultForUsage(dwaction: WintrustGetDefaultForUsageAction, pszusageoid: Pcstr, psusage: MutPtr): Bool

public expect fun wintrustGetRegPolicyFlags(pdwpolicyflags: MutPtr)

public expect fun wintrustLoadFunctionPointers(pgactionid: MutPtr, ppfns: MutPtr): Bool

public expect fun wintrustRemoveActionID(pgactionid: ConstPtr): Bool

public expect fun wintrustSetDefaultIncludePEPageHashes(fincludepepagehashes: Bool)

public expect fun wintrustSetRegPolicyFlags(dwpolicyflags: WintrustPolicyFlags): Bool
