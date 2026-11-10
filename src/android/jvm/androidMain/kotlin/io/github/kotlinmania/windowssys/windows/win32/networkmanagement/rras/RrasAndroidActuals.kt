@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.In6Addr

private object WindowsWin32NetworkmanagementRrasJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mgmAddGroupMembershipEntry(hprotocol: Long, dwsourceaddr: Int, dwsourcemask: Int, dwgroupaddr: Int, dwgroupmask: Int, dwifindex: Int, dwifnexthopipaddr: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mgmDeRegisterMProtocol(hprotocol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mgmDeleteGroupMembershipEntry(hprotocol: Long, dwsourceaddr: Int, dwsourcemask: Int, dwgroupaddr: Int, dwgroupmask: Int, dwifindex: Int, dwifnexthopipaddr: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mgmGetFirstMfe(pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mgmGetFirstMfeStats(pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mgmGetMfe(pimm: Long, pdwbuffersize: Long, pbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mgmGetMfeStats(pimm: Long, pdwbuffersize: Long, pbbuffer: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mgmGetNextMfe(pimmstart: Long, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mgmGetNextMfeStats(pimmstart: Long, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mgmGetProtocolOnInterface(dwifindex: Int, dwifnexthopaddr: Int, pdwifprotocolid: Long, pdwifcomponentid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mgmGroupEnumerationEnd(henum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mgmGroupEnumerationGetNext(henum: Long, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mgmGroupEnumerationStart(hprotocol: Long, metenumtype: Int, phenumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mgmRegisterMProtocol(prpiinfo: Long, dwprotocolid: Int, dwcomponentid: Int, phprotocol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mgmReleaseInterfaceOwnership(hprotocol: Long, dwifindex: Int, dwifnexthopaddr: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mgmTakeInterfaceOwnership(hprotocol: Long, dwifindex: Int, dwifnexthopaddr: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminBufferFree(pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionClearStats(hrasserver: Long, hrasconnection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionEnum(hrasserver: Long, dwlevel: Int, lplpbbuffer: Long, dwprefmaxlen: Int, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionEnumEx(hrasserver: Long, pobjectheader: Long, dwpreferedmaxlen: Int, lpdwentriesread: Long, lpdwtotalentries: Long, pprasconn: Long, lpdwresumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionGetInfo(hrasserver: Long, dwlevel: Int, hrasconnection: Long, lplpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionGetInfoEx(hrasserver: Long, hrasconnection: Long, prasconnection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionRemoveQuarantine(hrasserver: Long, hrasconnection: Long, fisipaddress: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminDeregisterConnectionNotification(hmprserver: Long, heventnotification: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminDeviceEnum(hmprserver: Long, dwlevel: Int, lplpbbuffer: Long, lpdwtotalentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminEstablishDomainRasServer(pszdomain: Long, pszmachine: Long, benable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminGetErrorString(dwerror: Int, lplpwserrorstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminGetPDCServer(lpszdomain: Long, lpszserver: Long, lpszpdcserver: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceConnect(hmprserver: Long, hinterface: Long, hevent: Long, fsynchronous: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceCreate(hmprserver: Long, dwlevel: Int, lpbbuffer: Long, phinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDelete(hmprserver: Long, hinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDeviceGetInfo(hmprserver: Long, hinterface: Long, dwindex: Int, dwlevel: Int, lplpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDeviceSetInfo(hmprserver: Long, hinterface: Long, dwindex: Int, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDisconnect(hmprserver: Long, hinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceEnum(hmprserver: Long, dwlevel: Int, lplpbbuffer: Long, dwprefmaxlen: Int, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetCredentials(lpwsserver: Long, lpwsinterfacename: Long, lpwsusername: Long, lpwspassword: Long, lpwsdomainname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetCredentialsEx(hmprserver: Long, hinterface: Long, dwlevel: Int, lplpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetCustomInfoEx(hmprserver: Long, hinterface: Long, pcustominfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetHandle(hmprserver: Long, lpwsinterfacename: Long, phinterface: Long, fincludeclientinterfaces: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetInfo(hmprserver: Long, hinterface: Long, dwlevel: Int, lplpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceQueryUpdateResult(hmprserver: Long, hinterface: Long, dwprotocolid: Int, lpdwupdateresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetCredentials(lpwsserver: Long, lpwsinterfacename: Long, lpwsusername: Long, lpwsdomainname: Long, lpwspassword: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetCredentialsEx(hmprserver: Long, hinterface: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetCustomInfoEx(hmprserver: Long, hinterface: Long, pcustominfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetInfo(hmprserver: Long, hinterface: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportAdd(hmprserver: Long, hinterface: Long, dwtransportid: Int, pinterfaceinfo: Long, dwinterfaceinfosize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportGetInfo(hmprserver: Long, hinterface: Long, dwtransportid: Int, ppinterfaceinfo: Long, lpdwinterfaceinfosize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportRemove(hmprserver: Long, hinterface: Long, dwtransportid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportSetInfo(hmprserver: Long, hinterface: Long, dwtransportid: Int, pinterfaceinfo: Long, dwinterfaceinfosize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceUpdatePhonebookInfo(hmprserver: Long, hinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceUpdateRoutes(hmprserver: Long, hinterface: Long, dwprotocolid: Int, hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminIsDomainRasServer(pszdomain: Long, pszmachine: Long, pbisrasserver: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminIsServiceInitialized(lpwsservername: Long, fisserviceinitialized: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminIsServiceRunning(lpwsservername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminMIBBufferFree(pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryCreate(hmibserver: Long, dwpid: Int, dwroutingpid: Int, lpentry: Long, dwentrysize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryDelete(hmibserver: Long, dwprotocolid: Int, dwroutingpid: Int, lpentry: Long, dwentrysize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryGet(hmibserver: Long, dwprotocolid: Int, dwroutingpid: Int, lpinentry: Long, dwinentrysize: Int, lplpoutentry: Long, lpoutentrysize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryGetFirst(hmibserver: Long, dwprotocolid: Int, dwroutingpid: Int, lpinentry: Long, dwinentrysize: Int, lplpoutentry: Long, lpoutentrysize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryGetNext(hmibserver: Long, dwprotocolid: Int, dwroutingpid: Int, lpinentry: Long, dwinentrysize: Int, lplpoutentry: Long, lpoutentrysize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntrySet(hmibserver: Long, dwprotocolid: Int, dwroutingpid: Int, lpentry: Long, dwentrysize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminMIBServerConnect(lpwsservername: Long, phmibserver: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminMIBServerDisconnect(hmibserver: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminPortClearStats(hrasserver: Long, hport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminPortDisconnect(hrasserver: Long, hport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminPortEnum(hrasserver: Long, dwlevel: Int, hrasconnection: Long, lplpbbuffer: Long, dwprefmaxlen: Int, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminPortGetInfo(hrasserver: Long, dwlevel: Int, hport: Long, lplpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminPortReset(hrasserver: Long, hport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminRegisterConnectionNotification(hmprserver: Long, heventnotification: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminSendUserMessage(hmprserver: Long, hconnection: Long, lpwszmessage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminServerConnect(lpwsservername: Long, phmprserver: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminServerDisconnect(hmprserver: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminServerGetCredentials(hmprserver: Long, dwlevel: Int, lplpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminServerGetInfo(hmprserver: Long, dwlevel: Int, lplpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminServerGetInfoEx(hmprserver: Long, pserverinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminServerSetCredentials(hmprserver: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminServerSetInfo(hmprserver: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminServerSetInfoEx(hmprserver: Long, pserverinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminTransportCreate(hmprserver: Long, dwtransportid: Int, lpwstransportname: Long, pglobalinfo: Long, dwglobalinfosize: Int, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: Int, lpwsdllpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminTransportGetInfo(hmprserver: Long, dwtransportid: Int, ppglobalinfo: Long, lpdwglobalinfosize: Long, ppclientinterfaceinfo: Long, lpdwclientinterfaceinfosize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminTransportSetInfo(hmprserver: Long, dwtransportid: Int, pglobalinfo: Long, dwglobalinfosize: Int, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminUpdateConnection(hrasserver: Long, hrasconnection: Long, prasupdateconnection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminUserGetInfo(lpszserver: Long, lpszuser: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprAdminUserSetInfo(lpszserver: Long, lpszuser: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigBufferFree(pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigFilterGetInfo(hmprconfig: Long, dwlevel: Int, dwtransportid: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigFilterSetInfo(hmprconfig: Long, dwlevel: Int, dwtransportid: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigGetFriendlyName(hmprconfig: Long, pszguidname: Long, pszbuffer: Long, dwbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigGetGuidName(hmprconfig: Long, pszfriendlyname: Long, pszbuffer: Long, dwbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceCreate(hmprconfig: Long, dwlevel: Int, lpbbuffer: Long, phrouterinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceDelete(hmprconfig: Long, hrouterinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceEnum(hmprconfig: Long, dwlevel: Int, lplpbuffer: Long, dwprefmaxlen: Int, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceGetCustomInfoEx(hmprconfig: Long, hrouterinterface: Long, pcustominfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceGetHandle(hmprconfig: Long, lpwsinterfacename: Long, phrouterinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceGetInfo(hmprconfig: Long, hrouterinterface: Long, dwlevel: Int, lplpbuffer: Long, lpdwbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceSetCustomInfoEx(hmprconfig: Long, hrouterinterface: Long, pcustominfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceSetInfo(hmprconfig: Long, hrouterinterface: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportAdd(hmprconfig: Long, hrouterinterface: Long, dwtransportid: Int, lpwstransportname: Long, pinterfaceinfo: Long, dwinterfaceinfosize: Int, phrouteriftransport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportEnum(hmprconfig: Long, hrouterinterface: Long, dwlevel: Int, lplpbuffer: Long, dwprefmaxlen: Int, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportGetHandle(hmprconfig: Long, hrouterinterface: Long, dwtransportid: Int, phrouteriftransport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportGetInfo(hmprconfig: Long, hrouterinterface: Long, hrouteriftransport: Long, ppinterfaceinfo: Long, lpdwinterfaceinfosize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportRemove(hmprconfig: Long, hrouterinterface: Long, hrouteriftransport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportSetInfo(hmprconfig: Long, hrouterinterface: Long, hrouteriftransport: Long, pinterfaceinfo: Long, dwinterfaceinfosize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigServerBackup(hmprconfig: Long, lpwspath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigServerConnect(lpwsservername: Long, phmprconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigServerDisconnect(hmprconfig: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigServerGetInfo(hmprconfig: Long, dwlevel: Int, lplpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigServerGetInfoEx(hmprconfig: Long, pserverinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigServerInstall(dwlevel: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigServerRefresh(hmprconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigServerRestore(hmprconfig: Long, lpwspath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigServerSetInfo(hmprserver: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigServerSetInfoEx(hmprconfig: Long, psetserverconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigTransportCreate(hmprconfig: Long, dwtransportid: Int, lpwstransportname: Long, pglobalinfo: Long, dwglobalinfosize: Int, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: Int, lpwsdllpath: Long, phroutertransport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigTransportDelete(hmprconfig: Long, hroutertransport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigTransportEnum(hmprconfig: Long, dwlevel: Int, lplpbuffer: Long, dwprefmaxlen: Int, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigTransportGetHandle(hmprconfig: Long, dwtransportid: Int, phroutertransport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigTransportGetInfo(hmprconfig: Long, hroutertransport: Long, ppglobalinfo: Long, lpdwglobalinfosize: Long, ppclientinterfaceinfo: Long, lpdwclientinterfaceinfosize: Long, lplpwsdllpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprConfigTransportSetInfo(hmprconfig: Long, hroutertransport: Long, pglobalinfo: Long, dwglobalinfosize: Int, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: Int, lpwsdllpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprInfoBlockAdd(lpheader: Long, dwinfotype: Int, dwitemsize: Int, dwitemcount: Int, lpitemdata: Long, lplpnewheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprInfoBlockFind(lpheader: Long, dwinfotype: Int, lpdwitemsize: Long, lpdwitemcount: Long, lplpitemdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprInfoBlockQuerySize(lpheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprInfoBlockRemove(lpheader: Long, dwinfotype: Int, lplpnewheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprInfoBlockSet(lpheader: Long, dwinfotype: Int, dwitemsize: Int, dwitemcount: Int, lpitemdata: Long, lplpnewheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprInfoCreate(dwversion: Int, lplpnewheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprInfoDelete(lpheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprInfoDuplicate(lpheader: Long, lplpnewheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_mprInfoRemoveAll(lpheader: Long, lplpnewheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasClearConnectionStatistics(hrasconn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasClearLinkStatistics(hrasconn: Long, dwsubentry: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasConnectionNotificationA(param0: Long, param1: Long, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasConnectionNotificationW(param0: Long, param1: Long, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasCreatePhonebookEntryA(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasCreatePhonebookEntryW(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasDeleteEntryA(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasDeleteEntryW(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasDeleteSubEntryA(pszphonebook: Long, pszentry: Long, dwsubentryid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasDeleteSubEntryW(pszphonebook: Long, pszentry: Long, dwsubentryid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasDialA(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long, param5: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasDialDlgA(lpszphonebook: Long, lpszentry: Long, lpszphonenumber: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasDialDlgW(lpszphonebook: Long, lpszentry: Long, lpszphonenumber: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasDialW(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long, param5: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasEditPhonebookEntryA(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasEditPhonebookEntryW(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasEntryDlgA(lpszphonebook: Long, lpszentry: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasEntryDlgW(lpszphonebook: Long, lpszentry: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasEnumAutodialAddressesA(lpprasautodialaddresses: Long, lpdwcbrasautodialaddresses: Long, lpdwcrasautodialaddresses: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasEnumAutodialAddressesW(lpprasautodialaddresses: Long, lpdwcbrasautodialaddresses: Long, lpdwcrasautodialaddresses: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasEnumConnectionsA(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasEnumConnectionsW(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasEnumDevicesA(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasEnumDevicesW(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasEnumEntriesA(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasEnumEntriesW(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasFreeEapUserIdentityA(praseapuseridentity: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasFreeEapUserIdentityW(praseapuseridentity: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetAutodialAddressA(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetAutodialAddressW(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetAutodialEnableA(param0: Int, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetAutodialEnableW(param0: Int, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetAutodialParamA(param0: Int, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetAutodialParamW(param0: Int, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetConnectStatusA(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetConnectStatusW(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetConnectionStatistics(hrasconn: Long, lpstatistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetCountryInfoA(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetCountryInfoW(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetCredentialsA(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetCredentialsW(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetCustomAuthDataA(pszphonebook: Long, pszentry: Long, pbcustomauthdata: Long, pdwsizeofcustomauthdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetCustomAuthDataW(pszphonebook: Long, pszentry: Long, pbcustomauthdata: Long, pdwsizeofcustomauthdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetEapUserDataA(htoken: Long, pszphonebook: Long, pszentry: Long, pbeapdata: Long, pdwsizeofeapdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetEapUserDataW(htoken: Long, pszphonebook: Long, pszentry: Long, pbeapdata: Long, pdwsizeofeapdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetEapUserIdentityA(pszphonebook: Long, pszentry: Long, dwflags: Int, hwnd: Long, ppraseapuseridentity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetEapUserIdentityW(pszphonebook: Long, pszentry: Long, dwflags: Int, hwnd: Long, ppraseapuseridentity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetEntryDialParamsA(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetEntryDialParamsW(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetEntryPropertiesA(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long, param5: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetEntryPropertiesW(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long, param5: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetErrorStringA(resourceid: Int, lpszstring: Long, inbufsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetErrorStringW(resourceid: Int, lpszstring: Long, inbufsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetLinkStatistics(hrasconn: Long, dwsubentry: Int, lpstatistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetPCscf(lpszpcscf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetProjectionInfoA(param0: Long, param1: Int, param2: Long, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetProjectionInfoEx(hrasconn: Long, prasprojection: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetProjectionInfoW(param0: Long, param1: Int, param2: Long, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryHandleA(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryHandleW(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryPropertiesA(param0: Long, param1: Long, param2: Int, param3: Long, param4: Long, param5: Long, param6: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryPropertiesW(param0: Long, param1: Long, param2: Int, param3: Long, param4: Long, param5: Long, param6: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasHangUpA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasHangUpW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasInvokeEapUI(param0: Long, param1: Int, param2: Long, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasPhonebookDlgA(lpszphonebook: Long, lpszentry: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasPhonebookDlgW(lpszphonebook: Long, lpszentry: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasRenameEntryA(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasRenameEntryW(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasSetAutodialAddressA(param0: Long, param1: Int, param2: Long, param3: Int, param4: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasSetAutodialAddressW(param0: Long, param1: Int, param2: Long, param3: Int, param4: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasSetAutodialEnableA(param0: Int, param1: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasSetAutodialEnableW(param0: Int, param1: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasSetAutodialParamA(param0: Int, param1: Long, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasSetAutodialParamW(param0: Int, param1: Long, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasSetCredentialsA(param0: Long, param1: Long, param2: Long, param3: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasSetCredentialsW(param0: Long, param1: Long, param2: Long, param3: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasSetCustomAuthDataA(pszphonebook: Long, pszentry: Long, pbcustomauthdata: Long, dwsizeofcustomauthdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasSetCustomAuthDataW(pszphonebook: Long, pszentry: Long, pbcustomauthdata: Long, dwsizeofcustomauthdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasSetEapUserDataA(htoken: Long, pszphonebook: Long, pszentry: Long, pbeapdata: Long, dwsizeofeapdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasSetEapUserDataW(htoken: Long, pszphonebook: Long, pszentry: Long, pbeapdata: Long, dwsizeofeapdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasSetEntryDialParamsA(param0: Long, param1: Long, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasSetEntryDialParamsW(param0: Long, param1: Long, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasSetEntryPropertiesA(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long, param5: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasSetEntryPropertiesW(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long, param5: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasSetSubEntryPropertiesA(param0: Long, param1: Long, param2: Int, param3: Long, param4: Int, param5: Long, param6: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasSetSubEntryPropertiesW(param0: Long, param1: Long, param2: Int, param3: Long, param4: Int, param5: Long, param6: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasUpdateConnection(hrasconn: Long, lprasupdateconn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasValidateEntryNameA(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rasValidateEntryNameW(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmAddNextHop(rtmreghandle: Long, nexthopinfo: Long, nexthophandle: Long, changeflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmAddRouteToDest(rtmreghandle: Long, routehandle: Long, destaddress: Long, routeinfo: Long, timetolive: Int, routelisthandle: Long, notifytype: Int, notifyhandle: Long, changeflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmBlockMethods(rtmreghandle: Long, targethandle: Long, targettype: Byte, blockingflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmConvertNetAddressToIpv6AddressAndLength(pnetaddress: Long, paddress: Long, plength: Long, dwaddresssize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmCreateDestEnum(rtmreghandle: Long, targetviews: Int, enumflags: Int, netaddress: Long, protocolid: Int, rtmenumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmCreateNextHopEnum(rtmreghandle: Long, enumflags: Int, netaddress: Long, rtmenumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmCreateRouteEnum(rtmreghandle: Long, desthandle: Long, targetviews: Int, enumflags: Int, startdest: Long, matchingflags: Int, criteriaroute: Long, criteriainterface: Int, rtmenumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmCreateRouteList(rtmreghandle: Long, routelisthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmCreateRouteListEnum(rtmreghandle: Long, routelisthandle: Long, rtmenumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmDeleteEnumHandle(rtmreghandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmDeleteNextHop(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmDeleteRouteList(rtmreghandle: Long, routelisthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmDeleteRouteToDest(rtmreghandle: Long, routehandle: Long, changeflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmDeregisterEntity(rtmreghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmDeregisterFromChangeNotification(rtmreghandle: Long, notifyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmFindNextHop(rtmreghandle: Long, nexthopinfo: Long, nexthophandle: Long, nexthoppointer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmGetChangeStatus(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, changestatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmGetChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: Long, changeddests: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmGetDestInfo(rtmreghandle: Long, desthandle: Long, protocolid: Int, targetviews: Int, destinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmGetEntityInfo(rtmreghandle: Long, entityhandle: Long, entityinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmGetEntityMethods(rtmreghandle: Long, entityhandle: Long, nummethods: Long, exptmethods: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmGetEnumDests(rtmreghandle: Long, enumhandle: Long, numdests: Long, destinfos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmGetEnumNextHops(rtmreghandle: Long, enumhandle: Long, numnexthops: Long, nexthophandles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmGetEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: Long, routehandles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmGetExactMatchDestination(rtmreghandle: Long, destaddress: Long, protocolid: Int, targetviews: Int, destinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmGetExactMatchRoute(rtmreghandle: Long, destaddress: Long, matchingflags: Int, routeinfo: Long, interfaceindex: Int, targetviews: Int, routehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmGetLessSpecificDestination(rtmreghandle: Long, desthandle: Long, protocolid: Int, targetviews: Int, destinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmGetListEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: Long, routehandles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmGetMostSpecificDestination(rtmreghandle: Long, destaddress: Long, protocolid: Int, targetviews: Int, destinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmGetNextHopInfo(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmGetNextHopPointer(rtmreghandle: Long, nexthophandle: Long, nexthoppointer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmGetOpaqueInformationPointer(rtmreghandle: Long, desthandle: Long, opaqueinfopointer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmGetRegisteredEntities(rtmreghandle: Long, numentities: Long, entityhandles: Long, entityinfos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmGetRouteInfo(rtmreghandle: Long, routehandle: Long, routeinfo: Long, destaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmGetRoutePointer(rtmreghandle: Long, routehandle: Long, routepointer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmHoldDestination(rtmreghandle: Long, desthandle: Long, targetviews: Int, holdtime: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmIgnoreChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: Int, changeddests: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmInsertInRouteList(rtmreghandle: Long, routelisthandle: Long, numroutes: Int, routehandles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmInvokeMethod(rtmreghandle: Long, entityhandle: Long, input: Long, outputsize: Long, output: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmIsBestRoute(rtmreghandle: Long, routehandle: Long, bestinviews: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmIsMarkedForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, destmarked: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmLockDestination(rtmreghandle: Long, desthandle: Long, exclusive: Int, lockdest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmLockNextHop(rtmreghandle: Long, nexthophandle: Long, exclusive: Int, locknexthop: Int, nexthoppointer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmLockRoute(rtmreghandle: Long, routehandle: Long, exclusive: Int, lockroute: Int, routepointer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmMarkDestForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, markdest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmReferenceHandles(rtmreghandle: Long, numhandles: Int, rtmhandles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmRegisterEntity(rtmentityinfo: Long, exportmethods: Long, eventcallback: Long, reserveopaquepointer: Int, rtmregprofile: Long, rtmreghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmRegisterForChangeNotification(rtmreghandle: Long, targetviews: Int, notifyflags: Int, notifycontext: Long, notifyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmReleaseChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: Int, changeddests: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmReleaseDestInfo(rtmreghandle: Long, destinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmReleaseDests(rtmreghandle: Long, numdests: Int, destinfos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmReleaseEntities(rtmreghandle: Long, numentities: Int, entityhandles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmReleaseEntityInfo(rtmreghandle: Long, entityinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmReleaseNextHopInfo(rtmreghandle: Long, nexthopinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmReleaseNextHops(rtmreghandle: Long, numnexthops: Int, nexthophandles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmReleaseRouteInfo(rtmreghandle: Long, routeinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmReleaseRoutes(rtmreghandle: Long, numroutes: Int, routehandles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_rtmUpdateAndUnlockRoute(rtmreghandle: Long, routehandle: Long, timetolive: Int, routelisthandle: Long, notifytype: Int, notifyhandle: Long, changeflags: Long): Int
}

public actual fun mgmAddGroupMembershipEntry(hprotocol: Handle, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mgmAddGroupMembershipEntry((hprotocol?.value ?: 0L), dwsourceaddr.toInt(), dwsourcemask.toInt(), dwgroupaddr.toInt(), dwgroupmask.toInt(), dwifindex.toInt(), dwifnexthopipaddr.toInt(), dwflags.toInt()).toUInt()

public actual fun mgmDeRegisterMProtocol(hprotocol: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mgmDeRegisterMProtocol((hprotocol?.value ?: 0L)).toUInt()

public actual fun mgmDeleteGroupMembershipEntry(hprotocol: Handle, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mgmDeleteGroupMembershipEntry((hprotocol?.value ?: 0L), dwsourceaddr.toInt(), dwsourcemask.toInt(), dwgroupaddr.toInt(), dwgroupmask.toInt(), dwifindex.toInt(), dwifnexthopipaddr.toInt(), dwflags.toInt()).toUInt()

public actual fun mgmGetFirstMfe(pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, pdwnumentries: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mgmGetFirstMfe((pdwbuffersize?.value ?: 0L), (pbbuffer?.value ?: 0L), (pdwnumentries?.value ?: 0L)).toUInt()

public actual fun mgmGetFirstMfeStats(pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, pdwnumentries: COpaquePointer?, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mgmGetFirstMfeStats((pdwbuffersize?.value ?: 0L), (pbbuffer?.value ?: 0L), (pdwnumentries?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun mgmGetMfe(pimm: COpaquePointer?, pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mgmGetMfe((pimm?.value ?: 0L), (pdwbuffersize?.value ?: 0L), (pbbuffer?.value ?: 0L)).toUInt()

public actual fun mgmGetMfeStats(pimm: COpaquePointer?, pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mgmGetMfeStats((pimm?.value ?: 0L), (pdwbuffersize?.value ?: 0L), (pbbuffer?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun mgmGetNextMfe(pimmstart: COpaquePointer?, pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, pdwnumentries: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mgmGetNextMfe((pimmstart?.value ?: 0L), (pdwbuffersize?.value ?: 0L), (pbbuffer?.value ?: 0L), (pdwnumentries?.value ?: 0L)).toUInt()

public actual fun mgmGetNextMfeStats(pimmstart: COpaquePointer?, pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, pdwnumentries: COpaquePointer?, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mgmGetNextMfeStats((pimmstart?.value ?: 0L), (pdwbuffersize?.value ?: 0L), (pbbuffer?.value ?: 0L), (pdwnumentries?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun mgmGetProtocolOnInterface(dwifindex: UInt, dwifnexthopaddr: UInt, pdwifprotocolid: COpaquePointer?, pdwifcomponentid: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mgmGetProtocolOnInterface(dwifindex.toInt(), dwifnexthopaddr.toInt(), (pdwifprotocolid?.value ?: 0L), (pdwifcomponentid?.value ?: 0L)).toUInt()

public actual fun mgmGroupEnumerationEnd(henum: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mgmGroupEnumerationEnd((henum?.value ?: 0L)).toUInt()

public actual fun mgmGroupEnumerationGetNext(henum: Handle, pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, pdwnumentries: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mgmGroupEnumerationGetNext((henum?.value ?: 0L), (pdwbuffersize?.value ?: 0L), (pbbuffer?.value ?: 0L), (pdwnumentries?.value ?: 0L)).toUInt()

public actual fun mgmGroupEnumerationStart(hprotocol: Handle, metenumtype: MgmEnumTypes, phenumhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mgmGroupEnumerationStart((hprotocol?.value ?: 0L), metenumtype, (phenumhandle?.value ?: 0L)).toUInt()

public actual fun mgmRegisterMProtocol(prpiinfo: COpaquePointer?, dwprotocolid: UInt, dwcomponentid: UInt, phprotocol: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mgmRegisterMProtocol((prpiinfo?.value ?: 0L), dwprotocolid.toInt(), dwcomponentid.toInt(), (phprotocol?.value ?: 0L)).toUInt()

public actual fun mgmReleaseInterfaceOwnership(hprotocol: Handle, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mgmReleaseInterfaceOwnership((hprotocol?.value ?: 0L), dwifindex.toInt(), dwifnexthopaddr.toInt()).toUInt()

public actual fun mgmTakeInterfaceOwnership(hprotocol: Handle, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mgmTakeInterfaceOwnership((hprotocol?.value ?: 0L), dwifindex.toInt(), dwifnexthopaddr.toInt()).toUInt()

public actual fun mprAdminBufferFree(pbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminBufferFree((pbuffer?.value ?: 0L)).toUInt()

public actual fun mprAdminConnectionClearStats(hrasserver: Long, hrasconnection: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionClearStats(hrasserver, (hrasconnection?.value ?: 0L)).toUInt()

public actual fun mprAdminConnectionEnum(hrasserver: Long, dwlevel: UInt, lplpbbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionEnum(hrasserver, dwlevel.toInt(), (lplpbbuffer?.value ?: 0L), dwprefmaxlen.toInt(), (lpdwentriesread?.value ?: 0L), (lpdwtotalentries?.value ?: 0L), (lpdwresumehandle?.value ?: 0L)).toUInt()

public actual fun mprAdminConnectionEnumEx(hrasserver: Long, pobjectheader: COpaquePointer?, dwpreferedmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, pprasconn: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionEnumEx(hrasserver, (pobjectheader?.value ?: 0L), dwpreferedmaxlen.toInt(), (lpdwentriesread?.value ?: 0L), (lpdwtotalentries?.value ?: 0L), (pprasconn?.value ?: 0L), (lpdwresumehandle?.value ?: 0L)).toUInt()

public actual fun mprAdminConnectionGetInfo(hrasserver: Long, dwlevel: UInt, hrasconnection: Handle, lplpbbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionGetInfo(hrasserver, dwlevel.toInt(), (hrasconnection?.value ?: 0L), (lplpbbuffer?.value ?: 0L)).toUInt()

public actual fun mprAdminConnectionGetInfoEx(hrasserver: Long, hrasconnection: Handle, prasconnection: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionGetInfoEx(hrasserver, (hrasconnection?.value ?: 0L), (prasconnection?.value ?: 0L)).toUInt()

public actual fun mprAdminConnectionRemoveQuarantine(hrasserver: Handle, hrasconnection: Handle, fisipaddress: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionRemoveQuarantine((hrasserver?.value ?: 0L), (hrasconnection?.value ?: 0L), fisipaddress).toUInt()

public actual fun mprAdminDeregisterConnectionNotification(hmprserver: Long, heventnotification: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminDeregisterConnectionNotification(hmprserver, (heventnotification?.value ?: 0L)).toUInt()

public actual fun mprAdminDeviceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: COpaquePointer?, lpdwtotalentries: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminDeviceEnum(hmprserver, dwlevel.toInt(), (lplpbbuffer?.value ?: 0L), (lpdwtotalentries?.value ?: 0L)).toUInt()

public actual fun mprAdminEstablishDomainRasServer(pszdomain: Pcwstr, pszmachine: Pcwstr, benable: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminEstablishDomainRasServer((pszdomain?.value ?: 0L), (pszmachine?.value ?: 0L), benable).toUInt()

public actual fun mprAdminGetErrorString(dwerror: UInt, lplpwserrorstring: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminGetErrorString(dwerror.toInt(), (lplpwserrorstring?.value ?: 0L)).toUInt()

public actual fun mprAdminGetPDCServer(lpszdomain: Pcwstr, lpszserver: Pcwstr, lpszpdcserver: Pwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminGetPDCServer((lpszdomain?.value ?: 0L), (lpszserver?.value ?: 0L), (lpszpdcserver?.value ?: 0L)).toUInt()

public actual fun mprAdminInterfaceConnect(hmprserver: Long, hinterface: Handle, hevent: Handle, fsynchronous: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceConnect(hmprserver, (hinterface?.value ?: 0L), (hevent?.value ?: 0L), fsynchronous).toUInt()

public actual fun mprAdminInterfaceCreate(hmprserver: Long, dwlevel: UInt, lpbbuffer: COpaquePointer?, phinterface: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceCreate(hmprserver, dwlevel.toInt(), (lpbbuffer?.value ?: 0L), (phinterface?.value ?: 0L)).toUInt()

public actual fun mprAdminInterfaceDelete(hmprserver: Long, hinterface: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDelete(hmprserver, (hinterface?.value ?: 0L)).toUInt()

public actual fun mprAdminInterfaceDeviceGetInfo(hmprserver: Long, hinterface: Handle, dwindex: UInt, dwlevel: UInt, lplpbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDeviceGetInfo(hmprserver, (hinterface?.value ?: 0L), dwindex.toInt(), dwlevel.toInt(), (lplpbuffer?.value ?: 0L)).toUInt()

public actual fun mprAdminInterfaceDeviceSetInfo(hmprserver: Long, hinterface: Handle, dwindex: UInt, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDeviceSetInfo(hmprserver, (hinterface?.value ?: 0L), dwindex.toInt(), dwlevel.toInt(), (lpbbuffer?.value ?: 0L)).toUInt()

public actual fun mprAdminInterfaceDisconnect(hmprserver: Long, hinterface: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDisconnect(hmprserver, (hinterface?.value ?: 0L)).toUInt()

public actual fun mprAdminInterfaceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceEnum(hmprserver, dwlevel.toInt(), (lplpbbuffer?.value ?: 0L), dwprefmaxlen.toInt(), (lpdwentriesread?.value ?: 0L), (lpdwtotalentries?.value ?: 0L), (lpdwresumehandle?.value ?: 0L)).toUInt()

public actual fun mprAdminInterfaceGetCredentials(lpwsserver: Pcwstr, lpwsinterfacename: Pcwstr, lpwsusername: Pwstr, lpwspassword: Pwstr, lpwsdomainname: Pwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetCredentials((lpwsserver?.value ?: 0L), (lpwsinterfacename?.value ?: 0L), (lpwsusername?.value ?: 0L), (lpwspassword?.value ?: 0L), (lpwsdomainname?.value ?: 0L)).toUInt()

public actual fun mprAdminInterfaceGetCredentialsEx(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lplpbbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetCredentialsEx(hmprserver, (hinterface?.value ?: 0L), dwlevel.toInt(), (lplpbbuffer?.value ?: 0L)).toUInt()

public actual fun mprAdminInterfaceGetCustomInfoEx(hmprserver: Long, hinterface: Handle, pcustominfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetCustomInfoEx(hmprserver, (hinterface?.value ?: 0L), (pcustominfo?.value ?: 0L)).toUInt()

public actual fun mprAdminInterfaceGetHandle(hmprserver: Long, lpwsinterfacename: Pcwstr, phinterface: COpaquePointer?, fincludeclientinterfaces: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetHandle(hmprserver, (lpwsinterfacename?.value ?: 0L), (phinterface?.value ?: 0L), fincludeclientinterfaces).toUInt()

public actual fun mprAdminInterfaceGetInfo(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lplpbbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetInfo(hmprserver, (hinterface?.value ?: 0L), dwlevel.toInt(), (lplpbbuffer?.value ?: 0L)).toUInt()

public actual fun mprAdminInterfaceQueryUpdateResult(hmprserver: Long, hinterface: Handle, dwprotocolid: UInt, lpdwupdateresult: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceQueryUpdateResult(hmprserver, (hinterface?.value ?: 0L), dwprotocolid.toInt(), (lpdwupdateresult?.value ?: 0L)).toUInt()

public actual fun mprAdminInterfaceSetCredentials(lpwsserver: Pcwstr, lpwsinterfacename: Pcwstr, lpwsusername: Pcwstr, lpwsdomainname: Pcwstr, lpwspassword: Pcwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetCredentials((lpwsserver?.value ?: 0L), (lpwsinterfacename?.value ?: 0L), (lpwsusername?.value ?: 0L), (lpwsdomainname?.value ?: 0L), (lpwspassword?.value ?: 0L)).toUInt()

public actual fun mprAdminInterfaceSetCredentialsEx(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetCredentialsEx(hmprserver, (hinterface?.value ?: 0L), dwlevel.toInt(), (lpbbuffer?.value ?: 0L)).toUInt()

public actual fun mprAdminInterfaceSetCustomInfoEx(hmprserver: Long, hinterface: Handle, pcustominfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetCustomInfoEx(hmprserver, (hinterface?.value ?: 0L), (pcustominfo?.value ?: 0L)).toUInt()

public actual fun mprAdminInterfaceSetInfo(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetInfo(hmprserver, (hinterface?.value ?: 0L), dwlevel.toInt(), (lpbbuffer?.value ?: 0L)).toUInt()

public actual fun mprAdminInterfaceTransportAdd(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, pinterfaceinfo: COpaquePointer?, dwinterfaceinfosize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportAdd(hmprserver, (hinterface?.value ?: 0L), dwtransportid.toInt(), (pinterfaceinfo?.value ?: 0L), dwinterfaceinfosize.toInt()).toUInt()

public actual fun mprAdminInterfaceTransportGetInfo(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, ppinterfaceinfo: COpaquePointer?, lpdwinterfaceinfosize: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportGetInfo(hmprserver, (hinterface?.value ?: 0L), dwtransportid.toInt(), (ppinterfaceinfo?.value ?: 0L), (lpdwinterfaceinfosize?.value ?: 0L)).toUInt()

public actual fun mprAdminInterfaceTransportRemove(hmprserver: Long, hinterface: Handle, dwtransportid: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportRemove(hmprserver, (hinterface?.value ?: 0L), dwtransportid.toInt()).toUInt()

public actual fun mprAdminInterfaceTransportSetInfo(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, pinterfaceinfo: COpaquePointer?, dwinterfaceinfosize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportSetInfo(hmprserver, (hinterface?.value ?: 0L), dwtransportid.toInt(), (pinterfaceinfo?.value ?: 0L), dwinterfaceinfosize.toInt()).toUInt()

public actual fun mprAdminInterfaceUpdatePhonebookInfo(hmprserver: Long, hinterface: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceUpdatePhonebookInfo(hmprserver, (hinterface?.value ?: 0L)).toUInt()

public actual fun mprAdminInterfaceUpdateRoutes(hmprserver: Long, hinterface: Handle, dwprotocolid: UInt, hevent: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceUpdateRoutes(hmprserver, (hinterface?.value ?: 0L), dwprotocolid.toInt(), (hevent?.value ?: 0L)).toUInt()

public actual fun mprAdminIsDomainRasServer(pszdomain: Pcwstr, pszmachine: Pcwstr, pbisrasserver: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminIsDomainRasServer((pszdomain?.value ?: 0L), (pszmachine?.value ?: 0L), (pbisrasserver?.value ?: 0L)).toUInt()

public actual fun mprAdminIsServiceInitialized(lpwsservername: Pcwstr, fisserviceinitialized: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminIsServiceInitialized((lpwsservername?.value ?: 0L), (fisserviceinitialized?.value ?: 0L)).toUInt()

public actual fun mprAdminIsServiceRunning(lpwsservername: Pcwstr): Bool =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminIsServiceRunning((lpwsservername?.value ?: 0L))

public actual fun mprAdminMIBBufferFree(pbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBBufferFree((pbuffer?.value ?: 0L)).toUInt()

public actual fun mprAdminMIBEntryCreate(hmibserver: Long, dwpid: UInt, dwroutingpid: UInt, lpentry: COpaquePointer?, dwentrysize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryCreate(hmibserver, dwpid.toInt(), dwroutingpid.toInt(), (lpentry?.value ?: 0L), dwentrysize.toInt()).toUInt()

public actual fun mprAdminMIBEntryDelete(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: COpaquePointer?, dwentrysize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryDelete(hmibserver, dwprotocolid.toInt(), dwroutingpid.toInt(), (lpentry?.value ?: 0L), dwentrysize.toInt()).toUInt()

public actual fun mprAdminMIBEntryGet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: COpaquePointer?, dwinentrysize: UInt, lplpoutentry: COpaquePointer?, lpoutentrysize: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryGet(hmibserver, dwprotocolid.toInt(), dwroutingpid.toInt(), (lpinentry?.value ?: 0L), dwinentrysize.toInt(), (lplpoutentry?.value ?: 0L), (lpoutentrysize?.value ?: 0L)).toUInt()

public actual fun mprAdminMIBEntryGetFirst(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: COpaquePointer?, dwinentrysize: UInt, lplpoutentry: COpaquePointer?, lpoutentrysize: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryGetFirst(hmibserver, dwprotocolid.toInt(), dwroutingpid.toInt(), (lpinentry?.value ?: 0L), dwinentrysize.toInt(), (lplpoutentry?.value ?: 0L), (lpoutentrysize?.value ?: 0L)).toUInt()

public actual fun mprAdminMIBEntryGetNext(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: COpaquePointer?, dwinentrysize: UInt, lplpoutentry: COpaquePointer?, lpoutentrysize: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryGetNext(hmibserver, dwprotocolid.toInt(), dwroutingpid.toInt(), (lpinentry?.value ?: 0L), dwinentrysize.toInt(), (lplpoutentry?.value ?: 0L), (lpoutentrysize?.value ?: 0L)).toUInt()

public actual fun mprAdminMIBEntrySet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: COpaquePointer?, dwentrysize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntrySet(hmibserver, dwprotocolid.toInt(), dwroutingpid.toInt(), (lpentry?.value ?: 0L), dwentrysize.toInt()).toUInt()

public actual fun mprAdminMIBServerConnect(lpwsservername: Pcwstr, phmibserver: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBServerConnect((lpwsservername?.value ?: 0L), (phmibserver?.value ?: 0L)).toUInt()

public actual fun mprAdminMIBServerDisconnect(hmibserver: Long) {
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBServerDisconnect(hmibserver)
}

public actual fun mprAdminPortClearStats(hrasserver: Long, hport: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminPortClearStats(hrasserver, (hport?.value ?: 0L)).toUInt()

public actual fun mprAdminPortDisconnect(hrasserver: Long, hport: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminPortDisconnect(hrasserver, (hport?.value ?: 0L)).toUInt()

public actual fun mprAdminPortEnum(hrasserver: Long, dwlevel: UInt, hrasconnection: Handle, lplpbbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminPortEnum(hrasserver, dwlevel.toInt(), (hrasconnection?.value ?: 0L), (lplpbbuffer?.value ?: 0L), dwprefmaxlen.toInt(), (lpdwentriesread?.value ?: 0L), (lpdwtotalentries?.value ?: 0L), (lpdwresumehandle?.value ?: 0L)).toUInt()

public actual fun mprAdminPortGetInfo(hrasserver: Long, dwlevel: UInt, hport: Handle, lplpbbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminPortGetInfo(hrasserver, dwlevel.toInt(), (hport?.value ?: 0L), (lplpbbuffer?.value ?: 0L)).toUInt()

public actual fun mprAdminPortReset(hrasserver: Long, hport: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminPortReset(hrasserver, (hport?.value ?: 0L)).toUInt()

public actual fun mprAdminRegisterConnectionNotification(hmprserver: Long, heventnotification: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminRegisterConnectionNotification(hmprserver, (heventnotification?.value ?: 0L)).toUInt()

public actual fun mprAdminSendUserMessage(hmprserver: Long, hconnection: Handle, lpwszmessage: Pcwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminSendUserMessage(hmprserver, (hconnection?.value ?: 0L), (lpwszmessage?.value ?: 0L)).toUInt()

public actual fun mprAdminServerConnect(lpwsservername: Pcwstr, phmprserver: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminServerConnect((lpwsservername?.value ?: 0L), (phmprserver?.value ?: 0L)).toUInt()

public actual fun mprAdminServerDisconnect(hmprserver: Long) {
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminServerDisconnect(hmprserver)
}

public actual fun mprAdminServerGetCredentials(hmprserver: Long, dwlevel: UInt, lplpbbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminServerGetCredentials(hmprserver, dwlevel.toInt(), (lplpbbuffer?.value ?: 0L)).toUInt()

public actual fun mprAdminServerGetInfo(hmprserver: Long, dwlevel: UInt, lplpbbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminServerGetInfo(hmprserver, dwlevel.toInt(), (lplpbbuffer?.value ?: 0L)).toUInt()

public actual fun mprAdminServerGetInfoEx(hmprserver: Long, pserverinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminServerGetInfoEx(hmprserver, (pserverinfo?.value ?: 0L)).toUInt()

public actual fun mprAdminServerSetCredentials(hmprserver: Long, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminServerSetCredentials(hmprserver, dwlevel.toInt(), (lpbbuffer?.value ?: 0L)).toUInt()

public actual fun mprAdminServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminServerSetInfo(hmprserver, dwlevel.toInt(), (lpbbuffer?.value ?: 0L)).toUInt()

public actual fun mprAdminServerSetInfoEx(hmprserver: Long, pserverinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminServerSetInfoEx(hmprserver, (pserverinfo?.value ?: 0L)).toUInt()

public actual fun mprAdminTransportCreate(hmprserver: Long, dwtransportid: UInt, lpwstransportname: Pcwstr, pglobalinfo: COpaquePointer?, dwglobalinfosize: UInt, pclientinterfaceinfo: COpaquePointer?, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminTransportCreate(hmprserver, dwtransportid.toInt(), (lpwstransportname?.value ?: 0L), (pglobalinfo?.value ?: 0L), dwglobalinfosize.toInt(), (pclientinterfaceinfo?.value ?: 0L), dwclientinterfaceinfosize.toInt(), (lpwsdllpath?.value ?: 0L)).toUInt()

public actual fun mprAdminTransportGetInfo(hmprserver: Long, dwtransportid: UInt, ppglobalinfo: COpaquePointer?, lpdwglobalinfosize: COpaquePointer?, ppclientinterfaceinfo: COpaquePointer?, lpdwclientinterfaceinfosize: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminTransportGetInfo(hmprserver, dwtransportid.toInt(), (ppglobalinfo?.value ?: 0L), (lpdwglobalinfosize?.value ?: 0L), (ppclientinterfaceinfo?.value ?: 0L), (lpdwclientinterfaceinfosize?.value ?: 0L)).toUInt()

public actual fun mprAdminTransportSetInfo(hmprserver: Long, dwtransportid: UInt, pglobalinfo: COpaquePointer?, dwglobalinfosize: UInt, pclientinterfaceinfo: COpaquePointer?, dwclientinterfaceinfosize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminTransportSetInfo(hmprserver, dwtransportid.toInt(), (pglobalinfo?.value ?: 0L), dwglobalinfosize.toInt(), (pclientinterfaceinfo?.value ?: 0L), dwclientinterfaceinfosize.toInt()).toUInt()

public actual fun mprAdminUpdateConnection(hrasserver: Long, hrasconnection: Handle, prasupdateconnection: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminUpdateConnection(hrasserver, (hrasconnection?.value ?: 0L), (prasupdateconnection?.value ?: 0L)).toUInt()

public actual fun mprAdminUserGetInfo(lpszserver: Pcwstr, lpszuser: Pcwstr, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminUserGetInfo((lpszserver?.value ?: 0L), (lpszuser?.value ?: 0L), dwlevel.toInt(), (lpbbuffer?.value ?: 0L)).toUInt()

public actual fun mprAdminUserSetInfo(lpszserver: Pcwstr, lpszuser: Pcwstr, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprAdminUserSetInfo((lpszserver?.value ?: 0L), (lpszuser?.value ?: 0L), dwlevel.toInt(), (lpbbuffer?.value ?: 0L)).toUInt()

public actual fun mprConfigBufferFree(pbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigBufferFree((pbuffer?.value ?: 0L)).toUInt()

public actual fun mprConfigFilterGetInfo(hmprconfig: Handle, dwlevel: UInt, dwtransportid: UInt, lpbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigFilterGetInfo((hmprconfig?.value ?: 0L), dwlevel.toInt(), dwtransportid.toInt(), (lpbuffer?.value ?: 0L)).toUInt()

public actual fun mprConfigFilterSetInfo(hmprconfig: Handle, dwlevel: UInt, dwtransportid: UInt, lpbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigFilterSetInfo((hmprconfig?.value ?: 0L), dwlevel.toInt(), dwtransportid.toInt(), (lpbuffer?.value ?: 0L)).toUInt()

public actual fun mprConfigGetFriendlyName(hmprconfig: Handle, pszguidname: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigGetFriendlyName((hmprconfig?.value ?: 0L), (pszguidname?.value ?: 0L), (pszbuffer?.value ?: 0L), dwbuffersize.toInt()).toUInt()

public actual fun mprConfigGetGuidName(hmprconfig: Handle, pszfriendlyname: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigGetGuidName((hmprconfig?.value ?: 0L), (pszfriendlyname?.value ?: 0L), (pszbuffer?.value ?: 0L), dwbuffersize.toInt()).toUInt()

public actual fun mprConfigInterfaceCreate(hmprconfig: Handle, dwlevel: UInt, lpbbuffer: COpaquePointer?, phrouterinterface: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceCreate((hmprconfig?.value ?: 0L), dwlevel.toInt(), (lpbbuffer?.value ?: 0L), (phrouterinterface?.value ?: 0L)).toUInt()

public actual fun mprConfigInterfaceDelete(hmprconfig: Handle, hrouterinterface: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceDelete((hmprconfig?.value ?: 0L), (hrouterinterface?.value ?: 0L)).toUInt()

public actual fun mprConfigInterfaceEnum(hmprconfig: Handle, dwlevel: UInt, lplpbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceEnum((hmprconfig?.value ?: 0L), dwlevel.toInt(), (lplpbuffer?.value ?: 0L), dwprefmaxlen.toInt(), (lpdwentriesread?.value ?: 0L), (lpdwtotalentries?.value ?: 0L), (lpdwresumehandle?.value ?: 0L)).toUInt()

public actual fun mprConfigInterfaceGetCustomInfoEx(hmprconfig: Handle, hrouterinterface: Handle, pcustominfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceGetCustomInfoEx((hmprconfig?.value ?: 0L), (hrouterinterface?.value ?: 0L), (pcustominfo?.value ?: 0L)).toUInt()

public actual fun mprConfigInterfaceGetHandle(hmprconfig: Handle, lpwsinterfacename: Pcwstr, phrouterinterface: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceGetHandle((hmprconfig?.value ?: 0L), (lpwsinterfacename?.value ?: 0L), (phrouterinterface?.value ?: 0L)).toUInt()

public actual fun mprConfigInterfaceGetInfo(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lplpbuffer: COpaquePointer?, lpdwbuffersize: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceGetInfo((hmprconfig?.value ?: 0L), (hrouterinterface?.value ?: 0L), dwlevel.toInt(), (lplpbuffer?.value ?: 0L), (lpdwbuffersize?.value ?: 0L)).toUInt()

public actual fun mprConfigInterfaceSetCustomInfoEx(hmprconfig: Handle, hrouterinterface: Handle, pcustominfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceSetCustomInfoEx((hmprconfig?.value ?: 0L), (hrouterinterface?.value ?: 0L), (pcustominfo?.value ?: 0L)).toUInt()

public actual fun mprConfigInterfaceSetInfo(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceSetInfo((hmprconfig?.value ?: 0L), (hrouterinterface?.value ?: 0L), dwlevel.toInt(), (lpbbuffer?.value ?: 0L)).toUInt()

public actual fun mprConfigInterfaceTransportAdd(hmprconfig: Handle, hrouterinterface: Handle, dwtransportid: UInt, lpwstransportname: Pcwstr, pinterfaceinfo: COpaquePointer?, dwinterfaceinfosize: UInt, phrouteriftransport: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportAdd((hmprconfig?.value ?: 0L), (hrouterinterface?.value ?: 0L), dwtransportid.toInt(), (lpwstransportname?.value ?: 0L), (pinterfaceinfo?.value ?: 0L), dwinterfaceinfosize.toInt(), (phrouteriftransport?.value ?: 0L)).toUInt()

public actual fun mprConfigInterfaceTransportEnum(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lplpbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportEnum((hmprconfig?.value ?: 0L), (hrouterinterface?.value ?: 0L), dwlevel.toInt(), (lplpbuffer?.value ?: 0L), dwprefmaxlen.toInt(), (lpdwentriesread?.value ?: 0L), (lpdwtotalentries?.value ?: 0L), (lpdwresumehandle?.value ?: 0L)).toUInt()

public actual fun mprConfigInterfaceTransportGetHandle(hmprconfig: Handle, hrouterinterface: Handle, dwtransportid: UInt, phrouteriftransport: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportGetHandle((hmprconfig?.value ?: 0L), (hrouterinterface?.value ?: 0L), dwtransportid.toInt(), (phrouteriftransport?.value ?: 0L)).toUInt()

public actual fun mprConfigInterfaceTransportGetInfo(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle, ppinterfaceinfo: COpaquePointer?, lpdwinterfaceinfosize: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportGetInfo((hmprconfig?.value ?: 0L), (hrouterinterface?.value ?: 0L), (hrouteriftransport?.value ?: 0L), (ppinterfaceinfo?.value ?: 0L), (lpdwinterfaceinfosize?.value ?: 0L)).toUInt()

public actual fun mprConfigInterfaceTransportRemove(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportRemove((hmprconfig?.value ?: 0L), (hrouterinterface?.value ?: 0L), (hrouteriftransport?.value ?: 0L)).toUInt()

public actual fun mprConfigInterfaceTransportSetInfo(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle, pinterfaceinfo: COpaquePointer?, dwinterfaceinfosize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportSetInfo((hmprconfig?.value ?: 0L), (hrouterinterface?.value ?: 0L), (hrouteriftransport?.value ?: 0L), (pinterfaceinfo?.value ?: 0L), dwinterfaceinfosize.toInt()).toUInt()

public actual fun mprConfigServerBackup(hmprconfig: Handle, lpwspath: Pcwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigServerBackup((hmprconfig?.value ?: 0L), (lpwspath?.value ?: 0L)).toUInt()

public actual fun mprConfigServerConnect(lpwsservername: Pcwstr, phmprconfig: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigServerConnect((lpwsservername?.value ?: 0L), (phmprconfig?.value ?: 0L)).toUInt()

public actual fun mprConfigServerDisconnect(hmprconfig: Handle) {
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigServerDisconnect((hmprconfig?.value ?: 0L))
}

public actual fun mprConfigServerGetInfo(hmprconfig: Handle, dwlevel: UInt, lplpbbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigServerGetInfo((hmprconfig?.value ?: 0L), dwlevel.toInt(), (lplpbbuffer?.value ?: 0L)).toUInt()

public actual fun mprConfigServerGetInfoEx(hmprconfig: Handle, pserverinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigServerGetInfoEx((hmprconfig?.value ?: 0L), (pserverinfo?.value ?: 0L)).toUInt()

public actual fun mprConfigServerInstall(dwlevel: UInt, pbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigServerInstall(dwlevel.toInt(), (pbuffer?.value ?: 0L)).toUInt()

public actual fun mprConfigServerRefresh(hmprconfig: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigServerRefresh((hmprconfig?.value ?: 0L)).toUInt()

public actual fun mprConfigServerRestore(hmprconfig: Handle, lpwspath: Pcwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigServerRestore((hmprconfig?.value ?: 0L), (lpwspath?.value ?: 0L)).toUInt()

public actual fun mprConfigServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigServerSetInfo(hmprserver, dwlevel.toInt(), (lpbbuffer?.value ?: 0L)).toUInt()

public actual fun mprConfigServerSetInfoEx(hmprconfig: Handle, psetserverconfig: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigServerSetInfoEx((hmprconfig?.value ?: 0L), (psetserverconfig?.value ?: 0L)).toUInt()

public actual fun mprConfigTransportCreate(hmprconfig: Handle, dwtransportid: UInt, lpwstransportname: Pcwstr, pglobalinfo: COpaquePointer?, dwglobalinfosize: UInt, pclientinterfaceinfo: COpaquePointer?, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr, phroutertransport: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigTransportCreate((hmprconfig?.value ?: 0L), dwtransportid.toInt(), (lpwstransportname?.value ?: 0L), (pglobalinfo?.value ?: 0L), dwglobalinfosize.toInt(), (pclientinterfaceinfo?.value ?: 0L), dwclientinterfaceinfosize.toInt(), (lpwsdllpath?.value ?: 0L), (phroutertransport?.value ?: 0L)).toUInt()

public actual fun mprConfigTransportDelete(hmprconfig: Handle, hroutertransport: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigTransportDelete((hmprconfig?.value ?: 0L), (hroutertransport?.value ?: 0L)).toUInt()

public actual fun mprConfigTransportEnum(hmprconfig: Handle, dwlevel: UInt, lplpbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigTransportEnum((hmprconfig?.value ?: 0L), dwlevel.toInt(), (lplpbuffer?.value ?: 0L), dwprefmaxlen.toInt(), (lpdwentriesread?.value ?: 0L), (lpdwtotalentries?.value ?: 0L), (lpdwresumehandle?.value ?: 0L)).toUInt()

public actual fun mprConfigTransportGetHandle(hmprconfig: Handle, dwtransportid: UInt, phroutertransport: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigTransportGetHandle((hmprconfig?.value ?: 0L), dwtransportid.toInt(), (phroutertransport?.value ?: 0L)).toUInt()

public actual fun mprConfigTransportGetInfo(hmprconfig: Handle, hroutertransport: Handle, ppglobalinfo: COpaquePointer?, lpdwglobalinfosize: COpaquePointer?, ppclientinterfaceinfo: COpaquePointer?, lpdwclientinterfaceinfosize: COpaquePointer?, lplpwsdllpath: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigTransportGetInfo((hmprconfig?.value ?: 0L), (hroutertransport?.value ?: 0L), (ppglobalinfo?.value ?: 0L), (lpdwglobalinfosize?.value ?: 0L), (ppclientinterfaceinfo?.value ?: 0L), (lpdwclientinterfaceinfosize?.value ?: 0L), (lplpwsdllpath?.value ?: 0L)).toUInt()

public actual fun mprConfigTransportSetInfo(hmprconfig: Handle, hroutertransport: Handle, pglobalinfo: COpaquePointer?, dwglobalinfosize: UInt, pclientinterfaceinfo: COpaquePointer?, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprConfigTransportSetInfo((hmprconfig?.value ?: 0L), (hroutertransport?.value ?: 0L), (pglobalinfo?.value ?: 0L), dwglobalinfosize.toInt(), (pclientinterfaceinfo?.value ?: 0L), dwclientinterfaceinfosize.toInt(), (lpwsdllpath?.value ?: 0L)).toUInt()

public actual fun mprInfoBlockAdd(lpheader: COpaquePointer?, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: COpaquePointer?, lplpnewheader: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprInfoBlockAdd((lpheader?.value ?: 0L), dwinfotype.toInt(), dwitemsize.toInt(), dwitemcount.toInt(), (lpitemdata?.value ?: 0L), (lplpnewheader?.value ?: 0L)).toUInt()

public actual fun mprInfoBlockFind(lpheader: COpaquePointer?, dwinfotype: UInt, lpdwitemsize: COpaquePointer?, lpdwitemcount: COpaquePointer?, lplpitemdata: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprInfoBlockFind((lpheader?.value ?: 0L), dwinfotype.toInt(), (lpdwitemsize?.value ?: 0L), (lpdwitemcount?.value ?: 0L), (lplpitemdata?.value ?: 0L)).toUInt()

public actual fun mprInfoBlockQuerySize(lpheader: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprInfoBlockQuerySize((lpheader?.value ?: 0L)).toUInt()

public actual fun mprInfoBlockRemove(lpheader: COpaquePointer?, dwinfotype: UInt, lplpnewheader: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprInfoBlockRemove((lpheader?.value ?: 0L), dwinfotype.toInt(), (lplpnewheader?.value ?: 0L)).toUInt()

public actual fun mprInfoBlockSet(lpheader: COpaquePointer?, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: COpaquePointer?, lplpnewheader: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprInfoBlockSet((lpheader?.value ?: 0L), dwinfotype.toInt(), dwitemsize.toInt(), dwitemcount.toInt(), (lpitemdata?.value ?: 0L), (lplpnewheader?.value ?: 0L)).toUInt()

public actual fun mprInfoCreate(dwversion: UInt, lplpnewheader: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprInfoCreate(dwversion.toInt(), (lplpnewheader?.value ?: 0L)).toUInt()

public actual fun mprInfoDelete(lpheader: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprInfoDelete((lpheader?.value ?: 0L)).toUInt()

public actual fun mprInfoDuplicate(lpheader: COpaquePointer?, lplpnewheader: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprInfoDuplicate((lpheader?.value ?: 0L), (lplpnewheader?.value ?: 0L)).toUInt()

public actual fun mprInfoRemoveAll(lpheader: COpaquePointer?, lplpnewheader: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_mprInfoRemoveAll((lpheader?.value ?: 0L), (lplpnewheader?.value ?: 0L)).toUInt()

public actual fun rasClearConnectionStatistics(hrasconn: Hrasconn): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasClearConnectionStatistics((hrasconn?.value ?: 0L)).toUInt()

public actual fun rasClearLinkStatistics(hrasconn: Hrasconn, dwsubentry: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasClearLinkStatistics((hrasconn?.value ?: 0L), dwsubentry.toInt()).toUInt()

public actual fun rasConnectionNotificationA(param0: Hrasconn, param1: Handle, param2: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasConnectionNotificationA((param0?.value ?: 0L), (param1?.value ?: 0L), param2.toInt()).toUInt()

public actual fun rasConnectionNotificationW(param0: Hrasconn, param1: Handle, param2: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasConnectionNotificationW((param0?.value ?: 0L), (param1?.value ?: 0L), param2.toInt()).toUInt()

public actual fun rasCreatePhonebookEntryA(param0: Hwnd, param1: Pcstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasCreatePhonebookEntryA((param0?.value ?: 0L), (param1?.value ?: 0L)).toUInt()

public actual fun rasCreatePhonebookEntryW(param0: Hwnd, param1: Pcwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasCreatePhonebookEntryW((param0?.value ?: 0L), (param1?.value ?: 0L)).toUInt()

public actual fun rasDeleteEntryA(param0: Pcstr, param1: Pcstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasDeleteEntryA((param0?.value ?: 0L), (param1?.value ?: 0L)).toUInt()

public actual fun rasDeleteEntryW(param0: Pcwstr, param1: Pcwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasDeleteEntryW((param0?.value ?: 0L), (param1?.value ?: 0L)).toUInt()

public actual fun rasDeleteSubEntryA(pszphonebook: Pcstr, pszentry: Pcstr, dwsubentryid: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasDeleteSubEntryA((pszphonebook?.value ?: 0L), (pszentry?.value ?: 0L), dwsubentryid.toInt()).toUInt()

public actual fun rasDeleteSubEntryW(pszphonebook: Pcwstr, pszentry: Pcwstr, dwsubentryid: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasDeleteSubEntryW((pszphonebook?.value ?: 0L), (pszentry?.value ?: 0L), dwsubentryid.toInt()).toUInt()

public actual fun rasDialA(param0: COpaquePointer?, param1: Pcstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?, param5: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasDialA((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L), param3.toInt(), (param4?.value ?: 0L), (param5?.value ?: 0L)).toUInt()

public actual fun rasDialDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpszphonenumber: Pcstr, lpinfo: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasDialDlgA((lpszphonebook?.value ?: 0L), (lpszentry?.value ?: 0L), (lpszphonenumber?.value ?: 0L), (lpinfo?.value ?: 0L))

public actual fun rasDialDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpszphonenumber: Pcwstr, lpinfo: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasDialDlgW((lpszphonebook?.value ?: 0L), (lpszentry?.value ?: 0L), (lpszphonenumber?.value ?: 0L), (lpinfo?.value ?: 0L))

public actual fun rasDialW(param0: COpaquePointer?, param1: Pcwstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?, param5: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasDialW((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L), param3.toInt(), (param4?.value ?: 0L), (param5?.value ?: 0L)).toUInt()

public actual fun rasEditPhonebookEntryA(param0: Hwnd, param1: Pcstr, param2: Pcstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasEditPhonebookEntryA((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).toUInt()

public actual fun rasEditPhonebookEntryW(param0: Hwnd, param1: Pcwstr, param2: Pcwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasEditPhonebookEntryW((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).toUInt()

public actual fun rasEntryDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpinfo: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasEntryDlgA((lpszphonebook?.value ?: 0L), (lpszentry?.value ?: 0L), (lpinfo?.value ?: 0L))

public actual fun rasEntryDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpinfo: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasEntryDlgW((lpszphonebook?.value ?: 0L), (lpszentry?.value ?: 0L), (lpinfo?.value ?: 0L))

public actual fun rasEnumAutodialAddressesA(lpprasautodialaddresses: COpaquePointer?, lpdwcbrasautodialaddresses: COpaquePointer?, lpdwcrasautodialaddresses: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasEnumAutodialAddressesA((lpprasautodialaddresses?.value ?: 0L), (lpdwcbrasautodialaddresses?.value ?: 0L), (lpdwcrasautodialaddresses?.value ?: 0L)).toUInt()

public actual fun rasEnumAutodialAddressesW(lpprasautodialaddresses: COpaquePointer?, lpdwcbrasautodialaddresses: COpaquePointer?, lpdwcrasautodialaddresses: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasEnumAutodialAddressesW((lpprasautodialaddresses?.value ?: 0L), (lpdwcbrasautodialaddresses?.value ?: 0L), (lpdwcrasautodialaddresses?.value ?: 0L)).toUInt()

public actual fun rasEnumConnectionsA(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasEnumConnectionsA((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).toUInt()

public actual fun rasEnumConnectionsW(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasEnumConnectionsW((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).toUInt()

public actual fun rasEnumDevicesA(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasEnumDevicesA((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).toUInt()

public actual fun rasEnumDevicesW(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasEnumDevicesW((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).toUInt()

public actual fun rasEnumEntriesA(param0: Pcstr, param1: Pcstr, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasEnumEntriesA((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L), (param3?.value ?: 0L), (param4?.value ?: 0L)).toUInt()

public actual fun rasEnumEntriesW(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasEnumEntriesW((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L), (param3?.value ?: 0L), (param4?.value ?: 0L)).toUInt()

public actual fun rasFreeEapUserIdentityA(praseapuseridentity: COpaquePointer?) {
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasFreeEapUserIdentityA((praseapuseridentity?.value ?: 0L))
}

public actual fun rasFreeEapUserIdentityW(praseapuseridentity: COpaquePointer?) {
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasFreeEapUserIdentityW((praseapuseridentity?.value ?: 0L))
}

public actual fun rasGetAutodialAddressA(param0: Pcstr, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetAutodialAddressA((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L), (param3?.value ?: 0L), (param4?.value ?: 0L)).toUInt()

public actual fun rasGetAutodialAddressW(param0: Pcwstr, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetAutodialAddressW((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L), (param3?.value ?: 0L), (param4?.value ?: 0L)).toUInt()

public actual fun rasGetAutodialEnableA(param0: UInt, param1: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetAutodialEnableA(param0.toInt(), (param1?.value ?: 0L)).toUInt()

public actual fun rasGetAutodialEnableW(param0: UInt, param1: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetAutodialEnableW(param0.toInt(), (param1?.value ?: 0L)).toUInt()

public actual fun rasGetAutodialParamA(param0: UInt, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetAutodialParamA(param0.toInt(), (param1?.value ?: 0L), (param2?.value ?: 0L)).toUInt()

public actual fun rasGetAutodialParamW(param0: UInt, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetAutodialParamW(param0.toInt(), (param1?.value ?: 0L), (param2?.value ?: 0L)).toUInt()

public actual fun rasGetConnectStatusA(param0: Hrasconn, param1: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetConnectStatusA((param0?.value ?: 0L), (param1?.value ?: 0L)).toUInt()

public actual fun rasGetConnectStatusW(param0: Hrasconn, param1: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetConnectStatusW((param0?.value ?: 0L), (param1?.value ?: 0L)).toUInt()

public actual fun rasGetConnectionStatistics(hrasconn: Hrasconn, lpstatistics: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetConnectionStatistics((hrasconn?.value ?: 0L), (lpstatistics?.value ?: 0L)).toUInt()

public actual fun rasGetCountryInfoA(param0: COpaquePointer?, param1: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetCountryInfoA((param0?.value ?: 0L), (param1?.value ?: 0L)).toUInt()

public actual fun rasGetCountryInfoW(param0: COpaquePointer?, param1: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetCountryInfoW((param0?.value ?: 0L), (param1?.value ?: 0L)).toUInt()

public actual fun rasGetCredentialsA(param0: Pcstr, param1: Pcstr, param2: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetCredentialsA((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).toUInt()

public actual fun rasGetCredentialsW(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetCredentialsW((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).toUInt()

public actual fun rasGetCustomAuthDataA(pszphonebook: Pcstr, pszentry: Pcstr, pbcustomauthdata: COpaquePointer?, pdwsizeofcustomauthdata: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetCustomAuthDataA((pszphonebook?.value ?: 0L), (pszentry?.value ?: 0L), (pbcustomauthdata?.value ?: 0L), (pdwsizeofcustomauthdata?.value ?: 0L)).toUInt()

public actual fun rasGetCustomAuthDataW(pszphonebook: Pcwstr, pszentry: Pcwstr, pbcustomauthdata: COpaquePointer?, pdwsizeofcustomauthdata: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetCustomAuthDataW((pszphonebook?.value ?: 0L), (pszentry?.value ?: 0L), (pbcustomauthdata?.value ?: 0L), (pdwsizeofcustomauthdata?.value ?: 0L)).toUInt()

public actual fun rasGetEapUserDataA(htoken: Handle, pszphonebook: Pcstr, pszentry: Pcstr, pbeapdata: COpaquePointer?, pdwsizeofeapdata: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetEapUserDataA((htoken?.value ?: 0L), (pszphonebook?.value ?: 0L), (pszentry?.value ?: 0L), (pbeapdata?.value ?: 0L), (pdwsizeofeapdata?.value ?: 0L)).toUInt()

public actual fun rasGetEapUserDataW(htoken: Handle, pszphonebook: Pcwstr, pszentry: Pcwstr, pbeapdata: COpaquePointer?, pdwsizeofeapdata: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetEapUserDataW((htoken?.value ?: 0L), (pszphonebook?.value ?: 0L), (pszentry?.value ?: 0L), (pbeapdata?.value ?: 0L), (pdwsizeofeapdata?.value ?: 0L)).toUInt()

public actual fun rasGetEapUserIdentityA(pszphonebook: Pcstr, pszentry: Pcstr, dwflags: UInt, hwnd: Hwnd, ppraseapuseridentity: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetEapUserIdentityA((pszphonebook?.value ?: 0L), (pszentry?.value ?: 0L), dwflags.toInt(), (hwnd?.value ?: 0L), (ppraseapuseridentity?.value ?: 0L)).toUInt()

public actual fun rasGetEapUserIdentityW(pszphonebook: Pcwstr, pszentry: Pcwstr, dwflags: UInt, hwnd: Hwnd, ppraseapuseridentity: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetEapUserIdentityW((pszphonebook?.value ?: 0L), (pszentry?.value ?: 0L), dwflags.toInt(), (hwnd?.value ?: 0L), (ppraseapuseridentity?.value ?: 0L)).toUInt()

public actual fun rasGetEntryDialParamsA(param0: Pcstr, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetEntryDialParamsA((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).toUInt()

public actual fun rasGetEntryDialParamsW(param0: Pcwstr, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetEntryDialParamsW((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).toUInt()

public actual fun rasGetEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetEntryPropertiesA((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L), (param3?.value ?: 0L), (param4?.value ?: 0L), (param5?.value ?: 0L)).toUInt()

public actual fun rasGetEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetEntryPropertiesW((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L), (param3?.value ?: 0L), (param4?.value ?: 0L), (param5?.value ?: 0L)).toUInt()

public actual fun rasGetErrorStringA(resourceid: UInt, lpszstring: Pstr, inbufsize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetErrorStringA(resourceid.toInt(), (lpszstring?.value ?: 0L), inbufsize.toInt()).toUInt()

public actual fun rasGetErrorStringW(resourceid: UInt, lpszstring: Pwstr, inbufsize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetErrorStringW(resourceid.toInt(), (lpszstring?.value ?: 0L), inbufsize.toInt()).toUInt()

public actual fun rasGetLinkStatistics(hrasconn: Hrasconn, dwsubentry: UInt, lpstatistics: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetLinkStatistics((hrasconn?.value ?: 0L), dwsubentry.toInt(), (lpstatistics?.value ?: 0L)).toUInt()

public actual fun rasGetPCscf(lpszpcscf: Pwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetPCscf((lpszpcscf?.value ?: 0L)).toUInt()

public actual fun rasGetProjectionInfoA(param0: Hrasconn, param1: Rasprojection, param2: COpaquePointer?, param3: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetProjectionInfoA((param0?.value ?: 0L), param1, (param2?.value ?: 0L), (param3?.value ?: 0L)).toUInt()

public actual fun rasGetProjectionInfoEx(hrasconn: Hrasconn, prasprojection: COpaquePointer?, lpdwsize: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetProjectionInfoEx((hrasconn?.value ?: 0L), (prasprojection?.value ?: 0L), (lpdwsize?.value ?: 0L)).toUInt()

public actual fun rasGetProjectionInfoW(param0: Hrasconn, param1: Rasprojection, param2: COpaquePointer?, param3: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetProjectionInfoW((param0?.value ?: 0L), param1, (param2?.value ?: 0L), (param3?.value ?: 0L)).toUInt()

public actual fun rasGetSubEntryHandleA(param0: Hrasconn, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryHandleA((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun rasGetSubEntryHandleW(param0: Hrasconn, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryHandleW((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun rasGetSubEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: UInt, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?, param6: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryPropertiesA((param0?.value ?: 0L), (param1?.value ?: 0L), param2.toInt(), (param3?.value ?: 0L), (param4?.value ?: 0L), (param5?.value ?: 0L), (param6?.value ?: 0L)).toUInt()

public actual fun rasGetSubEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: UInt, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?, param6: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryPropertiesW((param0?.value ?: 0L), (param1?.value ?: 0L), param2.toInt(), (param3?.value ?: 0L), (param4?.value ?: 0L), (param5?.value ?: 0L), (param6?.value ?: 0L)).toUInt()

public actual fun rasHangUpA(param0: Hrasconn): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasHangUpA((param0?.value ?: 0L)).toUInt()

public actual fun rasHangUpW(param0: Hrasconn): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasHangUpW((param0?.value ?: 0L)).toUInt()

public actual fun rasInvokeEapUI(param0: Hrasconn, param1: UInt, param2: COpaquePointer?, param3: Hwnd): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasInvokeEapUI((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L), (param3?.value ?: 0L)).toUInt()

public actual fun rasPhonebookDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpinfo: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasPhonebookDlgA((lpszphonebook?.value ?: 0L), (lpszentry?.value ?: 0L), (lpinfo?.value ?: 0L))

public actual fun rasPhonebookDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpinfo: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasPhonebookDlgW((lpszphonebook?.value ?: 0L), (lpszentry?.value ?: 0L), (lpinfo?.value ?: 0L))

public actual fun rasRenameEntryA(param0: Pcstr, param1: Pcstr, param2: Pcstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasRenameEntryA((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).toUInt()

public actual fun rasRenameEntryW(param0: Pcwstr, param1: Pcwstr, param2: Pcwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasRenameEntryW((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).toUInt()

public actual fun rasSetAutodialAddressA(param0: Pcstr, param1: UInt, param2: COpaquePointer?, param3: UInt, param4: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasSetAutodialAddressA((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L), param3.toInt(), param4.toInt()).toUInt()

public actual fun rasSetAutodialAddressW(param0: Pcwstr, param1: UInt, param2: COpaquePointer?, param3: UInt, param4: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasSetAutodialAddressW((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L), param3.toInt(), param4.toInt()).toUInt()

public actual fun rasSetAutodialEnableA(param0: UInt, param1: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasSetAutodialEnableA(param0.toInt(), param1).toUInt()

public actual fun rasSetAutodialEnableW(param0: UInt, param1: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasSetAutodialEnableW(param0.toInt(), param1).toUInt()

public actual fun rasSetAutodialParamA(param0: UInt, param1: COpaquePointer?, param2: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasSetAutodialParamA(param0.toInt(), (param1?.value ?: 0L), param2.toInt()).toUInt()

public actual fun rasSetAutodialParamW(param0: UInt, param1: COpaquePointer?, param2: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasSetAutodialParamW(param0.toInt(), (param1?.value ?: 0L), param2.toInt()).toUInt()

public actual fun rasSetCredentialsA(param0: Pcstr, param1: Pcstr, param2: COpaquePointer?, param3: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasSetCredentialsA((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L), param3).toUInt()

public actual fun rasSetCredentialsW(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?, param3: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasSetCredentialsW((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L), param3).toUInt()

public actual fun rasSetCustomAuthDataA(pszphonebook: Pcstr, pszentry: Pcstr, pbcustomauthdata: COpaquePointer?, dwsizeofcustomauthdata: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasSetCustomAuthDataA((pszphonebook?.value ?: 0L), (pszentry?.value ?: 0L), (pbcustomauthdata?.value ?: 0L), dwsizeofcustomauthdata.toInt()).toUInt()

public actual fun rasSetCustomAuthDataW(pszphonebook: Pcwstr, pszentry: Pcwstr, pbcustomauthdata: COpaquePointer?, dwsizeofcustomauthdata: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasSetCustomAuthDataW((pszphonebook?.value ?: 0L), (pszentry?.value ?: 0L), (pbcustomauthdata?.value ?: 0L), dwsizeofcustomauthdata.toInt()).toUInt()

public actual fun rasSetEapUserDataA(htoken: Handle, pszphonebook: Pcstr, pszentry: Pcstr, pbeapdata: COpaquePointer?, dwsizeofeapdata: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasSetEapUserDataA((htoken?.value ?: 0L), (pszphonebook?.value ?: 0L), (pszentry?.value ?: 0L), (pbeapdata?.value ?: 0L), dwsizeofeapdata.toInt()).toUInt()

public actual fun rasSetEapUserDataW(htoken: Handle, pszphonebook: Pcwstr, pszentry: Pcwstr, pbeapdata: COpaquePointer?, dwsizeofeapdata: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasSetEapUserDataW((htoken?.value ?: 0L), (pszphonebook?.value ?: 0L), (pszentry?.value ?: 0L), (pbeapdata?.value ?: 0L), dwsizeofeapdata.toInt()).toUInt()

public actual fun rasSetEntryDialParamsA(param0: Pcstr, param1: COpaquePointer?, param2: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasSetEntryDialParamsA((param0?.value ?: 0L), (param1?.value ?: 0L), param2).toUInt()

public actual fun rasSetEntryDialParamsW(param0: Pcwstr, param1: COpaquePointer?, param2: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasSetEntryDialParamsW((param0?.value ?: 0L), (param1?.value ?: 0L), param2).toUInt()

public actual fun rasSetEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?, param5: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasSetEntryPropertiesA((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L), param3.toInt(), (param4?.value ?: 0L), param5.toInt()).toUInt()

public actual fun rasSetEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?, param5: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasSetEntryPropertiesW((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L), param3.toInt(), (param4?.value ?: 0L), param5.toInt()).toUInt()

public actual fun rasSetSubEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: UInt, param3: COpaquePointer?, param4: UInt, param5: COpaquePointer?, param6: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasSetSubEntryPropertiesA((param0?.value ?: 0L), (param1?.value ?: 0L), param2.toInt(), (param3?.value ?: 0L), param4.toInt(), (param5?.value ?: 0L), param6.toInt()).toUInt()

public actual fun rasSetSubEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: UInt, param3: COpaquePointer?, param4: UInt, param5: COpaquePointer?, param6: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasSetSubEntryPropertiesW((param0?.value ?: 0L), (param1?.value ?: 0L), param2.toInt(), (param3?.value ?: 0L), param4.toInt(), (param5?.value ?: 0L), param6.toInt()).toUInt()

public actual fun rasUpdateConnection(hrasconn: Hrasconn, lprasupdateconn: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasUpdateConnection((hrasconn?.value ?: 0L), (lprasupdateconn?.value ?: 0L)).toUInt()

public actual fun rasValidateEntryNameA(param0: Pcstr, param1: Pcstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasValidateEntryNameA((param0?.value ?: 0L), (param1?.value ?: 0L)).toUInt()

public actual fun rasValidateEntryNameW(param0: Pcwstr, param1: Pcwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rasValidateEntryNameW((param0?.value ?: 0L), (param1?.value ?: 0L)).toUInt()

public actual fun rtmAddNextHop(rtmreghandle: Long, nexthopinfo: COpaquePointer?, nexthophandle: COpaquePointer?, changeflags: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmAddNextHop(rtmreghandle, (nexthopinfo?.value ?: 0L), (nexthophandle?.value ?: 0L), (changeflags?.value ?: 0L)).toUInt()

public actual fun rtmAddRouteToDest(rtmreghandle: Long, routehandle: COpaquePointer?, destaddress: COpaquePointer?, routeinfo: COpaquePointer?, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmAddRouteToDest(rtmreghandle, (routehandle?.value ?: 0L), (destaddress?.value ?: 0L), (routeinfo?.value ?: 0L), timetolive.toInt(), routelisthandle, notifytype.toInt(), notifyhandle, (changeflags?.value ?: 0L)).toUInt()

public actual fun rtmBlockMethods(rtmreghandle: Long, targethandle: Handle, targettype: UByte, blockingflag: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmBlockMethods(rtmreghandle, (targethandle?.value ?: 0L), targettype.toByte(), blockingflag.toInt()).toUInt()

public actual fun rtmConvertIpv6AddressAndLengthToNetAddress(pnetaddress: COpaquePointer?, address: In6Addr, dwlength: UInt, dwaddresssize: UInt): UInt =
    0u

public actual fun rtmConvertNetAddressToIpv6AddressAndLength(pnetaddress: COpaquePointer?, paddress: COpaquePointer?, plength: COpaquePointer?, dwaddresssize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmConvertNetAddressToIpv6AddressAndLength((pnetaddress?.value ?: 0L), (paddress?.value ?: 0L), (plength?.value ?: 0L), dwaddresssize.toInt()).toUInt()

public actual fun rtmCreateDestEnum(rtmreghandle: Long, targetviews: UInt, enumflags: UInt, netaddress: COpaquePointer?, protocolid: UInt, rtmenumhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmCreateDestEnum(rtmreghandle, targetviews.toInt(), enumflags.toInt(), (netaddress?.value ?: 0L), protocolid.toInt(), (rtmenumhandle?.value ?: 0L)).toUInt()

public actual fun rtmCreateNextHopEnum(rtmreghandle: Long, enumflags: UInt, netaddress: COpaquePointer?, rtmenumhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmCreateNextHopEnum(rtmreghandle, enumflags.toInt(), (netaddress?.value ?: 0L), (rtmenumhandle?.value ?: 0L)).toUInt()

public actual fun rtmCreateRouteEnum(rtmreghandle: Long, desthandle: Long, targetviews: UInt, enumflags: UInt, startdest: COpaquePointer?, matchingflags: UInt, criteriaroute: COpaquePointer?, criteriainterface: UInt, rtmenumhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmCreateRouteEnum(rtmreghandle, desthandle, targetviews.toInt(), enumflags.toInt(), (startdest?.value ?: 0L), matchingflags.toInt(), (criteriaroute?.value ?: 0L), criteriainterface.toInt(), (rtmenumhandle?.value ?: 0L)).toUInt()

public actual fun rtmCreateRouteList(rtmreghandle: Long, routelisthandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmCreateRouteList(rtmreghandle, (routelisthandle?.value ?: 0L)).toUInt()

public actual fun rtmCreateRouteListEnum(rtmreghandle: Long, routelisthandle: Long, rtmenumhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmCreateRouteListEnum(rtmreghandle, routelisthandle, (rtmenumhandle?.value ?: 0L)).toUInt()

public actual fun rtmDeleteEnumHandle(rtmreghandle: Long, enumhandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmDeleteEnumHandle(rtmreghandle, enumhandle).toUInt()

public actual fun rtmDeleteNextHop(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmDeleteNextHop(rtmreghandle, nexthophandle, (nexthopinfo?.value ?: 0L)).toUInt()

public actual fun rtmDeleteRouteList(rtmreghandle: Long, routelisthandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmDeleteRouteList(rtmreghandle, routelisthandle).toUInt()

public actual fun rtmDeleteRouteToDest(rtmreghandle: Long, routehandle: Long, changeflags: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmDeleteRouteToDest(rtmreghandle, routehandle, (changeflags?.value ?: 0L)).toUInt()

public actual fun rtmDeregisterEntity(rtmreghandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmDeregisterEntity(rtmreghandle).toUInt()

public actual fun rtmDeregisterFromChangeNotification(rtmreghandle: Long, notifyhandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmDeregisterFromChangeNotification(rtmreghandle, notifyhandle).toUInt()

public actual fun rtmFindNextHop(rtmreghandle: Long, nexthopinfo: COpaquePointer?, nexthophandle: COpaquePointer?, nexthoppointer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmFindNextHop(rtmreghandle, (nexthopinfo?.value ?: 0L), (nexthophandle?.value ?: 0L), (nexthoppointer?.value ?: 0L)).toUInt()

public actual fun rtmGetChangeStatus(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, changestatus: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmGetChangeStatus(rtmreghandle, notifyhandle, desthandle, (changestatus?.value ?: 0L)).toUInt()

public actual fun rtmGetChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: COpaquePointer?, changeddests: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmGetChangedDests(rtmreghandle, notifyhandle, (numdests?.value ?: 0L), (changeddests?.value ?: 0L)).toUInt()

public actual fun rtmGetDestInfo(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmGetDestInfo(rtmreghandle, desthandle, protocolid.toInt(), targetviews.toInt(), (destinfo?.value ?: 0L)).toUInt()

public actual fun rtmGetEntityInfo(rtmreghandle: Long, entityhandle: Long, entityinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmGetEntityInfo(rtmreghandle, entityhandle, (entityinfo?.value ?: 0L)).toUInt()

public actual fun rtmGetEntityMethods(rtmreghandle: Long, entityhandle: Long, nummethods: COpaquePointer?, exptmethods: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmGetEntityMethods(rtmreghandle, entityhandle, (nummethods?.value ?: 0L), (exptmethods?.value ?: 0L)).toUInt()

public actual fun rtmGetEnumDests(rtmreghandle: Long, enumhandle: Long, numdests: COpaquePointer?, destinfos: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmGetEnumDests(rtmreghandle, enumhandle, (numdests?.value ?: 0L), (destinfos?.value ?: 0L)).toUInt()

public actual fun rtmGetEnumNextHops(rtmreghandle: Long, enumhandle: Long, numnexthops: COpaquePointer?, nexthophandles: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmGetEnumNextHops(rtmreghandle, enumhandle, (numnexthops?.value ?: 0L), (nexthophandles?.value ?: 0L)).toUInt()

public actual fun rtmGetEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: COpaquePointer?, routehandles: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmGetEnumRoutes(rtmreghandle, enumhandle, (numroutes?.value ?: 0L), (routehandles?.value ?: 0L)).toUInt()

public actual fun rtmGetExactMatchDestination(rtmreghandle: Long, destaddress: COpaquePointer?, protocolid: UInt, targetviews: UInt, destinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmGetExactMatchDestination(rtmreghandle, (destaddress?.value ?: 0L), protocolid.toInt(), targetviews.toInt(), (destinfo?.value ?: 0L)).toUInt()

public actual fun rtmGetExactMatchRoute(rtmreghandle: Long, destaddress: COpaquePointer?, matchingflags: UInt, routeinfo: COpaquePointer?, interfaceindex: UInt, targetviews: UInt, routehandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmGetExactMatchRoute(rtmreghandle, (destaddress?.value ?: 0L), matchingflags.toInt(), (routeinfo?.value ?: 0L), interfaceindex.toInt(), targetviews.toInt(), (routehandle?.value ?: 0L)).toUInt()

public actual fun rtmGetLessSpecificDestination(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmGetLessSpecificDestination(rtmreghandle, desthandle, protocolid.toInt(), targetviews.toInt(), (destinfo?.value ?: 0L)).toUInt()

public actual fun rtmGetListEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: COpaquePointer?, routehandles: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmGetListEnumRoutes(rtmreghandle, enumhandle, (numroutes?.value ?: 0L), (routehandles?.value ?: 0L)).toUInt()

public actual fun rtmGetMostSpecificDestination(rtmreghandle: Long, destaddress: COpaquePointer?, protocolid: UInt, targetviews: UInt, destinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmGetMostSpecificDestination(rtmreghandle, (destaddress?.value ?: 0L), protocolid.toInt(), targetviews.toInt(), (destinfo?.value ?: 0L)).toUInt()

public actual fun rtmGetNextHopInfo(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmGetNextHopInfo(rtmreghandle, nexthophandle, (nexthopinfo?.value ?: 0L)).toUInt()

public actual fun rtmGetNextHopPointer(rtmreghandle: Long, nexthophandle: Long, nexthoppointer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmGetNextHopPointer(rtmreghandle, nexthophandle, (nexthoppointer?.value ?: 0L)).toUInt()

public actual fun rtmGetOpaqueInformationPointer(rtmreghandle: Long, desthandle: Long, opaqueinfopointer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmGetOpaqueInformationPointer(rtmreghandle, desthandle, (opaqueinfopointer?.value ?: 0L)).toUInt()

public actual fun rtmGetRegisteredEntities(rtmreghandle: Long, numentities: COpaquePointer?, entityhandles: COpaquePointer?, entityinfos: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmGetRegisteredEntities(rtmreghandle, (numentities?.value ?: 0L), (entityhandles?.value ?: 0L), (entityinfos?.value ?: 0L)).toUInt()

public actual fun rtmGetRouteInfo(rtmreghandle: Long, routehandle: Long, routeinfo: COpaquePointer?, destaddress: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmGetRouteInfo(rtmreghandle, routehandle, (routeinfo?.value ?: 0L), (destaddress?.value ?: 0L)).toUInt()

public actual fun rtmGetRoutePointer(rtmreghandle: Long, routehandle: Long, routepointer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmGetRoutePointer(rtmreghandle, routehandle, (routepointer?.value ?: 0L)).toUInt()

public actual fun rtmHoldDestination(rtmreghandle: Long, desthandle: Long, targetviews: UInt, holdtime: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmHoldDestination(rtmreghandle, desthandle, targetviews.toInt(), holdtime.toInt()).toUInt()

public actual fun rtmIgnoreChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmIgnoreChangedDests(rtmreghandle, notifyhandle, numdests.toInt(), (changeddests?.value ?: 0L)).toUInt()

public actual fun rtmInsertInRouteList(rtmreghandle: Long, routelisthandle: Long, numroutes: UInt, routehandles: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmInsertInRouteList(rtmreghandle, routelisthandle, numroutes.toInt(), (routehandles?.value ?: 0L)).toUInt()

public actual fun rtmInvokeMethod(rtmreghandle: Long, entityhandle: Long, input: COpaquePointer?, outputsize: COpaquePointer?, output: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmInvokeMethod(rtmreghandle, entityhandle, (input?.value ?: 0L), (outputsize?.value ?: 0L), (output?.value ?: 0L)).toUInt()

public actual fun rtmIsBestRoute(rtmreghandle: Long, routehandle: Long, bestinviews: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmIsBestRoute(rtmreghandle, routehandle, (bestinviews?.value ?: 0L)).toUInt()

public actual fun rtmIsMarkedForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, destmarked: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmIsMarkedForChangeNotification(rtmreghandle, notifyhandle, desthandle, (destmarked?.value ?: 0L)).toUInt()

public actual fun rtmLockDestination(rtmreghandle: Long, desthandle: Long, exclusive: Bool, lockdest: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmLockDestination(rtmreghandle, desthandle, exclusive, lockdest).toUInt()

public actual fun rtmLockNextHop(rtmreghandle: Long, nexthophandle: Long, exclusive: Bool, locknexthop: Bool, nexthoppointer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmLockNextHop(rtmreghandle, nexthophandle, exclusive, locknexthop, (nexthoppointer?.value ?: 0L)).toUInt()

public actual fun rtmLockRoute(rtmreghandle: Long, routehandle: Long, exclusive: Bool, lockroute: Bool, routepointer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmLockRoute(rtmreghandle, routehandle, exclusive, lockroute, (routepointer?.value ?: 0L)).toUInt()

public actual fun rtmMarkDestForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, markdest: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmMarkDestForChangeNotification(rtmreghandle, notifyhandle, desthandle, markdest).toUInt()

public actual fun rtmReferenceHandles(rtmreghandle: Long, numhandles: UInt, rtmhandles: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmReferenceHandles(rtmreghandle, numhandles.toInt(), (rtmhandles?.value ?: 0L)).toUInt()

public actual fun rtmRegisterEntity(rtmentityinfo: COpaquePointer?, exportmethods: COpaquePointer?, eventcallback: RtmEventCallback, reserveopaquepointer: Bool, rtmregprofile: COpaquePointer?, rtmreghandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmRegisterEntity((rtmentityinfo?.value ?: 0L), (exportmethods?.value ?: 0L), 0L, reserveopaquepointer, (rtmregprofile?.value ?: 0L), (rtmreghandle?.value ?: 0L)).toUInt()

public actual fun rtmRegisterForChangeNotification(rtmreghandle: Long, targetviews: UInt, notifyflags: UInt, notifycontext: COpaquePointer?, notifyhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmRegisterForChangeNotification(rtmreghandle, targetviews.toInt(), notifyflags.toInt(), (notifycontext?.value ?: 0L), (notifyhandle?.value ?: 0L)).toUInt()

public actual fun rtmReleaseChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmReleaseChangedDests(rtmreghandle, notifyhandle, numdests.toInt(), (changeddests?.value ?: 0L)).toUInt()

public actual fun rtmReleaseDestInfo(rtmreghandle: Long, destinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmReleaseDestInfo(rtmreghandle, (destinfo?.value ?: 0L)).toUInt()

public actual fun rtmReleaseDests(rtmreghandle: Long, numdests: UInt, destinfos: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmReleaseDests(rtmreghandle, numdests.toInt(), (destinfos?.value ?: 0L)).toUInt()

public actual fun rtmReleaseEntities(rtmreghandle: Long, numentities: UInt, entityhandles: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmReleaseEntities(rtmreghandle, numentities.toInt(), (entityhandles?.value ?: 0L)).toUInt()

public actual fun rtmReleaseEntityInfo(rtmreghandle: Long, entityinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmReleaseEntityInfo(rtmreghandle, (entityinfo?.value ?: 0L)).toUInt()

public actual fun rtmReleaseNextHopInfo(rtmreghandle: Long, nexthopinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmReleaseNextHopInfo(rtmreghandle, (nexthopinfo?.value ?: 0L)).toUInt()

public actual fun rtmReleaseNextHops(rtmreghandle: Long, numnexthops: UInt, nexthophandles: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmReleaseNextHops(rtmreghandle, numnexthops.toInt(), (nexthophandles?.value ?: 0L)).toUInt()

public actual fun rtmReleaseRouteInfo(rtmreghandle: Long, routeinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmReleaseRouteInfo(rtmreghandle, (routeinfo?.value ?: 0L)).toUInt()

public actual fun rtmReleaseRoutes(rtmreghandle: Long, numroutes: UInt, routehandles: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmReleaseRoutes(rtmreghandle, numroutes.toInt(), (routehandles?.value ?: 0L)).toUInt()

public actual fun rtmUpdateAndUnlockRoute(rtmreghandle: Long, routehandle: Long, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_rtmUpdateAndUnlockRoute(rtmreghandle, routehandle, timetolive.toInt(), routelisthandle, notifytype.toInt(), notifyhandle, (changeflags?.value ?: 0L)).toUInt()
