@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

private val _windowsWin32NetworkmanagementNetmanagementNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun GetNetScheduleAccountInformation(pwszservername: PCWSTR, ccaccount: UInt, wszaccount: PWSTR): HRESULT =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_GetNetScheduleAccountInformation(pwszservername.toString(), ccaccount.toInt(), wszaccount.toString()) as Int) else 0

public actual fun I_NetLogonControl2(servername: PCWSTR, functioncode: UInt, querylevel: UInt, data: Long, buffer: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_I_NetLogonControl2(servername.toString(), functioncode.toInt(), querylevel.toInt(), data.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun LogErrorA(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long, dwerrorcode: UInt) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        _windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_LogErrorA(dwmessageid.toInt(), cnumberofsubstrings.toInt(), plpwssubstrings.toString(), dwerrorcode.toInt())
    }
}

public actual fun LogErrorW(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long, dwerrorcode: UInt) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        _windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_LogErrorW(dwmessageid.toInt(), cnumberofsubstrings.toInt(), plpwssubstrings.toString(), dwerrorcode.toInt())
    }
}

public actual fun LogEventA(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        _windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_LogEventA(weventtype.toInt(), dwmessageid.toInt(), cnumberofsubstrings.toInt(), plpwssubstrings.toString())
    }
}

public actual fun LogEventW(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        _windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_LogEventW(weventtype.toInt(), dwmessageid.toInt(), cnumberofsubstrings.toInt(), plpwssubstrings.toString())
    }
}

public actual fun MprSetupProtocolEnum(dwtransportid: UInt, lplpbuffer: Long, lpdwentriesread: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_MprSetupProtocolEnum(dwtransportid.toInt(), lplpbuffer.toString(), lpdwentriesread.toString()) as Int).toUInt() else 0u

public actual fun MprSetupProtocolFree(lpbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_MprSetupProtocolFree(lpbuffer.toString()) as Int).toUInt() else 0u

public actual fun NetAccessAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetAccessAdd(servername.toString(), level.toInt(), buf.toString(), parm_err.toString()) as Int).toUInt() else 0u

public actual fun NetAccessDel(servername: PCWSTR, resource: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetAccessDel(servername.toString(), resource.toString()) as Int).toUInt() else 0u

public actual fun NetAccessEnum(servername: PCWSTR, basepath: PCWSTR, recursive: UInt, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetAccessEnum(servername.toString(), basepath.toString(), recursive.toInt(), level.toInt(), bufptr.toString(), prefmaxlen.toInt(), entriesread.toString(), totalentries.toString(), resume_handle.toString()) as Int).toUInt() else 0u

public actual fun NetAccessGetInfo(servername: PCWSTR, resource: PCWSTR, level: UInt, bufptr: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetAccessGetInfo(servername.toString(), resource.toString(), level.toInt(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetAccessGetUserPerms(servername: PCWSTR, ugname: PCWSTR, resource: PCWSTR, perms: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetAccessGetUserPerms(servername.toString(), ugname.toString(), resource.toString(), perms.toString()) as Int).toUInt() else 0u

public actual fun NetAccessSetInfo(servername: PCWSTR, resource: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetAccessSetInfo(servername.toString(), resource.toString(), level.toInt(), buf.toString(), parm_err.toString()) as Int).toUInt() else 0u

public actual fun NetAddAlternateComputerName(server: PCWSTR, alternatename: PCWSTR, domainaccount: PCWSTR, domainaccountpassword: PCWSTR, reserved: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetAddAlternateComputerName(server.toString(), alternatename.toString(), domainaccount.toString(), domainaccountpassword.toString(), reserved.toInt()) as Int).toUInt() else 0u

public actual fun NetAddServiceAccount(servername: PCWSTR, accountname: PCWSTR, password: PCWSTR, flags: UInt): NTSTATUS =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetAddServiceAccount(servername.toString(), accountname.toString(), password.toString(), flags.toInt()) as Int) else 0

public actual fun NetAlertRaise(alerttype: PCWSTR, buffer: Long, buffersize: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetAlertRaise(alerttype.toString(), buffer.toString(), buffersize.toInt()) as Int).toUInt() else 0u

public actual fun NetAlertRaiseEx(alerttype: PCWSTR, variableinfo: Long, variableinfosize: UInt, servicename: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetAlertRaiseEx(alerttype.toString(), variableinfo.toString(), variableinfosize.toInt(), servicename.toString()) as Int).toUInt() else 0u

public actual fun NetApiBufferAllocate(bytecount: UInt, buffer: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetApiBufferAllocate(bytecount.toInt(), buffer.toString()) as Int).toUInt() else 0u

public actual fun NetApiBufferFree(buffer: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetApiBufferFree(buffer.toString()) as Int).toUInt() else 0u

public actual fun NetApiBufferReallocate(oldbuffer: Long, newbytecount: UInt, newbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetApiBufferReallocate(oldbuffer.toString(), newbytecount.toInt(), newbuffer.toString()) as Int).toUInt() else 0u

public actual fun NetApiBufferSize(buffer: Long, bytecount: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetApiBufferSize(buffer.toString(), bytecount.toString()) as Int).toUInt() else 0u

public actual fun NetAuditClear(server: PCWSTR, backupfile: PCWSTR, service: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetAuditClear(server.toString(), backupfile.toString(), service.toString()) as Int).toUInt() else 0u

public actual fun NetAuditRead(server: PCWSTR, service: PCWSTR, auditloghandle: Long, offset: UInt, reserved1: Long, reserved2: UInt, offsetflag: UInt, bufptr: Long, prefmaxlen: UInt, bytesread: Long, totalavailable: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetAuditRead(server.toString(), service.toString(), auditloghandle.toString(), offset.toInt(), reserved1.toString(), reserved2.toInt(), offsetflag.toInt(), bufptr.toString(), prefmaxlen.toInt(), bytesread.toString(), totalavailable.toString()) as Int).toUInt() else 0u

public actual fun NetAuditWrite(type: UInt, buf: Long, numbytes: UInt, service: PCWSTR, reserved: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetAuditWrite(type.toInt(), buf.toString(), numbytes.toInt(), service.toString(), reserved.toString()) as Int).toUInt() else 0u

public actual fun NetConfigGet(server: PCWSTR, component: PCWSTR, parameter: PCWSTR, bufptr: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetConfigGet(server.toString(), component.toString(), parameter.toString(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetConfigGetAll(server: PCWSTR, component: PCWSTR, bufptr: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetConfigGetAll(server.toString(), component.toString(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetConfigSet(server: PCWSTR, reserved1: PCWSTR, component: PCWSTR, level: UInt, reserved2: UInt, buf: Long, reserved3: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetConfigSet(server.toString(), reserved1.toString(), component.toString(), level.toInt(), reserved2.toInt(), buf.toString(), reserved3.toInt()) as Int).toUInt() else 0u

public actual fun NetCreateProvisioningPackage(pprovisioningparams: Long, pppackagebindata: Long, pdwpackagebindatasize: Long, pppackagetextdata: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetCreateProvisioningPackage(pprovisioningparams.toString(), pppackagebindata.toString(), pdwpackagebindatasize.toString(), pppackagetextdata.toString()) as Int).toUInt() else 0u

public actual fun NetEnumerateComputerNames(server: PCWSTR, nametype: NET_COMPUTER_NAME_TYPE, reserved: UInt, entrycount: Long, computernames: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetEnumerateComputerNames(server.toString(), nametype, reserved.toInt(), entrycount.toString(), computernames.toString()) as Int).toUInt() else 0u

public actual fun NetEnumerateServiceAccounts(servername: PCWSTR, flags: UInt, accountscount: Long, accounts: Long): NTSTATUS =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetEnumerateServiceAccounts(servername.toString(), flags.toInt(), accountscount.toString(), accounts.toString()) as Int) else 0

public actual fun NetErrorLogClear(uncservername: PCWSTR, backupfile: PCWSTR, reserved: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetErrorLogClear(uncservername.toString(), backupfile.toString(), reserved.toString()) as Int).toUInt() else 0u

public actual fun NetErrorLogRead(uncservername: PCWSTR, reserved1: PCWSTR, errorloghandle: Long, offset: UInt, reserved2: Long, reserved3: UInt, offsetflag: UInt, bufptr: Long, prefmaxsize: UInt, bytesread: Long, totalavailable: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetErrorLogRead(uncservername.toString(), reserved1.toString(), errorloghandle.toString(), offset.toInt(), reserved2.toString(), reserved3.toInt(), offsetflag.toInt(), bufptr.toString(), prefmaxsize.toInt(), bytesread.toString(), totalavailable.toString()) as Int).toUInt() else 0u

public actual fun NetErrorLogWrite(reserved1: Long, code: UInt, component: PCWSTR, buffer: Long, numbytes: UInt, msgbuf: Long, strcount: UInt, reserved2: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetErrorLogWrite(reserved1.toString(), code.toInt(), component.toString(), buffer.toString(), numbytes.toInt(), msgbuf.toString(), strcount.toInt(), reserved2.toString()) as Int).toUInt() else 0u

public actual fun NetFreeAadJoinInformation(pjoininfo: Long) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        _windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetFreeAadJoinInformation(pjoininfo.toString())
    }
}

public actual fun NetGetAadJoinInformation(pcsztenantid: PCWSTR, ppjoininfo: Long): HRESULT =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetGetAadJoinInformation(pcsztenantid.toString(), ppjoininfo.toString()) as Int) else 0

public actual fun NetGetAnyDCName(servername: PCWSTR, domainname: PCWSTR, buffer: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetGetAnyDCName(servername.toString(), domainname.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun NetGetDCName(servername: PCWSTR, domainname: PCWSTR, buffer: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetGetDCName(servername.toString(), domainname.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun NetGetDisplayInformationIndex(servername: PCWSTR, level: UInt, prefix: PCWSTR, index: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetGetDisplayInformationIndex(servername.toString(), level.toInt(), prefix.toString(), index.toString()) as Int).toUInt() else 0u

public actual fun NetGetJoinInformation(lpserver: PCWSTR, lpnamebuffer: Long, buffertype: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetGetJoinInformation(lpserver.toString(), lpnamebuffer.toString(), buffertype.toString()) as Int).toUInt() else 0u

public actual fun NetGetJoinableOUs(lpserver: PCWSTR, lpdomain: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, oucount: Long, ous: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetGetJoinableOUs(lpserver.toString(), lpdomain.toString(), lpaccount.toString(), lppassword.toString(), oucount.toString(), ous.toString()) as Int).toUInt() else 0u

public actual fun NetGroupAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupAdd(servername.toString(), level.toInt(), buf.toString(), parm_err.toString()) as Int).toUInt() else 0u

public actual fun NetGroupAddUser(servername: PCWSTR, groupname: PCWSTR, username: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupAddUser(servername.toString(), groupname.toString(), username.toString()) as Int).toUInt() else 0u

public actual fun NetGroupDel(servername: PCWSTR, groupname: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupDel(servername.toString(), groupname.toString()) as Int).toUInt() else 0u

public actual fun NetGroupDelUser(servername: PCWSTR, groupname: PCWSTR, username: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupDelUser(servername.toString(), groupname.toString(), username.toString()) as Int).toUInt() else 0u

public actual fun NetGroupEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupEnum(servername.toString(), level.toInt(), bufptr.toString(), prefmaxlen.toInt(), entriesread.toString(), totalentries.toString(), resume_handle.toString()) as Int).toUInt() else 0u

public actual fun NetGroupGetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, bufptr: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupGetInfo(servername.toString(), groupname.toString(), level.toInt(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetGroupGetUsers(servername: PCWSTR, groupname: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupGetUsers(servername.toString(), groupname.toString(), level.toInt(), bufptr.toString(), prefmaxlen.toInt(), entriesread.toString(), totalentries.toString(), resumehandle.toString()) as Int).toUInt() else 0u

public actual fun NetGroupSetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupSetInfo(servername.toString(), groupname.toString(), level.toInt(), buf.toString(), parm_err.toString()) as Int).toUInt() else 0u

public actual fun NetGroupSetUsers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupSetUsers(servername.toString(), groupname.toString(), level.toInt(), buf.toString(), totalentries.toInt()) as Int).toUInt() else 0u

public actual fun NetIsServiceAccount(servername: PCWSTR, accountname: PCWSTR, isservice: Long): NTSTATUS =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetIsServiceAccount(servername.toString(), accountname.toString(), isservice.toString()) as Int) else 0

public actual fun NetJoinDomain(lpserver: PCWSTR, lpdomain: PCWSTR, lpmachineaccountou: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, fjoinoptions: NET_JOIN_DOMAIN_JOIN_OPTIONS): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetJoinDomain(lpserver.toString(), lpdomain.toString(), lpmachineaccountou.toString(), lpaccount.toString(), lppassword.toString(), fjoinoptions.toInt()) as Int).toUInt() else 0u

public actual fun NetLocalGroupAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupAdd(servername.toString(), level.toInt(), buf.toString(), parm_err.toString()) as Int).toUInt() else 0u

public actual fun NetLocalGroupAddMember(servername: PCWSTR, groupname: PCWSTR, membersid: PSID): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupAddMember(servername.toString(), groupname.toString(), membersid.toString()) as Int).toUInt() else 0u

public actual fun NetLocalGroupAddMembers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupAddMembers(servername.toString(), groupname.toString(), level.toInt(), buf.toString(), totalentries.toInt()) as Int).toUInt() else 0u

public actual fun NetLocalGroupDel(servername: PCWSTR, groupname: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupDel(servername.toString(), groupname.toString()) as Int).toUInt() else 0u

public actual fun NetLocalGroupDelMember(servername: PCWSTR, groupname: PCWSTR, membersid: PSID): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupDelMember(servername.toString(), groupname.toString(), membersid.toString()) as Int).toUInt() else 0u

public actual fun NetLocalGroupDelMembers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupDelMembers(servername.toString(), groupname.toString(), level.toInt(), buf.toString(), totalentries.toInt()) as Int).toUInt() else 0u

public actual fun NetLocalGroupEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupEnum(servername.toString(), level.toInt(), bufptr.toString(), prefmaxlen.toInt(), entriesread.toString(), totalentries.toString(), resumehandle.toString()) as Int).toUInt() else 0u

public actual fun NetLocalGroupGetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, bufptr: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupGetInfo(servername.toString(), groupname.toString(), level.toInt(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetLocalGroupGetMembers(servername: PCWSTR, localgroupname: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupGetMembers(servername.toString(), localgroupname.toString(), level.toInt(), bufptr.toString(), prefmaxlen.toInt(), entriesread.toString(), totalentries.toString(), resumehandle.toString()) as Int).toUInt() else 0u

public actual fun NetLocalGroupSetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupSetInfo(servername.toString(), groupname.toString(), level.toInt(), buf.toString(), parm_err.toString()) as Int).toUInt() else 0u

public actual fun NetLocalGroupSetMembers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupSetMembers(servername.toString(), groupname.toString(), level.toInt(), buf.toString(), totalentries.toInt()) as Int).toUInt() else 0u

public actual fun NetMessageBufferSend(servername: PCWSTR, msgname: PCWSTR, fromname: PCWSTR, buf: Long, buflen: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetMessageBufferSend(servername.toString(), msgname.toString(), fromname.toString(), buf.toString(), buflen.toInt()) as Int).toUInt() else 0u

public actual fun NetMessageNameAdd(servername: PCWSTR, msgname: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetMessageNameAdd(servername.toString(), msgname.toString()) as Int).toUInt() else 0u

public actual fun NetMessageNameDel(servername: PCWSTR, msgname: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetMessageNameDel(servername.toString(), msgname.toString()) as Int).toUInt() else 0u

public actual fun NetMessageNameEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetMessageNameEnum(servername.toString(), level.toInt(), bufptr.toString(), prefmaxlen.toInt(), entriesread.toString(), totalentries.toString(), resume_handle.toString()) as Int).toUInt() else 0u

public actual fun NetMessageNameGetInfo(servername: PCWSTR, msgname: PCWSTR, level: UInt, bufptr: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetMessageNameGetInfo(servername.toString(), msgname.toString(), level.toInt(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetProvisionComputerAccount(lpdomain: PCWSTR, lpmachinename: PCWSTR, lpmachineaccountou: PCWSTR, lpdcname: PCWSTR, dwoptions: NETSETUP_PROVISION, pprovisionbindata: Long, pdwprovisionbindatasize: Long, pprovisiontextdata: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetProvisionComputerAccount(lpdomain.toString(), lpmachinename.toString(), lpmachineaccountou.toString(), lpdcname.toString(), dwoptions.toInt(), pprovisionbindata.toString(), pdwprovisionbindatasize.toString(), pprovisiontextdata.toString()) as Int).toUInt() else 0u

public actual fun NetQueryDisplayInformation(servername: PCWSTR, level: UInt, index: UInt, entriesrequested: UInt, preferredmaximumlength: UInt, returnedentrycount: Long, sortedbuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetQueryDisplayInformation(servername.toString(), level.toInt(), index.toInt(), entriesrequested.toInt(), preferredmaximumlength.toInt(), returnedentrycount.toString(), sortedbuffer.toString()) as Int).toUInt() else 0u

public actual fun NetQueryServiceAccount(servername: PCWSTR, accountname: PCWSTR, infolevel: UInt, buffer: Long): NTSTATUS =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetQueryServiceAccount(servername.toString(), accountname.toString(), infolevel.toInt(), buffer.toString()) as Int) else 0

public actual fun NetRemoteComputerSupports(uncservername: PCWSTR, optionswanted: NET_REMOTE_COMPUTER_SUPPORTS_OPTIONS, optionssupported: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetRemoteComputerSupports(uncservername.toString(), optionswanted.toInt(), optionssupported.toString()) as Int).toUInt() else 0u

public actual fun NetRemoteTOD(uncservername: PCWSTR, bufferptr: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetRemoteTOD(uncservername.toString(), bufferptr.toString()) as Int).toUInt() else 0u

public actual fun NetRemoveAlternateComputerName(server: PCWSTR, alternatename: PCWSTR, domainaccount: PCWSTR, domainaccountpassword: PCWSTR, reserved: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetRemoveAlternateComputerName(server.toString(), alternatename.toString(), domainaccount.toString(), domainaccountpassword.toString(), reserved.toInt()) as Int).toUInt() else 0u

public actual fun NetRemoveServiceAccount(servername: PCWSTR, accountname: PCWSTR, flags: UInt): NTSTATUS =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetRemoveServiceAccount(servername.toString(), accountname.toString(), flags.toInt()) as Int) else 0

public actual fun NetRenameMachineInDomain(lpserver: PCWSTR, lpnewmachinename: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, frenameoptions: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetRenameMachineInDomain(lpserver.toString(), lpnewmachinename.toString(), lpaccount.toString(), lppassword.toString(), frenameoptions.toInt()) as Int).toUInt() else 0u

public actual fun NetReplExportDirAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirAdd(servername.toString(), level.toInt(), buf.toString(), parm_err.toString()) as Int).toUInt() else 0u

public actual fun NetReplExportDirDel(servername: PCWSTR, dirname: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirDel(servername.toString(), dirname.toString()) as Int).toUInt() else 0u

public actual fun NetReplExportDirEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirEnum(servername.toString(), level.toInt(), bufptr.toString(), prefmaxlen.toInt(), entriesread.toString(), totalentries.toString(), resumehandle.toString()) as Int).toUInt() else 0u

public actual fun NetReplExportDirGetInfo(servername: PCWSTR, dirname: PCWSTR, level: UInt, bufptr: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirGetInfo(servername.toString(), dirname.toString(), level.toInt(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetReplExportDirLock(servername: PCWSTR, dirname: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirLock(servername.toString(), dirname.toString()) as Int).toUInt() else 0u

public actual fun NetReplExportDirSetInfo(servername: PCWSTR, dirname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirSetInfo(servername.toString(), dirname.toString(), level.toInt(), buf.toString(), parm_err.toString()) as Int).toUInt() else 0u

public actual fun NetReplExportDirUnlock(servername: PCWSTR, dirname: PCWSTR, unlockforce: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirUnlock(servername.toString(), dirname.toString(), unlockforce.toInt()) as Int).toUInt() else 0u

public actual fun NetReplGetInfo(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetReplGetInfo(servername.toString(), level.toInt(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetReplImportDirAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirAdd(servername.toString(), level.toInt(), buf.toString(), parm_err.toString()) as Int).toUInt() else 0u

public actual fun NetReplImportDirDel(servername: PCWSTR, dirname: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirDel(servername.toString(), dirname.toString()) as Int).toUInt() else 0u

public actual fun NetReplImportDirEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirEnum(servername.toString(), level.toInt(), bufptr.toString(), prefmaxlen.toInt(), entriesread.toString(), totalentries.toString(), resumehandle.toString()) as Int).toUInt() else 0u

public actual fun NetReplImportDirGetInfo(servername: PCWSTR, dirname: PCWSTR, level: UInt, bufptr: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirGetInfo(servername.toString(), dirname.toString(), level.toInt(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetReplImportDirLock(servername: PCWSTR, dirname: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirLock(servername.toString(), dirname.toString()) as Int).toUInt() else 0u

public actual fun NetReplImportDirUnlock(servername: PCWSTR, dirname: PCWSTR, unlockforce: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirUnlock(servername.toString(), dirname.toString(), unlockforce.toInt()) as Int).toUInt() else 0u

public actual fun NetReplSetInfo(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetReplSetInfo(servername.toString(), level.toInt(), buf.toString(), parm_err.toString()) as Int).toUInt() else 0u

public actual fun NetRequestOfflineDomainJoin(pprovisionbindata: Long, cbprovisionbindatasize: UInt, dwoptions: NET_REQUEST_PROVISION_OPTIONS, lpwindowspath: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetRequestOfflineDomainJoin(pprovisionbindata.toString(), cbprovisionbindatasize.toInt(), dwoptions.toInt(), lpwindowspath.toString()) as Int).toUInt() else 0u

public actual fun NetRequestProvisioningPackageInstall(ppackagebindata: Long, dwpackagebindatasize: UInt, dwprovisionoptions: NET_REQUEST_PROVISION_OPTIONS, lpwindowspath: PCWSTR, pvreserved: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetRequestProvisioningPackageInstall(ppackagebindata.toString(), dwpackagebindatasize.toInt(), dwprovisionoptions.toInt(), lpwindowspath.toString(), pvreserved.toString()) as Int).toUInt() else 0u

public actual fun NetScheduleJobAdd(servername: PCWSTR, buffer: Long, jobid: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetScheduleJobAdd(servername.toString(), buffer.toString(), jobid.toString()) as Int).toUInt() else 0u

public actual fun NetScheduleJobDel(servername: PCWSTR, minjobid: UInt, maxjobid: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetScheduleJobDel(servername.toString(), minjobid.toInt(), maxjobid.toInt()) as Int).toUInt() else 0u

public actual fun NetScheduleJobEnum(servername: PCWSTR, pointertobuffer: Long, prefferedmaximumlength: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetScheduleJobEnum(servername.toString(), pointertobuffer.toString(), prefferedmaximumlength.toInt(), entriesread.toString(), totalentries.toString(), resumehandle.toString()) as Int).toUInt() else 0u

public actual fun NetScheduleJobGetInfo(servername: PCWSTR, jobid: UInt, pointertobuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetScheduleJobGetInfo(servername.toString(), jobid.toInt(), pointertobuffer.toString()) as Int).toUInt() else 0u

public actual fun NetServerComputerNameAdd(servername: PCWSTR, emulateddomainname: PCWSTR, emulatedservername: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetServerComputerNameAdd(servername.toString(), emulateddomainname.toString(), emulatedservername.toString()) as Int).toUInt() else 0u

public actual fun NetServerComputerNameDel(servername: PCWSTR, emulatedservername: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetServerComputerNameDel(servername.toString(), emulatedservername.toString()) as Int).toUInt() else 0u

public actual fun NetServerDiskEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetServerDiskEnum(servername.toString(), level.toInt(), bufptr.toString(), prefmaxlen.toInt(), entriesread.toString(), totalentries.toString(), resume_handle.toString()) as Int).toUInt() else 0u

public actual fun NetServerEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, servertype: NET_SERVER_TYPE, domain: PCWSTR, resume_handle: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetServerEnum(servername.toString(), level.toInt(), bufptr.toString(), prefmaxlen.toInt(), entriesread.toString(), totalentries.toString(), servertype.toInt(), domain.toString(), resume_handle.toString()) as Int).toUInt() else 0u

public actual fun NetServerGetInfo(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetServerGetInfo(servername.toString(), level.toInt(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetServerSetInfo(servername: PCWSTR, level: UInt, buf: Long, parmerror: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetServerSetInfo(servername.toString(), level.toInt(), buf.toString(), parmerror.toString()) as Int).toUInt() else 0u

public actual fun NetServerTransportAdd(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetServerTransportAdd(servername.toString(), level.toInt(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetServerTransportAddEx(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetServerTransportAddEx(servername.toString(), level.toInt(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetServerTransportDel(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetServerTransportDel(servername.toString(), level.toInt(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetServerTransportEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetServerTransportEnum(servername.toString(), level.toInt(), bufptr.toString(), prefmaxlen.toInt(), entriesread.toString(), totalentries.toString(), resume_handle.toString()) as Int).toUInt() else 0u

public actual fun NetServiceControl(servername: PCWSTR, service: PCWSTR, opcode: UInt, arg: UInt, bufptr: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetServiceControl(servername.toString(), service.toString(), opcode.toInt(), arg.toInt(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetServiceEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetServiceEnum(servername.toString(), level.toInt(), bufptr.toString(), prefmaxlen.toInt(), entriesread.toString(), totalentries.toString(), resume_handle.toString()) as Int).toUInt() else 0u

public actual fun NetServiceGetInfo(servername: PCWSTR, service: PCWSTR, level: UInt, bufptr: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetServiceGetInfo(servername.toString(), service.toString(), level.toInt(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetServiceInstall(servername: PCWSTR, service: PCWSTR, argc: UInt, argv: Long, bufptr: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetServiceInstall(servername.toString(), service.toString(), argc.toInt(), argv.toString(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetSetPrimaryComputerName(server: PCWSTR, primaryname: PCWSTR, domainaccount: PCWSTR, domainaccountpassword: PCWSTR, reserved: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetSetPrimaryComputerName(server.toString(), primaryname.toString(), domainaccount.toString(), domainaccountpassword.toString(), reserved.toInt()) as Int).toUInt() else 0u

public actual fun NetUnjoinDomain(lpserver: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, funjoinoptions: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetUnjoinDomain(lpserver.toString(), lpaccount.toString(), lppassword.toString(), funjoinoptions.toInt()) as Int).toUInt() else 0u

public actual fun NetUseAdd(servername: Long, levelflags: UInt, buf: Long, parm_err: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetUseAdd(servername.toString(), levelflags.toInt(), buf.toString(), parm_err.toString()) as Int).toUInt() else 0u

public actual fun NetUseDel(uncservername: PCWSTR, usename: PCWSTR, forcelevelflags: FORCE_LEVEL_FLAGS): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetUseDel(uncservername.toString(), usename.toString(), forcelevelflags.toInt()) as Int).toUInt() else 0u

public actual fun NetUseEnum(uncservername: PCWSTR, levelflags: UInt, bufptr: Long, preferedmaximumsize: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetUseEnum(uncservername.toString(), levelflags.toInt(), bufptr.toString(), preferedmaximumsize.toInt(), entriesread.toString(), totalentries.toString(), resumehandle.toString()) as Int).toUInt() else 0u

public actual fun NetUseGetInfo(uncservername: PCWSTR, usename: PCWSTR, levelflags: UInt, bufptr: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetUseGetInfo(uncservername.toString(), usename.toString(), levelflags.toInt(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetUserAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetUserAdd(servername.toString(), level.toInt(), buf.toString(), parm_err.toString()) as Int).toUInt() else 0u

public actual fun NetUserChangePassword(domainname: PCWSTR, username: PCWSTR, oldpassword: PCWSTR, newpassword: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetUserChangePassword(domainname.toString(), username.toString(), oldpassword.toString(), newpassword.toString()) as Int).toUInt() else 0u

public actual fun NetUserDel(servername: PCWSTR, username: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetUserDel(servername.toString(), username.toString()) as Int).toUInt() else 0u

public actual fun NetUserEnum(servername: PCWSTR, level: UInt, filter: NET_USER_ENUM_FILTER_FLAGS, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetUserEnum(servername.toString(), level.toInt(), filter.toInt(), bufptr.toString(), prefmaxlen.toInt(), entriesread.toString(), totalentries.toString(), resume_handle.toString()) as Int).toUInt() else 0u

public actual fun NetUserGetGroups(servername: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetUserGetGroups(servername.toString(), username.toString(), level.toInt(), bufptr.toString(), prefmaxlen.toInt(), entriesread.toString(), totalentries.toString()) as Int).toUInt() else 0u

public actual fun NetUserGetInfo(servername: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetUserGetInfo(servername.toString(), username.toString(), level.toInt(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetUserGetLocalGroups(servername: PCWSTR, username: PCWSTR, level: UInt, flags: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetUserGetLocalGroups(servername.toString(), username.toString(), level.toInt(), flags.toInt(), bufptr.toString(), prefmaxlen.toInt(), entriesread.toString(), totalentries.toString()) as Int).toUInt() else 0u

public actual fun NetUserModalsGet(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetUserModalsGet(servername.toString(), level.toInt(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetUserModalsSet(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetUserModalsSet(servername.toString(), level.toInt(), buf.toString(), parm_err.toString()) as Int).toUInt() else 0u

public actual fun NetUserSetGroups(servername: PCWSTR, username: PCWSTR, level: UInt, buf: Long, num_entries: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetUserSetGroups(servername.toString(), username.toString(), level.toInt(), buf.toString(), num_entries.toInt()) as Int).toUInt() else 0u

public actual fun NetUserSetInfo(servername: PCWSTR, username: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetUserSetInfo(servername.toString(), username.toString(), level.toInt(), buf.toString(), parm_err.toString()) as Int).toUInt() else 0u

public actual fun NetValidateName(lpserver: PCWSTR, lpname: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, nametype: NETSETUP_NAME_TYPE): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetValidateName(lpserver.toString(), lpname.toString(), lpaccount.toString(), lppassword.toString(), nametype) as Int).toUInt() else 0u

public actual fun NetValidatePasswordPolicy(servername: PCWSTR, qualifier: Long, validationtype: NET_VALIDATE_PASSWORD_TYPE, inputarg: Long, outputarg: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetValidatePasswordPolicy(servername.toString(), qualifier.toString(), validationtype, inputarg.toString(), outputarg.toString()) as Int).toUInt() else 0u

public actual fun NetValidatePasswordPolicyFree(outputarg: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetValidatePasswordPolicyFree(outputarg.toString()) as Int).toUInt() else 0u

public actual fun NetWkstaGetInfo(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaGetInfo(servername.toString(), level.toInt(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetWkstaSetInfo(servername: PCWSTR, level: UInt, buffer: Long, parm_err: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaSetInfo(servername.toString(), level.toInt(), buffer.toString(), parm_err.toString()) as Int).toUInt() else 0u

public actual fun NetWkstaTransportAdd(servername: Long, level: UInt, buf: Long, parm_err: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaTransportAdd(servername.toString(), level.toInt(), buf.toString(), parm_err.toString()) as Int).toUInt() else 0u

public actual fun NetWkstaTransportDel(servername: PCWSTR, transportname: PCWSTR, ucond: FORCE_LEVEL_FLAGS): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaTransportDel(servername.toString(), transportname.toString(), ucond.toInt()) as Int).toUInt() else 0u

public actual fun NetWkstaTransportEnum(servername: Long, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaTransportEnum(servername.toString(), level.toInt(), bufptr.toString(), prefmaxlen.toInt(), entriesread.toString(), totalentries.toString(), resume_handle.toString()) as Int).toUInt() else 0u

public actual fun NetWkstaUserEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaUserEnum(servername.toString(), level.toInt(), bufptr.toString(), prefmaxlen.toInt(), entriesread.toString(), totalentries.toString(), resumehandle.toString()) as Int).toUInt() else 0u

public actual fun NetWkstaUserGetInfo(reserved: PCWSTR, level: UInt, bufptr: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaUserGetInfo(reserved.toString(), level.toInt(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetWkstaUserSetInfo(reserved: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaUserSetInfo(reserved.toString(), level.toInt(), buf.toString(), parm_err.toString()) as Int).toUInt() else 0u

public actual fun RouterAssert(pszfailedassertion: PCSTR, pszfilename: PCSTR, dwlinenumber: UInt, pszmessage: PCSTR) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        _windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_RouterAssert(pszfailedassertion.toString(), pszfilename.toString(), dwlinenumber.toInt(), pszmessage.toString())
    }
}

public actual fun RouterGetErrorStringA(dwerrorcode: UInt, lplpszerrorstring: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_RouterGetErrorStringA(dwerrorcode.toInt(), lplpszerrorstring.toString()) as Int).toUInt() else 0u

public actual fun RouterGetErrorStringW(dwerrorcode: UInt, lplpwszerrorstring: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_RouterGetErrorStringW(dwerrorcode.toInt(), lplpwszerrorstring.toString()) as Int).toUInt() else 0u

public actual fun RouterLogDeregisterA(hloghandle: HANDLE) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        _windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogDeregisterA(hloghandle.toString())
    }
}

public actual fun RouterLogDeregisterW(hloghandle: HANDLE) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        _windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogDeregisterW(hloghandle.toString())
    }
}

public actual fun RouterLogEventA(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        _windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventA(hloghandle.toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.toString(), dwerrorcode.toInt())
    }
}

public actual fun RouterLogEventDataA(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwdatabytes: UInt, lpdatabytes: Long) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        _windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventDataA(hloghandle.toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.toString(), dwdatabytes.toInt(), lpdatabytes.toString())
    }
}

public actual fun RouterLogEventDataW(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwdatabytes: UInt, lpdatabytes: Long) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        _windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventDataW(hloghandle.toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.toString(), dwdatabytes.toInt(), lpdatabytes.toString())
    }
}

public actual fun RouterLogEventExA(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCSTR) {
}

public actual fun RouterLogEventExW(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCWSTR) {
}

public actual fun RouterLogEventStringA(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt, dwerrorindex: UInt) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        _windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventStringA(hloghandle.toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.toString(), dwerrorcode.toInt(), dwerrorindex.toInt())
    }
}

public actual fun RouterLogEventStringW(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt, dwerrorindex: UInt) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        _windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventStringW(hloghandle.toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.toString(), dwerrorcode.toInt(), dwerrorindex.toInt())
    }
}

public actual fun RouterLogEventValistExA(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCSTR, arglist: Long) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        _windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventValistExA(hloghandle.toString(), dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), ptszformat.toString(), arglist.toString())
    }
}

public actual fun RouterLogEventValistExW(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCWSTR, arglist: Long) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        _windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventValistExW(hloghandle.toString(), dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), ptszformat.toString(), arglist.toString())
    }
}

public actual fun RouterLogEventW(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) {
        _windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventW(hloghandle.toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.toString(), dwerrorcode.toInt())
    }
}

public actual fun RouterLogRegisterA(lpszsource: PCSTR): HANDLE =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogRegisterA(lpszsource.toString()) as String).toLong() else 0L

public actual fun RouterLogRegisterW(lpszsource: PCWSTR): HANDLE =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogRegisterW(lpszsource.toString()) as String).toLong() else 0L

public actual fun SetNetScheduleAccountInformation(pwszservername: PCWSTR, pwszaccount: PCWSTR, pwszpassword: PCWSTR): HRESULT =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_SetNetScheduleAccountInformation(pwszservername.toString(), pwszaccount.toString(), pwszpassword.toString()) as Int) else 0

public actual fun TraceDeregisterA(dwtraceid: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_TraceDeregisterA(dwtraceid.toInt()) as Int).toUInt() else 0u

public actual fun TraceDeregisterExA(dwtraceid: UInt, dwflags: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_TraceDeregisterExA(dwtraceid.toInt(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun TraceDeregisterExW(dwtraceid: UInt, dwflags: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_TraceDeregisterExW(dwtraceid.toInt(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun TraceDeregisterW(dwtraceid: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_TraceDeregisterW(dwtraceid.toInt()) as Int).toUInt() else 0u

public actual fun TraceDumpExA(dwtraceid: UInt, dwflags: UInt, lpbbytes: Long, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: BOOL, lpszprefix: PCSTR): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_TraceDumpExA(dwtraceid.toInt(), dwflags.toInt(), lpbbytes.toString(), dwbytecount.toInt(), dwgroupsize.toInt(), baddressprefix, lpszprefix.toString()) as Int).toUInt() else 0u

public actual fun TraceDumpExW(dwtraceid: UInt, dwflags: UInt, lpbbytes: Long, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: BOOL, lpszprefix: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_TraceDumpExW(dwtraceid.toInt(), dwflags.toInt(), lpbbytes.toString(), dwbytecount.toInt(), dwgroupsize.toInt(), baddressprefix, lpszprefix.toString()) as Int).toUInt() else 0u

public actual fun TraceGetConsoleA(dwtraceid: UInt, lphconsole: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_TraceGetConsoleA(dwtraceid.toInt(), lphconsole.toString()) as Int).toUInt() else 0u

public actual fun TraceGetConsoleW(dwtraceid: UInt, lphconsole: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_TraceGetConsoleW(dwtraceid.toInt(), lphconsole.toString()) as Int).toUInt() else 0u

public actual fun TracePrintfA(dwtraceid: UInt, lpszformat: PCSTR): UInt =
    0u

public actual fun TracePrintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: PCSTR): UInt =
    0u

public actual fun TracePrintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: PCWSTR): UInt =
    0u

public actual fun TracePrintfW(dwtraceid: UInt, lpszformat: PCWSTR): UInt =
    0u

public actual fun TracePutsExA(dwtraceid: UInt, dwflags: UInt, lpszstring: PCSTR): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_TracePutsExA(dwtraceid.toInt(), dwflags.toInt(), lpszstring.toString()) as Int).toUInt() else 0u

public actual fun TracePutsExW(dwtraceid: UInt, dwflags: UInt, lpszstring: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_TracePutsExW(dwtraceid.toInt(), dwflags.toInt(), lpszstring.toString()) as Int).toUInt() else 0u

public actual fun TraceRegisterExA(lpszcallername: PCSTR, dwflags: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_TraceRegisterExA(lpszcallername.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun TraceRegisterExW(lpszcallername: PCWSTR, dwflags: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_TraceRegisterExW(lpszcallername.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun TraceVprintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: PCSTR, arglist: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_TraceVprintfExA(dwtraceid.toInt(), dwflags.toInt(), lpszformat.toString(), arglist.toString()) as Int).toUInt() else 0u

public actual fun TraceVprintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: PCWSTR, arglist: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAddon != null) (_windowsWin32NetworkmanagementNetmanagementNapiAddon.windowssys_windows_win32_networkmanagement_netmanagement_TraceVprintfExW(dwtraceid.toInt(), dwflags.toInt(), lpszformat.toString(), arglist.toString()) as Int).toUInt() else 0u
