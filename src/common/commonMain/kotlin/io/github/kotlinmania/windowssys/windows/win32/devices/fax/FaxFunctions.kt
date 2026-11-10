package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun canSendToFaxRecipient(): Bool

public expect fun faxAbort(faxhandle: Handle, jobid: UInt): Bool

public expect fun faxAccessCheck(faxhandle: Handle, accessmask: UInt): Bool

public expect fun faxClose(faxhandle: Handle): Bool

public expect fun faxCompleteJobParamsA(jobparams: COpaquePointer?, coverpageinfo: COpaquePointer?): Bool

public expect fun faxCompleteJobParamsW(jobparams: COpaquePointer?, coverpageinfo: COpaquePointer?): Bool

public expect fun faxConnectFaxServerA(machinename: Pcstr, faxhandle: COpaquePointer?): Bool

public expect fun faxConnectFaxServerW(machinename: Pcwstr, faxhandle: COpaquePointer?): Bool

public expect fun faxEnableRoutingMethodA(faxporthandle: Handle, routingguid: Pcstr, enabled: Bool): Bool

public expect fun faxEnableRoutingMethodW(faxporthandle: Handle, routingguid: Pcwstr, enabled: Bool): Bool

public expect fun faxEnumGlobalRoutingInfoA(faxhandle: Handle, routinginfo: COpaquePointer?, methodsreturned: COpaquePointer?): Bool

public expect fun faxEnumGlobalRoutingInfoW(faxhandle: Handle, routinginfo: COpaquePointer?, methodsreturned: COpaquePointer?): Bool

public expect fun faxEnumJobsA(faxhandle: Handle, jobentry: COpaquePointer?, jobsreturned: COpaquePointer?): Bool

public expect fun faxEnumJobsW(faxhandle: Handle, jobentry: COpaquePointer?, jobsreturned: COpaquePointer?): Bool

public expect fun faxEnumPortsA(faxhandle: Handle, portinfo: COpaquePointer?, portsreturned: COpaquePointer?): Bool

public expect fun faxEnumPortsW(faxhandle: Handle, portinfo: COpaquePointer?, portsreturned: COpaquePointer?): Bool

public expect fun faxEnumRoutingMethodsA(faxporthandle: Handle, routingmethod: COpaquePointer?, methodsreturned: COpaquePointer?): Bool

public expect fun faxEnumRoutingMethodsW(faxporthandle: Handle, routingmethod: COpaquePointer?, methodsreturned: COpaquePointer?): Bool

public expect fun faxFreeBuffer(buffer: COpaquePointer?)

public expect fun faxGetConfigurationA(faxhandle: Handle, faxconfig: COpaquePointer?): Bool

public expect fun faxGetConfigurationW(faxhandle: Handle, faxconfig: COpaquePointer?): Bool

public expect fun faxGetDeviceStatusA(faxporthandle: Handle, devicestatus: COpaquePointer?): Bool

public expect fun faxGetDeviceStatusW(faxporthandle: Handle, devicestatus: COpaquePointer?): Bool

public expect fun faxGetJobA(faxhandle: Handle, jobid: UInt, jobentry: COpaquePointer?): Bool

public expect fun faxGetJobW(faxhandle: Handle, jobid: UInt, jobentry: COpaquePointer?): Bool

public expect fun faxGetLoggingCategoriesA(faxhandle: Handle, categories: COpaquePointer?, numbercategories: COpaquePointer?): Bool

public expect fun faxGetLoggingCategoriesW(faxhandle: Handle, categories: COpaquePointer?, numbercategories: COpaquePointer?): Bool

public expect fun faxGetPageData(faxhandle: Handle, jobid: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?, imagewidth: COpaquePointer?, imageheight: COpaquePointer?): Bool

public expect fun faxGetPortA(faxporthandle: Handle, portinfo: COpaquePointer?): Bool

public expect fun faxGetPortW(faxporthandle: Handle, portinfo: COpaquePointer?): Bool

public expect fun faxGetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: COpaquePointer?, routinginfobuffersize: COpaquePointer?): Bool

public expect fun faxGetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: COpaquePointer?, routinginfobuffersize: COpaquePointer?): Bool

public expect fun faxInitializeEventQueue(faxhandle: Handle, completionport: Handle, completionkey: ULong, hwnd: Hwnd, messagestart: UInt): Bool

public expect fun faxOpenPort(faxhandle: Handle, deviceid: UInt, flags: UInt, faxporthandle: COpaquePointer?): Bool

public expect fun faxPrintCoverPageA(faxcontextinfo: COpaquePointer?, coverpageinfo: COpaquePointer?): Bool

public expect fun faxPrintCoverPageW(faxcontextinfo: COpaquePointer?, coverpageinfo: COpaquePointer?): Bool

public expect fun faxRegisterRoutingExtensionW(faxhandle: Handle, extensionname: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, callback: PfaxRoutingInstallationCallbackw, context: COpaquePointer?): Bool

public expect fun faxRegisterServiceProviderW(deviceprovider: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, tspname: Pcwstr): Bool

public expect fun faxSendDocumentA(faxhandle: Handle, filename: Pcstr, jobparams: COpaquePointer?, coverpageinfo: COpaquePointer?, faxjobid: COpaquePointer?): Bool

public expect fun faxSendDocumentForBroadcastA(faxhandle: Handle, filename: Pcstr, faxjobid: COpaquePointer?, faxrecipientcallback: PfaxRecipientCallbacka, context: COpaquePointer?): Bool

public expect fun faxSendDocumentForBroadcastW(faxhandle: Handle, filename: Pcwstr, faxjobid: COpaquePointer?, faxrecipientcallback: PfaxRecipientCallbackw, context: COpaquePointer?): Bool

public expect fun faxSendDocumentW(faxhandle: Handle, filename: Pcwstr, jobparams: COpaquePointer?, coverpageinfo: COpaquePointer?, faxjobid: COpaquePointer?): Bool

public expect fun faxSetConfigurationA(faxhandle: Handle, faxconfig: COpaquePointer?): Bool

public expect fun faxSetConfigurationW(faxhandle: Handle, faxconfig: COpaquePointer?): Bool

public expect fun faxSetGlobalRoutingInfoA(faxhandle: Handle, routinginfo: COpaquePointer?): Bool

public expect fun faxSetGlobalRoutingInfoW(faxhandle: Handle, routinginfo: COpaquePointer?): Bool

public expect fun faxSetJobA(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: COpaquePointer?): Bool

public expect fun faxSetJobW(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: COpaquePointer?): Bool

public expect fun faxSetLoggingCategoriesA(faxhandle: Handle, categories: COpaquePointer?, numbercategories: UInt): Bool

public expect fun faxSetLoggingCategoriesW(faxhandle: Handle, categories: COpaquePointer?, numbercategories: UInt): Bool

public expect fun faxSetPortA(faxporthandle: Handle, portinfo: COpaquePointer?): Bool

public expect fun faxSetPortW(faxporthandle: Handle, portinfo: COpaquePointer?): Bool

public expect fun faxSetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: COpaquePointer?, routinginfobuffersize: UInt): Bool

public expect fun faxSetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: COpaquePointer?, routinginfobuffersize: UInt): Bool

public expect fun faxStartPrintJobA(printername: Pcstr, printinfo: COpaquePointer?, faxjobid: COpaquePointer?, faxcontextinfo: COpaquePointer?): Bool

public expect fun faxStartPrintJobW(printername: Pcwstr, printinfo: COpaquePointer?, faxjobid: COpaquePointer?, faxcontextinfo: COpaquePointer?): Bool

public expect fun faxUnregisterServiceProviderW(deviceprovider: Pcwstr): Bool

public expect fun sendToFaxRecipient(sndmode: SendToMode, lpfilename: Pcwstr): UInt

public expect fun stiCreateInstanceW(hinst: Hinstance, dwver: UInt, ppsti: COpaquePointer?, punkouter: COpaquePointer?): Hresult
