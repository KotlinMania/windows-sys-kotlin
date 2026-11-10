@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32DevicesWebservicesondevicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDAllocateLinkedMemory(pparent: Long, cbsize: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDAttachLinkedMemory(pparent: Long, pchild: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHost(pszlocalid: Long, pcontext: Long, ppdevicehost: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHost2(pszlocalid: Long, pcontext: Long, pconfigparams: Long, dwconfigparamcount: Int, ppdevicehost: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHostAdvanced(pszlocalid: Long, pcontext: Long, pphostaddresses: Long, dwhostaddresscount: Int, ppdevicehost: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxy(pszdeviceid: Long, pszlocalid: Long, pcontext: Long, ppdeviceproxy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxy2(pszdeviceid: Long, pszlocalid: Long, pcontext: Long, pconfigparams: Long, dwconfigparamcount: Int, ppdeviceproxy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxyAdvanced(pszdeviceid: Long, pdeviceaddress: Long, pszlocalid: Long, pcontext: Long, ppdeviceproxy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryProvider(pcontext: Long, ppprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryProvider2(pcontext: Long, pconfigparams: Long, dwconfigparamcount: Int, ppprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryPublisher(pcontext: Long, pppublisher: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryPublisher2(pcontext: Long, pconfigparams: Long, dwconfigparamcount: Int, pppublisher: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDCreateHttpAddress(ppaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDCreateHttpMessageParameters(pptxparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDCreateOutboundAttachment(ppattachment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDCreateUdpAddress(ppaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDCreateUdpMessageParameters(pptxparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDDetachLinkedMemory(pvoid: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDFreeLinkedMemory(pvoid: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDGenerateFault(pszcode: Long, pszsubcode: Long, pszreason: Long, pszdetail: Long, pcontext: Long, ppfault: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDGenerateFaultEx(pcode: Long, psubcode: Long, preasons: Long, pszdetail: Long, ppfault: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDGetConfigurationOption(dwoption: Int, pvoid: Long, cboutbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDSetConfigurationOption(dwoption: Int, pvoid: Long, cbinbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDUriDecode(source: Long, cchsource: Int, destout: Long, cchdestout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDUriEncode(source: Long, cchsource: Int, destout: Long, cchdestout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDXMLAddChild(pparent: Long, pchild: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDXMLAddSibling(pfirst: Long, psecond: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDXMLBuildAnyForSingleElement(pelementname: Long, psztext: Long, ppany: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDXMLCleanupElement(pany: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDXMLCreateContext(ppcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDXMLGetNameFromBuiltinNamespace(psznamespace: Long, pszname: Long, ppname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_webservicesondevices_wSDXMLGetValueFromAny(psznamespace: Long, pszname: Long, pany: Long, ppszvalue: Long): Int
}

public actual fun wSDAllocateLinkedMemory(pparent: COpaquePointer?, cbsize: ULong): COpaquePointer? =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDAllocateLinkedMemory((pparent?.value ?: 0L), cbsize.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wSDAttachLinkedMemory(pparent: COpaquePointer?, pchild: COpaquePointer?) {
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDAttachLinkedMemory((pparent?.value ?: 0L), (pchild?.value ?: 0L))
}

public actual fun wSDCreateDeviceHost(pszlocalid: Pcwstr, pcontext: COpaquePointer?, ppdevicehost: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHost((pszlocalid?.value ?: 0L), (pcontext?.value ?: 0L), (ppdevicehost?.value ?: 0L))

public actual fun wSDCreateDeviceHost2(pszlocalid: Pcwstr, pcontext: COpaquePointer?, pconfigparams: COpaquePointer?, dwconfigparamcount: UInt, ppdevicehost: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHost2((pszlocalid?.value ?: 0L), (pcontext?.value ?: 0L), (pconfigparams?.value ?: 0L), dwconfigparamcount.toInt(), (ppdevicehost?.value ?: 0L))

public actual fun wSDCreateDeviceHostAdvanced(pszlocalid: Pcwstr, pcontext: COpaquePointer?, pphostaddresses: COpaquePointer?, dwhostaddresscount: UInt, ppdevicehost: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceHostAdvanced((pszlocalid?.value ?: 0L), (pcontext?.value ?: 0L), (pphostaddresses?.value ?: 0L), dwhostaddresscount.toInt(), (ppdevicehost?.value ?: 0L))

public actual fun wSDCreateDeviceProxy(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: COpaquePointer?, ppdeviceproxy: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxy((pszdeviceid?.value ?: 0L), (pszlocalid?.value ?: 0L), (pcontext?.value ?: 0L), (ppdeviceproxy?.value ?: 0L))

public actual fun wSDCreateDeviceProxy2(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: COpaquePointer?, pconfigparams: COpaquePointer?, dwconfigparamcount: UInt, ppdeviceproxy: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxy2((pszdeviceid?.value ?: 0L), (pszlocalid?.value ?: 0L), (pcontext?.value ?: 0L), (pconfigparams?.value ?: 0L), dwconfigparamcount.toInt(), (ppdeviceproxy?.value ?: 0L))

public actual fun wSDCreateDeviceProxyAdvanced(pszdeviceid: Pcwstr, pdeviceaddress: COpaquePointer?, pszlocalid: Pcwstr, pcontext: COpaquePointer?, ppdeviceproxy: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDeviceProxyAdvanced((pszdeviceid?.value ?: 0L), (pdeviceaddress?.value ?: 0L), (pszlocalid?.value ?: 0L), (pcontext?.value ?: 0L), (ppdeviceproxy?.value ?: 0L))

public actual fun wSDCreateDiscoveryProvider(pcontext: COpaquePointer?, ppprovider: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryProvider((pcontext?.value ?: 0L), (ppprovider?.value ?: 0L))

public actual fun wSDCreateDiscoveryProvider2(pcontext: COpaquePointer?, pconfigparams: COpaquePointer?, dwconfigparamcount: UInt, ppprovider: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryProvider2((pcontext?.value ?: 0L), (pconfigparams?.value ?: 0L), dwconfigparamcount.toInt(), (ppprovider?.value ?: 0L))

public actual fun wSDCreateDiscoveryPublisher(pcontext: COpaquePointer?, pppublisher: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryPublisher((pcontext?.value ?: 0L), (pppublisher?.value ?: 0L))

public actual fun wSDCreateDiscoveryPublisher2(pcontext: COpaquePointer?, pconfigparams: COpaquePointer?, dwconfigparamcount: UInt, pppublisher: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDCreateDiscoveryPublisher2((pcontext?.value ?: 0L), (pconfigparams?.value ?: 0L), dwconfigparamcount.toInt(), (pppublisher?.value ?: 0L))

public actual fun wSDCreateHttpAddress(ppaddress: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDCreateHttpAddress((ppaddress?.value ?: 0L))

public actual fun wSDCreateHttpMessageParameters(pptxparams: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDCreateHttpMessageParameters((pptxparams?.value ?: 0L))

public actual fun wSDCreateOutboundAttachment(ppattachment: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDCreateOutboundAttachment((ppattachment?.value ?: 0L))

public actual fun wSDCreateUdpAddress(ppaddress: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDCreateUdpAddress((ppaddress?.value ?: 0L))

public actual fun wSDCreateUdpMessageParameters(pptxparams: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDCreateUdpMessageParameters((pptxparams?.value ?: 0L))

public actual fun wSDDetachLinkedMemory(pvoid: COpaquePointer?) {
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDDetachLinkedMemory((pvoid?.value ?: 0L))
}

public actual fun wSDFreeLinkedMemory(pvoid: COpaquePointer?) {
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDFreeLinkedMemory((pvoid?.value ?: 0L))
}

public actual fun wSDGenerateFault(pszcode: Pcwstr, pszsubcode: Pcwstr, pszreason: Pcwstr, pszdetail: Pcwstr, pcontext: COpaquePointer?, ppfault: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDGenerateFault((pszcode?.value ?: 0L), (pszsubcode?.value ?: 0L), (pszreason?.value ?: 0L), (pszdetail?.value ?: 0L), (pcontext?.value ?: 0L), (ppfault?.value ?: 0L))

public actual fun wSDGenerateFaultEx(pcode: COpaquePointer?, psubcode: COpaquePointer?, preasons: COpaquePointer?, pszdetail: Pcwstr, ppfault: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDGenerateFaultEx((pcode?.value ?: 0L), (psubcode?.value ?: 0L), (preasons?.value ?: 0L), (pszdetail?.value ?: 0L), (ppfault?.value ?: 0L))

public actual fun wSDGetConfigurationOption(dwoption: UInt, pvoid: COpaquePointer?, cboutbuffer: UInt): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDGetConfigurationOption(dwoption.toInt(), (pvoid?.value ?: 0L), cboutbuffer.toInt())

public actual fun wSDSetConfigurationOption(dwoption: UInt, pvoid: COpaquePointer?, cbinbuffer: UInt): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDSetConfigurationOption(dwoption.toInt(), (pvoid?.value ?: 0L), cbinbuffer.toInt())

public actual fun wSDUriDecode(source: Pcwstr, cchsource: UInt, destout: COpaquePointer?, cchdestout: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDUriDecode((source?.value ?: 0L), cchsource.toInt(), (destout?.value ?: 0L), (cchdestout?.value ?: 0L))

public actual fun wSDUriEncode(source: Pcwstr, cchsource: UInt, destout: COpaquePointer?, cchdestout: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDUriEncode((source?.value ?: 0L), cchsource.toInt(), (destout?.value ?: 0L), (cchdestout?.value ?: 0L))

public actual fun wSDXMLAddChild(pparent: COpaquePointer?, pchild: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDXMLAddChild((pparent?.value ?: 0L), (pchild?.value ?: 0L))

public actual fun wSDXMLAddSibling(pfirst: COpaquePointer?, psecond: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDXMLAddSibling((pfirst?.value ?: 0L), (psecond?.value ?: 0L))

public actual fun wSDXMLBuildAnyForSingleElement(pelementname: COpaquePointer?, psztext: Pcwstr, ppany: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDXMLBuildAnyForSingleElement((pelementname?.value ?: 0L), (psztext?.value ?: 0L), (ppany?.value ?: 0L))

public actual fun wSDXMLCleanupElement(pany: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDXMLCleanupElement((pany?.value ?: 0L))

public actual fun wSDXMLCreateContext(ppcontext: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDXMLCreateContext((ppcontext?.value ?: 0L))

public actual fun wSDXMLGetNameFromBuiltinNamespace(psznamespace: Pcwstr, pszname: Pcwstr, ppname: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDXMLGetNameFromBuiltinNamespace((psznamespace?.value ?: 0L), (pszname?.value ?: 0L), (ppname?.value ?: 0L))

public actual fun wSDXMLGetValueFromAny(psznamespace: Pcwstr, pszname: Pcwstr, pany: COpaquePointer?, ppszvalue: COpaquePointer?): Hresult =
    WindowsWin32DevicesWebservicesondevicesJniBridge.windowssys_windows_win32_devices_webservicesondevices_wSDXMLGetValueFromAny((psznamespace?.value ?: 0L), (pszname?.value ?: 0L), (pany?.value ?: 0L), (ppszvalue?.value ?: 0L))
