@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun getNetScheduleAccountInformation(pwszservername: Pcwstr, ccaccount: UInt, wszaccount: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementGetNetScheduleAccountInformation")

public actual fun iNetLogonControl2(servername: Pcwstr, functioncode: UInt, querylevel: UInt, data: ConstPtr, buffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementINetLogonControl2")

public actual fun logErrorA(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: ConstPtr, dwerrorcode: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementLogErrorA")

public actual fun logErrorW(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: ConstPtr, dwerrorcode: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementLogErrorW")

public actual fun logEventA(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementLogEventA")

public actual fun logEventW(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementLogEventW")

public actual fun mprSetupProtocolEnum(dwtransportid: UInt, lplpbuffer: MutPtr, lpdwentriesread: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementMprSetupProtocolEnum")

public actual fun mprSetupProtocolFree(lpbuffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementMprSetupProtocolFree")

public actual fun netAccessAdd(servername: Pcwstr, level: UInt, buf: ConstPtr, parmErr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessAdd")

public actual fun netAccessDel(servername: Pcwstr, resource: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessDel")

public actual fun netAccessEnum(servername: Pcwstr, basepath: Pcwstr, recursive: UInt, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumeHandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessEnum")

public actual fun netAccessGetInfo(servername: Pcwstr, resource: Pcwstr, level: UInt, bufptr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessGetInfo")

public actual fun netAccessGetUserPerms(servername: Pcwstr, ugname: Pcwstr, resource: Pcwstr, perms: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessGetUserPerms")

public actual fun netAccessSetInfo(servername: Pcwstr, resource: Pcwstr, level: UInt, buf: ConstPtr, parmErr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessSetInfo")

public actual fun netAddAlternateComputerName(server: Pcwstr, alternatename: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetAddAlternateComputerName")

public actual fun netAddServiceAccount(servername: Pcwstr, accountname: Pcwstr, password: Pcwstr, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetAddServiceAccount")

public actual fun netAlertRaise(alerttype: Pcwstr, buffer: ConstPtr, buffersize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetAlertRaise")

public actual fun netAlertRaiseEx(alerttype: Pcwstr, variableinfo: ConstPtr, variableinfosize: UInt, servicename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetAlertRaiseEx")

public actual fun netApiBufferAllocate(bytecount: UInt, buffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferAllocate")

public actual fun netApiBufferFree(buffer: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferFree")

public actual fun netApiBufferReallocate(oldbuffer: ConstPtr, newbytecount: UInt, newbuffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferReallocate")

public actual fun netApiBufferSize(buffer: ConstPtr, bytecount: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferSize")

public actual fun netAuditClear(server: Pcwstr, backupfile: Pcwstr, service: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetAuditClear")

public actual fun netAuditRead(server: Pcwstr, service: Pcwstr, auditloghandle: MutPtr, offset: UInt, reserved1: MutPtr, reserved2: UInt, offsetflag: UInt, bufptr: MutPtr, prefmaxlen: UInt, bytesread: MutPtr, totalavailable: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetAuditRead")

public actual fun netAuditWrite(type: UInt, buf: MutPtr, numbytes: UInt, service: Pcwstr, reserved: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetAuditWrite")

public actual fun netConfigGet(server: Pcwstr, component: Pcwstr, parameter: Pcwstr, bufptr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetConfigGet")

public actual fun netConfigGetAll(server: Pcwstr, component: Pcwstr, bufptr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetConfigGetAll")

public actual fun netConfigSet(server: Pcwstr, reserved1: Pcwstr, component: Pcwstr, level: UInt, reserved2: UInt, buf: MutPtr, reserved3: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetConfigSet")

public actual fun netCreateProvisioningPackage(pprovisioningparams: ConstPtr, pppackagebindata: MutPtr, pdwpackagebindatasize: MutPtr, pppackagetextdata: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetCreateProvisioningPackage")

public actual fun netEnumerateComputerNames(server: Pcwstr, nametype: NetComputerNameType, reserved: UInt, entrycount: MutPtr, computernames: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetEnumerateComputerNames")

public actual fun netEnumerateServiceAccounts(servername: Pcwstr, flags: UInt, accountscount: MutPtr, accounts: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetEnumerateServiceAccounts")

public actual fun netErrorLogClear(uncservername: Pcwstr, backupfile: Pcwstr, reserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogClear")

public actual fun netErrorLogRead(uncservername: Pcwstr, reserved1: Pcwstr, errorloghandle: ConstPtr, offset: UInt, reserved2: ConstPtr, reserved3: UInt, offsetflag: UInt, bufptr: MutPtr, prefmaxsize: UInt, bytesread: MutPtr, totalavailable: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogRead")

public actual fun netErrorLogWrite(reserved1: ConstPtr, code: UInt, component: Pcwstr, buffer: ConstPtr, numbytes: UInt, msgbuf: ConstPtr, strcount: UInt, reserved2: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogWrite")

public actual fun netFreeAadJoinInformation(pjoininfo: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetFreeAadJoinInformation")

public actual fun netGetAadJoinInformation(pcsztenantid: Pcwstr, ppjoininfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetGetAadJoinInformation")

public actual fun netGetAnyDCName(servername: Pcwstr, domainname: Pcwstr, buffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetGetAnyDCName")

public actual fun netGetDCName(servername: Pcwstr, domainname: Pcwstr, buffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetGetDCName")

public actual fun netGetDisplayInformationIndex(servername: Pcwstr, level: UInt, prefix: Pcwstr, index: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetGetDisplayInformationIndex")

public actual fun netGetJoinInformation(lpserver: Pcwstr, lpnamebuffer: MutPtr, buffertype: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetGetJoinInformation")

public actual fun netGetJoinableOUs(lpserver: Pcwstr, lpdomain: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, oucount: MutPtr, ous: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetGetJoinableOUs")

public actual fun netGroupAdd(servername: Pcwstr, level: UInt, buf: ConstPtr, parmErr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupAdd")

public actual fun netGroupAddUser(servername: Pcwstr, groupname: Pcwstr, username: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupAddUser")

public actual fun netGroupDel(servername: Pcwstr, groupname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupDel")

public actual fun netGroupDelUser(servername: Pcwstr, groupname: Pcwstr, username: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupDelUser")

public actual fun netGroupEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumeHandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupEnum")

public actual fun netGroupGetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupGetInfo")

public actual fun netGroupGetUsers(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumehandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupGetUsers")

public actual fun netGroupSetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr, parmErr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupSetInfo")

public actual fun netGroupSetUsers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr, totalentries: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupSetUsers")

public actual fun netIsServiceAccount(servername: Pcwstr, accountname: Pcwstr, isservice: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetIsServiceAccount")

public actual fun netJoinDomain(lpserver: Pcwstr, lpdomain: Pcwstr, lpmachineaccountou: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, fjoinoptions: NetJoinDomainJoinOptions): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetJoinDomain")

public actual fun netLocalGroupAdd(servername: Pcwstr, level: UInt, buf: ConstPtr, parmErr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAdd")

public actual fun netLocalGroupAddMember(servername: Pcwstr, groupname: Pcwstr, membersid: Psid): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAddMember")

public actual fun netLocalGroupAddMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr, totalentries: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAddMembers")

public actual fun netLocalGroupDel(servername: Pcwstr, groupname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDel")

public actual fun netLocalGroupDelMember(servername: Pcwstr, groupname: Pcwstr, membersid: Psid): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDelMember")

public actual fun netLocalGroupDelMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr, totalentries: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDelMembers")

public actual fun netLocalGroupEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumehandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupEnum")

public actual fun netLocalGroupGetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupGetInfo")

public actual fun netLocalGroupGetMembers(servername: Pcwstr, localgroupname: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumehandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupGetMembers")

public actual fun netLocalGroupSetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr, parmErr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupSetInfo")

public actual fun netLocalGroupSetMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr, totalentries: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupSetMembers")

public actual fun netMessageBufferSend(servername: Pcwstr, msgname: Pcwstr, fromname: Pcwstr, buf: ConstPtr, buflen: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageBufferSend")

public actual fun netMessageNameAdd(servername: Pcwstr, msgname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameAdd")

public actual fun netMessageNameDel(servername: Pcwstr, msgname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameDel")

public actual fun netMessageNameEnum(servername: Pcwstr, level: UInt, bufptr: ConstPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumeHandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameEnum")

public actual fun netMessageNameGetInfo(servername: Pcwstr, msgname: Pcwstr, level: UInt, bufptr: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameGetInfo")

public actual fun netProvisionComputerAccount(lpdomain: Pcwstr, lpmachinename: Pcwstr, lpmachineaccountou: Pcwstr, lpdcname: Pcwstr, dwoptions: NetsetupProvision, pprovisionbindata: MutPtr, pdwprovisionbindatasize: MutPtr, pprovisiontextdata: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetProvisionComputerAccount")

public actual fun netQueryDisplayInformation(servername: Pcwstr, level: UInt, index: UInt, entriesrequested: UInt, preferredmaximumlength: UInt, returnedentrycount: MutPtr, sortedbuffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetQueryDisplayInformation")

public actual fun netQueryServiceAccount(servername: Pcwstr, accountname: Pcwstr, infolevel: UInt, buffer: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetQueryServiceAccount")

public actual fun netRemoteComputerSupports(uncservername: Pcwstr, optionswanted: NetRemoteComputerSupportsOptions, optionssupported: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoteComputerSupports")

public actual fun netRemoteTOD(uncservername: Pcwstr, bufferptr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoteTOD")

public actual fun netRemoveAlternateComputerName(server: Pcwstr, alternatename: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoveAlternateComputerName")

public actual fun netRemoveServiceAccount(servername: Pcwstr, accountname: Pcwstr, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoveServiceAccount")

public actual fun netRenameMachineInDomain(lpserver: Pcwstr, lpnewmachinename: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, frenameoptions: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetRenameMachineInDomain")

public actual fun netReplExportDirAdd(servername: Pcwstr, level: UInt, buf: ConstPtr, parmErr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirAdd")

public actual fun netReplExportDirDel(servername: Pcwstr, dirname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirDel")

public actual fun netReplExportDirEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumehandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirEnum")

public actual fun netReplExportDirGetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, bufptr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirGetInfo")

public actual fun netReplExportDirLock(servername: Pcwstr, dirname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirLock")

public actual fun netReplExportDirSetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, buf: ConstPtr, parmErr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirSetInfo")

public actual fun netReplExportDirUnlock(servername: Pcwstr, dirname: Pcwstr, unlockforce: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirUnlock")

public actual fun netReplGetInfo(servername: Pcwstr, level: UInt, bufptr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetReplGetInfo")

public actual fun netReplImportDirAdd(servername: Pcwstr, level: UInt, buf: ConstPtr, parmErr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirAdd")

public actual fun netReplImportDirDel(servername: Pcwstr, dirname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirDel")

public actual fun netReplImportDirEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumehandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirEnum")

public actual fun netReplImportDirGetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, bufptr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirGetInfo")

public actual fun netReplImportDirLock(servername: Pcwstr, dirname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirLock")

public actual fun netReplImportDirUnlock(servername: Pcwstr, dirname: Pcwstr, unlockforce: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirUnlock")

public actual fun netReplSetInfo(servername: Pcwstr, level: UInt, buf: ConstPtr, parmErr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetReplSetInfo")

public actual fun netRequestOfflineDomainJoin(pprovisionbindata: ConstPtr, cbprovisionbindatasize: UInt, dwoptions: NetRequestProvisionOptions, lpwindowspath: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetRequestOfflineDomainJoin")

public actual fun netRequestProvisioningPackageInstall(ppackagebindata: ConstPtr, dwpackagebindatasize: UInt, dwprovisionoptions: NetRequestProvisionOptions, lpwindowspath: Pcwstr, pvreserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetRequestProvisioningPackageInstall")

public actual fun netScheduleJobAdd(servername: Pcwstr, buffer: MutPtr, jobid: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobAdd")

public actual fun netScheduleJobDel(servername: Pcwstr, minjobid: UInt, maxjobid: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobDel")

public actual fun netScheduleJobEnum(servername: Pcwstr, pointertobuffer: MutPtr, prefferedmaximumlength: UInt, entriesread: MutPtr, totalentries: MutPtr, resumehandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobEnum")

public actual fun netScheduleJobGetInfo(servername: Pcwstr, jobid: UInt, pointertobuffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobGetInfo")

public actual fun netServerComputerNameAdd(servername: Pcwstr, emulateddomainname: Pcwstr, emulatedservername: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetServerComputerNameAdd")

public actual fun netServerComputerNameDel(servername: Pcwstr, emulatedservername: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetServerComputerNameDel")

public actual fun netServerDiskEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumeHandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetServerDiskEnum")

public actual fun netServerEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, servertype: NetServerType, domain: Pcwstr, resumeHandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetServerEnum")

public actual fun netServerGetInfo(servername: Pcwstr, level: UInt, bufptr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetServerGetInfo")

public actual fun netServerSetInfo(servername: Pcwstr, level: UInt, buf: ConstPtr, parmerror: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetServerSetInfo")

public actual fun netServerTransportAdd(servername: Pcwstr, level: UInt, bufptr: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportAdd")

public actual fun netServerTransportAddEx(servername: Pcwstr, level: UInt, bufptr: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportAddEx")

public actual fun netServerTransportDel(servername: Pcwstr, level: UInt, bufptr: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportDel")

public actual fun netServerTransportEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumeHandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportEnum")

public actual fun netServiceControl(servername: Pcwstr, service: Pcwstr, opcode: UInt, arg: UInt, bufptr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceControl")

public actual fun netServiceEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumeHandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceEnum")

public actual fun netServiceGetInfo(servername: Pcwstr, service: Pcwstr, level: UInt, bufptr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceGetInfo")

public actual fun netServiceInstall(servername: Pcwstr, service: Pcwstr, argc: UInt, argv: ConstPtr, bufptr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceInstall")

public actual fun netSetPrimaryComputerName(server: Pcwstr, primaryname: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetSetPrimaryComputerName")

public actual fun netUnjoinDomain(lpserver: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, funjoinoptions: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetUnjoinDomain")

public actual fun netUseAdd(servername: ConstPtr, levelflags: UInt, buf: ConstPtr, parmErr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetUseAdd")

public actual fun netUseDel(uncservername: Pcwstr, usename: Pcwstr, forcelevelflags: ForceLevelFlags): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetUseDel")

public actual fun netUseEnum(uncservername: Pcwstr, levelflags: UInt, bufptr: MutPtr, preferedmaximumsize: UInt, entriesread: MutPtr, totalentries: MutPtr, resumehandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetUseEnum")

public actual fun netUseGetInfo(uncservername: Pcwstr, usename: Pcwstr, levelflags: UInt, bufptr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetUseGetInfo")

public actual fun netUserAdd(servername: Pcwstr, level: UInt, buf: ConstPtr, parmErr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetUserAdd")

public actual fun netUserChangePassword(domainname: Pcwstr, username: Pcwstr, oldpassword: Pcwstr, newpassword: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetUserChangePassword")

public actual fun netUserDel(servername: Pcwstr, username: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetUserDel")

public actual fun netUserEnum(servername: Pcwstr, level: UInt, filter: NetUserEnumFilterFlags, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumeHandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetUserEnum")

public actual fun netUserGetGroups(servername: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetGroups")

public actual fun netUserGetInfo(servername: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetInfo")

public actual fun netUserGetLocalGroups(servername: Pcwstr, username: Pcwstr, level: UInt, flags: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetLocalGroups")

public actual fun netUserModalsGet(servername: Pcwstr, level: UInt, bufptr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetUserModalsGet")

public actual fun netUserModalsSet(servername: Pcwstr, level: UInt, buf: ConstPtr, parmErr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetUserModalsSet")

public actual fun netUserSetGroups(servername: Pcwstr, username: Pcwstr, level: UInt, buf: ConstPtr, numEntries: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetUserSetGroups")

public actual fun netUserSetInfo(servername: Pcwstr, username: Pcwstr, level: UInt, buf: ConstPtr, parmErr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetUserSetInfo")

public actual fun netValidateName(lpserver: Pcwstr, lpname: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, nametype: NetsetupNameType): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetValidateName")

public actual fun netValidatePasswordPolicy(servername: Pcwstr, qualifier: MutPtr, validationtype: NetValidatePasswordType, inputarg: MutPtr, outputarg: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetValidatePasswordPolicy")

public actual fun netValidatePasswordPolicyFree(outputarg: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetValidatePasswordPolicyFree")

public actual fun netWkstaGetInfo(servername: Pcwstr, level: UInt, bufptr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaGetInfo")

public actual fun netWkstaSetInfo(servername: Pcwstr, level: UInt, buffer: ConstPtr, parmErr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaSetInfo")

public actual fun netWkstaTransportAdd(servername: ConstPtr, level: UInt, buf: ConstPtr, parmErr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportAdd")

public actual fun netWkstaTransportDel(servername: Pcwstr, transportname: Pcwstr, ucond: ForceLevelFlags): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportDel")

public actual fun netWkstaTransportEnum(servername: ConstPtr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumeHandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportEnum")

public actual fun netWkstaUserEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumehandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserEnum")

public actual fun netWkstaUserGetInfo(reserved: Pcwstr, level: UInt, bufptr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserGetInfo")

public actual fun netWkstaUserSetInfo(reserved: Pcwstr, level: UInt, buf: ConstPtr, parmErr: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserSetInfo")

public actual fun routerAssert(pszfailedassertion: Pcstr, pszfilename: Pcstr, dwlinenumber: UInt, pszmessage: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementRouterAssert")

public actual fun routerGetErrorStringA(dwerrorcode: UInt, lplpszerrorstring: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementRouterGetErrorStringA")

public actual fun routerGetErrorStringW(dwerrorcode: UInt, lplpwszerrorstring: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementRouterGetErrorStringW")

public actual fun routerLogDeregisterA(hloghandle: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogDeregisterA")

public actual fun routerLogDeregisterW(hloghandle: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogDeregisterW")

public actual fun routerLogEventA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr, dwerrorcode: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventA")

public actual fun routerLogEventDataA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr, dwdatabytes: UInt, lpdatabytes: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventDataA")

public actual fun routerLogEventDataW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr, dwdatabytes: UInt, lpdatabytes: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventDataW")

public actual fun routerLogEventExA(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcstr, vararg variadicArgs: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventExA")

public actual fun routerLogEventExW(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcwstr, vararg variadicArgs: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventExW")

public actual fun routerLogEventStringA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr, dwerrorcode: UInt, dwerrorindex: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventStringA")

public actual fun routerLogEventStringW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr, dwerrorcode: UInt, dwerrorindex: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventStringW")

public actual fun routerLogEventValistExA(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcstr, arglist: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventValistExA")

public actual fun routerLogEventValistExW(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcwstr, arglist: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventValistExW")

public actual fun routerLogEventW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr, dwerrorcode: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventW")

public actual fun routerLogRegisterA(lpszsource: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogRegisterA")

public actual fun routerLogRegisterW(lpszsource: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogRegisterW")

public actual fun setNetScheduleAccountInformation(pwszservername: Pcwstr, pwszaccount: Pcwstr, pwszpassword: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementSetNetScheduleAccountInformation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterA")
private external fun wasiWindowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterA(dwtraceid: Int): Int

public actual fun traceDeregisterA(dwtraceid: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterA(dwtraceid.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterExA")
private external fun wasiWindowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterExA(dwtraceid: Int, dwflags: Int): Int

public actual fun traceDeregisterExA(dwtraceid: UInt, dwflags: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterExA(dwtraceid.toInt(), dwflags.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterExW")
private external fun wasiWindowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterExW(dwtraceid: Int, dwflags: Int): Int

public actual fun traceDeregisterExW(dwtraceid: UInt, dwflags: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterExW(dwtraceid.toInt(), dwflags.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterW")
private external fun wasiWindowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterW(dwtraceid: Int): Int

public actual fun traceDeregisterW(dwtraceid: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterW(dwtraceid.toInt()).toUInt()

public actual fun traceDumpExA(dwtraceid: UInt, dwflags: UInt, lpbbytes: MutPtr, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: Bool, lpszprefix: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementTraceDumpExA")

public actual fun traceDumpExW(dwtraceid: UInt, dwflags: UInt, lpbbytes: MutPtr, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: Bool, lpszprefix: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementTraceDumpExW")

public actual fun traceGetConsoleA(dwtraceid: UInt, lphconsole: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementTraceGetConsoleA")

public actual fun traceGetConsoleW(dwtraceid: UInt, lphconsole: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementTraceGetConsoleW")

public actual fun tracePrintfA(dwtraceid: UInt, lpszformat: Pcstr, vararg variadicArgs: Long): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfA")

public actual fun tracePrintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcstr, vararg variadicArgs: Long): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfExA")

public actual fun tracePrintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfExW")

public actual fun tracePrintfW(dwtraceid: UInt, lpszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfW")

public actual fun tracePutsExA(dwtraceid: UInt, dwflags: UInt, lpszstring: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementTracePutsExA")

public actual fun tracePutsExW(dwtraceid: UInt, dwflags: UInt, lpszstring: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementTracePutsExW")

public actual fun traceRegisterExA(lpszcallername: Pcstr, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementTraceRegisterExA")

public actual fun traceRegisterExW(lpszcallername: Pcwstr, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementTraceRegisterExW")

public actual fun traceVprintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcstr, arglist: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementTraceVprintfExA")

public actual fun traceVprintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcwstr, arglist: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetmanagementTraceVprintfExW")
