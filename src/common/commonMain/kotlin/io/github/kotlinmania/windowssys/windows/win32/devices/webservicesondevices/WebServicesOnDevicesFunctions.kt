package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun wSDAllocateLinkedMemory(pparent: COpaquePointer?, cbsize: ULong): COpaquePointer?

public expect fun wSDAttachLinkedMemory(pparent: COpaquePointer?, pchild: COpaquePointer?)

public expect fun wSDCreateDeviceHost(pszlocalid: Pcwstr, pcontext: COpaquePointer?, ppdevicehost: COpaquePointer?): Hresult

public expect fun wSDCreateDeviceHost2(pszlocalid: Pcwstr, pcontext: COpaquePointer?, pconfigparams: COpaquePointer?, dwconfigparamcount: UInt, ppdevicehost: COpaquePointer?): Hresult

public expect fun wSDCreateDeviceHostAdvanced(pszlocalid: Pcwstr, pcontext: COpaquePointer?, pphostaddresses: COpaquePointer?, dwhostaddresscount: UInt, ppdevicehost: COpaquePointer?): Hresult

public expect fun wSDCreateDeviceProxy(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: COpaquePointer?, ppdeviceproxy: COpaquePointer?): Hresult

public expect fun wSDCreateDeviceProxy2(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: COpaquePointer?, pconfigparams: COpaquePointer?, dwconfigparamcount: UInt, ppdeviceproxy: COpaquePointer?): Hresult

public expect fun wSDCreateDeviceProxyAdvanced(pszdeviceid: Pcwstr, pdeviceaddress: COpaquePointer?, pszlocalid: Pcwstr, pcontext: COpaquePointer?, ppdeviceproxy: COpaquePointer?): Hresult

public expect fun wSDCreateDiscoveryProvider(pcontext: COpaquePointer?, ppprovider: COpaquePointer?): Hresult

public expect fun wSDCreateDiscoveryProvider2(pcontext: COpaquePointer?, pconfigparams: COpaquePointer?, dwconfigparamcount: UInt, ppprovider: COpaquePointer?): Hresult

public expect fun wSDCreateDiscoveryPublisher(pcontext: COpaquePointer?, pppublisher: COpaquePointer?): Hresult

public expect fun wSDCreateDiscoveryPublisher2(pcontext: COpaquePointer?, pconfigparams: COpaquePointer?, dwconfigparamcount: UInt, pppublisher: COpaquePointer?): Hresult

public expect fun wSDCreateHttpAddress(ppaddress: COpaquePointer?): Hresult

public expect fun wSDCreateHttpMessageParameters(pptxparams: COpaquePointer?): Hresult

public expect fun wSDCreateOutboundAttachment(ppattachment: COpaquePointer?): Hresult

public expect fun wSDCreateUdpAddress(ppaddress: COpaquePointer?): Hresult

public expect fun wSDCreateUdpMessageParameters(pptxparams: COpaquePointer?): Hresult

public expect fun wSDDetachLinkedMemory(pvoid: COpaquePointer?)

public expect fun wSDFreeLinkedMemory(pvoid: COpaquePointer?)

public expect fun wSDGenerateFault(pszcode: Pcwstr, pszsubcode: Pcwstr, pszreason: Pcwstr, pszdetail: Pcwstr, pcontext: COpaquePointer?, ppfault: COpaquePointer?): Hresult

public expect fun wSDGenerateFaultEx(pcode: COpaquePointer?, psubcode: COpaquePointer?, preasons: COpaquePointer?, pszdetail: Pcwstr, ppfault: COpaquePointer?): Hresult

public expect fun wSDGetConfigurationOption(dwoption: UInt, pvoid: COpaquePointer?, cboutbuffer: UInt): Hresult

public expect fun wSDSetConfigurationOption(dwoption: UInt, pvoid: COpaquePointer?, cbinbuffer: UInt): Hresult

public expect fun wSDUriDecode(source: Pcwstr, cchsource: UInt, destout: COpaquePointer?, cchdestout: COpaquePointer?): Hresult

public expect fun wSDUriEncode(source: Pcwstr, cchsource: UInt, destout: COpaquePointer?, cchdestout: COpaquePointer?): Hresult

public expect fun wSDXMLAddChild(pparent: COpaquePointer?, pchild: COpaquePointer?): Hresult

public expect fun wSDXMLAddSibling(pfirst: COpaquePointer?, psecond: COpaquePointer?): Hresult

public expect fun wSDXMLBuildAnyForSingleElement(pelementname: COpaquePointer?, psztext: Pcwstr, ppany: COpaquePointer?): Hresult

public expect fun wSDXMLCleanupElement(pany: COpaquePointer?): Hresult

public expect fun wSDXMLCreateContext(ppcontext: COpaquePointer?): Hresult

public expect fun wSDXMLGetNameFromBuiltinNamespace(psznamespace: Pcwstr, pszname: Pcwstr, ppname: COpaquePointer?): Hresult

public expect fun wSDXMLGetValueFromAny(psznamespace: Pcwstr, pszname: Pcwstr, pany: COpaquePointer?, ppszvalue: COpaquePointer?): Hresult
