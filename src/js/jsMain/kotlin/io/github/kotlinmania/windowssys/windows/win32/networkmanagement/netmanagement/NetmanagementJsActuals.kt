@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

private val windowsWin32NetworkmanagementNetmanagementNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun getNetScheduleAccountInformation(pwszservername: Pcwstr, ccaccount: UInt, wszaccount: Pwstr): Hresult =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementGetNetScheduleAccountInformation(pwszservername.rawAddress.toString(), ccaccount.toInt(), wszaccount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iNetLogonControl2(servername: Pcwstr, functioncode: UInt, querylevel: UInt, data: ConstPtr<UByte>, buffer: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementINetLogonControl2(servername.rawAddress.toString(), functioncode.toInt(), querylevel.toInt(), data.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logErrorA(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: ConstPtr<Pcstr>, dwerrorcode: UInt) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementLogErrorA(dwmessageid.toInt(), cnumberofsubstrings.toInt(), plpwssubstrings.rawAddress.toString(), dwerrorcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun logErrorW(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: ConstPtr<Pcwstr>, dwerrorcode: UInt) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementLogErrorW(dwmessageid.toInt(), cnumberofsubstrings.toInt(), plpwssubstrings.rawAddress.toString(), dwerrorcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun logEventA(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: ConstPtr<Pcstr>) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementLogEventA(weventtype.toInt(), dwmessageid.toInt(), cnumberofsubstrings.toInt(), plpwssubstrings.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun logEventW(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: ConstPtr<Pcwstr>) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementLogEventW(weventtype.toInt(), dwmessageid.toInt(), cnumberofsubstrings.toInt(), plpwssubstrings.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mprSetupProtocolEnum(dwtransportid: UInt, lplpbuffer: MutPtr<MutPtr<UByte>>, lpdwentriesread: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementMprSetupProtocolEnum(dwtransportid.toInt(), lplpbuffer.rawAddress.toString(), lpdwentriesread.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprSetupProtocolFree(lpbuffer: MutPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementMprSetupProtocolFree(lpbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAccessAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessAdd(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAccessDel(servername: Pcwstr, resource: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessDel(servername.rawAddress.toString(), resource.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAccessEnum(servername: Pcwstr, basepath: Pcwstr, recursive: UInt, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessEnum(servername.rawAddress.toString(), basepath.rawAddress.toString(), recursive.toInt(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAccessGetInfo(servername: Pcwstr, resource: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessGetInfo(servername.rawAddress.toString(), resource.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAccessGetUserPerms(servername: Pcwstr, ugname: Pcwstr, resource: Pcwstr, perms: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessGetUserPerms(servername.rawAddress.toString(), ugname.rawAddress.toString(), resource.rawAddress.toString(), perms.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAccessSetInfo(servername: Pcwstr, resource: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessSetInfo(servername.rawAddress.toString(), resource.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAddAlternateComputerName(server: Pcwstr, alternatename: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetAddAlternateComputerName(server.rawAddress.toString(), alternatename.rawAddress.toString(), domainaccount.rawAddress.toString(), domainaccountpassword.rawAddress.toString(), reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAddServiceAccount(servername: Pcwstr, accountname: Pcwstr, password: Pcwstr, flags: UInt): Ntstatus =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetAddServiceAccount(servername.rawAddress.toString(), accountname.rawAddress.toString(), password.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAlertRaise(alerttype: Pcwstr, buffer: ConstPtr<CVoid>, buffersize: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetAlertRaise(alerttype.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAlertRaiseEx(alerttype: Pcwstr, variableinfo: ConstPtr<CVoid>, variableinfosize: UInt, servicename: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetAlertRaiseEx(alerttype.rawAddress.toString(), variableinfo.rawAddress.toString(), variableinfosize.toInt(), servicename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netApiBufferAllocate(bytecount: UInt, buffer: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferAllocate(bytecount.toInt(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netApiBufferFree(buffer: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferFree(buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netApiBufferReallocate(oldbuffer: ConstPtr<CVoid>, newbytecount: UInt, newbuffer: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferReallocate(oldbuffer.rawAddress.toString(), newbytecount.toInt(), newbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netApiBufferSize(buffer: ConstPtr<CVoid>, bytecount: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferSize(buffer.rawAddress.toString(), bytecount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAuditClear(server: Pcwstr, backupfile: Pcwstr, service: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetAuditClear(server.rawAddress.toString(), backupfile.rawAddress.toString(), service.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAuditRead(server: Pcwstr, service: Pcwstr, auditloghandle: MutPtr<Hlog>, offset: UInt, reserved1: MutPtr<UInt>, reserved2: UInt, offsetflag: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, bytesread: MutPtr<UInt>, totalavailable: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetAuditRead(server.rawAddress.toString(), service.rawAddress.toString(), auditloghandle.rawAddress.toString(), offset.toInt(), reserved1.rawAddress.toString(), reserved2.toInt(), offsetflag.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), bytesread.rawAddress.toString(), totalavailable.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAuditWrite(type: UInt, buf: MutPtr<UByte>, numbytes: UInt, service: Pcwstr, reserved: MutPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetAuditWrite(type.toInt(), buf.rawAddress.toString(), numbytes.toInt(), service.rawAddress.toString(), reserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netConfigGet(server: Pcwstr, component: Pcwstr, parameter: Pcwstr, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetConfigGet(server.rawAddress.toString(), component.rawAddress.toString(), parameter.rawAddress.toString(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netConfigGetAll(server: Pcwstr, component: Pcwstr, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetConfigGetAll(server.rawAddress.toString(), component.rawAddress.toString(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netConfigSet(server: Pcwstr, reserved1: Pcwstr, component: Pcwstr, level: UInt, reserved2: UInt, buf: MutPtr<UByte>, reserved3: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetConfigSet(server.rawAddress.toString(), reserved1.rawAddress.toString(), component.rawAddress.toString(), level.toInt(), reserved2.toInt(), buf.rawAddress.toString(), reserved3.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netCreateProvisioningPackage(pprovisioningparams: ConstPtr<NetsetupProvisioningParams>, pppackagebindata: MutPtr<MutPtr<UByte>>, pdwpackagebindatasize: MutPtr<UInt>, pppackagetextdata: MutPtr<Pwstr>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetCreateProvisioningPackage(pprovisioningparams.rawAddress.toString(), pppackagebindata.rawAddress.toString(), pdwpackagebindatasize.rawAddress.toString(), pppackagetextdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netEnumerateComputerNames(server: Pcwstr, nametype: NetComputerNameType, reserved: UInt, entrycount: MutPtr<UInt>, computernames: MutPtr<MutPtr<Pwstr>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetEnumerateComputerNames(server.rawAddress.toString(), nametype, reserved.toInt(), entrycount.rawAddress.toString(), computernames.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netEnumerateServiceAccounts(servername: Pcwstr, flags: UInt, accountscount: MutPtr<UInt>, accounts: MutPtr<MutPtr<MutPtr<UShort>>>): Ntstatus =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetEnumerateServiceAccounts(servername.rawAddress.toString(), flags.toInt(), accountscount.rawAddress.toString(), accounts.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netErrorLogClear(uncservername: Pcwstr, backupfile: Pcwstr, reserved: ConstPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogClear(uncservername.rawAddress.toString(), backupfile.rawAddress.toString(), reserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netErrorLogRead(uncservername: Pcwstr, reserved1: Pcwstr, errorloghandle: ConstPtr<Hlog>, offset: UInt, reserved2: ConstPtr<UInt>, reserved3: UInt, offsetflag: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxsize: UInt, bytesread: MutPtr<UInt>, totalavailable: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogRead(uncservername.rawAddress.toString(), reserved1.rawAddress.toString(), errorloghandle.rawAddress.toString(), offset.toInt(), reserved2.rawAddress.toString(), reserved3.toInt(), offsetflag.toInt(), bufptr.rawAddress.toString(), prefmaxsize.toInt(), bytesread.rawAddress.toString(), totalavailable.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netErrorLogWrite(reserved1: ConstPtr<UByte>, code: UInt, component: Pcwstr, buffer: ConstPtr<UByte>, numbytes: UInt, msgbuf: ConstPtr<UByte>, strcount: UInt, reserved2: ConstPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogWrite(reserved1.rawAddress.toString(), code.toInt(), component.rawAddress.toString(), buffer.rawAddress.toString(), numbytes.toInt(), msgbuf.rawAddress.toString(), strcount.toInt(), reserved2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netFreeAadJoinInformation(pjoininfo: ConstPtr<DsregJoinInfo>) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetFreeAadJoinInformation(pjoininfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun netGetAadJoinInformation(pcsztenantid: Pcwstr, ppjoininfo: MutPtr<MutPtr<DsregJoinInfo>>): Hresult =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetGetAadJoinInformation(pcsztenantid.rawAddress.toString(), ppjoininfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGetAnyDCName(servername: Pcwstr, domainname: Pcwstr, buffer: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetGetAnyDCName(servername.rawAddress.toString(), domainname.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGetDCName(servername: Pcwstr, domainname: Pcwstr, buffer: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetGetDCName(servername.rawAddress.toString(), domainname.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGetDisplayInformationIndex(servername: Pcwstr, level: UInt, prefix: Pcwstr, index: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetGetDisplayInformationIndex(servername.rawAddress.toString(), level.toInt(), prefix.rawAddress.toString(), index.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGetJoinInformation(lpserver: Pcwstr, lpnamebuffer: MutPtr<Pwstr>, buffertype: MutPtr<NetsetupJoinStatus>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetGetJoinInformation(lpserver.rawAddress.toString(), lpnamebuffer.rawAddress.toString(), buffertype.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGetJoinableOUs(lpserver: Pcwstr, lpdomain: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, oucount: MutPtr<UInt>, ous: MutPtr<MutPtr<Pwstr>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetGetJoinableOUs(lpserver.rawAddress.toString(), lpdomain.rawAddress.toString(), lpaccount.rawAddress.toString(), lppassword.rawAddress.toString(), oucount.rawAddress.toString(), ous.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupAdd(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupAddUser(servername: Pcwstr, groupname: Pcwstr, username: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupAddUser(servername.rawAddress.toString(), groupname.rawAddress.toString(), username.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupDel(servername: Pcwstr, groupname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupDel(servername.rawAddress.toString(), groupname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupDelUser(servername: Pcwstr, groupname: Pcwstr, username: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupDelUser(servername.rawAddress.toString(), groupname.rawAddress.toString(), username.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<ULong>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupGetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupGetInfo(servername.rawAddress.toString(), groupname.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupGetUsers(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<ULong>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupGetUsers(servername.rawAddress.toString(), groupname.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupSetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupSetInfo(servername.rawAddress.toString(), groupname.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupSetUsers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, totalentries: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupSetUsers(servername.rawAddress.toString(), groupname.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), totalentries.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netIsServiceAccount(servername: Pcwstr, accountname: Pcwstr, isservice: MutPtr<Bool>): Ntstatus =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetIsServiceAccount(servername.rawAddress.toString(), accountname.rawAddress.toString(), isservice.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netJoinDomain(lpserver: Pcwstr, lpdomain: Pcwstr, lpmachineaccountou: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, fjoinoptions: NetJoinDomainJoinOptions): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetJoinDomain(lpserver.rawAddress.toString(), lpdomain.rawAddress.toString(), lpmachineaccountou.rawAddress.toString(), lpaccount.rawAddress.toString(), lppassword.rawAddress.toString(), fjoinoptions.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAdd(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupAddMember(servername: Pcwstr, groupname: Pcwstr, membersid: Psid): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAddMember(servername.rawAddress.toString(), groupname.rawAddress.toString(), membersid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupAddMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, totalentries: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAddMembers(servername.rawAddress.toString(), groupname.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), totalentries.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupDel(servername: Pcwstr, groupname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDel(servername.rawAddress.toString(), groupname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupDelMember(servername: Pcwstr, groupname: Pcwstr, membersid: Psid): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDelMember(servername.rawAddress.toString(), groupname.rawAddress.toString(), membersid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupDelMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, totalentries: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDelMembers(servername.rawAddress.toString(), groupname.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), totalentries.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<ULong>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupGetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupGetInfo(servername.rawAddress.toString(), groupname.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupGetMembers(servername: Pcwstr, localgroupname: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<ULong>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupGetMembers(servername.rawAddress.toString(), localgroupname.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupSetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupSetInfo(servername.rawAddress.toString(), groupname.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupSetMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, totalentries: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupSetMembers(servername.rawAddress.toString(), groupname.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), totalentries.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netMessageBufferSend(servername: Pcwstr, msgname: Pcwstr, fromname: Pcwstr, buf: ConstPtr<UByte>, buflen: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageBufferSend(servername.rawAddress.toString(), msgname.rawAddress.toString(), fromname.rawAddress.toString(), buf.rawAddress.toString(), buflen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netMessageNameAdd(servername: Pcwstr, msgname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameAdd(servername.rawAddress.toString(), msgname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netMessageNameDel(servername: Pcwstr, msgname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameDel(servername.rawAddress.toString(), msgname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netMessageNameEnum(servername: Pcwstr, level: UInt, bufptr: ConstPtr<ConstPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netMessageNameGetInfo(servername: Pcwstr, msgname: Pcwstr, level: UInt, bufptr: ConstPtr<ConstPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameGetInfo(servername.rawAddress.toString(), msgname.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netProvisionComputerAccount(lpdomain: Pcwstr, lpmachinename: Pcwstr, lpmachineaccountou: Pcwstr, lpdcname: Pcwstr, dwoptions: NetsetupProvision, pprovisionbindata: MutPtr<MutPtr<UByte>>, pdwprovisionbindatasize: MutPtr<UInt>, pprovisiontextdata: MutPtr<Pwstr>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetProvisionComputerAccount(lpdomain.rawAddress.toString(), lpmachinename.rawAddress.toString(), lpmachineaccountou.rawAddress.toString(), lpdcname.rawAddress.toString(), dwoptions.toInt(), pprovisionbindata.rawAddress.toString(), pdwprovisionbindatasize.rawAddress.toString(), pprovisiontextdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netQueryDisplayInformation(servername: Pcwstr, level: UInt, index: UInt, entriesrequested: UInt, preferredmaximumlength: UInt, returnedentrycount: MutPtr<UInt>, sortedbuffer: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetQueryDisplayInformation(servername.rawAddress.toString(), level.toInt(), index.toInt(), entriesrequested.toInt(), preferredmaximumlength.toInt(), returnedentrycount.rawAddress.toString(), sortedbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netQueryServiceAccount(servername: Pcwstr, accountname: Pcwstr, infolevel: UInt, buffer: MutPtr<MutPtr<UByte>>): Ntstatus =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetQueryServiceAccount(servername.rawAddress.toString(), accountname.rawAddress.toString(), infolevel.toInt(), buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netRemoteComputerSupports(uncservername: Pcwstr, optionswanted: NetRemoteComputerSupportsOptions, optionssupported: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoteComputerSupports(uncservername.rawAddress.toString(), optionswanted.toInt(), optionssupported.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netRemoteTOD(uncservername: Pcwstr, bufferptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoteTOD(uncservername.rawAddress.toString(), bufferptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netRemoveAlternateComputerName(server: Pcwstr, alternatename: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoveAlternateComputerName(server.rawAddress.toString(), alternatename.rawAddress.toString(), domainaccount.rawAddress.toString(), domainaccountpassword.rawAddress.toString(), reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netRemoveServiceAccount(servername: Pcwstr, accountname: Pcwstr, flags: UInt): Ntstatus =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoveServiceAccount(servername.rawAddress.toString(), accountname.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netRenameMachineInDomain(lpserver: Pcwstr, lpnewmachinename: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, frenameoptions: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetRenameMachineInDomain(lpserver.rawAddress.toString(), lpnewmachinename.rawAddress.toString(), lpaccount.rawAddress.toString(), lppassword.rawAddress.toString(), frenameoptions.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplExportDirAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirAdd(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplExportDirDel(servername: Pcwstr, dirname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirDel(servername.rawAddress.toString(), dirname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplExportDirEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplExportDirGetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirGetInfo(servername.rawAddress.toString(), dirname.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplExportDirLock(servername: Pcwstr, dirname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirLock(servername.rawAddress.toString(), dirname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplExportDirSetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirSetInfo(servername.rawAddress.toString(), dirname.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplExportDirUnlock(servername: Pcwstr, dirname: Pcwstr, unlockforce: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirUnlock(servername.rawAddress.toString(), dirname.rawAddress.toString(), unlockforce.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplGetInfo(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplGetInfo(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplImportDirAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirAdd(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplImportDirDel(servername: Pcwstr, dirname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirDel(servername.rawAddress.toString(), dirname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplImportDirEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplImportDirGetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirGetInfo(servername.rawAddress.toString(), dirname.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplImportDirLock(servername: Pcwstr, dirname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirLock(servername.rawAddress.toString(), dirname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplImportDirUnlock(servername: Pcwstr, dirname: Pcwstr, unlockforce: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirUnlock(servername.rawAddress.toString(), dirname.rawAddress.toString(), unlockforce.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplSetInfo(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplSetInfo(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netRequestOfflineDomainJoin(pprovisionbindata: ConstPtr<UByte>, cbprovisionbindatasize: UInt, dwoptions: NetRequestProvisionOptions, lpwindowspath: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetRequestOfflineDomainJoin(pprovisionbindata.rawAddress.toString(), cbprovisionbindatasize.toInt(), dwoptions.toInt(), lpwindowspath.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netRequestProvisioningPackageInstall(ppackagebindata: ConstPtr<UByte>, dwpackagebindatasize: UInt, dwprovisionoptions: NetRequestProvisionOptions, lpwindowspath: Pcwstr, pvreserved: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetRequestProvisioningPackageInstall(ppackagebindata.rawAddress.toString(), dwpackagebindatasize.toInt(), dwprovisionoptions.toInt(), lpwindowspath.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netScheduleJobAdd(servername: Pcwstr, buffer: MutPtr<UByte>, jobid: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobAdd(servername.rawAddress.toString(), buffer.rawAddress.toString(), jobid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netScheduleJobDel(servername: Pcwstr, minjobid: UInt, maxjobid: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobDel(servername.rawAddress.toString(), minjobid.toInt(), maxjobid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netScheduleJobEnum(servername: Pcwstr, pointertobuffer: MutPtr<MutPtr<UByte>>, prefferedmaximumlength: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobEnum(servername.rawAddress.toString(), pointertobuffer.rawAddress.toString(), prefferedmaximumlength.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netScheduleJobGetInfo(servername: Pcwstr, jobid: UInt, pointertobuffer: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobGetInfo(servername.rawAddress.toString(), jobid.toInt(), pointertobuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerComputerNameAdd(servername: Pcwstr, emulateddomainname: Pcwstr, emulatedservername: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerComputerNameAdd(servername.rawAddress.toString(), emulateddomainname.rawAddress.toString(), emulatedservername.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerComputerNameDel(servername: Pcwstr, emulatedservername: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerComputerNameDel(servername.rawAddress.toString(), emulatedservername.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerDiskEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerDiskEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, servertype: NetServerType, domain: Pcwstr, resumeHandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), servertype.toInt(), domain.rawAddress.toString(), resumeHandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerGetInfo(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerGetInfo(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerSetInfo(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmerror: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerSetInfo(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmerror.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerTransportAdd(servername: Pcwstr, level: UInt, bufptr: ConstPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportAdd(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerTransportAddEx(servername: Pcwstr, level: UInt, bufptr: ConstPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportAddEx(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerTransportDel(servername: Pcwstr, level: UInt, bufptr: ConstPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportDel(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerTransportEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServiceControl(servername: Pcwstr, service: Pcwstr, opcode: UInt, arg: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceControl(servername.rawAddress.toString(), service.rawAddress.toString(), opcode.toInt(), arg.toInt(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServiceEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServiceGetInfo(servername: Pcwstr, service: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceGetInfo(servername.rawAddress.toString(), service.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServiceInstall(servername: Pcwstr, service: Pcwstr, argc: UInt, argv: ConstPtr<Pcwstr>, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceInstall(servername.rawAddress.toString(), service.rawAddress.toString(), argc.toInt(), argv.rawAddress.toString(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netSetPrimaryComputerName(server: Pcwstr, primaryname: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetSetPrimaryComputerName(server.rawAddress.toString(), primaryname.rawAddress.toString(), domainaccount.rawAddress.toString(), domainaccountpassword.rawAddress.toString(), reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUnjoinDomain(lpserver: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, funjoinoptions: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetUnjoinDomain(lpserver.rawAddress.toString(), lpaccount.rawAddress.toString(), lppassword.rawAddress.toString(), funjoinoptions.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUseAdd(servername: ConstPtr<Byte>, levelflags: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetUseAdd(servername.rawAddress.toString(), levelflags.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUseDel(uncservername: Pcwstr, usename: Pcwstr, forcelevelflags: ForceLevelFlags): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetUseDel(uncservername.rawAddress.toString(), usename.rawAddress.toString(), forcelevelflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUseEnum(uncservername: Pcwstr, levelflags: UInt, bufptr: MutPtr<MutPtr<UByte>>, preferedmaximumsize: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetUseEnum(uncservername.rawAddress.toString(), levelflags.toInt(), bufptr.rawAddress.toString(), preferedmaximumsize.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUseGetInfo(uncservername: Pcwstr, usename: Pcwstr, levelflags: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetUseGetInfo(uncservername.rawAddress.toString(), usename.rawAddress.toString(), levelflags.toInt(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserAdd(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserChangePassword(domainname: Pcwstr, username: Pcwstr, oldpassword: Pcwstr, newpassword: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserChangePassword(domainname.rawAddress.toString(), username.rawAddress.toString(), oldpassword.rawAddress.toString(), newpassword.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserDel(servername: Pcwstr, username: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserDel(servername.rawAddress.toString(), username.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserEnum(servername: Pcwstr, level: UInt, filter: NetUserEnumFilterFlags, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserEnum(servername.rawAddress.toString(), level.toInt(), filter.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserGetGroups(servername: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetGroups(servername.rawAddress.toString(), username.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserGetInfo(servername: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetInfo(servername.rawAddress.toString(), username.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserGetLocalGroups(servername: Pcwstr, username: Pcwstr, level: UInt, flags: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetLocalGroups(servername.rawAddress.toString(), username.rawAddress.toString(), level.toInt(), flags.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserModalsGet(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserModalsGet(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserModalsSet(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserModalsSet(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserSetGroups(servername: Pcwstr, username: Pcwstr, level: UInt, buf: ConstPtr<UByte>, numEntries: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserSetGroups(servername.rawAddress.toString(), username.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), numEntries.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserSetInfo(servername: Pcwstr, username: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserSetInfo(servername.rawAddress.toString(), username.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netValidateName(lpserver: Pcwstr, lpname: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, nametype: NetsetupNameType): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetValidateName(lpserver.rawAddress.toString(), lpname.rawAddress.toString(), lpaccount.rawAddress.toString(), lppassword.rawAddress.toString(), nametype) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netValidatePasswordPolicy(servername: Pcwstr, qualifier: MutPtr<CVoid>, validationtype: NetValidatePasswordType, inputarg: MutPtr<CVoid>, outputarg: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetValidatePasswordPolicy(servername.rawAddress.toString(), qualifier.rawAddress.toString(), validationtype, inputarg.rawAddress.toString(), outputarg.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netValidatePasswordPolicyFree(outputarg: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetValidatePasswordPolicyFree(outputarg.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaGetInfo(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaGetInfo(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaSetInfo(servername: Pcwstr, level: UInt, buffer: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaSetInfo(servername.rawAddress.toString(), level.toInt(), buffer.rawAddress.toString(), parmErr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaTransportAdd(servername: ConstPtr<Byte>, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportAdd(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaTransportDel(servername: Pcwstr, transportname: Pcwstr, ucond: ForceLevelFlags): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportDel(servername.rawAddress.toString(), transportname.rawAddress.toString(), ucond.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaTransportEnum(servername: ConstPtr<Byte>, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaUserEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaUserGetInfo(reserved: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserGetInfo(reserved.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaUserSetInfo(reserved: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserSetInfo(reserved.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerAssert(pszfailedassertion: Pcstr, pszfilename: Pcstr, dwlinenumber: UInt, pszmessage: Pcstr) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementRouterAssert(pszfailedassertion.rawAddress.toString(), pszfilename.rawAddress.toString(), dwlinenumber.toInt(), pszmessage.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerGetErrorStringA(dwerrorcode: UInt, lplpszerrorstring: MutPtr<Pstr>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementRouterGetErrorStringA(dwerrorcode.toInt(), lplpszerrorstring.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerGetErrorStringW(dwerrorcode: UInt, lplpwszerrorstring: MutPtr<Pwstr>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementRouterGetErrorStringW(dwerrorcode.toInt(), lplpwszerrorstring.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerLogDeregisterA(hloghandle: Handle) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogDeregisterA(hloghandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogDeregisterW(hloghandle: Handle) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogDeregisterW(hloghandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr<Pcstr>, dwerrorcode: UInt) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventA(hloghandle.rawAddress.toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.rawAddress.toString(), dwerrorcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventDataA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr<Pcstr>, dwdatabytes: UInt, lpdatabytes: MutPtr<UByte>) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventDataA(hloghandle.rawAddress.toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.rawAddress.toString(), dwdatabytes.toInt(), lpdatabytes.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventDataW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr<Pcwstr>, dwdatabytes: UInt, lpdatabytes: MutPtr<UByte>) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventDataW(hloghandle.rawAddress.toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.rawAddress.toString(), dwdatabytes.toInt(), lpdatabytes.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventExA(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcstr, vararg variadicArgs: Long) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventExA(hloghandle.rawAddress.toString(), dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), ptszformat.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventExW(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcwstr, vararg variadicArgs: Long) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventExW(hloghandle.rawAddress.toString(), dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), ptszformat.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventStringA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr<Pcstr>, dwerrorcode: UInt, dwerrorindex: UInt) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventStringA(hloghandle.rawAddress.toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.rawAddress.toString(), dwerrorcode.toInt(), dwerrorindex.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventStringW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr<Pcwstr>, dwerrorcode: UInt, dwerrorindex: UInt) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventStringW(hloghandle.rawAddress.toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.rawAddress.toString(), dwerrorcode.toInt(), dwerrorindex.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventValistExA(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcstr, arglist: MutPtr<Byte>) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventValistExA(hloghandle.rawAddress.toString(), dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), ptszformat.rawAddress.toString(), arglist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventValistExW(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcwstr, arglist: MutPtr<Byte>) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventValistExW(hloghandle.rawAddress.toString(), dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), ptszformat.rawAddress.toString(), arglist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr<Pcwstr>, dwerrorcode: UInt) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventW(hloghandle.rawAddress.toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.rawAddress.toString(), dwerrorcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogRegisterA(lpszsource: Pcstr): Handle =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) MutPtr((windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogRegisterA(lpszsource.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerLogRegisterW(lpszsource: Pcwstr): Handle =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) MutPtr((windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogRegisterW(lpszsource.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setNetScheduleAccountInformation(pwszservername: Pcwstr, pwszaccount: Pcwstr, pwszpassword: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementSetNetScheduleAccountInformation(pwszservername.rawAddress.toString(), pwszaccount.rawAddress.toString(), pwszpassword.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceDeregisterA(dwtraceid: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterA(dwtraceid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceDeregisterExA(dwtraceid: UInt, dwflags: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterExA(dwtraceid.toInt(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceDeregisterExW(dwtraceid: UInt, dwflags: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterExW(dwtraceid.toInt(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceDeregisterW(dwtraceid: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterW(dwtraceid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceDumpExA(dwtraceid: UInt, dwflags: UInt, lpbbytes: MutPtr<UByte>, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: Bool, lpszprefix: Pcstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementTraceDumpExA(dwtraceid.toInt(), dwflags.toInt(), lpbbytes.rawAddress.toString(), dwbytecount.toInt(), dwgroupsize.toInt(), baddressprefix, lpszprefix.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceDumpExW(dwtraceid: UInt, dwflags: UInt, lpbbytes: MutPtr<UByte>, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: Bool, lpszprefix: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementTraceDumpExW(dwtraceid.toInt(), dwflags.toInt(), lpbbytes.rawAddress.toString(), dwbytecount.toInt(), dwgroupsize.toInt(), baddressprefix, lpszprefix.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceGetConsoleA(dwtraceid: UInt, lphconsole: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementTraceGetConsoleA(dwtraceid.toInt(), lphconsole.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceGetConsoleW(dwtraceid: UInt, lphconsole: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementTraceGetConsoleW(dwtraceid.toInt(), lphconsole.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tracePrintfA(dwtraceid: UInt, lpszformat: Pcstr, vararg variadicArgs: Long): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfA(dwtraceid.toInt(), lpszformat.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tracePrintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcstr, vararg variadicArgs: Long): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfExA(dwtraceid.toInt(), dwflags.toInt(), lpszformat.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tracePrintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfExW(dwtraceid.toInt(), dwflags.toInt(), lpszformat.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tracePrintfW(dwtraceid: UInt, lpszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfW(dwtraceid.toInt(), lpszformat.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tracePutsExA(dwtraceid: UInt, dwflags: UInt, lpszstring: Pcstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementTracePutsExA(dwtraceid.toInt(), dwflags.toInt(), lpszstring.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tracePutsExW(dwtraceid: UInt, dwflags: UInt, lpszstring: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementTracePutsExW(dwtraceid.toInt(), dwflags.toInt(), lpszstring.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceRegisterExA(lpszcallername: Pcstr, dwflags: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementTraceRegisterExA(lpszcallername.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceRegisterExW(lpszcallername: Pcwstr, dwflags: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementTraceRegisterExW(lpszcallername.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceVprintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcstr, arglist: MutPtr<Byte>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementTraceVprintfExA(dwtraceid.toInt(), dwflags.toInt(), lpszformat.rawAddress.toString(), arglist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceVprintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcwstr, arglist: MutPtr<Byte>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssysWindowsWin32NetworkmanagementNetmanagementTraceVprintfExW(dwtraceid.toInt(), dwflags.toInt(), lpszformat.rawAddress.toString(), arglist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
