@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32UiInputXboxcontrollerNapiAddon(): Boolean

private val windowsWin32UiInputXboxcontrollerNapiAvailable: Boolean = initWindowsWin32UiInputXboxcontrollerNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputXboxcontrollerXInputEnable(p0)")
private external fun wasmWindowssysWindowsWin32UiInputXboxcontrollerXInputEnable(p0: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputXboxcontrollerXInputGetAudioDeviceIds(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiInputXboxcontrollerXInputGetAudioDeviceIds(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputXboxcontrollerXInputGetBatteryInformation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputXboxcontrollerXInputGetBatteryInformation(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputXboxcontrollerXInputGetCapabilities(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputXboxcontrollerXInputGetCapabilities(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputXboxcontrollerXInputGetKeystroke(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputXboxcontrollerXInputGetKeystroke(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputXboxcontrollerXInputGetState(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputXboxcontrollerXInputGetState(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputXboxcontrollerXInputSetState(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputXboxcontrollerXInputSetState(p0: Int, p1: String): Int

public actual fun xInputEnable(enable: Bool) {
    if (windowsWin32UiInputXboxcontrollerNapiAvailable) {
        wasmWindowssysWindowsWin32UiInputXboxcontrollerXInputEnable(enable)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun xInputGetAudioDeviceIds(dwuserindex: UInt, prenderdeviceid: Pwstr, prendercount: MutPtr<UInt>, pcapturedeviceid: Pwstr, pcapturecount: MutPtr<UInt>): UInt =
    if (windowsWin32UiInputXboxcontrollerNapiAvailable) wasmWindowssysWindowsWin32UiInputXboxcontrollerXInputGetAudioDeviceIds(dwuserindex.toInt(), prenderdeviceid.rawAddress.toString(), prendercount.rawAddress.toString(), pcapturedeviceid.rawAddress.toString(), pcapturecount.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xInputGetBatteryInformation(dwuserindex: UInt, devtype: BatteryDevtype, pbatteryinformation: MutPtr<XinputBatteryInformation>): UInt =
    if (windowsWin32UiInputXboxcontrollerNapiAvailable) wasmWindowssysWindowsWin32UiInputXboxcontrollerXInputGetBatteryInformation(dwuserindex.toInt(), devtype.toInt(), pbatteryinformation.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xInputGetCapabilities(dwuserindex: UInt, dwflags: XinputFlag, pcapabilities: MutPtr<XinputCapabilities>): UInt =
    if (windowsWin32UiInputXboxcontrollerNapiAvailable) wasmWindowssysWindowsWin32UiInputXboxcontrollerXInputGetCapabilities(dwuserindex.toInt(), dwflags.toInt(), pcapabilities.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xInputGetKeystroke(dwuserindex: UInt, dwreserved: UInt, pkeystroke: MutPtr<XinputKeystroke>): UInt =
    if (windowsWin32UiInputXboxcontrollerNapiAvailable) wasmWindowssysWindowsWin32UiInputXboxcontrollerXInputGetKeystroke(dwuserindex.toInt(), dwreserved.toInt(), pkeystroke.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xInputGetState(dwuserindex: UInt, pstate: MutPtr<XinputState>): UInt =
    if (windowsWin32UiInputXboxcontrollerNapiAvailable) wasmWindowssysWindowsWin32UiInputXboxcontrollerXInputGetState(dwuserindex.toInt(), pstate.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xInputSetState(dwuserindex: UInt, pvibration: ConstPtr<XinputVibration>): UInt =
    if (windowsWin32UiInputXboxcontrollerNapiAvailable) wasmWindowssysWindowsWin32UiInputXboxcontrollerXInputSetState(dwuserindex.toInt(), pvibration.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
