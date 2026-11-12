@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.Hcertstore

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SecurityCryptographyUiNapiAddon(): Boolean

private val windowsWin32SecurityCryptographyUiNapiAvailable: Boolean = initWindowsWin32SecurityCryptographyUiNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyUiCertSelectionGetSerializedBlob(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyUiCertSelectionGetSerializedBlob(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgCertMgr(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyUiCryptUIDlgCertMgr(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgSelectCertificateFromStore(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyUiCryptUIDlgSelectCertificateFromStore(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewCertificateA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewCertificateA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewCertificateW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewCertificateW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewContext(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewContext(p0: Int, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyUiCryptUIWizDigitalSign(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyUiCryptUIWizDigitalSign(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyUiCryptUIWizExport(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyUiCryptUIWizExport(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyUiCryptUIWizFreeDigitalSignContext(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyUiCryptUIWizFreeDigitalSignContext(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyUiCryptUIWizImport(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyUiCryptUIWizImport(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

public actual fun certSelectionGetSerializedBlob(pcsi: ConstPtr<CertSelectuiInput>, ppoutbuffer: MutPtr<MutPtr<CVoid>>, puloutbuffersize: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityCryptographyUiNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyUiCertSelectionGetSerializedBlob(pcsi.rawAddress.toString(), ppoutbuffer.rawAddress.toString(), puloutbuffersize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIDlgCertMgr(pcryptuicertmgr: ConstPtr<CryptuiCertMgrStruct>): Bool =
    if (windowsWin32SecurityCryptographyUiNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyUiCryptUIDlgCertMgr(pcryptuicertmgr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIDlgSelectCertificateFromStore(hcertstore: Hcertstore, hwnd: Hwnd, pwsztitle: Pcwstr, pwszdisplaystring: Pcwstr, dwdontusecolumn: UInt, dwflags: UInt, pvreserved: ConstPtr<CVoid>): MutPtr<CertContext> =
    if (windowsWin32SecurityCryptographyUiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyUiCryptUIDlgSelectCertificateFromStore(hcertstore.rawAddress.toString(), hwnd.rawAddress.toString(), pwsztitle.rawAddress.toString(), pwszdisplaystring.rawAddress.toString(), dwdontusecolumn.toInt(), dwflags.toInt(), pvreserved.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIDlgViewCertificateA(pcertviewinfo: ConstPtr<CryptuiViewcertificateStructa>, pfpropertieschanged: MutPtr<Bool>): Bool =
    if (windowsWin32SecurityCryptographyUiNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewCertificateA(pcertviewinfo.rawAddress.toString(), pfpropertieschanged.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIDlgViewCertificateW(pcertviewinfo: ConstPtr<CryptuiViewcertificateStructw>, pfpropertieschanged: MutPtr<Bool>): Bool =
    if (windowsWin32SecurityCryptographyUiNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewCertificateW(pcertviewinfo.rawAddress.toString(), pfpropertieschanged.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIDlgViewContext(dwcontexttype: UInt, pvcontext: ConstPtr<CVoid>, hwnd: Hwnd, pwsztitle: Pcwstr, dwflags: UInt, pvreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityCryptographyUiNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewContext(dwcontexttype.toInt(), pvcontext.rawAddress.toString(), hwnd.rawAddress.toString(), pwsztitle.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIWizDigitalSign(dwflags: UInt, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pdigitalsigninfo: ConstPtr<CryptuiWizDigitalSignInfo>, ppsigncontext: MutPtr<MutPtr<CryptuiWizDigitalSignContext>>): Bool =
    if (windowsWin32SecurityCryptographyUiNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyUiCryptUIWizDigitalSign(dwflags.toInt(), hwndparent.rawAddress.toString(), pwszwizardtitle.rawAddress.toString(), pdigitalsigninfo.rawAddress.toString(), ppsigncontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIWizExport(dwflags: CryptuiWizFlags, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pexportinfo: ConstPtr<CryptuiWizExportInfo>, pvoid: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityCryptographyUiNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyUiCryptUIWizExport(dwflags.toInt(), hwndparent.rawAddress.toString(), pwszwizardtitle.rawAddress.toString(), pexportinfo.rawAddress.toString(), pvoid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIWizFreeDigitalSignContext(psigncontext: ConstPtr<CryptuiWizDigitalSignContext>): Bool =
    if (windowsWin32SecurityCryptographyUiNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyUiCryptUIWizFreeDigitalSignContext(psigncontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIWizImport(dwflags: CryptuiWizFlags, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pimportsrc: ConstPtr<CryptuiWizImportSrcInfo>, hdestcertstore: Hcertstore): Bool =
    if (windowsWin32SecurityCryptographyUiNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyUiCryptUIWizImport(dwflags.toInt(), hwndparent.rawAddress.toString(), pwszwizardtitle.rawAddress.toString(), pimportsrc.rawAddress.toString(), hdestcertstore.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
