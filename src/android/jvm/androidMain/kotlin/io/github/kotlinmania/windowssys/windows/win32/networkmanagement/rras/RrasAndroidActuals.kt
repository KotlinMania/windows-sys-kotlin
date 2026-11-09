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

private object WindowsWin32NetworkmanagementRrasJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MgmAddGroupMembershipEntry(hprotocol: Long, dwsourceaddr: Int, dwsourcemask: Int, dwgroupaddr: Int, dwgroupmask: Int, dwifindex: Int, dwifnexthopipaddr: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MgmDeRegisterMProtocol(hprotocol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MgmDeleteGroupMembershipEntry(hprotocol: Long, dwsourceaddr: Int, dwsourcemask: Int, dwgroupaddr: Int, dwgroupmask: Int, dwifindex: Int, dwifnexthopipaddr: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MgmGetFirstMfe(pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MgmGetFirstMfeStats(pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MgmGetMfe(pimm: Long, pdwbuffersize: Long, pbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MgmGetMfeStats(pimm: Long, pdwbuffersize: Long, pbbuffer: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MgmGetNextMfe(pimmstart: Long, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MgmGetNextMfeStats(pimmstart: Long, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MgmGetProtocolOnInterface(dwifindex: Int, dwifnexthopaddr: Int, pdwifprotocolid: Long, pdwifcomponentid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MgmGroupEnumerationEnd(henum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MgmGroupEnumerationGetNext(henum: Long, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MgmGroupEnumerationStart(hprotocol: Long, metenumtype: Int, phenumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MgmRegisterMProtocol(prpiinfo: Long, dwprotocolid: Int, dwcomponentid: Int, phprotocol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MgmReleaseInterfaceOwnership(hprotocol: Long, dwifindex: Int, dwifnexthopaddr: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MgmTakeInterfaceOwnership(hprotocol: Long, dwifindex: Int, dwifnexthopaddr: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminBufferFree(pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionClearStats(hrasserver: Long, hrasconnection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionEnum(hrasserver: Long, dwlevel: Int, lplpbbuffer: Long, dwprefmaxlen: Int, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionEnumEx(hrasserver: Long, pobjectheader: Long, dwpreferedmaxlen: Int, lpdwentriesread: Long, lpdwtotalentries: Long, pprasconn: Long, lpdwresumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionGetInfo(hrasserver: Long, dwlevel: Int, hrasconnection: Long, lplpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionGetInfoEx(hrasserver: Long, hrasconnection: Long, prasconnection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionRemoveQuarantine(hrasserver: Long, hrasconnection: Long, fisipaddress: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminDeregisterConnectionNotification(hmprserver: Long, heventnotification: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminDeviceEnum(hmprserver: Long, dwlevel: Int, lplpbbuffer: Long, lpdwtotalentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminEstablishDomainRasServer(pszdomain: Long, pszmachine: Long, benable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminGetErrorString(dwerror: Int, lplpwserrorstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminGetPDCServer(lpszdomain: Long, lpszserver: Long, lpszpdcserver: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceConnect(hmprserver: Long, hinterface: Long, hevent: Long, fsynchronous: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceCreate(hmprserver: Long, dwlevel: Int, lpbbuffer: Long, phinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDelete(hmprserver: Long, hinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDeviceGetInfo(hmprserver: Long, hinterface: Long, dwindex: Int, dwlevel: Int, lplpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDeviceSetInfo(hmprserver: Long, hinterface: Long, dwindex: Int, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDisconnect(hmprserver: Long, hinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceEnum(hmprserver: Long, dwlevel: Int, lplpbbuffer: Long, dwprefmaxlen: Int, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetCredentials(lpwsserver: Long, lpwsinterfacename: Long, lpwsusername: Long, lpwspassword: Long, lpwsdomainname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetCredentialsEx(hmprserver: Long, hinterface: Long, dwlevel: Int, lplpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetCustomInfoEx(hmprserver: Long, hinterface: Long, pcustominfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetHandle(hmprserver: Long, lpwsinterfacename: Long, phinterface: Long, fincludeclientinterfaces: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetInfo(hmprserver: Long, hinterface: Long, dwlevel: Int, lplpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceQueryUpdateResult(hmprserver: Long, hinterface: Long, dwprotocolid: Int, lpdwupdateresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetCredentials(lpwsserver: Long, lpwsinterfacename: Long, lpwsusername: Long, lpwsdomainname: Long, lpwspassword: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetCredentialsEx(hmprserver: Long, hinterface: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetCustomInfoEx(hmprserver: Long, hinterface: Long, pcustominfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetInfo(hmprserver: Long, hinterface: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportAdd(hmprserver: Long, hinterface: Long, dwtransportid: Int, pinterfaceinfo: Long, dwinterfaceinfosize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportGetInfo(hmprserver: Long, hinterface: Long, dwtransportid: Int, ppinterfaceinfo: Long, lpdwinterfaceinfosize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportRemove(hmprserver: Long, hinterface: Long, dwtransportid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportSetInfo(hmprserver: Long, hinterface: Long, dwtransportid: Int, pinterfaceinfo: Long, dwinterfaceinfosize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceUpdatePhonebookInfo(hmprserver: Long, hinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceUpdateRoutes(hmprserver: Long, hinterface: Long, dwprotocolid: Int, hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminIsDomainRasServer(pszdomain: Long, pszmachine: Long, pbisrasserver: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminIsServiceInitialized(lpwsservername: Long, fisserviceinitialized: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminIsServiceRunning(lpwsservername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminMIBBufferFree(pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryCreate(hmibserver: Long, dwpid: Int, dwroutingpid: Int, lpentry: Long, dwentrysize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryDelete(hmibserver: Long, dwprotocolid: Int, dwroutingpid: Int, lpentry: Long, dwentrysize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryGet(hmibserver: Long, dwprotocolid: Int, dwroutingpid: Int, lpinentry: Long, dwinentrysize: Int, lplpoutentry: Long, lpoutentrysize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryGetFirst(hmibserver: Long, dwprotocolid: Int, dwroutingpid: Int, lpinentry: Long, dwinentrysize: Int, lplpoutentry: Long, lpoutentrysize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryGetNext(hmibserver: Long, dwprotocolid: Int, dwroutingpid: Int, lpinentry: Long, dwinentrysize: Int, lplpoutentry: Long, lpoutentrysize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntrySet(hmibserver: Long, dwprotocolid: Int, dwroutingpid: Int, lpentry: Long, dwentrysize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminMIBServerConnect(lpwsservername: Long, phmibserver: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminMIBServerDisconnect(hmibserver: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminPortClearStats(hrasserver: Long, hport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminPortDisconnect(hrasserver: Long, hport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminPortEnum(hrasserver: Long, dwlevel: Int, hrasconnection: Long, lplpbbuffer: Long, dwprefmaxlen: Int, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminPortGetInfo(hrasserver: Long, dwlevel: Int, hport: Long, lplpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminPortReset(hrasserver: Long, hport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminRegisterConnectionNotification(hmprserver: Long, heventnotification: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminSendUserMessage(hmprserver: Long, hconnection: Long, lpwszmessage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminServerConnect(lpwsservername: Long, phmprserver: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminServerDisconnect(hmprserver: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminServerGetCredentials(hmprserver: Long, dwlevel: Int, lplpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminServerGetInfo(hmprserver: Long, dwlevel: Int, lplpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminServerGetInfoEx(hmprserver: Long, pserverinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminServerSetCredentials(hmprserver: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminServerSetInfo(hmprserver: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminServerSetInfoEx(hmprserver: Long, pserverinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminTransportCreate(hmprserver: Long, dwtransportid: Int, lpwstransportname: Long, pglobalinfo: Long, dwglobalinfosize: Int, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: Int, lpwsdllpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminTransportGetInfo(hmprserver: Long, dwtransportid: Int, ppglobalinfo: Long, lpdwglobalinfosize: Long, ppclientinterfaceinfo: Long, lpdwclientinterfaceinfosize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminTransportSetInfo(hmprserver: Long, dwtransportid: Int, pglobalinfo: Long, dwglobalinfosize: Int, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminUpdateConnection(hrasserver: Long, hrasconnection: Long, prasupdateconnection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminUserGetInfo(lpszserver: Long, lpszuser: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprAdminUserSetInfo(lpszserver: Long, lpszuser: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigBufferFree(pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigFilterGetInfo(hmprconfig: Long, dwlevel: Int, dwtransportid: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigFilterSetInfo(hmprconfig: Long, dwlevel: Int, dwtransportid: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigGetFriendlyName(hmprconfig: Long, pszguidname: Long, pszbuffer: Long, dwbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigGetGuidName(hmprconfig: Long, pszfriendlyname: Long, pszbuffer: Long, dwbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceCreate(hmprconfig: Long, dwlevel: Int, lpbbuffer: Long, phrouterinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceDelete(hmprconfig: Long, hrouterinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceEnum(hmprconfig: Long, dwlevel: Int, lplpbuffer: Long, dwprefmaxlen: Int, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceGetCustomInfoEx(hmprconfig: Long, hrouterinterface: Long, pcustominfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceGetHandle(hmprconfig: Long, lpwsinterfacename: Long, phrouterinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceGetInfo(hmprconfig: Long, hrouterinterface: Long, dwlevel: Int, lplpbuffer: Long, lpdwbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceSetCustomInfoEx(hmprconfig: Long, hrouterinterface: Long, pcustominfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceSetInfo(hmprconfig: Long, hrouterinterface: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportAdd(hmprconfig: Long, hrouterinterface: Long, dwtransportid: Int, lpwstransportname: Long, pinterfaceinfo: Long, dwinterfaceinfosize: Int, phrouteriftransport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportEnum(hmprconfig: Long, hrouterinterface: Long, dwlevel: Int, lplpbuffer: Long, dwprefmaxlen: Int, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportGetHandle(hmprconfig: Long, hrouterinterface: Long, dwtransportid: Int, phrouteriftransport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportGetInfo(hmprconfig: Long, hrouterinterface: Long, hrouteriftransport: Long, ppinterfaceinfo: Long, lpdwinterfaceinfosize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportRemove(hmprconfig: Long, hrouterinterface: Long, hrouteriftransport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportSetInfo(hmprconfig: Long, hrouterinterface: Long, hrouteriftransport: Long, pinterfaceinfo: Long, dwinterfaceinfosize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigServerBackup(hmprconfig: Long, lpwspath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigServerConnect(lpwsservername: Long, phmprconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigServerDisconnect(hmprconfig: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigServerGetInfo(hmprconfig: Long, dwlevel: Int, lplpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigServerGetInfoEx(hmprconfig: Long, pserverinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigServerInstall(dwlevel: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigServerRefresh(hmprconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigServerRestore(hmprconfig: Long, lpwspath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigServerSetInfo(hmprserver: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigServerSetInfoEx(hmprconfig: Long, psetserverconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigTransportCreate(hmprconfig: Long, dwtransportid: Int, lpwstransportname: Long, pglobalinfo: Long, dwglobalinfosize: Int, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: Int, lpwsdllpath: Long, phroutertransport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigTransportDelete(hmprconfig: Long, hroutertransport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigTransportEnum(hmprconfig: Long, dwlevel: Int, lplpbuffer: Long, dwprefmaxlen: Int, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigTransportGetHandle(hmprconfig: Long, dwtransportid: Int, phroutertransport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigTransportGetInfo(hmprconfig: Long, hroutertransport: Long, ppglobalinfo: Long, lpdwglobalinfosize: Long, ppclientinterfaceinfo: Long, lpdwclientinterfaceinfosize: Long, lplpwsdllpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprConfigTransportSetInfo(hmprconfig: Long, hroutertransport: Long, pglobalinfo: Long, dwglobalinfosize: Int, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: Int, lpwsdllpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprInfoBlockAdd(lpheader: Long, dwinfotype: Int, dwitemsize: Int, dwitemcount: Int, lpitemdata: Long, lplpnewheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprInfoBlockFind(lpheader: Long, dwinfotype: Int, lpdwitemsize: Long, lpdwitemcount: Long, lplpitemdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprInfoBlockQuerySize(lpheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprInfoBlockRemove(lpheader: Long, dwinfotype: Int, lplpnewheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprInfoBlockSet(lpheader: Long, dwinfotype: Int, dwitemsize: Int, dwitemcount: Int, lpitemdata: Long, lplpnewheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprInfoCreate(dwversion: Int, lplpnewheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprInfoDelete(lpheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprInfoDuplicate(lpheader: Long, lplpnewheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_MprInfoRemoveAll(lpheader: Long, lplpnewheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasClearConnectionStatistics(hrasconn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasClearLinkStatistics(hrasconn: Long, dwsubentry: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasConnectionNotificationA(param0: Long, param1: Long, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasConnectionNotificationW(param0: Long, param1: Long, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasCreatePhonebookEntryA(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasCreatePhonebookEntryW(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasDeleteEntryA(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasDeleteEntryW(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasDeleteSubEntryA(pszphonebook: Long, pszentry: Long, dwsubentryid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasDeleteSubEntryW(pszphonebook: Long, pszentry: Long, dwsubentryid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasDialA(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long, param5: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasDialDlgA(lpszphonebook: Long, lpszentry: Long, lpszphonenumber: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasDialDlgW(lpszphonebook: Long, lpszentry: Long, lpszphonenumber: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasDialW(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long, param5: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasEditPhonebookEntryA(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasEditPhonebookEntryW(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasEntryDlgA(lpszphonebook: Long, lpszentry: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasEntryDlgW(lpszphonebook: Long, lpszentry: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasEnumAutodialAddressesA(lpprasautodialaddresses: Long, lpdwcbrasautodialaddresses: Long, lpdwcrasautodialaddresses: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasEnumAutodialAddressesW(lpprasautodialaddresses: Long, lpdwcbrasautodialaddresses: Long, lpdwcrasautodialaddresses: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasEnumConnectionsA(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasEnumConnectionsW(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasEnumDevicesA(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasEnumDevicesW(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasEnumEntriesA(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasEnumEntriesW(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasFreeEapUserIdentityA(praseapuseridentity: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasFreeEapUserIdentityW(praseapuseridentity: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetAutodialAddressA(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetAutodialAddressW(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetAutodialEnableA(param0: Int, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetAutodialEnableW(param0: Int, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetAutodialParamA(param0: Int, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetAutodialParamW(param0: Int, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetConnectStatusA(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetConnectStatusW(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetConnectionStatistics(hrasconn: Long, lpstatistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetCountryInfoA(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetCountryInfoW(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetCredentialsA(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetCredentialsW(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetCustomAuthDataA(pszphonebook: Long, pszentry: Long, pbcustomauthdata: Long, pdwsizeofcustomauthdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetCustomAuthDataW(pszphonebook: Long, pszentry: Long, pbcustomauthdata: Long, pdwsizeofcustomauthdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetEapUserDataA(htoken: Long, pszphonebook: Long, pszentry: Long, pbeapdata: Long, pdwsizeofeapdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetEapUserDataW(htoken: Long, pszphonebook: Long, pszentry: Long, pbeapdata: Long, pdwsizeofeapdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetEapUserIdentityA(pszphonebook: Long, pszentry: Long, dwflags: Int, hwnd: Long, ppraseapuseridentity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetEapUserIdentityW(pszphonebook: Long, pszentry: Long, dwflags: Int, hwnd: Long, ppraseapuseridentity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetEntryDialParamsA(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetEntryDialParamsW(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetEntryPropertiesA(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long, param5: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetEntryPropertiesW(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long, param5: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetErrorStringA(resourceid: Int, lpszstring: Long, inbufsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetErrorStringW(resourceid: Int, lpszstring: Long, inbufsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetLinkStatistics(hrasconn: Long, dwsubentry: Int, lpstatistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetPCscf(lpszpcscf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetProjectionInfoA(param0: Long, param1: Int, param2: Long, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetProjectionInfoEx(hrasconn: Long, prasprojection: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetProjectionInfoW(param0: Long, param1: Int, param2: Long, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryHandleA(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryHandleW(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryPropertiesA(param0: Long, param1: Long, param2: Int, param3: Long, param4: Long, param5: Long, param6: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryPropertiesW(param0: Long, param1: Long, param2: Int, param3: Long, param4: Long, param5: Long, param6: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasHangUpA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasHangUpW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasInvokeEapUI(param0: Long, param1: Int, param2: Long, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasPhonebookDlgA(lpszphonebook: Long, lpszentry: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasPhonebookDlgW(lpszphonebook: Long, lpszentry: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasRenameEntryA(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasRenameEntryW(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasSetAutodialAddressA(param0: Long, param1: Int, param2: Long, param3: Int, param4: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasSetAutodialAddressW(param0: Long, param1: Int, param2: Long, param3: Int, param4: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasSetAutodialEnableA(param0: Int, param1: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasSetAutodialEnableW(param0: Int, param1: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasSetAutodialParamA(param0: Int, param1: Long, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasSetAutodialParamW(param0: Int, param1: Long, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasSetCredentialsA(param0: Long, param1: Long, param2: Long, param3: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasSetCredentialsW(param0: Long, param1: Long, param2: Long, param3: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasSetCustomAuthDataA(pszphonebook: Long, pszentry: Long, pbcustomauthdata: Long, dwsizeofcustomauthdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasSetCustomAuthDataW(pszphonebook: Long, pszentry: Long, pbcustomauthdata: Long, dwsizeofcustomauthdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasSetEapUserDataA(htoken: Long, pszphonebook: Long, pszentry: Long, pbeapdata: Long, dwsizeofeapdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasSetEapUserDataW(htoken: Long, pszphonebook: Long, pszentry: Long, pbeapdata: Long, dwsizeofeapdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasSetEntryDialParamsA(param0: Long, param1: Long, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasSetEntryDialParamsW(param0: Long, param1: Long, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasSetEntryPropertiesA(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long, param5: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasSetEntryPropertiesW(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long, param5: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasSetSubEntryPropertiesA(param0: Long, param1: Long, param2: Int, param3: Long, param4: Int, param5: Long, param6: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasSetSubEntryPropertiesW(param0: Long, param1: Long, param2: Int, param3: Long, param4: Int, param5: Long, param6: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasUpdateConnection(hrasconn: Long, lprasupdateconn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasValidateEntryNameA(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RasValidateEntryNameW(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmAddNextHop(rtmreghandle: Long, nexthopinfo: Long, nexthophandle: Long, changeflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmAddRouteToDest(rtmreghandle: Long, routehandle: Long, destaddress: Long, routeinfo: Long, timetolive: Int, routelisthandle: Long, notifytype: Int, notifyhandle: Long, changeflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmBlockMethods(rtmreghandle: Long, targethandle: Long, targettype: Byte, blockingflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmConvertNetAddressToIpv6AddressAndLength(pnetaddress: Long, paddress: Long, plength: Long, dwaddresssize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmCreateDestEnum(rtmreghandle: Long, targetviews: Int, enumflags: Int, netaddress: Long, protocolid: Int, rtmenumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmCreateNextHopEnum(rtmreghandle: Long, enumflags: Int, netaddress: Long, rtmenumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmCreateRouteEnum(rtmreghandle: Long, desthandle: Long, targetviews: Int, enumflags: Int, startdest: Long, matchingflags: Int, criteriaroute: Long, criteriainterface: Int, rtmenumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmCreateRouteList(rtmreghandle: Long, routelisthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmCreateRouteListEnum(rtmreghandle: Long, routelisthandle: Long, rtmenumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmDeleteEnumHandle(rtmreghandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmDeleteNextHop(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmDeleteRouteList(rtmreghandle: Long, routelisthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmDeleteRouteToDest(rtmreghandle: Long, routehandle: Long, changeflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmDeregisterEntity(rtmreghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmDeregisterFromChangeNotification(rtmreghandle: Long, notifyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmFindNextHop(rtmreghandle: Long, nexthopinfo: Long, nexthophandle: Long, nexthoppointer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmGetChangeStatus(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, changestatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmGetChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: Long, changeddests: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmGetDestInfo(rtmreghandle: Long, desthandle: Long, protocolid: Int, targetviews: Int, destinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmGetEntityInfo(rtmreghandle: Long, entityhandle: Long, entityinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmGetEntityMethods(rtmreghandle: Long, entityhandle: Long, nummethods: Long, exptmethods: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmGetEnumDests(rtmreghandle: Long, enumhandle: Long, numdests: Long, destinfos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmGetEnumNextHops(rtmreghandle: Long, enumhandle: Long, numnexthops: Long, nexthophandles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmGetEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: Long, routehandles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmGetExactMatchDestination(rtmreghandle: Long, destaddress: Long, protocolid: Int, targetviews: Int, destinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmGetExactMatchRoute(rtmreghandle: Long, destaddress: Long, matchingflags: Int, routeinfo: Long, interfaceindex: Int, targetviews: Int, routehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmGetLessSpecificDestination(rtmreghandle: Long, desthandle: Long, protocolid: Int, targetviews: Int, destinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmGetListEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: Long, routehandles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmGetMostSpecificDestination(rtmreghandle: Long, destaddress: Long, protocolid: Int, targetviews: Int, destinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmGetNextHopInfo(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmGetNextHopPointer(rtmreghandle: Long, nexthophandle: Long, nexthoppointer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmGetOpaqueInformationPointer(rtmreghandle: Long, desthandle: Long, opaqueinfopointer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmGetRegisteredEntities(rtmreghandle: Long, numentities: Long, entityhandles: Long, entityinfos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmGetRouteInfo(rtmreghandle: Long, routehandle: Long, routeinfo: Long, destaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmGetRoutePointer(rtmreghandle: Long, routehandle: Long, routepointer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmHoldDestination(rtmreghandle: Long, desthandle: Long, targetviews: Int, holdtime: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmIgnoreChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: Int, changeddests: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmInsertInRouteList(rtmreghandle: Long, routelisthandle: Long, numroutes: Int, routehandles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmInvokeMethod(rtmreghandle: Long, entityhandle: Long, input: Long, outputsize: Long, output: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmIsBestRoute(rtmreghandle: Long, routehandle: Long, bestinviews: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmIsMarkedForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, destmarked: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmLockDestination(rtmreghandle: Long, desthandle: Long, exclusive: Int, lockdest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmLockNextHop(rtmreghandle: Long, nexthophandle: Long, exclusive: Int, locknexthop: Int, nexthoppointer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmLockRoute(rtmreghandle: Long, routehandle: Long, exclusive: Int, lockroute: Int, routepointer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmMarkDestForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, markdest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmReferenceHandles(rtmreghandle: Long, numhandles: Int, rtmhandles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmRegisterEntity(rtmentityinfo: Long, exportmethods: Long, eventcallback: Long, reserveopaquepointer: Int, rtmregprofile: Long, rtmreghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmRegisterForChangeNotification(rtmreghandle: Long, targetviews: Int, notifyflags: Int, notifycontext: Long, notifyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmReleaseChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: Int, changeddests: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmReleaseDestInfo(rtmreghandle: Long, destinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmReleaseDests(rtmreghandle: Long, numdests: Int, destinfos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmReleaseEntities(rtmreghandle: Long, numentities: Int, entityhandles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmReleaseEntityInfo(rtmreghandle: Long, entityinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmReleaseNextHopInfo(rtmreghandle: Long, nexthopinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmReleaseNextHops(rtmreghandle: Long, numnexthops: Int, nexthophandles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmReleaseRouteInfo(rtmreghandle: Long, routeinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmReleaseRoutes(rtmreghandle: Long, numroutes: Int, routehandles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_rras_RtmUpdateAndUnlockRoute(rtmreghandle: Long, routehandle: Long, timetolive: Int, routelisthandle: Long, notifytype: Int, notifyhandle: Long, changeflags: Long): Int
}

public actual fun MgmAddGroupMembershipEntry(hprotocol: HANDLE, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MgmAddGroupMembershipEntry(hprotocol, dwsourceaddr.toInt(), dwsourcemask.toInt(), dwgroupaddr.toInt(), dwgroupmask.toInt(), dwifindex.toInt(), dwifnexthopipaddr.toInt(), dwflags.toInt()).toUInt()

public actual fun MgmDeRegisterMProtocol(hprotocol: HANDLE): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MgmDeRegisterMProtocol(hprotocol).toUInt()

public actual fun MgmDeleteGroupMembershipEntry(hprotocol: HANDLE, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MgmDeleteGroupMembershipEntry(hprotocol, dwsourceaddr.toInt(), dwsourcemask.toInt(), dwgroupaddr.toInt(), dwgroupmask.toInt(), dwifindex.toInt(), dwifnexthopipaddr.toInt(), dwflags.toInt()).toUInt()

public actual fun MgmGetFirstMfe(pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MgmGetFirstMfe(pdwbuffersize, pbbuffer, pdwnumentries).toUInt()

public actual fun MgmGetFirstMfeStats(pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MgmGetFirstMfeStats(pdwbuffersize, pbbuffer, pdwnumentries, dwflags.toInt()).toUInt()

public actual fun MgmGetMfe(pimm: Long, pdwbuffersize: Long, pbbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MgmGetMfe(pimm, pdwbuffersize, pbbuffer).toUInt()

public actual fun MgmGetMfeStats(pimm: Long, pdwbuffersize: Long, pbbuffer: Long, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MgmGetMfeStats(pimm, pdwbuffersize, pbbuffer, dwflags.toInt()).toUInt()

public actual fun MgmGetNextMfe(pimmstart: Long, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MgmGetNextMfe(pimmstart, pdwbuffersize, pbbuffer, pdwnumentries).toUInt()

public actual fun MgmGetNextMfeStats(pimmstart: Long, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MgmGetNextMfeStats(pimmstart, pdwbuffersize, pbbuffer, pdwnumentries, dwflags.toInt()).toUInt()

public actual fun MgmGetProtocolOnInterface(dwifindex: UInt, dwifnexthopaddr: UInt, pdwifprotocolid: Long, pdwifcomponentid: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MgmGetProtocolOnInterface(dwifindex.toInt(), dwifnexthopaddr.toInt(), pdwifprotocolid, pdwifcomponentid).toUInt()

public actual fun MgmGroupEnumerationEnd(henum: HANDLE): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MgmGroupEnumerationEnd(henum).toUInt()

public actual fun MgmGroupEnumerationGetNext(henum: HANDLE, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MgmGroupEnumerationGetNext(henum, pdwbuffersize, pbbuffer, pdwnumentries).toUInt()

public actual fun MgmGroupEnumerationStart(hprotocol: HANDLE, metenumtype: MGM_ENUM_TYPES, phenumhandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MgmGroupEnumerationStart(hprotocol, metenumtype, phenumhandle).toUInt()

public actual fun MgmRegisterMProtocol(prpiinfo: Long, dwprotocolid: UInt, dwcomponentid: UInt, phprotocol: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MgmRegisterMProtocol(prpiinfo, dwprotocolid.toInt(), dwcomponentid.toInt(), phprotocol).toUInt()

public actual fun MgmReleaseInterfaceOwnership(hprotocol: HANDLE, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MgmReleaseInterfaceOwnership(hprotocol, dwifindex.toInt(), dwifnexthopaddr.toInt()).toUInt()

public actual fun MgmTakeInterfaceOwnership(hprotocol: HANDLE, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MgmTakeInterfaceOwnership(hprotocol, dwifindex.toInt(), dwifnexthopaddr.toInt()).toUInt()

public actual fun MprAdminBufferFree(pbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminBufferFree(pbuffer).toUInt()

public actual fun MprAdminConnectionClearStats(hrasserver: Long, hrasconnection: HANDLE): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionClearStats(hrasserver, hrasconnection).toUInt()

public actual fun MprAdminConnectionEnum(hrasserver: Long, dwlevel: UInt, lplpbbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionEnum(hrasserver, dwlevel.toInt(), lplpbbuffer, dwprefmaxlen.toInt(), lpdwentriesread, lpdwtotalentries, lpdwresumehandle).toUInt()

public actual fun MprAdminConnectionEnumEx(hrasserver: Long, pobjectheader: Long, dwpreferedmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, pprasconn: Long, lpdwresumehandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionEnumEx(hrasserver, pobjectheader, dwpreferedmaxlen.toInt(), lpdwentriesread, lpdwtotalentries, pprasconn, lpdwresumehandle).toUInt()

public actual fun MprAdminConnectionGetInfo(hrasserver: Long, dwlevel: UInt, hrasconnection: HANDLE, lplpbbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionGetInfo(hrasserver, dwlevel.toInt(), hrasconnection, lplpbbuffer).toUInt()

public actual fun MprAdminConnectionGetInfoEx(hrasserver: Long, hrasconnection: HANDLE, prasconnection: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionGetInfoEx(hrasserver, hrasconnection, prasconnection).toUInt()

public actual fun MprAdminConnectionRemoveQuarantine(hrasserver: HANDLE, hrasconnection: HANDLE, fisipaddress: BOOL): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionRemoveQuarantine(hrasserver, hrasconnection, fisipaddress).toUInt()

public actual fun MprAdminDeregisterConnectionNotification(hmprserver: Long, heventnotification: HANDLE): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminDeregisterConnectionNotification(hmprserver, heventnotification).toUInt()

public actual fun MprAdminDeviceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long, lpdwtotalentries: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminDeviceEnum(hmprserver, dwlevel.toInt(), lplpbbuffer, lpdwtotalentries).toUInt()

public actual fun MprAdminEstablishDomainRasServer(pszdomain: PCWSTR, pszmachine: PCWSTR, benable: BOOL): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminEstablishDomainRasServer(pszdomain, pszmachine, benable).toUInt()

public actual fun MprAdminGetErrorString(dwerror: UInt, lplpwserrorstring: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminGetErrorString(dwerror.toInt(), lplpwserrorstring).toUInt()

public actual fun MprAdminGetPDCServer(lpszdomain: PCWSTR, lpszserver: PCWSTR, lpszpdcserver: PWSTR): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminGetPDCServer(lpszdomain, lpszserver, lpszpdcserver).toUInt()

public actual fun MprAdminInterfaceConnect(hmprserver: Long, hinterface: HANDLE, hevent: HANDLE, fsynchronous: BOOL): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceConnect(hmprserver, hinterface, hevent, fsynchronous).toUInt()

public actual fun MprAdminInterfaceCreate(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long, phinterface: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceCreate(hmprserver, dwlevel.toInt(), lpbbuffer, phinterface).toUInt()

public actual fun MprAdminInterfaceDelete(hmprserver: Long, hinterface: HANDLE): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDelete(hmprserver, hinterface).toUInt()

public actual fun MprAdminInterfaceDeviceGetInfo(hmprserver: Long, hinterface: HANDLE, dwindex: UInt, dwlevel: UInt, lplpbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDeviceGetInfo(hmprserver, hinterface, dwindex.toInt(), dwlevel.toInt(), lplpbuffer).toUInt()

public actual fun MprAdminInterfaceDeviceSetInfo(hmprserver: Long, hinterface: HANDLE, dwindex: UInt, dwlevel: UInt, lpbbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDeviceSetInfo(hmprserver, hinterface, dwindex.toInt(), dwlevel.toInt(), lpbbuffer).toUInt()

public actual fun MprAdminInterfaceDisconnect(hmprserver: Long, hinterface: HANDLE): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDisconnect(hmprserver, hinterface).toUInt()

public actual fun MprAdminInterfaceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceEnum(hmprserver, dwlevel.toInt(), lplpbbuffer, dwprefmaxlen.toInt(), lpdwentriesread, lpdwtotalentries, lpdwresumehandle).toUInt()

public actual fun MprAdminInterfaceGetCredentials(lpwsserver: PCWSTR, lpwsinterfacename: PCWSTR, lpwsusername: PWSTR, lpwspassword: PWSTR, lpwsdomainname: PWSTR): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetCredentials(lpwsserver, lpwsinterfacename, lpwsusername, lpwspassword, lpwsdomainname).toUInt()

public actual fun MprAdminInterfaceGetCredentialsEx(hmprserver: Long, hinterface: HANDLE, dwlevel: UInt, lplpbbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetCredentialsEx(hmprserver, hinterface, dwlevel.toInt(), lplpbbuffer).toUInt()

public actual fun MprAdminInterfaceGetCustomInfoEx(hmprserver: Long, hinterface: HANDLE, pcustominfo: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetCustomInfoEx(hmprserver, hinterface, pcustominfo).toUInt()

public actual fun MprAdminInterfaceGetHandle(hmprserver: Long, lpwsinterfacename: PCWSTR, phinterface: Long, fincludeclientinterfaces: BOOL): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetHandle(hmprserver, lpwsinterfacename, phinterface, fincludeclientinterfaces).toUInt()

public actual fun MprAdminInterfaceGetInfo(hmprserver: Long, hinterface: HANDLE, dwlevel: UInt, lplpbbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetInfo(hmprserver, hinterface, dwlevel.toInt(), lplpbbuffer).toUInt()

public actual fun MprAdminInterfaceQueryUpdateResult(hmprserver: Long, hinterface: HANDLE, dwprotocolid: UInt, lpdwupdateresult: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceQueryUpdateResult(hmprserver, hinterface, dwprotocolid.toInt(), lpdwupdateresult).toUInt()

public actual fun MprAdminInterfaceSetCredentials(lpwsserver: PCWSTR, lpwsinterfacename: PCWSTR, lpwsusername: PCWSTR, lpwsdomainname: PCWSTR, lpwspassword: PCWSTR): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetCredentials(lpwsserver, lpwsinterfacename, lpwsusername, lpwsdomainname, lpwspassword).toUInt()

public actual fun MprAdminInterfaceSetCredentialsEx(hmprserver: Long, hinterface: HANDLE, dwlevel: UInt, lpbbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetCredentialsEx(hmprserver, hinterface, dwlevel.toInt(), lpbbuffer).toUInt()

public actual fun MprAdminInterfaceSetCustomInfoEx(hmprserver: Long, hinterface: HANDLE, pcustominfo: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetCustomInfoEx(hmprserver, hinterface, pcustominfo).toUInt()

public actual fun MprAdminInterfaceSetInfo(hmprserver: Long, hinterface: HANDLE, dwlevel: UInt, lpbbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetInfo(hmprserver, hinterface, dwlevel.toInt(), lpbbuffer).toUInt()

public actual fun MprAdminInterfaceTransportAdd(hmprserver: Long, hinterface: HANDLE, dwtransportid: UInt, pinterfaceinfo: Long, dwinterfaceinfosize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportAdd(hmprserver, hinterface, dwtransportid.toInt(), pinterfaceinfo, dwinterfaceinfosize.toInt()).toUInt()

public actual fun MprAdminInterfaceTransportGetInfo(hmprserver: Long, hinterface: HANDLE, dwtransportid: UInt, ppinterfaceinfo: Long, lpdwinterfaceinfosize: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportGetInfo(hmprserver, hinterface, dwtransportid.toInt(), ppinterfaceinfo, lpdwinterfaceinfosize).toUInt()

public actual fun MprAdminInterfaceTransportRemove(hmprserver: Long, hinterface: HANDLE, dwtransportid: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportRemove(hmprserver, hinterface, dwtransportid.toInt()).toUInt()

public actual fun MprAdminInterfaceTransportSetInfo(hmprserver: Long, hinterface: HANDLE, dwtransportid: UInt, pinterfaceinfo: Long, dwinterfaceinfosize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportSetInfo(hmprserver, hinterface, dwtransportid.toInt(), pinterfaceinfo, dwinterfaceinfosize.toInt()).toUInt()

public actual fun MprAdminInterfaceUpdatePhonebookInfo(hmprserver: Long, hinterface: HANDLE): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceUpdatePhonebookInfo(hmprserver, hinterface).toUInt()

public actual fun MprAdminInterfaceUpdateRoutes(hmprserver: Long, hinterface: HANDLE, dwprotocolid: UInt, hevent: HANDLE): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceUpdateRoutes(hmprserver, hinterface, dwprotocolid.toInt(), hevent).toUInt()

public actual fun MprAdminIsDomainRasServer(pszdomain: PCWSTR, pszmachine: PCWSTR, pbisrasserver: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminIsDomainRasServer(pszdomain, pszmachine, pbisrasserver).toUInt()

public actual fun MprAdminIsServiceInitialized(lpwsservername: PCWSTR, fisserviceinitialized: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminIsServiceInitialized(lpwsservername, fisserviceinitialized).toUInt()

public actual fun MprAdminIsServiceRunning(lpwsservername: PCWSTR): BOOL =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminIsServiceRunning(lpwsservername)

public actual fun MprAdminMIBBufferFree(pbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBBufferFree(pbuffer).toUInt()

public actual fun MprAdminMIBEntryCreate(hmibserver: Long, dwpid: UInt, dwroutingpid: UInt, lpentry: Long, dwentrysize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryCreate(hmibserver, dwpid.toInt(), dwroutingpid.toInt(), lpentry, dwentrysize.toInt()).toUInt()

public actual fun MprAdminMIBEntryDelete(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: Long, dwentrysize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryDelete(hmibserver, dwprotocolid.toInt(), dwroutingpid.toInt(), lpentry, dwentrysize.toInt()).toUInt()

public actual fun MprAdminMIBEntryGet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: Long, dwinentrysize: UInt, lplpoutentry: Long, lpoutentrysize: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryGet(hmibserver, dwprotocolid.toInt(), dwroutingpid.toInt(), lpinentry, dwinentrysize.toInt(), lplpoutentry, lpoutentrysize).toUInt()

public actual fun MprAdminMIBEntryGetFirst(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: Long, dwinentrysize: UInt, lplpoutentry: Long, lpoutentrysize: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryGetFirst(hmibserver, dwprotocolid.toInt(), dwroutingpid.toInt(), lpinentry, dwinentrysize.toInt(), lplpoutentry, lpoutentrysize).toUInt()

public actual fun MprAdminMIBEntryGetNext(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: Long, dwinentrysize: UInt, lplpoutentry: Long, lpoutentrysize: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryGetNext(hmibserver, dwprotocolid.toInt(), dwroutingpid.toInt(), lpinentry, dwinentrysize.toInt(), lplpoutentry, lpoutentrysize).toUInt()

public actual fun MprAdminMIBEntrySet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: Long, dwentrysize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntrySet(hmibserver, dwprotocolid.toInt(), dwroutingpid.toInt(), lpentry, dwentrysize.toInt()).toUInt()

public actual fun MprAdminMIBServerConnect(lpwsservername: PCWSTR, phmibserver: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBServerConnect(lpwsservername, phmibserver).toUInt()

public actual fun MprAdminMIBServerDisconnect(hmibserver: Long) {
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBServerDisconnect(hmibserver)
}

public actual fun MprAdminPortClearStats(hrasserver: Long, hport: HANDLE): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminPortClearStats(hrasserver, hport).toUInt()

public actual fun MprAdminPortDisconnect(hrasserver: Long, hport: HANDLE): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminPortDisconnect(hrasserver, hport).toUInt()

public actual fun MprAdminPortEnum(hrasserver: Long, dwlevel: UInt, hrasconnection: HANDLE, lplpbbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminPortEnum(hrasserver, dwlevel.toInt(), hrasconnection, lplpbbuffer, dwprefmaxlen.toInt(), lpdwentriesread, lpdwtotalentries, lpdwresumehandle).toUInt()

public actual fun MprAdminPortGetInfo(hrasserver: Long, dwlevel: UInt, hport: HANDLE, lplpbbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminPortGetInfo(hrasserver, dwlevel.toInt(), hport, lplpbbuffer).toUInt()

public actual fun MprAdminPortReset(hrasserver: Long, hport: HANDLE): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminPortReset(hrasserver, hport).toUInt()

public actual fun MprAdminRegisterConnectionNotification(hmprserver: Long, heventnotification: HANDLE): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminRegisterConnectionNotification(hmprserver, heventnotification).toUInt()

public actual fun MprAdminSendUserMessage(hmprserver: Long, hconnection: HANDLE, lpwszmessage: PCWSTR): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminSendUserMessage(hmprserver, hconnection, lpwszmessage).toUInt()

public actual fun MprAdminServerConnect(lpwsservername: PCWSTR, phmprserver: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminServerConnect(lpwsservername, phmprserver).toUInt()

public actual fun MprAdminServerDisconnect(hmprserver: Long) {
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminServerDisconnect(hmprserver)
}

public actual fun MprAdminServerGetCredentials(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminServerGetCredentials(hmprserver, dwlevel.toInt(), lplpbbuffer).toUInt()

public actual fun MprAdminServerGetInfo(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminServerGetInfo(hmprserver, dwlevel.toInt(), lplpbbuffer).toUInt()

public actual fun MprAdminServerGetInfoEx(hmprserver: Long, pserverinfo: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminServerGetInfoEx(hmprserver, pserverinfo).toUInt()

public actual fun MprAdminServerSetCredentials(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminServerSetCredentials(hmprserver, dwlevel.toInt(), lpbbuffer).toUInt()

public actual fun MprAdminServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminServerSetInfo(hmprserver, dwlevel.toInt(), lpbbuffer).toUInt()

public actual fun MprAdminServerSetInfoEx(hmprserver: Long, pserverinfo: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminServerSetInfoEx(hmprserver, pserverinfo).toUInt()

public actual fun MprAdminTransportCreate(hmprserver: Long, dwtransportid: UInt, lpwstransportname: PCWSTR, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt, lpwsdllpath: PCWSTR): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminTransportCreate(hmprserver, dwtransportid.toInt(), lpwstransportname, pglobalinfo, dwglobalinfosize.toInt(), pclientinterfaceinfo, dwclientinterfaceinfosize.toInt(), lpwsdllpath).toUInt()

public actual fun MprAdminTransportGetInfo(hmprserver: Long, dwtransportid: UInt, ppglobalinfo: Long, lpdwglobalinfosize: Long, ppclientinterfaceinfo: Long, lpdwclientinterfaceinfosize: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminTransportGetInfo(hmprserver, dwtransportid.toInt(), ppglobalinfo, lpdwglobalinfosize, ppclientinterfaceinfo, lpdwclientinterfaceinfosize).toUInt()

public actual fun MprAdminTransportSetInfo(hmprserver: Long, dwtransportid: UInt, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminTransportSetInfo(hmprserver, dwtransportid.toInt(), pglobalinfo, dwglobalinfosize.toInt(), pclientinterfaceinfo, dwclientinterfaceinfosize.toInt()).toUInt()

public actual fun MprAdminUpdateConnection(hrasserver: Long, hrasconnection: HANDLE, prasupdateconnection: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminUpdateConnection(hrasserver, hrasconnection, prasupdateconnection).toUInt()

public actual fun MprAdminUserGetInfo(lpszserver: PCWSTR, lpszuser: PCWSTR, dwlevel: UInt, lpbbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminUserGetInfo(lpszserver, lpszuser, dwlevel.toInt(), lpbbuffer).toUInt()

public actual fun MprAdminUserSetInfo(lpszserver: PCWSTR, lpszuser: PCWSTR, dwlevel: UInt, lpbbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprAdminUserSetInfo(lpszserver, lpszuser, dwlevel.toInt(), lpbbuffer).toUInt()

public actual fun MprConfigBufferFree(pbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigBufferFree(pbuffer).toUInt()

public actual fun MprConfigFilterGetInfo(hmprconfig: HANDLE, dwlevel: UInt, dwtransportid: UInt, lpbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigFilterGetInfo(hmprconfig, dwlevel.toInt(), dwtransportid.toInt(), lpbuffer).toUInt()

public actual fun MprConfigFilterSetInfo(hmprconfig: HANDLE, dwlevel: UInt, dwtransportid: UInt, lpbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigFilterSetInfo(hmprconfig, dwlevel.toInt(), dwtransportid.toInt(), lpbuffer).toUInt()

public actual fun MprConfigGetFriendlyName(hmprconfig: HANDLE, pszguidname: PCWSTR, pszbuffer: PWSTR, dwbuffersize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigGetFriendlyName(hmprconfig, pszguidname, pszbuffer, dwbuffersize.toInt()).toUInt()

public actual fun MprConfigGetGuidName(hmprconfig: HANDLE, pszfriendlyname: PCWSTR, pszbuffer: PWSTR, dwbuffersize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigGetGuidName(hmprconfig, pszfriendlyname, pszbuffer, dwbuffersize.toInt()).toUInt()

public actual fun MprConfigInterfaceCreate(hmprconfig: HANDLE, dwlevel: UInt, lpbbuffer: Long, phrouterinterface: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceCreate(hmprconfig, dwlevel.toInt(), lpbbuffer, phrouterinterface).toUInt()

public actual fun MprConfigInterfaceDelete(hmprconfig: HANDLE, hrouterinterface: HANDLE): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceDelete(hmprconfig, hrouterinterface).toUInt()

public actual fun MprConfigInterfaceEnum(hmprconfig: HANDLE, dwlevel: UInt, lplpbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceEnum(hmprconfig, dwlevel.toInt(), lplpbuffer, dwprefmaxlen.toInt(), lpdwentriesread, lpdwtotalentries, lpdwresumehandle).toUInt()

public actual fun MprConfigInterfaceGetCustomInfoEx(hmprconfig: HANDLE, hrouterinterface: HANDLE, pcustominfo: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceGetCustomInfoEx(hmprconfig, hrouterinterface, pcustominfo).toUInt()

public actual fun MprConfigInterfaceGetHandle(hmprconfig: HANDLE, lpwsinterfacename: PCWSTR, phrouterinterface: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceGetHandle(hmprconfig, lpwsinterfacename, phrouterinterface).toUInt()

public actual fun MprConfigInterfaceGetInfo(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwlevel: UInt, lplpbuffer: Long, lpdwbuffersize: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceGetInfo(hmprconfig, hrouterinterface, dwlevel.toInt(), lplpbuffer, lpdwbuffersize).toUInt()

public actual fun MprConfigInterfaceSetCustomInfoEx(hmprconfig: HANDLE, hrouterinterface: HANDLE, pcustominfo: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceSetCustomInfoEx(hmprconfig, hrouterinterface, pcustominfo).toUInt()

public actual fun MprConfigInterfaceSetInfo(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwlevel: UInt, lpbbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceSetInfo(hmprconfig, hrouterinterface, dwlevel.toInt(), lpbbuffer).toUInt()

public actual fun MprConfigInterfaceTransportAdd(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwtransportid: UInt, lpwstransportname: PCWSTR, pinterfaceinfo: Long, dwinterfaceinfosize: UInt, phrouteriftransport: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportAdd(hmprconfig, hrouterinterface, dwtransportid.toInt(), lpwstransportname, pinterfaceinfo, dwinterfaceinfosize.toInt(), phrouteriftransport).toUInt()

public actual fun MprConfigInterfaceTransportEnum(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwlevel: UInt, lplpbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportEnum(hmprconfig, hrouterinterface, dwlevel.toInt(), lplpbuffer, dwprefmaxlen.toInt(), lpdwentriesread, lpdwtotalentries, lpdwresumehandle).toUInt()

public actual fun MprConfigInterfaceTransportGetHandle(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwtransportid: UInt, phrouteriftransport: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportGetHandle(hmprconfig, hrouterinterface, dwtransportid.toInt(), phrouteriftransport).toUInt()

public actual fun MprConfigInterfaceTransportGetInfo(hmprconfig: HANDLE, hrouterinterface: HANDLE, hrouteriftransport: HANDLE, ppinterfaceinfo: Long, lpdwinterfaceinfosize: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportGetInfo(hmprconfig, hrouterinterface, hrouteriftransport, ppinterfaceinfo, lpdwinterfaceinfosize).toUInt()

public actual fun MprConfigInterfaceTransportRemove(hmprconfig: HANDLE, hrouterinterface: HANDLE, hrouteriftransport: HANDLE): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportRemove(hmprconfig, hrouterinterface, hrouteriftransport).toUInt()

public actual fun MprConfigInterfaceTransportSetInfo(hmprconfig: HANDLE, hrouterinterface: HANDLE, hrouteriftransport: HANDLE, pinterfaceinfo: Long, dwinterfaceinfosize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportSetInfo(hmprconfig, hrouterinterface, hrouteriftransport, pinterfaceinfo, dwinterfaceinfosize.toInt()).toUInt()

public actual fun MprConfigServerBackup(hmprconfig: HANDLE, lpwspath: PCWSTR): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigServerBackup(hmprconfig, lpwspath).toUInt()

public actual fun MprConfigServerConnect(lpwsservername: PCWSTR, phmprconfig: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigServerConnect(lpwsservername, phmprconfig).toUInt()

public actual fun MprConfigServerDisconnect(hmprconfig: HANDLE) {
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigServerDisconnect(hmprconfig)
}

public actual fun MprConfigServerGetInfo(hmprconfig: HANDLE, dwlevel: UInt, lplpbbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigServerGetInfo(hmprconfig, dwlevel.toInt(), lplpbbuffer).toUInt()

public actual fun MprConfigServerGetInfoEx(hmprconfig: HANDLE, pserverinfo: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigServerGetInfoEx(hmprconfig, pserverinfo).toUInt()

public actual fun MprConfigServerInstall(dwlevel: UInt, pbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigServerInstall(dwlevel.toInt(), pbuffer).toUInt()

public actual fun MprConfigServerRefresh(hmprconfig: HANDLE): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigServerRefresh(hmprconfig).toUInt()

public actual fun MprConfigServerRestore(hmprconfig: HANDLE, lpwspath: PCWSTR): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigServerRestore(hmprconfig, lpwspath).toUInt()

public actual fun MprConfigServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigServerSetInfo(hmprserver, dwlevel.toInt(), lpbbuffer).toUInt()

public actual fun MprConfigServerSetInfoEx(hmprconfig: HANDLE, psetserverconfig: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigServerSetInfoEx(hmprconfig, psetserverconfig).toUInt()

public actual fun MprConfigTransportCreate(hmprconfig: HANDLE, dwtransportid: UInt, lpwstransportname: PCWSTR, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt, lpwsdllpath: PCWSTR, phroutertransport: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigTransportCreate(hmprconfig, dwtransportid.toInt(), lpwstransportname, pglobalinfo, dwglobalinfosize.toInt(), pclientinterfaceinfo, dwclientinterfaceinfosize.toInt(), lpwsdllpath, phroutertransport).toUInt()

public actual fun MprConfigTransportDelete(hmprconfig: HANDLE, hroutertransport: HANDLE): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigTransportDelete(hmprconfig, hroutertransport).toUInt()

public actual fun MprConfigTransportEnum(hmprconfig: HANDLE, dwlevel: UInt, lplpbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigTransportEnum(hmprconfig, dwlevel.toInt(), lplpbuffer, dwprefmaxlen.toInt(), lpdwentriesread, lpdwtotalentries, lpdwresumehandle).toUInt()

public actual fun MprConfigTransportGetHandle(hmprconfig: HANDLE, dwtransportid: UInt, phroutertransport: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigTransportGetHandle(hmprconfig, dwtransportid.toInt(), phroutertransport).toUInt()

public actual fun MprConfigTransportGetInfo(hmprconfig: HANDLE, hroutertransport: HANDLE, ppglobalinfo: Long, lpdwglobalinfosize: Long, ppclientinterfaceinfo: Long, lpdwclientinterfaceinfosize: Long, lplpwsdllpath: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigTransportGetInfo(hmprconfig, hroutertransport, ppglobalinfo, lpdwglobalinfosize, ppclientinterfaceinfo, lpdwclientinterfaceinfosize, lplpwsdllpath).toUInt()

public actual fun MprConfigTransportSetInfo(hmprconfig: HANDLE, hroutertransport: HANDLE, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt, lpwsdllpath: PCWSTR): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprConfigTransportSetInfo(hmprconfig, hroutertransport, pglobalinfo, dwglobalinfosize.toInt(), pclientinterfaceinfo, dwclientinterfaceinfosize.toInt(), lpwsdllpath).toUInt()

public actual fun MprInfoBlockAdd(lpheader: Long, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: Long, lplpnewheader: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprInfoBlockAdd(lpheader, dwinfotype.toInt(), dwitemsize.toInt(), dwitemcount.toInt(), lpitemdata, lplpnewheader).toUInt()

public actual fun MprInfoBlockFind(lpheader: Long, dwinfotype: UInt, lpdwitemsize: Long, lpdwitemcount: Long, lplpitemdata: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprInfoBlockFind(lpheader, dwinfotype.toInt(), lpdwitemsize, lpdwitemcount, lplpitemdata).toUInt()

public actual fun MprInfoBlockQuerySize(lpheader: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprInfoBlockQuerySize(lpheader).toUInt()

public actual fun MprInfoBlockRemove(lpheader: Long, dwinfotype: UInt, lplpnewheader: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprInfoBlockRemove(lpheader, dwinfotype.toInt(), lplpnewheader).toUInt()

public actual fun MprInfoBlockSet(lpheader: Long, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: Long, lplpnewheader: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprInfoBlockSet(lpheader, dwinfotype.toInt(), dwitemsize.toInt(), dwitemcount.toInt(), lpitemdata, lplpnewheader).toUInt()

public actual fun MprInfoCreate(dwversion: UInt, lplpnewheader: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprInfoCreate(dwversion.toInt(), lplpnewheader).toUInt()

public actual fun MprInfoDelete(lpheader: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprInfoDelete(lpheader).toUInt()

public actual fun MprInfoDuplicate(lpheader: Long, lplpnewheader: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprInfoDuplicate(lpheader, lplpnewheader).toUInt()

public actual fun MprInfoRemoveAll(lpheader: Long, lplpnewheader: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_MprInfoRemoveAll(lpheader, lplpnewheader).toUInt()

public actual fun RasClearConnectionStatistics(hrasconn: HRASCONN): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasClearConnectionStatistics(hrasconn).toUInt()

public actual fun RasClearLinkStatistics(hrasconn: HRASCONN, dwsubentry: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasClearLinkStatistics(hrasconn, dwsubentry.toInt()).toUInt()

public actual fun RasConnectionNotificationA(param0: HRASCONN, param1: HANDLE, param2: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasConnectionNotificationA(param0, param1, param2.toInt()).toUInt()

public actual fun RasConnectionNotificationW(param0: HRASCONN, param1: HANDLE, param2: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasConnectionNotificationW(param0, param1, param2.toInt()).toUInt()

public actual fun RasCreatePhonebookEntryA(param0: HWND, param1: PCSTR): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasCreatePhonebookEntryA(param0, param1).toUInt()

public actual fun RasCreatePhonebookEntryW(param0: HWND, param1: PCWSTR): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasCreatePhonebookEntryW(param0, param1).toUInt()

public actual fun RasDeleteEntryA(param0: PCSTR, param1: PCSTR): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasDeleteEntryA(param0, param1).toUInt()

public actual fun RasDeleteEntryW(param0: PCWSTR, param1: PCWSTR): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasDeleteEntryW(param0, param1).toUInt()

public actual fun RasDeleteSubEntryA(pszphonebook: PCSTR, pszentry: PCSTR, dwsubentryid: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasDeleteSubEntryA(pszphonebook, pszentry, dwsubentryid.toInt()).toUInt()

public actual fun RasDeleteSubEntryW(pszphonebook: PCWSTR, pszentry: PCWSTR, dwsubentryid: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasDeleteSubEntryW(pszphonebook, pszentry, dwsubentryid.toInt()).toUInt()

public actual fun RasDialA(param0: Long, param1: PCSTR, param2: Long, param3: UInt, param4: Long, param5: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasDialA(param0, param1, param2, param3.toInt(), param4, param5).toUInt()

public actual fun RasDialDlgA(lpszphonebook: PCSTR, lpszentry: PCSTR, lpszphonenumber: PCSTR, lpinfo: Long): BOOL =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasDialDlgA(lpszphonebook, lpszentry, lpszphonenumber, lpinfo)

public actual fun RasDialDlgW(lpszphonebook: PCWSTR, lpszentry: PCWSTR, lpszphonenumber: PCWSTR, lpinfo: Long): BOOL =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasDialDlgW(lpszphonebook, lpszentry, lpszphonenumber, lpinfo)

public actual fun RasDialW(param0: Long, param1: PCWSTR, param2: Long, param3: UInt, param4: Long, param5: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasDialW(param0, param1, param2, param3.toInt(), param4, param5).toUInt()

public actual fun RasEditPhonebookEntryA(param0: HWND, param1: PCSTR, param2: PCSTR): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasEditPhonebookEntryA(param0, param1, param2).toUInt()

public actual fun RasEditPhonebookEntryW(param0: HWND, param1: PCWSTR, param2: PCWSTR): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasEditPhonebookEntryW(param0, param1, param2).toUInt()

public actual fun RasEntryDlgA(lpszphonebook: PCSTR, lpszentry: PCSTR, lpinfo: Long): BOOL =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasEntryDlgA(lpszphonebook, lpszentry, lpinfo)

public actual fun RasEntryDlgW(lpszphonebook: PCWSTR, lpszentry: PCWSTR, lpinfo: Long): BOOL =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasEntryDlgW(lpszphonebook, lpszentry, lpinfo)

public actual fun RasEnumAutodialAddressesA(lpprasautodialaddresses: Long, lpdwcbrasautodialaddresses: Long, lpdwcrasautodialaddresses: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasEnumAutodialAddressesA(lpprasautodialaddresses, lpdwcbrasautodialaddresses, lpdwcrasautodialaddresses).toUInt()

public actual fun RasEnumAutodialAddressesW(lpprasautodialaddresses: Long, lpdwcbrasautodialaddresses: Long, lpdwcrasautodialaddresses: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasEnumAutodialAddressesW(lpprasautodialaddresses, lpdwcbrasautodialaddresses, lpdwcrasautodialaddresses).toUInt()

public actual fun RasEnumConnectionsA(param0: Long, param1: Long, param2: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasEnumConnectionsA(param0, param1, param2).toUInt()

public actual fun RasEnumConnectionsW(param0: Long, param1: Long, param2: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasEnumConnectionsW(param0, param1, param2).toUInt()

public actual fun RasEnumDevicesA(param0: Long, param1: Long, param2: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasEnumDevicesA(param0, param1, param2).toUInt()

public actual fun RasEnumDevicesW(param0: Long, param1: Long, param2: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasEnumDevicesW(param0, param1, param2).toUInt()

public actual fun RasEnumEntriesA(param0: PCSTR, param1: PCSTR, param2: Long, param3: Long, param4: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasEnumEntriesA(param0, param1, param2, param3, param4).toUInt()

public actual fun RasEnumEntriesW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: Long, param4: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasEnumEntriesW(param0, param1, param2, param3, param4).toUInt()

public actual fun RasFreeEapUserIdentityA(praseapuseridentity: Long) {
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasFreeEapUserIdentityA(praseapuseridentity)
}

public actual fun RasFreeEapUserIdentityW(praseapuseridentity: Long) {
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasFreeEapUserIdentityW(praseapuseridentity)
}

public actual fun RasGetAutodialAddressA(param0: PCSTR, param1: Long, param2: Long, param3: Long, param4: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetAutodialAddressA(param0, param1, param2, param3, param4).toUInt()

public actual fun RasGetAutodialAddressW(param0: PCWSTR, param1: Long, param2: Long, param3: Long, param4: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetAutodialAddressW(param0, param1, param2, param3, param4).toUInt()

public actual fun RasGetAutodialEnableA(param0: UInt, param1: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetAutodialEnableA(param0.toInt(), param1).toUInt()

public actual fun RasGetAutodialEnableW(param0: UInt, param1: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetAutodialEnableW(param0.toInt(), param1).toUInt()

public actual fun RasGetAutodialParamA(param0: UInt, param1: Long, param2: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetAutodialParamA(param0.toInt(), param1, param2).toUInt()

public actual fun RasGetAutodialParamW(param0: UInt, param1: Long, param2: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetAutodialParamW(param0.toInt(), param1, param2).toUInt()

public actual fun RasGetConnectStatusA(param0: HRASCONN, param1: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetConnectStatusA(param0, param1).toUInt()

public actual fun RasGetConnectStatusW(param0: HRASCONN, param1: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetConnectStatusW(param0, param1).toUInt()

public actual fun RasGetConnectionStatistics(hrasconn: HRASCONN, lpstatistics: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetConnectionStatistics(hrasconn, lpstatistics).toUInt()

public actual fun RasGetCountryInfoA(param0: Long, param1: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetCountryInfoA(param0, param1).toUInt()

public actual fun RasGetCountryInfoW(param0: Long, param1: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetCountryInfoW(param0, param1).toUInt()

public actual fun RasGetCredentialsA(param0: PCSTR, param1: PCSTR, param2: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetCredentialsA(param0, param1, param2).toUInt()

public actual fun RasGetCredentialsW(param0: PCWSTR, param1: PCWSTR, param2: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetCredentialsW(param0, param1, param2).toUInt()

public actual fun RasGetCustomAuthDataA(pszphonebook: PCSTR, pszentry: PCSTR, pbcustomauthdata: Long, pdwsizeofcustomauthdata: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetCustomAuthDataA(pszphonebook, pszentry, pbcustomauthdata, pdwsizeofcustomauthdata).toUInt()

public actual fun RasGetCustomAuthDataW(pszphonebook: PCWSTR, pszentry: PCWSTR, pbcustomauthdata: Long, pdwsizeofcustomauthdata: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetCustomAuthDataW(pszphonebook, pszentry, pbcustomauthdata, pdwsizeofcustomauthdata).toUInt()

public actual fun RasGetEapUserDataA(htoken: HANDLE, pszphonebook: PCSTR, pszentry: PCSTR, pbeapdata: Long, pdwsizeofeapdata: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetEapUserDataA(htoken, pszphonebook, pszentry, pbeapdata, pdwsizeofeapdata).toUInt()

public actual fun RasGetEapUserDataW(htoken: HANDLE, pszphonebook: PCWSTR, pszentry: PCWSTR, pbeapdata: Long, pdwsizeofeapdata: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetEapUserDataW(htoken, pszphonebook, pszentry, pbeapdata, pdwsizeofeapdata).toUInt()

public actual fun RasGetEapUserIdentityA(pszphonebook: PCSTR, pszentry: PCSTR, dwflags: UInt, hwnd: HWND, ppraseapuseridentity: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetEapUserIdentityA(pszphonebook, pszentry, dwflags.toInt(), hwnd, ppraseapuseridentity).toUInt()

public actual fun RasGetEapUserIdentityW(pszphonebook: PCWSTR, pszentry: PCWSTR, dwflags: UInt, hwnd: HWND, ppraseapuseridentity: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetEapUserIdentityW(pszphonebook, pszentry, dwflags.toInt(), hwnd, ppraseapuseridentity).toUInt()

public actual fun RasGetEntryDialParamsA(param0: PCSTR, param1: Long, param2: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetEntryDialParamsA(param0, param1, param2).toUInt()

public actual fun RasGetEntryDialParamsW(param0: PCWSTR, param1: Long, param2: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetEntryDialParamsW(param0, param1, param2).toUInt()

public actual fun RasGetEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: Long, param3: Long, param4: Long, param5: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetEntryPropertiesA(param0, param1, param2, param3, param4, param5).toUInt()

public actual fun RasGetEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: Long, param4: Long, param5: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetEntryPropertiesW(param0, param1, param2, param3, param4, param5).toUInt()

public actual fun RasGetErrorStringA(resourceid: UInt, lpszstring: PSTR, inbufsize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetErrorStringA(resourceid.toInt(), lpszstring, inbufsize.toInt()).toUInt()

public actual fun RasGetErrorStringW(resourceid: UInt, lpszstring: PWSTR, inbufsize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetErrorStringW(resourceid.toInt(), lpszstring, inbufsize.toInt()).toUInt()

public actual fun RasGetLinkStatistics(hrasconn: HRASCONN, dwsubentry: UInt, lpstatistics: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetLinkStatistics(hrasconn, dwsubentry.toInt(), lpstatistics).toUInt()

public actual fun RasGetPCscf(lpszpcscf: PWSTR): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetPCscf(lpszpcscf).toUInt()

public actual fun RasGetProjectionInfoA(param0: HRASCONN, param1: RASPROJECTION, param2: Long, param3: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetProjectionInfoA(param0, param1, param2, param3).toUInt()

public actual fun RasGetProjectionInfoEx(hrasconn: HRASCONN, prasprojection: Long, lpdwsize: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetProjectionInfoEx(hrasconn, prasprojection, lpdwsize).toUInt()

public actual fun RasGetProjectionInfoW(param0: HRASCONN, param1: RASPROJECTION, param2: Long, param3: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetProjectionInfoW(param0, param1, param2, param3).toUInt()

public actual fun RasGetSubEntryHandleA(param0: HRASCONN, param1: UInt, param2: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryHandleA(param0, param1.toInt(), param2).toUInt()

public actual fun RasGetSubEntryHandleW(param0: HRASCONN, param1: UInt, param2: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryHandleW(param0, param1.toInt(), param2).toUInt()

public actual fun RasGetSubEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: UInt, param3: Long, param4: Long, param5: Long, param6: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryPropertiesA(param0, param1, param2.toInt(), param3, param4, param5, param6).toUInt()

public actual fun RasGetSubEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: UInt, param3: Long, param4: Long, param5: Long, param6: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryPropertiesW(param0, param1, param2.toInt(), param3, param4, param5, param6).toUInt()

public actual fun RasHangUpA(param0: HRASCONN): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasHangUpA(param0).toUInt()

public actual fun RasHangUpW(param0: HRASCONN): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasHangUpW(param0).toUInt()

public actual fun RasInvokeEapUI(param0: HRASCONN, param1: UInt, param2: Long, param3: HWND): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasInvokeEapUI(param0, param1.toInt(), param2, param3).toUInt()

public actual fun RasPhonebookDlgA(lpszphonebook: PCSTR, lpszentry: PCSTR, lpinfo: Long): BOOL =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasPhonebookDlgA(lpszphonebook, lpszentry, lpinfo)

public actual fun RasPhonebookDlgW(lpszphonebook: PCWSTR, lpszentry: PCWSTR, lpinfo: Long): BOOL =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasPhonebookDlgW(lpszphonebook, lpszentry, lpinfo)

public actual fun RasRenameEntryA(param0: PCSTR, param1: PCSTR, param2: PCSTR): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasRenameEntryA(param0, param1, param2).toUInt()

public actual fun RasRenameEntryW(param0: PCWSTR, param1: PCWSTR, param2: PCWSTR): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasRenameEntryW(param0, param1, param2).toUInt()

public actual fun RasSetAutodialAddressA(param0: PCSTR, param1: UInt, param2: Long, param3: UInt, param4: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasSetAutodialAddressA(param0, param1.toInt(), param2, param3.toInt(), param4.toInt()).toUInt()

public actual fun RasSetAutodialAddressW(param0: PCWSTR, param1: UInt, param2: Long, param3: UInt, param4: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasSetAutodialAddressW(param0, param1.toInt(), param2, param3.toInt(), param4.toInt()).toUInt()

public actual fun RasSetAutodialEnableA(param0: UInt, param1: BOOL): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasSetAutodialEnableA(param0.toInt(), param1).toUInt()

public actual fun RasSetAutodialEnableW(param0: UInt, param1: BOOL): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasSetAutodialEnableW(param0.toInt(), param1).toUInt()

public actual fun RasSetAutodialParamA(param0: UInt, param1: Long, param2: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasSetAutodialParamA(param0.toInt(), param1, param2.toInt()).toUInt()

public actual fun RasSetAutodialParamW(param0: UInt, param1: Long, param2: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasSetAutodialParamW(param0.toInt(), param1, param2.toInt()).toUInt()

public actual fun RasSetCredentialsA(param0: PCSTR, param1: PCSTR, param2: Long, param3: BOOL): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasSetCredentialsA(param0, param1, param2, param3).toUInt()

public actual fun RasSetCredentialsW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: BOOL): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasSetCredentialsW(param0, param1, param2, param3).toUInt()

public actual fun RasSetCustomAuthDataA(pszphonebook: PCSTR, pszentry: PCSTR, pbcustomauthdata: Long, dwsizeofcustomauthdata: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasSetCustomAuthDataA(pszphonebook, pszentry, pbcustomauthdata, dwsizeofcustomauthdata.toInt()).toUInt()

public actual fun RasSetCustomAuthDataW(pszphonebook: PCWSTR, pszentry: PCWSTR, pbcustomauthdata: Long, dwsizeofcustomauthdata: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasSetCustomAuthDataW(pszphonebook, pszentry, pbcustomauthdata, dwsizeofcustomauthdata.toInt()).toUInt()

public actual fun RasSetEapUserDataA(htoken: HANDLE, pszphonebook: PCSTR, pszentry: PCSTR, pbeapdata: Long, dwsizeofeapdata: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasSetEapUserDataA(htoken, pszphonebook, pszentry, pbeapdata, dwsizeofeapdata.toInt()).toUInt()

public actual fun RasSetEapUserDataW(htoken: HANDLE, pszphonebook: PCWSTR, pszentry: PCWSTR, pbeapdata: Long, dwsizeofeapdata: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasSetEapUserDataW(htoken, pszphonebook, pszentry, pbeapdata, dwsizeofeapdata.toInt()).toUInt()

public actual fun RasSetEntryDialParamsA(param0: PCSTR, param1: Long, param2: BOOL): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasSetEntryDialParamsA(param0, param1, param2).toUInt()

public actual fun RasSetEntryDialParamsW(param0: PCWSTR, param1: Long, param2: BOOL): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasSetEntryDialParamsW(param0, param1, param2).toUInt()

public actual fun RasSetEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: Long, param3: UInt, param4: Long, param5: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasSetEntryPropertiesA(param0, param1, param2, param3.toInt(), param4, param5.toInt()).toUInt()

public actual fun RasSetEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: UInt, param4: Long, param5: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasSetEntryPropertiesW(param0, param1, param2, param3.toInt(), param4, param5.toInt()).toUInt()

public actual fun RasSetSubEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: UInt, param3: Long, param4: UInt, param5: Long, param6: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasSetSubEntryPropertiesA(param0, param1, param2.toInt(), param3, param4.toInt(), param5, param6.toInt()).toUInt()

public actual fun RasSetSubEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: UInt, param3: Long, param4: UInt, param5: Long, param6: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasSetSubEntryPropertiesW(param0, param1, param2.toInt(), param3, param4.toInt(), param5, param6.toInt()).toUInt()

public actual fun RasUpdateConnection(hrasconn: HRASCONN, lprasupdateconn: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasUpdateConnection(hrasconn, lprasupdateconn).toUInt()

public actual fun RasValidateEntryNameA(param0: PCSTR, param1: PCSTR): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasValidateEntryNameA(param0, param1).toUInt()

public actual fun RasValidateEntryNameW(param0: PCWSTR, param1: PCWSTR): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RasValidateEntryNameW(param0, param1).toUInt()

public actual fun RtmAddNextHop(rtmreghandle: Long, nexthopinfo: Long, nexthophandle: Long, changeflags: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmAddNextHop(rtmreghandle, nexthopinfo, nexthophandle, changeflags).toUInt()

public actual fun RtmAddRouteToDest(rtmreghandle: Long, routehandle: Long, destaddress: Long, routeinfo: Long, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmAddRouteToDest(rtmreghandle, routehandle, destaddress, routeinfo, timetolive.toInt(), routelisthandle, notifytype.toInt(), notifyhandle, changeflags).toUInt()

public actual fun RtmBlockMethods(rtmreghandle: Long, targethandle: HANDLE, targettype: UByte, blockingflag: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmBlockMethods(rtmreghandle, targethandle, targettype.toByte(), blockingflag.toInt()).toUInt()

public actual fun RtmConvertIpv6AddressAndLengthToNetAddress(pnetaddress: Long, address: IN6_ADDR, dwlength: UInt, dwaddresssize: UInt): UInt =
    0u

public actual fun RtmConvertNetAddressToIpv6AddressAndLength(pnetaddress: Long, paddress: Long, plength: Long, dwaddresssize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmConvertNetAddressToIpv6AddressAndLength(pnetaddress, paddress, plength, dwaddresssize.toInt()).toUInt()

public actual fun RtmCreateDestEnum(rtmreghandle: Long, targetviews: UInt, enumflags: UInt, netaddress: Long, protocolid: UInt, rtmenumhandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmCreateDestEnum(rtmreghandle, targetviews.toInt(), enumflags.toInt(), netaddress, protocolid.toInt(), rtmenumhandle).toUInt()

public actual fun RtmCreateNextHopEnum(rtmreghandle: Long, enumflags: UInt, netaddress: Long, rtmenumhandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmCreateNextHopEnum(rtmreghandle, enumflags.toInt(), netaddress, rtmenumhandle).toUInt()

public actual fun RtmCreateRouteEnum(rtmreghandle: Long, desthandle: Long, targetviews: UInt, enumflags: UInt, startdest: Long, matchingflags: UInt, criteriaroute: Long, criteriainterface: UInt, rtmenumhandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmCreateRouteEnum(rtmreghandle, desthandle, targetviews.toInt(), enumflags.toInt(), startdest, matchingflags.toInt(), criteriaroute, criteriainterface.toInt(), rtmenumhandle).toUInt()

public actual fun RtmCreateRouteList(rtmreghandle: Long, routelisthandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmCreateRouteList(rtmreghandle, routelisthandle).toUInt()

public actual fun RtmCreateRouteListEnum(rtmreghandle: Long, routelisthandle: Long, rtmenumhandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmCreateRouteListEnum(rtmreghandle, routelisthandle, rtmenumhandle).toUInt()

public actual fun RtmDeleteEnumHandle(rtmreghandle: Long, enumhandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmDeleteEnumHandle(rtmreghandle, enumhandle).toUInt()

public actual fun RtmDeleteNextHop(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmDeleteNextHop(rtmreghandle, nexthophandle, nexthopinfo).toUInt()

public actual fun RtmDeleteRouteList(rtmreghandle: Long, routelisthandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmDeleteRouteList(rtmreghandle, routelisthandle).toUInt()

public actual fun RtmDeleteRouteToDest(rtmreghandle: Long, routehandle: Long, changeflags: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmDeleteRouteToDest(rtmreghandle, routehandle, changeflags).toUInt()

public actual fun RtmDeregisterEntity(rtmreghandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmDeregisterEntity(rtmreghandle).toUInt()

public actual fun RtmDeregisterFromChangeNotification(rtmreghandle: Long, notifyhandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmDeregisterFromChangeNotification(rtmreghandle, notifyhandle).toUInt()

public actual fun RtmFindNextHop(rtmreghandle: Long, nexthopinfo: Long, nexthophandle: Long, nexthoppointer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmFindNextHop(rtmreghandle, nexthopinfo, nexthophandle, nexthoppointer).toUInt()

public actual fun RtmGetChangeStatus(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, changestatus: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmGetChangeStatus(rtmreghandle, notifyhandle, desthandle, changestatus).toUInt()

public actual fun RtmGetChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: Long, changeddests: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmGetChangedDests(rtmreghandle, notifyhandle, numdests, changeddests).toUInt()

public actual fun RtmGetDestInfo(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmGetDestInfo(rtmreghandle, desthandle, protocolid.toInt(), targetviews.toInt(), destinfo).toUInt()

public actual fun RtmGetEntityInfo(rtmreghandle: Long, entityhandle: Long, entityinfo: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmGetEntityInfo(rtmreghandle, entityhandle, entityinfo).toUInt()

public actual fun RtmGetEntityMethods(rtmreghandle: Long, entityhandle: Long, nummethods: Long, exptmethods: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmGetEntityMethods(rtmreghandle, entityhandle, nummethods, exptmethods).toUInt()

public actual fun RtmGetEnumDests(rtmreghandle: Long, enumhandle: Long, numdests: Long, destinfos: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmGetEnumDests(rtmreghandle, enumhandle, numdests, destinfos).toUInt()

public actual fun RtmGetEnumNextHops(rtmreghandle: Long, enumhandle: Long, numnexthops: Long, nexthophandles: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmGetEnumNextHops(rtmreghandle, enumhandle, numnexthops, nexthophandles).toUInt()

public actual fun RtmGetEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: Long, routehandles: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmGetEnumRoutes(rtmreghandle, enumhandle, numroutes, routehandles).toUInt()

public actual fun RtmGetExactMatchDestination(rtmreghandle: Long, destaddress: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmGetExactMatchDestination(rtmreghandle, destaddress, protocolid.toInt(), targetviews.toInt(), destinfo).toUInt()

public actual fun RtmGetExactMatchRoute(rtmreghandle: Long, destaddress: Long, matchingflags: UInt, routeinfo: Long, interfaceindex: UInt, targetviews: UInt, routehandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmGetExactMatchRoute(rtmreghandle, destaddress, matchingflags.toInt(), routeinfo, interfaceindex.toInt(), targetviews.toInt(), routehandle).toUInt()

public actual fun RtmGetLessSpecificDestination(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmGetLessSpecificDestination(rtmreghandle, desthandle, protocolid.toInt(), targetviews.toInt(), destinfo).toUInt()

public actual fun RtmGetListEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: Long, routehandles: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmGetListEnumRoutes(rtmreghandle, enumhandle, numroutes, routehandles).toUInt()

public actual fun RtmGetMostSpecificDestination(rtmreghandle: Long, destaddress: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmGetMostSpecificDestination(rtmreghandle, destaddress, protocolid.toInt(), targetviews.toInt(), destinfo).toUInt()

public actual fun RtmGetNextHopInfo(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmGetNextHopInfo(rtmreghandle, nexthophandle, nexthopinfo).toUInt()

public actual fun RtmGetNextHopPointer(rtmreghandle: Long, nexthophandle: Long, nexthoppointer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmGetNextHopPointer(rtmreghandle, nexthophandle, nexthoppointer).toUInt()

public actual fun RtmGetOpaqueInformationPointer(rtmreghandle: Long, desthandle: Long, opaqueinfopointer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmGetOpaqueInformationPointer(rtmreghandle, desthandle, opaqueinfopointer).toUInt()

public actual fun RtmGetRegisteredEntities(rtmreghandle: Long, numentities: Long, entityhandles: Long, entityinfos: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmGetRegisteredEntities(rtmreghandle, numentities, entityhandles, entityinfos).toUInt()

public actual fun RtmGetRouteInfo(rtmreghandle: Long, routehandle: Long, routeinfo: Long, destaddress: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmGetRouteInfo(rtmreghandle, routehandle, routeinfo, destaddress).toUInt()

public actual fun RtmGetRoutePointer(rtmreghandle: Long, routehandle: Long, routepointer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmGetRoutePointer(rtmreghandle, routehandle, routepointer).toUInt()

public actual fun RtmHoldDestination(rtmreghandle: Long, desthandle: Long, targetviews: UInt, holdtime: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmHoldDestination(rtmreghandle, desthandle, targetviews.toInt(), holdtime.toInt()).toUInt()

public actual fun RtmIgnoreChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmIgnoreChangedDests(rtmreghandle, notifyhandle, numdests.toInt(), changeddests).toUInt()

public actual fun RtmInsertInRouteList(rtmreghandle: Long, routelisthandle: Long, numroutes: UInt, routehandles: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmInsertInRouteList(rtmreghandle, routelisthandle, numroutes.toInt(), routehandles).toUInt()

public actual fun RtmInvokeMethod(rtmreghandle: Long, entityhandle: Long, input: Long, outputsize: Long, output: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmInvokeMethod(rtmreghandle, entityhandle, input, outputsize, output).toUInt()

public actual fun RtmIsBestRoute(rtmreghandle: Long, routehandle: Long, bestinviews: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmIsBestRoute(rtmreghandle, routehandle, bestinviews).toUInt()

public actual fun RtmIsMarkedForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, destmarked: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmIsMarkedForChangeNotification(rtmreghandle, notifyhandle, desthandle, destmarked).toUInt()

public actual fun RtmLockDestination(rtmreghandle: Long, desthandle: Long, exclusive: BOOL, lockdest: BOOL): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmLockDestination(rtmreghandle, desthandle, exclusive, lockdest).toUInt()

public actual fun RtmLockNextHop(rtmreghandle: Long, nexthophandle: Long, exclusive: BOOL, locknexthop: BOOL, nexthoppointer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmLockNextHop(rtmreghandle, nexthophandle, exclusive, locknexthop, nexthoppointer).toUInt()

public actual fun RtmLockRoute(rtmreghandle: Long, routehandle: Long, exclusive: BOOL, lockroute: BOOL, routepointer: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmLockRoute(rtmreghandle, routehandle, exclusive, lockroute, routepointer).toUInt()

public actual fun RtmMarkDestForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, markdest: BOOL): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmMarkDestForChangeNotification(rtmreghandle, notifyhandle, desthandle, markdest).toUInt()

public actual fun RtmReferenceHandles(rtmreghandle: Long, numhandles: UInt, rtmhandles: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmReferenceHandles(rtmreghandle, numhandles.toInt(), rtmhandles).toUInt()

public actual fun RtmRegisterEntity(rtmentityinfo: Long, exportmethods: Long, eventcallback: RTM_EVENT_CALLBACK, reserveopaquepointer: BOOL, rtmregprofile: Long, rtmreghandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmRegisterEntity(rtmentityinfo, exportmethods, eventcallback.toLong(), reserveopaquepointer, rtmregprofile, rtmreghandle).toUInt()

public actual fun RtmRegisterForChangeNotification(rtmreghandle: Long, targetviews: UInt, notifyflags: UInt, notifycontext: Long, notifyhandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmRegisterForChangeNotification(rtmreghandle, targetviews.toInt(), notifyflags.toInt(), notifycontext, notifyhandle).toUInt()

public actual fun RtmReleaseChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmReleaseChangedDests(rtmreghandle, notifyhandle, numdests.toInt(), changeddests).toUInt()

public actual fun RtmReleaseDestInfo(rtmreghandle: Long, destinfo: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmReleaseDestInfo(rtmreghandle, destinfo).toUInt()

public actual fun RtmReleaseDests(rtmreghandle: Long, numdests: UInt, destinfos: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmReleaseDests(rtmreghandle, numdests.toInt(), destinfos).toUInt()

public actual fun RtmReleaseEntities(rtmreghandle: Long, numentities: UInt, entityhandles: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmReleaseEntities(rtmreghandle, numentities.toInt(), entityhandles).toUInt()

public actual fun RtmReleaseEntityInfo(rtmreghandle: Long, entityinfo: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmReleaseEntityInfo(rtmreghandle, entityinfo).toUInt()

public actual fun RtmReleaseNextHopInfo(rtmreghandle: Long, nexthopinfo: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmReleaseNextHopInfo(rtmreghandle, nexthopinfo).toUInt()

public actual fun RtmReleaseNextHops(rtmreghandle: Long, numnexthops: UInt, nexthophandles: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmReleaseNextHops(rtmreghandle, numnexthops.toInt(), nexthophandles).toUInt()

public actual fun RtmReleaseRouteInfo(rtmreghandle: Long, routeinfo: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmReleaseRouteInfo(rtmreghandle, routeinfo).toUInt()

public actual fun RtmReleaseRoutes(rtmreghandle: Long, numroutes: UInt, routehandles: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmReleaseRoutes(rtmreghandle, numroutes.toInt(), routehandles).toUInt()

public actual fun RtmUpdateAndUnlockRoute(rtmreghandle: Long, routehandle: Long, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssys_windows_win32_networkmanagement_rras_RtmUpdateAndUnlockRoute(rtmreghandle, routehandle, timetolive.toInt(), routelisthandle, notifytype.toInt(), notifyhandle, changeflags).toUInt()
