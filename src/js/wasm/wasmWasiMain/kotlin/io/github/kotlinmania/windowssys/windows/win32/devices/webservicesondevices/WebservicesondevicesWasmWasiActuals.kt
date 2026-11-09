@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public actual fun WSDAllocateLinkedMemory(pparent: Long, cbsize: ULong): Long =
    0L

public actual fun WSDAttachLinkedMemory(pparent: Long, pchild: Long) {
}

public actual fun WSDCreateDeviceHost(pszlocalid: PCWSTR, pcontext: Long, ppdevicehost: Long): HRESULT =
    0

public actual fun WSDCreateDeviceHost2(pszlocalid: PCWSTR, pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, ppdevicehost: Long): HRESULT =
    0

public actual fun WSDCreateDeviceHostAdvanced(pszlocalid: PCWSTR, pcontext: Long, pphostaddresses: Long, dwhostaddresscount: UInt, ppdevicehost: Long): HRESULT =
    0

public actual fun WSDCreateDeviceProxy(pszdeviceid: PCWSTR, pszlocalid: PCWSTR, pcontext: Long, ppdeviceproxy: Long): HRESULT =
    0

public actual fun WSDCreateDeviceProxy2(pszdeviceid: PCWSTR, pszlocalid: PCWSTR, pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, ppdeviceproxy: Long): HRESULT =
    0

public actual fun WSDCreateDeviceProxyAdvanced(pszdeviceid: PCWSTR, pdeviceaddress: Long, pszlocalid: PCWSTR, pcontext: Long, ppdeviceproxy: Long): HRESULT =
    0

public actual fun WSDCreateDiscoveryProvider(pcontext: Long, ppprovider: Long): HRESULT =
    0

public actual fun WSDCreateDiscoveryProvider2(pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, ppprovider: Long): HRESULT =
    0

public actual fun WSDCreateDiscoveryPublisher(pcontext: Long, pppublisher: Long): HRESULT =
    0

public actual fun WSDCreateDiscoveryPublisher2(pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, pppublisher: Long): HRESULT =
    0

public actual fun WSDCreateHttpAddress(ppaddress: Long): HRESULT =
    0

public actual fun WSDCreateHttpMessageParameters(pptxparams: Long): HRESULT =
    0

public actual fun WSDCreateOutboundAttachment(ppattachment: Long): HRESULT =
    0

public actual fun WSDCreateUdpAddress(ppaddress: Long): HRESULT =
    0

public actual fun WSDCreateUdpMessageParameters(pptxparams: Long): HRESULT =
    0

public actual fun WSDDetachLinkedMemory(pvoid: Long) {
}

public actual fun WSDFreeLinkedMemory(pvoid: Long) {
}

public actual fun WSDGenerateFault(pszcode: PCWSTR, pszsubcode: PCWSTR, pszreason: PCWSTR, pszdetail: PCWSTR, pcontext: Long, ppfault: Long): HRESULT =
    0

public actual fun WSDGenerateFaultEx(pcode: Long, psubcode: Long, preasons: Long, pszdetail: PCWSTR, ppfault: Long): HRESULT =
    0

public actual fun WSDGetConfigurationOption(dwoption: UInt, pvoid: Long, cboutbuffer: UInt): HRESULT =
    0

public actual fun WSDSetConfigurationOption(dwoption: UInt, pvoid: Long, cbinbuffer: UInt): HRESULT =
    0

public actual fun WSDUriDecode(source: PCWSTR, cchsource: UInt, destout: Long, cchdestout: Long): HRESULT =
    0

public actual fun WSDUriEncode(source: PCWSTR, cchsource: UInt, destout: Long, cchdestout: Long): HRESULT =
    0

public actual fun WSDXMLAddChild(pparent: Long, pchild: Long): HRESULT =
    0

public actual fun WSDXMLAddSibling(pfirst: Long, psecond: Long): HRESULT =
    0

public actual fun WSDXMLBuildAnyForSingleElement(pelementname: Long, psztext: PCWSTR, ppany: Long): HRESULT =
    0

public actual fun WSDXMLCleanupElement(pany: Long): HRESULT =
    0

public actual fun WSDXMLCreateContext(ppcontext: Long): HRESULT =
    0

public actual fun WSDXMLGetNameFromBuiltinNamespace(psznamespace: PCWSTR, pszname: PCWSTR, ppname: Long): HRESULT =
    0

public actual fun WSDXMLGetValueFromAny(psznamespace: PCWSTR, pszname: PCWSTR, pany: Long, ppszvalue: Long): HRESULT =
    0
