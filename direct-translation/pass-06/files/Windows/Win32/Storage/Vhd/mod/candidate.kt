// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=AddVirtualDiskParent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddVirtualDiskParent`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`, `parentpath` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=ApplySnapshotVhdSet; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ApplySnapshotVhdSet`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`, `parameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`APPLY_SNAPSHOT_VHDSET_PARAMETERS`>?, `flags` : `APPLY_SNAPSHOT_VHDSET_FLAG`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=AttachVirtualDisk; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security", feature = "Win32_System_IO"))]
public external fun `AttachVirtualDisk`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`, `securitydescriptor` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`, `flags` : `ATTACH_VIRTUAL_DISK_FLAG`, `providerspecificflags` : UInt, `parameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`ATTACH_VIRTUAL_DISK_PARAMETERS`>?, `overlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=BreakMirrorVirtualDisk; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BreakMirrorVirtualDisk`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=CompactVirtualDisk; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `CompactVirtualDisk`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : `COMPACT_VIRTUAL_DISK_FLAG`, `parameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`COMPACT_VIRTUAL_DISK_PARAMETERS`>?, `overlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=CompleteForkVirtualDisk; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CompleteForkVirtualDisk`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=CreateVirtualDisk; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security", feature = "Win32_System_IO"))]
public external fun `CreateVirtualDisk`(`virtualstoragetype` : /* Rust *const */ kotlinx.cinterop.CPointer<`VIRTUAL_STORAGE_TYPE`>?, `path` : `windows_sys`.`core`.`PCWSTR`, `virtualdiskaccessmask` : `VIRTUAL_DISK_ACCESS_MASK`, `securitydescriptor` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`, `flags` : `CREATE_VIRTUAL_DISK_FLAG`, `providerspecificflags` : UInt, `parameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`CREATE_VIRTUAL_DISK_PARAMETERS`>?, `overlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?, `handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=DeleteSnapshotVhdSet; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteSnapshotVhdSet`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`, `parameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`DELETE_SNAPSHOT_VHDSET_PARAMETERS`>?, `flags` : `DELETE_SNAPSHOT_VHDSET_FLAG`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=DeleteVirtualDiskMetadata; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteVirtualDiskMetadata`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`, `item` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=DetachVirtualDisk; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DetachVirtualDisk`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : `DETACH_VIRTUAL_DISK_FLAG`, `providerspecificflags` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=EnumerateVirtualDiskMetadata; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumerateVirtualDiskMetadata`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numberofitems` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `items` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=ExpandVirtualDisk; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `ExpandVirtualDisk`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : `EXPAND_VIRTUAL_DISK_FLAG`, `parameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`EXPAND_VIRTUAL_DISK_PARAMETERS`>?, `overlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=ForkVirtualDisk; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `ForkVirtualDisk`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : `FORK_VIRTUAL_DISK_FLAG`, `parameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`FORK_VIRTUAL_DISK_PARAMETERS`>?, `overlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=GetAllAttachedVirtualDiskPhysicalPaths; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetAllAttachedVirtualDiskPhysicalPaths`(`pathsbuffersizeinbytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pathsbuffer` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=GetStorageDependencyInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetStorageDependencyInformation`(`objecthandle` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : `GET_STORAGE_DEPENDENCY_FLAG`, `storagedependencyinfosize` : UInt, `storagedependencyinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`STORAGE_DEPENDENCY_INFO`>?, `sizeused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=GetVirtualDiskInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetVirtualDiskInformation`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`, `virtualdiskinfosize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `virtualdiskinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GET_VIRTUAL_DISK_INFO`>?, `sizeused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=GetVirtualDiskMetadata; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetVirtualDiskMetadata`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`, `item` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `metadatasize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `metadata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=GetVirtualDiskOperationProgress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `GetVirtualDiskOperationProgress`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`, `overlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?, `progress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VIRTUAL_DISK_PROGRESS`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=GetVirtualDiskPhysicalPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetVirtualDiskPhysicalPath`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`, `diskpathsizeinbytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `diskpath` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=MergeVirtualDisk; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `MergeVirtualDisk`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : `MERGE_VIRTUAL_DISK_FLAG`, `parameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`MERGE_VIRTUAL_DISK_PARAMETERS`>?, `overlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=MirrorVirtualDisk; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `MirrorVirtualDisk`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : `MIRROR_VIRTUAL_DISK_FLAG`, `parameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIRROR_VIRTUAL_DISK_PARAMETERS`>?, `overlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=ModifyVhdSet; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ModifyVhdSet`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`, `parameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`MODIFY_VHDSET_PARAMETERS`>?, `flags` : `MODIFY_VHDSET_FLAG`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=OpenVirtualDisk; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenVirtualDisk`(`virtualstoragetype` : /* Rust *const */ kotlinx.cinterop.CPointer<`VIRTUAL_STORAGE_TYPE`>?, `path` : `windows_sys`.`core`.`PCWSTR`, `virtualdiskaccessmask` : `VIRTUAL_DISK_ACCESS_MASK`, `flags` : `OPEN_VIRTUAL_DISK_FLAG`, `parameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`OPEN_VIRTUAL_DISK_PARAMETERS`>?, `handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=QueryChangesVirtualDisk; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryChangesVirtualDisk`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`, `changetrackingid` : `windows_sys`.`core`.`PCWSTR`, `byteoffset` : ULong, `bytelength` : ULong, `flags` : `QUERY_CHANGES_VIRTUAL_DISK_FLAG`, `ranges` : /* Rust *mut */ kotlinx.cinterop.CPointer<`QUERY_CHANGES_VIRTUAL_DISK_RANGE`>?, `rangecount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `processedlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=RawSCSIVirtualDisk; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RawSCSIVirtualDisk`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`, `parameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`RAW_SCSI_VIRTUAL_DISK_PARAMETERS`>?, `flags` : `RAW_SCSI_VIRTUAL_DISK_FLAG`, `response` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RAW_SCSI_VIRTUAL_DISK_RESPONSE`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=ResizeVirtualDisk; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `ResizeVirtualDisk`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : `RESIZE_VIRTUAL_DISK_FLAG`, `parameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`RESIZE_VIRTUAL_DISK_PARAMETERS`>?, `overlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=SetVirtualDiskInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetVirtualDiskInformation`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`, `virtualdiskinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`SET_VIRTUAL_DISK_INFO`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=SetVirtualDiskMetadata; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetVirtualDiskMetadata`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`, `item` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `metadatasize` : UInt, `metadata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=virtdisk.dll, ABI=system, export=TakeSnapshotVhdSet; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TakeSnapshotVhdSet`(`virtualdiskhandle` : `super`.`super`.`Foundation`.`HANDLE`, `parameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`TAKE_SNAPSHOT_VHDSET_PARAMETERS`>?, `flags` : `TAKE_SNAPSHOT_VHDSET_FLAG`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
public typealias `APPLY_SNAPSHOT_VHDSET_FLAG` = Int;
public const val `APPLY_SNAPSHOT_VHDSET_FLAG_NONE`: `APPLY_SNAPSHOT_VHDSET_FLAG` = 0;
public const val `APPLY_SNAPSHOT_VHDSET_FLAG_WRITEABLE`: `APPLY_SNAPSHOT_VHDSET_FLAG` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `APPLY_SNAPSHOT_VHDSET_PARAMETERS` (
    public var `Version`: `APPLY_SNAPSHOT_VHDSET_VERSION`,
    public var `Anonymous`: `APPLY_SNAPSHOT_VHDSET_PARAMETERS_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `APPLY_SNAPSHOT_VHDSET_PARAMETERS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `APPLY_SNAPSHOT_VHDSET_PARAMETERS`.Companion.`default`() : `APPLY_SNAPSHOT_VHDSET_PARAMETERS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 53:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union APPLY_SNAPSHOT_VHDSET_PARAMETERS_0 {
//     pub Version1: APPLY_SNAPSHOT_VHDSET_PARAMETERS_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `APPLY_SNAPSHOT_VHDSET_PARAMETERS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `APPLY_SNAPSHOT_VHDSET_PARAMETERS_0`.Companion.`default`() : `APPLY_SNAPSHOT_VHDSET_PARAMETERS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `APPLY_SNAPSHOT_VHDSET_PARAMETERS_0_0` (
    public var `SnapshotId`: `windows_sys`.`core`.`GUID`,
    public var `LeafSnapshotId`: `windows_sys`.`core`.`GUID`,
)
public typealias `APPLY_SNAPSHOT_VHDSET_VERSION` = Int;
public const val `APPLY_SNAPSHOT_VHDSET_VERSION_1`: `APPLY_SNAPSHOT_VHDSET_VERSION` = 1;
public const val `APPLY_SNAPSHOT_VHDSET_VERSION_UNSPECIFIED`: `APPLY_SNAPSHOT_VHDSET_VERSION` = 0;
public typealias `ATTACH_VIRTUAL_DISK_FLAG` = Int;
public const val `ATTACH_VIRTUAL_DISK_FLAG_AT_BOOT`: `ATTACH_VIRTUAL_DISK_FLAG` = 1024;
public const val `ATTACH_VIRTUAL_DISK_FLAG_BYPASS_DEFAULT_ENCRYPTION_POLICY`: `ATTACH_VIRTUAL_DISK_FLAG` = 32;
public const val `ATTACH_VIRTUAL_DISK_FLAG_NONE`: `ATTACH_VIRTUAL_DISK_FLAG` = 0;
public const val `ATTACH_VIRTUAL_DISK_FLAG_NON_PNP`: `ATTACH_VIRTUAL_DISK_FLAG` = 64;
public const val `ATTACH_VIRTUAL_DISK_FLAG_NO_DRIVE_LETTER`: `ATTACH_VIRTUAL_DISK_FLAG` = 2;
public const val `ATTACH_VIRTUAL_DISK_FLAG_NO_LOCAL_HOST`: `ATTACH_VIRTUAL_DISK_FLAG` = 8;
public const val `ATTACH_VIRTUAL_DISK_FLAG_NO_SECURITY_DESCRIPTOR`: `ATTACH_VIRTUAL_DISK_FLAG` = 16;
public const val `ATTACH_VIRTUAL_DISK_FLAG_PERMANENT_LIFETIME`: `ATTACH_VIRTUAL_DISK_FLAG` = 4;
public const val `ATTACH_VIRTUAL_DISK_FLAG_READ_ONLY`: `ATTACH_VIRTUAL_DISK_FLAG` = 1;
public const val `ATTACH_VIRTUAL_DISK_FLAG_REGISTER_VOLUME`: `ATTACH_VIRTUAL_DISK_FLAG` = 512;
public const val `ATTACH_VIRTUAL_DISK_FLAG_RESTRICTED_RANGE`: `ATTACH_VIRTUAL_DISK_FLAG` = 128;
public const val `ATTACH_VIRTUAL_DISK_FLAG_SINGLE_PARTITION`: `ATTACH_VIRTUAL_DISK_FLAG` = 256;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ATTACH_VIRTUAL_DISK_PARAMETERS` (
    public var `Version`: `ATTACH_VIRTUAL_DISK_VERSION`,
    public var `Anonymous`: `ATTACH_VIRTUAL_DISK_PARAMETERS_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ATTACH_VIRTUAL_DISK_PARAMETERS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ATTACH_VIRTUAL_DISK_PARAMETERS`.Companion.`default`() : `ATTACH_VIRTUAL_DISK_PARAMETERS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 96:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union ATTACH_VIRTUAL_DISK_PARAMETERS_0 {
//     pub Version1: ATTACH_VIRTUAL_DISK_PARAMETERS_0_0,
//     pub Version2: ATTACH_VIRTUAL_DISK_PARAMETERS_0_1,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ATTACH_VIRTUAL_DISK_PARAMETERS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ATTACH_VIRTUAL_DISK_PARAMETERS_0`.Companion.`default`() : `ATTACH_VIRTUAL_DISK_PARAMETERS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ATTACH_VIRTUAL_DISK_PARAMETERS_0_0` (
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ATTACH_VIRTUAL_DISK_PARAMETERS_0_1` (
    public var `RestrictedOffset`: ULong,
    public var `RestrictedLength`: ULong,
)
public typealias `ATTACH_VIRTUAL_DISK_VERSION` = Int;
public const val `ATTACH_VIRTUAL_DISK_VERSION_1`: `ATTACH_VIRTUAL_DISK_VERSION` = 1;
public const val `ATTACH_VIRTUAL_DISK_VERSION_2`: `ATTACH_VIRTUAL_DISK_VERSION` = 2;
public const val `ATTACH_VIRTUAL_DISK_VERSION_UNSPECIFIED`: `ATTACH_VIRTUAL_DISK_VERSION` = 0;
public typealias `COMPACT_VIRTUAL_DISK_FLAG` = Int;
public const val `COMPACT_VIRTUAL_DISK_FLAG_NONE`: `COMPACT_VIRTUAL_DISK_FLAG` = 0;
public const val `COMPACT_VIRTUAL_DISK_FLAG_NO_BLOCK_MOVES`: `COMPACT_VIRTUAL_DISK_FLAG` = 2;
public const val `COMPACT_VIRTUAL_DISK_FLAG_NO_ZERO_SCAN`: `COMPACT_VIRTUAL_DISK_FLAG` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COMPACT_VIRTUAL_DISK_PARAMETERS` (
    public var `Version`: `COMPACT_VIRTUAL_DISK_VERSION`,
    public var `Anonymous`: `COMPACT_VIRTUAL_DISK_PARAMETERS_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `COMPACT_VIRTUAL_DISK_PARAMETERS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `COMPACT_VIRTUAL_DISK_PARAMETERS`.Companion.`default`() : `COMPACT_VIRTUAL_DISK_PARAMETERS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 137:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union COMPACT_VIRTUAL_DISK_PARAMETERS_0 {
//     pub Version1: COMPACT_VIRTUAL_DISK_PARAMETERS_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `COMPACT_VIRTUAL_DISK_PARAMETERS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `COMPACT_VIRTUAL_DISK_PARAMETERS_0`.Companion.`default`() : `COMPACT_VIRTUAL_DISK_PARAMETERS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `COMPACT_VIRTUAL_DISK_PARAMETERS_0_0` (
    public var `Reserved`: UInt,
)
public typealias `COMPACT_VIRTUAL_DISK_VERSION` = Int;
public const val `COMPACT_VIRTUAL_DISK_VERSION_1`: `COMPACT_VIRTUAL_DISK_VERSION` = 1;
public const val `COMPACT_VIRTUAL_DISK_VERSION_UNSPECIFIED`: `COMPACT_VIRTUAL_DISK_VERSION` = 0;
public typealias `CREATE_VIRTUAL_DISK_FLAG` = Int;
public const val `CREATE_VIRTUAL_DISK_FLAG_CREATE_BACKING_STORAGE`: `CREATE_VIRTUAL_DISK_FLAG` = 8;
public const val `CREATE_VIRTUAL_DISK_FLAG_DO_NOT_COPY_METADATA_FROM_PARENT`: `CREATE_VIRTUAL_DISK_FLAG` = 4;
public const val `CREATE_VIRTUAL_DISK_FLAG_FULL_PHYSICAL_ALLOCATION`: `CREATE_VIRTUAL_DISK_FLAG` = 1;
public const val `CREATE_VIRTUAL_DISK_FLAG_NONE`: `CREATE_VIRTUAL_DISK_FLAG` = 0;
public const val `CREATE_VIRTUAL_DISK_FLAG_PMEM_COMPATIBLE`: `CREATE_VIRTUAL_DISK_FLAG` = 256;
public const val `CREATE_VIRTUAL_DISK_FLAG_PRESERVE_PARENT_CHANGE_TRACKING_STATE`: `CREATE_VIRTUAL_DISK_FLAG` = 32;
public const val `CREATE_VIRTUAL_DISK_FLAG_PREVENT_WRITES_TO_SOURCE_DISK`: `CREATE_VIRTUAL_DISK_FLAG` = 2;
public const val `CREATE_VIRTUAL_DISK_FLAG_SPARSE_FILE`: `CREATE_VIRTUAL_DISK_FLAG` = 128;
public const val `CREATE_VIRTUAL_DISK_FLAG_SUPPORT_COMPRESSED_VOLUMES`: `CREATE_VIRTUAL_DISK_FLAG` = 512;
public const val `CREATE_VIRTUAL_DISK_FLAG_SUPPORT_SPARSE_FILES_ANY_FS`: `CREATE_VIRTUAL_DISK_FLAG` = 1024;
public const val `CREATE_VIRTUAL_DISK_FLAG_USE_CHANGE_TRACKING_SOURCE_LIMIT`: `CREATE_VIRTUAL_DISK_FLAG` = 16;
public const val `CREATE_VIRTUAL_DISK_FLAG_VHD_SET_USE_ORIGINAL_BACKING_STORAGE`: `CREATE_VIRTUAL_DISK_FLAG` = 64;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CREATE_VIRTUAL_DISK_PARAMETERS` (
    public var `Version`: `CREATE_VIRTUAL_DISK_VERSION`,
    public var `Anonymous`: `CREATE_VIRTUAL_DISK_PARAMETERS_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CREATE_VIRTUAL_DISK_PARAMETERS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `CREATE_VIRTUAL_DISK_PARAMETERS`.Companion.`default`() : `CREATE_VIRTUAL_DISK_PARAMETERS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 179:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CREATE_VIRTUAL_DISK_PARAMETERS_0 {
//     pub Version1: CREATE_VIRTUAL_DISK_PARAMETERS_0_0,
//     pub Version2: CREATE_VIRTUAL_DISK_PARAMETERS_0_1,
//     pub Version3: CREATE_VIRTUAL_DISK_PARAMETERS_0_2,
//     pub Version4: CREATE_VIRTUAL_DISK_PARAMETERS_0_3,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CREATE_VIRTUAL_DISK_PARAMETERS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `CREATE_VIRTUAL_DISK_PARAMETERS_0`.Companion.`default`() : `CREATE_VIRTUAL_DISK_PARAMETERS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CREATE_VIRTUAL_DISK_PARAMETERS_0_0` (
    public var `UniqueId`: `windows_sys`.`core`.`GUID`,
    public var `MaximumSize`: ULong,
    public var `BlockSizeInBytes`: UInt,
    public var `SectorSizeInBytes`: UInt,
    public var `ParentPath`: `windows_sys`.`core`.`PCWSTR`,
    public var `SourcePath`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CREATE_VIRTUAL_DISK_PARAMETERS_0_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `CREATE_VIRTUAL_DISK_PARAMETERS_0_0`.Companion.`default`() : `CREATE_VIRTUAL_DISK_PARAMETERS_0_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CREATE_VIRTUAL_DISK_PARAMETERS_0_1` (
    public var `UniqueId`: `windows_sys`.`core`.`GUID`,
    public var `MaximumSize`: ULong,
    public var `BlockSizeInBytes`: UInt,
    public var `SectorSizeInBytes`: UInt,
    public var `PhysicalSectorSizeInBytes`: UInt,
    public var `ParentPath`: `windows_sys`.`core`.`PCWSTR`,
    public var `SourcePath`: `windows_sys`.`core`.`PCWSTR`,
    public var `OpenFlags`: `OPEN_VIRTUAL_DISK_FLAG`,
    public var `ParentVirtualStorageType`: `VIRTUAL_STORAGE_TYPE`,
    public var `SourceVirtualStorageType`: `VIRTUAL_STORAGE_TYPE`,
    public var `ResiliencyGuid`: `windows_sys`.`core`.`GUID`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CREATE_VIRTUAL_DISK_PARAMETERS_0_1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `CREATE_VIRTUAL_DISK_PARAMETERS_0_1`.Companion.`default`() : `CREATE_VIRTUAL_DISK_PARAMETERS_0_1` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CREATE_VIRTUAL_DISK_PARAMETERS_0_2` (
    public var `UniqueId`: `windows_sys`.`core`.`GUID`,
    public var `MaximumSize`: ULong,
    public var `BlockSizeInBytes`: UInt,
    public var `SectorSizeInBytes`: UInt,
    public var `PhysicalSectorSizeInBytes`: UInt,
    public var `ParentPath`: `windows_sys`.`core`.`PCWSTR`,
    public var `SourcePath`: `windows_sys`.`core`.`PCWSTR`,
    public var `OpenFlags`: `OPEN_VIRTUAL_DISK_FLAG`,
    public var `ParentVirtualStorageType`: `VIRTUAL_STORAGE_TYPE`,
    public var `SourceVirtualStorageType`: `VIRTUAL_STORAGE_TYPE`,
    public var `ResiliencyGuid`: `windows_sys`.`core`.`GUID`,
    public var `SourceLimitPath`: `windows_sys`.`core`.`PCWSTR`,
    public var `BackingStorageType`: `VIRTUAL_STORAGE_TYPE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CREATE_VIRTUAL_DISK_PARAMETERS_0_2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `CREATE_VIRTUAL_DISK_PARAMETERS_0_2`.Companion.`default`() : `CREATE_VIRTUAL_DISK_PARAMETERS_0_2` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CREATE_VIRTUAL_DISK_PARAMETERS_0_3` (
    public var `UniqueId`: `windows_sys`.`core`.`GUID`,
    public var `MaximumSize`: ULong,
    public var `BlockSizeInBytes`: UInt,
    public var `SectorSizeInBytes`: UInt,
    public var `PhysicalSectorSizeInBytes`: UInt,
    public var `ParentPath`: `windows_sys`.`core`.`PCWSTR`,
    public var `SourcePath`: `windows_sys`.`core`.`PCWSTR`,
    public var `OpenFlags`: `OPEN_VIRTUAL_DISK_FLAG`,
    public var `ParentVirtualStorageType`: `VIRTUAL_STORAGE_TYPE`,
    public var `SourceVirtualStorageType`: `VIRTUAL_STORAGE_TYPE`,
    public var `ResiliencyGuid`: `windows_sys`.`core`.`GUID`,
    public var `SourceLimitPath`: `windows_sys`.`core`.`PCWSTR`,
    public var `BackingStorageType`: `VIRTUAL_STORAGE_TYPE`,
    public var `PmemAddressAbstractionType`: `windows_sys`.`core`.`GUID`,
    public var `DataAlignment`: ULong,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CREATE_VIRTUAL_DISK_PARAMETERS_0_3`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `CREATE_VIRTUAL_DISK_PARAMETERS_0_3`.Companion.`default`() : `CREATE_VIRTUAL_DISK_PARAMETERS_0_3` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `CREATE_VIRTUAL_DISK_PARAMETERS_DEFAULT_BLOCK_SIZE`: UInt = 0u;
public const val `CREATE_VIRTUAL_DISK_PARAMETERS_DEFAULT_SECTOR_SIZE`: UInt = 0u;
public typealias `CREATE_VIRTUAL_DISK_VERSION` = Int;
public const val `CREATE_VIRTUAL_DISK_VERSION_1`: `CREATE_VIRTUAL_DISK_VERSION` = 1;
public const val `CREATE_VIRTUAL_DISK_VERSION_2`: `CREATE_VIRTUAL_DISK_VERSION` = 2;
public const val `CREATE_VIRTUAL_DISK_VERSION_3`: `CREATE_VIRTUAL_DISK_VERSION` = 3;
public const val `CREATE_VIRTUAL_DISK_VERSION_4`: `CREATE_VIRTUAL_DISK_VERSION` = 4;
public const val `CREATE_VIRTUAL_DISK_VERSION_UNSPECIFIED`: `CREATE_VIRTUAL_DISK_VERSION` = 0;
public typealias `DELETE_SNAPSHOT_VHDSET_FLAG` = Int;
public const val `DELETE_SNAPSHOT_VHDSET_FLAG_NONE`: `DELETE_SNAPSHOT_VHDSET_FLAG` = 0;
public const val `DELETE_SNAPSHOT_VHDSET_FLAG_PERSIST_RCT`: `DELETE_SNAPSHOT_VHDSET_FLAG` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DELETE_SNAPSHOT_VHDSET_PARAMETERS` (
    public var `Version`: `DELETE_SNAPSHOT_VHDSET_VERSION`,
    public var `Anonymous`: `DELETE_SNAPSHOT_VHDSET_PARAMETERS_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DELETE_SNAPSHOT_VHDSET_PARAMETERS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DELETE_SNAPSHOT_VHDSET_PARAMETERS`.Companion.`default`() : `DELETE_SNAPSHOT_VHDSET_PARAMETERS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 295:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DELETE_SNAPSHOT_VHDSET_PARAMETERS_0 {
//     pub Version1: DELETE_SNAPSHOT_VHDSET_PARAMETERS_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DELETE_SNAPSHOT_VHDSET_PARAMETERS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DELETE_SNAPSHOT_VHDSET_PARAMETERS_0`.Companion.`default`() : `DELETE_SNAPSHOT_VHDSET_PARAMETERS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DELETE_SNAPSHOT_VHDSET_PARAMETERS_0_0` (
    public var `SnapshotId`: `windows_sys`.`core`.`GUID`,
)
public typealias `DELETE_SNAPSHOT_VHDSET_VERSION` = Int;
public const val `DELETE_SNAPSHOT_VHDSET_VERSION_1`: `DELETE_SNAPSHOT_VHDSET_VERSION` = 1;
public const val `DELETE_SNAPSHOT_VHDSET_VERSION_UNSPECIFIED`: `DELETE_SNAPSHOT_VHDSET_VERSION` = 0;
public typealias `DEPENDENT_DISK_FLAG` = Int;
public const val `DEPENDENT_DISK_FLAG_ALWAYS_ALLOW_SPARSE`: `DEPENDENT_DISK_FLAG` = 4096;
public const val `DEPENDENT_DISK_FLAG_FULLY_ALLOCATED`: `DEPENDENT_DISK_FLAG` = 2;
public const val `DEPENDENT_DISK_FLAG_MULT_BACKING_FILES`: `DEPENDENT_DISK_FLAG` = 1;
public const val `DEPENDENT_DISK_FLAG_NONE`: `DEPENDENT_DISK_FLAG` = 0;
public const val `DEPENDENT_DISK_FLAG_NO_DRIVE_LETTER`: `DEPENDENT_DISK_FLAG` = 128;
public const val `DEPENDENT_DISK_FLAG_NO_HOST_DISK`: `DEPENDENT_DISK_FLAG` = 512;
public const val `DEPENDENT_DISK_FLAG_PARENT`: `DEPENDENT_DISK_FLAG` = 256;
public const val `DEPENDENT_DISK_FLAG_PERMANENT_LIFETIME`: `DEPENDENT_DISK_FLAG` = 1024;
public const val `DEPENDENT_DISK_FLAG_READ_ONLY`: `DEPENDENT_DISK_FLAG` = 4;
public const val `DEPENDENT_DISK_FLAG_REMOTE`: `DEPENDENT_DISK_FLAG` = 8;
public const val `DEPENDENT_DISK_FLAG_REMOVABLE`: `DEPENDENT_DISK_FLAG` = 64;
public const val `DEPENDENT_DISK_FLAG_SUPPORT_COMPRESSED_VOLUMES`: `DEPENDENT_DISK_FLAG` = 2048;
public const val `DEPENDENT_DISK_FLAG_SUPPORT_ENCRYPTED_FILES`: `DEPENDENT_DISK_FLAG` = 8192;
public const val `DEPENDENT_DISK_FLAG_SYSTEM_VOLUME`: `DEPENDENT_DISK_FLAG` = 16;
public const val `DEPENDENT_DISK_FLAG_SYSTEM_VOLUME_PARENT`: `DEPENDENT_DISK_FLAG` = 32;
public typealias `DETACH_VIRTUAL_DISK_FLAG` = Int;
public const val `DETACH_VIRTUAL_DISK_FLAG_NONE`: `DETACH_VIRTUAL_DISK_FLAG` = 0;
public typealias `EXPAND_VIRTUAL_DISK_FLAG` = Int;
public const val `EXPAND_VIRTUAL_DISK_FLAG_NONE`: `EXPAND_VIRTUAL_DISK_FLAG` = 0;
public const val `EXPAND_VIRTUAL_DISK_FLAG_NOTIFY_CHANGE`: `EXPAND_VIRTUAL_DISK_FLAG` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EXPAND_VIRTUAL_DISK_PARAMETERS` (
    public var `Version`: `EXPAND_VIRTUAL_DISK_VERSION`,
    public var `Anonymous`: `EXPAND_VIRTUAL_DISK_PARAMETERS_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EXPAND_VIRTUAL_DISK_PARAMETERS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EXPAND_VIRTUAL_DISK_PARAMETERS`.Companion.`default`() : `EXPAND_VIRTUAL_DISK_PARAMETERS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 345:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EXPAND_VIRTUAL_DISK_PARAMETERS_0 {
//     pub Version1: EXPAND_VIRTUAL_DISK_PARAMETERS_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EXPAND_VIRTUAL_DISK_PARAMETERS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EXPAND_VIRTUAL_DISK_PARAMETERS_0`.Companion.`default`() : `EXPAND_VIRTUAL_DISK_PARAMETERS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EXPAND_VIRTUAL_DISK_PARAMETERS_0_0` (
    public var `NewSize`: ULong,
)
public typealias `EXPAND_VIRTUAL_DISK_VERSION` = Int;
public const val `EXPAND_VIRTUAL_DISK_VERSION_1`: `EXPAND_VIRTUAL_DISK_VERSION` = 1;
public const val `EXPAND_VIRTUAL_DISK_VERSION_UNSPECIFIED`: `EXPAND_VIRTUAL_DISK_VERSION` = 0;
public typealias `FORK_VIRTUAL_DISK_FLAG` = Int;
public const val `FORK_VIRTUAL_DISK_FLAG_EXISTING_FILE`: `FORK_VIRTUAL_DISK_FLAG` = 1;
public const val `FORK_VIRTUAL_DISK_FLAG_NONE`: `FORK_VIRTUAL_DISK_FLAG` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FORK_VIRTUAL_DISK_PARAMETERS` (
    public var `Version`: `FORK_VIRTUAL_DISK_VERSION`,
    public var `Anonymous`: `FORK_VIRTUAL_DISK_PARAMETERS_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FORK_VIRTUAL_DISK_PARAMETERS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FORK_VIRTUAL_DISK_PARAMETERS`.Companion.`default`() : `FORK_VIRTUAL_DISK_PARAMETERS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 377:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FORK_VIRTUAL_DISK_PARAMETERS_0 {
//     pub Version1: FORK_VIRTUAL_DISK_PARAMETERS_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FORK_VIRTUAL_DISK_PARAMETERS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FORK_VIRTUAL_DISK_PARAMETERS_0`.Companion.`default`() : `FORK_VIRTUAL_DISK_PARAMETERS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FORK_VIRTUAL_DISK_PARAMETERS_0_0` (
    public var `ForkedVirtualDiskPath`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FORK_VIRTUAL_DISK_PARAMETERS_0_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FORK_VIRTUAL_DISK_PARAMETERS_0_0`.Companion.`default`() : `FORK_VIRTUAL_DISK_PARAMETERS_0_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `FORK_VIRTUAL_DISK_VERSION` = Int;
public const val `FORK_VIRTUAL_DISK_VERSION_1`: `FORK_VIRTUAL_DISK_VERSION` = 1;
public const val `FORK_VIRTUAL_DISK_VERSION_UNSPECIFIED`: `FORK_VIRTUAL_DISK_VERSION` = 0;
public typealias `GET_STORAGE_DEPENDENCY_FLAG` = Int;
public const val `GET_STORAGE_DEPENDENCY_FLAG_DISK_HANDLE`: `GET_STORAGE_DEPENDENCY_FLAG` = 2;
public const val `GET_STORAGE_DEPENDENCY_FLAG_HOST_VOLUMES`: `GET_STORAGE_DEPENDENCY_FLAG` = 1;
public const val `GET_STORAGE_DEPENDENCY_FLAG_NONE`: `GET_STORAGE_DEPENDENCY_FLAG` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GET_VIRTUAL_DISK_INFO` (
    public var `Version`: `GET_VIRTUAL_DISK_INFO_VERSION`,
    public var `Anonymous`: `GET_VIRTUAL_DISK_INFO_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `GET_VIRTUAL_DISK_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `GET_VIRTUAL_DISK_INFO`.Companion.`default`() : `GET_VIRTUAL_DISK_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 415:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union GET_VIRTUAL_DISK_INFO_0 {
//     pub Size: GET_VIRTUAL_DISK_INFO_0_0,
//     pub Identifier: windows_sys::core::GUID,
//     pub ParentLocation: GET_VIRTUAL_DISK_INFO_0_1,
//     pub ParentIdentifier: windows_sys::core::GUID,
//     pub ParentTimestamp: u32,
//     pub VirtualStorageType: VIRTUAL_STORAGE_TYPE,
//     pub ProviderSubtype: u32,
//     pub Is4kAligned: windows_sys::core::BOOL,
//     pub IsLoaded: windows_sys::core::BOOL,
//     pub PhysicalDisk: GET_VIRTUAL_DISK_INFO_0_2,
//     pub VhdPhysicalSectorSize: u32,
//     pub SmallestSafeVirtualSize: u64,
//     pub FragmentationPercentage: u32,
//     pub VirtualDiskId: windows_sys::core::GUID,
//     pub ChangeTrackingState: GET_VIRTUAL_DISK_INFO_0_3,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `GET_VIRTUAL_DISK_INFO_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `GET_VIRTUAL_DISK_INFO_0`.Companion.`default`() : `GET_VIRTUAL_DISK_INFO_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GET_VIRTUAL_DISK_INFO_0_3` (
    public var `Enabled`: `windows_sys`.`core`.`BOOL`,
    public var `NewerChanges`: `windows_sys`.`core`.`BOOL`,
    public var `MostRecentId`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `GET_VIRTUAL_DISK_INFO_0_3`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `GET_VIRTUAL_DISK_INFO_0_3`.Companion.`default`() : `GET_VIRTUAL_DISK_INFO_0_3` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GET_VIRTUAL_DISK_INFO_0_1` (
    public var `ParentResolved`: `windows_sys`.`core`.`BOOL`,
    public var `ParentLocationBuffer`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `GET_VIRTUAL_DISK_INFO_0_1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `GET_VIRTUAL_DISK_INFO_0_1`.Companion.`default`() : `GET_VIRTUAL_DISK_INFO_0_1` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GET_VIRTUAL_DISK_INFO_0_2` (
    public var `LogicalSectorSize`: UInt,
    public var `PhysicalSectorSize`: UInt,
    public var `IsRemote`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GET_VIRTUAL_DISK_INFO_0_0` (
    public var `VirtualSize`: ULong,
    public var `PhysicalSize`: ULong,
    public var `BlockSize`: UInt,
    public var `SectorSize`: UInt,
)
public const val `GET_VIRTUAL_DISK_INFO_CHANGE_TRACKING_STATE`: `GET_VIRTUAL_DISK_INFO_VERSION` = 15;
public const val `GET_VIRTUAL_DISK_INFO_FRAGMENTATION`: `GET_VIRTUAL_DISK_INFO_VERSION` = 12;
public const val `GET_VIRTUAL_DISK_INFO_IDENTIFIER`: `GET_VIRTUAL_DISK_INFO_VERSION` = 2;
public const val `GET_VIRTUAL_DISK_INFO_IS_4K_ALIGNED`: `GET_VIRTUAL_DISK_INFO_VERSION` = 8;
public const val `GET_VIRTUAL_DISK_INFO_IS_LOADED`: `GET_VIRTUAL_DISK_INFO_VERSION` = 13;
public const val `GET_VIRTUAL_DISK_INFO_PARENT_IDENTIFIER`: `GET_VIRTUAL_DISK_INFO_VERSION` = 4;
public const val `GET_VIRTUAL_DISK_INFO_PARENT_LOCATION`: `GET_VIRTUAL_DISK_INFO_VERSION` = 3;
public const val `GET_VIRTUAL_DISK_INFO_PARENT_TIMESTAMP`: `GET_VIRTUAL_DISK_INFO_VERSION` = 5;
public const val `GET_VIRTUAL_DISK_INFO_PHYSICAL_DISK`: `GET_VIRTUAL_DISK_INFO_VERSION` = 9;
public const val `GET_VIRTUAL_DISK_INFO_PROVIDER_SUBTYPE`: `GET_VIRTUAL_DISK_INFO_VERSION` = 7;
public const val `GET_VIRTUAL_DISK_INFO_SIZE`: `GET_VIRTUAL_DISK_INFO_VERSION` = 1;
public const val `GET_VIRTUAL_DISK_INFO_SMALLEST_SAFE_VIRTUAL_SIZE`: `GET_VIRTUAL_DISK_INFO_VERSION` = 11;
public const val `GET_VIRTUAL_DISK_INFO_UNSPECIFIED`: `GET_VIRTUAL_DISK_INFO_VERSION` = 0;
public typealias `GET_VIRTUAL_DISK_INFO_VERSION` = Int;
public const val `GET_VIRTUAL_DISK_INFO_VHD_PHYSICAL_SECTOR_SIZE`: `GET_VIRTUAL_DISK_INFO_VERSION` = 10;
public const val `GET_VIRTUAL_DISK_INFO_VIRTUAL_DISK_ID`: `GET_VIRTUAL_DISK_INFO_VERSION` = 14;
public const val `GET_VIRTUAL_DISK_INFO_VIRTUAL_STORAGE_TYPE`: `GET_VIRTUAL_DISK_INFO_VERSION` = 6;
public const val `MERGE_VIRTUAL_DISK_DEFAULT_MERGE_DEPTH`: UInt = 1u;
public typealias `MERGE_VIRTUAL_DISK_FLAG` = Int;
public const val `MERGE_VIRTUAL_DISK_FLAG_NONE`: `MERGE_VIRTUAL_DISK_FLAG` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MERGE_VIRTUAL_DISK_PARAMETERS` (
    public var `Version`: `MERGE_VIRTUAL_DISK_VERSION`,
    public var `Anonymous`: `MERGE_VIRTUAL_DISK_PARAMETERS_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MERGE_VIRTUAL_DISK_PARAMETERS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MERGE_VIRTUAL_DISK_PARAMETERS`.Companion.`default`() : `MERGE_VIRTUAL_DISK_PARAMETERS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 508:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MERGE_VIRTUAL_DISK_PARAMETERS_0 {
//     pub Version1: MERGE_VIRTUAL_DISK_PARAMETERS_0_0,
//     pub Version2: MERGE_VIRTUAL_DISK_PARAMETERS_0_1,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MERGE_VIRTUAL_DISK_PARAMETERS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MERGE_VIRTUAL_DISK_PARAMETERS_0`.Companion.`default`() : `MERGE_VIRTUAL_DISK_PARAMETERS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MERGE_VIRTUAL_DISK_PARAMETERS_0_0` (
    public var `MergeDepth`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MERGE_VIRTUAL_DISK_PARAMETERS_0_1` (
    public var `MergeSourceDepth`: UInt,
    public var `MergeTargetDepth`: UInt,
)
public typealias `MERGE_VIRTUAL_DISK_VERSION` = Int;
public const val `MERGE_VIRTUAL_DISK_VERSION_1`: `MERGE_VIRTUAL_DISK_VERSION` = 1;
public const val `MERGE_VIRTUAL_DISK_VERSION_2`: `MERGE_VIRTUAL_DISK_VERSION` = 2;
public const val `MERGE_VIRTUAL_DISK_VERSION_UNSPECIFIED`: `MERGE_VIRTUAL_DISK_VERSION` = 0;
public typealias `MIRROR_VIRTUAL_DISK_FLAG` = Int;
public const val `MIRROR_VIRTUAL_DISK_FLAG_ENABLE_SMB_COMPRESSION`: `MIRROR_VIRTUAL_DISK_FLAG` = 4;
public const val `MIRROR_VIRTUAL_DISK_FLAG_EXISTING_FILE`: `MIRROR_VIRTUAL_DISK_FLAG` = 1;
public const val `MIRROR_VIRTUAL_DISK_FLAG_IS_LIVE_MIGRATION`: `MIRROR_VIRTUAL_DISK_FLAG` = 8;
public const val `MIRROR_VIRTUAL_DISK_FLAG_NONE`: `MIRROR_VIRTUAL_DISK_FLAG` = 0;
public const val `MIRROR_VIRTUAL_DISK_FLAG_SKIP_MIRROR_ACTIVATION`: `MIRROR_VIRTUAL_DISK_FLAG` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIRROR_VIRTUAL_DISK_PARAMETERS` (
    public var `Version`: `MIRROR_VIRTUAL_DISK_VERSION`,
    public var `Anonymous`: `MIRROR_VIRTUAL_DISK_PARAMETERS_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIRROR_VIRTUAL_DISK_PARAMETERS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIRROR_VIRTUAL_DISK_PARAMETERS`.Companion.`default`() : `MIRROR_VIRTUAL_DISK_PARAMETERS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 551:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIRROR_VIRTUAL_DISK_PARAMETERS_0 {
//     pub Version1: MIRROR_VIRTUAL_DISK_PARAMETERS_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIRROR_VIRTUAL_DISK_PARAMETERS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIRROR_VIRTUAL_DISK_PARAMETERS_0`.Companion.`default`() : `MIRROR_VIRTUAL_DISK_PARAMETERS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIRROR_VIRTUAL_DISK_PARAMETERS_0_0` (
    public var `MirrorVirtualDiskPath`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIRROR_VIRTUAL_DISK_PARAMETERS_0_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIRROR_VIRTUAL_DISK_PARAMETERS_0_0`.Companion.`default`() : `MIRROR_VIRTUAL_DISK_PARAMETERS_0_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `MIRROR_VIRTUAL_DISK_VERSION` = Int;
public const val `MIRROR_VIRTUAL_DISK_VERSION_1`: `MIRROR_VIRTUAL_DISK_VERSION` = 1;
public const val `MIRROR_VIRTUAL_DISK_VERSION_UNSPECIFIED`: `MIRROR_VIRTUAL_DISK_VERSION` = 0;
public const val `MODIFY_VHDSET_DEFAULT_SNAPSHOT_PATH`: `MODIFY_VHDSET_VERSION` = 3;
public typealias `MODIFY_VHDSET_FLAG` = Int;
public const val `MODIFY_VHDSET_FLAG_NONE`: `MODIFY_VHDSET_FLAG` = 0;
public const val `MODIFY_VHDSET_FLAG_WRITEABLE_SNAPSHOT`: `MODIFY_VHDSET_FLAG` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MODIFY_VHDSET_PARAMETERS` (
    public var `Version`: `MODIFY_VHDSET_VERSION`,
    public var `Anonymous`: `MODIFY_VHDSET_PARAMETERS_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MODIFY_VHDSET_PARAMETERS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MODIFY_VHDSET_PARAMETERS`.Companion.`default`() : `MODIFY_VHDSET_PARAMETERS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 589:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MODIFY_VHDSET_PARAMETERS_0 {
//     pub SnapshotPath: MODIFY_VHDSET_PARAMETERS_0_0,
//     pub SnapshotId: windows_sys::core::GUID,
//     pub DefaultFilePath: windows_sys::core::PCWSTR,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MODIFY_VHDSET_PARAMETERS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MODIFY_VHDSET_PARAMETERS_0`.Companion.`default`() : `MODIFY_VHDSET_PARAMETERS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MODIFY_VHDSET_PARAMETERS_0_0` (
    public var `SnapshotId`: `windows_sys`.`core`.`GUID`,
    public var `SnapshotFilePath`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MODIFY_VHDSET_PARAMETERS_0_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MODIFY_VHDSET_PARAMETERS_0_0`.Companion.`default`() : `MODIFY_VHDSET_PARAMETERS_0_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `MODIFY_VHDSET_REMOVE_SNAPSHOT`: `MODIFY_VHDSET_VERSION` = 2;
public const val `MODIFY_VHDSET_SNAPSHOT_PATH`: `MODIFY_VHDSET_VERSION` = 1;
public const val `MODIFY_VHDSET_UNSPECIFIED`: `MODIFY_VHDSET_VERSION` = 0;
public typealias `MODIFY_VHDSET_VERSION` = Int;
public typealias `OPEN_VIRTUAL_DISK_FLAG` = Int;
public const val `OPEN_VIRTUAL_DISK_FLAG_BLANK_FILE`: `OPEN_VIRTUAL_DISK_FLAG` = 2;
public const val `OPEN_VIRTUAL_DISK_FLAG_BOOT_DRIVE`: `OPEN_VIRTUAL_DISK_FLAG` = 4;
public const val `OPEN_VIRTUAL_DISK_FLAG_CACHED_IO`: `OPEN_VIRTUAL_DISK_FLAG` = 8;
public const val `OPEN_VIRTUAL_DISK_FLAG_CUSTOM_DIFF_CHAIN`: `OPEN_VIRTUAL_DISK_FLAG` = 16;
public const val `OPEN_VIRTUAL_DISK_FLAG_IGNORE_RELATIVE_PARENT_LOCATOR`: `OPEN_VIRTUAL_DISK_FLAG` = 128;
public const val `OPEN_VIRTUAL_DISK_FLAG_NONE`: `OPEN_VIRTUAL_DISK_FLAG` = 0;
public const val `OPEN_VIRTUAL_DISK_FLAG_NO_PARENTS`: `OPEN_VIRTUAL_DISK_FLAG` = 1;
public const val `OPEN_VIRTUAL_DISK_FLAG_NO_WRITE_HARDENING`: `OPEN_VIRTUAL_DISK_FLAG` = 256;
public const val `OPEN_VIRTUAL_DISK_FLAG_PARENT_CACHED_IO`: `OPEN_VIRTUAL_DISK_FLAG` = 32;
public const val `OPEN_VIRTUAL_DISK_FLAG_SUPPORT_COMPRESSED_VOLUMES`: `OPEN_VIRTUAL_DISK_FLAG` = 512;
public const val `OPEN_VIRTUAL_DISK_FLAG_SUPPORT_ENCRYPTED_FILES`: `OPEN_VIRTUAL_DISK_FLAG` = 2048;
public const val `OPEN_VIRTUAL_DISK_FLAG_SUPPORT_SPARSE_FILES_ANY_FS`: `OPEN_VIRTUAL_DISK_FLAG` = 1024;
public const val `OPEN_VIRTUAL_DISK_FLAG_VHDSET_FILE_ONLY`: `OPEN_VIRTUAL_DISK_FLAG` = 64;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OPEN_VIRTUAL_DISK_PARAMETERS` (
    public var `Version`: `OPEN_VIRTUAL_DISK_VERSION`,
    public var `Anonymous`: `OPEN_VIRTUAL_DISK_PARAMETERS_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OPEN_VIRTUAL_DISK_PARAMETERS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `OPEN_VIRTUAL_DISK_PARAMETERS`.Companion.`default`() : `OPEN_VIRTUAL_DISK_PARAMETERS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 641:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union OPEN_VIRTUAL_DISK_PARAMETERS_0 {
//     pub Version1: OPEN_VIRTUAL_DISK_PARAMETERS_0_0,
//     pub Version2: OPEN_VIRTUAL_DISK_PARAMETERS_0_1,
//     pub Version3: OPEN_VIRTUAL_DISK_PARAMETERS_0_2,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OPEN_VIRTUAL_DISK_PARAMETERS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `OPEN_VIRTUAL_DISK_PARAMETERS_0`.Companion.`default`() : `OPEN_VIRTUAL_DISK_PARAMETERS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OPEN_VIRTUAL_DISK_PARAMETERS_0_0` (
    public var `RWDepth`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OPEN_VIRTUAL_DISK_PARAMETERS_0_1` (
    public var `GetInfoOnly`: `windows_sys`.`core`.`BOOL`,
    public var `ReadOnly`: `windows_sys`.`core`.`BOOL`,
    public var `ResiliencyGuid`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OPEN_VIRTUAL_DISK_PARAMETERS_0_2` (
    public var `GetInfoOnly`: `windows_sys`.`core`.`BOOL`,
    public var `ReadOnly`: `windows_sys`.`core`.`BOOL`,
    public var `ResiliencyGuid`: `windows_sys`.`core`.`GUID`,
    public var `SnapshotId`: `windows_sys`.`core`.`GUID`,
)
public const val `OPEN_VIRTUAL_DISK_RW_DEPTH_DEFAULT`: UInt = 1u;
public typealias `OPEN_VIRTUAL_DISK_VERSION` = Int;
public const val `OPEN_VIRTUAL_DISK_VERSION_1`: `OPEN_VIRTUAL_DISK_VERSION` = 1;
public const val `OPEN_VIRTUAL_DISK_VERSION_2`: `OPEN_VIRTUAL_DISK_VERSION` = 2;
public const val `OPEN_VIRTUAL_DISK_VERSION_3`: `OPEN_VIRTUAL_DISK_VERSION` = 3;
public const val `OPEN_VIRTUAL_DISK_VERSION_UNSPECIFIED`: `OPEN_VIRTUAL_DISK_VERSION` = 0;
public typealias `QUERY_CHANGES_VIRTUAL_DISK_FLAG` = Int;
public const val `QUERY_CHANGES_VIRTUAL_DISK_FLAG_NONE`: `QUERY_CHANGES_VIRTUAL_DISK_FLAG` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `QUERY_CHANGES_VIRTUAL_DISK_RANGE` (
    public var `ByteOffset`: ULong,
    public var `ByteLength`: ULong,
    public var `Reserved`: ULong,
)
public typealias `RAW_SCSI_VIRTUAL_DISK_FLAG` = Int;
public const val `RAW_SCSI_VIRTUAL_DISK_FLAG_NONE`: `RAW_SCSI_VIRTUAL_DISK_FLAG` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RAW_SCSI_VIRTUAL_DISK_PARAMETERS` (
    public var `Version`: `RAW_SCSI_VIRTUAL_DISK_VERSION`,
    public var `Anonymous`: `RAW_SCSI_VIRTUAL_DISK_PARAMETERS_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RAW_SCSI_VIRTUAL_DISK_PARAMETERS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RAW_SCSI_VIRTUAL_DISK_PARAMETERS`.Companion.`default`() : `RAW_SCSI_VIRTUAL_DISK_PARAMETERS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 701:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RAW_SCSI_VIRTUAL_DISK_PARAMETERS_0 {
//     pub Version1: RAW_SCSI_VIRTUAL_DISK_PARAMETERS_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RAW_SCSI_VIRTUAL_DISK_PARAMETERS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RAW_SCSI_VIRTUAL_DISK_PARAMETERS_0`.Companion.`default`() : `RAW_SCSI_VIRTUAL_DISK_PARAMETERS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RAW_SCSI_VIRTUAL_DISK_PARAMETERS_0_0` (
    public var `RSVDHandle`: `windows_sys`.`core`.`BOOL`,
    public var `DataIn`: UByte,
    public var `CdbLength`: UByte,
    public var `SenseInfoLength`: UByte,
    public var `SrbFlags`: UInt,
    public var `DataTransferLength`: UInt,
    public var `DataBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `SenseInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `Cdb`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RAW_SCSI_VIRTUAL_DISK_PARAMETERS_0_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RAW_SCSI_VIRTUAL_DISK_PARAMETERS_0_0`.Companion.`default`() : `RAW_SCSI_VIRTUAL_DISK_PARAMETERS_0_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RAW_SCSI_VIRTUAL_DISK_RESPONSE` (
    public var `Version`: `RAW_SCSI_VIRTUAL_DISK_VERSION`,
    public var `Anonymous`: `RAW_SCSI_VIRTUAL_DISK_RESPONSE_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RAW_SCSI_VIRTUAL_DISK_RESPONSE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RAW_SCSI_VIRTUAL_DISK_RESPONSE`.Companion.`default`() : `RAW_SCSI_VIRTUAL_DISK_RESPONSE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 740:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RAW_SCSI_VIRTUAL_DISK_RESPONSE_0 {
//     pub Version1: RAW_SCSI_VIRTUAL_DISK_RESPONSE_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RAW_SCSI_VIRTUAL_DISK_RESPONSE_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RAW_SCSI_VIRTUAL_DISK_RESPONSE_0`.Companion.`default`() : `RAW_SCSI_VIRTUAL_DISK_RESPONSE_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RAW_SCSI_VIRTUAL_DISK_RESPONSE_0_0` (
    public var `ScsiStatus`: UByte,
    public var `SenseInfoLength`: UByte,
    public var `DataTransferLength`: UInt,
)
public typealias `RAW_SCSI_VIRTUAL_DISK_VERSION` = Int;
public const val `RAW_SCSI_VIRTUAL_DISK_VERSION_1`: `RAW_SCSI_VIRTUAL_DISK_VERSION` = 1;
public const val `RAW_SCSI_VIRTUAL_DISK_VERSION_UNSPECIFIED`: `RAW_SCSI_VIRTUAL_DISK_VERSION` = 0;
public typealias `RESIZE_VIRTUAL_DISK_FLAG` = Int;
public const val `RESIZE_VIRTUAL_DISK_FLAG_ALLOW_UNSAFE_VIRTUAL_SIZE`: `RESIZE_VIRTUAL_DISK_FLAG` = 1;
public const val `RESIZE_VIRTUAL_DISK_FLAG_NONE`: `RESIZE_VIRTUAL_DISK_FLAG` = 0;
public const val `RESIZE_VIRTUAL_DISK_FLAG_RESIZE_TO_SMALLEST_SAFE_VIRTUAL_SIZE`: `RESIZE_VIRTUAL_DISK_FLAG` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RESIZE_VIRTUAL_DISK_PARAMETERS` (
    public var `Version`: `RESIZE_VIRTUAL_DISK_VERSION`,
    public var `Anonymous`: `RESIZE_VIRTUAL_DISK_PARAMETERS_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RESIZE_VIRTUAL_DISK_PARAMETERS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RESIZE_VIRTUAL_DISK_PARAMETERS`.Companion.`default`() : `RESIZE_VIRTUAL_DISK_PARAMETERS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 775:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RESIZE_VIRTUAL_DISK_PARAMETERS_0 {
//     pub Version1: RESIZE_VIRTUAL_DISK_PARAMETERS_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RESIZE_VIRTUAL_DISK_PARAMETERS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RESIZE_VIRTUAL_DISK_PARAMETERS_0`.Companion.`default`() : `RESIZE_VIRTUAL_DISK_PARAMETERS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RESIZE_VIRTUAL_DISK_PARAMETERS_0_0` (
    public var `NewSize`: ULong,
)
public typealias `RESIZE_VIRTUAL_DISK_VERSION` = Int;
public const val `RESIZE_VIRTUAL_DISK_VERSION_1`: `RESIZE_VIRTUAL_DISK_VERSION` = 1;
public const val `RESIZE_VIRTUAL_DISK_VERSION_UNSPECIFIED`: `RESIZE_VIRTUAL_DISK_VERSION` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SET_VIRTUAL_DISK_INFO` (
    public var `Version`: `SET_VIRTUAL_DISK_INFO_VERSION`,
    public var `Anonymous`: `SET_VIRTUAL_DISK_INFO_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SET_VIRTUAL_DISK_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SET_VIRTUAL_DISK_INFO`.Companion.`default`() : `SET_VIRTUAL_DISK_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 804:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SET_VIRTUAL_DISK_INFO_0 {
//     pub ParentFilePath: windows_sys::core::PCWSTR,
//     pub UniqueIdentifier: windows_sys::core::GUID,
//     pub ParentPathWithDepthInfo: SET_VIRTUAL_DISK_INFO_0_0,
//     pub VhdPhysicalSectorSize: u32,
//     pub VirtualDiskId: windows_sys::core::GUID,
//     pub ChangeTrackingEnabled: windows_sys::core::BOOL,
//     pub ParentLocator: SET_VIRTUAL_DISK_INFO_0_1,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SET_VIRTUAL_DISK_INFO_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SET_VIRTUAL_DISK_INFO_0`.Companion.`default`() : `SET_VIRTUAL_DISK_INFO_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SET_VIRTUAL_DISK_INFO_0_1` (
    public var `LinkageId`: `windows_sys`.`core`.`GUID`,
    public var `ParentFilePath`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SET_VIRTUAL_DISK_INFO_0_1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SET_VIRTUAL_DISK_INFO_0_1`.Companion.`default`() : `SET_VIRTUAL_DISK_INFO_0_1` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SET_VIRTUAL_DISK_INFO_0_0` (
    public var `ChildDepth`: UInt,
    public var `ParentFilePath`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SET_VIRTUAL_DISK_INFO_0_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SET_VIRTUAL_DISK_INFO_0_0`.Companion.`default`() : `SET_VIRTUAL_DISK_INFO_0_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `SET_VIRTUAL_DISK_INFO_CHANGE_TRACKING_STATE`: `SET_VIRTUAL_DISK_INFO_VERSION` = 6;
public const val `SET_VIRTUAL_DISK_INFO_IDENTIFIER`: `SET_VIRTUAL_DISK_INFO_VERSION` = 2;
public const val `SET_VIRTUAL_DISK_INFO_PARENT_LOCATOR`: `SET_VIRTUAL_DISK_INFO_VERSION` = 7;
public const val `SET_VIRTUAL_DISK_INFO_PARENT_PATH`: `SET_VIRTUAL_DISK_INFO_VERSION` = 1;
public const val `SET_VIRTUAL_DISK_INFO_PARENT_PATH_WITH_DEPTH`: `SET_VIRTUAL_DISK_INFO_VERSION` = 3;
public const val `SET_VIRTUAL_DISK_INFO_PHYSICAL_SECTOR_SIZE`: `SET_VIRTUAL_DISK_INFO_VERSION` = 4;
public const val `SET_VIRTUAL_DISK_INFO_UNSPECIFIED`: `SET_VIRTUAL_DISK_INFO_VERSION` = 0;
public typealias `SET_VIRTUAL_DISK_INFO_VERSION` = Int;
public const val `SET_VIRTUAL_DISK_INFO_VIRTUAL_DISK_ID`: `SET_VIRTUAL_DISK_INFO_VERSION` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_DEPENDENCY_INFO` (
    public var `Version`: `STORAGE_DEPENDENCY_INFO_VERSION`,
    public var `NumberEntries`: UInt,
    public var `Anonymous`: `STORAGE_DEPENDENCY_INFO_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `STORAGE_DEPENDENCY_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `STORAGE_DEPENDENCY_INFO`.Companion.`default`() : `STORAGE_DEPENDENCY_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 863:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union STORAGE_DEPENDENCY_INFO_0 {
//     pub Version1Entries: [STORAGE_DEPENDENCY_INFO_TYPE_1; 1],
//     pub Version2Entries: [STORAGE_DEPENDENCY_INFO_TYPE_2; 1],
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `STORAGE_DEPENDENCY_INFO_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `STORAGE_DEPENDENCY_INFO_0`.Companion.`default`() : `STORAGE_DEPENDENCY_INFO_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_DEPENDENCY_INFO_TYPE_1` (
    public var `DependencyTypeFlags`: `DEPENDENT_DISK_FLAG`,
    public var `ProviderSpecificFlags`: UInt,
    public var `VirtualStorageType`: `VIRTUAL_STORAGE_TYPE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_DEPENDENCY_INFO_TYPE_2` (
    public var `DependencyTypeFlags`: `DEPENDENT_DISK_FLAG`,
    public var `ProviderSpecificFlags`: UInt,
    public var `VirtualStorageType`: `VIRTUAL_STORAGE_TYPE`,
    public var `AncestorLevel`: UInt,
    public var `DependencyDeviceName`: `windows_sys`.`core`.`PWSTR`,
    public var `HostVolumeName`: `windows_sys`.`core`.`PWSTR`,
    public var `DependentVolumeName`: `windows_sys`.`core`.`PWSTR`,
    public var `DependentVolumeRelativePath`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `STORAGE_DEPENDENCY_INFO_TYPE_2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `STORAGE_DEPENDENCY_INFO_TYPE_2`.Companion.`default`() : `STORAGE_DEPENDENCY_INFO_TYPE_2` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `STORAGE_DEPENDENCY_INFO_VERSION` = Int;
public const val `STORAGE_DEPENDENCY_INFO_VERSION_1`: `STORAGE_DEPENDENCY_INFO_VERSION` = 1;
public const val `STORAGE_DEPENDENCY_INFO_VERSION_2`: `STORAGE_DEPENDENCY_INFO_VERSION` = 2;
public const val `STORAGE_DEPENDENCY_INFO_VERSION_UNSPECIFIED`: `STORAGE_DEPENDENCY_INFO_VERSION` = 0;
public typealias `TAKE_SNAPSHOT_VHDSET_FLAG` = Int;
public const val `TAKE_SNAPSHOT_VHDSET_FLAG_NONE`: `TAKE_SNAPSHOT_VHDSET_FLAG` = 0;
public const val `TAKE_SNAPSHOT_VHDSET_FLAG_WRITEABLE`: `TAKE_SNAPSHOT_VHDSET_FLAG` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TAKE_SNAPSHOT_VHDSET_PARAMETERS` (
    public var `Version`: `TAKE_SNAPSHOT_VHDSET_VERSION`,
    public var `Anonymous`: `TAKE_SNAPSHOT_VHDSET_PARAMETERS_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TAKE_SNAPSHOT_VHDSET_PARAMETERS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `TAKE_SNAPSHOT_VHDSET_PARAMETERS`.Companion.`default`() : `TAKE_SNAPSHOT_VHDSET_PARAMETERS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 916:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union TAKE_SNAPSHOT_VHDSET_PARAMETERS_0 {
//     pub Version1: TAKE_SNAPSHOT_VHDSET_PARAMETERS_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TAKE_SNAPSHOT_VHDSET_PARAMETERS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `TAKE_SNAPSHOT_VHDSET_PARAMETERS_0`.Companion.`default`() : `TAKE_SNAPSHOT_VHDSET_PARAMETERS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TAKE_SNAPSHOT_VHDSET_PARAMETERS_0_0` (
    public var `SnapshotId`: `windows_sys`.`core`.`GUID`,
)
public typealias `TAKE_SNAPSHOT_VHDSET_VERSION` = Int;
public const val `TAKE_SNAPSHOT_VHDSET_VERSION_1`: `TAKE_SNAPSHOT_VHDSET_VERSION` = 1;
public const val `TAKE_SNAPSHOT_VHDSET_VERSION_UNSPECIFIED`: `TAKE_SNAPSHOT_VHDSET_VERSION` = 0;
public const val `VIRTUAL_DISK_ACCESS_ALL`: `VIRTUAL_DISK_ACCESS_MASK` = 4128768;
public const val `VIRTUAL_DISK_ACCESS_ATTACH_RO`: `VIRTUAL_DISK_ACCESS_MASK` = 65536;
public const val `VIRTUAL_DISK_ACCESS_ATTACH_RW`: `VIRTUAL_DISK_ACCESS_MASK` = 131072;
public const val `VIRTUAL_DISK_ACCESS_CREATE`: `VIRTUAL_DISK_ACCESS_MASK` = 1048576;
public const val `VIRTUAL_DISK_ACCESS_DETACH`: `VIRTUAL_DISK_ACCESS_MASK` = 262144;
public const val `VIRTUAL_DISK_ACCESS_GET_INFO`: `VIRTUAL_DISK_ACCESS_MASK` = 524288;
public typealias `VIRTUAL_DISK_ACCESS_MASK` = Int;
public const val `VIRTUAL_DISK_ACCESS_METAOPS`: `VIRTUAL_DISK_ACCESS_MASK` = 2097152;
public const val `VIRTUAL_DISK_ACCESS_NONE`: `VIRTUAL_DISK_ACCESS_MASK` = 0;
public const val `VIRTUAL_DISK_ACCESS_READ`: `VIRTUAL_DISK_ACCESS_MASK` = 851968;
public const val `VIRTUAL_DISK_ACCESS_WRITABLE`: `VIRTUAL_DISK_ACCESS_MASK` = 3276800;
public const val `VIRTUAL_DISK_MAXIMUM_CHANGE_TRACKING_ID_LENGTH`: UInt = 256u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIRTUAL_DISK_PROGRESS` (
    public var `OperationStatus`: UInt,
    public var `CurrentValue`: ULong,
    public var `CompletionValue`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIRTUAL_STORAGE_TYPE` (
    public var `DeviceId`: UInt,
    public var `VendorId`: `windows_sys`.`core`.`GUID`,
)
public const val `VIRTUAL_STORAGE_TYPE_DEVICE_ISO`: UInt = 1u;
public const val `VIRTUAL_STORAGE_TYPE_DEVICE_UNKNOWN`: UInt = 0u;
public const val `VIRTUAL_STORAGE_TYPE_DEVICE_VHD`: UInt = 2u;
public const val `VIRTUAL_STORAGE_TYPE_DEVICE_VHDSET`: UInt = 4u;
public const val `VIRTUAL_STORAGE_TYPE_DEVICE_VHDX`: UInt = 3u;
// UNSUPPORTED Rust 964:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const VIRTUAL_STORAGE_TYPE_VENDOR_MICROSOFT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xec984aec_a0f9_47e9_901f_71415a66345b);

// UNSUPPORTED Rust 965:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const VIRTUAL_STORAGE_TYPE_VENDOR_UNKNOWN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000000);

