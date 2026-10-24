// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=AcceptSecurityContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `AcceptSecurityContext`(`phcredential` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `phcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `pinput` : /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, `fcontextreq` : `ASC_REQ_FLAGS`, `targetdatarep` : UInt, `phnewcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `poutput` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, `pfcontextattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ptsexpiry` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=AcquireCredentialsHandleA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `AcquireCredentialsHandleA`(`pszprincipal` : `windows_sys`.`core`.`PCSTR`, `pszpackage` : `windows_sys`.`core`.`PCSTR`, `fcredentialuse` : `SECPKG_CRED`, `pvlogonid` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pauthdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pgetkeyfn` : `SEC_GET_KEY_FN`, `pvgetkeyargument` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phcredential` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `ptsexpiry` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=AcquireCredentialsHandleW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `AcquireCredentialsHandleW`(`pszprincipal` : `windows_sys`.`core`.`PCWSTR`, `pszpackage` : `windows_sys`.`core`.`PCWSTR`, `fcredentialuse` : `SECPKG_CRED`, `pvlogonid` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pauthdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pgetkeyfn` : `SEC_GET_KEY_FN`, `pvgetkeyargument` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phcredential` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `ptsexpiry` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=AddCredentialsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `AddCredentialsA`(`hcredentials` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `pszprincipal` : `windows_sys`.`core`.`PCSTR`, `pszpackage` : `windows_sys`.`core`.`PCSTR`, `fcredentialuse` : UInt, `pauthdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pgetkeyfn` : `SEC_GET_KEY_FN`, `pvgetkeyargument` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ptsexpiry` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=AddCredentialsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `AddCredentialsW`(`hcredentials` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `pszprincipal` : `windows_sys`.`core`.`PCWSTR`, `pszpackage` : `windows_sys`.`core`.`PCWSTR`, `fcredentialuse` : UInt, `pauthdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pgetkeyfn` : `SEC_GET_KEY_FN`, `pvgetkeyargument` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ptsexpiry` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=AddSecurityPackageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddSecurityPackageA`(`pszpackagename` : `windows_sys`.`core`.`PCSTR`, `poptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`SECURITY_PACKAGE_OPTIONS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=AddSecurityPackageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddSecurityPackageW`(`pszpackagename` : `windows_sys`.`core`.`PCWSTR`, `poptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`SECURITY_PACKAGE_OPTIONS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=ApplyControlToken; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `ApplyControlToken`(`phcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `pinput` : /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=AuditComputeEffectivePolicyBySid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuditComputeEffectivePolicyBySid`(`psid` : `super`.`super`.`PSID`, `psubcategoryguids` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwpolicycount` : UInt, `ppauditpolicy` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`AUDIT_POLICY_INFORMATION`>>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=AuditComputeEffectivePolicyByToken; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuditComputeEffectivePolicyByToken`(`htokenhandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `psubcategoryguids` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwpolicycount` : UInt, `ppauditpolicy` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`AUDIT_POLICY_INFORMATION`>>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=AuditEnumerateCategories; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuditEnumerateCategories`(`ppauditcategoriesarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`GUID`>>?, `pdwcountreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=AuditEnumeratePerUserPolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuditEnumeratePerUserPolicy`(`ppauditsidarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`POLICY_AUDIT_SID_ARRAY`>>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=AuditEnumerateSubCategories; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuditEnumerateSubCategories`(`pauditcategoryguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `bretrieveallsubcategories` : Boolean, `ppauditsubcategoriesarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`GUID`>>?, `pdwcountreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=AuditFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuditFree`(`buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=AuditLookupCategoryGuidFromCategoryId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuditLookupCategoryGuidFromCategoryId`(`auditcategoryid` : `POLICY_AUDIT_EVENT_TYPE`, `pauditcategoryguid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=AuditLookupCategoryIdFromCategoryGuid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuditLookupCategoryIdFromCategoryGuid`(`pauditcategoryguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pauditcategoryid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`POLICY_AUDIT_EVENT_TYPE`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=AuditLookupCategoryNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuditLookupCategoryNameA`(`pauditcategoryguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppszcategoryname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=AuditLookupCategoryNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuditLookupCategoryNameW`(`pauditcategoryguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppszcategoryname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=AuditLookupSubCategoryNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuditLookupSubCategoryNameA`(`pauditsubcategoryguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppszsubcategoryname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=AuditLookupSubCategoryNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuditLookupSubCategoryNameW`(`pauditsubcategoryguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppszsubcategoryname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=AuditQueryGlobalSaclA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuditQueryGlobalSaclA`(`objecttypename` : `windows_sys`.`core`.`PCSTR`, `acl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`ACL`>>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=AuditQueryGlobalSaclW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuditQueryGlobalSaclW`(`objecttypename` : `windows_sys`.`core`.`PCWSTR`, `acl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`ACL`>>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=AuditQueryPerUserPolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuditQueryPerUserPolicy`(`psid` : `super`.`super`.`PSID`, `psubcategoryguids` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwpolicycount` : UInt, `ppauditpolicy` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`AUDIT_POLICY_INFORMATION`>>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=AuditQuerySecurity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuditQuerySecurity`(`securityinformation` : `super`.`super`.`OBJECT_SECURITY_INFORMATION`, `ppsecuritydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`PSECURITY_DESCRIPTOR`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=AuditQuerySystemPolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuditQuerySystemPolicy`(`psubcategoryguids` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwpolicycount` : UInt, `ppauditpolicy` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`AUDIT_POLICY_INFORMATION`>>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=AuditSetGlobalSaclA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuditSetGlobalSaclA`(`objecttypename` : `windows_sys`.`core`.`PCSTR`, `acl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`ACL`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=AuditSetGlobalSaclW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuditSetGlobalSaclW`(`objecttypename` : `windows_sys`.`core`.`PCWSTR`, `acl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`ACL`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=AuditSetPerUserPolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuditSetPerUserPolicy`(`psid` : `super`.`super`.`PSID`, `pauditpolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`AUDIT_POLICY_INFORMATION`>?, `dwpolicycount` : UInt) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=AuditSetSecurity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuditSetSecurity`(`securityinformation` : `super`.`super`.`OBJECT_SECURITY_INFORMATION`, `psecuritydescriptor` : `super`.`super`.`PSECURITY_DESCRIPTOR`) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=AuditSetSystemPolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuditSetSystemPolicy`(`pauditpolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`AUDIT_POLICY_INFORMATION`>?, `dwpolicycount` : UInt) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=ChangeAccountPasswordA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ChangeAccountPasswordA`(`pszpackagename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pszdomainname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pszaccountname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pszoldpassword` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `psznewpassword` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `bimpersonating` : Boolean, `dwreserved` : UInt, `poutput` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=ChangeAccountPasswordW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ChangeAccountPasswordW`(`pszpackagename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pszdomainname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pszaccountname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pszoldpassword` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `psznewpassword` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `bimpersonating` : Boolean, `dwreserved` : UInt, `poutput` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=CompleteAuthToken; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `CompleteAuthToken`(`phcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `ptoken` : /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=CredMarshalTargetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `CredMarshalTargetInfo`(`intargetinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`CREDENTIAL_TARGET_INFORMATIONW`>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=CredUnmarshalTargetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `CredUnmarshalTargetInfo`(`buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `buffersize` : UInt, `rettargetinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Credentials`.`CREDENTIAL_TARGET_INFORMATIONW`>>?, `retactualsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=DecryptMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `DecryptMessage`(`phcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `pmessage` : /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, `messageseqno` : UInt, `pfqop` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=DeleteSecurityContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `DeleteSecurityContext`(`phcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=DeleteSecurityPackageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteSecurityPackageA`(`pszpackagename` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=DeleteSecurityPackageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteSecurityPackageW`(`pszpackagename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=EncryptMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `EncryptMessage`(`phcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `fqop` : UInt, `pmessage` : /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, `messageseqno` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=EnumerateSecurityPackagesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumerateSecurityPackagesA`(`pcpackages` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pppackageinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SecPkgInfoA`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=EnumerateSecurityPackagesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumerateSecurityPackagesW`(`pcpackages` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pppackageinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SecPkgInfoW`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=ExportSecurityContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `ExportSecurityContext`(`phcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `fflags` : `EXPORT_SECURITY_CONTEXT_FLAGS`, `ppackedcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBuffer`>?, `ptoken` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=FreeContextBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FreeContextBuffer`(`pvcontextbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=FreeCredentialsHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `FreeCredentialsHandle`(`phcredential` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=GetComputerObjectNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetComputerObjectNameA`(`nameformat` : `EXTENDED_NAME_FORMAT`, `lpnamebuffer` : `windows_sys`.`core`.`PSTR`, `nsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=GetComputerObjectNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetComputerObjectNameW`(`nameformat` : `EXTENDED_NAME_FORMAT`, `lpnamebuffer` : `windows_sys`.`core`.`PWSTR`, `nsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=GetUserNameExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUserNameExA`(`nameformat` : `EXTENDED_NAME_FORMAT`, `lpnamebuffer` : `windows_sys`.`core`.`PSTR`, `nsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=GetUserNameExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUserNameExW`(`nameformat` : `EXTENDED_NAME_FORMAT`, `lpnamebuffer` : `windows_sys`.`core`.`PWSTR`, `nsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=ImpersonateSecurityContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `ImpersonateSecurityContext`(`phcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=ImportSecurityContextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `ImportSecurityContextA`(`pszpackage` : `windows_sys`.`core`.`PCSTR`, `ppackedcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`SecBuffer`>?, `token` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=ImportSecurityContextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `ImportSecurityContextW`(`pszpackage` : `windows_sys`.`core`.`PCWSTR`, `ppackedcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`SecBuffer`>?, `token` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=InitSecurityInterfaceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `InitSecurityInterfaceA`() : /* Rust *mut */ kotlinx.cinterop.CPointer<`SecurityFunctionTableA`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=InitSecurityInterfaceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `InitSecurityInterfaceW`() : /* Rust *mut */ kotlinx.cinterop.CPointer<`SecurityFunctionTableW`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=InitializeSecurityContextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `InitializeSecurityContextA`(`phcredential` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `phcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `psztargetname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `fcontextreq` : `ISC_REQ_FLAGS`, `reserved1` : UInt, `targetdatarep` : UInt, `pinput` : /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, `reserved2` : UInt, `phnewcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `poutput` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, `pfcontextattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ptsexpiry` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=InitializeSecurityContextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `InitializeSecurityContextW`(`phcredential` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `phcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `psztargetname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `fcontextreq` : `ISC_REQ_FLAGS`, `reserved1` : UInt, `targetdatarep` : UInt, `pinput` : /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, `reserved2` : UInt, `phnewcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `poutput` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, `pfcontextattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ptsexpiry` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaAddAccountRights; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaAddAccountRights`(`policyhandle` : `LSA_HANDLE`, `accountsid` : `super`.`super`.`PSID`, `userrights` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, `countofrights` : UInt) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=LsaCallAuthenticationPackage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaCallAuthenticationPackage`(`lsahandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `authenticationpackage` : UInt, `protocolsubmitbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `submitbufferlength` : UInt, `protocolreturnbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `returnbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `protocolstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaClose`(`objecthandle` : `LSA_HANDLE`) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=LsaConnectUntrusted; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaConnectUntrusted`(`lsahandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HANDLE`>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaCreateTrustedDomainEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaCreateTrustedDomainEx`(`policyhandle` : `LSA_HANDLE`, `trusteddomaininformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTED_DOMAIN_INFORMATION_EX`>?, `authenticationinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTED_DOMAIN_AUTH_INFORMATION`>?, `desiredaccess` : UInt, `trusteddomainhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_HANDLE`>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaDeleteTrustedDomain; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaDeleteTrustedDomain`(`policyhandle` : `LSA_HANDLE`, `trusteddomainsid` : `super`.`super`.`PSID`) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=LsaDeregisterLogonProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaDeregisterLogonProcess`(`lsahandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaEnumerateAccountRights; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaEnumerateAccountRights`(`policyhandle` : `LSA_HANDLE`, `accountsid` : `super`.`super`.`PSID`, `userrights` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_UNICODE_STRING`>>?, `countofrights` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaEnumerateAccountsWithUserRight; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaEnumerateAccountsWithUserRight`(`policyhandle` : `LSA_HANDLE`, `userright` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `countreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=LsaEnumerateLogonSessions; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaEnumerateLogonSessions`(`logonsessioncount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `logonsessionlist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Foundation`.`LUID`>>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaEnumerateTrustedDomains; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaEnumerateTrustedDomains`(`policyhandle` : `LSA_HANDLE`, `enumerationcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `preferedmaximumlength` : UInt, `countreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaEnumerateTrustedDomainsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaEnumerateTrustedDomainsEx`(`policyhandle` : `LSA_HANDLE`, `enumerationcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `preferedmaximumlength` : UInt, `countreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaFreeMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaFreeMemory`(`buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=LsaFreeReturnBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaFreeReturnBuffer`(`buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaGetAppliedCAPIDs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaGetAppliedCAPIDs`(`systemname` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, `capids` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`PSID`>>?, `capidcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=LsaGetLogonSessionData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaGetLogonSessionData`(`logonid` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?, `pplogonsessiondata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SECURITY_LOGON_SESSION_DATA`>>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=LsaLogonUser; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaLogonUser`(`lsahandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `originname` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_STRING`>?, `logontype` : `SECURITY_LOGON_TYPE`, `authenticationpackage` : UInt, `authenticationinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `authenticationinformationlength` : UInt, `localgroups` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`TOKEN_GROUPS`>?, `sourcecontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`TOKEN_SOURCE`>?, `profilebuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `profilebufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `logonid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?, `token` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HANDLE`>?, `quotas` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`QUOTA_LIMITS`>?, `substatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=LsaLookupAuthenticationPackage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaLookupAuthenticationPackage`(`lsahandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `packagename` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_STRING`>?, `authenticationpackage` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaLookupNames; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaLookupNames`(`policyhandle` : `LSA_HANDLE`, `count` : UInt, `names` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, `referenceddomains` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_REFERENCED_DOMAIN_LIST`>>?, `sids` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_TRANSLATED_SID`>>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaLookupNames2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaLookupNames2`(`policyhandle` : `LSA_HANDLE`, `flags` : UInt, `count` : UInt, `names` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, `referenceddomains` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_REFERENCED_DOMAIN_LIST`>>?, `sids` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_TRANSLATED_SID2`>>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaLookupSids; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaLookupSids`(`policyhandle` : `LSA_HANDLE`, `count` : UInt, `sids` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`PSID`>?, `referenceddomains` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_REFERENCED_DOMAIN_LIST`>>?, `names` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_TRANSLATED_NAME`>>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaLookupSids2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaLookupSids2`(`policyhandle` : `LSA_HANDLE`, `lookupoptions` : UInt, `count` : UInt, `sids` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`PSID`>?, `referenceddomains` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_REFERENCED_DOMAIN_LIST`>>?, `names` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_TRANSLATED_NAME`>>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaNtStatusToWinError; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaNtStatusToWinError`(`status` : `super`.`super`.`super`.`Foundation`.`NTSTATUS`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaOpenPolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaOpenPolicy`(`systemname` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_OBJECT_ATTRIBUTES`>?, `desiredaccess` : UInt, `policyhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_HANDLE`>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaOpenTrustedDomainByName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaOpenTrustedDomainByName`(`policyhandle` : `LSA_HANDLE`, `trusteddomainname` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, `desiredaccess` : UInt, `trusteddomainhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_HANDLE`>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaQueryCAPs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaQueryCAPs`(`capids` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`PSID`>?, `capidcount` : UInt, `caps` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`CENTRAL_ACCESS_POLICY`>>?, `capcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaQueryDomainInformationPolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaQueryDomainInformationPolicy`(`policyhandle` : `LSA_HANDLE`, `informationclass` : `POLICY_DOMAIN_INFORMATION_CLASS`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaQueryForestTrustInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaQueryForestTrustInformation`(`policyhandle` : `LSA_HANDLE`, `trusteddomainname` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, `foresttrustinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_FOREST_TRUST_INFORMATION`>>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaQueryForestTrustInformation2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaQueryForestTrustInformation2`(`policyhandle` : `LSA_HANDLE`, `trusteddomainname` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, `highestrecordtype` : `LSA_FOREST_TRUST_RECORD_TYPE`, `foresttrustinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_FOREST_TRUST_INFORMATION2`>>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaQueryInformationPolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaQueryInformationPolicy`(`policyhandle` : `LSA_HANDLE`, `informationclass` : `POLICY_INFORMATION_CLASS`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaQueryTrustedDomainInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaQueryTrustedDomainInfo`(`policyhandle` : `LSA_HANDLE`, `trusteddomainsid` : `super`.`super`.`PSID`, `informationclass` : `TRUSTED_INFORMATION_CLASS`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaQueryTrustedDomainInfoByName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaQueryTrustedDomainInfoByName`(`policyhandle` : `LSA_HANDLE`, `trusteddomainname` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, `informationclass` : `TRUSTED_INFORMATION_CLASS`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=LsaRegisterLogonProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaRegisterLogonProcess`(`logonprocessname` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_STRING`>?, `lsahandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HANDLE`>?, `securitymode` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=LsaRegisterPolicyChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaRegisterPolicyChangeNotification`(`informationclass` : `POLICY_NOTIFICATION_INFORMATION_CLASS`, `notificationeventhandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaRemoveAccountRights; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaRemoveAccountRights`(`policyhandle` : `LSA_HANDLE`, `accountsid` : `super`.`super`.`PSID`, `allrights` : Boolean, `userrights` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, `countofrights` : UInt) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaRetrievePrivateData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaRetrievePrivateData`(`policyhandle` : `LSA_HANDLE`, `keyname` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, `privatedata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_UNICODE_STRING`>>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaSetCAPs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaSetCAPs`(`capdns` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, `capdncount` : UInt, `flags` : UInt) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaSetDomainInformationPolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaSetDomainInformationPolicy`(`policyhandle` : `LSA_HANDLE`, `informationclass` : `POLICY_DOMAIN_INFORMATION_CLASS`, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaSetForestTrustInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaSetForestTrustInformation`(`policyhandle` : `LSA_HANDLE`, `trusteddomainname` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, `foresttrustinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_FOREST_TRUST_INFORMATION`>?, `checkonly` : Boolean, `collisioninfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_FOREST_TRUST_COLLISION_INFORMATION`>>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaSetForestTrustInformation2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaSetForestTrustInformation2`(`policyhandle` : `LSA_HANDLE`, `trusteddomainname` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, `highestrecordtype` : `LSA_FOREST_TRUST_RECORD_TYPE`, `foresttrustinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_FOREST_TRUST_INFORMATION2`>?, `checkonly` : Boolean, `collisioninfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_FOREST_TRUST_COLLISION_INFORMATION`>>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaSetInformationPolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaSetInformationPolicy`(`policyhandle` : `LSA_HANDLE`, `informationclass` : `POLICY_INFORMATION_CLASS`, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaSetTrustedDomainInfoByName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaSetTrustedDomainInfoByName`(`policyhandle` : `LSA_HANDLE`, `trusteddomainname` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, `informationclass` : `TRUSTED_INFORMATION_CLASS`, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaSetTrustedDomainInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaSetTrustedDomainInformation`(`policyhandle` : `LSA_HANDLE`, `trusteddomainsid` : `super`.`super`.`PSID`, `informationclass` : `TRUSTED_INFORMATION_CLASS`, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LsaStorePrivateData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaStorePrivateData`(`policyhandle` : `LSA_HANDLE`, `keyname` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, `privatedata` : /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=LsaUnregisterPolicyChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsaUnregisterPolicyChangeNotification`(`informationclass` : `POLICY_NOTIFICATION_INFORMATION_CLASS`, `notificationeventhandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=MakeSignature; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `MakeSignature`(`phcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `fqop` : UInt, `pmessage` : /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, `messageseqno` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=QueryContextAttributesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `QueryContextAttributesA`(`phcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `ulattribute` : `SECPKG_ATTR`, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sspicli.dll, ABI=system, export=QueryContextAttributesExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `QueryContextAttributesExA`(`phcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `ulattribute` : `SECPKG_ATTR`, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbbuffer` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sspicli.dll, ABI=system, export=QueryContextAttributesExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `QueryContextAttributesExW`(`phcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `ulattribute` : `SECPKG_ATTR`, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbbuffer` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=QueryContextAttributesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `QueryContextAttributesW`(`phcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `ulattribute` : `SECPKG_ATTR`, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=QueryCredentialsAttributesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `QueryCredentialsAttributesA`(`phcredential` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `ulattribute` : UInt, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sspicli.dll, ABI=system, export=QueryCredentialsAttributesExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `QueryCredentialsAttributesExA`(`phcredential` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `ulattribute` : UInt, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbbuffer` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sspicli.dll, ABI=system, export=QueryCredentialsAttributesExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `QueryCredentialsAttributesExW`(`phcredential` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `ulattribute` : UInt, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbbuffer` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=QueryCredentialsAttributesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `QueryCredentialsAttributesW`(`phcredential` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `ulattribute` : UInt, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=QuerySecurityContextToken; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `QuerySecurityContextToken`(`phcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `token` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=QuerySecurityPackageInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QuerySecurityPackageInfoA`(`pszpackagename` : `windows_sys`.`core`.`PCSTR`, `pppackageinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SecPkgInfoA`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=QuerySecurityPackageInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QuerySecurityPackageInfoW`(`pszpackagename` : `windows_sys`.`core`.`PCWSTR`, `pppackageinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SecPkgInfoW`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=RevertSecurityContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `RevertSecurityContext`(`phcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SystemFunction041; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlDecryptMemory`(`memory` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `memorysize` : UInt, `optionflags` : UInt) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SystemFunction040; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlEncryptMemory`(`memory` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `memorysize` : UInt, `optionflags` : UInt) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SystemFunction036; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlGenRandom`(`randombuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `randombufferlength` : UInt) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slcext.dll, ABI=system, export=SLAcquireGenuineTicket; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLAcquireGenuineTicket`(`ppticketblob` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `pcbticketblob` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pwsztemplateid` : `windows_sys`.`core`.`PCWSTR`, `pwszserverurl` : `windows_sys`.`core`.`PCWSTR`, `pwszclienttoken` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slcext.dll, ABI=system, export=SLActivateProduct; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLActivateProduct`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pproductskuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `cbappspecificdata` : UInt, `pvappspecificdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pactivationinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`SL_ACTIVATION_INFO_HEADER`>?, `pwszproxyserver` : `windows_sys`.`core`.`PCWSTR`, `wproxyport` : UShort) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLClose`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLConsumeRight; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLConsumeRight`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pappid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pproductskuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pwszrightname` : `windows_sys`.`core`.`PCWSTR`, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLDepositOfflineConfirmationId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLDepositOfflineConfirmationId`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pproductskuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pwszinstallationid` : `windows_sys`.`core`.`PCWSTR`, `pwszconfirmationid` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLDepositOfflineConfirmationIdEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLDepositOfflineConfirmationIdEx`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pproductskuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pactivationinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`SL_ACTIVATION_INFO_HEADER`>?, `pwszinstallationid` : `windows_sys`.`core`.`PCWSTR`, `pwszconfirmationid` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLFireEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLFireEvent`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwszeventid` : `windows_sys`.`core`.`PCWSTR`, `papplicationid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLGenerateOfflineInstallationId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLGenerateOfflineInstallationId`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pproductskuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppwszinstallationid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLGenerateOfflineInstallationIdEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLGenerateOfflineInstallationIdEx`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pproductskuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pactivationinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`SL_ACTIVATION_INFO_HEADER`>?, `ppwszinstallationid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLGetApplicationInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLGetApplicationInformation`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `papplicationid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pwszvaluename` : `windows_sys`.`core`.`PCWSTR`, `pedatatype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SLDATATYPE`>?, `pcbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLGetGenuineInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLGetGenuineInformation`(`pqueryid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pwszvaluename` : `windows_sys`.`core`.`PCWSTR`, `pedatatype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SLDATATYPE`>?, `pcbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLGetInstalledProductKeyIds; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLGetInstalledProductKeyIds`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pproductskuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pnproductkeyids` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppproductkeyids` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`GUID`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLGetLicense; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLGetLicense`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `plicensefileid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pcblicensefile` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppblicensefile` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLGetLicenseFileId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLGetLicenseFileId`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cblicenseblob` : UInt, `pblicenseblob` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `plicensefileid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLGetLicenseInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLGetLicenseInformation`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `psllicenseid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pwszvaluename` : `windows_sys`.`core`.`PCWSTR`, `pedatatype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SLDATATYPE`>?, `pcbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLGetLicensingStatusInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLGetLicensingStatusInformation`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pappid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pproductskuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pwszrightname` : `windows_sys`.`core`.`PCWSTR`, `pnstatuscount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pplicensingstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SL_LICENSING_STATUS`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLGetPKeyId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLGetPKeyId`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwszpkeyalgorithm` : `windows_sys`.`core`.`PCWSTR`, `pwszpkeystring` : `windows_sys`.`core`.`PCWSTR`, `cbpkeyspecificdata` : UInt, `pbpkeyspecificdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `ppkeyid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLGetPKeyInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLGetPKeyInformation`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppkeyid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pwszvaluename` : `windows_sys`.`core`.`PCWSTR`, `pedatatype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SLDATATYPE`>?, `pcbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLGetPolicyInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLGetPolicyInformation`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwszvaluename` : `windows_sys`.`core`.`PCWSTR`, `pedatatype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SLDATATYPE`>?, `pcbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLGetPolicyInformationDWORD; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLGetPolicyInformationDWORD`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwszvaluename` : `windows_sys`.`core`.`PCWSTR`, `pdwvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLGetProductSkuInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLGetProductSkuInformation`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pproductskuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pwszvaluename` : `windows_sys`.`core`.`PCWSTR`, `pedatatype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SLDATATYPE`>?, `pcbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slcext.dll, ABI=system, export=SLGetReferralInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLGetReferralInformation`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ereferraltype` : `SLREFERRALTYPE`, `pskuorappid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pwszvaluename` : `windows_sys`.`core`.`PCWSTR`, `ppwszvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLGetSLIDList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLGetSLIDList`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `equeryidtype` : `SLIDTYPE`, `pqueryid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ereturnidtype` : `SLIDTYPE`, `pnreturnids` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppreturnids` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`GUID`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slcext.dll, ABI=system, export=SLGetServerStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLGetServerStatus`(`pwszserverurl` : `windows_sys`.`core`.`PCWSTR`, `pwszacquisitiontype` : `windows_sys`.`core`.`PCWSTR`, `pwszproxyserver` : `windows_sys`.`core`.`PCWSTR`, `wproxyport` : UShort, `phrstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`HRESULT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLGetServiceInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLGetServiceInformation`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwszvaluename` : `windows_sys`.`core`.`PCWSTR`, `pedatatype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SLDATATYPE`>?, `pcbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLGetWindowsInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLGetWindowsInformation`(`pwszvaluename` : `windows_sys`.`core`.`PCWSTR`, `pedatatype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SLDATATYPE`>?, `pcbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLGetWindowsInformationDWORD; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLGetWindowsInformationDWORD`(`pwszvaluename` : `windows_sys`.`core`.`PCWSTR`, `pdwvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLInstallLicense; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLInstallLicense`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cblicenseblob` : UInt, `pblicenseblob` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `plicensefileid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLInstallProofOfPurchase; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLInstallProofOfPurchase`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwszpkeyalgorithm` : `windows_sys`.`core`.`PCWSTR`, `pwszpkeystring` : `windows_sys`.`core`.`PCWSTR`, `cbpkeyspecificdata` : UInt, `pbpkeyspecificdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `ppkeyid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slwga.dll, ABI=system, export=SLIsGenuineLocal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLIsGenuineLocal`(`pappid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pgenuinestate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SL_GENUINE_STATE`>?, `puioptions` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SL_NONGENUINE_UI_OPTIONS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLOpen`(`phslc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-slapi-l1-1-0.dll, ABI=system, export=SLQueryLicenseValueFromApp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLQueryLicenseValueFromApp`(`valuename` : `windows_sys`.`core`.`PCWSTR`, `valuetype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `databuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `datasize` : UInt, `resultdatasize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLRegisterEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLRegisterEvent`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwszeventid` : `windows_sys`.`core`.`PCWSTR`, `papplicationid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `hevent` : `super`.`super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLSetCurrentProductKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLSetCurrentProductKey`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pproductskuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pproductkeyid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLSetGenuineInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLSetGenuineInformation`(`pqueryid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pwszvaluename` : `windows_sys`.`core`.`PCWSTR`, `edatatype` : `SLDATATYPE`, `cbvalue` : UInt, `pbvalue` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLUninstallLicense; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLUninstallLicense`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `plicensefileid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLUninstallProofOfPurchase; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLUninstallProofOfPurchase`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppkeyid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=slc.dll, ABI=system, export=SLUnregisterEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SLUnregisterEvent`(`hslc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwszeventid` : `windows_sys`.`core`.`PCWSTR`, `papplicationid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `hevent` : `super`.`super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SaslAcceptSecurityContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `SaslAcceptSecurityContext`(`phcredential` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `phcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `pinput` : /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, `fcontextreq` : `ASC_REQ_FLAGS`, `targetdatarep` : UInt, `phnewcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `poutput` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, `pfcontextattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ptsexpiry` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SaslEnumerateProfilesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SaslEnumerateProfilesA`(`profilelist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?, `profilecount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SaslEnumerateProfilesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SaslEnumerateProfilesW`(`profilelist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `profilecount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SaslGetContextOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `SaslGetContextOption`(`contexthandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `option` : UInt, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : UInt, `needed` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SaslGetProfilePackageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SaslGetProfilePackageA`(`profilename` : `windows_sys`.`core`.`PCSTR`, `packageinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SecPkgInfoA`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SaslGetProfilePackageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SaslGetProfilePackageW`(`profilename` : `windows_sys`.`core`.`PCWSTR`, `packageinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SecPkgInfoW`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SaslIdentifyPackageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SaslIdentifyPackageA`(`pinput` : /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, `packageinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SecPkgInfoA`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SaslIdentifyPackageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SaslIdentifyPackageW`(`pinput` : /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, `packageinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SecPkgInfoW`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SaslInitializeSecurityContextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `SaslInitializeSecurityContextA`(`phcredential` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `phcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `psztargetname` : `windows_sys`.`core`.`PCSTR`, `fcontextreq` : `ISC_REQ_FLAGS`, `reserved1` : UInt, `targetdatarep` : UInt, `pinput` : /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, `reserved2` : UInt, `phnewcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `poutput` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, `pfcontextattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ptsexpiry` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SaslInitializeSecurityContextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `SaslInitializeSecurityContextW`(`phcredential` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `phcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `psztargetname` : `windows_sys`.`core`.`PCWSTR`, `fcontextreq` : `ISC_REQ_FLAGS`, `reserved1` : UInt, `targetdatarep` : UInt, `pinput` : /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, `reserved2` : UInt, `phnewcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `poutput` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, `pfcontextattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ptsexpiry` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SaslSetContextOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `SaslSetContextOption`(`contexthandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `option` : UInt, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sas.dll, ABI=system, export=SendSAS; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SendSAS`(`asuser` : `windows_sys`.`core`.`BOOL`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SetContextAttributesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `SetContextAttributesA`(`phcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `ulattribute` : `SECPKG_ATTR`, `pbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbbuffer` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SetContextAttributesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `SetContextAttributesW`(`phcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `ulattribute` : `SECPKG_ATTR`, `pbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbbuffer` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SetCredentialsAttributesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `SetCredentialsAttributesA`(`phcredential` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `ulattribute` : UInt, `pbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbbuffer` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SetCredentialsAttributesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `SetCredentialsAttributesW`(`phcredential` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `ulattribute` : UInt, `pbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbbuffer` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=schannel.dll, ABI=system, export=SslCrackCertificate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public external fun `SslCrackCertificate`(`pbcertificate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbcertificate` : UInt, `dwflags` : UInt, `ppcertificate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`X509Certificate`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=schannel.dll, ABI=system, export=SslDeserializeCertificateStore; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public external fun `SslDeserializeCertificateStore`(`serializedcertificatestore` : `super`.`super`.`Cryptography`.`CRYPT_INTEGER_BLOB`, `ppcertcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Cryptography`.`CERT_CONTEXT`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=schannel.dll, ABI=system, export=SslEmptyCacheA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SslEmptyCacheA`(`psztargetname` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=schannel.dll, ABI=system, export=SslEmptyCacheW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SslEmptyCacheW`(`psztargetname` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=schannel.dll, ABI=system, export=SslFreeCertificate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public external fun `SslFreeCertificate`(`pcertificate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`X509Certificate`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=schannel.dll, ABI=system, export=SslGenerateRandomBits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SslGenerateRandomBits`(`prandomdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `crandomdata` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=schannel.dll, ABI=system, export=SslGetExtensions; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SslGetExtensions`(`clienthello` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `clienthellobytesize` : UInt, `genericextensions` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SCH_EXTENSION_DATA`>?, `genericextensionscount` : UByte, `bytestoread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `flags` : `SchGetExtensionsOptions`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=schannel.dll, ABI=system, export=SslGetMaximumKeySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SslGetMaximumKeySize`(`reserved` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=schannel.dll, ABI=system, export=SslGetServerIdentity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SslGetServerIdentity`(`clienthello` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `clienthellosize` : UInt, `serveridentity` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `serveridentitysize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `flags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SspiCompareAuthIdentities; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SspiCompareAuthIdentities`(`authidentity1` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `authidentity2` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `samesupplieduser` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?, `samesuppliedidentity` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SspiCopyAuthIdentity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SspiCopyAuthIdentity`(`authdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `authdatacopy` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SspiDecryptAuthIdentity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SspiDecryptAuthIdentity`(`encryptedauthdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sspicli.dll, ABI=system, export=SspiDecryptAuthIdentityEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SspiDecryptAuthIdentityEx`(`options` : UInt, `encryptedauthdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SspiEncodeAuthIdentityAsStrings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SspiEncodeAuthIdentityAsStrings`(`pauthidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppszusername` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `ppszdomainname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `ppszpackedcredentialsstring` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SspiEncodeStringsAsAuthIdentity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SspiEncodeStringsAsAuthIdentity`(`pszusername` : `windows_sys`.`core`.`PCWSTR`, `pszdomainname` : `windows_sys`.`core`.`PCWSTR`, `pszpackedcredentialsstring` : `windows_sys`.`core`.`PCWSTR`, `ppauthidentity` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SspiEncryptAuthIdentity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SspiEncryptAuthIdentity`(`authdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sspicli.dll, ABI=system, export=SspiEncryptAuthIdentityEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SspiEncryptAuthIdentityEx`(`options` : UInt, `authdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SspiExcludePackage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SspiExcludePackage`(`authidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pszpackagename` : `windows_sys`.`core`.`PCWSTR`, `ppnewauthidentity` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SspiFreeAuthIdentity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SspiFreeAuthIdentity`(`authdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SspiGetTargetHostName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SspiGetTargetHostName`(`psztargetname` : `windows_sys`.`core`.`PCWSTR`, `pszhostname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SspiIsAuthIdentityEncrypted; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SspiIsAuthIdentityEncrypted`(`encryptedauthdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=credui.dll, ABI=system, export=SspiIsPromptingNeeded; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SspiIsPromptingNeeded`(`errororntstatus` : UInt) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SspiLocalFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SspiLocalFree`(`databuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SspiMarshalAuthIdentity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SspiMarshalAuthIdentity`(`authidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `authidentitylength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `authidentitybytearray` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SspiPrepareForCredRead; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SspiPrepareForCredRead`(`authidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `psztargetname` : `windows_sys`.`core`.`PCWSTR`, `pcredmancredentialtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppszcredmantargetname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SspiPrepareForCredWrite; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SspiPrepareForCredWrite`(`authidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `psztargetname` : `windows_sys`.`core`.`PCWSTR`, `pcredmancredentialtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppszcredmantargetname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `ppszcredmanusername` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `ppcredentialblob` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pcredentialblobsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=credui.dll, ABI=system, export=SspiPromptForCredentialsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SspiPromptForCredentialsA`(`psztargetname` : `windows_sys`.`core`.`PCSTR`, `puiinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwautherror` : UInt, `pszpackage` : `windows_sys`.`core`.`PCSTR`, `pinputauthidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppauthidentity` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `pfsave` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `dwflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=credui.dll, ABI=system, export=SspiPromptForCredentialsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SspiPromptForCredentialsW`(`psztargetname` : `windows_sys`.`core`.`PCWSTR`, `puiinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwautherror` : UInt, `pszpackage` : `windows_sys`.`core`.`PCWSTR`, `pinputauthidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppauthidentity` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `pfsave` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `dwflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sspicli.dll, ABI=system, export=SspiSetChannelBindingFlags; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SspiSetChannelBindingFlags`(`pbindings` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SecPkgContext_Bindings`>?, `flags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SspiUnmarshalAuthIdentity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SspiUnmarshalAuthIdentity`(`authidentitylength` : UInt, `authidentitybytearray` : `windows_sys`.`core`.`PCSTR`, `ppauthidentity` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SspiValidateAuthIdentity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SspiValidateAuthIdentity`(`authdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=SspiZeroAuthIdentity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SspiZeroAuthIdentity`(`authdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tokenbinding.dll, ABI=system, export=TokenBindingDeleteAllBindings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TokenBindingDeleteAllBindings`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tokenbinding.dll, ABI=system, export=TokenBindingDeleteBinding; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TokenBindingDeleteBinding`(`targeturl` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tokenbinding.dll, ABI=system, export=TokenBindingGenerateBinding; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TokenBindingGenerateBinding`(`keytype` : `TOKENBINDING_KEY_PARAMETERS_TYPE`, `targeturl` : `windows_sys`.`core`.`PCWSTR`, `bindingtype` : `TOKENBINDING_TYPE`, `tlsekm` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `tlsekmsize` : UInt, `extensionformat` : `TOKENBINDING_EXTENSION_FORMAT`, `extensiondata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `tokenbinding` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `tokenbindingsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `resultdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`TOKENBINDING_RESULT_DATA`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tokenbinding.dll, ABI=system, export=TokenBindingGenerateID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TokenBindingGenerateID`(`keytype` : `TOKENBINDING_KEY_PARAMETERS_TYPE`, `publickey` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `publickeysize` : UInt, `resultdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`TOKENBINDING_RESULT_DATA`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tokenbinding.dll, ABI=system, export=TokenBindingGenerateIDForUri; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TokenBindingGenerateIDForUri`(`keytype` : `TOKENBINDING_KEY_PARAMETERS_TYPE`, `targeturi` : `windows_sys`.`core`.`PCWSTR`, `resultdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`TOKENBINDING_RESULT_DATA`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tokenbinding.dll, ABI=system, export=TokenBindingGenerateMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TokenBindingGenerateMessage`(`tokenbindings` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `tokenbindingssize` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `tokenbindingscount` : UInt, `tokenbindingmessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `tokenbindingmessagesize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tokenbinding.dll, ABI=system, export=TokenBindingGetHighestSupportedVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TokenBindingGetHighestSupportedVersion`(`majorversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `minorversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tokenbinding.dll, ABI=system, export=TokenBindingGetKeyTypesClient; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TokenBindingGetKeyTypesClient`(`keytypes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`TOKENBINDING_KEY_TYPES`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tokenbinding.dll, ABI=system, export=TokenBindingGetKeyTypesServer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TokenBindingGetKeyTypesServer`(`keytypes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`TOKENBINDING_KEY_TYPES`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tokenbinding.dll, ABI=system, export=TokenBindingVerifyMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TokenBindingVerifyMessage`(`tokenbindingmessage` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `tokenbindingmessagesize` : UInt, `keytype` : `TOKENBINDING_KEY_PARAMETERS_TYPE`, `tlsekm` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `tlsekmsize` : UInt, `resultlist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`TOKENBINDING_RESULT_LIST`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=TranslateNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TranslateNameA`(`lpaccountname` : `windows_sys`.`core`.`PCSTR`, `accountnameformat` : `EXTENDED_NAME_FORMAT`, `desirednameformat` : `EXTENDED_NAME_FORMAT`, `lptranslatedname` : `windows_sys`.`core`.`PSTR`, `nsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=TranslateNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TranslateNameW`(`lpaccountname` : `windows_sys`.`core`.`PCWSTR`, `accountnameformat` : `EXTENDED_NAME_FORMAT`, `desirednameformat` : `EXTENDED_NAME_FORMAT`, `lptranslatedname` : `windows_sys`.`core`.`PWSTR`, `nsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=secur32.dll, ABI=system, export=VerifySignature; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public external fun `VerifySignature`(`phcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, `pmessage` : /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, `messageseqno` : UInt, `pfqop` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `ACCEPT_SECURITY_CONTEXT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `ACCOUNT_ADJUST_PRIVILEGES`: Int = 2;
public const val `ACCOUNT_ADJUST_QUOTAS`: Int = 4;
public const val `ACCOUNT_ADJUST_SYSTEM_ACCESS`: Int = 8;
public const val `ACCOUNT_VIEW`: Int = 1;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `ACQUIRE_CREDENTIALS_HANDLE_FN_A` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `SEC_GET_KEY_FN`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `ACQUIRE_CREDENTIALS_HANDLE_FN_W` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `SEC_GET_KEY_FN`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `ADD_CREDENTIALS_FN_A` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `SEC_GET_KEY_FN`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `ADD_CREDENTIALS_FN_W` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `SEC_GET_KEY_FN`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `APPLY_CONTROL_TOKEN_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `AUDIT_POLICY_INFORMATION` (
    public var `AuditSubCategoryGuid`: `windows_sys`.`core`.`GUID`,
    public var `AuditingInformation`: UInt,
    public var `AuditCategoryGuid`: `windows_sys`.`core`.`GUID`,
)
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
// UNSUPPORTED Rust 367:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_AccountLogon: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x69979850_797a_11d9_bed3_505054503030);

// UNSUPPORTED Rust 368:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_AccountLogon_CredentialValidation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce923f_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 369:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_AccountLogon_KerbCredentialValidation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9242_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 370:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_AccountLogon_Kerberos: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9240_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 371:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_AccountLogon_Others: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9241_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 372:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_AccountManagement: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6997984e_797a_11d9_bed3_505054503030);

// UNSUPPORTED Rust 373:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_AccountManagement_ApplicationGroup: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9239_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 374:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_AccountManagement_ComputerAccount: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9236_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 375:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_AccountManagement_DistributionGroup: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9238_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 376:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_AccountManagement_Others: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce923a_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 377:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_AccountManagement_SecurityGroup: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9237_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 378:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_AccountManagement_UserAccount: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9235_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 379:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_DSAccess_DSAccess: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce923b_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 380:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_DetailedTracking: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6997984c_797a_11d9_bed3_505054503030);

// UNSUPPORTED Rust 381:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_DetailedTracking_DpapiActivity: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce922d_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 382:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_DetailedTracking_PnpActivity: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9248_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 383:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_DetailedTracking_ProcessCreation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce922b_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 384:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_DetailedTracking_ProcessTermination: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce922c_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 385:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_DetailedTracking_RpcCall: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce922e_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 386:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_DetailedTracking_TokenRightAdjusted: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce924a_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 387:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_DirectoryServiceAccess: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6997984f_797a_11d9_bed3_505054503030);

// UNSUPPORTED Rust 388:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_DsAccess_AdAuditChanges: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce923c_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 389:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_Ds_DetailedReplication: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce923e_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 390:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_Ds_Replication: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce923d_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 391:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_Logon: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x69979849_797a_11d9_bed3_505054503030);

// UNSUPPORTED Rust 392:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_Logon_AccountLockout: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9217_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 393:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_Logon_Claims: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9247_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 394:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_Logon_Groups: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9249_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 395:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_Logon_IPSecMainMode: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9218_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 396:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_Logon_IPSecQuickMode: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9219_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 397:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_Logon_IPSecUserMode: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce921a_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 398:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_Logon_Logoff: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9216_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 399:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_Logon_Logon: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9215_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 400:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_Logon_NPS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9243_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 401:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_Logon_Others: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce921c_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 402:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_Logon_SpecialLogon: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce921b_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 403:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_ObjectAccess: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6997984a_797a_11d9_bed3_505054503030);

// UNSUPPORTED Rust 404:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_ObjectAccess_ApplicationGenerated: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9222_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 405:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_ObjectAccess_CbacStaging: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9246_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 406:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_ObjectAccess_CertificationServices: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9221_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 407:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_ObjectAccess_DetailedFileShare: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9244_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 408:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_ObjectAccess_FileSystem: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce921d_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 409:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_ObjectAccess_FirewallConnection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9226_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 410:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_ObjectAccess_FirewallPacketDrops: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9225_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 411:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_ObjectAccess_Handle: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9223_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 412:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_ObjectAccess_Kernel: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce921f_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 413:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_ObjectAccess_Other: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9227_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 414:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_ObjectAccess_Registry: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce921e_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 415:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_ObjectAccess_RemovableStorage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9245_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 416:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_ObjectAccess_Sam: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9220_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 417:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_ObjectAccess_Share: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9224_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 418:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_PolicyChange: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6997984d_797a_11d9_bed3_505054503030);

// UNSUPPORTED Rust 419:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_PolicyChange_AuditPolicy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce922f_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 420:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_PolicyChange_AuthenticationPolicy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9230_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 421:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_PolicyChange_AuthorizationPolicy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9231_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 422:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_PolicyChange_MpsscvRulePolicy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9232_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 423:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_PolicyChange_Others: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9234_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 424:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_PolicyChange_WfpIPSecPolicy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9233_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 425:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_PrivilegeUse: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6997984b_797a_11d9_bed3_505054503030);

// UNSUPPORTED Rust 426:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_PrivilegeUse_NonSensitive: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9229_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 427:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_PrivilegeUse_Others: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce922a_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 428:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_PrivilegeUse_Sensitive: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9228_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 429:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_System: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x69979848_797a_11d9_bed3_505054503030);

// UNSUPPORTED Rust 430:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_System_IPSecDriverEvents: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9213_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 431:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_System_Integrity: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9212_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 432:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_System_Others: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9214_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 433:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_System_SecurityStateChange: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9210_69ae_11d9_bed3_505054503030);

// UNSUPPORTED Rust 434:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Audit_System_SecuritySubsystemExtension: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cce9211_69ae_11d9_bed3_505054503030);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CENTRAL_ACCESS_POLICY` (
    public var `CAPID`: `super`.`super`.`PSID`,
    public var `Name`: `LSA_UNICODE_STRING`,
    public var `Description`: `LSA_UNICODE_STRING`,
    public var `ChangeId`: `LSA_UNICODE_STRING`,
    public var `Flags`: UInt,
    public var `CAPECount`: UInt,
    public var `CAPEs`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`CENTRAL_ACCESS_POLICY_ENTRY`>>?,
)
// UNSUPPORTED Rust 446:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CENTRAL_ACCESS_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CENTRAL_ACCESS_POLICY_ENTRY` (
    public var `Name`: `LSA_UNICODE_STRING`,
    public var `Description`: `LSA_UNICODE_STRING`,
    public var `ChangeId`: `LSA_UNICODE_STRING`,
    public var `LengthAppliesTo`: UInt,
    public var `AppliesTo`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `LengthSD`: UInt,
    public var `SD`: `super`.`super`.`PSECURITY_DESCRIPTOR`,
    public var `LengthStagedSD`: UInt,
    public var `StagedSD`: `super`.`super`.`PSECURITY_DESCRIPTOR`,
    public var `Flags`: UInt,
)
// UNSUPPORTED Rust 465:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CENTRAL_ACCESS_POLICY_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CENTRAL_ACCESS_POLICY_OWNER_RIGHTS_PRESENT_FLAG`: UInt = 1u;
public const val `CENTRAL_ACCESS_POLICY_STAGED_FLAG`: UInt = 65536u;
public const val `CENTRAL_ACCESS_POLICY_STAGED_OWNER_RIGHTS_PRESENT_FLAG`: UInt = 256u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CHANGE_PASSWORD_FN_A` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, Boolean, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CHANGE_PASSWORD_FN_W` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, Boolean, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CLEAR_BLOCK` (
    public var `data`: ByteArray,
)
// UNSUPPORTED Rust 480:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CLEAR_BLOCK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLEAR_BLOCK_LENGTH`: UInt = 8u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `CLOUDAP_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CloudAP");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `CLOUDAP_NAME_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CloudAP");
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `COMPLETE_AUTH_TOKEN_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `CREDP_FLAGS_CLEAR_PASSWORD`: UInt = 8u;
public const val `CREDP_FLAGS_DONT_CACHE_TI`: UInt = 4u;
public const val `CREDP_FLAGS_IN_PROCESS`: UInt = 1u;
public const val `CREDP_FLAGS_TRUSTED_CALLER`: UInt = 32u;
public const val `CREDP_FLAGS_USER_ENCRYPTED_PASSWORD`: UInt = 16u;
public const val `CREDP_FLAGS_USE_MIDL_HEAP`: UInt = 2u;
public const val `CREDP_FLAGS_VALIDATE_PROXY_TARGET`: UInt = 64u;
public typealias `CRED_FETCH` = Int;
public const val `CRED_MARSHALED_TI_SIZE_SIZE`: UInt = 12u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPTO_SETTINGS` (
    public var `eAlgorithmUsage`: `eTlsAlgorithmUsage`,
    public var `strCngAlgId`: `LSA_UNICODE_STRING`,
    public var `cChainingModes`: UInt,
    public var `rgstrChainingModes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?,
    public var `dwMinBitLength`: UInt,
    public var `dwMaxBitLength`: UInt,
)
// UNSUPPORTED Rust 509:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPTO_SETTINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CYPHER_BLOCK_LENGTH`: UInt = 8u;
public const val `CertHashInfo`: `KERB_CERTIFICATE_INFO_TYPE` = 1;
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `ClOUDAP_NAME_A`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("CloudAP");
public const val `CollisionOther`: `LSA_FOREST_TRUST_COLLISION_RECORD_TYPE` = 2;
public const val `CollisionTdo`: `LSA_FOREST_TRUST_COLLISION_RECORD_TYPE` = 0;
public const val `CollisionXref`: `LSA_FOREST_TRUST_COLLISION_RECORD_TYPE` = 1;
public const val `CredFetchDPAPI`: `CRED_FETCH` = 1;
public const val `CredFetchDefault`: `CRED_FETCH` = 0;
public const val `CredFetchForced`: `CRED_FETCH` = 2;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `CredFreeCredentialsFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`ENCRYPTED_CREDENTIALW`>>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `CredReadDomainCredentialsFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`CREDENTIAL_TARGET_INFORMATIONW`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`ENCRYPTED_CREDENTIALW`>>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `CredReadFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?, UInt, `windows_sys`.`core`.`PCWSTR`, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`ENCRYPTED_CREDENTIALW`>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `CredWriteFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`ENCRYPTED_CREDENTIALW`>?, UInt) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CrediUnmarshalandDecodeStringFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `DECRYPT_MESSAGE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `DEFAULT_TLS_SSP_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Default TLS SSP");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `DEFAULT_TLS_SSP_NAME_A`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("Default TLS SSP");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `DEFAULT_TLS_SSP_NAME_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Default TLS SSP");
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `DELETE_SECURITY_CONTEXT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `DOMAIN_LOCKOUT_ADMINS`: `DOMAIN_PASSWORD_PROPERTIES` = 8u;
public const val `DOMAIN_NO_LM_OWF_CHANGE`: Int = 64;
public const val `DOMAIN_PASSWORD_COMPLEX`: `DOMAIN_PASSWORD_PROPERTIES` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOMAIN_PASSWORD_INFORMATION` (
    public var `MinPasswordLength`: UShort,
    public var `PasswordHistoryLength`: UShort,
    public var `PasswordProperties`: `DOMAIN_PASSWORD_PROPERTIES`,
    public var `MaxPasswordAge`: Long,
    public var `MinPasswordAge`: Long,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ENCRYPTED_CREDENTIALW` (
    public var `Cred`: `super`.`super`.`Credentials`.`CREDENTIALW`,
    public var `ClearCredentialBlobSize`: UInt,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `ENCRYPT_MESSAGE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ENUMERATE_SECURITY_PACKAGES_FN_A` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SecPkgInfoA`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ENUMERATE_SECURITY_PACKAGES_FN_W` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SecPkgInfoW`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public typealias `EXPORT_SECURITY_CONTEXT_FLAGS` = UInt;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `EXPORT_SECURITY_CONTEXT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBuffer`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public typealias `EXTENDED_NAME_FORMAT` = Int;
public const val `E_RM_UNKNOWN_ERROR`: Int = -1073415165;
public const val `ExternallySuppliedCredKey`: `MSV1_0_CREDENTIAL_KEY_TYPE` = 4;
public const val `FACILITY_SL_ITF`: UInt = 4u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FREE_CONTEXT_BUFFER_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `FREE_CREDENTIALS_HANDLE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `ForestTrustBinaryInfo`: `LSA_FOREST_TRUST_RECORD_TYPE` = 3;
public const val `ForestTrustDomainInfo`: `LSA_FOREST_TRUST_RECORD_TYPE` = 2;
public const val `ForestTrustRecordTypeLast`: `LSA_FOREST_TRUST_RECORD_TYPE` = 4;
public const val `ForestTrustScannerInfo`: `LSA_FOREST_TRUST_RECORD_TYPE` = 4;
public const val `ForestTrustTopLevelName`: `LSA_FOREST_TRUST_RECORD_TYPE` = 0;
public const val `ForestTrustTopLevelNameEx`: `LSA_FOREST_TRUST_RECORD_TYPE` = 1;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `ID_CAP_SLAPI`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("slapiQueryLicenseValue");
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `IMPERSONATE_SECURITY_CONTEXT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `IMPORT_SECURITY_CONTEXT_FN_A` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBuffer`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `IMPORT_SECURITY_CONTEXT_FN_W` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBuffer`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `INITIALIZE_SECURITY_CONTEXT_FN_A` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, UInt, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `INITIALIZE_SECURITY_CONTEXT_FN_W` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, UInt, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `INIT_SECURITY_INTERFACE_A` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> /* Rust *mut */ kotlinx.cinterop.CPointer<`SecurityFunctionTableA`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `INIT_SECURITY_INTERFACE_W` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> /* Rust *mut */ kotlinx.cinterop.CPointer<`SecurityFunctionTableW`>?>>>;
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KDC_PROXY_CACHE_ENTRY_DATA` (
    public var `SinceLastUsed`: ULong,
    public var `DomainName`: `LSA_UNICODE_STRING`,
    public var `ProxyServerName`: `LSA_UNICODE_STRING`,
    public var `ProxyServerVdir`: `LSA_UNICODE_STRING`,
    public var `ProxyServerPort`: UShort,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `CredUserName`: `LSA_UNICODE_STRING`,
    public var `CredDomainName`: `LSA_UNICODE_STRING`,
    public var `GlobalCache`: Boolean,
)
public const val `KDC_PROXY_SETTINGS_FLAGS_FORCEPROXY`: UInt = 1u;
public const val `KDC_PROXY_SETTINGS_V1`: UInt = 1u;
public const val `KERBEROS_REVISION`: UInt = 6u;
public const val `KERBEROS_VERSION`: UInt = 5u;
public typealias `KERB_ADDRESS_TYPE` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_ADD_BINDING_CACHE_ENTRY_EX_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `RealmName`: `LSA_UNICODE_STRING`,
    public var `KdcAddress`: `LSA_UNICODE_STRING`,
    public var `AddressType`: `KERB_ADDRESS_TYPE`,
    public var `DcFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_ADD_BINDING_CACHE_ENTRY_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `RealmName`: `LSA_UNICODE_STRING`,
    public var `KdcAddress`: `LSA_UNICODE_STRING`,
    public var `AddressType`: `KERB_ADDRESS_TYPE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_ADD_CREDENTIALS_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `UserName`: `LSA_UNICODE_STRING`,
    public var `DomainName`: `LSA_UNICODE_STRING`,
    public var `Password`: `LSA_UNICODE_STRING`,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `Flags`: `KERB_REQUEST_FLAGS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_ADD_CREDENTIALS_REQUEST_EX` (
    public var `Credentials`: `KERB_ADD_CREDENTIALS_REQUEST`,
    public var `PrincipalNameCount`: UInt,
    public var `PrincipalNames`: Array<`LSA_UNICODE_STRING`>,
)
// UNSUPPORTED Rust 722:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERB_ADD_CREDENTIALS_REQUEST_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_AUTH_DATA` (
    public var `Type`: UInt,
    public var `Length`: UInt,
    public var `Data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 734:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERB_AUTH_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_BINDING_CACHE_ENTRY_DATA` (
    public var `DiscoveryTime`: ULong,
    public var `RealmName`: `LSA_UNICODE_STRING`,
    public var `KdcAddress`: `LSA_UNICODE_STRING`,
    public var `AddressType`: `KERB_ADDRESS_TYPE`,
    public var `Flags`: UInt,
    public var `DcFlags`: UInt,
    public var `CacheFlags`: UInt,
    public var `KdcName`: `LSA_UNICODE_STRING`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_CERTIFICATE_HASHINFO` (
    public var `StoreNameLength`: UShort,
    public var `HashLength`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_CERTIFICATE_INFO` (
    public var `CertInfoSize`: UInt,
    public var `InfoType`: UInt,
)
public typealias `KERB_CERTIFICATE_INFO_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_CERTIFICATE_LOGON` (
    public var `MessageType`: `KERB_LOGON_SUBMIT_TYPE`,
    public var `DomainName`: `LSA_UNICODE_STRING`,
    public var `UserName`: `LSA_UNICODE_STRING`,
    public var `Pin`: `LSA_UNICODE_STRING`,
    public var `Flags`: UInt,
    public var `CspDataLength`: UInt,
    public var `CspData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 775:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERB_CERTIFICATE_LOGON {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KERB_CERTIFICATE_LOGON_FLAG_CHECK_DUPLICATES`: UInt = 1u;
public const val `KERB_CERTIFICATE_LOGON_FLAG_USE_CERTIFICATE_INFO`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_CERTIFICATE_S4U_LOGON` (
    public var `MessageType`: `KERB_LOGON_SUBMIT_TYPE`,
    public var `Flags`: UInt,
    public var `UserPrincipalName`: `LSA_UNICODE_STRING`,
    public var `DomainName`: `LSA_UNICODE_STRING`,
    public var `CertificateLength`: UInt,
    public var `Certificate`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 792:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERB_CERTIFICATE_S4U_LOGON {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KERB_CERTIFICATE_S4U_LOGON_FLAG_CHECK_DUPLICATES`: UInt = 1u;
public const val `KERB_CERTIFICATE_S4U_LOGON_FLAG_CHECK_LOGONHOURS`: UInt = 2u;
public const val `KERB_CERTIFICATE_S4U_LOGON_FLAG_FAIL_IF_NT_AUTH_POLICY_REQUIRED`: UInt = 4u;
public const val `KERB_CERTIFICATE_S4U_LOGON_FLAG_IDENTIFY`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_CERTIFICATE_UNLOCK_LOGON` (
    public var `Logon`: `KERB_CERTIFICATE_LOGON`,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_CHANGEPASSWORD_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `DomainName`: `LSA_UNICODE_STRING`,
    public var `AccountName`: `LSA_UNICODE_STRING`,
    public var `OldPassword`: `LSA_UNICODE_STRING`,
    public var `NewPassword`: `LSA_UNICODE_STRING`,
    public var `Impersonating`: Boolean,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_CLEANUP_MACHINE_PKINIT_CREDS_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_CLOUD_KERBEROS_DEBUG_DATA` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_CLOUD_KERBEROS_DEBUG_DATA_V0` (
    public var `_bitfield`: UInt,
)
public const val `KERB_CLOUD_KERBEROS_DEBUG_DATA_VERSION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_CLOUD_KERBEROS_DEBUG_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_CLOUD_KERBEROS_DEBUG_RESPONSE` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `Version`: UInt,
    public var `Length`: UInt,
    public var `Data`: UIntArray,
)
// UNSUPPORTED Rust 872:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERB_CLOUD_KERBEROS_DEBUG_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_CRYPTO_KEY` (
    public var `KeyType`: `KERB_CRYPTO_KEY_TYPE`,
    public var `Length`: UInt,
    public var `Value`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 884:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERB_CRYPTO_KEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_CRYPTO_KEY32` (
    public var `KeyType`: Int,
    public var `Length`: UInt,
    public var `Offset`: UInt,
)
public typealias `KERB_CRYPTO_KEY_TYPE` = Int;
public const val `KERB_DECRYPT_FLAG_DEFAULT_KEY`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_DECRYPT_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `Flags`: UInt,
    public var `CryptoType`: Int,
    public var `KeyUsage`: Int,
    public var `Key`: `KERB_CRYPTO_KEY`,
    public var `EncryptedDataSize`: UInt,
    public var `InitialVectorSize`: UInt,
    public var `InitialVector`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `EncryptedData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 912:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERB_DECRYPT_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_DECRYPT_RESPONSE` (
    public var `DecryptedData`: UByteArray,
)
// UNSUPPORTED Rust 922:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_EXTERNAL_NAME` (
    public var `NameType`: Short,
    public var `NameCount`: UShort,
    public var `Names`: Array<`LSA_UNICODE_STRING`>,
)
// UNSUPPORTED Rust 973:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERB_EXTERNAL_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_EXTERNAL_TICKET` (
    public var `ServiceName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`KERB_EXTERNAL_NAME`>?,
    public var `TargetName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`KERB_EXTERNAL_NAME`>?,
    public var `ClientName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`KERB_EXTERNAL_NAME`>?,
    public var `DomainName`: `LSA_UNICODE_STRING`,
    public var `TargetDomainName`: `LSA_UNICODE_STRING`,
    public var `AltTargetDomainName`: `LSA_UNICODE_STRING`,
    public var `SessionKey`: `KERB_CRYPTO_KEY`,
    public var `TicketFlags`: `KERB_TICKET_FLAGS`,
    public var `Flags`: UInt,
    public var `KeyExpirationTime`: Long,
    public var `StartTime`: Long,
    public var `EndTime`: Long,
    public var `RenewUntil`: Long,
    public var `TimeSkew`: Long,
    public var `EncodedTicketSize`: UInt,
    public var `EncodedTicket`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 998:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERB_EXTERNAL_TICKET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_INTERACTIVE_LOGON` (
    public var `MessageType`: `KERB_LOGON_SUBMIT_TYPE`,
    public var `LogonDomainName`: `LSA_UNICODE_STRING`,
    public var `UserName`: `LSA_UNICODE_STRING`,
    public var `Password`: `LSA_UNICODE_STRING`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_INTERACTIVE_PROFILE` (
    public var `MessageType`: `KERB_PROFILE_BUFFER_TYPE`,
    public var `LogonCount`: UShort,
    public var `BadPasswordCount`: UShort,
    public var `LogonTime`: Long,
    public var `LogoffTime`: Long,
    public var `KickOffTime`: Long,
    public var `PasswordLastSet`: Long,
    public var `PasswordCanChange`: Long,
    public var `PasswordMustChange`: Long,
    public var `LogonScript`: `LSA_UNICODE_STRING`,
    public var `HomeDirectory`: `LSA_UNICODE_STRING`,
    public var `FullName`: `LSA_UNICODE_STRING`,
    public var `ProfilePath`: `LSA_UNICODE_STRING`,
    public var `HomeDirectoryDrive`: `LSA_UNICODE_STRING`,
    public var `LogonServer`: `LSA_UNICODE_STRING`,
    public var `UserFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_INTERACTIVE_UNLOCK_LOGON` (
    public var `Logon`: `KERB_INTERACTIVE_LOGON`,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
)
public const val `KERB_LOGON_FLAG_ALLOW_EXPIRED_TICKET`: UInt = 1u;
public const val `KERB_LOGON_FLAG_REDIRECTED`: UInt = 2u;
public typealias `KERB_LOGON_SUBMIT_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_NET_ADDRESS` (
    public var `Family`: UInt,
    public var `Length`: UInt,
    public var `Address`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 1047:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERB_NET_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_NET_ADDRESSES` (
    public var `Number`: UInt,
    public var `Addresses`: Array<`KERB_NET_ADDRESS`>,
)
// UNSUPPORTED Rust 1058:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERB_NET_ADDRESSES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `KERB_PROFILE_BUFFER_TYPE` = Int;
public typealias `KERB_PROTOCOL_MESSAGE_TYPE` = Int;
public const val `KERB_PURGE_ALL_TICKETS`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_PURGE_BINDING_CACHE_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_PURGE_KDC_PROXY_CACHE_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `Flags`: UInt,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_PURGE_KDC_PROXY_CACHE_RESPONSE` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `CountOfPurged`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_PURGE_TKT_CACHE_EX_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `Flags`: UInt,
    public var `TicketTemplate`: `KERB_TICKET_CACHE_INFO_EX`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_PURGE_TKT_CACHE_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `ServerName`: `LSA_UNICODE_STRING`,
    public var `RealmName`: `LSA_UNICODE_STRING`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_QUERY_BINDING_CACHE_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_QUERY_BINDING_CACHE_RESPONSE` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `CountOfEntries`: UInt,
    public var `Entries`: /* Rust *mut */ kotlinx.cinterop.CPointer<`KERB_BINDING_CACHE_ENTRY_DATA`>?,
)
// UNSUPPORTED Rust 1112:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERB_QUERY_BINDING_CACHE_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_QUERY_DOMAIN_EXTENDED_POLICIES_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `Flags`: UInt,
    public var `DomainName`: `LSA_UNICODE_STRING`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_QUERY_DOMAIN_EXTENDED_POLICIES_RESPONSE` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `Flags`: UInt,
    public var `ExtendedPolicies`: UInt,
    public var `DsFlags`: UInt,
)
public const val `KERB_QUERY_DOMAIN_EXTENDED_POLICIES_RESPONSE_FLAG_DAC_DISABLED`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_QUERY_KDC_PROXY_CACHE_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `Flags`: UInt,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_QUERY_KDC_PROXY_CACHE_RESPONSE` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `CountOfEntries`: UInt,
    public var `Entries`: /* Rust *mut */ kotlinx.cinterop.CPointer<`KDC_PROXY_CACHE_ENTRY_DATA`>?,
)
// UNSUPPORTED Rust 1147:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERB_QUERY_KDC_PROXY_CACHE_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_QUERY_S4U2PROXY_CACHE_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `Flags`: UInt,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_QUERY_S4U2PROXY_CACHE_RESPONSE` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `CountOfCreds`: UInt,
    public var `Creds`: /* Rust *mut */ kotlinx.cinterop.CPointer<`KERB_S4U2PROXY_CRED`>?,
)
// UNSUPPORTED Rust 1166:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERB_QUERY_S4U2PROXY_CACHE_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_QUERY_TKT_CACHE_EX2_RESPONSE` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `CountOfTickets`: UInt,
    public var `Tickets`: Array<`KERB_TICKET_CACHE_INFO_EX2`>,
)
// UNSUPPORTED Rust 1178:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERB_QUERY_TKT_CACHE_EX2_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_QUERY_TKT_CACHE_EX3_RESPONSE` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `CountOfTickets`: UInt,
    public var `Tickets`: Array<`KERB_TICKET_CACHE_INFO_EX3`>,
)
// UNSUPPORTED Rust 1190:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERB_QUERY_TKT_CACHE_EX3_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_QUERY_TKT_CACHE_EX_RESPONSE` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `CountOfTickets`: UInt,
    public var `Tickets`: Array<`KERB_TICKET_CACHE_INFO_EX`>,
)
// UNSUPPORTED Rust 1202:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERB_QUERY_TKT_CACHE_EX_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_QUERY_TKT_CACHE_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_QUERY_TKT_CACHE_RESPONSE` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `CountOfTickets`: UInt,
    public var `Tickets`: Array<`KERB_TICKET_CACHE_INFO`>,
)
// UNSUPPORTED Rust 1220:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERB_QUERY_TKT_CACHE_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KERB_REFRESH_POLICY_KDC`: UInt = 2u;
public const val `KERB_REFRESH_POLICY_KERBEROS`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_REFRESH_POLICY_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `Flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_REFRESH_POLICY_RESPONSE` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `Flags`: UInt,
)
public const val `KERB_REFRESH_SCCRED_GETTGT`: UInt = 1u;
public const val `KERB_REFRESH_SCCRED_RELEASE`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_REFRESH_SCCRED_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `CredentialBlob`: `LSA_UNICODE_STRING`,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `Flags`: UInt,
)
public const val `KERB_REQUEST_ADD_CREDENTIAL`: `KERB_REQUEST_FLAGS` = 1u;
public typealias `KERB_REQUEST_FLAGS` = UInt;
public const val `KERB_REQUEST_REMOVE_CREDENTIAL`: `KERB_REQUEST_FLAGS` = 4u;
public const val `KERB_REQUEST_REPLACE_CREDENTIAL`: `KERB_REQUEST_FLAGS` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_RETRIEVE_KEY_TAB_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `Flags`: UInt,
    public var `UserName`: `LSA_UNICODE_STRING`,
    public var `DomainName`: `LSA_UNICODE_STRING`,
    public var `Password`: `LSA_UNICODE_STRING`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_RETRIEVE_KEY_TAB_RESPONSE` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `KeyTabLength`: UInt,
    public var `KeyTab`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 1269:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_RETRIEVE_TKT_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `TargetName`: `LSA_UNICODE_STRING`,
    public var `TicketFlags`: UInt,
    public var `CacheOptions`: UInt,
    public var `EncryptionType`: `KERB_CRYPTO_KEY_TYPE`,
    public var `CredentialsHandle`: `super`.`super`.`Credentials`.`SecHandle`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_RETRIEVE_TKT_RESPONSE` (
    public var `Ticket`: `KERB_EXTERNAL_TICKET`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_S4U2PROXY_CACHE_ENTRY_INFO` (
    public var `ServerName`: `LSA_UNICODE_STRING`,
    public var `Flags`: UInt,
    public var `LastStatus`: `super`.`super`.`super`.`Foundation`.`NTSTATUS`,
    public var `Expiry`: Long,
)
public const val `KERB_S4U2PROXY_CACHE_ENTRY_INFO_FLAG_NEGATIVE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_S4U2PROXY_CRED` (
    public var `UserName`: `LSA_UNICODE_STRING`,
    public var `DomainName`: `LSA_UNICODE_STRING`,
    public var `Flags`: UInt,
    public var `LastStatus`: `super`.`super`.`super`.`Foundation`.`NTSTATUS`,
    public var `Expiry`: Long,
    public var `CountOfEntries`: UInt,
    public var `Entries`: /* Rust *mut */ kotlinx.cinterop.CPointer<`KERB_S4U2PROXY_CACHE_ENTRY_INFO`>?,
)
// UNSUPPORTED Rust 1319:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERB_S4U2PROXY_CRED {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KERB_S4U2PROXY_CRED_FLAG_NEGATIVE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_S4U_LOGON` (
    public var `MessageType`: `KERB_LOGON_SUBMIT_TYPE`,
    public var `Flags`: UInt,
    public var `ClientUpn`: `LSA_UNICODE_STRING`,
    public var `ClientRealm`: `LSA_UNICODE_STRING`,
)
public const val `KERB_S4U_LOGON_FLAG_CHECK_LOGONHOURS`: UInt = 2u;
public const val `KERB_S4U_LOGON_FLAG_IDENTIFY`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_SETPASSWORD_EX_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `CredentialsHandle`: `super`.`super`.`Credentials`.`SecHandle`,
    public var `Flags`: UInt,
    public var `AccountRealm`: `LSA_UNICODE_STRING`,
    public var `AccountName`: `LSA_UNICODE_STRING`,
    public var `Password`: `LSA_UNICODE_STRING`,
    public var `ClientRealm`: `LSA_UNICODE_STRING`,
    public var `ClientName`: `LSA_UNICODE_STRING`,
    public var `Impersonating`: Boolean,
    public var `KdcAddress`: `LSA_UNICODE_STRING`,
    public var `KdcAddressType`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_SETPASSWORD_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `CredentialsHandle`: `super`.`super`.`Credentials`.`SecHandle`,
    public var `Flags`: UInt,
    public var `DomainName`: `LSA_UNICODE_STRING`,
    public var `AccountName`: `LSA_UNICODE_STRING`,
    public var `Password`: `LSA_UNICODE_STRING`,
)
public const val `KERB_SETPASS_USE_CREDHANDLE`: UInt = 2u;
public const val `KERB_SETPASS_USE_LOGONID`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_SMART_CARD_LOGON` (
    public var `MessageType`: `KERB_LOGON_SUBMIT_TYPE`,
    public var `Pin`: `LSA_UNICODE_STRING`,
    public var `CspDataLength`: UInt,
    public var `CspData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 1374:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERB_SMART_CARD_LOGON {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_SMART_CARD_PROFILE` (
    public var `Profile`: `KERB_INTERACTIVE_PROFILE`,
    public var `CertificateSize`: UInt,
    public var `CertificateData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 1386:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERB_SMART_CARD_PROFILE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_SMART_CARD_UNLOCK_LOGON` (
    public var `Logon`: `KERB_SMART_CARD_LOGON`,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_SUBMIT_TKT_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `Flags`: UInt,
    public var `Key`: `KERB_CRYPTO_KEY32`,
    public var `KerbCredSize`: UInt,
    public var `KerbCredOffset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_TICKET_CACHE_INFO` (
    public var `ServerName`: `LSA_UNICODE_STRING`,
    public var `RealmName`: `LSA_UNICODE_STRING`,
    public var `StartTime`: Long,
    public var `EndTime`: Long,
    public var `RenewTime`: Long,
    public var `EncryptionType`: Int,
    public var `TicketFlags`: `KERB_TICKET_FLAGS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_TICKET_CACHE_INFO_EX` (
    public var `ClientName`: `LSA_UNICODE_STRING`,
    public var `ClientRealm`: `LSA_UNICODE_STRING`,
    public var `ServerName`: `LSA_UNICODE_STRING`,
    public var `ServerRealm`: `LSA_UNICODE_STRING`,
    public var `StartTime`: Long,
    public var `EndTime`: Long,
    public var `RenewTime`: Long,
    public var `EncryptionType`: Int,
    public var `TicketFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_TICKET_CACHE_INFO_EX2` (
    public var `ClientName`: `LSA_UNICODE_STRING`,
    public var `ClientRealm`: `LSA_UNICODE_STRING`,
    public var `ServerName`: `LSA_UNICODE_STRING`,
    public var `ServerRealm`: `LSA_UNICODE_STRING`,
    public var `StartTime`: Long,
    public var `EndTime`: Long,
    public var `RenewTime`: Long,
    public var `EncryptionType`: Int,
    public var `TicketFlags`: UInt,
    public var `SessionKeyType`: UInt,
    public var `BranchId`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_TICKET_CACHE_INFO_EX3` (
    public var `ClientName`: `LSA_UNICODE_STRING`,
    public var `ClientRealm`: `LSA_UNICODE_STRING`,
    public var `ServerName`: `LSA_UNICODE_STRING`,
    public var `ServerRealm`: `LSA_UNICODE_STRING`,
    public var `StartTime`: Long,
    public var `EndTime`: Long,
    public var `RenewTime`: Long,
    public var `EncryptionType`: Int,
    public var `TicketFlags`: UInt,
    public var `SessionKeyType`: UInt,
    public var `BranchId`: UInt,
    public var `CacheFlags`: UInt,
    public var `KdcCalled`: `LSA_UNICODE_STRING`,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KERB_TICKET_LOGON` (
    public var `MessageType`: `KERB_LOGON_SUBMIT_TYPE`,
    public var `Flags`: UInt,
    public var `ServiceTicketLength`: UInt,
    public var `TicketGrantingTicketLength`: UInt,
    public var `ServiceTicket`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `TicketGrantingTicket`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 1491:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KERB_TICKET_LOGON {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_TICKET_PROFILE` (
    public var `Profile`: `KERB_INTERACTIVE_PROFILE`,
    public var `SessionKey`: `KERB_CRYPTO_KEY`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_TICKET_UNLOCK_LOGON` (
    public var `Logon`: `KERB_TICKET_LOGON`,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
)
public const val `KERB_TRANSFER_CRED_CLEANUP_CREDENTIALS`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERB_TRANSFER_CRED_REQUEST` (
    public var `MessageType`: `KERB_PROTOCOL_MESSAGE_TYPE`,
    public var `OriginLogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `DestinationLogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `Flags`: UInt,
)
public const val `KERB_TRANSFER_CRED_WITH_TICKETS`: UInt = 1u;
public const val `KERB_USE_DEFAULT_TICKET_FLAGS`: UInt = 0u;
public const val `KERB_WRAP_NO_ENCRYPT`: UInt = 2147483649u;
public const val `KERN_CONTEXT_CERT_INFO_V1`: UInt = 0u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `KRB_ANONYMOUS_STRING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ANONYMOUS");
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
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `KRB_WELLKNOWN_STRING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WELLKNOWN");
public typealias `KSEC_CONTEXT_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KSEC_LIST_ENTRY` (
    public var `List`: `super`.`super`.`super`.`System`.`Kernel`.`LIST_ENTRY`,
    public var `RefCount`: Int,
    public var `Signature`: UInt,
    public var `OwningList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1549:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `KspCompleteTokenFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `KspDeleteContextFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `KspGetTokenFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HANDLE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `KspInitContextFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`SecBuffer`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public typealias `KspInitPackageFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`SECPKG_KERNEL_FUNCTIONS`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `KspMakeSignatureFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, UInt) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `KspMapHandleFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `KspQueryAttributesFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `KspSealMessageFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, UInt) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `KspSerializeAuthDataFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `KspSetPagingModeFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Boolean) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `KspUnsealMessageFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `KspVerifySignatureFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
public const val `LCRED_CRED_EXISTS`: UInt = 1u;
public const val `LCRED_STATUS_NOCRED`: UInt = 0u;
public const val `LCRED_STATUS_UNKNOWN_ISSUER`: UInt = 2u;
public const val `LOGON_CACHED_ACCOUNT`: `MSV_SUB_AUTHENTICATION_FILTER` = 4u;
public const val `LOGON_EXTRA_SIDS`: `MSV_SUB_AUTHENTICATION_FILTER` = 32u;
public const val `LOGON_GRACE_LOGON`: UInt = 16777216u;
public const val `LOGON_GUEST`: `MSV_SUB_AUTHENTICATION_FILTER` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LOGON_HOURS` (
    public var `UnitsPerWeek`: UShort,
    public var `LogonHours`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 1637:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LSA_ADT_LEGACY_SECURITY_SOURCE_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Security");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LSA_ADT_SECURITY_SOURCE_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Microsoft-Windows-Security-Auditing");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LSA_AP_NAME_CALL_PACKAGE`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("LsaApCallPackage\u0000");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LSA_AP_NAME_CALL_PACKAGE_PASSTHROUGH`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("LsaApCallPackagePassthrough\u0000");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LSA_AP_NAME_CALL_PACKAGE_UNTRUSTED`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("LsaApCallPackageUntrusted\u0000");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LSA_AP_NAME_INITIALIZE_PACKAGE`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("LsaApInitializePackage\u0000");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LSA_AP_NAME_LOGON_TERMINATED`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("LsaApLogonTerminated\u0000");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LSA_AP_NAME_LOGON_USER`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("LsaApLogonUser\u0000");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LSA_AP_NAME_LOGON_USER_EX`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("LsaApLogonUserEx\u0000");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LSA_AP_NAME_LOGON_USER_EX2`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("LsaApLogonUserEx2\u0000");
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LSA_AP_POST_LOGON_USER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`SECPKG_POST_LOGON_USER_INFO`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LSA_AUTH_INFORMATION` (
    public var `LastUpdateTime`: Long,
    public var `AuthType`: `LSA_AUTH_INFORMATION_AUTH_TYPE`,
    public var `AuthInfoLength`: UInt,
    public var `AuthInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 1685:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LSA_AUTH_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `LSA_AUTH_INFORMATION_AUTH_TYPE` = UInt;
public const val `LSA_CALL_LICENSE_SERVER`: UInt = 2147483648u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LSA_DISPATCH_TABLE` (
    public var `CreateLogonSession`: `PLSA_CREATE_LOGON_SESSION`,
    public var `DeleteLogonSession`: `PLSA_DELETE_LOGON_SESSION`,
    public var `AddCredential`: `PLSA_ADD_CREDENTIAL`,
    public var `GetCredentials`: `PLSA_GET_CREDENTIALS`,
    public var `DeleteCredential`: `PLSA_DELETE_CREDENTIAL`,
    public var `AllocateLsaHeap`: `PLSA_ALLOCATE_LSA_HEAP`,
    public var `FreeLsaHeap`: `PLSA_FREE_LSA_HEAP`,
    public var `AllocateClientBuffer`: `PLSA_ALLOCATE_CLIENT_BUFFER`,
    public var `FreeClientBuffer`: `PLSA_FREE_CLIENT_BUFFER`,
    public var `CopyToClientBuffer`: `PLSA_COPY_TO_CLIENT_BUFFER`,
    public var `CopyFromClientBuffer`: `PLSA_COPY_FROM_CLIENT_BUFFER`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LSA_ENUMERATION_INFORMATION` (
    public var `Sid`: `super`.`super`.`PSID`,
)
// UNSUPPORTED Rust 1712:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LSA_ENUMERATION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LSA_FOREST_TRUST_BINARY_DATA` (
    public var `Length`: UInt,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 1723:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LSA_FOREST_TRUST_BINARY_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LSA_FOREST_TRUST_COLLISION_INFORMATION` (
    public var `RecordCount`: UInt,
    public var `Entries`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_FOREST_TRUST_COLLISION_RECORD`>>?,
)
// UNSUPPORTED Rust 1734:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LSA_FOREST_TRUST_COLLISION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LSA_FOREST_TRUST_COLLISION_RECORD` (
    public var `Index`: UInt,
    public var `Type`: `LSA_FOREST_TRUST_COLLISION_RECORD_TYPE`,
    public var `Flags`: UInt,
    public var `Name`: `LSA_UNICODE_STRING`,
)
public typealias `LSA_FOREST_TRUST_COLLISION_RECORD_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LSA_FOREST_TRUST_DOMAIN_INFO` (
    public var `Sid`: `super`.`super`.`PSID`,
    public var `DnsName`: `LSA_UNICODE_STRING`,
    public var `NetbiosName`: `LSA_UNICODE_STRING`,
)
// UNSUPPORTED Rust 1755:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LSA_FOREST_TRUST_DOMAIN_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LSA_FOREST_TRUST_INFORMATION` (
    public var `RecordCount`: UInt,
    public var `Entries`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_FOREST_TRUST_RECORD`>>?,
)
// UNSUPPORTED Rust 1766:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LSA_FOREST_TRUST_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LSA_FOREST_TRUST_INFORMATION2` (
    public var `RecordCount`: UInt,
    public var `Entries`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_FOREST_TRUST_RECORD2`>>?,
)
// UNSUPPORTED Rust 1777:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LSA_FOREST_TRUST_INFORMATION2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LSA_FOREST_TRUST_RECORD` (
    public var `Flags`: UInt,
    public var `ForestTrustType`: `LSA_FOREST_TRUST_RECORD_TYPE`,
    public var `Time`: Long,
    public var `ForestTrustData`: `LSA_FOREST_TRUST_RECORD_0`,
)
// UNSUPPORTED Rust 1790:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LSA_FOREST_TRUST_RECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1795:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union LSA_FOREST_TRUST_RECORD_0 {
//     pub TopLevelName: LSA_UNICODE_STRING,
//     pub DomainInfo: LSA_FOREST_TRUST_DOMAIN_INFO,
//     pub Data: LSA_FOREST_TRUST_BINARY_DATA,
// }

// UNSUPPORTED Rust 1802:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LSA_FOREST_TRUST_RECORD_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LSA_FOREST_TRUST_RECORD2` (
    public var `Flags`: UInt,
    public var `ForestTrustType`: `LSA_FOREST_TRUST_RECORD_TYPE`,
    public var `Time`: Long,
    public var `ForestTrustData`: `LSA_FOREST_TRUST_RECORD2_0`,
)
// UNSUPPORTED Rust 1815:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LSA_FOREST_TRUST_RECORD2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1820:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union LSA_FOREST_TRUST_RECORD2_0 {
//     pub TopLevelName: LSA_UNICODE_STRING,
//     pub DomainInfo: LSA_FOREST_TRUST_DOMAIN_INFO,
//     pub BinaryData: LSA_FOREST_TRUST_BINARY_DATA,
//     pub ScannerInfo: LSA_FOREST_TRUST_SCANNER_INFO,
// }

// UNSUPPORTED Rust 1828:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LSA_FOREST_TRUST_RECORD2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `LSA_FOREST_TRUST_RECORD_TYPE` = Int;
public const val `LSA_FOREST_TRUST_RECORD_TYPE_UNRECOGNIZED`: UInt = 2147483648u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LSA_FOREST_TRUST_SCANNER_INFO` (
    public var `DomainSid`: `super`.`super`.`PSID`,
    public var `DnsName`: `LSA_UNICODE_STRING`,
    public var `NetbiosName`: `LSA_UNICODE_STRING`,
)
// UNSUPPORTED Rust 1842:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LSA_FOREST_TRUST_SCANNER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LSA_FTRECORD_DISABLED_REASONS`: Int = 65535;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LSA_GLOBAL_SECRET_PREFIX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("G\$");
public const val `LSA_GLOBAL_SECRET_PREFIX_LENGTH`: UInt = 2u;
public typealias `LSA_HANDLE` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LSA_LAST_INTER_LOGON_INFO` (
    public var `LastSuccessfulLogon`: Long,
    public var `LastFailedLogon`: Long,
    public var `FailedAttemptCountSinceLastSuccessfulLogon`: UInt,
)
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LSA_LOCAL_SECRET_PREFIX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("L\$");
public const val `LSA_LOCAL_SECRET_PREFIX_LENGTH`: UInt = 2u;
public const val `LSA_LOOKUP_DISALLOW_CONNECTED_ACCOUNT_INTERNET_SID`: UInt = 2147483648u;
public typealias `LSA_LOOKUP_DOMAIN_INFO_CLASS` = Int;
public const val `LSA_LOOKUP_ISOLATED_AS_LOCAL`: UInt = 2147483648u;
public const val `LSA_LOOKUP_PREFER_INTERNET_NAMES`: UInt = 1073741824u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LSA_MACHINE_SECRET_PREFIX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("M\$");
public const val `LSA_MAXIMUM_ENUMERATION_LENGTH`: UInt = 32000u;
public const val `LSA_MAXIMUM_SID_COUNT`: Int = 256;
public const val `LSA_MODE_INDIVIDUAL_ACCOUNTS`: Int = 2;
public const val `LSA_MODE_LOG_FULL`: Int = 8;
public const val `LSA_MODE_MANDATORY_ACCESS`: Int = 4;
public const val `LSA_MODE_PASSWORD_PROTECTED`: Int = 1;
public const val `LSA_NB_DISABLED_ADMIN`: Int = 4;
public const val `LSA_NB_DISABLED_CONFLICT`: Int = 8;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LSA_OBJECT_ATTRIBUTES` (
    public var `Length`: UInt,
    public var `RootDirectory`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `ObjectName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?,
    public var `Attributes`: UInt,
    public var `SecurityDescriptor`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `SecurityQualityOfService`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1883:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LSA_OBJECT_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LSA_QUERY_CLIENT_PRELOGON_SESSION_ID`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LSA_REFERENCED_DOMAIN_LIST` (
    public var `Entries`: UInt,
    public var `Domains`: /* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_TRUST_INFORMATION`>?,
)
// UNSUPPORTED Rust 1895:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LSA_REFERENCED_DOMAIN_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LSA_SCANNER_INFO_ADMIN_ALL_FLAGS`: Int = 1;
public const val `LSA_SCANNER_INFO_DISABLE_AUTH_TARGET_VALIDATION`: Int = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Credentials", feature = "Win32_System_Threading"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LSA_SECPKG_FUNCTION_TABLE` (
    public var `CreateLogonSession`: `PLSA_CREATE_LOGON_SESSION`,
    public var `DeleteLogonSession`: `PLSA_DELETE_LOGON_SESSION`,
    public var `AddCredential`: `PLSA_ADD_CREDENTIAL`,
    public var `GetCredentials`: `PLSA_GET_CREDENTIALS`,
    public var `DeleteCredential`: `PLSA_DELETE_CREDENTIAL`,
    public var `AllocateLsaHeap`: `PLSA_ALLOCATE_LSA_HEAP`,
    public var `FreeLsaHeap`: `PLSA_FREE_LSA_HEAP`,
    public var `AllocateClientBuffer`: `PLSA_ALLOCATE_CLIENT_BUFFER`,
    public var `FreeClientBuffer`: `PLSA_FREE_CLIENT_BUFFER`,
    public var `CopyToClientBuffer`: `PLSA_COPY_TO_CLIENT_BUFFER`,
    public var `CopyFromClientBuffer`: `PLSA_COPY_FROM_CLIENT_BUFFER`,
    public var `ImpersonateClient`: `PLSA_IMPERSONATE_CLIENT`,
    public var `UnloadPackage`: `PLSA_UNLOAD_PACKAGE`,
    public var `DuplicateHandle`: `PLSA_DUPLICATE_HANDLE`,
    public var `SaveSupplementalCredentials`: `PLSA_SAVE_SUPPLEMENTAL_CREDENTIALS`,
    public var `CreateThread`: `PLSA_CREATE_THREAD`,
    public var `GetClientInfo`: `PLSA_GET_CLIENT_INFO`,
    public var `RegisterNotification`: `PLSA_REGISTER_NOTIFICATION`,
    public var `CancelNotification`: `PLSA_CANCEL_NOTIFICATION`,
    public var `MapBuffer`: `PLSA_MAP_BUFFER`,
    public var `CreateToken`: `PLSA_CREATE_TOKEN`,
    public var `AuditLogon`: `PLSA_AUDIT_LOGON`,
    public var `CallPackage`: `PLSA_CALL_PACKAGE`,
    public var `FreeReturnBuffer`: `PLSA_FREE_LSA_HEAP`,
    public var `GetCallInfo`: `PLSA_GET_CALL_INFO`,
    public var `CallPackageEx`: `PLSA_CALL_PACKAGEEX`,
    public var `CreateSharedMemory`: `PLSA_CREATE_SHARED_MEMORY`,
    public var `AllocateSharedMemory`: `PLSA_ALLOCATE_SHARED_MEMORY`,
    public var `FreeSharedMemory`: `PLSA_FREE_SHARED_MEMORY`,
    public var `DeleteSharedMemory`: `PLSA_DELETE_SHARED_MEMORY`,
    public var `OpenSamUser`: `PLSA_OPEN_SAM_USER`,
    public var `GetUserCredentials`: `PLSA_GET_USER_CREDENTIALS`,
    public var `GetUserAuthData`: `PLSA_GET_USER_AUTH_DATA`,
    public var `CloseSamUser`: `PLSA_CLOSE_SAM_USER`,
    public var `ConvertAuthDataToToken`: `PLSA_CONVERT_AUTH_DATA_TO_TOKEN`,
    public var `ClientCallback`: `PLSA_CLIENT_CALLBACK`,
    public var `UpdateCredentials`: `PLSA_UPDATE_PRIMARY_CREDENTIALS`,
    public var `GetAuthDataForUser`: `PLSA_GET_AUTH_DATA_FOR_USER`,
    public var `CrackSingleName`: `PLSA_CRACK_SINGLE_NAME`,
    public var `AuditAccountLogon`: `PLSA_AUDIT_ACCOUNT_LOGON`,
    public var `CallPackagePassthrough`: `PLSA_CALL_PACKAGE_PASSTHROUGH`,
    public var `CrediRead`: `CredReadFn`,
    public var `CrediReadDomainCredentials`: `CredReadDomainCredentialsFn`,
    public var `CrediFreeCredentials`: `CredFreeCredentialsFn`,
    public var `LsaProtectMemory`: `PLSA_PROTECT_MEMORY`,
    public var `LsaUnprotectMemory`: `PLSA_PROTECT_MEMORY`,
    public var `OpenTokenByLogonId`: `PLSA_OPEN_TOKEN_BY_LOGON_ID`,
    public var `ExpandAuthDataForDomain`: `PLSA_EXPAND_AUTH_DATA_FOR_DOMAIN`,
    public var `AllocatePrivateHeap`: `PLSA_ALLOCATE_PRIVATE_HEAP`,
    public var `FreePrivateHeap`: `PLSA_FREE_PRIVATE_HEAP`,
    public var `CreateTokenEx`: `PLSA_CREATE_TOKEN_EX`,
    public var `CrediWrite`: `CredWriteFn`,
    public var `CrediUnmarshalandDecodeString`: `CrediUnmarshalandDecodeStringFn`,
    public var `DummyFunction6`: `PLSA_PROTECT_MEMORY`,
    public var `GetExtendedCallFlags`: `PLSA_GET_EXTENDED_CALL_FLAGS`,
    public var `DuplicateTokenHandle`: `PLSA_DUPLICATE_HANDLE`,
    public var `GetServiceAccountPassword`: `PLSA_GET_SERVICE_ACCOUNT_PASSWORD`,
    public var `DummyFunction7`: `PLSA_PROTECT_MEMORY`,
    public var `AuditLogonEx`: `PLSA_AUDIT_LOGON_EX`,
    public var `CheckProtectedUserByToken`: `PLSA_CHECK_PROTECTED_USER_BY_TOKEN`,
    public var `QueryClientRequest`: `PLSA_QUERY_CLIENT_REQUEST`,
    public var `GetAppModeInfo`: `PLSA_GET_APP_MODE_INFO`,
    public var `SetAppModeInfo`: `PLSA_SET_APP_MODE_INFO`,
    public var `GetClientInfoEx`: `PLSA_GET_CLIENT_INFO_EX`,
)
public const val `LSA_SECRET_MAXIMUM_COUNT`: Int = 4096;
public const val `LSA_SECRET_MAXIMUM_LENGTH`: Int = 512;
public const val `LSA_SID_DISABLED_ADMIN`: Int = 1;
public const val `LSA_SID_DISABLED_CONFLICT`: Int = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LSA_STRING` (
    public var `Length`: UShort,
    public var `MaximumLength`: UShort,
    public var `Buffer`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 1982:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LSA_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LSA_TLN_DISABLED_ADMIN`: Int = 2;
public const val `LSA_TLN_DISABLED_CONFLICT`: Int = 4;
public const val `LSA_TLN_DISABLED_NEW`: Int = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LSA_TOKEN_INFORMATION_NULL` (
    public var `ExpirationTime`: Long,
    public var `Groups`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`TOKEN_GROUPS`>?,
)
// UNSUPPORTED Rust 1996:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LSA_TOKEN_INFORMATION_NULL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `LSA_TOKEN_INFORMATION_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LSA_TOKEN_INFORMATION_V1` (
    public var `ExpirationTime`: Long,
    public var `User`: `super`.`super`.`TOKEN_USER`,
    public var `Groups`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`TOKEN_GROUPS`>?,
    public var `PrimaryGroup`: `super`.`super`.`TOKEN_PRIMARY_GROUP`,
    public var `Privileges`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`TOKEN_PRIVILEGES`>?,
    public var `Owner`: `super`.`super`.`TOKEN_OWNER`,
    public var `DefaultDacl`: `super`.`super`.`TOKEN_DEFAULT_DACL`,
)
// UNSUPPORTED Rust 2013:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LSA_TOKEN_INFORMATION_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LSA_TOKEN_INFORMATION_V3` (
    public var `ExpirationTime`: Long,
    public var `User`: `super`.`super`.`TOKEN_USER`,
    public var `Groups`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`TOKEN_GROUPS`>?,
    public var `PrimaryGroup`: `super`.`super`.`TOKEN_PRIMARY_GROUP`,
    public var `Privileges`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`TOKEN_PRIVILEGES`>?,
    public var `Owner`: `super`.`super`.`TOKEN_OWNER`,
    public var `DefaultDacl`: `super`.`super`.`TOKEN_DEFAULT_DACL`,
    public var `UserClaims`: `super`.`super`.`TOKEN_USER_CLAIMS`,
    public var `DeviceClaims`: `super`.`super`.`TOKEN_DEVICE_CLAIMS`,
    public var `DeviceGroups`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`TOKEN_GROUPS`>?,
)
// UNSUPPORTED Rust 2032:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LSA_TOKEN_INFORMATION_V3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LSA_TRANSLATED_NAME` (
    public var `Use`: `super`.`super`.`SID_NAME_USE`,
    public var `Name`: `LSA_UNICODE_STRING`,
    public var `DomainIndex`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LSA_TRANSLATED_SID` (
    public var `Use`: `super`.`super`.`SID_NAME_USE`,
    public var `RelativeId`: UInt,
    public var `DomainIndex`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LSA_TRANSLATED_SID2` (
    public var `Use`: `super`.`super`.`SID_NAME_USE`,
    public var `Sid`: `super`.`super`.`PSID`,
    public var `DomainIndex`: Int,
    public var `Flags`: UInt,
)
// UNSUPPORTED Rust 2059:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LSA_TRANSLATED_SID2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LSA_TRUST_INFORMATION` (
    public var `Name`: `LSA_UNICODE_STRING`,
    public var `Sid`: `super`.`super`.`PSID`,
)
// UNSUPPORTED Rust 2070:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LSA_TRUST_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LSA_UNICODE_STRING` (
    public var `Length`: UShort,
    public var `MaximumLength`: UShort,
    public var `Buffer`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 2082:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `MAKE_SIGNATURE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `MAXIMUM_CAPES_PER_CAP`: UInt = 127u;
public const val `MAX_CRED_SIZE`: UInt = 1024u;
public const val `MAX_PROTOCOL_ID_SIZE`: UInt = 255u;
public const val `MAX_RECORDS_IN_FOREST_TRUST_INFO`: UInt = 4000u;
public const val `MAX_USER_RECORDS`: UInt = 1000u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `MICROSOFT_KERBEROS_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Kerberos");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `MICROSOFT_KERBEROS_NAME_A`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("Kerberos");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `MICROSOFT_KERBEROS_NAME_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Kerberos");
public typealias `MSV1_0` = UInt;
public const val `MSV1_0_ALLOW_FORCE_GUEST`: UInt = 8192u;
public const val `MSV1_0_ALLOW_MSVCHAPV2`: UInt = 65536u;
public const val `MSV1_0_ALLOW_SERVER_TRUST_ACCOUNT`: `MSV_SUBAUTH_LOGON_PARAMETER_CONTROL` = 32u;
public const val `MSV1_0_ALLOW_WORKSTATION_TRUST_ACCOUNT`: `MSV_SUBAUTH_LOGON_PARAMETER_CONTROL` = 2048u;
public typealias `MSV1_0_AVID` = Int;
public const val `MSV1_0_AV_FLAG_FORCE_GUEST`: UInt = 1u;
public const val `MSV1_0_AV_FLAG_MIC_HANDSHAKE_MESSAGES`: UInt = 2u;
public const val `MSV1_0_AV_FLAG_UNVERIFIED_TARGET`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MSV1_0_AV_PAIR` (
    public var `AvId`: UShort,
    public var `AvLen`: UShort,
)
public const val `MSV1_0_CHALLENGE_LENGTH`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MSV1_0_CHANGEPASSWORD_REQUEST` (
    public var `MessageType`: `MSV1_0_PROTOCOL_MESSAGE_TYPE`,
    public var `DomainName`: `LSA_UNICODE_STRING`,
    public var `AccountName`: `LSA_UNICODE_STRING`,
    public var `OldPassword`: `LSA_UNICODE_STRING`,
    public var `NewPassword`: `LSA_UNICODE_STRING`,
    public var `Impersonating`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MSV1_0_CHANGEPASSWORD_RESPONSE` (
    public var `MessageType`: `MSV1_0_PROTOCOL_MESSAGE_TYPE`,
    public var `PasswordInfoValid`: Boolean,
    public var `DomainPasswordInfo`: `DOMAIN_PASSWORD_INFORMATION`,
)
public const val `MSV1_0_CHECK_LOGONHOURS_FOR_S4U`: UInt = 262144u;
public const val `MSV1_0_CLEARTEXT_PASSWORD_ALLOWED`: `MSV_SUBAUTH_LOGON_PARAMETER_CONTROL` = 2u;
public const val `MSV1_0_CLEARTEXT_PASSWORD_SUPPLIED`: UInt = 16384u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 20 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSV1_0_CREDENTIAL_KEY` (
    public var `Data`: UByteArray,
)
// UNSUPPORTED Rust 2143:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MSV1_0_INTERACTIVE_LOGON` (
    public var `MessageType`: `MSV1_0_LOGON_SUBMIT_TYPE`,
    public var `LogonDomainName`: `LSA_UNICODE_STRING`,
    public var `UserName`: `LSA_UNICODE_STRING`,
    public var `Password`: `LSA_UNICODE_STRING`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MSV1_0_INTERACTIVE_PROFILE` (
    public var `MessageType`: `MSV1_0_PROFILE_BUFFER_TYPE`,
    public var `LogonCount`: UShort,
    public var `BadPasswordCount`: UShort,
    public var `LogonTime`: Long,
    public var `LogoffTime`: Long,
    public var `KickOffTime`: Long,
    public var `PasswordLastSet`: Long,
    public var `PasswordCanChange`: Long,
    public var `PasswordMustChange`: Long,
    public var `LogonScript`: `LSA_UNICODE_STRING`,
    public var `HomeDirectory`: `LSA_UNICODE_STRING`,
    public var `FullName`: `LSA_UNICODE_STRING`,
    public var `ProfilePath`: `LSA_UNICODE_STRING`,
    public var `HomeDirectoryDrive`: `LSA_UNICODE_STRING`,
    public var `LogonServer`: `LSA_UNICODE_STRING`,
    public var `UserFlags`: UInt,
)
public const val `MSV1_0_INTERNET_DOMAIN`: UInt = 524288u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSV1_0_IUM_SUPPLEMENTAL_CREDENTIAL` (
    public var `Version`: UInt,
    public var `EncryptedCredsSize`: UInt,
    public var `EncryptedCreds`: UByteArray,
)
// UNSUPPORTED Rust 2202:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MSV1_0_IUM_SUPPLEMENTAL_CREDENTIAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MSV1_0_LANMAN_SESSION_KEY_LENGTH`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSV1_0_LM20_LOGON` (
    public var `MessageType`: `MSV1_0_LOGON_SUBMIT_TYPE`,
    public var `LogonDomainName`: `LSA_UNICODE_STRING`,
    public var `UserName`: `LSA_UNICODE_STRING`,
    public var `Workstation`: `LSA_UNICODE_STRING`,
    public var `ChallengeToClient`: UByteArray,
    public var `CaseSensitiveChallengeResponse`: `LSA_STRING`,
    public var `CaseInsensitiveChallengeResponse`: `LSA_STRING`,
    public var `ParameterControl`: UInt,
)
// UNSUPPORTED Rust 2220:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MSV1_0_LM20_LOGON {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSV1_0_LM20_LOGON_PROFILE` (
    public var `MessageType`: `MSV1_0_PROFILE_BUFFER_TYPE`,
    public var `KickOffTime`: Long,
    public var `LogoffTime`: Long,
    public var `UserFlags`: `MSV_SUB_AUTHENTICATION_FILTER`,
    public var `UserSessionKey`: UByteArray,
    public var `LogonDomainName`: `LSA_UNICODE_STRING`,
    public var `LanmanSessionKey`: UByteArray,
    public var `LogonServer`: `LSA_UNICODE_STRING`,
    public var `UserParameters`: `LSA_UNICODE_STRING`,
)
// UNSUPPORTED Rust 2238:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSV1_0_NTLM3_RESPONSE` (
    public var `Response`: UByteArray,
    public var `RespType`: UByte,
    public var `HiRespType`: UByte,
    public var `Flags`: UShort,
    public var `MsgWord`: UInt,
    public var `TimeStamp`: ULong,
    public var `ChallengeFromClient`: UByteArray,
    public var `AvPairsOff`: UInt,
    public var `Buffer`: UByteArray,
)
// UNSUPPORTED Rust 2261:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MSV1_0_NTLM3_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MSV1_0_NTLM3_RESPONSE_LENGTH`: UInt = 16u;
public const val `MSV1_0_OWF_PASSWORD_LENGTH`: UInt = 16u;
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `MSV1_0_PACKAGE_NAME`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("MICROSOFT_AUTHENTICATION_PACKAGE_V1_0");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `MSV1_0_PACKAGE_NAMEW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MICROSOFT_AUTHENTICATION_PACKAGE_V1_0");
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSV1_0_PASSTHROUGH_REQUEST` (
    public var `MessageType`: `MSV1_0_PROTOCOL_MESSAGE_TYPE`,
    public var `DomainName`: `LSA_UNICODE_STRING`,
    public var `PackageName`: `LSA_UNICODE_STRING`,
    public var `DataLength`: UInt,
    public var `LogonData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `Pad`: UInt,
)
// UNSUPPORTED Rust 2280:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MSV1_0_PASSTHROUGH_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSV1_0_PASSTHROUGH_RESPONSE` (
    public var `MessageType`: `MSV1_0_PROTOCOL_MESSAGE_TYPE`,
    public var `Pad`: UInt,
    public var `DataLength`: UInt,
    public var `ValidationData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 2293:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MSV1_0_PASSTHROUGH_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MSV1_0_PASSTHRU`: `MSV1_0` = 1u;
public typealias `MSV1_0_PROFILE_BUFFER_TYPE` = Int;
public typealias `MSV1_0_PROTOCOL_MESSAGE_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSV1_0_REMOTE_SUPPLEMENTAL_CREDENTIAL` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `CredentialKey`: `MSV1_0_CREDENTIAL_KEY`,
    public var `CredentialKeyType`: `MSV1_0_CREDENTIAL_KEY_TYPE`,
    public var `EncryptedCredsSize`: UInt,
    public var `EncryptedCreds`: UByteArray,
)
// UNSUPPORTED Rust 2311:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MSV1_0_REMOTE_SUPPLEMENTAL_CREDENTIAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MSV1_0_RETURN_PASSWORD_EXPIRY`: `MSV_SUBAUTH_LOGON_PARAMETER_CONTROL` = 64u;
public const val `MSV1_0_RETURN_PROFILE_PATH`: `MSV_SUBAUTH_LOGON_PARAMETER_CONTROL` = 512u;
public const val `MSV1_0_RETURN_USER_PARAMETERS`: `MSV_SUBAUTH_LOGON_PARAMETER_CONTROL` = 8u;
public const val `MSV1_0_S4U2SELF`: UInt = 131072u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MSV1_0_S4U_LOGON` (
    public var `MessageType`: `MSV1_0_LOGON_SUBMIT_TYPE`,
    public var `Flags`: UInt,
    public var `UserPrincipalName`: `LSA_UNICODE_STRING`,
    public var `DomainName`: `LSA_UNICODE_STRING`,
)
public const val `MSV1_0_S4U_LOGON_FLAG_CHECK_LOGONHOURS`: UInt = 2u;
public const val `MSV1_0_SHA_PASSWORD_LENGTH`: UInt = 20u;
public const val `MSV1_0_SUBAUTHENTICATION_DLL`: UInt = 4278190080u;
public const val `MSV1_0_SUBAUTHENTICATION_DLL_EX`: UInt = 1048576u;
public const val `MSV1_0_SUBAUTHENTICATION_DLL_IIS`: UInt = 132u;
public const val `MSV1_0_SUBAUTHENTICATION_DLL_RAS`: UInt = 2u;
public const val `MSV1_0_SUBAUTHENTICATION_DLL_SHIFT`: UInt = 24u;
public const val `MSV1_0_SUBAUTHENTICATION_FLAGS`: UInt = 4278190080u;
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `MSV1_0_SUBAUTHENTICATION_KEY`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("SYSTEM\\CurrentControlSet\\Control\\Lsa\\MSV1_0");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `MSV1_0_SUBAUTHENTICATION_VALUE`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("Auth");
public const val `MSV1_0_SUBAUTH_ACCOUNT_DISABLED`: UInt = 1u;
public const val `MSV1_0_SUBAUTH_ACCOUNT_EXPIRY`: UInt = 16u;
public const val `MSV1_0_SUBAUTH_ACCOUNT_TYPE`: UInt = 64u;
public const val `MSV1_0_SUBAUTH_LOCKOUT`: UInt = 128u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSV1_0_SUBAUTH_LOGON` (
    public var `MessageType`: `MSV1_0_LOGON_SUBMIT_TYPE`,
    public var `LogonDomainName`: `LSA_UNICODE_STRING`,
    public var `UserName`: `LSA_UNICODE_STRING`,
    public var `Workstation`: `LSA_UNICODE_STRING`,
    public var `ChallengeToClient`: UByteArray,
    public var `AuthenticationInfo1`: `LSA_STRING`,
    public var `AuthenticationInfo2`: `LSA_STRING`,
    public var `ParameterControl`: `MSV_SUBAUTH_LOGON_PARAMETER_CONTROL`,
    public var `SubAuthPackageId`: UInt,
)
// UNSUPPORTED Rust 2355:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MSV1_0_SUBAUTH_LOGON {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MSV1_0_SUBAUTH_LOGON_HOURS`: UInt = 8u;
public const val `MSV1_0_SUBAUTH_PASSWORD`: UInt = 2u;
public const val `MSV1_0_SUBAUTH_PASSWORD_EXPIRY`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSV1_0_SUBAUTH_REQUEST` (
    public var `MessageType`: `MSV1_0_PROTOCOL_MESSAGE_TYPE`,
    public var `SubAuthPackageId`: UInt,
    public var `SubAuthInfoLength`: UInt,
    public var `SubAuthSubmitBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 2371:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MSV1_0_SUBAUTH_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSV1_0_SUBAUTH_RESPONSE` (
    public var `MessageType`: `MSV1_0_PROTOCOL_MESSAGE_TYPE`,
    public var `SubAuthInfoLength`: UInt,
    public var `SubAuthReturnBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 2383:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MSV1_0_SUBAUTH_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MSV1_0_SUBAUTH_WORKSTATIONS`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSV1_0_SUPPLEMENTAL_CREDENTIAL` (
    public var `Version`: UInt,
    public var `Flags`: `MSV_SUPPLEMENTAL_CREDENTIAL_FLAGS`,
    public var `LmPassword`: UByteArray,
    public var `NtPassword`: UByteArray,
)
// UNSUPPORTED Rust 2397:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MSV1_0_SUPPLEMENTAL_CREDENTIAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSV1_0_SUPPLEMENTAL_CREDENTIAL_V2` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `NtPassword`: UByteArray,
    public var `CredentialKey`: `MSV1_0_CREDENTIAL_KEY`,
)
// UNSUPPORTED Rust 2410:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MSV1_0_SUPPLEMENTAL_CREDENTIAL_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 20 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSV1_0_SUPPLEMENTAL_CREDENTIAL_V3` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `CredentialKeyType`: `MSV1_0_CREDENTIAL_KEY_TYPE`,
    public var `NtPassword`: UByteArray,
    public var `CredentialKey`: `MSV1_0_CREDENTIAL_KEY`,
    public var `ShaPassword`: UByteArray,
)
// UNSUPPORTED Rust 2425:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_PasswordManagement")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MSV1_0_VALIDATION_INFO` (
    public var `LogoffTime`: Long,
    public var `KickoffTime`: Long,
    public var `LogonServer`: `LSA_UNICODE_STRING`,
    public var `LogonDomainName`: `LSA_UNICODE_STRING`,
    public var `SessionKey`: `USER_SESSION_KEY`,
    public var `Authoritative`: Boolean,
    public var `UserFlags`: UInt,
    public var `WhichFields`: UInt,
    public var `UserId`: UInt,
)
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
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NEGOSSP_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Negotiate");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NEGOSSP_NAME_A`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("Negotiate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NEGOSSP_NAME_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Negotiate");
public const val `NEGOTIATE_ALLOW_NTLM`: UInt = 268435456u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NEGOTIATE_CALLER_NAME_REQUEST` (
    public var `MessageType`: UInt,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NEGOTIATE_CALLER_NAME_RESPONSE` (
    public var `MessageType`: UInt,
    public var `CallerName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 2524:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NEGOTIATE_CALLER_NAME_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NEGOTIATE_MAX_PREFIX`: UInt = 32u;
public typealias `NEGOTIATE_MESSAGES` = Int;
public const val `NEGOTIATE_NEG_NTLM`: UInt = 536870912u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NEGOTIATE_PACKAGE_PREFIX` (
    public var `PackageId`: ULong,
    public var `PackageDataA`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `PackageDataW`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `PrefixLen`: ULong,
    public var `Prefix`: UByteArray,
)
// UNSUPPORTED Rust 2541:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NEGOTIATE_PACKAGE_PREFIX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NEGOTIATE_PACKAGE_PREFIXES` (
    public var `MessageType`: UInt,
    public var `PrefixCount`: UInt,
    public var `Offset`: UInt,
    public var `Pad`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NETLOGON_GENERIC_INFO` (
    public var `Identity`: `NETLOGON_LOGON_IDENTITY_INFO`,
    public var `PackageName`: `LSA_UNICODE_STRING`,
    public var `DataLength`: UInt,
    public var `LogonData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 2562:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NETLOGON_GENERIC_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_PasswordManagement")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NETLOGON_INTERACTIVE_INFO` (
    public var `Identity`: `NETLOGON_LOGON_IDENTITY_INFO`,
    public var `LmOwfPassword`: `super`.`super`.`super`.`System`.`PasswordManagement`.`LM_OWF_PASSWORD`,
    public var `NtOwfPassword`: `super`.`super`.`super`.`System`.`PasswordManagement`.`LM_OWF_PASSWORD`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NETLOGON_LOGON_IDENTITY_INFO` (
    public var `LogonDomainName`: `LSA_UNICODE_STRING`,
    public var `ParameterControl`: UInt,
    public var `LogonId`: Long,
    public var `UserName`: `LSA_UNICODE_STRING`,
    public var `Workstation`: `LSA_UNICODE_STRING`,
)
public typealias `NETLOGON_LOGON_INFO_CLASS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NETLOGON_NETWORK_INFO` (
    public var `Identity`: `NETLOGON_LOGON_IDENTITY_INFO`,
    public var `LmChallenge`: `CLEAR_BLOCK`,
    public var `NtChallengeResponse`: `LSA_STRING`,
    public var `LmChallengeResponse`: `LSA_STRING`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_PasswordManagement")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NETLOGON_SERVICE_INFO` (
    public var `Identity`: `NETLOGON_LOGON_IDENTITY_INFO`,
    public var `LmOwfPassword`: `super`.`super`.`super`.`System`.`PasswordManagement`.`LM_OWF_PASSWORD`,
    public var `NtOwfPassword`: `super`.`super`.`super`.`System`.`PasswordManagement`.`LM_OWF_PASSWORD`,
)
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
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NTLMSP_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NTLM");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NTLMSP_NAME_A`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("NTLM");
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
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `PCT1SP_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Microsoft PCT 1.0");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `PCT1SP_NAME_A`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("Microsoft PCT 1.0");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `PCT1SP_NAME_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Microsoft PCT 1.0");
public const val `PER_USER_AUDIT_FAILURE_EXCLUDE`: UInt = 8u;
public const val `PER_USER_AUDIT_FAILURE_INCLUDE`: UInt = 4u;
public const val `PER_USER_AUDIT_NONE`: UInt = 16u;
public const val `PER_USER_AUDIT_SUCCESS_EXCLUDE`: UInt = 2u;
public const val `PER_USER_AUDIT_SUCCESS_INCLUDE`: UInt = 1u;
public const val `PER_USER_POLICY_UNCHANGED`: UInt = 0u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PKSEC_CREATE_CONTEXT_LIST` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`KSEC_CONTEXT_TYPE`) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public typealias `PKSEC_DEREFERENCE_LIST_ENTRY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`KSEC_LIST_ENTRY`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public typealias `PKSEC_INSERT_LIST_ENTRY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`KSEC_LIST_ENTRY`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PKSEC_LOCATE_PKG_BY_ID` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public typealias `PKSEC_REFERENCE_LIST_ENTRY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`KSEC_LIST_ENTRY`>?, UInt, Boolean) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PKSEC_SERIALIZE_SCHANNEL_AUTH_DATA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PKSEC_SERIALIZE_WINNT_AUTH_DATA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PKU2U_CERTIFICATE_S4U_LOGON` (
    public var `MessageType`: `PKU2U_LOGON_SUBMIT_TYPE`,
    public var `Flags`: UInt,
    public var `UserPrincipalName`: `LSA_UNICODE_STRING`,
    public var `DomainName`: `LSA_UNICODE_STRING`,
    public var `CertificateLength`: UInt,
    public var `Certificate`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 2673:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PKU2U_CERTIFICATE_S4U_LOGON {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PKU2U_CERT_BLOB` (
    public var `CertOffset`: UInt,
    public var `CertLength`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PKU2U_CREDUI_CONTEXT` (
    public var `Version`: ULong,
    public var `cbHeaderLength`: UShort,
    public var `cbStructureLength`: UInt,
    public var `CertArrayCount`: UShort,
    public var `CertArrayOffset`: UInt,
)
public typealias `PKU2U_LOGON_SUBMIT_TYPE` = Int;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `PKU2U_PACKAGE_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("pku2u");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `PKU2U_PACKAGE_NAME_A`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("pku2u");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `PKU2U_PACKAGE_NAME_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("pku2u");
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_ADD_CREDENTIAL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_STRING`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_ALLOCATE_CLIENT_BUFFER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_ALLOCATE_LSA_HEAP` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_ALLOCATE_PRIVATE_HEAP` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_ALLOCATE_SHARED_MEMORY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_AP_CALL_PACKAGE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_AP_CALL_PACKAGE_PASSTHROUGH` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_AP_INITIALIZE_PACKAGE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_DISPATCH_TABLE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_STRING`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_STRING`>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_AP_LOGON_TERMINATED` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_AP_LOGON_USER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `SECURITY_LOGON_TYPE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_TOKEN_INFORMATION_TYPE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_UNICODE_STRING`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_UNICODE_STRING`>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_AP_LOGON_USER_EX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `SECURITY_LOGON_TYPE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_TOKEN_INFORMATION_TYPE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_UNICODE_STRING`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_UNICODE_STRING`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_UNICODE_STRING`>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_AP_LOGON_USER_EX2` =
    `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `SECURITY_LOGON_TYPE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_TOKEN_INFORMATION_TYPE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_UNICODE_STRING`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_UNICODE_STRING`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_UNICODE_STRING`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SECPKG_PRIMARY_CRED`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SECPKG_SUPPLEMENTAL_CRED_ARRAY`>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_AP_LOGON_USER_EX3` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `SECURITY_LOGON_TYPE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`SECPKG_SURROGATE_LOGON`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_TOKEN_INFORMATION_TYPE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_UNICODE_STRING`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_UNICODE_STRING`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LSA_UNICODE_STRING`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SECPKG_PRIMARY_CRED`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SECPKG_SUPPLEMENTAL_CRED_ARRAY`>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_AP_POST_LOGON_USER_SURROGATE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `SECURITY_LOGON_TYPE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`SECPKG_SURROGATE_LOGON`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?, `super`.`super`.`super`.`Foundation`.`NTSTATUS`, `super`.`super`.`super`.`Foundation`.`NTSTATUS`, `LSA_TOKEN_INFORMATION_TYPE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`SECPKG_PRIMARY_CRED`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`SECPKG_SUPPLEMENTAL_CRED_ARRAY`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_AP_PRE_LOGON_USER_SURROGATE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `SECURITY_LOGON_TYPE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`SECPKG_SURROGATE_LOGON`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_AUDIT_ACCOUNT_LOGON` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, Boolean, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, `super`.`super`.`super`.`Foundation`.`NTSTATUS`) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_AUDIT_LOGON` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`NTSTATUS`, `super`.`super`.`super`.`Foundation`.`NTSTATUS`, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, `super`.`super`.`PSID`, `SECURITY_LOGON_TYPE`, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`TOKEN_SOURCE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_AUDIT_LOGON_EX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`NTSTATUS`, `super`.`super`.`super`.`Foundation`.`NTSTATUS`, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, `super`.`super`.`PSID`, `SECURITY_LOGON_TYPE`, `super`.`super`.`SECURITY_IMPERSONATION_LEVEL`, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`TOKEN_SOURCE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_CALLBACK_FUNCTION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBuffer`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBuffer`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_CALL_PACKAGE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_CALL_PACKAGEEX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_CALL_PACKAGE_PASSTHROUGH` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_CANCEL_NOTIFICATION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_CHECK_PROTECTED_USER_BY_TOKEN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_CLIENT_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, ULong, ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`SecBuffer`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBuffer`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_CLOSE_SAM_USER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_CONVERT_AUTH_DATA_TO_TOKEN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, `super`.`super`.`SECURITY_IMPERSONATION_LEVEL`, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`TOKEN_SOURCE`>?, `SECURITY_LOGON_TYPE`, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HANDLE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_COPY_FROM_CLIENT_BUFFER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_COPY_TO_CLIENT_BUFFER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_CRACK_SINGLE_NAME` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, Boolean, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_CREATE_LOGON_SESSION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_CREATE_SHARED_MEMORY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Threading")]
public typealias `PLSA_CREATE_THREAD` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`SECURITY_ATTRIBUTES`>?, UInt, `super`.`super`.`super`.`System`.`Threading`.`LPTHREAD_START_ROUTINE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `super`.`super`.`super`.`Foundation`.`HANDLE`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_CREATE_TOKEN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`TOKEN_SOURCE`>?, `SECURITY_LOGON_TYPE`, `super`.`super`.`SECURITY_IMPERSONATION_LEVEL`, `LSA_TOKEN_INFORMATION_TYPE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`TOKEN_GROUPS`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HANDLE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_CREATE_TOKEN_EX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`TOKEN_SOURCE`>?, `SECURITY_LOGON_TYPE`, `super`.`super`.`SECURITY_IMPERSONATION_LEVEL`, `LSA_TOKEN_INFORMATION_TYPE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`TOKEN_GROUPS`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `SECPKG_SESSIONINFO_TYPE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HANDLE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_DELETE_CREDENTIAL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_STRING`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_DELETE_LOGON_SESSION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_DELETE_SHARED_MEMORY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_DUPLICATE_HANDLE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HANDLE`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_EXPAND_AUTH_DATA_FOR_DOMAIN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_FREE_CLIENT_BUFFER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_FREE_LSA_HEAP` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_FREE_PRIVATE_HEAP` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_FREE_SHARED_MEMORY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_GET_APP_MODE_INFO` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBuffer`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_GET_AUTH_DATA_FOR_USER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`SECURITY_STRING`>?, `SECPKG_NAME_TYPE`, /* Rust *const */ kotlinx.cinterop.CPointer<`SECURITY_STRING`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_GET_CALL_INFO` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SECPKG_CALL_INFO`>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_GET_CLIENT_INFO` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SECPKG_CLIENT_INFO`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_GET_CLIENT_INFO_EX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SECPKG_CLIENT_INFO_EX`>?, UInt) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_GET_CREDENTIALS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, Boolean, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_STRING`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_STRING`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_GET_EXTENDED_CALL_FLAGS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_GET_SERVICE_ACCOUNT_PASSWORD` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, `CRED_FETCH`, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILETIME`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILETIME`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_GET_USER_AUTH_DATA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_GET_USER_CREDENTIALS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_IMPERSONATE_CLIENT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_LOCATE_PKG_BY_ID` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_MAP_BUFFER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`SecBuffer`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBuffer`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_OPEN_SAM_USER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`SECURITY_STRING`>?, `SECPKG_NAME_TYPE`, /* Rust *const */ kotlinx.cinterop.CPointer<`SECURITY_STRING`>?, Boolean, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_OPEN_TOKEN_BY_LOGON_ID` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HANDLE`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_PROTECT_MEMORY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_QUERY_CLIENT_REQUEST` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_REDIRECTED_LOGON_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_REDIRECTED_LOGON_CLEANUP_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_REDIRECTED_LOGON_GET_LOGON_CREDS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_REDIRECTED_LOGON_GET_SID` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`PSID`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_REDIRECTED_LOGON_GET_SUPP_CREDS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SECPKG_SUPPLEMENTAL_CRED_ARRAY`>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_REDIRECTED_LOGON_INIT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_REGISTER_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, `PLSA_CALLBACK_FUNCTION`) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Threading")]
public typealias `PLSA_REGISTER_NOTIFICATION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`System`.`Threading`.`LPTHREAD_START_ROUTINE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt, UInt, UInt, `super`.`super`.`super`.`Foundation`.`HANDLE`) -> `super`.`super`.`super`.`Foundation`.`HANDLE`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_SAVE_SUPPLEMENTAL_CREDENTIALS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, Boolean) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_SET_APP_MODE_INFO` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, ULong, ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`SecBuffer`>?, Boolean) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_UNLOAD_PACKAGE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLSA_UPDATE_PRIMARY_CREDENTIALS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`SECPKG_PRIMARY_CRED`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`SECPKG_SUPPLEMENTAL_CRED_ARRAY`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `POLICY_ACCOUNT_DOMAIN_INFO` (
    public var `DomainName`: `LSA_UNICODE_STRING`,
    public var `DomainSid`: `super`.`super`.`PSID`,
)
// UNSUPPORTED Rust 2820:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for POLICY_ACCOUNT_DOMAIN_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `POLICY_AUDIT_CATEGORIES_INFO` (
    public var `MaximumCategoryCount`: UInt,
    public var `SubCategoriesInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`POLICY_AUDIT_SUBCATEGORIES_INFO`>?,
)
// UNSUPPORTED Rust 2831:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for POLICY_AUDIT_CATEGORIES_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `POLICY_AUDIT_EVENTS_INFO` (
    public var `AuditingMode`: Boolean,
    public var `EventAuditingOptions`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `MaximumAuditEventCount`: UInt,
)
// UNSUPPORTED Rust 2843:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POLICY_AUDIT_FULL_QUERY_INFO` (
    public var `ShutDownOnFull`: Boolean,
    public var `LogIsFull`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POLICY_AUDIT_FULL_SET_INFO` (
    public var `ShutDownOnFull`: Boolean,
)
public const val `POLICY_AUDIT_LOG_ADMIN`: Int = 512;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POLICY_AUDIT_LOG_INFO` (
    public var `AuditLogPercentFull`: UInt,
    public var `MaximumLogSize`: UInt,
    public var `AuditRetentionPeriod`: Long,
    public var `AuditLogFullShutdownInProgress`: Boolean,
    public var `TimeToShutdown`: Long,
    public var `NextAuditRecordId`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `POLICY_AUDIT_SID_ARRAY` (
    public var `UsersCount`: UInt,
    public var `UserSidArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`PSID`>?,
)
// UNSUPPORTED Rust 2881:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for POLICY_AUDIT_SID_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `POLICY_AUDIT_SUBCATEGORIES_INFO` (
    public var `MaximumSubCategoryCount`: UInt,
    public var `EventAuditingOptions`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 2892:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for POLICY_AUDIT_SUBCATEGORIES_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `POLICY_CREATE_ACCOUNT`: Int = 16;
public const val `POLICY_CREATE_PRIVILEGE`: Int = 64;
public const val `POLICY_CREATE_SECRET`: Int = 32;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POLICY_DEFAULT_QUOTA_INFO` (
    public var `QuotaLimits`: `super`.`super`.`QUOTA_LIMITS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `POLICY_DNS_DOMAIN_INFO` (
    public var `Name`: `LSA_UNICODE_STRING`,
    public var `DnsDomainName`: `LSA_UNICODE_STRING`,
    public var `DnsForestName`: `LSA_UNICODE_STRING`,
    public var `DomainGuid`: `windows_sys`.`core`.`GUID`,
    public var `Sid`: `super`.`super`.`PSID`,
)
// UNSUPPORTED Rust 2914:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for POLICY_DNS_DOMAIN_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `POLICY_DOMAIN_EFS_INFO` (
    public var `InfoLength`: UInt,
    public var `EfsBlob`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 2925:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for POLICY_DOMAIN_EFS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `POLICY_DOMAIN_INFORMATION_CLASS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POLICY_DOMAIN_KERBEROS_TICKET_INFO` (
    public var `AuthenticationOptions`: UInt,
    public var `MaxServiceTicketAge`: Long,
    public var `MaxTicketAge`: Long,
    public var `MaxRenewAge`: Long,
    public var `MaxClockSkew`: Long,
    public var `Reserved`: Long,
)
public const val `POLICY_GET_PRIVATE_INFORMATION`: Int = 4;
public typealias `POLICY_INFORMATION_CLASS` = Int;
public const val `POLICY_KERBEROS_VALIDATE_CLIENT`: UInt = 128u;
public const val `POLICY_LOOKUP_NAMES`: Int = 2048;
public typealias `POLICY_LSA_SERVER_ROLE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POLICY_LSA_SERVER_ROLE_INFO` (
    public var `LsaServerRole`: `POLICY_LSA_SERVER_ROLE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `POLICY_MACHINE_ACCT_INFO` (
    public var `Rid`: UInt,
    public var `Sid`: `super`.`super`.`PSID`,
)
// UNSUPPORTED Rust 2957:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for POLICY_MACHINE_ACCT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `POLICY_MACHINE_ACCT_INFO2` (
    public var `Rid`: UInt,
    public var `Sid`: `super`.`super`.`PSID`,
    public var `ObjectGuid`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 2969:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for POLICY_MACHINE_ACCT_INFO2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POLICY_MODIFICATION_INFO` (
    public var `ModifiedId`: Long,
    public var `DatabaseCreationTime`: Long,
)
public const val `POLICY_NOTIFICATION`: Int = 4096;
public typealias `POLICY_NOTIFICATION_INFORMATION_CLASS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POLICY_PD_ACCOUNT_INFO` (
    public var `Name`: `LSA_UNICODE_STRING`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `POLICY_PRIMARY_DOMAIN_INFO` (
    public var `Name`: `LSA_UNICODE_STRING`,
    public var `Sid`: `super`.`super`.`PSID`,
)
// UNSUPPORTED Rust 2993:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POLICY_REPLICA_SOURCE_INFO` (
    public var `ReplicaSource`: `LSA_UNICODE_STRING`,
    public var `ReplicaAccountName`: `LSA_UNICODE_STRING`,
)
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSAM_CREDENTIAL_UPDATE_FREE_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSAM_CREDENTIAL_UPDATE_NOTIFY_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSAM_CREDENTIAL_UPDATE_REGISTER_MAPPED_ENTRYPOINTS_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SAM_REGISTER_MAPPING_TABLE`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSAM_CREDENTIAL_UPDATE_REGISTER_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSAM_INIT_NOTIFICATION_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSAM_PASSWORD_FILTER_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, Boolean) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSAM_PASSWORD_NOTIFICATION_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PctPublicKey` (
    public var `Type`: UInt,
    public var `cbKey`: UInt,
    public var `pKey`: UByteArray,
)
// UNSUPPORTED Rust 3058:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `QUERY_CONTEXT_ATTRIBUTES_EX_FN_A` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `QUERY_CONTEXT_ATTRIBUTES_EX_FN_W` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `QUERY_CONTEXT_ATTRIBUTES_FN_A` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `QUERY_CONTEXT_ATTRIBUTES_FN_W` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `QUERY_CREDENTIALS_ATTRIBUTES_EX_FN_A` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `QUERY_CREDENTIALS_ATTRIBUTES_EX_FN_W` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `QUERY_CREDENTIALS_ATTRIBUTES_FN_A` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `QUERY_CREDENTIALS_ATTRIBUTES_FN_W` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `QUERY_SECURITY_CONTEXT_TOKEN_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `QUERY_SECURITY_PACKAGE_INFO_FN_A` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SecPkgInfoA`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `QUERY_SECURITY_PACKAGE_INFO_FN_W` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SecPkgInfoW`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `RCRED_CRED_EXISTS`: UInt = 1u;
public const val `RCRED_STATUS_NOCRED`: UInt = 0u;
public const val `RCRED_STATUS_UNKNOWN_ISSUER`: UInt = 2u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `REVERT_SECURITY_CONTEXT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `RTL_ENCRYPT_MEMORY_SIZE`: UInt = 8u;
public const val `RTL_ENCRYPT_OPTION_CROSS_PROCESS`: UInt = 1u;
public const val `RTL_ENCRYPT_OPTION_FOR_SYSTEM`: UInt = 4u;
public const val `RTL_ENCRYPT_OPTION_SAME_LOGON`: UInt = 2u;
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SAM_CREDENTIAL_UPDATE_FREE_ROUTINE`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("CredentialUpdateFree");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SAM_CREDENTIAL_UPDATE_NOTIFY_ROUTINE`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("CredentialUpdateNotify");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SAM_CREDENTIAL_UPDATE_REGISTER_MAPPED_ENTRYPOINTS_ROUTINE`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("RegisterMappedEntrypoints");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SAM_CREDENTIAL_UPDATE_REGISTER_ROUTINE`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("CredentialUpdateRegister");
public const val `SAM_DAYS_PER_WEEK`: UInt = 7u;
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SAM_INIT_NOTIFICATION_ROUTINE`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("InitializeChangeNotify");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SAM_PASSWORD_CHANGE_NOTIFY_ROUTINE`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("PasswordChangeNotify");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SAM_PASSWORD_FILTER_ROUTINE`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("PasswordFilter");
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SAM_REGISTER_MAPPING_ELEMENT` (
    public var `Original`: `windows_sys`.`core`.`PSTR`,
    public var `Mapped`: `windows_sys`.`core`.`PSTR`,
    public var `Continuable`: Boolean,
)
// UNSUPPORTED Rust 3138:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SAM_REGISTER_MAPPING_ELEMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SAM_REGISTER_MAPPING_LIST` (
    public var `Count`: UInt,
    public var `Elements`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SAM_REGISTER_MAPPING_ELEMENT`>?,
)
// UNSUPPORTED Rust 3149:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SAM_REGISTER_MAPPING_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SAM_REGISTER_MAPPING_TABLE` (
    public var `Count`: UInt,
    public var `Lists`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SAM_REGISTER_MAPPING_LIST`>?,
)
// UNSUPPORTED Rust 3160:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCHANNEL_ALERT_TOKEN` (
    public var `dwTokenType`: UInt,
    public var `dwAlertType`: `SCHANNEL_ALERT_TOKEN_ALERT_TYPE`,
    public var `dwAlertNumber`: UInt,
)
public typealias `SCHANNEL_ALERT_TOKEN_ALERT_TYPE` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 20 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCHANNEL_CERT_HASH` (
    public var `dwLength`: UInt,
    public var `dwFlags`: UInt,
    public var `hProv`: ULong,
    public var `ShaHash`: UByteArray,
)
// UNSUPPORTED Rust 3187:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCHANNEL_CERT_HASH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 20 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCHANNEL_CERT_HASH_STORE` (
    public var `dwLength`: UInt,
    public var `dwFlags`: UInt,
    public var `hProv`: ULong,
    public var `ShaHash`: UByteArray,
    public var `pwszStoreName`: UShortArray,
)
// UNSUPPORTED Rust 3201:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCHANNEL_CERT_HASH_STORE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 36 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 20 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCHANNEL_CLIENT_SIGNATURE` (
    public var `cbLength`: UInt,
    public var `aiHash`: `super`.`super`.`Cryptography`.`ALG_ID`,
    public var `cbHash`: UInt,
    public var `HashValue`: UByteArray,
    public var `CertThumbprint`: UByteArray,
)
// UNSUPPORTED Rust 3216:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SCHANNEL_CLIENT_SIGNATURE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCHANNEL_CRED` (
    public var `dwVersion`: UInt,
    public var `cCreds`: UInt,
    public var `paCred`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Cryptography`.`CERT_CONTEXT`>>?,
    public var `hRootStore`: `super`.`super`.`Cryptography`.`HCERTSTORE`,
    public var `cMappers`: UInt,
    public var `aphMappers`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`_HMAPPER`>>?,
    public var `cSupportedAlgs`: UInt,
    public var `palgSupportedAlgs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Cryptography`.`ALG_ID`>?,
    public var `grbitEnabledProtocols`: UInt,
    public var `dwMinimumCipherStrength`: UInt,
    public var `dwMaximumCipherStrength`: UInt,
    public var `dwSessionLifespan`: UInt,
    public var `dwFlags`: `SCHANNEL_CRED_FLAGS`,
    public var `dwCredFormat`: UInt,
)
// UNSUPPORTED Rust 3241:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SCHANNEL_CRED {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SCHANNEL_CRED_FLAGS` = UInt;
public const val `SCHANNEL_CRED_VERSION`: UInt = 4u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SCHANNEL_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Schannel");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SCHANNEL_NAME_A`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("Schannel");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SCHANNEL_NAME_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Schannel");
public const val `SCHANNEL_RENEGOTIATE`: UInt = 0u;
public const val `SCHANNEL_SECRET_PRIVKEY`: UInt = 2u;
public const val `SCHANNEL_SECRET_TYPE_CAPI`: UInt = 1u;
public const val `SCHANNEL_SESSION`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCHANNEL_SESSION_TOKEN` (
    public var `dwTokenType`: UInt,
    public var `dwFlags`: `SCHANNEL_SESSION_TOKEN_FLAGS`,
)
public typealias `SCHANNEL_SESSION_TOKEN_FLAGS` = UInt;
public const val `SCHANNEL_SHUTDOWN`: UInt = 1u;
public const val `SCH_ALLOW_NULL_ENCRYPTION`: UInt = 33554432u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCH_CRED` (
    public var `dwVersion`: UInt,
    public var `cCreds`: UInt,
    public var `paSecret`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?,
    public var `paPublic`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?,
    public var `cMappers`: UInt,
    public var `aphMappers`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`_HMAPPER`>>?,
)
// UNSUPPORTED Rust 3275:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCH_CRED {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCH_CREDENTIALS` (
    public var `dwVersion`: UInt,
    public var `dwCredFormat`: UInt,
    public var `cCreds`: UInt,
    public var `paCred`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Cryptography`.`CERT_CONTEXT`>>?,
    public var `hRootStore`: `super`.`super`.`Cryptography`.`HCERTSTORE`,
    public var `cMappers`: UInt,
    public var `aphMappers`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`_HMAPPER`>>?,
    public var `dwSessionLifespan`: UInt,
    public var `dwFlags`: UInt,
    public var `cTlsParameters`: UInt,
    public var `pTlsParameters`: /* Rust *mut */ kotlinx.cinterop.CPointer<`TLS_PARAMETERS`>?,
)
// UNSUPPORTED Rust 3296:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCH_CRED_PUBLIC_CERTCHAIN` (
    public var `dwType`: UInt,
    public var `cbCertChain`: UInt,
    public var `pCertChain`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 3333:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCH_CRED_SECRET_CAPI` (
    public var `dwType`: UInt,
    public var `hProv`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCH_CRED_SECRET_PRIVKEY` (
    public var `dwType`: UInt,
    public var `pPrivateKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbPrivateKey`: UInt,
    public var `pszPassword`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 3357:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCH_EXTENSION_DATA` (
    public var `ExtensionType`: UShort,
    public var `pExtData`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbExtData`: UInt,
)
// UNSUPPORTED Rust 3380:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SECPKG_APP_MODE_INFO` (
    public var `UserFunction`: UInt,
    public var `Argument1`: ULong,
    public var `Argument2`: ULong,
    public var `UserData`: `SecBuffer`,
    public var `ReturnToLsa`: Boolean,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SECPKG_BYTE_VECTOR` (
    public var `ByteArrayOffset`: UInt,
    public var `ByteArrayLength`: UShort,
)
public const val `SECPKG_CALLFLAGS_APPCONTAINER`: UInt = 1u;
public const val `SECPKG_CALLFLAGS_APPCONTAINER_AUTHCAPABLE`: UInt = 2u;
public const val `SECPKG_CALLFLAGS_APPCONTAINER_UPNCAPABLE`: UInt = 8u;
public const val `SECPKG_CALLFLAGS_FORCE_SUPPLIED`: UInt = 4u;
public const val `SECPKG_CALL_ANSI`: UInt = 2u;
public const val `SECPKG_CALL_ASYNC_UPDATE`: UInt = 4096u;
public const val `SECPKG_CALL_BUFFER_MARSHAL`: UInt = 65536u;
public const val `SECPKG_CALL_CLEANUP`: UInt = 32u;
public const val `SECPKG_CALL_CLOUDAP_CONNECT`: UInt = 262144u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECPKG_CALL_INFO` (
    public var `ProcessId`: UInt,
    public var `ThreadId`: UInt,
    public var `Attributes`: UInt,
    public var `CallCount`: UInt,
    public var `MechOid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 3554:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SECPKG_CALL_PACKAGE_PIN_DC_REQUEST` (
    public var `MessageType`: UInt,
    public var `Flags`: UInt,
    public var `DomainName`: `LSA_UNICODE_STRING`,
    public var `DcName`: `LSA_UNICODE_STRING`,
    public var `DcFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SECPKG_CALL_PACKAGE_TRANSFER_CRED_REQUEST` (
    public var `MessageType`: UInt,
    public var `OriginLogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `DestinationLogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `Flags`: UInt,
)
public const val `SECPKG_CALL_PACKAGE_TRANSFER_CRED_REQUEST_FLAG_CLEANUP_CREDENTIALS`: UInt = 2u;
public const val `SECPKG_CALL_PACKAGE_TRANSFER_CRED_REQUEST_FLAG_OPTIMISTIC_LOGON`: UInt = 1u;
public const val `SECPKG_CALL_PACKAGE_TRANSFER_CRED_REQUEST_FLAG_TO_SSO_SESSION`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SECPKG_CALL_PACKAGE_UNPIN_ALL_DCS_REQUEST` (
    public var `MessageType`: UInt,
    public var `Flags`: UInt,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECPKG_CLIENT_INFO` (
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `ProcessID`: UInt,
    public var `ThreadID`: UInt,
    public var `HasTcbPrivilege`: Boolean,
    public var `Impersonating`: Boolean,
    public var `Restricted`: Boolean,
    public var `ClientFlags`: UByte,
    public var `ImpersonationLevel`: `super`.`super`.`SECURITY_IMPERSONATION_LEVEL`,
    public var `ClientToken`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 3615:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SECPKG_CLIENT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECPKG_CLIENT_INFO_EX` (
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `ProcessID`: UInt,
    public var `ThreadID`: UInt,
    public var `HasTcbPrivilege`: Boolean,
    public var `Impersonating`: Boolean,
    public var `Restricted`: Boolean,
    public var `ClientFlags`: UByte,
    public var `ImpersonationLevel`: `super`.`super`.`SECURITY_IMPERSONATION_LEVEL`,
    public var `ClientToken`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `IdentificationLogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `IdentificationToken`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 3635:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECPKG_CONTEXT_THUNKS` (
    public var `InfoLevelCount`: UInt,
    public var `Levels`: UIntArray,
)
// UNSUPPORTED Rust 3651:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SECPKG_CONTEXT_THUNKS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SECPKG_CRED` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECPKG_CREDENTIAL` (
    public var `Version`: ULong,
    public var `cbHeaderLength`: UShort,
    public var `cbStructureLength`: UInt,
    public var `ClientProcess`: UInt,
    public var `ClientThread`: UInt,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `ClientToken`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `SessionId`: UInt,
    public var `ModifiedId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `fCredentials`: UInt,
    public var `Flags`: UInt,
    public var `PrincipalName`: `SECPKG_BYTE_VECTOR`,
    public var `PackageList`: `SECPKG_BYTE_VECTOR`,
    public var `MarshaledSuppliedCreds`: `SECPKG_BYTE_VECTOR`,
)
// UNSUPPORTED Rust 3675:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SECPKG_DLL_FUNCTIONS` (
    public var `AllocateHeap`: `PLSA_ALLOCATE_LSA_HEAP`,
    public var `FreeHeap`: `PLSA_FREE_LSA_HEAP`,
    public var `RegisterCallback`: `PLSA_REGISTER_CALLBACK`,
    public var `LocatePackageById`: `PLSA_LOCATE_PKG_BY_ID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECPKG_EVENT_NOTIFY` (
    public var `EventClass`: UInt,
    public var `Reserved`: UInt,
    public var `EventDataSize`: UInt,
    public var `EventData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `PackageParameter`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 3714:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SECPKG_EVENT_NOTIFY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SECPKG_EVENT_PACKAGE_CHANGE` (
    public var `ChangeType`: `SECPKG_PACKAGE_CHANGE_TYPE`,
    public var `PackageId`: ULong,
    public var `PackageName`: `SECURITY_STRING`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SECPKG_EVENT_ROLE_CHANGE` (
    public var `PreviousRole`: UInt,
    public var `NewRole`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECPKG_EXTENDED_INFORMATION` (
    public var `Class`: `SECPKG_EXTENDED_INFORMATION_CLASS`,
    public var `Info`: `SECPKG_EXTENDED_INFORMATION_0`,
)
// UNSUPPORTED Rust 3738:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SECPKG_EXTENDED_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3743:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
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

// UNSUPPORTED Rust 3753:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SECPKG_EXTENDED_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SECPKG_EXTENDED_INFORMATION_CLASS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECPKG_EXTRA_OIDS` (
    public var `OidCount`: UInt,
    public var `Oids`: Array<`SECPKG_SERIALIZED_OID`>,
)
// UNSUPPORTED Rust 3765:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Credentials", feature = "Win32_System_Threading"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SECPKG_FUNCTION_TABLE` (
    public var `InitializePackage`: `PLSA_AP_INITIALIZE_PACKAGE`,
    public var `LogonUserA`: `PLSA_AP_LOGON_USER`,
    public var `CallPackage`: `PLSA_AP_CALL_PACKAGE`,
    public var `LogonTerminated`: `PLSA_AP_LOGON_TERMINATED`,
    public var `CallPackageUntrusted`: `PLSA_AP_CALL_PACKAGE`,
    public var `CallPackagePassthrough`: `PLSA_AP_CALL_PACKAGE_PASSTHROUGH`,
    public var `LogonUserExA`: `PLSA_AP_LOGON_USER_EX`,
    public var `LogonUserEx2`: `PLSA_AP_LOGON_USER_EX2`,
    public var `Initialize`: `SpInitializeFn`,
    public var `Shutdown`: `SpShutdownFn`,
    public var `GetInfo`: `SpGetInfoFn`,
    public var `AcceptCredentials`: `SpAcceptCredentialsFn`,
    public var `AcquireCredentialsHandleA`: `SpAcquireCredentialsHandleFn`,
    public var `QueryCredentialsAttributesA`: `SpQueryCredentialsAttributesFn`,
    public var `FreeCredentialsHandle`: `SpFreeCredentialsHandleFn`,
    public var `SaveCredentials`: `SpSaveCredentialsFn`,
    public var `GetCredentials`: `SpGetCredentialsFn`,
    public var `DeleteCredentials`: `SpDeleteCredentialsFn`,
    public var `InitLsaModeContext`: `SpInitLsaModeContextFn`,
    public var `AcceptLsaModeContext`: `SpAcceptLsaModeContextFn`,
    public var `DeleteContext`: `SpDeleteContextFn`,
    public var `ApplyControlToken`: `SpApplyControlTokenFn`,
    public var `GetUserInfo`: `SpGetUserInfoFn`,
    public var `GetExtendedInformation`: `SpGetExtendedInformationFn`,
    public var `QueryContextAttributesA`: `SpQueryContextAttributesFn`,
    public var `AddCredentialsA`: `SpAddCredentialsFn`,
    public var `SetExtendedInformation`: `SpSetExtendedInformationFn`,
    public var `SetContextAttributesA`: `SpSetContextAttributesFn`,
    public var `SetCredentialsAttributesA`: `SpSetCredentialsAttributesFn`,
    public var `ChangeAccountPasswordA`: `SpChangeAccountPasswordFn`,
    public var `QueryMetaData`: `SpQueryMetaDataFn`,
    public var `ExchangeMetaData`: `SpExchangeMetaDataFn`,
    public var `GetCredUIContext`: `SpGetCredUIContextFn`,
    public var `UpdateCredentials`: `SpUpdateCredentialsFn`,
    public var `ValidateTargetInfo`: `SpValidateTargetInfoFn`,
    public var `PostLogonUser`: `LSA_AP_POST_LOGON_USER`,
    public var `GetRemoteCredGuardLogonBuffer`: `SpGetRemoteCredGuardLogonBufferFn`,
    public var `GetRemoteCredGuardSupplementalCreds`: `SpGetRemoteCredGuardSupplementalCredsFn`,
    public var `GetTbalSupplementalCreds`: `SpGetTbalSupplementalCredsFn`,
    public var `LogonUserEx3`: `PLSA_AP_LOGON_USER_EX3`,
    public var `PreLogonUserSurrogate`: `PLSA_AP_PRE_LOGON_USER_SURROGATE`,
    public var `PostLogonUserSurrogate`: `PLSA_AP_POST_LOGON_USER_SURROGATE`,
    public var `ExtractTargetInfo`: `SpExtractTargetInfoFn`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECPKG_GSS_INFO` (
    public var `EncodedIdLength`: UInt,
    public var `EncodedId`: UByteArray,
)
// UNSUPPORTED Rust 3850:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SECPKG_KERNEL_FUNCTIONS` (
    public var `AllocateHeap`: `PLSA_ALLOCATE_LSA_HEAP`,
    public var `FreeHeap`: `PLSA_FREE_LSA_HEAP`,
    public var `CreateContextList`: `PKSEC_CREATE_CONTEXT_LIST`,
    public var `InsertListEntry`: `PKSEC_INSERT_LIST_ENTRY`,
    public var `ReferenceListEntry`: `PKSEC_REFERENCE_LIST_ENTRY`,
    public var `DereferenceListEntry`: `PKSEC_DEREFERENCE_LIST_ENTRY`,
    public var `SerializeWinntAuthData`: `PKSEC_SERIALIZE_WINNT_AUTH_DATA`,
    public var `SerializeSchannelAuthData`: `PKSEC_SERIALIZE_SCHANNEL_AUTH_DATA`,
    public var `LocatePackageById`: `PKSEC_LOCATE_PKG_BY_ID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SECPKG_KERNEL_FUNCTION_TABLE` (
    public var `Initialize`: `KspInitPackageFn`,
    public var `DeleteContext`: `KspDeleteContextFn`,
    public var `InitContext`: `KspInitContextFn`,
    public var `MapHandle`: `KspMapHandleFn`,
    public var `Sign`: `KspMakeSignatureFn`,
    public var `Verify`: `KspVerifySignatureFn`,
    public var `Seal`: `KspSealMessageFn`,
    public var `Unseal`: `KspUnsealMessageFn`,
    public var `GetToken`: `KspGetTokenFn`,
    public var `QueryAttributes`: `KspQueryAttributesFn`,
    public var `CompleteToken`: `KspCompleteTokenFn`,
    public var `ExportContext`: `SpExportSecurityContextFn`,
    public var `ImportContext`: `SpImportSecurityContextFn`,
    public var `SetPackagePagingMode`: `KspSetPagingModeFn`,
    public var `SerializeAuthData`: `KspSerializeAuthDataFn`,
)
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SECPKG_LSAMODEINIT_NAME`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("SpLsaModeInitialize");
public const val `SECPKG_MAX_OID_LENGTH`: UInt = 32u;
public const val `SECPKG_MSVAV_FLAGS_VALID`: UInt = 1u;
public const val `SECPKG_MSVAV_TIMESTAMP_VALID`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SECPKG_MUTUAL_AUTH_LEVEL` (
    public var `MutualAuthLevel`: UInt,
)
public typealias `SECPKG_NAME_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECPKG_NEGO2_INFO` (
    public var `AuthScheme`: UByteArray,
    public var `PackageFlags`: UInt,
)
// UNSUPPORTED Rust 3917:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECPKG_NTLM_TARGETINFO` (
    public var `Flags`: UInt,
    public var `MsvAvNbComputerName`: `windows_sys`.`core`.`PWSTR`,
    public var `MsvAvNbDomainName`: `windows_sys`.`core`.`PWSTR`,
    public var `MsvAvDnsComputerName`: `windows_sys`.`core`.`PWSTR`,
    public var `MsvAvDnsDomainName`: `windows_sys`.`core`.`PWSTR`,
    public var `MsvAvDnsTreeName`: `windows_sys`.`core`.`PWSTR`,
    public var `MsvAvFlags`: UInt,
    public var `MsvAvTimestamp`: `super`.`super`.`super`.`Foundation`.`FILETIME`,
    public var `MsvAvTargetName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 3940:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECPKG_PARAMETERS` (
    public var `Version`: UInt,
    public var `MachineState`: UInt,
    public var `SetupMode`: UInt,
    public var `DomainSid`: `super`.`super`.`PSID`,
    public var `DomainName`: `LSA_UNICODE_STRING`,
    public var `DnsDomainName`: `LSA_UNICODE_STRING`,
    public var `DomainGuid`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 3964:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SECPKG_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SECPKG_POST_LOGON_USER_INFO` (
    public var `Flags`: UInt,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `LinkedLogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECPKG_PRIMARY_CRED` (
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `DownlevelName`: `LSA_UNICODE_STRING`,
    public var `DomainName`: `LSA_UNICODE_STRING`,
    public var `Password`: `LSA_UNICODE_STRING`,
    public var `OldPassword`: `LSA_UNICODE_STRING`,
    public var `UserSid`: `super`.`super`.`PSID`,
    public var `Flags`: UInt,
    public var `DnsDomainName`: `LSA_UNICODE_STRING`,
    public var `Upn`: `LSA_UNICODE_STRING`,
    public var `LogonServer`: `LSA_UNICODE_STRING`,
    public var `Spare1`: `LSA_UNICODE_STRING`,
    public var `Spare2`: `LSA_UNICODE_STRING`,
    public var `Spare3`: `LSA_UNICODE_STRING`,
    public var `Spare4`: `LSA_UNICODE_STRING`,
)
// UNSUPPORTED Rust 3994:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SECPKG_PRIMARY_CRED {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECPKG_PRIMARY_CRED_EX` (
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `DownlevelName`: `LSA_UNICODE_STRING`,
    public var `DomainName`: `LSA_UNICODE_STRING`,
    public var `Password`: `LSA_UNICODE_STRING`,
    public var `OldPassword`: `LSA_UNICODE_STRING`,
    public var `UserSid`: `super`.`super`.`PSID`,
    public var `Flags`: UInt,
    public var `DnsDomainName`: `LSA_UNICODE_STRING`,
    public var `Upn`: `LSA_UNICODE_STRING`,
    public var `LogonServer`: `LSA_UNICODE_STRING`,
    public var `Spare1`: `LSA_UNICODE_STRING`,
    public var `Spare2`: `LSA_UNICODE_STRING`,
    public var `Spare3`: `LSA_UNICODE_STRING`,
    public var `Spare4`: `LSA_UNICODE_STRING`,
    public var `PackageId`: ULong,
    public var `PrevLogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `FlagsEx`: UInt,
)
// UNSUPPORTED Rust 4020:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SECPKG_PRIMARY_CRED_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SECPKG_PRIMARY_CRED_EX_FLAGS_EX_DELEGATION_TOKEN`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECPKG_REDIRECTED_LOGON_BUFFER` (
    public var `RedirectedLogonGuid`: `windows_sys`.`core`.`GUID`,
    public var `RedirectedLogonHandle`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `Init`: `PLSA_REDIRECTED_LOGON_INIT`,
    public var `Callback`: `PLSA_REDIRECTED_LOGON_CALLBACK`,
    public var `CleanupCallback`: `PLSA_REDIRECTED_LOGON_CLEANUP_CALLBACK`,
    public var `GetLogonCreds`: `PLSA_REDIRECTED_LOGON_GET_LOGON_CREDS`,
    public var `GetSupplementalCreds`: `PLSA_REDIRECTED_LOGON_GET_SUPP_CREDS`,
    public var `GetRedirectedLogonSid`: `PLSA_REDIRECTED_LOGON_GET_SID`,
)
// UNSUPPORTED Rust 4038:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SECPKG_REDIRECTED_LOGON_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4043:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SECPKG_REDIRECTED_LOGON_GUID_INITIALIZER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc2be5457_82eb_483e_ae4e_7468ef14d509);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECPKG_SERIALIZED_OID` (
    public var `OidLength`: UInt,
    public var `OidAttributes`: UInt,
    public var `OidValue`: UByteArray,
)
// UNSUPPORTED Rust 4051:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SECPKG_SERIALIZED_OID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SECPKG_SESSIONINFO_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SECPKG_SHORT_VECTOR` (
    public var `ShortArrayOffset`: UInt,
    public var `ShortArrayCount`: UShort,
)
public const val `SECPKG_STATE_CRED_ISOLATION_ENABLED`: UInt = 32u;
public const val `SECPKG_STATE_DOMAIN_CONTROLLER`: UInt = 4u;
public const val `SECPKG_STATE_ENCRYPTION_PERMITTED`: UInt = 1u;
public const val `SECPKG_STATE_RESERVED_1`: UInt = 2147483648u;
public const val `SECPKG_STATE_STANDALONE`: UInt = 16u;
public const val `SECPKG_STATE_STRONG_ENCRYPTION_PERMITTED`: UInt = 2u;
public const val `SECPKG_STATE_WORKSTATION`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECPKG_SUPPLEMENTAL_CRED` (
    public var `PackageName`: `LSA_UNICODE_STRING`,
    public var `CredentialSize`: UInt,
    public var `Credentials`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 4077:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SECPKG_SUPPLEMENTAL_CRED {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECPKG_SUPPLEMENTAL_CRED_ARRAY` (
    public var `CredentialCount`: UInt,
    public var `Credentials`: Array<`SECPKG_SUPPLEMENTAL_CRED`>,
)
// UNSUPPORTED Rust 4088:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SECPKG_SUPPLEMENTAL_CRED_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SECPKG_SUPPLIED_CREDENTIAL` (
    public var `cbHeaderLength`: UShort,
    public var `cbStructureLength`: UShort,
    public var `UserName`: `SECPKG_SHORT_VECTOR`,
    public var `DomainName`: `SECPKG_SHORT_VECTOR`,
    public var `PackedCredentials`: `SECPKG_BYTE_VECTOR`,
    public var `CredFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECPKG_SURROGATE_LOGON` (
    public var `Version`: UInt,
    public var `SurrogateLogonID`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `EntryCount`: UInt,
    public var `Entries`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SECPKG_SURROGATE_LOGON_ENTRY`>?,
)
// UNSUPPORTED Rust 4111:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SECPKG_SURROGATE_LOGON {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECPKG_SURROGATE_LOGON_ENTRY` (
    public var `Type`: `windows_sys`.`core`.`GUID`,
    public var `Data`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 4122:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SECPKG_SURROGATE_LOGON_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SECPKG_SURROGATE_LOGON_VERSION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECPKG_TARGETINFO` (
    public var `DomainSid`: `super`.`super`.`PSID`,
    public var `ComputerName`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 4134:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SECPKG_TARGETINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SECPKG_UNICODE_ATTRIBUTE`: UInt = 2147483648u;
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SECPKG_USERMODEINIT_NAME`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("SpUserModeInitialize");
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SECPKG_USER_FUNCTION_TABLE` (
    public var `InstanceInit`: `SpInstanceInitFn`,
    public var `InitUserModeContext`: `SpInitUserModeContextFn`,
    public var `MakeSignature`: `SpMakeSignatureFn`,
    public var `VerifySignature`: `SpVerifySignatureFn`,
    public var `SealMessage`: `SpSealMessageFn`,
    public var `UnsealMessage`: `SpUnsealMessageFn`,
    public var `GetContextToken`: `SpGetContextTokenFn`,
    public var `QueryContextAttributesA`: `SpQueryContextAttributesFn`,
    public var `CompleteAuthToken`: `SpCompleteAuthTokenFn`,
    public var `DeleteUserModeContext`: `SpDeleteContextFn`,
    public var `FormatCredentials`: `SpFormatCredentialsFn`,
    public var `MarshallSupplementalCreds`: `SpMarshallSupplementalCredsFn`,
    public var `ExportContext`: `SpExportSecurityContextFn`,
    public var `ImportContext`: `SpImportSecurityContextFn`,
    public var `MarshalAttributeData`: `SpMarshalAttributeDataFn`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SECPKG_WOW_CLIENT_DLL` (
    public var `WowClientDllPath`: `SECURITY_STRING`,
)
public const val `SECQOP_WRAP_NO_ENCRYPT`: UInt = 2147483649u;
public const val `SECQOP_WRAP_OOB_DATA`: UInt = 1073741824u;
public const val `SECRET_QUERY_VALUE`: Int = 2;
public const val `SECRET_SET_VALUE`: Int = 1;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SECURITY_ENTRYPOINT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("INITSECURITYINTERFACEA");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SECURITY_ENTRYPOINT16`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("INITSECURITYINTERFACEA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SECURITY_ENTRYPOINT_ANSI`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("InitSecurityInterfaceW");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SECURITY_ENTRYPOINT_ANSIA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("InitSecurityInterfaceA");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SECURITY_ENTRYPOINT_ANSIW`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("InitSecurityInterfaceW");
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECURITY_LOGON_SESSION_DATA` (
    public var `Size`: UInt,
    public var `LogonId`: `super`.`super`.`super`.`Foundation`.`LUID`,
    public var `UserName`: `LSA_UNICODE_STRING`,
    public var `LogonDomain`: `LSA_UNICODE_STRING`,
    public var `AuthenticationPackage`: `LSA_UNICODE_STRING`,
    public var `LogonType`: UInt,
    public var `Session`: UInt,
    public var `Sid`: `super`.`super`.`PSID`,
    public var `LogonTime`: Long,
    public var `LogonServer`: `LSA_UNICODE_STRING`,
    public var `DnsDomainName`: `LSA_UNICODE_STRING`,
    public var `Upn`: `LSA_UNICODE_STRING`,
    public var `UserFlags`: UInt,
    public var `LastLogonInfo`: `LSA_LAST_INTER_LOGON_INFO`,
    public var `LogonScript`: `LSA_UNICODE_STRING`,
    public var `ProfilePath`: `LSA_UNICODE_STRING`,
    public var `HomeDirectory`: `LSA_UNICODE_STRING`,
    public var `HomeDirectoryDrive`: `LSA_UNICODE_STRING`,
    public var `LogoffTime`: Long,
    public var `KickOffTime`: Long,
    public var `PasswordLastSet`: Long,
    public var `PasswordCanChange`: Long,
    public var `PasswordMustChange`: Long,
)
// UNSUPPORTED Rust 4201:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SECURITY_LOGON_SESSION_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4206:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(transparent)]
// #[derive(Clone, Copy)]
// pub struct SECURITY_LOGON_TYPE(pub i32);

// UNSUPPORTED Rust 4209:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECURITY_PACKAGE_OPTIONS` (
    public var `Size`: UInt,
    public var `Type`: `SECURITY_PACKAGE_OPTIONS_TYPE`,
    public var `Flags`: UInt,
    public var `SignatureSize`: UInt,
    public var `Signature`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 4235:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SECURITY_PACKAGE_OPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SECURITY_PACKAGE_OPTIONS_TYPE` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECURITY_STRING` (
    public var `Length`: UShort,
    public var `MaximumLength`: UShort,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
)
// UNSUPPORTED Rust 4248:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECURITY_USER_DATA` (
    public var `UserName`: `SECURITY_STRING`,
    public var `LogonDomainName`: `SECURITY_STRING`,
    public var `LogonServer`: `SECURITY_STRING`,
    public var `pSid`: `super`.`super`.`PSID`,
)
// UNSUPPORTED Rust 4266:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SECURITY_USER_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SEC_APPLICATION_PROTOCOLS` (
    public var `ProtocolListsSize`: UInt,
    public var `ProtocolLists`: Array<`SEC_APPLICATION_PROTOCOL_LIST`>,
)
// UNSUPPORTED Rust 4277:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SEC_APPLICATION_PROTOCOLS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SEC_APPLICATION_PROTOCOL_LIST` (
    public var `ProtoNegoExt`: `SEC_APPLICATION_PROTOCOL_NEGOTIATION_EXT`,
    public var `ProtocolListSize`: UShort,
    public var `ProtocolList`: UByteArray,
)
// UNSUPPORTED Rust 4289:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SEC_APPLICATION_PROTOCOL_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SEC_APPLICATION_PROTOCOL_NEGOTIATION_EXT` = Int;
public typealias `SEC_APPLICATION_PROTOCOL_NEGOTIATION_STATUS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SEC_CERTIFICATE_REQUEST_CONTEXT` (
    public var `cbCertificateRequestContext`: UByte,
    public var `rgCertificateRequestContext`: UByteArray,
)
// UNSUPPORTED Rust 4302:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SEC_CERTIFICATE_REQUEST_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SEC_CHANNEL_BINDINGS` (
    public var `dwInitiatorAddrType`: UInt,
    public var `cbInitiatorLength`: UInt,
    public var `dwInitiatorOffset`: UInt,
    public var `dwAcceptorAddrType`: UInt,
    public var `cbAcceptorLength`: UInt,
    public var `dwAcceptorOffset`: UInt,
    public var `cbApplicationDataLength`: UInt,
    public var `dwApplicationDataOffset`: UInt,
)
public const val `SEC_CHANNEL_BINDINGS_AUDIT_BINDINGS`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SEC_CHANNEL_BINDINGS_EX` (
    public var `magicNumber`: UInt,
    public var `flags`: UInt,
    public var `cbHeaderLength`: UInt,
    public var `cbStructureLength`: UInt,
    public var `dwInitiatorAddrType`: UInt,
    public var `cbInitiatorLength`: UInt,
    public var `dwInitiatorOffset`: UInt,
    public var `dwAcceptorAddrType`: UInt,
    public var `cbAcceptorLength`: UInt,
    public var `dwAcceptorOffset`: UInt,
    public var `cbApplicationDataLength`: UInt,
    public var `dwApplicationDataOffset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SEC_CHANNEL_BINDINGS_RESULT` (
    public var `flags`: UInt,
)
public const val `SEC_CHANNEL_BINDINGS_RESULT_ABSENT`: UInt = 2u;
public const val `SEC_CHANNEL_BINDINGS_RESULT_CLIENT_SUPPORT`: UInt = 1u;
public const val `SEC_CHANNEL_BINDINGS_RESULT_NOTVALID_MISMATCH`: UInt = 4u;
public const val `SEC_CHANNEL_BINDINGS_RESULT_NOTVALID_MISSING`: UInt = 8u;
public const val `SEC_CHANNEL_BINDINGS_RESULT_VALID_MATCHED`: UInt = 16u;
public const val `SEC_CHANNEL_BINDINGS_RESULT_VALID_MISSING`: UInt = 64u;
public const val `SEC_CHANNEL_BINDINGS_RESULT_VALID_PROXY`: UInt = 32u;
public const val `SEC_CHANNEL_BINDINGS_VALID_FLAGS`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SEC_DTLS_MTU` (
    public var `PathMTU`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SEC_FLAGS` (
    public var `Flags`: ULong,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SEC_GET_KEY_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`HRESULT`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SEC_NEGOTIATION_INFO` (
    public var `Size`: UInt,
    public var `NameLength`: UInt,
    public var `Name`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `Reserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 4368:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SEC_NEGOTIATION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SEC_PRESHAREDKEY` (
    public var `KeySize`: UShort,
    public var `Key`: UByteArray,
)
// UNSUPPORTED Rust 4379:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SEC_PRESHAREDKEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SEC_PRESHAREDKEY_IDENTITY` (
    public var `KeyIdentitySize`: UShort,
    public var `KeyIdentity`: UByteArray,
)
// UNSUPPORTED Rust 4390:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SEC_PRESHAREDKEY_IDENTITY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SEC_SRTP_MASTER_KEY_IDENTIFIER` (
    public var `MasterKeyIdentifierSize`: UByte,
    public var `MasterKeyIdentifier`: UByteArray,
)
// UNSUPPORTED Rust 4401:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SEC_SRTP_MASTER_KEY_IDENTIFIER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SEC_SRTP_PROTECTION_PROFILES` (
    public var `ProfilesSize`: UShort,
    public var `ProfilesList`: UShortArray,
)
// UNSUPPORTED Rust 4412:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SEC_SRTP_PROTECTION_PROFILES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SEC_TOKEN_BINDING` (
    public var `MajorVersion`: UByte,
    public var `MinorVersion`: UByte,
    public var `KeyParametersSize`: UShort,
    public var `KeyParameters`: UByteArray,
)
// UNSUPPORTED Rust 4425:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SEC_TOKEN_BINDING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SEC_TRAFFIC_SECRETS` (
    public var `SymmetricAlgId`: UShortArray,
    public var `ChainingMode`: UShortArray,
    public var `HashAlgId`: UShortArray,
    public var `KeySize`: UShort,
    public var `IvSize`: UShort,
    public var `MsgSequenceStart`: UShort,
    public var `MsgSequenceEnd`: UShort,
    public var `TrafficSecretType`: `SEC_TRAFFIC_SECRET_TYPE`,
    public var `TrafficSecretSize`: UShort,
    public var `TrafficSecret`: UByteArray,
)
// UNSUPPORTED Rust 4444:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SEC_TRAFFIC_SECRETS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SEC_TRAFFIC_SECRET_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SEC_WINNT_AUTH_IDENTITY32` (
    public var `User`: UInt,
    public var `UserLength`: UInt,
    public var `Domain`: UInt,
    public var `DomainLength`: UInt,
    public var `Password`: UInt,
    public var `PasswordLength`: UInt,
    public var `Flags`: UInt,
)
public const val `SEC_WINNT_AUTH_IDENTITY_ENCRYPT_FOR_SYSTEM`: UInt = 4u;
public const val `SEC_WINNT_AUTH_IDENTITY_ENCRYPT_SAME_LOGON`: UInt = 1u;
public const val `SEC_WINNT_AUTH_IDENTITY_ENCRYPT_SAME_PROCESS`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SEC_WINNT_AUTH_IDENTITY_EX2` (
    public var `Version`: UInt,
    public var `cbHeaderLength`: UShort,
    public var `cbStructureLength`: UInt,
    public var `UserOffset`: UInt,
    public var `UserLength`: UShort,
    public var `DomainOffset`: UInt,
    public var `DomainLength`: UShort,
    public var `PackedCredentialsOffset`: UInt,
    public var `PackedCredentialsLength`: UShort,
    public var `Flags`: UInt,
    public var `PackageListOffset`: UInt,
    public var `PackageListLength`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SEC_WINNT_AUTH_IDENTITY_EX32` (
    public var `Version`: UInt,
    public var `Length`: UInt,
    public var `User`: UInt,
    public var `UserLength`: UInt,
    public var `Domain`: UInt,
    public var `DomainLength`: UInt,
    public var `Password`: UInt,
    public var `PasswordLength`: UInt,
    public var `Flags`: UInt,
    public var `PackageList`: UInt,
    public var `PackageListLength`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SEC_WINNT_AUTH_IDENTITY_EXA` (
    public var `Version`: UInt,
    public var `Length`: UInt,
    public var `User`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `UserLength`: UInt,
    public var `Domain`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `DomainLength`: UInt,
    public var `Password`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `PasswordLength`: UInt,
    public var `Flags`: UInt,
    public var `PackageList`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `PackageListLength`: UInt,
)
// UNSUPPORTED Rust 4510:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SEC_WINNT_AUTH_IDENTITY_EXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SEC_WINNT_AUTH_IDENTITY_EXW` (
    public var `Version`: UInt,
    public var `Length`: UInt,
    public var `User`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `UserLength`: UInt,
    public var `Domain`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `DomainLength`: UInt,
    public var `Password`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `PasswordLength`: UInt,
    public var `Flags`: UInt,
    public var `PackageList`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `PackageListLength`: UInt,
)
// UNSUPPORTED Rust 4530:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// UNSUPPORTED Rust 4549:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
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

// UNSUPPORTED Rust 4559:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SEND_GENERIC_TLS_EXTENSION` (
    public var `ExtensionType`: UShort,
    public var `HandshakeType`: UShort,
    public var `Flags`: UInt,
    public var `BufferSize`: UShort,
    public var `Buffer`: UByteArray,
)
// UNSUPPORTED Rust 4578:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SEND_GENERIC_TLS_EXTENSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SESSION_TICKET_INFO_V0`: UInt = 0u;
public const val `SESSION_TICKET_INFO_VERSION`: UInt = 0u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `SET_CONTEXT_ATTRIBUTES_FN_A` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `SET_CONTEXT_ATTRIBUTES_FN_W` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `SET_CREDENTIALS_ATTRIBUTES_FN_A` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `SET_CREDENTIALS_ATTRIBUTES_FN_W` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SE_ADT_ACCESS_REASON` (
    public var `AccessMask`: UInt,
    public var `AccessReasons`: UIntArray,
    public var `ObjectTypeIndex`: UInt,
    public var `AccessGranted`: UInt,
    public var `SecurityDescriptor`: `super`.`super`.`PSECURITY_DESCRIPTOR`,
)
// UNSUPPORTED Rust 4602:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SE_ADT_ACCESS_REASON {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SE_ADT_CLAIMS` (
    public var `Length`: UInt,
    public var `Claims`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 4613:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SE_ADT_CLAIMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SE_ADT_OBJECT_ONLY`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SE_ADT_OBJECT_TYPE` (
    public var `ObjectType`: `windows_sys`.`core`.`GUID`,
    public var `Flags`: UShort,
    public var `Level`: UShort,
    public var `AccessMask`: UInt,
)
public const val `SE_ADT_PARAMETERS_SELF_RELATIVE`: UInt = 1u;
public const val `SE_ADT_PARAMETERS_SEND_TO_LSA`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SE_ADT_PARAMETER_ARRAY` (
    public var `CategoryId`: UInt,
    public var `AuditId`: UInt,
    public var `ParameterCount`: UInt,
    public var `Length`: UInt,
    public var `FlatSubCategoryId`: UShort,
    public var `Type`: UShort,
    public var `Flags`: UInt,
    public var `Parameters`: Array<`SE_ADT_PARAMETER_ARRAY_ENTRY`>,
)
// UNSUPPORTED Rust 4641:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SE_ADT_PARAMETER_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SE_ADT_PARAMETER_ARRAY_ENTRY` (
    public var `Type`: `SE_ADT_PARAMETER_TYPE`,
    public var `Length`: UInt,
    public var `Data`: ULongArray,
    public var `Address`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 4654:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SE_ADT_PARAMETER_ARRAY_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SE_ADT_PARAMETER_ARRAY_EX` (
    public var `CategoryId`: UInt,
    public var `AuditId`: UInt,
    public var `Version`: UInt,
    public var `ParameterCount`: UInt,
    public var `Length`: UInt,
    public var `FlatSubCategoryId`: UShort,
    public var `Type`: UShort,
    public var `Flags`: UInt,
    public var `Parameters`: Array<`SE_ADT_PARAMETER_ARRAY_ENTRY`>,
)
// UNSUPPORTED Rust 4672:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SE_BATCH_LOGON_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SeBatchLogonRight");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SE_DENY_BATCH_LOGON_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SeDenyBatchLogonRight");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SE_DENY_INTERACTIVE_LOGON_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SeDenyInteractiveLogonRight");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SE_DENY_NETWORK_LOGON_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SeDenyNetworkLogonRight");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SE_DENY_REMOTE_INTERACTIVE_LOGON_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SeDenyRemoteInteractiveLogonRight");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SE_DENY_SERVICE_LOGON_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SeDenyServiceLogonRight");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SE_INTERACTIVE_LOGON_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SeInteractiveLogonRight");
public const val `SE_MAX_AUDIT_PARAMETERS`: UInt = 32u;
public const val `SE_MAX_GENERIC_AUDIT_PARAMETERS`: UInt = 28u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SE_NETWORK_LOGON_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SeNetworkLogonRight");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SE_REMOTE_INTERACTIVE_LOGON_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SeRemoteInteractiveLogonRight");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SE_SERVICE_LOGON_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SeServiceLogonRight");
public typealias `SLDATATYPE` = UInt;
public typealias `SLIDTYPE` = Int;
public typealias `SLLICENSINGSTATUS` = Int;
public typealias `SLREFERRALTYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SL_ACTIVATION_INFO_HEADER` (
    public var `cbSize`: UInt,
    public var `type`: `SL_ACTIVATION_TYPE`,
)
public typealias `SL_ACTIVATION_TYPE` = Int;
public const val `SL_ACTIVATION_TYPE_ACTIVE_DIRECTORY`: `SL_ACTIVATION_TYPE` = 1;
public const val `SL_ACTIVATION_TYPE_DEFAULT`: `SL_ACTIVATION_TYPE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SL_AD_ACTIVATION_INFO` (
    public var `header`: `SL_ACTIVATION_INFO_HEADER`,
    public var `pwszProductKey`: `windows_sys`.`core`.`PCWSTR`,
    public var `pwszActivationObjectName`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 4714:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_DEFAULT_MIGRATION_ENCRYPTOR_URI`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("msft:spp/migrationencryptor/tokenact/1.0");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_EVENT_LICENSING_STATE_CHANGED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("msft:rm/event/licensingstatechanged");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_EVENT_POLICY_CHANGED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("msft:rm/event/policychanged");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_EVENT_USER_NOTIFICATION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("msft:rm/event/usernotification");
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
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_ACTIVE_PLUGINS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ActivePlugins");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_AUTHOR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Author");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_BIOS_OA2_MINOR_VERSION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BiosOA2MinorVersion");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_BIOS_PKEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BiosProductKey");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_BIOS_PKEY_DESCRIPTION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BiosProductKeyDescription");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_BIOS_PKEY_PKPN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BiosProductKeyPkPn");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_BIOS_SLIC_STATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BiosSlicState");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_CHANNEL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Channel");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_DESCRIPTION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Description");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_DIGITAL_PID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DigitalPID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_DIGITAL_PID2`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DigitalPID2");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_IS_KMS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("IsKeyManagementService");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_IS_PRS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("IsPRS");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_KMS_CURRENT_COUNT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeyManagementServiceCurrentCount");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_KMS_FAILED_REQUESTS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeyManagementServiceFailedRequests");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_KMS_LICENSED_REQUESTS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeyManagementServiceLicensedRequests");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_KMS_NON_GENUINE_GRACE_REQUESTS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeyManagementServiceNonGenuineGraceRequests");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_KMS_NOTIFICATION_REQUESTS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeyManagementServiceNotificationRequests");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_KMS_OOB_GRACE_REQUESTS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeyManagementServiceOOBGraceRequests");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_KMS_OOT_GRACE_REQUESTS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeyManagementServiceOOTGraceRequests");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_KMS_REQUIRED_CLIENT_COUNT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeyManagementServiceRequiredClientCount");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_KMS_TOTAL_REQUESTS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeyManagementServiceTotalRequests");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_KMS_UNLICENSED_REQUESTS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeyManagementServiceUnlicensedRequests");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_LICENSE_TYPE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LicenseType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_LICENSOR_URL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LicensorUrl");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Name");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_PARTIAL_PRODUCT_KEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PartialProductKey");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_PRODUCT_KEY_ACTIVATION_URL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PKCURL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_PRODUCT_SKU_ID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ProductSkuId");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_RIGHT_ACCOUNT_ACTIVATION_URL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RACURL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_SECURE_PROCESSOR_ACTIVATION_URL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SPCURL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_SECURE_STORE_ID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SecureStoreId");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_SYSTEM_STATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SystemState");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_USE_LICENSE_ACTIVATION_URL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EULURL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_INFO_KEY_VERSION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Version");
public const val `SL_INTERNAL_ZONE`: UInt = 57344u;
public const val `SL_I_NONGENUINE_GRACE_PERIOD`: Int = 1074065509;
public const val `SL_I_NONGENUINE_GRACE_PERIOD_2`: Int = 1074065512;
public const val `SL_I_OOB_GRACE_PERIOD`: Int = 1074065420;
public const val `SL_I_OOT_GRACE_PERIOD`: Int = 1074065421;
public const val `SL_I_PERPETUAL_OOB_GRACE_PERIOD`: Int = 1074068485;
public const val `SL_I_STORE_BASED_ACTIVATION`: Int = 1074066433;
public const val `SL_I_TIMEBASED_EXTENDED_GRACE_PERIOD`: Int = 1074068486;
public const val `SL_I_TIMEBASED_VALIDITY_PERIOD`: Int = 1074068484;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SL_LICENSING_STATUS` (
    public var `SkuId`: `windows_sys`.`core`.`GUID`,
    public var `eStatus`: `SLLICENSINGSTATUS`,
    public var `dwGraceTime`: UInt,
    public var `dwTotalGraceDays`: UInt,
    public var `hrReason`: `windows_sys`.`core`.`HRESULT`,
    public var `qwValidityExpiration`: ULong,
)
public const val `SL_LICENSING_STATUS_IN_GRACE_PERIOD`: `SLLICENSINGSTATUS` = 2;
public const val `SL_LICENSING_STATUS_LAST`: `SLLICENSINGSTATUS` = 4;
public const val `SL_LICENSING_STATUS_LICENSED`: `SLLICENSINGSTATUS` = 1;
public const val `SL_LICENSING_STATUS_NOTIFICATION`: `SLLICENSINGSTATUS` = 3;
public const val `SL_LICENSING_STATUS_UNLICENSED`: `SLLICENSINGSTATUS` = 0;
public const val `SL_MDOLLAR_ZONE`: UInt = 40960u;
public const val `SL_MSCH_ZONE`: UInt = 49152u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SL_NONGENUINE_UI_OPTIONS` (
    public var `cbSize`: UInt,
    public var `pComponentId`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `hResultUI`: `windows_sys`.`core`.`HRESULT`,
)
// UNSUPPORTED Rust 5097:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SL_NONGENUINE_UI_OPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_PKEY_DETECT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("msft:rm/algorithm/pkey/detect");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_PKEY_MS2005`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("msft:rm/algorithm/pkey/2005");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_PKEY_MS2009`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("msft:rm/algorithm/pkey/2009");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_POLICY_EVALUATION_MODE_ENABLED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Security-SPP-EvaluationModeEnabled");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_PROP_ACTIVATION_VALIDATION_IN_PROGRESS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SL_ACTIVATION_VALIDATION_IN_PROGRESS");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_PROP_BRT_COMMIT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SL_BRT_COMMIT");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_PROP_BRT_DATA`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SL_BRT_DATA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_PROP_GENUINE_RESULT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SL_GENUINE_RESULT");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_PROP_GET_GENUINE_AUTHZ`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SL_GET_GENUINE_AUTHZ");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_PROP_GET_GENUINE_SERVER_AUTHZ`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SL_GET_GENUINE_SERVER_AUTHZ");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_PROP_LAST_ACT_ATTEMPT_HRESULT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SL_LAST_ACT_ATTEMPT_HRESULT");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_PROP_LAST_ACT_ATTEMPT_SERVER_FLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SL_LAST_ACT_ATTEMPT_SERVER_FLAGS");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_PROP_LAST_ACT_ATTEMPT_TIME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SL_LAST_ACT_ATTEMPT_TIME");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SL_PROP_NONGENUINE_GRACE_FLAG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SL_NONGENUINE_GRACE_FLAG");
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SL_SYSTEM_POLICY_INFORMATION` (
    public var `Reserved1`: Array</* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>,
    public var `Reserved2`: UIntArray,
)
// UNSUPPORTED Rust 5244:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SP_ACCEPT_CREDENTIALS_NAME`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("SpAcceptCredentials\u0000");
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SR_SECURITY_DESCRIPTOR` (
    public var `Length`: UInt,
    public var `SecurityDescriptor`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 5289:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SR_SECURITY_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SSL2SP_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Microsoft SSL 2.0");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SSL2SP_NAME_A`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("Microsoft SSL 2.0");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SSL2SP_NAME_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Microsoft SSL 2.0");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SSL3SP_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Microsoft SSL 3.0");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SSL3SP_NAME_A`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("Microsoft SSL 3.0");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SSL3SP_NAME_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Microsoft SSL 3.0");
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public typealias `SSL_CRACK_CERTIFICATE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, `windows_sys`.`core`.`BOOL`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`X509Certificate`>>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SSL_CRACK_CERTIFICATE_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SslCrackCertificate");
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SSL_CREDENTIAL_CERTIFICATE` (
    public var `cbPrivateKey`: UInt,
    public var `pPrivateKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbCertificate`: UInt,
    public var `pCertificate`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `pszPassword`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 5312:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SSL_CREDENTIAL_CERTIFICATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SSL_EMPTY_CACHE_FN_A` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SSL_EMPTY_CACHE_FN_W` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public typealias `SSL_FREE_CERTIFICATE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`X509Certificate`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SSL_FREE_CERTIFICATE_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SslFreeCertificate");
public const val `SSL_SESSION_DISABLE_RECONNECTS`: `SCHANNEL_SESSION_TOKEN_FLAGS` = 2u;
public const val `SSL_SESSION_ENABLE_RECONNECTS`: `SCHANNEL_SESSION_TOKEN_FLAGS` = 1u;
public const val `SSL_SESSION_RECONNECT`: UInt = 1u;
public const val `SSPIPFC_CREDPROV_DO_NOT_LOAD`: UInt = 4u;
public const val `SSPIPFC_CREDPROV_DO_NOT_SAVE`: UInt = 1u;
public const val `SSPIPFC_NO_CHECKBOX`: UInt = 2u;
public const val `SSPIPFC_SAVE_CRED_BY_CALLER`: UInt = 1u;
public const val `SSPIPFC_USE_CREDUIBROKER`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SUBSCRIBE_GENERIC_TLS_EXTENSION` (
    public var `Flags`: UInt,
    public var `SubscriptionsCount`: UInt,
    public var `Subscriptions`: Array<`TLS_EXTENSION_SUBSCRIPTION`>,
)
// UNSUPPORTED Rust 5337:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecBuffer` (
    public var `cbBuffer`: UInt,
    public var `BufferType`: UInt,
    public var `pvBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 5395:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecBuffer {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecBufferDesc` (
    public var `ulVersion`: UInt,
    public var `cBuffers`: UInt,
    public var `pBuffers`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBuffer`>?,
)
// UNSUPPORTED Rust 5407:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_AccessToken` (
    public var `AccessToken`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 5434:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_AccessToken {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 255 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_ApplicationProtocol` (
    public var `ProtoNegoStatus`: `SEC_APPLICATION_PROTOCOL_NEGOTIATION_STATUS`,
    public var `ProtoNegoExt`: `SEC_APPLICATION_PROTOCOL_NEGOTIATION_EXT`,
    public var `ProtocolIdSize`: UByte,
    public var `ProtocolId`: UByteArray,
)
// UNSUPPORTED Rust 5447:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_ApplicationProtocol {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_AuthorityA` (
    public var `sAuthorityName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
)
// UNSUPPORTED Rust 5457:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_AuthorityA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_AuthorityW` (
    public var `sAuthorityName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
)
// UNSUPPORTED Rust 5467:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_AuthorityW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_AuthzID` (
    public var `AuthzIDLength`: UInt,
    public var `AuthzID`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 5478:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_AuthzID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_Bindings` (
    public var `BindingsLength`: UInt,
    public var `Bindings`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SEC_CHANNEL_BINDINGS`>?,
)
// UNSUPPORTED Rust 5489:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_Bindings {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_CertInfo` (
    public var `dwVersion`: UInt,
    public var `cbSubjectName`: UInt,
    public var `pwszSubjectName`: `windows_sys`.`core`.`PWSTR`,
    public var `cbIssuerName`: UInt,
    public var `pwszIssuerName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwKeySize`: UInt,
)
// UNSUPPORTED Rust 5504:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_CertInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SecPkgContext_CertificateValidationResult` (
    public var `dwChainErrorStatus`: UInt,
    public var `hrVerifyChainStatus`: `windows_sys`.`core`.`HRESULT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_Certificates` (
    public var `cCertificates`: UInt,
    public var `cbCertificateChain`: UInt,
    public var `pbCertificateChain`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 5522:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_Certificates {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_CipherInfo` (
    public var `dwVersion`: UInt,
    public var `dwProtocol`: UInt,
    public var `dwCipherSuite`: UInt,
    public var `dwBaseCipherSuite`: UInt,
    public var `szCipherSuite`: UShortArray,
    public var `szCipher`: UShortArray,
    public var `dwCipherLen`: UInt,
    public var `dwCipherBlockLen`: UInt,
    public var `szHash`: UShortArray,
    public var `dwHashLen`: UInt,
    public var `szExchange`: UShortArray,
    public var `dwMinExchangeLen`: UInt,
    public var `dwMaxExchangeLen`: UInt,
    public var `szCertificate`: UShortArray,
    public var `dwKeyType`: UInt,
)
// UNSUPPORTED Rust 5546:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_CipherInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SecPkgContext_ClientCertPolicyResult` (
    public var `dwPolicyResult`: `windows_sys`.`core`.`HRESULT`,
    public var `guidPolicyId`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_ClientSpecifiedTarget` (
    public var `sTargetName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
)
// UNSUPPORTED Rust 5562:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_ClientSpecifiedTarget {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SecPkgContext_ConnectionInfo` (
    public var `dwProtocol`: UInt,
    public var `aiCipher`: `super`.`super`.`Cryptography`.`ALG_ID`,
    public var `dwCipherStrength`: UInt,
    public var `aiHash`: `super`.`super`.`Cryptography`.`ALG_ID`,
    public var `dwHashStrength`: UInt,
    public var `aiExch`: `super`.`super`.`Cryptography`.`ALG_ID`,
    public var `dwExchStrength`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_ConnectionInfoEx` (
    public var `dwVersion`: UInt,
    public var `dwProtocol`: UInt,
    public var `szCipher`: UShortArray,
    public var `dwCipherStrength`: UInt,
    public var `szHash`: UShortArray,
    public var `dwHashStrength`: UInt,
    public var `szExchange`: UShortArray,
    public var `dwExchStrength`: UInt,
)
// UNSUPPORTED Rust 5591:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_ConnectionInfoEx {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SecPkgContext_CredInfo` (
    public var `CredClass`: `SECPKG_CRED_CLASS`,
    public var `IsPromptingNeeded`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_CredentialNameA` (
    public var `CredentialType`: UInt,
    public var `sCredentialName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
)
// UNSUPPORTED Rust 5608:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_CredentialNameA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_CredentialNameW` (
    public var `CredentialType`: UInt,
    public var `sCredentialName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
)
// UNSUPPORTED Rust 5619:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_CredentialNameW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_DceInfo` (
    public var `AuthzSvc`: UInt,
    public var `pPac`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 5630:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_DceInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_EapKeyBlock` (
    public var `rgbKeys`: UByteArray,
    public var `rgbIVs`: UByteArray,
)
// UNSUPPORTED Rust 5641:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_EapKeyBlock {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_EapPrfInfo` (
    public var `dwVersion`: UInt,
    public var `cbPrfData`: UInt,
    public var `pbPrfData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 5653:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_EapPrfInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SecPkgContext_EarlyStart` (
    public var `dwEarlyStartFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SecPkgContext_Flags` (
    public var `Flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_IssuerListInfoEx` (
    public var `aIssuers`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Cryptography`.`CRYPT_INTEGER_BLOB`>?,
    public var `cIssuers`: UInt,
)
// UNSUPPORTED Rust 5675:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SecPkgContext_IssuerListInfoEx {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_KeyInfoA` (
    public var `sSignatureAlgorithmName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `sEncryptAlgorithmName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `KeySize`: UInt,
    public var `SignatureAlgorithm`: UInt,
    public var `EncryptAlgorithm`: UInt,
)
// UNSUPPORTED Rust 5690:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_KeyInfoA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_KeyInfoW` (
    public var `sSignatureAlgorithmName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `sEncryptAlgorithmName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `KeySize`: UInt,
    public var `SignatureAlgorithm`: UInt,
    public var `EncryptAlgorithm`: UInt,
)
// UNSUPPORTED Rust 5704:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_KeyInfoW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_KeyingMaterial` (
    public var `cbKeyingMaterial`: UInt,
    public var `pbKeyingMaterial`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 5715:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_KeyingMaterial {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_KeyingMaterialInfo` (
    public var `cbLabel`: UShort,
    public var `pszLabel`: `windows_sys`.`core`.`PSTR`,
    public var `cbContextValue`: UShort,
    public var `pbContextValue`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbKeyingMaterial`: UInt,
)
// UNSUPPORTED Rust 5729:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_KeyingMaterialInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_KeyingMaterial_Inproc` (
    public var `cbLabel`: UShort,
    public var `pszLabel`: `windows_sys`.`core`.`PSTR`,
    public var `cbContextValue`: UShort,
    public var `pbContextValue`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbKeyingMaterial`: UInt,
    public var `pbKeyingMaterial`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 5744:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_KeyingMaterial_Inproc {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SecPkgContext_LastClientTokenStatus` (
    public var `LastClientTokenStatus`: `SECPKG_ATTR_LCT_STATUS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SecPkgContext_Lifespan` (
    public var `tsStart`: Long,
    public var `tsExpiry`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_LocalCredentialInfo` (
    public var `cbCertificateChain`: UInt,
    public var `pbCertificateChain`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cCertificates`: UInt,
    public var `fFlags`: UInt,
    public var `dwBits`: UInt,
)
// UNSUPPORTED Rust 5769:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_LocalCredentialInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SecPkgContext_LogoffTime` (
    public var `tsLogoffTime`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_MappedCredAttr` (
    public var `dwAttribute`: UInt,
    public var `pvBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 5785:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_MappedCredAttr {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_NamesA` (
    public var `sUserName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
)
// UNSUPPORTED Rust 5795:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_NamesA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_NamesW` (
    public var `sUserName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
)
// UNSUPPORTED Rust 5805:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_NamesW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_NativeNamesA` (
    public var `sClientName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `sServerName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
)
// UNSUPPORTED Rust 5816:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_NativeNamesA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_NativeNamesW` (
    public var `sClientName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `sServerName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
)
// UNSUPPORTED Rust 5827:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_NativeNamesW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_NegoKeys` (
    public var `KeyType`: UInt,
    public var `KeyLength`: UShort,
    public var `KeyValue`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `VerifyKeyType`: UInt,
    public var `VerifyKeyLength`: UShort,
    public var `VerifyKeyValue`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 5842:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_NegoKeys {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SecPkgContext_NegoPackageInfo` (
    public var `PackageMask`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SecPkgContext_NegoStatus` (
    public var `LastStatus`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_NegotiatedTlsExtensions` (
    public var `ExtensionsCount`: UInt,
    public var `Extensions`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
)
// UNSUPPORTED Rust 5863:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_NegotiatedTlsExtensions {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_NegotiationInfoA` (
    public var `PackageInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SecPkgInfoA`>?,
    public var `NegotiationState`: UInt,
)
// UNSUPPORTED Rust 5874:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_NegotiationInfoA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_NegotiationInfoW` (
    public var `PackageInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SecPkgInfoW`>?,
    public var `NegotiationState`: UInt,
)
// UNSUPPORTED Rust 5885:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_NegotiationInfoW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_PackageInfoA` (
    public var `PackageInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SecPkgInfoA`>?,
)
// UNSUPPORTED Rust 5895:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_PackageInfoA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_PackageInfoW` (
    public var `PackageInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SecPkgInfoW`>?,
)
// UNSUPPORTED Rust 5905:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_PackageInfoW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SecPkgContext_PasswordExpiry` (
    public var `tsPasswordExpires`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_ProtoInfoA` (
    public var `sProtocolName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `majorVersion`: UInt,
    public var `minorVersion`: UInt,
)
// UNSUPPORTED Rust 5922:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_ProtoInfoA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_ProtoInfoW` (
    public var `sProtocolName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `majorVersion`: UInt,
    public var `minorVersion`: UInt,
)
// UNSUPPORTED Rust 5934:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_ProtoInfoW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_RemoteCredentialInfo` (
    public var `cbCertificateChain`: UInt,
    public var `pbCertificateChain`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cCertificates`: UInt,
    public var `fFlags`: UInt,
    public var `dwBits`: UInt,
)
// UNSUPPORTED Rust 5948:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_RemoteCredentialInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_SaslContext` (
    public var `SaslContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 5958:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_SaslContext {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_SessionAppData` (
    public var `dwFlags`: UInt,
    public var `cbAppData`: UInt,
    public var `pbAppData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 5970:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_SessionAppData {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_SessionInfo` (
    public var `dwFlags`: UInt,
    public var `cbSessionId`: UInt,
    public var `rgbSessionId`: UByteArray,
)
// UNSUPPORTED Rust 5982:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_SessionInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_SessionKey` (
    public var `SessionKeyLength`: UInt,
    public var `SessionKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 5993:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_SessionKey {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SecPkgContext_Sizes` (
    public var `cbMaxToken`: UInt,
    public var `cbMaxSignature`: UInt,
    public var `cbBlockSize`: UInt,
    public var `cbSecurityTrailer`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_SrtpParameters` (
    public var `ProtectionProfile`: UShort,
    public var `MasterKeyIdentifierSize`: UByte,
    public var `MasterKeyIdentifier`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 6013:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_SrtpParameters {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SecPkgContext_StreamSizes` (
    public var `cbHeader`: UInt,
    public var `cbTrailer`: UInt,
    public var `cbMaximumMessage`: UInt,
    public var `cBuffers`: UInt,
    public var `cbBlockSize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_SubjectAttributes` (
    public var `AttributeInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 6032:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_SubjectAttributes {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_SupportedSignatures` (
    public var `cSignatureAndHashAlgorithms`: UShort,
    public var `pSignatureAndHashAlgorithms`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
)
// UNSUPPORTED Rust 6043:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_SupportedSignatures {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_Target` (
    public var `TargetLength`: UInt,
    public var `Target`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 6054:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_Target {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_TargetInformation` (
    public var `MarshalledTargetInfoLength`: UInt,
    public var `MarshalledTargetInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 6065:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_TargetInformation {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_TokenBinding` (
    public var `MajorVersion`: UByte,
    public var `MinorVersion`: UByte,
    public var `KeyParametersSize`: UShort,
    public var `KeyParameters`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 6078:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_TokenBinding {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_UiInfo` (
    public var `hParentWindow`: `super`.`super`.`super`.`Foundation`.`HWND`,
)
// UNSUPPORTED Rust 6088:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_UiInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SecPkgContext_UserFlags` (
    public var `UserFlags`: UInt,
)
public const val `SecPkgCredClass_Ephemeral`: `SECPKG_CRED_CLASS` = 10;
public const val `SecPkgCredClass_Explicit`: `SECPKG_CRED_CLASS` = 40;
public const val `SecPkgCredClass_None`: `SECPKG_CRED_CLASS` = 0;
public const val `SecPkgCredClass_PersistedGeneric`: `SECPKG_CRED_CLASS` = 20;
public const val `SecPkgCredClass_PersistedSpecific`: `SECPKG_CRED_CLASS` = 30;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SecPkgCred_CipherStrengths` (
    public var `dwMinimumCipherStrength`: UInt,
    public var `dwMaximumCipherStrength`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgCred_ClientCertPolicy` (
    public var `dwFlags`: UInt,
    public var `guidPolicyId`: `windows_sys`.`core`.`GUID`,
    public var `dwCertFlags`: UInt,
    public var `dwUrlRetrievalTimeout`: UInt,
    public var `fCheckRevocationFreshnessTime`: `windows_sys`.`core`.`BOOL`,
    public var `dwRevocationFreshnessTime`: UInt,
    public var `fOmitUsageCheck`: `windows_sys`.`core`.`BOOL`,
    public var `pwszSslCtlStoreName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszSslCtlIdentifier`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 6122:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgCred_ClientCertPolicy {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgCred_SessionTicketKey` (
    public var `TicketInfoVersion`: UInt,
    public var `KeyId`: UByteArray,
    public var `KeyingMaterial`: UByteArray,
    public var `KeyingMaterialSize`: UByte,
)
// UNSUPPORTED Rust 6135:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgCred_SessionTicketKey {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgCred_SessionTicketKeys` (
    public var `cSessionTicketKeys`: UInt,
    public var `pSessionTicketKeys`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SecPkgCred_SessionTicketKey`>?,
)
// UNSUPPORTED Rust 6146:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgCred_SessionTicketKeys {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgCred_SupportedAlgs` (
    public var `cSupportedAlgs`: UInt,
    public var `palgSupportedAlgs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Cryptography`.`ALG_ID`>?,
)
// UNSUPPORTED Rust 6158:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SecPkgCred_SupportedAlgs {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SecPkgCred_SupportedProtocols` (
    public var `grbitProtocol`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgCredentials_Cert` (
    public var `EncodedCertSize`: UInt,
    public var `EncodedCert`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 6175:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgCredentials_Cert {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SecPkgCredentials_KdcProxySettingsW` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `ProxyServerOffset`: UShort,
    public var `ProxyServerLength`: UShort,
    public var `ClientTlsCredOffset`: UShort,
    public var `ClientTlsCredLength`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgCredentials_NamesA` (
    public var `sUserName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
)
// UNSUPPORTED Rust 6195:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgCredentials_NamesA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgCredentials_NamesW` (
    public var `sUserName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
)
// UNSUPPORTED Rust 6205:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgCredentials_NamesW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgCredentials_SSIProviderA` (
    public var `sProviderName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `ProviderInfoLength`: UInt,
    public var `ProviderInfo`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 6217:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgCredentials_SSIProviderA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgCredentials_SSIProviderW` (
    public var `sProviderName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `ProviderInfoLength`: UInt,
    public var `ProviderInfo`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 6229:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgCredentials_SSIProviderW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgInfoA` (
    public var `fCapabilities`: UInt,
    public var `wVersion`: UShort,
    public var `wRPCID`: UShort,
    public var `cbMaxToken`: UInt,
    public var `Name`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `Comment`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
)
// UNSUPPORTED Rust 6244:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgInfoA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgInfoW` (
    public var `fCapabilities`: UInt,
    public var `wVersion`: UShort,
    public var `wRPCID`: UShort,
    public var `cbMaxToken`: UInt,
    public var `Name`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `Comment`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
)
// UNSUPPORTED Rust 6259:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecurityFunctionTableA` (
    public var `dwVersion`: UInt,
    public var `EnumerateSecurityPackagesA`: `ENUMERATE_SECURITY_PACKAGES_FN_A`,
    public var `QueryCredentialsAttributesA`: `QUERY_CREDENTIALS_ATTRIBUTES_FN_A`,
    public var `AcquireCredentialsHandleA`: `ACQUIRE_CREDENTIALS_HANDLE_FN_A`,
    public var `FreeCredentialsHandle`: `FREE_CREDENTIALS_HANDLE_FN`,
    public var `Reserved2`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `InitializeSecurityContextA`: `INITIALIZE_SECURITY_CONTEXT_FN_A`,
    public var `AcceptSecurityContext`: `ACCEPT_SECURITY_CONTEXT_FN`,
    public var `CompleteAuthToken`: `COMPLETE_AUTH_TOKEN_FN`,
    public var `DeleteSecurityContext`: `DELETE_SECURITY_CONTEXT_FN`,
    public var `ApplyControlToken`: `APPLY_CONTROL_TOKEN_FN`,
    public var `QueryContextAttributesA`: `QUERY_CONTEXT_ATTRIBUTES_FN_A`,
    public var `ImpersonateSecurityContext`: `IMPERSONATE_SECURITY_CONTEXT_FN`,
    public var `RevertSecurityContext`: `REVERT_SECURITY_CONTEXT_FN`,
    public var `MakeSignature`: `MAKE_SIGNATURE_FN`,
    public var `VerifySignature`: `VERIFY_SIGNATURE_FN`,
    public var `FreeContextBuffer`: `FREE_CONTEXT_BUFFER_FN`,
    public var `QuerySecurityPackageInfoA`: `QUERY_SECURITY_PACKAGE_INFO_FN_A`,
    public var `Reserved3`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved4`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ExportSecurityContext`: `EXPORT_SECURITY_CONTEXT_FN`,
    public var `ImportSecurityContextA`: `IMPORT_SECURITY_CONTEXT_FN_A`,
    public var `AddCredentialsA`: `ADD_CREDENTIALS_FN_A`,
    public var `Reserved8`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `QuerySecurityContextToken`: `QUERY_SECURITY_CONTEXT_TOKEN_FN`,
    public var `EncryptMessage`: `ENCRYPT_MESSAGE_FN`,
    public var `DecryptMessage`: `DECRYPT_MESSAGE_FN`,
    public var `SetContextAttributesA`: `SET_CONTEXT_ATTRIBUTES_FN_A`,
    public var `SetCredentialsAttributesA`: `SET_CREDENTIALS_ATTRIBUTES_FN_A`,
    public var `ChangeAccountPasswordA`: `CHANGE_PASSWORD_FN_A`,
    public var `QueryContextAttributesExA`: `QUERY_CONTEXT_ATTRIBUTES_EX_FN_A`,
    public var `QueryCredentialsAttributesExA`: `QUERY_CREDENTIALS_ATTRIBUTES_EX_FN_A`,
)
// UNSUPPORTED Rust 6314:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Credentials")]
// impl Default for SecurityFunctionTableA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecurityFunctionTableW` (
    public var `dwVersion`: UInt,
    public var `EnumerateSecurityPackagesW`: `ENUMERATE_SECURITY_PACKAGES_FN_W`,
    public var `QueryCredentialsAttributesW`: `QUERY_CREDENTIALS_ATTRIBUTES_FN_W`,
    public var `AcquireCredentialsHandleW`: `ACQUIRE_CREDENTIALS_HANDLE_FN_W`,
    public var `FreeCredentialsHandle`: `FREE_CREDENTIALS_HANDLE_FN`,
    public var `Reserved2`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `InitializeSecurityContextW`: `INITIALIZE_SECURITY_CONTEXT_FN_W`,
    public var `AcceptSecurityContext`: `ACCEPT_SECURITY_CONTEXT_FN`,
    public var `CompleteAuthToken`: `COMPLETE_AUTH_TOKEN_FN`,
    public var `DeleteSecurityContext`: `DELETE_SECURITY_CONTEXT_FN`,
    public var `ApplyControlToken`: `APPLY_CONTROL_TOKEN_FN`,
    public var `QueryContextAttributesW`: `QUERY_CONTEXT_ATTRIBUTES_FN_W`,
    public var `ImpersonateSecurityContext`: `IMPERSONATE_SECURITY_CONTEXT_FN`,
    public var `RevertSecurityContext`: `REVERT_SECURITY_CONTEXT_FN`,
    public var `MakeSignature`: `MAKE_SIGNATURE_FN`,
    public var `VerifySignature`: `VERIFY_SIGNATURE_FN`,
    public var `FreeContextBuffer`: `FREE_CONTEXT_BUFFER_FN`,
    public var `QuerySecurityPackageInfoW`: `QUERY_SECURITY_PACKAGE_INFO_FN_W`,
    public var `Reserved3`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved4`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ExportSecurityContext`: `EXPORT_SECURITY_CONTEXT_FN`,
    public var `ImportSecurityContextW`: `IMPORT_SECURITY_CONTEXT_FN_W`,
    public var `AddCredentialsW`: `ADD_CREDENTIALS_FN_W`,
    public var `Reserved8`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `QuerySecurityContextToken`: `QUERY_SECURITY_CONTEXT_TOKEN_FN`,
    public var `EncryptMessage`: `ENCRYPT_MESSAGE_FN`,
    public var `DecryptMessage`: `DECRYPT_MESSAGE_FN`,
    public var `SetContextAttributesW`: `SET_CONTEXT_ATTRIBUTES_FN_W`,
    public var `SetCredentialsAttributesW`: `SET_CREDENTIALS_ATTRIBUTES_FN_W`,
    public var `ChangeAccountPasswordW`: `CHANGE_PASSWORD_FN_W`,
    public var `QueryContextAttributesExW`: `QUERY_CONTEXT_ATTRIBUTES_EX_FN_W`,
    public var `QueryCredentialsAttributesExW`: `QUERY_CREDENTIALS_ATTRIBUTES_EX_FN_W`,
)
// UNSUPPORTED Rust 6357:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Credentials")]
// impl Default for SecurityFunctionTableW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpAcceptCredentialsFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`SECURITY_LOGON_TYPE`, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`SECPKG_PRIMARY_CRED`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`SECPKG_SUPPLEMENTAL_CRED`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpAcceptLsaModeContextFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBuffer`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpAcquireCredentialsHandleFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpAddCredentialsFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpApplyControlTokenFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpChangeAccountPasswordFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, Boolean, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpCompleteAuthTokenFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpDeleteContextFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpDeleteCredentialsFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`SecBuffer`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpExchangeMetaDataFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, UInt, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpExportSecurityContextFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBuffer`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HANDLE`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpExtractTargetInfoFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpFormatCredentialsFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`SecBuffer`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBuffer`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpFreeCredentialsHandleFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpGetContextTokenFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HANDLE`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpGetCredUIContextFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpGetCredentialsFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBuffer`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpGetExtendedInformationFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`SECPKG_EXTENDED_INFORMATION_CLASS`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SECPKG_EXTENDED_INFORMATION`>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpGetInfoFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SecPkgInfoA`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpGetRemoteCredGuardLogonBufferFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HANDLE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`PLSA_REDIRECTED_LOGON_CALLBACK`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`PLSA_REDIRECTED_LOGON_CLEANUP_CALLBACK`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpGetRemoteCredGuardSupplementalCredsFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HANDLE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`PLSA_REDIRECTED_LOGON_CALLBACK`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`PLSA_REDIRECTED_LOGON_CLEANUP_CALLBACK`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpGetTbalSupplementalCredsFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`LUID`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpGetUserInfoFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`LUID`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SECURITY_USER_DATA`>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpImportSecurityContextFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`SecBuffer`>?, `super`.`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpInitLsaModeContextFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, UInt, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBuffer`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpInitUserModeContextFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`SecBuffer`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Credentials", feature = "Win32_System_Threading"))]
public typealias `SpInitializeFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`SECPKG_PARAMETERS`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_SECPKG_FUNCTION_TABLE`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpInstanceInitFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`SECPKG_DLL_FUNCTIONS`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Credentials", feature = "Win32_System_Threading"))]
public typealias `SpLsaModeInitializeFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SECPKG_FUNCTION_TABLE`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpMakeSignatureFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, UInt) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpMarshalAttributeDataFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpMarshallSupplementalCredsFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpQueryContextAttributesFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpQueryCredentialsAttributesFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpQueryMetaDataFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpSaveCredentialsFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`SecBuffer`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpSealMessageFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, UInt) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpSetContextAttributesFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpSetCredentialsAttributesFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpSetExtendedInformationFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`SECPKG_EXTENDED_INFORMATION_CLASS`, /* Rust *const */ kotlinx.cinterop.CPointer<`SECPKG_EXTENDED_INFORMATION`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpShutdownFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpUnsealMessageFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpUpdateCredentialsFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpUserModeInitializeFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SECPKG_USER_FUNCTION_TABLE`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpValidateTargetInfoFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`SECPKG_TARGETINFO`>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SpVerifySignatureFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public typealias `SslDeserializeCertificateStoreFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Cryptography`.`CRYPT_INTEGER_BLOB`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Cryptography`.`CERT_CONTEXT`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SslGetExtensionsFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`SCH_EXTENSION_DATA`>?, UByte, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `SchGetExtensionsOptions`) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SslGetServerIdentityFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `TLS1SP_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Microsoft TLS 1.0");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `TLS1SP_NAME_A`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("Microsoft TLS 1.0");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `TLS1SP_NAME_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Microsoft TLS 1.0");
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TLS_EXTENSION_SUBSCRIPTION` (
    public var `ExtensionType`: UShort,
    public var `HandshakeType`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TLS_PARAMETERS` (
    public var `cAlpnIds`: UInt,
    public var `rgstrAlpnIds`: /* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?,
    public var `grbitDisabledProtocols`: UInt,
    public var `cDisabledCrypto`: UInt,
    public var `pDisabledCrypto`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTO_SETTINGS`>?,
    public var `dwFlags`: UInt,
)
// UNSUPPORTED Rust 6462:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TLS_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TLS_PARAMS_OPTIONAL`: UInt = 1u;
public typealias `TOKENBINDING_EXTENSION_FORMAT` = Int;
public const val `TOKENBINDING_EXTENSION_FORMAT_UNDEFINED`: `TOKENBINDING_EXTENSION_FORMAT` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TOKENBINDING_IDENTIFIER` (
    public var `keyType`: UByte,
)
public typealias `TOKENBINDING_KEY_PARAMETERS_TYPE` = Int;
public const val `TOKENBINDING_KEY_PARAMETERS_TYPE_ANYEXISTING`: `TOKENBINDING_KEY_PARAMETERS_TYPE` = 255;
public const val `TOKENBINDING_KEY_PARAMETERS_TYPE_ECDSAP256`: `TOKENBINDING_KEY_PARAMETERS_TYPE` = 2;
public const val `TOKENBINDING_KEY_PARAMETERS_TYPE_RSA2048_PKCS`: `TOKENBINDING_KEY_PARAMETERS_TYPE` = 0;
public const val `TOKENBINDING_KEY_PARAMETERS_TYPE_RSA2048_PSS`: `TOKENBINDING_KEY_PARAMETERS_TYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TOKENBINDING_KEY_TYPES` (
    public var `keyCount`: UInt,
    public var `keyType`: /* Rust *mut */ kotlinx.cinterop.CPointer<`TOKENBINDING_KEY_PARAMETERS_TYPE`>?,
)
// UNSUPPORTED Rust 6486:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TOKENBINDING_KEY_TYPES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TOKENBINDING_RESULT_DATA` (
    public var `bindingType`: `TOKENBINDING_TYPE`,
    public var `identifierSize`: UInt,
    public var `identifierData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`TOKENBINDING_IDENTIFIER`>?,
    public var `extensionFormat`: `TOKENBINDING_EXTENSION_FORMAT`,
    public var `extensionSize`: UInt,
    public var `extensionData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 6501:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TOKENBINDING_RESULT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TOKENBINDING_RESULT_LIST` (
    public var `resultCount`: UInt,
    public var `resultData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`TOKENBINDING_RESULT_DATA`>?,
)
// UNSUPPORTED Rust 6512:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TOKENBINDING_RESULT_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `TOKENBINDING_TYPE` = Int;
public const val `TOKENBINDING_TYPE_PROVIDED`: `TOKENBINDING_TYPE` = 0;
public const val `TOKENBINDING_TYPE_REFERRED`: `TOKENBINDING_TYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TRUSTED_CONTROLLERS_INFO` (
    public var `Entries`: UInt,
    public var `Names`: /* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_UNICODE_STRING`>?,
)
// UNSUPPORTED Rust 6526:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TRUSTED_CONTROLLERS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TRUSTED_DOMAIN_AUTH_INFORMATION` (
    public var `IncomingAuthInfos`: UInt,
    public var `IncomingAuthenticationInformation`: /* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_AUTH_INFORMATION`>?,
    public var `IncomingPreviousAuthenticationInformation`: /* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_AUTH_INFORMATION`>?,
    public var `OutgoingAuthInfos`: UInt,
    public var `OutgoingAuthenticationInformation`: /* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_AUTH_INFORMATION`>?,
    public var `OutgoingPreviousAuthenticationInformation`: /* Rust *mut */ kotlinx.cinterop.CPointer<`LSA_AUTH_INFORMATION`>?,
)
// UNSUPPORTED Rust 6541:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TRUSTED_DOMAIN_AUTH_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRUSTED_DOMAIN_FULL_INFORMATION` (
    public var `Information`: `TRUSTED_DOMAIN_INFORMATION_EX`,
    public var `PosixOffset`: `TRUSTED_POSIX_OFFSET_INFO`,
    public var `AuthInformation`: `TRUSTED_DOMAIN_AUTH_INFORMATION`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRUSTED_DOMAIN_FULL_INFORMATION2` (
    public var `Information`: `TRUSTED_DOMAIN_INFORMATION_EX2`,
    public var `PosixOffset`: `TRUSTED_POSIX_OFFSET_INFO`,
    public var `AuthInformation`: `TRUSTED_DOMAIN_AUTH_INFORMATION`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TRUSTED_DOMAIN_INFORMATION_EX` (
    public var `Name`: `LSA_UNICODE_STRING`,
    public var `FlatName`: `LSA_UNICODE_STRING`,
    public var `Sid`: `super`.`super`.`PSID`,
    public var `TrustDirection`: `TRUSTED_DOMAIN_TRUST_DIRECTION`,
    public var `TrustType`: `TRUSTED_DOMAIN_TRUST_TYPE`,
    public var `TrustAttributes`: `TRUSTED_DOMAIN_TRUST_ATTRIBUTES`,
)
// UNSUPPORTED Rust 6570:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TRUSTED_DOMAIN_INFORMATION_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TRUSTED_DOMAIN_INFORMATION_EX2` (
    public var `Name`: `LSA_UNICODE_STRING`,
    public var `FlatName`: `LSA_UNICODE_STRING`,
    public var `Sid`: `super`.`super`.`PSID`,
    public var `TrustDirection`: UInt,
    public var `TrustType`: UInt,
    public var `TrustAttributes`: UInt,
    public var `ForestTrustLength`: UInt,
    public var `ForestTrustInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 6587:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TRUSTED_DOMAIN_INFORMATION_EX2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRUSTED_DOMAIN_NAME_INFO` (
    public var `Name`: `LSA_UNICODE_STRING`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRUSTED_DOMAIN_SUPPORTED_ENCRYPTION_TYPES` (
    public var `SupportedEncryptionTypes`: UInt,
)
public typealias `TRUSTED_DOMAIN_TRUST_ATTRIBUTES` = UInt;
public typealias `TRUSTED_DOMAIN_TRUST_DIRECTION` = UInt;
public typealias `TRUSTED_DOMAIN_TRUST_TYPE` = UInt;
public typealias `TRUSTED_INFORMATION_CLASS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRUSTED_PASSWORD_INFO` (
    public var `Password`: `LSA_UNICODE_STRING`,
    public var `OldPassword`: `LSA_UNICODE_STRING`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRUSTED_POSIX_OFFSET_INFO` (
    public var `Offset`: UInt,
)
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
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `UNISP_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Microsoft Unified Security Protocol Provider");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `UNISP_NAME_A`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("Microsoft Unified Security Protocol Provider");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `UNISP_NAME_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Microsoft Unified Security Protocol Provider");
public const val `UNISP_RPC_ID`: UInt = 14u;
public const val `USER_ACCOUNT_AUTO_LOCKED`: UInt = 1024u;
public const val `USER_ACCOUNT_DISABLED`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USER_ALL_INFORMATION` (
    public var `LastLogon`: Long,
    public var `LastLogoff`: Long,
    public var `PasswordLastSet`: Long,
    public var `AccountExpires`: Long,
    public var `PasswordCanChange`: Long,
    public var `PasswordMustChange`: Long,
    public var `UserName`: `LSA_UNICODE_STRING`,
    public var `FullName`: `LSA_UNICODE_STRING`,
    public var `HomeDirectory`: `LSA_UNICODE_STRING`,
    public var `HomeDirectoryDrive`: `LSA_UNICODE_STRING`,
    public var `ScriptPath`: `LSA_UNICODE_STRING`,
    public var `ProfilePath`: `LSA_UNICODE_STRING`,
    public var `AdminComment`: `LSA_UNICODE_STRING`,
    public var `WorkStations`: `LSA_UNICODE_STRING`,
    public var `UserComment`: `LSA_UNICODE_STRING`,
    public var `Parameters`: `LSA_UNICODE_STRING`,
    public var `LmPassword`: `LSA_UNICODE_STRING`,
    public var `NtPassword`: `LSA_UNICODE_STRING`,
    public var `PrivateData`: `LSA_UNICODE_STRING`,
    public var `SecurityDescriptor`: `SR_SECURITY_DESCRIPTOR`,
    public var `UserId`: UInt,
    public var `PrimaryGroupId`: UInt,
    public var `UserAccountControl`: UInt,
    public var `WhichFields`: UInt,
    public var `LogonHours`: `LOGON_HOURS`,
    public var `BadPasswordCount`: UShort,
    public var `LogonCount`: UShort,
    public var `CountryCode`: UShort,
    public var `CodePage`: UShort,
    public var `LmPasswordPresent`: Boolean,
    public var `NtPasswordPresent`: Boolean,
    public var `PasswordExpired`: Boolean,
    public var `PrivateDataSensitive`: Boolean,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_PasswordManagement")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USER_SESSION_KEY` (
    public var `data`: Array<`super`.`super`.`super`.`System`.`PasswordManagement`.`CYPHER_BLOCK`>,
)
// UNSUPPORTED Rust 6750:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Credentials")]
public typealias `VERIFY_SIGNATURE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Credentials`.`SecHandle`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SecBufferDesc`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WDIGEST_SP_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WDigest");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WDIGEST_SP_NAME_A`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("WDigest");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WDIGEST_SP_NAME_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WDigest");
// UNSUPPORTED Rust 6768:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WINDOWS_SLID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x55c92734_d682_4d71_983e_d6ec3f16059f);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `X509Certificate` (
    public var `Version`: UInt,
    public var `SerialNumber`: UIntArray,
    public var `SignatureAlgorithm`: `super`.`super`.`Cryptography`.`ALG_ID`,
    public var `ValidFrom`: `super`.`super`.`super`.`Foundation`.`FILETIME`,
    public var `ValidUntil`: `super`.`super`.`super`.`Foundation`.`FILETIME`,
    public var `pszIssuer`: `windows_sys`.`core`.`PSTR`,
    public var `pszSubject`: `windows_sys`.`core`.`PSTR`,
    public var `pPublicKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PctPublicKey`>?,
)
// UNSUPPORTED Rust 6782:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
