@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private object WindowsWin32DevicesFaxJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_CanSendToFaxRecipient(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxAbort(faxhandle: Long, jobid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxAccessCheck(faxhandle: Long, accessmask: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxClose(faxhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxCompleteJobParamsA(jobparams: Long, coverpageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxCompleteJobParamsW(jobparams: Long, coverpageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxConnectFaxServerA(machinename: Long, faxhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxConnectFaxServerW(machinename: Long, faxhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxEnableRoutingMethodA(faxporthandle: Long, routingguid: Long, enabled: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxEnableRoutingMethodW(faxporthandle: Long, routingguid: Long, enabled: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxEnumGlobalRoutingInfoA(faxhandle: Long, routinginfo: Long, methodsreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxEnumGlobalRoutingInfoW(faxhandle: Long, routinginfo: Long, methodsreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxEnumJobsA(faxhandle: Long, jobentry: Long, jobsreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxEnumJobsW(faxhandle: Long, jobentry: Long, jobsreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxEnumPortsA(faxhandle: Long, portinfo: Long, portsreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxEnumPortsW(faxhandle: Long, portinfo: Long, portsreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxEnumRoutingMethodsA(faxporthandle: Long, routingmethod: Long, methodsreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxEnumRoutingMethodsW(faxporthandle: Long, routingmethod: Long, methodsreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxFreeBuffer(buffer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxGetConfigurationA(faxhandle: Long, faxconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxGetConfigurationW(faxhandle: Long, faxconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxGetDeviceStatusA(faxporthandle: Long, devicestatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxGetDeviceStatusW(faxporthandle: Long, devicestatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxGetJobA(faxhandle: Long, jobid: Int, jobentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxGetJobW(faxhandle: Long, jobid: Int, jobentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxGetLoggingCategoriesA(faxhandle: Long, categories: Long, numbercategories: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxGetLoggingCategoriesW(faxhandle: Long, categories: Long, numbercategories: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxGetPageData(faxhandle: Long, jobid: Int, buffer: Long, buffersize: Long, imagewidth: Long, imageheight: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxGetPortA(faxporthandle: Long, portinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxGetPortW(faxporthandle: Long, portinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxGetRoutingInfoA(faxporthandle: Long, routingguid: Long, routinginfobuffer: Long, routinginfobuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxGetRoutingInfoW(faxporthandle: Long, routingguid: Long, routinginfobuffer: Long, routinginfobuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxInitializeEventQueue(faxhandle: Long, completionport: Long, completionkey: Long, hwnd: Long, messagestart: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxOpenPort(faxhandle: Long, deviceid: Int, flags: Int, faxporthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxPrintCoverPageA(faxcontextinfo: Long, coverpageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxPrintCoverPageW(faxcontextinfo: Long, coverpageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxRegisterRoutingExtensionW(faxhandle: Long, extensionname: Long, friendlyname: Long, imagename: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxRegisterServiceProviderW(deviceprovider: Long, friendlyname: Long, imagename: Long, tspname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxSendDocumentA(faxhandle: Long, filename: Long, jobparams: Long, coverpageinfo: Long, faxjobid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxSendDocumentForBroadcastA(faxhandle: Long, filename: Long, faxjobid: Long, faxrecipientcallback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxSendDocumentForBroadcastW(faxhandle: Long, filename: Long, faxjobid: Long, faxrecipientcallback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxSendDocumentW(faxhandle: Long, filename: Long, jobparams: Long, coverpageinfo: Long, faxjobid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxSetConfigurationA(faxhandle: Long, faxconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxSetConfigurationW(faxhandle: Long, faxconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxSetGlobalRoutingInfoA(faxhandle: Long, routinginfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxSetGlobalRoutingInfoW(faxhandle: Long, routinginfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxSetJobA(faxhandle: Long, jobid: Int, command: Int, jobentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxSetJobW(faxhandle: Long, jobid: Int, command: Int, jobentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxSetLoggingCategoriesA(faxhandle: Long, categories: Long, numbercategories: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxSetLoggingCategoriesW(faxhandle: Long, categories: Long, numbercategories: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxSetPortA(faxporthandle: Long, portinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxSetPortW(faxporthandle: Long, portinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxSetRoutingInfoA(faxporthandle: Long, routingguid: Long, routinginfobuffer: Long, routinginfobuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxSetRoutingInfoW(faxporthandle: Long, routingguid: Long, routinginfobuffer: Long, routinginfobuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxStartPrintJobA(printername: Long, printinfo: Long, faxjobid: Long, faxcontextinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxStartPrintJobW(printername: Long, printinfo: Long, faxjobid: Long, faxcontextinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_FaxUnregisterServiceProviderW(deviceprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_SendToFaxRecipient(sndmode: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_fax_StiCreateInstanceW(hinst: Long, dwver: Int, ppsti: Long, punkouter: Long): Int
}

public actual fun CanSendToFaxRecipient(): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_CanSendToFaxRecipient()

public actual fun FaxAbort(faxhandle: HANDLE, jobid: UInt): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxAbort(faxhandle, jobid.toInt())

public actual fun FaxAccessCheck(faxhandle: HANDLE, accessmask: UInt): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxAccessCheck(faxhandle, accessmask.toInt())

public actual fun FaxClose(faxhandle: HANDLE): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxClose(faxhandle)

public actual fun FaxCompleteJobParamsA(jobparams: Long, coverpageinfo: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxCompleteJobParamsA(jobparams, coverpageinfo)

public actual fun FaxCompleteJobParamsW(jobparams: Long, coverpageinfo: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxCompleteJobParamsW(jobparams, coverpageinfo)

public actual fun FaxConnectFaxServerA(machinename: PCSTR, faxhandle: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxConnectFaxServerA(machinename, faxhandle)

public actual fun FaxConnectFaxServerW(machinename: PCWSTR, faxhandle: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxConnectFaxServerW(machinename, faxhandle)

public actual fun FaxEnableRoutingMethodA(faxporthandle: HANDLE, routingguid: PCSTR, enabled: BOOL): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxEnableRoutingMethodA(faxporthandle, routingguid, enabled)

public actual fun FaxEnableRoutingMethodW(faxporthandle: HANDLE, routingguid: PCWSTR, enabled: BOOL): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxEnableRoutingMethodW(faxporthandle, routingguid, enabled)

public actual fun FaxEnumGlobalRoutingInfoA(faxhandle: HANDLE, routinginfo: Long, methodsreturned: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxEnumGlobalRoutingInfoA(faxhandle, routinginfo, methodsreturned)

public actual fun FaxEnumGlobalRoutingInfoW(faxhandle: HANDLE, routinginfo: Long, methodsreturned: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxEnumGlobalRoutingInfoW(faxhandle, routinginfo, methodsreturned)

public actual fun FaxEnumJobsA(faxhandle: HANDLE, jobentry: Long, jobsreturned: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxEnumJobsA(faxhandle, jobentry, jobsreturned)

public actual fun FaxEnumJobsW(faxhandle: HANDLE, jobentry: Long, jobsreturned: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxEnumJobsW(faxhandle, jobentry, jobsreturned)

public actual fun FaxEnumPortsA(faxhandle: HANDLE, portinfo: Long, portsreturned: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxEnumPortsA(faxhandle, portinfo, portsreturned)

public actual fun FaxEnumPortsW(faxhandle: HANDLE, portinfo: Long, portsreturned: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxEnumPortsW(faxhandle, portinfo, portsreturned)

public actual fun FaxEnumRoutingMethodsA(faxporthandle: HANDLE, routingmethod: Long, methodsreturned: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxEnumRoutingMethodsA(faxporthandle, routingmethod, methodsreturned)

public actual fun FaxEnumRoutingMethodsW(faxporthandle: HANDLE, routingmethod: Long, methodsreturned: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxEnumRoutingMethodsW(faxporthandle, routingmethod, methodsreturned)

public actual fun FaxFreeBuffer(buffer: Long) {
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxFreeBuffer(buffer)
}

public actual fun FaxGetConfigurationA(faxhandle: HANDLE, faxconfig: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxGetConfigurationA(faxhandle, faxconfig)

public actual fun FaxGetConfigurationW(faxhandle: HANDLE, faxconfig: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxGetConfigurationW(faxhandle, faxconfig)

public actual fun FaxGetDeviceStatusA(faxporthandle: HANDLE, devicestatus: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxGetDeviceStatusA(faxporthandle, devicestatus)

public actual fun FaxGetDeviceStatusW(faxporthandle: HANDLE, devicestatus: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxGetDeviceStatusW(faxporthandle, devicestatus)

public actual fun FaxGetJobA(faxhandle: HANDLE, jobid: UInt, jobentry: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxGetJobA(faxhandle, jobid.toInt(), jobentry)

public actual fun FaxGetJobW(faxhandle: HANDLE, jobid: UInt, jobentry: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxGetJobW(faxhandle, jobid.toInt(), jobentry)

public actual fun FaxGetLoggingCategoriesA(faxhandle: HANDLE, categories: Long, numbercategories: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxGetLoggingCategoriesA(faxhandle, categories, numbercategories)

public actual fun FaxGetLoggingCategoriesW(faxhandle: HANDLE, categories: Long, numbercategories: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxGetLoggingCategoriesW(faxhandle, categories, numbercategories)

public actual fun FaxGetPageData(faxhandle: HANDLE, jobid: UInt, buffer: Long, buffersize: Long, imagewidth: Long, imageheight: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxGetPageData(faxhandle, jobid.toInt(), buffer, buffersize, imagewidth, imageheight)

public actual fun FaxGetPortA(faxporthandle: HANDLE, portinfo: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxGetPortA(faxporthandle, portinfo)

public actual fun FaxGetPortW(faxporthandle: HANDLE, portinfo: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxGetPortW(faxporthandle, portinfo)

public actual fun FaxGetRoutingInfoA(faxporthandle: HANDLE, routingguid: PCSTR, routinginfobuffer: Long, routinginfobuffersize: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxGetRoutingInfoA(faxporthandle, routingguid, routinginfobuffer, routinginfobuffersize)

public actual fun FaxGetRoutingInfoW(faxporthandle: HANDLE, routingguid: PCWSTR, routinginfobuffer: Long, routinginfobuffersize: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxGetRoutingInfoW(faxporthandle, routingguid, routinginfobuffer, routinginfobuffersize)

public actual fun FaxInitializeEventQueue(faxhandle: HANDLE, completionport: HANDLE, completionkey: ULong, hwnd: HWND, messagestart: UInt): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxInitializeEventQueue(faxhandle, completionport, completionkey.toLong(), hwnd, messagestart.toInt())

public actual fun FaxOpenPort(faxhandle: HANDLE, deviceid: UInt, flags: UInt, faxporthandle: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxOpenPort(faxhandle, deviceid.toInt(), flags.toInt(), faxporthandle)

public actual fun FaxPrintCoverPageA(faxcontextinfo: Long, coverpageinfo: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxPrintCoverPageA(faxcontextinfo, coverpageinfo)

public actual fun FaxPrintCoverPageW(faxcontextinfo: Long, coverpageinfo: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxPrintCoverPageW(faxcontextinfo, coverpageinfo)

public actual fun FaxRegisterRoutingExtensionW(faxhandle: HANDLE, extensionname: PCWSTR, friendlyname: PCWSTR, imagename: PCWSTR, callback: PFAX_ROUTING_INSTALLATION_CALLBACKW, context: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxRegisterRoutingExtensionW(faxhandle, extensionname, friendlyname, imagename, callback.toLong(), context)

public actual fun FaxRegisterServiceProviderW(deviceprovider: PCWSTR, friendlyname: PCWSTR, imagename: PCWSTR, tspname: PCWSTR): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxRegisterServiceProviderW(deviceprovider, friendlyname, imagename, tspname)

public actual fun FaxSendDocumentA(faxhandle: HANDLE, filename: PCSTR, jobparams: Long, coverpageinfo: Long, faxjobid: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxSendDocumentA(faxhandle, filename, jobparams, coverpageinfo, faxjobid)

public actual fun FaxSendDocumentForBroadcastA(faxhandle: HANDLE, filename: PCSTR, faxjobid: Long, faxrecipientcallback: PFAX_RECIPIENT_CALLBACKA, context: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxSendDocumentForBroadcastA(faxhandle, filename, faxjobid, faxrecipientcallback.toLong(), context)

public actual fun FaxSendDocumentForBroadcastW(faxhandle: HANDLE, filename: PCWSTR, faxjobid: Long, faxrecipientcallback: PFAX_RECIPIENT_CALLBACKW, context: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxSendDocumentForBroadcastW(faxhandle, filename, faxjobid, faxrecipientcallback.toLong(), context)

public actual fun FaxSendDocumentW(faxhandle: HANDLE, filename: PCWSTR, jobparams: Long, coverpageinfo: Long, faxjobid: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxSendDocumentW(faxhandle, filename, jobparams, coverpageinfo, faxjobid)

public actual fun FaxSetConfigurationA(faxhandle: HANDLE, faxconfig: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxSetConfigurationA(faxhandle, faxconfig)

public actual fun FaxSetConfigurationW(faxhandle: HANDLE, faxconfig: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxSetConfigurationW(faxhandle, faxconfig)

public actual fun FaxSetGlobalRoutingInfoA(faxhandle: HANDLE, routinginfo: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxSetGlobalRoutingInfoA(faxhandle, routinginfo)

public actual fun FaxSetGlobalRoutingInfoW(faxhandle: HANDLE, routinginfo: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxSetGlobalRoutingInfoW(faxhandle, routinginfo)

public actual fun FaxSetJobA(faxhandle: HANDLE, jobid: UInt, command: UInt, jobentry: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxSetJobA(faxhandle, jobid.toInt(), command.toInt(), jobentry)

public actual fun FaxSetJobW(faxhandle: HANDLE, jobid: UInt, command: UInt, jobentry: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxSetJobW(faxhandle, jobid.toInt(), command.toInt(), jobentry)

public actual fun FaxSetLoggingCategoriesA(faxhandle: HANDLE, categories: Long, numbercategories: UInt): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxSetLoggingCategoriesA(faxhandle, categories, numbercategories.toInt())

public actual fun FaxSetLoggingCategoriesW(faxhandle: HANDLE, categories: Long, numbercategories: UInt): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxSetLoggingCategoriesW(faxhandle, categories, numbercategories.toInt())

public actual fun FaxSetPortA(faxporthandle: HANDLE, portinfo: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxSetPortA(faxporthandle, portinfo)

public actual fun FaxSetPortW(faxporthandle: HANDLE, portinfo: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxSetPortW(faxporthandle, portinfo)

public actual fun FaxSetRoutingInfoA(faxporthandle: HANDLE, routingguid: PCSTR, routinginfobuffer: Long, routinginfobuffersize: UInt): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxSetRoutingInfoA(faxporthandle, routingguid, routinginfobuffer, routinginfobuffersize.toInt())

public actual fun FaxSetRoutingInfoW(faxporthandle: HANDLE, routingguid: PCWSTR, routinginfobuffer: Long, routinginfobuffersize: UInt): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxSetRoutingInfoW(faxporthandle, routingguid, routinginfobuffer, routinginfobuffersize.toInt())

public actual fun FaxStartPrintJobA(printername: PCSTR, printinfo: Long, faxjobid: Long, faxcontextinfo: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxStartPrintJobA(printername, printinfo, faxjobid, faxcontextinfo)

public actual fun FaxStartPrintJobW(printername: PCWSTR, printinfo: Long, faxjobid: Long, faxcontextinfo: Long): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxStartPrintJobW(printername, printinfo, faxjobid, faxcontextinfo)

public actual fun FaxUnregisterServiceProviderW(deviceprovider: PCWSTR): BOOL =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_FaxUnregisterServiceProviderW(deviceprovider)

public actual fun SendToFaxRecipient(sndmode: SendToMode, lpfilename: PCWSTR): UInt =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_SendToFaxRecipient(sndmode, lpfilename).toUInt()

public actual fun StiCreateInstanceW(hinst: HINSTANCE, dwver: UInt, ppsti: Long, punkouter: Long): HRESULT =
    WindowsWin32DevicesFaxJniBridge.windowssys_windows_win32_devices_fax_StiCreateInstanceW(hinst, dwver.toInt(), ppsti, punkouter)
