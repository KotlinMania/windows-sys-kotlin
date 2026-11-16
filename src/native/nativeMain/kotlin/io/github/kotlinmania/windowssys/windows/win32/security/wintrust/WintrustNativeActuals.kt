@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.wintrust

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
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

public actual fun openPersonalTrustDBDialogEx(hwndparent: Hwnd, dwflags: UInt, pvreserved: MutPtr): Bool =
    windowssysWindowsWin32SecurityWintrustOpenPersonalTrustDBDialogEx(hwndparent.rawAddress.toCPointer<ByteVar>(), dwflags, pvreserved.rawAddress.toCPointer<ByteVar>())

public actual fun wTHelperCertCheckValidSignature(pprovdata: MutPtr): Hresult =
    windowssysWindowsWin32SecurityWintrustWTHelperCertCheckValidSignature(pprovdata.rawAddress.toCPointer<ByteVar>())

public actual fun wTHelperCertIsSelfSigned(dwencoding: UInt, pcert: MutPtr): Bool =
    windowssysWindowsWin32SecurityWintrustWTHelperCertIsSelfSigned(dwencoding, pcert.rawAddress.toCPointer<ByteVar>())

public actual fun wTHelperGetProvCertFromChain(psgnr: MutPtr, idxcert: UInt): MutPtr =
    MutPtr(windowssysWindowsWin32SecurityWintrustWTHelperGetProvCertFromChain(psgnr.rawAddress.toCPointer<ByteVar>(), idxcert)?.toLong() ?: 0L)

public actual fun wTHelperGetProvPrivateDataFromChain(pprovdata: MutPtr, pgproviderid: MutPtr): MutPtr =
    MutPtr(windowssysWindowsWin32SecurityWintrustWTHelperGetProvPrivateDataFromChain(pprovdata.rawAddress.toCPointer<ByteVar>(), pgproviderid.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun wTHelperGetProvSignerFromChain(pprovdata: MutPtr, idxsigner: UInt, fcountersigner: Bool, idxcountersigner: UInt): MutPtr =
    MutPtr(windowssysWindowsWin32SecurityWintrustWTHelperGetProvSignerFromChain(pprovdata.rawAddress.toCPointer<ByteVar>(), idxsigner, fcountersigner, idxcountersigner)?.toLong() ?: 0L)

public actual fun wTHelperProvDataFromStateData(hstatedata: Handle): MutPtr =
    MutPtr(windowssysWindowsWin32SecurityWintrustWTHelperProvDataFromStateData(hstatedata.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun winVerifyTrust(hwnd: Hwnd, pgactionid: MutPtr, pwvtdata: MutPtr): Int =
    windowssysWindowsWin32SecurityWintrustWinVerifyTrust(hwnd.rawAddress.toCPointer<ByteVar>(), pgactionid.rawAddress.toCPointer<ByteVar>(), pwvtdata.rawAddress.toCPointer<ByteVar>())

public actual fun winVerifyTrustEx(hwnd: Hwnd, pgactionid: MutPtr, pwintrustdata: MutPtr): Int =
    windowssysWindowsWin32SecurityWintrustWinVerifyTrustEx(hwnd.rawAddress.toCPointer<ByteVar>(), pgactionid.rawAddress.toCPointer<ByteVar>(), pwintrustdata.rawAddress.toCPointer<ByteVar>())

public actual fun wintrustAddActionID(pgactionid: ConstPtr, fdwflags: UInt, psprovinfo: ConstPtr): Bool =
    windowssysWindowsWin32SecurityWintrustWintrustAddActionID(pgactionid.rawAddress.toCPointer<ByteVar>(), fdwflags, psprovinfo.rawAddress.toCPointer<ByteVar>())

public actual fun wintrustAddDefaultForUsage(pszusageoid: Pcstr, psdefusage: ConstPtr): Bool =
    windowssysWindowsWin32SecurityWintrustWintrustAddDefaultForUsage(pszusageoid.rawAddress.toCPointer<ByteVar>(), psdefusage.rawAddress.toCPointer<ByteVar>())

public actual fun wintrustGetDefaultForUsage(dwaction: WintrustGetDefaultForUsageAction, pszusageoid: Pcstr, psusage: MutPtr): Bool =
    windowssysWindowsWin32SecurityWintrustWintrustGetDefaultForUsage(dwaction, pszusageoid.rawAddress.toCPointer<ByteVar>(), psusage.rawAddress.toCPointer<ByteVar>())

public actual fun wintrustGetRegPolicyFlags(pdwpolicyflags: MutPtr) {
    windowssysWindowsWin32SecurityWintrustWintrustGetRegPolicyFlags(pdwpolicyflags.rawAddress.toCPointer<ByteVar>())
}

public actual fun wintrustLoadFunctionPointers(pgactionid: MutPtr, ppfns: MutPtr): Bool =
    windowssysWindowsWin32SecurityWintrustWintrustLoadFunctionPointers(pgactionid.rawAddress.toCPointer<ByteVar>(), ppfns.rawAddress.toCPointer<ByteVar>())

public actual fun wintrustRemoveActionID(pgactionid: ConstPtr): Bool =
    windowssysWindowsWin32SecurityWintrustWintrustRemoveActionID(pgactionid.rawAddress.toCPointer<ByteVar>())

public actual fun wintrustSetDefaultIncludePEPageHashes(fincludepepagehashes: Bool) {
    windowssysWindowsWin32SecurityWintrustWintrustSetDefaultIncludePEPageHashes(fincludepepagehashes)
}

public actual fun wintrustSetRegPolicyFlags(dwpolicyflags: WintrustPolicyFlags): Bool =
    windowssysWindowsWin32SecurityWintrustWintrustSetRegPolicyFlags(dwpolicyflags)
