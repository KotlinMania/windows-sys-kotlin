@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.securitycenter

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemSecuritycenterNapiAddon(): Boolean

private val _windowsWin32SystemSecuritycenterNapiAvailable: Boolean = _initWindowsWin32SystemSecuritycenterNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_securitycenter_wscGetAntiMalwareUri(p0)")
private external fun _wasm_windowssys_windows_win32_system_securitycenter_wscGetAntiMalwareUri(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_securitycenter_wscGetSecurityProviderHealth(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_securitycenter_wscGetSecurityProviderHealth(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_securitycenter_wscQueryAntiMalwareUri()")
private external fun _wasm_windowssys_windows_win32_system_securitycenter_wscQueryAntiMalwareUri(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_securitycenter_wscRegisterForChanges(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_securitycenter_wscRegisterForChanges(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_securitycenter_wscRegisterForUserNotifications()")
private external fun _wasm_windowssys_windows_win32_system_securitycenter_wscRegisterForUserNotifications(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_securitycenter_wscUnRegisterChanges(p0)")
private external fun _wasm_windowssys_windows_win32_system_securitycenter_wscUnRegisterChanges(p0: String): Int

public actual fun wscGetAntiMalwareUri(ppszuri: COpaquePointer?): Hresult =
    if (_windowsWin32SystemSecuritycenterNapiAvailable) _wasm_windowssys_windows_win32_system_securitycenter_wscGetAntiMalwareUri((ppszuri?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wscGetSecurityProviderHealth(providers: UInt, phealth: COpaquePointer?): Hresult =
    if (_windowsWin32SystemSecuritycenterNapiAvailable) _wasm_windowssys_windows_win32_system_securitycenter_wscGetSecurityProviderHealth(providers.toInt(), (phealth?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wscQueryAntiMalwareUri(): Hresult =
    if (_windowsWin32SystemSecuritycenterNapiAvailable) _wasm_windowssys_windows_win32_system_securitycenter_wscQueryAntiMalwareUri() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wscRegisterForChanges(reserved: COpaquePointer?, phcallbackregistration: COpaquePointer?, lpcallbackaddress: LpthreadStartRoutine, pcontext: COpaquePointer?): Hresult =
    if (_windowsWin32SystemSecuritycenterNapiAvailable) _wasm_windowssys_windows_win32_system_securitycenter_wscRegisterForChanges((reserved?.value ?: 0L).toString(), (phcallbackregistration?.value ?: 0L).toString(), 0L.toString(), (pcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wscRegisterForUserNotifications(): Hresult =
    if (_windowsWin32SystemSecuritycenterNapiAvailable) _wasm_windowssys_windows_win32_system_securitycenter_wscRegisterForUserNotifications() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wscUnRegisterChanges(hregistrationhandle: Handle): Hresult =
    if (_windowsWin32SystemSecuritycenterNapiAvailable) _wasm_windowssys_windows_win32_system_securitycenter_wscUnRegisterChanges((hregistrationhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
