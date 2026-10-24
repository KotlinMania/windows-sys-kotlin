// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltAcknowledgeEcp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltAcknowledgeEcp`(`filter` : `PFLT_FILTER`, `ecpcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltAcquirePushLockExclusive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltAcquirePushLockExclusive`(`pushlock` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltAcquirePushLockExclusiveEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltAcquirePushLockExclusiveEx`(`pushlock` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `flags` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltAcquirePushLockShared; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltAcquirePushLockShared`(`pushlock` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltAcquirePushLockSharedEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltAcquirePushLockSharedEx`(`pushlock` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `flags` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltAcquireResourceExclusive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
public external fun `FltAcquireResourceExclusive`(`resource` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`ERESOURCE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltAcquireResourceShared; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
public external fun `FltAcquireResourceShared`(`resource` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`ERESOURCE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltAddOpenReparseEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltAddOpenReparseEntry`(`filter` : `PFLT_FILTER`, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `openreparseentry` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`OPEN_REPARSE_LIST_ENTRY`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltAdjustDeviceStackSizeForIoRedirection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltAdjustDeviceStackSizeForIoRedirection`(`sourceinstance` : `PFLT_INSTANCE`, `targetinstance` : `PFLT_INSTANCE`, `sourcedevicestacksizemodified` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltAllocateCallbackData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltAllocateCallbackData`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `retnewcallbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FLT_CALLBACK_DATA`>>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltAllocateCallbackDataEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltAllocateCallbackDataEx`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `flags` : UInt, `retnewcallbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FLT_CALLBACK_DATA`>>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltAllocateContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `FltAllocateContext`(`filter` : `PFLT_FILTER`, `contexttype` : UShort, `contextsize` : ULong, `pooltype` : `super`.`super`.`super`.`Foundation`.`POOL_TYPE`, `returnedcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltAllocateDeferredIoWorkItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltAllocateDeferredIoWorkItem`() : `PFLT_DEFERRED_IO_WORKITEM`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltAllocateExtraCreateParameter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltAllocateExtraCreateParameter`(`filter` : `PFLT_FILTER`, `ecptype` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `sizeofcontext` : UInt, `flags` : UInt, `cleanupcallback` : `super`.`PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK`, `pooltag` : UInt, `ecpcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltAllocateExtraCreateParameterFromLookasideList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltAllocateExtraCreateParameterFromLookasideList`(`filter` : `PFLT_FILTER`, `ecptype` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `sizeofcontext` : UInt, `flags` : UInt, `cleanupcallback` : `super`.`PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK`, `lookasidelist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ecpcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltAllocateExtraCreateParameterList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `FltAllocateExtraCreateParameterList`(`filter` : `PFLT_FILTER`, `flags` : UInt, `ecplist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Foundation`.`ECP_LIST`>>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltAllocateFileLock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltAllocateFileLock`(`completelockcallbackdataroutine` : `PFLT_COMPLETE_LOCK_CALLBACK_DATA_ROUTINE`, `unlockroutine` : `super`.`PUNLOCK_ROUTINE`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`FILE_LOCK`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltAllocateGenericWorkItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltAllocateGenericWorkItem`() : `PFLT_GENERIC_WORKITEM`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltAllocatePoolAlignedWithTag; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `FltAllocatePoolAlignedWithTag`(`instance` : `PFLT_INSTANCE`, `pooltype` : `super`.`super`.`super`.`Foundation`.`POOL_TYPE`, `numberofbytes` : ULong, `tag` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltApplyPriorityInfoThread; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `FltApplyPriorityInfoThread`(`inputpriorityinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`IO_PRIORITY_INFO`>?, `outputpriorityinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`IO_PRIORITY_INFO`>?, `thread` : `super`.`super`.`super`.`Foundation`.`PETHREAD`) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltAttachVolume; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltAttachVolume`(`filter` : `PFLT_FILTER`, `volume` : `PFLT_VOLUME`, `instancename` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `retinstance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_INSTANCE`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltAttachVolumeAtAltitude; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltAttachVolumeAtAltitude`(`filter` : `PFLT_FILTER`, `volume` : `PFLT_VOLUME`, `altitude` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `instancename` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `retinstance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_INSTANCE`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltBuildDefaultSecurityDescriptor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FltBuildDefaultSecurityDescriptor`(`securitydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`>?, `desiredaccess` : UInt) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCancelFileOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltCancelFileOpen`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCancelIo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltCancelIo`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCancellableWaitForMultipleObjects; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltCancellableWaitForMultipleObjects`(`count` : UInt, `objectarray` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `waittype` : `super`.`super`.`super`.`super`.`Win32`.`System`.`Kernel`.`WAIT_TYPE`, `timeout` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `waitblockarray` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`KWAIT_BLOCK`>?, `callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCancellableWaitForSingleObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltCancellableWaitForSingleObject`(`object` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `timeout` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCbdqDisable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltCbdqDisable`(`cbdq` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA_QUEUE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCbdqEnable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltCbdqEnable`(`cbdq` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA_QUEUE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCbdqInitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltCbdqInitialize`(`instance` : `PFLT_INSTANCE`, `cbdq` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA_QUEUE`>?, `cbdqinsertio` : `PFLT_CALLBACK_DATA_QUEUE_INSERT_IO`, `cbdqremoveio` : `PFLT_CALLBACK_DATA_QUEUE_REMOVE_IO`, `cbdqpeeknextio` : `PFLT_CALLBACK_DATA_QUEUE_PEEK_NEXT_IO`, `cbdqacquire` : `PFLT_CALLBACK_DATA_QUEUE_ACQUIRE`, `cbdqrelease` : `PFLT_CALLBACK_DATA_QUEUE_RELEASE`, `cbdqcompletecanceledio` : `PFLT_CALLBACK_DATA_QUEUE_COMPLETE_CANCELED_IO`) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCbdqInsertIo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltCbdqInsertIo`(`cbdq` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA_QUEUE`>?, `cbd` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`SystemServices`.`IO_CSQ_IRP_CONTEXT`>?, `insertcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCbdqRemoveIo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltCbdqRemoveIo`(`cbdq` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA_QUEUE`>?, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`SystemServices`.`IO_CSQ_IRP_CONTEXT`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCbdqRemoveNextIo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltCbdqRemoveNextIo`(`cbdq` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA_QUEUE`>?, `peekcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCheckAndGrowNameControl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltCheckAndGrowNameControl`(`namectrl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_NAME_CONTROL`>?, `newsize` : UShort) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCheckLockForReadAccess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltCheckLockForReadAccess`(`filelock` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`FILE_LOCK`>?, `callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCheckLockForWriteAccess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltCheckLockForWriteAccess`(`filelock` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`FILE_LOCK`>?, `callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCheckOplock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltCheckOplock`(`oplock` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `waitcompletionroutine` : `PFLTOPLOCK_WAIT_COMPLETE_ROUTINE`, `prepostcallbackdataroutine` : `PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE`) : `FLT_PREOP_CALLBACK_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCheckOplockEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltCheckOplockEx`(`oplock` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `flags` : UInt, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `waitcompletionroutine` : `PFLTOPLOCK_WAIT_COMPLETE_ROUTINE`, `prepostcallbackdataroutine` : `PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE`) : `FLT_PREOP_CALLBACK_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltClearCallbackDataDirty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltClearCallbackDataDirty`(`data` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltClearCancelCompletion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltClearCancelCompletion`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltClose`(`filehandle` : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCloseClientPort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltCloseClientPort`(`filter` : `PFLT_FILTER`, `clientport` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_PORT`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCloseCommunicationPort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltCloseCommunicationPort`(`serverport` : `PFLT_PORT`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCloseSectionForDataScan; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltCloseSectionForDataScan`(`sectioncontext` : `PFLT_CONTEXT`) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCommitComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `FltCommitComplete`(`instance` : `PFLT_INSTANCE`, `transaction` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`KTRANSACTION`>?, `transactioncontext` : `PFLT_CONTEXT`) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCommitFinalizeComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `FltCommitFinalizeComplete`(`instance` : `PFLT_INSTANCE`, `transaction` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`KTRANSACTION`>?, `transactioncontext` : `PFLT_CONTEXT`) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCompareInstanceAltitudes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltCompareInstanceAltitudes`(`instance1` : `PFLT_INSTANCE`, `instance2` : `PFLT_INSTANCE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCompletePendedPostOperation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltCompletePendedPostOperation`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCompletePendedPreOperation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltCompletePendedPreOperation`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `callbackstatus` : `FLT_PREOP_CALLBACK_STATUS`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCopyOpenReparseList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltCopyOpenReparseList`(`filter` : `PFLT_FILTER`, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `ecplist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`ECP_LIST`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCreateCommunicationPort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
public external fun `FltCreateCommunicationPort`(`filter` : `PFLT_FILTER`, `serverport` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_PORT`>?, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `serverportcookie` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `connectnotifycallback` : `PFLT_CONNECT_NOTIFY`, `disconnectnotifycallback` : `PFLT_DISCONNECT_NOTIFY`, `messagenotifycallback` : `PFLT_MESSAGE_NOTIFY`, `maxconnections` : Int) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCreateFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security", feature = "Win32_System_IO"))]
public external fun `FltCreateFile`(`filter` : `PFLT_FILTER`, `instance` : `PFLT_INSTANCE`, `filehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `iostatusblock` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, `allocationsize` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `fileattributes` : UInt, `shareaccess` : UInt, `createdisposition` : UInt, `createoptions` : UInt, `eabuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ealength` : UInt, `flags` : UInt) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCreateFileEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltCreateFileEx`(`filter` : `PFLT_FILTER`, `instance` : `PFLT_INSTANCE`, `filehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `fileobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `iostatusblock` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, `allocationsize` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `fileattributes` : UInt, `shareaccess` : UInt, `createdisposition` : UInt, `createoptions` : UInt, `eabuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ealength` : UInt, `flags` : UInt) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCreateFileEx2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltCreateFileEx2`(`filter` : `PFLT_FILTER`, `instance` : `PFLT_INSTANCE`, `filehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `fileobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `iostatusblock` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, `allocationsize` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `fileattributes` : UInt, `shareaccess` : UInt, `createdisposition` : UInt, `createoptions` : UInt, `eabuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ealength` : UInt, `flags` : UInt, `drivercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`SystemServices`.`IO_DRIVER_CREATE_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCreateMailslotFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltCreateMailslotFile`(`filter` : `PFLT_FILTER`, `instance` : `PFLT_INSTANCE`, `filehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `fileobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `iostatusblock` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, `createoptions` : UInt, `mailslotquota` : UInt, `maximummessagesize` : UInt, `readtimeout` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `drivercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`SystemServices`.`IO_DRIVER_CREATE_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCreateNamedPipeFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltCreateNamedPipeFile`(`filter` : `PFLT_FILTER`, `instance` : `PFLT_INSTANCE`, `filehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `fileobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `iostatusblock` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, `shareaccess` : UInt, `createdisposition` : UInt, `createoptions` : UInt, `namedpipetype` : UInt, `readmode` : UInt, `completionmode` : UInt, `maximuminstances` : UInt, `inboundquota` : UInt, `outboundquota` : UInt, `defaulttimeout` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `drivercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`SystemServices`.`IO_DRIVER_CREATE_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCreateSectionForDataScan; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltCreateSectionForDataScan`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `sectioncontext` : `PFLT_CONTEXT`, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `maximumsize` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `sectionpageprotection` : UInt, `allocationattributes` : UInt, `flags` : UInt, `sectionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `sectionobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `sectionfilesize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCreateSystemVolumeInformationFolder; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltCreateSystemVolumeInformationFolder`(`instance` : `PFLT_INSTANCE`) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCurrentBatchOplock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltCurrentBatchOplock`(`oplock` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCurrentOplock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltCurrentOplock`(`oplock` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltCurrentOplockH; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltCurrentOplockH`(`oplock` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltDecodeParameters; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltDecodeParameters`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `mdladdresspointer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Foundation`.`MDL`>>>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>>?, `length` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UIntVar>>?, `desiredaccess` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`SystemServices`.`LOCK_OPERATION`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltDeleteContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltDeleteContext`(`context` : `PFLT_CONTEXT`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltDeleteExtraCreateParameterLookasideList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltDeleteExtraCreateParameterLookasideList`(`filter` : `PFLT_FILTER`, `lookaside` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `flags` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltDeleteFileContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltDeleteFileContext`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `oldcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltDeleteInstanceContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltDeleteInstanceContext`(`instance` : `PFLT_INSTANCE`, `oldcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltDeletePushLock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltDeletePushLock`(`pushlock` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltDeleteStreamContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltDeleteStreamContext`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `oldcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltDeleteStreamHandleContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltDeleteStreamHandleContext`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `oldcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltDeleteTransactionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `FltDeleteTransactionContext`(`instance` : `PFLT_INSTANCE`, `transaction` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`KTRANSACTION`>?, `oldcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltDeleteVolumeContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltDeleteVolumeContext`(`filter` : `PFLT_FILTER`, `volume` : `PFLT_VOLUME`, `oldcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltDetachVolume; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltDetachVolume`(`filter` : `PFLT_FILTER`, `volume` : `PFLT_VOLUME`, `instancename` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltDeviceIoControlFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltDeviceIoControlFile`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `iocontrolcode` : UInt, `inputbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `inputbufferlength` : UInt, `outputbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `outputbufferlength` : UInt, `lengthreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltDoCompletionProcessingWhenSafe; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltDoCompletionProcessingWhenSafe`(`data` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `fltobjects` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_RELATED_OBJECTS`>?, `completioncontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `flags` : UInt, `safepostcallback` : `PFLT_POST_OPERATION_CALLBACK`, `retpostoperationstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_POSTOP_CALLBACK_STATUS`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltEnlistInTransaction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `FltEnlistInTransaction`(`instance` : `PFLT_INSTANCE`, `transaction` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`KTRANSACTION`>?, `transactioncontext` : `PFLT_CONTEXT`, `notificationmask` : UInt) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltEnumerateFilterInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_InstallableFileSystems")]
public external fun `FltEnumerateFilterInformation`(`index` : UInt, `informationclass` : `super`.`super`.`super`.`super`.`Win32`.`Storage`.`InstallableFileSystems`.`FILTER_INFORMATION_CLASS`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersize` : UInt, `bytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltEnumerateFilters; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltEnumerateFilters`(`filterlist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_FILTER`>?, `filterlistsize` : UInt, `numberfiltersreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltEnumerateInstanceInformationByDeviceObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_Storage_InstallableFileSystems", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltEnumerateInstanceInformationByDeviceObject`(`deviceobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`DEVICE_OBJECT`>?, `index` : UInt, `informationclass` : `super`.`super`.`super`.`super`.`Win32`.`Storage`.`InstallableFileSystems`.`INSTANCE_INFORMATION_CLASS`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersize` : UInt, `bytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltEnumerateInstanceInformationByFilter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_InstallableFileSystems")]
public external fun `FltEnumerateInstanceInformationByFilter`(`filter` : `PFLT_FILTER`, `index` : UInt, `informationclass` : `super`.`super`.`super`.`super`.`Win32`.`Storage`.`InstallableFileSystems`.`INSTANCE_INFORMATION_CLASS`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersize` : UInt, `bytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltEnumerateInstanceInformationByVolume; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_InstallableFileSystems")]
public external fun `FltEnumerateInstanceInformationByVolume`(`volume` : `PFLT_VOLUME`, `index` : UInt, `informationclass` : `super`.`super`.`super`.`super`.`Win32`.`Storage`.`InstallableFileSystems`.`INSTANCE_INFORMATION_CLASS`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersize` : UInt, `bytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltEnumerateInstanceInformationByVolumeName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_InstallableFileSystems")]
public external fun `FltEnumerateInstanceInformationByVolumeName`(`volumename` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `index` : UInt, `informationclass` : `super`.`super`.`super`.`super`.`Win32`.`Storage`.`InstallableFileSystems`.`INSTANCE_INFORMATION_CLASS`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersize` : UInt, `bytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltEnumerateInstances; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltEnumerateInstances`(`volume` : `PFLT_VOLUME`, `filter` : `PFLT_FILTER`, `instancelist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_INSTANCE`>?, `instancelistsize` : UInt, `numberinstancesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltEnumerateVolumeInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_InstallableFileSystems")]
public external fun `FltEnumerateVolumeInformation`(`filter` : `PFLT_FILTER`, `index` : UInt, `informationclass` : `super`.`super`.`super`.`super`.`Win32`.`Storage`.`InstallableFileSystems`.`FILTER_VOLUME_INFORMATION_CLASS`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersize` : UInt, `bytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltEnumerateVolumes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltEnumerateVolumes`(`filter` : `PFLT_FILTER`, `volumelist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_VOLUME`>?, `volumelistsize` : UInt, `numbervolumesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltFastIoMdlRead; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltFastIoMdlRead`(`initiatinginstance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `fileoffset` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `length` : UInt, `lockkey` : UInt, `mdlchain` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Foundation`.`MDL`>>?, `iostatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltFastIoMdlReadComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltFastIoMdlReadComplete`(`initiatinginstance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `mdlchain` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`MDL`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltFastIoMdlWriteComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltFastIoMdlWriteComplete`(`initiatinginstance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `fileoffset` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `mdlchain` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`MDL`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltFastIoPrepareMdlWrite; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltFastIoPrepareMdlWrite`(`initiatinginstance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `fileoffset` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `length` : UInt, `lockkey` : UInt, `mdlchain` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Foundation`.`MDL`>>?, `iostatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltFindExtraCreateParameter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `FltFindExtraCreateParameter`(`filter` : `PFLT_FILTER`, `ecplist` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`ECP_LIST`>?, `ecptype` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ecpcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `ecpcontextsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltFlushBuffers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltFlushBuffers`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltFlushBuffers2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltFlushBuffers2`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `flushtype` : UInt, `callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltFreeCallbackData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltFreeCallbackData`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltFreeDeferredIoWorkItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltFreeDeferredIoWorkItem`(`fltworkitem` : `PFLT_DEFERRED_IO_WORKITEM`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltFreeExtraCreateParameter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltFreeExtraCreateParameter`(`filter` : `PFLT_FILTER`, `ecpcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltFreeExtraCreateParameterList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `FltFreeExtraCreateParameterList`(`filter` : `PFLT_FILTER`, `ecplist` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`ECP_LIST`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltFreeFileLock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltFreeFileLock`(`filelock` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`FILE_LOCK`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltFreeGenericWorkItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltFreeGenericWorkItem`(`fltworkitem` : `PFLT_GENERIC_WORKITEM`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltFreeOpenReparseList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `FltFreeOpenReparseList`(`filter` : `PFLT_FILTER`, `ecplist` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`ECP_LIST`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltFreePoolAlignedWithTag; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltFreePoolAlignedWithTag`(`instance` : `PFLT_INSTANCE`, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `tag` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltFreeSecurityDescriptor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FltFreeSecurityDescriptor`(`securitydescriptor` : `super`.`super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltFsControlFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltFsControlFile`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `fscontrolcode` : UInt, `inputbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `inputbufferlength` : UInt, `outputbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `outputbufferlength` : UInt, `lengthreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetActivityIdCallbackData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetActivityIdCallbackData`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `guid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetBottomInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltGetBottomInstance`(`volume` : `PFLT_VOLUME`, `instance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_INSTANCE`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetContexts; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetContexts`(`fltobjects` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_RELATED_OBJECTS`>?, `desiredcontexts` : UShort, `contexts` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_RELATED_CONTEXTS`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetContextsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetContextsEx`(`fltobjects` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_RELATED_OBJECTS`>?, `desiredcontexts` : UShort, `contextssize` : ULong, `contexts` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_RELATED_CONTEXTS_EX`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetDestinationFileNameInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetDestinationFileNameInformation`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `rootdirectory` : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `filename` : `windows_sys`.`core`.`PCWSTR`, `filenamelength` : UInt, `nameoptions` : UInt, `retfilenameinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FLT_FILE_NAME_INFORMATION`>>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetDeviceObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetDeviceObject`(`volume` : `PFLT_VOLUME`, `deviceobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Foundation`.`DEVICE_OBJECT`>>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetDiskDeviceObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetDiskDeviceObject`(`volume` : `PFLT_VOLUME`, `diskdeviceobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Foundation`.`DEVICE_OBJECT`>>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetEcpListFromCallbackData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetEcpListFromCallbackData`(`filter` : `PFLT_FILTER`, `callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `ecplist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Foundation`.`ECP_LIST`>>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetFileContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetFileContext`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetFileNameInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetFileNameInformation`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `nameoptions` : UInt, `filenameinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FLT_FILE_NAME_INFORMATION`>>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetFileNameInformationUnsafe; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetFileNameInformationUnsafe`(`fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `instance` : `PFLT_INSTANCE`, `nameoptions` : UInt, `filenameinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FLT_FILE_NAME_INFORMATION`>>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetFileSystemType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_InstallableFileSystems")]
public external fun `FltGetFileSystemType`(`fltobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `filesystemtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Storage`.`InstallableFileSystems`.`FLT_FILESYSTEM_TYPE`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetFilterFromInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltGetFilterFromInstance`(`instance` : `PFLT_INSTANCE`, `retfilter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_FILTER`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetFilterFromName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltGetFilterFromName`(`filtername` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `retfilter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_FILTER`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetFilterInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_InstallableFileSystems")]
public external fun `FltGetFilterInformation`(`filter` : `PFLT_FILTER`, `informationclass` : `super`.`super`.`super`.`super`.`Win32`.`Storage`.`InstallableFileSystems`.`FILTER_INFORMATION_CLASS`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersize` : UInt, `bytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetFsZeroingOffset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetFsZeroingOffset`(`data` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `zeroingoffset` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetInstanceContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltGetInstanceContext`(`instance` : `PFLT_INSTANCE`, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetInstanceInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_InstallableFileSystems")]
public external fun `FltGetInstanceInformation`(`instance` : `PFLT_INSTANCE`, `informationclass` : `super`.`super`.`super`.`super`.`Win32`.`Storage`.`InstallableFileSystems`.`INSTANCE_INFORMATION_CLASS`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersize` : UInt, `bytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetIoAttributionHandleFromCallbackData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetIoAttributionHandleFromCallbackData`(`data` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetIoPriorityHint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetIoPriorityHint`(`data` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) : `super`.`super`.`super`.`Foundation`.`IO_PRIORITY_HINT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetIoPriorityHintFromCallbackData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetIoPriorityHintFromCallbackData`(`data` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) : `super`.`super`.`super`.`Foundation`.`IO_PRIORITY_HINT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetIoPriorityHintFromFileObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetIoPriorityHintFromFileObject`(`fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?) : `super`.`super`.`super`.`Foundation`.`IO_PRIORITY_HINT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetIoPriorityHintFromThread; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `FltGetIoPriorityHintFromThread`(`thread` : `super`.`super`.`super`.`Foundation`.`PETHREAD`) : `super`.`super`.`super`.`Foundation`.`IO_PRIORITY_HINT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetIrpName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltGetIrpName`(`irpmajorcode` : UByte) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetLowerInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltGetLowerInstance`(`currentinstance` : `PFLT_INSTANCE`, `lowerinstance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_INSTANCE`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetNewSystemBufferAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetNewSystemBufferAddress`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetNextExtraCreateParameter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `FltGetNextExtraCreateParameter`(`filter` : `PFLT_FILTER`, `ecplist` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`ECP_LIST`>?, `currentecpcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nextecptype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `nextecpcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `nextecpcontextsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetRequestorProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetRequestorProcess`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) : `super`.`super`.`super`.`Foundation`.`PEPROCESS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetRequestorProcessId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetRequestorProcessId`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetRequestorProcessIdEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetRequestorProcessIdEx`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetRequestorSessionId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetRequestorSessionId`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `sessionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetRoutineAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltGetRoutineAddress`(`fltmgrroutinename` : `windows_sys`.`core`.`PCSTR`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetSectionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetSectionContext`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetStreamContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetStreamContext`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetStreamHandleContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetStreamHandleContext`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetSwappedBufferMdlAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetSwappedBufferMdlAddress`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`MDL`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetTopInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltGetTopInstance`(`volume` : `PFLT_VOLUME`, `instance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_INSTANCE`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetTransactionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `FltGetTransactionContext`(`instance` : `PFLT_INSTANCE`, `transaction` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`KTRANSACTION`>?, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetTunneledName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetTunneledName`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `filenameinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_FILE_NAME_INFORMATION`>?, `rettunneledfilenameinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FLT_FILE_NAME_INFORMATION`>>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetUpperInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltGetUpperInstance`(`currentinstance` : `PFLT_INSTANCE`, `upperinstance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_INSTANCE`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetVolumeContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltGetVolumeContext`(`filter` : `PFLT_FILTER`, `volume` : `PFLT_VOLUME`, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetVolumeFromDeviceObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetVolumeFromDeviceObject`(`filter` : `PFLT_FILTER`, `deviceobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`DEVICE_OBJECT`>?, `retvolume` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_VOLUME`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetVolumeFromFileObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltGetVolumeFromFileObject`(`filter` : `PFLT_FILTER`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `retvolume` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_VOLUME`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetVolumeFromInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltGetVolumeFromInstance`(`instance` : `PFLT_INSTANCE`, `retvolume` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_VOLUME`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetVolumeFromName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltGetVolumeFromName`(`filter` : `PFLT_FILTER`, `volumename` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `retvolume` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_VOLUME`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetVolumeGuidName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltGetVolumeGuidName`(`volume` : `PFLT_VOLUME`, `volumeguidname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `buffersizeneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetVolumeInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_InstallableFileSystems")]
public external fun `FltGetVolumeInformation`(`volume` : `PFLT_VOLUME`, `informationclass` : `super`.`super`.`super`.`super`.`Win32`.`Storage`.`InstallableFileSystems`.`FILTER_VOLUME_INFORMATION_CLASS`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersize` : UInt, `bytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetVolumeInstanceFromName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltGetVolumeInstanceFromName`(`filter` : `PFLT_FILTER`, `volume` : `PFLT_VOLUME`, `instancename` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `retinstance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_INSTANCE`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetVolumeName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltGetVolumeName`(`volume` : `PFLT_VOLUME`, `volumename` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `buffersizeneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltGetVolumeProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltGetVolumeProperties`(`volume` : `PFLT_VOLUME`, `volumeproperties` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_VOLUME_PROPERTIES`>?, `volumepropertieslength` : UInt, `lengthreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltInitExtraCreateParameterLookasideList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltInitExtraCreateParameterLookasideList`(`filter` : `PFLT_FILTER`, `lookaside` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `flags` : UInt, `size` : ULong, `tag` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltInitializeFileLock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltInitializeFileLock`(`filelock` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`FILE_LOCK`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltInitializeOplock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltInitializeOplock`(`oplock` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltInitializePushLock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltInitializePushLock`(`pushlock` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltInsertExtraCreateParameter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `FltInsertExtraCreateParameter`(`filter` : `PFLT_FILTER`, `ecplist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`ECP_LIST`>?, `ecpcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltIs32bitProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltIs32bitProcess`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltIsCallbackDataDirty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltIsCallbackDataDirty`(`data` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltIsDirectory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltIsDirectory`(`fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `instance` : `PFLT_INSTANCE`, `isdirectory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltIsEcpAcknowledged; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltIsEcpAcknowledged`(`filter` : `PFLT_FILTER`, `ecpcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltIsEcpFromUserMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltIsEcpFromUserMode`(`filter` : `PFLT_FILTER`, `ecpcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltIsFltMgrVolumeDeviceObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltIsFltMgrVolumeDeviceObject`(`deviceobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`DEVICE_OBJECT`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltIsIoCanceled; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltIsIoCanceled`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltIsIoRedirectionAllowed; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltIsIoRedirectionAllowed`(`sourceinstance` : `PFLT_INSTANCE`, `targetinstance` : `PFLT_INSTANCE`, `redirectionallowed` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltIsIoRedirectionAllowedForOperation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltIsIoRedirectionAllowedForOperation`(`data` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `targetinstance` : `PFLT_INSTANCE`, `redirectionallowedthisio` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?, `redirectionallowedallio` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltIsOperationSynchronous; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltIsOperationSynchronous`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltIsVolumeSnapshot; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltIsVolumeSnapshot`(`fltobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `issnapshotvolume` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltIsVolumeWritable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltIsVolumeWritable`(`fltobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `iswritable` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltLoadFilter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltLoadFilter`(`filtername` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltLockUserBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltLockUserBuffer`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltNotifyFilterChangeDirectory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltNotifyFilterChangeDirectory`(`notifysync` : `super`.`super`.`super`.`Foundation`.`PNOTIFY_SYNC`, `notifylist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`System`.`Kernel`.`LIST_ENTRY`>?, `fscontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fulldirectoryname` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`System`.`Kernel`.`STRING`>?, `watchtree` : Boolean, `ignorebuffer` : Boolean, `completionfilter` : UInt, `notifycallbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `traversecallback` : `super`.`PCHECK_FOR_TRAVERSE_ACCESS`, `subjectcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`SECURITY_SUBJECT_CONTEXT`>?, `filtercallback` : `super`.`PFILTER_REPORT_CHANGE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltObjectDereference; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltObjectDereference`(`fltobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltObjectReference; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltObjectReference`(`fltobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltOpenVolume; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltOpenVolume`(`instance` : `PFLT_INSTANCE`, `volumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `volumefileobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltOplockBreakH; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltOplockBreakH`(`oplock` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `flags` : UInt, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `waitcompletionroutine` : `PFLTOPLOCK_WAIT_COMPLETE_ROUTINE`, `prepostcallbackdataroutine` : `PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE`) : `FLT_PREOP_CALLBACK_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltOplockBreakToNone; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltOplockBreakToNone`(`oplock` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `waitcompletionroutine` : `PFLTOPLOCK_WAIT_COMPLETE_ROUTINE`, `prepostcallbackdataroutine` : `PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE`) : `FLT_PREOP_CALLBACK_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltOplockBreakToNoneEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltOplockBreakToNoneEx`(`oplock` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `flags` : UInt, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `waitcompletionroutine` : `PFLTOPLOCK_WAIT_COMPLETE_ROUTINE`, `prepostcallbackdataroutine` : `PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE`) : `FLT_PREOP_CALLBACK_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltOplockFsctrl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltOplockFsctrl`(`oplock` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `opencount` : UInt) : `FLT_PREOP_CALLBACK_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltOplockFsctrlEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltOplockFsctrlEx`(`oplock` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `opencount` : UInt, `flags` : UInt) : `FLT_PREOP_CALLBACK_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltOplockIsFastIoPossible; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltOplockIsFastIoPossible`(`oplock` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltOplockIsSharedRequest; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltOplockIsSharedRequest`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltOplockKeysEqual; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltOplockKeysEqual`(`fo1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `fo2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltParseFileName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltParseFileName`(`filename` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `extension` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `stream` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `finalcomponent` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltParseFileNameInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltParseFileNameInformation`(`filenameinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_FILE_NAME_INFORMATION`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltPerformAsynchronousIo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltPerformAsynchronousIo`(`callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `callbackroutine` : `PFLT_COMPLETED_ASYNC_IO_CALLBACK`, `callbackcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltPerformSynchronousIo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltPerformSynchronousIo`(`callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltPrePrepareComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `FltPrePrepareComplete`(`instance` : `PFLT_INSTANCE`, `transaction` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`KTRANSACTION`>?, `transactioncontext` : `PFLT_CONTEXT`) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltPrepareComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `FltPrepareComplete`(`instance` : `PFLT_INSTANCE`, `transaction` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`KTRANSACTION`>?, `transactioncontext` : `PFLT_CONTEXT`) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltPrepareToReuseEcp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltPrepareToReuseEcp`(`filter` : `PFLT_FILTER`, `ecpcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltProcessFileLock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltProcessFileLock`(`filelock` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`FILE_LOCK`>?, `callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `FLT_PREOP_CALLBACK_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltPropagateActivityIdToThread; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltPropagateActivityIdToThread`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `propagateid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `originalid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`GUID`>>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltPropagateIrpExtension; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltPropagateIrpExtension`(`sourcedata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `targetdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `flags` : UInt) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltPurgeFileNameInformationCache; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltPurgeFileNameInformationCache`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltQueryDirectoryFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltQueryDirectoryFile`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `fileinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt, `fileinformationclass` : `super`.`FILE_INFORMATION_CLASS`, `returnsingleentry` : Boolean, `filename` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `restartscan` : Boolean, `lengthreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltQueryDirectoryFileEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltQueryDirectoryFileEx`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `fileinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt, `fileinformationclass` : `super`.`FILE_INFORMATION_CLASS`, `queryflags` : UInt, `filename` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `lengthreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltQueryEaFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltQueryEaFile`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `returnedeadata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt, `returnsingleentry` : Boolean, `ealist` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ealistlength` : UInt, `eaindex` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `restartscan` : Boolean, `lengthreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltQueryInformationByName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO"))]
public external fun `FltQueryInformationByName`(`filter` : `PFLT_FILTER`, `instance` : `PFLT_INSTANCE`, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `iostatusblock` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, `fileinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt, `fileinformationclass` : `super`.`FILE_INFORMATION_CLASS`, `drivercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`SystemServices`.`IO_DRIVER_CREATE_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltQueryInformationFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltQueryInformationFile`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `fileinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt, `fileinformationclass` : `super`.`FILE_INFORMATION_CLASS`, `lengthreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltQueryQuotaInformationFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltQueryQuotaInformationFile`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `iostatusblock` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt, `returnsingleentry` : Boolean, `sidlist` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `sidlistlength` : UInt, `startsid` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `restartscan` : Boolean, `lengthreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltQuerySecurityObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltQuerySecurityObject`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `securityinformation` : UInt, `securitydescriptor` : `super`.`super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`, `length` : UInt, `lengthneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltQueryVolumeInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `FltQueryVolumeInformation`(`instance` : `PFLT_INSTANCE`, `iosb` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, `fsinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt, `fsinformationclass` : `super`.`FS_INFORMATION_CLASS`) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltQueryVolumeInformationFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltQueryVolumeInformationFile`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `fsinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt, `fsinformationclass` : `super`.`FS_INFORMATION_CLASS`, `lengthreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltQueueDeferredIoWorkItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltQueueDeferredIoWorkItem`(`fltworkitem` : `PFLT_DEFERRED_IO_WORKITEM`, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `workerroutine` : `PFLT_DEFERRED_IO_WORKITEM_ROUTINE`, `queuetype` : `super`.`super`.`super`.`System`.`SystemServices`.`WORK_QUEUE_TYPE`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltQueueGenericWorkItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_System_SystemServices")]
public external fun `FltQueueGenericWorkItem`(`fltworkitem` : `PFLT_GENERIC_WORKITEM`, `fltobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `workerroutine` : `PFLT_GENERIC_WORKITEM_ROUTINE`, `queuetype` : `super`.`super`.`super`.`System`.`SystemServices`.`WORK_QUEUE_TYPE`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltReadFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltReadFile`(`initiatinginstance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `byteoffset` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `length` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `flags` : UInt, `bytesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `callbackroutine` : `PFLT_COMPLETED_ASYNC_IO_CALLBACK`, `callbackcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltReadFileEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltReadFileEx`(`initiatinginstance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `byteoffset` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `length` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `flags` : UInt, `bytesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `callbackroutine` : `PFLT_COMPLETED_ASYNC_IO_CALLBACK`, `callbackcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `mdl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`MDL`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltReferenceContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltReferenceContext`(`context` : `PFLT_CONTEXT`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltReferenceFileNameInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltReferenceFileNameInformation`(`filenameinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_FILE_NAME_INFORMATION`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltRegisterFilter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_Storage_InstallableFileSystems", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltRegisterFilter`(`driver` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`DRIVER_OBJECT`>?, `registration` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_REGISTRATION`>?, `retfilter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_FILTER`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltRegisterForDataScan; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltRegisterForDataScan`(`instance` : `PFLT_INSTANCE`) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltReissueSynchronousIo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltReissueSynchronousIo`(`initiatinginstance` : `PFLT_INSTANCE`, `callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltReleaseContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltReleaseContext`(`context` : `PFLT_CONTEXT`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltReleaseContexts; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltReleaseContexts`(`contexts` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_RELATED_CONTEXTS`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltReleaseContextsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltReleaseContextsEx`(`contextssize` : ULong, `contexts` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_RELATED_CONTEXTS_EX`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltReleaseFileNameInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltReleaseFileNameInformation`(`filenameinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_FILE_NAME_INFORMATION`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltReleasePushLock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltReleasePushLock`(`pushlock` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltReleasePushLockEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltReleasePushLockEx`(`pushlock` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `flags` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltReleaseResource; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
public external fun `FltReleaseResource`(`resource` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`ERESOURCE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltRemoveExtraCreateParameter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `FltRemoveExtraCreateParameter`(`filter` : `PFLT_FILTER`, `ecplist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`ECP_LIST`>?, `ecptype` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ecpcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `ecpcontextsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltRemoveOpenReparseEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltRemoveOpenReparseEntry`(`filter` : `PFLT_FILTER`, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `openreparseentry` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`OPEN_REPARSE_LIST_ENTRY`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltRequestFileInfoOnCreateCompletion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltRequestFileInfoOnCreateCompletion`(`filter` : `PFLT_FILTER`, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `infoclassflags` : UInt) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltRequestOperationStatusCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltRequestOperationStatusCallback`(`data` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `callbackroutine` : `PFLT_GET_OPERATION_STATUS_CALLBACK`, `requestercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltRetainSwappedBufferMdlAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltRetainSwappedBufferMdlAddress`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltRetrieveFileInfoOnCreateCompletion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltRetrieveFileInfoOnCreateCompletion`(`filter` : `PFLT_FILTER`, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `infoclass` : UInt, `size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltRetrieveFileInfoOnCreateCompletionEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltRetrieveFileInfoOnCreateCompletionEx`(`filter` : `PFLT_FILTER`, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `infoclass` : UInt, `retinfosize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `retinfobuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltRetrieveIoPriorityInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltRetrieveIoPriorityInfo`(`data` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `thread` : `super`.`super`.`super`.`Foundation`.`PETHREAD`, `priorityinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`IO_PRIORITY_INFO`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltReuseCallbackData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltReuseCallbackData`(`callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltRollbackComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `FltRollbackComplete`(`instance` : `PFLT_INSTANCE`, `transaction` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`KTRANSACTION`>?, `transactioncontext` : `PFLT_CONTEXT`) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltRollbackEnlistment; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `FltRollbackEnlistment`(`instance` : `PFLT_INSTANCE`, `transaction` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`KTRANSACTION`>?, `transactioncontext` : `PFLT_CONTEXT`) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSendMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltSendMessage`(`filter` : `PFLT_FILTER`, `clientport` : /* Rust *const */ kotlinx.cinterop.CPointer<`PFLT_PORT`>?, `senderbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `senderbufferlength` : UInt, `replybuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `replylength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `timeout` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSetActivityIdCallbackData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltSetActivityIdCallbackData`(`callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `guid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSetCallbackDataDirty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltSetCallbackDataDirty`(`data` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSetCancelCompletion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltSetCancelCompletion`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `canceledcallback` : `PFLT_COMPLETE_CANCELED_CALLBACK`) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSetEaFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltSetEaFile`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `eabuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSetEcpListIntoCallbackData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltSetEcpListIntoCallbackData`(`filter` : `PFLT_FILTER`, `callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `ecplist` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`ECP_LIST`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSetFileContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltSetFileContext`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `operation` : `FLT_SET_CONTEXT_OPERATION`, `newcontext` : `PFLT_CONTEXT`, `oldcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSetFsZeroingOffset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltSetFsZeroingOffset`(`data` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `zeroingoffset` : UInt) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSetFsZeroingOffsetRequired; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltSetFsZeroingOffsetRequired`(`data` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSetInformationFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltSetInformationFile`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `fileinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt, `fileinformationclass` : `super`.`FILE_INFORMATION_CLASS`) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSetInstanceContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltSetInstanceContext`(`instance` : `PFLT_INSTANCE`, `operation` : `FLT_SET_CONTEXT_OPERATION`, `newcontext` : `PFLT_CONTEXT`, `oldcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSetIoPriorityHintIntoCallbackData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltSetIoPriorityHintIntoCallbackData`(`data` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `priorityhint` : `super`.`super`.`super`.`Foundation`.`IO_PRIORITY_HINT`) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSetIoPriorityHintIntoFileObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltSetIoPriorityHintIntoFileObject`(`fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `priorityhint` : `super`.`super`.`super`.`Foundation`.`IO_PRIORITY_HINT`) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSetIoPriorityHintIntoThread; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `FltSetIoPriorityHintIntoThread`(`thread` : `super`.`super`.`super`.`Foundation`.`PETHREAD`, `priorityhint` : `super`.`super`.`super`.`Foundation`.`IO_PRIORITY_HINT`) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSetQuotaInformationFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltSetQuotaInformationFile`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSetSecurityObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltSetSecurityObject`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `securityinformation` : UInt, `securitydescriptor` : `super`.`super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSetStreamContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltSetStreamContext`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `operation` : `FLT_SET_CONTEXT_OPERATION`, `newcontext` : `PFLT_CONTEXT`, `oldcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSetStreamHandleContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltSetStreamHandleContext`(`instance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `operation` : `FLT_SET_CONTEXT_OPERATION`, `newcontext` : `PFLT_CONTEXT`, `oldcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSetTransactionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public external fun `FltSetTransactionContext`(`instance` : `PFLT_INSTANCE`, `transaction` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`KTRANSACTION`>?, `operation` : `FLT_SET_CONTEXT_OPERATION`, `newcontext` : `PFLT_CONTEXT`, `oldcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSetVolumeContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltSetVolumeContext`(`volume` : `PFLT_VOLUME`, `operation` : `FLT_SET_CONTEXT_OPERATION`, `newcontext` : `PFLT_CONTEXT`, `oldcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFLT_CONTEXT`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSetVolumeInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `FltSetVolumeInformation`(`instance` : `PFLT_INSTANCE`, `iosb` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, `fsinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt, `fsinformationclass` : `super`.`FS_INFORMATION_CLASS`) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltStartFiltering; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltStartFiltering`(`filter` : `PFLT_FILTER`) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSupportsFileContexts; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltSupportsFileContexts`(`fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSupportsFileContextsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltSupportsFileContextsEx`(`fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `instance` : `PFLT_INSTANCE`) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSupportsStreamContexts; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltSupportsStreamContexts`(`fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltSupportsStreamHandleContexts; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltSupportsStreamHandleContexts`(`fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltTagFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltTagFile`(`initiatinginstance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `filetag` : UInt, `guid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `databuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `databufferlength` : UShort) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltTagFileEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltTagFileEx`(`initiatinginstance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `filetag` : UInt, `guid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `databuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `databufferlength` : UShort, `existingfiletag` : UInt, `existingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `flags` : UInt) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltUninitializeFileLock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltUninitializeFileLock`(`filelock` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`FILE_LOCK`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltUninitializeOplock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltUninitializeOplock`(`oplock` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltUnloadFilter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltUnloadFilter`(`filtername` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltUnregisterFilter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FltUnregisterFilter`(`filter` : `PFLT_FILTER`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltUntagFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltUntagFile`(`initiatinginstance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `filetag` : UInt, `guid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltVetoBypassIo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltVetoBypassIo`(`callbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `fltobjects` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_RELATED_OBJECTS`>?, `operationstatus` : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`, `failurereason` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltWriteFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltWriteFile`(`initiatinginstance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `byteoffset` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `length` : UInt, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `flags` : UInt, `byteswritten` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `callbackroutine` : `PFLT_COMPLETED_ASYNC_IO_CALLBACK`, `callbackcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltWriteFileEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltWriteFileEx`(`initiatinginstance` : `PFLT_INSTANCE`, `fileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `byteoffset` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `length` : UInt, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `flags` : UInt, `byteswritten` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `callbackroutine` : `PFLT_COMPLETED_ASYNC_IO_CALLBACK`, `callbackcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `mdl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`MDL`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fltmgr.sys, ABI=system, export=FltpTraceRedirectedFileIo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public external fun `FltpTraceRedirectedFileIo`(`originatingfileobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, `childcallbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) : `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
public const val `FLTFL_CALLBACK_DATA_DIRTY`: UInt = 2147483648u;
public const val `FLTFL_CALLBACK_DATA_DRAINING_IO`: UInt = 262144u;
public const val `FLTFL_CALLBACK_DATA_FAST_IO_OPERATION`: UInt = 2u;
public const val `FLTFL_CALLBACK_DATA_FS_FILTER_OPERATION`: UInt = 4u;
public const val `FLTFL_CALLBACK_DATA_GENERATED_IO`: UInt = 65536u;
public const val `FLTFL_CALLBACK_DATA_IRP_OPERATION`: UInt = 1u;
public const val `FLTFL_CALLBACK_DATA_NEW_SYSTEM_BUFFER`: UInt = 1048576u;
public const val `FLTFL_CALLBACK_DATA_POST_OPERATION`: UInt = 524288u;
public const val `FLTFL_CALLBACK_DATA_REISSUED_IO`: UInt = 131072u;
public const val `FLTFL_CALLBACK_DATA_REISSUE_MASK`: UInt = 65535u;
public const val `FLTFL_CALLBACK_DATA_SYSTEM_BUFFER`: UInt = 8u;
public const val `FLTFL_CONTEXT_REGISTRATION_NO_EXACT_SIZE_MATCH`: UInt = 1u;
public const val `FLTFL_FILE_NAME_PARSED_EXTENSION`: UInt = 2u;
public const val `FLTFL_FILE_NAME_PARSED_FINAL_COMPONENT`: UInt = 1u;
public const val `FLTFL_FILE_NAME_PARSED_PARENT_DIR`: UInt = 8u;
public const val `FLTFL_FILE_NAME_PARSED_STREAM`: UInt = 4u;
public const val `FLTFL_FILTER_UNLOAD_MANDATORY`: UInt = 1u;
public const val `FLTFL_INSTANCE_SETUP_AUTOMATIC_ATTACHMENT`: UInt = 1u;
public const val `FLTFL_INSTANCE_SETUP_DETACHED_VOLUME`: UInt = 8u;
public const val `FLTFL_INSTANCE_SETUP_MANUAL_ATTACHMENT`: UInt = 2u;
public const val `FLTFL_INSTANCE_SETUP_NEWLY_MOUNTED_VOLUME`: UInt = 4u;
public const val `FLTFL_INSTANCE_TEARDOWN_FILTER_UNLOAD`: UInt = 2u;
public const val `FLTFL_INSTANCE_TEARDOWN_INTERNAL_ERROR`: UInt = 16u;
public const val `FLTFL_INSTANCE_TEARDOWN_MANDATORY_FILTER_UNLOAD`: UInt = 4u;
public const val `FLTFL_INSTANCE_TEARDOWN_MANUAL`: UInt = 1u;
public const val `FLTFL_INSTANCE_TEARDOWN_VOLUME_DISMOUNT`: UInt = 8u;
public const val `FLTFL_IO_OPERATION_DO_NOT_UPDATE_BYTE_OFFSET`: UInt = 4u;
public const val `FLTFL_IO_OPERATION_NON_CACHED`: UInt = 1u;
public const val `FLTFL_IO_OPERATION_PAGING`: UInt = 2u;
public const val `FLTFL_IO_OPERATION_SYNCHRONOUS_PAGING`: UInt = 8u;
public const val `FLTFL_NORMALIZE_NAME_CASE_SENSITIVE`: UInt = 1u;
public const val `FLTFL_NORMALIZE_NAME_DESTINATION_FILE_NAME`: UInt = 2u;
public const val `FLTFL_OPERATION_REGISTRATION_SKIP_CACHED_IO`: UInt = 2u;
public const val `FLTFL_OPERATION_REGISTRATION_SKIP_NON_CACHED_NON_PAGING_IO`: UInt = 8u;
public const val `FLTFL_OPERATION_REGISTRATION_SKIP_NON_DASD_IO`: UInt = 4u;
public const val `FLTFL_OPERATION_REGISTRATION_SKIP_PAGING_IO`: UInt = 1u;
public const val `FLTFL_POST_OPERATION_DRAINING`: UInt = 1u;
public const val `FLTFL_REGISTRATION_DO_NOT_SUPPORT_SERVICE_STOP`: UInt = 1u;
public const val `FLTFL_REGISTRATION_SUPPORT_DAX_VOLUME`: UInt = 4u;
public const val `FLTFL_REGISTRATION_SUPPORT_NPFS_MSFS`: UInt = 2u;
public const val `FLTFL_REGISTRATION_SUPPORT_WCOS`: UInt = 8u;
public const val `FLTTCFL_AUTO_REPARSE`: UInt = 1u;
public const val `FLT_ALLOCATE_CALLBACK_DATA_PREALLOCATE_ALL_MEMORY`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_CALLBACK_DATA` (
    public var `Flags`: UInt,
    public var `Thread`: `super`.`super`.`super`.`Foundation`.`PETHREAD`,
    public var `Iopb`: /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_IO_PARAMETER_BLOCK`>?,
    public var `IoStatus`: `super`.`super`.`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`,
    public var `TagData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_TAG_DATA_BUFFER`>?,
    public var `Anonymous`: `FLT_CALLBACK_DATA_0`,
    public var `RequestorMode`: Byte,
)
// UNSUPPORTED Rust 506:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_CALLBACK_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 512:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union FLT_CALLBACK_DATA_0 {
//     pub Anonymous: FLT_CALLBACK_DATA_0_0,
//     pub FilterContext: [*mut core::ffi::c_void; 4],
// }

// UNSUPPORTED Rust 519:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_CALLBACK_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 525:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_CALLBACK_DATA_0_0 {
//     pub QueueLinks: super::super::super::super::Win32::System::Kernel::LIST_ENTRY,
//     pub QueueContext: [*mut core::ffi::c_void; 2],
// }

// UNSUPPORTED Rust 532:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_CALLBACK_DATA_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FLT_CALLBACK_DATA_QUEUE` (
    public var `Csq`: `super`.`super`.`super`.`System`.`SystemServices`.`IO_CSQ`,
    public var `Flags`: `FLT_CALLBACK_DATA_QUEUE_FLAGS`,
    public var `Instance`: `PFLT_INSTANCE`,
    public var `InsertIo`: `PFLT_CALLBACK_DATA_QUEUE_INSERT_IO`,
    public var `RemoveIo`: `PFLT_CALLBACK_DATA_QUEUE_REMOVE_IO`,
    public var `PeekNextIo`: `PFLT_CALLBACK_DATA_QUEUE_PEEK_NEXT_IO`,
    public var `Acquire`: `PFLT_CALLBACK_DATA_QUEUE_ACQUIRE`,
    public var `Release`: `PFLT_CALLBACK_DATA_QUEUE_RELEASE`,
    public var `CompleteCanceledIo`: `PFLT_CALLBACK_DATA_QUEUE_COMPLETE_CANCELED_IO`,
)
public typealias `FLT_CALLBACK_DATA_QUEUE_FLAGS` = Int;
public const val `FLT_CONTEXT_END`: UInt = 65535u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_CONTEXT_REGISTRATION` (
    public var `ContextType`: UShort,
    public var `Flags`: UShort,
    public var `ContextCleanupCallback`: `PFLT_CONTEXT_CLEANUP_CALLBACK`,
    public var `Size`: ULong,
    public var `PoolTag`: UInt,
    public var `ContextAllocateCallback`: `PFLT_CONTEXT_ALLOCATE_CALLBACK`,
    public var `ContextFreeCallback`: `PFLT_CONTEXT_FREE_CALLBACK`,
    public var `Reserved1`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 567:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Wdk_Foundation")]
// impl Default for FLT_CONTEXT_REGISTRATION {
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
public class `FLT_CREATEFILE_TARGET_ECP_CONTEXT` (
    public var `Instance`: `PFLT_INSTANCE`,
    public var `Volume`: `PFLT_VOLUME`,
    public var `FileNameInformation`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_FILE_NAME_INFORMATION`>?,
    public var `Flags`: UShort,
)
// UNSUPPORTED Rust 581:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FLT_CREATEFILE_TARGET_ECP_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FLT_FILE_CONTEXT`: UInt = 4u;
public const val `FLT_FILE_NAME_ALLOW_QUERY_ON_REPARSE`: UInt = 67108864u;
public const val `FLT_FILE_NAME_DO_NOT_CACHE`: UInt = 33554432u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FLT_FILE_NAME_INFORMATION` (
    public var `Size`: UShort,
    public var `NamesParsed`: UShort,
    public var `Format`: UInt,
    public var `Name`: `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`,
    public var `Volume`: `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`,
    public var `Share`: `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`,
    public var `Extension`: `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`,
    public var `Stream`: `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`,
    public var `FinalComponent`: `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`,
    public var `ParentDir`: `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`,
)
public const val `FLT_FILE_NAME_NORMALIZED`: UInt = 1u;
public const val `FLT_FILE_NAME_OPENED`: UInt = 2u;
public const val `FLT_FILE_NAME_QUERY_ALWAYS_ALLOW_CACHE_LOOKUP`: UInt = 1024u;
public const val `FLT_FILE_NAME_QUERY_CACHE_ONLY`: UInt = 512u;
public const val `FLT_FILE_NAME_QUERY_DEFAULT`: UInt = 256u;
public const val `FLT_FILE_NAME_QUERY_FILESYSTEM_ONLY`: UInt = 768u;
public const val `FLT_FILE_NAME_REQUEST_FROM_CURRENT_PROVIDER`: UInt = 16777216u;
public const val `FLT_FILE_NAME_SHORT`: UInt = 3u;
public const val `FLT_FLUSH_TYPE_DATA_SYNC_ONLY`: UInt = 8u;
public const val `FLT_FLUSH_TYPE_FILE_DATA_ONLY`: UInt = 2u;
public const val `FLT_FLUSH_TYPE_FLUSH_AND_PURGE`: UInt = 1u;
public const val `FLT_FLUSH_TYPE_NO_SYNC`: UInt = 4u;
public const val `FLT_INSTANCE_CONTEXT`: UInt = 2u;
public const val `FLT_INTERNAL_OPERATION_COUNT`: UInt = 22u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_IO_PARAMETER_BLOCK` (
    public var `IrpFlags`: UInt,
    public var `MajorFunction`: UByte,
    public var `MinorFunction`: UByte,
    public var `OperationFlags`: UByte,
    public var `Reserved`: UByte,
    public var `TargetFileObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?,
    public var `TargetInstance`: `PFLT_INSTANCE`,
    public var `Parameters`: `FLT_PARAMETERS`,
)
// UNSUPPORTED Rust 630:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_IO_PARAMETER_BLOCK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FLT_MAX_DEVICE_REPARSE_ATTEMPTS`: UInt = 64u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FLT_NAME_CONTROL` (
    public var `Name`: `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_OPERATION_REGISTRATION` (
    public var `MajorFunction`: UByte,
    public var `Flags`: UInt,
    public var `PreOperation`: `PFLT_PRE_OPERATION_CALLBACK`,
    public var `PostOperation`: `PFLT_POST_OPERATION_CALLBACK`,
    public var `Reserved1`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 652:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_OPERATION_REGISTRATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 658:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union FLT_PARAMETERS {
//     pub Create: FLT_PARAMETERS_0,
//     pub CreatePipe: FLT_PARAMETERS_1,
//     pub CreateMailslot: FLT_PARAMETERS_2,
//     pub Read: FLT_PARAMETERS_3,
//     pub Write: FLT_PARAMETERS_4,
//     pub QueryFileInformation: FLT_PARAMETERS_5,
//     pub SetFileInformation: FLT_PARAMETERS_6,
//     pub QueryEa: FLT_PARAMETERS_7,
//     pub SetEa: FLT_PARAMETERS_8,
//     pub QueryVolumeInformation: FLT_PARAMETERS_9,
//     pub SetVolumeInformation: FLT_PARAMETERS_10,
//     pub DirectoryControl: FLT_PARAMETERS_11,
//     pub FileSystemControl: FLT_PARAMETERS_12,
//     pub DeviceIoControl: FLT_PARAMETERS_13,
//     pub LockControl: FLT_PARAMETERS_14,
//     pub QuerySecurity: FLT_PARAMETERS_15,
//     pub SetSecurity: FLT_PARAMETERS_16,
//     pub WMI: FLT_PARAMETERS_17,
//     pub QueryQuota: FLT_PARAMETERS_18,
//     pub SetQuota: FLT_PARAMETERS_19,
//     pub Pnp: FLT_PARAMETERS_20,
//     pub AcquireForSectionSynchronization: FLT_PARAMETERS_21,
//     pub AcquireForModifiedPageWriter: FLT_PARAMETERS_22,
//     pub ReleaseForModifiedPageWriter: FLT_PARAMETERS_23,
//     pub QueryOpen: FLT_PARAMETERS_24,
//     pub FastIoCheckIfPossible: FLT_PARAMETERS_25,
//     pub NetworkQueryOpen: FLT_PARAMETERS_26,
//     pub MdlRead: FLT_PARAMETERS_27,
//     pub MdlReadComplete: FLT_PARAMETERS_28,
//     pub PrepareMdlWrite: FLT_PARAMETERS_29,
//     pub MdlWriteComplete: FLT_PARAMETERS_30,
//     pub MountVolume: FLT_PARAMETERS_31,
//     pub Others: FLT_PARAMETERS_32,
// }

// UNSUPPORTED Rust 696:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_22` (
    public var `EndingOffset`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?,
    public var `ResourceToRelease`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Foundation`.`ERESOURCE`>>?,
)
// UNSUPPORTED Rust 709:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_22 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_21` (
    public var `SyncType`: `super`.`FS_FILTER_SECTION_SYNC_TYPE`,
    public var `PageProtection`: UInt,
    public var `OutputInformation`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`FS_FILTER_SECTION_SYNC_OUTPUT`>?,
    public var `Flags`: UInt,
    public var `AllocationAttributes`: UInt,
)
// UNSUPPORTED Rust 725:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_21 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_2` (
    public var `SecurityContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`IO_SECURITY_CONTEXT`>?,
    public var `Options`: UInt,
    public var `Reserved`: UShort,
    public var `ShareAccess`: UShort,
    public var `Parameters`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 741:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_1` (
    public var `SecurityContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`IO_SECURITY_CONTEXT`>?,
    public var `Options`: UInt,
    public var `Reserved`: UShort,
    public var `ShareAccess`: UShort,
    public var `Parameters`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 757:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_0` (
    public var `SecurityContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`IO_SECURITY_CONTEXT`>?,
    public var `Options`: UInt,
    public var `FileAttributes`: UShort,
    public var `ShareAccess`: UShort,
    public var `EaLength`: UInt,
    public var `EaBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `AllocationSize`: Long,
)
// UNSUPPORTED Rust 775:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 781:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union FLT_PARAMETERS_13 {
//     pub Common: FLT_PARAMETERS_13_0,
//     pub Neither: FLT_PARAMETERS_13_1,
//     pub Buffered: FLT_PARAMETERS_13_2,
//     pub Direct: FLT_PARAMETERS_13_3,
//     pub FastIo: FLT_PARAMETERS_13_4,
// }

// UNSUPPORTED Rust 791:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_13 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_13_2` (
    public var `OutputBufferLength`: UInt,
    public var `InputBufferLength`: UInt,
    public var `IoControlCode`: UInt,
    public var `SystemBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 806:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_13_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FLT_PARAMETERS_13_0` (
    public var `OutputBufferLength`: UInt,
    public var `InputBufferLength`: UInt,
    public var `IoControlCode`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_13_3` (
    public var `OutputBufferLength`: UInt,
    public var `InputBufferLength`: UInt,
    public var `IoControlCode`: UInt,
    public var `InputSystemBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `OutputBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `OutputMdlAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`MDL`>?,
)
// UNSUPPORTED Rust 831:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_13_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_13_4` (
    public var `OutputBufferLength`: UInt,
    public var `InputBufferLength`: UInt,
    public var `IoControlCode`: UInt,
    public var `InputBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `OutputBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 847:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_13_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_13_1` (
    public var `OutputBufferLength`: UInt,
    public var `InputBufferLength`: UInt,
    public var `IoControlCode`: UInt,
    public var `InputBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `OutputBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `OutputMdlAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`MDL`>?,
)
// UNSUPPORTED Rust 864:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_13_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 870:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union FLT_PARAMETERS_11 {
//     pub QueryDirectory: FLT_PARAMETERS_11_0,
//     pub NotifyDirectory: FLT_PARAMETERS_11_1,
//     pub NotifyDirectoryEx: FLT_PARAMETERS_11_2,
// }

// UNSUPPORTED Rust 878:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_11 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_11_2` (
    public var `Length`: UInt,
    public var `CompletionFilter`: UInt,
    public var `DirectoryNotifyInformationClass`: `super`.`super`.`super`.`System`.`SystemServices`.`DIRECTORY_NOTIFY_INFORMATION_CLASS`,
    public var `Spare2`: UInt,
    public var `DirectoryBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `MdlAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`MDL`>?,
)
// UNSUPPORTED Rust 895:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_11_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_11_1` (
    public var `Length`: UInt,
    public var `CompletionFilter`: UInt,
    public var `Spare1`: UInt,
    public var `Spare2`: UInt,
    public var `DirectoryBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `MdlAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`MDL`>?,
)
// UNSUPPORTED Rust 912:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_11_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_11_0` (
    public var `Length`: UInt,
    public var `FileName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?,
    public var `FileInformationClass`: `super`.`FILE_INFORMATION_CLASS`,
    public var `FileIndex`: UInt,
    public var `DirectoryBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `MdlAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`MDL`>?,
)
// UNSUPPORTED Rust 929:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_11_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FLT_PARAMETERS_25` (
    public var `FileOffset`: Long,
    public var `Length`: UInt,
    public var `LockKey`: UInt,
    public var `CheckForReadOperation`: Boolean,
)
// UNSUPPORTED Rust 944:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union FLT_PARAMETERS_12 {
//     pub VerifyVolume: FLT_PARAMETERS_12_0,
//     pub Common: FLT_PARAMETERS_12_1,
//     pub Neither: FLT_PARAMETERS_12_2,
//     pub Buffered: FLT_PARAMETERS_12_3,
//     pub Direct: FLT_PARAMETERS_12_4,
// }

// UNSUPPORTED Rust 954:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_12 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_12_3` (
    public var `OutputBufferLength`: UInt,
    public var `InputBufferLength`: UInt,
    public var `FsControlCode`: UInt,
    public var `SystemBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 969:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_12_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FLT_PARAMETERS_12_1` (
    public var `OutputBufferLength`: UInt,
    public var `InputBufferLength`: UInt,
    public var `FsControlCode`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_12_4` (
    public var `OutputBufferLength`: UInt,
    public var `InputBufferLength`: UInt,
    public var `FsControlCode`: UInt,
    public var `InputSystemBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `OutputBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `OutputMdlAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`MDL`>?,
)
// UNSUPPORTED Rust 994:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_12_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_12_2` (
    public var `OutputBufferLength`: UInt,
    public var `InputBufferLength`: UInt,
    public var `FsControlCode`: UInt,
    public var `InputBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `OutputBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `OutputMdlAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`MDL`>?,
)
// UNSUPPORTED Rust 1011:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_12_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_12_0` (
    public var `Vpb`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`VPB`>?,
    public var `DeviceObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`DEVICE_OBJECT`>?,
)
// UNSUPPORTED Rust 1024:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_12_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_14` (
    public var `Length`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?,
    public var `Key`: UInt,
    public var `ByteOffset`: Long,
    public var `ProcessId`: `super`.`super`.`super`.`Foundation`.`PEPROCESS`,
    public var `FailImmediately`: Boolean,
    public var `ExclusiveLock`: Boolean,
)
// UNSUPPORTED Rust 1041:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_14 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_28` (
    public var `MdlChain`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`MDL`>?,
)
// UNSUPPORTED Rust 1053:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_28 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_27` (
    public var `FileOffset`: Long,
    public var `Length`: UInt,
    public var `Key`: UInt,
    public var `MdlChain`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Foundation`.`MDL`>>?,
)
// UNSUPPORTED Rust 1068:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_27 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_30` (
    public var `FileOffset`: Long,
    public var `MdlChain`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`MDL`>?,
)
// UNSUPPORTED Rust 1081:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_30 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FLT_PARAMETERS_31` (
    public var `DeviceType`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_26` (
    public var `Irp`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`IRP`>?,
    public var `NetworkInformation`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`FILE_NETWORK_OPEN_INFORMATION`>?,
)
// UNSUPPORTED Rust 1100:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_26 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_32` (
    public var `Argument1`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Argument2`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Argument3`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Argument4`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Argument5`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Argument6`: Long,
)
// UNSUPPORTED Rust 1117:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1123:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union FLT_PARAMETERS_20 {
//     pub StartDevice: FLT_PARAMETERS_20_0,
//     pub QueryDeviceRelations: FLT_PARAMETERS_20_1,
//     pub QueryInterface: FLT_PARAMETERS_20_2,
//     pub DeviceCapabilities: FLT_PARAMETERS_20_3,
//     pub FilterResourceRequirements: FLT_PARAMETERS_20_4,
//     pub ReadWriteConfig: FLT_PARAMETERS_20_5,
//     pub SetLock: FLT_PARAMETERS_20_6,
//     pub QueryId: FLT_PARAMETERS_20_7,
//     pub QueryDeviceText: FLT_PARAMETERS_20_8,
//     pub UsageNotification: FLT_PARAMETERS_20_9,
// }

// UNSUPPORTED Rust 1138:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_20 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_20_3` (
    public var `Capabilities`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`SystemServices`.`DEVICE_CAPABILITIES`>?,
)
// UNSUPPORTED Rust 1150:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_20_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_20_4` (
    public var `IoResourceRequirementList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`SystemServices`.`IO_RESOURCE_REQUIREMENTS_LIST`>?,
)
// UNSUPPORTED Rust 1162:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_20_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FLT_PARAMETERS_20_1` (
    public var `Type`: `super`.`super`.`super`.`System`.`SystemServices`.`DEVICE_RELATION_TYPE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FLT_PARAMETERS_20_8` (
    public var `DeviceTextType`: `super`.`super`.`super`.`System`.`SystemServices`.`DEVICE_TEXT_TYPE`,
    public var `LocaleId`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FLT_PARAMETERS_20_7` (
    public var `IdType`: `super`.`super`.`super`.`System`.`SystemServices`.`BUS_QUERY_ID_TYPE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_20_2` (
    public var `InterfaceType`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `Size`: UShort,
    public var `Version`: UShort,
    public var `Interface`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`SystemServices`.`INTERFACE`>?,
    public var `InterfaceSpecificData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1197:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_20_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_20_5` (
    public var `WhichSpace`: UInt,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Offset`: UInt,
    public var `Length`: UInt,
)
// UNSUPPORTED Rust 1212:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_20_5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FLT_PARAMETERS_20_6` (
    public var `Lock`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_20_0` (
    public var `AllocatedResources`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`SystemServices`.`CM_RESOURCE_LIST`>?,
    public var `AllocatedResourcesTranslated`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`SystemServices`.`CM_RESOURCE_LIST`>?,
)
// UNSUPPORTED Rust 1231:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_20_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1237:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_20_9 {
//     pub InPath: bool,
//     pub Reserved: [bool; 3],
//     pub Type: super::super::super::System::SystemServices::DEVICE_USAGE_NOTIFICATION_TYPE,
// }

// UNSUPPORTED Rust 1245:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_20_9 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_29` (
    public var `FileOffset`: Long,
    public var `Length`: UInt,
    public var `Key`: UInt,
    public var `MdlChain`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Foundation`.`MDL`>>?,
)
// UNSUPPORTED Rust 1260:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_29 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_7` (
    public var `Length`: UInt,
    public var `EaList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `EaListLength`: UInt,
    public var `EaIndex`: UInt,
    public var `EaBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `MdlAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`MDL`>?,
)
// UNSUPPORTED Rust 1277:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_7 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_5` (
    public var `Length`: UInt,
    public var `FileInformationClass`: `super`.`FILE_INFORMATION_CLASS`,
    public var `InfoBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1291:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_24` (
    public var `Irp`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`IRP`>?,
    public var `FileInformation`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Length`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `FileInformationClass`: `super`.`FILE_INFORMATION_CLASS`,
)
// UNSUPPORTED Rust 1306:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_24 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_18` (
    public var `Length`: UInt,
    public var `StartSid`: `super`.`super`.`super`.`super`.`Win32`.`Security`.`PSID`,
    public var `SidList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`FILE_GET_QUOTA_INFORMATION`>?,
    public var `SidListLength`: UInt,
    public var `QuotaBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `MdlAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`MDL`>?,
)
// UNSUPPORTED Rust 1323:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_18 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_15` (
    public var `SecurityInformation`: UInt,
    public var `Length`: UInt,
    public var `SecurityBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `MdlAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`MDL`>?,
)
// UNSUPPORTED Rust 1338:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_15 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_9` (
    public var `Length`: UInt,
    public var `FsInformationClass`: `super`.`FS_INFORMATION_CLASS`,
    public var `VolumeBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1352:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_9 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_3` (
    public var `Length`: UInt,
    public var `Key`: UInt,
    public var `ByteOffset`: Long,
    public var `ReadBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `MdlAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`MDL`>?,
)
// UNSUPPORTED Rust 1368:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_23` (
    public var `ResourceToRelease`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`ERESOURCE`>?,
)
// UNSUPPORTED Rust 1380:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_23 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_8` (
    public var `Length`: UInt,
    public var `EaBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `MdlAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`MDL`>?,
)
// UNSUPPORTED Rust 1394:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_8 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_6` (
    public var `Length`: UInt,
    public var `FileInformationClass`: `super`.`FILE_INFORMATION_CLASS`,
    public var `ParentOfTarget`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?,
    public var `Anonymous`: `FLT_PARAMETERS_6_0`,
    public var `InfoBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1410:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1416:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union FLT_PARAMETERS_6_0 {
//     pub Anonymous: FLT_PARAMETERS_6_0_0,
//     pub ClusterCount: u32,
//     pub DeleteHandle: super::super::super::super::Win32::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 1424:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_6_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FLT_PARAMETERS_6_0_0` (
    public var `ReplaceIfExists`: Boolean,
    public var `AdvanceOnly`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_19` (
    public var `Length`: UInt,
    public var `QuotaBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `MdlAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`MDL`>?,
)
// UNSUPPORTED Rust 1445:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_19 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_16` (
    public var `SecurityInformation`: UInt,
    public var `SecurityDescriptor`: `super`.`super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`,
)
// UNSUPPORTED Rust 1458:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_16 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_10` (
    public var `Length`: UInt,
    public var `FsInformationClass`: `super`.`FS_INFORMATION_CLASS`,
    public var `VolumeBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1472:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_10 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_17` (
    public var `ProviderId`: ULong,
    public var `DataPath`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `BufferSize`: UInt,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1487:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_17 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_PARAMETERS_4` (
    public var `Length`: UInt,
    public var `Key`: UInt,
    public var `ByteOffset`: Long,
    public var `WriteBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `MdlAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`MDL`>?,
)
// UNSUPPORTED Rust 1503:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FLT_PORT_CONNECT`: UInt = 1u;
public typealias `FLT_POSTOP_CALLBACK_STATUS` = Int;
public const val `FLT_POSTOP_DISALLOW_FSFILTER_IO`: `FLT_POSTOP_CALLBACK_STATUS` = 2;
public const val `FLT_POSTOP_FINISHED_PROCESSING`: `FLT_POSTOP_CALLBACK_STATUS` = 0;
public const val `FLT_POSTOP_MORE_PROCESSING_REQUIRED`: `FLT_POSTOP_CALLBACK_STATUS` = 1;
public typealias `FLT_PREOP_CALLBACK_STATUS` = Int;
public const val `FLT_PREOP_COMPLETE`: `FLT_PREOP_CALLBACK_STATUS` = 4;
public const val `FLT_PREOP_DISALLOW_FASTIO`: `FLT_PREOP_CALLBACK_STATUS` = 3;
public const val `FLT_PREOP_DISALLOW_FSFILTER_IO`: `FLT_PREOP_CALLBACK_STATUS` = 6;
public const val `FLT_PREOP_PENDING`: `FLT_PREOP_CALLBACK_STATUS` = 2;
public const val `FLT_PREOP_SUCCESS_NO_CALLBACK`: `FLT_PREOP_CALLBACK_STATUS` = 1;
public const val `FLT_PREOP_SUCCESS_WITH_CALLBACK`: `FLT_PREOP_CALLBACK_STATUS` = 0;
public const val `FLT_PREOP_SYNCHRONIZE`: `FLT_PREOP_CALLBACK_STATUS` = 5;
public const val `FLT_PUSH_LOCK_DISABLE_AUTO_BOOST`: UInt = 2u;
public const val `FLT_PUSH_LOCK_ENABLE_AUTO_BOOST`: UInt = 1u;
public const val `FLT_PUSH_LOCK_VALID_FLAGS`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_Storage_InstallableFileSystems", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_REGISTRATION` (
    public var `Size`: UShort,
    public var `Version`: UShort,
    public var `Flags`: UInt,
    public var `ContextRegistration`: /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CONTEXT_REGISTRATION`>?,
    public var `OperationRegistration`: /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_OPERATION_REGISTRATION`>?,
    public var `FilterUnloadCallback`: `PFLT_FILTER_UNLOAD_CALLBACK`,
    public var `InstanceSetupCallback`: `PFLT_INSTANCE_SETUP_CALLBACK`,
    public var `InstanceQueryTeardownCallback`: `PFLT_INSTANCE_QUERY_TEARDOWN_CALLBACK`,
    public var `InstanceTeardownStartCallback`: `PFLT_INSTANCE_TEARDOWN_CALLBACK`,
    public var `InstanceTeardownCompleteCallback`: `PFLT_INSTANCE_TEARDOWN_CALLBACK`,
    public var `GenerateFileNameCallback`: `PFLT_GENERATE_FILE_NAME`,
    public var `NormalizeNameComponentCallback`: `PFLT_NORMALIZE_NAME_COMPONENT`,
    public var `NormalizeContextCleanupCallback`: `PFLT_NORMALIZE_CONTEXT_CLEANUP`,
    public var `TransactionNotificationCallback`: `PFLT_TRANSACTION_NOTIFICATION_CALLBACK`,
    public var `NormalizeNameComponentExCallback`: `PFLT_NORMALIZE_NAME_COMPONENT_EX`,
    public var `SectionNotificationCallback`: `PFLT_SECTION_CONFLICT_NOTIFICATION_CALLBACK`,
)
// UNSUPPORTED Rust 1546:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_Storage_InstallableFileSystems", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_REGISTRATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FLT_REGISTRATION_VERSION`: UInt = 515u;
public const val `FLT_REGISTRATION_VERSION_0200`: UInt = 512u;
public const val `FLT_REGISTRATION_VERSION_0201`: UInt = 513u;
public const val `FLT_REGISTRATION_VERSION_0202`: UInt = 514u;
public const val `FLT_REGISTRATION_VERSION_0203`: UInt = 515u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_RELATED_CONTEXTS` (
    public var `VolumeContext`: `PFLT_CONTEXT`,
    public var `InstanceContext`: `PFLT_CONTEXT`,
    public var `FileContext`: `PFLT_CONTEXT`,
    public var `StreamContext`: `PFLT_CONTEXT`,
    public var `StreamHandleContext`: `PFLT_CONTEXT`,
    public var `TransactionContext`: `PFLT_CONTEXT`,
)
// UNSUPPORTED Rust 1567:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FLT_RELATED_CONTEXTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_RELATED_CONTEXTS_EX` (
    public var `VolumeContext`: `PFLT_CONTEXT`,
    public var `InstanceContext`: `PFLT_CONTEXT`,
    public var `FileContext`: `PFLT_CONTEXT`,
    public var `StreamContext`: `PFLT_CONTEXT`,
    public var `StreamHandleContext`: `PFLT_CONTEXT`,
    public var `TransactionContext`: `PFLT_CONTEXT`,
    public var `SectionContext`: `PFLT_CONTEXT`,
)
// UNSUPPORTED Rust 1583:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FLT_RELATED_CONTEXTS_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_RELATED_OBJECTS` (
    public var `Size`: UShort,
    public var `TransactionContext`: UShort,
    public var `Filter`: `PFLT_FILTER`,
    public var `Volume`: `PFLT_VOLUME`,
    public var `Instance`: `PFLT_INSTANCE`,
    public var `FileObject`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?,
    public var `Transaction`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`KTRANSACTION`>?,
)
// UNSUPPORTED Rust 1600:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_RELATED_OBJECTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FLT_SECTION_CONTEXT`: UInt = 64u;
public const val `FLT_SET_CONTEXT_KEEP_IF_EXISTS`: `FLT_SET_CONTEXT_OPERATION` = 1;
public typealias `FLT_SET_CONTEXT_OPERATION` = Int;
public const val `FLT_SET_CONTEXT_REPLACE_IF_EXISTS`: `FLT_SET_CONTEXT_OPERATION` = 0;
public const val `FLT_STREAMHANDLE_CONTEXT`: UInt = 16u;
public const val `FLT_STREAM_CONTEXT`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLT_TAG_DATA_BUFFER` (
    public var `FileTag`: UInt,
    public var `TagDataLength`: UShort,
    public var `UnparsedNameLength`: UShort,
    public var `Anonymous`: `FLT_TAG_DATA_BUFFER_0`,
)
// UNSUPPORTED Rust 1620:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FLT_TAG_DATA_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1625:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FLT_TAG_DATA_BUFFER_0 {
//     pub SymbolicLinkReparseBuffer: FLT_TAG_DATA_BUFFER_0_0,
//     pub MountPointReparseBuffer: FLT_TAG_DATA_BUFFER_0_1,
//     pub GenericReparseBuffer: FLT_TAG_DATA_BUFFER_0_2,
//     pub GenericGUIDReparseBuffer: FLT_TAG_DATA_BUFFER_0_3,
// }

// UNSUPPORTED Rust 1633:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FLT_TAG_DATA_BUFFER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1638:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FLT_TAG_DATA_BUFFER_0_3 {
//     pub TagGuid: windows_sys::core::GUID,
//     pub DataBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 1644:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FLT_TAG_DATA_BUFFER_0_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1649:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FLT_TAG_DATA_BUFFER_0_2 {
//     pub DataBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 1654:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FLT_TAG_DATA_BUFFER_0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1659:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FLT_TAG_DATA_BUFFER_0_1 {
//     pub SubstituteNameOffset: u16,
//     pub SubstituteNameLength: u16,
//     pub PrintNameOffset: u16,
//     pub PrintNameLength: u16,
//     pub PathBuffer: [u16; 1],
// }

// UNSUPPORTED Rust 1668:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FLT_TAG_DATA_BUFFER_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1673:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FLT_TAG_DATA_BUFFER_0_0 {
//     pub SubstituteNameOffset: u16,
//     pub SubstituteNameLength: u16,
//     pub PrintNameOffset: u16,
//     pub PrintNameLength: u16,
//     pub Flags: u32,
//     pub PathBuffer: [u16; 1],
// }

// UNSUPPORTED Rust 1683:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FLT_TAG_DATA_BUFFER_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FLT_TRANSACTION_CONTEXT`: UInt = 32u;
public const val `FLT_VALID_FILE_NAME_FLAGS`: UInt = 4278190080u;
public const val `FLT_VALID_FILE_NAME_FORMATS`: UInt = 255u;
public const val `FLT_VALID_FILE_NAME_QUERY_METHODS`: UInt = 65280u;
public const val `FLT_VOLUME_CONTEXT`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FLT_VOLUME_PROPERTIES` (
    public var `DeviceType`: UInt,
    public var `DeviceCharacteristics`: UInt,
    public var `DeviceObjectFlags`: UInt,
    public var `AlignmentRequirement`: UInt,
    public var `SectorSize`: UShort,
    public var `Flags`: UShort,
    public var `FileSystemDriverName`: `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`,
    public var `FileSystemDeviceName`: `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`,
    public var `RealDeviceName`: `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`,
)
// UNSUPPORTED Rust 1706:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_ECP_FLT_CREATEFILE_TARGET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xce08041d_f411_447f_b70d_ccee45c23fac);

public const val `IRP_MJ_ACQUIRE_FOR_CC_FLUSH`: UShort = 65531u;
public const val `IRP_MJ_ACQUIRE_FOR_MOD_WRITE`: UShort = 65533u;
public const val `IRP_MJ_ACQUIRE_FOR_SECTION_SYNCHRONIZATION`: UShort = 65535u;
public const val `IRP_MJ_FAST_IO_CHECK_IF_POSSIBLE`: UShort = 65523u;
public const val `IRP_MJ_MDL_READ`: UShort = 65521u;
public const val `IRP_MJ_MDL_READ_COMPLETE`: UShort = 65520u;
public const val `IRP_MJ_MDL_WRITE_COMPLETE`: UShort = 65518u;
public const val `IRP_MJ_NETWORK_QUERY_OPEN`: UShort = 65522u;
public const val `IRP_MJ_OPERATION_END`: UShort = 128u;
public const val `IRP_MJ_PREPARE_MDL_WRITE`: UShort = 65519u;
public const val `IRP_MJ_QUERY_OPEN`: UShort = 65529u;
public const val `IRP_MJ_RELEASE_FOR_CC_FLUSH`: UShort = 65530u;
public const val `IRP_MJ_RELEASE_FOR_MOD_WRITE`: UShort = 65532u;
public const val `IRP_MJ_RELEASE_FOR_SECTION_SYNCHRONIZATION`: UShort = 65534u;
public const val `IRP_MJ_VOLUME_DISMOUNT`: UShort = 65516u;
public const val `IRP_MJ_VOLUME_MOUNT`: UShort = 65517u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `PFLTOPLOCK_WAIT_COMPLETE_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `PFLT_CALLBACK_DATA_QUEUE_ACQUIRE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA_QUEUE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `PFLT_CALLBACK_DATA_QUEUE_COMPLETE_CANCELED_IO` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA_QUEUE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `PFLT_CALLBACK_DATA_QUEUE_INSERT_IO` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA_QUEUE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `PFLT_CALLBACK_DATA_QUEUE_PEEK_NEXT_IO` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA_QUEUE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `PFLT_CALLBACK_DATA_QUEUE_RELEASE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA_QUEUE`>?, UByte) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `PFLT_CALLBACK_DATA_QUEUE_REMOVE_IO` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA_QUEUE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `PFLT_COMPLETED_ASYNC_IO_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, `PFLT_CONTEXT`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `PFLT_COMPLETE_CANCELED_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `PFLT_COMPLETE_LOCK_CALLBACK_DATA_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) -> `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFLT_CONNECT_NOTIFY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`PFLT_PORT`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFLT_CONTEXT` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Wdk_Foundation")]
public typealias `PFLT_CONTEXT_ALLOCATE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`POOL_TYPE`, ULong, UShort) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFLT_CONTEXT_CLEANUP_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`PFLT_CONTEXT`, UShort) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFLT_CONTEXT_FREE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UShort) -> Unit>>>;
public typealias `PFLT_DEFERRED_IO_WORKITEM` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `PFLT_DEFERRED_IO_WORKITEM_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`PFLT_DEFERRED_IO_WORKITEM`, /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFLT_DISCONNECT_NOTIFY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public typealias `PFLT_FILTER` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFLT_FILTER_UNLOAD_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt) -> `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `PFLT_GENERATE_FILE_NAME` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`PFLT_INSTANCE`, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_NAME_CONTROL`>?) -> `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
public typealias `PFLT_GENERIC_WORKITEM` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFLT_GENERIC_WORKITEM_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`PFLT_GENERIC_WORKITEM`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `PFLT_GET_OPERATION_STATUS_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FLT_RELATED_OBJECTS`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_IO_PARAMETER_BLOCK`>?, `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public typealias `PFLT_INSTANCE` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `PFLT_INSTANCE_QUERY_TEARDOWN_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FLT_RELATED_OBJECTS`>?, UInt) -> `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_Storage_InstallableFileSystems", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `PFLT_INSTANCE_SETUP_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FLT_RELATED_OBJECTS`>?, UInt, UInt, `super`.`super`.`super`.`super`.`Win32`.`Storage`.`InstallableFileSystems`.`FLT_FILESYSTEM_TYPE`) -> `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `PFLT_INSTANCE_TEARDOWN_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FLT_RELATED_OBJECTS`>?, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFLT_MESSAGE_NOTIFY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFLT_NORMALIZE_CONTEXT_CLEANUP` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFLT_NORMALIZE_NAME_COMPONENT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`PFLT_INSTANCE`, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, UShort, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`FILE_NAMES_INFORMATION`>?, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `PFLT_NORMALIZE_NAME_COMPONENT_EX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`PFLT_INSTANCE`, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILE_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, UShort, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`FILE_NAMES_INFORMATION`>?, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
public typealias `PFLT_PORT` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `PFLT_POST_OPERATION_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_RELATED_OBJECTS`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> `FLT_POSTOP_CALLBACK_STATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `PFLT_PRE_OPERATION_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_RELATED_OBJECTS`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `FLT_PREOP_CALLBACK_STATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `PFLT_SECTION_CONFLICT_NOTIFICATION_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`PFLT_INSTANCE`, `PFLT_CONTEXT`, /* Rust *const */ kotlinx.cinterop.CPointer<`FLT_CALLBACK_DATA`>?) -> `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `PFLT_TRANSACTION_NOTIFICATION_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FLT_RELATED_OBJECTS`>?, `PFLT_CONTEXT`, UInt) -> `super`.`super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
public typealias `PFLT_VOLUME` = Long;
public const val `VOL_PROP_FL_DAX_VOLUME`: UInt = 1u;
