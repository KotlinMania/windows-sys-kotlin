@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssysWindowsWin32SecurityWintrustOpenPersonalTrustDBDialog
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssysWindowsWin32SecurityWintrustOpenPersonalTrustDBDialogEx
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssysWindowsWin32SecurityWintrustWTHelperCertCheckValidSignature
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssysWindowsWin32SecurityWintrustWTHelperCertIsSelfSigned
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssysWindowsWin32SecurityWintrustWTHelperGetProvCertFromChain
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssysWindowsWin32SecurityWintrustWTHelperGetProvPrivateDataFromChain
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssysWindowsWin32SecurityWintrustWTHelperGetProvSignerFromChain
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssysWindowsWin32SecurityWintrustWTHelperProvDataFromStateData
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssysWindowsWin32SecurityWintrustWinVerifyTrust
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssysWindowsWin32SecurityWintrustWinVerifyTrustEx
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssysWindowsWin32SecurityWintrustWintrustAddActionID
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssysWindowsWin32SecurityWintrustWintrustAddDefaultForUsage
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssysWindowsWin32SecurityWintrustWintrustGetDefaultForUsage
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssysWindowsWin32SecurityWintrustWintrustGetRegPolicyFlags
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssysWindowsWin32SecurityWintrustWintrustLoadFunctionPointers
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssysWindowsWin32SecurityWintrustWintrustRemoveActionID
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssysWindowsWin32SecurityWintrustWintrustSetDefaultIncludePEPageHashes
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssysWindowsWin32SecurityWintrustWintrustSetRegPolicyFlags
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun openPersonalTrustDBDialog(hwndparent: Hwnd): Bool =
    windowssysWindowsWin32SecurityWintrustOpenPersonalTrustDBDialog(hwndparent.rawAddress.toCPointer<ByteVar>())

public actual fun openPersonalTrustDBDialogEx(hwndparent: Hwnd, dwflags: UInt, pvreserved: MutPtr<MutPtr<CVoid>>): Bool =
    windowssysWindowsWin32SecurityWintrustOpenPersonalTrustDBDialogEx(hwndparent.rawAddress.toCPointer<ByteVar>(), dwflags, pvreserved.rawAddress.toCPointer<ByteVar>())

public actual fun wTHelperCertCheckValidSignature(pprovdata: MutPtr<CryptProviderData>): Hresult =
    windowssysWindowsWin32SecurityWintrustWTHelperCertCheckValidSignature(pprovdata.rawAddress.toCPointer<ByteVar>())

public actual fun wTHelperCertIsSelfSigned(dwencoding: UInt, pcert: MutPtr<CertInfo>): Bool =
    windowssysWindowsWin32SecurityWintrustWTHelperCertIsSelfSigned(dwencoding, pcert.rawAddress.toCPointer<ByteVar>())

public actual fun wTHelperGetProvCertFromChain(psgnr: MutPtr<CryptProviderSgnr>, idxcert: UInt): MutPtr<CryptProviderCert> =
    MutPtr(windowssysWindowsWin32SecurityWintrustWTHelperGetProvCertFromChain(psgnr.rawAddress.toCPointer<ByteVar>(), idxcert)?.toLong() ?: 0L)

public actual fun wTHelperGetProvPrivateDataFromChain(pprovdata: MutPtr<CryptProviderData>, pgproviderid: MutPtr<Guid>): MutPtr<CryptProviderPrivdata> =
    MutPtr(windowssysWindowsWin32SecurityWintrustWTHelperGetProvPrivateDataFromChain(pprovdata.rawAddress.toCPointer<ByteVar>(), pgproviderid.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun wTHelperGetProvSignerFromChain(pprovdata: MutPtr<CryptProviderData>, idxsigner: UInt, fcountersigner: Bool, idxcountersigner: UInt): MutPtr<CryptProviderSgnr> =
    MutPtr(windowssysWindowsWin32SecurityWintrustWTHelperGetProvSignerFromChain(pprovdata.rawAddress.toCPointer<ByteVar>(), idxsigner, fcountersigner, idxcountersigner)?.toLong() ?: 0L)

public actual fun wTHelperProvDataFromStateData(hstatedata: Handle): MutPtr<CryptProviderData> =
    MutPtr(windowssysWindowsWin32SecurityWintrustWTHelperProvDataFromStateData(hstatedata.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun winVerifyTrust(hwnd: Hwnd, pgactionid: MutPtr<Guid>, pwvtdata: MutPtr<CVoid>): Int =
    windowssysWindowsWin32SecurityWintrustWinVerifyTrust(hwnd.rawAddress.toCPointer<ByteVar>(), pgactionid.rawAddress.toCPointer<ByteVar>(), pwvtdata.rawAddress.toCPointer<ByteVar>())

public actual fun winVerifyTrustEx(hwnd: Hwnd, pgactionid: MutPtr<Guid>, pwintrustdata: MutPtr<WintrustData>): Int =
    windowssysWindowsWin32SecurityWintrustWinVerifyTrustEx(hwnd.rawAddress.toCPointer<ByteVar>(), pgactionid.rawAddress.toCPointer<ByteVar>(), pwintrustdata.rawAddress.toCPointer<ByteVar>())

public actual fun wintrustAddActionID(pgactionid: ConstPtr<Guid>, fdwflags: UInt, psprovinfo: ConstPtr<CryptRegisterActionid>): Bool =
    windowssysWindowsWin32SecurityWintrustWintrustAddActionID(pgactionid.rawAddress.toCPointer<ByteVar>(), fdwflags, psprovinfo.rawAddress.toCPointer<ByteVar>())

public actual fun wintrustAddDefaultForUsage(pszusageoid: Pcstr, psdefusage: ConstPtr<CryptProviderRegdefusage>): Bool =
    windowssysWindowsWin32SecurityWintrustWintrustAddDefaultForUsage(pszusageoid.rawAddress.toCPointer<ByteVar>(), psdefusage.rawAddress.toCPointer<ByteVar>())

public actual fun wintrustGetDefaultForUsage(dwaction: WintrustGetDefaultForUsageAction, pszusageoid: Pcstr, psusage: MutPtr<CryptProviderDefusage>): Bool =
    windowssysWindowsWin32SecurityWintrustWintrustGetDefaultForUsage(dwaction, pszusageoid.rawAddress.toCPointer<ByteVar>(), psusage.rawAddress.toCPointer<ByteVar>())

public actual fun wintrustGetRegPolicyFlags(pdwpolicyflags: MutPtr<WintrustPolicyFlags>) {
    windowssysWindowsWin32SecurityWintrustWintrustGetRegPolicyFlags(pdwpolicyflags.rawAddress.toCPointer<ByteVar>())
}

public actual fun wintrustLoadFunctionPointers(pgactionid: MutPtr<Guid>, ppfns: MutPtr<CryptProviderFunctions>): Bool =
    windowssysWindowsWin32SecurityWintrustWintrustLoadFunctionPointers(pgactionid.rawAddress.toCPointer<ByteVar>(), ppfns.rawAddress.toCPointer<ByteVar>())

public actual fun wintrustRemoveActionID(pgactionid: ConstPtr<Guid>): Bool =
    windowssysWindowsWin32SecurityWintrustWintrustRemoveActionID(pgactionid.rawAddress.toCPointer<ByteVar>())

public actual fun wintrustSetDefaultIncludePEPageHashes(fincludepepagehashes: Bool) {
    windowssysWindowsWin32SecurityWintrustWintrustSetDefaultIncludePEPageHashes(fincludepepagehashes)
}

public actual fun wintrustSetRegPolicyFlags(dwpolicyflags: WintrustPolicyFlags): Bool =
    windowssysWindowsWin32SecurityWintrustWintrustSetRegPolicyFlags(dwpolicyflags)
