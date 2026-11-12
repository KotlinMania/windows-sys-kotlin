@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventnotificationservice

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

private val windowsWin32SystemEventnotificationserviceNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun isDestinationReachableA(lpszdestination: Pcstr, lpqocinfo: MutPtr): Bool =
    if (windowsWin32SystemEventnotificationserviceNapiAddon != null) (windowsWin32SystemEventnotificationserviceNapiAddon.windowssysWindowsWin32SystemEventnotificationserviceIsDestinationReachableA(lpszdestination.rawAddress.toString(), lpqocinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDestinationReachableW(lpszdestination: Pcwstr, lpqocinfo: MutPtr): Bool =
    if (windowsWin32SystemEventnotificationserviceNapiAddon != null) (windowsWin32SystemEventnotificationserviceNapiAddon.windowssysWindowsWin32SystemEventnotificationserviceIsDestinationReachableW(lpszdestination.rawAddress.toString(), lpqocinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isNetworkAlive(lpdwflags: MutPtr): Bool =
    if (windowsWin32SystemEventnotificationserviceNapiAddon != null) (windowsWin32SystemEventnotificationserviceNapiAddon.windowssysWindowsWin32SystemEventnotificationserviceIsNetworkAlive(lpdwflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
