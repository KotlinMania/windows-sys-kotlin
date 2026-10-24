// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn AcceptSecurityContext(phcredential : *const super::super::Credentials:: SecHandle, phcontext : *const super::super::Credentials:: SecHandle, pinput : *const SecBufferDesc, fcontextreq : ASC_REQ_FLAGS, targetdatarep : u32, phnewcontext : *mut super::super::Credentials:: SecHandle, poutput : *mut SecBufferDesc, pfcontextattr : *mut u32, ptsexpiry : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn AcquireCredentialsHandleA(pszprincipal : windows_sys::core::PCSTR, pszpackage : windows_sys::core::PCSTR, fcredentialuse : SECPKG_CRED, pvlogonid : *const core::ffi::c_void, pauthdata : *const core::ffi::c_void, pgetkeyfn : SEC_GET_KEY_FN, pvgetkeyargument : *const core::ffi::c_void, phcredential : *mut super::super::Credentials:: SecHandle, ptsexpiry : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn AcquireCredentialsHandleW(pszprincipal : windows_sys::core::PCWSTR, pszpackage : windows_sys::core::PCWSTR, fcredentialuse : SECPKG_CRED, pvlogonid : *const core::ffi::c_void, pauthdata : *const core::ffi::c_void, pgetkeyfn : SEC_GET_KEY_FN, pvgetkeyargument : *const core::ffi::c_void, phcredential : *mut super::super::Credentials:: SecHandle, ptsexpiry : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn AddCredentialsA(hcredentials : *const super::super::Credentials:: SecHandle, pszprincipal : windows_sys::core::PCSTR, pszpackage : windows_sys::core::PCSTR, fcredentialuse : u32, pauthdata : *const core::ffi::c_void, pgetkeyfn : SEC_GET_KEY_FN, pvgetkeyargument : *const core::ffi::c_void, ptsexpiry : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn AddCredentialsW(hcredentials : *const super::super::Credentials:: SecHandle, pszprincipal : windows_sys::core::PCWSTR, pszpackage : windows_sys::core::PCWSTR, fcredentialuse : u32, pauthdata : *const core::ffi::c_void, pgetkeyfn : SEC_GET_KEY_FN, pvgetkeyargument : *const core::ffi::c_void, ptsexpiry : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn AddSecurityPackageA(pszpackagename : windows_sys::core::PCSTR, poptions : *const SECURITY_PACKAGE_OPTIONS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn AddSecurityPackageW(pszpackagename : windows_sys::core::PCWSTR, poptions : *const SECURITY_PACKAGE_OPTIONS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn ApplyControlToken(phcontext : *const super::super::Credentials:: SecHandle, pinput : *const SecBufferDesc) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AuditComputeEffectivePolicyBySid(psid : super::super:: PSID, psubcategoryguids : *const windows_sys::core::GUID, dwpolicycount : u32, ppauditpolicy : *mut *mut AUDIT_POLICY_INFORMATION) -> bool);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AuditComputeEffectivePolicyByToken(htokenhandle : super::super::super::Foundation:: HANDLE, psubcategoryguids : *const windows_sys::core::GUID, dwpolicycount : u32, ppauditpolicy : *mut *mut AUDIT_POLICY_INFORMATION) -> bool);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AuditEnumerateCategories(ppauditcategoriesarray : *mut *mut windows_sys::core::GUID, pdwcountreturned : *mut u32) -> bool);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AuditEnumeratePerUserPolicy(ppauditsidarray : *mut *mut POLICY_AUDIT_SID_ARRAY) -> bool);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AuditEnumerateSubCategories(pauditcategoryguid : *const windows_sys::core::GUID, bretrieveallsubcategories : bool, ppauditsubcategoriesarray : *mut *mut windows_sys::core::GUID, pdwcountreturned : *mut u32) -> bool);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AuditFree(buffer : *const core::ffi::c_void));

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AuditLookupCategoryGuidFromCategoryId(auditcategoryid : POLICY_AUDIT_EVENT_TYPE, pauditcategoryguid : *mut windows_sys::core::GUID) -> bool);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AuditLookupCategoryIdFromCategoryGuid(pauditcategoryguid : *const windows_sys::core::GUID, pauditcategoryid : *mut POLICY_AUDIT_EVENT_TYPE) -> bool);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AuditLookupCategoryNameA(pauditcategoryguid : *const windows_sys::core::GUID, ppszcategoryname : *mut windows_sys::core::PSTR) -> bool);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AuditLookupCategoryNameW(pauditcategoryguid : *const windows_sys::core::GUID, ppszcategoryname : *mut windows_sys::core::PWSTR) -> bool);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AuditLookupSubCategoryNameA(pauditsubcategoryguid : *const windows_sys::core::GUID, ppszsubcategoryname : *mut windows_sys::core::PSTR) -> bool);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AuditLookupSubCategoryNameW(pauditsubcategoryguid : *const windows_sys::core::GUID, ppszsubcategoryname : *mut windows_sys::core::PWSTR) -> bool);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AuditQueryGlobalSaclA(objecttypename : windows_sys::core::PCSTR, acl : *mut *mut super::super:: ACL) -> bool);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AuditQueryGlobalSaclW(objecttypename : windows_sys::core::PCWSTR, acl : *mut *mut super::super:: ACL) -> bool);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AuditQueryPerUserPolicy(psid : super::super:: PSID, psubcategoryguids : *const windows_sys::core::GUID, dwpolicycount : u32, ppauditpolicy : *mut *mut AUDIT_POLICY_INFORMATION) -> bool);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AuditQuerySecurity(securityinformation : super::super:: OBJECT_SECURITY_INFORMATION, ppsecuritydescriptor : *mut super::super:: PSECURITY_DESCRIPTOR) -> bool);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AuditQuerySystemPolicy(psubcategoryguids : *const windows_sys::core::GUID, dwpolicycount : u32, ppauditpolicy : *mut *mut AUDIT_POLICY_INFORMATION) -> bool);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AuditSetGlobalSaclA(objecttypename : windows_sys::core::PCSTR, acl : *const super::super:: ACL) -> bool);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AuditSetGlobalSaclW(objecttypename : windows_sys::core::PCWSTR, acl : *const super::super:: ACL) -> bool);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AuditSetPerUserPolicy(psid : super::super:: PSID, pauditpolicy : *const AUDIT_POLICY_INFORMATION, dwpolicycount : u32) -> bool);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AuditSetSecurity(securityinformation : super::super:: OBJECT_SECURITY_INFORMATION, psecuritydescriptor : super::super:: PSECURITY_DESCRIPTOR) -> bool);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn AuditSetSystemPolicy(pauditpolicy : *const AUDIT_POLICY_INFORMATION, dwpolicycount : u32) -> bool);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn ChangeAccountPasswordA(pszpackagename : *const i8, pszdomainname : *const i8, pszaccountname : *const i8, pszoldpassword : *const i8, psznewpassword : *const i8, bimpersonating : bool, dwreserved : u32, poutput : *mut SecBufferDesc) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn ChangeAccountPasswordW(pszpackagename : *const u16, pszdomainname : *const u16, pszaccountname : *const u16, pszoldpassword : *const u16, psznewpassword : *const u16, bimpersonating : bool, dwreserved : u32, poutput : *mut SecBufferDesc) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn CompleteAuthToken(phcontext : *const super::super::Credentials:: SecHandle, ptoken : *const SecBufferDesc) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn CredMarshalTargetInfo(intargetinfo : *const super::super::Credentials:: CREDENTIAL_TARGET_INFORMATIONW, buffer : *mut *mut u16, buffersize : *mut u32) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn CredUnmarshalTargetInfo(buffer : *const u16, buffersize : u32, rettargetinfo : *mut *mut super::super::Credentials:: CREDENTIAL_TARGET_INFORMATIONW, retactualsize : *mut u32) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn DecryptMessage(phcontext : *const super::super::Credentials:: SecHandle, pmessage : *const SecBufferDesc, messageseqno : u32, pfqop : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn DeleteSecurityContext(phcontext : *const super::super::Credentials:: SecHandle) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn DeleteSecurityPackageA(pszpackagename : windows_sys::core::PCSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn DeleteSecurityPackageW(pszpackagename : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn EncryptMessage(phcontext : *const super::super::Credentials:: SecHandle, fqop : u32, pmessage : *const SecBufferDesc, messageseqno : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn EnumerateSecurityPackagesA(pcpackages : *mut u32, pppackageinfo : *mut *mut SecPkgInfoA) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn EnumerateSecurityPackagesW(pcpackages : *mut u32, pppackageinfo : *mut *mut SecPkgInfoW) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn ExportSecurityContext(phcontext : *const super::super::Credentials:: SecHandle, fflags : EXPORT_SECURITY_CONTEXT_FLAGS, ppackedcontext : *mut SecBuffer, ptoken : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn FreeContextBuffer(pvcontextbuffer : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn FreeCredentialsHandle(phcredential : *const super::super::Credentials:: SecHandle) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn GetComputerObjectNameA(nameformat : EXTENDED_NAME_FORMAT, lpnamebuffer : windows_sys::core::PSTR, nsize : *mut u32) -> bool);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn GetComputerObjectNameW(nameformat : EXTENDED_NAME_FORMAT, lpnamebuffer : windows_sys::core::PWSTR, nsize : *mut u32) -> bool);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn GetUserNameExA(nameformat : EXTENDED_NAME_FORMAT, lpnamebuffer : windows_sys::core::PSTR, nsize : *mut u32) -> bool);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn GetUserNameExW(nameformat : EXTENDED_NAME_FORMAT, lpnamebuffer : windows_sys::core::PWSTR, nsize : *mut u32) -> bool);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn ImpersonateSecurityContext(phcontext : *const super::super::Credentials:: SecHandle) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn ImportSecurityContextA(pszpackage : windows_sys::core::PCSTR, ppackedcontext : *const SecBuffer, token : *const core::ffi::c_void, phcontext : *mut super::super::Credentials:: SecHandle) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn ImportSecurityContextW(pszpackage : windows_sys::core::PCWSTR, ppackedcontext : *const SecBuffer, token : *const core::ffi::c_void, phcontext : *mut super::super::Credentials:: SecHandle) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn InitSecurityInterfaceA() -> *mut SecurityFunctionTableA);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn InitSecurityInterfaceW() -> *mut SecurityFunctionTableW);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn InitializeSecurityContextA(phcredential : *const super::super::Credentials:: SecHandle, phcontext : *const super::super::Credentials:: SecHandle, psztargetname : *const i8, fcontextreq : ISC_REQ_FLAGS, reserved1 : u32, targetdatarep : u32, pinput : *const SecBufferDesc, reserved2 : u32, phnewcontext : *mut super::super::Credentials:: SecHandle, poutput : *mut SecBufferDesc, pfcontextattr : *mut u32, ptsexpiry : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn InitializeSecurityContextW(phcredential : *const super::super::Credentials:: SecHandle, phcontext : *const super::super::Credentials:: SecHandle, psztargetname : *const u16, fcontextreq : ISC_REQ_FLAGS, reserved1 : u32, targetdatarep : u32, pinput : *const SecBufferDesc, reserved2 : u32, phnewcontext : *mut super::super::Credentials:: SecHandle, poutput : *mut SecBufferDesc, pfcontextattr : *mut u32, ptsexpiry : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaAddAccountRights(policyhandle : LSA_HANDLE, accountsid : super::super:: PSID, userrights : *const LSA_UNICODE_STRING, countofrights : u32) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn LsaCallAuthenticationPackage(lsahandle : super::super::super::Foundation:: HANDLE, authenticationpackage : u32, protocolsubmitbuffer : *const core::ffi::c_void, submitbufferlength : u32, protocolreturnbuffer : *mut *mut core::ffi::c_void, returnbufferlength : *mut u32, protocolstatus : *mut i32) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaClose(objecthandle : LSA_HANDLE) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn LsaConnectUntrusted(lsahandle : *mut super::super::super::Foundation:: HANDLE) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaCreateTrustedDomainEx(policyhandle : LSA_HANDLE, trusteddomaininformation : *const TRUSTED_DOMAIN_INFORMATION_EX, authenticationinformation : *const TRUSTED_DOMAIN_AUTH_INFORMATION, desiredaccess : u32, trusteddomainhandle : *mut LSA_HANDLE) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaDeleteTrustedDomain(policyhandle : LSA_HANDLE, trusteddomainsid : super::super:: PSID) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn LsaDeregisterLogonProcess(lsahandle : super::super::super::Foundation:: HANDLE) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaEnumerateAccountRights(policyhandle : LSA_HANDLE, accountsid : super::super:: PSID, userrights : *mut *mut LSA_UNICODE_STRING, countofrights : *mut u32) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaEnumerateAccountsWithUserRight(policyhandle : LSA_HANDLE, userright : *const LSA_UNICODE_STRING, buffer : *mut *mut core::ffi::c_void, countreturned : *mut u32) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn LsaEnumerateLogonSessions(logonsessioncount : *mut u32, logonsessionlist : *mut *mut super::super::super::Foundation:: LUID) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaEnumerateTrustedDomains(policyhandle : LSA_HANDLE, enumerationcontext : *mut u32, buffer : *mut *mut core::ffi::c_void, preferedmaximumlength : u32, countreturned : *mut u32) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaEnumerateTrustedDomainsEx(policyhandle : LSA_HANDLE, enumerationcontext : *mut u32, buffer : *mut *mut core::ffi::c_void, preferedmaximumlength : u32, countreturned : *mut u32) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaFreeMemory(buffer : *const core::ffi::c_void) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn LsaFreeReturnBuffer(buffer : *const core::ffi::c_void) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaGetAppliedCAPIDs(systemname : *const LSA_UNICODE_STRING, capids : *mut *mut super::super:: PSID, capidcount : *mut u32) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn LsaGetLogonSessionData(logonid : *const super::super::super::Foundation:: LUID, pplogonsessiondata : *mut *mut SECURITY_LOGON_SESSION_DATA) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn LsaLogonUser(lsahandle : super::super::super::Foundation:: HANDLE, originname : *const LSA_STRING, logontype : SECURITY_LOGON_TYPE, authenticationpackage : u32, authenticationinformation : *const core::ffi::c_void, authenticationinformationlength : u32, localgroups : *const super::super:: TOKEN_GROUPS, sourcecontext : *const super::super:: TOKEN_SOURCE, profilebuffer : *mut *mut core::ffi::c_void, profilebufferlength : *mut u32, logonid : *mut super::super::super::Foundation:: LUID, token : *mut super::super::super::Foundation:: HANDLE, quotas : *mut super::super:: QUOTA_LIMITS, substatus : *mut i32) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn LsaLookupAuthenticationPackage(lsahandle : super::super::super::Foundation:: HANDLE, packagename : *const LSA_STRING, authenticationpackage : *mut u32) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaLookupNames(policyhandle : LSA_HANDLE, count : u32, names : *const LSA_UNICODE_STRING, referenceddomains : *mut *mut LSA_REFERENCED_DOMAIN_LIST, sids : *mut *mut LSA_TRANSLATED_SID) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaLookupNames2(policyhandle : LSA_HANDLE, flags : u32, count : u32, names : *const LSA_UNICODE_STRING, referenceddomains : *mut *mut LSA_REFERENCED_DOMAIN_LIST, sids : *mut *mut LSA_TRANSLATED_SID2) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaLookupSids(policyhandle : LSA_HANDLE, count : u32, sids : *const super::super:: PSID, referenceddomains : *mut *mut LSA_REFERENCED_DOMAIN_LIST, names : *mut *mut LSA_TRANSLATED_NAME) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaLookupSids2(policyhandle : LSA_HANDLE, lookupoptions : u32, count : u32, sids : *const super::super:: PSID, referenceddomains : *mut *mut LSA_REFERENCED_DOMAIN_LIST, names : *mut *mut LSA_TRANSLATED_NAME) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaNtStatusToWinError(status : super::super::super::Foundation:: NTSTATUS) -> u32);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaOpenPolicy(systemname : *const LSA_UNICODE_STRING, objectattributes : *const LSA_OBJECT_ATTRIBUTES, desiredaccess : u32, policyhandle : *mut LSA_HANDLE) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaOpenTrustedDomainByName(policyhandle : LSA_HANDLE, trusteddomainname : *const LSA_UNICODE_STRING, desiredaccess : u32, trusteddomainhandle : *mut LSA_HANDLE) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaQueryCAPs(capids : *const super::super:: PSID, capidcount : u32, caps : *mut *mut CENTRAL_ACCESS_POLICY, capcount : *mut u32) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaQueryDomainInformationPolicy(policyhandle : LSA_HANDLE, informationclass : POLICY_DOMAIN_INFORMATION_CLASS, buffer : *mut *mut core::ffi::c_void) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaQueryForestTrustInformation(policyhandle : LSA_HANDLE, trusteddomainname : *const LSA_UNICODE_STRING, foresttrustinfo : *mut *mut LSA_FOREST_TRUST_INFORMATION) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaQueryForestTrustInformation2(policyhandle : LSA_HANDLE, trusteddomainname : *const LSA_UNICODE_STRING, highestrecordtype : LSA_FOREST_TRUST_RECORD_TYPE, foresttrustinfo : *mut *mut LSA_FOREST_TRUST_INFORMATION2) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaQueryInformationPolicy(policyhandle : LSA_HANDLE, informationclass : POLICY_INFORMATION_CLASS, buffer : *mut *mut core::ffi::c_void) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaQueryTrustedDomainInfo(policyhandle : LSA_HANDLE, trusteddomainsid : super::super:: PSID, informationclass : TRUSTED_INFORMATION_CLASS, buffer : *mut *mut core::ffi::c_void) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaQueryTrustedDomainInfoByName(policyhandle : LSA_HANDLE, trusteddomainname : *const LSA_UNICODE_STRING, informationclass : TRUSTED_INFORMATION_CLASS, buffer : *mut *mut core::ffi::c_void) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn LsaRegisterLogonProcess(logonprocessname : *const LSA_STRING, lsahandle : *mut super::super::super::Foundation:: HANDLE, securitymode : *mut u32) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn LsaRegisterPolicyChangeNotification(informationclass : POLICY_NOTIFICATION_INFORMATION_CLASS, notificationeventhandle : super::super::super::Foundation:: HANDLE) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaRemoveAccountRights(policyhandle : LSA_HANDLE, accountsid : super::super:: PSID, allrights : bool, userrights : *const LSA_UNICODE_STRING, countofrights : u32) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaRetrievePrivateData(policyhandle : LSA_HANDLE, keyname : *const LSA_UNICODE_STRING, privatedata : *mut *mut LSA_UNICODE_STRING) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaSetCAPs(capdns : *const LSA_UNICODE_STRING, capdncount : u32, flags : u32) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaSetDomainInformationPolicy(policyhandle : LSA_HANDLE, informationclass : POLICY_DOMAIN_INFORMATION_CLASS, buffer : *const core::ffi::c_void) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaSetForestTrustInformation(policyhandle : LSA_HANDLE, trusteddomainname : *const LSA_UNICODE_STRING, foresttrustinfo : *const LSA_FOREST_TRUST_INFORMATION, checkonly : bool, collisioninfo : *mut *mut LSA_FOREST_TRUST_COLLISION_INFORMATION) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaSetForestTrustInformation2(policyhandle : LSA_HANDLE, trusteddomainname : *const LSA_UNICODE_STRING, highestrecordtype : LSA_FOREST_TRUST_RECORD_TYPE, foresttrustinfo : *const LSA_FOREST_TRUST_INFORMATION2, checkonly : bool, collisioninfo : *mut *mut LSA_FOREST_TRUST_COLLISION_INFORMATION) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaSetInformationPolicy(policyhandle : LSA_HANDLE, informationclass : POLICY_INFORMATION_CLASS, buffer : *const core::ffi::c_void) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaSetTrustedDomainInfoByName(policyhandle : LSA_HANDLE, trusteddomainname : *const LSA_UNICODE_STRING, informationclass : TRUSTED_INFORMATION_CLASS, buffer : *const core::ffi::c_void) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaSetTrustedDomainInformation(policyhandle : LSA_HANDLE, trusteddomainsid : super::super:: PSID, informationclass : TRUSTED_INFORMATION_CLASS, buffer : *const core::ffi::c_void) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LsaStorePrivateData(policyhandle : LSA_HANDLE, keyname : *const LSA_UNICODE_STRING, privatedata : *const LSA_UNICODE_STRING) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn LsaUnregisterPolicyChangeNotification(informationclass : POLICY_NOTIFICATION_INFORMATION_CLASS, notificationeventhandle : super::super::super::Foundation:: HANDLE) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn MakeSignature(phcontext : *const super::super::Credentials:: SecHandle, fqop : u32, pmessage : *const SecBufferDesc, messageseqno : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn QueryContextAttributesA(phcontext : *const super::super::Credentials:: SecHandle, ulattribute : SECPKG_ATTR, pbuffer : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("sspicli.dll" "system" fn QueryContextAttributesExA(phcontext : *const super::super::Credentials:: SecHandle, ulattribute : SECPKG_ATTR, pbuffer : *mut core::ffi::c_void, cbbuffer : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("sspicli.dll" "system" fn QueryContextAttributesExW(phcontext : *const super::super::Credentials:: SecHandle, ulattribute : SECPKG_ATTR, pbuffer : *mut core::ffi::c_void, cbbuffer : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn QueryContextAttributesW(phcontext : *const super::super::Credentials:: SecHandle, ulattribute : SECPKG_ATTR, pbuffer : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn QueryCredentialsAttributesA(phcredential : *const super::super::Credentials:: SecHandle, ulattribute : u32, pbuffer : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("sspicli.dll" "system" fn QueryCredentialsAttributesExA(phcredential : *const super::super::Credentials:: SecHandle, ulattribute : u32, pbuffer : *mut core::ffi::c_void, cbbuffer : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("sspicli.dll" "system" fn QueryCredentialsAttributesExW(phcredential : *const super::super::Credentials:: SecHandle, ulattribute : u32, pbuffer : *mut core::ffi::c_void, cbbuffer : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn QueryCredentialsAttributesW(phcredential : *const super::super::Credentials:: SecHandle, ulattribute : u32, pbuffer : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn QuerySecurityContextToken(phcontext : *const super::super::Credentials:: SecHandle, token : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn QuerySecurityPackageInfoA(pszpackagename : windows_sys::core::PCSTR, pppackageinfo : *mut *mut SecPkgInfoA) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn QuerySecurityPackageInfoW(pszpackagename : windows_sys::core::PCWSTR, pppackageinfo : *mut *mut SecPkgInfoW) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn RevertSecurityContext(phcontext : *const super::super::Credentials:: SecHandle) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" "SystemFunction041" fn RtlDecryptMemory(memory : *mut core::ffi::c_void, memorysize : u32, optionflags : u32) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" "SystemFunction040" fn RtlEncryptMemory(memory : *mut core::ffi::c_void, memorysize : u32, optionflags : u32) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" "SystemFunction036" fn RtlGenRandom(randombuffer : *mut core::ffi::c_void, randombufferlength : u32) -> bool);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// windows_link::link!("slcext.dll" "system" fn SLAcquireGenuineTicket(ppticketblob : *mut *mut core::ffi::c_void, pcbticketblob : *mut u32, pwsztemplateid : windows_sys::core::PCWSTR, pwszserverurl : windows_sys::core::PCWSTR, pwszclienttoken : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// windows_link::link!("slcext.dll" "system" fn SLActivateProduct(hslc : *const core::ffi::c_void, pproductskuid : *const windows_sys::core::GUID, cbappspecificdata : u32, pvappspecificdata : *const core::ffi::c_void, pactivationinfo : *const SL_ACTIVATION_INFO_HEADER, pwszproxyserver : windows_sys::core::PCWSTR, wproxyport : u16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLClose(hslc : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLConsumeRight(hslc : *const core::ffi::c_void, pappid : *const windows_sys::core::GUID, pproductskuid : *const windows_sys::core::GUID, pwszrightname : windows_sys::core::PCWSTR, pvreserved : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLDepositOfflineConfirmationId(hslc : *const core::ffi::c_void, pproductskuid : *const windows_sys::core::GUID, pwszinstallationid : windows_sys::core::PCWSTR, pwszconfirmationid : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLDepositOfflineConfirmationIdEx(hslc : *const core::ffi::c_void, pproductskuid : *const windows_sys::core::GUID, pactivationinfo : *const SL_ACTIVATION_INFO_HEADER, pwszinstallationid : windows_sys::core::PCWSTR, pwszconfirmationid : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLFireEvent(hslc : *const core::ffi::c_void, pwszeventid : windows_sys::core::PCWSTR, papplicationid : *const windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLGenerateOfflineInstallationId(hslc : *const core::ffi::c_void, pproductskuid : *const windows_sys::core::GUID, ppwszinstallationid : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLGenerateOfflineInstallationIdEx(hslc : *const core::ffi::c_void, pproductskuid : *const windows_sys::core::GUID, pactivationinfo : *const SL_ACTIVATION_INFO_HEADER, ppwszinstallationid : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLGetApplicationInformation(hslc : *const core::ffi::c_void, papplicationid : *const windows_sys::core::GUID, pwszvaluename : windows_sys::core::PCWSTR, pedatatype : *mut SLDATATYPE, pcbvalue : *mut u32, ppbvalue : *mut *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLGetGenuineInformation(pqueryid : *const windows_sys::core::GUID, pwszvaluename : windows_sys::core::PCWSTR, pedatatype : *mut SLDATATYPE, pcbvalue : *mut u32, ppbvalue : *mut *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLGetInstalledProductKeyIds(hslc : *const core::ffi::c_void, pproductskuid : *const windows_sys::core::GUID, pnproductkeyids : *mut u32, ppproductkeyids : *mut *mut windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 162:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLGetLicense(hslc : *const core::ffi::c_void, plicensefileid : *const windows_sys::core::GUID, pcblicensefile : *mut u32, ppblicensefile : *mut *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLGetLicenseFileId(hslc : *const core::ffi::c_void, cblicenseblob : u32, pblicenseblob : *const u8, plicensefileid : *mut windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLGetLicenseInformation(hslc : *const core::ffi::c_void, psllicenseid : *const windows_sys::core::GUID, pwszvaluename : windows_sys::core::PCWSTR, pedatatype : *mut SLDATATYPE, pcbvalue : *mut u32, ppbvalue : *mut *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLGetLicensingStatusInformation(hslc : *const core::ffi::c_void, pappid : *const windows_sys::core::GUID, pproductskuid : *const windows_sys::core::GUID, pwszrightname : windows_sys::core::PCWSTR, pnstatuscount : *mut u32, pplicensingstatus : *mut *mut SL_LICENSING_STATUS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLGetPKeyId(hslc : *const core::ffi::c_void, pwszpkeyalgorithm : windows_sys::core::PCWSTR, pwszpkeystring : windows_sys::core::PCWSTR, cbpkeyspecificdata : u32, pbpkeyspecificdata : *const u8, ppkeyid : *mut windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLGetPKeyInformation(hslc : *const core::ffi::c_void, ppkeyid : *const windows_sys::core::GUID, pwszvaluename : windows_sys::core::PCWSTR, pedatatype : *mut SLDATATYPE, pcbvalue : *mut u32, ppbvalue : *mut *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLGetPolicyInformation(hslc : *const core::ffi::c_void, pwszvaluename : windows_sys::core::PCWSTR, pedatatype : *mut SLDATATYPE, pcbvalue : *mut u32, ppbvalue : *mut *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLGetPolicyInformationDWORD(hslc : *const core::ffi::c_void, pwszvaluename : windows_sys::core::PCWSTR, pdwvalue : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 170:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLGetProductSkuInformation(hslc : *const core::ffi::c_void, pproductskuid : *const windows_sys::core::GUID, pwszvaluename : windows_sys::core::PCWSTR, pedatatype : *mut SLDATATYPE, pcbvalue : *mut u32, ppbvalue : *mut *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// windows_link::link!("slcext.dll" "system" fn SLGetReferralInformation(hslc : *const core::ffi::c_void, ereferraltype : SLREFERRALTYPE, pskuorappid : *const windows_sys::core::GUID, pwszvaluename : windows_sys::core::PCWSTR, ppwszvalue : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 172:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLGetSLIDList(hslc : *const core::ffi::c_void, equeryidtype : SLIDTYPE, pqueryid : *const windows_sys::core::GUID, ereturnidtype : SLIDTYPE, pnreturnids : *mut u32, ppreturnids : *mut *mut windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// windows_link::link!("slcext.dll" "system" fn SLGetServerStatus(pwszserverurl : windows_sys::core::PCWSTR, pwszacquisitiontype : windows_sys::core::PCWSTR, pwszproxyserver : windows_sys::core::PCWSTR, wproxyport : u16, phrstatus : *mut windows_sys::core::HRESULT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 174:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLGetServiceInformation(hslc : *const core::ffi::c_void, pwszvaluename : windows_sys::core::PCWSTR, pedatatype : *mut SLDATATYPE, pcbvalue : *mut u32, ppbvalue : *mut *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLGetWindowsInformation(pwszvaluename : windows_sys::core::PCWSTR, pedatatype : *mut SLDATATYPE, pcbvalue : *mut u32, ppbvalue : *mut *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 176:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLGetWindowsInformationDWORD(pwszvaluename : windows_sys::core::PCWSTR, pdwvalue : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLInstallLicense(hslc : *const core::ffi::c_void, cblicenseblob : u32, pblicenseblob : *const u8, plicensefileid : *mut windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 178:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLInstallProofOfPurchase(hslc : *const core::ffi::c_void, pwszpkeyalgorithm : windows_sys::core::PCWSTR, pwszpkeystring : windows_sys::core::PCWSTR, cbpkeyspecificdata : u32, pbpkeyspecificdata : *const u8, ppkeyid : *mut windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// windows_link::link!("slwga.dll" "system" fn SLIsGenuineLocal(pappid : *const windows_sys::core::GUID, pgenuinestate : *mut SL_GENUINE_STATE, puioptions : *mut SL_NONGENUINE_UI_OPTIONS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLOpen(phslc : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-slapi-l1-1-0.dll" "system" fn SLQueryLicenseValueFromApp(valuename : windows_sys::core::PCWSTR, valuetype : *mut u32, databuffer : *mut core::ffi::c_void, datasize : u32, resultdatasize : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 182:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLRegisterEvent(hslc : *const core::ffi::c_void, pwszeventid : windows_sys::core::PCWSTR, papplicationid : *const windows_sys::core::GUID, hevent : super::super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLSetCurrentProductKey(hslc : *const core::ffi::c_void, pproductskuid : *const windows_sys::core::GUID, pproductkeyid : *const windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 184:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLSetGenuineInformation(pqueryid : *const windows_sys::core::GUID, pwszvaluename : windows_sys::core::PCWSTR, edatatype : SLDATATYPE, cbvalue : u32, pbvalue : *const u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLUninstallLicense(hslc : *const core::ffi::c_void, plicensefileid : *const windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 186:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLUninstallProofOfPurchase(hslc : *const core::ffi::c_void, ppkeyid : *const windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// windows_link::link!("slc.dll" "system" fn SLUnregisterEvent(hslc : *const core::ffi::c_void, pwszeventid : windows_sys::core::PCWSTR, papplicationid : *const windows_sys::core::GUID, hevent : super::super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn SaslAcceptSecurityContext(phcredential : *const super::super::Credentials:: SecHandle, phcontext : *const super::super::Credentials:: SecHandle, pinput : *const SecBufferDesc, fcontextreq : ASC_REQ_FLAGS, targetdatarep : u32, phnewcontext : *mut super::super::Credentials:: SecHandle, poutput : *mut SecBufferDesc, pfcontextattr : *mut u32, ptsexpiry : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 190:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SaslEnumerateProfilesA(profilelist : *mut windows_sys::core::PSTR, profilecount : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SaslEnumerateProfilesW(profilelist : *mut windows_sys::core::PWSTR, profilecount : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn SaslGetContextOption(contexthandle : *const super::super::Credentials:: SecHandle, option : u32, value : *mut core::ffi::c_void, size : u32, needed : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SaslGetProfilePackageA(profilename : windows_sys::core::PCSTR, packageinfo : *mut *mut SecPkgInfoA) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 195:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SaslGetProfilePackageW(profilename : windows_sys::core::PCWSTR, packageinfo : *mut *mut SecPkgInfoW) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SaslIdentifyPackageA(pinput : *const SecBufferDesc, packageinfo : *mut *mut SecPkgInfoA) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SaslIdentifyPackageW(pinput : *const SecBufferDesc, packageinfo : *mut *mut SecPkgInfoW) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn SaslInitializeSecurityContextA(phcredential : *const super::super::Credentials:: SecHandle, phcontext : *const super::super::Credentials:: SecHandle, psztargetname : windows_sys::core::PCSTR, fcontextreq : ISC_REQ_FLAGS, reserved1 : u32, targetdatarep : u32, pinput : *const SecBufferDesc, reserved2 : u32, phnewcontext : *mut super::super::Credentials:: SecHandle, poutput : *mut SecBufferDesc, pfcontextattr : *mut u32, ptsexpiry : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 200:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn SaslInitializeSecurityContextW(phcredential : *const super::super::Credentials:: SecHandle, phcontext : *const super::super::Credentials:: SecHandle, psztargetname : windows_sys::core::PCWSTR, fcontextreq : ISC_REQ_FLAGS, reserved1 : u32, targetdatarep : u32, pinput : *const SecBufferDesc, reserved2 : u32, phnewcontext : *mut super::super::Credentials:: SecHandle, poutput : *mut SecBufferDesc, pfcontextattr : *mut u32, ptsexpiry : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 202:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn SaslSetContextOption(contexthandle : *const super::super::Credentials:: SecHandle, option : u32, value : *const core::ffi::c_void, size : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// windows_link::link!("sas.dll" "system" fn SendSAS(asuser : windows_sys::core::BOOL));

// UNSUPPORTED Rust 205:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn SetContextAttributesA(phcontext : *const super::super::Credentials:: SecHandle, ulattribute : SECPKG_ATTR, pbuffer : *const core::ffi::c_void, cbbuffer : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 207:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn SetContextAttributesW(phcontext : *const super::super::Credentials:: SecHandle, ulattribute : SECPKG_ATTR, pbuffer : *const core::ffi::c_void, cbbuffer : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 209:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn SetCredentialsAttributesA(phcredential : *const super::super::Credentials:: SecHandle, ulattribute : u32, pbuffer : *const core::ffi::c_void, cbbuffer : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 211:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn SetCredentialsAttributesW(phcredential : *const super::super::Credentials:: SecHandle, ulattribute : u32, pbuffer : *const core::ffi::c_void, cbbuffer : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 213:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("schannel.dll" "system" fn SslCrackCertificate(pbcertificate : *mut u8, cbcertificate : u32, dwflags : u32, ppcertificate : *mut *mut X509Certificate) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 215:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("schannel.dll" "system" fn SslDeserializeCertificateStore(serializedcertificatestore : super::super::Cryptography:: CRYPT_INTEGER_BLOB, ppcertcontext : *mut *mut super::super::Cryptography:: CERT_CONTEXT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 217:1: declaration Macro has no candidate rule
// windows_link::link!("schannel.dll" "system" fn SslEmptyCacheA(psztargetname : windows_sys::core::PCSTR, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 218:1: declaration Macro has no candidate rule
// windows_link::link!("schannel.dll" "system" fn SslEmptyCacheW(psztargetname : windows_sys::core::PCWSTR, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 219:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("schannel.dll" "system" fn SslFreeCertificate(pcertificate : *mut X509Certificate));

// UNSUPPORTED Rust 221:1: declaration Macro has no candidate rule
// windows_link::link!("schannel.dll" "system" fn SslGenerateRandomBits(prandomdata : *mut u8, crandomdata : i32));

// UNSUPPORTED Rust 222:1: declaration Macro has no candidate rule
// windows_link::link!("schannel.dll" "system" fn SslGetExtensions(clienthello : *const u8, clienthellobytesize : u32, genericextensions : *mut SCH_EXTENSION_DATA, genericextensionscount : u8, bytestoread : *mut u32, flags : SchGetExtensionsOptions) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 223:1: declaration Macro has no candidate rule
// windows_link::link!("schannel.dll" "system" fn SslGetMaximumKeySize(reserved : u32) -> u32);

// UNSUPPORTED Rust 224:1: declaration Macro has no candidate rule
// windows_link::link!("schannel.dll" "system" fn SslGetServerIdentity(clienthello : *const u8, clienthellosize : u32, serveridentity : *mut *mut u8, serveridentitysize : *mut u32, flags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 225:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SspiCompareAuthIdentities(authidentity1 : *const core::ffi::c_void, authidentity2 : *const core::ffi::c_void, samesupplieduser : *mut bool, samesuppliedidentity : *mut bool) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 226:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SspiCopyAuthIdentity(authdata : *const core::ffi::c_void, authdatacopy : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 227:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SspiDecryptAuthIdentity(encryptedauthdata : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 228:1: declaration Macro has no candidate rule
// windows_link::link!("sspicli.dll" "system" fn SspiDecryptAuthIdentityEx(options : u32, encryptedauthdata : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 229:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SspiEncodeAuthIdentityAsStrings(pauthidentity : *const core::ffi::c_void, ppszusername : *mut windows_sys::core::PCWSTR, ppszdomainname : *mut windows_sys::core::PCWSTR, ppszpackedcredentialsstring : *mut windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 230:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SspiEncodeStringsAsAuthIdentity(pszusername : windows_sys::core::PCWSTR, pszdomainname : windows_sys::core::PCWSTR, pszpackedcredentialsstring : windows_sys::core::PCWSTR, ppauthidentity : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 231:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SspiEncryptAuthIdentity(authdata : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 232:1: declaration Macro has no candidate rule
// windows_link::link!("sspicli.dll" "system" fn SspiEncryptAuthIdentityEx(options : u32, authdata : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 233:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SspiExcludePackage(authidentity : *const core::ffi::c_void, pszpackagename : windows_sys::core::PCWSTR, ppnewauthidentity : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 234:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SspiFreeAuthIdentity(authdata : *const core::ffi::c_void));

// UNSUPPORTED Rust 235:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SspiGetTargetHostName(psztargetname : windows_sys::core::PCWSTR, pszhostname : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 236:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SspiIsAuthIdentityEncrypted(encryptedauthdata : *const core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 237:1: declaration Macro has no candidate rule
// windows_link::link!("credui.dll" "system" fn SspiIsPromptingNeeded(errororntstatus : u32) -> bool);

// UNSUPPORTED Rust 238:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SspiLocalFree(databuffer : *const core::ffi::c_void));

// UNSUPPORTED Rust 239:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SspiMarshalAuthIdentity(authidentity : *const core::ffi::c_void, authidentitylength : *mut u32, authidentitybytearray : *mut *mut i8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 240:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SspiPrepareForCredRead(authidentity : *const core::ffi::c_void, psztargetname : windows_sys::core::PCWSTR, pcredmancredentialtype : *mut u32, ppszcredmantargetname : *mut windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 241:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SspiPrepareForCredWrite(authidentity : *const core::ffi::c_void, psztargetname : windows_sys::core::PCWSTR, pcredmancredentialtype : *mut u32, ppszcredmantargetname : *mut windows_sys::core::PCWSTR, ppszcredmanusername : *mut windows_sys::core::PCWSTR, ppcredentialblob : *mut *mut u8, pcredentialblobsize : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 242:1: declaration Macro has no candidate rule
// windows_link::link!("credui.dll" "system" fn SspiPromptForCredentialsA(psztargetname : windows_sys::core::PCSTR, puiinfo : *const core::ffi::c_void, dwautherror : u32, pszpackage : windows_sys::core::PCSTR, pinputauthidentity : *const core::ffi::c_void, ppauthidentity : *mut *mut core::ffi::c_void, pfsave : *mut i32, dwflags : u32) -> u32);

// UNSUPPORTED Rust 243:1: declaration Macro has no candidate rule
// windows_link::link!("credui.dll" "system" fn SspiPromptForCredentialsW(psztargetname : windows_sys::core::PCWSTR, puiinfo : *const core::ffi::c_void, dwautherror : u32, pszpackage : windows_sys::core::PCWSTR, pinputauthidentity : *const core::ffi::c_void, ppauthidentity : *mut *mut core::ffi::c_void, pfsave : *mut i32, dwflags : u32) -> u32);

// UNSUPPORTED Rust 244:1: declaration Macro has no candidate rule
// windows_link::link!("sspicli.dll" "system" fn SspiSetChannelBindingFlags(pbindings : *mut SecPkgContext_Bindings, flags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 245:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SspiUnmarshalAuthIdentity(authidentitylength : u32, authidentitybytearray : windows_sys::core::PCSTR, ppauthidentity : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 246:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SspiValidateAuthIdentity(authdata : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 247:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SspiZeroAuthIdentity(authdata : *const core::ffi::c_void));

// UNSUPPORTED Rust 248:1: declaration Macro has no candidate rule
// windows_link::link!("tokenbinding.dll" "system" fn TokenBindingDeleteAllBindings() -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 249:1: declaration Macro has no candidate rule
// windows_link::link!("tokenbinding.dll" "system" fn TokenBindingDeleteBinding(targeturl : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 250:1: declaration Macro has no candidate rule
// windows_link::link!("tokenbinding.dll" "system" fn TokenBindingGenerateBinding(keytype : TOKENBINDING_KEY_PARAMETERS_TYPE, targeturl : windows_sys::core::PCWSTR, bindingtype : TOKENBINDING_TYPE, tlsekm : *const core::ffi::c_void, tlsekmsize : u32, extensionformat : TOKENBINDING_EXTENSION_FORMAT, extensiondata : *const core::ffi::c_void, tokenbinding : *mut *mut core::ffi::c_void, tokenbindingsize : *mut u32, resultdata : *mut *mut TOKENBINDING_RESULT_DATA) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 251:1: declaration Macro has no candidate rule
// windows_link::link!("tokenbinding.dll" "system" fn TokenBindingGenerateID(keytype : TOKENBINDING_KEY_PARAMETERS_TYPE, publickey : *const core::ffi::c_void, publickeysize : u32, resultdata : *mut *mut TOKENBINDING_RESULT_DATA) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 252:1: declaration Macro has no candidate rule
// windows_link::link!("tokenbinding.dll" "system" fn TokenBindingGenerateIDForUri(keytype : TOKENBINDING_KEY_PARAMETERS_TYPE, targeturi : windows_sys::core::PCWSTR, resultdata : *mut *mut TOKENBINDING_RESULT_DATA) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 253:1: declaration Macro has no candidate rule
// windows_link::link!("tokenbinding.dll" "system" fn TokenBindingGenerateMessage(tokenbindings : *const *const core::ffi::c_void, tokenbindingssize : *const u32, tokenbindingscount : u32, tokenbindingmessage : *mut *mut core::ffi::c_void, tokenbindingmessagesize : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 254:1: declaration Macro has no candidate rule
// windows_link::link!("tokenbinding.dll" "system" fn TokenBindingGetHighestSupportedVersion(majorversion : *mut u8, minorversion : *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 255:1: declaration Macro has no candidate rule
// windows_link::link!("tokenbinding.dll" "system" fn TokenBindingGetKeyTypesClient(keytypes : *mut *mut TOKENBINDING_KEY_TYPES) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 256:1: declaration Macro has no candidate rule
// windows_link::link!("tokenbinding.dll" "system" fn TokenBindingGetKeyTypesServer(keytypes : *mut *mut TOKENBINDING_KEY_TYPES) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 257:1: declaration Macro has no candidate rule
// windows_link::link!("tokenbinding.dll" "system" fn TokenBindingVerifyMessage(tokenbindingmessage : *const core::ffi::c_void, tokenbindingmessagesize : u32, keytype : TOKENBINDING_KEY_PARAMETERS_TYPE, tlsekm : *const core::ffi::c_void, tlsekmsize : u32, resultlist : *mut *mut TOKENBINDING_RESULT_LIST) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 258:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn TranslateNameA(lpaccountname : windows_sys::core::PCSTR, accountnameformat : EXTENDED_NAME_FORMAT, desirednameformat : EXTENDED_NAME_FORMAT, lptranslatedname : windows_sys::core::PSTR, nsize : *mut u32) -> bool);

// UNSUPPORTED Rust 259:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn TranslateNameW(lpaccountname : windows_sys::core::PCWSTR, accountnameformat : EXTENDED_NAME_FORMAT, desirednameformat : EXTENDED_NAME_FORMAT, lptranslatedname : windows_sys::core::PWSTR, nsize : *mut u32) -> bool);

// UNSUPPORTED Rust 260:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// windows_link::link!("secur32.dll" "system" fn VerifySignature(phcontext : *const super::super::Credentials:: SecHandle, pmessage : *const SecBufferDesc, messageseqno : u32, pfqop : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 262:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type ACCEPT_SECURITY_CONTEXT_FN = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: *mut super::super::Credentials::SecHandle, param2: *mut SecBufferDesc, param3: u32, param4: u32, param5: *mut super::super::Credentials::SecHandle, param6: *mut SecBufferDesc, param7: *mut u32, param8: *mut i64) -> windows_sys::core::HRESULT>;

public const val `ACCOUNT_ADJUST_PRIVILEGES`: Int = 2;
public const val `ACCOUNT_ADJUST_QUOTAS`: Int = 4;
public const val `ACCOUNT_ADJUST_SYSTEM_ACCESS`: Int = 8;
public const val `ACCOUNT_VIEW`: Int = 1;
// UNSUPPORTED Rust 268:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type ACQUIRE_CREDENTIALS_HANDLE_FN_A = Option<unsafe extern "system" fn(param0: *mut i8, param1: *mut i8, param2: u32, param3: *mut core::ffi::c_void, param4: *mut core::ffi::c_void, param5: SEC_GET_KEY_FN, param6: *mut core::ffi::c_void, param7: *mut super::super::Credentials::SecHandle, param8: *mut i64) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 270:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type ACQUIRE_CREDENTIALS_HANDLE_FN_W = Option<unsafe extern "system" fn(param0: *mut u16, param1: *mut u16, param2: u32, param3: *mut core::ffi::c_void, param4: *mut core::ffi::c_void, param5: SEC_GET_KEY_FN, param6: *mut core::ffi::c_void, param7: *mut super::super::Credentials::SecHandle, param8: *mut i64) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 272:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type ADD_CREDENTIALS_FN_A = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: *mut i8, param2: *mut i8, param3: u32, param4: *mut core::ffi::c_void, param5: SEC_GET_KEY_FN, param6: *mut core::ffi::c_void, param7: *mut i64) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 274:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type ADD_CREDENTIALS_FN_W = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: *mut u16, param2: *mut u16, param3: u32, param4: *mut core::ffi::c_void, param5: SEC_GET_KEY_FN, param6: *mut core::ffi::c_void, param7: *mut i64) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 276:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type APPLY_CONTROL_TOKEN_FN = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: *mut SecBufferDesc) -> windows_sys::core::HRESULT>;

public const val `ASC_REQ_ALLOCATE_MEMORY`: `ASC_REQ_FLAGS` = 256u;
public const val `ASC_REQ_ALLOW_CONTEXT_REPLAY`: `ASC_REQ_FLAGS` = 4194304u;
public const val `ASC_REQ_ALLOW_MISSING_BINDINGS`: `ASC_REQ_FLAGS` = 268435456u;
public const val `ASC_REQ_ALLOW_NON_USER_LOGONS`: `ASC_REQ_FLAGS` = 2097152u;
public const val `ASC_REQ_ALLOW_NULL_SESSION`: `ASC_REQ_FLAGS` = 1048576u;
public const val `ASC_REQ_CALL_LEVEL`: `ASC_REQ_FLAGS` = 4096u;
public const val `ASC_REQ_CONFIDENTIALITY`: `ASC_REQ_FLAGS` = 16u;
public const val `ASC_REQ_CONNECTION`: `ASC_REQ_FLAGS` = 2048u;
public const val `ASC_REQ_DATAGRAM`: `ASC_REQ_FLAGS` = 1024u;
public const val `ASC_REQ_DELEGATE`: `ASC_REQ_FLAGS` = 1u;
public const val `ASC_REQ_EXTENDED_ERROR`: `ASC_REQ_FLAGS` = 32768u;
public typealias `ASC_REQ_FLAGS` = UInt;
public const val `ASC_REQ_FRAGMENT_SUPPLIED`: `ASC_REQ_FLAGS` = 8192u;
public const val `ASC_REQ_FRAGMENT_TO_FIT`: `ASC_REQ_FLAGS` = 8388608u;
public typealias `ASC_REQ_HIGH_FLAGS` = ULong;
public const val `ASC_REQ_IDENTIFY`: `ASC_REQ_FLAGS` = 524288u;
public const val `ASC_REQ_INTEGRITY`: `ASC_REQ_FLAGS` = 131072u;
public const val `ASC_REQ_LICENSING`: `ASC_REQ_FLAGS` = 262144u;
public const val `ASC_REQ_MESSAGES`: `ASC_REQ_HIGH_FLAGS` = 4294967296uL;
public const val `ASC_REQ_MUTUAL_AUTH`: `ASC_REQ_FLAGS` = 2u;
public const val `ASC_REQ_NO_TOKEN`: `ASC_REQ_FLAGS` = 16777216u;
public const val `ASC_REQ_PROXY_BINDINGS`: `ASC_REQ_FLAGS` = 67108864u;
public const val `ASC_REQ_REPLAY_DETECT`: `ASC_REQ_FLAGS` = 4u;
public const val `ASC_REQ_SEQUENCE_DETECT`: `ASC_REQ_FLAGS` = 8u;
public const val `ASC_REQ_SESSION_TICKET`: `ASC_REQ_FLAGS` = 64u;
public const val `ASC_REQ_STREAM`: `ASC_REQ_FLAGS` = 65536u;
public const val `ASC_REQ_USE_DCE_STYLE`: `ASC_REQ_FLAGS` = 512u;
public const val `ASC_REQ_USE_SESSION_KEY`: `ASC_REQ_FLAGS` = 32u;
public const val `ASC_RET_ALLOCATED_MEMORY`: UInt = 256u;
public const val `ASC_RET_ALLOW_CONTEXT_REPLAY`: UInt = 4194304u;
public const val `ASC_RET_ALLOW_NON_USER_LOGONS`: UInt = 2097152u;
public const val `ASC_RET_CALL_LEVEL`: UInt = 8192u;
public const val `ASC_RET_CONFIDENTIALITY`: UInt = 16u;
public const val `ASC_RET_CONNECTION`: UInt = 2048u;
public const val `ASC_RET_DATAGRAM`: UInt = 1024u;
public const val `ASC_RET_DELEGATE`: UInt = 1u;
public const val `ASC_RET_EXTENDED_ERROR`: UInt = 32768u;
public const val `ASC_RET_FRAGMENT_ONLY`: UInt = 8388608u;
public const val `ASC_RET_IDENTIFY`: UInt = 524288u;
public const val `ASC_RET_INTEGRITY`: UInt = 131072u;
public const val `ASC_RET_LICENSING`: UInt = 262144u;
public const val `ASC_RET_MESSAGES`: ULong = 4294967296uL;
public const val `ASC_RET_MUTUAL_AUTH`: UInt = 2u;
public const val `ASC_RET_NO_ADDITIONAL_TOKEN`: UInt = 33554432u;
public const val `ASC_RET_NO_TOKEN`: UInt = 16777216u;
public const val `ASC_RET_NULL_SESSION`: UInt = 1048576u;
public const val `ASC_RET_REPLAY_DETECT`: UInt = 4u;
public const val `ASC_RET_SEQUENCE_DETECT`: UInt = 8u;
public const val `ASC_RET_SESSION_TICKET`: UInt = 64u;
public const val `ASC_RET_STREAM`: UInt = 65536u;
public const val `ASC_RET_THIRD_LEG_FAILED`: UInt = 16384u;
public const val `ASC_RET_USED_DCE_STYLE`: UInt = 512u;
public const val `ASC_RET_USE_SESSION_KEY`: UInt = 32u;
public const val `AUDIT_ENUMERATE_USERS`: UInt = 16u;
// UNSUPPORTED Rust 332:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AUDIT_POLICY_INFORMATION {
//     pub AuditSubCategoryGuid: windows_sys::core::GUID,
//     pub AuditingInformation: u32,
//     pub AuditCategoryGuid: windows_sys::core::GUID,
// }

public const val `AUDIT_QUERY_MISC_POLICY`: UInt = 64u;
public const val `AUDIT_QUERY_SYSTEM_POLICY`: UInt = 2u;
public const val `AUDIT_QUERY_USER_POLICY`: UInt = 8u;
public const val `AUDIT_SET_MISC_POLICY`: UInt = 32u;
public const val `AUDIT_SET_SYSTEM_POLICY`: UInt = 1u;
public const val `AUDIT_SET_USER_POLICY`: UInt = 4u;
public const val `AUTH_REQ_ALLOW_ENC_TKT_IN_SKEY`: UInt = 32u;
public const val `AUTH_REQ_ALLOW_FORWARDABLE`: UInt = 1u;
public const val `AUTH_REQ_ALLOW_NOADDRESS`: UInt = 16u;
public const val `AUTH_REQ_ALLOW_POSTDATE`: UInt = 4u;
public const val `AUTH_REQ_ALLOW_PROXIABLE`: UInt = 2u;
public const val `AUTH_REQ_ALLOW_RENEWABLE`: UInt = 8u;
public const val `AUTH_REQ_ALLOW_S4U_DELEGATE`: UInt = 2048u;
public const val `AUTH_REQ_ALLOW_VALIDATE`: UInt = 64u;
public const val `AUTH_REQ_OK_AS_DELEGATE`: UInt = 256u;
public const val `AUTH_REQ_PREAUTH_REQUIRED`: UInt = 512u;
public const val `AUTH_REQ_TRANSITIVE_TRUST`: UInt = 1024u;
public const val `AUTH_REQ_VALIDATE_CLIENT`: UInt = 128u;
public const val `AccountDomainInformation`: `LSA_LOOKUP_DOMAIN_INFO_CLASS` = 5;
public const val `AuditCategoryAccountLogon`: `POLICY_AUDIT_EVENT_TYPE` = 8;
public const val `AuditCategoryAccountManagement`: `POLICY_AUDIT_EVENT_TYPE` = 6;
public const val `AuditCategoryDetailedTracking`: `POLICY_AUDIT_EVENT_TYPE` = 4;
public const val `AuditCategoryDirectoryServiceAccess`: `POLICY_AUDIT_EVENT_TYPE` = 7;
public const val `AuditCategoryLogon`: `POLICY_AUDIT_EVENT_TYPE` = 1;
public const val `AuditCategoryObjectAccess`: `POLICY_AUDIT_EVENT_TYPE` = 2;
public const val `AuditCategoryPolicyChange`: `POLICY_AUDIT_EVENT_TYPE` = 5;
public const val `AuditCategoryPrivilegeUse`: `POLICY_AUDIT_EVENT_TYPE` = 3;
public const val `AuditCategorySystem`: `POLICY_AUDIT_EVENT_TYPE` = 0;
// UNSUPPORTED Rust 367:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_AccountLogon: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x69979850_797a_11d9_bed3_505054503030);

// UNSUPPORTED Rust 368:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_AccountLogon_CredentialValidation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce923f_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 369:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_AccountLogon_KerbCredentialValidation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9242_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 370:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_AccountLogon_Kerberos: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9240_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 371:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_AccountLogon_Others: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9241_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 372:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_AccountManagement: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6997984e_797a_11d9_bed3_505054503030);

// UNSUPPORTED Rust 373:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_AccountManagement_ApplicationGroup: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9239_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 374:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_AccountManagement_ComputerAccount: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9236_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 375:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_AccountManagement_DistributionGroup: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9238_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 376:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_AccountManagement_Others: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce923a_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 377:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_AccountManagement_SecurityGroup: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9237_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 378:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_AccountManagement_UserAccount: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9235_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 379:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_DSAccess_DSAccess: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce923b_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 380:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_DetailedTracking: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6997984c_797a_11d9_bed3_505054503030);

// UNSUPPORTED Rust 381:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_DetailedTracking_DpapiActivity: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce922d_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 382:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_DetailedTracking_PnpActivity: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9248_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 383:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_DetailedTracking_ProcessCreation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce922b_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 384:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_DetailedTracking_ProcessTermination: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce922c_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 385:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_DetailedTracking_RpcCall: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce922e_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 386:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_DetailedTracking_TokenRightAdjusted: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce924a_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 387:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_DirectoryServiceAccess: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6997984f_797a_11d9_bed3_505054503030);

// UNSUPPORTED Rust 388:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_DsAccess_AdAuditChanges: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce923c_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 389:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_Ds_DetailedReplication: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce923e_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 390:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_Ds_Replication: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce923d_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 391:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_Logon: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x69979849_797a_11d9_bed3_505054503030);

// UNSUPPORTED Rust 392:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_Logon_AccountLockout: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9217_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 393:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_Logon_Claims: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9247_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 394:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_Logon_Groups: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9249_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 395:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_Logon_IPSecMainMode: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9218_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 396:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_Logon_IPSecQuickMode: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9219_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 397:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_Logon_IPSecUserMode: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce921a_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 398:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_Logon_Logoff: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9216_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 399:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_Logon_Logon: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9215_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 400:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_Logon_NPS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9243_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 401:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_Logon_Others: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce921c_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 402:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_Logon_SpecialLogon: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce921b_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 403:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_ObjectAccess: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6997984a_797a_11d9_bed3_505054503030);

// UNSUPPORTED Rust 404:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_ObjectAccess_ApplicationGenerated: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9222_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 405:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_ObjectAccess_CbacStaging: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9246_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 406:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_ObjectAccess_CertificationServices: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9221_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 407:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_ObjectAccess_DetailedFileShare: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9244_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 408:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_ObjectAccess_FileSystem: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce921d_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 409:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_ObjectAccess_FirewallConnection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9226_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 410:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_ObjectAccess_FirewallPacketDrops: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9225_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 411:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_ObjectAccess_Handle: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9223_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 412:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_ObjectAccess_Kernel: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce921f_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 413:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_ObjectAccess_Other: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9227_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 414:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_ObjectAccess_Registry: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce921e_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 415:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_ObjectAccess_RemovableStorage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9245_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 416:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_ObjectAccess_Sam: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9220_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 417:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_ObjectAccess_Share: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9224_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 418:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_PolicyChange: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6997984d_797a_11d9_bed3_505054503030);

// UNSUPPORTED Rust 419:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_PolicyChange_AuditPolicy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce922f_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 420:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_PolicyChange_AuthenticationPolicy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9230_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 421:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_PolicyChange_AuthorizationPolicy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9231_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 422:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_PolicyChange_MpsscvRulePolicy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9232_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 423:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_PolicyChange_Others: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9234_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 424:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_PolicyChange_WfpIPSecPolicy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9233_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 425:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_PrivilegeUse: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6997984b_797a_11d9_bed3_505054503030);

// UNSUPPORTED Rust 426:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_PrivilegeUse_NonSensitive: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9229_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 427:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_PrivilegeUse_Others: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce922a_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 428:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_PrivilegeUse_Sensitive: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9228_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 429:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_System: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x69979848_797a_11d9_bed3_505054503030);

// UNSUPPORTED Rust 430:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_System_IPSecDriverEvents: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9213_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 431:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_System_Integrity: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9212_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 432:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_System_Others: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9214_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 433:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_System_SecurityStateChange: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9210_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 434:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Audit_System_SecuritySubsystemExtension: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9211_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 435:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CENTRAL_ACCESS_POLICY {
//     pub CAPID: super::super::PSID,
//     pub Name: LSA_UNICODE_STRING,
//     pub Description: LSA_UNICODE_STRING,
//     pub ChangeId: LSA_UNICODE_STRING,
//     pub Flags: u32,
//     pub CAPECount: u32,
//     pub CAPEs: *mut *mut CENTRAL_ACCESS_POLICY_ENTRY,
// }

// UNSUPPORTED Rust 446:1: declaration Impl has no candidate rule
// impl Default for CENTRAL_ACCESS_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 451:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CENTRAL_ACCESS_POLICY_ENTRY {
//     pub Name: LSA_UNICODE_STRING,
//     pub Description: LSA_UNICODE_STRING,
//     pub ChangeId: LSA_UNICODE_STRING,
//     pub LengthAppliesTo: u32,
//     pub AppliesTo: *mut u8,
//     pub LengthSD: u32,
//     pub SD: super::super::PSECURITY_DESCRIPTOR,
//     pub LengthStagedSD: u32,
//     pub StagedSD: super::super::PSECURITY_DESCRIPTOR,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 465:1: declaration Impl has no candidate rule
// impl Default for CENTRAL_ACCESS_POLICY_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CENTRAL_ACCESS_POLICY_OWNER_RIGHTS_PRESENT_FLAG`: UInt = 1u;
public const val `CENTRAL_ACCESS_POLICY_STAGED_FLAG`: UInt = 65536u;
public const val `CENTRAL_ACCESS_POLICY_STAGED_OWNER_RIGHTS_PRESENT_FLAG`: UInt = 256u;
// UNSUPPORTED Rust 473:1: generic scalar type unsupported
// pub type CHANGE_PASSWORD_FN_A = Option<unsafe extern "system" fn(param0: *mut i8, param1: *mut i8, param2: *mut i8, param3: *mut i8, param4: *mut i8, param5: bool, param6: u32, param7: *mut SecBufferDesc) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 474:1: generic scalar type unsupported
// pub type CHANGE_PASSWORD_FN_W = Option<unsafe extern "system" fn(param0: *mut u16, param1: *mut u16, param2: *mut u16, param3: *mut u16, param4: *mut u16, param5: bool, param6: u32, param7: *mut SecBufferDesc) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 475:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLEAR_BLOCK {
//     pub data: [i8; 8],
// }

// UNSUPPORTED Rust 480:1: declaration Impl has no candidate rule
// impl Default for CLEAR_BLOCK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLEAR_BLOCK_LENGTH`: UInt = 8u;
// UNSUPPORTED Rust 486:1: non-scalar type Ptr unsupported
// pub const CLOUDAP_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CloudAP");

// UNSUPPORTED Rust 487:1: non-scalar type Ptr unsupported
// pub const CLOUDAP_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("CloudAP");

// UNSUPPORTED Rust 488:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type COMPLETE_AUTH_TOKEN_FN = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: *mut SecBufferDesc) -> windows_sys::core::HRESULT>;

public const val `CREDP_FLAGS_CLEAR_PASSWORD`: UInt = 8u;
public const val `CREDP_FLAGS_DONT_CACHE_TI`: UInt = 4u;
public const val `CREDP_FLAGS_IN_PROCESS`: UInt = 1u;
public const val `CREDP_FLAGS_TRUSTED_CALLER`: UInt = 32u;
public const val `CREDP_FLAGS_USER_ENCRYPTED_PASSWORD`: UInt = 16u;
public const val `CREDP_FLAGS_USE_MIDL_HEAP`: UInt = 2u;
public const val `CREDP_FLAGS_VALIDATE_PROXY_TARGET`: UInt = 64u;
public typealias `CRED_FETCH` = Int;
public const val `CRED_MARSHALED_TI_SIZE_SIZE`: UInt = 12u;
// UNSUPPORTED Rust 499:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPTO_SETTINGS {
//     pub eAlgorithmUsage: eTlsAlgorithmUsage,
//     pub strCngAlgId: LSA_UNICODE_STRING,
//     pub cChainingModes: u32,
//     pub rgstrChainingModes: *mut LSA_UNICODE_STRING,
//     pub dwMinBitLength: u32,
//     pub dwMaxBitLength: u32,
// }

// UNSUPPORTED Rust 509:1: declaration Impl has no candidate rule
// impl Default for CRYPTO_SETTINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CYPHER_BLOCK_LENGTH`: UInt = 8u;
public const val `CertHashInfo`: `KERB_CERTIFICATE_INFO_TYPE` = 1;
// UNSUPPORTED Rust 516:1: non-scalar type Ptr unsupported
// pub const ClOUDAP_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("CloudAP");

public const val `CollisionOther`: `LSA_FOREST_TRUST_COLLISION_RECORD_TYPE` = 2;
public const val `CollisionTdo`: `LSA_FOREST_TRUST_COLLISION_RECORD_TYPE` = 0;
public const val `CollisionXref`: `LSA_FOREST_TRUST_COLLISION_RECORD_TYPE` = 1;
public const val `CredFetchDPAPI`: `CRED_FETCH` = 1;
public const val `CredFetchDefault`: `CRED_FETCH` = 0;
public const val `CredFetchForced`: `CRED_FETCH` = 2;
// UNSUPPORTED Rust 523:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type CredFreeCredentialsFn = Option<unsafe extern "system" fn(count: u32, credentials: *mut *mut ENCRYPTED_CREDENTIALW)>;

// UNSUPPORTED Rust 525:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type CredReadDomainCredentialsFn = Option<unsafe extern "system" fn(logonid: *const super::super::super::Foundation::LUID, credflags: u32, targetinfo: *const super::super::Credentials::CREDENTIAL_TARGET_INFORMATIONW, flags: u32, count: *mut u32, credential: *mut *mut *mut ENCRYPTED_CREDENTIALW) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 527:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type CredReadFn = Option<unsafe extern "system" fn(logonid: *const super::super::super::Foundation::LUID, credflags: u32, targetname: windows_sys::core::PCWSTR, r#type: u32, flags: u32, credential: *mut *mut ENCRYPTED_CREDENTIALW) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 529:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type CredWriteFn = Option<unsafe extern "system" fn(logonid: *const super::super::super::Foundation::LUID, credflags: u32, credential: *const ENCRYPTED_CREDENTIALW, flags: u32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 531:1: generic scalar type unsupported
// pub type CrediUnmarshalandDecodeStringFn = Option<unsafe extern "system" fn(marshaledstring: windows_sys::core::PCWSTR, blob: *mut *mut u8, blobsize: *mut u32, isfailurefatal: *mut u8) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 532:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type DECRYPT_MESSAGE_FN = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: *mut SecBufferDesc, param2: u32, param3: *mut u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 534:1: non-scalar type Ptr unsupported
// pub const DEFAULT_TLS_SSP_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Default TLS SSP");

// UNSUPPORTED Rust 535:1: non-scalar type Ptr unsupported
// pub const DEFAULT_TLS_SSP_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("Default TLS SSP");

// UNSUPPORTED Rust 536:1: non-scalar type Ptr unsupported
// pub const DEFAULT_TLS_SSP_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Default TLS SSP");

// UNSUPPORTED Rust 537:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type DELETE_SECURITY_CONTEXT_FN = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle) -> windows_sys::core::HRESULT>;

public const val `DOMAIN_LOCKOUT_ADMINS`: `DOMAIN_PASSWORD_PROPERTIES` = 8u;
public const val `DOMAIN_NO_LM_OWF_CHANGE`: Int = 64;
public const val `DOMAIN_PASSWORD_COMPLEX`: `DOMAIN_PASSWORD_PROPERTIES` = 1u;
// UNSUPPORTED Rust 542:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOMAIN_PASSWORD_INFORMATION {
//     pub MinPasswordLength: u16,
//     pub PasswordHistoryLength: u16,
//     pub PasswordProperties: DOMAIN_PASSWORD_PROPERTIES,
//     pub MaxPasswordAge: i64,
//     pub MinPasswordAge: i64,
// }

public const val `DOMAIN_PASSWORD_NO_ANON_CHANGE`: `DOMAIN_PASSWORD_PROPERTIES` = 2u;
public const val `DOMAIN_PASSWORD_NO_CLEAR_CHANGE`: `DOMAIN_PASSWORD_PROPERTIES` = 4u;
public typealias `DOMAIN_PASSWORD_PROPERTIES` = UInt;
public const val `DOMAIN_PASSWORD_STORE_CLEARTEXT`: `DOMAIN_PASSWORD_PROPERTIES` = 16u;
public const val `DOMAIN_REFUSE_PASSWORD_CHANGE`: `DOMAIN_PASSWORD_PROPERTIES` = 32u;
public const val `DS_INET_ADDRESS`: `KERB_ADDRESS_TYPE` = 1u;
public const val `DS_NETBIOS_ADDRESS`: `KERB_ADDRESS_TYPE` = 2u;
public const val `DS_UNKNOWN_ADDRESS_TYPE`: UInt = 0u;
public const val `DeprecatedIUMCredKey`: `MSV1_0_CREDENTIAL_KEY_TYPE` = 1;
public const val `DnsDomainInformation`: `LSA_LOOKUP_DOMAIN_INFO_CLASS` = 12;
public const val `DomainUserCredKey`: `MSV1_0_CREDENTIAL_KEY_TYPE` = 2;
public const val `ENABLE_TLS_CLIENT_EARLY_START`: UInt = 1u;
// UNSUPPORTED Rust 563:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Credentials")]
// #[derive(Clone, Copy, Default)]
// pub struct ENCRYPTED_CREDENTIALW {
//     pub Cred: super::super::Credentials::CREDENTIALW,
//     pub ClearCredentialBlobSize: u32,
// }

// UNSUPPORTED Rust 570:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type ENCRYPT_MESSAGE_FN = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: u32, param2: *mut SecBufferDesc, param3: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 572:1: generic scalar type unsupported
// pub type ENUMERATE_SECURITY_PACKAGES_FN_A = Option<unsafe extern "system" fn(param0: *mut u32, param1: *mut *mut SecPkgInfoA) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 573:1: generic scalar type unsupported
// pub type ENUMERATE_SECURITY_PACKAGES_FN_W = Option<unsafe extern "system" fn(param0: *mut u32, param1: *mut *mut SecPkgInfoW) -> windows_sys::core::HRESULT>;

public typealias `EXPORT_SECURITY_CONTEXT_FLAGS` = UInt;
// UNSUPPORTED Rust 575:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type EXPORT_SECURITY_CONTEXT_FN = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: u32, param2: *mut SecBuffer, param3: *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

public typealias `EXTENDED_NAME_FORMAT` = Int;
public const val `E_RM_UNKNOWN_ERROR`: Int = -1073415165;
public const val `ExternallySuppliedCredKey`: `MSV1_0_CREDENTIAL_KEY_TYPE` = 4;
public const val `FACILITY_SL_ITF`: UInt = 4u;
// UNSUPPORTED Rust 581:1: generic scalar type unsupported
// pub type FREE_CONTEXT_BUFFER_FN = Option<unsafe extern "system" fn(param0: *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 582:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type FREE_CREDENTIALS_HANDLE_FN = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle) -> windows_sys::core::HRESULT>;

public const val `ForestTrustBinaryInfo`: `LSA_FOREST_TRUST_RECORD_TYPE` = 3;
public const val `ForestTrustDomainInfo`: `LSA_FOREST_TRUST_RECORD_TYPE` = 2;
public const val `ForestTrustRecordTypeLast`: `LSA_FOREST_TRUST_RECORD_TYPE` = 4;
public const val `ForestTrustScannerInfo`: `LSA_FOREST_TRUST_RECORD_TYPE` = 4;
public const val `ForestTrustTopLevelName`: `LSA_FOREST_TRUST_RECORD_TYPE` = 0;
public const val `ForestTrustTopLevelNameEx`: `LSA_FOREST_TRUST_RECORD_TYPE` = 1;
// UNSUPPORTED Rust 590:1: non-scalar type Ptr unsupported
// pub const ID_CAP_SLAPI: windows_sys::core::PCWSTR = windows_sys::core::w!("slapiQueryLicenseValue");

// UNSUPPORTED Rust 591:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type IMPERSONATE_SECURITY_CONTEXT_FN = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 593:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type IMPORT_SECURITY_CONTEXT_FN_A = Option<unsafe extern "system" fn(param0: *mut i8, param1: *mut SecBuffer, param2: *mut core::ffi::c_void, param3: *mut super::super::Credentials::SecHandle) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 595:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type IMPORT_SECURITY_CONTEXT_FN_W = Option<unsafe extern "system" fn(param0: *mut u16, param1: *mut SecBuffer, param2: *mut core::ffi::c_void, param3: *mut super::super::Credentials::SecHandle) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 597:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type INITIALIZE_SECURITY_CONTEXT_FN_A = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: *mut super::super::Credentials::SecHandle, param2: *mut i8, param3: u32, param4: u32, param5: u32, param6: *mut SecBufferDesc, param7: u32, param8: *mut super::super::Credentials::SecHandle, param9: *mut SecBufferDesc, param10: *mut u32, param11: *mut i64) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 599:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type INITIALIZE_SECURITY_CONTEXT_FN_W = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: *mut super::super::Credentials::SecHandle, param2: *mut u16, param3: u32, param4: u32, param5: u32, param6: *mut SecBufferDesc, param7: u32, param8: *mut super::super::Credentials::SecHandle, param9: *mut SecBufferDesc, param10: *mut u32, param11: *mut i64) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 601:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type INIT_SECURITY_INTERFACE_A = Option<unsafe extern "system" fn() -> *mut SecurityFunctionTableA>;

// UNSUPPORTED Rust 603:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type INIT_SECURITY_INTERFACE_W = Option<unsafe extern "system" fn() -> *mut SecurityFunctionTableW>;

public const val `ISC_REQ_ALLOCATE_MEMORY`: `ISC_REQ_FLAGS` = 256u;
public const val `ISC_REQ_CALL_LEVEL`: `ISC_REQ_FLAGS` = 4096u;
public const val `ISC_REQ_CONFIDENTIALITY`: `ISC_REQ_FLAGS` = 16u;
public const val `ISC_REQ_CONFIDENTIALITY_ONLY`: `ISC_REQ_FLAGS` = 1073741824u;
public const val `ISC_REQ_CONNECTION`: `ISC_REQ_FLAGS` = 2048u;
public const val `ISC_REQ_DATAGRAM`: `ISC_REQ_FLAGS` = 1024u;
public const val `ISC_REQ_DEFERRED_CRED_VALIDATION`: `ISC_REQ_HIGH_FLAGS` = 8589934592uL;
public const val `ISC_REQ_DELEGATE`: `ISC_REQ_FLAGS` = 1u;
public const val `ISC_REQ_EXTENDED_ERROR`: `ISC_REQ_FLAGS` = 16384u;
public typealias `ISC_REQ_FLAGS` = UInt;
public const val `ISC_REQ_FORWARD_CREDENTIALS`: `ISC_REQ_FLAGS` = 4194304u;
public const val `ISC_REQ_FRAGMENT_SUPPLIED`: `ISC_REQ_FLAGS` = 8192u;
public const val `ISC_REQ_FRAGMENT_TO_FIT`: `ISC_REQ_FLAGS` = 2097152u;
public typealias `ISC_REQ_HIGH_FLAGS` = ULong;
public const val `ISC_REQ_IDENTIFY`: `ISC_REQ_FLAGS` = 131072u;
public const val `ISC_REQ_INTEGRITY`: `ISC_REQ_FLAGS` = 65536u;
public const val `ISC_REQ_MANUAL_CRED_VALIDATION`: `ISC_REQ_FLAGS` = 524288u;
public const val `ISC_REQ_MESSAGES`: `ISC_REQ_HIGH_FLAGS` = 4294967296uL;
public const val `ISC_REQ_MUTUAL_AUTH`: `ISC_REQ_FLAGS` = 2u;
public const val `ISC_REQ_NO_INTEGRITY`: `ISC_REQ_FLAGS` = 8388608u;
public const val `ISC_REQ_NO_POST_HANDSHAKE_AUTH`: `ISC_REQ_HIGH_FLAGS` = 17179869184uL;
public const val `ISC_REQ_NULL_SESSION`: `ISC_REQ_FLAGS` = 262144u;
public const val `ISC_REQ_PROMPT_FOR_CREDS`: `ISC_REQ_FLAGS` = 64u;
public const val `ISC_REQ_REPLAY_DETECT`: `ISC_REQ_FLAGS` = 4u;
public const val `ISC_REQ_RESERVED1`: `ISC_REQ_FLAGS` = 1048576u;
public const val `ISC_REQ_SEQUENCE_DETECT`: `ISC_REQ_FLAGS` = 8u;
public const val `ISC_REQ_STREAM`: `ISC_REQ_FLAGS` = 32768u;
public const val `ISC_REQ_UNVERIFIED_TARGET_NAME`: `ISC_REQ_FLAGS` = 536870912u;
public const val `ISC_REQ_USE_DCE_STYLE`: `ISC_REQ_FLAGS` = 512u;
public const val `ISC_REQ_USE_HTTP_STYLE`: `ISC_REQ_FLAGS` = 16777216u;
public const val `ISC_REQ_USE_SESSION_KEY`: `ISC_REQ_FLAGS` = 32u;
public const val `ISC_REQ_USE_SUPPLIED_CREDS`: `ISC_REQ_FLAGS` = 128u;
public const val `ISC_RET_ALLOCATED_MEMORY`: UInt = 256u;
public const val `ISC_RET_CALL_LEVEL`: UInt = 8192u;
public const val `ISC_RET_CONFIDENTIALITY`: UInt = 16u;
public const val `ISC_RET_CONFIDENTIALITY_ONLY`: UInt = 1073741824u;
public const val `ISC_RET_CONNECTION`: UInt = 2048u;
public const val `ISC_RET_DATAGRAM`: UInt = 1024u;
public const val `ISC_RET_DEFERRED_CRED_VALIDATION`: ULong = 8589934592uL;
public const val `ISC_RET_DELEGATE`: UInt = 1u;
public const val `ISC_RET_EXTENDED_ERROR`: UInt = 16384u;
public const val `ISC_RET_FORWARD_CREDENTIALS`: UInt = 4194304u;
public const val `ISC_RET_FRAGMENT_ONLY`: UInt = 2097152u;
public const val `ISC_RET_IDENTIFY`: UInt = 131072u;
public const val `ISC_RET_INTEGRITY`: UInt = 65536u;
public const val `ISC_RET_INTERMEDIATE_RETURN`: UInt = 4096u;
public const val `ISC_RET_MANUAL_CRED_VALIDATION`: UInt = 524288u;
public const val `ISC_RET_MESSAGES`: ULong = 4294967296uL;
public const val `ISC_RET_MUTUAL_AUTH`: UInt = 2u;
public const val `ISC_RET_NO_ADDITIONAL_TOKEN`: UInt = 33554432u;
public const val `ISC_RET_NO_POST_HANDSHAKE_AUTH`: ULong = 17179869184uL;
public const val `ISC_RET_NULL_SESSION`: UInt = 262144u;
public const val `ISC_RET_REAUTHENTICATION`: UInt = 134217728u;
public const val `ISC_RET_REPLAY_DETECT`: UInt = 4u;
public const val `ISC_RET_RESERVED1`: UInt = 1048576u;
public const val `ISC_RET_SEQUENCE_DETECT`: UInt = 8u;
public const val `ISC_RET_STREAM`: UInt = 32768u;
public const val `ISC_RET_USED_COLLECTED_CREDS`: UInt = 64u;
public const val `ISC_RET_USED_DCE_STYLE`: UInt = 512u;
public const val `ISC_RET_USED_HTTP_STYLE`: UInt = 16777216u;
public const val `ISC_RET_USED_SUPPLIED_CREDS`: UInt = 128u;
public const val `ISC_RET_USE_SESSION_KEY`: UInt = 32u;
public const val `ISSP_LEVEL`: UInt = 32u;
public const val `ISSP_MODE`: UInt = 1u;
public const val `InvalidCredKey`: `MSV1_0_CREDENTIAL_KEY_TYPE` = 0;
// UNSUPPORTED Rust 670:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KDC_PROXY_CACHE_ENTRY_DATA {
//     pub SinceLastUsed: u64,
//     pub DomainName: LSA_UNICODE_STRING,
//     pub ProxyServerName: LSA_UNICODE_STRING,
//     pub ProxyServerVdir: LSA_UNICODE_STRING,
//     pub ProxyServerPort: u16,
//     pub LogonId: super::super::super::Foundation::LUID,
//     pub CredUserName: LSA_UNICODE_STRING,
//     pub CredDomainName: LSA_UNICODE_STRING,
//     pub GlobalCache: bool,
// }

public const val `KDC_PROXY_SETTINGS_FLAGS_FORCEPROXY`: UInt = 1u;
public const val `KDC_PROXY_SETTINGS_V1`: UInt = 1u;
public const val `KERBEROS_REVISION`: UInt = 6u;
public const val `KERBEROS_VERSION`: UInt = 5u;
public typealias `KERB_ADDRESS_TYPE` = UInt;
// UNSUPPORTED Rust 688:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_ADD_BINDING_CACHE_ENTRY_EX_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub RealmName: LSA_UNICODE_STRING,
//     pub KdcAddress: LSA_UNICODE_STRING,
//     pub AddressType: KERB_ADDRESS_TYPE,
//     pub DcFlags: u32,
// }

// UNSUPPORTED Rust 697:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_ADD_BINDING_CACHE_ENTRY_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub RealmName: LSA_UNICODE_STRING,
//     pub KdcAddress: LSA_UNICODE_STRING,
//     pub AddressType: KERB_ADDRESS_TYPE,
// }

// UNSUPPORTED Rust 705:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_ADD_CREDENTIALS_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub UserName: LSA_UNICODE_STRING,
//     pub DomainName: LSA_UNICODE_STRING,
//     pub Password: LSA_UNICODE_STRING,
//     pub LogonId: super::super::super::Foundation::LUID,
//     pub Flags: KERB_REQUEST_FLAGS,
// }

// UNSUPPORTED Rust 715:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_ADD_CREDENTIALS_REQUEST_EX {
//     pub Credentials: KERB_ADD_CREDENTIALS_REQUEST,
//     pub PrincipalNameCount: u32,
//     pub PrincipalNames: [LSA_UNICODE_STRING; 1],
// }

// UNSUPPORTED Rust 722:1: declaration Impl has no candidate rule
// impl Default for KERB_ADD_CREDENTIALS_REQUEST_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 727:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_AUTH_DATA {
//     pub Type: u32,
//     pub Length: u32,
//     pub Data: *mut u8,
// }

// UNSUPPORTED Rust 734:1: declaration Impl has no candidate rule
// impl Default for KERB_AUTH_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 739:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_BINDING_CACHE_ENTRY_DATA {
//     pub DiscoveryTime: u64,
//     pub RealmName: LSA_UNICODE_STRING,
//     pub KdcAddress: LSA_UNICODE_STRING,
//     pub AddressType: KERB_ADDRESS_TYPE,
//     pub Flags: u32,
//     pub DcFlags: u32,
//     pub CacheFlags: u32,
//     pub KdcName: LSA_UNICODE_STRING,
// }

// UNSUPPORTED Rust 751:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_CERTIFICATE_HASHINFO {
//     pub StoreNameLength: u16,
//     pub HashLength: u16,
// }

// UNSUPPORTED Rust 757:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_CERTIFICATE_INFO {
//     pub CertInfoSize: u32,
//     pub InfoType: u32,
// }

public typealias `KERB_CERTIFICATE_INFO_TYPE` = Int;
// UNSUPPORTED Rust 764:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_CERTIFICATE_LOGON {
//     pub MessageType: KERB_LOGON_SUBMIT_TYPE,
//     pub DomainName: LSA_UNICODE_STRING,
//     pub UserName: LSA_UNICODE_STRING,
//     pub Pin: LSA_UNICODE_STRING,
//     pub Flags: u32,
//     pub CspDataLength: u32,
//     pub CspData: *mut u8,
// }

// UNSUPPORTED Rust 775:1: declaration Impl has no candidate rule
// impl Default for KERB_CERTIFICATE_LOGON {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KERB_CERTIFICATE_LOGON_FLAG_CHECK_DUPLICATES`: UInt = 1u;
public const val `KERB_CERTIFICATE_LOGON_FLAG_USE_CERTIFICATE_INFO`: UInt = 2u;
// UNSUPPORTED Rust 782:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_CERTIFICATE_S4U_LOGON {
//     pub MessageType: KERB_LOGON_SUBMIT_TYPE,
//     pub Flags: u32,
//     pub UserPrincipalName: LSA_UNICODE_STRING,
//     pub DomainName: LSA_UNICODE_STRING,
//     pub CertificateLength: u32,
//     pub Certificate: *mut u8,
// }

// UNSUPPORTED Rust 792:1: declaration Impl has no candidate rule
// impl Default for KERB_CERTIFICATE_S4U_LOGON {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KERB_CERTIFICATE_S4U_LOGON_FLAG_CHECK_DUPLICATES`: UInt = 1u;
public const val `KERB_CERTIFICATE_S4U_LOGON_FLAG_CHECK_LOGONHOURS`: UInt = 2u;
public const val `KERB_CERTIFICATE_S4U_LOGON_FLAG_FAIL_IF_NT_AUTH_POLICY_REQUIRED`: UInt = 4u;
public const val `KERB_CERTIFICATE_S4U_LOGON_FLAG_IDENTIFY`: UInt = 8u;
// UNSUPPORTED Rust 801:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_CERTIFICATE_UNLOCK_LOGON {
//     pub Logon: KERB_CERTIFICATE_LOGON,
//     pub LogonId: super::super::super::Foundation::LUID,
// }

// UNSUPPORTED Rust 807:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_CHANGEPASSWORD_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub DomainName: LSA_UNICODE_STRING,
//     pub AccountName: LSA_UNICODE_STRING,
//     pub OldPassword: LSA_UNICODE_STRING,
//     pub NewPassword: LSA_UNICODE_STRING,
//     pub Impersonating: bool,
// }

public const val `KERB_CHECKSUM_CRC32`: UInt = 1u;
public const val `KERB_CHECKSUM_DES_MAC`: Int = -133;
public const val `KERB_CHECKSUM_DES_MAC_MD5`: Int = -134;
public const val `KERB_CHECKSUM_HMAC_MD5`: Int = -138;
public const val `KERB_CHECKSUM_HMAC_SHA1_96_AES128`: UInt = 15u;
public const val `KERB_CHECKSUM_HMAC_SHA1_96_AES128_Ki`: Int = -150;
public const val `KERB_CHECKSUM_HMAC_SHA1_96_AES256`: UInt = 16u;
public const val `KERB_CHECKSUM_HMAC_SHA1_96_AES256_Ki`: Int = -151;
public const val `KERB_CHECKSUM_KRB_DES_MAC`: UInt = 4u;
public const val `KERB_CHECKSUM_KRB_DES_MAC_K`: UInt = 5u;
public const val `KERB_CHECKSUM_LM`: Int = -130;
public const val `KERB_CHECKSUM_MD25`: Int = -135;
public const val `KERB_CHECKSUM_MD4`: UInt = 2u;
public const val `KERB_CHECKSUM_MD5`: UInt = 7u;
public const val `KERB_CHECKSUM_MD5_DES`: UInt = 8u;
public const val `KERB_CHECKSUM_MD5_HMAC`: Int = -137;
public const val `KERB_CHECKSUM_NONE`: UInt = 0u;
public const val `KERB_CHECKSUM_RC4_MD5`: Int = -136;
public const val `KERB_CHECKSUM_REAL_CRC32`: Int = -132;
public const val `KERB_CHECKSUM_SHA1`: Int = -131;
public const val `KERB_CHECKSUM_SHA1_NEW`: UInt = 14u;
public const val `KERB_CHECKSUM_SHA256`: Int = -139;
public const val `KERB_CHECKSUM_SHA384`: Int = -140;
public const val `KERB_CHECKSUM_SHA512`: Int = -141;
// UNSUPPORTED Rust 841:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_CLEANUP_MACHINE_PKINIT_CREDS_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub LogonId: super::super::super::Foundation::LUID,
// }

// UNSUPPORTED Rust 847:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_CLOUD_KERBEROS_DEBUG_DATA {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 852:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_CLOUD_KERBEROS_DEBUG_DATA_V0 {
//     pub _bitfield: u32,
// }

public const val `KERB_CLOUD_KERBEROS_DEBUG_DATA_VERSION`: UInt = 1u;
// UNSUPPORTED Rust 858:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_CLOUD_KERBEROS_DEBUG_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub LogonId: super::super::super::Foundation::LUID,
// }

// UNSUPPORTED Rust 864:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_CLOUD_KERBEROS_DEBUG_RESPONSE {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub Version: u32,
//     pub Length: u32,
//     pub Data: [u32; 1],
// }

// UNSUPPORTED Rust 872:1: declaration Impl has no candidate rule
// impl Default for KERB_CLOUD_KERBEROS_DEBUG_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 877:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_CRYPTO_KEY {
//     pub KeyType: KERB_CRYPTO_KEY_TYPE,
//     pub Length: u32,
//     pub Value: *mut u8,
// }

// UNSUPPORTED Rust 884:1: declaration Impl has no candidate rule
// impl Default for KERB_CRYPTO_KEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 889:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_CRYPTO_KEY32 {
//     pub KeyType: i32,
//     pub Length: u32,
//     pub Offset: u32,
// }

public typealias `KERB_CRYPTO_KEY_TYPE` = Int;
public const val `KERB_DECRYPT_FLAG_DEFAULT_KEY`: UInt = 1u;
// UNSUPPORTED Rust 898:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_DECRYPT_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub LogonId: super::super::super::Foundation::LUID,
//     pub Flags: u32,
//     pub CryptoType: i32,
//     pub KeyUsage: i32,
//     pub Key: KERB_CRYPTO_KEY,
//     pub EncryptedDataSize: u32,
//     pub InitialVectorSize: u32,
//     pub InitialVector: *mut u8,
//     pub EncryptedData: *mut u8,
// }

// UNSUPPORTED Rust 912:1: declaration Impl has no candidate rule
// impl Default for KERB_DECRYPT_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 917:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_DECRYPT_RESPONSE {
//     pub DecryptedData: [u8; 1],
// }

// UNSUPPORTED Rust 922:1: declaration Impl has no candidate rule
// impl Default for KERB_DECRYPT_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KERB_ETYPE_AES128_CTS_HMAC_SHA1_96`: UInt = 17u;
public const val `KERB_ETYPE_AES128_CTS_HMAC_SHA1_96_PLAIN`: Int = -148;
public const val `KERB_ETYPE_AES256_CTS_HMAC_SHA1_96`: UInt = 18u;
public const val `KERB_ETYPE_AES256_CTS_HMAC_SHA1_96_PLAIN`: Int = -149;
public const val `KERB_ETYPE_DEFAULT`: UInt = 0u;
public const val `KERB_ETYPE_DES3_CBC_MD5`: UInt = 5u;
public const val `KERB_ETYPE_DES3_CBC_SHA1`: UInt = 7u;
public const val `KERB_ETYPE_DES3_CBC_SHA1_KD`: UInt = 16u;
public const val `KERB_ETYPE_DES_CBC_CRC`: `KERB_CRYPTO_KEY_TYPE` = 1;
public const val `KERB_ETYPE_DES_CBC_MD4`: `KERB_CRYPTO_KEY_TYPE` = 2;
public const val `KERB_ETYPE_DES_CBC_MD5`: `KERB_CRYPTO_KEY_TYPE` = 3;
public const val `KERB_ETYPE_DES_CBC_MD5_NT`: UInt = 20u;
public const val `KERB_ETYPE_DES_EDE3_CBC_ENV`: UInt = 15u;
public const val `KERB_ETYPE_DES_PLAIN`: Int = -132;
public const val `KERB_ETYPE_DSA_SHA1_CMS`: UInt = 9u;
public const val `KERB_ETYPE_DSA_SIGN`: UInt = 8u;
public const val `KERB_ETYPE_NULL`: `KERB_CRYPTO_KEY_TYPE` = 0;
public const val `KERB_ETYPE_PKCS7_PUB`: UInt = 13u;
public const val `KERB_ETYPE_RC2_CBC_ENV`: UInt = 12u;
public const val `KERB_ETYPE_RC4_HMAC_NT`: `KERB_CRYPTO_KEY_TYPE` = 23;
public const val `KERB_ETYPE_RC4_HMAC_NT_EXP`: UInt = 24u;
public const val `KERB_ETYPE_RC4_HMAC_OLD`: Int = -133;
public const val `KERB_ETYPE_RC4_HMAC_OLD_EXP`: Int = -135;
public const val `KERB_ETYPE_RC4_LM`: Int = -130;
public const val `KERB_ETYPE_RC4_MD4`: `KERB_CRYPTO_KEY_TYPE` = -128;
public const val `KERB_ETYPE_RC4_PLAIN`: Int = -140;
public const val `KERB_ETYPE_RC4_PLAIN2`: Int = -129;
public const val `KERB_ETYPE_RC4_PLAIN_EXP`: Int = -141;
public const val `KERB_ETYPE_RC4_PLAIN_OLD`: Int = -134;
public const val `KERB_ETYPE_RC4_PLAIN_OLD_EXP`: Int = -136;
public const val `KERB_ETYPE_RC4_SHA`: Int = -131;
public const val `KERB_ETYPE_RSA_ENV`: UInt = 13u;
public const val `KERB_ETYPE_RSA_ES_OEAP_ENV`: UInt = 14u;
public const val `KERB_ETYPE_RSA_MD5_CMS`: UInt = 10u;
public const val `KERB_ETYPE_RSA_PRIV`: UInt = 9u;
public const val `KERB_ETYPE_RSA_PUB`: UInt = 10u;
public const val `KERB_ETYPE_RSA_PUB_MD5`: UInt = 11u;
public const val `KERB_ETYPE_RSA_PUB_SHA1`: UInt = 12u;
public const val `KERB_ETYPE_RSA_SHA1_CMS`: UInt = 11u;
// UNSUPPORTED Rust 966:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_EXTERNAL_NAME {
//     pub NameType: i16,
//     pub NameCount: u16,
//     pub Names: [LSA_UNICODE_STRING; 1],
// }

// UNSUPPORTED Rust 973:1: declaration Impl has no candidate rule
// impl Default for KERB_EXTERNAL_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 978:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_EXTERNAL_TICKET {
//     pub ServiceName: *mut KERB_EXTERNAL_NAME,
//     pub TargetName: *mut KERB_EXTERNAL_NAME,
//     pub ClientName: *mut KERB_EXTERNAL_NAME,
//     pub DomainName: LSA_UNICODE_STRING,
//     pub TargetDomainName: LSA_UNICODE_STRING,
//     pub AltTargetDomainName: LSA_UNICODE_STRING,
//     pub SessionKey: KERB_CRYPTO_KEY,
//     pub TicketFlags: KERB_TICKET_FLAGS,
//     pub Flags: u32,
//     pub KeyExpirationTime: i64,
//     pub StartTime: i64,
//     pub EndTime: i64,
//     pub RenewUntil: i64,
//     pub TimeSkew: i64,
//     pub EncodedTicketSize: u32,
//     pub EncodedTicket: *mut u8,
// }

// UNSUPPORTED Rust 998:1: declaration Impl has no candidate rule
// impl Default for KERB_EXTERNAL_TICKET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1003:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_INTERACTIVE_LOGON {
//     pub MessageType: KERB_LOGON_SUBMIT_TYPE,
//     pub LogonDomainName: LSA_UNICODE_STRING,
//     pub UserName: LSA_UNICODE_STRING,
//     pub Password: LSA_UNICODE_STRING,
// }

// UNSUPPORTED Rust 1011:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_INTERACTIVE_PROFILE {
//     pub MessageType: KERB_PROFILE_BUFFER_TYPE,
//     pub LogonCount: u16,
//     pub BadPasswordCount: u16,
//     pub LogonTime: i64,
//     pub LogoffTime: i64,
//     pub KickOffTime: i64,
//     pub PasswordLastSet: i64,
//     pub PasswordCanChange: i64,
//     pub PasswordMustChange: i64,
//     pub LogonScript: LSA_UNICODE_STRING,
//     pub HomeDirectory: LSA_UNICODE_STRING,
//     pub FullName: LSA_UNICODE_STRING,
//     pub ProfilePath: LSA_UNICODE_STRING,
//     pub HomeDirectoryDrive: LSA_UNICODE_STRING,
//     pub LogonServer: LSA_UNICODE_STRING,
//     pub UserFlags: u32,
// }

// UNSUPPORTED Rust 1031:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_INTERACTIVE_UNLOCK_LOGON {
//     pub Logon: KERB_INTERACTIVE_LOGON,
//     pub LogonId: super::super::super::Foundation::LUID,
// }

public const val `KERB_LOGON_FLAG_ALLOW_EXPIRED_TICKET`: UInt = 1u;
public const val `KERB_LOGON_FLAG_REDIRECTED`: UInt = 2u;
public typealias `KERB_LOGON_SUBMIT_TYPE` = Int;
// UNSUPPORTED Rust 1040:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_NET_ADDRESS {
//     pub Family: u32,
//     pub Length: u32,
//     pub Address: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 1047:1: declaration Impl has no candidate rule
// impl Default for KERB_NET_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1052:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_NET_ADDRESSES {
//     pub Number: u32,
//     pub Addresses: [KERB_NET_ADDRESS; 1],
// }

// UNSUPPORTED Rust 1058:1: declaration Impl has no candidate rule
// impl Default for KERB_NET_ADDRESSES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `KERB_PROFILE_BUFFER_TYPE` = Int;
public typealias `KERB_PROTOCOL_MESSAGE_TYPE` = Int;
public const val `KERB_PURGE_ALL_TICKETS`: UInt = 1u;
// UNSUPPORTED Rust 1066:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_PURGE_BINDING_CACHE_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
// }

// UNSUPPORTED Rust 1071:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_PURGE_KDC_PROXY_CACHE_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub Flags: u32,
//     pub LogonId: super::super::super::Foundation::LUID,
// }

// UNSUPPORTED Rust 1078:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_PURGE_KDC_PROXY_CACHE_RESPONSE {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub CountOfPurged: u32,
// }

// UNSUPPORTED Rust 1084:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_PURGE_TKT_CACHE_EX_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub LogonId: super::super::super::Foundation::LUID,
//     pub Flags: u32,
//     pub TicketTemplate: KERB_TICKET_CACHE_INFO_EX,
// }

// UNSUPPORTED Rust 1092:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_PURGE_TKT_CACHE_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub LogonId: super::super::super::Foundation::LUID,
//     pub ServerName: LSA_UNICODE_STRING,
//     pub RealmName: LSA_UNICODE_STRING,
// }

// UNSUPPORTED Rust 1100:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_QUERY_BINDING_CACHE_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
// }

// UNSUPPORTED Rust 1105:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_QUERY_BINDING_CACHE_RESPONSE {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub CountOfEntries: u32,
//     pub Entries: *mut KERB_BINDING_CACHE_ENTRY_DATA,
// }

// UNSUPPORTED Rust 1112:1: declaration Impl has no candidate rule
// impl Default for KERB_QUERY_BINDING_CACHE_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1117:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_QUERY_DOMAIN_EXTENDED_POLICIES_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub Flags: u32,
//     pub DomainName: LSA_UNICODE_STRING,
// }

// UNSUPPORTED Rust 1124:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_QUERY_DOMAIN_EXTENDED_POLICIES_RESPONSE {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub Flags: u32,
//     pub ExtendedPolicies: u32,
//     pub DsFlags: u32,
// }

public const val `KERB_QUERY_DOMAIN_EXTENDED_POLICIES_RESPONSE_FLAG_DAC_DISABLED`: UInt = 1u;
// UNSUPPORTED Rust 1133:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_QUERY_KDC_PROXY_CACHE_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub Flags: u32,
//     pub LogonId: super::super::super::Foundation::LUID,
// }

// UNSUPPORTED Rust 1140:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_QUERY_KDC_PROXY_CACHE_RESPONSE {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub CountOfEntries: u32,
//     pub Entries: *mut KDC_PROXY_CACHE_ENTRY_DATA,
// }

// UNSUPPORTED Rust 1147:1: declaration Impl has no candidate rule
// impl Default for KERB_QUERY_KDC_PROXY_CACHE_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1152:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_QUERY_S4U2PROXY_CACHE_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub Flags: u32,
//     pub LogonId: super::super::super::Foundation::LUID,
// }

// UNSUPPORTED Rust 1159:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_QUERY_S4U2PROXY_CACHE_RESPONSE {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub CountOfCreds: u32,
//     pub Creds: *mut KERB_S4U2PROXY_CRED,
// }

// UNSUPPORTED Rust 1166:1: declaration Impl has no candidate rule
// impl Default for KERB_QUERY_S4U2PROXY_CACHE_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1171:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_QUERY_TKT_CACHE_EX2_RESPONSE {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub CountOfTickets: u32,
//     pub Tickets: [KERB_TICKET_CACHE_INFO_EX2; 1],
// }

// UNSUPPORTED Rust 1178:1: declaration Impl has no candidate rule
// impl Default for KERB_QUERY_TKT_CACHE_EX2_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1183:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_QUERY_TKT_CACHE_EX3_RESPONSE {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub CountOfTickets: u32,
//     pub Tickets: [KERB_TICKET_CACHE_INFO_EX3; 1],
// }

// UNSUPPORTED Rust 1190:1: declaration Impl has no candidate rule
// impl Default for KERB_QUERY_TKT_CACHE_EX3_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1195:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_QUERY_TKT_CACHE_EX_RESPONSE {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub CountOfTickets: u32,
//     pub Tickets: [KERB_TICKET_CACHE_INFO_EX; 1],
// }

// UNSUPPORTED Rust 1202:1: declaration Impl has no candidate rule
// impl Default for KERB_QUERY_TKT_CACHE_EX_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1207:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_QUERY_TKT_CACHE_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub LogonId: super::super::super::Foundation::LUID,
// }

// UNSUPPORTED Rust 1213:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_QUERY_TKT_CACHE_RESPONSE {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub CountOfTickets: u32,
//     pub Tickets: [KERB_TICKET_CACHE_INFO; 1],
// }

// UNSUPPORTED Rust 1220:1: declaration Impl has no candidate rule
// impl Default for KERB_QUERY_TKT_CACHE_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KERB_REFRESH_POLICY_KDC`: UInt = 2u;
public const val `KERB_REFRESH_POLICY_KERBEROS`: UInt = 1u;
// UNSUPPORTED Rust 1227:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_REFRESH_POLICY_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 1233:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_REFRESH_POLICY_RESPONSE {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub Flags: u32,
// }

public const val `KERB_REFRESH_SCCRED_GETTGT`: UInt = 1u;
public const val `KERB_REFRESH_SCCRED_RELEASE`: UInt = 0u;
// UNSUPPORTED Rust 1241:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_REFRESH_SCCRED_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub CredentialBlob: LSA_UNICODE_STRING,
//     pub LogonId: super::super::super::Foundation::LUID,
//     pub Flags: u32,
// }

public const val `KERB_REQUEST_ADD_CREDENTIAL`: `KERB_REQUEST_FLAGS` = 1u;
public typealias `KERB_REQUEST_FLAGS` = UInt;
public const val `KERB_REQUEST_REMOVE_CREDENTIAL`: `KERB_REQUEST_FLAGS` = 4u;
public const val `KERB_REQUEST_REPLACE_CREDENTIAL`: `KERB_REQUEST_FLAGS` = 2u;
// UNSUPPORTED Rust 1253:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_RETRIEVE_KEY_TAB_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub Flags: u32,
//     pub UserName: LSA_UNICODE_STRING,
//     pub DomainName: LSA_UNICODE_STRING,
//     pub Password: LSA_UNICODE_STRING,
// }

// UNSUPPORTED Rust 1262:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_RETRIEVE_KEY_TAB_RESPONSE {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub KeyTabLength: u32,
//     pub KeyTab: *mut u8,
// }

// UNSUPPORTED Rust 1269:1: declaration Impl has no candidate rule
// impl Default for KERB_RETRIEVE_KEY_TAB_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KERB_RETRIEVE_TICKET_AS_KERB_CRED`: UInt = 8u;
public const val `KERB_RETRIEVE_TICKET_CACHE_TICKET`: UInt = 32u;
public const val `KERB_RETRIEVE_TICKET_DEFAULT`: UInt = 0u;
public const val `KERB_RETRIEVE_TICKET_DONT_USE_CACHE`: UInt = 1u;
public const val `KERB_RETRIEVE_TICKET_MAX_LIFETIME`: UInt = 64u;
public const val `KERB_RETRIEVE_TICKET_USE_CACHE_ONLY`: UInt = 2u;
public const val `KERB_RETRIEVE_TICKET_USE_CREDHANDLE`: UInt = 4u;
public const val `KERB_RETRIEVE_TICKET_WITH_SEC_CRED`: UInt = 16u;
// UNSUPPORTED Rust 1282:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Credentials")]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_RETRIEVE_TKT_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub LogonId: super::super::super::Foundation::LUID,
//     pub TargetName: LSA_UNICODE_STRING,
//     pub TicketFlags: u32,
//     pub CacheOptions: u32,
//     pub EncryptionType: KERB_CRYPTO_KEY_TYPE,
//     pub CredentialsHandle: super::super::Credentials::SecHandle,
// }

// UNSUPPORTED Rust 1294:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_RETRIEVE_TKT_RESPONSE {
//     pub Ticket: KERB_EXTERNAL_TICKET,
// }

// UNSUPPORTED Rust 1299:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_S4U2PROXY_CACHE_ENTRY_INFO {
//     pub ServerName: LSA_UNICODE_STRING,
//     pub Flags: u32,
//     pub LastStatus: super::super::super::Foundation::NTSTATUS,
//     pub Expiry: i64,
// }

public const val `KERB_S4U2PROXY_CACHE_ENTRY_INFO_FLAG_NEGATIVE`: UInt = 1u;
// UNSUPPORTED Rust 1308:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_S4U2PROXY_CRED {
//     pub UserName: LSA_UNICODE_STRING,
//     pub DomainName: LSA_UNICODE_STRING,
//     pub Flags: u32,
//     pub LastStatus: super::super::super::Foundation::NTSTATUS,
//     pub Expiry: i64,
//     pub CountOfEntries: u32,
//     pub Entries: *mut KERB_S4U2PROXY_CACHE_ENTRY_INFO,
// }

// UNSUPPORTED Rust 1319:1: declaration Impl has no candidate rule
// impl Default for KERB_S4U2PROXY_CRED {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KERB_S4U2PROXY_CRED_FLAG_NEGATIVE`: UInt = 1u;
// UNSUPPORTED Rust 1325:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_S4U_LOGON {
//     pub MessageType: KERB_LOGON_SUBMIT_TYPE,
//     pub Flags: u32,
//     pub ClientUpn: LSA_UNICODE_STRING,
//     pub ClientRealm: LSA_UNICODE_STRING,
// }

public const val `KERB_S4U_LOGON_FLAG_CHECK_LOGONHOURS`: UInt = 2u;
public const val `KERB_S4U_LOGON_FLAG_IDENTIFY`: UInt = 8u;
// UNSUPPORTED Rust 1335:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Credentials")]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_SETPASSWORD_EX_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub LogonId: super::super::super::Foundation::LUID,
//     pub CredentialsHandle: super::super::Credentials::SecHandle,
//     pub Flags: u32,
//     pub AccountRealm: LSA_UNICODE_STRING,
//     pub AccountName: LSA_UNICODE_STRING,
//     pub Password: LSA_UNICODE_STRING,
//     pub ClientRealm: LSA_UNICODE_STRING,
//     pub ClientName: LSA_UNICODE_STRING,
//     pub Impersonating: bool,
//     pub KdcAddress: LSA_UNICODE_STRING,
//     pub KdcAddressType: u32,
// }

// UNSUPPORTED Rust 1352:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Credentials")]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_SETPASSWORD_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub LogonId: super::super::super::Foundation::LUID,
//     pub CredentialsHandle: super::super::Credentials::SecHandle,
//     pub Flags: u32,
//     pub DomainName: LSA_UNICODE_STRING,
//     pub AccountName: LSA_UNICODE_STRING,
//     pub Password: LSA_UNICODE_STRING,
// }

public const val `KERB_SETPASS_USE_CREDHANDLE`: UInt = 2u;
public const val `KERB_SETPASS_USE_LOGONID`: UInt = 1u;
// UNSUPPORTED Rust 1366:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_SMART_CARD_LOGON {
//     pub MessageType: KERB_LOGON_SUBMIT_TYPE,
//     pub Pin: LSA_UNICODE_STRING,
//     pub CspDataLength: u32,
//     pub CspData: *mut u8,
// }

// UNSUPPORTED Rust 1374:1: declaration Impl has no candidate rule
// impl Default for KERB_SMART_CARD_LOGON {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1379:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_SMART_CARD_PROFILE {
//     pub Profile: KERB_INTERACTIVE_PROFILE,
//     pub CertificateSize: u32,
//     pub CertificateData: *mut u8,
// }

// UNSUPPORTED Rust 1386:1: declaration Impl has no candidate rule
// impl Default for KERB_SMART_CARD_PROFILE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1391:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_SMART_CARD_UNLOCK_LOGON {
//     pub Logon: KERB_SMART_CARD_LOGON,
//     pub LogonId: super::super::super::Foundation::LUID,
// }

// UNSUPPORTED Rust 1397:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_SUBMIT_TKT_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub LogonId: super::super::super::Foundation::LUID,
//     pub Flags: u32,
//     pub Key: KERB_CRYPTO_KEY32,
//     pub KerbCredSize: u32,
//     pub KerbCredOffset: u32,
// }

// UNSUPPORTED Rust 1407:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_TICKET_CACHE_INFO {
//     pub ServerName: LSA_UNICODE_STRING,
//     pub RealmName: LSA_UNICODE_STRING,
//     pub StartTime: i64,
//     pub EndTime: i64,
//     pub RenewTime: i64,
//     pub EncryptionType: i32,
//     pub TicketFlags: KERB_TICKET_FLAGS,
// }

// UNSUPPORTED Rust 1418:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_TICKET_CACHE_INFO_EX {
//     pub ClientName: LSA_UNICODE_STRING,
//     pub ClientRealm: LSA_UNICODE_STRING,
//     pub ServerName: LSA_UNICODE_STRING,
//     pub ServerRealm: LSA_UNICODE_STRING,
//     pub StartTime: i64,
//     pub EndTime: i64,
//     pub RenewTime: i64,
//     pub EncryptionType: i32,
//     pub TicketFlags: u32,
// }

// UNSUPPORTED Rust 1431:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_TICKET_CACHE_INFO_EX2 {
//     pub ClientName: LSA_UNICODE_STRING,
//     pub ClientRealm: LSA_UNICODE_STRING,
//     pub ServerName: LSA_UNICODE_STRING,
//     pub ServerRealm: LSA_UNICODE_STRING,
//     pub StartTime: i64,
//     pub EndTime: i64,
//     pub RenewTime: i64,
//     pub EncryptionType: i32,
//     pub TicketFlags: u32,
//     pub SessionKeyType: u32,
//     pub BranchId: u32,
// }

// UNSUPPORTED Rust 1446:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_TICKET_CACHE_INFO_EX3 {
//     pub ClientName: LSA_UNICODE_STRING,
//     pub ClientRealm: LSA_UNICODE_STRING,
//     pub ServerName: LSA_UNICODE_STRING,
//     pub ServerRealm: LSA_UNICODE_STRING,
//     pub StartTime: i64,
//     pub EndTime: i64,
//     pub RenewTime: i64,
//     pub EncryptionType: i32,
//     pub TicketFlags: u32,
//     pub SessionKeyType: u32,
//     pub BranchId: u32,
//     pub CacheFlags: u32,
//     pub KdcCalled: LSA_UNICODE_STRING,
// }

public typealias `KERB_TICKET_FLAGS` = UInt;
public const val `KERB_TICKET_FLAGS_cname_in_pa_data`: UInt = 262144u;
public const val `KERB_TICKET_FLAGS_enc_pa_rep`: UInt = 65536u;
public const val `KERB_TICKET_FLAGS_forwardable`: `KERB_TICKET_FLAGS` = 1073741824u;
public const val `KERB_TICKET_FLAGS_forwarded`: `KERB_TICKET_FLAGS` = 536870912u;
public const val `KERB_TICKET_FLAGS_hw_authent`: `KERB_TICKET_FLAGS` = 1048576u;
public const val `KERB_TICKET_FLAGS_initial`: `KERB_TICKET_FLAGS` = 4194304u;
public const val `KERB_TICKET_FLAGS_invalid`: `KERB_TICKET_FLAGS` = 16777216u;
public const val `KERB_TICKET_FLAGS_may_postdate`: `KERB_TICKET_FLAGS` = 67108864u;
public const val `KERB_TICKET_FLAGS_name_canonicalize`: UInt = 65536u;
public const val `KERB_TICKET_FLAGS_ok_as_delegate`: `KERB_TICKET_FLAGS` = 262144u;
public const val `KERB_TICKET_FLAGS_postdated`: `KERB_TICKET_FLAGS` = 33554432u;
public const val `KERB_TICKET_FLAGS_pre_authent`: `KERB_TICKET_FLAGS` = 2097152u;
public const val `KERB_TICKET_FLAGS_proxiable`: `KERB_TICKET_FLAGS` = 268435456u;
public const val `KERB_TICKET_FLAGS_proxy`: `KERB_TICKET_FLAGS` = 134217728u;
public const val `KERB_TICKET_FLAGS_renewable`: `KERB_TICKET_FLAGS` = 8388608u;
public const val `KERB_TICKET_FLAGS_reserved`: `KERB_TICKET_FLAGS` = 2147483648u;
public const val `KERB_TICKET_FLAGS_reserved1`: `KERB_TICKET_FLAGS` = 1u;
// UNSUPPORTED Rust 1481:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KERB_TICKET_LOGON {
//     pub MessageType: KERB_LOGON_SUBMIT_TYPE,
//     pub Flags: u32,
//     pub ServiceTicketLength: u32,
//     pub TicketGrantingTicketLength: u32,
//     pub ServiceTicket: *mut u8,
//     pub TicketGrantingTicket: *mut u8,
// }

// UNSUPPORTED Rust 1491:1: declaration Impl has no candidate rule
// impl Default for KERB_TICKET_LOGON {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1496:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_TICKET_PROFILE {
//     pub Profile: KERB_INTERACTIVE_PROFILE,
//     pub SessionKey: KERB_CRYPTO_KEY,
// }

// UNSUPPORTED Rust 1502:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_TICKET_UNLOCK_LOGON {
//     pub Logon: KERB_TICKET_LOGON,
//     pub LogonId: super::super::super::Foundation::LUID,
// }

public const val `KERB_TRANSFER_CRED_CLEANUP_CREDENTIALS`: UInt = 2u;
// UNSUPPORTED Rust 1509:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERB_TRANSFER_CRED_REQUEST {
//     pub MessageType: KERB_PROTOCOL_MESSAGE_TYPE,
//     pub OriginLogonId: super::super::super::Foundation::LUID,
//     pub DestinationLogonId: super::super::super::Foundation::LUID,
//     pub Flags: u32,
// }

public const val `KERB_TRANSFER_CRED_WITH_TICKETS`: UInt = 1u;
public const val `KERB_USE_DEFAULT_TICKET_FLAGS`: UInt = 0u;
public const val `KERB_WRAP_NO_ENCRYPT`: UInt = 2147483649u;
public const val `KERN_CONTEXT_CERT_INFO_V1`: UInt = 0u;
// UNSUPPORTED Rust 1521:1: non-scalar type Ptr unsupported
// pub const KRB_ANONYMOUS_STRING: windows_sys::core::PCWSTR = windows_sys::core::w!("ANONYMOUS");

public const val `KRB_NT_ENTERPRISE_PRINCIPAL`: UInt = 10u;
public const val `KRB_NT_ENT_PRINCIPAL_AND_ID`: Int = -130;
public const val `KRB_NT_MS_BRANCH_ID`: Int = -133;
public const val `KRB_NT_MS_PRINCIPAL`: Int = -128;
public const val `KRB_NT_MS_PRINCIPAL_AND_ID`: Int = -129;
public const val `KRB_NT_PRINCIPAL`: UInt = 1u;
public const val `KRB_NT_PRINCIPAL_AND_ID`: Int = -131;
public const val `KRB_NT_SRV_HST`: UInt = 3u;
public const val `KRB_NT_SRV_INST`: UInt = 2u;
public const val `KRB_NT_SRV_INST_AND_ID`: Int = -132;
public const val `KRB_NT_SRV_XHST`: UInt = 4u;
public const val `KRB_NT_UID`: UInt = 5u;
public const val `KRB_NT_UNKNOWN`: UInt = 0u;
public const val `KRB_NT_WELLKNOWN`: UInt = 11u;
public const val `KRB_NT_X500_PRINCIPAL`: UInt = 6u;
// UNSUPPORTED Rust 1537:1: non-scalar type Ptr unsupported
// pub const KRB_WELLKNOWN_STRING: windows_sys::core::PCWSTR = windows_sys::core::w!("WELLKNOWN");

public typealias `KSEC_CONTEXT_TYPE` = Int;
// UNSUPPORTED Rust 1539:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub struct KSEC_LIST_ENTRY {
//     pub List: super::super::super::System::Kernel::LIST_ENTRY,
//     pub RefCount: i32,
//     pub Signature: u32,
//     pub OwningList: *mut core::ffi::c_void,
//     pub Reserved: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1549:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for KSEC_LIST_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KSecNonPaged`: `KSEC_CONTEXT_TYPE` = 1;
public const val `KSecPaged`: `KSEC_CONTEXT_TYPE` = 0;
public const val `KerbAddBindingCacheEntryExMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 27;
public const val `KerbAddBindingCacheEntryMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 10;
public const val `KerbAddExtraCredentialsExMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 22;
public const val `KerbAddExtraCredentialsMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 17;
public const val `KerbCertificateLogon`: `KERB_LOGON_SUBMIT_TYPE` = 13;
public const val `KerbCertificateS4ULogon`: `KERB_LOGON_SUBMIT_TYPE` = 14;
public const val `KerbCertificateUnlockLogon`: `KERB_LOGON_SUBMIT_TYPE` = 15;
public const val `KerbChangeMachinePasswordMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 2;
public const val `KerbChangePasswordMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 7;
public const val `KerbCleanupMachinePkinitCredsMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 26;
public const val `KerbDebugRequestMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 0;
public const val `KerbDecryptDataMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 9;
public const val `KerbInteractiveLogon`: `KERB_LOGON_SUBMIT_TYPE` = 2;
public const val `KerbInteractiveProfile`: `KERB_PROFILE_BUFFER_TYPE` = 2;
public const val `KerbLuidLogon`: `KERB_LOGON_SUBMIT_TYPE` = 84;
public const val `KerbNoElevationLogon`: `KERB_LOGON_SUBMIT_TYPE` = 83;
public const val `KerbPinKdcMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 30;
public const val `KerbPrintCloudKerberosDebugMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 36;
public const val `KerbProxyLogon`: `KERB_LOGON_SUBMIT_TYPE` = 9;
public const val `KerbPurgeBindingCacheMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 29;
public const val `KerbPurgeKdcProxyCacheMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 24;
public const val `KerbPurgeTicketCacheExMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 15;
public const val `KerbPurgeTicketCacheMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 6;
public const val `KerbQueryBindingCacheMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 28;
public const val `KerbQueryDomainExtendedPoliciesMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 32;
public const val `KerbQueryKdcProxyCacheMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 23;
public const val `KerbQueryS4U2ProxyCacheMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 33;
public const val `KerbQuerySupplementalCredentialsMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 18;
public const val `KerbQueryTicketCacheEx2Message`: `KERB_PROTOCOL_MESSAGE_TYPE` = 20;
public const val `KerbQueryTicketCacheEx3Message`: `KERB_PROTOCOL_MESSAGE_TYPE` = 25;
public const val `KerbQueryTicketCacheExMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 14;
public const val `KerbQueryTicketCacheMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 1;
public const val `KerbRefreshPolicyMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 35;
public const val `KerbRefreshSmartcardCredentialsMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 16;
public const val `KerbRetrieveEncodedTicketMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 8;
public const val `KerbRetrieveKeyTabMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 34;
public const val `KerbRetrieveTicketMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 4;
public const val `KerbS4ULogon`: `KERB_LOGON_SUBMIT_TYPE` = 12;
public const val `KerbSetPasswordExMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 12;
public const val `KerbSetPasswordMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 11;
public const val `KerbSmartCardLogon`: `KERB_LOGON_SUBMIT_TYPE` = 6;
public const val `KerbSmartCardProfile`: `KERB_PROFILE_BUFFER_TYPE` = 4;
public const val `KerbSmartCardUnlockLogon`: `KERB_LOGON_SUBMIT_TYPE` = 8;
public const val `KerbSubmitTicketMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 21;
public const val `KerbTicketLogon`: `KERB_LOGON_SUBMIT_TYPE` = 10;
public const val `KerbTicketProfile`: `KERB_PROFILE_BUFFER_TYPE` = 6;
public const val `KerbTicketUnlockLogon`: `KERB_LOGON_SUBMIT_TYPE` = 11;
public const val `KerbTransferCredentialsMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 19;
public const val `KerbUnpinAllKdcsMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 31;
public const val `KerbUpdateAddressesMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 5;
public const val `KerbVerifyCredentialsMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 13;
public const val `KerbVerifyPacMessage`: `KERB_PROTOCOL_MESSAGE_TYPE` = 3;
public const val `KerbWorkstationUnlockLogon`: `KERB_LOGON_SUBMIT_TYPE` = 7;
// UNSUPPORTED Rust 1610:1: generic scalar type unsupported
// pub type KspCompleteTokenFn = Option<unsafe extern "system" fn(contextid: usize, token: *const SecBufferDesc) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1611:1: generic scalar type unsupported
// pub type KspDeleteContextFn = Option<unsafe extern "system" fn(contextid: usize, lsacontextid: *mut usize) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1612:1: generic scalar type unsupported
// pub type KspGetTokenFn = Option<unsafe extern "system" fn(contextid: usize, impersonationtoken: *mut super::super::super::Foundation::HANDLE, rawtoken: *mut *mut core::ffi::c_void) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1613:1: generic scalar type unsupported
// pub type KspInitContextFn = Option<unsafe extern "system" fn(contextid: usize, contextdata: *const SecBuffer, newcontextid: *mut usize) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1614:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Kernel")]
// pub type KspInitPackageFn = Option<unsafe extern "system" fn(functiontable: *const SECPKG_KERNEL_FUNCTIONS) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1616:1: generic scalar type unsupported
// pub type KspMakeSignatureFn = Option<unsafe extern "system" fn(contextid: usize, fqop: u32, message: *const SecBufferDesc, messageseqno: u32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1617:1: generic scalar type unsupported
// pub type KspMapHandleFn = Option<unsafe extern "system" fn(contextid: usize, lsacontextid: *mut usize) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1618:1: generic scalar type unsupported
// pub type KspQueryAttributesFn = Option<unsafe extern "system" fn(contextid: usize, attribute: u32, buffer: *mut core::ffi::c_void) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1619:1: generic scalar type unsupported
// pub type KspSealMessageFn = Option<unsafe extern "system" fn(contextid: usize, fqop: u32, message: *const SecBufferDesc, messageseqno: u32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1620:1: generic scalar type unsupported
// pub type KspSerializeAuthDataFn = Option<unsafe extern "system" fn(pvauthdata: *const core::ffi::c_void, size: *mut u32, serializeddata: *mut *mut core::ffi::c_void) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1621:1: generic scalar type unsupported
// pub type KspSetPagingModeFn = Option<unsafe extern "system" fn(pagingmode: bool) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1622:1: generic scalar type unsupported
// pub type KspUnsealMessageFn = Option<unsafe extern "system" fn(contextid: usize, message: *const SecBufferDesc, messageseqno: u32, pfqop: *mut u32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1623:1: generic scalar type unsupported
// pub type KspVerifySignatureFn = Option<unsafe extern "system" fn(contextid: usize, message: *const SecBufferDesc, messageseqno: u32, pfqop: *mut u32) -> super::super::super::Foundation::NTSTATUS>;

public const val `LCRED_CRED_EXISTS`: UInt = 1u;
public const val `LCRED_STATUS_NOCRED`: UInt = 0u;
public const val `LCRED_STATUS_UNKNOWN_ISSUER`: UInt = 2u;
public const val `LOGON_CACHED_ACCOUNT`: `MSV_SUB_AUTHENTICATION_FILTER` = 4u;
public const val `LOGON_EXTRA_SIDS`: `MSV_SUB_AUTHENTICATION_FILTER` = 32u;
public const val `LOGON_GRACE_LOGON`: UInt = 16777216u;
public const val `LOGON_GUEST`: `MSV_SUB_AUTHENTICATION_FILTER` = 1u;
// UNSUPPORTED Rust 1631:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LOGON_HOURS {
//     pub UnitsPerWeek: u16,
//     pub LogonHours: *mut u8,
// }

// UNSUPPORTED Rust 1637:1: declaration Impl has no candidate rule
// impl Default for LOGON_HOURS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LOGON_LM_V2`: UInt = 4096u;
public const val `LOGON_MANAGED_SERVICE`: UInt = 524288u;
public const val `LOGON_NOENCRYPTION`: `MSV_SUB_AUTHENTICATION_FILTER` = 2u;
public const val `LOGON_NO_ELEVATION`: UInt = 262144u;
public const val `LOGON_NO_OPTIMIZED`: UInt = 131072u;
public const val `LOGON_NTLMV2_ENABLED`: UInt = 256u;
public const val `LOGON_NTLM_V2`: UInt = 8192u;
public const val `LOGON_NT_V2`: UInt = 2048u;
public const val `LOGON_OPTIMIZED`: UInt = 16384u;
public const val `LOGON_PKINIT`: UInt = 65536u;
public const val `LOGON_PROFILE_PATH_RETURNED`: `MSV_SUB_AUTHENTICATION_FILTER` = 1024u;
public const val `LOGON_RESOURCE_GROUPS`: `MSV_SUB_AUTHENTICATION_FILTER` = 512u;
public const val `LOGON_SERVER_TRUST_ACCOUNT`: `MSV_SUB_AUTHENTICATION_FILTER` = 128u;
public const val `LOGON_SUBAUTH_SESSION_KEY`: `MSV_SUB_AUTHENTICATION_FILTER` = 64u;
public const val `LOGON_USED_LM_PASSWORD`: `MSV_SUB_AUTHENTICATION_FILTER` = 8u;
public const val `LOGON_WINLOGON`: UInt = 32768u;
public const val `LOOKUP_TRANSLATE_NAMES`: UInt = 2048u;
public const val `LOOKUP_VIEW_LOCAL_INFORMATION`: UInt = 1u;
public const val `LSAD_AES_BLOCK_SIZE`: UInt = 16u;
public const val `LSAD_AES_CRYPT_SHA512_HASH_SIZE`: UInt = 64u;
public const val `LSAD_AES_KEY_SIZE`: UInt = 16u;
public const val `LSAD_AES_SALT_SIZE`: UInt = 16u;
public const val `LSASETCAPS_RELOAD_FLAG`: UInt = 1u;
public const val `LSASETCAPS_VALID_FLAG_MASK`: UInt = 1u;
// UNSUPPORTED Rust 1666:1: non-scalar type Ptr unsupported
// pub const LSA_ADT_LEGACY_SECURITY_SOURCE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Security");

// UNSUPPORTED Rust 1667:1: non-scalar type Ptr unsupported
// pub const LSA_ADT_SECURITY_SOURCE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft-Windows-Security-Auditing");

// UNSUPPORTED Rust 1668:1: non-scalar type Ptr unsupported
// pub const LSA_AP_NAME_CALL_PACKAGE: windows_sys::core::PCSTR = windows_sys::core::s!("LsaApCallPackage\u{0}");

// UNSUPPORTED Rust 1669:1: non-scalar type Ptr unsupported
// pub const LSA_AP_NAME_CALL_PACKAGE_PASSTHROUGH: windows_sys::core::PCSTR = windows_sys::core::s!("LsaApCallPackagePassthrough\u{0}");

// UNSUPPORTED Rust 1670:1: non-scalar type Ptr unsupported
// pub const LSA_AP_NAME_CALL_PACKAGE_UNTRUSTED: windows_sys::core::PCSTR = windows_sys::core::s!("LsaApCallPackageUntrusted\u{0}");

// UNSUPPORTED Rust 1671:1: non-scalar type Ptr unsupported
// pub const LSA_AP_NAME_INITIALIZE_PACKAGE: windows_sys::core::PCSTR = windows_sys::core::s!("LsaApInitializePackage\u{0}");

// UNSUPPORTED Rust 1672:1: non-scalar type Ptr unsupported
// pub const LSA_AP_NAME_LOGON_TERMINATED: windows_sys::core::PCSTR = windows_sys::core::s!("LsaApLogonTerminated\u{0}");

// UNSUPPORTED Rust 1673:1: non-scalar type Ptr unsupported
// pub const LSA_AP_NAME_LOGON_USER: windows_sys::core::PCSTR = windows_sys::core::s!("LsaApLogonUser\u{0}");

// UNSUPPORTED Rust 1674:1: non-scalar type Ptr unsupported
// pub const LSA_AP_NAME_LOGON_USER_EX: windows_sys::core::PCSTR = windows_sys::core::s!("LsaApLogonUserEx\u{0}");

// UNSUPPORTED Rust 1675:1: non-scalar type Ptr unsupported
// pub const LSA_AP_NAME_LOGON_USER_EX2: windows_sys::core::PCSTR = windows_sys::core::s!("LsaApLogonUserEx2\u{0}");

// UNSUPPORTED Rust 1676:1: generic scalar type unsupported
// pub type LSA_AP_POST_LOGON_USER = Option<unsafe extern "system" fn(postlogonuserinfo: *const SECPKG_POST_LOGON_USER_INFO) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1677:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LSA_AUTH_INFORMATION {
//     pub LastUpdateTime: i64,
//     pub AuthType: LSA_AUTH_INFORMATION_AUTH_TYPE,
//     pub AuthInfoLength: u32,
//     pub AuthInfo: *mut u8,
// }

// UNSUPPORTED Rust 1685:1: declaration Impl has no candidate rule
// impl Default for LSA_AUTH_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `LSA_AUTH_INFORMATION_AUTH_TYPE` = UInt;
public const val `LSA_CALL_LICENSE_SERVER`: UInt = 2147483648u;
// UNSUPPORTED Rust 1692:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct LSA_DISPATCH_TABLE {
//     pub CreateLogonSession: PLSA_CREATE_LOGON_SESSION,
//     pub DeleteLogonSession: PLSA_DELETE_LOGON_SESSION,
//     pub AddCredential: PLSA_ADD_CREDENTIAL,
//     pub GetCredentials: PLSA_GET_CREDENTIALS,
//     pub DeleteCredential: PLSA_DELETE_CREDENTIAL,
//     pub AllocateLsaHeap: PLSA_ALLOCATE_LSA_HEAP,
//     pub FreeLsaHeap: PLSA_FREE_LSA_HEAP,
//     pub AllocateClientBuffer: PLSA_ALLOCATE_CLIENT_BUFFER,
//     pub FreeClientBuffer: PLSA_FREE_CLIENT_BUFFER,
//     pub CopyToClientBuffer: PLSA_COPY_TO_CLIENT_BUFFER,
//     pub CopyFromClientBuffer: PLSA_COPY_FROM_CLIENT_BUFFER,
// }

// UNSUPPORTED Rust 1707:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LSA_ENUMERATION_INFORMATION {
//     pub Sid: super::super::PSID,
// }

// UNSUPPORTED Rust 1712:1: declaration Impl has no candidate rule
// impl Default for LSA_ENUMERATION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1717:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LSA_FOREST_TRUST_BINARY_DATA {
//     pub Length: u32,
//     pub Buffer: *mut u8,
// }

// UNSUPPORTED Rust 1723:1: declaration Impl has no candidate rule
// impl Default for LSA_FOREST_TRUST_BINARY_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1728:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LSA_FOREST_TRUST_COLLISION_INFORMATION {
//     pub RecordCount: u32,
//     pub Entries: *mut *mut LSA_FOREST_TRUST_COLLISION_RECORD,
// }

// UNSUPPORTED Rust 1734:1: declaration Impl has no candidate rule
// impl Default for LSA_FOREST_TRUST_COLLISION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1739:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct LSA_FOREST_TRUST_COLLISION_RECORD {
//     pub Index: u32,
//     pub Type: LSA_FOREST_TRUST_COLLISION_RECORD_TYPE,
//     pub Flags: u32,
//     pub Name: LSA_UNICODE_STRING,
// }

public typealias `LSA_FOREST_TRUST_COLLISION_RECORD_TYPE` = Int;
// UNSUPPORTED Rust 1748:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LSA_FOREST_TRUST_DOMAIN_INFO {
//     pub Sid: super::super::PSID,
//     pub DnsName: LSA_UNICODE_STRING,
//     pub NetbiosName: LSA_UNICODE_STRING,
// }

// UNSUPPORTED Rust 1755:1: declaration Impl has no candidate rule
// impl Default for LSA_FOREST_TRUST_DOMAIN_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1760:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LSA_FOREST_TRUST_INFORMATION {
//     pub RecordCount: u32,
//     pub Entries: *mut *mut LSA_FOREST_TRUST_RECORD,
// }

// UNSUPPORTED Rust 1766:1: declaration Impl has no candidate rule
// impl Default for LSA_FOREST_TRUST_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1771:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LSA_FOREST_TRUST_INFORMATION2 {
//     pub RecordCount: u32,
//     pub Entries: *mut *mut LSA_FOREST_TRUST_RECORD2,
// }

// UNSUPPORTED Rust 1777:1: declaration Impl has no candidate rule
// impl Default for LSA_FOREST_TRUST_INFORMATION2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1782:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LSA_FOREST_TRUST_RECORD {
//     pub Flags: u32,
//     pub ForestTrustType: LSA_FOREST_TRUST_RECORD_TYPE,
//     pub Time: i64,
//     pub ForestTrustData: LSA_FOREST_TRUST_RECORD_0,
// }

// UNSUPPORTED Rust 1790:1: declaration Impl has no candidate rule
// impl Default for LSA_FOREST_TRUST_RECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1795:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union LSA_FOREST_TRUST_RECORD_0 {
//     pub TopLevelName: LSA_UNICODE_STRING,
//     pub DomainInfo: LSA_FOREST_TRUST_DOMAIN_INFO,
//     pub Data: LSA_FOREST_TRUST_BINARY_DATA,
// }

// UNSUPPORTED Rust 1802:1: declaration Impl has no candidate rule
// impl Default for LSA_FOREST_TRUST_RECORD_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1807:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LSA_FOREST_TRUST_RECORD2 {
//     pub Flags: u32,
//     pub ForestTrustType: LSA_FOREST_TRUST_RECORD_TYPE,
//     pub Time: i64,
//     pub ForestTrustData: LSA_FOREST_TRUST_RECORD2_0,
// }

// UNSUPPORTED Rust 1815:1: declaration Impl has no candidate rule
// impl Default for LSA_FOREST_TRUST_RECORD2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1820:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union LSA_FOREST_TRUST_RECORD2_0 {
//     pub TopLevelName: LSA_UNICODE_STRING,
//     pub DomainInfo: LSA_FOREST_TRUST_DOMAIN_INFO,
//     pub BinaryData: LSA_FOREST_TRUST_BINARY_DATA,
//     pub ScannerInfo: LSA_FOREST_TRUST_SCANNER_INFO,
// }

// UNSUPPORTED Rust 1828:1: declaration Impl has no candidate rule
// impl Default for LSA_FOREST_TRUST_RECORD2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `LSA_FOREST_TRUST_RECORD_TYPE` = Int;
public const val `LSA_FOREST_TRUST_RECORD_TYPE_UNRECOGNIZED`: UInt = 2147483648u;
// UNSUPPORTED Rust 1835:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LSA_FOREST_TRUST_SCANNER_INFO {
//     pub DomainSid: super::super::PSID,
//     pub DnsName: LSA_UNICODE_STRING,
//     pub NetbiosName: LSA_UNICODE_STRING,
// }

// UNSUPPORTED Rust 1842:1: declaration Impl has no candidate rule
// impl Default for LSA_FOREST_TRUST_SCANNER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LSA_FTRECORD_DISABLED_REASONS`: Int = 65535;
// UNSUPPORTED Rust 1848:1: non-scalar type Ptr unsupported
// pub const LSA_GLOBAL_SECRET_PREFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("G$");

public const val `LSA_GLOBAL_SECRET_PREFIX_LENGTH`: UInt = 2u;
public typealias `LSA_HANDLE` = Long;
// UNSUPPORTED Rust 1851:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct LSA_LAST_INTER_LOGON_INFO {
//     pub LastSuccessfulLogon: i64,
//     pub LastFailedLogon: i64,
//     pub FailedAttemptCountSinceLastSuccessfulLogon: u32,
// }

// UNSUPPORTED Rust 1858:1: non-scalar type Ptr unsupported
// pub const LSA_LOCAL_SECRET_PREFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("L$");

public const val `LSA_LOCAL_SECRET_PREFIX_LENGTH`: UInt = 2u;
public const val `LSA_LOOKUP_DISALLOW_CONNECTED_ACCOUNT_INTERNET_SID`: UInt = 2147483648u;
public typealias `LSA_LOOKUP_DOMAIN_INFO_CLASS` = Int;
public const val `LSA_LOOKUP_ISOLATED_AS_LOCAL`: UInt = 2147483648u;
public const val `LSA_LOOKUP_PREFER_INTERNET_NAMES`: UInt = 1073741824u;
// UNSUPPORTED Rust 1864:1: non-scalar type Ptr unsupported
// pub const LSA_MACHINE_SECRET_PREFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("M$");

public const val `LSA_MAXIMUM_ENUMERATION_LENGTH`: UInt = 32000u;
public const val `LSA_MAXIMUM_SID_COUNT`: Int = 256;
public const val `LSA_MODE_INDIVIDUAL_ACCOUNTS`: Int = 2;
public const val `LSA_MODE_LOG_FULL`: Int = 8;
public const val `LSA_MODE_MANDATORY_ACCESS`: Int = 4;
public const val `LSA_MODE_PASSWORD_PROTECTED`: Int = 1;
public const val `LSA_NB_DISABLED_ADMIN`: Int = 4;
public const val `LSA_NB_DISABLED_CONFLICT`: Int = 8;
// UNSUPPORTED Rust 1873:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LSA_OBJECT_ATTRIBUTES {
//     pub Length: u32,
//     pub RootDirectory: super::super::super::Foundation::HANDLE,
//     pub ObjectName: *mut LSA_UNICODE_STRING,
//     pub Attributes: u32,
//     pub SecurityDescriptor: *mut core::ffi::c_void,
//     pub SecurityQualityOfService: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1883:1: declaration Impl has no candidate rule
// impl Default for LSA_OBJECT_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LSA_QUERY_CLIENT_PRELOGON_SESSION_ID`: UInt = 1u;
// UNSUPPORTED Rust 1889:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LSA_REFERENCED_DOMAIN_LIST {
//     pub Entries: u32,
//     pub Domains: *mut LSA_TRUST_INFORMATION,
// }

// UNSUPPORTED Rust 1895:1: declaration Impl has no candidate rule
// impl Default for LSA_REFERENCED_DOMAIN_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LSA_SCANNER_INFO_ADMIN_ALL_FLAGS`: Int = 1;
public const val `LSA_SCANNER_INFO_DISABLE_AUTH_TARGET_VALIDATION`: Int = 1;
// UNSUPPORTED Rust 1902:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Security_Credentials", feature = "Win32_System_Threading"))]
// #[derive(Clone, Copy, Default)]
// pub struct LSA_SECPKG_FUNCTION_TABLE {
//     pub CreateLogonSession: PLSA_CREATE_LOGON_SESSION,
//     pub DeleteLogonSession: PLSA_DELETE_LOGON_SESSION,
//     pub AddCredential: PLSA_ADD_CREDENTIAL,
//     pub GetCredentials: PLSA_GET_CREDENTIALS,
//     pub DeleteCredential: PLSA_DELETE_CREDENTIAL,
//     pub AllocateLsaHeap: PLSA_ALLOCATE_LSA_HEAP,
//     pub FreeLsaHeap: PLSA_FREE_LSA_HEAP,
//     pub AllocateClientBuffer: PLSA_ALLOCATE_CLIENT_BUFFER,
//     pub FreeClientBuffer: PLSA_FREE_CLIENT_BUFFER,
//     pub CopyToClientBuffer: PLSA_COPY_TO_CLIENT_BUFFER,
//     pub CopyFromClientBuffer: PLSA_COPY_FROM_CLIENT_BUFFER,
//     pub ImpersonateClient: PLSA_IMPERSONATE_CLIENT,
//     pub UnloadPackage: PLSA_UNLOAD_PACKAGE,
//     pub DuplicateHandle: PLSA_DUPLICATE_HANDLE,
//     pub SaveSupplementalCredentials: PLSA_SAVE_SUPPLEMENTAL_CREDENTIALS,
//     pub CreateThread: PLSA_CREATE_THREAD,
//     pub GetClientInfo: PLSA_GET_CLIENT_INFO,
//     pub RegisterNotification: PLSA_REGISTER_NOTIFICATION,
//     pub CancelNotification: PLSA_CANCEL_NOTIFICATION,
//     pub MapBuffer: PLSA_MAP_BUFFER,
//     pub CreateToken: PLSA_CREATE_TOKEN,
//     pub AuditLogon: PLSA_AUDIT_LOGON,
//     pub CallPackage: PLSA_CALL_PACKAGE,
//     pub FreeReturnBuffer: PLSA_FREE_LSA_HEAP,
//     pub GetCallInfo: PLSA_GET_CALL_INFO,
//     pub CallPackageEx: PLSA_CALL_PACKAGEEX,
//     pub CreateSharedMemory: PLSA_CREATE_SHARED_MEMORY,
//     pub AllocateSharedMemory: PLSA_ALLOCATE_SHARED_MEMORY,
//     pub FreeSharedMemory: PLSA_FREE_SHARED_MEMORY,
//     pub DeleteSharedMemory: PLSA_DELETE_SHARED_MEMORY,
//     pub OpenSamUser: PLSA_OPEN_SAM_USER,
//     pub GetUserCredentials: PLSA_GET_USER_CREDENTIALS,
//     pub GetUserAuthData: PLSA_GET_USER_AUTH_DATA,
//     pub CloseSamUser: PLSA_CLOSE_SAM_USER,
//     pub ConvertAuthDataToToken: PLSA_CONVERT_AUTH_DATA_TO_TOKEN,
//     pub ClientCallback: PLSA_CLIENT_CALLBACK,
//     pub UpdateCredentials: PLSA_UPDATE_PRIMARY_CREDENTIALS,
//     pub GetAuthDataForUser: PLSA_GET_AUTH_DATA_FOR_USER,
//     pub CrackSingleName: PLSA_CRACK_SINGLE_NAME,
//     pub AuditAccountLogon: PLSA_AUDIT_ACCOUNT_LOGON,
//     pub CallPackagePassthrough: PLSA_CALL_PACKAGE_PASSTHROUGH,
//     pub CrediRead: CredReadFn,
//     pub CrediReadDomainCredentials: CredReadDomainCredentialsFn,
//     pub CrediFreeCredentials: CredFreeCredentialsFn,
//     pub LsaProtectMemory: PLSA_PROTECT_MEMORY,
//     pub LsaUnprotectMemory: PLSA_PROTECT_MEMORY,
//     pub OpenTokenByLogonId: PLSA_OPEN_TOKEN_BY_LOGON_ID,
//     pub ExpandAuthDataForDomain: PLSA_EXPAND_AUTH_DATA_FOR_DOMAIN,
//     pub AllocatePrivateHeap: PLSA_ALLOCATE_PRIVATE_HEAP,
//     pub FreePrivateHeap: PLSA_FREE_PRIVATE_HEAP,
//     pub CreateTokenEx: PLSA_CREATE_TOKEN_EX,
//     pub CrediWrite: CredWriteFn,
//     pub CrediUnmarshalandDecodeString: CrediUnmarshalandDecodeStringFn,
//     pub DummyFunction6: PLSA_PROTECT_MEMORY,
//     pub GetExtendedCallFlags: PLSA_GET_EXTENDED_CALL_FLAGS,
//     pub DuplicateTokenHandle: PLSA_DUPLICATE_HANDLE,
//     pub GetServiceAccountPassword: PLSA_GET_SERVICE_ACCOUNT_PASSWORD,
//     pub DummyFunction7: PLSA_PROTECT_MEMORY,
//     pub AuditLogonEx: PLSA_AUDIT_LOGON_EX,
//     pub CheckProtectedUserByToken: PLSA_CHECK_PROTECTED_USER_BY_TOKEN,
//     pub QueryClientRequest: PLSA_QUERY_CLIENT_REQUEST,
//     pub GetAppModeInfo: PLSA_GET_APP_MODE_INFO,
//     pub SetAppModeInfo: PLSA_SET_APP_MODE_INFO,
//     pub GetClientInfoEx: PLSA_GET_CLIENT_INFO_EX,
// }

public const val `LSA_SECRET_MAXIMUM_COUNT`: Int = 4096;
public const val `LSA_SECRET_MAXIMUM_LENGTH`: Int = 512;
public const val `LSA_SID_DISABLED_ADMIN`: Int = 1;
public const val `LSA_SID_DISABLED_CONFLICT`: Int = 2;
// UNSUPPORTED Rust 1975:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LSA_STRING {
//     pub Length: u16,
//     pub MaximumLength: u16,
//     pub Buffer: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 1982:1: declaration Impl has no candidate rule
// impl Default for LSA_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LSA_TLN_DISABLED_ADMIN`: Int = 2;
public const val `LSA_TLN_DISABLED_CONFLICT`: Int = 4;
public const val `LSA_TLN_DISABLED_NEW`: Int = 1;
// UNSUPPORTED Rust 1990:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LSA_TOKEN_INFORMATION_NULL {
//     pub ExpirationTime: i64,
//     pub Groups: *mut super::super::TOKEN_GROUPS,
// }

// UNSUPPORTED Rust 1996:1: declaration Impl has no candidate rule
// impl Default for LSA_TOKEN_INFORMATION_NULL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `LSA_TOKEN_INFORMATION_TYPE` = Int;
// UNSUPPORTED Rust 2002:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LSA_TOKEN_INFORMATION_V1 {
//     pub ExpirationTime: i64,
//     pub User: super::super::TOKEN_USER,
//     pub Groups: *mut super::super::TOKEN_GROUPS,
//     pub PrimaryGroup: super::super::TOKEN_PRIMARY_GROUP,
//     pub Privileges: *mut super::super::TOKEN_PRIVILEGES,
//     pub Owner: super::super::TOKEN_OWNER,
//     pub DefaultDacl: super::super::TOKEN_DEFAULT_DACL,
// }

// UNSUPPORTED Rust 2013:1: declaration Impl has no candidate rule
// impl Default for LSA_TOKEN_INFORMATION_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2018:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LSA_TOKEN_INFORMATION_V3 {
//     pub ExpirationTime: i64,
//     pub User: super::super::TOKEN_USER,
//     pub Groups: *mut super::super::TOKEN_GROUPS,
//     pub PrimaryGroup: super::super::TOKEN_PRIMARY_GROUP,
//     pub Privileges: *mut super::super::TOKEN_PRIVILEGES,
//     pub Owner: super::super::TOKEN_OWNER,
//     pub DefaultDacl: super::super::TOKEN_DEFAULT_DACL,
//     pub UserClaims: super::super::TOKEN_USER_CLAIMS,
//     pub DeviceClaims: super::super::TOKEN_DEVICE_CLAIMS,
//     pub DeviceGroups: *mut super::super::TOKEN_GROUPS,
// }

// UNSUPPORTED Rust 2032:1: declaration Impl has no candidate rule
// impl Default for LSA_TOKEN_INFORMATION_V3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2037:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct LSA_TRANSLATED_NAME {
//     pub Use: super::super::SID_NAME_USE,
//     pub Name: LSA_UNICODE_STRING,
//     pub DomainIndex: i32,
// }

// UNSUPPORTED Rust 2044:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct LSA_TRANSLATED_SID {
//     pub Use: super::super::SID_NAME_USE,
//     pub RelativeId: u32,
//     pub DomainIndex: i32,
// }

// UNSUPPORTED Rust 2051:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LSA_TRANSLATED_SID2 {
//     pub Use: super::super::SID_NAME_USE,
//     pub Sid: super::super::PSID,
//     pub DomainIndex: i32,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 2059:1: declaration Impl has no candidate rule
// impl Default for LSA_TRANSLATED_SID2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2064:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LSA_TRUST_INFORMATION {
//     pub Name: LSA_UNICODE_STRING,
//     pub Sid: super::super::PSID,
// }

// UNSUPPORTED Rust 2070:1: declaration Impl has no candidate rule
// impl Default for LSA_TRUST_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2075:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LSA_UNICODE_STRING {
//     pub Length: u16,
//     pub MaximumLength: u16,
//     pub Buffer: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2082:1: declaration Impl has no candidate rule
// impl Default for LSA_UNICODE_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LocalUserCredKey`: `MSV1_0_CREDENTIAL_KEY_TYPE` = 3;
public const val `LsaTokenInformationNull`: `LSA_TOKEN_INFORMATION_TYPE` = 0;
public const val `LsaTokenInformationV1`: `LSA_TOKEN_INFORMATION_TYPE` = 1;
public const val `LsaTokenInformationV2`: `LSA_TOKEN_INFORMATION_TYPE` = 2;
public const val `LsaTokenInformationV3`: `LSA_TOKEN_INFORMATION_TYPE` = 3;
// UNSUPPORTED Rust 2092:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type MAKE_SIGNATURE_FN = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: u32, param2: *mut SecBufferDesc, param3: u32) -> windows_sys::core::HRESULT>;

public const val `MAXIMUM_CAPES_PER_CAP`: UInt = 127u;
public const val `MAX_CRED_SIZE`: UInt = 1024u;
public const val `MAX_PROTOCOL_ID_SIZE`: UInt = 255u;
public const val `MAX_RECORDS_IN_FOREST_TRUST_INFO`: UInt = 4000u;
public const val `MAX_USER_RECORDS`: UInt = 1000u;
// UNSUPPORTED Rust 2099:1: non-scalar type Ptr unsupported
// pub const MICROSOFT_KERBEROS_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Kerberos");

// UNSUPPORTED Rust 2100:1: non-scalar type Ptr unsupported
// pub const MICROSOFT_KERBEROS_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("Kerberos");

// UNSUPPORTED Rust 2101:1: non-scalar type Ptr unsupported
// pub const MICROSOFT_KERBEROS_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Kerberos");

public typealias `MSV1_0` = UInt;
public const val `MSV1_0_ALLOW_FORCE_GUEST`: UInt = 8192u;
public const val `MSV1_0_ALLOW_MSVCHAPV2`: UInt = 65536u;
public const val `MSV1_0_ALLOW_SERVER_TRUST_ACCOUNT`: `MSV_SUBAUTH_LOGON_PARAMETER_CONTROL` = 32u;
public const val `MSV1_0_ALLOW_WORKSTATION_TRUST_ACCOUNT`: `MSV_SUBAUTH_LOGON_PARAMETER_CONTROL` = 2048u;
public typealias `MSV1_0_AVID` = Int;
public const val `MSV1_0_AV_FLAG_FORCE_GUEST`: UInt = 1u;
public const val `MSV1_0_AV_FLAG_MIC_HANDSHAKE_MESSAGES`: UInt = 2u;
public const val `MSV1_0_AV_FLAG_UNVERIFIED_TARGET`: UInt = 4u;
// UNSUPPORTED Rust 2111:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MSV1_0_AV_PAIR {
//     pub AvId: u16,
//     pub AvLen: u16,
// }

public const val `MSV1_0_CHALLENGE_LENGTH`: UInt = 8u;
// UNSUPPORTED Rust 2118:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MSV1_0_CHANGEPASSWORD_REQUEST {
//     pub MessageType: MSV1_0_PROTOCOL_MESSAGE_TYPE,
//     pub DomainName: LSA_UNICODE_STRING,
//     pub AccountName: LSA_UNICODE_STRING,
//     pub OldPassword: LSA_UNICODE_STRING,
//     pub NewPassword: LSA_UNICODE_STRING,
//     pub Impersonating: bool,
// }

// UNSUPPORTED Rust 2128:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MSV1_0_CHANGEPASSWORD_RESPONSE {
//     pub MessageType: MSV1_0_PROTOCOL_MESSAGE_TYPE,
//     pub PasswordInfoValid: bool,
//     pub DomainPasswordInfo: DOMAIN_PASSWORD_INFORMATION,
// }

public const val `MSV1_0_CHECK_LOGONHOURS_FOR_S4U`: UInt = 262144u;
public const val `MSV1_0_CLEARTEXT_PASSWORD_ALLOWED`: `MSV_SUBAUTH_LOGON_PARAMETER_CONTROL` = 2u;
public const val `MSV1_0_CLEARTEXT_PASSWORD_SUPPLIED`: UInt = 16384u;
// UNSUPPORTED Rust 2138:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MSV1_0_CREDENTIAL_KEY {
//     pub Data: [u8; 20],
// }

// UNSUPPORTED Rust 2143:1: declaration Impl has no candidate rule
// impl Default for MSV1_0_CREDENTIAL_KEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MSV1_0_CREDENTIAL_KEY_LENGTH`: UInt = 20u;
public typealias `MSV1_0_CREDENTIAL_KEY_TYPE` = Int;
public const val `MSV1_0_CRED_CREDKEY_PRESENT`: UInt = 8u;
public const val `MSV1_0_CRED_LM_PRESENT`: `MSV_SUPPLEMENTAL_CREDENTIAL_FLAGS` = 1u;
public const val `MSV1_0_CRED_NT_PRESENT`: `MSV_SUPPLEMENTAL_CREDENTIAL_FLAGS` = 2u;
public const val `MSV1_0_CRED_REMOVED`: UInt = 4u;
public const val `MSV1_0_CRED_SHA_PRESENT`: UInt = 16u;
public const val `MSV1_0_CRED_VERSION`: `MSV_SUPPLEMENTAL_CREDENTIAL_FLAGS` = 0u;
public const val `MSV1_0_CRED_VERSION_ARSO`: UInt = 4294901763u;
public const val `MSV1_0_CRED_VERSION_INVALID`: UInt = 4294967295u;
public const val `MSV1_0_CRED_VERSION_IUM`: UInt = 4294901761u;
public const val `MSV1_0_CRED_VERSION_REMOTE`: UInt = 4294901762u;
public const val `MSV1_0_CRED_VERSION_RESERVED_1`: UInt = 4294967294u;
public const val `MSV1_0_CRED_VERSION_V2`: UInt = 2u;
public const val `MSV1_0_CRED_VERSION_V3`: UInt = 4u;
public const val `MSV1_0_DISABLE_PERSONAL_FALLBACK`: UInt = 4096u;
public const val `MSV1_0_DONT_TRY_GUEST_ACCOUNT`: `MSV_SUBAUTH_LOGON_PARAMETER_CONTROL` = 16u;
public const val `MSV1_0_GUEST_LOGON`: `MSV1_0` = 2u;
// UNSUPPORTED Rust 2166:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MSV1_0_INTERACTIVE_LOGON {
//     pub MessageType: MSV1_0_LOGON_SUBMIT_TYPE,
//     pub LogonDomainName: LSA_UNICODE_STRING,
//     pub UserName: LSA_UNICODE_STRING,
//     pub Password: LSA_UNICODE_STRING,
// }

// UNSUPPORTED Rust 2174:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MSV1_0_INTERACTIVE_PROFILE {
//     pub MessageType: MSV1_0_PROFILE_BUFFER_TYPE,
//     pub LogonCount: u16,
//     pub BadPasswordCount: u16,
//     pub LogonTime: i64,
//     pub LogoffTime: i64,
//     pub KickOffTime: i64,
//     pub PasswordLastSet: i64,
//     pub PasswordCanChange: i64,
//     pub PasswordMustChange: i64,
//     pub LogonScript: LSA_UNICODE_STRING,
//     pub HomeDirectory: LSA_UNICODE_STRING,
//     pub FullName: LSA_UNICODE_STRING,
//     pub ProfilePath: LSA_UNICODE_STRING,
//     pub HomeDirectoryDrive: LSA_UNICODE_STRING,
//     pub LogonServer: LSA_UNICODE_STRING,
//     pub UserFlags: u32,
// }

public const val `MSV1_0_INTERNET_DOMAIN`: UInt = 524288u;
// UNSUPPORTED Rust 2195:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MSV1_0_IUM_SUPPLEMENTAL_CREDENTIAL {
//     pub Version: u32,
//     pub EncryptedCredsSize: u32,
//     pub EncryptedCreds: [u8; 1],
// }

// UNSUPPORTED Rust 2202:1: declaration Impl has no candidate rule
// impl Default for MSV1_0_IUM_SUPPLEMENTAL_CREDENTIAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MSV1_0_LANMAN_SESSION_KEY_LENGTH`: UInt = 8u;
// UNSUPPORTED Rust 2208:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MSV1_0_LM20_LOGON {
//     pub MessageType: MSV1_0_LOGON_SUBMIT_TYPE,
//     pub LogonDomainName: LSA_UNICODE_STRING,
//     pub UserName: LSA_UNICODE_STRING,
//     pub Workstation: LSA_UNICODE_STRING,
//     pub ChallengeToClient: [u8; 8],
//     pub CaseSensitiveChallengeResponse: LSA_STRING,
//     pub CaseInsensitiveChallengeResponse: LSA_STRING,
//     pub ParameterControl: u32,
// }

// UNSUPPORTED Rust 2220:1: declaration Impl has no candidate rule
// impl Default for MSV1_0_LM20_LOGON {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2225:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MSV1_0_LM20_LOGON_PROFILE {
//     pub MessageType: MSV1_0_PROFILE_BUFFER_TYPE,
//     pub KickOffTime: i64,
//     pub LogoffTime: i64,
//     pub UserFlags: MSV_SUB_AUTHENTICATION_FILTER,
//     pub UserSessionKey: [u8; 16],
//     pub LogonDomainName: LSA_UNICODE_STRING,
//     pub LanmanSessionKey: [u8; 8],
//     pub LogonServer: LSA_UNICODE_STRING,
//     pub UserParameters: LSA_UNICODE_STRING,
// }

// UNSUPPORTED Rust 2238:1: declaration Impl has no candidate rule
// impl Default for MSV1_0_LM20_LOGON_PROFILE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MSV1_0_LOGON_SUBMIT_TYPE` = Int;
public const val `MSV1_0_MAX_AVL_SIZE`: UInt = 64000u;
public const val `MSV1_0_MAX_NTLM3_LIFE`: UInt = 1800u;
public const val `MSV1_0_MNS_LOGON`: UInt = 16777216u;
public const val `MSV1_0_NTLM3_OWF_LENGTH`: UInt = 16u;
// UNSUPPORTED Rust 2248:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MSV1_0_NTLM3_RESPONSE {
//     pub Response: [u8; 16],
//     pub RespType: u8,
//     pub HiRespType: u8,
//     pub Flags: u16,
//     pub MsgWord: u32,
//     pub TimeStamp: u64,
//     pub ChallengeFromClient: [u8; 8],
//     pub AvPairsOff: u32,
//     pub Buffer: [u8; 1],
// }

// UNSUPPORTED Rust 2261:1: declaration Impl has no candidate rule
// impl Default for MSV1_0_NTLM3_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MSV1_0_NTLM3_RESPONSE_LENGTH`: UInt = 16u;
public const val `MSV1_0_OWF_PASSWORD_LENGTH`: UInt = 16u;
// UNSUPPORTED Rust 2268:1: non-scalar type Ptr unsupported
// pub const MSV1_0_PACKAGE_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("MICROSOFT_AUTHENTICATION_PACKAGE_V1_0");

// UNSUPPORTED Rust 2269:1: non-scalar type Ptr unsupported
// pub const MSV1_0_PACKAGE_NAMEW: windows_sys::core::PCWSTR = windows_sys::core::w!("MICROSOFT_AUTHENTICATION_PACKAGE_V1_0");

// UNSUPPORTED Rust 2270:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MSV1_0_PASSTHROUGH_REQUEST {
//     pub MessageType: MSV1_0_PROTOCOL_MESSAGE_TYPE,
//     pub DomainName: LSA_UNICODE_STRING,
//     pub PackageName: LSA_UNICODE_STRING,
//     pub DataLength: u32,
//     pub LogonData: *mut u8,
//     pub Pad: u32,
// }

// UNSUPPORTED Rust 2280:1: declaration Impl has no candidate rule
// impl Default for MSV1_0_PASSTHROUGH_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2285:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MSV1_0_PASSTHROUGH_RESPONSE {
//     pub MessageType: MSV1_0_PROTOCOL_MESSAGE_TYPE,
//     pub Pad: u32,
//     pub DataLength: u32,
//     pub ValidationData: *mut u8,
// }

// UNSUPPORTED Rust 2293:1: declaration Impl has no candidate rule
// impl Default for MSV1_0_PASSTHROUGH_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MSV1_0_PASSTHRU`: `MSV1_0` = 1u;
public typealias `MSV1_0_PROFILE_BUFFER_TYPE` = Int;
public typealias `MSV1_0_PROTOCOL_MESSAGE_TYPE` = Int;
// UNSUPPORTED Rust 2301:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MSV1_0_REMOTE_SUPPLEMENTAL_CREDENTIAL {
//     pub Version: u32,
//     pub Flags: u32,
//     pub CredentialKey: MSV1_0_CREDENTIAL_KEY,
//     pub CredentialKeyType: MSV1_0_CREDENTIAL_KEY_TYPE,
//     pub EncryptedCredsSize: u32,
//     pub EncryptedCreds: [u8; 1],
// }

// UNSUPPORTED Rust 2311:1: declaration Impl has no candidate rule
// impl Default for MSV1_0_REMOTE_SUPPLEMENTAL_CREDENTIAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MSV1_0_RETURN_PASSWORD_EXPIRY`: `MSV_SUBAUTH_LOGON_PARAMETER_CONTROL` = 64u;
public const val `MSV1_0_RETURN_PROFILE_PATH`: `MSV_SUBAUTH_LOGON_PARAMETER_CONTROL` = 512u;
public const val `MSV1_0_RETURN_USER_PARAMETERS`: `MSV_SUBAUTH_LOGON_PARAMETER_CONTROL` = 8u;
public const val `MSV1_0_S4U2SELF`: UInt = 131072u;
// UNSUPPORTED Rust 2320:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MSV1_0_S4U_LOGON {
//     pub MessageType: MSV1_0_LOGON_SUBMIT_TYPE,
//     pub Flags: u32,
//     pub UserPrincipalName: LSA_UNICODE_STRING,
//     pub DomainName: LSA_UNICODE_STRING,
// }

public const val `MSV1_0_S4U_LOGON_FLAG_CHECK_LOGONHOURS`: UInt = 2u;
public const val `MSV1_0_SHA_PASSWORD_LENGTH`: UInt = 20u;
public const val `MSV1_0_SUBAUTHENTICATION_DLL`: UInt = 4278190080u;
public const val `MSV1_0_SUBAUTHENTICATION_DLL_EX`: UInt = 1048576u;
public const val `MSV1_0_SUBAUTHENTICATION_DLL_IIS`: UInt = 132u;
public const val `MSV1_0_SUBAUTHENTICATION_DLL_RAS`: UInt = 2u;
public const val `MSV1_0_SUBAUTHENTICATION_DLL_SHIFT`: UInt = 24u;
public const val `MSV1_0_SUBAUTHENTICATION_FLAGS`: UInt = 4278190080u;
// UNSUPPORTED Rust 2336:1: non-scalar type Ptr unsupported
// pub const MSV1_0_SUBAUTHENTICATION_KEY: windows_sys::core::PCSTR = windows_sys::core::s!("SYSTEM\\CurrentControlSet\\Control\\Lsa\\MSV1_0");

// UNSUPPORTED Rust 2337:1: non-scalar type Ptr unsupported
// pub const MSV1_0_SUBAUTHENTICATION_VALUE: windows_sys::core::PCSTR = windows_sys::core::s!("Auth");

public const val `MSV1_0_SUBAUTH_ACCOUNT_DISABLED`: UInt = 1u;
public const val `MSV1_0_SUBAUTH_ACCOUNT_EXPIRY`: UInt = 16u;
public const val `MSV1_0_SUBAUTH_ACCOUNT_TYPE`: UInt = 64u;
public const val `MSV1_0_SUBAUTH_LOCKOUT`: UInt = 128u;
// UNSUPPORTED Rust 2342:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MSV1_0_SUBAUTH_LOGON {
//     pub MessageType: MSV1_0_LOGON_SUBMIT_TYPE,
//     pub LogonDomainName: LSA_UNICODE_STRING,
//     pub UserName: LSA_UNICODE_STRING,
//     pub Workstation: LSA_UNICODE_STRING,
//     pub ChallengeToClient: [u8; 8],
//     pub AuthenticationInfo1: LSA_STRING,
//     pub AuthenticationInfo2: LSA_STRING,
//     pub ParameterControl: MSV_SUBAUTH_LOGON_PARAMETER_CONTROL,
//     pub SubAuthPackageId: u32,
// }

// UNSUPPORTED Rust 2355:1: declaration Impl has no candidate rule
// impl Default for MSV1_0_SUBAUTH_LOGON {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MSV1_0_SUBAUTH_LOGON_HOURS`: UInt = 8u;
public const val `MSV1_0_SUBAUTH_PASSWORD`: UInt = 2u;
public const val `MSV1_0_SUBAUTH_PASSWORD_EXPIRY`: UInt = 32u;
// UNSUPPORTED Rust 2363:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MSV1_0_SUBAUTH_REQUEST {
//     pub MessageType: MSV1_0_PROTOCOL_MESSAGE_TYPE,
//     pub SubAuthPackageId: u32,
//     pub SubAuthInfoLength: u32,
//     pub SubAuthSubmitBuffer: *mut u8,
// }

// UNSUPPORTED Rust 2371:1: declaration Impl has no candidate rule
// impl Default for MSV1_0_SUBAUTH_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2376:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MSV1_0_SUBAUTH_RESPONSE {
//     pub MessageType: MSV1_0_PROTOCOL_MESSAGE_TYPE,
//     pub SubAuthInfoLength: u32,
//     pub SubAuthReturnBuffer: *mut u8,
// }

// UNSUPPORTED Rust 2383:1: declaration Impl has no candidate rule
// impl Default for MSV1_0_SUBAUTH_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MSV1_0_SUBAUTH_WORKSTATIONS`: UInt = 4u;
// UNSUPPORTED Rust 2389:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MSV1_0_SUPPLEMENTAL_CREDENTIAL {
//     pub Version: u32,
//     pub Flags: MSV_SUPPLEMENTAL_CREDENTIAL_FLAGS,
//     pub LmPassword: [u8; 16],
//     pub NtPassword: [u8; 16],
// }

// UNSUPPORTED Rust 2397:1: declaration Impl has no candidate rule
// impl Default for MSV1_0_SUPPLEMENTAL_CREDENTIAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2402:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MSV1_0_SUPPLEMENTAL_CREDENTIAL_V2 {
//     pub Version: u32,
//     pub Flags: u32,
//     pub NtPassword: [u8; 16],
//     pub CredentialKey: MSV1_0_CREDENTIAL_KEY,
// }

// UNSUPPORTED Rust 2410:1: declaration Impl has no candidate rule
// impl Default for MSV1_0_SUPPLEMENTAL_CREDENTIAL_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2415:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MSV1_0_SUPPLEMENTAL_CREDENTIAL_V3 {
//     pub Version: u32,
//     pub Flags: u32,
//     pub CredentialKeyType: MSV1_0_CREDENTIAL_KEY_TYPE,
//     pub NtPassword: [u8; 16],
//     pub CredentialKey: MSV1_0_CREDENTIAL_KEY,
//     pub ShaPassword: [u8; 20],
// }

// UNSUPPORTED Rust 2425:1: declaration Impl has no candidate rule
// impl Default for MSV1_0_SUPPLEMENTAL_CREDENTIAL_V3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MSV1_0_TRY_GUEST_ACCOUNT_ONLY`: `MSV_SUBAUTH_LOGON_PARAMETER_CONTROL` = 256u;
public const val `MSV1_0_TRY_SPECIFIED_DOMAIN_ONLY`: `MSV_SUBAUTH_LOGON_PARAMETER_CONTROL` = 1024u;
public const val `MSV1_0_UPDATE_LOGON_STATISTICS`: `MSV_SUBAUTH_LOGON_PARAMETER_CONTROL` = 4u;
public const val `MSV1_0_USER_SESSION_KEY_LENGTH`: UInt = 16u;
public const val `MSV1_0_USE_CLIENT_CHALLENGE`: UInt = 128u;
public const val `MSV1_0_USE_DOMAIN_FOR_ROUTING_ONLY`: UInt = 32768u;
// UNSUPPORTED Rust 2436:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_PasswordManagement")]
// #[derive(Clone, Copy, Default)]
// pub struct MSV1_0_VALIDATION_INFO {
//     pub LogoffTime: i64,
//     pub KickoffTime: i64,
//     pub LogonServer: LSA_UNICODE_STRING,
//     pub LogonDomainName: LSA_UNICODE_STRING,
//     pub SessionKey: USER_SESSION_KEY,
//     pub Authoritative: bool,
//     pub UserFlags: u32,
//     pub WhichFields: u32,
//     pub UserId: u32,
// }

public const val `MSV1_0_VALIDATION_KICKOFF_TIME`: UInt = 2u;
public const val `MSV1_0_VALIDATION_LOGOFF_TIME`: UInt = 1u;
public const val `MSV1_0_VALIDATION_LOGON_DOMAIN`: UInt = 8u;
public const val `MSV1_0_VALIDATION_LOGON_SERVER`: UInt = 4u;
public const val `MSV1_0_VALIDATION_SESSION_KEY`: UInt = 16u;
public const val `MSV1_0_VALIDATION_USER_FLAGS`: UInt = 32u;
public const val `MSV1_0_VALIDATION_USER_ID`: UInt = 64u;
public typealias `MSV_SUBAUTH_LOGON_PARAMETER_CONTROL` = UInt;
public typealias `MSV_SUB_AUTHENTICATION_FILTER` = UInt;
public typealias `MSV_SUPPLEMENTAL_CREDENTIAL_FLAGS` = UInt;
public const val `MsV1_0CacheLogon`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 8;
public const val `MsV1_0CacheLookup`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 11;
public const val `MsV1_0CacheLookupEx`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 17;
public const val `MsV1_0ChangeCachedPassword`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 6;
public const val `MsV1_0ChangePassword`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 5;
public const val `MsV1_0ClearCachedCredentials`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 14;
public const val `MsV1_0ConfigLocalAliases`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 13;
public const val `MsV1_0DecryptDpapiMasterKey`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 20;
public const val `MsV1_0DeleteTbalSecrets`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 24;
public const val `MsV1_0DeriveCredential`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 10;
public const val `MsV1_0EnumerateUsers`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 2;
public const val `MsV1_0GenericPassthrough`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 7;
public const val `MsV1_0GetCredentialKey`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 18;
public const val `MsV1_0GetStrongCredentialKey`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 21;
public const val `MsV1_0GetUserInfo`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 3;
public const val `MsV1_0InteractiveLogon`: `MSV1_0_LOGON_SUBMIT_TYPE` = 2;
public const val `MsV1_0InteractiveProfile`: `MSV1_0_PROFILE_BUFFER_TYPE` = 2;
public const val `MsV1_0Lm20ChallengeRequest`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 0;
public const val `MsV1_0Lm20GetChallengeResponse`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 1;
public const val `MsV1_0Lm20Logon`: `MSV1_0_LOGON_SUBMIT_TYPE` = 3;
public const val `MsV1_0Lm20LogonProfile`: `MSV1_0_PROFILE_BUFFER_TYPE` = 3;
public const val `MsV1_0LookupToken`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 15;
public const val `MsV1_0LuidLogon`: `MSV1_0_LOGON_SUBMIT_TYPE` = 84;
public const val `MsV1_0NetworkLogon`: `MSV1_0_LOGON_SUBMIT_TYPE` = 4;
public const val `MsV1_0NoElevationLogon`: `MSV1_0_LOGON_SUBMIT_TYPE` = 83;
public const val `MsV1_0ProvisionTbal`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 23;
public const val `MsV1_0ReLogonUsers`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 4;
public const val `MsV1_0S4ULogon`: `MSV1_0_LOGON_SUBMIT_TYPE` = 12;
public const val `MsV1_0SetProcessOption`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 12;
public const val `MsV1_0SetThreadOption`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 19;
public const val `MsV1_0SmartCardProfile`: `MSV1_0_PROFILE_BUFFER_TYPE` = 4;
public const val `MsV1_0SubAuth`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 9;
public const val `MsV1_0SubAuthLogon`: `MSV1_0_LOGON_SUBMIT_TYPE` = 5;
public const val `MsV1_0TransferCred`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 22;
public const val `MsV1_0ValidateAuth`: `MSV1_0_PROTOCOL_MESSAGE_TYPE` = 16;
public const val `MsV1_0VirtualLogon`: `MSV1_0_LOGON_SUBMIT_TYPE` = 82;
public const val `MsV1_0WorkstationUnlockLogon`: `MSV1_0_LOGON_SUBMIT_TYPE` = 7;
public const val `MsvAvChannelBindings`: `MSV1_0_AVID` = 10;
public const val `MsvAvDnsComputerName`: `MSV1_0_AVID` = 3;
public const val `MsvAvDnsDomainName`: `MSV1_0_AVID` = 4;
public const val `MsvAvDnsTreeName`: `MSV1_0_AVID` = 5;
public const val `MsvAvEOL`: `MSV1_0_AVID` = 0;
public const val `MsvAvFlags`: `MSV1_0_AVID` = 6;
public const val `MsvAvNbComputerName`: `MSV1_0_AVID` = 1;
public const val `MsvAvNbDomainName`: `MSV1_0_AVID` = 2;
public const val `MsvAvRestrictions`: `MSV1_0_AVID` = 8;
public const val `MsvAvTargetName`: `MSV1_0_AVID` = 9;
public const val `MsvAvTimestamp`: `MSV1_0_AVID` = 7;
// UNSUPPORTED Rust 2508:1: non-scalar type Ptr unsupported
// pub const NEGOSSP_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Negotiate");

// UNSUPPORTED Rust 2509:1: non-scalar type Ptr unsupported
// pub const NEGOSSP_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("Negotiate");

// UNSUPPORTED Rust 2510:1: non-scalar type Ptr unsupported
// pub const NEGOSSP_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Negotiate");

public const val `NEGOTIATE_ALLOW_NTLM`: UInt = 268435456u;
// UNSUPPORTED Rust 2512:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NEGOTIATE_CALLER_NAME_REQUEST {
//     pub MessageType: u32,
//     pub LogonId: super::super::super::Foundation::LUID,
// }

// UNSUPPORTED Rust 2518:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NEGOTIATE_CALLER_NAME_RESPONSE {
//     pub MessageType: u32,
//     pub CallerName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2524:1: declaration Impl has no candidate rule
// impl Default for NEGOTIATE_CALLER_NAME_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NEGOTIATE_MAX_PREFIX`: UInt = 32u;
public typealias `NEGOTIATE_MESSAGES` = Int;
public const val `NEGOTIATE_NEG_NTLM`: UInt = 536870912u;
// UNSUPPORTED Rust 2532:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NEGOTIATE_PACKAGE_PREFIX {
//     pub PackageId: usize,
//     pub PackageDataA: *mut core::ffi::c_void,
//     pub PackageDataW: *mut core::ffi::c_void,
//     pub PrefixLen: usize,
//     pub Prefix: [u8; 32],
// }

// UNSUPPORTED Rust 2541:1: declaration Impl has no candidate rule
// impl Default for NEGOTIATE_PACKAGE_PREFIX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2546:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NEGOTIATE_PACKAGE_PREFIXES {
//     pub MessageType: u32,
//     pub PrefixCount: u32,
//     pub Offset: u32,
//     pub Pad: u32,
// }

// UNSUPPORTED Rust 2554:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NETLOGON_GENERIC_INFO {
//     pub Identity: NETLOGON_LOGON_IDENTITY_INFO,
//     pub PackageName: LSA_UNICODE_STRING,
//     pub DataLength: u32,
//     pub LogonData: *mut u8,
// }

// UNSUPPORTED Rust 2562:1: declaration Impl has no candidate rule
// impl Default for NETLOGON_GENERIC_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2567:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_PasswordManagement")]
// #[derive(Clone, Copy, Default)]
// pub struct NETLOGON_INTERACTIVE_INFO {
//     pub Identity: NETLOGON_LOGON_IDENTITY_INFO,
//     pub LmOwfPassword: super::super::super::System::PasswordManagement::LM_OWF_PASSWORD,
//     pub NtOwfPassword: super::super::super::System::PasswordManagement::LM_OWF_PASSWORD,
// }

// UNSUPPORTED Rust 2575:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NETLOGON_LOGON_IDENTITY_INFO {
//     pub LogonDomainName: LSA_UNICODE_STRING,
//     pub ParameterControl: u32,
//     pub LogonId: i64,
//     pub UserName: LSA_UNICODE_STRING,
//     pub Workstation: LSA_UNICODE_STRING,
// }

public typealias `NETLOGON_LOGON_INFO_CLASS` = Int;
// UNSUPPORTED Rust 2585:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NETLOGON_NETWORK_INFO {
//     pub Identity: NETLOGON_LOGON_IDENTITY_INFO,
//     pub LmChallenge: CLEAR_BLOCK,
//     pub NtChallengeResponse: LSA_STRING,
//     pub LmChallengeResponse: LSA_STRING,
// }

// UNSUPPORTED Rust 2593:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_PasswordManagement")]
// #[derive(Clone, Copy, Default)]
// pub struct NETLOGON_SERVICE_INFO {
//     pub Identity: NETLOGON_LOGON_IDENTITY_INFO,
//     pub LmOwfPassword: super::super::super::System::PasswordManagement::LM_OWF_PASSWORD,
//     pub NtOwfPassword: super::super::super::System::PasswordManagement::LM_OWF_PASSWORD,
// }

public const val `NGC_DATA_FLAG_IS_CLOUD_TRUST_CRED`: UInt = 8u;
public const val `NGC_DATA_FLAG_IS_SMARTCARD_DATA`: UInt = 4u;
public const val `NGC_DATA_FLAG_KERB_CERTIFICATE_LOGON_FLAG_CHECK_DUPLICATES`: UInt = 1u;
public const val `NGC_DATA_FLAG_KERB_CERTIFICATE_LOGON_FLAG_USE_CERTIFICATE_INFO`: UInt = 2u;
public const val `NOTIFIER_FLAG_NEW_THREAD`: UInt = 1u;
public const val `NOTIFIER_FLAG_ONE_SHOT`: UInt = 2u;
public const val `NOTIFIER_FLAG_SECONDS`: UInt = 2147483648u;
public const val `NOTIFIER_TYPE_HANDLE_WAIT`: UInt = 2u;
public const val `NOTIFIER_TYPE_IMMEDIATE`: UInt = 16u;
public const val `NOTIFIER_TYPE_INTERVAL`: UInt = 1u;
public const val `NOTIFIER_TYPE_NOTIFY_EVENT`: UInt = 4u;
public const val `NOTIFIER_TYPE_STATE_CHANGE`: UInt = 3u;
public const val `NOTIFY_CLASS_DOMAIN_CHANGE`: UInt = 3u;
public const val `NOTIFY_CLASS_PACKAGE_CHANGE`: UInt = 1u;
public const val `NOTIFY_CLASS_REGISTRY_CHANGE`: UInt = 4u;
public const val `NOTIFY_CLASS_ROLE_CHANGE`: UInt = 2u;
public const val `NO_LONG_NAMES`: UInt = 2u;
// UNSUPPORTED Rust 2618:1: non-scalar type Ptr unsupported
// pub const NTLMSP_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("NTLM");

// UNSUPPORTED Rust 2619:1: non-scalar type Ptr unsupported
// pub const NTLMSP_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("NTLM");

public const val `NameCanonical`: `EXTENDED_NAME_FORMAT` = 7;
public const val `NameCanonicalEx`: `EXTENDED_NAME_FORMAT` = 9;
public const val `NameDisplay`: `EXTENDED_NAME_FORMAT` = 3;
public const val `NameDnsDomain`: `EXTENDED_NAME_FORMAT` = 12;
public const val `NameFullyQualifiedDN`: `EXTENDED_NAME_FORMAT` = 1;
public const val `NameGivenName`: `EXTENDED_NAME_FORMAT` = 13;
public const val `NameSamCompatible`: `EXTENDED_NAME_FORMAT` = 2;
public const val `NameServicePrincipal`: `EXTENDED_NAME_FORMAT` = 10;
public const val `NameSurname`: `EXTENDED_NAME_FORMAT` = 14;
public const val `NameUniqueId`: `EXTENDED_NAME_FORMAT` = 6;
public const val `NameUnknown`: `EXTENDED_NAME_FORMAT` = 0;
public const val `NameUserPrincipal`: `EXTENDED_NAME_FORMAT` = 8;
public const val `NegCallPackageMax`: `NEGOTIATE_MESSAGES` = 4;
public const val `NegEnumPackagePrefixes`: `NEGOTIATE_MESSAGES` = 0;
public const val `NegGetCallerName`: `NEGOTIATE_MESSAGES` = 1;
public const val `NegMsgReserved1`: `NEGOTIATE_MESSAGES` = 3;
public const val `NegTransferCredentials`: `NEGOTIATE_MESSAGES` = 2;
public const val `NetlogonGenericInformation`: `NETLOGON_LOGON_INFO_CLASS` = 4;
public const val `NetlogonInteractiveInformation`: `NETLOGON_LOGON_INFO_CLASS` = 1;
public const val `NetlogonInteractiveTransitiveInformation`: `NETLOGON_LOGON_INFO_CLASS` = 5;
public const val `NetlogonNetworkInformation`: `NETLOGON_LOGON_INFO_CLASS` = 2;
public const val `NetlogonNetworkTransitiveInformation`: `NETLOGON_LOGON_INFO_CLASS` = 6;
public const val `NetlogonServiceInformation`: `NETLOGON_LOGON_INFO_CLASS` = 3;
public const val `NetlogonServiceTransitiveInformation`: `NETLOGON_LOGON_INFO_CLASS` = 7;
// UNSUPPORTED Rust 2644:1: non-scalar type Ptr unsupported
// pub const PCT1SP_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft PCT 1.0");

// UNSUPPORTED Rust 2645:1: non-scalar type Ptr unsupported
// pub const PCT1SP_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("Microsoft PCT 1.0");

// UNSUPPORTED Rust 2646:1: non-scalar type Ptr unsupported
// pub const PCT1SP_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft PCT 1.0");

public const val `PER_USER_AUDIT_FAILURE_EXCLUDE`: UInt = 8u;
public const val `PER_USER_AUDIT_FAILURE_INCLUDE`: UInt = 4u;
public const val `PER_USER_AUDIT_NONE`: UInt = 16u;
public const val `PER_USER_AUDIT_SUCCESS_EXCLUDE`: UInt = 2u;
public const val `PER_USER_AUDIT_SUCCESS_INCLUDE`: UInt = 1u;
public const val `PER_USER_POLICY_UNCHANGED`: UInt = 0u;
// UNSUPPORTED Rust 2653:1: generic scalar type unsupported
// pub type PKSEC_CREATE_CONTEXT_LIST = Option<unsafe extern "system" fn(r#type: KSEC_CONTEXT_TYPE) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 2654:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Kernel")]
// pub type PKSEC_DEREFERENCE_LIST_ENTRY = Option<unsafe extern "system" fn(entry: *const KSEC_LIST_ENTRY, delete: *mut u8)>;

// UNSUPPORTED Rust 2656:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Kernel")]
// pub type PKSEC_INSERT_LIST_ENTRY = Option<unsafe extern "system" fn(list: *const core::ffi::c_void, entry: *const KSEC_LIST_ENTRY)>;

// UNSUPPORTED Rust 2658:1: generic scalar type unsupported
// pub type PKSEC_LOCATE_PKG_BY_ID = Option<unsafe extern "system" fn(packageid: u32) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 2659:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Kernel")]
// pub type PKSEC_REFERENCE_LIST_ENTRY = Option<unsafe extern "system" fn(entry: *const KSEC_LIST_ENTRY, signature: u32, removenoref: bool) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2661:1: generic scalar type unsupported
// pub type PKSEC_SERIALIZE_SCHANNEL_AUTH_DATA = Option<unsafe extern "system" fn(pvauthdata: *const core::ffi::c_void, size: *mut u32, serializeddata: *mut *mut core::ffi::c_void) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2662:1: generic scalar type unsupported
// pub type PKSEC_SERIALIZE_WINNT_AUTH_DATA = Option<unsafe extern "system" fn(pvauthdata: *const core::ffi::c_void, size: *mut u32, serializeddata: *mut *mut core::ffi::c_void) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2663:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PKU2U_CERTIFICATE_S4U_LOGON {
//     pub MessageType: PKU2U_LOGON_SUBMIT_TYPE,
//     pub Flags: u32,
//     pub UserPrincipalName: LSA_UNICODE_STRING,
//     pub DomainName: LSA_UNICODE_STRING,
//     pub CertificateLength: u32,
//     pub Certificate: *mut u8,
// }

// UNSUPPORTED Rust 2673:1: declaration Impl has no candidate rule
// impl Default for PKU2U_CERTIFICATE_S4U_LOGON {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2678:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PKU2U_CERT_BLOB {
//     pub CertOffset: u32,
//     pub CertLength: u16,
// }

// UNSUPPORTED Rust 2684:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PKU2U_CREDUI_CONTEXT {
//     pub Version: u64,
//     pub cbHeaderLength: u16,
//     pub cbStructureLength: u32,
//     pub CertArrayCount: u16,
//     pub CertArrayOffset: u32,
// }

public typealias `PKU2U_LOGON_SUBMIT_TYPE` = Int;
// UNSUPPORTED Rust 2694:1: non-scalar type Ptr unsupported
// pub const PKU2U_PACKAGE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("pku2u");

// UNSUPPORTED Rust 2695:1: non-scalar type Ptr unsupported
// pub const PKU2U_PACKAGE_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("pku2u");

// UNSUPPORTED Rust 2696:1: non-scalar type Ptr unsupported
// pub const PKU2U_PACKAGE_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("pku2u");

// UNSUPPORTED Rust 2697:1: generic scalar type unsupported
// pub type PLSA_ADD_CREDENTIAL = Option<unsafe extern "system" fn(logonid: *const super::super::super::Foundation::LUID, authenticationpackage: u32, primarykeyvalue: *const LSA_STRING, credentials: *const LSA_STRING) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2698:1: generic scalar type unsupported
// pub type PLSA_ALLOCATE_CLIENT_BUFFER = Option<unsafe extern "system" fn(clientrequest: *const *const core::ffi::c_void, lengthrequired: u32, clientbaseaddress: *mut *mut core::ffi::c_void) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2699:1: generic scalar type unsupported
// pub type PLSA_ALLOCATE_LSA_HEAP = Option<unsafe extern "system" fn(length: u32) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 2700:1: generic scalar type unsupported
// pub type PLSA_ALLOCATE_PRIVATE_HEAP = Option<unsafe extern "system" fn(length: usize) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 2701:1: generic scalar type unsupported
// pub type PLSA_ALLOCATE_SHARED_MEMORY = Option<unsafe extern "system" fn(sharedmem: *const core::ffi::c_void, size: u32) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 2702:1: generic scalar type unsupported
// pub type PLSA_AP_CALL_PACKAGE = Option<unsafe extern "system" fn(clientrequest: *const *const core::ffi::c_void, protocolsubmitbuffer: *const core::ffi::c_void, clientbufferbase: *const core::ffi::c_void, submitbufferlength: u32, protocolreturnbuffer: *mut *mut core::ffi::c_void, returnbufferlength: *mut u32, protocolstatus: *mut i32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2703:1: generic scalar type unsupported
// pub type PLSA_AP_CALL_PACKAGE_PASSTHROUGH = Option<unsafe extern "system" fn(clientrequest: *const *const core::ffi::c_void, protocolsubmitbuffer: *const core::ffi::c_void, clientbufferbase: *const core::ffi::c_void, submitbufferlength: u32, protocolreturnbuffer: *mut *mut core::ffi::c_void, returnbufferlength: *mut u32, protocolstatus: *mut i32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2704:1: generic scalar type unsupported
// pub type PLSA_AP_INITIALIZE_PACKAGE = Option<unsafe extern "system" fn(authenticationpackageid: u32, lsadispatchtable: *const LSA_DISPATCH_TABLE, database: *const LSA_STRING, confidentiality: *const LSA_STRING, authenticationpackagename: *mut *mut LSA_STRING) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2705:1: generic scalar type unsupported
// pub type PLSA_AP_LOGON_TERMINATED = Option<unsafe extern "system" fn(logonid: *const super::super::super::Foundation::LUID)>;

// UNSUPPORTED Rust 2706:1: generic scalar type unsupported
// pub type PLSA_AP_LOGON_USER = Option<unsafe extern "system" fn(clientrequest: *const *const core::ffi::c_void, logontype: SECURITY_LOGON_TYPE, authenticationinformation: *const core::ffi::c_void, clientauthenticationbase: *const core::ffi::c_void, authenticationinformationlength: u32, profilebuffer: *mut *mut core::ffi::c_void, profilebufferlength: *mut u32, logonid: *mut super::super::super::Foundation::LUID, substatus: *mut i32, tokeninformationtype: *mut LSA_TOKEN_INFORMATION_TYPE, tokeninformation: *mut *mut core::ffi::c_void, accountname: *mut *mut LSA_UNICODE_STRING, authenticatingauthority: *mut *mut LSA_UNICODE_STRING) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2707:1: generic scalar type unsupported
// pub type PLSA_AP_LOGON_USER_EX = Option<unsafe extern "system" fn(clientrequest: *const *const core::ffi::c_void, logontype: SECURITY_LOGON_TYPE, authenticationinformation: *const core::ffi::c_void, clientauthenticationbase: *const core::ffi::c_void, authenticationinformationlength: u32, profilebuffer: *mut *mut core::ffi::c_void, profilebufferlength: *mut u32, logonid: *mut super::super::super::Foundation::LUID, substatus: *mut i32, tokeninformationtype: *mut LSA_TOKEN_INFORMATION_TYPE, tokeninformation: *mut *mut core::ffi::c_void, accountname: *mut *mut LSA_UNICODE_STRING, authenticatingauthority: *mut *mut LSA_UNICODE_STRING, machinename: *mut *mut LSA_UNICODE_STRING) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2708:1: generic scalar type unsupported
// pub type PLSA_AP_LOGON_USER_EX2 =
//     Option<unsafe extern "system" fn(clientrequest: *const *const core::ffi::c_void, logontype: SECURITY_LOGON_TYPE, protocolsubmitbuffer: *const core::ffi::c_void, clientbufferbase: *const core::ffi::c_void, submitbuffersize: u32, profilebuffer: *mut *mut core::ffi::c_void, profilebuffersize: *mut u32, logonid: *mut super::super::super::Foundation::LUID, substatus: *mut i32, tokeninformationtype: *mut LSA_TOKEN_INFORMATION_TYPE, tokeninformation: *mut *mut core::ffi::c_void, accountname: *mut *mut LSA_UNICODE_STRING, authenticatingauthority: *mut *mut LSA_UNICODE_STRING, machinename: *mut *mut LSA_UNICODE_STRING, primarycredentials: *mut SECPKG_PRIMARY_CRED, supplementalcredentials: *mut *mut SECPKG_SUPPLEMENTAL_CRED_ARRAY) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2710:1: generic scalar type unsupported
// pub type PLSA_AP_LOGON_USER_EX3 = Option<
//     unsafe extern "system" fn(
//         clientrequest: *const *const core::ffi::c_void,
//         logontype: SECURITY_LOGON_TYPE,
//         protocolsubmitbuffer: *const core::ffi::c_void,
//         clientbufferbase: *const core::ffi::c_void,
//         submitbuffersize: u32,
//         surrogatelogon: *mut SECPKG_SURROGATE_LOGON,
//         profilebuffer: *mut *mut core::ffi::c_void,
//         profilebuffersize: *mut u32,
//         logonid: *mut super::super::super::Foundation::LUID,
//         substatus: *mut i32,
//         tokeninformationtype: *mut LSA_TOKEN_INFORMATION_TYPE,
//         tokeninformation: *mut *mut core::ffi::c_void,
//         accountname: *mut *mut LSA_UNICODE_STRING,
//         authenticatingauthority: *mut *mut LSA_UNICODE_STRING,
//         machinename: *mut *mut LSA_UNICODE_STRING,
//         primarycredentials: *mut SECPKG_PRIMARY_CRED,
//         supplementalcredentials: *mut *mut SECPKG_SUPPLEMENTAL_CRED_ARRAY,
//     ) -> super::super::super::Foundation::NTSTATUS,
// >;

// UNSUPPORTED Rust 2731:1: generic scalar type unsupported
// pub type PLSA_AP_POST_LOGON_USER_SURROGATE = Option<
//     unsafe extern "system" fn(
//         clientrequest: *const *const core::ffi::c_void,
//         logontype: SECURITY_LOGON_TYPE,
//         protocolsubmitbuffer: *const core::ffi::c_void,
//         clientbufferbase: *const core::ffi::c_void,
//         submitbuffersize: u32,
//         surrogatelogon: *const SECPKG_SURROGATE_LOGON,
//         profilebuffer: *const core::ffi::c_void,
//         profilebuffersize: u32,
//         logonid: *const super::super::super::Foundation::LUID,
//         status: super::super::super::Foundation::NTSTATUS,
//         substatus: super::super::super::Foundation::NTSTATUS,
//         tokeninformationtype: LSA_TOKEN_INFORMATION_TYPE,
//         tokeninformation: *const core::ffi::c_void,
//         accountname: *const LSA_UNICODE_STRING,
//         authenticatingauthority: *const LSA_UNICODE_STRING,
//         machinename: *const LSA_UNICODE_STRING,
//         primarycredentials: *const SECPKG_PRIMARY_CRED,
//         supplementalcredentials: *const SECPKG_SUPPLEMENTAL_CRED_ARRAY,
//     ) -> super::super::super::Foundation::NTSTATUS,
// >;

// UNSUPPORTED Rust 2753:1: generic scalar type unsupported
// pub type PLSA_AP_PRE_LOGON_USER_SURROGATE = Option<unsafe extern "system" fn(clientrequest: *const *const core::ffi::c_void, logontype: SECURITY_LOGON_TYPE, protocolsubmitbuffer: *const core::ffi::c_void, clientbufferbase: *const core::ffi::c_void, submitbuffersize: u32, surrogatelogon: *mut SECPKG_SURROGATE_LOGON, substatus: *mut i32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2754:1: generic scalar type unsupported
// pub type PLSA_AUDIT_ACCOUNT_LOGON = Option<unsafe extern "system" fn(auditid: u32, success: bool, source: *const LSA_UNICODE_STRING, clientname: *const LSA_UNICODE_STRING, mappedname: *const LSA_UNICODE_STRING, status: super::super::super::Foundation::NTSTATUS) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2755:1: generic scalar type unsupported
// pub type PLSA_AUDIT_LOGON = Option<unsafe extern "system" fn(status: super::super::super::Foundation::NTSTATUS, substatus: super::super::super::Foundation::NTSTATUS, accountname: *const LSA_UNICODE_STRING, authenticatingauthority: *const LSA_UNICODE_STRING, workstationname: *const LSA_UNICODE_STRING, usersid: super::super::PSID, logontype: SECURITY_LOGON_TYPE, tokensource: *const super::super::TOKEN_SOURCE, logonid: *const super::super::super::Foundation::LUID)>;

// UNSUPPORTED Rust 2756:1: generic scalar type unsupported
// pub type PLSA_AUDIT_LOGON_EX = Option<unsafe extern "system" fn(status: super::super::super::Foundation::NTSTATUS, substatus: super::super::super::Foundation::NTSTATUS, accountname: *const LSA_UNICODE_STRING, authenticatingauthority: *const LSA_UNICODE_STRING, workstationname: *const LSA_UNICODE_STRING, usersid: super::super::PSID, logontype: SECURITY_LOGON_TYPE, impersonationlevel: super::super::SECURITY_IMPERSONATION_LEVEL, tokensource: *const super::super::TOKEN_SOURCE, logonid: *const super::super::super::Foundation::LUID)>;

// UNSUPPORTED Rust 2757:1: generic scalar type unsupported
// pub type PLSA_CALLBACK_FUNCTION = Option<unsafe extern "system" fn(argument1: usize, argument2: usize, inputbuffer: *mut SecBuffer, outputbuffer: *mut SecBuffer) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2758:1: generic scalar type unsupported
// pub type PLSA_CALL_PACKAGE = Option<unsafe extern "system" fn(authenticationpackage: *const LSA_UNICODE_STRING, protocolsubmitbuffer: *const core::ffi::c_void, submitbufferlength: u32, protocolreturnbuffer: *mut *mut core::ffi::c_void, returnbufferlength: *mut u32, protocolstatus: *mut i32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2759:1: generic scalar type unsupported
// pub type PLSA_CALL_PACKAGEEX = Option<unsafe extern "system" fn(authenticationpackage: *const LSA_UNICODE_STRING, clientbufferbase: *const core::ffi::c_void, protocolsubmitbuffer: *const core::ffi::c_void, submitbufferlength: u32, protocolreturnbuffer: *mut *mut core::ffi::c_void, returnbufferlength: *mut u32, protocolstatus: *mut i32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2760:1: generic scalar type unsupported
// pub type PLSA_CALL_PACKAGE_PASSTHROUGH = Option<unsafe extern "system" fn(authenticationpackage: *const LSA_UNICODE_STRING, clientbufferbase: *const core::ffi::c_void, protocolsubmitbuffer: *const core::ffi::c_void, submitbufferlength: u32, protocolreturnbuffer: *mut *mut core::ffi::c_void, returnbufferlength: *mut u32, protocolstatus: *mut i32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2761:1: generic scalar type unsupported
// pub type PLSA_CANCEL_NOTIFICATION = Option<unsafe extern "system" fn(notifyhandle: super::super::super::Foundation::HANDLE) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2762:1: generic scalar type unsupported
// pub type PLSA_CHECK_PROTECTED_USER_BY_TOKEN = Option<unsafe extern "system" fn(usertoken: super::super::super::Foundation::HANDLE, protecteduser: *mut bool) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2763:1: generic scalar type unsupported
// pub type PLSA_CLIENT_CALLBACK = Option<unsafe extern "system" fn(callback: windows_sys::core::PCSTR, argument1: usize, argument2: usize, input: *const SecBuffer, output: *mut SecBuffer) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2764:1: generic scalar type unsupported
// pub type PLSA_CLOSE_SAM_USER = Option<unsafe extern "system" fn(userhandle: *const core::ffi::c_void) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2765:1: generic scalar type unsupported
// pub type PLSA_CONVERT_AUTH_DATA_TO_TOKEN = Option<unsafe extern "system" fn(userauthdata: *const core::ffi::c_void, userauthdatasize: u32, impersonationlevel: super::super::SECURITY_IMPERSONATION_LEVEL, tokensource: *const super::super::TOKEN_SOURCE, logontype: SECURITY_LOGON_TYPE, authorityname: *const LSA_UNICODE_STRING, token: *mut super::super::super::Foundation::HANDLE, logonid: *mut super::super::super::Foundation::LUID, accountname: *mut LSA_UNICODE_STRING, substatus: *mut i32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2766:1: generic scalar type unsupported
// pub type PLSA_COPY_FROM_CLIENT_BUFFER = Option<unsafe extern "system" fn(clientrequest: *const *const core::ffi::c_void, length: u32, buffertocopy: *mut core::ffi::c_void, clientbaseaddress: *const core::ffi::c_void) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2767:1: generic scalar type unsupported
// pub type PLSA_COPY_TO_CLIENT_BUFFER = Option<unsafe extern "system" fn(clientrequest: *const *const core::ffi::c_void, length: u32, clientbaseaddress: *mut core::ffi::c_void, buffertocopy: *const core::ffi::c_void) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2768:1: generic scalar type unsupported
// pub type PLSA_CRACK_SINGLE_NAME = Option<unsafe extern "system" fn(formatoffered: u32, performatgc: bool, nameinput: *const LSA_UNICODE_STRING, prefix: *const LSA_UNICODE_STRING, requestedformat: u32, crackedname: *mut LSA_UNICODE_STRING, dnsdomainname: *mut LSA_UNICODE_STRING, substatus: *mut u32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2769:1: generic scalar type unsupported
// pub type PLSA_CREATE_LOGON_SESSION = Option<unsafe extern "system" fn(logonid: *mut super::super::super::Foundation::LUID) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2770:1: generic scalar type unsupported
// pub type PLSA_CREATE_SHARED_MEMORY = Option<unsafe extern "system" fn(maxsize: u32, initialsize: u32) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 2771:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Threading")]
// pub type PLSA_CREATE_THREAD = Option<unsafe extern "system" fn(securityattributes: *const super::super::SECURITY_ATTRIBUTES, stacksize: u32, startfunction: super::super::super::System::Threading::LPTHREAD_START_ROUTINE, threadparameter: *const core::ffi::c_void, creationflags: u32, threadid: *mut u32) -> super::super::super::Foundation::HANDLE>;

// UNSUPPORTED Rust 2773:1: generic scalar type unsupported
// pub type PLSA_CREATE_TOKEN = Option<unsafe extern "system" fn(logonid: *const super::super::super::Foundation::LUID, tokensource: *const super::super::TOKEN_SOURCE, logontype: SECURITY_LOGON_TYPE, impersonationlevel: super::super::SECURITY_IMPERSONATION_LEVEL, tokeninformationtype: LSA_TOKEN_INFORMATION_TYPE, tokeninformation: *const core::ffi::c_void, tokengroups: *const super::super::TOKEN_GROUPS, accountname: *const LSA_UNICODE_STRING, authorityname: *const LSA_UNICODE_STRING, workstation: *const LSA_UNICODE_STRING, profilepath: *const LSA_UNICODE_STRING, token: *mut super::super::super::Foundation::HANDLE, substatus: *mut i32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2774:1: generic scalar type unsupported
// pub type PLSA_CREATE_TOKEN_EX = Option<unsafe extern "system" fn(logonid: *const super::super::super::Foundation::LUID, tokensource: *const super::super::TOKEN_SOURCE, logontype: SECURITY_LOGON_TYPE, impersonationlevel: super::super::SECURITY_IMPERSONATION_LEVEL, tokeninformationtype: LSA_TOKEN_INFORMATION_TYPE, tokeninformation: *const core::ffi::c_void, tokengroups: *const super::super::TOKEN_GROUPS, workstation: *const LSA_UNICODE_STRING, profilepath: *const LSA_UNICODE_STRING, sessioninformation: *const core::ffi::c_void, sessioninformationtype: SECPKG_SESSIONINFO_TYPE, token: *mut super::super::super::Foundation::HANDLE, substatus: *mut i32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2775:1: generic scalar type unsupported
// pub type PLSA_DELETE_CREDENTIAL = Option<unsafe extern "system" fn(logonid: *const super::super::super::Foundation::LUID, authenticationpackage: u32, primarykeyvalue: *const LSA_STRING) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2776:1: generic scalar type unsupported
// pub type PLSA_DELETE_LOGON_SESSION = Option<unsafe extern "system" fn(logonid: *const super::super::super::Foundation::LUID) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2777:1: generic scalar type unsupported
// pub type PLSA_DELETE_SHARED_MEMORY = Option<unsafe extern "system" fn(sharedmem: *const core::ffi::c_void) -> bool>;

// UNSUPPORTED Rust 2778:1: generic scalar type unsupported
// pub type PLSA_DUPLICATE_HANDLE = Option<unsafe extern "system" fn(sourcehandle: super::super::super::Foundation::HANDLE, destionationhandle: *mut super::super::super::Foundation::HANDLE) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2779:1: generic scalar type unsupported
// pub type PLSA_EXPAND_AUTH_DATA_FOR_DOMAIN = Option<unsafe extern "system" fn(userauthdata: *const u8, userauthdatasize: u32, reserved: *const core::ffi::c_void, expandedauthdata: *mut *mut u8, expandedauthdatasize: *mut u32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2780:1: generic scalar type unsupported
// pub type PLSA_FREE_CLIENT_BUFFER = Option<unsafe extern "system" fn(clientrequest: *const *const core::ffi::c_void, clientbaseaddress: *const core::ffi::c_void) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2781:1: generic scalar type unsupported
// pub type PLSA_FREE_LSA_HEAP = Option<unsafe extern "system" fn(base: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 2782:1: generic scalar type unsupported
// pub type PLSA_FREE_PRIVATE_HEAP = Option<unsafe extern "system" fn(base: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 2783:1: generic scalar type unsupported
// pub type PLSA_FREE_SHARED_MEMORY = Option<unsafe extern "system" fn(sharedmem: *const core::ffi::c_void, memory: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 2784:1: generic scalar type unsupported
// pub type PLSA_GET_APP_MODE_INFO = Option<unsafe extern "system" fn(userfunction: *mut u32, argument1: *mut usize, argument2: *mut usize, userdata: *mut SecBuffer, returntolsa: *mut bool) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2785:1: generic scalar type unsupported
// pub type PLSA_GET_AUTH_DATA_FOR_USER = Option<unsafe extern "system" fn(name: *const SECURITY_STRING, nametype: SECPKG_NAME_TYPE, prefix: *const SECURITY_STRING, userauthdata: *mut *mut u8, userauthdatasize: *mut u32, userflatname: *mut LSA_UNICODE_STRING) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2786:1: generic scalar type unsupported
// pub type PLSA_GET_CALL_INFO = Option<unsafe extern "system" fn(info: *mut SECPKG_CALL_INFO) -> bool>;

// UNSUPPORTED Rust 2787:1: generic scalar type unsupported
// pub type PLSA_GET_CLIENT_INFO = Option<unsafe extern "system" fn(clientinfo: *mut SECPKG_CLIENT_INFO) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2788:1: generic scalar type unsupported
// pub type PLSA_GET_CLIENT_INFO_EX = Option<unsafe extern "system" fn(clientinfo: *mut SECPKG_CLIENT_INFO_EX, structsize: u32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2789:1: generic scalar type unsupported
// pub type PLSA_GET_CREDENTIALS = Option<unsafe extern "system" fn(logonid: *const super::super::super::Foundation::LUID, authenticationpackage: u32, querycontext: *mut u32, retrieveallcredentials: bool, primarykeyvalue: *const LSA_STRING, primarykeylength: *mut u32, credentials: *const LSA_STRING) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2790:1: generic scalar type unsupported
// pub type PLSA_GET_EXTENDED_CALL_FLAGS = Option<unsafe extern "system" fn(flags: *mut u32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2791:1: generic scalar type unsupported
// pub type PLSA_GET_SERVICE_ACCOUNT_PASSWORD = Option<unsafe extern "system" fn(accountname: *const LSA_UNICODE_STRING, domainname: *const LSA_UNICODE_STRING, credfetch: CRED_FETCH, filetimeexpiry: *mut super::super::super::Foundation::FILETIME, currentpassword: *mut LSA_UNICODE_STRING, previouspassword: *mut LSA_UNICODE_STRING, filetimecurrpwdvalidforoutbound: *mut super::super::super::Foundation::FILETIME) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2792:1: generic scalar type unsupported
// pub type PLSA_GET_USER_AUTH_DATA = Option<unsafe extern "system" fn(userhandle: *const core::ffi::c_void, userauthdata: *mut *mut u8, userauthdatasize: *mut u32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2793:1: generic scalar type unsupported
// pub type PLSA_GET_USER_CREDENTIALS = Option<unsafe extern "system" fn(userhandle: *const core::ffi::c_void, primarycreds: *mut *mut core::ffi::c_void, primarycredssize: *mut u32, supplementalcreds: *mut *mut core::ffi::c_void, supplementalcredssize: *mut u32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2794:1: generic scalar type unsupported
// pub type PLSA_IMPERSONATE_CLIENT = Option<unsafe extern "system" fn() -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2795:1: generic scalar type unsupported
// pub type PLSA_LOCATE_PKG_BY_ID = Option<unsafe extern "system" fn(packgeid: u32) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 2796:1: generic scalar type unsupported
// pub type PLSA_MAP_BUFFER = Option<unsafe extern "system" fn(inputbuffer: *const SecBuffer, outputbuffer: *mut SecBuffer) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2797:1: generic scalar type unsupported
// pub type PLSA_OPEN_SAM_USER = Option<unsafe extern "system" fn(name: *const SECURITY_STRING, nametype: SECPKG_NAME_TYPE, prefix: *const SECURITY_STRING, allowguest: bool, reserved: u32, userhandle: *mut *mut core::ffi::c_void) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2798:1: generic scalar type unsupported
// pub type PLSA_OPEN_TOKEN_BY_LOGON_ID = Option<unsafe extern "system" fn(logonid: *const super::super::super::Foundation::LUID, rettokenhandle: *mut super::super::super::Foundation::HANDLE) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2799:1: generic scalar type unsupported
// pub type PLSA_PROTECT_MEMORY = Option<unsafe extern "system" fn(buffer: *mut core::ffi::c_void, buffersize: u32)>;

// UNSUPPORTED Rust 2800:1: generic scalar type unsupported
// pub type PLSA_QUERY_CLIENT_REQUEST = Option<unsafe extern "system" fn(clientrequest: *const *const core::ffi::c_void, querytype: u32, replybuffer: *mut *mut core::ffi::c_void) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2801:1: generic scalar type unsupported
// pub type PLSA_REDIRECTED_LOGON_CALLBACK = Option<unsafe extern "system" fn(redirectedlogonhandle: super::super::super::Foundation::HANDLE, buffer: *mut core::ffi::c_void, bufferlength: u32, returnbuffer: *mut *mut core::ffi::c_void, returnbufferlength: *mut u32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2802:1: generic scalar type unsupported
// pub type PLSA_REDIRECTED_LOGON_CLEANUP_CALLBACK = Option<unsafe extern "system" fn(redirectedlogonhandle: super::super::super::Foundation::HANDLE)>;

// UNSUPPORTED Rust 2803:1: generic scalar type unsupported
// pub type PLSA_REDIRECTED_LOGON_GET_LOGON_CREDS = Option<unsafe extern "system" fn(redirectedlogonhandle: super::super::super::Foundation::HANDLE, logonbuffer: *mut *mut u8, logonbufferlength: *mut u32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2804:1: generic scalar type unsupported
// pub type PLSA_REDIRECTED_LOGON_GET_SID = Option<unsafe extern "system" fn(redirectedlogonhandle: super::super::super::Foundation::HANDLE, sid: *mut super::super::PSID) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2805:1: generic scalar type unsupported
// pub type PLSA_REDIRECTED_LOGON_GET_SUPP_CREDS = Option<unsafe extern "system" fn(redirectedlogonhandle: super::super::super::Foundation::HANDLE, supplementalcredentials: *mut *mut SECPKG_SUPPLEMENTAL_CRED_ARRAY) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2806:1: generic scalar type unsupported
// pub type PLSA_REDIRECTED_LOGON_INIT = Option<unsafe extern "system" fn(redirectedlogonhandle: super::super::super::Foundation::HANDLE, packagename: *const LSA_UNICODE_STRING, sessionid: u32, logonid: *const super::super::super::Foundation::LUID) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2807:1: generic scalar type unsupported
// pub type PLSA_REGISTER_CALLBACK = Option<unsafe extern "system" fn(callbackid: u32, callback: PLSA_CALLBACK_FUNCTION) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2808:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Threading")]
// pub type PLSA_REGISTER_NOTIFICATION = Option<unsafe extern "system" fn(startfunction: super::super::super::System::Threading::LPTHREAD_START_ROUTINE, parameter: *const core::ffi::c_void, notificationtype: u32, notificationclass: u32, notificationflags: u32, intervalminutes: u32, waitevent: super::super::super::Foundation::HANDLE) -> super::super::super::Foundation::HANDLE>;

// UNSUPPORTED Rust 2810:1: generic scalar type unsupported
// pub type PLSA_SAVE_SUPPLEMENTAL_CREDENTIALS = Option<unsafe extern "system" fn(logonid: *const super::super::super::Foundation::LUID, supplementalcredsize: u32, supplementalcreds: *const core::ffi::c_void, synchronous: bool) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2811:1: generic scalar type unsupported
// pub type PLSA_SET_APP_MODE_INFO = Option<unsafe extern "system" fn(userfunction: u32, argument1: usize, argument2: usize, userdata: *const SecBuffer, returntolsa: bool) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2812:1: generic scalar type unsupported
// pub type PLSA_UNLOAD_PACKAGE = Option<unsafe extern "system" fn() -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2813:1: generic scalar type unsupported
// pub type PLSA_UPDATE_PRIMARY_CREDENTIALS = Option<unsafe extern "system" fn(primarycredentials: *const SECPKG_PRIMARY_CRED, credentials: *const SECPKG_SUPPLEMENTAL_CRED_ARRAY) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2814:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct POLICY_ACCOUNT_DOMAIN_INFO {
//     pub DomainName: LSA_UNICODE_STRING,
//     pub DomainSid: super::super::PSID,
// }

// UNSUPPORTED Rust 2820:1: declaration Impl has no candidate rule
// impl Default for POLICY_ACCOUNT_DOMAIN_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2825:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct POLICY_AUDIT_CATEGORIES_INFO {
//     pub MaximumCategoryCount: u32,
//     pub SubCategoriesInfo: *mut POLICY_AUDIT_SUBCATEGORIES_INFO,
// }

// UNSUPPORTED Rust 2831:1: declaration Impl has no candidate rule
// impl Default for POLICY_AUDIT_CATEGORIES_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2836:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct POLICY_AUDIT_EVENTS_INFO {
//     pub AuditingMode: bool,
//     pub EventAuditingOptions: *mut u32,
//     pub MaximumAuditEventCount: u32,
// }

// UNSUPPORTED Rust 2843:1: declaration Impl has no candidate rule
// impl Default for POLICY_AUDIT_EVENTS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `POLICY_AUDIT_EVENT_FAILURE`: Int = 2;
public const val `POLICY_AUDIT_EVENT_NONE`: Int = 4;
public const val `POLICY_AUDIT_EVENT_SUCCESS`: Int = 1;
public typealias `POLICY_AUDIT_EVENT_TYPE` = Int;
public const val `POLICY_AUDIT_EVENT_UNCHANGED`: Int = 0;
// UNSUPPORTED Rust 2853:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct POLICY_AUDIT_FULL_QUERY_INFO {
//     pub ShutDownOnFull: bool,
//     pub LogIsFull: bool,
// }

// UNSUPPORTED Rust 2859:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct POLICY_AUDIT_FULL_SET_INFO {
//     pub ShutDownOnFull: bool,
// }

public const val `POLICY_AUDIT_LOG_ADMIN`: Int = 512;
// UNSUPPORTED Rust 2865:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct POLICY_AUDIT_LOG_INFO {
//     pub AuditLogPercentFull: u32,
//     pub MaximumLogSize: u32,
//     pub AuditRetentionPeriod: i64,
//     pub AuditLogFullShutdownInProgress: bool,
//     pub TimeToShutdown: i64,
//     pub NextAuditRecordId: u32,
// }

// UNSUPPORTED Rust 2875:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct POLICY_AUDIT_SID_ARRAY {
//     pub UsersCount: u32,
//     pub UserSidArray: *mut super::super::PSID,
// }

// UNSUPPORTED Rust 2881:1: declaration Impl has no candidate rule
// impl Default for POLICY_AUDIT_SID_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2886:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct POLICY_AUDIT_SUBCATEGORIES_INFO {
//     pub MaximumSubCategoryCount: u32,
//     pub EventAuditingOptions: *mut u32,
// }

// UNSUPPORTED Rust 2892:1: declaration Impl has no candidate rule
// impl Default for POLICY_AUDIT_SUBCATEGORIES_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `POLICY_CREATE_ACCOUNT`: Int = 16;
public const val `POLICY_CREATE_PRIVILEGE`: Int = 64;
public const val `POLICY_CREATE_SECRET`: Int = 32;
// UNSUPPORTED Rust 2900:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct POLICY_DEFAULT_QUOTA_INFO {
//     pub QuotaLimits: super::super::QUOTA_LIMITS,
// }

// UNSUPPORTED Rust 2905:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct POLICY_DNS_DOMAIN_INFO {
//     pub Name: LSA_UNICODE_STRING,
//     pub DnsDomainName: LSA_UNICODE_STRING,
//     pub DnsForestName: LSA_UNICODE_STRING,
//     pub DomainGuid: windows_sys::core::GUID,
//     pub Sid: super::super::PSID,
// }

// UNSUPPORTED Rust 2914:1: declaration Impl has no candidate rule
// impl Default for POLICY_DNS_DOMAIN_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2919:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct POLICY_DOMAIN_EFS_INFO {
//     pub InfoLength: u32,
//     pub EfsBlob: *mut u8,
// }

// UNSUPPORTED Rust 2925:1: declaration Impl has no candidate rule
// impl Default for POLICY_DOMAIN_EFS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `POLICY_DOMAIN_INFORMATION_CLASS` = Int;
// UNSUPPORTED Rust 2931:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct POLICY_DOMAIN_KERBEROS_TICKET_INFO {
//     pub AuthenticationOptions: u32,
//     pub MaxServiceTicketAge: i64,
//     pub MaxTicketAge: i64,
//     pub MaxRenewAge: i64,
//     pub MaxClockSkew: i64,
//     pub Reserved: i64,
// }

public const val `POLICY_GET_PRIVATE_INFORMATION`: Int = 4;
public typealias `POLICY_INFORMATION_CLASS` = Int;
public const val `POLICY_KERBEROS_VALIDATE_CLIENT`: UInt = 128u;
public const val `POLICY_LOOKUP_NAMES`: Int = 2048;
public typealias `POLICY_LSA_SERVER_ROLE` = Int;
// UNSUPPORTED Rust 2946:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct POLICY_LSA_SERVER_ROLE_INFO {
//     pub LsaServerRole: POLICY_LSA_SERVER_ROLE,
// }

// UNSUPPORTED Rust 2951:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct POLICY_MACHINE_ACCT_INFO {
//     pub Rid: u32,
//     pub Sid: super::super::PSID,
// }

// UNSUPPORTED Rust 2957:1: declaration Impl has no candidate rule
// impl Default for POLICY_MACHINE_ACCT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2962:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct POLICY_MACHINE_ACCT_INFO2 {
//     pub Rid: u32,
//     pub Sid: super::super::PSID,
//     pub ObjectGuid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 2969:1: declaration Impl has no candidate rule
// impl Default for POLICY_MACHINE_ACCT_INFO2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2974:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct POLICY_MODIFICATION_INFO {
//     pub ModifiedId: i64,
//     pub DatabaseCreationTime: i64,
// }

public const val `POLICY_NOTIFICATION`: Int = 4096;
public typealias `POLICY_NOTIFICATION_INFORMATION_CLASS` = Int;
// UNSUPPORTED Rust 2982:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct POLICY_PD_ACCOUNT_INFO {
//     pub Name: LSA_UNICODE_STRING,
// }

// UNSUPPORTED Rust 2987:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct POLICY_PRIMARY_DOMAIN_INFO {
//     pub Name: LSA_UNICODE_STRING,
//     pub Sid: super::super::PSID,
// }

// UNSUPPORTED Rust 2993:1: declaration Impl has no candidate rule
// impl Default for POLICY_PRIMARY_DOMAIN_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `POLICY_QOS_ALLOW_LOCAL_ROOT_CERT_STORE`: UInt = 32u;
public const val `POLICY_QOS_DHCP_SERVER_ALLOWED`: UInt = 128u;
public const val `POLICY_QOS_INBOUND_CONFIDENTIALITY`: UInt = 16u;
public const val `POLICY_QOS_INBOUND_INTEGRITY`: UInt = 8u;
public const val `POLICY_QOS_OUTBOUND_CONFIDENTIALITY`: UInt = 4u;
public const val `POLICY_QOS_OUTBOUND_INTEGRITY`: UInt = 2u;
public const val `POLICY_QOS_RAS_SERVER_ALLOWED`: UInt = 64u;
public const val `POLICY_QOS_SCHANNEL_REQUIRED`: UInt = 1u;
// UNSUPPORTED Rust 3006:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct POLICY_REPLICA_SOURCE_INFO {
//     pub ReplicaSource: LSA_UNICODE_STRING,
//     pub ReplicaAccountName: LSA_UNICODE_STRING,
// }

public const val `POLICY_SERVER_ADMIN`: Int = 1024;
public const val `POLICY_SET_AUDIT_REQUIREMENTS`: Int = 256;
public const val `POLICY_SET_DEFAULT_QUOTA_LIMITS`: Int = 128;
public const val `POLICY_TRUST_ADMIN`: Int = 8;
public const val `POLICY_VIEW_AUDIT_INFORMATION`: Int = 2;
public const val `POLICY_VIEW_LOCAL_INFORMATION`: Int = 1;
public const val `PRIMARY_CRED_ARSO_LOGON`: UInt = 2097152u;
public const val `PRIMARY_CRED_AUTH_ID`: UInt = 512u;
public const val `PRIMARY_CRED_CACHED_INTERACTIVE_LOGON`: UInt = 262144u;
public const val `PRIMARY_CRED_CACHED_LOGON`: UInt = 8u;
public const val `PRIMARY_CRED_CLEAR_PASSWORD`: UInt = 1u;
public const val `PRIMARY_CRED_DO_NOT_SPLIT`: UInt = 1024u;
public const val `PRIMARY_CRED_ENCRYPTED_CREDGUARD_PASSWORD`: UInt = 131072u;
public const val `PRIMARY_CRED_ENTERPRISE_INTERNET_USER`: UInt = 65536u;
public const val `PRIMARY_CRED_EX`: UInt = 4096u;
public const val `PRIMARY_CRED_FOR_PASSWORD_CHANGE`: UInt = 8388608u;
public const val `PRIMARY_CRED_INTERACTIVE_FIDO_LOGON`: UInt = 1048576u;
public const val `PRIMARY_CRED_INTERACTIVE_NGC_LOGON`: UInt = 524288u;
public const val `PRIMARY_CRED_INTERACTIVE_SMARTCARD_LOGON`: UInt = 64u;
public const val `PRIMARY_CRED_INTERNET_USER`: UInt = 256u;
public const val `PRIMARY_CRED_LOGON_LUA`: UInt = 32u;
public const val `PRIMARY_CRED_LOGON_NO_TCB`: UInt = 16u;
public const val `PRIMARY_CRED_LOGON_PACKAGE_SHIFT`: UInt = 24u;
public const val `PRIMARY_CRED_OWF_PASSWORD`: UInt = 2u;
public const val `PRIMARY_CRED_PACKAGE_MASK`: UInt = 4278190080u;
public const val `PRIMARY_CRED_PACKED_CREDS`: UInt = 32768u;
public const val `PRIMARY_CRED_PROTECTED_USER`: UInt = 2048u;
public const val `PRIMARY_CRED_REFRESH_NEEDED`: UInt = 128u;
public const val `PRIMARY_CRED_RESTRICTED_TS`: UInt = 16384u;
public const val `PRIMARY_CRED_SUPPLEMENTAL`: UInt = 4194304u;
public const val `PRIMARY_CRED_TRANSFER`: UInt = 8192u;
public const val `PRIMARY_CRED_UPDATE`: UInt = 4u;
// UNSUPPORTED Rust 3044:1: generic scalar type unsupported
// pub type PSAM_CREDENTIAL_UPDATE_FREE_ROUTINE = Option<unsafe extern "system" fn(p: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 3045:1: generic scalar type unsupported
// pub type PSAM_CREDENTIAL_UPDATE_NOTIFY_ROUTINE = Option<unsafe extern "system" fn(clearpassword: *const LSA_UNICODE_STRING, oldcredentials: *const core::ffi::c_void, oldcredentialsize: u32, useraccountcontrol: u32, upn: *const LSA_UNICODE_STRING, username: *const LSA_UNICODE_STRING, netbiosdomainname: *const LSA_UNICODE_STRING, dnsdomainname: *const LSA_UNICODE_STRING, newcredentials: *mut *mut core::ffi::c_void, newcredentialsize: *mut u32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 3046:1: generic scalar type unsupported
// pub type PSAM_CREDENTIAL_UPDATE_REGISTER_MAPPED_ENTRYPOINTS_ROUTINE = Option<unsafe extern "system" fn(table: *mut SAM_REGISTER_MAPPING_TABLE) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 3047:1: generic scalar type unsupported
// pub type PSAM_CREDENTIAL_UPDATE_REGISTER_ROUTINE = Option<unsafe extern "system" fn(credentialname: *mut LSA_UNICODE_STRING) -> bool>;

// UNSUPPORTED Rust 3048:1: generic scalar type unsupported
// pub type PSAM_INIT_NOTIFICATION_ROUTINE = Option<unsafe extern "system" fn() -> bool>;

// UNSUPPORTED Rust 3049:1: generic scalar type unsupported
// pub type PSAM_PASSWORD_FILTER_ROUTINE = Option<unsafe extern "system" fn(accountname: *const LSA_UNICODE_STRING, fullname: *const LSA_UNICODE_STRING, password: *const LSA_UNICODE_STRING, setoperation: bool) -> bool>;

// UNSUPPORTED Rust 3050:1: generic scalar type unsupported
// pub type PSAM_PASSWORD_NOTIFICATION_ROUTINE = Option<unsafe extern "system" fn(username: *mut LSA_UNICODE_STRING, relativeid: u32, newpassword: *mut LSA_UNICODE_STRING) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 3051:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PctPublicKey {
//     pub Type: u32,
//     pub cbKey: u32,
//     pub pKey: [u8; 1],
// }

// UNSUPPORTED Rust 3058:1: declaration Impl has no candidate rule
// impl Default for PctPublicKey {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `Pku2uCertificateS4ULogon`: `PKU2U_LOGON_SUBMIT_TYPE` = 14;
public const val `PolicyAccountDomainInformation`: `POLICY_INFORMATION_CLASS` = 5;
public const val `PolicyAuditEventsInformation`: `POLICY_INFORMATION_CLASS` = 2;
public const val `PolicyAuditFullQueryInformation`: `POLICY_INFORMATION_CLASS` = 11;
public const val `PolicyAuditFullSetInformation`: `POLICY_INFORMATION_CLASS` = 10;
public const val `PolicyAuditLogInformation`: `POLICY_INFORMATION_CLASS` = 1;
public const val `PolicyDefaultQuotaInformation`: `POLICY_INFORMATION_CLASS` = 8;
public const val `PolicyDnsDomainInformation`: `POLICY_INFORMATION_CLASS` = 12;
public const val `PolicyDnsDomainInformationInt`: `POLICY_INFORMATION_CLASS` = 13;
public const val `PolicyDomainEfsInformation`: `POLICY_DOMAIN_INFORMATION_CLASS` = 2;
public const val `PolicyDomainKerberosTicketInformation`: `POLICY_DOMAIN_INFORMATION_CLASS` = 3;
public const val `PolicyLastEntry`: `POLICY_INFORMATION_CLASS` = 17;
public const val `PolicyLocalAccountDomainInformation`: `POLICY_INFORMATION_CLASS` = 14;
public const val `PolicyLsaServerRoleInformation`: `POLICY_INFORMATION_CLASS` = 6;
public const val `PolicyMachineAccountInformation`: `POLICY_INFORMATION_CLASS` = 15;
public const val `PolicyMachineAccountInformation2`: `POLICY_INFORMATION_CLASS` = 16;
public const val `PolicyModificationInformation`: `POLICY_INFORMATION_CLASS` = 9;
public const val `PolicyNotifyAccountDomainInformation`: `POLICY_NOTIFICATION_INFORMATION_CLASS` = 2;
public const val `PolicyNotifyAuditEventsInformation`: `POLICY_NOTIFICATION_INFORMATION_CLASS` = 1;
public const val `PolicyNotifyDnsDomainInformation`: `POLICY_NOTIFICATION_INFORMATION_CLASS` = 4;
public const val `PolicyNotifyDomainEfsInformation`: `POLICY_NOTIFICATION_INFORMATION_CLASS` = 5;
public const val `PolicyNotifyDomainKerberosTicketInformation`: `POLICY_NOTIFICATION_INFORMATION_CLASS` = 6;
public const val `PolicyNotifyGlobalSaclInformation`: `POLICY_NOTIFICATION_INFORMATION_CLASS` = 8;
public const val `PolicyNotifyMachineAccountPasswordInformation`: `POLICY_NOTIFICATION_INFORMATION_CLASS` = 7;
public const val `PolicyNotifyMax`: `POLICY_NOTIFICATION_INFORMATION_CLASS` = 9;
public const val `PolicyNotifyServerRoleInformation`: `POLICY_NOTIFICATION_INFORMATION_CLASS` = 3;
public const val `PolicyPdAccountInformation`: `POLICY_INFORMATION_CLASS` = 4;
public const val `PolicyPrimaryDomainInformation`: `POLICY_INFORMATION_CLASS` = 3;
public const val `PolicyReplicaSourceInformation`: `POLICY_INFORMATION_CLASS` = 7;
public const val `PolicyServerRoleBackup`: `POLICY_LSA_SERVER_ROLE` = 2;
public const val `PolicyServerRolePrimary`: `POLICY_LSA_SERVER_ROLE` = 3;
// UNSUPPORTED Rust 3094:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type QUERY_CONTEXT_ATTRIBUTES_EX_FN_A = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: u32, param2: *mut core::ffi::c_void, param3: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3096:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type QUERY_CONTEXT_ATTRIBUTES_EX_FN_W = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: u32, param2: *mut core::ffi::c_void, param3: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3098:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type QUERY_CONTEXT_ATTRIBUTES_FN_A = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: u32, param2: *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3100:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type QUERY_CONTEXT_ATTRIBUTES_FN_W = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: u32, param2: *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3102:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type QUERY_CREDENTIALS_ATTRIBUTES_EX_FN_A = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: u32, param2: *mut core::ffi::c_void, param3: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3104:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type QUERY_CREDENTIALS_ATTRIBUTES_EX_FN_W = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: u32, param2: *mut core::ffi::c_void, param3: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3106:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type QUERY_CREDENTIALS_ATTRIBUTES_FN_A = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: u32, param2: *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3108:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type QUERY_CREDENTIALS_ATTRIBUTES_FN_W = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: u32, param2: *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3110:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type QUERY_SECURITY_CONTEXT_TOKEN_FN = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3112:1: generic scalar type unsupported
// pub type QUERY_SECURITY_PACKAGE_INFO_FN_A = Option<unsafe extern "system" fn(param0: *mut i8, param1: *mut *mut SecPkgInfoA) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3113:1: generic scalar type unsupported
// pub type QUERY_SECURITY_PACKAGE_INFO_FN_W = Option<unsafe extern "system" fn(param0: *mut u16, param1: *mut *mut SecPkgInfoW) -> windows_sys::core::HRESULT>;

public const val `RCRED_CRED_EXISTS`: UInt = 1u;
public const val `RCRED_STATUS_NOCRED`: UInt = 0u;
public const val `RCRED_STATUS_UNKNOWN_ISSUER`: UInt = 2u;
// UNSUPPORTED Rust 3117:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type REVERT_SECURITY_CONTEXT_FN = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle) -> windows_sys::core::HRESULT>;

public const val `RTL_ENCRYPT_MEMORY_SIZE`: UInt = 8u;
public const val `RTL_ENCRYPT_OPTION_CROSS_PROCESS`: UInt = 1u;
public const val `RTL_ENCRYPT_OPTION_FOR_SYSTEM`: UInt = 4u;
public const val `RTL_ENCRYPT_OPTION_SAME_LOGON`: UInt = 2u;
// UNSUPPORTED Rust 3123:1: non-scalar type Ptr unsupported
// pub const SAM_CREDENTIAL_UPDATE_FREE_ROUTINE: windows_sys::core::PCSTR = windows_sys::core::s!("CredentialUpdateFree");

// UNSUPPORTED Rust 3124:1: non-scalar type Ptr unsupported
// pub const SAM_CREDENTIAL_UPDATE_NOTIFY_ROUTINE: windows_sys::core::PCSTR = windows_sys::core::s!("CredentialUpdateNotify");

// UNSUPPORTED Rust 3125:1: non-scalar type Ptr unsupported
// pub const SAM_CREDENTIAL_UPDATE_REGISTER_MAPPED_ENTRYPOINTS_ROUTINE: windows_sys::core::PCSTR = windows_sys::core::s!("RegisterMappedEntrypoints");

// UNSUPPORTED Rust 3126:1: non-scalar type Ptr unsupported
// pub const SAM_CREDENTIAL_UPDATE_REGISTER_ROUTINE: windows_sys::core::PCSTR = windows_sys::core::s!("CredentialUpdateRegister");

public const val `SAM_DAYS_PER_WEEK`: UInt = 7u;
// UNSUPPORTED Rust 3128:1: non-scalar type Ptr unsupported
// pub const SAM_INIT_NOTIFICATION_ROUTINE: windows_sys::core::PCSTR = windows_sys::core::s!("InitializeChangeNotify");

// UNSUPPORTED Rust 3129:1: non-scalar type Ptr unsupported
// pub const SAM_PASSWORD_CHANGE_NOTIFY_ROUTINE: windows_sys::core::PCSTR = windows_sys::core::s!("PasswordChangeNotify");

// UNSUPPORTED Rust 3130:1: non-scalar type Ptr unsupported
// pub const SAM_PASSWORD_FILTER_ROUTINE: windows_sys::core::PCSTR = windows_sys::core::s!("PasswordFilter");

// UNSUPPORTED Rust 3131:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SAM_REGISTER_MAPPING_ELEMENT {
//     pub Original: windows_sys::core::PSTR,
//     pub Mapped: windows_sys::core::PSTR,
//     pub Continuable: bool,
// }

// UNSUPPORTED Rust 3138:1: declaration Impl has no candidate rule
// impl Default for SAM_REGISTER_MAPPING_ELEMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3143:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SAM_REGISTER_MAPPING_LIST {
//     pub Count: u32,
//     pub Elements: *mut SAM_REGISTER_MAPPING_ELEMENT,
// }

// UNSUPPORTED Rust 3149:1: declaration Impl has no candidate rule
// impl Default for SAM_REGISTER_MAPPING_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3154:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SAM_REGISTER_MAPPING_TABLE {
//     pub Count: u32,
//     pub Lists: *mut SAM_REGISTER_MAPPING_LIST,
// }

// UNSUPPORTED Rust 3160:1: declaration Impl has no candidate rule
// impl Default for SAM_REGISTER_MAPPING_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SASL_AUTHZID_STATE` = Int;
public const val `SASL_OPTION_AUTHZ_PROCESSING`: UInt = 4u;
public const val `SASL_OPTION_AUTHZ_STRING`: UInt = 3u;
public const val `SASL_OPTION_RECV_SIZE`: UInt = 2u;
public const val `SASL_OPTION_SEND_SIZE`: UInt = 1u;
public const val `SCHANNEL_ALERT`: UInt = 2u;
// UNSUPPORTED Rust 3171:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCHANNEL_ALERT_TOKEN {
//     pub dwTokenType: u32,
//     pub dwAlertType: SCHANNEL_ALERT_TOKEN_ALERT_TYPE,
//     pub dwAlertNumber: u32,
// }

public typealias `SCHANNEL_ALERT_TOKEN_ALERT_TYPE` = UInt;
// UNSUPPORTED Rust 3179:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SCHANNEL_CERT_HASH {
//     pub dwLength: u32,
//     pub dwFlags: u32,
//     pub hProv: usize,
//     pub ShaHash: [u8; 20],
// }

// UNSUPPORTED Rust 3187:1: declaration Impl has no candidate rule
// impl Default for SCHANNEL_CERT_HASH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3192:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SCHANNEL_CERT_HASH_STORE {
//     pub dwLength: u32,
//     pub dwFlags: u32,
//     pub hProv: usize,
//     pub ShaHash: [u8; 20],
//     pub pwszStoreName: [u16; 128],
// }

// UNSUPPORTED Rust 3201:1: declaration Impl has no candidate rule
// impl Default for SCHANNEL_CERT_HASH_STORE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3206:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct SCHANNEL_CLIENT_SIGNATURE {
//     pub cbLength: u32,
//     pub aiHash: super::super::Cryptography::ALG_ID,
//     pub cbHash: u32,
//     pub HashValue: [u8; 36],
//     pub CertThumbprint: [u8; 20],
// }

// UNSUPPORTED Rust 3216:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SCHANNEL_CLIENT_SIGNATURE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3222:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct SCHANNEL_CRED {
//     pub dwVersion: u32,
//     pub cCreds: u32,
//     pub paCred: *mut *mut super::super::Cryptography::CERT_CONTEXT,
//     pub hRootStore: super::super::Cryptography::HCERTSTORE,
//     pub cMappers: u32,
//     pub aphMappers: *mut *mut _HMAPPER,
//     pub cSupportedAlgs: u32,
//     pub palgSupportedAlgs: *mut super::super::Cryptography::ALG_ID,
//     pub grbitEnabledProtocols: u32,
//     pub dwMinimumCipherStrength: u32,
//     pub dwMaximumCipherStrength: u32,
//     pub dwSessionLifespan: u32,
//     pub dwFlags: SCHANNEL_CRED_FLAGS,
//     pub dwCredFormat: u32,
// }

// UNSUPPORTED Rust 3241:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SCHANNEL_CRED {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SCHANNEL_CRED_FLAGS` = UInt;
public const val `SCHANNEL_CRED_VERSION`: UInt = 4u;
// UNSUPPORTED Rust 3249:1: non-scalar type Ptr unsupported
// pub const SCHANNEL_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Schannel");

// UNSUPPORTED Rust 3250:1: non-scalar type Ptr unsupported
// pub const SCHANNEL_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("Schannel");

// UNSUPPORTED Rust 3251:1: non-scalar type Ptr unsupported
// pub const SCHANNEL_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Schannel");

public const val `SCHANNEL_RENEGOTIATE`: UInt = 0u;
public const val `SCHANNEL_SECRET_PRIVKEY`: UInt = 2u;
public const val `SCHANNEL_SECRET_TYPE_CAPI`: UInt = 1u;
public const val `SCHANNEL_SESSION`: UInt = 3u;
// UNSUPPORTED Rust 3256:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCHANNEL_SESSION_TOKEN {
//     pub dwTokenType: u32,
//     pub dwFlags: SCHANNEL_SESSION_TOKEN_FLAGS,
// }

public typealias `SCHANNEL_SESSION_TOKEN_FLAGS` = UInt;
public const val `SCHANNEL_SHUTDOWN`: UInt = 1u;
public const val `SCH_ALLOW_NULL_ENCRYPTION`: UInt = 33554432u;
// UNSUPPORTED Rust 3265:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SCH_CRED {
//     pub dwVersion: u32,
//     pub cCreds: u32,
//     pub paSecret: *mut *mut core::ffi::c_void,
//     pub paPublic: *mut *mut core::ffi::c_void,
//     pub cMappers: u32,
//     pub aphMappers: *mut *mut _HMAPPER,
// }

// UNSUPPORTED Rust 3275:1: declaration Impl has no candidate rule
// impl Default for SCH_CRED {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3280:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct SCH_CREDENTIALS {
//     pub dwVersion: u32,
//     pub dwCredFormat: u32,
//     pub cCreds: u32,
//     pub paCred: *mut *mut super::super::Cryptography::CERT_CONTEXT,
//     pub hRootStore: super::super::Cryptography::HCERTSTORE,
//     pub cMappers: u32,
//     pub aphMappers: *mut *mut _HMAPPER,
//     pub dwSessionLifespan: u32,
//     pub dwFlags: u32,
//     pub cTlsParameters: u32,
//     pub pTlsParameters: *mut TLS_PARAMETERS,
// }

// UNSUPPORTED Rust 3296:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SCH_CREDENTIALS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SCH_CREDENTIALS_VERSION`: UInt = 5u;
public const val `SCH_CRED_AUTO_CRED_VALIDATION`: `SCHANNEL_CRED_FLAGS` = 32u;
public const val `SCH_CRED_CACHE_ONLY_URL_RETRIEVAL`: UInt = 32768u;
public const val `SCH_CRED_CACHE_ONLY_URL_RETRIEVAL_ON_CREATE`: `SCHANNEL_CRED_FLAGS` = 131072u;
public const val `SCH_CRED_CERT_CONTEXT`: UInt = 3u;
public const val `SCH_CRED_DEFERRED_CRED_VALIDATION`: UInt = 67108864u;
public const val `SCH_CRED_DISABLE_RECONNECTS`: UInt = 128u;
public const val `SCH_CRED_FORMAT_CERT_CONTEXT`: UInt = 0u;
public const val `SCH_CRED_FORMAT_CERT_HASH`: UInt = 1u;
public const val `SCH_CRED_FORMAT_CERT_HASH_STORE`: UInt = 2u;
public const val `SCH_CRED_IGNORE_NO_REVOCATION_CHECK`: `SCHANNEL_CRED_FLAGS` = 2048u;
public const val `SCH_CRED_IGNORE_REVOCATION_OFFLINE`: `SCHANNEL_CRED_FLAGS` = 4096u;
public const val `SCH_CRED_MANUAL_CRED_VALIDATION`: `SCHANNEL_CRED_FLAGS` = 8u;
public const val `SCH_CRED_MAX_STORE_NAME_SIZE`: UInt = 128u;
public const val `SCH_CRED_MAX_SUPPORTED_ALGS`: UInt = 256u;
public const val `SCH_CRED_MAX_SUPPORTED_ALPN_IDS`: UInt = 16u;
public const val `SCH_CRED_MAX_SUPPORTED_CERTS`: UInt = 100u;
public const val `SCH_CRED_MAX_SUPPORTED_CHAINING_MODES`: UInt = 16u;
public const val `SCH_CRED_MAX_SUPPORTED_CRYPTO_SETTINGS`: UInt = 16u;
public const val `SCH_CRED_MAX_SUPPORTED_PARAMETERS`: UInt = 16u;
public const val `SCH_CRED_MEMORY_STORE_CERT`: UInt = 65536u;
public const val `SCH_CRED_NO_DEFAULT_CREDS`: `SCHANNEL_CRED_FLAGS` = 16u;
public const val `SCH_CRED_NO_SERVERNAME_CHECK`: `SCHANNEL_CRED_FLAGS` = 4u;
public const val `SCH_CRED_NO_SYSTEM_MAPPER`: `SCHANNEL_CRED_FLAGS` = 2u;
// UNSUPPORTED Rust 3326:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SCH_CRED_PUBLIC_CERTCHAIN {
//     pub dwType: u32,
//     pub cbCertChain: u32,
//     pub pCertChain: *mut u8,
// }

// UNSUPPORTED Rust 3333:1: declaration Impl has no candidate rule
// impl Default for SCH_CRED_PUBLIC_CERTCHAIN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SCH_CRED_RESTRICTED_ROOTS`: UInt = 8192u;
public const val `SCH_CRED_REVOCATION_CHECK_CACHE_ONLY`: UInt = 16384u;
public const val `SCH_CRED_REVOCATION_CHECK_CHAIN`: `SCHANNEL_CRED_FLAGS` = 512u;
public const val `SCH_CRED_REVOCATION_CHECK_CHAIN_EXCLUDE_ROOT`: `SCHANNEL_CRED_FLAGS` = 1024u;
public const val `SCH_CRED_REVOCATION_CHECK_END_CERT`: `SCHANNEL_CRED_FLAGS` = 256u;
// UNSUPPORTED Rust 3343:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCH_CRED_SECRET_CAPI {
//     pub dwType: u32,
//     pub hProv: usize,
// }

// UNSUPPORTED Rust 3349:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SCH_CRED_SECRET_PRIVKEY {
//     pub dwType: u32,
//     pub pPrivateKey: *mut u8,
//     pub cbPrivateKey: u32,
//     pub pszPassword: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 3357:1: declaration Impl has no candidate rule
// impl Default for SCH_CRED_SECRET_PRIVKEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SCH_CRED_SNI_CREDENTIAL`: UInt = 524288u;
public const val `SCH_CRED_SNI_ENABLE_OCSP`: UInt = 1048576u;
public const val `SCH_CRED_USE_DEFAULT_CREDS`: `SCHANNEL_CRED_FLAGS` = 64u;
public const val `SCH_CRED_V1`: UInt = 1u;
public const val `SCH_CRED_V2`: UInt = 2u;
public const val `SCH_CRED_V3`: UInt = 3u;
public const val `SCH_CRED_VERSION`: UInt = 2u;
public const val `SCH_CRED_X509_CAPI`: UInt = 2u;
public const val `SCH_CRED_X509_CERTCHAIN`: UInt = 1u;
public const val `SCH_DISABLE_RECONNECTS`: `SCHANNEL_CRED_FLAGS` = 128u;
public const val `SCH_EXTENSIONS_OPTIONS_NONE`: `SchGetExtensionsOptions` = 0;
// UNSUPPORTED Rust 3373:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SCH_EXTENSION_DATA {
//     pub ExtensionType: u16,
//     pub pExtData: *const u8,
//     pub cbExtData: u32,
// }

// UNSUPPORTED Rust 3380:1: declaration Impl has no candidate rule
// impl Default for SCH_EXTENSION_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SCH_MACHINE_CERT_HASH`: UInt = 1u;
public const val `SCH_MAX_EXT_SUBSCRIPTIONS`: UInt = 2u;
public const val `SCH_NO_RECORD_HEADER`: `SchGetExtensionsOptions` = 1;
public const val `SCH_SEND_AUX_RECORD`: `SCHANNEL_CRED_FLAGS` = 2097152u;
public const val `SCH_SEND_ROOT_CERT`: `SCHANNEL_CRED_FLAGS` = 262144u;
public const val `SCH_USE_DTLS_ONLY`: UInt = 16777216u;
public const val `SCH_USE_PRESHAREDKEY_ONLY`: `SCHANNEL_CRED_FLAGS` = 8388608u;
public const val `SCH_USE_STRONG_CRYPTO`: `SCHANNEL_CRED_FLAGS` = 4194304u;
public const val `SECBUFFER_ALERT`: UInt = 17u;
public const val `SECBUFFER_APPLICATION_PROTOCOLS`: UInt = 18u;
public const val `SECBUFFER_ATTRMASK`: UInt = 4026531840u;
public const val `SECBUFFER_CERTIFICATE_REQUEST_CONTEXT`: UInt = 29u;
public const val `SECBUFFER_CHANGE_PASS_RESPONSE`: UInt = 15u;
public const val `SECBUFFER_CHANNEL_BINDINGS`: UInt = 14u;
public const val `SECBUFFER_CHANNEL_BINDINGS_RESULT`: UInt = 30u;
public const val `SECBUFFER_DATA`: UInt = 1u;
public const val `SECBUFFER_DTLS_MTU`: UInt = 24u;
public const val `SECBUFFER_EMPTY`: UInt = 0u;
public const val `SECBUFFER_EXTRA`: UInt = 5u;
public const val `SECBUFFER_FLAGS`: UInt = 27u;
public const val `SECBUFFER_KERNEL_MAP`: UInt = 536870912u;
public const val `SECBUFFER_MECHLIST`: UInt = 11u;
public const val `SECBUFFER_MECHLIST_SIGNATURE`: UInt = 12u;
public const val `SECBUFFER_MISSING`: UInt = 4u;
public const val `SECBUFFER_NEGOTIATION_INFO`: UInt = 8u;
public const val `SECBUFFER_PADDING`: UInt = 9u;
public const val `SECBUFFER_PKG_PARAMS`: UInt = 3u;
public const val `SECBUFFER_PRESHARED_KEY`: UInt = 22u;
public const val `SECBUFFER_PRESHARED_KEY_IDENTITY`: UInt = 23u;
public const val `SECBUFFER_READONLY`: UInt = 2147483648u;
public const val `SECBUFFER_READONLY_WITH_CHECKSUM`: UInt = 268435456u;
public const val `SECBUFFER_RESERVED`: UInt = 1610612736u;
public const val `SECBUFFER_SEND_GENERIC_TLS_EXTENSION`: UInt = 25u;
public const val `SECBUFFER_SRTP_MASTER_KEY_IDENTIFIER`: UInt = 20u;
public const val `SECBUFFER_SRTP_PROTECTION_PROFILES`: UInt = 19u;
public const val `SECBUFFER_STREAM`: UInt = 10u;
public const val `SECBUFFER_STREAM_HEADER`: UInt = 7u;
public const val `SECBUFFER_STREAM_TRAILER`: UInt = 6u;
public const val `SECBUFFER_SUBSCRIBE_GENERIC_TLS_EXTENSION`: UInt = 26u;
public const val `SECBUFFER_TARGET`: UInt = 13u;
public const val `SECBUFFER_TARGET_HOST`: UInt = 16u;
public const val `SECBUFFER_TOKEN`: UInt = 2u;
public const val `SECBUFFER_TOKEN_BINDING`: UInt = 21u;
public const val `SECBUFFER_TRAFFIC_SECRETS`: UInt = 28u;
public const val `SECBUFFER_UNMAPPED`: UInt = 1073741824u;
public const val `SECBUFFER_VERSION`: UInt = 0u;
public const val `SECPKGCONTEXT_CIPHERINFO_V1`: UInt = 1u;
public const val `SECPKGCONTEXT_CONNECTION_INFO_EX_V1`: UInt = 1u;
public const val `SECPKG_ANSI_ATTRIBUTE`: UInt = 0u;
// UNSUPPORTED Rust 3434:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECPKG_APP_MODE_INFO {
//     pub UserFunction: u32,
//     pub Argument1: usize,
//     pub Argument2: usize,
//     pub UserData: SecBuffer,
//     pub ReturnToLsa: bool,
// }

public typealias `SECPKG_ATTR` = UInt;
public const val `SECPKG_ATTR_ACCESS_TOKEN`: `SECPKG_ATTR` = 18u;
public const val `SECPKG_ATTR_APPLICATION_PROTOCOL`: UInt = 35u;
public const val `SECPKG_ATTR_APP_DATA`: `SECPKG_ATTR` = 94u;
public const val `SECPKG_ATTR_AUTHENTICATION_ID`: UInt = 20u;
public const val `SECPKG_ATTR_AUTHORITY`: `SECPKG_ATTR` = 6u;
public const val `SECPKG_ATTR_CC_POLICY_RESULT`: UInt = 97u;
public const val `SECPKG_ATTR_CERT_CHECK_RESULT`: UInt = 113u;
public const val `SECPKG_ATTR_CERT_CHECK_RESULT_INPROC`: UInt = 114u;
public const val `SECPKG_ATTR_CERT_TRUST_STATUS`: `SECPKG_ATTR` = 2147483780u;
public const val `SECPKG_ATTR_CIPHER_INFO`: UInt = 100u;
public const val `SECPKG_ATTR_CIPHER_STRENGTHS`: UInt = 87u;
public const val `SECPKG_ATTR_CLIENT_CERT_POLICY`: UInt = 96u;
public const val `SECPKG_ATTR_CLIENT_SPECIFIED_TARGET`: `SECPKG_ATTR` = 27u;
public const val `SECPKG_ATTR_CONNECTION_INFO`: `SECPKG_ATTR` = 90u;
public const val `SECPKG_ATTR_CONNECTION_INFO_EX`: UInt = 110u;
public const val `SECPKG_ATTR_CONTEXT_DELETED`: UInt = 33u;
public const val `SECPKG_ATTR_CREDENTIAL_NAME`: UInt = 16u;
public const val `SECPKG_ATTR_CREDS`: `SECPKG_ATTR` = 2147483776u;
public const val `SECPKG_ATTR_CREDS_2`: `SECPKG_ATTR` = 2147483782u;
public const val `SECPKG_ATTR_C_ACCESS_TOKEN`: `SECPKG_ATTR` = 2147483666u;
public const val `SECPKG_ATTR_C_FULL_ACCESS_TOKEN`: `SECPKG_ATTR` = 2147483778u;
public const val `SECPKG_ATTR_DCE_INFO`: `SECPKG_ATTR` = 3u;
public const val `SECPKG_ATTR_DTLS_MTU`: `SECPKG_ATTR` = 34u;
public const val `SECPKG_ATTR_EAP_KEY_BLOCK`: `SECPKG_ATTR` = 91u;
public const val `SECPKG_ATTR_EAP_PRF_INFO`: `SECPKG_ATTR` = 101u;
public const val `SECPKG_ATTR_EARLY_START`: `SECPKG_ATTR` = 105u;
public const val `SECPKG_ATTR_ENDPOINT_BINDINGS`: `SECPKG_ATTR` = 26u;
public const val `SECPKG_ATTR_FLAGS`: `SECPKG_ATTR` = 14u;
public const val `SECPKG_ATTR_ISSUER_LIST`: UInt = 80u;
public const val `SECPKG_ATTR_ISSUER_LIST_EX`: `SECPKG_ATTR` = 89u;
public const val `SECPKG_ATTR_IS_LOOPBACK`: UInt = 37u;
public const val `SECPKG_ATTR_KEYING_MATERIAL`: UInt = 107u;
public const val `SECPKG_ATTR_KEYING_MATERIAL_INFO`: `SECPKG_ATTR` = 106u;
public const val `SECPKG_ATTR_KEYING_MATERIAL_INPROC`: UInt = 112u;
public const val `SECPKG_ATTR_KEYING_MATERIAL_TOKEN_BINDING`: UInt = 111u;
public const val `SECPKG_ATTR_KEY_INFO`: `SECPKG_ATTR` = 5u;
public const val `SECPKG_ATTR_LAST_CLIENT_TOKEN_STATUS`: `SECPKG_ATTR` = 30u;
public typealias `SECPKG_ATTR_LCT_STATUS` = Int;
public const val `SECPKG_ATTR_LIFESPAN`: `SECPKG_ATTR` = 2u;
public const val `SECPKG_ATTR_LOCAL_CERT_CONTEXT`: `SECPKG_ATTR` = 84u;
public const val `SECPKG_ATTR_LOCAL_CERT_INFO`: UInt = 99u;
public const val `SECPKG_ATTR_LOCAL_CRED`: `SECPKG_ATTR` = 82u;
public const val `SECPKG_ATTR_LOGOFF_TIME`: UInt = 21u;
public const val `SECPKG_ATTR_MAPPED_CRED_ATTR`: UInt = 92u;
public const val `SECPKG_ATTR_NAMES`: `SECPKG_ATTR` = 1u;
public const val `SECPKG_ATTR_NATIVE_NAMES`: `SECPKG_ATTR` = 13u;
public const val `SECPKG_ATTR_NEGOTIATED_TLS_EXTENSIONS`: UInt = 36u;
public const val `SECPKG_ATTR_NEGOTIATION_INFO`: `SECPKG_ATTR` = 12u;
public const val `SECPKG_ATTR_NEGOTIATION_PACKAGE`: `SECPKG_ATTR` = 2147483777u;
public const val `SECPKG_ATTR_NEGO_INFO_FLAG_NO_KERBEROS`: UInt = 1u;
public const val `SECPKG_ATTR_NEGO_INFO_FLAG_NO_NTLM`: UInt = 2u;
public const val `SECPKG_ATTR_NEGO_KEYS`: UInt = 22u;
public const val `SECPKG_ATTR_NEGO_PKG_INFO`: UInt = 31u;
public const val `SECPKG_ATTR_NEGO_STATUS`: UInt = 32u;
public const val `SECPKG_ATTR_PACKAGE_INFO`: `SECPKG_ATTR` = 10u;
public const val `SECPKG_ATTR_PASSWORD_EXPIRY`: `SECPKG_ATTR` = 8u;
public const val `SECPKG_ATTR_PROMPTING_NEEDED`: UInt = 24u;
public const val `SECPKG_ATTR_PROTO_INFO`: UInt = 7u;
public const val `SECPKG_ATTR_REMOTE_CERTIFICATES`: UInt = 95u;
public const val `SECPKG_ATTR_REMOTE_CERT_CHAIN`: UInt = 103u;
public const val `SECPKG_ATTR_REMOTE_CERT_CONTEXT`: `SECPKG_ATTR` = 83u;
public const val `SECPKG_ATTR_REMOTE_CRED`: UInt = 81u;
public const val `SECPKG_ATTR_ROOT_STORE`: `SECPKG_ATTR` = 85u;
public const val `SECPKG_ATTR_SASL_CONTEXT`: UInt = 65536u;
public const val `SECPKG_ATTR_SERIALIZED_REMOTE_CERT_CONTEXT`: UInt = 117u;
public const val `SECPKG_ATTR_SERIALIZED_REMOTE_CERT_CONTEXT_INPROC`: UInt = 116u;
public const val `SECPKG_ATTR_SERVER_AUTH_FLAGS`: `SECPKG_ATTR` = 2147483779u;
public const val `SECPKG_ATTR_SESSION_INFO`: `SECPKG_ATTR` = 93u;
public const val `SECPKG_ATTR_SESSION_KEY`: `SECPKG_ATTR` = 9u;
public const val `SECPKG_ATTR_SESSION_TICKET_KEYS`: UInt = 115u;
public const val `SECPKG_ATTR_SIZES`: `SECPKG_ATTR` = 0u;
public const val `SECPKG_ATTR_SRTP_PARAMETERS`: UInt = 108u;
public const val `SECPKG_ATTR_STREAM_SIZES`: `SECPKG_ATTR` = 4u;
public const val `SECPKG_ATTR_SUBJECT_SECURITY_ATTRIBUTES`: `SECPKG_ATTR` = 124u;
public const val `SECPKG_ATTR_SUPPORTED_ALGS`: UInt = 86u;
public const val `SECPKG_ATTR_SUPPORTED_PROTOCOLS`: UInt = 88u;
public const val `SECPKG_ATTR_SUPPORTED_SIGNATURES`: `SECPKG_ATTR` = 102u;
public const val `SECPKG_ATTR_TARGET`: UInt = 19u;
public const val `SECPKG_ATTR_TARGET_INFORMATION`: `SECPKG_ATTR` = 17u;
public const val `SECPKG_ATTR_THUNK_ALL`: UInt = 65536u;
public const val `SECPKG_ATTR_TOKEN_BINDING`: UInt = 109u;
public const val `SECPKG_ATTR_UI_INFO`: UInt = 104u;
public const val `SECPKG_ATTR_UNIQUE_BINDINGS`: `SECPKG_ATTR` = 25u;
public const val `SECPKG_ATTR_USER_FLAGS`: UInt = 11u;
public const val `SECPKG_ATTR_USE_NCRYPT`: UInt = 98u;
public const val `SECPKG_ATTR_USE_VALIDATED`: UInt = 15u;
// UNSUPPORTED Rust 3530:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECPKG_BYTE_VECTOR {
//     pub ByteArrayOffset: u32,
//     pub ByteArrayLength: u16,
// }

public const val `SECPKG_CALLFLAGS_APPCONTAINER`: UInt = 1u;
public const val `SECPKG_CALLFLAGS_APPCONTAINER_AUTHCAPABLE`: UInt = 2u;
public const val `SECPKG_CALLFLAGS_APPCONTAINER_UPNCAPABLE`: UInt = 8u;
public const val `SECPKG_CALLFLAGS_FORCE_SUPPLIED`: UInt = 4u;
public const val `SECPKG_CALL_ANSI`: UInt = 2u;
public const val `SECPKG_CALL_ASYNC_UPDATE`: UInt = 4096u;
public const val `SECPKG_CALL_BUFFER_MARSHAL`: UInt = 65536u;
public const val `SECPKG_CALL_CLEANUP`: UInt = 32u;
public const val `SECPKG_CALL_CLOUDAP_CONNECT`: UInt = 262144u;
// UNSUPPORTED Rust 3545:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECPKG_CALL_INFO {
//     pub ProcessId: u32,
//     pub ThreadId: u32,
//     pub Attributes: u32,
//     pub CallCount: u32,
//     pub MechOid: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3554:1: declaration Impl has no candidate rule
// impl Default for SECPKG_CALL_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SECPKG_CALL_IN_PROC`: UInt = 16u;
public const val `SECPKG_CALL_IS_TCB`: UInt = 512u;
public const val `SECPKG_CALL_KERNEL_MODE`: UInt = 1u;
public const val `SECPKG_CALL_NEGO`: UInt = 16384u;
public const val `SECPKG_CALL_NEGO_EXTENDER`: UInt = 32768u;
public const val `SECPKG_CALL_NETWORK_ONLY`: UInt = 1024u;
public typealias `SECPKG_CALL_PACKAGE_MESSAGE_TYPE` = Int;
// UNSUPPORTED Rust 3566:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECPKG_CALL_PACKAGE_PIN_DC_REQUEST {
//     pub MessageType: u32,
//     pub Flags: u32,
//     pub DomainName: LSA_UNICODE_STRING,
//     pub DcName: LSA_UNICODE_STRING,
//     pub DcFlags: u32,
// }

// UNSUPPORTED Rust 3575:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECPKG_CALL_PACKAGE_TRANSFER_CRED_REQUEST {
//     pub MessageType: u32,
//     pub OriginLogonId: super::super::super::Foundation::LUID,
//     pub DestinationLogonId: super::super::super::Foundation::LUID,
//     pub Flags: u32,
// }

public const val `SECPKG_CALL_PACKAGE_TRANSFER_CRED_REQUEST_FLAG_CLEANUP_CREDENTIALS`: UInt = 2u;
public const val `SECPKG_CALL_PACKAGE_TRANSFER_CRED_REQUEST_FLAG_OPTIMISTIC_LOGON`: UInt = 1u;
public const val `SECPKG_CALL_PACKAGE_TRANSFER_CRED_REQUEST_FLAG_TO_SSO_SESSION`: UInt = 4u;
// UNSUPPORTED Rust 3586:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECPKG_CALL_PACKAGE_UNPIN_ALL_DCS_REQUEST {
//     pub MessageType: u32,
//     pub Flags: u32,
// }

public const val `SECPKG_CALL_PROCESS_TERM`: UInt = 256u;
public const val `SECPKG_CALL_RECURSIVE`: UInt = 8u;
public const val `SECPKG_CALL_SYSTEM_PROC`: UInt = 8192u;
public const val `SECPKG_CALL_THREAD_TERM`: UInt = 128u;
public const val `SECPKG_CALL_UNLOCK`: UInt = 131072u;
public const val `SECPKG_CALL_URGENT`: UInt = 4u;
public const val `SECPKG_CALL_WINLOGON`: UInt = 2048u;
public const val `SECPKG_CALL_WOWA32`: UInt = 262144u;
public const val `SECPKG_CALL_WOWCLIENT`: UInt = 64u;
public const val `SECPKG_CALL_WOWX86`: UInt = 64u;
// UNSUPPORTED Rust 3602:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECPKG_CLIENT_INFO {
//     pub LogonId: super::super::super::Foundation::LUID,
//     pub ProcessID: u32,
//     pub ThreadID: u32,
//     pub HasTcbPrivilege: bool,
//     pub Impersonating: bool,
//     pub Restricted: bool,
//     pub ClientFlags: u8,
//     pub ImpersonationLevel: super::super::SECURITY_IMPERSONATION_LEVEL,
//     pub ClientToken: super::super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 3615:1: declaration Impl has no candidate rule
// impl Default for SECPKG_CLIENT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3620:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECPKG_CLIENT_INFO_EX {
//     pub LogonId: super::super::super::Foundation::LUID,
//     pub ProcessID: u32,
//     pub ThreadID: u32,
//     pub HasTcbPrivilege: bool,
//     pub Impersonating: bool,
//     pub Restricted: bool,
//     pub ClientFlags: u8,
//     pub ImpersonationLevel: super::super::SECURITY_IMPERSONATION_LEVEL,
//     pub ClientToken: super::super::super::Foundation::HANDLE,
//     pub IdentificationLogonId: super::super::super::Foundation::LUID,
//     pub IdentificationToken: super::super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 3635:1: declaration Impl has no candidate rule
// impl Default for SECPKG_CLIENT_INFO_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SECPKG_CLIENT_PROCESS_TERMINATED`: UInt = 1u;
public const val `SECPKG_CLIENT_THREAD_TERMINATED`: UInt = 2u;
public const val `SECPKG_CONTEXT_EXPORT_DELETE_OLD`: `EXPORT_SECURITY_CONTEXT_FLAGS` = 2u;
public const val `SECPKG_CONTEXT_EXPORT_RESET_NEW`: `EXPORT_SECURITY_CONTEXT_FLAGS` = 1u;
public const val `SECPKG_CONTEXT_EXPORT_TO_KERNEL`: `EXPORT_SECURITY_CONTEXT_FLAGS` = 4u;
// UNSUPPORTED Rust 3645:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECPKG_CONTEXT_THUNKS {
//     pub InfoLevelCount: u32,
//     pub Levels: [u32; 1],
// }

// UNSUPPORTED Rust 3651:1: declaration Impl has no candidate rule
// impl Default for SECPKG_CONTEXT_THUNKS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SECPKG_CRED` = UInt;
// UNSUPPORTED Rust 3657:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECPKG_CREDENTIAL {
//     pub Version: u64,
//     pub cbHeaderLength: u16,
//     pub cbStructureLength: u32,
//     pub ClientProcess: u32,
//     pub ClientThread: u32,
//     pub LogonId: super::super::super::Foundation::LUID,
//     pub ClientToken: super::super::super::Foundation::HANDLE,
//     pub SessionId: u32,
//     pub ModifiedId: super::super::super::Foundation::LUID,
//     pub fCredentials: u32,
//     pub Flags: u32,
//     pub PrincipalName: SECPKG_BYTE_VECTOR,
//     pub PackageList: SECPKG_BYTE_VECTOR,
//     pub MarshaledSuppliedCreds: SECPKG_BYTE_VECTOR,
// }

// UNSUPPORTED Rust 3675:1: declaration Impl has no candidate rule
// impl Default for SECPKG_CREDENTIAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SECPKG_CREDENTIAL_ATTRIBUTE`: UInt = 0u;
public const val `SECPKG_CREDENTIAL_FLAGS_CALLER_HAS_TCB`: UInt = 1u;
public const val `SECPKG_CREDENTIAL_FLAGS_CREDMAN_CRED`: UInt = 2u;
public const val `SECPKG_CREDENTIAL_VERSION`: UInt = 201u;
public const val `SECPKG_CRED_ATTR_CERT`: UInt = 4u;
public const val `SECPKG_CRED_ATTR_KDC_PROXY_SETTINGS`: UInt = 3u;
public const val `SECPKG_CRED_ATTR_NAMES`: UInt = 1u;
public const val `SECPKG_CRED_ATTR_PAC_BYPASS`: UInt = 5u;
public const val `SECPKG_CRED_ATTR_SSI_PROVIDER`: UInt = 2u;
public const val `SECPKG_CRED_AUTOLOGON_RESTRICTED`: UInt = 16u;
public const val `SECPKG_CRED_BOTH`: UInt = 3u;
public typealias `SECPKG_CRED_CLASS` = Int;
public const val `SECPKG_CRED_DEFAULT`: UInt = 4u;
public const val `SECPKG_CRED_INBOUND`: `SECPKG_CRED` = 1u;
public const val `SECPKG_CRED_OUTBOUND`: `SECPKG_CRED` = 2u;
public const val `SECPKG_CRED_PROCESS_POLICY_ONLY`: UInt = 32u;
public const val `SECPKG_CRED_RESERVED`: UInt = 4026531840u;
// UNSUPPORTED Rust 3697:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECPKG_DLL_FUNCTIONS {
//     pub AllocateHeap: PLSA_ALLOCATE_LSA_HEAP,
//     pub FreeHeap: PLSA_FREE_LSA_HEAP,
//     pub RegisterCallback: PLSA_REGISTER_CALLBACK,
//     pub LocatePackageById: PLSA_LOCATE_PKG_BY_ID,
// }

// UNSUPPORTED Rust 3705:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECPKG_EVENT_NOTIFY {
//     pub EventClass: u32,
//     pub Reserved: u32,
//     pub EventDataSize: u32,
//     pub EventData: *mut core::ffi::c_void,
//     pub PackageParameter: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3714:1: declaration Impl has no candidate rule
// impl Default for SECPKG_EVENT_NOTIFY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3719:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECPKG_EVENT_PACKAGE_CHANGE {
//     pub ChangeType: SECPKG_PACKAGE_CHANGE_TYPE,
//     pub PackageId: usize,
//     pub PackageName: SECURITY_STRING,
// }

// UNSUPPORTED Rust 3726:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECPKG_EVENT_ROLE_CHANGE {
//     pub PreviousRole: u32,
//     pub NewRole: u32,
// }

// UNSUPPORTED Rust 3732:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECPKG_EXTENDED_INFORMATION {
//     pub Class: SECPKG_EXTENDED_INFORMATION_CLASS,
//     pub Info: SECPKG_EXTENDED_INFORMATION_0,
// }

// UNSUPPORTED Rust 3738:1: declaration Impl has no candidate rule
// impl Default for SECPKG_EXTENDED_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3743:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SECPKG_EXTENDED_INFORMATION_0 {
//     pub GssInfo: SECPKG_GSS_INFO,
//     pub ContextThunks: SECPKG_CONTEXT_THUNKS,
//     pub MutualAuthLevel: SECPKG_MUTUAL_AUTH_LEVEL,
//     pub WowClientDll: SECPKG_WOW_CLIENT_DLL,
//     pub ExtraOids: SECPKG_EXTRA_OIDS,
//     pub Nego2Info: SECPKG_NEGO2_INFO,
// }

// UNSUPPORTED Rust 3753:1: declaration Impl has no candidate rule
// impl Default for SECPKG_EXTENDED_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SECPKG_EXTENDED_INFORMATION_CLASS` = Int;
// UNSUPPORTED Rust 3759:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECPKG_EXTRA_OIDS {
//     pub OidCount: u32,
//     pub Oids: [SECPKG_SERIALIZED_OID; 1],
// }

// UNSUPPORTED Rust 3765:1: declaration Impl has no candidate rule
// impl Default for SECPKG_EXTRA_OIDS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SECPKG_FLAG_ACCEPT_WIN32_NAME`: UInt = 512u;
public const val `SECPKG_FLAG_APPCONTAINER_CHECKS`: UInt = 8388608u;
public const val `SECPKG_FLAG_APPCONTAINER_PASSTHROUGH`: UInt = 4194304u;
public const val `SECPKG_FLAG_APPLY_LOOPBACK`: UInt = 33554432u;
public const val `SECPKG_FLAG_ASCII_BUFFERS`: UInt = 16384u;
public const val `SECPKG_FLAG_CLIENT_ONLY`: UInt = 64u;
public const val `SECPKG_FLAG_CONNECTION`: UInt = 16u;
public const val `SECPKG_FLAG_CREDENTIAL_ISOLATION_ENABLED`: UInt = 16777216u;
public const val `SECPKG_FLAG_DATAGRAM`: UInt = 8u;
public const val `SECPKG_FLAG_DELEGATION`: UInt = 131072u;
public const val `SECPKG_FLAG_EXTENDED_ERROR`: UInt = 128u;
public const val `SECPKG_FLAG_FRAGMENT`: UInt = 32768u;
public const val `SECPKG_FLAG_GSS_COMPATIBLE`: UInt = 4096u;
public const val `SECPKG_FLAG_IMPERSONATION`: UInt = 256u;
public const val `SECPKG_FLAG_INTEGRITY`: UInt = 1u;
public const val `SECPKG_FLAG_LOGON`: UInt = 8192u;
public const val `SECPKG_FLAG_MULTI_REQUIRED`: UInt = 32u;
public const val `SECPKG_FLAG_MUTUAL_AUTH`: UInt = 65536u;
public const val `SECPKG_FLAG_NEGOTIABLE`: UInt = 2048u;
public const val `SECPKG_FLAG_NEGOTIABLE2`: UInt = 2097152u;
public const val `SECPKG_FLAG_NEGO_EXTENDER`: UInt = 1048576u;
public const val `SECPKG_FLAG_PRIVACY`: UInt = 2u;
public const val `SECPKG_FLAG_READONLY_WITH_CHECKSUM`: UInt = 262144u;
public const val `SECPKG_FLAG_RESTRICTED_TOKENS`: UInt = 524288u;
public const val `SECPKG_FLAG_STREAM`: UInt = 1024u;
public const val `SECPKG_FLAG_TOKEN_ONLY`: UInt = 4u;
// UNSUPPORTED Rust 3796:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Security_Credentials", feature = "Win32_System_Threading"))]
// #[derive(Clone, Copy, Default)]
// pub struct SECPKG_FUNCTION_TABLE {
//     pub InitializePackage: PLSA_AP_INITIALIZE_PACKAGE,
//     pub LogonUserA: PLSA_AP_LOGON_USER,
//     pub CallPackage: PLSA_AP_CALL_PACKAGE,
//     pub LogonTerminated: PLSA_AP_LOGON_TERMINATED,
//     pub CallPackageUntrusted: PLSA_AP_CALL_PACKAGE,
//     pub CallPackagePassthrough: PLSA_AP_CALL_PACKAGE_PASSTHROUGH,
//     pub LogonUserExA: PLSA_AP_LOGON_USER_EX,
//     pub LogonUserEx2: PLSA_AP_LOGON_USER_EX2,
//     pub Initialize: SpInitializeFn,
//     pub Shutdown: SpShutdownFn,
//     pub GetInfo: SpGetInfoFn,
//     pub AcceptCredentials: SpAcceptCredentialsFn,
//     pub AcquireCredentialsHandleA: SpAcquireCredentialsHandleFn,
//     pub QueryCredentialsAttributesA: SpQueryCredentialsAttributesFn,
//     pub FreeCredentialsHandle: SpFreeCredentialsHandleFn,
//     pub SaveCredentials: SpSaveCredentialsFn,
//     pub GetCredentials: SpGetCredentialsFn,
//     pub DeleteCredentials: SpDeleteCredentialsFn,
//     pub InitLsaModeContext: SpInitLsaModeContextFn,
//     pub AcceptLsaModeContext: SpAcceptLsaModeContextFn,
//     pub DeleteContext: SpDeleteContextFn,
//     pub ApplyControlToken: SpApplyControlTokenFn,
//     pub GetUserInfo: SpGetUserInfoFn,
//     pub GetExtendedInformation: SpGetExtendedInformationFn,
//     pub QueryContextAttributesA: SpQueryContextAttributesFn,
//     pub AddCredentialsA: SpAddCredentialsFn,
//     pub SetExtendedInformation: SpSetExtendedInformationFn,
//     pub SetContextAttributesA: SpSetContextAttributesFn,
//     pub SetCredentialsAttributesA: SpSetCredentialsAttributesFn,
//     pub ChangeAccountPasswordA: SpChangeAccountPasswordFn,
//     pub QueryMetaData: SpQueryMetaDataFn,
//     pub ExchangeMetaData: SpExchangeMetaDataFn,
//     pub GetCredUIContext: SpGetCredUIContextFn,
//     pub UpdateCredentials: SpUpdateCredentialsFn,
//     pub ValidateTargetInfo: SpValidateTargetInfoFn,
//     pub PostLogonUser: LSA_AP_POST_LOGON_USER,
//     pub GetRemoteCredGuardLogonBuffer: SpGetRemoteCredGuardLogonBufferFn,
//     pub GetRemoteCredGuardSupplementalCreds: SpGetRemoteCredGuardSupplementalCredsFn,
//     pub GetTbalSupplementalCreds: SpGetTbalSupplementalCredsFn,
//     pub LogonUserEx3: PLSA_AP_LOGON_USER_EX3,
//     pub PreLogonUserSurrogate: PLSA_AP_PRE_LOGON_USER_SURROGATE,
//     pub PostLogonUserSurrogate: PLSA_AP_POST_LOGON_USER_SURROGATE,
//     pub ExtractTargetInfo: SpExtractTargetInfoFn,
// }

// UNSUPPORTED Rust 3844:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECPKG_GSS_INFO {
//     pub EncodedIdLength: u32,
//     pub EncodedId: [u8; 4],
// }

// UNSUPPORTED Rust 3850:1: declaration Impl has no candidate rule
// impl Default for SECPKG_GSS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SECPKG_ID_NONE`: UInt = 65535u;
public const val `SECPKG_INTERFACE_VERSION`: UInt = 65536u;
public const val `SECPKG_INTERFACE_VERSION_10`: UInt = 33554432u;
public const val `SECPKG_INTERFACE_VERSION_11`: UInt = 67108864u;
public const val `SECPKG_INTERFACE_VERSION_2`: UInt = 131072u;
public const val `SECPKG_INTERFACE_VERSION_3`: UInt = 262144u;
public const val `SECPKG_INTERFACE_VERSION_4`: UInt = 524288u;
public const val `SECPKG_INTERFACE_VERSION_5`: UInt = 1048576u;
public const val `SECPKG_INTERFACE_VERSION_6`: UInt = 2097152u;
public const val `SECPKG_INTERFACE_VERSION_7`: UInt = 4194304u;
public const val `SECPKG_INTERFACE_VERSION_8`: UInt = 8388608u;
public const val `SECPKG_INTERFACE_VERSION_9`: UInt = 16777216u;
// UNSUPPORTED Rust 3867:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy, Default)]
// pub struct SECPKG_KERNEL_FUNCTIONS {
//     pub AllocateHeap: PLSA_ALLOCATE_LSA_HEAP,
//     pub FreeHeap: PLSA_FREE_LSA_HEAP,
//     pub CreateContextList: PKSEC_CREATE_CONTEXT_LIST,
//     pub InsertListEntry: PKSEC_INSERT_LIST_ENTRY,
//     pub ReferenceListEntry: PKSEC_REFERENCE_LIST_ENTRY,
//     pub DereferenceListEntry: PKSEC_DEREFERENCE_LIST_ENTRY,
//     pub SerializeWinntAuthData: PKSEC_SERIALIZE_WINNT_AUTH_DATA,
//     pub SerializeSchannelAuthData: PKSEC_SERIALIZE_SCHANNEL_AUTH_DATA,
//     pub LocatePackageById: PKSEC_LOCATE_PKG_BY_ID,
// }

// UNSUPPORTED Rust 3881:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy, Default)]
// pub struct SECPKG_KERNEL_FUNCTION_TABLE {
//     pub Initialize: KspInitPackageFn,
//     pub DeleteContext: KspDeleteContextFn,
//     pub InitContext: KspInitContextFn,
//     pub MapHandle: KspMapHandleFn,
//     pub Sign: KspMakeSignatureFn,
//     pub Verify: KspVerifySignatureFn,
//     pub Seal: KspSealMessageFn,
//     pub Unseal: KspUnsealMessageFn,
//     pub GetToken: KspGetTokenFn,
//     pub QueryAttributes: KspQueryAttributesFn,
//     pub CompleteToken: KspCompleteTokenFn,
//     pub ExportContext: SpExportSecurityContextFn,
//     pub ImportContext: SpImportSecurityContextFn,
//     pub SetPackagePagingMode: KspSetPagingModeFn,
//     pub SerializeAuthData: KspSerializeAuthDataFn,
// }

// UNSUPPORTED Rust 3901:1: non-scalar type Ptr unsupported
// pub const SECPKG_LSAMODEINIT_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("SpLsaModeInitialize");

public const val `SECPKG_MAX_OID_LENGTH`: UInt = 32u;
public const val `SECPKG_MSVAV_FLAGS_VALID`: UInt = 1u;
public const val `SECPKG_MSVAV_TIMESTAMP_VALID`: UInt = 2u;
// UNSUPPORTED Rust 3905:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECPKG_MUTUAL_AUTH_LEVEL {
//     pub MutualAuthLevel: u32,
// }

public typealias `SECPKG_NAME_TYPE` = Int;
// UNSUPPORTED Rust 3911:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECPKG_NEGO2_INFO {
//     pub AuthScheme: [u8; 16],
//     pub PackageFlags: u32,
// }

// UNSUPPORTED Rust 3917:1: declaration Impl has no candidate rule
// impl Default for SECPKG_NEGO2_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SECPKG_NEGOTIATION_COMPLETE`: UInt = 0u;
public const val `SECPKG_NEGOTIATION_DIRECT`: UInt = 3u;
public const val `SECPKG_NEGOTIATION_IN_PROGRESS`: UInt = 2u;
public const val `SECPKG_NEGOTIATION_OPTIMISTIC`: UInt = 1u;
public const val `SECPKG_NEGOTIATION_TRY_MULTICRED`: UInt = 4u;
// UNSUPPORTED Rust 3927:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECPKG_NTLM_TARGETINFO {
//     pub Flags: u32,
//     pub MsvAvNbComputerName: windows_sys::core::PWSTR,
//     pub MsvAvNbDomainName: windows_sys::core::PWSTR,
//     pub MsvAvDnsComputerName: windows_sys::core::PWSTR,
//     pub MsvAvDnsDomainName: windows_sys::core::PWSTR,
//     pub MsvAvDnsTreeName: windows_sys::core::PWSTR,
//     pub MsvAvFlags: u32,
//     pub MsvAvTimestamp: super::super::super::Foundation::FILETIME,
//     pub MsvAvTargetName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 3940:1: declaration Impl has no candidate rule
// impl Default for SECPKG_NTLM_TARGETINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SECPKG_OPTIONS_PERMANENT`: UInt = 1u;
public const val `SECPKG_OPTIONS_TYPE_LSA`: `SECURITY_PACKAGE_OPTIONS_TYPE` = 1u;
public const val `SECPKG_OPTIONS_TYPE_SSPI`: `SECURITY_PACKAGE_OPTIONS_TYPE` = 2u;
public const val `SECPKG_OPTIONS_TYPE_UNKNOWN`: `SECURITY_PACKAGE_OPTIONS_TYPE` = 0u;
public const val `SECPKG_PACKAGE_CHANGE_LOAD`: `SECPKG_PACKAGE_CHANGE_TYPE` = 0u;
public const val `SECPKG_PACKAGE_CHANGE_SELECT`: `SECPKG_PACKAGE_CHANGE_TYPE` = 2u;
public typealias `SECPKG_PACKAGE_CHANGE_TYPE` = UInt;
public const val `SECPKG_PACKAGE_CHANGE_UNLOAD`: `SECPKG_PACKAGE_CHANGE_TYPE` = 1u;
// UNSUPPORTED Rust 3953:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECPKG_PARAMETERS {
//     pub Version: u32,
//     pub MachineState: u32,
//     pub SetupMode: u32,
//     pub DomainSid: super::super::PSID,
//     pub DomainName: LSA_UNICODE_STRING,
//     pub DnsDomainName: LSA_UNICODE_STRING,
//     pub DomainGuid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 3964:1: declaration Impl has no candidate rule
// impl Default for SECPKG_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3969:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECPKG_POST_LOGON_USER_INFO {
//     pub Flags: u32,
//     pub LogonId: super::super::super::Foundation::LUID,
//     pub LinkedLogonId: super::super::super::Foundation::LUID,
// }

// UNSUPPORTED Rust 3976:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECPKG_PRIMARY_CRED {
//     pub LogonId: super::super::super::Foundation::LUID,
//     pub DownlevelName: LSA_UNICODE_STRING,
//     pub DomainName: LSA_UNICODE_STRING,
//     pub Password: LSA_UNICODE_STRING,
//     pub OldPassword: LSA_UNICODE_STRING,
//     pub UserSid: super::super::PSID,
//     pub Flags: u32,
//     pub DnsDomainName: LSA_UNICODE_STRING,
//     pub Upn: LSA_UNICODE_STRING,
//     pub LogonServer: LSA_UNICODE_STRING,
//     pub Spare1: LSA_UNICODE_STRING,
//     pub Spare2: LSA_UNICODE_STRING,
//     pub Spare3: LSA_UNICODE_STRING,
//     pub Spare4: LSA_UNICODE_STRING,
// }

// UNSUPPORTED Rust 3994:1: declaration Impl has no candidate rule
// impl Default for SECPKG_PRIMARY_CRED {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3999:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECPKG_PRIMARY_CRED_EX {
//     pub LogonId: super::super::super::Foundation::LUID,
//     pub DownlevelName: LSA_UNICODE_STRING,
//     pub DomainName: LSA_UNICODE_STRING,
//     pub Password: LSA_UNICODE_STRING,
//     pub OldPassword: LSA_UNICODE_STRING,
//     pub UserSid: super::super::PSID,
//     pub Flags: u32,
//     pub DnsDomainName: LSA_UNICODE_STRING,
//     pub Upn: LSA_UNICODE_STRING,
//     pub LogonServer: LSA_UNICODE_STRING,
//     pub Spare1: LSA_UNICODE_STRING,
//     pub Spare2: LSA_UNICODE_STRING,
//     pub Spare3: LSA_UNICODE_STRING,
//     pub Spare4: LSA_UNICODE_STRING,
//     pub PackageId: usize,
//     pub PrevLogonId: super::super::super::Foundation::LUID,
//     pub FlagsEx: u32,
// }

// UNSUPPORTED Rust 4020:1: declaration Impl has no candidate rule
// impl Default for SECPKG_PRIMARY_CRED_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SECPKG_PRIMARY_CRED_EX_FLAGS_EX_DELEGATION_TOKEN`: UInt = 1u;
// UNSUPPORTED Rust 4026:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECPKG_REDIRECTED_LOGON_BUFFER {
//     pub RedirectedLogonGuid: windows_sys::core::GUID,
//     pub RedirectedLogonHandle: super::super::super::Foundation::HANDLE,
//     pub Init: PLSA_REDIRECTED_LOGON_INIT,
//     pub Callback: PLSA_REDIRECTED_LOGON_CALLBACK,
//     pub CleanupCallback: PLSA_REDIRECTED_LOGON_CLEANUP_CALLBACK,
//     pub GetLogonCreds: PLSA_REDIRECTED_LOGON_GET_LOGON_CREDS,
//     pub GetSupplementalCreds: PLSA_REDIRECTED_LOGON_GET_SUPP_CREDS,
//     pub GetRedirectedLogonSid: PLSA_REDIRECTED_LOGON_GET_SID,
// }

// UNSUPPORTED Rust 4038:1: declaration Impl has no candidate rule
// impl Default for SECPKG_REDIRECTED_LOGON_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4043:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SECPKG_REDIRECTED_LOGON_GUID_INITIALIZER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc2be5457_82eb_483e_ae4e_7468ef14d509);

// UNSUPPORTED Rust 4044:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECPKG_SERIALIZED_OID {
//     pub OidLength: u32,
//     pub OidAttributes: u32,
//     pub OidValue: [u8; 32],
// }

// UNSUPPORTED Rust 4051:1: declaration Impl has no candidate rule
// impl Default for SECPKG_SERIALIZED_OID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SECPKG_SESSIONINFO_TYPE` = Int;
// UNSUPPORTED Rust 4057:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECPKG_SHORT_VECTOR {
//     pub ShortArrayOffset: u32,
//     pub ShortArrayCount: u16,
// }

public const val `SECPKG_STATE_CRED_ISOLATION_ENABLED`: UInt = 32u;
public const val `SECPKG_STATE_DOMAIN_CONTROLLER`: UInt = 4u;
public const val `SECPKG_STATE_ENCRYPTION_PERMITTED`: UInt = 1u;
public const val `SECPKG_STATE_RESERVED_1`: UInt = 2147483648u;
public const val `SECPKG_STATE_STANDALONE`: UInt = 16u;
public const val `SECPKG_STATE_STRONG_ENCRYPTION_PERMITTED`: UInt = 2u;
public const val `SECPKG_STATE_WORKSTATION`: UInt = 8u;
// UNSUPPORTED Rust 4070:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECPKG_SUPPLEMENTAL_CRED {
//     pub PackageName: LSA_UNICODE_STRING,
//     pub CredentialSize: u32,
//     pub Credentials: *mut u8,
// }

// UNSUPPORTED Rust 4077:1: declaration Impl has no candidate rule
// impl Default for SECPKG_SUPPLEMENTAL_CRED {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4082:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECPKG_SUPPLEMENTAL_CRED_ARRAY {
//     pub CredentialCount: u32,
//     pub Credentials: [SECPKG_SUPPLEMENTAL_CRED; 1],
// }

// UNSUPPORTED Rust 4088:1: declaration Impl has no candidate rule
// impl Default for SECPKG_SUPPLEMENTAL_CRED_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4093:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECPKG_SUPPLIED_CREDENTIAL {
//     pub cbHeaderLength: u16,
//     pub cbStructureLength: u16,
//     pub UserName: SECPKG_SHORT_VECTOR,
//     pub DomainName: SECPKG_SHORT_VECTOR,
//     pub PackedCredentials: SECPKG_BYTE_VECTOR,
//     pub CredFlags: u32,
// }

// UNSUPPORTED Rust 4103:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECPKG_SURROGATE_LOGON {
//     pub Version: u32,
//     pub SurrogateLogonID: super::super::super::Foundation::LUID,
//     pub EntryCount: u32,
//     pub Entries: *mut SECPKG_SURROGATE_LOGON_ENTRY,
// }

// UNSUPPORTED Rust 4111:1: declaration Impl has no candidate rule
// impl Default for SECPKG_SURROGATE_LOGON {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4116:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECPKG_SURROGATE_LOGON_ENTRY {
//     pub Type: windows_sys::core::GUID,
//     pub Data: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 4122:1: declaration Impl has no candidate rule
// impl Default for SECPKG_SURROGATE_LOGON_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SECPKG_SURROGATE_LOGON_VERSION_1`: UInt = 1u;
// UNSUPPORTED Rust 4128:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECPKG_TARGETINFO {
//     pub DomainSid: super::super::PSID,
//     pub ComputerName: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 4134:1: declaration Impl has no candidate rule
// impl Default for SECPKG_TARGETINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SECPKG_UNICODE_ATTRIBUTE`: UInt = 2147483648u;
// UNSUPPORTED Rust 4140:1: non-scalar type Ptr unsupported
// pub const SECPKG_USERMODEINIT_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("SpUserModeInitialize");

// UNSUPPORTED Rust 4141:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECPKG_USER_FUNCTION_TABLE {
//     pub InstanceInit: SpInstanceInitFn,
//     pub InitUserModeContext: SpInitUserModeContextFn,
//     pub MakeSignature: SpMakeSignatureFn,
//     pub VerifySignature: SpVerifySignatureFn,
//     pub SealMessage: SpSealMessageFn,
//     pub UnsealMessage: SpUnsealMessageFn,
//     pub GetContextToken: SpGetContextTokenFn,
//     pub QueryContextAttributesA: SpQueryContextAttributesFn,
//     pub CompleteAuthToken: SpCompleteAuthTokenFn,
//     pub DeleteUserModeContext: SpDeleteContextFn,
//     pub FormatCredentials: SpFormatCredentialsFn,
//     pub MarshallSupplementalCreds: SpMarshallSupplementalCredsFn,
//     pub ExportContext: SpExportSecurityContextFn,
//     pub ImportContext: SpImportSecurityContextFn,
//     pub MarshalAttributeData: SpMarshalAttributeDataFn,
// }

// UNSUPPORTED Rust 4160:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECPKG_WOW_CLIENT_DLL {
//     pub WowClientDllPath: SECURITY_STRING,
// }

public const val `SECQOP_WRAP_NO_ENCRYPT`: UInt = 2147483649u;
public const val `SECQOP_WRAP_OOB_DATA`: UInt = 1073741824u;
public const val `SECRET_QUERY_VALUE`: Int = 2;
public const val `SECRET_SET_VALUE`: Int = 1;
// UNSUPPORTED Rust 4169:1: non-scalar type Ptr unsupported
// pub const SECURITY_ENTRYPOINT: windows_sys::core::PCWSTR = windows_sys::core::w!("INITSECURITYINTERFACEA");

// UNSUPPORTED Rust 4170:1: non-scalar type Ptr unsupported
// pub const SECURITY_ENTRYPOINT16: windows_sys::core::PCSTR = windows_sys::core::s!("INITSECURITYINTERFACEA");

// UNSUPPORTED Rust 4171:1: non-scalar type Ptr unsupported
// pub const SECURITY_ENTRYPOINT_ANSI: windows_sys::core::PCWSTR = windows_sys::core::w!("InitSecurityInterfaceW");

// UNSUPPORTED Rust 4172:1: non-scalar type Ptr unsupported
// pub const SECURITY_ENTRYPOINT_ANSIA: windows_sys::core::PCSTR = windows_sys::core::s!("InitSecurityInterfaceA");

// UNSUPPORTED Rust 4173:1: non-scalar type Ptr unsupported
// pub const SECURITY_ENTRYPOINT_ANSIW: windows_sys::core::PCSTR = windows_sys::core::s!("InitSecurityInterfaceW");

// UNSUPPORTED Rust 4174:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECURITY_LOGON_SESSION_DATA {
//     pub Size: u32,
//     pub LogonId: super::super::super::Foundation::LUID,
//     pub UserName: LSA_UNICODE_STRING,
//     pub LogonDomain: LSA_UNICODE_STRING,
//     pub AuthenticationPackage: LSA_UNICODE_STRING,
//     pub LogonType: u32,
//     pub Session: u32,
//     pub Sid: super::super::PSID,
//     pub LogonTime: i64,
//     pub LogonServer: LSA_UNICODE_STRING,
//     pub DnsDomainName: LSA_UNICODE_STRING,
//     pub Upn: LSA_UNICODE_STRING,
//     pub UserFlags: u32,
//     pub LastLogonInfo: LSA_LAST_INTER_LOGON_INFO,
//     pub LogonScript: LSA_UNICODE_STRING,
//     pub ProfilePath: LSA_UNICODE_STRING,
//     pub HomeDirectory: LSA_UNICODE_STRING,
//     pub HomeDirectoryDrive: LSA_UNICODE_STRING,
//     pub LogoffTime: i64,
//     pub KickOffTime: i64,
//     pub PasswordLastSet: i64,
//     pub PasswordCanChange: i64,
//     pub PasswordMustChange: i64,
// }

// UNSUPPORTED Rust 4201:1: declaration Impl has no candidate rule
// impl Default for SECURITY_LOGON_SESSION_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4206:1: declaration Struct has no candidate rule
// #[repr(transparent)]
// #[derive(Clone, Copy)]
// pub struct SECURITY_LOGON_TYPE(pub i32);

// UNSUPPORTED Rust 4209:1: declaration Impl has no candidate rule
// impl SECURITY_LOGON_TYPE {
//     pub const UndefinedLogonType: Self = Self(0i32);
//     pub const Interactive: Self = Self(2i32);
//     pub const Network: Self = Self(3i32);
//     pub const Batch: Self = Self(4i32);
//     pub const Service: Self = Self(5i32);
//     pub const Proxy: Self = Self(6i32);
//     pub const Unlock: Self = Self(7i32);
//     pub const NetworkCleartext: Self = Self(8i32);
//     pub const NewCredentials: Self = Self(9i32);
//     pub const RemoteInteractive: Self = Self(10i32);
//     pub const CachedInteractive: Self = Self(11i32);
//     pub const CachedRemoteInteractive: Self = Self(12i32);
//     pub const CachedUnlock: Self = Self(13i32);
// }

public const val `SECURITY_NATIVE_DREP`: UInt = 16u;
public const val `SECURITY_NETWORK_DREP`: UInt = 0u;
// UNSUPPORTED Rust 4226:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECURITY_PACKAGE_OPTIONS {
//     pub Size: u32,
//     pub Type: SECURITY_PACKAGE_OPTIONS_TYPE,
//     pub Flags: u32,
//     pub SignatureSize: u32,
//     pub Signature: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 4235:1: declaration Impl has no candidate rule
// impl Default for SECURITY_PACKAGE_OPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SECURITY_PACKAGE_OPTIONS_TYPE` = UInt;
// UNSUPPORTED Rust 4241:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECURITY_STRING {
//     pub Length: u16,
//     pub MaximumLength: u16,
//     pub Buffer: *mut u16,
// }

// UNSUPPORTED Rust 4248:1: declaration Impl has no candidate rule
// impl Default for SECURITY_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SECURITY_SUPPORT_PROVIDER_INTERFACE_VERSION`: UInt = 1u;
public const val `SECURITY_SUPPORT_PROVIDER_INTERFACE_VERSION_2`: UInt = 2u;
public const val `SECURITY_SUPPORT_PROVIDER_INTERFACE_VERSION_3`: UInt = 3u;
public const val `SECURITY_SUPPORT_PROVIDER_INTERFACE_VERSION_4`: UInt = 4u;
public const val `SECURITY_SUPPORT_PROVIDER_INTERFACE_VERSION_5`: UInt = 5u;
// UNSUPPORTED Rust 4258:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECURITY_USER_DATA {
//     pub UserName: SECURITY_STRING,
//     pub LogonDomainName: SECURITY_STRING,
//     pub LogonServer: SECURITY_STRING,
//     pub pSid: super::super::PSID,
// }

// UNSUPPORTED Rust 4266:1: declaration Impl has no candidate rule
// impl Default for SECURITY_USER_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4271:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SEC_APPLICATION_PROTOCOLS {
//     pub ProtocolListsSize: u32,
//     pub ProtocolLists: [SEC_APPLICATION_PROTOCOL_LIST; 1],
// }

// UNSUPPORTED Rust 4277:1: declaration Impl has no candidate rule
// impl Default for SEC_APPLICATION_PROTOCOLS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4282:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SEC_APPLICATION_PROTOCOL_LIST {
//     pub ProtoNegoExt: SEC_APPLICATION_PROTOCOL_NEGOTIATION_EXT,
//     pub ProtocolListSize: u16,
//     pub ProtocolList: [u8; 1],
// }

// UNSUPPORTED Rust 4289:1: declaration Impl has no candidate rule
// impl Default for SEC_APPLICATION_PROTOCOL_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SEC_APPLICATION_PROTOCOL_NEGOTIATION_EXT` = Int;
public typealias `SEC_APPLICATION_PROTOCOL_NEGOTIATION_STATUS` = Int;
// UNSUPPORTED Rust 4296:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SEC_CERTIFICATE_REQUEST_CONTEXT {
//     pub cbCertificateRequestContext: u8,
//     pub rgCertificateRequestContext: [u8; 1],
// }

// UNSUPPORTED Rust 4302:1: declaration Impl has no candidate rule
// impl Default for SEC_CERTIFICATE_REQUEST_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4307:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SEC_CHANNEL_BINDINGS {
//     pub dwInitiatorAddrType: u32,
//     pub cbInitiatorLength: u32,
//     pub dwInitiatorOffset: u32,
//     pub dwAcceptorAddrType: u32,
//     pub cbAcceptorLength: u32,
//     pub dwAcceptorOffset: u32,
//     pub cbApplicationDataLength: u32,
//     pub dwApplicationDataOffset: u32,
// }

public const val `SEC_CHANNEL_BINDINGS_AUDIT_BINDINGS`: UInt = 1u;
// UNSUPPORTED Rust 4320:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SEC_CHANNEL_BINDINGS_EX {
//     pub magicNumber: u32,
//     pub flags: u32,
//     pub cbHeaderLength: u32,
//     pub cbStructureLength: u32,
//     pub dwInitiatorAddrType: u32,
//     pub cbInitiatorLength: u32,
//     pub dwInitiatorOffset: u32,
//     pub dwAcceptorAddrType: u32,
//     pub cbAcceptorLength: u32,
//     pub dwAcceptorOffset: u32,
//     pub cbApplicationDataLength: u32,
//     pub dwApplicationDataOffset: u32,
// }

// UNSUPPORTED Rust 4336:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SEC_CHANNEL_BINDINGS_RESULT {
//     pub flags: u32,
// }

public const val `SEC_CHANNEL_BINDINGS_RESULT_ABSENT`: UInt = 2u;
public const val `SEC_CHANNEL_BINDINGS_RESULT_CLIENT_SUPPORT`: UInt = 1u;
public const val `SEC_CHANNEL_BINDINGS_RESULT_NOTVALID_MISMATCH`: UInt = 4u;
public const val `SEC_CHANNEL_BINDINGS_RESULT_NOTVALID_MISSING`: UInt = 8u;
public const val `SEC_CHANNEL_BINDINGS_RESULT_VALID_MATCHED`: UInt = 16u;
public const val `SEC_CHANNEL_BINDINGS_RESULT_VALID_MISSING`: UInt = 64u;
public const val `SEC_CHANNEL_BINDINGS_RESULT_VALID_PROXY`: UInt = 32u;
public const val `SEC_CHANNEL_BINDINGS_VALID_FLAGS`: UInt = 1u;
// UNSUPPORTED Rust 4349:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SEC_DTLS_MTU {
//     pub PathMTU: u16,
// }

// UNSUPPORTED Rust 4354:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SEC_FLAGS {
//     pub Flags: u64,
// }

// UNSUPPORTED Rust 4359:1: generic scalar type unsupported
// pub type SEC_GET_KEY_FN = Option<unsafe extern "system" fn(arg: *mut core::ffi::c_void, principal: *mut core::ffi::c_void, keyver: u32, key: *mut *mut core::ffi::c_void, status: *mut windows_sys::core::HRESULT)>;

// UNSUPPORTED Rust 4360:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SEC_NEGOTIATION_INFO {
//     pub Size: u32,
//     pub NameLength: u32,
//     pub Name: *mut u16,
//     pub Reserved: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 4368:1: declaration Impl has no candidate rule
// impl Default for SEC_NEGOTIATION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4373:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SEC_PRESHAREDKEY {
//     pub KeySize: u16,
//     pub Key: [u8; 1],
// }

// UNSUPPORTED Rust 4379:1: declaration Impl has no candidate rule
// impl Default for SEC_PRESHAREDKEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4384:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SEC_PRESHAREDKEY_IDENTITY {
//     pub KeyIdentitySize: u16,
//     pub KeyIdentity: [u8; 1],
// }

// UNSUPPORTED Rust 4390:1: declaration Impl has no candidate rule
// impl Default for SEC_PRESHAREDKEY_IDENTITY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4395:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SEC_SRTP_MASTER_KEY_IDENTIFIER {
//     pub MasterKeyIdentifierSize: u8,
//     pub MasterKeyIdentifier: [u8; 1],
// }

// UNSUPPORTED Rust 4401:1: declaration Impl has no candidate rule
// impl Default for SEC_SRTP_MASTER_KEY_IDENTIFIER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4406:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SEC_SRTP_PROTECTION_PROFILES {
//     pub ProfilesSize: u16,
//     pub ProfilesList: [u16; 1],
// }

// UNSUPPORTED Rust 4412:1: declaration Impl has no candidate rule
// impl Default for SEC_SRTP_PROTECTION_PROFILES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4417:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SEC_TOKEN_BINDING {
//     pub MajorVersion: u8,
//     pub MinorVersion: u8,
//     pub KeyParametersSize: u16,
//     pub KeyParameters: [u8; 1],
// }

// UNSUPPORTED Rust 4425:1: declaration Impl has no candidate rule
// impl Default for SEC_TOKEN_BINDING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4430:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SEC_TRAFFIC_SECRETS {
//     pub SymmetricAlgId: [u16; 64],
//     pub ChainingMode: [u16; 64],
//     pub HashAlgId: [u16; 64],
//     pub KeySize: u16,
//     pub IvSize: u16,
//     pub MsgSequenceStart: u16,
//     pub MsgSequenceEnd: u16,
//     pub TrafficSecretType: SEC_TRAFFIC_SECRET_TYPE,
//     pub TrafficSecretSize: u16,
//     pub TrafficSecret: [u8; 1],
// }

// UNSUPPORTED Rust 4444:1: declaration Impl has no candidate rule
// impl Default for SEC_TRAFFIC_SECRETS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SEC_TRAFFIC_SECRET_TYPE` = Int;
// UNSUPPORTED Rust 4450:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SEC_WINNT_AUTH_IDENTITY32 {
//     pub User: u32,
//     pub UserLength: u32,
//     pub Domain: u32,
//     pub DomainLength: u32,
//     pub Password: u32,
//     pub PasswordLength: u32,
//     pub Flags: u32,
// }

public const val `SEC_WINNT_AUTH_IDENTITY_ENCRYPT_FOR_SYSTEM`: UInt = 4u;
public const val `SEC_WINNT_AUTH_IDENTITY_ENCRYPT_SAME_LOGON`: UInt = 1u;
public const val `SEC_WINNT_AUTH_IDENTITY_ENCRYPT_SAME_PROCESS`: UInt = 2u;
// UNSUPPORTED Rust 4464:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SEC_WINNT_AUTH_IDENTITY_EX2 {
//     pub Version: u32,
//     pub cbHeaderLength: u16,
//     pub cbStructureLength: u32,
//     pub UserOffset: u32,
//     pub UserLength: u16,
//     pub DomainOffset: u32,
//     pub DomainLength: u16,
//     pub PackedCredentialsOffset: u32,
//     pub PackedCredentialsLength: u16,
//     pub Flags: u32,
//     pub PackageListOffset: u32,
//     pub PackageListLength: u16,
// }

// UNSUPPORTED Rust 4480:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SEC_WINNT_AUTH_IDENTITY_EX32 {
//     pub Version: u32,
//     pub Length: u32,
//     pub User: u32,
//     pub UserLength: u32,
//     pub Domain: u32,
//     pub DomainLength: u32,
//     pub Password: u32,
//     pub PasswordLength: u32,
//     pub Flags: u32,
//     pub PackageList: u32,
//     pub PackageListLength: u32,
// }

// UNSUPPORTED Rust 4495:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SEC_WINNT_AUTH_IDENTITY_EXA {
//     pub Version: u32,
//     pub Length: u32,
//     pub User: *mut u8,
//     pub UserLength: u32,
//     pub Domain: *mut u8,
//     pub DomainLength: u32,
//     pub Password: *mut u8,
//     pub PasswordLength: u32,
//     pub Flags: u32,
//     pub PackageList: *mut u8,
//     pub PackageListLength: u32,
// }

// UNSUPPORTED Rust 4510:1: declaration Impl has no candidate rule
// impl Default for SEC_WINNT_AUTH_IDENTITY_EXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4515:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SEC_WINNT_AUTH_IDENTITY_EXW {
//     pub Version: u32,
//     pub Length: u32,
//     pub User: *mut u16,
//     pub UserLength: u32,
//     pub Domain: *mut u16,
//     pub DomainLength: u32,
//     pub Password: *mut u16,
//     pub PasswordLength: u32,
//     pub Flags: u32,
//     pub PackageList: *mut u16,
//     pub PackageListLength: u32,
// }

// UNSUPPORTED Rust 4530:1: declaration Impl has no candidate rule
// impl Default for SEC_WINNT_AUTH_IDENTITY_EXW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SEC_WINNT_AUTH_IDENTITY_FLAGS_ID_PROVIDER`: UInt = 524288u;
public const val `SEC_WINNT_AUTH_IDENTITY_FLAGS_NULL_DOMAIN`: UInt = 262144u;
public const val `SEC_WINNT_AUTH_IDENTITY_FLAGS_NULL_USER`: UInt = 131072u;
public const val `SEC_WINNT_AUTH_IDENTITY_FLAGS_PROCESS_ENCRYPTED`: UInt = 16u;
public const val `SEC_WINNT_AUTH_IDENTITY_FLAGS_RESERVED`: UInt = 65536u;
public const val `SEC_WINNT_AUTH_IDENTITY_FLAGS_SSPIPFC_CREDPROV_DO_NOT_LOAD`: UInt = 268435456u;
public const val `SEC_WINNT_AUTH_IDENTITY_FLAGS_SSPIPFC_CREDPROV_DO_NOT_SAVE`: UInt = 2147483648u;
public const val `SEC_WINNT_AUTH_IDENTITY_FLAGS_SSPIPFC_NO_CHECKBOX`: UInt = 536870912u;
public const val `SEC_WINNT_AUTH_IDENTITY_FLAGS_SSPIPFC_SAVE_CRED_BY_CALLER`: UInt = 2147483648u;
public const val `SEC_WINNT_AUTH_IDENTITY_FLAGS_SSPIPFC_SAVE_CRED_CHECKED`: UInt = 1073741824u;
public const val `SEC_WINNT_AUTH_IDENTITY_FLAGS_SSPIPFC_USE_MASK`: UInt = 4278190080u;
public const val `SEC_WINNT_AUTH_IDENTITY_FLAGS_SYSTEM_ENCRYPTED`: UInt = 128u;
public const val `SEC_WINNT_AUTH_IDENTITY_FLAGS_SYSTEM_PROTECTED`: UInt = 32u;
public const val `SEC_WINNT_AUTH_IDENTITY_FLAGS_USER_PROTECTED`: UInt = 64u;
// UNSUPPORTED Rust 4549:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Rpc")]
// #[derive(Clone, Copy)]
// pub union SEC_WINNT_AUTH_IDENTITY_INFO {
//     pub AuthIdExw: SEC_WINNT_AUTH_IDENTITY_EXW,
//     pub AuthIdExa: SEC_WINNT_AUTH_IDENTITY_EXA,
//     pub AuthId_a: super::super::super::System::Rpc::SEC_WINNT_AUTH_IDENTITY_A,
//     pub AuthId_w: super::super::super::System::Rpc::SEC_WINNT_AUTH_IDENTITY_W,
//     pub AuthIdEx2: SEC_WINNT_AUTH_IDENTITY_EX2,
// }

// UNSUPPORTED Rust 4559:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Rpc")]
// impl Default for SEC_WINNT_AUTH_IDENTITY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SEC_WINNT_AUTH_IDENTITY_MARSHALLED`: UInt = 4u;
public const val `SEC_WINNT_AUTH_IDENTITY_ONLY`: UInt = 8u;
public const val `SEC_WINNT_AUTH_IDENTITY_VERSION`: UInt = 512u;
public const val `SEC_WINNT_AUTH_IDENTITY_VERSION_2`: UInt = 513u;
// UNSUPPORTED Rust 4569:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SEND_GENERIC_TLS_EXTENSION {
//     pub ExtensionType: u16,
//     pub HandshakeType: u16,
//     pub Flags: u32,
//     pub BufferSize: u16,
//     pub Buffer: [u8; 1],
// }

// UNSUPPORTED Rust 4578:1: declaration Impl has no candidate rule
// impl Default for SEND_GENERIC_TLS_EXTENSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SESSION_TICKET_INFO_V0`: UInt = 0u;
public const val `SESSION_TICKET_INFO_VERSION`: UInt = 0u;
// UNSUPPORTED Rust 4585:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type SET_CONTEXT_ATTRIBUTES_FN_A = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: u32, param2: *mut core::ffi::c_void, param3: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 4587:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type SET_CONTEXT_ATTRIBUTES_FN_W = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: u32, param2: *mut core::ffi::c_void, param3: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 4589:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type SET_CREDENTIALS_ATTRIBUTES_FN_A = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: u32, param2: *mut core::ffi::c_void, param3: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 4591:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type SET_CREDENTIALS_ATTRIBUTES_FN_W = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: u32, param2: *mut core::ffi::c_void, param3: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 4593:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SE_ADT_ACCESS_REASON {
//     pub AccessMask: u32,
//     pub AccessReasons: [u32; 32],
//     pub ObjectTypeIndex: u32,
//     pub AccessGranted: u32,
//     pub SecurityDescriptor: super::super::PSECURITY_DESCRIPTOR,
// }

// UNSUPPORTED Rust 4602:1: declaration Impl has no candidate rule
// impl Default for SE_ADT_ACCESS_REASON {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4607:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SE_ADT_CLAIMS {
//     pub Length: u32,
//     pub Claims: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 4613:1: declaration Impl has no candidate rule
// impl Default for SE_ADT_CLAIMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SE_ADT_OBJECT_ONLY`: UInt = 1u;
// UNSUPPORTED Rust 4619:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SE_ADT_OBJECT_TYPE {
//     pub ObjectType: windows_sys::core::GUID,
//     pub Flags: u16,
//     pub Level: u16,
//     pub AccessMask: u32,
// }

public const val `SE_ADT_PARAMETERS_SELF_RELATIVE`: UInt = 1u;
public const val `SE_ADT_PARAMETERS_SEND_TO_LSA`: UInt = 2u;
// UNSUPPORTED Rust 4629:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SE_ADT_PARAMETER_ARRAY {
//     pub CategoryId: u32,
//     pub AuditId: u32,
//     pub ParameterCount: u32,
//     pub Length: u32,
//     pub FlatSubCategoryId: u16,
//     pub Type: u16,
//     pub Flags: u32,
//     pub Parameters: [SE_ADT_PARAMETER_ARRAY_ENTRY; 32],
// }

// UNSUPPORTED Rust 4641:1: declaration Impl has no candidate rule
// impl Default for SE_ADT_PARAMETER_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4646:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SE_ADT_PARAMETER_ARRAY_ENTRY {
//     pub Type: SE_ADT_PARAMETER_TYPE,
//     pub Length: u32,
//     pub Data: [usize; 2],
//     pub Address: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 4654:1: declaration Impl has no candidate rule
// impl Default for SE_ADT_PARAMETER_ARRAY_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4659:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SE_ADT_PARAMETER_ARRAY_EX {
//     pub CategoryId: u32,
//     pub AuditId: u32,
//     pub Version: u32,
//     pub ParameterCount: u32,
//     pub Length: u32,
//     pub FlatSubCategoryId: u16,
//     pub Type: u16,
//     pub Flags: u32,
//     pub Parameters: [SE_ADT_PARAMETER_ARRAY_ENTRY; 32],
// }

// UNSUPPORTED Rust 4672:1: declaration Impl has no candidate rule
// impl Default for SE_ADT_PARAMETER_ARRAY_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SE_ADT_PARAMETER_EXTENSIBLE_AUDIT`: UInt = 4u;
public const val `SE_ADT_PARAMETER_GENERIC_AUDIT`: UInt = 8u;
public typealias `SE_ADT_PARAMETER_TYPE` = Int;
public const val `SE_ADT_PARAMETER_WRITE_SYNCHRONOUS`: UInt = 16u;
public const val `SE_ADT_POLICY_AUDIT_EVENT_TYPE_EX_BEGIN`: UInt = 100u;
// UNSUPPORTED Rust 4682:1: non-scalar type Ptr unsupported
// pub const SE_BATCH_LOGON_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeBatchLogonRight");

// UNSUPPORTED Rust 4683:1: non-scalar type Ptr unsupported
// pub const SE_DENY_BATCH_LOGON_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeDenyBatchLogonRight");

// UNSUPPORTED Rust 4684:1: non-scalar type Ptr unsupported
// pub const SE_DENY_INTERACTIVE_LOGON_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeDenyInteractiveLogonRight");

// UNSUPPORTED Rust 4685:1: non-scalar type Ptr unsupported
// pub const SE_DENY_NETWORK_LOGON_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeDenyNetworkLogonRight");

// UNSUPPORTED Rust 4686:1: non-scalar type Ptr unsupported
// pub const SE_DENY_REMOTE_INTERACTIVE_LOGON_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeDenyRemoteInteractiveLogonRight");

// UNSUPPORTED Rust 4687:1: non-scalar type Ptr unsupported
// pub const SE_DENY_SERVICE_LOGON_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeDenyServiceLogonRight");

// UNSUPPORTED Rust 4688:1: non-scalar type Ptr unsupported
// pub const SE_INTERACTIVE_LOGON_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeInteractiveLogonRight");

public const val `SE_MAX_AUDIT_PARAMETERS`: UInt = 32u;
public const val `SE_MAX_GENERIC_AUDIT_PARAMETERS`: UInt = 28u;
// UNSUPPORTED Rust 4691:1: non-scalar type Ptr unsupported
// pub const SE_NETWORK_LOGON_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeNetworkLogonRight");

// UNSUPPORTED Rust 4692:1: non-scalar type Ptr unsupported
// pub const SE_REMOTE_INTERACTIVE_LOGON_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeRemoteInteractiveLogonRight");

// UNSUPPORTED Rust 4693:1: non-scalar type Ptr unsupported
// pub const SE_SERVICE_LOGON_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SeServiceLogonRight");

public typealias `SLDATATYPE` = UInt;
public typealias `SLIDTYPE` = Int;
public typealias `SLLICENSINGSTATUS` = Int;
public typealias `SLREFERRALTYPE` = Int;
// UNSUPPORTED Rust 4698:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SL_ACTIVATION_INFO_HEADER {
//     pub cbSize: u32,
//     pub r#type: SL_ACTIVATION_TYPE,
// }

public typealias `SL_ACTIVATION_TYPE` = Int;
public const val `SL_ACTIVATION_TYPE_ACTIVE_DIRECTORY`: `SL_ACTIVATION_TYPE` = 1;
public const val `SL_ACTIVATION_TYPE_DEFAULT`: `SL_ACTIVATION_TYPE` = 0;
// UNSUPPORTED Rust 4707:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SL_AD_ACTIVATION_INFO {
//     pub header: SL_ACTIVATION_INFO_HEADER,
//     pub pwszProductKey: windows_sys::core::PCWSTR,
//     pub pwszActivationObjectName: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 4714:1: declaration Impl has no candidate rule
// impl Default for SL_AD_ACTIVATION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SL_CLIENTAPI_ZONE`: UInt = 61440u;
public const val `SL_DATA_BINARY`: `SLDATATYPE` = 3u;
public const val `SL_DATA_DWORD`: `SLDATATYPE` = 4u;
public const val `SL_DATA_MULTI_SZ`: `SLDATATYPE` = 7u;
public const val `SL_DATA_NONE`: `SLDATATYPE` = 0u;
public const val `SL_DATA_SUM`: `SLDATATYPE` = 100u;
public const val `SL_DATA_SZ`: `SLDATATYPE` = 1u;
// UNSUPPORTED Rust 4726:1: non-scalar type Ptr unsupported
// pub const SL_DEFAULT_MIGRATION_ENCRYPTOR_URI: windows_sys::core::PCWSTR = windows_sys::core::w!("msft:spp/migrationencryptor/tokenact/1.0");

// UNSUPPORTED Rust 4727:1: non-scalar type Ptr unsupported
// pub const SL_EVENT_LICENSING_STATE_CHANGED: windows_sys::core::PCWSTR = windows_sys::core::w!("msft:rm/event/licensingstatechanged");

// UNSUPPORTED Rust 4728:1: non-scalar type Ptr unsupported
// pub const SL_EVENT_POLICY_CHANGED: windows_sys::core::PCWSTR = windows_sys::core::w!("msft:rm/event/policychanged");

// UNSUPPORTED Rust 4729:1: non-scalar type Ptr unsupported
// pub const SL_EVENT_USER_NOTIFICATION: windows_sys::core::PCWSTR = windows_sys::core::w!("msft:rm/event/usernotification");

public const val `SL_E_ACTIVATION_IN_PROGRESS`: Int = -1073422296;
public const val `SL_E_APPLICATION_POLICIES_MISSING`: Int = -1073418126;
public const val `SL_E_APPLICATION_POLICIES_NOT_LOADED`: Int = -1073418125;
public const val `SL_E_AUTHN_CANT_VERIFY`: Int = -1073418118;
public const val `SL_E_AUTHN_CHALLENGE_NOT_SET`: Int = -1073418119;
public const val `SL_E_AUTHN_MISMATCHED_KEY`: Int = -1073418120;
public const val `SL_E_AUTHN_WRONG_VERSION`: Int = -1073418121;
public const val `SL_E_BASE_SKU_NOT_AVAILABLE`: Int = -1073418155;
public const val `SL_E_BIOS_KEY`: Int = -1073417707;
public const val `SL_E_BLOCKED_PRODUCT_KEY`: Int = -1073418159;
public const val `SL_E_CHPA_ACTCONFIG_ID_NOT_FOUND`: Int = -1073430519;
public const val `SL_E_CHPA_BINDING_MAPPING_NOT_FOUND`: Int = -1073430522;
public const val `SL_E_CHPA_BINDING_NOT_FOUND`: Int = -1073430523;
public const val `SL_E_CHPA_BUSINESS_RULE_INPUT_NOT_FOUND`: Int = -1073428736;
public const val `SL_E_CHPA_DATABASE_ERROR`: Int = -1073430509;
public const val `SL_E_CHPA_DIGITALMARKER_BINDING_NOT_CONFIGURED`: Int = -1073430446;
public const val `SL_E_CHPA_DIGITALMARKER_INVALID_BINDING`: Int = -1073430447;
public const val `SL_E_CHPA_DMAK_EXTENSION_LIMIT_EXCEEDED`: Int = -1073430495;
public const val `SL_E_CHPA_DMAK_LIMIT_EXCEEDED`: Int = -1073430496;
public const val `SL_E_CHPA_DYNAMICALLY_BLOCKED_PRODUCT_KEY`: Int = -1073430432;
public const val `SL_E_CHPA_FAILED_TO_DELETE_PRODUCTKEY_BINDING`: Int = -1073428649;
public const val `SL_E_CHPA_FAILED_TO_DELETE_PRODUCT_KEY_PROPERTY`: Int = -1073428644;
public const val `SL_E_CHPA_FAILED_TO_INSERT_PRODUCTKEY_BINDING`: Int = -1073428650;
public const val `SL_E_CHPA_FAILED_TO_INSERT_PRODUCT_KEY_PROPERTY`: Int = -1073428646;
public const val `SL_E_CHPA_FAILED_TO_INSERT_PRODUCT_KEY_RECORD`: Int = -1073428608;
public const val `SL_E_CHPA_FAILED_TO_PROCESS_PRODUCT_KEY_BINDINGS_XML`: Int = -1073428648;
public const val `SL_E_CHPA_FAILED_TO_UPDATE_PRODUCTKEY_BINDING`: Int = -1073428651;
public const val `SL_E_CHPA_FAILED_TO_UPDATE_PRODUCT_KEY_PROPERTY`: Int = -1073428645;
public const val `SL_E_CHPA_FAILED_TO_UPDATE_PRODUCT_KEY_RECORD`: Int = -1073428607;
public const val `SL_E_CHPA_GENERAL_ERROR`: Int = -1073430448;
public const val `SL_E_CHPA_INVALID_ACTCONFIG_ID`: Int = -1073430515;
public const val `SL_E_CHPA_INVALID_ARGUMENT`: Int = -1073430508;
public const val `SL_E_CHPA_INVALID_BINDING`: Int = -1073430526;
public const val `SL_E_CHPA_INVALID_BINDING_URI`: Int = -1073430511;
public const val `SL_E_CHPA_INVALID_PRODUCT_DATA`: Int = -1073430517;
public const val `SL_E_CHPA_INVALID_PRODUCT_DATA_ID`: Int = -1073430518;
public const val `SL_E_CHPA_INVALID_PRODUCT_KEY`: Int = -1073430524;
public const val `SL_E_CHPA_INVALID_PRODUCT_KEY_CHAR`: Int = -1073430512;
public const val `SL_E_CHPA_INVALID_PRODUCT_KEY_FORMAT`: Int = -1073430513;
public const val `SL_E_CHPA_INVALID_PRODUCT_KEY_LENGTH`: Int = -1073430514;
public const val `SL_E_CHPA_MAXIMUM_UNLOCK_EXCEEDED`: Int = -1073430520;
public const val `SL_E_CHPA_MSCH_RESPONSE_NOT_AVAILABLE_VGA`: Int = -1073429505;
public const val `SL_E_CHPA_NETWORK_ERROR`: Int = -1073430510;
public const val `SL_E_CHPA_NO_RULES_TO_ACTIVATE`: Int = -1073430449;
public const val `SL_E_CHPA_NULL_VALUE_FOR_PROPERTY_NAME_OR_ID`: Int = -1073428656;
public const val `SL_E_CHPA_OEM_SLP_COA0`: Int = -1073430506;
public const val `SL_E_CHPA_OVERRIDE_REQUEST_NOT_FOUND`: Int = -1073430493;
public const val `SL_E_CHPA_PRODUCT_KEY_BEING_USED`: Int = -1073428624;
public const val `SL_E_CHPA_PRODUCT_KEY_BLOCKED`: Int = -1073430525;
public const val `SL_E_CHPA_PRODUCT_KEY_BLOCKED_IPLOCATION`: Int = -1073430505;
public const val `SL_E_CHPA_PRODUCT_KEY_OUT_OF_RANGE`: Int = -1073430527;
public const val `SL_E_CHPA_REISSUANCE_LIMIT_NOT_FOUND`: Int = -1073430494;
public const val `SL_E_CHPA_RESPONSE_NOT_AVAILABLE`: Int = -1073430507;
public const val `SL_E_CHPA_SYSTEM_ERROR`: Int = -1073430516;
public const val `SL_E_CHPA_TIMEBASED_ACTIVATION_AFTER_END_DATE`: Int = -1073430479;
public const val `SL_E_CHPA_TIMEBASED_ACTIVATION_BEFORE_START_DATE`: Int = -1073430480;
public const val `SL_E_CHPA_TIMEBASED_ACTIVATION_NOT_AVAILABLE`: Int = -1073430478;
public const val `SL_E_CHPA_TIMEBASED_PRODUCT_KEY_NOT_CONFIGURED`: Int = -1073430477;
public const val `SL_E_CHPA_UNKNOWN_PRODUCT_KEY_TYPE`: Int = -1073428636;
public const val `SL_E_CHPA_UNKNOWN_PROPERTY_ID`: Int = -1073428654;
public const val `SL_E_CHPA_UNKNOWN_PROPERTY_NAME`: Int = -1073428655;
public const val `SL_E_CHPA_UNSUPPORTED_PRODUCT_KEY`: Int = -1073430521;
public const val `SL_E_CIDIID_INVALID_CHECK_DIGITS`: Int = -1073418163;
public const val `SL_E_CIDIID_INVALID_DATA`: Int = -1073418196;
public const val `SL_E_CIDIID_INVALID_DATA_LENGTH`: Int = -1073418193;
public const val `SL_E_CIDIID_INVALID_VERSION`: Int = -1073418195;
public const val `SL_E_CIDIID_MISMATCHED`: Int = -1073418191;
public const val `SL_E_CIDIID_MISMATCHED_PKEY`: Int = -1073418114;
public const val `SL_E_CIDIID_NOT_BOUND`: Int = -1073418113;
public const val `SL_E_CIDIID_NOT_DEPOSITED`: Int = -1073418192;
public const val `SL_E_CIDIID_VERSION_NOT_SUPPORTED`: Int = -1073418194;
public const val `SL_E_DATATYPE_MISMATCHED`: Int = -1073418210;
public const val `SL_E_DECRYPTION_LICENSES_NOT_AVAILABLE`: Int = -1073418212;
public const val `SL_E_DEPENDENT_PROPERTY_NOT_SET`: Int = -1073418138;
public const val `SL_E_DOWNLEVEL_SETUP_KEY`: Int = -1073417708;
public const val `SL_E_DUPLICATE_POLICY`: Int = -1073418158;
public const val `SL_E_EDITION_MISMATCHED`: Int = -1073417712;
public const val `SL_E_ENGINE_DETECTED_EXPLOIT`: Int = -1073429327;
public const val `SL_E_EUL_CONSUMPTION_FAILED`: Int = -1073422315;
public const val `SL_E_EUL_NOT_AVAILABLE`: Int = -1073418188;
public const val `SL_E_EVALUATION_FAILED`: Int = -1073422333;
public const val `SL_E_EVENT_ALREADY_REGISTERED`: Int = -1073418213;
public const val `SL_E_EVENT_NOT_REGISTERED`: Int = -1073418214;
public const val `SL_E_EXTERNAL_SIGNATURE_NOT_FOUND`: Int = -1073418234;
public const val `SL_E_GRACE_TIME_EXPIRED`: Int = -1073418231;
public const val `SL_E_HEALTH_CHECK_FAILED_MUI_FILES`: Int = -1073429330;
public const val `SL_E_HEALTH_CHECK_FAILED_NEUTRAL_FILES`: Int = -1073429331;
public const val `SL_E_HWID_CHANGED`: Int = -1073417711;
public const val `SL_E_HWID_ERROR`: Int = -1073422309;
public const val `SL_E_IA_ID_MISMATCH`: Int = -1073414909;
public const val `SL_E_IA_INVALID_VIRTUALIZATION_PLATFORM`: Int = -1073414911;
public const val `SL_E_IA_MACHINE_NOT_BOUND`: Int = -1073414908;
public const val `SL_E_IA_PARENT_PARTITION_NOT_ACTIVATED`: Int = -1073414910;
public const val `SL_E_IA_THROTTLE_LIMIT_EXCEEDED`: Int = -1073414912;
public const val `SL_E_INTERNAL_ERROR`: Int = -1073418239;
public const val `SL_E_INVALID_AD_DATA`: Int = -1073429329;
public const val `SL_E_INVALID_BINDING_BLOB`: Int = -1073418190;
public const val `SL_E_INVALID_CLIENT_TOKEN`: Int = -1073429720;
public const val `SL_E_INVALID_CONTEXT`: Int = -1073422335;
public const val `SL_E_INVALID_CONTEXT_DATA`: Int = -1073422300;
public const val `SL_E_INVALID_EVENT_ID`: Int = -1073418215;
public const val `SL_E_INVALID_FILE_HASH`: Int = -1073429343;
public const val `SL_E_INVALID_GUID`: Int = -1073422330;
public const val `SL_E_INVALID_HASH`: Int = -1073422299;
public const val `SL_E_INVALID_LICENSE`: Int = -1073418209;
public const val `SL_E_INVALID_LICENSE_STATE`: Int = -1073429336;
public const val `SL_E_INVALID_LICENSE_STATE_BREACH_GRACE`: Int = -1073429871;
public const val `SL_E_INVALID_LICENSE_STATE_BREACH_GRACE_EXPIRED`: Int = -1073429870;
public const val `SL_E_INVALID_OEM_OR_VOLUME_BINDING_DATA`: Int = -1073429337;
public const val `SL_E_INVALID_OFFLINE_BLOB`: Int = -1073429719;
public const val `SL_E_INVALID_OSVERSION_TEMPLATEID`: Int = -1073429717;
public const val `SL_E_INVALID_OS_FOR_PRODUCT_KEY`: Int = -1073429503;
public const val `SL_E_INVALID_PACKAGE`: Int = -1073418208;
public const val `SL_E_INVALID_PACKAGE_VERSION`: Int = -1073418144;
public const val `SL_E_INVALID_PKEY`: Int = -1073418224;
public const val `SL_E_INVALID_PRODUCT_KEY`: Int = -1073418160;
public const val `SL_E_INVALID_PRODUCT_KEY_TYPE`: Int = -1073418115;
public const val `SL_E_INVALID_RSDP_COUNT`: Int = -1073429328;
public const val `SL_E_INVALID_RULESET_RULE`: Int = -1073422301;
public const val `SL_E_INVALID_RUNNING_MODE`: Int = -1073418199;
public const val `SL_E_INVALID_TEMPLATE_ID`: Int = -1073429770;
public const val `SL_E_INVALID_TOKEN_DATA`: Int = -1073429332;
public const val `SL_E_INVALID_USE_OF_ADD_ON_PKEY`: Int = -2147164122;
public const val `SL_E_INVALID_XML_BLOB`: Int = -1073429766;
public const val `SL_E_IP_LOCATION_FALIED`: Int = -1073429335;
public const val `SL_E_ISSUANCE_LICENSE_NOT_INSTALLED`: Int = -1073418142;
public const val `SL_E_LICENSE_AUTHORIZATION_FAILED`: Int = -1073418206;
public const val `SL_E_LICENSE_DECRYPTION_FAILED`: Int = -1073418205;
public const val `SL_E_LICENSE_FILE_NOT_INSTALLED`: Int = -1073418223;
public const val `SL_E_LICENSE_INVALID_ADDON_INFO`: Int = -1073422310;
public const val `SL_E_LICENSE_MANAGEMENT_DATA_DUPLICATED`: Int = -1073418156;
public const val `SL_E_LICENSE_MANAGEMENT_DATA_NOT_FOUND`: Int = -1073418161;
public const val `SL_E_LICENSE_NOT_BOUND`: Int = -1073418112;
public const val `SL_E_LICENSE_SERVER_URL_NOT_FOUND`: Int = -1073418216;
public const val `SL_E_LICENSE_SIGNATURE_VERIFICATION_FAILED`: Int = -1073418211;
public const val `SL_E_LUA_ACCESSDENIED`: Int = -1073418203;
public const val `SL_E_MISMATCHED_APPID`: Int = -1073418230;
public const val `SL_E_MISMATCHED_KEY_TYPES`: Int = -1073429340;
public const val `SL_E_MISMATCHED_PID`: Int = -1073418235;
public const val `SL_E_MISMATCHED_PKEY_RANGE`: Int = -1073418236;
public const val `SL_E_MISMATCHED_PRODUCT_SKU`: Int = -1073418135;
public const val `SL_E_MISMATCHED_SECURITY_PROCESSOR`: Int = -1073418226;
public const val `SL_E_MISSING_OVERRIDE_ONLY_ATTRIBUTE`: Int = -1073418157;
public const val `SL_E_NONGENUINE_GRACE_TIME_EXPIRED`: Int = -1073418140;
public const val `SL_E_NONGENUINE_GRACE_TIME_EXPIRED_2`: Int = -1073418137;
public const val `SL_E_NON_GENUINE_STATUS_LAST`: Int = -1073428992;
public const val `SL_E_NOTIFICATION_BREACH_DETECTED`: Int = -1073429199;
public const val `SL_E_NOTIFICATION_GRACE_EXPIRED`: Int = -1073429198;
public const val `SL_E_NOTIFICATION_OTHER_REASONS`: Int = -1073429197;
public const val `SL_E_NOT_ACTIVATED`: Int = -1073422331;
public const val `SL_E_NOT_EVALUATED`: Int = -1073422332;
public const val `SL_E_NOT_GENUINE`: Int = -1073417728;
public const val `SL_E_NOT_SUPPORTED`: Int = -1073418218;
public const val `SL_E_NO_PID_CONFIG_DATA`: Int = -1073418229;
public const val `SL_E_NO_PRODUCT_KEY_FOUND`: Int = -1073417709;
public const val `SL_E_OEM_KEY_EDITION_MISMATCH`: Int = -1073417710;
public const val `SL_E_OFFLINE_GENUINE_BLOB_NOT_FOUND`: Int = -1073429715;
public const val `SL_E_OFFLINE_GENUINE_BLOB_REVOKED`: Int = -1073429716;
public const val `SL_E_OFFLINE_VALIDATION_BLOB_PARAM_NOT_FOUND`: Int = -1073429718;
public const val `SL_E_OPERATION_NOT_ALLOWED`: Int = -1073418134;
public const val `SL_E_OUT_OF_TOLERANCE`: Int = -1073418225;
public const val `SL_E_PKEY_INTERNAL_ERROR`: Int = -1073422311;
public const val `SL_E_PKEY_INVALID_ALGORITHM`: Int = -1073422312;
public const val `SL_E_PKEY_INVALID_CONFIG`: Int = -1073422314;
public const val `SL_E_PKEY_INVALID_KEYCHANGE1`: Int = -1073422308;
public const val `SL_E_PKEY_INVALID_KEYCHANGE2`: Int = -1073422307;
public const val `SL_E_PKEY_INVALID_KEYCHANGE3`: Int = -1073422306;
public const val `SL_E_PKEY_INVALID_UNIQUEID`: Int = -1073422313;
public const val `SL_E_PKEY_INVALID_UPGRADE`: Int = -1073418143;
public const val `SL_E_PKEY_NOT_INSTALLED`: Int = -1073418220;
public const val `SL_E_PLUGIN_INVALID_MANIFEST`: Int = -1073418127;
public const val `SL_E_PLUGIN_NOT_REGISTERED`: Int = -1073418122;
public const val `SL_E_POLICY_CACHE_INVALID`: Int = -1073418200;
public const val `SL_E_POLICY_OTHERINFO_MISMATCH`: Int = -1073422304;
public const val `SL_E_PRODUCT_KEY_INSTALLATION_NOT_ALLOWED`: Int = -1073418189;
public const val `SL_E_PRODUCT_SKU_NOT_INSTALLED`: Int = -1073418219;
public const val `SL_E_PRODUCT_UNIQUENESS_GROUP_ID_INVALID`: Int = -1073422303;
public const val `SL_E_PROXY_KEY_NOT_FOUND`: Int = -1073418202;
public const val `SL_E_PROXY_POLICY_NOT_UPDATED`: Int = -1073418169;
public const val `SL_E_PUBLISHING_LICENSE_NOT_INSTALLED`: Int = -1073418217;
public const val `SL_E_RAC_NOT_AVAILABLE`: Int = -1073418233;
public const val `SL_E_RIGHT_NOT_CONSUMED`: Int = -1073418238;
public const val `SL_E_RIGHT_NOT_GRANTED`: Int = -1073418221;
public const val `SL_E_SECURE_STORE_ID_MISMATCH`: Int = -1073422302;
public const val `SL_E_SERVICE_RUNNING`: Int = -1073418117;
public const val `SL_E_SERVICE_STOPPING`: Int = -1073418123;
public const val `SL_E_SFS_BAD_TOKEN_EXT`: Int = -2147163899;
public const val `SL_E_SFS_BAD_TOKEN_NAME`: Int = -2147163900;
public const val `SL_E_SFS_DUPLICATE_TOKEN_NAME`: Int = -2147163898;
public const val `SL_E_SFS_FILE_READ_ERROR`: Int = -2147163895;
public const val `SL_E_SFS_FILE_WRITE_ERROR`: Int = -2147163894;
public const val `SL_E_SFS_INVALID_FD_TABLE`: Int = -2147163902;
public const val `SL_E_SFS_INVALID_FILE_POSITION`: Int = -2147163893;
public const val `SL_E_SFS_INVALID_FS_HEADER`: Int = -2147163891;
public const val `SL_E_SFS_INVALID_FS_VERSION`: Int = -2147163903;
public const val `SL_E_SFS_INVALID_SYNC`: Int = -2147163901;
public const val `SL_E_SFS_INVALID_TOKEN_DATA_HASH`: Int = -2147163896;
public const val `SL_E_SFS_INVALID_TOKEN_DESCRIPTOR`: Int = -2147163890;
public const val `SL_E_SFS_NO_ACTIVE_TRANSACTION`: Int = -2147163892;
public const val `SL_E_SFS_TOKEN_SIZE_MISMATCH`: Int = -2147163897;
public const val `SL_E_SLP_BAD_FORMAT`: Int = -1073418151;
public const val `SL_E_SLP_INVALID_MARKER_VERSION`: Int = -1073418116;
public const val `SL_E_SLP_MISSING_ACPI_SLIC`: Int = -1073418153;
public const val `SL_E_SLP_MISSING_SLP_MARKER`: Int = -1073418152;
public const val `SL_E_SLP_NOT_SIGNED`: Int = -1073418198;
public const val `SL_E_SLP_OEM_CERT_MISSING`: Int = -1073418141;
public const val `SL_E_SOFTMOD_EXPLOIT_DETECTED`: Int = -1073429333;
public const val `SL_E_SPC_NOT_AVAILABLE`: Int = -1073418232;
public const val `SL_E_SRV_AUTHORIZATION_FAILED`: Int = -1073434619;
public const val `SL_E_SRV_BUSINESS_TOKEN_ENTRY_NOT_FOUND`: Int = -1073434608;
public const val `SL_E_SRV_CLIENT_CLOCK_OUT_OF_SYNC`: Int = -1073434607;
public const val `SL_E_SRV_GENERAL_ERROR`: Int = -1073434368;
public const val `SL_E_SRV_INVALID_BINDING`: Int = -1073434618;
public const val `SL_E_SRV_INVALID_LICENSE_STRUCTURE`: Int = -1073434620;
public const val `SL_E_SRV_INVALID_PAYLOAD`: Int = -1073434616;
public const val `SL_E_SRV_INVALID_PRODUCT_KEY_LICENSE`: Int = -1073434622;
public const val `SL_E_SRV_INVALID_PUBLISH_LICENSE`: Int = -1073434623;
public const val `SL_E_SRV_INVALID_RIGHTS_ACCOUNT_LICENSE`: Int = -1073434621;
public const val `SL_E_SRV_INVALID_SECURITY_PROCESSOR_LICENSE`: Int = -1073434615;
public const val `SL_E_SRV_SERVER_PONG`: Int = -1073434617;
public const val `SL_E_STORE_UPGRADE_TOKEN_NOT_AUTHORIZED`: Int = -1073422290;
public const val `SL_E_STORE_UPGRADE_TOKEN_NOT_PRS_SIGNED`: Int = -1073422292;
public const val `SL_E_STORE_UPGRADE_TOKEN_REQUIRED`: Int = -1073422295;
public const val `SL_E_STORE_UPGRADE_TOKEN_WRONG_EDITION`: Int = -1073422294;
public const val `SL_E_STORE_UPGRADE_TOKEN_WRONG_PID`: Int = -1073422293;
public const val `SL_E_STORE_UPGRADE_TOKEN_WRONG_VERSION`: Int = -1073422291;
public const val `SL_E_TAMPER_DETECTED`: Int = -1073418201;
public const val `SL_E_TAMPER_RECOVERY_REQUIRES_ACTIVATION`: Int = -1073414656;
public const val `SL_E_TKA_CERT_CNG_NOT_AVAILABLE`: Int = -1073417453;
public const val `SL_E_TKA_CERT_NOT_FOUND`: Int = -1073417467;
public const val `SL_E_TKA_CHALLENGE_EXPIRED`: Int = -1073417471;
public const val `SL_E_TKA_CHALLENGE_MISMATCH`: Int = -1073417463;
public const val `SL_E_TKA_CRITERIA_MISMATCH`: Int = -1073417457;
public const val `SL_E_TKA_FAILED_GRANT_PARSING`: Int = -1073417460;
public const val `SL_E_TKA_GRANT_NOT_FOUND`: Int = -1073417468;
public const val `SL_E_TKA_INVALID_BLOB`: Int = -1073417465;
public const val `SL_E_TKA_INVALID_CERTIFICATE`: Int = -1073417462;
public const val `SL_E_TKA_INVALID_CERT_CHAIN`: Int = -1073417469;
public const val `SL_E_TKA_INVALID_SKU_ID`: Int = -1073417466;
public const val `SL_E_TKA_INVALID_SMARTCARD`: Int = -1073417461;
public const val `SL_E_TKA_INVALID_THUMBPRINT`: Int = -1073417459;
public const val `SL_E_TKA_SILENT_ACTIVATION_FAILURE`: Int = -1073417470;
public const val `SL_E_TKA_SOFT_CERT_DISALLOWED`: Int = -1073417455;
public const val `SL_E_TKA_SOFT_CERT_INVALID`: Int = -1073417454;
public const val `SL_E_TKA_TAMPERED_CERT_CHAIN`: Int = -1073417464;
public const val `SL_E_TKA_THUMBPRINT_CERT_NOT_FOUND`: Int = -1073417458;
public const val `SL_E_TKA_TPID_MISMATCH`: Int = -1073417456;
public const val `SL_E_TOKEN_STORE_INVALID_STATE`: Int = -1073422334;
public const val `SL_E_TOKSTO_ALREADY_INITIALIZED`: Int = -1073422326;
public const val `SL_E_TOKSTO_CANT_ACQUIRE_MUTEX`: Int = -1073422317;
public const val `SL_E_TOKSTO_CANT_CREATE_FILE`: Int = -1073422324;
public const val `SL_E_TOKSTO_CANT_CREATE_MUTEX`: Int = -1073422318;
public const val `SL_E_TOKSTO_CANT_PARSE_PROPERTIES`: Int = -1073422321;
public const val `SL_E_TOKSTO_CANT_READ_FILE`: Int = -1073422322;
public const val `SL_E_TOKSTO_CANT_WRITE_TO_FILE`: Int = -1073422323;
public const val `SL_E_TOKSTO_INVALID_FILE`: Int = -1073422319;
public const val `SL_E_TOKSTO_NOT_INITIALIZED`: Int = -1073422327;
public const val `SL_E_TOKSTO_NO_ID_SET`: Int = -1073422325;
public const val `SL_E_TOKSTO_NO_PROPERTIES`: Int = -1073422328;
public const val `SL_E_TOKSTO_NO_TOKEN_DATA`: Int = -1073422316;
public const val `SL_E_TOKSTO_PROPERTY_NOT_FOUND`: Int = -1073422320;
public const val `SL_E_TOKSTO_TOKEN_NOT_FOUND`: Int = -1073422329;
public const val `SL_E_USE_LICENSE_NOT_INSTALLED`: Int = -1073418237;
public const val `SL_E_VALIDATION_BLOB_PARAM_NOT_FOUND`: Int = -1073429721;
public const val `SL_E_VALIDATION_BLOCKED_PRODUCT_KEY`: Int = -1073429342;
public const val `SL_E_VALIDATION_INVALID_PRODUCT_KEY`: Int = -1073429339;
public const val `SL_E_VALIDITY_PERIOD_EXPIRED`: Int = -1073415161;
public const val `SL_E_VALIDITY_TIME_EXPIRED`: Int = -1073418207;
public const val `SL_E_VALUE_NOT_FOUND`: Int = -1073418222;
public const val `SL_E_VL_AD_AO_NAME_TOO_LONG`: Int = -1073418110;
public const val `SL_E_VL_AD_AO_NOT_FOUND`: Int = -1073418111;
public const val `SL_E_VL_AD_SCHEMA_VERSION_NOT_SUPPORTED`: Int = -1073418109;
public const val `SL_E_VL_BINDING_SERVICE_NOT_ENABLED`: Int = -1073418183;
public const val `SL_E_VL_BINDING_SERVICE_UNAVAILABLE`: Int = -1073418124;
public const val `SL_E_VL_INFO_PRODUCT_USER_RIGHT`: Int = 1074065472;
public const val `SL_E_VL_INVALID_TIMESTAMP`: Int = -1073418132;
public const val `SL_E_VL_KEY_MANAGEMENT_SERVICE_ID_MISMATCH`: Int = -1073418174;
public const val `SL_E_VL_KEY_MANAGEMENT_SERVICE_NOT_ACTIVATED`: Int = -1073418175;
public const val `SL_E_VL_KEY_MANAGEMENT_SERVICE_VM_NOT_SUPPORTED`: Int = -1073418133;
public const val `SL_E_VL_MACHINE_NOT_BOUND`: Int = -1073418154;
public const val `SL_E_VL_NOT_ENOUGH_COUNT`: Int = -1073418184;
public const val `SL_E_VL_NOT_WINDOWS_SLP`: Int = -1073418187;
public const val `SL_E_WINDOWS_INVALID_LICENSE_STATE`: Int = -1073418204;
public const val `SL_E_WINDOWS_VERSION_MISMATCH`: Int = -1073422297;
public typealias `SL_GENUINE_STATE` = Int;
public const val `SL_GEN_STATE_INVALID_LICENSE`: `SL_GENUINE_STATE` = 1;
public const val `SL_GEN_STATE_IS_GENUINE`: `SL_GENUINE_STATE` = 0;
public const val `SL_GEN_STATE_LAST`: `SL_GENUINE_STATE` = 4;
public const val `SL_GEN_STATE_OFFLINE`: `SL_GENUINE_STATE` = 3;
public const val `SL_GEN_STATE_TAMPERED`: `SL_GENUINE_STATE` = 2;
public const val `SL_ID_ALL_LICENSES`: `SLIDTYPE` = 5;
public const val `SL_ID_ALL_LICENSE_FILES`: `SLIDTYPE` = 6;
public const val `SL_ID_APPLICATION`: `SLIDTYPE` = 0;
public const val `SL_ID_LAST`: `SLIDTYPE` = 8;
public const val `SL_ID_LICENSE`: `SLIDTYPE` = 3;
public const val `SL_ID_LICENSE_FILE`: `SLIDTYPE` = 2;
public const val `SL_ID_PKEY`: `SLIDTYPE` = 4;
public const val `SL_ID_PRODUCT_SKU`: `SLIDTYPE` = 1;
public const val `SL_ID_STORE_TOKEN`: `SLIDTYPE` = 7;
// UNSUPPORTED Rust 5029:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_ACTIVE_PLUGINS: windows_sys::core::PCWSTR = windows_sys::core::w!("ActivePlugins");

// UNSUPPORTED Rust 5030:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_AUTHOR: windows_sys::core::PCWSTR = windows_sys::core::w!("Author");

// UNSUPPORTED Rust 5031:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_BIOS_OA2_MINOR_VERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("BiosOA2MinorVersion");

// UNSUPPORTED Rust 5032:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_BIOS_PKEY: windows_sys::core::PCWSTR = windows_sys::core::w!("BiosProductKey");

// UNSUPPORTED Rust 5033:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_BIOS_PKEY_DESCRIPTION: windows_sys::core::PCWSTR = windows_sys::core::w!("BiosProductKeyDescription");

// UNSUPPORTED Rust 5034:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_BIOS_PKEY_PKPN: windows_sys::core::PCWSTR = windows_sys::core::w!("BiosProductKeyPkPn");

// UNSUPPORTED Rust 5035:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_BIOS_SLIC_STATE: windows_sys::core::PCWSTR = windows_sys::core::w!("BiosSlicState");

// UNSUPPORTED Rust 5036:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_CHANNEL: windows_sys::core::PCWSTR = windows_sys::core::w!("Channel");

// UNSUPPORTED Rust 5037:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_DESCRIPTION: windows_sys::core::PCWSTR = windows_sys::core::w!("Description");

// UNSUPPORTED Rust 5038:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_DIGITAL_PID: windows_sys::core::PCWSTR = windows_sys::core::w!("DigitalPID");

// UNSUPPORTED Rust 5039:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_DIGITAL_PID2: windows_sys::core::PCWSTR = windows_sys::core::w!("DigitalPID2");

// UNSUPPORTED Rust 5040:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_IS_KMS: windows_sys::core::PCWSTR = windows_sys::core::w!("IsKeyManagementService");

// UNSUPPORTED Rust 5041:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_IS_PRS: windows_sys::core::PCWSTR = windows_sys::core::w!("IsPRS");

// UNSUPPORTED Rust 5042:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_KMS_CURRENT_COUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyManagementServiceCurrentCount");

// UNSUPPORTED Rust 5043:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_KMS_FAILED_REQUESTS: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyManagementServiceFailedRequests");

// UNSUPPORTED Rust 5044:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_KMS_LICENSED_REQUESTS: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyManagementServiceLicensedRequests");

// UNSUPPORTED Rust 5045:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_KMS_NON_GENUINE_GRACE_REQUESTS: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyManagementServiceNonGenuineGraceRequests");

// UNSUPPORTED Rust 5046:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_KMS_NOTIFICATION_REQUESTS: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyManagementServiceNotificationRequests");

// UNSUPPORTED Rust 5047:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_KMS_OOB_GRACE_REQUESTS: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyManagementServiceOOBGraceRequests");

// UNSUPPORTED Rust 5048:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_KMS_OOT_GRACE_REQUESTS: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyManagementServiceOOTGraceRequests");

// UNSUPPORTED Rust 5049:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_KMS_REQUIRED_CLIENT_COUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyManagementServiceRequiredClientCount");

// UNSUPPORTED Rust 5050:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_KMS_TOTAL_REQUESTS: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyManagementServiceTotalRequests");

// UNSUPPORTED Rust 5051:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_KMS_UNLICENSED_REQUESTS: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyManagementServiceUnlicensedRequests");

// UNSUPPORTED Rust 5052:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_LICENSE_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("LicenseType");

// UNSUPPORTED Rust 5053:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_LICENSOR_URL: windows_sys::core::PCWSTR = windows_sys::core::w!("LicensorUrl");

// UNSUPPORTED Rust 5054:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Name");

// UNSUPPORTED Rust 5055:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_PARTIAL_PRODUCT_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("PartialProductKey");

// UNSUPPORTED Rust 5056:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_PRODUCT_KEY_ACTIVATION_URL: windows_sys::core::PCWSTR = windows_sys::core::w!("PKCURL");

// UNSUPPORTED Rust 5057:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_PRODUCT_SKU_ID: windows_sys::core::PCWSTR = windows_sys::core::w!("ProductSkuId");

// UNSUPPORTED Rust 5058:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_RIGHT_ACCOUNT_ACTIVATION_URL: windows_sys::core::PCWSTR = windows_sys::core::w!("RACURL");

// UNSUPPORTED Rust 5059:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_SECURE_PROCESSOR_ACTIVATION_URL: windows_sys::core::PCWSTR = windows_sys::core::w!("SPCURL");

// UNSUPPORTED Rust 5060:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_SECURE_STORE_ID: windows_sys::core::PCWSTR = windows_sys::core::w!("SecureStoreId");

// UNSUPPORTED Rust 5061:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_SYSTEM_STATE: windows_sys::core::PCWSTR = windows_sys::core::w!("SystemState");

// UNSUPPORTED Rust 5062:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_USE_LICENSE_ACTIVATION_URL: windows_sys::core::PCWSTR = windows_sys::core::w!("EULURL");

// UNSUPPORTED Rust 5063:1: non-scalar type Ptr unsupported
// pub const SL_INFO_KEY_VERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("Version");

public const val `SL_INTERNAL_ZONE`: UInt = 57344u;
public const val `SL_I_NONGENUINE_GRACE_PERIOD`: Int = 1074065509;
public const val `SL_I_NONGENUINE_GRACE_PERIOD_2`: Int = 1074065512;
public const val `SL_I_OOB_GRACE_PERIOD`: Int = 1074065420;
public const val `SL_I_OOT_GRACE_PERIOD`: Int = 1074065421;
public const val `SL_I_PERPETUAL_OOB_GRACE_PERIOD`: Int = 1074068485;
public const val `SL_I_STORE_BASED_ACTIVATION`: Int = 1074066433;
public const val `SL_I_TIMEBASED_EXTENDED_GRACE_PERIOD`: Int = 1074068486;
public const val `SL_I_TIMEBASED_VALIDITY_PERIOD`: Int = 1074068484;
// UNSUPPORTED Rust 5073:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SL_LICENSING_STATUS {
//     pub SkuId: windows_sys::core::GUID,
//     pub eStatus: SLLICENSINGSTATUS,
//     pub dwGraceTime: u32,
//     pub dwTotalGraceDays: u32,
//     pub hrReason: windows_sys::core::HRESULT,
//     pub qwValidityExpiration: u64,
// }

public const val `SL_LICENSING_STATUS_IN_GRACE_PERIOD`: `SLLICENSINGSTATUS` = 2;
public const val `SL_LICENSING_STATUS_LAST`: `SLLICENSINGSTATUS` = 4;
public const val `SL_LICENSING_STATUS_LICENSED`: `SLLICENSINGSTATUS` = 1;
public const val `SL_LICENSING_STATUS_NOTIFICATION`: `SLLICENSINGSTATUS` = 3;
public const val `SL_LICENSING_STATUS_UNLICENSED`: `SLLICENSINGSTATUS` = 0;
public const val `SL_MDOLLAR_ZONE`: UInt = 40960u;
public const val `SL_MSCH_ZONE`: UInt = 49152u;
// UNSUPPORTED Rust 5090:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SL_NONGENUINE_UI_OPTIONS {
//     pub cbSize: u32,
//     pub pComponentId: *const windows_sys::core::GUID,
//     pub hResultUI: windows_sys::core::HRESULT,
// }

// UNSUPPORTED Rust 5097:1: declaration Impl has no candidate rule
// impl Default for SL_NONGENUINE_UI_OPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5102:1: non-scalar type Ptr unsupported
// pub const SL_PKEY_DETECT: windows_sys::core::PCWSTR = windows_sys::core::w!("msft:rm/algorithm/pkey/detect");

// UNSUPPORTED Rust 5103:1: non-scalar type Ptr unsupported
// pub const SL_PKEY_MS2005: windows_sys::core::PCWSTR = windows_sys::core::w!("msft:rm/algorithm/pkey/2005");

// UNSUPPORTED Rust 5104:1: non-scalar type Ptr unsupported
// pub const SL_PKEY_MS2009: windows_sys::core::PCWSTR = windows_sys::core::w!("msft:rm/algorithm/pkey/2009");

// UNSUPPORTED Rust 5105:1: non-scalar type Ptr unsupported
// pub const SL_POLICY_EVALUATION_MODE_ENABLED: windows_sys::core::PCWSTR = windows_sys::core::w!("Security-SPP-EvaluationModeEnabled");

// UNSUPPORTED Rust 5106:1: non-scalar type Ptr unsupported
// pub const SL_PROP_ACTIVATION_VALIDATION_IN_PROGRESS: windows_sys::core::PCWSTR = windows_sys::core::w!("SL_ACTIVATION_VALIDATION_IN_PROGRESS");

// UNSUPPORTED Rust 5107:1: non-scalar type Ptr unsupported
// pub const SL_PROP_BRT_COMMIT: windows_sys::core::PCWSTR = windows_sys::core::w!("SL_BRT_COMMIT");

// UNSUPPORTED Rust 5108:1: non-scalar type Ptr unsupported
// pub const SL_PROP_BRT_DATA: windows_sys::core::PCWSTR = windows_sys::core::w!("SL_BRT_DATA");

// UNSUPPORTED Rust 5109:1: non-scalar type Ptr unsupported
// pub const SL_PROP_GENUINE_RESULT: windows_sys::core::PCWSTR = windows_sys::core::w!("SL_GENUINE_RESULT");

// UNSUPPORTED Rust 5110:1: non-scalar type Ptr unsupported
// pub const SL_PROP_GET_GENUINE_AUTHZ: windows_sys::core::PCWSTR = windows_sys::core::w!("SL_GET_GENUINE_AUTHZ");

// UNSUPPORTED Rust 5111:1: non-scalar type Ptr unsupported
// pub const SL_PROP_GET_GENUINE_SERVER_AUTHZ: windows_sys::core::PCWSTR = windows_sys::core::w!("SL_GET_GENUINE_SERVER_AUTHZ");

// UNSUPPORTED Rust 5112:1: non-scalar type Ptr unsupported
// pub const SL_PROP_LAST_ACT_ATTEMPT_HRESULT: windows_sys::core::PCWSTR = windows_sys::core::w!("SL_LAST_ACT_ATTEMPT_HRESULT");

// UNSUPPORTED Rust 5113:1: non-scalar type Ptr unsupported
// pub const SL_PROP_LAST_ACT_ATTEMPT_SERVER_FLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("SL_LAST_ACT_ATTEMPT_SERVER_FLAGS");

// UNSUPPORTED Rust 5114:1: non-scalar type Ptr unsupported
// pub const SL_PROP_LAST_ACT_ATTEMPT_TIME: windows_sys::core::PCWSTR = windows_sys::core::w!("SL_LAST_ACT_ATTEMPT_TIME");

// UNSUPPORTED Rust 5115:1: non-scalar type Ptr unsupported
// pub const SL_PROP_NONGENUINE_GRACE_FLAG: windows_sys::core::PCWSTR = windows_sys::core::w!("SL_NONGENUINE_GRACE_FLAG");

public const val `SL_REARM_REBOOT_REQUIRED`: UInt = 1u;
public const val `SL_REFERRALTYPE_APPID`: `SLREFERRALTYPE` = 1;
public const val `SL_REFERRALTYPE_BEST_MATCH`: `SLREFERRALTYPE` = 4;
public const val `SL_REFERRALTYPE_OVERRIDE_APPID`: `SLREFERRALTYPE` = 3;
public const val `SL_REFERRALTYPE_OVERRIDE_SKUID`: `SLREFERRALTYPE` = 2;
public const val `SL_REFERRALTYPE_SKUID`: `SLREFERRALTYPE` = 0;
public const val `SL_REMAPPING_MDOLLAR_CIDIID_INVALID_CHECK_DIGITS`: Int = -2143313776;
public const val `SL_REMAPPING_MDOLLAR_CIDIID_INVALID_DATA`: Int = -2143313778;
public const val `SL_REMAPPING_MDOLLAR_CIDIID_INVALID_DATA_LENGTH`: Int = -2143313777;
public const val `SL_REMAPPING_MDOLLAR_CIDIID_INVALID_VERSION`: Int = -2143313779;
public const val `SL_REMAPPING_MDOLLAR_DIGITALMARKER_BINDING_NOT_CONFIGURED`: Int = -2143313708;
public const val `SL_REMAPPING_MDOLLAR_DIGITALMARKER_INVALID_BINDING`: Int = -2143313709;
public const val `SL_REMAPPING_MDOLLAR_DMAK_EXTENSION_LIMIT_EXCEEDED`: Int = -2143313792;
public const val `SL_REMAPPING_MDOLLAR_DMAK_LIMIT_EXCEEDED`: Int = -2143313793;
public const val `SL_REMAPPING_MDOLLAR_DMAK_OVERRIDE_LIMIT_REACHED`: Int = -2143313706;
public const val `SL_REMAPPING_MDOLLAR_FREE_OFFER_EXPIRED`: Int = -2143312896;
public const val `SL_REMAPPING_MDOLLAR_INVALID_ACTCONFIG_ID`: Int = -2143313802;
public const val `SL_REMAPPING_MDOLLAR_INVALID_ARGUMENT`: Int = -2143313795;
public const val `SL_REMAPPING_MDOLLAR_INVALID_BINDING`: Int = -2143313818;
public const val `SL_REMAPPING_MDOLLAR_INVALID_BINDING_URI`: Int = -2143313798;
public const val `SL_REMAPPING_MDOLLAR_INVALID_PRODUCT_DATA`: Int = -2143313804;
public const val `SL_REMAPPING_MDOLLAR_INVALID_PRODUCT_DATA_ID`: Int = -2143313805;
public const val `SL_REMAPPING_MDOLLAR_INVALID_PRODUCT_KEY`: Int = -2143313816;
public const val `SL_REMAPPING_MDOLLAR_INVALID_PRODUCT_KEY_FORMAT`: Int = -2143313800;
public const val `SL_REMAPPING_MDOLLAR_INVALID_PRODUCT_KEY_LENGTH`: Int = -2143313801;
public const val `SL_REMAPPING_MDOLLAR_MAXIMUM_UNLOCK_EXCEEDED`: Int = -2143313807;
public const val `SL_REMAPPING_MDOLLAR_NO_RULES_TO_ACTIVATE`: Int = -2143313720;
public const val `SL_REMAPPING_MDOLLAR_OEM_SLP_COA0`: Int = -2143313789;
public const val `SL_REMAPPING_MDOLLAR_OSR_DEVICE_BLOCKED`: Int = -2143310909;
public const val `SL_REMAPPING_MDOLLAR_OSR_DEVICE_THROTTLED`: Int = -2143310914;
public const val `SL_REMAPPING_MDOLLAR_OSR_DONOR_HWID_NO_ENTITLEMENT`: Int = -2143310920;
public const val `SL_REMAPPING_MDOLLAR_OSR_GENERIC_ERROR`: Int = -2143310919;
public const val `SL_REMAPPING_MDOLLAR_OSR_GP_DISABLED`: Int = -2143310913;
public const val `SL_REMAPPING_MDOLLAR_OSR_HARDWARE_BLOCKED`: Int = -2143310912;
public const val `SL_REMAPPING_MDOLLAR_OSR_LICENSE_BLOCKED`: Int = -2143310910;
public const val `SL_REMAPPING_MDOLLAR_OSR_LICENSE_THROTTLED`: Int = -2143310915;
public const val `SL_REMAPPING_MDOLLAR_OSR_NOT_ADMIN`: Int = -2143310917;
public const val `SL_REMAPPING_MDOLLAR_OSR_NO_ASSOCIATION`: Int = -2143310918;
public const val `SL_REMAPPING_MDOLLAR_OSR_USER_BLOCKED`: Int = -2143310911;
public const val `SL_REMAPPING_MDOLLAR_OSR_USER_THROTTLED`: Int = -2143310916;
public const val `SL_REMAPPING_MDOLLAR_PRODUCT_KEY_BLOCKED`: Int = -2143313817;
public const val `SL_REMAPPING_MDOLLAR_PRODUCT_KEY_BLOCKED_IPLOCATION`: Int = -2143313717;
public const val `SL_REMAPPING_MDOLLAR_PRODUCT_KEY_OUT_OF_RANGE`: Int = -2143313819;
public const val `SL_REMAPPING_MDOLLAR_ROT_OVERRIDE_LIMIT_REACHED`: Int = -2143313707;
public const val `SL_REMAPPING_MDOLLAR_TIMEBASED_ACTIVATION_AFTER_END_DATE`: Int = -2143313768;
public const val `SL_REMAPPING_MDOLLAR_TIMEBASED_ACTIVATION_BEFORE_START_DATE`: Int = -2143313769;
public const val `SL_REMAPPING_MDOLLAR_TIMEBASED_ACTIVATION_NOT_AVAILABLE`: Int = -2143313767;
public const val `SL_REMAPPING_MDOLLAR_TIMEBASED_PRODUCT_KEY_NOT_CONFIGURED`: Int = -2143313766;
public const val `SL_REMAPPING_MDOLLAR_UNSUPPORTED_PRODUCT_KEY`: Int = -2143313812;
public const val `SL_REMAPPING_SP_PUB_API_BAD_GET_INFO_QUERY`: Int = -1073426414;
public const val `SL_REMAPPING_SP_PUB_API_HANDLE_NOT_COMMITED`: Int = -1073426303;
public const val `SL_REMAPPING_SP_PUB_API_INVALID_ALGORITHM_TYPE`: Int = -1073426423;
public const val `SL_REMAPPING_SP_PUB_API_INVALID_HANDLE`: Int = -1073426388;
public const val `SL_REMAPPING_SP_PUB_API_INVALID_KEY_LENGTH`: Int = -1073426347;
public const val `SL_REMAPPING_SP_PUB_API_INVALID_LICENSE`: Int = -1073426432;
public const val `SL_REMAPPING_SP_PUB_API_NO_AES_PROVIDER`: Int = -1073426317;
public const val `SL_REMAPPING_SP_PUB_API_TOO_MANY_LOADED_ENVIRONMENTS`: Int = -1073426420;
public const val `SL_REMAPPING_SP_PUB_CRYPTO_HASH_FINALIZED`: Int = -1073425911;
public const val `SL_REMAPPING_SP_PUB_CRYPTO_INVALID_BLOCK`: Int = -1073425905;
public const val `SL_REMAPPING_SP_PUB_CRYPTO_INVALID_BLOCKLENGTH`: Int = -1073425918;
public const val `SL_REMAPPING_SP_PUB_CRYPTO_INVALID_CIPHER`: Int = -1073425917;
public const val `SL_REMAPPING_SP_PUB_CRYPTO_INVALID_CIPHERMODE`: Int = -1073425916;
public const val `SL_REMAPPING_SP_PUB_CRYPTO_INVALID_FORMAT`: Int = -1073425904;
public const val `SL_REMAPPING_SP_PUB_CRYPTO_INVALID_KEYLENGTH`: Int = -1073425919;
public const val `SL_REMAPPING_SP_PUB_CRYPTO_INVALID_PADDING`: Int = -1073425903;
public const val `SL_REMAPPING_SP_PUB_CRYPTO_INVALID_SIGNATURE`: Int = -1073425906;
public const val `SL_REMAPPING_SP_PUB_CRYPTO_INVALID_SIGNATURELENGTH`: Int = -1073425907;
public const val `SL_REMAPPING_SP_PUB_CRYPTO_KEY_NOT_AVAILABLE`: Int = -1073425910;
public const val `SL_REMAPPING_SP_PUB_CRYPTO_KEY_NOT_FOUND`: Int = -1073425909;
public const val `SL_REMAPPING_SP_PUB_CRYPTO_NOT_BLOCK_ALIGNED`: Int = -1073425908;
public const val `SL_REMAPPING_SP_PUB_CRYPTO_UNKNOWN_ATTRIBUTEID`: Int = -1073425912;
public const val `SL_REMAPPING_SP_PUB_CRYPTO_UNKNOWN_HASHID`: Int = -1073425913;
public const val `SL_REMAPPING_SP_PUB_CRYPTO_UNKNOWN_KEYID`: Int = -1073425914;
public const val `SL_REMAPPING_SP_PUB_CRYPTO_UNKNOWN_PROVIDERID`: Int = -1073425915;
public const val `SL_REMAPPING_SP_PUB_GENERAL_NOT_INITIALIZED`: Int = -1073426175;
public const val `SL_REMAPPING_SP_PUB_KM_CACHE_IDENTICAL`: Int = 1074058753;
public const val `SL_REMAPPING_SP_PUB_KM_CACHE_POLICY_CHANGED`: Int = 1074058754;
public const val `SL_REMAPPING_SP_PUB_KM_CACHE_TAMPER`: Int = -1073425151;
public const val `SL_REMAPPING_SP_PUB_KM_CACHE_TAMPER_RESTORE_FAILED`: Int = -1073425150;
public const val `SL_REMAPPING_SP_PUB_PROXY_SOFT_TAMPER`: Int = -1073424638;
public const val `SL_REMAPPING_SP_PUB_TAMPER_MODULE_AUTHENTICATION`: Int = -1073425407;
public const val `SL_REMAPPING_SP_PUB_TAMPER_SECURITY_PROCESSOR_PATCHED`: Int = -1073425406;
public const val `SL_REMAPPING_SP_PUB_TIMER_ALREADY_EXISTS`: Int = -1073425654;
public const val `SL_REMAPPING_SP_PUB_TIMER_EXPIRED`: Int = -1073425652;
public const val `SL_REMAPPING_SP_PUB_TIMER_NAME_SIZE_TOO_BIG`: Int = -1073425651;
public const val `SL_REMAPPING_SP_PUB_TIMER_NOT_FOUND`: Int = -1073425653;
public const val `SL_REMAPPING_SP_PUB_TIMER_READ_ONLY`: Int = -1073425647;
public const val `SL_REMAPPING_SP_PUB_TRUSTED_TIME_OK`: Int = 1074057999;
public const val `SL_REMAPPING_SP_PUB_TS_ACCESS_DENIED`: Int = -1073425644;
public const val `SL_REMAPPING_SP_PUB_TS_ATTRIBUTE_NOT_FOUND`: Int = -1073425645;
public const val `SL_REMAPPING_SP_PUB_TS_ATTRIBUTE_READ_ONLY`: Int = -1073425646;
public const val `SL_REMAPPING_SP_PUB_TS_DATA_SIZE_TOO_BIG`: Int = -1073425656;
public const val `SL_REMAPPING_SP_PUB_TS_ENTRY_KEY_ALREADY_EXISTS`: Int = -1073425659;
public const val `SL_REMAPPING_SP_PUB_TS_ENTRY_KEY_NOT_FOUND`: Int = -1073425660;
public const val `SL_REMAPPING_SP_PUB_TS_ENTRY_KEY_SIZE_TOO_BIG`: Int = -1073425658;
public const val `SL_REMAPPING_SP_PUB_TS_ENTRY_READ_ONLY`: Int = -1073425648;
public const val `SL_REMAPPING_SP_PUB_TS_FULL`: Int = -1073425650;
public const val `SL_REMAPPING_SP_PUB_TS_INVALID_HW_BINDING`: Int = -1073425655;
public const val `SL_REMAPPING_SP_PUB_TS_MAX_REARM_REACHED`: Int = -1073425657;
public const val `SL_REMAPPING_SP_PUB_TS_NAMESPACE_IN_USE`: Int = -1073425642;
public const val `SL_REMAPPING_SP_PUB_TS_NAMESPACE_NOT_FOUND`: Int = -1073425643;
public const val `SL_REMAPPING_SP_PUB_TS_REARMED`: Int = -1073425662;
public const val `SL_REMAPPING_SP_PUB_TS_RECREATED`: Int = -1073425661;
public const val `SL_REMAPPING_SP_PUB_TS_TAMPERED`: Int = -1073425663;
public const val `SL_REMAPPING_SP_PUB_TS_TAMPERED_BREADCRUMB_GENERATION`: Int = -1073425640;
public const val `SL_REMAPPING_SP_PUB_TS_TAMPERED_BREADCRUMB_LOAD_INVALID`: Int = -1073425641;
public const val `SL_REMAPPING_SP_PUB_TS_TAMPERED_DATA_BREADCRUMB_MISMATCH`: Int = -1073425637;
public const val `SL_REMAPPING_SP_PUB_TS_TAMPERED_DATA_VERSION_MISMATCH`: Int = -1073425636;
public const val `SL_REMAPPING_SP_PUB_TS_TAMPERED_INVALID_DATA`: Int = -1073425639;
public const val `SL_REMAPPING_SP_PUB_TS_TAMPERED_NO_DATA`: Int = -1073425638;
public const val `SL_REMAPPING_SP_STATUS_ALREADY_EXISTS`: Int = -1073426171;
public const val `SL_REMAPPING_SP_STATUS_DEBUGGER_DETECTED`: Int = -2147167989;
public const val `SL_REMAPPING_SP_STATUS_GENERIC_FAILURE`: Int = -1073426173;
public const val `SL_REMAPPING_SP_STATUS_INSUFFICIENT_BUFFER`: Int = -1073426169;
public const val `SL_REMAPPING_SP_STATUS_INVALIDARG`: Int = -1073426172;
public const val `SL_REMAPPING_SP_STATUS_INVALIDDATA`: Int = -1073426168;
public const val `SL_REMAPPING_SP_STATUS_INVALID_SPAPI_CALL`: Int = -1073426167;
public const val `SL_REMAPPING_SP_STATUS_INVALID_SPAPI_VERSION`: Int = -1073426166;
public const val `SL_REMAPPING_SP_STATUS_NO_MORE_DATA`: Int = -1073426164;
public const val `SL_REMAPPING_SP_STATUS_PUSHKEY_CONFLICT`: Int = -1073424639;
public const val `SL_REMAPPING_SP_STATUS_SYSTEM_TIME_SKEWED`: Int = -2147167998;
public const val `SL_SERVER_ZONE`: UInt = 45056u;
// UNSUPPORTED Rust 5238:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SL_SYSTEM_POLICY_INFORMATION {
//     pub Reserved1: [*mut core::ffi::c_void; 2],
//     pub Reserved2: [u32; 3],
// }

// UNSUPPORTED Rust 5244:1: declaration Impl has no candidate rule
// impl Default for SL_SYSTEM_POLICY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SL_SYSTEM_STATE_REBOOT_POLICY_FOUND`: UInt = 1u;
public const val `SL_SYSTEM_STATE_TAMPERED`: UInt = 2u;
public const val `SPP_MIGRATION_GATHER_ACTIVATED_WINDOWS_STATE`: UInt = 2u;
public const val `SPP_MIGRATION_GATHER_ALL`: UInt = 4294967295u;
public const val `SPP_MIGRATION_GATHER_MIGRATABLE_APPS`: UInt = 1u;
// UNSUPPORTED Rust 5254:1: non-scalar type Ptr unsupported
// pub const SP_ACCEPT_CREDENTIALS_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("SpAcceptCredentials\u{0}");

public const val `SP_PROT_ALL`: UInt = 4294967295u;
public const val `SP_PROT_DTLS1_0_CLIENT`: UInt = 131072u;
public const val `SP_PROT_DTLS1_0_SERVER`: UInt = 65536u;
public const val `SP_PROT_DTLS1_2_CLIENT`: UInt = 524288u;
public const val `SP_PROT_DTLS1_2_SERVER`: UInt = 262144u;
public const val `SP_PROT_DTLS_CLIENT`: UInt = 131072u;
public const val `SP_PROT_DTLS_SERVER`: UInt = 65536u;
public const val `SP_PROT_NONE`: UInt = 0u;
public const val `SP_PROT_PCT1_CLIENT`: UInt = 2u;
public const val `SP_PROT_PCT1_SERVER`: UInt = 1u;
public const val `SP_PROT_SSL2_CLIENT`: UInt = 8u;
public const val `SP_PROT_SSL2_SERVER`: UInt = 4u;
public const val `SP_PROT_SSL3_CLIENT`: UInt = 32u;
public const val `SP_PROT_SSL3_SERVER`: UInt = 16u;
public const val `SP_PROT_TLS1_0_CLIENT`: UInt = 128u;
public const val `SP_PROT_TLS1_0_SERVER`: UInt = 64u;
public const val `SP_PROT_TLS1_1_CLIENT`: UInt = 512u;
public const val `SP_PROT_TLS1_1_SERVER`: UInt = 256u;
public const val `SP_PROT_TLS1_2_CLIENT`: UInt = 2048u;
public const val `SP_PROT_TLS1_2_SERVER`: UInt = 1024u;
public const val `SP_PROT_TLS1_3PLUS_CLIENT`: UInt = 8192u;
public const val `SP_PROT_TLS1_3PLUS_SERVER`: UInt = 4096u;
public const val `SP_PROT_TLS1_3_CLIENT`: UInt = 8192u;
public const val `SP_PROT_TLS1_3_SERVER`: UInt = 4096u;
public const val `SP_PROT_TLS1_CLIENT`: UInt = 128u;
public const val `SP_PROT_TLS1_SERVER`: UInt = 64u;
public const val `SP_PROT_UNI_CLIENT`: UInt = 2147483648u;
public const val `SP_PROT_UNI_SERVER`: UInt = 1073741824u;
// UNSUPPORTED Rust 5283:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SR_SECURITY_DESCRIPTOR {
//     pub Length: u32,
//     pub SecurityDescriptor: *mut u8,
// }

// UNSUPPORTED Rust 5289:1: declaration Impl has no candidate rule
// impl Default for SR_SECURITY_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5294:1: non-scalar type Ptr unsupported
// pub const SSL2SP_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft SSL 2.0");

// UNSUPPORTED Rust 5295:1: non-scalar type Ptr unsupported
// pub const SSL2SP_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("Microsoft SSL 2.0");

// UNSUPPORTED Rust 5296:1: non-scalar type Ptr unsupported
// pub const SSL2SP_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft SSL 2.0");

// UNSUPPORTED Rust 5297:1: non-scalar type Ptr unsupported
// pub const SSL3SP_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft SSL 3.0");

// UNSUPPORTED Rust 5298:1: non-scalar type Ptr unsupported
// pub const SSL3SP_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("Microsoft SSL 3.0");

// UNSUPPORTED Rust 5299:1: non-scalar type Ptr unsupported
// pub const SSL3SP_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft SSL 3.0");

// UNSUPPORTED Rust 5300:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Cryptography")]
// pub type SSL_CRACK_CERTIFICATE_FN = Option<unsafe extern "system" fn(pbcertificate: *mut u8, cbcertificate: u32, verifysignature: windows_sys::core::BOOL, ppcertificate: *mut *mut X509Certificate) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 5302:1: non-scalar type Ptr unsupported
// pub const SSL_CRACK_CERTIFICATE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SslCrackCertificate");

// UNSUPPORTED Rust 5303:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SSL_CREDENTIAL_CERTIFICATE {
//     pub cbPrivateKey: u32,
//     pub pPrivateKey: *mut u8,
//     pub cbCertificate: u32,
//     pub pCertificate: *mut u8,
//     pub pszPassword: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 5312:1: declaration Impl has no candidate rule
// impl Default for SSL_CREDENTIAL_CERTIFICATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5317:1: generic scalar type unsupported
// pub type SSL_EMPTY_CACHE_FN_A = Option<unsafe extern "system" fn(psztargetname: windows_sys::core::PCSTR, dwflags: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 5318:1: generic scalar type unsupported
// pub type SSL_EMPTY_CACHE_FN_W = Option<unsafe extern "system" fn(psztargetname: windows_sys::core::PCWSTR, dwflags: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 5319:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Cryptography")]
// pub type SSL_FREE_CERTIFICATE_FN = Option<unsafe extern "system" fn(pcertificate: *mut X509Certificate)>;

// UNSUPPORTED Rust 5321:1: non-scalar type Ptr unsupported
// pub const SSL_FREE_CERTIFICATE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SslFreeCertificate");

public const val `SSL_SESSION_DISABLE_RECONNECTS`: `SCHANNEL_SESSION_TOKEN_FLAGS` = 2u;
public const val `SSL_SESSION_ENABLE_RECONNECTS`: `SCHANNEL_SESSION_TOKEN_FLAGS` = 1u;
public const val `SSL_SESSION_RECONNECT`: UInt = 1u;
public const val `SSPIPFC_CREDPROV_DO_NOT_LOAD`: UInt = 4u;
public const val `SSPIPFC_CREDPROV_DO_NOT_SAVE`: UInt = 1u;
public const val `SSPIPFC_NO_CHECKBOX`: UInt = 2u;
public const val `SSPIPFC_SAVE_CRED_BY_CALLER`: UInt = 1u;
public const val `SSPIPFC_USE_CREDUIBROKER`: UInt = 8u;
// UNSUPPORTED Rust 5330:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SUBSCRIBE_GENERIC_TLS_EXTENSION {
//     pub Flags: u32,
//     pub SubscriptionsCount: u32,
//     pub Subscriptions: [TLS_EXTENSION_SUBSCRIPTION; 1],
// }

// UNSUPPORTED Rust 5337:1: declaration Impl has no candidate rule
// impl Default for SUBSCRIBE_GENERIC_TLS_EXTENSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SZ_ALG_MAX_SIZE`: UInt = 64u;
public const val `Sasl_AuthZIDForbidden`: `SASL_AUTHZID_STATE` = 0;
public const val `Sasl_AuthZIDProcessed`: `SASL_AUTHZID_STATE` = 1;
public typealias `SchGetExtensionsOptions` = Int;
public const val `SeAdtParmTypeAccessMask`: `SE_ADT_PARAMETER_TYPE` = 7;
public const val `SeAdtParmTypeAccessReason`: `SE_ADT_PARAMETER_TYPE` = 29;
public const val `SeAdtParmTypeClaims`: `SE_ADT_PARAMETER_TYPE` = 32;
public const val `SeAdtParmTypeDateTime`: `SE_ADT_PARAMETER_TYPE` = 22;
public const val `SeAdtParmTypeDuration`: `SE_ADT_PARAMETER_TYPE` = 18;
public const val `SeAdtParmTypeFileSpec`: `SE_ADT_PARAMETER_TYPE` = 2;
public const val `SeAdtParmTypeGuid`: `SE_ADT_PARAMETER_TYPE` = 13;
public const val `SeAdtParmTypeHexInt64`: `SE_ADT_PARAMETER_TYPE` = 15;
public const val `SeAdtParmTypeHexUlong`: `SE_ADT_PARAMETER_TYPE` = 10;
public const val `SeAdtParmTypeLogonHours`: `SE_ADT_PARAMETER_TYPE` = 25;
public const val `SeAdtParmTypeLogonId`: `SE_ADT_PARAMETER_TYPE` = 5;
public const val `SeAdtParmTypeLogonIdAsSid`: `SE_ADT_PARAMETER_TYPE` = 33;
public const val `SeAdtParmTypeLogonIdEx`: `SE_ADT_PARAMETER_TYPE` = 35;
public const val `SeAdtParmTypeLogonIdNoSid`: `SE_ADT_PARAMETER_TYPE` = 26;
public const val `SeAdtParmTypeLuid`: `SE_ADT_PARAMETER_TYPE` = 14;
public const val `SeAdtParmTypeMessage`: `SE_ADT_PARAMETER_TYPE` = 21;
public const val `SeAdtParmTypeMultiSzString`: `SE_ADT_PARAMETER_TYPE` = 34;
public const val `SeAdtParmTypeNoLogonId`: `SE_ADT_PARAMETER_TYPE` = 6;
public const val `SeAdtParmTypeNoUac`: `SE_ADT_PARAMETER_TYPE` = 20;
public const val `SeAdtParmTypeNone`: `SE_ADT_PARAMETER_TYPE` = 0;
public const val `SeAdtParmTypeObjectTypes`: `SE_ADT_PARAMETER_TYPE` = 9;
public const val `SeAdtParmTypePrivs`: `SE_ADT_PARAMETER_TYPE` = 8;
public const val `SeAdtParmTypePtr`: `SE_ADT_PARAMETER_TYPE` = 11;
public const val `SeAdtParmTypeResourceAttribute`: `SE_ADT_PARAMETER_TYPE` = 31;
public const val `SeAdtParmTypeSD`: `SE_ADT_PARAMETER_TYPE` = 24;
public const val `SeAdtParmTypeSid`: `SE_ADT_PARAMETER_TYPE` = 4;
public const val `SeAdtParmTypeSidList`: `SE_ADT_PARAMETER_TYPE` = 17;
public const val `SeAdtParmTypeSockAddr`: `SE_ADT_PARAMETER_TYPE` = 23;
public const val `SeAdtParmTypeSockAddrNoPort`: `SE_ADT_PARAMETER_TYPE` = 28;
public const val `SeAdtParmTypeStagingReason`: `SE_ADT_PARAMETER_TYPE` = 30;
public const val `SeAdtParmTypeString`: `SE_ADT_PARAMETER_TYPE` = 1;
public const val `SeAdtParmTypeStringList`: `SE_ADT_PARAMETER_TYPE` = 16;
public const val `SeAdtParmTypeTime`: `SE_ADT_PARAMETER_TYPE` = 12;
public const val `SeAdtParmTypeUlong`: `SE_ADT_PARAMETER_TYPE` = 3;
public const val `SeAdtParmTypeUlongNoConv`: `SE_ADT_PARAMETER_TYPE` = 27;
public const val `SeAdtParmTypeUserAccountControl`: `SE_ADT_PARAMETER_TYPE` = 19;
public const val `SecApplicationProtocolNegotiationExt_ALPN`: `SEC_APPLICATION_PROTOCOL_NEGOTIATION_EXT` = 2;
public const val `SecApplicationProtocolNegotiationExt_NPN`: `SEC_APPLICATION_PROTOCOL_NEGOTIATION_EXT` = 1;
public const val `SecApplicationProtocolNegotiationExt_None`: `SEC_APPLICATION_PROTOCOL_NEGOTIATION_EXT` = 0;
public const val `SecApplicationProtocolNegotiationStatus_None`: `SEC_APPLICATION_PROTOCOL_NEGOTIATION_STATUS` = 0;
public const val `SecApplicationProtocolNegotiationStatus_SelectedClientOnly`: `SEC_APPLICATION_PROTOCOL_NEGOTIATION_STATUS` = 2;
public const val `SecApplicationProtocolNegotiationStatus_Success`: `SEC_APPLICATION_PROTOCOL_NEGOTIATION_STATUS` = 1;
// UNSUPPORTED Rust 5388:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecBuffer {
//     pub cbBuffer: u32,
//     pub BufferType: u32,
//     pub pvBuffer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 5395:1: declaration Impl has no candidate rule
// impl Default for SecBuffer {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5400:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecBufferDesc {
//     pub ulVersion: u32,
//     pub cBuffers: u32,
//     pub pBuffers: *mut SecBuffer,
// }

// UNSUPPORTED Rust 5407:1: declaration Impl has no candidate rule
// impl Default for SecBufferDesc {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SecDelegationType` = Int;
public const val `SecDirectory`: `SecDelegationType` = 3;
public const val `SecFull`: `SecDelegationType` = 0;
public const val `SecNameAlternateId`: `SECPKG_NAME_TYPE` = 1;
public const val `SecNameDN`: `SECPKG_NAME_TYPE` = 3;
public const val `SecNameFlat`: `SECPKG_NAME_TYPE` = 2;
public const val `SecNameSPN`: `SECPKG_NAME_TYPE` = 4;
public const val `SecNameSamCompatible`: `SECPKG_NAME_TYPE` = 0;
public const val `SecObject`: `SecDelegationType` = 4;
public const val `SecPkgAttrLastClientTokenMaybe`: `SECPKG_ATTR_LCT_STATUS` = 2;
public const val `SecPkgAttrLastClientTokenNo`: `SECPKG_ATTR_LCT_STATUS` = 1;
public const val `SecPkgAttrLastClientTokenYes`: `SECPKG_ATTR_LCT_STATUS` = 0;
public const val `SecPkgCallPackageMaxMessage`: `SECPKG_CALL_PACKAGE_MESSAGE_TYPE` = 1026;
public const val `SecPkgCallPackageMinMessage`: `SECPKG_CALL_PACKAGE_MESSAGE_TYPE` = 1024;
public const val `SecPkgCallPackagePinDcMessage`: `SECPKG_CALL_PACKAGE_MESSAGE_TYPE` = 1024;
public const val `SecPkgCallPackageTransferCredMessage`: `SECPKG_CALL_PACKAGE_MESSAGE_TYPE` = 1026;
public const val `SecPkgCallPackageUnpinAllDcsMessage`: `SECPKG_CALL_PACKAGE_MESSAGE_TYPE` = 1025;
// UNSUPPORTED Rust 5429:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_AccessToken {
//     pub AccessToken: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 5434:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_AccessToken {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5439:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_ApplicationProtocol {
//     pub ProtoNegoStatus: SEC_APPLICATION_PROTOCOL_NEGOTIATION_STATUS,
//     pub ProtoNegoExt: SEC_APPLICATION_PROTOCOL_NEGOTIATION_EXT,
//     pub ProtocolIdSize: u8,
//     pub ProtocolId: [u8; 255],
// }

// UNSUPPORTED Rust 5447:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_ApplicationProtocol {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5452:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_AuthorityA {
//     pub sAuthorityName: *mut i8,
// }

// UNSUPPORTED Rust 5457:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_AuthorityA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5462:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_AuthorityW {
//     pub sAuthorityName: *mut u16,
// }

// UNSUPPORTED Rust 5467:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_AuthorityW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5472:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_AuthzID {
//     pub AuthzIDLength: u32,
//     pub AuthzID: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 5478:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_AuthzID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5483:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_Bindings {
//     pub BindingsLength: u32,
//     pub Bindings: *mut SEC_CHANNEL_BINDINGS,
// }

// UNSUPPORTED Rust 5489:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_Bindings {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5494:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_CertInfo {
//     pub dwVersion: u32,
//     pub cbSubjectName: u32,
//     pub pwszSubjectName: windows_sys::core::PWSTR,
//     pub cbIssuerName: u32,
//     pub pwszIssuerName: windows_sys::core::PWSTR,
//     pub dwKeySize: u32,
// }

// UNSUPPORTED Rust 5504:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_CertInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5509:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SecPkgContext_CertificateValidationResult {
//     pub dwChainErrorStatus: u32,
//     pub hrVerifyChainStatus: windows_sys::core::HRESULT,
// }

// UNSUPPORTED Rust 5515:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_Certificates {
//     pub cCertificates: u32,
//     pub cbCertificateChain: u32,
//     pub pbCertificateChain: *mut u8,
// }

// UNSUPPORTED Rust 5522:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_Certificates {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5527:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_CipherInfo {
//     pub dwVersion: u32,
//     pub dwProtocol: u32,
//     pub dwCipherSuite: u32,
//     pub dwBaseCipherSuite: u32,
//     pub szCipherSuite: [u16; 64],
//     pub szCipher: [u16; 64],
//     pub dwCipherLen: u32,
//     pub dwCipherBlockLen: u32,
//     pub szHash: [u16; 64],
//     pub dwHashLen: u32,
//     pub szExchange: [u16; 64],
//     pub dwMinExchangeLen: u32,
//     pub dwMaxExchangeLen: u32,
//     pub szCertificate: [u16; 64],
//     pub dwKeyType: u32,
// }

// UNSUPPORTED Rust 5546:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_CipherInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5551:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SecPkgContext_ClientCertPolicyResult {
//     pub dwPolicyResult: windows_sys::core::HRESULT,
//     pub guidPolicyId: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 5557:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_ClientSpecifiedTarget {
//     pub sTargetName: *mut u16,
// }

// UNSUPPORTED Rust 5562:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_ClientSpecifiedTarget {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5567:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy, Default)]
// pub struct SecPkgContext_ConnectionInfo {
//     pub dwProtocol: u32,
//     pub aiCipher: super::super::Cryptography::ALG_ID,
//     pub dwCipherStrength: u32,
//     pub aiHash: super::super::Cryptography::ALG_ID,
//     pub dwHashStrength: u32,
//     pub aiExch: super::super::Cryptography::ALG_ID,
//     pub dwExchStrength: u32,
// }

// UNSUPPORTED Rust 5579:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_ConnectionInfoEx {
//     pub dwVersion: u32,
//     pub dwProtocol: u32,
//     pub szCipher: [u16; 64],
//     pub dwCipherStrength: u32,
//     pub szHash: [u16; 64],
//     pub dwHashStrength: u32,
//     pub szExchange: [u16; 64],
//     pub dwExchStrength: u32,
// }

// UNSUPPORTED Rust 5591:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_ConnectionInfoEx {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5596:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SecPkgContext_CredInfo {
//     pub CredClass: SECPKG_CRED_CLASS,
//     pub IsPromptingNeeded: u32,
// }

// UNSUPPORTED Rust 5602:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_CredentialNameA {
//     pub CredentialType: u32,
//     pub sCredentialName: *mut i8,
// }

// UNSUPPORTED Rust 5608:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_CredentialNameA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5613:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_CredentialNameW {
//     pub CredentialType: u32,
//     pub sCredentialName: *mut u16,
// }

// UNSUPPORTED Rust 5619:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_CredentialNameW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5624:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_DceInfo {
//     pub AuthzSvc: u32,
//     pub pPac: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 5630:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_DceInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5635:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_EapKeyBlock {
//     pub rgbKeys: [u8; 128],
//     pub rgbIVs: [u8; 64],
// }

// UNSUPPORTED Rust 5641:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_EapKeyBlock {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5646:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_EapPrfInfo {
//     pub dwVersion: u32,
//     pub cbPrfData: u32,
//     pub pbPrfData: *mut u8,
// }

// UNSUPPORTED Rust 5653:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_EapPrfInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5658:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SecPkgContext_EarlyStart {
//     pub dwEarlyStartFlags: u32,
// }

// UNSUPPORTED Rust 5663:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SecPkgContext_Flags {
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 5668:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_IssuerListInfoEx {
//     pub aIssuers: *mut super::super::Cryptography::CRYPT_INTEGER_BLOB,
//     pub cIssuers: u32,
// }

// UNSUPPORTED Rust 5675:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SecPkgContext_IssuerListInfoEx {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5681:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_KeyInfoA {
//     pub sSignatureAlgorithmName: *mut i8,
//     pub sEncryptAlgorithmName: *mut i8,
//     pub KeySize: u32,
//     pub SignatureAlgorithm: u32,
//     pub EncryptAlgorithm: u32,
// }

// UNSUPPORTED Rust 5690:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_KeyInfoA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5695:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_KeyInfoW {
//     pub sSignatureAlgorithmName: *mut u16,
//     pub sEncryptAlgorithmName: *mut u16,
//     pub KeySize: u32,
//     pub SignatureAlgorithm: u32,
//     pub EncryptAlgorithm: u32,
// }

// UNSUPPORTED Rust 5704:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_KeyInfoW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5709:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_KeyingMaterial {
//     pub cbKeyingMaterial: u32,
//     pub pbKeyingMaterial: *mut u8,
// }

// UNSUPPORTED Rust 5715:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_KeyingMaterial {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5720:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_KeyingMaterialInfo {
//     pub cbLabel: u16,
//     pub pszLabel: windows_sys::core::PSTR,
//     pub cbContextValue: u16,
//     pub pbContextValue: *mut u8,
//     pub cbKeyingMaterial: u32,
// }

// UNSUPPORTED Rust 5729:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_KeyingMaterialInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5734:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_KeyingMaterial_Inproc {
//     pub cbLabel: u16,
//     pub pszLabel: windows_sys::core::PSTR,
//     pub cbContextValue: u16,
//     pub pbContextValue: *mut u8,
//     pub cbKeyingMaterial: u32,
//     pub pbKeyingMaterial: *mut u8,
// }

// UNSUPPORTED Rust 5744:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_KeyingMaterial_Inproc {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5749:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SecPkgContext_LastClientTokenStatus {
//     pub LastClientTokenStatus: SECPKG_ATTR_LCT_STATUS,
// }

// UNSUPPORTED Rust 5754:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SecPkgContext_Lifespan {
//     pub tsStart: i64,
//     pub tsExpiry: i64,
// }

// UNSUPPORTED Rust 5760:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_LocalCredentialInfo {
//     pub cbCertificateChain: u32,
//     pub pbCertificateChain: *mut u8,
//     pub cCertificates: u32,
//     pub fFlags: u32,
//     pub dwBits: u32,
// }

// UNSUPPORTED Rust 5769:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_LocalCredentialInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5774:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SecPkgContext_LogoffTime {
//     pub tsLogoffTime: i64,
// }

// UNSUPPORTED Rust 5779:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_MappedCredAttr {
//     pub dwAttribute: u32,
//     pub pvBuffer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 5785:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_MappedCredAttr {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5790:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_NamesA {
//     pub sUserName: *mut i8,
// }

// UNSUPPORTED Rust 5795:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_NamesA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5800:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_NamesW {
//     pub sUserName: *mut u16,
// }

// UNSUPPORTED Rust 5805:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_NamesW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5810:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_NativeNamesA {
//     pub sClientName: *mut i8,
//     pub sServerName: *mut i8,
// }

// UNSUPPORTED Rust 5816:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_NativeNamesA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5821:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_NativeNamesW {
//     pub sClientName: *mut u16,
//     pub sServerName: *mut u16,
// }

// UNSUPPORTED Rust 5827:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_NativeNamesW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5832:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_NegoKeys {
//     pub KeyType: u32,
//     pub KeyLength: u16,
//     pub KeyValue: *mut u8,
//     pub VerifyKeyType: u32,
//     pub VerifyKeyLength: u16,
//     pub VerifyKeyValue: *mut u8,
// }

// UNSUPPORTED Rust 5842:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_NegoKeys {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5847:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SecPkgContext_NegoPackageInfo {
//     pub PackageMask: u32,
// }

// UNSUPPORTED Rust 5852:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SecPkgContext_NegoStatus {
//     pub LastStatus: u32,
// }

// UNSUPPORTED Rust 5857:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_NegotiatedTlsExtensions {
//     pub ExtensionsCount: u32,
//     pub Extensions: *mut u16,
// }

// UNSUPPORTED Rust 5863:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_NegotiatedTlsExtensions {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5868:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_NegotiationInfoA {
//     pub PackageInfo: *mut SecPkgInfoA,
//     pub NegotiationState: u32,
// }

// UNSUPPORTED Rust 5874:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_NegotiationInfoA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5879:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_NegotiationInfoW {
//     pub PackageInfo: *mut SecPkgInfoW,
//     pub NegotiationState: u32,
// }

// UNSUPPORTED Rust 5885:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_NegotiationInfoW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5890:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_PackageInfoA {
//     pub PackageInfo: *mut SecPkgInfoA,
// }

// UNSUPPORTED Rust 5895:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_PackageInfoA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5900:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_PackageInfoW {
//     pub PackageInfo: *mut SecPkgInfoW,
// }

// UNSUPPORTED Rust 5905:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_PackageInfoW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5910:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SecPkgContext_PasswordExpiry {
//     pub tsPasswordExpires: i64,
// }

// UNSUPPORTED Rust 5915:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_ProtoInfoA {
//     pub sProtocolName: *mut i8,
//     pub majorVersion: u32,
//     pub minorVersion: u32,
// }

// UNSUPPORTED Rust 5922:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_ProtoInfoA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5927:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_ProtoInfoW {
//     pub sProtocolName: *mut u16,
//     pub majorVersion: u32,
//     pub minorVersion: u32,
// }

// UNSUPPORTED Rust 5934:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_ProtoInfoW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5939:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_RemoteCredentialInfo {
//     pub cbCertificateChain: u32,
//     pub pbCertificateChain: *mut u8,
//     pub cCertificates: u32,
//     pub fFlags: u32,
//     pub dwBits: u32,
// }

// UNSUPPORTED Rust 5948:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_RemoteCredentialInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5953:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_SaslContext {
//     pub SaslContext: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 5958:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_SaslContext {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5963:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_SessionAppData {
//     pub dwFlags: u32,
//     pub cbAppData: u32,
//     pub pbAppData: *mut u8,
// }

// UNSUPPORTED Rust 5970:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_SessionAppData {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5975:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_SessionInfo {
//     pub dwFlags: u32,
//     pub cbSessionId: u32,
//     pub rgbSessionId: [u8; 32],
// }

// UNSUPPORTED Rust 5982:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_SessionInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5987:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_SessionKey {
//     pub SessionKeyLength: u32,
//     pub SessionKey: *mut u8,
// }

// UNSUPPORTED Rust 5993:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_SessionKey {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5998:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SecPkgContext_Sizes {
//     pub cbMaxToken: u32,
//     pub cbMaxSignature: u32,
//     pub cbBlockSize: u32,
//     pub cbSecurityTrailer: u32,
// }

// UNSUPPORTED Rust 6006:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_SrtpParameters {
//     pub ProtectionProfile: u16,
//     pub MasterKeyIdentifierSize: u8,
//     pub MasterKeyIdentifier: *mut u8,
// }

// UNSUPPORTED Rust 6013:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_SrtpParameters {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6018:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SecPkgContext_StreamSizes {
//     pub cbHeader: u32,
//     pub cbTrailer: u32,
//     pub cbMaximumMessage: u32,
//     pub cBuffers: u32,
//     pub cbBlockSize: u32,
// }

// UNSUPPORTED Rust 6027:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_SubjectAttributes {
//     pub AttributeInfo: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 6032:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_SubjectAttributes {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6037:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_SupportedSignatures {
//     pub cSignatureAndHashAlgorithms: u16,
//     pub pSignatureAndHashAlgorithms: *mut u16,
// }

// UNSUPPORTED Rust 6043:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_SupportedSignatures {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6048:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_Target {
//     pub TargetLength: u32,
//     pub Target: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 6054:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_Target {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6059:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_TargetInformation {
//     pub MarshalledTargetInfoLength: u32,
//     pub MarshalledTargetInfo: *mut u8,
// }

// UNSUPPORTED Rust 6065:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_TargetInformation {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6070:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_TokenBinding {
//     pub MajorVersion: u8,
//     pub MinorVersion: u8,
//     pub KeyParametersSize: u16,
//     pub KeyParameters: *mut u8,
// }

// UNSUPPORTED Rust 6078:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_TokenBinding {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6083:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_UiInfo {
//     pub hParentWindow: super::super::super::Foundation::HWND,
// }

// UNSUPPORTED Rust 6088:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_UiInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6093:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SecPkgContext_UserFlags {
//     pub UserFlags: u32,
// }

public const val `SecPkgCredClass_Ephemeral`: `SECPKG_CRED_CLASS` = 10;
public const val `SecPkgCredClass_Explicit`: `SECPKG_CRED_CLASS` = 40;
public const val `SecPkgCredClass_None`: `SECPKG_CRED_CLASS` = 0;
public const val `SecPkgCredClass_PersistedGeneric`: `SECPKG_CRED_CLASS` = 20;
public const val `SecPkgCredClass_PersistedSpecific`: `SECPKG_CRED_CLASS` = 30;
// UNSUPPORTED Rust 6103:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SecPkgCred_CipherStrengths {
//     pub dwMinimumCipherStrength: u32,
//     pub dwMaximumCipherStrength: u32,
// }

// UNSUPPORTED Rust 6109:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgCred_ClientCertPolicy {
//     pub dwFlags: u32,
//     pub guidPolicyId: windows_sys::core::GUID,
//     pub dwCertFlags: u32,
//     pub dwUrlRetrievalTimeout: u32,
//     pub fCheckRevocationFreshnessTime: windows_sys::core::BOOL,
//     pub dwRevocationFreshnessTime: u32,
//     pub fOmitUsageCheck: windows_sys::core::BOOL,
//     pub pwszSslCtlStoreName: windows_sys::core::PWSTR,
//     pub pwszSslCtlIdentifier: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 6122:1: declaration Impl has no candidate rule
// impl Default for SecPkgCred_ClientCertPolicy {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6127:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgCred_SessionTicketKey {
//     pub TicketInfoVersion: u32,
//     pub KeyId: [u8; 16],
//     pub KeyingMaterial: [u8; 64],
//     pub KeyingMaterialSize: u8,
// }

// UNSUPPORTED Rust 6135:1: declaration Impl has no candidate rule
// impl Default for SecPkgCred_SessionTicketKey {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6140:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgCred_SessionTicketKeys {
//     pub cSessionTicketKeys: u32,
//     pub pSessionTicketKeys: *mut SecPkgCred_SessionTicketKey,
// }

// UNSUPPORTED Rust 6146:1: declaration Impl has no candidate rule
// impl Default for SecPkgCred_SessionTicketKeys {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6151:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct SecPkgCred_SupportedAlgs {
//     pub cSupportedAlgs: u32,
//     pub palgSupportedAlgs: *mut super::super::Cryptography::ALG_ID,
// }

// UNSUPPORTED Rust 6158:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SecPkgCred_SupportedAlgs {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6164:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SecPkgCred_SupportedProtocols {
//     pub grbitProtocol: u32,
// }

// UNSUPPORTED Rust 6169:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgCredentials_Cert {
//     pub EncodedCertSize: u32,
//     pub EncodedCert: *mut u8,
// }

// UNSUPPORTED Rust 6175:1: declaration Impl has no candidate rule
// impl Default for SecPkgCredentials_Cert {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6180:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SecPkgCredentials_KdcProxySettingsW {
//     pub Version: u32,
//     pub Flags: u32,
//     pub ProxyServerOffset: u16,
//     pub ProxyServerLength: u16,
//     pub ClientTlsCredOffset: u16,
//     pub ClientTlsCredLength: u16,
// }

// UNSUPPORTED Rust 6190:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgCredentials_NamesA {
//     pub sUserName: *mut i8,
// }

// UNSUPPORTED Rust 6195:1: declaration Impl has no candidate rule
// impl Default for SecPkgCredentials_NamesA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6200:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgCredentials_NamesW {
//     pub sUserName: *mut u16,
// }

// UNSUPPORTED Rust 6205:1: declaration Impl has no candidate rule
// impl Default for SecPkgCredentials_NamesW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6210:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgCredentials_SSIProviderA {
//     pub sProviderName: *mut i8,
//     pub ProviderInfoLength: u32,
//     pub ProviderInfo: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 6217:1: declaration Impl has no candidate rule
// impl Default for SecPkgCredentials_SSIProviderA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6222:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgCredentials_SSIProviderW {
//     pub sProviderName: *mut u16,
//     pub ProviderInfoLength: u32,
//     pub ProviderInfo: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 6229:1: declaration Impl has no candidate rule
// impl Default for SecPkgCredentials_SSIProviderW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6234:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgInfoA {
//     pub fCapabilities: u32,
//     pub wVersion: u16,
//     pub wRPCID: u16,
//     pub cbMaxToken: u32,
//     pub Name: *mut i8,
//     pub Comment: *mut i8,
// }

// UNSUPPORTED Rust 6244:1: declaration Impl has no candidate rule
// impl Default for SecPkgInfoA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6249:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgInfoW {
//     pub fCapabilities: u32,
//     pub wVersion: u16,
//     pub wRPCID: u16,
//     pub cbMaxToken: u32,
//     pub Name: *mut u16,
//     pub Comment: *mut u16,
// }

// UNSUPPORTED Rust 6259:1: declaration Impl has no candidate rule
// impl Default for SecPkgInfoW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SecService`: `SecDelegationType` = 1;
public const val `SecSessionPrimaryCred`: `SECPKG_SESSIONINFO_TYPE` = 0;
public const val `SecTrafficSecret_Client`: `SEC_TRAFFIC_SECRET_TYPE` = 1;
public const val `SecTrafficSecret_None`: `SEC_TRAFFIC_SECRET_TYPE` = 0;
public const val `SecTrafficSecret_Server`: `SEC_TRAFFIC_SECRET_TYPE` = 2;
public const val `SecTree`: `SecDelegationType` = 2;
public const val `SecpkgContextThunks`: `SECPKG_EXTENDED_INFORMATION_CLASS` = 2;
public const val `SecpkgExtraOids`: `SECPKG_EXTENDED_INFORMATION_CLASS` = 5;
public const val `SecpkgGssInfo`: `SECPKG_EXTENDED_INFORMATION_CLASS` = 1;
public const val `SecpkgMaxInfo`: `SECPKG_EXTENDED_INFORMATION_CLASS` = 6;
public const val `SecpkgMutualAuthLevel`: `SECPKG_EXTENDED_INFORMATION_CLASS` = 3;
public const val `SecpkgNego2Info`: `SECPKG_EXTENDED_INFORMATION_CLASS` = 7;
public const val `SecpkgWowClientDll`: `SECPKG_EXTENDED_INFORMATION_CLASS` = 4;
// UNSUPPORTED Rust 6277:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Credentials")]
// #[derive(Clone, Copy)]
// pub struct SecurityFunctionTableA {
//     pub dwVersion: u32,
//     pub EnumerateSecurityPackagesA: ENUMERATE_SECURITY_PACKAGES_FN_A,
//     pub QueryCredentialsAttributesA: QUERY_CREDENTIALS_ATTRIBUTES_FN_A,
//     pub AcquireCredentialsHandleA: ACQUIRE_CREDENTIALS_HANDLE_FN_A,
//     pub FreeCredentialsHandle: FREE_CREDENTIALS_HANDLE_FN,
//     pub Reserved2: *mut core::ffi::c_void,
//     pub InitializeSecurityContextA: INITIALIZE_SECURITY_CONTEXT_FN_A,
//     pub AcceptSecurityContext: ACCEPT_SECURITY_CONTEXT_FN,
//     pub CompleteAuthToken: COMPLETE_AUTH_TOKEN_FN,
//     pub DeleteSecurityContext: DELETE_SECURITY_CONTEXT_FN,
//     pub ApplyControlToken: APPLY_CONTROL_TOKEN_FN,
//     pub QueryContextAttributesA: QUERY_CONTEXT_ATTRIBUTES_FN_A,
//     pub ImpersonateSecurityContext: IMPERSONATE_SECURITY_CONTEXT_FN,
//     pub RevertSecurityContext: REVERT_SECURITY_CONTEXT_FN,
//     pub MakeSignature: MAKE_SIGNATURE_FN,
//     pub VerifySignature: VERIFY_SIGNATURE_FN,
//     pub FreeContextBuffer: FREE_CONTEXT_BUFFER_FN,
//     pub QuerySecurityPackageInfoA: QUERY_SECURITY_PACKAGE_INFO_FN_A,
//     pub Reserved3: *mut core::ffi::c_void,
//     pub Reserved4: *mut core::ffi::c_void,
//     pub ExportSecurityContext: EXPORT_SECURITY_CONTEXT_FN,
//     pub ImportSecurityContextA: IMPORT_SECURITY_CONTEXT_FN_A,
//     pub AddCredentialsA: ADD_CREDENTIALS_FN_A,
//     pub Reserved8: *mut core::ffi::c_void,
//     pub QuerySecurityContextToken: QUERY_SECURITY_CONTEXT_TOKEN_FN,
//     pub EncryptMessage: ENCRYPT_MESSAGE_FN,
//     pub DecryptMessage: DECRYPT_MESSAGE_FN,
//     pub SetContextAttributesA: SET_CONTEXT_ATTRIBUTES_FN_A,
//     pub SetCredentialsAttributesA: SET_CREDENTIALS_ATTRIBUTES_FN_A,
//     pub ChangeAccountPasswordA: CHANGE_PASSWORD_FN_A,
//     pub QueryContextAttributesExA: QUERY_CONTEXT_ATTRIBUTES_EX_FN_A,
//     pub QueryCredentialsAttributesExA: QUERY_CREDENTIALS_ATTRIBUTES_EX_FN_A,
// }

// UNSUPPORTED Rust 6314:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// impl Default for SecurityFunctionTableA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6320:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Credentials")]
// #[derive(Clone, Copy)]
// pub struct SecurityFunctionTableW {
//     pub dwVersion: u32,
//     pub EnumerateSecurityPackagesW: ENUMERATE_SECURITY_PACKAGES_FN_W,
//     pub QueryCredentialsAttributesW: QUERY_CREDENTIALS_ATTRIBUTES_FN_W,
//     pub AcquireCredentialsHandleW: ACQUIRE_CREDENTIALS_HANDLE_FN_W,
//     pub FreeCredentialsHandle: FREE_CREDENTIALS_HANDLE_FN,
//     pub Reserved2: *mut core::ffi::c_void,
//     pub InitializeSecurityContextW: INITIALIZE_SECURITY_CONTEXT_FN_W,
//     pub AcceptSecurityContext: ACCEPT_SECURITY_CONTEXT_FN,
//     pub CompleteAuthToken: COMPLETE_AUTH_TOKEN_FN,
//     pub DeleteSecurityContext: DELETE_SECURITY_CONTEXT_FN,
//     pub ApplyControlToken: APPLY_CONTROL_TOKEN_FN,
//     pub QueryContextAttributesW: QUERY_CONTEXT_ATTRIBUTES_FN_W,
//     pub ImpersonateSecurityContext: IMPERSONATE_SECURITY_CONTEXT_FN,
//     pub RevertSecurityContext: REVERT_SECURITY_CONTEXT_FN,
//     pub MakeSignature: MAKE_SIGNATURE_FN,
//     pub VerifySignature: VERIFY_SIGNATURE_FN,
//     pub FreeContextBuffer: FREE_CONTEXT_BUFFER_FN,
//     pub QuerySecurityPackageInfoW: QUERY_SECURITY_PACKAGE_INFO_FN_W,
//     pub Reserved3: *mut core::ffi::c_void,
//     pub Reserved4: *mut core::ffi::c_void,
//     pub ExportSecurityContext: EXPORT_SECURITY_CONTEXT_FN,
//     pub ImportSecurityContextW: IMPORT_SECURITY_CONTEXT_FN_W,
//     pub AddCredentialsW: ADD_CREDENTIALS_FN_W,
//     pub Reserved8: *mut core::ffi::c_void,
//     pub QuerySecurityContextToken: QUERY_SECURITY_CONTEXT_TOKEN_FN,
//     pub EncryptMessage: ENCRYPT_MESSAGE_FN,
//     pub DecryptMessage: DECRYPT_MESSAGE_FN,
//     pub SetContextAttributesW: SET_CONTEXT_ATTRIBUTES_FN_W,
//     pub SetCredentialsAttributesW: SET_CREDENTIALS_ATTRIBUTES_FN_W,
//     pub ChangeAccountPasswordW: CHANGE_PASSWORD_FN_W,
//     pub QueryContextAttributesExW: QUERY_CONTEXT_ATTRIBUTES_EX_FN_W,
//     pub QueryCredentialsAttributesExW: QUERY_CREDENTIALS_ATTRIBUTES_EX_FN_W,
// }

// UNSUPPORTED Rust 6357:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Credentials")]
// impl Default for SecurityFunctionTableW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6363:1: generic scalar type unsupported
// pub type SpAcceptCredentialsFn = Option<unsafe extern "system" fn(logontype: SECURITY_LOGON_TYPE, accountname: *const LSA_UNICODE_STRING, primarycredentials: *const SECPKG_PRIMARY_CRED, supplementalcredentials: *const SECPKG_SUPPLEMENTAL_CRED) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6364:1: generic scalar type unsupported
// pub type SpAcceptLsaModeContextFn = Option<unsafe extern "system" fn(credentialhandle: usize, contexthandle: usize, inputbuffer: *const SecBufferDesc, contextrequirements: u32, targetdatarep: u32, newcontexthandle: *mut usize, outputbuffer: *mut SecBufferDesc, contextattributes: *mut u32, expirationtime: *mut i64, mappedcontext: *mut bool, contextdata: *mut SecBuffer) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6365:1: generic scalar type unsupported
// pub type SpAcquireCredentialsHandleFn = Option<unsafe extern "system" fn(principalname: *const LSA_UNICODE_STRING, credentialuseflags: u32, logonid: *const super::super::super::Foundation::LUID, authorizationdata: *const core::ffi::c_void, getkeyfunciton: *const core::ffi::c_void, getkeyargument: *const core::ffi::c_void, credentialhandle: *mut usize, expirationtime: *mut i64) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6366:1: generic scalar type unsupported
// pub type SpAddCredentialsFn = Option<unsafe extern "system" fn(credentialhandle: usize, principalname: *const LSA_UNICODE_STRING, package: *const LSA_UNICODE_STRING, credentialuseflags: u32, authorizationdata: *const core::ffi::c_void, getkeyfunciton: *const core::ffi::c_void, getkeyargument: *const core::ffi::c_void, expirationtime: *mut i64) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6367:1: generic scalar type unsupported
// pub type SpApplyControlTokenFn = Option<unsafe extern "system" fn(contexthandle: usize, controltoken: *const SecBufferDesc) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6368:1: generic scalar type unsupported
// pub type SpChangeAccountPasswordFn = Option<unsafe extern "system" fn(pdomainname: *const LSA_UNICODE_STRING, paccountname: *const LSA_UNICODE_STRING, poldpassword: *const LSA_UNICODE_STRING, pnewpassword: *const LSA_UNICODE_STRING, impersonating: bool, poutput: *mut SecBufferDesc) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6369:1: generic scalar type unsupported
// pub type SpCompleteAuthTokenFn = Option<unsafe extern "system" fn(contexthandle: usize, inputbuffer: *const SecBufferDesc) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6370:1: generic scalar type unsupported
// pub type SpDeleteContextFn = Option<unsafe extern "system" fn(contexthandle: usize) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6371:1: generic scalar type unsupported
// pub type SpDeleteCredentialsFn = Option<unsafe extern "system" fn(credentialhandle: usize, key: *const SecBuffer) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6372:1: generic scalar type unsupported
// pub type SpExchangeMetaDataFn = Option<unsafe extern "system" fn(credentialhandle: usize, targetname: *const LSA_UNICODE_STRING, contextrequirements: u32, metadatalength: u32, metadata: *const u8, contexthandle: *mut usize) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6373:1: generic scalar type unsupported
// pub type SpExportSecurityContextFn = Option<unsafe extern "system" fn(phcontext: usize, fflags: u32, ppackedcontext: *mut SecBuffer, ptoken: *mut super::super::super::Foundation::HANDLE) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6374:1: generic scalar type unsupported
// pub type SpExtractTargetInfoFn = Option<unsafe extern "system" fn(clientrequest: *const *const core::ffi::c_void, protocolsubmitbuffer: *const core::ffi::c_void, clientbufferbase: *const core::ffi::c_void, submitbufferlength: u32, ppvtargetinfo: *mut *mut core::ffi::c_void, pcbtargetinfo: *mut u32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6375:1: generic scalar type unsupported
// pub type SpFormatCredentialsFn = Option<unsafe extern "system" fn(credentials: *const SecBuffer, formattedcredentials: *mut SecBuffer) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6376:1: generic scalar type unsupported
// pub type SpFreeCredentialsHandleFn = Option<unsafe extern "system" fn(credentialhandle: usize) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6377:1: generic scalar type unsupported
// pub type SpGetContextTokenFn = Option<unsafe extern "system" fn(contexthandle: usize, impersonationtoken: *mut super::super::super::Foundation::HANDLE) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6378:1: generic scalar type unsupported
// pub type SpGetCredUIContextFn = Option<unsafe extern "system" fn(contexthandle: usize, credtype: *const windows_sys::core::GUID, flatcreduicontextlength: *mut u32, flatcreduicontext: *mut *mut u8) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6379:1: generic scalar type unsupported
// pub type SpGetCredentialsFn = Option<unsafe extern "system" fn(credentialhandle: usize, credentials: *mut SecBuffer) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6380:1: generic scalar type unsupported
// pub type SpGetExtendedInformationFn = Option<unsafe extern "system" fn(class: SECPKG_EXTENDED_INFORMATION_CLASS, ppinformation: *mut *mut SECPKG_EXTENDED_INFORMATION) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6381:1: generic scalar type unsupported
// pub type SpGetInfoFn = Option<unsafe extern "system" fn(packageinfo: *mut SecPkgInfoA) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6382:1: generic scalar type unsupported
// pub type SpGetRemoteCredGuardLogonBufferFn = Option<unsafe extern "system" fn(credhandle: usize, contexthandle: usize, targetname: *const LSA_UNICODE_STRING, redirectedlogonhandle: *mut super::super::super::Foundation::HANDLE, callback: *mut PLSA_REDIRECTED_LOGON_CALLBACK, cleanupcallback: *mut PLSA_REDIRECTED_LOGON_CLEANUP_CALLBACK, logonbuffersize: *mut u32, logonbuffer: *mut *mut core::ffi::c_void) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6383:1: generic scalar type unsupported
// pub type SpGetRemoteCredGuardSupplementalCredsFn = Option<unsafe extern "system" fn(credhandle: usize, targetname: *const LSA_UNICODE_STRING, redirectedlogonhandle: *mut super::super::super::Foundation::HANDLE, callback: *mut PLSA_REDIRECTED_LOGON_CALLBACK, cleanupcallback: *mut PLSA_REDIRECTED_LOGON_CLEANUP_CALLBACK, supplementalcredssize: *mut u32, supplementalcreds: *mut *mut core::ffi::c_void) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6384:1: generic scalar type unsupported
// pub type SpGetTbalSupplementalCredsFn = Option<unsafe extern "system" fn(logonid: super::super::super::Foundation::LUID, supplementalcredssize: *mut u32, supplementalcreds: *mut *mut core::ffi::c_void) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6385:1: generic scalar type unsupported
// pub type SpGetUserInfoFn = Option<unsafe extern "system" fn(logonid: *const super::super::super::Foundation::LUID, flags: u32, userdata: *mut *mut SECURITY_USER_DATA) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6386:1: generic scalar type unsupported
// pub type SpImportSecurityContextFn = Option<unsafe extern "system" fn(ppackedcontext: *const SecBuffer, token: super::super::super::Foundation::HANDLE, phcontext: *mut usize) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6387:1: generic scalar type unsupported
// pub type SpInitLsaModeContextFn = Option<unsafe extern "system" fn(credentialhandle: usize, contexthandle: usize, targetname: *const LSA_UNICODE_STRING, contextrequirements: u32, targetdatarep: u32, inputbuffers: *const SecBufferDesc, newcontexthandle: *mut usize, outputbuffers: *mut SecBufferDesc, contextattributes: *mut u32, expirationtime: *mut i64, mappedcontext: *mut bool, contextdata: *mut SecBuffer) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6388:1: generic scalar type unsupported
// pub type SpInitUserModeContextFn = Option<unsafe extern "system" fn(contexthandle: usize, packedcontext: *const SecBuffer) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6389:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Security_Credentials", feature = "Win32_System_Threading"))]
// pub type SpInitializeFn = Option<unsafe extern "system" fn(packageid: usize, parameters: *const SECPKG_PARAMETERS, functiontable: *const LSA_SECPKG_FUNCTION_TABLE) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6391:1: generic scalar type unsupported
// pub type SpInstanceInitFn = Option<unsafe extern "system" fn(version: u32, functiontable: *const SECPKG_DLL_FUNCTIONS, userfunctions: *mut *mut core::ffi::c_void) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6392:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Security_Credentials", feature = "Win32_System_Threading"))]
// pub type SpLsaModeInitializeFn = Option<unsafe extern "system" fn(lsaversion: u32, packageversion: *mut u32, pptables: *mut *mut SECPKG_FUNCTION_TABLE, pctables: *mut u32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6394:1: generic scalar type unsupported
// pub type SpMakeSignatureFn = Option<unsafe extern "system" fn(contexthandle: usize, qualityofprotection: u32, messagebuffers: *const SecBufferDesc, messagesequencenumber: u32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6395:1: generic scalar type unsupported
// pub type SpMarshalAttributeDataFn = Option<unsafe extern "system" fn(attributeinfo: u32, attribute: u32, attributedatasize: u32, attributedata: *const u8, marshaledattributedatasize: *mut u32, marshaledattributedata: *mut *mut u8) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6396:1: generic scalar type unsupported
// pub type SpMarshallSupplementalCredsFn = Option<unsafe extern "system" fn(credentialsize: u32, credentials: *const u8, marshalledcredsize: *mut u32, marshalledcreds: *mut *mut core::ffi::c_void) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6397:1: generic scalar type unsupported
// pub type SpQueryContextAttributesFn = Option<unsafe extern "system" fn(contexthandle: usize, contextattribute: u32, buffer: *mut core::ffi::c_void) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6398:1: generic scalar type unsupported
// pub type SpQueryCredentialsAttributesFn = Option<unsafe extern "system" fn(credentialhandle: usize, credentialattribute: u32, buffer: *mut core::ffi::c_void) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6399:1: generic scalar type unsupported
// pub type SpQueryMetaDataFn = Option<unsafe extern "system" fn(credentialhandle: usize, targetname: *const LSA_UNICODE_STRING, contextrequirements: u32, metadatalength: *mut u32, metadata: *mut *mut u8, contexthandle: *mut usize) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6400:1: generic scalar type unsupported
// pub type SpSaveCredentialsFn = Option<unsafe extern "system" fn(credentialhandle: usize, credentials: *const SecBuffer) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6401:1: generic scalar type unsupported
// pub type SpSealMessageFn = Option<unsafe extern "system" fn(contexthandle: usize, qualityofprotection: u32, messagebuffers: *const SecBufferDesc, messagesequencenumber: u32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6402:1: generic scalar type unsupported
// pub type SpSetContextAttributesFn = Option<unsafe extern "system" fn(contexthandle: usize, contextattribute: u32, buffer: *const core::ffi::c_void, buffersize: u32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6403:1: generic scalar type unsupported
// pub type SpSetCredentialsAttributesFn = Option<unsafe extern "system" fn(credentialhandle: usize, credentialattribute: u32, buffer: *const core::ffi::c_void, buffersize: u32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6404:1: generic scalar type unsupported
// pub type SpSetExtendedInformationFn = Option<unsafe extern "system" fn(class: SECPKG_EXTENDED_INFORMATION_CLASS, info: *const SECPKG_EXTENDED_INFORMATION) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6405:1: generic scalar type unsupported
// pub type SpShutdownFn = Option<unsafe extern "system" fn() -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6406:1: generic scalar type unsupported
// pub type SpUnsealMessageFn = Option<unsafe extern "system" fn(contexthandle: usize, messagebuffers: *const SecBufferDesc, messagesequencenumber: u32, qualityofprotection: *mut u32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6407:1: generic scalar type unsupported
// pub type SpUpdateCredentialsFn = Option<unsafe extern "system" fn(contexthandle: usize, credtype: *const windows_sys::core::GUID, flatcreduicontextlength: u32, flatcreduicontext: *const u8) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6408:1: generic scalar type unsupported
// pub type SpUserModeInitializeFn = Option<unsafe extern "system" fn(lsaversion: u32, packageversion: *mut u32, pptables: *mut *mut SECPKG_USER_FUNCTION_TABLE, pctables: *mut u32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6409:1: generic scalar type unsupported
// pub type SpValidateTargetInfoFn = Option<unsafe extern "system" fn(clientrequest: *const *const core::ffi::c_void, protocolsubmitbuffer: *const core::ffi::c_void, clientbufferbase: *const core::ffi::c_void, submitbufferlength: u32, targetinfo: *const SECPKG_TARGETINFO) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6410:1: generic scalar type unsupported
// pub type SpVerifySignatureFn = Option<unsafe extern "system" fn(contexthandle: usize, messagebuffers: *const SecBufferDesc, messagesequencenumber: u32, qualityofprotection: *mut u32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 6411:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Cryptography")]
// pub type SslDeserializeCertificateStoreFn = Option<unsafe extern "system" fn(serializedcertificatestore: super::super::Cryptography::CRYPT_INTEGER_BLOB, ppcertcontext: *mut *mut super::super::Cryptography::CERT_CONTEXT) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 6413:1: generic scalar type unsupported
// pub type SslGetExtensionsFn = Option<unsafe extern "system" fn(clienthello: *const u8, clienthellobytesize: u32, genericextensions: *mut SCH_EXTENSION_DATA, genericextensionscount: u8, bytestoread: *mut u32, flags: SchGetExtensionsOptions) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 6414:1: generic scalar type unsupported
// pub type SslGetServerIdentityFn = Option<unsafe extern "system" fn(clienthello: *const u8, clienthellosize: u32, serveridentity: *mut *mut u8, serveridentitysize: *mut u32, flags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 6415:1: non-scalar type Ptr unsupported
// pub const TLS1SP_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft TLS 1.0");

// UNSUPPORTED Rust 6416:1: non-scalar type Ptr unsupported
// pub const TLS1SP_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("Microsoft TLS 1.0");

// UNSUPPORTED Rust 6417:1: non-scalar type Ptr unsupported
// pub const TLS1SP_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft TLS 1.0");

public const val `TLS1_ALERT_ACCESS_DENIED`: UInt = 49u;
public const val `TLS1_ALERT_BAD_CERTIFICATE`: UInt = 42u;
public const val `TLS1_ALERT_BAD_RECORD_MAC`: UInt = 20u;
public const val `TLS1_ALERT_CERTIFICATE_EXPIRED`: UInt = 45u;
public const val `TLS1_ALERT_CERTIFICATE_REVOKED`: UInt = 44u;
public const val `TLS1_ALERT_CERTIFICATE_UNKNOWN`: UInt = 46u;
public const val `TLS1_ALERT_CLOSE_NOTIFY`: UInt = 0u;
public const val `TLS1_ALERT_DECODE_ERROR`: UInt = 50u;
public const val `TLS1_ALERT_DECOMPRESSION_FAIL`: UInt = 30u;
public const val `TLS1_ALERT_DECRYPTION_FAILED`: UInt = 21u;
public const val `TLS1_ALERT_DECRYPT_ERROR`: UInt = 51u;
public const val `TLS1_ALERT_EXPORT_RESTRICTION`: UInt = 60u;
public const val `TLS1_ALERT_FATAL`: `SCHANNEL_ALERT_TOKEN_ALERT_TYPE` = 2u;
public const val `TLS1_ALERT_HANDSHAKE_FAILURE`: UInt = 40u;
public const val `TLS1_ALERT_ILLEGAL_PARAMETER`: UInt = 47u;
public const val `TLS1_ALERT_INSUFFIENT_SECURITY`: UInt = 71u;
public const val `TLS1_ALERT_INTERNAL_ERROR`: UInt = 80u;
public const val `TLS1_ALERT_NO_APP_PROTOCOL`: UInt = 120u;
public const val `TLS1_ALERT_NO_RENEGOTIATION`: UInt = 100u;
public const val `TLS1_ALERT_PROTOCOL_VERSION`: UInt = 70u;
public const val `TLS1_ALERT_RECORD_OVERFLOW`: UInt = 22u;
public const val `TLS1_ALERT_UNEXPECTED_MESSAGE`: UInt = 10u;
public const val `TLS1_ALERT_UNKNOWN_CA`: UInt = 48u;
public const val `TLS1_ALERT_UNKNOWN_PSK_IDENTITY`: UInt = 115u;
public const val `TLS1_ALERT_UNSUPPORTED_CERT`: UInt = 43u;
public const val `TLS1_ALERT_UNSUPPORTED_EXT`: UInt = 110u;
public const val `TLS1_ALERT_USER_CANCELED`: UInt = 90u;
public const val `TLS1_ALERT_WARNING`: `SCHANNEL_ALERT_TOKEN_ALERT_TYPE` = 1u;
// UNSUPPORTED Rust 6446:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TLS_EXTENSION_SUBSCRIPTION {
//     pub ExtensionType: u16,
//     pub HandshakeType: u16,
// }

// UNSUPPORTED Rust 6452:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TLS_PARAMETERS {
//     pub cAlpnIds: u32,
//     pub rgstrAlpnIds: *mut LSA_UNICODE_STRING,
//     pub grbitDisabledProtocols: u32,
//     pub cDisabledCrypto: u32,
//     pub pDisabledCrypto: *mut CRYPTO_SETTINGS,
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 6462:1: declaration Impl has no candidate rule
// impl Default for TLS_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TLS_PARAMS_OPTIONAL`: UInt = 1u;
public typealias `TOKENBINDING_EXTENSION_FORMAT` = Int;
public const val `TOKENBINDING_EXTENSION_FORMAT_UNDEFINED`: `TOKENBINDING_EXTENSION_FORMAT` = 0;
// UNSUPPORTED Rust 6470:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TOKENBINDING_IDENTIFIER {
//     pub keyType: u8,
// }

public typealias `TOKENBINDING_KEY_PARAMETERS_TYPE` = Int;
public const val `TOKENBINDING_KEY_PARAMETERS_TYPE_ANYEXISTING`: `TOKENBINDING_KEY_PARAMETERS_TYPE` = 255;
public const val `TOKENBINDING_KEY_PARAMETERS_TYPE_ECDSAP256`: `TOKENBINDING_KEY_PARAMETERS_TYPE` = 2;
public const val `TOKENBINDING_KEY_PARAMETERS_TYPE_RSA2048_PKCS`: `TOKENBINDING_KEY_PARAMETERS_TYPE` = 0;
public const val `TOKENBINDING_KEY_PARAMETERS_TYPE_RSA2048_PSS`: `TOKENBINDING_KEY_PARAMETERS_TYPE` = 1;
// UNSUPPORTED Rust 6480:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TOKENBINDING_KEY_TYPES {
//     pub keyCount: u32,
//     pub keyType: *mut TOKENBINDING_KEY_PARAMETERS_TYPE,
// }

// UNSUPPORTED Rust 6486:1: declaration Impl has no candidate rule
// impl Default for TOKENBINDING_KEY_TYPES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6491:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TOKENBINDING_RESULT_DATA {
//     pub bindingType: TOKENBINDING_TYPE,
//     pub identifierSize: u32,
//     pub identifierData: *mut TOKENBINDING_IDENTIFIER,
//     pub extensionFormat: TOKENBINDING_EXTENSION_FORMAT,
//     pub extensionSize: u32,
//     pub extensionData: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 6501:1: declaration Impl has no candidate rule
// impl Default for TOKENBINDING_RESULT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6506:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TOKENBINDING_RESULT_LIST {
//     pub resultCount: u32,
//     pub resultData: *mut TOKENBINDING_RESULT_DATA,
// }

// UNSUPPORTED Rust 6512:1: declaration Impl has no candidate rule
// impl Default for TOKENBINDING_RESULT_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `TOKENBINDING_TYPE` = Int;
public const val `TOKENBINDING_TYPE_PROVIDED`: `TOKENBINDING_TYPE` = 0;
public const val `TOKENBINDING_TYPE_REFERRED`: `TOKENBINDING_TYPE` = 1;
// UNSUPPORTED Rust 6520:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TRUSTED_CONTROLLERS_INFO {
//     pub Entries: u32,
//     pub Names: *mut LSA_UNICODE_STRING,
// }

// UNSUPPORTED Rust 6526:1: declaration Impl has no candidate rule
// impl Default for TRUSTED_CONTROLLERS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6531:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TRUSTED_DOMAIN_AUTH_INFORMATION {
//     pub IncomingAuthInfos: u32,
//     pub IncomingAuthenticationInformation: *mut LSA_AUTH_INFORMATION,
//     pub IncomingPreviousAuthenticationInformation: *mut LSA_AUTH_INFORMATION,
//     pub OutgoingAuthInfos: u32,
//     pub OutgoingAuthenticationInformation: *mut LSA_AUTH_INFORMATION,
//     pub OutgoingPreviousAuthenticationInformation: *mut LSA_AUTH_INFORMATION,
// }

// UNSUPPORTED Rust 6541:1: declaration Impl has no candidate rule
// impl Default for TRUSTED_DOMAIN_AUTH_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6546:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TRUSTED_DOMAIN_FULL_INFORMATION {
//     pub Information: TRUSTED_DOMAIN_INFORMATION_EX,
//     pub PosixOffset: TRUSTED_POSIX_OFFSET_INFO,
//     pub AuthInformation: TRUSTED_DOMAIN_AUTH_INFORMATION,
// }

// UNSUPPORTED Rust 6553:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TRUSTED_DOMAIN_FULL_INFORMATION2 {
//     pub Information: TRUSTED_DOMAIN_INFORMATION_EX2,
//     pub PosixOffset: TRUSTED_POSIX_OFFSET_INFO,
//     pub AuthInformation: TRUSTED_DOMAIN_AUTH_INFORMATION,
// }

// UNSUPPORTED Rust 6560:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TRUSTED_DOMAIN_INFORMATION_EX {
//     pub Name: LSA_UNICODE_STRING,
//     pub FlatName: LSA_UNICODE_STRING,
//     pub Sid: super::super::PSID,
//     pub TrustDirection: TRUSTED_DOMAIN_TRUST_DIRECTION,
//     pub TrustType: TRUSTED_DOMAIN_TRUST_TYPE,
//     pub TrustAttributes: TRUSTED_DOMAIN_TRUST_ATTRIBUTES,
// }

// UNSUPPORTED Rust 6570:1: declaration Impl has no candidate rule
// impl Default for TRUSTED_DOMAIN_INFORMATION_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6575:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TRUSTED_DOMAIN_INFORMATION_EX2 {
//     pub Name: LSA_UNICODE_STRING,
//     pub FlatName: LSA_UNICODE_STRING,
//     pub Sid: super::super::PSID,
//     pub TrustDirection: u32,
//     pub TrustType: u32,
//     pub TrustAttributes: u32,
//     pub ForestTrustLength: u32,
//     pub ForestTrustInfo: *mut u8,
// }

// UNSUPPORTED Rust 6587:1: declaration Impl has no candidate rule
// impl Default for TRUSTED_DOMAIN_INFORMATION_EX2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6592:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TRUSTED_DOMAIN_NAME_INFO {
//     pub Name: LSA_UNICODE_STRING,
// }

// UNSUPPORTED Rust 6597:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TRUSTED_DOMAIN_SUPPORTED_ENCRYPTION_TYPES {
//     pub SupportedEncryptionTypes: u32,
// }

public typealias `TRUSTED_DOMAIN_TRUST_ATTRIBUTES` = UInt;
public typealias `TRUSTED_DOMAIN_TRUST_DIRECTION` = UInt;
public typealias `TRUSTED_DOMAIN_TRUST_TYPE` = UInt;
public typealias `TRUSTED_INFORMATION_CLASS` = Int;
// UNSUPPORTED Rust 6606:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TRUSTED_PASSWORD_INFO {
//     pub Password: LSA_UNICODE_STRING,
//     pub OldPassword: LSA_UNICODE_STRING,
// }

// UNSUPPORTED Rust 6612:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TRUSTED_POSIX_OFFSET_INFO {
//     pub Offset: u32,
// }

public const val `TRUSTED_QUERY_AUTH`: Int = 64;
public const val `TRUSTED_QUERY_CONTROLLERS`: Int = 2;
public const val `TRUSTED_QUERY_DOMAIN_NAME`: Int = 1;
public const val `TRUSTED_QUERY_POSIX`: Int = 8;
public const val `TRUSTED_SET_AUTH`: Int = 32;
public const val `TRUSTED_SET_CONTROLLERS`: Int = 4;
public const val `TRUSTED_SET_POSIX`: Int = 16;
public const val `TRUST_ATTRIBUTES_USER`: UInt = 4278190080u;
public const val `TRUST_ATTRIBUTES_VALID`: UInt = 4278386687u;
public const val `TRUST_ATTRIBUTE_CROSS_ORGANIZATION`: `TRUSTED_DOMAIN_TRUST_ATTRIBUTES` = 16u;
public const val `TRUST_ATTRIBUTE_CROSS_ORGANIZATION_ENABLE_TGT_DELEGATION`: UInt = 2048u;
public const val `TRUST_ATTRIBUTE_CROSS_ORGANIZATION_NO_TGT_DELEGATION`: UInt = 512u;
public const val `TRUST_ATTRIBUTE_DISABLE_AUTH_TARGET_VALIDATION`: UInt = 4096u;
public const val `TRUST_ATTRIBUTE_FILTER_SIDS`: `TRUSTED_DOMAIN_TRUST_ATTRIBUTES` = 4u;
public const val `TRUST_ATTRIBUTE_FOREST_TRANSITIVE`: `TRUSTED_DOMAIN_TRUST_ATTRIBUTES` = 8u;
public const val `TRUST_ATTRIBUTE_NON_TRANSITIVE`: `TRUSTED_DOMAIN_TRUST_ATTRIBUTES` = 1u;
public const val `TRUST_ATTRIBUTE_PIM_TRUST`: UInt = 1024u;
public const val `TRUST_ATTRIBUTE_QUARANTINED_DOMAIN`: UInt = 4u;
public const val `TRUST_ATTRIBUTE_TREAT_AS_EXTERNAL`: `TRUSTED_DOMAIN_TRUST_ATTRIBUTES` = 64u;
public const val `TRUST_ATTRIBUTE_TREE_PARENT`: UInt = 4194304u;
public const val `TRUST_ATTRIBUTE_TREE_ROOT`: UInt = 8388608u;
public const val `TRUST_ATTRIBUTE_TRUST_USES_AES_KEYS`: UInt = 256u;
public const val `TRUST_ATTRIBUTE_TRUST_USES_RC4_ENCRYPTION`: UInt = 128u;
public const val `TRUST_ATTRIBUTE_UPLEVEL_ONLY`: `TRUSTED_DOMAIN_TRUST_ATTRIBUTES` = 2u;
public const val `TRUST_ATTRIBUTE_WITHIN_FOREST`: `TRUSTED_DOMAIN_TRUST_ATTRIBUTES` = 32u;
public const val `TRUST_AUTH_TYPE_CLEAR`: `LSA_AUTH_INFORMATION_AUTH_TYPE` = 2u;
public const val `TRUST_AUTH_TYPE_NONE`: `LSA_AUTH_INFORMATION_AUTH_TYPE` = 0u;
public const val `TRUST_AUTH_TYPE_NT4OWF`: `LSA_AUTH_INFORMATION_AUTH_TYPE` = 1u;
public const val `TRUST_AUTH_TYPE_VERSION`: `LSA_AUTH_INFORMATION_AUTH_TYPE` = 3u;
public const val `TRUST_DIRECTION_BIDIRECTIONAL`: `TRUSTED_DOMAIN_TRUST_DIRECTION` = 3u;
public const val `TRUST_DIRECTION_DISABLED`: `TRUSTED_DOMAIN_TRUST_DIRECTION` = 0u;
public const val `TRUST_DIRECTION_INBOUND`: `TRUSTED_DOMAIN_TRUST_DIRECTION` = 1u;
public const val `TRUST_DIRECTION_OUTBOUND`: `TRUSTED_DOMAIN_TRUST_DIRECTION` = 2u;
public const val `TRUST_TYPE_AAD`: UInt = 5u;
public const val `TRUST_TYPE_DCE`: `TRUSTED_DOMAIN_TRUST_TYPE` = 4u;
public const val `TRUST_TYPE_DOWNLEVEL`: `TRUSTED_DOMAIN_TRUST_TYPE` = 1u;
public const val `TRUST_TYPE_MIT`: `TRUSTED_DOMAIN_TRUST_TYPE` = 3u;
public const val `TRUST_TYPE_UPLEVEL`: `TRUSTED_DOMAIN_TRUST_TYPE` = 2u;
public const val `TlsHashAlgorithm_Md5`: `eTlsHashAlgorithm` = 1;
public const val `TlsHashAlgorithm_None`: `eTlsHashAlgorithm` = 0;
public const val `TlsHashAlgorithm_Sha1`: `eTlsHashAlgorithm` = 2;
public const val `TlsHashAlgorithm_Sha224`: `eTlsHashAlgorithm` = 3;
public const val `TlsHashAlgorithm_Sha256`: `eTlsHashAlgorithm` = 4;
public const val `TlsHashAlgorithm_Sha384`: `eTlsHashAlgorithm` = 5;
public const val `TlsHashAlgorithm_Sha512`: `eTlsHashAlgorithm` = 6;
public const val `TlsParametersCngAlgUsageCertSig`: `eTlsAlgorithmUsage` = 4;
public const val `TlsParametersCngAlgUsageCipher`: `eTlsAlgorithmUsage` = 2;
public const val `TlsParametersCngAlgUsageDigest`: `eTlsAlgorithmUsage` = 3;
public const val `TlsParametersCngAlgUsageKeyExchange`: `eTlsAlgorithmUsage` = 0;
public const val `TlsParametersCngAlgUsageSignature`: `eTlsAlgorithmUsage` = 1;
public const val `TlsSignatureAlgorithm_Anonymous`: `eTlsSignatureAlgorithm` = 0;
public const val `TlsSignatureAlgorithm_Dsa`: `eTlsSignatureAlgorithm` = 2;
public const val `TlsSignatureAlgorithm_Ecdsa`: `eTlsSignatureAlgorithm` = 3;
public const val `TlsSignatureAlgorithm_Rsa`: `eTlsSignatureAlgorithm` = 1;
public const val `TrustedControllersInformation`: `TRUSTED_INFORMATION_CLASS` = 2;
public const val `TrustedDomainAuthInformation`: `TRUSTED_INFORMATION_CLASS` = 7;
public const val `TrustedDomainAuthInformationInternal`: `TRUSTED_INFORMATION_CLASS` = 9;
public const val `TrustedDomainAuthInformationInternalAes`: `TRUSTED_INFORMATION_CLASS` = 14;
public const val `TrustedDomainFullInformation`: `TRUSTED_INFORMATION_CLASS` = 8;
public const val `TrustedDomainFullInformation2Internal`: `TRUSTED_INFORMATION_CLASS` = 12;
public const val `TrustedDomainFullInformationInternal`: `TRUSTED_INFORMATION_CLASS` = 10;
public const val `TrustedDomainFullInformationInternalAes`: `TRUSTED_INFORMATION_CLASS` = 15;
public const val `TrustedDomainInformationBasic`: `TRUSTED_INFORMATION_CLASS` = 5;
public const val `TrustedDomainInformationEx`: `TRUSTED_INFORMATION_CLASS` = 6;
public const val `TrustedDomainInformationEx2Internal`: `TRUSTED_INFORMATION_CLASS` = 11;
public const val `TrustedDomainNameInformation`: `TRUSTED_INFORMATION_CLASS` = 1;
public const val `TrustedDomainSupportedEncryptionTypes`: `TRUSTED_INFORMATION_CLASS` = 13;
public const val `TrustedPasswordInformation`: `TRUSTED_INFORMATION_CLASS` = 4;
public const val `TrustedPosixOffsetInformation`: `TRUSTED_INFORMATION_CLASS` = 3;
public const val `UNDERSTANDS_LONG_NAMES`: UInt = 1u;
// UNSUPPORTED Rust 6687:1: non-scalar type Ptr unsupported
// pub const UNISP_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Unified Security Protocol Provider");

// UNSUPPORTED Rust 6688:1: non-scalar type Ptr unsupported
// pub const UNISP_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("Microsoft Unified Security Protocol Provider");

// UNSUPPORTED Rust 6689:1: non-scalar type Ptr unsupported
// pub const UNISP_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Unified Security Protocol Provider");

public const val `UNISP_RPC_ID`: UInt = 14u;
public const val `USER_ACCOUNT_AUTO_LOCKED`: UInt = 1024u;
public const val `USER_ACCOUNT_DISABLED`: UInt = 1u;
// UNSUPPORTED Rust 6693:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct USER_ALL_INFORMATION {
//     pub LastLogon: i64,
//     pub LastLogoff: i64,
//     pub PasswordLastSet: i64,
//     pub AccountExpires: i64,
//     pub PasswordCanChange: i64,
//     pub PasswordMustChange: i64,
//     pub UserName: LSA_UNICODE_STRING,
//     pub FullName: LSA_UNICODE_STRING,
//     pub HomeDirectory: LSA_UNICODE_STRING,
//     pub HomeDirectoryDrive: LSA_UNICODE_STRING,
//     pub ScriptPath: LSA_UNICODE_STRING,
//     pub ProfilePath: LSA_UNICODE_STRING,
//     pub AdminComment: LSA_UNICODE_STRING,
//     pub WorkStations: LSA_UNICODE_STRING,
//     pub UserComment: LSA_UNICODE_STRING,
//     pub Parameters: LSA_UNICODE_STRING,
//     pub LmPassword: LSA_UNICODE_STRING,
//     pub NtPassword: LSA_UNICODE_STRING,
//     pub PrivateData: LSA_UNICODE_STRING,
//     pub SecurityDescriptor: SR_SECURITY_DESCRIPTOR,
//     pub UserId: u32,
//     pub PrimaryGroupId: u32,
//     pub UserAccountControl: u32,
//     pub WhichFields: u32,
//     pub LogonHours: LOGON_HOURS,
//     pub BadPasswordCount: u16,
//     pub LogonCount: u16,
//     pub CountryCode: u16,
//     pub CodePage: u16,
//     pub LmPasswordPresent: bool,
//     pub NtPasswordPresent: bool,
//     pub PasswordExpired: bool,
//     pub PrivateDataSensitive: bool,
// }

public const val `USER_ALL_PARAMETERS`: UInt = 2097152u;
public const val `USER_DONT_EXPIRE_PASSWORD`: UInt = 512u;
public const val `USER_DONT_REQUIRE_PREAUTH`: UInt = 65536u;
public const val `USER_ENCRYPTED_TEXT_PASSWORD_ALLOWED`: UInt = 2048u;
public const val `USER_HOME_DIRECTORY_REQUIRED`: UInt = 2u;
public const val `USER_INTERDOMAIN_TRUST_ACCOUNT`: UInt = 64u;
public const val `USER_MNS_LOGON_ACCOUNT`: UInt = 32u;
public const val `USER_NORMAL_ACCOUNT`: UInt = 16u;
public const val `USER_NOT_DELEGATED`: UInt = 16384u;
public const val `USER_NO_AUTH_DATA_REQUIRED`: UInt = 524288u;
public const val `USER_PARTIAL_SECRETS_ACCOUNT`: UInt = 1048576u;
public const val `USER_PASSWORD_EXPIRED`: UInt = 131072u;
public const val `USER_PASSWORD_NOT_REQUIRED`: UInt = 4u;
public const val `USER_SERVER_TRUST_ACCOUNT`: UInt = 256u;
// UNSUPPORTED Rust 6744:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_PasswordManagement")]
// #[derive(Clone, Copy)]
// pub struct USER_SESSION_KEY {
//     pub data: [super::super::super::System::PasswordManagement::CYPHER_BLOCK; 2],
// }

// UNSUPPORTED Rust 6750:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_PasswordManagement")]
// impl Default for USER_SESSION_KEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USER_SMARTCARD_REQUIRED`: UInt = 4096u;
public const val `USER_TEMP_DUPLICATE_ACCOUNT`: UInt = 8u;
public const val `USER_TRUSTED_FOR_DELEGATION`: UInt = 8192u;
public const val `USER_TRUSTED_TO_AUTHENTICATE_FOR_DELEGATION`: UInt = 262144u;
public const val `USER_USE_AES_KEYS`: UInt = 2097152u;
public const val `USER_USE_DES_KEY_ONLY`: UInt = 32768u;
public const val `USER_WORKSTATION_TRUST_ACCOUNT`: UInt = 128u;
// UNSUPPORTED Rust 6763:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Credentials")]
// pub type VERIFY_SIGNATURE_FN = Option<unsafe extern "system" fn(param0: *mut super::super::Credentials::SecHandle, param1: *mut SecBufferDesc, param2: u32, param3: *mut u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 6765:1: non-scalar type Ptr unsupported
// pub const WDIGEST_SP_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("WDigest");

// UNSUPPORTED Rust 6766:1: non-scalar type Ptr unsupported
// pub const WDIGEST_SP_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("WDigest");

// UNSUPPORTED Rust 6767:1: non-scalar type Ptr unsupported
// pub const WDIGEST_SP_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("WDigest");

// UNSUPPORTED Rust 6768:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WINDOWS_SLID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x55c92734_d682_4d71_983e_d6ec3f16059f);

// UNSUPPORTED Rust 6769:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct X509Certificate {
//     pub Version: u32,
//     pub SerialNumber: [u32; 4],
//     pub SignatureAlgorithm: super::super::Cryptography::ALG_ID,
//     pub ValidFrom: super::super::super::Foundation::FILETIME,
//     pub ValidUntil: super::super::super::Foundation::FILETIME,
//     pub pszIssuer: windows_sys::core::PSTR,
//     pub pszSubject: windows_sys::core::PSTR,
//     pub pPublicKey: *mut PctPublicKey,
// }

// UNSUPPORTED Rust 6782:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for X509Certificate {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `_FACILITY_WINDOWS_STORE`: UInt = 63u;
public typealias `_HMAPPER` = Long;
public typealias `eTlsAlgorithmUsage` = Int;
public typealias `eTlsHashAlgorithm` = Int;
public typealias `eTlsSignatureAlgorithm` = Int;
