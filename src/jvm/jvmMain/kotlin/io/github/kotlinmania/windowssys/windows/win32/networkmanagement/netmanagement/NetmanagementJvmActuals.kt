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

private object WindowsWin32NetworkmanagementNetmanagementJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32NetworkmanagementNetmanagementJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementGetNetScheduleAccountInformation(pwszservername: Long, ccaccount: Int, wszaccount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementINetLogonControl2(servername: Long, functioncode: Int, querylevel: Int, data: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementLogErrorA(dwmessageid: Int, cnumberofsubstrings: Int, plpwssubstrings: Long, dwerrorcode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementLogErrorW(dwmessageid: Int, cnumberofsubstrings: Int, plpwssubstrings: Long, dwerrorcode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementLogEventA(weventtype: Int, dwmessageid: Int, cnumberofsubstrings: Int, plpwssubstrings: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementLogEventW(weventtype: Int, dwmessageid: Int, cnumberofsubstrings: Int, plpwssubstrings: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementMprSetupProtocolEnum(dwtransportid: Int, lplpbuffer: Long, lpdwentriesread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementMprSetupProtocolFree(lpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessAdd(servername: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessDel(servername: Long, resource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessEnum(servername: Long, basepath: Long, recursive: Int, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessGetInfo(servername: Long, resource: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessGetUserPerms(servername: Long, ugname: Long, resource: Long, perms: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessSetInfo(servername: Long, resource: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetAddAlternateComputerName(server: Long, alternatename: Long, domainaccount: Long, domainaccountpassword: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetAddServiceAccount(servername: Long, accountname: Long, password: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetAlertRaise(alerttype: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetAlertRaiseEx(alerttype: Long, variableinfo: Long, variableinfosize: Int, servicename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferAllocate(bytecount: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferFree(buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferReallocate(oldbuffer: Long, newbytecount: Int, newbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferSize(buffer: Long, bytecount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetAuditClear(server: Long, backupfile: Long, service: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetAuditRead(server: Long, service: Long, auditloghandle: Long, offset: Int, reserved1: Long, reserved2: Int, offsetflag: Int, bufptr: Long, prefmaxlen: Int, bytesread: Long, totalavailable: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetAuditWrite(type: Int, buf: Long, numbytes: Int, service: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetConfigGet(server: Long, component: Long, parameter: Long, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetConfigGetAll(server: Long, component: Long, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetConfigSet(server: Long, reserved1: Long, component: Long, level: Int, reserved2: Int, buf: Long, reserved3: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetCreateProvisioningPackage(pprovisioningparams: Long, pppackagebindata: Long, pdwpackagebindatasize: Long, pppackagetextdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetEnumerateComputerNames(server: Long, nametype: Int, reserved: Int, entrycount: Long, computernames: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetEnumerateServiceAccounts(servername: Long, flags: Int, accountscount: Long, accounts: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogClear(uncservername: Long, backupfile: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogRead(uncservername: Long, reserved1: Long, errorloghandle: Long, offset: Int, reserved2: Long, reserved3: Int, offsetflag: Int, bufptr: Long, prefmaxsize: Int, bytesread: Long, totalavailable: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogWrite(reserved1: Long, code: Int, component: Long, buffer: Long, numbytes: Int, msgbuf: Long, strcount: Int, reserved2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetFreeAadJoinInformation(pjoininfo: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetGetAadJoinInformation(pcsztenantid: Long, ppjoininfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetGetAnyDCName(servername: Long, domainname: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetGetDCName(servername: Long, domainname: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetGetDisplayInformationIndex(servername: Long, level: Int, prefix: Long, index: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetGetJoinInformation(lpserver: Long, lpnamebuffer: Long, buffertype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetGetJoinableOUs(lpserver: Long, lpdomain: Long, lpaccount: Long, lppassword: Long, oucount: Long, ous: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupAdd(servername: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupAddUser(servername: Long, groupname: Long, username: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupDel(servername: Long, groupname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupDelUser(servername: Long, groupname: Long, username: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupGetInfo(servername: Long, groupname: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupGetUsers(servername: Long, groupname: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupSetInfo(servername: Long, groupname: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupSetUsers(servername: Long, groupname: Long, level: Int, buf: Long, totalentries: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetIsServiceAccount(servername: Long, accountname: Long, isservice: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetJoinDomain(lpserver: Long, lpdomain: Long, lpmachineaccountou: Long, lpaccount: Long, lppassword: Long, fjoinoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAdd(servername: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAddMember(servername: Long, groupname: Long, membersid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAddMembers(servername: Long, groupname: Long, level: Int, buf: Long, totalentries: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDel(servername: Long, groupname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDelMember(servername: Long, groupname: Long, membersid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDelMembers(servername: Long, groupname: Long, level: Int, buf: Long, totalentries: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupGetInfo(servername: Long, groupname: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupGetMembers(servername: Long, localgroupname: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupSetInfo(servername: Long, groupname: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupSetMembers(servername: Long, groupname: Long, level: Int, buf: Long, totalentries: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageBufferSend(servername: Long, msgname: Long, fromname: Long, buf: Long, buflen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameAdd(servername: Long, msgname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameDel(servername: Long, msgname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameGetInfo(servername: Long, msgname: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetProvisionComputerAccount(lpdomain: Long, lpmachinename: Long, lpmachineaccountou: Long, lpdcname: Long, dwoptions: Int, pprovisionbindata: Long, pdwprovisionbindatasize: Long, pprovisiontextdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetQueryDisplayInformation(servername: Long, level: Int, index: Int, entriesrequested: Int, preferredmaximumlength: Int, returnedentrycount: Long, sortedbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetQueryServiceAccount(servername: Long, accountname: Long, infolevel: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoteComputerSupports(uncservername: Long, optionswanted: Int, optionssupported: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoteTOD(uncservername: Long, bufferptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoveAlternateComputerName(server: Long, alternatename: Long, domainaccount: Long, domainaccountpassword: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoveServiceAccount(servername: Long, accountname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetRenameMachineInDomain(lpserver: Long, lpnewmachinename: Long, lpaccount: Long, lppassword: Long, frenameoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirAdd(servername: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirDel(servername: Long, dirname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirGetInfo(servername: Long, dirname: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirLock(servername: Long, dirname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirSetInfo(servername: Long, dirname: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirUnlock(servername: Long, dirname: Long, unlockforce: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetReplGetInfo(servername: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirAdd(servername: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirDel(servername: Long, dirname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirGetInfo(servername: Long, dirname: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirLock(servername: Long, dirname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirUnlock(servername: Long, dirname: Long, unlockforce: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetReplSetInfo(servername: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetRequestOfflineDomainJoin(pprovisionbindata: Long, cbprovisionbindatasize: Int, dwoptions: Int, lpwindowspath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetRequestProvisioningPackageInstall(ppackagebindata: Long, dwpackagebindatasize: Int, dwprovisionoptions: Int, lpwindowspath: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobAdd(servername: Long, buffer: Long, jobid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobDel(servername: Long, minjobid: Int, maxjobid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobEnum(servername: Long, pointertobuffer: Long, prefferedmaximumlength: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobGetInfo(servername: Long, jobid: Int, pointertobuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetServerComputerNameAdd(servername: Long, emulateddomainname: Long, emulatedservername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetServerComputerNameDel(servername: Long, emulatedservername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetServerDiskEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetServerEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, servertype: Int, domain: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetServerGetInfo(servername: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetServerSetInfo(servername: Long, level: Int, buf: Long, parmerror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportAdd(servername: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportAddEx(servername: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportDel(servername: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceControl(servername: Long, service: Long, opcode: Int, arg: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceGetInfo(servername: Long, service: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceInstall(servername: Long, service: Long, argc: Int, argv: Long, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetSetPrimaryComputerName(server: Long, primaryname: Long, domainaccount: Long, domainaccountpassword: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetUnjoinDomain(lpserver: Long, lpaccount: Long, lppassword: Long, funjoinoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetUseAdd(servername: Long, levelflags: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetUseDel(uncservername: Long, usename: Long, forcelevelflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetUseEnum(uncservername: Long, levelflags: Int, bufptr: Long, preferedmaximumsize: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetUseGetInfo(uncservername: Long, usename: Long, levelflags: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetUserAdd(servername: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetUserChangePassword(domainname: Long, username: Long, oldpassword: Long, newpassword: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetUserDel(servername: Long, username: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetUserEnum(servername: Long, level: Int, filter: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetGroups(servername: Long, username: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetInfo(servername: Long, username: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetLocalGroups(servername: Long, username: Long, level: Int, flags: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetUserModalsGet(servername: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetUserModalsSet(servername: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetUserSetGroups(servername: Long, username: Long, level: Int, buf: Long, numEntries: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetUserSetInfo(servername: Long, username: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetValidateName(lpserver: Long, lpname: Long, lpaccount: Long, lppassword: Long, nametype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetValidatePasswordPolicy(servername: Long, qualifier: Long, validationtype: Int, inputarg: Long, outputarg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetValidatePasswordPolicyFree(outputarg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaGetInfo(servername: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaSetInfo(servername: Long, level: Int, buffer: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportAdd(servername: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportDel(servername: Long, transportname: Long, ucond: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserGetInfo(reserved: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserSetInfo(reserved: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementRouterAssert(pszfailedassertion: Long, pszfilename: Long, dwlinenumber: Int, pszmessage: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementRouterGetErrorStringA(dwerrorcode: Int, lplpszerrorstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementRouterGetErrorStringW(dwerrorcode: Int, lplpwszerrorstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogDeregisterA(hloghandle: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogDeregisterW(hloghandle: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventA(hloghandle: Long, dweventtype: Int, dwmessageid: Int, dwsubstringcount: Int, plpszsubstringarray: Long, dwerrorcode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventDataA(hloghandle: Long, dweventtype: Int, dwmessageid: Int, dwsubstringcount: Int, plpszsubstringarray: Long, dwdatabytes: Int, lpdatabytes: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventDataW(hloghandle: Long, dweventtype: Int, dwmessageid: Int, dwsubstringcount: Int, plpszsubstringarray: Long, dwdatabytes: Int, lpdatabytes: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventExA(hloghandle: Long, dweventtype: Int, dwerrorcode: Int, dwmessageid: Int, ptszformat: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventExW(hloghandle: Long, dweventtype: Int, dwerrorcode: Int, dwmessageid: Int, ptszformat: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventStringA(hloghandle: Long, dweventtype: Int, dwmessageid: Int, dwsubstringcount: Int, plpszsubstringarray: Long, dwerrorcode: Int, dwerrorindex: Int)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventStringW(hloghandle: Long, dweventtype: Int, dwmessageid: Int, dwsubstringcount: Int, plpszsubstringarray: Long, dwerrorcode: Int, dwerrorindex: Int)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventValistExA(hloghandle: Long, dweventtype: Int, dwerrorcode: Int, dwmessageid: Int, ptszformat: Long, arglist: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventValistExW(hloghandle: Long, dweventtype: Int, dwerrorcode: Int, dwmessageid: Int, ptszformat: Long, arglist: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventW(hloghandle: Long, dweventtype: Int, dwmessageid: Int, dwsubstringcount: Int, plpszsubstringarray: Long, dwerrorcode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogRegisterA(lpszsource: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogRegisterW(lpszsource: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementSetNetScheduleAccountInformation(pwszservername: Long, pwszaccount: Long, pwszpassword: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterA(dwtraceid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterExA(dwtraceid: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterExW(dwtraceid: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterW(dwtraceid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementTraceDumpExA(dwtraceid: Int, dwflags: Int, lpbbytes: Long, dwbytecount: Int, dwgroupsize: Int, baddressprefix: Int, lpszprefix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementTraceDumpExW(dwtraceid: Int, dwflags: Int, lpbbytes: Long, dwbytecount: Int, dwgroupsize: Int, baddressprefix: Int, lpszprefix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementTraceGetConsoleA(dwtraceid: Int, lphconsole: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementTraceGetConsoleW(dwtraceid: Int, lphconsole: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfA(dwtraceid: Int, lpszformat: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfExA(dwtraceid: Int, dwflags: Int, lpszformat: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfExW(dwtraceid: Int, dwflags: Int, lpszformat: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfW(dwtraceid: Int, lpszformat: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementTracePutsExA(dwtraceid: Int, dwflags: Int, lpszstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementTracePutsExW(dwtraceid: Int, dwflags: Int, lpszstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementTraceRegisterExA(lpszcallername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementTraceRegisterExW(lpszcallername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementTraceVprintfExA(dwtraceid: Int, dwflags: Int, lpszformat: Long, arglist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetmanagementTraceVprintfExW(dwtraceid: Int, dwflags: Int, lpszformat: Long, arglist: Long): Int
}

public actual fun getNetScheduleAccountInformation(pwszservername: Pcwstr, ccaccount: UInt, wszaccount: Pwstr): Hresult =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementGetNetScheduleAccountInformation(pwszservername.rawAddress, ccaccount.toInt(), wszaccount.rawAddress)

public actual fun iNetLogonControl2(servername: Pcwstr, functioncode: UInt, querylevel: UInt, data: ConstPtr<UByte>, buffer: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementINetLogonControl2(servername.rawAddress, functioncode.toInt(), querylevel.toInt(), data.rawAddress, buffer.rawAddress).toUInt()

public actual fun logErrorA(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: ConstPtr<Pcstr>, dwerrorcode: UInt) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementLogErrorA(dwmessageid.toInt(), cnumberofsubstrings.toInt(), plpwssubstrings.rawAddress, dwerrorcode.toInt())
}

public actual fun logErrorW(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: ConstPtr<Pcwstr>, dwerrorcode: UInt) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementLogErrorW(dwmessageid.toInt(), cnumberofsubstrings.toInt(), plpwssubstrings.rawAddress, dwerrorcode.toInt())
}

public actual fun logEventA(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: ConstPtr<Pcstr>) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementLogEventA(weventtype.toInt(), dwmessageid.toInt(), cnumberofsubstrings.toInt(), plpwssubstrings.rawAddress)
}

public actual fun logEventW(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: ConstPtr<Pcwstr>) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementLogEventW(weventtype.toInt(), dwmessageid.toInt(), cnumberofsubstrings.toInt(), plpwssubstrings.rawAddress)
}

public actual fun mprSetupProtocolEnum(dwtransportid: UInt, lplpbuffer: MutPtr<MutPtr<UByte>>, lpdwentriesread: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementMprSetupProtocolEnum(dwtransportid.toInt(), lplpbuffer.rawAddress, lpdwentriesread.rawAddress).toUInt()

public actual fun mprSetupProtocolFree(lpbuffer: MutPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementMprSetupProtocolFree(lpbuffer.rawAddress).toUInt()

public actual fun netAccessAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessAdd(servername.rawAddress, level.toInt(), buf.rawAddress, parmErr.rawAddress).toUInt()

public actual fun netAccessDel(servername: Pcwstr, resource: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessDel(servername.rawAddress, resource.rawAddress).toUInt()

public actual fun netAccessEnum(servername: Pcwstr, basepath: Pcwstr, recursive: UInt, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessEnum(servername.rawAddress, basepath.rawAddress, recursive.toInt(), level.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), entriesread.rawAddress, totalentries.rawAddress, resumeHandle.rawAddress).toUInt()

public actual fun netAccessGetInfo(servername: Pcwstr, resource: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessGetInfo(servername.rawAddress, resource.rawAddress, level.toInt(), bufptr.rawAddress).toUInt()

public actual fun netAccessGetUserPerms(servername: Pcwstr, ugname: Pcwstr, resource: Pcwstr, perms: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessGetUserPerms(servername.rawAddress, ugname.rawAddress, resource.rawAddress, perms.rawAddress).toUInt()

public actual fun netAccessSetInfo(servername: Pcwstr, resource: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessSetInfo(servername.rawAddress, resource.rawAddress, level.toInt(), buf.rawAddress, parmErr.rawAddress).toUInt()

public actual fun netAddAlternateComputerName(server: Pcwstr, alternatename: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetAddAlternateComputerName(server.rawAddress, alternatename.rawAddress, domainaccount.rawAddress, domainaccountpassword.rawAddress, reserved.toInt()).toUInt()

public actual fun netAddServiceAccount(servername: Pcwstr, accountname: Pcwstr, password: Pcwstr, flags: UInt): Ntstatus =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetAddServiceAccount(servername.rawAddress, accountname.rawAddress, password.rawAddress, flags.toInt())

public actual fun netAlertRaise(alerttype: Pcwstr, buffer: ConstPtr<CVoid>, buffersize: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetAlertRaise(alerttype.rawAddress, buffer.rawAddress, buffersize.toInt()).toUInt()

public actual fun netAlertRaiseEx(alerttype: Pcwstr, variableinfo: ConstPtr<CVoid>, variableinfosize: UInt, servicename: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetAlertRaiseEx(alerttype.rawAddress, variableinfo.rawAddress, variableinfosize.toInt(), servicename.rawAddress).toUInt()

public actual fun netApiBufferAllocate(bytecount: UInt, buffer: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferAllocate(bytecount.toInt(), buffer.rawAddress).toUInt()

public actual fun netApiBufferFree(buffer: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferFree(buffer.rawAddress).toUInt()

public actual fun netApiBufferReallocate(oldbuffer: ConstPtr<CVoid>, newbytecount: UInt, newbuffer: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferReallocate(oldbuffer.rawAddress, newbytecount.toInt(), newbuffer.rawAddress).toUInt()

public actual fun netApiBufferSize(buffer: ConstPtr<CVoid>, bytecount: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferSize(buffer.rawAddress, bytecount.rawAddress).toUInt()

public actual fun netAuditClear(server: Pcwstr, backupfile: Pcwstr, service: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetAuditClear(server.rawAddress, backupfile.rawAddress, service.rawAddress).toUInt()

public actual fun netAuditRead(server: Pcwstr, service: Pcwstr, auditloghandle: MutPtr<Hlog>, offset: UInt, reserved1: MutPtr<UInt>, reserved2: UInt, offsetflag: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, bytesread: MutPtr<UInt>, totalavailable: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetAuditRead(server.rawAddress, service.rawAddress, auditloghandle.rawAddress, offset.toInt(), reserved1.rawAddress, reserved2.toInt(), offsetflag.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), bytesread.rawAddress, totalavailable.rawAddress).toUInt()

public actual fun netAuditWrite(type: UInt, buf: MutPtr<UByte>, numbytes: UInt, service: Pcwstr, reserved: MutPtr<UByte>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetAuditWrite(type.toInt(), buf.rawAddress, numbytes.toInt(), service.rawAddress, reserved.rawAddress).toUInt()

public actual fun netConfigGet(server: Pcwstr, component: Pcwstr, parameter: Pcwstr, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetConfigGet(server.rawAddress, component.rawAddress, parameter.rawAddress, bufptr.rawAddress).toUInt()

public actual fun netConfigGetAll(server: Pcwstr, component: Pcwstr, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetConfigGetAll(server.rawAddress, component.rawAddress, bufptr.rawAddress).toUInt()

public actual fun netConfigSet(server: Pcwstr, reserved1: Pcwstr, component: Pcwstr, level: UInt, reserved2: UInt, buf: MutPtr<UByte>, reserved3: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetConfigSet(server.rawAddress, reserved1.rawAddress, component.rawAddress, level.toInt(), reserved2.toInt(), buf.rawAddress, reserved3.toInt()).toUInt()

public actual fun netCreateProvisioningPackage(pprovisioningparams: ConstPtr<NetsetupProvisioningParams>, pppackagebindata: MutPtr<MutPtr<UByte>>, pdwpackagebindatasize: MutPtr<UInt>, pppackagetextdata: MutPtr<Pwstr>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetCreateProvisioningPackage(pprovisioningparams.rawAddress, pppackagebindata.rawAddress, pdwpackagebindatasize.rawAddress, pppackagetextdata.rawAddress).toUInt()

public actual fun netEnumerateComputerNames(server: Pcwstr, nametype: NetComputerNameType, reserved: UInt, entrycount: MutPtr<UInt>, computernames: MutPtr<MutPtr<Pwstr>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetEnumerateComputerNames(server.rawAddress, nametype, reserved.toInt(), entrycount.rawAddress, computernames.rawAddress).toUInt()

public actual fun netEnumerateServiceAccounts(servername: Pcwstr, flags: UInt, accountscount: MutPtr<UInt>, accounts: MutPtr<MutPtr<MutPtr<UShort>>>): Ntstatus =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetEnumerateServiceAccounts(servername.rawAddress, flags.toInt(), accountscount.rawAddress, accounts.rawAddress)

public actual fun netErrorLogClear(uncservername: Pcwstr, backupfile: Pcwstr, reserved: ConstPtr<UByte>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogClear(uncservername.rawAddress, backupfile.rawAddress, reserved.rawAddress).toUInt()

public actual fun netErrorLogRead(uncservername: Pcwstr, reserved1: Pcwstr, errorloghandle: ConstPtr<Hlog>, offset: UInt, reserved2: ConstPtr<UInt>, reserved3: UInt, offsetflag: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxsize: UInt, bytesread: MutPtr<UInt>, totalavailable: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogRead(uncservername.rawAddress, reserved1.rawAddress, errorloghandle.rawAddress, offset.toInt(), reserved2.rawAddress, reserved3.toInt(), offsetflag.toInt(), bufptr.rawAddress, prefmaxsize.toInt(), bytesread.rawAddress, totalavailable.rawAddress).toUInt()

public actual fun netErrorLogWrite(reserved1: ConstPtr<UByte>, code: UInt, component: Pcwstr, buffer: ConstPtr<UByte>, numbytes: UInt, msgbuf: ConstPtr<UByte>, strcount: UInt, reserved2: ConstPtr<UByte>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogWrite(reserved1.rawAddress, code.toInt(), component.rawAddress, buffer.rawAddress, numbytes.toInt(), msgbuf.rawAddress, strcount.toInt(), reserved2.rawAddress).toUInt()

public actual fun netFreeAadJoinInformation(pjoininfo: ConstPtr<DsregJoinInfo>) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetFreeAadJoinInformation(pjoininfo.rawAddress)
}

public actual fun netGetAadJoinInformation(pcsztenantid: Pcwstr, ppjoininfo: MutPtr<MutPtr<DsregJoinInfo>>): Hresult =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetGetAadJoinInformation(pcsztenantid.rawAddress, ppjoininfo.rawAddress)

public actual fun netGetAnyDCName(servername: Pcwstr, domainname: Pcwstr, buffer: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetGetAnyDCName(servername.rawAddress, domainname.rawAddress, buffer.rawAddress).toUInt()

public actual fun netGetDCName(servername: Pcwstr, domainname: Pcwstr, buffer: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetGetDCName(servername.rawAddress, domainname.rawAddress, buffer.rawAddress).toUInt()

public actual fun netGetDisplayInformationIndex(servername: Pcwstr, level: UInt, prefix: Pcwstr, index: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetGetDisplayInformationIndex(servername.rawAddress, level.toInt(), prefix.rawAddress, index.rawAddress).toUInt()

public actual fun netGetJoinInformation(lpserver: Pcwstr, lpnamebuffer: MutPtr<Pwstr>, buffertype: MutPtr<NetsetupJoinStatus>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetGetJoinInformation(lpserver.rawAddress, lpnamebuffer.rawAddress, buffertype.rawAddress).toUInt()

public actual fun netGetJoinableOUs(lpserver: Pcwstr, lpdomain: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, oucount: MutPtr<UInt>, ous: MutPtr<MutPtr<Pwstr>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetGetJoinableOUs(lpserver.rawAddress, lpdomain.rawAddress, lpaccount.rawAddress, lppassword.rawAddress, oucount.rawAddress, ous.rawAddress).toUInt()

public actual fun netGroupAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupAdd(servername.rawAddress, level.toInt(), buf.rawAddress, parmErr.rawAddress).toUInt()

public actual fun netGroupAddUser(servername: Pcwstr, groupname: Pcwstr, username: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupAddUser(servername.rawAddress, groupname.rawAddress, username.rawAddress).toUInt()

public actual fun netGroupDel(servername: Pcwstr, groupname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupDel(servername.rawAddress, groupname.rawAddress).toUInt()

public actual fun netGroupDelUser(servername: Pcwstr, groupname: Pcwstr, username: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupDelUser(servername.rawAddress, groupname.rawAddress, username.rawAddress).toUInt()

public actual fun netGroupEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<ULong>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupEnum(servername.rawAddress, level.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), entriesread.rawAddress, totalentries.rawAddress, resumeHandle.rawAddress).toUInt()

public actual fun netGroupGetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupGetInfo(servername.rawAddress, groupname.rawAddress, level.toInt(), bufptr.rawAddress).toUInt()

public actual fun netGroupGetUsers(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<ULong>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupGetUsers(servername.rawAddress, groupname.rawAddress, level.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), entriesread.rawAddress, totalentries.rawAddress, resumehandle.rawAddress).toUInt()

public actual fun netGroupSetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupSetInfo(servername.rawAddress, groupname.rawAddress, level.toInt(), buf.rawAddress, parmErr.rawAddress).toUInt()

public actual fun netGroupSetUsers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, totalentries: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupSetUsers(servername.rawAddress, groupname.rawAddress, level.toInt(), buf.rawAddress, totalentries.toInt()).toUInt()

public actual fun netIsServiceAccount(servername: Pcwstr, accountname: Pcwstr, isservice: MutPtr<Bool>): Ntstatus =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetIsServiceAccount(servername.rawAddress, accountname.rawAddress, isservice.rawAddress)

public actual fun netJoinDomain(lpserver: Pcwstr, lpdomain: Pcwstr, lpmachineaccountou: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, fjoinoptions: NetJoinDomainJoinOptions): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetJoinDomain(lpserver.rawAddress, lpdomain.rawAddress, lpmachineaccountou.rawAddress, lpaccount.rawAddress, lppassword.rawAddress, fjoinoptions.toInt()).toUInt()

public actual fun netLocalGroupAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAdd(servername.rawAddress, level.toInt(), buf.rawAddress, parmErr.rawAddress).toUInt()

public actual fun netLocalGroupAddMember(servername: Pcwstr, groupname: Pcwstr, membersid: Psid): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAddMember(servername.rawAddress, groupname.rawAddress, membersid.rawAddress).toUInt()

public actual fun netLocalGroupAddMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, totalentries: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAddMembers(servername.rawAddress, groupname.rawAddress, level.toInt(), buf.rawAddress, totalentries.toInt()).toUInt()

public actual fun netLocalGroupDel(servername: Pcwstr, groupname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDel(servername.rawAddress, groupname.rawAddress).toUInt()

public actual fun netLocalGroupDelMember(servername: Pcwstr, groupname: Pcwstr, membersid: Psid): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDelMember(servername.rawAddress, groupname.rawAddress, membersid.rawAddress).toUInt()

public actual fun netLocalGroupDelMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, totalentries: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDelMembers(servername.rawAddress, groupname.rawAddress, level.toInt(), buf.rawAddress, totalentries.toInt()).toUInt()

public actual fun netLocalGroupEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<ULong>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupEnum(servername.rawAddress, level.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), entriesread.rawAddress, totalentries.rawAddress, resumehandle.rawAddress).toUInt()

public actual fun netLocalGroupGetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupGetInfo(servername.rawAddress, groupname.rawAddress, level.toInt(), bufptr.rawAddress).toUInt()

public actual fun netLocalGroupGetMembers(servername: Pcwstr, localgroupname: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<ULong>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupGetMembers(servername.rawAddress, localgroupname.rawAddress, level.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), entriesread.rawAddress, totalentries.rawAddress, resumehandle.rawAddress).toUInt()

public actual fun netLocalGroupSetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupSetInfo(servername.rawAddress, groupname.rawAddress, level.toInt(), buf.rawAddress, parmErr.rawAddress).toUInt()

public actual fun netLocalGroupSetMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, totalentries: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupSetMembers(servername.rawAddress, groupname.rawAddress, level.toInt(), buf.rawAddress, totalentries.toInt()).toUInt()

public actual fun netMessageBufferSend(servername: Pcwstr, msgname: Pcwstr, fromname: Pcwstr, buf: ConstPtr<UByte>, buflen: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageBufferSend(servername.rawAddress, msgname.rawAddress, fromname.rawAddress, buf.rawAddress, buflen.toInt()).toUInt()

public actual fun netMessageNameAdd(servername: Pcwstr, msgname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameAdd(servername.rawAddress, msgname.rawAddress).toUInt()

public actual fun netMessageNameDel(servername: Pcwstr, msgname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameDel(servername.rawAddress, msgname.rawAddress).toUInt()

public actual fun netMessageNameEnum(servername: Pcwstr, level: UInt, bufptr: ConstPtr<ConstPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameEnum(servername.rawAddress, level.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), entriesread.rawAddress, totalentries.rawAddress, resumeHandle.rawAddress).toUInt()

public actual fun netMessageNameGetInfo(servername: Pcwstr, msgname: Pcwstr, level: UInt, bufptr: ConstPtr<ConstPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameGetInfo(servername.rawAddress, msgname.rawAddress, level.toInt(), bufptr.rawAddress).toUInt()

public actual fun netProvisionComputerAccount(lpdomain: Pcwstr, lpmachinename: Pcwstr, lpmachineaccountou: Pcwstr, lpdcname: Pcwstr, dwoptions: NetsetupProvision, pprovisionbindata: MutPtr<MutPtr<UByte>>, pdwprovisionbindatasize: MutPtr<UInt>, pprovisiontextdata: MutPtr<Pwstr>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetProvisionComputerAccount(lpdomain.rawAddress, lpmachinename.rawAddress, lpmachineaccountou.rawAddress, lpdcname.rawAddress, dwoptions.toInt(), pprovisionbindata.rawAddress, pdwprovisionbindatasize.rawAddress, pprovisiontextdata.rawAddress).toUInt()

public actual fun netQueryDisplayInformation(servername: Pcwstr, level: UInt, index: UInt, entriesrequested: UInt, preferredmaximumlength: UInt, returnedentrycount: MutPtr<UInt>, sortedbuffer: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetQueryDisplayInformation(servername.rawAddress, level.toInt(), index.toInt(), entriesrequested.toInt(), preferredmaximumlength.toInt(), returnedentrycount.rawAddress, sortedbuffer.rawAddress).toUInt()

public actual fun netQueryServiceAccount(servername: Pcwstr, accountname: Pcwstr, infolevel: UInt, buffer: MutPtr<MutPtr<UByte>>): Ntstatus =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetQueryServiceAccount(servername.rawAddress, accountname.rawAddress, infolevel.toInt(), buffer.rawAddress)

public actual fun netRemoteComputerSupports(uncservername: Pcwstr, optionswanted: NetRemoteComputerSupportsOptions, optionssupported: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoteComputerSupports(uncservername.rawAddress, optionswanted.toInt(), optionssupported.rawAddress).toUInt()

public actual fun netRemoteTOD(uncservername: Pcwstr, bufferptr: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoteTOD(uncservername.rawAddress, bufferptr.rawAddress).toUInt()

public actual fun netRemoveAlternateComputerName(server: Pcwstr, alternatename: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoveAlternateComputerName(server.rawAddress, alternatename.rawAddress, domainaccount.rawAddress, domainaccountpassword.rawAddress, reserved.toInt()).toUInt()

public actual fun netRemoveServiceAccount(servername: Pcwstr, accountname: Pcwstr, flags: UInt): Ntstatus =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoveServiceAccount(servername.rawAddress, accountname.rawAddress, flags.toInt())

public actual fun netRenameMachineInDomain(lpserver: Pcwstr, lpnewmachinename: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, frenameoptions: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetRenameMachineInDomain(lpserver.rawAddress, lpnewmachinename.rawAddress, lpaccount.rawAddress, lppassword.rawAddress, frenameoptions.toInt()).toUInt()

public actual fun netReplExportDirAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirAdd(servername.rawAddress, level.toInt(), buf.rawAddress, parmErr.rawAddress).toUInt()

public actual fun netReplExportDirDel(servername: Pcwstr, dirname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirDel(servername.rawAddress, dirname.rawAddress).toUInt()

public actual fun netReplExportDirEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirEnum(servername.rawAddress, level.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), entriesread.rawAddress, totalentries.rawAddress, resumehandle.rawAddress).toUInt()

public actual fun netReplExportDirGetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirGetInfo(servername.rawAddress, dirname.rawAddress, level.toInt(), bufptr.rawAddress).toUInt()

public actual fun netReplExportDirLock(servername: Pcwstr, dirname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirLock(servername.rawAddress, dirname.rawAddress).toUInt()

public actual fun netReplExportDirSetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirSetInfo(servername.rawAddress, dirname.rawAddress, level.toInt(), buf.rawAddress, parmErr.rawAddress).toUInt()

public actual fun netReplExportDirUnlock(servername: Pcwstr, dirname: Pcwstr, unlockforce: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirUnlock(servername.rawAddress, dirname.rawAddress, unlockforce.toInt()).toUInt()

public actual fun netReplGetInfo(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplGetInfo(servername.rawAddress, level.toInt(), bufptr.rawAddress).toUInt()

public actual fun netReplImportDirAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirAdd(servername.rawAddress, level.toInt(), buf.rawAddress, parmErr.rawAddress).toUInt()

public actual fun netReplImportDirDel(servername: Pcwstr, dirname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirDel(servername.rawAddress, dirname.rawAddress).toUInt()

public actual fun netReplImportDirEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirEnum(servername.rawAddress, level.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), entriesread.rawAddress, totalentries.rawAddress, resumehandle.rawAddress).toUInt()

public actual fun netReplImportDirGetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirGetInfo(servername.rawAddress, dirname.rawAddress, level.toInt(), bufptr.rawAddress).toUInt()

public actual fun netReplImportDirLock(servername: Pcwstr, dirname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirLock(servername.rawAddress, dirname.rawAddress).toUInt()

public actual fun netReplImportDirUnlock(servername: Pcwstr, dirname: Pcwstr, unlockforce: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirUnlock(servername.rawAddress, dirname.rawAddress, unlockforce.toInt()).toUInt()

public actual fun netReplSetInfo(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplSetInfo(servername.rawAddress, level.toInt(), buf.rawAddress, parmErr.rawAddress).toUInt()

public actual fun netRequestOfflineDomainJoin(pprovisionbindata: ConstPtr<UByte>, cbprovisionbindatasize: UInt, dwoptions: NetRequestProvisionOptions, lpwindowspath: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetRequestOfflineDomainJoin(pprovisionbindata.rawAddress, cbprovisionbindatasize.toInt(), dwoptions.toInt(), lpwindowspath.rawAddress).toUInt()

public actual fun netRequestProvisioningPackageInstall(ppackagebindata: ConstPtr<UByte>, dwpackagebindatasize: UInt, dwprovisionoptions: NetRequestProvisionOptions, lpwindowspath: Pcwstr, pvreserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetRequestProvisioningPackageInstall(ppackagebindata.rawAddress, dwpackagebindatasize.toInt(), dwprovisionoptions.toInt(), lpwindowspath.rawAddress, pvreserved.rawAddress).toUInt()

public actual fun netScheduleJobAdd(servername: Pcwstr, buffer: MutPtr<UByte>, jobid: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobAdd(servername.rawAddress, buffer.rawAddress, jobid.rawAddress).toUInt()

public actual fun netScheduleJobDel(servername: Pcwstr, minjobid: UInt, maxjobid: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobDel(servername.rawAddress, minjobid.toInt(), maxjobid.toInt()).toUInt()

public actual fun netScheduleJobEnum(servername: Pcwstr, pointertobuffer: MutPtr<MutPtr<UByte>>, prefferedmaximumlength: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobEnum(servername.rawAddress, pointertobuffer.rawAddress, prefferedmaximumlength.toInt(), entriesread.rawAddress, totalentries.rawAddress, resumehandle.rawAddress).toUInt()

public actual fun netScheduleJobGetInfo(servername: Pcwstr, jobid: UInt, pointertobuffer: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobGetInfo(servername.rawAddress, jobid.toInt(), pointertobuffer.rawAddress).toUInt()

public actual fun netServerComputerNameAdd(servername: Pcwstr, emulateddomainname: Pcwstr, emulatedservername: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerComputerNameAdd(servername.rawAddress, emulateddomainname.rawAddress, emulatedservername.rawAddress).toUInt()

public actual fun netServerComputerNameDel(servername: Pcwstr, emulatedservername: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerComputerNameDel(servername.rawAddress, emulatedservername.rawAddress).toUInt()

public actual fun netServerDiskEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerDiskEnum(servername.rawAddress, level.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), entriesread.rawAddress, totalentries.rawAddress, resumeHandle.rawAddress).toUInt()

public actual fun netServerEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, servertype: NetServerType, domain: Pcwstr, resumeHandle: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerEnum(servername.rawAddress, level.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), entriesread.rawAddress, totalentries.rawAddress, servertype.toInt(), domain.rawAddress, resumeHandle.rawAddress).toUInt()

public actual fun netServerGetInfo(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerGetInfo(servername.rawAddress, level.toInt(), bufptr.rawAddress).toUInt()

public actual fun netServerSetInfo(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmerror: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerSetInfo(servername.rawAddress, level.toInt(), buf.rawAddress, parmerror.rawAddress).toUInt()

public actual fun netServerTransportAdd(servername: Pcwstr, level: UInt, bufptr: ConstPtr<UByte>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportAdd(servername.rawAddress, level.toInt(), bufptr.rawAddress).toUInt()

public actual fun netServerTransportAddEx(servername: Pcwstr, level: UInt, bufptr: ConstPtr<UByte>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportAddEx(servername.rawAddress, level.toInt(), bufptr.rawAddress).toUInt()

public actual fun netServerTransportDel(servername: Pcwstr, level: UInt, bufptr: ConstPtr<UByte>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportDel(servername.rawAddress, level.toInt(), bufptr.rawAddress).toUInt()

public actual fun netServerTransportEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportEnum(servername.rawAddress, level.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), entriesread.rawAddress, totalentries.rawAddress, resumeHandle.rawAddress).toUInt()

public actual fun netServiceControl(servername: Pcwstr, service: Pcwstr, opcode: UInt, arg: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceControl(servername.rawAddress, service.rawAddress, opcode.toInt(), arg.toInt(), bufptr.rawAddress).toUInt()

public actual fun netServiceEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceEnum(servername.rawAddress, level.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), entriesread.rawAddress, totalentries.rawAddress, resumeHandle.rawAddress).toUInt()

public actual fun netServiceGetInfo(servername: Pcwstr, service: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceGetInfo(servername.rawAddress, service.rawAddress, level.toInt(), bufptr.rawAddress).toUInt()

public actual fun netServiceInstall(servername: Pcwstr, service: Pcwstr, argc: UInt, argv: ConstPtr<Pcwstr>, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceInstall(servername.rawAddress, service.rawAddress, argc.toInt(), argv.rawAddress, bufptr.rawAddress).toUInt()

public actual fun netSetPrimaryComputerName(server: Pcwstr, primaryname: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetSetPrimaryComputerName(server.rawAddress, primaryname.rawAddress, domainaccount.rawAddress, domainaccountpassword.rawAddress, reserved.toInt()).toUInt()

public actual fun netUnjoinDomain(lpserver: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, funjoinoptions: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetUnjoinDomain(lpserver.rawAddress, lpaccount.rawAddress, lppassword.rawAddress, funjoinoptions.toInt()).toUInt()

public actual fun netUseAdd(servername: ConstPtr<Byte>, levelflags: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetUseAdd(servername.rawAddress, levelflags.toInt(), buf.rawAddress, parmErr.rawAddress).toUInt()

public actual fun netUseDel(uncservername: Pcwstr, usename: Pcwstr, forcelevelflags: ForceLevelFlags): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetUseDel(uncservername.rawAddress, usename.rawAddress, forcelevelflags.toInt()).toUInt()

public actual fun netUseEnum(uncservername: Pcwstr, levelflags: UInt, bufptr: MutPtr<MutPtr<UByte>>, preferedmaximumsize: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetUseEnum(uncservername.rawAddress, levelflags.toInt(), bufptr.rawAddress, preferedmaximumsize.toInt(), entriesread.rawAddress, totalentries.rawAddress, resumehandle.rawAddress).toUInt()

public actual fun netUseGetInfo(uncservername: Pcwstr, usename: Pcwstr, levelflags: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetUseGetInfo(uncservername.rawAddress, usename.rawAddress, levelflags.toInt(), bufptr.rawAddress).toUInt()

public actual fun netUserAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserAdd(servername.rawAddress, level.toInt(), buf.rawAddress, parmErr.rawAddress).toUInt()

public actual fun netUserChangePassword(domainname: Pcwstr, username: Pcwstr, oldpassword: Pcwstr, newpassword: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserChangePassword(domainname.rawAddress, username.rawAddress, oldpassword.rawAddress, newpassword.rawAddress).toUInt()

public actual fun netUserDel(servername: Pcwstr, username: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserDel(servername.rawAddress, username.rawAddress).toUInt()

public actual fun netUserEnum(servername: Pcwstr, level: UInt, filter: NetUserEnumFilterFlags, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserEnum(servername.rawAddress, level.toInt(), filter.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), entriesread.rawAddress, totalentries.rawAddress, resumeHandle.rawAddress).toUInt()

public actual fun netUserGetGroups(servername: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetGroups(servername.rawAddress, username.rawAddress, level.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), entriesread.rawAddress, totalentries.rawAddress).toUInt()

public actual fun netUserGetInfo(servername: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetInfo(servername.rawAddress, username.rawAddress, level.toInt(), bufptr.rawAddress).toUInt()

public actual fun netUserGetLocalGroups(servername: Pcwstr, username: Pcwstr, level: UInt, flags: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetLocalGroups(servername.rawAddress, username.rawAddress, level.toInt(), flags.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), entriesread.rawAddress, totalentries.rawAddress).toUInt()

public actual fun netUserModalsGet(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserModalsGet(servername.rawAddress, level.toInt(), bufptr.rawAddress).toUInt()

public actual fun netUserModalsSet(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserModalsSet(servername.rawAddress, level.toInt(), buf.rawAddress, parmErr.rawAddress).toUInt()

public actual fun netUserSetGroups(servername: Pcwstr, username: Pcwstr, level: UInt, buf: ConstPtr<UByte>, numEntries: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserSetGroups(servername.rawAddress, username.rawAddress, level.toInt(), buf.rawAddress, numEntries.toInt()).toUInt()

public actual fun netUserSetInfo(servername: Pcwstr, username: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserSetInfo(servername.rawAddress, username.rawAddress, level.toInt(), buf.rawAddress, parmErr.rawAddress).toUInt()

public actual fun netValidateName(lpserver: Pcwstr, lpname: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, nametype: NetsetupNameType): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetValidateName(lpserver.rawAddress, lpname.rawAddress, lpaccount.rawAddress, lppassword.rawAddress, nametype).toUInt()

public actual fun netValidatePasswordPolicy(servername: Pcwstr, qualifier: MutPtr<CVoid>, validationtype: NetValidatePasswordType, inputarg: MutPtr<CVoid>, outputarg: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetValidatePasswordPolicy(servername.rawAddress, qualifier.rawAddress, validationtype, inputarg.rawAddress, outputarg.rawAddress).toUInt()

public actual fun netValidatePasswordPolicyFree(outputarg: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetValidatePasswordPolicyFree(outputarg.rawAddress).toUInt()

public actual fun netWkstaGetInfo(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaGetInfo(servername.rawAddress, level.toInt(), bufptr.rawAddress).toUInt()

public actual fun netWkstaSetInfo(servername: Pcwstr, level: UInt, buffer: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaSetInfo(servername.rawAddress, level.toInt(), buffer.rawAddress, parmErr.rawAddress).toUInt()

public actual fun netWkstaTransportAdd(servername: ConstPtr<Byte>, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportAdd(servername.rawAddress, level.toInt(), buf.rawAddress, parmErr.rawAddress).toUInt()

public actual fun netWkstaTransportDel(servername: Pcwstr, transportname: Pcwstr, ucond: ForceLevelFlags): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportDel(servername.rawAddress, transportname.rawAddress, ucond.toInt()).toUInt()

public actual fun netWkstaTransportEnum(servername: ConstPtr<Byte>, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportEnum(servername.rawAddress, level.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), entriesread.rawAddress, totalentries.rawAddress, resumeHandle.rawAddress).toUInt()

public actual fun netWkstaUserEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserEnum(servername.rawAddress, level.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), entriesread.rawAddress, totalentries.rawAddress, resumehandle.rawAddress).toUInt()

public actual fun netWkstaUserGetInfo(reserved: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserGetInfo(reserved.rawAddress, level.toInt(), bufptr.rawAddress).toUInt()

public actual fun netWkstaUserSetInfo(reserved: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserSetInfo(reserved.rawAddress, level.toInt(), buf.rawAddress, parmErr.rawAddress).toUInt()

public actual fun routerAssert(pszfailedassertion: Pcstr, pszfilename: Pcstr, dwlinenumber: UInt, pszmessage: Pcstr) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementRouterAssert(pszfailedassertion.rawAddress, pszfilename.rawAddress, dwlinenumber.toInt(), pszmessage.rawAddress)
}

public actual fun routerGetErrorStringA(dwerrorcode: UInt, lplpszerrorstring: MutPtr<Pstr>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementRouterGetErrorStringA(dwerrorcode.toInt(), lplpszerrorstring.rawAddress).toUInt()

public actual fun routerGetErrorStringW(dwerrorcode: UInt, lplpwszerrorstring: MutPtr<Pwstr>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementRouterGetErrorStringW(dwerrorcode.toInt(), lplpwszerrorstring.rawAddress).toUInt()

public actual fun routerLogDeregisterA(hloghandle: Handle) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogDeregisterA(hloghandle.rawAddress)
}

public actual fun routerLogDeregisterW(hloghandle: Handle) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogDeregisterW(hloghandle.rawAddress)
}

public actual fun routerLogEventA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr<Pcstr>, dwerrorcode: UInt) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventA(hloghandle.rawAddress, dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.rawAddress, dwerrorcode.toInt())
}

public actual fun routerLogEventDataA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr<Pcstr>, dwdatabytes: UInt, lpdatabytes: MutPtr<UByte>) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventDataA(hloghandle.rawAddress, dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.rawAddress, dwdatabytes.toInt(), lpdatabytes.rawAddress)
}

public actual fun routerLogEventDataW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr<Pcwstr>, dwdatabytes: UInt, lpdatabytes: MutPtr<UByte>) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventDataW(hloghandle.rawAddress, dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.rawAddress, dwdatabytes.toInt(), lpdatabytes.rawAddress)
}

public actual fun routerLogEventExA(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcstr, vararg variadicArgs: Long) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventExA(hloghandle.rawAddress, dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), ptszformat.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun routerLogEventExW(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcwstr, vararg variadicArgs: Long) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventExW(hloghandle.rawAddress, dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), ptszformat.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun routerLogEventStringA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr<Pcstr>, dwerrorcode: UInt, dwerrorindex: UInt) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventStringA(hloghandle.rawAddress, dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.rawAddress, dwerrorcode.toInt(), dwerrorindex.toInt())
}

public actual fun routerLogEventStringW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr<Pcwstr>, dwerrorcode: UInt, dwerrorindex: UInt) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventStringW(hloghandle.rawAddress, dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.rawAddress, dwerrorcode.toInt(), dwerrorindex.toInt())
}

public actual fun routerLogEventValistExA(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcstr, arglist: MutPtr<Byte>) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventValistExA(hloghandle.rawAddress, dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), ptszformat.rawAddress, arglist.rawAddress)
}

public actual fun routerLogEventValistExW(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcwstr, arglist: MutPtr<Byte>) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventValistExW(hloghandle.rawAddress, dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), ptszformat.rawAddress, arglist.rawAddress)
}

public actual fun routerLogEventW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr<Pcwstr>, dwerrorcode: UInt) {
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventW(hloghandle.rawAddress, dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.rawAddress, dwerrorcode.toInt())
}

public actual fun routerLogRegisterA(lpszsource: Pcstr): Handle =
    MutPtr(WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogRegisterA(lpszsource.rawAddress))

public actual fun routerLogRegisterW(lpszsource: Pcwstr): Handle =
    MutPtr(WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogRegisterW(lpszsource.rawAddress))

public actual fun setNetScheduleAccountInformation(pwszservername: Pcwstr, pwszaccount: Pcwstr, pwszpassword: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementSetNetScheduleAccountInformation(pwszservername.rawAddress, pwszaccount.rawAddress, pwszpassword.rawAddress)

public actual fun traceDeregisterA(dwtraceid: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterA(dwtraceid.toInt()).toUInt()

public actual fun traceDeregisterExA(dwtraceid: UInt, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterExA(dwtraceid.toInt(), dwflags.toInt()).toUInt()

public actual fun traceDeregisterExW(dwtraceid: UInt, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterExW(dwtraceid.toInt(), dwflags.toInt()).toUInt()

public actual fun traceDeregisterW(dwtraceid: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterW(dwtraceid.toInt()).toUInt()

public actual fun traceDumpExA(dwtraceid: UInt, dwflags: UInt, lpbbytes: MutPtr<UByte>, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: Bool, lpszprefix: Pcstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementTraceDumpExA(dwtraceid.toInt(), dwflags.toInt(), lpbbytes.rawAddress, dwbytecount.toInt(), dwgroupsize.toInt(), baddressprefix, lpszprefix.rawAddress).toUInt()

public actual fun traceDumpExW(dwtraceid: UInt, dwflags: UInt, lpbbytes: MutPtr<UByte>, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: Bool, lpszprefix: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementTraceDumpExW(dwtraceid.toInt(), dwflags.toInt(), lpbbytes.rawAddress, dwbytecount.toInt(), dwgroupsize.toInt(), baddressprefix, lpszprefix.rawAddress).toUInt()

public actual fun traceGetConsoleA(dwtraceid: UInt, lphconsole: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementTraceGetConsoleA(dwtraceid.toInt(), lphconsole.rawAddress).toUInt()

public actual fun traceGetConsoleW(dwtraceid: UInt, lphconsole: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementTraceGetConsoleW(dwtraceid.toInt(), lphconsole.rawAddress).toUInt()

public actual fun tracePrintfA(dwtraceid: UInt, lpszformat: Pcstr, vararg variadicArgs: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfA(dwtraceid.toInt(), lpszformat.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun tracePrintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcstr, vararg variadicArgs: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfExA(dwtraceid.toInt(), dwflags.toInt(), lpszformat.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun tracePrintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfExW(dwtraceid.toInt(), dwflags.toInt(), lpszformat.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun tracePrintfW(dwtraceid: UInt, lpszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfW(dwtraceid.toInt(), lpszformat.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun tracePutsExA(dwtraceid: UInt, dwflags: UInt, lpszstring: Pcstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementTracePutsExA(dwtraceid.toInt(), dwflags.toInt(), lpszstring.rawAddress).toUInt()

public actual fun tracePutsExW(dwtraceid: UInt, dwflags: UInt, lpszstring: Pcwstr): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementTracePutsExW(dwtraceid.toInt(), dwflags.toInt(), lpszstring.rawAddress).toUInt()

public actual fun traceRegisterExA(lpszcallername: Pcstr, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementTraceRegisterExA(lpszcallername.rawAddress, dwflags.toInt()).toUInt()

public actual fun traceRegisterExW(lpszcallername: Pcwstr, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementTraceRegisterExW(lpszcallername.rawAddress, dwflags.toInt()).toUInt()

public actual fun traceVprintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcstr, arglist: MutPtr<Byte>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementTraceVprintfExA(dwtraceid.toInt(), dwflags.toInt(), lpszformat.rawAddress, arglist.rawAddress).toUInt()

public actual fun traceVprintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcwstr, arglist: MutPtr<Byte>): UInt =
    WindowsWin32NetworkmanagementNetmanagementJniBridge.windowssysWindowsWin32NetworkmanagementNetmanagementTraceVprintfExW(dwtraceid.toInt(), dwflags.toInt(), lpszformat.rawAddress, arglist.rawAddress).toUInt()
