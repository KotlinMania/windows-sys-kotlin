package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun wSDAllocateLinkedMemory(pparent: MutPtr, cbsize: ULong): MutPtr

public expect fun wSDAttachLinkedMemory(pparent: MutPtr, pchild: MutPtr)

public expect fun wSDCreateDeviceHost(pszlocalid: Pcwstr, pcontext: MutPtr, ppdevicehost: MutPtr): Hresult

public expect fun wSDCreateDeviceHost2(pszlocalid: Pcwstr, pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, ppdevicehost: MutPtr): Hresult

public expect fun wSDCreateDeviceHostAdvanced(pszlocalid: Pcwstr, pcontext: MutPtr, pphostaddresses: ConstPtr, dwhostaddresscount: UInt, ppdevicehost: MutPtr): Hresult

public expect fun wSDCreateDeviceProxy(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: MutPtr, ppdeviceproxy: MutPtr): Hresult

public expect fun wSDCreateDeviceProxy2(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, ppdeviceproxy: MutPtr): Hresult

public expect fun wSDCreateDeviceProxyAdvanced(pszdeviceid: Pcwstr, pdeviceaddress: MutPtr, pszlocalid: Pcwstr, pcontext: MutPtr, ppdeviceproxy: MutPtr): Hresult

public expect fun wSDCreateDiscoveryProvider(pcontext: MutPtr, ppprovider: MutPtr): Hresult

public expect fun wSDCreateDiscoveryProvider2(pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, ppprovider: MutPtr): Hresult

public expect fun wSDCreateDiscoveryPublisher(pcontext: MutPtr, pppublisher: MutPtr): Hresult

public expect fun wSDCreateDiscoveryPublisher2(pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, pppublisher: MutPtr): Hresult

public expect fun wSDCreateHttpAddress(ppaddress: MutPtr): Hresult

public expect fun wSDCreateHttpMessageParameters(pptxparams: MutPtr): Hresult

public expect fun wSDCreateOutboundAttachment(ppattachment: MutPtr): Hresult

public expect fun wSDCreateUdpAddress(ppaddress: MutPtr): Hresult

public expect fun wSDCreateUdpMessageParameters(pptxparams: MutPtr): Hresult

public expect fun wSDDetachLinkedMemory(pvoid: MutPtr)

public expect fun wSDFreeLinkedMemory(pvoid: MutPtr)

public expect fun wSDGenerateFault(pszcode: Pcwstr, pszsubcode: Pcwstr, pszreason: Pcwstr, pszdetail: Pcwstr, pcontext: MutPtr, ppfault: MutPtr): Hresult

public expect fun wSDGenerateFaultEx(pcode: ConstPtr, psubcode: ConstPtr, preasons: ConstPtr, pszdetail: Pcwstr, ppfault: MutPtr): Hresult

public expect fun wSDGetConfigurationOption(dwoption: UInt, pvoid: MutPtr, cboutbuffer: UInt): Hresult

public expect fun wSDSetConfigurationOption(dwoption: UInt, pvoid: ConstPtr, cbinbuffer: UInt): Hresult

public expect fun wSDUriDecode(source: Pcwstr, cchsource: UInt, destout: MutPtr, cchdestout: MutPtr): Hresult

public expect fun wSDUriEncode(source: Pcwstr, cchsource: UInt, destout: MutPtr, cchdestout: MutPtr): Hresult

public expect fun wSDXMLAddChild(pparent: MutPtr, pchild: MutPtr): Hresult

public expect fun wSDXMLAddSibling(pfirst: MutPtr, psecond: MutPtr): Hresult

public expect fun wSDXMLBuildAnyForSingleElement(pelementname: MutPtr, psztext: Pcwstr, ppany: MutPtr): Hresult

public expect fun wSDXMLCleanupElement(pany: MutPtr): Hresult

public expect fun wSDXMLCreateContext(ppcontext: MutPtr): Hresult

public expect fun wSDXMLGetNameFromBuiltinNamespace(psznamespace: Pcwstr, pszname: Pcwstr, ppname: MutPtr): Hresult

public expect fun wSDXMLGetValueFromAny(psznamespace: Pcwstr, pszname: Pcwstr, pany: MutPtr, ppszvalue: MutPtr): Hresult
