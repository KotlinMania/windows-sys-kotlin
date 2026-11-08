package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public fun interface FnCallback {
    public operator fun invoke(faxhandle: HANDLE, context: Long, methodname: PWSTR, friendlyname: PWSTR, functionname: PWSTR, guid: PWSTR): BOOL
}

public fun interface FnCallback1 {
    public operator fun invoke(faxhandle: HANDLE, recipientnumber: UInt, context: Long, jobparams: Long, coverpageinfo: Long): BOOL
}

public fun CanSendToFaxRecipient(): BOOL {
    return Win32DynamicFfi.invoke("fxsutility.dll", "CanSendToFaxRecipient", longArrayOf()).toInt()
}

public fun FaxAbort(faxhandle: HANDLE, jobid: UInt): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxAbort", longArrayOf(faxhandle, jobid.toLong())).toInt()
}

public fun FaxAccessCheck(faxhandle: HANDLE, accessmask: UInt): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxAccessCheck", longArrayOf(faxhandle, accessmask.toLong())).toInt()
}

public fun FaxClose(faxhandle: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxClose", longArrayOf(faxhandle)).toInt()
}

public fun FaxCompleteJobParamsA(jobparams: Long, coverpageinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxCompleteJobParamsA", longArrayOf(jobparams, coverpageinfo)).toInt()
}

public fun FaxCompleteJobParamsW(jobparams: Long, coverpageinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxCompleteJobParamsW", longArrayOf(jobparams, coverpageinfo)).toInt()
}

public fun FaxConnectFaxServerA(machinename: PCSTR, faxhandle: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxConnectFaxServerA", longArrayOf(machinename, faxhandle)).toInt()
}

public fun FaxConnectFaxServerW(machinename: PCWSTR, faxhandle: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxConnectFaxServerW", longArrayOf(machinename, faxhandle)).toInt()
}

public fun FaxEnableRoutingMethodA(faxporthandle: HANDLE, routingguid: PCSTR, enabled: BOOL): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxEnableRoutingMethodA", longArrayOf(faxporthandle, routingguid, enabled.toLong())).toInt()
}

public fun FaxEnableRoutingMethodW(faxporthandle: HANDLE, routingguid: PCWSTR, enabled: BOOL): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxEnableRoutingMethodW", longArrayOf(faxporthandle, routingguid, enabled.toLong())).toInt()
}

public fun FaxEnumGlobalRoutingInfoA(faxhandle: HANDLE, routinginfo: Long, methodsreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxEnumGlobalRoutingInfoA", longArrayOf(faxhandle, routinginfo, methodsreturned)).toInt()
}

public fun FaxEnumGlobalRoutingInfoW(faxhandle: HANDLE, routinginfo: Long, methodsreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxEnumGlobalRoutingInfoW", longArrayOf(faxhandle, routinginfo, methodsreturned)).toInt()
}

public fun FaxEnumJobsA(faxhandle: HANDLE, jobentry: Long, jobsreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxEnumJobsA", longArrayOf(faxhandle, jobentry, jobsreturned)).toInt()
}

public fun FaxEnumJobsW(faxhandle: HANDLE, jobentry: Long, jobsreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxEnumJobsW", longArrayOf(faxhandle, jobentry, jobsreturned)).toInt()
}

public fun FaxEnumPortsA(faxhandle: HANDLE, portinfo: Long, portsreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxEnumPortsA", longArrayOf(faxhandle, portinfo, portsreturned)).toInt()
}

public fun FaxEnumPortsW(faxhandle: HANDLE, portinfo: Long, portsreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxEnumPortsW", longArrayOf(faxhandle, portinfo, portsreturned)).toInt()
}

public fun FaxEnumRoutingMethodsA(faxporthandle: HANDLE, routingmethod: Long, methodsreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxEnumRoutingMethodsA", longArrayOf(faxporthandle, routingmethod, methodsreturned)).toInt()
}

public fun FaxEnumRoutingMethodsW(faxporthandle: HANDLE, routingmethod: Long, methodsreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxEnumRoutingMethodsW", longArrayOf(faxporthandle, routingmethod, methodsreturned)).toInt()
}

public fun FaxFreeBuffer(buffer: Long) {
    Win32DynamicFfi.invoke("winfax.dll", "FaxFreeBuffer", longArrayOf(buffer))
}

public fun FaxGetConfigurationA(faxhandle: HANDLE, faxconfig: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetConfigurationA", longArrayOf(faxhandle, faxconfig)).toInt()
}

public fun FaxGetConfigurationW(faxhandle: HANDLE, faxconfig: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetConfigurationW", longArrayOf(faxhandle, faxconfig)).toInt()
}

public fun FaxGetDeviceStatusA(faxporthandle: HANDLE, devicestatus: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetDeviceStatusA", longArrayOf(faxporthandle, devicestatus)).toInt()
}

public fun FaxGetDeviceStatusW(faxporthandle: HANDLE, devicestatus: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetDeviceStatusW", longArrayOf(faxporthandle, devicestatus)).toInt()
}

public fun FaxGetJobA(faxhandle: HANDLE, jobid: UInt, jobentry: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetJobA", longArrayOf(faxhandle, jobid.toLong(), jobentry)).toInt()
}

public fun FaxGetJobW(faxhandle: HANDLE, jobid: UInt, jobentry: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetJobW", longArrayOf(faxhandle, jobid.toLong(), jobentry)).toInt()
}

public fun FaxGetLoggingCategoriesA(faxhandle: HANDLE, categories: Long, numbercategories: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetLoggingCategoriesA", longArrayOf(faxhandle, categories, numbercategories)).toInt()
}

public fun FaxGetLoggingCategoriesW(faxhandle: HANDLE, categories: Long, numbercategories: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetLoggingCategoriesW", longArrayOf(faxhandle, categories, numbercategories)).toInt()
}

public fun FaxGetPageData(faxhandle: HANDLE, jobid: UInt, buffer: Long, buffersize: Long, imagewidth: Long, imageheight: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetPageData", longArrayOf(faxhandle, jobid.toLong(), buffer, buffersize, imagewidth, imageheight)).toInt()
}

public fun FaxGetPortA(faxporthandle: HANDLE, portinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetPortA", longArrayOf(faxporthandle, portinfo)).toInt()
}

public fun FaxGetPortW(faxporthandle: HANDLE, portinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetPortW", longArrayOf(faxporthandle, portinfo)).toInt()
}

public fun FaxGetRoutingInfoA(faxporthandle: HANDLE, routingguid: PCSTR, routinginfobuffer: Long, routinginfobuffersize: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetRoutingInfoA", longArrayOf(faxporthandle, routingguid, routinginfobuffer, routinginfobuffersize)).toInt()
}

public fun FaxGetRoutingInfoW(faxporthandle: HANDLE, routingguid: PCWSTR, routinginfobuffer: Long, routinginfobuffersize: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetRoutingInfoW", longArrayOf(faxporthandle, routingguid, routinginfobuffer, routinginfobuffersize)).toInt()
}

public fun FaxInitializeEventQueue(faxhandle: HANDLE, completionport: HANDLE, completionkey: ULong, hwnd: HWND, messagestart: UInt): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxInitializeEventQueue", longArrayOf(faxhandle, completionport, completionkey.toLong(), hwnd, messagestart.toLong())).toInt()
}

public fun FaxOpenPort(faxhandle: HANDLE, deviceid: UInt, flags: UInt, faxporthandle: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxOpenPort", longArrayOf(faxhandle, deviceid.toLong(), flags.toLong(), faxporthandle)).toInt()
}

public fun FaxPrintCoverPageA(faxcontextinfo: Long, coverpageinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxPrintCoverPageA", longArrayOf(faxcontextinfo, coverpageinfo)).toInt()
}

public fun FaxPrintCoverPageW(faxcontextinfo: Long, coverpageinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxPrintCoverPageW", longArrayOf(faxcontextinfo, coverpageinfo)).toInt()
}

public fun FaxRegisterRoutingExtensionW(faxhandle: HANDLE, extensionname: PCWSTR, friendlyname: PCWSTR, imagename: PCWSTR, callback: PFAX_ROUTING_INSTALLATION_CALLBACKW, context: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxRegisterRoutingExtensionW", longArrayOf(faxhandle, extensionname, friendlyname, imagename, Win32DynamicFfi.objectSlot(callback), context)).toInt()
}

public fun FaxRegisterServiceProviderW(deviceprovider: PCWSTR, friendlyname: PCWSTR, imagename: PCWSTR, tspname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxRegisterServiceProviderW", longArrayOf(deviceprovider, friendlyname, imagename, tspname)).toInt()
}

public fun FaxSendDocumentA(faxhandle: HANDLE, filename: PCSTR, jobparams: Long, coverpageinfo: Long, faxjobid: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSendDocumentA", longArrayOf(faxhandle, filename, jobparams, coverpageinfo, faxjobid)).toInt()
}

public fun FaxSendDocumentForBroadcastA(faxhandle: HANDLE, filename: PCSTR, faxjobid: Long, faxrecipientcallback: PFAX_RECIPIENT_CALLBACKA, context: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSendDocumentForBroadcastA", longArrayOf(faxhandle, filename, faxjobid, Win32DynamicFfi.objectSlot(faxrecipientcallback), context)).toInt()
}

public fun FaxSendDocumentForBroadcastW(faxhandle: HANDLE, filename: PCWSTR, faxjobid: Long, faxrecipientcallback: PFAX_RECIPIENT_CALLBACKW, context: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSendDocumentForBroadcastW", longArrayOf(faxhandle, filename, faxjobid, Win32DynamicFfi.objectSlot(faxrecipientcallback), context)).toInt()
}

public fun FaxSendDocumentW(faxhandle: HANDLE, filename: PCWSTR, jobparams: Long, coverpageinfo: Long, faxjobid: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSendDocumentW", longArrayOf(faxhandle, filename, jobparams, coverpageinfo, faxjobid)).toInt()
}

public fun FaxSetConfigurationA(faxhandle: HANDLE, faxconfig: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetConfigurationA", longArrayOf(faxhandle, faxconfig)).toInt()
}

public fun FaxSetConfigurationW(faxhandle: HANDLE, faxconfig: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetConfigurationW", longArrayOf(faxhandle, faxconfig)).toInt()
}

public fun FaxSetGlobalRoutingInfoA(faxhandle: HANDLE, routinginfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetGlobalRoutingInfoA", longArrayOf(faxhandle, routinginfo)).toInt()
}

public fun FaxSetGlobalRoutingInfoW(faxhandle: HANDLE, routinginfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetGlobalRoutingInfoW", longArrayOf(faxhandle, routinginfo)).toInt()
}

public fun FaxSetJobA(faxhandle: HANDLE, jobid: UInt, command: UInt, jobentry: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetJobA", longArrayOf(faxhandle, jobid.toLong(), command.toLong(), jobentry)).toInt()
}

public fun FaxSetJobW(faxhandle: HANDLE, jobid: UInt, command: UInt, jobentry: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetJobW", longArrayOf(faxhandle, jobid.toLong(), command.toLong(), jobentry)).toInt()
}

public fun FaxSetLoggingCategoriesA(faxhandle: HANDLE, categories: Long, numbercategories: UInt): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetLoggingCategoriesA", longArrayOf(faxhandle, categories, numbercategories.toLong())).toInt()
}

public fun FaxSetLoggingCategoriesW(faxhandle: HANDLE, categories: Long, numbercategories: UInt): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetLoggingCategoriesW", longArrayOf(faxhandle, categories, numbercategories.toLong())).toInt()
}

public fun FaxSetPortA(faxporthandle: HANDLE, portinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetPortA", longArrayOf(faxporthandle, portinfo)).toInt()
}

public fun FaxSetPortW(faxporthandle: HANDLE, portinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetPortW", longArrayOf(faxporthandle, portinfo)).toInt()
}

public fun FaxSetRoutingInfoA(faxporthandle: HANDLE, routingguid: PCSTR, routinginfobuffer: Long, routinginfobuffersize: UInt): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetRoutingInfoA", longArrayOf(faxporthandle, routingguid, routinginfobuffer, routinginfobuffersize.toLong())).toInt()
}

public fun FaxSetRoutingInfoW(faxporthandle: HANDLE, routingguid: PCWSTR, routinginfobuffer: Long, routinginfobuffersize: UInt): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetRoutingInfoW", longArrayOf(faxporthandle, routingguid, routinginfobuffer, routinginfobuffersize.toLong())).toInt()
}

public fun FaxStartPrintJobA(printername: PCSTR, printinfo: Long, faxjobid: Long, faxcontextinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxStartPrintJobA", longArrayOf(printername, printinfo, faxjobid, faxcontextinfo)).toInt()
}

public fun FaxStartPrintJobW(printername: PCWSTR, printinfo: Long, faxjobid: Long, faxcontextinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxStartPrintJobW", longArrayOf(printername, printinfo, faxjobid, faxcontextinfo)).toInt()
}

public fun FaxUnregisterServiceProviderW(deviceprovider: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxUnregisterServiceProviderW", longArrayOf(deviceprovider)).toInt()
}

public fun SendToFaxRecipient(sndmode: SendToMode, lpfilename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("fxsutility.dll", "SendToFaxRecipient", longArrayOf(sndmode.toLong(), lpfilename)).toUInt()
}

public fun StiCreateInstanceW(hinst: HINSTANCE, dwver: UInt, ppsti: Long, punkouter: Long): HRESULT {
    return Win32DynamicFfi.invoke("sti.dll", "StiCreateInstanceW", longArrayOf(hinst, dwver.toLong(), ppsti, punkouter)).toInt()
}
