@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32DevicesFaxJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_canSendToFaxRecipient(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxAbort(faxhandle: Long, jobid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxAccessCheck(faxhandle: Long, accessmask: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxClose(faxhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxCompleteJobParamsA(jobparams: Long, coverpageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxCompleteJobParamsW(jobparams: Long, coverpageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxConnectFaxServerA(machinename: Long, faxhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxConnectFaxServerW(machinename: Long, faxhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxEnableRoutingMethodA(faxporthandle: Long, routingguid: Long, enabled: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxEnableRoutingMethodW(faxporthandle: Long, routingguid: Long, enabled: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxEnumGlobalRoutingInfoA(faxhandle: Long, routinginfo: Long, methodsreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxEnumGlobalRoutingInfoW(faxhandle: Long, routinginfo: Long, methodsreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxEnumJobsA(faxhandle: Long, jobentry: Long, jobsreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxEnumJobsW(faxhandle: Long, jobentry: Long, jobsreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxEnumPortsA(faxhandle: Long, portinfo: Long, portsreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxEnumPortsW(faxhandle: Long, portinfo: Long, portsreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxEnumRoutingMethodsA(faxporthandle: Long, routingmethod: Long, methodsreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxEnumRoutingMethodsW(faxporthandle: Long, routingmethod: Long, methodsreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxFreeBuffer(buffer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxGetConfigurationA(faxhandle: Long, faxconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxGetConfigurationW(faxhandle: Long, faxconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxGetDeviceStatusA(faxporthandle: Long, devicestatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxGetDeviceStatusW(faxporthandle: Long, devicestatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxGetJobA(faxhandle: Long, jobid: Int, jobentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxGetJobW(faxhandle: Long, jobid: Int, jobentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxGetLoggingCategoriesA(faxhandle: Long, categories: Long, numbercategories: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxGetLoggingCategoriesW(faxhandle: Long, categories: Long, numbercategories: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxGetPageData(faxhandle: Long, jobid: Int, buffer: Long, buffersize: Long, imagewidth: Long, imageheight: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxGetPortA(faxporthandle: Long, portinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxGetPortW(faxporthandle: Long, portinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxGetRoutingInfoA(faxporthandle: Long, routingguid: Long, routinginfobuffer: Long, routinginfobuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxGetRoutingInfoW(faxporthandle: Long, routingguid: Long, routinginfobuffer: Long, routinginfobuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxInitializeEventQueue(faxhandle: Long, completionport: Long, completionkey: Long, hwnd: Long, messagestart: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxOpenPort(faxhandle: Long, deviceid: Int, flags: Int, faxporthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxPrintCoverPageA(faxcontextinfo: Long, coverpageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxPrintCoverPageW(faxcontextinfo: Long, coverpageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxRegisterRoutingExtensionW(faxhandle: Long, extensionname: Long, friendlyname: Long, imagename: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxRegisterServiceProviderW(deviceprovider: Long, friendlyname: Long, imagename: Long, tspname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxSendDocumentA(faxhandle: Long, filename: Long, jobparams: Long, coverpageinfo: Long, faxjobid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxSendDocumentForBroadcastA(faxhandle: Long, filename: Long, faxjobid: Long, faxrecipientcallback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxSendDocumentForBroadcastW(faxhandle: Long, filename: Long, faxjobid: Long, faxrecipientcallback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxSendDocumentW(faxhandle: Long, filename: Long, jobparams: Long, coverpageinfo: Long, faxjobid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxSetConfigurationA(faxhandle: Long, faxconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxSetConfigurationW(faxhandle: Long, faxconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxSetGlobalRoutingInfoA(faxhandle: Long, routinginfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxSetGlobalRoutingInfoW(faxhandle: Long, routinginfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxSetJobA(faxhandle: Long, jobid: Int, command: Int, jobentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxSetJobW(faxhandle: Long, jobid: Int, command: Int, jobentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxSetLoggingCategoriesA(faxhandle: Long, categories: Long, numbercategories: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxSetLoggingCategoriesW(faxhandle: Long, categories: Long, numbercategories: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxSetPortA(faxporthandle: Long, portinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxSetPortW(faxporthandle: Long, portinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxSetRoutingInfoA(faxporthandle: Long, routingguid: Long, routinginfobuffer: Long, routinginfobuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxSetRoutingInfoW(faxporthandle: Long, routingguid: Long, routinginfobuffer: Long, routinginfobuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxStartPrintJobA(printername: Long, printinfo: Long, faxjobid: Long, faxcontextinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxStartPrintJobW(printername: Long, printinfo: Long, faxjobid: Long, faxcontextinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_faxUnregisterServiceProviderW(deviceprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_sendToFaxRecipient(sndmode: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_stiCreateInstanceW(hinst: Long, dwver: Int, ppsti: Long, punkouter: Long): Int
}

public actual fun canSendToFaxRecipient(): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_canSendToFaxRecipient()

public actual fun faxAbort(faxhandle: Handle, jobid: UInt): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxAbort((faxhandle?.value ?: 0L), jobid.toInt())

public actual fun faxAccessCheck(faxhandle: Handle, accessmask: UInt): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxAccessCheck((faxhandle?.value ?: 0L), accessmask.toInt())

public actual fun faxClose(faxhandle: Handle): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxClose((faxhandle?.value ?: 0L))

public actual fun faxCompleteJobParamsA(jobparams: COpaquePointer?, coverpageinfo: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxCompleteJobParamsA((jobparams?.value ?: 0L), (coverpageinfo?.value ?: 0L))

public actual fun faxCompleteJobParamsW(jobparams: COpaquePointer?, coverpageinfo: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxCompleteJobParamsW((jobparams?.value ?: 0L), (coverpageinfo?.value ?: 0L))

public actual fun faxConnectFaxServerA(machinename: Pcstr, faxhandle: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxConnectFaxServerA((machinename?.value ?: 0L), (faxhandle?.value ?: 0L))

public actual fun faxConnectFaxServerW(machinename: Pcwstr, faxhandle: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxConnectFaxServerW((machinename?.value ?: 0L), (faxhandle?.value ?: 0L))

public actual fun faxEnableRoutingMethodA(faxporthandle: Handle, routingguid: Pcstr, enabled: Bool): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxEnableRoutingMethodA((faxporthandle?.value ?: 0L), (routingguid?.value ?: 0L), enabled)

public actual fun faxEnableRoutingMethodW(faxporthandle: Handle, routingguid: Pcwstr, enabled: Bool): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxEnableRoutingMethodW((faxporthandle?.value ?: 0L), (routingguid?.value ?: 0L), enabled)

public actual fun faxEnumGlobalRoutingInfoA(faxhandle: Handle, routinginfo: COpaquePointer?, methodsreturned: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxEnumGlobalRoutingInfoA((faxhandle?.value ?: 0L), (routinginfo?.value ?: 0L), (methodsreturned?.value ?: 0L))

public actual fun faxEnumGlobalRoutingInfoW(faxhandle: Handle, routinginfo: COpaquePointer?, methodsreturned: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxEnumGlobalRoutingInfoW((faxhandle?.value ?: 0L), (routinginfo?.value ?: 0L), (methodsreturned?.value ?: 0L))

public actual fun faxEnumJobsA(faxhandle: Handle, jobentry: COpaquePointer?, jobsreturned: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxEnumJobsA((faxhandle?.value ?: 0L), (jobentry?.value ?: 0L), (jobsreturned?.value ?: 0L))

public actual fun faxEnumJobsW(faxhandle: Handle, jobentry: COpaquePointer?, jobsreturned: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxEnumJobsW((faxhandle?.value ?: 0L), (jobentry?.value ?: 0L), (jobsreturned?.value ?: 0L))

public actual fun faxEnumPortsA(faxhandle: Handle, portinfo: COpaquePointer?, portsreturned: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxEnumPortsA((faxhandle?.value ?: 0L), (portinfo?.value ?: 0L), (portsreturned?.value ?: 0L))

public actual fun faxEnumPortsW(faxhandle: Handle, portinfo: COpaquePointer?, portsreturned: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxEnumPortsW((faxhandle?.value ?: 0L), (portinfo?.value ?: 0L), (portsreturned?.value ?: 0L))

public actual fun faxEnumRoutingMethodsA(faxporthandle: Handle, routingmethod: COpaquePointer?, methodsreturned: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxEnumRoutingMethodsA((faxporthandle?.value ?: 0L), (routingmethod?.value ?: 0L), (methodsreturned?.value ?: 0L))

public actual fun faxEnumRoutingMethodsW(faxporthandle: Handle, routingmethod: COpaquePointer?, methodsreturned: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxEnumRoutingMethodsW((faxporthandle?.value ?: 0L), (routingmethod?.value ?: 0L), (methodsreturned?.value ?: 0L))

public actual fun faxFreeBuffer(buffer: COpaquePointer?) {
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxFreeBuffer((buffer?.value ?: 0L))
}

public actual fun faxGetConfigurationA(faxhandle: Handle, faxconfig: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxGetConfigurationA((faxhandle?.value ?: 0L), (faxconfig?.value ?: 0L))

public actual fun faxGetConfigurationW(faxhandle: Handle, faxconfig: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxGetConfigurationW((faxhandle?.value ?: 0L), (faxconfig?.value ?: 0L))

public actual fun faxGetDeviceStatusA(faxporthandle: Handle, devicestatus: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxGetDeviceStatusA((faxporthandle?.value ?: 0L), (devicestatus?.value ?: 0L))

public actual fun faxGetDeviceStatusW(faxporthandle: Handle, devicestatus: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxGetDeviceStatusW((faxporthandle?.value ?: 0L), (devicestatus?.value ?: 0L))

public actual fun faxGetJobA(faxhandle: Handle, jobid: UInt, jobentry: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxGetJobA((faxhandle?.value ?: 0L), jobid.toInt(), (jobentry?.value ?: 0L))

public actual fun faxGetJobW(faxhandle: Handle, jobid: UInt, jobentry: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxGetJobW((faxhandle?.value ?: 0L), jobid.toInt(), (jobentry?.value ?: 0L))

public actual fun faxGetLoggingCategoriesA(faxhandle: Handle, categories: COpaquePointer?, numbercategories: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxGetLoggingCategoriesA((faxhandle?.value ?: 0L), (categories?.value ?: 0L), (numbercategories?.value ?: 0L))

public actual fun faxGetLoggingCategoriesW(faxhandle: Handle, categories: COpaquePointer?, numbercategories: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxGetLoggingCategoriesW((faxhandle?.value ?: 0L), (categories?.value ?: 0L), (numbercategories?.value ?: 0L))

public actual fun faxGetPageData(faxhandle: Handle, jobid: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?, imagewidth: COpaquePointer?, imageheight: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxGetPageData((faxhandle?.value ?: 0L), jobid.toInt(), (buffer?.value ?: 0L), (buffersize?.value ?: 0L), (imagewidth?.value ?: 0L), (imageheight?.value ?: 0L))

public actual fun faxGetPortA(faxporthandle: Handle, portinfo: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxGetPortA((faxporthandle?.value ?: 0L), (portinfo?.value ?: 0L))

public actual fun faxGetPortW(faxporthandle: Handle, portinfo: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxGetPortW((faxporthandle?.value ?: 0L), (portinfo?.value ?: 0L))

public actual fun faxGetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: COpaquePointer?, routinginfobuffersize: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxGetRoutingInfoA((faxporthandle?.value ?: 0L), (routingguid?.value ?: 0L), (routinginfobuffer?.value ?: 0L), (routinginfobuffersize?.value ?: 0L))

public actual fun faxGetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: COpaquePointer?, routinginfobuffersize: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxGetRoutingInfoW((faxporthandle?.value ?: 0L), (routingguid?.value ?: 0L), (routinginfobuffer?.value ?: 0L), (routinginfobuffersize?.value ?: 0L))

public actual fun faxInitializeEventQueue(faxhandle: Handle, completionport: Handle, completionkey: ULong, hwnd: Hwnd, messagestart: UInt): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxInitializeEventQueue((faxhandle?.value ?: 0L), (completionport?.value ?: 0L), completionkey.toLong(), (hwnd?.value ?: 0L), messagestart.toInt())

public actual fun faxOpenPort(faxhandle: Handle, deviceid: UInt, flags: UInt, faxporthandle: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxOpenPort((faxhandle?.value ?: 0L), deviceid.toInt(), flags.toInt(), (faxporthandle?.value ?: 0L))

public actual fun faxPrintCoverPageA(faxcontextinfo: COpaquePointer?, coverpageinfo: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxPrintCoverPageA((faxcontextinfo?.value ?: 0L), (coverpageinfo?.value ?: 0L))

public actual fun faxPrintCoverPageW(faxcontextinfo: COpaquePointer?, coverpageinfo: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxPrintCoverPageW((faxcontextinfo?.value ?: 0L), (coverpageinfo?.value ?: 0L))

public actual fun faxRegisterRoutingExtensionW(faxhandle: Handle, extensionname: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, callback: PfaxRoutingInstallationCallbackw, context: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxRegisterRoutingExtensionW((faxhandle?.value ?: 0L), (extensionname?.value ?: 0L), (friendlyname?.value ?: 0L), (imagename?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun faxRegisterServiceProviderW(deviceprovider: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, tspname: Pcwstr): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxRegisterServiceProviderW((deviceprovider?.value ?: 0L), (friendlyname?.value ?: 0L), (imagename?.value ?: 0L), (tspname?.value ?: 0L))

public actual fun faxSendDocumentA(faxhandle: Handle, filename: Pcstr, jobparams: COpaquePointer?, coverpageinfo: COpaquePointer?, faxjobid: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxSendDocumentA((faxhandle?.value ?: 0L), (filename?.value ?: 0L), (jobparams?.value ?: 0L), (coverpageinfo?.value ?: 0L), (faxjobid?.value ?: 0L))

public actual fun faxSendDocumentForBroadcastA(faxhandle: Handle, filename: Pcstr, faxjobid: COpaquePointer?, faxrecipientcallback: PfaxRecipientCallbacka, context: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxSendDocumentForBroadcastA((faxhandle?.value ?: 0L), (filename?.value ?: 0L), (faxjobid?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun faxSendDocumentForBroadcastW(faxhandle: Handle, filename: Pcwstr, faxjobid: COpaquePointer?, faxrecipientcallback: PfaxRecipientCallbackw, context: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxSendDocumentForBroadcastW((faxhandle?.value ?: 0L), (filename?.value ?: 0L), (faxjobid?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun faxSendDocumentW(faxhandle: Handle, filename: Pcwstr, jobparams: COpaquePointer?, coverpageinfo: COpaquePointer?, faxjobid: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxSendDocumentW((faxhandle?.value ?: 0L), (filename?.value ?: 0L), (jobparams?.value ?: 0L), (coverpageinfo?.value ?: 0L), (faxjobid?.value ?: 0L))

public actual fun faxSetConfigurationA(faxhandle: Handle, faxconfig: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxSetConfigurationA((faxhandle?.value ?: 0L), (faxconfig?.value ?: 0L))

public actual fun faxSetConfigurationW(faxhandle: Handle, faxconfig: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxSetConfigurationW((faxhandle?.value ?: 0L), (faxconfig?.value ?: 0L))

public actual fun faxSetGlobalRoutingInfoA(faxhandle: Handle, routinginfo: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxSetGlobalRoutingInfoA((faxhandle?.value ?: 0L), (routinginfo?.value ?: 0L))

public actual fun faxSetGlobalRoutingInfoW(faxhandle: Handle, routinginfo: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxSetGlobalRoutingInfoW((faxhandle?.value ?: 0L), (routinginfo?.value ?: 0L))

public actual fun faxSetJobA(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxSetJobA((faxhandle?.value ?: 0L), jobid.toInt(), command.toInt(), (jobentry?.value ?: 0L))

public actual fun faxSetJobW(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxSetJobW((faxhandle?.value ?: 0L), jobid.toInt(), command.toInt(), (jobentry?.value ?: 0L))

public actual fun faxSetLoggingCategoriesA(faxhandle: Handle, categories: COpaquePointer?, numbercategories: UInt): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxSetLoggingCategoriesA((faxhandle?.value ?: 0L), (categories?.value ?: 0L), numbercategories.toInt())

public actual fun faxSetLoggingCategoriesW(faxhandle: Handle, categories: COpaquePointer?, numbercategories: UInt): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxSetLoggingCategoriesW((faxhandle?.value ?: 0L), (categories?.value ?: 0L), numbercategories.toInt())

public actual fun faxSetPortA(faxporthandle: Handle, portinfo: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxSetPortA((faxporthandle?.value ?: 0L), (portinfo?.value ?: 0L))

public actual fun faxSetPortW(faxporthandle: Handle, portinfo: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxSetPortW((faxporthandle?.value ?: 0L), (portinfo?.value ?: 0L))

public actual fun faxSetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: COpaquePointer?, routinginfobuffersize: UInt): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxSetRoutingInfoA((faxporthandle?.value ?: 0L), (routingguid?.value ?: 0L), (routinginfobuffer?.value ?: 0L), routinginfobuffersize.toInt())

public actual fun faxSetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: COpaquePointer?, routinginfobuffersize: UInt): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxSetRoutingInfoW((faxporthandle?.value ?: 0L), (routingguid?.value ?: 0L), (routinginfobuffer?.value ?: 0L), routinginfobuffersize.toInt())

public actual fun faxStartPrintJobA(printername: Pcstr, printinfo: COpaquePointer?, faxjobid: COpaquePointer?, faxcontextinfo: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxStartPrintJobA((printername?.value ?: 0L), (printinfo?.value ?: 0L), (faxjobid?.value ?: 0L), (faxcontextinfo?.value ?: 0L))

public actual fun faxStartPrintJobW(printername: Pcwstr, printinfo: COpaquePointer?, faxjobid: COpaquePointer?, faxcontextinfo: COpaquePointer?): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxStartPrintJobW((printername?.value ?: 0L), (printinfo?.value ?: 0L), (faxjobid?.value ?: 0L), (faxcontextinfo?.value ?: 0L))

public actual fun faxUnregisterServiceProviderW(deviceprovider: Pcwstr): Bool =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_faxUnregisterServiceProviderW((deviceprovider?.value ?: 0L))

public actual fun sendToFaxRecipient(sndmode: SendToMode, lpfilename: Pcwstr): UInt =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_sendToFaxRecipient(sndmode, (lpfilename?.value ?: 0L)).toUInt()

public actual fun stiCreateInstanceW(hinst: Hinstance, dwver: UInt, ppsti: COpaquePointer?, punkouter: COpaquePointer?): Hresult =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_stiCreateInstanceW((hinst?.value ?: 0L), dwver.toInt(), (ppsti?.value ?: 0L), (punkouter?.value ?: 0L))
