package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(rtmreghandle: Long, eventtype: RTM_EVENT_TYPE, context1: Long, context2: Long): UInt
}

public fun MgmAddGroupMembershipEntry(hprotocol: Foundation.HANDLE, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "MgmAddGroupMembershipEntry", longArrayOf(Win32DynamicFfi.objectSlot(hprotocol), dwsourceaddr.toLong(), dwsourcemask.toLong(), dwgroupaddr.toLong(), dwgroupmask.toLong(), dwifindex.toLong(), dwifnexthopipaddr.toLong(), dwflags.toLong())).toUInt()
}

public fun MgmDeRegisterMProtocol(hprotocol: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "MgmDeRegisterMProtocol", longArrayOf(Win32DynamicFfi.objectSlot(hprotocol))).toUInt()
}

public fun MgmDeleteGroupMembershipEntry(hprotocol: Foundation.HANDLE, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "MgmDeleteGroupMembershipEntry", longArrayOf(Win32DynamicFfi.objectSlot(hprotocol), dwsourceaddr.toLong(), dwsourcemask.toLong(), dwgroupaddr.toLong(), dwgroupmask.toLong(), dwifindex.toLong(), dwifnexthopipaddr.toLong(), dwflags.toLong())).toUInt()
}

public fun MgmGetFirstMfe(pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "MgmGetFirstMfe", longArrayOf(pdwbuffersize, pbbuffer, pdwnumentries)).toUInt()
}

public fun MgmGetFirstMfeStats(pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "MgmGetFirstMfeStats", longArrayOf(pdwbuffersize, pbbuffer, pdwnumentries, dwflags.toLong())).toUInt()
}

public fun MgmGetMfe(pimm: Long, pdwbuffersize: Long, pbbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "MgmGetMfe", longArrayOf(pimm, pdwbuffersize, pbbuffer)).toUInt()
}

public fun MgmGetMfeStats(pimm: Long, pdwbuffersize: Long, pbbuffer: Long, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "MgmGetMfeStats", longArrayOf(pimm, pdwbuffersize, pbbuffer, dwflags.toLong())).toUInt()
}

public fun MgmGetNextMfe(pimmstart: Long, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "MgmGetNextMfe", longArrayOf(pimmstart, pdwbuffersize, pbbuffer, pdwnumentries)).toUInt()
}

public fun MgmGetNextMfeStats(pimmstart: Long, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "MgmGetNextMfeStats", longArrayOf(pimmstart, pdwbuffersize, pbbuffer, pdwnumentries, dwflags.toLong())).toUInt()
}

public fun MgmGetProtocolOnInterface(dwifindex: UInt, dwifnexthopaddr: UInt, pdwifprotocolid: Long, pdwifcomponentid: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "MgmGetProtocolOnInterface", longArrayOf(dwifindex.toLong(), dwifnexthopaddr.toLong(), pdwifprotocolid, pdwifcomponentid)).toUInt()
}

public fun MgmGroupEnumerationEnd(henum: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "MgmGroupEnumerationEnd", longArrayOf(Win32DynamicFfi.objectSlot(henum))).toUInt()
}

public fun MgmGroupEnumerationGetNext(henum: Foundation.HANDLE, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "MgmGroupEnumerationGetNext", longArrayOf(Win32DynamicFfi.objectSlot(henum), pdwbuffersize, pbbuffer, pdwnumentries)).toUInt()
}

public fun MgmGroupEnumerationStart(hprotocol: Foundation.HANDLE, metenumtype: MGM_ENUM_TYPES, phenumhandle: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "MgmGroupEnumerationStart", longArrayOf(Win32DynamicFfi.objectSlot(hprotocol), metenumtype.toLong(), phenumhandle)).toUInt()
}

public fun MgmRegisterMProtocol(prpiinfo: Long, dwprotocolid: UInt, dwcomponentid: UInt, phprotocol: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "MgmRegisterMProtocol", longArrayOf(prpiinfo, dwprotocolid.toLong(), dwcomponentid.toLong(), phprotocol)).toUInt()
}

public fun MgmReleaseInterfaceOwnership(hprotocol: Foundation.HANDLE, dwifindex: UInt, dwifnexthopaddr: UInt): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "MgmReleaseInterfaceOwnership", longArrayOf(Win32DynamicFfi.objectSlot(hprotocol), dwifindex.toLong(), dwifnexthopaddr.toLong())).toUInt()
}

public fun MgmTakeInterfaceOwnership(hprotocol: Foundation.HANDLE, dwifindex: UInt, dwifnexthopaddr: UInt): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "MgmTakeInterfaceOwnership", longArrayOf(Win32DynamicFfi.objectSlot(hprotocol), dwifindex.toLong(), dwifnexthopaddr.toLong())).toUInt()
}

public fun MprAdminBufferFree(pbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminBufferFree", longArrayOf(pbuffer)).toUInt()
}

public fun MprAdminConnectionClearStats(hrasserver: Long, hrasconnection: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminConnectionClearStats", longArrayOf(hrasserver, Win32DynamicFfi.objectSlot(hrasconnection))).toUInt()
}

public fun MprAdminConnectionEnum(hrasserver: Long, dwlevel: UInt, lplpbbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminConnectionEnum", longArrayOf(hrasserver, dwlevel.toLong(), lplpbbuffer, dwprefmaxlen.toLong(), lpdwentriesread, lpdwtotalentries, lpdwresumehandle)).toUInt()
}

public fun MprAdminConnectionEnumEx(hrasserver: Long, pobjectheader: Long, dwpreferedmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, pprasconn: Long, lpdwresumehandle: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminConnectionEnumEx", longArrayOf(hrasserver, pobjectheader, dwpreferedmaxlen.toLong(), lpdwentriesread, lpdwtotalentries, pprasconn, lpdwresumehandle)).toUInt()
}

public fun MprAdminConnectionGetInfo(hrasserver: Long, dwlevel: UInt, hrasconnection: Foundation.HANDLE, lplpbbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminConnectionGetInfo", longArrayOf(hrasserver, dwlevel.toLong(), Win32DynamicFfi.objectSlot(hrasconnection), lplpbbuffer)).toUInt()
}

public fun MprAdminConnectionGetInfoEx(hrasserver: Long, hrasconnection: Foundation.HANDLE, prasconnection: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminConnectionGetInfoEx", longArrayOf(hrasserver, Win32DynamicFfi.objectSlot(hrasconnection), prasconnection)).toUInt()
}

public fun MprAdminConnectionRemoveQuarantine(hrasserver: Foundation.HANDLE, hrasconnection: Foundation.HANDLE, fisipaddress: BOOL): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminConnectionRemoveQuarantine", longArrayOf(Win32DynamicFfi.objectSlot(hrasserver), Win32DynamicFfi.objectSlot(hrasconnection), fisipaddress.toLong())).toUInt()
}

public fun MprAdminDeregisterConnectionNotification(hmprserver: Long, heventnotification: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminDeregisterConnectionNotification", longArrayOf(hmprserver, Win32DynamicFfi.objectSlot(heventnotification))).toUInt()
}

public fun MprAdminDeviceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long, lpdwtotalentries: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminDeviceEnum", longArrayOf(hmprserver, dwlevel.toLong(), lplpbbuffer, lpdwtotalentries)).toUInt()
}

public fun MprAdminEstablishDomainRasServer(pszdomain: PCWSTR, pszmachine: PCWSTR, benable: BOOL): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminEstablishDomainRasServer", longArrayOf(pszdomain, pszmachine, benable.toLong())).toUInt()
}

public fun MprAdminGetErrorString(dwerror: UInt, lplpwserrorstring: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminGetErrorString", longArrayOf(dwerror.toLong(), lplpwserrorstring)).toUInt()
}

public fun MprAdminGetPDCServer(lpszdomain: PCWSTR, lpszserver: PCWSTR, lpszpdcserver: PWSTR): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminGetPDCServer", longArrayOf(lpszdomain, lpszserver, lpszpdcserver)).toUInt()
}

public fun MprAdminInterfaceConnect(hmprserver: Long, hinterface: Foundation.HANDLE, hevent: Foundation.HANDLE, fsynchronous: BOOL): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminInterfaceConnect", longArrayOf(hmprserver, Win32DynamicFfi.objectSlot(hinterface), Win32DynamicFfi.objectSlot(hevent), fsynchronous.toLong())).toUInt()
}

public fun MprAdminInterfaceCreate(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long, phinterface: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminInterfaceCreate", longArrayOf(hmprserver, dwlevel.toLong(), lpbbuffer, phinterface)).toUInt()
}

public fun MprAdminInterfaceDelete(hmprserver: Long, hinterface: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminInterfaceDelete", longArrayOf(hmprserver, Win32DynamicFfi.objectSlot(hinterface))).toUInt()
}

public fun MprAdminInterfaceDeviceGetInfo(hmprserver: Long, hinterface: Foundation.HANDLE, dwindex: UInt, dwlevel: UInt, lplpbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminInterfaceDeviceGetInfo", longArrayOf(hmprserver, Win32DynamicFfi.objectSlot(hinterface), dwindex.toLong(), dwlevel.toLong(), lplpbuffer)).toUInt()
}

public fun MprAdminInterfaceDeviceSetInfo(hmprserver: Long, hinterface: Foundation.HANDLE, dwindex: UInt, dwlevel: UInt, lpbbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminInterfaceDeviceSetInfo", longArrayOf(hmprserver, Win32DynamicFfi.objectSlot(hinterface), dwindex.toLong(), dwlevel.toLong(), lpbbuffer)).toUInt()
}

public fun MprAdminInterfaceDisconnect(hmprserver: Long, hinterface: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminInterfaceDisconnect", longArrayOf(hmprserver, Win32DynamicFfi.objectSlot(hinterface))).toUInt()
}

public fun MprAdminInterfaceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminInterfaceEnum", longArrayOf(hmprserver, dwlevel.toLong(), lplpbbuffer, dwprefmaxlen.toLong(), lpdwentriesread, lpdwtotalentries, lpdwresumehandle)).toUInt()
}

public fun MprAdminInterfaceGetCredentials(lpwsserver: PCWSTR, lpwsinterfacename: PCWSTR, lpwsusername: PWSTR, lpwspassword: PWSTR, lpwsdomainname: PWSTR): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminInterfaceGetCredentials", longArrayOf(lpwsserver, lpwsinterfacename, lpwsusername, lpwspassword, lpwsdomainname)).toUInt()
}

public fun MprAdminInterfaceGetCredentialsEx(hmprserver: Long, hinterface: Foundation.HANDLE, dwlevel: UInt, lplpbbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminInterfaceGetCredentialsEx", longArrayOf(hmprserver, Win32DynamicFfi.objectSlot(hinterface), dwlevel.toLong(), lplpbbuffer)).toUInt()
}

public fun MprAdminInterfaceGetCustomInfoEx(hmprserver: Long, hinterface: Foundation.HANDLE, pcustominfo: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminInterfaceGetCustomInfoEx", longArrayOf(hmprserver, Win32DynamicFfi.objectSlot(hinterface), pcustominfo)).toUInt()
}

public fun MprAdminInterfaceGetHandle(hmprserver: Long, lpwsinterfacename: PCWSTR, phinterface: Long, fincludeclientinterfaces: BOOL): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminInterfaceGetHandle", longArrayOf(hmprserver, lpwsinterfacename, phinterface, fincludeclientinterfaces.toLong())).toUInt()
}

public fun MprAdminInterfaceGetInfo(hmprserver: Long, hinterface: Foundation.HANDLE, dwlevel: UInt, lplpbbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminInterfaceGetInfo", longArrayOf(hmprserver, Win32DynamicFfi.objectSlot(hinterface), dwlevel.toLong(), lplpbbuffer)).toUInt()
}

public fun MprAdminInterfaceQueryUpdateResult(hmprserver: Long, hinterface: Foundation.HANDLE, dwprotocolid: UInt, lpdwupdateresult: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminInterfaceQueryUpdateResult", longArrayOf(hmprserver, Win32DynamicFfi.objectSlot(hinterface), dwprotocolid.toLong(), lpdwupdateresult)).toUInt()
}

public fun MprAdminInterfaceSetCredentials(lpwsserver: PCWSTR, lpwsinterfacename: PCWSTR, lpwsusername: PCWSTR, lpwsdomainname: PCWSTR, lpwspassword: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminInterfaceSetCredentials", longArrayOf(lpwsserver, lpwsinterfacename, lpwsusername, lpwsdomainname, lpwspassword)).toUInt()
}

public fun MprAdminInterfaceSetCredentialsEx(hmprserver: Long, hinterface: Foundation.HANDLE, dwlevel: UInt, lpbbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminInterfaceSetCredentialsEx", longArrayOf(hmprserver, Win32DynamicFfi.objectSlot(hinterface), dwlevel.toLong(), lpbbuffer)).toUInt()
}

public fun MprAdminInterfaceSetCustomInfoEx(hmprserver: Long, hinterface: Foundation.HANDLE, pcustominfo: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminInterfaceSetCustomInfoEx", longArrayOf(hmprserver, Win32DynamicFfi.objectSlot(hinterface), pcustominfo)).toUInt()
}

public fun MprAdminInterfaceSetInfo(hmprserver: Long, hinterface: Foundation.HANDLE, dwlevel: UInt, lpbbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminInterfaceSetInfo", longArrayOf(hmprserver, Win32DynamicFfi.objectSlot(hinterface), dwlevel.toLong(), lpbbuffer)).toUInt()
}

public fun MprAdminInterfaceTransportAdd(hmprserver: Long, hinterface: Foundation.HANDLE, dwtransportid: UInt, pinterfaceinfo: Long, dwinterfaceinfosize: UInt): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminInterfaceTransportAdd", longArrayOf(hmprserver, Win32DynamicFfi.objectSlot(hinterface), dwtransportid.toLong(), pinterfaceinfo, dwinterfaceinfosize.toLong())).toUInt()
}

public fun MprAdminInterfaceTransportGetInfo(hmprserver: Long, hinterface: Foundation.HANDLE, dwtransportid: UInt, ppinterfaceinfo: Long, lpdwinterfaceinfosize: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminInterfaceTransportGetInfo", longArrayOf(hmprserver, Win32DynamicFfi.objectSlot(hinterface), dwtransportid.toLong(), ppinterfaceinfo, lpdwinterfaceinfosize)).toUInt()
}

public fun MprAdminInterfaceTransportRemove(hmprserver: Long, hinterface: Foundation.HANDLE, dwtransportid: UInt): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminInterfaceTransportRemove", longArrayOf(hmprserver, Win32DynamicFfi.objectSlot(hinterface), dwtransportid.toLong())).toUInt()
}

public fun MprAdminInterfaceTransportSetInfo(hmprserver: Long, hinterface: Foundation.HANDLE, dwtransportid: UInt, pinterfaceinfo: Long, dwinterfaceinfosize: UInt): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminInterfaceTransportSetInfo", longArrayOf(hmprserver, Win32DynamicFfi.objectSlot(hinterface), dwtransportid.toLong(), pinterfaceinfo, dwinterfaceinfosize.toLong())).toUInt()
}

public fun MprAdminInterfaceUpdatePhonebookInfo(hmprserver: Long, hinterface: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminInterfaceUpdatePhonebookInfo", longArrayOf(hmprserver, Win32DynamicFfi.objectSlot(hinterface))).toUInt()
}

public fun MprAdminInterfaceUpdateRoutes(hmprserver: Long, hinterface: Foundation.HANDLE, dwprotocolid: UInt, hevent: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminInterfaceUpdateRoutes", longArrayOf(hmprserver, Win32DynamicFfi.objectSlot(hinterface), dwprotocolid.toLong(), Win32DynamicFfi.objectSlot(hevent))).toUInt()
}

public fun MprAdminIsDomainRasServer(pszdomain: PCWSTR, pszmachine: PCWSTR, pbisrasserver: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminIsDomainRasServer", longArrayOf(pszdomain, pszmachine, pbisrasserver)).toUInt()
}

public fun MprAdminIsServiceInitialized(lpwsservername: PCWSTR, fisserviceinitialized: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminIsServiceInitialized", longArrayOf(lpwsservername, fisserviceinitialized)).toUInt()
}

public fun MprAdminIsServiceRunning(lpwsservername: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminIsServiceRunning", longArrayOf(lpwsservername)).toInt()
}

public fun MprAdminMIBBufferFree(pbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminMIBBufferFree", longArrayOf(pbuffer)).toUInt()
}

public fun MprAdminMIBEntryCreate(hmibserver: Long, dwpid: UInt, dwroutingpid: UInt, lpentry: Long, dwentrysize: UInt): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminMIBEntryCreate", longArrayOf(hmibserver, dwpid.toLong(), dwroutingpid.toLong(), lpentry, dwentrysize.toLong())).toUInt()
}

public fun MprAdminMIBEntryDelete(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: Long, dwentrysize: UInt): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminMIBEntryDelete", longArrayOf(hmibserver, dwprotocolid.toLong(), dwroutingpid.toLong(), lpentry, dwentrysize.toLong())).toUInt()
}

public fun MprAdminMIBEntryGet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: Long, dwinentrysize: UInt, lplpoutentry: Long, lpoutentrysize: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminMIBEntryGet", longArrayOf(hmibserver, dwprotocolid.toLong(), dwroutingpid.toLong(), lpinentry, dwinentrysize.toLong(), lplpoutentry, lpoutentrysize)).toUInt()
}

public fun MprAdminMIBEntryGetFirst(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: Long, dwinentrysize: UInt, lplpoutentry: Long, lpoutentrysize: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminMIBEntryGetFirst", longArrayOf(hmibserver, dwprotocolid.toLong(), dwroutingpid.toLong(), lpinentry, dwinentrysize.toLong(), lplpoutentry, lpoutentrysize)).toUInt()
}

public fun MprAdminMIBEntryGetNext(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: Long, dwinentrysize: UInt, lplpoutentry: Long, lpoutentrysize: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminMIBEntryGetNext", longArrayOf(hmibserver, dwprotocolid.toLong(), dwroutingpid.toLong(), lpinentry, dwinentrysize.toLong(), lplpoutentry, lpoutentrysize)).toUInt()
}

public fun MprAdminMIBEntrySet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: Long, dwentrysize: UInt): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminMIBEntrySet", longArrayOf(hmibserver, dwprotocolid.toLong(), dwroutingpid.toLong(), lpentry, dwentrysize.toLong())).toUInt()
}

public fun MprAdminMIBServerConnect(lpwsservername: PCWSTR, phmibserver: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminMIBServerConnect", longArrayOf(lpwsservername, phmibserver)).toUInt()
}

public fun MprAdminMIBServerDisconnect(hmibserver: Long) {
    Win32DynamicFfi.invoke("mprapi.dll", "MprAdminMIBServerDisconnect", longArrayOf(hmibserver))
}

public fun MprAdminPortClearStats(hrasserver: Long, hport: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminPortClearStats", longArrayOf(hrasserver, Win32DynamicFfi.objectSlot(hport))).toUInt()
}

public fun MprAdminPortDisconnect(hrasserver: Long, hport: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminPortDisconnect", longArrayOf(hrasserver, Win32DynamicFfi.objectSlot(hport))).toUInt()
}

public fun MprAdminPortEnum(hrasserver: Long, dwlevel: UInt, hrasconnection: Foundation.HANDLE, lplpbbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminPortEnum", longArrayOf(hrasserver, dwlevel.toLong(), Win32DynamicFfi.objectSlot(hrasconnection), lplpbbuffer, dwprefmaxlen.toLong(), lpdwentriesread, lpdwtotalentries, lpdwresumehandle)).toUInt()
}

public fun MprAdminPortGetInfo(hrasserver: Long, dwlevel: UInt, hport: Foundation.HANDLE, lplpbbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminPortGetInfo", longArrayOf(hrasserver, dwlevel.toLong(), Win32DynamicFfi.objectSlot(hport), lplpbbuffer)).toUInt()
}

public fun MprAdminPortReset(hrasserver: Long, hport: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminPortReset", longArrayOf(hrasserver, Win32DynamicFfi.objectSlot(hport))).toUInt()
}

public fun MprAdminRegisterConnectionNotification(hmprserver: Long, heventnotification: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminRegisterConnectionNotification", longArrayOf(hmprserver, Win32DynamicFfi.objectSlot(heventnotification))).toUInt()
}

public fun MprAdminSendUserMessage(hmprserver: Long, hconnection: Foundation.HANDLE, lpwszmessage: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminSendUserMessage", longArrayOf(hmprserver, Win32DynamicFfi.objectSlot(hconnection), lpwszmessage)).toUInt()
}

public fun MprAdminServerConnect(lpwsservername: PCWSTR, phmprserver: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminServerConnect", longArrayOf(lpwsservername, phmprserver)).toUInt()
}

public fun MprAdminServerDisconnect(hmprserver: Long) {
    Win32DynamicFfi.invoke("mprapi.dll", "MprAdminServerDisconnect", longArrayOf(hmprserver))
}

public fun MprAdminServerGetCredentials(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminServerGetCredentials", longArrayOf(hmprserver, dwlevel.toLong(), lplpbbuffer)).toUInt()
}

public fun MprAdminServerGetInfo(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminServerGetInfo", longArrayOf(hmprserver, dwlevel.toLong(), lplpbbuffer)).toUInt()
}

public fun MprAdminServerGetInfoEx(hmprserver: Long, pserverinfo: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminServerGetInfoEx", longArrayOf(hmprserver, pserverinfo)).toUInt()
}

public fun MprAdminServerSetCredentials(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminServerSetCredentials", longArrayOf(hmprserver, dwlevel.toLong(), lpbbuffer)).toUInt()
}

public fun MprAdminServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminServerSetInfo", longArrayOf(hmprserver, dwlevel.toLong(), lpbbuffer)).toUInt()
}

public fun MprAdminServerSetInfoEx(hmprserver: Long, pserverinfo: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminServerSetInfoEx", longArrayOf(hmprserver, pserverinfo)).toUInt()
}

public fun MprAdminTransportCreate(hmprserver: Long, dwtransportid: UInt, lpwstransportname: PCWSTR, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt, lpwsdllpath: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminTransportCreate", longArrayOf(hmprserver, dwtransportid.toLong(), lpwstransportname, pglobalinfo, dwglobalinfosize.toLong(), pclientinterfaceinfo, dwclientinterfaceinfosize.toLong(), lpwsdllpath)).toUInt()
}

public fun MprAdminTransportGetInfo(hmprserver: Long, dwtransportid: UInt, ppglobalinfo: Long, lpdwglobalinfosize: Long, ppclientinterfaceinfo: Long, lpdwclientinterfaceinfosize: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminTransportGetInfo", longArrayOf(hmprserver, dwtransportid.toLong(), ppglobalinfo, lpdwglobalinfosize, ppclientinterfaceinfo, lpdwclientinterfaceinfosize)).toUInt()
}

public fun MprAdminTransportSetInfo(hmprserver: Long, dwtransportid: UInt, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminTransportSetInfo", longArrayOf(hmprserver, dwtransportid.toLong(), pglobalinfo, dwglobalinfosize.toLong(), pclientinterfaceinfo, dwclientinterfaceinfosize.toLong())).toUInt()
}

public fun MprAdminUpdateConnection(hrasserver: Long, hrasconnection: Foundation.HANDLE, prasupdateconnection: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminUpdateConnection", longArrayOf(hrasserver, Win32DynamicFfi.objectSlot(hrasconnection), prasupdateconnection)).toUInt()
}

public fun MprAdminUserGetInfo(lpszserver: PCWSTR, lpszuser: PCWSTR, dwlevel: UInt, lpbbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminUserGetInfo", longArrayOf(lpszserver, lpszuser, dwlevel.toLong(), lpbbuffer)).toUInt()
}

public fun MprAdminUserSetInfo(lpszserver: PCWSTR, lpszuser: PCWSTR, dwlevel: UInt, lpbbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprAdminUserSetInfo", longArrayOf(lpszserver, lpszuser, dwlevel.toLong(), lpbbuffer)).toUInt()
}

public fun MprConfigBufferFree(pbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigBufferFree", longArrayOf(pbuffer)).toUInt()
}

public fun MprConfigFilterGetInfo(hmprconfig: Foundation.HANDLE, dwlevel: UInt, dwtransportid: UInt, lpbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigFilterGetInfo", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), dwlevel.toLong(), dwtransportid.toLong(), lpbuffer)).toUInt()
}

public fun MprConfigFilterSetInfo(hmprconfig: Foundation.HANDLE, dwlevel: UInt, dwtransportid: UInt, lpbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigFilterSetInfo", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), dwlevel.toLong(), dwtransportid.toLong(), lpbuffer)).toUInt()
}

public fun MprConfigGetFriendlyName(hmprconfig: Foundation.HANDLE, pszguidname: PCWSTR, pszbuffer: PWSTR, dwbuffersize: UInt): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigGetFriendlyName", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), pszguidname, pszbuffer, dwbuffersize.toLong())).toUInt()
}

public fun MprConfigGetGuidName(hmprconfig: Foundation.HANDLE, pszfriendlyname: PCWSTR, pszbuffer: PWSTR, dwbuffersize: UInt): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigGetGuidName", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), pszfriendlyname, pszbuffer, dwbuffersize.toLong())).toUInt()
}

public fun MprConfigInterfaceCreate(hmprconfig: Foundation.HANDLE, dwlevel: UInt, lpbbuffer: Long, phrouterinterface: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigInterfaceCreate", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), dwlevel.toLong(), lpbbuffer, phrouterinterface)).toUInt()
}

public fun MprConfigInterfaceDelete(hmprconfig: Foundation.HANDLE, hrouterinterface: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigInterfaceDelete", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), Win32DynamicFfi.objectSlot(hrouterinterface))).toUInt()
}

public fun MprConfigInterfaceEnum(hmprconfig: Foundation.HANDLE, dwlevel: UInt, lplpbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigInterfaceEnum", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), dwlevel.toLong(), lplpbuffer, dwprefmaxlen.toLong(), lpdwentriesread, lpdwtotalentries, lpdwresumehandle)).toUInt()
}

public fun MprConfigInterfaceGetCustomInfoEx(hmprconfig: Foundation.HANDLE, hrouterinterface: Foundation.HANDLE, pcustominfo: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigInterfaceGetCustomInfoEx", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), Win32DynamicFfi.objectSlot(hrouterinterface), pcustominfo)).toUInt()
}

public fun MprConfigInterfaceGetHandle(hmprconfig: Foundation.HANDLE, lpwsinterfacename: PCWSTR, phrouterinterface: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigInterfaceGetHandle", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), lpwsinterfacename, phrouterinterface)).toUInt()
}

public fun MprConfigInterfaceGetInfo(hmprconfig: Foundation.HANDLE, hrouterinterface: Foundation.HANDLE, dwlevel: UInt, lplpbuffer: Long, lpdwbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigInterfaceGetInfo", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), Win32DynamicFfi.objectSlot(hrouterinterface), dwlevel.toLong(), lplpbuffer, lpdwbuffersize)).toUInt()
}

public fun MprConfigInterfaceSetCustomInfoEx(hmprconfig: Foundation.HANDLE, hrouterinterface: Foundation.HANDLE, pcustominfo: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigInterfaceSetCustomInfoEx", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), Win32DynamicFfi.objectSlot(hrouterinterface), pcustominfo)).toUInt()
}

public fun MprConfigInterfaceSetInfo(hmprconfig: Foundation.HANDLE, hrouterinterface: Foundation.HANDLE, dwlevel: UInt, lpbbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigInterfaceSetInfo", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), Win32DynamicFfi.objectSlot(hrouterinterface), dwlevel.toLong(), lpbbuffer)).toUInt()
}

public fun MprConfigInterfaceTransportAdd(hmprconfig: Foundation.HANDLE, hrouterinterface: Foundation.HANDLE, dwtransportid: UInt, lpwstransportname: PCWSTR, pinterfaceinfo: Long, dwinterfaceinfosize: UInt, phrouteriftransport: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigInterfaceTransportAdd", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), Win32DynamicFfi.objectSlot(hrouterinterface), dwtransportid.toLong(), lpwstransportname, pinterfaceinfo, dwinterfaceinfosize.toLong(), phrouteriftransport)).toUInt()
}

public fun MprConfigInterfaceTransportEnum(hmprconfig: Foundation.HANDLE, hrouterinterface: Foundation.HANDLE, dwlevel: UInt, lplpbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigInterfaceTransportEnum", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), Win32DynamicFfi.objectSlot(hrouterinterface), dwlevel.toLong(), lplpbuffer, dwprefmaxlen.toLong(), lpdwentriesread, lpdwtotalentries, lpdwresumehandle)).toUInt()
}

public fun MprConfigInterfaceTransportGetHandle(hmprconfig: Foundation.HANDLE, hrouterinterface: Foundation.HANDLE, dwtransportid: UInt, phrouteriftransport: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigInterfaceTransportGetHandle", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), Win32DynamicFfi.objectSlot(hrouterinterface), dwtransportid.toLong(), phrouteriftransport)).toUInt()
}

public fun MprConfigInterfaceTransportGetInfo(hmprconfig: Foundation.HANDLE, hrouterinterface: Foundation.HANDLE, hrouteriftransport: Foundation.HANDLE, ppinterfaceinfo: Long, lpdwinterfaceinfosize: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigInterfaceTransportGetInfo", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), Win32DynamicFfi.objectSlot(hrouterinterface), Win32DynamicFfi.objectSlot(hrouteriftransport), ppinterfaceinfo, lpdwinterfaceinfosize)).toUInt()
}

public fun MprConfigInterfaceTransportRemove(hmprconfig: Foundation.HANDLE, hrouterinterface: Foundation.HANDLE, hrouteriftransport: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigInterfaceTransportRemove", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), Win32DynamicFfi.objectSlot(hrouterinterface), Win32DynamicFfi.objectSlot(hrouteriftransport))).toUInt()
}

public fun MprConfigInterfaceTransportSetInfo(hmprconfig: Foundation.HANDLE, hrouterinterface: Foundation.HANDLE, hrouteriftransport: Foundation.HANDLE, pinterfaceinfo: Long, dwinterfaceinfosize: UInt): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigInterfaceTransportSetInfo", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), Win32DynamicFfi.objectSlot(hrouterinterface), Win32DynamicFfi.objectSlot(hrouteriftransport), pinterfaceinfo, dwinterfaceinfosize.toLong())).toUInt()
}

public fun MprConfigServerBackup(hmprconfig: Foundation.HANDLE, lpwspath: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigServerBackup", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), lpwspath)).toUInt()
}

public fun MprConfigServerConnect(lpwsservername: PCWSTR, phmprconfig: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigServerConnect", longArrayOf(lpwsservername, phmprconfig)).toUInt()
}

public fun MprConfigServerDisconnect(hmprconfig: Foundation.HANDLE) {
    Win32DynamicFfi.invoke("mprapi.dll", "MprConfigServerDisconnect", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig)))
}

public fun MprConfigServerGetInfo(hmprconfig: Foundation.HANDLE, dwlevel: UInt, lplpbbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigServerGetInfo", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), dwlevel.toLong(), lplpbbuffer)).toUInt()
}

public fun MprConfigServerGetInfoEx(hmprconfig: Foundation.HANDLE, pserverinfo: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigServerGetInfoEx", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), pserverinfo)).toUInt()
}

public fun MprConfigServerInstall(dwlevel: UInt, pbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigServerInstall", longArrayOf(dwlevel.toLong(), pbuffer)).toUInt()
}

public fun MprConfigServerRefresh(hmprconfig: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigServerRefresh", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig))).toUInt()
}

public fun MprConfigServerRestore(hmprconfig: Foundation.HANDLE, lpwspath: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigServerRestore", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), lpwspath)).toUInt()
}

public fun MprConfigServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigServerSetInfo", longArrayOf(hmprserver, dwlevel.toLong(), lpbbuffer)).toUInt()
}

public fun MprConfigServerSetInfoEx(hmprconfig: Foundation.HANDLE, psetserverconfig: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigServerSetInfoEx", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), psetserverconfig)).toUInt()
}

public fun MprConfigTransportCreate(hmprconfig: Foundation.HANDLE, dwtransportid: UInt, lpwstransportname: PCWSTR, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt, lpwsdllpath: PCWSTR, phroutertransport: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigTransportCreate", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), dwtransportid.toLong(), lpwstransportname, pglobalinfo, dwglobalinfosize.toLong(), pclientinterfaceinfo, dwclientinterfaceinfosize.toLong(), lpwsdllpath, phroutertransport)).toUInt()
}

public fun MprConfigTransportDelete(hmprconfig: Foundation.HANDLE, hroutertransport: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigTransportDelete", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), Win32DynamicFfi.objectSlot(hroutertransport))).toUInt()
}

public fun MprConfigTransportEnum(hmprconfig: Foundation.HANDLE, dwlevel: UInt, lplpbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigTransportEnum", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), dwlevel.toLong(), lplpbuffer, dwprefmaxlen.toLong(), lpdwentriesread, lpdwtotalentries, lpdwresumehandle)).toUInt()
}

public fun MprConfigTransportGetHandle(hmprconfig: Foundation.HANDLE, dwtransportid: UInt, phroutertransport: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigTransportGetHandle", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), dwtransportid.toLong(), phroutertransport)).toUInt()
}

public fun MprConfigTransportGetInfo(hmprconfig: Foundation.HANDLE, hroutertransport: Foundation.HANDLE, ppglobalinfo: Long, lpdwglobalinfosize: Long, ppclientinterfaceinfo: Long, lpdwclientinterfaceinfosize: Long, lplpwsdllpath: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigTransportGetInfo", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), Win32DynamicFfi.objectSlot(hroutertransport), ppglobalinfo, lpdwglobalinfosize, ppclientinterfaceinfo, lpdwclientinterfaceinfosize, lplpwsdllpath)).toUInt()
}

public fun MprConfigTransportSetInfo(hmprconfig: Foundation.HANDLE, hroutertransport: Foundation.HANDLE, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt, lpwsdllpath: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprConfigTransportSetInfo", longArrayOf(Win32DynamicFfi.objectSlot(hmprconfig), Win32DynamicFfi.objectSlot(hroutertransport), pglobalinfo, dwglobalinfosize.toLong(), pclientinterfaceinfo, dwclientinterfaceinfosize.toLong(), lpwsdllpath)).toUInt()
}

public fun MprInfoBlockAdd(lpheader: Long, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: Long, lplpnewheader: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprInfoBlockAdd", longArrayOf(lpheader, dwinfotype.toLong(), dwitemsize.toLong(), dwitemcount.toLong(), lpitemdata, lplpnewheader)).toUInt()
}

public fun MprInfoBlockFind(lpheader: Long, dwinfotype: UInt, lpdwitemsize: Long, lpdwitemcount: Long, lplpitemdata: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprInfoBlockFind", longArrayOf(lpheader, dwinfotype.toLong(), lpdwitemsize, lpdwitemcount, lplpitemdata)).toUInt()
}

public fun MprInfoBlockQuerySize(lpheader: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprInfoBlockQuerySize", longArrayOf(lpheader)).toUInt()
}

public fun MprInfoBlockRemove(lpheader: Long, dwinfotype: UInt, lplpnewheader: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprInfoBlockRemove", longArrayOf(lpheader, dwinfotype.toLong(), lplpnewheader)).toUInt()
}

public fun MprInfoBlockSet(lpheader: Long, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: Long, lplpnewheader: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprInfoBlockSet", longArrayOf(lpheader, dwinfotype.toLong(), dwitemsize.toLong(), dwitemcount.toLong(), lpitemdata, lplpnewheader)).toUInt()
}

public fun MprInfoCreate(dwversion: UInt, lplpnewheader: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprInfoCreate", longArrayOf(dwversion.toLong(), lplpnewheader)).toUInt()
}

public fun MprInfoDelete(lpheader: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprInfoDelete", longArrayOf(lpheader)).toUInt()
}

public fun MprInfoDuplicate(lpheader: Long, lplpnewheader: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprInfoDuplicate", longArrayOf(lpheader, lplpnewheader)).toUInt()
}

public fun MprInfoRemoveAll(lpheader: Long, lplpnewheader: Long): UInt {
    return Win32DynamicFfi.invoke("mprapi.dll", "MprInfoRemoveAll", longArrayOf(lpheader, lplpnewheader)).toUInt()
}

public fun RasClearConnectionStatistics(hrasconn: HRASCONN): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasClearConnectionStatistics", longArrayOf(hrasconn)).toUInt()
}

public fun RasClearLinkStatistics(hrasconn: HRASCONN, dwsubentry: UInt): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasClearLinkStatistics", longArrayOf(hrasconn, dwsubentry.toLong())).toUInt()
}

public fun RasConnectionNotificationA(param0: HRASCONN, param1: Foundation.HANDLE, param2: UInt): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasConnectionNotificationA", longArrayOf(param0, Win32DynamicFfi.objectSlot(param1), param2.toLong())).toUInt()
}

public fun RasConnectionNotificationW(param0: HRASCONN, param1: Foundation.HANDLE, param2: UInt): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasConnectionNotificationW", longArrayOf(param0, Win32DynamicFfi.objectSlot(param1), param2.toLong())).toUInt()
}

public fun RasCreatePhonebookEntryA(param0: Foundation.HWND, param1: PCSTR): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasCreatePhonebookEntryA", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1)).toUInt()
}

public fun RasCreatePhonebookEntryW(param0: Foundation.HWND, param1: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasCreatePhonebookEntryW", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1)).toUInt()
}

public fun RasDeleteEntryA(param0: PCSTR, param1: PCSTR): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasDeleteEntryA", longArrayOf(param0, param1)).toUInt()
}

public fun RasDeleteEntryW(param0: PCWSTR, param1: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasDeleteEntryW", longArrayOf(param0, param1)).toUInt()
}

public fun RasDeleteSubEntryA(pszphonebook: PCSTR, pszentry: PCSTR, dwsubentryid: UInt): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasDeleteSubEntryA", longArrayOf(pszphonebook, pszentry, dwsubentryid.toLong())).toUInt()
}

public fun RasDeleteSubEntryW(pszphonebook: PCWSTR, pszentry: PCWSTR, dwsubentryid: UInt): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasDeleteSubEntryW", longArrayOf(pszphonebook, pszentry, dwsubentryid.toLong())).toUInt()
}

public fun RasDialA(param0: Long, param1: PCSTR, param2: Long, param3: UInt, param4: Long, param5: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasDialA", longArrayOf(param0, param1, param2, param3.toLong(), param4, param5)).toUInt()
}

public fun RasDialDlgA(lpszphonebook: PCSTR, lpszentry: PCSTR, lpszphonenumber: PCSTR, lpinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("rasdlg.dll", "RasDialDlgA", longArrayOf(lpszphonebook, lpszentry, lpszphonenumber, lpinfo)).toInt()
}

public fun RasDialDlgW(lpszphonebook: PCWSTR, lpszentry: PCWSTR, lpszphonenumber: PCWSTR, lpinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("rasdlg.dll", "RasDialDlgW", longArrayOf(lpszphonebook, lpszentry, lpszphonenumber, lpinfo)).toInt()
}

public fun RasDialW(param0: Long, param1: PCWSTR, param2: Long, param3: UInt, param4: Long, param5: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasDialW", longArrayOf(param0, param1, param2, param3.toLong(), param4, param5)).toUInt()
}

public fun RasEditPhonebookEntryA(param0: Foundation.HWND, param1: PCSTR, param2: PCSTR): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasEditPhonebookEntryA", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1, param2)).toUInt()
}

public fun RasEditPhonebookEntryW(param0: Foundation.HWND, param1: PCWSTR, param2: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasEditPhonebookEntryW", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1, param2)).toUInt()
}

public fun RasEntryDlgA(lpszphonebook: PCSTR, lpszentry: PCSTR, lpinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("rasdlg.dll", "RasEntryDlgA", longArrayOf(lpszphonebook, lpszentry, lpinfo)).toInt()
}

public fun RasEntryDlgW(lpszphonebook: PCWSTR, lpszentry: PCWSTR, lpinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("rasdlg.dll", "RasEntryDlgW", longArrayOf(lpszphonebook, lpszentry, lpinfo)).toInt()
}

public fun RasEnumAutodialAddressesA(lpprasautodialaddresses: Long, lpdwcbrasautodialaddresses: Long, lpdwcrasautodialaddresses: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasEnumAutodialAddressesA", longArrayOf(lpprasautodialaddresses, lpdwcbrasautodialaddresses, lpdwcrasautodialaddresses)).toUInt()
}

public fun RasEnumAutodialAddressesW(lpprasautodialaddresses: Long, lpdwcbrasautodialaddresses: Long, lpdwcrasautodialaddresses: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasEnumAutodialAddressesW", longArrayOf(lpprasautodialaddresses, lpdwcbrasautodialaddresses, lpdwcrasautodialaddresses)).toUInt()
}

public fun RasEnumConnectionsA(param0: Long, param1: Long, param2: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasEnumConnectionsA", longArrayOf(param0, param1, param2)).toUInt()
}

public fun RasEnumConnectionsW(param0: Long, param1: Long, param2: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasEnumConnectionsW", longArrayOf(param0, param1, param2)).toUInt()
}

public fun RasEnumDevicesA(param0: Long, param1: Long, param2: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasEnumDevicesA", longArrayOf(param0, param1, param2)).toUInt()
}

public fun RasEnumDevicesW(param0: Long, param1: Long, param2: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasEnumDevicesW", longArrayOf(param0, param1, param2)).toUInt()
}

public fun RasEnumEntriesA(param0: PCSTR, param1: PCSTR, param2: Long, param3: Long, param4: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasEnumEntriesA", longArrayOf(param0, param1, param2, param3, param4)).toUInt()
}

public fun RasEnumEntriesW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: Long, param4: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasEnumEntriesW", longArrayOf(param0, param1, param2, param3, param4)).toUInt()
}

public fun RasFreeEapUserIdentityA(praseapuseridentity: Long) {
    Win32DynamicFfi.invoke("rasapi32.dll", "RasFreeEapUserIdentityA", longArrayOf(praseapuseridentity))
}

public fun RasFreeEapUserIdentityW(praseapuseridentity: Long) {
    Win32DynamicFfi.invoke("rasapi32.dll", "RasFreeEapUserIdentityW", longArrayOf(praseapuseridentity))
}

public fun RasGetAutodialAddressA(param0: PCSTR, param1: Long, param2: Long, param3: Long, param4: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetAutodialAddressA", longArrayOf(param0, param1, param2, param3, param4)).toUInt()
}

public fun RasGetAutodialAddressW(param0: PCWSTR, param1: Long, param2: Long, param3: Long, param4: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetAutodialAddressW", longArrayOf(param0, param1, param2, param3, param4)).toUInt()
}

public fun RasGetAutodialEnableA(param0: UInt, param1: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetAutodialEnableA", longArrayOf(param0.toLong(), param1)).toUInt()
}

public fun RasGetAutodialEnableW(param0: UInt, param1: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetAutodialEnableW", longArrayOf(param0.toLong(), param1)).toUInt()
}

public fun RasGetAutodialParamA(param0: UInt, param1: Long, param2: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetAutodialParamA", longArrayOf(param0.toLong(), param1, param2)).toUInt()
}

public fun RasGetAutodialParamW(param0: UInt, param1: Long, param2: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetAutodialParamW", longArrayOf(param0.toLong(), param1, param2)).toUInt()
}

public fun RasGetConnectStatusA(param0: HRASCONN, param1: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetConnectStatusA", longArrayOf(param0, param1)).toUInt()
}

public fun RasGetConnectStatusW(param0: HRASCONN, param1: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetConnectStatusW", longArrayOf(param0, param1)).toUInt()
}

public fun RasGetConnectionStatistics(hrasconn: HRASCONN, lpstatistics: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetConnectionStatistics", longArrayOf(hrasconn, lpstatistics)).toUInt()
}

public fun RasGetCountryInfoA(param0: Long, param1: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetCountryInfoA", longArrayOf(param0, param1)).toUInt()
}

public fun RasGetCountryInfoW(param0: Long, param1: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetCountryInfoW", longArrayOf(param0, param1)).toUInt()
}

public fun RasGetCredentialsA(param0: PCSTR, param1: PCSTR, param2: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetCredentialsA", longArrayOf(param0, param1, param2)).toUInt()
}

public fun RasGetCredentialsW(param0: PCWSTR, param1: PCWSTR, param2: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetCredentialsW", longArrayOf(param0, param1, param2)).toUInt()
}

public fun RasGetCustomAuthDataA(pszphonebook: PCSTR, pszentry: PCSTR, pbcustomauthdata: Long, pdwsizeofcustomauthdata: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetCustomAuthDataA", longArrayOf(pszphonebook, pszentry, pbcustomauthdata, pdwsizeofcustomauthdata)).toUInt()
}

public fun RasGetCustomAuthDataW(pszphonebook: PCWSTR, pszentry: PCWSTR, pbcustomauthdata: Long, pdwsizeofcustomauthdata: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetCustomAuthDataW", longArrayOf(pszphonebook, pszentry, pbcustomauthdata, pdwsizeofcustomauthdata)).toUInt()
}

public fun RasGetEapUserDataA(htoken: Foundation.HANDLE, pszphonebook: PCSTR, pszentry: PCSTR, pbeapdata: Long, pdwsizeofeapdata: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetEapUserDataA", longArrayOf(Win32DynamicFfi.objectSlot(htoken), pszphonebook, pszentry, pbeapdata, pdwsizeofeapdata)).toUInt()
}

public fun RasGetEapUserDataW(htoken: Foundation.HANDLE, pszphonebook: PCWSTR, pszentry: PCWSTR, pbeapdata: Long, pdwsizeofeapdata: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetEapUserDataW", longArrayOf(Win32DynamicFfi.objectSlot(htoken), pszphonebook, pszentry, pbeapdata, pdwsizeofeapdata)).toUInt()
}

public fun RasGetEapUserIdentityA(pszphonebook: PCSTR, pszentry: PCSTR, dwflags: UInt, hwnd: Foundation.HWND, ppraseapuseridentity: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetEapUserIdentityA", longArrayOf(pszphonebook, pszentry, dwflags.toLong(), Win32DynamicFfi.objectSlot(hwnd), ppraseapuseridentity)).toUInt()
}

public fun RasGetEapUserIdentityW(pszphonebook: PCWSTR, pszentry: PCWSTR, dwflags: UInt, hwnd: Foundation.HWND, ppraseapuseridentity: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetEapUserIdentityW", longArrayOf(pszphonebook, pszentry, dwflags.toLong(), Win32DynamicFfi.objectSlot(hwnd), ppraseapuseridentity)).toUInt()
}

public fun RasGetEntryDialParamsA(param0: PCSTR, param1: Long, param2: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetEntryDialParamsA", longArrayOf(param0, param1, param2)).toUInt()
}

public fun RasGetEntryDialParamsW(param0: PCWSTR, param1: Long, param2: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetEntryDialParamsW", longArrayOf(param0, param1, param2)).toUInt()
}

public fun RasGetEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: Long, param3: Long, param4: Long, param5: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetEntryPropertiesA", longArrayOf(param0, param1, param2, param3, param4, param5)).toUInt()
}

public fun RasGetEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: Long, param4: Long, param5: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetEntryPropertiesW", longArrayOf(param0, param1, param2, param3, param4, param5)).toUInt()
}

public fun RasGetErrorStringA(resourceid: UInt, lpszstring: PSTR, inbufsize: UInt): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetErrorStringA", longArrayOf(resourceid.toLong(), lpszstring, inbufsize.toLong())).toUInt()
}

public fun RasGetErrorStringW(resourceid: UInt, lpszstring: PWSTR, inbufsize: UInt): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetErrorStringW", longArrayOf(resourceid.toLong(), lpszstring, inbufsize.toLong())).toUInt()
}

public fun RasGetLinkStatistics(hrasconn: HRASCONN, dwsubentry: UInt, lpstatistics: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetLinkStatistics", longArrayOf(hrasconn, dwsubentry.toLong(), lpstatistics)).toUInt()
}

public fun RasGetPCscf(lpszpcscf: PWSTR): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetPCscf", longArrayOf(lpszpcscf)).toUInt()
}

public fun RasGetProjectionInfoA(param0: HRASCONN, param1: RASPROJECTION, param2: Long, param3: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetProjectionInfoA", longArrayOf(param0, param1.toLong(), param2, param3)).toUInt()
}

public fun RasGetProjectionInfoEx(hrasconn: HRASCONN, prasprojection: Long, lpdwsize: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetProjectionInfoEx", longArrayOf(hrasconn, prasprojection, lpdwsize)).toUInt()
}

public fun RasGetProjectionInfoW(param0: HRASCONN, param1: RASPROJECTION, param2: Long, param3: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetProjectionInfoW", longArrayOf(param0, param1.toLong(), param2, param3)).toUInt()
}

public fun RasGetSubEntryHandleA(param0: HRASCONN, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetSubEntryHandleA", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun RasGetSubEntryHandleW(param0: HRASCONN, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetSubEntryHandleW", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun RasGetSubEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: UInt, param3: Long, param4: Long, param5: Long, param6: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetSubEntryPropertiesA", longArrayOf(param0, param1, param2.toLong(), param3, param4, param5, param6)).toUInt()
}

public fun RasGetSubEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: UInt, param3: Long, param4: Long, param5: Long, param6: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasGetSubEntryPropertiesW", longArrayOf(param0, param1, param2.toLong(), param3, param4, param5, param6)).toUInt()
}

public fun RasHangUpA(param0: HRASCONN): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasHangUpA", longArrayOf(param0)).toUInt()
}

public fun RasHangUpW(param0: HRASCONN): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasHangUpW", longArrayOf(param0)).toUInt()
}

public fun RasInvokeEapUI(param0: HRASCONN, param1: UInt, param2: Long, param3: Foundation.HWND): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasInvokeEapUI", longArrayOf(param0, param1.toLong(), param2, Win32DynamicFfi.objectSlot(param3))).toUInt()
}

public fun RasPhonebookDlgA(lpszphonebook: PCSTR, lpszentry: PCSTR, lpinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("rasdlg.dll", "RasPhonebookDlgA", longArrayOf(lpszphonebook, lpszentry, lpinfo)).toInt()
}

public fun RasPhonebookDlgW(lpszphonebook: PCWSTR, lpszentry: PCWSTR, lpinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("rasdlg.dll", "RasPhonebookDlgW", longArrayOf(lpszphonebook, lpszentry, lpinfo)).toInt()
}

public fun RasRenameEntryA(param0: PCSTR, param1: PCSTR, param2: PCSTR): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasRenameEntryA", longArrayOf(param0, param1, param2)).toUInt()
}

public fun RasRenameEntryW(param0: PCWSTR, param1: PCWSTR, param2: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasRenameEntryW", longArrayOf(param0, param1, param2)).toUInt()
}

public fun RasSetAutodialAddressA(param0: PCSTR, param1: UInt, param2: Long, param3: UInt, param4: UInt): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasSetAutodialAddressA", longArrayOf(param0, param1.toLong(), param2, param3.toLong(), param4.toLong())).toUInt()
}

public fun RasSetAutodialAddressW(param0: PCWSTR, param1: UInt, param2: Long, param3: UInt, param4: UInt): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasSetAutodialAddressW", longArrayOf(param0, param1.toLong(), param2, param3.toLong(), param4.toLong())).toUInt()
}

public fun RasSetAutodialEnableA(param0: UInt, param1: BOOL): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasSetAutodialEnableA", longArrayOf(param0.toLong(), param1.toLong())).toUInt()
}

public fun RasSetAutodialEnableW(param0: UInt, param1: BOOL): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasSetAutodialEnableW", longArrayOf(param0.toLong(), param1.toLong())).toUInt()
}

public fun RasSetAutodialParamA(param0: UInt, param1: Long, param2: UInt): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasSetAutodialParamA", longArrayOf(param0.toLong(), param1, param2.toLong())).toUInt()
}

public fun RasSetAutodialParamW(param0: UInt, param1: Long, param2: UInt): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasSetAutodialParamW", longArrayOf(param0.toLong(), param1, param2.toLong())).toUInt()
}

public fun RasSetCredentialsA(param0: PCSTR, param1: PCSTR, param2: Long, param3: BOOL): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasSetCredentialsA", longArrayOf(param0, param1, param2, param3.toLong())).toUInt()
}

public fun RasSetCredentialsW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: BOOL): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasSetCredentialsW", longArrayOf(param0, param1, param2, param3.toLong())).toUInt()
}

public fun RasSetCustomAuthDataA(pszphonebook: PCSTR, pszentry: PCSTR, pbcustomauthdata: Long, dwsizeofcustomauthdata: UInt): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasSetCustomAuthDataA", longArrayOf(pszphonebook, pszentry, pbcustomauthdata, dwsizeofcustomauthdata.toLong())).toUInt()
}

public fun RasSetCustomAuthDataW(pszphonebook: PCWSTR, pszentry: PCWSTR, pbcustomauthdata: Long, dwsizeofcustomauthdata: UInt): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasSetCustomAuthDataW", longArrayOf(pszphonebook, pszentry, pbcustomauthdata, dwsizeofcustomauthdata.toLong())).toUInt()
}

public fun RasSetEapUserDataA(htoken: Foundation.HANDLE, pszphonebook: PCSTR, pszentry: PCSTR, pbeapdata: Long, dwsizeofeapdata: UInt): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasSetEapUserDataA", longArrayOf(Win32DynamicFfi.objectSlot(htoken), pszphonebook, pszentry, pbeapdata, dwsizeofeapdata.toLong())).toUInt()
}

public fun RasSetEapUserDataW(htoken: Foundation.HANDLE, pszphonebook: PCWSTR, pszentry: PCWSTR, pbeapdata: Long, dwsizeofeapdata: UInt): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasSetEapUserDataW", longArrayOf(Win32DynamicFfi.objectSlot(htoken), pszphonebook, pszentry, pbeapdata, dwsizeofeapdata.toLong())).toUInt()
}

public fun RasSetEntryDialParamsA(param0: PCSTR, param1: Long, param2: BOOL): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasSetEntryDialParamsA", longArrayOf(param0, param1, param2.toLong())).toUInt()
}

public fun RasSetEntryDialParamsW(param0: PCWSTR, param1: Long, param2: BOOL): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasSetEntryDialParamsW", longArrayOf(param0, param1, param2.toLong())).toUInt()
}

public fun RasSetEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: Long, param3: UInt, param4: Long, param5: UInt): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasSetEntryPropertiesA", longArrayOf(param0, param1, param2, param3.toLong(), param4, param5.toLong())).toUInt()
}

public fun RasSetEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: UInt, param4: Long, param5: UInt): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasSetEntryPropertiesW", longArrayOf(param0, param1, param2, param3.toLong(), param4, param5.toLong())).toUInt()
}

public fun RasSetSubEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: UInt, param3: Long, param4: UInt, param5: Long, param6: UInt): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasSetSubEntryPropertiesA", longArrayOf(param0, param1, param2.toLong(), param3, param4.toLong(), param5, param6.toLong())).toUInt()
}

public fun RasSetSubEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: UInt, param3: Long, param4: UInt, param5: Long, param6: UInt): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasSetSubEntryPropertiesW", longArrayOf(param0, param1, param2.toLong(), param3, param4.toLong(), param5, param6.toLong())).toUInt()
}

public fun RasUpdateConnection(hrasconn: HRASCONN, lprasupdateconn: Long): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasUpdateConnection", longArrayOf(hrasconn, lprasupdateconn)).toUInt()
}

public fun RasValidateEntryNameA(param0: PCSTR, param1: PCSTR): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasValidateEntryNameA", longArrayOf(param0, param1)).toUInt()
}

public fun RasValidateEntryNameW(param0: PCWSTR, param1: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("rasapi32.dll", "RasValidateEntryNameW", longArrayOf(param0, param1)).toUInt()
}

public fun RtmAddNextHop(rtmreghandle: Long, nexthopinfo: Long, nexthophandle: Long, changeflags: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmAddNextHop", longArrayOf(rtmreghandle, nexthopinfo, nexthophandle, changeflags)).toUInt()
}

public fun RtmAddRouteToDest(rtmreghandle: Long, routehandle: Long, destaddress: Long, routeinfo: Long, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmAddRouteToDest", longArrayOf(rtmreghandle, routehandle, destaddress, routeinfo, timetolive.toLong(), routelisthandle, notifytype.toLong(), notifyhandle, changeflags)).toUInt()
}

public fun RtmBlockMethods(rtmreghandle: Long, targethandle: Foundation.HANDLE, targettype: UByte, blockingflag: UInt): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmBlockMethods", longArrayOf(rtmreghandle, Win32DynamicFfi.objectSlot(targethandle), targettype.toLong(), blockingflag.toLong())).toUInt()
}

public fun RtmConvertIpv6AddressAndLengthToNetAddress(pnetaddress: Long, address: Networking.WinSock.IN6_ADDR, dwlength: UInt, dwaddresssize: UInt): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmConvertIpv6AddressAndLengthToNetAddress", longArrayOf(pnetaddress, Win32DynamicFfi.objectSlot(address), dwlength.toLong(), dwaddresssize.toLong())).toUInt()
}

public fun RtmConvertNetAddressToIpv6AddressAndLength(pnetaddress: Long, paddress: Long, plength: Long, dwaddresssize: UInt): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmConvertNetAddressToIpv6AddressAndLength", longArrayOf(pnetaddress, paddress, plength, dwaddresssize.toLong())).toUInt()
}

public fun RtmCreateDestEnum(rtmreghandle: Long, targetviews: UInt, enumflags: UInt, netaddress: Long, protocolid: UInt, rtmenumhandle: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmCreateDestEnum", longArrayOf(rtmreghandle, targetviews.toLong(), enumflags.toLong(), netaddress, protocolid.toLong(), rtmenumhandle)).toUInt()
}

public fun RtmCreateNextHopEnum(rtmreghandle: Long, enumflags: UInt, netaddress: Long, rtmenumhandle: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmCreateNextHopEnum", longArrayOf(rtmreghandle, enumflags.toLong(), netaddress, rtmenumhandle)).toUInt()
}

public fun RtmCreateRouteEnum(rtmreghandle: Long, desthandle: Long, targetviews: UInt, enumflags: UInt, startdest: Long, matchingflags: UInt, criteriaroute: Long, criteriainterface: UInt, rtmenumhandle: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmCreateRouteEnum", longArrayOf(rtmreghandle, desthandle, targetviews.toLong(), enumflags.toLong(), startdest, matchingflags.toLong(), criteriaroute, criteriainterface.toLong(), rtmenumhandle)).toUInt()
}

public fun RtmCreateRouteList(rtmreghandle: Long, routelisthandle: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmCreateRouteList", longArrayOf(rtmreghandle, routelisthandle)).toUInt()
}

public fun RtmCreateRouteListEnum(rtmreghandle: Long, routelisthandle: Long, rtmenumhandle: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmCreateRouteListEnum", longArrayOf(rtmreghandle, routelisthandle, rtmenumhandle)).toUInt()
}

public fun RtmDeleteEnumHandle(rtmreghandle: Long, enumhandle: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmDeleteEnumHandle", longArrayOf(rtmreghandle, enumhandle)).toUInt()
}

public fun RtmDeleteNextHop(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmDeleteNextHop", longArrayOf(rtmreghandle, nexthophandle, nexthopinfo)).toUInt()
}

public fun RtmDeleteRouteList(rtmreghandle: Long, routelisthandle: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmDeleteRouteList", longArrayOf(rtmreghandle, routelisthandle)).toUInt()
}

public fun RtmDeleteRouteToDest(rtmreghandle: Long, routehandle: Long, changeflags: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmDeleteRouteToDest", longArrayOf(rtmreghandle, routehandle, changeflags)).toUInt()
}

public fun RtmDeregisterEntity(rtmreghandle: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmDeregisterEntity", longArrayOf(rtmreghandle)).toUInt()
}

public fun RtmDeregisterFromChangeNotification(rtmreghandle: Long, notifyhandle: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmDeregisterFromChangeNotification", longArrayOf(rtmreghandle, notifyhandle)).toUInt()
}

public fun RtmFindNextHop(rtmreghandle: Long, nexthopinfo: Long, nexthophandle: Long, nexthoppointer: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmFindNextHop", longArrayOf(rtmreghandle, nexthopinfo, nexthophandle, nexthoppointer)).toUInt()
}

public fun RtmGetChangeStatus(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, changestatus: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmGetChangeStatus", longArrayOf(rtmreghandle, notifyhandle, desthandle, changestatus)).toUInt()
}

public fun RtmGetChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: Long, changeddests: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmGetChangedDests", longArrayOf(rtmreghandle, notifyhandle, numdests, changeddests)).toUInt()
}

public fun RtmGetDestInfo(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmGetDestInfo", longArrayOf(rtmreghandle, desthandle, protocolid.toLong(), targetviews.toLong(), destinfo)).toUInt()
}

public fun RtmGetEntityInfo(rtmreghandle: Long, entityhandle: Long, entityinfo: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmGetEntityInfo", longArrayOf(rtmreghandle, entityhandle, entityinfo)).toUInt()
}

public fun RtmGetEntityMethods(rtmreghandle: Long, entityhandle: Long, nummethods: Long, exptmethods: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmGetEntityMethods", longArrayOf(rtmreghandle, entityhandle, nummethods, exptmethods)).toUInt()
}

public fun RtmGetEnumDests(rtmreghandle: Long, enumhandle: Long, numdests: Long, destinfos: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmGetEnumDests", longArrayOf(rtmreghandle, enumhandle, numdests, destinfos)).toUInt()
}

public fun RtmGetEnumNextHops(rtmreghandle: Long, enumhandle: Long, numnexthops: Long, nexthophandles: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmGetEnumNextHops", longArrayOf(rtmreghandle, enumhandle, numnexthops, nexthophandles)).toUInt()
}

public fun RtmGetEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: Long, routehandles: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmGetEnumRoutes", longArrayOf(rtmreghandle, enumhandle, numroutes, routehandles)).toUInt()
}

public fun RtmGetExactMatchDestination(rtmreghandle: Long, destaddress: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmGetExactMatchDestination", longArrayOf(rtmreghandle, destaddress, protocolid.toLong(), targetviews.toLong(), destinfo)).toUInt()
}

public fun RtmGetExactMatchRoute(rtmreghandle: Long, destaddress: Long, matchingflags: UInt, routeinfo: Long, interfaceindex: UInt, targetviews: UInt, routehandle: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmGetExactMatchRoute", longArrayOf(rtmreghandle, destaddress, matchingflags.toLong(), routeinfo, interfaceindex.toLong(), targetviews.toLong(), routehandle)).toUInt()
}

public fun RtmGetLessSpecificDestination(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmGetLessSpecificDestination", longArrayOf(rtmreghandle, desthandle, protocolid.toLong(), targetviews.toLong(), destinfo)).toUInt()
}

public fun RtmGetListEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: Long, routehandles: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmGetListEnumRoutes", longArrayOf(rtmreghandle, enumhandle, numroutes, routehandles)).toUInt()
}

public fun RtmGetMostSpecificDestination(rtmreghandle: Long, destaddress: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmGetMostSpecificDestination", longArrayOf(rtmreghandle, destaddress, protocolid.toLong(), targetviews.toLong(), destinfo)).toUInt()
}

public fun RtmGetNextHopInfo(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmGetNextHopInfo", longArrayOf(rtmreghandle, nexthophandle, nexthopinfo)).toUInt()
}

public fun RtmGetNextHopPointer(rtmreghandle: Long, nexthophandle: Long, nexthoppointer: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmGetNextHopPointer", longArrayOf(rtmreghandle, nexthophandle, nexthoppointer)).toUInt()
}

public fun RtmGetOpaqueInformationPointer(rtmreghandle: Long, desthandle: Long, opaqueinfopointer: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmGetOpaqueInformationPointer", longArrayOf(rtmreghandle, desthandle, opaqueinfopointer)).toUInt()
}

public fun RtmGetRegisteredEntities(rtmreghandle: Long, numentities: Long, entityhandles: Long, entityinfos: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmGetRegisteredEntities", longArrayOf(rtmreghandle, numentities, entityhandles, entityinfos)).toUInt()
}

public fun RtmGetRouteInfo(rtmreghandle: Long, routehandle: Long, routeinfo: Long, destaddress: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmGetRouteInfo", longArrayOf(rtmreghandle, routehandle, routeinfo, destaddress)).toUInt()
}

public fun RtmGetRoutePointer(rtmreghandle: Long, routehandle: Long, routepointer: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmGetRoutePointer", longArrayOf(rtmreghandle, routehandle, routepointer)).toUInt()
}

public fun RtmHoldDestination(rtmreghandle: Long, desthandle: Long, targetviews: UInt, holdtime: UInt): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmHoldDestination", longArrayOf(rtmreghandle, desthandle, targetviews.toLong(), holdtime.toLong())).toUInt()
}

public fun RtmIgnoreChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmIgnoreChangedDests", longArrayOf(rtmreghandle, notifyhandle, numdests.toLong(), changeddests)).toUInt()
}

public fun RtmInsertInRouteList(rtmreghandle: Long, routelisthandle: Long, numroutes: UInt, routehandles: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmInsertInRouteList", longArrayOf(rtmreghandle, routelisthandle, numroutes.toLong(), routehandles)).toUInt()
}

public fun RtmInvokeMethod(rtmreghandle: Long, entityhandle: Long, input: Long, outputsize: Long, output: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmInvokeMethod", longArrayOf(rtmreghandle, entityhandle, input, outputsize, output)).toUInt()
}

public fun RtmIsBestRoute(rtmreghandle: Long, routehandle: Long, bestinviews: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmIsBestRoute", longArrayOf(rtmreghandle, routehandle, bestinviews)).toUInt()
}

public fun RtmIsMarkedForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, destmarked: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmIsMarkedForChangeNotification", longArrayOf(rtmreghandle, notifyhandle, desthandle, destmarked)).toUInt()
}

public fun RtmLockDestination(rtmreghandle: Long, desthandle: Long, exclusive: BOOL, lockdest: BOOL): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmLockDestination", longArrayOf(rtmreghandle, desthandle, exclusive.toLong(), lockdest.toLong())).toUInt()
}

public fun RtmLockNextHop(rtmreghandle: Long, nexthophandle: Long, exclusive: BOOL, locknexthop: BOOL, nexthoppointer: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmLockNextHop", longArrayOf(rtmreghandle, nexthophandle, exclusive.toLong(), locknexthop.toLong(), nexthoppointer)).toUInt()
}

public fun RtmLockRoute(rtmreghandle: Long, routehandle: Long, exclusive: BOOL, lockroute: BOOL, routepointer: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmLockRoute", longArrayOf(rtmreghandle, routehandle, exclusive.toLong(), lockroute.toLong(), routepointer)).toUInt()
}

public fun RtmMarkDestForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, markdest: BOOL): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmMarkDestForChangeNotification", longArrayOf(rtmreghandle, notifyhandle, desthandle, markdest.toLong())).toUInt()
}

public fun RtmReferenceHandles(rtmreghandle: Long, numhandles: UInt, rtmhandles: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmReferenceHandles", longArrayOf(rtmreghandle, numhandles.toLong(), rtmhandles)).toUInt()
}

public fun RtmRegisterEntity(rtmentityinfo: Long, exportmethods: Long, eventcallback: RTM_EVENT_CALLBACK, reserveopaquepointer: BOOL, rtmregprofile: Long, rtmreghandle: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmRegisterEntity", longArrayOf(rtmentityinfo, exportmethods, Win32DynamicFfi.objectSlot(eventcallback), reserveopaquepointer.toLong(), rtmregprofile, rtmreghandle)).toUInt()
}

public fun RtmRegisterForChangeNotification(rtmreghandle: Long, targetviews: UInt, notifyflags: UInt, notifycontext: Long, notifyhandle: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmRegisterForChangeNotification", longArrayOf(rtmreghandle, targetviews.toLong(), notifyflags.toLong(), notifycontext, notifyhandle)).toUInt()
}

public fun RtmReleaseChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmReleaseChangedDests", longArrayOf(rtmreghandle, notifyhandle, numdests.toLong(), changeddests)).toUInt()
}

public fun RtmReleaseDestInfo(rtmreghandle: Long, destinfo: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmReleaseDestInfo", longArrayOf(rtmreghandle, destinfo)).toUInt()
}

public fun RtmReleaseDests(rtmreghandle: Long, numdests: UInt, destinfos: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmReleaseDests", longArrayOf(rtmreghandle, numdests.toLong(), destinfos)).toUInt()
}

public fun RtmReleaseEntities(rtmreghandle: Long, numentities: UInt, entityhandles: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmReleaseEntities", longArrayOf(rtmreghandle, numentities.toLong(), entityhandles)).toUInt()
}

public fun RtmReleaseEntityInfo(rtmreghandle: Long, entityinfo: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmReleaseEntityInfo", longArrayOf(rtmreghandle, entityinfo)).toUInt()
}

public fun RtmReleaseNextHopInfo(rtmreghandle: Long, nexthopinfo: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmReleaseNextHopInfo", longArrayOf(rtmreghandle, nexthopinfo)).toUInt()
}

public fun RtmReleaseNextHops(rtmreghandle: Long, numnexthops: UInt, nexthophandles: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmReleaseNextHops", longArrayOf(rtmreghandle, numnexthops.toLong(), nexthophandles)).toUInt()
}

public fun RtmReleaseRouteInfo(rtmreghandle: Long, routeinfo: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmReleaseRouteInfo", longArrayOf(rtmreghandle, routeinfo)).toUInt()
}

public fun RtmReleaseRoutes(rtmreghandle: Long, numroutes: UInt, routehandles: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmReleaseRoutes", longArrayOf(rtmreghandle, numroutes.toLong(), routehandles)).toUInt()
}

public fun RtmUpdateAndUnlockRoute(rtmreghandle: Long, routehandle: Long, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: Long): UInt {
    return Win32DynamicFfi.invoke("rtm.dll", "RtmUpdateAndUnlockRoute", longArrayOf(rtmreghandle, routehandle, timetolive.toLong(), routelisthandle, notifytype.toLong(), notifyhandle, changeflags)).toUInt()
}
