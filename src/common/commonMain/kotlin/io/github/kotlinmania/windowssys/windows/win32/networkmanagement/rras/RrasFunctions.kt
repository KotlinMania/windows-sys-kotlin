package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.In6Addr
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.MibIpmcastMfe

public expect fun mgmAddGroupMembershipEntry(hprotocol: Handle, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt

public expect fun mgmDeRegisterMProtocol(hprotocol: Handle): UInt

public expect fun mgmDeleteGroupMembershipEntry(hprotocol: Handle, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt

public expect fun mgmGetFirstMfe(pdwbuffersize: MutPtr<UInt>, pbbuffer: MutPtr<UByte>, pdwnumentries: MutPtr<UInt>): UInt

public expect fun mgmGetFirstMfeStats(pdwbuffersize: MutPtr<UInt>, pbbuffer: MutPtr<UByte>, pdwnumentries: MutPtr<UInt>, dwflags: UInt): UInt

public expect fun mgmGetMfe(pimm: MutPtr<MibIpmcastMfe>, pdwbuffersize: MutPtr<UInt>, pbbuffer: MutPtr<UByte>): UInt

public expect fun mgmGetMfeStats(pimm: MutPtr<MibIpmcastMfe>, pdwbuffersize: MutPtr<UInt>, pbbuffer: MutPtr<UByte>, dwflags: UInt): UInt

public expect fun mgmGetNextMfe(pimmstart: MutPtr<MibIpmcastMfe>, pdwbuffersize: MutPtr<UInt>, pbbuffer: MutPtr<UByte>, pdwnumentries: MutPtr<UInt>): UInt

public expect fun mgmGetNextMfeStats(pimmstart: MutPtr<MibIpmcastMfe>, pdwbuffersize: MutPtr<UInt>, pbbuffer: MutPtr<UByte>, pdwnumentries: MutPtr<UInt>, dwflags: UInt): UInt

public expect fun mgmGetProtocolOnInterface(dwifindex: UInt, dwifnexthopaddr: UInt, pdwifprotocolid: MutPtr<UInt>, pdwifcomponentid: MutPtr<UInt>): UInt

public expect fun mgmGroupEnumerationEnd(henum: Handle): UInt

public expect fun mgmGroupEnumerationGetNext(henum: Handle, pdwbuffersize: MutPtr<UInt>, pbbuffer: MutPtr<UByte>, pdwnumentries: MutPtr<UInt>): UInt

public expect fun mgmGroupEnumerationStart(hprotocol: Handle, metenumtype: MgmEnumTypes, phenumhandle: MutPtr<Handle>): UInt

public expect fun mgmRegisterMProtocol(prpiinfo: MutPtr<RoutingProtocolConfig>, dwprotocolid: UInt, dwcomponentid: UInt, phprotocol: MutPtr<Handle>): UInt

public expect fun mgmReleaseInterfaceOwnership(hprotocol: Handle, dwifindex: UInt, dwifnexthopaddr: UInt): UInt

public expect fun mgmTakeInterfaceOwnership(hprotocol: Handle, dwifindex: UInt, dwifnexthopaddr: UInt): UInt

public expect fun mprAdminBufferFree(pbuffer: ConstPtr<CVoid>): UInt

public expect fun mprAdminConnectionClearStats(hrasserver: Long, hrasconnection: Handle): UInt

public expect fun mprAdminConnectionEnum(hrasserver: Long, dwlevel: UInt, lplpbbuffer: MutPtr<MutPtr<UByte>>, dwprefmaxlen: UInt, lpdwentriesread: MutPtr<UInt>, lpdwtotalentries: MutPtr<UInt>, lpdwresumehandle: ConstPtr<UInt>): UInt

public expect fun mprAdminConnectionEnumEx(hrasserver: Long, pobjectheader: ConstPtr<MprapiObjectHeader>, dwpreferedmaxlen: UInt, lpdwentriesread: MutPtr<UInt>, lpdwtotalentries: MutPtr<UInt>, pprasconn: MutPtr<MutPtr<RasConnectionEx>>, lpdwresumehandle: ConstPtr<UInt>): UInt

public expect fun mprAdminConnectionGetInfo(hrasserver: Long, dwlevel: UInt, hrasconnection: Handle, lplpbbuffer: MutPtr<MutPtr<UByte>>): UInt

public expect fun mprAdminConnectionGetInfoEx(hrasserver: Long, hrasconnection: Handle, prasconnection: MutPtr<RasConnectionEx>): UInt

public expect fun mprAdminConnectionRemoveQuarantine(hrasserver: Handle, hrasconnection: Handle, fisipaddress: Bool): UInt

public expect fun mprAdminDeregisterConnectionNotification(hmprserver: Long, heventnotification: Handle): UInt

public expect fun mprAdminDeviceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: MutPtr<MutPtr<UByte>>, lpdwtotalentries: MutPtr<UInt>): UInt

public expect fun mprAdminEstablishDomainRasServer(pszdomain: Pcwstr, pszmachine: Pcwstr, benable: Bool): UInt

public expect fun mprAdminGetErrorString(dwerror: UInt, lplpwserrorstring: MutPtr<Pwstr>): UInt

public expect fun mprAdminGetPDCServer(lpszdomain: Pcwstr, lpszserver: Pcwstr, lpszpdcserver: Pwstr): UInt

public expect fun mprAdminInterfaceConnect(hmprserver: Long, hinterface: Handle, hevent: Handle, fsynchronous: Bool): UInt

public expect fun mprAdminInterfaceCreate(hmprserver: Long, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>, phinterface: MutPtr<Handle>): UInt

public expect fun mprAdminInterfaceDelete(hmprserver: Long, hinterface: Handle): UInt

public expect fun mprAdminInterfaceDeviceGetInfo(hmprserver: Long, hinterface: Handle, dwindex: UInt, dwlevel: UInt, lplpbuffer: MutPtr<MutPtr<UByte>>): UInt

public expect fun mprAdminInterfaceDeviceSetInfo(hmprserver: Long, hinterface: Handle, dwindex: UInt, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt

public expect fun mprAdminInterfaceDisconnect(hmprserver: Long, hinterface: Handle): UInt

public expect fun mprAdminInterfaceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: MutPtr<MutPtr<UByte>>, dwprefmaxlen: UInt, lpdwentriesread: MutPtr<UInt>, lpdwtotalentries: MutPtr<UInt>, lpdwresumehandle: ConstPtr<UInt>): UInt

public expect fun mprAdminInterfaceGetCredentials(lpwsserver: Pcwstr, lpwsinterfacename: Pcwstr, lpwsusername: Pwstr, lpwspassword: Pwstr, lpwsdomainname: Pwstr): UInt

public expect fun mprAdminInterfaceGetCredentialsEx(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lplpbbuffer: MutPtr<MutPtr<UByte>>): UInt

public expect fun mprAdminInterfaceGetCustomInfoEx(hmprserver: Long, hinterface: Handle, pcustominfo: MutPtr<MprIfCustominfoex2>): UInt

public expect fun mprAdminInterfaceGetHandle(hmprserver: Long, lpwsinterfacename: Pcwstr, phinterface: MutPtr<Handle>, fincludeclientinterfaces: Bool): UInt

public expect fun mprAdminInterfaceGetInfo(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lplpbbuffer: ConstPtr<ConstPtr<UByte>>): UInt

public expect fun mprAdminInterfaceQueryUpdateResult(hmprserver: Long, hinterface: Handle, dwprotocolid: UInt, lpdwupdateresult: MutPtr<UInt>): UInt

public expect fun mprAdminInterfaceSetCredentials(lpwsserver: Pcwstr, lpwsinterfacename: Pcwstr, lpwsusername: Pcwstr, lpwsdomainname: Pcwstr, lpwspassword: Pcwstr): UInt

public expect fun mprAdminInterfaceSetCredentialsEx(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt

public expect fun mprAdminInterfaceSetCustomInfoEx(hmprserver: Long, hinterface: Handle, pcustominfo: ConstPtr<MprIfCustominfoex2>): UInt

public expect fun mprAdminInterfaceSetInfo(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt

public expect fun mprAdminInterfaceTransportAdd(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, pinterfaceinfo: ConstPtr<UByte>, dwinterfaceinfosize: UInt): UInt

public expect fun mprAdminInterfaceTransportGetInfo(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, ppinterfaceinfo: MutPtr<MutPtr<UByte>>, lpdwinterfaceinfosize: MutPtr<UInt>): UInt

public expect fun mprAdminInterfaceTransportRemove(hmprserver: Long, hinterface: Handle, dwtransportid: UInt): UInt

public expect fun mprAdminInterfaceTransportSetInfo(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, pinterfaceinfo: ConstPtr<UByte>, dwinterfaceinfosize: UInt): UInt

public expect fun mprAdminInterfaceUpdatePhonebookInfo(hmprserver: Long, hinterface: Handle): UInt

public expect fun mprAdminInterfaceUpdateRoutes(hmprserver: Long, hinterface: Handle, dwprotocolid: UInt, hevent: Handle): UInt

public expect fun mprAdminIsDomainRasServer(pszdomain: Pcwstr, pszmachine: Pcwstr, pbisrasserver: MutPtr<Bool>): UInt

public expect fun mprAdminIsServiceInitialized(lpwsservername: Pcwstr, fisserviceinitialized: ConstPtr<Bool>): UInt

public expect fun mprAdminIsServiceRunning(lpwsservername: Pcwstr): Bool

public expect fun mprAdminMIBBufferFree(pbuffer: ConstPtr<CVoid>): UInt

public expect fun mprAdminMIBEntryCreate(hmibserver: Long, dwpid: UInt, dwroutingpid: UInt, lpentry: ConstPtr<CVoid>, dwentrysize: UInt): UInt

public expect fun mprAdminMIBEntryDelete(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: ConstPtr<CVoid>, dwentrysize: UInt): UInt

public expect fun mprAdminMIBEntryGet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: ConstPtr<CVoid>, dwinentrysize: UInt, lplpoutentry: MutPtr<MutPtr<CVoid>>, lpoutentrysize: MutPtr<UInt>): UInt

public expect fun mprAdminMIBEntryGetFirst(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: ConstPtr<CVoid>, dwinentrysize: UInt, lplpoutentry: MutPtr<MutPtr<CVoid>>, lpoutentrysize: MutPtr<UInt>): UInt

public expect fun mprAdminMIBEntryGetNext(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: ConstPtr<CVoid>, dwinentrysize: UInt, lplpoutentry: MutPtr<MutPtr<CVoid>>, lpoutentrysize: MutPtr<UInt>): UInt

public expect fun mprAdminMIBEntrySet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: ConstPtr<CVoid>, dwentrysize: UInt): UInt

public expect fun mprAdminMIBServerConnect(lpwsservername: Pcwstr, phmibserver: MutPtr<Long>): UInt

public expect fun mprAdminMIBServerDisconnect(hmibserver: Long)

public expect fun mprAdminPortClearStats(hrasserver: Long, hport: Handle): UInt

public expect fun mprAdminPortDisconnect(hrasserver: Long, hport: Handle): UInt

public expect fun mprAdminPortEnum(hrasserver: Long, dwlevel: UInt, hrasconnection: Handle, lplpbbuffer: MutPtr<MutPtr<UByte>>, dwprefmaxlen: UInt, lpdwentriesread: MutPtr<UInt>, lpdwtotalentries: MutPtr<UInt>, lpdwresumehandle: ConstPtr<UInt>): UInt

public expect fun mprAdminPortGetInfo(hrasserver: Long, dwlevel: UInt, hport: Handle, lplpbbuffer: MutPtr<MutPtr<UByte>>): UInt

public expect fun mprAdminPortReset(hrasserver: Long, hport: Handle): UInt

public expect fun mprAdminRegisterConnectionNotification(hmprserver: Long, heventnotification: Handle): UInt

public expect fun mprAdminSendUserMessage(hmprserver: Long, hconnection: Handle, lpwszmessage: Pcwstr): UInt

public expect fun mprAdminServerConnect(lpwsservername: Pcwstr, phmprserver: MutPtr<Long>): UInt

public expect fun mprAdminServerDisconnect(hmprserver: Long)

public expect fun mprAdminServerGetCredentials(hmprserver: Long, dwlevel: UInt, lplpbbuffer: ConstPtr<ConstPtr<UByte>>): UInt

public expect fun mprAdminServerGetInfo(hmprserver: Long, dwlevel: UInt, lplpbbuffer: MutPtr<MutPtr<UByte>>): UInt

public expect fun mprAdminServerGetInfoEx(hmprserver: Long, pserverinfo: MutPtr<MprServerEx1>): UInt

public expect fun mprAdminServerSetCredentials(hmprserver: Long, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt

public expect fun mprAdminServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt

public expect fun mprAdminServerSetInfoEx(hmprserver: Long, pserverinfo: ConstPtr<MprServerSetConfigEx1>): UInt

public expect fun mprAdminTransportCreate(hmprserver: Long, dwtransportid: UInt, lpwstransportname: Pcwstr, pglobalinfo: ConstPtr<UByte>, dwglobalinfosize: UInt, pclientinterfaceinfo: ConstPtr<UByte>, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr): UInt

public expect fun mprAdminTransportGetInfo(hmprserver: Long, dwtransportid: UInt, ppglobalinfo: MutPtr<MutPtr<UByte>>, lpdwglobalinfosize: MutPtr<UInt>, ppclientinterfaceinfo: MutPtr<MutPtr<UByte>>, lpdwclientinterfaceinfosize: MutPtr<UInt>): UInt

public expect fun mprAdminTransportSetInfo(hmprserver: Long, dwtransportid: UInt, pglobalinfo: ConstPtr<UByte>, dwglobalinfosize: UInt, pclientinterfaceinfo: ConstPtr<UByte>, dwclientinterfaceinfosize: UInt): UInt

public expect fun mprAdminUpdateConnection(hrasserver: Long, hrasconnection: Handle, prasupdateconnection: ConstPtr<RasUpdateConnection>): UInt

public expect fun mprAdminUserGetInfo(lpszserver: Pcwstr, lpszuser: Pcwstr, dwlevel: UInt, lpbbuffer: MutPtr<UByte>): UInt

public expect fun mprAdminUserSetInfo(lpszserver: Pcwstr, lpszuser: Pcwstr, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt

public expect fun mprConfigBufferFree(pbuffer: ConstPtr<CVoid>): UInt

public expect fun mprConfigFilterGetInfo(hmprconfig: Handle, dwlevel: UInt, dwtransportid: UInt, lpbuffer: MutPtr<UByte>): UInt

public expect fun mprConfigFilterSetInfo(hmprconfig: Handle, dwlevel: UInt, dwtransportid: UInt, lpbuffer: ConstPtr<UByte>): UInt

public expect fun mprConfigGetFriendlyName(hmprconfig: Handle, pszguidname: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt): UInt

public expect fun mprConfigGetGuidName(hmprconfig: Handle, pszfriendlyname: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt): UInt

public expect fun mprConfigInterfaceCreate(hmprconfig: Handle, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>, phrouterinterface: MutPtr<Handle>): UInt

public expect fun mprConfigInterfaceDelete(hmprconfig: Handle, hrouterinterface: Handle): UInt

public expect fun mprConfigInterfaceEnum(hmprconfig: Handle, dwlevel: UInt, lplpbuffer: MutPtr<MutPtr<UByte>>, dwprefmaxlen: UInt, lpdwentriesread: MutPtr<UInt>, lpdwtotalentries: MutPtr<UInt>, lpdwresumehandle: MutPtr<UInt>): UInt

public expect fun mprConfigInterfaceGetCustomInfoEx(hmprconfig: Handle, hrouterinterface: Handle, pcustominfo: MutPtr<MprIfCustominfoex2>): UInt

public expect fun mprConfigInterfaceGetHandle(hmprconfig: Handle, lpwsinterfacename: Pcwstr, phrouterinterface: MutPtr<Handle>): UInt

public expect fun mprConfigInterfaceGetInfo(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lplpbuffer: MutPtr<MutPtr<UByte>>, lpdwbuffersize: MutPtr<UInt>): UInt

public expect fun mprConfigInterfaceSetCustomInfoEx(hmprconfig: Handle, hrouterinterface: Handle, pcustominfo: ConstPtr<MprIfCustominfoex2>): UInt

public expect fun mprConfigInterfaceSetInfo(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt

public expect fun mprConfigInterfaceTransportAdd(hmprconfig: Handle, hrouterinterface: Handle, dwtransportid: UInt, lpwstransportname: Pcwstr, pinterfaceinfo: ConstPtr<UByte>, dwinterfaceinfosize: UInt, phrouteriftransport: MutPtr<Handle>): UInt

public expect fun mprConfigInterfaceTransportEnum(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lplpbuffer: MutPtr<MutPtr<UByte>>, dwprefmaxlen: UInt, lpdwentriesread: MutPtr<UInt>, lpdwtotalentries: MutPtr<UInt>, lpdwresumehandle: MutPtr<UInt>): UInt

public expect fun mprConfigInterfaceTransportGetHandle(hmprconfig: Handle, hrouterinterface: Handle, dwtransportid: UInt, phrouteriftransport: MutPtr<Handle>): UInt

public expect fun mprConfigInterfaceTransportGetInfo(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle, ppinterfaceinfo: MutPtr<MutPtr<UByte>>, lpdwinterfaceinfosize: MutPtr<UInt>): UInt

public expect fun mprConfigInterfaceTransportRemove(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle): UInt

public expect fun mprConfigInterfaceTransportSetInfo(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle, pinterfaceinfo: ConstPtr<UByte>, dwinterfaceinfosize: UInt): UInt

public expect fun mprConfigServerBackup(hmprconfig: Handle, lpwspath: Pcwstr): UInt

public expect fun mprConfigServerConnect(lpwsservername: Pcwstr, phmprconfig: MutPtr<Handle>): UInt

public expect fun mprConfigServerDisconnect(hmprconfig: Handle)

public expect fun mprConfigServerGetInfo(hmprconfig: Handle, dwlevel: UInt, lplpbbuffer: MutPtr<MutPtr<UByte>>): UInt

public expect fun mprConfigServerGetInfoEx(hmprconfig: Handle, pserverinfo: MutPtr<MprServerEx1>): UInt

public expect fun mprConfigServerInstall(dwlevel: UInt, pbuffer: ConstPtr<CVoid>): UInt

public expect fun mprConfigServerRefresh(hmprconfig: Handle): UInt

public expect fun mprConfigServerRestore(hmprconfig: Handle, lpwspath: Pcwstr): UInt

public expect fun mprConfigServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt

public expect fun mprConfigServerSetInfoEx(hmprconfig: Handle, psetserverconfig: ConstPtr<MprServerSetConfigEx1>): UInt

public expect fun mprConfigTransportCreate(hmprconfig: Handle, dwtransportid: UInt, lpwstransportname: Pcwstr, pglobalinfo: ConstPtr<UByte>, dwglobalinfosize: UInt, pclientinterfaceinfo: ConstPtr<UByte>, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr, phroutertransport: MutPtr<Handle>): UInt

public expect fun mprConfigTransportDelete(hmprconfig: Handle, hroutertransport: Handle): UInt

public expect fun mprConfigTransportEnum(hmprconfig: Handle, dwlevel: UInt, lplpbuffer: MutPtr<MutPtr<UByte>>, dwprefmaxlen: UInt, lpdwentriesread: MutPtr<UInt>, lpdwtotalentries: MutPtr<UInt>, lpdwresumehandle: MutPtr<UInt>): UInt

public expect fun mprConfigTransportGetHandle(hmprconfig: Handle, dwtransportid: UInt, phroutertransport: MutPtr<Handle>): UInt

public expect fun mprConfigTransportGetInfo(hmprconfig: Handle, hroutertransport: Handle, ppglobalinfo: MutPtr<MutPtr<UByte>>, lpdwglobalinfosize: MutPtr<UInt>, ppclientinterfaceinfo: MutPtr<MutPtr<UByte>>, lpdwclientinterfaceinfosize: MutPtr<UInt>, lplpwsdllpath: MutPtr<Pwstr>): UInt

public expect fun mprConfigTransportSetInfo(hmprconfig: Handle, hroutertransport: Handle, pglobalinfo: ConstPtr<UByte>, dwglobalinfosize: UInt, pclientinterfaceinfo: ConstPtr<UByte>, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr): UInt

public expect fun mprInfoBlockAdd(lpheader: ConstPtr<CVoid>, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: ConstPtr<UByte>, lplpnewheader: MutPtr<MutPtr<CVoid>>): UInt

public expect fun mprInfoBlockFind(lpheader: ConstPtr<CVoid>, dwinfotype: UInt, lpdwitemsize: MutPtr<UInt>, lpdwitemcount: MutPtr<UInt>, lplpitemdata: MutPtr<MutPtr<UByte>>): UInt

public expect fun mprInfoBlockQuerySize(lpheader: ConstPtr<CVoid>): UInt

public expect fun mprInfoBlockRemove(lpheader: ConstPtr<CVoid>, dwinfotype: UInt, lplpnewheader: MutPtr<MutPtr<CVoid>>): UInt

public expect fun mprInfoBlockSet(lpheader: ConstPtr<CVoid>, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: ConstPtr<UByte>, lplpnewheader: MutPtr<MutPtr<CVoid>>): UInt

public expect fun mprInfoCreate(dwversion: UInt, lplpnewheader: MutPtr<MutPtr<CVoid>>): UInt

public expect fun mprInfoDelete(lpheader: ConstPtr<CVoid>): UInt

public expect fun mprInfoDuplicate(lpheader: ConstPtr<CVoid>, lplpnewheader: MutPtr<MutPtr<CVoid>>): UInt

public expect fun mprInfoRemoveAll(lpheader: ConstPtr<CVoid>, lplpnewheader: MutPtr<MutPtr<CVoid>>): UInt

public expect fun rasClearConnectionStatistics(hrasconn: Hrasconn): UInt

public expect fun rasClearLinkStatistics(hrasconn: Hrasconn, dwsubentry: UInt): UInt

public expect fun rasConnectionNotificationA(param0: Hrasconn, param1: Handle, param2: UInt): UInt

public expect fun rasConnectionNotificationW(param0: Hrasconn, param1: Handle, param2: UInt): UInt

public expect fun rasCreatePhonebookEntryA(param0: Hwnd, param1: Pcstr): UInt

public expect fun rasCreatePhonebookEntryW(param0: Hwnd, param1: Pcwstr): UInt

public expect fun rasDeleteEntryA(param0: Pcstr, param1: Pcstr): UInt

public expect fun rasDeleteEntryW(param0: Pcwstr, param1: Pcwstr): UInt

public expect fun rasDeleteSubEntryA(pszphonebook: Pcstr, pszentry: Pcstr, dwsubentryid: UInt): UInt

public expect fun rasDeleteSubEntryW(pszphonebook: Pcwstr, pszentry: Pcwstr, dwsubentryid: UInt): UInt

public expect fun rasDialA(param0: ConstPtr<Rasdialextensions>, param1: Pcstr, param2: ConstPtr<Rasdialparamsa>, param3: UInt, param4: ConstPtr<CVoid>, param5: MutPtr<Hrasconn>): UInt

public expect fun rasDialDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpszphonenumber: Pcstr, lpinfo: MutPtr<Rasdialdlg>): Bool

public expect fun rasDialDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpszphonenumber: Pcwstr, lpinfo: MutPtr<Rasdialdlg>): Bool

public expect fun rasDialW(param0: ConstPtr<Rasdialextensions>, param1: Pcwstr, param2: ConstPtr<Rasdialparamsw>, param3: UInt, param4: ConstPtr<CVoid>, param5: MutPtr<Hrasconn>): UInt

public expect fun rasEditPhonebookEntryA(param0: Hwnd, param1: Pcstr, param2: Pcstr): UInt

public expect fun rasEditPhonebookEntryW(param0: Hwnd, param1: Pcwstr, param2: Pcwstr): UInt

public expect fun rasEntryDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpinfo: MutPtr<Rasentrydlga>): Bool

public expect fun rasEntryDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpinfo: MutPtr<Rasentrydlgw>): Bool

public expect fun rasEnumAutodialAddressesA(lpprasautodialaddresses: MutPtr<Pstr>, lpdwcbrasautodialaddresses: MutPtr<UInt>, lpdwcrasautodialaddresses: MutPtr<UInt>): UInt

public expect fun rasEnumAutodialAddressesW(lpprasautodialaddresses: MutPtr<Pwstr>, lpdwcbrasautodialaddresses: MutPtr<UInt>, lpdwcrasautodialaddresses: MutPtr<UInt>): UInt

public expect fun rasEnumConnectionsA(param0: MutPtr<Rasconna>, param1: MutPtr<UInt>, param2: MutPtr<UInt>): UInt

public expect fun rasEnumConnectionsW(param0: MutPtr<Rasconnw>, param1: MutPtr<UInt>, param2: MutPtr<UInt>): UInt

public expect fun rasEnumDevicesA(param0: MutPtr<Rasdevinfoa>, param1: MutPtr<UInt>, param2: MutPtr<UInt>): UInt

public expect fun rasEnumDevicesW(param0: MutPtr<Rasdevinfow>, param1: MutPtr<UInt>, param2: MutPtr<UInt>): UInt

public expect fun rasEnumEntriesA(param0: Pcstr, param1: Pcstr, param2: MutPtr<Rasentrynamea>, param3: MutPtr<UInt>, param4: MutPtr<UInt>): UInt

public expect fun rasEnumEntriesW(param0: Pcwstr, param1: Pcwstr, param2: MutPtr<Rasentrynamew>, param3: MutPtr<UInt>, param4: MutPtr<UInt>): UInt

public expect fun rasFreeEapUserIdentityA(praseapuseridentity: ConstPtr<Raseapuseridentitya>)

public expect fun rasFreeEapUserIdentityW(praseapuseridentity: ConstPtr<Raseapuseridentityw>)

public expect fun rasGetAutodialAddressA(param0: Pcstr, param1: ConstPtr<UInt>, param2: MutPtr<Rasautodialentrya>, param3: MutPtr<UInt>, param4: MutPtr<UInt>): UInt

public expect fun rasGetAutodialAddressW(param0: Pcwstr, param1: ConstPtr<UInt>, param2: MutPtr<Rasautodialentryw>, param3: MutPtr<UInt>, param4: MutPtr<UInt>): UInt

public expect fun rasGetAutodialEnableA(param0: UInt, param1: MutPtr<Bool>): UInt

public expect fun rasGetAutodialEnableW(param0: UInt, param1: MutPtr<Bool>): UInt

public expect fun rasGetAutodialParamA(param0: UInt, param1: MutPtr<CVoid>, param2: MutPtr<UInt>): UInt

public expect fun rasGetAutodialParamW(param0: UInt, param1: MutPtr<CVoid>, param2: MutPtr<UInt>): UInt

public expect fun rasGetConnectStatusA(param0: Hrasconn, param1: MutPtr<Rasconnstatusa>): UInt

public expect fun rasGetConnectStatusW(param0: Hrasconn, param1: MutPtr<Rasconnstatusw>): UInt

public expect fun rasGetConnectionStatistics(hrasconn: Hrasconn, lpstatistics: MutPtr<RasStats>): UInt

public expect fun rasGetCountryInfoA(param0: MutPtr<Rasctryinfo>, param1: MutPtr<UInt>): UInt

public expect fun rasGetCountryInfoW(param0: MutPtr<Rasctryinfo>, param1: MutPtr<UInt>): UInt

public expect fun rasGetCredentialsA(param0: Pcstr, param1: Pcstr, param2: MutPtr<Rascredentialsa>): UInt

public expect fun rasGetCredentialsW(param0: Pcwstr, param1: Pcwstr, param2: MutPtr<Rascredentialsw>): UInt

public expect fun rasGetCustomAuthDataA(pszphonebook: Pcstr, pszentry: Pcstr, pbcustomauthdata: MutPtr<UByte>, pdwsizeofcustomauthdata: MutPtr<UInt>): UInt

public expect fun rasGetCustomAuthDataW(pszphonebook: Pcwstr, pszentry: Pcwstr, pbcustomauthdata: MutPtr<UByte>, pdwsizeofcustomauthdata: MutPtr<UInt>): UInt

public expect fun rasGetEapUserDataA(htoken: Handle, pszphonebook: Pcstr, pszentry: Pcstr, pbeapdata: MutPtr<UByte>, pdwsizeofeapdata: MutPtr<UInt>): UInt

public expect fun rasGetEapUserDataW(htoken: Handle, pszphonebook: Pcwstr, pszentry: Pcwstr, pbeapdata: MutPtr<UByte>, pdwsizeofeapdata: MutPtr<UInt>): UInt

public expect fun rasGetEapUserIdentityA(pszphonebook: Pcstr, pszentry: Pcstr, dwflags: UInt, hwnd: Hwnd, ppraseapuseridentity: MutPtr<MutPtr<Raseapuseridentitya>>): UInt

public expect fun rasGetEapUserIdentityW(pszphonebook: Pcwstr, pszentry: Pcwstr, dwflags: UInt, hwnd: Hwnd, ppraseapuseridentity: MutPtr<MutPtr<Raseapuseridentityw>>): UInt

public expect fun rasGetEntryDialParamsA(param0: Pcstr, param1: MutPtr<Rasdialparamsa>, param2: MutPtr<Bool>): UInt

public expect fun rasGetEntryDialParamsW(param0: Pcwstr, param1: MutPtr<Rasdialparamsw>, param2: MutPtr<Bool>): UInt

public expect fun rasGetEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: MutPtr<Rasentrya>, param3: MutPtr<UInt>, param4: MutPtr<UByte>, param5: MutPtr<UInt>): UInt

public expect fun rasGetEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: MutPtr<Rasentryw>, param3: MutPtr<UInt>, param4: MutPtr<UByte>, param5: MutPtr<UInt>): UInt

public expect fun rasGetErrorStringA(resourceid: UInt, lpszstring: Pstr, inbufsize: UInt): UInt

public expect fun rasGetErrorStringW(resourceid: UInt, lpszstring: Pwstr, inbufsize: UInt): UInt

public expect fun rasGetLinkStatistics(hrasconn: Hrasconn, dwsubentry: UInt, lpstatistics: MutPtr<RasStats>): UInt

public expect fun rasGetPCscf(lpszpcscf: Pwstr): UInt

public expect fun rasGetProjectionInfoA(param0: Hrasconn, param1: Rasprojection, param2: MutPtr<CVoid>, param3: MutPtr<UInt>): UInt

public expect fun rasGetProjectionInfoEx(hrasconn: Hrasconn, prasprojection: MutPtr<RasProjectionInfo>, lpdwsize: MutPtr<UInt>): UInt

public expect fun rasGetProjectionInfoW(param0: Hrasconn, param1: Rasprojection, param2: MutPtr<CVoid>, param3: MutPtr<UInt>): UInt

public expect fun rasGetSubEntryHandleA(param0: Hrasconn, param1: UInt, param2: MutPtr<Hrasconn>): UInt

public expect fun rasGetSubEntryHandleW(param0: Hrasconn, param1: UInt, param2: MutPtr<Hrasconn>): UInt

public expect fun rasGetSubEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: UInt, param3: MutPtr<Rassubentrya>, param4: MutPtr<UInt>, param5: MutPtr<UByte>, param6: MutPtr<UInt>): UInt

public expect fun rasGetSubEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: UInt, param3: MutPtr<Rassubentryw>, param4: MutPtr<UInt>, param5: MutPtr<UByte>, param6: MutPtr<UInt>): UInt

public expect fun rasHangUpA(param0: Hrasconn): UInt

public expect fun rasHangUpW(param0: Hrasconn): UInt

public expect fun rasInvokeEapUI(param0: Hrasconn, param1: UInt, param2: ConstPtr<Rasdialextensions>, param3: Hwnd): UInt

public expect fun rasPhonebookDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpinfo: MutPtr<Raspbdlga>): Bool

public expect fun rasPhonebookDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpinfo: MutPtr<Raspbdlgw>): Bool

public expect fun rasRenameEntryA(param0: Pcstr, param1: Pcstr, param2: Pcstr): UInt

public expect fun rasRenameEntryW(param0: Pcwstr, param1: Pcwstr, param2: Pcwstr): UInt

public expect fun rasSetAutodialAddressA(param0: Pcstr, param1: UInt, param2: ConstPtr<Rasautodialentrya>, param3: UInt, param4: UInt): UInt

public expect fun rasSetAutodialAddressW(param0: Pcwstr, param1: UInt, param2: ConstPtr<Rasautodialentryw>, param3: UInt, param4: UInt): UInt

public expect fun rasSetAutodialEnableA(param0: UInt, param1: Bool): UInt

public expect fun rasSetAutodialEnableW(param0: UInt, param1: Bool): UInt

public expect fun rasSetAutodialParamA(param0: UInt, param1: ConstPtr<CVoid>, param2: UInt): UInt

public expect fun rasSetAutodialParamW(param0: UInt, param1: ConstPtr<CVoid>, param2: UInt): UInt

public expect fun rasSetCredentialsA(param0: Pcstr, param1: Pcstr, param2: ConstPtr<Rascredentialsa>, param3: Bool): UInt

public expect fun rasSetCredentialsW(param0: Pcwstr, param1: Pcwstr, param2: ConstPtr<Rascredentialsw>, param3: Bool): UInt

public expect fun rasSetCustomAuthDataA(pszphonebook: Pcstr, pszentry: Pcstr, pbcustomauthdata: ConstPtr<UByte>, dwsizeofcustomauthdata: UInt): UInt

public expect fun rasSetCustomAuthDataW(pszphonebook: Pcwstr, pszentry: Pcwstr, pbcustomauthdata: ConstPtr<UByte>, dwsizeofcustomauthdata: UInt): UInt

public expect fun rasSetEapUserDataA(htoken: Handle, pszphonebook: Pcstr, pszentry: Pcstr, pbeapdata: ConstPtr<UByte>, dwsizeofeapdata: UInt): UInt

public expect fun rasSetEapUserDataW(htoken: Handle, pszphonebook: Pcwstr, pszentry: Pcwstr, pbeapdata: ConstPtr<UByte>, dwsizeofeapdata: UInt): UInt

public expect fun rasSetEntryDialParamsA(param0: Pcstr, param1: ConstPtr<Rasdialparamsa>, param2: Bool): UInt

public expect fun rasSetEntryDialParamsW(param0: Pcwstr, param1: ConstPtr<Rasdialparamsw>, param2: Bool): UInt

public expect fun rasSetEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: ConstPtr<Rasentrya>, param3: UInt, param4: ConstPtr<UByte>, param5: UInt): UInt

public expect fun rasSetEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: ConstPtr<Rasentryw>, param3: UInt, param4: ConstPtr<UByte>, param5: UInt): UInt

public expect fun rasSetSubEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: UInt, param3: ConstPtr<Rassubentrya>, param4: UInt, param5: ConstPtr<UByte>, param6: UInt): UInt

public expect fun rasSetSubEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: UInt, param3: ConstPtr<Rassubentryw>, param4: UInt, param5: ConstPtr<UByte>, param6: UInt): UInt

public expect fun rasUpdateConnection(hrasconn: Hrasconn, lprasupdateconn: ConstPtr<Rasupdateconn>): UInt

public expect fun rasValidateEntryNameA(param0: Pcstr, param1: Pcstr): UInt

public expect fun rasValidateEntryNameW(param0: Pcwstr, param1: Pcwstr): UInt

public expect fun rtmAddNextHop(rtmreghandle: Long, nexthopinfo: MutPtr<RtmNexthopInfo>, nexthophandle: MutPtr<Long>, changeflags: MutPtr<UInt>): UInt

public expect fun rtmAddRouteToDest(rtmreghandle: Long, routehandle: MutPtr<Long>, destaddress: MutPtr<RtmNetAddress>, routeinfo: MutPtr<RtmRouteInfo>, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: MutPtr<UInt>): UInt

public expect fun rtmBlockMethods(rtmreghandle: Long, targethandle: Handle, targettype: UByte, blockingflag: UInt): UInt

public expect fun rtmConvertIpv6AddressAndLengthToNetAddress(pnetaddress: MutPtr<RtmNetAddress>, address: In6Addr, dwlength: UInt, dwaddresssize: UInt): UInt

public expect fun rtmConvertNetAddressToIpv6AddressAndLength(pnetaddress: MutPtr<RtmNetAddress>, paddress: MutPtr<In6Addr>, plength: MutPtr<UInt>, dwaddresssize: UInt): UInt

public expect fun rtmCreateDestEnum(rtmreghandle: Long, targetviews: UInt, enumflags: UInt, netaddress: MutPtr<RtmNetAddress>, protocolid: UInt, rtmenumhandle: MutPtr<Long>): UInt

public expect fun rtmCreateNextHopEnum(rtmreghandle: Long, enumflags: UInt, netaddress: MutPtr<RtmNetAddress>, rtmenumhandle: MutPtr<Long>): UInt

public expect fun rtmCreateRouteEnum(rtmreghandle: Long, desthandle: Long, targetviews: UInt, enumflags: UInt, startdest: MutPtr<RtmNetAddress>, matchingflags: UInt, criteriaroute: MutPtr<RtmRouteInfo>, criteriainterface: UInt, rtmenumhandle: MutPtr<Long>): UInt

public expect fun rtmCreateRouteList(rtmreghandle: Long, routelisthandle: MutPtr<Long>): UInt

public expect fun rtmCreateRouteListEnum(rtmreghandle: Long, routelisthandle: Long, rtmenumhandle: MutPtr<Long>): UInt

public expect fun rtmDeleteEnumHandle(rtmreghandle: Long, enumhandle: Long): UInt

public expect fun rtmDeleteNextHop(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: MutPtr<RtmNexthopInfo>): UInt

public expect fun rtmDeleteRouteList(rtmreghandle: Long, routelisthandle: Long): UInt

public expect fun rtmDeleteRouteToDest(rtmreghandle: Long, routehandle: Long, changeflags: MutPtr<UInt>): UInt

public expect fun rtmDeregisterEntity(rtmreghandle: Long): UInt

public expect fun rtmDeregisterFromChangeNotification(rtmreghandle: Long, notifyhandle: Long): UInt

public expect fun rtmFindNextHop(rtmreghandle: Long, nexthopinfo: MutPtr<RtmNexthopInfo>, nexthophandle: MutPtr<Long>, nexthoppointer: MutPtr<MutPtr<RtmNexthopInfo>>): UInt

public expect fun rtmGetChangeStatus(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, changestatus: MutPtr<Bool>): UInt

public expect fun rtmGetChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: MutPtr<UInt>, changeddests: MutPtr<RtmDestInfo>): UInt

public expect fun rtmGetDestInfo(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: MutPtr<RtmDestInfo>): UInt

public expect fun rtmGetEntityInfo(rtmreghandle: Long, entityhandle: Long, entityinfo: MutPtr<RtmEntityInfo>): UInt

public expect fun rtmGetEntityMethods(rtmreghandle: Long, entityhandle: Long, nummethods: MutPtr<UInt>, exptmethods: MutPtr<RtmEntityExportMethod>): UInt

public expect fun rtmGetEnumDests(rtmreghandle: Long, enumhandle: Long, numdests: MutPtr<UInt>, destinfos: MutPtr<RtmDestInfo>): UInt

public expect fun rtmGetEnumNextHops(rtmreghandle: Long, enumhandle: Long, numnexthops: MutPtr<UInt>, nexthophandles: MutPtr<Long>): UInt

public expect fun rtmGetEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: MutPtr<UInt>, routehandles: MutPtr<Long>): UInt

public expect fun rtmGetExactMatchDestination(rtmreghandle: Long, destaddress: MutPtr<RtmNetAddress>, protocolid: UInt, targetviews: UInt, destinfo: MutPtr<RtmDestInfo>): UInt

public expect fun rtmGetExactMatchRoute(rtmreghandle: Long, destaddress: MutPtr<RtmNetAddress>, matchingflags: UInt, routeinfo: MutPtr<RtmRouteInfo>, interfaceindex: UInt, targetviews: UInt, routehandle: MutPtr<Long>): UInt

public expect fun rtmGetLessSpecificDestination(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: MutPtr<RtmDestInfo>): UInt

public expect fun rtmGetListEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: MutPtr<UInt>, routehandles: MutPtr<Long>): UInt

public expect fun rtmGetMostSpecificDestination(rtmreghandle: Long, destaddress: MutPtr<RtmNetAddress>, protocolid: UInt, targetviews: UInt, destinfo: MutPtr<RtmDestInfo>): UInt

public expect fun rtmGetNextHopInfo(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: MutPtr<RtmNexthopInfo>): UInt

public expect fun rtmGetNextHopPointer(rtmreghandle: Long, nexthophandle: Long, nexthoppointer: MutPtr<MutPtr<RtmNexthopInfo>>): UInt

public expect fun rtmGetOpaqueInformationPointer(rtmreghandle: Long, desthandle: Long, opaqueinfopointer: MutPtr<MutPtr<CVoid>>): UInt

public expect fun rtmGetRegisteredEntities(rtmreghandle: Long, numentities: MutPtr<UInt>, entityhandles: MutPtr<Long>, entityinfos: MutPtr<RtmEntityInfo>): UInt

public expect fun rtmGetRouteInfo(rtmreghandle: Long, routehandle: Long, routeinfo: MutPtr<RtmRouteInfo>, destaddress: MutPtr<RtmNetAddress>): UInt

public expect fun rtmGetRoutePointer(rtmreghandle: Long, routehandle: Long, routepointer: MutPtr<MutPtr<RtmRouteInfo>>): UInt

public expect fun rtmHoldDestination(rtmreghandle: Long, desthandle: Long, targetviews: UInt, holdtime: UInt): UInt

public expect fun rtmIgnoreChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: MutPtr<Long>): UInt

public expect fun rtmInsertInRouteList(rtmreghandle: Long, routelisthandle: Long, numroutes: UInt, routehandles: MutPtr<Long>): UInt

public expect fun rtmInvokeMethod(rtmreghandle: Long, entityhandle: Long, input: MutPtr<RtmEntityMethodInput>, outputsize: MutPtr<UInt>, output: MutPtr<RtmEntityMethodOutput>): UInt

public expect fun rtmIsBestRoute(rtmreghandle: Long, routehandle: Long, bestinviews: MutPtr<UInt>): UInt

public expect fun rtmIsMarkedForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, destmarked: MutPtr<Bool>): UInt

public expect fun rtmLockDestination(rtmreghandle: Long, desthandle: Long, exclusive: Bool, lockdest: Bool): UInt

public expect fun rtmLockNextHop(rtmreghandle: Long, nexthophandle: Long, exclusive: Bool, locknexthop: Bool, nexthoppointer: MutPtr<MutPtr<RtmNexthopInfo>>): UInt

public expect fun rtmLockRoute(rtmreghandle: Long, routehandle: Long, exclusive: Bool, lockroute: Bool, routepointer: MutPtr<MutPtr<RtmRouteInfo>>): UInt

public expect fun rtmMarkDestForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, markdest: Bool): UInt

public expect fun rtmReferenceHandles(rtmreghandle: Long, numhandles: UInt, rtmhandles: MutPtr<Handle>): UInt

public expect fun rtmRegisterEntity(rtmentityinfo: MutPtr<RtmEntityInfo>, exportmethods: MutPtr<RtmEntityExportMethods>, eventcallback: RtmEventCallback, reserveopaquepointer: Bool, rtmregprofile: MutPtr<RtmRegnProfile>, rtmreghandle: MutPtr<Long>): UInt

public expect fun rtmRegisterForChangeNotification(rtmreghandle: Long, targetviews: UInt, notifyflags: UInt, notifycontext: MutPtr<CVoid>, notifyhandle: MutPtr<Long>): UInt

public expect fun rtmReleaseChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: MutPtr<RtmDestInfo>): UInt

public expect fun rtmReleaseDestInfo(rtmreghandle: Long, destinfo: MutPtr<RtmDestInfo>): UInt

public expect fun rtmReleaseDests(rtmreghandle: Long, numdests: UInt, destinfos: MutPtr<RtmDestInfo>): UInt

public expect fun rtmReleaseEntities(rtmreghandle: Long, numentities: UInt, entityhandles: MutPtr<Long>): UInt

public expect fun rtmReleaseEntityInfo(rtmreghandle: Long, entityinfo: MutPtr<RtmEntityInfo>): UInt

public expect fun rtmReleaseNextHopInfo(rtmreghandle: Long, nexthopinfo: MutPtr<RtmNexthopInfo>): UInt

public expect fun rtmReleaseNextHops(rtmreghandle: Long, numnexthops: UInt, nexthophandles: MutPtr<Long>): UInt

public expect fun rtmReleaseRouteInfo(rtmreghandle: Long, routeinfo: MutPtr<RtmRouteInfo>): UInt

public expect fun rtmReleaseRoutes(rtmreghandle: Long, numroutes: UInt, routehandles: MutPtr<Long>): UInt

public expect fun rtmUpdateAndUnlockRoute(rtmreghandle: Long, routehandle: Long, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: MutPtr<UInt>): UInt
