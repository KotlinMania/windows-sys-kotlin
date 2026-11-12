@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.licenseprotection

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SecurityLicenseprotectionNapiAddon(): Boolean

private val windowsWin32SecurityLicenseprotectionNapiAvailable: Boolean = initWindowsWin32SecurityLicenseprotectionNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityLicenseprotectionRegisterLicenseKeyWithExpiration(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityLicenseprotectionRegisterLicenseKeyWithExpiration(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityLicenseprotectionValidateLicenseKeyProtection(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityLicenseprotectionValidateLicenseKeyProtection(p0: String, p1: String, p2: String, p3: String): Int

public actual fun registerLicenseKeyWithExpiration(licensekey: Pcwstr, validityindays: UInt, status: MutPtr<LicenseProtectionStatus>): Hresult =
    if (windowsWin32SecurityLicenseprotectionNapiAvailable) wasmWindowssysWindowsWin32SecurityLicenseprotectionRegisterLicenseKeyWithExpiration(licensekey.rawAddress.toString(), validityindays.toInt(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun validateLicenseKeyProtection(licensekey: Pcwstr, notvalidbefore: MutPtr<Filetime>, notvalidafter: MutPtr<Filetime>, status: MutPtr<LicenseProtectionStatus>): Hresult =
    if (windowsWin32SecurityLicenseprotectionNapiAvailable) wasmWindowssysWindowsWin32SecurityLicenseprotectionValidateLicenseKeyProtection(licensekey.rawAddress.toString(), notvalidbefore.rawAddress.toString(), notvalidafter.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
