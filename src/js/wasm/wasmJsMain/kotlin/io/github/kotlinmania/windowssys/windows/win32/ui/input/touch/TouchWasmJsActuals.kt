@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.touch

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32UiInputTouchNapiAddon(): Boolean

private val windowsWin32UiInputTouchNapiAvailable: Boolean = initWindowsWin32UiInputTouchNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputTouchCloseGestureInfoHandle(p0)")
private external fun wasmWindowssysWindowsWin32UiInputTouchCloseGestureInfoHandle(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputTouchCloseTouchInputHandle(p0)")
private external fun wasmWindowssysWindowsWin32UiInputTouchCloseTouchInputHandle(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputTouchGetGestureConfig(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiInputTouchGetGestureConfig(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputTouchGetGestureExtraArgs(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputTouchGetGestureExtraArgs(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputTouchGetGestureInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputTouchGetGestureInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputTouchGetTouchInputInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputTouchGetTouchInputInfo(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputTouchIsTouchWindow(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputTouchIsTouchWindow(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputTouchRegisterTouchWindow(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputTouchRegisterTouchWindow(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputTouchSetGestureConfig(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiInputTouchSetGestureConfig(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputTouchUnregisterTouchWindow(p0)")
private external fun wasmWindowssysWindowsWin32UiInputTouchUnregisterTouchWindow(p0: String): Int

public actual fun closeGestureInfoHandle(hgestureinfo: Hgestureinfo): Bool =
    if (windowsWin32UiInputTouchNapiAvailable) wasmWindowssysWindowsWin32UiInputTouchCloseGestureInfoHandle(hgestureinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeTouchInputHandle(htouchinput: Htouchinput): Bool =
    if (windowsWin32UiInputTouchNapiAvailable) wasmWindowssysWindowsWin32UiInputTouchCloseTouchInputHandle(htouchinput.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGestureConfig(hwnd: Hwnd, dwreserved: UInt, dwflags: UInt, pcids: ConstPtr, pgestureconfig: MutPtr, cbsize: UInt): Bool =
    if (windowsWin32UiInputTouchNapiAvailable) wasmWindowssysWindowsWin32UiInputTouchGetGestureConfig(hwnd.rawAddress.toString(), dwreserved.toInt(), dwflags.toInt(), pcids.rawAddress.toString(), pgestureconfig.rawAddress.toString(), cbsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGestureExtraArgs(hgestureinfo: Hgestureinfo, cbextraargs: UInt, pextraargs: MutPtr): Bool =
    if (windowsWin32UiInputTouchNapiAvailable) wasmWindowssysWindowsWin32UiInputTouchGetGestureExtraArgs(hgestureinfo.rawAddress.toString(), cbextraargs.toInt(), pextraargs.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGestureInfo(hgestureinfo: Hgestureinfo, pgestureinfo: MutPtr): Bool =
    if (windowsWin32UiInputTouchNapiAvailable) wasmWindowssysWindowsWin32UiInputTouchGetGestureInfo(hgestureinfo.rawAddress.toString(), pgestureinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTouchInputInfo(htouchinput: Htouchinput, cinputs: UInt, pinputs: MutPtr, cbsize: Int): Bool =
    if (windowsWin32UiInputTouchNapiAvailable) wasmWindowssysWindowsWin32UiInputTouchGetTouchInputInfo(htouchinput.rawAddress.toString(), cinputs.toInt(), pinputs.rawAddress.toString(), cbsize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isTouchWindow(hwnd: Hwnd, pulflags: MutPtr): Bool =
    if (windowsWin32UiInputTouchNapiAvailable) wasmWindowssysWindowsWin32UiInputTouchIsTouchWindow(hwnd.rawAddress.toString(), pulflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerTouchWindow(hwnd: Hwnd, ulflags: RegisterTouchWindowFlags): Bool =
    if (windowsWin32UiInputTouchNapiAvailable) wasmWindowssysWindowsWin32UiInputTouchRegisterTouchWindow(hwnd.rawAddress.toString(), ulflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setGestureConfig(hwnd: Hwnd, dwreserved: UInt, cids: UInt, pgestureconfig: ConstPtr, cbsize: UInt): Bool =
    if (windowsWin32UiInputTouchNapiAvailable) wasmWindowssysWindowsWin32UiInputTouchSetGestureConfig(hwnd.rawAddress.toString(), dwreserved.toInt(), cids.toInt(), pgestureconfig.rawAddress.toString(), cbsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterTouchWindow(hwnd: Hwnd): Bool =
    if (windowsWin32UiInputTouchNapiAvailable) wasmWindowssysWindowsWin32UiInputTouchUnregisterTouchWindow(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
