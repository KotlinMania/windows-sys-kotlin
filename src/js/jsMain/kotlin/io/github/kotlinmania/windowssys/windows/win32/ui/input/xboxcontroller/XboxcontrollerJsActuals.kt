@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr

private val windowsWin32UiInputXboxcontrollerNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun xInputEnable(enable: Bool) {
    if (windowsWin32UiInputXboxcontrollerNapiAddon != null) {
        windowsWin32UiInputXboxcontrollerNapiAddon.windowssysWindowsWin32UiInputXboxcontrollerXInputEnable(enable)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun xInputGetAudioDeviceIds(dwuserindex: UInt, prenderdeviceid: Pwstr, prendercount: MutPtr<UInt>, pcapturedeviceid: Pwstr, pcapturecount: MutPtr<UInt>): UInt =
    if (windowsWin32UiInputXboxcontrollerNapiAddon != null) (windowsWin32UiInputXboxcontrollerNapiAddon.windowssysWindowsWin32UiInputXboxcontrollerXInputGetAudioDeviceIds(dwuserindex.toInt(), prenderdeviceid.rawAddress.toString(), prendercount.rawAddress.toString(), pcapturedeviceid.rawAddress.toString(), pcapturecount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xInputGetBatteryInformation(dwuserindex: UInt, devtype: BatteryDevtype, pbatteryinformation: MutPtr<XinputBatteryInformation>): UInt =
    if (windowsWin32UiInputXboxcontrollerNapiAddon != null) (windowsWin32UiInputXboxcontrollerNapiAddon.windowssysWindowsWin32UiInputXboxcontrollerXInputGetBatteryInformation(dwuserindex.toInt(), devtype.toInt(), pbatteryinformation.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xInputGetCapabilities(dwuserindex: UInt, dwflags: XinputFlag, pcapabilities: MutPtr<XinputCapabilities>): UInt =
    if (windowsWin32UiInputXboxcontrollerNapiAddon != null) (windowsWin32UiInputXboxcontrollerNapiAddon.windowssysWindowsWin32UiInputXboxcontrollerXInputGetCapabilities(dwuserindex.toInt(), dwflags.toInt(), pcapabilities.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xInputGetKeystroke(dwuserindex: UInt, dwreserved: UInt, pkeystroke: MutPtr<XinputKeystroke>): UInt =
    if (windowsWin32UiInputXboxcontrollerNapiAddon != null) (windowsWin32UiInputXboxcontrollerNapiAddon.windowssysWindowsWin32UiInputXboxcontrollerXInputGetKeystroke(dwuserindex.toInt(), dwreserved.toInt(), pkeystroke.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xInputGetState(dwuserindex: UInt, pstate: MutPtr<XinputState>): UInt =
    if (windowsWin32UiInputXboxcontrollerNapiAddon != null) (windowsWin32UiInputXboxcontrollerNapiAddon.windowssysWindowsWin32UiInputXboxcontrollerXInputGetState(dwuserindex.toInt(), pstate.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xInputSetState(dwuserindex: UInt, pvibration: ConstPtr<XinputVibration>): UInt =
    if (windowsWin32UiInputXboxcontrollerNapiAddon != null) (windowsWin32UiInputXboxcontrollerNapiAddon.windowssysWindowsWin32UiInputXboxcontrollerXInputSetState(dwuserindex.toInt(), pvibration.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
