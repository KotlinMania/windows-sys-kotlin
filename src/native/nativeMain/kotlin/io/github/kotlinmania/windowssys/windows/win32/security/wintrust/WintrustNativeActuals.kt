@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.wintrust

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun openPersonalTrustDBDialog(hwndparent: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_openPersonalTrustDBDialog(hwndparent?.value?.toCPointer<ByteVar>())

public actual fun openPersonalTrustDBDialogEx(hwndparent: Hwnd, dwflags: UInt, pvreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_openPersonalTrustDBDialogEx(hwndparent?.value?.toCPointer<ByteVar>(), dwflags, pvreserved?.value?.toCPointer<ByteVar>())

public actual fun wTHelperCertCheckValidSignature(pprovdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wTHelperCertCheckValidSignature(pprovdata?.value?.toCPointer<ByteVar>())

public actual fun wTHelperCertIsSelfSigned(dwencoding: UInt, pcert: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wTHelperCertIsSelfSigned(dwencoding, pcert?.value?.toCPointer<ByteVar>())

public actual fun wTHelperGetProvCertFromChain(psgnr: COpaquePointer?, idxcert: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wTHelperGetProvCertFromChain(psgnr?.value?.toCPointer<ByteVar>(), idxcert)?.let { COpaquePointer(it.toLong()) }

public actual fun wTHelperGetProvPrivateDataFromChain(pprovdata: COpaquePointer?, pgproviderid: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wTHelperGetProvPrivateDataFromChain(pprovdata?.value?.toCPointer<ByteVar>(), pgproviderid?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun wTHelperGetProvSignerFromChain(pprovdata: COpaquePointer?, idxsigner: UInt, fcountersigner: Bool, idxcountersigner: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wTHelperGetProvSignerFromChain(pprovdata?.value?.toCPointer<ByteVar>(), idxsigner, fcountersigner, idxcountersigner)?.let { COpaquePointer(it.toLong()) }

public actual fun wTHelperProvDataFromStateData(hstatedata: Handle): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wTHelperProvDataFromStateData(hstatedata?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun winVerifyTrust(hwnd: Hwnd, pgactionid: COpaquePointer?, pwvtdata: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_winVerifyTrust(hwnd?.value?.toCPointer<ByteVar>(), pgactionid?.value?.toCPointer<ByteVar>(), pwvtdata?.value?.toCPointer<ByteVar>())

public actual fun winVerifyTrustEx(hwnd: Hwnd, pgactionid: COpaquePointer?, pwintrustdata: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_winVerifyTrustEx(hwnd?.value?.toCPointer<ByteVar>(), pgactionid?.value?.toCPointer<ByteVar>(), pwintrustdata?.value?.toCPointer<ByteVar>())

public actual fun wintrustAddActionID(pgactionid: COpaquePointer?, fdwflags: UInt, psprovinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wintrustAddActionID(pgactionid?.value?.toCPointer<ByteVar>(), fdwflags, psprovinfo?.value?.toCPointer<ByteVar>())

public actual fun wintrustAddDefaultForUsage(pszusageoid: Pcstr, psdefusage: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wintrustAddDefaultForUsage(pszusageoid?.value?.toCPointer<ByteVar>(), psdefusage?.value?.toCPointer<ByteVar>())

public actual fun wintrustGetDefaultForUsage(dwaction: WintrustGetDefaultForUsageAction, pszusageoid: Pcstr, psusage: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wintrustGetDefaultForUsage(dwaction, pszusageoid?.value?.toCPointer<ByteVar>(), psusage?.value?.toCPointer<ByteVar>())

public actual fun wintrustGetRegPolicyFlags(pdwpolicyflags: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wintrustGetRegPolicyFlags(pdwpolicyflags?.value?.toCPointer<ByteVar>())
}

public actual fun wintrustLoadFunctionPointers(pgactionid: COpaquePointer?, ppfns: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wintrustLoadFunctionPointers(pgactionid?.value?.toCPointer<ByteVar>(), ppfns?.value?.toCPointer<ByteVar>())

public actual fun wintrustRemoveActionID(pgactionid: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wintrustRemoveActionID(pgactionid?.value?.toCPointer<ByteVar>())

public actual fun wintrustSetDefaultIncludePEPageHashes(fincludepepagehashes: Bool) {
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wintrustSetDefaultIncludePEPageHashes(fincludepepagehashes)
}

public actual fun wintrustSetRegPolicyFlags(dwpolicyflags: WintrustPolicyFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_wintrustSetRegPolicyFlags(dwpolicyflags)
