package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.rustlang.core.ffi.CVoid
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

public expect fun faxCompleteJobParamsA(jobparams: MutPtr<MutPtr<FaxJobParama>>, coverpageinfo: MutPtr<MutPtr<FaxCoverpageInfoa>>): Bool

public expect fun faxCompleteJobParamsW(jobparams: MutPtr<MutPtr<FaxJobParamw>>, coverpageinfo: MutPtr<MutPtr<FaxCoverpageInfow>>): Bool

public expect fun faxConnectFaxServerA(machinename: Pcstr, faxhandle: MutPtr<Handle>): Bool

public expect fun faxConnectFaxServerW(machinename: Pcwstr, faxhandle: MutPtr<Handle>): Bool

public expect fun faxEnableRoutingMethodA(faxporthandle: Handle, routingguid: Pcstr, enabled: Bool): Bool

public expect fun faxEnableRoutingMethodW(faxporthandle: Handle, routingguid: Pcwstr, enabled: Bool): Bool

public expect fun faxEnumGlobalRoutingInfoA(faxhandle: Handle, routinginfo: MutPtr<MutPtr<FaxGlobalRoutingInfoa>>, methodsreturned: MutPtr<UInt>): Bool

public expect fun faxEnumGlobalRoutingInfoW(faxhandle: Handle, routinginfo: MutPtr<MutPtr<FaxGlobalRoutingInfow>>, methodsreturned: MutPtr<UInt>): Bool

public expect fun faxEnumJobsA(faxhandle: Handle, jobentry: MutPtr<MutPtr<FaxJobEntrya>>, jobsreturned: MutPtr<UInt>): Bool

public expect fun faxEnumJobsW(faxhandle: Handle, jobentry: MutPtr<MutPtr<FaxJobEntryw>>, jobsreturned: MutPtr<UInt>): Bool

public expect fun faxEnumPortsA(faxhandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfoa>>, portsreturned: MutPtr<UInt>): Bool

public expect fun faxEnumPortsW(faxhandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfow>>, portsreturned: MutPtr<UInt>): Bool

public expect fun faxEnumRoutingMethodsA(faxporthandle: Handle, routingmethod: MutPtr<MutPtr<FaxRoutingMethoda>>, methodsreturned: MutPtr<UInt>): Bool

public expect fun faxEnumRoutingMethodsW(faxporthandle: Handle, routingmethod: MutPtr<MutPtr<FaxRoutingMethodw>>, methodsreturned: MutPtr<UInt>): Bool

public expect fun faxFreeBuffer(buffer: MutPtr<CVoid>)

public expect fun faxGetConfigurationA(faxhandle: Handle, faxconfig: MutPtr<MutPtr<FaxConfigurationa>>): Bool

public expect fun faxGetConfigurationW(faxhandle: Handle, faxconfig: MutPtr<MutPtr<FaxConfigurationw>>): Bool

public expect fun faxGetDeviceStatusA(faxporthandle: Handle, devicestatus: MutPtr<MutPtr<FaxDeviceStatusa>>): Bool

public expect fun faxGetDeviceStatusW(faxporthandle: Handle, devicestatus: MutPtr<MutPtr<FaxDeviceStatusw>>): Bool

public expect fun faxGetJobA(faxhandle: Handle, jobid: UInt, jobentry: MutPtr<MutPtr<FaxJobEntrya>>): Bool

public expect fun faxGetJobW(faxhandle: Handle, jobid: UInt, jobentry: MutPtr<MutPtr<FaxJobEntryw>>): Bool

public expect fun faxGetLoggingCategoriesA(faxhandle: Handle, categories: MutPtr<MutPtr<FaxLogCategorya>>, numbercategories: MutPtr<UInt>): Bool

public expect fun faxGetLoggingCategoriesW(faxhandle: Handle, categories: MutPtr<MutPtr<FaxLogCategoryw>>, numbercategories: MutPtr<UInt>): Bool

public expect fun faxGetPageData(faxhandle: Handle, jobid: UInt, buffer: MutPtr<MutPtr<UByte>>, buffersize: MutPtr<UInt>, imagewidth: MutPtr<UInt>, imageheight: MutPtr<UInt>): Bool

public expect fun faxGetPortA(faxporthandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfoa>>): Bool

public expect fun faxGetPortW(faxporthandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfow>>): Bool

public expect fun faxGetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: MutPtr<MutPtr<UByte>>, routinginfobuffersize: MutPtr<UInt>): Bool

public expect fun faxGetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: MutPtr<MutPtr<UByte>>, routinginfobuffersize: MutPtr<UInt>): Bool

public expect fun faxInitializeEventQueue(faxhandle: Handle, completionport: Handle, completionkey: ULong, hwnd: Hwnd, messagestart: UInt): Bool

public expect fun faxOpenPort(faxhandle: Handle, deviceid: UInt, flags: UInt, faxporthandle: MutPtr<Handle>): Bool

public expect fun faxPrintCoverPageA(faxcontextinfo: ConstPtr<FaxContextInfoa>, coverpageinfo: ConstPtr<FaxCoverpageInfoa>): Bool

public expect fun faxPrintCoverPageW(faxcontextinfo: ConstPtr<FaxContextInfow>, coverpageinfo: ConstPtr<FaxCoverpageInfow>): Bool

public expect fun faxRegisterRoutingExtensionW(faxhandle: Handle, extensionname: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, callback: PfaxRoutingInstallationCallbackw, context: ConstPtr<CVoid>): Bool

public expect fun faxRegisterServiceProviderW(deviceprovider: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, tspname: Pcwstr): Bool

public expect fun faxSendDocumentA(faxhandle: Handle, filename: Pcstr, jobparams: ConstPtr<FaxJobParama>, coverpageinfo: ConstPtr<FaxCoverpageInfoa>, faxjobid: MutPtr<UInt>): Bool

public expect fun faxSendDocumentForBroadcastA(faxhandle: Handle, filename: Pcstr, faxjobid: MutPtr<UInt>, faxrecipientcallback: PfaxRecipientCallbacka, context: ConstPtr<CVoid>): Bool

public expect fun faxSendDocumentForBroadcastW(faxhandle: Handle, filename: Pcwstr, faxjobid: MutPtr<UInt>, faxrecipientcallback: PfaxRecipientCallbackw, context: ConstPtr<CVoid>): Bool

public expect fun faxSendDocumentW(faxhandle: Handle, filename: Pcwstr, jobparams: ConstPtr<FaxJobParamw>, coverpageinfo: ConstPtr<FaxCoverpageInfow>, faxjobid: MutPtr<UInt>): Bool

public expect fun faxSetConfigurationA(faxhandle: Handle, faxconfig: ConstPtr<FaxConfigurationa>): Bool

public expect fun faxSetConfigurationW(faxhandle: Handle, faxconfig: ConstPtr<FaxConfigurationw>): Bool

public expect fun faxSetGlobalRoutingInfoA(faxhandle: Handle, routinginfo: ConstPtr<FaxGlobalRoutingInfoa>): Bool

public expect fun faxSetGlobalRoutingInfoW(faxhandle: Handle, routinginfo: ConstPtr<FaxGlobalRoutingInfow>): Bool

public expect fun faxSetJobA(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: ConstPtr<FaxJobEntrya>): Bool

public expect fun faxSetJobW(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: ConstPtr<FaxJobEntryw>): Bool

public expect fun faxSetLoggingCategoriesA(faxhandle: Handle, categories: ConstPtr<FaxLogCategorya>, numbercategories: UInt): Bool

public expect fun faxSetLoggingCategoriesW(faxhandle: Handle, categories: ConstPtr<FaxLogCategoryw>, numbercategories: UInt): Bool

public expect fun faxSetPortA(faxporthandle: Handle, portinfo: ConstPtr<FaxPortInfoa>): Bool

public expect fun faxSetPortW(faxporthandle: Handle, portinfo: ConstPtr<FaxPortInfow>): Bool

public expect fun faxSetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: ConstPtr<UByte>, routinginfobuffersize: UInt): Bool

public expect fun faxSetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: ConstPtr<UByte>, routinginfobuffersize: UInt): Bool

public expect fun faxStartPrintJobA(printername: Pcstr, printinfo: ConstPtr<FaxPrintInfoa>, faxjobid: MutPtr<UInt>, faxcontextinfo: MutPtr<FaxContextInfoa>): Bool

public expect fun faxStartPrintJobW(printername: Pcwstr, printinfo: ConstPtr<FaxPrintInfow>, faxjobid: MutPtr<UInt>, faxcontextinfo: MutPtr<FaxContextInfow>): Bool

public expect fun faxUnregisterServiceProviderW(deviceprovider: Pcwstr): Bool

public expect fun sendToFaxRecipient(sndmode: SendToMode, lpfilename: Pcwstr): UInt

public expect fun stiCreateInstanceW(hinst: Hinstance, dwver: UInt, ppsti: MutPtr<MutPtr<CVoid>>, punkouter: MutPtr<CVoid>): Hresult
