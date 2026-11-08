package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

public fun GetNetScheduleAccountInformation(pwszservername: PCWSTR, ccaccount: UInt, wszaccount: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("mstask.dll", "GetNetScheduleAccountInformation", longArrayOf(pwszservername, ccaccount.toLong(), wszaccount)).toInt()
}

public fun I_NetLogonControl2(servername: PCWSTR, functioncode: UInt, querylevel: UInt, data: Long, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "I_NetLogonControl2", longArrayOf(servername, functioncode.toLong(), querylevel.toLong(), data, buffer)).toUInt()
}

public fun LogErrorA(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long, dwerrorcode: UInt) {
    Win32DynamicFfi.invoke("rtutils.dll", "LogErrorA", longArrayOf(dwmessageid.toLong(), cnumberofsubstrings.toLong(), plpwssubstrings, dwerrorcode.toLong()))
}

public fun LogErrorW(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long, dwerrorcode: UInt) {
    Win32DynamicFfi.invoke("rtutils.dll", "LogErrorW", longArrayOf(dwmessageid.toLong(), cnumberofsubstrings.toLong(), plpwssubstrings, dwerrorcode.toLong()))
}

public fun LogEventA(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long) {
    Win32DynamicFfi.invoke("rtutils.dll", "LogEventA", longArrayOf(weventtype.toLong(), dwmessageid.toLong(), cnumberofsubstrings.toLong(), plpwssubstrings))
}

public fun LogEventW(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long) {
    Win32DynamicFfi.invoke("rtutils.dll", "LogEventW", longArrayOf(weventtype.toLong(), dwmessageid.toLong(), cnumberofsubstrings.toLong(), plpwssubstrings))
}

public fun MprSetupProtocolEnum(dwtransportid: UInt, lplpbuffer: Long, lpdwentriesread: Long): UInt {
    return Win32DynamicFfi.invoke("rtutils.dll", "MprSetupProtocolEnum", longArrayOf(dwtransportid.toLong(), lplpbuffer, lpdwentriesread)).toUInt()
}

public fun MprSetupProtocolFree(lpbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("rtutils.dll", "MprSetupProtocolFree", longArrayOf(lpbuffer)).toUInt()
}

public fun NetAccessAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetAccessAdd", longArrayOf(servername, level.toLong(), buf, parm_err)).toUInt()
}

public fun NetAccessDel(servername: PCWSTR, resource: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetAccessDel", longArrayOf(servername, resource)).toUInt()
}

public fun NetAccessEnum(servername: PCWSTR, basepath: PCWSTR, recursive: UInt, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetAccessEnum", longArrayOf(servername, basepath, recursive.toLong(), level.toLong(), bufptr, prefmaxlen.toLong(), entriesread, totalentries, resume_handle)).toUInt()
}

public fun NetAccessGetInfo(servername: PCWSTR, resource: PCWSTR, level: UInt, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetAccessGetInfo", longArrayOf(servername, resource, level.toLong(), bufptr)).toUInt()
}

public fun NetAccessGetUserPerms(servername: PCWSTR, ugname: PCWSTR, resource: PCWSTR, perms: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetAccessGetUserPerms", longArrayOf(servername, ugname, resource, perms)).toUInt()
}

public fun NetAccessSetInfo(servername: PCWSTR, resource: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetAccessSetInfo", longArrayOf(servername, resource, level.toLong(), buf, parm_err)).toUInt()
}

public fun NetAddAlternateComputerName(server: PCWSTR, alternatename: PCWSTR, domainaccount: PCWSTR, domainaccountpassword: PCWSTR, reserved: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetAddAlternateComputerName", longArrayOf(server, alternatename, domainaccount, domainaccountpassword, reserved.toLong())).toUInt()
}

public fun NetAddServiceAccount(servername: PCWSTR, accountname: PCWSTR, password: PCWSTR, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetAddServiceAccount", longArrayOf(servername, accountname, password, flags.toLong())).toInt()
}

public fun NetAlertRaise(alerttype: PCWSTR, buffer: Long, buffersize: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetAlertRaise", longArrayOf(alerttype, buffer, buffersize.toLong())).toUInt()
}

public fun NetAlertRaiseEx(alerttype: PCWSTR, variableinfo: Long, variableinfosize: UInt, servicename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetAlertRaiseEx", longArrayOf(alerttype, variableinfo, variableinfosize.toLong(), servicename)).toUInt()
}

public fun NetApiBufferAllocate(bytecount: UInt, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetApiBufferAllocate", longArrayOf(bytecount.toLong(), buffer)).toUInt()
}

public fun NetApiBufferFree(buffer: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetApiBufferFree", longArrayOf(buffer)).toUInt()
}

public fun NetApiBufferReallocate(oldbuffer: Long, newbytecount: UInt, newbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetApiBufferReallocate", longArrayOf(oldbuffer, newbytecount.toLong(), newbuffer)).toUInt()
}

public fun NetApiBufferSize(buffer: Long, bytecount: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetApiBufferSize", longArrayOf(buffer, bytecount)).toUInt()
}

public fun NetAuditClear(server: PCWSTR, backupfile: PCWSTR, service: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetAuditClear", longArrayOf(server, backupfile, service)).toUInt()
}

public fun NetAuditRead(server: PCWSTR, service: PCWSTR, auditloghandle: Long, offset: UInt, reserved1: Long, reserved2: UInt, offsetflag: UInt, bufptr: Long, prefmaxlen: UInt, bytesread: Long, totalavailable: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetAuditRead", longArrayOf(server, service, auditloghandle, offset.toLong(), reserved1, reserved2.toLong(), offsetflag.toLong(), bufptr, prefmaxlen.toLong(), bytesread, totalavailable)).toUInt()
}

public fun NetAuditWrite(type: UInt, buf: Long, numbytes: UInt, service: PCWSTR, reserved: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetAuditWrite", longArrayOf(type.toLong(), buf, numbytes.toLong(), service, reserved)).toUInt()
}

public fun NetConfigGet(server: PCWSTR, component: PCWSTR, parameter: PCWSTR, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetConfigGet", longArrayOf(server, component, parameter, bufptr)).toUInt()
}

public fun NetConfigGetAll(server: PCWSTR, component: PCWSTR, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetConfigGetAll", longArrayOf(server, component, bufptr)).toUInt()
}

public fun NetConfigSet(server: PCWSTR, reserved1: PCWSTR, component: PCWSTR, level: UInt, reserved2: UInt, buf: Long, reserved3: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetConfigSet", longArrayOf(server, reserved1, component, level.toLong(), reserved2.toLong(), buf, reserved3.toLong())).toUInt()
}

public fun NetCreateProvisioningPackage(pprovisioningparams: Long, pppackagebindata: Long, pdwpackagebindatasize: Long, pppackagetextdata: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetCreateProvisioningPackage", longArrayOf(pprovisioningparams, pppackagebindata, pdwpackagebindatasize, pppackagetextdata)).toUInt()
}

public fun NetEnumerateComputerNames(server: PCWSTR, nametype: NET_COMPUTER_NAME_TYPE, reserved: UInt, entrycount: Long, computernames: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetEnumerateComputerNames", longArrayOf(server, nametype.toLong(), reserved.toLong(), entrycount, computernames)).toUInt()
}

public fun NetEnumerateServiceAccounts(servername: PCWSTR, flags: UInt, accountscount: Long, accounts: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetEnumerateServiceAccounts", longArrayOf(servername, flags.toLong(), accountscount, accounts)).toInt()
}

public fun NetErrorLogClear(uncservername: PCWSTR, backupfile: PCWSTR, reserved: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetErrorLogClear", longArrayOf(uncservername, backupfile, reserved)).toUInt()
}

public fun NetErrorLogRead(uncservername: PCWSTR, reserved1: PCWSTR, errorloghandle: Long, offset: UInt, reserved2: Long, reserved3: UInt, offsetflag: UInt, bufptr: Long, prefmaxsize: UInt, bytesread: Long, totalavailable: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetErrorLogRead", longArrayOf(uncservername, reserved1, errorloghandle, offset.toLong(), reserved2, reserved3.toLong(), offsetflag.toLong(), bufptr, prefmaxsize.toLong(), bytesread, totalavailable)).toUInt()
}

public fun NetErrorLogWrite(reserved1: Long, code: UInt, component: PCWSTR, buffer: Long, numbytes: UInt, msgbuf: Long, strcount: UInt, reserved2: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetErrorLogWrite", longArrayOf(reserved1, code.toLong(), component, buffer, numbytes.toLong(), msgbuf, strcount.toLong(), reserved2)).toUInt()
}

public fun NetFreeAadJoinInformation(pjoininfo: Long) {
    Win32DynamicFfi.invoke("netapi32.dll", "NetFreeAadJoinInformation", longArrayOf(pjoininfo))
}

public fun NetGetAadJoinInformation(pcsztenantid: PCWSTR, ppjoininfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetGetAadJoinInformation", longArrayOf(pcsztenantid, ppjoininfo)).toInt()
}

public fun NetGetAnyDCName(servername: PCWSTR, domainname: PCWSTR, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetGetAnyDCName", longArrayOf(servername, domainname, buffer)).toUInt()
}

public fun NetGetDCName(servername: PCWSTR, domainname: PCWSTR, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetGetDCName", longArrayOf(servername, domainname, buffer)).toUInt()
}

public fun NetGetDisplayInformationIndex(servername: PCWSTR, level: UInt, prefix: PCWSTR, index: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetGetDisplayInformationIndex", longArrayOf(servername, level.toLong(), prefix, index)).toUInt()
}

public fun NetGetJoinInformation(lpserver: PCWSTR, lpnamebuffer: Long, buffertype: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetGetJoinInformation", longArrayOf(lpserver, lpnamebuffer, buffertype)).toUInt()
}

public fun NetGetJoinableOUs(lpserver: PCWSTR, lpdomain: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, oucount: Long, ous: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetGetJoinableOUs", longArrayOf(lpserver, lpdomain, lpaccount, lppassword, oucount, ous)).toUInt()
}

public fun NetGroupAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetGroupAdd", longArrayOf(servername, level.toLong(), buf, parm_err)).toUInt()
}

public fun NetGroupAddUser(servername: PCWSTR, groupname: PCWSTR, username: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetGroupAddUser", longArrayOf(servername, groupname, username)).toUInt()
}

public fun NetGroupDel(servername: PCWSTR, groupname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetGroupDel", longArrayOf(servername, groupname)).toUInt()
}

public fun NetGroupDelUser(servername: PCWSTR, groupname: PCWSTR, username: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetGroupDelUser", longArrayOf(servername, groupname, username)).toUInt()
}

public fun NetGroupEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetGroupEnum", longArrayOf(servername, level.toLong(), bufptr, prefmaxlen.toLong(), entriesread, totalentries, resume_handle)).toUInt()
}

public fun NetGroupGetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetGroupGetInfo", longArrayOf(servername, groupname, level.toLong(), bufptr)).toUInt()
}

public fun NetGroupGetUsers(servername: PCWSTR, groupname: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetGroupGetUsers", longArrayOf(servername, groupname, level.toLong(), bufptr, prefmaxlen.toLong(), entriesread, totalentries, resumehandle)).toUInt()
}

public fun NetGroupSetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetGroupSetInfo", longArrayOf(servername, groupname, level.toLong(), buf, parm_err)).toUInt()
}

public fun NetGroupSetUsers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetGroupSetUsers", longArrayOf(servername, groupname, level.toLong(), buf, totalentries.toLong())).toUInt()
}

public fun NetIsServiceAccount(servername: PCWSTR, accountname: PCWSTR, isservice: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetIsServiceAccount", longArrayOf(servername, accountname, isservice)).toInt()
}

public fun NetJoinDomain(lpserver: PCWSTR, lpdomain: PCWSTR, lpmachineaccountou: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, fjoinoptions: NET_JOIN_DOMAIN_JOIN_OPTIONS): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetJoinDomain", longArrayOf(lpserver, lpdomain, lpmachineaccountou, lpaccount, lppassword, fjoinoptions.toLong())).toUInt()
}

public fun NetLocalGroupAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetLocalGroupAdd", longArrayOf(servername, level.toLong(), buf, parm_err)).toUInt()
}

public fun NetLocalGroupAddMember(servername: PCWSTR, groupname: PCWSTR, membersid: PSID): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetLocalGroupAddMember", longArrayOf(servername, groupname, membersid)).toUInt()
}

public fun NetLocalGroupAddMembers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetLocalGroupAddMembers", longArrayOf(servername, groupname, level.toLong(), buf, totalentries.toLong())).toUInt()
}

public fun NetLocalGroupDel(servername: PCWSTR, groupname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetLocalGroupDel", longArrayOf(servername, groupname)).toUInt()
}

public fun NetLocalGroupDelMember(servername: PCWSTR, groupname: PCWSTR, membersid: PSID): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetLocalGroupDelMember", longArrayOf(servername, groupname, membersid)).toUInt()
}

public fun NetLocalGroupDelMembers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetLocalGroupDelMembers", longArrayOf(servername, groupname, level.toLong(), buf, totalentries.toLong())).toUInt()
}

public fun NetLocalGroupEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetLocalGroupEnum", longArrayOf(servername, level.toLong(), bufptr, prefmaxlen.toLong(), entriesread, totalentries, resumehandle)).toUInt()
}

public fun NetLocalGroupGetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetLocalGroupGetInfo", longArrayOf(servername, groupname, level.toLong(), bufptr)).toUInt()
}

public fun NetLocalGroupGetMembers(servername: PCWSTR, localgroupname: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetLocalGroupGetMembers", longArrayOf(servername, localgroupname, level.toLong(), bufptr, prefmaxlen.toLong(), entriesread, totalentries, resumehandle)).toUInt()
}

public fun NetLocalGroupSetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetLocalGroupSetInfo", longArrayOf(servername, groupname, level.toLong(), buf, parm_err)).toUInt()
}

public fun NetLocalGroupSetMembers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetLocalGroupSetMembers", longArrayOf(servername, groupname, level.toLong(), buf, totalentries.toLong())).toUInt()
}

public fun NetMessageBufferSend(servername: PCWSTR, msgname: PCWSTR, fromname: PCWSTR, buf: Long, buflen: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetMessageBufferSend", longArrayOf(servername, msgname, fromname, buf, buflen.toLong())).toUInt()
}

public fun NetMessageNameAdd(servername: PCWSTR, msgname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetMessageNameAdd", longArrayOf(servername, msgname)).toUInt()
}

public fun NetMessageNameDel(servername: PCWSTR, msgname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetMessageNameDel", longArrayOf(servername, msgname)).toUInt()
}

public fun NetMessageNameEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetMessageNameEnum", longArrayOf(servername, level.toLong(), bufptr, prefmaxlen.toLong(), entriesread, totalentries, resume_handle)).toUInt()
}

public fun NetMessageNameGetInfo(servername: PCWSTR, msgname: PCWSTR, level: UInt, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetMessageNameGetInfo", longArrayOf(servername, msgname, level.toLong(), bufptr)).toUInt()
}

public fun NetProvisionComputerAccount(lpdomain: PCWSTR, lpmachinename: PCWSTR, lpmachineaccountou: PCWSTR, lpdcname: PCWSTR, dwoptions: NETSETUP_PROVISION, pprovisionbindata: Long, pdwprovisionbindatasize: Long, pprovisiontextdata: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetProvisionComputerAccount", longArrayOf(lpdomain, lpmachinename, lpmachineaccountou, lpdcname, dwoptions.toLong(), pprovisionbindata, pdwprovisionbindatasize, pprovisiontextdata)).toUInt()
}

public fun NetQueryDisplayInformation(servername: PCWSTR, level: UInt, index: UInt, entriesrequested: UInt, preferredmaximumlength: UInt, returnedentrycount: Long, sortedbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetQueryDisplayInformation", longArrayOf(servername, level.toLong(), index.toLong(), entriesrequested.toLong(), preferredmaximumlength.toLong(), returnedentrycount, sortedbuffer)).toUInt()
}

public fun NetQueryServiceAccount(servername: PCWSTR, accountname: PCWSTR, infolevel: UInt, buffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetQueryServiceAccount", longArrayOf(servername, accountname, infolevel.toLong(), buffer)).toInt()
}

public fun NetRemoteComputerSupports(uncservername: PCWSTR, optionswanted: NET_REMOTE_COMPUTER_SUPPORTS_OPTIONS, optionssupported: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetRemoteComputerSupports", longArrayOf(uncservername, optionswanted.toLong(), optionssupported)).toUInt()
}

public fun NetRemoteTOD(uncservername: PCWSTR, bufferptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetRemoteTOD", longArrayOf(uncservername, bufferptr)).toUInt()
}

public fun NetRemoveAlternateComputerName(server: PCWSTR, alternatename: PCWSTR, domainaccount: PCWSTR, domainaccountpassword: PCWSTR, reserved: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetRemoveAlternateComputerName", longArrayOf(server, alternatename, domainaccount, domainaccountpassword, reserved.toLong())).toUInt()
}

public fun NetRemoveServiceAccount(servername: PCWSTR, accountname: PCWSTR, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetRemoveServiceAccount", longArrayOf(servername, accountname, flags.toLong())).toInt()
}

public fun NetRenameMachineInDomain(lpserver: PCWSTR, lpnewmachinename: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, frenameoptions: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetRenameMachineInDomain", longArrayOf(lpserver, lpnewmachinename, lpaccount, lppassword, frenameoptions.toLong())).toUInt()
}

public fun NetReplExportDirAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetReplExportDirAdd", longArrayOf(servername, level.toLong(), buf, parm_err)).toUInt()
}

public fun NetReplExportDirDel(servername: PCWSTR, dirname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetReplExportDirDel", longArrayOf(servername, dirname)).toUInt()
}

public fun NetReplExportDirEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetReplExportDirEnum", longArrayOf(servername, level.toLong(), bufptr, prefmaxlen.toLong(), entriesread, totalentries, resumehandle)).toUInt()
}

public fun NetReplExportDirGetInfo(servername: PCWSTR, dirname: PCWSTR, level: UInt, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetReplExportDirGetInfo", longArrayOf(servername, dirname, level.toLong(), bufptr)).toUInt()
}

public fun NetReplExportDirLock(servername: PCWSTR, dirname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetReplExportDirLock", longArrayOf(servername, dirname)).toUInt()
}

public fun NetReplExportDirSetInfo(servername: PCWSTR, dirname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetReplExportDirSetInfo", longArrayOf(servername, dirname, level.toLong(), buf, parm_err)).toUInt()
}

public fun NetReplExportDirUnlock(servername: PCWSTR, dirname: PCWSTR, unlockforce: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetReplExportDirUnlock", longArrayOf(servername, dirname, unlockforce.toLong())).toUInt()
}

public fun NetReplGetInfo(servername: PCWSTR, level: UInt, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetReplGetInfo", longArrayOf(servername, level.toLong(), bufptr)).toUInt()
}

public fun NetReplImportDirAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetReplImportDirAdd", longArrayOf(servername, level.toLong(), buf, parm_err)).toUInt()
}

public fun NetReplImportDirDel(servername: PCWSTR, dirname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetReplImportDirDel", longArrayOf(servername, dirname)).toUInt()
}

public fun NetReplImportDirEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetReplImportDirEnum", longArrayOf(servername, level.toLong(), bufptr, prefmaxlen.toLong(), entriesread, totalentries, resumehandle)).toUInt()
}

public fun NetReplImportDirGetInfo(servername: PCWSTR, dirname: PCWSTR, level: UInt, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetReplImportDirGetInfo", longArrayOf(servername, dirname, level.toLong(), bufptr)).toUInt()
}

public fun NetReplImportDirLock(servername: PCWSTR, dirname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetReplImportDirLock", longArrayOf(servername, dirname)).toUInt()
}

public fun NetReplImportDirUnlock(servername: PCWSTR, dirname: PCWSTR, unlockforce: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetReplImportDirUnlock", longArrayOf(servername, dirname, unlockforce.toLong())).toUInt()
}

public fun NetReplSetInfo(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetReplSetInfo", longArrayOf(servername, level.toLong(), buf, parm_err)).toUInt()
}

public fun NetRequestOfflineDomainJoin(pprovisionbindata: Long, cbprovisionbindatasize: UInt, dwoptions: NET_REQUEST_PROVISION_OPTIONS, lpwindowspath: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetRequestOfflineDomainJoin", longArrayOf(pprovisionbindata, cbprovisionbindatasize.toLong(), dwoptions.toLong(), lpwindowspath)).toUInt()
}

public fun NetRequestProvisioningPackageInstall(ppackagebindata: Long, dwpackagebindatasize: UInt, dwprovisionoptions: NET_REQUEST_PROVISION_OPTIONS, lpwindowspath: PCWSTR, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetRequestProvisioningPackageInstall", longArrayOf(ppackagebindata, dwpackagebindatasize.toLong(), dwprovisionoptions.toLong(), lpwindowspath, pvreserved)).toUInt()
}

public fun NetScheduleJobAdd(servername: PCWSTR, buffer: Long, jobid: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetScheduleJobAdd", longArrayOf(servername, buffer, jobid)).toUInt()
}

public fun NetScheduleJobDel(servername: PCWSTR, minjobid: UInt, maxjobid: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetScheduleJobDel", longArrayOf(servername, minjobid.toLong(), maxjobid.toLong())).toUInt()
}

public fun NetScheduleJobEnum(servername: PCWSTR, pointertobuffer: Long, prefferedmaximumlength: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetScheduleJobEnum", longArrayOf(servername, pointertobuffer, prefferedmaximumlength.toLong(), entriesread, totalentries, resumehandle)).toUInt()
}

public fun NetScheduleJobGetInfo(servername: PCWSTR, jobid: UInt, pointertobuffer: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetScheduleJobGetInfo", longArrayOf(servername, jobid.toLong(), pointertobuffer)).toUInt()
}

public fun NetServerComputerNameAdd(servername: PCWSTR, emulateddomainname: PCWSTR, emulatedservername: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetServerComputerNameAdd", longArrayOf(servername, emulateddomainname, emulatedservername)).toUInt()
}

public fun NetServerComputerNameDel(servername: PCWSTR, emulatedservername: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetServerComputerNameDel", longArrayOf(servername, emulatedservername)).toUInt()
}

public fun NetServerDiskEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetServerDiskEnum", longArrayOf(servername, level.toLong(), bufptr, prefmaxlen.toLong(), entriesread, totalentries, resume_handle)).toUInt()
}

public fun NetServerEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, servertype: NET_SERVER_TYPE, domain: PCWSTR, resume_handle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetServerEnum", longArrayOf(servername, level.toLong(), bufptr, prefmaxlen.toLong(), entriesread, totalentries, servertype.toLong(), domain, resume_handle)).toUInt()
}

public fun NetServerGetInfo(servername: PCWSTR, level: UInt, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetServerGetInfo", longArrayOf(servername, level.toLong(), bufptr)).toUInt()
}

public fun NetServerSetInfo(servername: PCWSTR, level: UInt, buf: Long, parmerror: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetServerSetInfo", longArrayOf(servername, level.toLong(), buf, parmerror)).toUInt()
}

public fun NetServerTransportAdd(servername: PCWSTR, level: UInt, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetServerTransportAdd", longArrayOf(servername, level.toLong(), bufptr)).toUInt()
}

public fun NetServerTransportAddEx(servername: PCWSTR, level: UInt, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetServerTransportAddEx", longArrayOf(servername, level.toLong(), bufptr)).toUInt()
}

public fun NetServerTransportDel(servername: PCWSTR, level: UInt, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetServerTransportDel", longArrayOf(servername, level.toLong(), bufptr)).toUInt()
}

public fun NetServerTransportEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetServerTransportEnum", longArrayOf(servername, level.toLong(), bufptr, prefmaxlen.toLong(), entriesread, totalentries, resume_handle)).toUInt()
}

public fun NetServiceControl(servername: PCWSTR, service: PCWSTR, opcode: UInt, arg: UInt, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetServiceControl", longArrayOf(servername, service, opcode.toLong(), arg.toLong(), bufptr)).toUInt()
}

public fun NetServiceEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetServiceEnum", longArrayOf(servername, level.toLong(), bufptr, prefmaxlen.toLong(), entriesread, totalentries, resume_handle)).toUInt()
}

public fun NetServiceGetInfo(servername: PCWSTR, service: PCWSTR, level: UInt, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetServiceGetInfo", longArrayOf(servername, service, level.toLong(), bufptr)).toUInt()
}

public fun NetServiceInstall(servername: PCWSTR, service: PCWSTR, argc: UInt, argv: Long, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetServiceInstall", longArrayOf(servername, service, argc.toLong(), argv, bufptr)).toUInt()
}

public fun NetSetPrimaryComputerName(server: PCWSTR, primaryname: PCWSTR, domainaccount: PCWSTR, domainaccountpassword: PCWSTR, reserved: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetSetPrimaryComputerName", longArrayOf(server, primaryname, domainaccount, domainaccountpassword, reserved.toLong())).toUInt()
}

public fun NetUnjoinDomain(lpserver: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, funjoinoptions: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetUnjoinDomain", longArrayOf(lpserver, lpaccount, lppassword, funjoinoptions.toLong())).toUInt()
}

public fun NetUseAdd(servername: Long, levelflags: UInt, buf: Long, parm_err: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetUseAdd", longArrayOf(servername, levelflags.toLong(), buf, parm_err)).toUInt()
}

public fun NetUseDel(uncservername: PCWSTR, usename: PCWSTR, forcelevelflags: FORCE_LEVEL_FLAGS): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetUseDel", longArrayOf(uncservername, usename, forcelevelflags.toLong())).toUInt()
}

public fun NetUseEnum(uncservername: PCWSTR, levelflags: UInt, bufptr: Long, preferedmaximumsize: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetUseEnum", longArrayOf(uncservername, levelflags.toLong(), bufptr, preferedmaximumsize.toLong(), entriesread, totalentries, resumehandle)).toUInt()
}

public fun NetUseGetInfo(uncservername: PCWSTR, usename: PCWSTR, levelflags: UInt, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetUseGetInfo", longArrayOf(uncservername, usename, levelflags.toLong(), bufptr)).toUInt()
}

public fun NetUserAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetUserAdd", longArrayOf(servername, level.toLong(), buf, parm_err)).toUInt()
}

public fun NetUserChangePassword(domainname: PCWSTR, username: PCWSTR, oldpassword: PCWSTR, newpassword: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetUserChangePassword", longArrayOf(domainname, username, oldpassword, newpassword)).toUInt()
}

public fun NetUserDel(servername: PCWSTR, username: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetUserDel", longArrayOf(servername, username)).toUInt()
}

public fun NetUserEnum(servername: PCWSTR, level: UInt, filter: NET_USER_ENUM_FILTER_FLAGS, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetUserEnum", longArrayOf(servername, level.toLong(), filter.toLong(), bufptr, prefmaxlen.toLong(), entriesread, totalentries, resume_handle)).toUInt()
}

public fun NetUserGetGroups(servername: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetUserGetGroups", longArrayOf(servername, username, level.toLong(), bufptr, prefmaxlen.toLong(), entriesread, totalentries)).toUInt()
}

public fun NetUserGetInfo(servername: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetUserGetInfo", longArrayOf(servername, username, level.toLong(), bufptr)).toUInt()
}

public fun NetUserGetLocalGroups(servername: PCWSTR, username: PCWSTR, level: UInt, flags: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetUserGetLocalGroups", longArrayOf(servername, username, level.toLong(), flags.toLong(), bufptr, prefmaxlen.toLong(), entriesread, totalentries)).toUInt()
}

public fun NetUserModalsGet(servername: PCWSTR, level: UInt, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetUserModalsGet", longArrayOf(servername, level.toLong(), bufptr)).toUInt()
}

public fun NetUserModalsSet(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetUserModalsSet", longArrayOf(servername, level.toLong(), buf, parm_err)).toUInt()
}

public fun NetUserSetGroups(servername: PCWSTR, username: PCWSTR, level: UInt, buf: Long, num_entries: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetUserSetGroups", longArrayOf(servername, username, level.toLong(), buf, num_entries.toLong())).toUInt()
}

public fun NetUserSetInfo(servername: PCWSTR, username: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetUserSetInfo", longArrayOf(servername, username, level.toLong(), buf, parm_err)).toUInt()
}

public fun NetValidateName(lpserver: PCWSTR, lpname: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, nametype: NETSETUP_NAME_TYPE): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetValidateName", longArrayOf(lpserver, lpname, lpaccount, lppassword, nametype.toLong())).toUInt()
}

public fun NetValidatePasswordPolicy(servername: PCWSTR, qualifier: Long, validationtype: NET_VALIDATE_PASSWORD_TYPE, inputarg: Long, outputarg: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetValidatePasswordPolicy", longArrayOf(servername, qualifier, validationtype.toLong(), inputarg, outputarg)).toUInt()
}

public fun NetValidatePasswordPolicyFree(outputarg: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetValidatePasswordPolicyFree", longArrayOf(outputarg)).toUInt()
}

public fun NetWkstaGetInfo(servername: PCWSTR, level: UInt, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetWkstaGetInfo", longArrayOf(servername, level.toLong(), bufptr)).toUInt()
}

public fun NetWkstaSetInfo(servername: PCWSTR, level: UInt, buffer: Long, parm_err: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetWkstaSetInfo", longArrayOf(servername, level.toLong(), buffer, parm_err)).toUInt()
}

public fun NetWkstaTransportAdd(servername: Long, level: UInt, buf: Long, parm_err: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetWkstaTransportAdd", longArrayOf(servername, level.toLong(), buf, parm_err)).toUInt()
}

public fun NetWkstaTransportDel(servername: PCWSTR, transportname: PCWSTR, ucond: FORCE_LEVEL_FLAGS): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetWkstaTransportDel", longArrayOf(servername, transportname, ucond.toLong())).toUInt()
}

public fun NetWkstaTransportEnum(servername: Long, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetWkstaTransportEnum", longArrayOf(servername, level.toLong(), bufptr, prefmaxlen.toLong(), entriesread, totalentries, resume_handle)).toUInt()
}

public fun NetWkstaUserEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetWkstaUserEnum", longArrayOf(servername, level.toLong(), bufptr, prefmaxlen.toLong(), entriesread, totalentries, resumehandle)).toUInt()
}

public fun NetWkstaUserGetInfo(reserved: PCWSTR, level: UInt, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetWkstaUserGetInfo", longArrayOf(reserved, level.toLong(), bufptr)).toUInt()
}

public fun NetWkstaUserSetInfo(reserved: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetWkstaUserSetInfo", longArrayOf(reserved, level.toLong(), buf, parm_err)).toUInt()
}

public fun RouterAssert(pszfailedassertion: PCSTR, pszfilename: PCSTR, dwlinenumber: UInt, pszmessage: PCSTR) {
    Win32DynamicFfi.invoke("rtutils.dll", "RouterAssert", longArrayOf(pszfailedassertion, pszfilename, dwlinenumber.toLong(), pszmessage))
}

public fun RouterGetErrorStringA(dwerrorcode: UInt, lplpszerrorstring: Long): UInt {
    return Win32DynamicFfi.invoke("rtutils.dll", "RouterGetErrorStringA", longArrayOf(dwerrorcode.toLong(), lplpszerrorstring)).toUInt()
}

public fun RouterGetErrorStringW(dwerrorcode: UInt, lplpwszerrorstring: Long): UInt {
    return Win32DynamicFfi.invoke("rtutils.dll", "RouterGetErrorStringW", longArrayOf(dwerrorcode.toLong(), lplpwszerrorstring)).toUInt()
}

public fun RouterLogDeregisterA(hloghandle: HANDLE) {
    Win32DynamicFfi.invoke("rtutils.dll", "RouterLogDeregisterA", longArrayOf(hloghandle))
}

public fun RouterLogDeregisterW(hloghandle: HANDLE) {
    Win32DynamicFfi.invoke("rtutils.dll", "RouterLogDeregisterW", longArrayOf(hloghandle))
}

public fun RouterLogEventA(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt) {
    Win32DynamicFfi.invoke("rtutils.dll", "RouterLogEventA", longArrayOf(hloghandle, dweventtype.toLong(), dwmessageid.toLong(), dwsubstringcount.toLong(), plpszsubstringarray, dwerrorcode.toLong()))
}

public fun RouterLogEventDataA(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwdatabytes: UInt, lpdatabytes: Long) {
    Win32DynamicFfi.invoke("rtutils.dll", "RouterLogEventDataA", longArrayOf(hloghandle, dweventtype.toLong(), dwmessageid.toLong(), dwsubstringcount.toLong(), plpszsubstringarray, dwdatabytes.toLong(), lpdatabytes))
}

public fun RouterLogEventDataW(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwdatabytes: UInt, lpdatabytes: Long) {
    Win32DynamicFfi.invoke("rtutils.dll", "RouterLogEventDataW", longArrayOf(hloghandle, dweventtype.toLong(), dwmessageid.toLong(), dwsubstringcount.toLong(), plpszsubstringarray, dwdatabytes.toLong(), lpdatabytes))
}

public fun RouterLogEventExA(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCSTR, vararg variadicArgs: Long) {
    Win32DynamicFfi.invoke("rtutils.dll", "RouterLogEventExA", longArrayOf(hloghandle, dweventtype.toLong(), dwerrorcode.toLong(), dwmessageid.toLong(), ptszformat) + variadicArgs)
}

public fun RouterLogEventExW(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCWSTR, vararg variadicArgs: Long) {
    Win32DynamicFfi.invoke("rtutils.dll", "RouterLogEventExW", longArrayOf(hloghandle, dweventtype.toLong(), dwerrorcode.toLong(), dwmessageid.toLong(), ptszformat) + variadicArgs)
}

public fun RouterLogEventStringA(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt, dwerrorindex: UInt) {
    Win32DynamicFfi.invoke("rtutils.dll", "RouterLogEventStringA", longArrayOf(hloghandle, dweventtype.toLong(), dwmessageid.toLong(), dwsubstringcount.toLong(), plpszsubstringarray, dwerrorcode.toLong(), dwerrorindex.toLong()))
}

public fun RouterLogEventStringW(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt, dwerrorindex: UInt) {
    Win32DynamicFfi.invoke("rtutils.dll", "RouterLogEventStringW", longArrayOf(hloghandle, dweventtype.toLong(), dwmessageid.toLong(), dwsubstringcount.toLong(), plpszsubstringarray, dwerrorcode.toLong(), dwerrorindex.toLong()))
}

public fun RouterLogEventValistExA(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCSTR, arglist: Long) {
    Win32DynamicFfi.invoke("rtutils.dll", "RouterLogEventValistExA", longArrayOf(hloghandle, dweventtype.toLong(), dwerrorcode.toLong(), dwmessageid.toLong(), ptszformat, arglist))
}

public fun RouterLogEventValistExW(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCWSTR, arglist: Long) {
    Win32DynamicFfi.invoke("rtutils.dll", "RouterLogEventValistExW", longArrayOf(hloghandle, dweventtype.toLong(), dwerrorcode.toLong(), dwmessageid.toLong(), ptszformat, arglist))
}

public fun RouterLogEventW(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt) {
    Win32DynamicFfi.invoke("rtutils.dll", "RouterLogEventW", longArrayOf(hloghandle, dweventtype.toLong(), dwmessageid.toLong(), dwsubstringcount.toLong(), plpszsubstringarray, dwerrorcode.toLong()))
}

public fun RouterLogRegisterA(lpszsource: PCSTR): HANDLE {
    return Win32DynamicFfi.invoke("rtutils.dll", "RouterLogRegisterA", longArrayOf(lpszsource))
}

public fun RouterLogRegisterW(lpszsource: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("rtutils.dll", "RouterLogRegisterW", longArrayOf(lpszsource))
}

public fun SetNetScheduleAccountInformation(pwszservername: PCWSTR, pwszaccount: PCWSTR, pwszpassword: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("mstask.dll", "SetNetScheduleAccountInformation", longArrayOf(pwszservername, pwszaccount, pwszpassword)).toInt()
}

public fun TraceDeregisterA(dwtraceid: UInt): UInt {
    return Win32DynamicFfi.invoke("rtutils.dll", "TraceDeregisterA", longArrayOf(dwtraceid.toLong())).toUInt()
}

public fun TraceDeregisterExA(dwtraceid: UInt, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("rtutils.dll", "TraceDeregisterExA", longArrayOf(dwtraceid.toLong(), dwflags.toLong())).toUInt()
}

public fun TraceDeregisterExW(dwtraceid: UInt, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("rtutils.dll", "TraceDeregisterExW", longArrayOf(dwtraceid.toLong(), dwflags.toLong())).toUInt()
}

public fun TraceDeregisterW(dwtraceid: UInt): UInt {
    return Win32DynamicFfi.invoke("rtutils.dll", "TraceDeregisterW", longArrayOf(dwtraceid.toLong())).toUInt()
}

public fun TraceDumpExA(dwtraceid: UInt, dwflags: UInt, lpbbytes: Long, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: BOOL, lpszprefix: PCSTR): UInt {
    return Win32DynamicFfi.invoke("rtutils.dll", "TraceDumpExA", longArrayOf(dwtraceid.toLong(), dwflags.toLong(), lpbbytes, dwbytecount.toLong(), dwgroupsize.toLong(), baddressprefix.toLong(), lpszprefix)).toUInt()
}

public fun TraceDumpExW(dwtraceid: UInt, dwflags: UInt, lpbbytes: Long, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: BOOL, lpszprefix: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("rtutils.dll", "TraceDumpExW", longArrayOf(dwtraceid.toLong(), dwflags.toLong(), lpbbytes, dwbytecount.toLong(), dwgroupsize.toLong(), baddressprefix.toLong(), lpszprefix)).toUInt()
}

public fun TraceGetConsoleA(dwtraceid: UInt, lphconsole: Long): UInt {
    return Win32DynamicFfi.invoke("rtutils.dll", "TraceGetConsoleA", longArrayOf(dwtraceid.toLong(), lphconsole)).toUInt()
}

public fun TraceGetConsoleW(dwtraceid: UInt, lphconsole: Long): UInt {
    return Win32DynamicFfi.invoke("rtutils.dll", "TraceGetConsoleW", longArrayOf(dwtraceid.toLong(), lphconsole)).toUInt()
}

public fun TracePrintfA(dwtraceid: UInt, lpszformat: PCSTR, vararg variadicArgs: Long): UInt {
    return Win32DynamicFfi.invoke("rtutils.dll", "TracePrintfA", longArrayOf(dwtraceid.toLong(), lpszformat) + variadicArgs).toUInt()
}

public fun TracePrintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: PCSTR, vararg variadicArgs: Long): UInt {
    return Win32DynamicFfi.invoke("rtutils.dll", "TracePrintfExA", longArrayOf(dwtraceid.toLong(), dwflags.toLong(), lpszformat) + variadicArgs).toUInt()
}

public fun TracePrintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: PCWSTR, vararg variadicArgs: Long): UInt {
    return Win32DynamicFfi.invoke("rtutils.dll", "TracePrintfExW", longArrayOf(dwtraceid.toLong(), dwflags.toLong(), lpszformat) + variadicArgs).toUInt()
}

public fun TracePrintfW(dwtraceid: UInt, lpszformat: PCWSTR, vararg variadicArgs: Long): UInt {
    return Win32DynamicFfi.invoke("rtutils.dll", "TracePrintfW", longArrayOf(dwtraceid.toLong(), lpszformat) + variadicArgs).toUInt()
}

public fun TracePutsExA(dwtraceid: UInt, dwflags: UInt, lpszstring: PCSTR): UInt {
    return Win32DynamicFfi.invoke("rtutils.dll", "TracePutsExA", longArrayOf(dwtraceid.toLong(), dwflags.toLong(), lpszstring)).toUInt()
}

public fun TracePutsExW(dwtraceid: UInt, dwflags: UInt, lpszstring: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("rtutils.dll", "TracePutsExW", longArrayOf(dwtraceid.toLong(), dwflags.toLong(), lpszstring)).toUInt()
}

public fun TraceRegisterExA(lpszcallername: PCSTR, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("rtutils.dll", "TraceRegisterExA", longArrayOf(lpszcallername, dwflags.toLong())).toUInt()
}

public fun TraceRegisterExW(lpszcallername: PCWSTR, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("rtutils.dll", "TraceRegisterExW", longArrayOf(lpszcallername, dwflags.toLong())).toUInt()
}

public fun TraceVprintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: PCSTR, arglist: Long): UInt {
    return Win32DynamicFfi.invoke("rtutils.dll", "TraceVprintfExA", longArrayOf(dwtraceid.toLong(), dwflags.toLong(), lpszformat, arglist)).toUInt()
}

public fun TraceVprintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: PCWSTR, arglist: Long): UInt {
    return Win32DynamicFfi.invoke("rtutils.dll", "TraceVprintfExW", longArrayOf(dwtraceid.toLong(), dwflags.toLong(), lpszformat, arglist)).toUInt()
}
