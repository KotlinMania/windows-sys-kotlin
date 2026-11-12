@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32DevicesWebservicesondevicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDAllocateLinkedMemory(pparent: Long, cbsize: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDAttachLinkedMemory(pparent: Long, pchild: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHost(pszlocalid: Long, pcontext: Long, ppdevicehost: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHost2(pszlocalid: Long, pcontext: Long, pconfigparams: Long, dwconfigparamcount: Int, ppdevicehost: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHostAdvanced(pszlocalid: Long, pcontext: Long, pphostaddresses: Long, dwhostaddresscount: Int, ppdevicehost: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxy(pszdeviceid: Long, pszlocalid: Long, pcontext: Long, ppdeviceproxy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxy2(pszdeviceid: Long, pszlocalid: Long, pcontext: Long, pconfigparams: Long, dwconfigparamcount: Int, ppdeviceproxy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxyAdvanced(pszdeviceid: Long, pdeviceaddress: Long, pszlocalid: Long, pcontext: Long, ppdeviceproxy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryProvider(pcontext: Long, ppprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryProvider2(pcontext: Long, pconfigparams: Long, dwconfigparamcount: Int, ppprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryPublisher(pcontext: Long, pppublisher: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryPublisher2(pcontext: Long, pconfigparams: Long, dwconfigparamcount: Int, pppublisher: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateHttpAddress(ppaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateHttpMessageParameters(pptxparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateOutboundAttachment(ppattachment: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateUdpAddress(ppaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateUdpMessageParameters(pptxparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDDetachLinkedMemory(pvoid: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDFreeLinkedMemory(pvoid: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDGenerateFault(pszcode: Long, pszsubcode: Long, pszreason: Long, pszdetail: Long, pcontext: Long, ppfault: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDGenerateFaultEx(pcode: Long, psubcode: Long, preasons: Long, pszdetail: Long, ppfault: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDGetConfigurationOption(dwoption: Int, pvoid: Long, cboutbuffer: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDSetConfigurationOption(dwoption: Int, pvoid: Long, cbinbuffer: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDUriDecode(source: Long, cchsource: Int, destout: Long, cchdestout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDUriEncode(source: Long, cchsource: Int, destout: Long, cchdestout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLAddChild(pparent: Long, pchild: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLAddSibling(pfirst: Long, psecond: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLBuildAnyForSingleElement(pelementname: Long, psztext: Long, ppany: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLCleanupElement(pany: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLCreateContext(ppcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLGetNameFromBuiltinNamespace(psznamespace: Long, pszname: Long, ppname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLGetValueFromAny(psznamespace: Long, pszname: Long, pany: Long, ppszvalue: Long): Int
}

public actual fun wSDAllocateLinkedMemory(pparent: MutPtr, cbsize: ULong): MutPtr =
    MutPtr(WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDAllocateLinkedMemory(pparent.rawAddress, cbsize.toLong()))

public actual fun wSDAttachLinkedMemory(pparent: MutPtr, pchild: MutPtr) {
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDAttachLinkedMemory(pparent.rawAddress, pchild.rawAddress)
}

public actual fun wSDCreateDeviceHost(pszlocalid: Pcwstr, pcontext: MutPtr, ppdevicehost: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHost(pszlocalid.rawAddress, pcontext.rawAddress, ppdevicehost.rawAddress)

public actual fun wSDCreateDeviceHost2(pszlocalid: Pcwstr, pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, ppdevicehost: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHost2(pszlocalid.rawAddress, pcontext.rawAddress, pconfigparams.rawAddress, dwconfigparamcount.toInt(), ppdevicehost.rawAddress)

public actual fun wSDCreateDeviceHostAdvanced(pszlocalid: Pcwstr, pcontext: MutPtr, pphostaddresses: ConstPtr, dwhostaddresscount: UInt, ppdevicehost: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHostAdvanced(pszlocalid.rawAddress, pcontext.rawAddress, pphostaddresses.rawAddress, dwhostaddresscount.toInt(), ppdevicehost.rawAddress)

public actual fun wSDCreateDeviceProxy(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: MutPtr, ppdeviceproxy: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxy(pszdeviceid.rawAddress, pszlocalid.rawAddress, pcontext.rawAddress, ppdeviceproxy.rawAddress)

public actual fun wSDCreateDeviceProxy2(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, ppdeviceproxy: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxy2(pszdeviceid.rawAddress, pszlocalid.rawAddress, pcontext.rawAddress, pconfigparams.rawAddress, dwconfigparamcount.toInt(), ppdeviceproxy.rawAddress)

public actual fun wSDCreateDeviceProxyAdvanced(pszdeviceid: Pcwstr, pdeviceaddress: MutPtr, pszlocalid: Pcwstr, pcontext: MutPtr, ppdeviceproxy: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxyAdvanced(pszdeviceid.rawAddress, pdeviceaddress.rawAddress, pszlocalid.rawAddress, pcontext.rawAddress, ppdeviceproxy.rawAddress)

public actual fun wSDCreateDiscoveryProvider(pcontext: MutPtr, ppprovider: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryProvider(pcontext.rawAddress, ppprovider.rawAddress)

public actual fun wSDCreateDiscoveryProvider2(pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, ppprovider: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryProvider2(pcontext.rawAddress, pconfigparams.rawAddress, dwconfigparamcount.toInt(), ppprovider.rawAddress)

public actual fun wSDCreateDiscoveryPublisher(pcontext: MutPtr, pppublisher: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryPublisher(pcontext.rawAddress, pppublisher.rawAddress)

public actual fun wSDCreateDiscoveryPublisher2(pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, pppublisher: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryPublisher2(pcontext.rawAddress, pconfigparams.rawAddress, dwconfigparamcount.toInt(), pppublisher.rawAddress)

public actual fun wSDCreateHttpAddress(ppaddress: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateHttpAddress(ppaddress.rawAddress)

public actual fun wSDCreateHttpMessageParameters(pptxparams: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateHttpMessageParameters(pptxparams.rawAddress)

public actual fun wSDCreateOutboundAttachment(ppattachment: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateOutboundAttachment(ppattachment.rawAddress)

public actual fun wSDCreateUdpAddress(ppaddress: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateUdpAddress(ppaddress.rawAddress)

public actual fun wSDCreateUdpMessageParameters(pptxparams: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateUdpMessageParameters(pptxparams.rawAddress)

public actual fun wSDDetachLinkedMemory(pvoid: MutPtr) {
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDDetachLinkedMemory(pvoid.rawAddress)
}

public actual fun wSDFreeLinkedMemory(pvoid: MutPtr) {
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDFreeLinkedMemory(pvoid.rawAddress)
}

public actual fun wSDGenerateFault(pszcode: Pcwstr, pszsubcode: Pcwstr, pszreason: Pcwstr, pszdetail: Pcwstr, pcontext: MutPtr, ppfault: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDGenerateFault(pszcode.rawAddress, pszsubcode.rawAddress, pszreason.rawAddress, pszdetail.rawAddress, pcontext.rawAddress, ppfault.rawAddress)

public actual fun wSDGenerateFaultEx(pcode: ConstPtr, psubcode: ConstPtr, preasons: ConstPtr, pszdetail: Pcwstr, ppfault: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDGenerateFaultEx(pcode.rawAddress, psubcode.rawAddress, preasons.rawAddress, pszdetail.rawAddress, ppfault.rawAddress)

public actual fun wSDGetConfigurationOption(dwoption: UInt, pvoid: MutPtr, cboutbuffer: UInt): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDGetConfigurationOption(dwoption.toInt(), pvoid.rawAddress, cboutbuffer.toInt())

public actual fun wSDSetConfigurationOption(dwoption: UInt, pvoid: ConstPtr, cbinbuffer: UInt): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDSetConfigurationOption(dwoption.toInt(), pvoid.rawAddress, cbinbuffer.toInt())

public actual fun wSDUriDecode(source: Pcwstr, cchsource: UInt, destout: MutPtr, cchdestout: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDUriDecode(source.rawAddress, cchsource.toInt(), destout.rawAddress, cchdestout.rawAddress)

public actual fun wSDUriEncode(source: Pcwstr, cchsource: UInt, destout: MutPtr, cchdestout: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDUriEncode(source.rawAddress, cchsource.toInt(), destout.rawAddress, cchdestout.rawAddress)

public actual fun wSDXMLAddChild(pparent: MutPtr, pchild: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLAddChild(pparent.rawAddress, pchild.rawAddress)

public actual fun wSDXMLAddSibling(pfirst: MutPtr, psecond: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLAddSibling(pfirst.rawAddress, psecond.rawAddress)

public actual fun wSDXMLBuildAnyForSingleElement(pelementname: MutPtr, psztext: Pcwstr, ppany: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLBuildAnyForSingleElement(pelementname.rawAddress, psztext.rawAddress, ppany.rawAddress)

public actual fun wSDXMLCleanupElement(pany: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLCleanupElement(pany.rawAddress)

public actual fun wSDXMLCreateContext(ppcontext: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLCreateContext(ppcontext.rawAddress)

public actual fun wSDXMLGetNameFromBuiltinNamespace(psznamespace: Pcwstr, pszname: Pcwstr, ppname: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLGetNameFromBuiltinNamespace(psznamespace.rawAddress, pszname.rawAddress, ppname.rawAddress)

public actual fun wSDXMLGetValueFromAny(psznamespace: Pcwstr, pszname: Pcwstr, pany: MutPtr, ppszvalue: MutPtr): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLGetValueFromAny(psznamespace.rawAddress, pszname.rawAddress, pany.rawAddress, ppszvalue.rawAddress)
