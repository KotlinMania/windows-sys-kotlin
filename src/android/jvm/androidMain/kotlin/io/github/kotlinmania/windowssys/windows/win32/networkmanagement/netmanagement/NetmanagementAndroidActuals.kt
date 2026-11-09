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

private object WindowsWin32NetworkmanagementNetmanagementJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_GetNetScheduleAccountInformation(pwszservername: Long, ccaccount: Int, wszaccount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_I_NetLogonControl2(servername: Long, functioncode: Int, querylevel: Int, data: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_LogErrorA(dwmessageid: Int, cnumberofsubstrings: Int, plpwssubstrings: Long, dwerrorcode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_LogErrorW(dwmessageid: Int, cnumberofsubstrings: Int, plpwssubstrings: Long, dwerrorcode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_LogEventA(weventtype: Int, dwmessageid: Int, cnumberofsubstrings: Int, plpwssubstrings: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_LogEventW(weventtype: Int, dwmessageid: Int, cnumberofsubstrings: Int, plpwssubstrings: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_MprSetupProtocolEnum(dwtransportid: Int, lplpbuffer: Long, lpdwentriesread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_MprSetupProtocolFree(lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetAccessAdd(servername: Long, level: Int, buf: Long, parm_err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetAccessDel(servername: Long, resource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetAccessEnum(servername: Long, basepath: Long, recursive: Int, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resume_handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetAccessGetInfo(servername: Long, resource: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetAccessGetUserPerms(servername: Long, ugname: Long, resource: Long, perms: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetAccessSetInfo(servername: Long, resource: Long, level: Int, buf: Long, parm_err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetAddAlternateComputerName(server: Long, alternatename: Long, domainaccount: Long, domainaccountpassword: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetAddServiceAccount(servername: Long, accountname: Long, password: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetAlertRaise(alerttype: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetAlertRaiseEx(alerttype: Long, variableinfo: Long, variableinfosize: Int, servicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetApiBufferAllocate(bytecount: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetApiBufferFree(buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetApiBufferReallocate(oldbuffer: Long, newbytecount: Int, newbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetApiBufferSize(buffer: Long, bytecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetAuditClear(server: Long, backupfile: Long, service: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetAuditRead(server: Long, service: Long, auditloghandle: Long, offset: Int, reserved1: Long, reserved2: Int, offsetflag: Int, bufptr: Long, prefmaxlen: Int, bytesread: Long, totalavailable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetAuditWrite(type: Int, buf: Long, numbytes: Int, service: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetConfigGet(server: Long, component: Long, parameter: Long, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetConfigGetAll(server: Long, component: Long, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetConfigSet(server: Long, reserved1: Long, component: Long, level: Int, reserved2: Int, buf: Long, reserved3: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetCreateProvisioningPackage(pprovisioningparams: Long, pppackagebindata: Long, pdwpackagebindatasize: Long, pppackagetextdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetEnumerateComputerNames(server: Long, nametype: Int, reserved: Int, entrycount: Long, computernames: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetEnumerateServiceAccounts(servername: Long, flags: Int, accountscount: Long, accounts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetErrorLogClear(uncservername: Long, backupfile: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetErrorLogRead(uncservername: Long, reserved1: Long, errorloghandle: Long, offset: Int, reserved2: Long, reserved3: Int, offsetflag: Int, bufptr: Long, prefmaxsize: Int, bytesread: Long, totalavailable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetErrorLogWrite(reserved1: Long, code: Int, component: Long, buffer: Long, numbytes: Int, msgbuf: Long, strcount: Int, reserved2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetFreeAadJoinInformation(pjoininfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetGetAadJoinInformation(pcsztenantid: Long, ppjoininfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetGetAnyDCName(servername: Long, domainname: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetGetDCName(servername: Long, domainname: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetGetDisplayInformationIndex(servername: Long, level: Int, prefix: Long, index: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetGetJoinInformation(lpserver: Long, lpnamebuffer: Long, buffertype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetGetJoinableOUs(lpserver: Long, lpdomain: Long, lpaccount: Long, lppassword: Long, oucount: Long, ous: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetGroupAdd(servername: Long, level: Int, buf: Long, parm_err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetGroupAddUser(servername: Long, groupname: Long, username: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetGroupDel(servername: Long, groupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetGroupDelUser(servername: Long, groupname: Long, username: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetGroupEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resume_handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetGroupGetInfo(servername: Long, groupname: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetGroupGetUsers(servername: Long, groupname: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetGroupSetInfo(servername: Long, groupname: Long, level: Int, buf: Long, parm_err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetGroupSetUsers(servername: Long, groupname: Long, level: Int, buf: Long, totalentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetIsServiceAccount(servername: Long, accountname: Long, isservice: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetJoinDomain(lpserver: Long, lpdomain: Long, lpmachineaccountou: Long, lpaccount: Long, lppassword: Long, fjoinoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupAdd(servername: Long, level: Int, buf: Long, parm_err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupAddMember(servername: Long, groupname: Long, membersid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupAddMembers(servername: Long, groupname: Long, level: Int, buf: Long, totalentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupDel(servername: Long, groupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupDelMember(servername: Long, groupname: Long, membersid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupDelMembers(servername: Long, groupname: Long, level: Int, buf: Long, totalentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupGetInfo(servername: Long, groupname: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupGetMembers(servername: Long, localgroupname: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupSetInfo(servername: Long, groupname: Long, level: Int, buf: Long, parm_err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupSetMembers(servername: Long, groupname: Long, level: Int, buf: Long, totalentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetMessageBufferSend(servername: Long, msgname: Long, fromname: Long, buf: Long, buflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetMessageNameAdd(servername: Long, msgname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetMessageNameDel(servername: Long, msgname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetMessageNameEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resume_handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetMessageNameGetInfo(servername: Long, msgname: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetProvisionComputerAccount(lpdomain: Long, lpmachinename: Long, lpmachineaccountou: Long, lpdcname: Long, dwoptions: Int, pprovisionbindata: Long, pdwprovisionbindatasize: Long, pprovisiontextdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetQueryDisplayInformation(servername: Long, level: Int, index: Int, entriesrequested: Int, preferredmaximumlength: Int, returnedentrycount: Long, sortedbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetQueryServiceAccount(servername: Long, accountname: Long, infolevel: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetRemoteComputerSupports(uncservername: Long, optionswanted: Int, optionssupported: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetRemoteTOD(uncservername: Long, bufferptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetRemoveAlternateComputerName(server: Long, alternatename: Long, domainaccount: Long, domainaccountpassword: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetRemoveServiceAccount(servername: Long, accountname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetRenameMachineInDomain(lpserver: Long, lpnewmachinename: Long, lpaccount: Long, lppassword: Long, frenameoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirAdd(servername: Long, level: Int, buf: Long, parm_err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirDel(servername: Long, dirname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirGetInfo(servername: Long, dirname: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirLock(servername: Long, dirname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirSetInfo(servername: Long, dirname: Long, level: Int, buf: Long, parm_err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirUnlock(servername: Long, dirname: Long, unlockforce: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetReplGetInfo(servername: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirAdd(servername: Long, level: Int, buf: Long, parm_err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirDel(servername: Long, dirname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirGetInfo(servername: Long, dirname: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirLock(servername: Long, dirname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirUnlock(servername: Long, dirname: Long, unlockforce: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetReplSetInfo(servername: Long, level: Int, buf: Long, parm_err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetRequestOfflineDomainJoin(pprovisionbindata: Long, cbprovisionbindatasize: Int, dwoptions: Int, lpwindowspath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetRequestProvisioningPackageInstall(ppackagebindata: Long, dwpackagebindatasize: Int, dwprovisionoptions: Int, lpwindowspath: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetScheduleJobAdd(servername: Long, buffer: Long, jobid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetScheduleJobDel(servername: Long, minjobid: Int, maxjobid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetScheduleJobEnum(servername: Long, pointertobuffer: Long, prefferedmaximumlength: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetScheduleJobGetInfo(servername: Long, jobid: Int, pointertobuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetServerComputerNameAdd(servername: Long, emulateddomainname: Long, emulatedservername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetServerComputerNameDel(servername: Long, emulatedservername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetServerDiskEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resume_handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetServerEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, servertype: Int, domain: Long, resume_handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetServerGetInfo(servername: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetServerSetInfo(servername: Long, level: Int, buf: Long, parmerror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetServerTransportAdd(servername: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetServerTransportAddEx(servername: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetServerTransportDel(servername: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetServerTransportEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resume_handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetServiceControl(servername: Long, service: Long, opcode: Int, arg: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetServiceEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resume_handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetServiceGetInfo(servername: Long, service: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetServiceInstall(servername: Long, service: Long, argc: Int, argv: Long, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetSetPrimaryComputerName(server: Long, primaryname: Long, domainaccount: Long, domainaccountpassword: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetUnjoinDomain(lpserver: Long, lpaccount: Long, lppassword: Long, funjoinoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetUseAdd(servername: Long, levelflags: Int, buf: Long, parm_err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetUseDel(uncservername: Long, usename: Long, forcelevelflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetUseEnum(uncservername: Long, levelflags: Int, bufptr: Long, preferedmaximumsize: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetUseGetInfo(uncservername: Long, usename: Long, levelflags: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetUserAdd(servername: Long, level: Int, buf: Long, parm_err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetUserChangePassword(domainname: Long, username: Long, oldpassword: Long, newpassword: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetUserDel(servername: Long, username: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetUserEnum(servername: Long, level: Int, filter: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resume_handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetUserGetGroups(servername: Long, username: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetUserGetInfo(servername: Long, username: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetUserGetLocalGroups(servername: Long, username: Long, level: Int, flags: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetUserModalsGet(servername: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetUserModalsSet(servername: Long, level: Int, buf: Long, parm_err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetUserSetGroups(servername: Long, username: Long, level: Int, buf: Long, num_entries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetUserSetInfo(servername: Long, username: Long, level: Int, buf: Long, parm_err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetValidateName(lpserver: Long, lpname: Long, lpaccount: Long, lppassword: Long, nametype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetValidatePasswordPolicy(servername: Long, qualifier: Long, validationtype: Int, inputarg: Long, outputarg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetValidatePasswordPolicyFree(outputarg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaGetInfo(servername: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaSetInfo(servername: Long, level: Int, buffer: Long, parm_err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaTransportAdd(servername: Long, level: Int, buf: Long, parm_err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaTransportDel(servername: Long, transportname: Long, ucond: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaTransportEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resume_handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaUserEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaUserGetInfo(reserved: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaUserSetInfo(reserved: Long, level: Int, buf: Long, parm_err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_RouterAssert(pszfailedassertion: Long, pszfilename: Long, dwlinenumber: Int, pszmessage: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_RouterGetErrorStringA(dwerrorcode: Int, lplpszerrorstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_RouterGetErrorStringW(dwerrorcode: Int, lplpwszerrorstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_RouterLogDeregisterA(hloghandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_RouterLogDeregisterW(hloghandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventA(hloghandle: Long, dweventtype: Int, dwmessageid: Int, dwsubstringcount: Int, plpszsubstringarray: Long, dwerrorcode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventDataA(hloghandle: Long, dweventtype: Int, dwmessageid: Int, dwsubstringcount: Int, plpszsubstringarray: Long, dwdatabytes: Int, lpdatabytes: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventDataW(hloghandle: Long, dweventtype: Int, dwmessageid: Int, dwsubstringcount: Int, plpszsubstringarray: Long, dwdatabytes: Int, lpdatabytes: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventStringA(hloghandle: Long, dweventtype: Int, dwmessageid: Int, dwsubstringcount: Int, plpszsubstringarray: Long, dwerrorcode: Int, dwerrorindex: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventStringW(hloghandle: Long, dweventtype: Int, dwmessageid: Int, dwsubstringcount: Int, plpszsubstringarray: Long, dwerrorcode: Int, dwerrorindex: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventValistExA(hloghandle: Long, dweventtype: Int, dwerrorcode: Int, dwmessageid: Int, ptszformat: Long, arglist: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventValistExW(hloghandle: Long, dweventtype: Int, dwerrorcode: Int, dwmessageid: Int, ptszformat: Long, arglist: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventW(hloghandle: Long, dweventtype: Int, dwmessageid: Int, dwsubstringcount: Int, plpszsubstringarray: Long, dwerrorcode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_RouterLogRegisterA(lpszsource: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_RouterLogRegisterW(lpszsource: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_SetNetScheduleAccountInformation(pwszservername: Long, pwszaccount: Long, pwszpassword: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_TraceDeregisterA(dwtraceid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_TraceDeregisterExA(dwtraceid: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_TraceDeregisterExW(dwtraceid: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_TraceDeregisterW(dwtraceid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_TraceDumpExA(dwtraceid: Int, dwflags: Int, lpbbytes: Long, dwbytecount: Int, dwgroupsize: Int, baddressprefix: Int, lpszprefix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_TraceDumpExW(dwtraceid: Int, dwflags: Int, lpbbytes: Long, dwbytecount: Int, dwgroupsize: Int, baddressprefix: Int, lpszprefix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_TraceGetConsoleA(dwtraceid: Int, lphconsole: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_TraceGetConsoleW(dwtraceid: Int, lphconsole: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_TracePutsExA(dwtraceid: Int, dwflags: Int, lpszstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_TracePutsExW(dwtraceid: Int, dwflags: Int, lpszstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_TraceRegisterExA(lpszcallername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_TraceRegisterExW(lpszcallername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_TraceVprintfExA(dwtraceid: Int, dwflags: Int, lpszformat: Long, arglist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_TraceVprintfExW(dwtraceid: Int, dwflags: Int, lpszformat: Long, arglist: Long): Int
}

public actual fun GetNetScheduleAccountInformation(pwszservername: PCWSTR, ccaccount: UInt, wszaccount: PWSTR): HRESULT =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_GetNetScheduleAccountInformation(pwszservername, ccaccount.toInt(), wszaccount)

public actual fun I_NetLogonControl2(servername: PCWSTR, functioncode: UInt, querylevel: UInt, data: Long, buffer: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_I_NetLogonControl2(servername, functioncode.toInt(), querylevel.toInt(), data, buffer).toUInt()

public actual fun LogErrorA(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long, dwerrorcode: UInt) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_LogErrorA(dwmessageid.toInt(), cnumberofsubstrings.toInt(), plpwssubstrings, dwerrorcode.toInt())
}

public actual fun LogErrorW(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long, dwerrorcode: UInt) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_LogErrorW(dwmessageid.toInt(), cnumberofsubstrings.toInt(), plpwssubstrings, dwerrorcode.toInt())
}

public actual fun LogEventA(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_LogEventA(weventtype.toInt(), dwmessageid.toInt(), cnumberofsubstrings.toInt(), plpwssubstrings)
}

public actual fun LogEventW(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: Long) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_LogEventW(weventtype.toInt(), dwmessageid.toInt(), cnumberofsubstrings.toInt(), plpwssubstrings)
}

public actual fun MprSetupProtocolEnum(dwtransportid: UInt, lplpbuffer: Long, lpdwentriesread: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_MprSetupProtocolEnum(dwtransportid.toInt(), lplpbuffer, lpdwentriesread).toUInt()

public actual fun MprSetupProtocolFree(lpbuffer: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_MprSetupProtocolFree(lpbuffer).toUInt()

public actual fun NetAccessAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetAccessAdd(servername, level.toInt(), buf, parm_err).toUInt()

public actual fun NetAccessDel(servername: PCWSTR, resource: PCWSTR): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetAccessDel(servername, resource).toUInt()

public actual fun NetAccessEnum(servername: PCWSTR, basepath: PCWSTR, recursive: UInt, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetAccessEnum(servername, basepath, recursive.toInt(), level.toInt(), bufptr, prefmaxlen.toInt(), entriesread, totalentries, resume_handle).toUInt()

public actual fun NetAccessGetInfo(servername: PCWSTR, resource: PCWSTR, level: UInt, bufptr: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetAccessGetInfo(servername, resource, level.toInt(), bufptr).toUInt()

public actual fun NetAccessGetUserPerms(servername: PCWSTR, ugname: PCWSTR, resource: PCWSTR, perms: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetAccessGetUserPerms(servername, ugname, resource, perms).toUInt()

public actual fun NetAccessSetInfo(servername: PCWSTR, resource: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetAccessSetInfo(servername, resource, level.toInt(), buf, parm_err).toUInt()

public actual fun NetAddAlternateComputerName(server: PCWSTR, alternatename: PCWSTR, domainaccount: PCWSTR, domainaccountpassword: PCWSTR, reserved: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetAddAlternateComputerName(server, alternatename, domainaccount, domainaccountpassword, reserved.toInt()).toUInt()

public actual fun NetAddServiceAccount(servername: PCWSTR, accountname: PCWSTR, password: PCWSTR, flags: UInt): NTSTATUS =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetAddServiceAccount(servername, accountname, password, flags.toInt())

public actual fun NetAlertRaise(alerttype: PCWSTR, buffer: Long, buffersize: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetAlertRaise(alerttype, buffer, buffersize.toInt()).toUInt()

public actual fun NetAlertRaiseEx(alerttype: PCWSTR, variableinfo: Long, variableinfosize: UInt, servicename: PCWSTR): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetAlertRaiseEx(alerttype, variableinfo, variableinfosize.toInt(), servicename).toUInt()

public actual fun NetApiBufferAllocate(bytecount: UInt, buffer: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetApiBufferAllocate(bytecount.toInt(), buffer).toUInt()

public actual fun NetApiBufferFree(buffer: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetApiBufferFree(buffer).toUInt()

public actual fun NetApiBufferReallocate(oldbuffer: Long, newbytecount: UInt, newbuffer: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetApiBufferReallocate(oldbuffer, newbytecount.toInt(), newbuffer).toUInt()

public actual fun NetApiBufferSize(buffer: Long, bytecount: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetApiBufferSize(buffer, bytecount).toUInt()

public actual fun NetAuditClear(server: PCWSTR, backupfile: PCWSTR, service: PCWSTR): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetAuditClear(server, backupfile, service).toUInt()

public actual fun NetAuditRead(server: PCWSTR, service: PCWSTR, auditloghandle: Long, offset: UInt, reserved1: Long, reserved2: UInt, offsetflag: UInt, bufptr: Long, prefmaxlen: UInt, bytesread: Long, totalavailable: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetAuditRead(server, service, auditloghandle, offset.toInt(), reserved1, reserved2.toInt(), offsetflag.toInt(), bufptr, prefmaxlen.toInt(), bytesread, totalavailable).toUInt()

public actual fun NetAuditWrite(type: UInt, buf: Long, numbytes: UInt, service: PCWSTR, reserved: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetAuditWrite(type.toInt(), buf, numbytes.toInt(), service, reserved).toUInt()

public actual fun NetConfigGet(server: PCWSTR, component: PCWSTR, parameter: PCWSTR, bufptr: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetConfigGet(server, component, parameter, bufptr).toUInt()

public actual fun NetConfigGetAll(server: PCWSTR, component: PCWSTR, bufptr: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetConfigGetAll(server, component, bufptr).toUInt()

public actual fun NetConfigSet(server: PCWSTR, reserved1: PCWSTR, component: PCWSTR, level: UInt, reserved2: UInt, buf: Long, reserved3: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetConfigSet(server, reserved1, component, level.toInt(), reserved2.toInt(), buf, reserved3.toInt()).toUInt()

public actual fun NetCreateProvisioningPackage(pprovisioningparams: Long, pppackagebindata: Long, pdwpackagebindatasize: Long, pppackagetextdata: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetCreateProvisioningPackage(pprovisioningparams, pppackagebindata, pdwpackagebindatasize, pppackagetextdata).toUInt()

public actual fun NetEnumerateComputerNames(server: PCWSTR, nametype: NET_COMPUTER_NAME_TYPE, reserved: UInt, entrycount: Long, computernames: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetEnumerateComputerNames(server, nametype, reserved.toInt(), entrycount, computernames).toUInt()

public actual fun NetEnumerateServiceAccounts(servername: PCWSTR, flags: UInt, accountscount: Long, accounts: Long): NTSTATUS =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetEnumerateServiceAccounts(servername, flags.toInt(), accountscount, accounts)

public actual fun NetErrorLogClear(uncservername: PCWSTR, backupfile: PCWSTR, reserved: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetErrorLogClear(uncservername, backupfile, reserved).toUInt()

public actual fun NetErrorLogRead(uncservername: PCWSTR, reserved1: PCWSTR, errorloghandle: Long, offset: UInt, reserved2: Long, reserved3: UInt, offsetflag: UInt, bufptr: Long, prefmaxsize: UInt, bytesread: Long, totalavailable: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetErrorLogRead(uncservername, reserved1, errorloghandle, offset.toInt(), reserved2, reserved3.toInt(), offsetflag.toInt(), bufptr, prefmaxsize.toInt(), bytesread, totalavailable).toUInt()

public actual fun NetErrorLogWrite(reserved1: Long, code: UInt, component: PCWSTR, buffer: Long, numbytes: UInt, msgbuf: Long, strcount: UInt, reserved2: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetErrorLogWrite(reserved1, code.toInt(), component, buffer, numbytes.toInt(), msgbuf, strcount.toInt(), reserved2).toUInt()

public actual fun NetFreeAadJoinInformation(pjoininfo: Long) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetFreeAadJoinInformation(pjoininfo)
}

public actual fun NetGetAadJoinInformation(pcsztenantid: PCWSTR, ppjoininfo: Long): HRESULT =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetGetAadJoinInformation(pcsztenantid, ppjoininfo)

public actual fun NetGetAnyDCName(servername: PCWSTR, domainname: PCWSTR, buffer: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetGetAnyDCName(servername, domainname, buffer).toUInt()

public actual fun NetGetDCName(servername: PCWSTR, domainname: PCWSTR, buffer: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetGetDCName(servername, domainname, buffer).toUInt()

public actual fun NetGetDisplayInformationIndex(servername: PCWSTR, level: UInt, prefix: PCWSTR, index: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetGetDisplayInformationIndex(servername, level.toInt(), prefix, index).toUInt()

public actual fun NetGetJoinInformation(lpserver: PCWSTR, lpnamebuffer: Long, buffertype: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetGetJoinInformation(lpserver, lpnamebuffer, buffertype).toUInt()

public actual fun NetGetJoinableOUs(lpserver: PCWSTR, lpdomain: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, oucount: Long, ous: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetGetJoinableOUs(lpserver, lpdomain, lpaccount, lppassword, oucount, ous).toUInt()

public actual fun NetGroupAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupAdd(servername, level.toInt(), buf, parm_err).toUInt()

public actual fun NetGroupAddUser(servername: PCWSTR, groupname: PCWSTR, username: PCWSTR): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupAddUser(servername, groupname, username).toUInt()

public actual fun NetGroupDel(servername: PCWSTR, groupname: PCWSTR): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupDel(servername, groupname).toUInt()

public actual fun NetGroupDelUser(servername: PCWSTR, groupname: PCWSTR, username: PCWSTR): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupDelUser(servername, groupname, username).toUInt()

public actual fun NetGroupEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupEnum(servername, level.toInt(), bufptr, prefmaxlen.toInt(), entriesread, totalentries, resume_handle).toUInt()

public actual fun NetGroupGetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, bufptr: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupGetInfo(servername, groupname, level.toInt(), bufptr).toUInt()

public actual fun NetGroupGetUsers(servername: PCWSTR, groupname: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupGetUsers(servername, groupname, level.toInt(), bufptr, prefmaxlen.toInt(), entriesread, totalentries, resumehandle).toUInt()

public actual fun NetGroupSetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupSetInfo(servername, groupname, level.toInt(), buf, parm_err).toUInt()

public actual fun NetGroupSetUsers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetGroupSetUsers(servername, groupname, level.toInt(), buf, totalentries.toInt()).toUInt()

public actual fun NetIsServiceAccount(servername: PCWSTR, accountname: PCWSTR, isservice: Long): NTSTATUS =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetIsServiceAccount(servername, accountname, isservice)

public actual fun NetJoinDomain(lpserver: PCWSTR, lpdomain: PCWSTR, lpmachineaccountou: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, fjoinoptions: NET_JOIN_DOMAIN_JOIN_OPTIONS): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetJoinDomain(lpserver, lpdomain, lpmachineaccountou, lpaccount, lppassword, fjoinoptions.toInt()).toUInt()

public actual fun NetLocalGroupAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupAdd(servername, level.toInt(), buf, parm_err).toUInt()

public actual fun NetLocalGroupAddMember(servername: PCWSTR, groupname: PCWSTR, membersid: PSID): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupAddMember(servername, groupname, membersid).toUInt()

public actual fun NetLocalGroupAddMembers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupAddMembers(servername, groupname, level.toInt(), buf, totalentries.toInt()).toUInt()

public actual fun NetLocalGroupDel(servername: PCWSTR, groupname: PCWSTR): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupDel(servername, groupname).toUInt()

public actual fun NetLocalGroupDelMember(servername: PCWSTR, groupname: PCWSTR, membersid: PSID): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupDelMember(servername, groupname, membersid).toUInt()

public actual fun NetLocalGroupDelMembers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupDelMembers(servername, groupname, level.toInt(), buf, totalentries.toInt()).toUInt()

public actual fun NetLocalGroupEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupEnum(servername, level.toInt(), bufptr, prefmaxlen.toInt(), entriesread, totalentries, resumehandle).toUInt()

public actual fun NetLocalGroupGetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, bufptr: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupGetInfo(servername, groupname, level.toInt(), bufptr).toUInt()

public actual fun NetLocalGroupGetMembers(servername: PCWSTR, localgroupname: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupGetMembers(servername, localgroupname, level.toInt(), bufptr, prefmaxlen.toInt(), entriesread, totalentries, resumehandle).toUInt()

public actual fun NetLocalGroupSetInfo(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupSetInfo(servername, groupname, level.toInt(), buf, parm_err).toUInt()

public actual fun NetLocalGroupSetMembers(servername: PCWSTR, groupname: PCWSTR, level: UInt, buf: Long, totalentries: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetLocalGroupSetMembers(servername, groupname, level.toInt(), buf, totalentries.toInt()).toUInt()

public actual fun NetMessageBufferSend(servername: PCWSTR, msgname: PCWSTR, fromname: PCWSTR, buf: Long, buflen: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetMessageBufferSend(servername, msgname, fromname, buf, buflen.toInt()).toUInt()

public actual fun NetMessageNameAdd(servername: PCWSTR, msgname: PCWSTR): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetMessageNameAdd(servername, msgname).toUInt()

public actual fun NetMessageNameDel(servername: PCWSTR, msgname: PCWSTR): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetMessageNameDel(servername, msgname).toUInt()

public actual fun NetMessageNameEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetMessageNameEnum(servername, level.toInt(), bufptr, prefmaxlen.toInt(), entriesread, totalentries, resume_handle).toUInt()

public actual fun NetMessageNameGetInfo(servername: PCWSTR, msgname: PCWSTR, level: UInt, bufptr: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetMessageNameGetInfo(servername, msgname, level.toInt(), bufptr).toUInt()

public actual fun NetProvisionComputerAccount(lpdomain: PCWSTR, lpmachinename: PCWSTR, lpmachineaccountou: PCWSTR, lpdcname: PCWSTR, dwoptions: NETSETUP_PROVISION, pprovisionbindata: Long, pdwprovisionbindatasize: Long, pprovisiontextdata: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetProvisionComputerAccount(lpdomain, lpmachinename, lpmachineaccountou, lpdcname, dwoptions.toInt(), pprovisionbindata, pdwprovisionbindatasize, pprovisiontextdata).toUInt()

public actual fun NetQueryDisplayInformation(servername: PCWSTR, level: UInt, index: UInt, entriesrequested: UInt, preferredmaximumlength: UInt, returnedentrycount: Long, sortedbuffer: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetQueryDisplayInformation(servername, level.toInt(), index.toInt(), entriesrequested.toInt(), preferredmaximumlength.toInt(), returnedentrycount, sortedbuffer).toUInt()

public actual fun NetQueryServiceAccount(servername: PCWSTR, accountname: PCWSTR, infolevel: UInt, buffer: Long): NTSTATUS =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetQueryServiceAccount(servername, accountname, infolevel.toInt(), buffer)

public actual fun NetRemoteComputerSupports(uncservername: PCWSTR, optionswanted: NET_REMOTE_COMPUTER_SUPPORTS_OPTIONS, optionssupported: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetRemoteComputerSupports(uncservername, optionswanted.toInt(), optionssupported).toUInt()

public actual fun NetRemoteTOD(uncservername: PCWSTR, bufferptr: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetRemoteTOD(uncservername, bufferptr).toUInt()

public actual fun NetRemoveAlternateComputerName(server: PCWSTR, alternatename: PCWSTR, domainaccount: PCWSTR, domainaccountpassword: PCWSTR, reserved: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetRemoveAlternateComputerName(server, alternatename, domainaccount, domainaccountpassword, reserved.toInt()).toUInt()

public actual fun NetRemoveServiceAccount(servername: PCWSTR, accountname: PCWSTR, flags: UInt): NTSTATUS =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetRemoveServiceAccount(servername, accountname, flags.toInt())

public actual fun NetRenameMachineInDomain(lpserver: PCWSTR, lpnewmachinename: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, frenameoptions: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetRenameMachineInDomain(lpserver, lpnewmachinename, lpaccount, lppassword, frenameoptions.toInt()).toUInt()

public actual fun NetReplExportDirAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirAdd(servername, level.toInt(), buf, parm_err).toUInt()

public actual fun NetReplExportDirDel(servername: PCWSTR, dirname: PCWSTR): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirDel(servername, dirname).toUInt()

public actual fun NetReplExportDirEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirEnum(servername, level.toInt(), bufptr, prefmaxlen.toInt(), entriesread, totalentries, resumehandle).toUInt()

public actual fun NetReplExportDirGetInfo(servername: PCWSTR, dirname: PCWSTR, level: UInt, bufptr: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirGetInfo(servername, dirname, level.toInt(), bufptr).toUInt()

public actual fun NetReplExportDirLock(servername: PCWSTR, dirname: PCWSTR): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirLock(servername, dirname).toUInt()

public actual fun NetReplExportDirSetInfo(servername: PCWSTR, dirname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirSetInfo(servername, dirname, level.toInt(), buf, parm_err).toUInt()

public actual fun NetReplExportDirUnlock(servername: PCWSTR, dirname: PCWSTR, unlockforce: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetReplExportDirUnlock(servername, dirname, unlockforce.toInt()).toUInt()

public actual fun NetReplGetInfo(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetReplGetInfo(servername, level.toInt(), bufptr).toUInt()

public actual fun NetReplImportDirAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirAdd(servername, level.toInt(), buf, parm_err).toUInt()

public actual fun NetReplImportDirDel(servername: PCWSTR, dirname: PCWSTR): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirDel(servername, dirname).toUInt()

public actual fun NetReplImportDirEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirEnum(servername, level.toInt(), bufptr, prefmaxlen.toInt(), entriesread, totalentries, resumehandle).toUInt()

public actual fun NetReplImportDirGetInfo(servername: PCWSTR, dirname: PCWSTR, level: UInt, bufptr: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirGetInfo(servername, dirname, level.toInt(), bufptr).toUInt()

public actual fun NetReplImportDirLock(servername: PCWSTR, dirname: PCWSTR): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirLock(servername, dirname).toUInt()

public actual fun NetReplImportDirUnlock(servername: PCWSTR, dirname: PCWSTR, unlockforce: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetReplImportDirUnlock(servername, dirname, unlockforce.toInt()).toUInt()

public actual fun NetReplSetInfo(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetReplSetInfo(servername, level.toInt(), buf, parm_err).toUInt()

public actual fun NetRequestOfflineDomainJoin(pprovisionbindata: Long, cbprovisionbindatasize: UInt, dwoptions: NET_REQUEST_PROVISION_OPTIONS, lpwindowspath: PCWSTR): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetRequestOfflineDomainJoin(pprovisionbindata, cbprovisionbindatasize.toInt(), dwoptions.toInt(), lpwindowspath).toUInt()

public actual fun NetRequestProvisioningPackageInstall(ppackagebindata: Long, dwpackagebindatasize: UInt, dwprovisionoptions: NET_REQUEST_PROVISION_OPTIONS, lpwindowspath: PCWSTR, pvreserved: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetRequestProvisioningPackageInstall(ppackagebindata, dwpackagebindatasize.toInt(), dwprovisionoptions.toInt(), lpwindowspath, pvreserved).toUInt()

public actual fun NetScheduleJobAdd(servername: PCWSTR, buffer: Long, jobid: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetScheduleJobAdd(servername, buffer, jobid).toUInt()

public actual fun NetScheduleJobDel(servername: PCWSTR, minjobid: UInt, maxjobid: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetScheduleJobDel(servername, minjobid.toInt(), maxjobid.toInt()).toUInt()

public actual fun NetScheduleJobEnum(servername: PCWSTR, pointertobuffer: Long, prefferedmaximumlength: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetScheduleJobEnum(servername, pointertobuffer, prefferedmaximumlength.toInt(), entriesread, totalentries, resumehandle).toUInt()

public actual fun NetScheduleJobGetInfo(servername: PCWSTR, jobid: UInt, pointertobuffer: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetScheduleJobGetInfo(servername, jobid.toInt(), pointertobuffer).toUInt()

public actual fun NetServerComputerNameAdd(servername: PCWSTR, emulateddomainname: PCWSTR, emulatedservername: PCWSTR): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetServerComputerNameAdd(servername, emulateddomainname, emulatedservername).toUInt()

public actual fun NetServerComputerNameDel(servername: PCWSTR, emulatedservername: PCWSTR): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetServerComputerNameDel(servername, emulatedservername).toUInt()

public actual fun NetServerDiskEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetServerDiskEnum(servername, level.toInt(), bufptr, prefmaxlen.toInt(), entriesread, totalentries, resume_handle).toUInt()

public actual fun NetServerEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, servertype: NET_SERVER_TYPE, domain: PCWSTR, resume_handle: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetServerEnum(servername, level.toInt(), bufptr, prefmaxlen.toInt(), entriesread, totalentries, servertype.toInt(), domain, resume_handle).toUInt()

public actual fun NetServerGetInfo(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetServerGetInfo(servername, level.toInt(), bufptr).toUInt()

public actual fun NetServerSetInfo(servername: PCWSTR, level: UInt, buf: Long, parmerror: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetServerSetInfo(servername, level.toInt(), buf, parmerror).toUInt()

public actual fun NetServerTransportAdd(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetServerTransportAdd(servername, level.toInt(), bufptr).toUInt()

public actual fun NetServerTransportAddEx(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetServerTransportAddEx(servername, level.toInt(), bufptr).toUInt()

public actual fun NetServerTransportDel(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetServerTransportDel(servername, level.toInt(), bufptr).toUInt()

public actual fun NetServerTransportEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetServerTransportEnum(servername, level.toInt(), bufptr, prefmaxlen.toInt(), entriesread, totalentries, resume_handle).toUInt()

public actual fun NetServiceControl(servername: PCWSTR, service: PCWSTR, opcode: UInt, arg: UInt, bufptr: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetServiceControl(servername, service, opcode.toInt(), arg.toInt(), bufptr).toUInt()

public actual fun NetServiceEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetServiceEnum(servername, level.toInt(), bufptr, prefmaxlen.toInt(), entriesread, totalentries, resume_handle).toUInt()

public actual fun NetServiceGetInfo(servername: PCWSTR, service: PCWSTR, level: UInt, bufptr: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetServiceGetInfo(servername, service, level.toInt(), bufptr).toUInt()

public actual fun NetServiceInstall(servername: PCWSTR, service: PCWSTR, argc: UInt, argv: Long, bufptr: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetServiceInstall(servername, service, argc.toInt(), argv, bufptr).toUInt()

public actual fun NetSetPrimaryComputerName(server: PCWSTR, primaryname: PCWSTR, domainaccount: PCWSTR, domainaccountpassword: PCWSTR, reserved: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetSetPrimaryComputerName(server, primaryname, domainaccount, domainaccountpassword, reserved.toInt()).toUInt()

public actual fun NetUnjoinDomain(lpserver: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, funjoinoptions: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetUnjoinDomain(lpserver, lpaccount, lppassword, funjoinoptions.toInt()).toUInt()

public actual fun NetUseAdd(servername: Long, levelflags: UInt, buf: Long, parm_err: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetUseAdd(servername, levelflags.toInt(), buf, parm_err).toUInt()

public actual fun NetUseDel(uncservername: PCWSTR, usename: PCWSTR, forcelevelflags: FORCE_LEVEL_FLAGS): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetUseDel(uncservername, usename, forcelevelflags.toInt()).toUInt()

public actual fun NetUseEnum(uncservername: PCWSTR, levelflags: UInt, bufptr: Long, preferedmaximumsize: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetUseEnum(uncservername, levelflags.toInt(), bufptr, preferedmaximumsize.toInt(), entriesread, totalentries, resumehandle).toUInt()

public actual fun NetUseGetInfo(uncservername: PCWSTR, usename: PCWSTR, levelflags: UInt, bufptr: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetUseGetInfo(uncservername, usename, levelflags.toInt(), bufptr).toUInt()

public actual fun NetUserAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetUserAdd(servername, level.toInt(), buf, parm_err).toUInt()

public actual fun NetUserChangePassword(domainname: PCWSTR, username: PCWSTR, oldpassword: PCWSTR, newpassword: PCWSTR): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetUserChangePassword(domainname, username, oldpassword, newpassword).toUInt()

public actual fun NetUserDel(servername: PCWSTR, username: PCWSTR): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetUserDel(servername, username).toUInt()

public actual fun NetUserEnum(servername: PCWSTR, level: UInt, filter: NET_USER_ENUM_FILTER_FLAGS, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetUserEnum(servername, level.toInt(), filter.toInt(), bufptr, prefmaxlen.toInt(), entriesread, totalentries, resume_handle).toUInt()

public actual fun NetUserGetGroups(servername: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetUserGetGroups(servername, username, level.toInt(), bufptr, prefmaxlen.toInt(), entriesread, totalentries).toUInt()

public actual fun NetUserGetInfo(servername: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetUserGetInfo(servername, username, level.toInt(), bufptr).toUInt()

public actual fun NetUserGetLocalGroups(servername: PCWSTR, username: PCWSTR, level: UInt, flags: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetUserGetLocalGroups(servername, username, level.toInt(), flags.toInt(), bufptr, prefmaxlen.toInt(), entriesread, totalentries).toUInt()

public actual fun NetUserModalsGet(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetUserModalsGet(servername, level.toInt(), bufptr).toUInt()

public actual fun NetUserModalsSet(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetUserModalsSet(servername, level.toInt(), buf, parm_err).toUInt()

public actual fun NetUserSetGroups(servername: PCWSTR, username: PCWSTR, level: UInt, buf: Long, num_entries: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetUserSetGroups(servername, username, level.toInt(), buf, num_entries.toInt()).toUInt()

public actual fun NetUserSetInfo(servername: PCWSTR, username: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetUserSetInfo(servername, username, level.toInt(), buf, parm_err).toUInt()

public actual fun NetValidateName(lpserver: PCWSTR, lpname: PCWSTR, lpaccount: PCWSTR, lppassword: PCWSTR, nametype: NETSETUP_NAME_TYPE): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetValidateName(lpserver, lpname, lpaccount, lppassword, nametype).toUInt()

public actual fun NetValidatePasswordPolicy(servername: PCWSTR, qualifier: Long, validationtype: NET_VALIDATE_PASSWORD_TYPE, inputarg: Long, outputarg: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetValidatePasswordPolicy(servername, qualifier, validationtype, inputarg, outputarg).toUInt()

public actual fun NetValidatePasswordPolicyFree(outputarg: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetValidatePasswordPolicyFree(outputarg).toUInt()

public actual fun NetWkstaGetInfo(servername: PCWSTR, level: UInt, bufptr: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaGetInfo(servername, level.toInt(), bufptr).toUInt()

public actual fun NetWkstaSetInfo(servername: PCWSTR, level: UInt, buffer: Long, parm_err: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaSetInfo(servername, level.toInt(), buffer, parm_err).toUInt()

public actual fun NetWkstaTransportAdd(servername: Long, level: UInt, buf: Long, parm_err: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaTransportAdd(servername, level.toInt(), buf, parm_err).toUInt()

public actual fun NetWkstaTransportDel(servername: PCWSTR, transportname: PCWSTR, ucond: FORCE_LEVEL_FLAGS): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaTransportDel(servername, transportname, ucond.toInt()).toUInt()

public actual fun NetWkstaTransportEnum(servername: Long, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaTransportEnum(servername, level.toInt(), bufptr, prefmaxlen.toInt(), entriesread, totalentries, resume_handle).toUInt()

public actual fun NetWkstaUserEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaUserEnum(servername, level.toInt(), bufptr, prefmaxlen.toInt(), entriesread, totalentries, resumehandle).toUInt()

public actual fun NetWkstaUserGetInfo(reserved: PCWSTR, level: UInt, bufptr: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaUserGetInfo(reserved, level.toInt(), bufptr).toUInt()

public actual fun NetWkstaUserSetInfo(reserved: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_NetWkstaUserSetInfo(reserved, level.toInt(), buf, parm_err).toUInt()

public actual fun RouterAssert(pszfailedassertion: PCSTR, pszfilename: PCSTR, dwlinenumber: UInt, pszmessage: PCSTR) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_RouterAssert(pszfailedassertion, pszfilename, dwlinenumber.toInt(), pszmessage)
}

public actual fun RouterGetErrorStringA(dwerrorcode: UInt, lplpszerrorstring: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_RouterGetErrorStringA(dwerrorcode.toInt(), lplpszerrorstring).toUInt()

public actual fun RouterGetErrorStringW(dwerrorcode: UInt, lplpwszerrorstring: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_RouterGetErrorStringW(dwerrorcode.toInt(), lplpwszerrorstring).toUInt()

public actual fun RouterLogDeregisterA(hloghandle: HANDLE) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogDeregisterA(hloghandle)
}

public actual fun RouterLogDeregisterW(hloghandle: HANDLE) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogDeregisterW(hloghandle)
}

public actual fun RouterLogEventA(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventA(hloghandle, dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray, dwerrorcode.toInt())
}

public actual fun RouterLogEventDataA(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwdatabytes: UInt, lpdatabytes: Long) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventDataA(hloghandle, dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray, dwdatabytes.toInt(), lpdatabytes)
}

public actual fun RouterLogEventDataW(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwdatabytes: UInt, lpdatabytes: Long) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventDataW(hloghandle, dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray, dwdatabytes.toInt(), lpdatabytes)
}

public actual fun RouterLogEventExA(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCSTR) {
}

public actual fun RouterLogEventExW(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCWSTR) {
}

public actual fun RouterLogEventStringA(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt, dwerrorindex: UInt) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventStringA(hloghandle, dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray, dwerrorcode.toInt(), dwerrorindex.toInt())
}

public actual fun RouterLogEventStringW(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt, dwerrorindex: UInt) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventStringW(hloghandle, dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray, dwerrorcode.toInt(), dwerrorindex.toInt())
}

public actual fun RouterLogEventValistExA(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCSTR, arglist: Long) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventValistExA(hloghandle, dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), ptszformat, arglist)
}

public actual fun RouterLogEventValistExW(hloghandle: HANDLE, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: PCWSTR, arglist: Long) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventValistExW(hloghandle, dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), ptszformat, arglist)
}

public actual fun RouterLogEventW(hloghandle: HANDLE, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: Long, dwerrorcode: UInt) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogEventW(hloghandle, dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray, dwerrorcode.toInt())
}

public actual fun RouterLogRegisterA(lpszsource: PCSTR): HANDLE =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogRegisterA(lpszsource)

public actual fun RouterLogRegisterW(lpszsource: PCWSTR): HANDLE =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_RouterLogRegisterW(lpszsource)

public actual fun SetNetScheduleAccountInformation(pwszservername: PCWSTR, pwszaccount: PCWSTR, pwszpassword: PCWSTR): HRESULT =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_SetNetScheduleAccountInformation(pwszservername, pwszaccount, pwszpassword)

public actual fun TraceDeregisterA(dwtraceid: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_TraceDeregisterA(dwtraceid.toInt()).toUInt()

public actual fun TraceDeregisterExA(dwtraceid: UInt, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_TraceDeregisterExA(dwtraceid.toInt(), dwflags.toInt()).toUInt()

public actual fun TraceDeregisterExW(dwtraceid: UInt, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_TraceDeregisterExW(dwtraceid.toInt(), dwflags.toInt()).toUInt()

public actual fun TraceDeregisterW(dwtraceid: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_TraceDeregisterW(dwtraceid.toInt()).toUInt()

public actual fun TraceDumpExA(dwtraceid: UInt, dwflags: UInt, lpbbytes: Long, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: BOOL, lpszprefix: PCSTR): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_TraceDumpExA(dwtraceid.toInt(), dwflags.toInt(), lpbbytes, dwbytecount.toInt(), dwgroupsize.toInt(), baddressprefix, lpszprefix).toUInt()

public actual fun TraceDumpExW(dwtraceid: UInt, dwflags: UInt, lpbbytes: Long, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: BOOL, lpszprefix: PCWSTR): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_TraceDumpExW(dwtraceid.toInt(), dwflags.toInt(), lpbbytes, dwbytecount.toInt(), dwgroupsize.toInt(), baddressprefix, lpszprefix).toUInt()

public actual fun TraceGetConsoleA(dwtraceid: UInt, lphconsole: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_TraceGetConsoleA(dwtraceid.toInt(), lphconsole).toUInt()

public actual fun TraceGetConsoleW(dwtraceid: UInt, lphconsole: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_TraceGetConsoleW(dwtraceid.toInt(), lphconsole).toUInt()

public actual fun TracePrintfA(dwtraceid: UInt, lpszformat: PCSTR): UInt =
    0u

public actual fun TracePrintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: PCSTR): UInt =
    0u

public actual fun TracePrintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: PCWSTR): UInt =
    0u

public actual fun TracePrintfW(dwtraceid: UInt, lpszformat: PCWSTR): UInt =
    0u

public actual fun TracePutsExA(dwtraceid: UInt, dwflags: UInt, lpszstring: PCSTR): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_TracePutsExA(dwtraceid.toInt(), dwflags.toInt(), lpszstring).toUInt()

public actual fun TracePutsExW(dwtraceid: UInt, dwflags: UInt, lpszstring: PCWSTR): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_TracePutsExW(dwtraceid.toInt(), dwflags.toInt(), lpszstring).toUInt()

public actual fun TraceRegisterExA(lpszcallername: PCSTR, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_TraceRegisterExA(lpszcallername, dwflags.toInt()).toUInt()

public actual fun TraceRegisterExW(lpszcallername: PCWSTR, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_TraceRegisterExW(lpszcallername, dwflags.toInt()).toUInt()

public actual fun TraceVprintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: PCSTR, arglist: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_TraceVprintfExA(dwtraceid.toInt(), dwflags.toInt(), lpszformat, arglist).toUInt()

public actual fun TraceVprintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: PCWSTR, arglist: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_TraceVprintfExW(dwtraceid.toInt(), dwflags.toInt(), lpszformat, arglist).toUInt()
