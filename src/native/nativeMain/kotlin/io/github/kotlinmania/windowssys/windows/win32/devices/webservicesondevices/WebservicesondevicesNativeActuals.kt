@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDAllocateLinkedMemory
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDAttachLinkedMemory
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHost
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHost2
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHostAdvanced
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxy
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxy2
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxyAdvanced
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryProvider
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryProvider2
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryPublisher
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryPublisher2
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateHttpAddress
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateHttpMessageParameters
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateOutboundAttachment
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateUdpAddress
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateUdpMessageParameters
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDDetachLinkedMemory
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDFreeLinkedMemory
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDGenerateFault
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDGenerateFaultEx
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDGetConfigurationOption
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDSetConfigurationOption
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDUriDecode
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDUriEncode
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLAddChild
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLAddSibling
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLBuildAnyForSingleElement
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLCleanupElement
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLCreateContext
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLGetNameFromBuiltinNamespace
import io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices.cinterop.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLGetValueFromAny
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun wSDAllocateLinkedMemory(pparent: MutPtr, cbsize: ULong): MutPtr =
    MutPtr(windowssysWindowsWin32DevicesWebservicesondevicesWSDAllocateLinkedMemory(pparent.rawAddress.toCPointer<ByteVar>(), cbsize)?.toLong() ?: 0L)

public actual fun wSDAttachLinkedMemory(pparent: MutPtr, pchild: MutPtr) {
    windowssysWindowsWin32DevicesWebservicesondevicesWSDAttachLinkedMemory(pparent.rawAddress.toCPointer<ByteVar>(), pchild.rawAddress.toCPointer<ByteVar>())
}

public actual fun wSDCreateDeviceHost(pszlocalid: Pcwstr, pcontext: MutPtr, ppdevicehost: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHost(pszlocalid.rawAddress.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), ppdevicehost.rawAddress.toCPointer<ByteVar>())

public actual fun wSDCreateDeviceHost2(pszlocalid: Pcwstr, pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, ppdevicehost: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHost2(pszlocalid.rawAddress.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), pconfigparams.rawAddress.toCPointer<ByteVar>(), dwconfigparamcount, ppdevicehost.rawAddress.toCPointer<ByteVar>())

public actual fun wSDCreateDeviceHostAdvanced(pszlocalid: Pcwstr, pcontext: MutPtr, pphostaddresses: ConstPtr, dwhostaddresscount: UInt, ppdevicehost: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHostAdvanced(pszlocalid.rawAddress.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), pphostaddresses.rawAddress.toCPointer<ByteVar>(), dwhostaddresscount, ppdevicehost.rawAddress.toCPointer<ByteVar>())

public actual fun wSDCreateDeviceProxy(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: MutPtr, ppdeviceproxy: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxy(pszdeviceid.rawAddress.toCPointer<ByteVar>(), pszlocalid.rawAddress.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), ppdeviceproxy.rawAddress.toCPointer<ByteVar>())

public actual fun wSDCreateDeviceProxy2(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, ppdeviceproxy: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxy2(pszdeviceid.rawAddress.toCPointer<ByteVar>(), pszlocalid.rawAddress.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), pconfigparams.rawAddress.toCPointer<ByteVar>(), dwconfigparamcount, ppdeviceproxy.rawAddress.toCPointer<ByteVar>())

public actual fun wSDCreateDeviceProxyAdvanced(pszdeviceid: Pcwstr, pdeviceaddress: MutPtr, pszlocalid: Pcwstr, pcontext: MutPtr, ppdeviceproxy: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxyAdvanced(pszdeviceid.rawAddress.toCPointer<ByteVar>(), pdeviceaddress.rawAddress.toCPointer<ByteVar>(), pszlocalid.rawAddress.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), ppdeviceproxy.rawAddress.toCPointer<ByteVar>())

public actual fun wSDCreateDiscoveryProvider(pcontext: MutPtr, ppprovider: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryProvider(pcontext.rawAddress.toCPointer<ByteVar>(), ppprovider.rawAddress.toCPointer<ByteVar>())

public actual fun wSDCreateDiscoveryProvider2(pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, ppprovider: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryProvider2(pcontext.rawAddress.toCPointer<ByteVar>(), pconfigparams.rawAddress.toCPointer<ByteVar>(), dwconfigparamcount, ppprovider.rawAddress.toCPointer<ByteVar>())

public actual fun wSDCreateDiscoveryPublisher(pcontext: MutPtr, pppublisher: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryPublisher(pcontext.rawAddress.toCPointer<ByteVar>(), pppublisher.rawAddress.toCPointer<ByteVar>())

public actual fun wSDCreateDiscoveryPublisher2(pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, pppublisher: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryPublisher2(pcontext.rawAddress.toCPointer<ByteVar>(), pconfigparams.rawAddress.toCPointer<ByteVar>(), dwconfigparamcount, pppublisher.rawAddress.toCPointer<ByteVar>())

public actual fun wSDCreateHttpAddress(ppaddress: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateHttpAddress(ppaddress.rawAddress.toCPointer<ByteVar>())

public actual fun wSDCreateHttpMessageParameters(pptxparams: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateHttpMessageParameters(pptxparams.rawAddress.toCPointer<ByteVar>())

public actual fun wSDCreateOutboundAttachment(ppattachment: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateOutboundAttachment(ppattachment.rawAddress.toCPointer<ByteVar>())

public actual fun wSDCreateUdpAddress(ppaddress: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateUdpAddress(ppaddress.rawAddress.toCPointer<ByteVar>())

public actual fun wSDCreateUdpMessageParameters(pptxparams: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateUdpMessageParameters(pptxparams.rawAddress.toCPointer<ByteVar>())

public actual fun wSDDetachLinkedMemory(pvoid: MutPtr) {
    windowssysWindowsWin32DevicesWebservicesondevicesWSDDetachLinkedMemory(pvoid.rawAddress.toCPointer<ByteVar>())
}

public actual fun wSDFreeLinkedMemory(pvoid: MutPtr) {
    windowssysWindowsWin32DevicesWebservicesondevicesWSDFreeLinkedMemory(pvoid.rawAddress.toCPointer<ByteVar>())
}

public actual fun wSDGenerateFault(pszcode: Pcwstr, pszsubcode: Pcwstr, pszreason: Pcwstr, pszdetail: Pcwstr, pcontext: MutPtr, ppfault: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDGenerateFault(pszcode.rawAddress.toCPointer<ByteVar>(), pszsubcode.rawAddress.toCPointer<ByteVar>(), pszreason.rawAddress.toCPointer<ByteVar>(), pszdetail.rawAddress.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), ppfault.rawAddress.toCPointer<ByteVar>())

public actual fun wSDGenerateFaultEx(pcode: ConstPtr, psubcode: ConstPtr, preasons: ConstPtr, pszdetail: Pcwstr, ppfault: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDGenerateFaultEx(pcode.rawAddress.toCPointer<ByteVar>(), psubcode.rawAddress.toCPointer<ByteVar>(), preasons.rawAddress.toCPointer<ByteVar>(), pszdetail.rawAddress.toCPointer<ByteVar>(), ppfault.rawAddress.toCPointer<ByteVar>())

public actual fun wSDGetConfigurationOption(dwoption: UInt, pvoid: MutPtr, cboutbuffer: UInt): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDGetConfigurationOption(dwoption, pvoid.rawAddress.toCPointer<ByteVar>(), cboutbuffer)

public actual fun wSDSetConfigurationOption(dwoption: UInt, pvoid: ConstPtr, cbinbuffer: UInt): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDSetConfigurationOption(dwoption, pvoid.rawAddress.toCPointer<ByteVar>(), cbinbuffer)

public actual fun wSDUriDecode(source: Pcwstr, cchsource: UInt, destout: MutPtr, cchdestout: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDUriDecode(source.rawAddress.toCPointer<ByteVar>(), cchsource, destout.rawAddress.toCPointer<ByteVar>(), cchdestout.rawAddress.toCPointer<ByteVar>())

public actual fun wSDUriEncode(source: Pcwstr, cchsource: UInt, destout: MutPtr, cchdestout: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDUriEncode(source.rawAddress.toCPointer<ByteVar>(), cchsource, destout.rawAddress.toCPointer<ByteVar>(), cchdestout.rawAddress.toCPointer<ByteVar>())

public actual fun wSDXMLAddChild(pparent: MutPtr, pchild: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLAddChild(pparent.rawAddress.toCPointer<ByteVar>(), pchild.rawAddress.toCPointer<ByteVar>())

public actual fun wSDXMLAddSibling(pfirst: MutPtr, psecond: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLAddSibling(pfirst.rawAddress.toCPointer<ByteVar>(), psecond.rawAddress.toCPointer<ByteVar>())

public actual fun wSDXMLBuildAnyForSingleElement(pelementname: MutPtr, psztext: Pcwstr, ppany: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLBuildAnyForSingleElement(pelementname.rawAddress.toCPointer<ByteVar>(), psztext.rawAddress.toCPointer<ByteVar>(), ppany.rawAddress.toCPointer<ByteVar>())

public actual fun wSDXMLCleanupElement(pany: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLCleanupElement(pany.rawAddress.toCPointer<ByteVar>())

public actual fun wSDXMLCreateContext(ppcontext: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLCreateContext(ppcontext.rawAddress.toCPointer<ByteVar>())

public actual fun wSDXMLGetNameFromBuiltinNamespace(psznamespace: Pcwstr, pszname: Pcwstr, ppname: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLGetNameFromBuiltinNamespace(psznamespace.rawAddress.toCPointer<ByteVar>(), pszname.rawAddress.toCPointer<ByteVar>(), ppname.rawAddress.toCPointer<ByteVar>())

public actual fun wSDXMLGetValueFromAny(psznamespace: Pcwstr, pszname: Pcwstr, pany: MutPtr, ppszvalue: MutPtr): Hresult =
    windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLGetValueFromAny(psznamespace.rawAddress.toCPointer<ByteVar>(), pszname.rawAddress.toCPointer<ByteVar>(), pany.rawAddress.toCPointer<ByteVar>(), ppszvalue.rawAddress.toCPointer<ByteVar>())
