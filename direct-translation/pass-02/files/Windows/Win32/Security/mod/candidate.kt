// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Security_AppLocker")]
// pub mod AppLocker;

// UNSUPPORTED Rust 3:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Security_Authentication")]
// pub mod Authentication;

// UNSUPPORTED Rust 5:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Security_Authorization")]
// pub mod Authorization;

// UNSUPPORTED Rust 7:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// pub mod Credentials;

// UNSUPPORTED Rust 9:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// pub mod Cryptography;

// UNSUPPORTED Rust 11:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Security_DiagnosticDataQuery")]
// pub mod DiagnosticDataQuery;

// UNSUPPORTED Rust 13:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Security_DirectoryServices")]
// pub mod DirectoryServices;

// UNSUPPORTED Rust 15:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Security_EnterpriseData")]
// pub mod EnterpriseData;

// UNSUPPORTED Rust 17:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// pub mod ExtensibleAuthenticationProtocol;

// UNSUPPORTED Rust 19:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Security_Isolation")]
// pub mod Isolation;

// UNSUPPORTED Rust 21:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Security_LicenseProtection")]
// pub mod LicenseProtection;

// UNSUPPORTED Rust 23:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Security_NetworkAccessProtection")]
// pub mod NetworkAccessProtection;

// UNSUPPORTED Rust 25:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Security_WinTrust")]
// pub mod WinTrust;

// UNSUPPORTED Rust 27:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Security_WinWlx")]
// pub mod WinWlx;

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AccessCheck(psecuritydescriptor : PSECURITY_DESCRIPTOR, clienttoken : super::Foundation:: HANDLE, desiredaccess : u32, genericmapping : *const GENERIC_MAPPING, privilegeset : *mut PRIVILEGE_SET, privilegesetlength : *mut u32, grantedaccess : *mut u32, accessstatus : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AccessCheckAndAuditAlarmA(subsystemname : windows_sys::core::PCSTR, handleid : *const core::ffi::c_void, objecttypename : windows_sys::core::PCSTR, objectname : windows_sys::core::PCSTR, securitydescriptor : PSECURITY_DESCRIPTOR, desiredaccess : u32, genericmapping : *const GENERIC_MAPPING, objectcreation : windows_sys::core::BOOL, grantedaccess : *mut u32, accessstatus : *mut windows_sys::core::BOOL, pfgenerateonclose : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AccessCheckAndAuditAlarmW(subsystemname : windows_sys::core::PCWSTR, handleid : *const core::ffi::c_void, objecttypename : windows_sys::core::PCWSTR, objectname : windows_sys::core::PCWSTR, securitydescriptor : PSECURITY_DESCRIPTOR, desiredaccess : u32, genericmapping : *const GENERIC_MAPPING, objectcreation : windows_sys::core::BOOL, grantedaccess : *mut u32, accessstatus : *mut windows_sys::core::BOOL, pfgenerateonclose : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AccessCheckByType(psecuritydescriptor : PSECURITY_DESCRIPTOR, principalselfsid : PSID, clienttoken : super::Foundation:: HANDLE, desiredaccess : u32, objecttypelist : *mut OBJECT_TYPE_LIST, objecttypelistlength : u32, genericmapping : *const GENERIC_MAPPING, privilegeset : *mut PRIVILEGE_SET, privilegesetlength : *mut u32, grantedaccess : *mut u32, accessstatus : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AccessCheckByTypeAndAuditAlarmA(subsystemname : windows_sys::core::PCSTR, handleid : *const core::ffi::c_void, objecttypename : windows_sys::core::PCSTR, objectname : windows_sys::core::PCSTR, securitydescriptor : PSECURITY_DESCRIPTOR, principalselfsid : PSID, desiredaccess : u32, audittype : AUDIT_EVENT_TYPE, flags : u32, objecttypelist : *mut OBJECT_TYPE_LIST, objecttypelistlength : u32, genericmapping : *const GENERIC_MAPPING, objectcreation : windows_sys::core::BOOL, grantedaccess : *mut u32, accessstatus : *mut windows_sys::core::BOOL, pfgenerateonclose : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AccessCheckByTypeAndAuditAlarmW(subsystemname : windows_sys::core::PCWSTR, handleid : *const core::ffi::c_void, objecttypename : windows_sys::core::PCWSTR, objectname : windows_sys::core::PCWSTR, securitydescriptor : PSECURITY_DESCRIPTOR, principalselfsid : PSID, desiredaccess : u32, audittype : AUDIT_EVENT_TYPE, flags : u32, objecttypelist : *mut OBJECT_TYPE_LIST, objecttypelistlength : u32, genericmapping : *const GENERIC_MAPPING, objectcreation : windows_sys::core::BOOL, grantedaccess : *mut u32, accessstatus : *mut windows_sys::core::BOOL, pfgenerateonclose : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AccessCheckByTypeResultList(psecuritydescriptor : PSECURITY_DESCRIPTOR, principalselfsid : PSID, clienttoken : super::Foundation:: HANDLE, desiredaccess : u32, objecttypelist : *mut OBJECT_TYPE_LIST, objecttypelistlength : u32, genericmapping : *const GENERIC_MAPPING, privilegeset : *mut PRIVILEGE_SET, privilegesetlength : *mut u32, grantedaccesslist : *mut u32, accessstatuslist : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AccessCheckByTypeResultListAndAuditAlarmA(subsystemname : windows_sys::core::PCSTR, handleid : *const core::ffi::c_void, objecttypename : windows_sys::core::PCSTR, objectname : windows_sys::core::PCSTR, securitydescriptor : PSECURITY_DESCRIPTOR, principalselfsid : PSID, desiredaccess : u32, audittype : AUDIT_EVENT_TYPE, flags : u32, objecttypelist : *mut OBJECT_TYPE_LIST, objecttypelistlength : u32, genericmapping : *const GENERIC_MAPPING, objectcreation : windows_sys::core::BOOL, grantedaccess : *mut u32, accessstatuslist : *mut u32, pfgenerateonclose : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AccessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname : windows_sys::core::PCSTR, handleid : *const core::ffi::c_void, clienttoken : super::Foundation:: HANDLE, objecttypename : windows_sys::core::PCSTR, objectname : windows_sys::core::PCSTR, securitydescriptor : PSECURITY_DESCRIPTOR, principalselfsid : PSID, desiredaccess : u32, audittype : AUDIT_EVENT_TYPE, flags : u32, objecttypelist : *mut OBJECT_TYPE_LIST, objecttypelistlength : u32, genericmapping : *const GENERIC_MAPPING, objectcreation : windows_sys::core::BOOL, grantedaccess : *mut u32, accessstatuslist : *mut u32, pfgenerateonclose : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AccessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname : windows_sys::core::PCWSTR, handleid : *const core::ffi::c_void, clienttoken : super::Foundation:: HANDLE, objecttypename : windows_sys::core::PCWSTR, objectname : windows_sys::core::PCWSTR, securitydescriptor : PSECURITY_DESCRIPTOR, principalselfsid : PSID, desiredaccess : u32, audittype : AUDIT_EVENT_TYPE, flags : u32, objecttypelist : *mut OBJECT_TYPE_LIST, objecttypelistlength : u32, genericmapping : *const GENERIC_MAPPING, objectcreation : windows_sys::core::BOOL, grantedaccesslist : *mut u32, accessstatuslist : *mut u32, pfgenerateonclose : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AccessCheckByTypeResultListAndAuditAlarmW(subsystemname : windows_sys::core::PCWSTR, handleid : *const core::ffi::c_void, objecttypename : windows_sys::core::PCWSTR, objectname : windows_sys::core::PCWSTR, securitydescriptor : PSECURITY_DESCRIPTOR, principalselfsid : PSID, desiredaccess : u32, audittype : AUDIT_EVENT_TYPE, flags : u32, objecttypelist : *mut OBJECT_TYPE_LIST, objecttypelistlength : u32, genericmapping : *const GENERIC_MAPPING, objectcreation : windows_sys::core::BOOL, grantedaccesslist : *mut u32, accessstatuslist : *mut u32, pfgenerateonclose : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AddAccessAllowedAce(pacl : *mut ACL, dwacerevision : ACE_REVISION, accessmask : u32, psid : PSID) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AddAccessAllowedAceEx(pacl : *mut ACL, dwacerevision : ACE_REVISION, aceflags : ACE_FLAGS, accessmask : u32, psid : PSID) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AddAccessAllowedObjectAce(pacl : *mut ACL, dwacerevision : ACE_REVISION, aceflags : ACE_FLAGS, accessmask : u32, objecttypeguid : *const windows_sys::core::GUID, inheritedobjecttypeguid : *const windows_sys::core::GUID, psid : PSID) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AddAccessDeniedAce(pacl : *mut ACL, dwacerevision : ACE_REVISION, accessmask : u32, psid : PSID) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AddAccessDeniedAceEx(pacl : *mut ACL, dwacerevision : ACE_REVISION, aceflags : ACE_FLAGS, accessmask : u32, psid : PSID) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AddAccessDeniedObjectAce(pacl : *mut ACL, dwacerevision : ACE_REVISION, aceflags : ACE_FLAGS, accessmask : u32, objecttypeguid : *const windows_sys::core::GUID, inheritedobjecttypeguid : *const windows_sys::core::GUID, psid : PSID) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AddAce(pacl : *mut ACL, dwacerevision : ACE_REVISION, dwstartingaceindex : u32, pacelist : *const core::ffi::c_void, nacelistlength : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AddAuditAccessAce(pacl : *mut ACL, dwacerevision : ACE_REVISION, dwaccessmask : u32, psid : PSID, bauditsuccess : windows_sys::core::BOOL, bauditfailure : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AddAuditAccessAceEx(pacl : *mut ACL, dwacerevision : ACE_REVISION, aceflags : ACE_FLAGS, dwaccessmask : u32, psid : PSID, bauditsuccess : windows_sys::core::BOOL, bauditfailure : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AddAuditAccessObjectAce(pacl : *mut ACL, dwacerevision : ACE_REVISION, aceflags : ACE_FLAGS, accessmask : u32, objecttypeguid : *const windows_sys::core::GUID, inheritedobjecttypeguid : *const windows_sys::core::GUID, psid : PSID, bauditsuccess : windows_sys::core::BOOL, bauditfailure : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AddConditionalAce(pacl : *mut ACL, dwacerevision : ACE_REVISION, aceflags : ACE_FLAGS, acetype : u8, accessmask : u32, psid : PSID, conditionstr : windows_sys::core::PCWSTR, returnlength : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AddMandatoryAce(pacl : *mut ACL, dwacerevision : ACE_REVISION, aceflags : ACE_FLAGS, mandatorypolicy : u32, plabelsid : PSID) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn AddResourceAttributeAce(pacl : *mut ACL, dwacerevision : ACE_REVISION, aceflags : ACE_FLAGS, accessmask : u32, psid : PSID, pattributeinfo : *const CLAIM_SECURITY_ATTRIBUTES_INFORMATION, preturnlength : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn AddScopedPolicyIDAce(pacl : *mut ACL, dwacerevision : ACE_REVISION, aceflags : ACE_FLAGS, accessmask : u32, psid : PSID) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AdjustTokenGroups(tokenhandle : super::Foundation:: HANDLE, resettodefault : windows_sys::core::BOOL, newstate : *const TOKEN_GROUPS, bufferlength : u32, previousstate : *mut TOKEN_GROUPS, returnlength : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AdjustTokenPrivileges(tokenhandle : super::Foundation:: HANDLE, disableallprivileges : windows_sys::core::BOOL, newstate : *const TOKEN_PRIVILEGES, bufferlength : u32, previousstate : *mut TOKEN_PRIVILEGES, returnlength : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AllocateAndInitializeSid(pidentifierauthority : *const SID_IDENTIFIER_AUTHORITY, nsubauthoritycount : u8, nsubauthority0 : u32, nsubauthority1 : u32, nsubauthority2 : u32, nsubauthority3 : u32, nsubauthority4 : u32, nsubauthority5 : u32, nsubauthority6 : u32, nsubauthority7 : u32, psid : *mut PSID) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AllocateLocallyUniqueId(luid : *mut super::Foundation:: LUID) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AreAllAccessesGranted(grantedaccess : u32, desiredaccess : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AreAnyAccessesGranted(grantedaccess : u32, desiredaccess : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn CheckTokenCapability(tokenhandle : super::Foundation:: HANDLE, capabilitysidtocheck : PSID, hascapability : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CheckTokenMembership(tokenhandle : super::Foundation:: HANDLE, sidtocheck : PSID, ismember : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn CheckTokenMembershipEx(tokenhandle : super::Foundation:: HANDLE, sidtocheck : PSID, flags : u32, ismember : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ConvertToAutoInheritPrivateObjectSecurity(parentdescriptor : PSECURITY_DESCRIPTOR, currentsecuritydescriptor : PSECURITY_DESCRIPTOR, newsecuritydescriptor : *mut PSECURITY_DESCRIPTOR, objecttype : *const windows_sys::core::GUID, isdirectoryobject : bool, genericmapping : *const GENERIC_MAPPING) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CopySid(ndestinationsidlength : u32, pdestinationsid : PSID, psourcesid : PSID) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CreatePrivateObjectSecurity(parentdescriptor : PSECURITY_DESCRIPTOR, creatordescriptor : PSECURITY_DESCRIPTOR, newdescriptor : *mut PSECURITY_DESCRIPTOR, isdirectoryobject : windows_sys::core::BOOL, token : super::Foundation:: HANDLE, genericmapping : *const GENERIC_MAPPING) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CreatePrivateObjectSecurityEx(parentdescriptor : PSECURITY_DESCRIPTOR, creatordescriptor : PSECURITY_DESCRIPTOR, newdescriptor : *mut PSECURITY_DESCRIPTOR, objecttype : *const windows_sys::core::GUID, iscontainerobject : windows_sys::core::BOOL, autoinheritflags : SECURITY_AUTO_INHERIT_FLAGS, token : super::Foundation:: HANDLE, genericmapping : *const GENERIC_MAPPING) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CreatePrivateObjectSecurityWithMultipleInheritance(parentdescriptor : PSECURITY_DESCRIPTOR, creatordescriptor : PSECURITY_DESCRIPTOR, newdescriptor : *mut PSECURITY_DESCRIPTOR, objecttypes : *const *const windows_sys::core::GUID, guidcount : u32, iscontainerobject : windows_sys::core::BOOL, autoinheritflags : SECURITY_AUTO_INHERIT_FLAGS, token : super::Foundation:: HANDLE, genericmapping : *const GENERIC_MAPPING) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CreateRestrictedToken(existingtokenhandle : super::Foundation:: HANDLE, flags : CREATE_RESTRICTED_TOKEN_FLAGS, disablesidcount : u32, sidstodisable : *const SID_AND_ATTRIBUTES, deleteprivilegecount : u32, privilegestodelete : *const LUID_AND_ATTRIBUTES, restrictedsidcount : u32, sidstorestrict : *const SID_AND_ATTRIBUTES, newtokenhandle : *mut super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CreateWellKnownSid(wellknownsidtype : WELL_KNOWN_SID_TYPE, domainsid : PSID, psid : PSID, cbsid : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn DeleteAce(pacl : *mut ACL, dwaceindex : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-security-base-l1-2-2.dll" "system" fn DeriveCapabilitySidsFromName(capname : windows_sys::core::PCWSTR, capabilitygroupsids : *mut *mut PSID, capabilitygroupsidcount : *mut u32, capabilitysids : *mut *mut PSID, capabilitysidcount : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn DestroyPrivateObjectSecurity(objectdescriptor : *const PSECURITY_DESCRIPTOR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn DuplicateToken(existingtokenhandle : super::Foundation:: HANDLE, impersonationlevel : SECURITY_IMPERSONATION_LEVEL, duplicatetokenhandle : *mut super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn DuplicateTokenEx(hexistingtoken : super::Foundation:: HANDLE, dwdesiredaccess : TOKEN_ACCESS_MASK, lptokenattributes : *const SECURITY_ATTRIBUTES, impersonationlevel : SECURITY_IMPERSONATION_LEVEL, tokentype : TOKEN_TYPE, phnewtoken : *mut super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EqualDomainSid(psid1 : PSID, psid2 : PSID, pfequal : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EqualPrefixSid(psid1 : PSID, psid2 : PSID) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EqualSid(psid1 : PSID, psid2 : PSID) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn FindFirstFreeAce(pacl : *const ACL, pace : *mut *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn FreeSid(psid : PSID) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetAce(pacl : *const ACL, dwaceindex : u32, pace : *mut *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetAclInformation(pacl : *const ACL, paclinformation : *mut core::ffi::c_void, naclinformationlength : u32, dwaclinformationclass : ACL_INFORMATION_CLASS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetAppContainerAce(acl : *const ACL, startingaceindex : u32, appcontainerace : *mut *mut core::ffi::c_void, appcontaineraceindex : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCachedSigningLevel(file : super::Foundation:: HANDLE, flags : *mut u32, signinglevel : *mut u32, thumbprint : *mut u8, thumbprintsize : *mut u32, thumbprintalgorithm : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetFileSecurityA(lpfilename : windows_sys::core::PCSTR, requestedinformation : u32, psecuritydescriptor : PSECURITY_DESCRIPTOR, nlength : u32, lpnlengthneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetFileSecurityW(lpfilename : windows_sys::core::PCWSTR, requestedinformation : u32, psecuritydescriptor : PSECURITY_DESCRIPTOR, nlength : u32, lpnlengthneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetKernelObjectSecurity(handle : super::Foundation:: HANDLE, requestedinformation : u32, psecuritydescriptor : PSECURITY_DESCRIPTOR, nlength : u32, lpnlengthneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetLengthSid(psid : PSID) -> u32);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetPrivateObjectSecurity(objectdescriptor : PSECURITY_DESCRIPTOR, securityinformation : OBJECT_SECURITY_INFORMATION, resultantdescriptor : PSECURITY_DESCRIPTOR, descriptorlength : u32, returnlength : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetSecurityDescriptorControl(psecuritydescriptor : PSECURITY_DESCRIPTOR, pcontrol : *mut u16, lpdwrevision : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetSecurityDescriptorDacl(psecuritydescriptor : PSECURITY_DESCRIPTOR, lpbdaclpresent : *mut windows_sys::core::BOOL, pdacl : *mut *mut ACL, lpbdacldefaulted : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetSecurityDescriptorGroup(psecuritydescriptor : PSECURITY_DESCRIPTOR, pgroup : *mut PSID, lpbgroupdefaulted : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetSecurityDescriptorLength(psecuritydescriptor : PSECURITY_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetSecurityDescriptorOwner(psecuritydescriptor : PSECURITY_DESCRIPTOR, powner : *mut PSID, lpbownerdefaulted : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetSecurityDescriptorRMControl(securitydescriptor : PSECURITY_DESCRIPTOR, rmcontrol : *mut u8) -> u32);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetSecurityDescriptorSacl(psecuritydescriptor : PSECURITY_DESCRIPTOR, lpbsaclpresent : *mut windows_sys::core::BOOL, psacl : *mut *mut ACL, lpbsacldefaulted : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetSidIdentifierAuthority(psid : PSID) -> *mut SID_IDENTIFIER_AUTHORITY);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetSidLengthRequired(nsubauthoritycount : u8) -> u32);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetSidSubAuthority(psid : PSID, nsubauthority : u32) -> *mut u32);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetSidSubAuthorityCount(psid : PSID) -> *mut u8);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetTokenInformation(tokenhandle : super::Foundation:: HANDLE, tokeninformationclass : TOKEN_INFORMATION_CLASS, tokeninformation : *mut core::ffi::c_void, tokeninformationlength : u32, returnlength : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetUserObjectSecurity(hobj : super::Foundation:: HANDLE, psirequested : *const u32, psid : PSECURITY_DESCRIPTOR, nlength : u32, lpnlengthneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetWindowsAccountDomainSid(psid : PSID, pdomainsid : PSID, cbdomainsid : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ImpersonateAnonymousToken(threadhandle : super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ImpersonateLoggedOnUser(htoken : super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ImpersonateSelf(impersonationlevel : SECURITY_IMPERSONATION_LEVEL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn InitializeAcl(pacl : *mut ACL, nacllength : u32, dwaclrevision : ACE_REVISION) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn InitializeSecurityDescriptor(psecuritydescriptor : PSECURITY_DESCRIPTOR, dwrevision : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn InitializeSid(sid : PSID, pidentifierauthority : *const SID_IDENTIFIER_AUTHORITY, nsubauthoritycount : u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn IsTokenRestricted(tokenhandle : super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn IsValidAcl(pacl : *const ACL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn IsValidSecurityDescriptor(psecuritydescriptor : PSECURITY_DESCRIPTOR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn IsValidSid(psid : PSID) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn IsWellKnownSid(psid : PSID, wellknownsidtype : WELL_KNOWN_SID_TYPE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LogonUserA(lpszusername : windows_sys::core::PCSTR, lpszdomain : windows_sys::core::PCSTR, lpszpassword : windows_sys::core::PCSTR, dwlogontype : LOGON32_LOGON, dwlogonprovider : LOGON32_PROVIDER, phtoken : *mut super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LogonUserExA(lpszusername : windows_sys::core::PCSTR, lpszdomain : windows_sys::core::PCSTR, lpszpassword : windows_sys::core::PCSTR, dwlogontype : LOGON32_LOGON, dwlogonprovider : LOGON32_PROVIDER, phtoken : *mut super::Foundation:: HANDLE, pplogonsid : *mut PSID, ppprofilebuffer : *mut *mut core::ffi::c_void, pdwprofilelength : *mut u32, pquotalimits : *mut QUOTA_LIMITS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LogonUserExW(lpszusername : windows_sys::core::PCWSTR, lpszdomain : windows_sys::core::PCWSTR, lpszpassword : windows_sys::core::PCWSTR, dwlogontype : LOGON32_LOGON, dwlogonprovider : LOGON32_PROVIDER, phtoken : *mut super::Foundation:: HANDLE, pplogonsid : *mut PSID, ppprofilebuffer : *mut *mut core::ffi::c_void, pdwprofilelength : *mut u32, pquotalimits : *mut QUOTA_LIMITS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LogonUserW(lpszusername : windows_sys::core::PCWSTR, lpszdomain : windows_sys::core::PCWSTR, lpszpassword : windows_sys::core::PCWSTR, dwlogontype : LOGON32_LOGON, dwlogonprovider : LOGON32_PROVIDER, phtoken : *mut super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LookupAccountNameA(lpsystemname : windows_sys::core::PCSTR, lpaccountname : windows_sys::core::PCSTR, sid : PSID, cbsid : *mut u32, referenceddomainname : windows_sys::core::PSTR, cchreferenceddomainname : *mut u32, peuse : *mut SID_NAME_USE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LookupAccountNameW(lpsystemname : windows_sys::core::PCWSTR, lpaccountname : windows_sys::core::PCWSTR, sid : PSID, cbsid : *mut u32, referenceddomainname : windows_sys::core::PWSTR, cchreferenceddomainname : *mut u32, peuse : *mut SID_NAME_USE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LookupAccountSidA(lpsystemname : windows_sys::core::PCSTR, sid : PSID, name : windows_sys::core::PSTR, cchname : *mut u32, referenceddomainname : windows_sys::core::PSTR, cchreferenceddomainname : *mut u32, peuse : *mut SID_NAME_USE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LookupAccountSidW(lpsystemname : windows_sys::core::PCWSTR, sid : PSID, name : windows_sys::core::PWSTR, cchname : *mut u32, referenceddomainname : windows_sys::core::PWSTR, cchreferenceddomainname : *mut u32, peuse : *mut SID_NAME_USE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LookupPrivilegeDisplayNameA(lpsystemname : windows_sys::core::PCSTR, lpname : windows_sys::core::PCSTR, lpdisplayname : windows_sys::core::PSTR, cchdisplayname : *mut u32, lplanguageid : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LookupPrivilegeDisplayNameW(lpsystemname : windows_sys::core::PCWSTR, lpname : windows_sys::core::PCWSTR, lpdisplayname : windows_sys::core::PWSTR, cchdisplayname : *mut u32, lplanguageid : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LookupPrivilegeNameA(lpsystemname : windows_sys::core::PCSTR, lpluid : *const super::Foundation:: LUID, lpname : windows_sys::core::PSTR, cchname : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LookupPrivilegeNameW(lpsystemname : windows_sys::core::PCWSTR, lpluid : *const super::Foundation:: LUID, lpname : windows_sys::core::PWSTR, cchname : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LookupPrivilegeValueA(lpsystemname : windows_sys::core::PCSTR, lpname : windows_sys::core::PCSTR, lpluid : *mut super::Foundation:: LUID) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LookupPrivilegeValueW(lpsystemname : windows_sys::core::PCWSTR, lpname : windows_sys::core::PCWSTR, lpluid : *mut super::Foundation:: LUID) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn MakeAbsoluteSD(pselfrelativesecuritydescriptor : PSECURITY_DESCRIPTOR, pabsolutesecuritydescriptor : PSECURITY_DESCRIPTOR, lpdwabsolutesecuritydescriptorsize : *mut u32, pdacl : *mut ACL, lpdwdaclsize : *mut u32, psacl : *mut ACL, lpdwsaclsize : *mut u32, powner : PSID, lpdwownersize : *mut u32, pprimarygroup : PSID, lpdwprimarygroupsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn MakeSelfRelativeSD(pabsolutesecuritydescriptor : PSECURITY_DESCRIPTOR, pselfrelativesecuritydescriptor : PSECURITY_DESCRIPTOR, lpdwbufferlength : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn MapGenericMask(accessmask : *mut u32, genericmapping : *const GENERIC_MAPPING));

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ObjectCloseAuditAlarmA(subsystemname : windows_sys::core::PCSTR, handleid : *const core::ffi::c_void, generateonclose : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ObjectCloseAuditAlarmW(subsystemname : windows_sys::core::PCWSTR, handleid : *const core::ffi::c_void, generateonclose : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ObjectDeleteAuditAlarmA(subsystemname : windows_sys::core::PCSTR, handleid : *const core::ffi::c_void, generateonclose : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ObjectDeleteAuditAlarmW(subsystemname : windows_sys::core::PCWSTR, handleid : *const core::ffi::c_void, generateonclose : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ObjectOpenAuditAlarmA(subsystemname : windows_sys::core::PCSTR, handleid : *const core::ffi::c_void, objecttypename : windows_sys::core::PCSTR, objectname : windows_sys::core::PCSTR, psecuritydescriptor : PSECURITY_DESCRIPTOR, clienttoken : super::Foundation:: HANDLE, desiredaccess : u32, grantedaccess : u32, privileges : *const PRIVILEGE_SET, objectcreation : windows_sys::core::BOOL, accessgranted : windows_sys::core::BOOL, generateonclose : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ObjectOpenAuditAlarmW(subsystemname : windows_sys::core::PCWSTR, handleid : *const core::ffi::c_void, objecttypename : windows_sys::core::PCWSTR, objectname : windows_sys::core::PCWSTR, psecuritydescriptor : PSECURITY_DESCRIPTOR, clienttoken : super::Foundation:: HANDLE, desiredaccess : u32, grantedaccess : u32, privileges : *const PRIVILEGE_SET, objectcreation : windows_sys::core::BOOL, accessgranted : windows_sys::core::BOOL, generateonclose : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ObjectPrivilegeAuditAlarmA(subsystemname : windows_sys::core::PCSTR, handleid : *const core::ffi::c_void, clienttoken : super::Foundation:: HANDLE, desiredaccess : u32, privileges : *const PRIVILEGE_SET, accessgranted : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ObjectPrivilegeAuditAlarmW(subsystemname : windows_sys::core::PCWSTR, handleid : *const core::ffi::c_void, clienttoken : super::Foundation:: HANDLE, desiredaccess : u32, privileges : *const PRIVILEGE_SET, accessgranted : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PrivilegeCheck(clienttoken : super::Foundation:: HANDLE, requiredprivileges : *mut PRIVILEGE_SET, pfresult : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PrivilegedServiceAuditAlarmA(subsystemname : windows_sys::core::PCSTR, servicename : windows_sys::core::PCSTR, clienttoken : super::Foundation:: HANDLE, privileges : *const PRIVILEGE_SET, accessgranted : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn PrivilegedServiceAuditAlarmW(subsystemname : windows_sys::core::PCWSTR, servicename : windows_sys::core::PCWSTR, clienttoken : super::Foundation:: HANDLE, privileges : *const PRIVILEGE_SET, accessgranted : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn QuerySecurityAccessMask(securityinformation : OBJECT_SECURITY_INFORMATION, desiredaccess : *mut u32));

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn RevertToSelf() -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlConvertSidToUnicodeString(unicodestring : *mut super::Foundation:: UNICODE_STRING, sid : PSID, allocatedestinationstring : bool) -> super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlNormalizeSecurityDescriptor(securitydescriptor : *mut PSECURITY_DESCRIPTOR, securitydescriptorlength : u32, newsecuritydescriptor : *mut PSECURITY_DESCRIPTOR, newsecuritydescriptorlength : *mut u32, checkonly : bool) -> bool);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SetAclInformation(pacl : *mut ACL, paclinformation : *const core::ffi::c_void, naclinformationlength : u32, dwaclinformationclass : ACL_INFORMATION_CLASS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetCachedSigningLevel(sourcefiles : *const super::Foundation:: HANDLE, sourcefilecount : u32, flags : u32, targetfile : super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SetFileSecurityA(lpfilename : windows_sys::core::PCSTR, securityinformation : OBJECT_SECURITY_INFORMATION, psecuritydescriptor : PSECURITY_DESCRIPTOR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SetFileSecurityW(lpfilename : windows_sys::core::PCWSTR, securityinformation : OBJECT_SECURITY_INFORMATION, psecuritydescriptor : PSECURITY_DESCRIPTOR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SetKernelObjectSecurity(handle : super::Foundation:: HANDLE, securityinformation : OBJECT_SECURITY_INFORMATION, securitydescriptor : PSECURITY_DESCRIPTOR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SetPrivateObjectSecurity(securityinformation : OBJECT_SECURITY_INFORMATION, modificationdescriptor : PSECURITY_DESCRIPTOR, objectssecuritydescriptor : *mut PSECURITY_DESCRIPTOR, genericmapping : *const GENERIC_MAPPING, token : super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SetPrivateObjectSecurityEx(securityinformation : OBJECT_SECURITY_INFORMATION, modificationdescriptor : PSECURITY_DESCRIPTOR, objectssecuritydescriptor : *mut PSECURITY_DESCRIPTOR, autoinheritflags : SECURITY_AUTO_INHERIT_FLAGS, genericmapping : *const GENERIC_MAPPING, token : super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SetSecurityAccessMask(securityinformation : OBJECT_SECURITY_INFORMATION, desiredaccess : *mut u32));

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SetSecurityDescriptorControl(psecuritydescriptor : PSECURITY_DESCRIPTOR, controlbitsofinterest : SECURITY_DESCRIPTOR_CONTROL, controlbitstoset : SECURITY_DESCRIPTOR_CONTROL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SetSecurityDescriptorDacl(psecuritydescriptor : PSECURITY_DESCRIPTOR, bdaclpresent : windows_sys::core::BOOL, pdacl : *const ACL, bdacldefaulted : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SetSecurityDescriptorGroup(psecuritydescriptor : PSECURITY_DESCRIPTOR, pgroup : PSID, bgroupdefaulted : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SetSecurityDescriptorOwner(psecuritydescriptor : PSECURITY_DESCRIPTOR, powner : PSID, bownerdefaulted : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SetSecurityDescriptorRMControl(securitydescriptor : PSECURITY_DESCRIPTOR, rmcontrol : *const u8) -> u32);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SetSecurityDescriptorSacl(psecuritydescriptor : PSECURITY_DESCRIPTOR, bsaclpresent : windows_sys::core::BOOL, psacl : *const ACL, bsacldefaulted : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SetTokenInformation(tokenhandle : super::Foundation:: HANDLE, tokeninformationclass : TOKEN_INFORMATION_CLASS, tokeninformation : *const core::ffi::c_void, tokeninformationlength : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SetUserObjectSecurity(hobj : super::Foundation:: HANDLE, psirequested : *const OBJECT_SECURITY_INFORMATION, psid : PSECURITY_DESCRIPTOR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 162:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ACCESS_ALLOWED_ACE {
//     pub Header: ACE_HEADER,
//     pub Mask: u32,
//     pub SidStart: u32,
// }

// UNSUPPORTED Rust 169:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ACCESS_ALLOWED_CALLBACK_ACE {
//     pub Header: ACE_HEADER,
//     pub Mask: u32,
//     pub SidStart: u32,
// }

// UNSUPPORTED Rust 176:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ACCESS_ALLOWED_CALLBACK_OBJECT_ACE {
//     pub Header: ACE_HEADER,
//     pub Mask: u32,
//     pub Flags: SYSTEM_AUDIT_OBJECT_ACE_FLAGS,
//     pub ObjectType: windows_sys::core::GUID,
//     pub InheritedObjectType: windows_sys::core::GUID,
//     pub SidStart: u32,
// }

// UNSUPPORTED Rust 186:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ACCESS_ALLOWED_OBJECT_ACE {
//     pub Header: ACE_HEADER,
//     pub Mask: u32,
//     pub Flags: SYSTEM_AUDIT_OBJECT_ACE_FLAGS,
//     pub ObjectType: windows_sys::core::GUID,
//     pub InheritedObjectType: windows_sys::core::GUID,
//     pub SidStart: u32,
// }

// UNSUPPORTED Rust 196:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ACCESS_DENIED_ACE {
//     pub Header: ACE_HEADER,
//     pub Mask: u32,
//     pub SidStart: u32,
// }

// UNSUPPORTED Rust 203:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ACCESS_DENIED_CALLBACK_ACE {
//     pub Header: ACE_HEADER,
//     pub Mask: u32,
//     pub SidStart: u32,
// }

// UNSUPPORTED Rust 210:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ACCESS_DENIED_CALLBACK_OBJECT_ACE {
//     pub Header: ACE_HEADER,
//     pub Mask: u32,
//     pub Flags: SYSTEM_AUDIT_OBJECT_ACE_FLAGS,
//     pub ObjectType: windows_sys::core::GUID,
//     pub InheritedObjectType: windows_sys::core::GUID,
//     pub SidStart: u32,
// }

// UNSUPPORTED Rust 220:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ACCESS_DENIED_OBJECT_ACE {
//     pub Header: ACE_HEADER,
//     pub Mask: u32,
//     pub Flags: SYSTEM_AUDIT_OBJECT_ACE_FLAGS,
//     pub ObjectType: windows_sys::core::GUID,
//     pub InheritedObjectType: windows_sys::core::GUID,
//     pub SidStart: u32,
// }

// UNSUPPORTED Rust 230:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACCESS_REASONS {
//     pub Data: [u32; 32],
// }

// UNSUPPORTED Rust 235:1: declaration Impl has no candidate rule
// impl Default for ACCESS_REASONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ACE_FLAGS` = UInt;
// UNSUPPORTED Rust 241:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ACE_HEADER {
//     pub AceType: u8,
//     pub AceFlags: u8,
//     pub AceSize: u16,
// }

public const val `ACE_INHERITED_OBJECT_TYPE_PRESENT`: `SYSTEM_AUDIT_OBJECT_ACE_FLAGS` = 2u;
public const val `ACE_OBJECT_TYPE_PRESENT`: `SYSTEM_AUDIT_OBJECT_ACE_FLAGS` = 1u;
public typealias `ACE_REVISION` = UInt;
// UNSUPPORTED Rust 251:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ACL {
//     pub AclRevision: u8,
//     pub Sbz1: u8,
//     pub AclSize: u16,
//     pub AceCount: u16,
//     pub Sbz2: u16,
// }

public typealias `ACL_INFORMATION_CLASS` = Int;
public const val `ACL_REVISION`: `ACE_REVISION` = 2u;
public const val `ACL_REVISION_DS`: `ACE_REVISION` = 4u;
// UNSUPPORTED Rust 263:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ACL_REVISION_INFORMATION {
//     pub AclRevision: u32,
// }

// UNSUPPORTED Rust 268:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ACL_SIZE_INFORMATION {
//     pub AceCount: u32,
//     pub AclBytesInUse: u32,
//     pub AclBytesFree: u32,
// }

public const val `ATTRIBUTE_SECURITY_INFORMATION`: `OBJECT_SECURITY_INFORMATION` = 32u;
public typealias `AUDIT_EVENT_TYPE` = Int;
public const val `AclRevisionInformation`: `ACL_INFORMATION_CLASS` = 1;
public const val `AclSizeInformation`: `ACL_INFORMATION_CLASS` = 2;
public const val `AuditEventDirectoryServiceAccess`: `AUDIT_EVENT_TYPE` = 1;
public const val `AuditEventObjectAccess`: `AUDIT_EVENT_TYPE` = 0;
public const val `BACKUP_SECURITY_INFORMATION`: `OBJECT_SECURITY_INFORMATION` = 65536u;
// UNSUPPORTED Rust 282:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLAIM_SECURITY_ATTRIBUTES_INFORMATION {
//     pub Version: u16,
//     pub Reserved: u16,
//     pub AttributeCount: u32,
//     pub Attribute: CLAIM_SECURITY_ATTRIBUTES_INFORMATION_0,
// }

// UNSUPPORTED Rust 290:1: declaration Impl has no candidate rule
// impl Default for CLAIM_SECURITY_ATTRIBUTES_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 295:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CLAIM_SECURITY_ATTRIBUTES_INFORMATION_0 {
//     pub pAttributeV1: *mut CLAIM_SECURITY_ATTRIBUTE_V1,
// }

// UNSUPPORTED Rust 300:1: declaration Impl has no candidate rule
// impl Default for CLAIM_SECURITY_ATTRIBUTES_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLAIM_SECURITY_ATTRIBUTE_DISABLED`: `CLAIM_SECURITY_ATTRIBUTE_FLAGS` = 16u;
public const val `CLAIM_SECURITY_ATTRIBUTE_DISABLED_BY_DEFAULT`: `CLAIM_SECURITY_ATTRIBUTE_FLAGS` = 8u;
public typealias `CLAIM_SECURITY_ATTRIBUTE_FLAGS` = UInt;
// UNSUPPORTED Rust 308:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE {
//     pub Version: u64,
//     pub Name: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 314:1: declaration Impl has no candidate rule
// impl Default for CLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLAIM_SECURITY_ATTRIBUTE_MANDATORY`: `CLAIM_SECURITY_ATTRIBUTE_FLAGS` = 32u;
public const val `CLAIM_SECURITY_ATTRIBUTE_NON_INHERITABLE`: `CLAIM_SECURITY_ATTRIBUTE_FLAGS` = 1u;
// UNSUPPORTED Rust 321:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE {
//     pub pValue: *mut core::ffi::c_void,
//     pub ValueLength: u32,
// }

// UNSUPPORTED Rust 327:1: declaration Impl has no candidate rule
// impl Default for CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 332:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1 {
//     pub Name: u32,
//     pub ValueType: CLAIM_SECURITY_ATTRIBUTE_VALUE_TYPE,
//     pub Reserved: u16,
//     pub Flags: CLAIM_SECURITY_ATTRIBUTE_FLAGS,
//     pub ValueCount: u32,
//     pub Values: CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1_0,
// }

// UNSUPPORTED Rust 342:1: declaration Impl has no candidate rule
// impl Default for CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 347:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1_0 {
//     pub pInt64: [u32; 1],
//     pub pUint64: [u32; 1],
//     pub ppString: [u32; 1],
//     pub pFqbn: [u32; 1],
//     pub pOctetString: [u32; 1],
// }

// UNSUPPORTED Rust 356:1: declaration Impl has no candidate rule
// impl Default for CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLAIM_SECURITY_ATTRIBUTE_TYPE_BOOLEAN`: `CLAIM_SECURITY_ATTRIBUTE_VALUE_TYPE` = 6u;
public const val `CLAIM_SECURITY_ATTRIBUTE_TYPE_FQBN`: `CLAIM_SECURITY_ATTRIBUTE_VALUE_TYPE` = 4u;
public const val `CLAIM_SECURITY_ATTRIBUTE_TYPE_INT64`: `CLAIM_SECURITY_ATTRIBUTE_VALUE_TYPE` = 1u;
public const val `CLAIM_SECURITY_ATTRIBUTE_TYPE_OCTET_STRING`: `CLAIM_SECURITY_ATTRIBUTE_VALUE_TYPE` = 16u;
public const val `CLAIM_SECURITY_ATTRIBUTE_TYPE_SID`: `CLAIM_SECURITY_ATTRIBUTE_VALUE_TYPE` = 5u;
public const val `CLAIM_SECURITY_ATTRIBUTE_TYPE_STRING`: `CLAIM_SECURITY_ATTRIBUTE_VALUE_TYPE` = 3u;
public const val `CLAIM_SECURITY_ATTRIBUTE_TYPE_UINT64`: `CLAIM_SECURITY_ATTRIBUTE_VALUE_TYPE` = 2u;
public const val `CLAIM_SECURITY_ATTRIBUTE_USE_FOR_DENY_ONLY`: `CLAIM_SECURITY_ATTRIBUTE_FLAGS` = 4u;
// UNSUPPORTED Rust 369:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLAIM_SECURITY_ATTRIBUTE_V1 {
//     pub Name: windows_sys::core::PWSTR,
//     pub ValueType: CLAIM_SECURITY_ATTRIBUTE_VALUE_TYPE,
//     pub Reserved: u16,
//     pub Flags: u32,
//     pub ValueCount: u32,
//     pub Values: CLAIM_SECURITY_ATTRIBUTE_V1_0,
// }

// UNSUPPORTED Rust 379:1: declaration Impl has no candidate rule
// impl Default for CLAIM_SECURITY_ATTRIBUTE_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 384:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CLAIM_SECURITY_ATTRIBUTE_V1_0 {
//     pub pInt64: *mut i64,
//     pub pUint64: *mut u64,
//     pub ppString: *mut windows_sys::core::PWSTR,
//     pub pFqbn: *mut CLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE,
//     pub pOctetString: *mut CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE,
// }

// UNSUPPORTED Rust 393:1: declaration Impl has no candidate rule
// impl Default for CLAIM_SECURITY_ATTRIBUTE_V1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLAIM_SECURITY_ATTRIBUTE_VALUE_CASE_SENSITIVE`: `CLAIM_SECURITY_ATTRIBUTE_FLAGS` = 2u;
public typealias `CLAIM_SECURITY_ATTRIBUTE_VALUE_TYPE` = UShort;
public const val `CONTAINER_INHERIT_ACE`: `ACE_FLAGS` = 2u;
public typealias `CREATE_RESTRICTED_TOKEN_FLAGS` = UInt;
public const val `CVT_SECONDS`: UInt = 1u;
public const val `DACL_SECURITY_INFORMATION`: `OBJECT_SECURITY_INFORMATION` = 4u;
public const val `DISABLE_MAX_PRIVILEGE`: `CREATE_RESTRICTED_TOKEN_FLAGS` = 1u;
public typealias `ENUM_PERIOD` = Int;
public const val `ENUM_PERIOD_DAYS`: `ENUM_PERIOD` = 3;
public const val `ENUM_PERIOD_HOURS`: `ENUM_PERIOD` = 2;
public const val `ENUM_PERIOD_INVALID`: `ENUM_PERIOD` = -1;
public const val `ENUM_PERIOD_MINUTES`: `ENUM_PERIOD` = 1;
public const val `ENUM_PERIOD_MONTHS`: `ENUM_PERIOD` = 5;
public const val `ENUM_PERIOD_SECONDS`: `ENUM_PERIOD` = 0;
public const val `ENUM_PERIOD_WEEKS`: `ENUM_PERIOD` = 4;
public const val `ENUM_PERIOD_YEARS`: `ENUM_PERIOD` = 6;
public const val `FAILED_ACCESS_ACE_FLAG`: `ACE_FLAGS` = 128u;
// UNSUPPORTED Rust 415:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GENERIC_MAPPING {
//     pub GenericRead: u32,
//     pub GenericWrite: u32,
//     pub GenericExecute: u32,
//     pub GenericAll: u32,
// }

public const val `GROUP_SECURITY_INFORMATION`: `OBJECT_SECURITY_INFORMATION` = 2u;
public const val `INHERITED_ACE`: `ACE_FLAGS` = 16u;
public const val `INHERIT_NO_PROPAGATE`: `ACE_FLAGS` = 4u;
public const val `INHERIT_ONLY`: `ACE_FLAGS` = 8u;
public const val `INHERIT_ONLY_ACE`: `ACE_FLAGS` = 8u;
public const val `LABEL_SECURITY_INFORMATION`: `OBJECT_SECURITY_INFORMATION` = 16u;
// UNSUPPORTED Rust 429:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LLFILETIME {
//     pub Anonymous: LLFILETIME_0,
// }

// UNSUPPORTED Rust 434:1: declaration Impl has no candidate rule
// impl Default for LLFILETIME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 439:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union LLFILETIME_0 {
//     pub ll: i64,
//     pub ft: super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 445:1: declaration Impl has no candidate rule
// impl Default for LLFILETIME_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `LOGON32_LOGON` = UInt;
public const val `LOGON32_LOGON_BATCH`: `LOGON32_LOGON` = 4u;
public const val `LOGON32_LOGON_INTERACTIVE`: `LOGON32_LOGON` = 2u;
public const val `LOGON32_LOGON_NETWORK`: `LOGON32_LOGON` = 3u;
public const val `LOGON32_LOGON_NETWORK_CLEARTEXT`: `LOGON32_LOGON` = 8u;
public const val `LOGON32_LOGON_NEW_CREDENTIALS`: `LOGON32_LOGON` = 9u;
public const val `LOGON32_LOGON_SERVICE`: `LOGON32_LOGON` = 5u;
public const val `LOGON32_LOGON_UNLOCK`: `LOGON32_LOGON` = 7u;
public typealias `LOGON32_PROVIDER` = UInt;
public const val `LOGON32_PROVIDER_DEFAULT`: `LOGON32_PROVIDER` = 0u;
public const val `LOGON32_PROVIDER_WINNT40`: `LOGON32_PROVIDER` = 2u;
public const val `LOGON32_PROVIDER_WINNT50`: `LOGON32_PROVIDER` = 3u;
public const val `LUA_TOKEN`: `CREATE_RESTRICTED_TOKEN_FLAGS` = 4u;
// UNSUPPORTED Rust 463:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct LUID_AND_ATTRIBUTES {
//     pub Luid: super::Foundation::LUID,
//     pub Attributes: TOKEN_PRIVILEGES_ATTRIBUTES,
// }

public typealias `MANDATORY_LEVEL` = Int;
public const val `MandatoryLevelCount`: `MANDATORY_LEVEL` = 6;
public const val `MandatoryLevelHigh`: `MANDATORY_LEVEL` = 3;
public const val `MandatoryLevelLow`: `MANDATORY_LEVEL` = 1;
public const val `MandatoryLevelMedium`: `MANDATORY_LEVEL` = 2;
public const val `MandatoryLevelSecureProcess`: `MANDATORY_LEVEL` = 5;
public const val `MandatoryLevelSystem`: `MANDATORY_LEVEL` = 4;
public const val `MandatoryLevelUntrusted`: `MANDATORY_LEVEL` = 0;
public const val `MaxTokenInfoClass`: `TOKEN_INFORMATION_CLASS` = 49;
// UNSUPPORTED Rust 478:1: non-scalar type Ptr unsupported
// pub type NCRYPT_DESCRIPTOR_HANDLE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 479:1: non-scalar type Ptr unsupported
// pub type NCRYPT_STREAM_HANDLE = *mut core::ffi::c_void;

public const val `NO_INHERITANCE`: `ACE_FLAGS` = 0u;
public const val `NO_PROPAGATE_INHERIT_ACE`: `ACE_FLAGS` = 4u;
public const val `OBJECT_INHERIT_ACE`: `ACE_FLAGS` = 1u;
public typealias `OBJECT_SECURITY_INFORMATION` = UInt;
// UNSUPPORTED Rust 484:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OBJECT_TYPE_LIST {
//     pub Level: u16,
//     pub Sbz: u16,
//     pub ObjectType: *mut windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 491:1: declaration Impl has no candidate rule
// impl Default for OBJECT_TYPE_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OWNER_SECURITY_INFORMATION`: `OBJECT_SECURITY_INFORMATION` = 1u;
// UNSUPPORTED Rust 497:1: generic scalar type unsupported
// pub type PLSA_AP_CALL_PACKAGE_UNTRUSTED = Option<unsafe extern "system" fn(clientrequest: *const *const core::ffi::c_void, protocolsubmitbuffer: *const core::ffi::c_void, clientbufferbase: *const core::ffi::c_void, submitbufferlength: u32, protocolreturnbuffer: *mut *mut core::ffi::c_void, returnbufferlength: *mut u32, protocolstatus: *mut i32) -> super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 498:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRIVILEGE_SET {
//     pub PrivilegeCount: u32,
//     pub Control: u32,
//     pub Privilege: [LUID_AND_ATTRIBUTES; 1],
// }

// UNSUPPORTED Rust 505:1: declaration Impl has no candidate rule
// impl Default for PRIVILEGE_SET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PROTECTED_DACL_SECURITY_INFORMATION`: `OBJECT_SECURITY_INFORMATION` = 2147483648u;
public const val `PROTECTED_SACL_SECURITY_INFORMATION`: `OBJECT_SECURITY_INFORMATION` = 1073741824u;
// UNSUPPORTED Rust 512:1: non-scalar type Ptr unsupported
// pub type PSECURITY_DESCRIPTOR = *mut core::ffi::c_void;

// UNSUPPORTED Rust 513:1: non-scalar type Ptr unsupported
// pub type PSID = *mut core::ffi::c_void;

// UNSUPPORTED Rust 514:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct QUOTA_LIMITS {
//     pub PagedPoolLimit: usize,
//     pub NonPagedPoolLimit: usize,
//     pub MinimumWorkingSetSize: usize,
//     pub MaximumWorkingSetSize: usize,
//     pub PagefileLimit: usize,
//     pub TimeLimit: i64,
// }

public const val `SACL_SECURITY_INFORMATION`: `OBJECT_SECURITY_INFORMATION` = 8u;
// UNSUPPORTED Rust 525:1: non-scalar type Ptr unsupported
// pub type SAFER_LEVEL_HANDLE = *mut core::ffi::c_void;

public const val `SANDBOX_INERT`: `CREATE_RESTRICTED_TOKEN_FLAGS` = 2u;
public const val `SCOPE_SECURITY_INFORMATION`: `OBJECT_SECURITY_INFORMATION` = 64u;
// UNSUPPORTED Rust 528:1: unresolved scalar type SID_IDENTIFIER_AUTHORITY
// pub const SECURITY_APP_PACKAGE_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY { Value: [0, 0, 0, 0, 0, 15] };

// UNSUPPORTED Rust 529:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECURITY_ATTRIBUTES {
//     pub nLength: u32,
//     pub lpSecurityDescriptor: *mut core::ffi::c_void,
//     pub bInheritHandle: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 536:1: declaration Impl has no candidate rule
// impl Default for SECURITY_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 541:1: unresolved scalar type SID_IDENTIFIER_AUTHORITY
// pub const SECURITY_AUTHENTICATION_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY { Value: [0, 0, 0, 0, 0, 18] };

public typealias `SECURITY_AUTO_INHERIT_FLAGS` = UInt;
// UNSUPPORTED Rust 543:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECURITY_CAPABILITIES {
//     pub AppContainerSid: PSID,
//     pub Capabilities: *mut SID_AND_ATTRIBUTES,
//     pub CapabilityCount: u32,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 551:1: declaration Impl has no candidate rule
// impl Default for SECURITY_CAPABILITIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 556:1: unresolved scalar type SID_IDENTIFIER_AUTHORITY
// pub const SECURITY_CREATOR_SID_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY { Value: [0, 0, 0, 0, 0, 3] };

// UNSUPPORTED Rust 557:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECURITY_DESCRIPTOR {
//     pub Revision: u8,
//     pub Sbz1: u8,
//     pub Control: SECURITY_DESCRIPTOR_CONTROL,
//     pub Owner: PSID,
//     pub Group: PSID,
//     pub Sacl: *mut ACL,
//     pub Dacl: *mut ACL,
// }

// UNSUPPORTED Rust 568:1: declaration Impl has no candidate rule
// impl Default for SECURITY_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SECURITY_DESCRIPTOR_CONTROL` = UShort;
// UNSUPPORTED Rust 574:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECURITY_DESCRIPTOR_RELATIVE {
//     pub Revision: u8,
//     pub Sbz1: u8,
//     pub Control: SECURITY_DESCRIPTOR_CONTROL,
//     pub Owner: u32,
//     pub Group: u32,
//     pub Sacl: u32,
//     pub Dacl: u32,
// }

public const val `SECURITY_DYNAMIC_TRACKING`: Boolean = true;
public typealias `SECURITY_IMPERSONATION_LEVEL` = Int;
// UNSUPPORTED Rust 587:1: unresolved scalar type SID_IDENTIFIER_AUTHORITY
// pub const SECURITY_LOCAL_SID_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY { Value: [0, 0, 0, 0, 0, 2] };

// UNSUPPORTED Rust 588:1: unresolved scalar type SID_IDENTIFIER_AUTHORITY
// pub const SECURITY_MANDATORY_LABEL_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY { Value: [0, 0, 0, 0, 0, 16] };

public const val `SECURITY_MAX_SID_SIZE`: UInt = 68u;
// UNSUPPORTED Rust 590:1: unresolved scalar type SID_IDENTIFIER_AUTHORITY
// pub const SECURITY_NON_UNIQUE_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY { Value: [0, 0, 0, 0, 0, 4] };

// UNSUPPORTED Rust 591:1: unresolved scalar type SID_IDENTIFIER_AUTHORITY
// pub const SECURITY_NT_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY { Value: [0, 0, 0, 0, 0, 5] };

// UNSUPPORTED Rust 592:1: unresolved scalar type SID_IDENTIFIER_AUTHORITY
// pub const SECURITY_NULL_SID_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY { Value: [0, 0, 0, 0, 0, 0] };

// UNSUPPORTED Rust 593:1: unresolved scalar type SID_IDENTIFIER_AUTHORITY
// pub const SECURITY_PROCESS_TRUST_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY { Value: [0, 0, 0, 0, 0, 19] };

// UNSUPPORTED Rust 594:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECURITY_QUALITY_OF_SERVICE {
//     pub Length: u32,
//     pub ImpersonationLevel: SECURITY_IMPERSONATION_LEVEL,
//     pub ContextTrackingMode: u8,
//     pub EffectiveOnly: bool,
// }

// UNSUPPORTED Rust 602:1: unresolved scalar type SID_IDENTIFIER_AUTHORITY
// pub const SECURITY_RESOURCE_MANAGER_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY { Value: [0, 0, 0, 0, 0, 9] };

// UNSUPPORTED Rust 603:1: unresolved scalar type SID_IDENTIFIER_AUTHORITY
// pub const SECURITY_SCOPED_POLICY_ID_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY { Value: [0, 0, 0, 0, 0, 17] };

public const val `SECURITY_STATIC_TRACKING`: Boolean = false;
// UNSUPPORTED Rust 605:1: unresolved scalar type SID_IDENTIFIER_AUTHORITY
// pub const SECURITY_WORLD_SID_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY { Value: [0, 0, 0, 0, 0, 1] };

// UNSUPPORTED Rust 606:1: generic scalar type unsupported
// pub type SEC_THREAD_START = Option<unsafe extern "system" fn(lpthreadparameter: *mut core::ffi::c_void) -> u32>;

public const val `SEF_AVOID_OWNER_CHECK`: `SECURITY_AUTO_INHERIT_FLAGS` = 16u;
public const val `SEF_AVOID_OWNER_RESTRICTION`: `SECURITY_AUTO_INHERIT_FLAGS` = 4096u;
public const val `SEF_AVOID_PRIVILEGE_CHECK`: `SECURITY_AUTO_INHERIT_FLAGS` = 8u;
public const val `SEF_DACL_AUTO_INHERIT`: `SECURITY_AUTO_INHERIT_FLAGS` = 1u;
public const val `SEF_DEFAULT_DESCRIPTOR_FOR_OBJECT`: `SECURITY_AUTO_INHERIT_FLAGS` = 4u;
public const val `SEF_DEFAULT_GROUP_FROM_PARENT`: `SECURITY_AUTO_INHERIT_FLAGS` = 64u;
public const val `SEF_DEFAULT_OWNER_FROM_PARENT`: `SECURITY_AUTO_INHERIT_FLAGS` = 32u;
public const val `SEF_MACL_NO_EXECUTE_UP`: `SECURITY_AUTO_INHERIT_FLAGS` = 1024u;
public const val `SEF_MACL_NO_READ_UP`: `SECURITY_AUTO_INHERIT_FLAGS` = 512u;
public const val `SEF_MACL_NO_WRITE_UP`: `SECURITY_AUTO_INHERIT_FLAGS` = 256u;
public const val `SEF_SACL_AUTO_INHERIT`: `SECURITY_AUTO_INHERIT_FLAGS` = 2u;
// UNSUPPORTED Rust 618:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SE_ACCESS_REPLY {
//     pub Size: u32,
//     pub ResultListCount: u32,
//     pub GrantedAccess: *mut u32,
//     pub AccessStatus: *mut u32,
//     pub AccessReason: *mut ACCESS_REASONS,
//     pub Privileges: *mut *mut PRIVILEGE_SET,
// }

// UNSUPPORTED Rust 628:1: declaration Impl has no candidate rule
// impl Default for SE_ACCESS_REPLY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 633:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SE_ACCESS_REQUEST {
//     pub Size: u32,
//     pub SeSecurityDescriptor: *mut SE_SECURITY_DESCRIPTOR,
//     pub DesiredAccess: u32,
//     pub PreviouslyGrantedAccess: u32,
//     pub PrincipalSelfSid: PSID,
//     pub GenericMapping: *mut GENERIC_MAPPING,
//     pub ObjectTypeListCount: u32,
//     pub ObjectTypeList: *mut OBJECT_TYPE_LIST,
// }

// UNSUPPORTED Rust 645:1: declaration Impl has no candidate rule
// impl Default for SE_ACCESS_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 650:1: non-scalar type Ptr unsupported
// pub const SE_ASSIGNPRIMARYTOKEN_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeAssignPrimaryTokenPrivilege");

// UNSUPPORTED Rust 651:1: non-scalar type Ptr unsupported
// pub const SE_AUDIT_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeAuditPrivilege");

// UNSUPPORTED Rust 652:1: non-scalar type Ptr unsupported
// pub const SE_BACKUP_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeBackupPrivilege");

// UNSUPPORTED Rust 653:1: non-scalar type Ptr unsupported
// pub const SE_CHANGE_NOTIFY_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeChangeNotifyPrivilege");

// UNSUPPORTED Rust 654:1: non-scalar type Ptr unsupported
// pub const SE_CREATE_GLOBAL_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeCreateGlobalPrivilege");

// UNSUPPORTED Rust 655:1: non-scalar type Ptr unsupported
// pub const SE_CREATE_PAGEFILE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeCreatePagefilePrivilege");

// UNSUPPORTED Rust 656:1: non-scalar type Ptr unsupported
// pub const SE_CREATE_PERMANENT_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeCreatePermanentPrivilege");

// UNSUPPORTED Rust 657:1: non-scalar type Ptr unsupported
// pub const SE_CREATE_SYMBOLIC_LINK_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeCreateSymbolicLinkPrivilege");

// UNSUPPORTED Rust 658:1: non-scalar type Ptr unsupported
// pub const SE_CREATE_TOKEN_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeCreateTokenPrivilege");

public const val `SE_DACL_AUTO_INHERITED`: `SECURITY_DESCRIPTOR_CONTROL` = 1024u;
public const val `SE_DACL_AUTO_INHERIT_REQ`: `SECURITY_DESCRIPTOR_CONTROL` = 256u;
public const val `SE_DACL_DEFAULTED`: `SECURITY_DESCRIPTOR_CONTROL` = 8u;
public const val `SE_DACL_PRESENT`: `SECURITY_DESCRIPTOR_CONTROL` = 4u;
public const val `SE_DACL_PROTECTED`: `SECURITY_DESCRIPTOR_CONTROL` = 4096u;
// UNSUPPORTED Rust 664:1: non-scalar type Ptr unsupported
// pub const SE_DEBUG_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeDebugPrivilege");

// UNSUPPORTED Rust 665:1: non-scalar type Ptr unsupported
// pub const SE_DELEGATE_SESSION_USER_IMPERSONATE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeDelegateSessionUserImpersonatePrivilege");

// UNSUPPORTED Rust 666:1: non-scalar type Ptr unsupported
// pub const SE_ENABLE_DELEGATION_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeEnableDelegationPrivilege");

public const val `SE_GROUP_DEFAULTED`: `SECURITY_DESCRIPTOR_CONTROL` = 2u;
// UNSUPPORTED Rust 668:1: non-scalar type Ptr unsupported
// pub const SE_IMPERSONATE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeImpersonatePrivilege");

// UNSUPPORTED Rust 669:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SE_IMPERSONATION_STATE {
//     pub Token: *mut core::ffi::c_void,
//     pub CopyOnOpen: bool,
//     pub EffectiveOnly: bool,
//     pub Level: SECURITY_IMPERSONATION_LEVEL,
// }

// UNSUPPORTED Rust 677:1: declaration Impl has no candidate rule
// impl Default for SE_IMPERSONATION_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 682:1: non-scalar type Ptr unsupported
// pub const SE_INCREASE_QUOTA_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeIncreaseQuotaPrivilege");

// UNSUPPORTED Rust 683:1: non-scalar type Ptr unsupported
// pub const SE_INC_BASE_PRIORITY_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeIncreaseBasePriorityPrivilege");

// UNSUPPORTED Rust 684:1: non-scalar type Ptr unsupported
// pub const SE_INC_WORKING_SET_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeIncreaseWorkingSetPrivilege");

// UNSUPPORTED Rust 685:1: non-scalar type Ptr unsupported
// pub const SE_LOAD_DRIVER_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeLoadDriverPrivilege");

// UNSUPPORTED Rust 686:1: non-scalar type Ptr unsupported
// pub const SE_LOCK_MEMORY_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeLockMemoryPrivilege");

// UNSUPPORTED Rust 687:1: non-scalar type Ptr unsupported
// pub const SE_MACHINE_ACCOUNT_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeMachineAccountPrivilege");

// UNSUPPORTED Rust 688:1: non-scalar type Ptr unsupported
// pub const SE_MANAGE_VOLUME_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeManageVolumePrivilege");

public const val `SE_OWNER_DEFAULTED`: `SECURITY_DESCRIPTOR_CONTROL` = 1u;
public const val `SE_PRIVILEGE_ENABLED`: `TOKEN_PRIVILEGES_ATTRIBUTES` = 2u;
public const val `SE_PRIVILEGE_ENABLED_BY_DEFAULT`: `TOKEN_PRIVILEGES_ATTRIBUTES` = 1u;
public const val `SE_PRIVILEGE_REMOVED`: `TOKEN_PRIVILEGES_ATTRIBUTES` = 4u;
public const val `SE_PRIVILEGE_USED_FOR_ACCESS`: `TOKEN_PRIVILEGES_ATTRIBUTES` = 2147483648u;
// UNSUPPORTED Rust 694:1: non-scalar type Ptr unsupported
// pub const SE_PROF_SINGLE_PROCESS_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeProfileSingleProcessPrivilege");

// UNSUPPORTED Rust 695:1: non-scalar type Ptr unsupported
// pub const SE_RELABEL_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeRelabelPrivilege");

// UNSUPPORTED Rust 696:1: non-scalar type Ptr unsupported
// pub const SE_REMOTE_SHUTDOWN_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeRemoteShutdownPrivilege");

// UNSUPPORTED Rust 697:1: non-scalar type Ptr unsupported
// pub const SE_RESTORE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeRestorePrivilege");

public const val `SE_RM_CONTROL_VALID`: `SECURITY_DESCRIPTOR_CONTROL` = 16384u;
public const val `SE_SACL_AUTO_INHERITED`: `SECURITY_DESCRIPTOR_CONTROL` = 2048u;
public const val `SE_SACL_AUTO_INHERIT_REQ`: `SECURITY_DESCRIPTOR_CONTROL` = 512u;
public const val `SE_SACL_DEFAULTED`: `SECURITY_DESCRIPTOR_CONTROL` = 32u;
public const val `SE_SACL_PRESENT`: `SECURITY_DESCRIPTOR_CONTROL` = 16u;
public const val `SE_SACL_PROTECTED`: `SECURITY_DESCRIPTOR_CONTROL` = 8192u;
// UNSUPPORTED Rust 704:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SE_SECURITY_DESCRIPTOR {
//     pub Size: u32,
//     pub Flags: u32,
//     pub SecurityDescriptor: PSECURITY_DESCRIPTOR,
// }

// UNSUPPORTED Rust 711:1: declaration Impl has no candidate rule
// impl Default for SE_SECURITY_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 716:1: non-scalar type Ptr unsupported
// pub const SE_SECURITY_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeSecurityPrivilege");

public const val `SE_SELF_RELATIVE`: `SECURITY_DESCRIPTOR_CONTROL` = 32768u;
// UNSUPPORTED Rust 718:1: non-scalar type Ptr unsupported
// pub const SE_SHUTDOWN_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeShutdownPrivilege");

// UNSUPPORTED Rust 719:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SE_SID {
//     pub Sid: SID,
//     pub Buffer: [u8; 68],
// }

// UNSUPPORTED Rust 725:1: declaration Impl has no candidate rule
// impl Default for SE_SID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 730:1: non-scalar type Ptr unsupported
// pub const SE_SYNC_AGENT_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeSyncAgentPrivilege");

// UNSUPPORTED Rust 731:1: non-scalar type Ptr unsupported
// pub const SE_SYSTEMTIME_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeSystemtimePrivilege");

// UNSUPPORTED Rust 732:1: non-scalar type Ptr unsupported
// pub const SE_SYSTEM_ENVIRONMENT_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeSystemEnvironmentPrivilege");

// UNSUPPORTED Rust 733:1: non-scalar type Ptr unsupported
// pub const SE_SYSTEM_PROFILE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeSystemProfilePrivilege");

// UNSUPPORTED Rust 734:1: non-scalar type Ptr unsupported
// pub const SE_TAKE_OWNERSHIP_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeTakeOwnershipPrivilege");

// UNSUPPORTED Rust 735:1: non-scalar type Ptr unsupported
// pub const SE_TCB_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeTcbPrivilege");

// UNSUPPORTED Rust 736:1: non-scalar type Ptr unsupported
// pub const SE_TIME_ZONE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeTimeZonePrivilege");

// UNSUPPORTED Rust 737:1: non-scalar type Ptr unsupported
// pub const SE_TRUSTED_CREDMAN_ACCESS_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeTrustedCredManAccessPrivilege");

// UNSUPPORTED Rust 738:1: non-scalar type Ptr unsupported
// pub const SE_UNDOCK_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeUndockPrivilege");

// UNSUPPORTED Rust 739:1: non-scalar type Ptr unsupported
// pub const SE_UNSOLICITED_INPUT_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeUnsolicitedInputPrivilege");

// UNSUPPORTED Rust 740:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SID {
//     pub Revision: u8,
//     pub SubAuthorityCount: u8,
//     pub IdentifierAuthority: SID_IDENTIFIER_AUTHORITY,
//     pub SubAuthority: [u32; 1],
// }

// UNSUPPORTED Rust 748:1: declaration Impl has no candidate rule
// impl Default for SID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 753:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SID_AND_ATTRIBUTES {
//     pub Sid: PSID,
//     pub Attributes: u32,
// }

// UNSUPPORTED Rust 759:1: declaration Impl has no candidate rule
// impl Default for SID_AND_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 764:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SID_AND_ATTRIBUTES_HASH {
//     pub SidCount: u32,
//     pub SidAttr: *mut SID_AND_ATTRIBUTES,
//     pub Hash: [usize; 32],
// }

// UNSUPPORTED Rust 771:1: declaration Impl has no candidate rule
// impl Default for SID_AND_ATTRIBUTES_HASH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 776:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SID_IDENTIFIER_AUTHORITY {
//     pub Value: [u8; 6],
// }

// UNSUPPORTED Rust 781:1: declaration Impl has no candidate rule
// impl Default for SID_IDENTIFIER_AUTHORITY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SID_NAME_USE` = Int;
public const val `SIGNING_LEVEL_FILE_CACHE_FLAG_NOT_VALIDATED`: UInt = 1u;
public const val `SIGNING_LEVEL_FILE_CACHE_FLAG_VALIDATE_ONLY`: UInt = 4u;
public const val `SIGNING_LEVEL_MICROSOFT`: UInt = 8u;
public const val `SUB_CONTAINERS_AND_OBJECTS_INHERIT`: `ACE_FLAGS` = 3u;
public const val `SUB_CONTAINERS_ONLY_INHERIT`: `ACE_FLAGS` = 2u;
public const val `SUB_OBJECTS_ONLY_INHERIT`: `ACE_FLAGS` = 1u;
public const val `SUCCESSFUL_ACCESS_ACE_FLAG`: `ACE_FLAGS` = 64u;
// UNSUPPORTED Rust 794:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SYSTEM_ACCESS_FILTER_ACE {
//     pub Header: ACE_HEADER,
//     pub Mask: u32,
//     pub SidStart: u32,
// }

// UNSUPPORTED Rust 801:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SYSTEM_ALARM_ACE {
//     pub Header: ACE_HEADER,
//     pub Mask: u32,
//     pub SidStart: u32,
// }

// UNSUPPORTED Rust 808:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SYSTEM_ALARM_CALLBACK_ACE {
//     pub Header: ACE_HEADER,
//     pub Mask: u32,
//     pub SidStart: u32,
// }

// UNSUPPORTED Rust 815:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SYSTEM_ALARM_CALLBACK_OBJECT_ACE {
//     pub Header: ACE_HEADER,
//     pub Mask: u32,
//     pub Flags: SYSTEM_AUDIT_OBJECT_ACE_FLAGS,
//     pub ObjectType: windows_sys::core::GUID,
//     pub InheritedObjectType: windows_sys::core::GUID,
//     pub SidStart: u32,
// }

// UNSUPPORTED Rust 825:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SYSTEM_ALARM_OBJECT_ACE {
//     pub Header: ACE_HEADER,
//     pub Mask: u32,
//     pub Flags: u32,
//     pub ObjectType: windows_sys::core::GUID,
//     pub InheritedObjectType: windows_sys::core::GUID,
//     pub SidStart: u32,
// }

// UNSUPPORTED Rust 835:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SYSTEM_AUDIT_ACE {
//     pub Header: ACE_HEADER,
//     pub Mask: u32,
//     pub SidStart: u32,
// }

// UNSUPPORTED Rust 842:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SYSTEM_AUDIT_CALLBACK_ACE {
//     pub Header: ACE_HEADER,
//     pub Mask: u32,
//     pub SidStart: u32,
// }

// UNSUPPORTED Rust 849:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SYSTEM_AUDIT_CALLBACK_OBJECT_ACE {
//     pub Header: ACE_HEADER,
//     pub Mask: u32,
//     pub Flags: SYSTEM_AUDIT_OBJECT_ACE_FLAGS,
//     pub ObjectType: windows_sys::core::GUID,
//     pub InheritedObjectType: windows_sys::core::GUID,
//     pub SidStart: u32,
// }

// UNSUPPORTED Rust 859:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SYSTEM_AUDIT_OBJECT_ACE {
//     pub Header: ACE_HEADER,
//     pub Mask: u32,
//     pub Flags: SYSTEM_AUDIT_OBJECT_ACE_FLAGS,
//     pub ObjectType: windows_sys::core::GUID,
//     pub InheritedObjectType: windows_sys::core::GUID,
//     pub SidStart: u32,
// }

public typealias `SYSTEM_AUDIT_OBJECT_ACE_FLAGS` = UInt;
// UNSUPPORTED Rust 870:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SYSTEM_MANDATORY_LABEL_ACE {
//     pub Header: ACE_HEADER,
//     pub Mask: u32,
//     pub SidStart: u32,
// }

// UNSUPPORTED Rust 877:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SYSTEM_PROCESS_TRUST_LABEL_ACE {
//     pub Header: ACE_HEADER,
//     pub Mask: u32,
//     pub SidStart: u32,
// }

// UNSUPPORTED Rust 884:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SYSTEM_RESOURCE_ATTRIBUTE_ACE {
//     pub Header: ACE_HEADER,
//     pub Mask: u32,
//     pub SidStart: u32,
// }

// UNSUPPORTED Rust 891:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SYSTEM_SCOPED_POLICY_ID_ACE {
//     pub Header: ACE_HEADER,
//     pub Mask: u32,
//     pub SidStart: u32,
// }

public const val `SecurityAnonymous`: `SECURITY_IMPERSONATION_LEVEL` = 0;
public const val `SecurityDelegation`: `SECURITY_IMPERSONATION_LEVEL` = 3;
public const val `SecurityIdentification`: `SECURITY_IMPERSONATION_LEVEL` = 1;
public const val `SecurityImpersonation`: `SECURITY_IMPERSONATION_LEVEL` = 2;
public const val `SidTypeAlias`: `SID_NAME_USE` = 4;
public const val `SidTypeComputer`: `SID_NAME_USE` = 9;
public const val `SidTypeDeletedAccount`: `SID_NAME_USE` = 6;
public const val `SidTypeDomain`: `SID_NAME_USE` = 3;
public const val `SidTypeGroup`: `SID_NAME_USE` = 2;
public const val `SidTypeInvalid`: `SID_NAME_USE` = 7;
public const val `SidTypeLabel`: `SID_NAME_USE` = 10;
public const val `SidTypeLogonSession`: `SID_NAME_USE` = 11;
public const val `SidTypeUnknown`: `SID_NAME_USE` = 8;
public const val `SidTypeUser`: `SID_NAME_USE` = 1;
public const val `SidTypeWellKnownGroup`: `SID_NAME_USE` = 5;
// UNSUPPORTED Rust 913:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TOKEN_ACCESS_INFORMATION {
//     pub SidHash: *mut SID_AND_ATTRIBUTES_HASH,
//     pub RestrictedSidHash: *mut SID_AND_ATTRIBUTES_HASH,
//     pub Privileges: *mut TOKEN_PRIVILEGES,
//     pub AuthenticationId: super::Foundation::LUID,
//     pub TokenType: TOKEN_TYPE,
//     pub ImpersonationLevel: SECURITY_IMPERSONATION_LEVEL,
//     pub MandatoryPolicy: TOKEN_MANDATORY_POLICY,
//     pub Flags: u32,
//     pub AppContainerNumber: u32,
//     pub PackageSid: PSID,
//     pub CapabilitiesHash: *mut SID_AND_ATTRIBUTES_HASH,
//     pub TrustLevelSid: PSID,
//     pub SecurityAttributes: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 930:1: declaration Impl has no candidate rule
// impl Default for TOKEN_ACCESS_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `TOKEN_ACCESS_MASK` = UInt;
public const val `TOKEN_ACCESS_PSEUDO_HANDLE`: `TOKEN_ACCESS_MASK` = 24u;
public const val `TOKEN_ACCESS_PSEUDO_HANDLE_WIN8`: `TOKEN_ACCESS_MASK` = 24u;
public const val `TOKEN_ACCESS_SYSTEM_SECURITY`: `TOKEN_ACCESS_MASK` = 16777216u;
public const val `TOKEN_ADJUST_DEFAULT`: `TOKEN_ACCESS_MASK` = 128u;
public const val `TOKEN_ADJUST_GROUPS`: `TOKEN_ACCESS_MASK` = 64u;
public const val `TOKEN_ADJUST_PRIVILEGES`: `TOKEN_ACCESS_MASK` = 32u;
public const val `TOKEN_ADJUST_SESSIONID`: `TOKEN_ACCESS_MASK` = 256u;
public const val `TOKEN_ALL_ACCESS`: `TOKEN_ACCESS_MASK` = 983551u;
// UNSUPPORTED Rust 944:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TOKEN_APPCONTAINER_INFORMATION {
//     pub TokenAppContainer: PSID,
// }

// UNSUPPORTED Rust 949:1: declaration Impl has no candidate rule
// impl Default for TOKEN_APPCONTAINER_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TOKEN_ASSIGN_PRIMARY`: `TOKEN_ACCESS_MASK` = 1u;
// UNSUPPORTED Rust 955:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TOKEN_AUDIT_POLICY {
//     pub PerUserPolicy: [u8; 30],
// }

// UNSUPPORTED Rust 960:1: declaration Impl has no candidate rule
// impl Default for TOKEN_AUDIT_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 965:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TOKEN_CONTROL {
//     pub TokenId: super::Foundation::LUID,
//     pub AuthenticationId: super::Foundation::LUID,
//     pub ModifiedId: super::Foundation::LUID,
//     pub TokenSource: TOKEN_SOURCE,
// }

// UNSUPPORTED Rust 973:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TOKEN_DEFAULT_DACL {
//     pub DefaultDacl: *mut ACL,
// }

// UNSUPPORTED Rust 978:1: declaration Impl has no candidate rule
// impl Default for TOKEN_DEFAULT_DACL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TOKEN_DELETE`: `TOKEN_ACCESS_MASK` = 65536u;
// UNSUPPORTED Rust 984:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TOKEN_DEVICE_CLAIMS {
//     pub DeviceClaims: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 989:1: declaration Impl has no candidate rule
// impl Default for TOKEN_DEVICE_CLAIMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TOKEN_DUPLICATE`: `TOKEN_ACCESS_MASK` = 2u;
// UNSUPPORTED Rust 995:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TOKEN_ELEVATION {
//     pub TokenIsElevated: u32,
// }

public typealias `TOKEN_ELEVATION_TYPE` = Int;
public const val `TOKEN_EXECUTE`: `TOKEN_ACCESS_MASK` = 131072u;
// UNSUPPORTED Rust 1002:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TOKEN_GROUPS {
//     pub GroupCount: u32,
//     pub Groups: [SID_AND_ATTRIBUTES; 1],
// }

// UNSUPPORTED Rust 1008:1: declaration Impl has no candidate rule
// impl Default for TOKEN_GROUPS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1013:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TOKEN_GROUPS_AND_PRIVILEGES {
//     pub SidCount: u32,
//     pub SidLength: u32,
//     pub Sids: *mut SID_AND_ATTRIBUTES,
//     pub RestrictedSidCount: u32,
//     pub RestrictedSidLength: u32,
//     pub RestrictedSids: *mut SID_AND_ATTRIBUTES,
//     pub PrivilegeCount: u32,
//     pub PrivilegeLength: u32,
//     pub Privileges: *mut LUID_AND_ATTRIBUTES,
//     pub AuthenticationId: super::Foundation::LUID,
// }

// UNSUPPORTED Rust 1027:1: declaration Impl has no candidate rule
// impl Default for TOKEN_GROUPS_AND_PRIVILEGES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TOKEN_IMPERSONATE`: `TOKEN_ACCESS_MASK` = 4u;
public typealias `TOKEN_INFORMATION_CLASS` = Int;
// UNSUPPORTED Rust 1034:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TOKEN_LINKED_TOKEN {
//     pub LinkedToken: super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 1039:1: declaration Impl has no candidate rule
// impl Default for TOKEN_LINKED_TOKEN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1044:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TOKEN_MANDATORY_LABEL {
//     pub Label: SID_AND_ATTRIBUTES,
// }

// UNSUPPORTED Rust 1049:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TOKEN_MANDATORY_POLICY {
//     pub Policy: TOKEN_MANDATORY_POLICY_ID,
// }

public typealias `TOKEN_MANDATORY_POLICY_ID` = UInt;
public const val `TOKEN_MANDATORY_POLICY_NEW_PROCESS_MIN`: `TOKEN_MANDATORY_POLICY_ID` = 2u;
public const val `TOKEN_MANDATORY_POLICY_NO_WRITE_UP`: `TOKEN_MANDATORY_POLICY_ID` = 1u;
public const val `TOKEN_MANDATORY_POLICY_OFF`: `TOKEN_MANDATORY_POLICY_ID` = 0u;
public const val `TOKEN_MANDATORY_POLICY_VALID_MASK`: `TOKEN_MANDATORY_POLICY_ID` = 3u;
// UNSUPPORTED Rust 1059:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TOKEN_ORIGIN {
//     pub OriginatingLogonSession: super::Foundation::LUID,
// }

// UNSUPPORTED Rust 1064:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TOKEN_OWNER {
//     pub Owner: PSID,
// }

// UNSUPPORTED Rust 1069:1: declaration Impl has no candidate rule
// impl Default for TOKEN_OWNER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1074:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TOKEN_PRIMARY_GROUP {
//     pub PrimaryGroup: PSID,
// }

// UNSUPPORTED Rust 1079:1: declaration Impl has no candidate rule
// impl Default for TOKEN_PRIMARY_GROUP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1084:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TOKEN_PRIVILEGES {
//     pub PrivilegeCount: u32,
//     pub Privileges: [LUID_AND_ATTRIBUTES; 1],
// }

// UNSUPPORTED Rust 1090:1: declaration Impl has no candidate rule
// impl Default for TOKEN_PRIVILEGES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `TOKEN_PRIVILEGES_ATTRIBUTES` = UInt;
public const val `TOKEN_QUERY`: `TOKEN_ACCESS_MASK` = 8u;
public const val `TOKEN_QUERY_SOURCE`: `TOKEN_ACCESS_MASK` = 16u;
public const val `TOKEN_READ`: `TOKEN_ACCESS_MASK` = 131080u;
public const val `TOKEN_READ_CONTROL`: `TOKEN_ACCESS_MASK` = 131072u;
// UNSUPPORTED Rust 1100:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TOKEN_SOURCE {
//     pub SourceName: [i8; 8],
//     pub SourceIdentifier: super::Foundation::LUID,
// }

// UNSUPPORTED Rust 1106:1: declaration Impl has no candidate rule
// impl Default for TOKEN_SOURCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1111:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TOKEN_STATISTICS {
//     pub TokenId: super::Foundation::LUID,
//     pub AuthenticationId: super::Foundation::LUID,
//     pub ExpirationTime: i64,
//     pub TokenType: TOKEN_TYPE,
//     pub ImpersonationLevel: SECURITY_IMPERSONATION_LEVEL,
//     pub DynamicCharged: u32,
//     pub DynamicAvailable: u32,
//     pub GroupCount: u32,
//     pub PrivilegeCount: u32,
//     pub ModifiedId: super::Foundation::LUID,
// }

public const val `TOKEN_TRUST_CONSTRAINT_MASK`: `TOKEN_ACCESS_MASK` = 131096u;
public typealias `TOKEN_TYPE` = Int;
// UNSUPPORTED Rust 1127:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TOKEN_USER {
//     pub User: SID_AND_ATTRIBUTES,
// }

// UNSUPPORTED Rust 1132:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TOKEN_USER_CLAIMS {
//     pub UserClaims: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1137:1: declaration Impl has no candidate rule
// impl Default for TOKEN_USER_CLAIMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TOKEN_WRITE`: `TOKEN_ACCESS_MASK` = 131296u;
public const val `TOKEN_WRITE_DAC`: `TOKEN_ACCESS_MASK` = 262144u;
public const val `TOKEN_WRITE_OWNER`: `TOKEN_ACCESS_MASK` = 524288u;
public const val `TokenAccessInformation`: `TOKEN_INFORMATION_CLASS` = 22;
public const val `TokenAppContainerNumber`: `TOKEN_INFORMATION_CLASS` = 32;
public const val `TokenAppContainerSid`: `TOKEN_INFORMATION_CLASS` = 31;
public const val `TokenAuditPolicy`: `TOKEN_INFORMATION_CLASS` = 16;
public const val `TokenBnoIsolation`: `TOKEN_INFORMATION_CLASS` = 44;
public const val `TokenCapabilities`: `TOKEN_INFORMATION_CLASS` = 30;
public const val `TokenChildProcessFlags`: `TOKEN_INFORMATION_CLASS` = 45;
public const val `TokenDefaultDacl`: `TOKEN_INFORMATION_CLASS` = 6;
public const val `TokenDeviceClaimAttributes`: `TOKEN_INFORMATION_CLASS` = 34;
public const val `TokenDeviceGroups`: `TOKEN_INFORMATION_CLASS` = 37;
public const val `TokenElevation`: `TOKEN_INFORMATION_CLASS` = 20;
public const val `TokenElevationType`: `TOKEN_INFORMATION_CLASS` = 18;
public const val `TokenElevationTypeDefault`: `TOKEN_ELEVATION_TYPE` = 1;
public const val `TokenElevationTypeFull`: `TOKEN_ELEVATION_TYPE` = 2;
public const val `TokenElevationTypeLimited`: `TOKEN_ELEVATION_TYPE` = 3;
public const val `TokenGroups`: `TOKEN_INFORMATION_CLASS` = 2;
public const val `TokenGroupsAndPrivileges`: `TOKEN_INFORMATION_CLASS` = 13;
public const val `TokenHasRestrictions`: `TOKEN_INFORMATION_CLASS` = 21;
public const val `TokenImpersonation`: `TOKEN_TYPE` = 2;
public const val `TokenImpersonationLevel`: `TOKEN_INFORMATION_CLASS` = 9;
public const val `TokenIntegrityLevel`: `TOKEN_INFORMATION_CLASS` = 25;
public const val `TokenIsAppContainer`: `TOKEN_INFORMATION_CLASS` = 29;
public const val `TokenIsAppSilo`: `TOKEN_INFORMATION_CLASS` = 48;
public const val `TokenIsLessPrivilegedAppContainer`: `TOKEN_INFORMATION_CLASS` = 46;
public const val `TokenIsRestricted`: `TOKEN_INFORMATION_CLASS` = 40;
public const val `TokenIsSandboxed`: `TOKEN_INFORMATION_CLASS` = 47;
public const val `TokenLinkedToken`: `TOKEN_INFORMATION_CLASS` = 19;
public const val `TokenLogonSid`: `TOKEN_INFORMATION_CLASS` = 28;
public const val `TokenMandatoryPolicy`: `TOKEN_INFORMATION_CLASS` = 27;
public const val `TokenOrigin`: `TOKEN_INFORMATION_CLASS` = 17;
public const val `TokenOwner`: `TOKEN_INFORMATION_CLASS` = 4;
public const val `TokenPrimary`: `TOKEN_TYPE` = 1;
public const val `TokenPrimaryGroup`: `TOKEN_INFORMATION_CLASS` = 5;
public const val `TokenPrivateNameSpace`: `TOKEN_INFORMATION_CLASS` = 42;
public const val `TokenPrivileges`: `TOKEN_INFORMATION_CLASS` = 3;
public const val `TokenProcessTrustLevel`: `TOKEN_INFORMATION_CLASS` = 41;
public const val `TokenRestrictedDeviceClaimAttributes`: `TOKEN_INFORMATION_CLASS` = 36;
public const val `TokenRestrictedDeviceGroups`: `TOKEN_INFORMATION_CLASS` = 38;
public const val `TokenRestrictedSids`: `TOKEN_INFORMATION_CLASS` = 11;
public const val `TokenRestrictedUserClaimAttributes`: `TOKEN_INFORMATION_CLASS` = 35;
public const val `TokenSandBoxInert`: `TOKEN_INFORMATION_CLASS` = 15;
public const val `TokenSecurityAttributes`: `TOKEN_INFORMATION_CLASS` = 39;
public const val `TokenSessionId`: `TOKEN_INFORMATION_CLASS` = 12;
public const val `TokenSessionReference`: `TOKEN_INFORMATION_CLASS` = 14;
public const val `TokenSingletonAttributes`: `TOKEN_INFORMATION_CLASS` = 43;
public const val `TokenSource`: `TOKEN_INFORMATION_CLASS` = 7;
public const val `TokenStatistics`: `TOKEN_INFORMATION_CLASS` = 10;
public const val `TokenType`: `TOKEN_INFORMATION_CLASS` = 8;
public const val `TokenUIAccess`: `TOKEN_INFORMATION_CLASS` = 26;
public const val `TokenUser`: `TOKEN_INFORMATION_CLASS` = 1;
public const val `TokenUserClaimAttributes`: `TOKEN_INFORMATION_CLASS` = 33;
public const val `TokenVirtualizationAllowed`: `TOKEN_INFORMATION_CLASS` = 23;
public const val `TokenVirtualizationEnabled`: `TOKEN_INFORMATION_CLASS` = 24;
public const val `UNPROTECTED_DACL_SECURITY_INFORMATION`: `OBJECT_SECURITY_INFORMATION` = 536870912u;
public const val `UNPROTECTED_SACL_SECURITY_INFORMATION`: `OBJECT_SECURITY_INFORMATION` = 268435456u;
public typealias `WELL_KNOWN_SID_TYPE` = Int;
public const val `WRITE_RESTRICTED`: `CREATE_RESTRICTED_TOKEN_FLAGS` = 8u;
public const val `WinAccountAdministratorSid`: `WELL_KNOWN_SID_TYPE` = 38;
public const val `WinAccountCertAdminsSid`: `WELL_KNOWN_SID_TYPE` = 46;
public const val `WinAccountCloneableControllersSid`: `WELL_KNOWN_SID_TYPE` = 100;
public const val `WinAccountComputersSid`: `WELL_KNOWN_SID_TYPE` = 44;
public const val `WinAccountControllersSid`: `WELL_KNOWN_SID_TYPE` = 45;
public const val `WinAccountDefaultSystemManagedSid`: `WELL_KNOWN_SID_TYPE` = 110;
public const val `WinAccountDomainAdminsSid`: `WELL_KNOWN_SID_TYPE` = 41;
public const val `WinAccountDomainGuestsSid`: `WELL_KNOWN_SID_TYPE` = 43;
public const val `WinAccountDomainUsersSid`: `WELL_KNOWN_SID_TYPE` = 42;
public const val `WinAccountEnterpriseAdminsSid`: `WELL_KNOWN_SID_TYPE` = 48;
public const val `WinAccountEnterpriseKeyAdminsSid`: `WELL_KNOWN_SID_TYPE` = 114;
public const val `WinAccountGuestSid`: `WELL_KNOWN_SID_TYPE` = 39;
public const val `WinAccountKeyAdminsSid`: `WELL_KNOWN_SID_TYPE` = 113;
public const val `WinAccountKrbtgtSid`: `WELL_KNOWN_SID_TYPE` = 40;
public const val `WinAccountPolicyAdminsSid`: `WELL_KNOWN_SID_TYPE` = 49;
public const val `WinAccountProtectedUsersSid`: `WELL_KNOWN_SID_TYPE` = 107;
public const val `WinAccountRasAndIasServersSid`: `WELL_KNOWN_SID_TYPE` = 50;
public const val `WinAccountReadonlyControllersSid`: `WELL_KNOWN_SID_TYPE` = 75;
public const val `WinAccountSchemaAdminsSid`: `WELL_KNOWN_SID_TYPE` = 47;
public const val `WinAnonymousSid`: `WELL_KNOWN_SID_TYPE` = 13;
public const val `WinApplicationPackageAuthoritySid`: `WELL_KNOWN_SID_TYPE` = 83;
public const val `WinAuthenticatedUserSid`: `WELL_KNOWN_SID_TYPE` = 17;
public const val `WinAuthenticationAuthorityAssertedSid`: `WELL_KNOWN_SID_TYPE` = 103;
public const val `WinAuthenticationFreshKeyAuthSid`: `WELL_KNOWN_SID_TYPE` = 118;
public const val `WinAuthenticationKeyPropertyAttestationSid`: `WELL_KNOWN_SID_TYPE` = 117;
public const val `WinAuthenticationKeyPropertyMFASid`: `WELL_KNOWN_SID_TYPE` = 116;
public const val `WinAuthenticationKeyTrustSid`: `WELL_KNOWN_SID_TYPE` = 115;
public const val `WinAuthenticationServiceAssertedSid`: `WELL_KNOWN_SID_TYPE` = 104;
public const val `WinBatchSid`: `WELL_KNOWN_SID_TYPE` = 10;
public const val `WinBuiltinAccessControlAssistanceOperatorsSid`: `WELL_KNOWN_SID_TYPE` = 101;
public const val `WinBuiltinAccountOperatorsSid`: `WELL_KNOWN_SID_TYPE` = 30;
public const val `WinBuiltinAdministratorsSid`: `WELL_KNOWN_SID_TYPE` = 26;
public const val `WinBuiltinAnyPackageSid`: `WELL_KNOWN_SID_TYPE` = 84;
public const val `WinBuiltinAuthorizationAccessSid`: `WELL_KNOWN_SID_TYPE` = 59;
public const val `WinBuiltinBackupOperatorsSid`: `WELL_KNOWN_SID_TYPE` = 33;
public const val `WinBuiltinCertSvcDComAccessGroup`: `WELL_KNOWN_SID_TYPE` = 78;
public const val `WinBuiltinCryptoOperatorsSid`: `WELL_KNOWN_SID_TYPE` = 64;
public const val `WinBuiltinDCOMUsersSid`: `WELL_KNOWN_SID_TYPE` = 61;
public const val `WinBuiltinDefaultSystemManagedGroupSid`: `WELL_KNOWN_SID_TYPE` = 111;
public const val `WinBuiltinDeviceOwnersSid`: `WELL_KNOWN_SID_TYPE` = 119;
public const val `WinBuiltinDomainSid`: `WELL_KNOWN_SID_TYPE` = 25;
public const val `WinBuiltinEventLogReadersGroup`: `WELL_KNOWN_SID_TYPE` = 76;
public const val `WinBuiltinGuestsSid`: `WELL_KNOWN_SID_TYPE` = 28;
public const val `WinBuiltinHyperVAdminsSid`: `WELL_KNOWN_SID_TYPE` = 99;
public const val `WinBuiltinIUsersSid`: `WELL_KNOWN_SID_TYPE` = 62;
public const val `WinBuiltinIncomingForestTrustBuildersSid`: `WELL_KNOWN_SID_TYPE` = 56;
public const val `WinBuiltinNetworkConfigurationOperatorsSid`: `WELL_KNOWN_SID_TYPE` = 37;
public const val `WinBuiltinPerfLoggingUsersSid`: `WELL_KNOWN_SID_TYPE` = 58;
public const val `WinBuiltinPerfMonitoringUsersSid`: `WELL_KNOWN_SID_TYPE` = 57;
public const val `WinBuiltinPowerUsersSid`: `WELL_KNOWN_SID_TYPE` = 29;
public const val `WinBuiltinPreWindows2000CompatibleAccessSid`: `WELL_KNOWN_SID_TYPE` = 35;
public const val `WinBuiltinPrintOperatorsSid`: `WELL_KNOWN_SID_TYPE` = 32;
public const val `WinBuiltinRDSEndpointServersSid`: `WELL_KNOWN_SID_TYPE` = 96;
public const val `WinBuiltinRDSManagementServersSid`: `WELL_KNOWN_SID_TYPE` = 97;
public const val `WinBuiltinRDSRemoteAccessServersSid`: `WELL_KNOWN_SID_TYPE` = 95;
public const val `WinBuiltinRemoteDesktopUsersSid`: `WELL_KNOWN_SID_TYPE` = 36;
public const val `WinBuiltinRemoteManagementUsersSid`: `WELL_KNOWN_SID_TYPE` = 102;
public const val `WinBuiltinReplicatorSid`: `WELL_KNOWN_SID_TYPE` = 34;
public const val `WinBuiltinStorageReplicaAdminsSid`: `WELL_KNOWN_SID_TYPE` = 112;
public const val `WinBuiltinSystemOperatorsSid`: `WELL_KNOWN_SID_TYPE` = 31;
public const val `WinBuiltinTerminalServerLicenseServersSid`: `WELL_KNOWN_SID_TYPE` = 60;
public const val `WinBuiltinUsersSid`: `WELL_KNOWN_SID_TYPE` = 27;
public const val `WinCacheablePrincipalsGroupSid`: `WELL_KNOWN_SID_TYPE` = 72;
public const val `WinCapabilityAppointmentsSid`: `WELL_KNOWN_SID_TYPE` = 108;
public const val `WinCapabilityContactsSid`: `WELL_KNOWN_SID_TYPE` = 109;
public const val `WinCapabilityDocumentsLibrarySid`: `WELL_KNOWN_SID_TYPE` = 91;
public const val `WinCapabilityEnterpriseAuthenticationSid`: `WELL_KNOWN_SID_TYPE` = 93;
public const val `WinCapabilityInternetClientServerSid`: `WELL_KNOWN_SID_TYPE` = 86;
public const val `WinCapabilityInternetClientSid`: `WELL_KNOWN_SID_TYPE` = 85;
public const val `WinCapabilityMusicLibrarySid`: `WELL_KNOWN_SID_TYPE` = 90;
public const val `WinCapabilityPicturesLibrarySid`: `WELL_KNOWN_SID_TYPE` = 88;
public const val `WinCapabilityPrivateNetworkClientServerSid`: `WELL_KNOWN_SID_TYPE` = 87;
public const val `WinCapabilityRemovableStorageSid`: `WELL_KNOWN_SID_TYPE` = 94;
public const val `WinCapabilitySharedUserCertificatesSid`: `WELL_KNOWN_SID_TYPE` = 92;
public const val `WinCapabilityVideosLibrarySid`: `WELL_KNOWN_SID_TYPE` = 89;
public const val `WinConsoleLogonSid`: `WELL_KNOWN_SID_TYPE` = 81;
public const val `WinCreatorGroupServerSid`: `WELL_KNOWN_SID_TYPE` = 6;
public const val `WinCreatorGroupSid`: `WELL_KNOWN_SID_TYPE` = 4;
public const val `WinCreatorOwnerRightsSid`: `WELL_KNOWN_SID_TYPE` = 71;
public const val `WinCreatorOwnerServerSid`: `WELL_KNOWN_SID_TYPE` = 5;
public const val `WinCreatorOwnerSid`: `WELL_KNOWN_SID_TYPE` = 3;
public const val `WinDialupSid`: `WELL_KNOWN_SID_TYPE` = 8;
public const val `WinDigestAuthenticationSid`: `WELL_KNOWN_SID_TYPE` = 52;
public const val `WinEnterpriseControllersSid`: `WELL_KNOWN_SID_TYPE` = 15;
public const val `WinEnterpriseReadonlyControllersSid`: `WELL_KNOWN_SID_TYPE` = 74;
public const val `WinHighLabelSid`: `WELL_KNOWN_SID_TYPE` = 68;
public const val `WinIUserSid`: `WELL_KNOWN_SID_TYPE` = 63;
public const val `WinInteractiveSid`: `WELL_KNOWN_SID_TYPE` = 11;
public const val `WinLocalAccountAndAdministratorSid`: `WELL_KNOWN_SID_TYPE` = 106;
public const val `WinLocalAccountSid`: `WELL_KNOWN_SID_TYPE` = 105;
public const val `WinLocalLogonSid`: `WELL_KNOWN_SID_TYPE` = 80;
public const val `WinLocalServiceSid`: `WELL_KNOWN_SID_TYPE` = 23;
public const val `WinLocalSid`: `WELL_KNOWN_SID_TYPE` = 2;
public const val `WinLocalSystemSid`: `WELL_KNOWN_SID_TYPE` = 22;
public const val `WinLogonIdsSid`: `WELL_KNOWN_SID_TYPE` = 21;
public const val `WinLowLabelSid`: `WELL_KNOWN_SID_TYPE` = 66;
public const val `WinMediumLabelSid`: `WELL_KNOWN_SID_TYPE` = 67;
public const val `WinMediumPlusLabelSid`: `WELL_KNOWN_SID_TYPE` = 79;
public const val `WinNTLMAuthenticationSid`: `WELL_KNOWN_SID_TYPE` = 51;
public const val `WinNetworkServiceSid`: `WELL_KNOWN_SID_TYPE` = 24;
public const val `WinNetworkSid`: `WELL_KNOWN_SID_TYPE` = 9;
public const val `WinNewEnterpriseReadonlyControllersSid`: `WELL_KNOWN_SID_TYPE` = 77;
public const val `WinNonCacheablePrincipalsGroupSid`: `WELL_KNOWN_SID_TYPE` = 73;
public const val `WinNtAuthoritySid`: `WELL_KNOWN_SID_TYPE` = 7;
public const val `WinNullSid`: `WELL_KNOWN_SID_TYPE` = 0;
public const val `WinOtherOrganizationSid`: `WELL_KNOWN_SID_TYPE` = 55;
public const val `WinProxySid`: `WELL_KNOWN_SID_TYPE` = 14;
public const val `WinRemoteLogonIdSid`: `WELL_KNOWN_SID_TYPE` = 20;
public const val `WinRestrictedCodeSid`: `WELL_KNOWN_SID_TYPE` = 18;
public const val `WinSChannelAuthenticationSid`: `WELL_KNOWN_SID_TYPE` = 53;
public const val `WinSelfSid`: `WELL_KNOWN_SID_TYPE` = 16;
public const val `WinServiceSid`: `WELL_KNOWN_SID_TYPE` = 12;
public const val `WinSystemLabelSid`: `WELL_KNOWN_SID_TYPE` = 69;
public const val `WinTerminalServerSid`: `WELL_KNOWN_SID_TYPE` = 19;
public const val `WinThisOrganizationCertificateSid`: `WELL_KNOWN_SID_TYPE` = 82;
public const val `WinThisOrganizationSid`: `WELL_KNOWN_SID_TYPE` = 54;
public const val `WinUntrustedLabelSid`: `WELL_KNOWN_SID_TYPE` = 65;
public const val `WinUserModeDriversSid`: `WELL_KNOWN_SID_TYPE` = 98;
public const val `WinWorldSid`: `WELL_KNOWN_SID_TYPE` = 1;
public const val `WinWriteRestrictedCodeSid`: `WELL_KNOWN_SID_TYPE` = 70;
public const val `cwcFILENAMESUFFIXMAX`: UInt = 20u;
public const val `cwcHRESULTSTRING`: UInt = 40u;
// UNSUPPORTED Rust 1324:1: non-scalar type Ptr unsupported
// pub const szLBRACE: windows_sys::core::PCSTR = windows_sys::core::s!("{");

// UNSUPPORTED Rust 1325:1: non-scalar type Ptr unsupported
// pub const szLPAREN: windows_sys::core::PCSTR = windows_sys::core::s!("(");

// UNSUPPORTED Rust 1326:1: non-scalar type Ptr unsupported
// pub const szRBRACE: windows_sys::core::PCSTR = windows_sys::core::s!("}");

// UNSUPPORTED Rust 1327:1: non-scalar type Ptr unsupported
// pub const szRPAREN: windows_sys::core::PCSTR = windows_sys::core::s!(")");

// UNSUPPORTED Rust 1328:1: non-scalar type Ptr unsupported
// pub const wszCERTENROLLSHAREPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("CertSrv\\CertEnroll");

// UNSUPPORTED Rust 1329:1: non-scalar type Ptr unsupported
// pub const wszFCSAPARM_CERTFILENAMESUFFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("%4");

// UNSUPPORTED Rust 1330:1: non-scalar type Ptr unsupported
// pub const wszFCSAPARM_CONFIGDN: windows_sys::core::PCWSTR = windows_sys::core::w!("%6");

// UNSUPPORTED Rust 1331:1: non-scalar type Ptr unsupported
// pub const wszFCSAPARM_CRLDELTAFILENAMESUFFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("%9");

// UNSUPPORTED Rust 1332:1: non-scalar type Ptr unsupported
// pub const wszFCSAPARM_CRLFILENAMESUFFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("%8");

// UNSUPPORTED Rust 1333:1: non-scalar type Ptr unsupported
// pub const wszFCSAPARM_DOMAINDN: windows_sys::core::PCWSTR = windows_sys::core::w!("%5");

// UNSUPPORTED Rust 1334:1: non-scalar type Ptr unsupported
// pub const wszFCSAPARM_DSCACERTATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("%11");

// UNSUPPORTED Rust 1335:1: non-scalar type Ptr unsupported
// pub const wszFCSAPARM_DSCRLATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("%10");

// UNSUPPORTED Rust 1336:1: non-scalar type Ptr unsupported
// pub const wszFCSAPARM_DSCROSSCERTPAIRATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("%14");

// UNSUPPORTED Rust 1337:1: non-scalar type Ptr unsupported
// pub const wszFCSAPARM_DSKRACERTATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("%13");

// UNSUPPORTED Rust 1338:1: non-scalar type Ptr unsupported
// pub const wszFCSAPARM_DSUSERCERTATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("%12");

// UNSUPPORTED Rust 1339:1: non-scalar type Ptr unsupported
// pub const wszFCSAPARM_SANITIZEDCANAME: windows_sys::core::PCWSTR = windows_sys::core::w!("%3");

// UNSUPPORTED Rust 1340:1: non-scalar type Ptr unsupported
// pub const wszFCSAPARM_SANITIZEDCANAMEHASH: windows_sys::core::PCWSTR = windows_sys::core::w!("%7");

// UNSUPPORTED Rust 1341:1: non-scalar type Ptr unsupported
// pub const wszFCSAPARM_SERVERDNSNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("%1");

// UNSUPPORTED Rust 1342:1: non-scalar type Ptr unsupported
// pub const wszFCSAPARM_SERVERSHORTNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("%2");

// UNSUPPORTED Rust 1343:1: non-scalar type Ptr unsupported
// pub const wszLBRACE: windows_sys::core::PCWSTR = windows_sys::core::w!("{");

// UNSUPPORTED Rust 1344:1: non-scalar type Ptr unsupported
// pub const wszLPAREN: windows_sys::core::PCWSTR = windows_sys::core::w!("(");

// UNSUPPORTED Rust 1345:1: non-scalar type Ptr unsupported
// pub const wszRBRACE: windows_sys::core::PCWSTR = windows_sys::core::w!("}");

// UNSUPPORTED Rust 1346:1: non-scalar type Ptr unsupported
// pub const wszRPAREN: windows_sys::core::PCWSTR = windows_sys::core::w!(")");

