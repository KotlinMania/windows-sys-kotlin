@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult

private val windowsWin32UiInputNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun defRawInputProc(parawinput: ConstPtr, ninput: Int, cbsizeheader: UInt): Lresult =
    if (windowsWin32UiInputNapiAddon != null) (windowsWin32UiInputNapiAddon.windowssysWindowsWin32UiInputDefRawInputProc(parawinput.rawAddress.toString(), ninput, cbsizeheader.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCIMSSM(inputmessagesource: MutPtr): Bool =
    if (windowsWin32UiInputNapiAddon != null) (windowsWin32UiInputNapiAddon.windowssysWindowsWin32UiInputGetCIMSSM(inputmessagesource.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentInputMessageSource(inputmessagesource: MutPtr): Bool =
    if (windowsWin32UiInputNapiAddon != null) (windowsWin32UiInputNapiAddon.windowssysWindowsWin32UiInputGetCurrentInputMessageSource(inputmessagesource.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRawInputBuffer(pdata: MutPtr, pcbsize: MutPtr, cbsizeheader: UInt): UInt =
    if (windowsWin32UiInputNapiAddon != null) (windowsWin32UiInputNapiAddon.windowssysWindowsWin32UiInputGetRawInputBuffer(pdata.rawAddress.toString(), pcbsize.rawAddress.toString(), cbsizeheader.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRawInputData(hrawinput: Hrawinput, uicommand: RawInputDataCommandFlags, pdata: MutPtr, pcbsize: MutPtr, cbsizeheader: UInt): UInt =
    if (windowsWin32UiInputNapiAddon != null) (windowsWin32UiInputNapiAddon.windowssysWindowsWin32UiInputGetRawInputData(hrawinput.rawAddress.toString(), uicommand.toInt(), pdata.rawAddress.toString(), pcbsize.rawAddress.toString(), cbsizeheader.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRawInputDeviceInfoA(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: MutPtr, pcbsize: MutPtr): UInt =
    if (windowsWin32UiInputNapiAddon != null) (windowsWin32UiInputNapiAddon.windowssysWindowsWin32UiInputGetRawInputDeviceInfoA(hdevice.rawAddress.toString(), uicommand.toInt(), pdata.rawAddress.toString(), pcbsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRawInputDeviceInfoW(hdevice: Handle, uicommand: RawInputDeviceInfoCommand, pdata: MutPtr, pcbsize: MutPtr): UInt =
    if (windowsWin32UiInputNapiAddon != null) (windowsWin32UiInputNapiAddon.windowssysWindowsWin32UiInputGetRawInputDeviceInfoW(hdevice.rawAddress.toString(), uicommand.toInt(), pdata.rawAddress.toString(), pcbsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRawInputDeviceList(prawinputdevicelist: MutPtr, puinumdevices: MutPtr, cbsize: UInt): UInt =
    if (windowsWin32UiInputNapiAddon != null) (windowsWin32UiInputNapiAddon.windowssysWindowsWin32UiInputGetRawInputDeviceList(prawinputdevicelist.rawAddress.toString(), puinumdevices.rawAddress.toString(), cbsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRegisteredRawInputDevices(prawinputdevices: MutPtr, puinumdevices: MutPtr, cbsize: UInt): UInt =
    if (windowsWin32UiInputNapiAddon != null) (windowsWin32UiInputNapiAddon.windowssysWindowsWin32UiInputGetRegisteredRawInputDevices(prawinputdevices.rawAddress.toString(), puinumdevices.rawAddress.toString(), cbsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerRawInputDevices(prawinputdevices: ConstPtr, uinumdevices: UInt, cbsize: UInt): Bool =
    if (windowsWin32UiInputNapiAddon != null) (windowsWin32UiInputNapiAddon.windowssysWindowsWin32UiInputRegisterRawInputDevices(prawinputdevices.rawAddress.toString(), uinumdevices.toInt(), cbsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
