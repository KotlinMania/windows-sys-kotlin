@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32UiInputXboxcontrollerNapiAddon(): Boolean

private val _windowsWin32UiInputXboxcontrollerNapiAvailable: Boolean = _initWindowsWin32UiInputXboxcontrollerNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_xboxcontroller_xInputEnable(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_xboxcontroller_xInputEnable(p0: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_xboxcontroller_xInputGetAudioDeviceIds(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_ui_input_xboxcontroller_xInputGetAudioDeviceIds(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_xboxcontroller_xInputGetBatteryInformation(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_xboxcontroller_xInputGetBatteryInformation(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_xboxcontroller_xInputGetCapabilities(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_xboxcontroller_xInputGetCapabilities(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_xboxcontroller_xInputGetKeystroke(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_xboxcontroller_xInputGetKeystroke(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_xboxcontroller_xInputGetState(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_xboxcontroller_xInputGetState(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_xboxcontroller_xInputSetState(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_xboxcontroller_xInputSetState(p0: Int, p1: String): Int

public actual fun xInputEnable(enable: Bool) {
    if (_windowsWin32UiInputXboxcontrollerNapiAvailable) {
        _wasm_windowssys_windows_win32_ui_input_xboxcontroller_xInputEnable(enable)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun xInputGetAudioDeviceIds(dwuserindex: UInt, prenderdeviceid: Pwstr, prendercount: COpaquePointer?, pcapturedeviceid: Pwstr, pcapturecount: COpaquePointer?): UInt =
    if (_windowsWin32UiInputXboxcontrollerNapiAvailable) _wasm_windowssys_windows_win32_ui_input_xboxcontroller_xInputGetAudioDeviceIds(dwuserindex.toInt(), (prenderdeviceid?.value ?: 0L).toString(), (prendercount?.value ?: 0L).toString(), (pcapturedeviceid?.value ?: 0L).toString(), (pcapturecount?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xInputGetBatteryInformation(dwuserindex: UInt, devtype: BatteryDevtype, pbatteryinformation: COpaquePointer?): UInt =
    if (_windowsWin32UiInputXboxcontrollerNapiAvailable) _wasm_windowssys_windows_win32_ui_input_xboxcontroller_xInputGetBatteryInformation(dwuserindex.toInt(), devtype.toInt(), (pbatteryinformation?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xInputGetCapabilities(dwuserindex: UInt, dwflags: XinputFlag, pcapabilities: COpaquePointer?): UInt =
    if (_windowsWin32UiInputXboxcontrollerNapiAvailable) _wasm_windowssys_windows_win32_ui_input_xboxcontroller_xInputGetCapabilities(dwuserindex.toInt(), dwflags.toInt(), (pcapabilities?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xInputGetKeystroke(dwuserindex: UInt, dwreserved: UInt, pkeystroke: COpaquePointer?): UInt =
    if (_windowsWin32UiInputXboxcontrollerNapiAvailable) _wasm_windowssys_windows_win32_ui_input_xboxcontroller_xInputGetKeystroke(dwuserindex.toInt(), dwreserved.toInt(), (pkeystroke?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xInputGetState(dwuserindex: UInt, pstate: COpaquePointer?): UInt =
    if (_windowsWin32UiInputXboxcontrollerNapiAvailable) _wasm_windowssys_windows_win32_ui_input_xboxcontroller_xInputGetState(dwuserindex.toInt(), (pstate?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xInputSetState(dwuserindex: UInt, pvibration: COpaquePointer?): UInt =
    if (_windowsWin32UiInputXboxcontrollerNapiAvailable) _wasm_windowssys_windows_win32_ui_input_xboxcontroller_xInputSetState(dwuserindex.toInt(), (pvibration?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
