@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.IN6_ADDR

public actual fun MgmAddGroupMembershipEntry(hprotocol: HANDLE, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    0u

public actual fun MgmDeRegisterMProtocol(hprotocol: HANDLE): UInt =
    0u

public actual fun MgmDeleteGroupMembershipEntry(hprotocol: HANDLE, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    0u

public actual fun MgmGetFirstMfe(pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): UInt =
    0u

public actual fun MgmGetFirstMfeStats(pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long, dwflags: UInt): UInt =
    0u

public actual fun MgmGetMfe(pimm: Long, pdwbuffersize: Long, pbbuffer: Long): UInt =
    0u

public actual fun MgmGetMfeStats(pimm: Long, pdwbuffersize: Long, pbbuffer: Long, dwflags: UInt): UInt =
    0u

public actual fun MgmGetNextMfe(pimmstart: Long, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): UInt =
    0u

public actual fun MgmGetNextMfeStats(pimmstart: Long, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long, dwflags: UInt): UInt =
    0u

public actual fun MgmGetProtocolOnInterface(dwifindex: UInt, dwifnexthopaddr: UInt, pdwifprotocolid: Long, pdwifcomponentid: Long): UInt =
    0u

public actual fun MgmGroupEnumerationEnd(henum: HANDLE): UInt =
    0u

public actual fun MgmGroupEnumerationGetNext(henum: HANDLE, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): UInt =
    0u

public actual fun MgmGroupEnumerationStart(hprotocol: HANDLE, metenumtype: MGM_ENUM_TYPES, phenumhandle: Long): UInt =
    0u

public actual fun MgmRegisterMProtocol(prpiinfo: Long, dwprotocolid: UInt, dwcomponentid: UInt, phprotocol: Long): UInt =
    0u

public actual fun MgmReleaseInterfaceOwnership(hprotocol: HANDLE, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    0u

public actual fun MgmTakeInterfaceOwnership(hprotocol: HANDLE, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    0u

public actual fun MprAdminBufferFree(pbuffer: Long): UInt =
    0u

public actual fun MprAdminConnectionClearStats(hrasserver: Long, hrasconnection: HANDLE): UInt =
    0u

public actual fun MprAdminConnectionEnum(hrasserver: Long, dwlevel: UInt, lplpbbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    0u

public actual fun MprAdminConnectionEnumEx(hrasserver: Long, pobjectheader: Long, dwpreferedmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, pprasconn: Long, lpdwresumehandle: Long): UInt =
    0u

public actual fun MprAdminConnectionGetInfo(hrasserver: Long, dwlevel: UInt, hrasconnection: HANDLE, lplpbbuffer: Long): UInt =
    0u

public actual fun MprAdminConnectionGetInfoEx(hrasserver: Long, hrasconnection: HANDLE, prasconnection: Long): UInt =
    0u

public actual fun MprAdminConnectionRemoveQuarantine(hrasserver: HANDLE, hrasconnection: HANDLE, fisipaddress: BOOL): UInt =
    0u

public actual fun MprAdminDeregisterConnectionNotification(hmprserver: Long, heventnotification: HANDLE): UInt =
    0u

public actual fun MprAdminDeviceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long, lpdwtotalentries: Long): UInt =
    0u

public actual fun MprAdminEstablishDomainRasServer(pszdomain: PCWSTR, pszmachine: PCWSTR, benable: BOOL): UInt =
    0u

public actual fun MprAdminGetErrorString(dwerror: UInt, lplpwserrorstring: Long): UInt =
    0u

public actual fun MprAdminGetPDCServer(lpszdomain: PCWSTR, lpszserver: PCWSTR, lpszpdcserver: PWSTR): UInt =
    0u

public actual fun MprAdminInterfaceConnect(hmprserver: Long, hinterface: HANDLE, hevent: HANDLE, fsynchronous: BOOL): UInt =
    0u

public actual fun MprAdminInterfaceCreate(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long, phinterface: Long): UInt =
    0u

public actual fun MprAdminInterfaceDelete(hmprserver: Long, hinterface: HANDLE): UInt =
    0u

public actual fun MprAdminInterfaceDeviceGetInfo(hmprserver: Long, hinterface: HANDLE, dwindex: UInt, dwlevel: UInt, lplpbuffer: Long): UInt =
    0u

public actual fun MprAdminInterfaceDeviceSetInfo(hmprserver: Long, hinterface: HANDLE, dwindex: UInt, dwlevel: UInt, lpbbuffer: Long): UInt =
    0u

public actual fun MprAdminInterfaceDisconnect(hmprserver: Long, hinterface: HANDLE): UInt =
    0u

public actual fun MprAdminInterfaceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    0u

public actual fun MprAdminInterfaceGetCredentials(lpwsserver: PCWSTR, lpwsinterfacename: PCWSTR, lpwsusername: PWSTR, lpwspassword: PWSTR, lpwsdomainname: PWSTR): UInt =
    0u

public actual fun MprAdminInterfaceGetCredentialsEx(hmprserver: Long, hinterface: HANDLE, dwlevel: UInt, lplpbbuffer: Long): UInt =
    0u

public actual fun MprAdminInterfaceGetCustomInfoEx(hmprserver: Long, hinterface: HANDLE, pcustominfo: Long): UInt =
    0u

public actual fun MprAdminInterfaceGetHandle(hmprserver: Long, lpwsinterfacename: PCWSTR, phinterface: Long, fincludeclientinterfaces: BOOL): UInt =
    0u

public actual fun MprAdminInterfaceGetInfo(hmprserver: Long, hinterface: HANDLE, dwlevel: UInt, lplpbbuffer: Long): UInt =
    0u

public actual fun MprAdminInterfaceQueryUpdateResult(hmprserver: Long, hinterface: HANDLE, dwprotocolid: UInt, lpdwupdateresult: Long): UInt =
    0u

public actual fun MprAdminInterfaceSetCredentials(lpwsserver: PCWSTR, lpwsinterfacename: PCWSTR, lpwsusername: PCWSTR, lpwsdomainname: PCWSTR, lpwspassword: PCWSTR): UInt =
    0u

public actual fun MprAdminInterfaceSetCredentialsEx(hmprserver: Long, hinterface: HANDLE, dwlevel: UInt, lpbbuffer: Long): UInt =
    0u

public actual fun MprAdminInterfaceSetCustomInfoEx(hmprserver: Long, hinterface: HANDLE, pcustominfo: Long): UInt =
    0u

public actual fun MprAdminInterfaceSetInfo(hmprserver: Long, hinterface: HANDLE, dwlevel: UInt, lpbbuffer: Long): UInt =
    0u

public actual fun MprAdminInterfaceTransportAdd(hmprserver: Long, hinterface: HANDLE, dwtransportid: UInt, pinterfaceinfo: Long, dwinterfaceinfosize: UInt): UInt =
    0u

public actual fun MprAdminInterfaceTransportGetInfo(hmprserver: Long, hinterface: HANDLE, dwtransportid: UInt, ppinterfaceinfo: Long, lpdwinterfaceinfosize: Long): UInt =
    0u

public actual fun MprAdminInterfaceTransportRemove(hmprserver: Long, hinterface: HANDLE, dwtransportid: UInt): UInt =
    0u

public actual fun MprAdminInterfaceTransportSetInfo(hmprserver: Long, hinterface: HANDLE, dwtransportid: UInt, pinterfaceinfo: Long, dwinterfaceinfosize: UInt): UInt =
    0u

public actual fun MprAdminInterfaceUpdatePhonebookInfo(hmprserver: Long, hinterface: HANDLE): UInt =
    0u

public actual fun MprAdminInterfaceUpdateRoutes(hmprserver: Long, hinterface: HANDLE, dwprotocolid: UInt, hevent: HANDLE): UInt =
    0u

public actual fun MprAdminIsDomainRasServer(pszdomain: PCWSTR, pszmachine: PCWSTR, pbisrasserver: Long): UInt =
    0u

public actual fun MprAdminIsServiceInitialized(lpwsservername: PCWSTR, fisserviceinitialized: Long): UInt =
    0u

public actual fun MprAdminIsServiceRunning(lpwsservername: PCWSTR): BOOL =
    0

public actual fun MprAdminMIBBufferFree(pbuffer: Long): UInt =
    0u

public actual fun MprAdminMIBEntryCreate(hmibserver: Long, dwpid: UInt, dwroutingpid: UInt, lpentry: Long, dwentrysize: UInt): UInt =
    0u

public actual fun MprAdminMIBEntryDelete(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: Long, dwentrysize: UInt): UInt =
    0u

public actual fun MprAdminMIBEntryGet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: Long, dwinentrysize: UInt, lplpoutentry: Long, lpoutentrysize: Long): UInt =
    0u

public actual fun MprAdminMIBEntryGetFirst(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: Long, dwinentrysize: UInt, lplpoutentry: Long, lpoutentrysize: Long): UInt =
    0u

public actual fun MprAdminMIBEntryGetNext(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: Long, dwinentrysize: UInt, lplpoutentry: Long, lpoutentrysize: Long): UInt =
    0u

public actual fun MprAdminMIBEntrySet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: Long, dwentrysize: UInt): UInt =
    0u

public actual fun MprAdminMIBServerConnect(lpwsservername: PCWSTR, phmibserver: Long): UInt =
    0u

public actual fun MprAdminMIBServerDisconnect(hmibserver: Long) {
}

public actual fun MprAdminPortClearStats(hrasserver: Long, hport: HANDLE): UInt =
    0u

public actual fun MprAdminPortDisconnect(hrasserver: Long, hport: HANDLE): UInt =
    0u

public actual fun MprAdminPortEnum(hrasserver: Long, dwlevel: UInt, hrasconnection: HANDLE, lplpbbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    0u

public actual fun MprAdminPortGetInfo(hrasserver: Long, dwlevel: UInt, hport: HANDLE, lplpbbuffer: Long): UInt =
    0u

public actual fun MprAdminPortReset(hrasserver: Long, hport: HANDLE): UInt =
    0u

public actual fun MprAdminRegisterConnectionNotification(hmprserver: Long, heventnotification: HANDLE): UInt =
    0u

public actual fun MprAdminSendUserMessage(hmprserver: Long, hconnection: HANDLE, lpwszmessage: PCWSTR): UInt =
    0u

public actual fun MprAdminServerConnect(lpwsservername: PCWSTR, phmprserver: Long): UInt =
    0u

public actual fun MprAdminServerDisconnect(hmprserver: Long) {
}

public actual fun MprAdminServerGetCredentials(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long): UInt =
    0u

public actual fun MprAdminServerGetInfo(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long): UInt =
    0u

public actual fun MprAdminServerGetInfoEx(hmprserver: Long, pserverinfo: Long): UInt =
    0u

public actual fun MprAdminServerSetCredentials(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long): UInt =
    0u

public actual fun MprAdminServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long): UInt =
    0u

public actual fun MprAdminServerSetInfoEx(hmprserver: Long, pserverinfo: Long): UInt =
    0u

public actual fun MprAdminTransportCreate(hmprserver: Long, dwtransportid: UInt, lpwstransportname: PCWSTR, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt, lpwsdllpath: PCWSTR): UInt =
    0u

public actual fun MprAdminTransportGetInfo(hmprserver: Long, dwtransportid: UInt, ppglobalinfo: Long, lpdwglobalinfosize: Long, ppclientinterfaceinfo: Long, lpdwclientinterfaceinfosize: Long): UInt =
    0u

public actual fun MprAdminTransportSetInfo(hmprserver: Long, dwtransportid: UInt, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt): UInt =
    0u

public actual fun MprAdminUpdateConnection(hrasserver: Long, hrasconnection: HANDLE, prasupdateconnection: Long): UInt =
    0u

public actual fun MprAdminUserGetInfo(lpszserver: PCWSTR, lpszuser: PCWSTR, dwlevel: UInt, lpbbuffer: Long): UInt =
    0u

public actual fun MprAdminUserSetInfo(lpszserver: PCWSTR, lpszuser: PCWSTR, dwlevel: UInt, lpbbuffer: Long): UInt =
    0u

public actual fun MprConfigBufferFree(pbuffer: Long): UInt =
    0u

public actual fun MprConfigFilterGetInfo(hmprconfig: HANDLE, dwlevel: UInt, dwtransportid: UInt, lpbuffer: Long): UInt =
    0u

public actual fun MprConfigFilterSetInfo(hmprconfig: HANDLE, dwlevel: UInt, dwtransportid: UInt, lpbuffer: Long): UInt =
    0u

public actual fun MprConfigGetFriendlyName(hmprconfig: HANDLE, pszguidname: PCWSTR, pszbuffer: PWSTR, dwbuffersize: UInt): UInt =
    0u

public actual fun MprConfigGetGuidName(hmprconfig: HANDLE, pszfriendlyname: PCWSTR, pszbuffer: PWSTR, dwbuffersize: UInt): UInt =
    0u

public actual fun MprConfigInterfaceCreate(hmprconfig: HANDLE, dwlevel: UInt, lpbbuffer: Long, phrouterinterface: Long): UInt =
    0u

public actual fun MprConfigInterfaceDelete(hmprconfig: HANDLE, hrouterinterface: HANDLE): UInt =
    0u

public actual fun MprConfigInterfaceEnum(hmprconfig: HANDLE, dwlevel: UInt, lplpbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    0u

public actual fun MprConfigInterfaceGetCustomInfoEx(hmprconfig: HANDLE, hrouterinterface: HANDLE, pcustominfo: Long): UInt =
    0u

public actual fun MprConfigInterfaceGetHandle(hmprconfig: HANDLE, lpwsinterfacename: PCWSTR, phrouterinterface: Long): UInt =
    0u

public actual fun MprConfigInterfaceGetInfo(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwlevel: UInt, lplpbuffer: Long, lpdwbuffersize: Long): UInt =
    0u

public actual fun MprConfigInterfaceSetCustomInfoEx(hmprconfig: HANDLE, hrouterinterface: HANDLE, pcustominfo: Long): UInt =
    0u

public actual fun MprConfigInterfaceSetInfo(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwlevel: UInt, lpbbuffer: Long): UInt =
    0u

public actual fun MprConfigInterfaceTransportAdd(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwtransportid: UInt, lpwstransportname: PCWSTR, pinterfaceinfo: Long, dwinterfaceinfosize: UInt, phrouteriftransport: Long): UInt =
    0u

public actual fun MprConfigInterfaceTransportEnum(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwlevel: UInt, lplpbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    0u

public actual fun MprConfigInterfaceTransportGetHandle(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwtransportid: UInt, phrouteriftransport: Long): UInt =
    0u

public actual fun MprConfigInterfaceTransportGetInfo(hmprconfig: HANDLE, hrouterinterface: HANDLE, hrouteriftransport: HANDLE, ppinterfaceinfo: Long, lpdwinterfaceinfosize: Long): UInt =
    0u

public actual fun MprConfigInterfaceTransportRemove(hmprconfig: HANDLE, hrouterinterface: HANDLE, hrouteriftransport: HANDLE): UInt =
    0u

public actual fun MprConfigInterfaceTransportSetInfo(hmprconfig: HANDLE, hrouterinterface: HANDLE, hrouteriftransport: HANDLE, pinterfaceinfo: Long, dwinterfaceinfosize: UInt): UInt =
    0u

public actual fun MprConfigServerBackup(hmprconfig: HANDLE, lpwspath: PCWSTR): UInt =
    0u

public actual fun MprConfigServerConnect(lpwsservername: PCWSTR, phmprconfig: Long): UInt =
    0u

public actual fun MprConfigServerDisconnect(hmprconfig: HANDLE) {
}

public actual fun MprConfigServerGetInfo(hmprconfig: HANDLE, dwlevel: UInt, lplpbbuffer: Long): UInt =
    0u

public actual fun MprConfigServerGetInfoEx(hmprconfig: HANDLE, pserverinfo: Long): UInt =
    0u

public actual fun MprConfigServerInstall(dwlevel: UInt, pbuffer: Long): UInt =
    0u

public actual fun MprConfigServerRefresh(hmprconfig: HANDLE): UInt =
    0u

public actual fun MprConfigServerRestore(hmprconfig: HANDLE, lpwspath: PCWSTR): UInt =
    0u

public actual fun MprConfigServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long): UInt =
    0u

public actual fun MprConfigServerSetInfoEx(hmprconfig: HANDLE, psetserverconfig: Long): UInt =
    0u

public actual fun MprConfigTransportCreate(hmprconfig: HANDLE, dwtransportid: UInt, lpwstransportname: PCWSTR, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt, lpwsdllpath: PCWSTR, phroutertransport: Long): UInt =
    0u

public actual fun MprConfigTransportDelete(hmprconfig: HANDLE, hroutertransport: HANDLE): UInt =
    0u

public actual fun MprConfigTransportEnum(hmprconfig: HANDLE, dwlevel: UInt, lplpbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    0u

public actual fun MprConfigTransportGetHandle(hmprconfig: HANDLE, dwtransportid: UInt, phroutertransport: Long): UInt =
    0u

public actual fun MprConfigTransportGetInfo(hmprconfig: HANDLE, hroutertransport: HANDLE, ppglobalinfo: Long, lpdwglobalinfosize: Long, ppclientinterfaceinfo: Long, lpdwclientinterfaceinfosize: Long, lplpwsdllpath: Long): UInt =
    0u

public actual fun MprConfigTransportSetInfo(hmprconfig: HANDLE, hroutertransport: HANDLE, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt, lpwsdllpath: PCWSTR): UInt =
    0u

public actual fun MprInfoBlockAdd(lpheader: Long, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: Long, lplpnewheader: Long): UInt =
    0u

public actual fun MprInfoBlockFind(lpheader: Long, dwinfotype: UInt, lpdwitemsize: Long, lpdwitemcount: Long, lplpitemdata: Long): UInt =
    0u

public actual fun MprInfoBlockQuerySize(lpheader: Long): UInt =
    0u

public actual fun MprInfoBlockRemove(lpheader: Long, dwinfotype: UInt, lplpnewheader: Long): UInt =
    0u

public actual fun MprInfoBlockSet(lpheader: Long, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: Long, lplpnewheader: Long): UInt =
    0u

public actual fun MprInfoCreate(dwversion: UInt, lplpnewheader: Long): UInt =
    0u

public actual fun MprInfoDelete(lpheader: Long): UInt =
    0u

public actual fun MprInfoDuplicate(lpheader: Long, lplpnewheader: Long): UInt =
    0u

public actual fun MprInfoRemoveAll(lpheader: Long, lplpnewheader: Long): UInt =
    0u

public actual fun RasClearConnectionStatistics(hrasconn: HRASCONN): UInt =
    0u

public actual fun RasClearLinkStatistics(hrasconn: HRASCONN, dwsubentry: UInt): UInt =
    0u

public actual fun RasConnectionNotificationA(param0: HRASCONN, param1: HANDLE, param2: UInt): UInt =
    0u

public actual fun RasConnectionNotificationW(param0: HRASCONN, param1: HANDLE, param2: UInt): UInt =
    0u

public actual fun RasCreatePhonebookEntryA(param0: HWND, param1: PCSTR): UInt =
    0u

public actual fun RasCreatePhonebookEntryW(param0: HWND, param1: PCWSTR): UInt =
    0u

public actual fun RasDeleteEntryA(param0: PCSTR, param1: PCSTR): UInt =
    0u

public actual fun RasDeleteEntryW(param0: PCWSTR, param1: PCWSTR): UInt =
    0u

public actual fun RasDeleteSubEntryA(pszphonebook: PCSTR, pszentry: PCSTR, dwsubentryid: UInt): UInt =
    0u

public actual fun RasDeleteSubEntryW(pszphonebook: PCWSTR, pszentry: PCWSTR, dwsubentryid: UInt): UInt =
    0u

public actual fun RasDialA(param0: Long, param1: PCSTR, param2: Long, param3: UInt, param4: Long, param5: Long): UInt =
    0u

public actual fun RasDialDlgA(lpszphonebook: PCSTR, lpszentry: PCSTR, lpszphonenumber: PCSTR, lpinfo: Long): BOOL =
    0

public actual fun RasDialDlgW(lpszphonebook: PCWSTR, lpszentry: PCWSTR, lpszphonenumber: PCWSTR, lpinfo: Long): BOOL =
    0

public actual fun RasDialW(param0: Long, param1: PCWSTR, param2: Long, param3: UInt, param4: Long, param5: Long): UInt =
    0u

public actual fun RasEditPhonebookEntryA(param0: HWND, param1: PCSTR, param2: PCSTR): UInt =
    0u

public actual fun RasEditPhonebookEntryW(param0: HWND, param1: PCWSTR, param2: PCWSTR): UInt =
    0u

public actual fun RasEntryDlgA(lpszphonebook: PCSTR, lpszentry: PCSTR, lpinfo: Long): BOOL =
    0

public actual fun RasEntryDlgW(lpszphonebook: PCWSTR, lpszentry: PCWSTR, lpinfo: Long): BOOL =
    0

public actual fun RasEnumAutodialAddressesA(lpprasautodialaddresses: Long, lpdwcbrasautodialaddresses: Long, lpdwcrasautodialaddresses: Long): UInt =
    0u

public actual fun RasEnumAutodialAddressesW(lpprasautodialaddresses: Long, lpdwcbrasautodialaddresses: Long, lpdwcrasautodialaddresses: Long): UInt =
    0u

public actual fun RasEnumConnectionsA(param0: Long, param1: Long, param2: Long): UInt =
    0u

public actual fun RasEnumConnectionsW(param0: Long, param1: Long, param2: Long): UInt =
    0u

public actual fun RasEnumDevicesA(param0: Long, param1: Long, param2: Long): UInt =
    0u

public actual fun RasEnumDevicesW(param0: Long, param1: Long, param2: Long): UInt =
    0u

public actual fun RasEnumEntriesA(param0: PCSTR, param1: PCSTR, param2: Long, param3: Long, param4: Long): UInt =
    0u

public actual fun RasEnumEntriesW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: Long, param4: Long): UInt =
    0u

public actual fun RasFreeEapUserIdentityA(praseapuseridentity: Long) {
}

public actual fun RasFreeEapUserIdentityW(praseapuseridentity: Long) {
}

public actual fun RasGetAutodialAddressA(param0: PCSTR, param1: Long, param2: Long, param3: Long, param4: Long): UInt =
    0u

public actual fun RasGetAutodialAddressW(param0: PCWSTR, param1: Long, param2: Long, param3: Long, param4: Long): UInt =
    0u

public actual fun RasGetAutodialEnableA(param0: UInt, param1: Long): UInt =
    0u

public actual fun RasGetAutodialEnableW(param0: UInt, param1: Long): UInt =
    0u

public actual fun RasGetAutodialParamA(param0: UInt, param1: Long, param2: Long): UInt =
    0u

public actual fun RasGetAutodialParamW(param0: UInt, param1: Long, param2: Long): UInt =
    0u

public actual fun RasGetConnectStatusA(param0: HRASCONN, param1: Long): UInt =
    0u

public actual fun RasGetConnectStatusW(param0: HRASCONN, param1: Long): UInt =
    0u

public actual fun RasGetConnectionStatistics(hrasconn: HRASCONN, lpstatistics: Long): UInt =
    0u

public actual fun RasGetCountryInfoA(param0: Long, param1: Long): UInt =
    0u

public actual fun RasGetCountryInfoW(param0: Long, param1: Long): UInt =
    0u

public actual fun RasGetCredentialsA(param0: PCSTR, param1: PCSTR, param2: Long): UInt =
    0u

public actual fun RasGetCredentialsW(param0: PCWSTR, param1: PCWSTR, param2: Long): UInt =
    0u

public actual fun RasGetCustomAuthDataA(pszphonebook: PCSTR, pszentry: PCSTR, pbcustomauthdata: Long, pdwsizeofcustomauthdata: Long): UInt =
    0u

public actual fun RasGetCustomAuthDataW(pszphonebook: PCWSTR, pszentry: PCWSTR, pbcustomauthdata: Long, pdwsizeofcustomauthdata: Long): UInt =
    0u

public actual fun RasGetEapUserDataA(htoken: HANDLE, pszphonebook: PCSTR, pszentry: PCSTR, pbeapdata: Long, pdwsizeofeapdata: Long): UInt =
    0u

public actual fun RasGetEapUserDataW(htoken: HANDLE, pszphonebook: PCWSTR, pszentry: PCWSTR, pbeapdata: Long, pdwsizeofeapdata: Long): UInt =
    0u

public actual fun RasGetEapUserIdentityA(pszphonebook: PCSTR, pszentry: PCSTR, dwflags: UInt, hwnd: HWND, ppraseapuseridentity: Long): UInt =
    0u

public actual fun RasGetEapUserIdentityW(pszphonebook: PCWSTR, pszentry: PCWSTR, dwflags: UInt, hwnd: HWND, ppraseapuseridentity: Long): UInt =
    0u

public actual fun RasGetEntryDialParamsA(param0: PCSTR, param1: Long, param2: Long): UInt =
    0u

public actual fun RasGetEntryDialParamsW(param0: PCWSTR, param1: Long, param2: Long): UInt =
    0u

public actual fun RasGetEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: Long, param3: Long, param4: Long, param5: Long): UInt =
    0u

public actual fun RasGetEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: Long, param4: Long, param5: Long): UInt =
    0u

public actual fun RasGetErrorStringA(resourceid: UInt, lpszstring: PSTR, inbufsize: UInt): UInt =
    0u

public actual fun RasGetErrorStringW(resourceid: UInt, lpszstring: PWSTR, inbufsize: UInt): UInt =
    0u

public actual fun RasGetLinkStatistics(hrasconn: HRASCONN, dwsubentry: UInt, lpstatistics: Long): UInt =
    0u

public actual fun RasGetPCscf(lpszpcscf: PWSTR): UInt =
    0u

public actual fun RasGetProjectionInfoA(param0: HRASCONN, param1: RASPROJECTION, param2: Long, param3: Long): UInt =
    0u

public actual fun RasGetProjectionInfoEx(hrasconn: HRASCONN, prasprojection: Long, lpdwsize: Long): UInt =
    0u

public actual fun RasGetProjectionInfoW(param0: HRASCONN, param1: RASPROJECTION, param2: Long, param3: Long): UInt =
    0u

public actual fun RasGetSubEntryHandleA(param0: HRASCONN, param1: UInt, param2: Long): UInt =
    0u

public actual fun RasGetSubEntryHandleW(param0: HRASCONN, param1: UInt, param2: Long): UInt =
    0u

public actual fun RasGetSubEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: UInt, param3: Long, param4: Long, param5: Long, param6: Long): UInt =
    0u

public actual fun RasGetSubEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: UInt, param3: Long, param4: Long, param5: Long, param6: Long): UInt =
    0u

public actual fun RasHangUpA(param0: HRASCONN): UInt =
    0u

public actual fun RasHangUpW(param0: HRASCONN): UInt =
    0u

public actual fun RasInvokeEapUI(param0: HRASCONN, param1: UInt, param2: Long, param3: HWND): UInt =
    0u

public actual fun RasPhonebookDlgA(lpszphonebook: PCSTR, lpszentry: PCSTR, lpinfo: Long): BOOL =
    0

public actual fun RasPhonebookDlgW(lpszphonebook: PCWSTR, lpszentry: PCWSTR, lpinfo: Long): BOOL =
    0

public actual fun RasRenameEntryA(param0: PCSTR, param1: PCSTR, param2: PCSTR): UInt =
    0u

public actual fun RasRenameEntryW(param0: PCWSTR, param1: PCWSTR, param2: PCWSTR): UInt =
    0u

public actual fun RasSetAutodialAddressA(param0: PCSTR, param1: UInt, param2: Long, param3: UInt, param4: UInt): UInt =
    0u

public actual fun RasSetAutodialAddressW(param0: PCWSTR, param1: UInt, param2: Long, param3: UInt, param4: UInt): UInt =
    0u

public actual fun RasSetAutodialEnableA(param0: UInt, param1: BOOL): UInt =
    0u

public actual fun RasSetAutodialEnableW(param0: UInt, param1: BOOL): UInt =
    0u

public actual fun RasSetAutodialParamA(param0: UInt, param1: Long, param2: UInt): UInt =
    0u

public actual fun RasSetAutodialParamW(param0: UInt, param1: Long, param2: UInt): UInt =
    0u

public actual fun RasSetCredentialsA(param0: PCSTR, param1: PCSTR, param2: Long, param3: BOOL): UInt =
    0u

public actual fun RasSetCredentialsW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: BOOL): UInt =
    0u

public actual fun RasSetCustomAuthDataA(pszphonebook: PCSTR, pszentry: PCSTR, pbcustomauthdata: Long, dwsizeofcustomauthdata: UInt): UInt =
    0u

public actual fun RasSetCustomAuthDataW(pszphonebook: PCWSTR, pszentry: PCWSTR, pbcustomauthdata: Long, dwsizeofcustomauthdata: UInt): UInt =
    0u

public actual fun RasSetEapUserDataA(htoken: HANDLE, pszphonebook: PCSTR, pszentry: PCSTR, pbeapdata: Long, dwsizeofeapdata: UInt): UInt =
    0u

public actual fun RasSetEapUserDataW(htoken: HANDLE, pszphonebook: PCWSTR, pszentry: PCWSTR, pbeapdata: Long, dwsizeofeapdata: UInt): UInt =
    0u

public actual fun RasSetEntryDialParamsA(param0: PCSTR, param1: Long, param2: BOOL): UInt =
    0u

public actual fun RasSetEntryDialParamsW(param0: PCWSTR, param1: Long, param2: BOOL): UInt =
    0u

public actual fun RasSetEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: Long, param3: UInt, param4: Long, param5: UInt): UInt =
    0u

public actual fun RasSetEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: UInt, param4: Long, param5: UInt): UInt =
    0u

public actual fun RasSetSubEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: UInt, param3: Long, param4: UInt, param5: Long, param6: UInt): UInt =
    0u

public actual fun RasSetSubEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: UInt, param3: Long, param4: UInt, param5: Long, param6: UInt): UInt =
    0u

public actual fun RasUpdateConnection(hrasconn: HRASCONN, lprasupdateconn: Long): UInt =
    0u

public actual fun RasValidateEntryNameA(param0: PCSTR, param1: PCSTR): UInt =
    0u

public actual fun RasValidateEntryNameW(param0: PCWSTR, param1: PCWSTR): UInt =
    0u

public actual fun RtmAddNextHop(rtmreghandle: Long, nexthopinfo: Long, nexthophandle: Long, changeflags: Long): UInt =
    0u

public actual fun RtmAddRouteToDest(rtmreghandle: Long, routehandle: Long, destaddress: Long, routeinfo: Long, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: Long): UInt =
    0u

public actual fun RtmBlockMethods(rtmreghandle: Long, targethandle: HANDLE, targettype: UByte, blockingflag: UInt): UInt =
    0u

public actual fun RtmConvertIpv6AddressAndLengthToNetAddress(pnetaddress: Long, address: IN6_ADDR, dwlength: UInt, dwaddresssize: UInt): UInt =
    0u

public actual fun RtmConvertNetAddressToIpv6AddressAndLength(pnetaddress: Long, paddress: Long, plength: Long, dwaddresssize: UInt): UInt =
    0u

public actual fun RtmCreateDestEnum(rtmreghandle: Long, targetviews: UInt, enumflags: UInt, netaddress: Long, protocolid: UInt, rtmenumhandle: Long): UInt =
    0u

public actual fun RtmCreateNextHopEnum(rtmreghandle: Long, enumflags: UInt, netaddress: Long, rtmenumhandle: Long): UInt =
    0u

public actual fun RtmCreateRouteEnum(rtmreghandle: Long, desthandle: Long, targetviews: UInt, enumflags: UInt, startdest: Long, matchingflags: UInt, criteriaroute: Long, criteriainterface: UInt, rtmenumhandle: Long): UInt =
    0u

public actual fun RtmCreateRouteList(rtmreghandle: Long, routelisthandle: Long): UInt =
    0u

public actual fun RtmCreateRouteListEnum(rtmreghandle: Long, routelisthandle: Long, rtmenumhandle: Long): UInt =
    0u

public actual fun RtmDeleteEnumHandle(rtmreghandle: Long, enumhandle: Long): UInt =
    0u

public actual fun RtmDeleteNextHop(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: Long): UInt =
    0u

public actual fun RtmDeleteRouteList(rtmreghandle: Long, routelisthandle: Long): UInt =
    0u

public actual fun RtmDeleteRouteToDest(rtmreghandle: Long, routehandle: Long, changeflags: Long): UInt =
    0u

public actual fun RtmDeregisterEntity(rtmreghandle: Long): UInt =
    0u

public actual fun RtmDeregisterFromChangeNotification(rtmreghandle: Long, notifyhandle: Long): UInt =
    0u

public actual fun RtmFindNextHop(rtmreghandle: Long, nexthopinfo: Long, nexthophandle: Long, nexthoppointer: Long): UInt =
    0u

public actual fun RtmGetChangeStatus(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, changestatus: Long): UInt =
    0u

public actual fun RtmGetChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: Long, changeddests: Long): UInt =
    0u

public actual fun RtmGetDestInfo(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt =
    0u

public actual fun RtmGetEntityInfo(rtmreghandle: Long, entityhandle: Long, entityinfo: Long): UInt =
    0u

public actual fun RtmGetEntityMethods(rtmreghandle: Long, entityhandle: Long, nummethods: Long, exptmethods: Long): UInt =
    0u

public actual fun RtmGetEnumDests(rtmreghandle: Long, enumhandle: Long, numdests: Long, destinfos: Long): UInt =
    0u

public actual fun RtmGetEnumNextHops(rtmreghandle: Long, enumhandle: Long, numnexthops: Long, nexthophandles: Long): UInt =
    0u

public actual fun RtmGetEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: Long, routehandles: Long): UInt =
    0u

public actual fun RtmGetExactMatchDestination(rtmreghandle: Long, destaddress: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt =
    0u

public actual fun RtmGetExactMatchRoute(rtmreghandle: Long, destaddress: Long, matchingflags: UInt, routeinfo: Long, interfaceindex: UInt, targetviews: UInt, routehandle: Long): UInt =
    0u

public actual fun RtmGetLessSpecificDestination(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt =
    0u

public actual fun RtmGetListEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: Long, routehandles: Long): UInt =
    0u

public actual fun RtmGetMostSpecificDestination(rtmreghandle: Long, destaddress: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt =
    0u

public actual fun RtmGetNextHopInfo(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: Long): UInt =
    0u

public actual fun RtmGetNextHopPointer(rtmreghandle: Long, nexthophandle: Long, nexthoppointer: Long): UInt =
    0u

public actual fun RtmGetOpaqueInformationPointer(rtmreghandle: Long, desthandle: Long, opaqueinfopointer: Long): UInt =
    0u

public actual fun RtmGetRegisteredEntities(rtmreghandle: Long, numentities: Long, entityhandles: Long, entityinfos: Long): UInt =
    0u

public actual fun RtmGetRouteInfo(rtmreghandle: Long, routehandle: Long, routeinfo: Long, destaddress: Long): UInt =
    0u

public actual fun RtmGetRoutePointer(rtmreghandle: Long, routehandle: Long, routepointer: Long): UInt =
    0u

public actual fun RtmHoldDestination(rtmreghandle: Long, desthandle: Long, targetviews: UInt, holdtime: UInt): UInt =
    0u

public actual fun RtmIgnoreChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: Long): UInt =
    0u

public actual fun RtmInsertInRouteList(rtmreghandle: Long, routelisthandle: Long, numroutes: UInt, routehandles: Long): UInt =
    0u

public actual fun RtmInvokeMethod(rtmreghandle: Long, entityhandle: Long, input: Long, outputsize: Long, output: Long): UInt =
    0u

public actual fun RtmIsBestRoute(rtmreghandle: Long, routehandle: Long, bestinviews: Long): UInt =
    0u

public actual fun RtmIsMarkedForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, destmarked: Long): UInt =
    0u

public actual fun RtmLockDestination(rtmreghandle: Long, desthandle: Long, exclusive: BOOL, lockdest: BOOL): UInt =
    0u

public actual fun RtmLockNextHop(rtmreghandle: Long, nexthophandle: Long, exclusive: BOOL, locknexthop: BOOL, nexthoppointer: Long): UInt =
    0u

public actual fun RtmLockRoute(rtmreghandle: Long, routehandle: Long, exclusive: BOOL, lockroute: BOOL, routepointer: Long): UInt =
    0u

public actual fun RtmMarkDestForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, markdest: BOOL): UInt =
    0u

public actual fun RtmReferenceHandles(rtmreghandle: Long, numhandles: UInt, rtmhandles: Long): UInt =
    0u

public actual fun RtmRegisterEntity(rtmentityinfo: Long, exportmethods: Long, eventcallback: RTM_EVENT_CALLBACK, reserveopaquepointer: BOOL, rtmregprofile: Long, rtmreghandle: Long): UInt =
    0u

public actual fun RtmRegisterForChangeNotification(rtmreghandle: Long, targetviews: UInt, notifyflags: UInt, notifycontext: Long, notifyhandle: Long): UInt =
    0u

public actual fun RtmReleaseChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: Long): UInt =
    0u

public actual fun RtmReleaseDestInfo(rtmreghandle: Long, destinfo: Long): UInt =
    0u

public actual fun RtmReleaseDests(rtmreghandle: Long, numdests: UInt, destinfos: Long): UInt =
    0u

public actual fun RtmReleaseEntities(rtmreghandle: Long, numentities: UInt, entityhandles: Long): UInt =
    0u

public actual fun RtmReleaseEntityInfo(rtmreghandle: Long, entityinfo: Long): UInt =
    0u

public actual fun RtmReleaseNextHopInfo(rtmreghandle: Long, nexthopinfo: Long): UInt =
    0u

public actual fun RtmReleaseNextHops(rtmreghandle: Long, numnexthops: UInt, nexthophandles: Long): UInt =
    0u

public actual fun RtmReleaseRouteInfo(rtmreghandle: Long, routeinfo: Long): UInt =
    0u

public actual fun RtmReleaseRoutes(rtmreghandle: Long, numroutes: UInt, routehandles: Long): UInt =
    0u

public actual fun RtmUpdateAndUnlockRoute(rtmreghandle: Long, routehandle: Long, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: Long): UInt =
    0u
