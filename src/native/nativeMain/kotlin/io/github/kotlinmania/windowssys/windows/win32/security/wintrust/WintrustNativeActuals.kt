@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.wintrust

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_openPersonalTrustDBDialog
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_openPersonalTrustDBDialogEx
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wTHelperCertCheckValidSignature
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wTHelperCertIsSelfSigned
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wTHelperGetProvCertFromChain
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wTHelperGetProvPrivateDataFromChain
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wTHelperGetProvSignerFromChain
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wTHelperProvDataFromStateData
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_winVerifyTrust
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_winVerifyTrustEx
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wintrustAddActionID
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wintrustAddDefaultForUsage
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wintrustGetDefaultForUsage
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wintrustGetRegPolicyFlags
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wintrustLoadFunctionPointers
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wintrustRemoveActionID
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wintrustSetDefaultIncludePEPageHashes
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wintrustSetRegPolicyFlags
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun openPersonalTrustDBDialog(hwndparent: Hwnd): Bool =
    windowssys_windows_win32_security_wintrust_openPersonalTrustDBDialog(hwndparent?.value?.toCPointer<ByteVar>())

public actual fun openPersonalTrustDBDialogEx(hwndparent: Hwnd, dwflags: UInt, pvreserved: COpaquePointer?): Bool =
    windowssys_windows_win32_security_wintrust_openPersonalTrustDBDialogEx(hwndparent?.value?.toCPointer<ByteVar>(), dwflags, pvreserved?.value?.toCPointer<ByteVar>())

public actual fun wTHelperCertCheckValidSignature(pprovdata: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_wintrust_wTHelperCertCheckValidSignature(pprovdata?.value?.toCPointer<ByteVar>())

public actual fun wTHelperCertIsSelfSigned(dwencoding: UInt, pcert: COpaquePointer?): Bool =
    windowssys_windows_win32_security_wintrust_wTHelperCertIsSelfSigned(dwencoding, pcert?.value?.toCPointer<ByteVar>())

public actual fun wTHelperGetProvCertFromChain(psgnr: COpaquePointer?, idxcert: UInt): COpaquePointer? =
    windowssys_windows_win32_security_wintrust_wTHelperGetProvCertFromChain(psgnr?.value?.toCPointer<ByteVar>(), idxcert)?.let { COpaquePointer(it.toLong()) }

public actual fun wTHelperGetProvPrivateDataFromChain(pprovdata: COpaquePointer?, pgproviderid: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_security_wintrust_wTHelperGetProvPrivateDataFromChain(pprovdata?.value?.toCPointer<ByteVar>(), pgproviderid?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun wTHelperGetProvSignerFromChain(pprovdata: COpaquePointer?, idxsigner: UInt, fcountersigner: Bool, idxcountersigner: UInt): COpaquePointer? =
    windowssys_windows_win32_security_wintrust_wTHelperGetProvSignerFromChain(pprovdata?.value?.toCPointer<ByteVar>(), idxsigner, fcountersigner, idxcountersigner)?.let { COpaquePointer(it.toLong()) }

public actual fun wTHelperProvDataFromStateData(hstatedata: Handle): COpaquePointer? =
    windowssys_windows_win32_security_wintrust_wTHelperProvDataFromStateData(hstatedata?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun winVerifyTrust(hwnd: Hwnd, pgactionid: COpaquePointer?, pwvtdata: COpaquePointer?): Int =
    windowssys_windows_win32_security_wintrust_winVerifyTrust(hwnd?.value?.toCPointer<ByteVar>(), pgactionid?.value?.toCPointer<ByteVar>(), pwvtdata?.value?.toCPointer<ByteVar>())

public actual fun winVerifyTrustEx(hwnd: Hwnd, pgactionid: COpaquePointer?, pwintrustdata: COpaquePointer?): Int =
    windowssys_windows_win32_security_wintrust_winVerifyTrustEx(hwnd?.value?.toCPointer<ByteVar>(), pgactionid?.value?.toCPointer<ByteVar>(), pwintrustdata?.value?.toCPointer<ByteVar>())

public actual fun wintrustAddActionID(pgactionid: COpaquePointer?, fdwflags: UInt, psprovinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_security_wintrust_wintrustAddActionID(pgactionid?.value?.toCPointer<ByteVar>(), fdwflags, psprovinfo?.value?.toCPointer<ByteVar>())

public actual fun wintrustAddDefaultForUsage(pszusageoid: Pcstr, psdefusage: COpaquePointer?): Bool =
    windowssys_windows_win32_security_wintrust_wintrustAddDefaultForUsage(pszusageoid?.value?.toCPointer<ByteVar>(), psdefusage?.value?.toCPointer<ByteVar>())

public actual fun wintrustGetDefaultForUsage(dwaction: WintrustGetDefaultForUsageAction, pszusageoid: Pcstr, psusage: COpaquePointer?): Bool =
    windowssys_windows_win32_security_wintrust_wintrustGetDefaultForUsage(dwaction, pszusageoid?.value?.toCPointer<ByteVar>(), psusage?.value?.toCPointer<ByteVar>())

public actual fun wintrustGetRegPolicyFlags(pdwpolicyflags: COpaquePointer?) {
    windowssys_windows_win32_security_wintrust_wintrustGetRegPolicyFlags(pdwpolicyflags?.value?.toCPointer<ByteVar>())
}

public actual fun wintrustLoadFunctionPointers(pgactionid: COpaquePointer?, ppfns: COpaquePointer?): Bool =
    windowssys_windows_win32_security_wintrust_wintrustLoadFunctionPointers(pgactionid?.value?.toCPointer<ByteVar>(), ppfns?.value?.toCPointer<ByteVar>())

public actual fun wintrustRemoveActionID(pgactionid: COpaquePointer?): Bool =
    windowssys_windows_win32_security_wintrust_wintrustRemoveActionID(pgactionid?.value?.toCPointer<ByteVar>())

public actual fun wintrustSetDefaultIncludePEPageHashes(fincludepepagehashes: Bool) {
    windowssys_windows_win32_security_wintrust_wintrustSetDefaultIncludePEPageHashes(fincludepepagehashes)
}

public actual fun wintrustSetRegPolicyFlags(dwpolicyflags: WintrustPolicyFlags): Bool =
    windowssys_windows_win32_security_wintrust_wintrustSetRegPolicyFlags(dwpolicyflags)
