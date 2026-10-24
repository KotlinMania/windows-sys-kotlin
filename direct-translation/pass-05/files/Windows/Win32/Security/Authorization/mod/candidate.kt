// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzAccessCheck; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzAccessCheck`(`flags` : `AUTHZ_ACCESS_CHECK_FLAGS`, `hauthzclientcontext` : `AUTHZ_CLIENT_CONTEXT_HANDLE`, `prequest` : /* Rust *const */ kotlinx.cinterop.CPointer<`AUTHZ_ACCESS_REQUEST`>?, `hauditevent` : `AUTHZ_AUDIT_EVENT_HANDLE`, `psecuritydescriptor` : `super`.`PSECURITY_DESCRIPTOR`, `optionalsecuritydescriptorarray` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`PSECURITY_DESCRIPTOR`>?, `optionalsecuritydescriptorcount` : UInt, `preply` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AUTHZ_ACCESS_REPLY`>?, `phaccesscheckresults` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AUTHZ_ACCESS_CHECK_RESULTS_HANDLE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzAddSidsToContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzAddSidsToContext`(`hauthzclientcontext` : `AUTHZ_CLIENT_CONTEXT_HANDLE`, `sids` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`SID_AND_ATTRIBUTES`>?, `sidcount` : UInt, `restrictedsids` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`SID_AND_ATTRIBUTES`>?, `restrictedsidcount` : UInt, `phnewauthzclientcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AUTHZ_CLIENT_CONTEXT_HANDLE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzCachedAccessCheck; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzCachedAccessCheck`(`flags` : UInt, `haccesscheckresults` : `AUTHZ_ACCESS_CHECK_RESULTS_HANDLE`, `prequest` : /* Rust *const */ kotlinx.cinterop.CPointer<`AUTHZ_ACCESS_REQUEST`>?, `hauditevent` : `AUTHZ_AUDIT_EVENT_HANDLE`, `preply` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AUTHZ_ACCESS_REPLY`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzEnumerateSecurityEventSources; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzEnumerateSecurityEventSources`(`dwflags` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AUTHZ_SOURCE_SCHEMA_REGISTRATION`>?, `pdwcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzEvaluateSacl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzEvaluateSacl`(`authzclientcontext` : `AUTHZ_CLIENT_CONTEXT_HANDLE`, `prequest` : /* Rust *const */ kotlinx.cinterop.CPointer<`AUTHZ_ACCESS_REQUEST`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?, `grantedaccess` : UInt, `accessgranted` : `windows_sys`.`core`.`BOOL`, `pbgenerateaudit` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzFreeAuditEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzFreeAuditEvent`(`hauditevent` : `AUTHZ_AUDIT_EVENT_HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzFreeCentralAccessPolicyCache; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzFreeCentralAccessPolicyCache`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzFreeContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzFreeContext`(`hauthzclientcontext` : `AUTHZ_CLIENT_CONTEXT_HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzFreeHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzFreeHandle`(`haccesscheckresults` : `AUTHZ_ACCESS_CHECK_RESULTS_HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzFreeResourceManager; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzFreeResourceManager`(`hauthzresourcemanager` : `AUTHZ_RESOURCE_MANAGER_HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzGetInformationFromContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzGetInformationFromContext`(`hauthzclientcontext` : `AUTHZ_CLIENT_CONTEXT_HANDLE`, `infoclass` : `AUTHZ_CONTEXT_INFORMATION_CLASS`, `buffersize` : UInt, `psizerequired` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzInitializeCompoundContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzInitializeCompoundContext`(`usercontext` : `AUTHZ_CLIENT_CONTEXT_HANDLE`, `devicecontext` : `AUTHZ_CLIENT_CONTEXT_HANDLE`, `phcompoundcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AUTHZ_CLIENT_CONTEXT_HANDLE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzInitializeContextFromAuthzContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzInitializeContextFromAuthzContext`(`flags` : UInt, `hauthzclientcontext` : `AUTHZ_CLIENT_CONTEXT_HANDLE`, `pexpirationtime` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `identifier` : `super`.`super`.`Foundation`.`LUID`, `dynamicgroupargs` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phnewauthzclientcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AUTHZ_CLIENT_CONTEXT_HANDLE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzInitializeContextFromSid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzInitializeContextFromSid`(`flags` : UInt, `usersid` : `super`.`PSID`, `hauthzresourcemanager` : `AUTHZ_RESOURCE_MANAGER_HANDLE`, `pexpirationtime` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `identifier` : `super`.`super`.`Foundation`.`LUID`, `dynamicgroupargs` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phauthzclientcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AUTHZ_CLIENT_CONTEXT_HANDLE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzInitializeContextFromToken; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzInitializeContextFromToken`(`flags` : UInt, `tokenhandle` : `super`.`super`.`Foundation`.`HANDLE`, `hauthzresourcemanager` : `AUTHZ_RESOURCE_MANAGER_HANDLE`, `pexpirationtime` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `identifier` : `super`.`super`.`Foundation`.`LUID`, `dynamicgroupargs` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phauthzclientcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AUTHZ_CLIENT_CONTEXT_HANDLE`>?) : `windows_sys`.`core`.`BOOL`
// UNSUPPORTED Rust 16:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("authz.dll" "C" fn AuthzInitializeObjectAccessAuditEvent(flags : AUTHZ_INITIALIZE_OBJECT_ACCESS_AUDIT_EVENT_FLAGS, hauditeventtype : AUTHZ_AUDIT_EVENT_TYPE_HANDLE, szoperationtype : windows_sys::core::PCWSTR, szobjecttype : windows_sys::core::PCWSTR, szobjectname : windows_sys::core::PCWSTR, szadditionalinfo : windows_sys::core::PCWSTR, phauditevent : *mut AUTHZ_AUDIT_EVENT_HANDLE, dwadditionalparametercount : u32, ...) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 17:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("authz.dll" "C" fn AuthzInitializeObjectAccessAuditEvent2(flags : u32, hauditeventtype : AUTHZ_AUDIT_EVENT_TYPE_HANDLE, szoperationtype : windows_sys::core::PCWSTR, szobjecttype : windows_sys::core::PCWSTR, szobjectname : windows_sys::core::PCWSTR, szadditionalinfo : windows_sys::core::PCWSTR, szadditionalinfo2 : windows_sys::core::PCWSTR, phauditevent : *mut AUTHZ_AUDIT_EVENT_HANDLE, dwadditionalparametercount : u32, ...) -> windows_sys::core::BOOL);

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzInitializeRemoteResourceManager; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzInitializeRemoteResourceManager`(`prpcinitinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`AUTHZ_RPC_INIT_INFO_CLIENT`>?, `phauthzresourcemanager` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AUTHZ_RESOURCE_MANAGER_HANDLE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzInitializeResourceManager; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzInitializeResourceManager`(`flags` : UInt, `pfndynamicaccesscheck` : `PFN_AUTHZ_DYNAMIC_ACCESS_CHECK`, `pfncomputedynamicgroups` : `PFN_AUTHZ_COMPUTE_DYNAMIC_GROUPS`, `pfnfreedynamicgroups` : `PFN_AUTHZ_FREE_DYNAMIC_GROUPS`, `szresourcemanagername` : `windows_sys`.`core`.`PCWSTR`, `phauthzresourcemanager` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AUTHZ_RESOURCE_MANAGER_HANDLE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzInitializeResourceManagerEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzInitializeResourceManagerEx`(`flags` : `AUTHZ_RESOURCE_MANAGER_FLAGS`, `pauthzinitinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`AUTHZ_INIT_INFO`>?, `phauthzresourcemanager` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AUTHZ_RESOURCE_MANAGER_HANDLE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzInstallSecurityEventSource; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzInstallSecurityEventSource`(`dwflags` : UInt, `pregistration` : /* Rust *const */ kotlinx.cinterop.CPointer<`AUTHZ_SOURCE_SCHEMA_REGISTRATION`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzModifyClaims; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzModifyClaims`(`hauthzclientcontext` : `AUTHZ_CLIENT_CONTEXT_HANDLE`, `claimclass` : `AUTHZ_CONTEXT_INFORMATION_CLASS`, `pclaimoperations` : /* Rust *const */ kotlinx.cinterop.CPointer<`AUTHZ_SECURITY_ATTRIBUTE_OPERATION`>?, `pclaims` : /* Rust *const */ kotlinx.cinterop.CPointer<`AUTHZ_SECURITY_ATTRIBUTES_INFORMATION`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzModifySecurityAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzModifySecurityAttributes`(`hauthzclientcontext` : `AUTHZ_CLIENT_CONTEXT_HANDLE`, `poperations` : /* Rust *const */ kotlinx.cinterop.CPointer<`AUTHZ_SECURITY_ATTRIBUTE_OPERATION`>?, `pattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`AUTHZ_SECURITY_ATTRIBUTES_INFORMATION`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzModifySids; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzModifySids`(`hauthzclientcontext` : `AUTHZ_CLIENT_CONTEXT_HANDLE`, `sidclass` : `AUTHZ_CONTEXT_INFORMATION_CLASS`, `psidoperations` : /* Rust *const */ kotlinx.cinterop.CPointer<`AUTHZ_SID_OPERATION`>?, `psids` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`TOKEN_GROUPS`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzOpenObjectAudit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzOpenObjectAudit`(`flags` : UInt, `hauthzclientcontext` : `AUTHZ_CLIENT_CONTEXT_HANDLE`, `prequest` : /* Rust *const */ kotlinx.cinterop.CPointer<`AUTHZ_ACCESS_REQUEST`>?, `hauditevent` : `AUTHZ_AUDIT_EVENT_HANDLE`, `psecuritydescriptor` : `super`.`PSECURITY_DESCRIPTOR`, `optionalsecuritydescriptorarray` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`PSECURITY_DESCRIPTOR`>?, `optionalsecuritydescriptorcount` : UInt, `preply` : /* Rust *const */ kotlinx.cinterop.CPointer<`AUTHZ_ACCESS_REPLY`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzRegisterCapChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Threading")]
public external fun `AuthzRegisterCapChangeNotification`(`phcapchangesubscription` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AUTHZ_CAP_CHANGE_SUBSCRIPTION_HANDLE`>?, `pfncapchangecallback` : `super`.`super`.`System`.`Threading`.`LPTHREAD_START_ROUTINE`, `pcallbackcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzRegisterSecurityEventSource; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzRegisterSecurityEventSource`(`dwflags` : UInt, `szeventsourcename` : `windows_sys`.`core`.`PCWSTR`, `pheventprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AUTHZ_SECURITY_EVENT_PROVIDER_HANDLE`>?) : `windows_sys`.`core`.`BOOL`
// UNSUPPORTED Rust 29:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("authz.dll" "C" fn AuthzReportSecurityEvent(dwflags : u32, heventprovider : AUTHZ_SECURITY_EVENT_PROVIDER_HANDLE, dwauditid : u32, pusersid : super:: PSID, dwcount : u32, ...) -> windows_sys::core::BOOL);

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzReportSecurityEventFromParams; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzReportSecurityEventFromParams`(`dwflags` : UInt, `heventprovider` : `AUTHZ_SECURITY_EVENT_PROVIDER_HANDLE`, `dwauditid` : UInt, `pusersid` : `super`.`PSID`, `pparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`AUDIT_PARAMS`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzSetAppContainerInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzSetAppContainerInformation`(`hauthzclientcontext` : `AUTHZ_CLIENT_CONTEXT_HANDLE`, `pappcontainersid` : `super`.`PSID`, `capabilitycount` : UInt, `pcapabilitysids` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`SID_AND_ATTRIBUTES`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzUninstallSecurityEventSource; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzUninstallSecurityEventSource`(`dwflags` : UInt, `szeventsourcename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzUnregisterCapChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzUnregisterCapChangeNotification`(`hcapchangesubscription` : `AUTHZ_CAP_CHANGE_SUBSCRIPTION_HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=authz.dll, ABI=system, export=AuthzUnregisterSecurityEventSource; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AuthzUnregisterSecurityEventSource`(`dwflags` : UInt, `pheventprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AUTHZ_SECURITY_EVENT_PROVIDER_HANDLE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=BuildExplicitAccessWithNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildExplicitAccessWithNameA`(`pexplicitaccess` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EXPLICIT_ACCESS_A`>?, `ptrusteename` : `windows_sys`.`core`.`PCSTR`, `accesspermissions` : UInt, `accessmode` : `ACCESS_MODE`, `inheritance` : `super`.`ACE_FLAGS`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=BuildExplicitAccessWithNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildExplicitAccessWithNameW`(`pexplicitaccess` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EXPLICIT_ACCESS_W`>?, `ptrusteename` : `windows_sys`.`core`.`PCWSTR`, `accesspermissions` : UInt, `accessmode` : `ACCESS_MODE`, `inheritance` : `super`.`ACE_FLAGS`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=BuildImpersonateExplicitAccessWithNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildImpersonateExplicitAccessWithNameA`(`pexplicitaccess` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EXPLICIT_ACCESS_A`>?, `ptrusteename` : `windows_sys`.`core`.`PCSTR`, `ptrustee` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTEE_A`>?, `accesspermissions` : UInt, `accessmode` : `ACCESS_MODE`, `inheritance` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=BuildImpersonateExplicitAccessWithNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildImpersonateExplicitAccessWithNameW`(`pexplicitaccess` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EXPLICIT_ACCESS_W`>?, `ptrusteename` : `windows_sys`.`core`.`PCWSTR`, `ptrustee` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTEE_W`>?, `accesspermissions` : UInt, `accessmode` : `ACCESS_MODE`, `inheritance` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=BuildImpersonateTrusteeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildImpersonateTrusteeA`(`ptrustee` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TRUSTEE_A`>?, `pimpersonatetrustee` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTEE_A`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=BuildImpersonateTrusteeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildImpersonateTrusteeW`(`ptrustee` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TRUSTEE_W`>?, `pimpersonatetrustee` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTEE_W`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=BuildSecurityDescriptorA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildSecurityDescriptorA`(`powner` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTEE_A`>?, `pgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTEE_A`>?, `ccountofaccessentries` : UInt, `plistofaccessentries` : /* Rust *const */ kotlinx.cinterop.CPointer<`EXPLICIT_ACCESS_A`>?, `ccountofauditentries` : UInt, `plistofauditentries` : /* Rust *const */ kotlinx.cinterop.CPointer<`EXPLICIT_ACCESS_A`>?, `poldsd` : `super`.`PSECURITY_DESCRIPTOR`, `psizenewsd` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pnewsd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`PSECURITY_DESCRIPTOR`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=BuildSecurityDescriptorW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildSecurityDescriptorW`(`powner` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTEE_W`>?, `pgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTEE_W`>?, `ccountofaccessentries` : UInt, `plistofaccessentries` : /* Rust *const */ kotlinx.cinterop.CPointer<`EXPLICIT_ACCESS_W`>?, `ccountofauditentries` : UInt, `plistofauditentries` : /* Rust *const */ kotlinx.cinterop.CPointer<`EXPLICIT_ACCESS_W`>?, `poldsd` : `super`.`PSECURITY_DESCRIPTOR`, `psizenewsd` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pnewsd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`PSECURITY_DESCRIPTOR`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=BuildTrusteeWithNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildTrusteeWithNameA`(`ptrustee` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TRUSTEE_A`>?, `pname` : `windows_sys`.`core`.`PCSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=BuildTrusteeWithNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildTrusteeWithNameW`(`ptrustee` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TRUSTEE_W`>?, `pname` : `windows_sys`.`core`.`PCWSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=BuildTrusteeWithObjectsAndNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildTrusteeWithObjectsAndNameA`(`ptrustee` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TRUSTEE_A`>?, `pobjname` : /* Rust *const */ kotlinx.cinterop.CPointer<`OBJECTS_AND_NAME_A`>?, `objecttype` : `SE_OBJECT_TYPE`, `objecttypename` : `windows_sys`.`core`.`PCSTR`, `inheritedobjecttypename` : `windows_sys`.`core`.`PCSTR`, `name` : `windows_sys`.`core`.`PCSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=BuildTrusteeWithObjectsAndNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildTrusteeWithObjectsAndNameW`(`ptrustee` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TRUSTEE_W`>?, `pobjname` : /* Rust *const */ kotlinx.cinterop.CPointer<`OBJECTS_AND_NAME_W`>?, `objecttype` : `SE_OBJECT_TYPE`, `objecttypename` : `windows_sys`.`core`.`PCWSTR`, `inheritedobjecttypename` : `windows_sys`.`core`.`PCWSTR`, `name` : `windows_sys`.`core`.`PCWSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=BuildTrusteeWithObjectsAndSidA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildTrusteeWithObjectsAndSidA`(`ptrustee` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TRUSTEE_A`>?, `pobjsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`OBJECTS_AND_SID`>?, `pobjectguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pinheritedobjectguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `psid` : `super`.`PSID`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=BuildTrusteeWithObjectsAndSidW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildTrusteeWithObjectsAndSidW`(`ptrustee` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TRUSTEE_W`>?, `pobjsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`OBJECTS_AND_SID`>?, `pobjectguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pinheritedobjectguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `psid` : `super`.`PSID`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=BuildTrusteeWithSidA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildTrusteeWithSidA`(`ptrustee` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TRUSTEE_A`>?, `psid` : `super`.`PSID`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=BuildTrusteeWithSidW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildTrusteeWithSidW`(`ptrustee` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TRUSTEE_W`>?, `psid` : `super`.`PSID`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ConvertSecurityDescriptorToStringSecurityDescriptorA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ConvertSecurityDescriptorToStringSecurityDescriptorA`(`securitydescriptor` : `super`.`PSECURITY_DESCRIPTOR`, `requestedstringsdrevision` : UInt, `securityinformation` : `super`.`OBJECT_SECURITY_INFORMATION`, `stringsecuritydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?, `stringsecuritydescriptorlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ConvertSecurityDescriptorToStringSecurityDescriptorW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ConvertSecurityDescriptorToStringSecurityDescriptorW`(`securitydescriptor` : `super`.`PSECURITY_DESCRIPTOR`, `requestedstringsdrevision` : UInt, `securityinformation` : `super`.`OBJECT_SECURITY_INFORMATION`, `stringsecuritydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `stringsecuritydescriptorlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ConvertSidToStringSidA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ConvertSidToStringSidA`(`sid` : `super`.`PSID`, `stringsid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ConvertSidToStringSidW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ConvertSidToStringSidW`(`sid` : `super`.`PSID`, `stringsid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ConvertStringSecurityDescriptorToSecurityDescriptorA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ConvertStringSecurityDescriptorToSecurityDescriptorA`(`stringsecuritydescriptor` : `windows_sys`.`core`.`PCSTR`, `stringsdrevision` : UInt, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`PSECURITY_DESCRIPTOR`>?, `securitydescriptorsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ConvertStringSecurityDescriptorToSecurityDescriptorW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ConvertStringSecurityDescriptorToSecurityDescriptorW`(`stringsecuritydescriptor` : `windows_sys`.`core`.`PCWSTR`, `stringsdrevision` : UInt, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`PSECURITY_DESCRIPTOR`>?, `securitydescriptorsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ConvertStringSidToSidA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ConvertStringSidToSidA`(`stringsid` : `windows_sys`.`core`.`PCSTR`, `sid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`PSID`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ConvertStringSidToSidW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ConvertStringSidToSidW`(`stringsid` : `windows_sys`.`core`.`PCWSTR`, `sid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`PSID`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=FreeInheritedFromArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FreeInheritedFromArray`(`pinheritarray` : /* Rust *const */ kotlinx.cinterop.CPointer<`INHERITED_FROMW`>?, `acecnt` : UShort, `pfnarray` : /* Rust *const */ kotlinx.cinterop.CPointer<`FN_OBJECT_MGR_FUNCTS`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetAuditedPermissionsFromAclA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetAuditedPermissionsFromAclA`(`pacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?, `ptrustee` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTEE_A`>?, `psuccessfulauditedrights` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pfailedauditrights` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetAuditedPermissionsFromAclW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetAuditedPermissionsFromAclW`(`pacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?, `ptrustee` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTEE_W`>?, `psuccessfulauditedrights` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pfailedauditrights` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetEffectiveRightsFromAclA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetEffectiveRightsFromAclA`(`pacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?, `ptrustee` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTEE_A`>?, `paccessrights` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetEffectiveRightsFromAclW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetEffectiveRightsFromAclW`(`pacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?, `ptrustee` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTEE_W`>?, `paccessrights` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetExplicitEntriesFromAclA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetExplicitEntriesFromAclA`(`pacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?, `pccountofexplicitentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `plistofexplicitentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`EXPLICIT_ACCESS_A`>>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetExplicitEntriesFromAclW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetExplicitEntriesFromAclW`(`pacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?, `pccountofexplicitentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `plistofexplicitentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`EXPLICIT_ACCESS_W`>>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetInheritanceSourceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetInheritanceSourceA`(`pobjectname` : `windows_sys`.`core`.`PCSTR`, `objecttype` : `SE_OBJECT_TYPE`, `securityinfo` : `super`.`OBJECT_SECURITY_INFORMATION`, `container` : `windows_sys`.`core`.`BOOL`, `pobjectclassguids` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`GUID`>>?, `guidcount` : UInt, `pacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?, `pfnarray` : /* Rust *const */ kotlinx.cinterop.CPointer<`FN_OBJECT_MGR_FUNCTS`>?, `pgenericmapping` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`GENERIC_MAPPING`>?, `pinheritarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INHERITED_FROMA`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetInheritanceSourceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetInheritanceSourceW`(`pobjectname` : `windows_sys`.`core`.`PCWSTR`, `objecttype` : `SE_OBJECT_TYPE`, `securityinfo` : `super`.`OBJECT_SECURITY_INFORMATION`, `container` : `windows_sys`.`core`.`BOOL`, `pobjectclassguids` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`GUID`>>?, `guidcount` : UInt, `pacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?, `pfnarray` : /* Rust *const */ kotlinx.cinterop.CPointer<`FN_OBJECT_MGR_FUNCTS`>?, `pgenericmapping` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`GENERIC_MAPPING`>?, `pinheritarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INHERITED_FROMW`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetMultipleTrusteeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMultipleTrusteeA`(`ptrustee` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTEE_A`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`TRUSTEE_A`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetMultipleTrusteeOperationA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMultipleTrusteeOperationA`(`ptrustee` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTEE_A`>?) : `MULTIPLE_TRUSTEE_OPERATION`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetMultipleTrusteeOperationW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMultipleTrusteeOperationW`(`ptrustee` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTEE_W`>?) : `MULTIPLE_TRUSTEE_OPERATION`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetMultipleTrusteeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMultipleTrusteeW`(`ptrustee` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTEE_W`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`TRUSTEE_W`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetNamedSecurityInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetNamedSecurityInfoA`(`pobjectname` : `windows_sys`.`core`.`PCSTR`, `objecttype` : `SE_OBJECT_TYPE`, `securityinfo` : `super`.`OBJECT_SECURITY_INFORMATION`, `ppsidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`PSID`>?, `ppsidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`PSID`>?, `ppdacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`ACL`>>?, `ppsacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`ACL`>>?, `ppsecuritydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`PSECURITY_DESCRIPTOR`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetNamedSecurityInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetNamedSecurityInfoW`(`pobjectname` : `windows_sys`.`core`.`PCWSTR`, `objecttype` : `SE_OBJECT_TYPE`, `securityinfo` : `super`.`OBJECT_SECURITY_INFORMATION`, `ppsidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`PSID`>?, `ppsidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`PSID`>?, `ppdacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`ACL`>>?, `ppsacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`ACL`>>?, `ppsecuritydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`PSECURITY_DESCRIPTOR`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetSecurityInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSecurityInfo`(`handle` : `super`.`super`.`Foundation`.`HANDLE`, `objecttype` : `SE_OBJECT_TYPE`, `securityinfo` : `super`.`OBJECT_SECURITY_INFORMATION`, `ppsidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`PSID`>?, `ppsidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`PSID`>?, `ppdacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`ACL`>>?, `ppsacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`ACL`>>?, `ppsecuritydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`PSECURITY_DESCRIPTOR`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetTrusteeFormA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTrusteeFormA`(`ptrustee` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTEE_A`>?) : `TRUSTEE_FORM`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetTrusteeFormW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTrusteeFormW`(`ptrustee` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTEE_W`>?) : `TRUSTEE_FORM`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetTrusteeNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTrusteeNameA`(`ptrustee` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTEE_A`>?) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetTrusteeNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTrusteeNameW`(`ptrustee` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTEE_W`>?) : `windows_sys`.`core`.`PWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetTrusteeTypeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTrusteeTypeA`(`ptrustee` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTEE_A`>?) : `TRUSTEE_TYPE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetTrusteeTypeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTrusteeTypeW`(`ptrustee` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRUSTEE_W`>?) : `TRUSTEE_TYPE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LookupSecurityDescriptorPartsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LookupSecurityDescriptorPartsA`(`ppowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`TRUSTEE_A`>>?, `ppgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`TRUSTEE_A`>>?, `pccountofaccessentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pplistofaccessentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`EXPLICIT_ACCESS_A`>>?, `pccountofauditentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pplistofauditentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`EXPLICIT_ACCESS_A`>>?, `psd` : `super`.`PSECURITY_DESCRIPTOR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LookupSecurityDescriptorPartsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LookupSecurityDescriptorPartsW`(`ppowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`TRUSTEE_W`>>?, `ppgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`TRUSTEE_W`>>?, `pccountofaccessentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pplistofaccessentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`EXPLICIT_ACCESS_W`>>?, `pccountofauditentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pplistofauditentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`EXPLICIT_ACCESS_W`>>?, `psd` : `super`.`PSECURITY_DESCRIPTOR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SetEntriesInAclA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetEntriesInAclA`(`ccountofexplicitentries` : UInt, `plistofexplicitentries` : /* Rust *const */ kotlinx.cinterop.CPointer<`EXPLICIT_ACCESS_A`>?, `oldacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?, `newacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`ACL`>>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SetEntriesInAclW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetEntriesInAclW`(`ccountofexplicitentries` : UInt, `plistofexplicitentries` : /* Rust *const */ kotlinx.cinterop.CPointer<`EXPLICIT_ACCESS_W`>?, `oldacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?, `newacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`ACL`>>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SetNamedSecurityInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetNamedSecurityInfoA`(`pobjectname` : `windows_sys`.`core`.`PCSTR`, `objecttype` : `SE_OBJECT_TYPE`, `securityinfo` : `super`.`OBJECT_SECURITY_INFORMATION`, `psidowner` : `super`.`PSID`, `psidgroup` : `super`.`PSID`, `pdacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?, `psacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SetNamedSecurityInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetNamedSecurityInfoW`(`pobjectname` : `windows_sys`.`core`.`PCWSTR`, `objecttype` : `SE_OBJECT_TYPE`, `securityinfo` : `super`.`OBJECT_SECURITY_INFORMATION`, `psidowner` : `super`.`PSID`, `psidgroup` : `super`.`PSID`, `pdacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?, `psacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SetSecurityInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetSecurityInfo`(`handle` : `super`.`super`.`Foundation`.`HANDLE`, `objecttype` : `SE_OBJECT_TYPE`, `securityinfo` : `super`.`OBJECT_SECURITY_INFORMATION`, `psidowner` : `super`.`PSID`, `psidgroup` : `super`.`PSID`, `pdacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?, `psacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=TreeResetNamedSecurityInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TreeResetNamedSecurityInfoA`(`pobjectname` : `windows_sys`.`core`.`PCSTR`, `objecttype` : `SE_OBJECT_TYPE`, `securityinfo` : `super`.`OBJECT_SECURITY_INFORMATION`, `powner` : `super`.`PSID`, `pgroup` : `super`.`PSID`, `pdacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?, `psacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?, `keepexplicit` : `windows_sys`.`core`.`BOOL`, `fnprogress` : `FN_PROGRESS`, `progressinvokesetting` : `PROG_INVOKE_SETTING`, `args` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=TreeResetNamedSecurityInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TreeResetNamedSecurityInfoW`(`pobjectname` : `windows_sys`.`core`.`PCWSTR`, `objecttype` : `SE_OBJECT_TYPE`, `securityinfo` : `super`.`OBJECT_SECURITY_INFORMATION`, `powner` : `super`.`PSID`, `pgroup` : `super`.`PSID`, `pdacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?, `psacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?, `keepexplicit` : `windows_sys`.`core`.`BOOL`, `fnprogress` : `FN_PROGRESS`, `progressinvokesetting` : `PROG_INVOKE_SETTING`, `args` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=TreeSetNamedSecurityInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TreeSetNamedSecurityInfoA`(`pobjectname` : `windows_sys`.`core`.`PCSTR`, `objecttype` : `SE_OBJECT_TYPE`, `securityinfo` : `super`.`OBJECT_SECURITY_INFORMATION`, `powner` : `super`.`PSID`, `pgroup` : `super`.`PSID`, `pdacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?, `psacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?, `dwaction` : `TREE_SEC_INFO`, `fnprogress` : `FN_PROGRESS`, `progressinvokesetting` : `PROG_INVOKE_SETTING`, `args` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=TreeSetNamedSecurityInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TreeSetNamedSecurityInfoW`(`pobjectname` : `windows_sys`.`core`.`PCWSTR`, `objecttype` : `SE_OBJECT_TYPE`, `securityinfo` : `super`.`OBJECT_SECURITY_INFORMATION`, `powner` : `super`.`PSID`, `pgroup` : `super`.`PSID`, `pdacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?, `psacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACL`>?, `dwaction` : `TREE_SEC_INFO`, `fnprogress` : `FN_PROGRESS`, `progressinvokesetting` : `PROG_INVOKE_SETTING`, `args` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `ACCCTRL_DEFAULT_PROVIDER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Windows NT Access Provider");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `ACCCTRL_DEFAULT_PROVIDERA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("Windows NT Access Provider");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `ACCCTRL_DEFAULT_PROVIDERW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Windows NT Access Provider");
public typealias `ACCESS_MODE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACTRL_ACCESSA` (
    public var `cEntries`: UInt,
    public var `pPropertyAccessList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ACTRL_PROPERTY_ENTRYA`>?,
)
// UNSUPPORTED Rust 102:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ACTRL_ACCESSA {
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
public class `ACTRL_ACCESSW` (
    public var `cEntries`: UInt,
    public var `pPropertyAccessList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ACTRL_PROPERTY_ENTRYW`>?,
)
// UNSUPPORTED Rust 113:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ACTRL_ACCESSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ACTRL_ACCESS_ALLOWED`: `ACTRL_ACCESS_ENTRY_ACCESS_FLAGS` = 1u;
public const val `ACTRL_ACCESS_DENIED`: `ACTRL_ACCESS_ENTRY_ACCESS_FLAGS` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACTRL_ACCESS_ENTRYA` (
    public var `Trustee`: `TRUSTEE_A`,
    public var `fAccessFlags`: `ACTRL_ACCESS_ENTRY_ACCESS_FLAGS`,
    public var `Access`: UInt,
    public var `ProvSpecificAccess`: UInt,
    public var `Inheritance`: `super`.`ACE_FLAGS`,
    public var `lpInheritProperty`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 130:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ACTRL_ACCESS_ENTRYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACTRL_ACCESS_ENTRYW` (
    public var `Trustee`: `TRUSTEE_W`,
    public var `fAccessFlags`: `ACTRL_ACCESS_ENTRY_ACCESS_FLAGS`,
    public var `Access`: UInt,
    public var `ProvSpecificAccess`: UInt,
    public var `Inheritance`: `super`.`ACE_FLAGS`,
    public var `lpInheritProperty`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 145:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ACTRL_ACCESS_ENTRYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ACTRL_ACCESS_ENTRY_ACCESS_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACTRL_ACCESS_ENTRY_LISTA` (
    public var `cEntries`: UInt,
    public var `pAccessList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ACTRL_ACCESS_ENTRYA`>?,
)
// UNSUPPORTED Rust 157:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ACTRL_ACCESS_ENTRY_LISTA {
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
public class `ACTRL_ACCESS_ENTRY_LISTW` (
    public var `cEntries`: UInt,
    public var `pAccessList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ACTRL_ACCESS_ENTRYW`>?,
)
// UNSUPPORTED Rust 168:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ACTRL_ACCESS_ENTRY_LISTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACTRL_ACCESS_INFOA` (
    public var `fAccessPermission`: UInt,
    public var `lpAccessPermissionName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 179:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ACTRL_ACCESS_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACTRL_ACCESS_INFOW` (
    public var `fAccessPermission`: UInt,
    public var `lpAccessPermissionName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 190:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACTRL_CONTROL_INFOA` (
    public var `lpControlId`: `windows_sys`.`core`.`PSTR`,
    public var `lpControlName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 208:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ACTRL_CONTROL_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACTRL_CONTROL_INFOW` (
    public var `lpControlId`: `windows_sys`.`core`.`PWSTR`,
    public var `lpControlName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 219:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACTRL_OVERLAPPED` (
    public var `Anonymous`: `ACTRL_OVERLAPPED_0`,
    public var `Reserved2`: UInt,
    public var `hEvent`: `super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 262:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ACTRL_OVERLAPPED {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 267:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union ACTRL_OVERLAPPED_0 {
//     pub Provider: *mut core::ffi::c_void,
//     pub Reserved1: u32,
// }

// UNSUPPORTED Rust 273:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACTRL_PROPERTY_ENTRYA` (
    public var `lpProperty`: `windows_sys`.`core`.`PSTR`,
    public var `pAccessEntryList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ACTRL_ACCESS_ENTRY_LISTA`>?,
    public var `fListFlags`: UInt,
)
// UNSUPPORTED Rust 310:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ACTRL_PROPERTY_ENTRYA {
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
public class `ACTRL_PROPERTY_ENTRYW` (
    public var `lpProperty`: `windows_sys`.`core`.`PWSTR`,
    public var `pAccessEntryList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ACTRL_ACCESS_ENTRY_LISTW`>?,
    public var `fListFlags`: UInt,
)
// UNSUPPORTED Rust 322:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AUDIT_IP_ADDRESS` (
    public var `pIpAddress`: UByteArray,
)
// UNSUPPORTED Rust 379:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AUDIT_IP_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `AUDIT_OBJECT_TYPE` (
    public var `ObjectType`: `windows_sys`.`core`.`GUID`,
    public var `Flags`: UShort,
    public var `Level`: UShort,
    public var `AccessMask`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AUDIT_OBJECT_TYPES` (
    public var `Count`: UShort,
    public var `Flags`: UShort,
    public var `pObjectTypes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`AUDIT_OBJECT_TYPE`>?,
)
// UNSUPPORTED Rust 399:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AUDIT_OBJECT_TYPES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AUDIT_PARAM` (
    public var `Type`: `AUDIT_PARAM_TYPE`,
    public var `Length`: UInt,
    public var `Flags`: UInt,
    public var `Anonymous1`: `AUDIT_PARAM_0`,
    public var `Anonymous2`: `AUDIT_PARAM_1`,
)
// UNSUPPORTED Rust 413:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AUDIT_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 418:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
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

// UNSUPPORTED Rust 430:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AUDIT_PARAM_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 435:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union AUDIT_PARAM_1 {
//     pub Data1: usize,
//     pub LogonId_HighPart: i32,
// }

// UNSUPPORTED Rust 441:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AUDIT_PARAM_1 {
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
public class `AUDIT_PARAMS` (
    public var `Length`: UInt,
    public var `Flags`: UInt,
    public var `Count`: UShort,
    public var `Parameters`: /* Rust *mut */ kotlinx.cinterop.CPointer<`AUDIT_PARAM`>?,
)
// UNSUPPORTED Rust 454:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `AUTHZ_ACCESS_CHECK_RESULTS_HANDLE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AUTHZ_ACCESS_REPLY` (
    public var `ResultListLength`: UInt,
    public var `GrantedAccessMask`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `SaclEvaluationResults`: /* Rust *mut */ kotlinx.cinterop.CPointer<`AUTHZ_GENERATE_RESULTS`>?,
    public var `Error`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 474:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AUTHZ_ACCESS_REPLY {
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
public class `AUTHZ_ACCESS_REQUEST` (
    public var `DesiredAccess`: UInt,
    public var `PrincipalSelfSid`: `super`.`PSID`,
    public var `ObjectTypeList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`OBJECT_TYPE_LIST`>?,
    public var `ObjectTypeListLength`: UInt,
    public var `OptionalArguments`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 488:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AUTHZ_ACCESS_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AUTHZ_ALLOW_MULTIPLE_SOURCE_INSTANCES`: UInt = 1u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `AUTHZ_AUDIT_EVENT_HANDLE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public typealias `AUTHZ_AUDIT_EVENT_INFORMATION_CLASS` = Int;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `AUTHZ_AUDIT_EVENT_TYPE_HANDLE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `AUTHZ_AUDIT_EVENT_TYPE_LEGACY` (
    public var `CategoryId`: UShort,
    public var `AuditId`: UShort,
    public var `ParameterCount`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AUTHZ_AUDIT_EVENT_TYPE_OLD` (
    public var `Version`: UInt,
    public var `dwFlags`: UInt,
    public var `RefCount`: Int,
    public var `hAudit`: ULong,
    public var `LinkId`: `super`.`super`.`Foundation`.`LUID`,
    public var `u`: `AUTHZ_AUDIT_EVENT_TYPE_UNION`,
)
// UNSUPPORTED Rust 514:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AUTHZ_AUDIT_EVENT_TYPE_OLD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 519:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union AUTHZ_AUDIT_EVENT_TYPE_UNION {
//     pub Legacy: AUTHZ_AUDIT_EVENT_TYPE_LEGACY,
// }

// UNSUPPORTED Rust 524:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AUTHZ_AUDIT_EVENT_TYPE_UNION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AUTHZ_AUDIT_INSTANCE_INFORMATION`: UInt = 2u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `AUTHZ_CAP_CHANGE_SUBSCRIPTION_HANDLE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `AUTHZ_CLIENT_CONTEXT_HANDLE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `AUTHZ_COMPUTE_PRIVILEGES`: UInt = 8u;
public typealias `AUTHZ_CONTEXT_INFORMATION_CLASS` = Int;
public const val `AUTHZ_FLAG_ALLOW_MULTIPLE_SOURCE_INSTANCES`: UInt = 1u;
public const val `AUTHZ_GENERATE_FAILURE_AUDIT`: `AUTHZ_GENERATE_RESULTS` = 2u;
public typealias `AUTHZ_GENERATE_RESULTS` = UInt;
public const val `AUTHZ_GENERATE_SUCCESS_AUDIT`: `AUTHZ_GENERATE_RESULTS` = 1u;
public typealias `AUTHZ_INITIALIZE_OBJECT_ACCESS_AUDIT_EVENT_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AUTHZ_INIT_INFO` (
    public var `version`: UShort,
    public var `szResourceManagerName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pfnDynamicAccessCheck`: `PFN_AUTHZ_DYNAMIC_ACCESS_CHECK`,
    public var `pfnComputeDynamicGroups`: `PFN_AUTHZ_COMPUTE_DYNAMIC_GROUPS`,
    public var `pfnFreeDynamicGroups`: `PFN_AUTHZ_FREE_DYNAMIC_GROUPS`,
    public var `pfnGetCentralAccessPolicy`: `PFN_AUTHZ_GET_CENTRAL_ACCESS_POLICY`,
    public var `pfnFreeCentralAccessPolicy`: `PFN_AUTHZ_FREE_CENTRAL_ACCESS_POLICY`,
)
// UNSUPPORTED Rust 550:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AUTHZ_REGISTRATION_OBJECT_TYPE_NAME_OFFSET` (
    public var `szObjectTypeName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwOffset`: UInt,
)
// UNSUPPORTED Rust 566:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AUTHZ_REGISTRATION_OBJECT_TYPE_NAME_OFFSET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AUTHZ_REQUIRE_S4U_LOGON`: UInt = 4u;
public typealias `AUTHZ_RESOURCE_MANAGER_FLAGS` = UInt;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `AUTHZ_RESOURCE_MANAGER_HANDLE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `AUTHZ_RM_FLAG_INITIALIZE_UNDER_IMPERSONATION`: `AUTHZ_RESOURCE_MANAGER_FLAGS` = 2u;
public const val `AUTHZ_RM_FLAG_NO_AUDIT`: `AUTHZ_RESOURCE_MANAGER_FLAGS` = 1u;
public const val `AUTHZ_RM_FLAG_NO_CENTRAL_ACCESS_POLICIES`: `AUTHZ_RESOURCE_MANAGER_FLAGS` = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AUTHZ_RPC_INIT_INFO_CLIENT` (
    public var `version`: UShort,
    public var `ObjectUuid`: `windows_sys`.`core`.`PWSTR`,
    public var `ProtSeq`: `windows_sys`.`core`.`PWSTR`,
    public var `NetworkAddr`: `windows_sys`.`core`.`PWSTR`,
    public var `Endpoint`: `windows_sys`.`core`.`PWSTR`,
    public var `Options`: `windows_sys`.`core`.`PWSTR`,
    public var `ServerSpn`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 588:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AUTHZ_RPC_INIT_INFO_CLIENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AUTHZ_RPC_INIT_INFO_CLIENT_VERSION_V1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AUTHZ_SECURITY_ATTRIBUTES_INFORMATION` (
    public var `Version`: UShort,
    public var `Reserved`: UShort,
    public var `AttributeCount`: UInt,
    public var `Attribute`: `AUTHZ_SECURITY_ATTRIBUTES_INFORMATION_0`,
)
// UNSUPPORTED Rust 602:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AUTHZ_SECURITY_ATTRIBUTES_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 607:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union AUTHZ_SECURITY_ATTRIBUTES_INFORMATION_0 {
//     pub pAttributeV1: *mut AUTHZ_SECURITY_ATTRIBUTE_V1,
// }

// UNSUPPORTED Rust 612:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AUTHZ_SECURITY_ATTRIBUTES_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AUTHZ_SECURITY_ATTRIBUTES_INFORMATION_VERSION`: UInt = 1u;
public const val `AUTHZ_SECURITY_ATTRIBUTES_INFORMATION_VERSION_V1`: UInt = 1u;
public typealias `AUTHZ_SECURITY_ATTRIBUTE_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AUTHZ_SECURITY_ATTRIBUTE_FQBN_VALUE` (
    public var `Version`: ULong,
    public var `pName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 626:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AUTHZ_SECURITY_ATTRIBUTE_FQBN_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AUTHZ_SECURITY_ATTRIBUTE_NON_INHERITABLE`: `AUTHZ_SECURITY_ATTRIBUTE_FLAGS` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AUTHZ_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE` (
    public var `pValue`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ValueLength`: UInt,
)
// UNSUPPORTED Rust 638:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AUTHZ_SECURITY_ATTRIBUTE_V1` (
    public var `pName`: `windows_sys`.`core`.`PWSTR`,
    public var `ValueType`: UShort,
    public var `Reserved`: UShort,
    public var `Flags`: `AUTHZ_SECURITY_ATTRIBUTE_FLAGS`,
    public var `ValueCount`: UInt,
    public var `Values`: `AUTHZ_SECURITY_ATTRIBUTE_V1_0`,
)
// UNSUPPORTED Rust 667:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AUTHZ_SECURITY_ATTRIBUTE_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 672:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union AUTHZ_SECURITY_ATTRIBUTE_V1_0 {
//     pub pInt64: *mut i64,
//     pub pUint64: *mut u64,
//     pub ppString: *mut windows_sys::core::PWSTR,
//     pub pFqbn: *mut AUTHZ_SECURITY_ATTRIBUTE_FQBN_VALUE,
//     pub pOctetString: *mut AUTHZ_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE,
// }

// UNSUPPORTED Rust 681:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AUTHZ_SECURITY_ATTRIBUTE_V1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AUTHZ_SECURITY_ATTRIBUTE_VALUE_CASE_SENSITIVE`: `AUTHZ_SECURITY_ATTRIBUTE_FLAGS` = 2u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `AUTHZ_SECURITY_EVENT_PROVIDER_HANDLE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public typealias `AUTHZ_SID_OPERATION` = Int;
public const val `AUTHZ_SID_OPERATION_ADD`: `AUTHZ_SID_OPERATION` = 2;
public const val `AUTHZ_SID_OPERATION_DELETE`: `AUTHZ_SID_OPERATION` = 3;
public const val `AUTHZ_SID_OPERATION_NONE`: `AUTHZ_SID_OPERATION` = 0;
public const val `AUTHZ_SID_OPERATION_REPLACE`: `AUTHZ_SID_OPERATION` = 4;
public const val `AUTHZ_SID_OPERATION_REPLACE_ALL`: `AUTHZ_SID_OPERATION` = 1;
public const val `AUTHZ_SKIP_TOKEN_GROUPS`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AUTHZ_SOURCE_SCHEMA_REGISTRATION` (
    public var `dwFlags`: UInt,
    public var `szEventSourceName`: `windows_sys`.`core`.`PWSTR`,
    public var `szEventMessageFile`: `windows_sys`.`core`.`PWSTR`,
    public var `szEventSourceXmlSchemaFile`: `windows_sys`.`core`.`PWSTR`,
    public var `szEventAccessStringsFile`: `windows_sys`.`core`.`PWSTR`,
    public var `szExecutableImagePath`: `windows_sys`.`core`.`PWSTR`,
    public var `Anonymous`: `AUTHZ_SOURCE_SCHEMA_REGISTRATION_0`,
    public var `dwObjectTypeNameCount`: UInt,
    public var `ObjectTypeNames`: Array<`AUTHZ_REGISTRATION_OBJECT_TYPE_NAME_OFFSET`>,
)
// UNSUPPORTED Rust 708:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AUTHZ_SOURCE_SCHEMA_REGISTRATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 713:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union AUTHZ_SOURCE_SCHEMA_REGISTRATION_0 {
//     pub pReserved: *mut core::ffi::c_void,
//     pub pProviderGuid: *mut windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 719:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// UNSUPPORTED Rust 845:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const AzAuthorizationStore: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb2bcff59_a757_4b0b_a1bc_ea69981da69e);

// UNSUPPORTED Rust 846:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const AzBizRuleContext: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5c2dc96f_8d51_434b_b33c_379bccae77c3);

// UNSUPPORTED Rust 847:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const AzPrincipalLocator: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x483afb5d_70df_4e16_abdc_a1de4d015a3e);

public const val `DENY_ACCESS`: `ACCESS_MODE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EXPLICIT_ACCESS_A` (
    public var `grfAccessPermissions`: UInt,
    public var `grfAccessMode`: `ACCESS_MODE`,
    public var `grfInheritance`: `super`.`ACE_FLAGS`,
    public var `Trustee`: `TRUSTEE_A`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EXPLICIT_ACCESS_W` (
    public var `grfAccessPermissions`: UInt,
    public var `grfAccessMode`: `ACCESS_MODE`,
    public var `grfInheritance`: `super`.`ACE_FLAGS`,
    public var `Trustee`: `TRUSTEE_W`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FN_OBJECT_MGR_FUNCTS` (
    public var `Placeholder`: UInt,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FN_PROGRESS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`PROG_INVOKE_SETTING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`BOOL`) -> Unit>>>;
public const val `GRANT_ACCESS`: `ACCESS_MODE` = 1;
public const val `INHERITED_ACCESS_ENTRY`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INHERITED_FROMA` (
    public var `GenerationGap`: Int,
    public var `AncestorName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 879:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INHERITED_FROMA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INHERITED_FROMW` (
    public var `GenerationGap`: Int,
    public var `AncestorName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 890:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OBJECTS_AND_NAME_A` (
    public var `ObjectsPresent`: `super`.`SYSTEM_AUDIT_OBJECT_ACE_FLAGS`,
    public var `ObjectType`: `SE_OBJECT_TYPE`,
    public var `ObjectTypeName`: `windows_sys`.`core`.`PSTR`,
    public var `InheritedObjectTypeName`: `windows_sys`.`core`.`PSTR`,
    public var `ptstrName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 909:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OBJECTS_AND_NAME_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OBJECTS_AND_NAME_W` (
    public var `ObjectsPresent`: `super`.`SYSTEM_AUDIT_OBJECT_ACE_FLAGS`,
    public var `ObjectType`: `SE_OBJECT_TYPE`,
    public var `ObjectTypeName`: `windows_sys`.`core`.`PWSTR`,
    public var `InheritedObjectTypeName`: `windows_sys`.`core`.`PWSTR`,
    public var `ptstrName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 923:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OBJECTS_AND_NAME_W {
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
public class `OBJECTS_AND_SID` (
    public var `ObjectsPresent`: `super`.`SYSTEM_AUDIT_OBJECT_ACE_FLAGS`,
    public var `ObjectTypeGuid`: `windows_sys`.`core`.`GUID`,
    public var `InheritedObjectTypeGuid`: `windows_sys`.`core`.`GUID`,
    public var `pSid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`SID`>?,
)
// UNSUPPORTED Rust 936:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OBJECTS_AND_SID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OLESCRIPT_E_SYNTAX`: Int = -2147352319;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_AUTHZ_COMPUTE_DYNAMIC_GROUPS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`AUTHZ_CLIENT_CONTEXT_HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`SID_AND_ATTRIBUTES`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`SID_AND_ATTRIBUTES`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_AUTHZ_DYNAMIC_ACCESS_CHECK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`AUTHZ_CLIENT_CONTEXT_HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`ACE_HEADER`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_AUTHZ_FREE_CENTRAL_ACCESS_POLICY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_AUTHZ_FREE_DYNAMIC_GROUPS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`super`.`SID_AND_ATTRIBUTES`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_AUTHZ_GET_CENTRAL_ACCESS_POLICY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`AUTHZ_CLIENT_CONTEXT_HANDLE`, `super`.`PSID`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `windows_sys`.`core`.`BOOL`>>>;
public typealias `PROG_INVOKE_SETTING` = Int;
public const val `ProgressCancelOperation`: `PROG_INVOKE_SETTING` = 4;
public const val `ProgressInvokeEveryObject`: `PROG_INVOKE_SETTING` = 2;
public const val `ProgressInvokeNever`: `PROG_INVOKE_SETTING` = 1;
public const val `ProgressInvokeOnError`: `PROG_INVOKE_SETTING` = 3;
public const val `ProgressInvokePrePostError`: `PROG_INVOKE_SETTING` = 6;
public const val `ProgressRetryOperation`: `PROG_INVOKE_SETTING` = 5;
public const val `REVOKE_ACCESS`: `ACCESS_MODE` = 4;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ACCESS_ALLOWED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("A");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ACCESS_CONTROL_ASSISTANCE_OPS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ACCESS_DENIED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("D");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ACCESS_FILTER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ACCOUNT_OPERATORS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AO");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ACE_BEGIN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("(");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ACE_COND_ATTRIBUTE_PREFIX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("@");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ACE_COND_BEGIN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("(");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ACE_COND_BLOB_PREFIX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("#");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ACE_COND_DEVICE_ATTRIBUTE_PREFIX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("@DEVICE.");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ACE_COND_END`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`(")");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ACE_COND_RESOURCE_ATTRIBUTE_PREFIX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("@RESOURCE.");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ACE_COND_SID_PREFIX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ACE_COND_TOKEN_ATTRIBUTE_PREFIX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("@TOKEN.");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ACE_COND_USER_ATTRIBUTE_PREFIX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("@USER.");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ACE_END`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`(")");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ALARM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ALIAS_PREW2KCOMPACC`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RU");
public const val `SDDL_ALIAS_SIZE`: UInt = 2u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ALL_APP_PACKAGES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AC");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ANONYMOUS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AN");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_AUDIT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AU");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_AUDIT_FAILURE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_AUDIT_SUCCESS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_AUTHENTICATED_USERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AU");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_AUTHORITY_ASSERTED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AS");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_AUTO_INHERITED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AI");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_AUTO_INHERIT_REQ`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AR");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_BACKUP_OPERATORS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BO");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_BLOB`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TX");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_BOOLEAN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TB");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_BUILTIN_ADMINISTRATORS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_BUILTIN_GUESTS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BG");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_BUILTIN_USERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BU");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_CALLBACK_ACCESS_ALLOWED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("XA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_CALLBACK_ACCESS_DENIED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("XD");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_CALLBACK_AUDIT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("XU");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_CALLBACK_OBJECT_ACCESS_ALLOWED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ZA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_CERTSVC_DCOM_ACCESS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CD");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_CERT_SERV_ADMINISTRATORS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_CLONEABLE_CONTROLLERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CN");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_CONTAINER_INHERIT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CI");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_CONTROL_ACCESS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CR");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_CREATE_CHILD`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CC");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_CREATOR_GROUP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CG");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_CREATOR_OWNER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CO");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_CRITICAL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CR");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_CRYPTO_OPERATORS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CY");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_DACL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("D");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_DELETE_CHILD`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DC");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_DELETE_TREE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DT");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_DELIMINATOR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`(":");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_DOMAIN_ADMINISTRATORS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_DOMAIN_COMPUTERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DC");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_DOMAIN_DOMAIN_CONTROLLERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DD");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_DOMAIN_GUESTS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DG");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_DOMAIN_USERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DU");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ENTERPRISE_ADMINS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ENTERPRISE_DOMAIN_CONTROLLERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ED");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ENTERPRISE_KEY_ADMINS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EK");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ENTERPRISE_RO_DCs`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RO");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_EVENT_LOG_READERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ER");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_EVERYONE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WD");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_FILE_ALL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_FILE_EXECUTE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FX");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_FILE_READ`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FR");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_FILE_WRITE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FW");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_GENERIC_ALL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("GA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_GENERIC_EXECUTE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("GX");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_GENERIC_READ`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("GR");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_GENERIC_WRITE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("GW");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_GROUP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("G");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_GROUP_POLICY_ADMINS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_HYPER_V_ADMINS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("HA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_IIS_USERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("IS");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_INHERITED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_INHERIT_ONLY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("IO");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_INT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TI");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_INTERACTIVE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("IU");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_KEY_ADMINS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_KEY_ALL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_KEY_EXECUTE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KX");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_KEY_READ`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KR");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_KEY_WRITE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KW");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_LIST_CHILDREN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LC");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_LIST_OBJECT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LO");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_LOCAL_ADMIN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_LOCAL_GUEST`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LG");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_LOCAL_SERVICE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LS");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_LOCAL_SYSTEM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SY");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_MANDATORY_LABEL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ML");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ML_HIGH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("HI");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ML_LOW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LW");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ML_MEDIUM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ME");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ML_MEDIUM_PLUS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MP");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_ML_SYSTEM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SI");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_NETWORK`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NU");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_NETWORK_CONFIGURATION_OPS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NO");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_NETWORK_SERVICE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NS");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_NO_EXECUTE_UP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NX");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_NO_PROPAGATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NP");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_NO_READ_UP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NR");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_NO_WRITE_UP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NW");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_NULL_ACL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NO_ACCESS_CONTROL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_OBJECT_ACCESS_ALLOWED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_OBJECT_ACCESS_DENIED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OD");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_OBJECT_ALARM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_OBJECT_AUDIT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OU");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_OBJECT_INHERIT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OI");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_OWNER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("O");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_OWNER_RIGHTS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OW");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_PERFLOG_USERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LU");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_PERFMON_USERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MU");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_PERSONAL_SELF`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PS");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_POWER_USERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PU");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_PRINTER_OPERATORS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PO");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_PROCESS_TRUST_LABEL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_PROTECTED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("P");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_PROTECTED_USERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AP");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_RAS_SERVERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RS");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_RDS_ENDPOINT_SERVERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ES");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_RDS_MANAGEMENT_SERVERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MS");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_RDS_REMOTE_ACCESS_SERVERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_READ_CONTROL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RC");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_READ_PROPERTY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RP");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_REMOTE_DESKTOP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RD");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_REMOTE_MANAGEMENT_USERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RM");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_REPLICATOR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_RESOURCE_ATTRIBUTE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_RESTRICTED_CODE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RC");
public const val `SDDL_REVISION`: UInt = 1u;
public const val `SDDL_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_SACL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("S");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_SCHEMA_ADMINISTRATORS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_SCOPED_POLICY_ID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SP");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_SELF_WRITE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SW");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_SEPERATOR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`(";");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_SERVER_OPERATORS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SO");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_SERVICE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SU");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_SERVICE_ASSERTED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SS");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_SID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TD");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_SPACE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`(" ");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_STANDARD_DELETE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SD");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_TRUST_PROTECTED_FILTER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TP");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_UINT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TU");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_USER_MODE_DRIVERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("UD");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_WRITE_DAC`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WD");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_WRITE_OWNER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WO");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_WRITE_PROPERTY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WP");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_WRITE_RESTRICTED_CODE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WR");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SDDL_WSTRING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TS");
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TRUSTEE_A` (
    public var `pMultipleTrustee`: /* Rust *mut */ kotlinx.cinterop.CPointer<`TRUSTEE_A`>?,
    public var `MultipleTrusteeOperation`: `MULTIPLE_TRUSTEE_OPERATION`,
    public var `TrusteeForm`: `TRUSTEE_FORM`,
    public var `TrusteeType`: `TRUSTEE_TYPE`,
    public var `ptstrName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 1137:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TRUSTEE_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TRUSTEE_ACCESSA` (
    public var `lpProperty`: `windows_sys`.`core`.`PSTR`,
    public var `Access`: UInt,
    public var `fAccessFlags`: UInt,
    public var `fReturnedAccess`: UInt,
)
// UNSUPPORTED Rust 1150:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TRUSTEE_ACCESSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TRUSTEE_ACCESSW` (
    public var `lpProperty`: `windows_sys`.`core`.`PWSTR`,
    public var `Access`: UInt,
    public var `fAccessFlags`: UInt,
    public var `fReturnedAccess`: UInt,
)
// UNSUPPORTED Rust 1163:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TRUSTEE_W` (
    public var `pMultipleTrustee`: /* Rust *mut */ kotlinx.cinterop.CPointer<`TRUSTEE_W`>?,
    public var `MultipleTrusteeOperation`: `MULTIPLE_TRUSTEE_OPERATION`,
    public var `TrusteeForm`: `TRUSTEE_FORM`,
    public var `TrusteeType`: `TRUSTEE_TYPE`,
    public var `ptstrName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1199:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TRUSTEE_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `_AUTHZ_SS_MAXSIZE`: UInt = 128u;
