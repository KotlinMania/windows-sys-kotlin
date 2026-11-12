package io.github.kotlinmania.windowssys.windows.win32.security.wintrust

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertInfo

public expect fun openPersonalTrustDBDialog(hwndparent: Hwnd): Bool

public expect fun openPersonalTrustDBDialogEx(hwndparent: Hwnd, dwflags: UInt, pvreserved: MutPtr<MutPtr<CVoid>>): Bool

public expect fun wTHelperCertCheckValidSignature(pprovdata: MutPtr<CryptProviderData>): Hresult

public expect fun wTHelperCertIsSelfSigned(dwencoding: UInt, pcert: MutPtr<CertInfo>): Bool

public expect fun wTHelperGetProvCertFromChain(psgnr: MutPtr<CryptProviderSgnr>, idxcert: UInt): MutPtr<CryptProviderCert>

public expect fun wTHelperGetProvPrivateDataFromChain(pprovdata: MutPtr<CryptProviderData>, pgproviderid: MutPtr<Guid>): MutPtr<CryptProviderPrivdata>

public expect fun wTHelperGetProvSignerFromChain(pprovdata: MutPtr<CryptProviderData>, idxsigner: UInt, fcountersigner: Bool, idxcountersigner: UInt): MutPtr<CryptProviderSgnr>

public expect fun wTHelperProvDataFromStateData(hstatedata: Handle): MutPtr<CryptProviderData>

public expect fun winVerifyTrust(hwnd: Hwnd, pgactionid: MutPtr<Guid>, pwvtdata: MutPtr<CVoid>): Int

public expect fun winVerifyTrustEx(hwnd: Hwnd, pgactionid: MutPtr<Guid>, pwintrustdata: MutPtr<WintrustData>): Int

public expect fun wintrustAddActionID(pgactionid: ConstPtr<Guid>, fdwflags: UInt, psprovinfo: ConstPtr<CryptRegisterActionid>): Bool

public expect fun wintrustAddDefaultForUsage(pszusageoid: Pcstr, psdefusage: ConstPtr<CryptProviderRegdefusage>): Bool

public expect fun wintrustGetDefaultForUsage(dwaction: WintrustGetDefaultForUsageAction, pszusageoid: Pcstr, psusage: MutPtr<CryptProviderDefusage>): Bool

public expect fun wintrustGetRegPolicyFlags(pdwpolicyflags: MutPtr<WintrustPolicyFlags>)

public expect fun wintrustLoadFunctionPointers(pgactionid: MutPtr<Guid>, ppfns: MutPtr<CryptProviderFunctions>): Bool

public expect fun wintrustRemoveActionID(pgactionid: ConstPtr<Guid>): Bool

public expect fun wintrustSetDefaultIncludePEPageHashes(fincludepepagehashes: Bool)

public expect fun wintrustSetRegPolicyFlags(dwpolicyflags: WintrustPolicyFlags): Bool
