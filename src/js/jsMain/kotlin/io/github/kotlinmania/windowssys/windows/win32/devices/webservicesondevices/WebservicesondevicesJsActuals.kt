@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private val windowsWin32DevicesWebservicesondevicesNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun wSDAllocateLinkedMemory(pparent: MutPtr, cbsize: ULong): MutPtr =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) MutPtr((windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDAllocateLinkedMemory(pparent.rawAddress.toString(), cbsize.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDAttachLinkedMemory(pparent: MutPtr, pchild: MutPtr) {
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) {
        windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDAttachLinkedMemory(pparent.rawAddress.toString(), pchild.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSDCreateDeviceHost(pszlocalid: Pcwstr, pcontext: MutPtr, ppdevicehost: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHost(pszlocalid.rawAddress.toString(), pcontext.rawAddress.toString(), ppdevicehost.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDeviceHost2(pszlocalid: Pcwstr, pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, ppdevicehost: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHost2(pszlocalid.rawAddress.toString(), pcontext.rawAddress.toString(), pconfigparams.rawAddress.toString(), dwconfigparamcount.toInt(), ppdevicehost.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDeviceHostAdvanced(pszlocalid: Pcwstr, pcontext: MutPtr, pphostaddresses: ConstPtr, dwhostaddresscount: UInt, ppdevicehost: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHostAdvanced(pszlocalid.rawAddress.toString(), pcontext.rawAddress.toString(), pphostaddresses.rawAddress.toString(), dwhostaddresscount.toInt(), ppdevicehost.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDeviceProxy(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: MutPtr, ppdeviceproxy: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxy(pszdeviceid.rawAddress.toString(), pszlocalid.rawAddress.toString(), pcontext.rawAddress.toString(), ppdeviceproxy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDeviceProxy2(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, ppdeviceproxy: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxy2(pszdeviceid.rawAddress.toString(), pszlocalid.rawAddress.toString(), pcontext.rawAddress.toString(), pconfigparams.rawAddress.toString(), dwconfigparamcount.toInt(), ppdeviceproxy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDeviceProxyAdvanced(pszdeviceid: Pcwstr, pdeviceaddress: MutPtr, pszlocalid: Pcwstr, pcontext: MutPtr, ppdeviceproxy: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxyAdvanced(pszdeviceid.rawAddress.toString(), pdeviceaddress.rawAddress.toString(), pszlocalid.rawAddress.toString(), pcontext.rawAddress.toString(), ppdeviceproxy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDiscoveryProvider(pcontext: MutPtr, ppprovider: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryProvider(pcontext.rawAddress.toString(), ppprovider.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDiscoveryProvider2(pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, ppprovider: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryProvider2(pcontext.rawAddress.toString(), pconfigparams.rawAddress.toString(), dwconfigparamcount.toInt(), ppprovider.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDiscoveryPublisher(pcontext: MutPtr, pppublisher: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryPublisher(pcontext.rawAddress.toString(), pppublisher.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateDiscoveryPublisher2(pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, pppublisher: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryPublisher2(pcontext.rawAddress.toString(), pconfigparams.rawAddress.toString(), dwconfigparamcount.toInt(), pppublisher.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateHttpAddress(ppaddress: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateHttpAddress(ppaddress.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateHttpMessageParameters(pptxparams: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateHttpMessageParameters(pptxparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateOutboundAttachment(ppattachment: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateOutboundAttachment(ppattachment.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateUdpAddress(ppaddress: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateUdpAddress(ppaddress.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDCreateUdpMessageParameters(pptxparams: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateUdpMessageParameters(pptxparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDDetachLinkedMemory(pvoid: MutPtr) {
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) {
        windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDDetachLinkedMemory(pvoid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSDFreeLinkedMemory(pvoid: MutPtr) {
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) {
        windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDFreeLinkedMemory(pvoid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSDGenerateFault(pszcode: Pcwstr, pszsubcode: Pcwstr, pszreason: Pcwstr, pszdetail: Pcwstr, pcontext: MutPtr, ppfault: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDGenerateFault(pszcode.rawAddress.toString(), pszsubcode.rawAddress.toString(), pszreason.rawAddress.toString(), pszdetail.rawAddress.toString(), pcontext.rawAddress.toString(), ppfault.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDGenerateFaultEx(pcode: ConstPtr, psubcode: ConstPtr, preasons: ConstPtr, pszdetail: Pcwstr, ppfault: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDGenerateFaultEx(pcode.rawAddress.toString(), psubcode.rawAddress.toString(), preasons.rawAddress.toString(), pszdetail.rawAddress.toString(), ppfault.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDGetConfigurationOption(dwoption: UInt, pvoid: MutPtr, cboutbuffer: UInt): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDGetConfigurationOption(dwoption.toInt(), pvoid.rawAddress.toString(), cboutbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDSetConfigurationOption(dwoption: UInt, pvoid: ConstPtr, cbinbuffer: UInt): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDSetConfigurationOption(dwoption.toInt(), pvoid.rawAddress.toString(), cbinbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDUriDecode(source: Pcwstr, cchsource: UInt, destout: MutPtr, cchdestout: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDUriDecode(source.rawAddress.toString(), cchsource.toInt(), destout.rawAddress.toString(), cchdestout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDUriEncode(source: Pcwstr, cchsource: UInt, destout: MutPtr, cchdestout: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDUriEncode(source.rawAddress.toString(), cchsource.toInt(), destout.rawAddress.toString(), cchdestout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDXMLAddChild(pparent: MutPtr, pchild: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLAddChild(pparent.rawAddress.toString(), pchild.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDXMLAddSibling(pfirst: MutPtr, psecond: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLAddSibling(pfirst.rawAddress.toString(), psecond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDXMLBuildAnyForSingleElement(pelementname: MutPtr, psztext: Pcwstr, ppany: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLBuildAnyForSingleElement(pelementname.rawAddress.toString(), psztext.rawAddress.toString(), ppany.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDXMLCleanupElement(pany: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLCleanupElement(pany.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDXMLCreateContext(ppcontext: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLCreateContext(ppcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDXMLGetNameFromBuiltinNamespace(psznamespace: Pcwstr, pszname: Pcwstr, ppname: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLGetNameFromBuiltinNamespace(psznamespace.rawAddress.toString(), pszname.rawAddress.toString(), ppname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSDXMLGetValueFromAny(psznamespace: Pcwstr, pszname: Pcwstr, pany: MutPtr, ppszvalue: MutPtr): Hresult =
    if (windowsWin32DevicesWebservicesondevicesNapiAddon != null) (windowsWin32DevicesWebservicesondevicesNapiAddon.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLGetValueFromAny(psznamespace.rawAddress.toString(), pszname.rawAddress.toString(), pany.rawAddress.toString(), ppszvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
