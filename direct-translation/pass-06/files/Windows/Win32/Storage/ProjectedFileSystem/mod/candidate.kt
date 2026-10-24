// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=projectedfslib.dll, ABI=system, export=PrjAllocateAlignedBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrjAllocateAlignedBuffer`(`namespacevirtualizationcontext` : `PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT`, `size` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=projectedfslib.dll, ABI=system, export=PrjClearNegativePathCache; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrjClearNegativePathCache`(`namespacevirtualizationcontext` : `PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT`, `totalentrynumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=projectedfslib.dll, ABI=system, export=PrjCompleteCommand; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrjCompleteCommand`(`namespacevirtualizationcontext` : `PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT`, `commandid` : Int, `completionresult` : `windows_sys`.`core`.`HRESULT`, `extendedparameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=projectedfslib.dll, ABI=system, export=PrjDeleteFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrjDeleteFile`(`namespacevirtualizationcontext` : `PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT`, `destinationfilename` : `windows_sys`.`core`.`PCWSTR`, `updateflags` : `PRJ_UPDATE_TYPES`, `failurereason` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PRJ_UPDATE_FAILURE_CAUSES`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=projectedfslib.dll, ABI=system, export=PrjDoesNameContainWildCards; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrjDoesNameContainWildCards`(`filename` : `windows_sys`.`core`.`PCWSTR`) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=projectedfslib.dll, ABI=system, export=PrjFileNameCompare; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrjFileNameCompare`(`filename1` : `windows_sys`.`core`.`PCWSTR`, `filename2` : `windows_sys`.`core`.`PCWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=projectedfslib.dll, ABI=system, export=PrjFileNameMatch; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrjFileNameMatch`(`filenametocheck` : `windows_sys`.`core`.`PCWSTR`, `pattern` : `windows_sys`.`core`.`PCWSTR`) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=projectedfslib.dll, ABI=system, export=PrjFillDirEntryBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrjFillDirEntryBuffer`(`filename` : `windows_sys`.`core`.`PCWSTR`, `filebasicinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRJ_FILE_BASIC_INFO`>?, `direntrybufferhandle` : `PRJ_DIR_ENTRY_BUFFER_HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=projectedfslib.dll, ABI=system, export=PrjFillDirEntryBuffer2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrjFillDirEntryBuffer2`(`direntrybufferhandle` : `PRJ_DIR_ENTRY_BUFFER_HANDLE`, `filename` : `windows_sys`.`core`.`PCWSTR`, `filebasicinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRJ_FILE_BASIC_INFO`>?, `extendedinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRJ_EXTENDED_INFO`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=projectedfslib.dll, ABI=system, export=PrjFreeAlignedBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrjFreeAlignedBuffer`(`buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=projectedfslib.dll, ABI=system, export=PrjGetOnDiskFileState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrjGetOnDiskFileState`(`destinationfilename` : `windows_sys`.`core`.`PCWSTR`, `filestate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PRJ_FILE_STATE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=projectedfslib.dll, ABI=system, export=PrjGetVirtualizationInstanceInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrjGetVirtualizationInstanceInfo`(`namespacevirtualizationcontext` : `PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT`, `virtualizationinstanceinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PRJ_VIRTUALIZATION_INSTANCE_INFO`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=projectedfslib.dll, ABI=system, export=PrjMarkDirectoryAsPlaceholder; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrjMarkDirectoryAsPlaceholder`(`rootpathname` : `windows_sys`.`core`.`PCWSTR`, `targetpathname` : `windows_sys`.`core`.`PCWSTR`, `versioninfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRJ_PLACEHOLDER_VERSION_INFO`>?, `virtualizationinstanceid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=projectedfslib.dll, ABI=system, export=PrjStartVirtualizing; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrjStartVirtualizing`(`virtualizationrootpath` : `windows_sys`.`core`.`PCWSTR`, `callbacks` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRJ_CALLBACKS`>?, `instancecontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `options` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRJ_STARTVIRTUALIZING_OPTIONS`>?, `namespacevirtualizationcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=projectedfslib.dll, ABI=system, export=PrjStopVirtualizing; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrjStopVirtualizing`(`namespacevirtualizationcontext` : `PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=projectedfslib.dll, ABI=system, export=PrjUpdateFileIfNeeded; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrjUpdateFileIfNeeded`(`namespacevirtualizationcontext` : `PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT`, `destinationfilename` : `windows_sys`.`core`.`PCWSTR`, `placeholderinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRJ_PLACEHOLDER_INFO`>?, `placeholderinfosize` : UInt, `updateflags` : `PRJ_UPDATE_TYPES`, `failurereason` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PRJ_UPDATE_FAILURE_CAUSES`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=projectedfslib.dll, ABI=system, export=PrjWriteFileData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrjWriteFileData`(`namespacevirtualizationcontext` : `PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT`, `datastreamid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `byteoffset` : ULong, `length` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=projectedfslib.dll, ABI=system, export=PrjWritePlaceholderInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrjWritePlaceholderInfo`(`namespacevirtualizationcontext` : `PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT`, `destinationfilename` : `windows_sys`.`core`.`PCWSTR`, `placeholderinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRJ_PLACEHOLDER_INFO`>?, `placeholderinfosize` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=projectedfslib.dll, ABI=system, export=PrjWritePlaceholderInfo2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrjWritePlaceholderInfo2`(`namespacevirtualizationcontext` : `PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT`, `destinationfilename` : `windows_sys`.`core`.`PCWSTR`, `placeholderinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRJ_PLACEHOLDER_INFO`>?, `placeholderinfosize` : UInt, `extendedinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`PRJ_EXTENDED_INFO`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PRJ_CALLBACKS` (
    public var `StartDirectoryEnumerationCallback`: `PRJ_START_DIRECTORY_ENUMERATION_CB`,
    public var `EndDirectoryEnumerationCallback`: `PRJ_END_DIRECTORY_ENUMERATION_CB`,
    public var `GetDirectoryEnumerationCallback`: `PRJ_GET_DIRECTORY_ENUMERATION_CB`,
    public var `GetPlaceholderInfoCallback`: `PRJ_GET_PLACEHOLDER_INFO_CB`,
    public var `GetFileDataCallback`: `PRJ_GET_FILE_DATA_CB`,
    public var `QueryFileNameCallback`: `PRJ_QUERY_FILE_NAME_CB`,
    public var `NotificationCallback`: `PRJ_NOTIFICATION_CB`,
    public var `CancelCommandCallback`: `PRJ_CANCEL_COMMAND_CB`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRJ_CALLBACK_DATA` (
    public var `Size`: UInt,
    public var `Flags`: `PRJ_CALLBACK_DATA_FLAGS`,
    public var `NamespaceVirtualizationContext`: `PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT`,
    public var `CommandId`: Int,
    public var `FileId`: `windows_sys`.`core`.`GUID`,
    public var `DataStreamId`: `windows_sys`.`core`.`GUID`,
    public var `FilePathName`: `windows_sys`.`core`.`PCWSTR`,
    public var `VersionInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PRJ_PLACEHOLDER_VERSION_INFO`>?,
    public var `TriggeringProcessId`: UInt,
    public var `TriggeringProcessImageFileName`: `windows_sys`.`core`.`PCWSTR`,
    public var `InstanceContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PRJ_CALLBACK_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PRJ_CALLBACK_DATA`.Companion.`default`() : `PRJ_CALLBACK_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `PRJ_CALLBACK_DATA_FLAGS` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PRJ_CANCEL_COMMAND_CB` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`PRJ_CALLBACK_DATA`>?) -> Unit>>>;
public const val `PRJ_CB_DATA_FLAG_ENUM_RESTART_SCAN`: `PRJ_CALLBACK_DATA_FLAGS` = 1;
public const val `PRJ_CB_DATA_FLAG_ENUM_RETURN_SINGLE_ENTRY`: `PRJ_CALLBACK_DATA_FLAGS` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS` (
    public var `CommandType`: `PRJ_COMPLETE_COMMAND_TYPE`,
    public var `Anonymous`: `PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS`.Companion.`default`() : `PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 67:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS_0 {
//     pub Notification: PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS_0_0,
//     pub Enumeration: PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS_0_1,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS_0`.Companion.`default`() : `PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS_0_1` (
    public var `DirEntryBufferHandle`: `PRJ_DIR_ENTRY_BUFFER_HANDLE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS_0_1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS_0_1`.Companion.`default`() : `PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS_0_1` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS_0_0` (
    public var `NotificationMask`: `PRJ_NOTIFY_TYPES`,
)
public typealias `PRJ_COMPLETE_COMMAND_TYPE` = Int;
public const val `PRJ_COMPLETE_COMMAND_TYPE_ENUMERATION`: `PRJ_COMPLETE_COMMAND_TYPE` = 2;
public const val `PRJ_COMPLETE_COMMAND_TYPE_NOTIFICATION`: `PRJ_COMPLETE_COMMAND_TYPE` = 1;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PRJ_DIR_ENTRY_BUFFER_HANDLE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PRJ_END_DIRECTORY_ENUMERATION_CB` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`PRJ_CALLBACK_DATA`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRJ_EXTENDED_INFO` (
    public var `InfoType`: `PRJ_EXT_INFO_TYPE`,
    public var `NextInfoOffset`: UInt,
    public var `Anonymous`: `PRJ_EXTENDED_INFO_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PRJ_EXTENDED_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PRJ_EXTENDED_INFO`.Companion.`default`() : `PRJ_EXTENDED_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 110:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PRJ_EXTENDED_INFO_0 {
//     pub Symlink: PRJ_EXTENDED_INFO_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PRJ_EXTENDED_INFO_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PRJ_EXTENDED_INFO_0`.Companion.`default`() : `PRJ_EXTENDED_INFO_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRJ_EXTENDED_INFO_0_0` (
    public var `TargetName`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PRJ_EXTENDED_INFO_0_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PRJ_EXTENDED_INFO_0_0`.Companion.`default`() : `PRJ_EXTENDED_INFO_0_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `PRJ_EXT_INFO_TYPE` = Int;
public const val `PRJ_EXT_INFO_TYPE_SYMLINK`: `PRJ_EXT_INFO_TYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PRJ_FILE_BASIC_INFO` (
    public var `IsDirectory`: Boolean,
    public var `FileSize`: Long,
    public var `CreationTime`: Long,
    public var `LastAccessTime`: Long,
    public var `LastWriteTime`: Long,
    public var `ChangeTime`: Long,
    public var `FileAttributes`: UInt,
)
public typealias `PRJ_FILE_STATE` = Int;
public const val `PRJ_FILE_STATE_DIRTY_PLACEHOLDER`: `PRJ_FILE_STATE` = 4;
public const val `PRJ_FILE_STATE_FULL`: `PRJ_FILE_STATE` = 8;
public const val `PRJ_FILE_STATE_HYDRATED_PLACEHOLDER`: `PRJ_FILE_STATE` = 2;
public const val `PRJ_FILE_STATE_PLACEHOLDER`: `PRJ_FILE_STATE` = 1;
public const val `PRJ_FILE_STATE_TOMBSTONE`: `PRJ_FILE_STATE` = 16;
public const val `PRJ_FLAG_NONE`: `PRJ_STARTVIRTUALIZING_FLAGS` = 0;
public const val `PRJ_FLAG_USE_NEGATIVE_PATH_CACHE`: `PRJ_STARTVIRTUALIZING_FLAGS` = 1;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PRJ_GET_DIRECTORY_ENUMERATION_CB` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`PRJ_CALLBACK_DATA`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `windows_sys`.`core`.`PCWSTR`, `PRJ_DIR_ENTRY_BUFFER_HANDLE`) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PRJ_GET_FILE_DATA_CB` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`PRJ_CALLBACK_DATA`>?, ULong, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PRJ_GET_PLACEHOLDER_INFO_CB` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`PRJ_CALLBACK_DATA`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public typealias `PRJ_NOTIFICATION` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PRJ_NOTIFICATION_CB` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`PRJ_CALLBACK_DATA`>?, Boolean, `PRJ_NOTIFICATION`, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`PRJ_NOTIFICATION_PARAMETERS`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `PRJ_NOTIFICATION_FILE_HANDLE_CLOSED_FILE_DELETED`: `PRJ_NOTIFICATION` = 2048;
public const val `PRJ_NOTIFICATION_FILE_HANDLE_CLOSED_FILE_MODIFIED`: `PRJ_NOTIFICATION` = 1024;
public const val `PRJ_NOTIFICATION_FILE_HANDLE_CLOSED_NO_MODIFICATION`: `PRJ_NOTIFICATION` = 512;
public const val `PRJ_NOTIFICATION_FILE_OPENED`: `PRJ_NOTIFICATION` = 2;
public const val `PRJ_NOTIFICATION_FILE_OVERWRITTEN`: `PRJ_NOTIFICATION` = 8;
public const val `PRJ_NOTIFICATION_FILE_PRE_CONVERT_TO_FULL`: `PRJ_NOTIFICATION` = 4096;
public const val `PRJ_NOTIFICATION_FILE_RENAMED`: `PRJ_NOTIFICATION` = 128;
public const val `PRJ_NOTIFICATION_HARDLINK_CREATED`: `PRJ_NOTIFICATION` = 256;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRJ_NOTIFICATION_MAPPING` (
    public var `NotificationBitMask`: `PRJ_NOTIFY_TYPES`,
    public var `NotificationRoot`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PRJ_NOTIFICATION_MAPPING`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PRJ_NOTIFICATION_MAPPING`.Companion.`default`() : `PRJ_NOTIFICATION_MAPPING` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PRJ_NOTIFICATION_NEW_FILE_CREATED`: `PRJ_NOTIFICATION` = 4;
// UNSUPPORTED Rust 177:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PRJ_NOTIFICATION_PARAMETERS {
//     pub PostCreate: PRJ_NOTIFICATION_PARAMETERS_0,
//     pub FileRenamed: PRJ_NOTIFICATION_PARAMETERS_1,
//     pub FileDeletedOnHandleClose: PRJ_NOTIFICATION_PARAMETERS_2,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PRJ_NOTIFICATION_PARAMETERS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PRJ_NOTIFICATION_PARAMETERS`.Companion.`default`() : `PRJ_NOTIFICATION_PARAMETERS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PRJ_NOTIFICATION_PARAMETERS_2` (
    public var `IsFileModified`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PRJ_NOTIFICATION_PARAMETERS_1` (
    public var `NotificationMask`: `PRJ_NOTIFY_TYPES`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PRJ_NOTIFICATION_PARAMETERS_0` (
    public var `NotificationMask`: `PRJ_NOTIFY_TYPES`,
)
public const val `PRJ_NOTIFICATION_PRE_DELETE`: `PRJ_NOTIFICATION` = 16;
public const val `PRJ_NOTIFICATION_PRE_RENAME`: `PRJ_NOTIFICATION` = 32;
public const val `PRJ_NOTIFICATION_PRE_SET_HARDLINK`: `PRJ_NOTIFICATION` = 64;
public const val `PRJ_NOTIFY_FILE_HANDLE_CLOSED_FILE_DELETED`: `PRJ_NOTIFY_TYPES` = 2048u;
public const val `PRJ_NOTIFY_FILE_HANDLE_CLOSED_FILE_MODIFIED`: `PRJ_NOTIFY_TYPES` = 1024u;
public const val `PRJ_NOTIFY_FILE_HANDLE_CLOSED_NO_MODIFICATION`: `PRJ_NOTIFY_TYPES` = 512u;
public const val `PRJ_NOTIFY_FILE_OPENED`: `PRJ_NOTIFY_TYPES` = 2u;
public const val `PRJ_NOTIFY_FILE_OVERWRITTEN`: `PRJ_NOTIFY_TYPES` = 8u;
public const val `PRJ_NOTIFY_FILE_PRE_CONVERT_TO_FULL`: `PRJ_NOTIFY_TYPES` = 4096u;
public const val `PRJ_NOTIFY_FILE_RENAMED`: `PRJ_NOTIFY_TYPES` = 128u;
public const val `PRJ_NOTIFY_HARDLINK_CREATED`: `PRJ_NOTIFY_TYPES` = 256u;
public const val `PRJ_NOTIFY_NEW_FILE_CREATED`: `PRJ_NOTIFY_TYPES` = 4u;
public const val `PRJ_NOTIFY_NONE`: `PRJ_NOTIFY_TYPES` = 0u;
public const val `PRJ_NOTIFY_PRE_DELETE`: `PRJ_NOTIFY_TYPES` = 16u;
public const val `PRJ_NOTIFY_PRE_RENAME`: `PRJ_NOTIFY_TYPES` = 32u;
public const val `PRJ_NOTIFY_PRE_SET_HARDLINK`: `PRJ_NOTIFY_TYPES` = 64u;
public const val `PRJ_NOTIFY_SUPPRESS_NOTIFICATIONS`: `PRJ_NOTIFY_TYPES` = 1u;
public typealias `PRJ_NOTIFY_TYPES` = UInt;
public const val `PRJ_NOTIFY_USE_EXISTING_MASK`: `PRJ_NOTIFY_TYPES` = 4294967295u;
public typealias `PRJ_PLACEHOLDER_ID` = Int;
public const val `PRJ_PLACEHOLDER_ID_LENGTH`: `PRJ_PLACEHOLDER_ID` = 128;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRJ_PLACEHOLDER_INFO` (
    public var `FileBasicInfo`: `PRJ_FILE_BASIC_INFO`,
    public var `EaInformation`: `PRJ_PLACEHOLDER_INFO_0`,
    public var `SecurityInformation`: `PRJ_PLACEHOLDER_INFO_1`,
    public var `StreamsInformation`: `PRJ_PLACEHOLDER_INFO_2`,
    public var `VersionInfo`: `PRJ_PLACEHOLDER_VERSION_INFO`,
    public var `VariableData`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PRJ_PLACEHOLDER_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PRJ_PLACEHOLDER_INFO`.Companion.`default`() : `PRJ_PLACEHOLDER_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PRJ_PLACEHOLDER_INFO_0` (
    public var `EaBufferSize`: UInt,
    public var `OffsetToFirstEa`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PRJ_PLACEHOLDER_INFO_1` (
    public var `SecurityBufferSize`: UInt,
    public var `OffsetToSecurityDescriptor`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PRJ_PLACEHOLDER_INFO_2` (
    public var `StreamsInfoBufferSize`: UInt,
    public var `OffsetToFirstStreamInfo`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRJ_PLACEHOLDER_VERSION_INFO` (
    public var `ProviderID`: UByteArray,
    public var `ContentID`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PRJ_PLACEHOLDER_VERSION_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PRJ_PLACEHOLDER_VERSION_INFO`.Companion.`default`() : `PRJ_PLACEHOLDER_VERSION_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PRJ_QUERY_FILE_NAME_CB` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`PRJ_CALLBACK_DATA`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public typealias `PRJ_STARTVIRTUALIZING_FLAGS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRJ_STARTVIRTUALIZING_OPTIONS` (
    public var `Flags`: `PRJ_STARTVIRTUALIZING_FLAGS`,
    public var `PoolThreadCount`: UInt,
    public var `ConcurrentThreadCount`: UInt,
    public var `NotificationMappings`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PRJ_NOTIFICATION_MAPPING`>?,
    public var `NotificationMappingsCount`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PRJ_STARTVIRTUALIZING_OPTIONS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PRJ_STARTVIRTUALIZING_OPTIONS`.Companion.`default`() : `PRJ_STARTVIRTUALIZING_OPTIONS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PRJ_START_DIRECTORY_ENUMERATION_CB` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`PRJ_CALLBACK_DATA`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `PRJ_UPDATE_ALLOW_DIRTY_DATA`: `PRJ_UPDATE_TYPES` = 2;
public const val `PRJ_UPDATE_ALLOW_DIRTY_METADATA`: `PRJ_UPDATE_TYPES` = 1;
public const val `PRJ_UPDATE_ALLOW_READ_ONLY`: `PRJ_UPDATE_TYPES` = 32;
public const val `PRJ_UPDATE_ALLOW_TOMBSTONE`: `PRJ_UPDATE_TYPES` = 4;
public typealias `PRJ_UPDATE_FAILURE_CAUSES` = Int;
public const val `PRJ_UPDATE_FAILURE_CAUSE_DIRTY_DATA`: `PRJ_UPDATE_FAILURE_CAUSES` = 2;
public const val `PRJ_UPDATE_FAILURE_CAUSE_DIRTY_METADATA`: `PRJ_UPDATE_FAILURE_CAUSES` = 1;
public const val `PRJ_UPDATE_FAILURE_CAUSE_NONE`: `PRJ_UPDATE_FAILURE_CAUSES` = 0;
public const val `PRJ_UPDATE_FAILURE_CAUSE_READ_ONLY`: `PRJ_UPDATE_FAILURE_CAUSES` = 8;
public const val `PRJ_UPDATE_FAILURE_CAUSE_TOMBSTONE`: `PRJ_UPDATE_FAILURE_CAUSES` = 4;
public const val `PRJ_UPDATE_MAX_VAL`: `PRJ_UPDATE_TYPES` = 64;
public const val `PRJ_UPDATE_NONE`: `PRJ_UPDATE_TYPES` = 0;
public const val `PRJ_UPDATE_RESERVED1`: `PRJ_UPDATE_TYPES` = 8;
public const val `PRJ_UPDATE_RESERVED2`: `PRJ_UPDATE_TYPES` = 16;
public typealias `PRJ_UPDATE_TYPES` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PRJ_VIRTUALIZATION_INSTANCE_INFO` (
    public var `InstanceID`: `windows_sys`.`core`.`GUID`,
    public var `WriteAlignment`: UInt,
)
