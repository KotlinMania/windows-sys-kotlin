package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.windowssys.COpaquePointer
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
    public operator fun invoke(jobparams: COpaquePointer?, coverpageinfo: COpaquePointer?): Bool
}

public typealias Pfaxcompletejobparamsa = PfaxcompletejobparamsaFn?

public fun interface PfaxcompletejobparamswFn {
    public operator fun invoke(jobparams: COpaquePointer?, coverpageinfo: COpaquePointer?): Bool
}

public typealias Pfaxcompletejobparamsw = PfaxcompletejobparamswFn?

public fun interface PfaxconnectfaxserveraFn {
    public operator fun invoke(machinename: Pcstr, faxhandle: COpaquePointer?): Bool
}

public typealias Pfaxconnectfaxservera = PfaxconnectfaxserveraFn?

public fun interface PfaxconnectfaxserverwFn {
    public operator fun invoke(machinename: Pcwstr, faxhandle: COpaquePointer?): Bool
}

public typealias Pfaxconnectfaxserverw = PfaxconnectfaxserverwFn?

public fun interface PfaxdevabortoperationFn {
    public operator fun invoke(param0: Handle): Bool
}

public typealias Pfaxdevabortoperation = PfaxdevabortoperationFn?

public fun interface PfaxdevconfigureFn {
    public operator fun invoke(param0: COpaquePointer?): Bool
}

public typealias Pfaxdevconfigure = PfaxdevconfigureFn?

public fun interface PfaxdevendjobFn {
    public operator fun invoke(param0: Handle): Bool
}

public typealias Pfaxdevendjob = PfaxdevendjobFn?

public fun interface PfaxdevinitializeFn {
    public operator fun invoke(param0: UInt, param1: Handle, param2: COpaquePointer?, param3: PfaxServiceCallback): Bool
}

public typealias Pfaxdevinitialize = PfaxdevinitializeFn?

public fun interface PfaxdevreceiveFn {
    public operator fun invoke(param0: Handle, param1: UInt, param2: COpaquePointer?): Bool
}

public typealias Pfaxdevreceive = PfaxdevreceiveFn?

public fun interface PfaxdevreportstatusFn {
    public operator fun invoke(param0: Handle, param1: COpaquePointer?, param2: UInt, param3: COpaquePointer?): Bool
}

public typealias Pfaxdevreportstatus = PfaxdevreportstatusFn?

public fun interface PfaxdevsendFn {
    public operator fun invoke(param0: Handle, param1: COpaquePointer?, param2: PfaxSendCallback): Bool
}

public typealias Pfaxdevsend = PfaxdevsendFn?

public fun interface PfaxdevshutdownFn {
    public operator fun invoke(): Hresult
}

public typealias Pfaxdevshutdown = PfaxdevshutdownFn?

public fun interface PfaxdevstartjobFn {
    public operator fun invoke(param0: UInt, param1: UInt, param2: COpaquePointer?, param3: Handle, param4: ULong): Bool
}

public typealias Pfaxdevstartjob = PfaxdevstartjobFn?

public fun interface PfaxdevvirtualdevicecreationFn {
    public operator fun invoke(devicecount: COpaquePointer?, devicenameprefix: Pwstr, deviceidprefix: COpaquePointer?, completionport: Handle, completionkey: ULong): Bool
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
    public operator fun invoke(faxhandle: Handle, routinginfo: COpaquePointer?, methodsreturned: COpaquePointer?): Bool
}

public typealias Pfaxenumglobalroutinginfoa = PfaxenumglobalroutinginfoaFn?

public fun interface PfaxenumglobalroutinginfowFn {
    public operator fun invoke(faxhandle: Handle, routinginfo: COpaquePointer?, methodsreturned: COpaquePointer?): Bool
}

public typealias Pfaxenumglobalroutinginfow = PfaxenumglobalroutinginfowFn?

public fun interface PfaxenumjobsaFn {
    public operator fun invoke(faxhandle: Handle, jobentry: COpaquePointer?, jobsreturned: COpaquePointer?): Bool
}

public typealias Pfaxenumjobsa = PfaxenumjobsaFn?

public fun interface PfaxenumjobswFn {
    public operator fun invoke(faxhandle: Handle, jobentry: COpaquePointer?, jobsreturned: COpaquePointer?): Bool
}

public typealias Pfaxenumjobsw = PfaxenumjobswFn?

public fun interface PfaxenumportsaFn {
    public operator fun invoke(faxhandle: Handle, portinfo: COpaquePointer?, portsreturned: COpaquePointer?): Bool
}

public typealias Pfaxenumportsa = PfaxenumportsaFn?

public fun interface PfaxenumportswFn {
    public operator fun invoke(faxhandle: Handle, portinfo: COpaquePointer?, portsreturned: COpaquePointer?): Bool
}

public typealias Pfaxenumportsw = PfaxenumportswFn?

public fun interface PfaxenumroutingmethodsaFn {
    public operator fun invoke(faxporthandle: Handle, routingmethod: COpaquePointer?, methodsreturned: COpaquePointer?): Bool
}

public typealias Pfaxenumroutingmethodsa = PfaxenumroutingmethodsaFn?

public fun interface PfaxenumroutingmethodswFn {
    public operator fun invoke(faxporthandle: Handle, routingmethod: COpaquePointer?, methodsreturned: COpaquePointer?): Bool
}

public typealias Pfaxenumroutingmethodsw = PfaxenumroutingmethodswFn?

public fun interface PfaxfreebufferFn {
    public operator fun invoke(buffer: COpaquePointer?)
}

public typealias Pfaxfreebuffer = PfaxfreebufferFn?

public fun interface PfaxgetconfigurationaFn {
    public operator fun invoke(faxhandle: Handle, faxconfig: COpaquePointer?): Bool
}

public typealias Pfaxgetconfigurationa = PfaxgetconfigurationaFn?

public fun interface PfaxgetconfigurationwFn {
    public operator fun invoke(faxhandle: Handle, faxconfig: COpaquePointer?): Bool
}

public typealias Pfaxgetconfigurationw = PfaxgetconfigurationwFn?

public fun interface PfaxgetdevicestatusaFn {
    public operator fun invoke(faxporthandle: Handle, devicestatus: COpaquePointer?): Bool
}

public typealias Pfaxgetdevicestatusa = PfaxgetdevicestatusaFn?

public fun interface PfaxgetdevicestatuswFn {
    public operator fun invoke(faxporthandle: Handle, devicestatus: COpaquePointer?): Bool
}

public typealias Pfaxgetdevicestatusw = PfaxgetdevicestatuswFn?

public fun interface PfaxgetjobaFn {
    public operator fun invoke(faxhandle: Handle, jobid: UInt, jobentry: COpaquePointer?): Bool
}

public typealias Pfaxgetjoba = PfaxgetjobaFn?

public fun interface PfaxgetjobwFn {
    public operator fun invoke(faxhandle: Handle, jobid: UInt, jobentry: COpaquePointer?): Bool
}

public typealias Pfaxgetjobw = PfaxgetjobwFn?

public fun interface PfaxgetloggingcategoriesaFn {
    public operator fun invoke(faxhandle: Handle, categories: COpaquePointer?, numbercategories: COpaquePointer?): Bool
}

public typealias Pfaxgetloggingcategoriesa = PfaxgetloggingcategoriesaFn?

public fun interface PfaxgetloggingcategorieswFn {
    public operator fun invoke(faxhandle: Handle, categories: COpaquePointer?, numbercategories: COpaquePointer?): Bool
}

public typealias Pfaxgetloggingcategoriesw = PfaxgetloggingcategorieswFn?

public fun interface PfaxgetpagedataFn {
    public operator fun invoke(faxhandle: Handle, jobid: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?, imagewidth: COpaquePointer?, imageheight: COpaquePointer?): Bool
}

public typealias Pfaxgetpagedata = PfaxgetpagedataFn?

public fun interface PfaxgetportaFn {
    public operator fun invoke(faxporthandle: Handle, portinfo: COpaquePointer?): Bool
}

public typealias Pfaxgetporta = PfaxgetportaFn?

public fun interface PfaxgetportwFn {
    public operator fun invoke(faxporthandle: Handle, portinfo: COpaquePointer?): Bool
}

public typealias Pfaxgetportw = PfaxgetportwFn?

public fun interface PfaxgetroutinginfoaFn {
    public operator fun invoke(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: COpaquePointer?, routinginfobuffersize: COpaquePointer?): Bool
}

public typealias Pfaxgetroutinginfoa = PfaxgetroutinginfoaFn?

public fun interface PfaxgetroutinginfowFn {
    public operator fun invoke(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: COpaquePointer?, routinginfobuffersize: COpaquePointer?): Bool
}

public typealias Pfaxgetroutinginfow = PfaxgetroutinginfowFn?

public fun interface PfaxinitializeeventqueueFn {
    public operator fun invoke(faxhandle: Handle, completionport: Handle, completionkey: ULong, hwnd: Hwnd, messagestart: UInt): Bool
}

public typealias Pfaxinitializeeventqueue = PfaxinitializeeventqueueFn?

public fun interface PfaxopenportFn {
    public operator fun invoke(faxhandle: Handle, deviceid: UInt, flags: UInt, faxporthandle: COpaquePointer?): Bool
}

public typealias Pfaxopenport = PfaxopenportFn?

public fun interface PfaxprintcoverpageaFn {
    public operator fun invoke(faxcontextinfo: COpaquePointer?, coverpageinfo: COpaquePointer?): Bool
}

public typealias Pfaxprintcoverpagea = PfaxprintcoverpageaFn?

public fun interface PfaxprintcoverpagewFn {
    public operator fun invoke(faxcontextinfo: COpaquePointer?, coverpageinfo: COpaquePointer?): Bool
}

public typealias Pfaxprintcoverpagew = PfaxprintcoverpagewFn?

public fun interface PfaxregisterroutingextensionwFn {
    public operator fun invoke(faxhandle: Handle, extensionname: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, callback: PfaxRoutingInstallationCallbackw, context: COpaquePointer?): Bool
}

public typealias Pfaxregisterroutingextensionw = PfaxregisterroutingextensionwFn?

public fun interface PfaxregisterserviceproviderwFn {
    public operator fun invoke(deviceprovider: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, tspname: Pcwstr): Bool
}

public typealias Pfaxregisterserviceproviderw = PfaxregisterserviceproviderwFn?

public fun interface PfaxrouteaddfileFn {
    public operator fun invoke(jobid: UInt, filename: Pcwstr, guid: COpaquePointer?): Int
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
    public operator fun invoke(jobid: UInt, guidowner: COpaquePointer?, guidcaller: COpaquePointer?, filename: Pcwstr, context: COpaquePointer?): Bool
}

public typealias Pfaxrouteenumfile = PfaxrouteenumfileFn?

public fun interface PfaxrouteenumfilesFn {
    public operator fun invoke(jobid: UInt, guid: COpaquePointer?, fileenumerator: Pfaxrouteenumfile, context: COpaquePointer?): Bool
}

public typealias Pfaxrouteenumfiles = PfaxrouteenumfilesFn?

public fun interface PfaxroutegetfileFn {
    public operator fun invoke(jobid: UInt, index: UInt, filenamebuffer: Pwstr, requiredsize: COpaquePointer?): Bool
}

public typealias Pfaxroutegetfile = PfaxroutegetfileFn?

public fun interface PfaxroutegetroutinginfoFn {
    public operator fun invoke(param0: Pcwstr, param1: UInt, param2: COpaquePointer?, param3: COpaquePointer?): Bool
}

public typealias Pfaxroutegetroutinginfo = PfaxroutegetroutinginfoFn?

public fun interface PfaxrouteinitializeFn {
    public operator fun invoke(param0: Handle, param1: COpaquePointer?): Bool
}

public typealias Pfaxrouteinitialize = PfaxrouteinitializeFn?

public fun interface PfaxroutemethodFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): Bool
}

public typealias Pfaxroutemethod = PfaxroutemethodFn?

public fun interface PfaxroutemodifyroutingdataFn {
    public operator fun invoke(jobid: UInt, routingguid: Pcwstr, routingdata: COpaquePointer?, routingdatasize: UInt): Bool
}

public typealias Pfaxroutemodifyroutingdata = PfaxroutemodifyroutingdataFn?

public fun interface PfaxroutesetroutinginfoFn {
    public operator fun invoke(param0: Pcwstr, param1: UInt, param2: COpaquePointer?, param3: UInt): Bool
}

public typealias Pfaxroutesetroutinginfo = PfaxroutesetroutinginfoFn?

public fun interface PfaxsenddocumentaFn {
    public operator fun invoke(faxhandle: Handle, filename: Pcstr, jobparams: COpaquePointer?, coverpageinfo: COpaquePointer?, faxjobid: COpaquePointer?): Bool
}

public typealias Pfaxsenddocumenta = PfaxsenddocumentaFn?

public fun interface PfaxsenddocumentforbroadcastaFn {
    public operator fun invoke(faxhandle: Handle, filename: Pcstr, faxjobid: COpaquePointer?, faxrecipientcallback: PfaxRecipientCallbacka, context: COpaquePointer?): Bool
}

public typealias Pfaxsenddocumentforbroadcasta = PfaxsenddocumentforbroadcastaFn?

public fun interface PfaxsenddocumentforbroadcastwFn {
    public operator fun invoke(faxhandle: Handle, filename: Pcwstr, faxjobid: COpaquePointer?, faxrecipientcallback: PfaxRecipientCallbackw, context: COpaquePointer?): Bool
}

public typealias Pfaxsenddocumentforbroadcastw = PfaxsenddocumentforbroadcastwFn?

public fun interface PfaxsenddocumentwFn {
    public operator fun invoke(faxhandle: Handle, filename: Pcwstr, jobparams: COpaquePointer?, coverpageinfo: COpaquePointer?, faxjobid: COpaquePointer?): Bool
}

public typealias Pfaxsenddocumentw = PfaxsenddocumentwFn?

public fun interface PfaxsetconfigurationaFn {
    public operator fun invoke(faxhandle: Handle, faxconfig: COpaquePointer?): Bool
}

public typealias Pfaxsetconfigurationa = PfaxsetconfigurationaFn?

public fun interface PfaxsetconfigurationwFn {
    public operator fun invoke(faxhandle: Handle, faxconfig: COpaquePointer?): Bool
}

public typealias Pfaxsetconfigurationw = PfaxsetconfigurationwFn?

public fun interface PfaxsetglobalroutinginfoaFn {
    public operator fun invoke(faxporthandle: Handle, routinginfo: COpaquePointer?): Bool
}

public typealias Pfaxsetglobalroutinginfoa = PfaxsetglobalroutinginfoaFn?

public fun interface PfaxsetglobalroutinginfowFn {
    public operator fun invoke(faxporthandle: Handle, routinginfo: COpaquePointer?): Bool
}

public typealias Pfaxsetglobalroutinginfow = PfaxsetglobalroutinginfowFn?

public fun interface PfaxsetjobaFn {
    public operator fun invoke(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: COpaquePointer?): Bool
}

public typealias Pfaxsetjoba = PfaxsetjobaFn?

public fun interface PfaxsetjobwFn {
    public operator fun invoke(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: COpaquePointer?): Bool
}

public typealias Pfaxsetjobw = PfaxsetjobwFn?

public fun interface PfaxsetloggingcategoriesaFn {
    public operator fun invoke(faxhandle: Handle, categories: COpaquePointer?, numbercategories: UInt): Bool
}

public typealias Pfaxsetloggingcategoriesa = PfaxsetloggingcategoriesaFn?

public fun interface PfaxsetloggingcategorieswFn {
    public operator fun invoke(faxhandle: Handle, categories: COpaquePointer?, numbercategories: UInt): Bool
}

public typealias Pfaxsetloggingcategoriesw = PfaxsetloggingcategorieswFn?

public fun interface PfaxsetportaFn {
    public operator fun invoke(faxporthandle: Handle, portinfo: COpaquePointer?): Bool
}

public typealias Pfaxsetporta = PfaxsetportaFn?

public fun interface PfaxsetportwFn {
    public operator fun invoke(faxporthandle: Handle, portinfo: COpaquePointer?): Bool
}

public typealias Pfaxsetportw = PfaxsetportwFn?

public fun interface PfaxsetroutinginfoaFn {
    public operator fun invoke(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: COpaquePointer?, routinginfobuffersize: UInt): Bool
}

public typealias Pfaxsetroutinginfoa = PfaxsetroutinginfoaFn?

public fun interface PfaxsetroutinginfowFn {
    public operator fun invoke(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: COpaquePointer?, routinginfobuffersize: UInt): Bool
}

public typealias Pfaxsetroutinginfow = PfaxsetroutinginfowFn?

public fun interface PfaxstartprintjobaFn {
    public operator fun invoke(printername: Pcstr, printinfo: COpaquePointer?, faxjobid: COpaquePointer?, faxcontextinfo: COpaquePointer?): Bool
}

public typealias Pfaxstartprintjoba = PfaxstartprintjobaFn?

public fun interface PfaxstartprintjobwFn {
    public operator fun invoke(printername: Pcwstr, printinfo: COpaquePointer?, faxjobid: COpaquePointer?, faxcontextinfo: COpaquePointer?): Bool
}

public typealias Pfaxstartprintjobw = PfaxstartprintjobwFn?

public fun interface PfaxunregisterserviceproviderwFn {
    public operator fun invoke(deviceprovider: Pcwstr): Bool
}

public typealias Pfaxunregisterserviceproviderw = PfaxunregisterserviceproviderwFn?

public fun interface PfaxExtConfigChangeFn {
    public operator fun invoke(param0: UInt, param1: Pcwstr, param2: COpaquePointer?, param3: UInt): Hresult
}

public typealias PfaxExtConfigChange = PfaxExtConfigChangeFn?

public fun interface PfaxExtFreeBufferFn {
    public operator fun invoke(param0: COpaquePointer?)
}

public typealias PfaxExtFreeBuffer = PfaxExtFreeBufferFn?

public fun interface PfaxExtGetDataFn {
    public operator fun invoke(param0: UInt, param1: FaxEnumDeviceIdSource, param2: Pcwstr, param3: COpaquePointer?, param4: COpaquePointer?): UInt
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
    public operator fun invoke(param0: Hinstance, param1: UInt, param2: FaxEnumDeviceIdSource, param3: Pcwstr, param4: COpaquePointer?, param5: UInt): UInt
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
    public operator fun invoke(faxhandle: Handle, recipientnumber: UInt, context: COpaquePointer?, jobparams: COpaquePointer?, coverpageinfo: COpaquePointer?): Bool
}

public typealias PfaxRecipientCallbacka = PfaxRecipientCallbackaFn?

public fun interface PfaxRecipientCallbackwFn {
    public operator fun invoke(faxhandle: Handle, recipientnumber: UInt, context: COpaquePointer?, jobparams: COpaquePointer?, coverpageinfo: COpaquePointer?): Bool
}

public typealias PfaxRecipientCallbackw = PfaxRecipientCallbackwFn?

public fun interface PfaxRoutingInstallationCallbackwFn {
    public operator fun invoke(faxhandle: Handle, context: COpaquePointer?, methodname: Pwstr, friendlyname: Pwstr, functionname: Pwstr, guid: Pwstr): Bool
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
