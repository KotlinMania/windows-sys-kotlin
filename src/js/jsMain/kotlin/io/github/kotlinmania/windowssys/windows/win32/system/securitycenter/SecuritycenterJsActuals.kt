@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.securitycenter

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine

private val _windowsWin32SystemSecuritycenterNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun wscGetAntiMalwareUri(ppszuri: COpaquePointer?): Hresult =
    if (_windowsWin32SystemSecuritycenterNapiAddon != null) (_windowsWin32SystemSecuritycenterNapiAddon.windowssys_windows_win32_system_securitycenter_wscGetAntiMalwareUri((ppszuri?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wscGetSecurityProviderHealth(providers: UInt, phealth: COpaquePointer?): Hresult =
    if (_windowsWin32SystemSecuritycenterNapiAddon != null) (_windowsWin32SystemSecuritycenterNapiAddon.windowssys_windows_win32_system_securitycenter_wscGetSecurityProviderHealth(providers.toInt(), (phealth?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wscQueryAntiMalwareUri(): Hresult =
    if (_windowsWin32SystemSecuritycenterNapiAddon != null) (_windowsWin32SystemSecuritycenterNapiAddon.windowssys_windows_win32_system_securitycenter_wscQueryAntiMalwareUri() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wscRegisterForChanges(reserved: COpaquePointer?, phcallbackregistration: COpaquePointer?, lpcallbackaddress: LpthreadStartRoutine, pcontext: COpaquePointer?): Hresult =
    if (_windowsWin32SystemSecuritycenterNapiAddon != null) (_windowsWin32SystemSecuritycenterNapiAddon.windowssys_windows_win32_system_securitycenter_wscRegisterForChanges((reserved?.value ?: 0L).toString(), (phcallbackregistration?.value ?: 0L).toString(), 0L.toString(), (pcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wscRegisterForUserNotifications(): Hresult =
    if (_windowsWin32SystemSecuritycenterNapiAddon != null) (_windowsWin32SystemSecuritycenterNapiAddon.windowssys_windows_win32_system_securitycenter_wscRegisterForUserNotifications() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wscUnRegisterChanges(hregistrationhandle: Handle): Hresult =
    if (_windowsWin32SystemSecuritycenterNapiAddon != null) (_windowsWin32SystemSecuritycenterNapiAddon.windowssys_windows_win32_system_securitycenter_wscUnRegisterChanges((hregistrationhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
