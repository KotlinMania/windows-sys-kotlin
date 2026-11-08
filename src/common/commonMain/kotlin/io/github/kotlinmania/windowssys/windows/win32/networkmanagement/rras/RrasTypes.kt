package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public typealias HRASCONN = Long

public typealias IKEV2_ID_PAYLOAD_TYPE = Int

public typealias MGM_ENUM_TYPES = Int

public typealias MPRAPI_OBJECT_TYPE = Int

public typealias MPR_ET = UInt

public typealias MPR_INTERFACE_DIAL_MODE = UInt

public typealias MPR_VPN_TS_TYPE = Int

public typealias MPR_VS = UInt

public fun interface ORASADFUNCFn {
    public operator fun invoke(param0: HWND, param1: PCSTR, param2: UInt, param3: Long): BOOL
}

public typealias ORASADFUNC = ORASADFUNCFn?

public fun interface PFNRASFREEBUFFERFn {
    public operator fun invoke(pbufer: Long): UInt
}

public typealias PFNRASFREEBUFFER = PFNRASFREEBUFFERFn?

public fun interface PFNRASGETBUFFERFn {
    public operator fun invoke(ppbuffer: Long, pdwsize: Long): UInt
}

public typealias PFNRASGETBUFFER = PFNRASGETBUFFERFn?

public fun interface PFNRASRECEIVEBUFFERFn {
    public operator fun invoke(hport: HANDLE, pbuffer: Long, pdwsize: Long, dwtimeout: UInt, hevent: HANDLE): UInt
}

public typealias PFNRASRECEIVEBUFFER = PFNRASRECEIVEBUFFERFn?

public fun interface PFNRASRETRIEVEBUFFERFn {
    public operator fun invoke(hport: HANDLE, pbuffer: Long, pdwsize: Long): UInt
}

public typealias PFNRASRETRIEVEBUFFER = PFNRASRETRIEVEBUFFERFn?

public fun interface PFNRASSENDBUFFERFn {
    public operator fun invoke(hport: HANDLE, pbuffer: Long, dwsize: UInt): UInt
}

public typealias PFNRASSENDBUFFER = PFNRASSENDBUFFERFn?

public fun interface PFNRASSETCOMMSETTINGSFn {
    public operator fun invoke(hport: HANDLE, prascommsettings: Long, pvreserved: Long): UInt
}

public typealias PFNRASSETCOMMSETTINGS = PFNRASSETCOMMSETTINGSFn?

public fun interface PMGM_CREATION_ALERT_CALLBACKFn {
    public operator fun invoke(dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwinifindex: UInt, dwinifnexthopaddr: UInt, dwifcount: UInt, pmieoutiflist: Long): UInt
}

public typealias PMGM_CREATION_ALERT_CALLBACK = PMGM_CREATION_ALERT_CALLBACKFn?

public fun interface PMGM_DISABLE_IGMP_CALLBACKFn {
    public operator fun invoke(dwifindex: UInt, dwifnexthopaddr: UInt): UInt
}

public typealias PMGM_DISABLE_IGMP_CALLBACK = PMGM_DISABLE_IGMP_CALLBACKFn?

public fun interface PMGM_ENABLE_IGMP_CALLBACKFn {
    public operator fun invoke(dwifindex: UInt, dwifnexthopaddr: UInt): UInt
}

public typealias PMGM_ENABLE_IGMP_CALLBACK = PMGM_ENABLE_IGMP_CALLBACKFn?

public fun interface PMGM_JOIN_ALERT_CALLBACKFn {
    public operator fun invoke(dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, bmemberupdate: BOOL): UInt
}

public typealias PMGM_JOIN_ALERT_CALLBACK = PMGM_JOIN_ALERT_CALLBACKFn?

public fun interface PMGM_LOCAL_JOIN_CALLBACKFn {
    public operator fun invoke(dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopaddr: UInt): UInt
}

public typealias PMGM_LOCAL_JOIN_CALLBACK = PMGM_LOCAL_JOIN_CALLBACKFn?

public fun interface PMGM_LOCAL_LEAVE_CALLBACKFn {
    public operator fun invoke(dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopaddr: UInt): UInt
}

public typealias PMGM_LOCAL_LEAVE_CALLBACK = PMGM_LOCAL_LEAVE_CALLBACKFn?

public fun interface PMGM_PRUNE_ALERT_CALLBACKFn {
    public operator fun invoke(dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopaddr: UInt, bmemberdelete: BOOL, pdwtimeout: Long): UInt
}

public typealias PMGM_PRUNE_ALERT_CALLBACK = PMGM_PRUNE_ALERT_CALLBACKFn?

public fun interface PMGM_RPF_CALLBACKFn {
    public operator fun invoke(dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, pdwinifindex: Long, pdwinifnexthopaddr: Long, pdwupstreamnbr: Long, dwhdrsize: UInt, pbpackethdr: Long, pbroute: Long): UInt
}

public typealias PMGM_RPF_CALLBACK = PMGM_RPF_CALLBACKFn?

public fun interface PMGM_WRONG_IF_CALLBACKFn {
    public operator fun invoke(dwsourceaddr: UInt, dwgroupaddr: UInt, dwifindex: UInt, dwifnexthopaddr: UInt, dwhdrsize: UInt, pbpackethdr: Long): UInt
}

public typealias PMGM_WRONG_IF_CALLBACK = PMGM_WRONG_IF_CALLBACKFn?

public fun interface PMPRADMINACCEPTNEWCONNECTIONFn {
    public operator fun invoke(param0: Long, param1: Long): BOOL
}

public typealias PMPRADMINACCEPTNEWCONNECTION = PMPRADMINACCEPTNEWCONNECTIONFn?

public fun interface PMPRADMINACCEPTNEWCONNECTION2Fn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long): BOOL
}

public typealias PMPRADMINACCEPTNEWCONNECTION2 = PMPRADMINACCEPTNEWCONNECTION2Fn?

public fun interface PMPRADMINACCEPTNEWCONNECTION3Fn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long): BOOL
}

public typealias PMPRADMINACCEPTNEWCONNECTION3 = PMPRADMINACCEPTNEWCONNECTION3Fn?

public fun interface PMPRADMINACCEPTNEWCONNECTIONEXFn {
    public operator fun invoke(param0: Long): BOOL
}

public typealias PMPRADMINACCEPTNEWCONNECTIONEX = PMPRADMINACCEPTNEWCONNECTIONEXFn?

public fun interface PMPRADMINACCEPTNEWLINKFn {
    public operator fun invoke(param0: Long, param1: Long): BOOL
}

public typealias PMPRADMINACCEPTNEWLINK = PMPRADMINACCEPTNEWLINKFn?

public fun interface PMPRADMINACCEPTREAUTHENTICATIONFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long): BOOL
}

public typealias PMPRADMINACCEPTREAUTHENTICATION = PMPRADMINACCEPTREAUTHENTICATIONFn?

public fun interface PMPRADMINACCEPTREAUTHENTICATIONEXFn {
    public operator fun invoke(param0: Long): BOOL
}

public typealias PMPRADMINACCEPTREAUTHENTICATIONEX = PMPRADMINACCEPTREAUTHENTICATIONEXFn?

public fun interface PMPRADMINACCEPTTUNNELENDPOINTCHANGEEXFn {
    public operator fun invoke(param0: Long): BOOL
}

public typealias PMPRADMINACCEPTTUNNELENDPOINTCHANGEEX = PMPRADMINACCEPTTUNNELENDPOINTCHANGEEXFn?

public fun interface PMPRADMINCONNECTIONHANGUPNOTIFICATIONFn {
    public operator fun invoke(param0: Long, param1: Long)
}

public typealias PMPRADMINCONNECTIONHANGUPNOTIFICATION = PMPRADMINCONNECTIONHANGUPNOTIFICATIONFn?

public fun interface PMPRADMINCONNECTIONHANGUPNOTIFICATION2Fn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long)
}

public typealias PMPRADMINCONNECTIONHANGUPNOTIFICATION2 = PMPRADMINCONNECTIONHANGUPNOTIFICATION2Fn?

public fun interface PMPRADMINCONNECTIONHANGUPNOTIFICATION3Fn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long)
}

public typealias PMPRADMINCONNECTIONHANGUPNOTIFICATION3 = PMPRADMINCONNECTIONHANGUPNOTIFICATION3Fn?

public fun interface PMPRADMINCONNECTIONHANGUPNOTIFICATIONEXFn {
    public operator fun invoke(param0: Long)
}

public typealias PMPRADMINCONNECTIONHANGUPNOTIFICATIONEX = PMPRADMINCONNECTIONHANGUPNOTIFICATIONEXFn?

public fun interface PMPRADMINGETIPADDRESSFORUSERFn {
    public operator fun invoke(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: Long): UInt
}

public typealias PMPRADMINGETIPADDRESSFORUSER = PMPRADMINGETIPADDRESSFORUSERFn?

public fun interface PMPRADMINGETIPV6ADDRESSFORUSERFn {
    public operator fun invoke(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: Long): UInt
}

public typealias PMPRADMINGETIPV6ADDRESSFORUSER = PMPRADMINGETIPV6ADDRESSFORUSERFn?

public fun interface PMPRADMINLINKHANGUPNOTIFICATIONFn {
    public operator fun invoke(param0: Long, param1: Long)
}

public typealias PMPRADMINLINKHANGUPNOTIFICATION = PMPRADMINLINKHANGUPNOTIFICATIONFn?

public fun interface PMPRADMINRASVALIDATEPREAUTHENTICATEDCONNECTIONEXFn {
    public operator fun invoke(param0: Long): UInt
}

public typealias PMPRADMINRASVALIDATEPREAUTHENTICATEDCONNECTIONEX = PMPRADMINRASVALIDATEPREAUTHENTICATEDCONNECTIONEXFn?

public fun interface PMPRADMINRELEASEIPADRESSFn {
    public operator fun invoke(param0: PCWSTR, param1: PCWSTR, param2: Long)
}

public typealias PMPRADMINRELEASEIPADRESS = PMPRADMINRELEASEIPADRESSFn?

public fun interface PMPRADMINRELEASEIPV6ADDRESSFORUSERFn {
    public operator fun invoke(param0: PCWSTR, param1: PCWSTR, param2: Long)
}

public typealias PMPRADMINRELEASEIPV6ADDRESSFORUSER = PMPRADMINRELEASEIPV6ADDRESSFORUSERFn?

public fun interface PMPRADMINTERMINATEDLLFn {
    public operator fun invoke(): UInt
}

public typealias PMPRADMINTERMINATEDLL = PMPRADMINTERMINATEDLLFn?

public typealias PPP_LCP = UInt

public typealias PPP_LCP_INFO_AUTH_DATA = UInt

public fun interface RASADFUNCAFn {
    public operator fun invoke(param0: PCSTR, param1: PCSTR, param2: Long, param3: Long): BOOL
}

public typealias RASADFUNCA = RASADFUNCAFn?

public fun interface RASADFUNCWFn {
    public operator fun invoke(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: Long): BOOL
}

public typealias RASADFUNCW = RASADFUNCWFn?

public typealias RASAPIVERSION = Int

public typealias RASCONNSTATE = Int

public typealias RASCONNSUBSTATE = Int

public fun interface RASDIALFUNCFn {
    public operator fun invoke(param0: UInt, param1: RASCONNSTATE, param2: UInt)
}

public typealias RASDIALFUNC = RASDIALFUNCFn?

public fun interface RASDIALFUNC1Fn {
    public operator fun invoke(param0: HRASCONN, param1: UInt, param2: RASCONNSTATE, param3: UInt, param4: UInt)
}

public typealias RASDIALFUNC1 = RASDIALFUNC1Fn?

public fun interface RASDIALFUNC2Fn {
    public operator fun invoke(param0: ULong, param1: UInt, param2: HRASCONN, param3: UInt, param4: RASCONNSTATE, param5: UInt, param6: UInt): UInt
}

public typealias RASDIALFUNC2 = RASDIALFUNC2Fn?

public typealias RASENTRY_DIAL_MODE = UInt

public typealias RASIKEV_PROJECTION_INFO_FLAGS = UInt

public fun interface RASPBDLGFUNCAFn {
    public operator fun invoke(param0: ULong, param1: UInt, param2: PCSTR, param3: Long)
}

public typealias RASPBDLGFUNCA = RASPBDLGFUNCAFn?

public fun interface RASPBDLGFUNCWFn {
    public operator fun invoke(param0: ULong, param1: UInt, param2: PCWSTR, param3: Long)
}

public typealias RASPBDLGFUNCW = RASPBDLGFUNCWFn?

public typealias RASPPP_PROJECTION_INFO_SERVER_AUTH_DATA = UInt

public typealias RASPPP_PROJECTION_INFO_SERVER_AUTH_PROTOCOL = UInt

public typealias RASPROJECTION = Int

public typealias RASPROJECTION_INFO_TYPE = Int

public fun interface RASSECURITYPROCFn {
    public operator fun invoke(): UInt
}

public typealias RASSECURITYPROC = RASSECURITYPROCFn?

public typealias RAS_FLAGS = UInt

public typealias RAS_HARDWARE_CONDITION = Int

public typealias RAS_PORT_CONDITION = Int

public typealias RAS_QUARANTINE_STATE = Int

public typealias ROUTER_CONNECTION_STATE = Int

public typealias ROUTER_INTERFACE_TYPE = Int

public fun interface RTM_ENTITY_EXPORT_METHODFn {
    public operator fun invoke(callerhandle: Long, calleehandle: Long, input: Long, output: Long)
}

public typealias RTM_ENTITY_EXPORT_METHOD = RTM_ENTITY_EXPORT_METHODFn?

public fun interface RTM_EVENT_CALLBACKFn {
    public operator fun invoke(rtmreghandle: Long, eventtype: RTM_EVENT_TYPE, context1: Long, context2: Long): UInt
}

public typealias RTM_EVENT_CALLBACK = RTM_EVENT_CALLBACKFn?

public typealias RTM_EVENT_TYPE = Int

public fun interface RasCustomDeleteEntryNotifyFnFn {
    public operator fun invoke(lpszphonebook: PCWSTR, lpszentry: PCWSTR, dwflags: UInt): UInt
}

public typealias RasCustomDeleteEntryNotifyFn = RasCustomDeleteEntryNotifyFnFn?

public fun interface RasCustomDialDlgFnFn {
    public operator fun invoke(hinstdll: HINSTANCE, dwflags: UInt, lpszphonebook: PCWSTR, lpszentry: PCWSTR, lpszphonenumber: PCWSTR, lpinfo: Long, pvinfo: Long): BOOL
}

public typealias RasCustomDialDlgFn = RasCustomDialDlgFnFn?

public fun interface RasCustomDialFnFn {
    public operator fun invoke(hinstdll: HINSTANCE, lprasdialextensions: Long, lpszphonebook: PCWSTR, lprasdialparams: Long, dwnotifiertype: UInt, lpvnotifier: Long, lphrasconn: Long, dwflags: UInt): UInt
}

public typealias RasCustomDialFn = RasCustomDialFnFn?

public fun interface RasCustomEntryDlgFnFn {
    public operator fun invoke(hinstdll: HINSTANCE, lpszphonebook: PCWSTR, lpszentry: PCWSTR, lpinfo: Long, dwflags: UInt): BOOL
}

public typealias RasCustomEntryDlgFn = RasCustomEntryDlgFnFn?

public fun interface RasCustomHangUpFnFn {
    public operator fun invoke(hrasconn: HRASCONN): UInt
}

public typealias RasCustomHangUpFn = RasCustomHangUpFnFn?

public fun interface RasCustomScriptExecuteFnFn {
    public operator fun invoke(hport: HANDLE, lpszphonebook: PCWSTR, lpszentryname: PCWSTR, pfnrasgetbuffer: PFNRASGETBUFFER, pfnrasfreebuffer: PFNRASFREEBUFFER, pfnrassendbuffer: PFNRASSENDBUFFER, pfnrasreceivebuffer: PFNRASRECEIVEBUFFER, pfnrasretrievebuffer: PFNRASRETRIEVEBUFFER, hwnd: HWND, prasdialparams: Long, pvreserved: Long): UInt
}

public typealias RasCustomScriptExecuteFn = RasCustomScriptExecuteFnFn?

public typealias SECURITY_MESSAGE_MSG_ID = UInt
