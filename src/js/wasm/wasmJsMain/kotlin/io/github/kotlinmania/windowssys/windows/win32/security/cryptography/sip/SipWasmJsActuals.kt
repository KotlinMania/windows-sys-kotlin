@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertQueryEncodingType

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SecurityCryptographySipNapiAddon(): Boolean

private val windowsWin32SecurityCryptographySipNapiAvailable: Boolean = initWindowsWin32SecurityCryptographySipNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySipCryptSIPAddProvider(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPAddProvider(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySipCryptSIPCreateIndirectData(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPCreateIndirectData(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySipCryptSIPGetCaps(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPGetCaps(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySipCryptSIPGetSealedDigest(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPGetSealedDigest(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySipCryptSIPGetSignedDataMsg(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPGetSignedDataMsg(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySipCryptSIPLoad(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPLoad(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySipCryptSIPPutSignedDataMsg(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPPutSignedDataMsg(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveProvider(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveProvider(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveSignedDataMsg(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveSignedDataMsg(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuid(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuidForCatalogFile(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuidForCatalogFile(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySipCryptSIPVerifyIndirectData(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPVerifyIndirectData(p0: String, p1: String): Int

public actual fun cryptSIPAddProvider(psnewprov: MutPtr): Bool =
    if (windowsWin32SecurityCryptographySipNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPAddProvider(psnewprov.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPCreateIndirectData(psubjectinfo: MutPtr, pcbindirectdata: MutPtr, pindirectdata: MutPtr): Bool =
    if (windowsWin32SecurityCryptographySipNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPCreateIndirectData(psubjectinfo.rawAddress.toString(), pcbindirectdata.rawAddress.toString(), pindirectdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPGetCaps(psubjinfo: ConstPtr, pcaps: MutPtr): Bool =
    if (windowsWin32SecurityCryptographySipNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPGetCaps(psubjinfo.rawAddress.toString(), pcaps.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPGetSealedDigest(psubjectinfo: ConstPtr, psig: ConstPtr, dwsig: UInt, pbdigest: MutPtr, pcbdigest: MutPtr): Bool =
    if (windowsWin32SecurityCryptographySipNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPGetSealedDigest(psubjectinfo.rawAddress.toString(), psig.rawAddress.toString(), dwsig.toInt(), pbdigest.rawAddress.toString(), pcbdigest.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPGetSignedDataMsg(psubjectinfo: MutPtr, pdwencodingtype: MutPtr, dwindex: UInt, pcbsigneddatamsg: MutPtr, pbsigneddatamsg: MutPtr): Bool =
    if (windowsWin32SecurityCryptographySipNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPGetSignedDataMsg(psubjectinfo.rawAddress.toString(), pdwencodingtype.rawAddress.toString(), dwindex.toInt(), pcbsigneddatamsg.rawAddress.toString(), pbsigneddatamsg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPLoad(pgsubject: ConstPtr, dwflags: UInt, psipdispatch: MutPtr): Bool =
    if (windowsWin32SecurityCryptographySipNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPLoad(pgsubject.rawAddress.toString(), dwflags.toInt(), psipdispatch.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPPutSignedDataMsg(psubjectinfo: MutPtr, dwencodingtype: CertQueryEncodingType, pdwindex: MutPtr, cbsigneddatamsg: UInt, pbsigneddatamsg: MutPtr): Bool =
    if (windowsWin32SecurityCryptographySipNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPPutSignedDataMsg(psubjectinfo.rawAddress.toString(), dwencodingtype.toInt(), pdwindex.rawAddress.toString(), cbsigneddatamsg.toInt(), pbsigneddatamsg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPRemoveProvider(pgprov: MutPtr): Bool =
    if (windowsWin32SecurityCryptographySipNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveProvider(pgprov.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPRemoveSignedDataMsg(psubjectinfo: MutPtr, dwindex: UInt): Bool =
    if (windowsWin32SecurityCryptographySipNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveSignedDataMsg(psubjectinfo.rawAddress.toString(), dwindex.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPRetrieveSubjectGuid(filename: Pcwstr, hfilein: Handle, pgsubject: MutPtr): Bool =
    if (windowsWin32SecurityCryptographySipNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuid(filename.rawAddress.toString(), hfilein.rawAddress.toString(), pgsubject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPRetrieveSubjectGuidForCatalogFile(filename: Pcwstr, hfilein: Handle, pgsubject: MutPtr): Bool =
    if (windowsWin32SecurityCryptographySipNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuidForCatalogFile(filename.rawAddress.toString(), hfilein.rawAddress.toString(), pgsubject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPVerifyIndirectData(psubjectinfo: MutPtr, pindirectdata: MutPtr): Bool =
    if (windowsWin32SecurityCryptographySipNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySipCryptSIPVerifyIndirectData(psubjectinfo.rawAddress.toString(), pindirectdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
