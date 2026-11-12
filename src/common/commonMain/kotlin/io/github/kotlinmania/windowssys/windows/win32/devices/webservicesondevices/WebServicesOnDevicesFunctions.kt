package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public expect fun wSDAllocateLinkedMemory(pparent: MutPtr<CVoid>, cbsize: ULong): MutPtr<CVoid>

public expect fun wSDAttachLinkedMemory(pparent: MutPtr<CVoid>, pchild: MutPtr<CVoid>)

public expect fun wSDCreateDeviceHost(pszlocalid: Pcwstr, pcontext: MutPtr<CVoid>, ppdevicehost: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wSDCreateDeviceHost2(pszlocalid: Pcwstr, pcontext: MutPtr<CVoid>, pconfigparams: ConstPtr<WsdConfigParam>, dwconfigparamcount: UInt, ppdevicehost: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wSDCreateDeviceHostAdvanced(pszlocalid: Pcwstr, pcontext: MutPtr<CVoid>, pphostaddresses: ConstPtr<MutPtr<CVoid>>, dwhostaddresscount: UInt, ppdevicehost: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wSDCreateDeviceProxy(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: MutPtr<CVoid>, ppdeviceproxy: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wSDCreateDeviceProxy2(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: MutPtr<CVoid>, pconfigparams: ConstPtr<WsdConfigParam>, dwconfigparamcount: UInt, ppdeviceproxy: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wSDCreateDeviceProxyAdvanced(pszdeviceid: Pcwstr, pdeviceaddress: MutPtr<CVoid>, pszlocalid: Pcwstr, pcontext: MutPtr<CVoid>, ppdeviceproxy: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wSDCreateDiscoveryProvider(pcontext: MutPtr<CVoid>, ppprovider: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wSDCreateDiscoveryProvider2(pcontext: MutPtr<CVoid>, pconfigparams: ConstPtr<WsdConfigParam>, dwconfigparamcount: UInt, ppprovider: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wSDCreateDiscoveryPublisher(pcontext: MutPtr<CVoid>, pppublisher: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wSDCreateDiscoveryPublisher2(pcontext: MutPtr<CVoid>, pconfigparams: ConstPtr<WsdConfigParam>, dwconfigparamcount: UInt, pppublisher: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wSDCreateHttpAddress(ppaddress: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wSDCreateHttpMessageParameters(pptxparams: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wSDCreateOutboundAttachment(ppattachment: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wSDCreateUdpAddress(ppaddress: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wSDCreateUdpMessageParameters(pptxparams: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wSDDetachLinkedMemory(pvoid: MutPtr<CVoid>)

public expect fun wSDFreeLinkedMemory(pvoid: MutPtr<CVoid>)

public expect fun wSDGenerateFault(pszcode: Pcwstr, pszsubcode: Pcwstr, pszreason: Pcwstr, pszdetail: Pcwstr, pcontext: MutPtr<CVoid>, ppfault: MutPtr<MutPtr<WsdSoapFault>>): Hresult

public expect fun wSDGenerateFaultEx(pcode: ConstPtr<WsdxmlName>, psubcode: ConstPtr<WsdxmlName>, preasons: ConstPtr<WsdLocalizedStringList>, pszdetail: Pcwstr, ppfault: MutPtr<MutPtr<WsdSoapFault>>): Hresult

public expect fun wSDGetConfigurationOption(dwoption: UInt, pvoid: MutPtr<CVoid>, cboutbuffer: UInt): Hresult

public expect fun wSDSetConfigurationOption(dwoption: UInt, pvoid: ConstPtr<CVoid>, cbinbuffer: UInt): Hresult

public expect fun wSDUriDecode(source: Pcwstr, cchsource: UInt, destout: MutPtr<Pwstr>, cchdestout: MutPtr<UInt>): Hresult

public expect fun wSDUriEncode(source: Pcwstr, cchsource: UInt, destout: MutPtr<Pwstr>, cchdestout: MutPtr<UInt>): Hresult

public expect fun wSDXMLAddChild(pparent: MutPtr<WsdxmlElement>, pchild: MutPtr<WsdxmlElement>): Hresult

public expect fun wSDXMLAddSibling(pfirst: MutPtr<WsdxmlElement>, psecond: MutPtr<WsdxmlElement>): Hresult

public expect fun wSDXMLBuildAnyForSingleElement(pelementname: MutPtr<WsdxmlName>, psztext: Pcwstr, ppany: MutPtr<MutPtr<WsdxmlElement>>): Hresult

public expect fun wSDXMLCleanupElement(pany: MutPtr<WsdxmlElement>): Hresult

public expect fun wSDXMLCreateContext(ppcontext: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wSDXMLGetNameFromBuiltinNamespace(psznamespace: Pcwstr, pszname: Pcwstr, ppname: MutPtr<MutPtr<WsdxmlName>>): Hresult

public expect fun wSDXMLGetValueFromAny(psznamespace: Pcwstr, pszname: Pcwstr, pany: MutPtr<WsdxmlElement>, ppszvalue: MutPtr<Pcwstr>): Hresult
