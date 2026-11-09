@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.IN6_ADDR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun MgmAddGroupMembershipEntry(hprotocol: HANDLE, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MgmAddGroupMembershipEntry(hprotocol.toCPointer<ByteVar>(), dwsourceaddr, dwsourcemask, dwgroupaddr, dwgroupmask, dwifindex, dwifnexthopipaddr, dwflags)

public actual fun MgmDeRegisterMProtocol(hprotocol: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MgmDeRegisterMProtocol(hprotocol.toCPointer<ByteVar>())

public actual fun MgmDeleteGroupMembershipEntry(hprotocol: HANDLE, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MgmDeleteGroupMembershipEntry(hprotocol.toCPointer<ByteVar>(), dwsourceaddr, dwsourcemask, dwgroupaddr, dwgroupmask, dwifindex, dwifnexthopipaddr, dwflags)

public actual fun MgmGetFirstMfe(pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MgmGetFirstMfe(pdwbuffersize.toCPointer<ByteVar>(), pbbuffer.toCPointer<ByteVar>(), pdwnumentries.toCPointer<ByteVar>())

public actual fun MgmGetFirstMfeStats(pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MgmGetFirstMfeStats(pdwbuffersize.toCPointer<ByteVar>(), pbbuffer.toCPointer<ByteVar>(), pdwnumentries.toCPointer<ByteVar>(), dwflags)

public actual fun MgmGetMfe(pimm: Long, pdwbuffersize: Long, pbbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MgmGetMfe(pimm.toCPointer<ByteVar>(), pdwbuffersize.toCPointer<ByteVar>(), pbbuffer.toCPointer<ByteVar>())

public actual fun MgmGetMfeStats(pimm: Long, pdwbuffersize: Long, pbbuffer: Long, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MgmGetMfeStats(pimm.toCPointer<ByteVar>(), pdwbuffersize.toCPointer<ByteVar>(), pbbuffer.toCPointer<ByteVar>(), dwflags)

public actual fun MgmGetNextMfe(pimmstart: Long, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MgmGetNextMfe(pimmstart.toCPointer<ByteVar>(), pdwbuffersize.toCPointer<ByteVar>(), pbbuffer.toCPointer<ByteVar>(), pdwnumentries.toCPointer<ByteVar>())

public actual fun MgmGetNextMfeStats(pimmstart: Long, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MgmGetNextMfeStats(pimmstart.toCPointer<ByteVar>(), pdwbuffersize.toCPointer<ByteVar>(), pbbuffer.toCPointer<ByteVar>(), pdwnumentries.toCPointer<ByteVar>(), dwflags)

public actual fun MgmGetProtocolOnInterface(dwifindex: UInt, dwifnexthopaddr: UInt, pdwifprotocolid: Long, pdwifcomponentid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MgmGetProtocolOnInterface(dwifindex, dwifnexthopaddr, pdwifprotocolid.toCPointer<ByteVar>(), pdwifcomponentid.toCPointer<ByteVar>())

public actual fun MgmGroupEnumerationEnd(henum: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MgmGroupEnumerationEnd(henum.toCPointer<ByteVar>())

public actual fun MgmGroupEnumerationGetNext(henum: HANDLE, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MgmGroupEnumerationGetNext(henum.toCPointer<ByteVar>(), pdwbuffersize.toCPointer<ByteVar>(), pbbuffer.toCPointer<ByteVar>(), pdwnumentries.toCPointer<ByteVar>())

public actual fun MgmGroupEnumerationStart(hprotocol: HANDLE, metenumtype: MGM_ENUM_TYPES, phenumhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MgmGroupEnumerationStart(hprotocol.toCPointer<ByteVar>(), metenumtype, phenumhandle.toCPointer<ByteVar>())

public actual fun MgmRegisterMProtocol(prpiinfo: Long, dwprotocolid: UInt, dwcomponentid: UInt, phprotocol: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MgmRegisterMProtocol(prpiinfo.toCPointer<ByteVar>(), dwprotocolid, dwcomponentid, phprotocol.toCPointer<ByteVar>())

public actual fun MgmReleaseInterfaceOwnership(hprotocol: HANDLE, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MgmReleaseInterfaceOwnership(hprotocol.toCPointer<ByteVar>(), dwifindex, dwifnexthopaddr)

public actual fun MgmTakeInterfaceOwnership(hprotocol: HANDLE, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MgmTakeInterfaceOwnership(hprotocol.toCPointer<ByteVar>(), dwifindex, dwifnexthopaddr)

public actual fun MprAdminBufferFree(pbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminBufferFree(pbuffer.toCPointer<ByteVar>())

public actual fun MprAdminConnectionClearStats(hrasserver: Long, hrasconnection: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionClearStats(hrasserver, hrasconnection.toCPointer<ByteVar>())

public actual fun MprAdminConnectionEnum(hrasserver: Long, dwlevel: UInt, lplpbbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionEnum(hrasserver, dwlevel, lplpbbuffer.toCPointer<ByteVar>(), dwprefmaxlen, lpdwentriesread.toCPointer<ByteVar>(), lpdwtotalentries.toCPointer<ByteVar>(), lpdwresumehandle.toCPointer<ByteVar>())

public actual fun MprAdminConnectionEnumEx(hrasserver: Long, pobjectheader: Long, dwpreferedmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, pprasconn: Long, lpdwresumehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionEnumEx(hrasserver, pobjectheader.toCPointer<ByteVar>(), dwpreferedmaxlen, lpdwentriesread.toCPointer<ByteVar>(), lpdwtotalentries.toCPointer<ByteVar>(), pprasconn.toCPointer<ByteVar>(), lpdwresumehandle.toCPointer<ByteVar>())

public actual fun MprAdminConnectionGetInfo(hrasserver: Long, dwlevel: UInt, hrasconnection: HANDLE, lplpbbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionGetInfo(hrasserver, dwlevel, hrasconnection.toCPointer<ByteVar>(), lplpbbuffer.toCPointer<ByteVar>())

public actual fun MprAdminConnectionGetInfoEx(hrasserver: Long, hrasconnection: HANDLE, prasconnection: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionGetInfoEx(hrasserver, hrasconnection.toCPointer<ByteVar>(), prasconnection.toCPointer<ByteVar>())

public actual fun MprAdminConnectionRemoveQuarantine(hrasserver: HANDLE, hrasconnection: HANDLE, fisipaddress: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionRemoveQuarantine(hrasserver.toCPointer<ByteVar>(), hrasconnection.toCPointer<ByteVar>(), fisipaddress)

public actual fun MprAdminDeregisterConnectionNotification(hmprserver: Long, heventnotification: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminDeregisterConnectionNotification(hmprserver, heventnotification.toCPointer<ByteVar>())

public actual fun MprAdminDeviceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long, lpdwtotalentries: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminDeviceEnum(hmprserver, dwlevel, lplpbbuffer.toCPointer<ByteVar>(), lpdwtotalentries.toCPointer<ByteVar>())

public actual fun MprAdminEstablishDomainRasServer(pszdomain: PCWSTR, pszmachine: PCWSTR, benable: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminEstablishDomainRasServer(pszdomain.toCPointer<ByteVar>(), pszmachine.toCPointer<ByteVar>(), benable)

public actual fun MprAdminGetErrorString(dwerror: UInt, lplpwserrorstring: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminGetErrorString(dwerror, lplpwserrorstring.toCPointer<ByteVar>())

public actual fun MprAdminGetPDCServer(lpszdomain: PCWSTR, lpszserver: PCWSTR, lpszpdcserver: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminGetPDCServer(lpszdomain.toCPointer<ByteVar>(), lpszserver.toCPointer<ByteVar>(), lpszpdcserver.toCPointer<ByteVar>())

public actual fun MprAdminInterfaceConnect(hmprserver: Long, hinterface: HANDLE, hevent: HANDLE, fsynchronous: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceConnect(hmprserver, hinterface.toCPointer<ByteVar>(), hevent.toCPointer<ByteVar>(), fsynchronous)

public actual fun MprAdminInterfaceCreate(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long, phinterface: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceCreate(hmprserver, dwlevel, lpbbuffer.toCPointer<ByteVar>(), phinterface.toCPointer<ByteVar>())

public actual fun MprAdminInterfaceDelete(hmprserver: Long, hinterface: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDelete(hmprserver, hinterface.toCPointer<ByteVar>())

public actual fun MprAdminInterfaceDeviceGetInfo(hmprserver: Long, hinterface: HANDLE, dwindex: UInt, dwlevel: UInt, lplpbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDeviceGetInfo(hmprserver, hinterface.toCPointer<ByteVar>(), dwindex, dwlevel, lplpbuffer.toCPointer<ByteVar>())

public actual fun MprAdminInterfaceDeviceSetInfo(hmprserver: Long, hinterface: HANDLE, dwindex: UInt, dwlevel: UInt, lpbbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDeviceSetInfo(hmprserver, hinterface.toCPointer<ByteVar>(), dwindex, dwlevel, lpbbuffer.toCPointer<ByteVar>())

public actual fun MprAdminInterfaceDisconnect(hmprserver: Long, hinterface: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDisconnect(hmprserver, hinterface.toCPointer<ByteVar>())

public actual fun MprAdminInterfaceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceEnum(hmprserver, dwlevel, lplpbbuffer.toCPointer<ByteVar>(), dwprefmaxlen, lpdwentriesread.toCPointer<ByteVar>(), lpdwtotalentries.toCPointer<ByteVar>(), lpdwresumehandle.toCPointer<ByteVar>())

public actual fun MprAdminInterfaceGetCredentials(lpwsserver: PCWSTR, lpwsinterfacename: PCWSTR, lpwsusername: PWSTR, lpwspassword: PWSTR, lpwsdomainname: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetCredentials(lpwsserver.toCPointer<ByteVar>(), lpwsinterfacename.toCPointer<ByteVar>(), lpwsusername.toCPointer<ByteVar>(), lpwspassword.toCPointer<ByteVar>(), lpwsdomainname.toCPointer<ByteVar>())

public actual fun MprAdminInterfaceGetCredentialsEx(hmprserver: Long, hinterface: HANDLE, dwlevel: UInt, lplpbbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetCredentialsEx(hmprserver, hinterface.toCPointer<ByteVar>(), dwlevel, lplpbbuffer.toCPointer<ByteVar>())

public actual fun MprAdminInterfaceGetCustomInfoEx(hmprserver: Long, hinterface: HANDLE, pcustominfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetCustomInfoEx(hmprserver, hinterface.toCPointer<ByteVar>(), pcustominfo.toCPointer<ByteVar>())

public actual fun MprAdminInterfaceGetHandle(hmprserver: Long, lpwsinterfacename: PCWSTR, phinterface: Long, fincludeclientinterfaces: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetHandle(hmprserver, lpwsinterfacename.toCPointer<ByteVar>(), phinterface.toCPointer<ByteVar>(), fincludeclientinterfaces)

public actual fun MprAdminInterfaceGetInfo(hmprserver: Long, hinterface: HANDLE, dwlevel: UInt, lplpbbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetInfo(hmprserver, hinterface.toCPointer<ByteVar>(), dwlevel, lplpbbuffer.toCPointer<ByteVar>())

public actual fun MprAdminInterfaceQueryUpdateResult(hmprserver: Long, hinterface: HANDLE, dwprotocolid: UInt, lpdwupdateresult: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceQueryUpdateResult(hmprserver, hinterface.toCPointer<ByteVar>(), dwprotocolid, lpdwupdateresult.toCPointer<ByteVar>())

public actual fun MprAdminInterfaceSetCredentials(lpwsserver: PCWSTR, lpwsinterfacename: PCWSTR, lpwsusername: PCWSTR, lpwsdomainname: PCWSTR, lpwspassword: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetCredentials(lpwsserver.toCPointer<ByteVar>(), lpwsinterfacename.toCPointer<ByteVar>(), lpwsusername.toCPointer<ByteVar>(), lpwsdomainname.toCPointer<ByteVar>(), lpwspassword.toCPointer<ByteVar>())

public actual fun MprAdminInterfaceSetCredentialsEx(hmprserver: Long, hinterface: HANDLE, dwlevel: UInt, lpbbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetCredentialsEx(hmprserver, hinterface.toCPointer<ByteVar>(), dwlevel, lpbbuffer.toCPointer<ByteVar>())

public actual fun MprAdminInterfaceSetCustomInfoEx(hmprserver: Long, hinterface: HANDLE, pcustominfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetCustomInfoEx(hmprserver, hinterface.toCPointer<ByteVar>(), pcustominfo.toCPointer<ByteVar>())

public actual fun MprAdminInterfaceSetInfo(hmprserver: Long, hinterface: HANDLE, dwlevel: UInt, lpbbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetInfo(hmprserver, hinterface.toCPointer<ByteVar>(), dwlevel, lpbbuffer.toCPointer<ByteVar>())

public actual fun MprAdminInterfaceTransportAdd(hmprserver: Long, hinterface: HANDLE, dwtransportid: UInt, pinterfaceinfo: Long, dwinterfaceinfosize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportAdd(hmprserver, hinterface.toCPointer<ByteVar>(), dwtransportid, pinterfaceinfo.toCPointer<ByteVar>(), dwinterfaceinfosize)

public actual fun MprAdminInterfaceTransportGetInfo(hmprserver: Long, hinterface: HANDLE, dwtransportid: UInt, ppinterfaceinfo: Long, lpdwinterfaceinfosize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportGetInfo(hmprserver, hinterface.toCPointer<ByteVar>(), dwtransportid, ppinterfaceinfo.toCPointer<ByteVar>(), lpdwinterfaceinfosize.toCPointer<ByteVar>())

public actual fun MprAdminInterfaceTransportRemove(hmprserver: Long, hinterface: HANDLE, dwtransportid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportRemove(hmprserver, hinterface.toCPointer<ByteVar>(), dwtransportid)

public actual fun MprAdminInterfaceTransportSetInfo(hmprserver: Long, hinterface: HANDLE, dwtransportid: UInt, pinterfaceinfo: Long, dwinterfaceinfosize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportSetInfo(hmprserver, hinterface.toCPointer<ByteVar>(), dwtransportid, pinterfaceinfo.toCPointer<ByteVar>(), dwinterfaceinfosize)

public actual fun MprAdminInterfaceUpdatePhonebookInfo(hmprserver: Long, hinterface: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceUpdatePhonebookInfo(hmprserver, hinterface.toCPointer<ByteVar>())

public actual fun MprAdminInterfaceUpdateRoutes(hmprserver: Long, hinterface: HANDLE, dwprotocolid: UInt, hevent: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceUpdateRoutes(hmprserver, hinterface.toCPointer<ByteVar>(), dwprotocolid, hevent.toCPointer<ByteVar>())

public actual fun MprAdminIsDomainRasServer(pszdomain: PCWSTR, pszmachine: PCWSTR, pbisrasserver: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminIsDomainRasServer(pszdomain.toCPointer<ByteVar>(), pszmachine.toCPointer<ByteVar>(), pbisrasserver.toCPointer<ByteVar>())

public actual fun MprAdminIsServiceInitialized(lpwsservername: PCWSTR, fisserviceinitialized: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminIsServiceInitialized(lpwsservername.toCPointer<ByteVar>(), fisserviceinitialized.toCPointer<ByteVar>())

public actual fun MprAdminIsServiceRunning(lpwsservername: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminIsServiceRunning(lpwsservername.toCPointer<ByteVar>())

public actual fun MprAdminMIBBufferFree(pbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBBufferFree(pbuffer.toCPointer<ByteVar>())

public actual fun MprAdminMIBEntryCreate(hmibserver: Long, dwpid: UInt, dwroutingpid: UInt, lpentry: Long, dwentrysize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryCreate(hmibserver, dwpid, dwroutingpid, lpentry.toCPointer<ByteVar>(), dwentrysize)

public actual fun MprAdminMIBEntryDelete(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: Long, dwentrysize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryDelete(hmibserver, dwprotocolid, dwroutingpid, lpentry.toCPointer<ByteVar>(), dwentrysize)

public actual fun MprAdminMIBEntryGet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: Long, dwinentrysize: UInt, lplpoutentry: Long, lpoutentrysize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryGet(hmibserver, dwprotocolid, dwroutingpid, lpinentry.toCPointer<ByteVar>(), dwinentrysize, lplpoutentry.toCPointer<ByteVar>(), lpoutentrysize.toCPointer<ByteVar>())

public actual fun MprAdminMIBEntryGetFirst(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: Long, dwinentrysize: UInt, lplpoutentry: Long, lpoutentrysize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryGetFirst(hmibserver, dwprotocolid, dwroutingpid, lpinentry.toCPointer<ByteVar>(), dwinentrysize, lplpoutentry.toCPointer<ByteVar>(), lpoutentrysize.toCPointer<ByteVar>())

public actual fun MprAdminMIBEntryGetNext(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: Long, dwinentrysize: UInt, lplpoutentry: Long, lpoutentrysize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryGetNext(hmibserver, dwprotocolid, dwroutingpid, lpinentry.toCPointer<ByteVar>(), dwinentrysize, lplpoutentry.toCPointer<ByteVar>(), lpoutentrysize.toCPointer<ByteVar>())

public actual fun MprAdminMIBEntrySet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: Long, dwentrysize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntrySet(hmibserver, dwprotocolid, dwroutingpid, lpentry.toCPointer<ByteVar>(), dwentrysize)

public actual fun MprAdminMIBServerConnect(lpwsservername: PCWSTR, phmibserver: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBServerConnect(lpwsservername.toCPointer<ByteVar>(), phmibserver.toCPointer<ByteVar>())

public actual fun MprAdminMIBServerDisconnect(hmibserver: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBServerDisconnect(hmibserver)
}

public actual fun MprAdminPortClearStats(hrasserver: Long, hport: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminPortClearStats(hrasserver, hport.toCPointer<ByteVar>())

public actual fun MprAdminPortDisconnect(hrasserver: Long, hport: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminPortDisconnect(hrasserver, hport.toCPointer<ByteVar>())

public actual fun MprAdminPortEnum(hrasserver: Long, dwlevel: UInt, hrasconnection: HANDLE, lplpbbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminPortEnum(hrasserver, dwlevel, hrasconnection.toCPointer<ByteVar>(), lplpbbuffer.toCPointer<ByteVar>(), dwprefmaxlen, lpdwentriesread.toCPointer<ByteVar>(), lpdwtotalentries.toCPointer<ByteVar>(), lpdwresumehandle.toCPointer<ByteVar>())

public actual fun MprAdminPortGetInfo(hrasserver: Long, dwlevel: UInt, hport: HANDLE, lplpbbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminPortGetInfo(hrasserver, dwlevel, hport.toCPointer<ByteVar>(), lplpbbuffer.toCPointer<ByteVar>())

public actual fun MprAdminPortReset(hrasserver: Long, hport: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminPortReset(hrasserver, hport.toCPointer<ByteVar>())

public actual fun MprAdminRegisterConnectionNotification(hmprserver: Long, heventnotification: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminRegisterConnectionNotification(hmprserver, heventnotification.toCPointer<ByteVar>())

public actual fun MprAdminSendUserMessage(hmprserver: Long, hconnection: HANDLE, lpwszmessage: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminSendUserMessage(hmprserver, hconnection.toCPointer<ByteVar>(), lpwszmessage.toCPointer<ByteVar>())

public actual fun MprAdminServerConnect(lpwsservername: PCWSTR, phmprserver: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminServerConnect(lpwsservername.toCPointer<ByteVar>(), phmprserver.toCPointer<ByteVar>())

public actual fun MprAdminServerDisconnect(hmprserver: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminServerDisconnect(hmprserver)
}

public actual fun MprAdminServerGetCredentials(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminServerGetCredentials(hmprserver, dwlevel, lplpbbuffer.toCPointer<ByteVar>())

public actual fun MprAdminServerGetInfo(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminServerGetInfo(hmprserver, dwlevel, lplpbbuffer.toCPointer<ByteVar>())

public actual fun MprAdminServerGetInfoEx(hmprserver: Long, pserverinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminServerGetInfoEx(hmprserver, pserverinfo.toCPointer<ByteVar>())

public actual fun MprAdminServerSetCredentials(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminServerSetCredentials(hmprserver, dwlevel, lpbbuffer.toCPointer<ByteVar>())

public actual fun MprAdminServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminServerSetInfo(hmprserver, dwlevel, lpbbuffer.toCPointer<ByteVar>())

public actual fun MprAdminServerSetInfoEx(hmprserver: Long, pserverinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminServerSetInfoEx(hmprserver, pserverinfo.toCPointer<ByteVar>())

public actual fun MprAdminTransportCreate(hmprserver: Long, dwtransportid: UInt, lpwstransportname: PCWSTR, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt, lpwsdllpath: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminTransportCreate(hmprserver, dwtransportid, lpwstransportname.toCPointer<ByteVar>(), pglobalinfo.toCPointer<ByteVar>(), dwglobalinfosize, pclientinterfaceinfo.toCPointer<ByteVar>(), dwclientinterfaceinfosize, lpwsdllpath.toCPointer<ByteVar>())

public actual fun MprAdminTransportGetInfo(hmprserver: Long, dwtransportid: UInt, ppglobalinfo: Long, lpdwglobalinfosize: Long, ppclientinterfaceinfo: Long, lpdwclientinterfaceinfosize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminTransportGetInfo(hmprserver, dwtransportid, ppglobalinfo.toCPointer<ByteVar>(), lpdwglobalinfosize.toCPointer<ByteVar>(), ppclientinterfaceinfo.toCPointer<ByteVar>(), lpdwclientinterfaceinfosize.toCPointer<ByteVar>())

public actual fun MprAdminTransportSetInfo(hmprserver: Long, dwtransportid: UInt, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminTransportSetInfo(hmprserver, dwtransportid, pglobalinfo.toCPointer<ByteVar>(), dwglobalinfosize, pclientinterfaceinfo.toCPointer<ByteVar>(), dwclientinterfaceinfosize)

public actual fun MprAdminUpdateConnection(hrasserver: Long, hrasconnection: HANDLE, prasupdateconnection: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminUpdateConnection(hrasserver, hrasconnection.toCPointer<ByteVar>(), prasupdateconnection.toCPointer<ByteVar>())

public actual fun MprAdminUserGetInfo(lpszserver: PCWSTR, lpszuser: PCWSTR, dwlevel: UInt, lpbbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminUserGetInfo(lpszserver.toCPointer<ByteVar>(), lpszuser.toCPointer<ByteVar>(), dwlevel, lpbbuffer.toCPointer<ByteVar>())

public actual fun MprAdminUserSetInfo(lpszserver: PCWSTR, lpszuser: PCWSTR, dwlevel: UInt, lpbbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprAdminUserSetInfo(lpszserver.toCPointer<ByteVar>(), lpszuser.toCPointer<ByteVar>(), dwlevel, lpbbuffer.toCPointer<ByteVar>())

public actual fun MprConfigBufferFree(pbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigBufferFree(pbuffer.toCPointer<ByteVar>())

public actual fun MprConfigFilterGetInfo(hmprconfig: HANDLE, dwlevel: UInt, dwtransportid: UInt, lpbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigFilterGetInfo(hmprconfig.toCPointer<ByteVar>(), dwlevel, dwtransportid, lpbuffer.toCPointer<ByteVar>())

public actual fun MprConfigFilterSetInfo(hmprconfig: HANDLE, dwlevel: UInt, dwtransportid: UInt, lpbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigFilterSetInfo(hmprconfig.toCPointer<ByteVar>(), dwlevel, dwtransportid, lpbuffer.toCPointer<ByteVar>())

public actual fun MprConfigGetFriendlyName(hmprconfig: HANDLE, pszguidname: PCWSTR, pszbuffer: PWSTR, dwbuffersize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigGetFriendlyName(hmprconfig.toCPointer<ByteVar>(), pszguidname.toCPointer<ByteVar>(), pszbuffer.toCPointer<ByteVar>(), dwbuffersize)

public actual fun MprConfigGetGuidName(hmprconfig: HANDLE, pszfriendlyname: PCWSTR, pszbuffer: PWSTR, dwbuffersize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigGetGuidName(hmprconfig.toCPointer<ByteVar>(), pszfriendlyname.toCPointer<ByteVar>(), pszbuffer.toCPointer<ByteVar>(), dwbuffersize)

public actual fun MprConfigInterfaceCreate(hmprconfig: HANDLE, dwlevel: UInt, lpbbuffer: Long, phrouterinterface: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceCreate(hmprconfig.toCPointer<ByteVar>(), dwlevel, lpbbuffer.toCPointer<ByteVar>(), phrouterinterface.toCPointer<ByteVar>())

public actual fun MprConfigInterfaceDelete(hmprconfig: HANDLE, hrouterinterface: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceDelete(hmprconfig.toCPointer<ByteVar>(), hrouterinterface.toCPointer<ByteVar>())

public actual fun MprConfigInterfaceEnum(hmprconfig: HANDLE, dwlevel: UInt, lplpbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceEnum(hmprconfig.toCPointer<ByteVar>(), dwlevel, lplpbuffer.toCPointer<ByteVar>(), dwprefmaxlen, lpdwentriesread.toCPointer<ByteVar>(), lpdwtotalentries.toCPointer<ByteVar>(), lpdwresumehandle.toCPointer<ByteVar>())

public actual fun MprConfigInterfaceGetCustomInfoEx(hmprconfig: HANDLE, hrouterinterface: HANDLE, pcustominfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceGetCustomInfoEx(hmprconfig.toCPointer<ByteVar>(), hrouterinterface.toCPointer<ByteVar>(), pcustominfo.toCPointer<ByteVar>())

public actual fun MprConfigInterfaceGetHandle(hmprconfig: HANDLE, lpwsinterfacename: PCWSTR, phrouterinterface: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceGetHandle(hmprconfig.toCPointer<ByteVar>(), lpwsinterfacename.toCPointer<ByteVar>(), phrouterinterface.toCPointer<ByteVar>())

public actual fun MprConfigInterfaceGetInfo(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwlevel: UInt, lplpbuffer: Long, lpdwbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceGetInfo(hmprconfig.toCPointer<ByteVar>(), hrouterinterface.toCPointer<ByteVar>(), dwlevel, lplpbuffer.toCPointer<ByteVar>(), lpdwbuffersize.toCPointer<ByteVar>())

public actual fun MprConfigInterfaceSetCustomInfoEx(hmprconfig: HANDLE, hrouterinterface: HANDLE, pcustominfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceSetCustomInfoEx(hmprconfig.toCPointer<ByteVar>(), hrouterinterface.toCPointer<ByteVar>(), pcustominfo.toCPointer<ByteVar>())

public actual fun MprConfigInterfaceSetInfo(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwlevel: UInt, lpbbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceSetInfo(hmprconfig.toCPointer<ByteVar>(), hrouterinterface.toCPointer<ByteVar>(), dwlevel, lpbbuffer.toCPointer<ByteVar>())

public actual fun MprConfigInterfaceTransportAdd(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwtransportid: UInt, lpwstransportname: PCWSTR, pinterfaceinfo: Long, dwinterfaceinfosize: UInt, phrouteriftransport: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportAdd(hmprconfig.toCPointer<ByteVar>(), hrouterinterface.toCPointer<ByteVar>(), dwtransportid, lpwstransportname.toCPointer<ByteVar>(), pinterfaceinfo.toCPointer<ByteVar>(), dwinterfaceinfosize, phrouteriftransport.toCPointer<ByteVar>())

public actual fun MprConfigInterfaceTransportEnum(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwlevel: UInt, lplpbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportEnum(hmprconfig.toCPointer<ByteVar>(), hrouterinterface.toCPointer<ByteVar>(), dwlevel, lplpbuffer.toCPointer<ByteVar>(), dwprefmaxlen, lpdwentriesread.toCPointer<ByteVar>(), lpdwtotalentries.toCPointer<ByteVar>(), lpdwresumehandle.toCPointer<ByteVar>())

public actual fun MprConfigInterfaceTransportGetHandle(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwtransportid: UInt, phrouteriftransport: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportGetHandle(hmprconfig.toCPointer<ByteVar>(), hrouterinterface.toCPointer<ByteVar>(), dwtransportid, phrouteriftransport.toCPointer<ByteVar>())

public actual fun MprConfigInterfaceTransportGetInfo(hmprconfig: HANDLE, hrouterinterface: HANDLE, hrouteriftransport: HANDLE, ppinterfaceinfo: Long, lpdwinterfaceinfosize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportGetInfo(hmprconfig.toCPointer<ByteVar>(), hrouterinterface.toCPointer<ByteVar>(), hrouteriftransport.toCPointer<ByteVar>(), ppinterfaceinfo.toCPointer<ByteVar>(), lpdwinterfaceinfosize.toCPointer<ByteVar>())

public actual fun MprConfigInterfaceTransportRemove(hmprconfig: HANDLE, hrouterinterface: HANDLE, hrouteriftransport: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportRemove(hmprconfig.toCPointer<ByteVar>(), hrouterinterface.toCPointer<ByteVar>(), hrouteriftransport.toCPointer<ByteVar>())

public actual fun MprConfigInterfaceTransportSetInfo(hmprconfig: HANDLE, hrouterinterface: HANDLE, hrouteriftransport: HANDLE, pinterfaceinfo: Long, dwinterfaceinfosize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportSetInfo(hmprconfig.toCPointer<ByteVar>(), hrouterinterface.toCPointer<ByteVar>(), hrouteriftransport.toCPointer<ByteVar>(), pinterfaceinfo.toCPointer<ByteVar>(), dwinterfaceinfosize)

public actual fun MprConfigServerBackup(hmprconfig: HANDLE, lpwspath: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigServerBackup(hmprconfig.toCPointer<ByteVar>(), lpwspath.toCPointer<ByteVar>())

public actual fun MprConfigServerConnect(lpwsservername: PCWSTR, phmprconfig: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigServerConnect(lpwsservername.toCPointer<ByteVar>(), phmprconfig.toCPointer<ByteVar>())

public actual fun MprConfigServerDisconnect(hmprconfig: HANDLE) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigServerDisconnect(hmprconfig.toCPointer<ByteVar>())
}

public actual fun MprConfigServerGetInfo(hmprconfig: HANDLE, dwlevel: UInt, lplpbbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigServerGetInfo(hmprconfig.toCPointer<ByteVar>(), dwlevel, lplpbbuffer.toCPointer<ByteVar>())

public actual fun MprConfigServerGetInfoEx(hmprconfig: HANDLE, pserverinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigServerGetInfoEx(hmprconfig.toCPointer<ByteVar>(), pserverinfo.toCPointer<ByteVar>())

public actual fun MprConfigServerInstall(dwlevel: UInt, pbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigServerInstall(dwlevel, pbuffer.toCPointer<ByteVar>())

public actual fun MprConfigServerRefresh(hmprconfig: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigServerRefresh(hmprconfig.toCPointer<ByteVar>())

public actual fun MprConfigServerRestore(hmprconfig: HANDLE, lpwspath: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigServerRestore(hmprconfig.toCPointer<ByteVar>(), lpwspath.toCPointer<ByteVar>())

public actual fun MprConfigServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigServerSetInfo(hmprserver, dwlevel, lpbbuffer.toCPointer<ByteVar>())

public actual fun MprConfigServerSetInfoEx(hmprconfig: HANDLE, psetserverconfig: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigServerSetInfoEx(hmprconfig.toCPointer<ByteVar>(), psetserverconfig.toCPointer<ByteVar>())

public actual fun MprConfigTransportCreate(hmprconfig: HANDLE, dwtransportid: UInt, lpwstransportname: PCWSTR, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt, lpwsdllpath: PCWSTR, phroutertransport: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigTransportCreate(hmprconfig.toCPointer<ByteVar>(), dwtransportid, lpwstransportname.toCPointer<ByteVar>(), pglobalinfo.toCPointer<ByteVar>(), dwglobalinfosize, pclientinterfaceinfo.toCPointer<ByteVar>(), dwclientinterfaceinfosize, lpwsdllpath.toCPointer<ByteVar>(), phroutertransport.toCPointer<ByteVar>())

public actual fun MprConfigTransportDelete(hmprconfig: HANDLE, hroutertransport: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigTransportDelete(hmprconfig.toCPointer<ByteVar>(), hroutertransport.toCPointer<ByteVar>())

public actual fun MprConfigTransportEnum(hmprconfig: HANDLE, dwlevel: UInt, lplpbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigTransportEnum(hmprconfig.toCPointer<ByteVar>(), dwlevel, lplpbuffer.toCPointer<ByteVar>(), dwprefmaxlen, lpdwentriesread.toCPointer<ByteVar>(), lpdwtotalentries.toCPointer<ByteVar>(), lpdwresumehandle.toCPointer<ByteVar>())

public actual fun MprConfigTransportGetHandle(hmprconfig: HANDLE, dwtransportid: UInt, phroutertransport: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigTransportGetHandle(hmprconfig.toCPointer<ByteVar>(), dwtransportid, phroutertransport.toCPointer<ByteVar>())

public actual fun MprConfigTransportGetInfo(hmprconfig: HANDLE, hroutertransport: HANDLE, ppglobalinfo: Long, lpdwglobalinfosize: Long, ppclientinterfaceinfo: Long, lpdwclientinterfaceinfosize: Long, lplpwsdllpath: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigTransportGetInfo(hmprconfig.toCPointer<ByteVar>(), hroutertransport.toCPointer<ByteVar>(), ppglobalinfo.toCPointer<ByteVar>(), lpdwglobalinfosize.toCPointer<ByteVar>(), ppclientinterfaceinfo.toCPointer<ByteVar>(), lpdwclientinterfaceinfosize.toCPointer<ByteVar>(), lplpwsdllpath.toCPointer<ByteVar>())

public actual fun MprConfigTransportSetInfo(hmprconfig: HANDLE, hroutertransport: HANDLE, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt, lpwsdllpath: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprConfigTransportSetInfo(hmprconfig.toCPointer<ByteVar>(), hroutertransport.toCPointer<ByteVar>(), pglobalinfo.toCPointer<ByteVar>(), dwglobalinfosize, pclientinterfaceinfo.toCPointer<ByteVar>(), dwclientinterfaceinfosize, lpwsdllpath.toCPointer<ByteVar>())

public actual fun MprInfoBlockAdd(lpheader: Long, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: Long, lplpnewheader: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprInfoBlockAdd(lpheader.toCPointer<ByteVar>(), dwinfotype, dwitemsize, dwitemcount, lpitemdata.toCPointer<ByteVar>(), lplpnewheader.toCPointer<ByteVar>())

public actual fun MprInfoBlockFind(lpheader: Long, dwinfotype: UInt, lpdwitemsize: Long, lpdwitemcount: Long, lplpitemdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprInfoBlockFind(lpheader.toCPointer<ByteVar>(), dwinfotype, lpdwitemsize.toCPointer<ByteVar>(), lpdwitemcount.toCPointer<ByteVar>(), lplpitemdata.toCPointer<ByteVar>())

public actual fun MprInfoBlockQuerySize(lpheader: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprInfoBlockQuerySize(lpheader.toCPointer<ByteVar>())

public actual fun MprInfoBlockRemove(lpheader: Long, dwinfotype: UInt, lplpnewheader: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprInfoBlockRemove(lpheader.toCPointer<ByteVar>(), dwinfotype, lplpnewheader.toCPointer<ByteVar>())

public actual fun MprInfoBlockSet(lpheader: Long, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: Long, lplpnewheader: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprInfoBlockSet(lpheader.toCPointer<ByteVar>(), dwinfotype, dwitemsize, dwitemcount, lpitemdata.toCPointer<ByteVar>(), lplpnewheader.toCPointer<ByteVar>())

public actual fun MprInfoCreate(dwversion: UInt, lplpnewheader: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprInfoCreate(dwversion, lplpnewheader.toCPointer<ByteVar>())

public actual fun MprInfoDelete(lpheader: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprInfoDelete(lpheader.toCPointer<ByteVar>())

public actual fun MprInfoDuplicate(lpheader: Long, lplpnewheader: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprInfoDuplicate(lpheader.toCPointer<ByteVar>(), lplpnewheader.toCPointer<ByteVar>())

public actual fun MprInfoRemoveAll(lpheader: Long, lplpnewheader: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_MprInfoRemoveAll(lpheader.toCPointer<ByteVar>(), lplpnewheader.toCPointer<ByteVar>())

public actual fun RasClearConnectionStatistics(hrasconn: HRASCONN): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasClearConnectionStatistics(hrasconn.toCPointer<ByteVar>())

public actual fun RasClearLinkStatistics(hrasconn: HRASCONN, dwsubentry: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasClearLinkStatistics(hrasconn.toCPointer<ByteVar>(), dwsubentry)

public actual fun RasConnectionNotificationA(param0: HRASCONN, param1: HANDLE, param2: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasConnectionNotificationA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2)

public actual fun RasConnectionNotificationW(param0: HRASCONN, param1: HANDLE, param2: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasConnectionNotificationW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2)

public actual fun RasCreatePhonebookEntryA(param0: HWND, param1: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasCreatePhonebookEntryA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun RasCreatePhonebookEntryW(param0: HWND, param1: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasCreatePhonebookEntryW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun RasDeleteEntryA(param0: PCSTR, param1: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasDeleteEntryA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun RasDeleteEntryW(param0: PCWSTR, param1: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasDeleteEntryW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun RasDeleteSubEntryA(pszphonebook: PCSTR, pszentry: PCSTR, dwsubentryid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasDeleteSubEntryA(pszphonebook.toCPointer<ByteVar>(), pszentry.toCPointer<ByteVar>(), dwsubentryid)

public actual fun RasDeleteSubEntryW(pszphonebook: PCWSTR, pszentry: PCWSTR, dwsubentryid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasDeleteSubEntryW(pszphonebook.toCPointer<ByteVar>(), pszentry.toCPointer<ByteVar>(), dwsubentryid)

public actual fun RasDialA(param0: Long, param1: PCSTR, param2: Long, param3: UInt, param4: Long, param5: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasDialA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>(), param3, param4.toCPointer<ByteVar>(), param5.toCPointer<ByteVar>())

public actual fun RasDialDlgA(lpszphonebook: PCSTR, lpszentry: PCSTR, lpszphonenumber: PCSTR, lpinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasDialDlgA(lpszphonebook.toCPointer<ByteVar>(), lpszentry.toCPointer<ByteVar>(), lpszphonenumber.toCPointer<ByteVar>(), lpinfo.toCPointer<ByteVar>())

public actual fun RasDialDlgW(lpszphonebook: PCWSTR, lpszentry: PCWSTR, lpszphonenumber: PCWSTR, lpinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasDialDlgW(lpszphonebook.toCPointer<ByteVar>(), lpszentry.toCPointer<ByteVar>(), lpszphonenumber.toCPointer<ByteVar>(), lpinfo.toCPointer<ByteVar>())

public actual fun RasDialW(param0: Long, param1: PCWSTR, param2: Long, param3: UInt, param4: Long, param5: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasDialW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>(), param3, param4.toCPointer<ByteVar>(), param5.toCPointer<ByteVar>())

public actual fun RasEditPhonebookEntryA(param0: HWND, param1: PCSTR, param2: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasEditPhonebookEntryA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())

public actual fun RasEditPhonebookEntryW(param0: HWND, param1: PCWSTR, param2: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasEditPhonebookEntryW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())

public actual fun RasEntryDlgA(lpszphonebook: PCSTR, lpszentry: PCSTR, lpinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasEntryDlgA(lpszphonebook.toCPointer<ByteVar>(), lpszentry.toCPointer<ByteVar>(), lpinfo.toCPointer<ByteVar>())

public actual fun RasEntryDlgW(lpszphonebook: PCWSTR, lpszentry: PCWSTR, lpinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasEntryDlgW(lpszphonebook.toCPointer<ByteVar>(), lpszentry.toCPointer<ByteVar>(), lpinfo.toCPointer<ByteVar>())

public actual fun RasEnumAutodialAddressesA(lpprasautodialaddresses: Long, lpdwcbrasautodialaddresses: Long, lpdwcrasautodialaddresses: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasEnumAutodialAddressesA(lpprasautodialaddresses.toCPointer<ByteVar>(), lpdwcbrasautodialaddresses.toCPointer<ByteVar>(), lpdwcrasautodialaddresses.toCPointer<ByteVar>())

public actual fun RasEnumAutodialAddressesW(lpprasautodialaddresses: Long, lpdwcbrasautodialaddresses: Long, lpdwcrasautodialaddresses: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasEnumAutodialAddressesW(lpprasautodialaddresses.toCPointer<ByteVar>(), lpdwcbrasautodialaddresses.toCPointer<ByteVar>(), lpdwcrasautodialaddresses.toCPointer<ByteVar>())

public actual fun RasEnumConnectionsA(param0: Long, param1: Long, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasEnumConnectionsA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())

public actual fun RasEnumConnectionsW(param0: Long, param1: Long, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasEnumConnectionsW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())

public actual fun RasEnumDevicesA(param0: Long, param1: Long, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasEnumDevicesA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())

public actual fun RasEnumDevicesW(param0: Long, param1: Long, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasEnumDevicesW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())

public actual fun RasEnumEntriesA(param0: PCSTR, param1: PCSTR, param2: Long, param3: Long, param4: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasEnumEntriesA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>(), param3.toCPointer<ByteVar>(), param4.toCPointer<ByteVar>())

public actual fun RasEnumEntriesW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: Long, param4: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasEnumEntriesW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>(), param3.toCPointer<ByteVar>(), param4.toCPointer<ByteVar>())

public actual fun RasFreeEapUserIdentityA(praseapuseridentity: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasFreeEapUserIdentityA(praseapuseridentity.toCPointer<ByteVar>())
}

public actual fun RasFreeEapUserIdentityW(praseapuseridentity: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasFreeEapUserIdentityW(praseapuseridentity.toCPointer<ByteVar>())
}

public actual fun RasGetAutodialAddressA(param0: PCSTR, param1: Long, param2: Long, param3: Long, param4: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetAutodialAddressA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>(), param3.toCPointer<ByteVar>(), param4.toCPointer<ByteVar>())

public actual fun RasGetAutodialAddressW(param0: PCWSTR, param1: Long, param2: Long, param3: Long, param4: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetAutodialAddressW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>(), param3.toCPointer<ByteVar>(), param4.toCPointer<ByteVar>())

public actual fun RasGetAutodialEnableA(param0: UInt, param1: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetAutodialEnableA(param0, param1.toCPointer<ByteVar>())

public actual fun RasGetAutodialEnableW(param0: UInt, param1: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetAutodialEnableW(param0, param1.toCPointer<ByteVar>())

public actual fun RasGetAutodialParamA(param0: UInt, param1: Long, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetAutodialParamA(param0, param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())

public actual fun RasGetAutodialParamW(param0: UInt, param1: Long, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetAutodialParamW(param0, param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())

public actual fun RasGetConnectStatusA(param0: HRASCONN, param1: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetConnectStatusA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun RasGetConnectStatusW(param0: HRASCONN, param1: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetConnectStatusW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun RasGetConnectionStatistics(hrasconn: HRASCONN, lpstatistics: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetConnectionStatistics(hrasconn.toCPointer<ByteVar>(), lpstatistics.toCPointer<ByteVar>())

public actual fun RasGetCountryInfoA(param0: Long, param1: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetCountryInfoA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun RasGetCountryInfoW(param0: Long, param1: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetCountryInfoW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun RasGetCredentialsA(param0: PCSTR, param1: PCSTR, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetCredentialsA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())

public actual fun RasGetCredentialsW(param0: PCWSTR, param1: PCWSTR, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetCredentialsW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())

public actual fun RasGetCustomAuthDataA(pszphonebook: PCSTR, pszentry: PCSTR, pbcustomauthdata: Long, pdwsizeofcustomauthdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetCustomAuthDataA(pszphonebook.toCPointer<ByteVar>(), pszentry.toCPointer<ByteVar>(), pbcustomauthdata.toCPointer<ByteVar>(), pdwsizeofcustomauthdata.toCPointer<ByteVar>())

public actual fun RasGetCustomAuthDataW(pszphonebook: PCWSTR, pszentry: PCWSTR, pbcustomauthdata: Long, pdwsizeofcustomauthdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetCustomAuthDataW(pszphonebook.toCPointer<ByteVar>(), pszentry.toCPointer<ByteVar>(), pbcustomauthdata.toCPointer<ByteVar>(), pdwsizeofcustomauthdata.toCPointer<ByteVar>())

public actual fun RasGetEapUserDataA(htoken: HANDLE, pszphonebook: PCSTR, pszentry: PCSTR, pbeapdata: Long, pdwsizeofeapdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetEapUserDataA(htoken.toCPointer<ByteVar>(), pszphonebook.toCPointer<ByteVar>(), pszentry.toCPointer<ByteVar>(), pbeapdata.toCPointer<ByteVar>(), pdwsizeofeapdata.toCPointer<ByteVar>())

public actual fun RasGetEapUserDataW(htoken: HANDLE, pszphonebook: PCWSTR, pszentry: PCWSTR, pbeapdata: Long, pdwsizeofeapdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetEapUserDataW(htoken.toCPointer<ByteVar>(), pszphonebook.toCPointer<ByteVar>(), pszentry.toCPointer<ByteVar>(), pbeapdata.toCPointer<ByteVar>(), pdwsizeofeapdata.toCPointer<ByteVar>())

public actual fun RasGetEapUserIdentityA(pszphonebook: PCSTR, pszentry: PCSTR, dwflags: UInt, hwnd: HWND, ppraseapuseridentity: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetEapUserIdentityA(pszphonebook.toCPointer<ByteVar>(), pszentry.toCPointer<ByteVar>(), dwflags, hwnd.toCPointer<ByteVar>(), ppraseapuseridentity.toCPointer<ByteVar>())

public actual fun RasGetEapUserIdentityW(pszphonebook: PCWSTR, pszentry: PCWSTR, dwflags: UInt, hwnd: HWND, ppraseapuseridentity: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetEapUserIdentityW(pszphonebook.toCPointer<ByteVar>(), pszentry.toCPointer<ByteVar>(), dwflags, hwnd.toCPointer<ByteVar>(), ppraseapuseridentity.toCPointer<ByteVar>())

public actual fun RasGetEntryDialParamsA(param0: PCSTR, param1: Long, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetEntryDialParamsA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())

public actual fun RasGetEntryDialParamsW(param0: PCWSTR, param1: Long, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetEntryDialParamsW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())

public actual fun RasGetEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: Long, param3: Long, param4: Long, param5: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetEntryPropertiesA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>(), param3.toCPointer<ByteVar>(), param4.toCPointer<ByteVar>(), param5.toCPointer<ByteVar>())

public actual fun RasGetEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: Long, param4: Long, param5: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetEntryPropertiesW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>(), param3.toCPointer<ByteVar>(), param4.toCPointer<ByteVar>(), param5.toCPointer<ByteVar>())

public actual fun RasGetErrorStringA(resourceid: UInt, lpszstring: PSTR, inbufsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetErrorStringA(resourceid, lpszstring.toCPointer<ByteVar>(), inbufsize)

public actual fun RasGetErrorStringW(resourceid: UInt, lpszstring: PWSTR, inbufsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetErrorStringW(resourceid, lpszstring.toCPointer<ByteVar>(), inbufsize)

public actual fun RasGetLinkStatistics(hrasconn: HRASCONN, dwsubentry: UInt, lpstatistics: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetLinkStatistics(hrasconn.toCPointer<ByteVar>(), dwsubentry, lpstatistics.toCPointer<ByteVar>())

public actual fun RasGetPCscf(lpszpcscf: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetPCscf(lpszpcscf.toCPointer<ByteVar>())

public actual fun RasGetProjectionInfoA(param0: HRASCONN, param1: RASPROJECTION, param2: Long, param3: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetProjectionInfoA(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>(), param3.toCPointer<ByteVar>())

public actual fun RasGetProjectionInfoEx(hrasconn: HRASCONN, prasprojection: Long, lpdwsize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetProjectionInfoEx(hrasconn.toCPointer<ByteVar>(), prasprojection.toCPointer<ByteVar>(), lpdwsize.toCPointer<ByteVar>())

public actual fun RasGetProjectionInfoW(param0: HRASCONN, param1: RASPROJECTION, param2: Long, param3: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetProjectionInfoW(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>(), param3.toCPointer<ByteVar>())

public actual fun RasGetSubEntryHandleA(param0: HRASCONN, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryHandleA(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun RasGetSubEntryHandleW(param0: HRASCONN, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryHandleW(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun RasGetSubEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: UInt, param3: Long, param4: Long, param5: Long, param6: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryPropertiesA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2, param3.toCPointer<ByteVar>(), param4.toCPointer<ByteVar>(), param5.toCPointer<ByteVar>(), param6.toCPointer<ByteVar>())

public actual fun RasGetSubEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: UInt, param3: Long, param4: Long, param5: Long, param6: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryPropertiesW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2, param3.toCPointer<ByteVar>(), param4.toCPointer<ByteVar>(), param5.toCPointer<ByteVar>(), param6.toCPointer<ByteVar>())

public actual fun RasHangUpA(param0: HRASCONN): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasHangUpA(param0.toCPointer<ByteVar>())

public actual fun RasHangUpW(param0: HRASCONN): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasHangUpW(param0.toCPointer<ByteVar>())

public actual fun RasInvokeEapUI(param0: HRASCONN, param1: UInt, param2: Long, param3: HWND): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasInvokeEapUI(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>(), param3.toCPointer<ByteVar>())

public actual fun RasPhonebookDlgA(lpszphonebook: PCSTR, lpszentry: PCSTR, lpinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasPhonebookDlgA(lpszphonebook.toCPointer<ByteVar>(), lpszentry.toCPointer<ByteVar>(), lpinfo.toCPointer<ByteVar>())

public actual fun RasPhonebookDlgW(lpszphonebook: PCWSTR, lpszentry: PCWSTR, lpinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasPhonebookDlgW(lpszphonebook.toCPointer<ByteVar>(), lpszentry.toCPointer<ByteVar>(), lpinfo.toCPointer<ByteVar>())

public actual fun RasRenameEntryA(param0: PCSTR, param1: PCSTR, param2: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasRenameEntryA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())

public actual fun RasRenameEntryW(param0: PCWSTR, param1: PCWSTR, param2: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasRenameEntryW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())

public actual fun RasSetAutodialAddressA(param0: PCSTR, param1: UInt, param2: Long, param3: UInt, param4: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasSetAutodialAddressA(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>(), param3, param4)

public actual fun RasSetAutodialAddressW(param0: PCWSTR, param1: UInt, param2: Long, param3: UInt, param4: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasSetAutodialAddressW(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>(), param3, param4)

public actual fun RasSetAutodialEnableA(param0: UInt, param1: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasSetAutodialEnableA(param0, param1)

public actual fun RasSetAutodialEnableW(param0: UInt, param1: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasSetAutodialEnableW(param0, param1)

public actual fun RasSetAutodialParamA(param0: UInt, param1: Long, param2: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasSetAutodialParamA(param0, param1.toCPointer<ByteVar>(), param2)

public actual fun RasSetAutodialParamW(param0: UInt, param1: Long, param2: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasSetAutodialParamW(param0, param1.toCPointer<ByteVar>(), param2)

public actual fun RasSetCredentialsA(param0: PCSTR, param1: PCSTR, param2: Long, param3: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasSetCredentialsA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>(), param3)

public actual fun RasSetCredentialsW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasSetCredentialsW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>(), param3)

public actual fun RasSetCustomAuthDataA(pszphonebook: PCSTR, pszentry: PCSTR, pbcustomauthdata: Long, dwsizeofcustomauthdata: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasSetCustomAuthDataA(pszphonebook.toCPointer<ByteVar>(), pszentry.toCPointer<ByteVar>(), pbcustomauthdata.toCPointer<ByteVar>(), dwsizeofcustomauthdata)

public actual fun RasSetCustomAuthDataW(pszphonebook: PCWSTR, pszentry: PCWSTR, pbcustomauthdata: Long, dwsizeofcustomauthdata: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasSetCustomAuthDataW(pszphonebook.toCPointer<ByteVar>(), pszentry.toCPointer<ByteVar>(), pbcustomauthdata.toCPointer<ByteVar>(), dwsizeofcustomauthdata)

public actual fun RasSetEapUserDataA(htoken: HANDLE, pszphonebook: PCSTR, pszentry: PCSTR, pbeapdata: Long, dwsizeofeapdata: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasSetEapUserDataA(htoken.toCPointer<ByteVar>(), pszphonebook.toCPointer<ByteVar>(), pszentry.toCPointer<ByteVar>(), pbeapdata.toCPointer<ByteVar>(), dwsizeofeapdata)

public actual fun RasSetEapUserDataW(htoken: HANDLE, pszphonebook: PCWSTR, pszentry: PCWSTR, pbeapdata: Long, dwsizeofeapdata: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasSetEapUserDataW(htoken.toCPointer<ByteVar>(), pszphonebook.toCPointer<ByteVar>(), pszentry.toCPointer<ByteVar>(), pbeapdata.toCPointer<ByteVar>(), dwsizeofeapdata)

public actual fun RasSetEntryDialParamsA(param0: PCSTR, param1: Long, param2: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasSetEntryDialParamsA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2)

public actual fun RasSetEntryDialParamsW(param0: PCWSTR, param1: Long, param2: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasSetEntryDialParamsW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2)

public actual fun RasSetEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: Long, param3: UInt, param4: Long, param5: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasSetEntryPropertiesA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>(), param3, param4.toCPointer<ByteVar>(), param5)

public actual fun RasSetEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: UInt, param4: Long, param5: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasSetEntryPropertiesW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>(), param3, param4.toCPointer<ByteVar>(), param5)

public actual fun RasSetSubEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: UInt, param3: Long, param4: UInt, param5: Long, param6: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasSetSubEntryPropertiesA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2, param3.toCPointer<ByteVar>(), param4, param5.toCPointer<ByteVar>(), param6)

public actual fun RasSetSubEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: UInt, param3: Long, param4: UInt, param5: Long, param6: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasSetSubEntryPropertiesW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2, param3.toCPointer<ByteVar>(), param4, param5.toCPointer<ByteVar>(), param6)

public actual fun RasUpdateConnection(hrasconn: HRASCONN, lprasupdateconn: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasUpdateConnection(hrasconn.toCPointer<ByteVar>(), lprasupdateconn.toCPointer<ByteVar>())

public actual fun RasValidateEntryNameA(param0: PCSTR, param1: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasValidateEntryNameA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun RasValidateEntryNameW(param0: PCWSTR, param1: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RasValidateEntryNameW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun RtmAddNextHop(rtmreghandle: Long, nexthopinfo: Long, nexthophandle: Long, changeflags: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmAddNextHop(rtmreghandle, nexthopinfo.toCPointer<ByteVar>(), nexthophandle.toCPointer<ByteVar>(), changeflags.toCPointer<ByteVar>())

public actual fun RtmAddRouteToDest(rtmreghandle: Long, routehandle: Long, destaddress: Long, routeinfo: Long, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmAddRouteToDest(rtmreghandle, routehandle.toCPointer<ByteVar>(), destaddress.toCPointer<ByteVar>(), routeinfo.toCPointer<ByteVar>(), timetolive, routelisthandle, notifytype, notifyhandle, changeflags.toCPointer<ByteVar>())

public actual fun RtmBlockMethods(rtmreghandle: Long, targethandle: HANDLE, targettype: UByte, blockingflag: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmBlockMethods(rtmreghandle, targethandle.toCPointer<ByteVar>(), targettype, blockingflag)

public actual fun RtmConvertIpv6AddressAndLengthToNetAddress(pnetaddress: Long, address: IN6_ADDR, dwlength: UInt, dwaddresssize: UInt): UInt =
    0u

public actual fun RtmConvertNetAddressToIpv6AddressAndLength(pnetaddress: Long, paddress: Long, plength: Long, dwaddresssize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmConvertNetAddressToIpv6AddressAndLength(pnetaddress.toCPointer<ByteVar>(), paddress.toCPointer<ByteVar>(), plength.toCPointer<ByteVar>(), dwaddresssize)

public actual fun RtmCreateDestEnum(rtmreghandle: Long, targetviews: UInt, enumflags: UInt, netaddress: Long, protocolid: UInt, rtmenumhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmCreateDestEnum(rtmreghandle, targetviews, enumflags, netaddress.toCPointer<ByteVar>(), protocolid, rtmenumhandle.toCPointer<ByteVar>())

public actual fun RtmCreateNextHopEnum(rtmreghandle: Long, enumflags: UInt, netaddress: Long, rtmenumhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmCreateNextHopEnum(rtmreghandle, enumflags, netaddress.toCPointer<ByteVar>(), rtmenumhandle.toCPointer<ByteVar>())

public actual fun RtmCreateRouteEnum(rtmreghandle: Long, desthandle: Long, targetviews: UInt, enumflags: UInt, startdest: Long, matchingflags: UInt, criteriaroute: Long, criteriainterface: UInt, rtmenumhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmCreateRouteEnum(rtmreghandle, desthandle, targetviews, enumflags, startdest.toCPointer<ByteVar>(), matchingflags, criteriaroute.toCPointer<ByteVar>(), criteriainterface, rtmenumhandle.toCPointer<ByteVar>())

public actual fun RtmCreateRouteList(rtmreghandle: Long, routelisthandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmCreateRouteList(rtmreghandle, routelisthandle.toCPointer<ByteVar>())

public actual fun RtmCreateRouteListEnum(rtmreghandle: Long, routelisthandle: Long, rtmenumhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmCreateRouteListEnum(rtmreghandle, routelisthandle, rtmenumhandle.toCPointer<ByteVar>())

public actual fun RtmDeleteEnumHandle(rtmreghandle: Long, enumhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmDeleteEnumHandle(rtmreghandle, enumhandle)

public actual fun RtmDeleteNextHop(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmDeleteNextHop(rtmreghandle, nexthophandle, nexthopinfo.toCPointer<ByteVar>())

public actual fun RtmDeleteRouteList(rtmreghandle: Long, routelisthandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmDeleteRouteList(rtmreghandle, routelisthandle)

public actual fun RtmDeleteRouteToDest(rtmreghandle: Long, routehandle: Long, changeflags: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmDeleteRouteToDest(rtmreghandle, routehandle, changeflags.toCPointer<ByteVar>())

public actual fun RtmDeregisterEntity(rtmreghandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmDeregisterEntity(rtmreghandle)

public actual fun RtmDeregisterFromChangeNotification(rtmreghandle: Long, notifyhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmDeregisterFromChangeNotification(rtmreghandle, notifyhandle)

public actual fun RtmFindNextHop(rtmreghandle: Long, nexthopinfo: Long, nexthophandle: Long, nexthoppointer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmFindNextHop(rtmreghandle, nexthopinfo.toCPointer<ByteVar>(), nexthophandle.toCPointer<ByteVar>(), nexthoppointer.toCPointer<ByteVar>())

public actual fun RtmGetChangeStatus(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, changestatus: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmGetChangeStatus(rtmreghandle, notifyhandle, desthandle, changestatus.toCPointer<ByteVar>())

public actual fun RtmGetChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: Long, changeddests: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmGetChangedDests(rtmreghandle, notifyhandle, numdests.toCPointer<ByteVar>(), changeddests.toCPointer<ByteVar>())

public actual fun RtmGetDestInfo(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmGetDestInfo(rtmreghandle, desthandle, protocolid, targetviews, destinfo.toCPointer<ByteVar>())

public actual fun RtmGetEntityInfo(rtmreghandle: Long, entityhandle: Long, entityinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmGetEntityInfo(rtmreghandle, entityhandle, entityinfo.toCPointer<ByteVar>())

public actual fun RtmGetEntityMethods(rtmreghandle: Long, entityhandle: Long, nummethods: Long, exptmethods: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmGetEntityMethods(rtmreghandle, entityhandle, nummethods.toCPointer<ByteVar>(), exptmethods.toCPointer<ByteVar>())

public actual fun RtmGetEnumDests(rtmreghandle: Long, enumhandle: Long, numdests: Long, destinfos: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmGetEnumDests(rtmreghandle, enumhandle, numdests.toCPointer<ByteVar>(), destinfos.toCPointer<ByteVar>())

public actual fun RtmGetEnumNextHops(rtmreghandle: Long, enumhandle: Long, numnexthops: Long, nexthophandles: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmGetEnumNextHops(rtmreghandle, enumhandle, numnexthops.toCPointer<ByteVar>(), nexthophandles.toCPointer<ByteVar>())

public actual fun RtmGetEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: Long, routehandles: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmGetEnumRoutes(rtmreghandle, enumhandle, numroutes.toCPointer<ByteVar>(), routehandles.toCPointer<ByteVar>())

public actual fun RtmGetExactMatchDestination(rtmreghandle: Long, destaddress: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmGetExactMatchDestination(rtmreghandle, destaddress.toCPointer<ByteVar>(), protocolid, targetviews, destinfo.toCPointer<ByteVar>())

public actual fun RtmGetExactMatchRoute(rtmreghandle: Long, destaddress: Long, matchingflags: UInt, routeinfo: Long, interfaceindex: UInt, targetviews: UInt, routehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmGetExactMatchRoute(rtmreghandle, destaddress.toCPointer<ByteVar>(), matchingflags, routeinfo.toCPointer<ByteVar>(), interfaceindex, targetviews, routehandle.toCPointer<ByteVar>())

public actual fun RtmGetLessSpecificDestination(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmGetLessSpecificDestination(rtmreghandle, desthandle, protocolid, targetviews, destinfo.toCPointer<ByteVar>())

public actual fun RtmGetListEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: Long, routehandles: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmGetListEnumRoutes(rtmreghandle, enumhandle, numroutes.toCPointer<ByteVar>(), routehandles.toCPointer<ByteVar>())

public actual fun RtmGetMostSpecificDestination(rtmreghandle: Long, destaddress: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmGetMostSpecificDestination(rtmreghandle, destaddress.toCPointer<ByteVar>(), protocolid, targetviews, destinfo.toCPointer<ByteVar>())

public actual fun RtmGetNextHopInfo(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmGetNextHopInfo(rtmreghandle, nexthophandle, nexthopinfo.toCPointer<ByteVar>())

public actual fun RtmGetNextHopPointer(rtmreghandle: Long, nexthophandle: Long, nexthoppointer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmGetNextHopPointer(rtmreghandle, nexthophandle, nexthoppointer.toCPointer<ByteVar>())

public actual fun RtmGetOpaqueInformationPointer(rtmreghandle: Long, desthandle: Long, opaqueinfopointer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmGetOpaqueInformationPointer(rtmreghandle, desthandle, opaqueinfopointer.toCPointer<ByteVar>())

public actual fun RtmGetRegisteredEntities(rtmreghandle: Long, numentities: Long, entityhandles: Long, entityinfos: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmGetRegisteredEntities(rtmreghandle, numentities.toCPointer<ByteVar>(), entityhandles.toCPointer<ByteVar>(), entityinfos.toCPointer<ByteVar>())

public actual fun RtmGetRouteInfo(rtmreghandle: Long, routehandle: Long, routeinfo: Long, destaddress: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmGetRouteInfo(rtmreghandle, routehandle, routeinfo.toCPointer<ByteVar>(), destaddress.toCPointer<ByteVar>())

public actual fun RtmGetRoutePointer(rtmreghandle: Long, routehandle: Long, routepointer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmGetRoutePointer(rtmreghandle, routehandle, routepointer.toCPointer<ByteVar>())

public actual fun RtmHoldDestination(rtmreghandle: Long, desthandle: Long, targetviews: UInt, holdtime: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmHoldDestination(rtmreghandle, desthandle, targetviews, holdtime)

public actual fun RtmIgnoreChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmIgnoreChangedDests(rtmreghandle, notifyhandle, numdests, changeddests.toCPointer<ByteVar>())

public actual fun RtmInsertInRouteList(rtmreghandle: Long, routelisthandle: Long, numroutes: UInt, routehandles: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmInsertInRouteList(rtmreghandle, routelisthandle, numroutes, routehandles.toCPointer<ByteVar>())

public actual fun RtmInvokeMethod(rtmreghandle: Long, entityhandle: Long, input: Long, outputsize: Long, output: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmInvokeMethod(rtmreghandle, entityhandle, input.toCPointer<ByteVar>(), outputsize.toCPointer<ByteVar>(), output.toCPointer<ByteVar>())

public actual fun RtmIsBestRoute(rtmreghandle: Long, routehandle: Long, bestinviews: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmIsBestRoute(rtmreghandle, routehandle, bestinviews.toCPointer<ByteVar>())

public actual fun RtmIsMarkedForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, destmarked: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmIsMarkedForChangeNotification(rtmreghandle, notifyhandle, desthandle, destmarked.toCPointer<ByteVar>())

public actual fun RtmLockDestination(rtmreghandle: Long, desthandle: Long, exclusive: BOOL, lockdest: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmLockDestination(rtmreghandle, desthandle, exclusive, lockdest)

public actual fun RtmLockNextHop(rtmreghandle: Long, nexthophandle: Long, exclusive: BOOL, locknexthop: BOOL, nexthoppointer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmLockNextHop(rtmreghandle, nexthophandle, exclusive, locknexthop, nexthoppointer.toCPointer<ByteVar>())

public actual fun RtmLockRoute(rtmreghandle: Long, routehandle: Long, exclusive: BOOL, lockroute: BOOL, routepointer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmLockRoute(rtmreghandle, routehandle, exclusive, lockroute, routepointer.toCPointer<ByteVar>())

public actual fun RtmMarkDestForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, markdest: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmMarkDestForChangeNotification(rtmreghandle, notifyhandle, desthandle, markdest)

public actual fun RtmReferenceHandles(rtmreghandle: Long, numhandles: UInt, rtmhandles: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmReferenceHandles(rtmreghandle, numhandles, rtmhandles.toCPointer<ByteVar>())

public actual fun RtmRegisterEntity(rtmentityinfo: Long, exportmethods: Long, eventcallback: RTM_EVENT_CALLBACK, reserveopaquepointer: BOOL, rtmregprofile: Long, rtmreghandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmRegisterEntity(rtmentityinfo.toCPointer<ByteVar>(), exportmethods.toCPointer<ByteVar>(), eventcallback.toLong().toCPointer<ByteVar>(), reserveopaquepointer, rtmregprofile.toCPointer<ByteVar>(), rtmreghandle.toCPointer<ByteVar>())

public actual fun RtmRegisterForChangeNotification(rtmreghandle: Long, targetviews: UInt, notifyflags: UInt, notifycontext: Long, notifyhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmRegisterForChangeNotification(rtmreghandle, targetviews, notifyflags, notifycontext.toCPointer<ByteVar>(), notifyhandle.toCPointer<ByteVar>())

public actual fun RtmReleaseChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmReleaseChangedDests(rtmreghandle, notifyhandle, numdests, changeddests.toCPointer<ByteVar>())

public actual fun RtmReleaseDestInfo(rtmreghandle: Long, destinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmReleaseDestInfo(rtmreghandle, destinfo.toCPointer<ByteVar>())

public actual fun RtmReleaseDests(rtmreghandle: Long, numdests: UInt, destinfos: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmReleaseDests(rtmreghandle, numdests, destinfos.toCPointer<ByteVar>())

public actual fun RtmReleaseEntities(rtmreghandle: Long, numentities: UInt, entityhandles: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmReleaseEntities(rtmreghandle, numentities, entityhandles.toCPointer<ByteVar>())

public actual fun RtmReleaseEntityInfo(rtmreghandle: Long, entityinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmReleaseEntityInfo(rtmreghandle, entityinfo.toCPointer<ByteVar>())

public actual fun RtmReleaseNextHopInfo(rtmreghandle: Long, nexthopinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmReleaseNextHopInfo(rtmreghandle, nexthopinfo.toCPointer<ByteVar>())

public actual fun RtmReleaseNextHops(rtmreghandle: Long, numnexthops: UInt, nexthophandles: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmReleaseNextHops(rtmreghandle, numnexthops, nexthophandles.toCPointer<ByteVar>())

public actual fun RtmReleaseRouteInfo(rtmreghandle: Long, routeinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmReleaseRouteInfo(rtmreghandle, routeinfo.toCPointer<ByteVar>())

public actual fun RtmReleaseRoutes(rtmreghandle: Long, numroutes: UInt, routehandles: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmReleaseRoutes(rtmreghandle, numroutes, routehandles.toCPointer<ByteVar>())

public actual fun RtmUpdateAndUnlockRoute(rtmreghandle: Long, routehandle: Long, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_RtmUpdateAndUnlockRoute(rtmreghandle, routehandle, timetolive, routelisthandle, notifytype, notifyhandle, changeflags.toCPointer<ByteVar>())
