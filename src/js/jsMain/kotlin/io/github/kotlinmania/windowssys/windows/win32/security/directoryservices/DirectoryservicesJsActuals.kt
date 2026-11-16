@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.directoryservices

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam

private val windowsWin32SecurityDirectoryservicesNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun dSCreateSecurityPage(pwszobjectpath: Pcwstr, pwszobjectclass: Pcwstr, dwflags: UInt, phpage: MutPtr, pfnreadsd: Pfnreadobjectsecurity, pfnwritesd: Pfnwriteobjectsecurity, lpcontext: Lparam): Hresult =
    if (windowsWin32SecurityDirectoryservicesNapiAddon != null) (windowsWin32SecurityDirectoryservicesNapiAddon.windowssysWindowsWin32SecurityDirectoryservicesDSCreateSecurityPage(pwszobjectpath.rawAddress.toString(), pwszobjectclass.rawAddress.toString(), dwflags.toInt(), phpage.rawAddress.toString(), 0L.toString(), 0L.toString(), lpcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dSEditSecurity(hwndowner: Hwnd, pwszobjectpath: Pcwstr, pwszobjectclass: Pcwstr, dwflags: UInt, pwszcaption: Pcwstr, pfnreadsd: Pfnreadobjectsecurity, pfnwritesd: Pfnwriteobjectsecurity, lpcontext: Lparam): Hresult =
    if (windowsWin32SecurityDirectoryservicesNapiAddon != null) (windowsWin32SecurityDirectoryservicesNapiAddon.windowssysWindowsWin32SecurityDirectoryservicesDSEditSecurity(hwndowner.rawAddress.toString(), pwszobjectpath.rawAddress.toString(), pwszobjectclass.rawAddress.toString(), dwflags.toInt(), pwszcaption.rawAddress.toString(), 0L.toString(), 0L.toString(), lpcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
