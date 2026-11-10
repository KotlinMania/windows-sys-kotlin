@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Hsyntheticpointerdevice

private val _windowsWin32UiInputPointerNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun enableMouseInPointer(fenable: Bool): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_enableMouseInPointer(fenable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerCursorId(pointerid: UInt, cursorid: COpaquePointer?): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_getPointerCursorId(pointerid.toInt(), (cursorid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerDevice(device: Handle, pointerdevice: COpaquePointer?): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_getPointerDevice((device?.value ?: 0L).toString(), (pointerdevice?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerDeviceCursors(device: Handle, cursorcount: COpaquePointer?, devicecursors: COpaquePointer?): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_getPointerDeviceCursors((device?.value ?: 0L).toString(), (cursorcount?.value ?: 0L).toString(), (devicecursors?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerDeviceProperties(device: Handle, propertycount: COpaquePointer?, pointerproperties: COpaquePointer?): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_getPointerDeviceProperties((device?.value ?: 0L).toString(), (propertycount?.value ?: 0L).toString(), (pointerproperties?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerDeviceRects(device: Handle, pointerdevicerect: COpaquePointer?, displayrect: COpaquePointer?): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_getPointerDeviceRects((device?.value ?: 0L).toString(), (pointerdevicerect?.value ?: 0L).toString(), (displayrect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerDevices(devicecount: COpaquePointer?, pointerdevices: COpaquePointer?): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_getPointerDevices((devicecount?.value ?: 0L).toString(), (pointerdevices?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerFrameInfo(pointerid: UInt, pointercount: COpaquePointer?, pointerinfo: COpaquePointer?): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_getPointerFrameInfo(pointerid.toInt(), (pointercount?.value ?: 0L).toString(), (pointerinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerFrameInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, pointercount: COpaquePointer?, pointerinfo: COpaquePointer?): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_getPointerFrameInfoHistory(pointerid.toInt(), (entriescount?.value ?: 0L).toString(), (pointercount?.value ?: 0L).toString(), (pointerinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerFramePenInfo(pointerid: UInt, pointercount: COpaquePointer?, peninfo: COpaquePointer?): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_getPointerFramePenInfo(pointerid.toInt(), (pointercount?.value ?: 0L).toString(), (peninfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerFramePenInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, pointercount: COpaquePointer?, peninfo: COpaquePointer?): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_getPointerFramePenInfoHistory(pointerid.toInt(), (entriescount?.value ?: 0L).toString(), (pointercount?.value ?: 0L).toString(), (peninfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerFrameTouchInfo(pointerid: UInt, pointercount: COpaquePointer?, touchinfo: COpaquePointer?): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_getPointerFrameTouchInfo(pointerid.toInt(), (pointercount?.value ?: 0L).toString(), (touchinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerFrameTouchInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, pointercount: COpaquePointer?, touchinfo: COpaquePointer?): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_getPointerFrameTouchInfoHistory(pointerid.toInt(), (entriescount?.value ?: 0L).toString(), (pointercount?.value ?: 0L).toString(), (touchinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerInfo(pointerid: UInt, pointerinfo: COpaquePointer?): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_getPointerInfo(pointerid.toInt(), (pointerinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, pointerinfo: COpaquePointer?): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_getPointerInfoHistory(pointerid.toInt(), (entriescount?.value ?: 0L).toString(), (pointerinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerInputTransform(pointerid: UInt, historycount: UInt, inputtransform: COpaquePointer?): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_getPointerInputTransform(pointerid.toInt(), historycount.toInt(), (inputtransform?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerPenInfo(pointerid: UInt, peninfo: COpaquePointer?): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_getPointerPenInfo(pointerid.toInt(), (peninfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerPenInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, peninfo: COpaquePointer?): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_getPointerPenInfoHistory(pointerid.toInt(), (entriescount?.value ?: 0L).toString(), (peninfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerTouchInfo(pointerid: UInt, touchinfo: COpaquePointer?): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_getPointerTouchInfo(pointerid.toInt(), (touchinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerTouchInfoHistory(pointerid: UInt, entriescount: COpaquePointer?, touchinfo: COpaquePointer?): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_getPointerTouchInfoHistory(pointerid.toInt(), (entriescount?.value ?: 0L).toString(), (touchinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPointerType(pointerid: UInt, pointertype: COpaquePointer?): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_getPointerType(pointerid.toInt(), (pointertype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRawPointerDeviceData(pointerid: UInt, historycount: UInt, propertiescount: UInt, pproperties: COpaquePointer?, pvalues: COpaquePointer?): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_getRawPointerDeviceData(pointerid.toInt(), historycount.toInt(), propertiescount.toInt(), (pproperties?.value ?: 0L).toString(), (pvalues?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUnpredictedMessagePos(): UInt =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_getUnpredictedMessagePos() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeTouchInjection(maxcount: UInt, dwmode: TouchFeedbackMode): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_initializeTouchInjection(maxcount.toInt(), dwmode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun injectSyntheticPointerInput(device: Hsyntheticpointerdevice, pointerinfo: COpaquePointer?, count: UInt): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_injectSyntheticPointerInput((device?.value ?: 0L).toString(), (pointerinfo?.value ?: 0L).toString(), count.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun injectTouchInput(count: UInt, contacts: COpaquePointer?): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_injectTouchInput(count.toInt(), (contacts?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isMouseInPointerEnabled(): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_isMouseInPointerEnabled() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun skipPointerFrameMessages(pointerid: UInt): Bool =
    if (_windowsWin32UiInputPointerNapiAddon != null) (_windowsWin32UiInputPointerNapiAddon.windowssys_windows_win32_ui_input_pointer_skipPointerFrameMessages(pointerid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
