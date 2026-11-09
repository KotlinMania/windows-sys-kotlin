@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.wintrust

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private val _windowsWin32SecurityWintrustNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun OpenPersonalTrustDBDialog(hwndparent: HWND): BOOL =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_OpenPersonalTrustDBDialog(hwndparent.toString()) as Int) else 0

public actual fun OpenPersonalTrustDBDialogEx(hwndparent: HWND, dwflags: UInt, pvreserved: Long): BOOL =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_OpenPersonalTrustDBDialogEx(hwndparent.toString(), dwflags.toInt(), pvreserved.toString()) as Int) else 0

public actual fun WTHelperCertCheckValidSignature(pprovdata: Long): HRESULT =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_WTHelperCertCheckValidSignature(pprovdata.toString()) as Int) else 0

public actual fun WTHelperCertIsSelfSigned(dwencoding: UInt, pcert: Long): BOOL =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_WTHelperCertIsSelfSigned(dwencoding.toInt(), pcert.toString()) as Int) else 0

public actual fun WTHelperGetProvCertFromChain(psgnr: Long, idxcert: UInt): Long =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_WTHelperGetProvCertFromChain(psgnr.toString(), idxcert.toInt()) as String).toLong() else 0L

public actual fun WTHelperGetProvPrivateDataFromChain(pprovdata: Long, pgproviderid: Long): Long =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_WTHelperGetProvPrivateDataFromChain(pprovdata.toString(), pgproviderid.toString()) as String).toLong() else 0L

public actual fun WTHelperGetProvSignerFromChain(pprovdata: Long, idxsigner: UInt, fcountersigner: BOOL, idxcountersigner: UInt): Long =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_WTHelperGetProvSignerFromChain(pprovdata.toString(), idxsigner.toInt(), fcountersigner, idxcountersigner.toInt()) as String).toLong() else 0L

public actual fun WTHelperProvDataFromStateData(hstatedata: HANDLE): Long =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_WTHelperProvDataFromStateData(hstatedata.toString()) as String).toLong() else 0L

public actual fun WinVerifyTrust(hwnd: HWND, pgactionid: Long, pwvtdata: Long): Int =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_WinVerifyTrust(hwnd.toString(), pgactionid.toString(), pwvtdata.toString()) as Int) else 0

public actual fun WinVerifyTrustEx(hwnd: HWND, pgactionid: Long, pwintrustdata: Long): Int =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_WinVerifyTrustEx(hwnd.toString(), pgactionid.toString(), pwintrustdata.toString()) as Int) else 0

public actual fun WintrustAddActionID(pgactionid: Long, fdwflags: UInt, psprovinfo: Long): BOOL =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_WintrustAddActionID(pgactionid.toString(), fdwflags.toInt(), psprovinfo.toString()) as Int) else 0

public actual fun WintrustAddDefaultForUsage(pszusageoid: PCSTR, psdefusage: Long): BOOL =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_WintrustAddDefaultForUsage(pszusageoid.toString(), psdefusage.toString()) as Int) else 0

public actual fun WintrustGetDefaultForUsage(dwaction: WINTRUST_GET_DEFAULT_FOR_USAGE_ACTION, pszusageoid: PCSTR, psusage: Long): BOOL =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_WintrustGetDefaultForUsage(dwaction.toInt(), pszusageoid.toString(), psusage.toString()) as Int) else 0

public actual fun WintrustGetRegPolicyFlags(pdwpolicyflags: Long) {
    if (_windowsWin32SecurityWintrustNapiAddon != null) {
        _windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_WintrustGetRegPolicyFlags(pdwpolicyflags.toString())
    }
}

public actual fun WintrustLoadFunctionPointers(pgactionid: Long, ppfns: Long): BOOL =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_WintrustLoadFunctionPointers(pgactionid.toString(), ppfns.toString()) as Int) else 0

public actual fun WintrustRemoveActionID(pgactionid: Long): BOOL =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_WintrustRemoveActionID(pgactionid.toString()) as Int) else 0

public actual fun WintrustSetDefaultIncludePEPageHashes(fincludepepagehashes: BOOL) {
    if (_windowsWin32SecurityWintrustNapiAddon != null) {
        _windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_WintrustSetDefaultIncludePEPageHashes(fincludepepagehashes)
    }
}

public actual fun WintrustSetRegPolicyFlags(dwpolicyflags: WINTRUST_POLICY_FLAGS): BOOL =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_WintrustSetRegPolicyFlags(dwpolicyflags.toInt()) as Int) else 0
