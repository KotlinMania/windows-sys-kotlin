@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun mgmAddGroupMembershipEntry(hprotocol: Handle, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mgmAddGroupMembershipEntry(hprotocol?.value?.toCPointer<ByteVar>(), dwsourceaddr, dwsourcemask, dwgroupaddr, dwgroupmask, dwifindex, dwifnexthopipaddr, dwflags)

public actual fun mgmDeRegisterMProtocol(hprotocol: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mgmDeRegisterMProtocol(hprotocol?.value?.toCPointer<ByteVar>())

public actual fun mgmDeleteGroupMembershipEntry(hprotocol: Handle, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mgmDeleteGroupMembershipEntry(hprotocol?.value?.toCPointer<ByteVar>(), dwsourceaddr, dwsourcemask, dwgroupaddr, dwgroupmask, dwifindex, dwifnexthopipaddr, dwflags)

public actual fun mgmGetFirstMfe(pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, pdwnumentries: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mgmGetFirstMfe(pdwbuffersize?.value?.toCPointer<ByteVar>(), pbbuffer?.value?.toCPointer<ByteVar>(), pdwnumentries?.value?.toCPointer<ByteVar>())

public actual fun mgmGetFirstMfeStats(pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, pdwnumentries: COpaquePointer?, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mgmGetFirstMfeStats(pdwbuffersize?.value?.toCPointer<ByteVar>(), pbbuffer?.value?.toCPointer<ByteVar>(), pdwnumentries?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun mgmGetMfe(pimm: COpaquePointer?, pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mgmGetMfe(pimm?.value?.toCPointer<ByteVar>(), pdwbuffersize?.value?.toCPointer<ByteVar>(), pbbuffer?.value?.toCPointer<ByteVar>())

public actual fun mgmGetMfeStats(pimm: COpaquePointer?, pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mgmGetMfeStats(pimm?.value?.toCPointer<ByteVar>(), pdwbuffersize?.value?.toCPointer<ByteVar>(), pbbuffer?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun mgmGetNextMfe(pimmstart: COpaquePointer?, pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, pdwnumentries: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mgmGetNextMfe(pimmstart?.value?.toCPointer<ByteVar>(), pdwbuffersize?.value?.toCPointer<ByteVar>(), pbbuffer?.value?.toCPointer<ByteVar>(), pdwnumentries?.value?.toCPointer<ByteVar>())

public actual fun mgmGetNextMfeStats(pimmstart: COpaquePointer?, pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, pdwnumentries: COpaquePointer?, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mgmGetNextMfeStats(pimmstart?.value?.toCPointer<ByteVar>(), pdwbuffersize?.value?.toCPointer<ByteVar>(), pbbuffer?.value?.toCPointer<ByteVar>(), pdwnumentries?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun mgmGetProtocolOnInterface(dwifindex: UInt, dwifnexthopaddr: UInt, pdwifprotocolid: COpaquePointer?, pdwifcomponentid: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mgmGetProtocolOnInterface(dwifindex, dwifnexthopaddr, pdwifprotocolid?.value?.toCPointer<ByteVar>(), pdwifcomponentid?.value?.toCPointer<ByteVar>())

public actual fun mgmGroupEnumerationEnd(henum: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mgmGroupEnumerationEnd(henum?.value?.toCPointer<ByteVar>())

public actual fun mgmGroupEnumerationGetNext(henum: Handle, pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, pdwnumentries: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mgmGroupEnumerationGetNext(henum?.value?.toCPointer<ByteVar>(), pdwbuffersize?.value?.toCPointer<ByteVar>(), pbbuffer?.value?.toCPointer<ByteVar>(), pdwnumentries?.value?.toCPointer<ByteVar>())

public actual fun mgmGroupEnumerationStart(hprotocol: Handle, metenumtype: MgmEnumTypes, phenumhandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mgmGroupEnumerationStart(hprotocol?.value?.toCPointer<ByteVar>(), metenumtype, phenumhandle?.value?.toCPointer<ByteVar>())

public actual fun mgmRegisterMProtocol(prpiinfo: COpaquePointer?, dwprotocolid: UInt, dwcomponentid: UInt, phprotocol: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mgmRegisterMProtocol(prpiinfo?.value?.toCPointer<ByteVar>(), dwprotocolid, dwcomponentid, phprotocol?.value?.toCPointer<ByteVar>())

public actual fun mgmReleaseInterfaceOwnership(hprotocol: Handle, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mgmReleaseInterfaceOwnership(hprotocol?.value?.toCPointer<ByteVar>(), dwifindex, dwifnexthopaddr)

public actual fun mgmTakeInterfaceOwnership(hprotocol: Handle, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mgmTakeInterfaceOwnership(hprotocol?.value?.toCPointer<ByteVar>(), dwifindex, dwifnexthopaddr)

public actual fun mprAdminBufferFree(pbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminBufferFree(pbuffer?.value?.toCPointer<ByteVar>())

public actual fun mprAdminConnectionClearStats(hrasserver: Long, hrasconnection: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionClearStats(hrasserver, hrasconnection?.value?.toCPointer<ByteVar>())

public actual fun mprAdminConnectionEnum(hrasserver: Long, dwlevel: UInt, lplpbbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionEnum(hrasserver, dwlevel, lplpbbuffer?.value?.toCPointer<ByteVar>(), dwprefmaxlen, lpdwentriesread?.value?.toCPointer<ByteVar>(), lpdwtotalentries?.value?.toCPointer<ByteVar>(), lpdwresumehandle?.value?.toCPointer<ByteVar>())

public actual fun mprAdminConnectionEnumEx(hrasserver: Long, pobjectheader: COpaquePointer?, dwpreferedmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, pprasconn: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionEnumEx(hrasserver, pobjectheader?.value?.toCPointer<ByteVar>(), dwpreferedmaxlen, lpdwentriesread?.value?.toCPointer<ByteVar>(), lpdwtotalentries?.value?.toCPointer<ByteVar>(), pprasconn?.value?.toCPointer<ByteVar>(), lpdwresumehandle?.value?.toCPointer<ByteVar>())

public actual fun mprAdminConnectionGetInfo(hrasserver: Long, dwlevel: UInt, hrasconnection: Handle, lplpbbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionGetInfo(hrasserver, dwlevel, hrasconnection?.value?.toCPointer<ByteVar>(), lplpbbuffer?.value?.toCPointer<ByteVar>())

public actual fun mprAdminConnectionGetInfoEx(hrasserver: Long, hrasconnection: Handle, prasconnection: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionGetInfoEx(hrasserver, hrasconnection?.value?.toCPointer<ByteVar>(), prasconnection?.value?.toCPointer<ByteVar>())

public actual fun mprAdminConnectionRemoveQuarantine(hrasserver: Handle, hrasconnection: Handle, fisipaddress: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionRemoveQuarantine(hrasserver?.value?.toCPointer<ByteVar>(), hrasconnection?.value?.toCPointer<ByteVar>(), fisipaddress)

public actual fun mprAdminDeregisterConnectionNotification(hmprserver: Long, heventnotification: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminDeregisterConnectionNotification(hmprserver, heventnotification?.value?.toCPointer<ByteVar>())

public actual fun mprAdminDeviceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: COpaquePointer?, lpdwtotalentries: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminDeviceEnum(hmprserver, dwlevel, lplpbbuffer?.value?.toCPointer<ByteVar>(), lpdwtotalentries?.value?.toCPointer<ByteVar>())

public actual fun mprAdminEstablishDomainRasServer(pszdomain: Pcwstr, pszmachine: Pcwstr, benable: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminEstablishDomainRasServer(pszdomain?.value?.toCPointer<ByteVar>(), pszmachine?.value?.toCPointer<ByteVar>(), benable)

public actual fun mprAdminGetErrorString(dwerror: UInt, lplpwserrorstring: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminGetErrorString(dwerror, lplpwserrorstring?.value?.toCPointer<ByteVar>())

public actual fun mprAdminGetPDCServer(lpszdomain: Pcwstr, lpszserver: Pcwstr, lpszpdcserver: Pwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminGetPDCServer(lpszdomain?.value?.toCPointer<ByteVar>(), lpszserver?.value?.toCPointer<ByteVar>(), lpszpdcserver?.value?.toCPointer<ByteVar>())

public actual fun mprAdminInterfaceConnect(hmprserver: Long, hinterface: Handle, hevent: Handle, fsynchronous: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceConnect(hmprserver, hinterface?.value?.toCPointer<ByteVar>(), hevent?.value?.toCPointer<ByteVar>(), fsynchronous)

public actual fun mprAdminInterfaceCreate(hmprserver: Long, dwlevel: UInt, lpbbuffer: COpaquePointer?, phinterface: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceCreate(hmprserver, dwlevel, lpbbuffer?.value?.toCPointer<ByteVar>(), phinterface?.value?.toCPointer<ByteVar>())

public actual fun mprAdminInterfaceDelete(hmprserver: Long, hinterface: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDelete(hmprserver, hinterface?.value?.toCPointer<ByteVar>())

public actual fun mprAdminInterfaceDeviceGetInfo(hmprserver: Long, hinterface: Handle, dwindex: UInt, dwlevel: UInt, lplpbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDeviceGetInfo(hmprserver, hinterface?.value?.toCPointer<ByteVar>(), dwindex, dwlevel, lplpbuffer?.value?.toCPointer<ByteVar>())

public actual fun mprAdminInterfaceDeviceSetInfo(hmprserver: Long, hinterface: Handle, dwindex: UInt, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDeviceSetInfo(hmprserver, hinterface?.value?.toCPointer<ByteVar>(), dwindex, dwlevel, lpbbuffer?.value?.toCPointer<ByteVar>())

public actual fun mprAdminInterfaceDisconnect(hmprserver: Long, hinterface: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDisconnect(hmprserver, hinterface?.value?.toCPointer<ByteVar>())

public actual fun mprAdminInterfaceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceEnum(hmprserver, dwlevel, lplpbbuffer?.value?.toCPointer<ByteVar>(), dwprefmaxlen, lpdwentriesread?.value?.toCPointer<ByteVar>(), lpdwtotalentries?.value?.toCPointer<ByteVar>(), lpdwresumehandle?.value?.toCPointer<ByteVar>())

public actual fun mprAdminInterfaceGetCredentials(lpwsserver: Pcwstr, lpwsinterfacename: Pcwstr, lpwsusername: Pwstr, lpwspassword: Pwstr, lpwsdomainname: Pwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetCredentials(lpwsserver?.value?.toCPointer<ByteVar>(), lpwsinterfacename?.value?.toCPointer<ByteVar>(), lpwsusername?.value?.toCPointer<ByteVar>(), lpwspassword?.value?.toCPointer<ByteVar>(), lpwsdomainname?.value?.toCPointer<ByteVar>())

public actual fun mprAdminInterfaceGetCredentialsEx(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lplpbbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetCredentialsEx(hmprserver, hinterface?.value?.toCPointer<ByteVar>(), dwlevel, lplpbbuffer?.value?.toCPointer<ByteVar>())

public actual fun mprAdminInterfaceGetCustomInfoEx(hmprserver: Long, hinterface: Handle, pcustominfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetCustomInfoEx(hmprserver, hinterface?.value?.toCPointer<ByteVar>(), pcustominfo?.value?.toCPointer<ByteVar>())

public actual fun mprAdminInterfaceGetHandle(hmprserver: Long, lpwsinterfacename: Pcwstr, phinterface: COpaquePointer?, fincludeclientinterfaces: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetHandle(hmprserver, lpwsinterfacename?.value?.toCPointer<ByteVar>(), phinterface?.value?.toCPointer<ByteVar>(), fincludeclientinterfaces)

public actual fun mprAdminInterfaceGetInfo(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lplpbbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetInfo(hmprserver, hinterface?.value?.toCPointer<ByteVar>(), dwlevel, lplpbbuffer?.value?.toCPointer<ByteVar>())

public actual fun mprAdminInterfaceQueryUpdateResult(hmprserver: Long, hinterface: Handle, dwprotocolid: UInt, lpdwupdateresult: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceQueryUpdateResult(hmprserver, hinterface?.value?.toCPointer<ByteVar>(), dwprotocolid, lpdwupdateresult?.value?.toCPointer<ByteVar>())

public actual fun mprAdminInterfaceSetCredentials(lpwsserver: Pcwstr, lpwsinterfacename: Pcwstr, lpwsusername: Pcwstr, lpwsdomainname: Pcwstr, lpwspassword: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetCredentials(lpwsserver?.value?.toCPointer<ByteVar>(), lpwsinterfacename?.value?.toCPointer<ByteVar>(), lpwsusername?.value?.toCPointer<ByteVar>(), lpwsdomainname?.value?.toCPointer<ByteVar>(), lpwspassword?.value?.toCPointer<ByteVar>())

public actual fun mprAdminInterfaceSetCredentialsEx(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetCredentialsEx(hmprserver, hinterface?.value?.toCPointer<ByteVar>(), dwlevel, lpbbuffer?.value?.toCPointer<ByteVar>())

public actual fun mprAdminInterfaceSetCustomInfoEx(hmprserver: Long, hinterface: Handle, pcustominfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetCustomInfoEx(hmprserver, hinterface?.value?.toCPointer<ByteVar>(), pcustominfo?.value?.toCPointer<ByteVar>())

public actual fun mprAdminInterfaceSetInfo(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetInfo(hmprserver, hinterface?.value?.toCPointer<ByteVar>(), dwlevel, lpbbuffer?.value?.toCPointer<ByteVar>())

public actual fun mprAdminInterfaceTransportAdd(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, pinterfaceinfo: COpaquePointer?, dwinterfaceinfosize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportAdd(hmprserver, hinterface?.value?.toCPointer<ByteVar>(), dwtransportid, pinterfaceinfo?.value?.toCPointer<ByteVar>(), dwinterfaceinfosize)

public actual fun mprAdminInterfaceTransportGetInfo(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, ppinterfaceinfo: COpaquePointer?, lpdwinterfaceinfosize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportGetInfo(hmprserver, hinterface?.value?.toCPointer<ByteVar>(), dwtransportid, ppinterfaceinfo?.value?.toCPointer<ByteVar>(), lpdwinterfaceinfosize?.value?.toCPointer<ByteVar>())

public actual fun mprAdminInterfaceTransportRemove(hmprserver: Long, hinterface: Handle, dwtransportid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportRemove(hmprserver, hinterface?.value?.toCPointer<ByteVar>(), dwtransportid)

public actual fun mprAdminInterfaceTransportSetInfo(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, pinterfaceinfo: COpaquePointer?, dwinterfaceinfosize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportSetInfo(hmprserver, hinterface?.value?.toCPointer<ByteVar>(), dwtransportid, pinterfaceinfo?.value?.toCPointer<ByteVar>(), dwinterfaceinfosize)

public actual fun mprAdminInterfaceUpdatePhonebookInfo(hmprserver: Long, hinterface: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceUpdatePhonebookInfo(hmprserver, hinterface?.value?.toCPointer<ByteVar>())

public actual fun mprAdminInterfaceUpdateRoutes(hmprserver: Long, hinterface: Handle, dwprotocolid: UInt, hevent: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceUpdateRoutes(hmprserver, hinterface?.value?.toCPointer<ByteVar>(), dwprotocolid, hevent?.value?.toCPointer<ByteVar>())

public actual fun mprAdminIsDomainRasServer(pszdomain: Pcwstr, pszmachine: Pcwstr, pbisrasserver: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminIsDomainRasServer(pszdomain?.value?.toCPointer<ByteVar>(), pszmachine?.value?.toCPointer<ByteVar>(), pbisrasserver?.value?.toCPointer<ByteVar>())

public actual fun mprAdminIsServiceInitialized(lpwsservername: Pcwstr, fisserviceinitialized: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminIsServiceInitialized(lpwsservername?.value?.toCPointer<ByteVar>(), fisserviceinitialized?.value?.toCPointer<ByteVar>())

public actual fun mprAdminIsServiceRunning(lpwsservername: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminIsServiceRunning(lpwsservername?.value?.toCPointer<ByteVar>())

public actual fun mprAdminMIBBufferFree(pbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBBufferFree(pbuffer?.value?.toCPointer<ByteVar>())

public actual fun mprAdminMIBEntryCreate(hmibserver: Long, dwpid: UInt, dwroutingpid: UInt, lpentry: COpaquePointer?, dwentrysize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryCreate(hmibserver, dwpid, dwroutingpid, lpentry?.value?.toCPointer<ByteVar>(), dwentrysize)

public actual fun mprAdminMIBEntryDelete(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: COpaquePointer?, dwentrysize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryDelete(hmibserver, dwprotocolid, dwroutingpid, lpentry?.value?.toCPointer<ByteVar>(), dwentrysize)

public actual fun mprAdminMIBEntryGet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: COpaquePointer?, dwinentrysize: UInt, lplpoutentry: COpaquePointer?, lpoutentrysize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryGet(hmibserver, dwprotocolid, dwroutingpid, lpinentry?.value?.toCPointer<ByteVar>(), dwinentrysize, lplpoutentry?.value?.toCPointer<ByteVar>(), lpoutentrysize?.value?.toCPointer<ByteVar>())

public actual fun mprAdminMIBEntryGetFirst(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: COpaquePointer?, dwinentrysize: UInt, lplpoutentry: COpaquePointer?, lpoutentrysize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryGetFirst(hmibserver, dwprotocolid, dwroutingpid, lpinentry?.value?.toCPointer<ByteVar>(), dwinentrysize, lplpoutentry?.value?.toCPointer<ByteVar>(), lpoutentrysize?.value?.toCPointer<ByteVar>())

public actual fun mprAdminMIBEntryGetNext(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: COpaquePointer?, dwinentrysize: UInt, lplpoutentry: COpaquePointer?, lpoutentrysize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryGetNext(hmibserver, dwprotocolid, dwroutingpid, lpinentry?.value?.toCPointer<ByteVar>(), dwinentrysize, lplpoutentry?.value?.toCPointer<ByteVar>(), lpoutentrysize?.value?.toCPointer<ByteVar>())

public actual fun mprAdminMIBEntrySet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: COpaquePointer?, dwentrysize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntrySet(hmibserver, dwprotocolid, dwroutingpid, lpentry?.value?.toCPointer<ByteVar>(), dwentrysize)

public actual fun mprAdminMIBServerConnect(lpwsservername: Pcwstr, phmibserver: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBServerConnect(lpwsservername?.value?.toCPointer<ByteVar>(), phmibserver?.value?.toCPointer<ByteVar>())

public actual fun mprAdminMIBServerDisconnect(hmibserver: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBServerDisconnect(hmibserver)
}

public actual fun mprAdminPortClearStats(hrasserver: Long, hport: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminPortClearStats(hrasserver, hport?.value?.toCPointer<ByteVar>())

public actual fun mprAdminPortDisconnect(hrasserver: Long, hport: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminPortDisconnect(hrasserver, hport?.value?.toCPointer<ByteVar>())

public actual fun mprAdminPortEnum(hrasserver: Long, dwlevel: UInt, hrasconnection: Handle, lplpbbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminPortEnum(hrasserver, dwlevel, hrasconnection?.value?.toCPointer<ByteVar>(), lplpbbuffer?.value?.toCPointer<ByteVar>(), dwprefmaxlen, lpdwentriesread?.value?.toCPointer<ByteVar>(), lpdwtotalentries?.value?.toCPointer<ByteVar>(), lpdwresumehandle?.value?.toCPointer<ByteVar>())

public actual fun mprAdminPortGetInfo(hrasserver: Long, dwlevel: UInt, hport: Handle, lplpbbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminPortGetInfo(hrasserver, dwlevel, hport?.value?.toCPointer<ByteVar>(), lplpbbuffer?.value?.toCPointer<ByteVar>())

public actual fun mprAdminPortReset(hrasserver: Long, hport: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminPortReset(hrasserver, hport?.value?.toCPointer<ByteVar>())

public actual fun mprAdminRegisterConnectionNotification(hmprserver: Long, heventnotification: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminRegisterConnectionNotification(hmprserver, heventnotification?.value?.toCPointer<ByteVar>())

public actual fun mprAdminSendUserMessage(hmprserver: Long, hconnection: Handle, lpwszmessage: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminSendUserMessage(hmprserver, hconnection?.value?.toCPointer<ByteVar>(), lpwszmessage?.value?.toCPointer<ByteVar>())

public actual fun mprAdminServerConnect(lpwsservername: Pcwstr, phmprserver: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminServerConnect(lpwsservername?.value?.toCPointer<ByteVar>(), phmprserver?.value?.toCPointer<ByteVar>())

public actual fun mprAdminServerDisconnect(hmprserver: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminServerDisconnect(hmprserver)
}

public actual fun mprAdminServerGetCredentials(hmprserver: Long, dwlevel: UInt, lplpbbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminServerGetCredentials(hmprserver, dwlevel, lplpbbuffer?.value?.toCPointer<ByteVar>())

public actual fun mprAdminServerGetInfo(hmprserver: Long, dwlevel: UInt, lplpbbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminServerGetInfo(hmprserver, dwlevel, lplpbbuffer?.value?.toCPointer<ByteVar>())

public actual fun mprAdminServerGetInfoEx(hmprserver: Long, pserverinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminServerGetInfoEx(hmprserver, pserverinfo?.value?.toCPointer<ByteVar>())

public actual fun mprAdminServerSetCredentials(hmprserver: Long, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminServerSetCredentials(hmprserver, dwlevel, lpbbuffer?.value?.toCPointer<ByteVar>())

public actual fun mprAdminServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminServerSetInfo(hmprserver, dwlevel, lpbbuffer?.value?.toCPointer<ByteVar>())

public actual fun mprAdminServerSetInfoEx(hmprserver: Long, pserverinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminServerSetInfoEx(hmprserver, pserverinfo?.value?.toCPointer<ByteVar>())

public actual fun mprAdminTransportCreate(hmprserver: Long, dwtransportid: UInt, lpwstransportname: Pcwstr, pglobalinfo: COpaquePointer?, dwglobalinfosize: UInt, pclientinterfaceinfo: COpaquePointer?, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminTransportCreate(hmprserver, dwtransportid, lpwstransportname?.value?.toCPointer<ByteVar>(), pglobalinfo?.value?.toCPointer<ByteVar>(), dwglobalinfosize, pclientinterfaceinfo?.value?.toCPointer<ByteVar>(), dwclientinterfaceinfosize, lpwsdllpath?.value?.toCPointer<ByteVar>())

public actual fun mprAdminTransportGetInfo(hmprserver: Long, dwtransportid: UInt, ppglobalinfo: COpaquePointer?, lpdwglobalinfosize: COpaquePointer?, ppclientinterfaceinfo: COpaquePointer?, lpdwclientinterfaceinfosize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminTransportGetInfo(hmprserver, dwtransportid, ppglobalinfo?.value?.toCPointer<ByteVar>(), lpdwglobalinfosize?.value?.toCPointer<ByteVar>(), ppclientinterfaceinfo?.value?.toCPointer<ByteVar>(), lpdwclientinterfaceinfosize?.value?.toCPointer<ByteVar>())

public actual fun mprAdminTransportSetInfo(hmprserver: Long, dwtransportid: UInt, pglobalinfo: COpaquePointer?, dwglobalinfosize: UInt, pclientinterfaceinfo: COpaquePointer?, dwclientinterfaceinfosize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminTransportSetInfo(hmprserver, dwtransportid, pglobalinfo?.value?.toCPointer<ByteVar>(), dwglobalinfosize, pclientinterfaceinfo?.value?.toCPointer<ByteVar>(), dwclientinterfaceinfosize)

public actual fun mprAdminUpdateConnection(hrasserver: Long, hrasconnection: Handle, prasupdateconnection: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminUpdateConnection(hrasserver, hrasconnection?.value?.toCPointer<ByteVar>(), prasupdateconnection?.value?.toCPointer<ByteVar>())

public actual fun mprAdminUserGetInfo(lpszserver: Pcwstr, lpszuser: Pcwstr, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminUserGetInfo(lpszserver?.value?.toCPointer<ByteVar>(), lpszuser?.value?.toCPointer<ByteVar>(), dwlevel, lpbbuffer?.value?.toCPointer<ByteVar>())

public actual fun mprAdminUserSetInfo(lpszserver: Pcwstr, lpszuser: Pcwstr, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprAdminUserSetInfo(lpszserver?.value?.toCPointer<ByteVar>(), lpszuser?.value?.toCPointer<ByteVar>(), dwlevel, lpbbuffer?.value?.toCPointer<ByteVar>())

public actual fun mprConfigBufferFree(pbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigBufferFree(pbuffer?.value?.toCPointer<ByteVar>())

public actual fun mprConfigFilterGetInfo(hmprconfig: Handle, dwlevel: UInt, dwtransportid: UInt, lpbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigFilterGetInfo(hmprconfig?.value?.toCPointer<ByteVar>(), dwlevel, dwtransportid, lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun mprConfigFilterSetInfo(hmprconfig: Handle, dwlevel: UInt, dwtransportid: UInt, lpbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigFilterSetInfo(hmprconfig?.value?.toCPointer<ByteVar>(), dwlevel, dwtransportid, lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun mprConfigGetFriendlyName(hmprconfig: Handle, pszguidname: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigGetFriendlyName(hmprconfig?.value?.toCPointer<ByteVar>(), pszguidname?.value?.toCPointer<ByteVar>(), pszbuffer?.value?.toCPointer<ByteVar>(), dwbuffersize)

public actual fun mprConfigGetGuidName(hmprconfig: Handle, pszfriendlyname: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigGetGuidName(hmprconfig?.value?.toCPointer<ByteVar>(), pszfriendlyname?.value?.toCPointer<ByteVar>(), pszbuffer?.value?.toCPointer<ByteVar>(), dwbuffersize)

public actual fun mprConfigInterfaceCreate(hmprconfig: Handle, dwlevel: UInt, lpbbuffer: COpaquePointer?, phrouterinterface: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceCreate(hmprconfig?.value?.toCPointer<ByteVar>(), dwlevel, lpbbuffer?.value?.toCPointer<ByteVar>(), phrouterinterface?.value?.toCPointer<ByteVar>())

public actual fun mprConfigInterfaceDelete(hmprconfig: Handle, hrouterinterface: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceDelete(hmprconfig?.value?.toCPointer<ByteVar>(), hrouterinterface?.value?.toCPointer<ByteVar>())

public actual fun mprConfigInterfaceEnum(hmprconfig: Handle, dwlevel: UInt, lplpbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceEnum(hmprconfig?.value?.toCPointer<ByteVar>(), dwlevel, lplpbuffer?.value?.toCPointer<ByteVar>(), dwprefmaxlen, lpdwentriesread?.value?.toCPointer<ByteVar>(), lpdwtotalentries?.value?.toCPointer<ByteVar>(), lpdwresumehandle?.value?.toCPointer<ByteVar>())

public actual fun mprConfigInterfaceGetCustomInfoEx(hmprconfig: Handle, hrouterinterface: Handle, pcustominfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceGetCustomInfoEx(hmprconfig?.value?.toCPointer<ByteVar>(), hrouterinterface?.value?.toCPointer<ByteVar>(), pcustominfo?.value?.toCPointer<ByteVar>())

public actual fun mprConfigInterfaceGetHandle(hmprconfig: Handle, lpwsinterfacename: Pcwstr, phrouterinterface: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceGetHandle(hmprconfig?.value?.toCPointer<ByteVar>(), lpwsinterfacename?.value?.toCPointer<ByteVar>(), phrouterinterface?.value?.toCPointer<ByteVar>())

public actual fun mprConfigInterfaceGetInfo(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lplpbuffer: COpaquePointer?, lpdwbuffersize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceGetInfo(hmprconfig?.value?.toCPointer<ByteVar>(), hrouterinterface?.value?.toCPointer<ByteVar>(), dwlevel, lplpbuffer?.value?.toCPointer<ByteVar>(), lpdwbuffersize?.value?.toCPointer<ByteVar>())

public actual fun mprConfigInterfaceSetCustomInfoEx(hmprconfig: Handle, hrouterinterface: Handle, pcustominfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceSetCustomInfoEx(hmprconfig?.value?.toCPointer<ByteVar>(), hrouterinterface?.value?.toCPointer<ByteVar>(), pcustominfo?.value?.toCPointer<ByteVar>())

public actual fun mprConfigInterfaceSetInfo(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceSetInfo(hmprconfig?.value?.toCPointer<ByteVar>(), hrouterinterface?.value?.toCPointer<ByteVar>(), dwlevel, lpbbuffer?.value?.toCPointer<ByteVar>())

public actual fun mprConfigInterfaceTransportAdd(hmprconfig: Handle, hrouterinterface: Handle, dwtransportid: UInt, lpwstransportname: Pcwstr, pinterfaceinfo: COpaquePointer?, dwinterfaceinfosize: UInt, phrouteriftransport: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportAdd(hmprconfig?.value?.toCPointer<ByteVar>(), hrouterinterface?.value?.toCPointer<ByteVar>(), dwtransportid, lpwstransportname?.value?.toCPointer<ByteVar>(), pinterfaceinfo?.value?.toCPointer<ByteVar>(), dwinterfaceinfosize, phrouteriftransport?.value?.toCPointer<ByteVar>())

public actual fun mprConfigInterfaceTransportEnum(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lplpbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportEnum(hmprconfig?.value?.toCPointer<ByteVar>(), hrouterinterface?.value?.toCPointer<ByteVar>(), dwlevel, lplpbuffer?.value?.toCPointer<ByteVar>(), dwprefmaxlen, lpdwentriesread?.value?.toCPointer<ByteVar>(), lpdwtotalentries?.value?.toCPointer<ByteVar>(), lpdwresumehandle?.value?.toCPointer<ByteVar>())

public actual fun mprConfigInterfaceTransportGetHandle(hmprconfig: Handle, hrouterinterface: Handle, dwtransportid: UInt, phrouteriftransport: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportGetHandle(hmprconfig?.value?.toCPointer<ByteVar>(), hrouterinterface?.value?.toCPointer<ByteVar>(), dwtransportid, phrouteriftransport?.value?.toCPointer<ByteVar>())

public actual fun mprConfigInterfaceTransportGetInfo(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle, ppinterfaceinfo: COpaquePointer?, lpdwinterfaceinfosize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportGetInfo(hmprconfig?.value?.toCPointer<ByteVar>(), hrouterinterface?.value?.toCPointer<ByteVar>(), hrouteriftransport?.value?.toCPointer<ByteVar>(), ppinterfaceinfo?.value?.toCPointer<ByteVar>(), lpdwinterfaceinfosize?.value?.toCPointer<ByteVar>())

public actual fun mprConfigInterfaceTransportRemove(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportRemove(hmprconfig?.value?.toCPointer<ByteVar>(), hrouterinterface?.value?.toCPointer<ByteVar>(), hrouteriftransport?.value?.toCPointer<ByteVar>())

public actual fun mprConfigInterfaceTransportSetInfo(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle, pinterfaceinfo: COpaquePointer?, dwinterfaceinfosize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportSetInfo(hmprconfig?.value?.toCPointer<ByteVar>(), hrouterinterface?.value?.toCPointer<ByteVar>(), hrouteriftransport?.value?.toCPointer<ByteVar>(), pinterfaceinfo?.value?.toCPointer<ByteVar>(), dwinterfaceinfosize)

public actual fun mprConfigServerBackup(hmprconfig: Handle, lpwspath: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigServerBackup(hmprconfig?.value?.toCPointer<ByteVar>(), lpwspath?.value?.toCPointer<ByteVar>())

public actual fun mprConfigServerConnect(lpwsservername: Pcwstr, phmprconfig: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigServerConnect(lpwsservername?.value?.toCPointer<ByteVar>(), phmprconfig?.value?.toCPointer<ByteVar>())

public actual fun mprConfigServerDisconnect(hmprconfig: Handle) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigServerDisconnect(hmprconfig?.value?.toCPointer<ByteVar>())
}

public actual fun mprConfigServerGetInfo(hmprconfig: Handle, dwlevel: UInt, lplpbbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigServerGetInfo(hmprconfig?.value?.toCPointer<ByteVar>(), dwlevel, lplpbbuffer?.value?.toCPointer<ByteVar>())

public actual fun mprConfigServerGetInfoEx(hmprconfig: Handle, pserverinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigServerGetInfoEx(hmprconfig?.value?.toCPointer<ByteVar>(), pserverinfo?.value?.toCPointer<ByteVar>())

public actual fun mprConfigServerInstall(dwlevel: UInt, pbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigServerInstall(dwlevel, pbuffer?.value?.toCPointer<ByteVar>())

public actual fun mprConfigServerRefresh(hmprconfig: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigServerRefresh(hmprconfig?.value?.toCPointer<ByteVar>())

public actual fun mprConfigServerRestore(hmprconfig: Handle, lpwspath: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigServerRestore(hmprconfig?.value?.toCPointer<ByteVar>(), lpwspath?.value?.toCPointer<ByteVar>())

public actual fun mprConfigServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigServerSetInfo(hmprserver, dwlevel, lpbbuffer?.value?.toCPointer<ByteVar>())

public actual fun mprConfigServerSetInfoEx(hmprconfig: Handle, psetserverconfig: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigServerSetInfoEx(hmprconfig?.value?.toCPointer<ByteVar>(), psetserverconfig?.value?.toCPointer<ByteVar>())

public actual fun mprConfigTransportCreate(hmprconfig: Handle, dwtransportid: UInt, lpwstransportname: Pcwstr, pglobalinfo: COpaquePointer?, dwglobalinfosize: UInt, pclientinterfaceinfo: COpaquePointer?, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr, phroutertransport: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigTransportCreate(hmprconfig?.value?.toCPointer<ByteVar>(), dwtransportid, lpwstransportname?.value?.toCPointer<ByteVar>(), pglobalinfo?.value?.toCPointer<ByteVar>(), dwglobalinfosize, pclientinterfaceinfo?.value?.toCPointer<ByteVar>(), dwclientinterfaceinfosize, lpwsdllpath?.value?.toCPointer<ByteVar>(), phroutertransport?.value?.toCPointer<ByteVar>())

public actual fun mprConfigTransportDelete(hmprconfig: Handle, hroutertransport: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigTransportDelete(hmprconfig?.value?.toCPointer<ByteVar>(), hroutertransport?.value?.toCPointer<ByteVar>())

public actual fun mprConfigTransportEnum(hmprconfig: Handle, dwlevel: UInt, lplpbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigTransportEnum(hmprconfig?.value?.toCPointer<ByteVar>(), dwlevel, lplpbuffer?.value?.toCPointer<ByteVar>(), dwprefmaxlen, lpdwentriesread?.value?.toCPointer<ByteVar>(), lpdwtotalentries?.value?.toCPointer<ByteVar>(), lpdwresumehandle?.value?.toCPointer<ByteVar>())

public actual fun mprConfigTransportGetHandle(hmprconfig: Handle, dwtransportid: UInt, phroutertransport: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigTransportGetHandle(hmprconfig?.value?.toCPointer<ByteVar>(), dwtransportid, phroutertransport?.value?.toCPointer<ByteVar>())

public actual fun mprConfigTransportGetInfo(hmprconfig: Handle, hroutertransport: Handle, ppglobalinfo: COpaquePointer?, lpdwglobalinfosize: COpaquePointer?, ppclientinterfaceinfo: COpaquePointer?, lpdwclientinterfaceinfosize: COpaquePointer?, lplpwsdllpath: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigTransportGetInfo(hmprconfig?.value?.toCPointer<ByteVar>(), hroutertransport?.value?.toCPointer<ByteVar>(), ppglobalinfo?.value?.toCPointer<ByteVar>(), lpdwglobalinfosize?.value?.toCPointer<ByteVar>(), ppclientinterfaceinfo?.value?.toCPointer<ByteVar>(), lpdwclientinterfaceinfosize?.value?.toCPointer<ByteVar>(), lplpwsdllpath?.value?.toCPointer<ByteVar>())

public actual fun mprConfigTransportSetInfo(hmprconfig: Handle, hroutertransport: Handle, pglobalinfo: COpaquePointer?, dwglobalinfosize: UInt, pclientinterfaceinfo: COpaquePointer?, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprConfigTransportSetInfo(hmprconfig?.value?.toCPointer<ByteVar>(), hroutertransport?.value?.toCPointer<ByteVar>(), pglobalinfo?.value?.toCPointer<ByteVar>(), dwglobalinfosize, pclientinterfaceinfo?.value?.toCPointer<ByteVar>(), dwclientinterfaceinfosize, lpwsdllpath?.value?.toCPointer<ByteVar>())

public actual fun mprInfoBlockAdd(lpheader: COpaquePointer?, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: COpaquePointer?, lplpnewheader: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprInfoBlockAdd(lpheader?.value?.toCPointer<ByteVar>(), dwinfotype, dwitemsize, dwitemcount, lpitemdata?.value?.toCPointer<ByteVar>(), lplpnewheader?.value?.toCPointer<ByteVar>())

public actual fun mprInfoBlockFind(lpheader: COpaquePointer?, dwinfotype: UInt, lpdwitemsize: COpaquePointer?, lpdwitemcount: COpaquePointer?, lplpitemdata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprInfoBlockFind(lpheader?.value?.toCPointer<ByteVar>(), dwinfotype, lpdwitemsize?.value?.toCPointer<ByteVar>(), lpdwitemcount?.value?.toCPointer<ByteVar>(), lplpitemdata?.value?.toCPointer<ByteVar>())

public actual fun mprInfoBlockQuerySize(lpheader: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprInfoBlockQuerySize(lpheader?.value?.toCPointer<ByteVar>())

public actual fun mprInfoBlockRemove(lpheader: COpaquePointer?, dwinfotype: UInt, lplpnewheader: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprInfoBlockRemove(lpheader?.value?.toCPointer<ByteVar>(), dwinfotype, lplpnewheader?.value?.toCPointer<ByteVar>())

public actual fun mprInfoBlockSet(lpheader: COpaquePointer?, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: COpaquePointer?, lplpnewheader: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprInfoBlockSet(lpheader?.value?.toCPointer<ByteVar>(), dwinfotype, dwitemsize, dwitemcount, lpitemdata?.value?.toCPointer<ByteVar>(), lplpnewheader?.value?.toCPointer<ByteVar>())

public actual fun mprInfoCreate(dwversion: UInt, lplpnewheader: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprInfoCreate(dwversion, lplpnewheader?.value?.toCPointer<ByteVar>())

public actual fun mprInfoDelete(lpheader: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprInfoDelete(lpheader?.value?.toCPointer<ByteVar>())

public actual fun mprInfoDuplicate(lpheader: COpaquePointer?, lplpnewheader: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprInfoDuplicate(lpheader?.value?.toCPointer<ByteVar>(), lplpnewheader?.value?.toCPointer<ByteVar>())

public actual fun mprInfoRemoveAll(lpheader: COpaquePointer?, lplpnewheader: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_mprInfoRemoveAll(lpheader?.value?.toCPointer<ByteVar>(), lplpnewheader?.value?.toCPointer<ByteVar>())

public actual fun rasClearConnectionStatistics(hrasconn: Hrasconn): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasClearConnectionStatistics(hrasconn?.value?.toCPointer<ByteVar>())

public actual fun rasClearLinkStatistics(hrasconn: Hrasconn, dwsubentry: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasClearLinkStatistics(hrasconn?.value?.toCPointer<ByteVar>(), dwsubentry)

public actual fun rasConnectionNotificationA(param0: Hrasconn, param1: Handle, param2: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasConnectionNotificationA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2)

public actual fun rasConnectionNotificationW(param0: Hrasconn, param1: Handle, param2: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasConnectionNotificationW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2)

public actual fun rasCreatePhonebookEntryA(param0: Hwnd, param1: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasCreatePhonebookEntryA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun rasCreatePhonebookEntryW(param0: Hwnd, param1: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasCreatePhonebookEntryW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun rasDeleteEntryA(param0: Pcstr, param1: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasDeleteEntryA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun rasDeleteEntryW(param0: Pcwstr, param1: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasDeleteEntryW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun rasDeleteSubEntryA(pszphonebook: Pcstr, pszentry: Pcstr, dwsubentryid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasDeleteSubEntryA(pszphonebook?.value?.toCPointer<ByteVar>(), pszentry?.value?.toCPointer<ByteVar>(), dwsubentryid)

public actual fun rasDeleteSubEntryW(pszphonebook: Pcwstr, pszentry: Pcwstr, dwsubentryid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasDeleteSubEntryW(pszphonebook?.value?.toCPointer<ByteVar>(), pszentry?.value?.toCPointer<ByteVar>(), dwsubentryid)

public actual fun rasDialA(param0: COpaquePointer?, param1: Pcstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?, param5: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasDialA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>(), param3, param4?.value?.toCPointer<ByteVar>(), param5?.value?.toCPointer<ByteVar>())

public actual fun rasDialDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpszphonenumber: Pcstr, lpinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasDialDlgA(lpszphonebook?.value?.toCPointer<ByteVar>(), lpszentry?.value?.toCPointer<ByteVar>(), lpszphonenumber?.value?.toCPointer<ByteVar>(), lpinfo?.value?.toCPointer<ByteVar>())

public actual fun rasDialDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpszphonenumber: Pcwstr, lpinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasDialDlgW(lpszphonebook?.value?.toCPointer<ByteVar>(), lpszentry?.value?.toCPointer<ByteVar>(), lpszphonenumber?.value?.toCPointer<ByteVar>(), lpinfo?.value?.toCPointer<ByteVar>())

public actual fun rasDialW(param0: COpaquePointer?, param1: Pcwstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?, param5: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasDialW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>(), param3, param4?.value?.toCPointer<ByteVar>(), param5?.value?.toCPointer<ByteVar>())

public actual fun rasEditPhonebookEntryA(param0: Hwnd, param1: Pcstr, param2: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasEditPhonebookEntryA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())

public actual fun rasEditPhonebookEntryW(param0: Hwnd, param1: Pcwstr, param2: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasEditPhonebookEntryW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())

public actual fun rasEntryDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasEntryDlgA(lpszphonebook?.value?.toCPointer<ByteVar>(), lpszentry?.value?.toCPointer<ByteVar>(), lpinfo?.value?.toCPointer<ByteVar>())

public actual fun rasEntryDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasEntryDlgW(lpszphonebook?.value?.toCPointer<ByteVar>(), lpszentry?.value?.toCPointer<ByteVar>(), lpinfo?.value?.toCPointer<ByteVar>())

public actual fun rasEnumAutodialAddressesA(lpprasautodialaddresses: COpaquePointer?, lpdwcbrasautodialaddresses: COpaquePointer?, lpdwcrasautodialaddresses: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasEnumAutodialAddressesA(lpprasautodialaddresses?.value?.toCPointer<ByteVar>(), lpdwcbrasautodialaddresses?.value?.toCPointer<ByteVar>(), lpdwcrasautodialaddresses?.value?.toCPointer<ByteVar>())

public actual fun rasEnumAutodialAddressesW(lpprasautodialaddresses: COpaquePointer?, lpdwcbrasautodialaddresses: COpaquePointer?, lpdwcrasautodialaddresses: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasEnumAutodialAddressesW(lpprasautodialaddresses?.value?.toCPointer<ByteVar>(), lpdwcbrasautodialaddresses?.value?.toCPointer<ByteVar>(), lpdwcrasautodialaddresses?.value?.toCPointer<ByteVar>())

public actual fun rasEnumConnectionsA(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasEnumConnectionsA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())

public actual fun rasEnumConnectionsW(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasEnumConnectionsW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())

public actual fun rasEnumDevicesA(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasEnumDevicesA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())

public actual fun rasEnumDevicesW(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasEnumDevicesW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())

public actual fun rasEnumEntriesA(param0: Pcstr, param1: Pcstr, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasEnumEntriesA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>(), param3?.value?.toCPointer<ByteVar>(), param4?.value?.toCPointer<ByteVar>())

public actual fun rasEnumEntriesW(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasEnumEntriesW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>(), param3?.value?.toCPointer<ByteVar>(), param4?.value?.toCPointer<ByteVar>())

public actual fun rasFreeEapUserIdentityA(praseapuseridentity: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasFreeEapUserIdentityA(praseapuseridentity?.value?.toCPointer<ByteVar>())
}

public actual fun rasFreeEapUserIdentityW(praseapuseridentity: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasFreeEapUserIdentityW(praseapuseridentity?.value?.toCPointer<ByteVar>())
}

public actual fun rasGetAutodialAddressA(param0: Pcstr, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetAutodialAddressA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>(), param3?.value?.toCPointer<ByteVar>(), param4?.value?.toCPointer<ByteVar>())

public actual fun rasGetAutodialAddressW(param0: Pcwstr, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetAutodialAddressW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>(), param3?.value?.toCPointer<ByteVar>(), param4?.value?.toCPointer<ByteVar>())

public actual fun rasGetAutodialEnableA(param0: UInt, param1: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetAutodialEnableA(param0, param1?.value?.toCPointer<ByteVar>())

public actual fun rasGetAutodialEnableW(param0: UInt, param1: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetAutodialEnableW(param0, param1?.value?.toCPointer<ByteVar>())

public actual fun rasGetAutodialParamA(param0: UInt, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetAutodialParamA(param0, param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())

public actual fun rasGetAutodialParamW(param0: UInt, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetAutodialParamW(param0, param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())

public actual fun rasGetConnectStatusA(param0: Hrasconn, param1: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetConnectStatusA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun rasGetConnectStatusW(param0: Hrasconn, param1: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetConnectStatusW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun rasGetConnectionStatistics(hrasconn: Hrasconn, lpstatistics: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetConnectionStatistics(hrasconn?.value?.toCPointer<ByteVar>(), lpstatistics?.value?.toCPointer<ByteVar>())

public actual fun rasGetCountryInfoA(param0: COpaquePointer?, param1: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetCountryInfoA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun rasGetCountryInfoW(param0: COpaquePointer?, param1: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetCountryInfoW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun rasGetCredentialsA(param0: Pcstr, param1: Pcstr, param2: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetCredentialsA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())

public actual fun rasGetCredentialsW(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetCredentialsW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())

public actual fun rasGetCustomAuthDataA(pszphonebook: Pcstr, pszentry: Pcstr, pbcustomauthdata: COpaquePointer?, pdwsizeofcustomauthdata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetCustomAuthDataA(pszphonebook?.value?.toCPointer<ByteVar>(), pszentry?.value?.toCPointer<ByteVar>(), pbcustomauthdata?.value?.toCPointer<ByteVar>(), pdwsizeofcustomauthdata?.value?.toCPointer<ByteVar>())

public actual fun rasGetCustomAuthDataW(pszphonebook: Pcwstr, pszentry: Pcwstr, pbcustomauthdata: COpaquePointer?, pdwsizeofcustomauthdata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetCustomAuthDataW(pszphonebook?.value?.toCPointer<ByteVar>(), pszentry?.value?.toCPointer<ByteVar>(), pbcustomauthdata?.value?.toCPointer<ByteVar>(), pdwsizeofcustomauthdata?.value?.toCPointer<ByteVar>())

public actual fun rasGetEapUserDataA(htoken: Handle, pszphonebook: Pcstr, pszentry: Pcstr, pbeapdata: COpaquePointer?, pdwsizeofeapdata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetEapUserDataA(htoken?.value?.toCPointer<ByteVar>(), pszphonebook?.value?.toCPointer<ByteVar>(), pszentry?.value?.toCPointer<ByteVar>(), pbeapdata?.value?.toCPointer<ByteVar>(), pdwsizeofeapdata?.value?.toCPointer<ByteVar>())

public actual fun rasGetEapUserDataW(htoken: Handle, pszphonebook: Pcwstr, pszentry: Pcwstr, pbeapdata: COpaquePointer?, pdwsizeofeapdata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetEapUserDataW(htoken?.value?.toCPointer<ByteVar>(), pszphonebook?.value?.toCPointer<ByteVar>(), pszentry?.value?.toCPointer<ByteVar>(), pbeapdata?.value?.toCPointer<ByteVar>(), pdwsizeofeapdata?.value?.toCPointer<ByteVar>())

public actual fun rasGetEapUserIdentityA(pszphonebook: Pcstr, pszentry: Pcstr, dwflags: UInt, hwnd: Hwnd, ppraseapuseridentity: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetEapUserIdentityA(pszphonebook?.value?.toCPointer<ByteVar>(), pszentry?.value?.toCPointer<ByteVar>(), dwflags, hwnd?.value?.toCPointer<ByteVar>(), ppraseapuseridentity?.value?.toCPointer<ByteVar>())

public actual fun rasGetEapUserIdentityW(pszphonebook: Pcwstr, pszentry: Pcwstr, dwflags: UInt, hwnd: Hwnd, ppraseapuseridentity: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetEapUserIdentityW(pszphonebook?.value?.toCPointer<ByteVar>(), pszentry?.value?.toCPointer<ByteVar>(), dwflags, hwnd?.value?.toCPointer<ByteVar>(), ppraseapuseridentity?.value?.toCPointer<ByteVar>())

public actual fun rasGetEntryDialParamsA(param0: Pcstr, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetEntryDialParamsA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())

public actual fun rasGetEntryDialParamsW(param0: Pcwstr, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetEntryDialParamsW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())

public actual fun rasGetEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetEntryPropertiesA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>(), param3?.value?.toCPointer<ByteVar>(), param4?.value?.toCPointer<ByteVar>(), param5?.value?.toCPointer<ByteVar>())

public actual fun rasGetEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetEntryPropertiesW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>(), param3?.value?.toCPointer<ByteVar>(), param4?.value?.toCPointer<ByteVar>(), param5?.value?.toCPointer<ByteVar>())

public actual fun rasGetErrorStringA(resourceid: UInt, lpszstring: Pstr, inbufsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetErrorStringA(resourceid, lpszstring?.value?.toCPointer<ByteVar>(), inbufsize)

public actual fun rasGetErrorStringW(resourceid: UInt, lpszstring: Pwstr, inbufsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetErrorStringW(resourceid, lpszstring?.value?.toCPointer<ByteVar>(), inbufsize)

public actual fun rasGetLinkStatistics(hrasconn: Hrasconn, dwsubentry: UInt, lpstatistics: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetLinkStatistics(hrasconn?.value?.toCPointer<ByteVar>(), dwsubentry, lpstatistics?.value?.toCPointer<ByteVar>())

public actual fun rasGetPCscf(lpszpcscf: Pwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetPCscf(lpszpcscf?.value?.toCPointer<ByteVar>())

public actual fun rasGetProjectionInfoA(param0: Hrasconn, param1: Rasprojection, param2: COpaquePointer?, param3: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetProjectionInfoA(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>(), param3?.value?.toCPointer<ByteVar>())

public actual fun rasGetProjectionInfoEx(hrasconn: Hrasconn, prasprojection: COpaquePointer?, lpdwsize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetProjectionInfoEx(hrasconn?.value?.toCPointer<ByteVar>(), prasprojection?.value?.toCPointer<ByteVar>(), lpdwsize?.value?.toCPointer<ByteVar>())

public actual fun rasGetProjectionInfoW(param0: Hrasconn, param1: Rasprojection, param2: COpaquePointer?, param3: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetProjectionInfoW(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>(), param3?.value?.toCPointer<ByteVar>())

public actual fun rasGetSubEntryHandleA(param0: Hrasconn, param1: UInt, param2: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryHandleA(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun rasGetSubEntryHandleW(param0: Hrasconn, param1: UInt, param2: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryHandleW(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun rasGetSubEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: UInt, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?, param6: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryPropertiesA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2, param3?.value?.toCPointer<ByteVar>(), param4?.value?.toCPointer<ByteVar>(), param5?.value?.toCPointer<ByteVar>(), param6?.value?.toCPointer<ByteVar>())

public actual fun rasGetSubEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: UInt, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?, param6: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryPropertiesW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2, param3?.value?.toCPointer<ByteVar>(), param4?.value?.toCPointer<ByteVar>(), param5?.value?.toCPointer<ByteVar>(), param6?.value?.toCPointer<ByteVar>())

public actual fun rasHangUpA(param0: Hrasconn): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasHangUpA(param0?.value?.toCPointer<ByteVar>())

public actual fun rasHangUpW(param0: Hrasconn): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasHangUpW(param0?.value?.toCPointer<ByteVar>())

public actual fun rasInvokeEapUI(param0: Hrasconn, param1: UInt, param2: COpaquePointer?, param3: Hwnd): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasInvokeEapUI(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>(), param3?.value?.toCPointer<ByteVar>())

public actual fun rasPhonebookDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasPhonebookDlgA(lpszphonebook?.value?.toCPointer<ByteVar>(), lpszentry?.value?.toCPointer<ByteVar>(), lpinfo?.value?.toCPointer<ByteVar>())

public actual fun rasPhonebookDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasPhonebookDlgW(lpszphonebook?.value?.toCPointer<ByteVar>(), lpszentry?.value?.toCPointer<ByteVar>(), lpinfo?.value?.toCPointer<ByteVar>())

public actual fun rasRenameEntryA(param0: Pcstr, param1: Pcstr, param2: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasRenameEntryA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())

public actual fun rasRenameEntryW(param0: Pcwstr, param1: Pcwstr, param2: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasRenameEntryW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())

public actual fun rasSetAutodialAddressA(param0: Pcstr, param1: UInt, param2: COpaquePointer?, param3: UInt, param4: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasSetAutodialAddressA(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>(), param3, param4)

public actual fun rasSetAutodialAddressW(param0: Pcwstr, param1: UInt, param2: COpaquePointer?, param3: UInt, param4: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasSetAutodialAddressW(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>(), param3, param4)

public actual fun rasSetAutodialEnableA(param0: UInt, param1: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasSetAutodialEnableA(param0, param1)

public actual fun rasSetAutodialEnableW(param0: UInt, param1: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasSetAutodialEnableW(param0, param1)

public actual fun rasSetAutodialParamA(param0: UInt, param1: COpaquePointer?, param2: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasSetAutodialParamA(param0, param1?.value?.toCPointer<ByteVar>(), param2)

public actual fun rasSetAutodialParamW(param0: UInt, param1: COpaquePointer?, param2: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasSetAutodialParamW(param0, param1?.value?.toCPointer<ByteVar>(), param2)

public actual fun rasSetCredentialsA(param0: Pcstr, param1: Pcstr, param2: COpaquePointer?, param3: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasSetCredentialsA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>(), param3)

public actual fun rasSetCredentialsW(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?, param3: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasSetCredentialsW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>(), param3)

public actual fun rasSetCustomAuthDataA(pszphonebook: Pcstr, pszentry: Pcstr, pbcustomauthdata: COpaquePointer?, dwsizeofcustomauthdata: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasSetCustomAuthDataA(pszphonebook?.value?.toCPointer<ByteVar>(), pszentry?.value?.toCPointer<ByteVar>(), pbcustomauthdata?.value?.toCPointer<ByteVar>(), dwsizeofcustomauthdata)

public actual fun rasSetCustomAuthDataW(pszphonebook: Pcwstr, pszentry: Pcwstr, pbcustomauthdata: COpaquePointer?, dwsizeofcustomauthdata: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasSetCustomAuthDataW(pszphonebook?.value?.toCPointer<ByteVar>(), pszentry?.value?.toCPointer<ByteVar>(), pbcustomauthdata?.value?.toCPointer<ByteVar>(), dwsizeofcustomauthdata)

public actual fun rasSetEapUserDataA(htoken: Handle, pszphonebook: Pcstr, pszentry: Pcstr, pbeapdata: COpaquePointer?, dwsizeofeapdata: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasSetEapUserDataA(htoken?.value?.toCPointer<ByteVar>(), pszphonebook?.value?.toCPointer<ByteVar>(), pszentry?.value?.toCPointer<ByteVar>(), pbeapdata?.value?.toCPointer<ByteVar>(), dwsizeofeapdata)

public actual fun rasSetEapUserDataW(htoken: Handle, pszphonebook: Pcwstr, pszentry: Pcwstr, pbeapdata: COpaquePointer?, dwsizeofeapdata: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasSetEapUserDataW(htoken?.value?.toCPointer<ByteVar>(), pszphonebook?.value?.toCPointer<ByteVar>(), pszentry?.value?.toCPointer<ByteVar>(), pbeapdata?.value?.toCPointer<ByteVar>(), dwsizeofeapdata)

public actual fun rasSetEntryDialParamsA(param0: Pcstr, param1: COpaquePointer?, param2: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasSetEntryDialParamsA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2)

public actual fun rasSetEntryDialParamsW(param0: Pcwstr, param1: COpaquePointer?, param2: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasSetEntryDialParamsW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2)

public actual fun rasSetEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?, param5: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasSetEntryPropertiesA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>(), param3, param4?.value?.toCPointer<ByteVar>(), param5)

public actual fun rasSetEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?, param5: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasSetEntryPropertiesW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>(), param3, param4?.value?.toCPointer<ByteVar>(), param5)

public actual fun rasSetSubEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: UInt, param3: COpaquePointer?, param4: UInt, param5: COpaquePointer?, param6: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasSetSubEntryPropertiesA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2, param3?.value?.toCPointer<ByteVar>(), param4, param5?.value?.toCPointer<ByteVar>(), param6)

public actual fun rasSetSubEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: UInt, param3: COpaquePointer?, param4: UInt, param5: COpaquePointer?, param6: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasSetSubEntryPropertiesW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2, param3?.value?.toCPointer<ByteVar>(), param4, param5?.value?.toCPointer<ByteVar>(), param6)

public actual fun rasUpdateConnection(hrasconn: Hrasconn, lprasupdateconn: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasUpdateConnection(hrasconn?.value?.toCPointer<ByteVar>(), lprasupdateconn?.value?.toCPointer<ByteVar>())

public actual fun rasValidateEntryNameA(param0: Pcstr, param1: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasValidateEntryNameA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun rasValidateEntryNameW(param0: Pcwstr, param1: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rasValidateEntryNameW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun rtmAddNextHop(rtmreghandle: Long, nexthopinfo: COpaquePointer?, nexthophandle: COpaquePointer?, changeflags: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmAddNextHop(rtmreghandle, nexthopinfo?.value?.toCPointer<ByteVar>(), nexthophandle?.value?.toCPointer<ByteVar>(), changeflags?.value?.toCPointer<ByteVar>())

public actual fun rtmAddRouteToDest(rtmreghandle: Long, routehandle: COpaquePointer?, destaddress: COpaquePointer?, routeinfo: COpaquePointer?, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmAddRouteToDest(rtmreghandle, routehandle?.value?.toCPointer<ByteVar>(), destaddress?.value?.toCPointer<ByteVar>(), routeinfo?.value?.toCPointer<ByteVar>(), timetolive, routelisthandle, notifytype, notifyhandle, changeflags?.value?.toCPointer<ByteVar>())

public actual fun rtmBlockMethods(rtmreghandle: Long, targethandle: Handle, targettype: UByte, blockingflag: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmBlockMethods(rtmreghandle, targethandle?.value?.toCPointer<ByteVar>(), targettype, blockingflag)

public actual fun rtmConvertIpv6AddressAndLengthToNetAddress(pnetaddress: COpaquePointer?, address: In6Addr, dwlength: UInt, dwaddresssize: UInt): UInt =
    0u

public actual fun rtmConvertNetAddressToIpv6AddressAndLength(pnetaddress: COpaquePointer?, paddress: COpaquePointer?, plength: COpaquePointer?, dwaddresssize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmConvertNetAddressToIpv6AddressAndLength(pnetaddress?.value?.toCPointer<ByteVar>(), paddress?.value?.toCPointer<ByteVar>(), plength?.value?.toCPointer<ByteVar>(), dwaddresssize)

public actual fun rtmCreateDestEnum(rtmreghandle: Long, targetviews: UInt, enumflags: UInt, netaddress: COpaquePointer?, protocolid: UInt, rtmenumhandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmCreateDestEnum(rtmreghandle, targetviews, enumflags, netaddress?.value?.toCPointer<ByteVar>(), protocolid, rtmenumhandle?.value?.toCPointer<ByteVar>())

public actual fun rtmCreateNextHopEnum(rtmreghandle: Long, enumflags: UInt, netaddress: COpaquePointer?, rtmenumhandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmCreateNextHopEnum(rtmreghandle, enumflags, netaddress?.value?.toCPointer<ByteVar>(), rtmenumhandle?.value?.toCPointer<ByteVar>())

public actual fun rtmCreateRouteEnum(rtmreghandle: Long, desthandle: Long, targetviews: UInt, enumflags: UInt, startdest: COpaquePointer?, matchingflags: UInt, criteriaroute: COpaquePointer?, criteriainterface: UInt, rtmenumhandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmCreateRouteEnum(rtmreghandle, desthandle, targetviews, enumflags, startdest?.value?.toCPointer<ByteVar>(), matchingflags, criteriaroute?.value?.toCPointer<ByteVar>(), criteriainterface, rtmenumhandle?.value?.toCPointer<ByteVar>())

public actual fun rtmCreateRouteList(rtmreghandle: Long, routelisthandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmCreateRouteList(rtmreghandle, routelisthandle?.value?.toCPointer<ByteVar>())

public actual fun rtmCreateRouteListEnum(rtmreghandle: Long, routelisthandle: Long, rtmenumhandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmCreateRouteListEnum(rtmreghandle, routelisthandle, rtmenumhandle?.value?.toCPointer<ByteVar>())

public actual fun rtmDeleteEnumHandle(rtmreghandle: Long, enumhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmDeleteEnumHandle(rtmreghandle, enumhandle)

public actual fun rtmDeleteNextHop(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmDeleteNextHop(rtmreghandle, nexthophandle, nexthopinfo?.value?.toCPointer<ByteVar>())

public actual fun rtmDeleteRouteList(rtmreghandle: Long, routelisthandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmDeleteRouteList(rtmreghandle, routelisthandle)

public actual fun rtmDeleteRouteToDest(rtmreghandle: Long, routehandle: Long, changeflags: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmDeleteRouteToDest(rtmreghandle, routehandle, changeflags?.value?.toCPointer<ByteVar>())

public actual fun rtmDeregisterEntity(rtmreghandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmDeregisterEntity(rtmreghandle)

public actual fun rtmDeregisterFromChangeNotification(rtmreghandle: Long, notifyhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmDeregisterFromChangeNotification(rtmreghandle, notifyhandle)

public actual fun rtmFindNextHop(rtmreghandle: Long, nexthopinfo: COpaquePointer?, nexthophandle: COpaquePointer?, nexthoppointer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmFindNextHop(rtmreghandle, nexthopinfo?.value?.toCPointer<ByteVar>(), nexthophandle?.value?.toCPointer<ByteVar>(), nexthoppointer?.value?.toCPointer<ByteVar>())

public actual fun rtmGetChangeStatus(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, changestatus: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmGetChangeStatus(rtmreghandle, notifyhandle, desthandle, changestatus?.value?.toCPointer<ByteVar>())

public actual fun rtmGetChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: COpaquePointer?, changeddests: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmGetChangedDests(rtmreghandle, notifyhandle, numdests?.value?.toCPointer<ByteVar>(), changeddests?.value?.toCPointer<ByteVar>())

public actual fun rtmGetDestInfo(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmGetDestInfo(rtmreghandle, desthandle, protocolid, targetviews, destinfo?.value?.toCPointer<ByteVar>())

public actual fun rtmGetEntityInfo(rtmreghandle: Long, entityhandle: Long, entityinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmGetEntityInfo(rtmreghandle, entityhandle, entityinfo?.value?.toCPointer<ByteVar>())

public actual fun rtmGetEntityMethods(rtmreghandle: Long, entityhandle: Long, nummethods: COpaquePointer?, exptmethods: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmGetEntityMethods(rtmreghandle, entityhandle, nummethods?.value?.toCPointer<ByteVar>(), exptmethods?.value?.toCPointer<ByteVar>())

public actual fun rtmGetEnumDests(rtmreghandle: Long, enumhandle: Long, numdests: COpaquePointer?, destinfos: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmGetEnumDests(rtmreghandle, enumhandle, numdests?.value?.toCPointer<ByteVar>(), destinfos?.value?.toCPointer<ByteVar>())

public actual fun rtmGetEnumNextHops(rtmreghandle: Long, enumhandle: Long, numnexthops: COpaquePointer?, nexthophandles: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmGetEnumNextHops(rtmreghandle, enumhandle, numnexthops?.value?.toCPointer<ByteVar>(), nexthophandles?.value?.toCPointer<ByteVar>())

public actual fun rtmGetEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: COpaquePointer?, routehandles: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmGetEnumRoutes(rtmreghandle, enumhandle, numroutes?.value?.toCPointer<ByteVar>(), routehandles?.value?.toCPointer<ByteVar>())

public actual fun rtmGetExactMatchDestination(rtmreghandle: Long, destaddress: COpaquePointer?, protocolid: UInt, targetviews: UInt, destinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmGetExactMatchDestination(rtmreghandle, destaddress?.value?.toCPointer<ByteVar>(), protocolid, targetviews, destinfo?.value?.toCPointer<ByteVar>())

public actual fun rtmGetExactMatchRoute(rtmreghandle: Long, destaddress: COpaquePointer?, matchingflags: UInt, routeinfo: COpaquePointer?, interfaceindex: UInt, targetviews: UInt, routehandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmGetExactMatchRoute(rtmreghandle, destaddress?.value?.toCPointer<ByteVar>(), matchingflags, routeinfo?.value?.toCPointer<ByteVar>(), interfaceindex, targetviews, routehandle?.value?.toCPointer<ByteVar>())

public actual fun rtmGetLessSpecificDestination(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmGetLessSpecificDestination(rtmreghandle, desthandle, protocolid, targetviews, destinfo?.value?.toCPointer<ByteVar>())

public actual fun rtmGetListEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: COpaquePointer?, routehandles: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmGetListEnumRoutes(rtmreghandle, enumhandle, numroutes?.value?.toCPointer<ByteVar>(), routehandles?.value?.toCPointer<ByteVar>())

public actual fun rtmGetMostSpecificDestination(rtmreghandle: Long, destaddress: COpaquePointer?, protocolid: UInt, targetviews: UInt, destinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmGetMostSpecificDestination(rtmreghandle, destaddress?.value?.toCPointer<ByteVar>(), protocolid, targetviews, destinfo?.value?.toCPointer<ByteVar>())

public actual fun rtmGetNextHopInfo(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmGetNextHopInfo(rtmreghandle, nexthophandle, nexthopinfo?.value?.toCPointer<ByteVar>())

public actual fun rtmGetNextHopPointer(rtmreghandle: Long, nexthophandle: Long, nexthoppointer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmGetNextHopPointer(rtmreghandle, nexthophandle, nexthoppointer?.value?.toCPointer<ByteVar>())

public actual fun rtmGetOpaqueInformationPointer(rtmreghandle: Long, desthandle: Long, opaqueinfopointer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmGetOpaqueInformationPointer(rtmreghandle, desthandle, opaqueinfopointer?.value?.toCPointer<ByteVar>())

public actual fun rtmGetRegisteredEntities(rtmreghandle: Long, numentities: COpaquePointer?, entityhandles: COpaquePointer?, entityinfos: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmGetRegisteredEntities(rtmreghandle, numentities?.value?.toCPointer<ByteVar>(), entityhandles?.value?.toCPointer<ByteVar>(), entityinfos?.value?.toCPointer<ByteVar>())

public actual fun rtmGetRouteInfo(rtmreghandle: Long, routehandle: Long, routeinfo: COpaquePointer?, destaddress: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmGetRouteInfo(rtmreghandle, routehandle, routeinfo?.value?.toCPointer<ByteVar>(), destaddress?.value?.toCPointer<ByteVar>())

public actual fun rtmGetRoutePointer(rtmreghandle: Long, routehandle: Long, routepointer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmGetRoutePointer(rtmreghandle, routehandle, routepointer?.value?.toCPointer<ByteVar>())

public actual fun rtmHoldDestination(rtmreghandle: Long, desthandle: Long, targetviews: UInt, holdtime: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmHoldDestination(rtmreghandle, desthandle, targetviews, holdtime)

public actual fun rtmIgnoreChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmIgnoreChangedDests(rtmreghandle, notifyhandle, numdests, changeddests?.value?.toCPointer<ByteVar>())

public actual fun rtmInsertInRouteList(rtmreghandle: Long, routelisthandle: Long, numroutes: UInt, routehandles: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmInsertInRouteList(rtmreghandle, routelisthandle, numroutes, routehandles?.value?.toCPointer<ByteVar>())

public actual fun rtmInvokeMethod(rtmreghandle: Long, entityhandle: Long, input: COpaquePointer?, outputsize: COpaquePointer?, output: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmInvokeMethod(rtmreghandle, entityhandle, input?.value?.toCPointer<ByteVar>(), outputsize?.value?.toCPointer<ByteVar>(), output?.value?.toCPointer<ByteVar>())

public actual fun rtmIsBestRoute(rtmreghandle: Long, routehandle: Long, bestinviews: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmIsBestRoute(rtmreghandle, routehandle, bestinviews?.value?.toCPointer<ByteVar>())

public actual fun rtmIsMarkedForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, destmarked: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmIsMarkedForChangeNotification(rtmreghandle, notifyhandle, desthandle, destmarked?.value?.toCPointer<ByteVar>())

public actual fun rtmLockDestination(rtmreghandle: Long, desthandle: Long, exclusive: Bool, lockdest: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmLockDestination(rtmreghandle, desthandle, exclusive, lockdest)

public actual fun rtmLockNextHop(rtmreghandle: Long, nexthophandle: Long, exclusive: Bool, locknexthop: Bool, nexthoppointer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmLockNextHop(rtmreghandle, nexthophandle, exclusive, locknexthop, nexthoppointer?.value?.toCPointer<ByteVar>())

public actual fun rtmLockRoute(rtmreghandle: Long, routehandle: Long, exclusive: Bool, lockroute: Bool, routepointer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmLockRoute(rtmreghandle, routehandle, exclusive, lockroute, routepointer?.value?.toCPointer<ByteVar>())

public actual fun rtmMarkDestForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, markdest: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmMarkDestForChangeNotification(rtmreghandle, notifyhandle, desthandle, markdest)

public actual fun rtmReferenceHandles(rtmreghandle: Long, numhandles: UInt, rtmhandles: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmReferenceHandles(rtmreghandle, numhandles, rtmhandles?.value?.toCPointer<ByteVar>())

public actual fun rtmRegisterEntity(rtmentityinfo: COpaquePointer?, exportmethods: COpaquePointer?, eventcallback: RtmEventCallback, reserveopaquepointer: Bool, rtmregprofile: COpaquePointer?, rtmreghandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmRegisterEntity(rtmentityinfo?.value?.toCPointer<ByteVar>(), exportmethods?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), reserveopaquepointer, rtmregprofile?.value?.toCPointer<ByteVar>(), rtmreghandle?.value?.toCPointer<ByteVar>())

public actual fun rtmRegisterForChangeNotification(rtmreghandle: Long, targetviews: UInt, notifyflags: UInt, notifycontext: COpaquePointer?, notifyhandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmRegisterForChangeNotification(rtmreghandle, targetviews, notifyflags, notifycontext?.value?.toCPointer<ByteVar>(), notifyhandle?.value?.toCPointer<ByteVar>())

public actual fun rtmReleaseChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmReleaseChangedDests(rtmreghandle, notifyhandle, numdests, changeddests?.value?.toCPointer<ByteVar>())

public actual fun rtmReleaseDestInfo(rtmreghandle: Long, destinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmReleaseDestInfo(rtmreghandle, destinfo?.value?.toCPointer<ByteVar>())

public actual fun rtmReleaseDests(rtmreghandle: Long, numdests: UInt, destinfos: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmReleaseDests(rtmreghandle, numdests, destinfos?.value?.toCPointer<ByteVar>())

public actual fun rtmReleaseEntities(rtmreghandle: Long, numentities: UInt, entityhandles: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmReleaseEntities(rtmreghandle, numentities, entityhandles?.value?.toCPointer<ByteVar>())

public actual fun rtmReleaseEntityInfo(rtmreghandle: Long, entityinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmReleaseEntityInfo(rtmreghandle, entityinfo?.value?.toCPointer<ByteVar>())

public actual fun rtmReleaseNextHopInfo(rtmreghandle: Long, nexthopinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmReleaseNextHopInfo(rtmreghandle, nexthopinfo?.value?.toCPointer<ByteVar>())

public actual fun rtmReleaseNextHops(rtmreghandle: Long, numnexthops: UInt, nexthophandles: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmReleaseNextHops(rtmreghandle, numnexthops, nexthophandles?.value?.toCPointer<ByteVar>())

public actual fun rtmReleaseRouteInfo(rtmreghandle: Long, routeinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmReleaseRouteInfo(rtmreghandle, routeinfo?.value?.toCPointer<ByteVar>())

public actual fun rtmReleaseRoutes(rtmreghandle: Long, numroutes: UInt, routehandles: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmReleaseRoutes(rtmreghandle, numroutes, routehandles?.value?.toCPointer<ByteVar>())

public actual fun rtmUpdateAndUnlockRoute(rtmreghandle: Long, routehandle: Long, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras.cinterop.windowssys_windows_win32_networkmanagement_rras_rtmUpdateAndUnlockRoute(rtmreghandle, routehandle, timetolive, routelisthandle, notifytype, notifyhandle, changeflags?.value?.toCPointer<ByteVar>())
