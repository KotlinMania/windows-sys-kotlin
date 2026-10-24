// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisAcquireReadWriteLock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisAcquireReadWriteLock`(`lock` : /* Rust *mut */ kotlinx.cinterop.CPointer<`NDIS_RW_LOCK`>?, `fwrite` : Boolean, `lockstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LOCK_STATE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisAllocateMemoryWithTag; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisAllocateMemoryWithTag`(`virtualaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `length` : UInt, `tag` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCancelTimer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_System_Kernel"))]
public external fun `NdisCancelTimer`(`timer` : /* Rust *const */ kotlinx.cinterop.CPointer<`NDIS_TIMER`>?, `timercancelled` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisClAddParty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisClAddParty`(`ndisvchandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `protocolpartycontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callparameters` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CO_CALL_PARAMETERS`>?, `ndispartyhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisClCloseAddressFamily; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisClCloseAddressFamily`(`ndisafhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisClCloseCall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisClCloseCall`(`ndisvchandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ndispartyhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisClDeregisterSap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisClDeregisterSap`(`ndissaphandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisClDropParty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisClDropParty`(`ndispartyhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisClGetProtocolVcContextFromTapiCallId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisClGetProtocolVcContextFromTapiCallId`(`tapicallid` : `super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`, `protocolvccontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisClIncomingCallComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisClIncomingCallComplete`(`status` : Int, `ndisvchandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callparameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`CO_CALL_PARAMETERS`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisClMakeCall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisClMakeCall`(`ndisvchandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callparameters` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CO_CALL_PARAMETERS`>?, `protocolpartycontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ndispartyhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisClModifyCallQoS; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisClModifyCallQoS`(`ndisvchandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callparameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`CO_CALL_PARAMETERS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisClRegisterSap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisClRegisterSap`(`ndisafhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `protocolsapcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `sap` : /* Rust *const */ kotlinx.cinterop.CPointer<`CO_SAP`>?, `ndissaphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCloseConfiguration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisCloseConfiguration`(`configurationhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCloseFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisCloseFile`(`filehandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCmActivateVc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisCmActivateVc`(`ndisvchandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callparameters` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CO_CALL_PARAMETERS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCmAddPartyComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisCmAddPartyComplete`(`status` : Int, `ndispartyhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callmgrpartycontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callparameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`CO_CALL_PARAMETERS`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCmCloseAddressFamilyComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisCmCloseAddressFamilyComplete`(`status` : Int, `ndisafhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCmCloseCallComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisCmCloseCallComplete`(`status` : Int, `ndisvchandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ndispartyhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCmDeactivateVc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisCmDeactivateVc`(`ndisvchandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCmDeregisterSapComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisCmDeregisterSapComplete`(`status` : Int, `ndissaphandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCmDispatchCallConnected; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisCmDispatchCallConnected`(`ndisvchandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCmDispatchIncomingCall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisCmDispatchIncomingCall`(`ndissaphandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ndisvchandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callparameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`CO_CALL_PARAMETERS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCmDispatchIncomingCallQoSChange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisCmDispatchIncomingCallQoSChange`(`ndisvchandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callparameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`CO_CALL_PARAMETERS`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCmDispatchIncomingCloseCall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisCmDispatchIncomingCloseCall`(`closestatus` : Int, `ndisvchandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCmDispatchIncomingDropParty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisCmDispatchIncomingDropParty`(`dropstatus` : Int, `ndispartyhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCmDropPartyComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisCmDropPartyComplete`(`status` : Int, `ndispartyhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCmMakeCallComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisCmMakeCallComplete`(`status` : Int, `ndisvchandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ndispartyhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callmgrpartycontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callparameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`CO_CALL_PARAMETERS`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCmModifyCallQoSComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisCmModifyCallQoSComplete`(`status` : Int, `ndisvchandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callparameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`CO_CALL_PARAMETERS`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCmOpenAddressFamilyComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisCmOpenAddressFamilyComplete`(`status` : Int, `ndisafhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callmgrafcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCmRegisterSapComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisCmRegisterSapComplete`(`status` : Int, `ndissaphandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callmgrsapcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCoAssignInstanceName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisCoAssignInstanceName`(`ndisvchandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `baseinstancename` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `vcinstancename` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCoCreateVc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisCoCreateVc`(`ndisbindinghandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ndisafhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `protocolvccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ndisvchandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCoDeleteVc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisCoDeleteVc`(`ndisvchandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCoGetTapiCallId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisCoGetTapiCallId`(`ndisvchandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `tapicallid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VAR_STRING`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCompleteDmaTransfer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `NdisCompleteDmaTransfer`(`status` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `ndisdmahandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`MDL`>?, `offset` : UInt, `length` : UInt, `writetodevice` : Boolean)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisCopyBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `NdisCopyBuffer`(`status` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Foundation`.`MDL`>>?, `poolhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `memorydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `offset` : UInt, `length` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisDeregisterTdiCallBack; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisDeregisterTdiCallBack`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisFreeMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisFreeMemory`(`virtualaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt, `memoryflags` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisGeneratePartialCancelId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisGeneratePartialCancelId`() : UByte
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisGetCurrentProcessorCounts; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisGetCurrentProcessorCounts`(`pidlecount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pkernelanduser` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisGetCurrentProcessorCpuUsage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisGetCurrentProcessorCpuUsage`(`pcpuusage` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisGetRoutineAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisGetRoutineAddress`(`ndisroutinename` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisGetSharedDataAlignment; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisGetSharedDataAlignment`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisGetVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisGetVersion`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisIMAssociateMiniport; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisIMAssociateMiniport`(`driverhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `protocolhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisIMCancelInitializeDeviceInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisIMCancelInitializeDeviceInstance`(`driverhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `deviceinstance` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisIMDeInitializeDeviceInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisIMDeInitializeDeviceInstance`(`ndisminiporthandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisIMGetBindingContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisIMGetBindingContext`(`ndisbindinghandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisIMInitializeDeviceInstanceEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisIMInitializeDeviceInstanceEx`(`driverhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `driverinstance` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `devicecontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisInitializeEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
public external fun `NdisInitializeEvent`(`event` : /* Rust *mut */ kotlinx.cinterop.CPointer<`NDIS_EVENT`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisInitializeReadWriteLock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisInitializeReadWriteLock`(`lock` : /* Rust *mut */ kotlinx.cinterop.CPointer<`NDIS_RW_LOCK`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisInitializeString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisInitializeString`(`destination` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `source` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisInitializeTimer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_System_Kernel"))]
public external fun `NdisInitializeTimer`(`timer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`NDIS_TIMER`>?, `timerfunction` : `PNDIS_TIMER_FUNCTION`, `functioncontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMAllocateSharedMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMAllocateSharedMemory`(`miniportadapterhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt, `cached` : Boolean, `virtualaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `physicaladdress` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMAllocateSharedMemoryAsync; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMAllocateSharedMemoryAsync`(`miniportadapterhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt, `cached` : Boolean, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMCancelTimer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_System_Kernel"))]
public external fun `NdisMCancelTimer`(`timer` : /* Rust *const */ kotlinx.cinterop.CPointer<`NDIS_MINIPORT_TIMER`>?, `timercancelled` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMCloseLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMCloseLog`(`loghandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMCmActivateVc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMCmActivateVc`(`ndisvchandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callparameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`CO_CALL_PARAMETERS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMCmCreateVc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMCmCreateVc`(`miniportadapterhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ndisafhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `miniportvccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ndisvchandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMCmDeactivateVc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMCmDeactivateVc`(`ndisvchandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMCmDeleteVc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMCmDeleteVc`(`ndisvchandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMCmRegisterAddressFamily; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMCmRegisterAddressFamily`(`miniportadapterhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `addressfamily` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CO_ADDRESS_FAMILY`>?, `cmcharacteristics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`NDIS_CALL_MANAGER_CHARACTERISTICS`>?, `sizeofcmcharacteristics` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMCoActivateVcComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMCoActivateVcComplete`(`status` : Int, `ndisvchandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callparameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`CO_CALL_PARAMETERS`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMCoDeactivateVcComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMCoDeactivateVcComplete`(`status` : Int, `ndisvchandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMCreateLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMCreateLog`(`miniportadapterhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : UInt, `loghandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMDeregisterDmaChannel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMDeregisterDmaChannel`(`miniportdmahandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMDeregisterIoPortRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMDeregisterIoPortRange`(`miniportadapterhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `initialport` : UInt, `numberofports` : UInt, `portoffset` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMFlushLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMFlushLog`(`loghandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMFreeSharedMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMFreeSharedMemory`(`miniportadapterhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt, `cached` : Boolean, `virtualaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `physicaladdress` : Long)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMGetDeviceProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `NdisMGetDeviceProperty`(`miniportadapterhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `physicaldeviceobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Foundation`.`DEVICE_OBJECT`>>?, `functionaldeviceobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Foundation`.`DEVICE_OBJECT`>>?, `nextdeviceobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Foundation`.`DEVICE_OBJECT`>>?, `allocatedresources` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`System`.`SystemServices`.`CM_RESOURCE_LIST`>>?, `allocatedresourcestranslated` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`System`.`SystemServices`.`CM_RESOURCE_LIST`>>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMGetDmaAlignment; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMGetDmaAlignment`(`miniportadapterhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMInitializeTimer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_System_Kernel"))]
public external fun `NdisMInitializeTimer`(`timer` : /* Rust *const */ kotlinx.cinterop.CPointer<`NDIS_MINIPORT_TIMER`>?, `miniportadapterhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `timerfunction` : `PNDIS_TIMER_FUNCTION`, `functioncontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMMapIoSpace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMMapIoSpace`(`virtualaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `miniportadapterhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `physicaladdress` : Long, `length` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMQueryAdapterInstanceName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMQueryAdapterInstanceName`(`padapterinstancename` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `miniporthandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMReadDmaCounter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMReadDmaCounter`(`miniportdmahandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMRegisterDmaChannel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_System_SystemServices")]
public external fun `NdisMRegisterDmaChannel`(`miniportdmahandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `miniportadapterhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dmachannel` : UInt, `dma32bitaddresses` : Boolean, `dmadescription` : /* Rust *const */ kotlinx.cinterop.CPointer<`NDIS_DMA_DESCRIPTION`>?, `maximumlength` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMRegisterIoPortRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMRegisterIoPortRange`(`portoffset` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `miniportadapterhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `initialport` : UInt, `numberofports` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMRemoveMiniport; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMRemoveMiniport`(`miniporthandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMSetPeriodicTimer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_System_Kernel"))]
public external fun `NdisMSetPeriodicTimer`(`timer` : /* Rust *const */ kotlinx.cinterop.CPointer<`NDIS_MINIPORT_TIMER`>?, `millisecondperiod` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMSleep; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMSleep`(`microsecondstosleep` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMUnmapIoSpace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMUnmapIoSpace`(`miniportadapterhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `virtualaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMWriteLogData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMWriteLogData`(`loghandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `logbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `logbuffersize` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisMapFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisMapFile`(`status` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `mappedbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `filehandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisOpenConfigurationKeyByIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisOpenConfigurationKeyByIndex`(`status` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `configurationhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `index` : UInt, `keyname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `keyhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisOpenConfigurationKeyByName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisOpenConfigurationKeyByName`(`status` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `configurationhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `subkeyname` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `subkeyhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisOpenFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisOpenFile`(`status` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `filehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `filelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `filename` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `highestacceptableaddress` : Long)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisQueryAdapterInstanceName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisQueryAdapterInstanceName`(`padapterinstancename` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `ndisbindinghandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisQueryBindInstanceName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisQueryBindInstanceName`(`padapterinstancename` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `bindingcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisReEnumerateProtocolBindings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisReEnumerateProtocolBindings`(`ndisprotocolhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisReadConfiguration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisReadConfiguration`(`status` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `parametervalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`NDIS_CONFIGURATION_PARAMETER`>>?, `configurationhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `keyword` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `parametertype` : `NDIS_PARAMETER_TYPE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisReadNetworkAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisReadNetworkAddress`(`status` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `networkaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `networkaddresslength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `configurationhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisRegisterTdiCallBack; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisRegisterTdiCallBack`(`registercallback` : `TDI_REGISTER_CALLBACK`, `pnphandler` : `TDI_PNP_HANDLER`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisReleaseReadWriteLock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisReleaseReadWriteLock`(`lock` : /* Rust *mut */ kotlinx.cinterop.CPointer<`NDIS_RW_LOCK`>?, `lockstate` : /* Rust *const */ kotlinx.cinterop.CPointer<`LOCK_STATE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisResetEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
public external fun `NdisResetEvent`(`event` : /* Rust *const */ kotlinx.cinterop.CPointer<`NDIS_EVENT`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisSetEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
public external fun `NdisSetEvent`(`event` : /* Rust *const */ kotlinx.cinterop.CPointer<`NDIS_EVENT`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisSetPeriodicTimer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_System_Kernel"))]
public external fun `NdisSetPeriodicTimer`(`ndistimer` : /* Rust *const */ kotlinx.cinterop.CPointer<`NDIS_TIMER`>?, `millisecondsperiod` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisSetTimer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_System_Kernel"))]
public external fun `NdisSetTimer`(`timer` : /* Rust *const */ kotlinx.cinterop.CPointer<`NDIS_TIMER`>?, `millisecondstodelay` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisSetTimerEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_System_Kernel"))]
public external fun `NdisSetTimerEx`(`ndistimer` : /* Rust *const */ kotlinx.cinterop.CPointer<`NDIS_TIMER`>?, `millisecondstodelay` : UInt, `functioncontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisSetupDmaTransfer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `NdisSetupDmaTransfer`(`status` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `ndisdmahandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`MDL`>?, `offset` : UInt, `length` : UInt, `writetodevice` : Boolean)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisSystemProcessorCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisSystemProcessorCount`() : Byte
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisUnmapFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisUnmapFile`(`filehandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisUpdateSharedMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisUpdateSharedMemory`(`ndisadapterhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt, `virtualaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `physicaladdress` : Long)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisWaitEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
public external fun `NdisWaitEvent`(`event` : /* Rust *const */ kotlinx.cinterop.CPointer<`NDIS_EVENT`>?, `mstowait` : UInt) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisWriteConfiguration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisWriteConfiguration`(`status` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `configurationhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `keyword` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `parametervalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`NDIS_CONFIGURATION_PARAMETER`>?)
// UNSUPPORTED Rust 123:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("ndis.sys" "C" fn NdisWriteErrorLogEntry(ndisadapterhandle : *const core::ffi::c_void, errorcode : u32, numberoferrorvalues : u32, ...));

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndis.sys, ABI=system, export=NdisWriteEventLogEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdisWriteEventLogEntry`(`loghandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `eventcode` : Int, `uniqueeventvalue` : UInt, `numstrings` : UShort, `stringslist` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `datasize` : UInt, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
public const val `AUTHENTICATE`: `OFFLOAD_OPERATION_E` = 1;
public const val `BINARY_COMPATIBLE`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BINARY_DATA` (
    public var `Length`: UShort,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 133:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BINARY_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BROADCAST_VC`: UInt = 8u;
// UNSUPPORTED Rust 139:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BSSID_INFO {
//     pub BSSID: [u8; 6],
//     pub PMKID: [u8; 16],
// }

// UNSUPPORTED Rust 145:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BSSID_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CALL_PARAMETERS_CHANGED`: UInt = 2u;
public const val `CLOCK_NETWORK_DERIVED`: UInt = 2u;
public const val `CLOCK_PRECISION`: UInt = 4u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CL_ADD_PARTY_COMPLETE_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CL_CALL_CONNECTED_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CL_CLOSE_AF_COMPLETE_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CL_CLOSE_CALL_COMPLETE_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CL_DEREG_SAP_COMPLETE_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CL_DROP_PARTY_COMPLETE_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CL_INCOMING_CALL_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CL_INCOMING_CALL_QOS_CHANGE_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CL_INCOMING_CLOSE_CALL_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CL_INCOMING_DROP_PARTY_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CL_MAKE_CALL_COMPLETE_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CL_MODIFY_CALL_QOS_COMPLETE_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CL_OPEN_AF_COMPLETE_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CL_REG_SAP_COMPLETE_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CM_ACTIVATE_VC_COMPLETE_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CM_ADD_PARTY_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CM_CLOSE_AF_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CM_CLOSE_CALL_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CM_DEACTIVATE_VC_COMPLETE_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CM_DEREG_SAP_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CM_DROP_PARTY_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CM_INCOMING_CALL_COMPLETE_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CM_MAKE_CALL_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CM_MODIFY_CALL_QOS_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CM_OPEN_AF_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CM_REG_SAP_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Int>>>;
// UNSUPPORTED Rust 179:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CO_ADDRESS {
//     pub AddressSize: u32,
//     pub Address: [u8; 1],
// }

// UNSUPPORTED Rust 185:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CO_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CO_ADDRESS_FAMILY` (
    public var `AddressFamily`: UInt,
    public var `MajorVersion`: UInt,
    public var `MinorVersion`: UInt,
)
public const val `CO_ADDRESS_FAMILY_PROXY`: UInt = 2147483648u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CO_ADDRESS_LIST` (
    public var `NumberOfAddressesAvailable`: UInt,
    public var `NumberOfAddresses`: UInt,
    public var `AddressList`: `CO_ADDRESS`,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CO_AF_REGISTER_NOTIFY_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CO_CALL_MANAGER_PARAMETERS` (
    public var `Transmit`: `super`.`super`.`super`.`Win32`.`Networking`.`WinSock`.`FLOWSPEC`,
    public var `Receive`: `super`.`super`.`super`.`Win32`.`Networking`.`WinSock`.`FLOWSPEC`,
    public var `CallMgrSpecific`: `CO_SPECIFIC_PARAMETERS`,
)
public typealias `CO_CALL_PARAMETERS` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CO_CREATE_VC_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CO_DELETE_VC_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Int>>>;
public typealias `CO_MEDIA_PARAMETERS` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CO_PVC` (
    public var `NdisAfHandle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `PvcParameters`: `CO_SPECIFIC_PARAMETERS`,
)
// UNSUPPORTED Rust 224:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CO_PVC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 229:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CO_SAP {
//     pub SapType: u32,
//     pub SapLength: u32,
//     pub Sap: [u8; 1],
// }

// UNSUPPORTED Rust 236:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CO_SAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CO_SEND_FLAG_SET_DISCARD_ELIBILITY`: UInt = 1u;
// UNSUPPORTED Rust 242:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CO_SPECIFIC_PARAMETERS {
//     pub ParamType: u32,
//     pub Length: u32,
//     pub Parameters: [u8; 1],
// }

// UNSUPPORTED Rust 249:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CO_SPECIFIC_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPTO_GENERIC_ERROR`: UInt = 1u;
public const val `CRYPTO_INVALID_PACKET_SYNTAX`: UInt = 6u;
public const val `CRYPTO_INVALID_PROTOCOL`: UInt = 7u;
public const val `CRYPTO_SUCCESS`: UInt = 0u;
public const val `CRYPTO_TRANSPORT_AH_AUTH_FAILED`: UInt = 2u;
public const val `CRYPTO_TRANSPORT_ESP_AUTH_FAILED`: UInt = 3u;
public const val `CRYPTO_TUNNEL_AH_AUTH_FAILED`: UInt = 4u;
public const val `CRYPTO_TUNNEL_ESP_AUTH_FAILED`: UInt = 5u;
public const val `CachedNetBufferList`: `NDIS_PER_PACKET_INFO` = 10;
public const val `ClassificationHandlePacketInfo`: `NDIS_PER_PACKET_INFO` = 3;
// UNSUPPORTED Rust 264:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DD_NDIS_DEVICE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Device\\NDIS");

public const val `DOT11_RSN_KCK_LENGTH`: UInt = 16u;
public const val `DOT11_RSN_KEK_LENGTH`: UInt = 16u;
public const val `DOT11_RSN_MAX_CIPHER_KEY_LENGTH`: UInt = 32u;
public const val `EAPOL_REQUEST_ID_WOL_FLAG_MUST_ENCRYPT`: UInt = 1u;
public const val `ENCRYPT`: `OFFLOAD_OPERATION_E` = 2;
public const val `ERRED_PACKET_INDICATION`: UInt = 1u;
public const val `ETHERNET_LENGTH_OF_ADDRESS`: UInt = 6u;
public typealias `ETH_FILTER` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILTERDBS` (
    public var `Anonymous`: `FILTERDBS_0`,
    public var `TrDB`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?,
    public var `YYYDB`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `XXXDB`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 281:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILTERDBS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 286:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FILTERDBS_0 {
//     pub EthDB: *mut ETH_FILTER,
//     pub NullDB: *mut isize,
// }

// UNSUPPORTED Rust 292:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILTERDBS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GEN_GET_NETCARD_TIME` (
    public var `ReadTime`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GEN_GET_TIME_CAPS` (
    public var `Flags`: UInt,
    public var `ClockPrecision`: UInt,
)
// UNSUPPORTED Rust 308:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_NDIS_NDK_CAPABILITIES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7969ba4d_dd80_4bc7_b3e6_68043997e519);

// UNSUPPORTED Rust 309:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_NDIS_NDK_STATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x530c69c9_2f51_49de_a1af_088d54ffa474);

public const val `INDICATE_END_OF_TX`: UInt = 32u;
public const val `INDICATE_ERRED_PACKETS`: UInt = 16u;
public const val `IOCTL_NDIS_RESERVED5`: UInt = 1507380u;
public const val `IOCTL_NDIS_RESERVED6`: UInt = 1540152u;
public const val `IPSEC_OFFLOAD_V2_AND_TCP_CHECKSUM_COEXISTENCE`: UInt = 2u;
public const val `IPSEC_OFFLOAD_V2_AND_UDP_CHECKSUM_COEXISTENCE`: UInt = 4u;
public const val `IPSEC_OFFLOAD_V2_AUTHENTICATION_AES_GCM_128`: UInt = 8u;
public const val `IPSEC_OFFLOAD_V2_AUTHENTICATION_AES_GCM_192`: UInt = 16u;
public const val `IPSEC_OFFLOAD_V2_AUTHENTICATION_AES_GCM_256`: UInt = 32u;
public const val `IPSEC_OFFLOAD_V2_AUTHENTICATION_MD5`: UInt = 1u;
public const val `IPSEC_OFFLOAD_V2_AUTHENTICATION_SHA_1`: UInt = 2u;
public const val `IPSEC_OFFLOAD_V2_AUTHENTICATION_SHA_256`: UInt = 4u;
public const val `IPSEC_OFFLOAD_V2_ENCRYPTION_3_DES_CBC`: UInt = 4u;
public const val `IPSEC_OFFLOAD_V2_ENCRYPTION_AES_CBC_128`: UInt = 64u;
public const val `IPSEC_OFFLOAD_V2_ENCRYPTION_AES_CBC_192`: UInt = 128u;
public const val `IPSEC_OFFLOAD_V2_ENCRYPTION_AES_CBC_256`: UInt = 256u;
public const val `IPSEC_OFFLOAD_V2_ENCRYPTION_AES_GCM_128`: UInt = 8u;
public const val `IPSEC_OFFLOAD_V2_ENCRYPTION_AES_GCM_192`: UInt = 16u;
public const val `IPSEC_OFFLOAD_V2_ENCRYPTION_AES_GCM_256`: UInt = 32u;
public const val `IPSEC_OFFLOAD_V2_ENCRYPTION_DES_CBC`: UInt = 2u;
public const val `IPSEC_OFFLOAD_V2_ENCRYPTION_NONE`: UInt = 1u;
public const val `IPSEC_OFFLOAD_V2_ESN_SA`: UInt = 1u;
public const val `IPSEC_OFFLOAD_V2_INBOUND`: UInt = 1u;
public const val `IPSEC_OFFLOAD_V2_IPv6`: UInt = 16u;
public const val `IPSEC_OFFLOAD_V2_MAX_EXTENSION_HEADERS`: UInt = 2u;
public const val `IPSEC_OFFLOAD_V2_TRANSPORT_OVER_UDP_ESP_ENCAPSULATION_TUNNEL`: UInt = 4u;
public const val `IPSEC_OFFLOAD_V2_UDP_ESP_ENCAPSULATION_NONE`: UInt = 0u;
public const val `IPSEC_OFFLOAD_V2_UDP_ESP_ENCAPSULATION_TRANSPORT`: UInt = 1u;
public const val `IPSEC_OFFLOAD_V2_UDP_ESP_ENCAPSULATION_TRANSPORT_OVER_TUNNEL`: UInt = 8u;
public const val `IPSEC_OFFLOAD_V2_UDP_ESP_ENCAPSULATION_TUNNEL`: UInt = 2u;
public const val `IPSEC_TPTOVERTUN_UDPESP_ENCAPTYPE_IKE`: UInt = 4u;
public const val `IPSEC_TPTOVERTUN_UDPESP_ENCAPTYPE_OTHER`: UInt = 64u;
public const val `IPSEC_TPT_UDPESP_ENCAPTYPE_IKE`: UInt = 1u;
public const val `IPSEC_TPT_UDPESP_ENCAPTYPE_OTHER`: UInt = 16u;
public const val `IPSEC_TPT_UDPESP_OVER_PURE_TUN_ENCAPTYPE_IKE`: UInt = 8u;
public const val `IPSEC_TPT_UDPESP_OVER_PURE_TUN_ENCAPTYPE_OTHER`: UInt = 128u;
public const val `IPSEC_TUN_UDPESP_ENCAPTYPE_IKE`: UInt = 2u;
public const val `IPSEC_TUN_UDPESP_ENCAPTYPE_OTHER`: UInt = 32u;
public const val `Ieee8021QInfo`: `NDIS_PER_PACKET_INFO` = 6;
public const val `IpSecPacketInfo`: `NDIS_PER_PACKET_INFO` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LOCK_STATE` (
    public var `LockState`: UShort,
    public var `OldIrql`: UByte,
)
public const val `MAXIMUM_IP_OPER_STATUS_ADDRESS_FAMILIES_SUPPORTED`: UInt = 32u;
public const val `MAX_HASHES`: UInt = 4u;
// UNSUPPORTED Rust 358:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MEDIA_SPECIFIC_INFORMATION {
//     pub NextEntryOffset: u32,
//     pub ClassId: NDIS_CLASS_ID,
//     pub Size: u32,
//     pub ClassInformation: [u8; 1],
// }

// UNSUPPORTED Rust 366:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MEDIA_SPECIFIC_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MINIPORT_CO_ACTIVATE_VC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`CO_CALL_PARAMETERS`>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MINIPORT_CO_CREATE_VC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MINIPORT_CO_DEACTIVATE_VC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MINIPORT_CO_DELETE_VC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Int>>>;
public const val `MULTIPOINT_VC`: UInt = 16u;
public const val `MaxPerPacketInfo`: `NDIS_PER_PACKET_INFO` = 12;
public const val `NBL_FLAGS_MINIPORT_RESERVED`: UInt = 61440u;
public const val `NBL_FLAGS_NDIS_RESERVED`: UInt = 4092u;
public const val `NBL_FLAGS_PROTOCOL_RESERVED`: UInt = 4293918723u;
public const val `NBL_FLAGS_SCRATCH`: UInt = 983040u;
public const val `NBL_PROT_RSVD_FLAGS`: UInt = 4293918723u;
public const val `NDIS630_MINIPORT`: UInt = 1u;
public const val `NDIS685_MINIPORT`: UInt = 1u;
// UNSUPPORTED Rust 384:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_802_11_AI_REQFI {
//     pub Capabilities: u16,
//     pub ListenInterval: u16,
//     pub CurrentAPAddress: [u8; 6],
// }

// UNSUPPORTED Rust 391:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_AI_REQFI {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_802_11_AI_REQFI_CAPABILITIES`: UInt = 1u;
public const val `NDIS_802_11_AI_REQFI_CURRENTAPADDRESS`: UInt = 4u;
public const val `NDIS_802_11_AI_REQFI_LISTENINTERVAL`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_802_11_AI_RESFI` (
    public var `Capabilities`: UShort,
    public var `StatusCode`: UShort,
    public var `AssociationId`: UShort,
)
public const val `NDIS_802_11_AI_RESFI_ASSOCIATIONID`: UInt = 4u;
public const val `NDIS_802_11_AI_RESFI_CAPABILITIES`: UInt = 1u;
public const val `NDIS_802_11_AI_RESFI_STATUSCODE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_802_11_ASSOCIATION_INFORMATION` (
    public var `Length`: UInt,
    public var `AvailableRequestFixedIEs`: UShort,
    public var `RequestFixedIEs`: `NDIS_802_11_AI_REQFI`,
    public var `RequestIELength`: UInt,
    public var `OffsetRequestIEs`: UInt,
    public var `AvailableResponseFixedIEs`: UShort,
    public var `ResponseFixedIEs`: `NDIS_802_11_AI_RESFI`,
    public var `ResponseIELength`: UInt,
    public var `OffsetResponseIEs`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_802_11_AUTHENTICATION_ENCRYPTION` (
    public var `AuthModeSupported`: `NDIS_802_11_AUTHENTICATION_MODE`,
    public var `EncryptStatusSupported`: `NDIS_802_11_WEP_STATUS`,
)
// UNSUPPORTED Rust 428:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_802_11_AUTHENTICATION_EVENT {
//     pub Status: NDIS_802_11_STATUS_INDICATION,
//     pub Request: [NDIS_802_11_AUTHENTICATION_REQUEST; 1],
// }

// UNSUPPORTED Rust 434:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_AUTHENTICATION_EVENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NDIS_802_11_AUTHENTICATION_MODE` = Int;
// UNSUPPORTED Rust 440:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_802_11_AUTHENTICATION_REQUEST {
//     pub Length: u32,
//     pub Bssid: [u8; 6],
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 447:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_AUTHENTICATION_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_802_11_AUTH_REQUEST_AUTH_FIELDS`: UInt = 15u;
public const val `NDIS_802_11_AUTH_REQUEST_GROUP_ERROR`: UInt = 14u;
public const val `NDIS_802_11_AUTH_REQUEST_KEYUPDATE`: UInt = 2u;
public const val `NDIS_802_11_AUTH_REQUEST_PAIRWISE_ERROR`: UInt = 6u;
public const val `NDIS_802_11_AUTH_REQUEST_REAUTH`: UInt = 1u;
// UNSUPPORTED Rust 457:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_802_11_BSSID_LIST {
//     pub NumberOfItems: u32,
//     pub Bssid: [NDIS_WLAN_BSSID; 1],
// }

// UNSUPPORTED Rust 463:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_BSSID_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 468:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_802_11_BSSID_LIST_EX {
//     pub NumberOfItems: u32,
//     pub Bssid: [NDIS_WLAN_BSSID_EX; 1],
// }

// UNSUPPORTED Rust 474:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_BSSID_LIST_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 479:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_802_11_CAPABILITY {
//     pub Length: u32,
//     pub Version: u32,
//     pub NoOfPMKIDs: u32,
//     pub NoOfAuthEncryptPairsSupported: u32,
//     pub AuthenticationEncryptionSupported: [NDIS_802_11_AUTHENTICATION_ENCRYPTION; 1],
// }

// UNSUPPORTED Rust 488:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_CAPABILITY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_802_11_CONFIGURATION` (
    public var `Length`: UInt,
    public var `BeaconPeriod`: UInt,
    public var `ATIMWindow`: UInt,
    public var `DSConfig`: UInt,
    public var `FHConfig`: `NDIS_802_11_CONFIGURATION_FH`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_802_11_CONFIGURATION_FH` (
    public var `Length`: UInt,
    public var `HopPattern`: UInt,
    public var `HopSet`: UInt,
    public var `DwellTime`: UInt,
)
// UNSUPPORTED Rust 510:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_802_11_FIXED_IEs {
//     pub Timestamp: [u8; 8],
//     pub BeaconInterval: u16,
//     pub Capabilities: u16,
// }

// UNSUPPORTED Rust 517:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_FIXED_IEs {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 522:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_802_11_KEY {
//     pub Length: u32,
//     pub KeyIndex: u32,
//     pub KeyLength: u32,
//     pub BSSID: [u8; 6],
//     pub KeyRSC: u64,
//     pub KeyMaterial: [u8; 1],
// }

// UNSUPPORTED Rust 532:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_KEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_802_11_LENGTH_RATES`: UInt = 8u;
public const val `NDIS_802_11_LENGTH_RATES_EX`: UInt = 16u;
public const val `NDIS_802_11_LENGTH_SSID`: UInt = 32u;
public typealias `NDIS_802_11_MEDIA_STREAM_MODE` = Int;
public typealias `NDIS_802_11_NETWORK_INFRASTRUCTURE` = Int;
public typealias `NDIS_802_11_NETWORK_TYPE` = Int;
// UNSUPPORTED Rust 543:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_802_11_NETWORK_TYPE_LIST {
//     pub NumberOfItems: u32,
//     pub NetworkType: [NDIS_802_11_NETWORK_TYPE; 1],
// }

// UNSUPPORTED Rust 549:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_NETWORK_TYPE_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 554:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_802_11_NON_BCAST_SSID_LIST {
//     pub NumberOfItems: u32,
//     pub Non_Bcast_Ssid: [NDIS_802_11_SSID; 1],
// }

// UNSUPPORTED Rust 560:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_NON_BCAST_SSID_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 565:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_802_11_PMKID {
//     pub Length: u32,
//     pub BSSIDInfoCount: u32,
//     pub BSSIDInfo: [BSSID_INFO; 1],
// }

// UNSUPPORTED Rust 572:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_PMKID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 577:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_802_11_PMKID_CANDIDATE_LIST {
//     pub Version: u32,
//     pub NumCandidates: u32,
//     pub CandidateList: [PMKID_CANDIDATE; 1],
// }

// UNSUPPORTED Rust 584:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_PMKID_CANDIDATE_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_802_11_PMKID_CANDIDATE_PREAUTH_ENABLED`: UInt = 1u;
public typealias `NDIS_802_11_POWER_MODE` = Int;
public typealias `NDIS_802_11_PRIVACY_FILTER` = Int;
public typealias `NDIS_802_11_RADIO_STATUS` = Int;
public typealias `NDIS_802_11_RELOAD_DEFAULTS` = Int;
// UNSUPPORTED Rust 594:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_802_11_REMOVE_KEY {
//     pub Length: u32,
//     pub KeyIndex: u32,
//     pub BSSID: [u8; 6],
// }

// UNSUPPORTED Rust 601:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_REMOVE_KEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 606:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_802_11_SSID {
//     pub SsidLength: u32,
//     pub Ssid: [u8; 32],
// }

// UNSUPPORTED Rust 612:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_SSID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_802_11_STATISTICS` (
    public var `Length`: UInt,
    public var `TransmittedFragmentCount`: Long,
    public var `MulticastTransmittedFrameCount`: Long,
    public var `FailedCount`: Long,
    public var `RetryCount`: Long,
    public var `MultipleRetryCount`: Long,
    public var `RTSSuccessCount`: Long,
    public var `RTSFailureCount`: Long,
    public var `ACKFailureCount`: Long,
    public var `FrameDuplicateCount`: Long,
    public var `ReceivedFragmentCount`: Long,
    public var `MulticastReceivedFrameCount`: Long,
    public var `FCSErrorCount`: Long,
    public var `TKIPLocalMICFailures`: Long,
    public var `TKIPICVErrorCount`: Long,
    public var `TKIPCounterMeasuresInvoked`: Long,
    public var `TKIPReplays`: Long,
    public var `CCMPFormatErrors`: Long,
    public var `CCMPReplays`: Long,
    public var `CCMPDecryptErrors`: Long,
    public var `FourWayHandshakeFailures`: Long,
    public var `WEPUndecryptableCount`: Long,
    public var `WEPICVErrorCount`: Long,
    public var `DecryptSuccessCount`: Long,
    public var `DecryptFailureCount`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_802_11_STATUS_INDICATION` (
    public var `StatusType`: `NDIS_802_11_STATUS_TYPE`,
)
public typealias `NDIS_802_11_STATUS_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_802_11_TEST` (
    public var `Length`: UInt,
    public var `Type`: UInt,
    public var `Anonymous`: `NDIS_802_11_TEST_0`,
)
// UNSUPPORTED Rust 659:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_TEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 664:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NDIS_802_11_TEST_0 {
//     pub AuthenticationEvent: NDIS_802_11_AUTHENTICATION_EVENT,
//     pub RssiTrigger: i32,
// }

// UNSUPPORTED Rust 670:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_TEST_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 675:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_802_11_VARIABLE_IEs {
//     pub ElementID: u8,
//     pub Length: u8,
//     pub data: [u8; 1],
// }

// UNSUPPORTED Rust 682:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_VARIABLE_IEs {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 687:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_802_11_WEP {
//     pub Length: u32,
//     pub KeyIndex: u32,
//     pub KeyLength: u32,
//     pub KeyMaterial: [u8; 1],
// }

// UNSUPPORTED Rust 695:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_WEP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NDIS_802_11_WEP_STATUS` = Int;
public const val `NDIS_802_3_MAC_OPTION_PRIORITY`: UInt = 1u;
public typealias `NDIS_802_5_RING_STATE` = Int;
public typealias `NDIS_AF_LIST` = Long;
public const val `NDIS_ANY_NUMBER_OF_NBLS`: UInt = 4294967295u;
public const val `NDIS_ATTRIBUTE_BUS_MASTER`: UInt = 8u;
public const val `NDIS_ATTRIBUTE_DESERIALIZE`: UInt = 32u;
public const val `NDIS_ATTRIBUTE_DO_NOT_BIND_TO_ALL_CO`: UInt = 1024u;
public const val `NDIS_ATTRIBUTE_IGNORE_PACKET_TIMEOUT`: UInt = 1u;
public const val `NDIS_ATTRIBUTE_IGNORE_REQUEST_TIMEOUT`: UInt = 2u;
public const val `NDIS_ATTRIBUTE_IGNORE_TOKEN_RING_ERRORS`: UInt = 4u;
public const val `NDIS_ATTRIBUTE_INTERMEDIATE_DRIVER`: UInt = 16u;
public const val `NDIS_ATTRIBUTE_MINIPORT_PADS_SHORT_PACKETS`: UInt = 2048u;
public const val `NDIS_ATTRIBUTE_NOT_CO_NDIS`: UInt = 256u;
public const val `NDIS_ATTRIBUTE_NO_HALT_ON_SUSPEND`: UInt = 64u;
public const val `NDIS_ATTRIBUTE_SURPRISE_REMOVE_OK`: UInt = 128u;
public const val `NDIS_ATTRIBUTE_USES_SAFE_BUFFER_APIS`: UInt = 512u;
public const val `NDIS_BIND_FAILED_NOTIFICATION_REVISION_1`: UInt = 1u;
public const val `NDIS_BIND_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_BIND_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NDIS_BIND_PARAMETERS_REVISION_3`: UInt = 3u;
public const val `NDIS_BIND_PARAMETERS_REVISION_4`: UInt = 4u;
public typealias `NDIS_CALL_MANAGER_CHARACTERISTICS` = Long;
public typealias `NDIS_CLASS_ID` = Int;
public const val `NDIS_CLONE_FLAGS_RESERVED`: UInt = 1u;
public const val `NDIS_CLONE_FLAGS_USE_ORIGINAL_MDLS`: UInt = 2u;
public const val `NDIS_CONFIGURATION_OBJECT_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_CONFIGURATION_PARAMETER` (
    public var `ParameterType`: `NDIS_PARAMETER_TYPE`,
    public var `ParameterData`: `NDIS_CONFIGURATION_PARAMETER_0`,
)
// UNSUPPORTED Rust 733:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_CONFIGURATION_PARAMETER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 738:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NDIS_CONFIGURATION_PARAMETER_0 {
//     pub IntegerData: u32,
//     pub StringData: super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub BinaryData: BINARY_DATA,
// }

// UNSUPPORTED Rust 745:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_CONFIGURATION_PARAMETER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_CONFIG_FLAG_FILTER_INSTANCE_CONFIGURATION`: UInt = 1u;
public const val `NDIS_CO_CALL_MANAGER_OPTIONAL_HANDLERS_REVISION_1`: UInt = 1u;
public const val `NDIS_CO_CLIENT_OPTIONAL_HANDLERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_CO_DEVICE_PROFILE` (
    public var `DeviceDescription`: `NDIS_VAR_DATA_DESC`,
    public var `DevSpecificInfo`: `NDIS_VAR_DATA_DESC`,
    public var `ulTAPISupplementaryPassThru`: UInt,
    public var `ulAddressModes`: UInt,
    public var `ulNumAddresses`: UInt,
    public var `ulBearerModes`: UInt,
    public var `ulMaxTxRate`: UInt,
    public var `ulMinTxRate`: UInt,
    public var `ulMaxRxRate`: UInt,
    public var `ulMinRxRate`: UInt,
    public var `ulMediaModes`: UInt,
    public var `ulGenerateToneModes`: UInt,
    public var `ulGenerateToneMaxNumFreq`: UInt,
    public var `ulGenerateDigitModes`: UInt,
    public var `ulMonitorToneMaxNumFreq`: UInt,
    public var `ulMonitorToneMaxNumEntries`: UInt,
    public var `ulMonitorDigitModes`: UInt,
    public var `ulGatherDigitsMinTimeout`: UInt,
    public var `ulGatherDigitsMaxTimeout`: UInt,
    public var `ulDevCapFlags`: UInt,
    public var `ulMaxNumActiveCalls`: UInt,
    public var `ulAnswerMode`: UInt,
    public var `ulUUIAcceptSize`: UInt,
    public var `ulUUIAnswerSize`: UInt,
    public var `ulUUIMakeCallSize`: UInt,
    public var `ulUUIDropSize`: UInt,
    public var `ulUUISendUserUserInfoSize`: UInt,
    public var `ulUUICallInfoSize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_CO_LINK_SPEED` (
    public var `Outbound`: UInt,
    public var `Inbound`: UInt,
)
public const val `NDIS_CO_MAC_OPTION_DYNAMIC_LINK_SPEED`: UInt = 1u;
public const val `NDIS_DEFAULT_RECEIVE_FILTER_ID`: UInt = 0u;
public const val `NDIS_DEFAULT_RECEIVE_QUEUE_GROUP_ID`: UInt = 0u;
public const val `NDIS_DEFAULT_RECEIVE_QUEUE_ID`: UInt = 0u;
public const val `NDIS_DEFAULT_SWITCH_ID`: UInt = 0u;
public const val `NDIS_DEFAULT_VPORT_ID`: UInt = 0u;
public const val `NDIS_DEVICE_OBJECT_ATTRIBUTES_REVISION_1`: UInt = 1u;
public typealias `NDIS_DEVICE_PNP_EVENT` = Int;
public typealias `NDIS_DEVICE_POWER_STATE` = Int;
public const val `NDIS_DEVICE_TYPE_ENDPOINT`: UInt = 1u;
public const val `NDIS_DEVICE_WAKE_ON_MAGIC_PACKET_ENABLE`: UInt = 4u;
public const val `NDIS_DEVICE_WAKE_ON_PATTERN_MATCH_ENABLE`: UInt = 2u;
public const val `NDIS_DEVICE_WAKE_UP_ENABLE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_DMA_BLOCK` (
    public var `MapRegisterBase`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `AllocationEvent`: `super`.`super`.`Foundation`.`KEVENT`,
    public var `SystemAdapterObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Miniport`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `InProgress`: Boolean,
)
// UNSUPPORTED Rust 814:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// impl Default for NDIS_DMA_BLOCK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Wdk_System_SystemServices")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_DMA_DESCRIPTION` (
    public var `DemandMode`: Boolean,
    public var `AutoInitialize`: Boolean,
    public var `DmaChannelSpecified`: Boolean,
    public var `DmaWidth`: `super`.`super`.`System`.`SystemServices`.`DMA_WIDTH`,
    public var `DmaSpeed`: `super`.`super`.`System`.`SystemServices`.`DMA_SPEED`,
    public var `DmaPort`: UInt,
    public var `DmaChannel`: UInt,
)
public const val `NDIS_DRIVER_FLAGS_RESERVED`: UInt = 8u;
public const val `NDIS_ENCAPSULATED_PACKET_TASK_OFFLOAD_INNER_IPV4`: UInt = 1u;
public const val `NDIS_ENCAPSULATED_PACKET_TASK_OFFLOAD_INNER_IPV6`: UInt = 4u;
public const val `NDIS_ENCAPSULATED_PACKET_TASK_OFFLOAD_NOT_SUPPORTED`: UInt = 0u;
public const val `NDIS_ENCAPSULATED_PACKET_TASK_OFFLOAD_OUTER_IPV4`: UInt = 2u;
public const val `NDIS_ENCAPSULATED_PACKET_TASK_OFFLOAD_OUTER_IPV6`: UInt = 8u;
public const val `NDIS_ENCAPSULATION_IEEE_802_3`: UInt = 2u;
public const val `NDIS_ENCAPSULATION_IEEE_802_3_P_AND_Q`: UInt = 4u;
public const val `NDIS_ENCAPSULATION_IEEE_802_3_P_AND_Q_IN_OOB`: UInt = 8u;
public const val `NDIS_ENCAPSULATION_IEEE_LLC_SNAP_ROUTED`: UInt = 16u;
public const val `NDIS_ENCAPSULATION_NOT_SUPPORTED`: UInt = 0u;
public const val `NDIS_ENCAPSULATION_NULL`: UInt = 1u;
public const val `NDIS_ENCAPSULATION_TYPE_GRE_MAC`: UInt = 1u;
public const val `NDIS_ENCAPSULATION_TYPE_VXLAN`: UInt = 2u;
public const val `NDIS_ENUM_FILTERS_REVISION_1`: UInt = 1u;
public typealias `NDIS_ENVIRONMENT_TYPE` = Int;
public const val `NDIS_ETH_TYPE_802_1Q`: UInt = 33024u;
public const val `NDIS_ETH_TYPE_802_1X`: UInt = 34958u;
public const val `NDIS_ETH_TYPE_ARP`: UInt = 2054u;
public const val `NDIS_ETH_TYPE_IPV4`: UInt = 2048u;
public const val `NDIS_ETH_TYPE_IPV6`: UInt = 34525u;
public const val `NDIS_ETH_TYPE_SLOW_PROTOCOL`: UInt = 34825u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_EVENT` (
    public var `Event`: `super`.`super`.`Foundation`.`KEVENT`,
)
// UNSUPPORTED Rust 860:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// impl Default for NDIS_EVENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NDIS_FDDI_ATTACHMENT_TYPE` = Int;
public typealias `NDIS_FDDI_LCONNECTION_STATE` = Int;
public typealias `NDIS_FDDI_RING_MGT_STATE` = Int;
public const val `NDIS_FILTER_ATTACH_FLAGS_IGNORE_MANDATORY`: UInt = 1u;
public const val `NDIS_FILTER_ATTACH_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_FILTER_ATTACH_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NDIS_FILTER_ATTACH_PARAMETERS_REVISION_3`: UInt = 3u;
public const val `NDIS_FILTER_ATTACH_PARAMETERS_REVISION_4`: UInt = 4u;
public const val `NDIS_FILTER_ATTRIBUTES_REVISION_1`: UInt = 1u;
public const val `NDIS_FILTER_CHARACTERISTICS_REVISION_1`: UInt = 1u;
public const val `NDIS_FILTER_CHARACTERISTICS_REVISION_2`: UInt = 2u;
public const val `NDIS_FILTER_CHARACTERISTICS_REVISION_3`: UInt = 3u;
public const val `NDIS_FILTER_DRIVER_MANDATORY`: UInt = 1u;
public const val `NDIS_FILTER_DRIVER_SUPPORTS_CURRENT_MAC_ADDRESS_CHANGE`: UInt = 2u;
public const val `NDIS_FILTER_DRIVER_SUPPORTS_L2_MTU_SIZE_CHANGE`: UInt = 4u;
public const val `NDIS_FILTER_INTERFACE_IM_FILTER`: UInt = 1u;
public const val `NDIS_FILTER_INTERFACE_LW_FILTER`: UInt = 2u;
public const val `NDIS_FILTER_INTERFACE_RECEIVE_BYPASS`: UInt = 8u;
public const val `NDIS_FILTER_INTERFACE_REVISION_1`: UInt = 1u;
public const val `NDIS_FILTER_INTERFACE_REVISION_2`: UInt = 2u;
public const val `NDIS_FILTER_INTERFACE_SEND_BYPASS`: UInt = 4u;
public const val `NDIS_FILTER_MAJOR_VERSION`: UInt = 6u;
public const val `NDIS_FILTER_MINIMUM_MAJOR_VERSION`: UInt = 6u;
public const val `NDIS_FILTER_MINIMUM_MINOR_VERSION`: UInt = 0u;
public const val `NDIS_FILTER_MINOR_VERSION`: UInt = 87u;
public const val `NDIS_FILTER_PARTIAL_CHARACTERISTICS_REVISION_1`: UInt = 1u;
public const val `NDIS_FILTER_PAUSE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_FILTER_RESTART_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_FLAGS_DONT_LOOPBACK`: UInt = 128u;
public const val `NDIS_FLAGS_DOUBLE_BUFFERED`: UInt = 2048u;
public const val `NDIS_FLAGS_IS_LOOPBACK_PACKET`: UInt = 256u;
public const val `NDIS_FLAGS_LOOPBACK_ONLY`: UInt = 512u;
public const val `NDIS_FLAGS_MULTICAST_PACKET`: UInt = 16u;
public const val `NDIS_FLAGS_PADDED`: UInt = 65536u;
public const val `NDIS_FLAGS_PROTOCOL_ID_MASK`: UInt = 15u;
public const val `NDIS_FLAGS_RESERVED2`: UInt = 32u;
public const val `NDIS_FLAGS_RESERVED3`: UInt = 64u;
public const val `NDIS_FLAGS_RESERVED4`: UInt = 1024u;
public const val `NDIS_FLAGS_SENT_AT_DPC`: UInt = 4096u;
public const val `NDIS_FLAGS_USES_ORIGINAL_PACKET`: UInt = 16384u;
public const val `NDIS_FLAGS_USES_SG_BUFFER_LIST`: UInt = 8192u;
public const val `NDIS_FLAGS_XLATE_AT_TOP`: UInt = 131072u;
public const val `NDIS_GFP_ENCAPSULATION_TYPE_IP_IN_GRE`: UInt = 4u;
public const val `NDIS_GFP_ENCAPSULATION_TYPE_IP_IN_IP`: UInt = 2u;
public const val `NDIS_GFP_ENCAPSULATION_TYPE_NOT_ENCAPSULATED`: UInt = 1u;
public const val `NDIS_GFP_ENCAPSULATION_TYPE_NVGRE`: UInt = 8u;
public const val `NDIS_GFP_ENCAPSULATION_TYPE_VXLAN`: UInt = 16u;
public const val `NDIS_GFP_EXACT_MATCH_PROFILE_RDMA_FLOW`: UInt = 1u;
public const val `NDIS_GFP_EXACT_MATCH_PROFILE_REVISION_1`: UInt = 1u;
public const val `NDIS_GFP_HEADER_GROUP_EXACT_MATCH_IS_TTL_ONE`: UInt = 1u;
public const val `NDIS_GFP_HEADER_GROUP_EXACT_MATCH_PROFILE_IS_TTL_ONE`: UInt = 1u;
public const val `NDIS_GFP_HEADER_GROUP_EXACT_MATCH_PROFILE_REVISION_1`: UInt = 1u;
public const val `NDIS_GFP_HEADER_GROUP_EXACT_MATCH_REVISION_1`: UInt = 1u;
public const val `NDIS_GFP_HEADER_GROUP_WILDCARD_MATCH_IS_TTL_ONE`: UInt = 1u;
public const val `NDIS_GFP_HEADER_GROUP_WILDCARD_MATCH_PROFILE_IS_TTL_ONE`: UInt = 1u;
public const val `NDIS_GFP_HEADER_GROUP_WILDCARD_MATCH_PROFILE_REVISION_1`: UInt = 1u;
public const val `NDIS_GFP_HEADER_GROUP_WILDCARD_MATCH_REVISION_1`: UInt = 1u;
public const val `NDIS_GFP_HEADER_PRESENT_ESP`: UInt = 2048u;
public const val `NDIS_GFP_HEADER_PRESENT_ETHERNET`: UInt = 1u;
public const val `NDIS_GFP_HEADER_PRESENT_ICMP`: UInt = 32u;
public const val `NDIS_GFP_HEADER_PRESENT_IPV4`: UInt = 2u;
public const val `NDIS_GFP_HEADER_PRESENT_IPV6`: UInt = 4u;
public const val `NDIS_GFP_HEADER_PRESENT_IP_IN_GRE_ENCAP`: UInt = 256u;
public const val `NDIS_GFP_HEADER_PRESENT_IP_IN_IP_ENCAP`: UInt = 128u;
public const val `NDIS_GFP_HEADER_PRESENT_NO_ENCAP`: UInt = 64u;
public const val `NDIS_GFP_HEADER_PRESENT_NVGRE_ENCAP`: UInt = 512u;
public const val `NDIS_GFP_HEADER_PRESENT_TCP`: UInt = 8u;
public const val `NDIS_GFP_HEADER_PRESENT_UDP`: UInt = 16u;
public const val `NDIS_GFP_HEADER_PRESENT_VXLAN_ENCAP`: UInt = 1024u;
public const val `NDIS_GFP_UNDEFINED_PROFILE_ID`: UInt = 0u;
public const val `NDIS_GFP_WILDCARD_MATCH_PROFILE_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_COUNTER_INFO_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_COUNTER_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_COUNTER_PARAMETERS_CLIENT_SPECIFIED_ADDRESS`: UInt = 1u;
public const val `NDIS_GFT_COUNTER_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_COUNTER_VALUE_ARRAY_GET_VALUES`: UInt = 2u;
public const val `NDIS_GFT_COUNTER_VALUE_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_COUNTER_VALUE_ARRAY_UPDATE_MEMORY_MAPPED_COUNTERS`: UInt = 1u;
public const val `NDIS_GFT_CUSTOM_ACTION_LAST_ACTION`: UInt = 1u;
public const val `NDIS_GFT_CUSTOM_ACTION_PROFILE_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_CUSTOM_ACTION_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_DELETE_PROFILE_ALL_PROFILES`: UInt = 1u;
public const val `NDIS_GFT_DELETE_PROFILE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_DELETE_TABLE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_EMFE_ADD_IN_ACTIVATED_STATE`: UInt = 1u;
public const val `NDIS_GFT_EMFE_ALL_VPORT_FLOW_ENTRIES`: UInt = 33554432u;
public const val `NDIS_GFT_EMFE_COPY_AFTER_TCP_FIN_FLAG_SET`: UInt = 2097152u;
public const val `NDIS_GFT_EMFE_COPY_AFTER_TCP_RST_FLAG_SET`: UInt = 4194304u;
public const val `NDIS_GFT_EMFE_COPY_ALL_PACKETS`: UInt = 65536u;
public const val `NDIS_GFT_EMFE_COPY_CONDITION_CHANGED`: UInt = 16777216u;
public const val `NDIS_GFT_EMFE_COPY_FIRST_PACKET`: UInt = 131072u;
public const val `NDIS_GFT_EMFE_COPY_WHEN_TCP_FLAG_SET`: UInt = 262144u;
public const val `NDIS_GFT_EMFE_COUNTER_ALLOCATE`: UInt = 1u;
public const val `NDIS_GFT_EMFE_COUNTER_CLIENT_SPECIFIED_ADDRESS`: UInt = 4u;
public const val `NDIS_GFT_EMFE_COUNTER_MEMORY_MAPPED`: UInt = 2u;
public const val `NDIS_GFT_EMFE_COUNTER_TRACK_TCP_FLOW`: UInt = 8u;
public const val `NDIS_GFT_EMFE_CUSTOM_ACTION_PRESENT`: UInt = 524288u;
public const val `NDIS_GFT_EMFE_MATCH_AND_ACTION_MUST_BE_SUPPORTED`: UInt = 2u;
public const val `NDIS_GFT_EMFE_META_ACTION_BEFORE_HEADER_TRANSPOSITION`: UInt = 1048576u;
public const val `NDIS_GFT_EMFE_RDMA_FLOW`: UInt = 4u;
public const val `NDIS_GFT_EMFE_REDIRECT_TO_EGRESS_QUEUE_OF_VPORT`: UInt = 8192u;
public const val `NDIS_GFT_EMFE_REDIRECT_TO_EGRESS_QUEUE_OF_VPORT_IF_TTL_IS_ONE`: UInt = 32768u;
public const val `NDIS_GFT_EMFE_REDIRECT_TO_INGRESS_QUEUE_OF_VPORT`: UInt = 4096u;
public const val `NDIS_GFT_EMFE_REDIRECT_TO_INGRESS_QUEUE_OF_VPORT_IF_TTL_IS_ONE`: UInt = 16384u;
public const val `NDIS_GFT_EXACT_MATCH_FLOW_ENTRY_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_FLOW_ENTRY_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_FLOW_ENTRY_ID_ALL_NIC_SWITCH_FLOW_ENTRIES`: UInt = 1u;
public const val `NDIS_GFT_FLOW_ENTRY_ID_ALL_TABLE_FLOW_ENTRIES`: UInt = 2u;
public const val `NDIS_GFT_FLOW_ENTRY_ID_ALL_VPORT_FLOW_ENTRIES`: UInt = 4u;
public const val `NDIS_GFT_FLOW_ENTRY_ID_ARRAY_COUNTER_VALUES`: UInt = 65536u;
public const val `NDIS_GFT_FLOW_ENTRY_ID_ARRAY_DEFINED`: UInt = 16u;
public const val `NDIS_GFT_FLOW_ENTRY_ID_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_FLOW_ENTRY_ID_RANGE_DEFINED`: UInt = 8u;
public const val `NDIS_GFT_FLOW_ENTRY_INFO_ALL_FLOW_ENTRIES`: UInt = 1u;
public const val `NDIS_GFT_FLOW_ENTRY_INFO_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_FREE_COUNTER_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_HEADER_GROUP_TRANSPOSITION_DECREMENT_TTL_IF_NOT_ONE`: UInt = 1u;
public const val `NDIS_GFT_HEADER_GROUP_TRANSPOSITION_PROFILE_DECREMENT_TTL_IF_NOT_ONE`: UInt = 1u;
public const val `NDIS_GFT_HEADER_GROUP_TRANSPOSITION_PROFILE_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_HEADER_GROUP_TRANSPOSITION_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_HEADER_TRANSPOSITION_PROFILE_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_HTP_COPY_ALL_PACKETS`: UInt = 16u;
public const val `NDIS_GFT_HTP_COPY_FIRST_PACKET`: UInt = 32u;
public const val `NDIS_GFT_HTP_COPY_WHEN_TCP_FLAG_SET`: UInt = 64u;
public const val `NDIS_GFT_HTP_CUSTOM_ACTION_PRESENT`: UInt = 128u;
public const val `NDIS_GFT_HTP_META_ACTION_BEFORE_HEADER_TRANSPOSITION`: UInt = 256u;
public const val `NDIS_GFT_HTP_REDIRECT_TO_EGRESS_QUEUE_OF_VPORT`: UInt = 2u;
public const val `NDIS_GFT_HTP_REDIRECT_TO_EGRESS_QUEUE_OF_VPORT_IF_TTL_IS_ONE`: UInt = 8u;
public const val `NDIS_GFT_HTP_REDIRECT_TO_INGRESS_QUEUE_OF_VPORT`: UInt = 1u;
public const val `NDIS_GFT_HTP_REDIRECT_TO_INGRESS_QUEUE_OF_VPORT_IF_TTL_IS_ONE`: UInt = 4u;
public const val `NDIS_GFT_MAX_COUNTER_OBJECTS_PER_FLOW_ENTRY`: UInt = 8u;
public const val `NDIS_GFT_OFFLOAD_CAPABILITIES_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_OFFLOAD_CAPS_8021P_PRIORITY_MASK`: UInt = 131072u;
public const val `NDIS_GFT_OFFLOAD_CAPS_ADD_FLOW_ENTRY_DEACTIVATED_PREFERRED`: UInt = 1u;
public const val `NDIS_GFT_OFFLOAD_CAPS_ALLOW`: UInt = 262144u;
public const val `NDIS_GFT_OFFLOAD_CAPS_CLIENT_SPECIFIED_MEMORY_MAPPED_COUNTERS`: UInt = 16u;
public const val `NDIS_GFT_OFFLOAD_CAPS_COMBINED_COUNTER_AND_STATE`: UInt = 256u;
public const val `NDIS_GFT_OFFLOAD_CAPS_COPY_ALL`: UInt = 256u;
public const val `NDIS_GFT_OFFLOAD_CAPS_COPY_FIRST`: UInt = 512u;
public const val `NDIS_GFT_OFFLOAD_CAPS_COPY_WHEN_TCP_FLAG_SET`: UInt = 1024u;
public const val `NDIS_GFT_OFFLOAD_CAPS_DESIGNATED_EXCEPTION_VPORT`: UInt = 32768u;
public const val `NDIS_GFT_OFFLOAD_CAPS_DROP`: UInt = 524288u;
public const val `NDIS_GFT_OFFLOAD_CAPS_DSCP_MASK`: UInt = 65536u;
public const val `NDIS_GFT_OFFLOAD_CAPS_EGRESS_AGGREGATE_COUNTERS`: UInt = 64u;
public const val `NDIS_GFT_OFFLOAD_CAPS_EGRESS_EXACT_MATCH`: UInt = 8u;
public const val `NDIS_GFT_OFFLOAD_CAPS_EGRESS_WILDCARD_MATCH`: UInt = 2u;
public const val `NDIS_GFT_OFFLOAD_CAPS_EXT_VPORT_EGRESS_EXACT_MATCH`: UInt = 128u;
public const val `NDIS_GFT_OFFLOAD_CAPS_EXT_VPORT_EGRESS_WILDCARD_MATCH`: UInt = 32u;
public const val `NDIS_GFT_OFFLOAD_CAPS_EXT_VPORT_INGRESS_EXACT_MATCH`: UInt = 64u;
public const val `NDIS_GFT_OFFLOAD_CAPS_EXT_VPORT_INGRESS_WILDCARD_MATCH`: UInt = 16u;
public const val `NDIS_GFT_OFFLOAD_CAPS_IGNORE_ACTION_SUPPORTED`: UInt = 8u;
public const val `NDIS_GFT_OFFLOAD_CAPS_INGRESS_AGGREGATE_COUNTERS`: UInt = 32u;
public const val `NDIS_GFT_OFFLOAD_CAPS_INGRESS_EXACT_MATCH`: UInt = 4u;
public const val `NDIS_GFT_OFFLOAD_CAPS_INGRESS_WILDCARD_MATCH`: UInt = 1u;
public const val `NDIS_GFT_OFFLOAD_CAPS_MEMORY_MAPPED_COUNTERS`: UInt = 1u;
public const val `NDIS_GFT_OFFLOAD_CAPS_MEMORY_MAPPED_PAKCET_AND_BYTE_COUNTERS`: UInt = 2u;
public const val `NDIS_GFT_OFFLOAD_CAPS_META_ACTION_AFTER_HEADER_TRANSPOSITION`: UInt = 8192u;
public const val `NDIS_GFT_OFFLOAD_CAPS_META_ACTION_BEFORE_HEADER_TRANSPOSITION`: UInt = 4096u;
public const val `NDIS_GFT_OFFLOAD_CAPS_MODIFY`: UInt = 4u;
public const val `NDIS_GFT_OFFLOAD_CAPS_PER_FLOW_ENTRY_COUNTERS`: UInt = 4u;
public const val `NDIS_GFT_OFFLOAD_CAPS_PER_PACKET_COUNTER_UPDATE`: UInt = 8u;
public const val `NDIS_GFT_OFFLOAD_CAPS_PER_VPORT_EXCEPTION_VPORT`: UInt = 16384u;
public const val `NDIS_GFT_OFFLOAD_CAPS_POP`: UInt = 1u;
public const val `NDIS_GFT_OFFLOAD_CAPS_PUSH`: UInt = 2u;
public const val `NDIS_GFT_OFFLOAD_CAPS_RATE_LIMITING_QUEUE_SUPPORTED`: UInt = 2u;
public const val `NDIS_GFT_OFFLOAD_CAPS_REDIRECT_TO_EGRESS_QUEUE_OF_VPORT`: UInt = 32u;
public const val `NDIS_GFT_OFFLOAD_CAPS_REDIRECT_TO_EGRESS_QUEUE_OF_VPORT_IF_TTL_IS_ONE`: UInt = 128u;
public const val `NDIS_GFT_OFFLOAD_CAPS_REDIRECT_TO_INGRESS_QUEUE_OF_VPORT`: UInt = 16u;
public const val `NDIS_GFT_OFFLOAD_CAPS_REDIRECT_TO_INGRESS_QUEUE_OF_VPORT_IF_TTL_IS_ONE`: UInt = 64u;
public const val `NDIS_GFT_OFFLOAD_CAPS_SAMPLE`: UInt = 2048u;
public const val `NDIS_GFT_OFFLOAD_CAPS_TRACK_TCP_FLOW_STATE`: UInt = 128u;
public const val `NDIS_GFT_OFFLOAD_INFO_COPY_PACKET`: UInt = 4u;
public const val `NDIS_GFT_OFFLOAD_INFO_DIRECTION_INGRESS`: UInt = 1u;
public const val `NDIS_GFT_OFFLOAD_INFO_EXCEPTION_PACKET`: UInt = 2u;
public const val `NDIS_GFT_OFFLOAD_INFO_SAMPLE_PACKET`: UInt = 8u;
public const val `NDIS_GFT_OFFLOAD_PARAMETERS_CUSTOM_PROVIDER_RESERVED`: UInt = 4278190080u;
public const val `NDIS_GFT_OFFLOAD_PARAMETERS_ENABLE_OFFLOAD`: UInt = 1u;
public const val `NDIS_GFT_OFFLOAD_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_PROFILE_INFO_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_PROFILE_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_RESERVED_CUSTOM_ACTIONS`: UInt = 256u;
public const val `NDIS_GFT_STATISTICS_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_TABLE_INCLUDE_EXTERNAL_VPPORT`: UInt = 1u;
public const val `NDIS_GFT_TABLE_INFO_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_TABLE_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_TABLE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_UNDEFINED_COUNTER_ID`: UInt = 0u;
public const val `NDIS_GFT_UNDEFINED_CUSTOM_ACTION`: UInt = 0u;
public const val `NDIS_GFT_UNDEFINED_FLOW_ENTRY_ID`: UInt = 0u;
public const val `NDIS_GFT_UNDEFINED_TABLE_ID`: UInt = 0u;
public const val `NDIS_GFT_VPORT_DSCP_FLAGS_CHANGED`: UInt = 67108864u;
public const val `NDIS_GFT_VPORT_DSCP_GUARD_ENABLE_RX`: UInt = 1u;
public const val `NDIS_GFT_VPORT_DSCP_GUARD_ENABLE_TX`: UInt = 2u;
public const val `NDIS_GFT_VPORT_DSCP_MASK_CHANGED`: UInt = 8388608u;
public const val `NDIS_GFT_VPORT_DSCP_MASK_ENABLE_RX`: UInt = 4u;
public const val `NDIS_GFT_VPORT_DSCP_MASK_ENABLE_TX`: UInt = 8u;
public const val `NDIS_GFT_VPORT_ENABLE`: UInt = 1u;
public const val `NDIS_GFT_VPORT_ENABLE_STATE_CHANGED`: UInt = 1048576u;
public const val `NDIS_GFT_VPORT_EXCEPTION_VPORT_CHANGED`: UInt = 2097152u;
public const val `NDIS_GFT_VPORT_MAX_DSCP_MASK_COUNTER_OBJECTS`: UInt = 64u;
public const val `NDIS_GFT_VPORT_MAX_PRIORITY_MASK_COUNTER_OBJECTS`: UInt = 8u;
public const val `NDIS_GFT_VPORT_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_VPORT_PARAMS_CHANGE_MASK`: UInt = 4293918720u;
public const val `NDIS_GFT_VPORT_PARAMS_CUSTOM_PROVIDER_RESERVED`: UInt = 1044480u;
public const val `NDIS_GFT_VPORT_PARSE_VXLAN`: UInt = 2u;
public const val `NDIS_GFT_VPORT_PARSE_VXLAN_NOT_IN_SRC_PORT_RANGE`: UInt = 4u;
public const val `NDIS_GFT_VPORT_PRIORITY_MASK_CHANGED`: UInt = 16777216u;
public const val `NDIS_GFT_VPORT_SAMPLING_RATE_CHANGED`: UInt = 4194304u;
public const val `NDIS_GFT_VPORT_VXLAN_SETTINGS_CHANGED`: UInt = 33554432u;
public const val `NDIS_GFT_WCFE_ADD_IN_ACTIVATED_STATE`: UInt = 1u;
public const val `NDIS_GFT_WCFE_COPY_ALL_PACKETS`: UInt = 32u;
public const val `NDIS_GFT_WCFE_COUNTER_ALLOCATE`: UInt = 1u;
public const val `NDIS_GFT_WCFE_COUNTER_CLIENT_SPECIFIED_ADDRESS`: UInt = 4u;
public const val `NDIS_GFT_WCFE_COUNTER_MEMORY_MAPPED`: UInt = 2u;
public const val `NDIS_GFT_WCFE_CUSTOM_ACTION_PRESENT`: UInt = 64u;
public const val `NDIS_GFT_WCFE_REDIRECT_TO_EGRESS_QUEUE_OF_VPORT`: UInt = 4u;
public const val `NDIS_GFT_WCFE_REDIRECT_TO_EGRESS_QUEUE_OF_VPORT_IF_TTL_IS_ONE`: UInt = 16u;
public const val `NDIS_GFT_WCFE_REDIRECT_TO_INGRESS_QUEUE_OF_VPORT`: UInt = 2u;
public const val `NDIS_GFT_WCFE_REDIRECT_TO_INGRESS_QUEUE_OF_VPORT_IF_TTL_IS_ONE`: UInt = 8u;
public const val `NDIS_GFT_WILDCARD_MATCH_FLOW_ENTRY_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_GUID` (
    public var `Guid`: `windows_sys`.`core`.`GUID`,
    public var `Anonymous`: `NDIS_GUID_0`,
    public var `Size`: UInt,
    public var `Flags`: UInt,
)
// UNSUPPORTED Rust 1094:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_GUID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1099:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NDIS_GUID_0 {
//     pub Oid: u32,
//     pub Status: i32,
// }

// UNSUPPORTED Rust 1105:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_GUID_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_HARDWARE_CROSSTIMESTAMP` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `Flags`: UInt,
    public var `SystemTimestamp1`: ULong,
    public var `HardwareClockTimestamp`: ULong,
    public var `SystemTimestamp2`: ULong,
)
public const val `NDIS_HARDWARE_CROSSTIMESTAMP_REVISION_1`: UInt = 1u;
public typealias `NDIS_HARDWARE_STATUS` = Int;
public const val `NDIS_HASH_FUNCTION_MASK`: UInt = 255u;
public const val `NDIS_HASH_IPV4`: UInt = 256u;
public const val `NDIS_HASH_IPV6`: UInt = 1024u;
public const val `NDIS_HASH_IPV6_EX`: UInt = 2048u;
public const val `NDIS_HASH_TCP_IPV4`: UInt = 512u;
public const val `NDIS_HASH_TCP_IPV6`: UInt = 4096u;
public const val `NDIS_HASH_TCP_IPV6_EX`: UInt = 8192u;
public const val `NDIS_HASH_TYPE_MASK`: UInt = 16776960u;
public const val `NDIS_HASH_UDP_IPV4`: UInt = 16384u;
public const val `NDIS_HASH_UDP_IPV6`: UInt = 32768u;
public const val `NDIS_HASH_UDP_IPV6_EX`: UInt = 65536u;
public const val `NDIS_HD_SPLIT_ATTRIBUTES_REVISION_1`: UInt = 1u;
public const val `NDIS_HD_SPLIT_CAPS_SUPPORTS_HEADER_DATA_SPLIT`: UInt = 1u;
public const val `NDIS_HD_SPLIT_CAPS_SUPPORTS_IPV4_OPTIONS`: UInt = 2u;
public const val `NDIS_HD_SPLIT_CAPS_SUPPORTS_IPV6_EXTENSION_HEADERS`: UInt = 4u;
public const val `NDIS_HD_SPLIT_CAPS_SUPPORTS_TCP_OPTIONS`: UInt = 8u;
public const val `NDIS_HD_SPLIT_COMBINE_ALL_HEADERS`: UInt = 1u;
public const val `NDIS_HD_SPLIT_CURRENT_CONFIG_REVISION_1`: UInt = 1u;
public const val `NDIS_HD_SPLIT_ENABLE_HEADER_DATA_SPLIT`: UInt = 1u;
public const val `NDIS_HD_SPLIT_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_HYPERVISOR_INFO_FLAG_HYPERVISOR_PRESENT`: UInt = 1u;
public const val `NDIS_HYPERVISOR_INFO_REVISION_1`: UInt = 1u;
public typealias `NDIS_INTERFACE_TYPE` = Int;
public const val `NDIS_INTERMEDIATE_DRIVER`: UInt = 1u;
public typealias `NDIS_INTERRUPT_MODERATION` = Int;
public const val `NDIS_INTERRUPT_MODERATION_CHANGE_NEEDS_REINITIALIZE`: UInt = 2u;
public const val `NDIS_INTERRUPT_MODERATION_CHANGE_NEEDS_RESET`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_INTERRUPT_MODERATION_PARAMETERS` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `Flags`: UInt,
    public var `InterruptModeration`: `NDIS_INTERRUPT_MODERATION`,
)
public const val `NDIS_INTERRUPT_MODERATION_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_IPSEC_OFFLOAD_V1` (
    public var `Supported`: `NDIS_IPSEC_OFFLOAD_V1_0`,
    public var `IPv4AH`: `NDIS_IPSEC_OFFLOAD_V1_1`,
    public var `IPv4ESP`: `NDIS_IPSEC_OFFLOAD_V1_2`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_IPSEC_OFFLOAD_V1_1` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_IPSEC_OFFLOAD_V1_2` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_IPSEC_OFFLOAD_V1_0` (
    public var `Encapsulation`: UInt,
    public var `AhEspCombined`: UInt,
    public var `TransportTunnelCombined`: UInt,
    public var `IPv4Options`: UInt,
    public var `Flags`: UInt,
)
public const val `NDIS_IPSEC_OFFLOAD_V2_ADD_SA_EX_REVISION_1`: UInt = 1u;
public const val `NDIS_IPSEC_OFFLOAD_V2_ADD_SA_REVISION_1`: UInt = 1u;
public const val `NDIS_IPSEC_OFFLOAD_V2_DELETE_SA_REVISION_1`: UInt = 1u;
public const val `NDIS_IPSEC_OFFLOAD_V2_UPDATE_SA_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_IP_OPER_STATE` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `Flags`: UInt,
    public var `IpOperationalStatus`: `NDIS_IP_OPER_STATUS`,
)
public const val `NDIS_IP_OPER_STATE_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_IP_OPER_STATUS` (
    public var `AddressFamily`: UInt,
    public var `OperationalStatus`: `super`.`super`.`super`.`Win32`.`NetworkManagement`.`Ndis`.`NET_IF_OPER_STATUS`,
    public var `OperationalStatusFlags`: UInt,
)
// UNSUPPORTED Rust 1203:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct NDIS_IP_OPER_STATUS_INFO {
//     pub Header: NDIS_OBJECT_HEADER,
//     pub Flags: u32,
//     pub NumberofAddressFamiliesReturned: u32,
//     pub IpOperationalStatus: [NDIS_IP_OPER_STATUS; 32],
// }

// UNSUPPORTED Rust 1212:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for NDIS_IP_OPER_STATUS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_IP_OPER_STATUS_INFO_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_IRDA_PACKET_INFO` (
    public var `ExtraBOFs`: UInt,
    public var `MinTurnAroundTime`: UInt,
)
public const val `NDIS_ISOLATION_NAME_MAX_STRING_SIZE`: UInt = 127u;
public const val `NDIS_ISOLATION_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_KDNET_ADD_PF_REVISION_1`: UInt = 1u;
public const val `NDIS_KDNET_ENUMERATE_PFS_REVISION_1`: UInt = 1u;
public const val `NDIS_KDNET_PF_ENUM_ELEMENT_REVISION_1`: UInt = 1u;
public const val `NDIS_KDNET_QUERY_PF_INFORMATION_REVISION_1`: UInt = 1u;
public const val `NDIS_KDNET_REMOVE_PF_REVISION_1`: UInt = 1u;
public const val `NDIS_LARGE_SEND_OFFLOAD_MAX_HEADER_LENGTH`: UInt = 128u;
public const val `NDIS_LEGACY_DRIVER`: UInt = 1u;
public const val `NDIS_LEGACY_MINIPORT`: UInt = 1u;
public const val `NDIS_LEGACY_PROTOCOL`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_LINK_PARAMETERS` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `MediaDuplexState`: `super`.`super`.`super`.`Win32`.`NetworkManagement`.`Ndis`.`NET_IF_MEDIA_DUPLEX_STATE`,
    public var `XmitLinkSpeed`: ULong,
    public var `RcvLinkSpeed`: ULong,
    public var `PauseFunctions`: `NDIS_SUPPORTED_PAUSE_FUNCTIONS`,
    public var `AutoNegotiationFlags`: UInt,
)
public const val `NDIS_LINK_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_LINK_SPEED` (
    public var `XmitLinkSpeed`: ULong,
    public var `RcvLinkSpeed`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_LINK_STATE` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `MediaConnectState`: `super`.`super`.`super`.`Win32`.`NetworkManagement`.`Ndis`.`NET_IF_MEDIA_CONNECT_STATE`,
    public var `MediaDuplexState`: `super`.`super`.`super`.`Win32`.`NetworkManagement`.`Ndis`.`NET_IF_MEDIA_DUPLEX_STATE`,
    public var `XmitLinkSpeed`: ULong,
    public var `RcvLinkSpeed`: ULong,
    public var `PauseFunctions`: `NDIS_SUPPORTED_PAUSE_FUNCTIONS`,
    public var `AutoNegotiationFlags`: UInt,
)
public const val `NDIS_LINK_STATE_DUPLEX_AUTO_NEGOTIATED`: UInt = 4u;
public const val `NDIS_LINK_STATE_PAUSE_FUNCTIONS_AUTO_NEGOTIATED`: UInt = 8u;
public const val `NDIS_LINK_STATE_RCV_LINK_SPEED_AUTO_NEGOTIATED`: UInt = 2u;
public const val `NDIS_LINK_STATE_REVISION_1`: UInt = 1u;
public const val `NDIS_LINK_STATE_XMIT_LINK_SPEED_AUTO_NEGOTIATED`: UInt = 1u;
public const val `NDIS_MAC_OPTION_8021P_PRIORITY`: UInt = 64u;
public const val `NDIS_MAC_OPTION_8021Q_VLAN`: UInt = 512u;
public const val `NDIS_MAC_OPTION_COPY_LOOKAHEAD_DATA`: UInt = 1u;
public const val `NDIS_MAC_OPTION_EOTX_INDICATION`: UInt = 32u;
public const val `NDIS_MAC_OPTION_FULL_DUPLEX`: UInt = 16u;
public const val `NDIS_MAC_OPTION_NO_LOOPBACK`: UInt = 8u;
public const val `NDIS_MAC_OPTION_RECEIVE_AT_DPC`: UInt = 256u;
public const val `NDIS_MAC_OPTION_RECEIVE_SERIALIZED`: UInt = 2u;
public const val `NDIS_MAC_OPTION_RESERVED`: UInt = 2147483648u;
public const val `NDIS_MAC_OPTION_SUPPORTS_MAC_ADDRESS_OVERWRITE`: UInt = 128u;
public const val `NDIS_MAC_OPTION_TRANSFERS_NOT_PEND`: UInt = 4u;
public const val `NDIS_MAXIMUM_PORTS`: UInt = 16777216u;
public const val `NDIS_MAX_LOOKAHEAD_SIZE_ACCESSED_UNDEFINED`: Int = -1;
public const val `NDIS_MAX_PROCESSOR_COUNT`: UInt = 64u;
public const val `NDIS_MEDIA_CAP_RECEIVE`: UInt = 2u;
public const val `NDIS_MEDIA_CAP_TRANSMIT`: UInt = 1u;
public const val `NDIS_MEDIA_SPECIFIC_INFO_EAPOL`: UInt = 2147549185u;
public const val `NDIS_MEDIA_SPECIFIC_INFO_FCOE`: UInt = 2147549184u;
public const val `NDIS_MEDIA_SPECIFIC_INFO_LLDP`: UInt = 2147549186u;
public const val `NDIS_MEDIA_SPECIFIC_INFO_TIMESYNC`: UInt = 2147549187u;
public const val `NDIS_MEDIA_SPECIFIC_INFO_TUNDL`: UInt = 65537u;
public typealias `NDIS_MEDIA_STATE` = Int;
public typealias `NDIS_MEDIUM` = Int;
public const val `NDIS_MEMORY_CONTIGUOUS`: UInt = 1u;
public const val `NDIS_MEMORY_NONCACHED`: UInt = 2u;
public const val `NDIS_MINIPORT_ADAPTER_802_11_ATTRIBUTES_REVISION_1`: UInt = 1u;
public const val `NDIS_MINIPORT_ADAPTER_802_11_ATTRIBUTES_REVISION_2`: UInt = 2u;
public const val `NDIS_MINIPORT_ADAPTER_802_11_ATTRIBUTES_REVISION_3`: UInt = 3u;
public const val `NDIS_MINIPORT_ADAPTER_GENERAL_ATTRIBUTES_REVISION_1`: UInt = 1u;
public const val `NDIS_MINIPORT_ADAPTER_GENERAL_ATTRIBUTES_REVISION_2`: UInt = 2u;
public const val `NDIS_MINIPORT_ADAPTER_HARDWARE_ASSIST_ATTRIBUTES_REVISION_1`: UInt = 1u;
public const val `NDIS_MINIPORT_ADAPTER_HARDWARE_ASSIST_ATTRIBUTES_REVISION_2`: UInt = 2u;
public const val `NDIS_MINIPORT_ADAPTER_HARDWARE_ASSIST_ATTRIBUTES_REVISION_3`: UInt = 3u;
public const val `NDIS_MINIPORT_ADAPTER_HARDWARE_ASSIST_ATTRIBUTES_REVISION_4`: UInt = 4u;
public const val `NDIS_MINIPORT_ADAPTER_NDK_ATTRIBUTES_REVISION_1`: UInt = 1u;
public const val `NDIS_MINIPORT_ADAPTER_OFFLOAD_ATTRIBUTES_REVISION_1`: UInt = 1u;
public const val `NDIS_MINIPORT_ADAPTER_PACKET_DIRECT_ATTRIBUTES_REVISION_1`: UInt = 1u;
public const val `NDIS_MINIPORT_ADAPTER_REGISTRATION_ATTRIBUTES_REVISION_1`: UInt = 1u;
public const val `NDIS_MINIPORT_ADAPTER_REGISTRATION_ATTRIBUTES_REVISION_2`: UInt = 2u;
public const val `NDIS_MINIPORT_ADD_DEVICE_REGISTRATION_ATTRIBUTES_REVISION_1`: UInt = 1u;
public const val `NDIS_MINIPORT_ATTRIBUTES_BUS_MASTER`: UInt = 64u;
public const val `NDIS_MINIPORT_ATTRIBUTES_CONTROLS_DEFAULT_PORT`: UInt = 128u;
public const val `NDIS_MINIPORT_ATTRIBUTES_DO_NOT_BIND_TO_ALL_CO`: UInt = 16u;
public const val `NDIS_MINIPORT_ATTRIBUTES_HARDWARE_DEVICE`: UInt = 1u;
public const val `NDIS_MINIPORT_ATTRIBUTES_NDIS_WDM`: UInt = 2u;
public const val `NDIS_MINIPORT_ATTRIBUTES_NOT_CO_NDIS`: UInt = 8u;
public const val `NDIS_MINIPORT_ATTRIBUTES_NO_HALT_ON_SUSPEND`: UInt = 32u;
public const val `NDIS_MINIPORT_ATTRIBUTES_NO_OID_INTERCEPT_ON_NONDEFAULT_PORTS`: UInt = 512u;
public const val `NDIS_MINIPORT_ATTRIBUTES_NO_PAUSE_ON_SUSPEND`: UInt = 256u;
public const val `NDIS_MINIPORT_ATTRIBUTES_REGISTER_BUGCHECK_CALLBACK`: UInt = 1024u;
public const val `NDIS_MINIPORT_ATTRIBUTES_SURPRISE_REMOVE_OK`: UInt = 4u;
public typealias `NDIS_MINIPORT_BLOCK` = Long;
public const val `NDIS_MINIPORT_CO_CHARACTERISTICS_REVISION_1`: UInt = 1u;
public const val `NDIS_MINIPORT_DRIVER`: UInt = 1u;
public const val `NDIS_MINIPORT_DRIVER_CHARACTERISTICS_REVISION_1`: UInt = 1u;
public const val `NDIS_MINIPORT_DRIVER_CHARACTERISTICS_REVISION_2`: UInt = 2u;
public const val `NDIS_MINIPORT_DRIVER_CHARACTERISTICS_REVISION_3`: UInt = 3u;
public const val `NDIS_MINIPORT_INIT_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_MINIPORT_INTERRUPT_REVISION_1`: UInt = 1u;
public const val `NDIS_MINIPORT_MAJOR_VERSION`: UInt = 6u;
public const val `NDIS_MINIPORT_MINIMUM_MAJOR_VERSION`: UInt = 5u;
public const val `NDIS_MINIPORT_MINIMUM_MINOR_VERSION`: UInt = 0u;
public const val `NDIS_MINIPORT_MINOR_VERSION`: UInt = 87u;
public const val `NDIS_MINIPORT_PAUSE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_MINIPORT_PNP_CHARACTERISTICS_REVISION_1`: UInt = 1u;
public const val `NDIS_MINIPORT_RESTART_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_MINIPORT_SS_CHARACTERISTICS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_System_Kernel"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_MINIPORT_TIMER` (
    public var `Timer`: `super`.`super`.`System`.`SystemServices`.`KTIMER`,
    public var `Dpc`: `super`.`super`.`Foundation`.`KDPC`,
    public var `MiniportTimerFunction`: `PNDIS_TIMER_FUNCTION`,
    public var `MiniportTimerContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Miniport`: /* Rust *mut */ kotlinx.cinterop.CPointer<`NDIS_MINIPORT_BLOCK`>?,
    public var `NextTimer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`NDIS_MINIPORT_TIMER`>?,
)
// UNSUPPORTED Rust 1349:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_System_Kernel"))]
// impl Default for NDIS_MINIPORT_TIMER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_MIN_API`: UInt = 1024u;
public const val `NDIS_MONITOR_CONFIG_REVISION_1`: UInt = 1u;
public const val `NDIS_MSIX_CONFIG_PARAMETERS_REVISION_1`: UInt = 1u;
public typealias `NDIS_M_DRIVER_BLOCK` = Long;
public const val `NDIS_M_MAX_LOOKAHEAD`: UInt = 526u;
public const val `NDIS_NBL_FLAGS_CAPTURE_TIMESTAMP_ON_TRANSMIT`: UInt = 65536u;
public const val `NDIS_NBL_FLAGS_HD_SPLIT`: UInt = 256u;
public const val `NDIS_NBL_FLAGS_IS_IPV4`: UInt = 512u;
public const val `NDIS_NBL_FLAGS_IS_IPV6`: UInt = 1024u;
public const val `NDIS_NBL_FLAGS_IS_LOOPBACK_PACKET`: UInt = 32768u;
public const val `NDIS_NBL_FLAGS_IS_TCP`: UInt = 2048u;
public const val `NDIS_NBL_FLAGS_IS_UDP`: UInt = 4096u;
public const val `NDIS_NBL_FLAGS_RECV_READ_ONLY`: UInt = 2u;
public const val `NDIS_NBL_FLAGS_SEND_READ_ONLY`: UInt = 1u;
public const val `NDIS_NBL_FLAGS_SPLIT_AT_UPPER_LAYER_PROTOCOL_HEADER`: UInt = 8192u;
public const val `NDIS_NBL_FLAGS_SPLIT_AT_UPPER_LAYER_PROTOCOL_PAYLOAD`: UInt = 16384u;
public const val `NDIS_NBL_MEDIA_SPECIFIC_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_NDK_CAPABILITIES_REVISION_1`: UInt = 1u;
public const val `NDIS_NDK_CONNECTIONS_REVISION_1`: UInt = 1u;
public const val `NDIS_NDK_LOCAL_ENDPOINTS_REVISION_1`: UInt = 1u;
public const val `NDIS_NDK_STATISTICS_INFO_REVISION_1`: UInt = 1u;
public typealias `NDIS_NETWORK_CHANGE_TYPE` = Int;
public const val `NDIS_NIC_SWITCH_CAPABILITIES_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_CAPABILITIES_REVISION_2`: UInt = 2u;
public const val `NDIS_NIC_SWITCH_CAPABILITIES_REVISION_3`: UInt = 3u;
public const val `NDIS_NIC_SWITCH_CAPS_ASYMMETRIC_QUEUE_PAIRS_FOR_NONDEFAULT_VPORT_SUPPORTED`: UInt = 4u;
public const val `NDIS_NIC_SWITCH_CAPS_NIC_SWITCH_WITHOUT_IOV_SUPPORTED`: UInt = 64u;
public const val `NDIS_NIC_SWITCH_CAPS_PER_VPORT_INTERRUPT_MODERATION_SUPPORTED`: UInt = 2u;
public const val `NDIS_NIC_SWITCH_CAPS_RSS_ON_PF_VPORTS_SUPPORTED`: UInt = 128u;
public const val `NDIS_NIC_SWITCH_CAPS_RSS_PARAMETERS_PER_PF_VPORT_SUPPORTED`: UInt = 32u;
public const val `NDIS_NIC_SWITCH_CAPS_RSS_PER_PF_VPORT_HASH_FUNCTION_SUPPORTED`: UInt = 512u;
public const val `NDIS_NIC_SWITCH_CAPS_RSS_PER_PF_VPORT_HASH_KEY_SUPPORTED`: UInt = 2048u;
public const val `NDIS_NIC_SWITCH_CAPS_RSS_PER_PF_VPORT_HASH_TYPE_SUPPORTED`: UInt = 1024u;
public const val `NDIS_NIC_SWITCH_CAPS_RSS_PER_PF_VPORT_INDIRECTION_TABLE_SIZE_RESTRICTED`: UInt = 4096u;
public const val `NDIS_NIC_SWITCH_CAPS_RSS_PER_PF_VPORT_INDIRECTION_TABLE_SUPPORTED`: UInt = 256u;
public const val `NDIS_NIC_SWITCH_CAPS_SINGLE_VPORT_POOL`: UInt = 16u;
public const val `NDIS_NIC_SWITCH_CAPS_VF_RSS_SUPPORTED`: UInt = 8u;
public const val `NDIS_NIC_SWITCH_CAPS_VLAN_SUPPORTED`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_DELETE_SWITCH_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_DELETE_VPORT_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_FREE_VF_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_INFO_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_PARAMETERS_CHANGE_MASK`: UInt = 4294901760u;
public const val `NDIS_NIC_SWITCH_PARAMETERS_DEFAULT_NUMBER_OF_QUEUE_PAIRS_FOR_DEFAULT_VPORT`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NDIS_NIC_SWITCH_PARAMETERS_SWITCH_NAME_CHANGED`: UInt = 65536u;
public const val `NDIS_NIC_SWITCH_VF_INFO_ARRAY_ENUM_ON_SPECIFIC_SWITCH`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_VF_INFO_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_VF_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_VF_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_VPORT_INFO_ARRAY_ENUM_ON_SPECIFIC_FUNCTION`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_VPORT_INFO_ARRAY_ENUM_ON_SPECIFIC_SWITCH`: UInt = 2u;
public const val `NDIS_NIC_SWITCH_VPORT_INFO_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_VPORT_INFO_GFT_ENABLED`: UInt = 4u;
public const val `NDIS_NIC_SWITCH_VPORT_INFO_LOOKAHEAD_SPLIT_ENABLED`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_VPORT_INFO_PACKET_DIRECT_RX_ONLY`: UInt = 2u;
public const val `NDIS_NIC_SWITCH_VPORT_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_CHANGE_MASK`: UInt = 4294901760u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_ENFORCE_MAX_SG_LIST`: UInt = 32768u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_FLAGS_CHANGED`: UInt = 65536u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_INT_MOD_CHANGED`: UInt = 262144u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_LOOKAHEAD_SPLIT_ENABLED`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_NAME_CHANGED`: UInt = 131072u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_NDK_PARAMS_CHANGED`: UInt = 2097152u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_NUM_QUEUE_PAIRS_CHANGED`: UInt = 8388608u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_PACKET_DIRECT_RX_ONLY`: UInt = 2u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_PROCESSOR_AFFINITY_CHANGED`: UInt = 1048576u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_QOS_SQ_ID_CHANGED`: UInt = 4194304u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_STATE_CHANGED`: UInt = 524288u;
public const val `NDIS_NT`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_OBJECT_HEADER` (
    public var `Type`: UByte,
    public var `Revision`: UByte,
    public var `Size`: UShort,
)
public const val `NDIS_OBJECT_REVISION_1`: UInt = 1u;
public const val `NDIS_OBJECT_TYPE_BIND_PARAMETERS`: UInt = 134u;
public const val `NDIS_OBJECT_TYPE_CLIENT_CHIMNEY_OFFLOAD_CHARACTERISTICS`: UInt = 147u;
public const val `NDIS_OBJECT_TYPE_CLIENT_CHIMNEY_OFFLOAD_GENERIC_CHARACTERISTICS`: UInt = 142u;
public const val `NDIS_OBJECT_TYPE_CONFIGURATION_OBJECT`: UInt = 169u;
public const val `NDIS_OBJECT_TYPE_CO_CALL_MANAGER_OPTIONAL_HANDLERS`: UInt = 165u;
public const val `NDIS_OBJECT_TYPE_CO_CLIENT_OPTIONAL_HANDLERS`: UInt = 166u;
public const val `NDIS_OBJECT_TYPE_CO_MINIPORT_CHARACTERISTICS`: UInt = 145u;
public const val `NDIS_OBJECT_TYPE_CO_PROTOCOL_CHARACTERISTICS`: UInt = 144u;
public const val `NDIS_OBJECT_TYPE_DEFAULT`: UInt = 128u;
public const val `NDIS_OBJECT_TYPE_DEVICE_OBJECT_ATTRIBUTES`: UInt = 133u;
public const val `NDIS_OBJECT_TYPE_DRIVER_WRAPPER_OBJECT`: UInt = 170u;
public const val `NDIS_OBJECT_TYPE_DRIVER_WRAPPER_REVISION_1`: UInt = 1u;
public const val `NDIS_OBJECT_TYPE_FILTER_ATTACH_PARAMETERS`: UInt = 153u;
public const val `NDIS_OBJECT_TYPE_FILTER_ATTRIBUTES`: UInt = 141u;
public const val `NDIS_OBJECT_TYPE_FILTER_DRIVER_CHARACTERISTICS`: UInt = 139u;
public const val `NDIS_OBJECT_TYPE_FILTER_PARTIAL_CHARACTERISTICS`: UInt = 140u;
public const val `NDIS_OBJECT_TYPE_FILTER_PAUSE_PARAMETERS`: UInt = 154u;
public const val `NDIS_OBJECT_TYPE_FILTER_RESTART_PARAMETERS`: UInt = 155u;
public const val `NDIS_OBJECT_TYPE_HD_SPLIT_ATTRIBUTES`: UInt = 171u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_ADAPTER_GENERAL_ATTRIBUTES`: UInt = 159u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_ADAPTER_HARDWARE_ASSIST_ATTRIBUTES`: UInt = 175u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_ADAPTER_NATIVE_802_11_ATTRIBUTES`: UInt = 161u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_ADAPTER_NDK_ATTRIBUTES`: UInt = 179u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_ADAPTER_OFFLOAD_ATTRIBUTES`: UInt = 160u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_ADAPTER_PACKET_DIRECT_ATTRIBUTES`: UInt = 197u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_ADAPTER_REGISTRATION_ATTRIBUTES`: UInt = 158u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_ADD_DEVICE_REGISTRATION_ATTRIBUTES`: UInt = 164u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_DEVICE_POWER_NOTIFICATION`: UInt = 198u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_DRIVER_CHARACTERISTICS`: UInt = 138u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_INIT_PARAMETERS`: UInt = 129u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_INTERRUPT`: UInt = 132u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_PNP_CHARACTERISTICS`: UInt = 146u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_SS_CHARACTERISTICS`: UInt = 180u;
public const val `NDIS_OBJECT_TYPE_NDK_PROVIDER_CHARACTERISTICS`: UInt = 178u;
public const val `NDIS_OBJECT_TYPE_NSI_COMPARTMENT_RW_STRUCT`: UInt = 173u;
public const val `NDIS_OBJECT_TYPE_NSI_INTERFACE_PERSIST_RW_STRUCT`: UInt = 174u;
public const val `NDIS_OBJECT_TYPE_NSI_NETWORK_RW_STRUCT`: UInt = 172u;
public const val `NDIS_OBJECT_TYPE_OFFLOAD`: UInt = 167u;
public const val `NDIS_OBJECT_TYPE_OFFLOAD_ENCAPSULATION`: UInt = 168u;
public const val `NDIS_OBJECT_TYPE_OID_REQUEST`: UInt = 150u;
public const val `NDIS_OBJECT_TYPE_OPEN_PARAMETERS`: UInt = 135u;
public const val `NDIS_OBJECT_TYPE_PCI_DEVICE_CUSTOM_PROPERTIES_REVISION_1`: UInt = 1u;
public const val `NDIS_OBJECT_TYPE_PCI_DEVICE_CUSTOM_PROPERTIES_REVISION_2`: UInt = 2u;
public const val `NDIS_OBJECT_TYPE_PD_RECEIVE_QUEUE`: UInt = 191u;
public const val `NDIS_OBJECT_TYPE_PD_TRANSMIT_QUEUE`: UInt = 190u;
public const val `NDIS_OBJECT_TYPE_PORT_CHARACTERISTICS`: UInt = 156u;
public const val `NDIS_OBJECT_TYPE_PORT_STATE`: UInt = 157u;
public const val `NDIS_OBJECT_TYPE_PROTOCOL_DRIVER_CHARACTERISTICS`: UInt = 149u;
public const val `NDIS_OBJECT_TYPE_PROTOCOL_RESTART_PARAMETERS`: UInt = 163u;
public const val `NDIS_OBJECT_TYPE_PROVIDER_CHIMNEY_OFFLOAD_CHARACTERISTICS`: UInt = 148u;
public const val `NDIS_OBJECT_TYPE_PROVIDER_CHIMNEY_OFFLOAD_GENERIC_CHARACTERISTICS`: UInt = 143u;
public const val `NDIS_OBJECT_TYPE_QOS_CAPABILITIES`: UInt = 181u;
public const val `NDIS_OBJECT_TYPE_QOS_CLASSIFICATION_ELEMENT`: UInt = 183u;
public const val `NDIS_OBJECT_TYPE_QOS_PARAMETERS`: UInt = 182u;
public const val `NDIS_OBJECT_TYPE_REQUEST_EX`: UInt = 150u;
public const val `NDIS_OBJECT_TYPE_RESTART_GENERAL_ATTRIBUTES`: UInt = 162u;
public const val `NDIS_OBJECT_TYPE_RSS_CAPABILITIES`: UInt = 136u;
public const val `NDIS_OBJECT_TYPE_RSS_PARAMETERS`: UInt = 137u;
public const val `NDIS_OBJECT_TYPE_RSS_PARAMETERS_V2`: UInt = 200u;
public const val `NDIS_OBJECT_TYPE_RSS_PROCESSOR_INFO`: UInt = 177u;
public const val `NDIS_OBJECT_TYPE_RSS_SET_INDIRECTION_ENTRIES`: UInt = 201u;
public const val `NDIS_OBJECT_TYPE_SG_DMA_DESCRIPTION`: UInt = 131u;
public const val `NDIS_OBJECT_TYPE_SHARED_MEMORY_PROVIDER_CHARACTERISTICS`: UInt = 176u;
public const val `NDIS_OBJECT_TYPE_STATUS_INDICATION`: UInt = 152u;
public const val `NDIS_OBJECT_TYPE_SWITCH_OPTIONAL_HANDLERS`: UInt = 184u;
public const val `NDIS_OBJECT_TYPE_TIMER_CHARACTERISTICS`: UInt = 151u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_OFFLOAD` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `Checksum`: `NDIS_TCP_IP_CHECKSUM_OFFLOAD`,
    public var `LsoV1`: `NDIS_TCP_LARGE_SEND_OFFLOAD_V1`,
    public var `IPsecV1`: `NDIS_IPSEC_OFFLOAD_V1`,
    public var `LsoV2`: `NDIS_TCP_LARGE_SEND_OFFLOAD_V2`,
    public var `Flags`: UInt,
)
public const val `NDIS_OFFLOAD_ENCAPSULATION_REVISION_1`: UInt = 1u;
public const val `NDIS_OFFLOAD_FLAGS_GROUP_CHECKSUM_CAPABILITIES`: UInt = 1u;
public const val `NDIS_OFFLOAD_NOT_SUPPORTED`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_OFFLOAD_PARAMETERS` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `IPv4Checksum`: UByte,
    public var `TCPIPv4Checksum`: UByte,
    public var `UDPIPv4Checksum`: UByte,
    public var `TCPIPv6Checksum`: UByte,
    public var `UDPIPv6Checksum`: UByte,
    public var `LsoV1`: UByte,
    public var `IPsecV1`: UByte,
    public var `LsoV2IPv4`: UByte,
    public var `LsoV2IPv6`: UByte,
    public var `TcpConnectionIPv4`: UByte,
    public var `TcpConnectionIPv6`: UByte,
    public var `Flags`: UInt,
)
public const val `NDIS_OFFLOAD_PARAMETERS_CONNECTION_OFFLOAD_DISABLED`: UInt = 1u;
public const val `NDIS_OFFLOAD_PARAMETERS_CONNECTION_OFFLOAD_ENABLED`: UInt = 2u;
public const val `NDIS_OFFLOAD_PARAMETERS_IPSECV1_AH_AND_ESP_ENABLED`: UInt = 4u;
public const val `NDIS_OFFLOAD_PARAMETERS_IPSECV1_AH_ENABLED`: UInt = 2u;
public const val `NDIS_OFFLOAD_PARAMETERS_IPSECV1_DISABLED`: UInt = 1u;
public const val `NDIS_OFFLOAD_PARAMETERS_IPSECV1_ESP_ENABLED`: UInt = 3u;
public const val `NDIS_OFFLOAD_PARAMETERS_IPSECV2_AH_AND_ESP_ENABLED`: UInt = 4u;
public const val `NDIS_OFFLOAD_PARAMETERS_IPSECV2_AH_ENABLED`: UInt = 2u;
public const val `NDIS_OFFLOAD_PARAMETERS_IPSECV2_DISABLED`: UInt = 1u;
public const val `NDIS_OFFLOAD_PARAMETERS_IPSECV2_ESP_ENABLED`: UInt = 3u;
public const val `NDIS_OFFLOAD_PARAMETERS_LSOV1_DISABLED`: UInt = 1u;
public const val `NDIS_OFFLOAD_PARAMETERS_LSOV1_ENABLED`: UInt = 2u;
public const val `NDIS_OFFLOAD_PARAMETERS_LSOV2_DISABLED`: UInt = 1u;
public const val `NDIS_OFFLOAD_PARAMETERS_LSOV2_ENABLED`: UInt = 2u;
public const val `NDIS_OFFLOAD_PARAMETERS_NO_CHANGE`: UInt = 0u;
public const val `NDIS_OFFLOAD_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_OFFLOAD_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NDIS_OFFLOAD_PARAMETERS_REVISION_3`: UInt = 3u;
public const val `NDIS_OFFLOAD_PARAMETERS_REVISION_4`: UInt = 4u;
public const val `NDIS_OFFLOAD_PARAMETERS_REVISION_5`: UInt = 5u;
public const val `NDIS_OFFLOAD_PARAMETERS_RSC_DISABLED`: UInt = 1u;
public const val `NDIS_OFFLOAD_PARAMETERS_RSC_ENABLED`: UInt = 2u;
public const val `NDIS_OFFLOAD_PARAMETERS_RX_ENABLED_TX_DISABLED`: UInt = 3u;
public const val `NDIS_OFFLOAD_PARAMETERS_SKIP_REGISTRY_UPDATE`: UInt = 1u;
public const val `NDIS_OFFLOAD_PARAMETERS_TX_ENABLED_RX_DISABLED`: UInt = 2u;
public const val `NDIS_OFFLOAD_PARAMETERS_TX_RX_DISABLED`: UInt = 1u;
public const val `NDIS_OFFLOAD_PARAMETERS_TX_RX_ENABLED`: UInt = 4u;
public const val `NDIS_OFFLOAD_PARAMETERS_USO_DISABLED`: UInt = 1u;
public const val `NDIS_OFFLOAD_PARAMETERS_USO_ENABLED`: UInt = 2u;
public const val `NDIS_OFFLOAD_REVISION_1`: UInt = 1u;
public const val `NDIS_OFFLOAD_REVISION_2`: UInt = 2u;
public const val `NDIS_OFFLOAD_REVISION_3`: UInt = 3u;
public const val `NDIS_OFFLOAD_REVISION_4`: UInt = 4u;
public const val `NDIS_OFFLOAD_REVISION_5`: UInt = 5u;
public const val `NDIS_OFFLOAD_REVISION_6`: UInt = 6u;
public const val `NDIS_OFFLOAD_REVISION_7`: UInt = 7u;
public const val `NDIS_OFFLOAD_SET_NO_CHANGE`: UInt = 0u;
public const val `NDIS_OFFLOAD_SET_OFF`: UInt = 2u;
public const val `NDIS_OFFLOAD_SET_ON`: UInt = 1u;
public const val `NDIS_OFFLOAD_SUPPORTED`: UInt = 1u;
public const val `NDIS_OID_REQUEST_FLAGS_VPORT_ID_VALID`: UInt = 1u;
public const val `NDIS_OID_REQUEST_NDIS_RESERVED_SIZE`: UInt = 16u;
public const val `NDIS_OID_REQUEST_REVISION_1`: UInt = 1u;
public const val `NDIS_OID_REQUEST_REVISION_2`: UInt = 2u;
public const val `NDIS_OID_REQUEST_TIMEOUT_INFINITE`: UInt = 0u;
public typealias `NDIS_OPEN_BLOCK` = Long;
public const val `NDIS_OPEN_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_OPEN_RECEIVE_NOT_REENTRANT`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_OPER_STATE` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `OperationalStatus`: `super`.`super`.`super`.`Win32`.`NetworkManagement`.`Ndis`.`NET_IF_OPER_STATUS`,
    public var `OperationalStatusFlags`: UInt,
)
public const val `NDIS_OPER_STATE_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_PACKET_8021Q_INFO` (
    public var `Anonymous`: `NDIS_PACKET_8021Q_INFO_0`,
)
// UNSUPPORTED Rust 1595:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_PACKET_8021Q_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1600:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NDIS_PACKET_8021Q_INFO_0 {
//     pub TagHeader: NDIS_PACKET_8021Q_INFO_0_0,
//     pub Value: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1606:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_PACKET_8021Q_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_PACKET_8021Q_INFO_0_0` (
    public var `_bitfield`: UInt,
)
public const val `NDIS_PACKET_TYPE_ALL_FUNCTIONAL`: UInt = 8192u;
public const val `NDIS_PACKET_TYPE_ALL_LOCAL`: UInt = 128u;
public const val `NDIS_PACKET_TYPE_ALL_MULTICAST`: UInt = 4u;
public const val `NDIS_PACKET_TYPE_BROADCAST`: UInt = 8u;
public const val `NDIS_PACKET_TYPE_DIRECTED`: UInt = 1u;
public const val `NDIS_PACKET_TYPE_FUNCTIONAL`: UInt = 16384u;
public const val `NDIS_PACKET_TYPE_GROUP`: UInt = 4096u;
public const val `NDIS_PACKET_TYPE_MAC_FRAME`: UInt = 32768u;
public const val `NDIS_PACKET_TYPE_MULTICAST`: UInt = 2u;
public const val `NDIS_PACKET_TYPE_NO_LOCAL`: UInt = 65536u;
public const val `NDIS_PACKET_TYPE_PROMISCUOUS`: UInt = 32u;
public const val `NDIS_PACKET_TYPE_SMT`: UInt = 64u;
public const val `NDIS_PACKET_TYPE_SOURCE_ROUTING`: UInt = 16u;
public typealias `NDIS_PARAMETER_TYPE` = Int;
public const val `NDIS_PAUSE_ATTACH_FILTER`: UInt = 16u;
public const val `NDIS_PAUSE_BIND_PROTOCOL`: UInt = 4u;
public const val `NDIS_PAUSE_DETACH_FILTER`: UInt = 32u;
public const val `NDIS_PAUSE_FILTER_RESTART_STACK`: UInt = 64u;
public const val `NDIS_PAUSE_LOW_POWER`: UInt = 2u;
public const val `NDIS_PAUSE_MINIPORT_DEVICE_REMOVE`: UInt = 128u;
public const val `NDIS_PAUSE_NDIS_INTERNAL`: UInt = 1u;
public const val `NDIS_PAUSE_UNBIND_PROTOCOL`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_PCI_DEVICE_CUSTOM_PROPERTIES` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `DeviceType`: UInt,
    public var `CurrentSpeedAndMode`: UInt,
    public var `CurrentPayloadSize`: UInt,
    public var `MaxPayloadSize`: UInt,
    public var `MaxReadRequestSize`: UInt,
    public var `CurrentLinkSpeed`: UInt,
    public var `CurrentLinkWidth`: UInt,
    public var `MaxLinkSpeed`: UInt,
    public var `MaxLinkWidth`: UInt,
    public var `PciExpressVersion`: UInt,
    public var `InterruptType`: UInt,
    public var `MaxInterruptMessages`: UInt,
)
public const val `NDIS_PD_ACQUIRE_QUEUES_FLAG_DRAIN_NOTIFICATION`: UInt = 1u;
public const val `NDIS_PD_ACQUIRE_QUEUES_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_PD_CAPABILITIES_REVISION_1`: UInt = 1u;
public const val `NDIS_PD_CAPS_DRAIN_NOTIFICATIONS_SUPPORTED`: UInt = 2u;
public const val `NDIS_PD_CAPS_NOTIFICATION_MODERATION_COUNT_SUPPORTED`: UInt = 8u;
public const val `NDIS_PD_CAPS_NOTIFICATION_MODERATION_INTERVAL_SUPPORTED`: UInt = 4u;
public const val `NDIS_PD_CAPS_RECEIVE_FILTER_COUNTERS_SUPPORTED`: UInt = 1u;
public const val `NDIS_PD_CLOSE_PROVIDER_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_PD_CONFIG_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `NDIS_PD_COUNTER_HANDLE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `NDIS_PD_COUNTER_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `NDIS_PD_FILTER_HANDLE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `NDIS_PD_FILTER_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_PD_OPEN_PROVIDER_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_PD_PROVIDER_DISPATCH_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `NDIS_PD_PROVIDER_HANDLE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `NDIS_PD_QUEUE_DISPATCH_REVISION_1`: UInt = 1u;
public const val `NDIS_PD_QUEUE_FLAG_DRAIN_NOTIFICATION`: UInt = 1u;
public const val `NDIS_PD_QUEUE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_PD_QUEUE_REVISION_1`: UInt = 1u;
public typealias `NDIS_PER_PACKET_INFO` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_PHYSICAL_ADDRESS_UNIT` (
    public var `PhysicalAddress`: Long,
    public var `Length`: UInt,
)
public typealias `NDIS_PHYSICAL_MEDIUM` = Int;
public const val `NDIS_PM_CAPABILITIES_REVISION_1`: UInt = 1u;
public const val `NDIS_PM_CAPABILITIES_REVISION_2`: UInt = 2u;
public const val `NDIS_PM_MAX_PATTERN_ID`: UInt = 65535u;
public const val `NDIS_PM_MAX_STRING_SIZE`: UInt = 64u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_PM_PACKET_PATTERN` (
    public var `Priority`: UInt,
    public var `Reserved`: UInt,
    public var `MaskSize`: UInt,
    public var `PatternOffset`: UInt,
    public var `PatternSize`: UInt,
    public var `PatternFlags`: UInt,
)
public const val `NDIS_PM_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_PM_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NDIS_PM_PRIVATE_PATTERN_ID`: UInt = 1u;
public const val `NDIS_PM_PROTOCOL_OFFLOAD_80211_RSN_REKEY_ENABLED`: UInt = 128u;
public const val `NDIS_PM_PROTOCOL_OFFLOAD_80211_RSN_REKEY_SUPPORTED`: UInt = 128u;
public const val `NDIS_PM_PROTOCOL_OFFLOAD_ARP_ENABLED`: UInt = 1u;
public const val `NDIS_PM_PROTOCOL_OFFLOAD_ARP_SUPPORTED`: UInt = 1u;
public const val `NDIS_PM_PROTOCOL_OFFLOAD_NS_ENABLED`: UInt = 2u;
public const val `NDIS_PM_PROTOCOL_OFFLOAD_NS_SUPPORTED`: UInt = 2u;
public const val `NDIS_PM_PROTOCOL_OFFLOAD_PRIORITY_HIGHEST`: UInt = 1u;
public const val `NDIS_PM_PROTOCOL_OFFLOAD_PRIORITY_LOWEST`: UInt = 4294967295u;
public const val `NDIS_PM_PROTOCOL_OFFLOAD_PRIORITY_NORMAL`: UInt = 268435456u;
public const val `NDIS_PM_PROTOCOL_OFFLOAD_REVISION_1`: UInt = 1u;
public const val `NDIS_PM_PROTOCOL_OFFLOAD_REVISION_2`: UInt = 2u;
public const val `NDIS_PM_SELECTIVE_SUSPEND_ENABLED`: UInt = 16u;
public const val `NDIS_PM_SELECTIVE_SUSPEND_SUPPORTED`: UInt = 2u;
public const val `NDIS_PM_WAKE_ON_LINK_CHANGE_ENABLED`: UInt = 1u;
public const val `NDIS_PM_WAKE_ON_MEDIA_CONNECT_SUPPORTED`: UInt = 1u;
public const val `NDIS_PM_WAKE_ON_MEDIA_DISCONNECT_ENABLED`: UInt = 2u;
public const val `NDIS_PM_WAKE_ON_MEDIA_DISCONNECT_SUPPORTED`: UInt = 2u;
public const val `NDIS_PM_WAKE_PACKET_INDICATION_SUPPORTED`: UInt = 1u;
public const val `NDIS_PM_WAKE_PACKET_REVISION_1`: UInt = 1u;
public const val `NDIS_PM_WAKE_REASON_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_PM_WAKE_UP_CAPABILITIES` (
    public var `MinMagicPacketWakeUp`: `NDIS_DEVICE_POWER_STATE`,
    public var `MinPatternWakeUp`: `NDIS_DEVICE_POWER_STATE`,
    public var `MinLinkChangeWakeUp`: `NDIS_DEVICE_POWER_STATE`,
)
public const val `NDIS_PM_WOL_BITMAP_PATTERN_ENABLED`: UInt = 1u;
public const val `NDIS_PM_WOL_BITMAP_PATTERN_SUPPORTED`: UInt = 1u;
public const val `NDIS_PM_WOL_EAPOL_REQUEST_ID_MESSAGE_ENABLED`: UInt = 65536u;
public const val `NDIS_PM_WOL_EAPOL_REQUEST_ID_MESSAGE_SUPPORTED`: UInt = 65536u;
public const val `NDIS_PM_WOL_IPV4_DEST_ADDR_WILDCARD_ENABLED`: UInt = 512u;
public const val `NDIS_PM_WOL_IPV4_DEST_ADDR_WILDCARD_SUPPORTED`: UInt = 512u;
public const val `NDIS_PM_WOL_IPV4_TCP_SYN_ENABLED`: UInt = 4u;
public const val `NDIS_PM_WOL_IPV4_TCP_SYN_SUPPORTED`: UInt = 4u;
public const val `NDIS_PM_WOL_IPV6_DEST_ADDR_WILDCARD_ENABLED`: UInt = 2048u;
public const val `NDIS_PM_WOL_IPV6_DEST_ADDR_WILDCARD_SUPPORTED`: UInt = 2048u;
public const val `NDIS_PM_WOL_IPV6_TCP_SYN_ENABLED`: UInt = 8u;
public const val `NDIS_PM_WOL_IPV6_TCP_SYN_SUPPORTED`: UInt = 8u;
public const val `NDIS_PM_WOL_MAGIC_PACKET_ENABLED`: UInt = 2u;
public const val `NDIS_PM_WOL_MAGIC_PACKET_SUPPORTED`: UInt = 2u;
public const val `NDIS_PM_WOL_PATTERN_REVISION_1`: UInt = 1u;
public const val `NDIS_PM_WOL_PATTERN_REVISION_2`: UInt = 2u;
public const val `NDIS_PM_WOL_PRIORITY_HIGHEST`: UInt = 1u;
public const val `NDIS_PM_WOL_PRIORITY_LOWEST`: UInt = 4294967295u;
public const val `NDIS_PM_WOL_PRIORITY_NORMAL`: UInt = 268435456u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_PNP_CAPABILITIES` (
    public var `Flags`: UInt,
    public var `WakeUpCapabilities`: `NDIS_PM_WAKE_UP_CAPABILITIES`,
)
public const val `NDIS_PNP_WAKE_UP_LINK_CHANGE`: UInt = 4u;
public const val `NDIS_PNP_WAKE_UP_MAGIC_PACKET`: UInt = 1u;
public const val `NDIS_PNP_WAKE_UP_PATTERN_MATCH`: UInt = 2u;
public const val `NDIS_POLL_CHARACTERISTICS_REVISION_1`: UInt = 1u;
public const val `NDIS_POLL_DATA_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `NDIS_POLL_HANDLE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `NDIS_POLL_NOTIFICATION_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_PORT` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`NDIS_PORT`>?,
    public var `NdisReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `MiniportReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ProtocolReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `PortCharacteristics`: `NDIS_PORT_CHARACTERISTICS`,
)
// UNSUPPORTED Rust 1769:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for NDIS_PORT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1775:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct NDIS_PORT_ARRAY {
//     pub Header: NDIS_OBJECT_HEADER,
//     pub NumberOfPorts: u32,
//     pub OffsetFirstPort: u32,
//     pub ElementSize: u32,
//     pub Ports: [NDIS_PORT_CHARACTERISTICS; 1],
// }

// UNSUPPORTED Rust 1785:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for NDIS_PORT_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_PORT_ARRAY_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_PORT_AUTHENTICATION_PARAMETERS` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `SendControlState`: `NDIS_PORT_CONTROL_STATE`,
    public var `RcvControlState`: `NDIS_PORT_CONTROL_STATE`,
    public var `SendAuthorizationState`: `NDIS_PORT_AUTHORIZATION_STATE`,
    public var `RcvAuthorizationState`: `NDIS_PORT_AUTHORIZATION_STATE`,
)
public const val `NDIS_PORT_AUTHENTICATION_PARAMETERS_REVISION_1`: UInt = 1u;
public typealias `NDIS_PORT_AUTHORIZATION_STATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_PORT_CHARACTERISTICS` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `PortNumber`: UInt,
    public var `Flags`: UInt,
    public var `Type`: `NDIS_PORT_TYPE`,
    public var `MediaConnectState`: `super`.`super`.`super`.`Win32`.`NetworkManagement`.`Ndis`.`NET_IF_MEDIA_CONNECT_STATE`,
    public var `XmitLinkSpeed`: ULong,
    public var `RcvLinkSpeed`: ULong,
    public var `Direction`: `super`.`super`.`super`.`Win32`.`NetworkManagement`.`Ndis`.`NET_IF_DIRECTION_TYPE`,
    public var `SendControlState`: `NDIS_PORT_CONTROL_STATE`,
    public var `RcvControlState`: `NDIS_PORT_CONTROL_STATE`,
    public var `SendAuthorizationState`: `NDIS_PORT_AUTHORIZATION_STATE`,
    public var `RcvAuthorizationState`: `NDIS_PORT_AUTHORIZATION_STATE`,
)
public const val `NDIS_PORT_CHARACTERISTICS_REVISION_1`: UInt = 1u;
public const val `NDIS_PORT_CHAR_USE_DEFAULT_AUTH_SETTINGS`: UInt = 1u;
public typealias `NDIS_PORT_CONTROL_STATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_PORT_STATE` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `MediaConnectState`: `super`.`super`.`super`.`Win32`.`NetworkManagement`.`Ndis`.`NET_IF_MEDIA_CONNECT_STATE`,
    public var `XmitLinkSpeed`: ULong,
    public var `RcvLinkSpeed`: ULong,
    public var `Direction`: `super`.`super`.`super`.`Win32`.`NetworkManagement`.`Ndis`.`NET_IF_DIRECTION_TYPE`,
    public var `SendControlState`: `NDIS_PORT_CONTROL_STATE`,
    public var `RcvControlState`: `NDIS_PORT_CONTROL_STATE`,
    public var `SendAuthorizationState`: `NDIS_PORT_AUTHORIZATION_STATE`,
    public var `RcvAuthorizationState`: `NDIS_PORT_AUTHORIZATION_STATE`,
    public var `Flags`: UInt,
)
public const val `NDIS_PORT_STATE_REVISION_1`: UInt = 1u;
public typealias `NDIS_PORT_TYPE` = Int;
public typealias `NDIS_POWER_PROFILE` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `NDIS_PROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
public typealias `NDIS_PROCESSOR_TYPE` = Int;
public typealias `NDIS_PROCESSOR_VENDOR` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `NDIS_PROC_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`NDIS_WORK_ITEM`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public typealias `NDIS_PROTOCOL_BLOCK` = Long;
public const val `NDIS_PROTOCOL_CO_CHARACTERISTICS_REVISION_1`: UInt = 1u;
public const val `NDIS_PROTOCOL_DRIVER_CHARACTERISTICS_REVISION_1`: UInt = 1u;
public const val `NDIS_PROTOCOL_DRIVER_CHARACTERISTICS_REVISION_2`: UInt = 2u;
public const val `NDIS_PROTOCOL_DRIVER_SUPPORTS_CURRENT_MAC_ADDRESS_CHANGE`: UInt = 2u;
public const val `NDIS_PROTOCOL_DRIVER_SUPPORTS_L2_MTU_SIZE_CHANGE`: UInt = 4u;
public const val `NDIS_PROTOCOL_ID_DEFAULT`: UInt = 0u;
public const val `NDIS_PROTOCOL_ID_IP6`: UInt = 3u;
public const val `NDIS_PROTOCOL_ID_IPX`: UInt = 6u;
public const val `NDIS_PROTOCOL_ID_MASK`: UInt = 15u;
public const val `NDIS_PROTOCOL_ID_MAX`: UInt = 15u;
public const val `NDIS_PROTOCOL_ID_NBF`: UInt = 7u;
public const val `NDIS_PROTOCOL_ID_TCP_IP`: UInt = 2u;
public const val `NDIS_PROTOCOL_MAJOR_VERSION`: UInt = 6u;
public const val `NDIS_PROTOCOL_MINIMUM_MAJOR_VERSION`: UInt = 4u;
public const val `NDIS_PROTOCOL_MINIMUM_MINOR_VERSION`: UInt = 0u;
public const val `NDIS_PROTOCOL_MINOR_VERSION`: UInt = 87u;
public const val `NDIS_PROTOCOL_PAUSE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_PROTOCOL_RESTART_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_PROT_OPTION_ESTIMATED_LENGTH`: UInt = 1u;
public const val `NDIS_PROT_OPTION_NO_LOOPBACK`: UInt = 2u;
public const val `NDIS_PROT_OPTION_NO_RSVD_ON_RCVPKT`: UInt = 4u;
public const val `NDIS_PROT_OPTION_SEND_RESTRICTED`: UInt = 8u;
public const val `NDIS_QOS_ACTION_MAXIMUM`: UInt = 1u;
public const val `NDIS_QOS_ACTION_PRIORITY`: UInt = 0u;
public const val `NDIS_QOS_CAPABILITIES_CEE_DCBX_SUPPORTED`: UInt = 4u;
public const val `NDIS_QOS_CAPABILITIES_IEEE_DCBX_SUPPORTED`: UInt = 8u;
public const val `NDIS_QOS_CAPABILITIES_MACSEC_BYPASS_SUPPORTED`: UInt = 2u;
public const val `NDIS_QOS_CAPABILITIES_REVISION_1`: UInt = 1u;
public const val `NDIS_QOS_CAPABILITIES_STRICT_TSA_SUPPORTED`: UInt = 1u;
public const val `NDIS_QOS_CLASSIFICATION_ELEMENT_REVISION_1`: UInt = 1u;
public const val `NDIS_QOS_CLASSIFICATION_ENFORCED_BY_MINIPORT`: UInt = 16777216u;
public const val `NDIS_QOS_CLASSIFICATION_SET_BY_MINIPORT_MASK`: UInt = 4278190080u;
public const val `NDIS_QOS_CONDITION_DEFAULT`: UInt = 1u;
public const val `NDIS_QOS_CONDITION_ETHERTYPE`: UInt = 5u;
public const val `NDIS_QOS_CONDITION_MAXIMUM`: UInt = 7u;
public const val `NDIS_QOS_CONDITION_NETDIRECT_PORT`: UInt = 6u;
public const val `NDIS_QOS_CONDITION_RESERVED`: UInt = 0u;
public const val `NDIS_QOS_CONDITION_TCP_OR_UDP_PORT`: UInt = 4u;
public const val `NDIS_QOS_CONDITION_TCP_PORT`: UInt = 2u;
public const val `NDIS_QOS_CONDITION_UDP_PORT`: UInt = 3u;
public const val `NDIS_QOS_DEFAULT_SQ_ID`: UInt = 0u;
public const val `NDIS_QOS_MAXIMUM_PRIORITIES`: UInt = 8u;
public const val `NDIS_QOS_MAXIMUM_TRAFFIC_CLASSES`: UInt = 8u;
public const val `NDIS_QOS_OFFLOAD_CAPABILITIES_REVISION_1`: UInt = 1u;
public const val `NDIS_QOS_OFFLOAD_CAPABILITIES_REVISION_2`: UInt = 2u;
public const val `NDIS_QOS_OFFLOAD_CAPS_GFT_SQ`: UInt = 2u;
public const val `NDIS_QOS_OFFLOAD_CAPS_STANDARD_SQ`: UInt = 1u;
public const val `NDIS_QOS_PARAMETERS_CLASSIFICATION_CHANGED`: UInt = 65536u;
public const val `NDIS_QOS_PARAMETERS_CLASSIFICATION_CONFIGURED`: UInt = 131072u;
public const val `NDIS_QOS_PARAMETERS_ETS_CHANGED`: UInt = 1u;
public const val `NDIS_QOS_PARAMETERS_ETS_CONFIGURED`: UInt = 2u;
public const val `NDIS_QOS_PARAMETERS_PFC_CHANGED`: UInt = 256u;
public const val `NDIS_QOS_PARAMETERS_PFC_CONFIGURED`: UInt = 512u;
public const val `NDIS_QOS_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_QOS_PARAMETERS_WILLING`: UInt = 2147483648u;
public const val `NDIS_QOS_SQ_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_QOS_SQ_PARAMETERS_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_QOS_SQ_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_QOS_SQ_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NDIS_QOS_SQ_RECEIVE_CAP_ENABLED`: UInt = 4u;
public const val `NDIS_QOS_SQ_STATS_REVISION_1`: UInt = 1u;
public const val `NDIS_QOS_SQ_TRANSMIT_CAP_ENABLED`: UInt = 1u;
public const val `NDIS_QOS_SQ_TRANSMIT_RESERVATION_ENABLED`: UInt = 2u;
public const val `NDIS_QOS_TSA_CBS`: UInt = 1u;
public const val `NDIS_QOS_TSA_ETS`: UInt = 2u;
public const val `NDIS_QOS_TSA_MAXIMUM`: UInt = 3u;
public const val `NDIS_QOS_TSA_STRICT`: UInt = 0u;
public const val `NDIS_RECEIVE_FILTER_ANY_VLAN_SUPPORTED`: UInt = 32u;
public const val `NDIS_RECEIVE_FILTER_ARP_HEADER_OPERATION_SUPPORTED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_ARP_HEADER_SPA_SUPPORTED`: UInt = 2u;
public const val `NDIS_RECEIVE_FILTER_ARP_HEADER_SUPPORTED`: UInt = 8u;
public const val `NDIS_RECEIVE_FILTER_ARP_HEADER_TPA_SUPPORTED`: UInt = 4u;
public const val `NDIS_RECEIVE_FILTER_CAPABILITIES_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_CAPABILITIES_REVISION_2`: UInt = 2u;
public const val `NDIS_RECEIVE_FILTER_CLEAR_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_DYNAMIC_PROCESSOR_AFFINITY_CHANGE_FOR_DEFAULT_QUEUE_SUPPORTED`: UInt = 64u;
public const val `NDIS_RECEIVE_FILTER_DYNAMIC_PROCESSOR_AFFINITY_CHANGE_SUPPORTED`: UInt = 8u;
public const val `NDIS_RECEIVE_FILTER_FIELD_MAC_HEADER_VLAN_UNTAGGED_OR_ZERO`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_FIELD_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_FIELD_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NDIS_RECEIVE_FILTER_FLAGS_RESERVED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_GLOBAL_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_IMPLAT_MIN_OF_QUEUES_MODE`: UInt = 64u;
public const val `NDIS_RECEIVE_FILTER_IMPLAT_SUM_OF_QUEUES_MODE`: UInt = 128u;
public const val `NDIS_RECEIVE_FILTER_INFO_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_INFO_ARRAY_REVISION_2`: UInt = 2u;
public const val `NDIS_RECEIVE_FILTER_INFO_ARRAY_VPORT_ID_SPECIFIED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_INTERRUPT_VECTOR_COALESCING_SUPPORTED`: UInt = 16u;
public const val `NDIS_RECEIVE_FILTER_IPV4_HEADER_PROTOCOL_SUPPORTED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_IPV4_HEADER_SUPPORTED`: UInt = 2u;
public const val `NDIS_RECEIVE_FILTER_IPV6_HEADER_PROTOCOL_SUPPORTED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_IPV6_HEADER_SUPPORTED`: UInt = 4u;
public const val `NDIS_RECEIVE_FILTER_LOOKAHEAD_SPLIT_SUPPORTED`: UInt = 4u;
public const val `NDIS_RECEIVE_FILTER_MAC_HEADER_DEST_ADDR_SUPPORTED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_MAC_HEADER_PACKET_TYPE_SUPPORTED`: UInt = 32u;
public const val `NDIS_RECEIVE_FILTER_MAC_HEADER_PRIORITY_SUPPORTED`: UInt = 16u;
public const val `NDIS_RECEIVE_FILTER_MAC_HEADER_PROTOCOL_SUPPORTED`: UInt = 4u;
public const val `NDIS_RECEIVE_FILTER_MAC_HEADER_SOURCE_ADDR_SUPPORTED`: UInt = 2u;
public const val `NDIS_RECEIVE_FILTER_MAC_HEADER_SUPPORTED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_MAC_HEADER_VLAN_ID_SUPPORTED`: UInt = 8u;
public const val `NDIS_RECEIVE_FILTER_MOVE_FILTER_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_MSI_X_SUPPORTED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_PACKET_COALESCING_FILTERS_ENABLED`: UInt = 2u;
public const val `NDIS_RECEIVE_FILTER_PACKET_COALESCING_SUPPORTED_ON_DEFAULT_QUEUE`: UInt = 256u;
public const val `NDIS_RECEIVE_FILTER_PACKET_ENCAPSULATION`: UInt = 2u;
public const val `NDIS_RECEIVE_FILTER_PACKET_ENCAPSULATION_GRE`: UInt = 2u;
public const val `NDIS_RECEIVE_FILTER_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NDIS_RECEIVE_FILTER_QUEUE_STATE_CHANGE_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_RESERVED`: UInt = 254u;
public const val `NDIS_RECEIVE_FILTER_TEST_HEADER_FIELD_EQUAL_SUPPORTED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_TEST_HEADER_FIELD_MASK_EQUAL_SUPPORTED`: UInt = 2u;
public const val `NDIS_RECEIVE_FILTER_TEST_HEADER_FIELD_NOT_EQUAL_SUPPORTED`: UInt = 4u;
public const val `NDIS_RECEIVE_FILTER_UDP_HEADER_DEST_PORT_SUPPORTED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_UDP_HEADER_SUPPORTED`: UInt = 16u;
public const val `NDIS_RECEIVE_FILTER_VMQ_FILTERS_ENABLED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_VM_QUEUES_ENABLED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_VM_QUEUE_SUPPORTED`: UInt = 2u;
public const val `NDIS_RECEIVE_FLAGS_DISPATCH_LEVEL`: UInt = 1u;
public const val `NDIS_RECEIVE_FLAGS_MORE_NBLS`: UInt = 8192u;
public const val `NDIS_RECEIVE_FLAGS_PERFECT_FILTERED`: UInt = 1024u;
public const val `NDIS_RECEIVE_FLAGS_RESOURCES`: UInt = 2u;
public const val `NDIS_RECEIVE_FLAGS_SHARED_MEMORY_INFO_VALID`: UInt = 4096u;
public const val `NDIS_RECEIVE_FLAGS_SINGLE_ETHER_TYPE`: UInt = 256u;
public const val `NDIS_RECEIVE_FLAGS_SINGLE_QUEUE`: UInt = 2048u;
public const val `NDIS_RECEIVE_FLAGS_SINGLE_VLAN`: UInt = 512u;
public const val `NDIS_RECEIVE_FLAGS_SWITCH_DESTINATION_GROUP`: UInt = 16384u;
public const val `NDIS_RECEIVE_FLAGS_SWITCH_SINGLE_SOURCE`: UInt = 32768u;
public const val `NDIS_RECEIVE_HASH_FLAG_ENABLE_HASH`: UInt = 1u;
public const val `NDIS_RECEIVE_HASH_FLAG_HASH_INFO_UNCHANGED`: UInt = 2u;
public const val `NDIS_RECEIVE_HASH_FLAG_HASH_KEY_UNCHANGED`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_RECEIVE_HASH_PARAMETERS` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `Flags`: UInt,
    public var `HashInformation`: UInt,
    public var `HashSecretKeySize`: UShort,
    public var `HashSecretKeyOffset`: UInt,
)
public const val `NDIS_RECEIVE_HASH_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_QUEUE_ALLOCATION_COMPLETE_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_QUEUE_ALLOCATION_COMPLETE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_QUEUE_FREE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_QUEUE_INFO_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_QUEUE_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_QUEUE_INFO_REVISION_2`: UInt = 2u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_CHANGE_MASK`: UInt = 4294901760u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_FLAGS_CHANGED`: UInt = 65536u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_INTERRUPT_COALESCING_DOMAIN_ID_CHANGED`: UInt = 1048576u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_LOOKAHEAD_SPLIT_REQUIRED`: UInt = 2u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_NAME_CHANGED`: UInt = 524288u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_PER_QUEUE_RECEIVE_INDICATION`: UInt = 1u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_PROCESSOR_AFFINITY_CHANGED`: UInt = 131072u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_QOS_SQ_ID_CHANGED`: UInt = 2097152u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_REVISION_3`: UInt = 3u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_SUGGESTED_RECV_BUFFER_NUMBERS_CHANGED`: UInt = 262144u;
public const val `NDIS_RECEIVE_QUEUE_STATE_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_RECEIVE_SCALE_CAPABILITIES` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `CapabilitiesFlags`: UInt,
    public var `NumberOfInterruptMessages`: UInt,
    public var `NumberOfReceiveQueues`: UInt,
)
public const val `NDIS_RECEIVE_SCALE_CAPABILITIES_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_SCALE_CAPABILITIES_REVISION_2`: UInt = 2u;
public const val `NDIS_RECEIVE_SCALE_CAPABILITIES_REVISION_3`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_RECEIVE_SCALE_PARAMETERS` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `Flags`: UShort,
    public var `BaseCpuNumber`: UShort,
    public var `HashInformation`: UInt,
    public var `IndirectionTableSize`: UShort,
    public var `IndirectionTableOffset`: UInt,
    public var `HashSecretKeySize`: UShort,
    public var `HashSecretKeyOffset`: UInt,
)
public const val `NDIS_RECEIVE_SCALE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_SCALE_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NDIS_RECEIVE_SCALE_PARAMETERS_REVISION_3`: UInt = 3u;
public const val `NDIS_RECEIVE_SCALE_PARAMETERS_V2_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_SCALE_PARAM_ENABLE_RSS`: UInt = 1u;
public const val `NDIS_RECEIVE_SCALE_PARAM_HASH_INFO_CHANGED`: UInt = 2u;
public const val `NDIS_RECEIVE_SCALE_PARAM_HASH_KEY_CHANGED`: UInt = 4u;
public const val `NDIS_RECEIVE_SCALE_PARAM_NUMBER_OF_ENTRIES_CHANGED`: UInt = 16u;
public const val `NDIS_RECEIVE_SCALE_PARAM_NUMBER_OF_QUEUES_CHANGED`: UInt = 8u;
public typealias `NDIS_REQUEST_TYPE` = Int;
public const val `NDIS_RESTART_GENERAL_ATTRIBUTES_MAX_LOOKAHEAD_ACCESSED_DEFINED`: UInt = 1u;
public const val `NDIS_RESTART_GENERAL_ATTRIBUTES_REVISION_1`: UInt = 1u;
public const val `NDIS_RESTART_GENERAL_ATTRIBUTES_REVISION_2`: UInt = 2u;
public const val `NDIS_RETURN_FLAGS_DISPATCH_LEVEL`: UInt = 1u;
public const val `NDIS_RETURN_FLAGS_SINGLE_QUEUE`: UInt = 2u;
public const val `NDIS_RETURN_FLAGS_SWITCH_SINGLE_SOURCE`: UInt = 4u;
public const val `NDIS_RING_AUTO_REMOVAL_ERROR`: UInt = 1024u;
public const val `NDIS_RING_COUNTER_OVERFLOW`: UInt = 256u;
public const val `NDIS_RING_HARD_ERROR`: UInt = 16384u;
public const val `NDIS_RING_LOBE_WIRE_FAULT`: UInt = 2048u;
public const val `NDIS_RING_REMOVE_RECEIVED`: UInt = 512u;
public const val `NDIS_RING_RING_RECOVERY`: UInt = 64u;
public const val `NDIS_RING_SIGNAL_LOSS`: UInt = 32768u;
public const val `NDIS_RING_SINGLE_STATION`: UInt = 128u;
public const val `NDIS_RING_SOFT_ERROR`: UInt = 8192u;
public const val `NDIS_RING_TRANSMIT_BEACON`: UInt = 4096u;
public const val `NDIS_ROUTING_DOMAIN_ENTRY_REVISION_1`: UInt = 1u;
public const val `NDIS_ROUTING_DOMAIN_ISOLATION_ENTRY_REVISION_1`: UInt = 1u;
public const val `NDIS_RSC_STATISTICS_REVISION_1`: UInt = 1u;
public const val `NDIS_RSS_CAPS_CLASSIFICATION_AT_DPC`: UInt = 67108864u;
public const val `NDIS_RSS_CAPS_CLASSIFICATION_AT_ISR`: UInt = 33554432u;
public const val `NDIS_RSS_CAPS_HASH_TYPE_TCP_IPV4`: UInt = 256u;
public const val `NDIS_RSS_CAPS_HASH_TYPE_TCP_IPV6`: UInt = 512u;
public const val `NDIS_RSS_CAPS_HASH_TYPE_TCP_IPV6_EX`: UInt = 1024u;
public const val `NDIS_RSS_CAPS_HASH_TYPE_UDP_IPV4`: UInt = 2048u;
public const val `NDIS_RSS_CAPS_HASH_TYPE_UDP_IPV6`: UInt = 4096u;
public const val `NDIS_RSS_CAPS_HASH_TYPE_UDP_IPV6_EX`: UInt = 8192u;
public const val `NDIS_RSS_CAPS_MESSAGE_SIGNALED_INTERRUPTS`: UInt = 16777216u;
public const val `NDIS_RSS_CAPS_RSS_AVAILABLE_ON_PORTS`: UInt = 268435456u;
public const val `NDIS_RSS_CAPS_SUPPORTS_INDEPENDENT_ENTRY_MOVE`: UInt = 1073741824u;
public const val `NDIS_RSS_CAPS_SUPPORTS_MSI_X`: UInt = 536870912u;
public const val `NDIS_RSS_CAPS_USING_MSI_X`: UInt = 134217728u;
public const val `NDIS_RSS_HASH_SECRET_KEY_MAX_SIZE_REVISION_1`: UInt = 40u;
public const val `NDIS_RSS_HASH_SECRET_KEY_MAX_SIZE_REVISION_2`: UInt = 40u;
public const val `NDIS_RSS_HASH_SECRET_KEY_MAX_SIZE_REVISION_3`: UInt = 40u;
public const val `NDIS_RSS_HASH_SECRET_KEY_SIZE_REVISION_1`: UInt = 40u;
public const val `NDIS_RSS_INDIRECTION_TABLE_MAX_SIZE_REVISION_1`: UInt = 128u;
public const val `NDIS_RSS_INDIRECTION_TABLE_SIZE_REVISION_1`: UInt = 128u;
public const val `NDIS_RSS_PARAM_FLAG_BASE_CPU_UNCHANGED`: UInt = 1u;
public const val `NDIS_RSS_PARAM_FLAG_DEFAULT_PROCESSOR_UNCHANGED`: UInt = 32u;
public const val `NDIS_RSS_PARAM_FLAG_DISABLE_RSS`: UInt = 16u;
public const val `NDIS_RSS_PARAM_FLAG_HASH_INFO_UNCHANGED`: UInt = 2u;
public const val `NDIS_RSS_PARAM_FLAG_HASH_KEY_UNCHANGED`: UInt = 8u;
public const val `NDIS_RSS_PARAM_FLAG_ITABLE_UNCHANGED`: UInt = 4u;
public const val `NDIS_RSS_PROCESSOR_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_RSS_PROCESSOR_INFO_REVISION_2`: UInt = 2u;
public const val `NDIS_RSS_SET_INDIRECTION_ENTRIES_REVISION_1`: UInt = 1u;
public const val `NDIS_RSS_SET_INDIRECTION_ENTRY_FLAG_DEFAULT_PROCESSOR`: UInt = 2u;
public const val `NDIS_RSS_SET_INDIRECTION_ENTRY_FLAG_PRIMARY_PROCESSOR`: UInt = 1u;
public const val `NDIS_RUNTIME_VERSION_60`: UInt = 393216u;
public const val `NDIS_RWL_AT_DISPATCH_LEVEL`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_RW_LOCK` (
    public var `Anonymous1`: `NDIS_RW_LOCK_0`,
    public var `Anonymous2`: `NDIS_RW_LOCK_1`,
)
// UNSUPPORTED Rust 2097:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_RW_LOCK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2102:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NDIS_RW_LOCK_0 {
//     pub Anonymous: NDIS_RW_LOCK_0_0,
//     pub Reserved: [u8; 16],
// }

// UNSUPPORTED Rust 2108:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_RW_LOCK_0 {
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
public class `NDIS_RW_LOCK_0_0` (
    public var `SpinLock`: ULong,
    public var `Context`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2119:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_RW_LOCK_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2124:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NDIS_RW_LOCK_1 {
//     pub RefCount: [NDIS_RW_LOCK_REFCOUNT; 32],
//     pub RefCountEx: [u32; 128],
//     pub Anonymous: NDIS_RW_LOCK_1_0,
// }

// UNSUPPORTED Rust 2131:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_RW_LOCK_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_RW_LOCK_1_0` (
    public var `RefCountLock`: ULong,
    public var `SharedRefCount`: UInt,
    public var `WriterWaiting`: Boolean,
)
// UNSUPPORTED Rust 2143:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NDIS_RW_LOCK_REFCOUNT {
//     pub RefCount: u32,
//     pub cacheLine: [u8; 16],
// }

// UNSUPPORTED Rust 2149:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_RW_LOCK_REFCOUNT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_SCATTER_GATHER_LIST_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SEND_COMPLETE_FLAGS_DISPATCH_LEVEL`: UInt = 1u;
public const val `NDIS_SEND_COMPLETE_FLAGS_SINGLE_QUEUE`: UInt = 2u;
public const val `NDIS_SEND_COMPLETE_FLAGS_SWITCH_SINGLE_SOURCE`: UInt = 4u;
public const val `NDIS_SEND_FLAGS_CHECK_FOR_LOOPBACK`: UInt = 2u;
public const val `NDIS_SEND_FLAGS_DISPATCH_LEVEL`: UInt = 1u;
public const val `NDIS_SEND_FLAGS_SINGLE_QUEUE`: UInt = 4u;
public const val `NDIS_SEND_FLAGS_SWITCH_DESTINATION_GROUP`: UInt = 16u;
public const val `NDIS_SEND_FLAGS_SWITCH_SINGLE_SOURCE`: UInt = 32u;
public const val `NDIS_SG_DMA_64_BIT_ADDRESS`: UInt = 1u;
public const val `NDIS_SG_DMA_DESCRIPTION_REVISION_1`: UInt = 1u;
public const val `NDIS_SG_DMA_DESCRIPTION_REVISION_2`: UInt = 2u;
public const val `NDIS_SG_DMA_HYBRID_DMA`: UInt = 4u;
public const val `NDIS_SG_DMA_V3_HAL_API`: UInt = 2u;
public const val `NDIS_SG_LIST_WRITE_TO_DEVICE`: ULong = 1uL;
public const val `NDIS_SHARED_MEMORY_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SHARED_MEMORY_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NDIS_SHARED_MEMORY_PROVIDER_CHARACTERISTICS_REVISION_1`: UInt = 1u;
public const val `NDIS_SHARED_MEMORY_PROVIDER_CHAR_SUPPORTS_PF_VPORTS`: UInt = 1u;
public const val `NDIS_SHARED_MEM_PARAMETERS_CONTIGOUS`: UInt = 1u;
public const val `NDIS_SHARED_MEM_PARAMETERS_CONTIGUOUS`: UInt = 1u;
public const val `NDIS_SIZEOF_NDIS_PM_PROTOCOL_OFFLOAD_REVISION_1`: UInt = 240u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_SPIN_LOCK` (
    public var `SpinLock`: ULong,
    public var `OldIrql`: UByte,
)
public const val `NDIS_SRIOV_BAR_RESOURCES_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_CAPABILITIES_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_CAPS_PF_MINIPORT`: UInt = 2u;
public const val `NDIS_SRIOV_CAPS_SRIOV_SUPPORTED`: UInt = 1u;
public const val `NDIS_SRIOV_CAPS_VF_MINIPORT`: UInt = 4u;
public const val `NDIS_SRIOV_CONFIG_STATE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_OVERLYING_ADAPTER_INFO_VERSION_1`: UInt = 1u;
public const val `NDIS_SRIOV_PF_LUID_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_PROBED_BARS_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_READ_VF_CONFIG_BLOCK_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_READ_VF_CONFIG_SPACE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_RESET_VF_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_SET_VF_POWER_STATE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_VF_INVALIDATE_CONFIG_BLOCK_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_VF_SERIAL_NUMBER_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_VF_VENDOR_DEVICE_ID_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_WRITE_VF_CONFIG_BLOCK_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_WRITE_VF_CONFIG_SPACE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_STATISTICS_BROADCAST_BYTES_RCV_SUPPORTED`: UInt = 32768u;
public const val `NDIS_STATISTICS_BROADCAST_BYTES_XMIT_SUPPORTED`: UInt = 512u;
public const val `NDIS_STATISTICS_BROADCAST_FRAMES_RCV_SUPPORTED`: UInt = 65536u;
public const val `NDIS_STATISTICS_BROADCAST_FRAMES_XMIT_SUPPORTED`: UInt = 1024u;
public const val `NDIS_STATISTICS_BYTES_RCV_SUPPORTED`: UInt = 524288u;
public const val `NDIS_STATISTICS_BYTES_XMIT_SUPPORTED`: UInt = 1048576u;
public const val `NDIS_STATISTICS_DIRECTED_BYTES_RCV_SUPPORTED`: UInt = 2048u;
public const val `NDIS_STATISTICS_DIRECTED_BYTES_XMIT_SUPPORTED`: UInt = 32u;
public const val `NDIS_STATISTICS_DIRECTED_FRAMES_RCV_SUPPORTED`: UInt = 4096u;
public const val `NDIS_STATISTICS_DIRECTED_FRAMES_XMIT_SUPPORTED`: UInt = 64u;
public const val `NDIS_STATISTICS_FLAGS_VALID_BROADCAST_BYTES_RCV`: UInt = 262144u;
public const val `NDIS_STATISTICS_FLAGS_VALID_BROADCAST_BYTES_XMIT`: UInt = 2097152u;
public const val `NDIS_STATISTICS_FLAGS_VALID_BROADCAST_FRAMES_RCV`: UInt = 4u;
public const val `NDIS_STATISTICS_FLAGS_VALID_BROADCAST_FRAMES_XMIT`: UInt = 256u;
public const val `NDIS_STATISTICS_FLAGS_VALID_BYTES_RCV`: UInt = 8u;
public const val `NDIS_STATISTICS_FLAGS_VALID_BYTES_XMIT`: UInt = 512u;
public const val `NDIS_STATISTICS_FLAGS_VALID_DIRECTED_BYTES_RCV`: UInt = 65536u;
public const val `NDIS_STATISTICS_FLAGS_VALID_DIRECTED_BYTES_XMIT`: UInt = 524288u;
public const val `NDIS_STATISTICS_FLAGS_VALID_DIRECTED_FRAMES_RCV`: UInt = 1u;
public const val `NDIS_STATISTICS_FLAGS_VALID_DIRECTED_FRAMES_XMIT`: UInt = 64u;
public const val `NDIS_STATISTICS_FLAGS_VALID_MULTICAST_BYTES_RCV`: UInt = 131072u;
public const val `NDIS_STATISTICS_FLAGS_VALID_MULTICAST_BYTES_XMIT`: UInt = 1048576u;
public const val `NDIS_STATISTICS_FLAGS_VALID_MULTICAST_FRAMES_RCV`: UInt = 2u;
public const val `NDIS_STATISTICS_FLAGS_VALID_MULTICAST_FRAMES_XMIT`: UInt = 128u;
public const val `NDIS_STATISTICS_FLAGS_VALID_RCV_DISCARDS`: UInt = 16u;
public const val `NDIS_STATISTICS_FLAGS_VALID_RCV_ERROR`: UInt = 32u;
public const val `NDIS_STATISTICS_FLAGS_VALID_XMIT_DISCARDS`: UInt = 32768u;
public const val `NDIS_STATISTICS_FLAGS_VALID_XMIT_ERROR`: UInt = 1024u;
public const val `NDIS_STATISTICS_GEN_STATISTICS_SUPPORTED`: UInt = 4194304u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_STATISTICS_INFO` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `SupportedStatistics`: UInt,
    public var `ifInDiscards`: ULong,
    public var `ifInErrors`: ULong,
    public var `ifHCInOctets`: ULong,
    public var `ifHCInUcastPkts`: ULong,
    public var `ifHCInMulticastPkts`: ULong,
    public var `ifHCInBroadcastPkts`: ULong,
    public var `ifHCOutOctets`: ULong,
    public var `ifHCOutUcastPkts`: ULong,
    public var `ifHCOutMulticastPkts`: ULong,
    public var `ifHCOutBroadcastPkts`: ULong,
    public var `ifOutErrors`: ULong,
    public var `ifOutDiscards`: ULong,
    public var `ifHCInUcastOctets`: ULong,
    public var `ifHCInMulticastOctets`: ULong,
    public var `ifHCInBroadcastOctets`: ULong,
    public var `ifHCOutUcastOctets`: ULong,
    public var `ifHCOutMulticastOctets`: ULong,
    public var `ifHCOutBroadcastOctets`: ULong,
)
public const val `NDIS_STATISTICS_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_STATISTICS_MULTICAST_BYTES_RCV_SUPPORTED`: UInt = 8192u;
public const val `NDIS_STATISTICS_MULTICAST_BYTES_XMIT_SUPPORTED`: UInt = 128u;
public const val `NDIS_STATISTICS_MULTICAST_FRAMES_RCV_SUPPORTED`: UInt = 16384u;
public const val `NDIS_STATISTICS_MULTICAST_FRAMES_XMIT_SUPPORTED`: UInt = 256u;
public const val `NDIS_STATISTICS_RCV_CRC_ERROR_SUPPORTED`: UInt = 131072u;
public const val `NDIS_STATISTICS_RCV_DISCARDS_SUPPORTED`: UInt = 2097152u;
public const val `NDIS_STATISTICS_RCV_ERROR_SUPPORTED`: UInt = 8u;
public const val `NDIS_STATISTICS_RCV_NO_BUFFER_SUPPORTED`: UInt = 16u;
public const val `NDIS_STATISTICS_RCV_OK_SUPPORTED`: UInt = 2u;
public const val `NDIS_STATISTICS_TRANSMIT_QUEUE_LENGTH_SUPPORTED`: UInt = 262144u;
// UNSUPPORTED Rust 2264:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_STATISTICS_VALUE {
//     pub Oid: u32,
//     pub DataLength: u32,
//     pub Data: [u8; 1],
// }

// UNSUPPORTED Rust 2271:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_STATISTICS_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2276:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_STATISTICS_VALUE_EX {
//     pub Oid: u32,
//     pub DataLength: u32,
//     pub Length: u32,
//     pub Data: [u8; 1],
// }

// UNSUPPORTED Rust 2284:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_STATISTICS_VALUE_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_STATISTICS_XMIT_DISCARDS_SUPPORTED`: UInt = 134217728u;
public const val `NDIS_STATISTICS_XMIT_ERROR_SUPPORTED`: UInt = 4u;
public const val `NDIS_STATISTICS_XMIT_OK_SUPPORTED`: UInt = 1u;
public const val `NDIS_STATUS_INDICATION_FLAGS_MEDIA_CONNECT_TO_CONNECT`: UInt = 4096u;
public const val `NDIS_STATUS_INDICATION_FLAGS_NDIS_RESERVED`: UInt = 4095u;
public const val `NDIS_STATUS_INDICATION_REVISION_1`: UInt = 1u;
public typealias `NDIS_SUPPORTED_PAUSE_FUNCTIONS` = Int;
public const val `NDIS_SUPPORT_60_COMPATIBLE_API`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS6`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS61`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS620`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS630`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS640`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS650`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS651`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS660`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS670`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS680`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS681`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS682`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS683`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS684`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS685`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS686`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS687`: UInt = 1u;
public const val `NDIS_SWITCH_COPY_NBL_INFO_FLAGS_PRESERVE_DESTINATIONS`: UInt = 1u;
public const val `NDIS_SWITCH_COPY_NBL_INFO_FLAGS_PRESERVE_SWITCH_INFO_ONLY`: UInt = 2u;
public const val `NDIS_SWITCH_DEFAULT_NIC_INDEX`: UInt = 0u;
public const val `NDIS_SWITCH_DEFAULT_PORT_ID`: UInt = 0u;
public const val `NDIS_SWITCH_FEATURE_STATUS_CUSTOM_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_FEATURE_STATUS_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_FORWARDING_DESTINATION_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_NET_BUFFER_LIST_CONTEXT_TYPE_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_NIC_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_NIC_FLAGS_MAPPED_NIC_UPDATED`: UInt = 4u;
public const val `NDIS_SWITCH_NIC_FLAGS_NIC_INITIALIZING`: UInt = 1u;
public const val `NDIS_SWITCH_NIC_FLAGS_NIC_SUSPENDED`: UInt = 2u;
public const val `NDIS_SWITCH_NIC_FLAGS_NIC_SUSPENDED_LM`: UInt = 16u;
public const val `NDIS_SWITCH_NIC_OID_REQUEST_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_NIC_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_NIC_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NDIS_SWITCH_NIC_SAVE_STATE_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_NIC_SAVE_STATE_REVISION_2`: UInt = 2u;
public const val `NDIS_SWITCH_NIC_STATUS_INDICATION_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_OBJECT_SERIALIZATION_VERSION_1`: UInt = 1u;
public const val `NDIS_SWITCH_OPTIONAL_HANDLERS_PD_RESERVED_SIZE`: UInt = 14u;
public const val `NDIS_SWITCH_OPTIONAL_HANDLERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_OPTIONAL_HANDLERS_REVISION_2`: UInt = 2u;
public const val `NDIS_SWITCH_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_FEATURE_STATUS_CUSTOM_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_FEATURE_STATUS_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PARAMETERS_FLAG_RESTORING_PORT`: UInt = 2u;
public const val `NDIS_SWITCH_PORT_PARAMETERS_FLAG_UNTRUSTED_INTERNAL_PORT`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PROPERTY_CUSTOM_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PROPERTY_DELETE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PROPERTY_ENUM_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PROPERTY_ENUM_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PROPERTY_ISOLATION_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PROPERTY_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PROPERTY_PROFILE_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PROPERTY_ROUTING_DOMAIN_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PROPERTY_SECURITY_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PROPERTY_SECURITY_REVISION_2`: UInt = 2u;
public const val `NDIS_SWITCH_PORT_PROPERTY_VLAN_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PROPERTY_CUSTOM_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PROPERTY_DELETE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PROPERTY_ENUM_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PROPERTY_ENUM_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PROPERTY_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_REPORT_FILTERED_NBL_FLAGS_IS_INCOMING`: UInt = 1u;
public const val `NDIS_SYSTEM_PROCESSOR_INFO_EX_REVISION_1`: UInt = 1u;
public const val `NDIS_SYSTEM_PROCESSOR_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_TASK_OFFLOAD_VERSION`: UInt = 1u;
public const val `NDIS_TASK_TCP_LARGE_SEND_V0`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_CONNECTION_OFFLOAD` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `Encapsulation`: UInt,
    public var `_bitfield`: UInt,
    public var `TcpConnectionOffloadCapacity`: UInt,
    public var `Flags`: UInt,
)
public const val `NDIS_TCP_CONNECTION_OFFLOAD_REVISION_1`: UInt = 1u;
public const val `NDIS_TCP_CONNECTION_OFFLOAD_REVISION_2`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_IP_CHECKSUM_OFFLOAD` (
    public var `IPv4Transmit`: `NDIS_TCP_IP_CHECKSUM_OFFLOAD_0`,
    public var `IPv4Receive`: `NDIS_TCP_IP_CHECKSUM_OFFLOAD_1`,
    public var `IPv6Transmit`: `NDIS_TCP_IP_CHECKSUM_OFFLOAD_2`,
    public var `IPv6Receive`: `NDIS_TCP_IP_CHECKSUM_OFFLOAD_3`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_IP_CHECKSUM_OFFLOAD_1` (
    public var `Encapsulation`: UInt,
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_IP_CHECKSUM_OFFLOAD_0` (
    public var `Encapsulation`: UInt,
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_IP_CHECKSUM_OFFLOAD_3` (
    public var `Encapsulation`: UInt,
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_IP_CHECKSUM_OFFLOAD_2` (
    public var `Encapsulation`: UInt,
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_TCP_IP_CHECKSUM_PACKET_INFO` (
    public var `Anonymous`: `NDIS_TCP_IP_CHECKSUM_PACKET_INFO_0`,
)
// UNSUPPORTED Rust 2413:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_TCP_IP_CHECKSUM_PACKET_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2418:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NDIS_TCP_IP_CHECKSUM_PACKET_INFO_0 {
//     pub Transmit: NDIS_TCP_IP_CHECKSUM_PACKET_INFO_0_0,
//     pub Receive: NDIS_TCP_IP_CHECKSUM_PACKET_INFO_0_1,
//     pub Value: u32,
// }

// UNSUPPORTED Rust 2425:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_TCP_IP_CHECKSUM_PACKET_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_IP_CHECKSUM_PACKET_INFO_0_1` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_IP_CHECKSUM_PACKET_INFO_0_0` (
    public var `_bitfield`: UInt,
)
public const val `NDIS_TCP_LARGE_SEND_OFFLOAD_IPv4`: UInt = 0u;
public const val `NDIS_TCP_LARGE_SEND_OFFLOAD_IPv6`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_LARGE_SEND_OFFLOAD_V1` (
    public var `IPv4`: `NDIS_TCP_LARGE_SEND_OFFLOAD_V1_0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_LARGE_SEND_OFFLOAD_V1_0` (
    public var `Encapsulation`: UInt,
    public var `MaxOffLoadSize`: UInt,
    public var `MinSegmentCount`: UInt,
    public var `_bitfield`: UInt,
)
public const val `NDIS_TCP_LARGE_SEND_OFFLOAD_V1_TYPE`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_LARGE_SEND_OFFLOAD_V2` (
    public var `IPv4`: `NDIS_TCP_LARGE_SEND_OFFLOAD_V2_0`,
    public var `IPv6`: `NDIS_TCP_LARGE_SEND_OFFLOAD_V2_1`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_LARGE_SEND_OFFLOAD_V2_0` (
    public var `Encapsulation`: UInt,
    public var `MaxOffLoadSize`: UInt,
    public var `MinSegmentCount`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_LARGE_SEND_OFFLOAD_V2_1` (
    public var `Encapsulation`: UInt,
    public var `MaxOffLoadSize`: UInt,
    public var `MinSegmentCount`: UInt,
    public var `_bitfield`: UInt,
)
public const val `NDIS_TCP_LARGE_SEND_OFFLOAD_V2_TYPE`: UInt = 1u;
public const val `NDIS_TCP_RECV_SEG_COALESC_OFFLOAD_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2479:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_TIMEOUT_DPC_REQUEST_CAPABILITIES {
//     pub Header: NDIS_OBJECT_HEADER,
//     pub Flags: u32,
//     pub TimeoutArrayLength: u32,
//     pub TimeoutArray: [u32; 1],
// }

// UNSUPPORTED Rust 2487:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_TIMEOUT_DPC_REQUEST_CAPABILITIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_TIMEOUT_DPC_REQUEST_CAPABILITIES_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_System_Kernel"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_TIMER` (
    public var `Timer`: `super`.`super`.`System`.`SystemServices`.`KTIMER`,
    public var `Dpc`: `super`.`super`.`Foundation`.`KDPC`,
)
// UNSUPPORTED Rust 2500:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_System_Kernel"))]
// impl Default for NDIS_TIMER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_TIMER_CHARACTERISTICS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `NDIS_TIMER_FUNCTION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TIMESTAMP_CAPABILITIES` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `HardwareClockFrequencyHz`: ULong,
    public var `CrossTimestamp`: Boolean,
    public var `Reserved1`: ULong,
    public var `Reserved2`: ULong,
    public var `TimestampFlags`: `NDIS_TIMESTAMP_CAPABILITY_FLAGS`,
)
public const val `NDIS_TIMESTAMP_CAPABILITIES_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TIMESTAMP_CAPABILITY_FLAGS` (
    public var `PtpV2OverUdpIPv4EventMsgReceiveHw`: Boolean,
    public var `PtpV2OverUdpIPv4AllMsgReceiveHw`: Boolean,
    public var `PtpV2OverUdpIPv4EventMsgTransmitHw`: Boolean,
    public var `PtpV2OverUdpIPv4AllMsgTransmitHw`: Boolean,
    public var `PtpV2OverUdpIPv6EventMsgReceiveHw`: Boolean,
    public var `PtpV2OverUdpIPv6AllMsgReceiveHw`: Boolean,
    public var `PtpV2OverUdpIPv6EventMsgTransmitHw`: Boolean,
    public var `PtpV2OverUdpIPv6AllMsgTransmitHw`: Boolean,
    public var `AllReceiveHw`: Boolean,
    public var `AllTransmitHw`: Boolean,
    public var `TaggedTransmitHw`: Boolean,
    public var `AllReceiveSw`: Boolean,
    public var `AllTransmitSw`: Boolean,
    public var `TaggedTransmitSw`: Boolean,
)
public const val `NDIS_UDP_SEGMENTATION_OFFLOAD_IPV4`: UInt = 0u;
public const val `NDIS_UDP_SEGMENTATION_OFFLOAD_IPV6`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_VAR_DATA_DESC` (
    public var `Length`: UShort,
    public var `MaximumLength`: UShort,
    public var `Offset`: ULong,
)
// UNSUPPORTED Rust 2546:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_WAN_FRAGMENT {
//     pub RemoteAddress: [u8; 6],
//     pub LocalAddress: [u8; 6],
// }

// UNSUPPORTED Rust 2552:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_WAN_FRAGMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2557:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_WAN_GET_STATS {
//     pub LocalAddress: [u8; 6],
//     pub BytesSent: u32,
//     pub BytesRcvd: u32,
//     pub FramesSent: u32,
//     pub FramesRcvd: u32,
//     pub CRCErrors: u32,
//     pub TimeoutErrors: u32,
//     pub AlignmentErrors: u32,
//     pub SerialOverrunErrors: u32,
//     pub FramingErrors: u32,
//     pub BufferOverrunErrors: u32,
//     pub BytesTransmittedUncompressed: u32,
//     pub BytesReceivedUncompressed: u32,
//     pub BytesTransmittedCompressed: u32,
//     pub BytesReceivedCompressed: u32,
// }

// UNSUPPORTED Rust 2576:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_WAN_GET_STATS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NDIS_WAN_HEADER_FORMAT` = Int;
// UNSUPPORTED Rust 2582:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_WAN_LINE_DOWN {
//     pub RemoteAddress: [u8; 6],
//     pub LocalAddress: [u8; 6],
// }

// UNSUPPORTED Rust 2588:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_WAN_LINE_DOWN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2593:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_WAN_LINE_UP {
//     pub LinkSpeed: u32,
//     pub MaximumTotalSize: u32,
//     pub Quality: NDIS_WAN_QUALITY,
//     pub SendWindow: u16,
//     pub RemoteAddress: [u8; 6],
//     pub LocalAddress: [u8; 6],
//     pub ProtocolBufferLength: u32,
//     pub ProtocolBuffer: *mut u8,
//     pub ProtocolType: u16,
//     pub DeviceName: super::super::super::Win32::Foundation::UNICODE_STRING,
// }

// UNSUPPORTED Rust 2607:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_WAN_LINE_UP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NDIS_WAN_MEDIUM_SUBTYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WAN_PROTOCOL_CAPS` (
    public var `Flags`: UInt,
    public var `Reserved`: UInt,
)
public typealias `NDIS_WAN_QUALITY` = Int;
public const val `NDIS_WDF`: UInt = 1u;
public const val `NDIS_WDM`: UInt = 0u;
public const val `NDIS_WDM_DRIVER`: UInt = 2u;
// UNSUPPORTED Rust 2623:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_WLAN_BSSID {
//     pub Length: u32,
//     pub MacAddress: [u8; 6],
//     pub Reserved: [u8; 2],
//     pub Ssid: NDIS_802_11_SSID,
//     pub Privacy: u32,
//     pub Rssi: i32,
//     pub NetworkTypeInUse: NDIS_802_11_NETWORK_TYPE,
//     pub Configuration: NDIS_802_11_CONFIGURATION,
//     pub InfrastructureMode: NDIS_802_11_NETWORK_INFRASTRUCTURE,
//     pub SupportedRates: [u8; 8],
// }

// UNSUPPORTED Rust 2637:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_WLAN_BSSID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2642:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_WLAN_BSSID_EX {
//     pub Length: u32,
//     pub MacAddress: [u8; 6],
//     pub Reserved: [u8; 2],
//     pub Ssid: NDIS_802_11_SSID,
//     pub Privacy: u32,
//     pub Rssi: i32,
//     pub NetworkTypeInUse: NDIS_802_11_NETWORK_TYPE,
//     pub Configuration: NDIS_802_11_CONFIGURATION,
//     pub InfrastructureMode: NDIS_802_11_NETWORK_INFRASTRUCTURE,
//     pub SupportedRates: [u8; 16],
//     pub IELength: u32,
//     pub IEs: [u8; 1],
// }

// UNSUPPORTED Rust 2658:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_WLAN_BSSID_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_WLAN_WAKE_ON_4WAY_HANDSHAKE_REQUEST_ENABLED`: UInt = 8u;
public const val `NDIS_WLAN_WAKE_ON_4WAY_HANDSHAKE_REQUEST_SUPPORTED`: UInt = 8u;
public const val `NDIS_WLAN_WAKE_ON_AP_ASSOCIATION_LOST_ENABLED`: UInt = 2u;
public const val `NDIS_WLAN_WAKE_ON_AP_ASSOCIATION_LOST_SUPPORTED`: UInt = 2u;
public const val `NDIS_WLAN_WAKE_ON_GTK_HANDSHAKE_ERROR_ENABLED`: UInt = 4u;
public const val `NDIS_WLAN_WAKE_ON_GTK_HANDSHAKE_ERROR_SUPPORTED`: UInt = 4u;
public const val `NDIS_WLAN_WAKE_ON_NLO_DISCOVERY_ENABLED`: UInt = 1u;
public const val `NDIS_WLAN_WAKE_ON_NLO_DISCOVERY_SUPPORTED`: UInt = 1u;
public const val `NDIS_WMI_DEFAULT_METHOD_ID`: UInt = 1u;
// UNSUPPORTED Rust 2672:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct NDIS_WMI_ENUM_ADAPTER {
//     pub Header: NDIS_OBJECT_HEADER,
//     pub IfIndex: u32,
//     pub NetLuid: super::super::super::Win32::NetworkManagement::Ndis::NET_LUID_LH,
//     pub DeviceNameLength: u16,
//     pub DeviceName: [i8; 1],
// }

// UNSUPPORTED Rust 2682:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for NDIS_WMI_ENUM_ADAPTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_WMI_ENUM_ADAPTER_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2689:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct NDIS_WMI_EVENT_HEADER {
//     pub Header: NDIS_OBJECT_HEADER,
//     pub IfIndex: u32,
//     pub NetLuid: super::super::super::Win32::NetworkManagement::Ndis::NET_LUID_LH,
//     pub RequestId: u64,
//     pub PortNumber: u32,
//     pub DeviceNameLength: u32,
//     pub DeviceNameOffset: u32,
//     pub Padding: [u8; 4],
// }

// UNSUPPORTED Rust 2702:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for NDIS_WMI_EVENT_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_WMI_EVENT_HEADER_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_IPSEC_OFFLOAD_V1` (
    public var `Supported`: `NDIS_WMI_IPSEC_OFFLOAD_V1_0`,
    public var `IPv4AH`: `NDIS_WMI_IPSEC_OFFLOAD_V1_1`,
    public var `IPv4ESP`: `NDIS_WMI_IPSEC_OFFLOAD_V1_2`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_IPSEC_OFFLOAD_V1_1` (
    public var `Md5`: UInt,
    public var `Sha_1`: UInt,
    public var `Transport`: UInt,
    public var `Tunnel`: UInt,
    public var `Send`: UInt,
    public var `Receive`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_IPSEC_OFFLOAD_V1_2` (
    public var `Des`: UInt,
    public var `Reserved`: UInt,
    public var `TripleDes`: UInt,
    public var `NullEsp`: UInt,
    public var `Transport`: UInt,
    public var `Tunnel`: UInt,
    public var `Send`: UInt,
    public var `Receive`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_IPSEC_OFFLOAD_V1_0` (
    public var `Encapsulation`: UInt,
    public var `AhEspCombined`: UInt,
    public var `TransportTunnelCombined`: UInt,
    public var `IPv4Options`: UInt,
    public var `Flags`: UInt,
)
// UNSUPPORTED Rust 2747:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct NDIS_WMI_METHOD_HEADER {
//     pub Header: NDIS_OBJECT_HEADER,
//     pub PortNumber: u32,
//     pub NetLuid: super::super::super::Win32::NetworkManagement::Ndis::NET_LUID_LH,
//     pub RequestId: u64,
//     pub Timeout: u32,
//     pub Padding: [u8; 4],
// }

// UNSUPPORTED Rust 2758:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for NDIS_WMI_METHOD_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_WMI_METHOD_HEADER_REVISION_1`: UInt = 1u;
public const val `NDIS_WMI_OBJECT_TYPE_ENUM_ADAPTER`: UInt = 4u;
public const val `NDIS_WMI_OBJECT_TYPE_EVENT`: UInt = 3u;
public const val `NDIS_WMI_OBJECT_TYPE_METHOD`: UInt = 2u;
public const val `NDIS_WMI_OBJECT_TYPE_OUTPUT_INFO`: UInt = 5u;
public const val `NDIS_WMI_OBJECT_TYPE_SET`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_OFFLOAD` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `Checksum`: `NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD`,
    public var `LsoV1`: `NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V1`,
    public var `IPsecV1`: `NDIS_WMI_IPSEC_OFFLOAD_V1`,
    public var `LsoV2`: `NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V2`,
    public var `Flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_OUTPUT_INFO` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `Flags`: UInt,
    public var `SupportedRevision`: UByte,
    public var `DataOffset`: UInt,
)
public const val `NDIS_WMI_PM_ACTIVE_CAPABILITIES_REVISION_1`: UInt = 1u;
public const val `NDIS_WMI_PM_ADMIN_CONFIG_REVISION_1`: UInt = 1u;
public const val `NDIS_WMI_RECEIVE_QUEUE_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_WMI_RECEIVE_QUEUE_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2792:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct NDIS_WMI_SET_HEADER {
//     pub Header: NDIS_OBJECT_HEADER,
//     pub PortNumber: u32,
//     pub NetLuid: super::super::super::Win32::NetworkManagement::Ndis::NET_LUID_LH,
//     pub RequestId: u64,
//     pub Timeout: u32,
//     pub Padding: [u8; 4],
// }

// UNSUPPORTED Rust 2803:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for NDIS_WMI_SET_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_WMI_SET_HEADER_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_TCP_CONNECTION_OFFLOAD` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `Encapsulation`: UInt,
    public var `SupportIPv4`: UInt,
    public var `SupportIPv6`: UInt,
    public var `SupportIPv6ExtensionHeaders`: UInt,
    public var `SupportSack`: UInt,
    public var `TcpConnectionOffloadCapacity`: UInt,
    public var `Flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD` (
    public var `IPv4Transmit`: `NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_0`,
    public var `IPv4Receive`: `NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_1`,
    public var `IPv6Transmit`: `NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_2`,
    public var `IPv6Receive`: `NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_3`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_1` (
    public var `Encapsulation`: UInt,
    public var `IpOptionsSupported`: UInt,
    public var `TcpOptionsSupported`: UInt,
    public var `TcpChecksum`: UInt,
    public var `UdpChecksum`: UInt,
    public var `IpChecksum`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_0` (
    public var `Encapsulation`: UInt,
    public var `IpOptionsSupported`: UInt,
    public var `TcpOptionsSupported`: UInt,
    public var `TcpChecksum`: UInt,
    public var `UdpChecksum`: UInt,
    public var `IpChecksum`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_3` (
    public var `Encapsulation`: UInt,
    public var `IpExtensionHeadersSupported`: UInt,
    public var `TcpOptionsSupported`: UInt,
    public var `TcpChecksum`: UInt,
    public var `UdpChecksum`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_2` (
    public var `Encapsulation`: UInt,
    public var `IpExtensionHeadersSupported`: UInt,
    public var `TcpOptionsSupported`: UInt,
    public var `TcpChecksum`: UInt,
    public var `UdpChecksum`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V1` (
    public var `IPv4`: `NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V1_0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V1_0` (
    public var `Encapsulation`: UInt,
    public var `MaxOffLoadSize`: UInt,
    public var `MinSegmentCount`: UInt,
    public var `TcpOptions`: UInt,
    public var `IpOptions`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V2` (
    public var `IPv4`: `NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V2_0`,
    public var `IPv6`: `NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V2_1`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V2_0` (
    public var `Encapsulation`: UInt,
    public var `MaxOffLoadSize`: UInt,
    public var `MinSegmentCount`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V2_1` (
    public var `Encapsulation`: UInt,
    public var `MaxOffLoadSize`: UInt,
    public var `MinSegmentCount`: UInt,
    public var `IpExtensionHeadersSupported`: UInt,
    public var `TcpOptionsSupported`: UInt,
)
// UNSUPPORTED Rust 2904:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDIS_WORK_ITEM {
//     pub Context: *mut core::ffi::c_void,
//     pub Routine: NDIS_PROC,
//     pub WrapperReserved: [u8; 32],
// }

// UNSUPPORTED Rust 2911:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_WORK_ITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NDIS_WRAPPER_HANDLE` = Long;
public const val `NDIS_WWAN_WAKE_ON_PACKET_STATE_ENABLED`: UInt = 8u;
public const val `NDIS_WWAN_WAKE_ON_PACKET_STATE_SUPPORTED`: UInt = 8u;
public const val `NDIS_WWAN_WAKE_ON_REGISTER_STATE_ENABLED`: UInt = 1u;
public const val `NDIS_WWAN_WAKE_ON_REGISTER_STATE_SUPPORTED`: UInt = 1u;
public const val `NDIS_WWAN_WAKE_ON_SMS_RECEIVE_ENABLED`: UInt = 2u;
public const val `NDIS_WWAN_WAKE_ON_SMS_RECEIVE_SUPPORTED`: UInt = 2u;
public const val `NDIS_WWAN_WAKE_ON_UICC_CHANGE_ENABLED`: UInt = 16u;
public const val `NDIS_WWAN_WAKE_ON_UICC_CHANGE_SUPPORTED`: UInt = 16u;
public const val `NDIS_WWAN_WAKE_ON_USSD_RECEIVE_ENABLED`: UInt = 4u;
public const val `NDIS_WWAN_WAKE_ON_USSD_RECEIVE_SUPPORTED`: UInt = 4u;
// UNSUPPORTED Rust 2927:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NETWORK_ADDRESS {
//     pub AddressLength: u16,
//     pub AddressType: u16,
//     pub Address: [u8; 1],
// }

// UNSUPPORTED Rust 2934:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NETWORK_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2939:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NETWORK_ADDRESS_IP {
//     pub sin_port: u16,
//     pub IN_ADDR: u32,
//     pub sin_zero: [u8; 8],
// }

// UNSUPPORTED Rust 2946:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NETWORK_ADDRESS_IP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2951:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NETWORK_ADDRESS_IP6 {
//     pub sin6_port: u16,
//     pub sin6_flowinfo: u32,
//     pub sin6_addr: [u16; 8],
//     pub sin6_scope_id: u32,
// }

// UNSUPPORTED Rust 2959:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NETWORK_ADDRESS_IP6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2964:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NETWORK_ADDRESS_IPX {
//     pub NetworkAddress: u32,
//     pub NodeAddress: [u8; 6],
//     pub Socket: u16,
// }

// UNSUPPORTED Rust 2971:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NETWORK_ADDRESS_IPX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2976:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NETWORK_ADDRESS_LIST {
//     pub AddressCount: i32,
//     pub AddressType: u16,
//     pub Address: [NETWORK_ADDRESS; 1],
// }

// UNSUPPORTED Rust 2983:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NETWORK_ADDRESS_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NET_BUFFER_LIST_POOL_FLAG_VERIFY`: UInt = 1u;
public const val `NET_BUFFER_LIST_POOL_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NET_BUFFER_LIST_POOL_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NET_BUFFER_POOL_FLAG_VERIFY`: UInt = 1u;
public const val `NET_BUFFER_POOL_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NET_BUFFER_POOL_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NET_DEVICE_PNP_EVENT_REVISION_1`: UInt = 1u;
public const val `NET_EVENT_FLAGS_VPORT_ID_VALID`: UInt = 2u;
public const val `NET_EVENT_HALT_MINIPORT_ON_LOW_POWER`: UInt = 1u;
public const val `NET_PNP_EVENT_NOTIFICATION_REVISION_1`: UInt = 1u;
public const val `NET_PNP_EVENT_NOTIFICATION_REVISION_2`: UInt = 2u;
public typealias `NULL_FILTER` = Long;
public const val `Ndis802_11AuthModeAutoSwitch`: `NDIS_802_11_AUTHENTICATION_MODE` = 2;
public const val `Ndis802_11AuthModeMax`: `NDIS_802_11_AUTHENTICATION_MODE` = 11;
public const val `Ndis802_11AuthModeOpen`: `NDIS_802_11_AUTHENTICATION_MODE` = 0;
public const val `Ndis802_11AuthModeShared`: `NDIS_802_11_AUTHENTICATION_MODE` = 1;
public const val `Ndis802_11AuthModeWPA`: `NDIS_802_11_AUTHENTICATION_MODE` = 3;
public const val `Ndis802_11AuthModeWPA2`: `NDIS_802_11_AUTHENTICATION_MODE` = 6;
public const val `Ndis802_11AuthModeWPA2PSK`: `NDIS_802_11_AUTHENTICATION_MODE` = 7;
public const val `Ndis802_11AuthModeWPA3`: `NDIS_802_11_AUTHENTICATION_MODE` = 8;
public const val `Ndis802_11AuthModeWPA3Ent`: `NDIS_802_11_AUTHENTICATION_MODE` = 10;
public const val `Ndis802_11AuthModeWPA3Ent192`: `NDIS_802_11_AUTHENTICATION_MODE` = 8;
public const val `Ndis802_11AuthModeWPA3SAE`: `NDIS_802_11_AUTHENTICATION_MODE` = 9;
public const val `Ndis802_11AuthModeWPANone`: `NDIS_802_11_AUTHENTICATION_MODE` = 5;
public const val `Ndis802_11AuthModeWPAPSK`: `NDIS_802_11_AUTHENTICATION_MODE` = 4;
public const val `Ndis802_11AutoUnknown`: `NDIS_802_11_NETWORK_INFRASTRUCTURE` = 2;
public const val `Ndis802_11Automode`: `NDIS_802_11_NETWORK_TYPE` = 4;
public const val `Ndis802_11DS`: `NDIS_802_11_NETWORK_TYPE` = 1;
public const val `Ndis802_11Encryption1Enabled`: `NDIS_802_11_WEP_STATUS` = 0;
public const val `Ndis802_11Encryption1KeyAbsent`: `NDIS_802_11_WEP_STATUS` = 2;
public const val `Ndis802_11Encryption2Enabled`: `NDIS_802_11_WEP_STATUS` = 4;
public const val `Ndis802_11Encryption2KeyAbsent`: `NDIS_802_11_WEP_STATUS` = 5;
public const val `Ndis802_11Encryption3Enabled`: `NDIS_802_11_WEP_STATUS` = 6;
public const val `Ndis802_11Encryption3KeyAbsent`: `NDIS_802_11_WEP_STATUS` = 7;
public const val `Ndis802_11EncryptionDisabled`: `NDIS_802_11_WEP_STATUS` = 1;
public const val `Ndis802_11EncryptionNotSupported`: `NDIS_802_11_WEP_STATUS` = 3;
public const val `Ndis802_11FH`: `NDIS_802_11_NETWORK_TYPE` = 0;
public const val `Ndis802_11IBSS`: `NDIS_802_11_NETWORK_INFRASTRUCTURE` = 0;
public const val `Ndis802_11Infrastructure`: `NDIS_802_11_NETWORK_INFRASTRUCTURE` = 1;
public const val `Ndis802_11InfrastructureMax`: `NDIS_802_11_NETWORK_INFRASTRUCTURE` = 3;
public const val `Ndis802_11MediaStreamOff`: `NDIS_802_11_MEDIA_STREAM_MODE` = 0;
public const val `Ndis802_11MediaStreamOn`: `NDIS_802_11_MEDIA_STREAM_MODE` = 1;
public const val `Ndis802_11NetworkTypeMax`: `NDIS_802_11_NETWORK_TYPE` = 5;
public const val `Ndis802_11OFDM24`: `NDIS_802_11_NETWORK_TYPE` = 3;
public const val `Ndis802_11OFDM5`: `NDIS_802_11_NETWORK_TYPE` = 2;
public const val `Ndis802_11PowerModeCAM`: `NDIS_802_11_POWER_MODE` = 0;
public const val `Ndis802_11PowerModeFast_PSP`: `NDIS_802_11_POWER_MODE` = 2;
public const val `Ndis802_11PowerModeMAX_PSP`: `NDIS_802_11_POWER_MODE` = 1;
public const val `Ndis802_11PowerModeMax`: `NDIS_802_11_POWER_MODE` = 3;
public const val `Ndis802_11PrivFilter8021xWEP`: `NDIS_802_11_PRIVACY_FILTER` = 1;
public const val `Ndis802_11PrivFilterAcceptAll`: `NDIS_802_11_PRIVACY_FILTER` = 0;
public const val `Ndis802_11RadioStatusHardwareOff`: `NDIS_802_11_RADIO_STATUS` = 1;
public const val `Ndis802_11RadioStatusHardwareSoftwareOff`: `NDIS_802_11_RADIO_STATUS` = 3;
public const val `Ndis802_11RadioStatusMax`: `NDIS_802_11_RADIO_STATUS` = 4;
public const val `Ndis802_11RadioStatusOn`: `NDIS_802_11_RADIO_STATUS` = 0;
public const val `Ndis802_11RadioStatusSoftwareOff`: `NDIS_802_11_RADIO_STATUS` = 2;
public const val `Ndis802_11ReloadWEPKeys`: `NDIS_802_11_RELOAD_DEFAULTS` = 0;
public const val `Ndis802_11StatusTypeMax`: `NDIS_802_11_STATUS_TYPE` = 3;
public const val `Ndis802_11StatusType_Authentication`: `NDIS_802_11_STATUS_TYPE` = 0;
public const val `Ndis802_11StatusType_MediaStreamMode`: `NDIS_802_11_STATUS_TYPE` = 1;
public const val `Ndis802_11StatusType_PMKID_CandidateList`: `NDIS_802_11_STATUS_TYPE` = 2;
public const val `Ndis802_11WEPDisabled`: `NDIS_802_11_WEP_STATUS` = 1;
public const val `Ndis802_11WEPEnabled`: `NDIS_802_11_WEP_STATUS` = 0;
public const val `Ndis802_11WEPKeyAbsent`: `NDIS_802_11_WEP_STATUS` = 2;
public const val `Ndis802_11WEPNotSupported`: `NDIS_802_11_WEP_STATUS` = 3;
public const val `NdisClass802_3Priority`: `NDIS_CLASS_ID` = 0;
public const val `NdisClassAtmAALInfo`: `NDIS_CLASS_ID` = 3;
public const val `NdisClassIrdaPacketInfo`: `NDIS_CLASS_ID` = 2;
public const val `NdisClassWirelessWanMbxMailbox`: `NDIS_CLASS_ID` = 1;
public const val `NdisDefinitelyNetworkChange`: `NDIS_NETWORK_CHANGE_TYPE` = 2;
public const val `NdisDevicePnPEventMaximum`: `NDIS_DEVICE_PNP_EVENT` = 6;
public const val `NdisDevicePnPEventPowerProfileChanged`: `NDIS_DEVICE_PNP_EVENT` = 5;
public const val `NdisDevicePnPEventQueryRemoved`: `NDIS_DEVICE_PNP_EVENT` = 0;
public const val `NdisDevicePnPEventQueryStopped`: `NDIS_DEVICE_PNP_EVENT` = 3;
public const val `NdisDevicePnPEventRemoved`: `NDIS_DEVICE_PNP_EVENT` = 1;
public const val `NdisDevicePnPEventStopped`: `NDIS_DEVICE_PNP_EVENT` = 4;
public const val `NdisDevicePnPEventSurpriseRemoved`: `NDIS_DEVICE_PNP_EVENT` = 2;
public const val `NdisDeviceStateD0`: `NDIS_DEVICE_POWER_STATE` = 1;
public const val `NdisDeviceStateD1`: `NDIS_DEVICE_POWER_STATE` = 2;
public const val `NdisDeviceStateD2`: `NDIS_DEVICE_POWER_STATE` = 3;
public const val `NdisDeviceStateD3`: `NDIS_DEVICE_POWER_STATE` = 4;
public const val `NdisDeviceStateMaximum`: `NDIS_DEVICE_POWER_STATE` = 5;
public const val `NdisDeviceStateUnspecified`: `NDIS_DEVICE_POWER_STATE` = 0;
public const val `NdisEnvironmentWindows`: `NDIS_ENVIRONMENT_TYPE` = 0;
public const val `NdisEnvironmentWindowsNt`: `NDIS_ENVIRONMENT_TYPE` = 1;
public const val `NdisFddiRingDetect`: `NDIS_FDDI_RING_MGT_STATE` = 4;
public const val `NdisFddiRingDirected`: `NDIS_FDDI_RING_MGT_STATE` = 7;
public const val `NdisFddiRingIsolated`: `NDIS_FDDI_RING_MGT_STATE` = 1;
public const val `NdisFddiRingNonOperational`: `NDIS_FDDI_RING_MGT_STATE` = 2;
public const val `NdisFddiRingNonOperationalDup`: `NDIS_FDDI_RING_MGT_STATE` = 5;
public const val `NdisFddiRingOperational`: `NDIS_FDDI_RING_MGT_STATE` = 3;
public const val `NdisFddiRingOperationalDup`: `NDIS_FDDI_RING_MGT_STATE` = 6;
public const val `NdisFddiRingTrace`: `NDIS_FDDI_RING_MGT_STATE` = 8;
public const val `NdisFddiStateActive`: `NDIS_FDDI_LCONNECTION_STATE` = 9;
public const val `NdisFddiStateBreak`: `NDIS_FDDI_LCONNECTION_STATE` = 2;
public const val `NdisFddiStateConnect`: `NDIS_FDDI_LCONNECTION_STATE` = 4;
public const val `NdisFddiStateJoin`: `NDIS_FDDI_LCONNECTION_STATE` = 7;
public const val `NdisFddiStateMaintenance`: `NDIS_FDDI_LCONNECTION_STATE` = 10;
public const val `NdisFddiStateNext`: `NDIS_FDDI_LCONNECTION_STATE` = 5;
public const val `NdisFddiStateOff`: `NDIS_FDDI_LCONNECTION_STATE` = 1;
public const val `NdisFddiStateSignal`: `NDIS_FDDI_LCONNECTION_STATE` = 6;
public const val `NdisFddiStateTrace`: `NDIS_FDDI_LCONNECTION_STATE` = 3;
public const val `NdisFddiStateVerify`: `NDIS_FDDI_LCONNECTION_STATE` = 8;
public const val `NdisFddiTypeCWrapA`: `NDIS_FDDI_ATTACHMENT_TYPE` = 10;
public const val `NdisFddiTypeCWrapB`: `NDIS_FDDI_ATTACHMENT_TYPE` = 11;
public const val `NdisFddiTypeCWrapS`: `NDIS_FDDI_ATTACHMENT_TYPE` = 12;
public const val `NdisFddiTypeIsolated`: `NDIS_FDDI_ATTACHMENT_TYPE` = 1;
public const val `NdisFddiTypeLocalA`: `NDIS_FDDI_ATTACHMENT_TYPE` = 2;
public const val `NdisFddiTypeLocalAB`: `NDIS_FDDI_ATTACHMENT_TYPE` = 4;
public const val `NdisFddiTypeLocalB`: `NDIS_FDDI_ATTACHMENT_TYPE` = 3;
public const val `NdisFddiTypeLocalS`: `NDIS_FDDI_ATTACHMENT_TYPE` = 5;
public const val `NdisFddiTypeThrough`: `NDIS_FDDI_ATTACHMENT_TYPE` = 13;
public const val `NdisFddiTypeWrapA`: `NDIS_FDDI_ATTACHMENT_TYPE` = 6;
public const val `NdisFddiTypeWrapAB`: `NDIS_FDDI_ATTACHMENT_TYPE` = 8;
public const val `NdisFddiTypeWrapB`: `NDIS_FDDI_ATTACHMENT_TYPE` = 7;
public const val `NdisFddiTypeWrapS`: `NDIS_FDDI_ATTACHMENT_TYPE` = 9;
public const val `NdisHardwareStatusClosing`: `NDIS_HARDWARE_STATUS` = 3;
public const val `NdisHardwareStatusInitializing`: `NDIS_HARDWARE_STATUS` = 1;
public const val `NdisHardwareStatusNotReady`: `NDIS_HARDWARE_STATUS` = 4;
public const val `NdisHardwareStatusReady`: `NDIS_HARDWARE_STATUS` = 0;
public const val `NdisHardwareStatusReset`: `NDIS_HARDWARE_STATUS` = 2;
public const val `NdisHashFunctionReserved1`: UInt = 2u;
public const val `NdisHashFunctionReserved2`: UInt = 4u;
public const val `NdisHashFunctionReserved3`: UInt = 8u;
public const val `NdisHashFunctionToeplitz`: UInt = 1u;
public const val `NdisInterface1394`: `NDIS_INTERFACE_TYPE` = 18;
public const val `NdisInterfaceCBus`: `NDIS_INTERFACE_TYPE` = 9;
public const val `NdisInterfaceEisa`: `NDIS_INTERFACE_TYPE` = 2;
public const val `NdisInterfaceInternal`: `NDIS_INTERFACE_TYPE` = 0;
public const val `NdisInterfaceInternalPowerBus`: `NDIS_INTERFACE_TYPE` = 13;
public const val `NdisInterfaceIrda`: `NDIS_INTERFACE_TYPE` = 17;
public const val `NdisInterfaceIsa`: `NDIS_INTERFACE_TYPE` = 1;
public const val `NdisInterfaceMPIBus`: `NDIS_INTERFACE_TYPE` = 10;
public const val `NdisInterfaceMPSABus`: `NDIS_INTERFACE_TYPE` = 11;
public const val `NdisInterfaceMca`: `NDIS_INTERFACE_TYPE` = 3;
public const val `NdisInterfacePNPBus`: `NDIS_INTERFACE_TYPE` = 15;
public const val `NdisInterfacePNPISABus`: `NDIS_INTERFACE_TYPE` = 14;
public const val `NdisInterfacePcMcia`: `NDIS_INTERFACE_TYPE` = 8;
public const val `NdisInterfacePci`: `NDIS_INTERFACE_TYPE` = 5;
public const val `NdisInterfaceProcessorInternal`: `NDIS_INTERFACE_TYPE` = 12;
public const val `NdisInterfaceTurboChannel`: `NDIS_INTERFACE_TYPE` = 4;
public const val `NdisInterfaceUSB`: `NDIS_INTERFACE_TYPE` = 16;
public const val `NdisInterruptModerationDisabled`: `NDIS_INTERRUPT_MODERATION` = 3;
public const val `NdisInterruptModerationEnabled`: `NDIS_INTERRUPT_MODERATION` = 2;
public const val `NdisInterruptModerationNotSupported`: `NDIS_INTERRUPT_MODERATION` = 1;
public const val `NdisInterruptModerationUnknown`: `NDIS_INTERRUPT_MODERATION` = 0;
public const val `NdisMaximumInterfaceType`: `NDIS_INTERFACE_TYPE` = 19;
public const val `NdisMediaStateConnected`: `NDIS_MEDIA_STATE` = 0;
public const val `NdisMediaStateDisconnected`: `NDIS_MEDIA_STATE` = 1;
public const val `NdisMedium1394`: `NDIS_MEDIUM` = 13;
public const val `NdisMedium802_3`: `NDIS_MEDIUM` = 0;
public const val `NdisMedium802_5`: `NDIS_MEDIUM` = 1;
public const val `NdisMediumArcnet878_2`: `NDIS_MEDIUM` = 7;
public const val `NdisMediumArcnetRaw`: `NDIS_MEDIUM` = 6;
public const val `NdisMediumAtm`: `NDIS_MEDIUM` = 8;
public const val `NdisMediumBpc`: `NDIS_MEDIUM` = 11;
public const val `NdisMediumCoWan`: `NDIS_MEDIUM` = 12;
public const val `NdisMediumDix`: `NDIS_MEDIUM` = 5;
public const val `NdisMediumFddi`: `NDIS_MEDIUM` = 2;
public const val `NdisMediumIP`: `NDIS_MEDIUM` = 19;
public const val `NdisMediumInfiniBand`: `NDIS_MEDIUM` = 14;
public const val `NdisMediumIrda`: `NDIS_MEDIUM` = 10;
public const val `NdisMediumLocalTalk`: `NDIS_MEDIUM` = 4;
public const val `NdisMediumLoopback`: `NDIS_MEDIUM` = 17;
public const val `NdisMediumMax`: `NDIS_MEDIUM` = 20;
public const val `NdisMediumNative802_11`: `NDIS_MEDIUM` = 16;
public const val `NdisMediumTunnel`: `NDIS_MEDIUM` = 15;
public const val `NdisMediumWan`: `NDIS_MEDIUM` = 3;
public const val `NdisMediumWiMAX`: `NDIS_MEDIUM` = 18;
public const val `NdisMediumWirelessWan`: `NDIS_MEDIUM` = 9;
public const val `NdisNetworkChangeFromMediaConnect`: `NDIS_NETWORK_CHANGE_TYPE` = 3;
public const val `NdisNetworkChangeMax`: `NDIS_NETWORK_CHANGE_TYPE` = 4;
public const val `NdisParameterBinary`: `NDIS_PARAMETER_TYPE` = 4;
public const val `NdisParameterHexInteger`: `NDIS_PARAMETER_TYPE` = 1;
public const val `NdisParameterInteger`: `NDIS_PARAMETER_TYPE` = 0;
public const val `NdisParameterMultiString`: `NDIS_PARAMETER_TYPE` = 3;
public const val `NdisParameterString`: `NDIS_PARAMETER_TYPE` = 2;
public const val `NdisPauseFunctionsReceiveOnly`: `NDIS_SUPPORTED_PAUSE_FUNCTIONS` = 2;
public const val `NdisPauseFunctionsSendAndReceive`: `NDIS_SUPPORTED_PAUSE_FUNCTIONS` = 3;
public const val `NdisPauseFunctionsSendOnly`: `NDIS_SUPPORTED_PAUSE_FUNCTIONS` = 1;
public const val `NdisPauseFunctionsUnknown`: `NDIS_SUPPORTED_PAUSE_FUNCTIONS` = 4;
public const val `NdisPauseFunctionsUnsupported`: `NDIS_SUPPORTED_PAUSE_FUNCTIONS` = 0;
public const val `NdisPhysicalMedium1394`: `NDIS_PHYSICAL_MEDIUM` = 7;
public const val `NdisPhysicalMedium802_3`: `NDIS_PHYSICAL_MEDIUM` = 14;
public const val `NdisPhysicalMedium802_5`: `NDIS_PHYSICAL_MEDIUM` = 15;
public const val `NdisPhysicalMediumBluetooth`: `NDIS_PHYSICAL_MEDIUM` = 10;
public const val `NdisPhysicalMediumCableModem`: `NDIS_PHYSICAL_MEDIUM` = 2;
public const val `NdisPhysicalMediumDSL`: `NDIS_PHYSICAL_MEDIUM` = 5;
public const val `NdisPhysicalMediumFibreChannel`: `NDIS_PHYSICAL_MEDIUM` = 6;
public const val `NdisPhysicalMediumInfiniband`: `NDIS_PHYSICAL_MEDIUM` = 11;
public const val `NdisPhysicalMediumIrda`: `NDIS_PHYSICAL_MEDIUM` = 16;
public const val `NdisPhysicalMediumMax`: `NDIS_PHYSICAL_MEDIUM` = 21;
public const val `NdisPhysicalMediumNative802_11`: `NDIS_PHYSICAL_MEDIUM` = 9;
public const val `NdisPhysicalMediumNative802_15_4`: `NDIS_PHYSICAL_MEDIUM` = 20;
public const val `NdisPhysicalMediumOther`: `NDIS_PHYSICAL_MEDIUM` = 19;
public const val `NdisPhysicalMediumPhoneLine`: `NDIS_PHYSICAL_MEDIUM` = 3;
public const val `NdisPhysicalMediumPowerLine`: `NDIS_PHYSICAL_MEDIUM` = 4;
public const val `NdisPhysicalMediumUWB`: `NDIS_PHYSICAL_MEDIUM` = 13;
public const val `NdisPhysicalMediumUnspecified`: `NDIS_PHYSICAL_MEDIUM` = 0;
public const val `NdisPhysicalMediumWiMax`: `NDIS_PHYSICAL_MEDIUM` = 12;
public const val `NdisPhysicalMediumWiredCoWan`: `NDIS_PHYSICAL_MEDIUM` = 18;
public const val `NdisPhysicalMediumWiredWAN`: `NDIS_PHYSICAL_MEDIUM` = 17;
public const val `NdisPhysicalMediumWirelessLan`: `NDIS_PHYSICAL_MEDIUM` = 1;
public const val `NdisPhysicalMediumWirelessWan`: `NDIS_PHYSICAL_MEDIUM` = 8;
public const val `NdisPortAuthorizationUnknown`: `NDIS_PORT_AUTHORIZATION_STATE` = 0;
public const val `NdisPortAuthorized`: `NDIS_PORT_AUTHORIZATION_STATE` = 1;
public const val `NdisPortControlStateControlled`: `NDIS_PORT_CONTROL_STATE` = 1;
public const val `NdisPortControlStateUncontrolled`: `NDIS_PORT_CONTROL_STATE` = 2;
public const val `NdisPortControlStateUnknown`: `NDIS_PORT_CONTROL_STATE` = 0;
public const val `NdisPortReauthorizing`: `NDIS_PORT_AUTHORIZATION_STATE` = 3;
public const val `NdisPortType8021xSupplicant`: `NDIS_PORT_TYPE` = 3;
public const val `NdisPortTypeBridge`: `NDIS_PORT_TYPE` = 1;
public const val `NdisPortTypeMax`: `NDIS_PORT_TYPE` = 4;
public const val `NdisPortTypeRasConnection`: `NDIS_PORT_TYPE` = 2;
public const val `NdisPortTypeUndefined`: `NDIS_PORT_TYPE` = 0;
public const val `NdisPortUnauthorized`: `NDIS_PORT_AUTHORIZATION_STATE` = 2;
public const val `NdisPossibleNetworkChange`: `NDIS_NETWORK_CHANGE_TYPE` = 1;
public const val `NdisPowerProfileAcOnLine`: `NDIS_POWER_PROFILE` = 1;
public const val `NdisPowerProfileBattery`: `NDIS_POWER_PROFILE` = 0;
public const val `NdisProcessorAlpha`: `NDIS_PROCESSOR_TYPE` = 2;
public const val `NdisProcessorAmd64`: `NDIS_PROCESSOR_TYPE` = 4;
public const val `NdisProcessorArm`: `NDIS_PROCESSOR_TYPE` = 6;
public const val `NdisProcessorArm64`: `NDIS_PROCESSOR_TYPE` = 7;
public const val `NdisProcessorIA64`: `NDIS_PROCESSOR_TYPE` = 5;
public const val `NdisProcessorMips`: `NDIS_PROCESSOR_TYPE` = 1;
public const val `NdisProcessorPpc`: `NDIS_PROCESSOR_TYPE` = 3;
public const val `NdisProcessorVendorAuthenticAMD`: `NDIS_PROCESSOR_VENDOR` = 2;
public const val `NdisProcessorVendorGenuinIntel`: `NDIS_PROCESSOR_VENDOR` = 1;
public const val `NdisProcessorVendorGenuineIntel`: `NDIS_PROCESSOR_VENDOR` = 1;
public const val `NdisProcessorVendorUnknown`: `NDIS_PROCESSOR_VENDOR` = 0;
public const val `NdisProcessorX86`: `NDIS_PROCESSOR_TYPE` = 0;
public const val `NdisRequestClose`: `NDIS_REQUEST_TYPE` = 4;
public const val `NdisRequestGeneric1`: `NDIS_REQUEST_TYPE` = 8;
public const val `NdisRequestGeneric2`: `NDIS_REQUEST_TYPE` = 9;
public const val `NdisRequestGeneric3`: `NDIS_REQUEST_TYPE` = 10;
public const val `NdisRequestGeneric4`: `NDIS_REQUEST_TYPE` = 11;
public const val `NdisRequestOpen`: `NDIS_REQUEST_TYPE` = 3;
public const val `NdisRequestQueryInformation`: `NDIS_REQUEST_TYPE` = 0;
public const val `NdisRequestQueryStatistics`: `NDIS_REQUEST_TYPE` = 2;
public const val `NdisRequestReset`: `NDIS_REQUEST_TYPE` = 7;
public const val `NdisRequestSend`: `NDIS_REQUEST_TYPE` = 5;
public const val `NdisRequestSetInformation`: `NDIS_REQUEST_TYPE` = 1;
public const val `NdisRequestTransferData`: `NDIS_REQUEST_TYPE` = 6;
public const val `NdisReserved`: `NDIS_PER_PACKET_INFO` = 4;
public const val `NdisRingStateClosed`: `NDIS_802_5_RING_STATE` = 2;
public const val `NdisRingStateClosing`: `NDIS_802_5_RING_STATE` = 4;
public const val `NdisRingStateOpenFailure`: `NDIS_802_5_RING_STATE` = 5;
public const val `NdisRingStateOpened`: `NDIS_802_5_RING_STATE` = 1;
public const val `NdisRingStateOpening`: `NDIS_802_5_RING_STATE` = 3;
public const val `NdisRingStateRingFailure`: `NDIS_802_5_RING_STATE` = 6;
public const val `NdisWanErrorControl`: `NDIS_WAN_QUALITY` = 1;
public const val `NdisWanHeaderEthernet`: `NDIS_WAN_HEADER_FORMAT` = 1;
public const val `NdisWanHeaderNative`: `NDIS_WAN_HEADER_FORMAT` = 0;
public const val `NdisWanMediumAgileVPN`: `NDIS_WAN_MEDIUM_SUBTYPE` = 14;
public const val `NdisWanMediumAtm`: `NDIS_WAN_MEDIUM_SUBTYPE` = 5;
public const val `NdisWanMediumFrameRelay`: `NDIS_WAN_MEDIUM_SUBTYPE` = 4;
public const val `NdisWanMediumGre`: `NDIS_WAN_MEDIUM_SUBTYPE` = 15;
public const val `NdisWanMediumHub`: `NDIS_WAN_MEDIUM_SUBTYPE` = 0;
public const val `NdisWanMediumIrda`: `NDIS_WAN_MEDIUM_SUBTYPE` = 10;
public const val `NdisWanMediumIsdn`: `NDIS_WAN_MEDIUM_SUBTYPE` = 2;
public const val `NdisWanMediumL2TP`: `NDIS_WAN_MEDIUM_SUBTYPE` = 9;
public const val `NdisWanMediumPPTP`: `NDIS_WAN_MEDIUM_SUBTYPE` = 8;
public const val `NdisWanMediumParallel`: `NDIS_WAN_MEDIUM_SUBTYPE` = 11;
public const val `NdisWanMediumPppoe`: `NDIS_WAN_MEDIUM_SUBTYPE` = 12;
public const val `NdisWanMediumSSTP`: `NDIS_WAN_MEDIUM_SUBTYPE` = 13;
public const val `NdisWanMediumSW56K`: `NDIS_WAN_MEDIUM_SUBTYPE` = 7;
public const val `NdisWanMediumSerial`: `NDIS_WAN_MEDIUM_SUBTYPE` = 3;
public const val `NdisWanMediumSonet`: `NDIS_WAN_MEDIUM_SUBTYPE` = 6;
public const val `NdisWanMediumSubTypeMax`: `NDIS_WAN_MEDIUM_SUBTYPE` = 16;
public const val `NdisWanMediumX_25`: `NDIS_WAN_MEDIUM_SUBTYPE` = 1;
public const val `NdisWanRaw`: `NDIS_WAN_QUALITY` = 0;
public const val `NdisWanReliable`: `NDIS_WAN_QUALITY` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OFFLOAD_ALGO_INFO` (
    public var `algoIdentifier`: UInt,
    public var `algoKeylen`: UInt,
    public var `algoRounds`: UInt,
)
public typealias `OFFLOAD_CONF_ALGO` = Int;
public const val `OFFLOAD_INBOUND_SA`: UInt = 1u;
public typealias `OFFLOAD_INTEGRITY_ALGO` = Int;
// UNSUPPORTED Rust 3270:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OFFLOAD_IPSEC_ADD_SA {
//     pub SrcAddr: u32,
//     pub SrcMask: u32,
//     pub DestAddr: u32,
//     pub DestMask: u32,
//     pub Protocol: u32,
//     pub SrcPort: u16,
//     pub DestPort: u16,
//     pub SrcTunnelAddr: u32,
//     pub DestTunnelAddr: u32,
//     pub Flags: u16,
//     pub NumSAs: i16,
//     pub SecAssoc: [OFFLOAD_SECURITY_ASSOCIATION; 3],
//     pub OffloadHandle: super::super::super::Win32::Foundation::HANDLE,
//     pub KeyLen: u32,
//     pub KeyMat: [u8; 1],
// }

// UNSUPPORTED Rust 3289:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OFFLOAD_IPSEC_ADD_SA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3294:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OFFLOAD_IPSEC_ADD_UDPESP_SA {
//     pub SrcAddr: u32,
//     pub SrcMask: u32,
//     pub DstAddr: u32,
//     pub DstMask: u32,
//     pub Protocol: u32,
//     pub SrcPort: u16,
//     pub DstPort: u16,
//     pub SrcTunnelAddr: u32,
//     pub DstTunnelAddr: u32,
//     pub Flags: u16,
//     pub NumSAs: i16,
//     pub SecAssoc: [OFFLOAD_SECURITY_ASSOCIATION; 3],
//     pub OffloadHandle: super::super::super::Win32::Foundation::HANDLE,
//     pub EncapTypeEntry: OFFLOAD_IPSEC_UDPESP_ENCAPTYPE_ENTRY,
//     pub EncapTypeEntryOffldHandle: super::super::super::Win32::Foundation::HANDLE,
//     pub KeyLen: u32,
//     pub KeyMat: [u8; 1],
// }

// UNSUPPORTED Rust 3315:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OFFLOAD_IPSEC_ADD_UDPESP_SA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OFFLOAD_IPSEC_CONF_3_DES`: `OFFLOAD_CONF_ALGO` = 3;
public const val `OFFLOAD_IPSEC_CONF_DES`: `OFFLOAD_CONF_ALGO` = 1;
public const val `OFFLOAD_IPSEC_CONF_MAX`: `OFFLOAD_CONF_ALGO` = 4;
public const val `OFFLOAD_IPSEC_CONF_NONE`: `OFFLOAD_CONF_ALGO` = 0;
public const val `OFFLOAD_IPSEC_CONF_RESERVED`: `OFFLOAD_CONF_ALGO` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OFFLOAD_IPSEC_DELETE_SA` (
    public var `OffloadHandle`: `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 3330:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OFFLOAD_IPSEC_DELETE_SA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OFFLOAD_IPSEC_DELETE_UDPESP_SA` (
    public var `OffloadHandle`: `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`,
    public var `EncapTypeEntryOffldHandle`: `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 3341:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OFFLOAD_IPSEC_DELETE_UDPESP_SA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OFFLOAD_IPSEC_INTEGRITY_MAX`: `OFFLOAD_INTEGRITY_ALGO` = 3;
public const val `OFFLOAD_IPSEC_INTEGRITY_MD5`: `OFFLOAD_INTEGRITY_ALGO` = 1;
public const val `OFFLOAD_IPSEC_INTEGRITY_NONE`: `OFFLOAD_INTEGRITY_ALGO` = 0;
public const val `OFFLOAD_IPSEC_INTEGRITY_SHA`: `OFFLOAD_INTEGRITY_ALGO` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OFFLOAD_IPSEC_UDPESP_ENCAPTYPE_ENTRY` (
    public var `UdpEncapType`: `UDP_ENCAP_TYPE`,
    public var `DstEncapPort`: UShort,
)
public const val `OFFLOAD_IPSEC_UDPESP_ENCAPTYPE_IKE`: `UDP_ENCAP_TYPE` = 0;
public const val `OFFLOAD_IPSEC_UDPESP_ENCAPTYPE_OTHER`: `UDP_ENCAP_TYPE` = 1;
public const val `OFFLOAD_MAX_SAS`: UInt = 3u;
public typealias `OFFLOAD_OPERATION_E` = Int;
public const val `OFFLOAD_OUTBOUND_SA`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OFFLOAD_SECURITY_ASSOCIATION` (
    public var `Operation`: `OFFLOAD_OPERATION_E`,
    public var `SPI`: UInt,
    public var `IntegrityAlgo`: `OFFLOAD_ALGO_INFO`,
    public var `ConfAlgo`: `OFFLOAD_ALGO_INFO`,
    public var `Reserved`: `OFFLOAD_ALGO_INFO`,
)
public const val `OID_1394_LOCAL_NODE_INFO`: UInt = 201392385u;
public const val `OID_1394_VC_INFO`: UInt = 201392386u;
public const val `OID_802_11_ADD_KEY`: UInt = 218169629u;
public const val `OID_802_11_ADD_WEP`: UInt = 218169619u;
public const val `OID_802_11_ASSOCIATION_INFORMATION`: UInt = 218169631u;
public const val `OID_802_11_AUTHENTICATION_MODE`: UInt = 218169624u;
public const val `OID_802_11_BSSID`: UInt = 218169601u;
public const val `OID_802_11_BSSID_LIST`: UInt = 218169879u;
public const val `OID_802_11_BSSID_LIST_SCAN`: UInt = 218169626u;
public const val `OID_802_11_CAPABILITY`: UInt = 218169634u;
public const val `OID_802_11_CONFIGURATION`: UInt = 218169873u;
public const val `OID_802_11_DESIRED_RATES`: UInt = 218169872u;
public const val `OID_802_11_DISASSOCIATE`: UInt = 218169621u;
public const val `OID_802_11_ENCRYPTION_STATUS`: UInt = 218169627u;
public const val `OID_802_11_FRAGMENTATION_THRESHOLD`: UInt = 218169865u;
public const val `OID_802_11_INFRASTRUCTURE_MODE`: UInt = 218169608u;
public const val `OID_802_11_MEDIA_STREAM_MODE`: UInt = 218169633u;
public const val `OID_802_11_NETWORK_TYPES_SUPPORTED`: UInt = 218169859u;
public const val `OID_802_11_NETWORK_TYPE_IN_USE`: UInt = 218169860u;
public const val `OID_802_11_NON_BCAST_SSID_LIST`: UInt = 218169636u;
public const val `OID_802_11_NUMBER_OF_ANTENNAS`: UInt = 218169867u;
public const val `OID_802_11_PMKID`: UInt = 218169635u;
public const val `OID_802_11_POWER_MODE`: UInt = 218169878u;
public const val `OID_802_11_PRIVACY_FILTER`: UInt = 218169625u;
public const val `OID_802_11_RADIO_STATUS`: UInt = 218169637u;
public const val `OID_802_11_RELOAD_DEFAULTS`: UInt = 218169628u;
public const val `OID_802_11_REMOVE_KEY`: UInt = 218169630u;
public const val `OID_802_11_REMOVE_WEP`: UInt = 218169620u;
public const val `OID_802_11_RSSI`: UInt = 218169862u;
public const val `OID_802_11_RSSI_TRIGGER`: UInt = 218169863u;
public const val `OID_802_11_RTS_THRESHOLD`: UInt = 218169866u;
public const val `OID_802_11_RX_ANTENNA_SELECTED`: UInt = 218169868u;
public const val `OID_802_11_SSID`: UInt = 218169602u;
public const val `OID_802_11_STATISTICS`: UInt = 218235410u;
public const val `OID_802_11_SUPPORTED_RATES`: UInt = 218169870u;
public const val `OID_802_11_TEST`: UInt = 218169632u;
public const val `OID_802_11_TX_ANTENNA_SELECTED`: UInt = 218169869u;
public const val `OID_802_11_TX_POWER_LEVEL`: UInt = 218169861u;
public const val `OID_802_11_WEP_STATUS`: UInt = 218169627u;
public const val `OID_802_3_ADD_MULTICAST_ADDRESS`: UInt = 16843272u;
public const val `OID_802_3_CURRENT_ADDRESS`: UInt = 16843010u;
public const val `OID_802_3_DELETE_MULTICAST_ADDRESS`: UInt = 16843273u;
public const val `OID_802_3_MAC_OPTIONS`: UInt = 16843013u;
public const val `OID_802_3_MAXIMUM_LIST_SIZE`: UInt = 16843012u;
public const val `OID_802_3_MULTICAST_LIST`: UInt = 16843011u;
public const val `OID_802_3_PERMANENT_ADDRESS`: UInt = 16843009u;
public const val `OID_802_3_RCV_ERROR_ALIGNMENT`: UInt = 16908545u;
public const val `OID_802_3_RCV_OVERRUN`: UInt = 16908803u;
public const val `OID_802_3_XMIT_DEFERRED`: UInt = 16908801u;
public const val `OID_802_3_XMIT_HEARTBEAT_FAILURE`: UInt = 16908805u;
public const val `OID_802_3_XMIT_LATE_COLLISIONS`: UInt = 16908807u;
public const val `OID_802_3_XMIT_MAX_COLLISIONS`: UInt = 16908802u;
public const val `OID_802_3_XMIT_MORE_COLLISIONS`: UInt = 16908547u;
public const val `OID_802_3_XMIT_ONE_COLLISION`: UInt = 16908546u;
public const val `OID_802_3_XMIT_TIMES_CRS_LOST`: UInt = 16908806u;
public const val `OID_802_3_XMIT_UNDERRUN`: UInt = 16908804u;
public const val `OID_802_5_ABORT_DELIMETERS`: UInt = 33686019u;
public const val `OID_802_5_AC_ERRORS`: UInt = 33686018u;
public const val `OID_802_5_BURST_ERRORS`: UInt = 33686017u;
public const val `OID_802_5_CURRENT_ADDRESS`: UInt = 33620226u;
public const val `OID_802_5_CURRENT_FUNCTIONAL`: UInt = 33620227u;
public const val `OID_802_5_CURRENT_GROUP`: UInt = 33620228u;
public const val `OID_802_5_CURRENT_RING_STATE`: UInt = 33620231u;
public const val `OID_802_5_CURRENT_RING_STATUS`: UInt = 33620230u;
public const val `OID_802_5_FRAME_COPIED_ERRORS`: UInt = 33686020u;
public const val `OID_802_5_FREQUENCY_ERRORS`: UInt = 33686021u;
public const val `OID_802_5_INTERNAL_ERRORS`: UInt = 33686023u;
public const val `OID_802_5_LAST_OPEN_STATUS`: UInt = 33620229u;
public const val `OID_802_5_LINE_ERRORS`: UInt = 33685761u;
public const val `OID_802_5_LOST_FRAMES`: UInt = 33685762u;
public const val `OID_802_5_PERMANENT_ADDRESS`: UInt = 33620225u;
public const val `OID_802_5_TOKEN_ERRORS`: UInt = 33686022u;
public const val `OID_ARCNET_CURRENT_ADDRESS`: UInt = 100729090u;
public const val `OID_ARCNET_PERMANENT_ADDRESS`: UInt = 100729089u;
public const val `OID_ARCNET_RECONFIGURATIONS`: UInt = 100794881u;
public const val `OID_ATM_ACQUIRE_ACCESS_NET_RESOURCES`: UInt = 134283779u;
public const val `OID_ATM_ALIGNMENT_REQUIRED`: UInt = 134283784u;
public const val `OID_ATM_ASSIGNED_VPI`: UInt = 134283778u;
public const val `OID_ATM_CALL_ALERTING`: UInt = 134283788u;
public const val `OID_ATM_CALL_NOTIFY`: UInt = 134283790u;
public const val `OID_ATM_CALL_PROCEEDING`: UInt = 134283787u;
public const val `OID_ATM_CELLS_HEC_ERROR`: UInt = 134349314u;
public const val `OID_ATM_DIGITAL_BROADCAST_VPIVCI`: UInt = 134283782u;
public const val `OID_ATM_GET_NEAREST_FLOW`: UInt = 134283783u;
public const val `OID_ATM_HW_CURRENT_ADDRESS`: UInt = 134283524u;
public const val `OID_ATM_ILMI_VPIVCI`: UInt = 134283781u;
public const val `OID_ATM_LECS_ADDRESS`: UInt = 134283785u;
public const val `OID_ATM_MAX_AAL0_PACKET_SIZE`: UInt = 134283528u;
public const val `OID_ATM_MAX_AAL1_PACKET_SIZE`: UInt = 134283529u;
public const val `OID_ATM_MAX_AAL34_PACKET_SIZE`: UInt = 134283530u;
public const val `OID_ATM_MAX_AAL5_PACKET_SIZE`: UInt = 134283531u;
public const val `OID_ATM_MAX_ACTIVE_VCI_BITS`: UInt = 134283526u;
public const val `OID_ATM_MAX_ACTIVE_VCS`: UInt = 134283525u;
public const val `OID_ATM_MAX_ACTIVE_VPI_BITS`: UInt = 134283527u;
public const val `OID_ATM_MY_IP_NM_ADDRESS`: UInt = 134283791u;
public const val `OID_ATM_PARTY_ALERTING`: UInt = 134283789u;
public const val `OID_ATM_RCV_CELLS_DROPPED`: UInt = 134349059u;
public const val `OID_ATM_RCV_CELLS_OK`: UInt = 134349057u;
public const val `OID_ATM_RCV_INVALID_VPI_VCI`: UInt = 134349313u;
public const val `OID_ATM_RCV_REASSEMBLY_ERROR`: UInt = 134349315u;
public const val `OID_ATM_RELEASE_ACCESS_NET_RESOURCES`: UInt = 134283780u;
public const val `OID_ATM_SERVICE_ADDRESS`: UInt = 134283786u;
public const val `OID_ATM_SIGNALING_VPIVCI`: UInt = 134283777u;
public const val `OID_ATM_SUPPORTED_AAL_TYPES`: UInt = 134283523u;
public const val `OID_ATM_SUPPORTED_SERVICE_CATEGORY`: UInt = 134283522u;
public const val `OID_ATM_SUPPORTED_VC_RATES`: UInt = 134283521u;
public const val `OID_ATM_XMIT_CELLS_OK`: UInt = 134349058u;
public const val `OID_CO_ADDRESS_CHANGE`: UInt = 4261412871u;
public const val `OID_CO_ADD_ADDRESS`: UInt = 4261412868u;
public const val `OID_CO_ADD_PVC`: UInt = 4261412865u;
public const val `OID_CO_AF_CLOSE`: UInt = 4261412874u;
public const val `OID_CO_DELETE_ADDRESS`: UInt = 4261412869u;
public const val `OID_CO_DELETE_PVC`: UInt = 4261412866u;
public const val `OID_CO_GET_ADDRESSES`: UInt = 4261412870u;
public const val `OID_CO_GET_CALL_INFORMATION`: UInt = 4261412867u;
public const val `OID_CO_SIGNALING_DISABLED`: UInt = 4261412873u;
public const val `OID_CO_SIGNALING_ENABLED`: UInt = 4261412872u;
public const val `OID_CO_TAPI_ADDRESS_CAPS`: UInt = 4261416963u;
public const val `OID_CO_TAPI_CM_CAPS`: UInt = 4261416961u;
public const val `OID_CO_TAPI_DONT_REPORT_DIGITS`: UInt = 4261416969u;
public const val `OID_CO_TAPI_GET_CALL_DIAGNOSTICS`: UInt = 4261416967u;
public const val `OID_CO_TAPI_LINE_CAPS`: UInt = 4261416962u;
public const val `OID_CO_TAPI_REPORT_DIGITS`: UInt = 4261416968u;
public const val `OID_CO_TAPI_TRANSLATE_NDIS_CALLPARAMS`: UInt = 4261416965u;
public const val `OID_CO_TAPI_TRANSLATE_TAPI_CALLPARAMS`: UInt = 4261416964u;
public const val `OID_CO_TAPI_TRANSLATE_TAPI_SAP`: UInt = 4261416966u;
public const val `OID_FDDI_ATTACHMENT_TYPE`: UInt = 50462977u;
public const val `OID_FDDI_DOWNSTREAM_NODE_LONG`: UInt = 50462979u;
public const val `OID_FDDI_FRAMES_LOST`: UInt = 50462981u;
public const val `OID_FDDI_FRAME_ERRORS`: UInt = 50462980u;
public const val `OID_FDDI_IF_ADMIN_STATUS`: UInt = 50528894u;
public const val `OID_FDDI_IF_DESCR`: UInt = 50528889u;
public const val `OID_FDDI_IF_IN_DISCARDS`: UInt = 50528900u;
public const val `OID_FDDI_IF_IN_ERRORS`: UInt = 50528901u;
public const val `OID_FDDI_IF_IN_NUCAST_PKTS`: UInt = 50528899u;
public const val `OID_FDDI_IF_IN_OCTETS`: UInt = 50528897u;
public const val `OID_FDDI_IF_IN_UCAST_PKTS`: UInt = 50528898u;
public const val `OID_FDDI_IF_IN_UNKNOWN_PROTOS`: UInt = 50528902u;
public const val `OID_FDDI_IF_LAST_CHANGE`: UInt = 50528896u;
public const val `OID_FDDI_IF_MTU`: UInt = 50528891u;
public const val `OID_FDDI_IF_OPER_STATUS`: UInt = 50528895u;
public const val `OID_FDDI_IF_OUT_DISCARDS`: UInt = 50528906u;
public const val `OID_FDDI_IF_OUT_ERRORS`: UInt = 50528907u;
public const val `OID_FDDI_IF_OUT_NUCAST_PKTS`: UInt = 50528905u;
public const val `OID_FDDI_IF_OUT_OCTETS`: UInt = 50528903u;
public const val `OID_FDDI_IF_OUT_QLEN`: UInt = 50528908u;
public const val `OID_FDDI_IF_OUT_UCAST_PKTS`: UInt = 50528904u;
public const val `OID_FDDI_IF_PHYS_ADDRESS`: UInt = 50528893u;
public const val `OID_FDDI_IF_SPECIFIC`: UInt = 50528909u;
public const val `OID_FDDI_IF_SPEED`: UInt = 50528892u;
public const val `OID_FDDI_IF_TYPE`: UInt = 50528890u;
public const val `OID_FDDI_LCONNECTION_STATE`: UInt = 50462985u;
public const val `OID_FDDI_LCT_FAILURES`: UInt = 50462983u;
public const val `OID_FDDI_LEM_REJECTS`: UInt = 50462984u;
public const val `OID_FDDI_LONG_CURRENT_ADDR`: UInt = 50397442u;
public const val `OID_FDDI_LONG_MAX_LIST_SIZE`: UInt = 50397444u;
public const val `OID_FDDI_LONG_MULTICAST_LIST`: UInt = 50397443u;
public const val `OID_FDDI_LONG_PERMANENT_ADDR`: UInt = 50397441u;
public const val `OID_FDDI_MAC_AVAILABLE_PATHS`: UInt = 50528803u;
public const val `OID_FDDI_MAC_BRIDGE_FUNCTIONS`: UInt = 50528800u;
public const val `OID_FDDI_MAC_COPIED_CT`: UInt = 50528828u;
public const val `OID_FDDI_MAC_CURRENT_PATH`: UInt = 50528804u;
public const val `OID_FDDI_MAC_DA_FLAG`: UInt = 50528842u;
public const val `OID_FDDI_MAC_DOWNSTREAM_NBR`: UInt = 50528806u;
public const val `OID_FDDI_MAC_DOWNSTREAM_PORT_TYPE`: UInt = 50528811u;
public const val `OID_FDDI_MAC_DUP_ADDRESS_TEST`: UInt = 50528809u;
public const val `OID_FDDI_MAC_ERROR_CT`: UInt = 50528831u;
public const val `OID_FDDI_MAC_FRAME_CT`: UInt = 50528827u;
public const val `OID_FDDI_MAC_FRAME_ERROR_FLAG`: UInt = 50528844u;
public const val `OID_FDDI_MAC_FRAME_ERROR_RATIO`: UInt = 50528838u;
public const val `OID_FDDI_MAC_FRAME_ERROR_THRESHOLD`: UInt = 50528837u;
public const val `OID_FDDI_MAC_FRAME_STATUS_FUNCTIONS`: UInt = 50528799u;
public const val `OID_FDDI_MAC_HARDWARE_PRESENT`: UInt = 50528847u;
public const val `OID_FDDI_MAC_INDEX`: UInt = 50528812u;
public const val `OID_FDDI_MAC_LATE_CT`: UInt = 50528835u;
public const val `OID_FDDI_MAC_LONG_GRP_ADDRESS`: UInt = 50528814u;
public const val `OID_FDDI_MAC_LOST_CT`: UInt = 50528832u;
public const val `OID_FDDI_MAC_MA_UNITDATA_AVAILABLE`: UInt = 50528846u;
public const val `OID_FDDI_MAC_MA_UNITDATA_ENABLE`: UInt = 50528848u;
public const val `OID_FDDI_MAC_NOT_COPIED_CT`: UInt = 50528834u;
public const val `OID_FDDI_MAC_NOT_COPIED_FLAG`: UInt = 50528845u;
public const val `OID_FDDI_MAC_NOT_COPIED_RATIO`: UInt = 50528840u;
public const val `OID_FDDI_MAC_NOT_COPIED_THRESHOLD`: UInt = 50528839u;
public const val `OID_FDDI_MAC_OLD_DOWNSTREAM_NBR`: UInt = 50528808u;
public const val `OID_FDDI_MAC_OLD_UPSTREAM_NBR`: UInt = 50528807u;
public const val `OID_FDDI_MAC_REQUESTED_PATHS`: UInt = 50528810u;
public const val `OID_FDDI_MAC_RING_OP_CT`: UInt = 50528836u;
public const val `OID_FDDI_MAC_RMT_STATE`: UInt = 50528841u;
public const val `OID_FDDI_MAC_SHORT_GRP_ADDRESS`: UInt = 50528815u;
public const val `OID_FDDI_MAC_SMT_ADDRESS`: UInt = 50528813u;
public const val `OID_FDDI_MAC_TOKEN_CT`: UInt = 50528830u;
public const val `OID_FDDI_MAC_TRANSMIT_CT`: UInt = 50528829u;
public const val `OID_FDDI_MAC_TVX_CAPABILITY`: UInt = 50528802u;
public const val `OID_FDDI_MAC_TVX_EXPIRED_CT`: UInt = 50528833u;
public const val `OID_FDDI_MAC_TVX_VALUE`: UInt = 50528819u;
public const val `OID_FDDI_MAC_T_MAX`: UInt = 50528818u;
public const val `OID_FDDI_MAC_T_MAX_CAPABILITY`: UInt = 50528801u;
public const val `OID_FDDI_MAC_T_NEG`: UInt = 50528817u;
public const val `OID_FDDI_MAC_T_PRI0`: UInt = 50528820u;
public const val `OID_FDDI_MAC_T_PRI1`: UInt = 50528821u;
public const val `OID_FDDI_MAC_T_PRI2`: UInt = 50528822u;
public const val `OID_FDDI_MAC_T_PRI3`: UInt = 50528823u;
public const val `OID_FDDI_MAC_T_PRI4`: UInt = 50528824u;
public const val `OID_FDDI_MAC_T_PRI5`: UInt = 50528825u;
public const val `OID_FDDI_MAC_T_PRI6`: UInt = 50528826u;
public const val `OID_FDDI_MAC_T_REQ`: UInt = 50528816u;
public const val `OID_FDDI_MAC_UNDA_FLAG`: UInt = 50528843u;
public const val `OID_FDDI_MAC_UPSTREAM_NBR`: UInt = 50528805u;
public const val `OID_FDDI_PATH_CONFIGURATION`: UInt = 50528854u;
public const val `OID_FDDI_PATH_INDEX`: UInt = 50528849u;
public const val `OID_FDDI_PATH_MAX_T_REQ`: UInt = 50528859u;
public const val `OID_FDDI_PATH_RING_LATENCY`: UInt = 50528850u;
public const val `OID_FDDI_PATH_SBA_AVAILABLE`: UInt = 50528856u;
public const val `OID_FDDI_PATH_SBA_OVERHEAD`: UInt = 50528853u;
public const val `OID_FDDI_PATH_SBA_PAYLOAD`: UInt = 50528852u;
public const val `OID_FDDI_PATH_TRACE_STATUS`: UInt = 50528851u;
public const val `OID_FDDI_PATH_TVX_LOWER_BOUND`: UInt = 50528857u;
public const val `OID_FDDI_PATH_T_MAX_LOWER_BOUND`: UInt = 50528858u;
public const val `OID_FDDI_PATH_T_R_MODE`: UInt = 50528855u;
public const val `OID_FDDI_PORT_ACTION`: UInt = 50528888u;
public const val `OID_FDDI_PORT_AVAILABLE_PATHS`: UInt = 50528867u;
public const val `OID_FDDI_PORT_BS_FLAG`: UInt = 50528873u;
public const val `OID_FDDI_PORT_CONNECTION_CAPABILITIES`: UInt = 50528870u;
public const val `OID_FDDI_PORT_CONNECTION_POLICIES`: UInt = 50528862u;
public const val `OID_FDDI_PORT_CONNNECT_STATE`: UInt = 50528882u;
public const val `OID_FDDI_PORT_CURRENT_PATH`: UInt = 50528864u;
public const val `OID_FDDI_PORT_EB_ERROR_CT`: UInt = 50528875u;
public const val `OID_FDDI_PORT_HARDWARE_PRESENT`: UInt = 50528886u;
public const val `OID_FDDI_PORT_INDEX`: UInt = 50528871u;
public const val `OID_FDDI_PORT_LCT_FAIL_CT`: UInt = 50528876u;
public const val `OID_FDDI_PORT_LEM_CT`: UInt = 50528879u;
public const val `OID_FDDI_PORT_LEM_REJECT_CT`: UInt = 50528878u;
public const val `OID_FDDI_PORT_LER_ALARM`: UInt = 50528881u;
public const val `OID_FDDI_PORT_LER_CUTOFF`: UInt = 50528880u;
public const val `OID_FDDI_PORT_LER_ESTIMATE`: UInt = 50528877u;
public const val `OID_FDDI_PORT_LER_FLAG`: UInt = 50528885u;
public const val `OID_FDDI_PORT_MAC_INDICATED`: UInt = 50528863u;
public const val `OID_FDDI_PORT_MAC_LOOP_TIME`: UInt = 50528868u;
public const val `OID_FDDI_PORT_MAC_PLACEMENT`: UInt = 50528866u;
public const val `OID_FDDI_PORT_MAINT_LS`: UInt = 50528872u;
public const val `OID_FDDI_PORT_MY_TYPE`: UInt = 50528860u;
public const val `OID_FDDI_PORT_NEIGHBOR_TYPE`: UInt = 50528861u;
public const val `OID_FDDI_PORT_PCM_STATE`: UInt = 50528883u;
public const val `OID_FDDI_PORT_PC_LS`: UInt = 50528874u;
public const val `OID_FDDI_PORT_PC_WITHHOLD`: UInt = 50528884u;
public const val `OID_FDDI_PORT_PMD_CLASS`: UInt = 50528869u;
public const val `OID_FDDI_PORT_REQUESTED_PATHS`: UInt = 50528865u;
public const val `OID_FDDI_RING_MGT_STATE`: UInt = 50462982u;
public const val `OID_FDDI_SHORT_CURRENT_ADDR`: UInt = 50397446u;
public const val `OID_FDDI_SHORT_MAX_LIST_SIZE`: UInt = 50397448u;
public const val `OID_FDDI_SHORT_MULTICAST_LIST`: UInt = 50397447u;
public const val `OID_FDDI_SHORT_PERMANENT_ADDR`: UInt = 50397445u;
public const val `OID_FDDI_SMT_AVAILABLE_PATHS`: UInt = 50528779u;
public const val `OID_FDDI_SMT_BYPASS_PRESENT`: UInt = 50528788u;
public const val `OID_FDDI_SMT_CF_STATE`: UInt = 50528790u;
public const val `OID_FDDI_SMT_CONFIG_CAPABILITIES`: UInt = 50528780u;
public const val `OID_FDDI_SMT_CONFIG_POLICY`: UInt = 50528781u;
public const val `OID_FDDI_SMT_CONNECTION_POLICY`: UInt = 50528782u;
public const val `OID_FDDI_SMT_ECM_STATE`: UInt = 50528789u;
public const val `OID_FDDI_SMT_HI_VERSION_ID`: UInt = 50528771u;
public const val `OID_FDDI_SMT_HOLD_STATE`: UInt = 50528791u;
public const val `OID_FDDI_SMT_LAST_SET_STATION_ID`: UInt = 50528798u;
public const val `OID_FDDI_SMT_LO_VERSION_ID`: UInt = 50528772u;
public const val `OID_FDDI_SMT_MAC_CT`: UInt = 50528776u;
public const val `OID_FDDI_SMT_MAC_INDEXES`: UInt = 50528787u;
public const val `OID_FDDI_SMT_MANUFACTURER_DATA`: UInt = 50528773u;
public const val `OID_FDDI_SMT_MASTER_CT`: UInt = 50528778u;
public const val `OID_FDDI_SMT_MIB_VERSION_ID`: UInt = 50528775u;
public const val `OID_FDDI_SMT_MSG_TIME_STAMP`: UInt = 50528795u;
public const val `OID_FDDI_SMT_NON_MASTER_CT`: UInt = 50528777u;
public const val `OID_FDDI_SMT_OP_VERSION_ID`: UInt = 50528770u;
public const val `OID_FDDI_SMT_PEER_WRAP_FLAG`: UInt = 50528794u;
public const val `OID_FDDI_SMT_PORT_INDEXES`: UInt = 50528786u;
public const val `OID_FDDI_SMT_REMOTE_DISCONNECT_FLAG`: UInt = 50528792u;
public const val `OID_FDDI_SMT_SET_COUNT`: UInt = 50528797u;
public const val `OID_FDDI_SMT_STATION_ACTION`: UInt = 50528887u;
public const val `OID_FDDI_SMT_STATION_ID`: UInt = 50528769u;
public const val `OID_FDDI_SMT_STATION_STATUS`: UInt = 50528793u;
public const val `OID_FDDI_SMT_STAT_RPT_POLICY`: UInt = 50528784u;
public const val `OID_FDDI_SMT_TRACE_MAX_EXPIRATION`: UInt = 50528785u;
public const val `OID_FDDI_SMT_TRANSITION_TIME_STAMP`: UInt = 50528796u;
public const val `OID_FDDI_SMT_T_NOTIFY`: UInt = 50528783u;
public const val `OID_FDDI_SMT_USER_DATA`: UInt = 50528774u;
public const val `OID_FDDI_UPSTREAM_NODE_LONG`: UInt = 50462978u;
public const val `OID_FFP_ADAPTER_STATS`: UInt = 4227990033u;
public const val `OID_FFP_CONTROL`: UInt = 4227924498u;
public const val `OID_FFP_DATA`: UInt = 4227924500u;
public const val `OID_FFP_DRIVER_STATS`: UInt = 4227990032u;
public const val `OID_FFP_FLUSH`: UInt = 4227924497u;
public const val `OID_FFP_PARAMS`: UInt = 4227924499u;
public const val `OID_FFP_SUPPORT`: UInt = 4227924496u;
public const val `OID_GEN_ADMIN_STATUS`: UInt = 66184u;
public const val `OID_GEN_ALIAS`: UInt = 66185u;
public const val `OID_GEN_BROADCAST_BYTES_RCV`: UInt = 131595u;
public const val `OID_GEN_BROADCAST_BYTES_XMIT`: UInt = 131589u;
public const val `OID_GEN_BROADCAST_FRAMES_RCV`: UInt = 131596u;
public const val `OID_GEN_BROADCAST_FRAMES_XMIT`: UInt = 131590u;
public const val `OID_GEN_BYTES_RCV`: UInt = 131609u;
public const val `OID_GEN_BYTES_XMIT`: UInt = 131610u;
public const val `OID_GEN_CO_BYTES_RCV`: UInt = 131591u;
public const val `OID_GEN_CO_BYTES_XMIT`: UInt = 131585u;
public const val `OID_GEN_CO_BYTES_XMIT_OUTSTANDING`: UInt = 131617u;
public const val `OID_GEN_CO_DEVICE_PROFILE`: UInt = 131602u;
public const val `OID_GEN_CO_DRIVER_VERSION`: UInt = 65808u;
public const val `OID_GEN_CO_GET_NETCARD_TIME`: UInt = 131600u;
public const val `OID_GEN_CO_GET_TIME_CAPS`: UInt = 131599u;
public const val `OID_GEN_CO_HARDWARE_STATUS`: UInt = 65794u;
public const val `OID_GEN_CO_LINK_SPEED`: UInt = 65799u;
public const val `OID_GEN_CO_MAC_OPTIONS`: UInt = 65811u;
public const val `OID_GEN_CO_MEDIA_CONNECT_STATUS`: UInt = 65812u;
public const val `OID_GEN_CO_MEDIA_IN_USE`: UInt = 65796u;
public const val `OID_GEN_CO_MEDIA_SUPPORTED`: UInt = 65795u;
public const val `OID_GEN_CO_MINIMUM_LINK_SPEED`: UInt = 131360u;
public const val `OID_GEN_CO_NETCARD_LOAD`: UInt = 131601u;
public const val `OID_GEN_CO_PROTOCOL_OPTIONS`: UInt = 65810u;
public const val `OID_GEN_CO_RCV_CRC_ERROR`: UInt = 131597u;
public const val `OID_GEN_CO_RCV_PDUS_ERROR`: UInt = 131332u;
public const val `OID_GEN_CO_RCV_PDUS_NO_BUFFER`: UInt = 131333u;
public const val `OID_GEN_CO_RCV_PDUS_OK`: UInt = 131330u;
public const val `OID_GEN_CO_SUPPORTED_GUIDS`: UInt = 65815u;
public const val `OID_GEN_CO_SUPPORTED_LIST`: UInt = 65793u;
public const val `OID_GEN_CO_TRANSMIT_QUEUE_LENGTH`: UInt = 131598u;
public const val `OID_GEN_CO_VENDOR_DESCRIPTION`: UInt = 65805u;
public const val `OID_GEN_CO_VENDOR_DRIVER_VERSION`: UInt = 65814u;
public const val `OID_GEN_CO_VENDOR_ID`: UInt = 65804u;
public const val `OID_GEN_CO_XMIT_PDUS_ERROR`: UInt = 131331u;
public const val `OID_GEN_CO_XMIT_PDUS_OK`: UInt = 131329u;
public const val `OID_GEN_CURRENT_LOOKAHEAD`: UInt = 65807u;
public const val `OID_GEN_CURRENT_PACKET_FILTER`: UInt = 65806u;
public const val `OID_GEN_DEVICE_PROFILE`: UInt = 131602u;
public const val `OID_GEN_DIRECTED_BYTES_RCV`: UInt = 131591u;
public const val `OID_GEN_DIRECTED_BYTES_XMIT`: UInt = 131585u;
public const val `OID_GEN_DIRECTED_FRAMES_RCV`: UInt = 131592u;
public const val `OID_GEN_DIRECTED_FRAMES_XMIT`: UInt = 131586u;
public const val `OID_GEN_DISCONTINUITY_TIME`: UInt = 66178u;
public const val `OID_GEN_DRIVER_VERSION`: UInt = 65808u;
public const val `OID_GEN_ENUMERATE_PORTS`: UInt = 66061u;
public const val `OID_GEN_FRIENDLY_NAME`: UInt = 131606u;
public const val `OID_GEN_GET_NETCARD_TIME`: UInt = 131600u;
public const val `OID_GEN_GET_TIME_CAPS`: UInt = 131599u;
public const val `OID_GEN_HARDWARE_STATUS`: UInt = 65794u;
public const val `OID_GEN_HD_SPLIT_CURRENT_CONFIG`: UInt = 66080u;
public const val `OID_GEN_HD_SPLIT_PARAMETERS`: UInt = 66078u;
public const val `OID_GEN_INIT_TIME_MS`: UInt = 131603u;
public const val `OID_GEN_INTERFACE_INFO`: UInt = 66183u;
public const val `OID_GEN_INTERRUPT_MODERATION`: UInt = 66057u;
public const val `OID_GEN_IP_OPER_STATUS`: UInt = 66189u;
public const val `OID_GEN_ISOLATION_PARAMETERS`: UInt = 66304u;
public const val `OID_GEN_LAST_CHANGE`: UInt = 66177u;
public const val `OID_GEN_LINK_PARAMETERS`: UInt = 66056u;
public const val `OID_GEN_LINK_SPEED`: UInt = 65799u;
public const val `OID_GEN_LINK_SPEED_EX`: UInt = 66187u;
public const val `OID_GEN_LINK_STATE`: UInt = 66055u;
public const val `OID_GEN_MACHINE_NAME`: UInt = 66074u;
public const val `OID_GEN_MAC_ADDRESS`: UInt = 66053u;
public const val `OID_GEN_MAC_OPTIONS`: UInt = 65811u;
public const val `OID_GEN_MAXIMUM_FRAME_SIZE`: UInt = 65798u;
public const val `OID_GEN_MAXIMUM_LOOKAHEAD`: UInt = 65797u;
public const val `OID_GEN_MAXIMUM_SEND_PACKETS`: UInt = 65813u;
public const val `OID_GEN_MAXIMUM_TOTAL_SIZE`: UInt = 65809u;
public const val `OID_GEN_MAX_LINK_SPEED`: UInt = 66054u;
public const val `OID_GEN_MEDIA_CAPABILITIES`: UInt = 66049u;
public const val `OID_GEN_MEDIA_CONNECT_STATUS`: UInt = 65812u;
public const val `OID_GEN_MEDIA_CONNECT_STATUS_EX`: UInt = 66186u;
public const val `OID_GEN_MEDIA_DUPLEX_STATE`: UInt = 66188u;
public const val `OID_GEN_MEDIA_IN_USE`: UInt = 65796u;
public const val `OID_GEN_MEDIA_SENSE_COUNTS`: UInt = 131605u;
public const val `OID_GEN_MEDIA_SUPPORTED`: UInt = 65795u;
public const val `OID_GEN_MINIPORT_RESTART_ATTRIBUTES`: UInt = 66077u;
public const val `OID_GEN_MULTICAST_BYTES_RCV`: UInt = 131593u;
public const val `OID_GEN_MULTICAST_BYTES_XMIT`: UInt = 131587u;
public const val `OID_GEN_MULTICAST_FRAMES_RCV`: UInt = 131594u;
public const val `OID_GEN_MULTICAST_FRAMES_XMIT`: UInt = 131588u;
public const val `OID_GEN_NDIS_RESERVED_1`: UInt = 131607u;
public const val `OID_GEN_NDIS_RESERVED_2`: UInt = 131608u;
public const val `OID_GEN_NDIS_RESERVED_3`: UInt = 66058u;
public const val `OID_GEN_NDIS_RESERVED_4`: UInt = 66059u;
public const val `OID_GEN_NDIS_RESERVED_5`: UInt = 66060u;
public const val `OID_GEN_NDIS_RESERVED_6`: UInt = 66066u;
public const val `OID_GEN_NDIS_RESERVED_7`: UInt = 131614u;
public const val `OID_GEN_NETCARD_LOAD`: UInt = 131601u;
public const val `OID_GEN_NETWORK_LAYER_ADDRESSES`: UInt = 65816u;
public const val `OID_GEN_OPERATIONAL_STATUS`: UInt = 66179u;
public const val `OID_GEN_PACKET_MONITOR`: UInt = 66257u;
public const val `OID_GEN_PCI_DEVICE_CUSTOM_PROPERTIES`: UInt = 66065u;
public const val `OID_GEN_PHYSICAL_MEDIUM`: UInt = 66050u;
public const val `OID_GEN_PHYSICAL_MEDIUM_EX`: UInt = 66067u;
public const val `OID_GEN_PORT_AUTHENTICATION_PARAMETERS`: UInt = 66063u;
public const val `OID_GEN_PORT_STATE`: UInt = 66062u;
public const val `OID_GEN_PROMISCUOUS_MODE`: UInt = 66176u;
public const val `OID_GEN_PROTOCOL_OPTIONS`: UInt = 65810u;
public const val `OID_GEN_RCV_CRC_ERROR`: UInt = 131597u;
public const val `OID_GEN_RCV_DISCARDS`: UInt = 131611u;
public const val `OID_GEN_RCV_ERROR`: UInt = 131332u;
public const val `OID_GEN_RCV_LINK_SPEED`: UInt = 66181u;
public const val `OID_GEN_RCV_NO_BUFFER`: UInt = 131333u;
public const val `OID_GEN_RCV_OK`: UInt = 131330u;
public const val `OID_GEN_RECEIVE_BLOCK_SIZE`: UInt = 65803u;
public const val `OID_GEN_RECEIVE_BUFFER_SPACE`: UInt = 65801u;
public const val `OID_GEN_RECEIVE_HASH`: UInt = 66079u;
public const val `OID_GEN_RECEIVE_SCALE_CAPABILITIES`: UInt = 66051u;
public const val `OID_GEN_RECEIVE_SCALE_PARAMETERS`: UInt = 66052u;
public const val `OID_GEN_RECEIVE_SCALE_PARAMETERS_V2`: UInt = 66068u;
public const val `OID_GEN_RESET_COUNTS`: UInt = 131604u;
public const val `OID_GEN_RNDIS_CONFIG_PARAMETER`: UInt = 66075u;
public const val `OID_GEN_RSS_SET_INDIRECTION_TABLE_ENTRIES`: UInt = 66240u;
public const val `OID_GEN_STATISTICS`: UInt = 131334u;
public const val `OID_GEN_SUPPORTED_GUIDS`: UInt = 65815u;
public const val `OID_GEN_SUPPORTED_LIST`: UInt = 65793u;
public const val `OID_GEN_TIMEOUT_DPC_REQUEST_CAPABILITIES`: UInt = 66064u;
public const val `OID_GEN_TRANSMIT_BLOCK_SIZE`: UInt = 65802u;
public const val `OID_GEN_TRANSMIT_BUFFER_SPACE`: UInt = 65800u;
public const val `OID_GEN_TRANSMIT_QUEUE_LENGTH`: UInt = 131598u;
public const val `OID_GEN_TRANSPORT_HEADER_OFFSET`: UInt = 65817u;
public const val `OID_GEN_UNKNOWN_PROTOS`: UInt = 66182u;
public const val `OID_GEN_VENDOR_DESCRIPTION`: UInt = 65805u;
public const val `OID_GEN_VENDOR_DRIVER_VERSION`: UInt = 65814u;
public const val `OID_GEN_VENDOR_ID`: UInt = 65804u;
public const val `OID_GEN_VLAN_ID`: UInt = 66076u;
public const val `OID_GEN_XMIT_DISCARDS`: UInt = 131612u;
public const val `OID_GEN_XMIT_ERROR`: UInt = 131331u;
public const val `OID_GEN_XMIT_LINK_SPEED`: UInt = 66180u;
public const val `OID_GEN_XMIT_OK`: UInt = 131329u;
public const val `OID_GFT_ACTIVATE_FLOW_ENTRIES`: UInt = 66575u;
public const val `OID_GFT_ADD_FLOW_ENTRIES`: UInt = 66572u;
public const val `OID_GFT_ALLOCATE_COUNTERS`: UInt = 66567u;
public const val `OID_GFT_COUNTER_VALUES`: UInt = 66570u;
public const val `OID_GFT_CREATE_LOGICAL_VPORT`: UInt = 66584u;
public const val `OID_GFT_CREATE_TABLE`: UInt = 66564u;
public const val `OID_GFT_CURRENT_CAPABILITIES`: UInt = 66562u;
public const val `OID_GFT_DEACTIVATE_FLOW_ENTRIES`: UInt = 66576u;
public const val `OID_GFT_DELETE_FLOW_ENTRIES`: UInt = 66573u;
public const val `OID_GFT_DELETE_LOGICAL_VPORT`: UInt = 66585u;
public const val `OID_GFT_DELETE_PROFILE`: UInt = 66582u;
public const val `OID_GFT_DELETE_TABLE`: UInt = 66565u;
public const val `OID_GFT_ENUM_COUNTERS`: UInt = 66569u;
public const val `OID_GFT_ENUM_FLOW_ENTRIES`: UInt = 66574u;
public const val `OID_GFT_ENUM_LOGICAL_VPORTS`: UInt = 66586u;
public const val `OID_GFT_ENUM_PROFILES`: UInt = 66581u;
public const val `OID_GFT_ENUM_TABLES`: UInt = 66566u;
public const val `OID_GFT_EXACT_MATCH_PROFILE`: UInt = 66578u;
public const val `OID_GFT_FLOW_ENTRY_PARAMETERS`: UInt = 66577u;
public const val `OID_GFT_FREE_COUNTERS`: UInt = 66568u;
public const val `OID_GFT_GLOBAL_PARAMETERS`: UInt = 66563u;
public const val `OID_GFT_HARDWARE_CAPABILITIES`: UInt = 66561u;
public const val `OID_GFT_HEADER_TRANSPOSITION_PROFILE`: UInt = 66579u;
public const val `OID_GFT_STATISTICS`: UInt = 66571u;
public const val `OID_GFT_VPORT_PARAMETERS`: UInt = 66583u;
public const val `OID_GFT_WILDCARD_MATCH_PROFILE`: UInt = 66580u;
public const val `OID_IP4_OFFLOAD_STATS`: UInt = 4227924489u;
public const val `OID_IP6_OFFLOAD_STATS`: UInt = 4227924490u;
public const val `OID_IRDA_EXTRA_RCV_BOFS`: UInt = 167838208u;
public const val `OID_IRDA_LINK_SPEED`: UInt = 167837955u;
public const val `OID_IRDA_MAX_RECEIVE_WINDOW_SIZE`: UInt = 167838212u;
public const val `OID_IRDA_MAX_SEND_WINDOW_SIZE`: UInt = 167838213u;
public const val `OID_IRDA_MAX_UNICAST_LIST_SIZE`: UInt = 167838211u;
public const val `OID_IRDA_MEDIA_BUSY`: UInt = 167837956u;
public const val `OID_IRDA_RATE_SNIFF`: UInt = 167838209u;
public const val `OID_IRDA_RECEIVING`: UInt = 167837952u;
public const val `OID_IRDA_RESERVED1`: UInt = 167838218u;
public const val `OID_IRDA_RESERVED2`: UInt = 167838223u;
public const val `OID_IRDA_SUPPORTED_SPEEDS`: UInt = 167837954u;
public const val `OID_IRDA_TURNAROUND_TIME`: UInt = 167837953u;
public const val `OID_IRDA_UNICAST_LIST`: UInt = 167838210u;
public const val `OID_KDNET_ADD_PF`: UInt = 131619u;
public const val `OID_KDNET_ENUMERATE_PFS`: UInt = 131618u;
public const val `OID_KDNET_QUERY_PF_INFORMATION`: UInt = 131621u;
public const val `OID_KDNET_REMOVE_PF`: UInt = 131620u;
public const val `OID_LTALK_COLLISIONS`: UInt = 84017666u;
public const val `OID_LTALK_CURRENT_NODE_ID`: UInt = 83951874u;
public const val `OID_LTALK_DEFERS`: UInt = 84017667u;
public const val `OID_LTALK_FCS_ERRORS`: UInt = 84017670u;
public const val `OID_LTALK_IN_BROADCASTS`: UInt = 84017409u;
public const val `OID_LTALK_IN_LENGTH_ERRORS`: UInt = 84017410u;
public const val `OID_LTALK_NO_DATA_ERRORS`: UInt = 84017668u;
public const val `OID_LTALK_OUT_NO_HANDLERS`: UInt = 84017665u;
public const val `OID_LTALK_RANDOM_CTS_ERRORS`: UInt = 84017669u;
public const val `OID_NDK_CONNECTIONS`: UInt = 4228121091u;
public const val `OID_NDK_LOCAL_ENDPOINTS`: UInt = 4228121092u;
public const val `OID_NDK_SET_STATE`: UInt = 4228121089u;
public const val `OID_NDK_STATISTICS`: UInt = 4228121090u;
public const val `OID_NIC_SWITCH_ALLOCATE_VF`: UInt = 66117u;
public const val `OID_NIC_SWITCH_CREATE_SWITCH`: UInt = 66103u;
public const val `OID_NIC_SWITCH_CREATE_VPORT`: UInt = 66113u;
public const val `OID_NIC_SWITCH_CURRENT_CAPABILITIES`: UInt = 66095u;
public const val `OID_NIC_SWITCH_DELETE_SWITCH`: UInt = 66105u;
public const val `OID_NIC_SWITCH_DELETE_VPORT`: UInt = 66116u;
public const val `OID_NIC_SWITCH_ENUM_SWITCHES`: UInt = 66112u;
public const val `OID_NIC_SWITCH_ENUM_VFS`: UInt = 66120u;
public const val `OID_NIC_SWITCH_ENUM_VPORTS`: UInt = 66115u;
public const val `OID_NIC_SWITCH_FREE_VF`: UInt = 66118u;
public const val `OID_NIC_SWITCH_HARDWARE_CAPABILITIES`: UInt = 66094u;
public const val `OID_NIC_SWITCH_PARAMETERS`: UInt = 66104u;
public const val `OID_NIC_SWITCH_VF_PARAMETERS`: UInt = 66119u;
public const val `OID_NIC_SWITCH_VPORT_PARAMETERS`: UInt = 66114u;
public const val `OID_OFFLOAD_ENCAPSULATION`: UInt = 16843018u;
public const val `OID_PACKET_COALESCING_FILTER_MATCH_COUNT`: UInt = 66101u;
public const val `OID_PD_CLOSE_PROVIDER`: UInt = 66818u;
public const val `OID_PD_OPEN_PROVIDER`: UInt = 66817u;
public const val `OID_PD_QUERY_CURRENT_CONFIG`: UInt = 66819u;
public const val `OID_PM_ADD_PROTOCOL_OFFLOAD`: UInt = 4244701453u;
public const val `OID_PM_ADD_WOL_PATTERN`: UInt = 4244701450u;
public const val `OID_PM_CURRENT_CAPABILITIES`: UInt = 4244701447u;
public const val `OID_PM_GET_PROTOCOL_OFFLOAD`: UInt = 4244701454u;
public const val `OID_PM_HARDWARE_CAPABILITIES`: UInt = 4244701448u;
public const val `OID_PM_PARAMETERS`: UInt = 4244701449u;
public const val `OID_PM_PROTOCOL_OFFLOAD_LIST`: UInt = 4244701456u;
public const val `OID_PM_REMOVE_PROTOCOL_OFFLOAD`: UInt = 4244701455u;
public const val `OID_PM_REMOVE_WOL_PATTERN`: UInt = 4244701451u;
public const val `OID_PM_RESERVED_1`: UInt = 4244701457u;
public const val `OID_PM_WOL_PATTERN_LIST`: UInt = 4244701452u;
public const val `OID_PNP_ADD_WAKE_UP_PATTERN`: UInt = 4244701443u;
public const val `OID_PNP_CAPABILITIES`: UInt = 4244701440u;
public const val `OID_PNP_ENABLE_WAKE_UP`: UInt = 4244701446u;
public const val `OID_PNP_QUERY_POWER`: UInt = 4244701442u;
public const val `OID_PNP_REMOVE_WAKE_UP_PATTERN`: UInt = 4244701444u;
public const val `OID_PNP_SET_POWER`: UInt = 4244701441u;
public const val `OID_PNP_WAKE_UP_ERROR`: UInt = 4244767233u;
public const val `OID_PNP_WAKE_UP_OK`: UInt = 4244767232u;
public const val `OID_PNP_WAKE_UP_PATTERN_LIST`: UInt = 4244701445u;
public const val `OID_QOS_CURRENT_CAPABILITIES`: UInt = 4228186114u;
public const val `OID_QOS_HARDWARE_CAPABILITIES`: UInt = 4228186113u;
public const val `OID_QOS_OFFLOAD_CREATE_SQ`: UInt = 67075u;
public const val `OID_QOS_OFFLOAD_CURRENT_CAPABILITIES`: UInt = 67074u;
public const val `OID_QOS_OFFLOAD_DELETE_SQ`: UInt = 67076u;
public const val `OID_QOS_OFFLOAD_ENUM_SQS`: UInt = 67078u;
public const val `OID_QOS_OFFLOAD_HARDWARE_CAPABILITIES`: UInt = 67073u;
public const val `OID_QOS_OFFLOAD_SQ_STATS`: UInt = 67079u;
public const val `OID_QOS_OFFLOAD_UPDATE_SQ`: UInt = 67077u;
public const val `OID_QOS_OPERATIONAL_PARAMETERS`: UInt = 4228186116u;
public const val `OID_QOS_PARAMETERS`: UInt = 4228186115u;
public const val `OID_QOS_REMOTE_PARAMETERS`: UInt = 4228186117u;
public const val `OID_QOS_RESERVED1`: UInt = 4211147008u;
public const val `OID_QOS_RESERVED10`: UInt = 4211147017u;
public const val `OID_QOS_RESERVED11`: UInt = 4211147018u;
public const val `OID_QOS_RESERVED12`: UInt = 4211147019u;
public const val `OID_QOS_RESERVED13`: UInt = 4211147020u;
public const val `OID_QOS_RESERVED14`: UInt = 4211147021u;
public const val `OID_QOS_RESERVED15`: UInt = 4211147022u;
public const val `OID_QOS_RESERVED16`: UInt = 4211147023u;
public const val `OID_QOS_RESERVED17`: UInt = 4211147024u;
public const val `OID_QOS_RESERVED18`: UInt = 4211147025u;
public const val `OID_QOS_RESERVED19`: UInt = 4211147026u;
public const val `OID_QOS_RESERVED2`: UInt = 4211147009u;
public const val `OID_QOS_RESERVED20`: UInt = 4211147027u;
public const val `OID_QOS_RESERVED3`: UInt = 4211147010u;
public const val `OID_QOS_RESERVED4`: UInt = 4211147011u;
public const val `OID_QOS_RESERVED5`: UInt = 4211147012u;
public const val `OID_QOS_RESERVED6`: UInt = 4211147013u;
public const val `OID_QOS_RESERVED7`: UInt = 4211147014u;
public const val `OID_QOS_RESERVED8`: UInt = 4211147015u;
public const val `OID_QOS_RESERVED9`: UInt = 4211147016u;
public const val `OID_RECEIVE_FILTER_ALLOCATE_QUEUE`: UInt = 66083u;
public const val `OID_RECEIVE_FILTER_CLEAR_FILTER`: UInt = 66088u;
public const val `OID_RECEIVE_FILTER_CURRENT_CAPABILITIES`: UInt = 66093u;
public const val `OID_RECEIVE_FILTER_ENUM_FILTERS`: UInt = 66089u;
public const val `OID_RECEIVE_FILTER_ENUM_QUEUES`: UInt = 66085u;
public const val `OID_RECEIVE_FILTER_FREE_QUEUE`: UInt = 66084u;
public const val `OID_RECEIVE_FILTER_GLOBAL_PARAMETERS`: UInt = 66082u;
public const val `OID_RECEIVE_FILTER_HARDWARE_CAPABILITIES`: UInt = 66081u;
public const val `OID_RECEIVE_FILTER_MOVE_FILTER`: UInt = 66096u;
public const val `OID_RECEIVE_FILTER_PARAMETERS`: UInt = 66090u;
public const val `OID_RECEIVE_FILTER_QUEUE_ALLOCATION_COMPLETE`: UInt = 66091u;
public const val `OID_RECEIVE_FILTER_QUEUE_PARAMETERS`: UInt = 66086u;
public const val `OID_RECEIVE_FILTER_SET_FILTER`: UInt = 66087u;
public const val `OID_SRIOV_BAR_RESOURCES`: UInt = 66137u;
public const val `OID_SRIOV_CONFIG_STATE`: UInt = 66145u;
public const val `OID_SRIOV_CURRENT_CAPABILITIES`: UInt = 66128u;
public const val `OID_SRIOV_HARDWARE_CAPABILITIES`: UInt = 66121u;
public const val `OID_SRIOV_OVERLYING_ADAPTER_INFO`: UInt = 66152u;
public const val `OID_SRIOV_PF_LUID`: UInt = 66144u;
public const val `OID_SRIOV_PROBED_BARS`: UInt = 66136u;
public const val `OID_SRIOV_READ_VF_CONFIG_BLOCK`: UInt = 66131u;
public const val `OID_SRIOV_READ_VF_CONFIG_SPACE`: UInt = 66129u;
public const val `OID_SRIOV_RESET_VF`: UInt = 66133u;
public const val `OID_SRIOV_SET_VF_POWER_STATE`: UInt = 66134u;
public const val `OID_SRIOV_VF_INVALIDATE_CONFIG_BLOCK`: UInt = 66153u;
public const val `OID_SRIOV_VF_SERIAL_NUMBER`: UInt = 66146u;
public const val `OID_SRIOV_VF_VENDOR_DEVICE_ID`: UInt = 66135u;
public const val `OID_SRIOV_WRITE_VF_CONFIG_BLOCK`: UInt = 66132u;
public const val `OID_SRIOV_WRITE_VF_CONFIG_SPACE`: UInt = 66130u;
public const val `OID_SWITCH_FEATURE_STATUS_QUERY`: UInt = 66151u;
public const val `OID_SWITCH_NIC_ARRAY`: UInt = 66167u;
public const val `OID_SWITCH_NIC_CONNECT`: UInt = 66171u;
public const val `OID_SWITCH_NIC_CREATE`: UInt = 66170u;
public const val `OID_SWITCH_NIC_DELETE`: UInt = 66173u;
public const val `OID_SWITCH_NIC_DIRECT_REQUEST`: UInt = 66198u;
public const val `OID_SWITCH_NIC_DISCONNECT`: UInt = 66172u;
public const val `OID_SWITCH_NIC_REQUEST`: UInt = 66160u;
public const val `OID_SWITCH_NIC_RESTORE`: UInt = 66194u;
public const val `OID_SWITCH_NIC_RESTORE_COMPLETE`: UInt = 66195u;
public const val `OID_SWITCH_NIC_RESUME`: UInt = 66200u;
public const val `OID_SWITCH_NIC_SAVE`: UInt = 66192u;
public const val `OID_SWITCH_NIC_SAVE_COMPLETE`: UInt = 66193u;
public const val `OID_SWITCH_NIC_SUSPEND`: UInt = 66199u;
public const val `OID_SWITCH_NIC_SUSPENDED_LM_SOURCE_FINISHED`: UInt = 66202u;
public const val `OID_SWITCH_NIC_SUSPENDED_LM_SOURCE_STARTED`: UInt = 66201u;
public const val `OID_SWITCH_NIC_UPDATED`: UInt = 66196u;
public const val `OID_SWITCH_PARAMETERS`: UInt = 66165u;
public const val `OID_SWITCH_PORT_ARRAY`: UInt = 66166u;
public const val `OID_SWITCH_PORT_CREATE`: UInt = 66168u;
public const val `OID_SWITCH_PORT_DELETE`: UInt = 66169u;
public const val `OID_SWITCH_PORT_FEATURE_STATUS_QUERY`: UInt = 66174u;
public const val `OID_SWITCH_PORT_PROPERTY_ADD`: UInt = 66161u;
public const val `OID_SWITCH_PORT_PROPERTY_DELETE`: UInt = 66163u;
public const val `OID_SWITCH_PORT_PROPERTY_ENUM`: UInt = 66164u;
public const val `OID_SWITCH_PORT_PROPERTY_UPDATE`: UInt = 66162u;
public const val `OID_SWITCH_PORT_TEARDOWN`: UInt = 66175u;
public const val `OID_SWITCH_PORT_UPDATED`: UInt = 66197u;
public const val `OID_SWITCH_PROPERTY_ADD`: UInt = 66147u;
public const val `OID_SWITCH_PROPERTY_DELETE`: UInt = 66149u;
public const val `OID_SWITCH_PROPERTY_ENUM`: UInt = 66150u;
public const val `OID_SWITCH_PROPERTY_UPDATE`: UInt = 66148u;
public const val `OID_TAPI_ACCEPT`: UInt = 117637377u;
public const val `OID_TAPI_ANSWER`: UInt = 117637378u;
public const val `OID_TAPI_CLOSE`: UInt = 117637379u;
public const val `OID_TAPI_CLOSE_CALL`: UInt = 117637380u;
public const val `OID_TAPI_CONDITIONAL_MEDIA_DETECTION`: UInt = 117637381u;
public const val `OID_TAPI_CONFIG_DIALOG`: UInt = 117637382u;
public const val `OID_TAPI_DEV_SPECIFIC`: UInt = 117637383u;
public const val `OID_TAPI_DIAL`: UInt = 117637384u;
public const val `OID_TAPI_DROP`: UInt = 117637385u;
public const val `OID_TAPI_GATHER_DIGITS`: UInt = 117637411u;
public const val `OID_TAPI_GET_ADDRESS_CAPS`: UInt = 117637386u;
public const val `OID_TAPI_GET_ADDRESS_ID`: UInt = 117637387u;
public const val `OID_TAPI_GET_ADDRESS_STATUS`: UInt = 117637388u;
public const val `OID_TAPI_GET_CALL_ADDRESS_ID`: UInt = 117637389u;
public const val `OID_TAPI_GET_CALL_INFO`: UInt = 117637390u;
public const val `OID_TAPI_GET_CALL_STATUS`: UInt = 117637391u;
public const val `OID_TAPI_GET_DEV_CAPS`: UInt = 117637392u;
public const val `OID_TAPI_GET_DEV_CONFIG`: UInt = 117637393u;
public const val `OID_TAPI_GET_EXTENSION_ID`: UInt = 117637394u;
public const val `OID_TAPI_GET_ID`: UInt = 117637395u;
public const val `OID_TAPI_GET_LINE_DEV_STATUS`: UInt = 117637396u;
public const val `OID_TAPI_MAKE_CALL`: UInt = 117637397u;
public const val `OID_TAPI_MONITOR_DIGITS`: UInt = 117637412u;
public const val `OID_TAPI_NEGOTIATE_EXT_VERSION`: UInt = 117637398u;
public const val `OID_TAPI_OPEN`: UInt = 117637399u;
public const val `OID_TAPI_PROVIDER_INITIALIZE`: UInt = 117637400u;
public const val `OID_TAPI_PROVIDER_SHUTDOWN`: UInt = 117637401u;
public const val `OID_TAPI_SECURE_CALL`: UInt = 117637402u;
public const val `OID_TAPI_SELECT_EXT_VERSION`: UInt = 117637403u;
public const val `OID_TAPI_SEND_USER_USER_INFO`: UInt = 117637404u;
public const val `OID_TAPI_SET_APP_SPECIFIC`: UInt = 117637405u;
public const val `OID_TAPI_SET_CALL_PARAMS`: UInt = 117637406u;
public const val `OID_TAPI_SET_DEFAULT_MEDIA_DETECTION`: UInt = 117637407u;
public const val `OID_TAPI_SET_DEV_CONFIG`: UInt = 117637408u;
public const val `OID_TAPI_SET_MEDIA_MODE`: UInt = 117637409u;
public const val `OID_TAPI_SET_STATUS_MESSAGES`: UInt = 117637410u;
public const val `OID_TCP4_OFFLOAD_STATS`: UInt = 4227924487u;
public const val `OID_TCP6_OFFLOAD_STATS`: UInt = 4227924488u;
public const val `OID_TCP_CONNECTION_OFFLOAD_CURRENT_CONFIG`: UInt = 4227924494u;
public const val `OID_TCP_CONNECTION_OFFLOAD_HARDWARE_CAPABILITIES`: UInt = 4227924495u;
public const val `OID_TCP_CONNECTION_OFFLOAD_PARAMETERS`: UInt = 4228055553u;
public const val `OID_TCP_OFFLOAD_CURRENT_CONFIG`: UInt = 4227924491u;
public const val `OID_TCP_OFFLOAD_HARDWARE_CAPABILITIES`: UInt = 4227924493u;
public const val `OID_TCP_OFFLOAD_PARAMETERS`: UInt = 4227924492u;
public const val `OID_TCP_RSC_STATISTICS`: UInt = 131613u;
public const val `OID_TCP_SAN_SUPPORT`: UInt = 4227924484u;
public const val `OID_TCP_TASK_IPSEC_ADD_SA`: UInt = 4227924482u;
public const val `OID_TCP_TASK_IPSEC_ADD_UDPESP_SA`: UInt = 4227924485u;
public const val `OID_TCP_TASK_IPSEC_DELETE_SA`: UInt = 4227924483u;
public const val `OID_TCP_TASK_IPSEC_DELETE_UDPESP_SA`: UInt = 4227924486u;
public const val `OID_TCP_TASK_IPSEC_OFFLOAD_V2_ADD_SA`: UInt = 4228055554u;
public const val `OID_TCP_TASK_IPSEC_OFFLOAD_V2_ADD_SA_EX`: UInt = 4228055557u;
public const val `OID_TCP_TASK_IPSEC_OFFLOAD_V2_DELETE_SA`: UInt = 4228055555u;
public const val `OID_TCP_TASK_IPSEC_OFFLOAD_V2_UPDATE_SA`: UInt = 4228055556u;
public const val `OID_TCP_TASK_OFFLOAD`: UInt = 4227924481u;
public const val `OID_TIMESTAMP_CAPABILITY`: UInt = 10485761u;
public const val `OID_TIMESTAMP_CURRENT_CONFIG`: UInt = 10485762u;
public const val `OID_TIMESTAMP_GET_CROSSTIMESTAMP`: UInt = 10485763u;
public const val `OID_TUNNEL_INTERFACE_RELEASE_OID`: UInt = 251724039u;
public const val `OID_TUNNEL_INTERFACE_SET_OID`: UInt = 251724038u;
public const val `OID_VLAN_RESERVED1`: UInt = 66097u;
public const val `OID_VLAN_RESERVED2`: UInt = 66098u;
public const val `OID_VLAN_RESERVED3`: UInt = 66099u;
public const val `OID_VLAN_RESERVED4`: UInt = 66100u;
public const val `OID_WAN_CO_GET_COMP_INFO`: UInt = 67175040u;
public const val `OID_WAN_CO_GET_INFO`: UInt = 67174784u;
public const val `OID_WAN_CO_GET_LINK_INFO`: UInt = 67174786u;
public const val `OID_WAN_CO_GET_STATS_INFO`: UInt = 67175042u;
public const val `OID_WAN_CO_SET_COMP_INFO`: UInt = 67175041u;
public const val `OID_WAN_CO_SET_LINK_INFO`: UInt = 67174785u;
public const val `OID_WAN_CURRENT_ADDRESS`: UInt = 67174658u;
public const val `OID_WAN_GET_BRIDGE_INFO`: UInt = 67174922u;
public const val `OID_WAN_GET_COMP_INFO`: UInt = 67174924u;
public const val `OID_WAN_GET_INFO`: UInt = 67174663u;
public const val `OID_WAN_GET_LINK_INFO`: UInt = 67174665u;
public const val `OID_WAN_GET_STATS_INFO`: UInt = 67174926u;
public const val `OID_WAN_HEADER_FORMAT`: UInt = 67174662u;
public const val `OID_WAN_LINE_COUNT`: UInt = 67174666u;
public const val `OID_WAN_MEDIUM_SUBTYPE`: UInt = 67174661u;
public const val `OID_WAN_PERMANENT_ADDRESS`: UInt = 67174657u;
public const val `OID_WAN_PROTOCOL_CAPS`: UInt = 67174667u;
public const val `OID_WAN_PROTOCOL_TYPE`: UInt = 67174660u;
public const val `OID_WAN_QUALITY_OF_SERVICE`: UInt = 67174659u;
public const val `OID_WAN_SET_BRIDGE_INFO`: UInt = 67174923u;
public const val `OID_WAN_SET_COMP_INFO`: UInt = 67174925u;
public const val `OID_WAN_SET_LINK_INFO`: UInt = 67174664u;
public const val `OID_WWAN_AUTH_CHALLENGE`: UInt = 234946837u;
public const val `OID_WWAN_BASE_STATIONS_INFO`: UInt = 234946888u;
public const val `OID_WWAN_CONNECT`: UInt = 234946828u;
public const val `OID_WWAN_CREATE_MAC`: UInt = 234946854u;
public const val `OID_WWAN_DELETE_MAC`: UInt = 234946855u;
public const val `OID_WWAN_DEVICE_BINDINGS`: UInt = 234946865u;
public const val `OID_WWAN_DEVICE_CAPS`: UInt = 234946817u;
public const val `OID_WWAN_DEVICE_CAPS_EX`: UInt = 234946862u;
public const val `OID_WWAN_DEVICE_RESET`: UInt = 234946887u;
public const val `OID_WWAN_DEVICE_SERVICE_COMMAND`: UInt = 234946840u;
public const val `OID_WWAN_DEVICE_SERVICE_SESSION`: UInt = 234946851u;
public const val `OID_WWAN_DEVICE_SERVICE_SESSION_WRITE`: UInt = 234946852u;
public const val `OID_WWAN_DRIVER_CAPS`: UInt = 234946816u;
public const val `OID_WWAN_ENUMERATE_DEVICE_SERVICES`: UInt = 234946838u;
public const val `OID_WWAN_ENUMERATE_DEVICE_SERVICE_COMMANDS`: UInt = 234946850u;
public const val `OID_WWAN_HOME_PROVIDER`: UInt = 234946822u;
public const val `OID_WWAN_IMS_VOICE_STATE`: UInt = 234946867u;
public const val `OID_WWAN_LOCATION_STATE`: UInt = 234946869u;
public const val `OID_WWAN_LTE_ATTACH_CONFIG`: UInt = 234946882u;
public const val `OID_WWAN_LTE_ATTACH_STATUS`: UInt = 234946883u;
public const val `OID_WWAN_MBIM_VERSION`: UInt = 234946860u;
public const val `OID_WWAN_MODEM_CONFIG_INFO`: UInt = 234946884u;
public const val `OID_WWAN_MODEM_LOGGING_CONFIG`: UInt = 234946891u;
public const val `OID_WWAN_MPDP`: UInt = 234946889u;
public const val `OID_WWAN_NETWORK_BLACKLIST`: UInt = 234946881u;
public const val `OID_WWAN_NETWORK_IDLE_HINT`: UInt = 234946871u;
public const val `OID_WWAN_NETWORK_PARAMS`: UInt = 234946893u;
public const val `OID_WWAN_NITZ`: UInt = 234946870u;
public const val `OID_WWAN_PACKET_SERVICE`: UInt = 234946826u;
public const val `OID_WWAN_PCO`: UInt = 234946885u;
public const val `OID_WWAN_PIN`: UInt = 234946820u;
public const val `OID_WWAN_PIN_EX`: UInt = 234946849u;
public const val `OID_WWAN_PIN_EX2`: UInt = 234946859u;
public const val `OID_WWAN_PIN_LIST`: UInt = 234946821u;
public const val `OID_WWAN_PREFERRED_MULTICARRIER_PROVIDERS`: UInt = 234946853u;
public const val `OID_WWAN_PREFERRED_PROVIDERS`: UInt = 234946823u;
public const val `OID_WWAN_PRESHUTDOWN`: UInt = 234946872u;
public const val `OID_WWAN_PROVISIONED_CONTEXTS`: UInt = 234946829u;
public const val `OID_WWAN_PS_MEDIA_CONFIG`: UInt = 234946878u;
public const val `OID_WWAN_RADIO_STATE`: UInt = 234946819u;
public const val `OID_WWAN_READY_INFO`: UInt = 234946818u;
public const val `OID_WWAN_REGISTER_PARAMS`: UInt = 234946892u;
public const val `OID_WWAN_REGISTER_STATE`: UInt = 234946825u;
public const val `OID_WWAN_REGISTER_STATE_EX`: UInt = 234946866u;
public const val `OID_WWAN_SAR_CONFIG`: UInt = 234946879u;
public const val `OID_WWAN_SAR_TRANSMISSION_STATUS`: UInt = 234946880u;
public const val `OID_WWAN_SERVICE_ACTIVATION`: UInt = 234946830u;
public const val `OID_WWAN_SIGNAL_STATE`: UInt = 234946827u;
public const val `OID_WWAN_SIGNAL_STATE_EX`: UInt = 234946868u;
public const val `OID_WWAN_SLOT_INFO_STATUS`: UInt = 234946864u;
public const val `OID_WWAN_SMS_CONFIGURATION`: UInt = 234946831u;
public const val `OID_WWAN_SMS_DELETE`: UInt = 234946834u;
public const val `OID_WWAN_SMS_READ`: UInt = 234946832u;
public const val `OID_WWAN_SMS_SEND`: UInt = 234946833u;
public const val `OID_WWAN_SMS_STATUS`: UInt = 234946835u;
public const val `OID_WWAN_SUBSCRIBE_DEVICE_SERVICE_EVENTS`: UInt = 234946839u;
public const val `OID_WWAN_SYS_CAPS`: UInt = 234946861u;
public const val `OID_WWAN_SYS_SLOTMAPPINGS`: UInt = 234946863u;
public const val `OID_WWAN_UE_POLICY`: UInt = 234946894u;
public const val `OID_WWAN_UICC_ACCESS_BINARY`: UInt = 234946857u;
public const val `OID_WWAN_UICC_ACCESS_RECORD`: UInt = 234946858u;
public const val `OID_WWAN_UICC_APDU`: UInt = 234946876u;
public const val `OID_WWAN_UICC_APP_LIST`: UInt = 234946890u;
public const val `OID_WWAN_UICC_ATR`: UInt = 234946873u;
public const val `OID_WWAN_UICC_CLOSE_CHANNEL`: UInt = 234946875u;
public const val `OID_WWAN_UICC_FILE_STATUS`: UInt = 234946856u;
public const val `OID_WWAN_UICC_OPEN_CHANNEL`: UInt = 234946874u;
public const val `OID_WWAN_UICC_RESET`: UInt = 234946886u;
public const val `OID_WWAN_UICC_TERMINAL_CAPABILITY`: UInt = 234946877u;
public const val `OID_WWAN_USSD`: UInt = 234946841u;
public const val `OID_WWAN_VENDOR_SPECIFIC`: UInt = 234946836u;
public const val `OID_WWAN_VISIBLE_PROVIDERS`: UInt = 234946824u;
public const val `OID_XBOX_ACC_RESERVED0`: UInt = 4194304000u;
public const val `OriginalNetBufferList`: `NDIS_PER_PACKET_INFO` = 9;
public const val `OriginalPacketInfo`: `NDIS_PER_PACKET_INFO` = 7;
public const val `PD_BUFFER_ATTR_BUILT_IN_DATA_BUFFER`: UInt = 1u;
public const val `PD_BUFFER_FLAG_PARTIAL_PACKET_HEAD`: UInt = 1u;
public const val `PD_BUFFER_MIN_RX_DATA_START_ALIGNMENT`: UInt = 2u;
public const val `PD_BUFFER_MIN_RX_DATA_START_VALUE`: UInt = 32u;
public const val `PD_BUFFER_MIN_TX_DATA_START_ALIGNMENT`: UInt = 2u;
public const val `PERMANENT_VC`: UInt = 1u;
// UNSUPPORTED Rust 4150:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PMKID_CANDIDATE {
//     pub BSSID: [u8; 6],
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 4156:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PMKID_CANDIDATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PNDIS_TIMER_FUNCTION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTCOL_CO_AF_REGISTER_NOTIFY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CL_ADD_PARTY_COMPLETE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`CO_CALL_PARAMETERS`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CL_CALL_CONNECTED` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CL_CLOSE_AF_COMPLETE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CL_CLOSE_CALL_COMPLETE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CL_DEREGISTER_SAP_COMPLETE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CL_DROP_PARTY_COMPLETE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CL_INCOMING_CALL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`CO_CALL_PARAMETERS`>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CL_INCOMING_CALL_QOS_CHANGE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`CO_CALL_PARAMETERS`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CL_INCOMING_CLOSE_CALL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CL_INCOMING_DROP_PARTY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CL_MAKE_CALL_COMPLETE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`CO_CALL_PARAMETERS`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CL_MODIFY_CALL_QOS_COMPLETE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`CO_CALL_PARAMETERS`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CL_OPEN_AF_COMPLETE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CL_REGISTER_SAP_COMPLETE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`CO_SAP`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CM_ACTIVATE_VC_COMPLETE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`CO_CALL_PARAMETERS`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CM_ADD_PARTY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`CO_CALL_PARAMETERS`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CM_CLOSE_AF` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CM_CLOSE_CALL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CM_DEACTIVATE_VC_COMPLETE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CM_DEREGISTER_SAP` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CM_DROP_PARTY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CM_INCOMING_CALL_COMPLETE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`CO_CALL_PARAMETERS`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CM_MAKE_CALL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`CO_CALL_PARAMETERS`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CM_MODIFY_QOS_CALL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`CO_CALL_PARAMETERS`>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CM_OPEN_AF` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`CO_ADDRESS_FAMILY`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CM_REG_SAP` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`CO_SAP`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CO_AF_REGISTER_NOTIFY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`CO_ADDRESS_FAMILY`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CO_CREATE_VC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROTOCOL_CO_DELETE_VC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Int>>>;
public const val `PacketCancelId`: `NDIS_PER_PACKET_INFO` = 8;
public const val `QUERY_CALL_PARAMETERS`: UInt = 4u;
public const val `READABLE_LOCAL_CLOCK`: UInt = 1u;
public const val `RECEIVE_TIME_INDICATION`: UInt = 1u;
public const val `RECEIVE_TIME_INDICATION_CAPABLE`: UInt = 8u;
public const val `RECEIVE_VC`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `REFERENCE` (
    public var `SpinLock`: ULong,
    public var `ReferenceCount`: UShort,
    public var `Closing`: Boolean,
)
public const val `RESERVE_RESOURCES_VC`: UInt = 64u;
public const val `ROUND_DOWN_FLOW`: UInt = 128u;
public const val `ROUND_UP_FLOW`: UInt = 256u;
public const val `STRINGFORMAT_ASCII`: UInt = 1u;
public const val `STRINGFORMAT_BINARY`: UInt = 4u;
public const val `STRINGFORMAT_DBCS`: UInt = 2u;
public const val `STRINGFORMAT_UNICODE`: UInt = 3u;
public const val `ScatterGatherListPacketInfo`: `NDIS_PER_PACKET_INFO` = 5;
public const val `ShortPacketPaddingInfo`: `NDIS_PER_PACKET_INFO` = 11;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `TDI_PNP_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt) -> `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `TDI_REGISTER_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?) -> `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
public const val `TIMED_SEND_CAPABLE`: UInt = 16u;
public const val `TIME_STAMP_CAPABLE`: UInt = 32u;
public const val `TRANSMIT_VC`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRANSPORT_HEADER_OFFSET` (
    public var `ProtocolType`: UShort,
    public var `HeaderOffset`: UShort,
)
public const val `TRUNCATED_HASH_LEN`: UInt = 12u;
public typealias `TR_FILTER` = Long;
public const val `TcpIpChecksumPacketInfo`: `NDIS_PER_PACKET_INFO` = 0;
public const val `TcpLargeSendPacketInfo`: `NDIS_PER_PACKET_INFO` = 2;
public typealias `UDP_ENCAP_TYPE` = Int;
public const val `USE_TIME_STAMPS`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VAR_STRING` (
    public var `ulTotalSize`: UInt,
    public var `ulNeededSize`: UInt,
    public var `ulUsedSize`: UInt,
    public var `ulStringFormat`: UInt,
    public var `ulStringSize`: UInt,
    public var `ulStringOffset`: UInt,
)
public const val `WAN_PROTOCOL_KEEPS_STATS`: UInt = 1u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `W_CO_ACTIVATE_VC_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `W_CO_CREATE_VC_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `W_CO_DEACTIVATE_VC_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `W_CO_DELETE_VC_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Int>>>;
public const val `fNDIS_GUID_ALLOW_READ`: UInt = 32u;
public const val `fNDIS_GUID_ALLOW_WRITE`: UInt = 64u;
public const val `fNDIS_GUID_ANSI_STRING`: UInt = 4u;
public const val `fNDIS_GUID_ARRAY`: UInt = 16u;
public const val `fNDIS_GUID_METHOD`: UInt = 128u;
public const val `fNDIS_GUID_NDIS_RESERVED`: UInt = 256u;
public const val `fNDIS_GUID_SUPPORT_COMMON_HEADER`: UInt = 512u;
public const val `fNDIS_GUID_TO_OID`: UInt = 1u;
public const val `fNDIS_GUID_TO_STATUS`: UInt = 2u;
public const val `fNDIS_GUID_UNICODE_STRING`: UInt = 8u;
public const val `fPACKET_ALLOCATED_BY_NDIS`: UInt = 128u;
public const val `fPACKET_CONTAINS_MEDIA_SPECIFIC_INFO`: UInt = 64u;
public const val `fPACKET_WRAPPER_RESERVED`: UInt = 63u;
