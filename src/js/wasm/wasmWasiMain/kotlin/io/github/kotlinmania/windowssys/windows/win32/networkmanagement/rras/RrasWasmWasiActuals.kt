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

public actual fun mgmAddGroupMembershipEntry(hprotocol: Handle, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mgmDeRegisterMProtocol(hprotocol: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mgmDeleteGroupMembershipEntry(hprotocol: Handle, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mgmGetFirstMfe(pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, pdwnumentries: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mgmGetFirstMfeStats(pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, pdwnumentries: COpaquePointer?, dwflags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mgmGetMfe(pimm: COpaquePointer?, pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mgmGetMfeStats(pimm: COpaquePointer?, pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, dwflags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mgmGetNextMfe(pimmstart: COpaquePointer?, pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, pdwnumentries: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mgmGetNextMfeStats(pimmstart: COpaquePointer?, pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, pdwnumentries: COpaquePointer?, dwflags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mgmGetProtocolOnInterface(dwifindex: UInt, dwifnexthopaddr: UInt, pdwifprotocolid: COpaquePointer?, pdwifcomponentid: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mgmGroupEnumerationEnd(henum: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mgmGroupEnumerationGetNext(henum: Handle, pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, pdwnumentries: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mgmGroupEnumerationStart(hprotocol: Handle, metenumtype: MgmEnumTypes, phenumhandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mgmRegisterMProtocol(prpiinfo: COpaquePointer?, dwprotocolid: UInt, dwcomponentid: UInt, phprotocol: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mgmReleaseInterfaceOwnership(hprotocol: Handle, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mgmTakeInterfaceOwnership(hprotocol: Handle, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminBufferFree(pbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminConnectionClearStats(hrasserver: Long, hrasconnection: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminConnectionEnum(hrasserver: Long, dwlevel: UInt, lplpbbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminConnectionEnumEx(hrasserver: Long, pobjectheader: COpaquePointer?, dwpreferedmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, pprasconn: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminConnectionGetInfo(hrasserver: Long, dwlevel: UInt, hrasconnection: Handle, lplpbbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminConnectionGetInfoEx(hrasserver: Long, hrasconnection: Handle, prasconnection: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminConnectionRemoveQuarantine(hrasserver: Handle, hrasconnection: Handle, fisipaddress: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminDeregisterConnectionNotification(hmprserver: Long, heventnotification: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminDeviceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: COpaquePointer?, lpdwtotalentries: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminEstablishDomainRasServer(pszdomain: Pcwstr, pszmachine: Pcwstr, benable: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminGetErrorString(dwerror: UInt, lplpwserrorstring: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminGetPDCServer(lpszdomain: Pcwstr, lpszserver: Pcwstr, lpszpdcserver: Pwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminInterfaceConnect(hmprserver: Long, hinterface: Handle, hevent: Handle, fsynchronous: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminInterfaceCreate(hmprserver: Long, dwlevel: UInt, lpbbuffer: COpaquePointer?, phinterface: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminInterfaceDelete(hmprserver: Long, hinterface: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminInterfaceDeviceGetInfo(hmprserver: Long, hinterface: Handle, dwindex: UInt, dwlevel: UInt, lplpbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminInterfaceDeviceSetInfo(hmprserver: Long, hinterface: Handle, dwindex: UInt, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminInterfaceDisconnect(hmprserver: Long, hinterface: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminInterfaceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminInterfaceGetCredentials(lpwsserver: Pcwstr, lpwsinterfacename: Pcwstr, lpwsusername: Pwstr, lpwspassword: Pwstr, lpwsdomainname: Pwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminInterfaceGetCredentialsEx(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lplpbbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminInterfaceGetCustomInfoEx(hmprserver: Long, hinterface: Handle, pcustominfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminInterfaceGetHandle(hmprserver: Long, lpwsinterfacename: Pcwstr, phinterface: COpaquePointer?, fincludeclientinterfaces: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminInterfaceGetInfo(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lplpbbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminInterfaceQueryUpdateResult(hmprserver: Long, hinterface: Handle, dwprotocolid: UInt, lpdwupdateresult: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminInterfaceSetCredentials(lpwsserver: Pcwstr, lpwsinterfacename: Pcwstr, lpwsusername: Pcwstr, lpwsdomainname: Pcwstr, lpwspassword: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminInterfaceSetCredentialsEx(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminInterfaceSetCustomInfoEx(hmprserver: Long, hinterface: Handle, pcustominfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminInterfaceSetInfo(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminInterfaceTransportAdd(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, pinterfaceinfo: COpaquePointer?, dwinterfaceinfosize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminInterfaceTransportGetInfo(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, ppinterfaceinfo: COpaquePointer?, lpdwinterfaceinfosize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminInterfaceTransportRemove(hmprserver: Long, hinterface: Handle, dwtransportid: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminInterfaceTransportSetInfo(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, pinterfaceinfo: COpaquePointer?, dwinterfaceinfosize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminInterfaceUpdatePhonebookInfo(hmprserver: Long, hinterface: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminInterfaceUpdateRoutes(hmprserver: Long, hinterface: Handle, dwprotocolid: UInt, hevent: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminIsDomainRasServer(pszdomain: Pcwstr, pszmachine: Pcwstr, pbisrasserver: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminIsServiceInitialized(lpwsservername: Pcwstr, fisserviceinitialized: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminIsServiceRunning(lpwsservername: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminMIBBufferFree(pbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminMIBEntryCreate(hmibserver: Long, dwpid: UInt, dwroutingpid: UInt, lpentry: COpaquePointer?, dwentrysize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminMIBEntryDelete(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: COpaquePointer?, dwentrysize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminMIBEntryGet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: COpaquePointer?, dwinentrysize: UInt, lplpoutentry: COpaquePointer?, lpoutentrysize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminMIBEntryGetFirst(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: COpaquePointer?, dwinentrysize: UInt, lplpoutentry: COpaquePointer?, lpoutentrysize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminMIBEntryGetNext(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: COpaquePointer?, dwinentrysize: UInt, lplpoutentry: COpaquePointer?, lpoutentrysize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminMIBEntrySet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: COpaquePointer?, dwentrysize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminMIBServerConnect(lpwsservername: Pcwstr, phmibserver: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminMIBServerDisconnect(hmibserver: Long): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminPortClearStats(hrasserver: Long, hport: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminPortDisconnect(hrasserver: Long, hport: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminPortEnum(hrasserver: Long, dwlevel: UInt, hrasconnection: Handle, lplpbbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminPortGetInfo(hrasserver: Long, dwlevel: UInt, hport: Handle, lplpbbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminPortReset(hrasserver: Long, hport: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminRegisterConnectionNotification(hmprserver: Long, heventnotification: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminSendUserMessage(hmprserver: Long, hconnection: Handle, lpwszmessage: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminServerConnect(lpwsservername: Pcwstr, phmprserver: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminServerDisconnect(hmprserver: Long): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminServerGetCredentials(hmprserver: Long, dwlevel: UInt, lplpbbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminServerGetInfo(hmprserver: Long, dwlevel: UInt, lplpbbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminServerGetInfoEx(hmprserver: Long, pserverinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminServerSetCredentials(hmprserver: Long, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminServerSetInfoEx(hmprserver: Long, pserverinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminTransportCreate(hmprserver: Long, dwtransportid: UInt, lpwstransportname: Pcwstr, pglobalinfo: COpaquePointer?, dwglobalinfosize: UInt, pclientinterfaceinfo: COpaquePointer?, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminTransportGetInfo(hmprserver: Long, dwtransportid: UInt, ppglobalinfo: COpaquePointer?, lpdwglobalinfosize: COpaquePointer?, ppclientinterfaceinfo: COpaquePointer?, lpdwclientinterfaceinfosize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminTransportSetInfo(hmprserver: Long, dwtransportid: UInt, pglobalinfo: COpaquePointer?, dwglobalinfosize: UInt, pclientinterfaceinfo: COpaquePointer?, dwclientinterfaceinfosize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminUpdateConnection(hrasserver: Long, hrasconnection: Handle, prasupdateconnection: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminUserGetInfo(lpszserver: Pcwstr, lpszuser: Pcwstr, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprAdminUserSetInfo(lpszserver: Pcwstr, lpszuser: Pcwstr, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigBufferFree(pbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigFilterGetInfo(hmprconfig: Handle, dwlevel: UInt, dwtransportid: UInt, lpbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigFilterSetInfo(hmprconfig: Handle, dwlevel: UInt, dwtransportid: UInt, lpbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigGetFriendlyName(hmprconfig: Handle, pszguidname: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigGetGuidName(hmprconfig: Handle, pszfriendlyname: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigInterfaceCreate(hmprconfig: Handle, dwlevel: UInt, lpbbuffer: COpaquePointer?, phrouterinterface: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigInterfaceDelete(hmprconfig: Handle, hrouterinterface: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigInterfaceEnum(hmprconfig: Handle, dwlevel: UInt, lplpbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigInterfaceGetCustomInfoEx(hmprconfig: Handle, hrouterinterface: Handle, pcustominfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigInterfaceGetHandle(hmprconfig: Handle, lpwsinterfacename: Pcwstr, phrouterinterface: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigInterfaceGetInfo(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lplpbuffer: COpaquePointer?, lpdwbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigInterfaceSetCustomInfoEx(hmprconfig: Handle, hrouterinterface: Handle, pcustominfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigInterfaceSetInfo(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigInterfaceTransportAdd(hmprconfig: Handle, hrouterinterface: Handle, dwtransportid: UInt, lpwstransportname: Pcwstr, pinterfaceinfo: COpaquePointer?, dwinterfaceinfosize: UInt, phrouteriftransport: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigInterfaceTransportEnum(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lplpbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigInterfaceTransportGetHandle(hmprconfig: Handle, hrouterinterface: Handle, dwtransportid: UInt, phrouteriftransport: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigInterfaceTransportGetInfo(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle, ppinterfaceinfo: COpaquePointer?, lpdwinterfaceinfosize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigInterfaceTransportRemove(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigInterfaceTransportSetInfo(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle, pinterfaceinfo: COpaquePointer?, dwinterfaceinfosize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigServerBackup(hmprconfig: Handle, lpwspath: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigServerConnect(lpwsservername: Pcwstr, phmprconfig: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigServerDisconnect(hmprconfig: Handle): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigServerGetInfo(hmprconfig: Handle, dwlevel: UInt, lplpbbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigServerGetInfoEx(hmprconfig: Handle, pserverinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigServerInstall(dwlevel: UInt, pbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigServerRefresh(hmprconfig: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigServerRestore(hmprconfig: Handle, lpwspath: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigServerSetInfoEx(hmprconfig: Handle, psetserverconfig: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigTransportCreate(hmprconfig: Handle, dwtransportid: UInt, lpwstransportname: Pcwstr, pglobalinfo: COpaquePointer?, dwglobalinfosize: UInt, pclientinterfaceinfo: COpaquePointer?, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr, phroutertransport: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigTransportDelete(hmprconfig: Handle, hroutertransport: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigTransportEnum(hmprconfig: Handle, dwlevel: UInt, lplpbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigTransportGetHandle(hmprconfig: Handle, dwtransportid: UInt, phroutertransport: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigTransportGetInfo(hmprconfig: Handle, hroutertransport: Handle, ppglobalinfo: COpaquePointer?, lpdwglobalinfosize: COpaquePointer?, ppclientinterfaceinfo: COpaquePointer?, lpdwclientinterfaceinfosize: COpaquePointer?, lplpwsdllpath: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprConfigTransportSetInfo(hmprconfig: Handle, hroutertransport: Handle, pglobalinfo: COpaquePointer?, dwglobalinfosize: UInt, pclientinterfaceinfo: COpaquePointer?, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprInfoBlockAdd(lpheader: COpaquePointer?, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: COpaquePointer?, lplpnewheader: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprInfoBlockFind(lpheader: COpaquePointer?, dwinfotype: UInt, lpdwitemsize: COpaquePointer?, lpdwitemcount: COpaquePointer?, lplpitemdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprInfoBlockQuerySize(lpheader: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprInfoBlockRemove(lpheader: COpaquePointer?, dwinfotype: UInt, lplpnewheader: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprInfoBlockSet(lpheader: COpaquePointer?, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: COpaquePointer?, lplpnewheader: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprInfoCreate(dwversion: UInt, lplpnewheader: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprInfoDelete(lpheader: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprInfoDuplicate(lpheader: COpaquePointer?, lplpnewheader: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprInfoRemoveAll(lpheader: COpaquePointer?, lplpnewheader: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasClearConnectionStatistics(hrasconn: Hrasconn): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasClearLinkStatistics(hrasconn: Hrasconn, dwsubentry: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasConnectionNotificationA(param0: Hrasconn, param1: Handle, param2: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasConnectionNotificationW(param0: Hrasconn, param1: Handle, param2: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasCreatePhonebookEntryA(param0: Hwnd, param1: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasCreatePhonebookEntryW(param0: Hwnd, param1: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasDeleteEntryA(param0: Pcstr, param1: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasDeleteEntryW(param0: Pcwstr, param1: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasDeleteSubEntryA(pszphonebook: Pcstr, pszentry: Pcstr, dwsubentryid: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasDeleteSubEntryW(pszphonebook: Pcwstr, pszentry: Pcwstr, dwsubentryid: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasDialA(param0: COpaquePointer?, param1: Pcstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?, param5: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasDialDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpszphonenumber: Pcstr, lpinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasDialDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpszphonenumber: Pcwstr, lpinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasDialW(param0: COpaquePointer?, param1: Pcwstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?, param5: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasEditPhonebookEntryA(param0: Hwnd, param1: Pcstr, param2: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasEditPhonebookEntryW(param0: Hwnd, param1: Pcwstr, param2: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasEntryDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasEntryDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasEnumAutodialAddressesA(lpprasautodialaddresses: COpaquePointer?, lpdwcbrasautodialaddresses: COpaquePointer?, lpdwcrasautodialaddresses: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasEnumAutodialAddressesW(lpprasautodialaddresses: COpaquePointer?, lpdwcbrasautodialaddresses: COpaquePointer?, lpdwcrasautodialaddresses: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasEnumConnectionsA(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasEnumConnectionsW(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasEnumDevicesA(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasEnumDevicesW(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasEnumEntriesA(param0: Pcstr, param1: Pcstr, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasEnumEntriesW(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasFreeEapUserIdentityA(praseapuseridentity: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasFreeEapUserIdentityW(praseapuseridentity: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetAutodialAddressA(param0: Pcstr, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetAutodialAddressW(param0: Pcwstr, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetAutodialEnableA(param0: UInt, param1: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetAutodialEnableW(param0: UInt, param1: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetAutodialParamA(param0: UInt, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetAutodialParamW(param0: UInt, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetConnectStatusA(param0: Hrasconn, param1: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetConnectStatusW(param0: Hrasconn, param1: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetConnectionStatistics(hrasconn: Hrasconn, lpstatistics: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetCountryInfoA(param0: COpaquePointer?, param1: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetCountryInfoW(param0: COpaquePointer?, param1: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetCredentialsA(param0: Pcstr, param1: Pcstr, param2: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetCredentialsW(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetCustomAuthDataA(pszphonebook: Pcstr, pszentry: Pcstr, pbcustomauthdata: COpaquePointer?, pdwsizeofcustomauthdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetCustomAuthDataW(pszphonebook: Pcwstr, pszentry: Pcwstr, pbcustomauthdata: COpaquePointer?, pdwsizeofcustomauthdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetEapUserDataA(htoken: Handle, pszphonebook: Pcstr, pszentry: Pcstr, pbeapdata: COpaquePointer?, pdwsizeofeapdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetEapUserDataW(htoken: Handle, pszphonebook: Pcwstr, pszentry: Pcwstr, pbeapdata: COpaquePointer?, pdwsizeofeapdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetEapUserIdentityA(pszphonebook: Pcstr, pszentry: Pcstr, dwflags: UInt, hwnd: Hwnd, ppraseapuseridentity: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetEapUserIdentityW(pszphonebook: Pcwstr, pszentry: Pcwstr, dwflags: UInt, hwnd: Hwnd, ppraseapuseridentity: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetEntryDialParamsA(param0: Pcstr, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetEntryDialParamsW(param0: Pcwstr, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetErrorStringA(resourceid: UInt, lpszstring: Pstr, inbufsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetErrorStringW(resourceid: UInt, lpszstring: Pwstr, inbufsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetLinkStatistics(hrasconn: Hrasconn, dwsubentry: UInt, lpstatistics: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetPCscf(lpszpcscf: Pwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetProjectionInfoA(param0: Hrasconn, param1: Rasprojection, param2: COpaquePointer?, param3: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetProjectionInfoEx(hrasconn: Hrasconn, prasprojection: COpaquePointer?, lpdwsize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetProjectionInfoW(param0: Hrasconn, param1: Rasprojection, param2: COpaquePointer?, param3: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetSubEntryHandleA(param0: Hrasconn, param1: UInt, param2: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetSubEntryHandleW(param0: Hrasconn, param1: UInt, param2: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetSubEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: UInt, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?, param6: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasGetSubEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: UInt, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?, param6: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasHangUpA(param0: Hrasconn): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasHangUpW(param0: Hrasconn): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasInvokeEapUI(param0: Hrasconn, param1: UInt, param2: COpaquePointer?, param3: Hwnd): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasPhonebookDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasPhonebookDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasRenameEntryA(param0: Pcstr, param1: Pcstr, param2: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasRenameEntryW(param0: Pcwstr, param1: Pcwstr, param2: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasSetAutodialAddressA(param0: Pcstr, param1: UInt, param2: COpaquePointer?, param3: UInt, param4: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasSetAutodialAddressW(param0: Pcwstr, param1: UInt, param2: COpaquePointer?, param3: UInt, param4: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasSetAutodialEnableA(param0: UInt, param1: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasSetAutodialEnableW(param0: UInt, param1: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasSetAutodialParamA(param0: UInt, param1: COpaquePointer?, param2: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasSetAutodialParamW(param0: UInt, param1: COpaquePointer?, param2: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasSetCredentialsA(param0: Pcstr, param1: Pcstr, param2: COpaquePointer?, param3: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasSetCredentialsW(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?, param3: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasSetCustomAuthDataA(pszphonebook: Pcstr, pszentry: Pcstr, pbcustomauthdata: COpaquePointer?, dwsizeofcustomauthdata: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasSetCustomAuthDataW(pszphonebook: Pcwstr, pszentry: Pcwstr, pbcustomauthdata: COpaquePointer?, dwsizeofcustomauthdata: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasSetEapUserDataA(htoken: Handle, pszphonebook: Pcstr, pszentry: Pcstr, pbeapdata: COpaquePointer?, dwsizeofeapdata: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasSetEapUserDataW(htoken: Handle, pszphonebook: Pcwstr, pszentry: Pcwstr, pbeapdata: COpaquePointer?, dwsizeofeapdata: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasSetEntryDialParamsA(param0: Pcstr, param1: COpaquePointer?, param2: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasSetEntryDialParamsW(param0: Pcwstr, param1: COpaquePointer?, param2: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasSetEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?, param5: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasSetEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?, param5: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasSetSubEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: UInt, param3: COpaquePointer?, param4: UInt, param5: COpaquePointer?, param6: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasSetSubEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: UInt, param3: COpaquePointer?, param4: UInt, param5: COpaquePointer?, param6: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasUpdateConnection(hrasconn: Hrasconn, lprasupdateconn: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasValidateEntryNameA(param0: Pcstr, param1: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rasValidateEntryNameW(param0: Pcwstr, param1: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmAddNextHop(rtmreghandle: Long, nexthopinfo: COpaquePointer?, nexthophandle: COpaquePointer?, changeflags: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmAddRouteToDest(rtmreghandle: Long, routehandle: COpaquePointer?, destaddress: COpaquePointer?, routeinfo: COpaquePointer?, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmBlockMethods(rtmreghandle: Long, targethandle: Handle, targettype: UByte, blockingflag: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmConvertIpv6AddressAndLengthToNetAddress(pnetaddress: COpaquePointer?, address: In6Addr, dwlength: UInt, dwaddresssize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmConvertNetAddressToIpv6AddressAndLength(pnetaddress: COpaquePointer?, paddress: COpaquePointer?, plength: COpaquePointer?, dwaddresssize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmCreateDestEnum(rtmreghandle: Long, targetviews: UInt, enumflags: UInt, netaddress: COpaquePointer?, protocolid: UInt, rtmenumhandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmCreateNextHopEnum(rtmreghandle: Long, enumflags: UInt, netaddress: COpaquePointer?, rtmenumhandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmCreateRouteEnum(rtmreghandle: Long, desthandle: Long, targetviews: UInt, enumflags: UInt, startdest: COpaquePointer?, matchingflags: UInt, criteriaroute: COpaquePointer?, criteriainterface: UInt, rtmenumhandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmCreateRouteList(rtmreghandle: Long, routelisthandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmCreateRouteListEnum(rtmreghandle: Long, routelisthandle: Long, rtmenumhandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmDeleteEnumHandle(rtmreghandle: Long, enumhandle: Long): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmDeleteNextHop(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmDeleteRouteList(rtmreghandle: Long, routelisthandle: Long): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmDeleteRouteToDest(rtmreghandle: Long, routehandle: Long, changeflags: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmDeregisterEntity(rtmreghandle: Long): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmDeregisterFromChangeNotification(rtmreghandle: Long, notifyhandle: Long): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmFindNextHop(rtmreghandle: Long, nexthopinfo: COpaquePointer?, nexthophandle: COpaquePointer?, nexthoppointer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmGetChangeStatus(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, changestatus: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmGetChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: COpaquePointer?, changeddests: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmGetDestInfo(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmGetEntityInfo(rtmreghandle: Long, entityhandle: Long, entityinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmGetEntityMethods(rtmreghandle: Long, entityhandle: Long, nummethods: COpaquePointer?, exptmethods: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmGetEnumDests(rtmreghandle: Long, enumhandle: Long, numdests: COpaquePointer?, destinfos: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmGetEnumNextHops(rtmreghandle: Long, enumhandle: Long, numnexthops: COpaquePointer?, nexthophandles: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmGetEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: COpaquePointer?, routehandles: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmGetExactMatchDestination(rtmreghandle: Long, destaddress: COpaquePointer?, protocolid: UInt, targetviews: UInt, destinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmGetExactMatchRoute(rtmreghandle: Long, destaddress: COpaquePointer?, matchingflags: UInt, routeinfo: COpaquePointer?, interfaceindex: UInt, targetviews: UInt, routehandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmGetLessSpecificDestination(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmGetListEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: COpaquePointer?, routehandles: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmGetMostSpecificDestination(rtmreghandle: Long, destaddress: COpaquePointer?, protocolid: UInt, targetviews: UInt, destinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmGetNextHopInfo(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmGetNextHopPointer(rtmreghandle: Long, nexthophandle: Long, nexthoppointer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmGetOpaqueInformationPointer(rtmreghandle: Long, desthandle: Long, opaqueinfopointer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmGetRegisteredEntities(rtmreghandle: Long, numentities: COpaquePointer?, entityhandles: COpaquePointer?, entityinfos: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmGetRouteInfo(rtmreghandle: Long, routehandle: Long, routeinfo: COpaquePointer?, destaddress: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmGetRoutePointer(rtmreghandle: Long, routehandle: Long, routepointer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmHoldDestination(rtmreghandle: Long, desthandle: Long, targetviews: UInt, holdtime: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmIgnoreChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmInsertInRouteList(rtmreghandle: Long, routelisthandle: Long, numroutes: UInt, routehandles: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmInvokeMethod(rtmreghandle: Long, entityhandle: Long, input: COpaquePointer?, outputsize: COpaquePointer?, output: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmIsBestRoute(rtmreghandle: Long, routehandle: Long, bestinviews: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmIsMarkedForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, destmarked: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmLockDestination(rtmreghandle: Long, desthandle: Long, exclusive: Bool, lockdest: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmLockNextHop(rtmreghandle: Long, nexthophandle: Long, exclusive: Bool, locknexthop: Bool, nexthoppointer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmLockRoute(rtmreghandle: Long, routehandle: Long, exclusive: Bool, lockroute: Bool, routepointer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmMarkDestForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, markdest: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmReferenceHandles(rtmreghandle: Long, numhandles: UInt, rtmhandles: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmRegisterEntity(rtmentityinfo: COpaquePointer?, exportmethods: COpaquePointer?, eventcallback: RtmEventCallback, reserveopaquepointer: Bool, rtmregprofile: COpaquePointer?, rtmreghandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmRegisterForChangeNotification(rtmreghandle: Long, targetviews: UInt, notifyflags: UInt, notifycontext: COpaquePointer?, notifyhandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmReleaseChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmReleaseDestInfo(rtmreghandle: Long, destinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmReleaseDests(rtmreghandle: Long, numdests: UInt, destinfos: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmReleaseEntities(rtmreghandle: Long, numentities: UInt, entityhandles: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmReleaseEntityInfo(rtmreghandle: Long, entityinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmReleaseNextHopInfo(rtmreghandle: Long, nexthopinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmReleaseNextHops(rtmreghandle: Long, numnexthops: UInt, nexthophandles: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmReleaseRouteInfo(rtmreghandle: Long, routeinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmReleaseRoutes(rtmreghandle: Long, numroutes: UInt, routehandles: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtmUpdateAndUnlockRoute(rtmreghandle: Long, routehandle: Long, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
