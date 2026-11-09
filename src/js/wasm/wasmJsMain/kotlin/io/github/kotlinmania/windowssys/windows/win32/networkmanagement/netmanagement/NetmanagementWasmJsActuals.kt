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

public actual fun GetNetScheduleAccountInformation(pwszservername: PCWSTR, ccaccount: UInt, wszaccount: PWSTR): HRESULT =
    0

public actual fun I_NetLogonControl2(servername: PCWSTR, functioncode: UInt, querylevel: UInt, data: Long, buffer: Long): UInt =
    0u

public actual fun LogErrorA(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long, dwerrorcode: UInt) {
}

public actual fun LogErrorW(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long, dwerrorcode: UInt) {
}

public actual fun LogEventA(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long) {
}

public actual fun LogEventW(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long) {
}

public actual fun MprSetupProtocolEnum(dwtransportid: UInt, lplpbuffer: Long, lpdwentriesread: Long): UInt =
    0u

public actual fun MprSetupProtocolFree(lpbuffer: Long): UInt =
    0u

public actual fun NetAccessAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    0u

public actual fun NetAccessDel(servername: PCWSTR, resource: PCWSTR): UInt =
    0u

public actual fun NetAccessEnum(servername: PCWSTR, basepath: PCWSTR, recursive: UInt, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    0u

public actual fun NetAccessGetInfo(servername: PCWSTR, resource: PCWSTR, level: UInt, bufptr: Long): UInt =
    0u

public actual fun NetAccessGetUserPerms(servername: PCWSTR, ugname: PCWSTR, resource: PCWSTR, perms: Long): UInt =
    0u

public actual fun NetAccessSetInfo(servername: PCWSTR, resource: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    0u

public actual fun NetAddAlternateComputerName(server: PCWSTR, alternatename: PCWSTR, domainaccount: PCWSTR, domainaccountpassword: PCWSTR, reserved: UInt): UInt =
    0u

public actual fun NetAddServiceAccount(servername: PCWSTR, accountname: PCWSTR, password: PCWSTR, flags: UInt): NTSTATUS =
    0

public actual fun NetAlertRaise(alerttype: PCWSTR, buffer: Long, buffersize: UInt): UInt =
    0u

public actual fun NetAlertRaiseEx(alerttype: PCWSTR, variableinfo: Long, variableinfosize: UInt, servicename: PCWSTR): UInt =
    0u

public actual fun NetApiBufferAllocate(bytecount: UInt, buffer: Long): UInt =
    0u

public actual fun NetApiBufferFree(buffer: Long): UInt =
    0u

public actual fun NetApiBufferReallocate(oldbuffer: Long, newbytecount: UInt, newbuffer: Long): UInt =
    0u

public actual fun NetApiBufferSize(buffer: Long, bytecount: Long): UInt =
    0u

public actual fun NetAuditClear(server: PCWSTR, backupfile: PCWSTR, service: PCWSTR): UInt =
    0u

public actual fun NetAuditRead(server: PCWSTR, service: PCWSTR, auditloghandle: Long, offset: UInt, reserved1: Long, reserved2: UInt, offsetflag: UInt, bufptr: Long, prefmaxlen: UInt, bytesread: Long, totalavailable: Long): UInt =
    0u

public actual fun NetAuditWrite(type: UInt, buf: Long, numbytes: UInt, service: PCWSTR, reserved: Long): UInt =
    0u

public actual fun NetConfigGet(server: PCWSTR, component: PCWSTR, parameter: PCWSTR, bufptr: Long): UInt =
    0u

public actual fun NetConfigGetAll(server: PCWSTR, component: PCWSTR, bufptr: Long): UInt =
    0u

public actual fun NetConfigSet(server: PCWSTR, reserved1: PCWSTR, component: PCWSTR, level: UInt, reserved2: UInt, buf: Long, reserved3: UInt): UInt =
    0u

public actual fun NetCreateProvisioningPackage(pprovisioningparams: Long, pppackagebindata: Long, pdwpackagebindatasize: Long, pppackagetextdata: Long): UInt =
    0u

public actual fun NetEnumerateComputerNames(server: PCWSTR, nametype: NET_COMPUTER_NAME_TYPE, reserved: UInt, entrycount: Long, computernames: Long): UInt =
    0u

public actual fun NetEnumerateServiceAccounts(servername: PCWSTR, flags: UInt, accountscount: Long, accounts: Long): NTSTATUS =
    0

public actual fun NetErrorLogClear(uncservername: PCWSTR, backupfile: PCWSTR, reserved: Long): UInt =
    0u

public actual fun NetErrorLogRead(uncservername: PCWSTR, reserved1: PCWSTR, errorloghandle: Long, offset: UInt, reserved2: Long, reserved3: UInt, offsetflag: UInt, bufptr: Long, prefmaxsize: UInt, bytesread: Long, totalavailable: Long): UInt =
    0u

public actual fun NetErrorLogWrite(reserved1: Long, code: UInt, component: PCWSTR, buffer: Long, numbytes: UInt, msgbuf: Long, strcount: UInt, reserved2: Long): UInt =
    0u

public actual fun NetFreeAadJoinInformation(pjoininfo: Long) {
}

public actual fun NetGetAadJoinInformation(pcsztenantid: PCWSTR, ppjoininfo: Long): HRESULT =
    0

public actual fun NetGetAnyDCName(servername: PCWSTR, domainname: PCWSTR, buffer: Long): UInt =
    0u

public actual fun NetGetDCName(servername: PCWSTR, domainname: PCWSTR, buffer: Long): UInt =
    0u

public actual fun NetGetDisplayInformationIndex(servername: PCWSTR, level: UInt, prefix: PCWSTR, index: Long): UInt =
    0u

public actual fun NetGetJoinInformation(lpserver: PCWSTR, lpnamebuffer: Long, buffertype: Long): UInt =
    0u

public actual fun NetGetJoinableOUs(lpserver: PCWSTR, lpdomain: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, oucount: Long, ous: Long): UInt =
    0u

public actual fun NetGroupAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    0u

public actual fun NetGroupAddUser(servername: PCWSTR, groupname: PCWSTR, username: PCWSTR): UInt =
    0u

public actual fun NetGroupDel(servername: PCWSTR, groupname: PCWSTR): UInt =
    0u

public actual fun NetGroupDelUser(servername: PCWSTR, groupname: PCWSTR, username: PCWSTR): UInt =
    0u

public actual fun NetGroupEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    0u

public actual fun NetGroupGetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, bufptr: Long): UInt =
    0u

public actual fun NetGroupGetUsers(servername: PCWSTR, groupname: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    0u

public actual fun NetGroupSetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    0u

public actual fun NetGroupSetUsers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt =
    0u

public actual fun NetIsServiceAccount(servername: PCWSTR, accountname: PCWSTR, isservice: Long): NTSTATUS =
    0

public actual fun NetJoinDomain(lpserver: PCWSTR, lpdomain: PCWSTR, lpmachineaccountou: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, fjoinoptions: NET_JOIN_DOMAIN_JOIN_OPTIONS): UInt =
    0u

public actual fun NetLocalGroupAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    0u

public actual fun NetLocalGroupAddMember(servername: PCWSTR, groupname: PCWSTR, membersid: PSID): UInt =
    0u

public actual fun NetLocalGroupAddMembers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt =
    0u

public actual fun NetLocalGroupDel(servername: PCWSTR, groupname: PCWSTR): UInt =
    0u

public actual fun NetLocalGroupDelMember(servername: PCWSTR, groupname: PCWSTR, membersid: PSID): UInt =
    0u

public actual fun NetLocalGroupDelMembers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt =
    0u

public actual fun NetLocalGroupEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    0u

public actual fun NetLocalGroupGetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, bufptr: Long): UInt =
    0u

public actual fun NetLocalGroupGetMembers(servername: PCWSTR, localgroupname: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    0u

public actual fun NetLocalGroupSetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    0u

public actual fun NetLocalGroupSetMembers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt =
    0u

public actual fun NetMessageBufferSend(servername: PCWSTR, msgname: PCWSTR, fromname: PCWSTR, buf: Long, buflen: UInt): UInt =
    0u

public actual fun NetMessageNameAdd(servername: PCWSTR, msgname: PCWSTR): UInt =
    0u

public actual fun NetMessageNameDel(servername: PCWSTR, msgname: PCWSTR): UInt =
    0u

public actual fun NetMessageNameEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    0u

public actual fun NetMessageNameGetInfo(servername: PCWSTR, msgname: PCWSTR, level: UInt, bufptr: Long): UInt =
    0u

public actual fun NetProvisionComputerAccount(lpdomain: PCWSTR, lpmachinename: PCWSTR, lpmachineaccountou: PCWSTR, lpdcname: PCWSTR, dwoptions: NETSETUP_PROVISION, pprovisionbindata: Long, pdwprovisionbindatasize: Long, pprovisiontextdata: Long): UInt =
    0u

public actual fun NetQueryDisplayInformation(servername: PCWSTR, level: UInt, index: UInt, entriesrequested: UInt, preferredmaximumlength: UInt, returnedentrycount: Long, sortedbuffer: Long): UInt =
    0u

public actual fun NetQueryServiceAccount(servername: PCWSTR, accountname: PCWSTR, infolevel: UInt, buffer: Long): NTSTATUS =
    0

public actual fun NetRemoteComputerSupports(uncservername: PCWSTR, optionswanted: NET_REMOTE_COMPUTER_SUPPORTS_OPTIONS, optionssupported: Long): UInt =
    0u

public actual fun NetRemoteTOD(uncservername: PCWSTR, bufferptr: Long): UInt =
    0u

public actual fun NetRemoveAlternateComputerName(server: PCWSTR, alternatename: PCWSTR, domainaccount: PCWSTR, domainaccountpassword: PCWSTR, reserved: UInt): UInt =
    0u

public actual fun NetRemoveServiceAccount(servername: PCWSTR, accountname: PCWSTR, flags: UInt): NTSTATUS =
    0

public actual fun NetRenameMachineInDomain(lpserver: PCWSTR, lpnewmachinename: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, frenameoptions: UInt): UInt =
    0u

public actual fun NetReplExportDirAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    0u

public actual fun NetReplExportDirDel(servername: PCWSTR, dirname: PCWSTR): UInt =
    0u

public actual fun NetReplExportDirEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    0u

public actual fun NetReplExportDirGetInfo(servername: PCWSTR, dirname: PCWSTR, level: UInt, bufptr: Long): UInt =
    0u

public actual fun NetReplExportDirLock(servername: PCWSTR, dirname: PCWSTR): UInt =
    0u

public actual fun NetReplExportDirSetInfo(servername: PCWSTR, dirname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    0u

public actual fun NetReplExportDirUnlock(servername: PCWSTR, dirname: PCWSTR, unlockforce: UInt): UInt =
    0u

public actual fun NetReplGetInfo(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    0u

public actual fun NetReplImportDirAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    0u

public actual fun NetReplImportDirDel(servername: PCWSTR, dirname: PCWSTR): UInt =
    0u

public actual fun NetReplImportDirEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    0u

public actual fun NetReplImportDirGetInfo(servername: PCWSTR, dirname: PCWSTR, level: UInt, bufptr: Long): UInt =
    0u

public actual fun NetReplImportDirLock(servername: PCWSTR, dirname: PCWSTR): UInt =
    0u

public actual fun NetReplImportDirUnlock(servername: PCWSTR, dirname: PCWSTR, unlockforce: UInt): UInt =
    0u

public actual fun NetReplSetInfo(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    0u

public actual fun NetRequestOfflineDomainJoin(pprovisionbindata: Long, cbprovisionbindatasize: UInt, dwoptions: NET_REQUEST_PROVISION_OPTIONS, lpwindowspath: PCWSTR): UInt =
    0u

public actual fun NetRequestProvisioningPackageInstall(ppackagebindata: Long, dwpackagebindatasize: UInt, dwprovisionoptions: NET_REQUEST_PROVISION_OPTIONS, lpwindowspath: PCWSTR, pvreserved: Long): UInt =
    0u

public actual fun NetScheduleJobAdd(servername: PCWSTR, buffer: Long, jobid: Long): UInt =
    0u

public actual fun NetScheduleJobDel(servername: PCWSTR, minjobid: UInt, maxjobid: UInt): UInt =
    0u

public actual fun NetScheduleJobEnum(servername: PCWSTR, pointertobuffer: Long, prefferedmaximumlength: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    0u

public actual fun NetScheduleJobGetInfo(servername: PCWSTR, jobid: UInt, pointertobuffer: Long): UInt =
    0u

public actual fun NetServerComputerNameAdd(servername: PCWSTR, emulateddomainname: PCWSTR, emulatedservername: PCWSTR): UInt =
    0u

public actual fun NetServerComputerNameDel(servername: PCWSTR, emulatedservername: PCWSTR): UInt =
    0u

public actual fun NetServerDiskEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    0u

public actual fun NetServerEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, servertype: NET_SERVER_TYPE, domain: PCWSTR, resume_handle: Long): UInt =
    0u

public actual fun NetServerGetInfo(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    0u

public actual fun NetServerSetInfo(servername: PCWSTR, level: UInt, buf: Long, parmerror: Long): UInt =
    0u

public actual fun NetServerTransportAdd(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    0u

public actual fun NetServerTransportAddEx(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    0u

public actual fun NetServerTransportDel(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    0u

public actual fun NetServerTransportEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    0u

public actual fun NetServiceControl(servername: PCWSTR, service: PCWSTR, opcode: UInt, arg: UInt, bufptr: Long): UInt =
    0u

public actual fun NetServiceEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    0u

public actual fun NetServiceGetInfo(servername: PCWSTR, service: PCWSTR, level: UInt, bufptr: Long): UInt =
    0u

public actual fun NetServiceInstall(servername: PCWSTR, service: PCWSTR, argc: UInt, argv: Long, bufptr: Long): UInt =
    0u

public actual fun NetSetPrimaryComputerName(server: PCWSTR, primaryname: PCWSTR, domainaccount: PCWSTR, domainaccountpassword: PCWSTR, reserved: UInt): UInt =
    0u

public actual fun NetUnjoinDomain(lpserver: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, funjoinoptions: UInt): UInt =
    0u

public actual fun NetUseAdd(servername: Long, levelflags: UInt, buf: Long, parm_err: Long): UInt =
    0u

public actual fun NetUseDel(uncservername: PCWSTR, usename: PCWSTR, forcelevelflags: FORCE_LEVEL_FLAGS): UInt =
    0u

public actual fun NetUseEnum(uncservername: PCWSTR, levelflags: UInt, bufptr: Long, preferedmaximumsize: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    0u

public actual fun NetUseGetInfo(uncservername: PCWSTR, usename: PCWSTR, levelflags: UInt, bufptr: Long): UInt =
    0u

public actual fun NetUserAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    0u

public actual fun NetUserChangePassword(domainname: PCWSTR, username: PCWSTR, oldpassword: PCWSTR, newpassword: PCWSTR): UInt =
    0u

public actual fun NetUserDel(servername: PCWSTR, username: PCWSTR): UInt =
    0u

public actual fun NetUserEnum(servername: PCWSTR, level: UInt, filter: NET_USER_ENUM_FILTER_FLAGS, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    0u

public actual fun NetUserGetGroups(servername: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long): UInt =
    0u

public actual fun NetUserGetInfo(servername: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long): UInt =
    0u

public actual fun NetUserGetLocalGroups(servername: PCWSTR, username: PCWSTR, level: UInt, flags: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long): UInt =
    0u

public actual fun NetUserModalsGet(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    0u

public actual fun NetUserModalsSet(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    0u

public actual fun NetUserSetGroups(servername: PCWSTR, username: PCWSTR, level: UInt, buf: Long, num_entries: UInt): UInt =
    0u

public actual fun NetUserSetInfo(servername: PCWSTR, username: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    0u

public actual fun NetValidateName(lpserver: PCWSTR, lpname: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, nametype: NETSETUP_NAME_TYPE): UInt =
    0u

public actual fun NetValidatePasswordPolicy(servername: PCWSTR, qualifier: Long, validationtype: NET_VALIDATE_PASSWORD_TYPE, inputarg: Long, outputarg: Long): UInt =
    0u

public actual fun NetValidatePasswordPolicyFree(outputarg: Long): UInt =
    0u

public actual fun NetWkstaGetInfo(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    0u

public actual fun NetWkstaSetInfo(servername: PCWSTR, level: UInt, buffer: Long, parm_err: Long): UInt =
    0u

public actual fun NetWkstaTransportAdd(servername: Long, level: UInt, buf: Long, parm_err: Long): UInt =
    0u

public actual fun NetWkstaTransportDel(servername: PCWSTR, transportname: PCWSTR, ucond: FORCE_LEVEL_FLAGS): UInt =
    0u

public actual fun NetWkstaTransportEnum(servername: Long, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    0u

public actual fun NetWkstaUserEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    0u

public actual fun NetWkstaUserGetInfo(reserved: PCWSTR, level: UInt, bufptr: Long): UInt =
    0u

public actual fun NetWkstaUserSetInfo(reserved: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    0u

public actual fun RouterAssert(pszfailedassertion: PCSTR, pszfilename: PCSTR, dwlinenumber: UInt, pszmessage: PCSTR) {
}

public actual fun RouterGetErrorStringA(dwerrorcode: UInt, lplpszerrorstring: Long): UInt =
    0u

public actual fun RouterGetErrorStringW(dwerrorcode: UInt, lplpwszerrorstring: Long): UInt =
    0u

public actual fun RouterLogDeregisterA(hloghandle: HANDLE) {
}

public actual fun RouterLogDeregisterW(hloghandle: HANDLE) {
}

public actual fun RouterLogEventA(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt) {
}

public actual fun RouterLogEventDataA(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwdatabytes: UInt, lpdatabytes: Long) {
}

public actual fun RouterLogEventDataW(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwdatabytes: UInt, lpdatabytes: Long) {
}

public actual fun RouterLogEventExA(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCSTR) {
}

public actual fun RouterLogEventExW(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCWSTR) {
}

public actual fun RouterLogEventStringA(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt, dwerrorindex: UInt) {
}

public actual fun RouterLogEventStringW(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt, dwerrorindex: UInt) {
}

public actual fun RouterLogEventValistExA(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCSTR, arglist: Long) {
}

public actual fun RouterLogEventValistExW(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCWSTR, arglist: Long) {
}

public actual fun RouterLogEventW(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt) {
}

public actual fun RouterLogRegisterA(lpszsource: PCSTR): HANDLE =
    0L

public actual fun RouterLogRegisterW(lpszsource: PCWSTR): HANDLE =
    0L

public actual fun SetNetScheduleAccountInformation(pwszservername: PCWSTR, pwszaccount: PCWSTR, pwszpassword: PCWSTR): HRESULT =
    0

public actual fun TraceDeregisterA(dwtraceid: UInt): UInt =
    0u

public actual fun TraceDeregisterExA(dwtraceid: UInt, dwflags: UInt): UInt =
    0u

public actual fun TraceDeregisterExW(dwtraceid: UInt, dwflags: UInt): UInt =
    0u

public actual fun TraceDeregisterW(dwtraceid: UInt): UInt =
    0u

public actual fun TraceDumpExA(dwtraceid: UInt, dwflags: UInt, lpbbytes: Long, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: BOOL, lpszprefix: PCSTR): UInt =
    0u

public actual fun TraceDumpExW(dwtraceid: UInt, dwflags: UInt, lpbbytes: Long, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: BOOL, lpszprefix: PCWSTR): UInt =
    0u

public actual fun TraceGetConsoleA(dwtraceid: UInt, lphconsole: Long): UInt =
    0u

public actual fun TraceGetConsoleW(dwtraceid: UInt, lphconsole: Long): UInt =
    0u

public actual fun TracePrintfA(dwtraceid: UInt, lpszformat: PCSTR): UInt =
    0u

public actual fun TracePrintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: PCSTR): UInt =
    0u

public actual fun TracePrintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: PCWSTR): UInt =
    0u

public actual fun TracePrintfW(dwtraceid: UInt, lpszformat: PCWSTR): UInt =
    0u

public actual fun TracePutsExA(dwtraceid: UInt, dwflags: UInt, lpszstring: PCSTR): UInt =
    0u

public actual fun TracePutsExW(dwtraceid: UInt, dwflags: UInt, lpszstring: PCWSTR): UInt =
    0u

public actual fun TraceRegisterExA(lpszcallername: PCSTR, dwflags: UInt): UInt =
    0u

public actual fun TraceRegisterExW(lpszcallername: PCWSTR, dwflags: UInt): UInt =
    0u

public actual fun TraceVprintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: PCSTR, arglist: Long): UInt =
    0u

public actual fun TraceVprintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: PCWSTR, arglist: Long): UInt =
    0u
