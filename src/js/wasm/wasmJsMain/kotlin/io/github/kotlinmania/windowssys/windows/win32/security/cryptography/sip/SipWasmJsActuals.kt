@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertQueryEncodingType

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SecurityCryptographySipNapiAddon(): Boolean

private val _windowsWin32SecurityCryptographySipNapiAvailable: Boolean = _initWindowsWin32SecurityCryptographySipNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_sip_cryptSIPAddProvider(p0)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPAddProvider(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_sip_cryptSIPCreateIndirectData(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPCreateIndirectData(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_sip_cryptSIPGetCaps(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPGetCaps(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_sip_cryptSIPGetSealedDigest(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPGetSealedDigest(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_sip_cryptSIPGetSignedDataMsg(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPGetSignedDataMsg(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_sip_cryptSIPLoad(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPLoad(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_sip_cryptSIPPutSignedDataMsg(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPPutSignedDataMsg(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_sip_cryptSIPRemoveProvider(p0)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPRemoveProvider(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_sip_cryptSIPRemoveSignedDataMsg(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPRemoveSignedDataMsg(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_sip_cryptSIPRetrieveSubjectGuid(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPRetrieveSubjectGuid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_sip_cryptSIPRetrieveSubjectGuidForCatalogFile(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPRetrieveSubjectGuidForCatalogFile(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_sip_cryptSIPVerifyIndirectData(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPVerifyIndirectData(p0: String, p1: String): Int

public actual fun cryptSIPAddProvider(psnewprov: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographySipNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPAddProvider((psnewprov?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPCreateIndirectData(psubjectinfo: COpaquePointer?, pcbindirectdata: COpaquePointer?, pindirectdata: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographySipNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPCreateIndirectData((psubjectinfo?.value ?: 0L).toString(), (pcbindirectdata?.value ?: 0L).toString(), (pindirectdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPGetCaps(psubjinfo: COpaquePointer?, pcaps: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographySipNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPGetCaps((psubjinfo?.value ?: 0L).toString(), (pcaps?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPGetSealedDigest(psubjectinfo: COpaquePointer?, psig: COpaquePointer?, dwsig: UInt, pbdigest: COpaquePointer?, pcbdigest: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographySipNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPGetSealedDigest((psubjectinfo?.value ?: 0L).toString(), (psig?.value ?: 0L).toString(), dwsig.toInt(), (pbdigest?.value ?: 0L).toString(), (pcbdigest?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPGetSignedDataMsg(psubjectinfo: COpaquePointer?, pdwencodingtype: COpaquePointer?, dwindex: UInt, pcbsigneddatamsg: COpaquePointer?, pbsigneddatamsg: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographySipNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPGetSignedDataMsg((psubjectinfo?.value ?: 0L).toString(), (pdwencodingtype?.value ?: 0L).toString(), dwindex.toInt(), (pcbsigneddatamsg?.value ?: 0L).toString(), (pbsigneddatamsg?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPLoad(pgsubject: COpaquePointer?, dwflags: UInt, psipdispatch: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographySipNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPLoad((pgsubject?.value ?: 0L).toString(), dwflags.toInt(), (psipdispatch?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPPutSignedDataMsg(psubjectinfo: COpaquePointer?, dwencodingtype: CertQueryEncodingType, pdwindex: COpaquePointer?, cbsigneddatamsg: UInt, pbsigneddatamsg: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographySipNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPPutSignedDataMsg((psubjectinfo?.value ?: 0L).toString(), dwencodingtype.toInt(), (pdwindex?.value ?: 0L).toString(), cbsigneddatamsg.toInt(), (pbsigneddatamsg?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPRemoveProvider(pgprov: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographySipNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPRemoveProvider((pgprov?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPRemoveSignedDataMsg(psubjectinfo: COpaquePointer?, dwindex: UInt): Bool =
    if (_windowsWin32SecurityCryptographySipNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPRemoveSignedDataMsg((psubjectinfo?.value ?: 0L).toString(), dwindex.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPRetrieveSubjectGuid(filename: Pcwstr, hfilein: Handle, pgsubject: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographySipNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPRetrieveSubjectGuid((filename?.value ?: 0L).toString(), (hfilein?.value ?: 0L).toString(), (pgsubject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPRetrieveSubjectGuidForCatalogFile(filename: Pcwstr, hfilein: Handle, pgsubject: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographySipNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPRetrieveSubjectGuidForCatalogFile((filename?.value ?: 0L).toString(), (hfilein?.value ?: 0L).toString(), (pgsubject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPVerifyIndirectData(psubjectinfo: COpaquePointer?, pindirectdata: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographySipNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_sip_cryptSIPVerifyIndirectData((psubjectinfo?.value ?: 0L).toString(), (pindirectdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
