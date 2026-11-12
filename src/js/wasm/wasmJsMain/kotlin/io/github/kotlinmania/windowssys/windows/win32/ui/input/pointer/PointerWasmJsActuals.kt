@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Hsyntheticpointerdevice
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.PointerDeviceCursorInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.PointerDeviceInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.PointerDeviceProperty
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.PointerTypeInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.PointerInputType

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32UiInputPointerNapiAddon(): Boolean

private val windowsWin32UiInputPointerNapiAvailable: Boolean = initWindowsWin32UiInputPointerNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerEnableMouseInPointer(p0)")
private external fun wasmWindowssysWindowsWin32UiInputPointerEnableMouseInPointer(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerGetPointerCursorId(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputPointerGetPointerCursorId(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerGetPointerDevice(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputPointerGetPointerDevice(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerGetPointerDeviceCursors(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputPointerGetPointerDeviceCursors(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerGetPointerDeviceProperties(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputPointerGetPointerDeviceProperties(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerGetPointerDeviceRects(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputPointerGetPointerDeviceRects(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerGetPointerDevices(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputPointerGetPointerDevices(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerGetPointerFrameInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputPointerGetPointerFrameInfo(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerGetPointerFrameInfoHistory(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputPointerGetPointerFrameInfoHistory(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerGetPointerFramePenInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputPointerGetPointerFramePenInfo(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerGetPointerFramePenInfoHistory(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputPointerGetPointerFramePenInfoHistory(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerGetPointerFrameTouchInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputPointerGetPointerFrameTouchInfo(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerGetPointerFrameTouchInfoHistory(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputPointerGetPointerFrameTouchInfoHistory(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerGetPointerInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputPointerGetPointerInfo(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerGetPointerInfoHistory(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputPointerGetPointerInfoHistory(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerGetPointerInputTransform(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputPointerGetPointerInputTransform(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerGetPointerPenInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputPointerGetPointerPenInfo(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerGetPointerPenInfoHistory(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputPointerGetPointerPenInfoHistory(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerGetPointerTouchInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputPointerGetPointerTouchInfo(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerGetPointerTouchInfoHistory(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputPointerGetPointerTouchInfoHistory(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerGetPointerType(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputPointerGetPointerType(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerGetRawPointerDeviceData(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiInputPointerGetRawPointerDeviceData(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerGetUnpredictedMessagePos()")
private external fun wasmWindowssysWindowsWin32UiInputPointerGetUnpredictedMessagePos(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerInitializeTouchInjection(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputPointerInitializeTouchInjection(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerInjectSyntheticPointerInput(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputPointerInjectSyntheticPointerInput(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerInjectTouchInput(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputPointerInjectTouchInput(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerIsMouseInPointerEnabled()")
private external fun wasmWindowssysWindowsWin32UiInputPointerIsMouseInPointerEnabled(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputPointerSkipPointerFrameMessages(p0)")
private external fun wasmWindowssysWindowsWin32UiInputPointerSkipPointerFrameMessages(p0: Int): Int

public actual fun enableMouseInPointer(fenable: Bool): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerEnableMouseInPointer(fenable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerCursorId(pointerid: UInt, cursorid: MutPtr<UInt>): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerGetPointerCursorId(pointerid.toInt(), cursorid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerDevice(device: Handle, pointerdevice: MutPtr<PointerDeviceInfo>): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerGetPointerDevice(device.rawAddress.toString(), pointerdevice.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerDeviceCursors(device: Handle, cursorcount: MutPtr<UInt>, devicecursors: MutPtr<PointerDeviceCursorInfo>): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerGetPointerDeviceCursors(device.rawAddress.toString(), cursorcount.rawAddress.toString(), devicecursors.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerDeviceProperties(device: Handle, propertycount: MutPtr<UInt>, pointerproperties: MutPtr<PointerDeviceProperty>): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerGetPointerDeviceProperties(device.rawAddress.toString(), propertycount.rawAddress.toString(), pointerproperties.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerDeviceRects(device: Handle, pointerdevicerect: MutPtr<Rect>, displayrect: MutPtr<Rect>): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerGetPointerDeviceRects(device.rawAddress.toString(), pointerdevicerect.rawAddress.toString(), displayrect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerDevices(devicecount: MutPtr<UInt>, pointerdevices: MutPtr<PointerDeviceInfo>): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerGetPointerDevices(devicecount.rawAddress.toString(), pointerdevices.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerFrameInfo(pointerid: UInt, pointercount: MutPtr<UInt>, pointerinfo: MutPtr<PointerInfo>): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerGetPointerFrameInfo(pointerid.toInt(), pointercount.rawAddress.toString(), pointerinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerFrameInfoHistory(pointerid: UInt, entriescount: MutPtr<UInt>, pointercount: MutPtr<UInt>, pointerinfo: MutPtr<PointerInfo>): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerGetPointerFrameInfoHistory(pointerid.toInt(), entriescount.rawAddress.toString(), pointercount.rawAddress.toString(), pointerinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerFramePenInfo(pointerid: UInt, pointercount: MutPtr<UInt>, peninfo: MutPtr<PointerPenInfo>): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerGetPointerFramePenInfo(pointerid.toInt(), pointercount.rawAddress.toString(), peninfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerFramePenInfoHistory(pointerid: UInt, entriescount: MutPtr<UInt>, pointercount: MutPtr<UInt>, peninfo: MutPtr<PointerPenInfo>): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerGetPointerFramePenInfoHistory(pointerid.toInt(), entriescount.rawAddress.toString(), pointercount.rawAddress.toString(), peninfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerFrameTouchInfo(pointerid: UInt, pointercount: MutPtr<UInt>, touchinfo: MutPtr<PointerTouchInfo>): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerGetPointerFrameTouchInfo(pointerid.toInt(), pointercount.rawAddress.toString(), touchinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerFrameTouchInfoHistory(pointerid: UInt, entriescount: MutPtr<UInt>, pointercount: MutPtr<UInt>, touchinfo: MutPtr<PointerTouchInfo>): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerGetPointerFrameTouchInfoHistory(pointerid.toInt(), entriescount.rawAddress.toString(), pointercount.rawAddress.toString(), touchinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerInfo(pointerid: UInt, pointerinfo: MutPtr<PointerInfo>): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerGetPointerInfo(pointerid.toInt(), pointerinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerInfoHistory(pointerid: UInt, entriescount: MutPtr<UInt>, pointerinfo: MutPtr<PointerInfo>): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerGetPointerInfoHistory(pointerid.toInt(), entriescount.rawAddress.toString(), pointerinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerInputTransform(pointerid: UInt, historycount: UInt, inputtransform: MutPtr<InputTransform>): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerGetPointerInputTransform(pointerid.toInt(), historycount.toInt(), inputtransform.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerPenInfo(pointerid: UInt, peninfo: MutPtr<PointerPenInfo>): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerGetPointerPenInfo(pointerid.toInt(), peninfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerPenInfoHistory(pointerid: UInt, entriescount: MutPtr<UInt>, peninfo: MutPtr<PointerPenInfo>): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerGetPointerPenInfoHistory(pointerid.toInt(), entriescount.rawAddress.toString(), peninfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerTouchInfo(pointerid: UInt, touchinfo: MutPtr<PointerTouchInfo>): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerGetPointerTouchInfo(pointerid.toInt(), touchinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerTouchInfoHistory(pointerid: UInt, entriescount: MutPtr<UInt>, touchinfo: MutPtr<PointerTouchInfo>): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerGetPointerTouchInfoHistory(pointerid.toInt(), entriescount.rawAddress.toString(), touchinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerType(pointerid: UInt, pointertype: MutPtr<PointerInputType>): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerGetPointerType(pointerid.toInt(), pointertype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRawPointerDeviceData(pointerid: UInt, historycount: UInt, propertiescount: UInt, pproperties: ConstPtr<PointerDeviceProperty>, pvalues: MutPtr<Int>): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerGetRawPointerDeviceData(pointerid.toInt(), historycount.toInt(), propertiescount.toInt(), pproperties.rawAddress.toString(), pvalues.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUnpredictedMessagePos(): UInt =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerGetUnpredictedMessagePos().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeTouchInjection(maxcount: UInt, dwmode: TouchFeedbackMode): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerInitializeTouchInjection(maxcount.toInt(), dwmode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun injectSyntheticPointerInput(device: Hsyntheticpointerdevice, pointerinfo: ConstPtr<PointerTypeInfo>, count: UInt): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerInjectSyntheticPointerInput(device.rawAddress.toString(), pointerinfo.rawAddress.toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun injectTouchInput(count: UInt, contacts: ConstPtr<PointerTouchInfo>): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerInjectTouchInput(count.toInt(), contacts.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isMouseInPointerEnabled(): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerIsMouseInPointerEnabled() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun skipPointerFrameMessages(pointerid: UInt): Bool =
    if (windowsWin32UiInputPointerNapiAvailable) wasmWindowssysWindowsWin32UiInputPointerSkipPointerFrameMessages(pointerid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
