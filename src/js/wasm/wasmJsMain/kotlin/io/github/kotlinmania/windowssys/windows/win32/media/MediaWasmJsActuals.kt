@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.media

import io.github.kotlinmania.windowssys.COpaquePointer

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32MediaNapiAddon(): Boolean

private val _windowsWin32MediaNapiAvailable: Boolean = _initWindowsWin32MediaNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_timeBeginPeriod(p0)")
private external fun _wasm_windowssys_windows_win32_media_timeBeginPeriod(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_timeEndPeriod(p0)")
private external fun _wasm_windowssys_windows_win32_media_timeEndPeriod(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_timeGetDevCaps(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_timeGetDevCaps(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_timeGetSystemTime(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_timeGetSystemTime(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_timeGetTime()")
private external fun _wasm_windowssys_windows_win32_media_timeGetTime(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_timeKillEvent(p0)")
private external fun _wasm_windowssys_windows_win32_media_timeKillEvent(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_timeSetEvent(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_media_timeSetEvent(p0: Int, p1: Int, p2: String, p3: String, p4: Int): Int

public actual fun timeBeginPeriod(uperiod: UInt): UInt =
    if (_windowsWin32MediaNapiAvailable) _wasm_windowssys_windows_win32_media_timeBeginPeriod(uperiod.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timeEndPeriod(uperiod: UInt): UInt =
    if (_windowsWin32MediaNapiAvailable) _wasm_windowssys_windows_win32_media_timeEndPeriod(uperiod.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timeGetDevCaps(ptc: COpaquePointer?, cbtc: UInt): UInt =
    if (_windowsWin32MediaNapiAvailable) _wasm_windowssys_windows_win32_media_timeGetDevCaps((ptc?.value ?: 0L).toString(), cbtc.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timeGetSystemTime(pmmt: COpaquePointer?, cbmmt: UInt): UInt =
    if (_windowsWin32MediaNapiAvailable) _wasm_windowssys_windows_win32_media_timeGetSystemTime((pmmt?.value ?: 0L).toString(), cbmmt.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timeGetTime(): UInt =
    if (_windowsWin32MediaNapiAvailable) _wasm_windowssys_windows_win32_media_timeGetTime().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timeKillEvent(utimerid: UInt): UInt =
    if (_windowsWin32MediaNapiAvailable) _wasm_windowssys_windows_win32_media_timeKillEvent(utimerid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timeSetEvent(udelay: UInt, uresolution: UInt, fptc: Lptimecallback, dwuser: ULong, fuevent: UInt): UInt =
    if (_windowsWin32MediaNapiAvailable) _wasm_windowssys_windows_win32_media_timeSetEvent(udelay.toInt(), uresolution.toInt(), 0L.toString(), dwuser.toString(), fuevent.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
