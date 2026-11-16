@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media

import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val windowsWin32MediaNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun timeBeginPeriod(uperiod: UInt): UInt =
    if (windowsWin32MediaNapiAddon != null) (windowsWin32MediaNapiAddon.windowssysWindowsWin32MediaTimeBeginPeriod(uperiod.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timeEndPeriod(uperiod: UInt): UInt =
    if (windowsWin32MediaNapiAddon != null) (windowsWin32MediaNapiAddon.windowssysWindowsWin32MediaTimeEndPeriod(uperiod.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timeGetDevCaps(ptc: MutPtr, cbtc: UInt): UInt =
    if (windowsWin32MediaNapiAddon != null) (windowsWin32MediaNapiAddon.windowssysWindowsWin32MediaTimeGetDevCaps(ptc.rawAddress.toString(), cbtc.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timeGetSystemTime(pmmt: MutPtr, cbmmt: UInt): UInt =
    if (windowsWin32MediaNapiAddon != null) (windowsWin32MediaNapiAddon.windowssysWindowsWin32MediaTimeGetSystemTime(pmmt.rawAddress.toString(), cbmmt.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timeGetTime(): UInt =
    if (windowsWin32MediaNapiAddon != null) (windowsWin32MediaNapiAddon.windowssysWindowsWin32MediaTimeGetTime() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timeKillEvent(utimerid: UInt): UInt =
    if (windowsWin32MediaNapiAddon != null) (windowsWin32MediaNapiAddon.windowssysWindowsWin32MediaTimeKillEvent(utimerid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timeSetEvent(udelay: UInt, uresolution: UInt, fptc: Lptimecallback, dwuser: ULong, fuevent: UInt): UInt =
    if (windowsWin32MediaNapiAddon != null) (windowsWin32MediaNapiAddon.windowssysWindowsWin32MediaTimeSetEvent(udelay.toInt(), uresolution.toInt(), 0L.toString(), dwuser.toString(), fuevent.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
