package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

public expect fun getNetScheduleAccountInformation(pwszservername: Pcwstr, ccaccount: UInt, wszaccount: Pwstr): Hresult

public expect fun iNetLogonControl2(servername: Pcwstr, functioncode: UInt, querylevel: UInt, data: COpaquePointer?, buffer: COpaquePointer?): UInt

public expect fun logErrorA(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: COpaquePointer?, dwerrorcode: UInt)

public expect fun logErrorW(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: COpaquePointer?, dwerrorcode: UInt)

public expect fun logEventA(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: COpaquePointer?)

public expect fun logEventW(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: COpaquePointer?)

public expect fun mprSetupProtocolEnum(dwtransportid: UInt, lplpbuffer: COpaquePointer?, lpdwentriesread: COpaquePointer?): UInt

public expect fun mprSetupProtocolFree(lpbuffer: COpaquePointer?): UInt

public expect fun netAccessAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt

public expect fun netAccessDel(servername: Pcwstr, resource: Pcwstr): UInt

public expect fun netAccessEnum(servername: Pcwstr, basepath: Pcwstr, recursive: UInt, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt

public expect fun netAccessGetInfo(servername: Pcwstr, resource: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt

public expect fun netAccessGetUserPerms(servername: Pcwstr, ugname: Pcwstr, resource: Pcwstr, perms: COpaquePointer?): UInt

public expect fun netAccessSetInfo(servername: Pcwstr, resource: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt

public expect fun netAddAlternateComputerName(server: Pcwstr, alternatename: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt

public expect fun netAddServiceAccount(servername: Pcwstr, accountname: Pcwstr, password: Pcwstr, flags: UInt): Ntstatus

public expect fun netAlertRaise(alerttype: Pcwstr, buffer: COpaquePointer?, buffersize: UInt): UInt

public expect fun netAlertRaiseEx(alerttype: Pcwstr, variableinfo: COpaquePointer?, variableinfosize: UInt, servicename: Pcwstr): UInt

public expect fun netApiBufferAllocate(bytecount: UInt, buffer: COpaquePointer?): UInt

public expect fun netApiBufferFree(buffer: COpaquePointer?): UInt

public expect fun netApiBufferReallocate(oldbuffer: COpaquePointer?, newbytecount: UInt, newbuffer: COpaquePointer?): UInt

public expect fun netApiBufferSize(buffer: COpaquePointer?, bytecount: COpaquePointer?): UInt

public expect fun netAuditClear(server: Pcwstr, backupfile: Pcwstr, service: Pcwstr): UInt

public expect fun netAuditRead(server: Pcwstr, service: Pcwstr, auditloghandle: COpaquePointer?, offset: UInt, reserved1: COpaquePointer?, reserved2: UInt, offsetflag: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, bytesread: COpaquePointer?, totalavailable: COpaquePointer?): UInt

public expect fun netAuditWrite(type: UInt, buf: COpaquePointer?, numbytes: UInt, service: Pcwstr, reserved: COpaquePointer?): UInt

public expect fun netConfigGet(server: Pcwstr, component: Pcwstr, parameter: Pcwstr, bufptr: COpaquePointer?): UInt

public expect fun netConfigGetAll(server: Pcwstr, component: Pcwstr, bufptr: COpaquePointer?): UInt

public expect fun netConfigSet(server: Pcwstr, reserved1: Pcwstr, component: Pcwstr, level: UInt, reserved2: UInt, buf: COpaquePointer?, reserved3: UInt): UInt

public expect fun netCreateProvisioningPackage(pprovisioningparams: COpaquePointer?, pppackagebindata: COpaquePointer?, pdwpackagebindatasize: COpaquePointer?, pppackagetextdata: COpaquePointer?): UInt

public expect fun netEnumerateComputerNames(server: Pcwstr, nametype: NetComputerNameType, reserved: UInt, entrycount: COpaquePointer?, computernames: COpaquePointer?): UInt

public expect fun netEnumerateServiceAccounts(servername: Pcwstr, flags: UInt, accountscount: COpaquePointer?, accounts: COpaquePointer?): Ntstatus

public expect fun netErrorLogClear(uncservername: Pcwstr, backupfile: Pcwstr, reserved: COpaquePointer?): UInt

public expect fun netErrorLogRead(uncservername: Pcwstr, reserved1: Pcwstr, errorloghandle: COpaquePointer?, offset: UInt, reserved2: COpaquePointer?, reserved3: UInt, offsetflag: UInt, bufptr: COpaquePointer?, prefmaxsize: UInt, bytesread: COpaquePointer?, totalavailable: COpaquePointer?): UInt

public expect fun netErrorLogWrite(reserved1: COpaquePointer?, code: UInt, component: Pcwstr, buffer: COpaquePointer?, numbytes: UInt, msgbuf: COpaquePointer?, strcount: UInt, reserved2: COpaquePointer?): UInt

public expect fun netFreeAadJoinInformation(pjoininfo: COpaquePointer?)

public expect fun netGetAadJoinInformation(pcsztenantid: Pcwstr, ppjoininfo: COpaquePointer?): Hresult

public expect fun netGetAnyDCName(servername: Pcwstr, domainname: Pcwstr, buffer: COpaquePointer?): UInt

public expect fun netGetDCName(servername: Pcwstr, domainname: Pcwstr, buffer: COpaquePointer?): UInt

public expect fun netGetDisplayInformationIndex(servername: Pcwstr, level: UInt, prefix: Pcwstr, index: COpaquePointer?): UInt

public expect fun netGetJoinInformation(lpserver: Pcwstr, lpnamebuffer: COpaquePointer?, buffertype: COpaquePointer?): UInt

public expect fun netGetJoinableOUs(lpserver: Pcwstr, lpdomain: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, oucount: COpaquePointer?, ous: COpaquePointer?): UInt

public expect fun netGroupAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt

public expect fun netGroupAddUser(servername: Pcwstr, groupname: Pcwstr, username: Pcwstr): UInt

public expect fun netGroupDel(servername: Pcwstr, groupname: Pcwstr): UInt

public expect fun netGroupDelUser(servername: Pcwstr, groupname: Pcwstr, username: Pcwstr): UInt

public expect fun netGroupEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt

public expect fun netGroupGetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt

public expect fun netGroupGetUsers(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt

public expect fun netGroupSetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt

public expect fun netGroupSetUsers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, totalentries: UInt): UInt

public expect fun netIsServiceAccount(servername: Pcwstr, accountname: Pcwstr, isservice: COpaquePointer?): Ntstatus

public expect fun netJoinDomain(lpserver: Pcwstr, lpdomain: Pcwstr, lpmachineaccountou: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, fjoinoptions: NetJoinDomainJoinOptions): UInt

public expect fun netLocalGroupAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt

public expect fun netLocalGroupAddMember(servername: Pcwstr, groupname: Pcwstr, membersid: Psid): UInt

public expect fun netLocalGroupAddMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, totalentries: UInt): UInt

public expect fun netLocalGroupDel(servername: Pcwstr, groupname: Pcwstr): UInt

public expect fun netLocalGroupDelMember(servername: Pcwstr, groupname: Pcwstr, membersid: Psid): UInt

public expect fun netLocalGroupDelMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, totalentries: UInt): UInt

public expect fun netLocalGroupEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt

public expect fun netLocalGroupGetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt

public expect fun netLocalGroupGetMembers(servername: Pcwstr, localgroupname: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt

public expect fun netLocalGroupSetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt

public expect fun netLocalGroupSetMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, totalentries: UInt): UInt

public expect fun netMessageBufferSend(servername: Pcwstr, msgname: Pcwstr, fromname: Pcwstr, buf: COpaquePointer?, buflen: UInt): UInt

public expect fun netMessageNameAdd(servername: Pcwstr, msgname: Pcwstr): UInt

public expect fun netMessageNameDel(servername: Pcwstr, msgname: Pcwstr): UInt

public expect fun netMessageNameEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt

public expect fun netMessageNameGetInfo(servername: Pcwstr, msgname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt

public expect fun netProvisionComputerAccount(lpdomain: Pcwstr, lpmachinename: Pcwstr, lpmachineaccountou: Pcwstr, lpdcname: Pcwstr, dwoptions: NetsetupProvision, pprovisionbindata: COpaquePointer?, pdwprovisionbindatasize: COpaquePointer?, pprovisiontextdata: COpaquePointer?): UInt

public expect fun netQueryDisplayInformation(servername: Pcwstr, level: UInt, index: UInt, entriesrequested: UInt, preferredmaximumlength: UInt, returnedentrycount: COpaquePointer?, sortedbuffer: COpaquePointer?): UInt

public expect fun netQueryServiceAccount(servername: Pcwstr, accountname: Pcwstr, infolevel: UInt, buffer: COpaquePointer?): Ntstatus

public expect fun netRemoteComputerSupports(uncservername: Pcwstr, optionswanted: NetRemoteComputerSupportsOptions, optionssupported: COpaquePointer?): UInt

public expect fun netRemoteTOD(uncservername: Pcwstr, bufferptr: COpaquePointer?): UInt

public expect fun netRemoveAlternateComputerName(server: Pcwstr, alternatename: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt

public expect fun netRemoveServiceAccount(servername: Pcwstr, accountname: Pcwstr, flags: UInt): Ntstatus

public expect fun netRenameMachineInDomain(lpserver: Pcwstr, lpnewmachinename: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, frenameoptions: UInt): UInt

public expect fun netReplExportDirAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt

public expect fun netReplExportDirDel(servername: Pcwstr, dirname: Pcwstr): UInt

public expect fun netReplExportDirEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt

public expect fun netReplExportDirGetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt

public expect fun netReplExportDirLock(servername: Pcwstr, dirname: Pcwstr): UInt

public expect fun netReplExportDirSetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt

public expect fun netReplExportDirUnlock(servername: Pcwstr, dirname: Pcwstr, unlockforce: UInt): UInt

public expect fun netReplGetInfo(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt

public expect fun netReplImportDirAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt

public expect fun netReplImportDirDel(servername: Pcwstr, dirname: Pcwstr): UInt

public expect fun netReplImportDirEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt

public expect fun netReplImportDirGetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt

public expect fun netReplImportDirLock(servername: Pcwstr, dirname: Pcwstr): UInt

public expect fun netReplImportDirUnlock(servername: Pcwstr, dirname: Pcwstr, unlockforce: UInt): UInt

public expect fun netReplSetInfo(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt

public expect fun netRequestOfflineDomainJoin(pprovisionbindata: COpaquePointer?, cbprovisionbindatasize: UInt, dwoptions: NetRequestProvisionOptions, lpwindowspath: Pcwstr): UInt

public expect fun netRequestProvisioningPackageInstall(ppackagebindata: COpaquePointer?, dwpackagebindatasize: UInt, dwprovisionoptions: NetRequestProvisionOptions, lpwindowspath: Pcwstr, pvreserved: COpaquePointer?): UInt

public expect fun netScheduleJobAdd(servername: Pcwstr, buffer: COpaquePointer?, jobid: COpaquePointer?): UInt

public expect fun netScheduleJobDel(servername: Pcwstr, minjobid: UInt, maxjobid: UInt): UInt

public expect fun netScheduleJobEnum(servername: Pcwstr, pointertobuffer: COpaquePointer?, prefferedmaximumlength: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt

public expect fun netScheduleJobGetInfo(servername: Pcwstr, jobid: UInt, pointertobuffer: COpaquePointer?): UInt

public expect fun netServerComputerNameAdd(servername: Pcwstr, emulateddomainname: Pcwstr, emulatedservername: Pcwstr): UInt

public expect fun netServerComputerNameDel(servername: Pcwstr, emulatedservername: Pcwstr): UInt

public expect fun netServerDiskEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt

public expect fun netServerEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, servertype: NetServerType, domain: Pcwstr, resumeHandle: COpaquePointer?): UInt

public expect fun netServerGetInfo(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt

public expect fun netServerSetInfo(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmerror: COpaquePointer?): UInt

public expect fun netServerTransportAdd(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt

public expect fun netServerTransportAddEx(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt

public expect fun netServerTransportDel(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt

public expect fun netServerTransportEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt

public expect fun netServiceControl(servername: Pcwstr, service: Pcwstr, opcode: UInt, arg: UInt, bufptr: COpaquePointer?): UInt

public expect fun netServiceEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt

public expect fun netServiceGetInfo(servername: Pcwstr, service: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt

public expect fun netServiceInstall(servername: Pcwstr, service: Pcwstr, argc: UInt, argv: COpaquePointer?, bufptr: COpaquePointer?): UInt

public expect fun netSetPrimaryComputerName(server: Pcwstr, primaryname: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt

public expect fun netUnjoinDomain(lpserver: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, funjoinoptions: UInt): UInt

public expect fun netUseAdd(servername: COpaquePointer?, levelflags: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt

public expect fun netUseDel(uncservername: Pcwstr, usename: Pcwstr, forcelevelflags: ForceLevelFlags): UInt

public expect fun netUseEnum(uncservername: Pcwstr, levelflags: UInt, bufptr: COpaquePointer?, preferedmaximumsize: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt

public expect fun netUseGetInfo(uncservername: Pcwstr, usename: Pcwstr, levelflags: UInt, bufptr: COpaquePointer?): UInt

public expect fun netUserAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt

public expect fun netUserChangePassword(domainname: Pcwstr, username: Pcwstr, oldpassword: Pcwstr, newpassword: Pcwstr): UInt

public expect fun netUserDel(servername: Pcwstr, username: Pcwstr): UInt

public expect fun netUserEnum(servername: Pcwstr, level: UInt, filter: NetUserEnumFilterFlags, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt

public expect fun netUserGetGroups(servername: Pcwstr, username: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?): UInt

public expect fun netUserGetInfo(servername: Pcwstr, username: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt

public expect fun netUserGetLocalGroups(servername: Pcwstr, username: Pcwstr, level: UInt, flags: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?): UInt

public expect fun netUserModalsGet(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt

public expect fun netUserModalsSet(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt

public expect fun netUserSetGroups(servername: Pcwstr, username: Pcwstr, level: UInt, buf: COpaquePointer?, numEntries: UInt): UInt

public expect fun netUserSetInfo(servername: Pcwstr, username: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt

public expect fun netValidateName(lpserver: Pcwstr, lpname: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, nametype: NetsetupNameType): UInt

public expect fun netValidatePasswordPolicy(servername: Pcwstr, qualifier: COpaquePointer?, validationtype: NetValidatePasswordType, inputarg: COpaquePointer?, outputarg: COpaquePointer?): UInt

public expect fun netValidatePasswordPolicyFree(outputarg: COpaquePointer?): UInt

public expect fun netWkstaGetInfo(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt

public expect fun netWkstaSetInfo(servername: Pcwstr, level: UInt, buffer: COpaquePointer?, parmErr: COpaquePointer?): UInt

public expect fun netWkstaTransportAdd(servername: COpaquePointer?, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt

public expect fun netWkstaTransportDel(servername: Pcwstr, transportname: Pcwstr, ucond: ForceLevelFlags): UInt

public expect fun netWkstaTransportEnum(servername: COpaquePointer?, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt

public expect fun netWkstaUserEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt

public expect fun netWkstaUserGetInfo(reserved: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt

public expect fun netWkstaUserSetInfo(reserved: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt

public expect fun routerAssert(pszfailedassertion: Pcstr, pszfilename: Pcstr, dwlinenumber: UInt, pszmessage: Pcstr)

public expect fun routerGetErrorStringA(dwerrorcode: UInt, lplpszerrorstring: COpaquePointer?): UInt

public expect fun routerGetErrorStringW(dwerrorcode: UInt, lplpwszerrorstring: COpaquePointer?): UInt

public expect fun routerLogDeregisterA(hloghandle: Handle)

public expect fun routerLogDeregisterW(hloghandle: Handle)

public expect fun routerLogEventA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwerrorcode: UInt)

public expect fun routerLogEventDataA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwdatabytes: UInt, lpdatabytes: COpaquePointer?)

public expect fun routerLogEventDataW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwdatabytes: UInt, lpdatabytes: COpaquePointer?)

public expect fun routerLogEventExA(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcstr, vararg variadicArgs: Long)

public expect fun routerLogEventExW(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcwstr, vararg variadicArgs: Long)

public expect fun routerLogEventStringA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwerrorcode: UInt, dwerrorindex: UInt)

public expect fun routerLogEventStringW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwerrorcode: UInt, dwerrorindex: UInt)

public expect fun routerLogEventValistExA(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcstr, arglist: COpaquePointer?)

public expect fun routerLogEventValistExW(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcwstr, arglist: COpaquePointer?)

public expect fun routerLogEventW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwerrorcode: UInt)

public expect fun routerLogRegisterA(lpszsource: Pcstr): Handle

public expect fun routerLogRegisterW(lpszsource: Pcwstr): Handle

public expect fun setNetScheduleAccountInformation(pwszservername: Pcwstr, pwszaccount: Pcwstr, pwszpassword: Pcwstr): Hresult

public expect fun traceDeregisterA(dwtraceid: UInt): UInt

public expect fun traceDeregisterExA(dwtraceid: UInt, dwflags: UInt): UInt

public expect fun traceDeregisterExW(dwtraceid: UInt, dwflags: UInt): UInt

public expect fun traceDeregisterW(dwtraceid: UInt): UInt

public expect fun traceDumpExA(dwtraceid: UInt, dwflags: UInt, lpbbytes: COpaquePointer?, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: Bool, lpszprefix: Pcstr): UInt

public expect fun traceDumpExW(dwtraceid: UInt, dwflags: UInt, lpbbytes: COpaquePointer?, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: Bool, lpszprefix: Pcwstr): UInt

public expect fun traceGetConsoleA(dwtraceid: UInt, lphconsole: COpaquePointer?): UInt

public expect fun traceGetConsoleW(dwtraceid: UInt, lphconsole: COpaquePointer?): UInt

public expect fun tracePrintfA(dwtraceid: UInt, lpszformat: Pcstr, vararg variadicArgs: Long): UInt

public expect fun tracePrintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcstr, vararg variadicArgs: Long): UInt

public expect fun tracePrintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcwstr, vararg variadicArgs: Long): UInt

public expect fun tracePrintfW(dwtraceid: UInt, lpszformat: Pcwstr, vararg variadicArgs: Long): UInt

public expect fun tracePutsExA(dwtraceid: UInt, dwflags: UInt, lpszstring: Pcstr): UInt

public expect fun tracePutsExW(dwtraceid: UInt, dwflags: UInt, lpszstring: Pcwstr): UInt

public expect fun traceRegisterExA(lpszcallername: Pcstr, dwflags: UInt): UInt

public expect fun traceRegisterExW(lpszcallername: Pcwstr, dwflags: UInt): UInt

public expect fun traceVprintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcstr, arglist: COpaquePointer?): UInt

public expect fun traceVprintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcwstr, arglist: COpaquePointer?): UInt
