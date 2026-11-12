@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.securitycenter

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemSecuritycenterNapiAddon(): Boolean

private val windowsWin32SystemSecuritycenterNapiAvailable: Boolean = initWindowsWin32SystemSecuritycenterNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSecuritycenterWscGetAntiMalwareUri(p0)")
private external fun wasmWindowssysWindowsWin32SystemSecuritycenterWscGetAntiMalwareUri(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSecuritycenterWscGetSecurityProviderHealth(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSecuritycenterWscGetSecurityProviderHealth(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSecuritycenterWscQueryAntiMalwareUri()")
private external fun wasmWindowssysWindowsWin32SystemSecuritycenterWscQueryAntiMalwareUri(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSecuritycenterWscRegisterForChanges(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemSecuritycenterWscRegisterForChanges(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSecuritycenterWscRegisterForUserNotifications()")
private external fun wasmWindowssysWindowsWin32SystemSecuritycenterWscRegisterForUserNotifications(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSecuritycenterWscUnRegisterChanges(p0)")
private external fun wasmWindowssysWindowsWin32SystemSecuritycenterWscUnRegisterChanges(p0: String): Int

public actual fun wscGetAntiMalwareUri(ppszuri: MutPtr): Hresult =
    if (windowsWin32SystemSecuritycenterNapiAvailable) wasmWindowssysWindowsWin32SystemSecuritycenterWscGetAntiMalwareUri(ppszuri.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wscGetSecurityProviderHealth(providers: UInt, phealth: MutPtr): Hresult =
    if (windowsWin32SystemSecuritycenterNapiAvailable) wasmWindowssysWindowsWin32SystemSecuritycenterWscGetSecurityProviderHealth(providers.toInt(), phealth.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wscQueryAntiMalwareUri(): Hresult =
    if (windowsWin32SystemSecuritycenterNapiAvailable) wasmWindowssysWindowsWin32SystemSecuritycenterWscQueryAntiMalwareUri() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wscRegisterForChanges(reserved: MutPtr, phcallbackregistration: MutPtr, lpcallbackaddress: LpthreadStartRoutine, pcontext: MutPtr): Hresult =
    if (windowsWin32SystemSecuritycenterNapiAvailable) wasmWindowssysWindowsWin32SystemSecuritycenterWscRegisterForChanges(reserved.rawAddress.toString(), phcallbackregistration.rawAddress.toString(), 0L.toString(), pcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wscRegisterForUserNotifications(): Hresult =
    if (windowsWin32SystemSecuritycenterNapiAvailable) wasmWindowssysWindowsWin32SystemSecuritycenterWscRegisterForUserNotifications() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wscUnRegisterChanges(hregistrationhandle: Handle): Hresult =
    if (windowsWin32SystemSecuritycenterNapiAvailable) wasmWindowssysWindowsWin32SystemSecuritycenterWscUnRegisterChanges(hregistrationhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
