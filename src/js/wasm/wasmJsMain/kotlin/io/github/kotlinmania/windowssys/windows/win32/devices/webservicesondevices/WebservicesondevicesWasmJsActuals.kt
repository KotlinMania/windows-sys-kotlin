@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32DevicesWebservicesondevicesNapiAddon(): Boolean

private val windowsWin32DevicesWebservicesondevicesNapiAvailable: Boolean = initWindowsWin32DevicesWebservicesondevicesNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDAllocateLinkedMemory(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDAllocateLinkedMemory(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDAttachLinkedMemory(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDAttachLinkedMemory(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHost(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHost(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHost2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHost2(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHostAdvanced(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHostAdvanced(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxy(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxy(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxy2(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxy2(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxyAdvanced(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxyAdvanced(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryProvider(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryProvider(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryProvider2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryProvider2(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryPublisher(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryPublisher(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryPublisher2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryPublisher2(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateHttpAddress(p0)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateHttpAddress(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateHttpMessageParameters(p0)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateHttpMessageParameters(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateOutboundAttachment(p0)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateOutboundAttachment(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateUdpAddress(p0)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateUdpAddress(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateUdpMessageParameters(p0)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateUdpMessageParameters(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDDetachLinkedMemory(p0)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDDetachLinkedMemory(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDFreeLinkedMemory(p0)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDFreeLinkedMemory(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDGenerateFault(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDGenerateFault(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDGenerateFaultEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDGenerateFaultEx(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDGetConfigurationOption(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDGetConfigurationOption(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDSetConfigurationOption(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDSetConfigurationOption(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDUriDecode(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDUriDecode(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDUriEncode(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDUriEncode(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLAddChild(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDXMLAddChild(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLAddSibling(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDXMLAddSibling(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLBuildAnyForSingleElement(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDXMLBuildAnyForSingleElement(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLCleanupElement(p0)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDXMLCleanupElement(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLCreateContext(p0)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDXMLCreateContext(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLGetNameFromBuiltinNamespace(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDXMLGetNameFromBuiltinNamespace(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLGetValueFromAny(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDXMLGetValueFromAny(p0: String, p1: String, p2: String, p3: String): Int

public actual fun wSDAllocateLinkedMemory(pparent: MutPtr, cbsize: ULong): MutPtr =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDAllocateLinkedMemory(pparent.rawAddress.toString(), cbsize.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDAttachLinkedMemory(pparent: MutPtr, pchild: MutPtr) {
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDAttachLinkedMemory(pparent.rawAddress.toString(), pchild.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSDCreateDeviceHost(pszlocalid: Pcwstr, pcontext: MutPtr, ppdevicehost: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHost(pszlocalid.rawAddress.toString(), pcontext.rawAddress.toString(), ppdevicehost.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDeviceHost2(pszlocalid: Pcwstr, pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, ppdevicehost: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHost2(pszlocalid.rawAddress.toString(), pcontext.rawAddress.toString(), pconfigparams.rawAddress.toString(), dwconfigparamcount.toInt(), ppdevicehost.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDeviceHostAdvanced(pszlocalid: Pcwstr, pcontext: MutPtr, pphostaddresses: ConstPtr, dwhostaddresscount: UInt, ppdevicehost: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHostAdvanced(pszlocalid.rawAddress.toString(), pcontext.rawAddress.toString(), pphostaddresses.rawAddress.toString(), dwhostaddresscount.toInt(), ppdevicehost.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDeviceProxy(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: MutPtr, ppdeviceproxy: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxy(pszdeviceid.rawAddress.toString(), pszlocalid.rawAddress.toString(), pcontext.rawAddress.toString(), ppdeviceproxy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDeviceProxy2(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, ppdeviceproxy: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxy2(pszdeviceid.rawAddress.toString(), pszlocalid.rawAddress.toString(), pcontext.rawAddress.toString(), pconfigparams.rawAddress.toString(), dwconfigparamcount.toInt(), ppdeviceproxy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDeviceProxyAdvanced(pszdeviceid: Pcwstr, pdeviceaddress: MutPtr, pszlocalid: Pcwstr, pcontext: MutPtr, ppdeviceproxy: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxyAdvanced(pszdeviceid.rawAddress.toString(), pdeviceaddress.rawAddress.toString(), pszlocalid.rawAddress.toString(), pcontext.rawAddress.toString(), ppdeviceproxy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDiscoveryProvider(pcontext: MutPtr, ppprovider: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryProvider(pcontext.rawAddress.toString(), ppprovider.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDiscoveryProvider2(pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, ppprovider: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryProvider2(pcontext.rawAddress.toString(), pconfigparams.rawAddress.toString(), dwconfigparamcount.toInt(), ppprovider.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDiscoveryPublisher(pcontext: MutPtr, pppublisher: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryPublisher(pcontext.rawAddress.toString(), pppublisher.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDiscoveryPublisher2(pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, pppublisher: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryPublisher2(pcontext.rawAddress.toString(), pconfigparams.rawAddress.toString(), dwconfigparamcount.toInt(), pppublisher.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateHttpAddress(ppaddress: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateHttpAddress(ppaddress.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateHttpMessageParameters(pptxparams: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateHttpMessageParameters(pptxparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateOutboundAttachment(ppattachment: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateOutboundAttachment(ppattachment.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateUdpAddress(ppaddress: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateUdpAddress(ppaddress.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateUdpMessageParameters(pptxparams: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDCreateUdpMessageParameters(pptxparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDDetachLinkedMemory(pvoid: MutPtr) {
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDDetachLinkedMemory(pvoid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSDFreeLinkedMemory(pvoid: MutPtr) {
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDFreeLinkedMemory(pvoid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSDGenerateFault(pszcode: Pcwstr, pszsubcode: Pcwstr, pszreason: Pcwstr, pszdetail: Pcwstr, pcontext: MutPtr, ppfault: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDGenerateFault(pszcode.rawAddress.toString(), pszsubcode.rawAddress.toString(), pszreason.rawAddress.toString(), pszdetail.rawAddress.toString(), pcontext.rawAddress.toString(), ppfault.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDGenerateFaultEx(pcode: ConstPtr, psubcode: ConstPtr, preasons: ConstPtr, pszdetail: Pcwstr, ppfault: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDGenerateFaultEx(pcode.rawAddress.toString(), psubcode.rawAddress.toString(), preasons.rawAddress.toString(), pszdetail.rawAddress.toString(), ppfault.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDGetConfigurationOption(dwoption: UInt, pvoid: MutPtr, cboutbuffer: UInt): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDGetConfigurationOption(dwoption.toInt(), pvoid.rawAddress.toString(), cboutbuffer.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDSetConfigurationOption(dwoption: UInt, pvoid: ConstPtr, cbinbuffer: UInt): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDSetConfigurationOption(dwoption.toInt(), pvoid.rawAddress.toString(), cbinbuffer.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDUriDecode(source: Pcwstr, cchsource: UInt, destout: MutPtr, cchdestout: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDUriDecode(source.rawAddress.toString(), cchsource.toInt(), destout.rawAddress.toString(), cchdestout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDUriEncode(source: Pcwstr, cchsource: UInt, destout: MutPtr, cchdestout: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDUriEncode(source.rawAddress.toString(), cchsource.toInt(), destout.rawAddress.toString(), cchdestout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDXMLAddChild(pparent: MutPtr, pchild: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDXMLAddChild(pparent.rawAddress.toString(), pchild.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDXMLAddSibling(pfirst: MutPtr, psecond: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDXMLAddSibling(pfirst.rawAddress.toString(), psecond.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDXMLBuildAnyForSingleElement(pelementname: MutPtr, psztext: Pcwstr, ppany: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDXMLBuildAnyForSingleElement(pelementname.rawAddress.toString(), psztext.rawAddress.toString(), ppany.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDXMLCleanupElement(pany: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDXMLCleanupElement(pany.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDXMLCreateContext(ppcontext: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDXMLCreateContext(ppcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDXMLGetNameFromBuiltinNamespace(psznamespace: Pcwstr, pszname: Pcwstr, ppname: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDXMLGetNameFromBuiltinNamespace(psznamespace.rawAddress.toString(), pszname.rawAddress.toString(), ppname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDXMLGetValueFromAny(psznamespace: Pcwstr, pszname: Pcwstr, pany: MutPtr, ppszvalue: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAvailable) wasmWindowssysWindowsWin32DevicesWebservicesondevicesWSDXMLGetValueFromAny(psznamespace.rawAddress.toString(), pszname.rawAddress.toString(), pany.rawAddress.toString(), ppszvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
