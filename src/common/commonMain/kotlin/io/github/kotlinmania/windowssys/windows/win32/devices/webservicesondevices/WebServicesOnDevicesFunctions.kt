package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun WSDAllocateLinkedMemory(pparent: Long, cbsize: ULong): Long {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDAllocateLinkedMemory", longArrayOf(pparent, cbsize.toLong()))
}

public fun WSDAttachLinkedMemory(pparent: Long, pchild: Long) {
    Win32DynamicFfi.invoke("wsdapi.dll", "WSDAttachLinkedMemory", longArrayOf(pparent, pchild))
}

public fun WSDCreateDeviceHost(pszlocalid: PCWSTR, pcontext: Long, ppdevicehost: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDCreateDeviceHost", longArrayOf(pszlocalid, pcontext, ppdevicehost)).toInt()
}

public fun WSDCreateDeviceHost2(pszlocalid: PCWSTR, pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, ppdevicehost: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDCreateDeviceHost2", longArrayOf(pszlocalid, pcontext, pconfigparams, dwconfigparamcount.toLong(), ppdevicehost)).toInt()
}

public fun WSDCreateDeviceHostAdvanced(pszlocalid: PCWSTR, pcontext: Long, pphostaddresses: Long, dwhostaddresscount: UInt, ppdevicehost: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDCreateDeviceHostAdvanced", longArrayOf(pszlocalid, pcontext, pphostaddresses, dwhostaddresscount.toLong(), ppdevicehost)).toInt()
}

public fun WSDCreateDeviceProxy(pszdeviceid: PCWSTR, pszlocalid: PCWSTR, pcontext: Long, ppdeviceproxy: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDCreateDeviceProxy", longArrayOf(pszdeviceid, pszlocalid, pcontext, ppdeviceproxy)).toInt()
}

public fun WSDCreateDeviceProxy2(pszdeviceid: PCWSTR, pszlocalid: PCWSTR, pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, ppdeviceproxy: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDCreateDeviceProxy2", longArrayOf(pszdeviceid, pszlocalid, pcontext, pconfigparams, dwconfigparamcount.toLong(), ppdeviceproxy)).toInt()
}

public fun WSDCreateDeviceProxyAdvanced(pszdeviceid: PCWSTR, pdeviceaddress: Long, pszlocalid: PCWSTR, pcontext: Long, ppdeviceproxy: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDCreateDeviceProxyAdvanced", longArrayOf(pszdeviceid, pdeviceaddress, pszlocalid, pcontext, ppdeviceproxy)).toInt()
}

public fun WSDCreateDiscoveryProvider(pcontext: Long, ppprovider: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDCreateDiscoveryProvider", longArrayOf(pcontext, ppprovider)).toInt()
}

public fun WSDCreateDiscoveryProvider2(pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, ppprovider: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDCreateDiscoveryProvider2", longArrayOf(pcontext, pconfigparams, dwconfigparamcount.toLong(), ppprovider)).toInt()
}

public fun WSDCreateDiscoveryPublisher(pcontext: Long, pppublisher: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDCreateDiscoveryPublisher", longArrayOf(pcontext, pppublisher)).toInt()
}

public fun WSDCreateDiscoveryPublisher2(pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, pppublisher: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDCreateDiscoveryPublisher2", longArrayOf(pcontext, pconfigparams, dwconfigparamcount.toLong(), pppublisher)).toInt()
}

public fun WSDCreateHttpAddress(ppaddress: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDCreateHttpAddress", longArrayOf(ppaddress)).toInt()
}

public fun WSDCreateHttpMessageParameters(pptxparams: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDCreateHttpMessageParameters", longArrayOf(pptxparams)).toInt()
}

public fun WSDCreateOutboundAttachment(ppattachment: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDCreateOutboundAttachment", longArrayOf(ppattachment)).toInt()
}

public fun WSDCreateUdpAddress(ppaddress: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDCreateUdpAddress", longArrayOf(ppaddress)).toInt()
}

public fun WSDCreateUdpMessageParameters(pptxparams: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDCreateUdpMessageParameters", longArrayOf(pptxparams)).toInt()
}

public fun WSDDetachLinkedMemory(pvoid: Long) {
    Win32DynamicFfi.invoke("wsdapi.dll", "WSDDetachLinkedMemory", longArrayOf(pvoid))
}

public fun WSDFreeLinkedMemory(pvoid: Long) {
    Win32DynamicFfi.invoke("wsdapi.dll", "WSDFreeLinkedMemory", longArrayOf(pvoid))
}

public fun WSDGenerateFault(pszcode: PCWSTR, pszsubcode: PCWSTR, pszreason: PCWSTR, pszdetail: PCWSTR, pcontext: Long, ppfault: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDGenerateFault", longArrayOf(pszcode, pszsubcode, pszreason, pszdetail, pcontext, ppfault)).toInt()
}

public fun WSDGenerateFaultEx(pcode: Long, psubcode: Long, preasons: Long, pszdetail: PCWSTR, ppfault: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDGenerateFaultEx", longArrayOf(pcode, psubcode, preasons, pszdetail, ppfault)).toInt()
}

public fun WSDGetConfigurationOption(dwoption: UInt, pvoid: Long, cboutbuffer: UInt): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDGetConfigurationOption", longArrayOf(dwoption.toLong(), pvoid, cboutbuffer.toLong())).toInt()
}

public fun WSDSetConfigurationOption(dwoption: UInt, pvoid: Long, cbinbuffer: UInt): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDSetConfigurationOption", longArrayOf(dwoption.toLong(), pvoid, cbinbuffer.toLong())).toInt()
}

public fun WSDUriDecode(source: PCWSTR, cchsource: UInt, destout: Long, cchdestout: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDUriDecode", longArrayOf(source, cchsource.toLong(), destout, cchdestout)).toInt()
}

public fun WSDUriEncode(source: PCWSTR, cchsource: UInt, destout: Long, cchdestout: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDUriEncode", longArrayOf(source, cchsource.toLong(), destout, cchdestout)).toInt()
}

public fun WSDXMLAddChild(pparent: Long, pchild: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDXMLAddChild", longArrayOf(pparent, pchild)).toInt()
}

public fun WSDXMLAddSibling(pfirst: Long, psecond: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDXMLAddSibling", longArrayOf(pfirst, psecond)).toInt()
}

public fun WSDXMLBuildAnyForSingleElement(pelementname: Long, psztext: PCWSTR, ppany: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDXMLBuildAnyForSingleElement", longArrayOf(pelementname, psztext, ppany)).toInt()
}

public fun WSDXMLCleanupElement(pany: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDXMLCleanupElement", longArrayOf(pany)).toInt()
}

public fun WSDXMLCreateContext(ppcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDXMLCreateContext", longArrayOf(ppcontext)).toInt()
}

public fun WSDXMLGetNameFromBuiltinNamespace(psznamespace: PCWSTR, pszname: PCWSTR, ppname: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDXMLGetNameFromBuiltinNamespace", longArrayOf(psznamespace, pszname, ppname)).toInt()
}

public fun WSDXMLGetValueFromAny(psznamespace: PCWSTR, pszname: PCWSTR, pany: Long, ppszvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsdapi.dll", "WSDXMLGetValueFromAny", longArrayOf(psznamespace, pszname, pany, ppszvalue)).toInt()
}
