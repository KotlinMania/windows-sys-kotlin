@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Hsyntheticpointerdevice

private val windowsWin32UiInputPointerNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun enableMouseInPointer(fenable: Bool): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerEnableMouseInPointer(fenable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerCursorId(pointerid: UInt, cursorid: MutPtr): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerGetPointerCursorId(pointerid.toInt(), cursorid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerDevice(device: Handle, pointerdevice: MutPtr): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerGetPointerDevice(device.rawAddress.toString(), pointerdevice.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerDeviceCursors(device: Handle, cursorcount: MutPtr, devicecursors: MutPtr): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerGetPointerDeviceCursors(device.rawAddress.toString(), cursorcount.rawAddress.toString(), devicecursors.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerDeviceProperties(device: Handle, propertycount: MutPtr, pointerproperties: MutPtr): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerGetPointerDeviceProperties(device.rawAddress.toString(), propertycount.rawAddress.toString(), pointerproperties.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerDeviceRects(device: Handle, pointerdevicerect: MutPtr, displayrect: MutPtr): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerGetPointerDeviceRects(device.rawAddress.toString(), pointerdevicerect.rawAddress.toString(), displayrect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerDevices(devicecount: MutPtr, pointerdevices: MutPtr): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerGetPointerDevices(devicecount.rawAddress.toString(), pointerdevices.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerFrameInfo(pointerid: UInt, pointercount: MutPtr, pointerinfo: MutPtr): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerGetPointerFrameInfo(pointerid.toInt(), pointercount.rawAddress.toString(), pointerinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerFrameInfoHistory(pointerid: UInt, entriescount: MutPtr, pointercount: MutPtr, pointerinfo: MutPtr): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerGetPointerFrameInfoHistory(pointerid.toInt(), entriescount.rawAddress.toString(), pointercount.rawAddress.toString(), pointerinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerFramePenInfo(pointerid: UInt, pointercount: MutPtr, peninfo: MutPtr): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerGetPointerFramePenInfo(pointerid.toInt(), pointercount.rawAddress.toString(), peninfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerFramePenInfoHistory(pointerid: UInt, entriescount: MutPtr, pointercount: MutPtr, peninfo: MutPtr): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerGetPointerFramePenInfoHistory(pointerid.toInt(), entriescount.rawAddress.toString(), pointercount.rawAddress.toString(), peninfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerFrameTouchInfo(pointerid: UInt, pointercount: MutPtr, touchinfo: MutPtr): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerGetPointerFrameTouchInfo(pointerid.toInt(), pointercount.rawAddress.toString(), touchinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerFrameTouchInfoHistory(pointerid: UInt, entriescount: MutPtr, pointercount: MutPtr, touchinfo: MutPtr): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerGetPointerFrameTouchInfoHistory(pointerid.toInt(), entriescount.rawAddress.toString(), pointercount.rawAddress.toString(), touchinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerInfo(pointerid: UInt, pointerinfo: MutPtr): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerGetPointerInfo(pointerid.toInt(), pointerinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerInfoHistory(pointerid: UInt, entriescount: MutPtr, pointerinfo: MutPtr): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerGetPointerInfoHistory(pointerid.toInt(), entriescount.rawAddress.toString(), pointerinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerInputTransform(pointerid: UInt, historycount: UInt, inputtransform: MutPtr): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerGetPointerInputTransform(pointerid.toInt(), historycount.toInt(), inputtransform.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerPenInfo(pointerid: UInt, peninfo: MutPtr): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerGetPointerPenInfo(pointerid.toInt(), peninfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerPenInfoHistory(pointerid: UInt, entriescount: MutPtr, peninfo: MutPtr): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerGetPointerPenInfoHistory(pointerid.toInt(), entriescount.rawAddress.toString(), peninfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerTouchInfo(pointerid: UInt, touchinfo: MutPtr): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerGetPointerTouchInfo(pointerid.toInt(), touchinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerTouchInfoHistory(pointerid: UInt, entriescount: MutPtr, touchinfo: MutPtr): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerGetPointerTouchInfoHistory(pointerid.toInt(), entriescount.rawAddress.toString(), touchinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerType(pointerid: UInt, pointertype: MutPtr): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerGetPointerType(pointerid.toInt(), pointertype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRawPointerDeviceData(pointerid: UInt, historycount: UInt, propertiescount: UInt, pproperties: ConstPtr, pvalues: MutPtr): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerGetRawPointerDeviceData(pointerid.toInt(), historycount.toInt(), propertiescount.toInt(), pproperties.rawAddress.toString(), pvalues.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUnpredictedMessagePos(): UInt =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerGetUnpredictedMessagePos() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeTouchInjection(maxcount: UInt, dwmode: TouchFeedbackMode): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerInitializeTouchInjection(maxcount.toInt(), dwmode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun injectSyntheticPointerInput(device: Hsyntheticpointerdevice, pointerinfo: ConstPtr, count: UInt): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerInjectSyntheticPointerInput(device.rawAddress.toString(), pointerinfo.rawAddress.toString(), count.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun injectTouchInput(count: UInt, contacts: ConstPtr): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerInjectTouchInput(count.toInt(), contacts.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isMouseInPointerEnabled(): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerIsMouseInPointerEnabled() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun skipPointerFrameMessages(pointerid: UInt): Bool =
    if (windowsWin32UiInputPointerNapiAddon != null) (windowsWin32UiInputPointerNapiAddon.windowssysWindowsWin32UiInputPointerSkipPointerFrameMessages(pointerid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
