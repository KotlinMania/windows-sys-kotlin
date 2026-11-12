package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

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
    public operator fun invoke(jobparams: MutPtr, coverpageinfo: MutPtr): Bool
}

public typealias Pfaxcompletejobparamsa = PfaxcompletejobparamsaFn?

public fun interface PfaxcompletejobparamswFn {
    public operator fun invoke(jobparams: MutPtr, coverpageinfo: MutPtr): Bool
}

public typealias Pfaxcompletejobparamsw = PfaxcompletejobparamswFn?

public fun interface PfaxconnectfaxserveraFn {
    public operator fun invoke(machinename: Pcstr, faxhandle: MutPtr): Bool
}

public typealias Pfaxconnectfaxservera = PfaxconnectfaxserveraFn?

public fun interface PfaxconnectfaxserverwFn {
    public operator fun invoke(machinename: Pcwstr, faxhandle: MutPtr): Bool
}

public typealias Pfaxconnectfaxserverw = PfaxconnectfaxserverwFn?

public fun interface PfaxdevabortoperationFn {
    public operator fun invoke(param0: Handle): Bool
}

public typealias Pfaxdevabortoperation = PfaxdevabortoperationFn?

public fun interface PfaxdevconfigureFn {
    public operator fun invoke(param0: MutPtr): Bool
}

public typealias Pfaxdevconfigure = PfaxdevconfigureFn?

public fun interface PfaxdevendjobFn {
    public operator fun invoke(param0: Handle): Bool
}

public typealias Pfaxdevendjob = PfaxdevendjobFn?

public fun interface PfaxdevinitializeFn {
    public operator fun invoke(param0: UInt, param1: Handle, param2: MutPtr, param3: PfaxServiceCallback): Bool
}

public typealias Pfaxdevinitialize = PfaxdevinitializeFn?

public fun interface PfaxdevreceiveFn {
    public operator fun invoke(param0: Handle, param1: UInt, param2: MutPtr): Bool
}

public typealias Pfaxdevreceive = PfaxdevreceiveFn?

public fun interface PfaxdevreportstatusFn {
    public operator fun invoke(param0: Handle, param1: MutPtr, param2: UInt, param3: MutPtr): Bool
}

public typealias Pfaxdevreportstatus = PfaxdevreportstatusFn?

public fun interface PfaxdevsendFn {
    public operator fun invoke(param0: Handle, param1: MutPtr, param2: PfaxSendCallback): Bool
}

public typealias Pfaxdevsend = PfaxdevsendFn?

public fun interface PfaxdevshutdownFn {
    public operator fun invoke(): Hresult
}

public typealias Pfaxdevshutdown = PfaxdevshutdownFn?

public fun interface PfaxdevstartjobFn {
    public operator fun invoke(param0: UInt, param1: UInt, param2: MutPtr, param3: Handle, param4: ULong): Bool
}

public typealias Pfaxdevstartjob = PfaxdevstartjobFn?

public fun interface PfaxdevvirtualdevicecreationFn {
    public operator fun invoke(devicecount: MutPtr, devicenameprefix: Pwstr, deviceidprefix: MutPtr, completionport: Handle, completionkey: ULong): Bool
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
    public operator fun invoke(faxhandle: Handle, routinginfo: MutPtr, methodsreturned: MutPtr): Bool
}

public typealias Pfaxenumglobalroutinginfoa = PfaxenumglobalroutinginfoaFn?

public fun interface PfaxenumglobalroutinginfowFn {
    public operator fun invoke(faxhandle: Handle, routinginfo: MutPtr, methodsreturned: MutPtr): Bool
}

public typealias Pfaxenumglobalroutinginfow = PfaxenumglobalroutinginfowFn?

public fun interface PfaxenumjobsaFn {
    public operator fun invoke(faxhandle: Handle, jobentry: MutPtr, jobsreturned: MutPtr): Bool
}

public typealias Pfaxenumjobsa = PfaxenumjobsaFn?

public fun interface PfaxenumjobswFn {
    public operator fun invoke(faxhandle: Handle, jobentry: MutPtr, jobsreturned: MutPtr): Bool
}

public typealias Pfaxenumjobsw = PfaxenumjobswFn?

public fun interface PfaxenumportsaFn {
    public operator fun invoke(faxhandle: Handle, portinfo: MutPtr, portsreturned: MutPtr): Bool
}

public typealias Pfaxenumportsa = PfaxenumportsaFn?

public fun interface PfaxenumportswFn {
    public operator fun invoke(faxhandle: Handle, portinfo: MutPtr, portsreturned: MutPtr): Bool
}

public typealias Pfaxenumportsw = PfaxenumportswFn?

public fun interface PfaxenumroutingmethodsaFn {
    public operator fun invoke(faxporthandle: Handle, routingmethod: MutPtr, methodsreturned: MutPtr): Bool
}

public typealias Pfaxenumroutingmethodsa = PfaxenumroutingmethodsaFn?

public fun interface PfaxenumroutingmethodswFn {
    public operator fun invoke(faxporthandle: Handle, routingmethod: MutPtr, methodsreturned: MutPtr): Bool
}

public typealias Pfaxenumroutingmethodsw = PfaxenumroutingmethodswFn?

public fun interface PfaxfreebufferFn {
    public operator fun invoke(buffer: MutPtr)
}

public typealias Pfaxfreebuffer = PfaxfreebufferFn?

public fun interface PfaxgetconfigurationaFn {
    public operator fun invoke(faxhandle: Handle, faxconfig: MutPtr): Bool
}

public typealias Pfaxgetconfigurationa = PfaxgetconfigurationaFn?

public fun interface PfaxgetconfigurationwFn {
    public operator fun invoke(faxhandle: Handle, faxconfig: MutPtr): Bool
}

public typealias Pfaxgetconfigurationw = PfaxgetconfigurationwFn?

public fun interface PfaxgetdevicestatusaFn {
    public operator fun invoke(faxporthandle: Handle, devicestatus: MutPtr): Bool
}

public typealias Pfaxgetdevicestatusa = PfaxgetdevicestatusaFn?

public fun interface PfaxgetdevicestatuswFn {
    public operator fun invoke(faxporthandle: Handle, devicestatus: MutPtr): Bool
}

public typealias Pfaxgetdevicestatusw = PfaxgetdevicestatuswFn?

public fun interface PfaxgetjobaFn {
    public operator fun invoke(faxhandle: Handle, jobid: UInt, jobentry: MutPtr): Bool
}

public typealias Pfaxgetjoba = PfaxgetjobaFn?

public fun interface PfaxgetjobwFn {
    public operator fun invoke(faxhandle: Handle, jobid: UInt, jobentry: MutPtr): Bool
}

public typealias Pfaxgetjobw = PfaxgetjobwFn?

public fun interface PfaxgetloggingcategoriesaFn {
    public operator fun invoke(faxhandle: Handle, categories: MutPtr, numbercategories: MutPtr): Bool
}

public typealias Pfaxgetloggingcategoriesa = PfaxgetloggingcategoriesaFn?

public fun interface PfaxgetloggingcategorieswFn {
    public operator fun invoke(faxhandle: Handle, categories: MutPtr, numbercategories: MutPtr): Bool
}

public typealias Pfaxgetloggingcategoriesw = PfaxgetloggingcategorieswFn?

public fun interface PfaxgetpagedataFn {
    public operator fun invoke(faxhandle: Handle, jobid: UInt, buffer: MutPtr, buffersize: MutPtr, imagewidth: MutPtr, imageheight: MutPtr): Bool
}

public typealias Pfaxgetpagedata = PfaxgetpagedataFn?

public fun interface PfaxgetportaFn {
    public operator fun invoke(faxporthandle: Handle, portinfo: MutPtr): Bool
}

public typealias Pfaxgetporta = PfaxgetportaFn?

public fun interface PfaxgetportwFn {
    public operator fun invoke(faxporthandle: Handle, portinfo: MutPtr): Bool
}

public typealias Pfaxgetportw = PfaxgetportwFn?

public fun interface PfaxgetroutinginfoaFn {
    public operator fun invoke(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: MutPtr, routinginfobuffersize: MutPtr): Bool
}

public typealias Pfaxgetroutinginfoa = PfaxgetroutinginfoaFn?

public fun interface PfaxgetroutinginfowFn {
    public operator fun invoke(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: MutPtr, routinginfobuffersize: MutPtr): Bool
}

public typealias Pfaxgetroutinginfow = PfaxgetroutinginfowFn?

public fun interface PfaxinitializeeventqueueFn {
    public operator fun invoke(faxhandle: Handle, completionport: Handle, completionkey: ULong, hwnd: Hwnd, messagestart: UInt): Bool
}

public typealias Pfaxinitializeeventqueue = PfaxinitializeeventqueueFn?

public fun interface PfaxopenportFn {
    public operator fun invoke(faxhandle: Handle, deviceid: UInt, flags: UInt, faxporthandle: MutPtr): Bool
}

public typealias Pfaxopenport = PfaxopenportFn?

public fun interface PfaxprintcoverpageaFn {
    public operator fun invoke(faxcontextinfo: ConstPtr, coverpageinfo: ConstPtr): Bool
}

public typealias Pfaxprintcoverpagea = PfaxprintcoverpageaFn?

public fun interface PfaxprintcoverpagewFn {
    public operator fun invoke(faxcontextinfo: ConstPtr, coverpageinfo: ConstPtr): Bool
}

public typealias Pfaxprintcoverpagew = PfaxprintcoverpagewFn?

public fun interface PfaxregisterroutingextensionwFn {
    public operator fun invoke(faxhandle: Handle, extensionname: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, callback: PfaxRoutingInstallationCallbackw, context: ConstPtr): Bool
}

public typealias Pfaxregisterroutingextensionw = PfaxregisterroutingextensionwFn?

public fun interface PfaxregisterserviceproviderwFn {
    public operator fun invoke(deviceprovider: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, tspname: Pcwstr): Bool
}

public typealias Pfaxregisterserviceproviderw = PfaxregisterserviceproviderwFn?

public fun interface PfaxrouteaddfileFn {
    public operator fun invoke(jobid: UInt, filename: Pcwstr, guid: MutPtr): Int
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
    public operator fun invoke(jobid: UInt, guidowner: MutPtr, guidcaller: MutPtr, filename: Pcwstr, context: MutPtr): Bool
}

public typealias Pfaxrouteenumfile = PfaxrouteenumfileFn?

public fun interface PfaxrouteenumfilesFn {
    public operator fun invoke(jobid: UInt, guid: MutPtr, fileenumerator: Pfaxrouteenumfile, context: MutPtr): Bool
}

public typealias Pfaxrouteenumfiles = PfaxrouteenumfilesFn?

public fun interface PfaxroutegetfileFn {
    public operator fun invoke(jobid: UInt, index: UInt, filenamebuffer: Pwstr, requiredsize: MutPtr): Bool
}

public typealias Pfaxroutegetfile = PfaxroutegetfileFn?

public fun interface PfaxroutegetroutinginfoFn {
    public operator fun invoke(param0: Pcwstr, param1: UInt, param2: MutPtr, param3: MutPtr): Bool
}

public typealias Pfaxroutegetroutinginfo = PfaxroutegetroutinginfoFn?

public fun interface PfaxrouteinitializeFn {
    public operator fun invoke(param0: Handle, param1: MutPtr): Bool
}

public typealias Pfaxrouteinitialize = PfaxrouteinitializeFn?

public fun interface PfaxroutemethodFn {
    public operator fun invoke(param0: ConstPtr, param1: MutPtr, param2: MutPtr): Bool
}

public typealias Pfaxroutemethod = PfaxroutemethodFn?

public fun interface PfaxroutemodifyroutingdataFn {
    public operator fun invoke(jobid: UInt, routingguid: Pcwstr, routingdata: MutPtr, routingdatasize: UInt): Bool
}

public typealias Pfaxroutemodifyroutingdata = PfaxroutemodifyroutingdataFn?

public fun interface PfaxroutesetroutinginfoFn {
    public operator fun invoke(param0: Pcwstr, param1: UInt, param2: ConstPtr, param3: UInt): Bool
}

public typealias Pfaxroutesetroutinginfo = PfaxroutesetroutinginfoFn?

public fun interface PfaxsenddocumentaFn {
    public operator fun invoke(faxhandle: Handle, filename: Pcstr, jobparams: ConstPtr, coverpageinfo: ConstPtr, faxjobid: MutPtr): Bool
}

public typealias Pfaxsenddocumenta = PfaxsenddocumentaFn?

public fun interface PfaxsenddocumentforbroadcastaFn {
    public operator fun invoke(faxhandle: Handle, filename: Pcstr, faxjobid: MutPtr, faxrecipientcallback: PfaxRecipientCallbacka, context: ConstPtr): Bool
}

public typealias Pfaxsenddocumentforbroadcasta = PfaxsenddocumentforbroadcastaFn?

public fun interface PfaxsenddocumentforbroadcastwFn {
    public operator fun invoke(faxhandle: Handle, filename: Pcwstr, faxjobid: MutPtr, faxrecipientcallback: PfaxRecipientCallbackw, context: ConstPtr): Bool
}

public typealias Pfaxsenddocumentforbroadcastw = PfaxsenddocumentforbroadcastwFn?

public fun interface PfaxsenddocumentwFn {
    public operator fun invoke(faxhandle: Handle, filename: Pcwstr, jobparams: ConstPtr, coverpageinfo: ConstPtr, faxjobid: MutPtr): Bool
}

public typealias Pfaxsenddocumentw = PfaxsenddocumentwFn?

public fun interface PfaxsetconfigurationaFn {
    public operator fun invoke(faxhandle: Handle, faxconfig: ConstPtr): Bool
}

public typealias Pfaxsetconfigurationa = PfaxsetconfigurationaFn?

public fun interface PfaxsetconfigurationwFn {
    public operator fun invoke(faxhandle: Handle, faxconfig: ConstPtr): Bool
}

public typealias Pfaxsetconfigurationw = PfaxsetconfigurationwFn?

public fun interface PfaxsetglobalroutinginfoaFn {
    public operator fun invoke(faxporthandle: Handle, routinginfo: ConstPtr): Bool
}

public typealias Pfaxsetglobalroutinginfoa = PfaxsetglobalroutinginfoaFn?

public fun interface PfaxsetglobalroutinginfowFn {
    public operator fun invoke(faxporthandle: Handle, routinginfo: ConstPtr): Bool
}

public typealias Pfaxsetglobalroutinginfow = PfaxsetglobalroutinginfowFn?

public fun interface PfaxsetjobaFn {
    public operator fun invoke(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: ConstPtr): Bool
}

public typealias Pfaxsetjoba = PfaxsetjobaFn?

public fun interface PfaxsetjobwFn {
    public operator fun invoke(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: ConstPtr): Bool
}

public typealias Pfaxsetjobw = PfaxsetjobwFn?

public fun interface PfaxsetloggingcategoriesaFn {
    public operator fun invoke(faxhandle: Handle, categories: ConstPtr, numbercategories: UInt): Bool
}

public typealias Pfaxsetloggingcategoriesa = PfaxsetloggingcategoriesaFn?

public fun interface PfaxsetloggingcategorieswFn {
    public operator fun invoke(faxhandle: Handle, categories: ConstPtr, numbercategories: UInt): Bool
}

public typealias Pfaxsetloggingcategoriesw = PfaxsetloggingcategorieswFn?

public fun interface PfaxsetportaFn {
    public operator fun invoke(faxporthandle: Handle, portinfo: ConstPtr): Bool
}

public typealias Pfaxsetporta = PfaxsetportaFn?

public fun interface PfaxsetportwFn {
    public operator fun invoke(faxporthandle: Handle, portinfo: ConstPtr): Bool
}

public typealias Pfaxsetportw = PfaxsetportwFn?

public fun interface PfaxsetroutinginfoaFn {
    public operator fun invoke(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: ConstPtr, routinginfobuffersize: UInt): Bool
}

public typealias Pfaxsetroutinginfoa = PfaxsetroutinginfoaFn?

public fun interface PfaxsetroutinginfowFn {
    public operator fun invoke(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: ConstPtr, routinginfobuffersize: UInt): Bool
}

public typealias Pfaxsetroutinginfow = PfaxsetroutinginfowFn?

public fun interface PfaxstartprintjobaFn {
    public operator fun invoke(printername: Pcstr, printinfo: ConstPtr, faxjobid: MutPtr, faxcontextinfo: MutPtr): Bool
}

public typealias Pfaxstartprintjoba = PfaxstartprintjobaFn?

public fun interface PfaxstartprintjobwFn {
    public operator fun invoke(printername: Pcwstr, printinfo: ConstPtr, faxjobid: MutPtr, faxcontextinfo: MutPtr): Bool
}

public typealias Pfaxstartprintjobw = PfaxstartprintjobwFn?

public fun interface PfaxunregisterserviceproviderwFn {
    public operator fun invoke(deviceprovider: Pcwstr): Bool
}

public typealias Pfaxunregisterserviceproviderw = PfaxunregisterserviceproviderwFn?

public fun interface PfaxExtConfigChangeFn {
    public operator fun invoke(param0: UInt, param1: Pcwstr, param2: MutPtr, param3: UInt): Hresult
}

public typealias PfaxExtConfigChange = PfaxExtConfigChangeFn?

public fun interface PfaxExtFreeBufferFn {
    public operator fun invoke(param0: MutPtr)
}

public typealias PfaxExtFreeBuffer = PfaxExtFreeBufferFn?

public fun interface PfaxExtGetDataFn {
    public operator fun invoke(param0: UInt, param1: FaxEnumDeviceIdSource, param2: Pcwstr, param3: MutPtr, param4: MutPtr): UInt
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
    public operator fun invoke(param0: Hinstance, param1: UInt, param2: FaxEnumDeviceIdSource, param3: Pcwstr, param4: MutPtr, param5: UInt): UInt
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
    public operator fun invoke(faxhandle: Handle, recipientnumber: UInt, context: ConstPtr, jobparams: MutPtr, coverpageinfo: MutPtr): Bool
}

public typealias PfaxRecipientCallbacka = PfaxRecipientCallbackaFn?

public fun interface PfaxRecipientCallbackwFn {
    public operator fun invoke(faxhandle: Handle, recipientnumber: UInt, context: ConstPtr, jobparams: MutPtr, coverpageinfo: MutPtr): Bool
}

public typealias PfaxRecipientCallbackw = PfaxRecipientCallbackwFn?

public fun interface PfaxRoutingInstallationCallbackwFn {
    public operator fun invoke(faxhandle: Handle, context: ConstPtr, methodname: Pwstr, friendlyname: Pwstr, functionname: Pwstr, guid: Pwstr): Bool
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
