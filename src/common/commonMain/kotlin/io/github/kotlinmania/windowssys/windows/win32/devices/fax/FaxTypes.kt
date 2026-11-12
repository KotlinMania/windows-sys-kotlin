package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Hpropsheetpage

public typealias FaxrouteEnable = Int

public typealias FaxAccessRightsEnum = Int

public typealias FaxAccessRightsEnum2 = Int

public typealias FaxAccountEventsTypeEnum = Int

public typealias FaxCoverpageTypeEnum = Int

public typealias FaxDeviceReceiveModeEnum = Int

public typealias FaxEnumDeliveryReportTypes = Int

public typealias FaxEnumDeviceIdSource = Int

public typealias FaxEnumJobCommands = Int

public typealias FaxEnumJobSendAttributes = Int

public typealias FaxEnumLogCategories = Int

public typealias FaxEnumLogLevels = Int

public typealias FaxEnumPortOpenType = Int

public typealias FaxGroupStatusEnum = Int

public typealias FaxJobExtendedStatusEnum = Int

public typealias FaxJobOperationsEnum = Int

public typealias FaxJobStatusEnum = Int

public typealias FaxJobTypeEnum = Int

public typealias FaxLogLevelEnum = Int

public typealias FaxPriorityTypeEnum = Int

public typealias FaxProviderStatusEnum = Int

public typealias FaxReceiptTypeEnum = Int

public typealias FaxRoutingRuleCodeEnum = Int

public typealias FaxRuleStatusEnum = Int

public typealias FaxScheduleTypeEnum = Int

public typealias FaxServerApiversionEnum = Int

public typealias FaxServerEventsTypeEnum = Int

public typealias FaxSmtpAuthenticationTypeEnum = Int

public fun interface PfaxabortFn {
    public operator fun invoke(faxhandle: Handle, jobid: UInt): Bool
}

public typealias Pfaxabort = PfaxabortFn?

public fun interface PfaxaccesscheckFn {
    public operator fun invoke(faxhandle: Handle, accessmask: UInt): Bool
}

public typealias Pfaxaccesscheck = PfaxaccesscheckFn?

public fun interface PfaxcloseFn {
    public operator fun invoke(faxhandle: Handle): Bool
}

public typealias Pfaxclose = PfaxcloseFn?

public fun interface PfaxcompletejobparamsaFn {
    public operator fun invoke(jobparams: MutPtr<MutPtr<FaxJobParama>>, coverpageinfo: MutPtr<MutPtr<FaxCoverpageInfoa>>): Bool
}

public typealias Pfaxcompletejobparamsa = PfaxcompletejobparamsaFn?

public fun interface PfaxcompletejobparamswFn {
    public operator fun invoke(jobparams: MutPtr<MutPtr<FaxJobParamw>>, coverpageinfo: MutPtr<MutPtr<FaxCoverpageInfow>>): Bool
}

public typealias Pfaxcompletejobparamsw = PfaxcompletejobparamswFn?

public fun interface PfaxconnectfaxserveraFn {
    public operator fun invoke(machinename: Pcstr, faxhandle: MutPtr<Handle>): Bool
}

public typealias Pfaxconnectfaxservera = PfaxconnectfaxserveraFn?

public fun interface PfaxconnectfaxserverwFn {
    public operator fun invoke(machinename: Pcwstr, faxhandle: MutPtr<Handle>): Bool
}

public typealias Pfaxconnectfaxserverw = PfaxconnectfaxserverwFn?

public fun interface PfaxdevabortoperationFn {
    public operator fun invoke(param0: Handle): Bool
}

public typealias Pfaxdevabortoperation = PfaxdevabortoperationFn?

public fun interface PfaxdevconfigureFn {
    public operator fun invoke(param0: MutPtr<Hpropsheetpage>): Bool
}

public typealias Pfaxdevconfigure = PfaxdevconfigureFn?

public fun interface PfaxdevendjobFn {
    public operator fun invoke(param0: Handle): Bool
}

public typealias Pfaxdevendjob = PfaxdevendjobFn?

public fun interface PfaxdevinitializeFn {
    public operator fun invoke(param0: UInt, param1: Handle, param2: MutPtr<PfaxLinecallback>, param3: PfaxServiceCallback): Bool
}

public typealias Pfaxdevinitialize = PfaxdevinitializeFn?

public fun interface PfaxdevreceiveFn {
    public operator fun invoke(param0: Handle, param1: UInt, param2: MutPtr<FaxReceive>): Bool
}

public typealias Pfaxdevreceive = PfaxdevreceiveFn?

public fun interface PfaxdevreportstatusFn {
    public operator fun invoke(param0: Handle, param1: MutPtr<FaxDevStatus>, param2: UInt, param3: MutPtr<UInt>): Bool
}

public typealias Pfaxdevreportstatus = PfaxdevreportstatusFn?

public fun interface PfaxdevsendFn {
    public operator fun invoke(param0: Handle, param1: MutPtr<FaxSend>, param2: PfaxSendCallback): Bool
}

public typealias Pfaxdevsend = PfaxdevsendFn?

public fun interface PfaxdevshutdownFn {
    public operator fun invoke(): Hresult
}

public typealias Pfaxdevshutdown = PfaxdevshutdownFn?

public fun interface PfaxdevstartjobFn {
    public operator fun invoke(param0: UInt, param1: UInt, param2: MutPtr<Handle>, param3: Handle, param4: ULong): Bool
}

public typealias Pfaxdevstartjob = PfaxdevstartjobFn?

public fun interface PfaxdevvirtualdevicecreationFn {
    public operator fun invoke(devicecount: MutPtr<UInt>, devicenameprefix: Pwstr, deviceidprefix: MutPtr<UInt>, completionport: Handle, completionkey: ULong): Bool
}

public typealias Pfaxdevvirtualdevicecreation = PfaxdevvirtualdevicecreationFn?

public fun interface PfaxenableroutingmethodaFn {
    public operator fun invoke(faxporthandle: Handle, routingguid: Pcstr, enabled: Bool): Bool
}

public typealias Pfaxenableroutingmethoda = PfaxenableroutingmethodaFn?

public fun interface PfaxenableroutingmethodwFn {
    public operator fun invoke(faxporthandle: Handle, routingguid: Pcwstr, enabled: Bool): Bool
}

public typealias Pfaxenableroutingmethodw = PfaxenableroutingmethodwFn?

public fun interface PfaxenumglobalroutinginfoaFn {
    public operator fun invoke(faxhandle: Handle, routinginfo: MutPtr<MutPtr<FaxGlobalRoutingInfoa>>, methodsreturned: MutPtr<UInt>): Bool
}

public typealias Pfaxenumglobalroutinginfoa = PfaxenumglobalroutinginfoaFn?

public fun interface PfaxenumglobalroutinginfowFn {
    public operator fun invoke(faxhandle: Handle, routinginfo: MutPtr<MutPtr<FaxGlobalRoutingInfow>>, methodsreturned: MutPtr<UInt>): Bool
}

public typealias Pfaxenumglobalroutinginfow = PfaxenumglobalroutinginfowFn?

public fun interface PfaxenumjobsaFn {
    public operator fun invoke(faxhandle: Handle, jobentry: MutPtr<MutPtr<FaxJobEntrya>>, jobsreturned: MutPtr<UInt>): Bool
}

public typealias Pfaxenumjobsa = PfaxenumjobsaFn?

public fun interface PfaxenumjobswFn {
    public operator fun invoke(faxhandle: Handle, jobentry: MutPtr<MutPtr<FaxJobEntryw>>, jobsreturned: MutPtr<UInt>): Bool
}

public typealias Pfaxenumjobsw = PfaxenumjobswFn?

public fun interface PfaxenumportsaFn {
    public operator fun invoke(faxhandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfoa>>, portsreturned: MutPtr<UInt>): Bool
}

public typealias Pfaxenumportsa = PfaxenumportsaFn?

public fun interface PfaxenumportswFn {
    public operator fun invoke(faxhandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfow>>, portsreturned: MutPtr<UInt>): Bool
}

public typealias Pfaxenumportsw = PfaxenumportswFn?

public fun interface PfaxenumroutingmethodsaFn {
    public operator fun invoke(faxporthandle: Handle, routingmethod: MutPtr<MutPtr<FaxRoutingMethoda>>, methodsreturned: MutPtr<UInt>): Bool
}

public typealias Pfaxenumroutingmethodsa = PfaxenumroutingmethodsaFn?

public fun interface PfaxenumroutingmethodswFn {
    public operator fun invoke(faxporthandle: Handle, routingmethod: MutPtr<MutPtr<FaxRoutingMethodw>>, methodsreturned: MutPtr<UInt>): Bool
}

public typealias Pfaxenumroutingmethodsw = PfaxenumroutingmethodswFn?

public fun interface PfaxfreebufferFn {
    public operator fun invoke(buffer: MutPtr<CVoid>)
}

public typealias Pfaxfreebuffer = PfaxfreebufferFn?

public fun interface PfaxgetconfigurationaFn {
    public operator fun invoke(faxhandle: Handle, faxconfig: MutPtr<MutPtr<FaxConfigurationa>>): Bool
}

public typealias Pfaxgetconfigurationa = PfaxgetconfigurationaFn?

public fun interface PfaxgetconfigurationwFn {
    public operator fun invoke(faxhandle: Handle, faxconfig: MutPtr<MutPtr<FaxConfigurationw>>): Bool
}

public typealias Pfaxgetconfigurationw = PfaxgetconfigurationwFn?

public fun interface PfaxgetdevicestatusaFn {
    public operator fun invoke(faxporthandle: Handle, devicestatus: MutPtr<MutPtr<FaxDeviceStatusa>>): Bool
}

public typealias Pfaxgetdevicestatusa = PfaxgetdevicestatusaFn?

public fun interface PfaxgetdevicestatuswFn {
    public operator fun invoke(faxporthandle: Handle, devicestatus: MutPtr<MutPtr<FaxDeviceStatusw>>): Bool
}

public typealias Pfaxgetdevicestatusw = PfaxgetdevicestatuswFn?

public fun interface PfaxgetjobaFn {
    public operator fun invoke(faxhandle: Handle, jobid: UInt, jobentry: MutPtr<MutPtr<FaxJobEntrya>>): Bool
}

public typealias Pfaxgetjoba = PfaxgetjobaFn?

public fun interface PfaxgetjobwFn {
    public operator fun invoke(faxhandle: Handle, jobid: UInt, jobentry: MutPtr<MutPtr<FaxJobEntryw>>): Bool
}

public typealias Pfaxgetjobw = PfaxgetjobwFn?

public fun interface PfaxgetloggingcategoriesaFn {
    public operator fun invoke(faxhandle: Handle, categories: MutPtr<MutPtr<FaxLogCategorya>>, numbercategories: MutPtr<UInt>): Bool
}

public typealias Pfaxgetloggingcategoriesa = PfaxgetloggingcategoriesaFn?

public fun interface PfaxgetloggingcategorieswFn {
    public operator fun invoke(faxhandle: Handle, categories: MutPtr<MutPtr<FaxLogCategoryw>>, numbercategories: MutPtr<UInt>): Bool
}

public typealias Pfaxgetloggingcategoriesw = PfaxgetloggingcategorieswFn?

public fun interface PfaxgetpagedataFn {
    public operator fun invoke(faxhandle: Handle, jobid: UInt, buffer: MutPtr<MutPtr<UByte>>, buffersize: MutPtr<UInt>, imagewidth: MutPtr<UInt>, imageheight: MutPtr<UInt>): Bool
}

public typealias Pfaxgetpagedata = PfaxgetpagedataFn?

public fun interface PfaxgetportaFn {
    public operator fun invoke(faxporthandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfoa>>): Bool
}

public typealias Pfaxgetporta = PfaxgetportaFn?

public fun interface PfaxgetportwFn {
    public operator fun invoke(faxporthandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfow>>): Bool
}

public typealias Pfaxgetportw = PfaxgetportwFn?

public fun interface PfaxgetroutinginfoaFn {
    public operator fun invoke(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: MutPtr<MutPtr<UByte>>, routinginfobuffersize: MutPtr<UInt>): Bool
}

public typealias Pfaxgetroutinginfoa = PfaxgetroutinginfoaFn?

public fun interface PfaxgetroutinginfowFn {
    public operator fun invoke(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: MutPtr<MutPtr<UByte>>, routinginfobuffersize: MutPtr<UInt>): Bool
}

public typealias Pfaxgetroutinginfow = PfaxgetroutinginfowFn?

public fun interface PfaxinitializeeventqueueFn {
    public operator fun invoke(faxhandle: Handle, completionport: Handle, completionkey: ULong, hwnd: Hwnd, messagestart: UInt): Bool
}

public typealias Pfaxinitializeeventqueue = PfaxinitializeeventqueueFn?

public fun interface PfaxopenportFn {
    public operator fun invoke(faxhandle: Handle, deviceid: UInt, flags: UInt, faxporthandle: MutPtr<Handle>): Bool
}

public typealias Pfaxopenport = PfaxopenportFn?

public fun interface PfaxprintcoverpageaFn {
    public operator fun invoke(faxcontextinfo: ConstPtr<FaxContextInfoa>, coverpageinfo: ConstPtr<FaxCoverpageInfoa>): Bool
}

public typealias Pfaxprintcoverpagea = PfaxprintcoverpageaFn?

public fun interface PfaxprintcoverpagewFn {
    public operator fun invoke(faxcontextinfo: ConstPtr<FaxContextInfow>, coverpageinfo: ConstPtr<FaxCoverpageInfow>): Bool
}

public typealias Pfaxprintcoverpagew = PfaxprintcoverpagewFn?

public fun interface PfaxregisterroutingextensionwFn {
    public operator fun invoke(faxhandle: Handle, extensionname: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, callback: PfaxRoutingInstallationCallbackw, context: ConstPtr<CVoid>): Bool
}

public typealias Pfaxregisterroutingextensionw = PfaxregisterroutingextensionwFn?

public fun interface PfaxregisterserviceproviderwFn {
    public operator fun invoke(deviceprovider: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, tspname: Pcwstr): Bool
}

public typealias Pfaxregisterserviceproviderw = PfaxregisterserviceproviderwFn?

public fun interface PfaxrouteaddfileFn {
    public operator fun invoke(jobid: UInt, filename: Pcwstr, guid: MutPtr<Guid>): Int
}

public typealias Pfaxrouteaddfile = PfaxrouteaddfileFn?

public fun interface PfaxroutedeletefileFn {
    public operator fun invoke(jobid: UInt, filename: Pcwstr): Int
}

public typealias Pfaxroutedeletefile = PfaxroutedeletefileFn?

public fun interface PfaxroutedevicechangenotificationFn {
    public operator fun invoke(param0: UInt, param1: Bool): Bool
}

public typealias Pfaxroutedevicechangenotification = PfaxroutedevicechangenotificationFn?

public fun interface PfaxroutedeviceenableFn {
    public operator fun invoke(param0: Pcwstr, param1: UInt, param2: Int): Bool
}

public typealias Pfaxroutedeviceenable = PfaxroutedeviceenableFn?

public fun interface PfaxrouteenumfileFn {
    public operator fun invoke(jobid: UInt, guidowner: MutPtr<Guid>, guidcaller: MutPtr<Guid>, filename: Pcwstr, context: MutPtr<CVoid>): Bool
}

public typealias Pfaxrouteenumfile = PfaxrouteenumfileFn?

public fun interface PfaxrouteenumfilesFn {
    public operator fun invoke(jobid: UInt, guid: MutPtr<Guid>, fileenumerator: Pfaxrouteenumfile, context: MutPtr<CVoid>): Bool
}

public typealias Pfaxrouteenumfiles = PfaxrouteenumfilesFn?

public fun interface PfaxroutegetfileFn {
    public operator fun invoke(jobid: UInt, index: UInt, filenamebuffer: Pwstr, requiredsize: MutPtr<UInt>): Bool
}

public typealias Pfaxroutegetfile = PfaxroutegetfileFn?

public fun interface PfaxroutegetroutinginfoFn {
    public operator fun invoke(param0: Pcwstr, param1: UInt, param2: MutPtr<UByte>, param3: MutPtr<UInt>): Bool
}

public typealias Pfaxroutegetroutinginfo = PfaxroutegetroutinginfoFn?

public fun interface PfaxrouteinitializeFn {
    public operator fun invoke(param0: Handle, param1: MutPtr<FaxRouteCallbackroutines>): Bool
}

public typealias Pfaxrouteinitialize = PfaxrouteinitializeFn?

public fun interface PfaxroutemethodFn {
    public operator fun invoke(param0: ConstPtr<FaxRoute>, param1: MutPtr<MutPtr<CVoid>>, param2: MutPtr<UInt>): Bool
}

public typealias Pfaxroutemethod = PfaxroutemethodFn?

public fun interface PfaxroutemodifyroutingdataFn {
    public operator fun invoke(jobid: UInt, routingguid: Pcwstr, routingdata: MutPtr<UByte>, routingdatasize: UInt): Bool
}

public typealias Pfaxroutemodifyroutingdata = PfaxroutemodifyroutingdataFn?

public fun interface PfaxroutesetroutinginfoFn {
    public operator fun invoke(param0: Pcwstr, param1: UInt, param2: ConstPtr<UByte>, param3: UInt): Bool
}

public typealias Pfaxroutesetroutinginfo = PfaxroutesetroutinginfoFn?

public fun interface PfaxsenddocumentaFn {
    public operator fun invoke(faxhandle: Handle, filename: Pcstr, jobparams: ConstPtr<FaxJobParama>, coverpageinfo: ConstPtr<FaxCoverpageInfoa>, faxjobid: MutPtr<UInt>): Bool
}

public typealias Pfaxsenddocumenta = PfaxsenddocumentaFn?

public fun interface PfaxsenddocumentforbroadcastaFn {
    public operator fun invoke(faxhandle: Handle, filename: Pcstr, faxjobid: MutPtr<UInt>, faxrecipientcallback: PfaxRecipientCallbacka, context: ConstPtr<CVoid>): Bool
}

public typealias Pfaxsenddocumentforbroadcasta = PfaxsenddocumentforbroadcastaFn?

public fun interface PfaxsenddocumentforbroadcastwFn {
    public operator fun invoke(faxhandle: Handle, filename: Pcwstr, faxjobid: MutPtr<UInt>, faxrecipientcallback: PfaxRecipientCallbackw, context: ConstPtr<CVoid>): Bool
}

public typealias Pfaxsenddocumentforbroadcastw = PfaxsenddocumentforbroadcastwFn?

public fun interface PfaxsenddocumentwFn {
    public operator fun invoke(faxhandle: Handle, filename: Pcwstr, jobparams: ConstPtr<FaxJobParamw>, coverpageinfo: ConstPtr<FaxCoverpageInfow>, faxjobid: MutPtr<UInt>): Bool
}

public typealias Pfaxsenddocumentw = PfaxsenddocumentwFn?

public fun interface PfaxsetconfigurationaFn {
    public operator fun invoke(faxhandle: Handle, faxconfig: ConstPtr<FaxConfigurationa>): Bool
}

public typealias Pfaxsetconfigurationa = PfaxsetconfigurationaFn?

public fun interface PfaxsetconfigurationwFn {
    public operator fun invoke(faxhandle: Handle, faxconfig: ConstPtr<FaxConfigurationw>): Bool
}

public typealias Pfaxsetconfigurationw = PfaxsetconfigurationwFn?

public fun interface PfaxsetglobalroutinginfoaFn {
    public operator fun invoke(faxporthandle: Handle, routinginfo: ConstPtr<FaxGlobalRoutingInfoa>): Bool
}

public typealias Pfaxsetglobalroutinginfoa = PfaxsetglobalroutinginfoaFn?

public fun interface PfaxsetglobalroutinginfowFn {
    public operator fun invoke(faxporthandle: Handle, routinginfo: ConstPtr<FaxGlobalRoutingInfow>): Bool
}

public typealias Pfaxsetglobalroutinginfow = PfaxsetglobalroutinginfowFn?

public fun interface PfaxsetjobaFn {
    public operator fun invoke(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: ConstPtr<FaxJobEntrya>): Bool
}

public typealias Pfaxsetjoba = PfaxsetjobaFn?

public fun interface PfaxsetjobwFn {
    public operator fun invoke(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: ConstPtr<FaxJobEntryw>): Bool
}

public typealias Pfaxsetjobw = PfaxsetjobwFn?

public fun interface PfaxsetloggingcategoriesaFn {
    public operator fun invoke(faxhandle: Handle, categories: ConstPtr<FaxLogCategorya>, numbercategories: UInt): Bool
}

public typealias Pfaxsetloggingcategoriesa = PfaxsetloggingcategoriesaFn?

public fun interface PfaxsetloggingcategorieswFn {
    public operator fun invoke(faxhandle: Handle, categories: ConstPtr<FaxLogCategoryw>, numbercategories: UInt): Bool
}

public typealias Pfaxsetloggingcategoriesw = PfaxsetloggingcategorieswFn?

public fun interface PfaxsetportaFn {
    public operator fun invoke(faxporthandle: Handle, portinfo: ConstPtr<FaxPortInfoa>): Bool
}

public typealias Pfaxsetporta = PfaxsetportaFn?

public fun interface PfaxsetportwFn {
    public operator fun invoke(faxporthandle: Handle, portinfo: ConstPtr<FaxPortInfow>): Bool
}

public typealias Pfaxsetportw = PfaxsetportwFn?

public fun interface PfaxsetroutinginfoaFn {
    public operator fun invoke(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: ConstPtr<UByte>, routinginfobuffersize: UInt): Bool
}

public typealias Pfaxsetroutinginfoa = PfaxsetroutinginfoaFn?

public fun interface PfaxsetroutinginfowFn {
    public operator fun invoke(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: ConstPtr<UByte>, routinginfobuffersize: UInt): Bool
}

public typealias Pfaxsetroutinginfow = PfaxsetroutinginfowFn?

public fun interface PfaxstartprintjobaFn {
    public operator fun invoke(printername: Pcstr, printinfo: ConstPtr<FaxPrintInfoa>, faxjobid: MutPtr<UInt>, faxcontextinfo: MutPtr<FaxContextInfoa>): Bool
}

public typealias Pfaxstartprintjoba = PfaxstartprintjobaFn?

public fun interface PfaxstartprintjobwFn {
    public operator fun invoke(printername: Pcwstr, printinfo: ConstPtr<FaxPrintInfow>, faxjobid: MutPtr<UInt>, faxcontextinfo: MutPtr<FaxContextInfow>): Bool
}

public typealias Pfaxstartprintjobw = PfaxstartprintjobwFn?

public fun interface PfaxunregisterserviceproviderwFn {
    public operator fun invoke(deviceprovider: Pcwstr): Bool
}

public typealias Pfaxunregisterserviceproviderw = PfaxunregisterserviceproviderwFn?

public fun interface PfaxExtConfigChangeFn {
    public operator fun invoke(param0: UInt, param1: Pcwstr, param2: MutPtr<UByte>, param3: UInt): Hresult
}

public typealias PfaxExtConfigChange = PfaxExtConfigChangeFn?

public fun interface PfaxExtFreeBufferFn {
    public operator fun invoke(param0: MutPtr<CVoid>)
}

public typealias PfaxExtFreeBuffer = PfaxExtFreeBufferFn?

public fun interface PfaxExtGetDataFn {
    public operator fun invoke(param0: UInt, param1: FaxEnumDeviceIdSource, param2: Pcwstr, param3: MutPtr<MutPtr<UByte>>, param4: MutPtr<UInt>): UInt
}

public typealias PfaxExtGetData = PfaxExtGetDataFn?

public fun interface PfaxExtInitializeConfigFn {
    public operator fun invoke(param0: PfaxExtGetData, param1: PfaxExtSetData, param2: PfaxExtRegisterForEvents, param3: PfaxExtUnregisterForEvents, param4: PfaxExtFreeBuffer): Hresult
}

public typealias PfaxExtInitializeConfig = PfaxExtInitializeConfigFn?

public fun interface PfaxExtRegisterForEventsFn {
    public operator fun invoke(param0: Hinstance, param1: UInt, param2: FaxEnumDeviceIdSource, param3: Pcwstr, param4: PfaxExtConfigChange): Handle
}

public typealias PfaxExtRegisterForEvents = PfaxExtRegisterForEventsFn?

public fun interface PfaxExtSetDataFn {
    public operator fun invoke(param0: Hinstance, param1: UInt, param2: FaxEnumDeviceIdSource, param3: Pcwstr, param4: MutPtr<UByte>, param5: UInt): UInt
}

public typealias PfaxExtSetData = PfaxExtSetDataFn?

public fun interface PfaxExtUnregisterForEventsFn {
    public operator fun invoke(param0: Handle): UInt
}

public typealias PfaxExtUnregisterForEvents = PfaxExtUnregisterForEventsFn?

public fun interface PfaxLinecallbackFn {
    public operator fun invoke(faxhandle: Handle, hdevice: UInt, dwmessage: UInt, dwinstance: ULong, dwparam1: ULong, dwparam2: ULong, dwparam3: ULong)
}

public typealias PfaxLinecallback = PfaxLinecallbackFn?

public fun interface PfaxRecipientCallbackaFn {
    public operator fun invoke(faxhandle: Handle, recipientnumber: UInt, context: ConstPtr<CVoid>, jobparams: MutPtr<FaxJobParama>, coverpageinfo: MutPtr<FaxCoverpageInfoa>): Bool
}

public typealias PfaxRecipientCallbacka = PfaxRecipientCallbackaFn?

public fun interface PfaxRecipientCallbackwFn {
    public operator fun invoke(faxhandle: Handle, recipientnumber: UInt, context: ConstPtr<CVoid>, jobparams: MutPtr<FaxJobParamw>, coverpageinfo: MutPtr<FaxCoverpageInfow>): Bool
}

public typealias PfaxRecipientCallbackw = PfaxRecipientCallbackwFn?

public fun interface PfaxRoutingInstallationCallbackwFn {
    public operator fun invoke(faxhandle: Handle, context: ConstPtr<CVoid>, methodname: Pwstr, friendlyname: Pwstr, functionname: Pwstr, guid: Pwstr): Bool
}

public typealias PfaxRoutingInstallationCallbackw = PfaxRoutingInstallationCallbackwFn?

public fun interface PfaxSendCallbackFn {
    public operator fun invoke(faxhandle: Handle, callhandle: UInt, reserved1: UInt, reserved2: UInt): Bool
}

public typealias PfaxSendCallback = PfaxSendCallbackFn?

public fun interface PfaxServiceCallbackFn {
    public operator fun invoke(faxhandle: Handle, deviceid: UInt, param1: ULong, param2: ULong, param3: ULong): Bool
}

public typealias PfaxServiceCallback = PfaxServiceCallbackFn?

public typealias StiDeviceMjType = Int

public typealias SendToMode = Int
