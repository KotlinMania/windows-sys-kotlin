@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.wintrust

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private val _windowsWin32SecurityWintrustNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun openPersonalTrustDBDialog(hwndparent: Hwnd): Bool =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_openPersonalTrustDBDialog((hwndparent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPersonalTrustDBDialogEx(hwndparent: Hwnd, dwflags: UInt, pvreserved: COpaquePointer?): Bool =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_openPersonalTrustDBDialogEx((hwndparent?.value ?: 0L).toString(), dwflags.toInt(), (pvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTHelperCertCheckValidSignature(pprovdata: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_wTHelperCertCheckValidSignature((pprovdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTHelperCertIsSelfSigned(dwencoding: UInt, pcert: COpaquePointer?): Bool =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_wTHelperCertIsSelfSigned(dwencoding.toInt(), (pcert?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTHelperGetProvCertFromChain(psgnr: COpaquePointer?, idxcert: UInt): COpaquePointer? =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_wTHelperGetProvCertFromChain((psgnr?.value ?: 0L).toString(), idxcert.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTHelperGetProvPrivateDataFromChain(pprovdata: COpaquePointer?, pgproviderid: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_wTHelperGetProvPrivateDataFromChain((pprovdata?.value ?: 0L).toString(), (pgproviderid?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTHelperGetProvSignerFromChain(pprovdata: COpaquePointer?, idxsigner: UInt, fcountersigner: Bool, idxcountersigner: UInt): COpaquePointer? =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_wTHelperGetProvSignerFromChain((pprovdata?.value ?: 0L).toString(), idxsigner.toInt(), fcountersigner, idxcountersigner.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTHelperProvDataFromStateData(hstatedata: Handle): COpaquePointer? =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_wTHelperProvDataFromStateData((hstatedata?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winVerifyTrust(hwnd: Hwnd, pgactionid: COpaquePointer?, pwvtdata: COpaquePointer?): Int =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_winVerifyTrust((hwnd?.value ?: 0L).toString(), (pgactionid?.value ?: 0L).toString(), (pwvtdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winVerifyTrustEx(hwnd: Hwnd, pgactionid: COpaquePointer?, pwintrustdata: COpaquePointer?): Int =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_winVerifyTrustEx((hwnd?.value ?: 0L).toString(), (pgactionid?.value ?: 0L).toString(), (pwintrustdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wintrustAddActionID(pgactionid: COpaquePointer?, fdwflags: UInt, psprovinfo: COpaquePointer?): Bool =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_wintrustAddActionID((pgactionid?.value ?: 0L).toString(), fdwflags.toInt(), (psprovinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wintrustAddDefaultForUsage(pszusageoid: Pcstr, psdefusage: COpaquePointer?): Bool =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_wintrustAddDefaultForUsage((pszusageoid?.value ?: 0L).toString(), (psdefusage?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wintrustGetDefaultForUsage(dwaction: WintrustGetDefaultForUsageAction, pszusageoid: Pcstr, psusage: COpaquePointer?): Bool =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_wintrustGetDefaultForUsage(dwaction.toInt(), (pszusageoid?.value ?: 0L).toString(), (psusage?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wintrustGetRegPolicyFlags(pdwpolicyflags: COpaquePointer?) {
    if (_windowsWin32SecurityWintrustNapiAddon != null) {
        _windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_wintrustGetRegPolicyFlags((pdwpolicyflags?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wintrustLoadFunctionPointers(pgactionid: COpaquePointer?, ppfns: COpaquePointer?): Bool =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_wintrustLoadFunctionPointers((pgactionid?.value ?: 0L).toString(), (ppfns?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wintrustRemoveActionID(pgactionid: COpaquePointer?): Bool =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_wintrustRemoveActionID((pgactionid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wintrustSetDefaultIncludePEPageHashes(fincludepepagehashes: Bool) {
    if (_windowsWin32SecurityWintrustNapiAddon != null) {
        _windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_wintrustSetDefaultIncludePEPageHashes(fincludepepagehashes)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wintrustSetRegPolicyFlags(dwpolicyflags: WintrustPolicyFlags): Bool =
    if (_windowsWin32SecurityWintrustNapiAddon != null) (_windowsWin32SecurityWintrustNapiAddon.windowssys_windows_win32_security_wintrust_wintrustSetRegPolicyFlags(dwpolicyflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
