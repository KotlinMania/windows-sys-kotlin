package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public expect fun CanSendToFaxRecipient(): BOOL

public expect fun FaxAbort(faxhandle: HANDLE, jobid: UInt): BOOL

public expect fun FaxAccessCheck(faxhandle: HANDLE, accessmask: UInt): BOOL

public expect fun FaxClose(faxhandle: HANDLE): BOOL

public expect fun FaxCompleteJobParamsA(jobparams: Long, coverpageinfo: Long): BOOL

public expect fun FaxCompleteJobParamsW(jobparams: Long, coverpageinfo: Long): BOOL

public expect fun FaxConnectFaxServerA(machinename: PCSTR, faxhandle: Long): BOOL

public expect fun FaxConnectFaxServerW(machinename: PCWSTR, faxhandle: Long): BOOL

public expect fun FaxEnableRoutingMethodA(faxporthandle: HANDLE, routingguid: PCSTR, enabled: BOOL): BOOL

public expect fun FaxEnableRoutingMethodW(faxporthandle: HANDLE, routingguid: PCWSTR, enabled: BOOL): BOOL

public expect fun FaxEnumGlobalRoutingInfoA(faxhandle: HANDLE, routinginfo: Long, methodsreturned: Long): BOOL

public expect fun FaxEnumGlobalRoutingInfoW(faxhandle: HANDLE, routinginfo: Long, methodsreturned: Long): BOOL

public expect fun FaxEnumJobsA(faxhandle: HANDLE, jobentry: Long, jobsreturned: Long): BOOL

public expect fun FaxEnumJobsW(faxhandle: HANDLE, jobentry: Long, jobsreturned: Long): BOOL

public expect fun FaxEnumPortsA(faxhandle: HANDLE, portinfo: Long, portsreturned: Long): BOOL

public expect fun FaxEnumPortsW(faxhandle: HANDLE, portinfo: Long, portsreturned: Long): BOOL

public expect fun FaxEnumRoutingMethodsA(faxporthandle: HANDLE, routingmethod: Long, methodsreturned: Long): BOOL

public expect fun FaxEnumRoutingMethodsW(faxporthandle: HANDLE, routingmethod: Long, methodsreturned: Long): BOOL

public expect fun FaxFreeBuffer(buffer: Long)

public expect fun FaxGetConfigurationA(faxhandle: HANDLE, faxconfig: Long): BOOL

public expect fun FaxGetConfigurationW(faxhandle: HANDLE, faxconfig: Long): BOOL

public expect fun FaxGetDeviceStatusA(faxporthandle: HANDLE, devicestatus: Long): BOOL

public expect fun FaxGetDeviceStatusW(faxporthandle: HANDLE, devicestatus: Long): BOOL

public expect fun FaxGetJobA(faxhandle: HANDLE, jobid: UInt, jobentry: Long): BOOL

public expect fun FaxGetJobW(faxhandle: HANDLE, jobid: UInt, jobentry: Long): BOOL

public expect fun FaxGetLoggingCategoriesA(faxhandle: HANDLE, categories: Long, numbercategories: Long): BOOL

public expect fun FaxGetLoggingCategoriesW(faxhandle: HANDLE, categories: Long, numbercategories: Long): BOOL

public expect fun FaxGetPageData(faxhandle: HANDLE, jobid: UInt, buffer: Long, buffersize: Long, imagewidth: Long, imageheight: Long): BOOL

public expect fun FaxGetPortA(faxporthandle: HANDLE, portinfo: Long): BOOL

public expect fun FaxGetPortW(faxporthandle: HANDLE, portinfo: Long): BOOL

public expect fun FaxGetRoutingInfoA(faxporthandle: HANDLE, routingguid: PCSTR, routinginfobuffer: Long, routinginfobuffersize: Long): BOOL

public expect fun FaxGetRoutingInfoW(faxporthandle: HANDLE, routingguid: PCWSTR, routinginfobuffer: Long, routinginfobuffersize: Long): BOOL

public expect fun FaxInitializeEventQueue(faxhandle: HANDLE, completionport: HANDLE, completionkey: ULong, hwnd: HWND, messagestart: UInt): BOOL

public expect fun FaxOpenPort(faxhandle: HANDLE, deviceid: UInt, flags: UInt, faxporthandle: Long): BOOL

public expect fun FaxPrintCoverPageA(faxcontextinfo: Long, coverpageinfo: Long): BOOL

public expect fun FaxPrintCoverPageW(faxcontextinfo: Long, coverpageinfo: Long): BOOL

public expect fun FaxRegisterRoutingExtensionW(faxhandle: HANDLE, extensionname: PCWSTR, friendlyname: PCWSTR, imagename: PCWSTR, callback: PFAX_ROUTING_INSTALLATION_CALLBACKW, context: Long): BOOL

public expect fun FaxRegisterServiceProviderW(deviceprovider: PCWSTR, friendlyname: PCWSTR, imagename: PCWSTR, tspname: PCWSTR): BOOL

public expect fun FaxSendDocumentA(faxhandle: HANDLE, filename: PCSTR, jobparams: Long, coverpageinfo: Long, faxjobid: Long): BOOL

public expect fun FaxSendDocumentForBroadcastA(faxhandle: HANDLE, filename: PCSTR, faxjobid: Long, faxrecipientcallback: PFAX_RECIPIENT_CALLBACKA, context: Long): BOOL

public expect fun FaxSendDocumentForBroadcastW(faxhandle: HANDLE, filename: PCWSTR, faxjobid: Long, faxrecipientcallback: PFAX_RECIPIENT_CALLBACKW, context: Long): BOOL

public expect fun FaxSendDocumentW(faxhandle: HANDLE, filename: PCWSTR, jobparams: Long, coverpageinfo: Long, faxjobid: Long): BOOL

public expect fun FaxSetConfigurationA(faxhandle: HANDLE, faxconfig: Long): BOOL

public expect fun FaxSetConfigurationW(faxhandle: HANDLE, faxconfig: Long): BOOL

public expect fun FaxSetGlobalRoutingInfoA(faxhandle: HANDLE, routinginfo: Long): BOOL

public expect fun FaxSetGlobalRoutingInfoW(faxhandle: HANDLE, routinginfo: Long): BOOL

public expect fun FaxSetJobA(faxhandle: HANDLE, jobid: UInt, command: UInt, jobentry: Long): BOOL

public expect fun FaxSetJobW(faxhandle: HANDLE, jobid: UInt, command: UInt, jobentry: Long): BOOL

public expect fun FaxSetLoggingCategoriesA(faxhandle: HANDLE, categories: Long, numbercategories: UInt): BOOL

public expect fun FaxSetLoggingCategoriesW(faxhandle: HANDLE, categories: Long, numbercategories: UInt): BOOL

public expect fun FaxSetPortA(faxporthandle: HANDLE, portinfo: Long): BOOL

public expect fun FaxSetPortW(faxporthandle: HANDLE, portinfo: Long): BOOL

public expect fun FaxSetRoutingInfoA(faxporthandle: HANDLE, routingguid: PCSTR, routinginfobuffer: Long, routinginfobuffersize: UInt): BOOL

public expect fun FaxSetRoutingInfoW(faxporthandle: HANDLE, routingguid: PCWSTR, routinginfobuffer: Long, routinginfobuffersize: UInt): BOOL

public expect fun FaxStartPrintJobA(printername: PCSTR, printinfo: Long, faxjobid: Long, faxcontextinfo: Long): BOOL

public expect fun FaxStartPrintJobW(printername: PCWSTR, printinfo: Long, faxjobid: Long, faxcontextinfo: Long): BOOL

public expect fun FaxUnregisterServiceProviderW(deviceprovider: PCWSTR): BOOL

public expect fun SendToFaxRecipient(sndmode: SendToMode, lpfilename: PCWSTR): UInt

public expect fun StiCreateInstanceW(hinst: HINSTANCE, dwver: UInt, ppsti: Long, punkouter: Long): HRESULT
