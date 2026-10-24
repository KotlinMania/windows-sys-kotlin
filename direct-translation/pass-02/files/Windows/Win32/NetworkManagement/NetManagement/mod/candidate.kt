// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("mstask.dll" "system" fn GetNetScheduleAccountInformation(pwszservername : windows_sys::core::PCWSTR, ccaccount : u32, wszaccount : windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn I_NetLogonControl2(servername : windows_sys::core::PCWSTR, functioncode : u32, querylevel : u32, data : *const u8, buffer : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn LogErrorA(dwmessageid : u32, cnumberofsubstrings : u32, plpwssubstrings : *const windows_sys::core::PCSTR, dwerrorcode : u32));

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn LogErrorW(dwmessageid : u32, cnumberofsubstrings : u32, plpwssubstrings : *const windows_sys::core::PCWSTR, dwerrorcode : u32));

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn LogEventA(weventtype : u32, dwmessageid : u32, cnumberofsubstrings : u32, plpwssubstrings : *const windows_sys::core::PCSTR));

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn LogEventW(weventtype : u32, dwmessageid : u32, cnumberofsubstrings : u32, plpwssubstrings : *const windows_sys::core::PCWSTR));

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn MprSetupProtocolEnum(dwtransportid : u32, lplpbuffer : *mut *mut u8, lpdwentriesread : *mut u32) -> u32);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn MprSetupProtocolFree(lpbuffer : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetAccessAdd(servername : windows_sys::core::PCWSTR, level : u32, buf : *const u8, parm_err : *mut u32) -> u32);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetAccessDel(servername : windows_sys::core::PCWSTR, resource : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetAccessEnum(servername : windows_sys::core::PCWSTR, basepath : windows_sys::core::PCWSTR, recursive : u32, level : u32, bufptr : *mut *mut u8, prefmaxlen : u32, entriesread : *mut u32, totalentries : *mut u32, resume_handle : *mut u32) -> u32);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetAccessGetInfo(servername : windows_sys::core::PCWSTR, resource : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetAccessGetUserPerms(servername : windows_sys::core::PCWSTR, ugname : windows_sys::core::PCWSTR, resource : windows_sys::core::PCWSTR, perms : *mut u32) -> u32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetAccessSetInfo(servername : windows_sys::core::PCWSTR, resource : windows_sys::core::PCWSTR, level : u32, buf : *const u8, parm_err : *mut u32) -> u32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetAddAlternateComputerName(server : windows_sys::core::PCWSTR, alternatename : windows_sys::core::PCWSTR, domainaccount : windows_sys::core::PCWSTR, domainaccountpassword : windows_sys::core::PCWSTR, reserved : u32) -> u32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetAddServiceAccount(servername : windows_sys::core::PCWSTR, accountname : windows_sys::core::PCWSTR, password : windows_sys::core::PCWSTR, flags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetAlertRaise(alerttype : windows_sys::core::PCWSTR, buffer : *const core::ffi::c_void, buffersize : u32) -> u32);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetAlertRaiseEx(alerttype : windows_sys::core::PCWSTR, variableinfo : *const core::ffi::c_void, variableinfosize : u32, servicename : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetApiBufferAllocate(bytecount : u32, buffer : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetApiBufferFree(buffer : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetApiBufferReallocate(oldbuffer : *const core::ffi::c_void, newbytecount : u32, newbuffer : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetApiBufferSize(buffer : *const core::ffi::c_void, bytecount : *mut u32) -> u32);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetAuditClear(server : windows_sys::core::PCWSTR, backupfile : windows_sys::core::PCWSTR, service : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetAuditRead(server : windows_sys::core::PCWSTR, service : windows_sys::core::PCWSTR, auditloghandle : *mut HLOG, offset : u32, reserved1 : *mut u32, reserved2 : u32, offsetflag : u32, bufptr : *mut *mut u8, prefmaxlen : u32, bytesread : *mut u32, totalavailable : *mut u32) -> u32);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetAuditWrite(r#type : u32, buf : *mut u8, numbytes : u32, service : windows_sys::core::PCWSTR, reserved : *mut u8) -> u32);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetConfigGet(server : windows_sys::core::PCWSTR, component : windows_sys::core::PCWSTR, parameter : windows_sys::core::PCWSTR, bufptr : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetConfigGetAll(server : windows_sys::core::PCWSTR, component : windows_sys::core::PCWSTR, bufptr : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetConfigSet(server : windows_sys::core::PCWSTR, reserved1 : windows_sys::core::PCWSTR, component : windows_sys::core::PCWSTR, level : u32, reserved2 : u32, buf : *mut u8, reserved3 : u32) -> u32);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetCreateProvisioningPackage(pprovisioningparams : *const NETSETUP_PROVISIONING_PARAMS, pppackagebindata : *mut *mut u8, pdwpackagebindatasize : *mut u32, pppackagetextdata : *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetEnumerateComputerNames(server : windows_sys::core::PCWSTR, nametype : NET_COMPUTER_NAME_TYPE, reserved : u32, entrycount : *mut u32, computernames : *mut *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetEnumerateServiceAccounts(servername : windows_sys::core::PCWSTR, flags : u32, accountscount : *mut u32, accounts : *mut *mut *mut u16) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetErrorLogClear(uncservername : windows_sys::core::PCWSTR, backupfile : windows_sys::core::PCWSTR, reserved : *const u8) -> u32);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetErrorLogRead(uncservername : windows_sys::core::PCWSTR, reserved1 : windows_sys::core::PCWSTR, errorloghandle : *const HLOG, offset : u32, reserved2 : *const u32, reserved3 : u32, offsetflag : u32, bufptr : *mut *mut u8, prefmaxsize : u32, bytesread : *mut u32, totalavailable : *mut u32) -> u32);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetErrorLogWrite(reserved1 : *const u8, code : u32, component : windows_sys::core::PCWSTR, buffer : *const u8, numbytes : u32, msgbuf : *const u8, strcount : u32, reserved2 : *const u8) -> u32);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("netapi32.dll" "system" fn NetFreeAadJoinInformation(pjoininfo : *const DSREG_JOIN_INFO));

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("netapi32.dll" "system" fn NetGetAadJoinInformation(pcsztenantid : windows_sys::core::PCWSTR, ppjoininfo : *mut *mut DSREG_JOIN_INFO) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetGetAnyDCName(servername : windows_sys::core::PCWSTR, domainname : windows_sys::core::PCWSTR, buffer : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetGetDCName(servername : windows_sys::core::PCWSTR, domainname : windows_sys::core::PCWSTR, buffer : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetGetDisplayInformationIndex(servername : windows_sys::core::PCWSTR, level : u32, prefix : windows_sys::core::PCWSTR, index : *mut u32) -> u32);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetGetJoinInformation(lpserver : windows_sys::core::PCWSTR, lpnamebuffer : *mut windows_sys::core::PWSTR, buffertype : *mut NETSETUP_JOIN_STATUS) -> u32);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetGetJoinableOUs(lpserver : windows_sys::core::PCWSTR, lpdomain : windows_sys::core::PCWSTR, lpaccount : windows_sys::core::PCWSTR, lppassword : windows_sys::core::PCWSTR, oucount : *mut u32, ous : *mut *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetGroupAdd(servername : windows_sys::core::PCWSTR, level : u32, buf : *const u8, parm_err : *mut u32) -> u32);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetGroupAddUser(servername : windows_sys::core::PCWSTR, groupname : windows_sys::core::PCWSTR, username : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetGroupDel(servername : windows_sys::core::PCWSTR, groupname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetGroupDelUser(servername : windows_sys::core::PCWSTR, groupname : windows_sys::core::PCWSTR, username : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetGroupEnum(servername : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8, prefmaxlen : u32, entriesread : *mut u32, totalentries : *mut u32, resume_handle : *mut usize) -> u32);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetGroupGetInfo(servername : windows_sys::core::PCWSTR, groupname : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetGroupGetUsers(servername : windows_sys::core::PCWSTR, groupname : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8, prefmaxlen : u32, entriesread : *mut u32, totalentries : *mut u32, resumehandle : *mut usize) -> u32);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetGroupSetInfo(servername : windows_sys::core::PCWSTR, groupname : windows_sys::core::PCWSTR, level : u32, buf : *const u8, parm_err : *mut u32) -> u32);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetGroupSetUsers(servername : windows_sys::core::PCWSTR, groupname : windows_sys::core::PCWSTR, level : u32, buf : *const u8, totalentries : u32) -> u32);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetIsServiceAccount(servername : windows_sys::core::PCWSTR, accountname : windows_sys::core::PCWSTR, isservice : *mut windows_sys::core::BOOL) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetJoinDomain(lpserver : windows_sys::core::PCWSTR, lpdomain : windows_sys::core::PCWSTR, lpmachineaccountou : windows_sys::core::PCWSTR, lpaccount : windows_sys::core::PCWSTR, lppassword : windows_sys::core::PCWSTR, fjoinoptions : NET_JOIN_DOMAIN_JOIN_OPTIONS) -> u32);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetLocalGroupAdd(servername : windows_sys::core::PCWSTR, level : u32, buf : *const u8, parm_err : *mut u32) -> u32);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("netapi32.dll" "system" fn NetLocalGroupAddMember(servername : windows_sys::core::PCWSTR, groupname : windows_sys::core::PCWSTR, membersid : super::super::Security:: PSID) -> u32);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetLocalGroupAddMembers(servername : windows_sys::core::PCWSTR, groupname : windows_sys::core::PCWSTR, level : u32, buf : *const u8, totalentries : u32) -> u32);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetLocalGroupDel(servername : windows_sys::core::PCWSTR, groupname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("netapi32.dll" "system" fn NetLocalGroupDelMember(servername : windows_sys::core::PCWSTR, groupname : windows_sys::core::PCWSTR, membersid : super::super::Security:: PSID) -> u32);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetLocalGroupDelMembers(servername : windows_sys::core::PCWSTR, groupname : windows_sys::core::PCWSTR, level : u32, buf : *const u8, totalentries : u32) -> u32);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetLocalGroupEnum(servername : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8, prefmaxlen : u32, entriesread : *mut u32, totalentries : *mut u32, resumehandle : *mut usize) -> u32);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetLocalGroupGetInfo(servername : windows_sys::core::PCWSTR, groupname : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetLocalGroupGetMembers(servername : windows_sys::core::PCWSTR, localgroupname : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8, prefmaxlen : u32, entriesread : *mut u32, totalentries : *mut u32, resumehandle : *mut usize) -> u32);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetLocalGroupSetInfo(servername : windows_sys::core::PCWSTR, groupname : windows_sys::core::PCWSTR, level : u32, buf : *const u8, parm_err : *mut u32) -> u32);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetLocalGroupSetMembers(servername : windows_sys::core::PCWSTR, groupname : windows_sys::core::PCWSTR, level : u32, buf : *const u8, totalentries : u32) -> u32);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetMessageBufferSend(servername : windows_sys::core::PCWSTR, msgname : windows_sys::core::PCWSTR, fromname : windows_sys::core::PCWSTR, buf : *const u8, buflen : u32) -> u32);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetMessageNameAdd(servername : windows_sys::core::PCWSTR, msgname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetMessageNameDel(servername : windows_sys::core::PCWSTR, msgname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetMessageNameEnum(servername : windows_sys::core::PCWSTR, level : u32, bufptr : *const *const u8, prefmaxlen : u32, entriesread : *mut u32, totalentries : *mut u32, resume_handle : *mut u32) -> u32);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetMessageNameGetInfo(servername : windows_sys::core::PCWSTR, msgname : windows_sys::core::PCWSTR, level : u32, bufptr : *const *const u8) -> u32);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetProvisionComputerAccount(lpdomain : windows_sys::core::PCWSTR, lpmachinename : windows_sys::core::PCWSTR, lpmachineaccountou : windows_sys::core::PCWSTR, lpdcname : windows_sys::core::PCWSTR, dwoptions : NETSETUP_PROVISION, pprovisionbindata : *mut *mut u8, pdwprovisionbindatasize : *mut u32, pprovisiontextdata : *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetQueryDisplayInformation(servername : windows_sys::core::PCWSTR, level : u32, index : u32, entriesrequested : u32, preferredmaximumlength : u32, returnedentrycount : *mut u32, sortedbuffer : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetQueryServiceAccount(servername : windows_sys::core::PCWSTR, accountname : windows_sys::core::PCWSTR, infolevel : u32, buffer : *mut *mut u8) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetRemoteComputerSupports(uncservername : windows_sys::core::PCWSTR, optionswanted : NET_REMOTE_COMPUTER_SUPPORTS_OPTIONS, optionssupported : *mut u32) -> u32);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetRemoteTOD(uncservername : windows_sys::core::PCWSTR, bufferptr : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetRemoveAlternateComputerName(server : windows_sys::core::PCWSTR, alternatename : windows_sys::core::PCWSTR, domainaccount : windows_sys::core::PCWSTR, domainaccountpassword : windows_sys::core::PCWSTR, reserved : u32) -> u32);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetRemoveServiceAccount(servername : windows_sys::core::PCWSTR, accountname : windows_sys::core::PCWSTR, flags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetRenameMachineInDomain(lpserver : windows_sys::core::PCWSTR, lpnewmachinename : windows_sys::core::PCWSTR, lpaccount : windows_sys::core::PCWSTR, lppassword : windows_sys::core::PCWSTR, frenameoptions : u32) -> u32);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetReplExportDirAdd(servername : windows_sys::core::PCWSTR, level : u32, buf : *const u8, parm_err : *mut u32) -> u32);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetReplExportDirDel(servername : windows_sys::core::PCWSTR, dirname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetReplExportDirEnum(servername : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8, prefmaxlen : u32, entriesread : *mut u32, totalentries : *mut u32, resumehandle : *mut u32) -> u32);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetReplExportDirGetInfo(servername : windows_sys::core::PCWSTR, dirname : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetReplExportDirLock(servername : windows_sys::core::PCWSTR, dirname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetReplExportDirSetInfo(servername : windows_sys::core::PCWSTR, dirname : windows_sys::core::PCWSTR, level : u32, buf : *const u8, parm_err : *mut u32) -> u32);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetReplExportDirUnlock(servername : windows_sys::core::PCWSTR, dirname : windows_sys::core::PCWSTR, unlockforce : u32) -> u32);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetReplGetInfo(servername : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetReplImportDirAdd(servername : windows_sys::core::PCWSTR, level : u32, buf : *const u8, parm_err : *mut u32) -> u32);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetReplImportDirDel(servername : windows_sys::core::PCWSTR, dirname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetReplImportDirEnum(servername : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8, prefmaxlen : u32, entriesread : *mut u32, totalentries : *mut u32, resumehandle : *mut u32) -> u32);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetReplImportDirGetInfo(servername : windows_sys::core::PCWSTR, dirname : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetReplImportDirLock(servername : windows_sys::core::PCWSTR, dirname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetReplImportDirUnlock(servername : windows_sys::core::PCWSTR, dirname : windows_sys::core::PCWSTR, unlockforce : u32) -> u32);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetReplSetInfo(servername : windows_sys::core::PCWSTR, level : u32, buf : *const u8, parm_err : *mut u32) -> u32);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetRequestOfflineDomainJoin(pprovisionbindata : *const u8, cbprovisionbindatasize : u32, dwoptions : NET_REQUEST_PROVISION_OPTIONS, lpwindowspath : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetRequestProvisioningPackageInstall(ppackagebindata : *const u8, dwpackagebindatasize : u32, dwprovisionoptions : NET_REQUEST_PROVISION_OPTIONS, lpwindowspath : windows_sys::core::PCWSTR, pvreserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetScheduleJobAdd(servername : windows_sys::core::PCWSTR, buffer : *mut u8, jobid : *mut u32) -> u32);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetScheduleJobDel(servername : windows_sys::core::PCWSTR, minjobid : u32, maxjobid : u32) -> u32);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetScheduleJobEnum(servername : windows_sys::core::PCWSTR, pointertobuffer : *mut *mut u8, prefferedmaximumlength : u32, entriesread : *mut u32, totalentries : *mut u32, resumehandle : *mut u32) -> u32);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetScheduleJobGetInfo(servername : windows_sys::core::PCWSTR, jobid : u32, pointertobuffer : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetServerComputerNameAdd(servername : windows_sys::core::PCWSTR, emulateddomainname : windows_sys::core::PCWSTR, emulatedservername : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetServerComputerNameDel(servername : windows_sys::core::PCWSTR, emulatedservername : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetServerDiskEnum(servername : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8, prefmaxlen : u32, entriesread : *mut u32, totalentries : *mut u32, resume_handle : *mut u32) -> u32);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetServerEnum(servername : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8, prefmaxlen : u32, entriesread : *mut u32, totalentries : *mut u32, servertype : NET_SERVER_TYPE, domain : windows_sys::core::PCWSTR, resume_handle : *mut u32) -> u32);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetServerGetInfo(servername : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetServerSetInfo(servername : windows_sys::core::PCWSTR, level : u32, buf : *const u8, parmerror : *mut u32) -> u32);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetServerTransportAdd(servername : windows_sys::core::PCWSTR, level : u32, bufptr : *const u8) -> u32);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetServerTransportAddEx(servername : windows_sys::core::PCWSTR, level : u32, bufptr : *const u8) -> u32);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetServerTransportDel(servername : windows_sys::core::PCWSTR, level : u32, bufptr : *const u8) -> u32);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetServerTransportEnum(servername : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8, prefmaxlen : u32, entriesread : *mut u32, totalentries : *mut u32, resume_handle : *mut u32) -> u32);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetServiceControl(servername : windows_sys::core::PCWSTR, service : windows_sys::core::PCWSTR, opcode : u32, arg : u32, bufptr : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetServiceEnum(servername : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8, prefmaxlen : u32, entriesread : *mut u32, totalentries : *mut u32, resume_handle : *mut u32) -> u32);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetServiceGetInfo(servername : windows_sys::core::PCWSTR, service : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetServiceInstall(servername : windows_sys::core::PCWSTR, service : windows_sys::core::PCWSTR, argc : u32, argv : *const windows_sys::core::PCWSTR, bufptr : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetSetPrimaryComputerName(server : windows_sys::core::PCWSTR, primaryname : windows_sys::core::PCWSTR, domainaccount : windows_sys::core::PCWSTR, domainaccountpassword : windows_sys::core::PCWSTR, reserved : u32) -> u32);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetUnjoinDomain(lpserver : windows_sys::core::PCWSTR, lpaccount : windows_sys::core::PCWSTR, lppassword : windows_sys::core::PCWSTR, funjoinoptions : u32) -> u32);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetUseAdd(servername : *const i8, levelflags : u32, buf : *const u8, parm_err : *mut u32) -> u32);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetUseDel(uncservername : windows_sys::core::PCWSTR, usename : windows_sys::core::PCWSTR, forcelevelflags : FORCE_LEVEL_FLAGS) -> u32);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetUseEnum(uncservername : windows_sys::core::PCWSTR, levelflags : u32, bufptr : *mut *mut u8, preferedmaximumsize : u32, entriesread : *mut u32, totalentries : *mut u32, resumehandle : *mut u32) -> u32);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetUseGetInfo(uncservername : windows_sys::core::PCWSTR, usename : windows_sys::core::PCWSTR, levelflags : u32, bufptr : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetUserAdd(servername : windows_sys::core::PCWSTR, level : u32, buf : *const u8, parm_err : *mut u32) -> u32);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetUserChangePassword(domainname : windows_sys::core::PCWSTR, username : windows_sys::core::PCWSTR, oldpassword : windows_sys::core::PCWSTR, newpassword : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetUserDel(servername : windows_sys::core::PCWSTR, username : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetUserEnum(servername : windows_sys::core::PCWSTR, level : u32, filter : NET_USER_ENUM_FILTER_FLAGS, bufptr : *mut *mut u8, prefmaxlen : u32, entriesread : *mut u32, totalentries : *mut u32, resume_handle : *mut u32) -> u32);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetUserGetGroups(servername : windows_sys::core::PCWSTR, username : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8, prefmaxlen : u32, entriesread : *mut u32, totalentries : *mut u32) -> u32);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetUserGetInfo(servername : windows_sys::core::PCWSTR, username : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetUserGetLocalGroups(servername : windows_sys::core::PCWSTR, username : windows_sys::core::PCWSTR, level : u32, flags : u32, bufptr : *mut *mut u8, prefmaxlen : u32, entriesread : *mut u32, totalentries : *mut u32) -> u32);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetUserModalsGet(servername : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetUserModalsSet(servername : windows_sys::core::PCWSTR, level : u32, buf : *const u8, parm_err : *mut u32) -> u32);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetUserSetGroups(servername : windows_sys::core::PCWSTR, username : windows_sys::core::PCWSTR, level : u32, buf : *const u8, num_entries : u32) -> u32);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetUserSetInfo(servername : windows_sys::core::PCWSTR, username : windows_sys::core::PCWSTR, level : u32, buf : *const u8, parm_err : *mut u32) -> u32);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetValidateName(lpserver : windows_sys::core::PCWSTR, lpname : windows_sys::core::PCWSTR, lpaccount : windows_sys::core::PCWSTR, lppassword : windows_sys::core::PCWSTR, nametype : NETSETUP_NAME_TYPE) -> u32);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetValidatePasswordPolicy(servername : windows_sys::core::PCWSTR, qualifier : *mut core::ffi::c_void, validationtype : NET_VALIDATE_PASSWORD_TYPE, inputarg : *mut core::ffi::c_void, outputarg : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetValidatePasswordPolicyFree(outputarg : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetWkstaGetInfo(servername : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetWkstaSetInfo(servername : windows_sys::core::PCWSTR, level : u32, buffer : *const u8, parm_err : *mut u32) -> u32);

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetWkstaTransportAdd(servername : *const i8, level : u32, buf : *const u8, parm_err : *mut u32) -> u32);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetWkstaTransportDel(servername : windows_sys::core::PCWSTR, transportname : windows_sys::core::PCWSTR, ucond : FORCE_LEVEL_FLAGS) -> u32);

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetWkstaTransportEnum(servername : *const i8, level : u32, bufptr : *mut *mut u8, prefmaxlen : u32, entriesread : *mut u32, totalentries : *mut u32, resume_handle : *mut u32) -> u32);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetWkstaUserEnum(servername : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8, prefmaxlen : u32, entriesread : *mut u32, totalentries : *mut u32, resumehandle : *mut u32) -> u32);

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetWkstaUserGetInfo(reserved : windows_sys::core::PCWSTR, level : u32, bufptr : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetWkstaUserSetInfo(reserved : windows_sys::core::PCWSTR, level : u32, buf : *const u8, parm_err : *mut u32) -> u32);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn RouterAssert(pszfailedassertion : windows_sys::core::PCSTR, pszfilename : windows_sys::core::PCSTR, dwlinenumber : u32, pszmessage : windows_sys::core::PCSTR));

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn RouterGetErrorStringA(dwerrorcode : u32, lplpszerrorstring : *mut windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn RouterGetErrorStringW(dwerrorcode : u32, lplpwszerrorstring : *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn RouterLogDeregisterA(hloghandle : super::super::Foundation:: HANDLE));

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn RouterLogDeregisterW(hloghandle : super::super::Foundation:: HANDLE));

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn RouterLogEventA(hloghandle : super::super::Foundation:: HANDLE, dweventtype : u32, dwmessageid : u32, dwsubstringcount : u32, plpszsubstringarray : *const windows_sys::core::PCSTR, dwerrorcode : u32));

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn RouterLogEventDataA(hloghandle : super::super::Foundation:: HANDLE, dweventtype : u32, dwmessageid : u32, dwsubstringcount : u32, plpszsubstringarray : *const windows_sys::core::PCSTR, dwdatabytes : u32, lpdatabytes : *mut u8));

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn RouterLogEventDataW(hloghandle : super::super::Foundation:: HANDLE, dweventtype : u32, dwmessageid : u32, dwsubstringcount : u32, plpszsubstringarray : *const windows_sys::core::PCWSTR, dwdatabytes : u32, lpdatabytes : *mut u8));

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "C" fn RouterLogEventExA(hloghandle : super::super::Foundation:: HANDLE, dweventtype : u32, dwerrorcode : u32, dwmessageid : u32, ptszformat : windows_sys::core::PCSTR, ...));

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "C" fn RouterLogEventExW(hloghandle : super::super::Foundation:: HANDLE, dweventtype : u32, dwerrorcode : u32, dwmessageid : u32, ptszformat : windows_sys::core::PCWSTR, ...));

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn RouterLogEventStringA(hloghandle : super::super::Foundation:: HANDLE, dweventtype : u32, dwmessageid : u32, dwsubstringcount : u32, plpszsubstringarray : *const windows_sys::core::PCSTR, dwerrorcode : u32, dwerrorindex : u32));

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn RouterLogEventStringW(hloghandle : super::super::Foundation:: HANDLE, dweventtype : u32, dwmessageid : u32, dwsubstringcount : u32, plpszsubstringarray : *const windows_sys::core::PCWSTR, dwerrorcode : u32, dwerrorindex : u32));

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn RouterLogEventValistExA(hloghandle : super::super::Foundation:: HANDLE, dweventtype : u32, dwerrorcode : u32, dwmessageid : u32, ptszformat : windows_sys::core::PCSTR, arglist : *mut i8));

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn RouterLogEventValistExW(hloghandle : super::super::Foundation:: HANDLE, dweventtype : u32, dwerrorcode : u32, dwmessageid : u32, ptszformat : windows_sys::core::PCWSTR, arglist : *mut i8));

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn RouterLogEventW(hloghandle : super::super::Foundation:: HANDLE, dweventtype : u32, dwmessageid : u32, dwsubstringcount : u32, plpszsubstringarray : *const windows_sys::core::PCWSTR, dwerrorcode : u32));

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn RouterLogRegisterA(lpszsource : windows_sys::core::PCSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn RouterLogRegisterW(lpszsource : windows_sys::core::PCWSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// windows_link::link!("mstask.dll" "system" fn SetNetScheduleAccountInformation(pwszservername : windows_sys::core::PCWSTR, pwszaccount : windows_sys::core::PCWSTR, pwszpassword : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 162:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn TraceDeregisterA(dwtraceid : u32) -> u32);

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn TraceDeregisterExA(dwtraceid : u32, dwflags : u32) -> u32);

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn TraceDeregisterExW(dwtraceid : u32, dwflags : u32) -> u32);

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn TraceDeregisterW(dwtraceid : u32) -> u32);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn TraceDumpExA(dwtraceid : u32, dwflags : u32, lpbbytes : *mut u8, dwbytecount : u32, dwgroupsize : u32, baddressprefix : windows_sys::core::BOOL, lpszprefix : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn TraceDumpExW(dwtraceid : u32, dwflags : u32, lpbbytes : *mut u8, dwbytecount : u32, dwgroupsize : u32, baddressprefix : windows_sys::core::BOOL, lpszprefix : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn TraceGetConsoleA(dwtraceid : u32, lphconsole : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn TraceGetConsoleW(dwtraceid : u32, lphconsole : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 170:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "C" fn TracePrintfA(dwtraceid : u32, lpszformat : windows_sys::core::PCSTR, ...) -> u32);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "C" fn TracePrintfExA(dwtraceid : u32, dwflags : u32, lpszformat : windows_sys::core::PCSTR, ...) -> u32);

// UNSUPPORTED Rust 172:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "C" fn TracePrintfExW(dwtraceid : u32, dwflags : u32, lpszformat : windows_sys::core::PCWSTR, ...) -> u32);

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "C" fn TracePrintfW(dwtraceid : u32, lpszformat : windows_sys::core::PCWSTR, ...) -> u32);

// UNSUPPORTED Rust 174:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn TracePutsExA(dwtraceid : u32, dwflags : u32, lpszstring : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn TracePutsExW(dwtraceid : u32, dwflags : u32, lpszstring : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 176:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn TraceRegisterExA(lpszcallername : windows_sys::core::PCSTR, dwflags : u32) -> u32);

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn TraceRegisterExW(lpszcallername : windows_sys::core::PCWSTR, dwflags : u32) -> u32);

// UNSUPPORTED Rust 178:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn TraceVprintfExA(dwtraceid : u32, dwflags : u32, lpszformat : windows_sys::core::PCSTR, arglist : *mut i8) -> u32);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// windows_link::link!("rtutils.dll" "system" fn TraceVprintfExW(dwtraceid : u32, dwflags : u32, lpszformat : windows_sys::core::PCWSTR, arglist : *mut i8) -> u32);

public const val `AA_AUDIT_ALL`: UInt = 1u;
public const val `AA_A_ACL`: UInt = 32768u;
public const val `AA_A_CREATE`: UInt = 8192u;
public const val `AA_A_DELETE`: UInt = 16384u;
public const val `AA_A_OPEN`: UInt = 4096u;
public const val `AA_A_OWNER`: UInt = 4u;
public const val `AA_A_WRITE`: UInt = 8192u;
public const val `AA_CLOSE`: UInt = 8u;
public const val `AA_F_ACL`: UInt = 2048u;
public const val `AA_F_CREATE`: UInt = 512u;
public const val `AA_F_DELETE`: UInt = 1024u;
public const val `AA_F_OPEN`: UInt = 256u;
public const val `AA_F_WRITE`: UInt = 512u;
public const val `AA_S_ACL`: UInt = 128u;
public const val `AA_S_CREATE`: UInt = 32u;
public const val `AA_S_DELETE`: UInt = 64u;
public const val `AA_S_OPEN`: UInt = 16u;
public const val `AA_S_WRITE`: UInt = 32u;
public const val `ACCESS_ACCESS_LIST_PARMNUM`: UInt = 4u;
public const val `ACCESS_ATTR_PARMNUM`: UInt = 2u;
public const val `ACCESS_AUDIT`: UInt = 1u;
public const val `ACCESS_COUNT_PARMNUM`: UInt = 3u;
public const val `ACCESS_FAIL_ACL`: UInt = 2048u;
public const val `ACCESS_FAIL_DELETE`: UInt = 1024u;
public const val `ACCESS_FAIL_MASK`: UInt = 3840u;
public const val `ACCESS_FAIL_OPEN`: UInt = 256u;
public const val `ACCESS_FAIL_SHIFT`: UInt = 4u;
public const val `ACCESS_FAIL_WRITE`: UInt = 512u;
public const val `ACCESS_GROUP`: UInt = 32768u;
// UNSUPPORTED Rust 209:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACCESS_INFO_0 {
//     pub acc0_resource_name: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 214:1: declaration Impl has no candidate rule
// impl Default for ACCESS_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 219:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACCESS_INFO_1 {
//     pub acc1_resource_name: windows_sys::core::PWSTR,
//     pub acc1_attr: u32,
//     pub acc1_count: u32,
// }

// UNSUPPORTED Rust 226:1: declaration Impl has no candidate rule
// impl Default for ACCESS_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 231:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ACCESS_INFO_1002 {
//     pub acc1002_attr: u32,
// }

// UNSUPPORTED Rust 236:1: non-scalar type Ptr unsupported
// pub const ACCESS_LETTERS: windows_sys::core::PCSTR = windows_sys::core::s!("RWCXDAP         ");

// UNSUPPORTED Rust 237:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACCESS_LIST {
//     pub acl_ugname: windows_sys::core::PWSTR,
//     pub acl_access: u32,
// }

// UNSUPPORTED Rust 243:1: declaration Impl has no candidate rule
// impl Default for ACCESS_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ACCESS_NONE`: UInt = 0u;
public const val `ACCESS_RESOURCE_NAME_PARMNUM`: UInt = 1u;
public const val `ACCESS_SUCCESS_ACL`: UInt = 128u;
public const val `ACCESS_SUCCESS_DELETE`: UInt = 64u;
public const val `ACCESS_SUCCESS_MASK`: UInt = 240u;
public const val `ACCESS_SUCCESS_OPEN`: UInt = 16u;
public const val `ACCESS_SUCCESS_WRITE`: UInt = 32u;
public const val `ACTION_ADMINUNLOCK`: UInt = 1u;
public const val `ACTION_LOCKOUT`: UInt = 0u;
// UNSUPPORTED Rust 257:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ADMIN_OTHER_INFO {
//     pub alrtad_errcode: u32,
//     pub alrtad_numstrings: u32,
// }

// UNSUPPORTED Rust 263:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AE_ACCLIM {
//     pub ae_al_compname: u32,
//     pub ae_al_username: u32,
//     pub ae_al_resname: u32,
//     pub ae_al_limit: u32,
// }

public const val `AE_ACCLIMITEXCD`: UInt = 17u;
public const val `AE_ACCRESTRICT`: UInt = 4u;
// UNSUPPORTED Rust 273:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AE_ACLMOD {
//     pub ae_am_compname: u32,
//     pub ae_am_username: u32,
//     pub ae_am_resname: u32,
//     pub ae_am_action: u32,
//     pub ae_am_datalen: u32,
// }

public const val `AE_ACLMOD`: UInt = 12u;
public const val `AE_ACLMODFAIL`: UInt = 19u;
public const val `AE_ADD`: UInt = 2u;
public const val `AE_ADMIN`: UInt = 2u;
public const val `AE_ADMINDIS`: UInt = 3u;
public const val `AE_ADMINPRIVREQD`: UInt = 2u;
public const val `AE_ADMIN_CLOSE`: UInt = 2u;
public const val `AE_AUTODIS`: UInt = 2u;
public const val `AE_BADPW`: UInt = 1u;
// UNSUPPORTED Rust 291:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AE_CLOSEFILE {
//     pub ae_cf_compname: u32,
//     pub ae_cf_username: u32,
//     pub ae_cf_resname: u32,
//     pub ae_cf_fileid: u32,
//     pub ae_cf_duration: u32,
//     pub ae_cf_reason: u32,
// }

public const val `AE_CLOSEFILE`: UInt = 9u;
// UNSUPPORTED Rust 302:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AE_CONNREJ {
//     pub ae_cr_compname: u32,
//     pub ae_cr_username: u32,
//     pub ae_cr_netname: u32,
//     pub ae_cr_reason: u32,
// }

public const val `AE_CONNREJ`: UInt = 6u;
// UNSUPPORTED Rust 311:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AE_CONNSTART {
//     pub ae_ct_compname: u32,
//     pub ae_ct_username: u32,
//     pub ae_ct_netname: u32,
//     pub ae_ct_connid: u32,
// }

public const val `AE_CONNSTART`: UInt = 4u;
// UNSUPPORTED Rust 320:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AE_CONNSTOP {
//     pub ae_cp_compname: u32,
//     pub ae_cp_username: u32,
//     pub ae_cp_netname: u32,
//     pub ae_cp_connid: u32,
//     pub ae_cp_reason: u32,
// }

public const val `AE_CONNSTOP`: UInt = 5u;
public const val `AE_DELETE`: UInt = 1u;
public const val `AE_ERROR`: UInt = 1u;
public const val `AE_GENERAL`: UInt = 0u;
// UNSUPPORTED Rust 333:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AE_GENERIC {
//     pub ae_ge_msgfile: u32,
//     pub ae_ge_msgnum: u32,
//     pub ae_ge_params: u32,
//     pub ae_ge_param1: u32,
//     pub ae_ge_param2: u32,
//     pub ae_ge_param3: u32,
//     pub ae_ge_param4: u32,
//     pub ae_ge_param5: u32,
//     pub ae_ge_param6: u32,
//     pub ae_ge_param7: u32,
//     pub ae_ge_param8: u32,
//     pub ae_ge_param9: u32,
// }

public const val `AE_GENERIC_TYPE`: UInt = 21u;
public const val `AE_GUEST`: UInt = 0u;
public const val `AE_LIM_DELETED`: UInt = 5u;
public const val `AE_LIM_DISABLED`: UInt = 4u;
public const val `AE_LIM_EXPIRED`: UInt = 2u;
public const val `AE_LIM_INVAL_WKSTA`: UInt = 3u;
public const val `AE_LIM_LOGONHOURS`: UInt = 1u;
public const val `AE_LIM_UNKNOWN`: UInt = 0u;
// UNSUPPORTED Rust 357:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AE_LOCKOUT {
//     pub ae_lk_compname: u32,
//     pub ae_lk_username: u32,
//     pub ae_lk_action: u32,
//     pub ae_lk_bad_pw_count: u32,
// }

public const val `AE_LOCKOUT`: UInt = 20u;
public const val `AE_MOD`: UInt = 0u;
public const val `AE_NETLOGDENIED`: UInt = 16u;
// UNSUPPORTED Rust 368:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AE_NETLOGOFF {
//     pub ae_nf_compname: u32,
//     pub ae_nf_username: u32,
//     pub ae_nf_reserved1: u32,
//     pub ae_nf_reserved2: u32,
// }

public const val `AE_NETLOGOFF`: UInt = 15u;
// UNSUPPORTED Rust 377:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AE_NETLOGON {
//     pub ae_no_compname: u32,
//     pub ae_no_username: u32,
//     pub ae_no_privilege: u32,
//     pub ae_no_authflags: u32,
// }

public const val `AE_NETLOGON`: UInt = 14u;
public const val `AE_NOACCESSPERM`: UInt = 3u;
public const val `AE_NORMAL`: UInt = 0u;
public const val `AE_NORMAL_CLOSE`: UInt = 0u;
// UNSUPPORTED Rust 389:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AE_RESACCESS {
//     pub ae_ra_compname: u32,
//     pub ae_ra_username: u32,
//     pub ae_ra_resname: u32,
//     pub ae_ra_operation: u32,
//     pub ae_ra_returncode: u32,
//     pub ae_ra_restype: u32,
//     pub ae_ra_fileid: u32,
// }

public const val `AE_RESACCESS`: UInt = 7u;
public const val `AE_RESACCESS2`: UInt = 18u;
// UNSUPPORTED Rust 402:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AE_RESACCESSREJ {
//     pub ae_rr_compname: u32,
//     pub ae_rr_username: u32,
//     pub ae_rr_resname: u32,
//     pub ae_rr_operation: u32,
// }

public const val `AE_RESACCESSREJ`: UInt = 8u;
// UNSUPPORTED Rust 411:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AE_SERVICESTAT {
//     pub ae_ss_compname: u32,
//     pub ae_ss_username: u32,
//     pub ae_ss_svcname: u32,
//     pub ae_ss_status: u32,
//     pub ae_ss_code: u32,
//     pub ae_ss_text: u32,
//     pub ae_ss_returnval: u32,
// }

public const val `AE_SERVICESTAT`: UInt = 11u;
public const val `AE_SESSDIS`: UInt = 1u;
// UNSUPPORTED Rust 424:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AE_SESSLOGOFF {
//     pub ae_sf_compname: u32,
//     pub ae_sf_username: u32,
//     pub ae_sf_reason: u32,
// }

public const val `AE_SESSLOGOFF`: UInt = 2u;
// UNSUPPORTED Rust 432:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AE_SESSLOGON {
//     pub ae_so_compname: u32,
//     pub ae_so_username: u32,
//     pub ae_so_privilege: u32,
// }

public const val `AE_SESSLOGON`: UInt = 1u;
// UNSUPPORTED Rust 440:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AE_SESSPWERR {
//     pub ae_sp_compname: u32,
//     pub ae_sp_username: u32,
// }

public const val `AE_SESSPWERR`: UInt = 3u;
public const val `AE_SES_CLOSE`: UInt = 1u;
public const val `AE_SRVCONT`: UInt = 2u;
public const val `AE_SRVPAUSED`: UInt = 1u;
public const val `AE_SRVSTART`: UInt = 0u;
// UNSUPPORTED Rust 451:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AE_SRVSTATUS {
//     pub ae_sv_status: u32,
// }

public const val `AE_SRVSTATUS`: UInt = 0u;
public const val `AE_SRVSTOP`: UInt = 3u;
// UNSUPPORTED Rust 458:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AE_UASMOD {
//     pub ae_um_compname: u32,
//     pub ae_um_username: u32,
//     pub ae_um_resname: u32,
//     pub ae_um_rectype: u32,
//     pub ae_um_action: u32,
//     pub ae_um_datalen: u32,
// }

public const val `AE_UASMOD`: UInt = 13u;
public const val `AE_UAS_GROUP`: UInt = 1u;
public const val `AE_UAS_MODALS`: UInt = 2u;
public const val `AE_UAS_USER`: UInt = 0u;
public const val `AE_UNSHARE`: UInt = 2u;
public const val `AE_USER`: UInt = 1u;
public const val `AE_USERLIMIT`: UInt = 0u;
public typealias `AF_OP` = UInt;
public const val `AF_OP_ACCOUNTS`: `AF_OP` = 8u;
public const val `AF_OP_COMM`: `AF_OP` = 2u;
public const val `AF_OP_PRINT`: `AF_OP` = 1u;
public const val `AF_OP_SERVER`: `AF_OP` = 4u;
// UNSUPPORTED Rust 480:1: non-scalar type Ptr unsupported
// pub const ALERTER_MAILSLOT: windows_sys::core::PCWSTR = windows_sys::core::w!("\\\\.\\MAILSLOT\\Alerter");

public const val `ALERTSZ`: UInt = 128u;
// UNSUPPORTED Rust 482:1: non-scalar type Ptr unsupported
// pub const ALERT_ADMIN_EVENT: windows_sys::core::PCWSTR = windows_sys::core::w!("ADMIN");

// UNSUPPORTED Rust 483:1: non-scalar type Ptr unsupported
// pub const ALERT_ERRORLOG_EVENT: windows_sys::core::PCWSTR = windows_sys::core::w!("ERRORLOG");

// UNSUPPORTED Rust 484:1: non-scalar type Ptr unsupported
// pub const ALERT_MESSAGE_EVENT: windows_sys::core::PCWSTR = windows_sys::core::w!("MESSAGE");

// UNSUPPORTED Rust 485:1: non-scalar type Ptr unsupported
// pub const ALERT_PRINT_EVENT: windows_sys::core::PCWSTR = windows_sys::core::w!("PRINTING");

// UNSUPPORTED Rust 486:1: non-scalar type Ptr unsupported
// pub const ALERT_USER_EVENT: windows_sys::core::PCWSTR = windows_sys::core::w!("USER");

public const val `ALIGN_SHIFT`: UInt = 7u;
public const val `ALIGN_SIZE`: UInt = 8u;
public const val `ALLOCATE_RESPONSE`: UInt = 2u;
// UNSUPPORTED Rust 490:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AT_ENUM {
//     pub JobId: u32,
//     pub JobTime: usize,
//     pub DaysOfMonth: u32,
//     pub DaysOfWeek: u8,
//     pub Flags: u8,
//     pub Command: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 500:1: declaration Impl has no candidate rule
// impl Default for AT_ENUM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 505:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AT_INFO {
//     pub JobTime: usize,
//     pub DaysOfMonth: u32,
//     pub DaysOfWeek: u8,
//     pub Flags: u8,
//     pub Command: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 514:1: declaration Impl has no candidate rule
// impl Default for AT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 519:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AUDIT_ENTRY {
//     pub ae_len: u32,
//     pub ae_reserved: u32,
//     pub ae_time: u32,
//     pub ae_type: u32,
//     pub ae_data_offset: u32,
//     pub ae_data_size: u32,
// }

// UNSUPPORTED Rust 529:1: non-scalar type Ptr unsupported
// pub const BACKUP_MSG_FILENAME: windows_sys::core::PCWSTR = windows_sys::core::w!("BAK.MSG");

public typealias `BIND_FLAGS1` = Int;
public const val `CLTYPE_LEN`: UInt = 12u;
public const val `CNLEN`: UInt = 15u;
public typealias `COMPONENT_CHARACTERISTICS` = Int;
// UNSUPPORTED Rust 534:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CONFIG_INFO_0 {
//     pub cfgi0_key: windows_sys::core::PWSTR,
//     pub cfgi0_data: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 540:1: declaration Impl has no candidate rule
// impl Default for CONFIG_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `COULD_NOT_VERIFY_VOLUMES`: Int = -1073727512;
public const val `CREATE_BYPASS_CSC`: UInt = 2u;
public const val `CREATE_CRED_RESET`: UInt = 4u;
public const val `CREATE_GLOBAL_MAPPING`: UInt = 256u;
public const val `CREATE_NO_CONNECT`: UInt = 1u;
public const val `CREATE_PERSIST_MAPPING`: UInt = 32u;
public const val `CREATE_REQUIRE_CONNECTION_INTEGRITY`: UInt = 8u;
public const val `CREATE_REQUIRE_CONNECTION_PRIVACY`: UInt = 16u;
public const val `CREATE_WRITE_THROUGH_SEMANTICS`: UInt = 64u;
public const val `CRYPT_KEY_LEN`: UInt = 7u;
public const val `CRYPT_TXT_LEN`: UInt = 8u;
public typealias `DEFAULT_PAGES` = Int;
public const val `DEF_MAX_BADPW`: UInt = 0u;
public const val `DEF_MAX_PWHIST`: UInt = 8u;
public const val `DEF_MIN_PWLEN`: UInt = 6u;
public const val `DEF_PWUNIQUENESS`: UInt = 5u;
public const val `DEVLEN`: UInt = 80u;
public const val `DFS_CONNECTION_FAILURE`: Int = 1073756226;
public const val `DFS_ERROR_ACTIVEDIRECTORY_OFFLINE`: Int = -1073727301;
public const val `DFS_ERROR_CLUSTERINFO_FAILED`: Int = -1073727307;
public const val `DFS_ERROR_COMPUTERINFO_FAILED`: Int = -1073727308;
public const val `DFS_ERROR_CREATEEVENT_FAILED`: Int = -1073727309;
public const val `DFS_ERROR_CREATE_REPARSEPOINT_FAILURE`: Int = -1073727321;
public const val `DFS_ERROR_CREATE_REPARSEPOINT_SUCCESS`: Int = 1073756370;
public const val `DFS_ERROR_CROSS_FOREST_TRUST_INFO_FAILED`: Int = -1073727274;
public const val `DFS_ERROR_DCINFO_FAILED`: Int = -1073727306;
public const val `DFS_ERROR_DSCONNECT_FAILED`: Int = -2147469122;
public const val `DFS_ERROR_DUPLICATE_LINK`: Int = -1073727277;
public const val `DFS_ERROR_HANDLENAMESPACE_FAILED`: Int = -1073727304;
public const val `DFS_ERROR_LINKS_OVERLAP`: Int = -1073727280;
public const val `DFS_ERROR_LINK_OVERLAP`: Int = -1073727279;
public const val `DFS_ERROR_MUTLIPLE_ROOTS_NOT_SUPPORTED`: Int = -1073727289;
public const val `DFS_ERROR_NO_DFS_DATA`: Int = -1073727294;
public const val `DFS_ERROR_ON_ROOT`: Int = -2147469114;
public const val `DFS_ERROR_OVERLAPPING_DIRECTORIES`: Int = -1073727319;
public const val `DFS_ERROR_PREFIXTABLE_FAILED`: Int = -1073727305;
public const val `DFS_ERROR_REFLECTIONENGINE_FAILED`: Int = -1073727302;
public const val `DFS_ERROR_REGISTERSTORE_FAILED`: Int = -1073727303;
public const val `DFS_ERROR_REMOVE_LINK_FAILED`: Int = -1073727284;
public const val `DFS_ERROR_RESYNCHRONIZE_FAILED`: Int = -1073727285;
public const val `DFS_ERROR_ROOTSYNCINIT_FAILED`: Int = -1073727310;
public const val `DFS_ERROR_SECURITYINIT_FAILED`: Int = -1073727313;
public const val `DFS_ERROR_SITECACHEINIT_FAILED`: Int = -1073727311;
public const val `DFS_ERROR_SITESUPPOR_FAILED`: Int = -1073727300;
public const val `DFS_ERROR_TARGET_LIST_INCORRECT`: Int = -1073727281;
public const val `DFS_ERROR_THREADINIT_FAILED`: Int = -1073727312;
public const val `DFS_ERROR_TOO_MANY_ERRORS`: Int = -1073727315;
public const val `DFS_ERROR_TRUSTED_DOMAIN_INFO_FAILED`: Int = -1073727276;
public const val `DFS_ERROR_UNSUPPORTED_FILESYSTEM`: Int = -1073727320;
public const val `DFS_ERROR_WINSOCKINIT_FAILED`: Int = -1073727314;
public const val `DFS_INFO_ACTIVEDIRECTORY_ONLINE`: Int = 1073756332;
public const val `DFS_INFO_CROSS_FOREST_TRUST_INFO_SUCCESS`: Int = 1073756375;
public const val `DFS_INFO_DOMAIN_REFERRAL_MIN_OVERFLOW`: Int = 1073756361;
public const val `DFS_INFO_DS_RECONNECTED`: Int = 1073756353;
public const val `DFS_INFO_FINISH_BUILDING_NAMESPACE`: Int = 1073756357;
public const val `DFS_INFO_FINISH_INIT`: Int = 1073756355;
public const val `DFS_INFO_RECONNECT_DATA`: Int = 1073756356;
public const val `DFS_INFO_TRUSTED_DOMAIN_INFO_SUCCESS`: Int = 1073756373;
public const val `DFS_INIT_SUCCESS`: Int = 1073756376;
public const val `DFS_MAX_DNR_ATTEMPTS`: Int = 1073756229;
public const val `DFS_OPEN_FAILURE`: Int = 1073756231;
public const val `DFS_REFERRAL_FAILURE`: Int = 1073756227;
public const val `DFS_REFERRAL_REQUEST`: Int = 1073756142;
public const val `DFS_REFERRAL_SUCCESS`: Int = 1073756228;
public const val `DFS_ROOT_SHARE_ACQUIRE_FAILED`: Int = -2147469095;
public const val `DFS_ROOT_SHARE_ACQUIRE_SUCCESS`: Int = 1073756378;
public const val `DFS_SPECIAL_REFERRAL_FAILURE`: Int = 1073756230;
public const val `DFS_WARN_DOMAIN_REFERRAL_OVERFLOW`: Int = -2147469112;
public const val `DFS_WARN_INCOMPLETE_MOVE`: Int = -2147469110;
public const val `DFS_WARN_METADATA_LINK_INFO_INVALID`: Int = -2147469106;
public const val `DFS_WARN_METADATA_LINK_TYPE_INCORRECT`: Int = -2147469107;
public const val `DNLEN`: UInt = 15u;
public const val `DPP_ADVANCED`: `DEFAULT_PAGES` = 1;
public const val `DSREG_DEVICE_JOIN`: `DSREG_JOIN_TYPE` = 1;
// UNSUPPORTED Rust 619:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct DSREG_JOIN_INFO {
//     pub joinType: DSREG_JOIN_TYPE,
//     pub pJoinCertificate: *const super::super::Security::Cryptography::CERT_CONTEXT,
//     pub pszDeviceId: windows_sys::core::PWSTR,
//     pub pszIdpDomain: windows_sys::core::PWSTR,
//     pub pszTenantId: windows_sys::core::PWSTR,
//     pub pszJoinUserEmail: windows_sys::core::PWSTR,
//     pub pszTenantDisplayName: windows_sys::core::PWSTR,
//     pub pszMdmEnrollmentUrl: windows_sys::core::PWSTR,
//     pub pszMdmTermsOfUseUrl: windows_sys::core::PWSTR,
//     pub pszMdmComplianceUrl: windows_sys::core::PWSTR,
//     pub pszUserSettingSyncUrl: windows_sys::core::PWSTR,
//     pub pUserInfo: *mut DSREG_USER_INFO,
// }

// UNSUPPORTED Rust 636:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for DSREG_JOIN_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DSREG_JOIN_TYPE` = Int;
public const val `DSREG_UNKNOWN_JOIN`: `DSREG_JOIN_TYPE` = 0;
// UNSUPPORTED Rust 644:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DSREG_USER_INFO {
//     pub pszUserEmail: windows_sys::core::PWSTR,
//     pub pszUserKeyId: windows_sys::core::PWSTR,
//     pub pszUserKeyName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 651:1: declaration Impl has no candidate rule
// impl Default for DSREG_USER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DSREG_WORKPLACE_JOIN`: `DSREG_JOIN_TYPE` = 2;
public const val `EBP_ABOVE`: `ENUM_BINDING_PATHS_FLAGS` = 1;
public const val `EBP_BELOW`: `ENUM_BINDING_PATHS_FLAGS` = 2;
public const val `ENCRYPTED_PWLEN`: UInt = 16u;
public typealias `ENUM_BINDING_PATHS_FLAGS` = Int;
public const val `ERRLOG2_BASE`: UInt = 5700u;
public const val `ERRLOG_BASE`: UInt = 3100u;
// UNSUPPORTED Rust 663:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ERRLOG_OTHER_INFO {
//     pub alrter_errcode: u32,
//     pub alrter_offset: u32,
// }

// UNSUPPORTED Rust 669:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ERROR_LOG {
//     pub el_len: u32,
//     pub el_reserved: u32,
//     pub el_time: u32,
//     pub el_error: u32,
//     pub el_name: windows_sys::core::PWSTR,
//     pub el_text: windows_sys::core::PWSTR,
//     pub el_data: *mut u8,
//     pub el_data_size: u32,
//     pub el_nstrings: u32,
// }

// UNSUPPORTED Rust 682:1: declaration Impl has no candidate rule
// impl Default for ERROR_LOG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EVENT_BAD_ACCOUNT_NAME`: Int = -1073734816;
public const val `EVENT_BAD_SERVICE_STATE`: Int = -1073734808;
public const val `EVENT_BOOT_SYSTEM_DRIVERS_FAILED`: Int = -1073734798;
public const val `EVENT_BOWSER_CANT_READ_REGISTRY`: Int = 1073749853;
public const val `EVENT_BOWSER_ELECTION_RECEIVED`: Int = 8012;
public const val `EVENT_BOWSER_ELECTION_SENT_FIND_MASTER_FAILED`: Int = 1073749838;
public const val `EVENT_BOWSER_ELECTION_SENT_GETBLIST_FAILED`: Int = 1073749837;
public const val `EVENT_BOWSER_GETBROWSERLIST_THRESHOLD_EXCEEDED`: Int = 1073749855;
public const val `EVENT_BOWSER_ILLEGAL_DATAGRAM`: Int = -2147475642;
public const val `EVENT_BOWSER_ILLEGAL_DATAGRAM_THRESHOLD`: Int = -1073733808;
public const val `EVENT_BOWSER_MAILSLOT_DATAGRAM_THRESHOLD_EXCEEDED`: Int = 1073749854;
public const val `EVENT_BOWSER_NAME_CONVERSION_FAILED`: Int = -1073733814;
public const val `EVENT_BOWSER_NON_MASTER_MASTER_ANNOUNCE`: Int = -2147475643;
public const val `EVENT_BOWSER_NON_PDC_WON_ELECTION`: Int = 1073749852;
public const val `EVENT_BOWSER_OLD_BACKUP_FOUND`: Int = 1073749848;
public const val `EVENT_BOWSER_OTHER_MASTER_ON_NET`: Int = -1073733821;
public const val `EVENT_BOWSER_PDC_LOST_ELECTION`: Int = 1073749851;
public const val `EVENT_BOWSER_PROMOTED_WHILE_ALREADY_MASTER`: Int = -2147475644;
public const val `EVENT_BRIDGE_ADAPTER_BIND_FAILED`: Int = -1073727120;
public const val `EVENT_BRIDGE_ADAPTER_FILTER_FAILED`: Int = -1073727122;
public const val `EVENT_BRIDGE_ADAPTER_LINK_SPEED_QUERY_FAILED`: Int = -1073727124;
public const val `EVENT_BRIDGE_ADAPTER_MAC_ADDR_QUERY_FAILED`: Int = -1073727123;
public const val `EVENT_BRIDGE_ADAPTER_NAME_QUERY_FAILED`: Int = -1073727121;
public const val `EVENT_BRIDGE_BUFFER_POOL_CREATION_FAILED`: Int = -1073727214;
public const val `EVENT_BRIDGE_DEVICE_CREATION_FAILED`: Int = -1073727221;
public const val `EVENT_BRIDGE_ETHERNET_NOT_OFFERED`: Int = -1073727218;
public const val `EVENT_BRIDGE_INIT_MALLOC_FAILED`: Int = -1073727213;
public const val `EVENT_BRIDGE_MINIPORT_INIT_FAILED`: Int = -1073727219;
public const val `EVENT_BRIDGE_MINIPORT_REGISTER_FAILED`: Int = -1073727222;
public const val `EVENT_BRIDGE_MINIPROT_DEVNAME_MISSING`: Int = -1073727223;
public const val `EVENT_BRIDGE_NO_BRIDGE_MAC_ADDR`: Int = -1073727220;
public const val `EVENT_BRIDGE_PACKET_POOL_CREATION_FAILED`: Int = -1073727215;
public const val `EVENT_BRIDGE_PROTOCOL_REGISTER_FAILED`: Int = -1073727224;
public const val `EVENT_BRIDGE_THREAD_CREATION_FAILED`: Int = -1073727217;
public const val `EVENT_BRIDGE_THREAD_REF_FAILED`: Int = -1073727216;
public const val `EVENT_BROWSER_BACKUP_STOPPED`: Int = -1073733792;
public const val `EVENT_BROWSER_DEPENDANT_SERVICE_FAILED`: Int = -1073733807;
public const val `EVENT_BROWSER_DOMAIN_LIST_FAILED`: Int = -2147475626;
public const val `EVENT_BROWSER_DOMAIN_LIST_RETRIEVED`: Int = 8026;
public const val `EVENT_BROWSER_ELECTION_SENT_LANMAN_NT_STARTED`: Int = 1073749839;
public const val `EVENT_BROWSER_ELECTION_SENT_LANMAN_NT_STOPPED`: Int = 1073749857;
public const val `EVENT_BROWSER_ELECTION_SENT_ROLE_CHANGED`: Int = 1073749859;
public const val `EVENT_BROWSER_GETBLIST_RECEIVED_NOT_MASTER`: Int = -1073733790;
public const val `EVENT_BROWSER_ILLEGAL_CONFIG`: Int = -2147475625;
public const val `EVENT_BROWSER_MASTER_PROMOTION_FAILED`: Int = -1073733815;
public const val `EVENT_BROWSER_MASTER_PROMOTION_FAILED_NO_MASTER`: Int = -1073733804;
public const val `EVENT_BROWSER_MASTER_PROMOTION_FAILED_STOPPING`: Int = -1073733805;
public const val `EVENT_BROWSER_NOT_STARTED_IPX_CONFIG_MISMATCH`: Int = -1073733788;
public const val `EVENT_BROWSER_OTHERDOMAIN_ADD_FAILED`: Int = -1073733813;
public const val `EVENT_BROWSER_ROLE_CHANGE_FAILED`: Int = -1073733816;
public const val `EVENT_BROWSER_SERVER_LIST_FAILED`: Int = -2147475627;
public const val `EVENT_BROWSER_SERVER_LIST_RETRIEVED`: Int = 8025;
public const val `EVENT_BROWSER_STATUS_BITS_UPDATE_FAILED`: Int = -1073733817;
public const val `EVENT_CALL_TO_FUNCTION_FAILED`: Int = -1073734819;
public const val `EVENT_CALL_TO_FUNCTION_FAILED_II`: Int = -1073734818;
public const val `EVENT_CIRCULAR_DEPENDENCY_AUTO`: Int = -1073734806;
public const val `EVENT_CIRCULAR_DEPENDENCY_DEMAND`: Int = -1073734807;
public const val `EVENT_COMMAND_NOT_INTERACTIVE`: Int = -1073733924;
public const val `EVENT_COMMAND_START_FAILED`: Int = -1073733923;
public const val `EVENT_CONNECTION_TIMEOUT`: Int = -1073734815;
public const val `EVENT_ComputerNameChange`: Int = -2147477637;
public const val `EVENT_DAV_REDIR_DELAYED_WRITE_FAILED`: Int = -2147468848;
public const val `EVENT_DCOM_ASSERTION_FAILURE`: Int = -1073731812;
public const val `EVENT_DCOM_COMPLUS_DISABLED`: Int = -1073731810;
public const val `EVENT_DCOM_INVALID_ENDPOINT_DATA`: Int = -1073731811;
public const val `EVENT_DEPEND_ON_LATER_GROUP`: Int = -1073734804;
public const val `EVENT_DEPEND_ON_LATER_SERVICE`: Int = -1073734805;
public const val `EVENT_DNSAPI_DEREGISTRATION_FAILED_NOTSUPP`: Int = -2147472466;
public const val `EVENT_DNSAPI_DEREGISTRATION_FAILED_NOTSUPP_PRIMARY_DN`: Int = -2147472454;
public const val `EVENT_DNSAPI_DEREGISTRATION_FAILED_OTHER`: Int = -2147472463;
public const val `EVENT_DNSAPI_DEREGISTRATION_FAILED_OTHER_PRIMARY_DN`: Int = -2147472451;
public const val `EVENT_DNSAPI_DEREGISTRATION_FAILED_REFUSED`: Int = -2147472465;
public const val `EVENT_DNSAPI_DEREGISTRATION_FAILED_REFUSED_PRIMARY_DN`: Int = -2147472453;
public const val `EVENT_DNSAPI_DEREGISTRATION_FAILED_SECURITY`: Int = -2147472464;
public const val `EVENT_DNSAPI_DEREGISTRATION_FAILED_SECURITY_PRIMARY_DN`: Int = -2147472452;
public const val `EVENT_DNSAPI_DEREGISTRATION_FAILED_SERVERFAIL`: Int = -2147472467;
public const val `EVENT_DNSAPI_DEREGISTRATION_FAILED_SERVERFAIL_PRIMARY_DN`: Int = -2147472455;
public const val `EVENT_DNSAPI_DEREGISTRATION_FAILED_TIMEOUT`: Int = -2147472468;
public const val `EVENT_DNSAPI_DEREGISTRATION_FAILED_TIMEOUT_PRIMARY_DN`: Int = -2147472456;
public const val `EVENT_DNSAPI_PTR_DEREGISTRATION_FAILED_NOTSUPP`: Int = -2147472460;
public const val `EVENT_DNSAPI_PTR_DEREGISTRATION_FAILED_OTHER`: Int = -2147472457;
public const val `EVENT_DNSAPI_PTR_DEREGISTRATION_FAILED_REFUSED`: Int = -2147472459;
public const val `EVENT_DNSAPI_PTR_DEREGISTRATION_FAILED_SECURITY`: Int = -2147472458;
public const val `EVENT_DNSAPI_PTR_DEREGISTRATION_FAILED_SERVERFAIL`: Int = -2147472461;
public const val `EVENT_DNSAPI_PTR_DEREGISTRATION_FAILED_TIMEOUT`: Int = -2147472462;
public const val `EVENT_DNSAPI_PTR_REGISTRATION_FAILED_NOTSUPP`: Int = -2147472490;
public const val `EVENT_DNSAPI_PTR_REGISTRATION_FAILED_OTHER`: Int = -2147472487;
public const val `EVENT_DNSAPI_PTR_REGISTRATION_FAILED_REFUSED`: Int = -2147472489;
public const val `EVENT_DNSAPI_PTR_REGISTRATION_FAILED_SECURITY`: Int = -2147472488;
public const val `EVENT_DNSAPI_PTR_REGISTRATION_FAILED_SERVERFAIL`: Int = -2147472491;
public const val `EVENT_DNSAPI_PTR_REGISTRATION_FAILED_TIMEOUT`: Int = -2147472492;
public const val `EVENT_DNSAPI_REGISTERED_ADAPTER`: Int = 1073753024;
public const val `EVENT_DNSAPI_REGISTERED_ADAPTER_PRIMARY_DN`: Int = 1073753026;
public const val `EVENT_DNSAPI_REGISTERED_PTR`: Int = 1073753025;
public const val `EVENT_DNSAPI_REGISTRATION_FAILED_NOTSUPP`: Int = -2147472496;
public const val `EVENT_DNSAPI_REGISTRATION_FAILED_NOTSUPP_PRIMARY_DN`: Int = -2147472484;
public const val `EVENT_DNSAPI_REGISTRATION_FAILED_OTHER`: Int = -2147472493;
public const val `EVENT_DNSAPI_REGISTRATION_FAILED_OTHER_PRIMARY_DN`: Int = -2147472481;
public const val `EVENT_DNSAPI_REGISTRATION_FAILED_REFUSED`: Int = -2147472495;
public const val `EVENT_DNSAPI_REGISTRATION_FAILED_REFUSED_PRIMARY_DN`: Int = -2147472483;
public const val `EVENT_DNSAPI_REGISTRATION_FAILED_SECURITY`: Int = -2147472494;
public const val `EVENT_DNSAPI_REGISTRATION_FAILED_SECURITY_PRIMARY_DN`: Int = -2147472482;
public const val `EVENT_DNSAPI_REGISTRATION_FAILED_SERVERFAIL`: Int = -2147472497;
public const val `EVENT_DNSAPI_REGISTRATION_FAILED_SERVERFAIL_PRIMARY_DN`: Int = -2147472485;
public const val `EVENT_DNSAPI_REGISTRATION_FAILED_TIMEOUT`: Int = -2147472498;
public const val `EVENT_DNSAPI_REGISTRATION_FAILED_TIMEOUT_PRIMARY_DN`: Int = -2147472486;
public const val `EVENT_DNSDomainNameChange`: Int = -2147477636;
public const val `EVENT_DNS_CACHE_NETWORK_PERF_WARNING`: Int = -2147472598;
public const val `EVENT_DNS_CACHE_START_FAILURE_LOW_MEMORY`: Int = -1073730817;
public const val `EVENT_DNS_CACHE_START_FAILURE_NO_CONTROL`: Int = -1073730822;
public const val `EVENT_DNS_CACHE_START_FAILURE_NO_DLL`: Int = -1073730824;
public const val `EVENT_DNS_CACHE_START_FAILURE_NO_DONE_EVENT`: Int = -1073730821;
public const val `EVENT_DNS_CACHE_START_FAILURE_NO_ENTRY`: Int = -1073730823;
public const val `EVENT_DNS_CACHE_START_FAILURE_NO_RPC`: Int = -1073730820;
public const val `EVENT_DNS_CACHE_START_FAILURE_NO_SHUTDOWN_NOTIFY`: Int = -1073730819;
public const val `EVENT_DNS_CACHE_START_FAILURE_NO_UPDATE`: Int = -1073730818;
public const val `EVENT_DNS_CACHE_UNABLE_TO_REACH_SERVER_WARNING`: Int = -2147472597;
public const val `EVENT_EQOS_ERROR_MACHINE_POLICY_KEYNAME_SIZE_ZERO`: Int = -1073725118;
public const val `EVENT_EQOS_ERROR_MACHINE_POLICY_KEYNAME_TOO_LONG`: Int = -1073725120;
public const val `EVENT_EQOS_ERROR_MACHINE_POLICY_REFERESH`: Int = -1073725124;
public const val `EVENT_EQOS_ERROR_OPENING_MACHINE_POLICY_ROOT_KEY`: Int = -1073725122;
public const val `EVENT_EQOS_ERROR_OPENING_MACHINE_POLICY_SUBKEY`: Int = -1073725116;
public const val `EVENT_EQOS_ERROR_OPENING_USER_POLICY_ROOT_KEY`: Int = -1073725121;
public const val `EVENT_EQOS_ERROR_OPENING_USER_POLICY_SUBKEY`: Int = -1073725115;
public const val `EVENT_EQOS_ERROR_PROCESSING_MACHINE_POLICY_FIELD`: Int = -1073725114;
public const val `EVENT_EQOS_ERROR_PROCESSING_USER_POLICY_FIELD`: Int = -1073725113;
public const val `EVENT_EQOS_ERROR_SETTING_APP_MARKING`: Int = -1073725111;
public const val `EVENT_EQOS_ERROR_SETTING_TCP_AUTOTUNING`: Int = -1073725112;
public const val `EVENT_EQOS_ERROR_USER_POLICY_KEYNAME_SIZE_ZERO`: Int = -1073725117;
public const val `EVENT_EQOS_ERROR_USER_POLICY_KEYNAME_TOO_LONG`: Int = -1073725119;
public const val `EVENT_EQOS_ERROR_USER_POLICY_REFERESH`: Int = -1073725123;
public const val `EVENT_EQOS_INFO_APP_MARKING_ALLOWED`: Int = 1073758335;
public const val `EVENT_EQOS_INFO_APP_MARKING_IGNORED`: Int = 1073758334;
public const val `EVENT_EQOS_INFO_APP_MARKING_NOT_CONFIGURED`: Int = 1073758333;
public const val `EVENT_EQOS_INFO_LOCAL_SETTING_DONT_USE_NLA`: Int = 1073758336;
public const val `EVENT_EQOS_INFO_MACHINE_POLICY_REFRESH_NO_CHANGE`: Int = 1073758324;
public const val `EVENT_EQOS_INFO_MACHINE_POLICY_REFRESH_WITH_CHANGE`: Int = 1073758325;
public const val `EVENT_EQOS_INFO_TCP_AUTOTUNING_HIGHLY_RESTRICTED`: Int = 1073758330;
public const val `EVENT_EQOS_INFO_TCP_AUTOTUNING_NORMAL`: Int = 1073758332;
public const val `EVENT_EQOS_INFO_TCP_AUTOTUNING_NOT_CONFIGURED`: Int = 1073758328;
public const val `EVENT_EQOS_INFO_TCP_AUTOTUNING_OFF`: Int = 1073758329;
public const val `EVENT_EQOS_INFO_TCP_AUTOTUNING_RESTRICTED`: Int = 1073758331;
public const val `EVENT_EQOS_INFO_USER_POLICY_REFRESH_NO_CHANGE`: Int = 1073758326;
public const val `EVENT_EQOS_INFO_USER_POLICY_REFRESH_WITH_CHANGE`: Int = 1073758327;
public const val `EVENT_EQOS_URL_QOS_APPLICATION_CONFLICT`: Int = 1073758337;
public const val `EVENT_EQOS_WARNING_MACHINE_POLICY_CONFLICT`: Int = -2147467040;
public const val `EVENT_EQOS_WARNING_MACHINE_POLICY_NO_FULLPATH_APPNAME`: Int = -2147467038;
public const val `EVENT_EQOS_WARNING_MACHINE_POLICY_PROFILE_NOT_SPECIFIED`: Int = -2147467044;
public const val `EVENT_EQOS_WARNING_MACHINE_POLICY_QUOTA_EXCEEDED`: Int = -2147467042;
public const val `EVENT_EQOS_WARNING_MACHINE_POLICY_VERSION`: Int = -2147467046;
public const val `EVENT_EQOS_WARNING_TEST_1`: Int = -2147467048;
public const val `EVENT_EQOS_WARNING_TEST_2`: Int = -2147467047;
public const val `EVENT_EQOS_WARNING_USER_POLICY_CONFLICT`: Int = -2147467039;
public const val `EVENT_EQOS_WARNING_USER_POLICY_NO_FULLPATH_APPNAME`: Int = -2147467037;
public const val `EVENT_EQOS_WARNING_USER_POLICY_PROFILE_NOT_SPECIFIED`: Int = -2147467043;
public const val `EVENT_EQOS_WARNING_USER_POLICY_QUOTA_EXCEEDED`: Int = -2147467041;
public const val `EVENT_EQOS_WARNING_USER_POLICY_VERSION`: Int = -2147467045;
public const val `EVENT_EventLogProductInfo`: Int = -2147477639;
public const val `EVENT_EventlogAbnormalShutdown`: Int = -2147477640;
public const val `EVENT_EventlogStarted`: Int = -2147477643;
public const val `EVENT_EventlogStopped`: Int = -2147477642;
public const val `EVENT_EventlogUptime`: Int = -2147477635;
public const val `EVENT_FIRST_LOGON_FAILED`: Int = -1073734811;
public const val `EVENT_FIRST_LOGON_FAILED_II`: Int = -1073734786;
public const val `EVENT_FRS_ACCESS_CHECKS_DISABLED`: Int = -2147470131;
public const val `EVENT_FRS_ACCESS_CHECKS_FAILED_UNKNOWN`: Int = -1073728305;
public const val `EVENT_FRS_ACCESS_CHECKS_FAILED_USER`: Int = -2147470130;
public const val `EVENT_FRS_ASSERT`: Int = -1073728318;
public const val `EVENT_FRS_BAD_REG_DATA`: Int = -2147470101;
public const val `EVENT_FRS_CANNOT_COMMUNICATE`: Int = -1073728314;
public const val `EVENT_FRS_CANNOT_CREATE_UUID`: Int = -1073728300;
public const val `EVENT_FRS_CANNOT_START_BACKUP_RESTORE_IN_PROGRESS`: Int = -1073728303;
public const val `EVENT_FRS_CANT_OPEN_PREINSTALL`: Int = -1073728273;
public const val `EVENT_FRS_CANT_OPEN_STAGE`: Int = -1073728274;
public const val `EVENT_FRS_DATABASE_SPACE`: Int = -1073728313;
public const val `EVENT_FRS_DISK_WRITE_CACHE_ENABLED`: Int = -2147470136;
public const val `EVENT_FRS_DS_POLL_ERROR_SUMMARY`: Int = -2147470086;
public const val `EVENT_FRS_DUPLICATE_IN_CXTION`: Int = -1073728266;
public const val `EVENT_FRS_DUPLICATE_IN_CXTION_SYSVOL`: Int = -1073728267;
public const val `EVENT_FRS_ERROR`: Int = -1073728324;
public const val `EVENT_FRS_ERROR_REPLICA_SET_DELETED`: Int = -2147470088;
public const val `EVENT_FRS_HUGE_FILE`: Int = -2147470125;
public const val `EVENT_FRS_IN_ERROR_STATE`: Int = -1073728269;
public const val `EVENT_FRS_JET_1414`: Int = -1073728311;
public const val `EVENT_FRS_JOIN_FAIL_TIME_SKEW`: Int = -1073728276;
public const val `EVENT_FRS_LONG_JOIN`: Int = -2147470140;
public const val `EVENT_FRS_LONG_JOIN_DONE`: Int = -2147470139;
public const val `EVENT_FRS_MOVED_PREEXISTING`: Int = -2147470128;
public const val `EVENT_FRS_NO_DNS_ATTRIBUTE`: Int = -2147470123;
public const val `EVENT_FRS_NO_SID`: Int = -1073728298;
public const val `EVENT_FRS_OVERLAPS_LOGGING`: Int = -1073728283;
public const val `EVENT_FRS_OVERLAPS_OTHER_STAGE`: Int = -1073728279;
public const val `EVENT_FRS_OVERLAPS_ROOT`: Int = -1073728280;
public const val `EVENT_FRS_OVERLAPS_STAGE`: Int = -1073728281;
public const val `EVENT_FRS_OVERLAPS_WORKING`: Int = -1073728282;
public const val `EVENT_FRS_PREPARE_ROOT_FAILED`: Int = -1073728278;
public const val `EVENT_FRS_REPLICA_IN_JRNL_WRAP_ERROR`: Int = -1073728263;
public const val `EVENT_FRS_REPLICA_NO_ROOT_CHANGE`: Int = -1073728268;
public const val `EVENT_FRS_REPLICA_SET_CREATE_FAIL`: Int = -1073728272;
public const val `EVENT_FRS_REPLICA_SET_CREATE_OK`: Int = 1073755377;
public const val `EVENT_FRS_REPLICA_SET_CXTIONS`: Int = 1073755378;
public const val `EVENT_FRS_RMTCO_TIME_SKEW`: Int = -1073728275;
public const val `EVENT_FRS_ROOT_HAS_MOVED`: Int = -1073728265;
public const val `EVENT_FRS_ROOT_NOT_VALID`: Int = -1073728285;
public const val `EVENT_FRS_STAGE_NOT_VALID`: Int = -1073728284;
public const val `EVENT_FRS_STAGING_AREA_FULL`: Int = -2147470126;
public const val `EVENT_FRS_STARTING`: Int = 1073755325;
public const val `EVENT_FRS_STOPPED`: Int = 1073755327;
public const val `EVENT_FRS_STOPPED_ASSERT`: Int = -1073728319;
public const val `EVENT_FRS_STOPPED_FORCE`: Int = -1073728320;
public const val `EVENT_FRS_STOPPING`: Int = 1073755326;
public const val `EVENT_FRS_SYSVOL_NOT_READY`: Int = -2147470134;
public const val `EVENT_FRS_SYSVOL_NOT_READY_PRIMARY`: Int = -2147470133;
public const val `EVENT_FRS_SYSVOL_READY`: Int = 1073755340;
public const val `EVENT_FRS_VOLUME_NOT_SUPPORTED`: Int = -1073728317;
public const val `EVENT_INVALID_DRIVER_DEPENDENCY`: Int = -1073734809;
public const val `EVENT_IPX_CREATE_DEVICE`: Int = -1073732318;
public const val `EVENT_IPX_ILLEGAL_CONFIG`: Int = -2147474145;
public const val `EVENT_IPX_INTERNAL_NET_INVALID`: Int = -1073732320;
public const val `EVENT_IPX_NEW_DEFAULT_TYPE`: Int = 1073751325;
public const val `EVENT_IPX_NO_ADAPTERS`: Int = -1073732317;
public const val `EVENT_IPX_NO_FRAME_TYPES`: Int = -1073732319;
public const val `EVENT_IPX_SAP_ANNOUNCE`: Int = -2147474146;
public const val `EVENT_NBT_BAD_BACKUP_WINS_ADDR`: Int = -2147479344;
public const val `EVENT_NBT_BAD_PRIMARY_WINS_ADDR`: Int = -2147479343;
public const val `EVENT_NBT_CREATE_ADDRESS`: Int = -1073737517;
public const val `EVENT_NBT_CREATE_CONNECTION`: Int = -1073737516;
public const val `EVENT_NBT_CREATE_DEVICE`: Int = -1073737513;
public const val `EVENT_NBT_CREATE_DRIVER`: Int = -1073737524;
public const val `EVENT_NBT_DUPLICATE_NAME`: Int = -1073737505;
public const val `EVENT_NBT_DUPLICATE_NAME_ERROR`: Int = -1073737503;
public const val `EVENT_NBT_NAME_RELEASE`: Int = -1073737504;
public const val `EVENT_NBT_NAME_SERVER_ADDRS`: Int = -1073737518;
public const val `EVENT_NBT_NON_OS_INIT`: Int = -1073737515;
public const val `EVENT_NBT_NO_BACKUP_WINS`: Int = -2147479346;
public const val `EVENT_NBT_NO_DEVICES`: Int = -2147479336;
public const val `EVENT_NBT_NO_RESOURCES`: Int = -1073737502;
public const val `EVENT_NBT_NO_WINS`: Int = -2147479345;
public const val `EVENT_NBT_OPEN_REG_LINKAGE`: Int = -1073737511;
public const val `EVENT_NBT_OPEN_REG_NAMESERVER`: Int = -2147479332;
public const val `EVENT_NBT_OPEN_REG_PARAMS`: Int = -1073737523;
public const val `EVENT_NBT_READ_BIND`: Int = -1073737510;
public const val `EVENT_NBT_READ_EXPORT`: Int = -1073737509;
public const val `EVENT_NBT_TIMERS`: Int = -1073737514;
public const val `EVENT_NDIS_ADAPTER_CHECK_ERROR`: Int = -1073736793;
public const val `EVENT_NDIS_ADAPTER_DISABLED`: Int = -2147478634;
public const val `EVENT_NDIS_ADAPTER_NOT_FOUND`: Int = -1073736821;
public const val `EVENT_NDIS_BAD_IO_BASE_ADDRESS`: Int = -1073736812;
public const val `EVENT_NDIS_BAD_VERSION`: Int = -1073736818;
public const val `EVENT_NDIS_CABLE_DISCONNECTED_ERROR`: Int = -2147478615;
public const val `EVENT_NDIS_DMA_CONFLICT`: Int = -2147478629;
public const val `EVENT_NDIS_DRIVER_FAILURE`: Int = -1073736819;
public const val `EVENT_NDIS_HARDWARE_FAILURE`: Int = -1073736822;
public const val `EVENT_NDIS_INTERRUPT_CONFLICT`: Int = -2147478630;
public const val `EVENT_NDIS_INTERRUPT_CONNECT`: Int = -1073736820;
public const val `EVENT_NDIS_INVALID_DOWNLOAD_FILE_ERROR`: Int = -1073736804;
public const val `EVENT_NDIS_INVALID_VALUE_FROM_ADAPTER`: Int = -1073736814;
public const val `EVENT_NDIS_IO_PORT_CONFLICT`: Int = -2147478633;
public const val `EVENT_NDIS_LOBE_FAILUE_ERROR`: Int = -2147478621;
public const val `EVENT_NDIS_MAXFRAMESIZE_ERROR`: Int = -2147478625;
public const val `EVENT_NDIS_MAXINTERNALBUFS_ERROR`: Int = -2147478624;
public const val `EVENT_NDIS_MAXMULTICAST_ERROR`: Int = -2147478623;
public const val `EVENT_NDIS_MAXRECEIVES_ERROR`: Int = -2147478627;
public const val `EVENT_NDIS_MAXTRANSMITS_ERROR`: Int = -2147478626;
public const val `EVENT_NDIS_MEMORY_CONFLICT`: Int = -2147478631;
public const val `EVENT_NDIS_MISSING_CONFIGURATION_PARAMETER`: Int = -1073736813;
public const val `EVENT_NDIS_NETWORK_ADDRESS`: Int = -1073736816;
public const val `EVENT_NDIS_OUT_OF_RESOURCE`: Int = -1073736823;
public const val `EVENT_NDIS_PORT_OR_DMA_CONFLICT`: Int = -2147478632;
public const val `EVENT_NDIS_PRODUCTID_ERROR`: Int = -2147478622;
public const val `EVENT_NDIS_RECEIVE_SPACE_SMALL`: Int = 1073746837;
public const val `EVENT_NDIS_REMOVE_RECEIVED_ERROR`: Int = -2147478619;
public const val `EVENT_NDIS_RESET_FAILURE_CORRECTION`: Int = -2147478614;
public const val `EVENT_NDIS_RESET_FAILURE_ERROR`: Int = -2147478616;
public const val `EVENT_NDIS_RESOURCE_CONFLICT`: Int = -1073736824;
public const val `EVENT_NDIS_SIGNAL_LOSS_ERROR`: Int = -2147478620;
public const val `EVENT_NDIS_TIMEOUT`: Int = -2147478641;
public const val `EVENT_NDIS_TOKEN_RING_CORRECTION`: Int = 1073746854;
public const val `EVENT_NDIS_UNSUPPORTED_CONFIGURATION`: Int = -1073736815;
public const val `EVENT_PS_ADMISSIONCONTROL_OVERFLOW`: Int = -2147469537;
public const val `EVENT_PS_BAD_BESTEFFORT_LIMIT`: Int = -2147469548;
public const val `EVENT_PS_BINDING_FAILED`: Int = -1073727720;
public const val `EVENT_PS_GPC_REGISTER_FAILED`: Int = -1073727824;
public const val `EVENT_PS_INIT_DEVICE_FAILED`: Int = -1073727717;
public const val `EVENT_PS_MISSING_ADAPTER_REGISTRY_DATA`: Int = -1073727719;
public const val `EVENT_PS_NETWORK_ADDRESS_FAIL`: Int = -1073727712;
public const val `EVENT_PS_NO_RESOURCES_FOR_INIT`: Int = -1073727823;
public const val `EVENT_PS_QUERY_OID_GEN_LINK_SPEED`: Int = -1073727721;
public const val `EVENT_PS_QUERY_OID_GEN_MAXIMUM_FRAME_SIZE`: Int = -1073727723;
public const val `EVENT_PS_QUERY_OID_GEN_MAXIMUM_TOTAL_SIZE`: Int = -1073727722;
public const val `EVENT_PS_REGISTER_ADDRESS_FAMILY_FAILED`: Int = -1073727718;
public const val `EVENT_PS_REGISTER_MINIPORT_FAILED`: Int = -1073727821;
public const val `EVENT_PS_REGISTER_PROTOCOL_FAILED`: Int = -1073727822;
public const val `EVENT_PS_RESOURCE_POOL`: Int = -1073727714;
public const val `EVENT_PS_WAN_LIMITED_BESTEFFORT`: Int = -2147469539;
public const val `EVENT_PS_WMI_INSTANCE_NAME_FAILED`: Int = -1073727716;
public const val `EVENT_RDR_AT_THREAD_MAX`: Int = -2147480622;
public const val `EVENT_RDR_CANT_BIND_TRANSPORT`: Int = -2147480616;
public const val `EVENT_RDR_CANT_BUILD_SMB_HEADER`: Int = -2147480613;
public const val `EVENT_RDR_CANT_CREATE_DEVICE`: Int = -2147480646;
public const val `EVENT_RDR_CANT_CREATE_THREAD`: Int = -2147480645;
public const val `EVENT_RDR_CANT_GET_SECURITY_CONTEXT`: Int = -2147480614;
public const val `EVENT_RDR_CANT_READ_REGISTRY`: Int = -2147480621;
public const val `EVENT_RDR_CANT_REGISTER_ADDRESS`: Int = -2147480615;
public const val `EVENT_RDR_CANT_SET_THREAD`: Int = -2147480644;
public const val `EVENT_RDR_CLOSE_BEHIND`: Int = -2147480637;
public const val `EVENT_RDR_CONNECTION`: Int = -2147480629;
public const val `EVENT_RDR_CONNECTION_REFERENCE`: Int = -2147480633;
public const val `EVENT_RDR_CONTEXTS`: Int = -2147480624;
public const val `EVENT_RDR_DELAYED_SET_ATTRIBUTES_FAILED`: Int = -2147480618;
public const val `EVENT_RDR_DELETEONCLOSE_FAILED`: Int = -2147480617;
public const val `EVENT_RDR_DISPOSITION`: Int = -2147480625;
public const val `EVENT_RDR_ENCRYPT`: Int = -2147480630;
public const val `EVENT_RDR_FAILED_UNLOCK`: Int = -2147480639;
public const val `EVENT_RDR_INVALID_LOCK_REPLY`: Int = -2147480641;
public const val `EVENT_RDR_INVALID_OPLOCK`: Int = -2147480634;
public const val `EVENT_RDR_INVALID_REPLY`: Int = -2147480643;
public const val `EVENT_RDR_INVALID_SMB`: Int = -2147480642;
public const val `EVENT_RDR_MAXCMDS`: Int = -2147480627;
public const val `EVENT_RDR_OPLOCK_SMB`: Int = -2147480626;
public const val `EVENT_RDR_PRIMARY_TRANSPORT_CONNECT_FAILED`: Int = -2147480619;
public const val `EVENT_RDR_RESOURCE_SHORTAGE`: Int = -2147480647;
public const val `EVENT_RDR_SECURITY_SIGNATURE_MISMATCH`: Int = -2147480612;
public const val `EVENT_RDR_SERVER_REFERENCE`: Int = -2147480632;
public const val `EVENT_RDR_SMB_REFERENCE`: Int = -2147480631;
public const val `EVENT_RDR_TIMEOUT`: Int = -2147480635;
public const val `EVENT_RDR_TIMEZONE_BIAS_TOO_LARGE`: Int = -2147480620;
public const val `EVENT_RDR_UNEXPECTED_ERROR`: Int = -2147480636;
public const val `EVENT_RDR_WRITE_BEHIND_FLUSH_FAILED`: Int = -2147480623;
public const val `EVENT_READFILE_TIMEOUT`: Int = -1073734814;
public const val `EVENT_REVERTED_TO_LASTKNOWNGOOD`: Int = -1073734817;
public const val `EVENT_RPCSS_ACTIVATION_ERROR`: Int = -1073731817;
public const val `EVENT_RPCSS_CREATEDEBUGGERPROCESS_FAILURE`: Int = -1073731794;
public const val `EVENT_RPCSS_CREATEPROCESS_FAILURE`: Int = -1073731824;
public const val `EVENT_RPCSS_DEFAULT_LAUNCH_ACCESS_DENIED`: Int = -1073731821;
public const val `EVENT_RPCSS_LAUNCH_ACCESS_DENIED`: Int = -1073731822;
public const val `EVENT_RPCSS_REMOTE_SIDE_ERROR`: Int = -1073731818;
public const val `EVENT_RPCSS_REMOTE_SIDE_ERROR_WITH_FILE`: Int = -1073731816;
public const val `EVENT_RPCSS_REMOTE_SIDE_UNAVAILABLE`: Int = -1073731815;
public const val `EVENT_RPCSS_RUNAS_CANT_LOGIN`: Int = -1073731820;
public const val `EVENT_RPCSS_RUNAS_CREATEPROCESS_FAILURE`: Int = -1073731823;
public const val `EVENT_RPCSS_SERVER_NOT_RESPONDING`: Int = -1073731813;
public const val `EVENT_RPCSS_SERVER_START_TIMEOUT`: Int = -1073731814;
public const val `EVENT_RPCSS_START_SERVICE_FAILURE`: Int = -1073731819;
public const val `EVENT_RPCSS_STOP_SERVICE_FAILURE`: Int = -1073731795;
public const val `EVENT_RUNNING_LASTKNOWNGOOD`: Int = -1073734797;
public const val `EVENT_SCOPE_LABEL_TOO_LONG`: Int = -2147479331;
public const val `EVENT_SCOPE_TOO_LONG`: Int = -2147479330;
public const val `EVENT_SECOND_LOGON_FAILED`: Int = -1073734810;
public const val `EVENT_SERVICE_CONFIG_BACKOUT_FAILED`: Int = -1073734787;
public const val `EVENT_SERVICE_CONTROL_SUCCESS`: Int = 1073748859;
public const val `EVENT_SERVICE_CRASH`: Int = -1073734793;
public const val `EVENT_SERVICE_CRASH_NO_ACTION`: Int = -1073734790;
public const val `EVENT_SERVICE_DIFFERENT_PID_CONNECTED`: Int = -2147476609;
public const val `EVENT_SERVICE_EXIT_FAILED`: Int = -1073734801;
public const val `EVENT_SERVICE_EXIT_FAILED_SPECIFIC`: Int = -1073734800;
public const val `EVENT_SERVICE_LOGON_TYPE_NOT_GRANTED`: Int = -1073734783;
public const val `EVENT_SERVICE_NOT_INTERACTIVE`: Int = -1073734794;
public const val `EVENT_SERVICE_RECOVERY_FAILED`: Int = -1073734792;
public const val `EVENT_SERVICE_SCESRV_FAILED`: Int = -1073734791;
public const val `EVENT_SERVICE_SHUTDOWN_FAILED`: Int = -1073734781;
public const val `EVENT_SERVICE_START_AT_BOOT_FAILED`: Int = -1073734799;
public const val `EVENT_SERVICE_START_FAILED`: Int = -1073734824;
public const val `EVENT_SERVICE_START_FAILED_GROUP`: Int = -1073734822;
public const val `EVENT_SERVICE_START_FAILED_II`: Int = -1073734823;
public const val `EVENT_SERVICE_START_FAILED_NONE`: Int = -1073734821;
public const val `EVENT_SERVICE_START_HUNG`: Int = -1073734802;
public const val `EVENT_SERVICE_START_TYPE_CHANGED`: Int = 1073748864;
public const val `EVENT_SERVICE_STATUS_SUCCESS`: Int = 1073748860;
public const val `EVENT_SERVICE_STOP_SUCCESS_WITH_REASON`: Int = 1073748866;
public const val `EVENT_SEVERE_SERVICE_FAILED`: Int = -1073734803;
public const val `EVENT_SRV_CANT_BIND_DUP_NAME`: Int = -1073739319;
public const val `EVENT_SRV_CANT_BIND_TO_TRANSPORT`: Int = -2147481144;
public const val `EVENT_SRV_CANT_CHANGE_DOMAIN_NAME`: Int = -2147481136;
public const val `EVENT_SRV_CANT_CREATE_DEVICE`: Int = -1073739822;
public const val `EVENT_SRV_CANT_CREATE_PROCESS`: Int = -1073739821;
public const val `EVENT_SRV_CANT_CREATE_THREAD`: Int = -1073739820;
public const val `EVENT_SRV_CANT_GROW_TABLE`: Int = -2147481639;
public const val `EVENT_SRV_CANT_LOAD_DRIVER`: Int = -2147481140;
public const val `EVENT_SRV_CANT_MAP_ERROR`: Int = -2147481138;
public const val `EVENT_SRV_CANT_OPEN_NPFS`: Int = -1073739817;
public const val `EVENT_SRV_CANT_RECREATE_SHARE`: Int = -2147481137;
public const val `EVENT_SRV_CANT_START_SCAVENGER`: Int = -1073739814;
public const val `EVENT_SRV_CANT_UNLOAD_DRIVER`: Int = -2147481139;
public const val `EVENT_SRV_DISK_FULL`: Int = -2147481635;
public const val `EVENT_SRV_DOS_ATTACK_DETECTED`: Int = -2147481623;
public const val `EVENT_SRV_INVALID_REGISTRY_VALUE`: Int = -2147481142;
public const val `EVENT_SRV_INVALID_REQUEST`: Int = -1073739818;
public const val `EVENT_SRV_INVALID_SD`: Int = -2147481141;
public const val `EVENT_SRV_IRP_STACK_SIZE`: Int = -1073739813;
public const val `EVENT_SRV_KEY_NOT_CREATED`: Int = -1073739322;
public const val `EVENT_SRV_KEY_NOT_FOUND`: Int = -1073739323;
public const val `EVENT_SRV_NETWORK_ERROR`: Int = -2147481636;
public const val `EVENT_SRV_NONPAGED_POOL_LIMIT`: Int = -1073739807;
public const val `EVENT_SRV_NO_BLOCKING_IO`: Int = -2147481624;
public const val `EVENT_SRV_NO_FREE_CONNECTIONS`: Int = -2147481626;
public const val `EVENT_SRV_NO_FREE_RAW_WORK_ITEM`: Int = -2147481625;
public const val `EVENT_SRV_NO_NONPAGED_POOL`: Int = -1073739805;
public const val `EVENT_SRV_NO_PAGED_POOL`: Int = -1073739804;
public const val `EVENT_SRV_NO_TRANSPORTS_BOUND`: Int = -1073739321;
public const val `EVENT_SRV_NO_VIRTUAL_MEMORY`: Int = -1073739808;
public const val `EVENT_SRV_NO_WORK_ITEM`: Int = -2147481627;
public const val `EVENT_SRV_OUT_OF_WORK_ITEM_DOS`: Int = -2147481621;
public const val `EVENT_SRV_PAGED_POOL_LIMIT`: Int = -1073739806;
public const val `EVENT_SRV_RESOURCE_SHORTAGE`: Int = -1073739823;
public const val `EVENT_SRV_SERVICE_FAILED`: Int = -1073739824;
public const val `EVENT_SRV_TOO_MANY_DOS`: Int = -2147481622;
public const val `EVENT_SRV_TXF_INIT_FAILED`: Int = -2147481135;
public const val `EVENT_SRV_UNEXPECTED_DISC`: Int = -1073739819;
public const val `EVENT_STREAMS_ALLOCB_FAILURE`: Int = -2147479647;
public const val `EVENT_STREAMS_ALLOCB_FAILURE_CNT`: Int = -2147479646;
public const val `EVENT_STREAMS_ESBALLOC_FAILURE`: Int = -2147479645;
public const val `EVENT_STREAMS_ESBALLOC_FAILURE_CNT`: Int = -2147479644;
public const val `EVENT_STREAMS_STRLOG`: Int = -1073737824;
public const val `EVENT_TAKE_OWNERSHIP`: Int = -1073734796;
public const val `EVENT_TCPIP6_STARTED`: Int = 1073744924;
public const val `EVENT_TCPIP_ADAPTER_REG_FAILURE`: Int = -1073737633;
public const val `EVENT_TCPIP_ADDRESS_CONFLICT1`: Int = -1073737626;
public const val `EVENT_TCPIP_ADDRESS_CONFLICT2`: Int = -1073737625;
public const val `EVENT_TCPIP_AUTOCONFIGURED_ADDRESS_LIMIT_REACHED`: Int = -2147479444;
public const val `EVENT_TCPIP_AUTOCONFIGURED_ROUTE_LIMIT_REACHED`: Int = -2147479443;
public const val `EVENT_TCPIP_CREATE_DEVICE_FAILED`: Int = -1073737724;
public const val `EVENT_TCPIP_DHCP_INIT_FAILED`: Int = -2147479458;
public const val `EVENT_TCPIP_INTERFACE_BIND_FAILURE`: Int = -1073737617;
public const val `EVENT_TCPIP_INVALID_ADDRESS`: Int = -1073737637;
public const val `EVENT_TCPIP_INVALID_DEFAULT_GATEWAY`: Int = -2147479456;
public const val `EVENT_TCPIP_INVALID_MASK`: Int = -1073737636;
public const val `EVENT_TCPIP_IPV4_UNINSTALLED`: Int = 1073746027;
public const val `EVENT_TCPIP_IP_INIT_FAILED`: Int = -1073737628;
public const val `EVENT_TCPIP_MEDIA_CONNECT`: Int = 1073746025;
public const val `EVENT_TCPIP_MEDIA_DISCONNECT`: Int = 1073746026;
public const val `EVENT_TCPIP_NO_ADAPTER_RESOURCES`: Int = -1073737635;
public const val `EVENT_TCPIP_NO_ADDRESS_LIST`: Int = -1073737631;
public const val `EVENT_TCPIP_NO_BINDINGS`: Int = -1073737629;
public const val `EVENT_TCPIP_NO_MASK`: Int = -1073737638;
public const val `EVENT_TCPIP_NO_MASK_LIST`: Int = -1073737630;
public const val `EVENT_TCPIP_NO_RESOURCES_FOR_INIT`: Int = -1073737723;
public const val `EVENT_TCPIP_NTE_CONTEXT_LIST_FAILURE`: Int = -1073737624;
public const val `EVENT_TCPIP_OUT_OF_ORDER_FRAGMENTS_EXCEEDED`: Int = -2147479442;
public const val `EVENT_TCPIP_PCF_CLEAR_FILTER_FAILURE`: Int = -1073737530;
public const val `EVENT_TCPIP_PCF_MISSING_CAPABILITY`: Int = -2147479357;
public const val `EVENT_TCPIP_PCF_MULTICAST_OID_ISSUE`: Int = -2147479358;
public const val `EVENT_TCPIP_PCF_NO_ARP_FILTER`: Int = -2147479355;
public const val `EVENT_TCPIP_PCF_SET_FILTER_FAILURE`: Int = -2147479356;
public const val `EVENT_TCPIP_TCP_CONNECTIONS_PERF_IMPACTED`: Int = -2147479418;
public const val `EVENT_TCPIP_TCP_CONNECT_LIMIT_REACHED`: Int = -2147479422;
public const val `EVENT_TCPIP_TCP_GLOBAL_EPHEMERAL_PORT_SPACE_EXHAUSTED`: Int = -2147479417;
public const val `EVENT_TCPIP_TCP_INIT_FAILED`: Int = -1073737599;
public const val `EVENT_TCPIP_TCP_MPP_ATTACKS_DETECTED`: Int = -2147479419;
public const val `EVENT_TCPIP_TCP_TIME_WAIT_COLLISION`: Int = -2147479421;
public const val `EVENT_TCPIP_TCP_WSD_WS_RESTRICTED`: Int = -2147479420;
public const val `EVENT_TCPIP_TOO_MANY_GATEWAYS`: Int = -2147479451;
public const val `EVENT_TCPIP_TOO_MANY_NETS`: Int = -1073737639;
public const val `EVENT_TCPIP_UDP_GLOBAL_EPHEMERAL_PORT_SPACE_EXHAUSTED`: Int = -2147479382;
public const val `EVENT_TCPIP_UDP_LIMIT_REACHED`: Int = -2147479383;
public const val `EVENT_TRANSACT_INVALID`: Int = -1073734812;
public const val `EVENT_TRANSACT_TIMEOUT`: Int = -1073734813;
public const val `EVENT_TRANSPORT_ADAPTER_NOT_FOUND`: Int = -1073732818;
public const val `EVENT_TRANSPORT_BAD_PROTOCOL`: Int = 1073750835;
public const val `EVENT_TRANSPORT_BINDING_FAILED`: Int = -1073732819;
public const val `EVENT_TRANSPORT_QUERY_OID_FAILED`: Int = -1073732816;
public const val `EVENT_TRANSPORT_REGISTER_FAILED`: Int = -1073732820;
public const val `EVENT_TRANSPORT_RESOURCE_LIMIT`: Int = -2147474646;
public const val `EVENT_TRANSPORT_RESOURCE_POOL`: Int = -2147474647;
public const val `EVENT_TRANSPORT_RESOURCE_SPECIFIC`: Int = -2147474645;
public const val `EVENT_TRANSPORT_SET_OID_FAILED`: Int = -1073732817;
public const val `EVENT_TRANSPORT_TOO_MANY_LINKS`: Int = 1073750834;
public const val `EVENT_TRANSPORT_TRANSFER_DATA`: Int = 1073750833;
public const val `EVENT_TRK_INTERNAL_ERROR`: Int = -1073729324;
public const val `EVENT_TRK_SERVICE_CORRUPT_LOG`: Int = -1073729321;
public const val `EVENT_TRK_SERVICE_DUPLICATE_VOLIDS`: Int = 1073754331;
public const val `EVENT_TRK_SERVICE_MOVE_QUOTA_EXCEEDED`: Int = -2147471140;
public const val `EVENT_TRK_SERVICE_START_FAILURE`: Int = -1073729322;
public const val `EVENT_TRK_SERVICE_START_SUCCESS`: Int = 1073754325;
public const val `EVENT_TRK_SERVICE_VOLUME_CLAIM`: Int = 1073754330;
public const val `EVENT_TRK_SERVICE_VOLUME_CREATE`: Int = 1073754329;
public const val `EVENT_TRK_SERVICE_VOL_QUOTA_EXCEEDED`: Int = -2147471144;
public const val `EVENT_UP_DRIVER_ON_MP`: Int = -1073735724;
public const val `EVENT_WEBCLIENT_CLOSE_DELETE_FAILED`: Int = -2147468746;
public const val `EVENT_WEBCLIENT_CLOSE_PROPPATCH_FAILED`: Int = -2147468745;
public const val `EVENT_WEBCLIENT_CLOSE_PUT_FAILED`: Int = -2147468747;
public const val `EVENT_WEBCLIENT_SETINFO_PROPPATCH_FAILED`: Int = -2147468744;
public const val `EVENT_WINNAT_SESSION_LIMIT_REACHED`: Int = -2147466648;
public const val `EVENT_WINSOCK_CLOSESOCKET_STUCK`: Int = -2147467646;
public const val `EVENT_WINSOCK_TDI_FILTER_DETECTED`: Int = -2147467647;
public const val `EVENT_WSK_OWNINGTHREAD_PARAMETER_IGNORED`: Int = -1073725824;
public const val `EVLEN`: UInt = 16u;
public const val `EXTRA_EXIT_POINT`: Int = -1073727524;
public const val `EXTRA_EXIT_POINT_DELETED`: Int = -1073727520;
public const val `EXTRA_EXIT_POINT_NOT_DELETED`: Int = -1073727519;
public const val `EXTRA_VOLUME`: Int = -1073727521;
public const val `EXTRA_VOLUME_DELETED`: Int = -1073727514;
public const val `EXTRA_VOLUME_NOT_DELETED`: Int = -1073727513;
public const val `FILTER_INTERDOMAIN_TRUST_ACCOUNT`: `NET_USER_ENUM_FILTER_FLAGS` = 8u;
public const val `FILTER_NORMAL_ACCOUNT`: `NET_USER_ENUM_FILTER_FLAGS` = 2u;
public const val `FILTER_SERVER_TRUST_ACCOUNT`: `NET_USER_ENUM_FILTER_FLAGS` = 32u;
public const val `FILTER_TEMP_DUPLICATE_ACCOUNT`: `NET_USER_ENUM_FILTER_FLAGS` = 1u;
public const val `FILTER_WORKSTATION_TRUST_ACCOUNT`: `NET_USER_ENUM_FILTER_FLAGS` = 16u;
// UNSUPPORTED Rust 1185:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FLAT_STRING {
//     pub MaximumLength: i16,
//     pub Length: i16,
//     pub Buffer: [i8; 1],
// }

// UNSUPPORTED Rust 1192:1: declaration Impl has no candidate rule
// impl Default for FLAT_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FORCE_LEVEL_FLAGS` = UInt;
public const val `GNLEN`: UInt = 256u;
public const val `GROUPIDMASK`: UInt = 32768u;
public const val `GROUP_ALL_PARMNUM`: UInt = 0u;
public const val `GROUP_ATTRIBUTES_PARMNUM`: UInt = 3u;
public const val `GROUP_COMMENT_PARMNUM`: UInt = 2u;
// UNSUPPORTED Rust 1203:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GROUP_INFO_0 {
//     pub grpi0_name: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1208:1: declaration Impl has no candidate rule
// impl Default for GROUP_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1213:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GROUP_INFO_1 {
//     pub grpi1_name: windows_sys::core::PWSTR,
//     pub grpi1_comment: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1219:1: declaration Impl has no candidate rule
// impl Default for GROUP_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1224:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GROUP_INFO_1002 {
//     pub grpi1002_comment: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1229:1: declaration Impl has no candidate rule
// impl Default for GROUP_INFO_1002 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1234:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GROUP_INFO_1005 {
//     pub grpi1005_attributes: u32,
// }

// UNSUPPORTED Rust 1239:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GROUP_INFO_2 {
//     pub grpi2_name: windows_sys::core::PWSTR,
//     pub grpi2_comment: windows_sys::core::PWSTR,
//     pub grpi2_group_id: u32,
//     pub grpi2_attributes: u32,
// }

// UNSUPPORTED Rust 1247:1: declaration Impl has no candidate rule
// impl Default for GROUP_INFO_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1252:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct GROUP_INFO_3 {
//     pub grpi3_name: windows_sys::core::PWSTR,
//     pub grpi3_comment: windows_sys::core::PWSTR,
//     pub grpi3_group_sid: super::super::Security::PSID,
//     pub grpi3_attributes: u32,
// }

// UNSUPPORTED Rust 1261:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for GROUP_INFO_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GROUP_NAME_PARMNUM`: UInt = 1u;
// UNSUPPORTED Rust 1268:1: non-scalar type Ptr unsupported
// pub const GROUP_SPECIALGRP_ADMINS: windows_sys::core::PCWSTR = windows_sys::core::w!("ADMINS");

// UNSUPPORTED Rust 1269:1: non-scalar type Ptr unsupported
// pub const GROUP_SPECIALGRP_GUESTS: windows_sys::core::PCWSTR = windows_sys::core::w!("GUESTS");

// UNSUPPORTED Rust 1270:1: non-scalar type Ptr unsupported
// pub const GROUP_SPECIALGRP_LOCAL: windows_sys::core::PCWSTR = windows_sys::core::w!("LOCAL");

// UNSUPPORTED Rust 1271:1: non-scalar type Ptr unsupported
// pub const GROUP_SPECIALGRP_USERS: windows_sys::core::PCWSTR = windows_sys::core::w!("USERS");

// UNSUPPORTED Rust 1272:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GROUP_USERS_INFO_0 {
//     pub grui0_name: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1277:1: declaration Impl has no candidate rule
// impl Default for GROUP_USERS_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1282:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GROUP_USERS_INFO_1 {
//     pub grui1_name: windows_sys::core::PWSTR,
//     pub grui1_attributes: u32,
// }

// UNSUPPORTED Rust 1288:1: declaration Impl has no candidate rule
// impl Default for GROUP_USERS_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1293:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HARDWARE_ADDRESS {
//     pub Address: [u8; 6],
// }

// UNSUPPORTED Rust 1298:1: declaration Impl has no candidate rule
// impl Default for HARDWARE_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HARDWARE_ADDRESS_LENGTH`: UInt = 6u;
// UNSUPPORTED Rust 1304:1: non-scalar type Ptr unsupported
// pub const HELP_MSG_FILENAME: windows_sys::core::PCWSTR = windows_sys::core::w!("NETH");

// UNSUPPORTED Rust 1305:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HLOG {
//     pub time: u32,
//     pub last_flags: u32,
//     pub offset: u32,
//     pub rec_offset: u32,
// }

public const val `INTERFACE_INFO_REVISION_1`: UInt = 1u;
public const val `INVALID_TRACEID`: UInt = 4294967295u;
public const val `IPX_PROTOCOL_BASE`: UInt = 131071u;
public const val `IPX_PROTOCOL_RIP`: UInt = 131072u;
public const val `IR_PROMISCUOUS`: UInt = 0u;
public const val `IR_PROMISCUOUS_MULTICAST`: UInt = 1u;
public const val `JOB_ADD_CURRENT_DATE`: UInt = 8u;
public const val `JOB_EXEC_ERROR`: UInt = 2u;
public const val `JOB_NONINTERACTIVE`: UInt = 16u;
public const val `JOB_RUNS_TODAY`: UInt = 4u;
public const val `JOB_RUN_PERIODICALLY`: UInt = 1u;
public const val `KNOWLEDGE_INCONSISTENCY_DETECTED`: Int = -1073727511;
public const val `LG_INCLUDE_INDIRECT`: UInt = 1u;
public const val `LM20_CNLEN`: UInt = 15u;
public const val `LM20_DEVLEN`: UInt = 8u;
public const val `LM20_DNLEN`: UInt = 15u;
public const val `LM20_GNLEN`: UInt = 20u;
public const val `LM20_MAXCOMMENTSZ`: UInt = 48u;
public const val `LM20_NNLEN`: UInt = 12u;
public const val `LM20_PATHLEN`: UInt = 256u;
public const val `LM20_PWLEN`: UInt = 14u;
public const val `LM20_QNLEN`: UInt = 12u;
public const val `LM20_SERVICE_ACTIVE`: UInt = 0u;
public const val `LM20_SERVICE_CONTINUE_PENDING`: UInt = 4u;
public const val `LM20_SERVICE_PAUSED`: UInt = 12u;
public const val `LM20_SERVICE_PAUSE_PENDING`: UInt = 8u;
public const val `LM20_SNLEN`: UInt = 15u;
public const val `LM20_STXTLEN`: UInt = 63u;
public const val `LM20_UNCLEN`: UInt = 17u;
public const val `LM20_UNLEN`: UInt = 20u;
public const val `LM_REDIR_FAILURE`: Int = 1073756225;
public const val `LOCALGROUP_COMMENT_PARMNUM`: UInt = 2u;
// UNSUPPORTED Rust 1345:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LOCALGROUP_INFO_0 {
//     pub lgrpi0_name: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1350:1: declaration Impl has no candidate rule
// impl Default for LOCALGROUP_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1355:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LOCALGROUP_INFO_1 {
//     pub lgrpi1_name: windows_sys::core::PWSTR,
//     pub lgrpi1_comment: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1361:1: declaration Impl has no candidate rule
// impl Default for LOCALGROUP_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1366:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LOCALGROUP_INFO_1002 {
//     pub lgrpi1002_comment: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1371:1: declaration Impl has no candidate rule
// impl Default for LOCALGROUP_INFO_1002 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1376:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct LOCALGROUP_MEMBERS_INFO_0 {
//     pub lgrmi0_sid: super::super::Security::PSID,
// }

// UNSUPPORTED Rust 1382:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for LOCALGROUP_MEMBERS_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1388:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct LOCALGROUP_MEMBERS_INFO_1 {
//     pub lgrmi1_sid: super::super::Security::PSID,
//     pub lgrmi1_sidusage: super::super::Security::SID_NAME_USE,
//     pub lgrmi1_name: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1396:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for LOCALGROUP_MEMBERS_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1402:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct LOCALGROUP_MEMBERS_INFO_2 {
//     pub lgrmi2_sid: super::super::Security::PSID,
//     pub lgrmi2_sidusage: super::super::Security::SID_NAME_USE,
//     pub lgrmi2_domainandname: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1410:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for LOCALGROUP_MEMBERS_INFO_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1416:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LOCALGROUP_MEMBERS_INFO_3 {
//     pub lgrmi3_domainandname: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1421:1: declaration Impl has no candidate rule
// impl Default for LOCALGROUP_MEMBERS_INFO_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LOCALGROUP_NAME_PARMNUM`: UInt = 1u;
// UNSUPPORTED Rust 1427:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LOCALGROUP_USERS_INFO_0 {
//     pub lgrui0_name: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1432:1: declaration Impl has no candidate rule
// impl Default for LOCALGROUP_USERS_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LOGFLAGS_BACKWARD`: UInt = 1u;
public const val `LOGFLAGS_FORWARD`: UInt = 0u;
public const val `LOGFLAGS_SEEK`: UInt = 2u;
public const val `LOWER_GET_HINT_MASK`: UInt = 65280u;
public const val `LOWER_HINT_MASK`: UInt = 255u;
public const val `MACHINE_UNJOINED`: Int = -1073727507;
public const val `MAJOR_VERSION_MASK`: UInt = 15u;
public const val `MAXCOMMENTSZ`: UInt = 256u;
public const val `MAXPERMENTRIES`: UInt = 64u;
public const val `MAX_LANMAN_MESSAGE_ID`: UInt = 5899u;
public const val `MAX_NERR`: UInt = 2999u;
public const val `MAX_PASSWD_LEN`: UInt = 256u;
public const val `MAX_PREFERRED_LENGTH`: UInt = 4294967295u;
public const val `MAX_PROTOCOL_DLL_LEN`: UInt = 48u;
public const val `MAX_PROTOCOL_NAME_LEN`: UInt = 40u;
// UNSUPPORTED Rust 1452:1: non-scalar type Ptr unsupported
// pub const MESSAGE_FILENAME: windows_sys::core::PCWSTR = windows_sys::core::w!("NETMSG");

public const val `MFE_BOUNDARY_REACHED`: UInt = 6u;
public const val `MFE_IIF`: UInt = 8u;
public const val `MFE_NOT_FORWARDING`: UInt = 2u;
public const val `MFE_NOT_LAST_HOP`: UInt = 10u;
public const val `MFE_NO_ERROR`: UInt = 0u;
public const val `MFE_NO_MULTICAST`: UInt = 7u;
public const val `MFE_NO_ROUTE`: UInt = 9u;
public const val `MFE_NO_SPACE`: UInt = 13u;
public const val `MFE_OIF_PRUNED`: UInt = 5u;
public const val `MFE_OLD_ROUTER`: UInt = 11u;
public const val `MFE_PROHIBITED`: UInt = 12u;
public const val `MFE_PRUNED_UPSTREAM`: UInt = 4u;
public const val `MFE_REACHED_CORE`: UInt = 1u;
public const val `MFE_WRONG_IF`: UInt = 3u;
public const val `MIN_LANMAN_MESSAGE_ID`: UInt = 2100u;
public const val `MISSING_EXIT_POINT`: Int = -1073727523;
public const val `MISSING_EXIT_POINT_CREATED`: Int = -1073727518;
public const val `MISSING_EXIT_POINT_NOT_CREATED`: Int = -1073727517;
public const val `MISSING_VOLUME`: Int = -1073727522;
public const val `MISSING_VOLUME_CREATED`: Int = -1073727516;
public const val `MISSING_VOLUME_NOT_CREATED`: Int = -1073727515;
public const val `MODALS_DOMAIN_ID_PARMNUM`: UInt = 9u;
public const val `MODALS_DOMAIN_NAME_PARMNUM`: UInt = 8u;
public const val `MODALS_FORCE_LOGOFF_PARMNUM`: UInt = 4u;
public const val `MODALS_LOCKOUT_DURATION_PARMNUM`: UInt = 10u;
public const val `MODALS_LOCKOUT_OBSERVATION_WINDOW_PARMNUM`: UInt = 11u;
public const val `MODALS_LOCKOUT_THRESHOLD_PARMNUM`: UInt = 12u;
public const val `MODALS_MAX_PASSWD_AGE_PARMNUM`: UInt = 2u;
public const val `MODALS_MIN_PASSWD_AGE_PARMNUM`: UInt = 3u;
public const val `MODALS_MIN_PASSWD_LEN_PARMNUM`: UInt = 1u;
public const val `MODALS_PASSWD_HIST_LEN_PARMNUM`: UInt = 5u;
public const val `MODALS_PRIMARY_PARMNUM`: UInt = 7u;
public const val `MODALS_ROLE_PARMNUM`: UInt = 6u;
// UNSUPPORTED Rust 1486:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MPR_PROTOCOL_0 {
//     pub dwProtocolId: u32,
//     pub wszProtocol: [u16; 41],
//     pub wszDLLName: [u16; 49],
// }

// UNSUPPORTED Rust 1493:1: declaration Impl has no candidate rule
// impl Default for MPR_PROTOCOL_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MRINFO_DISABLED_FLAG`: UInt = 32u;
public const val `MRINFO_DOWN_FLAG`: UInt = 16u;
public const val `MRINFO_LEAF_FLAG`: UInt = 128u;
public const val `MRINFO_PIM_FLAG`: UInt = 4u;
public const val `MRINFO_QUERIER_FLAG`: UInt = 64u;
public const val `MRINFO_TUNNEL_FLAG`: UInt = 1u;
// UNSUPPORTED Rust 1504:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MSA_INFO_0 {
//     pub State: MSA_INFO_STATE,
// }

public typealias `MSA_INFO_LEVEL` = Int;
public typealias `MSA_INFO_STATE` = Int;
public const val `MSGNAME_FORWARDED_FROM`: UInt = 16u;
public const val `MSGNAME_FORWARDED_TO`: UInt = 4u;
public const val `MSGNAME_NOT_FORWARDED`: UInt = 0u;
// UNSUPPORTED Rust 1514:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MSG_INFO_0 {
//     pub msgi0_name: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1519:1: declaration Impl has no candidate rule
// impl Default for MSG_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1524:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MSG_INFO_1 {
//     pub msgi1_name: windows_sys::core::PWSTR,
//     pub msgi1_forward_flag: u32,
//     pub msgi1_forward: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1531:1: declaration Impl has no candidate rule
// impl Default for MSG_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MS_ROUTER_VERSION`: UInt = 1536u;
public const val `MsaInfoCanInstall`: `MSA_INFO_STATE` = 4;
public const val `MsaInfoCannotInstall`: `MSA_INFO_STATE` = 3;
public const val `MsaInfoInstalled`: `MSA_INFO_STATE` = 5;
public const val `MsaInfoLevel0`: `MSA_INFO_LEVEL` = 0;
public const val `MsaInfoLevelMax`: `MSA_INFO_LEVEL` = 1;
public const val `MsaInfoNotExist`: `MSA_INFO_STATE` = 1;
public const val `MsaInfoNotService`: `MSA_INFO_STATE` = 2;
public const val `NCF_DONTEXPOSELOWER`: `COMPONENT_CHARACTERISTICS` = 4096;
public const val `NCF_FILTER`: `COMPONENT_CHARACTERISTICS` = 1024;
public const val `NCF_FIXED_BINDING`: `COMPONENT_CHARACTERISTICS` = 131072;
public const val `NCF_HAS_UI`: `COMPONENT_CHARACTERISTICS` = 128;
public const val `NCF_HIDDEN`: `COMPONENT_CHARACTERISTICS` = 8;
public const val `NCF_HIDE_BINDING`: `COMPONENT_CHARACTERISTICS` = 8192;
public const val `NCF_LOWER`: `SUPPORTS_BINDING_INTERFACE_FLAGS` = 1;
public const val `NCF_LW_FILTER`: `COMPONENT_CHARACTERISTICS` = 262144;
public const val `NCF_MULTIPORT_INSTANCED_ADAPTER`: `COMPONENT_CHARACTERISTICS` = 64;
public const val `NCF_NDIS_PROTOCOL`: `COMPONENT_CHARACTERISTICS` = 16384;
public const val `NCF_NOT_USER_REMOVABLE`: `COMPONENT_CHARACTERISTICS` = 32;
public const val `NCF_NO_SERVICE`: `COMPONENT_CHARACTERISTICS` = 16;
public const val `NCF_PHYSICAL`: `COMPONENT_CHARACTERISTICS` = 4;
public const val `NCF_SINGLE_INSTANCE`: `COMPONENT_CHARACTERISTICS` = 256;
public const val `NCF_SOFTWARE_ENUMERATED`: `COMPONENT_CHARACTERISTICS` = 2;
public const val `NCF_UPPER`: `SUPPORTS_BINDING_INTERFACE_FLAGS` = 2;
public const val `NCF_VIRTUAL`: `COMPONENT_CHARACTERISTICS` = 1;
public const val `NCN_ADD`: `BIND_FLAGS1` = 1;
public const val `NCN_BINDING_PATH`: `BIND_FLAGS1` = 256;
public const val `NCN_DISABLE`: `BIND_FLAGS1` = 32;
public const val `NCN_ENABLE`: `BIND_FLAGS1` = 16;
public const val `NCN_NET`: `BIND_FLAGS1` = 65536;
public const val `NCN_NETCLIENT`: `BIND_FLAGS1` = 262144;
public const val `NCN_NETSERVICE`: `BIND_FLAGS1` = 524288;
public const val `NCN_NETTRANS`: `BIND_FLAGS1` = 131072;
public const val `NCN_PROPERTYCHANGE`: `BIND_FLAGS1` = 512;
public const val `NCN_REMOVE`: `BIND_FLAGS1` = 2;
public const val `NCN_UPDATE`: `BIND_FLAGS1` = 4;
public typealias `NCPNP_RECONFIG_LAYER` = Int;
public const val `NCRL_NDIS`: `NCPNP_RECONFIG_LAYER` = 1;
public const val `NCRL_TDI`: `NCPNP_RECONFIG_LAYER` = 2;
public typealias `NCRP_FLAGS` = Int;
public const val `NCRP_QUERY_PROPERTY_UI`: `NCRP_FLAGS` = 1;
public const val `NCRP_SHOW_PROPERTY_UI`: `NCRP_FLAGS` = 2;
public const val `NELOG_AT_Exec_Err`: UInt = 3178u;
public const val `NELOG_AT_cannot_read`: UInt = 3174u;
public const val `NELOG_AT_cannot_write`: UInt = 3129u;
public const val `NELOG_AT_sched_err`: UInt = 3175u;
public const val `NELOG_AT_schedule_file_created`: UInt = 3176u;
public const val `NELOG_Access_File_Bad`: UInt = 3122u;
public const val `NELOG_Build_Name`: UInt = 3170u;
public const val `NELOG_Cant_Make_Msg_File`: UInt = 3130u;
public const val `NELOG_DiskFT`: UInt = 3221u;
public const val `NELOG_DriverNotLoaded`: UInt = 5727u;
public const val `NELOG_Entries_Lost`: UInt = 3114u;
public const val `NELOG_Error_in_DLL`: UInt = 3256u;
public const val `NELOG_Exec_Netservr_NoMem`: UInt = 3131u;
public const val `NELOG_FT_ErrLog_Too_Large`: UInt = 3258u;
public const val `NELOG_FT_Update_In_Progress`: UInt = 3259u;
public const val `NELOG_FailedToGetComputerName`: UInt = 5726u;
public const val `NELOG_FailedToRegisterSC`: UInt = 5724u;
public const val `NELOG_FailedToSetServiceStatus`: UInt = 5725u;
public const val `NELOG_File_Changed`: UInt = 3253u;
public const val `NELOG_Files_Dont_Fit`: UInt = 3254u;
public const val `NELOG_HardErr_From_Server`: UInt = 3182u;
public const val `NELOG_HotFix`: UInt = 3181u;
public const val `NELOG_Init_Chardev_Err`: UInt = 3124u;
public const val `NELOG_Init_Exec_Fail`: UInt = 3105u;
public const val `NELOG_Init_OpenCreate_Err`: UInt = 3110u;
public const val `NELOG_Init_Seg_Overflow`: UInt = 3120u;
public const val `NELOG_Internal_Error`: UInt = 3100u;
public const val `NELOG_Invalid_Config_File`: UInt = 3252u;
public const val `NELOG_Invalid_Config_Line`: UInt = 3251u;
public const val `NELOG_Ioctl_Error`: UInt = 3108u;
public const val `NELOG_Joined_Domain`: UInt = 3260u;
public const val `NELOG_Joined_Workgroup`: UInt = 3261u;
public const val `NELOG_Lazy_Write_Err`: UInt = 3180u;
public const val `NELOG_LocalSecFail1`: UInt = 3183u;
public const val `NELOG_LocalSecFail2`: UInt = 3184u;
public const val `NELOG_LocalSecFail3`: UInt = 3185u;
public const val `NELOG_LocalSecGeneralFail`: UInt = 3186u;
public const val `NELOG_Mail_Slt_Err`: UInt = 3173u;
public const val `NELOG_Mailslot_err`: UInt = 3127u;
public const val `NELOG_Message_Send`: UInt = 3172u;
public const val `NELOG_Missing_Parameter`: UInt = 3250u;
public const val `NELOG_Msg_Log_Err`: UInt = 3150u;
public const val `NELOG_Msg_Sem_Shutdown`: UInt = 3141u;
public const val `NELOG_Msg_Shutdown`: UInt = 3140u;
public const val `NELOG_Msg_Unexpected_SMB_Type`: UInt = 3152u;
public const val `NELOG_Name_Expansion`: UInt = 3171u;
public const val `NELOG_Ncb_Error`: UInt = 3106u;
public const val `NELOG_Ncb_TooManyErr`: UInt = 3126u;
public const val `NELOG_NetBios`: UInt = 3111u;
public const val `NELOG_NetLogonFailedToInitializeAuthzRm`: UInt = 5821u;
public const val `NELOG_NetLogonFailedToInitializeRPCSD`: UInt = 5822u;
public const val `NELOG_NetWkSta_Internal_Error`: UInt = 3190u;
public const val `NELOG_NetWkSta_NCB_Err`: UInt = 3195u;
public const val `NELOG_NetWkSta_No_Resource`: UInt = 3191u;
public const val `NELOG_NetWkSta_Reset_Err`: UInt = 3197u;
public const val `NELOG_NetWkSta_SMB_Err`: UInt = 3192u;
public const val `NELOG_NetWkSta_Stuck_VC_Err`: UInt = 3194u;
public const val `NELOG_NetWkSta_Too_Many`: UInt = 3198u;
public const val `NELOG_NetWkSta_VC_Err`: UInt = 3193u;
public const val `NELOG_NetWkSta_Write_Behind_Err`: UInt = 3196u;
public const val `NELOG_Net_Not_Started`: UInt = 3107u;
public const val `NELOG_NetlogonAddNameFailure`: UInt = 5741u;
public const val `NELOG_NetlogonAuthDCFail`: UInt = 3210u;
public const val `NELOG_NetlogonAuthDomainDowngraded`: UInt = 5791u;
public const val `NELOG_NetlogonAuthNoDomainController`: UInt = 5719u;
public const val `NELOG_NetlogonAuthNoTrustLsaSecret`: UInt = 5720u;
public const val `NELOG_NetlogonAuthNoTrustSamAccount`: UInt = 5721u;
public const val `NELOG_NetlogonAuthNoUplevelDomainController`: UInt = 5790u;
public const val `NELOG_NetlogonBadSiteName`: UInt = 5779u;
public const val `NELOG_NetlogonBadSubnetName`: UInt = 5780u;
public const val `NELOG_NetlogonBrowserDriver`: UInt = 5740u;
public const val `NELOG_NetlogonChangeLogCorrupt`: UInt = 5705u;
public const val `NELOG_NetlogonDcOldSiteCovered`: UInt = 5794u;
public const val `NELOG_NetlogonDcSiteCovered`: UInt = 5784u;
public const val `NELOG_NetlogonDcSiteNotCovered`: UInt = 5785u;
public const val `NELOG_NetlogonDcSiteNotCoveredAuto`: UInt = 5795u;
public const val `NELOG_NetlogonDnsDeregAborted`: UInt = 5808u;
public const val `NELOG_NetlogonDnsHostNameLowerCasingFailed`: UInt = 5825u;
public const val `NELOG_NetlogonDownLevelLogoffFailed`: UInt = 5708u;
public const val `NELOG_NetlogonDownLevelLogonFailed`: UInt = 5707u;
public const val `NELOG_NetlogonDuplicateMachineAccounts`: UInt = 5738u;
public const val `NELOG_NetlogonDynamicDnsDeregisterFailure`: UInt = 5775u;
public const val `NELOG_NetlogonDynamicDnsFailure`: UInt = 5782u;
public const val `NELOG_NetlogonDynamicDnsRegisterFailure`: UInt = 5774u;
public const val `NELOG_NetlogonDynamicDnsServerFailure`: UInt = 5781u;
public const val `NELOG_NetlogonFailedAccountDelta`: UInt = 5735u;
public const val `NELOG_NetlogonFailedDnsHostNameUpdate`: UInt = 5789u;
public const val `NELOG_NetlogonFailedDomainDelta`: UInt = 5729u;
public const val `NELOG_NetlogonFailedFileCreate`: UInt = 5776u;
public const val `NELOG_NetlogonFailedGlobalGroupDelta`: UInt = 5730u;
public const val `NELOG_NetlogonFailedLocalGroupDelta`: UInt = 5731u;
public const val `NELOG_NetlogonFailedPolicyDelta`: UInt = 5733u;
public const val `NELOG_NetlogonFailedPrimary`: UInt = 3223u;
public const val `NELOG_NetlogonFailedSecretDelta`: UInt = 5736u;
public const val `NELOG_NetlogonFailedSpnUpdate`: UInt = 5788u;
public const val `NELOG_NetlogonFailedToAddAuthzRpcInterface`: UInt = 5820u;
public const val `NELOG_NetlogonFailedToAddRpcInterface`: UInt = 5702u;
public const val `NELOG_NetlogonFailedToCreateShare`: UInt = 5706u;
public const val `NELOG_NetlogonFailedToReadMailslot`: UInt = 5703u;
public const val `NELOG_NetlogonFailedToRegisterSC`: UInt = 5704u;
public const val `NELOG_NetlogonFailedToUpdateTrustList`: UInt = 5701u;
public const val `NELOG_NetlogonFailedTrustedDomainDelta`: UInt = 5734u;
public const val `NELOG_NetlogonFailedUserDelta`: UInt = 5732u;
public const val `NELOG_NetlogonFullSyncCallFailed`: UInt = 5714u;
public const val `NELOG_NetlogonFullSyncCallSuccess`: UInt = 5713u;
public const val `NELOG_NetlogonFullSyncFailed`: UInt = 5718u;
public const val `NELOG_NetlogonFullSyncSuccess`: UInt = 5717u;
public const val `NELOG_NetlogonGcOldSiteCovered`: UInt = 5796u;
public const val `NELOG_NetlogonGcSiteCovered`: UInt = 5786u;
public const val `NELOG_NetlogonGcSiteNotCovered`: UInt = 5787u;
public const val `NELOG_NetlogonGcSiteNotCoveredAuto`: UInt = 5797u;
public const val `NELOG_NetlogonGetSubnetToSite`: UInt = 5777u;
public const val `NELOG_NetlogonInvalidDwordParameterValue`: UInt = 5804u;
public const val `NELOG_NetlogonInvalidGenericParameterValue`: UInt = 5803u;
public const val `NELOG_NetlogonLanmanBdcsNotAllowed`: UInt = 5772u;
public const val `NELOG_NetlogonMachinePasswdSetSucceeded`: UInt = 5823u;
public const val `NELOG_NetlogonMsaPasswdSetSucceeded`: UInt = 5824u;
public const val `NELOG_NetlogonNTLogoffFailed`: UInt = 5710u;
public const val `NELOG_NetlogonNTLogonFailed`: UInt = 5709u;
public const val `NELOG_NetlogonNdncOldSiteCovered`: UInt = 5798u;
public const val `NELOG_NetlogonNdncSiteCovered`: UInt = 5792u;
public const val `NELOG_NetlogonNdncSiteNotCovered`: UInt = 5793u;
public const val `NELOG_NetlogonNdncSiteNotCoveredAuto`: UInt = 5799u;
public const val `NELOG_NetlogonNoAddressToSiteMapping`: UInt = 5802u;
public const val `NELOG_NetlogonNoDynamicDns`: UInt = 5773u;
public const val `NELOG_NetlogonNoDynamicDnsManual`: UInt = 5806u;
public const val `NELOG_NetlogonNoSiteForClient`: UInt = 5778u;
public const val `NELOG_NetlogonNoSiteForClients`: UInt = 5807u;
public const val `NELOG_NetlogonPartialSiteMappingForClients`: UInt = 5810u;
public const val `NELOG_NetlogonPartialSyncCallFailed`: UInt = 5712u;
public const val `NELOG_NetlogonPartialSyncCallSuccess`: UInt = 5711u;
public const val `NELOG_NetlogonPartialSyncFailed`: UInt = 5716u;
public const val `NELOG_NetlogonPartialSyncSuccess`: UInt = 5715u;
public const val `NELOG_NetlogonPasswdSetFailed`: UInt = 3224u;
public const val `NELOG_NetlogonRejectedRemoteDynamicDnsDeregister`: UInt = 5814u;
public const val `NELOG_NetlogonRejectedRemoteDynamicDnsRegister`: UInt = 5813u;
public const val `NELOG_NetlogonRemoteDynamicDnsDeregisterFailure`: UInt = 5812u;
public const val `NELOG_NetlogonRemoteDynamicDnsRegisterFailure`: UInt = 5811u;
public const val `NELOG_NetlogonRemoteDynamicDnsUpdateRequestFailure`: UInt = 5815u;
public const val `NELOG_NetlogonRequireSignOrSealError`: UInt = 3227u;
public const val `NELOG_NetlogonRpcCallCancelled`: UInt = 5783u;
public const val `NELOG_NetlogonRpcPortRequestFailure`: UInt = 5809u;
public const val `NELOG_NetlogonSSIInitError`: UInt = 5700u;
public const val `NELOG_NetlogonServerAuthFailed`: UInt = 5722u;
public const val `NELOG_NetlogonServerAuthFailedNoAccount`: UInt = 5805u;
public const val `NELOG_NetlogonServerAuthNoTrustSamAccount`: UInt = 5723u;
public const val `NELOG_NetlogonSessionTypeWrong`: UInt = 5770u;
public const val `NELOG_NetlogonSpnCrackNamesFailure`: UInt = 5801u;
public const val `NELOG_NetlogonSpnMultipleSamAccountNames`: UInt = 5800u;
public const val `NELOG_NetlogonSyncError`: UInt = 3226u;
public const val `NELOG_NetlogonSystemError`: UInt = 5737u;
public const val `NELOG_NetlogonTooManyGlobalGroups`: UInt = 5739u;
public const val `NELOG_NetlogonTrackingError`: UInt = 3225u;
public const val `NELOG_NetlogonUserValidationReqInitialTimeOut`: UInt = 5816u;
public const val `NELOG_NetlogonUserValidationReqRecurringTimeOut`: UInt = 5817u;
public const val `NELOG_NetlogonUserValidationReqWaitInitialWarning`: UInt = 5818u;
public const val `NELOG_NetlogonUserValidationReqWaitRecurringWarning`: UInt = 5819u;
public const val `NELOG_NoTranportLoaded`: UInt = 5728u;
public const val `NELOG_OEM_Code`: UInt = 3299u;
public const val `NELOG_ReleaseMem_Alert`: UInt = 3128u;
public const val `NELOG_Remote_API`: UInt = 3125u;
public const val `NELOG_ReplAccessDenied`: UInt = 3222u;
public const val `NELOG_ReplBadExport`: UInt = 3219u;
public const val `NELOG_ReplBadImport`: UInt = 3218u;
public const val `NELOG_ReplBadMsg`: UInt = 3215u;
public const val `NELOG_ReplCannotMasterDir`: UInt = 3207u;
public const val `NELOG_ReplLogonFailed`: UInt = 3211u;
public const val `NELOG_ReplLostMaster`: UInt = 3209u;
public const val `NELOG_ReplMaxFiles`: UInt = 3213u;
public const val `NELOG_ReplMaxTreeDepth`: UInt = 3214u;
public const val `NELOG_ReplNetErr`: UInt = 3212u;
public const val `NELOG_ReplSignalFileErr`: UInt = 3220u;
public const val `NELOG_ReplSysErr`: UInt = 3216u;
public const val `NELOG_ReplUpdateError`: UInt = 3208u;
public const val `NELOG_ReplUserCurDir`: UInt = 3206u;
public const val `NELOG_ReplUserLoged`: UInt = 3217u;
public const val `NELOG_Resource_Shortage`: UInt = 3101u;
public const val `NELOG_RplAdapterResource`: UInt = 5756u;
public const val `NELOG_RplBackupDatabase`: UInt = 5765u;
public const val `NELOG_RplCheckConfigs`: UInt = 5760u;
public const val `NELOG_RplCheckSecurity`: UInt = 5764u;
public const val `NELOG_RplCreateProfiles`: UInt = 5761u;
public const val `NELOG_RplFileCopy`: UInt = 5757u;
public const val `NELOG_RplFileDelete`: UInt = 5758u;
public const val `NELOG_RplFilePerms`: UInt = 5759u;
public const val `NELOG_RplInitDatabase`: UInt = 5766u;
public const val `NELOG_RplInitRestoredDatabase`: UInt = 5769u;
public const val `NELOG_RplMessages`: UInt = 5742u;
public const val `NELOG_RplRegistry`: UInt = 5762u;
public const val `NELOG_RplReplaceRPLDISK`: UInt = 5763u;
public const val `NELOG_RplRestoreDatabaseFailure`: UInt = 5767u;
public const val `NELOG_RplRestoreDatabaseSuccess`: UInt = 5768u;
public const val `NELOG_RplSystem`: UInt = 5744u;
public const val `NELOG_RplUpgradeDBTo40`: UInt = 5771u;
public const val `NELOG_RplWkstaBbcFile`: UInt = 5751u;
public const val `NELOG_RplWkstaFileChecksum`: UInt = 5749u;
public const val `NELOG_RplWkstaFileLineCount`: UInt = 5750u;
public const val `NELOG_RplWkstaFileOpen`: UInt = 5746u;
public const val `NELOG_RplWkstaFileRead`: UInt = 5747u;
public const val `NELOG_RplWkstaFileSize`: UInt = 5752u;
public const val `NELOG_RplWkstaInternal`: UInt = 5753u;
public const val `NELOG_RplWkstaMemory`: UInt = 5748u;
public const val `NELOG_RplWkstaNetwork`: UInt = 5755u;
public const val `NELOG_RplWkstaTimeout`: UInt = 5745u;
public const val `NELOG_RplWkstaWrongVersion`: UInt = 5754u;
public const val `NELOG_RplXnsBoot`: UInt = 5743u;
public const val `NELOG_SMB_Illegal`: UInt = 3112u;
public const val `NELOG_Server_Lock_Failure`: UInt = 3132u;
public const val `NELOG_Service_Fail`: UInt = 3113u;
public const val `NELOG_Srv_Close_Failure`: UInt = 3205u;
public const val `NELOG_Srv_No_Mem_Grow`: UInt = 3121u;
public const val `NELOG_Srv_Thread_Failure`: UInt = 3204u;
public const val `NELOG_Srvnet_NB_Open`: UInt = 3177u;
public const val `NELOG_Srvnet_Not_Started`: UInt = 3123u;
public const val `NELOG_System_Error`: UInt = 3257u;
public const val `NELOG_System_Semaphore`: UInt = 3109u;
public const val `NELOG_UPS_CannotOpenDriver`: UInt = 3233u;
public const val `NELOG_UPS_CmdFileConfig`: UInt = 3235u;
public const val `NELOG_UPS_CmdFileError`: UInt = 3232u;
public const val `NELOG_UPS_CmdFileExec`: UInt = 3236u;
public const val `NELOG_UPS_PowerBack`: UInt = 3234u;
public const val `NELOG_UPS_PowerOut`: UInt = 3230u;
public const val `NELOG_UPS_Shutdown`: UInt = 3231u;
public const val `NELOG_Unable_To_Lock_Segment`: UInt = 3102u;
public const val `NELOG_Unable_To_Unlock_Segment`: UInt = 3103u;
public const val `NELOG_Uninstall_Service`: UInt = 3104u;
public const val `NELOG_VIO_POPUP_ERR`: UInt = 3151u;
public const val `NELOG_Wksta_Bad_Mailslot_SMB`: UInt = 3165u;
public const val `NELOG_Wksta_BiosThreadFailure`: UInt = 3162u;
public const val `NELOG_Wksta_Compname`: UInt = 3161u;
public const val `NELOG_Wksta_HostTab_Full`: UInt = 3164u;
public const val `NELOG_Wksta_Infoseg`: UInt = 3160u;
public const val `NELOG_Wksta_IniSeg`: UInt = 3163u;
public const val `NELOG_Wksta_SSIRelogon`: UInt = 3167u;
public const val `NELOG_Wksta_UASInit`: UInt = 3166u;
public const val `NELOG_Wrong_DLL_Version`: UInt = 3255u;
public const val `NERR_ACFFileIOFail`: UInt = 2229u;
public const val `NERR_ACFNoParent`: UInt = 2232u;
public const val `NERR_ACFNoRoom`: UInt = 2228u;
public const val `NERR_ACFNotFound`: UInt = 2219u;
public const val `NERR_ACFNotLoaded`: UInt = 2227u;
public const val `NERR_ACFTooManyLists`: UInt = 2230u;
public const val `NERR_AccountExpired`: UInt = 2239u;
public const val `NERR_AccountLockedOut`: UInt = 2702u;
public const val `NERR_AccountReuseBlockedByPolicy`: UInt = 2732u;
public const val `NERR_AccountUndefined`: UInt = 2238u;
public const val `NERR_AcctLimitExceeded`: UInt = 2434u;
public const val `NERR_ActiveConns`: UInt = 2402u;
public const val `NERR_AddForwarded`: UInt = 2275u;
public const val `NERR_AlertExists`: UInt = 2430u;
public const val `NERR_AlreadyCloudDomainJoined`: UInt = 2700u;
public const val `NERR_AlreadyExists`: UInt = 2276u;
public const val `NERR_AlreadyForwarded`: UInt = 2274u;
public const val `NERR_AlreadyLoggedOn`: UInt = 2200u;
public const val `NERR_BASE`: UInt = 2100u;
public const val `NERR_BadAsgType`: UInt = 2251u;
public const val `NERR_BadComponent`: UInt = 2356u;
public const val `NERR_BadControlRecv`: UInt = 2193u;
public const val `NERR_BadDest`: UInt = 2382u;
public const val `NERR_BadDev`: UInt = 2341u;
public const val `NERR_BadDevString`: UInt = 2340u;
public const val `NERR_BadDomainJoinInfo`: UInt = 2712u;
public const val `NERR_BadDosFunction`: UInt = 2502u;
public const val `NERR_BadDosRetCode`: UInt = 2500u;
public const val `NERR_BadEventName`: UInt = 2143u;
public const val `NERR_BadFileCheckSum`: UInt = 2504u;
public const val `NERR_BadOfflineJoinInfo`: UInt = 2710u;
public const val `NERR_BadPassword`: UInt = 2203u;
public const val `NERR_BadPasswordCore`: UInt = 2403u;
public const val `NERR_BadQueueDevString`: UInt = 2334u;
public const val `NERR_BadQueuePriority`: UInt = 2335u;
public const val `NERR_BadReceive`: UInt = 2282u;
public const val `NERR_BadRecipient`: UInt = 2433u;
public const val `NERR_BadServiceName`: UInt = 2185u;
public const val `NERR_BadServiceProgName`: UInt = 2188u;
public const val `NERR_BadSource`: UInt = 2381u;
public const val `NERR_BadTransactConfig`: UInt = 2141u;
public const val `NERR_BadUasConfig`: UInt = 2450u;
public const val `NERR_BadUsername`: UInt = 2202u;
public const val `NERR_BrowserConfiguredToNotRun`: UInt = 2550u;
public const val `NERR_BrowserNotStarted`: UInt = 2139u;
public const val `NERR_BrowserTableIncomplete`: UInt = 2319u;
public const val `NERR_BufTooSmall`: UInt = 2123u;
public const val `NERR_CallingRplSrvr`: UInt = 2515u;
public const val `NERR_CanNotGrowSegment`: UInt = 2233u;
public const val `NERR_CanNotGrowUASFile`: UInt = 2456u;
public const val `NERR_CannotUnjoinAadDomain`: UInt = 2727u;
public const val `NERR_CannotUpdateAadHostName`: UInt = 2728u;
public const val `NERR_CantConnectRplSrvr`: UInt = 2513u;
public const val `NERR_CantCreateJoinInfo`: UInt = 2711u;
public const val `NERR_CantLoadOfflineHive`: UInt = 2717u;
public const val `NERR_CantOpenImageFile`: UInt = 2514u;
public const val `NERR_CantType`: UInt = 2357u;
public const val `NERR_CantVerifyHostname`: UInt = 2716u;
public const val `NERR_CfgCompNotFound`: UInt = 2146u;
public const val `NERR_CfgParamNotFound`: UInt = 2147u;
public const val `NERR_ClientNameNotFound`: UInt = 2312u;
public const val `NERR_CommDevInUse`: UInt = 2343u;
public const val `NERR_ComputerAccountNotFound`: UInt = 2697u;
public const val `NERR_ConnectionInsecure`: UInt = 2718u;
public const val `NERR_DCNotFound`: UInt = 2453u;
public const val `NERR_DS8DCNotFound`: UInt = 2722u;
public const val `NERR_DS8DCRequired`: UInt = 2720u;
public const val `NERR_DS9DCNotFound`: UInt = 2725u;
public const val `NERR_DataTypeInvalid`: UInt = 2167u;
public const val `NERR_DatabaseUpToDate`: UInt = 2248u;
public const val `NERR_DefaultJoinRequired`: UInt = 2694u;
public const val `NERR_DelComputerName`: UInt = 2278u;
public const val `NERR_DeleteLater`: UInt = 2298u;
public const val `NERR_DestExists`: UInt = 2153u;
public const val `NERR_DestIdle`: UInt = 2158u;
public const val `NERR_DestInvalidOp`: UInt = 2159u;
public const val `NERR_DestInvalidState`: UInt = 2162u;
public const val `NERR_DestNoRoom`: UInt = 2157u;
public const val `NERR_DestNotFound`: UInt = 2152u;
public const val `NERR_DevInUse`: UInt = 2404u;
public const val `NERR_DevInvalidOpCode`: UInt = 2331u;
public const val `NERR_DevNotFound`: UInt = 2332u;
public const val `NERR_DevNotOpen`: UInt = 2333u;
public const val `NERR_DevNotRedirected`: UInt = 2107u;
public const val `NERR_DeviceIsShared`: UInt = 2252u;
public const val `NERR_DeviceNotShared`: UInt = 2311u;
public const val `NERR_DeviceShareConflict`: UInt = 2318u;
public const val `NERR_DfsAlreadyShared`: UInt = 2664u;
public const val `NERR_DfsBadRenamePath`: UInt = 2671u;
public const val `NERR_DfsCantCreateJunctionPoint`: UInt = 2669u;
public const val `NERR_DfsCantRemoveDfsRoot`: UInt = 2682u;
public const val `NERR_DfsCantRemoveLastServerShare`: UInt = 2677u;
public const val `NERR_DfsChildOrParentInDfs`: UInt = 2683u;
public const val `NERR_DfsCyclicalName`: UInt = 2674u;
public const val `NERR_DfsDataIsIdentical`: UInt = 2681u;
public const val `NERR_DfsDuplicateService`: UInt = 2676u;
public const val `NERR_DfsInconsistent`: UInt = 2679u;
public const val `NERR_DfsInternalCorruption`: UInt = 2660u;
public const val `NERR_DfsInternalError`: UInt = 2690u;
public const val `NERR_DfsLeafVolume`: UInt = 2667u;
public const val `NERR_DfsNoSuchServer`: UInt = 2673u;
public const val `NERR_DfsNoSuchShare`: UInt = 2665u;
public const val `NERR_DfsNoSuchVolume`: UInt = 2662u;
public const val `NERR_DfsNotALeafVolume`: UInt = 2666u;
public const val `NERR_DfsNotSupportedInServerDfs`: UInt = 2675u;
public const val `NERR_DfsServerNotDfsAware`: UInt = 2670u;
public const val `NERR_DfsServerUpgraded`: UInt = 2680u;
public const val `NERR_DfsVolumeAlreadyExists`: UInt = 2663u;
public const val `NERR_DfsVolumeDataCorrupt`: UInt = 2661u;
public const val `NERR_DfsVolumeHasMultipleServers`: UInt = 2668u;
public const val `NERR_DfsVolumeIsInterDfs`: UInt = 2678u;
public const val `NERR_DfsVolumeIsOffline`: UInt = 2672u;
public const val `NERR_DifferentServers`: UInt = 2383u;
public const val `NERR_DriverNotFound`: UInt = 2166u;
public const val `NERR_DupNameReboot`: UInt = 2144u;
public const val `NERR_DuplicateHostName`: UInt = 2729u;
public const val `NERR_DuplicateName`: UInt = 2297u;
public const val `NERR_DuplicateShare`: UInt = 2118u;
public const val `NERR_ErrCommRunSrv`: UInt = 2389u;
public const val `NERR_ErrorExecingGhost`: UInt = 2391u;
public const val `NERR_ExecFailure`: UInt = 2315u;
public const val `NERR_FileIdNotFound`: UInt = 2314u;
public const val `NERR_GroupExists`: UInt = 2223u;
public const val `NERR_GroupNotFound`: UInt = 2220u;
public const val `NERR_GrpMsgProcessor`: UInt = 2280u;
public const val `NERR_HostNameTooLong`: UInt = 2730u;
public const val `NERR_ImageParamErr`: UInt = 2508u;
public const val `NERR_InUseBySpooler`: UInt = 2342u;
public const val `NERR_IncompleteDel`: UInt = 2299u;
public const val `NERR_InternalError`: UInt = 2140u;
public const val `NERR_InvalidAPI`: UInt = 2142u;
public const val `NERR_InvalidComputer`: UInt = 2351u;
public const val `NERR_InvalidDatabase`: UInt = 2247u;
public const val `NERR_InvalidDevice`: UInt = 2294u;
public const val `NERR_InvalidLana`: UInt = 2400u;
public const val `NERR_InvalidLogSeek`: UInt = 2440u;
public const val `NERR_InvalidLogonHours`: UInt = 2241u;
public const val `NERR_InvalidMachineNameForJoin`: UInt = 2724u;
public const val `NERR_InvalidMaxUsers`: UInt = 2122u;
public const val `NERR_InvalidUASOp`: UInt = 2451u;
public const val `NERR_InvalidWorkgroupName`: UInt = 2695u;
public const val `NERR_InvalidWorkstation`: UInt = 2240u;
public const val `NERR_IsDfsShare`: UInt = 2321u;
public const val `NERR_ItemNotFound`: UInt = 2115u;
public const val `NERR_JobInvalidState`: UInt = 2164u;
public const val `NERR_JobNoRoom`: UInt = 2156u;
public const val `NERR_JobNotFound`: UInt = 2151u;
public const val `NERR_JoinPerformedMustRestart`: UInt = 2713u;
public const val `NERR_LDAPCapableDCRequired`: UInt = 2721u;
public const val `NERR_LanmanIniError`: UInt = 2131u;
public const val `NERR_LastAdmin`: UInt = 2452u;
public const val `NERR_LineTooLong`: UInt = 2149u;
public const val `NERR_LocalDrive`: UInt = 2405u;
public const val `NERR_LocalForward`: UInt = 2279u;
public const val `NERR_LogFileChanged`: UInt = 2378u;
public const val `NERR_LogFileCorrupt`: UInt = 2379u;
public const val `NERR_LogOverflow`: UInt = 2377u;
public const val `NERR_LogonDomainExists`: UInt = 2216u;
public const val `NERR_LogonNoUserPath`: UInt = 2211u;
public const val `NERR_LogonScriptError`: UInt = 2212u;
public const val `NERR_LogonServerConflict`: UInt = 2210u;
public const val `NERR_LogonServerNotFound`: UInt = 2215u;
public const val `NERR_LogonTrackingError`: UInt = 2454u;
public const val `NERR_LogonsPaused`: UInt = 2209u;
public const val `NERR_MaxLenExceeded`: UInt = 2354u;
public const val `NERR_MsgAlreadyStarted`: UInt = 2271u;
public const val `NERR_MsgInitFailed`: UInt = 2272u;
public const val `NERR_MsgNotStarted`: UInt = 2284u;
public const val `NERR_MultipleNets`: UInt = 2300u;
public const val `NERR_NameInUse`: UInt = 2283u;
public const val `NERR_NameNotForwarded`: UInt = 2288u;
public const val `NERR_NameNotFound`: UInt = 2273u;
public const val `NERR_NameUsesIncompatibleCodePage`: UInt = 2696u;
public const val `NERR_NetNameNotFound`: UInt = 2310u;
public const val `NERR_NetNotStarted`: UInt = 2102u;
public const val `NERR_NetlogonNotStarted`: UInt = 2455u;
public const val `NERR_NetworkError`: UInt = 2136u;
public const val `NERR_NoAlternateServers`: UInt = 2467u;
public const val `NERR_NoCommDevs`: UInt = 2337u;
public const val `NERR_NoComputerName`: UInt = 2270u;
public const val `NERR_NoForwardName`: UInt = 2286u;
public const val `NERR_NoJoinPending`: UInt = 2714u;
public const val `NERR_NoNetworkResource`: UInt = 2105u;
public const val `NERR_NoOfflineJoinInfo`: UInt = 2709u;
public const val `NERR_NoRoom`: UInt = 2119u;
public const val `NERR_NoRplBootSystem`: UInt = 2505u;
public const val `NERR_NoSuchAlert`: UInt = 2432u;
public const val `NERR_NoSuchConnection`: UInt = 2462u;
public const val `NERR_NoSuchServer`: UInt = 2460u;
public const val `NERR_NoSuchSession`: UInt = 2461u;
public const val `NERR_NonDosFloppyUsed`: UInt = 2510u;
public const val `NERR_NonValidatedLogon`: UInt = 2217u;
public const val `NERR_NotInCache`: UInt = 2235u;
public const val `NERR_NotInDispatchTbl`: UInt = 2192u;
public const val `NERR_NotLocalDomain`: UInt = 2320u;
public const val `NERR_NotLocalName`: UInt = 2285u;
public const val `NERR_NotLoggedOn`: UInt = 2201u;
public const val `NERR_NotPrimary`: UInt = 2226u;
public const val `NERR_OpenFiles`: UInt = 2401u;
public const val `NERR_PasswordCantChange`: UInt = 2243u;
public const val `NERR_PasswordExpired`: UInt = 2242u;
public const val `NERR_PasswordFilterError`: UInt = 2705u;
public const val `NERR_PasswordHistConflict`: UInt = 2244u;
public const val `NERR_PasswordMismatch`: UInt = 2458u;
public const val `NERR_PasswordMustChange`: UInt = 2701u;
public const val `NERR_PasswordNotComplexEnough`: UInt = 2704u;
public const val `NERR_PasswordTooLong`: UInt = 2703u;
public const val `NERR_PasswordTooRecent`: UInt = 2246u;
public const val `NERR_PasswordTooShort`: UInt = 2245u;
public const val `NERR_PausedRemote`: UInt = 2281u;
public const val `NERR_PersonalSku`: UInt = 2698u;
public const val `NERR_PlainTextSecretsRequired`: UInt = 2726u;
public const val `NERR_ProcNoRespond`: UInt = 2160u;
public const val `NERR_ProcNotFound`: UInt = 2168u;
public const val `NERR_ProfileCleanup`: UInt = 2372u;
public const val `NERR_ProfileFileTooBig`: UInt = 2370u;
public const val `NERR_ProfileLoadErr`: UInt = 2374u;
public const val `NERR_ProfileOffset`: UInt = 2371u;
public const val `NERR_ProfileSaveErr`: UInt = 2375u;
public const val `NERR_ProfileUnknownCmd`: UInt = 2373u;
public const val `NERR_ProgNeedsExtraMem`: UInt = 2501u;
public const val `NERR_ProvisioningBlobUnsupported`: UInt = 2719u;
public const val `NERR_QExists`: UInt = 2154u;
public const val `NERR_QInvalidState`: UInt = 2163u;
public const val `NERR_QNoRoom`: UInt = 2155u;
public const val `NERR_QNotFound`: UInt = 2150u;
public const val `NERR_QueueNotFound`: UInt = 2338u;
public const val `NERR_RPL_CONNECTED`: UInt = 2519u;
public const val `NERR_RedirectedPath`: UInt = 2117u;
public const val `NERR_RemoteBootFailed`: UInt = 2503u;
public const val `NERR_RemoteErr`: UInt = 2127u;
public const val `NERR_RemoteFull`: UInt = 2287u;
public const val `NERR_RemoteOnly`: UInt = 2106u;
public const val `NERR_ResourceExists`: UInt = 2225u;
public const val `NERR_ResourceNotFound`: UInt = 2222u;
public const val `NERR_RplAdapterInfoCorrupted`: UInt = 2625u;
public const val `NERR_RplAdapterNameUnavailable`: UInt = 2633u;
public const val `NERR_RplAdapterNotFound`: UInt = 2637u;
public const val `NERR_RplBackupDatabase`: UInt = 2636u;
public const val `NERR_RplBadDatabase`: UInt = 2612u;
public const val `NERR_RplBadRegistry`: UInt = 2611u;
public const val `NERR_RplBootInUse`: UInt = 2635u;
public const val `NERR_RplBootInfoCorrupted`: UInt = 2628u;
public const val `NERR_RplBootNameUnavailable`: UInt = 2640u;
public const val `NERR_RplBootNotFound`: UInt = 2631u;
public const val `NERR_RplBootRestart`: UInt = 2511u;
public const val `NERR_RplBootServiceTerm`: UInt = 2517u;
public const val `NERR_RplBootStartFailed`: UInt = 2518u;
public const val `NERR_RplCannotEnum`: UInt = 2615u;
public const val `NERR_RplConfigInfoCorrupted`: UInt = 2623u;
public const val `NERR_RplConfigNameUnavailable`: UInt = 2641u;
public const val `NERR_RplConfigNotEmpty`: UInt = 2634u;
public const val `NERR_RplConfigNotFound`: UInt = 2624u;
public const val `NERR_RplIncompatibleProfile`: UInt = 2632u;
public const val `NERR_RplInternal`: UInt = 2626u;
public const val `NERR_RplLoadrDiskErr`: UInt = 2507u;
public const val `NERR_RplLoadrNetBiosErr`: UInt = 2506u;
public const val `NERR_RplNeedsRPLUSERAcct`: UInt = 2630u;
public const val `NERR_RplNoAdaptersStarted`: UInt = 2610u;
public const val `NERR_RplNotRplServer`: UInt = 2614u;
public const val `NERR_RplProfileInfoCorrupted`: UInt = 2619u;
public const val `NERR_RplProfileNameUnavailable`: UInt = 2621u;
public const val `NERR_RplProfileNotEmpty`: UInt = 2622u;
public const val `NERR_RplProfileNotFound`: UInt = 2620u;
public const val `NERR_RplRplfilesShare`: UInt = 2613u;
public const val `NERR_RplSrvrCallFailed`: UInt = 2512u;
public const val `NERR_RplVendorInfoCorrupted`: UInt = 2627u;
public const val `NERR_RplVendorNameUnavailable`: UInt = 2639u;
public const val `NERR_RplVendorNotFound`: UInt = 2638u;
public const val `NERR_RplWkstaInfoCorrupted`: UInt = 2616u;
public const val `NERR_RplWkstaNameUnavailable`: UInt = 2618u;
public const val `NERR_RplWkstaNeedsUserAcct`: UInt = 2629u;
public const val `NERR_RplWkstaNotFound`: UInt = 2617u;
public const val `NERR_RunSrvPaused`: UInt = 2385u;
public const val `NERR_SameAsComputerName`: UInt = 2253u;
public const val `NERR_ServerNotStarted`: UInt = 2114u;
public const val `NERR_ServiceCtlBusy`: UInt = 2187u;
public const val `NERR_ServiceCtlNotValid`: UInt = 2191u;
public const val `NERR_ServiceCtlTimeout`: UInt = 2186u;
public const val `NERR_ServiceEntryLocked`: UInt = 2183u;
public const val `NERR_ServiceInstalled`: UInt = 2182u;
public const val `NERR_ServiceKillProc`: UInt = 2190u;
public const val `NERR_ServiceNotCtrl`: UInt = 2189u;
public const val `NERR_ServiceNotInstalled`: UInt = 2184u;
public const val `NERR_ServiceNotStarting`: UInt = 2194u;
public const val `NERR_ServiceTableFull`: UInt = 2181u;
public const val `NERR_ServiceTableLocked`: UInt = 2180u;
public const val `NERR_SetupAlreadyJoined`: UInt = 2691u;
public const val `NERR_SetupCheckDNSConfig`: UInt = 2699u;
public const val `NERR_SetupDomainController`: UInt = 2693u;
public const val `NERR_SetupNotJoined`: UInt = 2692u;
public const val `NERR_ShareMem`: UInt = 2104u;
public const val `NERR_ShareNotFound`: UInt = 2392u;
public const val `NERR_SourceIsDir`: UInt = 2380u;
public const val `NERR_SpeGroupOp`: UInt = 2234u;
public const val `NERR_SpoolNoMemory`: UInt = 2165u;
public const val `NERR_SpoolerNotLoaded`: UInt = 2161u;
public const val `NERR_StandaloneLogon`: UInt = 2214u;
public const val `NERR_StartingRplBoot`: UInt = 2516u;
public const val `NERR_Success`: UInt = 0u;
public const val `NERR_SyncRequired`: UInt = 2249u;
public const val `NERR_TargetVersionUnsupported`: UInt = 2723u;
public const val `NERR_TimeDiffAtDC`: UInt = 2457u;
public const val `NERR_TmpFile`: UInt = 2316u;
public const val `NERR_TooManyAlerts`: UInt = 2431u;
public const val `NERR_TooManyConnections`: UInt = 2465u;
public const val `NERR_TooManyEntries`: UInt = 2362u;
public const val `NERR_TooManyFiles`: UInt = 2466u;
public const val `NERR_TooManyHostNames`: UInt = 2731u;
public const val `NERR_TooManyImageParams`: UInt = 2509u;
public const val `NERR_TooManyItems`: UInt = 2121u;
public const val `NERR_TooManyNames`: UInt = 2277u;
public const val `NERR_TooManyServers`: UInt = 2463u;
public const val `NERR_TooManySessions`: UInt = 2464u;
public const val `NERR_TooMuchData`: UInt = 2317u;
public const val `NERR_TruncatedBroadcast`: UInt = 2289u;
public const val `NERR_TryDownLevel`: UInt = 2470u;
public const val `NERR_UPSDriverNotStarted`: UInt = 2480u;
public const val `NERR_UPSInvalidCommPort`: UInt = 2482u;
public const val `NERR_UPSInvalidConfig`: UInt = 2481u;
public const val `NERR_UPSShutdownFailed`: UInt = 2484u;
public const val `NERR_UPSSignalAsserted`: UInt = 2483u;
public const val `NERR_UnableToAddName_F`: UInt = 2205u;
public const val `NERR_UnableToAddName_W`: UInt = 2204u;
public const val `NERR_UnableToDelName_F`: UInt = 2207u;
public const val `NERR_UnableToDelName_W`: UInt = 2206u;
public const val `NERR_UnknownDevDir`: UInt = 2116u;
public const val `NERR_UnknownServer`: UInt = 2103u;
public const val `NERR_UseNotFound`: UInt = 2250u;
public const val `NERR_UserExists`: UInt = 2224u;
public const val `NERR_UserInGroup`: UInt = 2236u;
public const val `NERR_UserLogon`: UInt = 2231u;
public const val `NERR_UserNotFound`: UInt = 2221u;
public const val `NERR_UserNotInGroup`: UInt = 2237u;
public const val `NERR_ValuesNotSet`: UInt = 2715u;
public const val `NERR_WkstaInconsistentState`: UInt = 2137u;
public const val `NERR_WkstaNotStarted`: UInt = 2138u;
public const val `NERR_WriteFault`: UInt = 2295u;
public const val `NETBIOS_NAME_LEN`: UInt = 16u;
// UNSUPPORTED Rust 2153:1: non-scalar type Ptr unsupported
// pub const NETCFG_CLIENT_CID_MS_MSClient: windows_sys::core::PCWSTR = windows_sys::core::w!("ms_msclient");

public const val `NETCFG_E_ACTIVE_RAS_CONNECTIONS`: Int = -2147180506;
public const val `NETCFG_E_ADAPTER_NOT_FOUND`: Int = -2147180505;
public const val `NETCFG_E_ALREADY_INITIALIZED`: Int = -2147180512;
public const val `NETCFG_E_COMPONENT_REMOVED_PENDING_REBOOT`: Int = -2147180504;
public const val `NETCFG_E_DUPLICATE_INSTANCEID`: Int = -2147180501;
public const val `NETCFG_E_IN_USE`: Int = -2147180510;
public const val `NETCFG_E_MAX_FILTER_LIMIT`: Int = -2147180503;
public const val `NETCFG_E_NEED_REBOOT`: Int = -2147180507;
public const val `NETCFG_E_NOT_INITIALIZED`: Int = -2147180511;
public const val `NETCFG_E_NO_WRITE_LOCK`: Int = -2147180508;
public const val `NETCFG_E_VMSWITCH_ACTIVE_OVER_ADAPTER`: Int = -2147180502;
// UNSUPPORTED Rust 2165:1: non-scalar type Ptr unsupported
// pub const NETCFG_SERVICE_CID_MS_NETBIOS: windows_sys::core::PCWSTR = windows_sys::core::w!("ms_netbios");

// UNSUPPORTED Rust 2166:1: non-scalar type Ptr unsupported
// pub const NETCFG_SERVICE_CID_MS_PSCHED: windows_sys::core::PCWSTR = windows_sys::core::w!("ms_pschedpc");

// UNSUPPORTED Rust 2167:1: non-scalar type Ptr unsupported
// pub const NETCFG_SERVICE_CID_MS_SERVER: windows_sys::core::PCWSTR = windows_sys::core::w!("ms_server");

// UNSUPPORTED Rust 2168:1: non-scalar type Ptr unsupported
// pub const NETCFG_SERVICE_CID_MS_WLBS: windows_sys::core::PCWSTR = windows_sys::core::w!("ms_wlbs");

public const val `NETCFG_S_CAUSED_SETUP_CHANGE`: Int = 303140;
public const val `NETCFG_S_COMMIT_NOW`: Int = 303141;
public const val `NETCFG_S_DISABLE_QUERY`: Int = 303138;
public const val `NETCFG_S_REBOOT`: Int = 303136;
public const val `NETCFG_S_STILL_REFERENCED`: Int = 303139;
// UNSUPPORTED Rust 2174:1: non-scalar type Ptr unsupported
// pub const NETCFG_TRANS_CID_MS_APPLETALK: windows_sys::core::PCWSTR = windows_sys::core::w!("ms_appletalk");

// UNSUPPORTED Rust 2175:1: non-scalar type Ptr unsupported
// pub const NETCFG_TRANS_CID_MS_NETBEUI: windows_sys::core::PCWSTR = windows_sys::core::w!("ms_netbeui");

// UNSUPPORTED Rust 2176:1: non-scalar type Ptr unsupported
// pub const NETCFG_TRANS_CID_MS_NETMON: windows_sys::core::PCWSTR = windows_sys::core::w!("ms_netmon");

// UNSUPPORTED Rust 2177:1: non-scalar type Ptr unsupported
// pub const NETCFG_TRANS_CID_MS_NWIPX: windows_sys::core::PCWSTR = windows_sys::core::w!("ms_nwipx");

// UNSUPPORTED Rust 2178:1: non-scalar type Ptr unsupported
// pub const NETCFG_TRANS_CID_MS_NWSPX: windows_sys::core::PCWSTR = windows_sys::core::w!("ms_nwspx");

// UNSUPPORTED Rust 2179:1: non-scalar type Ptr unsupported
// pub const NETCFG_TRANS_CID_MS_TCPIP: windows_sys::core::PCWSTR = windows_sys::core::w!("ms_tcpip");

public const val `NETLOGON_CONTROL_BACKUP_CHANGE_LOG`: UInt = 65532u;
public const val `NETLOGON_CONTROL_BREAKPOINT`: UInt = 65535u;
public const val `NETLOGON_CONTROL_CHANGE_PASSWORD`: UInt = 9u;
public const val `NETLOGON_CONTROL_FIND_USER`: UInt = 8u;
public const val `NETLOGON_CONTROL_FORCE_DNS_REG`: UInt = 11u;
public const val `NETLOGON_CONTROL_PDC_REPLICATE`: UInt = 4u;
public const val `NETLOGON_CONTROL_QUERY`: UInt = 1u;
public const val `NETLOGON_CONTROL_QUERY_DNS_REG`: UInt = 12u;
public const val `NETLOGON_CONTROL_QUERY_ENC_TYPES`: UInt = 13u;
public const val `NETLOGON_CONTROL_REDISCOVER`: UInt = 5u;
public const val `NETLOGON_CONTROL_REPLICATE`: UInt = 2u;
public const val `NETLOGON_CONTROL_SET_DBFLAG`: UInt = 65534u;
public const val `NETLOGON_CONTROL_SYNCHRONIZE`: UInt = 3u;
public const val `NETLOGON_CONTROL_TC_QUERY`: UInt = 6u;
public const val `NETLOGON_CONTROL_TC_VERIFY`: UInt = 10u;
public const val `NETLOGON_CONTROL_TRANSPORT_NOTIFY`: UInt = 7u;
public const val `NETLOGON_CONTROL_TRUNCATE_LOG`: UInt = 65533u;
public const val `NETLOGON_CONTROL_UNLOAD_NETLOGON_DLL`: UInt = 65531u;
public const val `NETLOGON_DNS_UPDATE_FAILURE`: UInt = 64u;
public const val `NETLOGON_FULL_SYNC_REPLICATION`: UInt = 4u;
public const val `NETLOGON_HAS_IP`: UInt = 16u;
public const val `NETLOGON_HAS_TIMESERV`: UInt = 32u;
// UNSUPPORTED Rust 2202:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NETLOGON_INFO_1 {
//     pub netlog1_flags: u32,
//     pub netlog1_pdc_connection_status: u32,
// }

// UNSUPPORTED Rust 2208:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NETLOGON_INFO_2 {
//     pub netlog2_flags: u32,
//     pub netlog2_pdc_connection_status: u32,
//     pub netlog2_trusted_dc_name: windows_sys::core::PWSTR,
//     pub netlog2_tc_connection_status: u32,
// }

// UNSUPPORTED Rust 2216:1: declaration Impl has no candidate rule
// impl Default for NETLOGON_INFO_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2221:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NETLOGON_INFO_3 {
//     pub netlog3_flags: u32,
//     pub netlog3_logon_attempts: u32,
//     pub netlog3_reserved1: u32,
//     pub netlog3_reserved2: u32,
//     pub netlog3_reserved3: u32,
//     pub netlog3_reserved4: u32,
//     pub netlog3_reserved5: u32,
// }

// UNSUPPORTED Rust 2232:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NETLOGON_INFO_4 {
//     pub netlog4_trusted_dc_name: windows_sys::core::PWSTR,
//     pub netlog4_trusted_domain_name: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2238:1: declaration Impl has no candidate rule
// impl Default for NETLOGON_INFO_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NETLOGON_REDO_NEEDED`: UInt = 8u;
public const val `NETLOGON_REPLICATION_IN_PROGRESS`: UInt = 2u;
public const val `NETLOGON_REPLICATION_NEEDED`: UInt = 1u;
public const val `NETLOGON_VERIFY_STATUS_RETURNED`: UInt = 128u;
public const val `NETLOG_NetlogonNonWindowsSupportsSecureRpc`: UInt = 5826u;
public const val `NETLOG_NetlogonRc4Allowed`: UInt = 5840u;
public const val `NETLOG_NetlogonRc4Denied`: UInt = 5841u;
public const val `NETLOG_NetlogonRpcBacklogLimitFailure`: UInt = 5837u;
public const val `NETLOG_NetlogonRpcBacklogLimitSet`: UInt = 5836u;
public const val `NETLOG_NetlogonRpcSigningClient`: UInt = 5838u;
public const val `NETLOG_NetlogonRpcSigningTrust`: UInt = 5839u;
public const val `NETLOG_NetlogonUnsecureRpcClient`: UInt = 5827u;
public const val `NETLOG_NetlogonUnsecureRpcMachineAllowedBySsdl`: UInt = 5830u;
public const val `NETLOG_NetlogonUnsecureRpcTrust`: UInt = 5828u;
public const val `NETLOG_NetlogonUnsecureRpcTrustAllowedBySsdl`: UInt = 5831u;
public const val `NETLOG_NetlogonUnsecuredRpcMachineTemporarilyAllowed`: UInt = 5829u;
public const val `NETLOG_PassThruFilterError_Request_AdminOverride`: UInt = 5834u;
public const val `NETLOG_PassThruFilterError_Request_Blocked`: UInt = 5835u;
public const val `NETLOG_PassThruFilterError_Summary_AdminOverride`: UInt = 5832u;
public const val `NETLOG_PassThruFilterError_Summary_Blocked`: UInt = 5833u;
public const val `NETMAN_VARTYPE_HARDWARE_ADDRESS`: UInt = 1u;
public const val `NETMAN_VARTYPE_STRING`: UInt = 2u;
public const val `NETMAN_VARTYPE_ULONG`: UInt = 0u;
public const val `NETSETUP_ACCT_CREATE`: `NET_JOIN_DOMAIN_JOIN_OPTIONS` = 2u;
public const val `NETSETUP_ACCT_DELETE`: UInt = 4u;
public const val `NETSETUP_ALT_SAMACCOUNTNAME`: UInt = 131072u;
public const val `NETSETUP_AMBIGUOUS_DC`: `NET_JOIN_DOMAIN_JOIN_OPTIONS` = 4096u;
public const val `NETSETUP_DEFER_SPN_SET`: `NET_JOIN_DOMAIN_JOIN_OPTIONS` = 256u;
public const val `NETSETUP_DNS_NAME_CHANGES_ONLY`: UInt = 4096u;
public const val `NETSETUP_DOMAIN_JOIN_IF_JOINED`: `NET_JOIN_DOMAIN_JOIN_OPTIONS` = 32u;
public const val `NETSETUP_DONT_CONTROL_SERVICES`: `NET_JOIN_DOMAIN_JOIN_OPTIONS` = 16384u;
public const val `NETSETUP_FORCE_SPN_SET`: `NET_JOIN_DOMAIN_JOIN_OPTIONS` = 65536u;
public const val `NETSETUP_IGNORE_UNSUPPORTED_FLAGS`: `NET_JOIN_DOMAIN_JOIN_OPTIONS` = 268435456u;
public const val `NETSETUP_INSTALL_INVOCATION`: UInt = 262144u;
public const val `NETSETUP_JOIN_DC_ACCOUNT`: `NET_JOIN_DOMAIN_JOIN_OPTIONS` = 512u;
public const val `NETSETUP_JOIN_DOMAIN`: `NET_JOIN_DOMAIN_JOIN_OPTIONS` = 1u;
public const val `NETSETUP_JOIN_READONLY`: `NET_JOIN_DOMAIN_JOIN_OPTIONS` = 2048u;
public typealias `NETSETUP_JOIN_STATUS` = Int;
public const val `NETSETUP_JOIN_UNSECURE`: `NET_JOIN_DOMAIN_JOIN_OPTIONS` = 64u;
public const val `NETSETUP_JOIN_WITH_NEW_NAME`: `NET_JOIN_DOMAIN_JOIN_OPTIONS` = 1024u;
public const val `NETSETUP_MACHINE_PWD_PASSED`: `NET_JOIN_DOMAIN_JOIN_OPTIONS` = 128u;
public typealias `NETSETUP_NAME_TYPE` = Int;
public const val `NETSETUP_NO_ACCT_REUSE`: `NET_JOIN_DOMAIN_JOIN_OPTIONS` = 131072u;
public const val `NETSETUP_NO_NETLOGON_CACHE`: `NET_JOIN_DOMAIN_JOIN_OPTIONS` = 8192u;
public typealias `NETSETUP_PROVISION` = UInt;
// UNSUPPORTED Rust 2288:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NETSETUP_PROVISIONING_PARAMS {
//     pub dwVersion: u32,
//     pub lpDomain: windows_sys::core::PCWSTR,
//     pub lpHostName: windows_sys::core::PCWSTR,
//     pub lpMachineAccountOU: windows_sys::core::PCWSTR,
//     pub lpDcName: windows_sys::core::PCWSTR,
//     pub dwProvisionOptions: NETSETUP_PROVISION,
//     pub aCertTemplateNames: *const windows_sys::core::PCWSTR,
//     pub cCertTemplateNames: u32,
//     pub aMachinePolicyNames: *const windows_sys::core::PCWSTR,
//     pub cMachinePolicyNames: u32,
//     pub aMachinePolicyPaths: *const windows_sys::core::PCWSTR,
//     pub cMachinePolicyPaths: u32,
//     pub lpNetbiosName: windows_sys::core::PWSTR,
//     pub lpSiteName: windows_sys::core::PWSTR,
//     pub lpPrimaryDNSDomain: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2307:1: declaration Impl has no candidate rule
// impl Default for NETSETUP_PROVISIONING_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NETSETUP_PROVISIONING_PARAMS_CURRENT_VERSION`: UInt = 2u;
public const val `NETSETUP_PROVISIONING_PARAMS_WIN8_VERSION`: UInt = 1u;
public const val `NETSETUP_PROVISION_CHECK_PWD_ONLY`: UInt = 2147483648u;
public const val `NETSETUP_PROVISION_DOWNLEVEL_PRIV_SUPPORT`: `NETSETUP_PROVISION` = 1u;
public const val `NETSETUP_PROVISION_ONLINE_CALLER`: `NET_REQUEST_PROVISION_OPTIONS` = 1073741824u;
public const val `NETSETUP_PROVISION_PERSISTENTSITE`: UInt = 32u;
public const val `NETSETUP_PROVISION_REUSE_ACCOUNT`: `NETSETUP_PROVISION` = 2u;
public const val `NETSETUP_PROVISION_ROOT_CA_CERTS`: `NETSETUP_PROVISION` = 16u;
public const val `NETSETUP_PROVISION_SKIP_ACCOUNT_SEARCH`: `NETSETUP_PROVISION` = 8u;
public const val `NETSETUP_PROVISION_USE_DEFAULT_PASSWORD`: `NETSETUP_PROVISION` = 4u;
public const val `NETSETUP_SET_MACHINE_NAME`: `NET_JOIN_DOMAIN_JOIN_OPTIONS` = 32768u;
public const val `NETSETUP_WIN9X_UPGRADE`: `NET_JOIN_DOMAIN_JOIN_OPTIONS` = 16u;
public typealias `NETWORK_INSTALL_TIME` = Int;
// UNSUPPORTED Rust 2325:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NETWORK_NAME {
//     pub Name: FLAT_STRING,
// }

public typealias `NETWORK_UPGRADE_TYPE` = Int;
public typealias `NET_COMPUTER_NAME_TYPE` = Int;
public const val `NET_DFS_ENUM`: Int = 1073756324;
public const val `NET_DFS_ENUMEX`: Int = 1073756325;
// UNSUPPORTED Rust 2334:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NET_DISPLAY_GROUP {
//     pub grpi3_name: windows_sys::core::PWSTR,
//     pub grpi3_comment: windows_sys::core::PWSTR,
//     pub grpi3_group_id: u32,
//     pub grpi3_attributes: u32,
//     pub grpi3_next_index: u32,
// }

// UNSUPPORTED Rust 2343:1: declaration Impl has no candidate rule
// impl Default for NET_DISPLAY_GROUP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2348:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NET_DISPLAY_MACHINE {
//     pub usri2_name: windows_sys::core::PWSTR,
//     pub usri2_comment: windows_sys::core::PWSTR,
//     pub usri2_flags: USER_ACCOUNT_FLAGS,
//     pub usri2_user_id: u32,
//     pub usri2_next_index: u32,
// }

// UNSUPPORTED Rust 2357:1: declaration Impl has no candidate rule
// impl Default for NET_DISPLAY_MACHINE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2362:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NET_DISPLAY_USER {
//     pub usri1_name: windows_sys::core::PWSTR,
//     pub usri1_comment: windows_sys::core::PWSTR,
//     pub usri1_flags: USER_ACCOUNT_FLAGS,
//     pub usri1_full_name: windows_sys::core::PWSTR,
//     pub usri1_user_id: u32,
//     pub usri1_next_index: u32,
// }

// UNSUPPORTED Rust 2372:1: declaration Impl has no candidate rule
// impl Default for NET_DISPLAY_USER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NET_IGNORE_UNSUPPORTED_FLAGS`: UInt = 1u;
public typealias `NET_JOIN_DOMAIN_JOIN_OPTIONS` = UInt;
public typealias `NET_REMOTE_COMPUTER_SUPPORTS_OPTIONS` = UInt;
public typealias `NET_REQUEST_PROVISION_OPTIONS` = UInt;
public typealias `NET_SERVER_TYPE` = UInt;
public typealias `NET_USER_ENUM_FILTER_FLAGS` = UInt;
// UNSUPPORTED Rust 2383:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NET_VALIDATE_AUTHENTICATION_INPUT_ARG {
//     pub InputPersistedFields: NET_VALIDATE_PERSISTED_FIELDS,
//     pub PasswordMatched: bool,
// }

public const val `NET_VALIDATE_BAD_PASSWORD_COUNT`: UInt = 8u;
public const val `NET_VALIDATE_BAD_PASSWORD_TIME`: UInt = 2u;
public const val `NET_VALIDATE_LOCKOUT_TIME`: UInt = 4u;
// UNSUPPORTED Rust 2392:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NET_VALIDATE_OUTPUT_ARG {
//     pub ChangedPersistedFields: NET_VALIDATE_PERSISTED_FIELDS,
//     pub ValidationStatus: u32,
// }

// UNSUPPORTED Rust 2398:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NET_VALIDATE_PASSWORD_CHANGE_INPUT_ARG {
//     pub InputPersistedFields: NET_VALIDATE_PERSISTED_FIELDS,
//     pub ClearPassword: windows_sys::core::PWSTR,
//     pub UserAccountName: windows_sys::core::PWSTR,
//     pub HashedPassword: NET_VALIDATE_PASSWORD_HASH,
//     pub PasswordMatch: bool,
// }

// UNSUPPORTED Rust 2407:1: declaration Impl has no candidate rule
// impl Default for NET_VALIDATE_PASSWORD_CHANGE_INPUT_ARG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2412:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NET_VALIDATE_PASSWORD_HASH {
//     pub Length: u32,
//     pub Hash: *mut u8,
// }

// UNSUPPORTED Rust 2418:1: declaration Impl has no candidate rule
// impl Default for NET_VALIDATE_PASSWORD_HASH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NET_VALIDATE_PASSWORD_HISTORY`: UInt = 32u;
public const val `NET_VALIDATE_PASSWORD_HISTORY_LENGTH`: UInt = 16u;
public const val `NET_VALIDATE_PASSWORD_LAST_SET`: UInt = 1u;
// UNSUPPORTED Rust 2426:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NET_VALIDATE_PASSWORD_RESET_INPUT_ARG {
//     pub InputPersistedFields: NET_VALIDATE_PERSISTED_FIELDS,
//     pub ClearPassword: windows_sys::core::PWSTR,
//     pub UserAccountName: windows_sys::core::PWSTR,
//     pub HashedPassword: NET_VALIDATE_PASSWORD_HASH,
//     pub PasswordMustChangeAtNextLogon: bool,
//     pub ClearLockout: bool,
// }

// UNSUPPORTED Rust 2436:1: declaration Impl has no candidate rule
// impl Default for NET_VALIDATE_PASSWORD_RESET_INPUT_ARG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NET_VALIDATE_PASSWORD_TYPE` = Int;
// UNSUPPORTED Rust 2442:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NET_VALIDATE_PERSISTED_FIELDS {
//     pub PresentFields: u32,
//     pub PasswordLastSet: super::super::Foundation::FILETIME,
//     pub BadPasswordTime: super::super::Foundation::FILETIME,
//     pub LockoutTime: super::super::Foundation::FILETIME,
//     pub BadPasswordCount: u32,
//     pub PasswordHistoryLength: u32,
//     pub PasswordHistory: *mut NET_VALIDATE_PASSWORD_HASH,
// }

// UNSUPPORTED Rust 2453:1: declaration Impl has no candidate rule
// impl Default for NET_VALIDATE_PERSISTED_FIELDS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NON_VALIDATED_LOGON`: UInt = 3u;
public const val `NOT_A_DFS_PATH`: Int = 1073756224;
public const val `NO_PERMISSION_REQUIRED`: UInt = 1u;
public const val `NSF_COMPONENT_UPDATE`: `NETWORK_UPGRADE_TYPE` = 512;
public const val `NSF_POSTSYSINSTALL`: `NETWORK_INSTALL_TIME` = 2;
public const val `NSF_PRIMARYINSTALL`: `NETWORK_INSTALL_TIME` = 1;
public const val `NSF_WIN16_UPGRADE`: `NETWORK_UPGRADE_TYPE` = 16;
public const val `NSF_WIN95_UPGRADE`: `NETWORK_UPGRADE_TYPE` = 32;
public const val `NSF_WINNT_SBS_UPGRADE`: `NETWORK_UPGRADE_TYPE` = 256;
public const val `NSF_WINNT_SVR_UPGRADE`: `NETWORK_UPGRADE_TYPE` = 128;
public const val `NSF_WINNT_WKS_UPGRADE`: `NETWORK_UPGRADE_TYPE` = 64;
public const val `NTFRSPRF_COLLECT_RPC_BINDING_ERROR_CONN`: Int = -1073728292;
public const val `NTFRSPRF_COLLECT_RPC_BINDING_ERROR_SET`: Int = -1073728293;
public const val `NTFRSPRF_COLLECT_RPC_CALL_ERROR_CONN`: Int = -1073728290;
public const val `NTFRSPRF_COLLECT_RPC_CALL_ERROR_SET`: Int = -1073728291;
public const val `NTFRSPRF_OPEN_RPC_BINDING_ERROR_CONN`: Int = -1073728296;
public const val `NTFRSPRF_OPEN_RPC_BINDING_ERROR_SET`: Int = -1073728297;
public const val `NTFRSPRF_OPEN_RPC_CALL_ERROR_CONN`: Int = -1073728294;
public const val `NTFRSPRF_OPEN_RPC_CALL_ERROR_SET`: Int = -1073728295;
public const val `NTFRSPRF_REGISTRY_ERROR_CONN`: Int = -1073728286;
public const val `NTFRSPRF_REGISTRY_ERROR_SET`: Int = -1073728287;
public const val `NTFRSPRF_VIRTUALALLOC_ERROR_CONN`: Int = -1073728288;
public const val `NTFRSPRF_VIRTUALALLOC_ERROR_SET`: Int = -1073728289;
// UNSUPPORTED Rust 2481:1: non-scalar type Ptr unsupported
// pub const NULL_USERSETINFO_PASSWD: windows_sys::core::PCSTR = windows_sys::core::s!("              ");

// UNSUPPORTED Rust 2482:1: non-scalar type Ptr unsupported
// pub const NWSAP_DISPLAY_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("NW Sap Agent");

public const val `NWSAP_EVENT_BADWANFILTER_VALUE`: Int = -1073733302;
public const val `NWSAP_EVENT_BIND_FAILED`: Int = -1073733320;
public const val `NWSAP_EVENT_CARDLISTEVENT_FAIL`: Int = -1073733301;
public const val `NWSAP_EVENT_CARDMALLOC_FAILED`: Int = -1073733316;
public const val `NWSAP_EVENT_CREATELPCEVENT_ERROR`: Int = -1073733305;
public const val `NWSAP_EVENT_CREATELPCPORT_ERROR`: Int = -1073733306;
public const val `NWSAP_EVENT_GETSOCKNAME_FAILED`: Int = -1073733319;
public const val `NWSAP_EVENT_HASHTABLE_MALLOC_FAILED`: Int = -1073733308;
public const val `NWSAP_EVENT_INVALID_FILTERNAME`: Int = -2147475123;
public const val `NWSAP_EVENT_KEY_NOT_FOUND`: Int = -1073733324;
public const val `NWSAP_EVENT_LPCHANDLEMEMORY_ERROR`: Int = -1073733303;
public const val `NWSAP_EVENT_LPCLISTENMEMORY_ERROR`: Int = -1073733304;
public const val `NWSAP_EVENT_NOCARDS`: Int = -1073733315;
public const val `NWSAP_EVENT_OPTBCASTINADDR_FAILED`: Int = -1073733317;
public const val `NWSAP_EVENT_OPTEXTENDEDADDR_FAILED`: Int = -1073733318;
public const val `NWSAP_EVENT_OPTMAXADAPTERNUM_ERROR`: Int = -1073733293;
public const val `NWSAP_EVENT_RECVSEM_FAIL`: Int = -1073733313;
public const val `NWSAP_EVENT_SDMDEVENT_FAIL`: Int = -1073733300;
public const val `NWSAP_EVENT_SENDEVENT_FAIL`: Int = -1073733312;
public const val `NWSAP_EVENT_SETOPTBCAST_FAILED`: Int = -1073733321;
public const val `NWSAP_EVENT_SOCKET_FAILED`: Int = -1073733322;
public const val `NWSAP_EVENT_STARTLPCWORKER_ERROR`: Int = -1073733307;
public const val `NWSAP_EVENT_STARTRECEIVE_ERROR`: Int = -1073733311;
public const val `NWSAP_EVENT_STARTWANCHECK_ERROR`: Int = -1073733294;
public const val `NWSAP_EVENT_STARTWANWORKER_ERROR`: Int = -1073733295;
public const val `NWSAP_EVENT_STARTWORKER_ERROR`: Int = -1073733310;
public const val `NWSAP_EVENT_TABLE_MALLOC_FAILED`: Int = -1073733309;
public const val `NWSAP_EVENT_THREADEVENT_FAIL`: Int = -1073733314;
public const val `NWSAP_EVENT_WANBIND_FAILED`: Int = -1073733296;
public const val `NWSAP_EVENT_WANEVENT_ERROR`: Int = -1073733291;
public const val `NWSAP_EVENT_WANHANDLEMEMORY_ERROR`: Int = -1073733292;
public const val `NWSAP_EVENT_WANSEM_FAIL`: Int = -1073733298;
public const val `NWSAP_EVENT_WANSOCKET_FAILED`: Int = -1073733297;
public const val `NWSAP_EVENT_WSASTARTUP_FAILED`: Int = -1073733323;
public const val `NetAllComputerNames`: `NET_COMPUTER_NAME_TYPE` = 2;
public const val `NetAlternateComputerNames`: `NET_COMPUTER_NAME_TYPE` = 1;
public const val `NetComputerNameTypeMax`: `NET_COMPUTER_NAME_TYPE` = 3;
public const val `NetPrimaryComputerName`: `NET_COMPUTER_NAME_TYPE` = 0;
// UNSUPPORTED Rust 2521:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NetProvisioning: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2aa2b5fe_b846_4d07_810c_b21ee45320e3);

public const val `NetSetupDnsMachine`: `NETSETUP_NAME_TYPE` = 5;
public const val `NetSetupDomain`: `NETSETUP_NAME_TYPE` = 3;
public const val `NetSetupDomainName`: `NETSETUP_JOIN_STATUS` = 3;
public const val `NetSetupMachine`: `NETSETUP_NAME_TYPE` = 1;
public const val `NetSetupNonExistentDomain`: `NETSETUP_NAME_TYPE` = 4;
public const val `NetSetupUnjoined`: `NETSETUP_JOIN_STATUS` = 1;
public const val `NetSetupUnknown`: `NETSETUP_NAME_TYPE` = 0;
public const val `NetSetupUnknownStatus`: `NETSETUP_JOIN_STATUS` = 0;
public const val `NetSetupWorkgroup`: `NETSETUP_NAME_TYPE` = 2;
public const val `NetSetupWorkgroupName`: `NETSETUP_JOIN_STATUS` = 2;
public const val `NetValidateAuthentication`: `NET_VALIDATE_PASSWORD_TYPE` = 1;
public const val `NetValidatePasswordChange`: `NET_VALIDATE_PASSWORD_TYPE` = 2;
public const val `NetValidatePasswordReset`: `NET_VALIDATE_PASSWORD_TYPE` = 3;
public const val `OBO_COMPONENT`: `OBO_TOKEN_TYPE` = 2;
public const val `OBO_SOFTWARE`: `OBO_TOKEN_TYPE` = 3;
// UNSUPPORTED Rust 2537:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OBO_TOKEN {
//     pub Type: OBO_TOKEN_TYPE,
//     pub pncc: *mut core::ffi::c_void,
//     pub pszwManufacturer: windows_sys::core::PCWSTR,
//     pub pszwProduct: windows_sys::core::PCWSTR,
//     pub pszwDisplayName: windows_sys::core::PCWSTR,
//     pub fRegistered: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 2547:1: declaration Impl has no candidate rule
// impl Default for OBO_TOKEN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `OBO_TOKEN_TYPE` = Int;
public const val `OBO_USER`: `OBO_TOKEN_TYPE` = 1;
// UNSUPPORTED Rust 2554:1: non-scalar type Ptr unsupported
// pub const OS2MSG_FILENAME: windows_sys::core::PCWSTR = windows_sys::core::w!("BASE");

public const val `PARMNUM_ALL`: UInt = 0u;
public const val `PARMNUM_BASE_INFOLEVEL`: UInt = 1000u;
public const val `PARM_ERROR_NONE`: UInt = 0u;
public const val `PARM_ERROR_UNKNOWN`: UInt = 4294967295u;
public const val `PASSWORD_EXPIRED`: UInt = 2u;
public const val `PATHLEN`: UInt = 256u;
public const val `PLATFORM_ID_DOS`: UInt = 300u;
public const val `PLATFORM_ID_NT`: UInt = 500u;
public const val `PLATFORM_ID_OS2`: UInt = 400u;
public const val `PLATFORM_ID_OSF`: UInt = 600u;
public const val `PLATFORM_ID_VMS`: UInt = 700u;
public const val `PREFIX_MISMATCH`: Int = -1073727510;
public const val `PREFIX_MISMATCH_FIXED`: Int = -1073727509;
public const val `PREFIX_MISMATCH_NOT_FIXED`: Int = -1073727508;
// UNSUPPORTED Rust 2569:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PRINT_OTHER_INFO {
//     pub alrtpr_jobid: u32,
//     pub alrtpr_status: u32,
//     pub alrtpr_submitted: u32,
//     pub alrtpr_size: u32,
// }

public const val `PRJOB_COMPLETE`: UInt = 4u;
public const val `PRJOB_DELETED`: UInt = 32768u;
public const val `PRJOB_DESTNOPAPER`: UInt = 256u;
public const val `PRJOB_DESTOFFLINE`: UInt = 32u;
public const val `PRJOB_DESTPAUSED`: UInt = 64u;
public const val `PRJOB_DEVSTATUS`: UInt = 508u;
public const val `PRJOB_ERROR`: UInt = 16u;
public const val `PRJOB_INTERV`: UInt = 8u;
public const val `PRJOB_NOTIFY`: UInt = 128u;
public const val `PRJOB_QSTATUS`: UInt = 3u;
public const val `PRJOB_QS_PAUSED`: UInt = 1u;
public const val `PRJOB_QS_PRINTING`: UInt = 3u;
public const val `PRJOB_QS_QUEUED`: UInt = 0u;
public const val `PRJOB_QS_SPOOLING`: UInt = 2u;
public const val `PROTO_IPV6_DHCP`: UInt = 999u;
public const val `PROTO_IP_ALG`: UInt = 10010u;
public const val `PROTO_IP_BGMP`: UInt = 11u;
public const val `PROTO_IP_BOOTP`: UInt = 9999u;
public const val `PROTO_IP_DHCP_ALLOCATOR`: UInt = 10004u;
public const val `PROTO_IP_DIFFSERV`: UInt = 10008u;
public const val `PROTO_IP_DNS_PROXY`: UInt = 10003u;
public const val `PROTO_IP_DTP`: UInt = 10013u;
public const val `PROTO_IP_FTP`: UInt = 10012u;
public const val `PROTO_IP_H323`: UInt = 10011u;
public const val `PROTO_IP_IGMP`: UInt = 10u;
public const val `PROTO_IP_MGM`: UInt = 10009u;
public const val `PROTO_IP_MSDP`: UInt = 9u;
public const val `PROTO_IP_NAT`: UInt = 10005u;
public const val `PROTO_IP_VRRP`: UInt = 112u;
public const val `PROTO_TYPE_MCAST`: UInt = 1u;
public const val `PROTO_TYPE_MS0`: UInt = 2u;
public const val `PROTO_TYPE_MS1`: UInt = 3u;
public const val `PROTO_TYPE_UCAST`: UInt = 0u;
public const val `PROTO_VENDOR_MS0`: UInt = 0u;
public const val `PROTO_VENDOR_MS1`: UInt = 311u;
public const val `PROTO_VENDOR_MS2`: UInt = 16383u;
public const val `PWLEN`: UInt = 256u;
public const val `QNLEN`: UInt = 80u;
// UNSUPPORTED Rust 2615:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASCON_IPUI {
//     pub guidConnection: windows_sys::core::GUID,
//     pub fIPv6Cfg: windows_sys::core::BOOL,
//     pub dwFlags: u32,
//     pub pszwIpAddr: [u16; 16],
//     pub pszwDnsAddr: [u16; 16],
//     pub pszwDns2Addr: [u16; 16],
//     pub pszwWinsAddr: [u16; 16],
//     pub pszwWins2Addr: [u16; 16],
//     pub pszwDnsSuffix: [u16; 256],
//     pub pszwIpv6Addr: [u16; 65],
//     pub dwIpv6PrefixLength: u32,
//     pub pszwIpv6DnsAddr: [u16; 65],
//     pub pszwIpv6Dns2Addr: [u16; 65],
//     pub dwIPv4InfMetric: u32,
//     pub dwIPv6InfMetric: u32,
// }

// UNSUPPORTED Rust 2634:1: declaration Impl has no candidate rule
// impl Default for RASCON_IPUI {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RASCON_UIINFO_FLAGS` = Int;
public const val `RCUIF_DEMAND_DIAL`: `RASCON_UIINFO_FLAGS` = 2;
public const val `RCUIF_DISABLE_CLASS_BASED_ROUTE`: `RASCON_UIINFO_FLAGS` = 32768;
public const val `RCUIF_ENABLE_NBT`: `RASCON_UIINFO_FLAGS` = 1024;
public const val `RCUIF_NOT_ADMIN`: `RASCON_UIINFO_FLAGS` = 4;
public const val `RCUIF_USE_DISABLE_REGISTER_DNS`: `RASCON_UIINFO_FLAGS` = 256;
public const val `RCUIF_USE_HEADER_COMPRESSION`: `RASCON_UIINFO_FLAGS` = 128;
public const val `RCUIF_USE_IPv4_EXPLICIT_METRIC`: `RASCON_UIINFO_FLAGS` = 64;
public const val `RCUIF_USE_IPv4_NAME_SERVERS`: `RASCON_UIINFO_FLAGS` = 16;
public const val `RCUIF_USE_IPv4_REMOTE_GATEWAY`: `RASCON_UIINFO_FLAGS` = 32;
public const val `RCUIF_USE_IPv4_STATICADDRESS`: `RASCON_UIINFO_FLAGS` = 8;
public const val `RCUIF_USE_IPv6_EXPLICIT_METRIC`: `RASCON_UIINFO_FLAGS` = 16384;
public const val `RCUIF_USE_IPv6_NAME_SERVERS`: `RASCON_UIINFO_FLAGS` = 4096;
public const val `RCUIF_USE_IPv6_REMOTE_GATEWAY`: `RASCON_UIINFO_FLAGS` = 8192;
public const val `RCUIF_USE_IPv6_STATICADDRESS`: `RASCON_UIINFO_FLAGS` = 2048;
public const val `RCUIF_USE_PRIVATE_DNS_SUFFIX`: `RASCON_UIINFO_FLAGS` = 512;
public const val `RCUIF_VPN`: `RASCON_UIINFO_FLAGS` = 1;
// UNSUPPORTED Rust 2656:1: non-scalar type Ptr unsupported
// pub const REGISTER_PROTOCOL_ENTRY_POINT_STRING: windows_sys::core::PCSTR = windows_sys::core::s!("RegisterProtocol");

// UNSUPPORTED Rust 2657:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REPL_EDIR_INFO_0 {
//     pub rped0_dirname: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2662:1: declaration Impl has no candidate rule
// impl Default for REPL_EDIR_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2667:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REPL_EDIR_INFO_1 {
//     pub rped1_dirname: windows_sys::core::PWSTR,
//     pub rped1_integrity: u32,
//     pub rped1_extent: u32,
// }

// UNSUPPORTED Rust 2674:1: declaration Impl has no candidate rule
// impl Default for REPL_EDIR_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2679:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct REPL_EDIR_INFO_1000 {
//     pub rped1000_integrity: u32,
// }

// UNSUPPORTED Rust 2684:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct REPL_EDIR_INFO_1001 {
//     pub rped1001_extent: u32,
// }

// UNSUPPORTED Rust 2689:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REPL_EDIR_INFO_2 {
//     pub rped2_dirname: windows_sys::core::PWSTR,
//     pub rped2_integrity: u32,
//     pub rped2_extent: u32,
//     pub rped2_lockcount: u32,
//     pub rped2_locktime: u32,
// }

// UNSUPPORTED Rust 2698:1: declaration Impl has no candidate rule
// impl Default for REPL_EDIR_INFO_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `REPL_EXPORT_EXTENT_INFOLEVEL`: UInt = 1001u;
public const val `REPL_EXPORT_INTEGRITY_INFOLEVEL`: UInt = 1000u;
public const val `REPL_EXTENT_FILE`: UInt = 1u;
public const val `REPL_EXTENT_TREE`: UInt = 2u;
public const val `REPL_GUARDTIME_INFOLEVEL`: UInt = 1002u;
// UNSUPPORTED Rust 2708:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REPL_IDIR_INFO_0 {
//     pub rpid0_dirname: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2713:1: declaration Impl has no candidate rule
// impl Default for REPL_IDIR_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2718:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REPL_IDIR_INFO_1 {
//     pub rpid1_dirname: windows_sys::core::PWSTR,
//     pub rpid1_state: u32,
//     pub rpid1_mastername: windows_sys::core::PWSTR,
//     pub rpid1_last_update_time: u32,
//     pub rpid1_lockcount: u32,
//     pub rpid1_locktime: u32,
// }

// UNSUPPORTED Rust 2728:1: declaration Impl has no candidate rule
// impl Default for REPL_IDIR_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2733:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REPL_INFO_0 {
//     pub rp0_role: u32,
//     pub rp0_exportpath: windows_sys::core::PWSTR,
//     pub rp0_exportlist: windows_sys::core::PWSTR,
//     pub rp0_importpath: windows_sys::core::PWSTR,
//     pub rp0_importlist: windows_sys::core::PWSTR,
//     pub rp0_logonusername: windows_sys::core::PWSTR,
//     pub rp0_interval: u32,
//     pub rp0_pulse: u32,
//     pub rp0_guardtime: u32,
//     pub rp0_random: u32,
// }

// UNSUPPORTED Rust 2747:1: declaration Impl has no candidate rule
// impl Default for REPL_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2752:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct REPL_INFO_1000 {
//     pub rp1000_interval: u32,
// }

// UNSUPPORTED Rust 2757:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct REPL_INFO_1001 {
//     pub rp1001_pulse: u32,
// }

// UNSUPPORTED Rust 2762:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct REPL_INFO_1002 {
//     pub rp1002_guardtime: u32,
// }

// UNSUPPORTED Rust 2767:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct REPL_INFO_1003 {
//     pub rp1003_random: u32,
// }

public const val `REPL_INTEGRITY_FILE`: UInt = 1u;
public const val `REPL_INTEGRITY_TREE`: UInt = 2u;
public const val `REPL_INTERVAL_INFOLEVEL`: UInt = 1000u;
public const val `REPL_PULSE_INFOLEVEL`: UInt = 1001u;
public const val `REPL_RANDOM_INFOLEVEL`: UInt = 1003u;
public const val `REPL_ROLE_BOTH`: UInt = 3u;
public const val `REPL_ROLE_EXPORT`: UInt = 1u;
public const val `REPL_ROLE_IMPORT`: UInt = 2u;
public const val `REPL_STATE_NEVER_REPLICATED`: UInt = 3u;
public const val `REPL_STATE_NO_MASTER`: UInt = 1u;
public const val `REPL_STATE_NO_SYNC`: UInt = 2u;
public const val `REPL_STATE_OK`: UInt = 0u;
public const val `REPL_UNLOCK_FORCE`: UInt = 1u;
public const val `REPL_UNLOCK_NOFORCE`: UInt = 0u;
public const val `RF_ADD_ALL_INTERFACES`: UInt = 16u;
public const val `RF_DEMAND_UPDATE_ROUTES`: UInt = 4u;
public const val `RF_MULTICAST`: UInt = 32u;
public const val `RF_POWER`: UInt = 64u;
public const val `RF_ROUTING`: UInt = 1u;
public const val `RF_ROUTINGV6`: UInt = 2u;
public const val `RIS_INTERFACE_ADDRESS_CHANGE`: UInt = 0u;
public const val `RIS_INTERFACE_DISABLED`: UInt = 2u;
public const val `RIS_INTERFACE_ENABLED`: UInt = 1u;
public const val `RIS_INTERFACE_MEDIA_ABSENT`: UInt = 4u;
public const val `RIS_INTERFACE_MEDIA_PRESENT`: UInt = 3u;
public const val `ROUTING_DOMAIN_INFO_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2798:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RTR_INFO_BLOCK_HEADER {
//     pub Version: u32,
//     pub Size: u32,
//     pub TocEntriesCount: u32,
//     pub TocEntry: [RTR_TOC_ENTRY; 1],
// }

// UNSUPPORTED Rust 2806:1: declaration Impl has no candidate rule
// impl Default for RTR_INFO_BLOCK_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RTR_INFO_BLOCK_VERSION`: UInt = 1u;
// UNSUPPORTED Rust 2812:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RTR_TOC_ENTRY {
//     pub InfoType: u32,
//     pub InfoSize: u32,
//     pub Count: u32,
//     pub Offset: u32,
// }

public const val `RTUTILS_MAX_PROTOCOL_DLL_LEN`: UInt = 48u;
public const val `RTUTILS_MAX_PROTOCOL_NAME_LEN`: UInt = 40u;
// UNSUPPORTED Rust 2822:1: non-scalar type Ptr unsupported
// pub const SERVCE_LM20_W32TIME: windows_sys::core::PCWSTR = windows_sys::core::w!("w32time");

// UNSUPPORTED Rust 2823:1: non-scalar type Ptr unsupported
// pub const SERVER_DISPLAY_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Server");

// UNSUPPORTED Rust 2824:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVER_INFO_100 {
//     pub sv100_platform_id: u32,
//     pub sv100_name: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2830:1: declaration Impl has no candidate rule
// impl Default for SERVER_INFO_100 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2835:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVER_INFO_1005 {
//     pub sv1005_comment: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2840:1: declaration Impl has no candidate rule
// impl Default for SERVER_INFO_1005 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2845:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVER_INFO_101 {
//     pub sv101_platform_id: u32,
//     pub sv101_name: windows_sys::core::PWSTR,
//     pub sv101_version_major: u32,
//     pub sv101_version_minor: u32,
//     pub sv101_type: NET_SERVER_TYPE,
//     pub sv101_comment: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2855:1: declaration Impl has no candidate rule
// impl Default for SERVER_INFO_101 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2860:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1010 {
//     pub sv1010_disc: i32,
// }

// UNSUPPORTED Rust 2865:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1016 {
//     pub sv1016_hidden: SERVER_INFO_HIDDEN,
// }

// UNSUPPORTED Rust 2870:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1017 {
//     pub sv1017_announce: u32,
// }

// UNSUPPORTED Rust 2875:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1018 {
//     pub sv1018_anndelta: u32,
// }

// UNSUPPORTED Rust 2880:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVER_INFO_102 {
//     pub sv102_platform_id: u32,
//     pub sv102_name: windows_sys::core::PWSTR,
//     pub sv102_version_major: u32,
//     pub sv102_version_minor: u32,
//     pub sv102_type: NET_SERVER_TYPE,
//     pub sv102_comment: windows_sys::core::PWSTR,
//     pub sv102_users: u32,
//     pub sv102_disc: i32,
//     pub sv102_hidden: SERVER_INFO_HIDDEN,
//     pub sv102_announce: u32,
//     pub sv102_anndelta: u32,
//     pub sv102_licenses: u32,
//     pub sv102_userpath: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2897:1: declaration Impl has no candidate rule
// impl Default for SERVER_INFO_102 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2902:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVER_INFO_103 {
//     pub sv103_platform_id: u32,
//     pub sv103_name: windows_sys::core::PWSTR,
//     pub sv103_version_major: u32,
//     pub sv103_version_minor: u32,
//     pub sv103_type: u32,
//     pub sv103_comment: windows_sys::core::PWSTR,
//     pub sv103_users: u32,
//     pub sv103_disc: i32,
//     pub sv103_hidden: windows_sys::core::BOOL,
//     pub sv103_announce: u32,
//     pub sv103_anndelta: u32,
//     pub sv103_licenses: u32,
//     pub sv103_userpath: windows_sys::core::PWSTR,
//     pub sv103_capabilities: u32,
// }

// UNSUPPORTED Rust 2920:1: declaration Impl has no candidate rule
// impl Default for SERVER_INFO_103 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2925:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1107 {
//     pub sv1107_users: u32,
// }

// UNSUPPORTED Rust 2930:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1501 {
//     pub sv1501_sessopens: u32,
// }

// UNSUPPORTED Rust 2935:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1502 {
//     pub sv1502_sessvcs: u32,
// }

// UNSUPPORTED Rust 2940:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1503 {
//     pub sv1503_opensearch: u32,
// }

// UNSUPPORTED Rust 2945:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1506 {
//     pub sv1506_maxworkitems: u32,
// }

// UNSUPPORTED Rust 2950:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1509 {
//     pub sv1509_maxrawbuflen: u32,
// }

// UNSUPPORTED Rust 2955:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1510 {
//     pub sv1510_sessusers: u32,
// }

// UNSUPPORTED Rust 2960:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1511 {
//     pub sv1511_sessconns: u32,
// }

// UNSUPPORTED Rust 2965:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1512 {
//     pub sv1512_maxnonpagedmemoryusage: u32,
// }

// UNSUPPORTED Rust 2970:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1513 {
//     pub sv1513_maxpagedmemoryusage: u32,
// }

// UNSUPPORTED Rust 2975:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1514 {
//     pub sv1514_enablesoftcompat: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 2980:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1515 {
//     pub sv1515_enableforcedlogoff: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 2985:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1516 {
//     pub sv1516_timesource: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 2990:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1518 {
//     pub sv1518_lmannounce: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 2995:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1520 {
//     pub sv1520_maxcopyreadlen: u32,
// }

// UNSUPPORTED Rust 3000:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1521 {
//     pub sv1521_maxcopywritelen: u32,
// }

// UNSUPPORTED Rust 3005:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1522 {
//     pub sv1522_minkeepsearch: u32,
// }

// UNSUPPORTED Rust 3010:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1523 {
//     pub sv1523_maxkeepsearch: u32,
// }

// UNSUPPORTED Rust 3015:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1524 {
//     pub sv1524_minkeepcomplsearch: u32,
// }

// UNSUPPORTED Rust 3020:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1525 {
//     pub sv1525_maxkeepcomplsearch: u32,
// }

// UNSUPPORTED Rust 3025:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1528 {
//     pub sv1528_scavtimeout: u32,
// }

// UNSUPPORTED Rust 3030:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1529 {
//     pub sv1529_minrcvqueue: u32,
// }

// UNSUPPORTED Rust 3035:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1530 {
//     pub sv1530_minfreeworkitems: u32,
// }

// UNSUPPORTED Rust 3040:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1533 {
//     pub sv1533_maxmpxct: u32,
// }

// UNSUPPORTED Rust 3045:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1534 {
//     pub sv1534_oplockbreakwait: u32,
// }

// UNSUPPORTED Rust 3050:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1535 {
//     pub sv1535_oplockbreakresponsewait: u32,
// }

// UNSUPPORTED Rust 3055:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1536 {
//     pub sv1536_enableoplocks: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3060:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1537 {
//     pub sv1537_enableoplockforceclose: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3065:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1538 {
//     pub sv1538_enablefcbopens: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3070:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1539 {
//     pub sv1539_enableraw: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3075:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1540 {
//     pub sv1540_enablesharednetdrives: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3080:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1541 {
//     pub sv1541_minfreeconnections: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3085:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1542 {
//     pub sv1542_maxfreeconnections: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3090:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1543 {
//     pub sv1543_initsesstable: u32,
// }

// UNSUPPORTED Rust 3095:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1544 {
//     pub sv1544_initconntable: u32,
// }

// UNSUPPORTED Rust 3100:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1545 {
//     pub sv1545_initfiletable: u32,
// }

// UNSUPPORTED Rust 3105:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1546 {
//     pub sv1546_initsearchtable: u32,
// }

// UNSUPPORTED Rust 3110:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1547 {
//     pub sv1547_alertschedule: u32,
// }

// UNSUPPORTED Rust 3115:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1548 {
//     pub sv1548_errorthreshold: u32,
// }

// UNSUPPORTED Rust 3120:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1549 {
//     pub sv1549_networkerrorthreshold: u32,
// }

// UNSUPPORTED Rust 3125:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1550 {
//     pub sv1550_diskspacethreshold: u32,
// }

// UNSUPPORTED Rust 3130:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1552 {
//     pub sv1552_maxlinkdelay: u32,
// }

// UNSUPPORTED Rust 3135:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1553 {
//     pub sv1553_minlinkthroughput: u32,
// }

// UNSUPPORTED Rust 3140:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1554 {
//     pub sv1554_linkinfovalidtime: u32,
// }

// UNSUPPORTED Rust 3145:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1555 {
//     pub sv1555_scavqosinfoupdatetime: u32,
// }

// UNSUPPORTED Rust 3150:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1556 {
//     pub sv1556_maxworkitemidletime: u32,
// }

// UNSUPPORTED Rust 3155:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1557 {
//     pub sv1557_maxrawworkitems: u32,
// }

// UNSUPPORTED Rust 3160:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1560 {
//     pub sv1560_producttype: u32,
// }

// UNSUPPORTED Rust 3165:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1561 {
//     pub sv1561_serversize: u32,
// }

// UNSUPPORTED Rust 3170:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1562 {
//     pub sv1562_connectionlessautodisc: u32,
// }

// UNSUPPORTED Rust 3175:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1563 {
//     pub sv1563_sharingviolationretries: u32,
// }

// UNSUPPORTED Rust 3180:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1564 {
//     pub sv1564_sharingviolationdelay: u32,
// }

// UNSUPPORTED Rust 3185:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1565 {
//     pub sv1565_maxglobalopensearch: u32,
// }

// UNSUPPORTED Rust 3190:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1566 {
//     pub sv1566_removeduplicatesearches: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3195:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1567 {
//     pub sv1567_lockviolationretries: u32,
// }

// UNSUPPORTED Rust 3200:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1568 {
//     pub sv1568_lockviolationoffset: u32,
// }

// UNSUPPORTED Rust 3205:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1569 {
//     pub sv1569_lockviolationdelay: u32,
// }

// UNSUPPORTED Rust 3210:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1570 {
//     pub sv1570_mdlreadswitchover: u32,
// }

// UNSUPPORTED Rust 3215:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1571 {
//     pub sv1571_cachedopenlimit: u32,
// }

// UNSUPPORTED Rust 3220:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1572 {
//     pub sv1572_criticalthreads: u32,
// }

// UNSUPPORTED Rust 3225:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1573 {
//     pub sv1573_restrictnullsessaccess: u32,
// }

// UNSUPPORTED Rust 3230:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1574 {
//     pub sv1574_enablewfw311directipx: u32,
// }

// UNSUPPORTED Rust 3235:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1575 {
//     pub sv1575_otherqueueaffinity: u32,
// }

// UNSUPPORTED Rust 3240:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1576 {
//     pub sv1576_queuesamplesecs: u32,
// }

// UNSUPPORTED Rust 3245:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1577 {
//     pub sv1577_balancecount: u32,
// }

// UNSUPPORTED Rust 3250:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1578 {
//     pub sv1578_preferredaffinity: u32,
// }

// UNSUPPORTED Rust 3255:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1579 {
//     pub sv1579_maxfreerfcbs: u32,
// }

// UNSUPPORTED Rust 3260:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1580 {
//     pub sv1580_maxfreemfcbs: u32,
// }

// UNSUPPORTED Rust 3265:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1581 {
//     pub sv1581_maxfreemlcbs: u32,
// }

// UNSUPPORTED Rust 3270:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1582 {
//     pub sv1582_maxfreepagedpoolchunks: u32,
// }

// UNSUPPORTED Rust 3275:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1583 {
//     pub sv1583_minpagedpoolchunksize: u32,
// }

// UNSUPPORTED Rust 3280:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1584 {
//     pub sv1584_maxpagedpoolchunksize: u32,
// }

// UNSUPPORTED Rust 3285:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1585 {
//     pub sv1585_sendsfrompreferredprocessor: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3290:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1586 {
//     pub sv1586_maxthreadsperqueue: u32,
// }

// UNSUPPORTED Rust 3295:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1587 {
//     pub sv1587_cacheddirectorylimit: u32,
// }

// UNSUPPORTED Rust 3300:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1588 {
//     pub sv1588_maxcopylength: u32,
// }

// UNSUPPORTED Rust 3305:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1590 {
//     pub sv1590_enablecompression: u32,
// }

// UNSUPPORTED Rust 3310:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1591 {
//     pub sv1591_autosharewks: u32,
// }

// UNSUPPORTED Rust 3315:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1592 {
//     pub sv1592_autosharewks: u32,
// }

// UNSUPPORTED Rust 3320:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1593 {
//     pub sv1593_enablesecuritysignature: u32,
// }

// UNSUPPORTED Rust 3325:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1594 {
//     pub sv1594_requiresecuritysignature: u32,
// }

// UNSUPPORTED Rust 3330:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1595 {
//     pub sv1595_minclientbuffersize: u32,
// }

// UNSUPPORTED Rust 3335:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1596 {
//     pub sv1596_ConnectionNoSessionsTimeout: u32,
// }

// UNSUPPORTED Rust 3340:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1597 {
//     pub sv1597_IdleThreadTimeOut: u32,
// }

// UNSUPPORTED Rust 3345:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1598 {
//     pub sv1598_enableW9xsecuritysignature: u32,
// }

// UNSUPPORTED Rust 3350:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1599 {
//     pub sv1598_enforcekerberosreauthentication: bool,
// }

// UNSUPPORTED Rust 3355:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1600 {
//     pub sv1598_disabledos: bool,
// }

// UNSUPPORTED Rust 3360:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1601 {
//     pub sv1598_lowdiskspaceminimum: u32,
// }

// UNSUPPORTED Rust 3365:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_1602 {
//     pub sv_1598_disablestrictnamechecking: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3370:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVER_INFO_402 {
//     pub sv402_ulist_mtime: u32,
//     pub sv402_glist_mtime: u32,
//     pub sv402_alist_mtime: u32,
//     pub sv402_alerts: windows_sys::core::PWSTR,
//     pub sv402_security: SERVER_INFO_SECURITY,
//     pub sv402_numadmin: u32,
//     pub sv402_lanmask: u32,
//     pub sv402_guestacct: windows_sys::core::PWSTR,
//     pub sv402_chdevs: u32,
//     pub sv402_chdevq: u32,
//     pub sv402_chdevjobs: u32,
//     pub sv402_connections: u32,
//     pub sv402_shares: u32,
//     pub sv402_openfiles: u32,
//     pub sv402_sessopens: u32,
//     pub sv402_sessvcs: u32,
//     pub sv402_sessreqs: u32,
//     pub sv402_opensearch: u32,
//     pub sv402_activelocks: u32,
//     pub sv402_numreqbuf: u32,
//     pub sv402_sizreqbuf: u32,
//     pub sv402_numbigbuf: u32,
//     pub sv402_numfiletasks: u32,
//     pub sv402_alertsched: u32,
//     pub sv402_erroralert: u32,
//     pub sv402_logonalert: u32,
//     pub sv402_accessalert: u32,
//     pub sv402_diskalert: u32,
//     pub sv402_netioalert: u32,
//     pub sv402_maxauditsz: u32,
//     pub sv402_srvheuristics: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 3405:1: declaration Impl has no candidate rule
// impl Default for SERVER_INFO_402 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3410:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVER_INFO_403 {
//     pub sv403_ulist_mtime: u32,
//     pub sv403_glist_mtime: u32,
//     pub sv403_alist_mtime: u32,
//     pub sv403_alerts: windows_sys::core::PWSTR,
//     pub sv403_security: SERVER_INFO_SECURITY,
//     pub sv403_numadmin: u32,
//     pub sv403_lanmask: u32,
//     pub sv403_guestacct: windows_sys::core::PWSTR,
//     pub sv403_chdevs: u32,
//     pub sv403_chdevq: u32,
//     pub sv403_chdevjobs: u32,
//     pub sv403_connections: u32,
//     pub sv403_shares: u32,
//     pub sv403_openfiles: u32,
//     pub sv403_sessopens: u32,
//     pub sv403_sessvcs: u32,
//     pub sv403_sessreqs: u32,
//     pub sv403_opensearch: u32,
//     pub sv403_activelocks: u32,
//     pub sv403_numreqbuf: u32,
//     pub sv403_sizreqbuf: u32,
//     pub sv403_numbigbuf: u32,
//     pub sv403_numfiletasks: u32,
//     pub sv403_alertsched: u32,
//     pub sv403_erroralert: u32,
//     pub sv403_logonalert: u32,
//     pub sv403_accessalert: u32,
//     pub sv403_diskalert: u32,
//     pub sv403_netioalert: u32,
//     pub sv403_maxauditsz: u32,
//     pub sv403_srvheuristics: windows_sys::core::PWSTR,
//     pub sv403_auditedevents: u32,
//     pub sv403_autoprofile: u32,
//     pub sv403_autopath: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 3448:1: declaration Impl has no candidate rule
// impl Default for SERVER_INFO_403 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3453:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_502 {
//     pub sv502_sessopens: u32,
//     pub sv502_sessvcs: u32,
//     pub sv502_opensearch: u32,
//     pub sv502_sizreqbuf: u32,
//     pub sv502_initworkitems: u32,
//     pub sv502_maxworkitems: u32,
//     pub sv502_rawworkitems: u32,
//     pub sv502_irpstacksize: u32,
//     pub sv502_maxrawbuflen: u32,
//     pub sv502_sessusers: u32,
//     pub sv502_sessconns: u32,
//     pub sv502_maxpagedmemoryusage: u32,
//     pub sv502_maxnonpagedmemoryusage: u32,
//     pub sv502_enablesoftcompat: windows_sys::core::BOOL,
//     pub sv502_enableforcedlogoff: windows_sys::core::BOOL,
//     pub sv502_timesource: windows_sys::core::BOOL,
//     pub sv502_acceptdownlevelapis: windows_sys::core::BOOL,
//     pub sv502_lmannounce: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3475:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVER_INFO_503 {
//     pub sv503_sessopens: u32,
//     pub sv503_sessvcs: u32,
//     pub sv503_opensearch: u32,
//     pub sv503_sizreqbuf: u32,
//     pub sv503_initworkitems: u32,
//     pub sv503_maxworkitems: u32,
//     pub sv503_rawworkitems: u32,
//     pub sv503_irpstacksize: u32,
//     pub sv503_maxrawbuflen: u32,
//     pub sv503_sessusers: u32,
//     pub sv503_sessconns: u32,
//     pub sv503_maxpagedmemoryusage: u32,
//     pub sv503_maxnonpagedmemoryusage: u32,
//     pub sv503_enablesoftcompat: windows_sys::core::BOOL,
//     pub sv503_enableforcedlogoff: windows_sys::core::BOOL,
//     pub sv503_timesource: windows_sys::core::BOOL,
//     pub sv503_acceptdownlevelapis: windows_sys::core::BOOL,
//     pub sv503_lmannounce: windows_sys::core::BOOL,
//     pub sv503_domain: windows_sys::core::PWSTR,
//     pub sv503_maxcopyreadlen: u32,
//     pub sv503_maxcopywritelen: u32,
//     pub sv503_minkeepsearch: u32,
//     pub sv503_maxkeepsearch: u32,
//     pub sv503_minkeepcomplsearch: u32,
//     pub sv503_maxkeepcomplsearch: u32,
//     pub sv503_threadcountadd: u32,
//     pub sv503_numblockthreads: u32,
//     pub sv503_scavtimeout: u32,
//     pub sv503_minrcvqueue: u32,
//     pub sv503_minfreeworkitems: u32,
//     pub sv503_xactmemsize: u32,
//     pub sv503_threadpriority: u32,
//     pub sv503_maxmpxct: u32,
//     pub sv503_oplockbreakwait: u32,
//     pub sv503_oplockbreakresponsewait: u32,
//     pub sv503_enableoplocks: windows_sys::core::BOOL,
//     pub sv503_enableoplockforceclose: windows_sys::core::BOOL,
//     pub sv503_enablefcbopens: windows_sys::core::BOOL,
//     pub sv503_enableraw: windows_sys::core::BOOL,
//     pub sv503_enablesharednetdrives: windows_sys::core::BOOL,
//     pub sv503_minfreeconnections: u32,
//     pub sv503_maxfreeconnections: u32,
// }

// UNSUPPORTED Rust 3521:1: declaration Impl has no candidate rule
// impl Default for SERVER_INFO_503 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3526:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVER_INFO_598 {
//     pub sv598_maxrawworkitems: u32,
//     pub sv598_maxthreadsperqueue: u32,
//     pub sv598_producttype: u32,
//     pub sv598_serversize: u32,
//     pub sv598_connectionlessautodisc: u32,
//     pub sv598_sharingviolationretries: u32,
//     pub sv598_sharingviolationdelay: u32,
//     pub sv598_maxglobalopensearch: u32,
//     pub sv598_removeduplicatesearches: u32,
//     pub sv598_lockviolationoffset: u32,
//     pub sv598_lockviolationdelay: u32,
//     pub sv598_mdlreadswitchover: u32,
//     pub sv598_cachedopenlimit: u32,
//     pub sv598_otherqueueaffinity: u32,
//     pub sv598_restrictnullsessaccess: windows_sys::core::BOOL,
//     pub sv598_enablewfw311directipx: windows_sys::core::BOOL,
//     pub sv598_queuesamplesecs: u32,
//     pub sv598_balancecount: u32,
//     pub sv598_preferredaffinity: u32,
//     pub sv598_maxfreerfcbs: u32,
//     pub sv598_maxfreemfcbs: u32,
//     pub sv598_maxfreelfcbs: u32,
//     pub sv598_maxfreepagedpoolchunks: u32,
//     pub sv598_minpagedpoolchunksize: u32,
//     pub sv598_maxpagedpoolchunksize: u32,
//     pub sv598_sendsfrompreferredprocessor: windows_sys::core::BOOL,
//     pub sv598_cacheddirectorylimit: u32,
//     pub sv598_maxcopylength: u32,
//     pub sv598_enablecompression: windows_sys::core::BOOL,
//     pub sv598_autosharewks: windows_sys::core::BOOL,
//     pub sv598_autoshareserver: windows_sys::core::BOOL,
//     pub sv598_enablesecuritysignature: windows_sys::core::BOOL,
//     pub sv598_requiresecuritysignature: windows_sys::core::BOOL,
//     pub sv598_minclientbuffersize: u32,
//     pub sv598_serverguid: windows_sys::core::GUID,
//     pub sv598_ConnectionNoSessionsTimeout: u32,
//     pub sv598_IdleThreadTimeOut: u32,
//     pub sv598_enableW9xsecuritysignature: windows_sys::core::BOOL,
//     pub sv598_enforcekerberosreauthentication: windows_sys::core::BOOL,
//     pub sv598_disabledos: windows_sys::core::BOOL,
//     pub sv598_lowdiskspaceminimum: u32,
//     pub sv598_disablestrictnamechecking: windows_sys::core::BOOL,
//     pub sv598_enableauthenticateusersharing: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3573:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVER_INFO_599 {
//     pub sv599_sessopens: u32,
//     pub sv599_sessvcs: u32,
//     pub sv599_opensearch: u32,
//     pub sv599_sizreqbuf: u32,
//     pub sv599_initworkitems: u32,
//     pub sv599_maxworkitems: u32,
//     pub sv599_rawworkitems: u32,
//     pub sv599_irpstacksize: u32,
//     pub sv599_maxrawbuflen: u32,
//     pub sv599_sessusers: u32,
//     pub sv599_sessconns: u32,
//     pub sv599_maxpagedmemoryusage: u32,
//     pub sv599_maxnonpagedmemoryusage: u32,
//     pub sv599_enablesoftcompat: windows_sys::core::BOOL,
//     pub sv599_enableforcedlogoff: windows_sys::core::BOOL,
//     pub sv599_timesource: windows_sys::core::BOOL,
//     pub sv599_acceptdownlevelapis: windows_sys::core::BOOL,
//     pub sv599_lmannounce: windows_sys::core::BOOL,
//     pub sv599_domain: windows_sys::core::PWSTR,
//     pub sv599_maxcopyreadlen: u32,
//     pub sv599_maxcopywritelen: u32,
//     pub sv599_minkeepsearch: u32,
//     pub sv599_maxkeepsearch: u32,
//     pub sv599_minkeepcomplsearch: u32,
//     pub sv599_maxkeepcomplsearch: u32,
//     pub sv599_threadcountadd: u32,
//     pub sv599_numblockthreads: u32,
//     pub sv599_scavtimeout: u32,
//     pub sv599_minrcvqueue: u32,
//     pub sv599_minfreeworkitems: u32,
//     pub sv599_xactmemsize: u32,
//     pub sv599_threadpriority: u32,
//     pub sv599_maxmpxct: u32,
//     pub sv599_oplockbreakwait: u32,
//     pub sv599_oplockbreakresponsewait: u32,
//     pub sv599_enableoplocks: windows_sys::core::BOOL,
//     pub sv599_enableoplockforceclose: windows_sys::core::BOOL,
//     pub sv599_enablefcbopens: windows_sys::core::BOOL,
//     pub sv599_enableraw: windows_sys::core::BOOL,
//     pub sv599_enablesharednetdrives: windows_sys::core::BOOL,
//     pub sv599_minfreeconnections: u32,
//     pub sv599_maxfreeconnections: u32,
//     pub sv599_initsesstable: u32,
//     pub sv599_initconntable: u32,
//     pub sv599_initfiletable: u32,
//     pub sv599_initsearchtable: u32,
//     pub sv599_alertschedule: u32,
//     pub sv599_errorthreshold: u32,
//     pub sv599_networkerrorthreshold: u32,
//     pub sv599_diskspacethreshold: u32,
//     pub sv599_reserved: u32,
//     pub sv599_maxlinkdelay: u32,
//     pub sv599_minlinkthroughput: u32,
//     pub sv599_linkinfovalidtime: u32,
//     pub sv599_scavqosinfoupdatetime: u32,
//     pub sv599_maxworkitemidletime: u32,
// }

// UNSUPPORTED Rust 3633:1: declaration Impl has no candidate rule
// impl Default for SERVER_INFO_599 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SERVER_INFO_HIDDEN` = Int;
public typealias `SERVER_INFO_SECURITY` = UInt;
// UNSUPPORTED Rust 3640:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVER_TRANSPORT_INFO_0 {
//     pub svti0_numberofvcs: u32,
//     pub svti0_transportname: windows_sys::core::PWSTR,
//     pub svti0_transportaddress: *mut u8,
//     pub svti0_transportaddresslength: u32,
//     pub svti0_networkaddress: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 3649:1: declaration Impl has no candidate rule
// impl Default for SERVER_TRANSPORT_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3654:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVER_TRANSPORT_INFO_1 {
//     pub svti1_numberofvcs: u32,
//     pub svti1_transportname: windows_sys::core::PWSTR,
//     pub svti1_transportaddress: *mut u8,
//     pub svti1_transportaddresslength: u32,
//     pub svti1_networkaddress: windows_sys::core::PWSTR,
//     pub svti1_domain: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 3664:1: declaration Impl has no candidate rule
// impl Default for SERVER_TRANSPORT_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3669:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVER_TRANSPORT_INFO_2 {
//     pub svti2_numberofvcs: u32,
//     pub svti2_transportname: windows_sys::core::PWSTR,
//     pub svti2_transportaddress: *mut u8,
//     pub svti2_transportaddresslength: u32,
//     pub svti2_networkaddress: windows_sys::core::PWSTR,
//     pub svti2_domain: windows_sys::core::PWSTR,
//     pub svti2_flags: u32,
// }

// UNSUPPORTED Rust 3680:1: declaration Impl has no candidate rule
// impl Default for SERVER_TRANSPORT_INFO_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3685:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVER_TRANSPORT_INFO_3 {
//     pub svti3_numberofvcs: u32,
//     pub svti3_transportname: windows_sys::core::PWSTR,
//     pub svti3_transportaddress: *mut u8,
//     pub svti3_transportaddresslength: u32,
//     pub svti3_networkaddress: windows_sys::core::PWSTR,
//     pub svti3_domain: windows_sys::core::PWSTR,
//     pub svti3_flags: u32,
//     pub svti3_passwordlength: u32,
//     pub svti3_password: [u8; 256],
// }

// UNSUPPORTED Rust 3698:1: declaration Impl has no candidate rule
// impl Default for SERVER_TRANSPORT_INFO_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SERVICE2_BASE`: UInt = 5600u;
public const val `SERVICE_ACCOUNT_FLAG_ADD_AGAINST_RODC`: Int = 2;
public const val `SERVICE_ACCOUNT_FLAG_LINK_TO_HOST_ONLY`: Int = 1;
public const val `SERVICE_ACCOUNT_FLAG_REMOVE_OFFLINE`: Int = 2;
public const val `SERVICE_ACCOUNT_FLAG_UNLINK_FROM_HOST_ONLY`: Int = 1;
// UNSUPPORTED Rust 3708:1: non-scalar type Ptr unsupported
// pub const SERVICE_ACCOUNT_PASSWORD: windows_sys::core::PCWSTR = windows_sys::core::w!("_SA_{262E99C9-6160-4871-ACEC-4E61736B6F21}");

// UNSUPPORTED Rust 3709:1: non-scalar type Ptr unsupported
// pub const SERVICE_ACCOUNT_SECRET_PREFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("_SC_{262E99C9-6160-4871-ACEC-4E61736B6F21}_");

// UNSUPPORTED Rust 3710:1: non-scalar type Ptr unsupported
// pub const SERVICE_ADWS: windows_sys::core::PCWSTR = windows_sys::core::w!("ADWS");

// UNSUPPORTED Rust 3711:1: non-scalar type Ptr unsupported
// pub const SERVICE_AFP: windows_sys::core::PCWSTR = windows_sys::core::w!("AFP");

// UNSUPPORTED Rust 3712:1: non-scalar type Ptr unsupported
// pub const SERVICE_ALERTER: windows_sys::core::PCWSTR = windows_sys::core::w!("ALERTER");

public const val `SERVICE_BASE`: UInt = 3050u;
// UNSUPPORTED Rust 3714:1: non-scalar type Ptr unsupported
// pub const SERVICE_BROWSER: windows_sys::core::PCWSTR = windows_sys::core::w!("BROWSER");

public const val `SERVICE_CCP_CHKPT_NUM`: UInt = 255u;
public const val `SERVICE_CCP_NO_HINT`: UInt = 0u;
public const val `SERVICE_CCP_QUERY_HINT`: UInt = 65536u;
public const val `SERVICE_CCP_WAIT_TIME`: UInt = 65280u;
public const val `SERVICE_CTRL_CONTINUE`: UInt = 2u;
public const val `SERVICE_CTRL_INTERROGATE`: UInt = 0u;
public const val `SERVICE_CTRL_PAUSE`: UInt = 1u;
public const val `SERVICE_CTRL_REDIR_COMM`: UInt = 4u;
public const val `SERVICE_CTRL_REDIR_DISK`: UInt = 1u;
public const val `SERVICE_CTRL_REDIR_PRINT`: UInt = 2u;
public const val `SERVICE_CTRL_UNINSTALL`: UInt = 3u;
// UNSUPPORTED Rust 3726:1: non-scalar type Ptr unsupported
// pub const SERVICE_DHCP: windows_sys::core::PCWSTR = windows_sys::core::w!("DHCP");

// UNSUPPORTED Rust 3727:1: non-scalar type Ptr unsupported
// pub const SERVICE_DNS_CACHE: windows_sys::core::PCWSTR = windows_sys::core::w!("DnsCache");

// UNSUPPORTED Rust 3728:1: non-scalar type Ptr unsupported
// pub const SERVICE_DOS_ENCRYPTION: windows_sys::core::PCWSTR = windows_sys::core::w!("ENCRYPT");

// UNSUPPORTED Rust 3729:1: non-scalar type Ptr unsupported
// pub const SERVICE_DSROLE: windows_sys::core::PCWSTR = windows_sys::core::w!("DsRoleSvc");

// UNSUPPORTED Rust 3730:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_INFO_0 {
//     pub svci0_name: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 3735:1: declaration Impl has no candidate rule
// impl Default for SERVICE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3740:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_INFO_1 {
//     pub svci1_name: windows_sys::core::PWSTR,
//     pub svci1_status: u32,
//     pub svci1_code: u32,
//     pub svci1_pid: u32,
// }

// UNSUPPORTED Rust 3748:1: declaration Impl has no candidate rule
// impl Default for SERVICE_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3753:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_INFO_2 {
//     pub svci2_name: windows_sys::core::PWSTR,
//     pub svci2_status: u32,
//     pub svci2_code: u32,
//     pub svci2_pid: u32,
//     pub svci2_text: windows_sys::core::PWSTR,
//     pub svci2_specific_error: u32,
//     pub svci2_display_name: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 3764:1: declaration Impl has no candidate rule
// impl Default for SERVICE_INFO_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SERVICE_INSTALLED`: UInt = 3u;
public const val `SERVICE_INSTALL_PENDING`: UInt = 1u;
public const val `SERVICE_INSTALL_STATE`: UInt = 3u;
public const val `SERVICE_IP_CHKPT_NUM`: UInt = 255u;
public const val `SERVICE_IP_NO_HINT`: UInt = 0u;
public const val `SERVICE_IP_QUERY_HINT`: UInt = 65536u;
public const val `SERVICE_IP_WAITTIME_SHIFT`: UInt = 8u;
public const val `SERVICE_IP_WAIT_TIME`: UInt = 65280u;
// UNSUPPORTED Rust 3777:1: non-scalar type Ptr unsupported
// pub const SERVICE_ISMSERV: windows_sys::core::PCWSTR = windows_sys::core::w!("IsmServ");

// UNSUPPORTED Rust 3778:1: non-scalar type Ptr unsupported
// pub const SERVICE_KDC: windows_sys::core::PCWSTR = windows_sys::core::w!("kdc");

// UNSUPPORTED Rust 3779:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_AFP: windows_sys::core::PCWSTR = windows_sys::core::w!("AFP");

// UNSUPPORTED Rust 3780:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_ALERTER: windows_sys::core::PCWSTR = windows_sys::core::w!("ALERTER");

// UNSUPPORTED Rust 3781:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_BROWSER: windows_sys::core::PCWSTR = windows_sys::core::w!("BROWSER");

// UNSUPPORTED Rust 3782:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_DHCP: windows_sys::core::PCWSTR = windows_sys::core::w!("DHCP");

// UNSUPPORTED Rust 3783:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_DSROLE: windows_sys::core::PCWSTR = windows_sys::core::w!("DsRoleSvc");

// UNSUPPORTED Rust 3784:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_ISMSERV: windows_sys::core::PCWSTR = windows_sys::core::w!("IsmServ");

// UNSUPPORTED Rust 3785:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_KDC: windows_sys::core::PCWSTR = windows_sys::core::w!("kdc");

// UNSUPPORTED Rust 3786:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_LMHOSTS: windows_sys::core::PCWSTR = windows_sys::core::w!("LMHOSTS");

// UNSUPPORTED Rust 3787:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_MESSENGER: windows_sys::core::PCWSTR = windows_sys::core::w!("MESSENGER");

// UNSUPPORTED Rust 3788:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_NBT: windows_sys::core::PCWSTR = windows_sys::core::w!("NBT");

// UNSUPPORTED Rust 3789:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_NETLOGON: windows_sys::core::PCWSTR = windows_sys::core::w!("NETLOGON");

// UNSUPPORTED Rust 3790:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_NETPOPUP: windows_sys::core::PCWSTR = windows_sys::core::w!("NETPOPUP");

// UNSUPPORTED Rust 3791:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_NETRUN: windows_sys::core::PCWSTR = windows_sys::core::w!("NETRUN");

// UNSUPPORTED Rust 3792:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_NTDS: windows_sys::core::PCWSTR = windows_sys::core::w!("NTDS");

// UNSUPPORTED Rust 3793:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_NTFRS: windows_sys::core::PCWSTR = windows_sys::core::w!("NtFrs");

// UNSUPPORTED Rust 3794:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_NWSAP: windows_sys::core::PCWSTR = windows_sys::core::w!("NwSapAgent");

// UNSUPPORTED Rust 3795:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_REPL: windows_sys::core::PCWSTR = windows_sys::core::w!("REPLICATOR");

// UNSUPPORTED Rust 3796:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_RIPL: windows_sys::core::PCWSTR = windows_sys::core::w!("REMOTEBOOT");

// UNSUPPORTED Rust 3797:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_RPCLOCATOR: windows_sys::core::PCWSTR = windows_sys::core::w!("RPCLOCATOR");

// UNSUPPORTED Rust 3798:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_SCHEDULE: windows_sys::core::PCWSTR = windows_sys::core::w!("Schedule");

// UNSUPPORTED Rust 3799:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_SERVER: windows_sys::core::PCWSTR = windows_sys::core::w!("SERVER");

// UNSUPPORTED Rust 3800:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_SPOOLER: windows_sys::core::PCWSTR = windows_sys::core::w!("SPOOLER");

// UNSUPPORTED Rust 3801:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_SQLSERVER: windows_sys::core::PCWSTR = windows_sys::core::w!("SQLSERVER");

// UNSUPPORTED Rust 3802:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_TCPIP: windows_sys::core::PCWSTR = windows_sys::core::w!("TCPIP");

// UNSUPPORTED Rust 3803:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_TELNET: windows_sys::core::PCWSTR = windows_sys::core::w!("Telnet");

// UNSUPPORTED Rust 3804:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_TIMESOURCE: windows_sys::core::PCWSTR = windows_sys::core::w!("TIMESOURCE");

// UNSUPPORTED Rust 3805:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_TRKSVR: windows_sys::core::PCWSTR = windows_sys::core::w!("TrkSvr");

// UNSUPPORTED Rust 3806:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_TRKWKS: windows_sys::core::PCWSTR = windows_sys::core::w!("TrkWks");

// UNSUPPORTED Rust 3807:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_UPS: windows_sys::core::PCWSTR = windows_sys::core::w!("UPS");

// UNSUPPORTED Rust 3808:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_WORKSTATION: windows_sys::core::PCWSTR = windows_sys::core::w!("WORKSTATION");

// UNSUPPORTED Rust 3809:1: non-scalar type Ptr unsupported
// pub const SERVICE_LM20_XACTSRV: windows_sys::core::PCWSTR = windows_sys::core::w!("XACTSRV");

// UNSUPPORTED Rust 3810:1: non-scalar type Ptr unsupported
// pub const SERVICE_LMHOSTS: windows_sys::core::PCWSTR = windows_sys::core::w!("LMHOSTS");

public const val `SERVICE_MAXTIME`: UInt = 255u;
// UNSUPPORTED Rust 3812:1: non-scalar type Ptr unsupported
// pub const SERVICE_MESSENGER: windows_sys::core::PCWSTR = windows_sys::core::w!("MESSENGER");

// UNSUPPORTED Rust 3813:1: non-scalar type Ptr unsupported
// pub const SERVICE_NBT: windows_sys::core::PCWSTR = windows_sys::core::w!("NBT");

// UNSUPPORTED Rust 3814:1: non-scalar type Ptr unsupported
// pub const SERVICE_NETLOGON: windows_sys::core::PCWSTR = windows_sys::core::w!("NETLOGON");

// UNSUPPORTED Rust 3815:1: non-scalar type Ptr unsupported
// pub const SERVICE_NETPOPUP: windows_sys::core::PCWSTR = windows_sys::core::w!("NETPOPUP");

// UNSUPPORTED Rust 3816:1: non-scalar type Ptr unsupported
// pub const SERVICE_NETRUN: windows_sys::core::PCWSTR = windows_sys::core::w!("NETRUN");

public const val `SERVICE_NOT_PAUSABLE`: UInt = 0u;
public const val `SERVICE_NOT_UNINSTALLABLE`: UInt = 0u;
// UNSUPPORTED Rust 3819:1: non-scalar type Ptr unsupported
// pub const SERVICE_NTDS: windows_sys::core::PCWSTR = windows_sys::core::w!("NTDS");

// UNSUPPORTED Rust 3820:1: non-scalar type Ptr unsupported
// pub const SERVICE_NTFRS: windows_sys::core::PCWSTR = windows_sys::core::w!("NtFrs");

public const val `SERVICE_NTIP_WAITTIME_SHIFT`: UInt = 12u;
// UNSUPPORTED Rust 3822:1: non-scalar type Ptr unsupported
// pub const SERVICE_NTLMSSP: windows_sys::core::PCWSTR = windows_sys::core::w!("NtLmSsp");

public const val `SERVICE_NT_MAXTIME`: UInt = 65535u;
// UNSUPPORTED Rust 3824:1: non-scalar type Ptr unsupported
// pub const SERVICE_NWCS: windows_sys::core::PCWSTR = windows_sys::core::w!("NWCWorkstation");

// UNSUPPORTED Rust 3825:1: non-scalar type Ptr unsupported
// pub const SERVICE_NWSAP: windows_sys::core::PCWSTR = windows_sys::core::w!("NwSapAgent");

public const val `SERVICE_PAUSABLE`: UInt = 32u;
public const val `SERVICE_PAUSE_STATE`: UInt = 12u;
public const val `SERVICE_REDIR_COMM_PAUSED`: UInt = 1024u;
public const val `SERVICE_REDIR_DISK_PAUSED`: UInt = 256u;
public const val `SERVICE_REDIR_PAUSED`: UInt = 1792u;
public const val `SERVICE_REDIR_PRINT_PAUSED`: UInt = 512u;
// UNSUPPORTED Rust 3832:1: non-scalar type Ptr unsupported
// pub const SERVICE_REPL: windows_sys::core::PCWSTR = windows_sys::core::w!("REPLICATOR");

public const val `SERVICE_RESRV_MASK`: UInt = 131071u;
// UNSUPPORTED Rust 3834:1: non-scalar type Ptr unsupported
// pub const SERVICE_RIPL: windows_sys::core::PCWSTR = windows_sys::core::w!("REMOTEBOOT");

// UNSUPPORTED Rust 3835:1: non-scalar type Ptr unsupported
// pub const SERVICE_RPCLOCATOR: windows_sys::core::PCWSTR = windows_sys::core::w!("RPCLOCATOR");

// UNSUPPORTED Rust 3836:1: non-scalar type Ptr unsupported
// pub const SERVICE_SCHEDULE: windows_sys::core::PCWSTR = windows_sys::core::w!("Schedule");

// UNSUPPORTED Rust 3837:1: non-scalar type Ptr unsupported
// pub const SERVICE_SERVER: windows_sys::core::PCWSTR = windows_sys::core::w!("LanmanServer");

// UNSUPPORTED Rust 3838:1: non-scalar type Ptr unsupported
// pub const SERVICE_SPOOLER: windows_sys::core::PCWSTR = windows_sys::core::w!("SPOOLER");

// UNSUPPORTED Rust 3839:1: non-scalar type Ptr unsupported
// pub const SERVICE_SQLSERVER: windows_sys::core::PCWSTR = windows_sys::core::w!("SQLSERVER");

// UNSUPPORTED Rust 3840:1: non-scalar type Ptr unsupported
// pub const SERVICE_TCPIP: windows_sys::core::PCWSTR = windows_sys::core::w!("TCPIP");

// UNSUPPORTED Rust 3841:1: non-scalar type Ptr unsupported
// pub const SERVICE_TELNET: windows_sys::core::PCWSTR = windows_sys::core::w!("Telnet");

// UNSUPPORTED Rust 3842:1: non-scalar type Ptr unsupported
// pub const SERVICE_TIMESOURCE: windows_sys::core::PCWSTR = windows_sys::core::w!("TIMESOURCE");

// UNSUPPORTED Rust 3843:1: non-scalar type Ptr unsupported
// pub const SERVICE_TRKSVR: windows_sys::core::PCWSTR = windows_sys::core::w!("TrkSvr");

// UNSUPPORTED Rust 3844:1: non-scalar type Ptr unsupported
// pub const SERVICE_TRKWKS: windows_sys::core::PCWSTR = windows_sys::core::w!("TrkWks");

public const val `SERVICE_UIC_AMBIGPARM`: UInt = 3058u;
public const val `SERVICE_UIC_BADPARMVAL`: UInt = 3051u;
public const val `SERVICE_UIC_CONFIG`: UInt = 3055u;
public const val `SERVICE_UIC_CONFLPARM`: UInt = 3063u;
public const val `SERVICE_UIC_DUPPARM`: UInt = 3059u;
public const val `SERVICE_UIC_EXEC`: UInt = 3061u;
public const val `SERVICE_UIC_FILE`: UInt = 3064u;
public const val `SERVICE_UIC_INTERNAL`: UInt = 3057u;
public const val `SERVICE_UIC_KILL`: UInt = 3060u;
public const val `SERVICE_UIC_MISSPARM`: UInt = 3052u;
public const val `SERVICE_UIC_M_ADDPAK`: UInt = 3090u;
public const val `SERVICE_UIC_M_ANNOUNCE`: UInt = 3083u;
public const val `SERVICE_UIC_M_DATABASE_ERROR`: UInt = 5602u;
public const val `SERVICE_UIC_M_DISK`: UInt = 3071u;
public const val `SERVICE_UIC_M_ERRLOG`: UInt = 3088u;
public const val `SERVICE_UIC_M_FILES`: UInt = 3079u;
public const val `SERVICE_UIC_M_FILE_UW`: UInt = 3089u;
public const val `SERVICE_UIC_M_LANGROUP`: UInt = 3081u;
public const val `SERVICE_UIC_M_LANROOT`: UInt = 3075u;
public const val `SERVICE_UIC_M_LAZY`: UInt = 3091u;
public const val `SERVICE_UIC_M_LOGS`: UInt = 3080u;
public const val `SERVICE_UIC_M_LSA_MACHINE_ACCT`: UInt = 5601u;
public const val `SERVICE_UIC_M_MEMORY`: UInt = 3070u;
public const val `SERVICE_UIC_M_MSGNAME`: UInt = 3082u;
public const val `SERVICE_UIC_M_NETLOGON_AUTH`: UInt = 3098u;
public const val `SERVICE_UIC_M_NETLOGON_DC_CFLCT`: UInt = 3097u;
public const val `SERVICE_UIC_M_NETLOGON_MPATH`: UInt = 5600u;
public const val `SERVICE_UIC_M_NETLOGON_NO_DC`: UInt = 3096u;
public const val `SERVICE_UIC_M_NULL`: UInt = 0u;
public const val `SERVICE_UIC_M_PROCESSES`: UInt = 3073u;
public const val `SERVICE_UIC_M_REDIR`: UInt = 3076u;
public const val `SERVICE_UIC_M_SECURITY`: UInt = 3074u;
public const val `SERVICE_UIC_M_SEC_FILE_ERR`: UInt = 3078u;
public const val `SERVICE_UIC_M_SERVER`: UInt = 3077u;
public const val `SERVICE_UIC_M_SERVER_SEC_ERR`: UInt = 3085u;
public const val `SERVICE_UIC_M_THREADS`: UInt = 3072u;
public const val `SERVICE_UIC_M_UAS`: UInt = 3084u;
public const val `SERVICE_UIC_M_UAS_INVALID_ROLE`: UInt = 3095u;
public const val `SERVICE_UIC_M_UAS_MACHINE_ACCT`: UInt = 3092u;
public const val `SERVICE_UIC_M_UAS_PROLOG`: UInt = 3099u;
public const val `SERVICE_UIC_M_UAS_SERVERS_NMEMB`: UInt = 3093u;
public const val `SERVICE_UIC_M_UAS_SERVERS_NOGRP`: UInt = 3094u;
public const val `SERVICE_UIC_M_WKSTA`: UInt = 3087u;
public const val `SERVICE_UIC_NORMAL`: UInt = 0u;
public const val `SERVICE_UIC_RESOURCE`: UInt = 3054u;
public const val `SERVICE_UIC_SUBSERV`: UInt = 3062u;
public const val `SERVICE_UIC_SYSTEM`: UInt = 3056u;
public const val `SERVICE_UIC_UNKPARM`: UInt = 3053u;
public const val `SERVICE_UNINSTALLABLE`: UInt = 16u;
public const val `SERVICE_UNINSTALLED`: UInt = 0u;
public const val `SERVICE_UNINSTALL_PENDING`: UInt = 2u;
// UNSUPPORTED Rust 3896:1: non-scalar type Ptr unsupported
// pub const SERVICE_UPS: windows_sys::core::PCWSTR = windows_sys::core::w!("UPS");

// UNSUPPORTED Rust 3897:1: non-scalar type Ptr unsupported
// pub const SERVICE_W32TIME: windows_sys::core::PCWSTR = windows_sys::core::w!("w32time");

// UNSUPPORTED Rust 3898:1: non-scalar type Ptr unsupported
// pub const SERVICE_WORKSTATION: windows_sys::core::PCWSTR = windows_sys::core::w!("LanmanWorkstation");

// UNSUPPORTED Rust 3899:1: non-scalar type Ptr unsupported
// pub const SERVICE_XACTSRV: windows_sys::core::PCWSTR = windows_sys::core::w!("XACTSRV");

public const val `SESSION_CRYPT_KLEN`: UInt = 21u;
public const val `SESSION_PWLEN`: UInt = 24u;
public const val `SHPWLEN`: UInt = 8u;
// UNSUPPORTED Rust 3903:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SMB_COMPRESSION_INFO {
//     pub Switch: bool,
//     pub Reserved1: u8,
//     pub Reserved2: u16,
//     pub Reserved3: u32,
// }

// UNSUPPORTED Rust 3911:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SMB_TREE_CONNECT_PARAMETERS {
//     pub EABufferOffset: u32,
//     pub EABufferLen: u32,
//     pub CreateOptions: u32,
//     pub TreeConnectAttributes: u32,
// }

// UNSUPPORTED Rust 3919:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SMB_USE_OPTION_COMPRESSION_PARAMETERS {
//     pub Tag: u32,
//     pub Length: u16,
//     pub Reserved: u16,
// }

public const val `SNLEN`: UInt = 80u;
public const val `SRV_HASH_GENERATION_ACTIVE`: UInt = 2u;
public const val `SRV_SUPPORT_HASH_GENERATION`: UInt = 1u;
// UNSUPPORTED Rust 3929:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STD_ALERT {
//     pub alrt_timestamp: u32,
//     pub alrt_eventname: [u16; 17],
//     pub alrt_servicename: [u16; 81],
// }

// UNSUPPORTED Rust 3936:1: declaration Impl has no candidate rule
// impl Default for STD_ALERT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STXTLEN`: UInt = 256u;
public const val `SUPPORTS_ANY`: Int = -1;
public typealias `SUPPORTS_BINDING_INTERFACE_FLAGS` = Int;
public const val `SUPPORTS_LOCAL`: `NET_REMOTE_COMPUTER_SUPPORTS_OPTIONS` = 32u;
public const val `SUPPORTS_REMOTE_ADMIN_PROTOCOL`: `NET_REMOTE_COMPUTER_SUPPORTS_OPTIONS` = 2u;
public const val `SUPPORTS_RPC`: `NET_REMOTE_COMPUTER_SUPPORTS_OPTIONS` = 4u;
public const val `SUPPORTS_SAM_PROTOCOL`: `NET_REMOTE_COMPUTER_SUPPORTS_OPTIONS` = 8u;
public const val `SUPPORTS_UNICODE`: `NET_REMOTE_COMPUTER_SUPPORTS_OPTIONS` = 16u;
public const val `SVAUD_BADNETLOGON`: UInt = 384u;
public const val `SVAUD_BADSESSLOGON`: UInt = 24u;
public const val `SVAUD_BADUSE`: UInt = 6144u;
public const val `SVAUD_GOODNETLOGON`: UInt = 96u;
public const val `SVAUD_GOODSESSLOGON`: UInt = 6u;
public const val `SVAUD_GOODUSE`: UInt = 1536u;
public const val `SVAUD_LOGONLIM`: UInt = 65536u;
public const val `SVAUD_PERMISSIONS`: UInt = 16384u;
public const val `SVAUD_RESOURCE`: UInt = 32768u;
public const val `SVAUD_SERVICE`: UInt = 1u;
public const val `SVAUD_USERLIST`: UInt = 8192u;
public const val `SVI1_NUM_ELEMENTS`: UInt = 5u;
public const val `SVI2_NUM_ELEMENTS`: UInt = 40u;
public const val `SVI3_NUM_ELEMENTS`: UInt = 44u;
public const val `SVTI2_CLUSTER_DNN_NAME`: UInt = 16u;
public const val `SVTI2_CLUSTER_NAME`: UInt = 8u;
public const val `SVTI2_REMAP_PIPE_NAMES`: UInt = 2u;
public const val `SVTI2_RESERVED1`: UInt = 4096u;
public const val `SVTI2_RESERVED2`: UInt = 8192u;
public const val `SVTI2_RESERVED3`: UInt = 16384u;
public const val `SVTI2_SCOPED_NAME`: UInt = 4u;
public const val `SVTI2_UNICODE_TRANSPORT_ADDRESS`: UInt = 32u;
public const val `SV_ACCEPTDOWNLEVELAPIS_PARMNUM`: UInt = 517u;
public const val `SV_ACCESSALERT_PARMNUM`: UInt = 40u;
public const val `SV_ACTIVELOCKS_PARMNUM`: UInt = 419u;
public const val `SV_ALERTSCHEDULE_PARMNUM`: UInt = 547u;
public const val `SV_ALERTSCHED_PARMNUM`: UInt = 37u;
public const val `SV_ALERTS_PARMNUM`: UInt = 11u;
public const val `SV_ALIST_MTIME_PARMNUM`: UInt = 403u;
public const val `SV_ANNDELTA_PARMNUM`: UInt = 18u;
public const val `SV_ANNOUNCE_PARMNUM`: UInt = 17u;
public const val `SV_AUTOSHARESERVER_PARMNUM`: UInt = 592u;
public const val `SV_AUTOSHAREWKS_PARMNUM`: UInt = 591u;
public const val `SV_BALANCECOUNT_PARMNUM`: UInt = 577u;
public const val `SV_CACHEDDIRECTORYLIMIT_PARMNUM`: UInt = 587u;
public const val `SV_CACHEDOPENLIMIT_PARMNUM`: UInt = 571u;
public const val `SV_CHDEVJOBS_PARMNUM`: UInt = 411u;
public const val `SV_CHDEVQ_PARMNUM`: UInt = 410u;
public const val `SV_COMMENT_PARMNUM`: UInt = 5u;
public const val `SV_CONNECTIONLESSAUTODISC_PARMNUM`: UInt = 562u;
public const val `SV_CONNECTIONNOSESSIONSTIMEOUT_PARMNUM`: UInt = 596u;
public const val `SV_CONNECTIONS_PARMNUM`: UInt = 412u;
public const val `SV_CRITICALTHREADS_PARMNUM`: UInt = 572u;
public const val `SV_DISABLEDOS_PARMNUM`: UInt = 600u;
public const val `SV_DISABLESTRICTNAMECHECKING_PARMNUM`: UInt = 602u;
public const val `SV_DISC_PARMNUM`: UInt = 10u;
public const val `SV_DISKALERT_PARMNUM`: UInt = 41u;
public const val `SV_DISKSPACETHRESHOLD_PARMNUM`: UInt = 550u;
public const val `SV_DOMAIN_PARMNUM`: UInt = 519u;
public const val `SV_ENABLEAUTHENTICATEUSERSHARING_PARMNUM`: UInt = 603u;
public const val `SV_ENABLECOMPRESSION_PARMNUM`: UInt = 590u;
public const val `SV_ENABLEFCBOPENS_PARMNUM`: UInt = 538u;
public const val `SV_ENABLEFORCEDLOGOFF_PARMNUM`: UInt = 515u;
public const val `SV_ENABLEOPLOCKFORCECLOSE_PARMNUM`: UInt = 537u;
public const val `SV_ENABLEOPLOCKS_PARMNUM`: UInt = 536u;
public const val `SV_ENABLERAW_PARMNUM`: UInt = 539u;
public const val `SV_ENABLESECURITYSIGNATURE_PARMNUM`: UInt = 593u;
public const val `SV_ENABLESHAREDNETDRIVES_PARMNUM`: UInt = 540u;
public const val `SV_ENABLESOFTCOMPAT_PARMNUM`: UInt = 514u;
public const val `SV_ENABLEW9XSECURITYSIGNATURE_PARMNUM`: UInt = 598u;
public const val `SV_ENABLEWFW311DIRECTIPX_PARMNUM`: UInt = 574u;
public const val `SV_ENFORCEKERBEROSREAUTHENTICATION_PARMNUM`: UInt = 599u;
public const val `SV_ERRORALERT_PARMNUM`: UInt = 38u;
public const val `SV_ERRORTHRESHOLD_PARMNUM`: UInt = 548u;
public const val `SV_GLIST_MTIME_PARMNUM`: UInt = 402u;
public const val `SV_GUESTACC_PARMNUM`: UInt = 408u;
public const val `SV_HIDDEN`: `SERVER_INFO_HIDDEN` = 1;
public const val `SV_HIDDEN_PARMNUM`: UInt = 16u;
public const val `SV_IDLETHREADTIMEOUT_PARMNUM`: UInt = 597u;
public const val `SV_INITCONNTABLE_PARMNUM`: UInt = 544u;
public const val `SV_INITFILETABLE_PARMNUM`: UInt = 545u;
public const val `SV_INITSEARCHTABLE_PARMNUM`: UInt = 546u;
public const val `SV_INITSESSTABLE_PARMNUM`: UInt = 543u;
public const val `SV_INITWORKITEMS_PARMNUM`: UInt = 505u;
public const val `SV_IRPSTACKSIZE_PARMNUM`: UInt = 508u;
public const val `SV_LANMASK_PARMNUM`: UInt = 407u;
public const val `SV_LINKINFOVALIDTIME_PARMNUM`: UInt = 554u;
public const val `SV_LMANNOUNCE_PARMNUM`: UInt = 518u;
public const val `SV_LOCKVIOLATIONDELAY_PARMNUM`: UInt = 569u;
public const val `SV_LOCKVIOLATIONOFFSET_PARMNUM`: UInt = 568u;
public const val `SV_LOCKVIOLATIONRETRIES_PARMNUM`: UInt = 567u;
public const val `SV_LOGONALERT_PARMNUM`: UInt = 39u;
public const val `SV_LOWDISKSPACEMINIMUM_PARMNUM`: UInt = 601u;
public const val `SV_MAXAUDITSZ_PARMNUM`: UInt = 43u;
public const val `SV_MAXCOPYLENGTH_PARMNUM`: UInt = 588u;
public const val `SV_MAXCOPYREADLEN_PARMNUM`: UInt = 520u;
public const val `SV_MAXCOPYWRITELEN_PARMNUM`: UInt = 521u;
public const val `SV_MAXFREECONNECTIONS_PARMNUM`: UInt = 542u;
public const val `SV_MAXFREELFCBS_PARMNUM`: UInt = 581u;
public const val `SV_MAXFREEMFCBS_PARMNUM`: UInt = 580u;
public const val `SV_MAXFREEPAGEDPOOLCHUNKS_PARMNUM`: UInt = 582u;
public const val `SV_MAXFREERFCBS_PARMNUM`: UInt = 579u;
public const val `SV_MAXGLOBALOPENSEARCH_PARMNUM`: UInt = 565u;
public const val `SV_MAXKEEPCOMPLSEARCH_PARMNUM`: UInt = 525u;
public const val `SV_MAXKEEPSEARCH_PARMNUM`: UInt = 523u;
public const val `SV_MAXLINKDELAY_PARMNUM`: UInt = 552u;
public const val `SV_MAXMPXCT_PARMNUM`: UInt = 533u;
public const val `SV_MAXNONPAGEDMEMORYUSAGE_PARMNUM`: UInt = 512u;
public const val `SV_MAXPAGEDMEMORYUSAGE_PARMNUM`: UInt = 513u;
public const val `SV_MAXPAGEDPOOLCHUNKSIZE_PARMNUM`: UInt = 584u;
public const val `SV_MAXRAWBUFLEN_PARMNUM`: UInt = 509u;
public const val `SV_MAXRAWWORKITEMS_PARMNUM`: UInt = 557u;
public const val `SV_MAXTHREADSPERQUEUE_PARMNUM`: UInt = 586u;
public const val `SV_MAXWORKITEMIDLETIME_PARMNUM`: UInt = 556u;
public const val `SV_MAXWORKITEMS_PARMNUM`: UInt = 506u;
public const val `SV_MAX_CMD_LEN`: UInt = 256u;
public const val `SV_MAX_SRV_HEUR_LEN`: UInt = 32u;
public const val `SV_MDLREADSWITCHOVER_PARMNUM`: UInt = 570u;
public const val `SV_MINCLIENTBUFFERSIZE_PARMNUM`: UInt = 595u;
public const val `SV_MINFREECONNECTIONS_PARMNUM`: UInt = 541u;
public const val `SV_MINFREEWORKITEMS_PARMNUM`: UInt = 530u;
public const val `SV_MINKEEPCOMPLSEARCH_PARMNUM`: UInt = 524u;
public const val `SV_MINKEEPSEARCH_PARMNUM`: UInt = 522u;
public const val `SV_MINLINKTHROUGHPUT_PARMNUM`: UInt = 553u;
public const val `SV_MINPAGEDPOOLCHUNKSIZE_PARMNUM`: UInt = 583u;
public const val `SV_MINRCVQUEUE_PARMNUM`: UInt = 529u;
public const val `SV_NAME_PARMNUM`: UInt = 102u;
public const val `SV_NETIOALERT_PARMNUM`: UInt = 42u;
public const val `SV_NETWORKERRORTHRESHOLD_PARMNUM`: UInt = 549u;
public const val `SV_NODISC`: Int = -1;
public const val `SV_NUMADMIN_PARMNUM`: UInt = 406u;
public const val `SV_NUMBIGBUF_PARMNUM`: UInt = 422u;
public const val `SV_NUMBLOCKTHREADS_PARMNUM`: UInt = 527u;
public const val `SV_NUMFILETASKS_PARMNUM`: UInt = 423u;
public const val `SV_NUMREQBUF_PARMNUM`: UInt = 420u;
public const val `SV_OPENFILES_PARMNUM`: UInt = 414u;
public const val `SV_OPENSEARCH_PARMNUM`: UInt = 503u;
public const val `SV_OPLOCKBREAKRESPONSEWAIT_PARMNUM`: UInt = 535u;
public const val `SV_OPLOCKBREAKWAIT_PARMNUM`: UInt = 534u;
public const val `SV_OTHERQUEUEAFFINITY_PARMNUM`: UInt = 575u;
public const val `SV_PLATFORM_ID_NT`: UInt = 500u;
public const val `SV_PLATFORM_ID_OS2`: UInt = 400u;
public const val `SV_PLATFORM_ID_PARMNUM`: UInt = 101u;
public const val `SV_PREFERREDAFFINITY_PARMNUM`: UInt = 578u;
public const val `SV_PRODUCTTYPE_PARMNUM`: UInt = 560u;
public const val `SV_QUEUESAMPLESECS_PARMNUM`: UInt = 576u;
public const val `SV_RAWWORKITEMS_PARMNUM`: UInt = 507u;
public const val `SV_REMOVEDUPLICATESEARCHES_PARMNUM`: UInt = 566u;
public const val `SV_REQUIRESECURITYSIGNATURE_PARMNUM`: UInt = 594u;
public const val `SV_RESTRICTNULLSESSACCESS_PARMNUM`: UInt = 573u;
public const val `SV_SCAVQOSINFOUPDATETIME_PARMNUM`: UInt = 555u;
public const val `SV_SCAVTIMEOUT_PARMNUM`: UInt = 528u;
public const val `SV_SECURITY_PARMNUM`: UInt = 405u;
public const val `SV_SENDSFROMPREFERREDPROCESSOR_PARMNUM`: UInt = 585u;
public const val `SV_SERVERSIZE_PARMNUM`: UInt = 561u;
public const val `SV_SESSCONNS_PARMNUM`: UInt = 511u;
public const val `SV_SESSOPENS_PARMNUM`: UInt = 501u;
public const val `SV_SESSREQS_PARMNUM`: UInt = 417u;
public const val `SV_SESSUSERS_PARMNUM`: UInt = 510u;
public const val `SV_SESSVCS_PARMNUM`: UInt = 502u;
public const val `SV_SHARESECURITY`: `SERVER_INFO_SECURITY` = 0u;
public const val `SV_SHARES_PARMNUM`: UInt = 413u;
public const val `SV_SHARINGVIOLATIONDELAY_PARMNUM`: UInt = 564u;
public const val `SV_SHARINGVIOLATIONRETRIES_PARMNUM`: UInt = 563u;
public const val `SV_SIZREQBUF_PARMNUM`: UInt = 504u;
public const val `SV_SRVHEURISTICS_PARMNUM`: UInt = 431u;
public const val `SV_THREADCOUNTADD_PARMNUM`: UInt = 526u;
public const val `SV_THREADPRIORITY_PARMNUM`: UInt = 532u;
public const val `SV_TIMESOURCE_PARMNUM`: UInt = 516u;
public const val `SV_TYPE_AFP`: `NET_SERVER_TYPE` = 64u;
public const val `SV_TYPE_ALL`: `NET_SERVER_TYPE` = 4294967295u;
public const val `SV_TYPE_ALTERNATE_XPORT`: `NET_SERVER_TYPE` = 536870912u;
public const val `SV_TYPE_BACKUP_BROWSER`: `NET_SERVER_TYPE` = 131072u;
public const val `SV_TYPE_CLUSTER_NT`: `NET_SERVER_TYPE` = 16777216u;
public const val `SV_TYPE_CLUSTER_VS_NT`: `NET_SERVER_TYPE` = 67108864u;
public const val `SV_TYPE_DCE`: `NET_SERVER_TYPE` = 268435456u;
public const val `SV_TYPE_DFS`: `NET_SERVER_TYPE` = 8388608u;
public const val `SV_TYPE_DIALIN_SERVER`: `NET_SERVER_TYPE` = 1024u;
public const val `SV_TYPE_DOMAIN_BAKCTRL`: `NET_SERVER_TYPE` = 16u;
public const val `SV_TYPE_DOMAIN_CTRL`: `NET_SERVER_TYPE` = 8u;
public const val `SV_TYPE_DOMAIN_ENUM`: `NET_SERVER_TYPE` = 2147483648u;
public const val `SV_TYPE_DOMAIN_MASTER`: `NET_SERVER_TYPE` = 524288u;
public const val `SV_TYPE_DOMAIN_MEMBER`: `NET_SERVER_TYPE` = 256u;
public const val `SV_TYPE_LOCAL_LIST_ONLY`: `NET_SERVER_TYPE` = 1073741824u;
public const val `SV_TYPE_MASTER_BROWSER`: `NET_SERVER_TYPE` = 262144u;
public const val `SV_TYPE_NOVELL`: `NET_SERVER_TYPE` = 128u;
public const val `SV_TYPE_NT`: `NET_SERVER_TYPE` = 4096u;
public const val `SV_TYPE_PARMNUM`: UInt = 105u;
public const val `SV_TYPE_POTENTIAL_BROWSER`: `NET_SERVER_TYPE` = 65536u;
public const val `SV_TYPE_PRINTQ_SERVER`: `NET_SERVER_TYPE` = 512u;
public const val `SV_TYPE_SERVER`: `NET_SERVER_TYPE` = 2u;
public const val `SV_TYPE_SERVER_MFPN`: `NET_SERVER_TYPE` = 16384u;
public const val `SV_TYPE_SERVER_NT`: `NET_SERVER_TYPE` = 32768u;
public const val `SV_TYPE_SERVER_OSF`: `NET_SERVER_TYPE` = 1048576u;
public const val `SV_TYPE_SERVER_UNIX`: `NET_SERVER_TYPE` = 2048u;
public const val `SV_TYPE_SERVER_VMS`: `NET_SERVER_TYPE` = 2097152u;
public const val `SV_TYPE_SQLSERVER`: `NET_SERVER_TYPE` = 4u;
public const val `SV_TYPE_TERMINALSERVER`: `NET_SERVER_TYPE` = 33554432u;
public const val `SV_TYPE_TIME_SOURCE`: `NET_SERVER_TYPE` = 32u;
public const val `SV_TYPE_WFW`: `NET_SERVER_TYPE` = 8192u;
public const val `SV_TYPE_WINDOWS`: `NET_SERVER_TYPE` = 4194304u;
public const val `SV_TYPE_WORKSTATION`: `NET_SERVER_TYPE` = 1u;
public const val `SV_TYPE_XENIX_SERVER`: `NET_SERVER_TYPE` = 2048u;
public const val `SV_ULIST_MTIME_PARMNUM`: UInt = 401u;
public const val `SV_USERPATH_PARMNUM`: UInt = 112u;
public const val `SV_USERSECURITY`: `SERVER_INFO_SECURITY` = 1u;
public const val `SV_USERS_PARMNUM`: UInt = 107u;
public const val `SV_USERS_PER_LICENSE`: UInt = 5u;
public const val `SV_VERSION_MAJOR_PARMNUM`: UInt = 103u;
public const val `SV_VERSION_MINOR_PARMNUM`: UInt = 104u;
public const val `SV_VISIBLE`: `SERVER_INFO_HIDDEN` = 0;
public const val `SV_XACTMEMSIZE_PARMNUM`: UInt = 531u;
public const val `SW_AUTOPROF_LOAD_MASK`: UInt = 1u;
public const val `SW_AUTOPROF_SAVE_MASK`: UInt = 2u;
// UNSUPPORTED Rust 4153:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ServiceAccountPasswordGUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x262e99c9_6160_4871_acec_4e61736b6f21);

// UNSUPPORTED Rust 4154:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TIME_OF_DAY_INFO {
//     pub tod_elapsedt: u32,
//     pub tod_msecs: u32,
//     pub tod_hours: u32,
//     pub tod_mins: u32,
//     pub tod_secs: u32,
//     pub tod_hunds: u32,
//     pub tod_timezone: i32,
//     pub tod_tinterval: u32,
//     pub tod_day: u32,
//     pub tod_month: u32,
//     pub tod_year: u32,
//     pub tod_weekday: u32,
// }

public const val `TITLE_SC_MESSAGE_BOX`: Int = -1073734795;
public const val `TRACE_NO_STDINFO`: UInt = 1u;
public const val `TRACE_NO_SYNCH`: UInt = 4u;
public const val `TRACE_USE_CONSOLE`: UInt = 2u;
public const val `TRACE_USE_DATE`: UInt = 8u;
public const val `TRACE_USE_FILE`: UInt = 1u;
public const val `TRACE_USE_MASK`: UInt = 2u;
public const val `TRACE_USE_MSEC`: UInt = 4u;
// UNSUPPORTED Rust 4178:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TRANSPORT_INFO {
//     pub Type: TRANSPORT_TYPE,
//     pub SkipCertificateCheck: bool,
// }

public const val `TRANSPORT_NAME_PARMNUM`: UInt = 202u;
public const val `TRANSPORT_QUALITYOFSERVICE_PARMNUM`: UInt = 201u;
public typealias `TRANSPORT_TYPE` = Int;
public const val `UAS_ROLE_BACKUP`: `USER_MODALS_ROLES` = 2u;
public const val `UAS_ROLE_MEMBER`: `USER_MODALS_ROLES` = 1u;
public const val `UAS_ROLE_PRIMARY`: `USER_MODALS_ROLES` = 3u;
public const val `UAS_ROLE_STANDALONE`: `USER_MODALS_ROLES` = 0u;
public const val `UF_ACCOUNTDISABLE`: `USER_ACCOUNT_FLAGS` = 2u;
public const val `UF_DONT_EXPIRE_PASSWD`: `USER_ACCOUNT_FLAGS` = 65536u;
public const val `UF_DONT_REQUIRE_PREAUTH`: `USER_ACCOUNT_FLAGS` = 4194304u;
public const val `UF_ENCRYPTED_TEXT_PASSWORD_ALLOWED`: `USER_ACCOUNT_FLAGS` = 128u;
public const val `UF_HOMEDIR_REQUIRED`: `USER_ACCOUNT_FLAGS` = 8u;
public const val `UF_INTERDOMAIN_TRUST_ACCOUNT`: UInt = 2048u;
public const val `UF_LOCKOUT`: `USER_ACCOUNT_FLAGS` = 16u;
public const val `UF_MNS_LOGON_ACCOUNT`: UInt = 131072u;
public const val `UF_NORMAL_ACCOUNT`: UInt = 512u;
public const val `UF_NOT_DELEGATED`: `USER_ACCOUNT_FLAGS` = 1048576u;
public const val `UF_NO_AUTH_DATA_REQUIRED`: UInt = 33554432u;
public const val `UF_PARTIAL_SECRETS_ACCOUNT`: UInt = 67108864u;
public const val `UF_PASSWD_CANT_CHANGE`: `USER_ACCOUNT_FLAGS` = 64u;
public const val `UF_PASSWD_NOTREQD`: `USER_ACCOUNT_FLAGS` = 32u;
public const val `UF_PASSWORD_EXPIRED`: `USER_ACCOUNT_FLAGS` = 8388608u;
public const val `UF_SCRIPT`: `USER_ACCOUNT_FLAGS` = 1u;
public const val `UF_SERVER_TRUST_ACCOUNT`: UInt = 8192u;
public const val `UF_SMARTCARD_REQUIRED`: `USER_ACCOUNT_FLAGS` = 262144u;
public const val `UF_TEMP_DUPLICATE_ACCOUNT`: UInt = 256u;
public const val `UF_TRUSTED_FOR_DELEGATION`: `USER_ACCOUNT_FLAGS` = 524288u;
public const val `UF_TRUSTED_TO_AUTHENTICATE_FOR_DELEGATION`: `USER_ACCOUNT_FLAGS` = 16777216u;
public const val `UF_USE_AES_KEYS`: UInt = 134217728u;
public const val `UF_USE_DES_KEY_ONLY`: `USER_ACCOUNT_FLAGS` = 2097152u;
public const val `UF_WORKSTATION_TRUST_ACCOUNT`: UInt = 4096u;
public const val `UNCLEN`: UInt = 17u;
public const val `UNITS_PER_DAY`: UInt = 24u;
public const val `UNLEN`: UInt = 256u;
public const val `UPPER_GET_HINT_MASK`: UInt = 267386880u;
public const val `UPPER_HINT_MASK`: UInt = 65280u;
public typealias `USER_ACCOUNT_FLAGS` = UInt;
public const val `USER_ACCT_EXPIRES_PARMNUM`: UInt = 17u;
public const val `USER_AUTH_FLAGS_PARMNUM`: UInt = 10u;
public const val `USER_CODE_PAGE_PARMNUM`: UInt = 25u;
public const val `USER_COMMENT_PARMNUM`: UInt = 7u;
public const val `USER_COUNTRY_CODE_PARMNUM`: UInt = 24u;
public const val `USER_FLAGS_PARMNUM`: UInt = 8u;
public const val `USER_FULL_NAME_PARMNUM`: UInt = 11u;
public const val `USER_HOME_DIR_DRIVE_PARMNUM`: UInt = 53u;
public const val `USER_HOME_DIR_PARMNUM`: UInt = 6u;
// UNSUPPORTED Rust 4230:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_0 {
//     pub usri0_name: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4235:1: declaration Impl has no candidate rule
// impl Default for USER_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4240:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_1 {
//     pub usri1_name: windows_sys::core::PWSTR,
//     pub usri1_password: windows_sys::core::PWSTR,
//     pub usri1_password_age: u32,
//     pub usri1_priv: USER_PRIV,
//     pub usri1_home_dir: windows_sys::core::PWSTR,
//     pub usri1_comment: windows_sys::core::PWSTR,
//     pub usri1_flags: USER_ACCOUNT_FLAGS,
//     pub usri1_script_path: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4252:1: declaration Impl has no candidate rule
// impl Default for USER_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4257:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_10 {
//     pub usri10_name: windows_sys::core::PWSTR,
//     pub usri10_comment: windows_sys::core::PWSTR,
//     pub usri10_usr_comment: windows_sys::core::PWSTR,
//     pub usri10_full_name: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4265:1: declaration Impl has no candidate rule
// impl Default for USER_INFO_10 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4270:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_1003 {
//     pub usri1003_password: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4275:1: declaration Impl has no candidate rule
// impl Default for USER_INFO_1003 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4280:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USER_INFO_1005 {
//     pub usri1005_priv: USER_PRIV,
// }

// UNSUPPORTED Rust 4285:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_1006 {
//     pub usri1006_home_dir: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4290:1: declaration Impl has no candidate rule
// impl Default for USER_INFO_1006 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4295:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_1007 {
//     pub usri1007_comment: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4300:1: declaration Impl has no candidate rule
// impl Default for USER_INFO_1007 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4305:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USER_INFO_1008 {
//     pub usri1008_flags: USER_ACCOUNT_FLAGS,
// }

// UNSUPPORTED Rust 4310:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_1009 {
//     pub usri1009_script_path: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4315:1: declaration Impl has no candidate rule
// impl Default for USER_INFO_1009 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4320:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USER_INFO_1010 {
//     pub usri1010_auth_flags: AF_OP,
// }

// UNSUPPORTED Rust 4325:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_1011 {
//     pub usri1011_full_name: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4330:1: declaration Impl has no candidate rule
// impl Default for USER_INFO_1011 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4335:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_1012 {
//     pub usri1012_usr_comment: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4340:1: declaration Impl has no candidate rule
// impl Default for USER_INFO_1012 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4345:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_1013 {
//     pub usri1013_parms: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4350:1: declaration Impl has no candidate rule
// impl Default for USER_INFO_1013 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4355:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_1014 {
//     pub usri1014_workstations: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4360:1: declaration Impl has no candidate rule
// impl Default for USER_INFO_1014 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4365:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USER_INFO_1017 {
//     pub usri1017_acct_expires: u32,
// }

// UNSUPPORTED Rust 4370:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USER_INFO_1018 {
//     pub usri1018_max_storage: u32,
// }

// UNSUPPORTED Rust 4375:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_1020 {
//     pub usri1020_units_per_week: u32,
//     pub usri1020_logon_hours: *mut u8,
// }

// UNSUPPORTED Rust 4381:1: declaration Impl has no candidate rule
// impl Default for USER_INFO_1020 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4386:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_1023 {
//     pub usri1023_logon_server: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4391:1: declaration Impl has no candidate rule
// impl Default for USER_INFO_1023 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4396:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USER_INFO_1024 {
//     pub usri1024_country_code: u32,
// }

// UNSUPPORTED Rust 4401:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USER_INFO_1025 {
//     pub usri1025_code_page: u32,
// }

// UNSUPPORTED Rust 4406:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USER_INFO_1051 {
//     pub usri1051_primary_group_id: u32,
// }

// UNSUPPORTED Rust 4411:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_1052 {
//     pub usri1052_profile: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4416:1: declaration Impl has no candidate rule
// impl Default for USER_INFO_1052 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4421:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_1053 {
//     pub usri1053_home_dir_drive: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4426:1: declaration Impl has no candidate rule
// impl Default for USER_INFO_1053 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4431:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_11 {
//     pub usri11_name: windows_sys::core::PWSTR,
//     pub usri11_comment: windows_sys::core::PWSTR,
//     pub usri11_usr_comment: windows_sys::core::PWSTR,
//     pub usri11_full_name: windows_sys::core::PWSTR,
//     pub usri11_priv: USER_PRIV,
//     pub usri11_auth_flags: AF_OP,
//     pub usri11_password_age: u32,
//     pub usri11_home_dir: windows_sys::core::PWSTR,
//     pub usri11_parms: windows_sys::core::PWSTR,
//     pub usri11_last_logon: u32,
//     pub usri11_last_logoff: u32,
//     pub usri11_bad_pw_count: u32,
//     pub usri11_num_logons: u32,
//     pub usri11_logon_server: windows_sys::core::PWSTR,
//     pub usri11_country_code: u32,
//     pub usri11_workstations: windows_sys::core::PWSTR,
//     pub usri11_max_storage: u32,
//     pub usri11_units_per_week: u32,
//     pub usri11_logon_hours: *mut u8,
//     pub usri11_code_page: u32,
// }

// UNSUPPORTED Rust 4455:1: declaration Impl has no candidate rule
// impl Default for USER_INFO_11 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4460:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_2 {
//     pub usri2_name: windows_sys::core::PWSTR,
//     pub usri2_password: windows_sys::core::PWSTR,
//     pub usri2_password_age: u32,
//     pub usri2_priv: USER_PRIV,
//     pub usri2_home_dir: windows_sys::core::PWSTR,
//     pub usri2_comment: windows_sys::core::PWSTR,
//     pub usri2_flags: USER_ACCOUNT_FLAGS,
//     pub usri2_script_path: windows_sys::core::PWSTR,
//     pub usri2_auth_flags: AF_OP,
//     pub usri2_full_name: windows_sys::core::PWSTR,
//     pub usri2_usr_comment: windows_sys::core::PWSTR,
//     pub usri2_parms: windows_sys::core::PWSTR,
//     pub usri2_workstations: windows_sys::core::PWSTR,
//     pub usri2_last_logon: u32,
//     pub usri2_last_logoff: u32,
//     pub usri2_acct_expires: u32,
//     pub usri2_max_storage: u32,
//     pub usri2_units_per_week: u32,
//     pub usri2_logon_hours: *mut u8,
//     pub usri2_bad_pw_count: u32,
//     pub usri2_num_logons: u32,
//     pub usri2_logon_server: windows_sys::core::PWSTR,
//     pub usri2_country_code: u32,
//     pub usri2_code_page: u32,
// }

// UNSUPPORTED Rust 4488:1: declaration Impl has no candidate rule
// impl Default for USER_INFO_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4493:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_20 {
//     pub usri20_name: windows_sys::core::PWSTR,
//     pub usri20_full_name: windows_sys::core::PWSTR,
//     pub usri20_comment: windows_sys::core::PWSTR,
//     pub usri20_flags: USER_ACCOUNT_FLAGS,
//     pub usri20_user_id: u32,
// }

// UNSUPPORTED Rust 4502:1: declaration Impl has no candidate rule
// impl Default for USER_INFO_20 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4507:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_21 {
//     pub usri21_password: [u8; 16],
// }

// UNSUPPORTED Rust 4512:1: declaration Impl has no candidate rule
// impl Default for USER_INFO_21 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4517:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_22 {
//     pub usri22_name: windows_sys::core::PWSTR,
//     pub usri22_password: [u8; 16],
//     pub usri22_password_age: u32,
//     pub usri22_priv: USER_PRIV,
//     pub usri22_home_dir: windows_sys::core::PWSTR,
//     pub usri22_comment: windows_sys::core::PWSTR,
//     pub usri22_flags: USER_ACCOUNT_FLAGS,
//     pub usri22_script_path: windows_sys::core::PWSTR,
//     pub usri22_auth_flags: AF_OP,
//     pub usri22_full_name: windows_sys::core::PWSTR,
//     pub usri22_usr_comment: windows_sys::core::PWSTR,
//     pub usri22_parms: windows_sys::core::PWSTR,
//     pub usri22_workstations: windows_sys::core::PWSTR,
//     pub usri22_last_logon: u32,
//     pub usri22_last_logoff: u32,
//     pub usri22_acct_expires: u32,
//     pub usri22_max_storage: u32,
//     pub usri22_units_per_week: u32,
//     pub usri22_logon_hours: *mut u8,
//     pub usri22_bad_pw_count: u32,
//     pub usri22_num_logons: u32,
//     pub usri22_logon_server: windows_sys::core::PWSTR,
//     pub usri22_country_code: u32,
//     pub usri22_code_page: u32,
// }

// UNSUPPORTED Rust 4545:1: declaration Impl has no candidate rule
// impl Default for USER_INFO_22 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4550:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_23 {
//     pub usri23_name: windows_sys::core::PWSTR,
//     pub usri23_full_name: windows_sys::core::PWSTR,
//     pub usri23_comment: windows_sys::core::PWSTR,
//     pub usri23_flags: USER_ACCOUNT_FLAGS,
//     pub usri23_user_sid: super::super::Security::PSID,
// }

// UNSUPPORTED Rust 4560:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for USER_INFO_23 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4566:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_24 {
//     pub usri24_internet_identity: windows_sys::core::BOOL,
//     pub usri24_flags: u32,
//     pub usri24_internet_provider_name: windows_sys::core::PWSTR,
//     pub usri24_internet_principal_name: windows_sys::core::PWSTR,
//     pub usri24_user_sid: super::super::Security::PSID,
// }

// UNSUPPORTED Rust 4576:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for USER_INFO_24 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4582:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_3 {
//     pub usri3_name: windows_sys::core::PWSTR,
//     pub usri3_password: windows_sys::core::PWSTR,
//     pub usri3_password_age: u32,
//     pub usri3_priv: USER_PRIV,
//     pub usri3_home_dir: windows_sys::core::PWSTR,
//     pub usri3_comment: windows_sys::core::PWSTR,
//     pub usri3_flags: USER_ACCOUNT_FLAGS,
//     pub usri3_script_path: windows_sys::core::PWSTR,
//     pub usri3_auth_flags: AF_OP,
//     pub usri3_full_name: windows_sys::core::PWSTR,
//     pub usri3_usr_comment: windows_sys::core::PWSTR,
//     pub usri3_parms: windows_sys::core::PWSTR,
//     pub usri3_workstations: windows_sys::core::PWSTR,
//     pub usri3_last_logon: u32,
//     pub usri3_last_logoff: u32,
//     pub usri3_acct_expires: u32,
//     pub usri3_max_storage: u32,
//     pub usri3_units_per_week: u32,
//     pub usri3_logon_hours: *mut u8,
//     pub usri3_bad_pw_count: u32,
//     pub usri3_num_logons: u32,
//     pub usri3_logon_server: windows_sys::core::PWSTR,
//     pub usri3_country_code: u32,
//     pub usri3_code_page: u32,
//     pub usri3_user_id: u32,
//     pub usri3_primary_group_id: u32,
//     pub usri3_profile: windows_sys::core::PWSTR,
//     pub usri3_home_dir_drive: windows_sys::core::PWSTR,
//     pub usri3_password_expired: u32,
// }

// UNSUPPORTED Rust 4615:1: declaration Impl has no candidate rule
// impl Default for USER_INFO_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4620:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct USER_INFO_4 {
//     pub usri4_name: windows_sys::core::PWSTR,
//     pub usri4_password: windows_sys::core::PWSTR,
//     pub usri4_password_age: u32,
//     pub usri4_priv: USER_PRIV,
//     pub usri4_home_dir: windows_sys::core::PWSTR,
//     pub usri4_comment: windows_sys::core::PWSTR,
//     pub usri4_flags: USER_ACCOUNT_FLAGS,
//     pub usri4_script_path: windows_sys::core::PWSTR,
//     pub usri4_auth_flags: AF_OP,
//     pub usri4_full_name: windows_sys::core::PWSTR,
//     pub usri4_usr_comment: windows_sys::core::PWSTR,
//     pub usri4_parms: windows_sys::core::PWSTR,
//     pub usri4_workstations: windows_sys::core::PWSTR,
//     pub usri4_last_logon: u32,
//     pub usri4_last_logoff: u32,
//     pub usri4_acct_expires: u32,
//     pub usri4_max_storage: u32,
//     pub usri4_units_per_week: u32,
//     pub usri4_logon_hours: *mut u8,
//     pub usri4_bad_pw_count: u32,
//     pub usri4_num_logons: u32,
//     pub usri4_logon_server: windows_sys::core::PWSTR,
//     pub usri4_country_code: u32,
//     pub usri4_code_page: u32,
//     pub usri4_user_sid: super::super::Security::PSID,
//     pub usri4_primary_group_id: u32,
//     pub usri4_profile: windows_sys::core::PWSTR,
//     pub usri4_home_dir_drive: windows_sys::core::PWSTR,
//     pub usri4_password_expired: u32,
// }

// UNSUPPORTED Rust 4654:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for USER_INFO_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USER_LAST_LOGOFF_PARMNUM`: UInt = 16u;
public const val `USER_LAST_LOGON_PARMNUM`: UInt = 15u;
public const val `USER_LOGON_HOURS_PARMNUM`: UInt = 20u;
public const val `USER_LOGON_SERVER_PARMNUM`: UInt = 23u;
public const val `USER_MAX_STORAGE_PARMNUM`: UInt = 18u;
// UNSUPPORTED Rust 4665:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USER_MODALS_INFO_0 {
//     pub usrmod0_min_passwd_len: u32,
//     pub usrmod0_max_passwd_age: u32,
//     pub usrmod0_min_passwd_age: u32,
//     pub usrmod0_force_logoff: u32,
//     pub usrmod0_password_hist_len: u32,
// }

// UNSUPPORTED Rust 4674:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USER_MODALS_INFO_1 {
//     pub usrmod1_role: u32,
//     pub usrmod1_primary: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4680:1: declaration Impl has no candidate rule
// impl Default for USER_MODALS_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4685:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USER_MODALS_INFO_1001 {
//     pub usrmod1001_min_passwd_len: u32,
// }

// UNSUPPORTED Rust 4690:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USER_MODALS_INFO_1002 {
//     pub usrmod1002_max_passwd_age: u32,
// }

// UNSUPPORTED Rust 4695:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USER_MODALS_INFO_1003 {
//     pub usrmod1003_min_passwd_age: u32,
// }

// UNSUPPORTED Rust 4700:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USER_MODALS_INFO_1004 {
//     pub usrmod1004_force_logoff: u32,
// }

// UNSUPPORTED Rust 4705:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USER_MODALS_INFO_1005 {
//     pub usrmod1005_password_hist_len: u32,
// }

// UNSUPPORTED Rust 4710:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USER_MODALS_INFO_1006 {
//     pub usrmod1006_role: USER_MODALS_ROLES,
// }

// UNSUPPORTED Rust 4715:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USER_MODALS_INFO_1007 {
//     pub usrmod1007_primary: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4720:1: declaration Impl has no candidate rule
// impl Default for USER_MODALS_INFO_1007 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4725:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct USER_MODALS_INFO_2 {
//     pub usrmod2_domain_name: windows_sys::core::PWSTR,
//     pub usrmod2_domain_id: super::super::Security::PSID,
// }

// UNSUPPORTED Rust 4732:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for USER_MODALS_INFO_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4738:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USER_MODALS_INFO_3 {
//     pub usrmod3_lockout_duration: u32,
//     pub usrmod3_lockout_observation_window: u32,
//     pub usrmod3_lockout_threshold: u32,
// }

public typealias `USER_MODALS_ROLES` = UInt;
public const val `USER_NAME_PARMNUM`: UInt = 1u;
public const val `USER_NUM_LOGONS_PARMNUM`: UInt = 22u;
// UNSUPPORTED Rust 4748:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USER_OTHER_INFO {
//     pub alrtus_errcode: u32,
//     pub alrtus_numstrings: u32,
// }

public const val `USER_PAD_PW_COUNT_PARMNUM`: UInt = 21u;
public const val `USER_PARMS_PARMNUM`: UInt = 13u;
public const val `USER_PASSWORD_AGE_PARMNUM`: UInt = 4u;
public const val `USER_PASSWORD_PARMNUM`: UInt = 3u;
public const val `USER_PRIMARY_GROUP_PARMNUM`: UInt = 51u;
public typealias `USER_PRIV` = UInt;
public const val `USER_PRIV_ADMIN`: `USER_PRIV` = 2u;
public const val `USER_PRIV_GUEST`: `USER_PRIV` = 0u;
public const val `USER_PRIV_MASK`: UInt = 3u;
public const val `USER_PRIV_PARMNUM`: UInt = 5u;
public const val `USER_PRIV_USER`: `USER_PRIV` = 1u;
public const val `USER_PROFILE`: UInt = 52u;
public const val `USER_PROFILE_PARMNUM`: UInt = 52u;
public const val `USER_SCRIPT_PATH_PARMNUM`: UInt = 9u;
public const val `USER_UNITS_PER_WEEK_PARMNUM`: UInt = 19u;
public const val `USER_USR_COMMENT_PARMNUM`: UInt = 12u;
public const val `USER_WORKSTATIONS_PARMNUM`: UInt = 14u;
public const val `USE_ASGTYPE_PARMNUM`: UInt = 4u;
public const val `USE_AUTHIDENTITY_PARMNUM`: UInt = 8u;
public const val `USE_CHARDEV`: UInt = 2u;
public const val `USE_CONN`: UInt = 4u;
public const val `USE_DEFAULT_CREDENTIALS`: UInt = 4u;
public const val `USE_DISCONN`: UInt = 2u;
public const val `USE_DISKDEV`: `USE_INFO_ASG_TYPE` = 0u;
public const val `USE_DOMAINNAME_PARMNUM`: UInt = 6u;
public const val `USE_FLAGS_PARMNUM`: UInt = 7u;
public const val `USE_FLAG_GLOBAL_MAPPING`: UInt = 65536u;
public const val `USE_FORCE`: `FORCE_LEVEL_FLAGS` = 1u;
// UNSUPPORTED Rust 4782:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USE_INFO_0 {
//     pub ui0_local: windows_sys::core::PWSTR,
//     pub ui0_remote: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4788:1: declaration Impl has no candidate rule
// impl Default for USE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4793:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USE_INFO_1 {
//     pub ui1_local: windows_sys::core::PWSTR,
//     pub ui1_remote: windows_sys::core::PWSTR,
//     pub ui1_password: windows_sys::core::PWSTR,
//     pub ui1_status: u32,
//     pub ui1_asg_type: USE_INFO_ASG_TYPE,
//     pub ui1_refcount: u32,
//     pub ui1_usecount: u32,
// }

// UNSUPPORTED Rust 4804:1: declaration Impl has no candidate rule
// impl Default for USE_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4809:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USE_INFO_2 {
//     pub ui2_local: windows_sys::core::PWSTR,
//     pub ui2_remote: windows_sys::core::PWSTR,
//     pub ui2_password: windows_sys::core::PWSTR,
//     pub ui2_status: u32,
//     pub ui2_asg_type: USE_INFO_ASG_TYPE,
//     pub ui2_refcount: u32,
//     pub ui2_usecount: u32,
//     pub ui2_username: windows_sys::core::PWSTR,
//     pub ui2_domainname: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4822:1: declaration Impl has no candidate rule
// impl Default for USE_INFO_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4827:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USE_INFO_3 {
//     pub ui3_ui2: USE_INFO_2,
//     pub ui3_flags: u32,
// }

// UNSUPPORTED Rust 4833:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USE_INFO_4 {
//     pub ui4_ui3: USE_INFO_3,
//     pub ui4_auth_identity_length: u32,
//     pub ui4_auth_identity: *mut u8,
// }

// UNSUPPORTED Rust 4840:1: declaration Impl has no candidate rule
// impl Default for USE_INFO_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4845:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USE_INFO_5 {
//     pub ui4_ui3: USE_INFO_3,
//     pub ui4_auth_identity_length: u32,
//     pub ui4_auth_identity: *mut u8,
//     pub ui5_security_descriptor_length: u32,
//     pub ui5_security_descriptor: *mut u8,
//     pub ui5_use_options_length: u32,
//     pub ui5_use_options: *mut u8,
// }

// UNSUPPORTED Rust 4856:1: declaration Impl has no candidate rule
// impl Default for USE_INFO_5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `USE_INFO_ASG_TYPE` = UInt;
public const val `USE_IPC`: `USE_INFO_ASG_TYPE` = 3u;
public const val `USE_LOCAL_PARMNUM`: UInt = 1u;
public const val `USE_LOTS_OF_FORCE`: `FORCE_LEVEL_FLAGS` = 2u;
public const val `USE_NETERR`: UInt = 3u;
public const val `USE_NOFORCE`: `FORCE_LEVEL_FLAGS` = 0u;
public const val `USE_OK`: UInt = 0u;
public const val `USE_OPTIONS_PARMNUM`: UInt = 10u;
// UNSUPPORTED Rust 4869:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USE_OPTION_DEFERRED_CONNECTION_PARAMETERS {
//     pub Tag: u32,
//     pub Length: u16,
//     pub Reserved: u16,
// }

// UNSUPPORTED Rust 4876:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USE_OPTION_GENERIC {
//     pub Tag: u32,
//     pub Length: u16,
//     pub Reserved: u16,
// }

// UNSUPPORTED Rust 4883:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USE_OPTION_PROPERTIES {
//     pub Tag: u32,
//     pub pInfo: *mut core::ffi::c_void,
//     pub Length: usize,
// }

// UNSUPPORTED Rust 4890:1: declaration Impl has no candidate rule
// impl Default for USE_OPTION_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4895:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USE_OPTION_TRANSPORT_PARAMETERS {
//     pub Tag: u32,
//     pub Length: u16,
//     pub Reserved: u16,
// }

public const val `USE_PASSWORD_PARMNUM`: UInt = 3u;
public const val `USE_PAUSED`: UInt = 1u;
public const val `USE_RECONN`: UInt = 5u;
public const val `USE_REMOTE_PARMNUM`: UInt = 2u;
public const val `USE_SD_PARMNUM`: UInt = 9u;
public const val `USE_SESSLOST`: UInt = 2u;
public const val `USE_SPECIFIC_TRANSPORT`: UInt = 2147483648u;
public const val `USE_SPOOLDEV`: `USE_INFO_ASG_TYPE` = 1u;
public const val `USE_USERNAME_PARMNUM`: UInt = 5u;
public const val `USE_WILDCARD`: `USE_INFO_ASG_TYPE` = 4294967295u;
public const val `UseTransportType_None`: `TRANSPORT_TYPE` = 0;
public const val `UseTransportType_Quic`: `TRANSPORT_TYPE` = 2;
public const val `UseTransportType_Wsk`: `TRANSPORT_TYPE` = 1;
public const val `VALIDATED_LOGON`: UInt = 0u;
public const val `VALID_LOGOFF`: UInt = 1u;
public const val `WKSTA_BUFFERNAMEDPIPES_PARMNUM`: UInt = 51u;
public const val `WKSTA_BUFFERREADONLYFILES_PARMNUM`: UInt = 59u;
public const val `WKSTA_BUFFILESWITHDENYWRITE_PARMNUM`: UInt = 58u;
public const val `WKSTA_CACHEFILETIMEOUT_PARMNUM`: UInt = 47u;
public const val `WKSTA_CHARCOUNT_PARMNUM`: UInt = 12u;
public const val `WKSTA_CHARTIME_PARMNUM`: UInt = 11u;
public const val `WKSTA_CHARWAIT_PARMNUM`: UInt = 10u;
public const val `WKSTA_COMPUTERNAME_PARMNUM`: UInt = 1u;
public const val `WKSTA_DORMANTFILELIMIT_PARMNUM`: UInt = 46u;
public const val `WKSTA_ERRLOGSZ_PARMNUM`: UInt = 27u;
public const val `WKSTA_FORCECORECREATEMODE_PARMNUM`: UInt = 60u;
// UNSUPPORTED Rust 4928:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WKSTA_INFO_100 {
//     pub wki100_platform_id: u32,
//     pub wki100_computername: windows_sys::core::PWSTR,
//     pub wki100_langroup: windows_sys::core::PWSTR,
//     pub wki100_ver_major: u32,
//     pub wki100_ver_minor: u32,
// }

// UNSUPPORTED Rust 4937:1: declaration Impl has no candidate rule
// impl Default for WKSTA_INFO_100 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4942:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WKSTA_INFO_101 {
//     pub wki101_platform_id: u32,
//     pub wki101_computername: windows_sys::core::PWSTR,
//     pub wki101_langroup: windows_sys::core::PWSTR,
//     pub wki101_ver_major: u32,
//     pub wki101_ver_minor: u32,
//     pub wki101_lanroot: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4952:1: declaration Impl has no candidate rule
// impl Default for WKSTA_INFO_101 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4957:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1010 {
//     pub wki1010_char_wait: u32,
// }

// UNSUPPORTED Rust 4962:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1011 {
//     pub wki1011_collection_time: u32,
// }

// UNSUPPORTED Rust 4967:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1012 {
//     pub wki1012_maximum_collection_count: u32,
// }

// UNSUPPORTED Rust 4972:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1013 {
//     pub wki1013_keep_conn: u32,
// }

// UNSUPPORTED Rust 4977:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1018 {
//     pub wki1018_sess_timeout: u32,
// }

// UNSUPPORTED Rust 4982:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WKSTA_INFO_102 {
//     pub wki102_platform_id: u32,
//     pub wki102_computername: windows_sys::core::PWSTR,
//     pub wki102_langroup: windows_sys::core::PWSTR,
//     pub wki102_ver_major: u32,
//     pub wki102_ver_minor: u32,
//     pub wki102_lanroot: windows_sys::core::PWSTR,
//     pub wki102_logged_on_users: u32,
// }

// UNSUPPORTED Rust 4993:1: declaration Impl has no candidate rule
// impl Default for WKSTA_INFO_102 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4998:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1023 {
//     pub wki1023_siz_char_buf: u32,
// }

// UNSUPPORTED Rust 5003:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1027 {
//     pub wki1027_errlog_sz: u32,
// }

// UNSUPPORTED Rust 5008:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1028 {
//     pub wki1028_print_buf_time: u32,
// }

// UNSUPPORTED Rust 5013:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1032 {
//     pub wki1032_wrk_heuristics: u32,
// }

// UNSUPPORTED Rust 5018:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1033 {
//     pub wki1033_max_threads: u32,
// }

// UNSUPPORTED Rust 5023:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1041 {
//     pub wki1041_lock_quota: u32,
// }

// UNSUPPORTED Rust 5028:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1042 {
//     pub wki1042_lock_increment: u32,
// }

// UNSUPPORTED Rust 5033:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1043 {
//     pub wki1043_lock_maximum: u32,
// }

// UNSUPPORTED Rust 5038:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1044 {
//     pub wki1044_pipe_increment: u32,
// }

// UNSUPPORTED Rust 5043:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1045 {
//     pub wki1045_pipe_maximum: u32,
// }

// UNSUPPORTED Rust 5048:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1046 {
//     pub wki1046_dormant_file_limit: u32,
// }

// UNSUPPORTED Rust 5053:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1047 {
//     pub wki1047_cache_file_timeout: u32,
// }

// UNSUPPORTED Rust 5058:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1048 {
//     pub wki1048_use_opportunistic_locking: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 5063:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1049 {
//     pub wki1049_use_unlock_behind: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 5068:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1050 {
//     pub wki1050_use_close_behind: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 5073:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1051 {
//     pub wki1051_buf_named_pipes: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 5078:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1052 {
//     pub wki1052_use_lock_read_unlock: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 5083:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1053 {
//     pub wki1053_utilize_nt_caching: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 5088:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1054 {
//     pub wki1054_use_raw_read: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 5093:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1055 {
//     pub wki1055_use_raw_write: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 5098:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1056 {
//     pub wki1056_use_write_raw_data: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 5103:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1057 {
//     pub wki1057_use_encryption: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 5108:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1058 {
//     pub wki1058_buf_files_deny_write: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 5113:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1059 {
//     pub wki1059_buf_read_only_files: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 5118:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1060 {
//     pub wki1060_force_core_create_mode: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 5123:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1061 {
//     pub wki1061_use_512_byte_max_transfer: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 5128:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_1062 {
//     pub wki1062_read_ahead_throughput: u32,
// }

// UNSUPPORTED Rust 5133:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WKSTA_INFO_302 {
//     pub wki302_char_wait: u32,
//     pub wki302_collection_time: u32,
//     pub wki302_maximum_collection_count: u32,
//     pub wki302_keep_conn: u32,
//     pub wki302_keep_search: u32,
//     pub wki302_max_cmds: u32,
//     pub wki302_num_work_buf: u32,
//     pub wki302_siz_work_buf: u32,
//     pub wki302_max_wrk_cache: u32,
//     pub wki302_sess_timeout: u32,
//     pub wki302_siz_error: u32,
//     pub wki302_num_alerts: u32,
//     pub wki302_num_services: u32,
//     pub wki302_errlog_sz: u32,
//     pub wki302_print_buf_time: u32,
//     pub wki302_num_char_buf: u32,
//     pub wki302_siz_char_buf: u32,
//     pub wki302_wrk_heuristics: windows_sys::core::PWSTR,
//     pub wki302_mailslots: u32,
//     pub wki302_num_dgram_buf: u32,
// }

// UNSUPPORTED Rust 5157:1: declaration Impl has no candidate rule
// impl Default for WKSTA_INFO_302 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5162:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WKSTA_INFO_402 {
//     pub wki402_char_wait: u32,
//     pub wki402_collection_time: u32,
//     pub wki402_maximum_collection_count: u32,
//     pub wki402_keep_conn: u32,
//     pub wki402_keep_search: u32,
//     pub wki402_max_cmds: u32,
//     pub wki402_num_work_buf: u32,
//     pub wki402_siz_work_buf: u32,
//     pub wki402_max_wrk_cache: u32,
//     pub wki402_sess_timeout: u32,
//     pub wki402_siz_error: u32,
//     pub wki402_num_alerts: u32,
//     pub wki402_num_services: u32,
//     pub wki402_errlog_sz: u32,
//     pub wki402_print_buf_time: u32,
//     pub wki402_num_char_buf: u32,
//     pub wki402_siz_char_buf: u32,
//     pub wki402_wrk_heuristics: windows_sys::core::PWSTR,
//     pub wki402_mailslots: u32,
//     pub wki402_num_dgram_buf: u32,
//     pub wki402_max_threads: u32,
// }

// UNSUPPORTED Rust 5187:1: declaration Impl has no candidate rule
// impl Default for WKSTA_INFO_402 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5192:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WKSTA_INFO_502 {
//     pub wki502_char_wait: u32,
//     pub wki502_collection_time: u32,
//     pub wki502_maximum_collection_count: u32,
//     pub wki502_keep_conn: u32,
//     pub wki502_max_cmds: u32,
//     pub wki502_sess_timeout: u32,
//     pub wki502_siz_char_buf: u32,
//     pub wki502_max_threads: u32,
//     pub wki502_lock_quota: u32,
//     pub wki502_lock_increment: u32,
//     pub wki502_lock_maximum: u32,
//     pub wki502_pipe_increment: u32,
//     pub wki502_pipe_maximum: u32,
//     pub wki502_cache_file_timeout: u32,
//     pub wki502_dormant_file_limit: u32,
//     pub wki502_read_ahead_throughput: u32,
//     pub wki502_num_mailslot_buffers: u32,
//     pub wki502_num_srv_announce_buffers: u32,
//     pub wki502_max_illegal_datagram_events: u32,
//     pub wki502_illegal_datagram_event_reset_frequency: u32,
//     pub wki502_log_election_packets: windows_sys::core::BOOL,
//     pub wki502_use_opportunistic_locking: windows_sys::core::BOOL,
//     pub wki502_use_unlock_behind: windows_sys::core::BOOL,
//     pub wki502_use_close_behind: windows_sys::core::BOOL,
//     pub wki502_buf_named_pipes: windows_sys::core::BOOL,
//     pub wki502_use_lock_read_unlock: windows_sys::core::BOOL,
//     pub wki502_utilize_nt_caching: windows_sys::core::BOOL,
//     pub wki502_use_raw_read: windows_sys::core::BOOL,
//     pub wki502_use_raw_write: windows_sys::core::BOOL,
//     pub wki502_use_write_raw_data: windows_sys::core::BOOL,
//     pub wki502_use_encryption: windows_sys::core::BOOL,
//     pub wki502_buf_files_deny_write: windows_sys::core::BOOL,
//     pub wki502_buf_read_only_files: windows_sys::core::BOOL,
//     pub wki502_force_core_create_mode: windows_sys::core::BOOL,
//     pub wki502_use_512_byte_max_transfer: windows_sys::core::BOOL,
// }

public const val `WKSTA_KEEPCONN_PARMNUM`: UInt = 13u;
public const val `WKSTA_KEEPSEARCH_PARMNUM`: UInt = 14u;
public const val `WKSTA_LANGROUP_PARMNUM`: UInt = 2u;
public const val `WKSTA_LANROOT_PARMNUM`: UInt = 7u;
public const val `WKSTA_LOCKINCREMENT_PARMNUM`: UInt = 42u;
public const val `WKSTA_LOCKMAXIMUM_PARMNUM`: UInt = 43u;
public const val `WKSTA_LOCKQUOTA_PARMNUM`: UInt = 41u;
public const val `WKSTA_LOGGED_ON_USERS_PARMNUM`: UInt = 6u;
public const val `WKSTA_LOGON_DOMAIN_PARMNUM`: UInt = 8u;
public const val `WKSTA_LOGON_SERVER_PARMNUM`: UInt = 9u;
public const val `WKSTA_MAILSLOTS_PARMNUM`: UInt = 30u;
public const val `WKSTA_MAXCMDS_PARMNUM`: UInt = 15u;
public const val `WKSTA_MAXTHREADS_PARMNUM`: UInt = 33u;
public const val `WKSTA_MAXWRKCACHE_PARMNUM`: UInt = 17u;
public const val `WKSTA_NUMALERTS_PARMNUM`: UInt = 20u;
public const val `WKSTA_NUMCHARBUF_PARMNUM`: UInt = 22u;
public const val `WKSTA_NUMDGRAMBUF_PARMNUM`: UInt = 31u;
public const val `WKSTA_NUMSERVICES_PARMNUM`: UInt = 21u;
public const val `WKSTA_NUMWORKBUF_PARMNUM`: UInt = 16u;
public const val `WKSTA_OTH_DOMAINS_PARMNUM`: UInt = 101u;
public const val `WKSTA_PIPEINCREMENT_PARMNUM`: UInt = 44u;
public const val `WKSTA_PIPEMAXIMUM_PARMNUM`: UInt = 45u;
public const val `WKSTA_PLATFORM_ID_PARMNUM`: UInt = 100u;
public const val `WKSTA_PRINTBUFTIME_PARMNUM`: UInt = 28u;
public const val `WKSTA_READAHEADTHRUPUT_PARMNUM`: UInt = 62u;
public const val `WKSTA_SESSTIMEOUT_PARMNUM`: UInt = 18u;
public const val `WKSTA_SIZCHARBUF_PARMNUM`: UInt = 23u;
public const val `WKSTA_SIZERROR_PARMNUM`: UInt = 19u;
public const val `WKSTA_SIZWORKBUF_PARMNUM`: UInt = 29u;
// UNSUPPORTED Rust 5260:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WKSTA_TRANSPORT_INFO_0 {
//     pub wkti0_quality_of_service: u32,
//     pub wkti0_number_of_vcs: u32,
//     pub wkti0_transport_name: windows_sys::core::PWSTR,
//     pub wkti0_transport_address: windows_sys::core::PWSTR,
//     pub wkti0_wan_ish: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 5269:1: declaration Impl has no candidate rule
// impl Default for WKSTA_TRANSPORT_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WKSTA_USE512BYTESMAXTRANSFER_PARMNUM`: UInt = 61u;
public const val `WKSTA_USECLOSEBEHIND_PARMNUM`: UInt = 50u;
public const val `WKSTA_USEENCRYPTION_PARMNUM`: UInt = 57u;
public const val `WKSTA_USELOCKANDREADANDUNLOCK_PARMNUM`: UInt = 52u;
public const val `WKSTA_USEOPPORTUNISTICLOCKING_PARMNUM`: UInt = 48u;
public const val `WKSTA_USERAWREAD_PARMNUM`: UInt = 54u;
public const val `WKSTA_USERAWWRITE_PARMNUM`: UInt = 55u;
// UNSUPPORTED Rust 5281:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WKSTA_USER_INFO_0 {
//     pub wkui0_username: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 5286:1: declaration Impl has no candidate rule
// impl Default for WKSTA_USER_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5291:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WKSTA_USER_INFO_1 {
//     pub wkui1_username: windows_sys::core::PWSTR,
//     pub wkui1_logon_domain: windows_sys::core::PWSTR,
//     pub wkui1_oth_domains: windows_sys::core::PWSTR,
//     pub wkui1_logon_server: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 5299:1: declaration Impl has no candidate rule
// impl Default for WKSTA_USER_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5304:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WKSTA_USER_INFO_1101 {
//     pub wkui1101_oth_domains: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 5309:1: declaration Impl has no candidate rule
// impl Default for WKSTA_USER_INFO_1101 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WKSTA_USEUNLOCKBEHIND_PARMNUM`: UInt = 49u;
public const val `WKSTA_USEWRITERAWWITHDATA_PARMNUM`: UInt = 56u;
public const val `WKSTA_UTILIZENTCACHING_PARMNUM`: UInt = 53u;
public const val `WKSTA_VER_MAJOR_PARMNUM`: UInt = 4u;
public const val `WKSTA_VER_MINOR_PARMNUM`: UInt = 5u;
public const val `WKSTA_WRKHEURISTICS_PARMNUM`: UInt = 32u;
// UNSUPPORTED Rust 5320:1: generic scalar type unsupported
// pub type WORKERFUNCTION = Option<unsafe extern "system" fn(param0: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 5321:1: non-scalar type Ptr unsupported
// pub const WORKSTATION_DISPLAY_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Workstation");

public const val `WZC_PROFILE_API_ERROR_FAILED_TO_LOAD_SCHEMA`: UInt = 34u;
public const val `WZC_PROFILE_API_ERROR_FAILED_TO_LOAD_XML`: UInt = 33u;
public const val `WZC_PROFILE_API_ERROR_INTERNAL`: UInt = 36u;
public const val `WZC_PROFILE_API_ERROR_NOT_SUPPORTED`: UInt = 32u;
public const val `WZC_PROFILE_API_ERROR_XML_VALIDATION_FAILED`: UInt = 35u;
public const val `WZC_PROFILE_CONFIG_ERROR_1X_NOT_ALLOWED`: UInt = 20u;
public const val `WZC_PROFILE_CONFIG_ERROR_1X_NOT_ALLOWED_KEY_REQUIRED`: UInt = 21u;
public const val `WZC_PROFILE_CONFIG_ERROR_1X_NOT_ENABLED_KEY_PROVIDED`: UInt = 22u;
public const val `WZC_PROFILE_CONFIG_ERROR_EAP_METHOD_NOT_APPLICABLE`: UInt = 24u;
public const val `WZC_PROFILE_CONFIG_ERROR_EAP_METHOD_REQUIRED`: UInt = 23u;
public const val `WZC_PROFILE_CONFIG_ERROR_INVALID_AUTH_FOR_CONNECTION_TYPE`: UInt = 15u;
public const val `WZC_PROFILE_CONFIG_ERROR_INVALID_ENCRYPTION_FOR_AUTHMODE`: UInt = 16u;
public const val `WZC_PROFILE_CONFIG_ERROR_KEY_INDEX_NOT_APPLICABLE`: UInt = 19u;
public const val `WZC_PROFILE_CONFIG_ERROR_KEY_INDEX_REQUIRED`: UInt = 18u;
public const val `WZC_PROFILE_CONFIG_ERROR_KEY_REQUIRED`: UInt = 17u;
public const val `WZC_PROFILE_CONFIG_ERROR_WPA_ENCRYPTION_NOT_SUPPORTED`: UInt = 26u;
public const val `WZC_PROFILE_CONFIG_ERROR_WPA_NOT_SUPPORTED`: UInt = 25u;
public const val `WZC_PROFILE_SET_ERROR_DUPLICATE_NETWORK`: UInt = 27u;
public const val `WZC_PROFILE_SET_ERROR_MEMORY_ALLOCATION`: UInt = 28u;
public const val `WZC_PROFILE_SET_ERROR_READING_1X_CONFIG`: UInt = 29u;
public const val `WZC_PROFILE_SET_ERROR_WRITING_1X_CONFIG`: UInt = 30u;
public const val `WZC_PROFILE_SET_ERROR_WRITING_WZC_CFG`: UInt = 31u;
public const val `WZC_PROFILE_SUCCESS`: UInt = 0u;
public const val `WZC_PROFILE_XML_ERROR_1X_ENABLED`: UInt = 10u;
public const val `WZC_PROFILE_XML_ERROR_AUTHENTICATION`: UInt = 7u;
public const val `WZC_PROFILE_XML_ERROR_BAD_KEY_INDEX`: UInt = 12u;
public const val `WZC_PROFILE_XML_ERROR_BAD_NETWORK_KEY`: UInt = 14u;
public const val `WZC_PROFILE_XML_ERROR_BAD_SSID`: UInt = 5u;
public const val `WZC_PROFILE_XML_ERROR_BAD_VERSION`: UInt = 2u;
public const val `WZC_PROFILE_XML_ERROR_CONNECTION_TYPE`: UInt = 6u;
public const val `WZC_PROFILE_XML_ERROR_EAP_METHOD`: UInt = 11u;
public const val `WZC_PROFILE_XML_ERROR_ENCRYPTION`: UInt = 8u;
public const val `WZC_PROFILE_XML_ERROR_KEY_INDEX_RANGE`: UInt = 13u;
public const val `WZC_PROFILE_XML_ERROR_KEY_PROVIDED_AUTOMATICALLY`: UInt = 9u;
public const val `WZC_PROFILE_XML_ERROR_NO_VERSION`: UInt = 1u;
public const val `WZC_PROFILE_XML_ERROR_SSID_NOT_FOUND`: UInt = 4u;
public const val `WZC_PROFILE_XML_ERROR_UNSUPPORTED_VERSION`: UInt = 3u;
