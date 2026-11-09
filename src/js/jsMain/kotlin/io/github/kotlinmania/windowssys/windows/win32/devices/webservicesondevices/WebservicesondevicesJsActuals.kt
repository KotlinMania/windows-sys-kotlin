@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

private val _windowsWin32DevicesWebservicesondevicesNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun WSDAllocateLinkedMemory(pparent: Long, cbsize: ULong): Long =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDAllocateLinkedMemory(pparent.toString(), cbsize.toString()) as String).toLong() else 0L

public actual fun WSDAttachLinkedMemory(pparent: Long, pchild: Long) {
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) {
        _windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDAttachLinkedMemory(pparent.toString(), pchild.toString())
    }
}

public actual fun WSDCreateDeviceHost(pszlocalid: PCWSTR, pcontext: Long, ppdevicehost: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHost(pszlocalid.toString(), pcontext.toString(), ppdevicehost.toString()) as Int) else 0

public actual fun WSDCreateDeviceHost2(pszlocalid: PCWSTR, pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, ppdevicehost: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHost2(pszlocalid.toString(), pcontext.toString(), pconfigparams.toString(), dwconfigparamcount.toInt(), ppdevicehost.toString()) as Int) else 0

public actual fun WSDCreateDeviceHostAdvanced(pszlocalid: PCWSTR, pcontext: Long, pphostaddresses: Long, dwhostaddresscount: UInt, ppdevicehost: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHostAdvanced(pszlocalid.toString(), pcontext.toString(), pphostaddresses.toString(), dwhostaddresscount.toInt(), ppdevicehost.toString()) as Int) else 0

public actual fun WSDCreateDeviceProxy(pszdeviceid: PCWSTR, pszlocalid: PCWSTR, pcontext: Long, ppdeviceproxy: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxy(pszdeviceid.toString(), pszlocalid.toString(), pcontext.toString(), ppdeviceproxy.toString()) as Int) else 0

public actual fun WSDCreateDeviceProxy2(pszdeviceid: PCWSTR, pszlocalid: PCWSTR, pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, ppdeviceproxy: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxy2(pszdeviceid.toString(), pszlocalid.toString(), pcontext.toString(), pconfigparams.toString(), dwconfigparamcount.toInt(), ppdeviceproxy.toString()) as Int) else 0

public actual fun WSDCreateDeviceProxyAdvanced(pszdeviceid: PCWSTR, pdeviceaddress: Long, pszlocalid: PCWSTR, pcontext: Long, ppdeviceproxy: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxyAdvanced(pszdeviceid.toString(), pdeviceaddress.toString(), pszlocalid.toString(), pcontext.toString(), ppdeviceproxy.toString()) as Int) else 0

public actual fun WSDCreateDiscoveryProvider(pcontext: Long, ppprovider: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryProvider(pcontext.toString(), ppprovider.toString()) as Int) else 0

public actual fun WSDCreateDiscoveryProvider2(pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, ppprovider: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryProvider2(pcontext.toString(), pconfigparams.toString(), dwconfigparamcount.toInt(), ppprovider.toString()) as Int) else 0

public actual fun WSDCreateDiscoveryPublisher(pcontext: Long, pppublisher: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryPublisher(pcontext.toString(), pppublisher.toString()) as Int) else 0

public actual fun WSDCreateDiscoveryPublisher2(pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, pppublisher: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryPublisher2(pcontext.toString(), pconfigparams.toString(), dwconfigparamcount.toInt(), pppublisher.toString()) as Int) else 0

public actual fun WSDCreateHttpAddress(ppaddress: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDCreateHttpAddress(ppaddress.toString()) as Int) else 0

public actual fun WSDCreateHttpMessageParameters(pptxparams: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDCreateHttpMessageParameters(pptxparams.toString()) as Int) else 0

public actual fun WSDCreateOutboundAttachment(ppattachment: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDCreateOutboundAttachment(ppattachment.toString()) as Int) else 0

public actual fun WSDCreateUdpAddress(ppaddress: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDCreateUdpAddress(ppaddress.toString()) as Int) else 0

public actual fun WSDCreateUdpMessageParameters(pptxparams: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDCreateUdpMessageParameters(pptxparams.toString()) as Int) else 0

public actual fun WSDDetachLinkedMemory(pvoid: Long) {
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) {
        _windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDDetachLinkedMemory(pvoid.toString())
    }
}

public actual fun WSDFreeLinkedMemory(pvoid: Long) {
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) {
        _windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDFreeLinkedMemory(pvoid.toString())
    }
}

public actual fun WSDGenerateFault(pszcode: PCWSTR, pszsubcode: PCWSTR, pszreason: PCWSTR, pszdetail: PCWSTR, pcontext: Long, ppfault: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDGenerateFault(pszcode.toString(), pszsubcode.toString(), pszreason.toString(), pszdetail.toString(), pcontext.toString(), ppfault.toString()) as Int) else 0

public actual fun WSDGenerateFaultEx(pcode: Long, psubcode: Long, preasons: Long, pszdetail: PCWSTR, ppfault: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDGenerateFaultEx(pcode.toString(), psubcode.toString(), preasons.toString(), pszdetail.toString(), ppfault.toString()) as Int) else 0

public actual fun WSDGetConfigurationOption(dwoption: UInt, pvoid: Long, cboutbuffer: UInt): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDGetConfigurationOption(dwoption.toInt(), pvoid.toString(), cboutbuffer.toInt()) as Int) else 0

public actual fun WSDSetConfigurationOption(dwoption: UInt, pvoid: Long, cbinbuffer: UInt): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDSetConfigurationOption(dwoption.toInt(), pvoid.toString(), cbinbuffer.toInt()) as Int) else 0

public actual fun WSDUriDecode(source: PCWSTR, cchsource: UInt, destout: Long, cchdestout: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDUriDecode(source.toString(), cchsource.toInt(), destout.toString(), cchdestout.toString()) as Int) else 0

public actual fun WSDUriEncode(source: PCWSTR, cchsource: UInt, destout: Long, cchdestout: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDUriEncode(source.toString(), cchsource.toInt(), destout.toString(), cchdestout.toString()) as Int) else 0

public actual fun WSDXMLAddChild(pparent: Long, pchild: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDXMLAddChild(pparent.toString(), pchild.toString()) as Int) else 0

public actual fun WSDXMLAddSibling(pfirst: Long, psecond: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDXMLAddSibling(pfirst.toString(), psecond.toString()) as Int) else 0

public actual fun WSDXMLBuildAnyForSingleElement(pelementname: Long, psztext: PCWSTR, ppany: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDXMLBuildAnyForSingleElement(pelementname.toString(), psztext.toString(), ppany.toString()) as Int) else 0

public actual fun WSDXMLCleanupElement(pany: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDXMLCleanupElement(pany.toString()) as Int) else 0

public actual fun WSDXMLCreateContext(ppcontext: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDXMLCreateContext(ppcontext.toString()) as Int) else 0

public actual fun WSDXMLGetNameFromBuiltinNamespace(psznamespace: PCWSTR, pszname: PCWSTR, ppname: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDXMLGetNameFromBuiltinNamespace(psznamespace.toString(), pszname.toString(), ppname.toString()) as Int) else 0

public actual fun WSDXMLGetValueFromAny(psznamespace: PCWSTR, pszname: PCWSTR, pany: Long, ppszvalue: Long): HRESULT =
    if (_windowsWin32DevicesWebservicesondevicesNapiAddon != null) (_windowsWin32DevicesWebservicesondevicesNapiAddon.windowssys_windows_win32_devices_webservicesondevices_WSDXMLGetValueFromAny(psznamespace.toString(), pszname.toString(), pany.toString(), ppszvalue.toString()) as Int) else 0
