@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32NetworkmanagementRrasNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun mgmAddGroupMembershipEntry(hprotocol: Handle, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMgmAddGroupMembershipEntry(hprotocol.rawAddress.toString(), dwsourceaddr.toInt(), dwsourcemask.toInt(), dwgroupaddr.toInt(), dwgroupmask.toInt(), dwifindex.toInt(), dwifnexthopipaddr.toInt(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmDeRegisterMProtocol(hprotocol: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMgmDeRegisterMProtocol(hprotocol.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmDeleteGroupMembershipEntry(hprotocol: Handle, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMgmDeleteGroupMembershipEntry(hprotocol.rawAddress.toString(), dwsourceaddr.toInt(), dwsourcemask.toInt(), dwgroupaddr.toInt(), dwgroupmask.toInt(), dwifindex.toInt(), dwifnexthopipaddr.toInt(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGetFirstMfe(pdwbuffersize: MutPtr<UInt>, pbbuffer: MutPtr<UByte>, pdwnumentries: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfe(pdwbuffersize.rawAddress.toString(), pbbuffer.rawAddress.toString(), pdwnumentries.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGetFirstMfeStats(pdwbuffersize: MutPtr<UInt>, pbbuffer: MutPtr<UByte>, pdwnumentries: MutPtr<UInt>, dwflags: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfeStats(pdwbuffersize.rawAddress.toString(), pbbuffer.rawAddress.toString(), pdwnumentries.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGetMfe(pimm: MutPtr<MibIpmcastMfe>, pdwbuffersize: MutPtr<UInt>, pbbuffer: MutPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMgmGetMfe(pimm.rawAddress.toString(), pdwbuffersize.rawAddress.toString(), pbbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGetMfeStats(pimm: MutPtr<MibIpmcastMfe>, pdwbuffersize: MutPtr<UInt>, pbbuffer: MutPtr<UByte>, dwflags: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMgmGetMfeStats(pimm.rawAddress.toString(), pdwbuffersize.rawAddress.toString(), pbbuffer.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGetNextMfe(pimmstart: MutPtr<MibIpmcastMfe>, pdwbuffersize: MutPtr<UInt>, pbbuffer: MutPtr<UByte>, pdwnumentries: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfe(pimmstart.rawAddress.toString(), pdwbuffersize.rawAddress.toString(), pbbuffer.rawAddress.toString(), pdwnumentries.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGetNextMfeStats(pimmstart: MutPtr<MibIpmcastMfe>, pdwbuffersize: MutPtr<UInt>, pbbuffer: MutPtr<UByte>, pdwnumentries: MutPtr<UInt>, dwflags: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfeStats(pimmstart.rawAddress.toString(), pdwbuffersize.rawAddress.toString(), pbbuffer.rawAddress.toString(), pdwnumentries.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGetProtocolOnInterface(dwifindex: UInt, dwifnexthopaddr: UInt, pdwifprotocolid: MutPtr<UInt>, pdwifcomponentid: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMgmGetProtocolOnInterface(dwifindex.toInt(), dwifnexthopaddr.toInt(), pdwifprotocolid.rawAddress.toString(), pdwifcomponentid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGroupEnumerationEnd(henum: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationEnd(henum.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGroupEnumerationGetNext(henum: Handle, pdwbuffersize: MutPtr<UInt>, pbbuffer: MutPtr<UByte>, pdwnumentries: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationGetNext(henum.rawAddress.toString(), pdwbuffersize.rawAddress.toString(), pbbuffer.rawAddress.toString(), pdwnumentries.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGroupEnumerationStart(hprotocol: Handle, metenumtype: MgmEnumTypes, phenumhandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationStart(hprotocol.rawAddress.toString(), metenumtype, phenumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmRegisterMProtocol(prpiinfo: MutPtr<RoutingProtocolConfig>, dwprotocolid: UInt, dwcomponentid: UInt, phprotocol: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMgmRegisterMProtocol(prpiinfo.rawAddress.toString(), dwprotocolid.toInt(), dwcomponentid.toInt(), phprotocol.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmReleaseInterfaceOwnership(hprotocol: Handle, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMgmReleaseInterfaceOwnership(hprotocol.rawAddress.toString(), dwifindex.toInt(), dwifnexthopaddr.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmTakeInterfaceOwnership(hprotocol: Handle, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMgmTakeInterfaceOwnership(hprotocol.rawAddress.toString(), dwifindex.toInt(), dwifnexthopaddr.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminBufferFree(pbuffer: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminBufferFree(pbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminConnectionClearStats(hrasserver: Long, hrasconnection: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionClearStats(hrasserver.toString(), hrasconnection.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminConnectionEnum(hrasserver: Long, dwlevel: UInt, lplpbbuffer: MutPtr<MutPtr<UByte>>, dwprefmaxlen: UInt, lpdwentriesread: MutPtr<UInt>, lpdwtotalentries: MutPtr<UInt>, lpdwresumehandle: ConstPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnum(hrasserver.toString(), dwlevel.toInt(), lplpbbuffer.rawAddress.toString(), dwprefmaxlen.toInt(), lpdwentriesread.rawAddress.toString(), lpdwtotalentries.rawAddress.toString(), lpdwresumehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminConnectionEnumEx(hrasserver: Long, pobjectheader: ConstPtr<MprapiObjectHeader>, dwpreferedmaxlen: UInt, lpdwentriesread: MutPtr<UInt>, lpdwtotalentries: MutPtr<UInt>, pprasconn: MutPtr<MutPtr<RasConnectionEx>>, lpdwresumehandle: ConstPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnumEx(hrasserver.toString(), pobjectheader.rawAddress.toString(), dwpreferedmaxlen.toInt(), lpdwentriesread.rawAddress.toString(), lpdwtotalentries.rawAddress.toString(), pprasconn.rawAddress.toString(), lpdwresumehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminConnectionGetInfo(hrasserver: Long, dwlevel: UInt, hrasconnection: Handle, lplpbbuffer: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfo(hrasserver.toString(), dwlevel.toInt(), hrasconnection.rawAddress.toString(), lplpbbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminConnectionGetInfoEx(hrasserver: Long, hrasconnection: Handle, prasconnection: MutPtr<RasConnectionEx>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfoEx(hrasserver.toString(), hrasconnection.rawAddress.toString(), prasconnection.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminConnectionRemoveQuarantine(hrasserver: Handle, hrasconnection: Handle, fisipaddress: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionRemoveQuarantine(hrasserver.rawAddress.toString(), hrasconnection.rawAddress.toString(), fisipaddress) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminDeregisterConnectionNotification(hmprserver: Long, heventnotification: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminDeregisterConnectionNotification(hmprserver.toString(), heventnotification.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminDeviceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: MutPtr<MutPtr<UByte>>, lpdwtotalentries: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminDeviceEnum(hmprserver.toString(), dwlevel.toInt(), lplpbbuffer.rawAddress.toString(), lpdwtotalentries.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminEstablishDomainRasServer(pszdomain: Pcwstr, pszmachine: Pcwstr, benable: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminEstablishDomainRasServer(pszdomain.rawAddress.toString(), pszmachine.rawAddress.toString(), benable) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminGetErrorString(dwerror: UInt, lplpwserrorstring: MutPtr<Pwstr>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminGetErrorString(dwerror.toInt(), lplpwserrorstring.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminGetPDCServer(lpszdomain: Pcwstr, lpszserver: Pcwstr, lpszpdcserver: Pwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminGetPDCServer(lpszdomain.rawAddress.toString(), lpszserver.rawAddress.toString(), lpszpdcserver.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceConnect(hmprserver: Long, hinterface: Handle, hevent: Handle, fsynchronous: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceConnect(hmprserver.toString(), hinterface.rawAddress.toString(), hevent.rawAddress.toString(), fsynchronous) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceCreate(hmprserver: Long, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>, phinterface: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceCreate(hmprserver.toString(), dwlevel.toInt(), lpbbuffer.rawAddress.toString(), phinterface.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceDelete(hmprserver: Long, hinterface: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDelete(hmprserver.toString(), hinterface.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceDeviceGetInfo(hmprserver: Long, hinterface: Handle, dwindex: UInt, dwlevel: UInt, lplpbuffer: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceGetInfo(hmprserver.toString(), hinterface.rawAddress.toString(), dwindex.toInt(), dwlevel.toInt(), lplpbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceDeviceSetInfo(hmprserver: Long, hinterface: Handle, dwindex: UInt, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceSetInfo(hmprserver.toString(), hinterface.rawAddress.toString(), dwindex.toInt(), dwlevel.toInt(), lpbbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceDisconnect(hmprserver: Long, hinterface: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDisconnect(hmprserver.toString(), hinterface.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: MutPtr<MutPtr<UByte>>, dwprefmaxlen: UInt, lpdwentriesread: MutPtr<UInt>, lpdwtotalentries: MutPtr<UInt>, lpdwresumehandle: ConstPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceEnum(hmprserver.toString(), dwlevel.toInt(), lplpbbuffer.rawAddress.toString(), dwprefmaxlen.toInt(), lpdwentriesread.rawAddress.toString(), lpdwtotalentries.rawAddress.toString(), lpdwresumehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceGetCredentials(lpwsserver: Pcwstr, lpwsinterfacename: Pcwstr, lpwsusername: Pwstr, lpwspassword: Pwstr, lpwsdomainname: Pwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentials(lpwsserver.rawAddress.toString(), lpwsinterfacename.rawAddress.toString(), lpwsusername.rawAddress.toString(), lpwspassword.rawAddress.toString(), lpwsdomainname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceGetCredentialsEx(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lplpbbuffer: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentialsEx(hmprserver.toString(), hinterface.rawAddress.toString(), dwlevel.toInt(), lplpbbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceGetCustomInfoEx(hmprserver: Long, hinterface: Handle, pcustominfo: MutPtr<MprIfCustominfoex2>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCustomInfoEx(hmprserver.toString(), hinterface.rawAddress.toString(), pcustominfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceGetHandle(hmprserver: Long, lpwsinterfacename: Pcwstr, phinterface: MutPtr<Handle>, fincludeclientinterfaces: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetHandle(hmprserver.toString(), lpwsinterfacename.rawAddress.toString(), phinterface.rawAddress.toString(), fincludeclientinterfaces) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceGetInfo(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lplpbbuffer: ConstPtr<ConstPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetInfo(hmprserver.toString(), hinterface.rawAddress.toString(), dwlevel.toInt(), lplpbbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceQueryUpdateResult(hmprserver: Long, hinterface: Handle, dwprotocolid: UInt, lpdwupdateresult: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceQueryUpdateResult(hmprserver.toString(), hinterface.rawAddress.toString(), dwprotocolid.toInt(), lpdwupdateresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceSetCredentials(lpwsserver: Pcwstr, lpwsinterfacename: Pcwstr, lpwsusername: Pcwstr, lpwsdomainname: Pcwstr, lpwspassword: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentials(lpwsserver.rawAddress.toString(), lpwsinterfacename.rawAddress.toString(), lpwsusername.rawAddress.toString(), lpwsdomainname.rawAddress.toString(), lpwspassword.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceSetCredentialsEx(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentialsEx(hmprserver.toString(), hinterface.rawAddress.toString(), dwlevel.toInt(), lpbbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceSetCustomInfoEx(hmprserver: Long, hinterface: Handle, pcustominfo: ConstPtr<MprIfCustominfoex2>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCustomInfoEx(hmprserver.toString(), hinterface.rawAddress.toString(), pcustominfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceSetInfo(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetInfo(hmprserver.toString(), hinterface.rawAddress.toString(), dwlevel.toInt(), lpbbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceTransportAdd(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, pinterfaceinfo: ConstPtr<UByte>, dwinterfaceinfosize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportAdd(hmprserver.toString(), hinterface.rawAddress.toString(), dwtransportid.toInt(), pinterfaceinfo.rawAddress.toString(), dwinterfaceinfosize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceTransportGetInfo(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, ppinterfaceinfo: MutPtr<MutPtr<UByte>>, lpdwinterfaceinfosize: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportGetInfo(hmprserver.toString(), hinterface.rawAddress.toString(), dwtransportid.toInt(), ppinterfaceinfo.rawAddress.toString(), lpdwinterfaceinfosize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceTransportRemove(hmprserver: Long, hinterface: Handle, dwtransportid: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportRemove(hmprserver.toString(), hinterface.rawAddress.toString(), dwtransportid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceTransportSetInfo(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, pinterfaceinfo: ConstPtr<UByte>, dwinterfaceinfosize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportSetInfo(hmprserver.toString(), hinterface.rawAddress.toString(), dwtransportid.toInt(), pinterfaceinfo.rawAddress.toString(), dwinterfaceinfosize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceUpdatePhonebookInfo(hmprserver: Long, hinterface: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdatePhonebookInfo(hmprserver.toString(), hinterface.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceUpdateRoutes(hmprserver: Long, hinterface: Handle, dwprotocolid: UInt, hevent: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdateRoutes(hmprserver.toString(), hinterface.rawAddress.toString(), dwprotocolid.toInt(), hevent.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminIsDomainRasServer(pszdomain: Pcwstr, pszmachine: Pcwstr, pbisrasserver: MutPtr<Bool>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminIsDomainRasServer(pszdomain.rawAddress.toString(), pszmachine.rawAddress.toString(), pbisrasserver.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminIsServiceInitialized(lpwsservername: Pcwstr, fisserviceinitialized: ConstPtr<Bool>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceInitialized(lpwsservername.rawAddress.toString(), fisserviceinitialized.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminIsServiceRunning(lpwsservername: Pcwstr): Bool =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceRunning(lpwsservername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBBufferFree(pbuffer: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBBufferFree(pbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBEntryCreate(hmibserver: Long, dwpid: UInt, dwroutingpid: UInt, lpentry: ConstPtr<CVoid>, dwentrysize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryCreate(hmibserver.toString(), dwpid.toInt(), dwroutingpid.toInt(), lpentry.rawAddress.toString(), dwentrysize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBEntryDelete(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: ConstPtr<CVoid>, dwentrysize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryDelete(hmibserver.toString(), dwprotocolid.toInt(), dwroutingpid.toInt(), lpentry.rawAddress.toString(), dwentrysize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBEntryGet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: ConstPtr<CVoid>, dwinentrysize: UInt, lplpoutentry: MutPtr<MutPtr<CVoid>>, lpoutentrysize: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGet(hmibserver.toString(), dwprotocolid.toInt(), dwroutingpid.toInt(), lpinentry.rawAddress.toString(), dwinentrysize.toInt(), lplpoutentry.rawAddress.toString(), lpoutentrysize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBEntryGetFirst(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: ConstPtr<CVoid>, dwinentrysize: UInt, lplpoutentry: MutPtr<MutPtr<CVoid>>, lpoutentrysize: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetFirst(hmibserver.toString(), dwprotocolid.toInt(), dwroutingpid.toInt(), lpinentry.rawAddress.toString(), dwinentrysize.toInt(), lplpoutentry.rawAddress.toString(), lpoutentrysize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBEntryGetNext(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: ConstPtr<CVoid>, dwinentrysize: UInt, lplpoutentry: MutPtr<MutPtr<CVoid>>, lpoutentrysize: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetNext(hmibserver.toString(), dwprotocolid.toInt(), dwroutingpid.toInt(), lpinentry.rawAddress.toString(), dwinentrysize.toInt(), lplpoutentry.rawAddress.toString(), lpoutentrysize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBEntrySet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: ConstPtr<CVoid>, dwentrysize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntrySet(hmibserver.toString(), dwprotocolid.toInt(), dwroutingpid.toInt(), lpentry.rawAddress.toString(), dwentrysize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBServerConnect(lpwsservername: Pcwstr, phmibserver: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerConnect(lpwsservername.rawAddress.toString(), phmibserver.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBServerDisconnect(hmibserver: Long) {
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) {
        windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerDisconnect(hmibserver.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mprAdminPortClearStats(hrasserver: Long, hport: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminPortClearStats(hrasserver.toString(), hport.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminPortDisconnect(hrasserver: Long, hport: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminPortDisconnect(hrasserver.toString(), hport.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminPortEnum(hrasserver: Long, dwlevel: UInt, hrasconnection: Handle, lplpbbuffer: MutPtr<MutPtr<UByte>>, dwprefmaxlen: UInt, lpdwentriesread: MutPtr<UInt>, lpdwtotalentries: MutPtr<UInt>, lpdwresumehandle: ConstPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminPortEnum(hrasserver.toString(), dwlevel.toInt(), hrasconnection.rawAddress.toString(), lplpbbuffer.rawAddress.toString(), dwprefmaxlen.toInt(), lpdwentriesread.rawAddress.toString(), lpdwtotalentries.rawAddress.toString(), lpdwresumehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminPortGetInfo(hrasserver: Long, dwlevel: UInt, hport: Handle, lplpbbuffer: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminPortGetInfo(hrasserver.toString(), dwlevel.toInt(), hport.rawAddress.toString(), lplpbbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminPortReset(hrasserver: Long, hport: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminPortReset(hrasserver.toString(), hport.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminRegisterConnectionNotification(hmprserver: Long, heventnotification: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminRegisterConnectionNotification(hmprserver.toString(), heventnotification.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminSendUserMessage(hmprserver: Long, hconnection: Handle, lpwszmessage: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminSendUserMessage(hmprserver.toString(), hconnection.rawAddress.toString(), lpwszmessage.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminServerConnect(lpwsservername: Pcwstr, phmprserver: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerConnect(lpwsservername.rawAddress.toString(), phmprserver.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminServerDisconnect(hmprserver: Long) {
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) {
        windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerDisconnect(hmprserver.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mprAdminServerGetCredentials(hmprserver: Long, dwlevel: UInt, lplpbbuffer: ConstPtr<ConstPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetCredentials(hmprserver.toString(), dwlevel.toInt(), lplpbbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminServerGetInfo(hmprserver: Long, dwlevel: UInt, lplpbbuffer: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfo(hmprserver.toString(), dwlevel.toInt(), lplpbbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminServerGetInfoEx(hmprserver: Long, pserverinfo: MutPtr<MprServerEx1>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfoEx(hmprserver.toString(), pserverinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminServerSetCredentials(hmprserver: Long, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetCredentials(hmprserver.toString(), dwlevel.toInt(), lpbbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfo(hmprserver.toString(), dwlevel.toInt(), lpbbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminServerSetInfoEx(hmprserver: Long, pserverinfo: ConstPtr<MprServerSetConfigEx1>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfoEx(hmprserver.toString(), pserverinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminTransportCreate(hmprserver: Long, dwtransportid: UInt, lpwstransportname: Pcwstr, pglobalinfo: ConstPtr<UByte>, dwglobalinfosize: UInt, pclientinterfaceinfo: ConstPtr<UByte>, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportCreate(hmprserver.toString(), dwtransportid.toInt(), lpwstransportname.rawAddress.toString(), pglobalinfo.rawAddress.toString(), dwglobalinfosize.toInt(), pclientinterfaceinfo.rawAddress.toString(), dwclientinterfaceinfosize.toInt(), lpwsdllpath.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminTransportGetInfo(hmprserver: Long, dwtransportid: UInt, ppglobalinfo: MutPtr<MutPtr<UByte>>, lpdwglobalinfosize: MutPtr<UInt>, ppclientinterfaceinfo: MutPtr<MutPtr<UByte>>, lpdwclientinterfaceinfosize: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportGetInfo(hmprserver.toString(), dwtransportid.toInt(), ppglobalinfo.rawAddress.toString(), lpdwglobalinfosize.rawAddress.toString(), ppclientinterfaceinfo.rawAddress.toString(), lpdwclientinterfaceinfosize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminTransportSetInfo(hmprserver: Long, dwtransportid: UInt, pglobalinfo: ConstPtr<UByte>, dwglobalinfosize: UInt, pclientinterfaceinfo: ConstPtr<UByte>, dwclientinterfaceinfosize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportSetInfo(hmprserver.toString(), dwtransportid.toInt(), pglobalinfo.rawAddress.toString(), dwglobalinfosize.toInt(), pclientinterfaceinfo.rawAddress.toString(), dwclientinterfaceinfosize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminUpdateConnection(hrasserver: Long, hrasconnection: Handle, prasupdateconnection: ConstPtr<RasUpdateConnection>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminUpdateConnection(hrasserver.toString(), hrasconnection.rawAddress.toString(), prasupdateconnection.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminUserGetInfo(lpszserver: Pcwstr, lpszuser: Pcwstr, dwlevel: UInt, lpbbuffer: MutPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminUserGetInfo(lpszserver.rawAddress.toString(), lpszuser.rawAddress.toString(), dwlevel.toInt(), lpbbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminUserSetInfo(lpszserver: Pcwstr, lpszuser: Pcwstr, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprAdminUserSetInfo(lpszserver.rawAddress.toString(), lpszuser.rawAddress.toString(), dwlevel.toInt(), lpbbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigBufferFree(pbuffer: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigBufferFree(pbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigFilterGetInfo(hmprconfig: Handle, dwlevel: UInt, dwtransportid: UInt, lpbuffer: MutPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigFilterGetInfo(hmprconfig.rawAddress.toString(), dwlevel.toInt(), dwtransportid.toInt(), lpbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigFilterSetInfo(hmprconfig: Handle, dwlevel: UInt, dwtransportid: UInt, lpbuffer: ConstPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigFilterSetInfo(hmprconfig.rawAddress.toString(), dwlevel.toInt(), dwtransportid.toInt(), lpbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigGetFriendlyName(hmprconfig: Handle, pszguidname: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigGetFriendlyName(hmprconfig.rawAddress.toString(), pszguidname.rawAddress.toString(), pszbuffer.rawAddress.toString(), dwbuffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigGetGuidName(hmprconfig: Handle, pszfriendlyname: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigGetGuidName(hmprconfig.rawAddress.toString(), pszfriendlyname.rawAddress.toString(), pszbuffer.rawAddress.toString(), dwbuffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceCreate(hmprconfig: Handle, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>, phrouterinterface: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceCreate(hmprconfig.rawAddress.toString(), dwlevel.toInt(), lpbbuffer.rawAddress.toString(), phrouterinterface.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceDelete(hmprconfig: Handle, hrouterinterface: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceDelete(hmprconfig.rawAddress.toString(), hrouterinterface.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceEnum(hmprconfig: Handle, dwlevel: UInt, lplpbuffer: MutPtr<MutPtr<UByte>>, dwprefmaxlen: UInt, lpdwentriesread: MutPtr<UInt>, lpdwtotalentries: MutPtr<UInt>, lpdwresumehandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceEnum(hmprconfig.rawAddress.toString(), dwlevel.toInt(), lplpbuffer.rawAddress.toString(), dwprefmaxlen.toInt(), lpdwentriesread.rawAddress.toString(), lpdwtotalentries.rawAddress.toString(), lpdwresumehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceGetCustomInfoEx(hmprconfig: Handle, hrouterinterface: Handle, pcustominfo: MutPtr<MprIfCustominfoex2>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetCustomInfoEx(hmprconfig.rawAddress.toString(), hrouterinterface.rawAddress.toString(), pcustominfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceGetHandle(hmprconfig: Handle, lpwsinterfacename: Pcwstr, phrouterinterface: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetHandle(hmprconfig.rawAddress.toString(), lpwsinterfacename.rawAddress.toString(), phrouterinterface.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceGetInfo(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lplpbuffer: MutPtr<MutPtr<UByte>>, lpdwbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetInfo(hmprconfig.rawAddress.toString(), hrouterinterface.rawAddress.toString(), dwlevel.toInt(), lplpbuffer.rawAddress.toString(), lpdwbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceSetCustomInfoEx(hmprconfig: Handle, hrouterinterface: Handle, pcustominfo: ConstPtr<MprIfCustominfoex2>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetCustomInfoEx(hmprconfig.rawAddress.toString(), hrouterinterface.rawAddress.toString(), pcustominfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceSetInfo(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetInfo(hmprconfig.rawAddress.toString(), hrouterinterface.rawAddress.toString(), dwlevel.toInt(), lpbbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceTransportAdd(hmprconfig: Handle, hrouterinterface: Handle, dwtransportid: UInt, lpwstransportname: Pcwstr, pinterfaceinfo: ConstPtr<UByte>, dwinterfaceinfosize: UInt, phrouteriftransport: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportAdd(hmprconfig.rawAddress.toString(), hrouterinterface.rawAddress.toString(), dwtransportid.toInt(), lpwstransportname.rawAddress.toString(), pinterfaceinfo.rawAddress.toString(), dwinterfaceinfosize.toInt(), phrouteriftransport.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceTransportEnum(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lplpbuffer: MutPtr<MutPtr<UByte>>, dwprefmaxlen: UInt, lpdwentriesread: MutPtr<UInt>, lpdwtotalentries: MutPtr<UInt>, lpdwresumehandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportEnum(hmprconfig.rawAddress.toString(), hrouterinterface.rawAddress.toString(), dwlevel.toInt(), lplpbuffer.rawAddress.toString(), dwprefmaxlen.toInt(), lpdwentriesread.rawAddress.toString(), lpdwtotalentries.rawAddress.toString(), lpdwresumehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceTransportGetHandle(hmprconfig: Handle, hrouterinterface: Handle, dwtransportid: UInt, phrouteriftransport: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetHandle(hmprconfig.rawAddress.toString(), hrouterinterface.rawAddress.toString(), dwtransportid.toInt(), phrouteriftransport.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceTransportGetInfo(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle, ppinterfaceinfo: MutPtr<MutPtr<UByte>>, lpdwinterfaceinfosize: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetInfo(hmprconfig.rawAddress.toString(), hrouterinterface.rawAddress.toString(), hrouteriftransport.rawAddress.toString(), ppinterfaceinfo.rawAddress.toString(), lpdwinterfaceinfosize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceTransportRemove(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportRemove(hmprconfig.rawAddress.toString(), hrouterinterface.rawAddress.toString(), hrouteriftransport.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceTransportSetInfo(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle, pinterfaceinfo: ConstPtr<UByte>, dwinterfaceinfosize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportSetInfo(hmprconfig.rawAddress.toString(), hrouterinterface.rawAddress.toString(), hrouteriftransport.rawAddress.toString(), pinterfaceinfo.rawAddress.toString(), dwinterfaceinfosize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerBackup(hmprconfig: Handle, lpwspath: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerBackup(hmprconfig.rawAddress.toString(), lpwspath.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerConnect(lpwsservername: Pcwstr, phmprconfig: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerConnect(lpwsservername.rawAddress.toString(), phmprconfig.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerDisconnect(hmprconfig: Handle) {
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) {
        windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerDisconnect(hmprconfig.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mprConfigServerGetInfo(hmprconfig: Handle, dwlevel: UInt, lplpbbuffer: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfo(hmprconfig.rawAddress.toString(), dwlevel.toInt(), lplpbbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerGetInfoEx(hmprconfig: Handle, pserverinfo: MutPtr<MprServerEx1>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfoEx(hmprconfig.rawAddress.toString(), pserverinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerInstall(dwlevel: UInt, pbuffer: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerInstall(dwlevel.toInt(), pbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerRefresh(hmprconfig: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerRefresh(hmprconfig.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerRestore(hmprconfig: Handle, lpwspath: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerRestore(hmprconfig.rawAddress.toString(), lpwspath.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfo(hmprserver.toString(), dwlevel.toInt(), lpbbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerSetInfoEx(hmprconfig: Handle, psetserverconfig: ConstPtr<MprServerSetConfigEx1>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfoEx(hmprconfig.rawAddress.toString(), psetserverconfig.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigTransportCreate(hmprconfig: Handle, dwtransportid: UInt, lpwstransportname: Pcwstr, pglobalinfo: ConstPtr<UByte>, dwglobalinfosize: UInt, pclientinterfaceinfo: ConstPtr<UByte>, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr, phroutertransport: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportCreate(hmprconfig.rawAddress.toString(), dwtransportid.toInt(), lpwstransportname.rawAddress.toString(), pglobalinfo.rawAddress.toString(), dwglobalinfosize.toInt(), pclientinterfaceinfo.rawAddress.toString(), dwclientinterfaceinfosize.toInt(), lpwsdllpath.rawAddress.toString(), phroutertransport.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigTransportDelete(hmprconfig: Handle, hroutertransport: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportDelete(hmprconfig.rawAddress.toString(), hroutertransport.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigTransportEnum(hmprconfig: Handle, dwlevel: UInt, lplpbuffer: MutPtr<MutPtr<UByte>>, dwprefmaxlen: UInt, lpdwentriesread: MutPtr<UInt>, lpdwtotalentries: MutPtr<UInt>, lpdwresumehandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportEnum(hmprconfig.rawAddress.toString(), dwlevel.toInt(), lplpbuffer.rawAddress.toString(), dwprefmaxlen.toInt(), lpdwentriesread.rawAddress.toString(), lpdwtotalentries.rawAddress.toString(), lpdwresumehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigTransportGetHandle(hmprconfig: Handle, dwtransportid: UInt, phroutertransport: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetHandle(hmprconfig.rawAddress.toString(), dwtransportid.toInt(), phroutertransport.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigTransportGetInfo(hmprconfig: Handle, hroutertransport: Handle, ppglobalinfo: MutPtr<MutPtr<UByte>>, lpdwglobalinfosize: MutPtr<UInt>, ppclientinterfaceinfo: MutPtr<MutPtr<UByte>>, lpdwclientinterfaceinfosize: MutPtr<UInt>, lplpwsdllpath: MutPtr<Pwstr>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetInfo(hmprconfig.rawAddress.toString(), hroutertransport.rawAddress.toString(), ppglobalinfo.rawAddress.toString(), lpdwglobalinfosize.rawAddress.toString(), ppclientinterfaceinfo.rawAddress.toString(), lpdwclientinterfaceinfosize.rawAddress.toString(), lplpwsdllpath.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigTransportSetInfo(hmprconfig: Handle, hroutertransport: Handle, pglobalinfo: ConstPtr<UByte>, dwglobalinfosize: UInt, pclientinterfaceinfo: ConstPtr<UByte>, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportSetInfo(hmprconfig.rawAddress.toString(), hroutertransport.rawAddress.toString(), pglobalinfo.rawAddress.toString(), dwglobalinfosize.toInt(), pclientinterfaceinfo.rawAddress.toString(), dwclientinterfaceinfosize.toInt(), lpwsdllpath.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoBlockAdd(lpheader: ConstPtr<CVoid>, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: ConstPtr<UByte>, lplpnewheader: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockAdd(lpheader.rawAddress.toString(), dwinfotype.toInt(), dwitemsize.toInt(), dwitemcount.toInt(), lpitemdata.rawAddress.toString(), lplpnewheader.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoBlockFind(lpheader: ConstPtr<CVoid>, dwinfotype: UInt, lpdwitemsize: MutPtr<UInt>, lpdwitemcount: MutPtr<UInt>, lplpitemdata: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockFind(lpheader.rawAddress.toString(), dwinfotype.toInt(), lpdwitemsize.rawAddress.toString(), lpdwitemcount.rawAddress.toString(), lplpitemdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoBlockQuerySize(lpheader: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockQuerySize(lpheader.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoBlockRemove(lpheader: ConstPtr<CVoid>, dwinfotype: UInt, lplpnewheader: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockRemove(lpheader.rawAddress.toString(), dwinfotype.toInt(), lplpnewheader.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoBlockSet(lpheader: ConstPtr<CVoid>, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: ConstPtr<UByte>, lplpnewheader: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockSet(lpheader.rawAddress.toString(), dwinfotype.toInt(), dwitemsize.toInt(), dwitemcount.toInt(), lpitemdata.rawAddress.toString(), lplpnewheader.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoCreate(dwversion: UInt, lplpnewheader: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprInfoCreate(dwversion.toInt(), lplpnewheader.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoDelete(lpheader: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprInfoDelete(lpheader.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoDuplicate(lpheader: ConstPtr<CVoid>, lplpnewheader: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprInfoDuplicate(lpheader.rawAddress.toString(), lplpnewheader.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoRemoveAll(lpheader: ConstPtr<CVoid>, lplpnewheader: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasMprInfoRemoveAll(lpheader.rawAddress.toString(), lplpnewheader.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasClearConnectionStatistics(hrasconn: Hrasconn): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasClearConnectionStatistics(hrasconn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasClearLinkStatistics(hrasconn: Hrasconn, dwsubentry: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasClearLinkStatistics(hrasconn.rawAddress.toString(), dwsubentry.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasConnectionNotificationA(param0: Hrasconn, param1: Handle, param2: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasConnectionNotificationW(param0: Hrasconn, param1: Handle, param2: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasCreatePhonebookEntryA(param0: Hwnd, param1: Pcstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryA(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasCreatePhonebookEntryW(param0: Hwnd, param1: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryW(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDeleteEntryA(param0: Pcstr, param1: Pcstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryA(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDeleteEntryW(param0: Pcwstr, param1: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryW(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDeleteSubEntryA(pszphonebook: Pcstr, pszentry: Pcstr, dwsubentryid: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryA(pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), dwsubentryid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDeleteSubEntryW(pszphonebook: Pcwstr, pszentry: Pcwstr, dwsubentryid: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryW(pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), dwsubentryid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDialA(param0: ConstPtr<Rasdialextensions>, param1: Pcstr, param2: ConstPtr<Rasdialparamsa>, param3: UInt, param4: ConstPtr<CVoid>, param5: MutPtr<Hrasconn>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasDialA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.toInt(), param4.rawAddress.toString(), param5.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDialDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpszphonenumber: Pcstr, lpinfo: MutPtr<Rasdialdlg>): Bool =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasDialDlgA(lpszphonebook.rawAddress.toString(), lpszentry.rawAddress.toString(), lpszphonenumber.rawAddress.toString(), lpinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDialDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpszphonenumber: Pcwstr, lpinfo: MutPtr<Rasdialdlg>): Bool =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasDialDlgW(lpszphonebook.rawAddress.toString(), lpszentry.rawAddress.toString(), lpszphonenumber.rawAddress.toString(), lpinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDialW(param0: ConstPtr<Rasdialextensions>, param1: Pcwstr, param2: ConstPtr<Rasdialparamsw>, param3: UInt, param4: ConstPtr<CVoid>, param5: MutPtr<Hrasconn>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasDialW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.toInt(), param4.rawAddress.toString(), param5.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEditPhonebookEntryA(param0: Hwnd, param1: Pcstr, param2: Pcstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEditPhonebookEntryW(param0: Hwnd, param1: Pcwstr, param2: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEntryDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpinfo: MutPtr<Rasentrydlga>): Bool =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasEntryDlgA(lpszphonebook.rawAddress.toString(), lpszentry.rawAddress.toString(), lpinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEntryDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpinfo: MutPtr<Rasentrydlgw>): Bool =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasEntryDlgW(lpszphonebook.rawAddress.toString(), lpszentry.rawAddress.toString(), lpinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumAutodialAddressesA(lpprasautodialaddresses: MutPtr<Pstr>, lpdwcbrasautodialaddresses: MutPtr<UInt>, lpdwcrasautodialaddresses: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesA(lpprasautodialaddresses.rawAddress.toString(), lpdwcbrasautodialaddresses.rawAddress.toString(), lpdwcrasautodialaddresses.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumAutodialAddressesW(lpprasautodialaddresses: MutPtr<Pwstr>, lpdwcbrasautodialaddresses: MutPtr<UInt>, lpdwcrasautodialaddresses: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesW(lpprasautodialaddresses.rawAddress.toString(), lpdwcbrasautodialaddresses.rawAddress.toString(), lpdwcrasautodialaddresses.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumConnectionsA(param0: MutPtr<Rasconna>, param1: MutPtr<UInt>, param2: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumConnectionsW(param0: MutPtr<Rasconnw>, param1: MutPtr<UInt>, param2: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumDevicesA(param0: MutPtr<Rasdevinfoa>, param1: MutPtr<UInt>, param2: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumDevicesW(param0: MutPtr<Rasdevinfow>, param1: MutPtr<UInt>, param2: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumEntriesA(param0: Pcstr, param1: Pcstr, param2: MutPtr<Rasentrynamea>, param3: MutPtr<UInt>, param4: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.rawAddress.toString(), param4.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumEntriesW(param0: Pcwstr, param1: Pcwstr, param2: MutPtr<Rasentrynamew>, param3: MutPtr<UInt>, param4: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.rawAddress.toString(), param4.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasFreeEapUserIdentityA(praseapuseridentity: ConstPtr<Raseapuseridentitya>) {
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) {
        windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityA(praseapuseridentity.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rasFreeEapUserIdentityW(praseapuseridentity: ConstPtr<Raseapuseridentityw>) {
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) {
        windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityW(praseapuseridentity.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rasGetAutodialAddressA(param0: Pcstr, param1: ConstPtr<UInt>, param2: MutPtr<Rasautodialentrya>, param3: MutPtr<UInt>, param4: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.rawAddress.toString(), param4.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetAutodialAddressW(param0: Pcwstr, param1: ConstPtr<UInt>, param2: MutPtr<Rasautodialentryw>, param3: MutPtr<UInt>, param4: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.rawAddress.toString(), param4.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetAutodialEnableA(param0: UInt, param1: MutPtr<Bool>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableA(param0.toInt(), param1.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetAutodialEnableW(param0: UInt, param1: MutPtr<Bool>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableW(param0.toInt(), param1.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetAutodialParamA(param0: UInt, param1: MutPtr<CVoid>, param2: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamA(param0.toInt(), param1.rawAddress.toString(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetAutodialParamW(param0: UInt, param1: MutPtr<CVoid>, param2: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamW(param0.toInt(), param1.rawAddress.toString(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetConnectStatusA(param0: Hrasconn, param1: MutPtr<Rasconnstatusa>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusA(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetConnectStatusW(param0: Hrasconn, param1: MutPtr<Rasconnstatusw>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusW(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetConnectionStatistics(hrasconn: Hrasconn, lpstatistics: MutPtr<RasStats>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetConnectionStatistics(hrasconn.rawAddress.toString(), lpstatistics.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetCountryInfoA(param0: MutPtr<Rasctryinfo>, param1: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoA(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetCountryInfoW(param0: MutPtr<Rasctryinfo>, param1: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoW(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetCredentialsA(param0: Pcstr, param1: Pcstr, param2: MutPtr<Rascredentialsa>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetCredentialsW(param0: Pcwstr, param1: Pcwstr, param2: MutPtr<Rascredentialsw>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetCustomAuthDataA(pszphonebook: Pcstr, pszentry: Pcstr, pbcustomauthdata: MutPtr<UByte>, pdwsizeofcustomauthdata: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataA(pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), pbcustomauthdata.rawAddress.toString(), pdwsizeofcustomauthdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetCustomAuthDataW(pszphonebook: Pcwstr, pszentry: Pcwstr, pbcustomauthdata: MutPtr<UByte>, pdwsizeofcustomauthdata: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataW(pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), pbcustomauthdata.rawAddress.toString(), pdwsizeofcustomauthdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEapUserDataA(htoken: Handle, pszphonebook: Pcstr, pszentry: Pcstr, pbeapdata: MutPtr<UByte>, pdwsizeofeapdata: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataA(htoken.rawAddress.toString(), pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), pbeapdata.rawAddress.toString(), pdwsizeofeapdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEapUserDataW(htoken: Handle, pszphonebook: Pcwstr, pszentry: Pcwstr, pbeapdata: MutPtr<UByte>, pdwsizeofeapdata: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataW(htoken.rawAddress.toString(), pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), pbeapdata.rawAddress.toString(), pdwsizeofeapdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEapUserIdentityA(pszphonebook: Pcstr, pszentry: Pcstr, dwflags: UInt, hwnd: Hwnd, ppraseapuseridentity: MutPtr<MutPtr<Raseapuseridentitya>>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityA(pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), dwflags.toInt(), hwnd.rawAddress.toString(), ppraseapuseridentity.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEapUserIdentityW(pszphonebook: Pcwstr, pszentry: Pcwstr, dwflags: UInt, hwnd: Hwnd, ppraseapuseridentity: MutPtr<MutPtr<Raseapuseridentityw>>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityW(pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), dwflags.toInt(), hwnd.rawAddress.toString(), ppraseapuseridentity.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEntryDialParamsA(param0: Pcstr, param1: MutPtr<Rasdialparamsa>, param2: MutPtr<Bool>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEntryDialParamsW(param0: Pcwstr, param1: MutPtr<Rasdialparamsw>, param2: MutPtr<Bool>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: MutPtr<Rasentrya>, param3: MutPtr<UInt>, param4: MutPtr<UByte>, param5: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.rawAddress.toString(), param4.rawAddress.toString(), param5.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: MutPtr<Rasentryw>, param3: MutPtr<UInt>, param4: MutPtr<UByte>, param5: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.rawAddress.toString(), param4.rawAddress.toString(), param5.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetErrorStringA(resourceid: UInt, lpszstring: Pstr, inbufsize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringA(resourceid.toInt(), lpszstring.rawAddress.toString(), inbufsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetErrorStringW(resourceid: UInt, lpszstring: Pwstr, inbufsize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringW(resourceid.toInt(), lpszstring.rawAddress.toString(), inbufsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetLinkStatistics(hrasconn: Hrasconn, dwsubentry: UInt, lpstatistics: MutPtr<RasStats>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetLinkStatistics(hrasconn.rawAddress.toString(), dwsubentry.toInt(), lpstatistics.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetPCscf(lpszpcscf: Pwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetPCscf(lpszpcscf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetProjectionInfoA(param0: Hrasconn, param1: Rasprojection, param2: MutPtr<CVoid>, param3: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoA(param0.rawAddress.toString(), param1, param2.rawAddress.toString(), param3.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetProjectionInfoEx(hrasconn: Hrasconn, prasprojection: MutPtr<RasProjectionInfo>, lpdwsize: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoEx(hrasconn.rawAddress.toString(), prasprojection.rawAddress.toString(), lpdwsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetProjectionInfoW(param0: Hrasconn, param1: Rasprojection, param2: MutPtr<CVoid>, param3: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoW(param0.rawAddress.toString(), param1, param2.rawAddress.toString(), param3.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetSubEntryHandleA(param0: Hrasconn, param1: UInt, param2: MutPtr<Hrasconn>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleA(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetSubEntryHandleW(param0: Hrasconn, param1: UInt, param2: MutPtr<Hrasconn>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleW(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetSubEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: UInt, param3: MutPtr<Rassubentrya>, param4: MutPtr<UInt>, param5: MutPtr<UByte>, param6: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString(), param4.rawAddress.toString(), param5.rawAddress.toString(), param6.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetSubEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: UInt, param3: MutPtr<Rassubentryw>, param4: MutPtr<UInt>, param5: MutPtr<UByte>, param6: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString(), param4.rawAddress.toString(), param5.rawAddress.toString(), param6.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasHangUpA(param0: Hrasconn): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasHangUpA(param0.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasHangUpW(param0: Hrasconn): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasHangUpW(param0.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasInvokeEapUI(param0: Hrasconn, param1: UInt, param2: ConstPtr<Rasdialextensions>, param3: Hwnd): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasInvokeEapUI(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString(), param3.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasPhonebookDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpinfo: MutPtr<Raspbdlga>): Bool =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgA(lpszphonebook.rawAddress.toString(), lpszentry.rawAddress.toString(), lpinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasPhonebookDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpinfo: MutPtr<Raspbdlgw>): Bool =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgW(lpszphonebook.rawAddress.toString(), lpszentry.rawAddress.toString(), lpinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasRenameEntryA(param0: Pcstr, param1: Pcstr, param2: Pcstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasRenameEntryA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasRenameEntryW(param0: Pcwstr, param1: Pcwstr, param2: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasRenameEntryW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetAutodialAddressA(param0: Pcstr, param1: UInt, param2: ConstPtr<Rasautodialentrya>, param3: UInt, param4: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressA(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString(), param3.toInt(), param4.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetAutodialAddressW(param0: Pcwstr, param1: UInt, param2: ConstPtr<Rasautodialentryw>, param3: UInt, param4: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressW(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString(), param3.toInt(), param4.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetAutodialEnableA(param0: UInt, param1: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableA(param0.toInt(), param1) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetAutodialEnableW(param0: UInt, param1: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableW(param0.toInt(), param1) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetAutodialParamA(param0: UInt, param1: ConstPtr<CVoid>, param2: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamA(param0.toInt(), param1.rawAddress.toString(), param2.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetAutodialParamW(param0: UInt, param1: ConstPtr<CVoid>, param2: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamW(param0.toInt(), param1.rawAddress.toString(), param2.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetCredentialsA(param0: Pcstr, param1: Pcstr, param2: ConstPtr<Rascredentialsa>, param3: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetCredentialsW(param0: Pcwstr, param1: Pcwstr, param2: ConstPtr<Rascredentialsw>, param3: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetCustomAuthDataA(pszphonebook: Pcstr, pszentry: Pcstr, pbcustomauthdata: ConstPtr<UByte>, dwsizeofcustomauthdata: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataA(pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), pbcustomauthdata.rawAddress.toString(), dwsizeofcustomauthdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetCustomAuthDataW(pszphonebook: Pcwstr, pszentry: Pcwstr, pbcustomauthdata: ConstPtr<UByte>, dwsizeofcustomauthdata: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataW(pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), pbcustomauthdata.rawAddress.toString(), dwsizeofcustomauthdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetEapUserDataA(htoken: Handle, pszphonebook: Pcstr, pszentry: Pcstr, pbeapdata: ConstPtr<UByte>, dwsizeofeapdata: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataA(htoken.rawAddress.toString(), pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), pbeapdata.rawAddress.toString(), dwsizeofeapdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetEapUserDataW(htoken: Handle, pszphonebook: Pcwstr, pszentry: Pcwstr, pbeapdata: ConstPtr<UByte>, dwsizeofeapdata: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataW(htoken.rawAddress.toString(), pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), pbeapdata.rawAddress.toString(), dwsizeofeapdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetEntryDialParamsA(param0: Pcstr, param1: ConstPtr<Rasdialparamsa>, param2: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetEntryDialParamsW(param0: Pcwstr, param1: ConstPtr<Rasdialparamsw>, param2: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: ConstPtr<Rasentrya>, param3: UInt, param4: ConstPtr<UByte>, param5: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.toInt(), param4.rawAddress.toString(), param5.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: ConstPtr<Rasentryw>, param3: UInt, param4: ConstPtr<UByte>, param5: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.toInt(), param4.rawAddress.toString(), param5.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetSubEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: UInt, param3: ConstPtr<Rassubentrya>, param4: UInt, param5: ConstPtr<UByte>, param6: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString(), param4.toInt(), param5.rawAddress.toString(), param6.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetSubEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: UInt, param3: ConstPtr<Rassubentryw>, param4: UInt, param5: ConstPtr<UByte>, param6: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString(), param4.toInt(), param5.rawAddress.toString(), param6.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasUpdateConnection(hrasconn: Hrasconn, lprasupdateconn: ConstPtr<Rasupdateconn>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasUpdateConnection(hrasconn.rawAddress.toString(), lprasupdateconn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasValidateEntryNameA(param0: Pcstr, param1: Pcstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameA(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasValidateEntryNameW(param0: Pcwstr, param1: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameW(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmAddNextHop(rtmreghandle: Long, nexthopinfo: MutPtr<RtmNexthopInfo>, nexthophandle: MutPtr<Long>, changeflags: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmAddNextHop(rtmreghandle.toString(), nexthopinfo.rawAddress.toString(), nexthophandle.rawAddress.toString(), changeflags.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmAddRouteToDest(rtmreghandle: Long, routehandle: MutPtr<Long>, destaddress: MutPtr<RtmNetAddress>, routeinfo: MutPtr<RtmRouteInfo>, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmAddRouteToDest(rtmreghandle.toString(), routehandle.rawAddress.toString(), destaddress.rawAddress.toString(), routeinfo.rawAddress.toString(), timetolive.toInt(), routelisthandle.toString(), notifytype.toInt(), notifyhandle.toString(), changeflags.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmBlockMethods(rtmreghandle: Long, targethandle: Handle, targettype: UByte, blockingflag: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmBlockMethods(rtmreghandle.toString(), targethandle.rawAddress.toString(), targettype.toInt(), blockingflag.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmConvertIpv6AddressAndLengthToNetAddress(pnetaddress: MutPtr<RtmNetAddress>, address: In6Addr, dwlength: UInt, dwaddresssize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmConvertNetAddressToIpv6AddressAndLength(pnetaddress: MutPtr<RtmNetAddress>, paddress: MutPtr<In6Addr>, plength: MutPtr<UInt>, dwaddresssize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmConvertNetAddressToIpv6AddressAndLength(pnetaddress.rawAddress.toString(), paddress.rawAddress.toString(), plength.rawAddress.toString(), dwaddresssize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmCreateDestEnum(rtmreghandle: Long, targetviews: UInt, enumflags: UInt, netaddress: MutPtr<RtmNetAddress>, protocolid: UInt, rtmenumhandle: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmCreateDestEnum(rtmreghandle.toString(), targetviews.toInt(), enumflags.toInt(), netaddress.rawAddress.toString(), protocolid.toInt(), rtmenumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmCreateNextHopEnum(rtmreghandle: Long, enumflags: UInt, netaddress: MutPtr<RtmNetAddress>, rtmenumhandle: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmCreateNextHopEnum(rtmreghandle.toString(), enumflags.toInt(), netaddress.rawAddress.toString(), rtmenumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmCreateRouteEnum(rtmreghandle: Long, desthandle: Long, targetviews: UInt, enumflags: UInt, startdest: MutPtr<RtmNetAddress>, matchingflags: UInt, criteriaroute: MutPtr<RtmRouteInfo>, criteriainterface: UInt, rtmenumhandle: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteEnum(rtmreghandle.toString(), desthandle.toString(), targetviews.toInt(), enumflags.toInt(), startdest.rawAddress.toString(), matchingflags.toInt(), criteriaroute.rawAddress.toString(), criteriainterface.toInt(), rtmenumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmCreateRouteList(rtmreghandle: Long, routelisthandle: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteList(rtmreghandle.toString(), routelisthandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmCreateRouteListEnum(rtmreghandle: Long, routelisthandle: Long, rtmenumhandle: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteListEnum(rtmreghandle.toString(), routelisthandle.toString(), rtmenumhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmDeleteEnumHandle(rtmreghandle: Long, enumhandle: Long): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmDeleteEnumHandle(rtmreghandle.toString(), enumhandle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmDeleteNextHop(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: MutPtr<RtmNexthopInfo>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmDeleteNextHop(rtmreghandle.toString(), nexthophandle.toString(), nexthopinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmDeleteRouteList(rtmreghandle: Long, routelisthandle: Long): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteList(rtmreghandle.toString(), routelisthandle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmDeleteRouteToDest(rtmreghandle: Long, routehandle: Long, changeflags: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteToDest(rtmreghandle.toString(), routehandle.toString(), changeflags.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmDeregisterEntity(rtmreghandle: Long): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmDeregisterEntity(rtmreghandle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmDeregisterFromChangeNotification(rtmreghandle: Long, notifyhandle: Long): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmDeregisterFromChangeNotification(rtmreghandle.toString(), notifyhandle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmFindNextHop(rtmreghandle: Long, nexthopinfo: MutPtr<RtmNexthopInfo>, nexthophandle: MutPtr<Long>, nexthoppointer: MutPtr<MutPtr<RtmNexthopInfo>>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmFindNextHop(rtmreghandle.toString(), nexthopinfo.rawAddress.toString(), nexthophandle.rawAddress.toString(), nexthoppointer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetChangeStatus(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, changestatus: MutPtr<Bool>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmGetChangeStatus(rtmreghandle.toString(), notifyhandle.toString(), desthandle.toString(), changestatus.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: MutPtr<UInt>, changeddests: MutPtr<RtmDestInfo>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmGetChangedDests(rtmreghandle.toString(), notifyhandle.toString(), numdests.rawAddress.toString(), changeddests.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetDestInfo(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: MutPtr<RtmDestInfo>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmGetDestInfo(rtmreghandle.toString(), desthandle.toString(), protocolid.toInt(), targetviews.toInt(), destinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetEntityInfo(rtmreghandle: Long, entityhandle: Long, entityinfo: MutPtr<RtmEntityInfo>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmGetEntityInfo(rtmreghandle.toString(), entityhandle.toString(), entityinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetEntityMethods(rtmreghandle: Long, entityhandle: Long, nummethods: MutPtr<UInt>, exptmethods: MutPtr<RtmEntityExportMethod>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmGetEntityMethods(rtmreghandle.toString(), entityhandle.toString(), nummethods.rawAddress.toString(), exptmethods.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetEnumDests(rtmreghandle: Long, enumhandle: Long, numdests: MutPtr<UInt>, destinfos: MutPtr<RtmDestInfo>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumDests(rtmreghandle.toString(), enumhandle.toString(), numdests.rawAddress.toString(), destinfos.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetEnumNextHops(rtmreghandle: Long, enumhandle: Long, numnexthops: MutPtr<UInt>, nexthophandles: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumNextHops(rtmreghandle.toString(), enumhandle.toString(), numnexthops.rawAddress.toString(), nexthophandles.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: MutPtr<UInt>, routehandles: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumRoutes(rtmreghandle.toString(), enumhandle.toString(), numroutes.rawAddress.toString(), routehandles.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetExactMatchDestination(rtmreghandle: Long, destaddress: MutPtr<RtmNetAddress>, protocolid: UInt, targetviews: UInt, destinfo: MutPtr<RtmDestInfo>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchDestination(rtmreghandle.toString(), destaddress.rawAddress.toString(), protocolid.toInt(), targetviews.toInt(), destinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetExactMatchRoute(rtmreghandle: Long, destaddress: MutPtr<RtmNetAddress>, matchingflags: UInt, routeinfo: MutPtr<RtmRouteInfo>, interfaceindex: UInt, targetviews: UInt, routehandle: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchRoute(rtmreghandle.toString(), destaddress.rawAddress.toString(), matchingflags.toInt(), routeinfo.rawAddress.toString(), interfaceindex.toInt(), targetviews.toInt(), routehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetLessSpecificDestination(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: MutPtr<RtmDestInfo>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmGetLessSpecificDestination(rtmreghandle.toString(), desthandle.toString(), protocolid.toInt(), targetviews.toInt(), destinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetListEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: MutPtr<UInt>, routehandles: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmGetListEnumRoutes(rtmreghandle.toString(), enumhandle.toString(), numroutes.rawAddress.toString(), routehandles.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetMostSpecificDestination(rtmreghandle: Long, destaddress: MutPtr<RtmNetAddress>, protocolid: UInt, targetviews: UInt, destinfo: MutPtr<RtmDestInfo>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmGetMostSpecificDestination(rtmreghandle.toString(), destaddress.rawAddress.toString(), protocolid.toInt(), targetviews.toInt(), destinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetNextHopInfo(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: MutPtr<RtmNexthopInfo>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopInfo(rtmreghandle.toString(), nexthophandle.toString(), nexthopinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetNextHopPointer(rtmreghandle: Long, nexthophandle: Long, nexthoppointer: MutPtr<MutPtr<RtmNexthopInfo>>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopPointer(rtmreghandle.toString(), nexthophandle.toString(), nexthoppointer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetOpaqueInformationPointer(rtmreghandle: Long, desthandle: Long, opaqueinfopointer: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmGetOpaqueInformationPointer(rtmreghandle.toString(), desthandle.toString(), opaqueinfopointer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetRegisteredEntities(rtmreghandle: Long, numentities: MutPtr<UInt>, entityhandles: MutPtr<Long>, entityinfos: MutPtr<RtmEntityInfo>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmGetRegisteredEntities(rtmreghandle.toString(), numentities.rawAddress.toString(), entityhandles.rawAddress.toString(), entityinfos.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetRouteInfo(rtmreghandle: Long, routehandle: Long, routeinfo: MutPtr<RtmRouteInfo>, destaddress: MutPtr<RtmNetAddress>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmGetRouteInfo(rtmreghandle.toString(), routehandle.toString(), routeinfo.rawAddress.toString(), destaddress.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetRoutePointer(rtmreghandle: Long, routehandle: Long, routepointer: MutPtr<MutPtr<RtmRouteInfo>>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmGetRoutePointer(rtmreghandle.toString(), routehandle.toString(), routepointer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmHoldDestination(rtmreghandle: Long, desthandle: Long, targetviews: UInt, holdtime: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmHoldDestination(rtmreghandle.toString(), desthandle.toString(), targetviews.toInt(), holdtime.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmIgnoreChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmIgnoreChangedDests(rtmreghandle.toString(), notifyhandle.toString(), numdests.toInt(), changeddests.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmInsertInRouteList(rtmreghandle: Long, routelisthandle: Long, numroutes: UInt, routehandles: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmInsertInRouteList(rtmreghandle.toString(), routelisthandle.toString(), numroutes.toInt(), routehandles.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmInvokeMethod(rtmreghandle: Long, entityhandle: Long, input: MutPtr<RtmEntityMethodInput>, outputsize: MutPtr<UInt>, output: MutPtr<RtmEntityMethodOutput>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmInvokeMethod(rtmreghandle.toString(), entityhandle.toString(), input.rawAddress.toString(), outputsize.rawAddress.toString(), output.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmIsBestRoute(rtmreghandle: Long, routehandle: Long, bestinviews: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmIsBestRoute(rtmreghandle.toString(), routehandle.toString(), bestinviews.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmIsMarkedForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, destmarked: MutPtr<Bool>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmIsMarkedForChangeNotification(rtmreghandle.toString(), notifyhandle.toString(), desthandle.toString(), destmarked.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmLockDestination(rtmreghandle: Long, desthandle: Long, exclusive: Bool, lockdest: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmLockDestination(rtmreghandle.toString(), desthandle.toString(), exclusive, lockdest) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmLockNextHop(rtmreghandle: Long, nexthophandle: Long, exclusive: Bool, locknexthop: Bool, nexthoppointer: MutPtr<MutPtr<RtmNexthopInfo>>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmLockNextHop(rtmreghandle.toString(), nexthophandle.toString(), exclusive, locknexthop, nexthoppointer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmLockRoute(rtmreghandle: Long, routehandle: Long, exclusive: Bool, lockroute: Bool, routepointer: MutPtr<MutPtr<RtmRouteInfo>>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmLockRoute(rtmreghandle.toString(), routehandle.toString(), exclusive, lockroute, routepointer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmMarkDestForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, markdest: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmMarkDestForChangeNotification(rtmreghandle.toString(), notifyhandle.toString(), desthandle.toString(), markdest) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReferenceHandles(rtmreghandle: Long, numhandles: UInt, rtmhandles: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmReferenceHandles(rtmreghandle.toString(), numhandles.toInt(), rtmhandles.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmRegisterEntity(rtmentityinfo: MutPtr<RtmEntityInfo>, exportmethods: MutPtr<RtmEntityExportMethods>, eventcallback: RtmEventCallback, reserveopaquepointer: Bool, rtmregprofile: MutPtr<RtmRegnProfile>, rtmreghandle: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmRegisterEntity(rtmentityinfo.rawAddress.toString(), exportmethods.rawAddress.toString(), 0L.toString(), reserveopaquepointer, rtmregprofile.rawAddress.toString(), rtmreghandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmRegisterForChangeNotification(rtmreghandle: Long, targetviews: UInt, notifyflags: UInt, notifycontext: MutPtr<CVoid>, notifyhandle: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmRegisterForChangeNotification(rtmreghandle.toString(), targetviews.toInt(), notifyflags.toInt(), notifycontext.rawAddress.toString(), notifyhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: MutPtr<RtmDestInfo>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseChangedDests(rtmreghandle.toString(), notifyhandle.toString(), numdests.toInt(), changeddests.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseDestInfo(rtmreghandle: Long, destinfo: MutPtr<RtmDestInfo>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseDestInfo(rtmreghandle.toString(), destinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseDests(rtmreghandle: Long, numdests: UInt, destinfos: MutPtr<RtmDestInfo>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseDests(rtmreghandle.toString(), numdests.toInt(), destinfos.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseEntities(rtmreghandle: Long, numentities: UInt, entityhandles: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntities(rtmreghandle.toString(), numentities.toInt(), entityhandles.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseEntityInfo(rtmreghandle: Long, entityinfo: MutPtr<RtmEntityInfo>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntityInfo(rtmreghandle.toString(), entityinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseNextHopInfo(rtmreghandle: Long, nexthopinfo: MutPtr<RtmNexthopInfo>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHopInfo(rtmreghandle.toString(), nexthopinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseNextHops(rtmreghandle: Long, numnexthops: UInt, nexthophandles: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHops(rtmreghandle.toString(), numnexthops.toInt(), nexthophandles.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseRouteInfo(rtmreghandle: Long, routeinfo: MutPtr<RtmRouteInfo>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseRouteInfo(rtmreghandle.toString(), routeinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseRoutes(rtmreghandle: Long, numroutes: UInt, routehandles: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseRoutes(rtmreghandle.toString(), numroutes.toInt(), routehandles.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmUpdateAndUnlockRoute(rtmreghandle: Long, routehandle: Long, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAddon != null) (windowsWin32NetworkmanagementRrasNapiAddon.windowssysWindowsWin32NetworkmanagementRrasRtmUpdateAndUnlockRoute(rtmreghandle.toString(), routehandle.toString(), timetolive.toInt(), routelisthandle.toString(), notifytype.toInt(), notifyhandle.toString(), changeflags.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
