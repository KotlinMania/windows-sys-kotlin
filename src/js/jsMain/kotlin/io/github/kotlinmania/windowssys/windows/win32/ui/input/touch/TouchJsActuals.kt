@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.touch

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private val windowsWin32UiInputTouchNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun closeGestureInfoHandle(hgestureinfo: Hgestureinfo): Bool =
    if (windowsWin32UiInputTouchNapiAddon != null) (windowsWin32UiInputTouchNapiAddon.windowssysWindowsWin32UiInputTouchCloseGestureInfoHandle(hgestureinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeTouchInputHandle(htouchinput: Htouchinput): Bool =
    if (windowsWin32UiInputTouchNapiAddon != null) (windowsWin32UiInputTouchNapiAddon.windowssysWindowsWin32UiInputTouchCloseTouchInputHandle(htouchinput.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGestureConfig(hwnd: Hwnd, dwreserved: UInt, dwflags: UInt, pcids: ConstPtr<UInt>, pgestureconfig: MutPtr<Gestureconfig>, cbsize: UInt): Bool =
    if (windowsWin32UiInputTouchNapiAddon != null) (windowsWin32UiInputTouchNapiAddon.windowssysWindowsWin32UiInputTouchGetGestureConfig(hwnd.rawAddress.toString(), dwreserved.toInt(), dwflags.toInt(), pcids.rawAddress.toString(), pgestureconfig.rawAddress.toString(), cbsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGestureExtraArgs(hgestureinfo: Hgestureinfo, cbextraargs: UInt, pextraargs: MutPtr<UByte>): Bool =
    if (windowsWin32UiInputTouchNapiAddon != null) (windowsWin32UiInputTouchNapiAddon.windowssysWindowsWin32UiInputTouchGetGestureExtraArgs(hgestureinfo.rawAddress.toString(), cbextraargs.toInt(), pextraargs.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGestureInfo(hgestureinfo: Hgestureinfo, pgestureinfo: MutPtr<Gestureinfo>): Bool =
    if (windowsWin32UiInputTouchNapiAddon != null) (windowsWin32UiInputTouchNapiAddon.windowssysWindowsWin32UiInputTouchGetGestureInfo(hgestureinfo.rawAddress.toString(), pgestureinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTouchInputInfo(htouchinput: Htouchinput, cinputs: UInt, pinputs: MutPtr<Touchinput>, cbsize: Int): Bool =
    if (windowsWin32UiInputTouchNapiAddon != null) (windowsWin32UiInputTouchNapiAddon.windowssysWindowsWin32UiInputTouchGetTouchInputInfo(htouchinput.rawAddress.toString(), cinputs.toInt(), pinputs.rawAddress.toString(), cbsize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isTouchWindow(hwnd: Hwnd, pulflags: MutPtr<UInt>): Bool =
    if (windowsWin32UiInputTouchNapiAddon != null) (windowsWin32UiInputTouchNapiAddon.windowssysWindowsWin32UiInputTouchIsTouchWindow(hwnd.rawAddress.toString(), pulflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerTouchWindow(hwnd: Hwnd, ulflags: RegisterTouchWindowFlags): Bool =
    if (windowsWin32UiInputTouchNapiAddon != null) (windowsWin32UiInputTouchNapiAddon.windowssysWindowsWin32UiInputTouchRegisterTouchWindow(hwnd.rawAddress.toString(), ulflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setGestureConfig(hwnd: Hwnd, dwreserved: UInt, cids: UInt, pgestureconfig: ConstPtr<Gestureconfig>, cbsize: UInt): Bool =
    if (windowsWin32UiInputTouchNapiAddon != null) (windowsWin32UiInputTouchNapiAddon.windowssysWindowsWin32UiInputTouchSetGestureConfig(hwnd.rawAddress.toString(), dwreserved.toInt(), cids.toInt(), pgestureconfig.rawAddress.toString(), cbsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterTouchWindow(hwnd: Hwnd): Bool =
    if (windowsWin32UiInputTouchNapiAddon != null) (windowsWin32UiInputTouchNapiAddon.windowssysWindowsWin32UiInputTouchUnregisterTouchWindow(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
