@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getNetScheduleAccountInformation(pwszservername: Pcwstr, ccaccount: UInt, wszaccount: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_getNetScheduleAccountInformation(pwszservername?.value?.toCPointer<ByteVar>(), ccaccount, wszaccount?.value?.toCPointer<ByteVar>())

public actual fun iNetLogonControl2(servername: Pcwstr, functioncode: UInt, querylevel: UInt, data: COpaquePointer?, buffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_iNetLogonControl2(servername?.value?.toCPointer<ByteVar>(), functioncode, querylevel, data?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun logErrorA(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: COpaquePointer?, dwerrorcode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_logErrorA(dwmessageid, cnumberofsubstrings, plpwssubstrings?.value?.toCPointer<ByteVar>(), dwerrorcode)
}

public actual fun logErrorW(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: COpaquePointer?, dwerrorcode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_logErrorW(dwmessageid, cnumberofsubstrings, plpwssubstrings?.value?.toCPointer<ByteVar>(), dwerrorcode)
}

public actual fun logEventA(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_logEventA(weventtype, dwmessageid, cnumberofsubstrings, plpwssubstrings?.value?.toCPointer<ByteVar>())
}

public actual fun logEventW(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_logEventW(weventtype, dwmessageid, cnumberofsubstrings, plpwssubstrings?.value?.toCPointer<ByteVar>())
}

public actual fun mprSetupProtocolEnum(dwtransportid: UInt, lplpbuffer: COpaquePointer?, lpdwentriesread: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_mprSetupProtocolEnum(dwtransportid, lplpbuffer?.value?.toCPointer<ByteVar>(), lpdwentriesread?.value?.toCPointer<ByteVar>())

public actual fun mprSetupProtocolFree(lpbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_mprSetupProtocolFree(lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun netAccessAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netAccessAdd(servername?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>(), parmErr?.value?.toCPointer<ByteVar>())

public actual fun netAccessDel(servername: Pcwstr, resource: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netAccessDel(servername?.value?.toCPointer<ByteVar>(), resource?.value?.toCPointer<ByteVar>())

public actual fun netAccessEnum(servername: Pcwstr, basepath: Pcwstr, recursive: UInt, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netAccessEnum(servername?.value?.toCPointer<ByteVar>(), basepath?.value?.toCPointer<ByteVar>(), recursive, level, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>(), resumeHandle?.value?.toCPointer<ByteVar>())

public actual fun netAccessGetInfo(servername: Pcwstr, resource: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netAccessGetInfo(servername?.value?.toCPointer<ByteVar>(), resource?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>())

public actual fun netAccessGetUserPerms(servername: Pcwstr, ugname: Pcwstr, resource: Pcwstr, perms: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netAccessGetUserPerms(servername?.value?.toCPointer<ByteVar>(), ugname?.value?.toCPointer<ByteVar>(), resource?.value?.toCPointer<ByteVar>(), perms?.value?.toCPointer<ByteVar>())

public actual fun netAccessSetInfo(servername: Pcwstr, resource: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netAccessSetInfo(servername?.value?.toCPointer<ByteVar>(), resource?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>(), parmErr?.value?.toCPointer<ByteVar>())

public actual fun netAddAlternateComputerName(server: Pcwstr, alternatename: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netAddAlternateComputerName(server?.value?.toCPointer<ByteVar>(), alternatename?.value?.toCPointer<ByteVar>(), domainaccount?.value?.toCPointer<ByteVar>(), domainaccountpassword?.value?.toCPointer<ByteVar>(), reserved)

public actual fun netAddServiceAccount(servername: Pcwstr, accountname: Pcwstr, password: Pcwstr, flags: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netAddServiceAccount(servername?.value?.toCPointer<ByteVar>(), accountname?.value?.toCPointer<ByteVar>(), password?.value?.toCPointer<ByteVar>(), flags)

public actual fun netAlertRaise(alerttype: Pcwstr, buffer: COpaquePointer?, buffersize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netAlertRaise(alerttype?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun netAlertRaiseEx(alerttype: Pcwstr, variableinfo: COpaquePointer?, variableinfosize: UInt, servicename: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netAlertRaiseEx(alerttype?.value?.toCPointer<ByteVar>(), variableinfo?.value?.toCPointer<ByteVar>(), variableinfosize, servicename?.value?.toCPointer<ByteVar>())

public actual fun netApiBufferAllocate(bytecount: UInt, buffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferAllocate(bytecount, buffer?.value?.toCPointer<ByteVar>())

public actual fun netApiBufferFree(buffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferFree(buffer?.value?.toCPointer<ByteVar>())

public actual fun netApiBufferReallocate(oldbuffer: COpaquePointer?, newbytecount: UInt, newbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferReallocate(oldbuffer?.value?.toCPointer<ByteVar>(), newbytecount, newbuffer?.value?.toCPointer<ByteVar>())

public actual fun netApiBufferSize(buffer: COpaquePointer?, bytecount: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferSize(buffer?.value?.toCPointer<ByteVar>(), bytecount?.value?.toCPointer<ByteVar>())

public actual fun netAuditClear(server: Pcwstr, backupfile: Pcwstr, service: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netAuditClear(server?.value?.toCPointer<ByteVar>(), backupfile?.value?.toCPointer<ByteVar>(), service?.value?.toCPointer<ByteVar>())

public actual fun netAuditRead(server: Pcwstr, service: Pcwstr, auditloghandle: COpaquePointer?, offset: UInt, reserved1: COpaquePointer?, reserved2: UInt, offsetflag: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, bytesread: COpaquePointer?, totalavailable: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netAuditRead(server?.value?.toCPointer<ByteVar>(), service?.value?.toCPointer<ByteVar>(), auditloghandle?.value?.toCPointer<ByteVar>(), offset, reserved1?.value?.toCPointer<ByteVar>(), reserved2, offsetflag, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, bytesread?.value?.toCPointer<ByteVar>(), totalavailable?.value?.toCPointer<ByteVar>())

public actual fun netAuditWrite(type: UInt, buf: COpaquePointer?, numbytes: UInt, service: Pcwstr, reserved: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netAuditWrite(type, buf?.value?.toCPointer<ByteVar>(), numbytes, service?.value?.toCPointer<ByteVar>(), reserved?.value?.toCPointer<ByteVar>())

public actual fun netConfigGet(server: Pcwstr, component: Pcwstr, parameter: Pcwstr, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netConfigGet(server?.value?.toCPointer<ByteVar>(), component?.value?.toCPointer<ByteVar>(), parameter?.value?.toCPointer<ByteVar>(), bufptr?.value?.toCPointer<ByteVar>())

public actual fun netConfigGetAll(server: Pcwstr, component: Pcwstr, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netConfigGetAll(server?.value?.toCPointer<ByteVar>(), component?.value?.toCPointer<ByteVar>(), bufptr?.value?.toCPointer<ByteVar>())

public actual fun netConfigSet(server: Pcwstr, reserved1: Pcwstr, component: Pcwstr, level: UInt, reserved2: UInt, buf: COpaquePointer?, reserved3: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netConfigSet(server?.value?.toCPointer<ByteVar>(), reserved1?.value?.toCPointer<ByteVar>(), component?.value?.toCPointer<ByteVar>(), level, reserved2, buf?.value?.toCPointer<ByteVar>(), reserved3)

public actual fun netCreateProvisioningPackage(pprovisioningparams: COpaquePointer?, pppackagebindata: COpaquePointer?, pdwpackagebindatasize: COpaquePointer?, pppackagetextdata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netCreateProvisioningPackage(pprovisioningparams?.value?.toCPointer<ByteVar>(), pppackagebindata?.value?.toCPointer<ByteVar>(), pdwpackagebindatasize?.value?.toCPointer<ByteVar>(), pppackagetextdata?.value?.toCPointer<ByteVar>())

public actual fun netEnumerateComputerNames(server: Pcwstr, nametype: NetComputerNameType, reserved: UInt, entrycount: COpaquePointer?, computernames: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netEnumerateComputerNames(server?.value?.toCPointer<ByteVar>(), nametype, reserved, entrycount?.value?.toCPointer<ByteVar>(), computernames?.value?.toCPointer<ByteVar>())

public actual fun netEnumerateServiceAccounts(servername: Pcwstr, flags: UInt, accountscount: COpaquePointer?, accounts: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netEnumerateServiceAccounts(servername?.value?.toCPointer<ByteVar>(), flags, accountscount?.value?.toCPointer<ByteVar>(), accounts?.value?.toCPointer<ByteVar>())

public actual fun netErrorLogClear(uncservername: Pcwstr, backupfile: Pcwstr, reserved: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netErrorLogClear(uncservername?.value?.toCPointer<ByteVar>(), backupfile?.value?.toCPointer<ByteVar>(), reserved?.value?.toCPointer<ByteVar>())

public actual fun netErrorLogRead(uncservername: Pcwstr, reserved1: Pcwstr, errorloghandle: COpaquePointer?, offset: UInt, reserved2: COpaquePointer?, reserved3: UInt, offsetflag: UInt, bufptr: COpaquePointer?, prefmaxsize: UInt, bytesread: COpaquePointer?, totalavailable: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netErrorLogRead(uncservername?.value?.toCPointer<ByteVar>(), reserved1?.value?.toCPointer<ByteVar>(), errorloghandle?.value?.toCPointer<ByteVar>(), offset, reserved2?.value?.toCPointer<ByteVar>(), reserved3, offsetflag, bufptr?.value?.toCPointer<ByteVar>(), prefmaxsize, bytesread?.value?.toCPointer<ByteVar>(), totalavailable?.value?.toCPointer<ByteVar>())

public actual fun netErrorLogWrite(reserved1: COpaquePointer?, code: UInt, component: Pcwstr, buffer: COpaquePointer?, numbytes: UInt, msgbuf: COpaquePointer?, strcount: UInt, reserved2: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netErrorLogWrite(reserved1?.value?.toCPointer<ByteVar>(), code, component?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), numbytes, msgbuf?.value?.toCPointer<ByteVar>(), strcount, reserved2?.value?.toCPointer<ByteVar>())

public actual fun netFreeAadJoinInformation(pjoininfo: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netFreeAadJoinInformation(pjoininfo?.value?.toCPointer<ByteVar>())
}

public actual fun netGetAadJoinInformation(pcsztenantid: Pcwstr, ppjoininfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netGetAadJoinInformation(pcsztenantid?.value?.toCPointer<ByteVar>(), ppjoininfo?.value?.toCPointer<ByteVar>())

public actual fun netGetAnyDCName(servername: Pcwstr, domainname: Pcwstr, buffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netGetAnyDCName(servername?.value?.toCPointer<ByteVar>(), domainname?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun netGetDCName(servername: Pcwstr, domainname: Pcwstr, buffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netGetDCName(servername?.value?.toCPointer<ByteVar>(), domainname?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun netGetDisplayInformationIndex(servername: Pcwstr, level: UInt, prefix: Pcwstr, index: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netGetDisplayInformationIndex(servername?.value?.toCPointer<ByteVar>(), level, prefix?.value?.toCPointer<ByteVar>(), index?.value?.toCPointer<ByteVar>())

public actual fun netGetJoinInformation(lpserver: Pcwstr, lpnamebuffer: COpaquePointer?, buffertype: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netGetJoinInformation(lpserver?.value?.toCPointer<ByteVar>(), lpnamebuffer?.value?.toCPointer<ByteVar>(), buffertype?.value?.toCPointer<ByteVar>())

public actual fun netGetJoinableOUs(lpserver: Pcwstr, lpdomain: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, oucount: COpaquePointer?, ous: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netGetJoinableOUs(lpserver?.value?.toCPointer<ByteVar>(), lpdomain?.value?.toCPointer<ByteVar>(), lpaccount?.value?.toCPointer<ByteVar>(), lppassword?.value?.toCPointer<ByteVar>(), oucount?.value?.toCPointer<ByteVar>(), ous?.value?.toCPointer<ByteVar>())

public actual fun netGroupAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netGroupAdd(servername?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>(), parmErr?.value?.toCPointer<ByteVar>())

public actual fun netGroupAddUser(servername: Pcwstr, groupname: Pcwstr, username: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netGroupAddUser(servername?.value?.toCPointer<ByteVar>(), groupname?.value?.toCPointer<ByteVar>(), username?.value?.toCPointer<ByteVar>())

public actual fun netGroupDel(servername: Pcwstr, groupname: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netGroupDel(servername?.value?.toCPointer<ByteVar>(), groupname?.value?.toCPointer<ByteVar>())

public actual fun netGroupDelUser(servername: Pcwstr, groupname: Pcwstr, username: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netGroupDelUser(servername?.value?.toCPointer<ByteVar>(), groupname?.value?.toCPointer<ByteVar>(), username?.value?.toCPointer<ByteVar>())

public actual fun netGroupEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netGroupEnum(servername?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>(), resumeHandle?.value?.toCPointer<ByteVar>())

public actual fun netGroupGetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netGroupGetInfo(servername?.value?.toCPointer<ByteVar>(), groupname?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>())

public actual fun netGroupGetUsers(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netGroupGetUsers(servername?.value?.toCPointer<ByteVar>(), groupname?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>(), resumehandle?.value?.toCPointer<ByteVar>())

public actual fun netGroupSetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netGroupSetInfo(servername?.value?.toCPointer<ByteVar>(), groupname?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>(), parmErr?.value?.toCPointer<ByteVar>())

public actual fun netGroupSetUsers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, totalentries: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netGroupSetUsers(servername?.value?.toCPointer<ByteVar>(), groupname?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>(), totalentries)

public actual fun netIsServiceAccount(servername: Pcwstr, accountname: Pcwstr, isservice: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netIsServiceAccount(servername?.value?.toCPointer<ByteVar>(), accountname?.value?.toCPointer<ByteVar>(), isservice?.value?.toCPointer<ByteVar>())

public actual fun netJoinDomain(lpserver: Pcwstr, lpdomain: Pcwstr, lpmachineaccountou: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, fjoinoptions: NetJoinDomainJoinOptions): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netJoinDomain(lpserver?.value?.toCPointer<ByteVar>(), lpdomain?.value?.toCPointer<ByteVar>(), lpmachineaccountou?.value?.toCPointer<ByteVar>(), lpaccount?.value?.toCPointer<ByteVar>(), lppassword?.value?.toCPointer<ByteVar>(), fjoinoptions)

public actual fun netLocalGroupAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupAdd(servername?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>(), parmErr?.value?.toCPointer<ByteVar>())

public actual fun netLocalGroupAddMember(servername: Pcwstr, groupname: Pcwstr, membersid: Psid): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupAddMember(servername?.value?.toCPointer<ByteVar>(), groupname?.value?.toCPointer<ByteVar>(), membersid?.value?.toCPointer<ByteVar>())

public actual fun netLocalGroupAddMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, totalentries: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupAddMembers(servername?.value?.toCPointer<ByteVar>(), groupname?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>(), totalentries)

public actual fun netLocalGroupDel(servername: Pcwstr, groupname: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupDel(servername?.value?.toCPointer<ByteVar>(), groupname?.value?.toCPointer<ByteVar>())

public actual fun netLocalGroupDelMember(servername: Pcwstr, groupname: Pcwstr, membersid: Psid): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupDelMember(servername?.value?.toCPointer<ByteVar>(), groupname?.value?.toCPointer<ByteVar>(), membersid?.value?.toCPointer<ByteVar>())

public actual fun netLocalGroupDelMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, totalentries: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupDelMembers(servername?.value?.toCPointer<ByteVar>(), groupname?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>(), totalentries)

public actual fun netLocalGroupEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupEnum(servername?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>(), resumehandle?.value?.toCPointer<ByteVar>())

public actual fun netLocalGroupGetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupGetInfo(servername?.value?.toCPointer<ByteVar>(), groupname?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>())

public actual fun netLocalGroupGetMembers(servername: Pcwstr, localgroupname: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupGetMembers(servername?.value?.toCPointer<ByteVar>(), localgroupname?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>(), resumehandle?.value?.toCPointer<ByteVar>())

public actual fun netLocalGroupSetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupSetInfo(servername?.value?.toCPointer<ByteVar>(), groupname?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>(), parmErr?.value?.toCPointer<ByteVar>())

public actual fun netLocalGroupSetMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, totalentries: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupSetMembers(servername?.value?.toCPointer<ByteVar>(), groupname?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>(), totalentries)

public actual fun netMessageBufferSend(servername: Pcwstr, msgname: Pcwstr, fromname: Pcwstr, buf: COpaquePointer?, buflen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netMessageBufferSend(servername?.value?.toCPointer<ByteVar>(), msgname?.value?.toCPointer<ByteVar>(), fromname?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun netMessageNameAdd(servername: Pcwstr, msgname: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameAdd(servername?.value?.toCPointer<ByteVar>(), msgname?.value?.toCPointer<ByteVar>())

public actual fun netMessageNameDel(servername: Pcwstr, msgname: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameDel(servername?.value?.toCPointer<ByteVar>(), msgname?.value?.toCPointer<ByteVar>())

public actual fun netMessageNameEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameEnum(servername?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>(), resumeHandle?.value?.toCPointer<ByteVar>())

public actual fun netMessageNameGetInfo(servername: Pcwstr, msgname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameGetInfo(servername?.value?.toCPointer<ByteVar>(), msgname?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>())

public actual fun netProvisionComputerAccount(lpdomain: Pcwstr, lpmachinename: Pcwstr, lpmachineaccountou: Pcwstr, lpdcname: Pcwstr, dwoptions: NetsetupProvision, pprovisionbindata: COpaquePointer?, pdwprovisionbindatasize: COpaquePointer?, pprovisiontextdata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netProvisionComputerAccount(lpdomain?.value?.toCPointer<ByteVar>(), lpmachinename?.value?.toCPointer<ByteVar>(), lpmachineaccountou?.value?.toCPointer<ByteVar>(), lpdcname?.value?.toCPointer<ByteVar>(), dwoptions, pprovisionbindata?.value?.toCPointer<ByteVar>(), pdwprovisionbindatasize?.value?.toCPointer<ByteVar>(), pprovisiontextdata?.value?.toCPointer<ByteVar>())

public actual fun netQueryDisplayInformation(servername: Pcwstr, level: UInt, index: UInt, entriesrequested: UInt, preferredmaximumlength: UInt, returnedentrycount: COpaquePointer?, sortedbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netQueryDisplayInformation(servername?.value?.toCPointer<ByteVar>(), level, index, entriesrequested, preferredmaximumlength, returnedentrycount?.value?.toCPointer<ByteVar>(), sortedbuffer?.value?.toCPointer<ByteVar>())

public actual fun netQueryServiceAccount(servername: Pcwstr, accountname: Pcwstr, infolevel: UInt, buffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netQueryServiceAccount(servername?.value?.toCPointer<ByteVar>(), accountname?.value?.toCPointer<ByteVar>(), infolevel, buffer?.value?.toCPointer<ByteVar>())

public actual fun netRemoteComputerSupports(uncservername: Pcwstr, optionswanted: NetRemoteComputerSupportsOptions, optionssupported: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netRemoteComputerSupports(uncservername?.value?.toCPointer<ByteVar>(), optionswanted, optionssupported?.value?.toCPointer<ByteVar>())

public actual fun netRemoteTOD(uncservername: Pcwstr, bufferptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netRemoteTOD(uncservername?.value?.toCPointer<ByteVar>(), bufferptr?.value?.toCPointer<ByteVar>())

public actual fun netRemoveAlternateComputerName(server: Pcwstr, alternatename: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netRemoveAlternateComputerName(server?.value?.toCPointer<ByteVar>(), alternatename?.value?.toCPointer<ByteVar>(), domainaccount?.value?.toCPointer<ByteVar>(), domainaccountpassword?.value?.toCPointer<ByteVar>(), reserved)

public actual fun netRemoveServiceAccount(servername: Pcwstr, accountname: Pcwstr, flags: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netRemoveServiceAccount(servername?.value?.toCPointer<ByteVar>(), accountname?.value?.toCPointer<ByteVar>(), flags)

public actual fun netRenameMachineInDomain(lpserver: Pcwstr, lpnewmachinename: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, frenameoptions: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netRenameMachineInDomain(lpserver?.value?.toCPointer<ByteVar>(), lpnewmachinename?.value?.toCPointer<ByteVar>(), lpaccount?.value?.toCPointer<ByteVar>(), lppassword?.value?.toCPointer<ByteVar>(), frenameoptions)

public actual fun netReplExportDirAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirAdd(servername?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>(), parmErr?.value?.toCPointer<ByteVar>())

public actual fun netReplExportDirDel(servername: Pcwstr, dirname: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirDel(servername?.value?.toCPointer<ByteVar>(), dirname?.value?.toCPointer<ByteVar>())

public actual fun netReplExportDirEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirEnum(servername?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>(), resumehandle?.value?.toCPointer<ByteVar>())

public actual fun netReplExportDirGetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirGetInfo(servername?.value?.toCPointer<ByteVar>(), dirname?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>())

public actual fun netReplExportDirLock(servername: Pcwstr, dirname: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirLock(servername?.value?.toCPointer<ByteVar>(), dirname?.value?.toCPointer<ByteVar>())

public actual fun netReplExportDirSetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirSetInfo(servername?.value?.toCPointer<ByteVar>(), dirname?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>(), parmErr?.value?.toCPointer<ByteVar>())

public actual fun netReplExportDirUnlock(servername: Pcwstr, dirname: Pcwstr, unlockforce: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirUnlock(servername?.value?.toCPointer<ByteVar>(), dirname?.value?.toCPointer<ByteVar>(), unlockforce)

public actual fun netReplGetInfo(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netReplGetInfo(servername?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>())

public actual fun netReplImportDirAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirAdd(servername?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>(), parmErr?.value?.toCPointer<ByteVar>())

public actual fun netReplImportDirDel(servername: Pcwstr, dirname: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirDel(servername?.value?.toCPointer<ByteVar>(), dirname?.value?.toCPointer<ByteVar>())

public actual fun netReplImportDirEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirEnum(servername?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>(), resumehandle?.value?.toCPointer<ByteVar>())

public actual fun netReplImportDirGetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirGetInfo(servername?.value?.toCPointer<ByteVar>(), dirname?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>())

public actual fun netReplImportDirLock(servername: Pcwstr, dirname: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirLock(servername?.value?.toCPointer<ByteVar>(), dirname?.value?.toCPointer<ByteVar>())

public actual fun netReplImportDirUnlock(servername: Pcwstr, dirname: Pcwstr, unlockforce: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirUnlock(servername?.value?.toCPointer<ByteVar>(), dirname?.value?.toCPointer<ByteVar>(), unlockforce)

public actual fun netReplSetInfo(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netReplSetInfo(servername?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>(), parmErr?.value?.toCPointer<ByteVar>())

public actual fun netRequestOfflineDomainJoin(pprovisionbindata: COpaquePointer?, cbprovisionbindatasize: UInt, dwoptions: NetRequestProvisionOptions, lpwindowspath: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netRequestOfflineDomainJoin(pprovisionbindata?.value?.toCPointer<ByteVar>(), cbprovisionbindatasize, dwoptions, lpwindowspath?.value?.toCPointer<ByteVar>())

public actual fun netRequestProvisioningPackageInstall(ppackagebindata: COpaquePointer?, dwpackagebindatasize: UInt, dwprovisionoptions: NetRequestProvisionOptions, lpwindowspath: Pcwstr, pvreserved: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netRequestProvisioningPackageInstall(ppackagebindata?.value?.toCPointer<ByteVar>(), dwpackagebindatasize, dwprovisionoptions, lpwindowspath?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>())

public actual fun netScheduleJobAdd(servername: Pcwstr, buffer: COpaquePointer?, jobid: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobAdd(servername?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), jobid?.value?.toCPointer<ByteVar>())

public actual fun netScheduleJobDel(servername: Pcwstr, minjobid: UInt, maxjobid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobDel(servername?.value?.toCPointer<ByteVar>(), minjobid, maxjobid)

public actual fun netScheduleJobEnum(servername: Pcwstr, pointertobuffer: COpaquePointer?, prefferedmaximumlength: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobEnum(servername?.value?.toCPointer<ByteVar>(), pointertobuffer?.value?.toCPointer<ByteVar>(), prefferedmaximumlength, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>(), resumehandle?.value?.toCPointer<ByteVar>())

public actual fun netScheduleJobGetInfo(servername: Pcwstr, jobid: UInt, pointertobuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobGetInfo(servername?.value?.toCPointer<ByteVar>(), jobid, pointertobuffer?.value?.toCPointer<ByteVar>())

public actual fun netServerComputerNameAdd(servername: Pcwstr, emulateddomainname: Pcwstr, emulatedservername: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netServerComputerNameAdd(servername?.value?.toCPointer<ByteVar>(), emulateddomainname?.value?.toCPointer<ByteVar>(), emulatedservername?.value?.toCPointer<ByteVar>())

public actual fun netServerComputerNameDel(servername: Pcwstr, emulatedservername: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netServerComputerNameDel(servername?.value?.toCPointer<ByteVar>(), emulatedservername?.value?.toCPointer<ByteVar>())

public actual fun netServerDiskEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netServerDiskEnum(servername?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>(), resumeHandle?.value?.toCPointer<ByteVar>())

public actual fun netServerEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, servertype: NetServerType, domain: Pcwstr, resumeHandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netServerEnum(servername?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>(), servertype, domain?.value?.toCPointer<ByteVar>(), resumeHandle?.value?.toCPointer<ByteVar>())

public actual fun netServerGetInfo(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netServerGetInfo(servername?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>())

public actual fun netServerSetInfo(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmerror: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netServerSetInfo(servername?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>(), parmerror?.value?.toCPointer<ByteVar>())

public actual fun netServerTransportAdd(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportAdd(servername?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>())

public actual fun netServerTransportAddEx(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportAddEx(servername?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>())

public actual fun netServerTransportDel(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportDel(servername?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>())

public actual fun netServerTransportEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportEnum(servername?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>(), resumeHandle?.value?.toCPointer<ByteVar>())

public actual fun netServiceControl(servername: Pcwstr, service: Pcwstr, opcode: UInt, arg: UInt, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netServiceControl(servername?.value?.toCPointer<ByteVar>(), service?.value?.toCPointer<ByteVar>(), opcode, arg, bufptr?.value?.toCPointer<ByteVar>())

public actual fun netServiceEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netServiceEnum(servername?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>(), resumeHandle?.value?.toCPointer<ByteVar>())

public actual fun netServiceGetInfo(servername: Pcwstr, service: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netServiceGetInfo(servername?.value?.toCPointer<ByteVar>(), service?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>())

public actual fun netServiceInstall(servername: Pcwstr, service: Pcwstr, argc: UInt, argv: COpaquePointer?, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netServiceInstall(servername?.value?.toCPointer<ByteVar>(), service?.value?.toCPointer<ByteVar>(), argc, argv?.value?.toCPointer<ByteVar>(), bufptr?.value?.toCPointer<ByteVar>())

public actual fun netSetPrimaryComputerName(server: Pcwstr, primaryname: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netSetPrimaryComputerName(server?.value?.toCPointer<ByteVar>(), primaryname?.value?.toCPointer<ByteVar>(), domainaccount?.value?.toCPointer<ByteVar>(), domainaccountpassword?.value?.toCPointer<ByteVar>(), reserved)

public actual fun netUnjoinDomain(lpserver: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, funjoinoptions: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netUnjoinDomain(lpserver?.value?.toCPointer<ByteVar>(), lpaccount?.value?.toCPointer<ByteVar>(), lppassword?.value?.toCPointer<ByteVar>(), funjoinoptions)

public actual fun netUseAdd(servername: COpaquePointer?, levelflags: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netUseAdd(servername?.value?.toCPointer<ByteVar>(), levelflags, buf?.value?.toCPointer<ByteVar>(), parmErr?.value?.toCPointer<ByteVar>())

public actual fun netUseDel(uncservername: Pcwstr, usename: Pcwstr, forcelevelflags: ForceLevelFlags): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netUseDel(uncservername?.value?.toCPointer<ByteVar>(), usename?.value?.toCPointer<ByteVar>(), forcelevelflags)

public actual fun netUseEnum(uncservername: Pcwstr, levelflags: UInt, bufptr: COpaquePointer?, preferedmaximumsize: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netUseEnum(uncservername?.value?.toCPointer<ByteVar>(), levelflags, bufptr?.value?.toCPointer<ByteVar>(), preferedmaximumsize, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>(), resumehandle?.value?.toCPointer<ByteVar>())

public actual fun netUseGetInfo(uncservername: Pcwstr, usename: Pcwstr, levelflags: UInt, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netUseGetInfo(uncservername?.value?.toCPointer<ByteVar>(), usename?.value?.toCPointer<ByteVar>(), levelflags, bufptr?.value?.toCPointer<ByteVar>())

public actual fun netUserAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netUserAdd(servername?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>(), parmErr?.value?.toCPointer<ByteVar>())

public actual fun netUserChangePassword(domainname: Pcwstr, username: Pcwstr, oldpassword: Pcwstr, newpassword: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netUserChangePassword(domainname?.value?.toCPointer<ByteVar>(), username?.value?.toCPointer<ByteVar>(), oldpassword?.value?.toCPointer<ByteVar>(), newpassword?.value?.toCPointer<ByteVar>())

public actual fun netUserDel(servername: Pcwstr, username: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netUserDel(servername?.value?.toCPointer<ByteVar>(), username?.value?.toCPointer<ByteVar>())

public actual fun netUserEnum(servername: Pcwstr, level: UInt, filter: NetUserEnumFilterFlags, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netUserEnum(servername?.value?.toCPointer<ByteVar>(), level, filter, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>(), resumeHandle?.value?.toCPointer<ByteVar>())

public actual fun netUserGetGroups(servername: Pcwstr, username: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netUserGetGroups(servername?.value?.toCPointer<ByteVar>(), username?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>())

public actual fun netUserGetInfo(servername: Pcwstr, username: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netUserGetInfo(servername?.value?.toCPointer<ByteVar>(), username?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>())

public actual fun netUserGetLocalGroups(servername: Pcwstr, username: Pcwstr, level: UInt, flags: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netUserGetLocalGroups(servername?.value?.toCPointer<ByteVar>(), username?.value?.toCPointer<ByteVar>(), level, flags, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>())

public actual fun netUserModalsGet(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netUserModalsGet(servername?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>())

public actual fun netUserModalsSet(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netUserModalsSet(servername?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>(), parmErr?.value?.toCPointer<ByteVar>())

public actual fun netUserSetGroups(servername: Pcwstr, username: Pcwstr, level: UInt, buf: COpaquePointer?, numEntries: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netUserSetGroups(servername?.value?.toCPointer<ByteVar>(), username?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>(), numEntries)

public actual fun netUserSetInfo(servername: Pcwstr, username: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netUserSetInfo(servername?.value?.toCPointer<ByteVar>(), username?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>(), parmErr?.value?.toCPointer<ByteVar>())

public actual fun netValidateName(lpserver: Pcwstr, lpname: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, nametype: NetsetupNameType): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netValidateName(lpserver?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), lpaccount?.value?.toCPointer<ByteVar>(), lppassword?.value?.toCPointer<ByteVar>(), nametype)

public actual fun netValidatePasswordPolicy(servername: Pcwstr, qualifier: COpaquePointer?, validationtype: NetValidatePasswordType, inputarg: COpaquePointer?, outputarg: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netValidatePasswordPolicy(servername?.value?.toCPointer<ByteVar>(), qualifier?.value?.toCPointer<ByteVar>(), validationtype, inputarg?.value?.toCPointer<ByteVar>(), outputarg?.value?.toCPointer<ByteVar>())

public actual fun netValidatePasswordPolicyFree(outputarg: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netValidatePasswordPolicyFree(outputarg?.value?.toCPointer<ByteVar>())

public actual fun netWkstaGetInfo(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaGetInfo(servername?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>())

public actual fun netWkstaSetInfo(servername: Pcwstr, level: UInt, buffer: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaSetInfo(servername?.value?.toCPointer<ByteVar>(), level, buffer?.value?.toCPointer<ByteVar>(), parmErr?.value?.toCPointer<ByteVar>())

public actual fun netWkstaTransportAdd(servername: COpaquePointer?, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaTransportAdd(servername?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>(), parmErr?.value?.toCPointer<ByteVar>())

public actual fun netWkstaTransportDel(servername: Pcwstr, transportname: Pcwstr, ucond: ForceLevelFlags): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaTransportDel(servername?.value?.toCPointer<ByteVar>(), transportname?.value?.toCPointer<ByteVar>(), ucond)

public actual fun netWkstaTransportEnum(servername: COpaquePointer?, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaTransportEnum(servername?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>(), resumeHandle?.value?.toCPointer<ByteVar>())

public actual fun netWkstaUserEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaUserEnum(servername?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>(), resumehandle?.value?.toCPointer<ByteVar>())

public actual fun netWkstaUserGetInfo(reserved: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaUserGetInfo(reserved?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>())

public actual fun netWkstaUserSetInfo(reserved: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaUserSetInfo(reserved?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>(), parmErr?.value?.toCPointer<ByteVar>())

public actual fun routerAssert(pszfailedassertion: Pcstr, pszfilename: Pcstr, dwlinenumber: UInt, pszmessage: Pcstr) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_routerAssert(pszfailedassertion?.value?.toCPointer<ByteVar>(), pszfilename?.value?.toCPointer<ByteVar>(), dwlinenumber, pszmessage?.value?.toCPointer<ByteVar>())
}

public actual fun routerGetErrorStringA(dwerrorcode: UInt, lplpszerrorstring: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_routerGetErrorStringA(dwerrorcode, lplpszerrorstring?.value?.toCPointer<ByteVar>())

public actual fun routerGetErrorStringW(dwerrorcode: UInt, lplpwszerrorstring: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_routerGetErrorStringW(dwerrorcode, lplpwszerrorstring?.value?.toCPointer<ByteVar>())

public actual fun routerLogDeregisterA(hloghandle: Handle) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_routerLogDeregisterA(hloghandle?.value?.toCPointer<ByteVar>())
}

public actual fun routerLogDeregisterW(hloghandle: Handle) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_routerLogDeregisterW(hloghandle?.value?.toCPointer<ByteVar>())
}

public actual fun routerLogEventA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwerrorcode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventA(hloghandle?.value?.toCPointer<ByteVar>(), dweventtype, dwmessageid, dwsubstringcount, plpszsubstringarray?.value?.toCPointer<ByteVar>(), dwerrorcode)
}

public actual fun routerLogEventDataA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwdatabytes: UInt, lpdatabytes: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventDataA(hloghandle?.value?.toCPointer<ByteVar>(), dweventtype, dwmessageid, dwsubstringcount, plpszsubstringarray?.value?.toCPointer<ByteVar>(), dwdatabytes, lpdatabytes?.value?.toCPointer<ByteVar>())
}

public actual fun routerLogEventDataW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwdatabytes: UInt, lpdatabytes: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventDataW(hloghandle?.value?.toCPointer<ByteVar>(), dweventtype, dwmessageid, dwsubstringcount, plpszsubstringarray?.value?.toCPointer<ByteVar>(), dwdatabytes, lpdatabytes?.value?.toCPointer<ByteVar>())
}

public actual fun routerLogEventExA(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcstr, vararg variadicArgs: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventExA(hloghandle?.value?.toCPointer<ByteVar>(), dweventtype, dwerrorcode, dwmessageid, ptszformat?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun routerLogEventExW(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcwstr, vararg variadicArgs: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventExW(hloghandle?.value?.toCPointer<ByteVar>(), dweventtype, dwerrorcode, dwmessageid, ptszformat?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun routerLogEventStringA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwerrorcode: UInt, dwerrorindex: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventStringA(hloghandle?.value?.toCPointer<ByteVar>(), dweventtype, dwmessageid, dwsubstringcount, plpszsubstringarray?.value?.toCPointer<ByteVar>(), dwerrorcode, dwerrorindex)
}

public actual fun routerLogEventStringW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwerrorcode: UInt, dwerrorindex: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventStringW(hloghandle?.value?.toCPointer<ByteVar>(), dweventtype, dwmessageid, dwsubstringcount, plpszsubstringarray?.value?.toCPointer<ByteVar>(), dwerrorcode, dwerrorindex)
}

public actual fun routerLogEventValistExA(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcstr, arglist: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventValistExA(hloghandle?.value?.toCPointer<ByteVar>(), dweventtype, dwerrorcode, dwmessageid, ptszformat?.value?.toCPointer<ByteVar>(), arglist?.value?.toCPointer<ByteVar>())
}

public actual fun routerLogEventValistExW(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcwstr, arglist: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventValistExW(hloghandle?.value?.toCPointer<ByteVar>(), dweventtype, dwerrorcode, dwmessageid, ptszformat?.value?.toCPointer<ByteVar>(), arglist?.value?.toCPointer<ByteVar>())
}

public actual fun routerLogEventW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwerrorcode: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventW(hloghandle?.value?.toCPointer<ByteVar>(), dweventtype, dwmessageid, dwsubstringcount, plpszsubstringarray?.value?.toCPointer<ByteVar>(), dwerrorcode)
}

public actual fun routerLogRegisterA(lpszsource: Pcstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_routerLogRegisterA(lpszsource?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun routerLogRegisterW(lpszsource: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_routerLogRegisterW(lpszsource?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setNetScheduleAccountInformation(pwszservername: Pcwstr, pwszaccount: Pcwstr, pwszpassword: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_setNetScheduleAccountInformation(pwszservername?.value?.toCPointer<ByteVar>(), pwszaccount?.value?.toCPointer<ByteVar>(), pwszpassword?.value?.toCPointer<ByteVar>())

public actual fun traceDeregisterA(dwtraceid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterA(dwtraceid)

public actual fun traceDeregisterExA(dwtraceid: UInt, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterExA(dwtraceid, dwflags)

public actual fun traceDeregisterExW(dwtraceid: UInt, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterExW(dwtraceid, dwflags)

public actual fun traceDeregisterW(dwtraceid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterW(dwtraceid)

public actual fun traceDumpExA(dwtraceid: UInt, dwflags: UInt, lpbbytes: COpaquePointer?, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: Bool, lpszprefix: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_traceDumpExA(dwtraceid, dwflags, lpbbytes?.value?.toCPointer<ByteVar>(), dwbytecount, dwgroupsize, baddressprefix, lpszprefix?.value?.toCPointer<ByteVar>())

public actual fun traceDumpExW(dwtraceid: UInt, dwflags: UInt, lpbbytes: COpaquePointer?, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: Bool, lpszprefix: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_traceDumpExW(dwtraceid, dwflags, lpbbytes?.value?.toCPointer<ByteVar>(), dwbytecount, dwgroupsize, baddressprefix, lpszprefix?.value?.toCPointer<ByteVar>())

public actual fun traceGetConsoleA(dwtraceid: UInt, lphconsole: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_traceGetConsoleA(dwtraceid, lphconsole?.value?.toCPointer<ByteVar>())

public actual fun traceGetConsoleW(dwtraceid: UInt, lphconsole: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_traceGetConsoleW(dwtraceid, lphconsole?.value?.toCPointer<ByteVar>())

public actual fun tracePrintfA(dwtraceid: UInt, lpszformat: Pcstr, vararg variadicArgs: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfA(dwtraceid, lpszformat?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun tracePrintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcstr, vararg variadicArgs: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfExA(dwtraceid, dwflags, lpszformat?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun tracePrintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfExW(dwtraceid, dwflags, lpszformat?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun tracePrintfW(dwtraceid: UInt, lpszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfW(dwtraceid, lpszformat?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun tracePutsExA(dwtraceid: UInt, dwflags: UInt, lpszstring: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_tracePutsExA(dwtraceid, dwflags, lpszstring?.value?.toCPointer<ByteVar>())

public actual fun tracePutsExW(dwtraceid: UInt, dwflags: UInt, lpszstring: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_tracePutsExW(dwtraceid, dwflags, lpszstring?.value?.toCPointer<ByteVar>())

public actual fun traceRegisterExA(lpszcallername: Pcstr, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_traceRegisterExA(lpszcallername?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun traceRegisterExW(lpszcallername: Pcwstr, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_traceRegisterExW(lpszcallername?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun traceVprintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcstr, arglist: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_traceVprintfExA(dwtraceid, dwflags, lpszformat?.value?.toCPointer<ByteVar>(), arglist?.value?.toCPointer<ByteVar>())

public actual fun traceVprintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcwstr, arglist: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement.cinterop.windowssys_windows_win32_networkmanagement_netmanagement_traceVprintfExW(dwtraceid, dwflags, lpszformat?.value?.toCPointer<ByteVar>(), arglist?.value?.toCPointer<ByteVar>())
