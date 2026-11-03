package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(faxhandle: Foundation.HANDLE, context: Long, methodname: PWSTR, friendlyname: PWSTR, functionname: PWSTR, guid: PWSTR): BOOL
}

public fun interface FnCallback1 {
    public operator fun invoke(faxhandle: Foundation.HANDLE, recipientnumber: UInt, context: Long, jobparams: Long, coverpageinfo: Long): BOOL
}

public fun CanSendToFaxRecipient(): BOOL {
    return Win32DynamicFfi.invoke("fxsutility.dll", "CanSendToFaxRecipient", longArrayOf()).toInt()
}

public fun FaxAbort(faxhandle: Foundation.HANDLE, jobid: UInt): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxAbort", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), jobid.toLong())).toInt()
}

public fun FaxAccessCheck(faxhandle: Foundation.HANDLE, accessmask: UInt): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxAccessCheck", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), accessmask.toLong())).toInt()
}

public fun FaxClose(faxhandle: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxClose", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle))).toInt()
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

public fun FaxEnableRoutingMethodA(faxporthandle: Foundation.HANDLE, routingguid: PCSTR, enabled: BOOL): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxEnableRoutingMethodA", longArrayOf(Win32DynamicFfi.objectSlot(faxporthandle), routingguid, enabled.toLong())).toInt()
}

public fun FaxEnableRoutingMethodW(faxporthandle: Foundation.HANDLE, routingguid: PCWSTR, enabled: BOOL): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxEnableRoutingMethodW", longArrayOf(Win32DynamicFfi.objectSlot(faxporthandle), routingguid, enabled.toLong())).toInt()
}

public fun FaxEnumGlobalRoutingInfoA(faxhandle: Foundation.HANDLE, routinginfo: Long, methodsreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxEnumGlobalRoutingInfoA", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), routinginfo, methodsreturned)).toInt()
}

public fun FaxEnumGlobalRoutingInfoW(faxhandle: Foundation.HANDLE, routinginfo: Long, methodsreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxEnumGlobalRoutingInfoW", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), routinginfo, methodsreturned)).toInt()
}

public fun FaxEnumJobsA(faxhandle: Foundation.HANDLE, jobentry: Long, jobsreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxEnumJobsA", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), jobentry, jobsreturned)).toInt()
}

public fun FaxEnumJobsW(faxhandle: Foundation.HANDLE, jobentry: Long, jobsreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxEnumJobsW", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), jobentry, jobsreturned)).toInt()
}

public fun FaxEnumPortsA(faxhandle: Foundation.HANDLE, portinfo: Long, portsreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxEnumPortsA", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), portinfo, portsreturned)).toInt()
}

public fun FaxEnumPortsW(faxhandle: Foundation.HANDLE, portinfo: Long, portsreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxEnumPortsW", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), portinfo, portsreturned)).toInt()
}

public fun FaxEnumRoutingMethodsA(faxporthandle: Foundation.HANDLE, routingmethod: Long, methodsreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxEnumRoutingMethodsA", longArrayOf(Win32DynamicFfi.objectSlot(faxporthandle), routingmethod, methodsreturned)).toInt()
}

public fun FaxEnumRoutingMethodsW(faxporthandle: Foundation.HANDLE, routingmethod: Long, methodsreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxEnumRoutingMethodsW", longArrayOf(Win32DynamicFfi.objectSlot(faxporthandle), routingmethod, methodsreturned)).toInt()
}

public fun FaxFreeBuffer(buffer: Long) {
    Win32DynamicFfi.invoke("winfax.dll", "FaxFreeBuffer", longArrayOf(buffer))
}

public fun FaxGetConfigurationA(faxhandle: Foundation.HANDLE, faxconfig: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetConfigurationA", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), faxconfig)).toInt()
}

public fun FaxGetConfigurationW(faxhandle: Foundation.HANDLE, faxconfig: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetConfigurationW", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), faxconfig)).toInt()
}

public fun FaxGetDeviceStatusA(faxporthandle: Foundation.HANDLE, devicestatus: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetDeviceStatusA", longArrayOf(Win32DynamicFfi.objectSlot(faxporthandle), devicestatus)).toInt()
}

public fun FaxGetDeviceStatusW(faxporthandle: Foundation.HANDLE, devicestatus: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetDeviceStatusW", longArrayOf(Win32DynamicFfi.objectSlot(faxporthandle), devicestatus)).toInt()
}

public fun FaxGetJobA(faxhandle: Foundation.HANDLE, jobid: UInt, jobentry: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetJobA", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), jobid.toLong(), jobentry)).toInt()
}

public fun FaxGetJobW(faxhandle: Foundation.HANDLE, jobid: UInt, jobentry: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetJobW", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), jobid.toLong(), jobentry)).toInt()
}

public fun FaxGetLoggingCategoriesA(faxhandle: Foundation.HANDLE, categories: Long, numbercategories: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetLoggingCategoriesA", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), categories, numbercategories)).toInt()
}

public fun FaxGetLoggingCategoriesW(faxhandle: Foundation.HANDLE, categories: Long, numbercategories: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetLoggingCategoriesW", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), categories, numbercategories)).toInt()
}

public fun FaxGetPageData(faxhandle: Foundation.HANDLE, jobid: UInt, buffer: Long, buffersize: Long, imagewidth: Long, imageheight: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetPageData", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), jobid.toLong(), buffer, buffersize, imagewidth, imageheight)).toInt()
}

public fun FaxGetPortA(faxporthandle: Foundation.HANDLE, portinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetPortA", longArrayOf(Win32DynamicFfi.objectSlot(faxporthandle), portinfo)).toInt()
}

public fun FaxGetPortW(faxporthandle: Foundation.HANDLE, portinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetPortW", longArrayOf(Win32DynamicFfi.objectSlot(faxporthandle), portinfo)).toInt()
}

public fun FaxGetRoutingInfoA(faxporthandle: Foundation.HANDLE, routingguid: PCSTR, routinginfobuffer: Long, routinginfobuffersize: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetRoutingInfoA", longArrayOf(Win32DynamicFfi.objectSlot(faxporthandle), routingguid, routinginfobuffer, routinginfobuffersize)).toInt()
}

public fun FaxGetRoutingInfoW(faxporthandle: Foundation.HANDLE, routingguid: PCWSTR, routinginfobuffer: Long, routinginfobuffersize: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxGetRoutingInfoW", longArrayOf(Win32DynamicFfi.objectSlot(faxporthandle), routingguid, routinginfobuffer, routinginfobuffersize)).toInt()
}

public fun FaxInitializeEventQueue(faxhandle: Foundation.HANDLE, completionport: Foundation.HANDLE, completionkey: ULong, hwnd: Foundation.HWND, messagestart: UInt): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxInitializeEventQueue", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), Win32DynamicFfi.objectSlot(completionport), completionkey.toLong(), Win32DynamicFfi.objectSlot(hwnd), messagestart.toLong())).toInt()
}

public fun FaxOpenPort(faxhandle: Foundation.HANDLE, deviceid: UInt, flags: UInt, faxporthandle: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxOpenPort", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), deviceid.toLong(), flags.toLong(), faxporthandle)).toInt()
}

public fun FaxPrintCoverPageA(faxcontextinfo: Long, coverpageinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxPrintCoverPageA", longArrayOf(faxcontextinfo, coverpageinfo)).toInt()
}

public fun FaxPrintCoverPageW(faxcontextinfo: Long, coverpageinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxPrintCoverPageW", longArrayOf(faxcontextinfo, coverpageinfo)).toInt()
}

public fun FaxRegisterRoutingExtensionW(faxhandle: Foundation.HANDLE, extensionname: PCWSTR, friendlyname: PCWSTR, imagename: PCWSTR, callback: PFAX_ROUTING_INSTALLATION_CALLBACKW, context: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxRegisterRoutingExtensionW", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), extensionname, friendlyname, imagename, Win32DynamicFfi.objectSlot(callback), context)).toInt()
}

public fun FaxRegisterServiceProviderW(deviceprovider: PCWSTR, friendlyname: PCWSTR, imagename: PCWSTR, tspname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxRegisterServiceProviderW", longArrayOf(deviceprovider, friendlyname, imagename, tspname)).toInt()
}

public fun FaxSendDocumentA(faxhandle: Foundation.HANDLE, filename: PCSTR, jobparams: Long, coverpageinfo: Long, faxjobid: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSendDocumentA", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), filename, jobparams, coverpageinfo, faxjobid)).toInt()
}

public fun FaxSendDocumentForBroadcastA(faxhandle: Foundation.HANDLE, filename: PCSTR, faxjobid: Long, faxrecipientcallback: PFAX_RECIPIENT_CALLBACKA, context: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSendDocumentForBroadcastA", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), filename, faxjobid, Win32DynamicFfi.objectSlot(faxrecipientcallback), context)).toInt()
}

public fun FaxSendDocumentForBroadcastW(faxhandle: Foundation.HANDLE, filename: PCWSTR, faxjobid: Long, faxrecipientcallback: PFAX_RECIPIENT_CALLBACKW, context: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSendDocumentForBroadcastW", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), filename, faxjobid, Win32DynamicFfi.objectSlot(faxrecipientcallback), context)).toInt()
}

public fun FaxSendDocumentW(faxhandle: Foundation.HANDLE, filename: PCWSTR, jobparams: Long, coverpageinfo: Long, faxjobid: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSendDocumentW", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), filename, jobparams, coverpageinfo, faxjobid)).toInt()
}

public fun FaxSetConfigurationA(faxhandle: Foundation.HANDLE, faxconfig: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetConfigurationA", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), faxconfig)).toInt()
}

public fun FaxSetConfigurationW(faxhandle: Foundation.HANDLE, faxconfig: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetConfigurationW", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), faxconfig)).toInt()
}

public fun FaxSetGlobalRoutingInfoA(faxhandle: Foundation.HANDLE, routinginfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetGlobalRoutingInfoA", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), routinginfo)).toInt()
}

public fun FaxSetGlobalRoutingInfoW(faxhandle: Foundation.HANDLE, routinginfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetGlobalRoutingInfoW", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), routinginfo)).toInt()
}

public fun FaxSetJobA(faxhandle: Foundation.HANDLE, jobid: UInt, command: UInt, jobentry: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetJobA", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), jobid.toLong(), command.toLong(), jobentry)).toInt()
}

public fun FaxSetJobW(faxhandle: Foundation.HANDLE, jobid: UInt, command: UInt, jobentry: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetJobW", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), jobid.toLong(), command.toLong(), jobentry)).toInt()
}

public fun FaxSetLoggingCategoriesA(faxhandle: Foundation.HANDLE, categories: Long, numbercategories: UInt): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetLoggingCategoriesA", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), categories, numbercategories.toLong())).toInt()
}

public fun FaxSetLoggingCategoriesW(faxhandle: Foundation.HANDLE, categories: Long, numbercategories: UInt): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetLoggingCategoriesW", longArrayOf(Win32DynamicFfi.objectSlot(faxhandle), categories, numbercategories.toLong())).toInt()
}

public fun FaxSetPortA(faxporthandle: Foundation.HANDLE, portinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetPortA", longArrayOf(Win32DynamicFfi.objectSlot(faxporthandle), portinfo)).toInt()
}

public fun FaxSetPortW(faxporthandle: Foundation.HANDLE, portinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetPortW", longArrayOf(Win32DynamicFfi.objectSlot(faxporthandle), portinfo)).toInt()
}

public fun FaxSetRoutingInfoA(faxporthandle: Foundation.HANDLE, routingguid: PCSTR, routinginfobuffer: Long, routinginfobuffersize: UInt): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetRoutingInfoA", longArrayOf(Win32DynamicFfi.objectSlot(faxporthandle), routingguid, routinginfobuffer, routinginfobuffersize.toLong())).toInt()
}

public fun FaxSetRoutingInfoW(faxporthandle: Foundation.HANDLE, routingguid: PCWSTR, routinginfobuffer: Long, routinginfobuffersize: UInt): BOOL {
    return Win32DynamicFfi.invoke("winfax.dll", "FaxSetRoutingInfoW", longArrayOf(Win32DynamicFfi.objectSlot(faxporthandle), routingguid, routinginfobuffer, routinginfobuffersize.toLong())).toInt()
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

public fun StiCreateInstanceW(hinst: Foundation.HINSTANCE, dwver: UInt, ppsti: Long, punkouter: Long): HRESULT {
    return Win32DynamicFfi.invoke("sti.dll", "StiCreateInstanceW", longArrayOf(Win32DynamicFfi.objectSlot(hinst), dwver.toLong(), ppsti, punkouter)).toInt()
}
