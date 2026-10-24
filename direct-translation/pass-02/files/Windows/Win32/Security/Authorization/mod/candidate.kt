// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzAccessCheck(flags : AUTHZ_ACCESS_CHECK_FLAGS, hauthzclientcontext : AUTHZ_CLIENT_CONTEXT_HANDLE, prequest : *const AUTHZ_ACCESS_REQUEST, hauditevent : AUTHZ_AUDIT_EVENT_HANDLE, psecuritydescriptor : super:: PSECURITY_DESCRIPTOR, optionalsecuritydescriptorarray : *const super:: PSECURITY_DESCRIPTOR, optionalsecuritydescriptorcount : u32, preply : *mut AUTHZ_ACCESS_REPLY, phaccesscheckresults : *mut AUTHZ_ACCESS_CHECK_RESULTS_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzAddSidsToContext(hauthzclientcontext : AUTHZ_CLIENT_CONTEXT_HANDLE, sids : *const super:: SID_AND_ATTRIBUTES, sidcount : u32, restrictedsids : *const super:: SID_AND_ATTRIBUTES, restrictedsidcount : u32, phnewauthzclientcontext : *mut AUTHZ_CLIENT_CONTEXT_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzCachedAccessCheck(flags : u32, haccesscheckresults : AUTHZ_ACCESS_CHECK_RESULTS_HANDLE, prequest : *const AUTHZ_ACCESS_REQUEST, hauditevent : AUTHZ_AUDIT_EVENT_HANDLE, preply : *mut AUTHZ_ACCESS_REPLY) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzEnumerateSecurityEventSources(dwflags : u32, buffer : *mut AUTHZ_SOURCE_SCHEMA_REGISTRATION, pdwcount : *mut u32, pdwlength : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzEvaluateSacl(authzclientcontext : AUTHZ_CLIENT_CONTEXT_HANDLE, prequest : *const AUTHZ_ACCESS_REQUEST, sacl : *const super:: ACL, grantedaccess : u32, accessgranted : windows_sys::core::BOOL, pbgenerateaudit : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzFreeAuditEvent(hauditevent : AUTHZ_AUDIT_EVENT_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzFreeCentralAccessPolicyCache() -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzFreeContext(hauthzclientcontext : AUTHZ_CLIENT_CONTEXT_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzFreeHandle(haccesscheckresults : AUTHZ_ACCESS_CHECK_RESULTS_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzFreeResourceManager(hauthzresourcemanager : AUTHZ_RESOURCE_MANAGER_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzGetInformationFromContext(hauthzclientcontext : AUTHZ_CLIENT_CONTEXT_HANDLE, infoclass : AUTHZ_CONTEXT_INFORMATION_CLASS, buffersize : u32, psizerequired : *mut u32, buffer : *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzInitializeCompoundContext(usercontext : AUTHZ_CLIENT_CONTEXT_HANDLE, devicecontext : AUTHZ_CLIENT_CONTEXT_HANDLE, phcompoundcontext : *mut AUTHZ_CLIENT_CONTEXT_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzInitializeContextFromAuthzContext(flags : u32, hauthzclientcontext : AUTHZ_CLIENT_CONTEXT_HANDLE, pexpirationtime : *const i64, identifier : super::super::Foundation:: LUID, dynamicgroupargs : *const core::ffi::c_void, phnewauthzclientcontext : *mut AUTHZ_CLIENT_CONTEXT_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzInitializeContextFromSid(flags : u32, usersid : super:: PSID, hauthzresourcemanager : AUTHZ_RESOURCE_MANAGER_HANDLE, pexpirationtime : *const i64, identifier : super::super::Foundation:: LUID, dynamicgroupargs : *const core::ffi::c_void, phauthzclientcontext : *mut AUTHZ_CLIENT_CONTEXT_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzInitializeContextFromToken(flags : u32, tokenhandle : super::super::Foundation:: HANDLE, hauthzresourcemanager : AUTHZ_RESOURCE_MANAGER_HANDLE, pexpirationtime : *const i64, identifier : super::super::Foundation:: LUID, dynamicgroupargs : *const core::ffi::c_void, phauthzclientcontext : *mut AUTHZ_CLIENT_CONTEXT_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "C" fn AuthzInitializeObjectAccessAuditEvent(flags : AUTHZ_INITIALIZE_OBJECT_ACCESS_AUDIT_EVENT_FLAGS, hauditeventtype : AUTHZ_AUDIT_EVENT_TYPE_HANDLE, szoperationtype : windows_sys::core::PCWSTR, szobjecttype : windows_sys::core::PCWSTR, szobjectname : windows_sys::core::PCWSTR, szadditionalinfo : windows_sys::core::PCWSTR, phauditevent : *mut AUTHZ_AUDIT_EVENT_HANDLE, dwadditionalparametercount : u32, ...) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "C" fn AuthzInitializeObjectAccessAuditEvent2(flags : u32, hauditeventtype : AUTHZ_AUDIT_EVENT_TYPE_HANDLE, szoperationtype : windows_sys::core::PCWSTR, szobjecttype : windows_sys::core::PCWSTR, szobjectname : windows_sys::core::PCWSTR, szadditionalinfo : windows_sys::core::PCWSTR, szadditionalinfo2 : windows_sys::core::PCWSTR, phauditevent : *mut AUTHZ_AUDIT_EVENT_HANDLE, dwadditionalparametercount : u32, ...) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzInitializeRemoteResourceManager(prpcinitinfo : *const AUTHZ_RPC_INIT_INFO_CLIENT, phauthzresourcemanager : *mut AUTHZ_RESOURCE_MANAGER_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzInitializeResourceManager(flags : u32, pfndynamicaccesscheck : PFN_AUTHZ_DYNAMIC_ACCESS_CHECK, pfncomputedynamicgroups : PFN_AUTHZ_COMPUTE_DYNAMIC_GROUPS, pfnfreedynamicgroups : PFN_AUTHZ_FREE_DYNAMIC_GROUPS, szresourcemanagername : windows_sys::core::PCWSTR, phauthzresourcemanager : *mut AUTHZ_RESOURCE_MANAGER_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzInitializeResourceManagerEx(flags : AUTHZ_RESOURCE_MANAGER_FLAGS, pauthzinitinfo : *const AUTHZ_INIT_INFO, phauthzresourcemanager : *mut AUTHZ_RESOURCE_MANAGER_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzInstallSecurityEventSource(dwflags : u32, pregistration : *const AUTHZ_SOURCE_SCHEMA_REGISTRATION) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzModifyClaims(hauthzclientcontext : AUTHZ_CLIENT_CONTEXT_HANDLE, claimclass : AUTHZ_CONTEXT_INFORMATION_CLASS, pclaimoperations : *const AUTHZ_SECURITY_ATTRIBUTE_OPERATION, pclaims : *const AUTHZ_SECURITY_ATTRIBUTES_INFORMATION) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzModifySecurityAttributes(hauthzclientcontext : AUTHZ_CLIENT_CONTEXT_HANDLE, poperations : *const AUTHZ_SECURITY_ATTRIBUTE_OPERATION, pattributes : *const AUTHZ_SECURITY_ATTRIBUTES_INFORMATION) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzModifySids(hauthzclientcontext : AUTHZ_CLIENT_CONTEXT_HANDLE, sidclass : AUTHZ_CONTEXT_INFORMATION_CLASS, psidoperations : *const AUTHZ_SID_OPERATION, psids : *const super:: TOKEN_GROUPS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzOpenObjectAudit(flags : u32, hauthzclientcontext : AUTHZ_CLIENT_CONTEXT_HANDLE, prequest : *const AUTHZ_ACCESS_REQUEST, hauditevent : AUTHZ_AUDIT_EVENT_HANDLE, psecuritydescriptor : super:: PSECURITY_DESCRIPTOR, optionalsecuritydescriptorarray : *const super:: PSECURITY_DESCRIPTOR, optionalsecuritydescriptorcount : u32, preply : *const AUTHZ_ACCESS_REPLY) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Threading")]
// windows_link::link!("authz.dll" "system" fn AuthzRegisterCapChangeNotification(phcapchangesubscription : *mut AUTHZ_CAP_CHANGE_SUBSCRIPTION_HANDLE, pfncapchangecallback : super::super::System::Threading:: LPTHREAD_START_ROUTINE, pcallbackcontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzRegisterSecurityEventSource(dwflags : u32, szeventsourcename : windows_sys::core::PCWSTR, pheventprovider : *mut AUTHZ_SECURITY_EVENT_PROVIDER_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "C" fn AuthzReportSecurityEvent(dwflags : u32, heventprovider : AUTHZ_SECURITY_EVENT_PROVIDER_HANDLE, dwauditid : u32, pusersid : super:: PSID, dwcount : u32, ...) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzReportSecurityEventFromParams(dwflags : u32, heventprovider : AUTHZ_SECURITY_EVENT_PROVIDER_HANDLE, dwauditid : u32, pusersid : super:: PSID, pparams : *const AUDIT_PARAMS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzSetAppContainerInformation(hauthzclientcontext : AUTHZ_CLIENT_CONTEXT_HANDLE, pappcontainersid : super:: PSID, capabilitycount : u32, pcapabilitysids : *const super:: SID_AND_ATTRIBUTES) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzUninstallSecurityEventSource(dwflags : u32, szeventsourcename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzUnregisterCapChangeNotification(hcapchangesubscription : AUTHZ_CAP_CHANGE_SUBSCRIPTION_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("authz.dll" "system" fn AuthzUnregisterSecurityEventSource(dwflags : u32, pheventprovider : *mut AUTHZ_SECURITY_EVENT_PROVIDER_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn BuildExplicitAccessWithNameA(pexplicitaccess : *mut EXPLICIT_ACCESS_A, ptrusteename : windows_sys::core::PCSTR, accesspermissions : u32, accessmode : ACCESS_MODE, inheritance : super:: ACE_FLAGS));

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn BuildExplicitAccessWithNameW(pexplicitaccess : *mut EXPLICIT_ACCESS_W, ptrusteename : windows_sys::core::PCWSTR, accesspermissions : u32, accessmode : ACCESS_MODE, inheritance : super:: ACE_FLAGS));

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn BuildImpersonateExplicitAccessWithNameA(pexplicitaccess : *mut EXPLICIT_ACCESS_A, ptrusteename : windows_sys::core::PCSTR, ptrustee : *const TRUSTEE_A, accesspermissions : u32, accessmode : ACCESS_MODE, inheritance : u32));

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn BuildImpersonateExplicitAccessWithNameW(pexplicitaccess : *mut EXPLICIT_ACCESS_W, ptrusteename : windows_sys::core::PCWSTR, ptrustee : *const TRUSTEE_W, accesspermissions : u32, accessmode : ACCESS_MODE, inheritance : u32));

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn BuildImpersonateTrusteeA(ptrustee : *mut TRUSTEE_A, pimpersonatetrustee : *const TRUSTEE_A));

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn BuildImpersonateTrusteeW(ptrustee : *mut TRUSTEE_W, pimpersonatetrustee : *const TRUSTEE_W));

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn BuildSecurityDescriptorA(powner : *const TRUSTEE_A, pgroup : *const TRUSTEE_A, ccountofaccessentries : u32, plistofaccessentries : *const EXPLICIT_ACCESS_A, ccountofauditentries : u32, plistofauditentries : *const EXPLICIT_ACCESS_A, poldsd : super:: PSECURITY_DESCRIPTOR, psizenewsd : *mut u32, pnewsd : *mut super:: PSECURITY_DESCRIPTOR) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn BuildSecurityDescriptorW(powner : *const TRUSTEE_W, pgroup : *const TRUSTEE_W, ccountofaccessentries : u32, plistofaccessentries : *const EXPLICIT_ACCESS_W, ccountofauditentries : u32, plistofauditentries : *const EXPLICIT_ACCESS_W, poldsd : super:: PSECURITY_DESCRIPTOR, psizenewsd : *mut u32, pnewsd : *mut super:: PSECURITY_DESCRIPTOR) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn BuildTrusteeWithNameA(ptrustee : *mut TRUSTEE_A, pname : windows_sys::core::PCSTR));

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn BuildTrusteeWithNameW(ptrustee : *mut TRUSTEE_W, pname : windows_sys::core::PCWSTR));

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn BuildTrusteeWithObjectsAndNameA(ptrustee : *mut TRUSTEE_A, pobjname : *const OBJECTS_AND_NAME_A, objecttype : SE_OBJECT_TYPE, objecttypename : windows_sys::core::PCSTR, inheritedobjecttypename : windows_sys::core::PCSTR, name : windows_sys::core::PCSTR));

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn BuildTrusteeWithObjectsAndNameW(ptrustee : *mut TRUSTEE_W, pobjname : *const OBJECTS_AND_NAME_W, objecttype : SE_OBJECT_TYPE, objecttypename : windows_sys::core::PCWSTR, inheritedobjecttypename : windows_sys::core::PCWSTR, name : windows_sys::core::PCWSTR));

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn BuildTrusteeWithObjectsAndSidA(ptrustee : *mut TRUSTEE_A, pobjsid : *const OBJECTS_AND_SID, pobjectguid : *const windows_sys::core::GUID, pinheritedobjectguid : *const windows_sys::core::GUID, psid : super:: PSID));

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn BuildTrusteeWithObjectsAndSidW(ptrustee : *mut TRUSTEE_W, pobjsid : *const OBJECTS_AND_SID, pobjectguid : *const windows_sys::core::GUID, pinheritedobjectguid : *const windows_sys::core::GUID, psid : super:: PSID));

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn BuildTrusteeWithSidA(ptrustee : *mut TRUSTEE_A, psid : super:: PSID));

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn BuildTrusteeWithSidW(ptrustee : *mut TRUSTEE_W, psid : super:: PSID));

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ConvertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor : super:: PSECURITY_DESCRIPTOR, requestedstringsdrevision : u32, securityinformation : super:: OBJECT_SECURITY_INFORMATION, stringsecuritydescriptor : *mut windows_sys::core::PSTR, stringsecuritydescriptorlen : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ConvertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor : super:: PSECURITY_DESCRIPTOR, requestedstringsdrevision : u32, securityinformation : super:: OBJECT_SECURITY_INFORMATION, stringsecuritydescriptor : *mut windows_sys::core::PWSTR, stringsecuritydescriptorlen : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ConvertSidToStringSidA(sid : super:: PSID, stringsid : *mut windows_sys::core::PSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ConvertSidToStringSidW(sid : super:: PSID, stringsid : *mut windows_sys::core::PWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ConvertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor : windows_sys::core::PCSTR, stringsdrevision : u32, securitydescriptor : *mut super:: PSECURITY_DESCRIPTOR, securitydescriptorsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ConvertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor : windows_sys::core::PCWSTR, stringsdrevision : u32, securitydescriptor : *mut super:: PSECURITY_DESCRIPTOR, securitydescriptorsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ConvertStringSidToSidA(stringsid : windows_sys::core::PCSTR, sid : *mut super:: PSID) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ConvertStringSidToSidW(stringsid : windows_sys::core::PCWSTR, sid : *mut super:: PSID) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn FreeInheritedFromArray(pinheritarray : *const INHERITED_FROMW, acecnt : u16, pfnarray : *const FN_OBJECT_MGR_FUNCTS) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetAuditedPermissionsFromAclA(pacl : *const super:: ACL, ptrustee : *const TRUSTEE_A, psuccessfulauditedrights : *mut u32, pfailedauditrights : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetAuditedPermissionsFromAclW(pacl : *const super:: ACL, ptrustee : *const TRUSTEE_W, psuccessfulauditedrights : *mut u32, pfailedauditrights : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetEffectiveRightsFromAclA(pacl : *const super:: ACL, ptrustee : *const TRUSTEE_A, paccessrights : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetEffectiveRightsFromAclW(pacl : *const super:: ACL, ptrustee : *const TRUSTEE_W, paccessrights : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetExplicitEntriesFromAclA(pacl : *const super:: ACL, pccountofexplicitentries : *mut u32, plistofexplicitentries : *mut *mut EXPLICIT_ACCESS_A) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetExplicitEntriesFromAclW(pacl : *const super:: ACL, pccountofexplicitentries : *mut u32, plistofexplicitentries : *mut *mut EXPLICIT_ACCESS_W) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetInheritanceSourceA(pobjectname : windows_sys::core::PCSTR, objecttype : SE_OBJECT_TYPE, securityinfo : super:: OBJECT_SECURITY_INFORMATION, container : windows_sys::core::BOOL, pobjectclassguids : *const *const windows_sys::core::GUID, guidcount : u32, pacl : *const super:: ACL, pfnarray : *const FN_OBJECT_MGR_FUNCTS, pgenericmapping : *const super:: GENERIC_MAPPING, pinheritarray : *mut INHERITED_FROMA) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetInheritanceSourceW(pobjectname : windows_sys::core::PCWSTR, objecttype : SE_OBJECT_TYPE, securityinfo : super:: OBJECT_SECURITY_INFORMATION, container : windows_sys::core::BOOL, pobjectclassguids : *const *const windows_sys::core::GUID, guidcount : u32, pacl : *const super:: ACL, pfnarray : *const FN_OBJECT_MGR_FUNCTS, pgenericmapping : *const super:: GENERIC_MAPPING, pinheritarray : *mut INHERITED_FROMW) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetMultipleTrusteeA(ptrustee : *const TRUSTEE_A) -> *mut TRUSTEE_A);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetMultipleTrusteeOperationA(ptrustee : *const TRUSTEE_A) -> MULTIPLE_TRUSTEE_OPERATION);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetMultipleTrusteeOperationW(ptrustee : *const TRUSTEE_W) -> MULTIPLE_TRUSTEE_OPERATION);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetMultipleTrusteeW(ptrustee : *const TRUSTEE_W) -> *mut TRUSTEE_W);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetNamedSecurityInfoA(pobjectname : windows_sys::core::PCSTR, objecttype : SE_OBJECT_TYPE, securityinfo : super:: OBJECT_SECURITY_INFORMATION, ppsidowner : *mut super:: PSID, ppsidgroup : *mut super:: PSID, ppdacl : *mut *mut super:: ACL, ppsacl : *mut *mut super:: ACL, ppsecuritydescriptor : *mut super:: PSECURITY_DESCRIPTOR) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetNamedSecurityInfoW(pobjectname : windows_sys::core::PCWSTR, objecttype : SE_OBJECT_TYPE, securityinfo : super:: OBJECT_SECURITY_INFORMATION, ppsidowner : *mut super:: PSID, ppsidgroup : *mut super:: PSID, ppdacl : *mut *mut super:: ACL, ppsacl : *mut *mut super:: ACL, ppsecuritydescriptor : *mut super:: PSECURITY_DESCRIPTOR) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetSecurityInfo(handle : super::super::Foundation:: HANDLE, objecttype : SE_OBJECT_TYPE, securityinfo : super:: OBJECT_SECURITY_INFORMATION, ppsidowner : *mut super:: PSID, ppsidgroup : *mut super:: PSID, ppdacl : *mut *mut super:: ACL, ppsacl : *mut *mut super:: ACL, ppsecuritydescriptor : *mut super:: PSECURITY_DESCRIPTOR) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetTrusteeFormA(ptrustee : *const TRUSTEE_A) -> TRUSTEE_FORM);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetTrusteeFormW(ptrustee : *const TRUSTEE_W) -> TRUSTEE_FORM);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetTrusteeNameA(ptrustee : *const TRUSTEE_A) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetTrusteeNameW(ptrustee : *const TRUSTEE_W) -> windows_sys::core::PWSTR);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetTrusteeTypeA(ptrustee : *const TRUSTEE_A) -> TRUSTEE_TYPE);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetTrusteeTypeW(ptrustee : *const TRUSTEE_W) -> TRUSTEE_TYPE);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LookupSecurityDescriptorPartsA(ppowner : *mut *mut TRUSTEE_A, ppgroup : *mut *mut TRUSTEE_A, pccountofaccessentries : *mut u32, pplistofaccessentries : *mut *mut EXPLICIT_ACCESS_A, pccountofauditentries : *mut u32, pplistofauditentries : *mut *mut EXPLICIT_ACCESS_A, psd : super:: PSECURITY_DESCRIPTOR) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LookupSecurityDescriptorPartsW(ppowner : *mut *mut TRUSTEE_W, ppgroup : *mut *mut TRUSTEE_W, pccountofaccessentries : *mut u32, pplistofaccessentries : *mut *mut EXPLICIT_ACCESS_W, pccountofauditentries : *mut u32, pplistofauditentries : *mut *mut EXPLICIT_ACCESS_W, psd : super:: PSECURITY_DESCRIPTOR) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SetEntriesInAclA(ccountofexplicitentries : u32, plistofexplicitentries : *const EXPLICIT_ACCESS_A, oldacl : *const super:: ACL, newacl : *mut *mut super:: ACL) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SetEntriesInAclW(ccountofexplicitentries : u32, plistofexplicitentries : *const EXPLICIT_ACCESS_W, oldacl : *const super:: ACL, newacl : *mut *mut super:: ACL) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SetNamedSecurityInfoA(pobjectname : windows_sys::core::PCSTR, objecttype : SE_OBJECT_TYPE, securityinfo : super:: OBJECT_SECURITY_INFORMATION, psidowner : super:: PSID, psidgroup : super:: PSID, pdacl : *const super:: ACL, psacl : *const super:: ACL) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SetNamedSecurityInfoW(pobjectname : windows_sys::core::PCWSTR, objecttype : SE_OBJECT_TYPE, securityinfo : super:: OBJECT_SECURITY_INFORMATION, psidowner : super:: PSID, psidgroup : super:: PSID, pdacl : *const super:: ACL, psacl : *const super:: ACL) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SetSecurityInfo(handle : super::super::Foundation:: HANDLE, objecttype : SE_OBJECT_TYPE, securityinfo : super:: OBJECT_SECURITY_INFORMATION, psidowner : super:: PSID, psidgroup : super:: PSID, pdacl : *const super:: ACL, psacl : *const super:: ACL) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn TreeResetNamedSecurityInfoA(pobjectname : windows_sys::core::PCSTR, objecttype : SE_OBJECT_TYPE, securityinfo : super:: OBJECT_SECURITY_INFORMATION, powner : super:: PSID, pgroup : super:: PSID, pdacl : *const super:: ACL, psacl : *const super:: ACL, keepexplicit : windows_sys::core::BOOL, fnprogress : FN_PROGRESS, progressinvokesetting : PROG_INVOKE_SETTING, args : *const core::ffi::c_void) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn TreeResetNamedSecurityInfoW(pobjectname : windows_sys::core::PCWSTR, objecttype : SE_OBJECT_TYPE, securityinfo : super:: OBJECT_SECURITY_INFORMATION, powner : super:: PSID, pgroup : super:: PSID, pdacl : *const super:: ACL, psacl : *const super:: ACL, keepexplicit : windows_sys::core::BOOL, fnprogress : FN_PROGRESS, progressinvokesetting : PROG_INVOKE_SETTING, args : *const core::ffi::c_void) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn TreeSetNamedSecurityInfoA(pobjectname : windows_sys::core::PCSTR, objecttype : SE_OBJECT_TYPE, securityinfo : super:: OBJECT_SECURITY_INFORMATION, powner : super:: PSID, pgroup : super:: PSID, pdacl : *const super:: ACL, psacl : *const super:: ACL, dwaction : TREE_SEC_INFO, fnprogress : FN_PROGRESS, progressinvokesetting : PROG_INVOKE_SETTING, args : *const core::ffi::c_void) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn TreeSetNamedSecurityInfoW(pobjectname : windows_sys::core::PCWSTR, objecttype : SE_OBJECT_TYPE, securityinfo : super:: OBJECT_SECURITY_INFORMATION, powner : super:: PSID, pgroup : super:: PSID, pdacl : *const super:: ACL, psacl : *const super:: ACL, dwaction : TREE_SEC_INFO, fnprogress : FN_PROGRESS, progressinvokesetting : PROG_INVOKE_SETTING, args : *const core::ffi::c_void) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 92:1: non-scalar type Ptr unsupported
// pub const ACCCTRL_DEFAULT_PROVIDER: windows_sys::core::PCWSTR = windows_sys::core::w!("Windows NT Access Provider");

// UNSUPPORTED Rust 93:1: non-scalar type Ptr unsupported
// pub const ACCCTRL_DEFAULT_PROVIDERA: windows_sys::core::PCSTR = windows_sys::core::s!("Windows NT Access Provider");

// UNSUPPORTED Rust 94:1: non-scalar type Ptr unsupported
// pub const ACCCTRL_DEFAULT_PROVIDERW: windows_sys::core::PCWSTR = windows_sys::core::w!("Windows NT Access Provider");

public typealias `ACCESS_MODE` = Int;
// UNSUPPORTED Rust 96:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACTRL_ACCESSA {
//     pub cEntries: u32,
//     pub pPropertyAccessList: *mut ACTRL_PROPERTY_ENTRYA,
// }

// UNSUPPORTED Rust 102:1: declaration Impl has no candidate rule
// impl Default for ACTRL_ACCESSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 107:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACTRL_ACCESSW {
//     pub cEntries: u32,
//     pub pPropertyAccessList: *mut ACTRL_PROPERTY_ENTRYW,
// }

// UNSUPPORTED Rust 113:1: declaration Impl has no candidate rule
// impl Default for ACTRL_ACCESSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ACTRL_ACCESS_ALLOWED`: `ACTRL_ACCESS_ENTRY_ACCESS_FLAGS` = 1u;
public const val `ACTRL_ACCESS_DENIED`: `ACTRL_ACCESS_ENTRY_ACCESS_FLAGS` = 2u;
// UNSUPPORTED Rust 120:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACTRL_ACCESS_ENTRYA {
//     pub Trustee: TRUSTEE_A,
//     pub fAccessFlags: ACTRL_ACCESS_ENTRY_ACCESS_FLAGS,
//     pub Access: u32,
//     pub ProvSpecificAccess: u32,
//     pub Inheritance: super::ACE_FLAGS,
//     pub lpInheritProperty: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 130:1: declaration Impl has no candidate rule
// impl Default for ACTRL_ACCESS_ENTRYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 135:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACTRL_ACCESS_ENTRYW {
//     pub Trustee: TRUSTEE_W,
//     pub fAccessFlags: ACTRL_ACCESS_ENTRY_ACCESS_FLAGS,
//     pub Access: u32,
//     pub ProvSpecificAccess: u32,
//     pub Inheritance: super::ACE_FLAGS,
//     pub lpInheritProperty: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 145:1: declaration Impl has no candidate rule
// impl Default for ACTRL_ACCESS_ENTRYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ACTRL_ACCESS_ENTRY_ACCESS_FLAGS` = UInt;
// UNSUPPORTED Rust 151:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACTRL_ACCESS_ENTRY_LISTA {
//     pub cEntries: u32,
//     pub pAccessList: *mut ACTRL_ACCESS_ENTRYA,
// }

// UNSUPPORTED Rust 157:1: declaration Impl has no candidate rule
// impl Default for ACTRL_ACCESS_ENTRY_LISTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 162:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACTRL_ACCESS_ENTRY_LISTW {
//     pub cEntries: u32,
//     pub pAccessList: *mut ACTRL_ACCESS_ENTRYW,
// }

// UNSUPPORTED Rust 168:1: declaration Impl has no candidate rule
// impl Default for ACTRL_ACCESS_ENTRY_LISTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 173:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACTRL_ACCESS_INFOA {
//     pub fAccessPermission: u32,
//     pub lpAccessPermissionName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 179:1: declaration Impl has no candidate rule
// impl Default for ACTRL_ACCESS_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 184:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACTRL_ACCESS_INFOW {
//     pub fAccessPermission: u32,
//     pub lpAccessPermissionName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 190:1: declaration Impl has no candidate rule
// impl Default for ACTRL_ACCESS_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ACTRL_ACCESS_NO_OPTIONS`: UInt = 0u;
public const val `ACTRL_ACCESS_PROTECTED`: UInt = 1u;
public const val `ACTRL_ACCESS_SUPPORTS_OBJECT_ENTRIES`: UInt = 1u;
public const val `ACTRL_AUDIT_FAILURE`: `ACTRL_ACCESS_ENTRY_ACCESS_FLAGS` = 8u;
public const val `ACTRL_AUDIT_SUCCESS`: `ACTRL_ACCESS_ENTRY_ACCESS_FLAGS` = 4u;
public const val `ACTRL_CHANGE_ACCESS`: UInt = 536870912u;
public const val `ACTRL_CHANGE_OWNER`: UInt = 1073741824u;
// UNSUPPORTED Rust 202:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACTRL_CONTROL_INFOA {
//     pub lpControlId: windows_sys::core::PSTR,
//     pub lpControlName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 208:1: declaration Impl has no candidate rule
// impl Default for ACTRL_CONTROL_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 213:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACTRL_CONTROL_INFOW {
//     pub lpControlId: windows_sys::core::PWSTR,
//     pub lpControlName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 219:1: declaration Impl has no candidate rule
// impl Default for ACTRL_CONTROL_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ACTRL_DELETE`: UInt = 134217728u;
public const val `ACTRL_DIR_CREATE_CHILD`: UInt = 4u;
public const val `ACTRL_DIR_CREATE_OBJECT`: UInt = 2u;
public const val `ACTRL_DIR_DELETE_CHILD`: UInt = 64u;
public const val `ACTRL_DIR_LIST`: UInt = 1u;
public const val `ACTRL_DIR_TRAVERSE`: UInt = 32u;
public const val `ACTRL_FILE_APPEND`: UInt = 4u;
public const val `ACTRL_FILE_CREATE_PIPE`: UInt = 512u;
public const val `ACTRL_FILE_EXECUTE`: UInt = 32u;
public const val `ACTRL_FILE_READ`: UInt = 1u;
public const val `ACTRL_FILE_READ_ATTRIB`: UInt = 128u;
public const val `ACTRL_FILE_READ_PROP`: UInt = 8u;
public const val `ACTRL_FILE_WRITE`: UInt = 2u;
public const val `ACTRL_FILE_WRITE_ATTRIB`: UInt = 256u;
public const val `ACTRL_FILE_WRITE_PROP`: UInt = 16u;
public const val `ACTRL_KERNEL_ALERT`: UInt = 1024u;
public const val `ACTRL_KERNEL_CONTROL`: UInt = 512u;
public const val `ACTRL_KERNEL_DIMPERSONATE`: UInt = 32768u;
public const val `ACTRL_KERNEL_DUP_HANDLE`: UInt = 32u;
public const val `ACTRL_KERNEL_GET_CONTEXT`: UInt = 2048u;
public const val `ACTRL_KERNEL_GET_INFO`: UInt = 256u;
public const val `ACTRL_KERNEL_IMPERSONATE`: UInt = 16384u;
public const val `ACTRL_KERNEL_PROCESS`: UInt = 64u;
public const val `ACTRL_KERNEL_SET_CONTEXT`: UInt = 4096u;
public const val `ACTRL_KERNEL_SET_INFO`: UInt = 128u;
public const val `ACTRL_KERNEL_TERMINATE`: UInt = 1u;
public const val `ACTRL_KERNEL_THREAD`: UInt = 2u;
public const val `ACTRL_KERNEL_TOKEN`: UInt = 8192u;
public const val `ACTRL_KERNEL_VM`: UInt = 4u;
public const val `ACTRL_KERNEL_VM_READ`: UInt = 8u;
public const val `ACTRL_KERNEL_VM_WRITE`: UInt = 16u;
// UNSUPPORTED Rust 255:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACTRL_OVERLAPPED {
//     pub Anonymous: ACTRL_OVERLAPPED_0,
//     pub Reserved2: u32,
//     pub hEvent: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 262:1: declaration Impl has no candidate rule
// impl Default for ACTRL_OVERLAPPED {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 267:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union ACTRL_OVERLAPPED_0 {
//     pub Provider: *mut core::ffi::c_void,
//     pub Reserved1: u32,
// }

// UNSUPPORTED Rust 273:1: declaration Impl has no candidate rule
// impl Default for ACTRL_OVERLAPPED_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ACTRL_PERM_1`: UInt = 1u;
public const val `ACTRL_PERM_10`: UInt = 512u;
public const val `ACTRL_PERM_11`: UInt = 1024u;
public const val `ACTRL_PERM_12`: UInt = 2048u;
public const val `ACTRL_PERM_13`: UInt = 4096u;
public const val `ACTRL_PERM_14`: UInt = 8192u;
public const val `ACTRL_PERM_15`: UInt = 16384u;
public const val `ACTRL_PERM_16`: UInt = 32768u;
public const val `ACTRL_PERM_17`: UInt = 65536u;
public const val `ACTRL_PERM_18`: UInt = 131072u;
public const val `ACTRL_PERM_19`: UInt = 262144u;
public const val `ACTRL_PERM_2`: UInt = 2u;
public const val `ACTRL_PERM_20`: UInt = 524288u;
public const val `ACTRL_PERM_3`: UInt = 4u;
public const val `ACTRL_PERM_4`: UInt = 8u;
public const val `ACTRL_PERM_5`: UInt = 16u;
public const val `ACTRL_PERM_6`: UInt = 32u;
public const val `ACTRL_PERM_7`: UInt = 64u;
public const val `ACTRL_PERM_8`: UInt = 128u;
public const val `ACTRL_PERM_9`: UInt = 256u;
public const val `ACTRL_PRINT_JADMIN`: UInt = 16u;
public const val `ACTRL_PRINT_PADMIN`: UInt = 4u;
public const val `ACTRL_PRINT_PUSE`: UInt = 8u;
public const val `ACTRL_PRINT_SADMIN`: UInt = 1u;
public const val `ACTRL_PRINT_SLIST`: UInt = 2u;
// UNSUPPORTED Rust 303:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACTRL_PROPERTY_ENTRYA {
//     pub lpProperty: windows_sys::core::PSTR,
//     pub pAccessEntryList: *mut ACTRL_ACCESS_ENTRY_LISTA,
//     pub fListFlags: u32,
// }

// UNSUPPORTED Rust 310:1: declaration Impl has no candidate rule
// impl Default for ACTRL_PROPERTY_ENTRYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 315:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACTRL_PROPERTY_ENTRYW {
//     pub lpProperty: windows_sys::core::PWSTR,
//     pub pAccessEntryList: *mut ACTRL_ACCESS_ENTRY_LISTW,
//     pub fListFlags: u32,
// }

// UNSUPPORTED Rust 322:1: declaration Impl has no candidate rule
// impl Default for ACTRL_PROPERTY_ENTRYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ACTRL_READ_CONTROL`: UInt = 268435456u;
public const val `ACTRL_REG_CREATE_CHILD`: UInt = 4u;
public const val `ACTRL_REG_LINK`: UInt = 32u;
public const val `ACTRL_REG_LIST`: UInt = 8u;
public const val `ACTRL_REG_NOTIFY`: UInt = 16u;
public const val `ACTRL_REG_QUERY`: UInt = 1u;
public const val `ACTRL_REG_SET`: UInt = 2u;
public const val `ACTRL_RESERVED`: UInt = 0u;
public const val `ACTRL_STD_RIGHTS_ALL`: UInt = 4160749568u;
public const val `ACTRL_SVC_GET_INFO`: UInt = 1u;
public const val `ACTRL_SVC_INTERROGATE`: UInt = 128u;
public const val `ACTRL_SVC_LIST`: UInt = 8u;
public const val `ACTRL_SVC_PAUSE`: UInt = 64u;
public const val `ACTRL_SVC_SET_INFO`: UInt = 2u;
public const val `ACTRL_SVC_START`: UInt = 16u;
public const val `ACTRL_SVC_STATUS`: UInt = 4u;
public const val `ACTRL_SVC_STOP`: UInt = 32u;
public const val `ACTRL_SVC_UCONTROL`: UInt = 256u;
public const val `ACTRL_SYNCHRONIZE`: UInt = 2147483648u;
public const val `ACTRL_SYSTEM_ACCESS`: UInt = 67108864u;
public const val `ACTRL_WIN_CLIPBRD`: UInt = 1u;
public const val `ACTRL_WIN_CREATE`: UInt = 4u;
public const val `ACTRL_WIN_EXIT`: UInt = 256u;
public const val `ACTRL_WIN_GLOBAL_ATOMS`: UInt = 2u;
public const val `ACTRL_WIN_LIST`: UInt = 16u;
public const val `ACTRL_WIN_LIST_DESK`: UInt = 8u;
public const val `ACTRL_WIN_READ_ATTRIBS`: UInt = 32u;
public const val `ACTRL_WIN_SCREEN`: UInt = 128u;
public const val `ACTRL_WIN_WRITE_ATTRIBS`: UInt = 64u;
public const val `APF_AuditFailure`: UInt = 0u;
public const val `APF_AuditSuccess`: UInt = 1u;
public const val `APF_ValidFlags`: UInt = 1u;
public const val `APT_Guid`: `AUDIT_PARAM_TYPE` = 9;
public const val `APT_Int64`: `AUDIT_PARAM_TYPE` = 11;
public const val `APT_IpAddress`: `AUDIT_PARAM_TYPE` = 12;
public const val `APT_LogonId`: `AUDIT_PARAM_TYPE` = 6;
public const val `APT_LogonIdWithSid`: `AUDIT_PARAM_TYPE` = 13;
public const val `APT_Luid`: `AUDIT_PARAM_TYPE` = 8;
public const val `APT_None`: `AUDIT_PARAM_TYPE` = 1;
public const val `APT_ObjectTypeList`: `AUDIT_PARAM_TYPE` = 7;
public const val `APT_Pointer`: `AUDIT_PARAM_TYPE` = 4;
public const val `APT_Sid`: `AUDIT_PARAM_TYPE` = 5;
public const val `APT_String`: `AUDIT_PARAM_TYPE` = 2;
public const val `APT_Time`: `AUDIT_PARAM_TYPE` = 10;
public const val `APT_Ulong`: `AUDIT_PARAM_TYPE` = 3;
public const val `AP_ParamTypeBits`: UInt = 8u;
public const val `AP_ParamTypeMask`: Int = 255;
// UNSUPPORTED Rust 374:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AUDIT_IP_ADDRESS {
//     pub pIpAddress: [u8; 128],
// }

// UNSUPPORTED Rust 379:1: declaration Impl has no candidate rule
// impl Default for AUDIT_IP_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 384:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AUDIT_OBJECT_TYPE {
//     pub ObjectType: windows_sys::core::GUID,
//     pub Flags: u16,
//     pub Level: u16,
//     pub AccessMask: u32,
// }

// UNSUPPORTED Rust 392:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AUDIT_OBJECT_TYPES {
//     pub Count: u16,
//     pub Flags: u16,
//     pub pObjectTypes: *mut AUDIT_OBJECT_TYPE,
// }

// UNSUPPORTED Rust 399:1: declaration Impl has no candidate rule
// impl Default for AUDIT_OBJECT_TYPES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 404:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AUDIT_PARAM {
//     pub Type: AUDIT_PARAM_TYPE,
//     pub Length: u32,
//     pub Flags: u32,
//     pub Anonymous1: AUDIT_PARAM_0,
//     pub Anonymous2: AUDIT_PARAM_1,
// }

// UNSUPPORTED Rust 413:1: declaration Impl has no candidate rule
// impl Default for AUDIT_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 418:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union AUDIT_PARAM_0 {
//     pub Data0: usize,
//     pub String: windows_sys::core::PWSTR,
//     pub u: usize,
//     pub psid: *mut super::SID,
//     pub pguid: *mut windows_sys::core::GUID,
//     pub LogonId_LowPart: u32,
//     pub pObjectTypes: *mut AUDIT_OBJECT_TYPES,
//     pub pIpAddress: *mut AUDIT_IP_ADDRESS,
// }

// UNSUPPORTED Rust 430:1: declaration Impl has no candidate rule
// impl Default for AUDIT_PARAM_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 435:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union AUDIT_PARAM_1 {
//     pub Data1: usize,
//     pub LogonId_HighPart: i32,
// }

// UNSUPPORTED Rust 441:1: declaration Impl has no candidate rule
// impl Default for AUDIT_PARAM_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 446:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AUDIT_PARAMS {
//     pub Length: u32,
//     pub Flags: u32,
//     pub Count: u16,
//     pub Parameters: *mut AUDIT_PARAM,
// }

// UNSUPPORTED Rust 454:1: declaration Impl has no candidate rule
// impl Default for AUDIT_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `AUDIT_PARAM_TYPE` = Int;
public const val `AUDIT_TYPE_LEGACY`: UInt = 1u;
public const val `AUDIT_TYPE_WMI`: UInt = 2u;
public const val `AUTHZP_WPD_EVENT`: UInt = 16u;
public typealias `AUTHZ_ACCESS_CHECK_FLAGS` = UInt;
public const val `AUTHZ_ACCESS_CHECK_NO_DEEP_COPY_SD`: `AUTHZ_ACCESS_CHECK_FLAGS` = 1u;
// UNSUPPORTED Rust 465:1: non-scalar type Ptr unsupported
// pub type AUTHZ_ACCESS_CHECK_RESULTS_HANDLE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 466:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AUTHZ_ACCESS_REPLY {
//     pub ResultListLength: u32,
//     pub GrantedAccessMask: *mut u32,
//     pub SaclEvaluationResults: *mut AUTHZ_GENERATE_RESULTS,
//     pub Error: *mut u32,
// }

// UNSUPPORTED Rust 474:1: declaration Impl has no candidate rule
// impl Default for AUTHZ_ACCESS_REPLY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 479:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AUTHZ_ACCESS_REQUEST {
//     pub DesiredAccess: u32,
//     pub PrincipalSelfSid: super::PSID,
//     pub ObjectTypeList: *mut super::OBJECT_TYPE_LIST,
//     pub ObjectTypeListLength: u32,
//     pub OptionalArguments: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 488:1: declaration Impl has no candidate rule
// impl Default for AUTHZ_ACCESS_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AUTHZ_ALLOW_MULTIPLE_SOURCE_INSTANCES`: UInt = 1u;
// UNSUPPORTED Rust 494:1: non-scalar type Ptr unsupported
// pub type AUTHZ_AUDIT_EVENT_HANDLE = *mut core::ffi::c_void;

public typealias `AUTHZ_AUDIT_EVENT_INFORMATION_CLASS` = Int;
// UNSUPPORTED Rust 496:1: non-scalar type Ptr unsupported
// pub type AUTHZ_AUDIT_EVENT_TYPE_HANDLE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 497:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AUTHZ_AUDIT_EVENT_TYPE_LEGACY {
//     pub CategoryId: u16,
//     pub AuditId: u16,
//     pub ParameterCount: u16,
// }

// UNSUPPORTED Rust 504:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AUTHZ_AUDIT_EVENT_TYPE_OLD {
//     pub Version: u32,
//     pub dwFlags: u32,
//     pub RefCount: i32,
//     pub hAudit: usize,
//     pub LinkId: super::super::Foundation::LUID,
//     pub u: AUTHZ_AUDIT_EVENT_TYPE_UNION,
// }

// UNSUPPORTED Rust 514:1: declaration Impl has no candidate rule
// impl Default for AUTHZ_AUDIT_EVENT_TYPE_OLD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 519:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union AUTHZ_AUDIT_EVENT_TYPE_UNION {
//     pub Legacy: AUTHZ_AUDIT_EVENT_TYPE_LEGACY,
// }

// UNSUPPORTED Rust 524:1: declaration Impl has no candidate rule
// impl Default for AUTHZ_AUDIT_EVENT_TYPE_UNION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AUTHZ_AUDIT_INSTANCE_INFORMATION`: UInt = 2u;
// UNSUPPORTED Rust 530:1: non-scalar type Ptr unsupported
// pub type AUTHZ_CAP_CHANGE_SUBSCRIPTION_HANDLE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 531:1: non-scalar type Ptr unsupported
// pub type AUTHZ_CLIENT_CONTEXT_HANDLE = *mut core::ffi::c_void;

public const val `AUTHZ_COMPUTE_PRIVILEGES`: UInt = 8u;
public typealias `AUTHZ_CONTEXT_INFORMATION_CLASS` = Int;
public const val `AUTHZ_FLAG_ALLOW_MULTIPLE_SOURCE_INSTANCES`: UInt = 1u;
public const val `AUTHZ_GENERATE_FAILURE_AUDIT`: `AUTHZ_GENERATE_RESULTS` = 2u;
public typealias `AUTHZ_GENERATE_RESULTS` = UInt;
public const val `AUTHZ_GENERATE_SUCCESS_AUDIT`: `AUTHZ_GENERATE_RESULTS` = 1u;
public typealias `AUTHZ_INITIALIZE_OBJECT_ACCESS_AUDIT_EVENT_FLAGS` = UInt;
// UNSUPPORTED Rust 539:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AUTHZ_INIT_INFO {
//     pub version: u16,
//     pub szResourceManagerName: windows_sys::core::PCWSTR,
//     pub pfnDynamicAccessCheck: PFN_AUTHZ_DYNAMIC_ACCESS_CHECK,
//     pub pfnComputeDynamicGroups: PFN_AUTHZ_COMPUTE_DYNAMIC_GROUPS,
//     pub pfnFreeDynamicGroups: PFN_AUTHZ_FREE_DYNAMIC_GROUPS,
//     pub pfnGetCentralAccessPolicy: PFN_AUTHZ_GET_CENTRAL_ACCESS_POLICY,
//     pub pfnFreeCentralAccessPolicy: PFN_AUTHZ_FREE_CENTRAL_ACCESS_POLICY,
// }

// UNSUPPORTED Rust 550:1: declaration Impl has no candidate rule
// impl Default for AUTHZ_INIT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AUTHZ_INIT_INFO_VERSION_V1`: UInt = 1u;
public const val `AUTHZ_MIGRATED_LEGACY_PUBLISHER`: UInt = 2u;
public const val `AUTHZ_NO_ALLOC_STRINGS`: `AUTHZ_INITIALIZE_OBJECT_ACCESS_AUDIT_EVENT_FLAGS` = 4u;
public const val `AUTHZ_NO_FAILURE_AUDIT`: `AUTHZ_INITIALIZE_OBJECT_ACCESS_AUDIT_EVENT_FLAGS` = 2u;
public const val `AUTHZ_NO_SUCCESS_AUDIT`: `AUTHZ_INITIALIZE_OBJECT_ACCESS_AUDIT_EVENT_FLAGS` = 1u;
// UNSUPPORTED Rust 560:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AUTHZ_REGISTRATION_OBJECT_TYPE_NAME_OFFSET {
//     pub szObjectTypeName: windows_sys::core::PWSTR,
//     pub dwOffset: u32,
// }

// UNSUPPORTED Rust 566:1: declaration Impl has no candidate rule
// impl Default for AUTHZ_REGISTRATION_OBJECT_TYPE_NAME_OFFSET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AUTHZ_REQUIRE_S4U_LOGON`: UInt = 4u;
public typealias `AUTHZ_RESOURCE_MANAGER_FLAGS` = UInt;
// UNSUPPORTED Rust 573:1: non-scalar type Ptr unsupported
// pub type AUTHZ_RESOURCE_MANAGER_HANDLE = *mut core::ffi::c_void;

public const val `AUTHZ_RM_FLAG_INITIALIZE_UNDER_IMPERSONATION`: `AUTHZ_RESOURCE_MANAGER_FLAGS` = 2u;
public const val `AUTHZ_RM_FLAG_NO_AUDIT`: `AUTHZ_RESOURCE_MANAGER_FLAGS` = 1u;
public const val `AUTHZ_RM_FLAG_NO_CENTRAL_ACCESS_POLICIES`: `AUTHZ_RESOURCE_MANAGER_FLAGS` = 4u;
// UNSUPPORTED Rust 577:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AUTHZ_RPC_INIT_INFO_CLIENT {
//     pub version: u16,
//     pub ObjectUuid: windows_sys::core::PWSTR,
//     pub ProtSeq: windows_sys::core::PWSTR,
//     pub NetworkAddr: windows_sys::core::PWSTR,
//     pub Endpoint: windows_sys::core::PWSTR,
//     pub Options: windows_sys::core::PWSTR,
//     pub ServerSpn: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 588:1: declaration Impl has no candidate rule
// impl Default for AUTHZ_RPC_INIT_INFO_CLIENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AUTHZ_RPC_INIT_INFO_CLIENT_VERSION_V1`: UInt = 1u;
// UNSUPPORTED Rust 594:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AUTHZ_SECURITY_ATTRIBUTES_INFORMATION {
//     pub Version: u16,
//     pub Reserved: u16,
//     pub AttributeCount: u32,
//     pub Attribute: AUTHZ_SECURITY_ATTRIBUTES_INFORMATION_0,
// }

// UNSUPPORTED Rust 602:1: declaration Impl has no candidate rule
// impl Default for AUTHZ_SECURITY_ATTRIBUTES_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 607:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union AUTHZ_SECURITY_ATTRIBUTES_INFORMATION_0 {
//     pub pAttributeV1: *mut AUTHZ_SECURITY_ATTRIBUTE_V1,
// }

// UNSUPPORTED Rust 612:1: declaration Impl has no candidate rule
// impl Default for AUTHZ_SECURITY_ATTRIBUTES_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AUTHZ_SECURITY_ATTRIBUTES_INFORMATION_VERSION`: UInt = 1u;
public const val `AUTHZ_SECURITY_ATTRIBUTES_INFORMATION_VERSION_V1`: UInt = 1u;
public typealias `AUTHZ_SECURITY_ATTRIBUTE_FLAGS` = UInt;
// UNSUPPORTED Rust 620:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AUTHZ_SECURITY_ATTRIBUTE_FQBN_VALUE {
//     pub Version: u64,
//     pub pName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 626:1: declaration Impl has no candidate rule
// impl Default for AUTHZ_SECURITY_ATTRIBUTE_FQBN_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AUTHZ_SECURITY_ATTRIBUTE_NON_INHERITABLE`: `AUTHZ_SECURITY_ATTRIBUTE_FLAGS` = 1u;
// UNSUPPORTED Rust 632:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AUTHZ_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE {
//     pub pValue: *mut core::ffi::c_void,
//     pub ValueLength: u32,
// }

// UNSUPPORTED Rust 638:1: declaration Impl has no candidate rule
// impl Default for AUTHZ_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `AUTHZ_SECURITY_ATTRIBUTE_OPERATION` = Int;
public const val `AUTHZ_SECURITY_ATTRIBUTE_OPERATION_ADD`: `AUTHZ_SECURITY_ATTRIBUTE_OPERATION` = 2;
public const val `AUTHZ_SECURITY_ATTRIBUTE_OPERATION_DELETE`: `AUTHZ_SECURITY_ATTRIBUTE_OPERATION` = 3;
public const val `AUTHZ_SECURITY_ATTRIBUTE_OPERATION_NONE`: `AUTHZ_SECURITY_ATTRIBUTE_OPERATION` = 0;
public const val `AUTHZ_SECURITY_ATTRIBUTE_OPERATION_REPLACE`: `AUTHZ_SECURITY_ATTRIBUTE_OPERATION` = 4;
public const val `AUTHZ_SECURITY_ATTRIBUTE_OPERATION_REPLACE_ALL`: `AUTHZ_SECURITY_ATTRIBUTE_OPERATION` = 1;
public const val `AUTHZ_SECURITY_ATTRIBUTE_TYPE_BOOLEAN`: UInt = 6u;
public const val `AUTHZ_SECURITY_ATTRIBUTE_TYPE_FQBN`: UInt = 4u;
public const val `AUTHZ_SECURITY_ATTRIBUTE_TYPE_INT64`: UInt = 1u;
public const val `AUTHZ_SECURITY_ATTRIBUTE_TYPE_INVALID`: UInt = 0u;
public const val `AUTHZ_SECURITY_ATTRIBUTE_TYPE_OCTET_STRING`: UInt = 16u;
public const val `AUTHZ_SECURITY_ATTRIBUTE_TYPE_SID`: UInt = 5u;
public const val `AUTHZ_SECURITY_ATTRIBUTE_TYPE_STRING`: UInt = 3u;
public const val `AUTHZ_SECURITY_ATTRIBUTE_TYPE_UINT64`: UInt = 2u;
// UNSUPPORTED Rust 657:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AUTHZ_SECURITY_ATTRIBUTE_V1 {
//     pub pName: windows_sys::core::PWSTR,
//     pub ValueType: u16,
//     pub Reserved: u16,
//     pub Flags: AUTHZ_SECURITY_ATTRIBUTE_FLAGS,
//     pub ValueCount: u32,
//     pub Values: AUTHZ_SECURITY_ATTRIBUTE_V1_0,
// }

// UNSUPPORTED Rust 667:1: declaration Impl has no candidate rule
// impl Default for AUTHZ_SECURITY_ATTRIBUTE_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 672:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union AUTHZ_SECURITY_ATTRIBUTE_V1_0 {
//     pub pInt64: *mut i64,
//     pub pUint64: *mut u64,
//     pub ppString: *mut windows_sys::core::PWSTR,
//     pub pFqbn: *mut AUTHZ_SECURITY_ATTRIBUTE_FQBN_VALUE,
//     pub pOctetString: *mut AUTHZ_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE,
// }

// UNSUPPORTED Rust 681:1: declaration Impl has no candidate rule
// impl Default for AUTHZ_SECURITY_ATTRIBUTE_V1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AUTHZ_SECURITY_ATTRIBUTE_VALUE_CASE_SENSITIVE`: `AUTHZ_SECURITY_ATTRIBUTE_FLAGS` = 2u;
// UNSUPPORTED Rust 687:1: non-scalar type Ptr unsupported
// pub type AUTHZ_SECURITY_EVENT_PROVIDER_HANDLE = *mut core::ffi::c_void;

public typealias `AUTHZ_SID_OPERATION` = Int;
public const val `AUTHZ_SID_OPERATION_ADD`: `AUTHZ_SID_OPERATION` = 2;
public const val `AUTHZ_SID_OPERATION_DELETE`: `AUTHZ_SID_OPERATION` = 3;
public const val `AUTHZ_SID_OPERATION_NONE`: `AUTHZ_SID_OPERATION` = 0;
public const val `AUTHZ_SID_OPERATION_REPLACE`: `AUTHZ_SID_OPERATION` = 4;
public const val `AUTHZ_SID_OPERATION_REPLACE_ALL`: `AUTHZ_SID_OPERATION` = 1;
public const val `AUTHZ_SKIP_TOKEN_GROUPS`: UInt = 2u;
// UNSUPPORTED Rust 695:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AUTHZ_SOURCE_SCHEMA_REGISTRATION {
//     pub dwFlags: u32,
//     pub szEventSourceName: windows_sys::core::PWSTR,
//     pub szEventMessageFile: windows_sys::core::PWSTR,
//     pub szEventSourceXmlSchemaFile: windows_sys::core::PWSTR,
//     pub szEventAccessStringsFile: windows_sys::core::PWSTR,
//     pub szExecutableImagePath: windows_sys::core::PWSTR,
//     pub Anonymous: AUTHZ_SOURCE_SCHEMA_REGISTRATION_0,
//     pub dwObjectTypeNameCount: u32,
//     pub ObjectTypeNames: [AUTHZ_REGISTRATION_OBJECT_TYPE_NAME_OFFSET; 1],
// }

// UNSUPPORTED Rust 708:1: declaration Impl has no candidate rule
// impl Default for AUTHZ_SOURCE_SCHEMA_REGISTRATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 713:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union AUTHZ_SOURCE_SCHEMA_REGISTRATION_0 {
//     pub pReserved: *mut core::ffi::c_void,
//     pub pProviderGuid: *mut windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 719:1: declaration Impl has no candidate rule
// impl Default for AUTHZ_SOURCE_SCHEMA_REGISTRATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AUTHZ_WPD_CATEGORY_FLAG`: UInt = 16u;
public const val `AZ_AZSTORE_DEFAULT_DOMAIN_TIMEOUT`: `AZ_PROP_CONSTANTS` = 15000;
public const val `AZ_AZSTORE_DEFAULT_MAX_SCRIPT_ENGINES`: `AZ_PROP_CONSTANTS` = 120;
public const val `AZ_AZSTORE_DEFAULT_SCRIPT_ENGINE_TIMEOUT`: `AZ_PROP_CONSTANTS` = 45000;
public const val `AZ_AZSTORE_FLAG_AUDIT_IS_CRITICAL`: `AZ_PROP_CONSTANTS` = 8;
public const val `AZ_AZSTORE_FLAG_BATCH_UPDATE`: `AZ_PROP_CONSTANTS` = 4;
public const val `AZ_AZSTORE_FLAG_CREATE`: `AZ_PROP_CONSTANTS` = 1;
public const val `AZ_AZSTORE_FLAG_MANAGE_ONLY_PASSIVE_SUBMIT`: `AZ_PROP_CONSTANTS` = 32768;
public const val `AZ_AZSTORE_FLAG_MANAGE_STORE_ONLY`: `AZ_PROP_CONSTANTS` = 2;
public const val `AZ_AZSTORE_FORCE_APPLICATION_CLOSE`: `AZ_PROP_CONSTANTS` = 16;
public const val `AZ_AZSTORE_MIN_DOMAIN_TIMEOUT`: `AZ_PROP_CONSTANTS` = 500;
public const val `AZ_AZSTORE_MIN_SCRIPT_ENGINE_TIMEOUT`: `AZ_PROP_CONSTANTS` = 5000;
public const val `AZ_AZSTORE_NT6_FUNCTION_LEVEL`: `AZ_PROP_CONSTANTS` = 32;
public const val `AZ_CLIENT_CONTEXT_GET_GROUPS_STORE_LEVEL_ONLY`: `AZ_PROP_CONSTANTS` = 2;
public const val `AZ_CLIENT_CONTEXT_GET_GROUP_RECURSIVE`: `AZ_PROP_CONSTANTS` = 2;
public const val `AZ_CLIENT_CONTEXT_SKIP_GROUP`: `AZ_PROP_CONSTANTS` = 1;
public const val `AZ_CLIENT_CONTEXT_SKIP_LDAP_QUERY`: `AZ_PROP_CONSTANTS` = 1;
public const val `AZ_GROUPTYPE_BASIC`: `AZ_PROP_CONSTANTS` = 2;
public const val `AZ_GROUPTYPE_BIZRULE`: `AZ_PROP_CONSTANTS` = 3;
public const val `AZ_GROUPTYPE_LDAP_QUERY`: `AZ_PROP_CONSTANTS` = 1;
public const val `AZ_MAX_APPLICATION_DATA_LENGTH`: `AZ_PROP_CONSTANTS` = 4096;
public const val `AZ_MAX_APPLICATION_NAME_LENGTH`: `AZ_PROP_CONSTANTS` = 512;
public const val `AZ_MAX_APPLICATION_VERSION_LENGTH`: `AZ_PROP_CONSTANTS` = 512;
public const val `AZ_MAX_BIZRULE_STRING`: `AZ_PROP_CONSTANTS` = 65536;
public const val `AZ_MAX_DESCRIPTION_LENGTH`: `AZ_PROP_CONSTANTS` = 1024;
public const val `AZ_MAX_GROUP_BIZRULE_IMPORTED_PATH_LENGTH`: `AZ_PROP_CONSTANTS` = 512;
public const val `AZ_MAX_GROUP_BIZRULE_LANGUAGE_LENGTH`: `AZ_PROP_CONSTANTS` = 64;
public const val `AZ_MAX_GROUP_BIZRULE_LENGTH`: `AZ_PROP_CONSTANTS` = 65536;
public const val `AZ_MAX_GROUP_LDAP_QUERY_LENGTH`: `AZ_PROP_CONSTANTS` = 4096;
public const val `AZ_MAX_GROUP_NAME_LENGTH`: `AZ_PROP_CONSTANTS` = 64;
public const val `AZ_MAX_NAME_LENGTH`: `AZ_PROP_CONSTANTS` = 65536;
public const val `AZ_MAX_OPERATION_NAME_LENGTH`: `AZ_PROP_CONSTANTS` = 64;
public const val `AZ_MAX_POLICY_URL_LENGTH`: `AZ_PROP_CONSTANTS` = 65536;
public const val `AZ_MAX_ROLE_NAME_LENGTH`: `AZ_PROP_CONSTANTS` = 64;
public const val `AZ_MAX_SCOPE_NAME_LENGTH`: `AZ_PROP_CONSTANTS` = 65536;
public const val `AZ_MAX_TASK_BIZRULE_IMPORTED_PATH_LENGTH`: `AZ_PROP_CONSTANTS` = 512;
public const val `AZ_MAX_TASK_BIZRULE_LANGUAGE_LENGTH`: `AZ_PROP_CONSTANTS` = 64;
public const val `AZ_MAX_TASK_BIZRULE_LENGTH`: `AZ_PROP_CONSTANTS` = 65536;
public const val `AZ_MAX_TASK_NAME_LENGTH`: `AZ_PROP_CONSTANTS` = 64;
public const val `AZ_PROP_APPLICATION_AUTHZ_INTERFACE_CLSID`: `AZ_PROP_CONSTANTS` = 800;
public const val `AZ_PROP_APPLICATION_BIZRULE_ENABLED`: `AZ_PROP_CONSTANTS` = 803;
public const val `AZ_PROP_APPLICATION_DATA`: `AZ_PROP_CONSTANTS` = 4;
public const val `AZ_PROP_APPLICATION_NAME`: `AZ_PROP_CONSTANTS` = 802;
public const val `AZ_PROP_APPLICATION_VERSION`: `AZ_PROP_CONSTANTS` = 801;
public const val `AZ_PROP_APPLY_STORE_SACL`: `AZ_PROP_CONSTANTS` = 900;
public const val `AZ_PROP_AZSTORE_DOMAIN_TIMEOUT`: `AZ_PROP_CONSTANTS` = 100;
public const val `AZ_PROP_AZSTORE_MAJOR_VERSION`: `AZ_PROP_CONSTANTS` = 103;
public const val `AZ_PROP_AZSTORE_MAX_SCRIPT_ENGINES`: `AZ_PROP_CONSTANTS` = 102;
public const val `AZ_PROP_AZSTORE_MINOR_VERSION`: `AZ_PROP_CONSTANTS` = 104;
public const val `AZ_PROP_AZSTORE_SCRIPT_ENGINE_TIMEOUT`: `AZ_PROP_CONSTANTS` = 101;
public const val `AZ_PROP_AZSTORE_TARGET_MACHINE`: `AZ_PROP_CONSTANTS` = 105;
public const val `AZ_PROP_AZTORE_IS_ADAM_INSTANCE`: `AZ_PROP_CONSTANTS` = 106;
public const val `AZ_PROP_CHILD_CREATE`: `AZ_PROP_CONSTANTS` = 5;
public const val `AZ_PROP_CLIENT_CONTEXT_LDAP_QUERY_DN`: `AZ_PROP_CONSTANTS` = 709;
public const val `AZ_PROP_CLIENT_CONTEXT_ROLE_FOR_ACCESS_CHECK`: `AZ_PROP_CONSTANTS` = 708;
public const val `AZ_PROP_CLIENT_CONTEXT_USER_CANONICAL`: `AZ_PROP_CONSTANTS` = 704;
public const val `AZ_PROP_CLIENT_CONTEXT_USER_DISPLAY`: `AZ_PROP_CONSTANTS` = 702;
public const val `AZ_PROP_CLIENT_CONTEXT_USER_DN`: `AZ_PROP_CONSTANTS` = 700;
public const val `AZ_PROP_CLIENT_CONTEXT_USER_DNS_SAM_COMPAT`: `AZ_PROP_CONSTANTS` = 707;
public const val `AZ_PROP_CLIENT_CONTEXT_USER_GUID`: `AZ_PROP_CONSTANTS` = 703;
public const val `AZ_PROP_CLIENT_CONTEXT_USER_SAM_COMPAT`: `AZ_PROP_CONSTANTS` = 701;
public const val `AZ_PROP_CLIENT_CONTEXT_USER_UPN`: `AZ_PROP_CONSTANTS` = 705;
public typealias `AZ_PROP_CONSTANTS` = Int;
public const val `AZ_PROP_DELEGATED_POLICY_USERS`: `AZ_PROP_CONSTANTS` = 904;
public const val `AZ_PROP_DELEGATED_POLICY_USERS_NAME`: `AZ_PROP_CONSTANTS` = 907;
public const val `AZ_PROP_DESCRIPTION`: `AZ_PROP_CONSTANTS` = 2;
public const val `AZ_PROP_GENERATE_AUDITS`: `AZ_PROP_CONSTANTS` = 901;
public const val `AZ_PROP_GROUP_APP_MEMBERS`: `AZ_PROP_CONSTANTS` = 401;
public const val `AZ_PROP_GROUP_APP_NON_MEMBERS`: `AZ_PROP_CONSTANTS` = 402;
public const val `AZ_PROP_GROUP_BIZRULE`: `AZ_PROP_CONSTANTS` = 408;
public const val `AZ_PROP_GROUP_BIZRULE_IMPORTED_PATH`: `AZ_PROP_CONSTANTS` = 410;
public const val `AZ_PROP_GROUP_BIZRULE_LANGUAGE`: `AZ_PROP_CONSTANTS` = 409;
public const val `AZ_PROP_GROUP_LDAP_QUERY`: `AZ_PROP_CONSTANTS` = 403;
public const val `AZ_PROP_GROUP_MEMBERS`: `AZ_PROP_CONSTANTS` = 404;
public const val `AZ_PROP_GROUP_MEMBERS_NAME`: `AZ_PROP_CONSTANTS` = 406;
public const val `AZ_PROP_GROUP_NON_MEMBERS`: `AZ_PROP_CONSTANTS` = 405;
public const val `AZ_PROP_GROUP_NON_MEMBERS_NAME`: `AZ_PROP_CONSTANTS` = 407;
public const val `AZ_PROP_GROUP_TYPE`: `AZ_PROP_CONSTANTS` = 400;
public const val `AZ_PROP_NAME`: `AZ_PROP_CONSTANTS` = 1;
public const val `AZ_PROP_OPERATION_ID`: `AZ_PROP_CONSTANTS` = 200;
public const val `AZ_PROP_POLICY_ADMINS`: `AZ_PROP_CONSTANTS` = 902;
public const val `AZ_PROP_POLICY_ADMINS_NAME`: `AZ_PROP_CONSTANTS` = 905;
public const val `AZ_PROP_POLICY_READERS`: `AZ_PROP_CONSTANTS` = 903;
public const val `AZ_PROP_POLICY_READERS_NAME`: `AZ_PROP_CONSTANTS` = 906;
public const val `AZ_PROP_ROLE_APP_MEMBERS`: `AZ_PROP_CONSTANTS` = 500;
public const val `AZ_PROP_ROLE_MEMBERS`: `AZ_PROP_CONSTANTS` = 501;
public const val `AZ_PROP_ROLE_MEMBERS_NAME`: `AZ_PROP_CONSTANTS` = 505;
public const val `AZ_PROP_ROLE_OPERATIONS`: `AZ_PROP_CONSTANTS` = 502;
public const val `AZ_PROP_ROLE_TASKS`: `AZ_PROP_CONSTANTS` = 504;
public const val `AZ_PROP_SCOPE_BIZRULES_WRITABLE`: `AZ_PROP_CONSTANTS` = 600;
public const val `AZ_PROP_SCOPE_CAN_BE_DELEGATED`: `AZ_PROP_CONSTANTS` = 601;
public const val `AZ_PROP_TASK_BIZRULE`: `AZ_PROP_CONSTANTS` = 301;
public const val `AZ_PROP_TASK_BIZRULE_IMPORTED_PATH`: `AZ_PROP_CONSTANTS` = 304;
public const val `AZ_PROP_TASK_BIZRULE_LANGUAGE`: `AZ_PROP_CONSTANTS` = 302;
public const val `AZ_PROP_TASK_IS_ROLE_DEFINITION`: `AZ_PROP_CONSTANTS` = 305;
public const val `AZ_PROP_TASK_OPERATIONS`: `AZ_PROP_CONSTANTS` = 300;
public const val `AZ_PROP_TASK_TASKS`: `AZ_PROP_CONSTANTS` = 303;
public const val `AZ_PROP_WRITABLE`: `AZ_PROP_CONSTANTS` = 3;
public const val `AZ_SUBMIT_FLAG_ABORT`: `AZ_PROP_CONSTANTS` = 1;
public const val `AZ_SUBMIT_FLAG_FLUSH`: `AZ_PROP_CONSTANTS` = 2;
public const val `AuthzAuditEventInfoAdditionalInfo`: `AUTHZ_AUDIT_EVENT_INFORMATION_CLASS` = 5;
public const val `AuthzAuditEventInfoFlags`: `AUTHZ_AUDIT_EVENT_INFORMATION_CLASS` = 1;
public const val `AuthzAuditEventInfoObjectName`: `AUTHZ_AUDIT_EVENT_INFORMATION_CLASS` = 4;
public const val `AuthzAuditEventInfoObjectType`: `AUTHZ_AUDIT_EVENT_INFORMATION_CLASS` = 3;
public const val `AuthzAuditEventInfoOperationType`: `AUTHZ_AUDIT_EVENT_INFORMATION_CLASS` = 2;
public const val `AuthzContextInfoAll`: `AUTHZ_CONTEXT_INFORMATION_CLASS` = 9;
public const val `AuthzContextInfoAppContainerSid`: `AUTHZ_CONTEXT_INFORMATION_CLASS` = 15;
public const val `AuthzContextInfoAuthenticationId`: `AUTHZ_CONTEXT_INFORMATION_CLASS` = 10;
public const val `AuthzContextInfoCapabilitySids`: `AUTHZ_CONTEXT_INFORMATION_CLASS` = 16;
public const val `AuthzContextInfoDeviceClaims`: `AUTHZ_CONTEXT_INFORMATION_CLASS` = 14;
public const val `AuthzContextInfoDeviceSids`: `AUTHZ_CONTEXT_INFORMATION_CLASS` = 12;
public const val `AuthzContextInfoExpirationTime`: `AUTHZ_CONTEXT_INFORMATION_CLASS` = 5;
public const val `AuthzContextInfoGroupsSids`: `AUTHZ_CONTEXT_INFORMATION_CLASS` = 2;
public const val `AuthzContextInfoIdentifier`: `AUTHZ_CONTEXT_INFORMATION_CLASS` = 7;
public const val `AuthzContextInfoPrivileges`: `AUTHZ_CONTEXT_INFORMATION_CLASS` = 4;
public const val `AuthzContextInfoRestrictedSids`: `AUTHZ_CONTEXT_INFORMATION_CLASS` = 3;
public const val `AuthzContextInfoSecurityAttributes`: `AUTHZ_CONTEXT_INFORMATION_CLASS` = 11;
public const val `AuthzContextInfoServerContext`: `AUTHZ_CONTEXT_INFORMATION_CLASS` = 6;
public const val `AuthzContextInfoSource`: `AUTHZ_CONTEXT_INFORMATION_CLASS` = 8;
public const val `AuthzContextInfoUserClaims`: `AUTHZ_CONTEXT_INFORMATION_CLASS` = 13;
public const val `AuthzContextInfoUserSid`: `AUTHZ_CONTEXT_INFORMATION_CLASS` = 1;
// UNSUPPORTED Rust 845:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const AzAuthorizationStore: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb2bcff59_a757_4b0b_a1bc_ea69981da69e);

// UNSUPPORTED Rust 846:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const AzBizRuleContext: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5c2dc96f_8d51_434b_b33c_379bccae77c3);

// UNSUPPORTED Rust 847:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const AzPrincipalLocator: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x483afb5d_70df_4e16_abdc_a1de4d015a3e);

public const val `DENY_ACCESS`: `ACCESS_MODE` = 3;
// UNSUPPORTED Rust 849:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EXPLICIT_ACCESS_A {
//     pub grfAccessPermissions: u32,
//     pub grfAccessMode: ACCESS_MODE,
//     pub grfInheritance: super::ACE_FLAGS,
//     pub Trustee: TRUSTEE_A,
// }

// UNSUPPORTED Rust 857:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EXPLICIT_ACCESS_W {
//     pub grfAccessPermissions: u32,
//     pub grfAccessMode: ACCESS_MODE,
//     pub grfInheritance: super::ACE_FLAGS,
//     pub Trustee: TRUSTEE_W,
// }

// UNSUPPORTED Rust 865:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FN_OBJECT_MGR_FUNCTS {
//     pub Placeholder: u32,
// }

// UNSUPPORTED Rust 870:1: generic scalar type unsupported
// pub type FN_PROGRESS = Option<unsafe extern "system" fn(pobjectname: windows_sys::core::PCWSTR, status: u32, pinvokesetting: *mut PROG_INVOKE_SETTING, args: *const core::ffi::c_void, securityset: windows_sys::core::BOOL)>;

public const val `GRANT_ACCESS`: `ACCESS_MODE` = 1;
public const val `INHERITED_ACCESS_ENTRY`: UInt = 16u;
// UNSUPPORTED Rust 873:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INHERITED_FROMA {
//     pub GenerationGap: i32,
//     pub AncestorName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 879:1: declaration Impl has no candidate rule
// impl Default for INHERITED_FROMA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 884:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INHERITED_FROMW {
//     pub GenerationGap: i32,
//     pub AncestorName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 890:1: declaration Impl has no candidate rule
// impl Default for INHERITED_FROMW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INHERITED_GRANDPARENT`: UInt = 536870912u;
public const val `INHERITED_PARENT`: UInt = 268435456u;
public typealias `MULTIPLE_TRUSTEE_OPERATION` = Int;
public const val `NOT_USED_ACCESS`: `ACCESS_MODE` = 0;
public const val `NO_MULTIPLE_TRUSTEE`: `MULTIPLE_TRUSTEE_OPERATION` = 0;
// UNSUPPORTED Rust 900:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OBJECTS_AND_NAME_A {
//     pub ObjectsPresent: super::SYSTEM_AUDIT_OBJECT_ACE_FLAGS,
//     pub ObjectType: SE_OBJECT_TYPE,
//     pub ObjectTypeName: windows_sys::core::PSTR,
//     pub InheritedObjectTypeName: windows_sys::core::PSTR,
//     pub ptstrName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 909:1: declaration Impl has no candidate rule
// impl Default for OBJECTS_AND_NAME_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 914:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OBJECTS_AND_NAME_W {
//     pub ObjectsPresent: super::SYSTEM_AUDIT_OBJECT_ACE_FLAGS,
//     pub ObjectType: SE_OBJECT_TYPE,
//     pub ObjectTypeName: windows_sys::core::PWSTR,
//     pub InheritedObjectTypeName: windows_sys::core::PWSTR,
//     pub ptstrName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 923:1: declaration Impl has no candidate rule
// impl Default for OBJECTS_AND_NAME_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 928:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OBJECTS_AND_SID {
//     pub ObjectsPresent: super::SYSTEM_AUDIT_OBJECT_ACE_FLAGS,
//     pub ObjectTypeGuid: windows_sys::core::GUID,
//     pub InheritedObjectTypeGuid: windows_sys::core::GUID,
//     pub pSid: *mut super::SID,
// }

// UNSUPPORTED Rust 936:1: declaration Impl has no candidate rule
// impl Default for OBJECTS_AND_SID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OLESCRIPT_E_SYNTAX`: Int = -2147352319;
// UNSUPPORTED Rust 942:1: generic scalar type unsupported
// pub type PFN_AUTHZ_COMPUTE_DYNAMIC_GROUPS = Option<unsafe extern "system" fn(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, args: *const core::ffi::c_void, psidattrarray: *mut *mut super::SID_AND_ATTRIBUTES, psidcount: *mut u32, prestrictedsidattrarray: *mut *mut super::SID_AND_ATTRIBUTES, prestrictedsidcount: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 943:1: generic scalar type unsupported
// pub type PFN_AUTHZ_DYNAMIC_ACCESS_CHECK = Option<unsafe extern "system" fn(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, pace: *const super::ACE_HEADER, pargs: *const core::ffi::c_void, pbaceapplicable: *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 944:1: generic scalar type unsupported
// pub type PFN_AUTHZ_FREE_CENTRAL_ACCESS_POLICY = Option<unsafe extern "system" fn(pcentralaccesspolicy: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 945:1: generic scalar type unsupported
// pub type PFN_AUTHZ_FREE_DYNAMIC_GROUPS = Option<unsafe extern "system" fn(psidattrarray: *const super::SID_AND_ATTRIBUTES)>;

// UNSUPPORTED Rust 946:1: generic scalar type unsupported
// pub type PFN_AUTHZ_GET_CENTRAL_ACCESS_POLICY = Option<unsafe extern "system" fn(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, capid: super::PSID, pargs: *const core::ffi::c_void, pcentralaccesspolicyapplicable: *mut windows_sys::core::BOOL, ppcentralaccesspolicy: *mut *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

public typealias `PROG_INVOKE_SETTING` = Int;
public const val `ProgressCancelOperation`: `PROG_INVOKE_SETTING` = 4;
public const val `ProgressInvokeEveryObject`: `PROG_INVOKE_SETTING` = 2;
public const val `ProgressInvokeNever`: `PROG_INVOKE_SETTING` = 1;
public const val `ProgressInvokeOnError`: `PROG_INVOKE_SETTING` = 3;
public const val `ProgressInvokePrePostError`: `PROG_INVOKE_SETTING` = 6;
public const val `ProgressRetryOperation`: `PROG_INVOKE_SETTING` = 5;
public const val `REVOKE_ACCESS`: `ACCESS_MODE` = 4;
// UNSUPPORTED Rust 955:1: non-scalar type Ptr unsupported
// pub const SDDL_ACCESS_ALLOWED: windows_sys::core::PCWSTR = windows_sys::core::w!("A");

// UNSUPPORTED Rust 956:1: non-scalar type Ptr unsupported
// pub const SDDL_ACCESS_CONTROL_ASSISTANCE_OPS: windows_sys::core::PCWSTR = windows_sys::core::w!("AA");

// UNSUPPORTED Rust 957:1: non-scalar type Ptr unsupported
// pub const SDDL_ACCESS_DENIED: windows_sys::core::PCWSTR = windows_sys::core::w!("D");

// UNSUPPORTED Rust 958:1: non-scalar type Ptr unsupported
// pub const SDDL_ACCESS_FILTER: windows_sys::core::PCWSTR = windows_sys::core::w!("FL");

// UNSUPPORTED Rust 959:1: non-scalar type Ptr unsupported
// pub const SDDL_ACCOUNT_OPERATORS: windows_sys::core::PCWSTR = windows_sys::core::w!("AO");

// UNSUPPORTED Rust 960:1: non-scalar type Ptr unsupported
// pub const SDDL_ACE_BEGIN: windows_sys::core::PCWSTR = windows_sys::core::w!("(");

// UNSUPPORTED Rust 961:1: non-scalar type Ptr unsupported
// pub const SDDL_ACE_COND_ATTRIBUTE_PREFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("@");

// UNSUPPORTED Rust 962:1: non-scalar type Ptr unsupported
// pub const SDDL_ACE_COND_BEGIN: windows_sys::core::PCWSTR = windows_sys::core::w!("(");

// UNSUPPORTED Rust 963:1: non-scalar type Ptr unsupported
// pub const SDDL_ACE_COND_BLOB_PREFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("#");

// UNSUPPORTED Rust 964:1: non-scalar type Ptr unsupported
// pub const SDDL_ACE_COND_DEVICE_ATTRIBUTE_PREFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("@DEVICE.");

// UNSUPPORTED Rust 965:1: non-scalar type Ptr unsupported
// pub const SDDL_ACE_COND_END: windows_sys::core::PCWSTR = windows_sys::core::w!(")");

// UNSUPPORTED Rust 966:1: non-scalar type Ptr unsupported
// pub const SDDL_ACE_COND_RESOURCE_ATTRIBUTE_PREFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("@RESOURCE.");

// UNSUPPORTED Rust 967:1: non-scalar type Ptr unsupported
// pub const SDDL_ACE_COND_SID_PREFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("SID");

// UNSUPPORTED Rust 968:1: non-scalar type Ptr unsupported
// pub const SDDL_ACE_COND_TOKEN_ATTRIBUTE_PREFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("@TOKEN.");

// UNSUPPORTED Rust 969:1: non-scalar type Ptr unsupported
// pub const SDDL_ACE_COND_USER_ATTRIBUTE_PREFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("@USER.");

// UNSUPPORTED Rust 970:1: non-scalar type Ptr unsupported
// pub const SDDL_ACE_END: windows_sys::core::PCWSTR = windows_sys::core::w!(")");

// UNSUPPORTED Rust 971:1: non-scalar type Ptr unsupported
// pub const SDDL_ALARM: windows_sys::core::PCWSTR = windows_sys::core::w!("AL");

// UNSUPPORTED Rust 972:1: non-scalar type Ptr unsupported
// pub const SDDL_ALIAS_PREW2KCOMPACC: windows_sys::core::PCWSTR = windows_sys::core::w!("RU");

public const val `SDDL_ALIAS_SIZE`: UInt = 2u;
// UNSUPPORTED Rust 974:1: non-scalar type Ptr unsupported
// pub const SDDL_ALL_APP_PACKAGES: windows_sys::core::PCWSTR = windows_sys::core::w!("AC");

// UNSUPPORTED Rust 975:1: non-scalar type Ptr unsupported
// pub const SDDL_ANONYMOUS: windows_sys::core::PCWSTR = windows_sys::core::w!("AN");

// UNSUPPORTED Rust 976:1: non-scalar type Ptr unsupported
// pub const SDDL_AUDIT: windows_sys::core::PCWSTR = windows_sys::core::w!("AU");

// UNSUPPORTED Rust 977:1: non-scalar type Ptr unsupported
// pub const SDDL_AUDIT_FAILURE: windows_sys::core::PCWSTR = windows_sys::core::w!("FA");

// UNSUPPORTED Rust 978:1: non-scalar type Ptr unsupported
// pub const SDDL_AUDIT_SUCCESS: windows_sys::core::PCWSTR = windows_sys::core::w!("SA");

// UNSUPPORTED Rust 979:1: non-scalar type Ptr unsupported
// pub const SDDL_AUTHENTICATED_USERS: windows_sys::core::PCWSTR = windows_sys::core::w!("AU");

// UNSUPPORTED Rust 980:1: non-scalar type Ptr unsupported
// pub const SDDL_AUTHORITY_ASSERTED: windows_sys::core::PCWSTR = windows_sys::core::w!("AS");

// UNSUPPORTED Rust 981:1: non-scalar type Ptr unsupported
// pub const SDDL_AUTO_INHERITED: windows_sys::core::PCWSTR = windows_sys::core::w!("AI");

// UNSUPPORTED Rust 982:1: non-scalar type Ptr unsupported
// pub const SDDL_AUTO_INHERIT_REQ: windows_sys::core::PCWSTR = windows_sys::core::w!("AR");

// UNSUPPORTED Rust 983:1: non-scalar type Ptr unsupported
// pub const SDDL_BACKUP_OPERATORS: windows_sys::core::PCWSTR = windows_sys::core::w!("BO");

// UNSUPPORTED Rust 984:1: non-scalar type Ptr unsupported
// pub const SDDL_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("TX");

// UNSUPPORTED Rust 985:1: non-scalar type Ptr unsupported
// pub const SDDL_BOOLEAN: windows_sys::core::PCWSTR = windows_sys::core::w!("TB");

// UNSUPPORTED Rust 986:1: non-scalar type Ptr unsupported
// pub const SDDL_BUILTIN_ADMINISTRATORS: windows_sys::core::PCWSTR = windows_sys::core::w!("BA");

// UNSUPPORTED Rust 987:1: non-scalar type Ptr unsupported
// pub const SDDL_BUILTIN_GUESTS: windows_sys::core::PCWSTR = windows_sys::core::w!("BG");

// UNSUPPORTED Rust 988:1: non-scalar type Ptr unsupported
// pub const SDDL_BUILTIN_USERS: windows_sys::core::PCWSTR = windows_sys::core::w!("BU");

// UNSUPPORTED Rust 989:1: non-scalar type Ptr unsupported
// pub const SDDL_CALLBACK_ACCESS_ALLOWED: windows_sys::core::PCWSTR = windows_sys::core::w!("XA");

// UNSUPPORTED Rust 990:1: non-scalar type Ptr unsupported
// pub const SDDL_CALLBACK_ACCESS_DENIED: windows_sys::core::PCWSTR = windows_sys::core::w!("XD");

// UNSUPPORTED Rust 991:1: non-scalar type Ptr unsupported
// pub const SDDL_CALLBACK_AUDIT: windows_sys::core::PCWSTR = windows_sys::core::w!("XU");

// UNSUPPORTED Rust 992:1: non-scalar type Ptr unsupported
// pub const SDDL_CALLBACK_OBJECT_ACCESS_ALLOWED: windows_sys::core::PCWSTR = windows_sys::core::w!("ZA");

// UNSUPPORTED Rust 993:1: non-scalar type Ptr unsupported
// pub const SDDL_CERTSVC_DCOM_ACCESS: windows_sys::core::PCWSTR = windows_sys::core::w!("CD");

// UNSUPPORTED Rust 994:1: non-scalar type Ptr unsupported
// pub const SDDL_CERT_SERV_ADMINISTRATORS: windows_sys::core::PCWSTR = windows_sys::core::w!("CA");

// UNSUPPORTED Rust 995:1: non-scalar type Ptr unsupported
// pub const SDDL_CLONEABLE_CONTROLLERS: windows_sys::core::PCWSTR = windows_sys::core::w!("CN");

// UNSUPPORTED Rust 996:1: non-scalar type Ptr unsupported
// pub const SDDL_CONTAINER_INHERIT: windows_sys::core::PCWSTR = windows_sys::core::w!("CI");

// UNSUPPORTED Rust 997:1: non-scalar type Ptr unsupported
// pub const SDDL_CONTROL_ACCESS: windows_sys::core::PCWSTR = windows_sys::core::w!("CR");

// UNSUPPORTED Rust 998:1: non-scalar type Ptr unsupported
// pub const SDDL_CREATE_CHILD: windows_sys::core::PCWSTR = windows_sys::core::w!("CC");

// UNSUPPORTED Rust 999:1: non-scalar type Ptr unsupported
// pub const SDDL_CREATOR_GROUP: windows_sys::core::PCWSTR = windows_sys::core::w!("CG");

// UNSUPPORTED Rust 1000:1: non-scalar type Ptr unsupported
// pub const SDDL_CREATOR_OWNER: windows_sys::core::PCWSTR = windows_sys::core::w!("CO");

// UNSUPPORTED Rust 1001:1: non-scalar type Ptr unsupported
// pub const SDDL_CRITICAL: windows_sys::core::PCWSTR = windows_sys::core::w!("CR");

// UNSUPPORTED Rust 1002:1: non-scalar type Ptr unsupported
// pub const SDDL_CRYPTO_OPERATORS: windows_sys::core::PCWSTR = windows_sys::core::w!("CY");

// UNSUPPORTED Rust 1003:1: non-scalar type Ptr unsupported
// pub const SDDL_DACL: windows_sys::core::PCWSTR = windows_sys::core::w!("D");

// UNSUPPORTED Rust 1004:1: non-scalar type Ptr unsupported
// pub const SDDL_DELETE_CHILD: windows_sys::core::PCWSTR = windows_sys::core::w!("DC");

// UNSUPPORTED Rust 1005:1: non-scalar type Ptr unsupported
// pub const SDDL_DELETE_TREE: windows_sys::core::PCWSTR = windows_sys::core::w!("DT");

// UNSUPPORTED Rust 1006:1: non-scalar type Ptr unsupported
// pub const SDDL_DELIMINATOR: windows_sys::core::PCWSTR = windows_sys::core::w!(":");

// UNSUPPORTED Rust 1007:1: non-scalar type Ptr unsupported
// pub const SDDL_DOMAIN_ADMINISTRATORS: windows_sys::core::PCWSTR = windows_sys::core::w!("DA");

// UNSUPPORTED Rust 1008:1: non-scalar type Ptr unsupported
// pub const SDDL_DOMAIN_COMPUTERS: windows_sys::core::PCWSTR = windows_sys::core::w!("DC");

// UNSUPPORTED Rust 1009:1: non-scalar type Ptr unsupported
// pub const SDDL_DOMAIN_DOMAIN_CONTROLLERS: windows_sys::core::PCWSTR = windows_sys::core::w!("DD");

// UNSUPPORTED Rust 1010:1: non-scalar type Ptr unsupported
// pub const SDDL_DOMAIN_GUESTS: windows_sys::core::PCWSTR = windows_sys::core::w!("DG");

// UNSUPPORTED Rust 1011:1: non-scalar type Ptr unsupported
// pub const SDDL_DOMAIN_USERS: windows_sys::core::PCWSTR = windows_sys::core::w!("DU");

// UNSUPPORTED Rust 1012:1: non-scalar type Ptr unsupported
// pub const SDDL_ENTERPRISE_ADMINS: windows_sys::core::PCWSTR = windows_sys::core::w!("EA");

// UNSUPPORTED Rust 1013:1: non-scalar type Ptr unsupported
// pub const SDDL_ENTERPRISE_DOMAIN_CONTROLLERS: windows_sys::core::PCWSTR = windows_sys::core::w!("ED");

// UNSUPPORTED Rust 1014:1: non-scalar type Ptr unsupported
// pub const SDDL_ENTERPRISE_KEY_ADMINS: windows_sys::core::PCWSTR = windows_sys::core::w!("EK");

// UNSUPPORTED Rust 1015:1: non-scalar type Ptr unsupported
// pub const SDDL_ENTERPRISE_RO_DCs: windows_sys::core::PCWSTR = windows_sys::core::w!("RO");

// UNSUPPORTED Rust 1016:1: non-scalar type Ptr unsupported
// pub const SDDL_EVENT_LOG_READERS: windows_sys::core::PCWSTR = windows_sys::core::w!("ER");

// UNSUPPORTED Rust 1017:1: non-scalar type Ptr unsupported
// pub const SDDL_EVERYONE: windows_sys::core::PCWSTR = windows_sys::core::w!("WD");

// UNSUPPORTED Rust 1018:1: non-scalar type Ptr unsupported
// pub const SDDL_FILE_ALL: windows_sys::core::PCWSTR = windows_sys::core::w!("FA");

// UNSUPPORTED Rust 1019:1: non-scalar type Ptr unsupported
// pub const SDDL_FILE_EXECUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("FX");

// UNSUPPORTED Rust 1020:1: non-scalar type Ptr unsupported
// pub const SDDL_FILE_READ: windows_sys::core::PCWSTR = windows_sys::core::w!("FR");

// UNSUPPORTED Rust 1021:1: non-scalar type Ptr unsupported
// pub const SDDL_FILE_WRITE: windows_sys::core::PCWSTR = windows_sys::core::w!("FW");

// UNSUPPORTED Rust 1022:1: non-scalar type Ptr unsupported
// pub const SDDL_GENERIC_ALL: windows_sys::core::PCWSTR = windows_sys::core::w!("GA");

// UNSUPPORTED Rust 1023:1: non-scalar type Ptr unsupported
// pub const SDDL_GENERIC_EXECUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("GX");

// UNSUPPORTED Rust 1024:1: non-scalar type Ptr unsupported
// pub const SDDL_GENERIC_READ: windows_sys::core::PCWSTR = windows_sys::core::w!("GR");

// UNSUPPORTED Rust 1025:1: non-scalar type Ptr unsupported
// pub const SDDL_GENERIC_WRITE: windows_sys::core::PCWSTR = windows_sys::core::w!("GW");

// UNSUPPORTED Rust 1026:1: non-scalar type Ptr unsupported
// pub const SDDL_GROUP: windows_sys::core::PCWSTR = windows_sys::core::w!("G");

// UNSUPPORTED Rust 1027:1: non-scalar type Ptr unsupported
// pub const SDDL_GROUP_POLICY_ADMINS: windows_sys::core::PCWSTR = windows_sys::core::w!("PA");

// UNSUPPORTED Rust 1028:1: non-scalar type Ptr unsupported
// pub const SDDL_HYPER_V_ADMINS: windows_sys::core::PCWSTR = windows_sys::core::w!("HA");

// UNSUPPORTED Rust 1029:1: non-scalar type Ptr unsupported
// pub const SDDL_IIS_USERS: windows_sys::core::PCWSTR = windows_sys::core::w!("IS");

// UNSUPPORTED Rust 1030:1: non-scalar type Ptr unsupported
// pub const SDDL_INHERITED: windows_sys::core::PCWSTR = windows_sys::core::w!("ID");

// UNSUPPORTED Rust 1031:1: non-scalar type Ptr unsupported
// pub const SDDL_INHERIT_ONLY: windows_sys::core::PCWSTR = windows_sys::core::w!("IO");

// UNSUPPORTED Rust 1032:1: non-scalar type Ptr unsupported
// pub const SDDL_INT: windows_sys::core::PCWSTR = windows_sys::core::w!("TI");

// UNSUPPORTED Rust 1033:1: non-scalar type Ptr unsupported
// pub const SDDL_INTERACTIVE: windows_sys::core::PCWSTR = windows_sys::core::w!("IU");

// UNSUPPORTED Rust 1034:1: non-scalar type Ptr unsupported
// pub const SDDL_KEY_ADMINS: windows_sys::core::PCWSTR = windows_sys::core::w!("KA");

// UNSUPPORTED Rust 1035:1: non-scalar type Ptr unsupported
// pub const SDDL_KEY_ALL: windows_sys::core::PCWSTR = windows_sys::core::w!("KA");

// UNSUPPORTED Rust 1036:1: non-scalar type Ptr unsupported
// pub const SDDL_KEY_EXECUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("KX");

// UNSUPPORTED Rust 1037:1: non-scalar type Ptr unsupported
// pub const SDDL_KEY_READ: windows_sys::core::PCWSTR = windows_sys::core::w!("KR");

// UNSUPPORTED Rust 1038:1: non-scalar type Ptr unsupported
// pub const SDDL_KEY_WRITE: windows_sys::core::PCWSTR = windows_sys::core::w!("KW");

// UNSUPPORTED Rust 1039:1: non-scalar type Ptr unsupported
// pub const SDDL_LIST_CHILDREN: windows_sys::core::PCWSTR = windows_sys::core::w!("LC");

// UNSUPPORTED Rust 1040:1: non-scalar type Ptr unsupported
// pub const SDDL_LIST_OBJECT: windows_sys::core::PCWSTR = windows_sys::core::w!("LO");

// UNSUPPORTED Rust 1041:1: non-scalar type Ptr unsupported
// pub const SDDL_LOCAL_ADMIN: windows_sys::core::PCWSTR = windows_sys::core::w!("LA");

// UNSUPPORTED Rust 1042:1: non-scalar type Ptr unsupported
// pub const SDDL_LOCAL_GUEST: windows_sys::core::PCWSTR = windows_sys::core::w!("LG");

// UNSUPPORTED Rust 1043:1: non-scalar type Ptr unsupported
// pub const SDDL_LOCAL_SERVICE: windows_sys::core::PCWSTR = windows_sys::core::w!("LS");

// UNSUPPORTED Rust 1044:1: non-scalar type Ptr unsupported
// pub const SDDL_LOCAL_SYSTEM: windows_sys::core::PCWSTR = windows_sys::core::w!("SY");

// UNSUPPORTED Rust 1045:1: non-scalar type Ptr unsupported
// pub const SDDL_MANDATORY_LABEL: windows_sys::core::PCWSTR = windows_sys::core::w!("ML");

// UNSUPPORTED Rust 1046:1: non-scalar type Ptr unsupported
// pub const SDDL_ML_HIGH: windows_sys::core::PCWSTR = windows_sys::core::w!("HI");

// UNSUPPORTED Rust 1047:1: non-scalar type Ptr unsupported
// pub const SDDL_ML_LOW: windows_sys::core::PCWSTR = windows_sys::core::w!("LW");

// UNSUPPORTED Rust 1048:1: non-scalar type Ptr unsupported
// pub const SDDL_ML_MEDIUM: windows_sys::core::PCWSTR = windows_sys::core::w!("ME");

// UNSUPPORTED Rust 1049:1: non-scalar type Ptr unsupported
// pub const SDDL_ML_MEDIUM_PLUS: windows_sys::core::PCWSTR = windows_sys::core::w!("MP");

// UNSUPPORTED Rust 1050:1: non-scalar type Ptr unsupported
// pub const SDDL_ML_SYSTEM: windows_sys::core::PCWSTR = windows_sys::core::w!("SI");

// UNSUPPORTED Rust 1051:1: non-scalar type Ptr unsupported
// pub const SDDL_NETWORK: windows_sys::core::PCWSTR = windows_sys::core::w!("NU");

// UNSUPPORTED Rust 1052:1: non-scalar type Ptr unsupported
// pub const SDDL_NETWORK_CONFIGURATION_OPS: windows_sys::core::PCWSTR = windows_sys::core::w!("NO");

// UNSUPPORTED Rust 1053:1: non-scalar type Ptr unsupported
// pub const SDDL_NETWORK_SERVICE: windows_sys::core::PCWSTR = windows_sys::core::w!("NS");

// UNSUPPORTED Rust 1054:1: non-scalar type Ptr unsupported
// pub const SDDL_NO_EXECUTE_UP: windows_sys::core::PCWSTR = windows_sys::core::w!("NX");

// UNSUPPORTED Rust 1055:1: non-scalar type Ptr unsupported
// pub const SDDL_NO_PROPAGATE: windows_sys::core::PCWSTR = windows_sys::core::w!("NP");

// UNSUPPORTED Rust 1056:1: non-scalar type Ptr unsupported
// pub const SDDL_NO_READ_UP: windows_sys::core::PCWSTR = windows_sys::core::w!("NR");

// UNSUPPORTED Rust 1057:1: non-scalar type Ptr unsupported
// pub const SDDL_NO_WRITE_UP: windows_sys::core::PCWSTR = windows_sys::core::w!("NW");

// UNSUPPORTED Rust 1058:1: non-scalar type Ptr unsupported
// pub const SDDL_NULL_ACL: windows_sys::core::PCWSTR = windows_sys::core::w!("NO_ACCESS_CONTROL");

// UNSUPPORTED Rust 1059:1: non-scalar type Ptr unsupported
// pub const SDDL_OBJECT_ACCESS_ALLOWED: windows_sys::core::PCWSTR = windows_sys::core::w!("OA");

// UNSUPPORTED Rust 1060:1: non-scalar type Ptr unsupported
// pub const SDDL_OBJECT_ACCESS_DENIED: windows_sys::core::PCWSTR = windows_sys::core::w!("OD");

// UNSUPPORTED Rust 1061:1: non-scalar type Ptr unsupported
// pub const SDDL_OBJECT_ALARM: windows_sys::core::PCWSTR = windows_sys::core::w!("OL");

// UNSUPPORTED Rust 1062:1: non-scalar type Ptr unsupported
// pub const SDDL_OBJECT_AUDIT: windows_sys::core::PCWSTR = windows_sys::core::w!("OU");

// UNSUPPORTED Rust 1063:1: non-scalar type Ptr unsupported
// pub const SDDL_OBJECT_INHERIT: windows_sys::core::PCWSTR = windows_sys::core::w!("OI");

// UNSUPPORTED Rust 1064:1: non-scalar type Ptr unsupported
// pub const SDDL_OWNER: windows_sys::core::PCWSTR = windows_sys::core::w!("O");

// UNSUPPORTED Rust 1065:1: non-scalar type Ptr unsupported
// pub const SDDL_OWNER_RIGHTS: windows_sys::core::PCWSTR = windows_sys::core::w!("OW");

// UNSUPPORTED Rust 1066:1: non-scalar type Ptr unsupported
// pub const SDDL_PERFLOG_USERS: windows_sys::core::PCWSTR = windows_sys::core::w!("LU");

// UNSUPPORTED Rust 1067:1: non-scalar type Ptr unsupported
// pub const SDDL_PERFMON_USERS: windows_sys::core::PCWSTR = windows_sys::core::w!("MU");

// UNSUPPORTED Rust 1068:1: non-scalar type Ptr unsupported
// pub const SDDL_PERSONAL_SELF: windows_sys::core::PCWSTR = windows_sys::core::w!("PS");

// UNSUPPORTED Rust 1069:1: non-scalar type Ptr unsupported
// pub const SDDL_POWER_USERS: windows_sys::core::PCWSTR = windows_sys::core::w!("PU");

// UNSUPPORTED Rust 1070:1: non-scalar type Ptr unsupported
// pub const SDDL_PRINTER_OPERATORS: windows_sys::core::PCWSTR = windows_sys::core::w!("PO");

// UNSUPPORTED Rust 1071:1: non-scalar type Ptr unsupported
// pub const SDDL_PROCESS_TRUST_LABEL: windows_sys::core::PCWSTR = windows_sys::core::w!("TL");

// UNSUPPORTED Rust 1072:1: non-scalar type Ptr unsupported
// pub const SDDL_PROTECTED: windows_sys::core::PCWSTR = windows_sys::core::w!("P");

// UNSUPPORTED Rust 1073:1: non-scalar type Ptr unsupported
// pub const SDDL_PROTECTED_USERS: windows_sys::core::PCWSTR = windows_sys::core::w!("AP");

// UNSUPPORTED Rust 1074:1: non-scalar type Ptr unsupported
// pub const SDDL_RAS_SERVERS: windows_sys::core::PCWSTR = windows_sys::core::w!("RS");

// UNSUPPORTED Rust 1075:1: non-scalar type Ptr unsupported
// pub const SDDL_RDS_ENDPOINT_SERVERS: windows_sys::core::PCWSTR = windows_sys::core::w!("ES");

// UNSUPPORTED Rust 1076:1: non-scalar type Ptr unsupported
// pub const SDDL_RDS_MANAGEMENT_SERVERS: windows_sys::core::PCWSTR = windows_sys::core::w!("MS");

// UNSUPPORTED Rust 1077:1: non-scalar type Ptr unsupported
// pub const SDDL_RDS_REMOTE_ACCESS_SERVERS: windows_sys::core::PCWSTR = windows_sys::core::w!("RA");

// UNSUPPORTED Rust 1078:1: non-scalar type Ptr unsupported
// pub const SDDL_READ_CONTROL: windows_sys::core::PCWSTR = windows_sys::core::w!("RC");

// UNSUPPORTED Rust 1079:1: non-scalar type Ptr unsupported
// pub const SDDL_READ_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("RP");

// UNSUPPORTED Rust 1080:1: non-scalar type Ptr unsupported
// pub const SDDL_REMOTE_DESKTOP: windows_sys::core::PCWSTR = windows_sys::core::w!("RD");

// UNSUPPORTED Rust 1081:1: non-scalar type Ptr unsupported
// pub const SDDL_REMOTE_MANAGEMENT_USERS: windows_sys::core::PCWSTR = windows_sys::core::w!("RM");

// UNSUPPORTED Rust 1082:1: non-scalar type Ptr unsupported
// pub const SDDL_REPLICATOR: windows_sys::core::PCWSTR = windows_sys::core::w!("RE");

// UNSUPPORTED Rust 1083:1: non-scalar type Ptr unsupported
// pub const SDDL_RESOURCE_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("RA");

// UNSUPPORTED Rust 1084:1: non-scalar type Ptr unsupported
// pub const SDDL_RESTRICTED_CODE: windows_sys::core::PCWSTR = windows_sys::core::w!("RC");

public const val `SDDL_REVISION`: UInt = 1u;
public const val `SDDL_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 1087:1: non-scalar type Ptr unsupported
// pub const SDDL_SACL: windows_sys::core::PCWSTR = windows_sys::core::w!("S");

// UNSUPPORTED Rust 1088:1: non-scalar type Ptr unsupported
// pub const SDDL_SCHEMA_ADMINISTRATORS: windows_sys::core::PCWSTR = windows_sys::core::w!("SA");

// UNSUPPORTED Rust 1089:1: non-scalar type Ptr unsupported
// pub const SDDL_SCOPED_POLICY_ID: windows_sys::core::PCWSTR = windows_sys::core::w!("SP");

// UNSUPPORTED Rust 1090:1: non-scalar type Ptr unsupported
// pub const SDDL_SELF_WRITE: windows_sys::core::PCWSTR = windows_sys::core::w!("SW");

// UNSUPPORTED Rust 1091:1: non-scalar type Ptr unsupported
// pub const SDDL_SEPERATOR: windows_sys::core::PCWSTR = windows_sys::core::w!(";");

// UNSUPPORTED Rust 1092:1: non-scalar type Ptr unsupported
// pub const SDDL_SERVER_OPERATORS: windows_sys::core::PCWSTR = windows_sys::core::w!("SO");

// UNSUPPORTED Rust 1093:1: non-scalar type Ptr unsupported
// pub const SDDL_SERVICE: windows_sys::core::PCWSTR = windows_sys::core::w!("SU");

// UNSUPPORTED Rust 1094:1: non-scalar type Ptr unsupported
// pub const SDDL_SERVICE_ASSERTED: windows_sys::core::PCWSTR = windows_sys::core::w!("SS");

// UNSUPPORTED Rust 1095:1: non-scalar type Ptr unsupported
// pub const SDDL_SID: windows_sys::core::PCWSTR = windows_sys::core::w!("TD");

// UNSUPPORTED Rust 1096:1: non-scalar type Ptr unsupported
// pub const SDDL_SPACE: windows_sys::core::PCWSTR = windows_sys::core::w!(" ");

// UNSUPPORTED Rust 1097:1: non-scalar type Ptr unsupported
// pub const SDDL_STANDARD_DELETE: windows_sys::core::PCWSTR = windows_sys::core::w!("SD");

// UNSUPPORTED Rust 1098:1: non-scalar type Ptr unsupported
// pub const SDDL_TRUST_PROTECTED_FILTER: windows_sys::core::PCWSTR = windows_sys::core::w!("TP");

// UNSUPPORTED Rust 1099:1: non-scalar type Ptr unsupported
// pub const SDDL_UINT: windows_sys::core::PCWSTR = windows_sys::core::w!("TU");

// UNSUPPORTED Rust 1100:1: non-scalar type Ptr unsupported
// pub const SDDL_USER_MODE_DRIVERS: windows_sys::core::PCWSTR = windows_sys::core::w!("UD");

// UNSUPPORTED Rust 1101:1: non-scalar type Ptr unsupported
// pub const SDDL_WRITE_DAC: windows_sys::core::PCWSTR = windows_sys::core::w!("WD");

// UNSUPPORTED Rust 1102:1: non-scalar type Ptr unsupported
// pub const SDDL_WRITE_OWNER: windows_sys::core::PCWSTR = windows_sys::core::w!("WO");

// UNSUPPORTED Rust 1103:1: non-scalar type Ptr unsupported
// pub const SDDL_WRITE_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("WP");

// UNSUPPORTED Rust 1104:1: non-scalar type Ptr unsupported
// pub const SDDL_WRITE_RESTRICTED_CODE: windows_sys::core::PCWSTR = windows_sys::core::w!("WR");

// UNSUPPORTED Rust 1105:1: non-scalar type Ptr unsupported
// pub const SDDL_WSTRING: windows_sys::core::PCWSTR = windows_sys::core::w!("TS");

public const val `SET_ACCESS`: `ACCESS_MODE` = 2;
public const val `SET_AUDIT_FAILURE`: `ACCESS_MODE` = 6;
public const val `SET_AUDIT_SUCCESS`: `ACCESS_MODE` = 5;
public const val `SE_DS_OBJECT`: `SE_OBJECT_TYPE` = 8;
public const val `SE_DS_OBJECT_ALL`: `SE_OBJECT_TYPE` = 9;
public const val `SE_FILE_OBJECT`: `SE_OBJECT_TYPE` = 1;
public const val `SE_KERNEL_OBJECT`: `SE_OBJECT_TYPE` = 6;
public const val `SE_LMSHARE`: `SE_OBJECT_TYPE` = 5;
public typealias `SE_OBJECT_TYPE` = Int;
public const val `SE_PRINTER`: `SE_OBJECT_TYPE` = 3;
public const val `SE_PROVIDER_DEFINED_OBJECT`: `SE_OBJECT_TYPE` = 10;
public const val `SE_REGISTRY_KEY`: `SE_OBJECT_TYPE` = 4;
public const val `SE_REGISTRY_WOW64_32KEY`: `SE_OBJECT_TYPE` = 12;
public const val `SE_REGISTRY_WOW64_64KEY`: `SE_OBJECT_TYPE` = 13;
public const val `SE_SERVICE`: `SE_OBJECT_TYPE` = 2;
public const val `SE_UNKNOWN_OBJECT_TYPE`: `SE_OBJECT_TYPE` = 0;
public const val `SE_WINDOW_OBJECT`: `SE_OBJECT_TYPE` = 7;
public const val `SE_WMIGUID_OBJECT`: `SE_OBJECT_TYPE` = 11;
public typealias `TREE_SEC_INFO` = UInt;
public const val `TREE_SEC_INFO_RESET`: `TREE_SEC_INFO` = 2u;
public const val `TREE_SEC_INFO_RESET_KEEP_EXPLICIT`: `TREE_SEC_INFO` = 3u;
public const val `TREE_SEC_INFO_SET`: `TREE_SEC_INFO` = 1u;
// UNSUPPORTED Rust 1128:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TRUSTEE_A {
//     pub pMultipleTrustee: *mut TRUSTEE_A,
//     pub MultipleTrusteeOperation: MULTIPLE_TRUSTEE_OPERATION,
//     pub TrusteeForm: TRUSTEE_FORM,
//     pub TrusteeType: TRUSTEE_TYPE,
//     pub ptstrName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 1137:1: declaration Impl has no candidate rule
// impl Default for TRUSTEE_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1142:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TRUSTEE_ACCESSA {
//     pub lpProperty: windows_sys::core::PSTR,
//     pub Access: u32,
//     pub fAccessFlags: u32,
//     pub fReturnedAccess: u32,
// }

// UNSUPPORTED Rust 1150:1: declaration Impl has no candidate rule
// impl Default for TRUSTEE_ACCESSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1155:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TRUSTEE_ACCESSW {
//     pub lpProperty: windows_sys::core::PWSTR,
//     pub Access: u32,
//     pub fAccessFlags: u32,
//     pub fReturnedAccess: u32,
// }

// UNSUPPORTED Rust 1163:1: declaration Impl has no candidate rule
// impl Default for TRUSTEE_ACCESSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TRUSTEE_ACCESS_ALL`: Int = -1;
public const val `TRUSTEE_ACCESS_ALLOWED`: Int = 1;
public const val `TRUSTEE_ACCESS_EXPLICIT`: Int = 1;
public const val `TRUSTEE_ACCESS_READ`: Int = 2;
public const val `TRUSTEE_ACCESS_WRITE`: Int = 4;
public const val `TRUSTEE_BAD_FORM`: `TRUSTEE_FORM` = 2;
public typealias `TRUSTEE_FORM` = Int;
public const val `TRUSTEE_IS_ALIAS`: `TRUSTEE_TYPE` = 4;
public const val `TRUSTEE_IS_COMPUTER`: `TRUSTEE_TYPE` = 8;
public const val `TRUSTEE_IS_DELETED`: `TRUSTEE_TYPE` = 6;
public const val `TRUSTEE_IS_DOMAIN`: `TRUSTEE_TYPE` = 3;
public const val `TRUSTEE_IS_GROUP`: `TRUSTEE_TYPE` = 2;
public const val `TRUSTEE_IS_IMPERSONATE`: `MULTIPLE_TRUSTEE_OPERATION` = 1;
public const val `TRUSTEE_IS_INVALID`: `TRUSTEE_TYPE` = 7;
public const val `TRUSTEE_IS_NAME`: `TRUSTEE_FORM` = 1;
public const val `TRUSTEE_IS_OBJECTS_AND_NAME`: `TRUSTEE_FORM` = 4;
public const val `TRUSTEE_IS_OBJECTS_AND_SID`: `TRUSTEE_FORM` = 3;
public const val `TRUSTEE_IS_SID`: `TRUSTEE_FORM` = 0;
public const val `TRUSTEE_IS_UNKNOWN`: `TRUSTEE_TYPE` = 0;
public const val `TRUSTEE_IS_USER`: `TRUSTEE_TYPE` = 1;
public const val `TRUSTEE_IS_WELL_KNOWN_GROUP`: `TRUSTEE_TYPE` = 5;
public typealias `TRUSTEE_TYPE` = Int;
// UNSUPPORTED Rust 1190:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TRUSTEE_W {
//     pub pMultipleTrustee: *mut TRUSTEE_W,
//     pub MultipleTrusteeOperation: MULTIPLE_TRUSTEE_OPERATION,
//     pub TrusteeForm: TRUSTEE_FORM,
//     pub TrusteeType: TRUSTEE_TYPE,
//     pub ptstrName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1199:1: declaration Impl has no candidate rule
// impl Default for TRUSTEE_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `_AUTHZ_SS_MAXSIZE`: UInt = 128u;
