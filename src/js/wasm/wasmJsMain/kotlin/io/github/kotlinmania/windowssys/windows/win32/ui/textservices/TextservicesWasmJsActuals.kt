@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.textservices

import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32UiTextservicesNapiAddon(): Boolean

private val windowsWin32UiTextservicesNapiAvailable: Boolean = initWindowsWin32UiTextservicesNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTextservicesDoMsCtfMonitor(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiTextservicesDoMsCtfMonitor(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTextservicesInitLocalMsCtfMonitor(p0)")
private external fun wasmWindowssysWindowsWin32UiTextservicesInitLocalMsCtfMonitor(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTextservicesUninitLocalMsCtfMonitor()")
private external fun wasmWindowssysWindowsWin32UiTextservicesUninitLocalMsCtfMonitor(): Int

public actual fun doMsCtfMonitor(dwflags: UInt, heventforservicestop: Handle): Bool =
    if (windowsWin32UiTextservicesNapiAvailable) wasmWindowssysWindowsWin32UiTextservicesDoMsCtfMonitor(dwflags.toInt(), heventforservicestop.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initLocalMsCtfMonitor(dwflags: UInt): Hresult =
    if (windowsWin32UiTextservicesNapiAvailable) wasmWindowssysWindowsWin32UiTextservicesInitLocalMsCtfMonitor(dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uninitLocalMsCtfMonitor(): Hresult =
    if (windowsWin32UiTextservicesNapiAvailable) wasmWindowssysWindowsWin32UiTextservicesUninitLocalMsCtfMonitor() else throw UnsupportedOperationException("Native FFI addon is not available")
