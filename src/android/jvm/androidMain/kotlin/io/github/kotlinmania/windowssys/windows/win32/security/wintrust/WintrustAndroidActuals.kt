@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32SecurityWintrustJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SecurityWintrustOpenPersonalTrustDBDialog(hwndparent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityWintrustOpenPersonalTrustDBDialogEx(hwndparent: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityWintrustWTHelperCertCheckValidSignature(pprovdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityWintrustWTHelperCertIsSelfSigned(dwencoding: Int, pcert: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityWintrustWTHelperGetProvCertFromChain(psgnr: Long, idxcert: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityWintrustWTHelperGetProvPrivateDataFromChain(pprovdata: Long, pgproviderid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityWintrustWTHelperGetProvSignerFromChain(pprovdata: Long, idxsigner: Int, fcountersigner: Int, idxcountersigner: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityWintrustWTHelperProvDataFromStateData(hstatedata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityWintrustWinVerifyTrust(hwnd: Long, pgactionid: Long, pwvtdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityWintrustWinVerifyTrustEx(hwnd: Long, pgactionid: Long, pwintrustdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityWintrustWintrustAddActionID(pgactionid: Long, fdwflags: Int, psprovinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityWintrustWintrustAddDefaultForUsage(pszusageoid: Long, psdefusage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityWintrustWintrustGetDefaultForUsage(dwaction: Int, pszusageoid: Long, psusage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityWintrustWintrustGetRegPolicyFlags(pdwpolicyflags: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityWintrustWintrustLoadFunctionPointers(pgactionid: Long, ppfns: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityWintrustWintrustRemoveActionID(pgactionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityWintrustWintrustSetDefaultIncludePEPageHashes(fincludepepagehashes: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityWintrustWintrustSetRegPolicyFlags(dwpolicyflags: Int): Int
}

public actual fun openPersonalTrustDBDialog(hwndparent: Hwnd): Bool =
    WindowsWin32SecurityWintrustJniBridge.windowssysWindowsWin32SecurityWintrustOpenPersonalTrustDBDialog(hwndparent.rawAddress)

public actual fun openPersonalTrustDBDialogEx(hwndparent: Hwnd, dwflags: UInt, pvreserved: MutPtr<MutPtr<CVoid>>): Bool =
    WindowsWin32SecurityWintrustJniBridge.windowssysWindowsWin32SecurityWintrustOpenPersonalTrustDBDialogEx(hwndparent.rawAddress, dwflags.toInt(), pvreserved.rawAddress)

public actual fun wTHelperCertCheckValidSignature(pprovdata: MutPtr<CryptProviderData>): Hresult =
    WindowsWin32SecurityWintrustJniBridge.windowssysWindowsWin32SecurityWintrustWTHelperCertCheckValidSignature(pprovdata.rawAddress)

public actual fun wTHelperCertIsSelfSigned(dwencoding: UInt, pcert: MutPtr<CertInfo>): Bool =
    WindowsWin32SecurityWintrustJniBridge.windowssysWindowsWin32SecurityWintrustWTHelperCertIsSelfSigned(dwencoding.toInt(), pcert.rawAddress)

public actual fun wTHelperGetProvCertFromChain(psgnr: MutPtr<CryptProviderSgnr>, idxcert: UInt): MutPtr<CryptProviderCert> =
    MutPtr(WindowsWin32SecurityWintrustJniBridge.windowssysWindowsWin32SecurityWintrustWTHelperGetProvCertFromChain(psgnr.rawAddress, idxcert.toInt()))

public actual fun wTHelperGetProvPrivateDataFromChain(pprovdata: MutPtr<CryptProviderData>, pgproviderid: MutPtr<Guid>): MutPtr<CryptProviderPrivdata> =
    MutPtr(WindowsWin32SecurityWintrustJniBridge.windowssysWindowsWin32SecurityWintrustWTHelperGetProvPrivateDataFromChain(pprovdata.rawAddress, pgproviderid.rawAddress))

public actual fun wTHelperGetProvSignerFromChain(pprovdata: MutPtr<CryptProviderData>, idxsigner: UInt, fcountersigner: Bool, idxcountersigner: UInt): MutPtr<CryptProviderSgnr> =
    MutPtr(WindowsWin32SecurityWintrustJniBridge.windowssysWindowsWin32SecurityWintrustWTHelperGetProvSignerFromChain(pprovdata.rawAddress, idxsigner.toInt(), fcountersigner, idxcountersigner.toInt()))

public actual fun wTHelperProvDataFromStateData(hstatedata: Handle): MutPtr<CryptProviderData> =
    MutPtr(WindowsWin32SecurityWintrustJniBridge.windowssysWindowsWin32SecurityWintrustWTHelperProvDataFromStateData(hstatedata.rawAddress))

public actual fun winVerifyTrust(hwnd: Hwnd, pgactionid: MutPtr<Guid>, pwvtdata: MutPtr<CVoid>): Int =
    WindowsWin32SecurityWintrustJniBridge.windowssysWindowsWin32SecurityWintrustWinVerifyTrust(hwnd.rawAddress, pgactionid.rawAddress, pwvtdata.rawAddress)

public actual fun winVerifyTrustEx(hwnd: Hwnd, pgactionid: MutPtr<Guid>, pwintrustdata: MutPtr<WintrustData>): Int =
    WindowsWin32SecurityWintrustJniBridge.windowssysWindowsWin32SecurityWintrustWinVerifyTrustEx(hwnd.rawAddress, pgactionid.rawAddress, pwintrustdata.rawAddress)

public actual fun wintrustAddActionID(pgactionid: ConstPtr<Guid>, fdwflags: UInt, psprovinfo: ConstPtr<CryptRegisterActionid>): Bool =
    WindowsWin32SecurityWintrustJniBridge.windowssysWindowsWin32SecurityWintrustWintrustAddActionID(pgactionid.rawAddress, fdwflags.toInt(), psprovinfo.rawAddress)

public actual fun wintrustAddDefaultForUsage(pszusageoid: Pcstr, psdefusage: ConstPtr<CryptProviderRegdefusage>): Bool =
    WindowsWin32SecurityWintrustJniBridge.windowssysWindowsWin32SecurityWintrustWintrustAddDefaultForUsage(pszusageoid.rawAddress, psdefusage.rawAddress)

public actual fun wintrustGetDefaultForUsage(dwaction: WintrustGetDefaultForUsageAction, pszusageoid: Pcstr, psusage: MutPtr<CryptProviderDefusage>): Bool =
    WindowsWin32SecurityWintrustJniBridge.windowssysWindowsWin32SecurityWintrustWintrustGetDefaultForUsage(dwaction.toInt(), pszusageoid.rawAddress, psusage.rawAddress)

public actual fun wintrustGetRegPolicyFlags(pdwpolicyflags: MutPtr<WintrustPolicyFlags>) {
    WindowsWin32SecurityWintrustJniBridge.windowssysWindowsWin32SecurityWintrustWintrustGetRegPolicyFlags(pdwpolicyflags.rawAddress)
}

public actual fun wintrustLoadFunctionPointers(pgactionid: MutPtr<Guid>, ppfns: MutPtr<CryptProviderFunctions>): Bool =
    WindowsWin32SecurityWintrustJniBridge.windowssysWindowsWin32SecurityWintrustWintrustLoadFunctionPointers(pgactionid.rawAddress, ppfns.rawAddress)

public actual fun wintrustRemoveActionID(pgactionid: ConstPtr<Guid>): Bool =
    WindowsWin32SecurityWintrustJniBridge.windowssysWindowsWin32SecurityWintrustWintrustRemoveActionID(pgactionid.rawAddress)

public actual fun wintrustSetDefaultIncludePEPageHashes(fincludepepagehashes: Bool) {
    WindowsWin32SecurityWintrustJniBridge.windowssysWindowsWin32SecurityWintrustWintrustSetDefaultIncludePEPageHashes(fincludepepagehashes)
}

public actual fun wintrustSetRegPolicyFlags(dwpolicyflags: WintrustPolicyFlags): Bool =
    WindowsWin32SecurityWintrustJniBridge.windowssysWindowsWin32SecurityWintrustWintrustSetRegPolicyFlags(dwpolicyflags.toInt())
