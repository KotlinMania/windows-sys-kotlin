package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

public expect fun GetNetScheduleAccountInformation(pwszservername: PCWSTR, ccaccount: UInt, wszaccount: PWSTR): HRESULT

public expect fun I_NetLogonControl2(servername: PCWSTR, functioncode: UInt, querylevel: UInt, data: Long, buffer: Long): UInt

public expect fun LogErrorA(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long, dwerrorcode: UInt)

public expect fun LogErrorW(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long, dwerrorcode: UInt)

public expect fun LogEventA(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long)

public expect fun LogEventW(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long)

public expect fun MprSetupProtocolEnum(dwtransportid: UInt, lplpbuffer: Long, lpdwentriesread: Long): UInt

public expect fun MprSetupProtocolFree(lpbuffer: Long): UInt

public expect fun NetAccessAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt

public expect fun NetAccessDel(servername: PCWSTR, resource: PCWSTR): UInt

public expect fun NetAccessEnum(servername: PCWSTR, basepath: PCWSTR, recursive: UInt, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt

public expect fun NetAccessGetInfo(servername: PCWSTR, resource: PCWSTR, level: UInt, bufptr: Long): UInt

public expect fun NetAccessGetUserPerms(servername: PCWSTR, ugname: PCWSTR, resource: PCWSTR, perms: Long): UInt

public expect fun NetAccessSetInfo(servername: PCWSTR, resource: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt

public expect fun NetAddAlternateComputerName(server: PCWSTR, alternatename: PCWSTR, domainaccount: PCWSTR, domainaccountpassword: PCWSTR, reserved: UInt): UInt

public expect fun NetAddServiceAccount(servername: PCWSTR, accountname: PCWSTR, password: PCWSTR, flags: UInt): NTSTATUS

public expect fun NetAlertRaise(alerttype: PCWSTR, buffer: Long, buffersize: UInt): UInt

public expect fun NetAlertRaiseEx(alerttype: PCWSTR, variableinfo: Long, variableinfosize: UInt, servicename: PCWSTR): UInt

public expect fun NetApiBufferAllocate(bytecount: UInt, buffer: Long): UInt

public expect fun NetApiBufferFree(buffer: Long): UInt

public expect fun NetApiBufferReallocate(oldbuffer: Long, newbytecount: UInt, newbuffer: Long): UInt

public expect fun NetApiBufferSize(buffer: Long, bytecount: Long): UInt

public expect fun NetAuditClear(server: PCWSTR, backupfile: PCWSTR, service: PCWSTR): UInt

public expect fun NetAuditRead(server: PCWSTR, service: PCWSTR, auditloghandle: Long, offset: UInt, reserved1: Long, reserved2: UInt, offsetflag: UInt, bufptr: Long, prefmaxlen: UInt, bytesread: Long, totalavailable: Long): UInt

public expect fun NetAuditWrite(type: UInt, buf: Long, numbytes: UInt, service: PCWSTR, reserved: Long): UInt

public expect fun NetConfigGet(server: PCWSTR, component: PCWSTR, parameter: PCWSTR, bufptr: Long): UInt

public expect fun NetConfigGetAll(server: PCWSTR, component: PCWSTR, bufptr: Long): UInt

public expect fun NetConfigSet(server: PCWSTR, reserved1: PCWSTR, component: PCWSTR, level: UInt, reserved2: UInt, buf: Long, reserved3: UInt): UInt

public expect fun NetCreateProvisioningPackage(pprovisioningparams: Long, pppackagebindata: Long, pdwpackagebindatasize: Long, pppackagetextdata: Long): UInt

public expect fun NetEnumerateComputerNames(server: PCWSTR, nametype: NET_COMPUTER_NAME_TYPE, reserved: UInt, entrycount: Long, computernames: Long): UInt

public expect fun NetEnumerateServiceAccounts(servername: PCWSTR, flags: UInt, accountscount: Long, accounts: Long): NTSTATUS

public expect fun NetErrorLogClear(uncservername: PCWSTR, backupfile: PCWSTR, reserved: Long): UInt

public expect fun NetErrorLogRead(uncservername: PCWSTR, reserved1: PCWSTR, errorloghandle: Long, offset: UInt, reserved2: Long, reserved3: UInt, offsetflag: UInt, bufptr: Long, prefmaxsize: UInt, bytesread: Long, totalavailable: Long): UInt

public expect fun NetErrorLogWrite(reserved1: Long, code: UInt, component: PCWSTR, buffer: Long, numbytes: UInt, msgbuf: Long, strcount: UInt, reserved2: Long): UInt

public expect fun NetFreeAadJoinInformation(pjoininfo: Long)

public expect fun NetGetAadJoinInformation(pcsztenantid: PCWSTR, ppjoininfo: Long): HRESULT

public expect fun NetGetAnyDCName(servername: PCWSTR, domainname: PCWSTR, buffer: Long): UInt

public expect fun NetGetDCName(servername: PCWSTR, domainname: PCWSTR, buffer: Long): UInt

public expect fun NetGetDisplayInformationIndex(servername: PCWSTR, level: UInt, prefix: PCWSTR, index: Long): UInt

public expect fun NetGetJoinInformation(lpserver: PCWSTR, lpnamebuffer: Long, buffertype: Long): UInt

public expect fun NetGetJoinableOUs(lpserver: PCWSTR, lpdomain: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, oucount: Long, ous: Long): UInt

public expect fun NetGroupAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt

public expect fun NetGroupAddUser(servername: PCWSTR, groupname: PCWSTR, username: PCWSTR): UInt

public expect fun NetGroupDel(servername: PCWSTR, groupname: PCWSTR): UInt

public expect fun NetGroupDelUser(servername: PCWSTR, groupname: PCWSTR, username: PCWSTR): UInt

public expect fun NetGroupEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt

public expect fun NetGroupGetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, bufptr: Long): UInt

public expect fun NetGroupGetUsers(servername: PCWSTR, groupname: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt

public expect fun NetGroupSetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt

public expect fun NetGroupSetUsers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt

public expect fun NetIsServiceAccount(servername: PCWSTR, accountname: PCWSTR, isservice: Long): NTSTATUS

public expect fun NetJoinDomain(lpserver: PCWSTR, lpdomain: PCWSTR, lpmachineaccountou: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, fjoinoptions: NET_JOIN_DOMAIN_JOIN_OPTIONS): UInt

public expect fun NetLocalGroupAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt

public expect fun NetLocalGroupAddMember(servername: PCWSTR, groupname: PCWSTR, membersid: PSID): UInt

public expect fun NetLocalGroupAddMembers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt

public expect fun NetLocalGroupDel(servername: PCWSTR, groupname: PCWSTR): UInt

public expect fun NetLocalGroupDelMember(servername: PCWSTR, groupname: PCWSTR, membersid: PSID): UInt

public expect fun NetLocalGroupDelMembers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt

public expect fun NetLocalGroupEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt

public expect fun NetLocalGroupGetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, bufptr: Long): UInt

public expect fun NetLocalGroupGetMembers(servername: PCWSTR, localgroupname: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt

public expect fun NetLocalGroupSetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt

public expect fun NetLocalGroupSetMembers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt

public expect fun NetMessageBufferSend(servername: PCWSTR, msgname: PCWSTR, fromname: PCWSTR, buf: Long, buflen: UInt): UInt

public expect fun NetMessageNameAdd(servername: PCWSTR, msgname: PCWSTR): UInt

public expect fun NetMessageNameDel(servername: PCWSTR, msgname: PCWSTR): UInt

public expect fun NetMessageNameEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt

public expect fun NetMessageNameGetInfo(servername: PCWSTR, msgname: PCWSTR, level: UInt, bufptr: Long): UInt

public expect fun NetProvisionComputerAccount(lpdomain: PCWSTR, lpmachinename: PCWSTR, lpmachineaccountou: PCWSTR, lpdcname: PCWSTR, dwoptions: NETSETUP_PROVISION, pprovisionbindata: Long, pdwprovisionbindatasize: Long, pprovisiontextdata: Long): UInt

public expect fun NetQueryDisplayInformation(servername: PCWSTR, level: UInt, index: UInt, entriesrequested: UInt, preferredmaximumlength: UInt, returnedentrycount: Long, sortedbuffer: Long): UInt

public expect fun NetQueryServiceAccount(servername: PCWSTR, accountname: PCWSTR, infolevel: UInt, buffer: Long): NTSTATUS

public expect fun NetRemoteComputerSupports(uncservername: PCWSTR, optionswanted: NET_REMOTE_COMPUTER_SUPPORTS_OPTIONS, optionssupported: Long): UInt

public expect fun NetRemoteTOD(uncservername: PCWSTR, bufferptr: Long): UInt

public expect fun NetRemoveAlternateComputerName(server: PCWSTR, alternatename: PCWSTR, domainaccount: PCWSTR, domainaccountpassword: PCWSTR, reserved: UInt): UInt

public expect fun NetRemoveServiceAccount(servername: PCWSTR, accountname: PCWSTR, flags: UInt): NTSTATUS

public expect fun NetRenameMachineInDomain(lpserver: PCWSTR, lpnewmachinename: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, frenameoptions: UInt): UInt

public expect fun NetReplExportDirAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt

public expect fun NetReplExportDirDel(servername: PCWSTR, dirname: PCWSTR): UInt

public expect fun NetReplExportDirEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt

public expect fun NetReplExportDirGetInfo(servername: PCWSTR, dirname: PCWSTR, level: UInt, bufptr: Long): UInt

public expect fun NetReplExportDirLock(servername: PCWSTR, dirname: PCWSTR): UInt

public expect fun NetReplExportDirSetInfo(servername: PCWSTR, dirname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt

public expect fun NetReplExportDirUnlock(servername: PCWSTR, dirname: PCWSTR, unlockforce: UInt): UInt

public expect fun NetReplGetInfo(servername: PCWSTR, level: UInt, bufptr: Long): UInt

public expect fun NetReplImportDirAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt

public expect fun NetReplImportDirDel(servername: PCWSTR, dirname: PCWSTR): UInt

public expect fun NetReplImportDirEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt

public expect fun NetReplImportDirGetInfo(servername: PCWSTR, dirname: PCWSTR, level: UInt, bufptr: Long): UInt

public expect fun NetReplImportDirLock(servername: PCWSTR, dirname: PCWSTR): UInt

public expect fun NetReplImportDirUnlock(servername: PCWSTR, dirname: PCWSTR, unlockforce: UInt): UInt

public expect fun NetReplSetInfo(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt

public expect fun NetRequestOfflineDomainJoin(pprovisionbindata: Long, cbprovisionbindatasize: UInt, dwoptions: NET_REQUEST_PROVISION_OPTIONS, lpwindowspath: PCWSTR): UInt

public expect fun NetRequestProvisioningPackageInstall(ppackagebindata: Long, dwpackagebindatasize: UInt, dwprovisionoptions: NET_REQUEST_PROVISION_OPTIONS, lpwindowspath: PCWSTR, pvreserved: Long): UInt

public expect fun NetScheduleJobAdd(servername: PCWSTR, buffer: Long, jobid: Long): UInt

public expect fun NetScheduleJobDel(servername: PCWSTR, minjobid: UInt, maxjobid: UInt): UInt

public expect fun NetScheduleJobEnum(servername: PCWSTR, pointertobuffer: Long, prefferedmaximumlength: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt

public expect fun NetScheduleJobGetInfo(servername: PCWSTR, jobid: UInt, pointertobuffer: Long): UInt

public expect fun NetServerComputerNameAdd(servername: PCWSTR, emulateddomainname: PCWSTR, emulatedservername: PCWSTR): UInt

public expect fun NetServerComputerNameDel(servername: PCWSTR, emulatedservername: PCWSTR): UInt

public expect fun NetServerDiskEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt

public expect fun NetServerEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, servertype: NET_SERVER_TYPE, domain: PCWSTR, resume_handle: Long): UInt

public expect fun NetServerGetInfo(servername: PCWSTR, level: UInt, bufptr: Long): UInt

public expect fun NetServerSetInfo(servername: PCWSTR, level: UInt, buf: Long, parmerror: Long): UInt

public expect fun NetServerTransportAdd(servername: PCWSTR, level: UInt, bufptr: Long): UInt

public expect fun NetServerTransportAddEx(servername: PCWSTR, level: UInt, bufptr: Long): UInt

public expect fun NetServerTransportDel(servername: PCWSTR, level: UInt, bufptr: Long): UInt

public expect fun NetServerTransportEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt

public expect fun NetServiceControl(servername: PCWSTR, service: PCWSTR, opcode: UInt, arg: UInt, bufptr: Long): UInt

public expect fun NetServiceEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt

public expect fun NetServiceGetInfo(servername: PCWSTR, service: PCWSTR, level: UInt, bufptr: Long): UInt

public expect fun NetServiceInstall(servername: PCWSTR, service: PCWSTR, argc: UInt, argv: Long, bufptr: Long): UInt

public expect fun NetSetPrimaryComputerName(server: PCWSTR, primaryname: PCWSTR, domainaccount: PCWSTR, domainaccountpassword: PCWSTR, reserved: UInt): UInt

public expect fun NetUnjoinDomain(lpserver: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, funjoinoptions: UInt): UInt

public expect fun NetUseAdd(servername: Long, levelflags: UInt, buf: Long, parm_err: Long): UInt

public expect fun NetUseDel(uncservername: PCWSTR, usename: PCWSTR, forcelevelflags: FORCE_LEVEL_FLAGS): UInt

public expect fun NetUseEnum(uncservername: PCWSTR, levelflags: UInt, bufptr: Long, preferedmaximumsize: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt

public expect fun NetUseGetInfo(uncservername: PCWSTR, usename: PCWSTR, levelflags: UInt, bufptr: Long): UInt

public expect fun NetUserAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt

public expect fun NetUserChangePassword(domainname: PCWSTR, username: PCWSTR, oldpassword: PCWSTR, newpassword: PCWSTR): UInt

public expect fun NetUserDel(servername: PCWSTR, username: PCWSTR): UInt

public expect fun NetUserEnum(servername: PCWSTR, level: UInt, filter: NET_USER_ENUM_FILTER_FLAGS, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt

public expect fun NetUserGetGroups(servername: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long): UInt

public expect fun NetUserGetInfo(servername: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long): UInt

public expect fun NetUserGetLocalGroups(servername: PCWSTR, username: PCWSTR, level: UInt, flags: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long): UInt

public expect fun NetUserModalsGet(servername: PCWSTR, level: UInt, bufptr: Long): UInt

public expect fun NetUserModalsSet(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt

public expect fun NetUserSetGroups(servername: PCWSTR, username: PCWSTR, level: UInt, buf: Long, num_entries: UInt): UInt

public expect fun NetUserSetInfo(servername: PCWSTR, username: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt

public expect fun NetValidateName(lpserver: PCWSTR, lpname: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, nametype: NETSETUP_NAME_TYPE): UInt

public expect fun NetValidatePasswordPolicy(servername: PCWSTR, qualifier: Long, validationtype: NET_VALIDATE_PASSWORD_TYPE, inputarg: Long, outputarg: Long): UInt

public expect fun NetValidatePasswordPolicyFree(outputarg: Long): UInt

public expect fun NetWkstaGetInfo(servername: PCWSTR, level: UInt, bufptr: Long): UInt

public expect fun NetWkstaSetInfo(servername: PCWSTR, level: UInt, buffer: Long, parm_err: Long): UInt

public expect fun NetWkstaTransportAdd(servername: Long, level: UInt, buf: Long, parm_err: Long): UInt

public expect fun NetWkstaTransportDel(servername: PCWSTR, transportname: PCWSTR, ucond: FORCE_LEVEL_FLAGS): UInt

public expect fun NetWkstaTransportEnum(servername: Long, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt

public expect fun NetWkstaUserEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt

public expect fun NetWkstaUserGetInfo(reserved: PCWSTR, level: UInt, bufptr: Long): UInt

public expect fun NetWkstaUserSetInfo(reserved: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt

public expect fun RouterAssert(pszfailedassertion: PCSTR, pszfilename: PCSTR, dwlinenumber: UInt, pszmessage: PCSTR)

public expect fun RouterGetErrorStringA(dwerrorcode: UInt, lplpszerrorstring: Long): UInt

public expect fun RouterGetErrorStringW(dwerrorcode: UInt, lplpwszerrorstring: Long): UInt

public expect fun RouterLogDeregisterA(hloghandle: HANDLE)

public expect fun RouterLogDeregisterW(hloghandle: HANDLE)

public expect fun RouterLogEventA(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt)

public expect fun RouterLogEventDataA(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwdatabytes: UInt, lpdatabytes: Long)

public expect fun RouterLogEventDataW(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwdatabytes: UInt, lpdatabytes: Long)

public expect fun RouterLogEventExA(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCSTR, vararg variadicArgs: Long)

public expect fun RouterLogEventExW(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCWSTR, vararg variadicArgs: Long)

public expect fun RouterLogEventStringA(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt, dwerrorindex: UInt)

public expect fun RouterLogEventStringW(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt, dwerrorindex: UInt)

public expect fun RouterLogEventValistExA(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCSTR, arglist: Long)

public expect fun RouterLogEventValistExW(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCWSTR, arglist: Long)

public expect fun RouterLogEventW(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt)

public expect fun RouterLogRegisterA(lpszsource: PCSTR): HANDLE

public expect fun RouterLogRegisterW(lpszsource: PCWSTR): HANDLE

public expect fun SetNetScheduleAccountInformation(pwszservername: PCWSTR, pwszaccount: PCWSTR, pwszpassword: PCWSTR): HRESULT

public expect fun TraceDeregisterA(dwtraceid: UInt): UInt

public expect fun TraceDeregisterExA(dwtraceid: UInt, dwflags: UInt): UInt

public expect fun TraceDeregisterExW(dwtraceid: UInt, dwflags: UInt): UInt

public expect fun TraceDeregisterW(dwtraceid: UInt): UInt

public expect fun TraceDumpExA(dwtraceid: UInt, dwflags: UInt, lpbbytes: Long, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: BOOL, lpszprefix: PCSTR): UInt

public expect fun TraceDumpExW(dwtraceid: UInt, dwflags: UInt, lpbbytes: Long, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: BOOL, lpszprefix: PCWSTR): UInt

public expect fun TraceGetConsoleA(dwtraceid: UInt, lphconsole: Long): UInt

public expect fun TraceGetConsoleW(dwtraceid: UInt, lphconsole: Long): UInt

public expect fun TracePrintfA(dwtraceid: UInt, lpszformat: PCSTR, vararg variadicArgs: Long): UInt

public expect fun TracePrintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: PCSTR, vararg variadicArgs: Long): UInt

public expect fun TracePrintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: PCWSTR, vararg variadicArgs: Long): UInt

public expect fun TracePrintfW(dwtraceid: UInt, lpszformat: PCWSTR, vararg variadicArgs: Long): UInt

public expect fun TracePutsExA(dwtraceid: UInt, dwflags: UInt, lpszstring: PCSTR): UInt

public expect fun TracePutsExW(dwtraceid: UInt, dwflags: UInt, lpszstring: PCWSTR): UInt

public expect fun TraceRegisterExA(lpszcallername: PCSTR, dwflags: UInt): UInt

public expect fun TraceRegisterExW(lpszcallername: PCWSTR, dwflags: UInt): UInt

public expect fun TraceVprintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: PCSTR, arglist: Long): UInt

public expect fun TraceVprintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: PCWSTR, arglist: Long): UInt
