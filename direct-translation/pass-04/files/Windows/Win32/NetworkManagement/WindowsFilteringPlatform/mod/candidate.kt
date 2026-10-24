// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmCalloutAdd0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmCalloutAdd0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `callout` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_CALLOUT0`>?, `sd` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`, `id` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmCalloutCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmCalloutCreateEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_CALLOUT_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmCalloutDeleteById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmCalloutDeleteById0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmCalloutDeleteByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmCalloutDeleteByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmCalloutDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmCalloutDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmCalloutEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmCalloutEnum0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`FWPM_CALLOUT0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmCalloutGetById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmCalloutGetById0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : UInt, `callout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FWPM_CALLOUT0`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmCalloutGetByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmCalloutGetByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `callout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FWPM_CALLOUT0`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmCalloutGetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmCalloutGetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmCalloutSetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmCalloutSetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmCalloutSubscribeChanges0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmCalloutSubscribeChanges0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `subscription` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_CALLOUT_SUBSCRIPTION0`>?, `callback` : `FWPM_CALLOUT_CHANGE_CALLBACK0`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `changehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmCalloutSubscriptionsGet0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmCalloutSubscriptionsGet0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`FWPM_CALLOUT_SUBSCRIPTION0`>>>?, `numentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmCalloutUnsubscribeChanges0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmCalloutUnsubscribeChanges0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `changehandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmConnectionCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmConnectionCreateEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_CONNECTION_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmConnectionDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmConnectionDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmConnectionEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmConnectionEnum0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`FWPM_CONNECTION0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmConnectionGetById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmConnectionGetById0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong, `connection` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FWPM_CONNECTION0`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmConnectionGetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmConnectionGetSecurityInfo0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmConnectionSetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmConnectionSetSecurityInfo0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmConnectionSubscribe0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmConnectionSubscribe0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `subscription` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_CONNECTION_SUBSCRIPTION0`>?, `callback` : `FWPM_CONNECTION_CALLBACK0`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `eventshandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmConnectionUnsubscribe0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmConnectionUnsubscribe0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `eventshandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmDynamicKeywordSubscribe0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmDynamicKeywordSubscribe0`(`flags` : UInt, `callback` : `FWPM_DYNAMIC_KEYWORD_CALLBACK0`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `subscriptionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmDynamicKeywordUnsubscribe0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmDynamicKeywordUnsubscribe0`(`subscriptionhandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmEngineClose0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmEngineClose0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmEngineGetOption0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmEngineGetOption0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `option` : `FWPM_ENGINE_OPTION`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FWP_VALUE0`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmEngineGetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmEngineGetSecurityInfo0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmEngineOpen0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security", feature = "Win32_System_Rpc"))]
public external fun `FwpmEngineOpen0`(`servername` : `windows_sys`.`core`.`PCWSTR`, `authnservice` : UInt, `authidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Rpc`.`SEC_WINNT_AUTH_IDENTITY_W`>?, `session` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_SESSION0`>?, `enginehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmEngineSetOption0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmEngineSetOption0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `option` : `FWPM_ENGINE_OPTION`, `newvalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWP_VALUE0`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmEngineSetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmEngineSetSecurityInfo0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFilterAdd0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmFilterAdd0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `filter` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_FILTER0`>?, `sd` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`, `id` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFilterCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmFilterCreateEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_FILTER_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFilterDeleteById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmFilterDeleteById0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFilterDeleteByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmFilterDeleteByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFilterDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmFilterDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFilterEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmFilterEnum0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`FWPM_FILTER0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFilterGetById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmFilterGetById0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong, `filter` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FWPM_FILTER0`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFilterGetByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmFilterGetByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `filter` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FWPM_FILTER0`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFilterGetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmFilterGetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFilterSetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmFilterSetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFilterSubscribeChanges0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmFilterSubscribeChanges0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `subscription` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_FILTER_SUBSCRIPTION0`>?, `callback` : `FWPM_FILTER_CHANGE_CALLBACK0`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `changehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFilterSubscriptionsGet0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmFilterSubscriptionsGet0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`FWPM_FILTER_SUBSCRIPTION0`>>>?, `numentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFilterUnsubscribeChanges0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmFilterUnsubscribeChanges0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `changehandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFreeMemory0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmFreeMemory0`(`p` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmGetAppIdFromFileName0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmGetAppIdFromFileName0`(`filename` : `windows_sys`.`core`.`PCWSTR`, `appid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FWP_BYTE_BLOB`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmIPsecTunnelAdd0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmIPsecTunnelAdd0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : UInt, `mainmodepolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_PROVIDER_CONTEXT0`>?, `tunnelpolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_PROVIDER_CONTEXT0`>?, `numfilterconditions` : UInt, `filterconditions` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_FILTER_CONDITION0`>?, `sd` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmIPsecTunnelAdd1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmIPsecTunnelAdd1`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : UInt, `mainmodepolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_PROVIDER_CONTEXT1`>?, `tunnelpolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_PROVIDER_CONTEXT1`>?, `numfilterconditions` : UInt, `filterconditions` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_FILTER_CONDITION0`>?, `keymodkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `sd` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmIPsecTunnelAdd2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmIPsecTunnelAdd2`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : UInt, `mainmodepolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_PROVIDER_CONTEXT2`>?, `tunnelpolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_PROVIDER_CONTEXT2`>?, `numfilterconditions` : UInt, `filterconditions` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_FILTER_CONDITION0`>?, `keymodkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `sd` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmIPsecTunnelAdd3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmIPsecTunnelAdd3`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : UInt, `mainmodepolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_PROVIDER_CONTEXT3`>?, `tunnelpolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_PROVIDER_CONTEXT3`>?, `numfilterconditions` : UInt, `filterconditions` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_FILTER_CONDITION0`>?, `keymodkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `sd` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmIPsecTunnelDeleteByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmIPsecTunnelDeleteByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmLayerCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmLayerCreateEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_LAYER_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmLayerDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmLayerDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmLayerEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmLayerEnum0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`FWPM_LAYER0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmLayerGetById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmLayerGetById0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : UShort, `layer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FWPM_LAYER0`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmLayerGetByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmLayerGetByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `layer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FWPM_LAYER0`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmLayerGetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmLayerGetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmLayerSetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmLayerSetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmNetEventCreateEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_NET_EVENT_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmNetEventDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmNetEventEnum0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`FWPM_NET_EVENT0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventEnum1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmNetEventEnum1`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`FWPM_NET_EVENT1`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventEnum2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmNetEventEnum2`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`FWPM_NET_EVENT2`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventEnum3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmNetEventEnum3`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`FWPM_NET_EVENT3`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventEnum4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmNetEventEnum4`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`FWPM_NET_EVENT4`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventEnum5; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmNetEventEnum5`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`FWPM_NET_EVENT5`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventSubscribe0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmNetEventSubscribe0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `subscription` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_NET_EVENT_SUBSCRIPTION0`>?, `callback` : `FWPM_NET_EVENT_CALLBACK0`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `eventshandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventSubscribe1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmNetEventSubscribe1`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `subscription` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_NET_EVENT_SUBSCRIPTION0`>?, `callback` : `FWPM_NET_EVENT_CALLBACK1`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `eventshandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventSubscribe2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmNetEventSubscribe2`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `subscription` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_NET_EVENT_SUBSCRIPTION0`>?, `callback` : `FWPM_NET_EVENT_CALLBACK2`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `eventshandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventSubscribe3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmNetEventSubscribe3`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `subscription` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_NET_EVENT_SUBSCRIPTION0`>?, `callback` : `FWPM_NET_EVENT_CALLBACK3`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `eventshandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventSubscribe4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmNetEventSubscribe4`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `subscription` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_NET_EVENT_SUBSCRIPTION0`>?, `callback` : `FWPM_NET_EVENT_CALLBACK4`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `eventshandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventSubscriptionsGet0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmNetEventSubscriptionsGet0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`FWPM_NET_EVENT_SUBSCRIPTION0`>>>?, `numentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventUnsubscribe0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmNetEventUnsubscribe0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `eventshandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventsGetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmNetEventsGetSecurityInfo0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventsSetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmNetEventsSetSecurityInfo0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderAdd0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderAdd0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `provider` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_PROVIDER0`>?, `sd` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextAdd0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderContextAdd0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `providercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_PROVIDER_CONTEXT0`>?, `sd` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`, `id` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextAdd1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderContextAdd1`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `providercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_PROVIDER_CONTEXT1`>?, `sd` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`, `id` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextAdd2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderContextAdd2`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `providercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_PROVIDER_CONTEXT2`>?, `sd` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`, `id` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextAdd3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderContextAdd3`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `providercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_PROVIDER_CONTEXT3`>?, `sd` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`, `id` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmProviderContextCreateEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_PROVIDER_CONTEXT_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextDeleteById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmProviderContextDeleteById0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextDeleteByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmProviderContextDeleteByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmProviderContextDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderContextEnum0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`FWPM_PROVIDER_CONTEXT0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextEnum1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderContextEnum1`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`FWPM_PROVIDER_CONTEXT1`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextEnum2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderContextEnum2`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`FWPM_PROVIDER_CONTEXT2`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextEnum3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderContextEnum3`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`FWPM_PROVIDER_CONTEXT3`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextGetById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderContextGetById0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong, `providercontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FWPM_PROVIDER_CONTEXT0`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextGetById1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderContextGetById1`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong, `providercontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FWPM_PROVIDER_CONTEXT1`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextGetById2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderContextGetById2`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong, `providercontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FWPM_PROVIDER_CONTEXT2`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextGetById3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderContextGetById3`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong, `providercontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FWPM_PROVIDER_CONTEXT3`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextGetByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderContextGetByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `providercontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FWPM_PROVIDER_CONTEXT0`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextGetByKey1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderContextGetByKey1`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `providercontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FWPM_PROVIDER_CONTEXT1`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextGetByKey2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderContextGetByKey2`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `providercontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FWPM_PROVIDER_CONTEXT2`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextGetByKey3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderContextGetByKey3`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `providercontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FWPM_PROVIDER_CONTEXT3`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextGetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderContextGetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextSetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderContextSetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextSubscribeChanges0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmProviderContextSubscribeChanges0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `subscription` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_PROVIDER_CONTEXT_SUBSCRIPTION0`>?, `callback` : `FWPM_PROVIDER_CONTEXT_CHANGE_CALLBACK0`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `changehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextSubscriptionsGet0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmProviderContextSubscriptionsGet0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`FWPM_PROVIDER_CONTEXT_SUBSCRIPTION0`>>>?, `numentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextUnsubscribeChanges0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmProviderContextUnsubscribeChanges0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `changehandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmProviderCreateEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_PROVIDER_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderDeleteByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmProviderDeleteByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmProviderDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmProviderEnum0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`FWPM_PROVIDER0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderGetByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmProviderGetByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `provider` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FWPM_PROVIDER0`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderGetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderGetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderSetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderSetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderSubscribeChanges0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmProviderSubscribeChanges0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `subscription` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_PROVIDER_SUBSCRIPTION0`>?, `callback` : `FWPM_PROVIDER_CHANGE_CALLBACK0`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `changehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderSubscriptionsGet0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmProviderSubscriptionsGet0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`FWPM_PROVIDER_SUBSCRIPTION0`>>>?, `numentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderUnsubscribeChanges0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmProviderUnsubscribeChanges0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `changehandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSessionCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmSessionCreateEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_SESSION_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSessionDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmSessionDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSessionEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmSessionEnum0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`FWPM_SESSION0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSubLayerAdd0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmSubLayerAdd0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `sublayer` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_SUBLAYER0`>?, `sd` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSubLayerCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmSubLayerCreateEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_SUBLAYER_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSubLayerDeleteByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmSubLayerDeleteByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSubLayerDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmSubLayerDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSubLayerEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmSubLayerEnum0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`FWPM_SUBLAYER0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSubLayerGetByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmSubLayerGetByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `sublayer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FWPM_SUBLAYER0`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSubLayerGetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmSubLayerGetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSubLayerSetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmSubLayerSetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSubLayerSubscribeChanges0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmSubLayerSubscribeChanges0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `subscription` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_SUBLAYER_SUBSCRIPTION0`>?, `callback` : `FWPM_SUBLAYER_CHANGE_CALLBACK0`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `changehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSubLayerSubscriptionsGet0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmSubLayerSubscriptionsGet0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`FWPM_SUBLAYER_SUBSCRIPTION0`>>>?, `numentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSubLayerUnsubscribeChanges0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmSubLayerUnsubscribeChanges0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `changehandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSystemPortsGet0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmSystemPortsGet0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `sysports` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FWPM_SYSTEM_PORTS0`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSystemPortsSubscribe0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmSystemPortsSubscribe0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `reserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callback` : `FWPM_SYSTEM_PORTS_CALLBACK0`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `sysportshandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSystemPortsUnsubscribe0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmSystemPortsUnsubscribe0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `sysportshandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmTransactionAbort0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmTransactionAbort0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmTransactionBegin0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmTransactionBegin0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmTransactionCommit0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmTransactionCommit0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmvSwitchEventSubscribe0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmvSwitchEventSubscribe0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `subscription` : /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_VSWITCH_EVENT_SUBSCRIPTION0`>?, `callback` : `FWPM_VSWITCH_EVENT_CALLBACK0`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `subscriptionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmvSwitchEventUnsubscribe0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmvSwitchEventUnsubscribe0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `subscriptionhandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmvSwitchEventsGetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmvSwitchEventsGetSecurityInfo0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmvSwitchEventsSetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmvSwitchEventsSetSecurityInfo0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecDospGetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IPsecDospGetSecurityInfo0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecDospGetStatistics0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecDospGetStatistics0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `idpstatistics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_DOSP_STATISTICS0`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecDospSetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IPsecDospSetSecurityInfo0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecDospStateCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecDospStateCreateEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`IPSEC_DOSP_STATE_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecDospStateDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecDospStateDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecDospStateEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecDospStateEnum0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`IPSEC_DOSP_STATE0`>>>?, `numentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecGetStatistics0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecGetStatistics0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `ipsecstatistics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_STATISTICS0`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecGetStatistics1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecGetStatistics1`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `ipsecstatistics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_STATISTICS1`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecKeyManagerAddAndRegister0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IPsecKeyManagerAddAndRegister0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `keymanager` : /* Rust *const */ kotlinx.cinterop.CPointer<`IPSEC_KEY_MANAGER0`>?, `keymanagercallbacks` : /* Rust *const */ kotlinx.cinterop.CPointer<`IPSEC_KEY_MANAGER_CALLBACKS0`>?, `keymgmthandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecKeyManagerGetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IPsecKeyManagerGetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `reserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecKeyManagerSetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IPsecKeyManagerSetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `reserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecKeyManagerUnregisterAndDelete0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecKeyManagerUnregisterAndDelete0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `keymgmthandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecKeyManagersGet0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecKeyManagersGet0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`IPSEC_KEY_MANAGER0`>>>?, `numentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextAddInbound0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecSaContextAddInbound0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong, `inboundbundle` : /* Rust *const */ kotlinx.cinterop.CPointer<`IPSEC_SA_BUNDLE0`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextAddInbound1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecSaContextAddInbound1`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong, `inboundbundle` : /* Rust *const */ kotlinx.cinterop.CPointer<`IPSEC_SA_BUNDLE1`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextAddOutbound0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecSaContextAddOutbound0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong, `outboundbundle` : /* Rust *const */ kotlinx.cinterop.CPointer<`IPSEC_SA_BUNDLE0`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextAddOutbound1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecSaContextAddOutbound1`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong, `outboundbundle` : /* Rust *const */ kotlinx.cinterop.CPointer<`IPSEC_SA_BUNDLE1`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextCreate0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecSaContextCreate0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `outboundtraffic` : /* Rust *const */ kotlinx.cinterop.CPointer<`IPSEC_TRAFFIC0`>?, `inboundfilterid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `id` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextCreate1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecSaContextCreate1`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `outboundtraffic` : /* Rust *const */ kotlinx.cinterop.CPointer<`IPSEC_TRAFFIC1`>?, `virtualiftunnelinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`IPSEC_VIRTUAL_IF_TUNNEL_INFO0`>?, `inboundfilterid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `id` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IPsecSaContextCreateEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`IPSEC_SA_CONTEXT_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextDeleteById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecSaContextDeleteById0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecSaContextDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IPsecSaContextEnum0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`IPSEC_SA_CONTEXT0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextEnum1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IPsecSaContextEnum1`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`IPSEC_SA_CONTEXT1`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextExpire0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecSaContextExpire0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextGetById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IPsecSaContextGetById0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong, `sacontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`IPSEC_SA_CONTEXT0`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextGetById1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IPsecSaContextGetById1`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong, `sacontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`IPSEC_SA_CONTEXT1`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextGetSpi0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecSaContextGetSpi0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong, `getspi` : /* Rust *const */ kotlinx.cinterop.CPointer<`IPSEC_GETSPI0`>?, `inboundspi` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextGetSpi1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecSaContextGetSpi1`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong, `getspi` : /* Rust *const */ kotlinx.cinterop.CPointer<`IPSEC_GETSPI1`>?, `inboundspi` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextSetSpi0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecSaContextSetSpi0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong, `getspi` : /* Rust *const */ kotlinx.cinterop.CPointer<`IPSEC_GETSPI1`>?, `inboundspi` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextSubscribe0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IPsecSaContextSubscribe0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `subscription` : /* Rust *const */ kotlinx.cinterop.CPointer<`IPSEC_SA_CONTEXT_SUBSCRIPTION0`>?, `callback` : `IPSEC_SA_CONTEXT_CALLBACK0`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `eventshandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextSubscriptionsGet0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IPsecSaContextSubscriptionsGet0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`IPSEC_SA_CONTEXT_SUBSCRIPTION0`>>>?, `numentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextUnsubscribe0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecSaContextUnsubscribe0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `eventshandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextUpdate0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IPsecSaContextUpdate0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : ULong, `newvalues` : /* Rust *const */ kotlinx.cinterop.CPointer<`IPSEC_SA_CONTEXT1`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecSaCreateEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`IPSEC_SA_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaDbGetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IPsecSaDbGetSecurityInfo0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaDbSetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IPsecSaDbSetSecurityInfo0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecSaDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IPsecSaEnum0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`IPSEC_SA_DETAILS0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaEnum1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IPsecSaEnum1`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`IPSEC_SA_DETAILS1`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextGetStatistics0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IkeextGetStatistics0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `ikeextstatistics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_STATISTICS0`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextGetStatistics1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IkeextGetStatistics1`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `ikeextstatistics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_STATISTICS1`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextSaCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IkeextSaCreateEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`IKEEXT_SA_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextSaDbGetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IkeextSaDbGetSecurityInfo0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextSaDbSetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IkeextSaDbSetSecurityInfo0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ACL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextSaDeleteById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IkeextSaDeleteById0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextSaDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IkeextSaDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextSaEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IkeextSaEnum0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`IKEEXT_SA_DETAILS0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextSaEnum1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IkeextSaEnum1`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`IKEEXT_SA_DETAILS1`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextSaEnum2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IkeextSaEnum2`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`IKEEXT_SA_DETAILS2`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextSaGetById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IkeextSaGetById0`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong, `sa` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`IKEEXT_SA_DETAILS0`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextSaGetById1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IkeextSaGetById1`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong, `salookupcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `sa` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`IKEEXT_SA_DETAILS1`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextSaGetById2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IkeextSaGetById2`(`enginehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong, `salookupcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `sa` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`IKEEXT_SA_DETAILS2`>>?) : UInt
public typealias `DL_ADDRESS_TYPE` = Int;
public const val `DlBroadcast`: `DL_ADDRESS_TYPE` = 2;
public const val `DlMulticast`: `DL_ADDRESS_TYPE` = 1;
public const val `DlUnicast`: `DL_ADDRESS_TYPE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_ACTION0` (
    public var `type`: `FWP_ACTION_TYPE`,
    public var `Anonymous`: `FWPM_ACTION0_0`,
)
// UNSUPPORTED Rust 284:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_ACTION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 289:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FWPM_ACTION0_0 {
//     pub filterType: windows_sys::core::GUID,
//     pub calloutKey: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 295:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_ACTION0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWPM_ACTRL_ADD`: UInt = 1u;
public const val `FWPM_ACTRL_ADD_LINK`: UInt = 2u;
public const val `FWPM_ACTRL_BEGIN_READ_TXN`: UInt = 4u;
public const val `FWPM_ACTRL_BEGIN_WRITE_TXN`: UInt = 8u;
public const val `FWPM_ACTRL_CLASSIFY`: UInt = 16u;
public const val `FWPM_ACTRL_ENUM`: UInt = 32u;
public const val `FWPM_ACTRL_OPEN`: UInt = 64u;
public const val `FWPM_ACTRL_READ`: UInt = 128u;
public const val `FWPM_ACTRL_READ_STATS`: UInt = 256u;
public const val `FWPM_ACTRL_SUBSCRIBE`: UInt = 512u;
public const val `FWPM_ACTRL_WRITE`: UInt = 1024u;
public const val `FWPM_APPC_NETWORK_CAPABILITY_INTERNET_CLIENT`: `FWPM_APPC_NETWORK_CAPABILITY_TYPE` = 0;
public const val `FWPM_APPC_NETWORK_CAPABILITY_INTERNET_CLIENT_SERVER`: `FWPM_APPC_NETWORK_CAPABILITY_TYPE` = 1;
public const val `FWPM_APPC_NETWORK_CAPABILITY_INTERNET_PRIVATE_NETWORK`: `FWPM_APPC_NETWORK_CAPABILITY_TYPE` = 2;
public typealias `FWPM_APPC_NETWORK_CAPABILITY_TYPE` = Int;
public const val `FWPM_AUTO_WEIGHT_BITS`: UInt = 60u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_CALLOUT0` (
    public var `calloutKey`: `windows_sys`.`core`.`GUID`,
    public var `displayData`: `FWPM_DISPLAY_DATA0`,
    public var `flags`: UInt,
    public var `providerKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `providerData`: `FWP_BYTE_BLOB`,
    public var `applicableLayer`: `windows_sys`.`core`.`GUID`,
    public var `calloutId`: UInt,
)
// UNSUPPORTED Rust 327:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_CALLOUT0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 332:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_BUILT_IN_RESERVED_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x779719a4_e695_47b6_a199_7999fec9163b);

// UNSUPPORTED Rust 333:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_BUILT_IN_RESERVED_2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xef9661b6_7c5e_48fd_a130_96678ceacc41);

// UNSUPPORTED Rust 334:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_BUILT_IN_RESERVED_3: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x18729c7a_2f62_4be0_966f_974b21b86df1);

// UNSUPPORTED Rust 335:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_BUILT_IN_RESERVED_4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6c3fb801_daff_40e9_91e6_f7ff7e52f7d9);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FWPM_CALLOUT_CHANGE0` (
    public var `changeType`: `FWPM_CHANGE_TYPE`,
    public var `calloutKey`: `windows_sys`.`core`.`GUID`,
    public var `calloutId`: UInt,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FWPM_CALLOUT_CHANGE_CALLBACK0` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_CALLOUT_CHANGE0`>?) -> Unit>>>;
// UNSUPPORTED Rust 344:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_EDGE_TRAVERSAL_ALE_LISTEN_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x33486ab5_6d5e_4e65_a00b_a7afed0ba9a1);

// UNSUPPORTED Rust 345:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_EDGE_TRAVERSAL_ALE_RESOURCE_ASSIGNMENT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x079b1010_f1c5_4fcd_ae05_da41107abd0b);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_CALLOUT_ENUM_TEMPLATE0` (
    public var `providerKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `layerKey`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 352:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_CALLOUT_ENUM_TEMPLATE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWPM_CALLOUT_FLAG_PERSISTENT`: UInt = 65536u;
public const val `FWPM_CALLOUT_FLAG_REGISTERED`: UInt = 262144u;
public const val `FWPM_CALLOUT_FLAG_USES_PROVIDER_CONTEXT`: UInt = 131072u;
// UNSUPPORTED Rust 360:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_HTTP_TEMPLATE_SSL_HANDSHAKE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb3423249_8d09_4858_9210_95c7fda8e30f);

// UNSUPPORTED Rust 361:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_IPSEC_ALE_CONNECT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6ac141fc_f75d_4203_b9c8_48e6149c2712);

// UNSUPPORTED Rust 362:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_IPSEC_ALE_CONNECT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4c0dda05_e31f_4666_90b0_b3dfad34129a);

// UNSUPPORTED Rust 363:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_IPSEC_DOSP_FORWARD_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2fcb56ec_cd37_4b4f_b108_62c2b1850a0c);

// UNSUPPORTED Rust 364:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_IPSEC_DOSP_FORWARD_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6d08a342_db9e_4fbe_9ed2_57374ce89f79);

// UNSUPPORTED Rust 365:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_IPSEC_FORWARD_INBOUND_TUNNEL_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x28829633_c4f0_4e66_873f_844db2a899c7);

// UNSUPPORTED Rust 366:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_IPSEC_FORWARD_INBOUND_TUNNEL_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaf50bec2_c686_429a_884d_b74443e7b0b4);

// UNSUPPORTED Rust 367:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_IPSEC_FORWARD_OUTBOUND_TUNNEL_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb532136_15cb_440b_937c_1717ca320c40);

// UNSUPPORTED Rust 368:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_IPSEC_FORWARD_OUTBOUND_TUNNEL_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdae640cc_e021_4bee_9eb6_a48b275c8c1d);

// UNSUPPORTED Rust 369:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_IPSEC_INBOUND_INITIATE_SECURE_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7dff309b_ba7d_4aba_91aa_ae5c6640c944);

// UNSUPPORTED Rust 370:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_IPSEC_INBOUND_INITIATE_SECURE_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa9a0d6d9_c58c_474e_8aeb_3cfe99d6d53d);

// UNSUPPORTED Rust 371:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_IPSEC_INBOUND_TRANSPORT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5132900d_5e84_4b5f_80e4_01741e81ff10);

// UNSUPPORTED Rust 372:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_IPSEC_INBOUND_TRANSPORT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x49d3ac92_2a6c_4dcf_955f_1c3be009dd99);

// UNSUPPORTED Rust 373:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_IPSEC_INBOUND_TUNNEL_ALE_ACCEPT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3df6e7de_fd20_48f2_9f26_f854444cba79);

// UNSUPPORTED Rust 374:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_IPSEC_INBOUND_TUNNEL_ALE_ACCEPT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa1e392d3_72ac_47bb_87a7_0122c69434ab);

// UNSUPPORTED Rust 375:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_IPSEC_INBOUND_TUNNEL_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x191a8a46_0bf8_46cf_b045_4b45dfa6a324);

// UNSUPPORTED Rust 376:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_IPSEC_INBOUND_TUNNEL_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x80c342e3_1e53_4d6f_9b44_03df5aeee154);

// UNSUPPORTED Rust 377:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_IPSEC_OUTBOUND_TRANSPORT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4b46bf0a_4523_4e57_aa38_a87987c910d9);

// UNSUPPORTED Rust 378:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_IPSEC_OUTBOUND_TRANSPORT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x38d87722_ad83_4f11_a91f_df0fb077225b);

// UNSUPPORTED Rust 379:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_IPSEC_OUTBOUND_TUNNEL_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x70a4196c_835b_4fb0_98e8_075f4d977d46);

// UNSUPPORTED Rust 380:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_IPSEC_OUTBOUND_TUNNEL_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf1835363_a6a5_4e62_b180_23db789d8da6);

// UNSUPPORTED Rust 381:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_OUTBOUND_NETWORK_CONNECTION_POLICY_LAYER_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x103090d4_8e28_4fd6_9894_d1d67d6b10c9);

// UNSUPPORTED Rust 382:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_OUTBOUND_NETWORK_CONNECTION_POLICY_LAYER_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4ed3446d_8dc7_459b_b09f_c1cb7a8f8689);

// UNSUPPORTED Rust 383:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_POLICY_SILENT_MODE_AUTH_CONNECT_LAYER_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5fbfc31d_a51c_44dc_acb6_0624a030a700);

// UNSUPPORTED Rust 384:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_POLICY_SILENT_MODE_AUTH_CONNECT_LAYER_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5fbfc31d_a51c_44dc_acb6_0624a030a701);

// UNSUPPORTED Rust 385:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_POLICY_SILENT_MODE_AUTH_RECV_ACCEPT_LAYER_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5fbfc31d_a51c_44dc_acb6_0624a030a702);

// UNSUPPORTED Rust 386:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_POLICY_SILENT_MODE_AUTH_RECV_ACCEPT_LAYER_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5fbfc31d_a51c_44dc_acb6_0624a030a703);

// UNSUPPORTED Rust 387:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_RESERVED_AUTH_CONNECT_LAYER_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x288b524d_0566_4e19_b612_8f441a2e5949);

// UNSUPPORTED Rust 388:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_RESERVED_AUTH_CONNECT_LAYER_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00b84b92_2b5e_4b71_ab0e_aaca43e387e6);

// UNSUPPORTED Rust 389:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_SET_OPTIONS_AUTH_CONNECT_LAYER_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbc582280_1677_41e9_94ab_c2fcb15c2eeb);

// UNSUPPORTED Rust 390:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_SET_OPTIONS_AUTH_CONNECT_LAYER_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x98e5373c_b884_490f_b65f_2f6a4a575195);

// UNSUPPORTED Rust 391:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_SET_OPTIONS_AUTH_RECV_ACCEPT_LAYER_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2d55f008_0c01_4f92_b26e_a08a94569b8d);

// UNSUPPORTED Rust 392:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_SET_OPTIONS_AUTH_RECV_ACCEPT_LAYER_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x63018537_f281_4dc4_83d3_8dec18b7ade2);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_CALLOUT_SUBSCRIPTION0` (
    public var `enumTemplate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FWPM_CALLOUT_ENUM_TEMPLATE0`>?,
    public var `flags`: UInt,
    public var `sessionKey`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 400:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_CALLOUT_SUBSCRIPTION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 405:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_TCP_CHIMNEY_ACCEPT_LAYER_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe183ecb2_3a7f_4b54_8ad9_76050ed880ca);

// UNSUPPORTED Rust 406:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_TCP_CHIMNEY_ACCEPT_LAYER_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0378cf41_bf98_4603_81f2_7f12586079f6);

// UNSUPPORTED Rust 407:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_TCP_CHIMNEY_CONNECT_LAYER_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf3e10ab3_2c25_4279_ac36_c30fc181bec4);

// UNSUPPORTED Rust 408:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_TCP_CHIMNEY_CONNECT_LAYER_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x39e22085_a341_42fc_a279_aec94e689c56);

// UNSUPPORTED Rust 409:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_TCP_TEMPLATES_ACCEPT_LAYER_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2f23f5d0_40c4_4c41_a254_46d8dba8957c);

// UNSUPPORTED Rust 410:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_TCP_TEMPLATES_ACCEPT_LAYER_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb25152f0_991c_4f53_bbe7_d24b45fe632c);

// UNSUPPORTED Rust 411:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_TCP_TEMPLATES_CONNECT_LAYER_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x215a0b39_4b7e_4eda_8ce4_179679df6224);

// UNSUPPORTED Rust 412:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_TCP_TEMPLATES_CONNECT_LAYER_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x838b37a1_5c12_4d34_8b38_078728b2d25c);

// UNSUPPORTED Rust 413:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_TEREDO_ALE_LISTEN_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x81a434e7_f60c_4378_bab8_c625a30f0197);

// UNSUPPORTED Rust 414:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_TEREDO_ALE_RESOURCE_ASSIGNMENT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x31b95392_066e_42a2_b7db_92f8acdd56f9);

// UNSUPPORTED Rust 415:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_WFP_TRANSPORT_LAYER_V4_SILENT_DROP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeda08606_2494_4d78_89bc_67837c03b969);

// UNSUPPORTED Rust 416:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CALLOUT_WFP_TRANSPORT_LAYER_V6_SILENT_DROP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8693cc74_a075_4156_b476_9286eece814e);

public const val `FWPM_CHANGE_ADD`: `FWPM_CHANGE_TYPE` = 1;
public const val `FWPM_CHANGE_DELETE`: `FWPM_CHANGE_TYPE` = 2;
public typealias `FWPM_CHANGE_TYPE` = Int;
public const val `FWPM_CHANGE_TYPE_MAX`: `FWPM_CHANGE_TYPE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_CLASSIFY_OPTION0` (
    public var `type`: `FWP_CLASSIFY_OPTION_TYPE`,
    public var `value`: `FWP_VALUE0`,
)
// UNSUPPORTED Rust 428:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_CLASSIFY_OPTION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_CLASSIFY_OPTIONS0` (
    public var `numOptions`: UInt,
    public var `options`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FWPM_CLASSIFY_OPTION0`>?,
)
// UNSUPPORTED Rust 441:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_CLASSIFY_OPTIONS0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWPM_CLASSIFY_OPTIONS_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 7;
// UNSUPPORTED Rust 448:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_ALE_APP_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd78e1e87_8644_4ea5_9437_d809ecefc971);

// UNSUPPORTED Rust 449:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_ALE_EFFECTIVE_NAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb1277b9a_b781_40fc_9671_e5f1b989f34e);

// UNSUPPORTED Rust 450:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_ALE_NAP_CONTEXT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x46275a9d_c03f_4d77_b784_1c57f4d02753);

// UNSUPPORTED Rust 451:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_ALE_ORIGINAL_APP_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0e6cd086_e1fb_4212_842f_8a9f993fb3f6);

// UNSUPPORTED Rust 452:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_ALE_PACKAGE_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x71bc78fa_f17c_4997_a602_6abb261f351c);

// UNSUPPORTED Rust 453:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_ALE_PROMISCUOUS_MODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1c974776_7182_46e9_afd3_b02910e30334);

// UNSUPPORTED Rust 454:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_ALE_REAUTH_REASON: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb482d227_1979_4a98_8044_18bbe6237542);

// UNSUPPORTED Rust 455:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_ALE_REMOTE_MACHINE_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1aa47f51_7f93_4508_a271_81abb00c9cab);

// UNSUPPORTED Rust 456:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_ALE_REMOTE_USER_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf63073b7_0189_4ab0_95a4_6123cbfab862);

// UNSUPPORTED Rust 457:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_ALE_SECURITY_ATTRIBUTE_FQBN_VALUE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x37a57699_5883_4963_92b8_3e704688b0ad);

// UNSUPPORTED Rust 458:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_ALE_SIO_FIREWALL_SYSTEM_PORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9f4e088_cb98_4efb_a2c7_ad07332643db);

// UNSUPPORTED Rust 459:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_ALE_USER_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaf043a0a_b34d_4f86_979c_c90371af6e66);

// UNSUPPORTED Rust 460:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_ARRIVAL_INTERFACE_INDEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcc088db3_1792_4a71_b0f9_037d21cd828b);

// UNSUPPORTED Rust 461:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_ARRIVAL_INTERFACE_PROFILE_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcdfe6aab_c083_4142_8679_c08f95329c61);

// UNSUPPORTED Rust 462:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_ARRIVAL_INTERFACE_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x89f990de_e798_4e6d_ab76_7c9558292e6f);

// UNSUPPORTED Rust 463:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_ARRIVAL_TUNNEL_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x511166dc_7a8c_4aa7_b533_95ab59fb0340);

// UNSUPPORTED Rust 464:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_AUTHENTICATION_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeb458cd5_da7b_4ef9_8d43_7b0a840332f2);

// UNSUPPORTED Rust 465:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_CLIENT_CERT_KEY_LENGTH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa3ec00c7_05f4_4df7_91f2_5f60d91ff443);

// UNSUPPORTED Rust 466:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_CLIENT_CERT_OID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc491ad5e_f882_4283_b916_436b103ff4ad);

// UNSUPPORTED Rust 467:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_CLIENT_TOKEN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc228fc1e_403a_4478_be05_c9baa4c05ace);

// UNSUPPORTED Rust 468:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_COMPARTMENT_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x35a791ab_04ac_4ff2_a6bb_da6cfac71806);

// UNSUPPORTED Rust 469:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_CURRENT_PROFILE_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xab3033c9_c0e3_4759_937d_5758c65d4ae3);

// UNSUPPORTED Rust 470:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_DCOM_APP_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xff2e7b4d_3112_4770_b636_4d24ae3a6af2);

// UNSUPPORTED Rust 471:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_DESTINATION_INTERFACE_INDEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x35cf6522_4139_45ee_a0d5_67b80949d879);

// UNSUPPORTED Rust 472:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_DESTINATION_SUB_INTERFACE_INDEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2b7d4399_d4c7_4738_a2f5_e994b43da388);

// UNSUPPORTED Rust 473:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_DIRECTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8784c146_ca97_44d6_9fd1_19fb1840cbf7);

// UNSUPPORTED Rust 474:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_EMBEDDED_LOCAL_ADDRESS_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4672a468_8a0a_4202_abb4_849e92e66809);

// UNSUPPORTED Rust 475:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_EMBEDDED_LOCAL_PORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbfca394d_acdb_484e_b8e6_2aff79757345);

// UNSUPPORTED Rust 476:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_EMBEDDED_PROTOCOL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x07784107_a29e_4c7b_9ec7_29c44afafdbc);

// UNSUPPORTED Rust 477:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_EMBEDDED_REMOTE_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x77ee4b39_3273_4671_b63b_ab6feb66eeb6);

// UNSUPPORTED Rust 478:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_EMBEDDED_REMOTE_PORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcae4d6a1_2968_40ed_a4ce_547160dda88d);

// UNSUPPORTED Rust 479:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_ETHER_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfd08948d_a219_4d52_bb98_1a5540ee7b4e);

// UNSUPPORTED Rust 480:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_FLAGS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x632ce23b_5167_435c_86d7_e903684aa80c);

// UNSUPPORTED Rust 481:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IMAGE_NAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd024de4d_deaa_4317_9c85_e40ef6e140c3);

// UNSUPPORTED Rust 482:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_INTERFACE_INDEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x667fd755_d695_434a_8af5_d3835a1259bc);

// UNSUPPORTED Rust 483:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_INTERFACE_MAC_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf6e63dce_1f4b_4c6b_b6ef_1165e71f8ee7);

// UNSUPPORTED Rust 484:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_INTERFACE_QUARANTINE_EPOCH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcce68d5e_053b_43a8_9a6f_33384c28e4f6);

// UNSUPPORTED Rust 485:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_INTERFACE_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdaf8cd14_e09e_4c93_a5ae_c5c13b73ffca);

// UNSUPPORTED Rust 486:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IPSEC_POLICY_KEY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xad37dee3_722f_45cc_a4e3_068048124452);

// UNSUPPORTED Rust 487:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IPSEC_SECURITY_REALM_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x37a57700_5884_4964_92b8_3e704688b0ad);

// UNSUPPORTED Rust 488:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IP_ARRIVAL_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x618a9b6d_386b_4136_ad6e_b51587cfb1cd);

// UNSUPPORTED Rust 489:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IP_DESTINATION_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2d79133b_b390_45c6_8699_acaceaafed33);

// UNSUPPORTED Rust 490:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IP_DESTINATION_ADDRESS_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1ec1b7c9_4eea_4f5e_b9ef_76beaaaf17ee);

// UNSUPPORTED Rust 491:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IP_DESTINATION_PORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xce6def45_60fb_4a7b_a304_af30a117000e);

// UNSUPPORTED Rust 492:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IP_FORWARD_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1076b8a5_6323_4c5e_9810_e8d3fc9e6136);

// UNSUPPORTED Rust 493:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IP_LOCAL_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd9ee00de_c1ef_4617_bfe3_ffd8f5a08957);

// UNSUPPORTED Rust 494:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IP_LOCAL_ADDRESS_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6ec7f6c4_376b_45d7_9e9c_d337cedcd237);

// UNSUPPORTED Rust 495:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IP_LOCAL_ADDRESS_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03a629cb_6e52_49f8_9c41_5709633c09cf);

// UNSUPPORTED Rust 496:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IP_LOCAL_ADDRESS_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2381be84_7524_45b3_a05b_1e637d9c7a6a);

// UNSUPPORTED Rust 497:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IP_LOCAL_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4cd62a49_59c3_4969_b7f3_bda5d32890a4);

// UNSUPPORTED Rust 498:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IP_LOCAL_PORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0c1ba1af_5765_453f_af22_a8f791ac775b);

// UNSUPPORTED Rust 499:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IP_NEXTHOP_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeabe448a_a711_4d64_85b7_3f76b65299c7);

// UNSUPPORTED Rust 500:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IP_NEXTHOP_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x93ae8f5b_7f6f_4719_98c8_14e97429ef04);

// UNSUPPORTED Rust 501:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IP_PHYSICAL_ARRIVAL_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xda50d5c8_fa0d_4c89_b032_6e62136d1e96);

// UNSUPPORTED Rust 502:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IP_PHYSICAL_NEXTHOP_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf09bd5ce_5150_48be_b098_c25152fb1f92);

// UNSUPPORTED Rust 503:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IP_PROTOCOL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3971ef2b_623e_4f9a_8cb1_6e79b806b9a7);

// UNSUPPORTED Rust 504:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IP_REMOTE_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb235ae9a_1d64_49b8_a44c_5ff3d9095045);

// UNSUPPORTED Rust 505:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IP_REMOTE_ADDRESS_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1febb610_3bcc_45e1_bc36_2e067e2cb186);

// UNSUPPORTED Rust 506:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IP_REMOTE_ADDRESS_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x246e1d8c_8bee_4018_9b98_31d4582f3361);

// UNSUPPORTED Rust 507:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IP_REMOTE_PORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc35a604d_d22b_4e1a_91b4_68f674ee674b);

// UNSUPPORTED Rust 508:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IP_SOURCE_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xae96897e_2e94_4bc9_b313_b27ee80e574d);

// UNSUPPORTED Rust 509:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_IP_SOURCE_PORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa6afef91_3df4_4730_a214_f5426aebf821);

// UNSUPPORTED Rust 510:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_KM_AUTH_NAP_CONTEXT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x35d0ea0e_15ca_492b_900e_97fd46352cce);

// UNSUPPORTED Rust 511:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_KM_MODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfeef4582_ef8f_4f7b_858b_9077d122de47);

// UNSUPPORTED Rust 512:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_KM_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xff0f5f49_0ceb_481b_8638_1479791f3f2c);

// UNSUPPORTED Rust 513:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_L2_FLAGS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7bc43cbf_37ba_45f1_b74a_82ff518eeb10);

// UNSUPPORTED Rust 514:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_LOCAL_INTERFACE_PROFILE_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4ebf7562_9f18_4d06_9941_a7a625744d71);

// UNSUPPORTED Rust 515:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_MAC_DESTINATION_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x04ea2a93_858c_4027_b613_b43180c7859e);

// UNSUPPORTED Rust 516:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_MAC_DESTINATION_ADDRESS_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xae052932_ef42_4e99_b129_f3b3139e34f7);

// UNSUPPORTED Rust 517:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_MAC_LOCAL_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd999e981_7948_4c83_b742_c84e3b678f8f);

// UNSUPPORTED Rust 518:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_MAC_LOCAL_ADDRESS_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcc31355c_3073_4ffb_a14f_79415cb1ead1);

// UNSUPPORTED Rust 519:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_MAC_REMOTE_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x408f2ed4_3a70_4b4d_92a6_415ac20e2f12);

// UNSUPPORTED Rust 520:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_MAC_REMOTE_ADDRESS_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x027fedb4_f1c1_4030_b564_ee777fd867ea);

// UNSUPPORTED Rust 521:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_MAC_SOURCE_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7b795451_f1f6_4d05_b7cb_21779d802336);

// UNSUPPORTED Rust 522:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_MAC_SOURCE_ADDRESS_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5c1b72e4_299e_4437_a298_bc3f014b3dc2);

// UNSUPPORTED Rust 523:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_NDIS_MEDIA_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcb31cef1_791d_473b_89d1_61c5984304a0);

// UNSUPPORTED Rust 524:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_NDIS_PHYSICAL_MEDIA_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x34c79823_c229_44f2_b83c_74020882ae77);

// UNSUPPORTED Rust 525:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_NDIS_PORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdb7bb42b_2dac_4cd4_a59a_e0bdce1e6834);

// UNSUPPORTED Rust 526:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_NET_EVENT_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x206e9996_490e_40cf_b831_b38641eb6fcb);

// UNSUPPORTED Rust 527:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_NEXTHOP_INTERFACE_INDEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x138e6888_7ab8_4d65_9ee8_0591bcf6a494);

// UNSUPPORTED Rust 528:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_NEXTHOP_INTERFACE_PROFILE_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd7ff9a56_cdaa_472b_84db_d23963c1d1bf);

// UNSUPPORTED Rust 529:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_NEXTHOP_INTERFACE_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x97537c6c_d9a3_4767_a381_e942675cd920);

// UNSUPPORTED Rust 530:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_NEXTHOP_SUB_INTERFACE_INDEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xef8a6122_0577_45a7_9aaf_825fbeb4fb95);

// UNSUPPORTED Rust 531:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_NEXTHOP_TUNNEL_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x72b1a111_987b_4720_99dd_c7c576fa2d4c);

// UNSUPPORTED Rust 532:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_ORIGINAL_ICMP_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x076dfdbe_c56c_4f72_ae8a_2cfe7e5c8286);

// UNSUPPORTED Rust 533:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_ORIGINAL_PROFILE_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x46ea1551_2255_492b_8019_aabeee349f40);

// UNSUPPORTED Rust 534:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_PEER_NAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9b539082_eb90_4186_a6cc_de5b63235016);

// UNSUPPORTED Rust 535:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_PIPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1bd0741d_e3df_4e24_8634_762046eef6eb);

// UNSUPPORTED Rust 536:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_PROCESS_WITH_RPC_IF_UUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe31180a8_bbbd_4d14_a65e_7157b06233bb);

// UNSUPPORTED Rust 537:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_QM_MODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf64fc6d1_f9cb_43d2_8a5f_e13bc894f265);

// UNSUPPORTED Rust 538:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_REAUTHORIZE_REASON: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x11205e8c_11ae_457a_8a44_477026dd764a);

// UNSUPPORTED Rust 539:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_REMOTE_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf68166fd_0682_4c89_b8f5_86436c7ef9b7);

// UNSUPPORTED Rust 540:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_REMOTE_USER_TOKEN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9bf0ee66_06c9_41b9_84da_288cb43af51f);

// UNSUPPORTED Rust 541:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RESERVED0: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x678f4deb_45af_4882_93fe_19d4729d9834);

// UNSUPPORTED Rust 542:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RESERVED1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd818f827_5c69_48eb_bf80_d86b17755f97);

// UNSUPPORTED Rust 543:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RESERVED10: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb979e282_d621_4c8c_b184_b105a61c36ce);

// UNSUPPORTED Rust 544:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RESERVED11: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2d62ee4d_023d_411f_9582_43acbb795975);

// UNSUPPORTED Rust 545:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RESERVED12: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa3677c32_7e35_4ddc_93da_e8c33fc923c7);

// UNSUPPORTED Rust 546:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RESERVED13: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x335a3e90_84aa_42f5_9e6f_59309536a44c);

// UNSUPPORTED Rust 547:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RESERVED14: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x30e44da2_2f1a_4116_a559_f907de83604a);

// UNSUPPORTED Rust 548:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RESERVED15: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbab8340f_afe0_43d1_80d8_5ca456962de3);

// UNSUPPORTED Rust 549:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RESERVED2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53d4123d_e15b_4e84_b7a8_dce16f7b62d9);

// UNSUPPORTED Rust 550:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RESERVED3: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7f6e8ca3_6606_4932_97c7_e1f20710af3b);

// UNSUPPORTED Rust 551:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RESERVED4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5f58e642_b937_495e_a94b_f6b051a49250);

// UNSUPPORTED Rust 552:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RESERVED5: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9ba8f6cd_f77c_43e6_8847_11939dc5db5a);

// UNSUPPORTED Rust 553:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RESERVED6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf13d84bd_59d5_44c4_8817_5ecdae1805bd);

// UNSUPPORTED Rust 554:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RESERVED7: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x65a0f930_45dd_4983_aa33_efc7b611af08);

// UNSUPPORTED Rust 555:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RESERVED8: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4f424974_0c12_4816_9b47_9a547db39a32);

// UNSUPPORTED Rust 556:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RESERVED9: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xce78e10f_13ff_4c70_8643_36ad1879afa3);

// UNSUPPORTED Rust 557:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RPC_AUTH_LEVEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe5a0aed5_59ac_46ea_be05_a5f05ecf446e);

// UNSUPPORTED Rust 558:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RPC_AUTH_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdaba74ab_0d67_43e7_986e_75b84f82f594);

// UNSUPPORTED Rust 559:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RPC_EP_FLAGS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x218b814a_0a39_49b8_8e71_c20c39c7dd2e);

// UNSUPPORTED Rust 560:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RPC_EP_VALUE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdccea0b9_0886_4360_9c6a_ab043a24fba9);

// UNSUPPORTED Rust 561:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RPC_IF_FLAG: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x238a8a32_3199_467d_871c_272621ab3896);

// UNSUPPORTED Rust 562:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RPC_IF_UUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7c9c7d9f_0075_4d35_a0d1_8311c4cf6af1);

// UNSUPPORTED Rust 563:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RPC_IF_VERSION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeabfd9b7_1262_4a2e_adaa_5f96f6fe326d);

// UNSUPPORTED Rust 564:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RPC_PROTOCOL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2717bc74_3a35_4ce7_b7ef_c838fabdec45);

// UNSUPPORTED Rust 565:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RPC_PROXY_AUTH_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x40953fe2_8565_4759_8488_1771b4b4b5db);

// UNSUPPORTED Rust 566:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RPC_SERVER_NAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb605a225_c3b3_48c7_9833_7aefa9527546);

// UNSUPPORTED Rust 567:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_RPC_SERVER_PORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8090f645_9ad5_4e3b_9f9f_8023ca097909);

// UNSUPPORTED Rust 568:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_SEC_ENCRYPT_ALGORITHM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0d306ef0_e974_4f74_b5c7_591b0da7d562);

// UNSUPPORTED Rust 569:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_SEC_KEY_SIZE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4772183b_ccf8_4aeb_bce1_c6c6161c8fe4);

// UNSUPPORTED Rust 570:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_SOURCE_INTERFACE_INDEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2311334d_c92d_45bf_9496_edf447820e2d);

// UNSUPPORTED Rust 571:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_SOURCE_SUB_INTERFACE_INDEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x055edd9d_acd2_4361_8dab_f9525d97662f);

// UNSUPPORTED Rust 572:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_SUB_INTERFACE_INDEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cd42473_d621_4be3_ae8c_72a348d283e1);

// UNSUPPORTED Rust 573:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_TUNNEL_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x77a40437_8779_4868_a261_f5a902f1c0cd);

// UNSUPPORTED Rust 574:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_VLAN_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x938eab21_3618_4e64_9ca5_2141ebda1ca2);

// UNSUPPORTED Rust 575:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_VSWITCH_DESTINATION_INTERFACE_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8ed48be4_c926_49f6_a4f6_ef3030e3fc16);

// UNSUPPORTED Rust 576:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_VSWITCH_DESTINATION_INTERFACE_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfa9b3f06_2f1a_4c57_9e68_a7098b28dbfe);

// UNSUPPORTED Rust 577:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_VSWITCH_DESTINATION_VM_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6106aace_4de1_4c84_9671_3637f8bcf731);

// UNSUPPORTED Rust 578:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_VSWITCH_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc4a414ba_437b_4de6_9946_d99c1b95b312);

// UNSUPPORTED Rust 579:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_VSWITCH_NETWORK_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x11d48b4b_e77a_40b4_9155_392c906c2608);

// UNSUPPORTED Rust 580:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_VSWITCH_SOURCE_INTERFACE_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7f4ef24b_b2c1_4938_ba33_a1ecbed512ba);

// UNSUPPORTED Rust 581:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_VSWITCH_SOURCE_INTERFACE_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe6b040a2_edaf_4c36_908b_f2f58ae43807);

// UNSUPPORTED Rust 582:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_VSWITCH_SOURCE_VM_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9c2a9ec2_9fc6_42bc_bdd8_406d4da0be64);

// UNSUPPORTED Rust 583:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_CONDITION_VSWITCH_TENANT_NETWORK_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdc04843c_79e6_4e44_a025_65b9bb0f9f94);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_CONNECTION0` (
    public var `connectionId`: ULong,
    public var `ipVersion`: `FWP_IP_VERSION`,
    public var `Anonymous1`: `FWPM_CONNECTION0_0`,
    public var `Anonymous2`: `FWPM_CONNECTION0_1`,
    public var `providerKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `ipsecTrafficModeType`: `IPSEC_TRAFFIC_TYPE`,
    public var `keyModuleType`: `IKEEXT_KEY_MODULE_TYPE`,
    public var `mmCrypto`: `IKEEXT_PROPOSAL0`,
    public var `mmPeer`: `IKEEXT_CREDENTIAL2`,
    public var `emPeer`: `IKEEXT_CREDENTIAL2`,
    public var `bytesTransferredIn`: ULong,
    public var `bytesTransferredOut`: ULong,
    public var `bytesTransferredTotal`: ULong,
    public var `startSysTime`: `super`.`super`.`Foundation`.`FILETIME`,
)
// UNSUPPORTED Rust 602:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_CONNECTION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 607:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FWPM_CONNECTION0_0 {
//     pub localV4Address: u32,
//     pub localV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 613:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_CONNECTION0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 618:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FWPM_CONNECTION0_1 {
//     pub remoteV4Address: u32,
//     pub remoteV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 624:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_CONNECTION0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FWPM_CONNECTION_CALLBACK0` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `FWPM_CONNECTION_EVENT_TYPE`, /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_CONNECTION0`>?) -> Unit>>>;
public const val `FWPM_CONNECTION_ENUM_FLAG_QUERY_BYTES_TRANSFERRED`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FWPM_CONNECTION_ENUM_TEMPLATE0` (
    public var `connectionId`: ULong,
    public var `flags`: UInt,
)
public const val `FWPM_CONNECTION_EVENT_ADD`: `FWPM_CONNECTION_EVENT_TYPE` = 0;
public const val `FWPM_CONNECTION_EVENT_DELETE`: `FWPM_CONNECTION_EVENT_TYPE` = 1;
public const val `FWPM_CONNECTION_EVENT_MAX`: `FWPM_CONNECTION_EVENT_TYPE` = 2;
public typealias `FWPM_CONNECTION_EVENT_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_CONNECTION_SUBSCRIPTION0` (
    public var `enumTemplate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FWPM_CONNECTION_ENUM_TEMPLATE0`>?,
    public var `flags`: UInt,
    public var `sessionKey`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 648:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_CONNECTION_SUBSCRIPTION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_DISPLAY_DATA0` (
    public var `name`: `windows_sys`.`core`.`PWSTR`,
    public var `description`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 659:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_DISPLAY_DATA0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FWPM_DYNAMIC_KEYWORD_CALLBACK0` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public const val `FWPM_ENGINE_COLLECT_NET_EVENTS`: `FWPM_ENGINE_OPTION` = 0;
public const val `FWPM_ENGINE_MONITOR_IPSEC_CONNECTIONS`: `FWPM_ENGINE_OPTION` = 3;
public const val `FWPM_ENGINE_NAME_CACHE`: `FWPM_ENGINE_OPTION` = 2;
public const val `FWPM_ENGINE_NET_EVENT_MATCH_ANY_KEYWORDS`: `FWPM_ENGINE_OPTION` = 1;
public typealias `FWPM_ENGINE_OPTION` = Int;
public const val `FWPM_ENGINE_OPTION_MAX`: `FWPM_ENGINE_OPTION` = 6;
public const val `FWPM_ENGINE_OPTION_PACKET_BATCH_INBOUND`: UInt = 4u;
public const val `FWPM_ENGINE_OPTION_PACKET_QUEUE_FORWARD`: UInt = 2u;
public const val `FWPM_ENGINE_OPTION_PACKET_QUEUE_INBOUND`: UInt = 1u;
public const val `FWPM_ENGINE_OPTION_PACKET_QUEUE_NONE`: UInt = 0u;
public const val `FWPM_ENGINE_PACKET_QUEUING`: `FWPM_ENGINE_OPTION` = 4;
public const val `FWPM_ENGINE_TXN_WATCHDOG_TIMEOUT_IN_MSEC`: `FWPM_ENGINE_OPTION` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_FIELD0` (
    public var `fieldKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `type`: `FWPM_FIELD_TYPE`,
    public var `dataType`: `FWP_DATA_TYPE`,
)
// UNSUPPORTED Rust 684:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_FIELD0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWPM_FIELD_FLAGS`: `FWPM_FIELD_TYPE` = 2;
public const val `FWPM_FIELD_IP_ADDRESS`: `FWPM_FIELD_TYPE` = 1;
public const val `FWPM_FIELD_RAW_DATA`: `FWPM_FIELD_TYPE` = 0;
public typealias `FWPM_FIELD_TYPE` = Int;
public const val `FWPM_FIELD_TYPE_MAX`: `FWPM_FIELD_TYPE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_FILTER0` (
    public var `filterKey`: `windows_sys`.`core`.`GUID`,
    public var `displayData`: `FWPM_DISPLAY_DATA0`,
    public var `flags`: `FWPM_FILTER_FLAGS`,
    public var `providerKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `providerData`: `FWP_BYTE_BLOB`,
    public var `layerKey`: `windows_sys`.`core`.`GUID`,
    public var `subLayerKey`: `windows_sys`.`core`.`GUID`,
    public var `weight`: `FWP_VALUE0`,
    public var `numFilterConditions`: UInt,
    public var `filterCondition`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FWPM_FILTER_CONDITION0`>?,
    public var `action`: `FWPM_ACTION0`,
    public var `Anonymous`: `FWPM_FILTER0_0`,
    public var `reserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `filterId`: ULong,
    public var `effectiveWeight`: `FWP_VALUE0`,
)
// UNSUPPORTED Rust 714:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_FILTER0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 720:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_FILTER0_0 {
//     pub rawContext: u64,
//     pub providerContextKey: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 727:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_FILTER0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FWPM_FILTER_CHANGE0` (
    public var `changeType`: `FWPM_CHANGE_TYPE`,
    public var `filterKey`: `windows_sys`.`core`.`GUID`,
    public var `filterId`: ULong,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FWPM_FILTER_CHANGE_CALLBACK0` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_FILTER_CHANGE0`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_FILTER_CONDITION0` (
    public var `fieldKey`: `windows_sys`.`core`.`GUID`,
    public var `matchType`: `FWP_MATCH_TYPE`,
    public var `conditionValue`: `FWP_CONDITION_VALUE0`,
)
// UNSUPPORTED Rust 749:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_FILTER_CONDITION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_FILTER_ENUM_TEMPLATE0` (
    public var `providerKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `layerKey`: `windows_sys`.`core`.`GUID`,
    public var `enumType`: `FWP_FILTER_ENUM_TYPE`,
    public var `flags`: UInt,
    public var `providerContextTemplate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FWPM_PROVIDER_CONTEXT_ENUM_TEMPLATE0`>?,
    public var `numFilterConditions`: UInt,
    public var `filterCondition`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FWPM_FILTER_CONDITION0`>?,
    public var `actionMask`: UInt,
    public var `calloutKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
)
// UNSUPPORTED Rust 769:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_FILTER_ENUM_TEMPLATE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FWPM_FILTER_FLAGS` = UInt;
public const val `FWPM_FILTER_FLAG_BOOTTIME`: `FWPM_FILTER_FLAGS` = 2u;
public const val `FWPM_FILTER_FLAG_CLEAR_ACTION_RIGHT`: `FWPM_FILTER_FLAGS` = 8u;
public const val `FWPM_FILTER_FLAG_DISABLED`: `FWPM_FILTER_FLAGS` = 32u;
public const val `FWPM_FILTER_FLAG_GAMEOS_ONLY`: UInt = 512u;
public const val `FWPM_FILTER_FLAG_HAS_PROVIDER_CONTEXT`: `FWPM_FILTER_FLAGS` = 4u;
public const val `FWPM_FILTER_FLAG_HAS_SECURITY_REALM_PROVIDER_CONTEXT`: UInt = 128u;
public const val `FWPM_FILTER_FLAG_INDEXED`: `FWPM_FILTER_FLAGS` = 64u;
public const val `FWPM_FILTER_FLAG_IPSEC_NO_ACQUIRE_INITIATE`: UInt = 2048u;
public const val `FWPM_FILTER_FLAG_NONE`: `FWPM_FILTER_FLAGS` = 0u;
public const val `FWPM_FILTER_FLAG_PERMIT_IF_CALLOUT_UNREGISTERED`: `FWPM_FILTER_FLAGS` = 16u;
public const val `FWPM_FILTER_FLAG_PERSISTENT`: `FWPM_FILTER_FLAGS` = 1u;
public const val `FWPM_FILTER_FLAG_RESERVED0`: UInt = 4096u;
public const val `FWPM_FILTER_FLAG_RESERVED1`: UInt = 8192u;
public const val `FWPM_FILTER_FLAG_SILENT_MODE`: UInt = 1024u;
public const val `FWPM_FILTER_FLAG_SYSTEMOS_ONLY`: UInt = 256u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_FILTER_SUBSCRIPTION0` (
    public var `enumTemplate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FWPM_FILTER_ENUM_TEMPLATE0`>?,
    public var `flags`: UInt,
    public var `sessionKey`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 799:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_FILTER_SUBSCRIPTION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWPM_GENERAL_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 8;
public const val `FWPM_IPSEC_AUTHIP_MM_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 6;
public const val `FWPM_IPSEC_AUTHIP_QM_TRANSPORT_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 3;
public const val `FWPM_IPSEC_AUTHIP_QM_TUNNEL_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 4;
public const val `FWPM_IPSEC_DOSP_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 11;
public const val `FWPM_IPSEC_IKEV2_MM_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 10;
public const val `FWPM_IPSEC_IKEV2_QM_TRANSPORT_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 12;
public const val `FWPM_IPSEC_IKEV2_QM_TUNNEL_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 9;
public const val `FWPM_IPSEC_IKE_MM_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 5;
public const val `FWPM_IPSEC_IKE_QM_TRANSPORT_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 1;
public const val `FWPM_IPSEC_IKE_QM_TUNNEL_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 2;
public const val `FWPM_IPSEC_KEYING_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 0;
// UNSUPPORTED Rust 817:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_KEYING_MODULE_AUTHIP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x11e3dae0_dd26_4590_857d_ab4b28d1a095);

// UNSUPPORTED Rust 818:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_KEYING_MODULE_IKE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa9bbf787_82a8_45bb_a400_5d7e5952c7a9);

// UNSUPPORTED Rust 819:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_KEYING_MODULE_IKEV2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x041792cc_8f07_419d_a394_716968cb1647);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_LAYER0` (
    public var `layerKey`: `windows_sys`.`core`.`GUID`,
    public var `displayData`: `FWPM_DISPLAY_DATA0`,
    public var `flags`: UInt,
    public var `numFields`: UInt,
    public var `field`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FWPM_FIELD0`>?,
    public var `defaultSubLayerKey`: `windows_sys`.`core`.`GUID`,
    public var `layerId`: UShort,
)
// UNSUPPORTED Rust 831:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_LAYER0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 836:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_AUTH_CONNECT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc38d57d1_05a7_4c33_904f_7fbceee60e82);

// UNSUPPORTED Rust 837:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_AUTH_CONNECT_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd632a801_f5ba_4ad6_96e3_607017d9836a);

// UNSUPPORTED Rust 838:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_AUTH_CONNECT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4a72393b_319f_44bc_84c3_ba54dcb3b6b4);

// UNSUPPORTED Rust 839:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_AUTH_CONNECT_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc97bc3b8_c9a3_4e33_8695_8e17aad4de09);

// UNSUPPORTED Rust 840:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_AUTH_LISTEN_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x88bb5dad_76d7_4227_9c71_df0a3ed7be7e);

// UNSUPPORTED Rust 841:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_AUTH_LISTEN_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x371dfada_9f26_45fd_b4eb_c29eb212893f);

// UNSUPPORTED Rust 842:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_AUTH_LISTEN_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7ac9de24_17dd_4814_b4bd_a9fbc95a321b);

// UNSUPPORTED Rust 843:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_AUTH_LISTEN_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x60703b07_63c8_48e9_ada3_12b1af40a617);

// UNSUPPORTED Rust 844:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_AUTH_RECV_ACCEPT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe1cd9fe7_f4b5_4273_96c0_592e487b8650);

// UNSUPPORTED Rust 845:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_AUTH_RECV_ACCEPT_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9eeaa99b_bd22_4227_919f_0073c63357b1);

// UNSUPPORTED Rust 846:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_AUTH_RECV_ACCEPT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa3b42c97_9f04_4672_b87e_cee9c483257f);

// UNSUPPORTED Rust 847:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_AUTH_RECV_ACCEPT_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x89455b97_dbe1_453f_a224_13da895af396);

// UNSUPPORTED Rust 848:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_BIND_REDIRECT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66978cad_c704_42ac_86ac_7c1a231bd253);

// UNSUPPORTED Rust 849:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_BIND_REDIRECT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbef02c9c_606b_4536_8c26_1c2fc7b631d4);

// UNSUPPORTED Rust 850:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_CONNECT_REDIRECT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc6e63c8c_b784_4562_aa7d_0a67cfcaf9a3);

// UNSUPPORTED Rust 851:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_CONNECT_REDIRECT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x587e54a7_8046_42ba_a0aa_b716250fc7fd);

// UNSUPPORTED Rust 852:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_ENDPOINT_CLOSURE_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb4766427_e2a2_467a_bd7e_dbcd1bd85a09);

// UNSUPPORTED Rust 853:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_ENDPOINT_CLOSURE_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbb536ccd_4755_4ba9_9ff7_f9edf8699c7b);

// UNSUPPORTED Rust 854:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_FLOW_ESTABLISHED_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaf80470a_5596_4c13_9992_539e6fe57967);

// UNSUPPORTED Rust 855:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_FLOW_ESTABLISHED_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x146ae4a9_a1d2_4d43_a31a_4c42682b8e4f);

// UNSUPPORTED Rust 856:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_FLOW_ESTABLISHED_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7021d2b3_dfa4_406e_afeb_6afaf7e70efd);

// UNSUPPORTED Rust 857:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_FLOW_ESTABLISHED_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x46928636_bbca_4b76_941d_0fa7f5d7d372);

// UNSUPPORTED Rust 858:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_RESOURCE_ASSIGNMENT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1247d66d_0b60_4a15_8d44_7155d0f53a0c);

// UNSUPPORTED Rust 859:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_RESOURCE_ASSIGNMENT_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0b5812a2_c3ff_4eca_b88d_c79e20ac6322);

// UNSUPPORTED Rust 860:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_RESOURCE_ASSIGNMENT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x55a650e1_5f0a_4eca_a653_88f53b26aa8c);

// UNSUPPORTED Rust 861:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_RESOURCE_ASSIGNMENT_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcbc998bb_c51f_4c1a_bb4f_9775fcacab2f);

// UNSUPPORTED Rust 862:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_RESOURCE_RELEASE_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x74365cce_ccb0_401a_bfc1_b89934ad7e15);

// UNSUPPORTED Rust 863:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_ALE_RESOURCE_RELEASE_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf4e5ce80_edcc_4e13_8a2f_b91454bb057b);

// UNSUPPORTED Rust 864:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_DATAGRAM_DATA_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3d08bf4e_45f6_4930_a922_417098e20027);

// UNSUPPORTED Rust 865:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_DATAGRAM_DATA_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x18e330c6_7248_4e52_aaab_472ed67704fd);

// UNSUPPORTED Rust 866:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_DATAGRAM_DATA_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfa45fe2f_3cba_4427_87fc_57b9a4b10d00);

// UNSUPPORTED Rust 867:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_DATAGRAM_DATA_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x09d1dfe1_9b86_4a42_be9d_8c315b92a5d0);

// UNSUPPORTED Rust 868:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_EGRESS_VSWITCH_ETHERNET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x86c872b0_76fa_4b79_93a4_0750530ae292);

// UNSUPPORTED Rust 869:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_EGRESS_VSWITCH_TRANSPORT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb92350b6_91f0_46b6_bdc4_871dfd4a7c98);

// UNSUPPORTED Rust 870:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_EGRESS_VSWITCH_TRANSPORT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1b2def23_1881_40bd_82f4_4254e63141cb);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FWPM_LAYER_ENUM_TEMPLATE0` (
    public var `reserved`: ULong,
)
public const val `FWPM_LAYER_FLAG_BUFFERED`: UInt = 8u;
public const val `FWPM_LAYER_FLAG_BUILTIN`: UInt = 2u;
public const val `FWPM_LAYER_FLAG_CLASSIFY_MOSTLY`: UInt = 4u;
public const val `FWPM_LAYER_FLAG_KERNEL`: UInt = 1u;
// UNSUPPORTED Rust 880:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_IKEEXT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb14b7bdb_dbbd_473e_bed4_8b4708d4f270);

// UNSUPPORTED Rust 881:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_IKEEXT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb64786b3_f687_4eb9_89d2_8ef32acdabe2);

// UNSUPPORTED Rust 882:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_INBOUND_ICMP_ERROR_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x61499990_3cb6_4e84_b950_53b94b6964f3);

// UNSUPPORTED Rust 883:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_INBOUND_ICMP_ERROR_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa6b17075_ebaf_4053_a4e7_213c8121ede5);

// UNSUPPORTED Rust 884:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_INBOUND_ICMP_ERROR_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x65f9bdff_3b2d_4e5d_b8c6_c720651fe898);

// UNSUPPORTED Rust 885:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_INBOUND_ICMP_ERROR_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa6e7ccc0_08fb_468d_a472_9771d5595e09);

// UNSUPPORTED Rust 886:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_INBOUND_IPPACKET_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc86fd1bf_21cd_497e_a0bb_17425c885c58);

// UNSUPPORTED Rust 887:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_INBOUND_IPPACKET_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb5a230d0_a8c0_44f2_916e_991b53ded1f7);

// UNSUPPORTED Rust 888:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_INBOUND_IPPACKET_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf52032cb_991c_46e7_971d_2601459a91ca);

// UNSUPPORTED Rust 889:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_INBOUND_IPPACKET_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbb24c279_93b4_47a2_83ad_ae1698b50885);

// UNSUPPORTED Rust 890:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_INBOUND_MAC_FRAME_ETHERNET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeffb7edb_0055_4f9a_a231_4ff8131ad191);

// UNSUPPORTED Rust 891:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_INBOUND_MAC_FRAME_NATIVE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd4220bd3_62ce_4f08_ae88_b56e8526df50);

// UNSUPPORTED Rust 892:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_INBOUND_MAC_FRAME_NATIVE_FAST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x853aaa8e_2b78_4d24_a804_36db08b29711);

// UNSUPPORTED Rust 893:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_INBOUND_RESERVED2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf4fb8d55_c076_46d8_a2c7_6a4c722ca4ed);

// UNSUPPORTED Rust 894:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_INBOUND_TRANSPORT_FAST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe41d2719_05c7_40f0_8983_ea8d17bbc2f6);

// UNSUPPORTED Rust 895:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_INBOUND_TRANSPORT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5926dfc8_e3cf_4426_a283_dc393f5d0f9d);

// UNSUPPORTED Rust 896:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_INBOUND_TRANSPORT_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xac4a9833_f69d_4648_b261_6dc84835ef39);

// UNSUPPORTED Rust 897:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_INBOUND_TRANSPORT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x634a869f_fc23_4b90_b0c1_bf620a36ae6f);

// UNSUPPORTED Rust 898:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_INBOUND_TRANSPORT_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2a6ff955_3b2b_49d2_9848_ad9d72dcaab7);

// UNSUPPORTED Rust 899:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_INGRESS_VSWITCH_ETHERNET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7d98577a_9a87_41ec_9718_7cf589c9f32d);

// UNSUPPORTED Rust 900:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_INGRESS_VSWITCH_TRANSPORT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb2696ff6_774f_4554_9f7d_3da3945f8e85);

// UNSUPPORTED Rust 901:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_INGRESS_VSWITCH_TRANSPORT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ee314fc_7d8a_47f4_b7e3_291a36da4e12);

// UNSUPPORTED Rust 902:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_IPFORWARD_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa82acc24_4ee1_4ee1_b465_fd1d25cb10a4);

// UNSUPPORTED Rust 903:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_IPFORWARD_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9e9ea773_2fae_4210_8f17_34129ef369eb);

// UNSUPPORTED Rust 904:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_IPFORWARD_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7b964818_19c7_493a_b71f_832c3684d28c);

// UNSUPPORTED Rust 905:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_IPFORWARD_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x31524a5d_1dfe_472f_bb93_518ee945d8a2);

// UNSUPPORTED Rust 906:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_IPSEC_KM_DEMUX_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf02b1526_a459_4a51_b9e3_759de52b9d2c);

// UNSUPPORTED Rust 907:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_IPSEC_KM_DEMUX_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2f755cf6_2fd4_4e88_b3e4_a91bca495235);

// UNSUPPORTED Rust 908:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_IPSEC_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeda65c74_610d_4bc5_948f_3c4f89556867);

// UNSUPPORTED Rust 909:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_IPSEC_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13c48442_8d87_4261_9a29_59d2abc348b4);

// UNSUPPORTED Rust 910:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_KM_AUTHORIZATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4aa226e9_9020_45fb_956a_c0249d841195);

// UNSUPPORTED Rust 911:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_NAME_RESOLUTION_CACHE_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0c2aa681_905b_4ccd_a467_4dd811d07b7b);

// UNSUPPORTED Rust 912:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_NAME_RESOLUTION_CACHE_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x92d592fa_6b01_434a_9dea_d1e96ea97da9);

// UNSUPPORTED Rust 913:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_OUTBOUND_ICMP_ERROR_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x41390100_564c_4b32_bc1d_718048354d7c);

// UNSUPPORTED Rust 914:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_OUTBOUND_ICMP_ERROR_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb3598d36_0561_4588_a6bf_e955e3f6264b);

// UNSUPPORTED Rust 915:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_OUTBOUND_ICMP_ERROR_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7fb03b60_7b8d_4dfa_badd_980176fc4e12);

// UNSUPPORTED Rust 916:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_OUTBOUND_ICMP_ERROR_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x65f2e647_8d0c_4f47_b19b_33a4d3f1357c);

// UNSUPPORTED Rust 917:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_OUTBOUND_IPPACKET_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1e5c9fae_8a84_4135_a331_950b54229ecd);

// UNSUPPORTED Rust 918:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_OUTBOUND_IPPACKET_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x08e4bcb5_b647_48f3_953c_e5ddbd03937e);

// UNSUPPORTED Rust 919:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_OUTBOUND_IPPACKET_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa3b3ab6b_3564_488c_9117_f34e82142763);

// UNSUPPORTED Rust 920:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_OUTBOUND_IPPACKET_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9513d7c4_a934_49dc_91a7_6ccb80cc02e3);

// UNSUPPORTED Rust 921:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_OUTBOUND_MAC_FRAME_ETHERNET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x694673bc_d6db_4870_adee_0acdbdb7f4b2);

// UNSUPPORTED Rust 922:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_OUTBOUND_MAC_FRAME_NATIVE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x94c44912_9d6f_4ebf_b995_05ab8a088d1b);

// UNSUPPORTED Rust 923:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_OUTBOUND_MAC_FRAME_NATIVE_FAST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x470df946_c962_486f_9446_8293cbc75eb8);

// UNSUPPORTED Rust 924:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_OUTBOUND_NETWORK_CONNECTION_POLICY_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x037f317a_d696_494a_bba5_bffc265e6052);

// UNSUPPORTED Rust 925:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_OUTBOUND_NETWORK_CONNECTION_POLICY_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x22a4fdb1_6d7e_48ae_ae77_3742525c3119);

// UNSUPPORTED Rust 926:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_OUTBOUND_TRANSPORT_FAST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13ed4388_a070_4815_9935_7a9be6408b78);

// UNSUPPORTED Rust 927:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_OUTBOUND_TRANSPORT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x09e61aea_d214_46e2_9b21_b26b0b2f28c8);

// UNSUPPORTED Rust 928:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_OUTBOUND_TRANSPORT_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc5f10551_bdb0_43d7_a313_50e211f4d68a);

// UNSUPPORTED Rust 929:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_OUTBOUND_TRANSPORT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe1735bde_013f_4655_b351_a49e15762df0);

// UNSUPPORTED Rust 930:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_OUTBOUND_TRANSPORT_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf433df69_ccbd_482e_b9b2_57165658c3b3);

// UNSUPPORTED Rust 931:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_RPC_EPMAP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9247bc61_eb07_47ee_872c_bfd78bfd1616);

// UNSUPPORTED Rust 932:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_RPC_EP_ADD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x618dffc7_c450_4943_95db_99b4c16a55d4);

// UNSUPPORTED Rust 933:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_RPC_PROXY_CONN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x94a4b50b_ba5c_4f27_907a_229fac0c2a7a);

// UNSUPPORTED Rust 934:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_RPC_PROXY_IF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf8a38615_e12c_41ac_98df_121ad981aade);

// UNSUPPORTED Rust 935:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_RPC_UM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x75a89dda_95e4_40f3_adc7_7688a9c847e1);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FWPM_LAYER_STATISTICS0` (
    public var `layerId`: `windows_sys`.`core`.`GUID`,
    public var `classifyPermitCount`: UInt,
    public var `classifyBlockCount`: UInt,
    public var `classifyVetoCount`: UInt,
    public var `numCacheEntries`: UInt,
)
// UNSUPPORTED Rust 945:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_STREAM_PACKET_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaf52d8ec_cb2d_44e5_ad92_f8dc38d2eb29);

// UNSUPPORTED Rust 946:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_STREAM_PACKET_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x779a8ca3_f099_468f_b5d4_83535c461c02);

// UNSUPPORTED Rust 947:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_STREAM_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3b89653c_c170_49e4_b1cd_e0eeeee19a3e);

// UNSUPPORTED Rust 948:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_STREAM_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x25c4c2c2_25ff_4352_82f9_c54a4a4726dc);

// UNSUPPORTED Rust 949:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_STREAM_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x47c9137a_7ec4_46b3_b6e4_48e926b1eda4);

// UNSUPPORTED Rust 950:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_LAYER_STREAM_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x10a59fc7_b628_4c41_9eb8_cf37d55103cf);

public const val `FWPM_NETWORK_CONNECTION_POLICY_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 13;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_NETWORK_CONNECTION_POLICY_SETTING0` (
    public var `type`: `FWP_NETWORK_CONNECTION_POLICY_SETTING_TYPE`,
    public var `value`: `FWP_VALUE0`,
)
// UNSUPPORTED Rust 959:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NETWORK_CONNECTION_POLICY_SETTING0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_NETWORK_CONNECTION_POLICY_SETTINGS0` (
    public var `numSettings`: UInt,
    public var `settings`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FWPM_NETWORK_CONNECTION_POLICY_SETTING0`>?,
)
// UNSUPPORTED Rust 972:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NETWORK_CONNECTION_POLICY_SETTINGS0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_NET_EVENT0` (
    public var `header`: `FWPM_NET_EVENT_HEADER0`,
    public var `type`: `FWPM_NET_EVENT_TYPE`,
    public var `Anonymous`: `FWPM_NET_EVENT0_0`,
)
// UNSUPPORTED Rust 986:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 992:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT0_0 {
//     pub ikeMmFailure: *mut FWPM_NET_EVENT_IKEEXT_MM_FAILURE0,
//     pub ikeQmFailure: *mut FWPM_NET_EVENT_IKEEXT_QM_FAILURE0,
//     pub ikeEmFailure: *mut FWPM_NET_EVENT_IKEEXT_EM_FAILURE0,
//     pub classifyDrop: *mut FWPM_NET_EVENT_CLASSIFY_DROP0,
//     pub ipsecDrop: *mut FWPM_NET_EVENT_IPSEC_KERNEL_DROP0,
//     pub idpDrop: *mut FWPM_NET_EVENT_IPSEC_DOSP_DROP0,
// }

// UNSUPPORTED Rust 1003:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_NET_EVENT1` (
    public var `header`: `FWPM_NET_EVENT_HEADER1`,
    public var `type`: `FWPM_NET_EVENT_TYPE`,
    public var `Anonymous`: `FWPM_NET_EVENT1_0`,
)
// UNSUPPORTED Rust 1017:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1023:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT1_0 {
//     pub ikeMmFailure: *mut FWPM_NET_EVENT_IKEEXT_MM_FAILURE1,
//     pub ikeQmFailure: *mut FWPM_NET_EVENT_IKEEXT_QM_FAILURE0,
//     pub ikeEmFailure: *mut FWPM_NET_EVENT_IKEEXT_EM_FAILURE1,
//     pub classifyDrop: *mut FWPM_NET_EVENT_CLASSIFY_DROP1,
//     pub ipsecDrop: *mut FWPM_NET_EVENT_IPSEC_KERNEL_DROP0,
//     pub idpDrop: *mut FWPM_NET_EVENT_IPSEC_DOSP_DROP0,
// }

// UNSUPPORTED Rust 1034:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_NET_EVENT2` (
    public var `header`: `FWPM_NET_EVENT_HEADER2`,
    public var `type`: `FWPM_NET_EVENT_TYPE`,
    public var `Anonymous`: `FWPM_NET_EVENT2_0`,
)
// UNSUPPORTED Rust 1048:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1054:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT2_0 {
//     pub ikeMmFailure: *mut FWPM_NET_EVENT_IKEEXT_MM_FAILURE1,
//     pub ikeQmFailure: *mut FWPM_NET_EVENT_IKEEXT_QM_FAILURE0,
//     pub ikeEmFailure: *mut FWPM_NET_EVENT_IKEEXT_EM_FAILURE1,
//     pub classifyDrop: *mut FWPM_NET_EVENT_CLASSIFY_DROP2,
//     pub ipsecDrop: *mut FWPM_NET_EVENT_IPSEC_KERNEL_DROP0,
//     pub idpDrop: *mut FWPM_NET_EVENT_IPSEC_DOSP_DROP0,
//     pub classifyAllow: *mut FWPM_NET_EVENT_CLASSIFY_ALLOW0,
//     pub capabilityDrop: *mut FWPM_NET_EVENT_CAPABILITY_DROP0,
//     pub capabilityAllow: *mut FWPM_NET_EVENT_CAPABILITY_ALLOW0,
//     pub classifyDropMac: *mut FWPM_NET_EVENT_CLASSIFY_DROP_MAC0,
// }

// UNSUPPORTED Rust 1069:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_NET_EVENT3` (
    public var `header`: `FWPM_NET_EVENT_HEADER3`,
    public var `type`: `FWPM_NET_EVENT_TYPE`,
    public var `Anonymous`: `FWPM_NET_EVENT3_0`,
)
// UNSUPPORTED Rust 1083:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1089:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT3_0 {
//     pub ikeMmFailure: *mut FWPM_NET_EVENT_IKEEXT_MM_FAILURE1,
//     pub ikeQmFailure: *mut FWPM_NET_EVENT_IKEEXT_QM_FAILURE0,
//     pub ikeEmFailure: *mut FWPM_NET_EVENT_IKEEXT_EM_FAILURE1,
//     pub classifyDrop: *mut FWPM_NET_EVENT_CLASSIFY_DROP2,
//     pub ipsecDrop: *mut FWPM_NET_EVENT_IPSEC_KERNEL_DROP0,
//     pub idpDrop: *mut FWPM_NET_EVENT_IPSEC_DOSP_DROP0,
//     pub classifyAllow: *mut FWPM_NET_EVENT_CLASSIFY_ALLOW0,
//     pub capabilityDrop: *mut FWPM_NET_EVENT_CAPABILITY_DROP0,
//     pub capabilityAllow: *mut FWPM_NET_EVENT_CAPABILITY_ALLOW0,
//     pub classifyDropMac: *mut FWPM_NET_EVENT_CLASSIFY_DROP_MAC0,
// }

// UNSUPPORTED Rust 1104:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT3_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_NET_EVENT4` (
    public var `header`: `FWPM_NET_EVENT_HEADER3`,
    public var `type`: `FWPM_NET_EVENT_TYPE`,
    public var `Anonymous`: `FWPM_NET_EVENT4_0`,
)
// UNSUPPORTED Rust 1118:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1124:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT4_0 {
//     pub ikeMmFailure: *mut FWPM_NET_EVENT_IKEEXT_MM_FAILURE2,
//     pub ikeQmFailure: *mut FWPM_NET_EVENT_IKEEXT_QM_FAILURE1,
//     pub ikeEmFailure: *mut FWPM_NET_EVENT_IKEEXT_EM_FAILURE1,
//     pub classifyDrop: *mut FWPM_NET_EVENT_CLASSIFY_DROP2,
//     pub ipsecDrop: *mut FWPM_NET_EVENT_IPSEC_KERNEL_DROP0,
//     pub idpDrop: *mut FWPM_NET_EVENT_IPSEC_DOSP_DROP0,
//     pub classifyAllow: *mut FWPM_NET_EVENT_CLASSIFY_ALLOW0,
//     pub capabilityDrop: *mut FWPM_NET_EVENT_CAPABILITY_DROP0,
//     pub capabilityAllow: *mut FWPM_NET_EVENT_CAPABILITY_ALLOW0,
//     pub classifyDropMac: *mut FWPM_NET_EVENT_CLASSIFY_DROP_MAC0,
// }

// UNSUPPORTED Rust 1139:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT4_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_NET_EVENT5` (
    public var `header`: `FWPM_NET_EVENT_HEADER3`,
    public var `type`: `FWPM_NET_EVENT_TYPE`,
    public var `Anonymous`: `FWPM_NET_EVENT5_0`,
)
// UNSUPPORTED Rust 1153:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1159:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT5_0 {
//     pub ikeMmFailure: *mut FWPM_NET_EVENT_IKEEXT_MM_FAILURE2,
//     pub ikeQmFailure: *mut FWPM_NET_EVENT_IKEEXT_QM_FAILURE1,
//     pub ikeEmFailure: *mut FWPM_NET_EVENT_IKEEXT_EM_FAILURE1,
//     pub classifyDrop: *mut FWPM_NET_EVENT_CLASSIFY_DROP2,
//     pub ipsecDrop: *mut FWPM_NET_EVENT_IPSEC_KERNEL_DROP0,
//     pub idpDrop: *mut FWPM_NET_EVENT_IPSEC_DOSP_DROP0,
//     pub classifyAllow: *mut FWPM_NET_EVENT_CLASSIFY_ALLOW0,
//     pub capabilityDrop: *mut FWPM_NET_EVENT_CAPABILITY_DROP0,
//     pub capabilityAllow: *mut FWPM_NET_EVENT_CAPABILITY_ALLOW0,
//     pub classifyDropMac: *mut FWPM_NET_EVENT_CLASSIFY_DROP_MAC0,
//     pub lpmPacketArrival: *mut FWPM_NET_EVENT_LPM_PACKET_ARRIVAL0,
// }

// UNSUPPORTED Rust 1175:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT5_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public typealias `FWPM_NET_EVENT_CALLBACK0` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_NET_EVENT1`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public typealias `FWPM_NET_EVENT_CALLBACK1` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_NET_EVENT2`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public typealias `FWPM_NET_EVENT_CALLBACK2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_NET_EVENT3`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public typealias `FWPM_NET_EVENT_CALLBACK3` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_NET_EVENT4`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public typealias `FWPM_NET_EVENT_CALLBACK4` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_NET_EVENT5`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FWPM_NET_EVENT_CAPABILITY_ALLOW0` (
    public var `networkCapabilityId`: `FWPM_APPC_NETWORK_CAPABILITY_TYPE`,
    public var `filterId`: ULong,
    public var `isLoopback`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FWPM_NET_EVENT_CAPABILITY_DROP0` (
    public var `networkCapabilityId`: `FWPM_APPC_NETWORK_CAPABILITY_TYPE`,
    public var `filterId`: ULong,
    public var `isLoopback`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FWPM_NET_EVENT_CLASSIFY_ALLOW0` (
    public var `filterId`: ULong,
    public var `layerId`: UShort,
    public var `reauthReason`: UInt,
    public var `originalProfile`: UInt,
    public var `currentProfile`: UInt,
    public var `msFwpDirection`: UInt,
    public var `isLoopback`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FWPM_NET_EVENT_CLASSIFY_DROP0` (
    public var `filterId`: ULong,
    public var `layerId`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FWPM_NET_EVENT_CLASSIFY_DROP1` (
    public var `filterId`: ULong,
    public var `layerId`: UShort,
    public var `reauthReason`: UInt,
    public var `originalProfile`: UInt,
    public var `currentProfile`: UInt,
    public var `msFwpDirection`: UInt,
    public var `isLoopback`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FWPM_NET_EVENT_CLASSIFY_DROP2` (
    public var `filterId`: ULong,
    public var `layerId`: UShort,
    public var `reauthReason`: UInt,
    public var `originalProfile`: UInt,
    public var `currentProfile`: UInt,
    public var `msFwpDirection`: UInt,
    public var `isLoopback`: `windows_sys`.`core`.`BOOL`,
    public var `vSwitchId`: `FWP_BYTE_BLOB`,
    public var `vSwitchSourcePort`: UInt,
    public var `vSwitchDestinationPort`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FWPM_NET_EVENT_CLASSIFY_DROP_MAC0` (
    public var `localMacAddr`: `FWP_BYTE_ARRAY6`,
    public var `remoteMacAddr`: `FWP_BYTE_ARRAY6`,
    public var `mediaType`: UInt,
    public var `ifType`: UInt,
    public var `etherType`: UShort,
    public var `ndisPortNumber`: UInt,
    public var `reserved`: UInt,
    public var `vlanTag`: UShort,
    public var `ifLuid`: ULong,
    public var `filterId`: ULong,
    public var `layerId`: UShort,
    public var `reauthReason`: UInt,
    public var `originalProfile`: UInt,
    public var `currentProfile`: UInt,
    public var `msFwpDirection`: UInt,
    public var `isLoopback`: `windows_sys`.`core`.`BOOL`,
    public var `vSwitchId`: `FWP_BYTE_BLOB`,
    public var `vSwitchSourcePort`: UInt,
    public var `vSwitchDestinationPort`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_NET_EVENT_ENUM_TEMPLATE0` (
    public var `startTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `endTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `numFilterConditions`: UInt,
    public var `filterCondition`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FWPM_FILTER_CONDITION0`>?,
)
// UNSUPPORTED Rust 1279:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_ENUM_TEMPLATE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWPM_NET_EVENT_FLAG_APP_ID_SET`: UInt = 32u;
public const val `FWPM_NET_EVENT_FLAG_EFFECTIVE_NAME_SET`: UInt = 8192u;
public const val `FWPM_NET_EVENT_FLAG_ENTERPRISE_ID_SET`: UInt = 2048u;
public const val `FWPM_NET_EVENT_FLAG_IP_PROTOCOL_SET`: UInt = 1u;
public const val `FWPM_NET_EVENT_FLAG_IP_VERSION_SET`: UInt = 256u;
public const val `FWPM_NET_EVENT_FLAG_LOCAL_ADDR_SET`: UInt = 2u;
public const val `FWPM_NET_EVENT_FLAG_LOCAL_PORT_SET`: UInt = 8u;
public const val `FWPM_NET_EVENT_FLAG_PACKAGE_ID_SET`: UInt = 1024u;
public const val `FWPM_NET_EVENT_FLAG_POLICY_FLAGS_SET`: UInt = 4096u;
public const val `FWPM_NET_EVENT_FLAG_REAUTH_REASON_SET`: UInt = 512u;
public const val `FWPM_NET_EVENT_FLAG_REMOTE_ADDR_SET`: UInt = 4u;
public const val `FWPM_NET_EVENT_FLAG_REMOTE_PORT_SET`: UInt = 16u;
public const val `FWPM_NET_EVENT_FLAG_SCOPE_ID_SET`: UInt = 128u;
public const val `FWPM_NET_EVENT_FLAG_USER_ID_SET`: UInt = 64u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_NET_EVENT_HEADER0` (
    public var `timeStamp`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `flags`: UInt,
    public var `ipVersion`: `FWP_IP_VERSION`,
    public var `ipProtocol`: UByte,
    public var `Anonymous1`: `FWPM_NET_EVENT_HEADER0_0`,
    public var `Anonymous2`: `FWPM_NET_EVENT_HEADER0_1`,
    public var `localPort`: UShort,
    public var `remotePort`: UShort,
    public var `scopeId`: UInt,
    public var `appId`: `FWP_BYTE_BLOB`,
    public var `userId`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?,
)
// UNSUPPORTED Rust 1315:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1321:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_HEADER0_0 {
//     pub localAddrV4: u32,
//     pub localAddrV6: FWP_BYTE_ARRAY16,
// }

// UNSUPPORTED Rust 1328:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1334:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_HEADER0_1 {
//     pub remoteAddrV4: u32,
//     pub remoteAddrV6: FWP_BYTE_ARRAY16,
// }

// UNSUPPORTED Rust 1341:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_NET_EVENT_HEADER1` (
    public var `timeStamp`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `flags`: UInt,
    public var `ipVersion`: `FWP_IP_VERSION`,
    public var `ipProtocol`: UByte,
    public var `Anonymous1`: `FWPM_NET_EVENT_HEADER1_0`,
    public var `Anonymous2`: `FWPM_NET_EVENT_HEADER1_1`,
    public var `localPort`: UShort,
    public var `remotePort`: UShort,
    public var `scopeId`: UInt,
    public var `appId`: `FWP_BYTE_BLOB`,
    public var `userId`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?,
    public var `Anonymous3`: `FWPM_NET_EVENT_HEADER1_2`,
)
// UNSUPPORTED Rust 1364:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1370:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_HEADER1_0 {
//     pub localAddrV4: u32,
//     pub localAddrV6: FWP_BYTE_ARRAY16,
// }

// UNSUPPORTED Rust 1377:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1383:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_HEADER1_1 {
//     pub remoteAddrV4: u32,
//     pub remoteAddrV6: FWP_BYTE_ARRAY16,
// }

// UNSUPPORTED Rust 1390:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER1_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1396:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_HEADER1_2 {
//     pub Anonymous: FWPM_NET_EVENT_HEADER1_2_0,
// }

// UNSUPPORTED Rust 1402:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER1_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_NET_EVENT_HEADER1_2_0` (
    public var `reserved1`: `FWP_AF`,
    public var `Anonymous`: `FWPM_NET_EVENT_HEADER1_2_0_0`,
)
// UNSUPPORTED Rust 1415:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER1_2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1421:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_HEADER1_2_0_0 {
//     pub Anonymous: FWPM_NET_EVENT_HEADER1_2_0_0_0,
// }

// UNSUPPORTED Rust 1427:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER1_2_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FWPM_NET_EVENT_HEADER1_2_0_0_0` (
    public var `reserved2`: `FWP_BYTE_ARRAY6`,
    public var `reserved3`: `FWP_BYTE_ARRAY6`,
    public var `reserved4`: UInt,
    public var `reserved5`: UInt,
    public var `reserved6`: UShort,
    public var `reserved7`: UInt,
    public var `reserved8`: UInt,
    public var `reserved9`: UShort,
    public var `reserved10`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_NET_EVENT_HEADER2` (
    public var `timeStamp`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `flags`: UInt,
    public var `ipVersion`: `FWP_IP_VERSION`,
    public var `ipProtocol`: UByte,
    public var `Anonymous1`: `FWPM_NET_EVENT_HEADER2_0`,
    public var `Anonymous2`: `FWPM_NET_EVENT_HEADER2_1`,
    public var `localPort`: UShort,
    public var `remotePort`: UShort,
    public var `scopeId`: UInt,
    public var `appId`: `FWP_BYTE_BLOB`,
    public var `userId`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?,
    public var `addressFamily`: `FWP_AF`,
    public var `packageSid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?,
)
// UNSUPPORTED Rust 1465:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1471:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_HEADER2_0 {
//     pub localAddrV4: u32,
//     pub localAddrV6: FWP_BYTE_ARRAY16,
// }

// UNSUPPORTED Rust 1478:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1484:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_HEADER2_1 {
//     pub remoteAddrV4: u32,
//     pub remoteAddrV6: FWP_BYTE_ARRAY16,
// }

// UNSUPPORTED Rust 1491:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER2_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_NET_EVENT_HEADER3` (
    public var `timeStamp`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `flags`: UInt,
    public var `ipVersion`: `FWP_IP_VERSION`,
    public var `ipProtocol`: UByte,
    public var `Anonymous1`: `FWPM_NET_EVENT_HEADER3_0`,
    public var `Anonymous2`: `FWPM_NET_EVENT_HEADER3_1`,
    public var `localPort`: UShort,
    public var `remotePort`: UShort,
    public var `scopeId`: UInt,
    public var `appId`: `FWP_BYTE_BLOB`,
    public var `userId`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?,
    public var `addressFamily`: `FWP_AF`,
    public var `packageSid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?,
    public var `enterpriseId`: `windows_sys`.`core`.`PWSTR`,
    public var `policyFlags`: ULong,
    public var `effectiveName`: `FWP_BYTE_BLOB`,
)
// UNSUPPORTED Rust 1518:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1524:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_HEADER3_0 {
//     pub localAddrV4: u32,
//     pub localAddrV6: FWP_BYTE_ARRAY16,
// }

// UNSUPPORTED Rust 1531:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER3_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1537:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_HEADER3_1 {
//     pub remoteAddrV4: u32,
//     pub remoteAddrV6: FWP_BYTE_ARRAY16,
// }

// UNSUPPORTED Rust 1544:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER3_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 20 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_NET_EVENT_IKEEXT_EM_FAILURE0` (
    public var `failureErrorCode`: UInt,
    public var `failurePoint`: `IPSEC_FAILURE_POINT`,
    public var `flags`: UInt,
    public var `emState`: `IKEEXT_EM_SA_STATE`,
    public var `saRole`: `IKEEXT_SA_ROLE`,
    public var `emAuthMethod`: `IKEEXT_AUTHENTICATION_METHOD_TYPE`,
    public var `endCertHash`: UByteArray,
    public var `mmId`: ULong,
    public var `qmFilterId`: ULong,
)
// UNSUPPORTED Rust 1563:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_NET_EVENT_IKEEXT_EM_FAILURE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 20 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_NET_EVENT_IKEEXT_EM_FAILURE1` (
    public var `failureErrorCode`: UInt,
    public var `failurePoint`: `IPSEC_FAILURE_POINT`,
    public var `flags`: UInt,
    public var `emState`: `IKEEXT_EM_SA_STATE`,
    public var `saRole`: `IKEEXT_SA_ROLE`,
    public var `emAuthMethod`: `IKEEXT_AUTHENTICATION_METHOD_TYPE`,
    public var `endCertHash`: UByteArray,
    public var `mmId`: ULong,
    public var `qmFilterId`: ULong,
    public var `localPrincipalNameForAuth`: `windows_sys`.`core`.`PWSTR`,
    public var `remotePrincipalNameForAuth`: `windows_sys`.`core`.`PWSTR`,
    public var `numLocalPrincipalGroupSids`: UInt,
    public var `localPrincipalGroupSids`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?,
    public var `numRemotePrincipalGroupSids`: UInt,
    public var `remotePrincipalGroupSids`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?,
    public var `saTrafficType`: `IPSEC_TRAFFIC_TYPE`,
)
// UNSUPPORTED Rust 1588:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_NET_EVENT_IKEEXT_EM_FAILURE1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWPM_NET_EVENT_IKEEXT_EM_FAILURE_FLAG_BENIGN`: UInt = 2u;
public const val `FWPM_NET_EVENT_IKEEXT_EM_FAILURE_FLAG_MULTIPLE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 20 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_NET_EVENT_IKEEXT_MM_FAILURE0` (
    public var `failureErrorCode`: UInt,
    public var `failurePoint`: `IPSEC_FAILURE_POINT`,
    public var `flags`: UInt,
    public var `keyingModuleType`: `IKEEXT_KEY_MODULE_TYPE`,
    public var `mmState`: `IKEEXT_MM_SA_STATE`,
    public var `saRole`: `IKEEXT_SA_ROLE`,
    public var `mmAuthMethod`: `IKEEXT_AUTHENTICATION_METHOD_TYPE`,
    public var `endCertHash`: UByteArray,
    public var `mmId`: ULong,
    public var `mmFilterId`: ULong,
)
// UNSUPPORTED Rust 1609:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_NET_EVENT_IKEEXT_MM_FAILURE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 20 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_NET_EVENT_IKEEXT_MM_FAILURE1` (
    public var `failureErrorCode`: UInt,
    public var `failurePoint`: `IPSEC_FAILURE_POINT`,
    public var `flags`: UInt,
    public var `keyingModuleType`: `IKEEXT_KEY_MODULE_TYPE`,
    public var `mmState`: `IKEEXT_MM_SA_STATE`,
    public var `saRole`: `IKEEXT_SA_ROLE`,
    public var `mmAuthMethod`: `IKEEXT_AUTHENTICATION_METHOD_TYPE`,
    public var `endCertHash`: UByteArray,
    public var `mmId`: ULong,
    public var `mmFilterId`: ULong,
    public var `localPrincipalNameForAuth`: `windows_sys`.`core`.`PWSTR`,
    public var `remotePrincipalNameForAuth`: `windows_sys`.`core`.`PWSTR`,
    public var `numLocalPrincipalGroupSids`: UInt,
    public var `localPrincipalGroupSids`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?,
    public var `numRemotePrincipalGroupSids`: UInt,
    public var `remotePrincipalGroupSids`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?,
)
// UNSUPPORTED Rust 1634:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_NET_EVENT_IKEEXT_MM_FAILURE1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 20 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_NET_EVENT_IKEEXT_MM_FAILURE2` (
    public var `failureErrorCode`: UInt,
    public var `failurePoint`: `IPSEC_FAILURE_POINT`,
    public var `flags`: UInt,
    public var `keyingModuleType`: `IKEEXT_KEY_MODULE_TYPE`,
    public var `mmState`: `IKEEXT_MM_SA_STATE`,
    public var `saRole`: `IKEEXT_SA_ROLE`,
    public var `mmAuthMethod`: `IKEEXT_AUTHENTICATION_METHOD_TYPE`,
    public var `endCertHash`: UByteArray,
    public var `mmId`: ULong,
    public var `mmFilterId`: ULong,
    public var `localPrincipalNameForAuth`: `windows_sys`.`core`.`PWSTR`,
    public var `remotePrincipalNameForAuth`: `windows_sys`.`core`.`PWSTR`,
    public var `numLocalPrincipalGroupSids`: UInt,
    public var `localPrincipalGroupSids`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?,
    public var `numRemotePrincipalGroupSids`: UInt,
    public var `remotePrincipalGroupSids`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?,
    public var `providerContextKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
)
// UNSUPPORTED Rust 1660:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_NET_EVENT_IKEEXT_MM_FAILURE2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWPM_NET_EVENT_IKEEXT_MM_FAILURE_FLAG_BENIGN`: UInt = 1u;
public const val `FWPM_NET_EVENT_IKEEXT_MM_FAILURE_FLAG_MULTIPLE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_NET_EVENT_IKEEXT_QM_FAILURE0` (
    public var `failureErrorCode`: UInt,
    public var `failurePoint`: `IPSEC_FAILURE_POINT`,
    public var `keyingModuleType`: `IKEEXT_KEY_MODULE_TYPE`,
    public var `qmState`: `IKEEXT_QM_SA_STATE`,
    public var `saRole`: `IKEEXT_SA_ROLE`,
    public var `saTrafficType`: `IPSEC_TRAFFIC_TYPE`,
    public var `Anonymous1`: `FWPM_NET_EVENT_IKEEXT_QM_FAILURE0_0`,
    public var `Anonymous2`: `FWPM_NET_EVENT_IKEEXT_QM_FAILURE0_1`,
    public var `qmFilterId`: ULong,
)
// UNSUPPORTED Rust 1681:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_IKEEXT_QM_FAILURE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1687:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_IKEEXT_QM_FAILURE0_0 {
//     pub localSubNet: FWP_CONDITION_VALUE0,
// }

// UNSUPPORTED Rust 1693:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_IKEEXT_QM_FAILURE0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1699:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_IKEEXT_QM_FAILURE0_1 {
//     pub remoteSubNet: FWP_CONDITION_VALUE0,
// }

// UNSUPPORTED Rust 1705:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_IKEEXT_QM_FAILURE0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_NET_EVENT_IKEEXT_QM_FAILURE1` (
    public var `failureErrorCode`: UInt,
    public var `failurePoint`: `IPSEC_FAILURE_POINT`,
    public var `keyingModuleType`: `IKEEXT_KEY_MODULE_TYPE`,
    public var `qmState`: `IKEEXT_QM_SA_STATE`,
    public var `saRole`: `IKEEXT_SA_ROLE`,
    public var `saTrafficType`: `IPSEC_TRAFFIC_TYPE`,
    public var `Anonymous1`: `FWPM_NET_EVENT_IKEEXT_QM_FAILURE1_0`,
    public var `Anonymous2`: `FWPM_NET_EVENT_IKEEXT_QM_FAILURE1_1`,
    public var `qmFilterId`: ULong,
    public var `mmSaLuid`: ULong,
    public var `mmProviderContextKey`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 1727:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_IKEEXT_QM_FAILURE1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1733:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_IKEEXT_QM_FAILURE1_0 {
//     pub localSubNet: FWP_CONDITION_VALUE0,
// }

// UNSUPPORTED Rust 1739:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_IKEEXT_QM_FAILURE1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1745:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_IKEEXT_QM_FAILURE1_1 {
//     pub remoteSubNet: FWP_CONDITION_VALUE0,
// }

// UNSUPPORTED Rust 1751:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_IKEEXT_QM_FAILURE1_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_NET_EVENT_IPSEC_DOSP_DROP0` (
    public var `ipVersion`: `FWP_IP_VERSION`,
    public var `Anonymous1`: `FWPM_NET_EVENT_IPSEC_DOSP_DROP0_0`,
    public var `Anonymous2`: `FWPM_NET_EVENT_IPSEC_DOSP_DROP0_1`,
    public var `failureStatus`: Int,
    public var `direction`: `FWP_DIRECTION`,
)
// UNSUPPORTED Rust 1766:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_NET_EVENT_IPSEC_DOSP_DROP0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1771:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_IPSEC_DOSP_DROP0_0 {
//     pub publicHostV4Addr: u32,
//     pub publicHostV6Addr: [u8; 16],
// }

// UNSUPPORTED Rust 1777:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_NET_EVENT_IPSEC_DOSP_DROP0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1782:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_IPSEC_DOSP_DROP0_1 {
//     pub internalHostV4Addr: u32,
//     pub internalHostV6Addr: [u8; 16],
// }

// UNSUPPORTED Rust 1788:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_NET_EVENT_IPSEC_DOSP_DROP0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FWPM_NET_EVENT_IPSEC_KERNEL_DROP0` (
    public var `failureStatus`: Int,
    public var `direction`: `FWP_DIRECTION`,
    public var `spi`: UInt,
    public var `filterId`: ULong,
    public var `layerId`: UShort,
)
public const val `FWPM_NET_EVENT_KEYWORD_CAPABILITY_ALLOW`: UInt = 8u;
public const val `FWPM_NET_EVENT_KEYWORD_CAPABILITY_DROP`: UInt = 4u;
public const val `FWPM_NET_EVENT_KEYWORD_CLASSIFY_ALLOW`: UInt = 16u;
public const val `FWPM_NET_EVENT_KEYWORD_INBOUND_BCAST`: UInt = 2u;
public const val `FWPM_NET_EVENT_KEYWORD_INBOUND_MCAST`: UInt = 1u;
public const val `FWPM_NET_EVENT_KEYWORD_PORT_SCANNING_DROP`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FWPM_NET_EVENT_LPM_PACKET_ARRIVAL0` (
    public var `spi`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_NET_EVENT_SUBSCRIPTION0` (
    public var `enumTemplate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FWPM_NET_EVENT_ENUM_TEMPLATE0`>?,
    public var `flags`: UInt,
    public var `sessionKey`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 1821:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_SUBSCRIPTION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FWPM_NET_EVENT_TYPE` = Int;
public const val `FWPM_NET_EVENT_TYPE_CAPABILITY_ALLOW`: `FWPM_NET_EVENT_TYPE` = 8;
public const val `FWPM_NET_EVENT_TYPE_CAPABILITY_DROP`: `FWPM_NET_EVENT_TYPE` = 7;
public const val `FWPM_NET_EVENT_TYPE_CLASSIFY_ALLOW`: `FWPM_NET_EVENT_TYPE` = 6;
public const val `FWPM_NET_EVENT_TYPE_CLASSIFY_DROP`: `FWPM_NET_EVENT_TYPE` = 3;
public const val `FWPM_NET_EVENT_TYPE_CLASSIFY_DROP_MAC`: `FWPM_NET_EVENT_TYPE` = 9;
public const val `FWPM_NET_EVENT_TYPE_IKEEXT_EM_FAILURE`: `FWPM_NET_EVENT_TYPE` = 2;
public const val `FWPM_NET_EVENT_TYPE_IKEEXT_MM_FAILURE`: `FWPM_NET_EVENT_TYPE` = 0;
public const val `FWPM_NET_EVENT_TYPE_IKEEXT_QM_FAILURE`: `FWPM_NET_EVENT_TYPE` = 1;
public const val `FWPM_NET_EVENT_TYPE_IPSEC_DOSP_DROP`: `FWPM_NET_EVENT_TYPE` = 5;
public const val `FWPM_NET_EVENT_TYPE_IPSEC_KERNEL_DROP`: `FWPM_NET_EVENT_TYPE` = 4;
public const val `FWPM_NET_EVENT_TYPE_LPM_PACKET_ARRIVAL`: `FWPM_NET_EVENT_TYPE` = 10;
public const val `FWPM_NET_EVENT_TYPE_MAX`: `FWPM_NET_EVENT_TYPE` = 11;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_PROVIDER0` (
    public var `providerKey`: `windows_sys`.`core`.`GUID`,
    public var `displayData`: `FWPM_DISPLAY_DATA0`,
    public var `flags`: UInt,
    public var `providerData`: `FWP_BYTE_BLOB`,
    public var `serviceName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1849:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_PROVIDER0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FWPM_PROVIDER_CHANGE0` (
    public var `changeType`: `FWPM_CHANGE_TYPE`,
    public var `providerKey`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FWPM_PROVIDER_CHANGE_CALLBACK0` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_PROVIDER_CHANGE0`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_PROVIDER_CONTEXT0` (
    public var `providerContextKey`: `windows_sys`.`core`.`GUID`,
    public var `displayData`: `FWPM_DISPLAY_DATA0`,
    public var `flags`: UInt,
    public var `providerKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `providerData`: `FWP_BYTE_BLOB`,
    public var `type`: `FWPM_PROVIDER_CONTEXT_TYPE`,
    public var `Anonymous`: `FWPM_PROVIDER_CONTEXT0_0`,
    public var `providerContextId`: ULong,
)
// UNSUPPORTED Rust 1874:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_PROVIDER_CONTEXT0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1880:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_PROVIDER_CONTEXT0_0 {
//     pub keyingPolicy: *mut IPSEC_KEYING_POLICY0,
//     pub ikeQmTransportPolicy: *mut IPSEC_TRANSPORT_POLICY0,
//     pub ikeQmTunnelPolicy: *mut IPSEC_TUNNEL_POLICY0,
//     pub authipQmTransportPolicy: *mut IPSEC_TRANSPORT_POLICY0,
//     pub authipQmTunnelPolicy: *mut IPSEC_TUNNEL_POLICY0,
//     pub ikeMmPolicy: *mut IKEEXT_POLICY0,
//     pub authIpMmPolicy: *mut IKEEXT_POLICY0,
//     pub dataBuffer: *mut FWP_BYTE_BLOB,
//     pub classifyOptions: *mut FWPM_CLASSIFY_OPTIONS0,
// }

// UNSUPPORTED Rust 1894:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_PROVIDER_CONTEXT0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_PROVIDER_CONTEXT1` (
    public var `providerContextKey`: `windows_sys`.`core`.`GUID`,
    public var `displayData`: `FWPM_DISPLAY_DATA0`,
    public var `flags`: UInt,
    public var `providerKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `providerData`: `FWP_BYTE_BLOB`,
    public var `type`: `FWPM_PROVIDER_CONTEXT_TYPE`,
    public var `Anonymous`: `FWPM_PROVIDER_CONTEXT1_0`,
    public var `providerContextId`: ULong,
)
// UNSUPPORTED Rust 1913:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_PROVIDER_CONTEXT1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1919:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_PROVIDER_CONTEXT1_0 {
//     pub keyingPolicy: *mut IPSEC_KEYING_POLICY0,
//     pub ikeQmTransportPolicy: *mut IPSEC_TRANSPORT_POLICY1,
//     pub ikeQmTunnelPolicy: *mut IPSEC_TUNNEL_POLICY1,
//     pub authipQmTransportPolicy: *mut IPSEC_TRANSPORT_POLICY1,
//     pub authipQmTunnelPolicy: *mut IPSEC_TUNNEL_POLICY1,
//     pub ikeMmPolicy: *mut IKEEXT_POLICY1,
//     pub authIpMmPolicy: *mut IKEEXT_POLICY1,
//     pub dataBuffer: *mut FWP_BYTE_BLOB,
//     pub classifyOptions: *mut FWPM_CLASSIFY_OPTIONS0,
//     pub ikeV2QmTunnelPolicy: *mut IPSEC_TUNNEL_POLICY1,
//     pub ikeV2MmPolicy: *mut IKEEXT_POLICY1,
//     pub idpOptions: *mut IPSEC_DOSP_OPTIONS0,
// }

// UNSUPPORTED Rust 1936:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_PROVIDER_CONTEXT1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_PROVIDER_CONTEXT2` (
    public var `providerContextKey`: `windows_sys`.`core`.`GUID`,
    public var `displayData`: `FWPM_DISPLAY_DATA0`,
    public var `flags`: UInt,
    public var `providerKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `providerData`: `FWP_BYTE_BLOB`,
    public var `type`: `FWPM_PROVIDER_CONTEXT_TYPE`,
    public var `Anonymous`: `FWPM_PROVIDER_CONTEXT2_0`,
    public var `providerContextId`: ULong,
)
// UNSUPPORTED Rust 1955:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_PROVIDER_CONTEXT2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1961:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_PROVIDER_CONTEXT2_0 {
//     pub keyingPolicy: *mut IPSEC_KEYING_POLICY1,
//     pub ikeQmTransportPolicy: *mut IPSEC_TRANSPORT_POLICY2,
//     pub ikeQmTunnelPolicy: *mut IPSEC_TUNNEL_POLICY2,
//     pub authipQmTransportPolicy: *mut IPSEC_TRANSPORT_POLICY2,
//     pub authipQmTunnelPolicy: *mut IPSEC_TUNNEL_POLICY2,
//     pub ikeMmPolicy: *mut IKEEXT_POLICY2,
//     pub authIpMmPolicy: *mut IKEEXT_POLICY2,
//     pub dataBuffer: *mut FWP_BYTE_BLOB,
//     pub classifyOptions: *mut FWPM_CLASSIFY_OPTIONS0,
//     pub ikeV2QmTunnelPolicy: *mut IPSEC_TUNNEL_POLICY2,
//     pub ikeV2QmTransportPolicy: *mut IPSEC_TRANSPORT_POLICY2,
//     pub ikeV2MmPolicy: *mut IKEEXT_POLICY2,
//     pub idpOptions: *mut IPSEC_DOSP_OPTIONS0,
// }

// UNSUPPORTED Rust 1979:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_PROVIDER_CONTEXT2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_PROVIDER_CONTEXT3` (
    public var `providerContextKey`: `windows_sys`.`core`.`GUID`,
    public var `displayData`: `FWPM_DISPLAY_DATA0`,
    public var `flags`: UInt,
    public var `providerKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `providerData`: `FWP_BYTE_BLOB`,
    public var `type`: `FWPM_PROVIDER_CONTEXT_TYPE`,
    public var `Anonymous`: `FWPM_PROVIDER_CONTEXT3_0`,
    public var `providerContextId`: ULong,
)
// UNSUPPORTED Rust 1998:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_PROVIDER_CONTEXT3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2004:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_PROVIDER_CONTEXT3_0 {
//     pub keyingPolicy: *mut IPSEC_KEYING_POLICY1,
//     pub ikeQmTransportPolicy: *mut IPSEC_TRANSPORT_POLICY2,
//     pub ikeQmTunnelPolicy: *mut IPSEC_TUNNEL_POLICY3,
//     pub authipQmTransportPolicy: *mut IPSEC_TRANSPORT_POLICY2,
//     pub authipQmTunnelPolicy: *mut IPSEC_TUNNEL_POLICY3,
//     pub ikeMmPolicy: *mut IKEEXT_POLICY2,
//     pub authIpMmPolicy: *mut IKEEXT_POLICY2,
//     pub dataBuffer: *mut FWP_BYTE_BLOB,
//     pub classifyOptions: *mut FWPM_CLASSIFY_OPTIONS0,
//     pub ikeV2QmTunnelPolicy: *mut IPSEC_TUNNEL_POLICY3,
//     pub ikeV2QmTransportPolicy: *mut IPSEC_TRANSPORT_POLICY2,
//     pub ikeV2MmPolicy: *mut IKEEXT_POLICY2,
//     pub idpOptions: *mut IPSEC_DOSP_OPTIONS0,
//     pub networkConnectionPolicy: *mut FWPM_NETWORK_CONNECTION_POLICY_SETTINGS0,
// }

// UNSUPPORTED Rust 2023:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_PROVIDER_CONTEXT3_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FWPM_PROVIDER_CONTEXT_CHANGE0` (
    public var `changeType`: `FWPM_CHANGE_TYPE`,
    public var `providerContextKey`: `windows_sys`.`core`.`GUID`,
    public var `providerContextId`: ULong,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FWPM_PROVIDER_CONTEXT_CHANGE_CALLBACK0` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_PROVIDER_CONTEXT_CHANGE0`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_PROVIDER_CONTEXT_ENUM_TEMPLATE0` (
    public var `providerKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `providerContextType`: `FWPM_PROVIDER_CONTEXT_TYPE`,
)
// UNSUPPORTED Rust 2043:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_PROVIDER_CONTEXT_ENUM_TEMPLATE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWPM_PROVIDER_CONTEXT_FLAG_DOWNLEVEL`: UInt = 2u;
public const val `FWPM_PROVIDER_CONTEXT_FLAG_PERSISTENT`: UInt = 1u;
// UNSUPPORTED Rust 2050:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_PROVIDER_CONTEXT_SECURE_SOCKET_AUTHIP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb25ea800_0d02_46ed_92bd_7fa84bb73e9d);

// UNSUPPORTED Rust 2051:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_PROVIDER_CONTEXT_SECURE_SOCKET_IPSEC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8c2d4144_f8e0_42c0_94ce_7ccfc63b2f9b);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_PROVIDER_CONTEXT_SUBSCRIPTION0` (
    public var `enumTemplate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FWPM_PROVIDER_CONTEXT_ENUM_TEMPLATE0`>?,
    public var `flags`: `FWPM_SUBSCRIPTION_FLAGS`,
    public var `sessionKey`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 2059:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_PROVIDER_CONTEXT_SUBSCRIPTION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FWPM_PROVIDER_CONTEXT_TYPE` = Int;
public const val `FWPM_PROVIDER_CONTEXT_TYPE_MAX`: `FWPM_PROVIDER_CONTEXT_TYPE` = 14;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FWPM_PROVIDER_ENUM_TEMPLATE0` (
    public var `reserved`: ULong,
)
public const val `FWPM_PROVIDER_FLAG_DISABLED`: UInt = 16u;
public const val `FWPM_PROVIDER_FLAG_PERSISTENT`: UInt = 1u;
// UNSUPPORTED Rust 2073:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_PROVIDER_IKEEXT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x10ad9216_ccde_456c_8b16_e9f04e60a90b);

// UNSUPPORTED Rust 2074:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_PROVIDER_IPSEC_DOSP_CONFIG: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3c6c05a9_c05c_4bb9_8338_2327814ce8bf);

// UNSUPPORTED Rust 2075:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_PROVIDER_MPSSVC_APP_ISOLATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3cc2631f_2d5d_43a0_b174_614837d863a1);

// UNSUPPORTED Rust 2076:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_PROVIDER_MPSSVC_EDP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa90296f7_46b8_4457_8f84_b05e05d3c622);

// UNSUPPORTED Rust 2077:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_PROVIDER_MPSSVC_TENANT_RESTRICTIONS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd0718ff9_44da_4f50_9dc2_c963a4247613);

// UNSUPPORTED Rust 2078:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_PROVIDER_MPSSVC_WF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdecc16ca_3f33_4346_be1e_8fb4ae0f3d62);

// UNSUPPORTED Rust 2079:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_PROVIDER_MPSSVC_WSH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4b153735_1049_4480_aab4_d1b9bdc03710);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_PROVIDER_SUBSCRIPTION0` (
    public var `enumTemplate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FWPM_PROVIDER_ENUM_TEMPLATE0`>?,
    public var `flags`: UInt,
    public var `sessionKey`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 2087:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_PROVIDER_SUBSCRIPTION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2092:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_PROVIDER_TCP_CHIMNEY_OFFLOAD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x896aa19e_9a34_4bcb_ae79_beb9127c84b9);

// UNSUPPORTED Rust 2093:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_PROVIDER_TCP_TEMPLATES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x76cfcd30_3394_432d_bed3_441ae50e63c3);

public const val `FWPM_SERVICE_RUNNING`: `FWPM_SERVICE_STATE` = 3;
public const val `FWPM_SERVICE_START_PENDING`: `FWPM_SERVICE_STATE` = 1;
public typealias `FWPM_SERVICE_STATE` = Int;
public const val `FWPM_SERVICE_STATE_MAX`: `FWPM_SERVICE_STATE` = 4;
public const val `FWPM_SERVICE_STOPPED`: `FWPM_SERVICE_STATE` = 0;
public const val `FWPM_SERVICE_STOP_PENDING`: `FWPM_SERVICE_STATE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_SESSION0` (
    public var `sessionKey`: `windows_sys`.`core`.`GUID`,
    public var `displayData`: `FWPM_DISPLAY_DATA0`,
    public var `flags`: UInt,
    public var `txnWaitTimeoutInMSec`: UInt,
    public var `processId`: UInt,
    public var `sid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?,
    public var `username`: `windows_sys`.`core`.`PWSTR`,
    public var `kernelMode`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 2113:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_SESSION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FWPM_SESSION_ENUM_TEMPLATE0` (
    public var `reserved`: ULong,
)
public const val `FWPM_SESSION_FLAG_DYNAMIC`: UInt = 1u;
public const val `FWPM_SESSION_FLAG_RESERVED`: UInt = 268435456u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_STATISTICS0` (
    public var `numLayerStatistics`: UInt,
    public var `layerStatistics`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FWPM_LAYER_STATISTICS0`>?,
    public var `inboundAllowedConnectionsV4`: UInt,
    public var `inboundBlockedConnectionsV4`: UInt,
    public var `outboundAllowedConnectionsV4`: UInt,
    public var `outboundBlockedConnectionsV4`: UInt,
    public var `inboundAllowedConnectionsV6`: UInt,
    public var `inboundBlockedConnectionsV6`: UInt,
    public var `outboundAllowedConnectionsV6`: UInt,
    public var `outboundBlockedConnectionsV6`: UInt,
    public var `inboundActiveConnectionsV4`: UInt,
    public var `outboundActiveConnectionsV4`: UInt,
    public var `inboundActiveConnectionsV6`: UInt,
    public var `outboundActiveConnectionsV6`: UInt,
    public var `reauthDirInbound`: ULong,
    public var `reauthDirOutbound`: ULong,
    public var `reauthFamilyV4`: ULong,
    public var `reauthFamilyV6`: ULong,
    public var `reauthProtoOther`: ULong,
    public var `reauthProtoIPv4`: ULong,
    public var `reauthProtoIPv6`: ULong,
    public var `reauthProtoICMP`: ULong,
    public var `reauthProtoICMP6`: ULong,
    public var `reauthProtoUDP`: ULong,
    public var `reauthProtoTCP`: ULong,
    public var `reauthReasonPolicyChange`: ULong,
    public var `reauthReasonNewArrivalInterface`: ULong,
    public var `reauthReasonNewNextHopInterface`: ULong,
    public var `reauthReasonProfileCrossing`: ULong,
    public var `reauthReasonClassifyCompletion`: ULong,
    public var `reauthReasonIPSecPropertiesChanged`: ULong,
    public var `reauthReasonMidStreamInspection`: ULong,
    public var `reauthReasonSocketPropertyChanged`: ULong,
    public var `reauthReasonNewInboundMCastBCastPacket`: ULong,
    public var `reauthReasonEDPPolicyChanged`: ULong,
    public var `reauthReasonProxyHandleChanged`: ULong,
)
// UNSUPPORTED Rust 2166:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_STATISTICS0 {
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
public class `FWPM_SUBLAYER0` (
    public var `subLayerKey`: `windows_sys`.`core`.`GUID`,
    public var `displayData`: `FWPM_DISPLAY_DATA0`,
    public var `flags`: UInt,
    public var `providerKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `providerData`: `FWP_BYTE_BLOB`,
    public var `weight`: UShort,
)
// UNSUPPORTED Rust 2181:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_SUBLAYER0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FWPM_SUBLAYER_CHANGE0` (
    public var `changeType`: `FWPM_CHANGE_TYPE`,
    public var `subLayerKey`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FWPM_SUBLAYER_CHANGE_CALLBACK0` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_SUBLAYER_CHANGE0`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_SUBLAYER_ENUM_TEMPLATE0` (
    public var `providerKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
)
// UNSUPPORTED Rust 2198:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_SUBLAYER_ENUM_TEMPLATE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWPM_SUBLAYER_FLAG_PERSISTENT`: UInt = 1u;
// UNSUPPORTED Rust 2204:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_SUBLAYER_INSPECTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x877519e1_e6a9_41a5_81b4_8c4f118e4a60);

// UNSUPPORTED Rust 2205:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_SUBLAYER_IPSEC_DOSP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe076d572_5d3d_48ef_802b_909eddb098bd);

// UNSUPPORTED Rust 2206:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_SUBLAYER_IPSEC_FORWARD_OUTBOUND_TUNNEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa5082e73_8f71_4559_8a9a_101cea04ef87);

// UNSUPPORTED Rust 2207:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_SUBLAYER_IPSEC_SECURITY_REALM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x37a57701_5884_4964_92b8_3e704688b0ad);

// UNSUPPORTED Rust 2208:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_SUBLAYER_IPSEC_TUNNEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x83f299ed_9ff4_4967_aff4_c309f4dab827);

// UNSUPPORTED Rust 2209:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_SUBLAYER_LIPS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1b75c0ce_ff60_4711_a70f_b4958cc3b2d0);

// UNSUPPORTED Rust 2210:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_SUBLAYER_MPSSVC_APP_ISOLATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xffe221c3_92a8_4564_a59f_dafb70756020);

// UNSUPPORTED Rust 2211:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_SUBLAYER_MPSSVC_EDP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x09a47e38_fa97_471b_b123_18bcd7e65071);

// UNSUPPORTED Rust 2212:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_SUBLAYER_MPSSVC_QUARANTINE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb3cdd441_af90_41ba_a745_7c6008ff2302);

// UNSUPPORTED Rust 2213:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_SUBLAYER_MPSSVC_TENANT_RESTRICTIONS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1ec6c7e1_fdd9_478a_b55f_ff8ba1d2c17d);

// UNSUPPORTED Rust 2214:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_SUBLAYER_MPSSVC_WF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb3cdd441_af90_41ba_a745_7c6008ff2301);

// UNSUPPORTED Rust 2215:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_SUBLAYER_MPSSVC_WSH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb3cdd441_af90_41ba_a745_7c6008ff2300);

// UNSUPPORTED Rust 2216:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_SUBLAYER_RPC_AUDIT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x758c84f4_fb48_4de9_9aeb_3ed9551ab1fd);

// UNSUPPORTED Rust 2217:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_SUBLAYER_SECURE_SOCKET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x15a66e17_3f3c_4f7b_aa6c_812aa613dd82);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_SUBLAYER_SUBSCRIPTION0` (
    public var `enumTemplate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FWPM_SUBLAYER_ENUM_TEMPLATE0`>?,
    public var `flags`: `FWPM_SUBSCRIPTION_FLAGS`,
    public var `sessionKey`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 2225:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_SUBLAYER_SUBSCRIPTION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2230:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_SUBLAYER_TCP_CHIMNEY_OFFLOAD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x337608b9_b7d5_4d5f_82f9_3618618bc058);

// UNSUPPORTED Rust 2231:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_SUBLAYER_TCP_TEMPLATES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x24421dcf_0ac5_4caa_9e14_50f6e3636af0);

// UNSUPPORTED Rust 2232:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_SUBLAYER_TEREDO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba69dc66_5176_4979_9c89_26a7b46a8327);

// UNSUPPORTED Rust 2233:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FWPM_SUBLAYER_UNIVERSAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeebecc03_ced4_4380_819a_2734397b2b74);

public typealias `FWPM_SUBSCRIPTION_FLAGS` = UInt;
public const val `FWPM_SUBSCRIPTION_FLAG_NOTIFY_ON_ADD`: `FWPM_SUBSCRIPTION_FLAGS` = 1u;
public const val `FWPM_SUBSCRIPTION_FLAG_NOTIFY_ON_DELETE`: `FWPM_SUBSCRIPTION_FLAGS` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_SYSTEM_PORTS0` (
    public var `numTypes`: UInt,
    public var `types`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FWPM_SYSTEM_PORTS_BY_TYPE0`>?,
)
// UNSUPPORTED Rust 2243:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_SYSTEM_PORTS0 {
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
public class `FWPM_SYSTEM_PORTS_BY_TYPE0` (
    public var `type`: `FWPM_SYSTEM_PORT_TYPE`,
    public var `numPorts`: UInt,
    public var `ports`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
)
// UNSUPPORTED Rust 2255:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_SYSTEM_PORTS_BY_TYPE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FWPM_SYSTEM_PORTS_CALLBACK0` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_SYSTEM_PORTS0`>?) -> Unit>>>;
public const val `FWPM_SYSTEM_PORT_IPHTTPS_IN`: `FWPM_SYSTEM_PORT_TYPE` = 2;
public const val `FWPM_SYSTEM_PORT_IPHTTPS_OUT`: `FWPM_SYSTEM_PORT_TYPE` = 3;
public const val `FWPM_SYSTEM_PORT_RPC_EPMAP`: `FWPM_SYSTEM_PORT_TYPE` = 0;
public const val `FWPM_SYSTEM_PORT_TEREDO`: `FWPM_SYSTEM_PORT_TYPE` = 1;
public typealias `FWPM_SYSTEM_PORT_TYPE` = Int;
public const val `FWPM_SYSTEM_PORT_TYPE_MAX`: `FWPM_SYSTEM_PORT_TYPE` = 4;
public const val `FWPM_TUNNEL_FLAG_ENABLE_VIRTUAL_IF_TUNNELING`: UInt = 2u;
public const val `FWPM_TUNNEL_FLAG_POINT_TO_POINT`: UInt = 1u;
public const val `FWPM_TUNNEL_FLAG_RESERVED0`: UInt = 4u;
public const val `FWPM_TXN_READ_ONLY`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWPM_VSWITCH_EVENT0` (
    public var `eventType`: `FWPM_VSWITCH_EVENT_TYPE`,
    public var `vSwitchId`: `windows_sys`.`core`.`PWSTR`,
    public var `Anonymous`: `FWPM_VSWITCH_EVENT0_0`,
)
// UNSUPPORTED Rust 2278:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_VSWITCH_EVENT0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2283:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FWPM_VSWITCH_EVENT0_0 {
//     pub positionInfo: FWPM_VSWITCH_EVENT0_0_0,
//     pub reorderInfo: FWPM_VSWITCH_EVENT0_0_1,
// }

// UNSUPPORTED Rust 2289:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_VSWITCH_EVENT0_0 {
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
public class `FWPM_VSWITCH_EVENT0_0_0` (
    public var `numvSwitchFilterExtensions`: UInt,
    public var `vSwitchFilterExtensions`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?,
)
// UNSUPPORTED Rust 2300:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_VSWITCH_EVENT0_0_0 {
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
public class `FWPM_VSWITCH_EVENT0_0_1` (
    public var `inRequiredPosition`: `windows_sys`.`core`.`BOOL`,
    public var `numvSwitchFilterExtensions`: UInt,
    public var `vSwitchFilterExtensions`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?,
)
// UNSUPPORTED Rust 2312:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWPM_VSWITCH_EVENT0_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FWPM_VSWITCH_EVENT_CALLBACK0` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FWPM_VSWITCH_EVENT0`>?) -> UInt>>>;
public const val `FWPM_VSWITCH_EVENT_DISABLED_FOR_INSPECTION`: `FWPM_VSWITCH_EVENT_TYPE` = 3;
public const val `FWPM_VSWITCH_EVENT_ENABLED_FOR_INSPECTION`: `FWPM_VSWITCH_EVENT_TYPE` = 2;
public const val `FWPM_VSWITCH_EVENT_FILTER_ADD_TO_INCOMPLETE_LAYER`: `FWPM_VSWITCH_EVENT_TYPE` = 0;
public const val `FWPM_VSWITCH_EVENT_FILTER_ENGINE_NOT_IN_REQUIRED_POSITION`: `FWPM_VSWITCH_EVENT_TYPE` = 1;
public const val `FWPM_VSWITCH_EVENT_FILTER_ENGINE_REORDER`: `FWPM_VSWITCH_EVENT_TYPE` = 4;
public const val `FWPM_VSWITCH_EVENT_MAX`: `FWPM_VSWITCH_EVENT_TYPE` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FWPM_VSWITCH_EVENT_SUBSCRIPTION0` (
    public var `flags`: UInt,
    public var `sessionKey`: `windows_sys`.`core`.`GUID`,
)
public typealias `FWPM_VSWITCH_EVENT_TYPE` = Int;
public const val `FWPM_WEIGHT_RANGE_IKE_EXEMPTIONS`: UInt = 12u;
public const val `FWPM_WEIGHT_RANGE_IPSEC`: UInt = 0u;
public const val `FWPS_ALE_ENDPOINT_FLAG_IPSEC_SECURED`: UInt = 1u;
public const val `FWPS_CLASSIFY_OUT_FLAG_ABSORB`: UInt = 1u;
public const val `FWPS_CLASSIFY_OUT_FLAG_ALE_FAST_CACHE_CHECK`: UInt = 8u;
public const val `FWPS_CLASSIFY_OUT_FLAG_ALE_FAST_CACHE_POSSIBLE`: UInt = 16u;
public const val `FWPS_CLASSIFY_OUT_FLAG_BUFFER_LIMIT_REACHED`: UInt = 2u;
public const val `FWPS_CLASSIFY_OUT_FLAG_NO_MORE_DATA`: UInt = 4u;
public const val `FWPS_FILTER_FLAG_CLEAR_ACTION_RIGHT`: UInt = 1u;
public const val `FWPS_FILTER_FLAG_HAS_SECURITY_REALM_PROVIDER_CONTEXT`: UInt = 8u;
public const val `FWPS_FILTER_FLAG_IPSEC_NO_ACQUIRE_INITIATE`: UInt = 32u;
public const val `FWPS_FILTER_FLAG_OR_CONDITIONS`: UInt = 4u;
public const val `FWPS_FILTER_FLAG_PERMIT_IF_CALLOUT_UNREGISTERED`: UInt = 2u;
public const val `FWPS_FILTER_FLAG_RESERVED0`: UInt = 64u;
public const val `FWPS_FILTER_FLAG_RESERVED1`: UInt = 128u;
public const val `FWPS_FILTER_FLAG_SILENT_MODE`: UInt = 16u;
public const val `FWPS_INCOMING_FLAG_ABSORB`: UInt = 4u;
public const val `FWPS_INCOMING_FLAG_CACHE_SAFE`: UInt = 1u;
public const val `FWPS_INCOMING_FLAG_CONNECTION_FAILING_INDICATION`: UInt = 8u;
public const val `FWPS_INCOMING_FLAG_ENFORCE_QUERY`: UInt = 2u;
public const val `FWPS_INCOMING_FLAG_IS_LOCAL_ONLY_FLOW`: UInt = 128u;
public const val `FWPS_INCOMING_FLAG_IS_LOOSE_SOURCE_FLOW`: UInt = 64u;
public const val `FWPS_INCOMING_FLAG_MID_STREAM_INSPECTION`: UInt = 16u;
public const val `FWPS_INCOMING_FLAG_RECLASSIFY`: UInt = 32u;
public const val `FWPS_INCOMING_FLAG_RESERVED0`: UInt = 256u;
public const val `FWPS_L2_INCOMING_FLAG_IS_RAW_IPV4_FRAMING`: UInt = 1u;
public const val `FWPS_L2_INCOMING_FLAG_IS_RAW_IPV6_FRAMING`: UInt = 2u;
public const val `FWPS_L2_INCOMING_FLAG_RECLASSIFY_MULTI_DESTINATION`: UInt = 8u;
public const val `FWPS_L2_METADATA_FIELD_ETHERNET_MAC_HEADER_SIZE`: UInt = 1u;
public const val `FWPS_L2_METADATA_FIELD_RESERVED`: UInt = 2147483648u;
public const val `FWPS_L2_METADATA_FIELD_VSWITCH_DESTINATION_PORT_ID`: UInt = 32u;
public const val `FWPS_L2_METADATA_FIELD_VSWITCH_PACKET_CONTEXT`: UInt = 16u;
public const val `FWPS_L2_METADATA_FIELD_VSWITCH_SOURCE_NIC_INDEX`: UInt = 8u;
public const val `FWPS_L2_METADATA_FIELD_VSWITCH_SOURCE_PORT_ID`: UInt = 4u;
public const val `FWPS_L2_METADATA_FIELD_WIFI_OPERATION_MODE`: UInt = 2u;
public const val `FWPS_METADATA_FIELD_ALE_CLASSIFY_REQUIRED`: UInt = 4194304u;
public const val `FWPS_METADATA_FIELD_COMPARTMENT_ID`: UInt = 2048u;
public const val `FWPS_METADATA_FIELD_COMPLETION_HANDLE`: UInt = 16384u;
public const val `FWPS_METADATA_FIELD_DESTINATION_INTERFACE_INDEX`: UInt = 512u;
public const val `FWPS_METADATA_FIELD_DESTINATION_PREFIX`: UInt = 16777216u;
public const val `FWPS_METADATA_FIELD_DISCARD_REASON`: UInt = 1u;
public const val `FWPS_METADATA_FIELD_ETHER_FRAME_LENGTH`: UInt = 33554432u;
public const val `FWPS_METADATA_FIELD_FLOW_HANDLE`: UInt = 2u;
public const val `FWPS_METADATA_FIELD_FORWARD_LAYER_INBOUND_PASS_THRU`: UInt = 2097152u;
public const val `FWPS_METADATA_FIELD_FORWARD_LAYER_OUTBOUND_PASS_THRU`: UInt = 1048576u;
public const val `FWPS_METADATA_FIELD_FRAGMENT_DATA`: UInt = 4096u;
public const val `FWPS_METADATA_FIELD_ICMP_ID_AND_SEQUENCE`: UInt = 134217728u;
public const val `FWPS_METADATA_FIELD_IP_HEADER_SIZE`: UInt = 4u;
public const val `FWPS_METADATA_FIELD_LOCAL_REDIRECT_TARGET_PID`: UInt = 268435456u;
public const val `FWPS_METADATA_FIELD_ORIGINAL_DESTINATION`: UInt = 536870912u;
public const val `FWPS_METADATA_FIELD_PACKET_DIRECTION`: UInt = 262144u;
public const val `FWPS_METADATA_FIELD_PACKET_SYSTEM_CRITICAL`: UInt = 524288u;
public const val `FWPS_METADATA_FIELD_PARENT_ENDPOINT_HANDLE`: UInt = 67108864u;
public const val `FWPS_METADATA_FIELD_PATH_MTU`: UInt = 8192u;
public const val `FWPS_METADATA_FIELD_PROCESS_ID`: UInt = 32u;
public const val `FWPS_METADATA_FIELD_PROCESS_PATH`: UInt = 8u;
public const val `FWPS_METADATA_FIELD_REDIRECT_RECORD_HANDLE`: UInt = 1073741824u;
public const val `FWPS_METADATA_FIELD_REMOTE_SCOPE_ID`: UInt = 131072u;
public const val `FWPS_METADATA_FIELD_RESERVED`: UInt = 128u;
public const val `FWPS_METADATA_FIELD_SOURCE_INTERFACE_INDEX`: UInt = 256u;
public const val `FWPS_METADATA_FIELD_SUB_PROCESS_TAG`: UInt = 2147483648u;
public const val `FWPS_METADATA_FIELD_SYSTEM_FLAGS`: UInt = 64u;
public const val `FWPS_METADATA_FIELD_TOKEN`: UInt = 16u;
public const val `FWPS_METADATA_FIELD_TRANSPORT_CONTROL_DATA`: UInt = 65536u;
public const val `FWPS_METADATA_FIELD_TRANSPORT_ENDPOINT_HANDLE`: UInt = 32768u;
public const val `FWPS_METADATA_FIELD_TRANSPORT_HEADER_INCLUDE_HEADER`: UInt = 8388608u;
public const val `FWPS_METADATA_FIELD_TRANSPORT_HEADER_SIZE`: UInt = 1024u;
public const val `FWPS_RIGHT_ACTION_WRITE`: UInt = 1u;
public const val `FWP_ACTION_BLOCK`: `FWP_ACTION_TYPE` = 4097u;
public const val `FWP_ACTION_CALLOUT_INSPECTION`: `FWP_ACTION_TYPE` = 24580u;
public const val `FWP_ACTION_CALLOUT_TERMINATING`: `FWP_ACTION_TYPE` = 20483u;
public const val `FWP_ACTION_CALLOUT_UNKNOWN`: `FWP_ACTION_TYPE` = 16389u;
public const val `FWP_ACTION_CONTINUE`: `FWP_ACTION_TYPE` = 8198u;
public const val `FWP_ACTION_FLAG_CALLOUT`: UInt = 16384u;
public const val `FWP_ACTION_FLAG_NON_TERMINATING`: UInt = 8192u;
public const val `FWP_ACTION_FLAG_TERMINATING`: UInt = 4096u;
public const val `FWP_ACTION_NONE`: `FWP_ACTION_TYPE` = 7u;
public const val `FWP_ACTION_NONE_NO_MATCH`: `FWP_ACTION_TYPE` = 8u;
public const val `FWP_ACTION_PERMIT`: `FWP_ACTION_TYPE` = 4098u;
public typealias `FWP_ACTION_TYPE` = UInt;
public const val `FWP_ACTRL_MATCH_FILTER`: UInt = 1u;
public typealias `FWP_AF` = Int;
public const val `FWP_AF_ETHER`: `FWP_AF` = 2;
public const val `FWP_AF_INET`: `FWP_AF` = 0;
public const val `FWP_AF_INET6`: `FWP_AF` = 1;
public const val `FWP_AF_NONE`: `FWP_AF` = 3;
public const val `FWP_BYTEMAP_ARRAY64_SIZE`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWP_BYTE_ARRAY16` (
    public var `byteArray16`: UByteArray,
)
// UNSUPPORTED Rust 2423:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWP_BYTE_ARRAY16 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWP_BYTE_ARRAY16_TYPE`: `FWP_DATA_TYPE` = 11;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWP_BYTE_ARRAY6` (
    public var `byteArray6`: UByteArray,
)
// UNSUPPORTED Rust 2434:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWP_BYTE_ARRAY6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWP_BYTE_ARRAY6_SIZE`: UInt = 6u;
public const val `FWP_BYTE_ARRAY6_TYPE`: `FWP_DATA_TYPE` = 18;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWP_BYTE_BLOB` (
    public var `size`: UInt,
    public var `data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 2447:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWP_BYTE_BLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWP_BYTE_BLOB_TYPE`: `FWP_DATA_TYPE` = 12;
public const val `FWP_CALLOUT_FLAG_ALLOW_L2_BATCH_CLASSIFY`: UInt = 128u;
public const val `FWP_CALLOUT_FLAG_ALLOW_MID_STREAM_INSPECTION`: UInt = 8u;
public const val `FWP_CALLOUT_FLAG_ALLOW_OFFLOAD`: UInt = 2u;
public const val `FWP_CALLOUT_FLAG_ALLOW_RECLASSIFY`: UInt = 16u;
public const val `FWP_CALLOUT_FLAG_ALLOW_RSC`: UInt = 64u;
public const val `FWP_CALLOUT_FLAG_ALLOW_URO`: UInt = 512u;
public const val `FWP_CALLOUT_FLAG_ALLOW_USO`: UInt = 256u;
public const val `FWP_CALLOUT_FLAG_CONDITIONAL_ON_FLOW`: UInt = 1u;
public const val `FWP_CALLOUT_FLAG_ENABLE_COMMIT_ADD_NOTIFY`: UInt = 4u;
public const val `FWP_CALLOUT_FLAG_RESERVED1`: UInt = 32u;
public const val `FWP_CALLOUT_FLAG_RESERVED2`: UInt = 1024u;
public const val `FWP_CLASSIFY_OPTION_LOCAL_ONLY_MAPPING`: `FWP_CLASSIFY_OPTION_TYPE` = 7;
public const val `FWP_CLASSIFY_OPTION_LOOSE_SOURCE_MAPPING`: `FWP_CLASSIFY_OPTION_TYPE` = 1;
public const val `FWP_CLASSIFY_OPTION_MAX`: `FWP_CLASSIFY_OPTION_TYPE` = 8;
public const val `FWP_CLASSIFY_OPTION_MCAST_BCAST_LIFETIME`: `FWP_CLASSIFY_OPTION_TYPE` = 3;
public const val `FWP_CLASSIFY_OPTION_MULTICAST_STATE`: `FWP_CLASSIFY_OPTION_TYPE` = 0;
public const val `FWP_CLASSIFY_OPTION_SECURE_SOCKET_AUTHIP_MM_POLICY_KEY`: `FWP_CLASSIFY_OPTION_TYPE` = 5;
public const val `FWP_CLASSIFY_OPTION_SECURE_SOCKET_AUTHIP_QM_POLICY_KEY`: `FWP_CLASSIFY_OPTION_TYPE` = 6;
public const val `FWP_CLASSIFY_OPTION_SECURE_SOCKET_SECURITY_FLAGS`: `FWP_CLASSIFY_OPTION_TYPE` = 4;
public typealias `FWP_CLASSIFY_OPTION_TYPE` = Int;
public const val `FWP_CLASSIFY_OPTION_UNICAST_LIFETIME`: `FWP_CLASSIFY_OPTION_TYPE` = 2;
public const val `FWP_CONDITION_FLAG_IS_APPCONTAINER_LOOPBACK`: UInt = 4194304u;
public const val `FWP_CONDITION_FLAG_IS_AUTH_FW`: UInt = 65536u;
public const val `FWP_CONDITION_FLAG_IS_CONNECTION_REDIRECTED`: UInt = 1048576u;
public const val `FWP_CONDITION_FLAG_IS_FRAGMENT`: UInt = 32u;
public const val `FWP_CONDITION_FLAG_IS_FRAGMENT_GROUP`: UInt = 64u;
public const val `FWP_CONDITION_FLAG_IS_HONORING_POLICY_AUTHORIZE`: UInt = 33554432u;
public const val `FWP_CONDITION_FLAG_IS_IMPLICIT_BIND`: UInt = 512u;
public const val `FWP_CONDITION_FLAG_IS_INBOUND_PASS_THRU`: UInt = 524288u;
public const val `FWP_CONDITION_FLAG_IS_IPSEC_NATT_RECLASSIFY`: UInt = 128u;
public const val `FWP_CONDITION_FLAG_IS_IPSEC_SECURED`: UInt = 2u;
public const val `FWP_CONDITION_FLAG_IS_LOOPBACK`: UInt = 1u;
public const val `FWP_CONDITION_FLAG_IS_NAME_APP_SPECIFIED`: UInt = 16384u;
public const val `FWP_CONDITION_FLAG_IS_NON_APPCONTAINER_LOOPBACK`: UInt = 8388608u;
public const val `FWP_CONDITION_FLAG_IS_OUTBOUND_PASS_THRU`: UInt = 262144u;
public const val `FWP_CONDITION_FLAG_IS_PROMISCUOUS`: UInt = 32768u;
public const val `FWP_CONDITION_FLAG_IS_PROXY_CONNECTION`: UInt = 2097152u;
public const val `FWP_CONDITION_FLAG_IS_RAW_ENDPOINT`: UInt = 16u;
public const val `FWP_CONDITION_FLAG_IS_REASSEMBLED`: UInt = 1024u;
public const val `FWP_CONDITION_FLAG_IS_REAUTHORIZE`: UInt = 4u;
public const val `FWP_CONDITION_FLAG_IS_RECLASSIFY`: UInt = 131072u;
public const val `FWP_CONDITION_FLAG_IS_RESERVED`: UInt = 16777216u;
public const val `FWP_CONDITION_FLAG_IS_WILDCARD_BIND`: UInt = 8u;
public const val `FWP_CONDITION_FLAG_REQUIRES_ALE_CLASSIFY`: UInt = 256u;
public const val `FWP_CONDITION_L2_IF_CONNECTOR_PRESENT`: UInt = 128u;
public const val `FWP_CONDITION_L2_IS_IP_FRAGMENT_GROUP`: UInt = 64u;
public const val `FWP_CONDITION_L2_IS_MALFORMED_PACKET`: UInt = 32u;
public const val `FWP_CONDITION_L2_IS_MOBILE_BROADBAND`: UInt = 4u;
public const val `FWP_CONDITION_L2_IS_NATIVE_ETHERNET`: UInt = 1u;
public const val `FWP_CONDITION_L2_IS_VM2VM`: UInt = 16u;
public const val `FWP_CONDITION_L2_IS_WIFI`: UInt = 2u;
public const val `FWP_CONDITION_L2_IS_WIFI_DIRECT_DATA`: UInt = 8u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_CHECK_OFFLOAD`: UInt = 65536u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_CLASSIFY_COMPLETION`: UInt = 16u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_EDP_POLICY_CHANGED`: UInt = 512u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_IPSEC_PROPERTIES_CHANGED`: UInt = 32u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_MID_STREAM_INSPECTION`: UInt = 64u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_NEW_ARRIVAL_INTERFACE`: UInt = 2u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_NEW_INBOUND_MCAST_BCAST_PACKET`: UInt = 256u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_NEW_NEXTHOP_INTERFACE`: UInt = 4u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_POLICY_CHANGE`: UInt = 1u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_PROFILE_CROSSING`: UInt = 8u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_PROXY_HANDLE_CHANGED`: UInt = 16384u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_SOCKET_PROPERTY_CHANGED`: UInt = 128u;
public const val `FWP_CONDITION_SOCKET_PROPERTY_FLAG_ALLOW_EDGE_TRAFFIC`: UInt = 2u;
public const val `FWP_CONDITION_SOCKET_PROPERTY_FLAG_DENY_EDGE_TRAFFIC`: UInt = 4u;
public const val `FWP_CONDITION_SOCKET_PROPERTY_FLAG_IS_SYSTEM_PORT_RPC`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWP_CONDITION_VALUE0` (
    public var `type`: `FWP_DATA_TYPE`,
    public var `Anonymous`: `FWP_CONDITION_VALUE0_0`,
)
// UNSUPPORTED Rust 2527:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWP_CONDITION_VALUE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2533:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWP_CONDITION_VALUE0_0 {
//     pub uint8: u8,
//     pub uint16: u16,
//     pub uint32: u32,
//     pub uint64: *mut u64,
//     pub int8: i8,
//     pub int16: i16,
//     pub int32: i32,
//     pub int64: *mut i64,
//     pub float32: f32,
//     pub double64: *mut f64,
//     pub byteArray16: *mut FWP_BYTE_ARRAY16,
//     pub byteBlob: *mut FWP_BYTE_BLOB,
//     pub sid: *mut super::super::Security::SID,
//     pub sd: *mut FWP_BYTE_BLOB,
//     pub tokenInformation: *mut FWP_TOKEN_INFORMATION,
//     pub tokenAccessInformation: *mut FWP_BYTE_BLOB,
//     pub unicodeString: windows_sys::core::PWSTR,
//     pub byteArray6: *mut FWP_BYTE_ARRAY6,
//     pub v4AddrMask: *mut FWP_V4_ADDR_AND_MASK,
//     pub v6AddrMask: *mut FWP_V6_ADDR_AND_MASK,
//     pub rangeValue: *mut FWP_RANGE0,
// }

// UNSUPPORTED Rust 2559:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWP_CONDITION_VALUE0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FWP_DATA_TYPE` = Int;
public const val `FWP_DATA_TYPE_MAX`: `FWP_DATA_TYPE` = 259;
public typealias `FWP_DIRECTION` = Int;
public const val `FWP_DIRECTION_INBOUND`: `FWP_DIRECTION` = 1;
public const val `FWP_DIRECTION_MAX`: `FWP_DIRECTION` = 2;
public const val `FWP_DIRECTION_OUTBOUND`: `FWP_DIRECTION` = 0;
public const val `FWP_DOUBLE`: `FWP_DATA_TYPE` = 10;
public const val `FWP_EMPTY`: `FWP_DATA_TYPE` = 0;
public typealias `FWP_ETHER_ENCAP_METHOD` = Int;
public const val `FWP_ETHER_ENCAP_METHOD_ETHER_V2`: `FWP_ETHER_ENCAP_METHOD` = 0;
public const val `FWP_ETHER_ENCAP_METHOD_SNAP`: `FWP_ETHER_ENCAP_METHOD` = 1;
public const val `FWP_ETHER_ENCAP_METHOD_SNAP_W_OUI_ZERO`: `FWP_ETHER_ENCAP_METHOD` = 3;
public const val `FWP_FILTER_ENUM_FLAG_BEST_TERMINATING_MATCH`: UInt = 1u;
public const val `FWP_FILTER_ENUM_FLAG_BOOTTIME_ONLY`: UInt = 4u;
public const val `FWP_FILTER_ENUM_FLAG_INCLUDE_BOOTTIME`: UInt = 8u;
public const val `FWP_FILTER_ENUM_FLAG_INCLUDE_DISABLED`: UInt = 16u;
public const val `FWP_FILTER_ENUM_FLAG_RESERVED1`: UInt = 32u;
public const val `FWP_FILTER_ENUM_FLAG_SORTED`: UInt = 2u;
public const val `FWP_FILTER_ENUM_FULLY_CONTAINED`: `FWP_FILTER_ENUM_TYPE` = 0;
public const val `FWP_FILTER_ENUM_OVERLAPPING`: `FWP_FILTER_ENUM_TYPE` = 1;
public typealias `FWP_FILTER_ENUM_TYPE` = Int;
public const val `FWP_FILTER_ENUM_TYPE_MAX`: `FWP_FILTER_ENUM_TYPE` = 2;
public const val `FWP_FLOAT`: `FWP_DATA_TYPE` = 9;
public const val `FWP_INT16`: `FWP_DATA_TYPE` = 6;
public const val `FWP_INT32`: `FWP_DATA_TYPE` = 7;
public const val `FWP_INT64`: `FWP_DATA_TYPE` = 8;
public const val `FWP_INT8`: `FWP_DATA_TYPE` = 5;
public typealias `FWP_IP_VERSION` = Int;
public const val `FWP_IP_VERSION_MAX`: `FWP_IP_VERSION` = 3;
public const val `FWP_IP_VERSION_NONE`: `FWP_IP_VERSION` = 2;
public const val `FWP_IP_VERSION_V4`: `FWP_IP_VERSION` = 0;
public const val `FWP_IP_VERSION_V6`: `FWP_IP_VERSION` = 1;
public const val `FWP_MATCH_EQUAL`: `FWP_MATCH_TYPE` = 0;
public const val `FWP_MATCH_EQUAL_CASE_INSENSITIVE`: `FWP_MATCH_TYPE` = 9;
public const val `FWP_MATCH_FLAGS_ALL_SET`: `FWP_MATCH_TYPE` = 6;
public const val `FWP_MATCH_FLAGS_ANY_SET`: `FWP_MATCH_TYPE` = 7;
public const val `FWP_MATCH_FLAGS_NONE_SET`: `FWP_MATCH_TYPE` = 8;
public const val `FWP_MATCH_GREATER`: `FWP_MATCH_TYPE` = 1;
public const val `FWP_MATCH_GREATER_OR_EQUAL`: `FWP_MATCH_TYPE` = 3;
public const val `FWP_MATCH_LESS`: `FWP_MATCH_TYPE` = 2;
public const val `FWP_MATCH_LESS_OR_EQUAL`: `FWP_MATCH_TYPE` = 4;
public const val `FWP_MATCH_NOT_EQUAL`: `FWP_MATCH_TYPE` = 10;
public const val `FWP_MATCH_NOT_PREFIX`: `FWP_MATCH_TYPE` = 12;
public const val `FWP_MATCH_PREFIX`: `FWP_MATCH_TYPE` = 11;
public const val `FWP_MATCH_RANGE`: `FWP_MATCH_TYPE` = 5;
public typealias `FWP_MATCH_TYPE` = Int;
public const val `FWP_MATCH_TYPE_MAX`: `FWP_MATCH_TYPE` = 13;
public const val `FWP_NETWORK_CONNECTION_POLICY_MAX`: `FWP_NETWORK_CONNECTION_POLICY_SETTING_TYPE` = 3;
public const val `FWP_NETWORK_CONNECTION_POLICY_NEXT_HOP`: `FWP_NETWORK_CONNECTION_POLICY_SETTING_TYPE` = 2;
public const val `FWP_NETWORK_CONNECTION_POLICY_NEXT_HOP_INTERFACE`: `FWP_NETWORK_CONNECTION_POLICY_SETTING_TYPE` = 1;
public typealias `FWP_NETWORK_CONNECTION_POLICY_SETTING_TYPE` = Int;
public const val `FWP_NETWORK_CONNECTION_POLICY_SOURCE_ADDRESS`: `FWP_NETWORK_CONNECTION_POLICY_SETTING_TYPE` = 0;
public const val `FWP_OPTION_VALUE_ALLOW_GLOBAL_MULTICAST_STATE`: UInt = 2u;
public const val `FWP_OPTION_VALUE_ALLOW_MULTICAST_STATE`: UInt = 0u;
public const val `FWP_OPTION_VALUE_DENY_MULTICAST_STATE`: UInt = 1u;
public const val `FWP_OPTION_VALUE_DISABLE_LOCAL_ONLY_MAPPING`: UInt = 0u;
public const val `FWP_OPTION_VALUE_DISABLE_LOOSE_SOURCE`: UInt = 0u;
public const val `FWP_OPTION_VALUE_ENABLE_LOCAL_ONLY_MAPPING`: UInt = 1u;
public const val `FWP_OPTION_VALUE_ENABLE_LOOSE_SOURCE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWP_RANGE0` (
    public var `valueLow`: `FWP_VALUE0`,
    public var `valueHigh`: `FWP_VALUE0`,
)
// UNSUPPORTED Rust 2631:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWP_RANGE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWP_RANGE_TYPE`: `FWP_DATA_TYPE` = 258;
public const val `FWP_SECURITY_DESCRIPTOR_TYPE`: `FWP_DATA_TYPE` = 14;
public const val `FWP_SID`: `FWP_DATA_TYPE` = 13;
public const val `FWP_SINGLE_DATA_TYPE_MAX`: `FWP_DATA_TYPE` = 255;
public const val `FWP_TOKEN_ACCESS_INFORMATION_TYPE`: `FWP_DATA_TYPE` = 16;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWP_TOKEN_INFORMATION` (
    public var `sidCount`: UInt,
    public var `sids`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID_AND_ATTRIBUTES`>?,
    public var `restrictedSidCount`: UInt,
    public var `restrictedSids`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID_AND_ATTRIBUTES`>?,
)
// UNSUPPORTED Rust 2651:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWP_TOKEN_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWP_TOKEN_INFORMATION_TYPE`: `FWP_DATA_TYPE` = 15;
public const val `FWP_UINT16`: `FWP_DATA_TYPE` = 2;
public const val `FWP_UINT32`: `FWP_DATA_TYPE` = 3;
public const val `FWP_UINT64`: `FWP_DATA_TYPE` = 4;
public const val `FWP_UINT8`: `FWP_DATA_TYPE` = 1;
public const val `FWP_UNICODE_STRING_TYPE`: `FWP_DATA_TYPE` = 17;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FWP_V4_ADDR_AND_MASK` (
    public var `addr`: UInt,
    public var `mask`: UInt,
)
public const val `FWP_V4_ADDR_MASK`: `FWP_DATA_TYPE` = 256;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWP_V6_ADDR_AND_MASK` (
    public var `addr`: UByteArray,
    public var `prefixLength`: UByte,
)
// UNSUPPORTED Rust 2676:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FWP_V6_ADDR_AND_MASK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWP_V6_ADDR_MASK`: `FWP_DATA_TYPE` = 257;
public const val `FWP_V6_ADDR_SIZE`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FWP_VALUE0` (
    public var `type`: `FWP_DATA_TYPE`,
    public var `Anonymous`: `FWP_VALUE0_0`,
)
// UNSUPPORTED Rust 2690:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWP_VALUE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2696:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWP_VALUE0_0 {
//     pub uint8: u8,
//     pub uint16: u16,
//     pub uint32: u32,
//     pub uint64: *mut u64,
//     pub int8: i8,
//     pub int16: i16,
//     pub int32: i32,
//     pub int64: *mut i64,
//     pub float32: f32,
//     pub double64: *mut f64,
//     pub byteArray16: *mut FWP_BYTE_ARRAY16,
//     pub byteBlob: *mut FWP_BYTE_BLOB,
//     pub sid: *mut super::super::Security::SID,
//     pub sd: *mut FWP_BYTE_BLOB,
//     pub tokenInformation: *mut FWP_TOKEN_INFORMATION,
//     pub tokenAccessInformation: *mut FWP_BYTE_BLOB,
//     pub unicodeString: windows_sys::core::PWSTR,
//     pub byteArray6: *mut FWP_BYTE_ARRAY6,
// }

// UNSUPPORTED Rust 2719:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for FWP_VALUE0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FWP_VSWITCH_NETWORK_TYPE` = Int;
public const val `FWP_VSWITCH_NETWORK_TYPE_EXTERNAL`: `FWP_VSWITCH_NETWORK_TYPE` = 3;
public const val `FWP_VSWITCH_NETWORK_TYPE_INTERNAL`: `FWP_VSWITCH_NETWORK_TYPE` = 2;
public const val `FWP_VSWITCH_NETWORK_TYPE_PRIVATE`: `FWP_VSWITCH_NETWORK_TYPE` = 1;
public const val `FWP_VSWITCH_NETWORK_TYPE_UNKNOWN`: `FWP_VSWITCH_NETWORK_TYPE` = 0;
public const val `IKEEXT_ANONYMOUS`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 3;
public typealias `IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_AUTHENTICATION_METHOD0` (
    public var `authenticationMethodType`: `IKEEXT_AUTHENTICATION_METHOD_TYPE`,
    public var `Anonymous`: `IKEEXT_AUTHENTICATION_METHOD0_0`,
)
// UNSUPPORTED Rust 2738:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_AUTHENTICATION_METHOD0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2743:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_AUTHENTICATION_METHOD0_0 {
//     pub presharedKeyAuthentication: IKEEXT_PRESHARED_KEY_AUTHENTICATION0,
//     pub certificateAuthentication: IKEEXT_CERTIFICATE_AUTHENTICATION0,
//     pub kerberosAuthentication: IKEEXT_KERBEROS_AUTHENTICATION0,
//     pub ntlmV2Authentication: IKEEXT_NTLM_V2_AUTHENTICATION0,
//     pub sslAuthentication: IKEEXT_CERTIFICATE_AUTHENTICATION0,
//     pub cgaAuthentication: IKEEXT_IPV6_CGA_AUTHENTICATION0,
// }

// UNSUPPORTED Rust 2753:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_AUTHENTICATION_METHOD0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_AUTHENTICATION_METHOD1` (
    public var `authenticationMethodType`: `IKEEXT_AUTHENTICATION_METHOD_TYPE`,
    public var `Anonymous`: `IKEEXT_AUTHENTICATION_METHOD1_0`,
)
// UNSUPPORTED Rust 2764:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_AUTHENTICATION_METHOD1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2769:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_AUTHENTICATION_METHOD1_0 {
//     pub presharedKeyAuthentication: IKEEXT_PRESHARED_KEY_AUTHENTICATION1,
//     pub certificateAuthentication: IKEEXT_CERTIFICATE_AUTHENTICATION1,
//     pub kerberosAuthentication: IKEEXT_KERBEROS_AUTHENTICATION0,
//     pub ntlmV2Authentication: IKEEXT_NTLM_V2_AUTHENTICATION0,
//     pub sslAuthentication: IKEEXT_CERTIFICATE_AUTHENTICATION1,
//     pub cgaAuthentication: IKEEXT_IPV6_CGA_AUTHENTICATION0,
//     pub eapAuthentication: IKEEXT_EAP_AUTHENTICATION0,
// }

// UNSUPPORTED Rust 2780:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_AUTHENTICATION_METHOD1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_AUTHENTICATION_METHOD2` (
    public var `authenticationMethodType`: `IKEEXT_AUTHENTICATION_METHOD_TYPE`,
    public var `Anonymous`: `IKEEXT_AUTHENTICATION_METHOD2_0`,
)
// UNSUPPORTED Rust 2791:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_AUTHENTICATION_METHOD2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2796:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_AUTHENTICATION_METHOD2_0 {
//     pub presharedKeyAuthentication: IKEEXT_PRESHARED_KEY_AUTHENTICATION1,
//     pub certificateAuthentication: IKEEXT_CERTIFICATE_AUTHENTICATION2,
//     pub kerberosAuthentication: IKEEXT_KERBEROS_AUTHENTICATION1,
//     pub reservedAuthentication: IKEEXT_RESERVED_AUTHENTICATION0,
//     pub ntlmV2Authentication: IKEEXT_NTLM_V2_AUTHENTICATION0,
//     pub sslAuthentication: IKEEXT_CERTIFICATE_AUTHENTICATION2,
//     pub cgaAuthentication: IKEEXT_IPV6_CGA_AUTHENTICATION0,
//     pub eapAuthentication: IKEEXT_EAP_AUTHENTICATION0,
// }

// UNSUPPORTED Rust 2808:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_AUTHENTICATION_METHOD2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IKEEXT_AUTHENTICATION_METHOD_TYPE` = Int;
public const val `IKEEXT_AUTHENTICATION_METHOD_TYPE_MAX`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 13;
public const val `IKEEXT_CERTIFICATE`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_CERTIFICATE_AUTHENTICATION0` (
    public var `inboundConfigType`: `IKEEXT_CERT_CONFIG_TYPE`,
    public var `Anonymous1`: `IKEEXT_CERTIFICATE_AUTHENTICATION0_0`,
    public var `outboundConfigType`: `IKEEXT_CERT_CONFIG_TYPE`,
    public var `Anonymous2`: `IKEEXT_CERTIFICATE_AUTHENTICATION0_1`,
    public var `flags`: `IKEEXT_CERT_AUTH`,
)
// UNSUPPORTED Rust 2825:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2830:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_CERTIFICATE_AUTHENTICATION0_0 {
//     pub Anonymous: IKEEXT_CERTIFICATE_AUTHENTICATION0_0_0,
//     pub inboundEnterpriseStoreConfig: *mut IKEEXT_CERT_ROOT_CONFIG0,
//     pub inboundTrustedRootStoreConfig: *mut IKEEXT_CERT_ROOT_CONFIG0,
// }

// UNSUPPORTED Rust 2837:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION0_0 {
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
public class `IKEEXT_CERTIFICATE_AUTHENTICATION0_0_0` (
    public var `inboundRootArraySize`: UInt,
    public var `inboundRootArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_CERT_ROOT_CONFIG0`>?,
)
// UNSUPPORTED Rust 2848:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION0_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2853:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_CERTIFICATE_AUTHENTICATION0_1 {
//     pub Anonymous: IKEEXT_CERTIFICATE_AUTHENTICATION0_1_0,
//     pub outboundEnterpriseStoreConfig: *mut IKEEXT_CERT_ROOT_CONFIG0,
//     pub outboundTrustedRootStoreConfig: *mut IKEEXT_CERT_ROOT_CONFIG0,
// }

// UNSUPPORTED Rust 2860:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION0_1 {
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
public class `IKEEXT_CERTIFICATE_AUTHENTICATION0_1_0` (
    public var `outboundRootArraySize`: UInt,
    public var `outboundRootArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_CERT_ROOT_CONFIG0`>?,
)
// UNSUPPORTED Rust 2871:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION0_1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_CERTIFICATE_AUTHENTICATION1` (
    public var `inboundConfigType`: `IKEEXT_CERT_CONFIG_TYPE`,
    public var `Anonymous1`: `IKEEXT_CERTIFICATE_AUTHENTICATION1_0`,
    public var `outboundConfigType`: `IKEEXT_CERT_CONFIG_TYPE`,
    public var `Anonymous2`: `IKEEXT_CERTIFICATE_AUTHENTICATION1_1`,
    public var `flags`: `IKEEXT_CERT_AUTH`,
    public var `localCertLocationUrl`: `FWP_BYTE_BLOB`,
)
// UNSUPPORTED Rust 2886:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2891:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_CERTIFICATE_AUTHENTICATION1_0 {
//     pub Anonymous: IKEEXT_CERTIFICATE_AUTHENTICATION1_0_0,
//     pub inboundEnterpriseStoreConfig: *mut IKEEXT_CERT_ROOT_CONFIG0,
//     pub inboundTrustedRootStoreConfig: *mut IKEEXT_CERT_ROOT_CONFIG0,
// }

// UNSUPPORTED Rust 2898:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION1_0 {
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
public class `IKEEXT_CERTIFICATE_AUTHENTICATION1_0_0` (
    public var `inboundRootArraySize`: UInt,
    public var `inboundRootArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_CERT_ROOT_CONFIG0`>?,
)
// UNSUPPORTED Rust 2909:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION1_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2914:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_CERTIFICATE_AUTHENTICATION1_1 {
//     pub Anonymous: IKEEXT_CERTIFICATE_AUTHENTICATION1_1_0,
//     pub outboundEnterpriseStoreConfig: *mut IKEEXT_CERT_ROOT_CONFIG0,
//     pub outboundTrustedRootStoreConfig: *mut IKEEXT_CERT_ROOT_CONFIG0,
// }

// UNSUPPORTED Rust 2921:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION1_1 {
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
public class `IKEEXT_CERTIFICATE_AUTHENTICATION1_1_0` (
    public var `outboundRootArraySize`: UInt,
    public var `outboundRootArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_CERT_ROOT_CONFIG0`>?,
)
// UNSUPPORTED Rust 2932:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION1_1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_CERTIFICATE_AUTHENTICATION2` (
    public var `inboundConfigType`: `IKEEXT_CERT_CONFIG_TYPE`,
    public var `Anonymous1`: `IKEEXT_CERTIFICATE_AUTHENTICATION2_0`,
    public var `outboundConfigType`: `IKEEXT_CERT_CONFIG_TYPE`,
    public var `Anonymous2`: `IKEEXT_CERTIFICATE_AUTHENTICATION2_1`,
    public var `flags`: `IKEEXT_CERT_AUTH`,
    public var `localCertLocationUrl`: `FWP_BYTE_BLOB`,
)
// UNSUPPORTED Rust 2947:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2952:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_CERTIFICATE_AUTHENTICATION2_0 {
//     pub Anonymous1: IKEEXT_CERTIFICATE_AUTHENTICATION2_0_0,
//     pub Anonymous2: IKEEXT_CERTIFICATE_AUTHENTICATION2_0_1,
//     pub Anonymous3: IKEEXT_CERTIFICATE_AUTHENTICATION2_0_2,
// }

// UNSUPPORTED Rust 2959:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION2_0 {
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
public class `IKEEXT_CERTIFICATE_AUTHENTICATION2_0_0` (
    public var `inboundRootArraySize`: UInt,
    public var `inboundRootCriteria`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_CERTIFICATE_CRITERIA0`>?,
)
// UNSUPPORTED Rust 2970:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION2_0_0 {
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
public class `IKEEXT_CERTIFICATE_AUTHENTICATION2_0_1` (
    public var `inboundEnterpriseStoreArraySize`: UInt,
    public var `inboundEnterpriseStoreCriteria`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_CERTIFICATE_CRITERIA0`>?,
)
// UNSUPPORTED Rust 2981:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION2_0_1 {
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
public class `IKEEXT_CERTIFICATE_AUTHENTICATION2_0_2` (
    public var `inboundRootStoreArraySize`: UInt,
    public var `inboundTrustedRootStoreCriteria`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_CERTIFICATE_CRITERIA0`>?,
)
// UNSUPPORTED Rust 2992:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION2_0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2997:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_CERTIFICATE_AUTHENTICATION2_1 {
//     pub Anonymous1: IKEEXT_CERTIFICATE_AUTHENTICATION2_1_0,
//     pub Anonymous2: IKEEXT_CERTIFICATE_AUTHENTICATION2_1_1,
//     pub Anonymous3: IKEEXT_CERTIFICATE_AUTHENTICATION2_1_2,
// }

// UNSUPPORTED Rust 3004:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION2_1 {
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
public class `IKEEXT_CERTIFICATE_AUTHENTICATION2_1_0` (
    public var `outboundRootArraySize`: UInt,
    public var `outboundRootCriteria`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_CERTIFICATE_CRITERIA0`>?,
)
// UNSUPPORTED Rust 3015:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION2_1_0 {
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
public class `IKEEXT_CERTIFICATE_AUTHENTICATION2_1_1` (
    public var `outboundEnterpriseStoreArraySize`: UInt,
    public var `outboundEnterpriseStoreCriteria`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_CERTIFICATE_CRITERIA0`>?,
)
// UNSUPPORTED Rust 3026:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION2_1_1 {
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
public class `IKEEXT_CERTIFICATE_AUTHENTICATION2_1_2` (
    public var `outboundRootStoreArraySize`: UInt,
    public var `outboundTrustedRootStoreCriteria`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_CERTIFICATE_CRITERIA0`>?,
)
// UNSUPPORTED Rust 3037:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION2_1_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IKEEXT_CERTIFICATE_CREDENTIAL0` (
    public var `subjectName`: `FWP_BYTE_BLOB`,
    public var `certHash`: `FWP_BYTE_BLOB`,
    public var `flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IKEEXT_CERTIFICATE_CREDENTIAL1` (
    public var `subjectName`: `FWP_BYTE_BLOB`,
    public var `certHash`: `FWP_BYTE_BLOB`,
    public var `flags`: UInt,
    public var `certificate`: `FWP_BYTE_BLOB`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_CERTIFICATE_CRITERIA0` (
    public var `certData`: `FWP_BYTE_BLOB`,
    public var `certHash`: `FWP_BYTE_BLOB`,
    public var `eku`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_CERT_EKUS0`>?,
    public var `name`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_CERT_NAME0`>?,
    public var `flags`: UInt,
)
// UNSUPPORTED Rust 3066:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CERTIFICATE_CRITERIA0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IKEEXT_CERTIFICATE_ECDSA_P256`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 7;
public const val `IKEEXT_CERTIFICATE_ECDSA_P384`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 8;
public typealias `IKEEXT_CERT_AUTH` = UInt;
public const val `IKEEXT_CERT_AUTH_ALLOW_HTTP_CERT_LOOKUP`: `IKEEXT_CERT_AUTH` = 16u;
public const val `IKEEXT_CERT_AUTH_DISABLE_SSL_CERT_VALIDATION`: `IKEEXT_CERT_AUTH` = 8u;
public const val `IKEEXT_CERT_AUTH_ENABLE_CRL_CHECK_STRONG`: `IKEEXT_CERT_AUTH` = 4u;
public const val `IKEEXT_CERT_AUTH_FLAG_DISABLE_CRL_CHECK`: UInt = 2u;
public const val `IKEEXT_CERT_AUTH_FLAG_DISABLE_REQUEST_PAYLOAD`: UInt = 64u;
public const val `IKEEXT_CERT_AUTH_FLAG_SSL_ONE_WAY`: `IKEEXT_CERT_AUTH` = 1u;
public const val `IKEEXT_CERT_AUTH_URL_CONTAINS_BUNDLE`: `IKEEXT_CERT_AUTH` = 32u;
public const val `IKEEXT_CERT_CONFIG_ENTERPRISE_STORE`: `IKEEXT_CERT_CONFIG_TYPE` = 1;
public const val `IKEEXT_CERT_CONFIG_EXPLICIT_TRUST_LIST`: `IKEEXT_CERT_CONFIG_TYPE` = 0;
public const val `IKEEXT_CERT_CONFIG_TRUSTED_ROOT_STORE`: `IKEEXT_CERT_CONFIG_TYPE` = 2;
public typealias `IKEEXT_CERT_CONFIG_TYPE` = Int;
public const val `IKEEXT_CERT_CONFIG_TYPE_MAX`: `IKEEXT_CERT_CONFIG_TYPE` = 4;
public const val `IKEEXT_CERT_CONFIG_UNSPECIFIED`: `IKEEXT_CERT_CONFIG_TYPE` = 3;
public const val `IKEEXT_CERT_CREDENTIAL_FLAG_NAP_CERT`: UInt = 1u;
public const val `IKEEXT_CERT_CRITERIA_CN`: `IKEEXT_CERT_CRITERIA_NAME_TYPE` = 3;
public const val `IKEEXT_CERT_CRITERIA_DC`: `IKEEXT_CERT_CRITERIA_NAME_TYPE` = 6;
public const val `IKEEXT_CERT_CRITERIA_DNS`: `IKEEXT_CERT_CRITERIA_NAME_TYPE` = 0;
public typealias `IKEEXT_CERT_CRITERIA_NAME_TYPE` = Int;
public const val `IKEEXT_CERT_CRITERIA_NAME_TYPE_MAX`: `IKEEXT_CERT_CRITERIA_NAME_TYPE` = 7;
public const val `IKEEXT_CERT_CRITERIA_O`: `IKEEXT_CERT_CRITERIA_NAME_TYPE` = 5;
public const val `IKEEXT_CERT_CRITERIA_OU`: `IKEEXT_CERT_CRITERIA_NAME_TYPE` = 4;
public const val `IKEEXT_CERT_CRITERIA_RFC822`: `IKEEXT_CERT_CRITERIA_NAME_TYPE` = 2;
public const val `IKEEXT_CERT_CRITERIA_UPN`: `IKEEXT_CERT_CRITERIA_NAME_TYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_CERT_EKUS0` (
    public var `numEku`: UInt,
    public var `eku`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?,
)
// UNSUPPORTED Rust 3103:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CERT_EKUS0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IKEEXT_CERT_FLAGS` = UInt;
public const val `IKEEXT_CERT_FLAG_DISABLE_REQUEST_PAYLOAD`: `IKEEXT_CERT_FLAGS` = 2u;
public const val `IKEEXT_CERT_FLAG_ENABLE_ACCOUNT_MAPPING`: `IKEEXT_CERT_FLAGS` = 1u;
public const val `IKEEXT_CERT_FLAG_FOLLOW_RENEWAL_CERTIFICATE`: `IKEEXT_CERT_FLAGS` = 256u;
public const val `IKEEXT_CERT_FLAG_IGNORE_INIT_CERT_MAP_FAILURE`: `IKEEXT_CERT_FLAGS` = 16u;
public const val `IKEEXT_CERT_FLAG_INTERMEDIATE_CA`: `IKEEXT_CERT_FLAGS` = 8u;
public const val `IKEEXT_CERT_FLAG_PREFER_NAP_CERTIFICATE_OUTBOUND`: `IKEEXT_CERT_FLAGS` = 32u;
public const val `IKEEXT_CERT_FLAG_SELECT_NAP_CERTIFICATE`: `IKEEXT_CERT_FLAGS` = 64u;
public const val `IKEEXT_CERT_FLAG_USE_NAP_CERTIFICATE`: `IKEEXT_CERT_FLAGS` = 4u;
public const val `IKEEXT_CERT_FLAG_VERIFY_NAP_CERTIFICATE`: `IKEEXT_CERT_FLAGS` = 128u;
public const val `IKEEXT_CERT_HASH_LEN`: UInt = 20u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_CERT_NAME0` (
    public var `nameType`: `IKEEXT_CERT_CRITERIA_NAME_TYPE`,
    public var `certName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 3125:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CERT_NAME0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IKEEXT_CERT_ROOT_CONFIG0` (
    public var `certData`: `FWP_BYTE_BLOB`,
    public var `flags`: `IKEEXT_CERT_FLAGS`,
)
public const val `IKEEXT_CIPHER_3DES`: `IKEEXT_CIPHER_TYPE` = 1;
public const val `IKEEXT_CIPHER_AES_128`: `IKEEXT_CIPHER_TYPE` = 2;
public const val `IKEEXT_CIPHER_AES_192`: `IKEEXT_CIPHER_TYPE` = 3;
public const val `IKEEXT_CIPHER_AES_256`: `IKEEXT_CIPHER_TYPE` = 4;
public const val `IKEEXT_CIPHER_AES_GCM_128_16ICV`: `IKEEXT_CIPHER_TYPE` = 5;
public const val `IKEEXT_CIPHER_AES_GCM_256_16ICV`: `IKEEXT_CIPHER_TYPE` = 6;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IKEEXT_CIPHER_ALGORITHM0` (
    public var `algoIdentifier`: `IKEEXT_CIPHER_TYPE`,
    public var `keyLen`: UInt,
    public var `rounds`: UInt,
)
public const val `IKEEXT_CIPHER_DES`: `IKEEXT_CIPHER_TYPE` = 0;
public typealias `IKEEXT_CIPHER_TYPE` = Int;
public const val `IKEEXT_CIPHER_TYPE_MAX`: `IKEEXT_CIPHER_TYPE` = 7;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IKEEXT_COMMON_STATISTICS0` (
    public var `v4Statistics`: `IKEEXT_IP_VERSION_SPECIFIC_COMMON_STATISTICS0`,
    public var `v6Statistics`: `IKEEXT_IP_VERSION_SPECIFIC_COMMON_STATISTICS0`,
    public var `totalPacketsReceived`: UInt,
    public var `totalInvalidPacketsReceived`: UInt,
    public var `currentQueuedWorkitems`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IKEEXT_COMMON_STATISTICS1` (
    public var `v4Statistics`: `IKEEXT_IP_VERSION_SPECIFIC_COMMON_STATISTICS1`,
    public var `v6Statistics`: `IKEEXT_IP_VERSION_SPECIFIC_COMMON_STATISTICS1`,
    public var `totalPacketsReceived`: UInt,
    public var `totalInvalidPacketsReceived`: UInt,
    public var `currentQueuedWorkitems`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IKEEXT_COOKIE_PAIR0` (
    public var `initiator`: ULong,
    public var `responder`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_CREDENTIAL0` (
    public var `authenticationMethodType`: `IKEEXT_AUTHENTICATION_METHOD_TYPE`,
    public var `impersonationType`: `IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE`,
    public var `Anonymous`: `IKEEXT_CREDENTIAL0_0`,
)
// UNSUPPORTED Rust 3183:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CREDENTIAL0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3188:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_CREDENTIAL0_0 {
//     pub presharedKey: *mut IKEEXT_PRESHARED_KEY_AUTHENTICATION0,
//     pub certificate: *mut IKEEXT_CERTIFICATE_CREDENTIAL0,
//     pub name: *mut IKEEXT_NAME_CREDENTIAL0,
// }

// UNSUPPORTED Rust 3195:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CREDENTIAL0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_CREDENTIAL1` (
    public var `authenticationMethodType`: `IKEEXT_AUTHENTICATION_METHOD_TYPE`,
    public var `impersonationType`: `IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE`,
    public var `Anonymous`: `IKEEXT_CREDENTIAL1_0`,
)
// UNSUPPORTED Rust 3207:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CREDENTIAL1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3212:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_CREDENTIAL1_0 {
//     pub presharedKey: *mut IKEEXT_PRESHARED_KEY_AUTHENTICATION1,
//     pub certificate: *mut IKEEXT_CERTIFICATE_CREDENTIAL1,
//     pub name: *mut IKEEXT_NAME_CREDENTIAL0,
// }

// UNSUPPORTED Rust 3219:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CREDENTIAL1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_CREDENTIAL2` (
    public var `authenticationMethodType`: `IKEEXT_AUTHENTICATION_METHOD_TYPE`,
    public var `impersonationType`: `IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE`,
    public var `Anonymous`: `IKEEXT_CREDENTIAL2_0`,
)
// UNSUPPORTED Rust 3231:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CREDENTIAL2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3236:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_CREDENTIAL2_0 {
//     pub presharedKey: *mut IKEEXT_PRESHARED_KEY_AUTHENTICATION1,
//     pub certificate: *mut IKEEXT_CERTIFICATE_CREDENTIAL1,
//     pub name: *mut IKEEXT_NAME_CREDENTIAL0,
// }

// UNSUPPORTED Rust 3243:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CREDENTIAL2_0 {
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
public class `IKEEXT_CREDENTIALS0` (
    public var `numCredentials`: UInt,
    public var `credentials`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_CREDENTIAL_PAIR0`>?,
)
// UNSUPPORTED Rust 3254:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CREDENTIALS0 {
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
public class `IKEEXT_CREDENTIALS1` (
    public var `numCredentials`: UInt,
    public var `credentials`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_CREDENTIAL_PAIR1`>?,
)
// UNSUPPORTED Rust 3265:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CREDENTIALS1 {
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
public class `IKEEXT_CREDENTIALS2` (
    public var `numCredentials`: UInt,
    public var `credentials`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_CREDENTIAL_PAIR2`>?,
)
// UNSUPPORTED Rust 3276:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CREDENTIALS2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_CREDENTIAL_PAIR0` (
    public var `localCredentials`: `IKEEXT_CREDENTIAL0`,
    public var `peerCredentials`: `IKEEXT_CREDENTIAL0`,
)
// UNSUPPORTED Rust 3287:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CREDENTIAL_PAIR0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_CREDENTIAL_PAIR1` (
    public var `localCredentials`: `IKEEXT_CREDENTIAL1`,
    public var `peerCredentials`: `IKEEXT_CREDENTIAL1`,
)
// UNSUPPORTED Rust 3298:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CREDENTIAL_PAIR1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_CREDENTIAL_PAIR2` (
    public var `localCredentials`: `IKEEXT_CREDENTIAL2`,
    public var `peerCredentials`: `IKEEXT_CREDENTIAL2`,
)
// UNSUPPORTED Rust 3309:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_CREDENTIAL_PAIR2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IKEEXT_DH_ECP_256`: `IKEEXT_DH_GROUP` = 4;
public const val `IKEEXT_DH_ECP_384`: `IKEEXT_DH_GROUP` = 5;
public typealias `IKEEXT_DH_GROUP` = Int;
public const val `IKEEXT_DH_GROUP_1`: `IKEEXT_DH_GROUP` = 1;
public const val `IKEEXT_DH_GROUP_14`: `IKEEXT_DH_GROUP` = 3;
public const val `IKEEXT_DH_GROUP_2`: `IKEEXT_DH_GROUP` = 2;
public const val `IKEEXT_DH_GROUP_2048`: `IKEEXT_DH_GROUP` = 3;
public const val `IKEEXT_DH_GROUP_24`: `IKEEXT_DH_GROUP` = 6;
public const val `IKEEXT_DH_GROUP_MAX`: `IKEEXT_DH_GROUP` = 7;
public const val `IKEEXT_DH_GROUP_NONE`: `IKEEXT_DH_GROUP` = 0;
public const val `IKEEXT_EAP`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 11;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IKEEXT_EAP_AUTHENTICATION0` (
    public var `flags`: `IKEEXT_EAP_AUTHENTICATION_FLAGS`,
)
public typealias `IKEEXT_EAP_AUTHENTICATION_FLAGS` = UInt;
public const val `IKEEXT_EAP_FLAG_LOCAL_AUTH_ONLY`: `IKEEXT_EAP_AUTHENTICATION_FLAGS` = 1u;
public const val `IKEEXT_EAP_FLAG_REMOTE_AUTH_ONLY`: `IKEEXT_EAP_AUTHENTICATION_FLAGS` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_EM_POLICY0` (
    public var `numAuthenticationMethods`: UInt,
    public var `authenticationMethods`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_AUTHENTICATION_METHOD0`>?,
    public var `initiatorImpersonationType`: `IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE`,
)
// UNSUPPORTED Rust 3340:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_EM_POLICY0 {
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
public class `IKEEXT_EM_POLICY1` (
    public var `numAuthenticationMethods`: UInt,
    public var `authenticationMethods`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_AUTHENTICATION_METHOD1`>?,
    public var `initiatorImpersonationType`: `IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE`,
)
// UNSUPPORTED Rust 3352:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_EM_POLICY1 {
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
public class `IKEEXT_EM_POLICY2` (
    public var `numAuthenticationMethods`: UInt,
    public var `authenticationMethods`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_AUTHENTICATION_METHOD2`>?,
    public var `initiatorImpersonationType`: `IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE`,
)
// UNSUPPORTED Rust 3364:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_EM_POLICY2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IKEEXT_EM_SA_STATE` = Int;
public const val `IKEEXT_EM_SA_STATE_AUTH_COMPLETE`: `IKEEXT_EM_SA_STATE` = 3;
public const val `IKEEXT_EM_SA_STATE_COMPLETE`: `IKEEXT_EM_SA_STATE` = 5;
public const val `IKEEXT_EM_SA_STATE_FINAL`: `IKEEXT_EM_SA_STATE` = 4;
public const val `IKEEXT_EM_SA_STATE_MAX`: `IKEEXT_EM_SA_STATE` = 6;
public const val `IKEEXT_EM_SA_STATE_NONE`: `IKEEXT_EM_SA_STATE` = 0;
public const val `IKEEXT_EM_SA_STATE_SENT_ATTS`: `IKEEXT_EM_SA_STATE` = 1;
public const val `IKEEXT_EM_SA_STATE_SSPI_SENT`: `IKEEXT_EM_SA_STATE` = 2;
public const val `IKEEXT_IMPERSONATION_MAX`: `IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE` = 2;
public const val `IKEEXT_IMPERSONATION_NONE`: `IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE` = 0;
public const val `IKEEXT_IMPERSONATION_SOCKET_PRINCIPAL`: `IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IKEEXT_INTEGRITY_ALGORITHM0` (
    public var `algoIdentifier`: `IKEEXT_INTEGRITY_TYPE`,
)
public const val `IKEEXT_INTEGRITY_MD5`: `IKEEXT_INTEGRITY_TYPE` = 0;
public const val `IKEEXT_INTEGRITY_SHA1`: `IKEEXT_INTEGRITY_TYPE` = 1;
public const val `IKEEXT_INTEGRITY_SHA_256`: `IKEEXT_INTEGRITY_TYPE` = 2;
public const val `IKEEXT_INTEGRITY_SHA_384`: `IKEEXT_INTEGRITY_TYPE` = 3;
public typealias `IKEEXT_INTEGRITY_TYPE` = Int;
public const val `IKEEXT_INTEGRITY_TYPE_MAX`: `IKEEXT_INTEGRITY_TYPE` = 4;
public const val `IKEEXT_IPV6_CGA`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 6;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_IPV6_CGA_AUTHENTICATION0` (
    public var `keyContainerName`: `windows_sys`.`core`.`PWSTR`,
    public var `cspName`: `windows_sys`.`core`.`PWSTR`,
    public var `cspType`: UInt,
    public var `cgaModifier`: `FWP_BYTE_ARRAY16`,
    public var `cgaCollisionCount`: UByte,
)
// UNSUPPORTED Rust 3401:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_IPV6_CGA_AUTHENTICATION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IKEEXT_IP_VERSION_SPECIFIC_COMMON_STATISTICS0` (
    public var `totalSocketReceiveFailures`: UInt,
    public var `totalSocketSendFailures`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IKEEXT_IP_VERSION_SPECIFIC_COMMON_STATISTICS1` (
    public var `totalSocketReceiveFailures`: UInt,
    public var `totalSocketSendFailures`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IKEEXT_IP_VERSION_SPECIFIC_KEYMODULE_STATISTICS0` (
    public var `currentActiveMainModes`: UInt,
    public var `totalMainModesStarted`: UInt,
    public var `totalSuccessfulMainModes`: UInt,
    public var `totalFailedMainModes`: UInt,
    public var `totalResponderMainModes`: UInt,
    public var `currentNewResponderMainModes`: UInt,
    public var `currentActiveQuickModes`: UInt,
    public var `totalQuickModesStarted`: UInt,
    public var `totalSuccessfulQuickModes`: UInt,
    public var `totalFailedQuickModes`: UInt,
    public var `totalAcquires`: UInt,
    public var `totalReinitAcquires`: UInt,
    public var `currentActiveExtendedModes`: UInt,
    public var `totalExtendedModesStarted`: UInt,
    public var `totalSuccessfulExtendedModes`: UInt,
    public var `totalFailedExtendedModes`: UInt,
    public var `totalImpersonationExtendedModes`: UInt,
    public var `totalImpersonationMainModes`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IKEEXT_IP_VERSION_SPECIFIC_KEYMODULE_STATISTICS1` (
    public var `currentActiveMainModes`: UInt,
    public var `totalMainModesStarted`: UInt,
    public var `totalSuccessfulMainModes`: UInt,
    public var `totalFailedMainModes`: UInt,
    public var `totalResponderMainModes`: UInt,
    public var `currentNewResponderMainModes`: UInt,
    public var `currentActiveQuickModes`: UInt,
    public var `totalQuickModesStarted`: UInt,
    public var `totalSuccessfulQuickModes`: UInt,
    public var `totalFailedQuickModes`: UInt,
    public var `totalAcquires`: UInt,
    public var `totalReinitAcquires`: UInt,
    public var `currentActiveExtendedModes`: UInt,
    public var `totalExtendedModesStarted`: UInt,
    public var `totalSuccessfulExtendedModes`: UInt,
    public var `totalFailedExtendedModes`: UInt,
    public var `totalImpersonationExtendedModes`: UInt,
    public var `totalImpersonationMainModes`: UInt,
)
public const val `IKEEXT_KERBEROS`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IKEEXT_KERBEROS_AUTHENTICATION0` (
    public var `flags`: `IKEEXT_KERBEROS_AUTHENTICATION_FLAGS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_KERBEROS_AUTHENTICATION1` (
    public var `flags`: `IKEEXT_KERBEROS_AUTHENTICATION_FLAGS`,
    public var `proxyServer`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 3474:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_KERBEROS_AUTHENTICATION1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IKEEXT_KERBEROS_AUTHENTICATION_FLAGS` = UInt;
public const val `IKEEXT_KERB_AUTH_DISABLE_INITIATOR_TOKEN_GENERATION`: `IKEEXT_KERBEROS_AUTHENTICATION_FLAGS` = 1u;
public const val `IKEEXT_KERB_AUTH_DONT_ACCEPT_EXPLICIT_CREDENTIALS`: `IKEEXT_KERBEROS_AUTHENTICATION_FLAGS` = 2u;
public const val `IKEEXT_KERB_AUTH_FORCE_PROXY_ON_INITIATOR`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 97 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_KEYMODULE_STATISTICS0` (
    public var `v4Statistics`: `IKEEXT_IP_VERSION_SPECIFIC_KEYMODULE_STATISTICS0`,
    public var `v6Statistics`: `IKEEXT_IP_VERSION_SPECIFIC_KEYMODULE_STATISTICS0`,
    public var `errorFrequencyTable`: UIntArray,
    public var `mainModeNegotiationTime`: UInt,
    public var `quickModeNegotiationTime`: UInt,
    public var `extendedModeNegotiationTime`: UInt,
)
// UNSUPPORTED Rust 3493:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_KEYMODULE_STATISTICS0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 97 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_KEYMODULE_STATISTICS1` (
    public var `v4Statistics`: `IKEEXT_IP_VERSION_SPECIFIC_KEYMODULE_STATISTICS1`,
    public var `v6Statistics`: `IKEEXT_IP_VERSION_SPECIFIC_KEYMODULE_STATISTICS1`,
    public var `errorFrequencyTable`: UIntArray,
    public var `mainModeNegotiationTime`: UInt,
    public var `quickModeNegotiationTime`: UInt,
    public var `extendedModeNegotiationTime`: UInt,
)
// UNSUPPORTED Rust 3508:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_KEYMODULE_STATISTICS1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IKEEXT_KEY_MODULE_AUTHIP`: `IKEEXT_KEY_MODULE_TYPE` = 1;
public const val `IKEEXT_KEY_MODULE_IKE`: `IKEEXT_KEY_MODULE_TYPE` = 0;
public const val `IKEEXT_KEY_MODULE_IKEV2`: `IKEEXT_KEY_MODULE_TYPE` = 2;
public const val `IKEEXT_KEY_MODULE_MAX`: `IKEEXT_KEY_MODULE_TYPE` = 3;
public typealias `IKEEXT_KEY_MODULE_TYPE` = Int;
public typealias `IKEEXT_MM_SA_STATE` = Int;
public const val `IKEEXT_MM_SA_STATE_COMPLETE`: `IKEEXT_MM_SA_STATE` = 5;
public const val `IKEEXT_MM_SA_STATE_FINAL`: `IKEEXT_MM_SA_STATE` = 3;
public const val `IKEEXT_MM_SA_STATE_FINAL_SENT`: `IKEEXT_MM_SA_STATE` = 4;
public const val `IKEEXT_MM_SA_STATE_MAX`: `IKEEXT_MM_SA_STATE` = 6;
public const val `IKEEXT_MM_SA_STATE_NONE`: `IKEEXT_MM_SA_STATE` = 0;
public const val `IKEEXT_MM_SA_STATE_SA_SENT`: `IKEEXT_MM_SA_STATE` = 1;
public const val `IKEEXT_MM_SA_STATE_SSPI_SENT`: `IKEEXT_MM_SA_STATE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_NAME_CREDENTIAL0` (
    public var `principalName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 3531:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_NAME_CREDENTIAL0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IKEEXT_NTLM_V2`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IKEEXT_NTLM_V2_AUTHENTICATION0` (
    public var `flags`: UInt,
)
public const val `IKEEXT_NTLM_V2_AUTH_DONT_ACCEPT_EXPLICIT_CREDENTIALS`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_POLICY0` (
    public var `softExpirationTime`: UInt,
    public var `numAuthenticationMethods`: UInt,
    public var `authenticationMethods`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_AUTHENTICATION_METHOD0`>?,
    public var `initiatorImpersonationType`: `IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE`,
    public var `numIkeProposals`: UInt,
    public var `ikeProposals`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_PROPOSAL0`>?,
    public var `flags`: `IKEEXT_POLICY_FLAG`,
    public var `maxDynamicFilters`: UInt,
)
// UNSUPPORTED Rust 3555:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_POLICY0 {
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
public class `IKEEXT_POLICY1` (
    public var `softExpirationTime`: UInt,
    public var `numAuthenticationMethods`: UInt,
    public var `authenticationMethods`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_AUTHENTICATION_METHOD1`>?,
    public var `initiatorImpersonationType`: `IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE`,
    public var `numIkeProposals`: UInt,
    public var `ikeProposals`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_PROPOSAL0`>?,
    public var `flags`: `IKEEXT_POLICY_FLAG`,
    public var `maxDynamicFilters`: UInt,
    public var `retransmitDurationSecs`: UInt,
)
// UNSUPPORTED Rust 3573:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_POLICY1 {
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
public class `IKEEXT_POLICY2` (
    public var `softExpirationTime`: UInt,
    public var `numAuthenticationMethods`: UInt,
    public var `authenticationMethods`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_AUTHENTICATION_METHOD2`>?,
    public var `initiatorImpersonationType`: `IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE`,
    public var `numIkeProposals`: UInt,
    public var `ikeProposals`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_PROPOSAL0`>?,
    public var `flags`: `IKEEXT_POLICY_FLAG`,
    public var `maxDynamicFilters`: UInt,
    public var `retransmitDurationSecs`: UInt,
)
// UNSUPPORTED Rust 3591:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_POLICY2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IKEEXT_POLICY_ENABLE_IKEV2_FRAGMENTATION`: UInt = 128u;
public typealias `IKEEXT_POLICY_FLAG` = UInt;
public const val `IKEEXT_POLICY_FLAG_DISABLE_DIAGNOSTICS`: `IKEEXT_POLICY_FLAG` = 1u;
public const val `IKEEXT_POLICY_FLAG_ENABLE_OPTIONAL_DH`: `IKEEXT_POLICY_FLAG` = 8u;
public const val `IKEEXT_POLICY_FLAG_IMS_VPN`: UInt = 64u;
public const val `IKEEXT_POLICY_FLAG_MOBIKE_NOT_SUPPORTED`: UInt = 16u;
public const val `IKEEXT_POLICY_FLAG_NO_IMPERSONATION_LUID_VERIFY`: `IKEEXT_POLICY_FLAG` = 4u;
public const val `IKEEXT_POLICY_FLAG_NO_MACHINE_LUID_VERIFY`: `IKEEXT_POLICY_FLAG` = 2u;
public const val `IKEEXT_POLICY_FLAG_SITE_TO_SITE`: UInt = 32u;
public const val `IKEEXT_POLICY_SUPPORT_LOW_POWER_MODE`: UInt = 256u;
public const val `IKEEXT_PRESHARED_KEY`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IKEEXT_PRESHARED_KEY_AUTHENTICATION0` (
    public var `presharedKey`: `FWP_BYTE_BLOB`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IKEEXT_PRESHARED_KEY_AUTHENTICATION1` (
    public var `presharedKey`: `FWP_BYTE_BLOB`,
    public var `flags`: `IKEEXT_PRESHARED_KEY_AUTHENTICATION_FLAGS`,
)
public typealias `IKEEXT_PRESHARED_KEY_AUTHENTICATION_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IKEEXT_PROPOSAL0` (
    public var `cipherAlgorithm`: `IKEEXT_CIPHER_ALGORITHM0`,
    public var `integrityAlgorithm`: `IKEEXT_INTEGRITY_ALGORITHM0`,
    public var `maxLifetimeSeconds`: UInt,
    public var `dhGroup`: `IKEEXT_DH_GROUP`,
    public var `quickModeLimit`: UInt,
)
public const val `IKEEXT_PSK_FLAG_LOCAL_AUTH_ONLY`: `IKEEXT_PRESHARED_KEY_AUTHENTICATION_FLAGS` = 1u;
public const val `IKEEXT_PSK_FLAG_REMOTE_AUTH_ONLY`: `IKEEXT_PRESHARED_KEY_AUTHENTICATION_FLAGS` = 2u;
public typealias `IKEEXT_QM_SA_STATE` = Int;
public const val `IKEEXT_QM_SA_STATE_COMPLETE`: `IKEEXT_QM_SA_STATE` = 3;
public const val `IKEEXT_QM_SA_STATE_FINAL`: `IKEEXT_QM_SA_STATE` = 2;
public const val `IKEEXT_QM_SA_STATE_INITIAL`: `IKEEXT_QM_SA_STATE` = 1;
public const val `IKEEXT_QM_SA_STATE_MAX`: `IKEEXT_QM_SA_STATE` = 4;
public const val `IKEEXT_QM_SA_STATE_NONE`: `IKEEXT_QM_SA_STATE` = 0;
public const val `IKEEXT_RESERVED`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 12;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IKEEXT_RESERVED_AUTHENTICATION0` (
    public var `flags`: `IKEEXT_RESERVED_AUTHENTICATION_FLAGS`,
)
public typealias `IKEEXT_RESERVED_AUTHENTICATION_FLAGS` = UInt;
public const val `IKEEXT_RESERVED_AUTH_DISABLE_INITIATOR_TOKEN_GENERATION`: `IKEEXT_RESERVED_AUTHENTICATION_FLAGS` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_SA_DETAILS0` (
    public var `saId`: ULong,
    public var `keyModuleType`: `IKEEXT_KEY_MODULE_TYPE`,
    public var `ipVersion`: `FWP_IP_VERSION`,
    public var `Anonymous`: `IKEEXT_SA_DETAILS0_0`,
    public var `ikeTraffic`: `IKEEXT_TRAFFIC0`,
    public var `ikeProposal`: `IKEEXT_PROPOSAL0`,
    public var `cookiePair`: `IKEEXT_COOKIE_PAIR0`,
    public var `ikeCredentials`: `IKEEXT_CREDENTIALS0`,
    public var `ikePolicyKey`: `windows_sys`.`core`.`GUID`,
    public var `virtualIfTunnelId`: ULong,
)
// UNSUPPORTED Rust 3658:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_SA_DETAILS0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3663:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_SA_DETAILS0_0 {
//     pub v4UdpEncapsulation: *mut IPSEC_V4_UDP_ENCAPSULATION0,
// }

// UNSUPPORTED Rust 3668:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_SA_DETAILS0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_SA_DETAILS1` (
    public var `saId`: ULong,
    public var `keyModuleType`: `IKEEXT_KEY_MODULE_TYPE`,
    public var `ipVersion`: `FWP_IP_VERSION`,
    public var `Anonymous`: `IKEEXT_SA_DETAILS1_0`,
    public var `ikeTraffic`: `IKEEXT_TRAFFIC0`,
    public var `ikeProposal`: `IKEEXT_PROPOSAL0`,
    public var `cookiePair`: `IKEEXT_COOKIE_PAIR0`,
    public var `ikeCredentials`: `IKEEXT_CREDENTIALS1`,
    public var `ikePolicyKey`: `windows_sys`.`core`.`GUID`,
    public var `virtualIfTunnelId`: ULong,
    public var `correlationKey`: `FWP_BYTE_BLOB`,
)
// UNSUPPORTED Rust 3688:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_SA_DETAILS1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3693:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_SA_DETAILS1_0 {
//     pub v4UdpEncapsulation: *mut IPSEC_V4_UDP_ENCAPSULATION0,
// }

// UNSUPPORTED Rust 3698:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_SA_DETAILS1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_SA_DETAILS2` (
    public var `saId`: ULong,
    public var `keyModuleType`: `IKEEXT_KEY_MODULE_TYPE`,
    public var `ipVersion`: `FWP_IP_VERSION`,
    public var `Anonymous`: `IKEEXT_SA_DETAILS2_0`,
    public var `ikeTraffic`: `IKEEXT_TRAFFIC0`,
    public var `ikeProposal`: `IKEEXT_PROPOSAL0`,
    public var `cookiePair`: `IKEEXT_COOKIE_PAIR0`,
    public var `ikeCredentials`: `IKEEXT_CREDENTIALS2`,
    public var `ikePolicyKey`: `windows_sys`.`core`.`GUID`,
    public var `virtualIfTunnelId`: ULong,
    public var `correlationKey`: `FWP_BYTE_BLOB`,
)
// UNSUPPORTED Rust 3718:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_SA_DETAILS2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3723:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_SA_DETAILS2_0 {
//     pub v4UdpEncapsulation: *mut IPSEC_V4_UDP_ENCAPSULATION0,
// }

// UNSUPPORTED Rust 3728:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_SA_DETAILS2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_SA_ENUM_TEMPLATE0` (
    public var `localSubNet`: `FWP_CONDITION_VALUE0`,
    public var `remoteSubNet`: `FWP_CONDITION_VALUE0`,
    public var `localMainModeCertHash`: `FWP_BYTE_BLOB`,
)
// UNSUPPORTED Rust 3741:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for IKEEXT_SA_ENUM_TEMPLATE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IKEEXT_SA_ROLE` = Int;
public const val `IKEEXT_SA_ROLE_INITIATOR`: `IKEEXT_SA_ROLE` = 0;
public const val `IKEEXT_SA_ROLE_MAX`: `IKEEXT_SA_ROLE` = 2;
public const val `IKEEXT_SA_ROLE_RESPONDER`: `IKEEXT_SA_ROLE` = 1;
public const val `IKEEXT_SSL`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 4;
public const val `IKEEXT_SSL_ECDSA_P256`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 9;
public const val `IKEEXT_SSL_ECDSA_P384`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 10;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IKEEXT_STATISTICS0` (
    public var `ikeStatistics`: `IKEEXT_KEYMODULE_STATISTICS0`,
    public var `authipStatistics`: `IKEEXT_KEYMODULE_STATISTICS0`,
    public var `commonStatistics`: `IKEEXT_COMMON_STATISTICS0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IKEEXT_STATISTICS1` (
    public var `ikeStatistics`: `IKEEXT_KEYMODULE_STATISTICS1`,
    public var `authipStatistics`: `IKEEXT_KEYMODULE_STATISTICS1`,
    public var `ikeV2Statistics`: `IKEEXT_KEYMODULE_STATISTICS1`,
    public var `commonStatistics`: `IKEEXT_COMMON_STATISTICS1`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEEXT_TRAFFIC0` (
    public var `ipVersion`: `FWP_IP_VERSION`,
    public var `Anonymous1`: `IKEEXT_TRAFFIC0_0`,
    public var `Anonymous2`: `IKEEXT_TRAFFIC0_1`,
    public var `authIpFilterId`: ULong,
)
// UNSUPPORTED Rust 3777:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_TRAFFIC0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3782:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_TRAFFIC0_0 {
//     pub localV4Address: u32,
//     pub localV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 3788:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_TRAFFIC0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3793:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_TRAFFIC0_1 {
//     pub remoteV4Address: u32,
//     pub remoteV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 3799:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEEXT_TRAFFIC0_1 {
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
public class `IPSEC_ADDRESS_INFO0` (
    public var `numV4Addresses`: UInt,
    public var `v4Addresses`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `numV6Addresses`: UInt,
    public var `v6Addresses`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FWP_BYTE_ARRAY16`>?,
)
// UNSUPPORTED Rust 3812:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_ADDRESS_INFO0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_AGGREGATE_DROP_PACKET_STATISTICS0` (
    public var `invalidSpisOnInbound`: UInt,
    public var `decryptionFailuresOnInbound`: UInt,
    public var `authenticationFailuresOnInbound`: UInt,
    public var `udpEspValidationFailuresOnInbound`: UInt,
    public var `replayCheckFailuresOnInbound`: UInt,
    public var `invalidClearTextInbound`: UInt,
    public var `saNotInitializedOnInbound`: UInt,
    public var `receiveOverIncorrectSaInbound`: UInt,
    public var `secureReceivesNotMatchingFilters`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_AGGREGATE_DROP_PACKET_STATISTICS1` (
    public var `invalidSpisOnInbound`: UInt,
    public var `decryptionFailuresOnInbound`: UInt,
    public var `authenticationFailuresOnInbound`: UInt,
    public var `udpEspValidationFailuresOnInbound`: UInt,
    public var `replayCheckFailuresOnInbound`: UInt,
    public var `invalidClearTextInbound`: UInt,
    public var `saNotInitializedOnInbound`: UInt,
    public var `receiveOverIncorrectSaInbound`: UInt,
    public var `secureReceivesNotMatchingFilters`: UInt,
    public var `totalDropPacketsInbound`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_AGGREGATE_SA_STATISTICS0` (
    public var `activeSas`: UInt,
    public var `pendingSaNegotiations`: UInt,
    public var `totalSasAdded`: UInt,
    public var `totalSasDeleted`: UInt,
    public var `successfulRekeys`: UInt,
    public var `activeTunnels`: UInt,
    public var `offloadedSas`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_AH_DROP_PACKET_STATISTICS0` (
    public var `invalidSpisOnInbound`: UInt,
    public var `authenticationFailuresOnInbound`: UInt,
    public var `replayCheckFailuresOnInbound`: UInt,
    public var `saNotInitializedOnInbound`: UInt,
)
public const val `IPSEC_AUTH_AES_128`: `IPSEC_AUTH_TYPE` = 3;
public const val `IPSEC_AUTH_AES_192`: `IPSEC_AUTH_TYPE` = 4;
public const val `IPSEC_AUTH_AES_256`: `IPSEC_AUTH_TYPE` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_AUTH_AND_CIPHER_TRANSFORM0` (
    public var `authTransform`: `IPSEC_AUTH_TRANSFORM0`,
    public var `cipherTransform`: `IPSEC_CIPHER_TRANSFORM0`,
)
public const val `IPSEC_AUTH_CONFIG_GCM_AES_128`: UInt = 3u;
public const val `IPSEC_AUTH_CONFIG_GCM_AES_192`: UInt = 4u;
public const val `IPSEC_AUTH_CONFIG_GCM_AES_256`: UInt = 5u;
public const val `IPSEC_AUTH_CONFIG_HMAC_MD5_96`: UInt = 0u;
public const val `IPSEC_AUTH_CONFIG_HMAC_SHA_1_96`: UInt = 1u;
public const val `IPSEC_AUTH_CONFIG_HMAC_SHA_256_128`: UInt = 2u;
public const val `IPSEC_AUTH_CONFIG_MAX`: UInt = 6u;
public const val `IPSEC_AUTH_MAX`: `IPSEC_AUTH_TYPE` = 6;
public const val `IPSEC_AUTH_MD5`: `IPSEC_AUTH_TYPE` = 0;
public const val `IPSEC_AUTH_SHA_1`: `IPSEC_AUTH_TYPE` = 1;
public const val `IPSEC_AUTH_SHA_256`: `IPSEC_AUTH_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPSEC_AUTH_TRANSFORM0` (
    public var `authTransformId`: `IPSEC_AUTH_TRANSFORM_ID0`,
    public var `cryptoModuleId`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
)
// UNSUPPORTED Rust 3889:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_AUTH_TRANSFORM0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_AUTH_TRANSFORM_ID0` (
    public var `authType`: `IPSEC_AUTH_TYPE`,
    public var `authConfig`: UByte,
)
public typealias `IPSEC_AUTH_TYPE` = Int;
public const val `IPSEC_CIPHER_CONFIG_CBC_3DES`: UInt = 2u;
public const val `IPSEC_CIPHER_CONFIG_CBC_AES_128`: UInt = 3u;
public const val `IPSEC_CIPHER_CONFIG_CBC_AES_192`: UInt = 4u;
public const val `IPSEC_CIPHER_CONFIG_CBC_AES_256`: UInt = 5u;
public const val `IPSEC_CIPHER_CONFIG_CBC_DES`: UInt = 1u;
public const val `IPSEC_CIPHER_CONFIG_GCM_AES_128`: UInt = 6u;
public const val `IPSEC_CIPHER_CONFIG_GCM_AES_192`: UInt = 7u;
public const val `IPSEC_CIPHER_CONFIG_GCM_AES_256`: UInt = 8u;
public const val `IPSEC_CIPHER_CONFIG_MAX`: UInt = 9u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPSEC_CIPHER_TRANSFORM0` (
    public var `cipherTransformId`: `IPSEC_CIPHER_TRANSFORM_ID0`,
    public var `cryptoModuleId`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
)
// UNSUPPORTED Rust 3916:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_CIPHER_TRANSFORM0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_CIPHER_TRANSFORM_ID0` (
    public var `cipherType`: `IPSEC_CIPHER_TYPE`,
    public var `cipherConfig`: UByte,
)
public typealias `IPSEC_CIPHER_TYPE` = Int;
public const val `IPSEC_CIPHER_TYPE_3DES`: `IPSEC_CIPHER_TYPE` = 2;
public const val `IPSEC_CIPHER_TYPE_AES_128`: `IPSEC_CIPHER_TYPE` = 3;
public const val `IPSEC_CIPHER_TYPE_AES_192`: `IPSEC_CIPHER_TYPE` = 4;
public const val `IPSEC_CIPHER_TYPE_AES_256`: `IPSEC_CIPHER_TYPE` = 5;
public const val `IPSEC_CIPHER_TYPE_DES`: `IPSEC_CIPHER_TYPE` = 1;
public const val `IPSEC_CIPHER_TYPE_MAX`: `IPSEC_CIPHER_TYPE` = 6;
public const val `IPSEC_DOSP_DSCP_DISABLE_VALUE`: UInt = 255u;
public typealias `IPSEC_DOSP_FLAGS` = UInt;
public const val `IPSEC_DOSP_FLAG_DISABLE_AUTHIP`: `IPSEC_DOSP_FLAGS` = 4u;
public const val `IPSEC_DOSP_FLAG_DISABLE_DEFAULT_BLOCK`: `IPSEC_DOSP_FLAGS` = 8u;
public const val `IPSEC_DOSP_FLAG_ENABLE_IKEV1`: `IPSEC_DOSP_FLAGS` = 1u;
public const val `IPSEC_DOSP_FLAG_ENABLE_IKEV2`: `IPSEC_DOSP_FLAGS` = 2u;
public const val `IPSEC_DOSP_FLAG_FILTER_BLOCK`: `IPSEC_DOSP_FLAGS` = 16u;
public const val `IPSEC_DOSP_FLAG_FILTER_EXEMPT`: `IPSEC_DOSP_FLAGS` = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPSEC_DOSP_OPTIONS0` (
    public var `stateIdleTimeoutSeconds`: UInt,
    public var `perIPRateLimitQueueIdleTimeoutSeconds`: UInt,
    public var `ipV6IPsecUnauthDscp`: UByte,
    public var `ipV6IPsecUnauthRateLimitBytesPerSec`: UInt,
    public var `ipV6IPsecUnauthPerIPRateLimitBytesPerSec`: UInt,
    public var `ipV6IPsecAuthDscp`: UByte,
    public var `ipV6IPsecAuthRateLimitBytesPerSec`: UInt,
    public var `icmpV6Dscp`: UByte,
    public var `icmpV6RateLimitBytesPerSec`: UInt,
    public var `ipV6FilterExemptDscp`: UByte,
    public var `ipV6FilterExemptRateLimitBytesPerSec`: UInt,
    public var `defBlockExemptDscp`: UByte,
    public var `defBlockExemptRateLimitBytesPerSec`: UInt,
    public var `maxStateEntries`: UInt,
    public var `maxPerIPRateLimitQueues`: UInt,
    public var `flags`: `IPSEC_DOSP_FLAGS`,
    public var `numPublicIFLuids`: UInt,
    public var `publicIFLuids`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `numInternalIFLuids`: UInt,
    public var `internalIFLuids`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `publicV6AddrMask`: `FWP_V6_ADDR_AND_MASK`,
    public var `internalV6AddrMask`: `FWP_V6_ADDR_AND_MASK`,
)
// UNSUPPORTED Rust 3968:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_DOSP_OPTIONS0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IPSEC_DOSP_RATE_LIMIT_DISABLE_VALUE`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPSEC_DOSP_STATE0` (
    public var `publicHostV6Addr`: UByteArray,
    public var `internalHostV6Addr`: UByteArray,
    public var `totalInboundIPv6IPsecAuthPackets`: ULong,
    public var `totalOutboundIPv6IPsecAuthPackets`: ULong,
    public var `durationSecs`: UInt,
)
// UNSUPPORTED Rust 3983:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_DOSP_STATE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_DOSP_STATE_ENUM_TEMPLATE0` (
    public var `publicV6AddrMask`: `FWP_V6_ADDR_AND_MASK`,
    public var `internalV6AddrMask`: `FWP_V6_ADDR_AND_MASK`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_DOSP_STATISTICS0` (
    public var `totalStateEntriesCreated`: ULong,
    public var `currentStateEntries`: ULong,
    public var `totalInboundAllowedIPv6IPsecUnauthPkts`: ULong,
    public var `totalInboundRatelimitDiscardedIPv6IPsecUnauthPkts`: ULong,
    public var `totalInboundPerIPRatelimitDiscardedIPv6IPsecUnauthPkts`: ULong,
    public var `totalInboundOtherDiscardedIPv6IPsecUnauthPkts`: ULong,
    public var `totalInboundAllowedIPv6IPsecAuthPkts`: ULong,
    public var `totalInboundRatelimitDiscardedIPv6IPsecAuthPkts`: ULong,
    public var `totalInboundOtherDiscardedIPv6IPsecAuthPkts`: ULong,
    public var `totalInboundAllowedICMPv6Pkts`: ULong,
    public var `totalInboundRatelimitDiscardedICMPv6Pkts`: ULong,
    public var `totalInboundAllowedIPv6FilterExemptPkts`: ULong,
    public var `totalInboundRatelimitDiscardedIPv6FilterExemptPkts`: ULong,
    public var `totalInboundDiscardedIPv6FilterBlockPkts`: ULong,
    public var `totalInboundAllowedDefBlockExemptPkts`: ULong,
    public var `totalInboundRatelimitDiscardedDefBlockExemptPkts`: ULong,
    public var `totalInboundDiscardedDefBlockPkts`: ULong,
    public var `currentInboundIPv6IPsecUnauthPerIPRateLimitQueues`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_ESP_DROP_PACKET_STATISTICS0` (
    public var `invalidSpisOnInbound`: UInt,
    public var `decryptionFailuresOnInbound`: UInt,
    public var `authenticationFailuresOnInbound`: UInt,
    public var `replayCheckFailuresOnInbound`: UInt,
    public var `saNotInitializedOnInbound`: UInt,
)
public const val `IPSEC_FAILURE_ME`: `IPSEC_FAILURE_POINT` = 1;
public const val `IPSEC_FAILURE_NONE`: `IPSEC_FAILURE_POINT` = 0;
public const val `IPSEC_FAILURE_PEER`: `IPSEC_FAILURE_POINT` = 2;
public typealias `IPSEC_FAILURE_POINT` = Int;
public const val `IPSEC_FAILURE_POINT_MAX`: `IPSEC_FAILURE_POINT` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPSEC_GETSPI0` (
    public var `inboundIpsecTraffic`: `IPSEC_TRAFFIC0`,
    public var `ipVersion`: `FWP_IP_VERSION`,
    public var `Anonymous`: `IPSEC_GETSPI0_0`,
    public var `rngCryptoModuleID`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
)
// UNSUPPORTED Rust 4038:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_GETSPI0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4043:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_GETSPI0_0 {
//     pub inboundUdpEncapsulation: *mut IPSEC_V4_UDP_ENCAPSULATION0,
// }

// UNSUPPORTED Rust 4048:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_GETSPI0_0 {
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
public class `IPSEC_GETSPI1` (
    public var `inboundIpsecTraffic`: `IPSEC_TRAFFIC1`,
    public var `ipVersion`: `FWP_IP_VERSION`,
    public var `Anonymous`: `IPSEC_GETSPI1_0`,
    public var `rngCryptoModuleID`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
)
// UNSUPPORTED Rust 4061:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_GETSPI1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4066:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_GETSPI1_0 {
//     pub inboundUdpEncapsulation: *mut IPSEC_V4_UDP_ENCAPSULATION0,
// }

// UNSUPPORTED Rust 4071:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_GETSPI1_0 {
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
public class `IPSEC_ID0` (
    public var `mmTargetName`: `windows_sys`.`core`.`PWSTR`,
    public var `emTargetName`: `windows_sys`.`core`.`PWSTR`,
    public var `numTokens`: UInt,
    public var `tokens`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_TOKEN0`>?,
    public var `explicitCredentials`: ULong,
    public var `logonId`: ULong,
)
// UNSUPPORTED Rust 4086:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_ID0 {
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
public class `IPSEC_KEYING_POLICY0` (
    public var `numKeyMods`: UInt,
    public var `keyModKeys`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
)
// UNSUPPORTED Rust 4097:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_KEYING_POLICY0 {
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
public class `IPSEC_KEYING_POLICY1` (
    public var `numKeyMods`: UInt,
    public var `keyModKeys`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `flags`: UInt,
)
// UNSUPPORTED Rust 4109:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_KEYING_POLICY1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IPSEC_KEYING_POLICY_FLAG_TERMINATING_MATCH`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_KEYMODULE_STATE0` (
    public var `keyModuleKey`: `windows_sys`.`core`.`GUID`,
    public var `stateBlob`: `FWP_BYTE_BLOB`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_KEY_MANAGER0` (
    public var `keyManagerKey`: `windows_sys`.`core`.`GUID`,
    public var `displayData`: `FWPM_DISPLAY_DATA0`,
    public var `flags`: UInt,
    public var `keyDictationTimeoutHint`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_KEY_MANAGER_CALLBACKS0` (
    public var `reserved`: `windows_sys`.`core`.`GUID`,
    public var `flags`: UInt,
    public var `keyDictationCheck`: `IPSEC_KEY_MANAGER_KEY_DICTATION_CHECK0`,
    public var `keyDictation`: `IPSEC_KEY_MANAGER_DICTATE_KEY0`,
    public var `keyNotify`: `IPSEC_KEY_MANAGER_NOTIFY_KEY0`,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public typealias `IPSEC_KEY_MANAGER_DICTATE_KEY0` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_SA_DETAILS1`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_SA_DETAILS1`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) -> UInt>>>;
public const val `IPSEC_KEY_MANAGER_FLAG_DICTATE_KEY`: UInt = 1u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `IPSEC_KEY_MANAGER_KEY_DICTATION_CHECK0` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`IKEEXT_TRAFFIC0`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public typealias `IPSEC_KEY_MANAGER_NOTIFY_KEY0` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`IPSEC_SA_DETAILS1`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`IPSEC_SA_DETAILS1`>?) -> Unit>>>;
public const val `IPSEC_PFS_1`: `IPSEC_PFS_GROUP` = 1;
public const val `IPSEC_PFS_14`: `IPSEC_PFS_GROUP` = 3;
public const val `IPSEC_PFS_2`: `IPSEC_PFS_GROUP` = 2;
public const val `IPSEC_PFS_2048`: `IPSEC_PFS_GROUP` = 3;
public const val `IPSEC_PFS_24`: `IPSEC_PFS_GROUP` = 7;
public const val `IPSEC_PFS_ECP_256`: `IPSEC_PFS_GROUP` = 4;
public const val `IPSEC_PFS_ECP_384`: `IPSEC_PFS_GROUP` = 5;
public typealias `IPSEC_PFS_GROUP` = Int;
public const val `IPSEC_PFS_MAX`: `IPSEC_PFS_GROUP` = 8;
public const val `IPSEC_PFS_MM`: `IPSEC_PFS_GROUP` = 6;
public const val `IPSEC_PFS_NONE`: `IPSEC_PFS_GROUP` = 0;
public typealias `IPSEC_POLICY_FLAG` = UInt;
public const val `IPSEC_POLICY_FLAG_BANDWIDTH1`: UInt = 268435456u;
public const val `IPSEC_POLICY_FLAG_BANDWIDTH2`: UInt = 536870912u;
public const val `IPSEC_POLICY_FLAG_BANDWIDTH3`: UInt = 1073741824u;
public const val `IPSEC_POLICY_FLAG_BANDWIDTH4`: UInt = 2147483648u;
public const val `IPSEC_POLICY_FLAG_CLEAR_DF_ON_TUNNEL`: `IPSEC_POLICY_FLAG` = 8u;
public const val `IPSEC_POLICY_FLAG_DONT_NEGOTIATE_BYTE_LIFETIME`: `IPSEC_POLICY_FLAG` = 128u;
public const val `IPSEC_POLICY_FLAG_DONT_NEGOTIATE_SECOND_LIFETIME`: `IPSEC_POLICY_FLAG` = 64u;
public const val `IPSEC_POLICY_FLAG_ENABLE_SERVER_ADDR_ASSIGNMENT`: `IPSEC_POLICY_FLAG` = 512u;
public const val `IPSEC_POLICY_FLAG_ENABLE_V6_IN_V4_TUNNELING`: `IPSEC_POLICY_FLAG` = 256u;
public const val `IPSEC_POLICY_FLAG_KEY_MANAGER_ALLOW_DICTATE_KEY`: `IPSEC_POLICY_FLAG` = 8192u;
public const val `IPSEC_POLICY_FLAG_KEY_MANAGER_ALLOW_NOTIFY_KEY`: UInt = 16384u;
public const val `IPSEC_POLICY_FLAG_NAT_ENCAP_ALLOW_GENERAL_NAT_TRAVERSAL`: `IPSEC_POLICY_FLAG` = 32u;
public const val `IPSEC_POLICY_FLAG_NAT_ENCAP_ALLOW_PEER_BEHIND_NAT`: `IPSEC_POLICY_FLAG` = 16u;
public const val `IPSEC_POLICY_FLAG_ND_BOUNDARY`: `IPSEC_POLICY_FLAG` = 4u;
public const val `IPSEC_POLICY_FLAG_ND_SECURE`: `IPSEC_POLICY_FLAG` = 2u;
public const val `IPSEC_POLICY_FLAG_RESERVED1`: UInt = 32768u;
public const val `IPSEC_POLICY_FLAG_SITE_TO_SITE_TUNNEL`: UInt = 65536u;
public const val `IPSEC_POLICY_FLAG_TUNNEL_ALLOW_OUTBOUND_CLEAR_CONNECTION`: `IPSEC_POLICY_FLAG` = 1024u;
public const val `IPSEC_POLICY_FLAG_TUNNEL_BYPASS_ALREADY_SECURE_CONNECTION`: `IPSEC_POLICY_FLAG` = 2048u;
public const val `IPSEC_POLICY_FLAG_TUNNEL_BYPASS_ICMPV6`: `IPSEC_POLICY_FLAG` = 4096u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPSEC_PROPOSAL0` (
    public var `lifetime`: `IPSEC_SA_LIFETIME0`,
    public var `numSaTransforms`: UInt,
    public var `saTransforms`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_SA_TRANSFORM0`>?,
    public var `pfsGroup`: `IPSEC_PFS_GROUP`,
)
// UNSUPPORTED Rust 4185:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_PROPOSAL0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPSEC_SA0` (
    public var `spi`: UInt,
    public var `saTransformType`: `IPSEC_TRANSFORM_TYPE`,
    public var `Anonymous`: `IPSEC_SA0_0`,
)
// UNSUPPORTED Rust 4197:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_SA0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4202:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_SA0_0 {
//     pub ahInformation: *mut IPSEC_SA_AUTH_INFORMATION0,
//     pub espAuthInformation: *mut IPSEC_SA_AUTH_INFORMATION0,
//     pub espCipherInformation: *mut IPSEC_SA_CIPHER_INFORMATION0,
//     pub espAuthAndCipherInformation: *mut IPSEC_SA_AUTH_AND_CIPHER_INFORMATION0,
//     pub espAuthFwInformation: *mut IPSEC_SA_AUTH_INFORMATION0,
// }

// UNSUPPORTED Rust 4211:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_SA0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_SA_AUTH_AND_CIPHER_INFORMATION0` (
    public var `saCipherInformation`: `IPSEC_SA_CIPHER_INFORMATION0`,
    public var `saAuthInformation`: `IPSEC_SA_AUTH_INFORMATION0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_SA_AUTH_INFORMATION0` (
    public var `authTransform`: `IPSEC_AUTH_TRANSFORM0`,
    public var `authKey`: `FWP_BYTE_BLOB`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPSEC_SA_BUNDLE0` (
    public var `flags`: `IPSEC_SA_BUNDLE_FLAGS`,
    public var `lifetime`: `IPSEC_SA_LIFETIME0`,
    public var `idleTimeoutSeconds`: UInt,
    public var `ndAllowClearTimeoutSeconds`: UInt,
    public var `ipsecId`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_ID0`>?,
    public var `napContext`: UInt,
    public var `qmSaId`: UInt,
    public var `numSAs`: UInt,
    public var `saList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_SA0`>?,
    public var `keyModuleState`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_KEYMODULE_STATE0`>?,
    public var `ipVersion`: `FWP_IP_VERSION`,
    public var `Anonymous`: `IPSEC_SA_BUNDLE0_0`,
    public var `mmSaId`: ULong,
    public var `pfsGroup`: `IPSEC_PFS_GROUP`,
)
// UNSUPPORTED Rust 4246:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_SA_BUNDLE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4251:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_SA_BUNDLE0_0 {
//     pub peerV4PrivateAddress: u32,
// }

// UNSUPPORTED Rust 4256:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_SA_BUNDLE0_0 {
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
public class `IPSEC_SA_BUNDLE1` (
    public var `flags`: `IPSEC_SA_BUNDLE_FLAGS`,
    public var `lifetime`: `IPSEC_SA_LIFETIME0`,
    public var `idleTimeoutSeconds`: UInt,
    public var `ndAllowClearTimeoutSeconds`: UInt,
    public var `ipsecId`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_ID0`>?,
    public var `napContext`: UInt,
    public var `qmSaId`: UInt,
    public var `numSAs`: UInt,
    public var `saList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_SA0`>?,
    public var `keyModuleState`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_KEYMODULE_STATE0`>?,
    public var `ipVersion`: `FWP_IP_VERSION`,
    public var `Anonymous`: `IPSEC_SA_BUNDLE1_0`,
    public var `mmSaId`: ULong,
    public var `pfsGroup`: `IPSEC_PFS_GROUP`,
    public var `saLookupContext`: `windows_sys`.`core`.`GUID`,
    public var `qmFilterId`: ULong,
)
// UNSUPPORTED Rust 4281:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_SA_BUNDLE1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4286:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_SA_BUNDLE1_0 {
//     pub peerV4PrivateAddress: u32,
// }

// UNSUPPORTED Rust 4291:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_SA_BUNDLE1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IPSEC_SA_BUNDLE_FLAGS` = UInt;
public const val `IPSEC_SA_BUNDLE_FLAG_ALLOW_NULL_TARGET_NAME_MATCH`: `IPSEC_SA_BUNDLE_FLAGS` = 512u;
public const val `IPSEC_SA_BUNDLE_FLAG_ASSUME_UDP_CONTEXT_OUTBOUND`: `IPSEC_SA_BUNDLE_FLAGS` = 2048u;
public const val `IPSEC_SA_BUNDLE_FLAG_CLEAR_DF_ON_TUNNEL`: `IPSEC_SA_BUNDLE_FLAGS` = 1024u;
public const val `IPSEC_SA_BUNDLE_FLAG_ENABLE_OPTIONAL_ASYMMETRIC_IDLE`: UInt = 262144u;
public const val `IPSEC_SA_BUNDLE_FLAG_FORCE_INBOUND_CONNECTIONS`: UInt = 32768u;
public const val `IPSEC_SA_BUNDLE_FLAG_FORCE_OUTBOUND_CONNECTIONS`: UInt = 65536u;
public const val `IPSEC_SA_BUNDLE_FLAG_FORWARD_PATH_INITIATOR`: UInt = 131072u;
public const val `IPSEC_SA_BUNDLE_FLAG_GUARANTEE_ENCRYPTION`: `IPSEC_SA_BUNDLE_FLAGS` = 8u;
public const val `IPSEC_SA_BUNDLE_FLAG_IP_IN_IP_PKT`: UInt = 4194304u;
public const val `IPSEC_SA_BUNDLE_FLAG_LOCALLY_DICTATED_KEYS`: UInt = 1048576u;
public const val `IPSEC_SA_BUNDLE_FLAG_LOW_POWER_MODE_SUPPORT`: UInt = 8388608u;
public const val `IPSEC_SA_BUNDLE_FLAG_ND_BOUNDARY`: `IPSEC_SA_BUNDLE_FLAGS` = 2u;
public const val `IPSEC_SA_BUNDLE_FLAG_ND_PEER_BOUNDARY`: `IPSEC_SA_BUNDLE_FLAGS` = 4096u;
public const val `IPSEC_SA_BUNDLE_FLAG_ND_PEER_NAT_BOUNDARY`: `IPSEC_SA_BUNDLE_FLAGS` = 4u;
public const val `IPSEC_SA_BUNDLE_FLAG_ND_SECURE`: `IPSEC_SA_BUNDLE_FLAGS` = 1u;
public const val `IPSEC_SA_BUNDLE_FLAG_NLB`: UInt = 16u;
public const val `IPSEC_SA_BUNDLE_FLAG_NO_EXPLICIT_CRED_MATCH`: UInt = 128u;
public const val `IPSEC_SA_BUNDLE_FLAG_NO_IMPERSONATION_LUID_VERIFY`: UInt = 64u;
public const val `IPSEC_SA_BUNDLE_FLAG_NO_MACHINE_LUID_VERIFY`: UInt = 32u;
public const val `IPSEC_SA_BUNDLE_FLAG_PEER_SUPPORTS_GUARANTEE_ENCRYPTION`: `IPSEC_SA_BUNDLE_FLAGS` = 16384u;
public const val `IPSEC_SA_BUNDLE_FLAG_SA_OFFLOADED`: UInt = 2097152u;
public const val `IPSEC_SA_BUNDLE_FLAG_SUPPRESS_DUPLICATE_DELETION`: `IPSEC_SA_BUNDLE_FLAGS` = 8192u;
public const val `IPSEC_SA_BUNDLE_FLAG_TUNNEL_BANDWIDTH1`: UInt = 268435456u;
public const val `IPSEC_SA_BUNDLE_FLAG_TUNNEL_BANDWIDTH2`: UInt = 536870912u;
public const val `IPSEC_SA_BUNDLE_FLAG_TUNNEL_BANDWIDTH3`: UInt = 1073741824u;
public const val `IPSEC_SA_BUNDLE_FLAG_TUNNEL_BANDWIDTH4`: UInt = 2147483648u;
public const val `IPSEC_SA_BUNDLE_FLAG_USING_DICTATED_KEYS`: UInt = 524288u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_SA_CIPHER_INFORMATION0` (
    public var `cipherTransform`: `IPSEC_CIPHER_TRANSFORM0`,
    public var `cipherKey`: `FWP_BYTE_BLOB`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPSEC_SA_CONTEXT0` (
    public var `saContextId`: ULong,
    public var `inboundSa`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_SA_DETAILS0`>?,
    public var `outboundSa`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_SA_DETAILS0`>?,
)
// UNSUPPORTED Rust 4338:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for IPSEC_SA_CONTEXT0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPSEC_SA_CONTEXT1` (
    public var `saContextId`: ULong,
    public var `inboundSa`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_SA_DETAILS1`>?,
    public var `outboundSa`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_SA_DETAILS1`>?,
)
// UNSUPPORTED Rust 4352:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for IPSEC_SA_CONTEXT1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `IPSEC_SA_CONTEXT_CALLBACK0` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`IPSEC_SA_CONTEXT_CHANGE0`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_SA_CONTEXT_CHANGE0` (
    public var `changeType`: `IPSEC_SA_CONTEXT_EVENT_TYPE0`,
    public var `saContextId`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPSEC_SA_CONTEXT_ENUM_TEMPLATE0` (
    public var `localSubNet`: `FWP_CONDITION_VALUE0`,
    public var `remoteSubNet`: `FWP_CONDITION_VALUE0`,
)
// UNSUPPORTED Rust 4372:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for IPSEC_SA_CONTEXT_ENUM_TEMPLATE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IPSEC_SA_CONTEXT_EVENT_ADD`: `IPSEC_SA_CONTEXT_EVENT_TYPE0` = 1;
public const val `IPSEC_SA_CONTEXT_EVENT_DELETE`: `IPSEC_SA_CONTEXT_EVENT_TYPE0` = 2;
public const val `IPSEC_SA_CONTEXT_EVENT_MAX`: `IPSEC_SA_CONTEXT_EVENT_TYPE0` = 3;
public typealias `IPSEC_SA_CONTEXT_EVENT_TYPE0` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPSEC_SA_CONTEXT_SUBSCRIPTION0` (
    public var `enumTemplate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_SA_CONTEXT_ENUM_TEMPLATE0`>?,
    public var `flags`: UInt,
    public var `sessionKey`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 4390:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for IPSEC_SA_CONTEXT_SUBSCRIPTION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPSEC_SA_DETAILS0` (
    public var `ipVersion`: `FWP_IP_VERSION`,
    public var `saDirection`: `FWP_DIRECTION`,
    public var `traffic`: `IPSEC_TRAFFIC0`,
    public var `saBundle`: `IPSEC_SA_BUNDLE0`,
    public var `Anonymous`: `IPSEC_SA_DETAILS0_0`,
    public var `transportFilter`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FWPM_FILTER0`>?,
)
// UNSUPPORTED Rust 4407:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for IPSEC_SA_DETAILS0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4413:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union IPSEC_SA_DETAILS0_0 {
//     pub udpEncapsulation: *mut IPSEC_V4_UDP_ENCAPSULATION0,
// }

// UNSUPPORTED Rust 4419:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for IPSEC_SA_DETAILS0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPSEC_SA_DETAILS1` (
    public var `ipVersion`: `FWP_IP_VERSION`,
    public var `saDirection`: `FWP_DIRECTION`,
    public var `traffic`: `IPSEC_TRAFFIC1`,
    public var `saBundle`: `IPSEC_SA_BUNDLE1`,
    public var `Anonymous`: `IPSEC_SA_DETAILS1_0`,
    public var `transportFilter`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FWPM_FILTER0`>?,
    public var `virtualIfTunnelInfo`: `IPSEC_VIRTUAL_IF_TUNNEL_INFO0`,
)
// UNSUPPORTED Rust 4437:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for IPSEC_SA_DETAILS1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4443:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union IPSEC_SA_DETAILS1_0 {
//     pub udpEncapsulation: *mut IPSEC_V4_UDP_ENCAPSULATION0,
// }

// UNSUPPORTED Rust 4449:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for IPSEC_SA_DETAILS1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_SA_ENUM_TEMPLATE0` (
    public var `saDirection`: `FWP_DIRECTION`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_SA_IDLE_TIMEOUT0` (
    public var `idleTimeoutSeconds`: UInt,
    public var `idleTimeoutSecondsFailOver`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_SA_LIFETIME0` (
    public var `lifetimeSeconds`: UInt,
    public var `lifetimeKilobytes`: UInt,
    public var `lifetimePackets`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPSEC_SA_TRANSFORM0` (
    public var `ipsecTransformType`: `IPSEC_TRANSFORM_TYPE`,
    public var `Anonymous`: `IPSEC_SA_TRANSFORM0_0`,
)
// UNSUPPORTED Rust 4479:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_SA_TRANSFORM0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4484:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_SA_TRANSFORM0_0 {
//     pub ahTransform: *mut IPSEC_AUTH_TRANSFORM0,
//     pub espAuthTransform: *mut IPSEC_AUTH_TRANSFORM0,
//     pub espCipherTransform: *mut IPSEC_CIPHER_TRANSFORM0,
//     pub espAuthAndCipherTransform: *mut IPSEC_AUTH_AND_CIPHER_TRANSFORM0,
//     pub espAuthFwTransform: *mut IPSEC_AUTH_TRANSFORM0,
// }

// UNSUPPORTED Rust 4493:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_SA_TRANSFORM0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_STATISTICS0` (
    public var `aggregateSaStatistics`: `IPSEC_AGGREGATE_SA_STATISTICS0`,
    public var `espDropPacketStatistics`: `IPSEC_ESP_DROP_PACKET_STATISTICS0`,
    public var `ahDropPacketStatistics`: `IPSEC_AH_DROP_PACKET_STATISTICS0`,
    public var `aggregateDropPacketStatistics`: `IPSEC_AGGREGATE_DROP_PACKET_STATISTICS0`,
    public var `inboundTrafficStatistics`: `IPSEC_TRAFFIC_STATISTICS0`,
    public var `outboundTrafficStatistics`: `IPSEC_TRAFFIC_STATISTICS0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_STATISTICS1` (
    public var `aggregateSaStatistics`: `IPSEC_AGGREGATE_SA_STATISTICS0`,
    public var `espDropPacketStatistics`: `IPSEC_ESP_DROP_PACKET_STATISTICS0`,
    public var `ahDropPacketStatistics`: `IPSEC_AH_DROP_PACKET_STATISTICS0`,
    public var `aggregateDropPacketStatistics`: `IPSEC_AGGREGATE_DROP_PACKET_STATISTICS1`,
    public var `inboundTrafficStatistics`: `IPSEC_TRAFFIC_STATISTICS1`,
    public var `outboundTrafficStatistics`: `IPSEC_TRAFFIC_STATISTICS1`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_TOKEN0` (
    public var `type`: `IPSEC_TOKEN_TYPE`,
    public var `principal`: `IPSEC_TOKEN_PRINCIPAL`,
    public var `mode`: `IPSEC_TOKEN_MODE`,
    public var `token`: ULong,
)
public typealias `IPSEC_TOKEN_MODE` = Int;
public const val `IPSEC_TOKEN_MODE_EXTENDED`: `IPSEC_TOKEN_MODE` = 1;
public const val `IPSEC_TOKEN_MODE_MAIN`: `IPSEC_TOKEN_MODE` = 0;
public const val `IPSEC_TOKEN_MODE_MAX`: `IPSEC_TOKEN_MODE` = 2;
public typealias `IPSEC_TOKEN_PRINCIPAL` = Int;
public const val `IPSEC_TOKEN_PRINCIPAL_LOCAL`: `IPSEC_TOKEN_PRINCIPAL` = 0;
public const val `IPSEC_TOKEN_PRINCIPAL_MAX`: `IPSEC_TOKEN_PRINCIPAL` = 2;
public const val `IPSEC_TOKEN_PRINCIPAL_PEER`: `IPSEC_TOKEN_PRINCIPAL` = 1;
public typealias `IPSEC_TOKEN_TYPE` = Int;
public const val `IPSEC_TOKEN_TYPE_IMPERSONATION`: `IPSEC_TOKEN_TYPE` = 1;
public const val `IPSEC_TOKEN_TYPE_MACHINE`: `IPSEC_TOKEN_TYPE` = 0;
public const val `IPSEC_TOKEN_TYPE_MAX`: `IPSEC_TOKEN_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPSEC_TRAFFIC0` (
    public var `ipVersion`: `FWP_IP_VERSION`,
    public var `Anonymous1`: `IPSEC_TRAFFIC0_0`,
    public var `Anonymous2`: `IPSEC_TRAFFIC0_1`,
    public var `trafficType`: `IPSEC_TRAFFIC_TYPE`,
    public var `Anonymous3`: `IPSEC_TRAFFIC0_2`,
    public var `remotePort`: UShort,
)
// UNSUPPORTED Rust 4548:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TRAFFIC0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4553:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TRAFFIC0_0 {
//     pub localV4Address: u32,
//     pub localV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4559:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TRAFFIC0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4564:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TRAFFIC0_1 {
//     pub remoteV4Address: u32,
//     pub remoteV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4570:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TRAFFIC0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4575:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TRAFFIC0_2 {
//     pub ipsecFilterId: u64,
//     pub tunnelPolicyId: u64,
// }

// UNSUPPORTED Rust 4581:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TRAFFIC0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPSEC_TRAFFIC1` (
    public var `ipVersion`: `FWP_IP_VERSION`,
    public var `Anonymous1`: `IPSEC_TRAFFIC1_0`,
    public var `Anonymous2`: `IPSEC_TRAFFIC1_1`,
    public var `trafficType`: `IPSEC_TRAFFIC_TYPE`,
    public var `Anonymous3`: `IPSEC_TRAFFIC1_2`,
    public var `remotePort`: UShort,
    public var `localPort`: UShort,
    public var `ipProtocol`: UByte,
    public var `localIfLuid`: ULong,
    public var `realIfProfileId`: UInt,
)
// UNSUPPORTED Rust 4600:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TRAFFIC1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4605:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TRAFFIC1_0 {
//     pub localV4Address: u32,
//     pub localV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4611:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TRAFFIC1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4616:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TRAFFIC1_1 {
//     pub remoteV4Address: u32,
//     pub remoteV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4622:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TRAFFIC1_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4627:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TRAFFIC1_2 {
//     pub ipsecFilterId: u64,
//     pub tunnelPolicyId: u64,
// }

// UNSUPPORTED Rust 4633:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TRAFFIC1_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPSEC_TRAFFIC_SELECTOR0` (
    public var `protocolId`: UByte,
    public var `portStart`: UShort,
    public var `portEnd`: UShort,
    public var `ipVersion`: `FWP_IP_VERSION`,
    public var `Anonymous1`: `IPSEC_TRAFFIC_SELECTOR0_0`,
    public var `Anonymous2`: `IPSEC_TRAFFIC_SELECTOR0_1`,
)
// UNSUPPORTED Rust 4648:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TRAFFIC_SELECTOR0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4653:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TRAFFIC_SELECTOR0_0 {
//     pub startV4Address: u32,
//     pub startV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4659:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TRAFFIC_SELECTOR0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4664:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TRAFFIC_SELECTOR0_1 {
//     pub endV4Address: u32,
//     pub endV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4670:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TRAFFIC_SELECTOR0_1 {
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
public class `IPSEC_TRAFFIC_SELECTOR_POLICY0` (
    public var `flags`: UInt,
    public var `numLocalTrafficSelectors`: UInt,
    public var `localTrafficSelectors`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_TRAFFIC_SELECTOR0`>?,
    public var `numRemoteTrafficSelectors`: UInt,
    public var `remoteTrafficSelectors`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_TRAFFIC_SELECTOR0`>?,
)
// UNSUPPORTED Rust 4684:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TRAFFIC_SELECTOR_POLICY0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_TRAFFIC_STATISTICS0` (
    public var `encryptedByteCount`: ULong,
    public var `authenticatedAHByteCount`: ULong,
    public var `authenticatedESPByteCount`: ULong,
    public var `transportByteCount`: ULong,
    public var `tunnelByteCount`: ULong,
    public var `offloadByteCount`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_TRAFFIC_STATISTICS1` (
    public var `encryptedByteCount`: ULong,
    public var `authenticatedAHByteCount`: ULong,
    public var `authenticatedESPByteCount`: ULong,
    public var `transportByteCount`: ULong,
    public var `tunnelByteCount`: ULong,
    public var `offloadByteCount`: ULong,
    public var `totalSuccessfulPackets`: ULong,
)
public typealias `IPSEC_TRAFFIC_TYPE` = Int;
public const val `IPSEC_TRAFFIC_TYPE_MAX`: `IPSEC_TRAFFIC_TYPE` = 2;
public const val `IPSEC_TRAFFIC_TYPE_TRANSPORT`: `IPSEC_TRAFFIC_TYPE` = 0;
public const val `IPSEC_TRAFFIC_TYPE_TUNNEL`: `IPSEC_TRAFFIC_TYPE` = 1;
public const val `IPSEC_TRANSFORM_AH`: `IPSEC_TRANSFORM_TYPE` = 1;
public const val `IPSEC_TRANSFORM_ESP_AUTH`: `IPSEC_TRANSFORM_TYPE` = 2;
public const val `IPSEC_TRANSFORM_ESP_AUTH_AND_CIPHER`: `IPSEC_TRANSFORM_TYPE` = 4;
public const val `IPSEC_TRANSFORM_ESP_AUTH_FW`: `IPSEC_TRANSFORM_TYPE` = 5;
public const val `IPSEC_TRANSFORM_ESP_CIPHER`: `IPSEC_TRANSFORM_TYPE` = 3;
public typealias `IPSEC_TRANSFORM_TYPE` = Int;
public const val `IPSEC_TRANSFORM_TYPE_MAX`: `IPSEC_TRANSFORM_TYPE` = 6;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPSEC_TRANSPORT_POLICY0` (
    public var `numIpsecProposals`: UInt,
    public var `ipsecProposals`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_PROPOSAL0`>?,
    public var `flags`: `IPSEC_POLICY_FLAG`,
    public var `ndAllowClearTimeoutSeconds`: UInt,
    public var `saIdleTimeout`: `IPSEC_SA_IDLE_TIMEOUT0`,
    public var `emPolicy`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_EM_POLICY0`>?,
)
// UNSUPPORTED Rust 4731:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TRANSPORT_POLICY0 {
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
public class `IPSEC_TRANSPORT_POLICY1` (
    public var `numIpsecProposals`: UInt,
    public var `ipsecProposals`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_PROPOSAL0`>?,
    public var `flags`: `IPSEC_POLICY_FLAG`,
    public var `ndAllowClearTimeoutSeconds`: UInt,
    public var `saIdleTimeout`: `IPSEC_SA_IDLE_TIMEOUT0`,
    public var `emPolicy`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_EM_POLICY1`>?,
)
// UNSUPPORTED Rust 4746:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TRANSPORT_POLICY1 {
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
public class `IPSEC_TRANSPORT_POLICY2` (
    public var `numIpsecProposals`: UInt,
    public var `ipsecProposals`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_PROPOSAL0`>?,
    public var `flags`: `IPSEC_POLICY_FLAG`,
    public var `ndAllowClearTimeoutSeconds`: UInt,
    public var `saIdleTimeout`: `IPSEC_SA_IDLE_TIMEOUT0`,
    public var `emPolicy`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_EM_POLICY2`>?,
)
// UNSUPPORTED Rust 4761:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TRANSPORT_POLICY2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPSEC_TUNNEL_ENDPOINT0` (
    public var `ipVersion`: `FWP_IP_VERSION`,
    public var `Anonymous`: `IPSEC_TUNNEL_ENDPOINT0_0`,
)
// UNSUPPORTED Rust 4772:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TUNNEL_ENDPOINT0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4777:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TUNNEL_ENDPOINT0_0 {
//     pub v4Address: u32,
//     pub v6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4783:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TUNNEL_ENDPOINT0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPSEC_TUNNEL_ENDPOINTS0` (
    public var `ipVersion`: `FWP_IP_VERSION`,
    public var `Anonymous1`: `IPSEC_TUNNEL_ENDPOINTS0_0`,
    public var `Anonymous2`: `IPSEC_TUNNEL_ENDPOINTS0_1`,
)
// UNSUPPORTED Rust 4795:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TUNNEL_ENDPOINTS0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4800:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TUNNEL_ENDPOINTS0_0 {
//     pub localV4Address: u32,
//     pub localV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4806:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TUNNEL_ENDPOINTS0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4811:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TUNNEL_ENDPOINTS0_1 {
//     pub remoteV4Address: u32,
//     pub remoteV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4817:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TUNNEL_ENDPOINTS0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPSEC_TUNNEL_ENDPOINTS1` (
    public var `ipVersion`: `FWP_IP_VERSION`,
    public var `Anonymous1`: `IPSEC_TUNNEL_ENDPOINTS1_0`,
    public var `Anonymous2`: `IPSEC_TUNNEL_ENDPOINTS1_1`,
    public var `localIfLuid`: ULong,
)
// UNSUPPORTED Rust 4830:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TUNNEL_ENDPOINTS1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4835:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TUNNEL_ENDPOINTS1_0 {
//     pub localV4Address: u32,
//     pub localV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4841:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TUNNEL_ENDPOINTS1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4846:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TUNNEL_ENDPOINTS1_1 {
//     pub remoteV4Address: u32,
//     pub remoteV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4852:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TUNNEL_ENDPOINTS1_1 {
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
public class `IPSEC_TUNNEL_ENDPOINTS2` (
    public var `ipVersion`: `FWP_IP_VERSION`,
    public var `Anonymous1`: `IPSEC_TUNNEL_ENDPOINTS2_0`,
    public var `Anonymous2`: `IPSEC_TUNNEL_ENDPOINTS2_1`,
    public var `localIfLuid`: ULong,
    public var `remoteFqdn`: `windows_sys`.`core`.`PWSTR`,
    public var `numAddresses`: UInt,
    public var `remoteAddresses`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_TUNNEL_ENDPOINT0`>?,
)
// UNSUPPORTED Rust 4868:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TUNNEL_ENDPOINTS2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4873:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TUNNEL_ENDPOINTS2_0 {
//     pub localV4Address: u32,
//     pub localV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4879:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TUNNEL_ENDPOINTS2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4884:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TUNNEL_ENDPOINTS2_1 {
//     pub remoteV4Address: u32,
//     pub remoteV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4890:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TUNNEL_ENDPOINTS2_1 {
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
public class `IPSEC_TUNNEL_POLICY0` (
    public var `flags`: `IPSEC_POLICY_FLAG`,
    public var `numIpsecProposals`: UInt,
    public var `ipsecProposals`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_PROPOSAL0`>?,
    public var `tunnelEndpoints`: `IPSEC_TUNNEL_ENDPOINTS0`,
    public var `saIdleTimeout`: `IPSEC_SA_IDLE_TIMEOUT0`,
    public var `emPolicy`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_EM_POLICY0`>?,
)
// UNSUPPORTED Rust 4905:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TUNNEL_POLICY0 {
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
public class `IPSEC_TUNNEL_POLICY1` (
    public var `flags`: `IPSEC_POLICY_FLAG`,
    public var `numIpsecProposals`: UInt,
    public var `ipsecProposals`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_PROPOSAL0`>?,
    public var `tunnelEndpoints`: `IPSEC_TUNNEL_ENDPOINTS1`,
    public var `saIdleTimeout`: `IPSEC_SA_IDLE_TIMEOUT0`,
    public var `emPolicy`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_EM_POLICY1`>?,
)
// UNSUPPORTED Rust 4920:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TUNNEL_POLICY1 {
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
public class `IPSEC_TUNNEL_POLICY2` (
    public var `flags`: `IPSEC_POLICY_FLAG`,
    public var `numIpsecProposals`: UInt,
    public var `ipsecProposals`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_PROPOSAL0`>?,
    public var `tunnelEndpoints`: `IPSEC_TUNNEL_ENDPOINTS2`,
    public var `saIdleTimeout`: `IPSEC_SA_IDLE_TIMEOUT0`,
    public var `emPolicy`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_EM_POLICY2`>?,
    public var `fwdPathSaLifetime`: UInt,
)
// UNSUPPORTED Rust 4936:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TUNNEL_POLICY2 {
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
public class `IPSEC_TUNNEL_POLICY3` (
    public var `flags`: UInt,
    public var `numIpsecProposals`: UInt,
    public var `ipsecProposals`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_PROPOSAL0`>?,
    public var `tunnelEndpoints`: `IPSEC_TUNNEL_ENDPOINTS2`,
    public var `saIdleTimeout`: `IPSEC_SA_IDLE_TIMEOUT0`,
    public var `emPolicy`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IKEEXT_EM_POLICY2`>?,
    public var `fwdPathSaLifetime`: UInt,
    public var `compartmentId`: UInt,
    public var `numTrafficSelectorPolicy`: UInt,
    public var `trafficSelectorPolicies`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IPSEC_TRAFFIC_SELECTOR_POLICY0`>?,
)
// UNSUPPORTED Rust 4955:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPSEC_TUNNEL_POLICY3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_V4_UDP_ENCAPSULATION0` (
    public var `localUdpEncapPort`: UShort,
    public var `remoteUdpEncapPort`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPSEC_VIRTUAL_IF_TUNNEL_INFO0` (
    public var `virtualIfTunnelId`: ULong,
    public var `trafficSelectorId`: ULong,
)
