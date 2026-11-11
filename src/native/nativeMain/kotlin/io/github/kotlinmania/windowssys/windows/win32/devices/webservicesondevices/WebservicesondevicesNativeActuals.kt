@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDAllocateLinkedMemory
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDAttachLinkedMemory
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHost
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHost2
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHostAdvanced
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxy
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxy2
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxyAdvanced
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryProvider
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryProvider2
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryPublisher
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryPublisher2
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDCreateHttpAddress
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDCreateHttpMessageParameters
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDCreateOutboundAttachment
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDCreateUdpAddress
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDCreateUdpMessageParameters
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDDetachLinkedMemory
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDFreeLinkedMemory
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDGenerateFault
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDGenerateFaultEx
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDGetConfigurationOption
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDSetConfigurationOption
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDUriDecode
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDUriEncode
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDXMLAddChild
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDXMLAddSibling
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDXMLBuildAnyForSingleElement
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDXMLCleanupElement
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDXMLCreateContext
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDXMLGetNameFromBuiltinNamespace
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssys_windows_win32_devices_webservicesondevices_wSDXMLGetValueFromAny
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun wSDAllocateLinkedMemory(pparent: COpaquePointer?, cbsize: ULong): COpaquePointer? =
    windowssys_windows_win32_devices_webservicesondevices_wSDAllocateLinkedMemory(pparent?.value?.toCPointer<ByteVar>(), cbsize)?.let { COpaquePointer(it.toLong()) }

public actual fun wSDAttachLinkedMemory(pparent: COpaquePointer?, pchild: COpaquePointer?) {
    windowssys_windows_win32_devices_webservicesondevices_wSDAttachLinkedMemory(pparent?.value?.toCPointer<ByteVar>(), pchild?.value?.toCPointer<ByteVar>())
}

public actual fun wSDCreateDeviceHost(pszlocalid: Pcwstr, pcontext: COpaquePointer?, ppdevicehost: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHost(pszlocalid?.value?.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>(), ppdevicehost?.value?.toCPointer<ByteVar>())

public actual fun wSDCreateDeviceHost2(pszlocalid: Pcwstr, pcontext: COpaquePointer?, pconfigparams: COpaquePointer?, dwconfigparamcount: UInt, ppdevicehost: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHost2(pszlocalid?.value?.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>(), pconfigparams?.value?.toCPointer<ByteVar>(), dwconfigparamcount, ppdevicehost?.value?.toCPointer<ByteVar>())

public actual fun wSDCreateDeviceHostAdvanced(pszlocalid: Pcwstr, pcontext: COpaquePointer?, pphostaddresses: COpaquePointer?, dwhostaddresscount: UInt, ppdevicehost: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHostAdvanced(pszlocalid?.value?.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>(), pphostaddresses?.value?.toCPointer<ByteVar>(), dwhostaddresscount, ppdevicehost?.value?.toCPointer<ByteVar>())

public actual fun wSDCreateDeviceProxy(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: COpaquePointer?, ppdeviceproxy: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxy(pszdeviceid?.value?.toCPointer<ByteVar>(), pszlocalid?.value?.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>(), ppdeviceproxy?.value?.toCPointer<ByteVar>())

public actual fun wSDCreateDeviceProxy2(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: COpaquePointer?, pconfigparams: COpaquePointer?, dwconfigparamcount: UInt, ppdeviceproxy: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxy2(pszdeviceid?.value?.toCPointer<ByteVar>(), pszlocalid?.value?.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>(), pconfigparams?.value?.toCPointer<ByteVar>(), dwconfigparamcount, ppdeviceproxy?.value?.toCPointer<ByteVar>())

public actual fun wSDCreateDeviceProxyAdvanced(pszdeviceid: Pcwstr, pdeviceaddress: COpaquePointer?, pszlocalid: Pcwstr, pcontext: COpaquePointer?, ppdeviceproxy: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxyAdvanced(pszdeviceid?.value?.toCPointer<ByteVar>(), pdeviceaddress?.value?.toCPointer<ByteVar>(), pszlocalid?.value?.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>(), ppdeviceproxy?.value?.toCPointer<ByteVar>())

public actual fun wSDCreateDiscoveryProvider(pcontext: COpaquePointer?, ppprovider: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryProvider(pcontext?.value?.toCPointer<ByteVar>(), ppprovider?.value?.toCPointer<ByteVar>())

public actual fun wSDCreateDiscoveryProvider2(pcontext: COpaquePointer?, pconfigparams: COpaquePointer?, dwconfigparamcount: UInt, ppprovider: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryProvider2(pcontext?.value?.toCPointer<ByteVar>(), pconfigparams?.value?.toCPointer<ByteVar>(), dwconfigparamcount, ppprovider?.value?.toCPointer<ByteVar>())

public actual fun wSDCreateDiscoveryPublisher(pcontext: COpaquePointer?, pppublisher: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryPublisher(pcontext?.value?.toCPointer<ByteVar>(), pppublisher?.value?.toCPointer<ByteVar>())

public actual fun wSDCreateDiscoveryPublisher2(pcontext: COpaquePointer?, pconfigparams: COpaquePointer?, dwconfigparamcount: UInt, pppublisher: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryPublisher2(pcontext?.value?.toCPointer<ByteVar>(), pconfigparams?.value?.toCPointer<ByteVar>(), dwconfigparamcount, pppublisher?.value?.toCPointer<ByteVar>())

public actual fun wSDCreateHttpAddress(ppaddress: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDCreateHttpAddress(ppaddress?.value?.toCPointer<ByteVar>())

public actual fun wSDCreateHttpMessageParameters(pptxparams: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDCreateHttpMessageParameters(pptxparams?.value?.toCPointer<ByteVar>())

public actual fun wSDCreateOutboundAttachment(ppattachment: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDCreateOutboundAttachment(ppattachment?.value?.toCPointer<ByteVar>())

public actual fun wSDCreateUdpAddress(ppaddress: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDCreateUdpAddress(ppaddress?.value?.toCPointer<ByteVar>())

public actual fun wSDCreateUdpMessageParameters(pptxparams: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDCreateUdpMessageParameters(pptxparams?.value?.toCPointer<ByteVar>())

public actual fun wSDDetachLinkedMemory(pvoid: COpaquePointer?) {
    windowssys_windows_win32_devices_webservicesondevices_wSDDetachLinkedMemory(pvoid?.value?.toCPointer<ByteVar>())
}

public actual fun wSDFreeLinkedMemory(pvoid: COpaquePointer?) {
    windowssys_windows_win32_devices_webservicesondevices_wSDFreeLinkedMemory(pvoid?.value?.toCPointer<ByteVar>())
}

public actual fun wSDGenerateFault(pszcode: Pcwstr, pszsubcode: Pcwstr, pszreason: Pcwstr, pszdetail: Pcwstr, pcontext: COpaquePointer?, ppfault: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDGenerateFault(pszcode?.value?.toCPointer<ByteVar>(), pszsubcode?.value?.toCPointer<ByteVar>(), pszreason?.value?.toCPointer<ByteVar>(), pszdetail?.value?.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>(), ppfault?.value?.toCPointer<ByteVar>())

public actual fun wSDGenerateFaultEx(pcode: COpaquePointer?, psubcode: COpaquePointer?, preasons: COpaquePointer?, pszdetail: Pcwstr, ppfault: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDGenerateFaultEx(pcode?.value?.toCPointer<ByteVar>(), psubcode?.value?.toCPointer<ByteVar>(), preasons?.value?.toCPointer<ByteVar>(), pszdetail?.value?.toCPointer<ByteVar>(), ppfault?.value?.toCPointer<ByteVar>())

public actual fun wSDGetConfigurationOption(dwoption: UInt, pvoid: COpaquePointer?, cboutbuffer: UInt): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDGetConfigurationOption(dwoption, pvoid?.value?.toCPointer<ByteVar>(), cboutbuffer)

public actual fun wSDSetConfigurationOption(dwoption: UInt, pvoid: COpaquePointer?, cbinbuffer: UInt): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDSetConfigurationOption(dwoption, pvoid?.value?.toCPointer<ByteVar>(), cbinbuffer)

public actual fun wSDUriDecode(source: Pcwstr, cchsource: UInt, destout: COpaquePointer?, cchdestout: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDUriDecode(source?.value?.toCPointer<ByteVar>(), cchsource, destout?.value?.toCPointer<ByteVar>(), cchdestout?.value?.toCPointer<ByteVar>())

public actual fun wSDUriEncode(source: Pcwstr, cchsource: UInt, destout: COpaquePointer?, cchdestout: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDUriEncode(source?.value?.toCPointer<ByteVar>(), cchsource, destout?.value?.toCPointer<ByteVar>(), cchdestout?.value?.toCPointer<ByteVar>())

public actual fun wSDXMLAddChild(pparent: COpaquePointer?, pchild: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDXMLAddChild(pparent?.value?.toCPointer<ByteVar>(), pchild?.value?.toCPointer<ByteVar>())

public actual fun wSDXMLAddSibling(pfirst: COpaquePointer?, psecond: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDXMLAddSibling(pfirst?.value?.toCPointer<ByteVar>(), psecond?.value?.toCPointer<ByteVar>())

public actual fun wSDXMLBuildAnyForSingleElement(pelementname: COpaquePointer?, psztext: Pcwstr, ppany: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDXMLBuildAnyForSingleElement(pelementname?.value?.toCPointer<ByteVar>(), psztext?.value?.toCPointer<ByteVar>(), ppany?.value?.toCPointer<ByteVar>())

public actual fun wSDXMLCleanupElement(pany: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDXMLCleanupElement(pany?.value?.toCPointer<ByteVar>())

public actual fun wSDXMLCreateContext(ppcontext: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDXMLCreateContext(ppcontext?.value?.toCPointer<ByteVar>())

public actual fun wSDXMLGetNameFromBuiltinNamespace(psznamespace: Pcwstr, pszname: Pcwstr, ppname: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDXMLGetNameFromBuiltinNamespace(psznamespace?.value?.toCPointer<ByteVar>(), pszname?.value?.toCPointer<ByteVar>(), ppname?.value?.toCPointer<ByteVar>())

public actual fun wSDXMLGetValueFromAny(psznamespace: Pcwstr, pszname: Pcwstr, pany: COpaquePointer?, ppszvalue: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_webservicesondevices_wSDXMLGetValueFromAny(psznamespace?.value?.toCPointer<ByteVar>(), pszname?.value?.toCPointer<ByteVar>(), pany?.value?.toCPointer<ByteVar>(), ppszvalue?.value?.toCPointer<ByteVar>())
