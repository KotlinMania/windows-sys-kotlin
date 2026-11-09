@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.wintrust

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private object WindowsWin32SecurityWintrustJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_OpenPersonalTrustDBDialog(hwndparent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_OpenPersonalTrustDBDialogEx(hwndparent: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_WTHelperCertCheckValidSignature(pprovdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_WTHelperCertIsSelfSigned(dwencoding: Int, pcert: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_WTHelperGetProvCertFromChain(psgnr: Long, idxcert: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_WTHelperGetProvPrivateDataFromChain(pprovdata: Long, pgproviderid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_WTHelperGetProvSignerFromChain(pprovdata: Long, idxsigner: Int, fcountersigner: Int, idxcountersigner: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_WTHelperProvDataFromStateData(hstatedata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_WinVerifyTrust(hwnd: Long, pgactionid: Long, pwvtdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_WinVerifyTrustEx(hwnd: Long, pgactionid: Long, pwintrustdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_WintrustAddActionID(pgactionid: Long, fdwflags: Int, psprovinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_WintrustAddDefaultForUsage(pszusageoid: Long, psdefusage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_WintrustGetDefaultForUsage(dwaction: Int, pszusageoid: Long, psusage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_WintrustGetRegPolicyFlags(pdwpolicyflags: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_WintrustLoadFunctionPointers(pgactionid: Long, ppfns: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_WintrustRemoveActionID(pgactionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_WintrustSetDefaultIncludePEPageHashes(fincludepepagehashes: Int)

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_WintrustSetRegPolicyFlags(dwpolicyflags: Int): Int
}

public actual fun OpenPersonalTrustDBDialog(hwndparent: HWND): BOOL =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_OpenPersonalTrustDBDialog(hwndparent)

public actual fun OpenPersonalTrustDBDialogEx(hwndparent: HWND, dwflags: UInt, pvreserved: Long): BOOL =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_OpenPersonalTrustDBDialogEx(hwndparent, dwflags.toInt(), pvreserved)

public actual fun WTHelperCertCheckValidSignature(pprovdata: Long): HRESULT =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_WTHelperCertCheckValidSignature(pprovdata)

public actual fun WTHelperCertIsSelfSigned(dwencoding: UInt, pcert: Long): BOOL =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_WTHelperCertIsSelfSigned(dwencoding.toInt(), pcert)

public actual fun WTHelperGetProvCertFromChain(psgnr: Long, idxcert: UInt): Long =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_WTHelperGetProvCertFromChain(psgnr, idxcert.toInt())

public actual fun WTHelperGetProvPrivateDataFromChain(pprovdata: Long, pgproviderid: Long): Long =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_WTHelperGetProvPrivateDataFromChain(pprovdata, pgproviderid)

public actual fun WTHelperGetProvSignerFromChain(pprovdata: Long, idxsigner: UInt, fcountersigner: BOOL, idxcountersigner: UInt): Long =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_WTHelperGetProvSignerFromChain(pprovdata, idxsigner.toInt(), fcountersigner, idxcountersigner.toInt())

public actual fun WTHelperProvDataFromStateData(hstatedata: HANDLE): Long =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_WTHelperProvDataFromStateData(hstatedata)

public actual fun WinVerifyTrust(hwnd: HWND, pgactionid: Long, pwvtdata: Long): Int =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_WinVerifyTrust(hwnd, pgactionid, pwvtdata)

public actual fun WinVerifyTrustEx(hwnd: HWND, pgactionid: Long, pwintrustdata: Long): Int =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_WinVerifyTrustEx(hwnd, pgactionid, pwintrustdata)

public actual fun WintrustAddActionID(pgactionid: Long, fdwflags: UInt, psprovinfo: Long): BOOL =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_WintrustAddActionID(pgactionid, fdwflags.toInt(), psprovinfo)

public actual fun WintrustAddDefaultForUsage(pszusageoid: PCSTR, psdefusage: Long): BOOL =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_WintrustAddDefaultForUsage(pszusageoid, psdefusage)

public actual fun WintrustGetDefaultForUsage(dwaction: WINTRUST_GET_DEFAULT_FOR_USAGE_ACTION, pszusageoid: PCSTR, psusage: Long): BOOL =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_WintrustGetDefaultForUsage(dwaction.toInt(), pszusageoid, psusage)

public actual fun WintrustGetRegPolicyFlags(pdwpolicyflags: Long) {
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_WintrustGetRegPolicyFlags(pdwpolicyflags)
}

public actual fun WintrustLoadFunctionPointers(pgactionid: Long, ppfns: Long): BOOL =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_WintrustLoadFunctionPointers(pgactionid, ppfns)

public actual fun WintrustRemoveActionID(pgactionid: Long): BOOL =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_WintrustRemoveActionID(pgactionid)

public actual fun WintrustSetDefaultIncludePEPageHashes(fincludepepagehashes: BOOL) {
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_WintrustSetDefaultIncludePEPageHashes(fincludepepagehashes)
}

public actual fun WintrustSetRegPolicyFlags(dwpolicyflags: WINTRUST_POLICY_FLAGS): BOOL =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_WintrustSetRegPolicyFlags(dwpolicyflags.toInt())
