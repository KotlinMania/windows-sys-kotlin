@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun GetNetScheduleAccountInformation(pwszservername: PCWSTR, ccaccount: UInt, wszaccount: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_GetNetScheduleAccountInformation(pwszservername.toCPointer<ByteVar>(), ccaccount, wszaccount.toCPointer<ByteVar>())

public actual fun I_NetLogonControl2(servername: PCWSTR, functioncode: UInt, querylevel: UInt, data: Long, buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_I_NetLogonControl2(servername.toCPointer<ByteVar>(), functioncode, querylevel, data.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun LogErrorA(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long, dwerrorcode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_LogErrorA(dwmessageid, cnumberofsubstrings, plpwssubstrings.toCPointer<ByteVar>(), dwerrorcode)
}

public actual fun LogErrorW(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long, dwerrorcode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_LogErrorW(dwmessageid, cnumberofsubstrings, plpwssubstrings.toCPointer<ByteVar>(), dwerrorcode)
}

public actual fun LogEventA(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_LogEventA(weventtype, dwmessageid, cnumberofsubstrings, plpwssubstrings.toCPointer<ByteVar>())
}

public actual fun LogEventW(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_LogEventW(weventtype, dwmessageid, cnumberofsubstrings, plpwssubstrings.toCPointer<ByteVar>())
}

public actual fun MprSetupProtocolEnum(dwtransportid: UInt, lplpbuffer: Long, lpdwentriesread: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_MprSetupProtocolEnum(dwtransportid, lplpbuffer.toCPointer<ByteVar>(), lpdwentriesread.toCPointer<ByteVar>())

public actual fun MprSetupProtocolFree(lpbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_MprSetupProtocolFree(lpbuffer.toCPointer<ByteVar>())

public actual fun NetAccessAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetAccessAdd(servername.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>(), parm_err.toCPointer<ByteVar>())

public actual fun NetAccessDel(servername: PCWSTR, resource: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetAccessDel(servername.toCPointer<ByteVar>(), resource.toCPointer<ByteVar>())

public actual fun NetAccessEnum(servername: PCWSTR, basepath: PCWSTR, recursive: UInt, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetAccessEnum(servername.toCPointer<ByteVar>(), basepath.toCPointer<ByteVar>(), recursive, level, bufptr.toCPointer<ByteVar>(), prefmaxlen, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>(), resume_handle.toCPointer<ByteVar>())

public actual fun NetAccessGetInfo(servername: PCWSTR, resource: PCWSTR, level: UInt, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetAccessGetInfo(servername.toCPointer<ByteVar>(), resource.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>())

public actual fun NetAccessGetUserPerms(servername: PCWSTR, ugname: PCWSTR, resource: PCWSTR, perms: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetAccessGetUserPerms(servername.toCPointer<ByteVar>(), ugname.toCPointer<ByteVar>(), resource.toCPointer<ByteVar>(), perms.toCPointer<ByteVar>())

public actual fun NetAccessSetInfo(servername: PCWSTR, resource: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetAccessSetInfo(servername.toCPointer<ByteVar>(), resource.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>(), parm_err.toCPointer<ByteVar>())

public actual fun NetAddAlternateComputerName(server: PCWSTR, alternatename: PCWSTR, domainaccount: PCWSTR, domainaccountpassword: PCWSTR, reserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetAddAlternateComputerName(server.toCPointer<ByteVar>(), alternatename.toCPointer<ByteVar>(), domainaccount.toCPointer<ByteVar>(), domainaccountpassword.toCPointer<ByteVar>(), reserved)

public actual fun NetAddServiceAccount(servername: PCWSTR, accountname: PCWSTR, password: PCWSTR, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetAddServiceAccount(servername.toCPointer<ByteVar>(), accountname.toCPointer<ByteVar>(), password.toCPointer<ByteVar>(), flags)

public actual fun NetAlertRaise(alerttype: PCWSTR, buffer: Long, buffersize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetAlertRaise(alerttype.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize)

public actual fun NetAlertRaiseEx(alerttype: PCWSTR, variableinfo: Long, variableinfosize: UInt, servicename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetAlertRaiseEx(alerttype.toCPointer<ByteVar>(), variableinfo.toCPointer<ByteVar>(), variableinfosize, servicename.toCPointer<ByteVar>())

public actual fun NetApiBufferAllocate(bytecount: UInt, buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetApiBufferAllocate(bytecount, buffer.toCPointer<ByteVar>())

public actual fun NetApiBufferFree(buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetApiBufferFree(buffer.toCPointer<ByteVar>())

public actual fun NetApiBufferReallocate(oldbuffer: Long, newbytecount: UInt, newbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetApiBufferReallocate(oldbuffer.toCPointer<ByteVar>(), newbytecount, newbuffer.toCPointer<ByteVar>())

public actual fun NetApiBufferSize(buffer: Long, bytecount: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetApiBufferSize(buffer.toCPointer<ByteVar>(), bytecount.toCPointer<ByteVar>())

public actual fun NetAuditClear(server: PCWSTR, backupfile: PCWSTR, service: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetAuditClear(server.toCPointer<ByteVar>(), backupfile.toCPointer<ByteVar>(), service.toCPointer<ByteVar>())

public actual fun NetAuditRead(server: PCWSTR, service: PCWSTR, auditloghandle: Long, offset: UInt, reserved1: Long, reserved2: UInt, offsetflag: UInt, bufptr: Long, prefmaxlen: UInt, bytesread: Long, totalavailable: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetAuditRead(server.toCPointer<ByteVar>(), service.toCPointer<ByteVar>(), auditloghandle.toCPointer<ByteVar>(), offset, reserved1.toCPointer<ByteVar>(), reserved2, offsetflag, bufptr.toCPointer<ByteVar>(), prefmaxlen, bytesread.toCPointer<ByteVar>(), totalavailable.toCPointer<ByteVar>())

public actual fun NetAuditWrite(type: UInt, buf: Long, numbytes: UInt, service: PCWSTR, reserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetAuditWrite(type, buf.toCPointer<ByteVar>(), numbytes, service.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun NetConfigGet(server: PCWSTR, component: PCWSTR, parameter: PCWSTR, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetConfigGet(server.toCPointer<ByteVar>(), component.toCPointer<ByteVar>(), parameter.toCPointer<ByteVar>(), bufptr.toCPointer<ByteVar>())

public actual fun NetConfigGetAll(server: PCWSTR, component: PCWSTR, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetConfigGetAll(server.toCPointer<ByteVar>(), component.toCPointer<ByteVar>(), bufptr.toCPointer<ByteVar>())

public actual fun NetConfigSet(server: PCWSTR, reserved1: PCWSTR, component: PCWSTR, level: UInt, reserved2: UInt, buf: Long, reserved3: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetConfigSet(server.toCPointer<ByteVar>(), reserved1.toCPointer<ByteVar>(), component.toCPointer<ByteVar>(), level, reserved2, buf.toCPointer<ByteVar>(), reserved3)

public actual fun NetCreateProvisioningPackage(pprovisioningparams: Long, pppackagebindata: Long, pdwpackagebindatasize: Long, pppackagetextdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetCreateProvisioningPackage(pprovisioningparams.toCPointer<ByteVar>(), pppackagebindata.toCPointer<ByteVar>(), pdwpackagebindatasize.toCPointer<ByteVar>(), pppackagetextdata.toCPointer<ByteVar>())

public actual fun NetEnumerateComputerNames(server: PCWSTR, nametype: NET_COMPUTER_NAME_TYPE, reserved: UInt, entrycount: Long, computernames: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetEnumerateComputerNames(server.toCPointer<ByteVar>(), nametype, reserved, entrycount.toCPointer<ByteVar>(), computernames.toCPointer<ByteVar>())

public actual fun NetEnumerateServiceAccounts(servername: PCWSTR, flags: UInt, accountscount: Long, accounts: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetEnumerateServiceAccounts(servername.toCPointer<ByteVar>(), flags, accountscount.toCPointer<ByteVar>(), accounts.toCPointer<ByteVar>())

public actual fun NetErrorLogClear(uncservername: PCWSTR, backupfile: PCWSTR, reserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetErrorLogClear(uncservername.toCPointer<ByteVar>(), backupfile.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun NetErrorLogRead(uncservername: PCWSTR, reserved1: PCWSTR, errorloghandle: Long, offset: UInt, reserved2: Long, reserved3: UInt, offsetflag: UInt, bufptr: Long, prefmaxsize: UInt, bytesread: Long, totalavailable: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetErrorLogRead(uncservername.toCPointer<ByteVar>(), reserved1.toCPointer<ByteVar>(), errorloghandle.toCPointer<ByteVar>(), offset, reserved2.toCPointer<ByteVar>(), reserved3, offsetflag, bufptr.toCPointer<ByteVar>(), prefmaxsize, bytesread.toCPointer<ByteVar>(), totalavailable.toCPointer<ByteVar>())

public actual fun NetErrorLogWrite(reserved1: Long, code: UInt, component: PCWSTR, buffer: Long, numbytes: UInt, msgbuf: Long, strcount: UInt, reserved2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetErrorLogWrite(reserved1.toCPointer<ByteVar>(), code, component.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), numbytes, msgbuf.toCPointer<ByteVar>(), strcount, reserved2.toCPointer<ByteVar>())

public actual fun NetFreeAadJoinInformation(pjoininfo: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetFreeAadJoinInformation(pjoininfo.toCPointer<ByteVar>())
}

public actual fun NetGetAadJoinInformation(pcsztenantid: PCWSTR, ppjoininfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetGetAadJoinInformation(pcsztenantid.toCPointer<ByteVar>(), ppjoininfo.toCPointer<ByteVar>())

public actual fun NetGetAnyDCName(servername: PCWSTR, domainname: PCWSTR, buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetGetAnyDCName(servername.toCPointer<ByteVar>(), domainname.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun NetGetDCName(servername: PCWSTR, domainname: PCWSTR, buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetGetDCName(servername.toCPointer<ByteVar>(), domainname.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun NetGetDisplayInformationIndex(servername: PCWSTR, level: UInt, prefix: PCWSTR, index: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetGetDisplayInformationIndex(servername.toCPointer<ByteVar>(), level, prefix.toCPointer<ByteVar>(), index.toCPointer<ByteVar>())

public actual fun NetGetJoinInformation(lpserver: PCWSTR, lpnamebuffer: Long, buffertype: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetGetJoinInformation(lpserver.toCPointer<ByteVar>(), lpnamebuffer.toCPointer<ByteVar>(), buffertype.toCPointer<ByteVar>())

public actual fun NetGetJoinableOUs(lpserver: PCWSTR, lpdomain: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, oucount: Long, ous: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetGetJoinableOUs(lpserver.toCPointer<ByteVar>(), lpdomain.toCPointer<ByteVar>(), lpaccount.toCPointer<ByteVar>(), lppassword.toCPointer<ByteVar>(), oucount.toCPointer<ByteVar>(), ous.toCPointer<ByteVar>())

public actual fun NetGroupAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupAdd(servername.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>(), parm_err.toCPointer<ByteVar>())

public actual fun NetGroupAddUser(servername: PCWSTR, groupname: PCWSTR, username: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupAddUser(servername.toCPointer<ByteVar>(), groupname.toCPointer<ByteVar>(), username.toCPointer<ByteVar>())

public actual fun NetGroupDel(servername: PCWSTR, groupname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupDel(servername.toCPointer<ByteVar>(), groupname.toCPointer<ByteVar>())

public actual fun NetGroupDelUser(servername: PCWSTR, groupname: PCWSTR, username: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupDelUser(servername.toCPointer<ByteVar>(), groupname.toCPointer<ByteVar>(), username.toCPointer<ByteVar>())

public actual fun NetGroupEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupEnum(servername.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>(), prefmaxlen, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>(), resume_handle.toCPointer<ByteVar>())

public actual fun NetGroupGetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupGetInfo(servername.toCPointer<ByteVar>(), groupname.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>())

public actual fun NetGroupGetUsers(servername: PCWSTR, groupname: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupGetUsers(servername.toCPointer<ByteVar>(), groupname.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>(), prefmaxlen, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>(), resumehandle.toCPointer<ByteVar>())

public actual fun NetGroupSetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupSetInfo(servername.toCPointer<ByteVar>(), groupname.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>(), parm_err.toCPointer<ByteVar>())

public actual fun NetGroupSetUsers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupSetUsers(servername.toCPointer<ByteVar>(), groupname.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>(), totalentries)

public actual fun NetIsServiceAccount(servername: PCWSTR, accountname: PCWSTR, isservice: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetIsServiceAccount(servername.toCPointer<ByteVar>(), accountname.toCPointer<ByteVar>(), isservice.toCPointer<ByteVar>())

public actual fun NetJoinDomain(lpserver: PCWSTR, lpdomain: PCWSTR, lpmachineaccountou: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, fjoinoptions: NET_JOIN_DOMAIN_JOIN_OPTIONS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetJoinDomain(lpserver.toCPointer<ByteVar>(), lpdomain.toCPointer<ByteVar>(), lpmachineaccountou.toCPointer<ByteVar>(), lpaccount.toCPointer<ByteVar>(), lppassword.toCPointer<ByteVar>(), fjoinoptions)

public actual fun NetLocalGroupAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupAdd(servername.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>(), parm_err.toCPointer<ByteVar>())

public actual fun NetLocalGroupAddMember(servername: PCWSTR, groupname: PCWSTR, membersid: PSID): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupAddMember(servername.toCPointer<ByteVar>(), groupname.toCPointer<ByteVar>(), membersid.toCPointer<ByteVar>())

public actual fun NetLocalGroupAddMembers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupAddMembers(servername.toCPointer<ByteVar>(), groupname.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>(), totalentries)

public actual fun NetLocalGroupDel(servername: PCWSTR, groupname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupDel(servername.toCPointer<ByteVar>(), groupname.toCPointer<ByteVar>())

public actual fun NetLocalGroupDelMember(servername: PCWSTR, groupname: PCWSTR, membersid: PSID): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupDelMember(servername.toCPointer<ByteVar>(), groupname.toCPointer<ByteVar>(), membersid.toCPointer<ByteVar>())

public actual fun NetLocalGroupDelMembers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupDelMembers(servername.toCPointer<ByteVar>(), groupname.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>(), totalentries)

public actual fun NetLocalGroupEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupEnum(servername.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>(), prefmaxlen, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>(), resumehandle.toCPointer<ByteVar>())

public actual fun NetLocalGroupGetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupGetInfo(servername.toCPointer<ByteVar>(), groupname.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>())

public actual fun NetLocalGroupGetMembers(servername: PCWSTR, localgroupname: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupGetMembers(servername.toCPointer<ByteVar>(), localgroupname.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>(), prefmaxlen, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>(), resumehandle.toCPointer<ByteVar>())

public actual fun NetLocalGroupSetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupSetInfo(servername.toCPointer<ByteVar>(), groupname.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>(), parm_err.toCPointer<ByteVar>())

public actual fun NetLocalGroupSetMembers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupSetMembers(servername.toCPointer<ByteVar>(), groupname.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>(), totalentries)

public actual fun NetMessageBufferSend(servername: PCWSTR, msgname: PCWSTR, fromname: PCWSTR, buf: Long, buflen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetMessageBufferSend(servername.toCPointer<ByteVar>(), msgname.toCPointer<ByteVar>(), fromname.toCPointer<ByteVar>(), buf.toCPointer<ByteVar>(), buflen)

public actual fun NetMessageNameAdd(servername: PCWSTR, msgname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetMessageNameAdd(servername.toCPointer<ByteVar>(), msgname.toCPointer<ByteVar>())

public actual fun NetMessageNameDel(servername: PCWSTR, msgname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetMessageNameDel(servername.toCPointer<ByteVar>(), msgname.toCPointer<ByteVar>())

public actual fun NetMessageNameEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetMessageNameEnum(servername.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>(), prefmaxlen, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>(), resume_handle.toCPointer<ByteVar>())

public actual fun NetMessageNameGetInfo(servername: PCWSTR, msgname: PCWSTR, level: UInt, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetMessageNameGetInfo(servername.toCPointer<ByteVar>(), msgname.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>())

public actual fun NetProvisionComputerAccount(lpdomain: PCWSTR, lpmachinename: PCWSTR, lpmachineaccountou: PCWSTR, lpdcname: PCWSTR, dwoptions: NETSETUP_PROVISION, pprovisionbindata: Long, pdwprovisionbindatasize: Long, pprovisiontextdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetProvisionComputerAccount(lpdomain.toCPointer<ByteVar>(), lpmachinename.toCPointer<ByteVar>(), lpmachineaccountou.toCPointer<ByteVar>(), lpdcname.toCPointer<ByteVar>(), dwoptions, pprovisionbindata.toCPointer<ByteVar>(), pdwprovisionbindatasize.toCPointer<ByteVar>(), pprovisiontextdata.toCPointer<ByteVar>())

public actual fun NetQueryDisplayInformation(servername: PCWSTR, level: UInt, index: UInt, entriesrequested: UInt, preferredmaximumlength: UInt, returnedentrycount: Long, sortedbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetQueryDisplayInformation(servername.toCPointer<ByteVar>(), level, index, entriesrequested, preferredmaximumlength, returnedentrycount.toCPointer<ByteVar>(), sortedbuffer.toCPointer<ByteVar>())

public actual fun NetQueryServiceAccount(servername: PCWSTR, accountname: PCWSTR, infolevel: UInt, buffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetQueryServiceAccount(servername.toCPointer<ByteVar>(), accountname.toCPointer<ByteVar>(), infolevel, buffer.toCPointer<ByteVar>())

public actual fun NetRemoteComputerSupports(uncservername: PCWSTR, optionswanted: NET_REMOTE_COMPUTER_SUPPORTS_OPTIONS, optionssupported: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetRemoteComputerSupports(uncservername.toCPointer<ByteVar>(), optionswanted, optionssupported.toCPointer<ByteVar>())

public actual fun NetRemoteTOD(uncservername: PCWSTR, bufferptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetRemoteTOD(uncservername.toCPointer<ByteVar>(), bufferptr.toCPointer<ByteVar>())

public actual fun NetRemoveAlternateComputerName(server: PCWSTR, alternatename: PCWSTR, domainaccount: PCWSTR, domainaccountpassword: PCWSTR, reserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetRemoveAlternateComputerName(server.toCPointer<ByteVar>(), alternatename.toCPointer<ByteVar>(), domainaccount.toCPointer<ByteVar>(), domainaccountpassword.toCPointer<ByteVar>(), reserved)

public actual fun NetRemoveServiceAccount(servername: PCWSTR, accountname: PCWSTR, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetRemoveServiceAccount(servername.toCPointer<ByteVar>(), accountname.toCPointer<ByteVar>(), flags)

public actual fun NetRenameMachineInDomain(lpserver: PCWSTR, lpnewmachinename: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, frenameoptions: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetRenameMachineInDomain(lpserver.toCPointer<ByteVar>(), lpnewmachinename.toCPointer<ByteVar>(), lpaccount.toCPointer<ByteVar>(), lppassword.toCPointer<ByteVar>(), frenameoptions)

public actual fun NetReplExportDirAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirAdd(servername.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>(), parm_err.toCPointer<ByteVar>())

public actual fun NetReplExportDirDel(servername: PCWSTR, dirname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirDel(servername.toCPointer<ByteVar>(), dirname.toCPointer<ByteVar>())

public actual fun NetReplExportDirEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirEnum(servername.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>(), prefmaxlen, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>(), resumehandle.toCPointer<ByteVar>())

public actual fun NetReplExportDirGetInfo(servername: PCWSTR, dirname: PCWSTR, level: UInt, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirGetInfo(servername.toCPointer<ByteVar>(), dirname.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>())

public actual fun NetReplExportDirLock(servername: PCWSTR, dirname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirLock(servername.toCPointer<ByteVar>(), dirname.toCPointer<ByteVar>())

public actual fun NetReplExportDirSetInfo(servername: PCWSTR, dirname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirSetInfo(servername.toCPointer<ByteVar>(), dirname.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>(), parm_err.toCPointer<ByteVar>())

public actual fun NetReplExportDirUnlock(servername: PCWSTR, dirname: PCWSTR, unlockforce: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirUnlock(servername.toCPointer<ByteVar>(), dirname.toCPointer<ByteVar>(), unlockforce)

public actual fun NetReplGetInfo(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetReplGetInfo(servername.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>())

public actual fun NetReplImportDirAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirAdd(servername.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>(), parm_err.toCPointer<ByteVar>())

public actual fun NetReplImportDirDel(servername: PCWSTR, dirname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirDel(servername.toCPointer<ByteVar>(), dirname.toCPointer<ByteVar>())

public actual fun NetReplImportDirEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirEnum(servername.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>(), prefmaxlen, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>(), resumehandle.toCPointer<ByteVar>())

public actual fun NetReplImportDirGetInfo(servername: PCWSTR, dirname: PCWSTR, level: UInt, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirGetInfo(servername.toCPointer<ByteVar>(), dirname.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>())

public actual fun NetReplImportDirLock(servername: PCWSTR, dirname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirLock(servername.toCPointer<ByteVar>(), dirname.toCPointer<ByteVar>())

public actual fun NetReplImportDirUnlock(servername: PCWSTR, dirname: PCWSTR, unlockforce: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirUnlock(servername.toCPointer<ByteVar>(), dirname.toCPointer<ByteVar>(), unlockforce)

public actual fun NetReplSetInfo(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetReplSetInfo(servername.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>(), parm_err.toCPointer<ByteVar>())

public actual fun NetRequestOfflineDomainJoin(pprovisionbindata: Long, cbprovisionbindatasize: UInt, dwoptions: NET_REQUEST_PROVISION_OPTIONS, lpwindowspath: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetRequestOfflineDomainJoin(pprovisionbindata.toCPointer<ByteVar>(), cbprovisionbindatasize, dwoptions, lpwindowspath.toCPointer<ByteVar>())

public actual fun NetRequestProvisioningPackageInstall(ppackagebindata: Long, dwpackagebindatasize: UInt, dwprovisionoptions: NET_REQUEST_PROVISION_OPTIONS, lpwindowspath: PCWSTR, pvreserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetRequestProvisioningPackageInstall(ppackagebindata.toCPointer<ByteVar>(), dwpackagebindatasize, dwprovisionoptions, lpwindowspath.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun NetScheduleJobAdd(servername: PCWSTR, buffer: Long, jobid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetScheduleJobAdd(servername.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), jobid.toCPointer<ByteVar>())

public actual fun NetScheduleJobDel(servername: PCWSTR, minjobid: UInt, maxjobid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetScheduleJobDel(servername.toCPointer<ByteVar>(), minjobid, maxjobid)

public actual fun NetScheduleJobEnum(servername: PCWSTR, pointertobuffer: Long, prefferedmaximumlength: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetScheduleJobEnum(servername.toCPointer<ByteVar>(), pointertobuffer.toCPointer<ByteVar>(), prefferedmaximumlength, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>(), resumehandle.toCPointer<ByteVar>())

public actual fun NetScheduleJobGetInfo(servername: PCWSTR, jobid: UInt, pointertobuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetScheduleJobGetInfo(servername.toCPointer<ByteVar>(), jobid, pointertobuffer.toCPointer<ByteVar>())

public actual fun NetServerComputerNameAdd(servername: PCWSTR, emulateddomainname: PCWSTR, emulatedservername: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetServerComputerNameAdd(servername.toCPointer<ByteVar>(), emulateddomainname.toCPointer<ByteVar>(), emulatedservername.toCPointer<ByteVar>())

public actual fun NetServerComputerNameDel(servername: PCWSTR, emulatedservername: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetServerComputerNameDel(servername.toCPointer<ByteVar>(), emulatedservername.toCPointer<ByteVar>())

public actual fun NetServerDiskEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetServerDiskEnum(servername.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>(), prefmaxlen, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>(), resume_handle.toCPointer<ByteVar>())

public actual fun NetServerEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, servertype: NET_SERVER_TYPE, domain: PCWSTR, resume_handle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetServerEnum(servername.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>(), prefmaxlen, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>(), servertype, domain.toCPointer<ByteVar>(), resume_handle.toCPointer<ByteVar>())

public actual fun NetServerGetInfo(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetServerGetInfo(servername.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>())

public actual fun NetServerSetInfo(servername: PCWSTR, level: UInt, buf: Long, parmerror: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetServerSetInfo(servername.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>(), parmerror.toCPointer<ByteVar>())

public actual fun NetServerTransportAdd(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetServerTransportAdd(servername.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>())

public actual fun NetServerTransportAddEx(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetServerTransportAddEx(servername.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>())

public actual fun NetServerTransportDel(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetServerTransportDel(servername.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>())

public actual fun NetServerTransportEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetServerTransportEnum(servername.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>(), prefmaxlen, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>(), resume_handle.toCPointer<ByteVar>())

public actual fun NetServiceControl(servername: PCWSTR, service: PCWSTR, opcode: UInt, arg: UInt, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetServiceControl(servername.toCPointer<ByteVar>(), service.toCPointer<ByteVar>(), opcode, arg, bufptr.toCPointer<ByteVar>())

public actual fun NetServiceEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetServiceEnum(servername.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>(), prefmaxlen, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>(), resume_handle.toCPointer<ByteVar>())

public actual fun NetServiceGetInfo(servername: PCWSTR, service: PCWSTR, level: UInt, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetServiceGetInfo(servername.toCPointer<ByteVar>(), service.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>())

public actual fun NetServiceInstall(servername: PCWSTR, service: PCWSTR, argc: UInt, argv: Long, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetServiceInstall(servername.toCPointer<ByteVar>(), service.toCPointer<ByteVar>(), argc, argv.toCPointer<ByteVar>(), bufptr.toCPointer<ByteVar>())

public actual fun NetSetPrimaryComputerName(server: PCWSTR, primaryname: PCWSTR, domainaccount: PCWSTR, domainaccountpassword: PCWSTR, reserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetSetPrimaryComputerName(server.toCPointer<ByteVar>(), primaryname.toCPointer<ByteVar>(), domainaccount.toCPointer<ByteVar>(), domainaccountpassword.toCPointer<ByteVar>(), reserved)

public actual fun NetUnjoinDomain(lpserver: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, funjoinoptions: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetUnjoinDomain(lpserver.toCPointer<ByteVar>(), lpaccount.toCPointer<ByteVar>(), lppassword.toCPointer<ByteVar>(), funjoinoptions)

public actual fun NetUseAdd(servername: Long, levelflags: UInt, buf: Long, parm_err: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetUseAdd(servername.toCPointer<ByteVar>(), levelflags, buf.toCPointer<ByteVar>(), parm_err.toCPointer<ByteVar>())

public actual fun NetUseDel(uncservername: PCWSTR, usename: PCWSTR, forcelevelflags: FORCE_LEVEL_FLAGS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetUseDel(uncservername.toCPointer<ByteVar>(), usename.toCPointer<ByteVar>(), forcelevelflags)

public actual fun NetUseEnum(uncservername: PCWSTR, levelflags: UInt, bufptr: Long, preferedmaximumsize: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetUseEnum(uncservername.toCPointer<ByteVar>(), levelflags, bufptr.toCPointer<ByteVar>(), preferedmaximumsize, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>(), resumehandle.toCPointer<ByteVar>())

public actual fun NetUseGetInfo(uncservername: PCWSTR, usename: PCWSTR, levelflags: UInt, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetUseGetInfo(uncservername.toCPointer<ByteVar>(), usename.toCPointer<ByteVar>(), levelflags, bufptr.toCPointer<ByteVar>())

public actual fun NetUserAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetUserAdd(servername.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>(), parm_err.toCPointer<ByteVar>())

public actual fun NetUserChangePassword(domainname: PCWSTR, username: PCWSTR, oldpassword: PCWSTR, newpassword: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetUserChangePassword(domainname.toCPointer<ByteVar>(), username.toCPointer<ByteVar>(), oldpassword.toCPointer<ByteVar>(), newpassword.toCPointer<ByteVar>())

public actual fun NetUserDel(servername: PCWSTR, username: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetUserDel(servername.toCPointer<ByteVar>(), username.toCPointer<ByteVar>())

public actual fun NetUserEnum(servername: PCWSTR, level: UInt, filter: NET_USER_ENUM_FILTER_FLAGS, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetUserEnum(servername.toCPointer<ByteVar>(), level, filter, bufptr.toCPointer<ByteVar>(), prefmaxlen, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>(), resume_handle.toCPointer<ByteVar>())

public actual fun NetUserGetGroups(servername: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetUserGetGroups(servername.toCPointer<ByteVar>(), username.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>(), prefmaxlen, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>())

public actual fun NetUserGetInfo(servername: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetUserGetInfo(servername.toCPointer<ByteVar>(), username.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>())

public actual fun NetUserGetLocalGroups(servername: PCWSTR, username: PCWSTR, level: UInt, flags: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetUserGetLocalGroups(servername.toCPointer<ByteVar>(), username.toCPointer<ByteVar>(), level, flags, bufptr.toCPointer<ByteVar>(), prefmaxlen, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>())

public actual fun NetUserModalsGet(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetUserModalsGet(servername.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>())

public actual fun NetUserModalsSet(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetUserModalsSet(servername.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>(), parm_err.toCPointer<ByteVar>())

public actual fun NetUserSetGroups(servername: PCWSTR, username: PCWSTR, level: UInt, buf: Long, num_entries: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetUserSetGroups(servername.toCPointer<ByteVar>(), username.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>(), num_entries)

public actual fun NetUserSetInfo(servername: PCWSTR, username: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetUserSetInfo(servername.toCPointer<ByteVar>(), username.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>(), parm_err.toCPointer<ByteVar>())

public actual fun NetValidateName(lpserver: PCWSTR, lpname: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, nametype: NETSETUP_NAME_TYPE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetValidateName(lpserver.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>(), lpaccount.toCPointer<ByteVar>(), lppassword.toCPointer<ByteVar>(), nametype)

public actual fun NetValidatePasswordPolicy(servername: PCWSTR, qualifier: Long, validationtype: NET_VALIDATE_PASSWORD_TYPE, inputarg: Long, outputarg: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetValidatePasswordPolicy(servername.toCPointer<ByteVar>(), qualifier.toCPointer<ByteVar>(), validationtype, inputarg.toCPointer<ByteVar>(), outputarg.toCPointer<ByteVar>())

public actual fun NetValidatePasswordPolicyFree(outputarg: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetValidatePasswordPolicyFree(outputarg.toCPointer<ByteVar>())

public actual fun NetWkstaGetInfo(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaGetInfo(servername.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>())

public actual fun NetWkstaSetInfo(servername: PCWSTR, level: UInt, buffer: Long, parm_err: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaSetInfo(servername.toCPointer<ByteVar>(), level, buffer.toCPointer<ByteVar>(), parm_err.toCPointer<ByteVar>())

public actual fun NetWkstaTransportAdd(servername: Long, level: UInt, buf: Long, parm_err: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaTransportAdd(servername.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>(), parm_err.toCPointer<ByteVar>())

public actual fun NetWkstaTransportDel(servername: PCWSTR, transportname: PCWSTR, ucond: FORCE_LEVEL_FLAGS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaTransportDel(servername.toCPointer<ByteVar>(), transportname.toCPointer<ByteVar>(), ucond)

public actual fun NetWkstaTransportEnum(servername: Long, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaTransportEnum(servername.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>(), prefmaxlen, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>(), resume_handle.toCPointer<ByteVar>())

public actual fun NetWkstaUserEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaUserEnum(servername.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>(), prefmaxlen, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>(), resumehandle.toCPointer<ByteVar>())

public actual fun NetWkstaUserGetInfo(reserved: PCWSTR, level: UInt, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaUserGetInfo(reserved.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>())

public actual fun NetWkstaUserSetInfo(reserved: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaUserSetInfo(reserved.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>(), parm_err.toCPointer<ByteVar>())

public actual fun RouterAssert(pszfailedassertion: PCSTR, pszfilename: PCSTR, dwlinenumber: UInt, pszmessage: PCSTR) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_RouterAssert(pszfailedassertion.toCPointer<ByteVar>(), pszfilename.toCPointer<ByteVar>(), dwlinenumber, pszmessage.toCPointer<ByteVar>())
}

public actual fun RouterGetErrorStringA(dwerrorcode: UInt, lplpszerrorstring: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_RouterGetErrorStringA(dwerrorcode, lplpszerrorstring.toCPointer<ByteVar>())

public actual fun RouterGetErrorStringW(dwerrorcode: UInt, lplpwszerrorstring: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_RouterGetErrorStringW(dwerrorcode, lplpwszerrorstring.toCPointer<ByteVar>())

public actual fun RouterLogDeregisterA(hloghandle: HANDLE) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogDeregisterA(hloghandle.toCPointer<ByteVar>())
}

public actual fun RouterLogDeregisterW(hloghandle: HANDLE) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogDeregisterW(hloghandle.toCPointer<ByteVar>())
}

public actual fun RouterLogEventA(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventA(hloghandle.toCPointer<ByteVar>(), dweventtype, dwmessageid, dwsubstringcount, plpszsubstringarray.toCPointer<ByteVar>(), dwerrorcode)
}

public actual fun RouterLogEventDataA(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwdatabytes: UInt, lpdatabytes: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventDataA(hloghandle.toCPointer<ByteVar>(), dweventtype, dwmessageid, dwsubstringcount, plpszsubstringarray.toCPointer<ByteVar>(), dwdatabytes, lpdatabytes.toCPointer<ByteVar>())
}

public actual fun RouterLogEventDataW(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwdatabytes: UInt, lpdatabytes: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventDataW(hloghandle.toCPointer<ByteVar>(), dweventtype, dwmessageid, dwsubstringcount, plpszsubstringarray.toCPointer<ByteVar>(), dwdatabytes, lpdatabytes.toCPointer<ByteVar>())
}

public actual fun RouterLogEventExA(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCSTR) {
}

public actual fun RouterLogEventExW(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCWSTR) {
}

public actual fun RouterLogEventStringA(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt, dwerrorindex: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventStringA(hloghandle.toCPointer<ByteVar>(), dweventtype, dwmessageid, dwsubstringcount, plpszsubstringarray.toCPointer<ByteVar>(), dwerrorcode, dwerrorindex)
}

public actual fun RouterLogEventStringW(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt, dwerrorindex: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventStringW(hloghandle.toCPointer<ByteVar>(), dweventtype, dwmessageid, dwsubstringcount, plpszsubstringarray.toCPointer<ByteVar>(), dwerrorcode, dwerrorindex)
}

public actual fun RouterLogEventValistExA(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCSTR, arglist: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventValistExA(hloghandle.toCPointer<ByteVar>(), dweventtype, dwerrorcode, dwmessageid, ptszformat.toCPointer<ByteVar>(), arglist.toCPointer<ByteVar>())
}

public actual fun RouterLogEventValistExW(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCWSTR, arglist: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventValistExW(hloghandle.toCPointer<ByteVar>(), dweventtype, dwerrorcode, dwmessageid, ptszformat.toCPointer<ByteVar>(), arglist.toCPointer<ByteVar>())
}

public actual fun RouterLogEventW(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventW(hloghandle.toCPointer<ByteVar>(), dweventtype, dwmessageid, dwsubstringcount, plpszsubstringarray.toCPointer<ByteVar>(), dwerrorcode)
}

public actual fun RouterLogRegisterA(lpszsource: PCSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogRegisterA(lpszsource.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RouterLogRegisterW(lpszsource: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogRegisterW(lpszsource.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetNetScheduleAccountInformation(pwszservername: PCWSTR, pwszaccount: PCWSTR, pwszpassword: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_SetNetScheduleAccountInformation(pwszservername.toCPointer<ByteVar>(), pwszaccount.toCPointer<ByteVar>(), pwszpassword.toCPointer<ByteVar>())

public actual fun TraceDeregisterA(dwtraceid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_TraceDeregisterA(dwtraceid)

public actual fun TraceDeregisterExA(dwtraceid: UInt, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_TraceDeregisterExA(dwtraceid, dwflags)

public actual fun TraceDeregisterExW(dwtraceid: UInt, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_TraceDeregisterExW(dwtraceid, dwflags)

public actual fun TraceDeregisterW(dwtraceid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_TraceDeregisterW(dwtraceid)

public actual fun TraceDumpExA(dwtraceid: UInt, dwflags: UInt, lpbbytes: Long, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: BOOL, lpszprefix: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_TraceDumpExA(dwtraceid, dwflags, lpbbytes.toCPointer<ByteVar>(), dwbytecount, dwgroupsize, baddressprefix, lpszprefix.toCPointer<ByteVar>())

public actual fun TraceDumpExW(dwtraceid: UInt, dwflags: UInt, lpbbytes: Long, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: BOOL, lpszprefix: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_TraceDumpExW(dwtraceid, dwflags, lpbbytes.toCPointer<ByteVar>(), dwbytecount, dwgroupsize, baddressprefix, lpszprefix.toCPointer<ByteVar>())

public actual fun TraceGetConsoleA(dwtraceid: UInt, lphconsole: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_TraceGetConsoleA(dwtraceid, lphconsole.toCPointer<ByteVar>())

public actual fun TraceGetConsoleW(dwtraceid: UInt, lphconsole: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_TraceGetConsoleW(dwtraceid, lphconsole.toCPointer<ByteVar>())

public actual fun TracePrintfA(dwtraceid: UInt, lpszformat: PCSTR): UInt =
    0u

public actual fun TracePrintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: PCSTR): UInt =
    0u

public actual fun TracePrintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: PCWSTR): UInt =
    0u

public actual fun TracePrintfW(dwtraceid: UInt, lpszformat: PCWSTR): UInt =
    0u

public actual fun TracePutsExA(dwtraceid: UInt, dwflags: UInt, lpszstring: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_TracePutsExA(dwtraceid, dwflags, lpszstring.toCPointer<ByteVar>())

public actual fun TracePutsExW(dwtraceid: UInt, dwflags: UInt, lpszstring: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_TracePutsExW(dwtraceid, dwflags, lpszstring.toCPointer<ByteVar>())

public actual fun TraceRegisterExA(lpszcallername: PCSTR, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_TraceRegisterExA(lpszcallername.toCPointer<ByteVar>(), dwflags)

public actual fun TraceRegisterExW(lpszcallername: PCWSTR, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_TraceRegisterExW(lpszcallername.toCPointer<ByteVar>(), dwflags)

public actual fun TraceVprintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: PCSTR, arglist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_TraceVprintfExA(dwtraceid, dwflags, lpszformat.toCPointer<ByteVar>(), arglist.toCPointer<ByteVar>())

public actual fun TraceVprintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: PCWSTR, arglist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_TraceVprintfExW(dwtraceid, dwflags, lpszformat.toCPointer<ByteVar>(), arglist.toCPointer<ByteVar>())
