@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun mgmAddGroupMembershipEntry(hprotocol: Handle, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMgmAddGroupMembershipEntry")

public actual fun mgmDeRegisterMProtocol(hprotocol: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMgmDeRegisterMProtocol")

public actual fun mgmDeleteGroupMembershipEntry(hprotocol: Handle, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMgmDeleteGroupMembershipEntry")

public actual fun mgmGetFirstMfe(pdwbuffersize: MutPtr, pbbuffer: MutPtr, pdwnumentries: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfe")

public actual fun mgmGetFirstMfeStats(pdwbuffersize: MutPtr, pbbuffer: MutPtr, pdwnumentries: MutPtr, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfeStats")

public actual fun mgmGetMfe(pimm: MutPtr, pdwbuffersize: MutPtr, pbbuffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMgmGetMfe")

public actual fun mgmGetMfeStats(pimm: MutPtr, pdwbuffersize: MutPtr, pbbuffer: MutPtr, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMgmGetMfeStats")

public actual fun mgmGetNextMfe(pimmstart: MutPtr, pdwbuffersize: MutPtr, pbbuffer: MutPtr, pdwnumentries: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfe")

public actual fun mgmGetNextMfeStats(pimmstart: MutPtr, pdwbuffersize: MutPtr, pbbuffer: MutPtr, pdwnumentries: MutPtr, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfeStats")

public actual fun mgmGetProtocolOnInterface(dwifindex: UInt, dwifnexthopaddr: UInt, pdwifprotocolid: MutPtr, pdwifcomponentid: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMgmGetProtocolOnInterface")

public actual fun mgmGroupEnumerationEnd(henum: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationEnd")

public actual fun mgmGroupEnumerationGetNext(henum: Handle, pdwbuffersize: MutPtr, pbbuffer: MutPtr, pdwnumentries: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationGetNext")

public actual fun mgmGroupEnumerationStart(hprotocol: Handle, metenumtype: MgmEnumTypes, phenumhandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationStart")

public actual fun mgmRegisterMProtocol(prpiinfo: MutPtr, dwprotocolid: UInt, dwcomponentid: UInt, phprotocol: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMgmRegisterMProtocol")

public actual fun mgmReleaseInterfaceOwnership(hprotocol: Handle, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMgmReleaseInterfaceOwnership")

public actual fun mgmTakeInterfaceOwnership(hprotocol: Handle, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMgmTakeInterfaceOwnership")

public actual fun mprAdminBufferFree(pbuffer: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminBufferFree")

public actual fun mprAdminConnectionClearStats(hrasserver: Long, hrasconnection: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionClearStats")

public actual fun mprAdminConnectionEnum(hrasserver: Long, dwlevel: UInt, lplpbbuffer: MutPtr, dwprefmaxlen: UInt, lpdwentriesread: MutPtr, lpdwtotalentries: MutPtr, lpdwresumehandle: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnum")

public actual fun mprAdminConnectionEnumEx(hrasserver: Long, pobjectheader: ConstPtr, dwpreferedmaxlen: UInt, lpdwentriesread: MutPtr, lpdwtotalentries: MutPtr, pprasconn: MutPtr, lpdwresumehandle: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnumEx")

public actual fun mprAdminConnectionGetInfo(hrasserver: Long, dwlevel: UInt, hrasconnection: Handle, lplpbbuffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfo")

public actual fun mprAdminConnectionGetInfoEx(hrasserver: Long, hrasconnection: Handle, prasconnection: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfoEx")

public actual fun mprAdminConnectionRemoveQuarantine(hrasserver: Handle, hrasconnection: Handle, fisipaddress: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionRemoveQuarantine")

public actual fun mprAdminDeregisterConnectionNotification(hmprserver: Long, heventnotification: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminDeregisterConnectionNotification")

public actual fun mprAdminDeviceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: MutPtr, lpdwtotalentries: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminDeviceEnum")

public actual fun mprAdminEstablishDomainRasServer(pszdomain: Pcwstr, pszmachine: Pcwstr, benable: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminEstablishDomainRasServer")

public actual fun mprAdminGetErrorString(dwerror: UInt, lplpwserrorstring: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminGetErrorString")

public actual fun mprAdminGetPDCServer(lpszdomain: Pcwstr, lpszserver: Pcwstr, lpszpdcserver: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminGetPDCServer")

public actual fun mprAdminInterfaceConnect(hmprserver: Long, hinterface: Handle, hevent: Handle, fsynchronous: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceConnect")

public actual fun mprAdminInterfaceCreate(hmprserver: Long, dwlevel: UInt, lpbbuffer: ConstPtr, phinterface: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceCreate")

public actual fun mprAdminInterfaceDelete(hmprserver: Long, hinterface: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDelete")

public actual fun mprAdminInterfaceDeviceGetInfo(hmprserver: Long, hinterface: Handle, dwindex: UInt, dwlevel: UInt, lplpbuffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceGetInfo")

public actual fun mprAdminInterfaceDeviceSetInfo(hmprserver: Long, hinterface: Handle, dwindex: UInt, dwlevel: UInt, lpbbuffer: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceSetInfo")

public actual fun mprAdminInterfaceDisconnect(hmprserver: Long, hinterface: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDisconnect")

public actual fun mprAdminInterfaceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: MutPtr, dwprefmaxlen: UInt, lpdwentriesread: MutPtr, lpdwtotalentries: MutPtr, lpdwresumehandle: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceEnum")

public actual fun mprAdminInterfaceGetCredentials(lpwsserver: Pcwstr, lpwsinterfacename: Pcwstr, lpwsusername: Pwstr, lpwspassword: Pwstr, lpwsdomainname: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentials")

public actual fun mprAdminInterfaceGetCredentialsEx(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lplpbbuffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentialsEx")

public actual fun mprAdminInterfaceGetCustomInfoEx(hmprserver: Long, hinterface: Handle, pcustominfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCustomInfoEx")

public actual fun mprAdminInterfaceGetHandle(hmprserver: Long, lpwsinterfacename: Pcwstr, phinterface: MutPtr, fincludeclientinterfaces: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetHandle")

public actual fun mprAdminInterfaceGetInfo(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lplpbbuffer: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetInfo")

public actual fun mprAdminInterfaceQueryUpdateResult(hmprserver: Long, hinterface: Handle, dwprotocolid: UInt, lpdwupdateresult: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceQueryUpdateResult")

public actual fun mprAdminInterfaceSetCredentials(lpwsserver: Pcwstr, lpwsinterfacename: Pcwstr, lpwsusername: Pcwstr, lpwsdomainname: Pcwstr, lpwspassword: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentials")

public actual fun mprAdminInterfaceSetCredentialsEx(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lpbbuffer: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentialsEx")

public actual fun mprAdminInterfaceSetCustomInfoEx(hmprserver: Long, hinterface: Handle, pcustominfo: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCustomInfoEx")

public actual fun mprAdminInterfaceSetInfo(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lpbbuffer: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetInfo")

public actual fun mprAdminInterfaceTransportAdd(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, pinterfaceinfo: ConstPtr, dwinterfaceinfosize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportAdd")

public actual fun mprAdminInterfaceTransportGetInfo(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, ppinterfaceinfo: MutPtr, lpdwinterfaceinfosize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportGetInfo")

public actual fun mprAdminInterfaceTransportRemove(hmprserver: Long, hinterface: Handle, dwtransportid: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportRemove")

public actual fun mprAdminInterfaceTransportSetInfo(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, pinterfaceinfo: ConstPtr, dwinterfaceinfosize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportSetInfo")

public actual fun mprAdminInterfaceUpdatePhonebookInfo(hmprserver: Long, hinterface: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdatePhonebookInfo")

public actual fun mprAdminInterfaceUpdateRoutes(hmprserver: Long, hinterface: Handle, dwprotocolid: UInt, hevent: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdateRoutes")

public actual fun mprAdminIsDomainRasServer(pszdomain: Pcwstr, pszmachine: Pcwstr, pbisrasserver: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminIsDomainRasServer")

public actual fun mprAdminIsServiceInitialized(lpwsservername: Pcwstr, fisserviceinitialized: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceInitialized")

public actual fun mprAdminIsServiceRunning(lpwsservername: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceRunning")

public actual fun mprAdminMIBBufferFree(pbuffer: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBBufferFree")

public actual fun mprAdminMIBEntryCreate(hmibserver: Long, dwpid: UInt, dwroutingpid: UInt, lpentry: ConstPtr, dwentrysize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryCreate")

public actual fun mprAdminMIBEntryDelete(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: ConstPtr, dwentrysize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryDelete")

public actual fun mprAdminMIBEntryGet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: ConstPtr, dwinentrysize: UInt, lplpoutentry: MutPtr, lpoutentrysize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGet")

public actual fun mprAdminMIBEntryGetFirst(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: ConstPtr, dwinentrysize: UInt, lplpoutentry: MutPtr, lpoutentrysize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetFirst")

public actual fun mprAdminMIBEntryGetNext(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: ConstPtr, dwinentrysize: UInt, lplpoutentry: MutPtr, lpoutentrysize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetNext")

public actual fun mprAdminMIBEntrySet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: ConstPtr, dwentrysize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntrySet")

public actual fun mprAdminMIBServerConnect(lpwsservername: Pcwstr, phmibserver: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerConnect")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerDisconnect")
private external fun wasiWindowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerDisconnect(hmibserver: Long): Unit

public actual fun mprAdminMIBServerDisconnect(hmibserver: Long): Unit =
    wasiWindowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerDisconnect(hmibserver)

public actual fun mprAdminPortClearStats(hrasserver: Long, hport: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminPortClearStats")

public actual fun mprAdminPortDisconnect(hrasserver: Long, hport: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminPortDisconnect")

public actual fun mprAdminPortEnum(hrasserver: Long, dwlevel: UInt, hrasconnection: Handle, lplpbbuffer: MutPtr, dwprefmaxlen: UInt, lpdwentriesread: MutPtr, lpdwtotalentries: MutPtr, lpdwresumehandle: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminPortEnum")

public actual fun mprAdminPortGetInfo(hrasserver: Long, dwlevel: UInt, hport: Handle, lplpbbuffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminPortGetInfo")

public actual fun mprAdminPortReset(hrasserver: Long, hport: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminPortReset")

public actual fun mprAdminRegisterConnectionNotification(hmprserver: Long, heventnotification: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminRegisterConnectionNotification")

public actual fun mprAdminSendUserMessage(hmprserver: Long, hconnection: Handle, lpwszmessage: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminSendUserMessage")

public actual fun mprAdminServerConnect(lpwsservername: Pcwstr, phmprserver: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminServerConnect")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementRrasMprAdminServerDisconnect")
private external fun wasiWindowssysWindowsWin32NetworkmanagementRrasMprAdminServerDisconnect(hmprserver: Long): Unit

public actual fun mprAdminServerDisconnect(hmprserver: Long): Unit =
    wasiWindowssysWindowsWin32NetworkmanagementRrasMprAdminServerDisconnect(hmprserver)

public actual fun mprAdminServerGetCredentials(hmprserver: Long, dwlevel: UInt, lplpbbuffer: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetCredentials")

public actual fun mprAdminServerGetInfo(hmprserver: Long, dwlevel: UInt, lplpbbuffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfo")

public actual fun mprAdminServerGetInfoEx(hmprserver: Long, pserverinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfoEx")

public actual fun mprAdminServerSetCredentials(hmprserver: Long, dwlevel: UInt, lpbbuffer: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetCredentials")

public actual fun mprAdminServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfo")

public actual fun mprAdminServerSetInfoEx(hmprserver: Long, pserverinfo: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfoEx")

public actual fun mprAdminTransportCreate(hmprserver: Long, dwtransportid: UInt, lpwstransportname: Pcwstr, pglobalinfo: ConstPtr, dwglobalinfosize: UInt, pclientinterfaceinfo: ConstPtr, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportCreate")

public actual fun mprAdminTransportGetInfo(hmprserver: Long, dwtransportid: UInt, ppglobalinfo: MutPtr, lpdwglobalinfosize: MutPtr, ppclientinterfaceinfo: MutPtr, lpdwclientinterfaceinfosize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportGetInfo")

public actual fun mprAdminTransportSetInfo(hmprserver: Long, dwtransportid: UInt, pglobalinfo: ConstPtr, dwglobalinfosize: UInt, pclientinterfaceinfo: ConstPtr, dwclientinterfaceinfosize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportSetInfo")

public actual fun mprAdminUpdateConnection(hrasserver: Long, hrasconnection: Handle, prasupdateconnection: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminUpdateConnection")

public actual fun mprAdminUserGetInfo(lpszserver: Pcwstr, lpszuser: Pcwstr, dwlevel: UInt, lpbbuffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminUserGetInfo")

public actual fun mprAdminUserSetInfo(lpszserver: Pcwstr, lpszuser: Pcwstr, dwlevel: UInt, lpbbuffer: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprAdminUserSetInfo")

public actual fun mprConfigBufferFree(pbuffer: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigBufferFree")

public actual fun mprConfigFilterGetInfo(hmprconfig: Handle, dwlevel: UInt, dwtransportid: UInt, lpbuffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigFilterGetInfo")

public actual fun mprConfigFilterSetInfo(hmprconfig: Handle, dwlevel: UInt, dwtransportid: UInt, lpbuffer: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigFilterSetInfo")

public actual fun mprConfigGetFriendlyName(hmprconfig: Handle, pszguidname: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigGetFriendlyName")

public actual fun mprConfigGetGuidName(hmprconfig: Handle, pszfriendlyname: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigGetGuidName")

public actual fun mprConfigInterfaceCreate(hmprconfig: Handle, dwlevel: UInt, lpbbuffer: ConstPtr, phrouterinterface: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceCreate")

public actual fun mprConfigInterfaceDelete(hmprconfig: Handle, hrouterinterface: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceDelete")

public actual fun mprConfigInterfaceEnum(hmprconfig: Handle, dwlevel: UInt, lplpbuffer: MutPtr, dwprefmaxlen: UInt, lpdwentriesread: MutPtr, lpdwtotalentries: MutPtr, lpdwresumehandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceEnum")

public actual fun mprConfigInterfaceGetCustomInfoEx(hmprconfig: Handle, hrouterinterface: Handle, pcustominfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetCustomInfoEx")

public actual fun mprConfigInterfaceGetHandle(hmprconfig: Handle, lpwsinterfacename: Pcwstr, phrouterinterface: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetHandle")

public actual fun mprConfigInterfaceGetInfo(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lplpbuffer: MutPtr, lpdwbuffersize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetInfo")

public actual fun mprConfigInterfaceSetCustomInfoEx(hmprconfig: Handle, hrouterinterface: Handle, pcustominfo: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetCustomInfoEx")

public actual fun mprConfigInterfaceSetInfo(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lpbbuffer: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetInfo")

public actual fun mprConfigInterfaceTransportAdd(hmprconfig: Handle, hrouterinterface: Handle, dwtransportid: UInt, lpwstransportname: Pcwstr, pinterfaceinfo: ConstPtr, dwinterfaceinfosize: UInt, phrouteriftransport: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportAdd")

public actual fun mprConfigInterfaceTransportEnum(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lplpbuffer: MutPtr, dwprefmaxlen: UInt, lpdwentriesread: MutPtr, lpdwtotalentries: MutPtr, lpdwresumehandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportEnum")

public actual fun mprConfigInterfaceTransportGetHandle(hmprconfig: Handle, hrouterinterface: Handle, dwtransportid: UInt, phrouteriftransport: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetHandle")

public actual fun mprConfigInterfaceTransportGetInfo(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle, ppinterfaceinfo: MutPtr, lpdwinterfaceinfosize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetInfo")

public actual fun mprConfigInterfaceTransportRemove(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportRemove")

public actual fun mprConfigInterfaceTransportSetInfo(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle, pinterfaceinfo: ConstPtr, dwinterfaceinfosize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportSetInfo")

public actual fun mprConfigServerBackup(hmprconfig: Handle, lpwspath: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigServerBackup")

public actual fun mprConfigServerConnect(lpwsservername: Pcwstr, phmprconfig: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigServerConnect")

public actual fun mprConfigServerDisconnect(hmprconfig: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigServerDisconnect")

public actual fun mprConfigServerGetInfo(hmprconfig: Handle, dwlevel: UInt, lplpbbuffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfo")

public actual fun mprConfigServerGetInfoEx(hmprconfig: Handle, pserverinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfoEx")

public actual fun mprConfigServerInstall(dwlevel: UInt, pbuffer: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigServerInstall")

public actual fun mprConfigServerRefresh(hmprconfig: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigServerRefresh")

public actual fun mprConfigServerRestore(hmprconfig: Handle, lpwspath: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigServerRestore")

public actual fun mprConfigServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfo")

public actual fun mprConfigServerSetInfoEx(hmprconfig: Handle, psetserverconfig: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfoEx")

public actual fun mprConfigTransportCreate(hmprconfig: Handle, dwtransportid: UInt, lpwstransportname: Pcwstr, pglobalinfo: ConstPtr, dwglobalinfosize: UInt, pclientinterfaceinfo: ConstPtr, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr, phroutertransport: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportCreate")

public actual fun mprConfigTransportDelete(hmprconfig: Handle, hroutertransport: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportDelete")

public actual fun mprConfigTransportEnum(hmprconfig: Handle, dwlevel: UInt, lplpbuffer: MutPtr, dwprefmaxlen: UInt, lpdwentriesread: MutPtr, lpdwtotalentries: MutPtr, lpdwresumehandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportEnum")

public actual fun mprConfigTransportGetHandle(hmprconfig: Handle, dwtransportid: UInt, phroutertransport: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetHandle")

public actual fun mprConfigTransportGetInfo(hmprconfig: Handle, hroutertransport: Handle, ppglobalinfo: MutPtr, lpdwglobalinfosize: MutPtr, ppclientinterfaceinfo: MutPtr, lpdwclientinterfaceinfosize: MutPtr, lplpwsdllpath: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetInfo")

public actual fun mprConfigTransportSetInfo(hmprconfig: Handle, hroutertransport: Handle, pglobalinfo: ConstPtr, dwglobalinfosize: UInt, pclientinterfaceinfo: ConstPtr, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportSetInfo")

public actual fun mprInfoBlockAdd(lpheader: ConstPtr, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: ConstPtr, lplpnewheader: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockAdd")

public actual fun mprInfoBlockFind(lpheader: ConstPtr, dwinfotype: UInt, lpdwitemsize: MutPtr, lpdwitemcount: MutPtr, lplpitemdata: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockFind")

public actual fun mprInfoBlockQuerySize(lpheader: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockQuerySize")

public actual fun mprInfoBlockRemove(lpheader: ConstPtr, dwinfotype: UInt, lplpnewheader: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockRemove")

public actual fun mprInfoBlockSet(lpheader: ConstPtr, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: ConstPtr, lplpnewheader: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockSet")

public actual fun mprInfoCreate(dwversion: UInt, lplpnewheader: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprInfoCreate")

public actual fun mprInfoDelete(lpheader: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprInfoDelete")

public actual fun mprInfoDuplicate(lpheader: ConstPtr, lplpnewheader: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprInfoDuplicate")

public actual fun mprInfoRemoveAll(lpheader: ConstPtr, lplpnewheader: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasMprInfoRemoveAll")

public actual fun rasClearConnectionStatistics(hrasconn: Hrasconn): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasClearConnectionStatistics")

public actual fun rasClearLinkStatistics(hrasconn: Hrasconn, dwsubentry: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasClearLinkStatistics")

public actual fun rasConnectionNotificationA(param0: Hrasconn, param1: Handle, param2: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationA")

public actual fun rasConnectionNotificationW(param0: Hrasconn, param1: Handle, param2: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationW")

public actual fun rasCreatePhonebookEntryA(param0: Hwnd, param1: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryA")

public actual fun rasCreatePhonebookEntryW(param0: Hwnd, param1: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryW")

public actual fun rasDeleteEntryA(param0: Pcstr, param1: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryA")

public actual fun rasDeleteEntryW(param0: Pcwstr, param1: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryW")

public actual fun rasDeleteSubEntryA(pszphonebook: Pcstr, pszentry: Pcstr, dwsubentryid: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryA")

public actual fun rasDeleteSubEntryW(pszphonebook: Pcwstr, pszentry: Pcwstr, dwsubentryid: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryW")

public actual fun rasDialA(param0: ConstPtr, param1: Pcstr, param2: ConstPtr, param3: UInt, param4: ConstPtr, param5: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasDialA")

public actual fun rasDialDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpszphonenumber: Pcstr, lpinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasDialDlgA")

public actual fun rasDialDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpszphonenumber: Pcwstr, lpinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasDialDlgW")

public actual fun rasDialW(param0: ConstPtr, param1: Pcwstr, param2: ConstPtr, param3: UInt, param4: ConstPtr, param5: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasDialW")

public actual fun rasEditPhonebookEntryA(param0: Hwnd, param1: Pcstr, param2: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryA")

public actual fun rasEditPhonebookEntryW(param0: Hwnd, param1: Pcwstr, param2: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryW")

public actual fun rasEntryDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasEntryDlgA")

public actual fun rasEntryDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasEntryDlgW")

public actual fun rasEnumAutodialAddressesA(lpprasautodialaddresses: MutPtr, lpdwcbrasautodialaddresses: MutPtr, lpdwcrasautodialaddresses: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesA")

public actual fun rasEnumAutodialAddressesW(lpprasautodialaddresses: MutPtr, lpdwcbrasautodialaddresses: MutPtr, lpdwcrasautodialaddresses: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesW")

public actual fun rasEnumConnectionsA(param0: MutPtr, param1: MutPtr, param2: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsA")

public actual fun rasEnumConnectionsW(param0: MutPtr, param1: MutPtr, param2: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsW")

public actual fun rasEnumDevicesA(param0: MutPtr, param1: MutPtr, param2: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesA")

public actual fun rasEnumDevicesW(param0: MutPtr, param1: MutPtr, param2: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesW")

public actual fun rasEnumEntriesA(param0: Pcstr, param1: Pcstr, param2: MutPtr, param3: MutPtr, param4: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesA")

public actual fun rasEnumEntriesW(param0: Pcwstr, param1: Pcwstr, param2: MutPtr, param3: MutPtr, param4: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesW")

public actual fun rasFreeEapUserIdentityA(praseapuseridentity: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityA")

public actual fun rasFreeEapUserIdentityW(praseapuseridentity: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityW")

public actual fun rasGetAutodialAddressA(param0: Pcstr, param1: ConstPtr, param2: MutPtr, param3: MutPtr, param4: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressA")

public actual fun rasGetAutodialAddressW(param0: Pcwstr, param1: ConstPtr, param2: MutPtr, param3: MutPtr, param4: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressW")

public actual fun rasGetAutodialEnableA(param0: UInt, param1: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableA")

public actual fun rasGetAutodialEnableW(param0: UInt, param1: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableW")

public actual fun rasGetAutodialParamA(param0: UInt, param1: MutPtr, param2: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamA")

public actual fun rasGetAutodialParamW(param0: UInt, param1: MutPtr, param2: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamW")

public actual fun rasGetConnectStatusA(param0: Hrasconn, param1: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusA")

public actual fun rasGetConnectStatusW(param0: Hrasconn, param1: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusW")

public actual fun rasGetConnectionStatistics(hrasconn: Hrasconn, lpstatistics: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetConnectionStatistics")

public actual fun rasGetCountryInfoA(param0: MutPtr, param1: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoA")

public actual fun rasGetCountryInfoW(param0: MutPtr, param1: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoW")

public actual fun rasGetCredentialsA(param0: Pcstr, param1: Pcstr, param2: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsA")

public actual fun rasGetCredentialsW(param0: Pcwstr, param1: Pcwstr, param2: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsW")

public actual fun rasGetCustomAuthDataA(pszphonebook: Pcstr, pszentry: Pcstr, pbcustomauthdata: MutPtr, pdwsizeofcustomauthdata: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataA")

public actual fun rasGetCustomAuthDataW(pszphonebook: Pcwstr, pszentry: Pcwstr, pbcustomauthdata: MutPtr, pdwsizeofcustomauthdata: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataW")

public actual fun rasGetEapUserDataA(htoken: Handle, pszphonebook: Pcstr, pszentry: Pcstr, pbeapdata: MutPtr, pdwsizeofeapdata: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataA")

public actual fun rasGetEapUserDataW(htoken: Handle, pszphonebook: Pcwstr, pszentry: Pcwstr, pbeapdata: MutPtr, pdwsizeofeapdata: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataW")

public actual fun rasGetEapUserIdentityA(pszphonebook: Pcstr, pszentry: Pcstr, dwflags: UInt, hwnd: Hwnd, ppraseapuseridentity: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityA")

public actual fun rasGetEapUserIdentityW(pszphonebook: Pcwstr, pszentry: Pcwstr, dwflags: UInt, hwnd: Hwnd, ppraseapuseridentity: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityW")

public actual fun rasGetEntryDialParamsA(param0: Pcstr, param1: MutPtr, param2: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsA")

public actual fun rasGetEntryDialParamsW(param0: Pcwstr, param1: MutPtr, param2: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsW")

public actual fun rasGetEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: MutPtr, param3: MutPtr, param4: MutPtr, param5: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesA")

public actual fun rasGetEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: MutPtr, param3: MutPtr, param4: MutPtr, param5: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesW")

public actual fun rasGetErrorStringA(resourceid: UInt, lpszstring: Pstr, inbufsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringA")

public actual fun rasGetErrorStringW(resourceid: UInt, lpszstring: Pwstr, inbufsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringW")

public actual fun rasGetLinkStatistics(hrasconn: Hrasconn, dwsubentry: UInt, lpstatistics: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetLinkStatistics")

public actual fun rasGetPCscf(lpszpcscf: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetPCscf")

public actual fun rasGetProjectionInfoA(param0: Hrasconn, param1: Rasprojection, param2: MutPtr, param3: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoA")

public actual fun rasGetProjectionInfoEx(hrasconn: Hrasconn, prasprojection: MutPtr, lpdwsize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoEx")

public actual fun rasGetProjectionInfoW(param0: Hrasconn, param1: Rasprojection, param2: MutPtr, param3: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoW")

public actual fun rasGetSubEntryHandleA(param0: Hrasconn, param1: UInt, param2: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleA")

public actual fun rasGetSubEntryHandleW(param0: Hrasconn, param1: UInt, param2: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleW")

public actual fun rasGetSubEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: UInt, param3: MutPtr, param4: MutPtr, param5: MutPtr, param6: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesA")

public actual fun rasGetSubEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: UInt, param3: MutPtr, param4: MutPtr, param5: MutPtr, param6: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesW")

public actual fun rasHangUpA(param0: Hrasconn): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasHangUpA")

public actual fun rasHangUpW(param0: Hrasconn): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasHangUpW")

public actual fun rasInvokeEapUI(param0: Hrasconn, param1: UInt, param2: ConstPtr, param3: Hwnd): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasInvokeEapUI")

public actual fun rasPhonebookDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgA")

public actual fun rasPhonebookDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgW")

public actual fun rasRenameEntryA(param0: Pcstr, param1: Pcstr, param2: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasRenameEntryA")

public actual fun rasRenameEntryW(param0: Pcwstr, param1: Pcwstr, param2: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasRenameEntryW")

public actual fun rasSetAutodialAddressA(param0: Pcstr, param1: UInt, param2: ConstPtr, param3: UInt, param4: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressA")

public actual fun rasSetAutodialAddressW(param0: Pcwstr, param1: UInt, param2: ConstPtr, param3: UInt, param4: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableA")
private external fun wasiWindowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableA(param0: Int, param1: Int): Int

public actual fun rasSetAutodialEnableA(param0: UInt, param1: Bool): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableA(param0.toInt(), param1).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableW")
private external fun wasiWindowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableW(param0: Int, param1: Int): Int

public actual fun rasSetAutodialEnableW(param0: UInt, param1: Bool): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableW(param0.toInt(), param1).toUInt()

public actual fun rasSetAutodialParamA(param0: UInt, param1: ConstPtr, param2: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamA")

public actual fun rasSetAutodialParamW(param0: UInt, param1: ConstPtr, param2: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamW")

public actual fun rasSetCredentialsA(param0: Pcstr, param1: Pcstr, param2: ConstPtr, param3: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsA")

public actual fun rasSetCredentialsW(param0: Pcwstr, param1: Pcwstr, param2: ConstPtr, param3: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsW")

public actual fun rasSetCustomAuthDataA(pszphonebook: Pcstr, pszentry: Pcstr, pbcustomauthdata: ConstPtr, dwsizeofcustomauthdata: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataA")

public actual fun rasSetCustomAuthDataW(pszphonebook: Pcwstr, pszentry: Pcwstr, pbcustomauthdata: ConstPtr, dwsizeofcustomauthdata: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataW")

public actual fun rasSetEapUserDataA(htoken: Handle, pszphonebook: Pcstr, pszentry: Pcstr, pbeapdata: ConstPtr, dwsizeofeapdata: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataA")

public actual fun rasSetEapUserDataW(htoken: Handle, pszphonebook: Pcwstr, pszentry: Pcwstr, pbeapdata: ConstPtr, dwsizeofeapdata: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataW")

public actual fun rasSetEntryDialParamsA(param0: Pcstr, param1: ConstPtr, param2: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsA")

public actual fun rasSetEntryDialParamsW(param0: Pcwstr, param1: ConstPtr, param2: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsW")

public actual fun rasSetEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: ConstPtr, param3: UInt, param4: ConstPtr, param5: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesA")

public actual fun rasSetEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: ConstPtr, param3: UInt, param4: ConstPtr, param5: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesW")

public actual fun rasSetSubEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: UInt, param3: ConstPtr, param4: UInt, param5: ConstPtr, param6: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesA")

public actual fun rasSetSubEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: UInt, param3: ConstPtr, param4: UInt, param5: ConstPtr, param6: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesW")

public actual fun rasUpdateConnection(hrasconn: Hrasconn, lprasupdateconn: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasUpdateConnection")

public actual fun rasValidateEntryNameA(param0: Pcstr, param1: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameA")

public actual fun rasValidateEntryNameW(param0: Pcwstr, param1: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameW")

public actual fun rtmAddNextHop(rtmreghandle: Long, nexthopinfo: MutPtr, nexthophandle: MutPtr, changeflags: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmAddNextHop")

public actual fun rtmAddRouteToDest(rtmreghandle: Long, routehandle: MutPtr, destaddress: MutPtr, routeinfo: MutPtr, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmAddRouteToDest")

public actual fun rtmBlockMethods(rtmreghandle: Long, targethandle: Handle, targettype: UByte, blockingflag: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmBlockMethods")

public actual fun rtmConvertIpv6AddressAndLengthToNetAddress(pnetaddress: MutPtr, address: In6Addr, dwlength: UInt, dwaddresssize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmConvertIpv6AddressAndLengthToNetAddress")

public actual fun rtmConvertNetAddressToIpv6AddressAndLength(pnetaddress: MutPtr, paddress: MutPtr, plength: MutPtr, dwaddresssize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmConvertNetAddressToIpv6AddressAndLength")

public actual fun rtmCreateDestEnum(rtmreghandle: Long, targetviews: UInt, enumflags: UInt, netaddress: MutPtr, protocolid: UInt, rtmenumhandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmCreateDestEnum")

public actual fun rtmCreateNextHopEnum(rtmreghandle: Long, enumflags: UInt, netaddress: MutPtr, rtmenumhandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmCreateNextHopEnum")

public actual fun rtmCreateRouteEnum(rtmreghandle: Long, desthandle: Long, targetviews: UInt, enumflags: UInt, startdest: MutPtr, matchingflags: UInt, criteriaroute: MutPtr, criteriainterface: UInt, rtmenumhandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteEnum")

public actual fun rtmCreateRouteList(rtmreghandle: Long, routelisthandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteList")

public actual fun rtmCreateRouteListEnum(rtmreghandle: Long, routelisthandle: Long, rtmenumhandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteListEnum")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementRrasRtmDeleteEnumHandle")
private external fun wasiWindowssysWindowsWin32NetworkmanagementRrasRtmDeleteEnumHandle(rtmreghandle: Long, enumhandle: Long): Int

public actual fun rtmDeleteEnumHandle(rtmreghandle: Long, enumhandle: Long): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementRrasRtmDeleteEnumHandle(rtmreghandle, enumhandle).toUInt()

public actual fun rtmDeleteNextHop(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmDeleteNextHop")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteList")
private external fun wasiWindowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteList(rtmreghandle: Long, routelisthandle: Long): Int

public actual fun rtmDeleteRouteList(rtmreghandle: Long, routelisthandle: Long): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteList(rtmreghandle, routelisthandle).toUInt()

public actual fun rtmDeleteRouteToDest(rtmreghandle: Long, routehandle: Long, changeflags: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteToDest")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementRrasRtmDeregisterEntity")
private external fun wasiWindowssysWindowsWin32NetworkmanagementRrasRtmDeregisterEntity(rtmreghandle: Long): Int

public actual fun rtmDeregisterEntity(rtmreghandle: Long): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementRrasRtmDeregisterEntity(rtmreghandle).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementRrasRtmDeregisterFromChangeNotification")
private external fun wasiWindowssysWindowsWin32NetworkmanagementRrasRtmDeregisterFromChangeNotification(rtmreghandle: Long, notifyhandle: Long): Int

public actual fun rtmDeregisterFromChangeNotification(rtmreghandle: Long, notifyhandle: Long): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementRrasRtmDeregisterFromChangeNotification(rtmreghandle, notifyhandle).toUInt()

public actual fun rtmFindNextHop(rtmreghandle: Long, nexthopinfo: MutPtr, nexthophandle: MutPtr, nexthoppointer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmFindNextHop")

public actual fun rtmGetChangeStatus(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, changestatus: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmGetChangeStatus")

public actual fun rtmGetChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: MutPtr, changeddests: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmGetChangedDests")

public actual fun rtmGetDestInfo(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmGetDestInfo")

public actual fun rtmGetEntityInfo(rtmreghandle: Long, entityhandle: Long, entityinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmGetEntityInfo")

public actual fun rtmGetEntityMethods(rtmreghandle: Long, entityhandle: Long, nummethods: MutPtr, exptmethods: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmGetEntityMethods")

public actual fun rtmGetEnumDests(rtmreghandle: Long, enumhandle: Long, numdests: MutPtr, destinfos: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumDests")

public actual fun rtmGetEnumNextHops(rtmreghandle: Long, enumhandle: Long, numnexthops: MutPtr, nexthophandles: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumNextHops")

public actual fun rtmGetEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: MutPtr, routehandles: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumRoutes")

public actual fun rtmGetExactMatchDestination(rtmreghandle: Long, destaddress: MutPtr, protocolid: UInt, targetviews: UInt, destinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchDestination")

public actual fun rtmGetExactMatchRoute(rtmreghandle: Long, destaddress: MutPtr, matchingflags: UInt, routeinfo: MutPtr, interfaceindex: UInt, targetviews: UInt, routehandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchRoute")

public actual fun rtmGetLessSpecificDestination(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmGetLessSpecificDestination")

public actual fun rtmGetListEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: MutPtr, routehandles: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmGetListEnumRoutes")

public actual fun rtmGetMostSpecificDestination(rtmreghandle: Long, destaddress: MutPtr, protocolid: UInt, targetviews: UInt, destinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmGetMostSpecificDestination")

public actual fun rtmGetNextHopInfo(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopInfo")

public actual fun rtmGetNextHopPointer(rtmreghandle: Long, nexthophandle: Long, nexthoppointer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopPointer")

public actual fun rtmGetOpaqueInformationPointer(rtmreghandle: Long, desthandle: Long, opaqueinfopointer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmGetOpaqueInformationPointer")

public actual fun rtmGetRegisteredEntities(rtmreghandle: Long, numentities: MutPtr, entityhandles: MutPtr, entityinfos: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmGetRegisteredEntities")

public actual fun rtmGetRouteInfo(rtmreghandle: Long, routehandle: Long, routeinfo: MutPtr, destaddress: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmGetRouteInfo")

public actual fun rtmGetRoutePointer(rtmreghandle: Long, routehandle: Long, routepointer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmGetRoutePointer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementRrasRtmHoldDestination")
private external fun wasiWindowssysWindowsWin32NetworkmanagementRrasRtmHoldDestination(rtmreghandle: Long, desthandle: Long, targetviews: Int, holdtime: Int): Int

public actual fun rtmHoldDestination(rtmreghandle: Long, desthandle: Long, targetviews: UInt, holdtime: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementRrasRtmHoldDestination(rtmreghandle, desthandle, targetviews.toInt(), holdtime.toInt()).toUInt()

public actual fun rtmIgnoreChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmIgnoreChangedDests")

public actual fun rtmInsertInRouteList(rtmreghandle: Long, routelisthandle: Long, numroutes: UInt, routehandles: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmInsertInRouteList")

public actual fun rtmInvokeMethod(rtmreghandle: Long, entityhandle: Long, input: MutPtr, outputsize: MutPtr, output: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmInvokeMethod")

public actual fun rtmIsBestRoute(rtmreghandle: Long, routehandle: Long, bestinviews: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmIsBestRoute")

public actual fun rtmIsMarkedForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, destmarked: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmIsMarkedForChangeNotification")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementRrasRtmLockDestination")
private external fun wasiWindowssysWindowsWin32NetworkmanagementRrasRtmLockDestination(rtmreghandle: Long, desthandle: Long, exclusive: Int, lockdest: Int): Int

public actual fun rtmLockDestination(rtmreghandle: Long, desthandle: Long, exclusive: Bool, lockdest: Bool): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementRrasRtmLockDestination(rtmreghandle, desthandle, exclusive, lockdest).toUInt()

public actual fun rtmLockNextHop(rtmreghandle: Long, nexthophandle: Long, exclusive: Bool, locknexthop: Bool, nexthoppointer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmLockNextHop")

public actual fun rtmLockRoute(rtmreghandle: Long, routehandle: Long, exclusive: Bool, lockroute: Bool, routepointer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmLockRoute")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementRrasRtmMarkDestForChangeNotification")
private external fun wasiWindowssysWindowsWin32NetworkmanagementRrasRtmMarkDestForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, markdest: Int): Int

public actual fun rtmMarkDestForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, markdest: Bool): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementRrasRtmMarkDestForChangeNotification(rtmreghandle, notifyhandle, desthandle, markdest).toUInt()

public actual fun rtmReferenceHandles(rtmreghandle: Long, numhandles: UInt, rtmhandles: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmReferenceHandles")

public actual fun rtmRegisterEntity(rtmentityinfo: MutPtr, exportmethods: MutPtr, eventcallback: RtmEventCallback, reserveopaquepointer: Bool, rtmregprofile: MutPtr, rtmreghandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmRegisterEntity")

public actual fun rtmRegisterForChangeNotification(rtmreghandle: Long, targetviews: UInt, notifyflags: UInt, notifycontext: MutPtr, notifyhandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmRegisterForChangeNotification")

public actual fun rtmReleaseChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmReleaseChangedDests")

public actual fun rtmReleaseDestInfo(rtmreghandle: Long, destinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmReleaseDestInfo")

public actual fun rtmReleaseDests(rtmreghandle: Long, numdests: UInt, destinfos: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmReleaseDests")

public actual fun rtmReleaseEntities(rtmreghandle: Long, numentities: UInt, entityhandles: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntities")

public actual fun rtmReleaseEntityInfo(rtmreghandle: Long, entityinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntityInfo")

public actual fun rtmReleaseNextHopInfo(rtmreghandle: Long, nexthopinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHopInfo")

public actual fun rtmReleaseNextHops(rtmreghandle: Long, numnexthops: UInt, nexthophandles: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHops")

public actual fun rtmReleaseRouteInfo(rtmreghandle: Long, routeinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmReleaseRouteInfo")

public actual fun rtmReleaseRoutes(rtmreghandle: Long, numroutes: UInt, routehandles: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmReleaseRoutes")

public actual fun rtmUpdateAndUnlockRoute(rtmreghandle: Long, routehandle: Long, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementRrasRtmUpdateAndUnlockRoute")
