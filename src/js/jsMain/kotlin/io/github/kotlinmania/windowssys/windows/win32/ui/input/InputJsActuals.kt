@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult

private val _windowsWin32UiInputNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun defRawInputProc(parawinput: COpaquePointer?, ninput: Int, cbsizeheader: UInt): Lresult =
    if (_windowsWin32UiInputNapiAddon != null) (_windowsWin32UiInputNapiAddon.windowssys_windows_win32_ui_input_defRawInputProc((parawinput?.value ?: 0L).toString(), ninput, cbsizeheader.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCIMSSM(inputmessagesource: COpaquePointer?): Bool =
    if (_windowsWin32UiInputNapiAddon != null) (_windowsWin32UiInputNapiAddon.windowssys_windows_win32_ui_input_getCIMSSM((inputmessagesource?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentInputMessageSource(inputmessagesource: COpaquePointer?): Bool =
    if (_windowsWin32UiInputNapiAddon != null) (_windowsWin32UiInputNapiAddon.windowssys_windows_win32_ui_input_getCurrentInputMessageSource((inputmessagesource?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRawInputBuffer(pdata: COpaquePointer?, pcbsize: COpaquePointer?, cbsizeheader: UInt): UInt =
    if (_windowsWin32UiInputNapiAddon != null) (_windowsWin32UiInputNapiAddon.windowssys_windows_win32_ui_input_getRawInputBuffer((pdata?.value ?: 0L).toString(), (pcbsize?.value ?: 0L).toString(), cbsizeheader.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRawInputData(hrawinput: Hrawinput, uicommand: RawInputDataCommandFlags, pdata: COpaquePointer?, pcbsize: COpaquePointer?, cbsizeheader: UInt): UInt =
    if (_windowsWin32UiInputNapiAddon != null) (_windowsWin32UiInputNapiAddon.windowssys_windows_win32_ui_input_getRawInputData((hrawinput?.value ?: 0L).toString(), uicommand.toInt(), (pdata?.value ?: 0L).toString(), (pcbsize?.value ?: 0L).toString(), cbsizeheader.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRawInputDeviceInfoA(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: COpaquePointer?, pcbsize: COpaquePointer?): UInt =
    if (_windowsWin32UiInputNapiAddon != null) (_windowsWin32UiInputNapiAddon.windowssys_windows_win32_ui_input_getRawInputDeviceInfoA((hdevice?.value ?: 0L).toString(), uicommand.toInt(), (pdata?.value ?: 0L).toString(), (pcbsize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRawInputDeviceInfoW(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: COpaquePointer?, pcbsize: COpaquePointer?): UInt =
    if (_windowsWin32UiInputNapiAddon != null) (_windowsWin32UiInputNapiAddon.windowssys_windows_win32_ui_input_getRawInputDeviceInfoW((hdevice?.value ?: 0L).toString(), uicommand.toInt(), (pdata?.value ?: 0L).toString(), (pcbsize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRawInputDeviceList(prawinputdevicelist: COpaquePointer?, puinumdevices: COpaquePointer?, cbsize: UInt): UInt =
    if (_windowsWin32UiInputNapiAddon != null) (_windowsWin32UiInputNapiAddon.windowssys_windows_win32_ui_input_getRawInputDeviceList((prawinputdevicelist?.value ?: 0L).toString(), (puinumdevices?.value ?: 0L).toString(), cbsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRegisteredRawInputDevices(prawinputdevices: COpaquePointer?, puinumdevices: COpaquePointer?, cbsize: UInt): UInt =
    if (_windowsWin32UiInputNapiAddon != null) (_windowsWin32UiInputNapiAddon.windowssys_windows_win32_ui_input_getRegisteredRawInputDevices((prawinputdevices?.value ?: 0L).toString(), (puinumdevices?.value ?: 0L).toString(), cbsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerRawInputDevices(prawinputdevices: COpaquePointer?, uinumdevices: UInt, cbsize: UInt): Bool =
    if (_windowsWin32UiInputNapiAddon != null) (_windowsWin32UiInputNapiAddon.windowssys_windows_win32_ui_input_registerRawInputDevices((prawinputdevices?.value ?: 0L).toString(), uinumdevices.toInt(), cbsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
