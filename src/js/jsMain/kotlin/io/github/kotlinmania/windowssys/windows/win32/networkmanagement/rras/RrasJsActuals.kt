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

private val _windowsWin32NetworkmanagementRrasNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun MgmAddGroupMembershipEntry(hprotocol: HANDLE, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MgmAddGroupMembershipEntry(hprotocol.toString(), dwsourceaddr.toInt(), dwsourcemask.toInt(), dwgroupaddr.toInt(), dwgroupmask.toInt(), dwifindex.toInt(), dwifnexthopipaddr.toInt(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun MgmDeRegisterMProtocol(hprotocol: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MgmDeRegisterMProtocol(hprotocol.toString()) as Int).toUInt() else 0u

public actual fun MgmDeleteGroupMembershipEntry(hprotocol: HANDLE, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MgmDeleteGroupMembershipEntry(hprotocol.toString(), dwsourceaddr.toInt(), dwsourcemask.toInt(), dwgroupaddr.toInt(), dwgroupmask.toInt(), dwifindex.toInt(), dwifnexthopipaddr.toInt(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun MgmGetFirstMfe(pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MgmGetFirstMfe(pdwbuffersize.toString(), pbbuffer.toString(), pdwnumentries.toString()) as Int).toUInt() else 0u

public actual fun MgmGetFirstMfeStats(pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long, dwflags: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MgmGetFirstMfeStats(pdwbuffersize.toString(), pbbuffer.toString(), pdwnumentries.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun MgmGetMfe(pimm: Long, pdwbuffersize: Long, pbbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MgmGetMfe(pimm.toString(), pdwbuffersize.toString(), pbbuffer.toString()) as Int).toUInt() else 0u

public actual fun MgmGetMfeStats(pimm: Long, pdwbuffersize: Long, pbbuffer: Long, dwflags: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MgmGetMfeStats(pimm.toString(), pdwbuffersize.toString(), pbbuffer.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun MgmGetNextMfe(pimmstart: Long, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MgmGetNextMfe(pimmstart.toString(), pdwbuffersize.toString(), pbbuffer.toString(), pdwnumentries.toString()) as Int).toUInt() else 0u

public actual fun MgmGetNextMfeStats(pimmstart: Long, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long, dwflags: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MgmGetNextMfeStats(pimmstart.toString(), pdwbuffersize.toString(), pbbuffer.toString(), pdwnumentries.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun MgmGetProtocolOnInterface(dwifindex: UInt, dwifnexthopaddr: UInt, pdwifprotocolid: Long, pdwifcomponentid: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MgmGetProtocolOnInterface(dwifindex.toInt(), dwifnexthopaddr.toInt(), pdwifprotocolid.toString(), pdwifcomponentid.toString()) as Int).toUInt() else 0u

public actual fun MgmGroupEnumerationEnd(henum: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MgmGroupEnumerationEnd(henum.toString()) as Int).toUInt() else 0u

public actual fun MgmGroupEnumerationGetNext(henum: HANDLE, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MgmGroupEnumerationGetNext(henum.toString(), pdwbuffersize.toString(), pbbuffer.toString(), pdwnumentries.toString()) as Int).toUInt() else 0u

public actual fun MgmGroupEnumerationStart(hprotocol: HANDLE, metenumtype: MGM_ENUM_TYPES, phenumhandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MgmGroupEnumerationStart(hprotocol.toString(), metenumtype, phenumhandle.toString()) as Int).toUInt() else 0u

public actual fun MgmRegisterMProtocol(prpiinfo: Long, dwprotocolid: UInt, dwcomponentid: UInt, phprotocol: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MgmRegisterMProtocol(prpiinfo.toString(), dwprotocolid.toInt(), dwcomponentid.toInt(), phprotocol.toString()) as Int).toUInt() else 0u

public actual fun MgmReleaseInterfaceOwnership(hprotocol: HANDLE, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MgmReleaseInterfaceOwnership(hprotocol.toString(), dwifindex.toInt(), dwifnexthopaddr.toInt()) as Int).toUInt() else 0u

public actual fun MgmTakeInterfaceOwnership(hprotocol: HANDLE, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MgmTakeInterfaceOwnership(hprotocol.toString(), dwifindex.toInt(), dwifnexthopaddr.toInt()) as Int).toUInt() else 0u

public actual fun MprAdminBufferFree(pbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminBufferFree(pbuffer.toString()) as Int).toUInt() else 0u

public actual fun MprAdminConnectionClearStats(hrasserver: Long, hrasconnection: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionClearStats(hrasserver.toString(), hrasconnection.toString()) as Int).toUInt() else 0u

public actual fun MprAdminConnectionEnum(hrasserver: Long, dwlevel: UInt, lplpbbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionEnum(hrasserver.toString(), dwlevel.toInt(), lplpbbuffer.toString(), dwprefmaxlen.toInt(), lpdwentriesread.toString(), lpdwtotalentries.toString(), lpdwresumehandle.toString()) as Int).toUInt() else 0u

public actual fun MprAdminConnectionEnumEx(hrasserver: Long, pobjectheader: Long, dwpreferedmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, pprasconn: Long, lpdwresumehandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionEnumEx(hrasserver.toString(), pobjectheader.toString(), dwpreferedmaxlen.toInt(), lpdwentriesread.toString(), lpdwtotalentries.toString(), pprasconn.toString(), lpdwresumehandle.toString()) as Int).toUInt() else 0u

public actual fun MprAdminConnectionGetInfo(hrasserver: Long, dwlevel: UInt, hrasconnection: HANDLE, lplpbbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionGetInfo(hrasserver.toString(), dwlevel.toInt(), hrasconnection.toString(), lplpbbuffer.toString()) as Int).toUInt() else 0u

public actual fun MprAdminConnectionGetInfoEx(hrasserver: Long, hrasconnection: HANDLE, prasconnection: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionGetInfoEx(hrasserver.toString(), hrasconnection.toString(), prasconnection.toString()) as Int).toUInt() else 0u

public actual fun MprAdminConnectionRemoveQuarantine(hrasserver: HANDLE, hrasconnection: HANDLE, fisipaddress: BOOL): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminConnectionRemoveQuarantine(hrasserver.toString(), hrasconnection.toString(), fisipaddress) as Int).toUInt() else 0u

public actual fun MprAdminDeregisterConnectionNotification(hmprserver: Long, heventnotification: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminDeregisterConnectionNotification(hmprserver.toString(), heventnotification.toString()) as Int).toUInt() else 0u

public actual fun MprAdminDeviceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long, lpdwtotalentries: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminDeviceEnum(hmprserver.toString(), dwlevel.toInt(), lplpbbuffer.toString(), lpdwtotalentries.toString()) as Int).toUInt() else 0u

public actual fun MprAdminEstablishDomainRasServer(pszdomain: PCWSTR, pszmachine: PCWSTR, benable: BOOL): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminEstablishDomainRasServer(pszdomain.toString(), pszmachine.toString(), benable) as Int).toUInt() else 0u

public actual fun MprAdminGetErrorString(dwerror: UInt, lplpwserrorstring: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminGetErrorString(dwerror.toInt(), lplpwserrorstring.toString()) as Int).toUInt() else 0u

public actual fun MprAdminGetPDCServer(lpszdomain: PCWSTR, lpszserver: PCWSTR, lpszpdcserver: PWSTR): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminGetPDCServer(lpszdomain.toString(), lpszserver.toString(), lpszpdcserver.toString()) as Int).toUInt() else 0u

public actual fun MprAdminInterfaceConnect(hmprserver: Long, hinterface: HANDLE, hevent: HANDLE, fsynchronous: BOOL): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceConnect(hmprserver.toString(), hinterface.toString(), hevent.toString(), fsynchronous) as Int).toUInt() else 0u

public actual fun MprAdminInterfaceCreate(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long, phinterface: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceCreate(hmprserver.toString(), dwlevel.toInt(), lpbbuffer.toString(), phinterface.toString()) as Int).toUInt() else 0u

public actual fun MprAdminInterfaceDelete(hmprserver: Long, hinterface: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDelete(hmprserver.toString(), hinterface.toString()) as Int).toUInt() else 0u

public actual fun MprAdminInterfaceDeviceGetInfo(hmprserver: Long, hinterface: HANDLE, dwindex: UInt, dwlevel: UInt, lplpbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDeviceGetInfo(hmprserver.toString(), hinterface.toString(), dwindex.toInt(), dwlevel.toInt(), lplpbuffer.toString()) as Int).toUInt() else 0u

public actual fun MprAdminInterfaceDeviceSetInfo(hmprserver: Long, hinterface: HANDLE, dwindex: UInt, dwlevel: UInt, lpbbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDeviceSetInfo(hmprserver.toString(), hinterface.toString(), dwindex.toInt(), dwlevel.toInt(), lpbbuffer.toString()) as Int).toUInt() else 0u

public actual fun MprAdminInterfaceDisconnect(hmprserver: Long, hinterface: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceDisconnect(hmprserver.toString(), hinterface.toString()) as Int).toUInt() else 0u

public actual fun MprAdminInterfaceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceEnum(hmprserver.toString(), dwlevel.toInt(), lplpbbuffer.toString(), dwprefmaxlen.toInt(), lpdwentriesread.toString(), lpdwtotalentries.toString(), lpdwresumehandle.toString()) as Int).toUInt() else 0u

public actual fun MprAdminInterfaceGetCredentials(lpwsserver: PCWSTR, lpwsinterfacename: PCWSTR, lpwsusername: PWSTR, lpwspassword: PWSTR, lpwsdomainname: PWSTR): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetCredentials(lpwsserver.toString(), lpwsinterfacename.toString(), lpwsusername.toString(), lpwspassword.toString(), lpwsdomainname.toString()) as Int).toUInt() else 0u

public actual fun MprAdminInterfaceGetCredentialsEx(hmprserver: Long, hinterface: HANDLE, dwlevel: UInt, lplpbbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetCredentialsEx(hmprserver.toString(), hinterface.toString(), dwlevel.toInt(), lplpbbuffer.toString()) as Int).toUInt() else 0u

public actual fun MprAdminInterfaceGetCustomInfoEx(hmprserver: Long, hinterface: HANDLE, pcustominfo: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetCustomInfoEx(hmprserver.toString(), hinterface.toString(), pcustominfo.toString()) as Int).toUInt() else 0u

public actual fun MprAdminInterfaceGetHandle(hmprserver: Long, lpwsinterfacename: PCWSTR, phinterface: Long, fincludeclientinterfaces: BOOL): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetHandle(hmprserver.toString(), lpwsinterfacename.toString(), phinterface.toString(), fincludeclientinterfaces) as Int).toUInt() else 0u

public actual fun MprAdminInterfaceGetInfo(hmprserver: Long, hinterface: HANDLE, dwlevel: UInt, lplpbbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceGetInfo(hmprserver.toString(), hinterface.toString(), dwlevel.toInt(), lplpbbuffer.toString()) as Int).toUInt() else 0u

public actual fun MprAdminInterfaceQueryUpdateResult(hmprserver: Long, hinterface: HANDLE, dwprotocolid: UInt, lpdwupdateresult: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceQueryUpdateResult(hmprserver.toString(), hinterface.toString(), dwprotocolid.toInt(), lpdwupdateresult.toString()) as Int).toUInt() else 0u

public actual fun MprAdminInterfaceSetCredentials(lpwsserver: PCWSTR, lpwsinterfacename: PCWSTR, lpwsusername: PCWSTR, lpwsdomainname: PCWSTR, lpwspassword: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetCredentials(lpwsserver.toString(), lpwsinterfacename.toString(), lpwsusername.toString(), lpwsdomainname.toString(), lpwspassword.toString()) as Int).toUInt() else 0u

public actual fun MprAdminInterfaceSetCredentialsEx(hmprserver: Long, hinterface: HANDLE, dwlevel: UInt, lpbbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetCredentialsEx(hmprserver.toString(), hinterface.toString(), dwlevel.toInt(), lpbbuffer.toString()) as Int).toUInt() else 0u

public actual fun MprAdminInterfaceSetCustomInfoEx(hmprserver: Long, hinterface: HANDLE, pcustominfo: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetCustomInfoEx(hmprserver.toString(), hinterface.toString(), pcustominfo.toString()) as Int).toUInt() else 0u

public actual fun MprAdminInterfaceSetInfo(hmprserver: Long, hinterface: HANDLE, dwlevel: UInt, lpbbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceSetInfo(hmprserver.toString(), hinterface.toString(), dwlevel.toInt(), lpbbuffer.toString()) as Int).toUInt() else 0u

public actual fun MprAdminInterfaceTransportAdd(hmprserver: Long, hinterface: HANDLE, dwtransportid: UInt, pinterfaceinfo: Long, dwinterfaceinfosize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportAdd(hmprserver.toString(), hinterface.toString(), dwtransportid.toInt(), pinterfaceinfo.toString(), dwinterfaceinfosize.toInt()) as Int).toUInt() else 0u

public actual fun MprAdminInterfaceTransportGetInfo(hmprserver: Long, hinterface: HANDLE, dwtransportid: UInt, ppinterfaceinfo: Long, lpdwinterfaceinfosize: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportGetInfo(hmprserver.toString(), hinterface.toString(), dwtransportid.toInt(), ppinterfaceinfo.toString(), lpdwinterfaceinfosize.toString()) as Int).toUInt() else 0u

public actual fun MprAdminInterfaceTransportRemove(hmprserver: Long, hinterface: HANDLE, dwtransportid: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportRemove(hmprserver.toString(), hinterface.toString(), dwtransportid.toInt()) as Int).toUInt() else 0u

public actual fun MprAdminInterfaceTransportSetInfo(hmprserver: Long, hinterface: HANDLE, dwtransportid: UInt, pinterfaceinfo: Long, dwinterfaceinfosize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceTransportSetInfo(hmprserver.toString(), hinterface.toString(), dwtransportid.toInt(), pinterfaceinfo.toString(), dwinterfaceinfosize.toInt()) as Int).toUInt() else 0u

public actual fun MprAdminInterfaceUpdatePhonebookInfo(hmprserver: Long, hinterface: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceUpdatePhonebookInfo(hmprserver.toString(), hinterface.toString()) as Int).toUInt() else 0u

public actual fun MprAdminInterfaceUpdateRoutes(hmprserver: Long, hinterface: HANDLE, dwprotocolid: UInt, hevent: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminInterfaceUpdateRoutes(hmprserver.toString(), hinterface.toString(), dwprotocolid.toInt(), hevent.toString()) as Int).toUInt() else 0u

public actual fun MprAdminIsDomainRasServer(pszdomain: PCWSTR, pszmachine: PCWSTR, pbisrasserver: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminIsDomainRasServer(pszdomain.toString(), pszmachine.toString(), pbisrasserver.toString()) as Int).toUInt() else 0u

public actual fun MprAdminIsServiceInitialized(lpwsservername: PCWSTR, fisserviceinitialized: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminIsServiceInitialized(lpwsservername.toString(), fisserviceinitialized.toString()) as Int).toUInt() else 0u

public actual fun MprAdminIsServiceRunning(lpwsservername: PCWSTR): BOOL =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminIsServiceRunning(lpwsservername.toString()) as Int) else 0

public actual fun MprAdminMIBBufferFree(pbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBBufferFree(pbuffer.toString()) as Int).toUInt() else 0u

public actual fun MprAdminMIBEntryCreate(hmibserver: Long, dwpid: UInt, dwroutingpid: UInt, lpentry: Long, dwentrysize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryCreate(hmibserver.toString(), dwpid.toInt(), dwroutingpid.toInt(), lpentry.toString(), dwentrysize.toInt()) as Int).toUInt() else 0u

public actual fun MprAdminMIBEntryDelete(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: Long, dwentrysize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryDelete(hmibserver.toString(), dwprotocolid.toInt(), dwroutingpid.toInt(), lpentry.toString(), dwentrysize.toInt()) as Int).toUInt() else 0u

public actual fun MprAdminMIBEntryGet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: Long, dwinentrysize: UInt, lplpoutentry: Long, lpoutentrysize: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryGet(hmibserver.toString(), dwprotocolid.toInt(), dwroutingpid.toInt(), lpinentry.toString(), dwinentrysize.toInt(), lplpoutentry.toString(), lpoutentrysize.toString()) as Int).toUInt() else 0u

public actual fun MprAdminMIBEntryGetFirst(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: Long, dwinentrysize: UInt, lplpoutentry: Long, lpoutentrysize: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryGetFirst(hmibserver.toString(), dwprotocolid.toInt(), dwroutingpid.toInt(), lpinentry.toString(), dwinentrysize.toInt(), lplpoutentry.toString(), lpoutentrysize.toString()) as Int).toUInt() else 0u

public actual fun MprAdminMIBEntryGetNext(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: Long, dwinentrysize: UInt, lplpoutentry: Long, lpoutentrysize: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntryGetNext(hmibserver.toString(), dwprotocolid.toInt(), dwroutingpid.toInt(), lpinentry.toString(), dwinentrysize.toInt(), lplpoutentry.toString(), lpoutentrysize.toString()) as Int).toUInt() else 0u

public actual fun MprAdminMIBEntrySet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: Long, dwentrysize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBEntrySet(hmibserver.toString(), dwprotocolid.toInt(), dwroutingpid.toInt(), lpentry.toString(), dwentrysize.toInt()) as Int).toUInt() else 0u

public actual fun MprAdminMIBServerConnect(lpwsservername: PCWSTR, phmibserver: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBServerConnect(lpwsservername.toString(), phmibserver.toString()) as Int).toUInt() else 0u

public actual fun MprAdminMIBServerDisconnect(hmibserver: Long) {
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) {
        _windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminMIBServerDisconnect(hmibserver.toString())
    }
}

public actual fun MprAdminPortClearStats(hrasserver: Long, hport: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminPortClearStats(hrasserver.toString(), hport.toString()) as Int).toUInt() else 0u

public actual fun MprAdminPortDisconnect(hrasserver: Long, hport: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminPortDisconnect(hrasserver.toString(), hport.toString()) as Int).toUInt() else 0u

public actual fun MprAdminPortEnum(hrasserver: Long, dwlevel: UInt, hrasconnection: HANDLE, lplpbbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminPortEnum(hrasserver.toString(), dwlevel.toInt(), hrasconnection.toString(), lplpbbuffer.toString(), dwprefmaxlen.toInt(), lpdwentriesread.toString(), lpdwtotalentries.toString(), lpdwresumehandle.toString()) as Int).toUInt() else 0u

public actual fun MprAdminPortGetInfo(hrasserver: Long, dwlevel: UInt, hport: HANDLE, lplpbbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminPortGetInfo(hrasserver.toString(), dwlevel.toInt(), hport.toString(), lplpbbuffer.toString()) as Int).toUInt() else 0u

public actual fun MprAdminPortReset(hrasserver: Long, hport: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminPortReset(hrasserver.toString(), hport.toString()) as Int).toUInt() else 0u

public actual fun MprAdminRegisterConnectionNotification(hmprserver: Long, heventnotification: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminRegisterConnectionNotification(hmprserver.toString(), heventnotification.toString()) as Int).toUInt() else 0u

public actual fun MprAdminSendUserMessage(hmprserver: Long, hconnection: HANDLE, lpwszmessage: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminSendUserMessage(hmprserver.toString(), hconnection.toString(), lpwszmessage.toString()) as Int).toUInt() else 0u

public actual fun MprAdminServerConnect(lpwsservername: PCWSTR, phmprserver: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminServerConnect(lpwsservername.toString(), phmprserver.toString()) as Int).toUInt() else 0u

public actual fun MprAdminServerDisconnect(hmprserver: Long) {
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) {
        _windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminServerDisconnect(hmprserver.toString())
    }
}

public actual fun MprAdminServerGetCredentials(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminServerGetCredentials(hmprserver.toString(), dwlevel.toInt(), lplpbbuffer.toString()) as Int).toUInt() else 0u

public actual fun MprAdminServerGetInfo(hmprserver: Long, dwlevel: UInt, lplpbbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminServerGetInfo(hmprserver.toString(), dwlevel.toInt(), lplpbbuffer.toString()) as Int).toUInt() else 0u

public actual fun MprAdminServerGetInfoEx(hmprserver: Long, pserverinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminServerGetInfoEx(hmprserver.toString(), pserverinfo.toString()) as Int).toUInt() else 0u

public actual fun MprAdminServerSetCredentials(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminServerSetCredentials(hmprserver.toString(), dwlevel.toInt(), lpbbuffer.toString()) as Int).toUInt() else 0u

public actual fun MprAdminServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminServerSetInfo(hmprserver.toString(), dwlevel.toInt(), lpbbuffer.toString()) as Int).toUInt() else 0u

public actual fun MprAdminServerSetInfoEx(hmprserver: Long, pserverinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminServerSetInfoEx(hmprserver.toString(), pserverinfo.toString()) as Int).toUInt() else 0u

public actual fun MprAdminTransportCreate(hmprserver: Long, dwtransportid: UInt, lpwstransportname: PCWSTR, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt, lpwsdllpath: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminTransportCreate(hmprserver.toString(), dwtransportid.toInt(), lpwstransportname.toString(), pglobalinfo.toString(), dwglobalinfosize.toInt(), pclientinterfaceinfo.toString(), dwclientinterfaceinfosize.toInt(), lpwsdllpath.toString()) as Int).toUInt() else 0u

public actual fun MprAdminTransportGetInfo(hmprserver: Long, dwtransportid: UInt, ppglobalinfo: Long, lpdwglobalinfosize: Long, ppclientinterfaceinfo: Long, lpdwclientinterfaceinfosize: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminTransportGetInfo(hmprserver.toString(), dwtransportid.toInt(), ppglobalinfo.toString(), lpdwglobalinfosize.toString(), ppclientinterfaceinfo.toString(), lpdwclientinterfaceinfosize.toString()) as Int).toUInt() else 0u

public actual fun MprAdminTransportSetInfo(hmprserver: Long, dwtransportid: UInt, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminTransportSetInfo(hmprserver.toString(), dwtransportid.toInt(), pglobalinfo.toString(), dwglobalinfosize.toInt(), pclientinterfaceinfo.toString(), dwclientinterfaceinfosize.toInt()) as Int).toUInt() else 0u

public actual fun MprAdminUpdateConnection(hrasserver: Long, hrasconnection: HANDLE, prasupdateconnection: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminUpdateConnection(hrasserver.toString(), hrasconnection.toString(), prasupdateconnection.toString()) as Int).toUInt() else 0u

public actual fun MprAdminUserGetInfo(lpszserver: PCWSTR, lpszuser: PCWSTR, dwlevel: UInt, lpbbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminUserGetInfo(lpszserver.toString(), lpszuser.toString(), dwlevel.toInt(), lpbbuffer.toString()) as Int).toUInt() else 0u

public actual fun MprAdminUserSetInfo(lpszserver: PCWSTR, lpszuser: PCWSTR, dwlevel: UInt, lpbbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprAdminUserSetInfo(lpszserver.toString(), lpszuser.toString(), dwlevel.toInt(), lpbbuffer.toString()) as Int).toUInt() else 0u

public actual fun MprConfigBufferFree(pbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigBufferFree(pbuffer.toString()) as Int).toUInt() else 0u

public actual fun MprConfigFilterGetInfo(hmprconfig: HANDLE, dwlevel: UInt, dwtransportid: UInt, lpbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigFilterGetInfo(hmprconfig.toString(), dwlevel.toInt(), dwtransportid.toInt(), lpbuffer.toString()) as Int).toUInt() else 0u

public actual fun MprConfigFilterSetInfo(hmprconfig: HANDLE, dwlevel: UInt, dwtransportid: UInt, lpbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigFilterSetInfo(hmprconfig.toString(), dwlevel.toInt(), dwtransportid.toInt(), lpbuffer.toString()) as Int).toUInt() else 0u

public actual fun MprConfigGetFriendlyName(hmprconfig: HANDLE, pszguidname: PCWSTR, pszbuffer: PWSTR, dwbuffersize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigGetFriendlyName(hmprconfig.toString(), pszguidname.toString(), pszbuffer.toString(), dwbuffersize.toInt()) as Int).toUInt() else 0u

public actual fun MprConfigGetGuidName(hmprconfig: HANDLE, pszfriendlyname: PCWSTR, pszbuffer: PWSTR, dwbuffersize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigGetGuidName(hmprconfig.toString(), pszfriendlyname.toString(), pszbuffer.toString(), dwbuffersize.toInt()) as Int).toUInt() else 0u

public actual fun MprConfigInterfaceCreate(hmprconfig: HANDLE, dwlevel: UInt, lpbbuffer: Long, phrouterinterface: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceCreate(hmprconfig.toString(), dwlevel.toInt(), lpbbuffer.toString(), phrouterinterface.toString()) as Int).toUInt() else 0u

public actual fun MprConfigInterfaceDelete(hmprconfig: HANDLE, hrouterinterface: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceDelete(hmprconfig.toString(), hrouterinterface.toString()) as Int).toUInt() else 0u

public actual fun MprConfigInterfaceEnum(hmprconfig: HANDLE, dwlevel: UInt, lplpbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceEnum(hmprconfig.toString(), dwlevel.toInt(), lplpbuffer.toString(), dwprefmaxlen.toInt(), lpdwentriesread.toString(), lpdwtotalentries.toString(), lpdwresumehandle.toString()) as Int).toUInt() else 0u

public actual fun MprConfigInterfaceGetCustomInfoEx(hmprconfig: HANDLE, hrouterinterface: HANDLE, pcustominfo: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceGetCustomInfoEx(hmprconfig.toString(), hrouterinterface.toString(), pcustominfo.toString()) as Int).toUInt() else 0u

public actual fun MprConfigInterfaceGetHandle(hmprconfig: HANDLE, lpwsinterfacename: PCWSTR, phrouterinterface: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceGetHandle(hmprconfig.toString(), lpwsinterfacename.toString(), phrouterinterface.toString()) as Int).toUInt() else 0u

public actual fun MprConfigInterfaceGetInfo(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwlevel: UInt, lplpbuffer: Long, lpdwbuffersize: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceGetInfo(hmprconfig.toString(), hrouterinterface.toString(), dwlevel.toInt(), lplpbuffer.toString(), lpdwbuffersize.toString()) as Int).toUInt() else 0u

public actual fun MprConfigInterfaceSetCustomInfoEx(hmprconfig: HANDLE, hrouterinterface: HANDLE, pcustominfo: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceSetCustomInfoEx(hmprconfig.toString(), hrouterinterface.toString(), pcustominfo.toString()) as Int).toUInt() else 0u

public actual fun MprConfigInterfaceSetInfo(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwlevel: UInt, lpbbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceSetInfo(hmprconfig.toString(), hrouterinterface.toString(), dwlevel.toInt(), lpbbuffer.toString()) as Int).toUInt() else 0u

public actual fun MprConfigInterfaceTransportAdd(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwtransportid: UInt, lpwstransportname: PCWSTR, pinterfaceinfo: Long, dwinterfaceinfosize: UInt, phrouteriftransport: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportAdd(hmprconfig.toString(), hrouterinterface.toString(), dwtransportid.toInt(), lpwstransportname.toString(), pinterfaceinfo.toString(), dwinterfaceinfosize.toInt(), phrouteriftransport.toString()) as Int).toUInt() else 0u

public actual fun MprConfigInterfaceTransportEnum(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwlevel: UInt, lplpbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportEnum(hmprconfig.toString(), hrouterinterface.toString(), dwlevel.toInt(), lplpbuffer.toString(), dwprefmaxlen.toInt(), lpdwentriesread.toString(), lpdwtotalentries.toString(), lpdwresumehandle.toString()) as Int).toUInt() else 0u

public actual fun MprConfigInterfaceTransportGetHandle(hmprconfig: HANDLE, hrouterinterface: HANDLE, dwtransportid: UInt, phrouteriftransport: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportGetHandle(hmprconfig.toString(), hrouterinterface.toString(), dwtransportid.toInt(), phrouteriftransport.toString()) as Int).toUInt() else 0u

public actual fun MprConfigInterfaceTransportGetInfo(hmprconfig: HANDLE, hrouterinterface: HANDLE, hrouteriftransport: HANDLE, ppinterfaceinfo: Long, lpdwinterfaceinfosize: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportGetInfo(hmprconfig.toString(), hrouterinterface.toString(), hrouteriftransport.toString(), ppinterfaceinfo.toString(), lpdwinterfaceinfosize.toString()) as Int).toUInt() else 0u

public actual fun MprConfigInterfaceTransportRemove(hmprconfig: HANDLE, hrouterinterface: HANDLE, hrouteriftransport: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportRemove(hmprconfig.toString(), hrouterinterface.toString(), hrouteriftransport.toString()) as Int).toUInt() else 0u

public actual fun MprConfigInterfaceTransportSetInfo(hmprconfig: HANDLE, hrouterinterface: HANDLE, hrouteriftransport: HANDLE, pinterfaceinfo: Long, dwinterfaceinfosize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigInterfaceTransportSetInfo(hmprconfig.toString(), hrouterinterface.toString(), hrouteriftransport.toString(), pinterfaceinfo.toString(), dwinterfaceinfosize.toInt()) as Int).toUInt() else 0u

public actual fun MprConfigServerBackup(hmprconfig: HANDLE, lpwspath: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigServerBackup(hmprconfig.toString(), lpwspath.toString()) as Int).toUInt() else 0u

public actual fun MprConfigServerConnect(lpwsservername: PCWSTR, phmprconfig: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigServerConnect(lpwsservername.toString(), phmprconfig.toString()) as Int).toUInt() else 0u

public actual fun MprConfigServerDisconnect(hmprconfig: HANDLE) {
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) {
        _windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigServerDisconnect(hmprconfig.toString())
    }
}

public actual fun MprConfigServerGetInfo(hmprconfig: HANDLE, dwlevel: UInt, lplpbbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigServerGetInfo(hmprconfig.toString(), dwlevel.toInt(), lplpbbuffer.toString()) as Int).toUInt() else 0u

public actual fun MprConfigServerGetInfoEx(hmprconfig: HANDLE, pserverinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigServerGetInfoEx(hmprconfig.toString(), pserverinfo.toString()) as Int).toUInt() else 0u

public actual fun MprConfigServerInstall(dwlevel: UInt, pbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigServerInstall(dwlevel.toInt(), pbuffer.toString()) as Int).toUInt() else 0u

public actual fun MprConfigServerRefresh(hmprconfig: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigServerRefresh(hmprconfig.toString()) as Int).toUInt() else 0u

public actual fun MprConfigServerRestore(hmprconfig: HANDLE, lpwspath: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigServerRestore(hmprconfig.toString(), lpwspath.toString()) as Int).toUInt() else 0u

public actual fun MprConfigServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigServerSetInfo(hmprserver.toString(), dwlevel.toInt(), lpbbuffer.toString()) as Int).toUInt() else 0u

public actual fun MprConfigServerSetInfoEx(hmprconfig: HANDLE, psetserverconfig: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigServerSetInfoEx(hmprconfig.toString(), psetserverconfig.toString()) as Int).toUInt() else 0u

public actual fun MprConfigTransportCreate(hmprconfig: HANDLE, dwtransportid: UInt, lpwstransportname: PCWSTR, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt, lpwsdllpath: PCWSTR, phroutertransport: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigTransportCreate(hmprconfig.toString(), dwtransportid.toInt(), lpwstransportname.toString(), pglobalinfo.toString(), dwglobalinfosize.toInt(), pclientinterfaceinfo.toString(), dwclientinterfaceinfosize.toInt(), lpwsdllpath.toString(), phroutertransport.toString()) as Int).toUInt() else 0u

public actual fun MprConfigTransportDelete(hmprconfig: HANDLE, hroutertransport: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigTransportDelete(hmprconfig.toString(), hroutertransport.toString()) as Int).toUInt() else 0u

public actual fun MprConfigTransportEnum(hmprconfig: HANDLE, dwlevel: UInt, lplpbuffer: Long, dwprefmaxlen: UInt, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigTransportEnum(hmprconfig.toString(), dwlevel.toInt(), lplpbuffer.toString(), dwprefmaxlen.toInt(), lpdwentriesread.toString(), lpdwtotalentries.toString(), lpdwresumehandle.toString()) as Int).toUInt() else 0u

public actual fun MprConfigTransportGetHandle(hmprconfig: HANDLE, dwtransportid: UInt, phroutertransport: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigTransportGetHandle(hmprconfig.toString(), dwtransportid.toInt(), phroutertransport.toString()) as Int).toUInt() else 0u

public actual fun MprConfigTransportGetInfo(hmprconfig: HANDLE, hroutertransport: HANDLE, ppglobalinfo: Long, lpdwglobalinfosize: Long, ppclientinterfaceinfo: Long, lpdwclientinterfaceinfosize: Long, lplpwsdllpath: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigTransportGetInfo(hmprconfig.toString(), hroutertransport.toString(), ppglobalinfo.toString(), lpdwglobalinfosize.toString(), ppclientinterfaceinfo.toString(), lpdwclientinterfaceinfosize.toString(), lplpwsdllpath.toString()) as Int).toUInt() else 0u

public actual fun MprConfigTransportSetInfo(hmprconfig: HANDLE, hroutertransport: HANDLE, pglobalinfo: Long, dwglobalinfosize: UInt, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: UInt, lpwsdllpath: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprConfigTransportSetInfo(hmprconfig.toString(), hroutertransport.toString(), pglobalinfo.toString(), dwglobalinfosize.toInt(), pclientinterfaceinfo.toString(), dwclientinterfaceinfosize.toInt(), lpwsdllpath.toString()) as Int).toUInt() else 0u

public actual fun MprInfoBlockAdd(lpheader: Long, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: Long, lplpnewheader: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprInfoBlockAdd(lpheader.toString(), dwinfotype.toInt(), dwitemsize.toInt(), dwitemcount.toInt(), lpitemdata.toString(), lplpnewheader.toString()) as Int).toUInt() else 0u

public actual fun MprInfoBlockFind(lpheader: Long, dwinfotype: UInt, lpdwitemsize: Long, lpdwitemcount: Long, lplpitemdata: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprInfoBlockFind(lpheader.toString(), dwinfotype.toInt(), lpdwitemsize.toString(), lpdwitemcount.toString(), lplpitemdata.toString()) as Int).toUInt() else 0u

public actual fun MprInfoBlockQuerySize(lpheader: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprInfoBlockQuerySize(lpheader.toString()) as Int).toUInt() else 0u

public actual fun MprInfoBlockRemove(lpheader: Long, dwinfotype: UInt, lplpnewheader: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprInfoBlockRemove(lpheader.toString(), dwinfotype.toInt(), lplpnewheader.toString()) as Int).toUInt() else 0u

public actual fun MprInfoBlockSet(lpheader: Long, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: Long, lplpnewheader: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprInfoBlockSet(lpheader.toString(), dwinfotype.toInt(), dwitemsize.toInt(), dwitemcount.toInt(), lpitemdata.toString(), lplpnewheader.toString()) as Int).toUInt() else 0u

public actual fun MprInfoCreate(dwversion: UInt, lplpnewheader: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprInfoCreate(dwversion.toInt(), lplpnewheader.toString()) as Int).toUInt() else 0u

public actual fun MprInfoDelete(lpheader: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprInfoDelete(lpheader.toString()) as Int).toUInt() else 0u

public actual fun MprInfoDuplicate(lpheader: Long, lplpnewheader: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprInfoDuplicate(lpheader.toString(), lplpnewheader.toString()) as Int).toUInt() else 0u

public actual fun MprInfoRemoveAll(lpheader: Long, lplpnewheader: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_MprInfoRemoveAll(lpheader.toString(), lplpnewheader.toString()) as Int).toUInt() else 0u

public actual fun RasClearConnectionStatistics(hrasconn: HRASCONN): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasClearConnectionStatistics(hrasconn.toString()) as Int).toUInt() else 0u

public actual fun RasClearLinkStatistics(hrasconn: HRASCONN, dwsubentry: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasClearLinkStatistics(hrasconn.toString(), dwsubentry.toInt()) as Int).toUInt() else 0u

public actual fun RasConnectionNotificationA(param0: HRASCONN, param1: HANDLE, param2: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasConnectionNotificationA(param0.toString(), param1.toString(), param2.toInt()) as Int).toUInt() else 0u

public actual fun RasConnectionNotificationW(param0: HRASCONN, param1: HANDLE, param2: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasConnectionNotificationW(param0.toString(), param1.toString(), param2.toInt()) as Int).toUInt() else 0u

public actual fun RasCreatePhonebookEntryA(param0: HWND, param1: PCSTR): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasCreatePhonebookEntryA(param0.toString(), param1.toString()) as Int).toUInt() else 0u

public actual fun RasCreatePhonebookEntryW(param0: HWND, param1: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasCreatePhonebookEntryW(param0.toString(), param1.toString()) as Int).toUInt() else 0u

public actual fun RasDeleteEntryA(param0: PCSTR, param1: PCSTR): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasDeleteEntryA(param0.toString(), param1.toString()) as Int).toUInt() else 0u

public actual fun RasDeleteEntryW(param0: PCWSTR, param1: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasDeleteEntryW(param0.toString(), param1.toString()) as Int).toUInt() else 0u

public actual fun RasDeleteSubEntryA(pszphonebook: PCSTR, pszentry: PCSTR, dwsubentryid: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasDeleteSubEntryA(pszphonebook.toString(), pszentry.toString(), dwsubentryid.toInt()) as Int).toUInt() else 0u

public actual fun RasDeleteSubEntryW(pszphonebook: PCWSTR, pszentry: PCWSTR, dwsubentryid: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasDeleteSubEntryW(pszphonebook.toString(), pszentry.toString(), dwsubentryid.toInt()) as Int).toUInt() else 0u

public actual fun RasDialA(param0: Long, param1: PCSTR, param2: Long, param3: UInt, param4: Long, param5: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasDialA(param0.toString(), param1.toString(), param2.toString(), param3.toInt(), param4.toString(), param5.toString()) as Int).toUInt() else 0u

public actual fun RasDialDlgA(lpszphonebook: PCSTR, lpszentry: PCSTR, lpszphonenumber: PCSTR, lpinfo: Long): BOOL =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasDialDlgA(lpszphonebook.toString(), lpszentry.toString(), lpszphonenumber.toString(), lpinfo.toString()) as Int) else 0

public actual fun RasDialDlgW(lpszphonebook: PCWSTR, lpszentry: PCWSTR, lpszphonenumber: PCWSTR, lpinfo: Long): BOOL =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasDialDlgW(lpszphonebook.toString(), lpszentry.toString(), lpszphonenumber.toString(), lpinfo.toString()) as Int) else 0

public actual fun RasDialW(param0: Long, param1: PCWSTR, param2: Long, param3: UInt, param4: Long, param5: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasDialW(param0.toString(), param1.toString(), param2.toString(), param3.toInt(), param4.toString(), param5.toString()) as Int).toUInt() else 0u

public actual fun RasEditPhonebookEntryA(param0: HWND, param1: PCSTR, param2: PCSTR): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasEditPhonebookEntryA(param0.toString(), param1.toString(), param2.toString()) as Int).toUInt() else 0u

public actual fun RasEditPhonebookEntryW(param0: HWND, param1: PCWSTR, param2: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasEditPhonebookEntryW(param0.toString(), param1.toString(), param2.toString()) as Int).toUInt() else 0u

public actual fun RasEntryDlgA(lpszphonebook: PCSTR, lpszentry: PCSTR, lpinfo: Long): BOOL =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasEntryDlgA(lpszphonebook.toString(), lpszentry.toString(), lpinfo.toString()) as Int) else 0

public actual fun RasEntryDlgW(lpszphonebook: PCWSTR, lpszentry: PCWSTR, lpinfo: Long): BOOL =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasEntryDlgW(lpszphonebook.toString(), lpszentry.toString(), lpinfo.toString()) as Int) else 0

public actual fun RasEnumAutodialAddressesA(lpprasautodialaddresses: Long, lpdwcbrasautodialaddresses: Long, lpdwcrasautodialaddresses: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasEnumAutodialAddressesA(lpprasautodialaddresses.toString(), lpdwcbrasautodialaddresses.toString(), lpdwcrasautodialaddresses.toString()) as Int).toUInt() else 0u

public actual fun RasEnumAutodialAddressesW(lpprasautodialaddresses: Long, lpdwcbrasautodialaddresses: Long, lpdwcrasautodialaddresses: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasEnumAutodialAddressesW(lpprasautodialaddresses.toString(), lpdwcbrasautodialaddresses.toString(), lpdwcrasautodialaddresses.toString()) as Int).toUInt() else 0u

public actual fun RasEnumConnectionsA(param0: Long, param1: Long, param2: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasEnumConnectionsA(param0.toString(), param1.toString(), param2.toString()) as Int).toUInt() else 0u

public actual fun RasEnumConnectionsW(param0: Long, param1: Long, param2: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasEnumConnectionsW(param0.toString(), param1.toString(), param2.toString()) as Int).toUInt() else 0u

public actual fun RasEnumDevicesA(param0: Long, param1: Long, param2: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasEnumDevicesA(param0.toString(), param1.toString(), param2.toString()) as Int).toUInt() else 0u

public actual fun RasEnumDevicesW(param0: Long, param1: Long, param2: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasEnumDevicesW(param0.toString(), param1.toString(), param2.toString()) as Int).toUInt() else 0u

public actual fun RasEnumEntriesA(param0: PCSTR, param1: PCSTR, param2: Long, param3: Long, param4: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasEnumEntriesA(param0.toString(), param1.toString(), param2.toString(), param3.toString(), param4.toString()) as Int).toUInt() else 0u

public actual fun RasEnumEntriesW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: Long, param4: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasEnumEntriesW(param0.toString(), param1.toString(), param2.toString(), param3.toString(), param4.toString()) as Int).toUInt() else 0u

public actual fun RasFreeEapUserIdentityA(praseapuseridentity: Long) {
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) {
        _windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasFreeEapUserIdentityA(praseapuseridentity.toString())
    }
}

public actual fun RasFreeEapUserIdentityW(praseapuseridentity: Long) {
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) {
        _windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasFreeEapUserIdentityW(praseapuseridentity.toString())
    }
}

public actual fun RasGetAutodialAddressA(param0: PCSTR, param1: Long, param2: Long, param3: Long, param4: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetAutodialAddressA(param0.toString(), param1.toString(), param2.toString(), param3.toString(), param4.toString()) as Int).toUInt() else 0u

public actual fun RasGetAutodialAddressW(param0: PCWSTR, param1: Long, param2: Long, param3: Long, param4: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetAutodialAddressW(param0.toString(), param1.toString(), param2.toString(), param3.toString(), param4.toString()) as Int).toUInt() else 0u

public actual fun RasGetAutodialEnableA(param0: UInt, param1: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetAutodialEnableA(param0.toInt(), param1.toString()) as Int).toUInt() else 0u

public actual fun RasGetAutodialEnableW(param0: UInt, param1: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetAutodialEnableW(param0.toInt(), param1.toString()) as Int).toUInt() else 0u

public actual fun RasGetAutodialParamA(param0: UInt, param1: Long, param2: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetAutodialParamA(param0.toInt(), param1.toString(), param2.toString()) as Int).toUInt() else 0u

public actual fun RasGetAutodialParamW(param0: UInt, param1: Long, param2: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetAutodialParamW(param0.toInt(), param1.toString(), param2.toString()) as Int).toUInt() else 0u

public actual fun RasGetConnectStatusA(param0: HRASCONN, param1: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetConnectStatusA(param0.toString(), param1.toString()) as Int).toUInt() else 0u

public actual fun RasGetConnectStatusW(param0: HRASCONN, param1: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetConnectStatusW(param0.toString(), param1.toString()) as Int).toUInt() else 0u

public actual fun RasGetConnectionStatistics(hrasconn: HRASCONN, lpstatistics: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetConnectionStatistics(hrasconn.toString(), lpstatistics.toString()) as Int).toUInt() else 0u

public actual fun RasGetCountryInfoA(param0: Long, param1: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetCountryInfoA(param0.toString(), param1.toString()) as Int).toUInt() else 0u

public actual fun RasGetCountryInfoW(param0: Long, param1: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetCountryInfoW(param0.toString(), param1.toString()) as Int).toUInt() else 0u

public actual fun RasGetCredentialsA(param0: PCSTR, param1: PCSTR, param2: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetCredentialsA(param0.toString(), param1.toString(), param2.toString()) as Int).toUInt() else 0u

public actual fun RasGetCredentialsW(param0: PCWSTR, param1: PCWSTR, param2: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetCredentialsW(param0.toString(), param1.toString(), param2.toString()) as Int).toUInt() else 0u

public actual fun RasGetCustomAuthDataA(pszphonebook: PCSTR, pszentry: PCSTR, pbcustomauthdata: Long, pdwsizeofcustomauthdata: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetCustomAuthDataA(pszphonebook.toString(), pszentry.toString(), pbcustomauthdata.toString(), pdwsizeofcustomauthdata.toString()) as Int).toUInt() else 0u

public actual fun RasGetCustomAuthDataW(pszphonebook: PCWSTR, pszentry: PCWSTR, pbcustomauthdata: Long, pdwsizeofcustomauthdata: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetCustomAuthDataW(pszphonebook.toString(), pszentry.toString(), pbcustomauthdata.toString(), pdwsizeofcustomauthdata.toString()) as Int).toUInt() else 0u

public actual fun RasGetEapUserDataA(htoken: HANDLE, pszphonebook: PCSTR, pszentry: PCSTR, pbeapdata: Long, pdwsizeofeapdata: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetEapUserDataA(htoken.toString(), pszphonebook.toString(), pszentry.toString(), pbeapdata.toString(), pdwsizeofeapdata.toString()) as Int).toUInt() else 0u

public actual fun RasGetEapUserDataW(htoken: HANDLE, pszphonebook: PCWSTR, pszentry: PCWSTR, pbeapdata: Long, pdwsizeofeapdata: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetEapUserDataW(htoken.toString(), pszphonebook.toString(), pszentry.toString(), pbeapdata.toString(), pdwsizeofeapdata.toString()) as Int).toUInt() else 0u

public actual fun RasGetEapUserIdentityA(pszphonebook: PCSTR, pszentry: PCSTR, dwflags: UInt, hwnd: HWND, ppraseapuseridentity: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetEapUserIdentityA(pszphonebook.toString(), pszentry.toString(), dwflags.toInt(), hwnd.toString(), ppraseapuseridentity.toString()) as Int).toUInt() else 0u

public actual fun RasGetEapUserIdentityW(pszphonebook: PCWSTR, pszentry: PCWSTR, dwflags: UInt, hwnd: HWND, ppraseapuseridentity: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetEapUserIdentityW(pszphonebook.toString(), pszentry.toString(), dwflags.toInt(), hwnd.toString(), ppraseapuseridentity.toString()) as Int).toUInt() else 0u

public actual fun RasGetEntryDialParamsA(param0: PCSTR, param1: Long, param2: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetEntryDialParamsA(param0.toString(), param1.toString(), param2.toString()) as Int).toUInt() else 0u

public actual fun RasGetEntryDialParamsW(param0: PCWSTR, param1: Long, param2: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetEntryDialParamsW(param0.toString(), param1.toString(), param2.toString()) as Int).toUInt() else 0u

public actual fun RasGetEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: Long, param3: Long, param4: Long, param5: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetEntryPropertiesA(param0.toString(), param1.toString(), param2.toString(), param3.toString(), param4.toString(), param5.toString()) as Int).toUInt() else 0u

public actual fun RasGetEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: Long, param4: Long, param5: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetEntryPropertiesW(param0.toString(), param1.toString(), param2.toString(), param3.toString(), param4.toString(), param5.toString()) as Int).toUInt() else 0u

public actual fun RasGetErrorStringA(resourceid: UInt, lpszstring: PSTR, inbufsize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetErrorStringA(resourceid.toInt(), lpszstring.toString(), inbufsize.toInt()) as Int).toUInt() else 0u

public actual fun RasGetErrorStringW(resourceid: UInt, lpszstring: PWSTR, inbufsize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetErrorStringW(resourceid.toInt(), lpszstring.toString(), inbufsize.toInt()) as Int).toUInt() else 0u

public actual fun RasGetLinkStatistics(hrasconn: HRASCONN, dwsubentry: UInt, lpstatistics: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetLinkStatistics(hrasconn.toString(), dwsubentry.toInt(), lpstatistics.toString()) as Int).toUInt() else 0u

public actual fun RasGetPCscf(lpszpcscf: PWSTR): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetPCscf(lpszpcscf.toString()) as Int).toUInt() else 0u

public actual fun RasGetProjectionInfoA(param0: HRASCONN, param1: RASPROJECTION, param2: Long, param3: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetProjectionInfoA(param0.toString(), param1, param2.toString(), param3.toString()) as Int).toUInt() else 0u

public actual fun RasGetProjectionInfoEx(hrasconn: HRASCONN, prasprojection: Long, lpdwsize: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetProjectionInfoEx(hrasconn.toString(), prasprojection.toString(), lpdwsize.toString()) as Int).toUInt() else 0u

public actual fun RasGetProjectionInfoW(param0: HRASCONN, param1: RASPROJECTION, param2: Long, param3: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetProjectionInfoW(param0.toString(), param1, param2.toString(), param3.toString()) as Int).toUInt() else 0u

public actual fun RasGetSubEntryHandleA(param0: HRASCONN, param1: UInt, param2: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryHandleA(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun RasGetSubEntryHandleW(param0: HRASCONN, param1: UInt, param2: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryHandleW(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun RasGetSubEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: UInt, param3: Long, param4: Long, param5: Long, param6: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryPropertiesA(param0.toString(), param1.toString(), param2.toInt(), param3.toString(), param4.toString(), param5.toString(), param6.toString()) as Int).toUInt() else 0u

public actual fun RasGetSubEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: UInt, param3: Long, param4: Long, param5: Long, param6: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasGetSubEntryPropertiesW(param0.toString(), param1.toString(), param2.toInt(), param3.toString(), param4.toString(), param5.toString(), param6.toString()) as Int).toUInt() else 0u

public actual fun RasHangUpA(param0: HRASCONN): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasHangUpA(param0.toString()) as Int).toUInt() else 0u

public actual fun RasHangUpW(param0: HRASCONN): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasHangUpW(param0.toString()) as Int).toUInt() else 0u

public actual fun RasInvokeEapUI(param0: HRASCONN, param1: UInt, param2: Long, param3: HWND): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasInvokeEapUI(param0.toString(), param1.toInt(), param2.toString(), param3.toString()) as Int).toUInt() else 0u

public actual fun RasPhonebookDlgA(lpszphonebook: PCSTR, lpszentry: PCSTR, lpinfo: Long): BOOL =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasPhonebookDlgA(lpszphonebook.toString(), lpszentry.toString(), lpinfo.toString()) as Int) else 0

public actual fun RasPhonebookDlgW(lpszphonebook: PCWSTR, lpszentry: PCWSTR, lpinfo: Long): BOOL =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasPhonebookDlgW(lpszphonebook.toString(), lpszentry.toString(), lpinfo.toString()) as Int) else 0

public actual fun RasRenameEntryA(param0: PCSTR, param1: PCSTR, param2: PCSTR): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasRenameEntryA(param0.toString(), param1.toString(), param2.toString()) as Int).toUInt() else 0u

public actual fun RasRenameEntryW(param0: PCWSTR, param1: PCWSTR, param2: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasRenameEntryW(param0.toString(), param1.toString(), param2.toString()) as Int).toUInt() else 0u

public actual fun RasSetAutodialAddressA(param0: PCSTR, param1: UInt, param2: Long, param3: UInt, param4: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasSetAutodialAddressA(param0.toString(), param1.toInt(), param2.toString(), param3.toInt(), param4.toInt()) as Int).toUInt() else 0u

public actual fun RasSetAutodialAddressW(param0: PCWSTR, param1: UInt, param2: Long, param3: UInt, param4: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasSetAutodialAddressW(param0.toString(), param1.toInt(), param2.toString(), param3.toInt(), param4.toInt()) as Int).toUInt() else 0u

public actual fun RasSetAutodialEnableA(param0: UInt, param1: BOOL): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasSetAutodialEnableA(param0.toInt(), param1) as Int).toUInt() else 0u

public actual fun RasSetAutodialEnableW(param0: UInt, param1: BOOL): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasSetAutodialEnableW(param0.toInt(), param1) as Int).toUInt() else 0u

public actual fun RasSetAutodialParamA(param0: UInt, param1: Long, param2: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasSetAutodialParamA(param0.toInt(), param1.toString(), param2.toInt()) as Int).toUInt() else 0u

public actual fun RasSetAutodialParamW(param0: UInt, param1: Long, param2: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasSetAutodialParamW(param0.toInt(), param1.toString(), param2.toInt()) as Int).toUInt() else 0u

public actual fun RasSetCredentialsA(param0: PCSTR, param1: PCSTR, param2: Long, param3: BOOL): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasSetCredentialsA(param0.toString(), param1.toString(), param2.toString(), param3) as Int).toUInt() else 0u

public actual fun RasSetCredentialsW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: BOOL): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasSetCredentialsW(param0.toString(), param1.toString(), param2.toString(), param3) as Int).toUInt() else 0u

public actual fun RasSetCustomAuthDataA(pszphonebook: PCSTR, pszentry: PCSTR, pbcustomauthdata: Long, dwsizeofcustomauthdata: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasSetCustomAuthDataA(pszphonebook.toString(), pszentry.toString(), pbcustomauthdata.toString(), dwsizeofcustomauthdata.toInt()) as Int).toUInt() else 0u

public actual fun RasSetCustomAuthDataW(pszphonebook: PCWSTR, pszentry: PCWSTR, pbcustomauthdata: Long, dwsizeofcustomauthdata: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasSetCustomAuthDataW(pszphonebook.toString(), pszentry.toString(), pbcustomauthdata.toString(), dwsizeofcustomauthdata.toInt()) as Int).toUInt() else 0u

public actual fun RasSetEapUserDataA(htoken: HANDLE, pszphonebook: PCSTR, pszentry: PCSTR, pbeapdata: Long, dwsizeofeapdata: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasSetEapUserDataA(htoken.toString(), pszphonebook.toString(), pszentry.toString(), pbeapdata.toString(), dwsizeofeapdata.toInt()) as Int).toUInt() else 0u

public actual fun RasSetEapUserDataW(htoken: HANDLE, pszphonebook: PCWSTR, pszentry: PCWSTR, pbeapdata: Long, dwsizeofeapdata: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasSetEapUserDataW(htoken.toString(), pszphonebook.toString(), pszentry.toString(), pbeapdata.toString(), dwsizeofeapdata.toInt()) as Int).toUInt() else 0u

public actual fun RasSetEntryDialParamsA(param0: PCSTR, param1: Long, param2: BOOL): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasSetEntryDialParamsA(param0.toString(), param1.toString(), param2) as Int).toUInt() else 0u

public actual fun RasSetEntryDialParamsW(param0: PCWSTR, param1: Long, param2: BOOL): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasSetEntryDialParamsW(param0.toString(), param1.toString(), param2) as Int).toUInt() else 0u

public actual fun RasSetEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: Long, param3: UInt, param4: Long, param5: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasSetEntryPropertiesA(param0.toString(), param1.toString(), param2.toString(), param3.toInt(), param4.toString(), param5.toInt()) as Int).toUInt() else 0u

public actual fun RasSetEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: Long, param3: UInt, param4: Long, param5: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasSetEntryPropertiesW(param0.toString(), param1.toString(), param2.toString(), param3.toInt(), param4.toString(), param5.toInt()) as Int).toUInt() else 0u

public actual fun RasSetSubEntryPropertiesA(param0: PCSTR, param1: PCSTR, param2: UInt, param3: Long, param4: UInt, param5: Long, param6: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasSetSubEntryPropertiesA(param0.toString(), param1.toString(), param2.toInt(), param3.toString(), param4.toInt(), param5.toString(), param6.toInt()) as Int).toUInt() else 0u

public actual fun RasSetSubEntryPropertiesW(param0: PCWSTR, param1: PCWSTR, param2: UInt, param3: Long, param4: UInt, param5: Long, param6: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasSetSubEntryPropertiesW(param0.toString(), param1.toString(), param2.toInt(), param3.toString(), param4.toInt(), param5.toString(), param6.toInt()) as Int).toUInt() else 0u

public actual fun RasUpdateConnection(hrasconn: HRASCONN, lprasupdateconn: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasUpdateConnection(hrasconn.toString(), lprasupdateconn.toString()) as Int).toUInt() else 0u

public actual fun RasValidateEntryNameA(param0: PCSTR, param1: PCSTR): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasValidateEntryNameA(param0.toString(), param1.toString()) as Int).toUInt() else 0u

public actual fun RasValidateEntryNameW(param0: PCWSTR, param1: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RasValidateEntryNameW(param0.toString(), param1.toString()) as Int).toUInt() else 0u

public actual fun RtmAddNextHop(rtmreghandle: Long, nexthopinfo: Long, nexthophandle: Long, changeflags: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmAddNextHop(rtmreghandle.toString(), nexthopinfo.toString(), nexthophandle.toString(), changeflags.toString()) as Int).toUInt() else 0u

public actual fun RtmAddRouteToDest(rtmreghandle: Long, routehandle: Long, destaddress: Long, routeinfo: Long, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmAddRouteToDest(rtmreghandle.toString(), routehandle.toString(), destaddress.toString(), routeinfo.toString(), timetolive.toInt(), routelisthandle.toString(), notifytype.toInt(), notifyhandle.toString(), changeflags.toString()) as Int).toUInt() else 0u

public actual fun RtmBlockMethods(rtmreghandle: Long, targethandle: HANDLE, targettype: UByte, blockingflag: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmBlockMethods(rtmreghandle.toString(), targethandle.toString(), targettype.toInt(), blockingflag.toInt()) as Int).toUInt() else 0u

public actual fun RtmConvertIpv6AddressAndLengthToNetAddress(pnetaddress: Long, address: IN6_ADDR, dwlength: UInt, dwaddresssize: UInt): UInt =
    0u

public actual fun RtmConvertNetAddressToIpv6AddressAndLength(pnetaddress: Long, paddress: Long, plength: Long, dwaddresssize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmConvertNetAddressToIpv6AddressAndLength(pnetaddress.toString(), paddress.toString(), plength.toString(), dwaddresssize.toInt()) as Int).toUInt() else 0u

public actual fun RtmCreateDestEnum(rtmreghandle: Long, targetviews: UInt, enumflags: UInt, netaddress: Long, protocolid: UInt, rtmenumhandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmCreateDestEnum(rtmreghandle.toString(), targetviews.toInt(), enumflags.toInt(), netaddress.toString(), protocolid.toInt(), rtmenumhandle.toString()) as Int).toUInt() else 0u

public actual fun RtmCreateNextHopEnum(rtmreghandle: Long, enumflags: UInt, netaddress: Long, rtmenumhandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmCreateNextHopEnum(rtmreghandle.toString(), enumflags.toInt(), netaddress.toString(), rtmenumhandle.toString()) as Int).toUInt() else 0u

public actual fun RtmCreateRouteEnum(rtmreghandle: Long, desthandle: Long, targetviews: UInt, enumflags: UInt, startdest: Long, matchingflags: UInt, criteriaroute: Long, criteriainterface: UInt, rtmenumhandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmCreateRouteEnum(rtmreghandle.toString(), desthandle.toString(), targetviews.toInt(), enumflags.toInt(), startdest.toString(), matchingflags.toInt(), criteriaroute.toString(), criteriainterface.toInt(), rtmenumhandle.toString()) as Int).toUInt() else 0u

public actual fun RtmCreateRouteList(rtmreghandle: Long, routelisthandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmCreateRouteList(rtmreghandle.toString(), routelisthandle.toString()) as Int).toUInt() else 0u

public actual fun RtmCreateRouteListEnum(rtmreghandle: Long, routelisthandle: Long, rtmenumhandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmCreateRouteListEnum(rtmreghandle.toString(), routelisthandle.toString(), rtmenumhandle.toString()) as Int).toUInt() else 0u

public actual fun RtmDeleteEnumHandle(rtmreghandle: Long, enumhandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmDeleteEnumHandle(rtmreghandle.toString(), enumhandle.toString()) as Int).toUInt() else 0u

public actual fun RtmDeleteNextHop(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmDeleteNextHop(rtmreghandle.toString(), nexthophandle.toString(), nexthopinfo.toString()) as Int).toUInt() else 0u

public actual fun RtmDeleteRouteList(rtmreghandle: Long, routelisthandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmDeleteRouteList(rtmreghandle.toString(), routelisthandle.toString()) as Int).toUInt() else 0u

public actual fun RtmDeleteRouteToDest(rtmreghandle: Long, routehandle: Long, changeflags: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmDeleteRouteToDest(rtmreghandle.toString(), routehandle.toString(), changeflags.toString()) as Int).toUInt() else 0u

public actual fun RtmDeregisterEntity(rtmreghandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmDeregisterEntity(rtmreghandle.toString()) as Int).toUInt() else 0u

public actual fun RtmDeregisterFromChangeNotification(rtmreghandle: Long, notifyhandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmDeregisterFromChangeNotification(rtmreghandle.toString(), notifyhandle.toString()) as Int).toUInt() else 0u

public actual fun RtmFindNextHop(rtmreghandle: Long, nexthopinfo: Long, nexthophandle: Long, nexthoppointer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmFindNextHop(rtmreghandle.toString(), nexthopinfo.toString(), nexthophandle.toString(), nexthoppointer.toString()) as Int).toUInt() else 0u

public actual fun RtmGetChangeStatus(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, changestatus: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmGetChangeStatus(rtmreghandle.toString(), notifyhandle.toString(), desthandle.toString(), changestatus.toString()) as Int).toUInt() else 0u

public actual fun RtmGetChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: Long, changeddests: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmGetChangedDests(rtmreghandle.toString(), notifyhandle.toString(), numdests.toString(), changeddests.toString()) as Int).toUInt() else 0u

public actual fun RtmGetDestInfo(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmGetDestInfo(rtmreghandle.toString(), desthandle.toString(), protocolid.toInt(), targetviews.toInt(), destinfo.toString()) as Int).toUInt() else 0u

public actual fun RtmGetEntityInfo(rtmreghandle: Long, entityhandle: Long, entityinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmGetEntityInfo(rtmreghandle.toString(), entityhandle.toString(), entityinfo.toString()) as Int).toUInt() else 0u

public actual fun RtmGetEntityMethods(rtmreghandle: Long, entityhandle: Long, nummethods: Long, exptmethods: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmGetEntityMethods(rtmreghandle.toString(), entityhandle.toString(), nummethods.toString(), exptmethods.toString()) as Int).toUInt() else 0u

public actual fun RtmGetEnumDests(rtmreghandle: Long, enumhandle: Long, numdests: Long, destinfos: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmGetEnumDests(rtmreghandle.toString(), enumhandle.toString(), numdests.toString(), destinfos.toString()) as Int).toUInt() else 0u

public actual fun RtmGetEnumNextHops(rtmreghandle: Long, enumhandle: Long, numnexthops: Long, nexthophandles: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmGetEnumNextHops(rtmreghandle.toString(), enumhandle.toString(), numnexthops.toString(), nexthophandles.toString()) as Int).toUInt() else 0u

public actual fun RtmGetEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: Long, routehandles: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmGetEnumRoutes(rtmreghandle.toString(), enumhandle.toString(), numroutes.toString(), routehandles.toString()) as Int).toUInt() else 0u

public actual fun RtmGetExactMatchDestination(rtmreghandle: Long, destaddress: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmGetExactMatchDestination(rtmreghandle.toString(), destaddress.toString(), protocolid.toInt(), targetviews.toInt(), destinfo.toString()) as Int).toUInt() else 0u

public actual fun RtmGetExactMatchRoute(rtmreghandle: Long, destaddress: Long, matchingflags: UInt, routeinfo: Long, interfaceindex: UInt, targetviews: UInt, routehandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmGetExactMatchRoute(rtmreghandle.toString(), destaddress.toString(), matchingflags.toInt(), routeinfo.toString(), interfaceindex.toInt(), targetviews.toInt(), routehandle.toString()) as Int).toUInt() else 0u

public actual fun RtmGetLessSpecificDestination(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmGetLessSpecificDestination(rtmreghandle.toString(), desthandle.toString(), protocolid.toInt(), targetviews.toInt(), destinfo.toString()) as Int).toUInt() else 0u

public actual fun RtmGetListEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: Long, routehandles: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmGetListEnumRoutes(rtmreghandle.toString(), enumhandle.toString(), numroutes.toString(), routehandles.toString()) as Int).toUInt() else 0u

public actual fun RtmGetMostSpecificDestination(rtmreghandle: Long, destaddress: Long, protocolid: UInt, targetviews: UInt, destinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmGetMostSpecificDestination(rtmreghandle.toString(), destaddress.toString(), protocolid.toInt(), targetviews.toInt(), destinfo.toString()) as Int).toUInt() else 0u

public actual fun RtmGetNextHopInfo(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmGetNextHopInfo(rtmreghandle.toString(), nexthophandle.toString(), nexthopinfo.toString()) as Int).toUInt() else 0u

public actual fun RtmGetNextHopPointer(rtmreghandle: Long, nexthophandle: Long, nexthoppointer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmGetNextHopPointer(rtmreghandle.toString(), nexthophandle.toString(), nexthoppointer.toString()) as Int).toUInt() else 0u

public actual fun RtmGetOpaqueInformationPointer(rtmreghandle: Long, desthandle: Long, opaqueinfopointer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmGetOpaqueInformationPointer(rtmreghandle.toString(), desthandle.toString(), opaqueinfopointer.toString()) as Int).toUInt() else 0u

public actual fun RtmGetRegisteredEntities(rtmreghandle: Long, numentities: Long, entityhandles: Long, entityinfos: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmGetRegisteredEntities(rtmreghandle.toString(), numentities.toString(), entityhandles.toString(), entityinfos.toString()) as Int).toUInt() else 0u

public actual fun RtmGetRouteInfo(rtmreghandle: Long, routehandle: Long, routeinfo: Long, destaddress: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmGetRouteInfo(rtmreghandle.toString(), routehandle.toString(), routeinfo.toString(), destaddress.toString()) as Int).toUInt() else 0u

public actual fun RtmGetRoutePointer(rtmreghandle: Long, routehandle: Long, routepointer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmGetRoutePointer(rtmreghandle.toString(), routehandle.toString(), routepointer.toString()) as Int).toUInt() else 0u

public actual fun RtmHoldDestination(rtmreghandle: Long, desthandle: Long, targetviews: UInt, holdtime: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmHoldDestination(rtmreghandle.toString(), desthandle.toString(), targetviews.toInt(), holdtime.toInt()) as Int).toUInt() else 0u

public actual fun RtmIgnoreChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmIgnoreChangedDests(rtmreghandle.toString(), notifyhandle.toString(), numdests.toInt(), changeddests.toString()) as Int).toUInt() else 0u

public actual fun RtmInsertInRouteList(rtmreghandle: Long, routelisthandle: Long, numroutes: UInt, routehandles: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmInsertInRouteList(rtmreghandle.toString(), routelisthandle.toString(), numroutes.toInt(), routehandles.toString()) as Int).toUInt() else 0u

public actual fun RtmInvokeMethod(rtmreghandle: Long, entityhandle: Long, input: Long, outputsize: Long, output: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmInvokeMethod(rtmreghandle.toString(), entityhandle.toString(), input.toString(), outputsize.toString(), output.toString()) as Int).toUInt() else 0u

public actual fun RtmIsBestRoute(rtmreghandle: Long, routehandle: Long, bestinviews: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmIsBestRoute(rtmreghandle.toString(), routehandle.toString(), bestinviews.toString()) as Int).toUInt() else 0u

public actual fun RtmIsMarkedForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, destmarked: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmIsMarkedForChangeNotification(rtmreghandle.toString(), notifyhandle.toString(), desthandle.toString(), destmarked.toString()) as Int).toUInt() else 0u

public actual fun RtmLockDestination(rtmreghandle: Long, desthandle: Long, exclusive: BOOL, lockdest: BOOL): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmLockDestination(rtmreghandle.toString(), desthandle.toString(), exclusive, lockdest) as Int).toUInt() else 0u

public actual fun RtmLockNextHop(rtmreghandle: Long, nexthophandle: Long, exclusive: BOOL, locknexthop: BOOL, nexthoppointer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmLockNextHop(rtmreghandle.toString(), nexthophandle.toString(), exclusive, locknexthop, nexthoppointer.toString()) as Int).toUInt() else 0u

public actual fun RtmLockRoute(rtmreghandle: Long, routehandle: Long, exclusive: BOOL, lockroute: BOOL, routepointer: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmLockRoute(rtmreghandle.toString(), routehandle.toString(), exclusive, lockroute, routepointer.toString()) as Int).toUInt() else 0u

public actual fun RtmMarkDestForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, markdest: BOOL): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmMarkDestForChangeNotification(rtmreghandle.toString(), notifyhandle.toString(), desthandle.toString(), markdest) as Int).toUInt() else 0u

public actual fun RtmReferenceHandles(rtmreghandle: Long, numhandles: UInt, rtmhandles: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmReferenceHandles(rtmreghandle.toString(), numhandles.toInt(), rtmhandles.toString()) as Int).toUInt() else 0u

public actual fun RtmRegisterEntity(rtmentityinfo: Long, exportmethods: Long, eventcallback: RTM_EVENT_CALLBACK, reserveopaquepointer: BOOL, rtmregprofile: Long, rtmreghandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmRegisterEntity(rtmentityinfo.toString(), exportmethods.toString(), eventcallback.toLong().toString(), reserveopaquepointer, rtmregprofile.toString(), rtmreghandle.toString()) as Int).toUInt() else 0u

public actual fun RtmRegisterForChangeNotification(rtmreghandle: Long, targetviews: UInt, notifyflags: UInt, notifycontext: Long, notifyhandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmRegisterForChangeNotification(rtmreghandle.toString(), targetviews.toInt(), notifyflags.toInt(), notifycontext.toString(), notifyhandle.toString()) as Int).toUInt() else 0u

public actual fun RtmReleaseChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmReleaseChangedDests(rtmreghandle.toString(), notifyhandle.toString(), numdests.toInt(), changeddests.toString()) as Int).toUInt() else 0u

public actual fun RtmReleaseDestInfo(rtmreghandle: Long, destinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmReleaseDestInfo(rtmreghandle.toString(), destinfo.toString()) as Int).toUInt() else 0u

public actual fun RtmReleaseDests(rtmreghandle: Long, numdests: UInt, destinfos: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmReleaseDests(rtmreghandle.toString(), numdests.toInt(), destinfos.toString()) as Int).toUInt() else 0u

public actual fun RtmReleaseEntities(rtmreghandle: Long, numentities: UInt, entityhandles: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmReleaseEntities(rtmreghandle.toString(), numentities.toInt(), entityhandles.toString()) as Int).toUInt() else 0u

public actual fun RtmReleaseEntityInfo(rtmreghandle: Long, entityinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmReleaseEntityInfo(rtmreghandle.toString(), entityinfo.toString()) as Int).toUInt() else 0u

public actual fun RtmReleaseNextHopInfo(rtmreghandle: Long, nexthopinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmReleaseNextHopInfo(rtmreghandle.toString(), nexthopinfo.toString()) as Int).toUInt() else 0u

public actual fun RtmReleaseNextHops(rtmreghandle: Long, numnexthops: UInt, nexthophandles: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmReleaseNextHops(rtmreghandle.toString(), numnexthops.toInt(), nexthophandles.toString()) as Int).toUInt() else 0u

public actual fun RtmReleaseRouteInfo(rtmreghandle: Long, routeinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmReleaseRouteInfo(rtmreghandle.toString(), routeinfo.toString()) as Int).toUInt() else 0u

public actual fun RtmReleaseRoutes(rtmreghandle: Long, numroutes: UInt, routehandles: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmReleaseRoutes(rtmreghandle.toString(), numroutes.toInt(), routehandles.toString()) as Int).toUInt() else 0u

public actual fun RtmUpdateAndUnlockRoute(rtmreghandle: Long, routehandle: Long, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAddon != null) (_windowsWin32NetworkmanagementRrasNapiAddon.windowssys_windows_win32_networkmanagement_rras_RtmUpdateAndUnlockRoute(rtmreghandle.toString(), routehandle.toString(), timetolive.toInt(), routelisthandle.toString(), notifytype.toInt(), notifyhandle.toString(), changeflags.toString()) as Int).toUInt() else 0u
