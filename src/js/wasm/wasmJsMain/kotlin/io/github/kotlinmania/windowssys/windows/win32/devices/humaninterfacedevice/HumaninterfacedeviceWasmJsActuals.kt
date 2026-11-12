@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32DevicesHumaninterfacedeviceNapiAddon(): Boolean

private val windowsWin32DevicesHumaninterfacedeviceNapiAvailable: Boolean = initWindowsWin32DevicesHumaninterfacedeviceNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceDirectInput8Create(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceDirectInput8Create(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDFlushQueue(p0)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDFlushQueue(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDFreePreparsedData(p0)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDFreePreparsedData(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetAttributes(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetAttributes(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetConfiguration(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetConfiguration(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetFeature(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetFeature(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetHidGuid(p0)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetHidGuid(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetIndexedString(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetIndexedString(p0: String, p1: Int, p2: String, p3: Int): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetInputReport(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetInputReport(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetManufacturerString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetManufacturerString(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetMsGenreDescriptor(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetMsGenreDescriptor(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetNumInputBuffers(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetNumInputBuffers(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPhysicalDescriptor(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPhysicalDescriptor(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPreparsedData(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPreparsedData(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetProductString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetProductString(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetSerialNumberString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetSerialNumberString(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetConfiguration(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetConfiguration(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetFeature(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetFeature(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetNumInputBuffers(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetNumInputBuffers(p0: String, p1: Int): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetOutputReport(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetOutputReport(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonArray(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonArray(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonCaps(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonCaps(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetCaps(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetCaps(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetData(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetData(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetExtendedAttributes(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetExtendedAttributes(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetLinkCollectionNodes(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetLinkCollectionNodes(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetScaledUsageValue(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetScaledUsageValue(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificButtonCaps(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificButtonCaps(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificValueCaps(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificValueCaps(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValue(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValue(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValueArray(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValueArray(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsages(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsages(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsagesEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsagesEx(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetValueCaps(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetValueCaps(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPInitializeReportForId(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPInitializeReportForId(p0: Int, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxDataListLength(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxDataListLength(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxUsageListLength(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxUsageListLength(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetButtonArray(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetButtonArray(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetData(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetData(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetScaledUsageValue(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetScaledUsageValue(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValue(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValue(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValueArray(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValueArray(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsages(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsages(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPTranslateUsagesToI8042ScanCodes(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPTranslateUsagesToI8042ScanCodes(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPUnsetUsages(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPUnsetUsages(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceHidPUsageListDifference(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPUsageListDifference(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesHumaninterfacedeviceJoyConfigChanged(p0)")
private external fun wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceJoyConfigChanged(p0: Int): Int

public actual fun directInput8Create(hinst: Hinstance, dwversion: UInt, riidltf: ConstPtr, ppvout: MutPtr, punkouter: MutPtr): Hresult =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceDirectInput8Create(hinst.rawAddress.toString(), dwversion.toInt(), riidltf.rawAddress.toString(), ppvout.rawAddress.toString(), punkouter.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDFlushQueue(hiddeviceobject: Handle): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDFlushQueue(hiddeviceobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDFreePreparsedData(preparseddata: PhidpPreparsedData): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDFreePreparsedData(preparseddata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetAttributes(hiddeviceobject: Handle, attributes: MutPtr): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetAttributes(hiddeviceobject.rawAddress.toString(), attributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetConfiguration(hiddeviceobject: Handle, configuration: MutPtr, configurationlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetConfiguration(hiddeviceobject.rawAddress.toString(), configuration.rawAddress.toString(), configurationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetFeature(hiddeviceobject: Handle, reportbuffer: MutPtr, reportbufferlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetFeature(hiddeviceobject.rawAddress.toString(), reportbuffer.rawAddress.toString(), reportbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetHidGuid(hidguid: MutPtr) {
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetHidGuid(hidguid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hidDGetIndexedString(hiddeviceobject: Handle, stringindex: UInt, buffer: MutPtr, bufferlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetIndexedString(hiddeviceobject.rawAddress.toString(), stringindex.toInt(), buffer.rawAddress.toString(), bufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetInputReport(hiddeviceobject: Handle, reportbuffer: MutPtr, reportbufferlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetInputReport(hiddeviceobject.rawAddress.toString(), reportbuffer.rawAddress.toString(), reportbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetManufacturerString(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetManufacturerString(hiddeviceobject.rawAddress.toString(), buffer.rawAddress.toString(), bufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetMsGenreDescriptor(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetMsGenreDescriptor(hiddeviceobject.rawAddress.toString(), buffer.rawAddress.toString(), bufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetNumInputBuffers(hiddeviceobject: Handle, numberbuffers: MutPtr): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetNumInputBuffers(hiddeviceobject.rawAddress.toString(), numberbuffers.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetPhysicalDescriptor(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPhysicalDescriptor(hiddeviceobject.rawAddress.toString(), buffer.rawAddress.toString(), bufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetPreparsedData(hiddeviceobject: Handle, preparseddata: MutPtr): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetPreparsedData(hiddeviceobject.rawAddress.toString(), preparseddata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetProductString(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetProductString(hiddeviceobject.rawAddress.toString(), buffer.rawAddress.toString(), bufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDGetSerialNumberString(hiddeviceobject: Handle, buffer: MutPtr, bufferlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDGetSerialNumberString(hiddeviceobject.rawAddress.toString(), buffer.rawAddress.toString(), bufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDSetConfiguration(hiddeviceobject: Handle, configuration: ConstPtr, configurationlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetConfiguration(hiddeviceobject.rawAddress.toString(), configuration.rawAddress.toString(), configurationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDSetFeature(hiddeviceobject: Handle, reportbuffer: ConstPtr, reportbufferlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetFeature(hiddeviceobject.rawAddress.toString(), reportbuffer.rawAddress.toString(), reportbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDSetNumInputBuffers(hiddeviceobject: Handle, numberbuffers: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetNumInputBuffers(hiddeviceobject.rawAddress.toString(), numberbuffers.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidDSetOutputReport(hiddeviceobject: Handle, reportbuffer: ConstPtr, reportbufferlength: UInt): Boolean =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidDSetOutputReport(hiddeviceobject.rawAddress.toString(), reportbuffer.rawAddress.toString(), reportbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetButtonArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: MutPtr, buttondatalength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonArray(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), buttondata.rawAddress.toString(), buttondatalength.rawAddress.toString(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetButtonCaps(reporttype: HidpReportType, buttoncaps: MutPtr, buttoncapslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetButtonCaps(reporttype, buttoncaps.rawAddress.toString(), buttoncapslength.rawAddress.toString(), preparseddata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetCaps(preparseddata: PhidpPreparsedData, capabilities: MutPtr): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetCaps(preparseddata.toString(), capabilities.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetData(reporttype: HidpReportType, datalist: MutPtr, datalength: MutPtr, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetData(reporttype, datalist.rawAddress.toString(), datalength.rawAddress.toString(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetExtendedAttributes(reporttype: HidpReportType, dataindex: UShort, preparseddata: PhidpPreparsedData, attributes: MutPtr, lengthattributes: MutPtr): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetExtendedAttributes(reporttype, dataindex.toInt(), preparseddata.toString(), attributes.rawAddress.toString(), lengthattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetLinkCollectionNodes(linkcollectionnodes: MutPtr, linkcollectionnodeslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetLinkCollectionNodes(linkcollectionnodes.rawAddress.toString(), linkcollectionnodeslength.rawAddress.toString(), preparseddata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetScaledUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetScaledUsageValue(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), usagevalue.rawAddress.toString(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetSpecificButtonCaps(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttoncaps: MutPtr, buttoncapslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificButtonCaps(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), buttoncaps.rawAddress.toString(), buttoncapslength.rawAddress.toString(), preparseddata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetSpecificValueCaps(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, valuecaps: MutPtr, valuecapslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetSpecificValueCaps(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), valuecaps.rawAddress.toString(), valuecapslength.rawAddress.toString(), preparseddata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValue(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), usagevalue.rawAddress.toString(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetUsageValueArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Pstr, usagevaluebytelength: UShort, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsageValueArray(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), usagevalue.rawAddress.toString(), usagevaluebytelength.toInt(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: MutPtr, usagelength: MutPtr, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsages(reporttype, usagepage.toInt(), linkcollection.toInt(), usagelist.rawAddress.toString(), usagelength.rawAddress.toString(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetUsagesEx(reporttype: HidpReportType, linkcollection: UShort, buttonlist: MutPtr, usagelength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetUsagesEx(reporttype, linkcollection.toInt(), buttonlist.rawAddress.toString(), usagelength.rawAddress.toString(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPGetValueCaps(reporttype: HidpReportType, valuecaps: MutPtr, valuecapslength: MutPtr, preparseddata: PhidpPreparsedData): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPGetValueCaps(reporttype, valuecaps.rawAddress.toString(), valuecapslength.rawAddress.toString(), preparseddata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPInitializeReportForId(reporttype: HidpReportType, reportid: UByte, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPInitializeReportForId(reporttype, reportid.toInt(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPMaxDataListLength(reporttype: HidpReportType, preparseddata: PhidpPreparsedData): UInt =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxDataListLength(reporttype, preparseddata.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPMaxUsageListLength(reporttype: HidpReportType, usagepage: UShort, preparseddata: PhidpPreparsedData): UInt =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPMaxUsageListLength(reporttype, usagepage.toInt(), preparseddata.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetButtonArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, buttondata: ConstPtr, buttondatalength: UShort, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetButtonArray(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), buttondata.rawAddress.toString(), buttondatalength.toInt(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetData(reporttype: HidpReportType, datalist: MutPtr, datalength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetData(reporttype, datalist.rawAddress.toString(), datalength.rawAddress.toString(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetScaledUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Int, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetScaledUsageValue(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), usagevalue, preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetUsageValue(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: UInt, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValue(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), usagevalue.toInt(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetUsageValueArray(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usage: UShort, usagevalue: Pcstr, usagevaluebytelength: UShort, preparseddata: PhidpPreparsedData, report: Pstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsageValueArray(reporttype, usagepage.toInt(), linkcollection.toInt(), usage.toInt(), usagevalue.rawAddress.toString(), usagevaluebytelength.toInt(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPSetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: MutPtr, usagelength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPSetUsages(reporttype, usagepage.toInt(), linkcollection.toInt(), usagelist.rawAddress.toString(), usagelength.rawAddress.toString(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPTranslateUsagesToI8042ScanCodes(changedusagelist: ConstPtr, usagelistlength: UInt, keyaction: HidpKeyboardDirection, modifierstate: MutPtr, insertcodesprocedure: PhidpInsertScancodes, insertcodescontext: ConstPtr): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPTranslateUsagesToI8042ScanCodes(changedusagelist.rawAddress.toString(), usagelistlength.toInt(), keyaction, modifierstate.rawAddress.toString(), 0L.toString(), insertcodescontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPUnsetUsages(reporttype: HidpReportType, usagepage: UShort, linkcollection: UShort, usagelist: MutPtr, usagelength: MutPtr, preparseddata: PhidpPreparsedData, report: Pcstr, reportlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPUnsetUsages(reporttype, usagepage.toInt(), linkcollection.toInt(), usagelist.rawAddress.toString(), usagelength.rawAddress.toString(), preparseddata.toString(), report.rawAddress.toString(), reportlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hidPUsageListDifference(previoususagelist: ConstPtr, currentusagelist: ConstPtr, breakusagelist: MutPtr, makeusagelist: MutPtr, usagelistlength: UInt): Ntstatus =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceHidPUsageListDifference(previoususagelist.rawAddress.toString(), currentusagelist.rawAddress.toString(), breakusagelist.rawAddress.toString(), makeusagelist.rawAddress.toString(), usagelistlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyConfigChanged(dwflags: UInt): UInt =
    if (windowsWin32DevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWin32DevicesHumaninterfacedeviceJoyConfigChanged(dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
