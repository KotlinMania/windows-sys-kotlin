@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.wintrust

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private val windowsWin32SecurityWintrustNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun openPersonalTrustDBDialog(hwndparent: Hwnd): Bool =
    if (windowsWin32SecurityWintrustNapiAddon != null) (windowsWin32SecurityWintrustNapiAddon.windowssysWindowsWin32SecurityWintrustOpenPersonalTrustDBDialog(hwndparent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPersonalTrustDBDialogEx(hwndparent: Hwnd, dwflags: UInt, pvreserved: MutPtr): Bool =
    if (windowsWin32SecurityWintrustNapiAddon != null) (windowsWin32SecurityWintrustNapiAddon.windowssysWindowsWin32SecurityWintrustOpenPersonalTrustDBDialogEx(hwndparent.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTHelperCertCheckValidSignature(pprovdata: MutPtr): Hresult =
    if (windowsWin32SecurityWintrustNapiAddon != null) (windowsWin32SecurityWintrustNapiAddon.windowssysWindowsWin32SecurityWintrustWTHelperCertCheckValidSignature(pprovdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTHelperCertIsSelfSigned(dwencoding: UInt, pcert: MutPtr): Bool =
    if (windowsWin32SecurityWintrustNapiAddon != null) (windowsWin32SecurityWintrustNapiAddon.windowssysWindowsWin32SecurityWintrustWTHelperCertIsSelfSigned(dwencoding.toInt(), pcert.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTHelperGetProvCertFromChain(psgnr: MutPtr, idxcert: UInt): MutPtr =
    if (windowsWin32SecurityWintrustNapiAddon != null) MutPtr((windowsWin32SecurityWintrustNapiAddon.windowssysWindowsWin32SecurityWintrustWTHelperGetProvCertFromChain(psgnr.rawAddress.toString(), idxcert.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTHelperGetProvPrivateDataFromChain(pprovdata: MutPtr, pgproviderid: MutPtr): MutPtr =
    if (windowsWin32SecurityWintrustNapiAddon != null) MutPtr((windowsWin32SecurityWintrustNapiAddon.windowssysWindowsWin32SecurityWintrustWTHelperGetProvPrivateDataFromChain(pprovdata.rawAddress.toString(), pgproviderid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTHelperGetProvSignerFromChain(pprovdata: MutPtr, idxsigner: UInt, fcountersigner: Bool, idxcountersigner: UInt): MutPtr =
    if (windowsWin32SecurityWintrustNapiAddon != null) MutPtr((windowsWin32SecurityWintrustNapiAddon.windowssysWindowsWin32SecurityWintrustWTHelperGetProvSignerFromChain(pprovdata.rawAddress.toString(), idxsigner.toInt(), fcountersigner, idxcountersigner.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTHelperProvDataFromStateData(hstatedata: Handle): MutPtr =
    if (windowsWin32SecurityWintrustNapiAddon != null) MutPtr((windowsWin32SecurityWintrustNapiAddon.windowssysWindowsWin32SecurityWintrustWTHelperProvDataFromStateData(hstatedata.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winVerifyTrust(hwnd: Hwnd, pgactionid: MutPtr, pwvtdata: MutPtr): Int =
    if (windowsWin32SecurityWintrustNapiAddon != null) (windowsWin32SecurityWintrustNapiAddon.windowssysWindowsWin32SecurityWintrustWinVerifyTrust(hwnd.rawAddress.toString(), pgactionid.rawAddress.toString(), pwvtdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winVerifyTrustEx(hwnd: Hwnd, pgactionid: MutPtr, pwintrustdata: MutPtr): Int =
    if (windowsWin32SecurityWintrustNapiAddon != null) (windowsWin32SecurityWintrustNapiAddon.windowssysWindowsWin32SecurityWintrustWinVerifyTrustEx(hwnd.rawAddress.toString(), pgactionid.rawAddress.toString(), pwintrustdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wintrustAddActionID(pgactionid: ConstPtr, fdwflags: UInt, psprovinfo: ConstPtr): Bool =
    if (windowsWin32SecurityWintrustNapiAddon != null) (windowsWin32SecurityWintrustNapiAddon.windowssysWindowsWin32SecurityWintrustWintrustAddActionID(pgactionid.rawAddress.toString(), fdwflags.toInt(), psprovinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wintrustAddDefaultForUsage(pszusageoid: Pcstr, psdefusage: ConstPtr): Bool =
    if (windowsWin32SecurityWintrustNapiAddon != null) (windowsWin32SecurityWintrustNapiAddon.windowssysWindowsWin32SecurityWintrustWintrustAddDefaultForUsage(pszusageoid.rawAddress.toString(), psdefusage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wintrustGetDefaultForUsage(dwaction: WintrustGetDefaultForUsageAction, pszusageoid: Pcstr, psusage: MutPtr): Bool =
    if (windowsWin32SecurityWintrustNapiAddon != null) (windowsWin32SecurityWintrustNapiAddon.windowssysWindowsWin32SecurityWintrustWintrustGetDefaultForUsage(dwaction.toInt(), pszusageoid.rawAddress.toString(), psusage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wintrustGetRegPolicyFlags(pdwpolicyflags: MutPtr) {
    if (windowsWin32SecurityWintrustNapiAddon != null) {
        windowsWin32SecurityWintrustNapiAddon.windowssysWindowsWin32SecurityWintrustWintrustGetRegPolicyFlags(pdwpolicyflags.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wintrustLoadFunctionPointers(pgactionid: MutPtr, ppfns: MutPtr): Bool =
    if (windowsWin32SecurityWintrustNapiAddon != null) (windowsWin32SecurityWintrustNapiAddon.windowssysWindowsWin32SecurityWintrustWintrustLoadFunctionPointers(pgactionid.rawAddress.toString(), ppfns.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wintrustRemoveActionID(pgactionid: ConstPtr): Bool =
    if (windowsWin32SecurityWintrustNapiAddon != null) (windowsWin32SecurityWintrustNapiAddon.windowssysWindowsWin32SecurityWintrustWintrustRemoveActionID(pgactionid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wintrustSetDefaultIncludePEPageHashes(fincludepepagehashes: Bool) {
    if (windowsWin32SecurityWintrustNapiAddon != null) {
        windowsWin32SecurityWintrustNapiAddon.windowssysWindowsWin32SecurityWintrustWintrustSetDefaultIncludePEPageHashes(fincludepepagehashes)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wintrustSetRegPolicyFlags(dwpolicyflags: WintrustPolicyFlags): Bool =
    if (windowsWin32SecurityWintrustNapiAddon != null) (windowsWin32SecurityWintrustNapiAddon.windowssysWindowsWin32SecurityWintrustWintrustSetRegPolicyFlags(dwpolicyflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
