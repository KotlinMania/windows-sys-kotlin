@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun WSDAllocateLinkedMemory(pparent: Long, cbsize: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDAllocateLinkedMemory(pparent.toCPointer<ByteVar>(), cbsize)?.toLong() ?: 0L

public actual fun WSDAttachLinkedMemory(pparent: Long, pchild: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDAttachLinkedMemory(pparent.toCPointer<ByteVar>(), pchild.toCPointer<ByteVar>())
}

public actual fun WSDCreateDeviceHost(pszlocalid: PCWSTR, pcontext: Long, ppdevicehost: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHost(pszlocalid.toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>(), ppdevicehost.toCPointer<ByteVar>())

public actual fun WSDCreateDeviceHost2(pszlocalid: PCWSTR, pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, ppdevicehost: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHost2(pszlocalid.toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>(), pconfigparams.toCPointer<ByteVar>(), dwconfigparamcount, ppdevicehost.toCPointer<ByteVar>())

public actual fun WSDCreateDeviceHostAdvanced(pszlocalid: PCWSTR, pcontext: Long, pphostaddresses: Long, dwhostaddresscount: UInt, ppdevicehost: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHostAdvanced(pszlocalid.toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>(), pphostaddresses.toCPointer<ByteVar>(), dwhostaddresscount, ppdevicehost.toCPointer<ByteVar>())

public actual fun WSDCreateDeviceProxy(pszdeviceid: PCWSTR, pszlocalid: PCWSTR, pcontext: Long, ppdeviceproxy: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxy(pszdeviceid.toCPointer<ByteVar>(), pszlocalid.toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>(), ppdeviceproxy.toCPointer<ByteVar>())

public actual fun WSDCreateDeviceProxy2(pszdeviceid: PCWSTR, pszlocalid: PCWSTR, pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, ppdeviceproxy: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxy2(pszdeviceid.toCPointer<ByteVar>(), pszlocalid.toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>(), pconfigparams.toCPointer<ByteVar>(), dwconfigparamcount, ppdeviceproxy.toCPointer<ByteVar>())

public actual fun WSDCreateDeviceProxyAdvanced(pszdeviceid: PCWSTR, pdeviceaddress: Long, pszlocalid: PCWSTR, pcontext: Long, ppdeviceproxy: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxyAdvanced(pszdeviceid.toCPointer<ByteVar>(), pdeviceaddress.toCPointer<ByteVar>(), pszlocalid.toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>(), ppdeviceproxy.toCPointer<ByteVar>())

public actual fun WSDCreateDiscoveryProvider(pcontext: Long, ppprovider: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryProvider(pcontext.toCPointer<ByteVar>(), ppprovider.toCPointer<ByteVar>())

public actual fun WSDCreateDiscoveryProvider2(pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, ppprovider: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryProvider2(pcontext.toCPointer<ByteVar>(), pconfigparams.toCPointer<ByteVar>(), dwconfigparamcount, ppprovider.toCPointer<ByteVar>())

public actual fun WSDCreateDiscoveryPublisher(pcontext: Long, pppublisher: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryPublisher(pcontext.toCPointer<ByteVar>(), pppublisher.toCPointer<ByteVar>())

public actual fun WSDCreateDiscoveryPublisher2(pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, pppublisher: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryPublisher2(pcontext.toCPointer<ByteVar>(), pconfigparams.toCPointer<ByteVar>(), dwconfigparamcount, pppublisher.toCPointer<ByteVar>())

public actual fun WSDCreateHttpAddress(ppaddress: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDCreateHttpAddress(ppaddress.toCPointer<ByteVar>())

public actual fun WSDCreateHttpMessageParameters(pptxparams: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDCreateHttpMessageParameters(pptxparams.toCPointer<ByteVar>())

public actual fun WSDCreateOutboundAttachment(ppattachment: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDCreateOutboundAttachment(ppattachment.toCPointer<ByteVar>())

public actual fun WSDCreateUdpAddress(ppaddress: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDCreateUdpAddress(ppaddress.toCPointer<ByteVar>())

public actual fun WSDCreateUdpMessageParameters(pptxparams: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDCreateUdpMessageParameters(pptxparams.toCPointer<ByteVar>())

public actual fun WSDDetachLinkedMemory(pvoid: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDDetachLinkedMemory(pvoid.toCPointer<ByteVar>())
}

public actual fun WSDFreeLinkedMemory(pvoid: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDFreeLinkedMemory(pvoid.toCPointer<ByteVar>())
}

public actual fun WSDGenerateFault(pszcode: PCWSTR, pszsubcode: PCWSTR, pszreason: PCWSTR, pszdetail: PCWSTR, pcontext: Long, ppfault: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDGenerateFault(pszcode.toCPointer<ByteVar>(), pszsubcode.toCPointer<ByteVar>(), pszreason.toCPointer<ByteVar>(), pszdetail.toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>(), ppfault.toCPointer<ByteVar>())

public actual fun WSDGenerateFaultEx(pcode: Long, psubcode: Long, preasons: Long, pszdetail: PCWSTR, ppfault: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDGenerateFaultEx(pcode.toCPointer<ByteVar>(), psubcode.toCPointer<ByteVar>(), preasons.toCPointer<ByteVar>(), pszdetail.toCPointer<ByteVar>(), ppfault.toCPointer<ByteVar>())

public actual fun WSDGetConfigurationOption(dwoption: UInt, pvoid: Long, cboutbuffer: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDGetConfigurationOption(dwoption, pvoid.toCPointer<ByteVar>(), cboutbuffer)

public actual fun WSDSetConfigurationOption(dwoption: UInt, pvoid: Long, cbinbuffer: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDSetConfigurationOption(dwoption, pvoid.toCPointer<ByteVar>(), cbinbuffer)

public actual fun WSDUriDecode(source: PCWSTR, cchsource: UInt, destout: Long, cchdestout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDUriDecode(source.toCPointer<ByteVar>(), cchsource, destout.toCPointer<ByteVar>(), cchdestout.toCPointer<ByteVar>())

public actual fun WSDUriEncode(source: PCWSTR, cchsource: UInt, destout: Long, cchdestout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDUriEncode(source.toCPointer<ByteVar>(), cchsource, destout.toCPointer<ByteVar>(), cchdestout.toCPointer<ByteVar>())

public actual fun WSDXMLAddChild(pparent: Long, pchild: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDXMLAddChild(pparent.toCPointer<ByteVar>(), pchild.toCPointer<ByteVar>())

public actual fun WSDXMLAddSibling(pfirst: Long, psecond: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDXMLAddSibling(pfirst.toCPointer<ByteVar>(), psecond.toCPointer<ByteVar>())

public actual fun WSDXMLBuildAnyForSingleElement(pelementname: Long, psztext: PCWSTR, ppany: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDXMLBuildAnyForSingleElement(pelementname.toCPointer<ByteVar>(), psztext.toCPointer<ByteVar>(), ppany.toCPointer<ByteVar>())

public actual fun WSDXMLCleanupElement(pany: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDXMLCleanupElement(pany.toCPointer<ByteVar>())

public actual fun WSDXMLCreateContext(ppcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDXMLCreateContext(ppcontext.toCPointer<ByteVar>())

public actual fun WSDXMLGetNameFromBuiltinNamespace(psznamespace: PCWSTR, pszname: PCWSTR, ppname: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDXMLGetNameFromBuiltinNamespace(psznamespace.toCPointer<ByteVar>(), pszname.toCPointer<ByteVar>(), ppname.toCPointer<ByteVar>())

public actual fun WSDXMLGetValueFromAny(psznamespace: PCWSTR, pszname: PCWSTR, pany: Long, ppszvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_WSDXMLGetValueFromAny(psznamespace.toCPointer<ByteVar>(), pszname.toCPointer<ByteVar>(), pany.toCPointer<ByteVar>(), ppszvalue.toCPointer<ByteVar>())
