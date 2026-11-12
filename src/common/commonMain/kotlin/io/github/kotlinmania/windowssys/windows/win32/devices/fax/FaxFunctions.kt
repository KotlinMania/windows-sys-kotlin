package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

public expect fun faxCompleteJobParamsA(jobparams: MutPtr, coverpageinfo: MutPtr): Bool

public expect fun faxCompleteJobParamsW(jobparams: MutPtr, coverpageinfo: MutPtr): Bool

public expect fun faxConnectFaxServerA(machinename: Pcstr, faxhandle: MutPtr): Bool

public expect fun faxConnectFaxServerW(machinename: Pcwstr, faxhandle: MutPtr): Bool

public expect fun faxEnableRoutingMethodA(faxporthandle: Handle, routingguid: Pcstr, enabled: Bool): Bool

public expect fun faxEnableRoutingMethodW(faxporthandle: Handle, routingguid: Pcwstr, enabled: Bool): Bool

public expect fun faxEnumGlobalRoutingInfoA(faxhandle: Handle, routinginfo: MutPtr, methodsreturned: MutPtr): Bool

public expect fun faxEnumGlobalRoutingInfoW(faxhandle: Handle, routinginfo: MutPtr, methodsreturned: MutPtr): Bool

public expect fun faxEnumJobsA(faxhandle: Handle, jobentry: MutPtr, jobsreturned: MutPtr): Bool

public expect fun faxEnumJobsW(faxhandle: Handle, jobentry: MutPtr, jobsreturned: MutPtr): Bool

public expect fun faxEnumPortsA(faxhandle: Handle, portinfo: MutPtr, portsreturned: MutPtr): Bool

public expect fun faxEnumPortsW(faxhandle: Handle, portinfo: MutPtr, portsreturned: MutPtr): Bool

public expect fun faxEnumRoutingMethodsA(faxporthandle: Handle, routingmethod: MutPtr, methodsreturned: MutPtr): Bool

public expect fun faxEnumRoutingMethodsW(faxporthandle: Handle, routingmethod: MutPtr, methodsreturned: MutPtr): Bool

public expect fun faxFreeBuffer(buffer: MutPtr)

public expect fun faxGetConfigurationA(faxhandle: Handle, faxconfig: MutPtr): Bool

public expect fun faxGetConfigurationW(faxhandle: Handle, faxconfig: MutPtr): Bool

public expect fun faxGetDeviceStatusA(faxporthandle: Handle, devicestatus: MutPtr): Bool

public expect fun faxGetDeviceStatusW(faxporthandle: Handle, devicestatus: MutPtr): Bool

public expect fun faxGetJobA(faxhandle: Handle, jobid: UInt, jobentry: MutPtr): Bool

public expect fun faxGetJobW(faxhandle: Handle, jobid: UInt, jobentry: MutPtr): Bool

public expect fun faxGetLoggingCategoriesA(faxhandle: Handle, categories: MutPtr, numbercategories: MutPtr): Bool

public expect fun faxGetLoggingCategoriesW(faxhandle: Handle, categories: MutPtr, numbercategories: MutPtr): Bool

public expect fun faxGetPageData(faxhandle: Handle, jobid: UInt, buffer: MutPtr, buffersize: MutPtr, imagewidth: MutPtr, imageheight: MutPtr): Bool

public expect fun faxGetPortA(faxporthandle: Handle, portinfo: MutPtr): Bool

public expect fun faxGetPortW(faxporthandle: Handle, portinfo: MutPtr): Bool

public expect fun faxGetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: MutPtr, routinginfobuffersize: MutPtr): Bool

public expect fun faxGetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: MutPtr, routinginfobuffersize: MutPtr): Bool

public expect fun faxInitializeEventQueue(faxhandle: Handle, completionport: Handle, completionkey: ULong, hwnd: Hwnd, messagestart: UInt): Bool

public expect fun faxOpenPort(faxhandle: Handle, deviceid: UInt, flags: UInt, faxporthandle: MutPtr): Bool

public expect fun faxPrintCoverPageA(faxcontextinfo: ConstPtr, coverpageinfo: ConstPtr): Bool

public expect fun faxPrintCoverPageW(faxcontextinfo: ConstPtr, coverpageinfo: ConstPtr): Bool

public expect fun faxRegisterRoutingExtensionW(faxhandle: Handle, extensionname: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, callback: PfaxRoutingInstallationCallbackw, context: ConstPtr): Bool

public expect fun faxRegisterServiceProviderW(deviceprovider: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, tspname: Pcwstr): Bool

public expect fun faxSendDocumentA(faxhandle: Handle, filename: Pcstr, jobparams: ConstPtr, coverpageinfo: ConstPtr, faxjobid: MutPtr): Bool

public expect fun faxSendDocumentForBroadcastA(faxhandle: Handle, filename: Pcstr, faxjobid: MutPtr, faxrecipientcallback: PfaxRecipientCallbacka, context: ConstPtr): Bool

public expect fun faxSendDocumentForBroadcastW(faxhandle: Handle, filename: Pcwstr, faxjobid: MutPtr, faxrecipientcallback: PfaxRecipientCallbackw, context: ConstPtr): Bool

public expect fun faxSendDocumentW(faxhandle: Handle, filename: Pcwstr, jobparams: ConstPtr, coverpageinfo: ConstPtr, faxjobid: MutPtr): Bool

public expect fun faxSetConfigurationA(faxhandle: Handle, faxconfig: ConstPtr): Bool

public expect fun faxSetConfigurationW(faxhandle: Handle, faxconfig: ConstPtr): Bool

public expect fun faxSetGlobalRoutingInfoA(faxhandle: Handle, routinginfo: ConstPtr): Bool

public expect fun faxSetGlobalRoutingInfoW(faxhandle: Handle, routinginfo: ConstPtr): Bool

public expect fun faxSetJobA(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: ConstPtr): Bool

public expect fun faxSetJobW(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: ConstPtr): Bool

public expect fun faxSetLoggingCategoriesA(faxhandle: Handle, categories: ConstPtr, numbercategories: UInt): Bool

public expect fun faxSetLoggingCategoriesW(faxhandle: Handle, categories: ConstPtr, numbercategories: UInt): Bool

public expect fun faxSetPortA(faxporthandle: Handle, portinfo: ConstPtr): Bool

public expect fun faxSetPortW(faxporthandle: Handle, portinfo: ConstPtr): Bool

public expect fun faxSetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: ConstPtr, routinginfobuffersize: UInt): Bool

public expect fun faxSetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: ConstPtr, routinginfobuffersize: UInt): Bool

public expect fun faxStartPrintJobA(printername: Pcstr, printinfo: ConstPtr, faxjobid: MutPtr, faxcontextinfo: MutPtr): Bool

public expect fun faxStartPrintJobW(printername: Pcwstr, printinfo: ConstPtr, faxjobid: MutPtr, faxcontextinfo: MutPtr): Bool

public expect fun faxUnregisterServiceProviderW(deviceprovider: Pcwstr): Bool

public expect fun sendToFaxRecipient(sndmode: SendToMode, lpfilename: Pcwstr): UInt

public expect fun stiCreateInstanceW(hinst: Hinstance, dwver: UInt, ppsti: MutPtr, punkouter: MutPtr): Hresult
