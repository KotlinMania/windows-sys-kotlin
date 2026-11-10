@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32NetworkmanagementNetmanagementJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_getNetScheduleAccountInformation(pwszservername: Long, ccaccount: Int, wszaccount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_iNetLogonControl2(servername: Long, functioncode: Int, querylevel: Int, data: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_logErrorA(dwmessageid: Int, cnumberofsubstrings: Int, plpwssubstrings: Long, dwerrorcode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_logErrorW(dwmessageid: Int, cnumberofsubstrings: Int, plpwssubstrings: Long, dwerrorcode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_logEventA(weventtype: Int, dwmessageid: Int, cnumberofsubstrings: Int, plpwssubstrings: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_logEventW(weventtype: Int, dwmessageid: Int, cnumberofsubstrings: Int, plpwssubstrings: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_mprSetupProtocolEnum(dwtransportid: Int, lplpbuffer: Long, lpdwentriesread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_mprSetupProtocolFree(lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netAccessAdd(servername: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netAccessDel(servername: Long, resource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netAccessEnum(servername: Long, basepath: Long, recursive: Int, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netAccessGetInfo(servername: Long, resource: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netAccessGetUserPerms(servername: Long, ugname: Long, resource: Long, perms: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netAccessSetInfo(servername: Long, resource: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netAddAlternateComputerName(server: Long, alternatename: Long, domainaccount: Long, domainaccountpassword: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netAddServiceAccount(servername: Long, accountname: Long, password: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netAlertRaise(alerttype: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netAlertRaiseEx(alerttype: Long, variableinfo: Long, variableinfosize: Int, servicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferAllocate(bytecount: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferFree(buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferReallocate(oldbuffer: Long, newbytecount: Int, newbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferSize(buffer: Long, bytecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netAuditClear(server: Long, backupfile: Long, service: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netAuditRead(server: Long, service: Long, auditloghandle: Long, offset: Int, reserved1: Long, reserved2: Int, offsetflag: Int, bufptr: Long, prefmaxlen: Int, bytesread: Long, totalavailable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netAuditWrite(type: Int, buf: Long, numbytes: Int, service: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netConfigGet(server: Long, component: Long, parameter: Long, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netConfigGetAll(server: Long, component: Long, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netConfigSet(server: Long, reserved1: Long, component: Long, level: Int, reserved2: Int, buf: Long, reserved3: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netCreateProvisioningPackage(pprovisioningparams: Long, pppackagebindata: Long, pdwpackagebindatasize: Long, pppackagetextdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netEnumerateComputerNames(server: Long, nametype: Int, reserved: Int, entrycount: Long, computernames: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netEnumerateServiceAccounts(servername: Long, flags: Int, accountscount: Long, accounts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netErrorLogClear(uncservername: Long, backupfile: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netErrorLogRead(uncservername: Long, reserved1: Long, errorloghandle: Long, offset: Int, reserved2: Long, reserved3: Int, offsetflag: Int, bufptr: Long, prefmaxsize: Int, bytesread: Long, totalavailable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netErrorLogWrite(reserved1: Long, code: Int, component: Long, buffer: Long, numbytes: Int, msgbuf: Long, strcount: Int, reserved2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netFreeAadJoinInformation(pjoininfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netGetAadJoinInformation(pcsztenantid: Long, ppjoininfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netGetAnyDCName(servername: Long, domainname: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netGetDCName(servername: Long, domainname: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netGetDisplayInformationIndex(servername: Long, level: Int, prefix: Long, index: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netGetJoinInformation(lpserver: Long, lpnamebuffer: Long, buffertype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netGetJoinableOUs(lpserver: Long, lpdomain: Long, lpaccount: Long, lppassword: Long, oucount: Long, ous: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netGroupAdd(servername: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netGroupAddUser(servername: Long, groupname: Long, username: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netGroupDel(servername: Long, groupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netGroupDelUser(servername: Long, groupname: Long, username: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netGroupEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netGroupGetInfo(servername: Long, groupname: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netGroupGetUsers(servername: Long, groupname: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netGroupSetInfo(servername: Long, groupname: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netGroupSetUsers(servername: Long, groupname: Long, level: Int, buf: Long, totalentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netIsServiceAccount(servername: Long, accountname: Long, isservice: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netJoinDomain(lpserver: Long, lpdomain: Long, lpmachineaccountou: Long, lpaccount: Long, lppassword: Long, fjoinoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupAdd(servername: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupAddMember(servername: Long, groupname: Long, membersid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupAddMembers(servername: Long, groupname: Long, level: Int, buf: Long, totalentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupDel(servername: Long, groupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupDelMember(servername: Long, groupname: Long, membersid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupDelMembers(servername: Long, groupname: Long, level: Int, buf: Long, totalentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupGetInfo(servername: Long, groupname: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupGetMembers(servername: Long, localgroupname: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupSetInfo(servername: Long, groupname: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupSetMembers(servername: Long, groupname: Long, level: Int, buf: Long, totalentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netMessageBufferSend(servername: Long, msgname: Long, fromname: Long, buf: Long, buflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameAdd(servername: Long, msgname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameDel(servername: Long, msgname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameGetInfo(servername: Long, msgname: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netProvisionComputerAccount(lpdomain: Long, lpmachinename: Long, lpmachineaccountou: Long, lpdcname: Long, dwoptions: Int, pprovisionbindata: Long, pdwprovisionbindatasize: Long, pprovisiontextdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netQueryDisplayInformation(servername: Long, level: Int, index: Int, entriesrequested: Int, preferredmaximumlength: Int, returnedentrycount: Long, sortedbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netQueryServiceAccount(servername: Long, accountname: Long, infolevel: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netRemoteComputerSupports(uncservername: Long, optionswanted: Int, optionssupported: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netRemoteTOD(uncservername: Long, bufferptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netRemoveAlternateComputerName(server: Long, alternatename: Long, domainaccount: Long, domainaccountpassword: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netRemoveServiceAccount(servername: Long, accountname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netRenameMachineInDomain(lpserver: Long, lpnewmachinename: Long, lpaccount: Long, lppassword: Long, frenameoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirAdd(servername: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirDel(servername: Long, dirname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirGetInfo(servername: Long, dirname: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirLock(servername: Long, dirname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirSetInfo(servername: Long, dirname: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirUnlock(servername: Long, dirname: Long, unlockforce: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netReplGetInfo(servername: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirAdd(servername: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirDel(servername: Long, dirname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirGetInfo(servername: Long, dirname: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirLock(servername: Long, dirname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirUnlock(servername: Long, dirname: Long, unlockforce: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netReplSetInfo(servername: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netRequestOfflineDomainJoin(pprovisionbindata: Long, cbprovisionbindatasize: Int, dwoptions: Int, lpwindowspath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netRequestProvisioningPackageInstall(ppackagebindata: Long, dwpackagebindatasize: Int, dwprovisionoptions: Int, lpwindowspath: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobAdd(servername: Long, buffer: Long, jobid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobDel(servername: Long, minjobid: Int, maxjobid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobEnum(servername: Long, pointertobuffer: Long, prefferedmaximumlength: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobGetInfo(servername: Long, jobid: Int, pointertobuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netServerComputerNameAdd(servername: Long, emulateddomainname: Long, emulatedservername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netServerComputerNameDel(servername: Long, emulatedservername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netServerDiskEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netServerEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, servertype: Int, domain: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netServerGetInfo(servername: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netServerSetInfo(servername: Long, level: Int, buf: Long, parmerror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportAdd(servername: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportAddEx(servername: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportDel(servername: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netServiceControl(servername: Long, service: Long, opcode: Int, arg: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netServiceEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netServiceGetInfo(servername: Long, service: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netServiceInstall(servername: Long, service: Long, argc: Int, argv: Long, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netSetPrimaryComputerName(server: Long, primaryname: Long, domainaccount: Long, domainaccountpassword: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netUnjoinDomain(lpserver: Long, lpaccount: Long, lppassword: Long, funjoinoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netUseAdd(servername: Long, levelflags: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netUseDel(uncservername: Long, usename: Long, forcelevelflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netUseEnum(uncservername: Long, levelflags: Int, bufptr: Long, preferedmaximumsize: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netUseGetInfo(uncservername: Long, usename: Long, levelflags: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netUserAdd(servername: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netUserChangePassword(domainname: Long, username: Long, oldpassword: Long, newpassword: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netUserDel(servername: Long, username: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netUserEnum(servername: Long, level: Int, filter: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netUserGetGroups(servername: Long, username: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netUserGetInfo(servername: Long, username: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netUserGetLocalGroups(servername: Long, username: Long, level: Int, flags: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netUserModalsGet(servername: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netUserModalsSet(servername: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netUserSetGroups(servername: Long, username: Long, level: Int, buf: Long, numEntries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netUserSetInfo(servername: Long, username: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netValidateName(lpserver: Long, lpname: Long, lpaccount: Long, lppassword: Long, nametype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netValidatePasswordPolicy(servername: Long, qualifier: Long, validationtype: Int, inputarg: Long, outputarg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netValidatePasswordPolicyFree(outputarg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netWkstaGetInfo(servername: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netWkstaSetInfo(servername: Long, level: Int, buffer: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netWkstaTransportAdd(servername: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netWkstaTransportDel(servername: Long, transportname: Long, ucond: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netWkstaTransportEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netWkstaUserEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netWkstaUserGetInfo(reserved: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_netWkstaUserSetInfo(reserved: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_routerAssert(pszfailedassertion: Long, pszfilename: Long, dwlinenumber: Int, pszmessage: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_routerGetErrorStringA(dwerrorcode: Int, lplpszerrorstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_routerGetErrorStringW(dwerrorcode: Int, lplpwszerrorstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_routerLogDeregisterA(hloghandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_routerLogDeregisterW(hloghandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventA(hloghandle: Long, dweventtype: Int, dwmessageid: Int, dwsubstringcount: Int, plpszsubstringarray: Long, dwerrorcode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventDataA(hloghandle: Long, dweventtype: Int, dwmessageid: Int, dwsubstringcount: Int, plpszsubstringarray: Long, dwdatabytes: Int, lpdatabytes: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventDataW(hloghandle: Long, dweventtype: Int, dwmessageid: Int, dwsubstringcount: Int, plpszsubstringarray: Long, dwdatabytes: Int, lpdatabytes: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventExA(hloghandle: Long, dweventtype: Int, dwerrorcode: Int, dwmessageid: Int, ptszformat: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventExW(hloghandle: Long, dweventtype: Int, dwerrorcode: Int, dwmessageid: Int, ptszformat: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventStringA(hloghandle: Long, dweventtype: Int, dwmessageid: Int, dwsubstringcount: Int, plpszsubstringarray: Long, dwerrorcode: Int, dwerrorindex: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventStringW(hloghandle: Long, dweventtype: Int, dwmessageid: Int, dwsubstringcount: Int, plpszsubstringarray: Long, dwerrorcode: Int, dwerrorindex: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventValistExA(hloghandle: Long, dweventtype: Int, dwerrorcode: Int, dwmessageid: Int, ptszformat: Long, arglist: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventValistExW(hloghandle: Long, dweventtype: Int, dwerrorcode: Int, dwmessageid: Int, ptszformat: Long, arglist: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventW(hloghandle: Long, dweventtype: Int, dwmessageid: Int, dwsubstringcount: Int, plpszsubstringarray: Long, dwerrorcode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_routerLogRegisterA(lpszsource: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_routerLogRegisterW(lpszsource: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_setNetScheduleAccountInformation(pwszservername: Long, pwszaccount: Long, pwszpassword: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterA(dwtraceid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterExA(dwtraceid: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterExW(dwtraceid: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterW(dwtraceid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_traceDumpExA(dwtraceid: Int, dwflags: Int, lpbbytes: Long, dwbytecount: Int, dwgroupsize: Int, baddressprefix: Int, lpszprefix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_traceDumpExW(dwtraceid: Int, dwflags: Int, lpbbytes: Long, dwbytecount: Int, dwgroupsize: Int, baddressprefix: Int, lpszprefix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_traceGetConsoleA(dwtraceid: Int, lphconsole: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_traceGetConsoleW(dwtraceid: Int, lphconsole: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfA(dwtraceid: Int, lpszformat: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfExA(dwtraceid: Int, dwflags: Int, lpszformat: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfExW(dwtraceid: Int, dwflags: Int, lpszformat: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfW(dwtraceid: Int, lpszformat: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_tracePutsExA(dwtraceid: Int, dwflags: Int, lpszstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_tracePutsExW(dwtraceid: Int, dwflags: Int, lpszstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_traceRegisterExA(lpszcallername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_traceRegisterExW(lpszcallername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_traceVprintfExA(dwtraceid: Int, dwflags: Int, lpszformat: Long, arglist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netmanagement_traceVprintfExW(dwtraceid: Int, dwflags: Int, lpszformat: Long, arglist: Long): Int
}

public actual fun getNetScheduleAccountInformation(pwszservername: Pcwstr, ccaccount: UInt, wszaccount: Pwstr): Hresult =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_getNetScheduleAccountInformation((pwszservername?.value ?: 0L), ccaccount.toInt(), (wszaccount?.value ?: 0L))

public actual fun iNetLogonControl2(servername: Pcwstr, functioncode: UInt, querylevel: UInt, data: COpaquePointer?, buffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_iNetLogonControl2((servername?.value ?: 0L), functioncode.toInt(), querylevel.toInt(), (data?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun logErrorA(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: COpaquePointer?, dwerrorcode: UInt) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_logErrorA(dwmessageid.toInt(), cnumberofsubstrings.toInt(), (plpwssubstrings?.value ?: 0L), dwerrorcode.toInt())
}

public actual fun logErrorW(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: COpaquePointer?, dwerrorcode: UInt) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_logErrorW(dwmessageid.toInt(), cnumberofsubstrings.toInt(), (plpwssubstrings?.value ?: 0L), dwerrorcode.toInt())
}

public actual fun logEventA(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: COpaquePointer?) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_logEventA(weventtype.toInt(), dwmessageid.toInt(), cnumberofsubstrings.toInt(), (plpwssubstrings?.value ?: 0L))
}

public actual fun logEventW(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: COpaquePointer?) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_logEventW(weventtype.toInt(), dwmessageid.toInt(), cnumberofsubstrings.toInt(), (plpwssubstrings?.value ?: 0L))
}

public actual fun mprSetupProtocolEnum(dwtransportid: UInt, lplpbuffer: COpaquePointer?, lpdwentriesread: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_mprSetupProtocolEnum(dwtransportid.toInt(), (lplpbuffer?.value ?: 0L), (lpdwentriesread?.value ?: 0L)).toUInt()

public actual fun mprSetupProtocolFree(lpbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_mprSetupProtocolFree((lpbuffer?.value ?: 0L)).toUInt()

public actual fun netAccessAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netAccessAdd((servername?.value ?: 0L), level.toInt(), (buf?.value ?: 0L), (parmErr?.value ?: 0L)).toUInt()

public actual fun netAccessDel(servername: Pcwstr, resource: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netAccessDel((servername?.value ?: 0L), (resource?.value ?: 0L)).toUInt()

public actual fun netAccessEnum(servername: Pcwstr, basepath: Pcwstr, recursive: UInt, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netAccessEnum((servername?.value ?: 0L), (basepath?.value ?: 0L), recursive.toInt(), level.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L), (resumeHandle?.value ?: 0L)).toUInt()

public actual fun netAccessGetInfo(servername: Pcwstr, resource: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netAccessGetInfo((servername?.value ?: 0L), (resource?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L)).toUInt()

public actual fun netAccessGetUserPerms(servername: Pcwstr, ugname: Pcwstr, resource: Pcwstr, perms: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netAccessGetUserPerms((servername?.value ?: 0L), (ugname?.value ?: 0L), (resource?.value ?: 0L), (perms?.value ?: 0L)).toUInt()

public actual fun netAccessSetInfo(servername: Pcwstr, resource: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netAccessSetInfo((servername?.value ?: 0L), (resource?.value ?: 0L), level.toInt(), (buf?.value ?: 0L), (parmErr?.value ?: 0L)).toUInt()

public actual fun netAddAlternateComputerName(server: Pcwstr, alternatename: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netAddAlternateComputerName((server?.value ?: 0L), (alternatename?.value ?: 0L), (domainaccount?.value ?: 0L), (domainaccountpassword?.value ?: 0L), reserved.toInt()).toUInt()

public actual fun netAddServiceAccount(servername: Pcwstr, accountname: Pcwstr, password: Pcwstr, flags: UInt): Ntstatus =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netAddServiceAccount((servername?.value ?: 0L), (accountname?.value ?: 0L), (password?.value ?: 0L), flags.toInt())

public actual fun netAlertRaise(alerttype: Pcwstr, buffer: COpaquePointer?, buffersize: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netAlertRaise((alerttype?.value ?: 0L), (buffer?.value ?: 0L), buffersize.toInt()).toUInt()

public actual fun netAlertRaiseEx(alerttype: Pcwstr, variableinfo: COpaquePointer?, variableinfosize: UInt, servicename: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netAlertRaiseEx((alerttype?.value ?: 0L), (variableinfo?.value ?: 0L), variableinfosize.toInt(), (servicename?.value ?: 0L)).toUInt()

public actual fun netApiBufferAllocate(bytecount: UInt, buffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferAllocate(bytecount.toInt(), (buffer?.value ?: 0L)).toUInt()

public actual fun netApiBufferFree(buffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferFree((buffer?.value ?: 0L)).toUInt()

public actual fun netApiBufferReallocate(oldbuffer: COpaquePointer?, newbytecount: UInt, newbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferReallocate((oldbuffer?.value ?: 0L), newbytecount.toInt(), (newbuffer?.value ?: 0L)).toUInt()

public actual fun netApiBufferSize(buffer: COpaquePointer?, bytecount: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferSize((buffer?.value ?: 0L), (bytecount?.value ?: 0L)).toUInt()

public actual fun netAuditClear(server: Pcwstr, backupfile: Pcwstr, service: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netAuditClear((server?.value ?: 0L), (backupfile?.value ?: 0L), (service?.value ?: 0L)).toUInt()

public actual fun netAuditRead(server: Pcwstr, service: Pcwstr, auditloghandle: COpaquePointer?, offset: UInt, reserved1: COpaquePointer?, reserved2: UInt, offsetflag: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, bytesread: COpaquePointer?, totalavailable: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netAuditRead((server?.value ?: 0L), (service?.value ?: 0L), (auditloghandle?.value ?: 0L), offset.toInt(), (reserved1?.value ?: 0L), reserved2.toInt(), offsetflag.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (bytesread?.value ?: 0L), (totalavailable?.value ?: 0L)).toUInt()

public actual fun netAuditWrite(type: UInt, buf: COpaquePointer?, numbytes: UInt, service: Pcwstr, reserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netAuditWrite(type.toInt(), (buf?.value ?: 0L), numbytes.toInt(), (service?.value ?: 0L), (reserved?.value ?: 0L)).toUInt()

public actual fun netConfigGet(server: Pcwstr, component: Pcwstr, parameter: Pcwstr, bufptr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netConfigGet((server?.value ?: 0L), (component?.value ?: 0L), (parameter?.value ?: 0L), (bufptr?.value ?: 0L)).toUInt()

public actual fun netConfigGetAll(server: Pcwstr, component: Pcwstr, bufptr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netConfigGetAll((server?.value ?: 0L), (component?.value ?: 0L), (bufptr?.value ?: 0L)).toUInt()

public actual fun netConfigSet(server: Pcwstr, reserved1: Pcwstr, component: Pcwstr, level: UInt, reserved2: UInt, buf: COpaquePointer?, reserved3: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netConfigSet((server?.value ?: 0L), (reserved1?.value ?: 0L), (component?.value ?: 0L), level.toInt(), reserved2.toInt(), (buf?.value ?: 0L), reserved3.toInt()).toUInt()

public actual fun netCreateProvisioningPackage(pprovisioningparams: COpaquePointer?, pppackagebindata: COpaquePointer?, pdwpackagebindatasize: COpaquePointer?, pppackagetextdata: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netCreateProvisioningPackage((pprovisioningparams?.value ?: 0L), (pppackagebindata?.value ?: 0L), (pdwpackagebindatasize?.value ?: 0L), (pppackagetextdata?.value ?: 0L)).toUInt()

public actual fun netEnumerateComputerNames(server: Pcwstr, nametype: NetComputerNameType, reserved: UInt, entrycount: COpaquePointer?, computernames: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netEnumerateComputerNames((server?.value ?: 0L), nametype, reserved.toInt(), (entrycount?.value ?: 0L), (computernames?.value ?: 0L)).toUInt()

public actual fun netEnumerateServiceAccounts(servername: Pcwstr, flags: UInt, accountscount: COpaquePointer?, accounts: COpaquePointer?): Ntstatus =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netEnumerateServiceAccounts((servername?.value ?: 0L), flags.toInt(), (accountscount?.value ?: 0L), (accounts?.value ?: 0L))

public actual fun netErrorLogClear(uncservername: Pcwstr, backupfile: Pcwstr, reserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netErrorLogClear((uncservername?.value ?: 0L), (backupfile?.value ?: 0L), (reserved?.value ?: 0L)).toUInt()

public actual fun netErrorLogRead(uncservername: Pcwstr, reserved1: Pcwstr, errorloghandle: COpaquePointer?, offset: UInt, reserved2: COpaquePointer?, reserved3: UInt, offsetflag: UInt, bufptr: COpaquePointer?, prefmaxsize: UInt, bytesread: COpaquePointer?, totalavailable: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netErrorLogRead((uncservername?.value ?: 0L), (reserved1?.value ?: 0L), (errorloghandle?.value ?: 0L), offset.toInt(), (reserved2?.value ?: 0L), reserved3.toInt(), offsetflag.toInt(), (bufptr?.value ?: 0L), prefmaxsize.toInt(), (bytesread?.value ?: 0L), (totalavailable?.value ?: 0L)).toUInt()

public actual fun netErrorLogWrite(reserved1: COpaquePointer?, code: UInt, component: Pcwstr, buffer: COpaquePointer?, numbytes: UInt, msgbuf: COpaquePointer?, strcount: UInt, reserved2: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netErrorLogWrite((reserved1?.value ?: 0L), code.toInt(), (component?.value ?: 0L), (buffer?.value ?: 0L), numbytes.toInt(), (msgbuf?.value ?: 0L), strcount.toInt(), (reserved2?.value ?: 0L)).toUInt()

public actual fun netFreeAadJoinInformation(pjoininfo: COpaquePointer?) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netFreeAadJoinInformation((pjoininfo?.value ?: 0L))
}

public actual fun netGetAadJoinInformation(pcsztenantid: Pcwstr, ppjoininfo: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netGetAadJoinInformation((pcsztenantid?.value ?: 0L), (ppjoininfo?.value ?: 0L))

public actual fun netGetAnyDCName(servername: Pcwstr, domainname: Pcwstr, buffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netGetAnyDCName((servername?.value ?: 0L), (domainname?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun netGetDCName(servername: Pcwstr, domainname: Pcwstr, buffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netGetDCName((servername?.value ?: 0L), (domainname?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun netGetDisplayInformationIndex(servername: Pcwstr, level: UInt, prefix: Pcwstr, index: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netGetDisplayInformationIndex((servername?.value ?: 0L), level.toInt(), (prefix?.value ?: 0L), (index?.value ?: 0L)).toUInt()

public actual fun netGetJoinInformation(lpserver: Pcwstr, lpnamebuffer: COpaquePointer?, buffertype: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netGetJoinInformation((lpserver?.value ?: 0L), (lpnamebuffer?.value ?: 0L), (buffertype?.value ?: 0L)).toUInt()

public actual fun netGetJoinableOUs(lpserver: Pcwstr, lpdomain: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, oucount: COpaquePointer?, ous: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netGetJoinableOUs((lpserver?.value ?: 0L), (lpdomain?.value ?: 0L), (lpaccount?.value ?: 0L), (lppassword?.value ?: 0L), (oucount?.value ?: 0L), (ous?.value ?: 0L)).toUInt()

public actual fun netGroupAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netGroupAdd((servername?.value ?: 0L), level.toInt(), (buf?.value ?: 0L), (parmErr?.value ?: 0L)).toUInt()

public actual fun netGroupAddUser(servername: Pcwstr, groupname: Pcwstr, username: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netGroupAddUser((servername?.value ?: 0L), (groupname?.value ?: 0L), (username?.value ?: 0L)).toUInt()

public actual fun netGroupDel(servername: Pcwstr, groupname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netGroupDel((servername?.value ?: 0L), (groupname?.value ?: 0L)).toUInt()

public actual fun netGroupDelUser(servername: Pcwstr, groupname: Pcwstr, username: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netGroupDelUser((servername?.value ?: 0L), (groupname?.value ?: 0L), (username?.value ?: 0L)).toUInt()

public actual fun netGroupEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netGroupEnum((servername?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L), (resumeHandle?.value ?: 0L)).toUInt()

public actual fun netGroupGetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netGroupGetInfo((servername?.value ?: 0L), (groupname?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L)).toUInt()

public actual fun netGroupGetUsers(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netGroupGetUsers((servername?.value ?: 0L), (groupname?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L), (resumehandle?.value ?: 0L)).toUInt()

public actual fun netGroupSetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netGroupSetInfo((servername?.value ?: 0L), (groupname?.value ?: 0L), level.toInt(), (buf?.value ?: 0L), (parmErr?.value ?: 0L)).toUInt()

public actual fun netGroupSetUsers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, totalentries: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netGroupSetUsers((servername?.value ?: 0L), (groupname?.value ?: 0L), level.toInt(), (buf?.value ?: 0L), totalentries.toInt()).toUInt()

public actual fun netIsServiceAccount(servername: Pcwstr, accountname: Pcwstr, isservice: COpaquePointer?): Ntstatus =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netIsServiceAccount((servername?.value ?: 0L), (accountname?.value ?: 0L), (isservice?.value ?: 0L))

public actual fun netJoinDomain(lpserver: Pcwstr, lpdomain: Pcwstr, lpmachineaccountou: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, fjoinoptions: NetJoinDomainJoinOptions): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netJoinDomain((lpserver?.value ?: 0L), (lpdomain?.value ?: 0L), (lpmachineaccountou?.value ?: 0L), (lpaccount?.value ?: 0L), (lppassword?.value ?: 0L), fjoinoptions.toInt()).toUInt()

public actual fun netLocalGroupAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupAdd((servername?.value ?: 0L), level.toInt(), (buf?.value ?: 0L), (parmErr?.value ?: 0L)).toUInt()

public actual fun netLocalGroupAddMember(servername: Pcwstr, groupname: Pcwstr, membersid: Psid): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupAddMember((servername?.value ?: 0L), (groupname?.value ?: 0L), (membersid?.value ?: 0L)).toUInt()

public actual fun netLocalGroupAddMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, totalentries: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupAddMembers((servername?.value ?: 0L), (groupname?.value ?: 0L), level.toInt(), (buf?.value ?: 0L), totalentries.toInt()).toUInt()

public actual fun netLocalGroupDel(servername: Pcwstr, groupname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupDel((servername?.value ?: 0L), (groupname?.value ?: 0L)).toUInt()

public actual fun netLocalGroupDelMember(servername: Pcwstr, groupname: Pcwstr, membersid: Psid): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupDelMember((servername?.value ?: 0L), (groupname?.value ?: 0L), (membersid?.value ?: 0L)).toUInt()

public actual fun netLocalGroupDelMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, totalentries: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupDelMembers((servername?.value ?: 0L), (groupname?.value ?: 0L), level.toInt(), (buf?.value ?: 0L), totalentries.toInt()).toUInt()

public actual fun netLocalGroupEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupEnum((servername?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L), (resumehandle?.value ?: 0L)).toUInt()

public actual fun netLocalGroupGetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupGetInfo((servername?.value ?: 0L), (groupname?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L)).toUInt()

public actual fun netLocalGroupGetMembers(servername: Pcwstr, localgroupname: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupGetMembers((servername?.value ?: 0L), (localgroupname?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L), (resumehandle?.value ?: 0L)).toUInt()

public actual fun netLocalGroupSetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupSetInfo((servername?.value ?: 0L), (groupname?.value ?: 0L), level.toInt(), (buf?.value ?: 0L), (parmErr?.value ?: 0L)).toUInt()

public actual fun netLocalGroupSetMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, totalentries: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupSetMembers((servername?.value ?: 0L), (groupname?.value ?: 0L), level.toInt(), (buf?.value ?: 0L), totalentries.toInt()).toUInt()

public actual fun netMessageBufferSend(servername: Pcwstr, msgname: Pcwstr, fromname: Pcwstr, buf: COpaquePointer?, buflen: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netMessageBufferSend((servername?.value ?: 0L), (msgname?.value ?: 0L), (fromname?.value ?: 0L), (buf?.value ?: 0L), buflen.toInt()).toUInt()

public actual fun netMessageNameAdd(servername: Pcwstr, msgname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameAdd((servername?.value ?: 0L), (msgname?.value ?: 0L)).toUInt()

public actual fun netMessageNameDel(servername: Pcwstr, msgname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameDel((servername?.value ?: 0L), (msgname?.value ?: 0L)).toUInt()

public actual fun netMessageNameEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameEnum((servername?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L), (resumeHandle?.value ?: 0L)).toUInt()

public actual fun netMessageNameGetInfo(servername: Pcwstr, msgname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameGetInfo((servername?.value ?: 0L), (msgname?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L)).toUInt()

public actual fun netProvisionComputerAccount(lpdomain: Pcwstr, lpmachinename: Pcwstr, lpmachineaccountou: Pcwstr, lpdcname: Pcwstr, dwoptions: NetsetupProvision, pprovisionbindata: COpaquePointer?, pdwprovisionbindatasize: COpaquePointer?, pprovisiontextdata: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netProvisionComputerAccount((lpdomain?.value ?: 0L), (lpmachinename?.value ?: 0L), (lpmachineaccountou?.value ?: 0L), (lpdcname?.value ?: 0L), dwoptions.toInt(), (pprovisionbindata?.value ?: 0L), (pdwprovisionbindatasize?.value ?: 0L), (pprovisiontextdata?.value ?: 0L)).toUInt()

public actual fun netQueryDisplayInformation(servername: Pcwstr, level: UInt, index: UInt, entriesrequested: UInt, preferredmaximumlength: UInt, returnedentrycount: COpaquePointer?, sortedbuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netQueryDisplayInformation((servername?.value ?: 0L), level.toInt(), index.toInt(), entriesrequested.toInt(), preferredmaximumlength.toInt(), (returnedentrycount?.value ?: 0L), (sortedbuffer?.value ?: 0L)).toUInt()

public actual fun netQueryServiceAccount(servername: Pcwstr, accountname: Pcwstr, infolevel: UInt, buffer: COpaquePointer?): Ntstatus =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netQueryServiceAccount((servername?.value ?: 0L), (accountname?.value ?: 0L), infolevel.toInt(), (buffer?.value ?: 0L))

public actual fun netRemoteComputerSupports(uncservername: Pcwstr, optionswanted: NetRemoteComputerSupportsOptions, optionssupported: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netRemoteComputerSupports((uncservername?.value ?: 0L), optionswanted.toInt(), (optionssupported?.value ?: 0L)).toUInt()

public actual fun netRemoteTOD(uncservername: Pcwstr, bufferptr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netRemoteTOD((uncservername?.value ?: 0L), (bufferptr?.value ?: 0L)).toUInt()

public actual fun netRemoveAlternateComputerName(server: Pcwstr, alternatename: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netRemoveAlternateComputerName((server?.value ?: 0L), (alternatename?.value ?: 0L), (domainaccount?.value ?: 0L), (domainaccountpassword?.value ?: 0L), reserved.toInt()).toUInt()

public actual fun netRemoveServiceAccount(servername: Pcwstr, accountname: Pcwstr, flags: UInt): Ntstatus =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netRemoveServiceAccount((servername?.value ?: 0L), (accountname?.value ?: 0L), flags.toInt())

public actual fun netRenameMachineInDomain(lpserver: Pcwstr, lpnewmachinename: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, frenameoptions: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netRenameMachineInDomain((lpserver?.value ?: 0L), (lpnewmachinename?.value ?: 0L), (lpaccount?.value ?: 0L), (lppassword?.value ?: 0L), frenameoptions.toInt()).toUInt()

public actual fun netReplExportDirAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirAdd((servername?.value ?: 0L), level.toInt(), (buf?.value ?: 0L), (parmErr?.value ?: 0L)).toUInt()

public actual fun netReplExportDirDel(servername: Pcwstr, dirname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirDel((servername?.value ?: 0L), (dirname?.value ?: 0L)).toUInt()

public actual fun netReplExportDirEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirEnum((servername?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L), (resumehandle?.value ?: 0L)).toUInt()

public actual fun netReplExportDirGetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirGetInfo((servername?.value ?: 0L), (dirname?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L)).toUInt()

public actual fun netReplExportDirLock(servername: Pcwstr, dirname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirLock((servername?.value ?: 0L), (dirname?.value ?: 0L)).toUInt()

public actual fun netReplExportDirSetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirSetInfo((servername?.value ?: 0L), (dirname?.value ?: 0L), level.toInt(), (buf?.value ?: 0L), (parmErr?.value ?: 0L)).toUInt()

public actual fun netReplExportDirUnlock(servername: Pcwstr, dirname: Pcwstr, unlockforce: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirUnlock((servername?.value ?: 0L), (dirname?.value ?: 0L), unlockforce.toInt()).toUInt()

public actual fun netReplGetInfo(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netReplGetInfo((servername?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L)).toUInt()

public actual fun netReplImportDirAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirAdd((servername?.value ?: 0L), level.toInt(), (buf?.value ?: 0L), (parmErr?.value ?: 0L)).toUInt()

public actual fun netReplImportDirDel(servername: Pcwstr, dirname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirDel((servername?.value ?: 0L), (dirname?.value ?: 0L)).toUInt()

public actual fun netReplImportDirEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirEnum((servername?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L), (resumehandle?.value ?: 0L)).toUInt()

public actual fun netReplImportDirGetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirGetInfo((servername?.value ?: 0L), (dirname?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L)).toUInt()

public actual fun netReplImportDirLock(servername: Pcwstr, dirname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirLock((servername?.value ?: 0L), (dirname?.value ?: 0L)).toUInt()

public actual fun netReplImportDirUnlock(servername: Pcwstr, dirname: Pcwstr, unlockforce: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirUnlock((servername?.value ?: 0L), (dirname?.value ?: 0L), unlockforce.toInt()).toUInt()

public actual fun netReplSetInfo(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netReplSetInfo((servername?.value ?: 0L), level.toInt(), (buf?.value ?: 0L), (parmErr?.value ?: 0L)).toUInt()

public actual fun netRequestOfflineDomainJoin(pprovisionbindata: COpaquePointer?, cbprovisionbindatasize: UInt, dwoptions: NetRequestProvisionOptions, lpwindowspath: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netRequestOfflineDomainJoin((pprovisionbindata?.value ?: 0L), cbprovisionbindatasize.toInt(), dwoptions.toInt(), (lpwindowspath?.value ?: 0L)).toUInt()

public actual fun netRequestProvisioningPackageInstall(ppackagebindata: COpaquePointer?, dwpackagebindatasize: UInt, dwprovisionoptions: NetRequestProvisionOptions, lpwindowspath: Pcwstr, pvreserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netRequestProvisioningPackageInstall((ppackagebindata?.value ?: 0L), dwpackagebindatasize.toInt(), dwprovisionoptions.toInt(), (lpwindowspath?.value ?: 0L), (pvreserved?.value ?: 0L)).toUInt()

public actual fun netScheduleJobAdd(servername: Pcwstr, buffer: COpaquePointer?, jobid: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobAdd((servername?.value ?: 0L), (buffer?.value ?: 0L), (jobid?.value ?: 0L)).toUInt()

public actual fun netScheduleJobDel(servername: Pcwstr, minjobid: UInt, maxjobid: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobDel((servername?.value ?: 0L), minjobid.toInt(), maxjobid.toInt()).toUInt()

public actual fun netScheduleJobEnum(servername: Pcwstr, pointertobuffer: COpaquePointer?, prefferedmaximumlength: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobEnum((servername?.value ?: 0L), (pointertobuffer?.value ?: 0L), prefferedmaximumlength.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L), (resumehandle?.value ?: 0L)).toUInt()

public actual fun netScheduleJobGetInfo(servername: Pcwstr, jobid: UInt, pointertobuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobGetInfo((servername?.value ?: 0L), jobid.toInt(), (pointertobuffer?.value ?: 0L)).toUInt()

public actual fun netServerComputerNameAdd(servername: Pcwstr, emulateddomainname: Pcwstr, emulatedservername: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netServerComputerNameAdd((servername?.value ?: 0L), (emulateddomainname?.value ?: 0L), (emulatedservername?.value ?: 0L)).toUInt()

public actual fun netServerComputerNameDel(servername: Pcwstr, emulatedservername: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netServerComputerNameDel((servername?.value ?: 0L), (emulatedservername?.value ?: 0L)).toUInt()

public actual fun netServerDiskEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netServerDiskEnum((servername?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L), (resumeHandle?.value ?: 0L)).toUInt()

public actual fun netServerEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, servertype: NetServerType, domain: Pcwstr, resumeHandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netServerEnum((servername?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L), servertype.toInt(), (domain?.value ?: 0L), (resumeHandle?.value ?: 0L)).toUInt()

public actual fun netServerGetInfo(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netServerGetInfo((servername?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L)).toUInt()

public actual fun netServerSetInfo(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmerror: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netServerSetInfo((servername?.value ?: 0L), level.toInt(), (buf?.value ?: 0L), (parmerror?.value ?: 0L)).toUInt()

public actual fun netServerTransportAdd(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportAdd((servername?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L)).toUInt()

public actual fun netServerTransportAddEx(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportAddEx((servername?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L)).toUInt()

public actual fun netServerTransportDel(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportDel((servername?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L)).toUInt()

public actual fun netServerTransportEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportEnum((servername?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L), (resumeHandle?.value ?: 0L)).toUInt()

public actual fun netServiceControl(servername: Pcwstr, service: Pcwstr, opcode: UInt, arg: UInt, bufptr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netServiceControl((servername?.value ?: 0L), (service?.value ?: 0L), opcode.toInt(), arg.toInt(), (bufptr?.value ?: 0L)).toUInt()

public actual fun netServiceEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netServiceEnum((servername?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L), (resumeHandle?.value ?: 0L)).toUInt()

public actual fun netServiceGetInfo(servername: Pcwstr, service: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netServiceGetInfo((servername?.value ?: 0L), (service?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L)).toUInt()

public actual fun netServiceInstall(servername: Pcwstr, service: Pcwstr, argc: UInt, argv: COpaquePointer?, bufptr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netServiceInstall((servername?.value ?: 0L), (service?.value ?: 0L), argc.toInt(), (argv?.value ?: 0L), (bufptr?.value ?: 0L)).toUInt()

public actual fun netSetPrimaryComputerName(server: Pcwstr, primaryname: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netSetPrimaryComputerName((server?.value ?: 0L), (primaryname?.value ?: 0L), (domainaccount?.value ?: 0L), (domainaccountpassword?.value ?: 0L), reserved.toInt()).toUInt()

public actual fun netUnjoinDomain(lpserver: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, funjoinoptions: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netUnjoinDomain((lpserver?.value ?: 0L), (lpaccount?.value ?: 0L), (lppassword?.value ?: 0L), funjoinoptions.toInt()).toUInt()

public actual fun netUseAdd(servername: COpaquePointer?, levelflags: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netUseAdd((servername?.value ?: 0L), levelflags.toInt(), (buf?.value ?: 0L), (parmErr?.value ?: 0L)).toUInt()

public actual fun netUseDel(uncservername: Pcwstr, usename: Pcwstr, forcelevelflags: ForceLevelFlags): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netUseDel((uncservername?.value ?: 0L), (usename?.value ?: 0L), forcelevelflags.toInt()).toUInt()

public actual fun netUseEnum(uncservername: Pcwstr, levelflags: UInt, bufptr: COpaquePointer?, preferedmaximumsize: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netUseEnum((uncservername?.value ?: 0L), levelflags.toInt(), (bufptr?.value ?: 0L), preferedmaximumsize.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L), (resumehandle?.value ?: 0L)).toUInt()

public actual fun netUseGetInfo(uncservername: Pcwstr, usename: Pcwstr, levelflags: UInt, bufptr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netUseGetInfo((uncservername?.value ?: 0L), (usename?.value ?: 0L), levelflags.toInt(), (bufptr?.value ?: 0L)).toUInt()

public actual fun netUserAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netUserAdd((servername?.value ?: 0L), level.toInt(), (buf?.value ?: 0L), (parmErr?.value ?: 0L)).toUInt()

public actual fun netUserChangePassword(domainname: Pcwstr, username: Pcwstr, oldpassword: Pcwstr, newpassword: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netUserChangePassword((domainname?.value ?: 0L), (username?.value ?: 0L), (oldpassword?.value ?: 0L), (newpassword?.value ?: 0L)).toUInt()

public actual fun netUserDel(servername: Pcwstr, username: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netUserDel((servername?.value ?: 0L), (username?.value ?: 0L)).toUInt()

public actual fun netUserEnum(servername: Pcwstr, level: UInt, filter: NetUserEnumFilterFlags, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netUserEnum((servername?.value ?: 0L), level.toInt(), filter.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L), (resumeHandle?.value ?: 0L)).toUInt()

public actual fun netUserGetGroups(servername: Pcwstr, username: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netUserGetGroups((servername?.value ?: 0L), (username?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L)).toUInt()

public actual fun netUserGetInfo(servername: Pcwstr, username: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netUserGetInfo((servername?.value ?: 0L), (username?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L)).toUInt()

public actual fun netUserGetLocalGroups(servername: Pcwstr, username: Pcwstr, level: UInt, flags: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netUserGetLocalGroups((servername?.value ?: 0L), (username?.value ?: 0L), level.toInt(), flags.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L)).toUInt()

public actual fun netUserModalsGet(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netUserModalsGet((servername?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L)).toUInt()

public actual fun netUserModalsSet(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netUserModalsSet((servername?.value ?: 0L), level.toInt(), (buf?.value ?: 0L), (parmErr?.value ?: 0L)).toUInt()

public actual fun netUserSetGroups(servername: Pcwstr, username: Pcwstr, level: UInt, buf: COpaquePointer?, numEntries: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netUserSetGroups((servername?.value ?: 0L), (username?.value ?: 0L), level.toInt(), (buf?.value ?: 0L), numEntries.toInt()).toUInt()

public actual fun netUserSetInfo(servername: Pcwstr, username: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netUserSetInfo((servername?.value ?: 0L), (username?.value ?: 0L), level.toInt(), (buf?.value ?: 0L), (parmErr?.value ?: 0L)).toUInt()

public actual fun netValidateName(lpserver: Pcwstr, lpname: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, nametype: NetsetupNameType): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netValidateName((lpserver?.value ?: 0L), (lpname?.value ?: 0L), (lpaccount?.value ?: 0L), (lppassword?.value ?: 0L), nametype).toUInt()

public actual fun netValidatePasswordPolicy(servername: Pcwstr, qualifier: COpaquePointer?, validationtype: NetValidatePasswordType, inputarg: COpaquePointer?, outputarg: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netValidatePasswordPolicy((servername?.value ?: 0L), (qualifier?.value ?: 0L), validationtype, (inputarg?.value ?: 0L), (outputarg?.value ?: 0L)).toUInt()

public actual fun netValidatePasswordPolicyFree(outputarg: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netValidatePasswordPolicyFree((outputarg?.value ?: 0L)).toUInt()

public actual fun netWkstaGetInfo(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaGetInfo((servername?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L)).toUInt()

public actual fun netWkstaSetInfo(servername: Pcwstr, level: UInt, buffer: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaSetInfo((servername?.value ?: 0L), level.toInt(), (buffer?.value ?: 0L), (parmErr?.value ?: 0L)).toUInt()

public actual fun netWkstaTransportAdd(servername: COpaquePointer?, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaTransportAdd((servername?.value ?: 0L), level.toInt(), (buf?.value ?: 0L), (parmErr?.value ?: 0L)).toUInt()

public actual fun netWkstaTransportDel(servername: Pcwstr, transportname: Pcwstr, ucond: ForceLevelFlags): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaTransportDel((servername?.value ?: 0L), (transportname?.value ?: 0L), ucond.toInt()).toUInt()

public actual fun netWkstaTransportEnum(servername: COpaquePointer?, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaTransportEnum((servername?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L), (resumeHandle?.value ?: 0L)).toUInt()

public actual fun netWkstaUserEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaUserEnum((servername?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L), (resumehandle?.value ?: 0L)).toUInt()

public actual fun netWkstaUserGetInfo(reserved: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaUserGetInfo((reserved?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L)).toUInt()

public actual fun netWkstaUserSetInfo(reserved: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaUserSetInfo((reserved?.value ?: 0L), level.toInt(), (buf?.value ?: 0L), (parmErr?.value ?: 0L)).toUInt()

public actual fun routerAssert(pszfailedassertion: Pcstr, pszfilename: Pcstr, dwlinenumber: UInt, pszmessage: Pcstr) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_routerAssert((pszfailedassertion?.value ?: 0L), (pszfilename?.value ?: 0L), dwlinenumber.toInt(), (pszmessage?.value ?: 0L))
}

public actual fun routerGetErrorStringA(dwerrorcode: UInt, lplpszerrorstring: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_routerGetErrorStringA(dwerrorcode.toInt(), (lplpszerrorstring?.value ?: 0L)).toUInt()

public actual fun routerGetErrorStringW(dwerrorcode: UInt, lplpwszerrorstring: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_routerGetErrorStringW(dwerrorcode.toInt(), (lplpwszerrorstring?.value ?: 0L)).toUInt()

public actual fun routerLogDeregisterA(hloghandle: Handle) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_routerLogDeregisterA((hloghandle?.value ?: 0L))
}

public actual fun routerLogDeregisterW(hloghandle: Handle) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_routerLogDeregisterW((hloghandle?.value ?: 0L))
}

public actual fun routerLogEventA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwerrorcode: UInt) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventA((hloghandle?.value ?: 0L), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), (plpszsubstringarray?.value ?: 0L), dwerrorcode.toInt())
}

public actual fun routerLogEventDataA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwdatabytes: UInt, lpdatabytes: COpaquePointer?) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventDataA((hloghandle?.value ?: 0L), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), (plpszsubstringarray?.value ?: 0L), dwdatabytes.toInt(), (lpdatabytes?.value ?: 0L))
}

public actual fun routerLogEventDataW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwdatabytes: UInt, lpdatabytes: COpaquePointer?) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventDataW((hloghandle?.value ?: 0L), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), (plpszsubstringarray?.value ?: 0L), dwdatabytes.toInt(), (lpdatabytes?.value ?: 0L))
}

public actual fun routerLogEventExA(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcstr, vararg variadicArgs: Long) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventExA((hloghandle?.value ?: 0L), dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), (ptszformat?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun routerLogEventExW(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcwstr, vararg variadicArgs: Long) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventExW((hloghandle?.value ?: 0L), dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), (ptszformat?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun routerLogEventStringA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwerrorcode: UInt, dwerrorindex: UInt) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventStringA((hloghandle?.value ?: 0L), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), (plpszsubstringarray?.value ?: 0L), dwerrorcode.toInt(), dwerrorindex.toInt())
}

public actual fun routerLogEventStringW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwerrorcode: UInt, dwerrorindex: UInt) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventStringW((hloghandle?.value ?: 0L), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), (plpszsubstringarray?.value ?: 0L), dwerrorcode.toInt(), dwerrorindex.toInt())
}

public actual fun routerLogEventValistExA(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcstr, arglist: COpaquePointer?) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventValistExA((hloghandle?.value ?: 0L), dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), (ptszformat?.value ?: 0L), (arglist?.value ?: 0L))
}

public actual fun routerLogEventValistExW(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcwstr, arglist: COpaquePointer?) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventValistExW((hloghandle?.value ?: 0L), dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), (ptszformat?.value ?: 0L), (arglist?.value ?: 0L))
}

public actual fun routerLogEventW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwerrorcode: UInt) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventW((hloghandle?.value ?: 0L), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), (plpszsubstringarray?.value ?: 0L), dwerrorcode.toInt())
}

public actual fun routerLogRegisterA(lpszsource: Pcstr): Handle =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_routerLogRegisterA((lpszsource?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun routerLogRegisterW(lpszsource: Pcwstr): Handle =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_routerLogRegisterW((lpszsource?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setNetScheduleAccountInformation(pwszservername: Pcwstr, pwszaccount: Pcwstr, pwszpassword: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_setNetScheduleAccountInformation((pwszservername?.value ?: 0L), (pwszaccount?.value ?: 0L), (pwszpassword?.value ?: 0L))

public actual fun traceDeregisterA(dwtraceid: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterA(dwtraceid.toInt()).toUInt()

public actual fun traceDeregisterExA(dwtraceid: UInt, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterExA(dwtraceid.toInt(), dwflags.toInt()).toUInt()

public actual fun traceDeregisterExW(dwtraceid: UInt, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterExW(dwtraceid.toInt(), dwflags.toInt()).toUInt()

public actual fun traceDeregisterW(dwtraceid: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterW(dwtraceid.toInt()).toUInt()

public actual fun traceDumpExA(dwtraceid: UInt, dwflags: UInt, lpbbytes: COpaquePointer?, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: Bool, lpszprefix: Pcstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_traceDumpExA(dwtraceid.toInt(), dwflags.toInt(), (lpbbytes?.value ?: 0L), dwbytecount.toInt(), dwgroupsize.toInt(), baddressprefix, (lpszprefix?.value ?: 0L)).toUInt()

public actual fun traceDumpExW(dwtraceid: UInt, dwflags: UInt, lpbbytes: COpaquePointer?, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: Bool, lpszprefix: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_traceDumpExW(dwtraceid.toInt(), dwflags.toInt(), (lpbbytes?.value ?: 0L), dwbytecount.toInt(), dwgroupsize.toInt(), baddressprefix, (lpszprefix?.value ?: 0L)).toUInt()

public actual fun traceGetConsoleA(dwtraceid: UInt, lphconsole: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_traceGetConsoleA(dwtraceid.toInt(), (lphconsole?.value ?: 0L)).toUInt()

public actual fun traceGetConsoleW(dwtraceid: UInt, lphconsole: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_traceGetConsoleW(dwtraceid.toInt(), (lphconsole?.value ?: 0L)).toUInt()

public actual fun tracePrintfA(dwtraceid: UInt, lpszformat: Pcstr, vararg variadicArgs: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfA(dwtraceid.toInt(), (lpszformat?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun tracePrintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcstr, vararg variadicArgs: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfExA(dwtraceid.toInt(), dwflags.toInt(), (lpszformat?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun tracePrintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfExW(dwtraceid.toInt(), dwflags.toInt(), (lpszformat?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun tracePrintfW(dwtraceid: UInt, lpszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfW(dwtraceid.toInt(), (lpszformat?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun tracePutsExA(dwtraceid: UInt, dwflags: UInt, lpszstring: Pcstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_tracePutsExA(dwtraceid.toInt(), dwflags.toInt(), (lpszstring?.value ?: 0L)).toUInt()

public actual fun tracePutsExW(dwtraceid: UInt, dwflags: UInt, lpszstring: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_tracePutsExW(dwtraceid.toInt(), dwflags.toInt(), (lpszstring?.value ?: 0L)).toUInt()

public actual fun traceRegisterExA(lpszcallername: Pcstr, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_traceRegisterExA((lpszcallername?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun traceRegisterExW(lpszcallername: Pcwstr, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_traceRegisterExW((lpszcallername?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun traceVprintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcstr, arglist: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_traceVprintfExA(dwtraceid.toInt(), dwflags.toInt(), (lpszformat?.value ?: 0L), (arglist?.value ?: 0L)).toUInt()

public actual fun traceVprintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcwstr, arglist: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssys_windows_win32_networkmanagement_netmanagement_traceVprintfExW(dwtraceid.toInt(), dwflags.toInt(), (lpszformat?.value ?: 0L), (arglist?.value ?: 0L)).toUInt()
