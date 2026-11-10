@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.wintrust

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32SecurityWintrustJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_openPersonalTrustDBDialog(hwndparent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_openPersonalTrustDBDialogEx(hwndparent: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_wTHelperCertCheckValidSignature(pprovdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_wTHelperCertIsSelfSigned(dwencoding: Int, pcert: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_wTHelperGetProvCertFromChain(psgnr: Long, idxcert: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_wTHelperGetProvPrivateDataFromChain(pprovdata: Long, pgproviderid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_wTHelperGetProvSignerFromChain(pprovdata: Long, idxsigner: Int, fcountersigner: Int, idxcountersigner: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_wTHelperProvDataFromStateData(hstatedata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_winVerifyTrust(hwnd: Long, pgactionid: Long, pwvtdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_winVerifyTrustEx(hwnd: Long, pgactionid: Long, pwintrustdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_wintrustAddActionID(pgactionid: Long, fdwflags: Int, psprovinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_wintrustAddDefaultForUsage(pszusageoid: Long, psdefusage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_wintrustGetDefaultForUsage(dwaction: Int, pszusageoid: Long, psusage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_wintrustGetRegPolicyFlags(pdwpolicyflags: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_wintrustLoadFunctionPointers(pgactionid: Long, ppfns: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_wintrustRemoveActionID(pgactionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_wintrustSetDefaultIncludePEPageHashes(fincludepepagehashes: Int)

    @JvmStatic
    external fun windowssys_windows_win32_security_wintrust_wintrustSetRegPolicyFlags(dwpolicyflags: Int): Int
}

public actual fun openPersonalTrustDBDialog(hwndparent: Hwnd): Bool =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_openPersonalTrustDBDialog((hwndparent?.value ?: 0L))

public actual fun openPersonalTrustDBDialogEx(hwndparent: Hwnd, dwflags: UInt, pvreserved: COpaquePointer?): Bool =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_openPersonalTrustDBDialogEx((hwndparent?.value ?: 0L), dwflags.toInt(), (pvreserved?.value ?: 0L))

public actual fun wTHelperCertCheckValidSignature(pprovdata: COpaquePointer?): Hresult =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_wTHelperCertCheckValidSignature((pprovdata?.value ?: 0L))

public actual fun wTHelperCertIsSelfSigned(dwencoding: UInt, pcert: COpaquePointer?): Bool =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_wTHelperCertIsSelfSigned(dwencoding.toInt(), (pcert?.value ?: 0L))

public actual fun wTHelperGetProvCertFromChain(psgnr: COpaquePointer?, idxcert: UInt): COpaquePointer? =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_wTHelperGetProvCertFromChain((psgnr?.value ?: 0L), idxcert.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wTHelperGetProvPrivateDataFromChain(pprovdata: COpaquePointer?, pgproviderid: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_wTHelperGetProvPrivateDataFromChain((pprovdata?.value ?: 0L), (pgproviderid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wTHelperGetProvSignerFromChain(pprovdata: COpaquePointer?, idxsigner: UInt, fcountersigner: Bool, idxcountersigner: UInt): COpaquePointer? =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_wTHelperGetProvSignerFromChain((pprovdata?.value ?: 0L), idxsigner.toInt(), fcountersigner, idxcountersigner.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wTHelperProvDataFromStateData(hstatedata: Handle): COpaquePointer? =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_wTHelperProvDataFromStateData((hstatedata?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun winVerifyTrust(hwnd: Hwnd, pgactionid: COpaquePointer?, pwvtdata: COpaquePointer?): Int =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_winVerifyTrust((hwnd?.value ?: 0L), (pgactionid?.value ?: 0L), (pwvtdata?.value ?: 0L))

public actual fun winVerifyTrustEx(hwnd: Hwnd, pgactionid: COpaquePointer?, pwintrustdata: COpaquePointer?): Int =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_winVerifyTrustEx((hwnd?.value ?: 0L), (pgactionid?.value ?: 0L), (pwintrustdata?.value ?: 0L))

public actual fun wintrustAddActionID(pgactionid: COpaquePointer?, fdwflags: UInt, psprovinfo: COpaquePointer?): Bool =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_wintrustAddActionID((pgactionid?.value ?: 0L), fdwflags.toInt(), (psprovinfo?.value ?: 0L))

public actual fun wintrustAddDefaultForUsage(pszusageoid: Pcstr, psdefusage: COpaquePointer?): Bool =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_wintrustAddDefaultForUsage((pszusageoid?.value ?: 0L), (psdefusage?.value ?: 0L))

public actual fun wintrustGetDefaultForUsage(dwaction: WintrustGetDefaultForUsageAction, pszusageoid: Pcstr, psusage: COpaquePointer?): Bool =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_wintrustGetDefaultForUsage(dwaction.toInt(), (pszusageoid?.value ?: 0L), (psusage?.value ?: 0L))

public actual fun wintrustGetRegPolicyFlags(pdwpolicyflags: COpaquePointer?) {
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_wintrustGetRegPolicyFlags((pdwpolicyflags?.value ?: 0L))
}

public actual fun wintrustLoadFunctionPointers(pgactionid: COpaquePointer?, ppfns: COpaquePointer?): Bool =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_wintrustLoadFunctionPointers((pgactionid?.value ?: 0L), (ppfns?.value ?: 0L))

public actual fun wintrustRemoveActionID(pgactionid: COpaquePointer?): Bool =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_wintrustRemoveActionID((pgactionid?.value ?: 0L))

public actual fun wintrustSetDefaultIncludePEPageHashes(fincludepepagehashes: Bool) {
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_wintrustSetDefaultIncludePEPageHashes(fincludepepagehashes)
}

public actual fun wintrustSetRegPolicyFlags(dwpolicyflags: WintrustPolicyFlags): Bool =
    WindowsWin32SecurityWintrustJniBridge.windowssys_windows_win32_security_wintrust_wintrustSetRegPolicyFlags(dwpolicyflags.toInt())
