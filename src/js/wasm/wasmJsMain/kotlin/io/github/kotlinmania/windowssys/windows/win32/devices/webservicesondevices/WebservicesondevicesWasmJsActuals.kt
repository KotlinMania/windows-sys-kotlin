@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32DevicesWebservicesondevicesNapiAddon(): Boolean

private val _windowsWin32DevicesWebservicesondevicesNapiAvailable: Boolean = _initWindowsWin32DevicesWebservicesondevicesNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDAllocateLinkedMemory(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDAllocateLinkedMemory(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDAttachLinkedMemory(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDAttachLinkedMemory(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHost(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHost(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHost2(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHost2(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHostAdvanced(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHostAdvanced(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxy(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxy(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxy2(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxy2(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxyAdvanced(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxyAdvanced(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryProvider(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryProvider(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryProvider2(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryProvider2(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryPublisher(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryPublisher(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryPublisher2(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryPublisher2(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDCreateHttpAddress(p0)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateHttpAddress(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDCreateHttpMessageParameters(p0)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateHttpMessageParameters(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDCreateOutboundAttachment(p0)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateOutboundAttachment(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDCreateUdpAddress(p0)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateUdpAddress(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDCreateUdpMessageParameters(p0)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateUdpMessageParameters(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDDetachLinkedMemory(p0)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDDetachLinkedMemory(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDFreeLinkedMemory(p0)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDFreeLinkedMemory(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDGenerateFault(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDGenerateFault(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDGenerateFaultEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDGenerateFaultEx(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDGetConfigurationOption(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDGetConfigurationOption(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDSetConfigurationOption(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDSetConfigurationOption(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDUriDecode(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDUriDecode(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDUriEncode(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDUriEncode(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDXMLAddChild(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDXMLAddChild(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDXMLAddSibling(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDXMLAddSibling(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDXMLBuildAnyForSingleElement(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDXMLBuildAnyForSingleElement(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDXMLCleanupElement(p0)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDXMLCleanupElement(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDXMLCreateContext(p0)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDXMLCreateContext(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDXMLGetNameFromBuiltinNamespace(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDXMLGetNameFromBuiltinNamespace(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_webservicesondevices_wSDXMLGetValueFromAny(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDXMLGetValueFromAny(p0: String, p1: String, p2: String, p3: String): Int

public actual fun wSDAllocateLinkedMemory(pparent: COpaquePointer?, cbsize: ULong): COpaquePointer? =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDAllocateLinkedMemory((pparent?.value ?: 0L).toString(), cbsize.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDAttachLinkedMemory(pparent: COpaquePointer?, pchild: COpaquePointer?) {
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDAttachLinkedMemory((pparent?.value ?: 0L).toString(), (pchild?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSDCreateDeviceHost(pszlocalid: Pcwstr, pcontext: COpaquePointer?, ppdevicehost: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHost((pszlocalid?.value ?: 0L).toString(), (pcontext?.value ?: 0L).toString(), (ppdevicehost?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDeviceHost2(pszlocalid: Pcwstr, pcontext: COpaquePointer?, pconfigparams: COpaquePointer?, dwconfigparamcount: UInt, ppdevicehost: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHost2((pszlocalid?.value ?: 0L).toString(), (pcontext?.value ?: 0L).toString(), (pconfigparams?.value ?: 0L).toString(), dwconfigparamcount.toInt(), (ppdevicehost?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDeviceHostAdvanced(pszlocalid: Pcwstr, pcontext: COpaquePointer?, pphostaddresses: COpaquePointer?, dwhostaddresscount: UInt, ppdevicehost: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHostAdvanced((pszlocalid?.value ?: 0L).toString(), (pcontext?.value ?: 0L).toString(), (pphostaddresses?.value ?: 0L).toString(), dwhostaddresscount.toInt(), (ppdevicehost?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDeviceProxy(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: COpaquePointer?, ppdeviceproxy: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxy((pszdeviceid?.value ?: 0L).toString(), (pszlocalid?.value ?: 0L).toString(), (pcontext?.value ?: 0L).toString(), (ppdeviceproxy?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDeviceProxy2(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: COpaquePointer?, pconfigparams: COpaquePointer?, dwconfigparamcount: UInt, ppdeviceproxy: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxy2((pszdeviceid?.value ?: 0L).toString(), (pszlocalid?.value ?: 0L).toString(), (pcontext?.value ?: 0L).toString(), (pconfigparams?.value ?: 0L).toString(), dwconfigparamcount.toInt(), (ppdeviceproxy?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDeviceProxyAdvanced(pszdeviceid: Pcwstr, pdeviceaddress: COpaquePointer?, pszlocalid: Pcwstr, pcontext: COpaquePointer?, ppdeviceproxy: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxyAdvanced((pszdeviceid?.value ?: 0L).toString(), (pdeviceaddress?.value ?: 0L).toString(), (pszlocalid?.value ?: 0L).toString(), (pcontext?.value ?: 0L).toString(), (ppdeviceproxy?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDiscoveryProvider(pcontext: COpaquePointer?, ppprovider: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryProvider((pcontext?.value ?: 0L).toString(), (ppprovider?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDiscoveryProvider2(pcontext: COpaquePointer?, pconfigparams: COpaquePointer?, dwconfigparamcount: UInt, ppprovider: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryProvider2((pcontext?.value ?: 0L).toString(), (pconfigparams?.value ?: 0L).toString(), dwconfigparamcount.toInt(), (ppprovider?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDiscoveryPublisher(pcontext: COpaquePointer?, pppublisher: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryPublisher((pcontext?.value ?: 0L).toString(), (pppublisher?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDiscoveryPublisher2(pcontext: COpaquePointer?, pconfigparams: COpaquePointer?, dwconfigparamcount: UInt, pppublisher: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryPublisher2((pcontext?.value ?: 0L).toString(), (pconfigparams?.value ?: 0L).toString(), dwconfigparamcount.toInt(), (pppublisher?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateHttpAddress(ppaddress: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateHttpAddress((ppaddress?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateHttpMessageParameters(pptxparams: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateHttpMessageParameters((pptxparams?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateOutboundAttachment(ppattachment: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateOutboundAttachment((ppattachment?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateUdpAddress(ppaddress: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateUdpAddress((ppaddress?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateUdpMessageParameters(pptxparams: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDCreateUdpMessageParameters((pptxparams?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDDetachLinkedMemory(pvoid: COpaquePointer?) {
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDDetachLinkedMemory((pvoid?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSDFreeLinkedMemory(pvoid: COpaquePointer?) {
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDFreeLinkedMemory((pvoid?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSDGenerateFault(pszcode: Pcwstr, pszsubcode: Pcwstr, pszreason: Pcwstr, pszdetail: Pcwstr, pcontext: COpaquePointer?, ppfault: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDGenerateFault((pszcode?.value ?: 0L).toString(), (pszsubcode?.value ?: 0L).toString(), (pszreason?.value ?: 0L).toString(), (pszdetail?.value ?: 0L).toString(), (pcontext?.value ?: 0L).toString(), (ppfault?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDGenerateFaultEx(pcode: COpaquePointer?, psubcode: COpaquePointer?, preasons: COpaquePointer?, pszdetail: Pcwstr, ppfault: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDGenerateFaultEx((pcode?.value ?: 0L).toString(), (psubcode?.value ?: 0L).toString(), (preasons?.value ?: 0L).toString(), (pszdetail?.value ?: 0L).toString(), (ppfault?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDGetConfigurationOption(dwoption: UInt, pvoid: COpaquePointer?, cboutbuffer: UInt): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDGetConfigurationOption(dwoption.toInt(), (pvoid?.value ?: 0L).toString(), cboutbuffer.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDSetConfigurationOption(dwoption: UInt, pvoid: COpaquePointer?, cbinbuffer: UInt): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDSetConfigurationOption(dwoption.toInt(), (pvoid?.value ?: 0L).toString(), cbinbuffer.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDUriDecode(source: Pcwstr, cchsource: UInt, destout: COpaquePointer?, cchdestout: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDUriDecode((source?.value ?: 0L).toString(), cchsource.toInt(), (destout?.value ?: 0L).toString(), (cchdestout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDUriEncode(source: Pcwstr, cchsource: UInt, destout: COpaquePointer?, cchdestout: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDUriEncode((source?.value ?: 0L).toString(), cchsource.toInt(), (destout?.value ?: 0L).toString(), (cchdestout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDXMLAddChild(pparent: COpaquePointer?, pchild: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDXMLAddChild((pparent?.value ?: 0L).toString(), (pchild?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDXMLAddSibling(pfirst: COpaquePointer?, psecond: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDXMLAddSibling((pfirst?.value ?: 0L).toString(), (psecond?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDXMLBuildAnyForSingleElement(pelementname: COpaquePointer?, psztext: Pcwstr, ppany: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDXMLBuildAnyForSingleElement((pelementname?.value ?: 0L).toString(), (psztext?.value ?: 0L).toString(), (ppany?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDXMLCleanupElement(pany: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDXMLCleanupElement((pany?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDXMLCreateContext(ppcontext: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDXMLCreateContext((ppcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDXMLGetNameFromBuiltinNamespace(psznamespace: Pcwstr, pszname: Pcwstr, ppname: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDXMLGetNameFromBuiltinNamespace((psznamespace?.value ?: 0L).toString(), (pszname?.value ?: 0L).toString(), (ppname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDXMLGetValueFromAny(psznamespace: Pcwstr, pszname: Pcwstr, pany: COpaquePointer?, ppszvalue: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesWebservicesondevicesNapiAvailable) _wasm_windowssys_windows_win32_devices_webservicesondevices_wSDXMLGetValueFromAny((psznamespace?.value ?: 0L).toString(), (pszname?.value ?: 0L).toString(), (pany?.value ?: 0L).toString(), (ppszvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
