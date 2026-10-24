// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpkclnt.sys, ABI=system, export=FwpmBfeStateGet0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `FwpmBfeStateGet0`() : `super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_SERVICE_STATE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpkclnt.sys, ABI=system, export=FwpmBfeStateSubscribeChanges0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `FwpmBfeStateSubscribeChanges0`(`deviceobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callback` : `FWPM_SERVICE_STATE_CHANGE_CALLBACK0`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `changehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpkclnt.sys, ABI=system, export=FwpmBfeStateUnsubscribeChanges0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmBfeStateUnsubscribeChanges0`(`changehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmCalloutAdd0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmCalloutAdd0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `callout` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_CALLOUT0`>?, `sd` : `super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`, `id` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmCalloutCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `FwpmCalloutCreateEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_CALLOUT_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmCalloutDeleteById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmCalloutDeleteById0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmCalloutDeleteByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmCalloutDeleteByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmCalloutDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmCalloutDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmCalloutEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `FwpmCalloutEnum0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_CALLOUT0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmCalloutGetById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `FwpmCalloutGetById0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : UInt, `callout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_CALLOUT0`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmCalloutGetByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `FwpmCalloutGetByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `callout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_CALLOUT0`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmCalloutGetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmCalloutGetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmCalloutSetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmCalloutSetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmConnectionCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `FwpmConnectionCreateEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_CONNECTION_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmConnectionDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmConnectionDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmConnectionEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `FwpmConnectionEnum0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_CONNECTION0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmConnectionGetById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `FwpmConnectionGetById0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : ULong, `connection` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_CONNECTION0`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmConnectionGetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmConnectionGetSecurityInfo0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmConnectionSetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmConnectionSetSecurityInfo0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmEngineClose0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmEngineClose0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmEngineGetOption0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmEngineGetOption0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `option` : `super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_ENGINE_OPTION`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWP_VALUE0`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmEngineGetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmEngineGetSecurityInfo0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmEngineOpen0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security", feature = "Win32_System_Rpc"))]
public external fun `FwpmEngineOpen0`(`servername` : `windows_sys`.`core`.`PCWSTR`, `authnservice` : UInt, `authidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`System`.`Rpc`.`SEC_WINNT_AUTH_IDENTITY_W`>?, `session` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_SESSION0`>?, `enginehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmEngineSetOption0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmEngineSetOption0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `option` : `super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_ENGINE_OPTION`, `newvalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWP_VALUE0`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmEngineSetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmEngineSetSecurityInfo0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFilterAdd0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmFilterAdd0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `filter` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_FILTER0`>?, `sd` : `super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`, `id` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFilterCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmFilterCreateEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_FILTER_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFilterDeleteById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmFilterDeleteById0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : ULong) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFilterDeleteByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmFilterDeleteByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFilterDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmFilterDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFilterEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmFilterEnum0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_FILTER0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFilterGetById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmFilterGetById0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : ULong, `filter` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_FILTER0`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFilterGetByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmFilterGetByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `filter` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_FILTER0`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFilterGetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmFilterGetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFilterSetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmFilterSetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmFreeMemory0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmFreeMemory0`(`p` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmIPsecTunnelAdd0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmIPsecTunnelAdd0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `flags` : UInt, `mainmodepolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT0`>?, `tunnelpolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT0`>?, `numfilterconditions` : UInt, `filterconditions` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_FILTER_CONDITION0`>?, `sd` : `super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmIPsecTunnelAdd1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmIPsecTunnelAdd1`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `flags` : UInt, `mainmodepolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT1`>?, `tunnelpolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT1`>?, `numfilterconditions` : UInt, `filterconditions` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_FILTER_CONDITION0`>?, `keymodkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `sd` : `super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmIPsecTunnelAdd2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmIPsecTunnelAdd2`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `flags` : UInt, `mainmodepolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT2`>?, `tunnelpolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT2`>?, `numfilterconditions` : UInt, `filterconditions` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_FILTER_CONDITION0`>?, `keymodkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `sd` : `super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmIPsecTunnelAdd3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmIPsecTunnelAdd3`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `flags` : UInt, `mainmodepolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT3`>?, `tunnelpolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT3`>?, `numfilterconditions` : UInt, `filterconditions` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_FILTER_CONDITION0`>?, `keymodkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `sd` : `super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmIPsecTunnelDeleteByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmIPsecTunnelDeleteByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmLayerCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `FwpmLayerCreateEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_LAYER_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmLayerDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmLayerDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmLayerEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `FwpmLayerEnum0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_LAYER0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmLayerGetById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `FwpmLayerGetById0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : UShort, `layer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_LAYER0`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmLayerGetByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `FwpmLayerGetByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `layer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_LAYER0`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmLayerGetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmLayerGetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmLayerSetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmLayerSetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmNetEventCreateEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_NET_EVENT_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmNetEventDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmNetEventEnum0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_NET_EVENT0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventEnum1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmNetEventEnum1`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_NET_EVENT1`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventEnum2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmNetEventEnum2`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_NET_EVENT2`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventEnum3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmNetEventEnum3`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_NET_EVENT3`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventEnum4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmNetEventEnum4`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_NET_EVENT4`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventEnum5; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmNetEventEnum5`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_NET_EVENT5`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventsGetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmNetEventsGetSecurityInfo0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmNetEventsSetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmNetEventsSetSecurityInfo0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderAdd0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmProviderAdd0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `provider` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER0`>?, `sd` : `super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextAdd0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmProviderContextAdd0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `providercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT0`>?, `sd` : `super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`, `id` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextAdd1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmProviderContextAdd1`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `providercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT1`>?, `sd` : `super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`, `id` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextAdd2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmProviderContextAdd2`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `providercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT2`>?, `sd` : `super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`, `id` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextAdd3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmProviderContextAdd3`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `providercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT3`>?, `sd` : `super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`, `id` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `FwpmProviderContextCreateEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextDeleteById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmProviderContextDeleteById0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : ULong) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextDeleteByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmProviderContextDeleteByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmProviderContextDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmProviderContextEnum0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextEnum1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmProviderContextEnum1`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT1`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextEnum2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmProviderContextEnum2`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT2`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextEnum3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmProviderContextEnum3`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT3`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextGetById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmProviderContextGetById0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : ULong, `providercontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT0`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextGetById1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmProviderContextGetById1`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : ULong, `providercontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT1`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextGetById2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmProviderContextGetById2`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : ULong, `providercontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT2`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextGetById3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmProviderContextGetById3`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : ULong, `providercontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT3`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextGetByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmProviderContextGetByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `providercontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT0`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextGetByKey1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmProviderContextGetByKey1`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `providercontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT1`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextGetByKey2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmProviderContextGetByKey2`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `providercontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT2`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextGetByKey3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmProviderContextGetByKey3`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `providercontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_CONTEXT3`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextGetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderContextGetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderContextSetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderContextSetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `FwpmProviderCreateEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderDeleteByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmProviderDeleteByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmProviderDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `FwpmProviderEnum0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderGetByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `FwpmProviderGetByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `provider` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_PROVIDER0`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderGetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderGetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmProviderSetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmProviderSetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSessionCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `FwpmSessionCreateEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_SESSION_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSessionDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmSessionDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSessionEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmSessionEnum0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_SESSION0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSubLayerAdd0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `FwpmSubLayerAdd0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `sublayer` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_SUBLAYER0`>?, `sd` : `super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSubLayerCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `FwpmSubLayerCreateEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_SUBLAYER_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSubLayerDeleteByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmSubLayerDeleteByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSubLayerDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmSubLayerDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSubLayerEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `FwpmSubLayerEnum0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_SUBLAYER0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSubLayerGetByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `FwpmSubLayerGetByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `sublayer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_SUBLAYER0`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSubLayerGetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmSubLayerGetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmSubLayerSetSecurityInfoByKey0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmSubLayerSetSecurityInfoByKey0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmTransactionAbort0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmTransactionAbort0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmTransactionBegin0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmTransactionBegin0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `flags` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmTransactionCommit0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FwpmTransactionCommit0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmvSwitchEventsGetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmvSwitchEventsGetSecurityInfo0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=FwpmvSwitchEventsSetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FwpmvSwitchEventsSetSecurityInfo0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecDospGetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IPsecDospGetSecurityInfo0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecDospGetStatistics0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `IPsecDospGetStatistics0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `idpstatistics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_DOSP_STATISTICS0`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecDospSetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IPsecDospSetSecurityInfo0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecDospStateCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `IPsecDospStateCreateEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_DOSP_STATE_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecDospStateDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecDospStateDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecDospStateEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `IPsecDospStateEnum0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_DOSP_STATE0`>>>?, `numentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecGetStatistics0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `IPsecGetStatistics0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `ipsecstatistics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_STATISTICS0`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecGetStatistics1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `IPsecGetStatistics1`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `ipsecstatistics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_STATISTICS1`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextAddInbound0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `IPsecSaContextAddInbound0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : ULong, `inboundbundle` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_SA_BUNDLE0`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextAddInbound1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `IPsecSaContextAddInbound1`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : ULong, `inboundbundle` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_SA_BUNDLE1`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextAddOutbound0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `IPsecSaContextAddOutbound0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : ULong, `outboundbundle` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_SA_BUNDLE0`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextAddOutbound1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `IPsecSaContextAddOutbound1`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : ULong, `outboundbundle` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_SA_BUNDLE1`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextCreate0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `IPsecSaContextCreate0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `outboundtraffic` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_TRAFFIC0`>?, `inboundfilterid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `id` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextCreate1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `IPsecSaContextCreate1`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `outboundtraffic` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_TRAFFIC1`>?, `virtualiftunnelinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_VIRTUAL_IF_TUNNEL_INFO0`>?, `inboundfilterid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `id` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `IPsecSaContextCreateEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_SA_CONTEXT_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextDeleteById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecSaContextDeleteById0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : ULong) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecSaContextDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `IPsecSaContextEnum0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_SA_CONTEXT0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextEnum1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `IPsecSaContextEnum1`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_SA_CONTEXT1`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextExpire0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecSaContextExpire0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : ULong) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextGetById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `IPsecSaContextGetById0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : ULong, `sacontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_SA_CONTEXT0`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextGetById1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `IPsecSaContextGetById1`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : ULong, `sacontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_SA_CONTEXT1`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextGetSpi0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `IPsecSaContextGetSpi0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : ULong, `getspi` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_GETSPI0`>?, `inboundspi` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextGetSpi1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `IPsecSaContextGetSpi1`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : ULong, `getspi` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_GETSPI1`>?, `inboundspi` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextSetSpi0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `IPsecSaContextSetSpi0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : ULong, `getspi` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_GETSPI1`>?, `inboundspi` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaContextUpdate0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `IPsecSaContextUpdate0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `flags` : ULong, `newvalues` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_SA_CONTEXT1`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `IPsecSaCreateEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_SA_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaDbGetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IPsecSaDbGetSecurityInfo0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaDbSetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IPsecSaDbSetSecurityInfo0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IPsecSaDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `IPsecSaEnum0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_SA_DETAILS0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IPsecSaEnum1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `IPsecSaEnum1`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IPSEC_SA_DETAILS1`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextGetStatistics0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `IkeextGetStatistics0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `ikeextstatistics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IKEEXT_STATISTICS0`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextGetStatistics1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `IkeextGetStatistics1`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `ikeextstatistics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IKEEXT_STATISTICS1`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextSaCreateEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
public external fun `IkeextSaCreateEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IKEEXT_SA_ENUM_TEMPLATE0`>?, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextSaDbGetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IkeextSaDbGetSecurityInfo0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `sidgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSID`>?, `dacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `sacl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>>?, `securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextSaDbSetSecurityInfo0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `IkeextSaDbSetSecurityInfo0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `securityinfo` : UInt, `sidowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `sidgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`SID`>?, `dacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?, `sacl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Security`.`ACL`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextSaDeleteById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IkeextSaDeleteById0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : ULong) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextSaDestroyEnumHandle0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IkeextSaDestroyEnumHandle0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextSaEnum0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `IkeextSaEnum0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IKEEXT_SA_DETAILS0`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextSaEnum1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `IkeextSaEnum1`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IKEEXT_SA_DETAILS1`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextSaEnum2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `IkeextSaEnum2`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `enumhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `numentriesrequested` : UInt, `entries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IKEEXT_SA_DETAILS2`>>>?, `numentriesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextSaGetById0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `IkeextSaGetById0`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : ULong, `sa` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IKEEXT_SA_DETAILS0`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextSaGetById1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `IkeextSaGetById1`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : ULong, `salookupcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `sa` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IKEEXT_SA_DETAILS1`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fwpuclnt.dll, ABI=system, export=IkeextSaGetById2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public external fun `IkeextSaGetById2`(`enginehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `id` : ULong, `salookupcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `sa` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`IKEEXT_SA_DETAILS2`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
public typealias `FWPM_SERVICE_STATE_CHANGE_CALLBACK0` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `super`.`super`.`super`.`Win32`.`NetworkManagement`.`WindowsFilteringPlatform`.`FWPM_SERVICE_STATE`) -> Unit>>>;
