@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.licenseprotection

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private val _windowsWin32SecurityLicenseprotectionNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun registerLicenseKeyWithExpiration(licensekey: Pcwstr, validityindays: UInt, status: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityLicenseprotectionNapiAddon != null) (_windowsWin32SecurityLicenseprotectionNapiAddon.windowssys_windows_win32_security_licenseprotection_registerLicenseKeyWithExpiration((licensekey?.value ?: 0L).toString(), validityindays.toInt(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun validateLicenseKeyProtection(licensekey: Pcwstr, notvalidbefore: COpaquePointer?, notvalidafter: COpaquePointer?, status: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityLicenseprotectionNapiAddon != null) (_windowsWin32SecurityLicenseprotectionNapiAddon.windowssys_windows_win32_security_licenseprotection_validateLicenseKeyProtection((licensekey?.value ?: 0L).toString(), (notvalidbefore?.value ?: 0L).toString(), (notvalidafter?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
