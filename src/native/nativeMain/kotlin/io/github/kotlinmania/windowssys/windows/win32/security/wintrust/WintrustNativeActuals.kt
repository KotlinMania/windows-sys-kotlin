@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.wintrust

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun OpenPersonalTrustDBDialog(hwndparent: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_OpenPersonalTrustDBDialog(hwndparent.toCPointer<ByteVar>())

public actual fun OpenPersonalTrustDBDialogEx(hwndparent: HWND, dwflags: UInt, pvreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_OpenPersonalTrustDBDialogEx(hwndparent.toCPointer<ByteVar>(), dwflags, pvreserved.toCPointer<ByteVar>())

public actual fun WTHelperCertCheckValidSignature(pprovdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_WTHelperCertCheckValidSignature(pprovdata.toCPointer<ByteVar>())

public actual fun WTHelperCertIsSelfSigned(dwencoding: UInt, pcert: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_WTHelperCertIsSelfSigned(dwencoding, pcert.toCPointer<ByteVar>())

public actual fun WTHelperGetProvCertFromChain(psgnr: Long, idxcert: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_WTHelperGetProvCertFromChain(psgnr.toCPointer<ByteVar>(), idxcert)?.toLong() ?: 0L

public actual fun WTHelperGetProvPrivateDataFromChain(pprovdata: Long, pgproviderid: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_WTHelperGetProvPrivateDataFromChain(pprovdata.toCPointer<ByteVar>(), pgproviderid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun WTHelperGetProvSignerFromChain(pprovdata: Long, idxsigner: UInt, fcountersigner: BOOL, idxcountersigner: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_WTHelperGetProvSignerFromChain(pprovdata.toCPointer<ByteVar>(), idxsigner, fcountersigner, idxcountersigner)?.toLong() ?: 0L

public actual fun WTHelperProvDataFromStateData(hstatedata: HANDLE): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_WTHelperProvDataFromStateData(hstatedata.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun WinVerifyTrust(hwnd: HWND, pgactionid: Long, pwvtdata: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_WinVerifyTrust(hwnd.toCPointer<ByteVar>(), pgactionid.toCPointer<ByteVar>(), pwvtdata.toCPointer<ByteVar>())

public actual fun WinVerifyTrustEx(hwnd: HWND, pgactionid: Long, pwintrustdata: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_WinVerifyTrustEx(hwnd.toCPointer<ByteVar>(), pgactionid.toCPointer<ByteVar>(), pwintrustdata.toCPointer<ByteVar>())

public actual fun WintrustAddActionID(pgactionid: Long, fdwflags: UInt, psprovinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_WintrustAddActionID(pgactionid.toCPointer<ByteVar>(), fdwflags, psprovinfo.toCPointer<ByteVar>())

public actual fun WintrustAddDefaultForUsage(pszusageoid: PCSTR, psdefusage: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_WintrustAddDefaultForUsage(pszusageoid.toCPointer<ByteVar>(), psdefusage.toCPointer<ByteVar>())

public actual fun WintrustGetDefaultForUsage(dwaction: WINTRUST_GET_DEFAULT_FOR_USAGE_ACTION, pszusageoid: PCSTR, psusage: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_WintrustGetDefaultForUsage(dwaction, pszusageoid.toCPointer<ByteVar>(), psusage.toCPointer<ByteVar>())

public actual fun WintrustGetRegPolicyFlags(pdwpolicyflags: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_WintrustGetRegPolicyFlags(pdwpolicyflags.toCPointer<ByteVar>())
}

public actual fun WintrustLoadFunctionPointers(pgactionid: Long, ppfns: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_WintrustLoadFunctionPointers(pgactionid.toCPointer<ByteVar>(), ppfns.toCPointer<ByteVar>())

public actual fun WintrustRemoveActionID(pgactionid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_WintrustRemoveActionID(pgactionid.toCPointer<ByteVar>())

public actual fun WintrustSetDefaultIncludePEPageHashes(fincludepepagehashes: BOOL) {
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_WintrustSetDefaultIncludePEPageHashes(fincludepepagehashes)
}

public actual fun WintrustSetRegPolicyFlags(dwpolicyflags: WINTRUST_POLICY_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.wintrust.cinterop.windowssys_windows_win32_security_wintrust_WintrustSetRegPolicyFlags(dwpolicyflags)
