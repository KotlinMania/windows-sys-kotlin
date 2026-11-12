@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32SecurityCryptographyUiNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun certSelectionGetSerializedBlob(pcsi: ConstPtr<CertSelectuiInput>, ppoutbuffer: MutPtr<MutPtr<CVoid>>, puloutbuffersize: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityCryptographyUiNapiAddon != null) (windowsWin32SecurityCryptographyUiNapiAddon.windowssysWindowsWin32SecurityCryptographyUiCertSelectionGetSerializedBlob(pcsi.rawAddress.toString(), ppoutbuffer.rawAddress.toString(), puloutbuffersize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIDlgCertMgr(pcryptuicertmgr: ConstPtr<CryptuiCertMgrStruct>): Bool =
    if (windowsWin32SecurityCryptographyUiNapiAddon != null) (windowsWin32SecurityCryptographyUiNapiAddon.windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgCertMgr(pcryptuicertmgr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIDlgSelectCertificateFromStore(hcertstore: Hcertstore, hwnd: Hwnd, pwsztitle: Pcwstr, pwszdisplaystring: Pcwstr, dwdontusecolumn: UInt, dwflags: UInt, pvreserved: ConstPtr<CVoid>): MutPtr<CertContext> =
    if (windowsWin32SecurityCryptographyUiNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyUiNapiAddon.windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgSelectCertificateFromStore(hcertstore.rawAddress.toString(), hwnd.rawAddress.toString(), pwsztitle.rawAddress.toString(), pwszdisplaystring.rawAddress.toString(), dwdontusecolumn.toInt(), dwflags.toInt(), pvreserved.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIDlgViewCertificateA(pcertviewinfo: ConstPtr<CryptuiViewcertificateStructa>, pfpropertieschanged: MutPtr<Bool>): Bool =
    if (windowsWin32SecurityCryptographyUiNapiAddon != null) (windowsWin32SecurityCryptographyUiNapiAddon.windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewCertificateA(pcertviewinfo.rawAddress.toString(), pfpropertieschanged.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIDlgViewCertificateW(pcertviewinfo: ConstPtr<CryptuiViewcertificateStructw>, pfpropertieschanged: MutPtr<Bool>): Bool =
    if (windowsWin32SecurityCryptographyUiNapiAddon != null) (windowsWin32SecurityCryptographyUiNapiAddon.windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewCertificateW(pcertviewinfo.rawAddress.toString(), pfpropertieschanged.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIDlgViewContext(dwcontexttype: UInt, pvcontext: ConstPtr<CVoid>, hwnd: Hwnd, pwsztitle: Pcwstr, dwflags: UInt, pvreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityCryptographyUiNapiAddon != null) (windowsWin32SecurityCryptographyUiNapiAddon.windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewContext(dwcontexttype.toInt(), pvcontext.rawAddress.toString(), hwnd.rawAddress.toString(), pwsztitle.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIWizDigitalSign(dwflags: UInt, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pdigitalsigninfo: ConstPtr<CryptuiWizDigitalSignInfo>, ppsigncontext: MutPtr<MutPtr<CryptuiWizDigitalSignContext>>): Bool =
    if (windowsWin32SecurityCryptographyUiNapiAddon != null) (windowsWin32SecurityCryptographyUiNapiAddon.windowssysWindowsWin32SecurityCryptographyUiCryptUIWizDigitalSign(dwflags.toInt(), hwndparent.rawAddress.toString(), pwszwizardtitle.rawAddress.toString(), pdigitalsigninfo.rawAddress.toString(), ppsigncontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIWizExport(dwflags: CryptuiWizFlags, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pexportinfo: ConstPtr<CryptuiWizExportInfo>, pvoid: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityCryptographyUiNapiAddon != null) (windowsWin32SecurityCryptographyUiNapiAddon.windowssysWindowsWin32SecurityCryptographyUiCryptUIWizExport(dwflags.toInt(), hwndparent.rawAddress.toString(), pwszwizardtitle.rawAddress.toString(), pexportinfo.rawAddress.toString(), pvoid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIWizFreeDigitalSignContext(psigncontext: ConstPtr<CryptuiWizDigitalSignContext>): Bool =
    if (windowsWin32SecurityCryptographyUiNapiAddon != null) (windowsWin32SecurityCryptographyUiNapiAddon.windowssysWindowsWin32SecurityCryptographyUiCryptUIWizFreeDigitalSignContext(psigncontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIWizImport(dwflags: CryptuiWizFlags, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pimportsrc: ConstPtr<CryptuiWizImportSrcInfo>, hdestcertstore: Hcertstore): Bool =
    if (windowsWin32SecurityCryptographyUiNapiAddon != null) (windowsWin32SecurityCryptographyUiNapiAddon.windowssysWindowsWin32SecurityCryptographyUiCryptUIWizImport(dwflags.toInt(), hwndparent.rawAddress.toString(), pwszwizardtitle.rawAddress.toString(), pimportsrc.rawAddress.toString(), hdestcertstore.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
