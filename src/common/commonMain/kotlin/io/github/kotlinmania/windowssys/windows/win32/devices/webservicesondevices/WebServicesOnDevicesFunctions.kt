package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public expect fun WSDAllocateLinkedMemory(pparent: Long, cbsize: ULong): Long

public expect fun WSDAttachLinkedMemory(pparent: Long, pchild: Long)

public expect fun WSDCreateDeviceHost(pszlocalid: PCWSTR, pcontext: Long, ppdevicehost: Long): HRESULT

public expect fun WSDCreateDeviceHost2(pszlocalid: PCWSTR, pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, ppdevicehost: Long): HRESULT

public expect fun WSDCreateDeviceHostAdvanced(pszlocalid: PCWSTR, pcontext: Long, pphostaddresses: Long, dwhostaddresscount: UInt, ppdevicehost: Long): HRESULT

public expect fun WSDCreateDeviceProxy(pszdeviceid: PCWSTR, pszlocalid: PCWSTR, pcontext: Long, ppdeviceproxy: Long): HRESULT

public expect fun WSDCreateDeviceProxy2(pszdeviceid: PCWSTR, pszlocalid: PCWSTR, pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, ppdeviceproxy: Long): HRESULT

public expect fun WSDCreateDeviceProxyAdvanced(pszdeviceid: PCWSTR, pdeviceaddress: Long, pszlocalid: PCWSTR, pcontext: Long, ppdeviceproxy: Long): HRESULT

public expect fun WSDCreateDiscoveryProvider(pcontext: Long, ppprovider: Long): HRESULT

public expect fun WSDCreateDiscoveryProvider2(pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, ppprovider: Long): HRESULT

public expect fun WSDCreateDiscoveryPublisher(pcontext: Long, pppublisher: Long): HRESULT

public expect fun WSDCreateDiscoveryPublisher2(pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, pppublisher: Long): HRESULT

public expect fun WSDCreateHttpAddress(ppaddress: Long): HRESULT

public expect fun WSDCreateHttpMessageParameters(pptxparams: Long): HRESULT

public expect fun WSDCreateOutboundAttachment(ppattachment: Long): HRESULT

public expect fun WSDCreateUdpAddress(ppaddress: Long): HRESULT

public expect fun WSDCreateUdpMessageParameters(pptxparams: Long): HRESULT

public expect fun WSDDetachLinkedMemory(pvoid: Long)

public expect fun WSDFreeLinkedMemory(pvoid: Long)

public expect fun WSDGenerateFault(pszcode: PCWSTR, pszsubcode: PCWSTR, pszreason: PCWSTR, pszdetail: PCWSTR, pcontext: Long, ppfault: Long): HRESULT

public expect fun WSDGenerateFaultEx(pcode: Long, psubcode: Long, preasons: Long, pszdetail: PCWSTR, ppfault: Long): HRESULT

public expect fun WSDGetConfigurationOption(dwoption: UInt, pvoid: Long, cboutbuffer: UInt): HRESULT

public expect fun WSDSetConfigurationOption(dwoption: UInt, pvoid: Long, cbinbuffer: UInt): HRESULT

public expect fun WSDUriDecode(source: PCWSTR, cchsource: UInt, destout: Long, cchdestout: Long): HRESULT

public expect fun WSDUriEncode(source: PCWSTR, cchsource: UInt, destout: Long, cchdestout: Long): HRESULT

public expect fun WSDXMLAddChild(pparent: Long, pchild: Long): HRESULT

public expect fun WSDXMLAddSibling(pfirst: Long, psecond: Long): HRESULT

public expect fun WSDXMLBuildAnyForSingleElement(pelementname: Long, psztext: PCWSTR, ppany: Long): HRESULT

public expect fun WSDXMLCleanupElement(pany: Long): HRESULT

public expect fun WSDXMLCreateContext(ppcontext: Long): HRESULT

public expect fun WSDXMLGetNameFromBuiltinNamespace(psznamespace: PCWSTR, pszname: PCWSTR, ppname: Long): HRESULT

public expect fun WSDXMLGetValueFromAny(psznamespace: PCWSTR, pszname: PCWSTR, pany: Long, ppszvalue: Long): HRESULT
