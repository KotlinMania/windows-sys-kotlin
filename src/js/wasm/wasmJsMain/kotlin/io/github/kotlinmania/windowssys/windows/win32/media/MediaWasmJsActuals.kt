@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.media

import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32MediaNapiAddon(): Boolean

private val windowsWin32MediaNapiAvailable: Boolean = initWindowsWin32MediaNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaTimeBeginPeriod(p0)")
private external fun wasmWindowssysWindowsWin32MediaTimeBeginPeriod(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaTimeEndPeriod(p0)")
private external fun wasmWindowssysWindowsWin32MediaTimeEndPeriod(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaTimeGetDevCaps(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaTimeGetDevCaps(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaTimeGetSystemTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaTimeGetSystemTime(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaTimeGetTime()")
private external fun wasmWindowssysWindowsWin32MediaTimeGetTime(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaTimeKillEvent(p0)")
private external fun wasmWindowssysWindowsWin32MediaTimeKillEvent(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaTimeSetEvent(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaTimeSetEvent(p0: Int, p1: Int, p2: String, p3: String, p4: Int): Int

public actual fun timeBeginPeriod(uperiod: UInt): UInt =
    if (windowsWin32MediaNapiAvailable) wasmWindowssysWindowsWin32MediaTimeBeginPeriod(uperiod.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timeEndPeriod(uperiod: UInt): UInt =
    if (windowsWin32MediaNapiAvailable) wasmWindowssysWindowsWin32MediaTimeEndPeriod(uperiod.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timeGetDevCaps(ptc: MutPtr, cbtc: UInt): UInt =
    if (windowsWin32MediaNapiAvailable) wasmWindowssysWindowsWin32MediaTimeGetDevCaps(ptc.rawAddress.toString(), cbtc.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timeGetSystemTime(pmmt: MutPtr, cbmmt: UInt): UInt =
    if (windowsWin32MediaNapiAvailable) wasmWindowssysWindowsWin32MediaTimeGetSystemTime(pmmt.rawAddress.toString(), cbmmt.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timeGetTime(): UInt =
    if (windowsWin32MediaNapiAvailable) wasmWindowssysWindowsWin32MediaTimeGetTime().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timeKillEvent(utimerid: UInt): UInt =
    if (windowsWin32MediaNapiAvailable) wasmWindowssysWindowsWin32MediaTimeKillEvent(utimerid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timeSetEvent(udelay: UInt, uresolution: UInt, fptc: Lptimecallback, dwuser: ULong, fuevent: UInt): UInt =
    if (windowsWin32MediaNapiAvailable) wasmWindowssysWindowsWin32MediaTimeSetEvent(udelay.toInt(), uresolution.toInt(), 0L.toString(), dwuser.toString(), fuevent.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
