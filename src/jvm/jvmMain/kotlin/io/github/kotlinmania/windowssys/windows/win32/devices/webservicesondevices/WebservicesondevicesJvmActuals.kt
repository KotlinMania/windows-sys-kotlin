@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

private object WindowsWin32DevicesWebservicesondevicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDAllocateLinkedMemory(pparent: Long, cbsize: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDAttachLinkedMemory(pparent: Long, pchild: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHost(pszlocalid: Long, pcontext: Long, ppdevicehost: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHost2(pszlocalid: Long, pcontext: Long, pconfigparams: Long, dwconfigparamcount: Int, ppdevicehost: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHostAdvanced(pszlocalid: Long, pcontext: Long, pphostaddresses: Long, dwhostaddresscount: Int, ppdevicehost: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxy(pszdeviceid: Long, pszlocalid: Long, pcontext: Long, ppdeviceproxy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxy2(pszdeviceid: Long, pszlocalid: Long, pcontext: Long, pconfigparams: Long, dwconfigparamcount: Int, ppdeviceproxy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxyAdvanced(pszdeviceid: Long, pdeviceaddress: Long, pszlocalid: Long, pcontext: Long, ppdeviceproxy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryProvider(pcontext: Long, ppprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryProvider2(pcontext: Long, pconfigparams: Long, dwconfigparamcount: Int, ppprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryPublisher(pcontext: Long, pppublisher: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryPublisher2(pcontext: Long, pconfigparams: Long, dwconfigparamcount: Int, pppublisher: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDCreateHttpAddress(ppaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDCreateHttpMessageParameters(pptxparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDCreateOutboundAttachment(ppattachment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDCreateUdpAddress(ppaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDCreateUdpMessageParameters(pptxparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDDetachLinkedMemory(pvoid: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDFreeLinkedMemory(pvoid: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDGenerateFault(pszcode: Long, pszsubcode: Long, pszreason: Long, pszdetail: Long, pcontext: Long, ppfault: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDGenerateFaultEx(pcode: Long, psubcode: Long, preasons: Long, pszdetail: Long, ppfault: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDGetConfigurationOption(dwoption: Int, pvoid: Long, cboutbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDSetConfigurationOption(dwoption: Int, pvoid: Long, cbinbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDUriDecode(source: Long, cchsource: Int, destout: Long, cchdestout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDUriEncode(source: Long, cchsource: Int, destout: Long, cchdestout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDXMLAddChild(pparent: Long, pchild: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDXMLAddSibling(pfirst: Long, psecond: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDXMLBuildAnyForSingleElement(pelementname: Long, psztext: Long, ppany: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDXMLCleanupElement(pany: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDXMLCreateContext(ppcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDXMLGetNameFromBuiltinNamespace(psznamespace: Long, pszname: Long, ppname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_WSDXMLGetValueFromAny(psznamespace: Long, pszname: Long, pany: Long, ppszvalue: Long): Int
}

public actual fun WSDAllocateLinkedMemory(pparent: Long, cbsize: ULong): Long =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDAllocateLinkedMemory(pparent, cbsize.toLong())

public actual fun WSDAttachLinkedMemory(pparent: Long, pchild: Long) {
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDAttachLinkedMemory(pparent, pchild)
}

public actual fun WSDCreateDeviceHost(pszlocalid: PCWSTR, pcontext: Long, ppdevicehost: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHost(pszlocalid, pcontext, ppdevicehost)

public actual fun WSDCreateDeviceHost2(pszlocalid: PCWSTR, pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, ppdevicehost: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHost2(pszlocalid, pcontext, pconfigparams, dwconfigparamcount.toInt(), ppdevicehost)

public actual fun WSDCreateDeviceHostAdvanced(pszlocalid: PCWSTR, pcontext: Long, pphostaddresses: Long, dwhostaddresscount: UInt, ppdevicehost: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHostAdvanced(pszlocalid, pcontext, pphostaddresses, dwhostaddresscount.toInt(), ppdevicehost)

public actual fun WSDCreateDeviceProxy(pszdeviceid: PCWSTR, pszlocalid: PCWSTR, pcontext: Long, ppdeviceproxy: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxy(pszdeviceid, pszlocalid, pcontext, ppdeviceproxy)

public actual fun WSDCreateDeviceProxy2(pszdeviceid: PCWSTR, pszlocalid: PCWSTR, pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, ppdeviceproxy: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxy2(pszdeviceid, pszlocalid, pcontext, pconfigparams, dwconfigparamcount.toInt(), ppdeviceproxy)

public actual fun WSDCreateDeviceProxyAdvanced(pszdeviceid: PCWSTR, pdeviceaddress: Long, pszlocalid: PCWSTR, pcontext: Long, ppdeviceproxy: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxyAdvanced(pszdeviceid, pdeviceaddress, pszlocalid, pcontext, ppdeviceproxy)

public actual fun WSDCreateDiscoveryProvider(pcontext: Long, ppprovider: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryProvider(pcontext, ppprovider)

public actual fun WSDCreateDiscoveryProvider2(pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, ppprovider: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryProvider2(pcontext, pconfigparams, dwconfigparamcount.toInt(), ppprovider)

public actual fun WSDCreateDiscoveryPublisher(pcontext: Long, pppublisher: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryPublisher(pcontext, pppublisher)

public actual fun WSDCreateDiscoveryPublisher2(pcontext: Long, pconfigparams: Long, dwconfigparamcount: UInt, pppublisher: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryPublisher2(pcontext, pconfigparams, dwconfigparamcount.toInt(), pppublisher)

public actual fun WSDCreateHttpAddress(ppaddress: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDCreateHttpAddress(ppaddress)

public actual fun WSDCreateHttpMessageParameters(pptxparams: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDCreateHttpMessageParameters(pptxparams)

public actual fun WSDCreateOutboundAttachment(ppattachment: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDCreateOutboundAttachment(ppattachment)

public actual fun WSDCreateUdpAddress(ppaddress: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDCreateUdpAddress(ppaddress)

public actual fun WSDCreateUdpMessageParameters(pptxparams: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDCreateUdpMessageParameters(pptxparams)

public actual fun WSDDetachLinkedMemory(pvoid: Long) {
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDDetachLinkedMemory(pvoid)
}

public actual fun WSDFreeLinkedMemory(pvoid: Long) {
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDFreeLinkedMemory(pvoid)
}

public actual fun WSDGenerateFault(pszcode: PCWSTR, pszsubcode: PCWSTR, pszreason: PCWSTR, pszdetail: PCWSTR, pcontext: Long, ppfault: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDGenerateFault(pszcode, pszsubcode, pszreason, pszdetail, pcontext, ppfault)

public actual fun WSDGenerateFaultEx(pcode: Long, psubcode: Long, preasons: Long, pszdetail: PCWSTR, ppfault: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDGenerateFaultEx(pcode, psubcode, preasons, pszdetail, ppfault)

public actual fun WSDGetConfigurationOption(dwoption: UInt, pvoid: Long, cboutbuffer: UInt): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDGetConfigurationOption(dwoption.toInt(), pvoid, cboutbuffer.toInt())

public actual fun WSDSetConfigurationOption(dwoption: UInt, pvoid: Long, cbinbuffer: UInt): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDSetConfigurationOption(dwoption.toInt(), pvoid, cbinbuffer.toInt())

public actual fun WSDUriDecode(source: PCWSTR, cchsource: UInt, destout: Long, cchdestout: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDUriDecode(source, cchsource.toInt(), destout, cchdestout)

public actual fun WSDUriEncode(source: PCWSTR, cchsource: UInt, destout: Long, cchdestout: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDUriEncode(source, cchsource.toInt(), destout, cchdestout)

public actual fun WSDXMLAddChild(pparent: Long, pchild: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDXMLAddChild(pparent, pchild)

public actual fun WSDXMLAddSibling(pfirst: Long, psecond: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDXMLAddSibling(pfirst, psecond)

public actual fun WSDXMLBuildAnyForSingleElement(pelementname: Long, psztext: PCWSTR, ppany: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDXMLBuildAnyForSingleElement(pelementname, psztext, ppany)

public actual fun WSDXMLCleanupElement(pany: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDXMLCleanupElement(pany)

public actual fun WSDXMLCreateContext(ppcontext: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDXMLCreateContext(ppcontext)

public actual fun WSDXMLGetNameFromBuiltinNamespace(psznamespace: PCWSTR, pszname: PCWSTR, ppname: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDXMLGetNameFromBuiltinNamespace(psznamespace, pszname, ppname)

public actual fun WSDXMLGetValueFromAny(psznamespace: PCWSTR, pszname: PCWSTR, pany: Long, ppszvalue: Long): HRESULT =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_WSDXMLGetValueFromAny(psznamespace, pszname, pany, ppszvalue)
