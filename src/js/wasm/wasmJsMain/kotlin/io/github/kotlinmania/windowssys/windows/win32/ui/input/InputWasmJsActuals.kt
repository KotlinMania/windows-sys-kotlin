@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32UiInputNapiAddon(): Boolean

private val _windowsWin32UiInputNapiAvailable: Boolean = _initWindowsWin32UiInputNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_defRawInputProc(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_defRawInputProc(p0: String, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_getCIMSSM(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_getCIMSSM(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_getCurrentInputMessageSource(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_getCurrentInputMessageSource(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_getRawInputBuffer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_getRawInputBuffer(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_getRawInputData(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_ui_input_getRawInputData(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_getRawInputDeviceInfoA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_getRawInputDeviceInfoA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_getRawInputDeviceInfoW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_getRawInputDeviceInfoW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_getRawInputDeviceList(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_getRawInputDeviceList(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_getRegisteredRawInputDevices(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_getRegisteredRawInputDevices(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_registerRawInputDevices(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_registerRawInputDevices(p0: String, p1: Int, p2: Int): Int

public actual fun defRawInputProc(parawinput: COpaquePointer?, ninput: Int, cbsizeheader: UInt): Lresult =
    if (_windowsWin32UiInputNapiAvailable) _wasm_windowssys_windows_win32_ui_input_defRawInputProc((parawinput?.value ?: 0L).toString(), ninput, cbsizeheader.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCIMSSM(inputmessagesource: COpaquePointer?): Bool =
    if (_windowsWin32UiInputNapiAvailable) _wasm_windowssys_windows_win32_ui_input_getCIMSSM((inputmessagesource?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentInputMessageSource(inputmessagesource: COpaquePointer?): Bool =
    if (_windowsWin32UiInputNapiAvailable) _wasm_windowssys_windows_win32_ui_input_getCurrentInputMessageSource((inputmessagesource?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRawInputBuffer(pdata: COpaquePointer?, pcbsize: COpaquePointer?, cbsizeheader: UInt): UInt =
    if (_windowsWin32UiInputNapiAvailable) _wasm_windowssys_windows_win32_ui_input_getRawInputBuffer((pdata?.value ?: 0L).toString(), (pcbsize?.value ?: 0L).toString(), cbsizeheader.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRawInputData(hrawinput: Hrawinput, uicommand: RawInputDataCommandFlags, pdata: COpaquePointer?, pcbsize: COpaquePointer?, cbsizeheader: UInt): UInt =
    if (_windowsWin32UiInputNapiAvailable) _wasm_windowssys_windows_win32_ui_input_getRawInputData((hrawinput?.value ?: 0L).toString(), uicommand.toInt(), (pdata?.value ?: 0L).toString(), (pcbsize?.value ?: 0L).toString(), cbsizeheader.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRawInputDeviceInfoA(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: COpaquePointer?, pcbsize: COpaquePointer?): UInt =
    if (_windowsWin32UiInputNapiAvailable) _wasm_windowssys_windows_win32_ui_input_getRawInputDeviceInfoA((hdevice?.value ?: 0L).toString(), uicommand.toInt(), (pdata?.value ?: 0L).toString(), (pcbsize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRawInputDeviceInfoW(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: COpaquePointer?, pcbsize: COpaquePointer?): UInt =
    if (_windowsWin32UiInputNapiAvailable) _wasm_windowssys_windows_win32_ui_input_getRawInputDeviceInfoW((hdevice?.value ?: 0L).toString(), uicommand.toInt(), (pdata?.value ?: 0L).toString(), (pcbsize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRawInputDeviceList(prawinputdevicelist: COpaquePointer?, puinumdevices: COpaquePointer?, cbsize: UInt): UInt =
    if (_windowsWin32UiInputNapiAvailable) _wasm_windowssys_windows_win32_ui_input_getRawInputDeviceList((prawinputdevicelist?.value ?: 0L).toString(), (puinumdevices?.value ?: 0L).toString(), cbsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRegisteredRawInputDevices(prawinputdevices: COpaquePointer?, puinumdevices: COpaquePointer?, cbsize: UInt): UInt =
    if (_windowsWin32UiInputNapiAvailable) _wasm_windowssys_windows_win32_ui_input_getRegisteredRawInputDevices((prawinputdevices?.value ?: 0L).toString(), (puinumdevices?.value ?: 0L).toString(), cbsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerRawInputDevices(prawinputdevices: COpaquePointer?, uinumdevices: UInt, cbsize: UInt): Bool =
    if (_windowsWin32UiInputNapiAvailable) _wasm_windowssys_windows_win32_ui_input_registerRawInputDevices((prawinputdevices?.value ?: 0L).toString(), uinumdevices.toInt(), cbsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
