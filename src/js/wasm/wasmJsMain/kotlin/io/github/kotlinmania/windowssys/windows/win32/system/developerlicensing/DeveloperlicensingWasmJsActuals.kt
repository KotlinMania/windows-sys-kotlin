@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemDeveloperlicensingNapiAddon(): Boolean

private val windowsWin32SystemDeveloperlicensingNapiAvailable: Boolean = initWindowsWin32SystemDeveloperlicensingNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeveloperlicensingAcquireDeveloperLicense(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeveloperlicensingAcquireDeveloperLicense(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeveloperlicensingCheckDeveloperLicense(p0)")
private external fun wasmWindowssysWindowsWin32SystemDeveloperlicensingCheckDeveloperLicense(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeveloperlicensingRemoveDeveloperLicense(p0)")
private external fun wasmWindowssysWindowsWin32SystemDeveloperlicensingRemoveDeveloperLicense(p0: String): Int

public actual fun acquireDeveloperLicense(hwndparent: Hwnd, pexpiration: MutPtr<Filetime>): Hresult =
    if (windowsWin32SystemDeveloperlicensingNapiAvailable) wasmWindowssysWindowsWin32SystemDeveloperlicensingAcquireDeveloperLicense(hwndparent.rawAddress.toString(), pexpiration.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkDeveloperLicense(pexpiration: MutPtr<Filetime>): Hresult =
    if (windowsWin32SystemDeveloperlicensingNapiAvailable) wasmWindowssysWindowsWin32SystemDeveloperlicensingCheckDeveloperLicense(pexpiration.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeDeveloperLicense(hwndparent: Hwnd): Hresult =
    if (windowsWin32SystemDeveloperlicensingNapiAvailable) wasmWindowssysWindowsWin32SystemDeveloperlicensingRemoveDeveloperLicense(hwndparent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
