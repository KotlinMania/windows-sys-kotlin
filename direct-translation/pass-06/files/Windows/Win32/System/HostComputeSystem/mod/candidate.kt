// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsAddResourceToOperation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsAddResourceToOperation`(`operation` : `HCS_OPERATION`, `type` : `HCS_RESOURCE_TYPE`, `uri` : `windows_sys`.`core`.`PCWSTR`, `handle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computestorage.dll, ABI=system, export=HcsAttachLayerStorageFilter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsAttachLayerStorageFilter`(`layerpath` : `windows_sys`.`core`.`PCWSTR`, `layerdata` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsCancelOperation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsCancelOperation`(`operation` : `HCS_OPERATION`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsCloseComputeSystem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsCloseComputeSystem`(`computesystem` : `HCS_SYSTEM`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsCloseOperation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsCloseOperation`(`operation` : `HCS_OPERATION`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsCloseProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsCloseProcess`(`process` : `HCS_PROCESS`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsCrashComputeSystem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsCrashComputeSystem`(`computesystem` : `HCS_SYSTEM`, `operation` : `HCS_OPERATION`, `options` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsCreateComputeSystem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `HcsCreateComputeSystem`(`id` : `windows_sys`.`core`.`PCWSTR`, `configuration` : `windows_sys`.`core`.`PCWSTR`, `operation` : `HCS_OPERATION`, `securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_DESCRIPTOR`>?, `computesystem` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HCS_SYSTEM`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsCreateComputeSystemInNamespace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsCreateComputeSystemInNamespace`(`idnamespace` : `windows_sys`.`core`.`PCWSTR`, `id` : `windows_sys`.`core`.`PCWSTR`, `configuration` : `windows_sys`.`core`.`PCWSTR`, `operation` : `HCS_OPERATION`, `options` : /* Rust *const */ kotlinx.cinterop.CPointer<`HCS_CREATE_OPTIONS`>?, `computesystem` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HCS_SYSTEM`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsCreateEmptyGuestStateFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsCreateEmptyGuestStateFile`(`gueststatefilepath` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsCreateEmptyRuntimeStateFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsCreateEmptyRuntimeStateFile`(`runtimestatefilepath` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsCreateOperation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsCreateOperation`(`context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callback` : `HCS_OPERATION_COMPLETION`) : `HCS_OPERATION`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsCreateOperationWithNotifications; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsCreateOperationWithNotifications`(`eventtypes` : `HCS_OPERATION_OPTIONS`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callback` : `HCS_EVENT_CALLBACK`) : `HCS_OPERATION`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsCreateProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `HcsCreateProcess`(`computesystem` : `HCS_SYSTEM`, `processparameters` : `windows_sys`.`core`.`PCWSTR`, `operation` : `HCS_OPERATION`, `securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_DESCRIPTOR`>?, `process` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HCS_PROCESS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computestorage.dll, ABI=system, export=HcsDestroyLayer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsDestroyLayer`(`layerpath` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computestorage.dll, ABI=system, export=HcsDetachLayerStorageFilter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsDetachLayerStorageFilter`(`layerpath` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsEnumerateComputeSystems; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsEnumerateComputeSystems`(`query` : `windows_sys`.`core`.`PCWSTR`, `operation` : `HCS_OPERATION`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsEnumerateComputeSystemsInNamespace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsEnumerateComputeSystemsInNamespace`(`idnamespace` : `windows_sys`.`core`.`PCWSTR`, `query` : `windows_sys`.`core`.`PCWSTR`, `operation` : `HCS_OPERATION`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computestorage.dll, ABI=system, export=HcsExportLayer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsExportLayer`(`layerpath` : `windows_sys`.`core`.`PCWSTR`, `exportfolderpath` : `windows_sys`.`core`.`PCWSTR`, `layerdata` : `windows_sys`.`core`.`PCWSTR`, `options` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computestorage.dll, ABI=system, export=HcsExportLegacyWritableLayer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsExportLegacyWritableLayer`(`writablelayermountpath` : `windows_sys`.`core`.`PCWSTR`, `writablelayerfolderpath` : `windows_sys`.`core`.`PCWSTR`, `exportfolderpath` : `windows_sys`.`core`.`PCWSTR`, `layerdata` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computestorage.dll, ABI=system, export=HcsFormatWritableLayerVhd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsFormatWritableLayerVhd`(`vhdhandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsGetComputeSystemFromOperation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsGetComputeSystemFromOperation`(`operation` : `HCS_OPERATION`) : `HCS_SYSTEM`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsGetComputeSystemProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsGetComputeSystemProperties`(`computesystem` : `HCS_SYSTEM`, `operation` : `HCS_OPERATION`, `propertyquery` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computestorage.dll, ABI=system, export=HcsGetLayerVhdMountPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsGetLayerVhdMountPath`(`vhdhandle` : `super`.`super`.`Foundation`.`HANDLE`, `mountpath` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsGetOperationContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsGetOperationContext`(`operation` : `HCS_OPERATION`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsGetOperationId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsGetOperationId`(`operation` : `HCS_OPERATION`) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsGetOperationResult; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsGetOperationResult`(`operation` : `HCS_OPERATION`, `resultdocument` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsGetOperationResultAndProcessInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsGetOperationResultAndProcessInfo`(`operation` : `HCS_OPERATION`, `processinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HCS_PROCESS_INFORMATION`>?, `resultdocument` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsGetOperationType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsGetOperationType`(`operation` : `HCS_OPERATION`) : `HCS_OPERATION_TYPE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsGetProcessFromOperation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsGetProcessFromOperation`(`operation` : `HCS_OPERATION`) : `HCS_PROCESS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsGetProcessInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsGetProcessInfo`(`process` : `HCS_PROCESS`, `operation` : `HCS_OPERATION`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsGetProcessProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsGetProcessProperties`(`process` : `HCS_PROCESS`, `operation` : `HCS_OPERATION`, `propertyquery` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsGetProcessorCompatibilityFromSavedState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsGetProcessorCompatibilityFromSavedState`(`runtimefilename` : `windows_sys`.`core`.`PCWSTR`, `processorfeaturesstring` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsGetServiceProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsGetServiceProperties`(`propertyquery` : `windows_sys`.`core`.`PCWSTR`, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsGrantVmAccess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsGrantVmAccess`(`vmid` : `windows_sys`.`core`.`PCWSTR`, `filepath` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsGrantVmGroupAccess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsGrantVmGroupAccess`(`filepath` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computestorage.dll, ABI=system, export=HcsImportLayer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsImportLayer`(`layerpath` : `windows_sys`.`core`.`PCWSTR`, `sourcefolderpath` : `windows_sys`.`core`.`PCWSTR`, `layerdata` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computestorage.dll, ABI=system, export=HcsInitializeLegacyWritableLayer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsInitializeLegacyWritableLayer`(`writablelayermountpath` : `windows_sys`.`core`.`PCWSTR`, `writablelayerfolderpath` : `windows_sys`.`core`.`PCWSTR`, `layerdata` : `windows_sys`.`core`.`PCWSTR`, `options` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computestorage.dll, ABI=system, export=HcsInitializeWritableLayer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsInitializeWritableLayer`(`writablelayerpath` : `windows_sys`.`core`.`PCWSTR`, `layerdata` : `windows_sys`.`core`.`PCWSTR`, `options` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsModifyComputeSystem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsModifyComputeSystem`(`computesystem` : `HCS_SYSTEM`, `operation` : `HCS_OPERATION`, `configuration` : `windows_sys`.`core`.`PCWSTR`, `identity` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsModifyProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsModifyProcess`(`process` : `HCS_PROCESS`, `operation` : `HCS_OPERATION`, `settings` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsModifyServiceSettings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsModifyServiceSettings`(`settings` : `windows_sys`.`core`.`PCWSTR`, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsOpenComputeSystem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsOpenComputeSystem`(`id` : `windows_sys`.`core`.`PCWSTR`, `requestedaccess` : UInt, `computesystem` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HCS_SYSTEM`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsOpenComputeSystemInNamespace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsOpenComputeSystemInNamespace`(`idnamespace` : `windows_sys`.`core`.`PCWSTR`, `id` : `windows_sys`.`core`.`PCWSTR`, `requestedaccess` : UInt, `computesystem` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HCS_SYSTEM`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsOpenProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsOpenProcess`(`computesystem` : `HCS_SYSTEM`, `processid` : UInt, `requestedaccess` : UInt, `process` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HCS_PROCESS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsPauseComputeSystem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsPauseComputeSystem`(`computesystem` : `HCS_SYSTEM`, `operation` : `HCS_OPERATION`, `options` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsResumeComputeSystem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsResumeComputeSystem`(`computesystem` : `HCS_SYSTEM`, `operation` : `HCS_OPERATION`, `options` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsRevokeVmAccess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsRevokeVmAccess`(`vmid` : `windows_sys`.`core`.`PCWSTR`, `filepath` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsRevokeVmGroupAccess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsRevokeVmGroupAccess`(`filepath` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsSaveComputeSystem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsSaveComputeSystem`(`computesystem` : `HCS_SYSTEM`, `operation` : `HCS_OPERATION`, `options` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsSetComputeSystemCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsSetComputeSystemCallback`(`computesystem` : `HCS_SYSTEM`, `callbackoptions` : `HCS_EVENT_OPTIONS`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callback` : `HCS_EVENT_CALLBACK`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsSetOperationCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsSetOperationCallback`(`operation` : `HCS_OPERATION`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callback` : `HCS_OPERATION_COMPLETION`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsSetOperationContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsSetOperationContext`(`operation` : `HCS_OPERATION`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsSetProcessCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsSetProcessCallback`(`process` : `HCS_PROCESS`, `callbackoptions` : `HCS_EVENT_OPTIONS`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callback` : `HCS_EVENT_CALLBACK`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computestorage.dll, ABI=system, export=HcsSetupBaseOSLayer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsSetupBaseOSLayer`(`layerpath` : `windows_sys`.`core`.`PCWSTR`, `vhdhandle` : `super`.`super`.`Foundation`.`HANDLE`, `options` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computestorage.dll, ABI=system, export=HcsSetupBaseOSVolume; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsSetupBaseOSVolume`(`layerpath` : `windows_sys`.`core`.`PCWSTR`, `volumepath` : `windows_sys`.`core`.`PCWSTR`, `options` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsShutDownComputeSystem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsShutDownComputeSystem`(`computesystem` : `HCS_SYSTEM`, `operation` : `HCS_OPERATION`, `options` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsSignalProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsSignalProcess`(`process` : `HCS_PROCESS`, `operation` : `HCS_OPERATION`, `options` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsStartComputeSystem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsStartComputeSystem`(`computesystem` : `HCS_SYSTEM`, `operation` : `HCS_OPERATION`, `options` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsSubmitWerReport; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsSubmitWerReport`(`settings` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsTerminateComputeSystem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsTerminateComputeSystem`(`computesystem` : `HCS_SYSTEM`, `operation` : `HCS_OPERATION`, `options` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsTerminateProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsTerminateProcess`(`process` : `HCS_PROCESS`, `operation` : `HCS_OPERATION`, `options` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsWaitForComputeSystemExit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsWaitForComputeSystemExit`(`computesystem` : `HCS_SYSTEM`, `timeoutms` : UInt, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsWaitForOperationResult; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsWaitForOperationResult`(`operation` : `HCS_OPERATION`, `timeoutms` : UInt, `resultdocument` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsWaitForOperationResultAndProcessInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsWaitForOperationResultAndProcessInfo`(`operation` : `HCS_OPERATION`, `timeoutms` : UInt, `processinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HCS_PROCESS_INFORMATION`>?, `resultdocument` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computecore.dll, ABI=system, export=HcsWaitForProcessExit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcsWaitForProcessExit`(`computesystem` : `HCS_PROCESS`, `timeoutms` : UInt, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
public typealias `HCS_CREATE_OPTIONS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HCS_CREATE_OPTIONS_1` (
    public var `Version`: `HCS_CREATE_OPTIONS`,
    public var `UserToken`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `SecurityDescriptor`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_DESCRIPTOR`>?,
    public var `CallbackOptions`: `HCS_EVENT_OPTIONS`,
    public var `CallbackContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Callback`: `HCS_EVENT_CALLBACK`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `HCS_CREATE_OPTIONS_1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]

    public fun `HCS_CREATE_OPTIONS_1`.Companion.`default`() : `HCS_CREATE_OPTIONS_1` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HCS_EVENT` (
    public var `Type`: `HCS_EVENT_TYPE`,
    public var `EventData`: `windows_sys`.`core`.`PCWSTR`,
    public var `Operation`: `HCS_OPERATION`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `HCS_EVENT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `HCS_EVENT`.Companion.`default`() : `HCS_EVENT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HCS_EVENT_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`HCS_EVENT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public typealias `HCS_EVENT_OPTIONS` = Int;
public typealias `HCS_EVENT_TYPE` = Int;
public typealias `HCS_NOTIFICATIONS` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HCS_NOTIFICATION_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`HRESULT`, `windows_sys`.`core`.`PCWSTR`) -> Unit>>>;
public typealias `HCS_NOTIFICATION_FLAGS` = Int;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HCS_OPERATION` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HCS_OPERATION_COMPLETION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HCS_OPERATION`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public typealias `HCS_OPERATION_OPTIONS` = Int;
public typealias `HCS_OPERATION_TYPE` = Int;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HCS_PROCESS` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HCS_PROCESS_INFORMATION` (
    public var `ProcessId`: UInt,
    public var `Reserved`: UInt,
    public var `StdInput`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `StdOutput`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `StdError`: `super`.`super`.`Foundation`.`HANDLE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `HCS_PROCESS_INFORMATION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `HCS_PROCESS_INFORMATION`.Companion.`default`() : `HCS_PROCESS_INFORMATION` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `HCS_RESOURCE_TYPE` = Int;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HCS_SYSTEM` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `HcsCreateOptions_1`: `HCS_CREATE_OPTIONS` = 65536;
public const val `HcsEventGroupOperationInfo`: `HCS_EVENT_TYPE` = -1073741823;
public const val `HcsEventGroupVmLifecycle`: `HCS_EVENT_TYPE` = -2147483646;
public const val `HcsEventInvalid`: `HCS_EVENT_TYPE` = 0;
public const val `HcsEventOperationCallback`: `HCS_EVENT_TYPE` = 16777216;
public const val `HcsEventOptionEnableOperationCallbacks`: `HCS_EVENT_OPTIONS` = 1;
public const val `HcsEventOptionEnableVmLifecycle`: `HCS_EVENT_OPTIONS` = 2;
public const val `HcsEventOptionNone`: `HCS_EVENT_OPTIONS` = 0;
public const val `HcsEventProcessExited`: `HCS_EVENT_TYPE` = 65536;
public const val `HcsEventServiceDisconnect`: `HCS_EVENT_TYPE` = 33554432;
public const val `HcsEventSystemCrashInitiated`: `HCS_EVENT_TYPE` = 2;
public const val `HcsEventSystemCrashReport`: `HCS_EVENT_TYPE` = 3;
public const val `HcsEventSystemExited`: `HCS_EVENT_TYPE` = 1;
public const val `HcsEventSystemGuestConnectionClosed`: `HCS_EVENT_TYPE` = 6;
public const val `HcsEventSystemRdpEnhancedModeStateChanged`: `HCS_EVENT_TYPE` = 4;
public const val `HcsEventSystemSiloJobCreated`: `HCS_EVENT_TYPE` = 5;
public const val `HcsNotificationFlagFailure`: `HCS_NOTIFICATION_FLAGS` = -2147483648;
public const val `HcsNotificationFlagSuccess`: `HCS_NOTIFICATION_FLAGS` = 0;
public const val `HcsNotificationFlagsReserved`: `HCS_NOTIFICATIONS` = -268435456;
public const val `HcsNotificationInvalid`: `HCS_NOTIFICATIONS` = 0;
public const val `HcsNotificationOperationProgressUpdate`: `HCS_NOTIFICATIONS` = 256;
public const val `HcsNotificationProcessExited`: `HCS_NOTIFICATIONS` = 65536;
public const val `HcsNotificationServiceDisconnect`: `HCS_NOTIFICATIONS` = 16777216;
public const val `HcsNotificationSystemCrashInitiated`: `HCS_NOTIFICATIONS` = 13;
public const val `HcsNotificationSystemCrashReport`: `HCS_NOTIFICATIONS` = 6;
public const val `HcsNotificationSystemCreateCompleted`: `HCS_NOTIFICATIONS` = 2;
public const val `HcsNotificationSystemExited`: `HCS_NOTIFICATIONS` = 1;
public const val `HcsNotificationSystemGetPropertiesCompleted`: `HCS_NOTIFICATIONS` = 11;
public const val `HcsNotificationSystemGuestConnectionClosed`: `HCS_NOTIFICATIONS` = 14;
public const val `HcsNotificationSystemModifyCompleted`: `HCS_NOTIFICATIONS` = 12;
public const val `HcsNotificationSystemOperationCompletion`: `HCS_NOTIFICATIONS` = 15;
public const val `HcsNotificationSystemPassThru`: `HCS_NOTIFICATIONS` = 16;
public const val `HcsNotificationSystemPauseCompleted`: `HCS_NOTIFICATIONS` = 4;
public const val `HcsNotificationSystemRdpEnhancedModeStateChanged`: `HCS_NOTIFICATIONS` = 9;
public const val `HcsNotificationSystemResumeCompleted`: `HCS_NOTIFICATIONS` = 5;
public const val `HcsNotificationSystemSaveCompleted`: `HCS_NOTIFICATIONS` = 8;
public const val `HcsNotificationSystemShutdownCompleted`: `HCS_NOTIFICATIONS` = 10;
public const val `HcsNotificationSystemShutdownFailed`: `HCS_NOTIFICATIONS` = 10;
public const val `HcsNotificationSystemSiloJobCreated`: `HCS_NOTIFICATIONS` = 7;
public const val `HcsNotificationSystemStartCompleted`: `HCS_NOTIFICATIONS` = 3;
public const val `HcsOperationOptionNone`: `HCS_OPERATION_OPTIONS` = 0;
public const val `HcsOperationOptionProgressUpdate`: `HCS_OPERATION_OPTIONS` = 1;
public const val `HcsOperationTypeCrash`: `HCS_OPERATION_TYPE` = 15;
public const val `HcsOperationTypeCreate`: `HCS_OPERATION_TYPE` = 1;
public const val `HcsOperationTypeCreateProcess`: `HCS_OPERATION_TYPE` = 10;
public const val `HcsOperationTypeEnumerate`: `HCS_OPERATION_TYPE` = 0;
public const val `HcsOperationTypeGetProcessInfo`: `HCS_OPERATION_TYPE` = 12;
public const val `HcsOperationTypeGetProcessProperties`: `HCS_OPERATION_TYPE` = 13;
public const val `HcsOperationTypeGetProperties`: `HCS_OPERATION_TYPE` = 9;
public const val `HcsOperationTypeModify`: `HCS_OPERATION_TYPE` = 8;
public const val `HcsOperationTypeModifyProcess`: `HCS_OPERATION_TYPE` = 14;
public const val `HcsOperationTypeNone`: `HCS_OPERATION_TYPE` = -1;
public const val `HcsOperationTypePause`: `HCS_OPERATION_TYPE` = 4;
public const val `HcsOperationTypeResume`: `HCS_OPERATION_TYPE` = 5;
public const val `HcsOperationTypeSave`: `HCS_OPERATION_TYPE` = 6;
public const val `HcsOperationTypeShutdown`: `HCS_OPERATION_TYPE` = 3;
public const val `HcsOperationTypeSignalProcess`: `HCS_OPERATION_TYPE` = 11;
public const val `HcsOperationTypeStart`: `HCS_OPERATION_TYPE` = 2;
public const val `HcsOperationTypeTerminate`: `HCS_OPERATION_TYPE` = 7;
public const val `HcsResourceTypeFile`: `HCS_RESOURCE_TYPE` = 1;
public const val `HcsResourceTypeJob`: `HCS_RESOURCE_TYPE` = 2;
public const val `HcsResourceTypeNone`: `HCS_RESOURCE_TYPE` = 0;
