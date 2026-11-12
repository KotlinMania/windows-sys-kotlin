@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32UiInputNapiAddon(): Boolean

private val windowsWin32UiInputNapiAvailable: Boolean = initWindowsWin32UiInputNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputDefRawInputProc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputDefRawInputProc(p0: String, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputGetCIMSSM(p0)")
private external fun wasmWindowssysWindowsWin32UiInputGetCIMSSM(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputGetCurrentInputMessageSource(p0)")
private external fun wasmWindowssysWindowsWin32UiInputGetCurrentInputMessageSource(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputGetRawInputBuffer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputGetRawInputBuffer(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputGetRawInputData(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiInputGetRawInputData(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputGetRawInputDeviceInfoA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputGetRawInputDeviceInfoA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputGetRawInputDeviceInfoW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputGetRawInputDeviceInfoW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputGetRawInputDeviceList(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputGetRawInputDeviceList(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputGetRegisteredRawInputDevices(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputGetRegisteredRawInputDevices(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputRegisterRawInputDevices(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputRegisterRawInputDevices(p0: String, p1: Int, p2: Int): Int

public actual fun defRawInputProc(parawinput: ConstPtr<ConstPtr<Rawinput>>, ninput: Int, cbsizeheader: UInt): Lresult =
    if (windowsWin32UiInputNapiAvailable) wasmWindowssysWindowsWin32UiInputDefRawInputProc(parawinput.rawAddress.toString(), ninput, cbsizeheader.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCIMSSM(inputmessagesource: MutPtr<InputMessageSource>): Bool =
    if (windowsWin32UiInputNapiAvailable) wasmWindowssysWindowsWin32UiInputGetCIMSSM(inputmessagesource.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentInputMessageSource(inputmessagesource: MutPtr<InputMessageSource>): Bool =
    if (windowsWin32UiInputNapiAvailable) wasmWindowssysWindowsWin32UiInputGetCurrentInputMessageSource(inputmessagesource.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRawInputBuffer(pdata: MutPtr<Rawinput>, pcbsize: MutPtr<UInt>, cbsizeheader: UInt): UInt =
    if (windowsWin32UiInputNapiAvailable) wasmWindowssysWindowsWin32UiInputGetRawInputBuffer(pdata.rawAddress.toString(), pcbsize.rawAddress.toString(), cbsizeheader.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRawInputData(hrawinput: Hrawinput, uicommand: RawInputDataCommandFlags, pdata: MutPtr<CVoid>, pcbsize: MutPtr<UInt>, cbsizeheader: UInt): UInt =
    if (windowsWin32UiInputNapiAvailable) wasmWindowssysWindowsWin32UiInputGetRawInputData(hrawinput.rawAddress.toString(), uicommand.toInt(), pdata.rawAddress.toString(), pcbsize.rawAddress.toString(), cbsizeheader.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRawInputDeviceInfoA(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: MutPtr<CVoid>, pcbsize: MutPtr<UInt>): UInt =
    if (windowsWin32UiInputNapiAvailable) wasmWindowssysWindowsWin32UiInputGetRawInputDeviceInfoA(hdevice.rawAddress.toString(), uicommand.toInt(), pdata.rawAddress.toString(), pcbsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRawInputDeviceInfoW(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: MutPtr<CVoid>, pcbsize: MutPtr<UInt>): UInt =
    if (windowsWin32UiInputNapiAvailable) wasmWindowssysWindowsWin32UiInputGetRawInputDeviceInfoW(hdevice.rawAddress.toString(), uicommand.toInt(), pdata.rawAddress.toString(), pcbsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRawInputDeviceList(prawinputdevicelist: MutPtr<Rawinputdevicelist>, puinumdevices: MutPtr<UInt>, cbsize: UInt): UInt =
    if (windowsWin32UiInputNapiAvailable) wasmWindowssysWindowsWin32UiInputGetRawInputDeviceList(prawinputdevicelist.rawAddress.toString(), puinumdevices.rawAddress.toString(), cbsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRegisteredRawInputDevices(prawinputdevices: MutPtr<Rawinputdevice>, puinumdevices: MutPtr<UInt>, cbsize: UInt): UInt =
    if (windowsWin32UiInputNapiAvailable) wasmWindowssysWindowsWin32UiInputGetRegisteredRawInputDevices(prawinputdevices.rawAddress.toString(), puinumdevices.rawAddress.toString(), cbsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerRawInputDevices(prawinputdevices: ConstPtr<Rawinputdevice>, uinumdevices: UInt, cbsize: UInt): Bool =
    if (windowsWin32UiInputNapiAvailable) wasmWindowssysWindowsWin32UiInputRegisterRawInputDevices(prawinputdevices.rawAddress.toString(), uinumdevices.toInt(), cbsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
