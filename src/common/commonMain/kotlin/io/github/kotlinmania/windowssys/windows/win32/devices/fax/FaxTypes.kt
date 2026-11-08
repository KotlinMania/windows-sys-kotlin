package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public typealias FAXROUTE_ENABLE = Int

public typealias FAX_ACCESS_RIGHTS_ENUM = Int

public typealias FAX_ACCESS_RIGHTS_ENUM_2 = Int

public typealias FAX_ACCOUNT_EVENTS_TYPE_ENUM = Int

public typealias FAX_COVERPAGE_TYPE_ENUM = Int

public typealias FAX_DEVICE_RECEIVE_MODE_ENUM = Int

public typealias FAX_ENUM_DELIVERY_REPORT_TYPES = Int

public typealias FAX_ENUM_DEVICE_ID_SOURCE = Int

public typealias FAX_ENUM_JOB_COMMANDS = Int

public typealias FAX_ENUM_JOB_SEND_ATTRIBUTES = Int

public typealias FAX_ENUM_LOG_CATEGORIES = Int

public typealias FAX_ENUM_LOG_LEVELS = Int

public typealias FAX_ENUM_PORT_OPEN_TYPE = Int

public typealias FAX_GROUP_STATUS_ENUM = Int

public typealias FAX_JOB_EXTENDED_STATUS_ENUM = Int

public typealias FAX_JOB_OPERATIONS_ENUM = Int

public typealias FAX_JOB_STATUS_ENUM = Int

public typealias FAX_JOB_TYPE_ENUM = Int

public typealias FAX_LOG_LEVEL_ENUM = Int

public typealias FAX_PRIORITY_TYPE_ENUM = Int

public typealias FAX_PROVIDER_STATUS_ENUM = Int

public typealias FAX_RECEIPT_TYPE_ENUM = Int

public typealias FAX_ROUTING_RULE_CODE_ENUM = Int

public typealias FAX_RULE_STATUS_ENUM = Int

public typealias FAX_SCHEDULE_TYPE_ENUM = Int

public typealias FAX_SERVER_APIVERSION_ENUM = Int

public typealias FAX_SERVER_EVENTS_TYPE_ENUM = Int

public typealias FAX_SMTP_AUTHENTICATION_TYPE_ENUM = Int

public fun interface PFAXABORTFn {
    public operator fun invoke(faxhandle: HANDLE, jobid: UInt): BOOL
}

public typealias PFAXABORT = PFAXABORTFn?

public fun interface PFAXACCESSCHECKFn {
    public operator fun invoke(faxhandle: HANDLE, accessmask: UInt): BOOL
}

public typealias PFAXACCESSCHECK = PFAXACCESSCHECKFn?

public fun interface PFAXCLOSEFn {
    public operator fun invoke(faxhandle: HANDLE): BOOL
}

public typealias PFAXCLOSE = PFAXCLOSEFn?

public fun interface PFAXCOMPLETEJOBPARAMSAFn {
    public operator fun invoke(jobparams: Long, coverpageinfo: Long): BOOL
}

public typealias PFAXCOMPLETEJOBPARAMSA = PFAXCOMPLETEJOBPARAMSAFn?

public fun interface PFAXCOMPLETEJOBPARAMSWFn {
    public operator fun invoke(jobparams: Long, coverpageinfo: Long): BOOL
}

public typealias PFAXCOMPLETEJOBPARAMSW = PFAXCOMPLETEJOBPARAMSWFn?

public fun interface PFAXCONNECTFAXSERVERAFn {
    public operator fun invoke(machinename: PCSTR, faxhandle: Long): BOOL
}

public typealias PFAXCONNECTFAXSERVERA = PFAXCONNECTFAXSERVERAFn?

public fun interface PFAXCONNECTFAXSERVERWFn {
    public operator fun invoke(machinename: PCWSTR, faxhandle: Long): BOOL
}

public typealias PFAXCONNECTFAXSERVERW = PFAXCONNECTFAXSERVERWFn?

public fun interface PFAXDEVABORTOPERATIONFn {
    public operator fun invoke(param0: HANDLE): BOOL
}

public typealias PFAXDEVABORTOPERATION = PFAXDEVABORTOPERATIONFn?

public fun interface PFAXDEVCONFIGUREFn {
    public operator fun invoke(param0: Long): BOOL
}

public typealias PFAXDEVCONFIGURE = PFAXDEVCONFIGUREFn?

public fun interface PFAXDEVENDJOBFn {
    public operator fun invoke(param0: HANDLE): BOOL
}

public typealias PFAXDEVENDJOB = PFAXDEVENDJOBFn?

public fun interface PFAXDEVINITIALIZEFn {
    public operator fun invoke(param0: UInt, param1: HANDLE, param2: Long, param3: PFAX_SERVICE_CALLBACK): BOOL
}

public typealias PFAXDEVINITIALIZE = PFAXDEVINITIALIZEFn?

public fun interface PFAXDEVRECEIVEFn {
    public operator fun invoke(param0: HANDLE, param1: UInt, param2: Long): BOOL
}

public typealias PFAXDEVRECEIVE = PFAXDEVRECEIVEFn?

public fun interface PFAXDEVREPORTSTATUSFn {
    public operator fun invoke(param0: HANDLE, param1: Long, param2: UInt, param3: Long): BOOL
}

public typealias PFAXDEVREPORTSTATUS = PFAXDEVREPORTSTATUSFn?

public fun interface PFAXDEVSENDFn {
    public operator fun invoke(param0: HANDLE, param1: Long, param2: PFAX_SEND_CALLBACK): BOOL
}

public typealias PFAXDEVSEND = PFAXDEVSENDFn?

public fun interface PFAXDEVSHUTDOWNFn {
    public operator fun invoke(): HRESULT
}

public typealias PFAXDEVSHUTDOWN = PFAXDEVSHUTDOWNFn?

public fun interface PFAXDEVSTARTJOBFn {
    public operator fun invoke(param0: UInt, param1: UInt, param2: Long, param3: HANDLE, param4: ULong): BOOL
}

public typealias PFAXDEVSTARTJOB = PFAXDEVSTARTJOBFn?

public fun interface PFAXDEVVIRTUALDEVICECREATIONFn {
    public operator fun invoke(devicecount: Long, devicenameprefix: PWSTR, deviceidprefix: Long, completionport: HANDLE, completionkey: ULong): BOOL
}

public typealias PFAXDEVVIRTUALDEVICECREATION = PFAXDEVVIRTUALDEVICECREATIONFn?

public fun interface PFAXENABLEROUTINGMETHODAFn {
    public operator fun invoke(faxporthandle: HANDLE, routingguid: PCSTR, enabled: BOOL): BOOL
}

public typealias PFAXENABLEROUTINGMETHODA = PFAXENABLEROUTINGMETHODAFn?

public fun interface PFAXENABLEROUTINGMETHODWFn {
    public operator fun invoke(faxporthandle: HANDLE, routingguid: PCWSTR, enabled: BOOL): BOOL
}

public typealias PFAXENABLEROUTINGMETHODW = PFAXENABLEROUTINGMETHODWFn?

public fun interface PFAXENUMGLOBALROUTINGINFOAFn {
    public operator fun invoke(faxhandle: HANDLE, routinginfo: Long, methodsreturned: Long): BOOL
}

public typealias PFAXENUMGLOBALROUTINGINFOA = PFAXENUMGLOBALROUTINGINFOAFn?

public fun interface PFAXENUMGLOBALROUTINGINFOWFn {
    public operator fun invoke(faxhandle: HANDLE, routinginfo: Long, methodsreturned: Long): BOOL
}

public typealias PFAXENUMGLOBALROUTINGINFOW = PFAXENUMGLOBALROUTINGINFOWFn?

public fun interface PFAXENUMJOBSAFn {
    public operator fun invoke(faxhandle: HANDLE, jobentry: Long, jobsreturned: Long): BOOL
}

public typealias PFAXENUMJOBSA = PFAXENUMJOBSAFn?

public fun interface PFAXENUMJOBSWFn {
    public operator fun invoke(faxhandle: HANDLE, jobentry: Long, jobsreturned: Long): BOOL
}

public typealias PFAXENUMJOBSW = PFAXENUMJOBSWFn?

public fun interface PFAXENUMPORTSAFn {
    public operator fun invoke(faxhandle: HANDLE, portinfo: Long, portsreturned: Long): BOOL
}

public typealias PFAXENUMPORTSA = PFAXENUMPORTSAFn?

public fun interface PFAXENUMPORTSWFn {
    public operator fun invoke(faxhandle: HANDLE, portinfo: Long, portsreturned: Long): BOOL
}

public typealias PFAXENUMPORTSW = PFAXENUMPORTSWFn?

public fun interface PFAXENUMROUTINGMETHODSAFn {
    public operator fun invoke(faxporthandle: HANDLE, routingmethod: Long, methodsreturned: Long): BOOL
}

public typealias PFAXENUMROUTINGMETHODSA = PFAXENUMROUTINGMETHODSAFn?

public fun interface PFAXENUMROUTINGMETHODSWFn {
    public operator fun invoke(faxporthandle: HANDLE, routingmethod: Long, methodsreturned: Long): BOOL
}

public typealias PFAXENUMROUTINGMETHODSW = PFAXENUMROUTINGMETHODSWFn?

public fun interface PFAXFREEBUFFERFn {
    public operator fun invoke(buffer: Long)
}

public typealias PFAXFREEBUFFER = PFAXFREEBUFFERFn?

public fun interface PFAXGETCONFIGURATIONAFn {
    public operator fun invoke(faxhandle: HANDLE, faxconfig: Long): BOOL
}

public typealias PFAXGETCONFIGURATIONA = PFAXGETCONFIGURATIONAFn?

public fun interface PFAXGETCONFIGURATIONWFn {
    public operator fun invoke(faxhandle: HANDLE, faxconfig: Long): BOOL
}

public typealias PFAXGETCONFIGURATIONW = PFAXGETCONFIGURATIONWFn?

public fun interface PFAXGETDEVICESTATUSAFn {
    public operator fun invoke(faxporthandle: HANDLE, devicestatus: Long): BOOL
}

public typealias PFAXGETDEVICESTATUSA = PFAXGETDEVICESTATUSAFn?

public fun interface PFAXGETDEVICESTATUSWFn {
    public operator fun invoke(faxporthandle: HANDLE, devicestatus: Long): BOOL
}

public typealias PFAXGETDEVICESTATUSW = PFAXGETDEVICESTATUSWFn?

public fun interface PFAXGETJOBAFn {
    public operator fun invoke(faxhandle: HANDLE, jobid: UInt, jobentry: Long): BOOL
}

public typealias PFAXGETJOBA = PFAXGETJOBAFn?

public fun interface PFAXGETJOBWFn {
    public operator fun invoke(faxhandle: HANDLE, jobid: UInt, jobentry: Long): BOOL
}

public typealias PFAXGETJOBW = PFAXGETJOBWFn?

public fun interface PFAXGETLOGGINGCATEGORIESAFn {
    public operator fun invoke(faxhandle: HANDLE, categories: Long, numbercategories: Long): BOOL
}

public typealias PFAXGETLOGGINGCATEGORIESA = PFAXGETLOGGINGCATEGORIESAFn?

public fun interface PFAXGETLOGGINGCATEGORIESWFn {
    public operator fun invoke(faxhandle: HANDLE, categories: Long, numbercategories: Long): BOOL
}

public typealias PFAXGETLOGGINGCATEGORIESW = PFAXGETLOGGINGCATEGORIESWFn?

public fun interface PFAXGETPAGEDATAFn {
    public operator fun invoke(faxhandle: HANDLE, jobid: UInt, buffer: Long, buffersize: Long, imagewidth: Long, imageheight: Long): BOOL
}

public typealias PFAXGETPAGEDATA = PFAXGETPAGEDATAFn?

public fun interface PFAXGETPORTAFn {
    public operator fun invoke(faxporthandle: HANDLE, portinfo: Long): BOOL
}

public typealias PFAXGETPORTA = PFAXGETPORTAFn?

public fun interface PFAXGETPORTWFn {
    public operator fun invoke(faxporthandle: HANDLE, portinfo: Long): BOOL
}

public typealias PFAXGETPORTW = PFAXGETPORTWFn?

public fun interface PFAXGETROUTINGINFOAFn {
    public operator fun invoke(faxporthandle: HANDLE, routingguid: PCSTR, routinginfobuffer: Long, routinginfobuffersize: Long): BOOL
}

public typealias PFAXGETROUTINGINFOA = PFAXGETROUTINGINFOAFn?

public fun interface PFAXGETROUTINGINFOWFn {
    public operator fun invoke(faxporthandle: HANDLE, routingguid: PCWSTR, routinginfobuffer: Long, routinginfobuffersize: Long): BOOL
}

public typealias PFAXGETROUTINGINFOW = PFAXGETROUTINGINFOWFn?

public fun interface PFAXINITIALIZEEVENTQUEUEFn {
    public operator fun invoke(faxhandle: HANDLE, completionport: HANDLE, completionkey: ULong, hwnd: HWND, messagestart: UInt): BOOL
}

public typealias PFAXINITIALIZEEVENTQUEUE = PFAXINITIALIZEEVENTQUEUEFn?

public fun interface PFAXOPENPORTFn {
    public operator fun invoke(faxhandle: HANDLE, deviceid: UInt, flags: UInt, faxporthandle: Long): BOOL
}

public typealias PFAXOPENPORT = PFAXOPENPORTFn?

public fun interface PFAXPRINTCOVERPAGEAFn {
    public operator fun invoke(faxcontextinfo: Long, coverpageinfo: Long): BOOL
}

public typealias PFAXPRINTCOVERPAGEA = PFAXPRINTCOVERPAGEAFn?

public fun interface PFAXPRINTCOVERPAGEWFn {
    public operator fun invoke(faxcontextinfo: Long, coverpageinfo: Long): BOOL
}

public typealias PFAXPRINTCOVERPAGEW = PFAXPRINTCOVERPAGEWFn?

public fun interface PFAXREGISTERROUTINGEXTENSIONWFn {
    public operator fun invoke(faxhandle: HANDLE, extensionname: PCWSTR, friendlyname: PCWSTR, imagename: PCWSTR, callback: PFAX_ROUTING_INSTALLATION_CALLBACKW, context: Long): BOOL
}

public typealias PFAXREGISTERROUTINGEXTENSIONW = PFAXREGISTERROUTINGEXTENSIONWFn?

public fun interface PFAXREGISTERSERVICEPROVIDERWFn {
    public operator fun invoke(deviceprovider: PCWSTR, friendlyname: PCWSTR, imagename: PCWSTR, tspname: PCWSTR): BOOL
}

public typealias PFAXREGISTERSERVICEPROVIDERW = PFAXREGISTERSERVICEPROVIDERWFn?

public fun interface PFAXROUTEADDFILEFn {
    public operator fun invoke(jobid: UInt, filename: PCWSTR, guid: Long): Int
}

public typealias PFAXROUTEADDFILE = PFAXROUTEADDFILEFn?

public fun interface PFAXROUTEDELETEFILEFn {
    public operator fun invoke(jobid: UInt, filename: PCWSTR): Int
}

public typealias PFAXROUTEDELETEFILE = PFAXROUTEDELETEFILEFn?

public fun interface PFAXROUTEDEVICECHANGENOTIFICATIONFn {
    public operator fun invoke(param0: UInt, param1: BOOL): BOOL
}

public typealias PFAXROUTEDEVICECHANGENOTIFICATION = PFAXROUTEDEVICECHANGENOTIFICATIONFn?

public fun interface PFAXROUTEDEVICEENABLEFn {
    public operator fun invoke(param0: PCWSTR, param1: UInt, param2: Int): BOOL
}

public typealias PFAXROUTEDEVICEENABLE = PFAXROUTEDEVICEENABLEFn?

public fun interface PFAXROUTEENUMFILEFn {
    public operator fun invoke(jobid: UInt, guidowner: Long, guidcaller: Long, filename: PCWSTR, context: Long): BOOL
}

public typealias PFAXROUTEENUMFILE = PFAXROUTEENUMFILEFn?

public fun interface PFAXROUTEENUMFILESFn {
    public operator fun invoke(jobid: UInt, guid: Long, fileenumerator: PFAXROUTEENUMFILE, context: Long): BOOL
}

public typealias PFAXROUTEENUMFILES = PFAXROUTEENUMFILESFn?

public fun interface PFAXROUTEGETFILEFn {
    public operator fun invoke(jobid: UInt, index: UInt, filenamebuffer: PWSTR, requiredsize: Long): BOOL
}

public typealias PFAXROUTEGETFILE = PFAXROUTEGETFILEFn?

public fun interface PFAXROUTEGETROUTINGINFOFn {
    public operator fun invoke(param0: PCWSTR, param1: UInt, param2: Long, param3: Long): BOOL
}

public typealias PFAXROUTEGETROUTINGINFO = PFAXROUTEGETROUTINGINFOFn?

public fun interface PFAXROUTEINITIALIZEFn {
    public operator fun invoke(param0: HANDLE, param1: Long): BOOL
}

public typealias PFAXROUTEINITIALIZE = PFAXROUTEINITIALIZEFn?

public fun interface PFAXROUTEMETHODFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long): BOOL
}

public typealias PFAXROUTEMETHOD = PFAXROUTEMETHODFn?

public fun interface PFAXROUTEMODIFYROUTINGDATAFn {
    public operator fun invoke(jobid: UInt, routingguid: PCWSTR, routingdata: Long, routingdatasize: UInt): BOOL
}

public typealias PFAXROUTEMODIFYROUTINGDATA = PFAXROUTEMODIFYROUTINGDATAFn?

public fun interface PFAXROUTESETROUTINGINFOFn {
    public operator fun invoke(param0: PCWSTR, param1: UInt, param2: Long, param3: UInt): BOOL
}

public typealias PFAXROUTESETROUTINGINFO = PFAXROUTESETROUTINGINFOFn?

public fun interface PFAXSENDDOCUMENTAFn {
    public operator fun invoke(faxhandle: HANDLE, filename: PCSTR, jobparams: Long, coverpageinfo: Long, faxjobid: Long): BOOL
}

public typealias PFAXSENDDOCUMENTA = PFAXSENDDOCUMENTAFn?

public fun interface PFAXSENDDOCUMENTFORBROADCASTAFn {
    public operator fun invoke(faxhandle: HANDLE, filename: PCSTR, faxjobid: Long, faxrecipientcallback: PFAX_RECIPIENT_CALLBACKA, context: Long): BOOL
}

public typealias PFAXSENDDOCUMENTFORBROADCASTA = PFAXSENDDOCUMENTFORBROADCASTAFn?

public fun interface PFAXSENDDOCUMENTFORBROADCASTWFn {
    public operator fun invoke(faxhandle: HANDLE, filename: PCWSTR, faxjobid: Long, faxrecipientcallback: PFAX_RECIPIENT_CALLBACKW, context: Long): BOOL
}

public typealias PFAXSENDDOCUMENTFORBROADCASTW = PFAXSENDDOCUMENTFORBROADCASTWFn?

public fun interface PFAXSENDDOCUMENTWFn {
    public operator fun invoke(faxhandle: HANDLE, filename: PCWSTR, jobparams: Long, coverpageinfo: Long, faxjobid: Long): BOOL
}

public typealias PFAXSENDDOCUMENTW = PFAXSENDDOCUMENTWFn?

public fun interface PFAXSETCONFIGURATIONAFn {
    public operator fun invoke(faxhandle: HANDLE, faxconfig: Long): BOOL
}

public typealias PFAXSETCONFIGURATIONA = PFAXSETCONFIGURATIONAFn?

public fun interface PFAXSETCONFIGURATIONWFn {
    public operator fun invoke(faxhandle: HANDLE, faxconfig: Long): BOOL
}

public typealias PFAXSETCONFIGURATIONW = PFAXSETCONFIGURATIONWFn?

public fun interface PFAXSETGLOBALROUTINGINFOAFn {
    public operator fun invoke(faxporthandle: HANDLE, routinginfo: Long): BOOL
}

public typealias PFAXSETGLOBALROUTINGINFOA = PFAXSETGLOBALROUTINGINFOAFn?

public fun interface PFAXSETGLOBALROUTINGINFOWFn {
    public operator fun invoke(faxporthandle: HANDLE, routinginfo: Long): BOOL
}

public typealias PFAXSETGLOBALROUTINGINFOW = PFAXSETGLOBALROUTINGINFOWFn?

public fun interface PFAXSETJOBAFn {
    public operator fun invoke(faxhandle: HANDLE, jobid: UInt, command: UInt, jobentry: Long): BOOL
}

public typealias PFAXSETJOBA = PFAXSETJOBAFn?

public fun interface PFAXSETJOBWFn {
    public operator fun invoke(faxhandle: HANDLE, jobid: UInt, command: UInt, jobentry: Long): BOOL
}

public typealias PFAXSETJOBW = PFAXSETJOBWFn?

public fun interface PFAXSETLOGGINGCATEGORIESAFn {
    public operator fun invoke(faxhandle: HANDLE, categories: Long, numbercategories: UInt): BOOL
}

public typealias PFAXSETLOGGINGCATEGORIESA = PFAXSETLOGGINGCATEGORIESAFn?

public fun interface PFAXSETLOGGINGCATEGORIESWFn {
    public operator fun invoke(faxhandle: HANDLE, categories: Long, numbercategories: UInt): BOOL
}

public typealias PFAXSETLOGGINGCATEGORIESW = PFAXSETLOGGINGCATEGORIESWFn?

public fun interface PFAXSETPORTAFn {
    public operator fun invoke(faxporthandle: HANDLE, portinfo: Long): BOOL
}

public typealias PFAXSETPORTA = PFAXSETPORTAFn?

public fun interface PFAXSETPORTWFn {
    public operator fun invoke(faxporthandle: HANDLE, portinfo: Long): BOOL
}

public typealias PFAXSETPORTW = PFAXSETPORTWFn?

public fun interface PFAXSETROUTINGINFOAFn {
    public operator fun invoke(faxporthandle: HANDLE, routingguid: PCSTR, routinginfobuffer: Long, routinginfobuffersize: UInt): BOOL
}

public typealias PFAXSETROUTINGINFOA = PFAXSETROUTINGINFOAFn?

public fun interface PFAXSETROUTINGINFOWFn {
    public operator fun invoke(faxporthandle: HANDLE, routingguid: PCWSTR, routinginfobuffer: Long, routinginfobuffersize: UInt): BOOL
}

public typealias PFAXSETROUTINGINFOW = PFAXSETROUTINGINFOWFn?

public fun interface PFAXSTARTPRINTJOBAFn {
    public operator fun invoke(printername: PCSTR, printinfo: Long, faxjobid: Long, faxcontextinfo: Long): BOOL
}

public typealias PFAXSTARTPRINTJOBA = PFAXSTARTPRINTJOBAFn?

public fun interface PFAXSTARTPRINTJOBWFn {
    public operator fun invoke(printername: PCWSTR, printinfo: Long, faxjobid: Long, faxcontextinfo: Long): BOOL
}

public typealias PFAXSTARTPRINTJOBW = PFAXSTARTPRINTJOBWFn?

public fun interface PFAXUNREGISTERSERVICEPROVIDERWFn {
    public operator fun invoke(deviceprovider: PCWSTR): BOOL
}

public typealias PFAXUNREGISTERSERVICEPROVIDERW = PFAXUNREGISTERSERVICEPROVIDERWFn?

public fun interface PFAX_EXT_CONFIG_CHANGEFn {
    public operator fun invoke(param0: UInt, param1: PCWSTR, param2: Long, param3: UInt): HRESULT
}

public typealias PFAX_EXT_CONFIG_CHANGE = PFAX_EXT_CONFIG_CHANGEFn?

public fun interface PFAX_EXT_FREE_BUFFERFn {
    public operator fun invoke(param0: Long)
}

public typealias PFAX_EXT_FREE_BUFFER = PFAX_EXT_FREE_BUFFERFn?

public fun interface PFAX_EXT_GET_DATAFn {
    public operator fun invoke(param0: UInt, param1: FAX_ENUM_DEVICE_ID_SOURCE, param2: PCWSTR, param3: Long, param4: Long): UInt
}

public typealias PFAX_EXT_GET_DATA = PFAX_EXT_GET_DATAFn?

public fun interface PFAX_EXT_INITIALIZE_CONFIGFn {
    public operator fun invoke(param0: PFAX_EXT_GET_DATA, param1: PFAX_EXT_SET_DATA, param2: PFAX_EXT_REGISTER_FOR_EVENTS, param3: PFAX_EXT_UNREGISTER_FOR_EVENTS, param4: PFAX_EXT_FREE_BUFFER): HRESULT
}

public typealias PFAX_EXT_INITIALIZE_CONFIG = PFAX_EXT_INITIALIZE_CONFIGFn?

public fun interface PFAX_EXT_REGISTER_FOR_EVENTSFn {
    public operator fun invoke(param0: HINSTANCE, param1: UInt, param2: FAX_ENUM_DEVICE_ID_SOURCE, param3: PCWSTR, param4: PFAX_EXT_CONFIG_CHANGE): HANDLE
}

public typealias PFAX_EXT_REGISTER_FOR_EVENTS = PFAX_EXT_REGISTER_FOR_EVENTSFn?

public fun interface PFAX_EXT_SET_DATAFn {
    public operator fun invoke(param0: HINSTANCE, param1: UInt, param2: FAX_ENUM_DEVICE_ID_SOURCE, param3: PCWSTR, param4: Long, param5: UInt): UInt
}

public typealias PFAX_EXT_SET_DATA = PFAX_EXT_SET_DATAFn?

public fun interface PFAX_EXT_UNREGISTER_FOR_EVENTSFn {
    public operator fun invoke(param0: HANDLE): UInt
}

public typealias PFAX_EXT_UNREGISTER_FOR_EVENTS = PFAX_EXT_UNREGISTER_FOR_EVENTSFn?

public fun interface PFAX_LINECALLBACKFn {
    public operator fun invoke(faxhandle: HANDLE, hdevice: UInt, dwmessage: UInt, dwinstance: ULong, dwparam1: ULong, dwparam2: ULong, dwparam3: ULong)
}

public typealias PFAX_LINECALLBACK = PFAX_LINECALLBACKFn?

public fun interface PFAX_RECIPIENT_CALLBACKAFn {
    public operator fun invoke(faxhandle: HANDLE, recipientnumber: UInt, context: Long, jobparams: Long, coverpageinfo: Long): BOOL
}

public typealias PFAX_RECIPIENT_CALLBACKA = PFAX_RECIPIENT_CALLBACKAFn?

public fun interface PFAX_RECIPIENT_CALLBACKWFn {
    public operator fun invoke(faxhandle: HANDLE, recipientnumber: UInt, context: Long, jobparams: Long, coverpageinfo: Long): BOOL
}

public typealias PFAX_RECIPIENT_CALLBACKW = PFAX_RECIPIENT_CALLBACKWFn?

public fun interface PFAX_ROUTING_INSTALLATION_CALLBACKWFn {
    public operator fun invoke(faxhandle: HANDLE, context: Long, methodname: PWSTR, friendlyname: PWSTR, functionname: PWSTR, guid: PWSTR): BOOL
}

public typealias PFAX_ROUTING_INSTALLATION_CALLBACKW = PFAX_ROUTING_INSTALLATION_CALLBACKWFn?

public fun interface PFAX_SEND_CALLBACKFn {
    public operator fun invoke(faxhandle: HANDLE, callhandle: UInt, reserved1: UInt, reserved2: UInt): BOOL
}

public typealias PFAX_SEND_CALLBACK = PFAX_SEND_CALLBACKFn?

public fun interface PFAX_SERVICE_CALLBACKFn {
    public operator fun invoke(faxhandle: HANDLE, deviceid: UInt, param1: ULong, param2: ULong, param3: ULong): BOOL
}

public typealias PFAX_SERVICE_CALLBACK = PFAX_SERVICE_CALLBACKFn?

public typealias STI_DEVICE_MJ_TYPE = Int

public typealias SendToMode = Int
