@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertQueryEncodingType

private val windowsWin32SecurityCryptographySipNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun cryptSIPAddProvider(psnewprov: MutPtr): Bool =
    if (windowsWin32SecurityCryptographySipNapiAddon != null) (windowsWin32SecurityCryptographySipNapiAddon.windowssysWindowsWin32SecurityCryptographySipCryptSIPAddProvider(psnewprov.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPCreateIndirectData(psubjectinfo: MutPtr, pcbindirectdata: MutPtr, pindirectdata: MutPtr): Bool =
    if (windowsWin32SecurityCryptographySipNapiAddon != null) (windowsWin32SecurityCryptographySipNapiAddon.windowssysWindowsWin32SecurityCryptographySipCryptSIPCreateIndirectData(psubjectinfo.rawAddress.toString(), pcbindirectdata.rawAddress.toString(), pindirectdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPGetCaps(psubjinfo: ConstPtr, pcaps: MutPtr): Bool =
    if (windowsWin32SecurityCryptographySipNapiAddon != null) (windowsWin32SecurityCryptographySipNapiAddon.windowssysWindowsWin32SecurityCryptographySipCryptSIPGetCaps(psubjinfo.rawAddress.toString(), pcaps.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPGetSealedDigest(psubjectinfo: ConstPtr, psig: ConstPtr, dwsig: UInt, pbdigest: MutPtr, pcbdigest: MutPtr): Bool =
    if (windowsWin32SecurityCryptographySipNapiAddon != null) (windowsWin32SecurityCryptographySipNapiAddon.windowssysWindowsWin32SecurityCryptographySipCryptSIPGetSealedDigest(psubjectinfo.rawAddress.toString(), psig.rawAddress.toString(), dwsig.toInt(), pbdigest.rawAddress.toString(), pcbdigest.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPGetSignedDataMsg(psubjectinfo: MutPtr, pdwencodingtype: MutPtr, dwindex: UInt, pcbsigneddatamsg: MutPtr, pbsigneddatamsg: MutPtr): Bool =
    if (windowsWin32SecurityCryptographySipNapiAddon != null) (windowsWin32SecurityCryptographySipNapiAddon.windowssysWindowsWin32SecurityCryptographySipCryptSIPGetSignedDataMsg(psubjectinfo.rawAddress.toString(), pdwencodingtype.rawAddress.toString(), dwindex.toInt(), pcbsigneddatamsg.rawAddress.toString(), pbsigneddatamsg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPLoad(pgsubject: ConstPtr, dwflags: UInt, psipdispatch: MutPtr): Bool =
    if (windowsWin32SecurityCryptographySipNapiAddon != null) (windowsWin32SecurityCryptographySipNapiAddon.windowssysWindowsWin32SecurityCryptographySipCryptSIPLoad(pgsubject.rawAddress.toString(), dwflags.toInt(), psipdispatch.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPPutSignedDataMsg(psubjectinfo: MutPtr, dwencodingtype: CertQueryEncodingType, pdwindex: MutPtr, cbsigneddatamsg: UInt, pbsigneddatamsg: MutPtr): Bool =
    if (windowsWin32SecurityCryptographySipNapiAddon != null) (windowsWin32SecurityCryptographySipNapiAddon.windowssysWindowsWin32SecurityCryptographySipCryptSIPPutSignedDataMsg(psubjectinfo.rawAddress.toString(), dwencodingtype.toInt(), pdwindex.rawAddress.toString(), cbsigneddatamsg.toInt(), pbsigneddatamsg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPRemoveProvider(pgprov: MutPtr): Bool =
    if (windowsWin32SecurityCryptographySipNapiAddon != null) (windowsWin32SecurityCryptographySipNapiAddon.windowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveProvider(pgprov.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPRemoveSignedDataMsg(psubjectinfo: MutPtr, dwindex: UInt): Bool =
    if (windowsWin32SecurityCryptographySipNapiAddon != null) (windowsWin32SecurityCryptographySipNapiAddon.windowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveSignedDataMsg(psubjectinfo.rawAddress.toString(), dwindex.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPRetrieveSubjectGuid(filename: Pcwstr, hfilein: Handle, pgsubject: MutPtr): Bool =
    if (windowsWin32SecurityCryptographySipNapiAddon != null) (windowsWin32SecurityCryptographySipNapiAddon.windowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuid(filename.rawAddress.toString(), hfilein.rawAddress.toString(), pgsubject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPRetrieveSubjectGuidForCatalogFile(filename: Pcwstr, hfilein: Handle, pgsubject: MutPtr): Bool =
    if (windowsWin32SecurityCryptographySipNapiAddon != null) (windowsWin32SecurityCryptographySipNapiAddon.windowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuidForCatalogFile(filename.rawAddress.toString(), hfilein.rawAddress.toString(), pgsubject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSIPVerifyIndirectData(psubjectinfo: MutPtr, pindirectdata: MutPtr): Bool =
    if (windowsWin32SecurityCryptographySipNapiAddon != null) (windowsWin32SecurityCryptographySipNapiAddon.windowssysWindowsWin32SecurityCryptographySipCryptSIPVerifyIndirectData(psubjectinfo.rawAddress.toString(), pindirectdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
