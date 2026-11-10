@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.Hcertstore

private val _windowsWin32SecurityCryptographyUiNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun certSelectionGetSerializedBlob(pcsi: COpaquePointer?, ppoutbuffer: COpaquePointer?, puloutbuffersize: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyUiNapiAddon != null) (_windowsWin32SecurityCryptographyUiNapiAddon.windowssys_windows_win32_security_cryptography_ui_certSelectionGetSerializedBlob((pcsi?.value ?: 0L).toString(), (ppoutbuffer?.value ?: 0L).toString(), (puloutbuffersize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIDlgCertMgr(pcryptuicertmgr: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyUiNapiAddon != null) (_windowsWin32SecurityCryptographyUiNapiAddon.windowssys_windows_win32_security_cryptography_ui_cryptUIDlgCertMgr((pcryptuicertmgr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIDlgSelectCertificateFromStore(hcertstore: Hcertstore, hwnd: Hwnd, pwsztitle: Pcwstr, pwszdisplaystring: Pcwstr, dwdontusecolumn: UInt, dwflags: UInt, pvreserved: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyUiNapiAddon != null) (_windowsWin32SecurityCryptographyUiNapiAddon.windowssys_windows_win32_security_cryptography_ui_cryptUIDlgSelectCertificateFromStore((hcertstore?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), (pwsztitle?.value ?: 0L).toString(), (pwszdisplaystring?.value ?: 0L).toString(), dwdontusecolumn.toInt(), dwflags.toInt(), (pvreserved?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIDlgViewCertificateA(pcertviewinfo: COpaquePointer?, pfpropertieschanged: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyUiNapiAddon != null) (_windowsWin32SecurityCryptographyUiNapiAddon.windowssys_windows_win32_security_cryptography_ui_cryptUIDlgViewCertificateA((pcertviewinfo?.value ?: 0L).toString(), (pfpropertieschanged?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIDlgViewCertificateW(pcertviewinfo: COpaquePointer?, pfpropertieschanged: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyUiNapiAddon != null) (_windowsWin32SecurityCryptographyUiNapiAddon.windowssys_windows_win32_security_cryptography_ui_cryptUIDlgViewCertificateW((pcertviewinfo?.value ?: 0L).toString(), (pfpropertieschanged?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIDlgViewContext(dwcontexttype: UInt, pvcontext: COpaquePointer?, hwnd: Hwnd, pwsztitle: Pcwstr, dwflags: UInt, pvreserved: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyUiNapiAddon != null) (_windowsWin32SecurityCryptographyUiNapiAddon.windowssys_windows_win32_security_cryptography_ui_cryptUIDlgViewContext(dwcontexttype.toInt(), (pvcontext?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), (pwsztitle?.value ?: 0L).toString(), dwflags.toInt(), (pvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIWizDigitalSign(dwflags: UInt, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pdigitalsigninfo: COpaquePointer?, ppsigncontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyUiNapiAddon != null) (_windowsWin32SecurityCryptographyUiNapiAddon.windowssys_windows_win32_security_cryptography_ui_cryptUIWizDigitalSign(dwflags.toInt(), (hwndparent?.value ?: 0L).toString(), (pwszwizardtitle?.value ?: 0L).toString(), (pdigitalsigninfo?.value ?: 0L).toString(), (ppsigncontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIWizExport(dwflags: CryptuiWizFlags, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pexportinfo: COpaquePointer?, pvoid: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyUiNapiAddon != null) (_windowsWin32SecurityCryptographyUiNapiAddon.windowssys_windows_win32_security_cryptography_ui_cryptUIWizExport(dwflags.toInt(), (hwndparent?.value ?: 0L).toString(), (pwszwizardtitle?.value ?: 0L).toString(), (pexportinfo?.value ?: 0L).toString(), (pvoid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIWizFreeDigitalSignContext(psigncontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyUiNapiAddon != null) (_windowsWin32SecurityCryptographyUiNapiAddon.windowssys_windows_win32_security_cryptography_ui_cryptUIWizFreeDigitalSignContext((psigncontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUIWizImport(dwflags: CryptuiWizFlags, hwndparent: Hwnd, pwszwizardtitle: Pcwstr, pimportsrc: COpaquePointer?, hdestcertstore: Hcertstore): Bool =
    if (_windowsWin32SecurityCryptographyUiNapiAddon != null) (_windowsWin32SecurityCryptographyUiNapiAddon.windowssys_windows_win32_security_cryptography_ui_cryptUIWizImport(dwflags.toInt(), (hwndparent?.value ?: 0L).toString(), (pwszwizardtitle?.value ?: 0L).toString(), (pimportsrc?.value ?: 0L).toString(), (hdestcertstore?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
