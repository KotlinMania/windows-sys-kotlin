package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.IN6_ADDR

public expect fun MgmAddGroupMembershipEntry(hprotocol: HANDLE, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt

public expect fun MgmDeRegisterMProtocol(hprotocol: HANDLE): UInt

public expect fun MgmDeleteGroupMembershipEntry(hprotocol: HANDLE, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt

public expect fun MgmGetFirstMfe(pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): UInt

public expect fun MgmGetFirstMfeStats(pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long, dwflags: UInt): UInt

public expect fun MgmGetMfe(pimm: Long, pdwbuffersize: Long, pbbuffer: Long): UInt

public expect fun MgmGetMfeStats(pimm: Long, pdwbuffersize: Long, pbbuffer: Long, dwflags: UInt): UInt

public expect fun MgmGetNextMfe(pimmstart: Long, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): UInt

public expect fun MgmGetNextMfeStats(pimmstart: Long, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long, dwflags: UInt): UInt

public expect fun MgmGetProtocolOnInterface(dwifindex: UInt, dwifnexthopaddr: UInt, pdwifprotocolid: Long, pdwifcomponentid: Long): UInt

public expect fun MgmGroupEnumerationEnd(henum: HANDLE): UInt

public expect fun MgmGroupEnumerationGetNext(henum: HANDLE, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): UInt

public expect fun MgmGroupEnumerationStart(hprotocol: HANDLE, metenumtype: MGM_ENUM_TYPES, phenumhandle: Long): UInt

public expect fun MgmRegisterMProtocol(prpiinfo: Long, dwprotocolid: UInt, dwcomponentid: UInt, phprotocol: Long): UInt

public expect fun MgmReleaseInterfaceOwnership(hprotocol: HANDLE, dwifindex: UInt, dwifnexthopaddr: UInt): UInt

public expect fun MgmTakeInterfaceOwnership(hprotocol: HANDLE, dwifindex: UInt, dwifnexthopaddr: UInt): UInt

public expect fun MprAdminBufferFree(pbuffer: Long): UInt

public expect fun MprAdminConnectionClearStats(hrasserver: Long, hrasconnection: HANDLE): UInt

public expect fun MprAdminConnectionEnum(hrasserver: Long, dwlevel: UInt, lplpbbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt

public expect fun MprAdminConnectionEnumEx(hrasserver: Long, pobjectheader: Long, dwpreferedmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, pprasconn: Long, lpdwresumehandle: Long): UInt

public expect fun MprAdminConnectionGetInfo(hrasserver: Long, dwlevel: UInt, hrasconnection: HANDLE, lplpbbuffer: Long): UInt

public expect fun MprAdminConnectionGetInfoEx(hrasserver: Long, hrasconnection: HANDLE, prasconnection: Long): UInt

public expect fun MprAdminConnectionRemoveQuarantine(hrasserver: HANDLE, hrasconnection: HANDLE, fisipaddress: BOOL): UInt

public expect fun MprAdminDeregisterConnectionNotification(hmprserver: Long, heventnotification: HANDLE): UInt

public expect fun MprAdminDeviceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long, lpdwtotalentries: Long): UInt

public expect fun MprAdminEstablishDomainRasServer(pszdomain: PCWSTR, pszmachine: PCWSTR, benable: BOOL): UInt

public expect fun MprAdminGetErrorString(dwerror: UInt, lplpwserrorstring: Long): UInt

public expect fun MprAdminGetPDCServer(lpszdomain: PCWSTR, lpszserver: PCWSTR, lpszpdcserver: PWSTR): UInt

public expect fun MprAdminInterfaceConnect(hmprserver: Long, hinterface: HANDLE, hevent: HANDLE, fsynchronous: BOOL): UInt

public expect fun MprAdminInterfaceCreate(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long, phinterface: Long): UInt

public expect fun MprAdminInterfaceDelete(hmprserver: Long, hinterface: HANDLE): UInt

public expect fun MprAdminInterfaceDeviceGetInfo(hmprserver: Long, hinterface: HANDLE, dwindex: UInt, dwlevel: UInt, lplpbuffer: Long): UInt

public expect fun MprAdminInterfaceDeviceSetInfo(hmprserver: Long, hinterface: HANDLE, dwindex: UInt, dwlevel: UInt, lpbbuffer: Long): UInt

public expect fun MprAdminInterfaceDisconnect(hmprserver: Long, hinterface: HANDLE): UInt

public expect fun MprAdminInterfaceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt

public expect fun MprAdminInterfaceGetCredentials(lpwsserver: PCWSTR, lpwsinterfacename: PCWSTR, lpwsusername: PWSTR, lpwspassword: PWSTR, lpwsdomainname: PWSTR): UInt

public expect fun MprAdminInterfaceGetCredentialsEx(hmprserver: Long, hinterface: HANDLE, dwlevel: UInt, lplpbbuffer: Long): UInt

public expect fun MprAdminInterfaceGetCustomInfoEx(hmprserver: Long, hinterface: HANDLE, pcustominfo: Long): UInt

public expect fun MprAdminInterfaceGetHandle(hmprserver: Long, lpwsinterfacename: PCWSTR, phinterface: Long, fincludeclientinterfaces: BOOL): UInt

public expect fun MprAdminInterfaceGetInfo(hmprserver: Long, hinterface: HANDLE, dwlevel: UInt, lplpbbuffer: Long): UInt

public expect fun MprAdminInterfaceQueryUpdateResult(hmprserver: Long, hinterface: HANDLE, dwprotocolid: UInt, lpdwupdateresult: Long): UInt

public expect fun MprAdminInterfaceSetCredentials(lpwsserver: PCWSTR, lpwsinterfacename: PCWSTR, lpwsusername: PCWSTR, lpwsdomainname: PCWSTR, lpwspassword: PCWSTR): UInt

public expect fun MprAdminInterfaceSetCredentialsEx(hmprserver: Long, hinterface: HANDLE, dwlevel: UInt, lpbbuffer: Long): UInt

public expect fun MprAdminInterfaceSetCustomInfoEx(hmprserver: Long, hinterface: HANDLE, pcustominfo: Long): UInt

public expect fun MprAdminInterfaceSetInfo(hmprserver: Long, hinterface: HANDLE, dwlevel: UInt, lpbbuffer: Long): UInt

public expect fun MprAdminInterfaceTransportAdd(hmprserver: Long, hinterface: HANDLE, dwtransportid: UInt, pinterfaceinfo: Long, dwinterfaceinfosize: UInt): UInt

public expect fun MprAdminInterfaceTransportGetInfo(hmprserver: Long, hinterface: HANDLE, dwtransportid: UInt, ppinterfaceinfo: Long, lpdwinterfaceinfosize: Long): UInt

public expect fun MprAdminInterfaceTransportRemove(hmprserver: Long, hinterface: HANDLE, dwtransportid: UInt): UInt

public expect fun MprAdminInterfaceTransportSetInfo(hmprserver: Long, hinterface: HANDLE, dwtransportid: UInt, pinterfaceinfo: Long, dwinterfaceinfosize: UInt): UInt

public expect fun MprAdminInterfaceUpdatePhonebookInfo(hmprserver: Long, hinterface: HANDLE): UInt

public expect fun MprAdminInterfaceUpdateRoutes(hmprserver: Long, hinterface: HANDLE, dwprotocolid: UInt, hevent: HANDLE): UInt

public expect fun MprAdminIsDomainRasServer(pszdomain: PCWSTR, pszmachine: PCWSTR, pbisrasserver: Long): UInt

public expect fun MprAdminIsServiceInitialized(lpwsservername: PCWSTR, fisserviceinitialized: Long): UInt

public expect fun MprAdminIsServiceRunning(lpwsservername: PCWSTR): BOOL

public expect fun MprAdminMIBBufferFree(pbuffer: Long): UInt

public expect fun MprAdminMIBEntryCreate(hmibserver: Long, dwpid: UInt, dwroutingpid: UInt, lpentry: Long, dwentrysize: UInt): UInt

public expect fun MprAdminMIBEntryDelete(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: Long, dwentrysize: UInt): UInt

public expect fun MprAdminMIBEntryGet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: Long, dwinentrysize: UInt, lplpoutentry: Long, lpoutentrysize: Long): UInt

public expect fun MprAdminMIBEntryGetFirst(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: Long, dwinentrysize: UInt, lplpoutentry: Long, lpoutentrysize: Long): UInt

public expect fun MprAdminMIBEntryGetNext(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: Long, dwinentrysize: UInt, lplpoutentry: Long, lpoutentrysize: Long): UInt

public expect fun MprAdminMIBEntrySet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: Long, dwentrysize: UInt): UInt

public expect fun MprAdminMIBServerConnect(lpwsservername: PCWSTR, phmibserver: Long): UInt

public expect fun MprAdminMIBServerDisconnect(hmibserver: Long)

public expect fun MprAdminPortClearStats(hrasserver: Long, hport: HANDLE): UInt

public expect fun MprAdminPortDisconnect(hrasserver: Long, hport: HANDLE): UInt

public expect fun MprAdminPortEnum(hrasserver: Long, dwlevel: UInt, hrasconnection: HANDLE, lplpbbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt

public expect fun MprAdminPortGetInfo(hrasserver: Long, dwlevel: UInt, hport: HANDLE, lplpbbuffer: Long): UInt

public expect fun MprAdminPortReset(hrasserver: Long, hport: HANDLE): UInt

public expect fun MprAdminRegisterConnectionNotification(hmprserver: Long, heventnotification: HANDLE): UInt

public expect fun MprAdminSendUserMessage(hmprserver: Long, hconnection: HANDLE, lpwszmessage: PCWSTR): UInt

public expect fun MprAdminServerConnect(lpwsservername: PCWSTR, phmprserver: Long): UInt

public expect fun MprAdminServerDisconnect(hmprserver: Long)

public expect fun MprAdminServerGetCredentials(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long): UInt

public expect fun MprAdminServerGetInfo(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long): UInt

public expect fun MprAdminServerGetInfoEx(hmprserver: Long, pserverinfo: Long): UInt

public expect fun MprAdminServerSetCredentials(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long): UInt

public expect fun MprAdminServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long): UInt

public expect fun MprAdminServerSetInfoEx(hmprserver: Long, pserverinfo: Long): UInt

public expect fun MprAdminTransportCreate(hmprserver: Long, dwtransportid: UInt, lpwstransportname: PCWSTR, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt, lpwsdllpath: PCWSTR): UInt

public expect fun MprAdminTransportGetInfo(hmprserver: Long, dwtransportid: UInt, ppglobalinfo: Long, lpdwglobalinfosize: Long, ppclientinterfaceinfo: Long, lpdwclientinterfaceinfosize: Long): UInt

public expect fun MprAdminTransportSetInfo(hmprserver: Long, dwtransportid: UInt, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt): UInt

public expect fun MprAdminUpdateConnection(hrasserver: Long, hrasconnection: HANDLE, prasupdateconnection: Long): UInt

public expect fun MprAdminUserGetInfo(lpszserver: PCWSTR, lpszuser: PCWSTR, dwlevel: UInt, lpbbuffer: Long): UInt

public expect fun MprAdminUserSetInfo(lpszserver: PCWSTR, lpszuser: PCWSTR, dwlevel: UInt, lpbbuffer: Long): UInt

public expect fun MprConfigBufferFree(pbuffer: Long): UInt

public expect fun MprConfigFilterGetInfo(hmprconfig: HANDLE, dwlevel: UInt, dwtransportid: UInt, lpbuffer: Long): UInt

public expect fun MprConfigFilterSetInfo(hmprconfig: HANDLE, dwlevel: UInt, dwtransportid: UInt, lpbuffer: Long): UInt

public expect fun MprConfigGetFriendlyName(hmprconfig: HANDLE, pszguidname: PCWSTR, pszbuffer: PWSTR, dwbuffersize: UInt): UInt

public expect fun MprConfigGetGuidName(hmprconfig: HANDLE, pszfriendlyname: PCWSTR, pszbuffer: PWSTR, dwbuffersize: UInt): UInt

public expect fun MprConfigInterfaceCreate(hmprconfig: HANDLE, dwlevel: UInt, lpbbuffer: Long, phrouterinterface: Long): UInt

public expect fun MprConfigInterfaceDelete(hmprconfig: HANDLE, hrouterinterface: HANDLE): UInt

public expect fun MprConfigInterfaceEnum(hmprconfig: HANDLE, dwlevel: UInt, lplpbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt

public expect fun MprConfigInterfaceGetCustomInfoEx(hmprconfig: HANDLE, hrouterinterface: HANDLE, pcustominfo: Long): UInt

public expect fun MprConfigInterfaceGetHandle(hmprconfig: HANDLE, lpwsinterfacename: PCWSTR, phrouterinterface: Long): UInt

public expect fun MprConfigInterfaceGetInfo(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwlevel: UInt, lplpbuffer: Long, lpdwbuffersize: Long): UInt

public expect fun MprConfigInterfaceSetCustomInfoEx(hmprconfig: HANDLE, hrouterinterface: HANDLE, pcustominfo: Long): UInt

public expect fun MprConfigInterfaceSetInfo(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwlevel: UInt, lpbbuffer: Long): UInt

public expect fun MprConfigInterfaceTransportAdd(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwtransportid: UInt, lpwstransportname: PCWSTR, pinterfaceinfo: Long, dwinterfaceinfosize: UInt, phrouteriftransport: Long): UInt

public expect fun MprConfigInterfaceTransportEnum(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwlevel: UInt, lplpbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt

public expect fun MprConfigInterfaceTransportGetHandle(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwtransportid: UInt, phrouteriftransport: Long): UInt

public expect fun MprConfigInterfaceTransportGetInfo(hmprconfig: HANDLE, hrouterinterface: HANDLE, hrouteriftransport: HANDLE, ppinterfaceinfo: Long, lpdwinterfaceinfosize: Long): UInt

public expect fun MprConfigInterfaceTransportRemove(hmprconfig: HANDLE, hrouterinterface: HANDLE, hrouteriftransport: HANDLE): UInt

public expect fun MprConfigInterfaceTransportSetInfo(hmprconfig: HANDLE, hrouterinterface: HANDLE, hrouteriftransport: HANDLE, pinterfaceinfo: Long, dwinterfaceinfosize: UInt): UInt

public expect fun MprConfigServerBackup(hmprconfig: HANDLE, lpwspath: PCWSTR): UInt

public expect fun MprConfigServerConnect(lpwsservername: PCWSTR, phmprconfig: Long): UInt

public expect fun MprConfigServerDisconnect(hmprconfig: HANDLE)

public expect fun MprConfigServerGetInfo(hmprconfig: HANDLE, dwlevel: UInt, lplpbbuffer: Long): UInt

public expect fun MprConfigServerGetInfoEx(hmprconfig: HANDLE, pserverinfo: Long): UInt

public expect fun MprConfigServerInstall(dwlevel: UInt, pbuffer: Long): UInt

public expect fun MprConfigServerRefresh(hmprconfig: HANDLE): UInt

public expect fun MprConfigServerRestore(hmprconfig: HANDLE, lpwspath: PCWSTR): UInt

public expect fun MprConfigServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long): UInt

public expect fun MprConfigServerSetInfoEx(hmprconfig: HANDLE, psetserverconfig: Long): UInt

public expect fun MprConfigTransportCreate(hmprconfig: HANDLE, dwtransportid: UInt, lpwstransportname: PCWSTR, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt, lpwsdllpath: PCWSTR, phroutertransport: Long): UInt

public expect fun MprConfigTransportDelete(hmprconfig: HANDLE, hroutertransport: HANDLE): UInt

public expect fun MprConfigTransportEnum(hmprconfig: HANDLE, dwlevel: UInt, lplpbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt

public expect fun MprConfigTransportGetHandle(hmprconfig: HANDLE, dwtransportid: UInt, phroutertransport: Long): UInt

public expect fun MprConfigTransportGetInfo(hmprconfig: HANDLE, hroutertransport: HANDLE, ppglobalinfo: Long, lpdwglobalinfosize: Long, ppclientinterfaceinfo: Long, lpdwclientinterfaceinfosize: Long, lplpwsdllpath: Long): UInt

public expect fun MprConfigTransportSetInfo(hmprconfig: HANDLE, hroutertransport: HANDLE, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt, lpwsdllpath: PCWSTR): UInt

public expect fun MprInfoBlockAdd(lpheader: Long, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: Long, lplpnewheader: Long): UInt

public expect fun MprInfoBlockFind(lpheader: Long, dwinfotype: UInt, lpdwitemsize: Long, lpdwitemcount: Long, lplpitemdata: Long): UInt

public expect fun MprInfoBlockQuerySize(lpheader: Long): UInt

public expect fun MprInfoBlockRemove(lpheader: Long, dwinfotype: UInt, lplpnewheader: Long): UInt

public expect fun MprInfoBlockSet(lpheader: Long, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: Long, lplpnewheader: Long): UInt

public expect fun MprInfoCreate(dwversion: UInt, lplpnewheader: Long): UInt

public expect fun MprInfoDelete(lpheader: Long): UInt

public expect fun MprInfoDuplicate(lpheader: Long, lplpnewheader: Long): UInt

public expect fun MprInfoRemoveAll(lpheader: Long, lplpnewheader: Long): UInt

public expect fun RasClearConnectionStatistics(hrasconn: HRASCONN): UInt

public expect fun RasClearLinkStatistics(hrasconn: HRASCONN, dwsubentry: UInt): UInt

public expect fun RasConnectionNotificationA(param0: HRASCONN, param1: HANDLE, param2: UInt): UInt

public expect fun RasConnectionNotificationW(param0: HRASCONN, param1: HANDLE, param2: UInt): UInt

public expect fun RasCreatePhonebookEntryA(param0: HWND, param1: PCSTR): UInt

public expect fun RasCreatePhonebookEntryW(param0: HWND, param1: PCWSTR): UInt

public expect fun RasDeleteEntryA(param0: PCSTR, param1: PCSTR): UInt

public expect fun RasDeleteEntryW(param0: PCWSTR, param1: PCWSTR): UInt

public expect fun RasDeleteSubEntryA(pszphonebook: PCSTR, pszentry: PCSTR, dwsubentryid: UInt): UInt

public expect fun RasDeleteSubEntryW(pszphonebook: PCWSTR, pszentry: PCWSTR, dwsubentryid: UInt): UInt

public expect fun RasDialA(param0: Long, param1: PCSTR, param2: Long, param3: UInt, param4: Long, param5: Long): UInt

public expect fun RasDialDlgA(lpszphonebook: PCSTR, lpszentry: PCSTR, lpszphonenumber: PCSTR, lpinfo: Long): BOOL

public expect fun RasDialDlgW(lpszphonebook: PCWSTR, lpszentry: PCWSTR, lpszphonenumber: PCWSTR, lpinfo: Long): BOOL

public expect fun RasDialW(param0: Long, param1: PCWSTR, param2: Long, param3: UInt, param4: Long, param5: Long): UInt

public expect fun RasEditPhonebookEntryA(param0: HWND, param1: PCSTR, param2: PCSTR): UInt

public expect fun RasEditPhonebookEntryW(param0: HWND, param1: PCWSTR, param2: PCWSTR): UInt

public expect fun RasEntryDlgA(lpszphonebook: PCSTR, lpszentry: PCSTR, lpinfo: Long): BOOL

public expect fun RasEntryDlgW(lpszphonebook: PCWSTR, lpszentry: PCWSTR, lpinfo: Long): BOOL

public expect fun RasEnumAutodialAddressesA(lpprasautodialaddresses: Long, lpdwcbrasautodialaddresses: Long, lpdwcrasautodialaddresses: Long): UInt

public expect fun RasEnumAutodialAddressesW(lpprasautodialaddresses: Long, lpdwcbrasautodialaddresses: Long, lpdwcrasautodialaddresses: Long): UInt

public expect fun RasEnumConnectionsA(param0: Long, param1: Long, param2: Long): UInt

public expect fun RasEnumConnectionsW(param0: Long, param1: Long, param2: Long): UInt

public expect fun RasEnumDevicesA(param0: Long, param1: Long, param2: Long): UInt

public expect fun RasEnumDevicesW(param0: Long, param1: Long, param2: Long): UInt

public expect fun RasEnumEntriesA(param0: PCSTR, param1: PCSTR, param2: Long, param3: Long, param4: Long): UInt

public expect fun RasEnumEntriesW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: Long, param4: Long): UInt

public expect fun RasFreeEapUserIdentityA(praseapuseridentity: Long)

public expect fun RasFreeEapUserIdentityW(praseapuseridentity: Long)

public expect fun RasGetAutodialAddressA(param0: PCSTR, param1: Long, param2: Long, param3: Long, param4: Long): UInt

public expect fun RasGetAutodialAddressW(param0: PCWSTR, param1: Long, param2: Long, param3: Long, param4: Long): UInt

public expect fun RasGetAutodialEnableA(param0: UInt, param1: Long): UInt

public expect fun RasGetAutodialEnableW(param0: UInt, param1: Long): UInt

public expect fun RasGetAutodialParamA(param0: UInt, param1: Long, param2: Long): UInt

public expect fun RasGetAutodialParamW(param0: UInt, param1: Long, param2: Long): UInt

public expect fun RasGetConnectStatusA(param0: HRASCONN, param1: Long): UInt

public expect fun RasGetConnectStatusW(param0: HRASCONN, param1: Long): UInt

public expect fun RasGetConnectionStatistics(hrasconn: HRASCONN, lpstatistics: Long): UInt

public expect fun RasGetCountryInfoA(param0: Long, param1: Long): UInt

public expect fun RasGetCountryInfoW(param0: Long, param1: Long): UInt

public expect fun RasGetCredentialsA(param0: PCSTR, param1: PCSTR, param2: Long): UInt

public expect fun RasGetCredentialsW(param0: PCWSTR, param1: PCWSTR, param2: Long): UInt

public expect fun RasGetCustomAuthDataA(pszphonebook: PCSTR, pszentry: PCSTR, pbcustomauthdata: Long, pdwsizeofcustomauthdata: Long): UInt

public expect fun RasGetCustomAuthDataW(pszphonebook: PCWSTR, pszentry: PCWSTR, pbcustomauthdata: Long, pdwsizeofcustomauthdata: Long): UInt

public expect fun RasGetEapUserDataA(htoken: HANDLE, pszphonebook: PCSTR, pszentry: PCSTR, pbeapdata: Long, pdwsizeofeapdata: Long): UInt

public expect fun RasGetEapUserDataW(htoken: HANDLE, pszphonebook: PCWSTR, pszentry: PCWSTR, pbeapdata: Long, pdwsizeofeapdata: Long): UInt

public expect fun RasGetEapUserIdentityA(pszphonebook: PCSTR, pszentry: PCSTR, dwflags: UInt, hwnd: HWND, ppraseapuseridentity: Long): UInt

public expect fun RasGetEapUserIdentityW(pszphonebook: PCWSTR, pszentry: PCWSTR, dwflags: UInt, hwnd: HWND, ppraseapuseridentity: Long): UInt

public expect fun RasGetEntryDialParamsA(param0: PCSTR, param1: Long, param2: Long): UInt

public expect fun RasGetEntryDialParamsW(param0: PCWSTR, param1: Long, param2: Long): UInt

public expect fun RasGetEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: Long, param3: Long, param4: Long, param5: Long): UInt

public expect fun RasGetEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: Long, param4: Long, param5: Long): UInt

public expect fun RasGetErrorStringA(resourceid: UInt, lpszstring: PSTR, inbufsize: UInt): UInt

public expect fun RasGetErrorStringW(resourceid: UInt, lpszstring: PWSTR, inbufsize: UInt): UInt

public expect fun RasGetLinkStatistics(hrasconn: HRASCONN, dwsubentry: UInt, lpstatistics: Long): UInt

public expect fun RasGetPCscf(lpszpcscf: PWSTR): UInt

public expect fun RasGetProjectionInfoA(param0: HRASCONN, param1: RASPROJECTION, param2: Long, param3: Long): UInt

public expect fun RasGetProjectionInfoEx(hrasconn: HRASCONN, prasprojection: Long, lpdwsize: Long): UInt

public expect fun RasGetProjectionInfoW(param0: HRASCONN, param1: RASPROJECTION, param2: Long, param3: Long): UInt

public expect fun RasGetSubEntryHandleA(param0: HRASCONN, param1: UInt, param2: Long): UInt

public expect fun RasGetSubEntryHandleW(param0: HRASCONN, param1: UInt, param2: Long): UInt

public expect fun RasGetSubEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: UInt, param3: Long, param4: Long, param5: Long, param6: Long): UInt

public expect fun RasGetSubEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: UInt, param3: Long, param4: Long, param5: Long, param6: Long): UInt

public expect fun RasHangUpA(param0: HRASCONN): UInt

public expect fun RasHangUpW(param0: HRASCONN): UInt

public expect fun RasInvokeEapUI(param0: HRASCONN, param1: UInt, param2: Long, param3: HWND): UInt

public expect fun RasPhonebookDlgA(lpszphonebook: PCSTR, lpszentry: PCSTR, lpinfo: Long): BOOL

public expect fun RasPhonebookDlgW(lpszphonebook: PCWSTR, lpszentry: PCWSTR, lpinfo: Long): BOOL

public expect fun RasRenameEntryA(param0: PCSTR, param1: PCSTR, param2: PCSTR): UInt

public expect fun RasRenameEntryW(param0: PCWSTR, param1: PCWSTR, param2: PCWSTR): UInt

public expect fun RasSetAutodialAddressA(param0: PCSTR, param1: UInt, param2: Long, param3: UInt, param4: UInt): UInt

public expect fun RasSetAutodialAddressW(param0: PCWSTR, param1: UInt, param2: Long, param3: UInt, param4: UInt): UInt

public expect fun RasSetAutodialEnableA(param0: UInt, param1: BOOL): UInt

public expect fun RasSetAutodialEnableW(param0: UInt, param1: BOOL): UInt

public expect fun RasSetAutodialParamA(param0: UInt, param1: Long, param2: UInt): UInt

public expect fun RasSetAutodialParamW(param0: UInt, param1: Long, param2: UInt): UInt

public expect fun RasSetCredentialsA(param0: PCSTR, param1: PCSTR, param2: Long, param3: BOOL): UInt

public expect fun RasSetCredentialsW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: BOOL): UInt

public expect fun RasSetCustomAuthDataA(pszphonebook: PCSTR, pszentry: PCSTR, pbcustomauthdata: Long, dwsizeofcustomauthdata: UInt): UInt

public expect fun RasSetCustomAuthDataW(pszphonebook: PCWSTR, pszentry: PCWSTR, pbcustomauthdata: Long, dwsizeofcustomauthdata: UInt): UInt

public expect fun RasSetEapUserDataA(htoken: HANDLE, pszphonebook: PCSTR, pszentry: PCSTR, pbeapdata: Long, dwsizeofeapdata: UInt): UInt

public expect fun RasSetEapUserDataW(htoken: HANDLE, pszphonebook: PCWSTR, pszentry: PCWSTR, pbeapdata: Long, dwsizeofeapdata: UInt): UInt

public expect fun RasSetEntryDialParamsA(param0: PCSTR, param1: Long, param2: BOOL): UInt

public expect fun RasSetEntryDialParamsW(param0: PCWSTR, param1: Long, param2: BOOL): UInt

public expect fun RasSetEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: Long, param3: UInt, param4: Long, param5: UInt): UInt

public expect fun RasSetEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: UInt, param4: Long, param5: UInt): UInt

public expect fun RasSetSubEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: UInt, param3: Long, param4: UInt, param5: Long, param6: UInt): UInt

public expect fun RasSetSubEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: UInt, param3: Long, param4: UInt, param5: Long, param6: UInt): UInt

public expect fun RasUpdateConnection(hrasconn: HRASCONN, lprasupdateconn: Long): UInt

public expect fun RasValidateEntryNameA(param0: PCSTR, param1: PCSTR): UInt

public expect fun RasValidateEntryNameW(param0: PCWSTR, param1: PCWSTR): UInt

public expect fun RtmAddNextHop(rtmreghandle: Long, nexthopinfo: Long, nexthophandle: Long, changeflags: Long): UInt

public expect fun RtmAddRouteToDest(rtmreghandle: Long, routehandle: Long, destaddress: Long, routeinfo: Long, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: Long): UInt

public expect fun RtmBlockMethods(rtmreghandle: Long, targethandle: HANDLE, targettype: UByte, blockingflag: UInt): UInt

public expect fun RtmConvertIpv6AddressAndLengthToNetAddress(pnetaddress: Long, address: IN6_ADDR, dwlength: UInt, dwaddresssize: UInt): UInt

public expect fun RtmConvertNetAddressToIpv6AddressAndLength(pnetaddress: Long, paddress: Long, plength: Long, dwaddresssize: UInt): UInt

public expect fun RtmCreateDestEnum(rtmreghandle: Long, targetviews: UInt, enumflags: UInt, netaddress: Long, protocolid: UInt, rtmenumhandle: Long): UInt

public expect fun RtmCreateNextHopEnum(rtmreghandle: Long, enumflags: UInt, netaddress: Long, rtmenumhandle: Long): UInt

public expect fun RtmCreateRouteEnum(rtmreghandle: Long, desthandle: Long, targetviews: UInt, enumflags: UInt, startdest: Long, matchingflags: UInt, criteriaroute: Long, criteriainterface: UInt, rtmenumhandle: Long): UInt

public expect fun RtmCreateRouteList(rtmreghandle: Long, routelisthandle: Long): UInt

public expect fun RtmCreateRouteListEnum(rtmreghandle: Long, routelisthandle: Long, rtmenumhandle: Long): UInt

public expect fun RtmDeleteEnumHandle(rtmreghandle: Long, enumhandle: Long): UInt

public expect fun RtmDeleteNextHop(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: Long): UInt

public expect fun RtmDeleteRouteList(rtmreghandle: Long, routelisthandle: Long): UInt

public expect fun RtmDeleteRouteToDest(rtmreghandle: Long, routehandle: Long, changeflags: Long): UInt

public expect fun RtmDeregisterEntity(rtmreghandle: Long): UInt

public expect fun RtmDeregisterFromChangeNotification(rtmreghandle: Long, notifyhandle: Long): UInt

public expect fun RtmFindNextHop(rtmreghandle: Long, nexthopinfo: Long, nexthophandle: Long, nexthoppointer: Long): UInt

public expect fun RtmGetChangeStatus(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, changestatus: Long): UInt

public expect fun RtmGetChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: Long, changeddests: Long): UInt

public expect fun RtmGetDestInfo(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt

public expect fun RtmGetEntityInfo(rtmreghandle: Long, entityhandle: Long, entityinfo: Long): UInt

public expect fun RtmGetEntityMethods(rtmreghandle: Long, entityhandle: Long, nummethods: Long, exptmethods: Long): UInt

public expect fun RtmGetEnumDests(rtmreghandle: Long, enumhandle: Long, numdests: Long, destinfos: Long): UInt

public expect fun RtmGetEnumNextHops(rtmreghandle: Long, enumhandle: Long, numnexthops: Long, nexthophandles: Long): UInt

public expect fun RtmGetEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: Long, routehandles: Long): UInt

public expect fun RtmGetExactMatchDestination(rtmreghandle: Long, destaddress: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt

public expect fun RtmGetExactMatchRoute(rtmreghandle: Long, destaddress: Long, matchingflags: UInt, routeinfo: Long, interfaceindex: UInt, targetviews: UInt, routehandle: Long): UInt

public expect fun RtmGetLessSpecificDestination(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt

public expect fun RtmGetListEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: Long, routehandles: Long): UInt

public expect fun RtmGetMostSpecificDestination(rtmreghandle: Long, destaddress: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt

public expect fun RtmGetNextHopInfo(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: Long): UInt

public expect fun RtmGetNextHopPointer(rtmreghandle: Long, nexthophandle: Long, nexthoppointer: Long): UInt

public expect fun RtmGetOpaqueInformationPointer(rtmreghandle: Long, desthandle: Long, opaqueinfopointer: Long): UInt

public expect fun RtmGetRegisteredEntities(rtmreghandle: Long, numentities: Long, entityhandles: Long, entityinfos: Long): UInt

public expect fun RtmGetRouteInfo(rtmreghandle: Long, routehandle: Long, routeinfo: Long, destaddress: Long): UInt

public expect fun RtmGetRoutePointer(rtmreghandle: Long, routehandle: Long, routepointer: Long): UInt

public expect fun RtmHoldDestination(rtmreghandle: Long, desthandle: Long, targetviews: UInt, holdtime: UInt): UInt

public expect fun RtmIgnoreChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: Long): UInt

public expect fun RtmInsertInRouteList(rtmreghandle: Long, routelisthandle: Long, numroutes: UInt, routehandles: Long): UInt

public expect fun RtmInvokeMethod(rtmreghandle: Long, entityhandle: Long, input: Long, outputsize: Long, output: Long): UInt

public expect fun RtmIsBestRoute(rtmreghandle: Long, routehandle: Long, bestinviews: Long): UInt

public expect fun RtmIsMarkedForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, destmarked: Long): UInt

public expect fun RtmLockDestination(rtmreghandle: Long, desthandle: Long, exclusive: BOOL, lockdest: BOOL): UInt

public expect fun RtmLockNextHop(rtmreghandle: Long, nexthophandle: Long, exclusive: BOOL, locknexthop: BOOL, nexthoppointer: Long): UInt

public expect fun RtmLockRoute(rtmreghandle: Long, routehandle: Long, exclusive: BOOL, lockroute: BOOL, routepointer: Long): UInt

public expect fun RtmMarkDestForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, markdest: BOOL): UInt

public expect fun RtmReferenceHandles(rtmreghandle: Long, numhandles: UInt, rtmhandles: Long): UInt

public expect fun RtmRegisterEntity(rtmentityinfo: Long, exportmethods: Long, eventcallback: RTM_EVENT_CALLBACK, reserveopaquepointer: BOOL, rtmregprofile: Long, rtmreghandle: Long): UInt

public expect fun RtmRegisterForChangeNotification(rtmreghandle: Long, targetviews: UInt, notifyflags: UInt, notifycontext: Long, notifyhandle: Long): UInt

public expect fun RtmReleaseChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: Long): UInt

public expect fun RtmReleaseDestInfo(rtmreghandle: Long, destinfo: Long): UInt

public expect fun RtmReleaseDests(rtmreghandle: Long, numdests: UInt, destinfos: Long): UInt

public expect fun RtmReleaseEntities(rtmreghandle: Long, numentities: UInt, entityhandles: Long): UInt

public expect fun RtmReleaseEntityInfo(rtmreghandle: Long, entityinfo: Long): UInt

public expect fun RtmReleaseNextHopInfo(rtmreghandle: Long, nexthopinfo: Long): UInt

public expect fun RtmReleaseNextHops(rtmreghandle: Long, numnexthops: UInt, nexthophandles: Long): UInt

public expect fun RtmReleaseRouteInfo(rtmreghandle: Long, routeinfo: Long): UInt

public expect fun RtmReleaseRoutes(rtmreghandle: Long, numroutes: UInt, routehandles: Long): UInt

public expect fun RtmUpdateAndUnlockRoute(rtmreghandle: Long, routehandle: Long, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: Long): UInt
