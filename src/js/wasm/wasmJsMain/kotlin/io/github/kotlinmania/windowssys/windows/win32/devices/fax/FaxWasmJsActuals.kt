@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public actual fun CanSendToFaxRecipient(): BOOL =
    0

public actual fun FaxAbort(faxhandle: HANDLE, jobid: UInt): BOOL =
    0

public actual fun FaxAccessCheck(faxhandle: HANDLE, accessmask: UInt): BOOL =
    0

public actual fun FaxClose(faxhandle: HANDLE): BOOL =
    0

public actual fun FaxCompleteJobParamsA(jobparams: Long, coverpageinfo: Long): BOOL =
    0

public actual fun FaxCompleteJobParamsW(jobparams: Long, coverpageinfo: Long): BOOL =
    0

public actual fun FaxConnectFaxServerA(machinename: PCSTR, faxhandle: Long): BOOL =
    0

public actual fun FaxConnectFaxServerW(machinename: PCWSTR, faxhandle: Long): BOOL =
    0

public actual fun FaxEnableRoutingMethodA(faxporthandle: HANDLE, routingguid: PCSTR, enabled: BOOL): BOOL =
    0

public actual fun FaxEnableRoutingMethodW(faxporthandle: HANDLE, routingguid: PCWSTR, enabled: BOOL): BOOL =
    0

public actual fun FaxEnumGlobalRoutingInfoA(faxhandle: HANDLE, routinginfo: Long, methodsreturned: Long): BOOL =
    0

public actual fun FaxEnumGlobalRoutingInfoW(faxhandle: HANDLE, routinginfo: Long, methodsreturned: Long): BOOL =
    0

public actual fun FaxEnumJobsA(faxhandle: HANDLE, jobentry: Long, jobsreturned: Long): BOOL =
    0

public actual fun FaxEnumJobsW(faxhandle: HANDLE, jobentry: Long, jobsreturned: Long): BOOL =
    0

public actual fun FaxEnumPortsA(faxhandle: HANDLE, portinfo: Long, portsreturned: Long): BOOL =
    0

public actual fun FaxEnumPortsW(faxhandle: HANDLE, portinfo: Long, portsreturned: Long): BOOL =
    0

public actual fun FaxEnumRoutingMethodsA(faxporthandle: HANDLE, routingmethod: Long, methodsreturned: Long): BOOL =
    0

public actual fun FaxEnumRoutingMethodsW(faxporthandle: HANDLE, routingmethod: Long, methodsreturned: Long): BOOL =
    0

public actual fun FaxFreeBuffer(buffer: Long) {
}

public actual fun FaxGetConfigurationA(faxhandle: HANDLE, faxconfig: Long): BOOL =
    0

public actual fun FaxGetConfigurationW(faxhandle: HANDLE, faxconfig: Long): BOOL =
    0

public actual fun FaxGetDeviceStatusA(faxporthandle: HANDLE, devicestatus: Long): BOOL =
    0

public actual fun FaxGetDeviceStatusW(faxporthandle: HANDLE, devicestatus: Long): BOOL =
    0

public actual fun FaxGetJobA(faxhandle: HANDLE, jobid: UInt, jobentry: Long): BOOL =
    0

public actual fun FaxGetJobW(faxhandle: HANDLE, jobid: UInt, jobentry: Long): BOOL =
    0

public actual fun FaxGetLoggingCategoriesA(faxhandle: HANDLE, categories: Long, numbercategories: Long): BOOL =
    0

public actual fun FaxGetLoggingCategoriesW(faxhandle: HANDLE, categories: Long, numbercategories: Long): BOOL =
    0

public actual fun FaxGetPageData(faxhandle: HANDLE, jobid: UInt, buffer: Long, buffersize: Long, imagewidth: Long, imageheight: Long): BOOL =
    0

public actual fun FaxGetPortA(faxporthandle: HANDLE, portinfo: Long): BOOL =
    0

public actual fun FaxGetPortW(faxporthandle: HANDLE, portinfo: Long): BOOL =
    0

public actual fun FaxGetRoutingInfoA(faxporthandle: HANDLE, routingguid: PCSTR, routinginfobuffer: Long, routinginfobuffersize: Long): BOOL =
    0

public actual fun FaxGetRoutingInfoW(faxporthandle: HANDLE, routingguid: PCWSTR, routinginfobuffer: Long, routinginfobuffersize: Long): BOOL =
    0

public actual fun FaxInitializeEventQueue(faxhandle: HANDLE, completionport: HANDLE, completionkey: ULong, hwnd: HWND, messagestart: UInt): BOOL =
    0

public actual fun FaxOpenPort(faxhandle: HANDLE, deviceid: UInt, flags: UInt, faxporthandle: Long): BOOL =
    0

public actual fun FaxPrintCoverPageA(faxcontextinfo: Long, coverpageinfo: Long): BOOL =
    0

public actual fun FaxPrintCoverPageW(faxcontextinfo: Long, coverpageinfo: Long): BOOL =
    0

public actual fun FaxRegisterRoutingExtensionW(faxhandle: HANDLE, extensionname: PCWSTR, friendlyname: PCWSTR, imagename: PCWSTR, callback: PFAX_ROUTING_INSTALLATION_CALLBACKW, context: Long): BOOL =
    0

public actual fun FaxRegisterServiceProviderW(deviceprovider: PCWSTR, friendlyname: PCWSTR, imagename: PCWSTR, tspname: PCWSTR): BOOL =
    0

public actual fun FaxSendDocumentA(faxhandle: HANDLE, filename: PCSTR, jobparams: Long, coverpageinfo: Long, faxjobid: Long): BOOL =
    0

public actual fun FaxSendDocumentForBroadcastA(faxhandle: HANDLE, filename: PCSTR, faxjobid: Long, faxrecipientcallback: PFAX_RECIPIENT_CALLBACKA, context: Long): BOOL =
    0

public actual fun FaxSendDocumentForBroadcastW(faxhandle: HANDLE, filename: PCWSTR, faxjobid: Long, faxrecipientcallback: PFAX_RECIPIENT_CALLBACKW, context: Long): BOOL =
    0

public actual fun FaxSendDocumentW(faxhandle: HANDLE, filename: PCWSTR, jobparams: Long, coverpageinfo: Long, faxjobid: Long): BOOL =
    0

public actual fun FaxSetConfigurationA(faxhandle: HANDLE, faxconfig: Long): BOOL =
    0

public actual fun FaxSetConfigurationW(faxhandle: HANDLE, faxconfig: Long): BOOL =
    0

public actual fun FaxSetGlobalRoutingInfoA(faxhandle: HANDLE, routinginfo: Long): BOOL =
    0

public actual fun FaxSetGlobalRoutingInfoW(faxhandle: HANDLE, routinginfo: Long): BOOL =
    0

public actual fun FaxSetJobA(faxhandle: HANDLE, jobid: UInt, command: UInt, jobentry: Long): BOOL =
    0

public actual fun FaxSetJobW(faxhandle: HANDLE, jobid: UInt, command: UInt, jobentry: Long): BOOL =
    0

public actual fun FaxSetLoggingCategoriesA(faxhandle: HANDLE, categories: Long, numbercategories: UInt): BOOL =
    0

public actual fun FaxSetLoggingCategoriesW(faxhandle: HANDLE, categories: Long, numbercategories: UInt): BOOL =
    0

public actual fun FaxSetPortA(faxporthandle: HANDLE, portinfo: Long): BOOL =
    0

public actual fun FaxSetPortW(faxporthandle: HANDLE, portinfo: Long): BOOL =
    0

public actual fun FaxSetRoutingInfoA(faxporthandle: HANDLE, routingguid: PCSTR, routinginfobuffer: Long, routinginfobuffersize: UInt): BOOL =
    0

public actual fun FaxSetRoutingInfoW(faxporthandle: HANDLE, routingguid: PCWSTR, routinginfobuffer: Long, routinginfobuffersize: UInt): BOOL =
    0

public actual fun FaxStartPrintJobA(printername: PCSTR, printinfo: Long, faxjobid: Long, faxcontextinfo: Long): BOOL =
    0

public actual fun FaxStartPrintJobW(printername: PCWSTR, printinfo: Long, faxjobid: Long, faxcontextinfo: Long): BOOL =
    0

public actual fun FaxUnregisterServiceProviderW(deviceprovider: PCWSTR): BOOL =
    0

public actual fun SendToFaxRecipient(sndmode: SendToMode, lpfilename: PCWSTR): UInt =
    0u

public actual fun StiCreateInstanceW(hinst: HINSTANCE, dwver: UInt, ppsti: Long, punkouter: Long): HRESULT =
    0
