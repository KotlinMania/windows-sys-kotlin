@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SecurityWintrustNapiAddon(): Boolean

private val windowsWin32SecurityWintrustNapiAvailable: Boolean = initWindowsWin32SecurityWintrustNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityWintrustOpenPersonalTrustDBDialog(p0)")
private external fun wasmWindowssysWindowsWin32SecurityWintrustOpenPersonalTrustDBDialog(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityWintrustOpenPersonalTrustDBDialogEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityWintrustOpenPersonalTrustDBDialogEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityWintrustWTHelperCertCheckValidSignature(p0)")
private external fun wasmWindowssysWindowsWin32SecurityWintrustWTHelperCertCheckValidSignature(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityWintrustWTHelperCertIsSelfSigned(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityWintrustWTHelperCertIsSelfSigned(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityWintrustWTHelperGetProvCertFromChain(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityWintrustWTHelperGetProvCertFromChain(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityWintrustWTHelperGetProvPrivateDataFromChain(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityWintrustWTHelperGetProvPrivateDataFromChain(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityWintrustWTHelperGetProvSignerFromChain(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityWintrustWTHelperGetProvSignerFromChain(p0: String, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityWintrustWTHelperProvDataFromStateData(p0)")
private external fun wasmWindowssysWindowsWin32SecurityWintrustWTHelperProvDataFromStateData(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityWintrustWinVerifyTrust(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityWintrustWinVerifyTrust(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityWintrustWinVerifyTrustEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityWintrustWinVerifyTrustEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityWintrustWintrustAddActionID(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityWintrustWintrustAddActionID(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityWintrustWintrustAddDefaultForUsage(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityWintrustWintrustAddDefaultForUsage(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityWintrustWintrustGetDefaultForUsage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityWintrustWintrustGetDefaultForUsage(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityWintrustWintrustGetRegPolicyFlags(p0)")
private external fun wasmWindowssysWindowsWin32SecurityWintrustWintrustGetRegPolicyFlags(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityWintrustWintrustLoadFunctionPointers(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityWintrustWintrustLoadFunctionPointers(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityWintrustWintrustRemoveActionID(p0)")
private external fun wasmWindowssysWindowsWin32SecurityWintrustWintrustRemoveActionID(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityWintrustWintrustSetDefaultIncludePEPageHashes(p0)")
private external fun wasmWindowssysWindowsWin32SecurityWintrustWintrustSetDefaultIncludePEPageHashes(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityWintrustWintrustSetRegPolicyFlags(p0)")
private external fun wasmWindowssysWindowsWin32SecurityWintrustWintrustSetRegPolicyFlags(p0: Int): Int

public actual fun openPersonalTrustDBDialog(hwndparent: Hwnd): Bool =
    if (windowsWin32SecurityWintrustNapiAvailable) wasmWindowssysWindowsWin32SecurityWintrustOpenPersonalTrustDBDialog(hwndparent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPersonalTrustDBDialogEx(hwndparent: Hwnd, dwflags: UInt, pvreserved: MutPtr<MutPtr<CVoid>>): Bool =
    if (windowsWin32SecurityWintrustNapiAvailable) wasmWindowssysWindowsWin32SecurityWintrustOpenPersonalTrustDBDialogEx(hwndparent.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTHelperCertCheckValidSignature(pprovdata: MutPtr<CryptProviderData>): Hresult =
    if (windowsWin32SecurityWintrustNapiAvailable) wasmWindowssysWindowsWin32SecurityWintrustWTHelperCertCheckValidSignature(pprovdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTHelperCertIsSelfSigned(dwencoding: UInt, pcert: MutPtr<CertInfo>): Bool =
    if (windowsWin32SecurityWintrustNapiAvailable) wasmWindowssysWindowsWin32SecurityWintrustWTHelperCertIsSelfSigned(dwencoding.toInt(), pcert.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTHelperGetProvCertFromChain(psgnr: MutPtr<CryptProviderSgnr>, idxcert: UInt): MutPtr<CryptProviderCert> =
    if (windowsWin32SecurityWintrustNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityWintrustWTHelperGetProvCertFromChain(psgnr.rawAddress.toString(), idxcert.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTHelperGetProvPrivateDataFromChain(pprovdata: MutPtr<CryptProviderData>, pgproviderid: MutPtr<Guid>): MutPtr<CryptProviderPrivdata> =
    if (windowsWin32SecurityWintrustNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityWintrustWTHelperGetProvPrivateDataFromChain(pprovdata.rawAddress.toString(), pgproviderid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTHelperGetProvSignerFromChain(pprovdata: MutPtr<CryptProviderData>, idxsigner: UInt, fcountersigner: Bool, idxcountersigner: UInt): MutPtr<CryptProviderSgnr> =
    if (windowsWin32SecurityWintrustNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityWintrustWTHelperGetProvSignerFromChain(pprovdata.rawAddress.toString(), idxsigner.toInt(), fcountersigner, idxcountersigner.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTHelperProvDataFromStateData(hstatedata: Handle): MutPtr<CryptProviderData> =
    if (windowsWin32SecurityWintrustNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityWintrustWTHelperProvDataFromStateData(hstatedata.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winVerifyTrust(hwnd: Hwnd, pgactionid: MutPtr<Guid>, pwvtdata: MutPtr<CVoid>): Int =
    if (windowsWin32SecurityWintrustNapiAvailable) wasmWindowssysWindowsWin32SecurityWintrustWinVerifyTrust(hwnd.rawAddress.toString(), pgactionid.rawAddress.toString(), pwvtdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winVerifyTrustEx(hwnd: Hwnd, pgactionid: MutPtr<Guid>, pwintrustdata: MutPtr<WintrustData>): Int =
    if (windowsWin32SecurityWintrustNapiAvailable) wasmWindowssysWindowsWin32SecurityWintrustWinVerifyTrustEx(hwnd.rawAddress.toString(), pgactionid.rawAddress.toString(), pwintrustdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wintrustAddActionID(pgactionid: ConstPtr<Guid>, fdwflags: UInt, psprovinfo: ConstPtr<CryptRegisterActionid>): Bool =
    if (windowsWin32SecurityWintrustNapiAvailable) wasmWindowssysWindowsWin32SecurityWintrustWintrustAddActionID(pgactionid.rawAddress.toString(), fdwflags.toInt(), psprovinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wintrustAddDefaultForUsage(pszusageoid: Pcstr, psdefusage: ConstPtr<CryptProviderRegdefusage>): Bool =
    if (windowsWin32SecurityWintrustNapiAvailable) wasmWindowssysWindowsWin32SecurityWintrustWintrustAddDefaultForUsage(pszusageoid.rawAddress.toString(), psdefusage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wintrustGetDefaultForUsage(dwaction: WintrustGetDefaultForUsageAction, pszusageoid: Pcstr, psusage: MutPtr<CryptProviderDefusage>): Bool =
    if (windowsWin32SecurityWintrustNapiAvailable) wasmWindowssysWindowsWin32SecurityWintrustWintrustGetDefaultForUsage(dwaction.toInt(), pszusageoid.rawAddress.toString(), psusage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wintrustGetRegPolicyFlags(pdwpolicyflags: MutPtr<WintrustPolicyFlags>) {
    if (windowsWin32SecurityWintrustNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityWintrustWintrustGetRegPolicyFlags(pdwpolicyflags.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wintrustLoadFunctionPointers(pgactionid: MutPtr<Guid>, ppfns: MutPtr<CryptProviderFunctions>): Bool =
    if (windowsWin32SecurityWintrustNapiAvailable) wasmWindowssysWindowsWin32SecurityWintrustWintrustLoadFunctionPointers(pgactionid.rawAddress.toString(), ppfns.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wintrustRemoveActionID(pgactionid: ConstPtr<Guid>): Bool =
    if (windowsWin32SecurityWintrustNapiAvailable) wasmWindowssysWindowsWin32SecurityWintrustWintrustRemoveActionID(pgactionid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wintrustSetDefaultIncludePEPageHashes(fincludepepagehashes: Bool) {
    if (windowsWin32SecurityWintrustNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityWintrustWintrustSetDefaultIncludePEPageHashes(fincludepepagehashes)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wintrustSetRegPolicyFlags(dwpolicyflags: WintrustPolicyFlags): Bool =
    if (windowsWin32SecurityWintrustNapiAvailable) wasmWindowssysWindowsWin32SecurityWintrustWintrustSetRegPolicyFlags(dwpolicyflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
