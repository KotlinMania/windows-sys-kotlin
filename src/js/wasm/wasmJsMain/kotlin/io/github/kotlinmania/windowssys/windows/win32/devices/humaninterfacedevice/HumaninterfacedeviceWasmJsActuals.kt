@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32DevicesHumaninterfacedeviceNapiAddon(): Boolean

private val _windowsWin32DevicesHumaninterfacedeviceNapiAvailable: Boolean = _initWindowsWin32DevicesHumaninterfacedeviceNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_directInput8Create(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_directInput8Create(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidDFlushQueue(p0)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDFlushQueue(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidDFreePreparsedData(p0)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDFreePreparsedData(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetAttributes(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetAttributes(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetConfiguration(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetConfiguration(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetFeature(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetFeature(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetHidGuid(p0)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetHidGuid(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetIndexedString(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetIndexedString(p0: String, p1: Int, p2: String, p3: Int): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetInputReport(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetInputReport(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetManufacturerString(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetManufacturerString(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetMsGenreDescriptor(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetMsGenreDescriptor(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetNumInputBuffers(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetNumInputBuffers(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetPhysicalDescriptor(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetPhysicalDescriptor(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetPreparsedData(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetPreparsedData(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetProductString(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetProductString(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidDGetSerialNumberString(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetSerialNumberString(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidDSetConfiguration(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDSetConfiguration(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidDSetFeature(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDSetFeature(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidDSetNumInputBuffers(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDSetNumInputBuffers(p0: String, p1: Int): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidDSetOutputReport(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDSetOutputReport(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetButtonArray(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetButtonArray(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetButtonCaps(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetButtonCaps(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetCaps(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetCaps(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetData(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetData(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetExtendedAttributes(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetExtendedAttributes(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetLinkCollectionNodes(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetLinkCollectionNodes(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetScaledUsageValue(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetScaledUsageValue(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetSpecificButtonCaps(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetSpecificButtonCaps(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetSpecificValueCaps(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetSpecificValueCaps(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsageValue(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsageValue(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsageValueArray(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsageValueArray(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsages(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsages(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsagesEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsagesEx(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPGetValueCaps(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetValueCaps(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPInitializeReportForId(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPInitializeReportForId(p0: Int, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPMaxDataListLength(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPMaxDataListLength(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPMaxUsageListLength(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPMaxUsageListLength(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetButtonArray(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPSetButtonArray(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetData(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPSetData(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetScaledUsageValue(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPSetScaledUsageValue(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsageValue(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsageValue(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsageValueArray(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsageValueArray(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsages(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsages(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPTranslateUsagesToI8042ScanCodes(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPTranslateUsagesToI8042ScanCodes(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPUnsetUsages(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPUnsetUsages(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_hidPUsageListDifference(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPUsageListDifference(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_humaninterfacedevice_joyConfigChanged(p0)")
private external fun _wasm_windowssys_windows_win32_devices_humaninterfacedevice_joyConfigChanged(p0: Int): Int

public actual fun directInput8Create(hinst: Hinstance, dwversion: UInt, riidltf: COpaquePointer?, ppvout: COpaquePointer?, punkouter: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_directInput8Create((hinst?.value ?: 0L).toString(), dwversion.toInt(), (riidltf?.value ?: 0L).toString(), (ppvout?.value ?: 0L).toString(), (punkouter?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDFlushQueue(hiddeviceobject: Handle): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDFlushQueue((hiddeviceobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDFreePreparsedData(preparseddata: PhidpPreparsedData): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDFreePreparsedData(preparseddata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetAttributes(hiddeviceobject: Handle, attributes: COpaquePointer?): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetAttributes((hiddeviceobject?.value ?: 0L).toString(), (attributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetConfiguration(hiddeviceobject: Handle, configuration: COpaquePointer?, configurationlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetConfiguration((hiddeviceobject?.value ?: 0L).toString(), (configuration?.value ?: 0L).toString(), configurationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetFeature(hiddeviceobject: Handle, reportbuffer: COpaquePointer?, reportbufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetFeature((hiddeviceobject?.value ?: 0L).toString(), (reportbuffer?.value ?: 0L).toString(), reportbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetHidGuid(hidguid: COpaquePointer?) {
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetHidGuid((hidguid?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hidDGetIndexedString(hiddeviceobject: Handle, stringindex: UInt, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetIndexedString((hiddeviceobject?.value ?: 0L).toString(), stringindex.toInt(), (buffer?.value ?: 0L).toString(), bufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetInputReport(hiddeviceobject: Handle, reportbuffer: COpaquePointer?, reportbufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetInputReport((hiddeviceobject?.value ?: 0L).toString(), (reportbuffer?.value ?: 0L).toString(), reportbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetManufacturerString(hiddeviceobject: Handle, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetManufacturerString((hiddeviceobject?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetMsGenreDescriptor(hiddeviceobject: Handle, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetMsGenreDescriptor((hiddeviceobject?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetNumInputBuffers(hiddeviceobject: Handle, numberbuffers: COpaquePointer?): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetNumInputBuffers((hiddeviceobject?.value ?: 0L).toString(), (numberbuffers?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetPhysicalDescriptor(hiddeviceobject: Handle, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetPhysicalDescriptor((hiddeviceobject?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetPreparsedData(hiddeviceobject: Handle, preparseddata: COpaquePointer?): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetPreparsedData((hiddeviceobject?.value ?: 0L).toString(), (preparseddata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetProductString(hiddeviceobject: Handle, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetProductString((hiddeviceobject?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetSerialNumberString(hiddeviceobject: Handle, buffer: COpaquePointer?, bufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDGetSerialNumberString((hiddeviceobject?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDSetConfiguration(hiddeviceobject: Handle, configuration: COpaquePointer?, configurationlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDSetConfiguration((hiddeviceobject?.value ?: 0L).toString(), (configuration?.value ?: 0L).toString(), configurationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDSetFeature(hiddeviceobject: Handle, reportbuffer: COpaquePointer?, reportbufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDSetFeature((hiddeviceobject?.value ?: 0L).toString(), (reportbuffer?.value ?: 0L).toString(), reportbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDSetNumInputBuffers(hiddeviceobject: Handle, numberbuffers: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDSetNumInputBuffers((hiddeviceobject?.value ?: 0L).toString(), numberbuffers.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDSetOutputReport(hiddeviceobject: Handle, reportbuffer: COpaquePointer?, reportbufferlength: UInt): Boolean =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidDSetOutputReport((hiddeviceobject?.value ?: 0L).toString(), (reportbuffer?.value ?: 0L).toString(), reportbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetButtonArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: COpaquePointer?, buttondatalength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetButtonArray(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), (buttondata?.value ?: 0L).toString(), (buttondatalength?.value ?: 0L).toString(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetButtonCaps(reporttype: HidpReportType, buttoncaps: COpaquePointer?, buttoncapslength: COpaquePointer?, preparseddata: PhidpPreparsedData): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetButtonCaps(reporttype, (buttoncaps?.value ?: 0L).toString(), (buttoncapslength?.value ?: 0L).toString(), preparseddata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetCaps(preparseddata: PhidpPreparsedData, capabilities: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetCaps(preparseddata.toString(), (capabilities?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetData(reporttype: HidpReportType, datalist: COpaquePointer?, datalength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetData(reporttype, (datalist?.value ?: 0L).toString(), (datalength?.value ?: 0L).toString(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetExtendedAttributes(reporttype: HidpReportType, dataindex: UShort, preparseddata: PhidpPreparsedData, attributes: COpaquePointer?, lengthattributes: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetExtendedAttributes(reporttype, dataindex.toInt(), preparseddata.toString(), (attributes?.value ?: 0L).toString(), (lengthattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetLinkCollectionNodes(linkcollectionnodes: COpaquePointer?, linkcollectionnodeslength: COpaquePointer?, preparseddata: PhidpPreparsedData): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetLinkCollectionNodes((linkcollectionnodes?.value ?: 0L).toString(), (linkcollectionnodeslength?.value ?: 0L).toString(), preparseddata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetScaledUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetScaledUsageValue(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), (usagevalue?.value ?: 0L).toString(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetSpecificButtonCaps(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttoncaps: COpaquePointer?, buttoncapslength: COpaquePointer?, preparseddata: PhidpPreparsedData): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetSpecificButtonCaps(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), (buttoncaps?.value ?: 0L).toString(), (buttoncapslength?.value ?: 0L).toString(), preparseddata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetSpecificValueCaps(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, valuecaps: COpaquePointer?, valuecapslength: COpaquePointer?, preparseddata: PhidpPreparsedData): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetSpecificValueCaps(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), (valuecaps?.value ?: 0L).toString(), (valuecapslength?.value ?: 0L).toString(), preparseddata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsageValue(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), (usagevalue?.value ?: 0L).toString(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetUsageValueArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Pstr, usagevaluebytelength: UShort, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsageValueArray(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), (usagevalue?.value ?: 0L).toString(), usagevaluebytelength.toInt(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: COpaquePointer?, usagelength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsages(reporttype, usagepage.toInt(), linkcollection.toInt(), (usagelist?.value ?: 0L).toString(), (usagelength?.value ?: 0L).toString(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetUsagesEx(reporttype: HidpReportType, linkcollection: UShort, buttonlist: COpaquePointer?, usagelength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetUsagesEx(reporttype, linkcollection.toInt(), (buttonlist?.value ?: 0L).toString(), (usagelength?.value ?: 0L).toString(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetValueCaps(reporttype: HidpReportType, valuecaps: COpaquePointer?, valuecapslength: COpaquePointer?, preparseddata: PhidpPreparsedData): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPGetValueCaps(reporttype, (valuecaps?.value ?: 0L).toString(), (valuecapslength?.value ?: 0L).toString(), preparseddata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPInitializeReportForId(reporttype: HidpReportType, reportid: UByte, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPInitializeReportForId(reporttype, reportid.toInt(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPMaxDataListLength(reporttype: HidpReportType, preparseddata: PhidpPreparsedData): UInt =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPMaxDataListLength(reporttype, preparseddata.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPMaxUsageListLength(reporttype: HidpReportType, usagepage: UShort, preparseddata: PhidpPreparsedData): UInt =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPMaxUsageListLength(reporttype, usagepage.toInt(), preparseddata.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetButtonArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: COpaquePointer?, buttondatalength: UShort, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPSetButtonArray(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), (buttondata?.value ?: 0L).toString(), buttondatalength.toInt(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetData(reporttype: HidpReportType, datalist: COpaquePointer?, datalength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPSetData(reporttype, (datalist?.value ?: 0L).toString(), (datalength?.value ?: 0L).toString(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetScaledUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Int, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPSetScaledUsageValue(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), usagevalue, preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: UInt, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsageValue(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), usagevalue.toInt(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetUsageValueArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Pcstr, usagevaluebytelength: UShort, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsageValueArray(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), (usagevalue?.value ?: 0L).toString(), usagevaluebytelength.toInt(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: COpaquePointer?, usagelength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPSetUsages(reporttype, usagepage.toInt(), linkcollection.toInt(), (usagelist?.value ?: 0L).toString(), (usagelength?.value ?: 0L).toString(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPTranslateUsagesToI8042ScanCodes(changedusagelist: COpaquePointer?, usagelistlength: UInt, keyaction: HidpKeyboardDirection, modifierstate: COpaquePointer?, insertcodesprocedure: PhidpInsertScancodes, insertcodescontext: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPTranslateUsagesToI8042ScanCodes((changedusagelist?.value ?: 0L).toString(), usagelistlength.toInt(), keyaction, (modifierstate?.value ?: 0L).toString(), 0L.toString(), (insertcodescontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPUnsetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: COpaquePointer?, usagelength: COpaquePointer?, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPUnsetUsages(reporttype, usagepage.toInt(), linkcollection.toInt(), (usagelist?.value ?: 0L).toString(), (usagelength?.value ?: 0L).toString(), preparseddata.toString(), (report?.value ?: 0L).toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPUsageListDifference(previoususagelist: COpaquePointer?, currentusagelist: COpaquePointer?, breakusagelist: COpaquePointer?, makeusagelist: COpaquePointer?, usagelistlength: UInt): Ntstatus =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_hidPUsageListDifference((previoususagelist?.value ?: 0L).toString(), (currentusagelist?.value ?: 0L).toString(), (breakusagelist?.value ?: 0L).toString(), (makeusagelist?.value ?: 0L).toString(), usagelistlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyConfigChanged(dwflags: UInt): UInt =
    if (_windowsWin32DevicesHumaninterfacedeviceNapiAvailable) _wasm_windowssys_windows_win32_devices_humaninterfacedevice_joyConfigChanged(dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
