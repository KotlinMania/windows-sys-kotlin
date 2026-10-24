// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=PssCaptureSnapshot; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PssCaptureSnapshot`(`processhandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `captureflags` : `PSS_CAPTURE_FLAGS`, `threadcontextflags` : UInt, `snapshothandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HPSS`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=PssDuplicateSnapshot; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PssDuplicateSnapshot`(`sourceprocesshandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `snapshothandle` : `HPSS`, `targetprocesshandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `targetsnapshothandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HPSS`>?, `flags` : `PSS_DUPLICATE_FLAGS`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=PssFreeSnapshot; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PssFreeSnapshot`(`processhandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `snapshothandle` : `HPSS`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=PssQuerySnapshot; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PssQuerySnapshot`(`snapshothandle` : `HPSS`, `informationclass` : `PSS_QUERY_INFORMATION_CLASS`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=PssWalkMarkerCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PssWalkMarkerCreate`(`allocator` : /* Rust *const */ kotlinx.cinterop.CPointer<`PSS_ALLOCATOR`>?, `walkmarkerhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HPSSWALK`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=PssWalkMarkerFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PssWalkMarkerFree`(`walkmarkerhandle` : `HPSSWALK`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=PssWalkMarkerGetPosition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PssWalkMarkerGetPosition`(`walkmarkerhandle` : `HPSSWALK`, `position` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=PssWalkMarkerSeekToBeginning; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PssWalkMarkerSeekToBeginning`(`walkmarkerhandle` : `HPSSWALK`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=PssWalkMarkerSetPosition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PssWalkMarkerSetPosition`(`walkmarkerhandle` : `HPSSWALK`, `position` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=PssWalkSnapshot; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PssWalkSnapshot`(`snapshothandle` : `HPSS`, `informationclass` : `PSS_WALK_INFORMATION_CLASS`, `walkmarkerhandle` : `HPSSWALK`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : UInt) : UInt
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HPSS` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HPSSWALK` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PSS_ALLOCATOR` (
    public var `Context`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `AllocRoutine`: Long,
    public var `FreeRoutine`: Long,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PSS_ALLOCATOR`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PSS_ALLOCATOR`.Companion.`default`() : `PSS_ALLOCATOR` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PSS_AUXILIARY_PAGES_INFORMATION` (
    public var `AuxPagesCaptured`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Memory")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PSS_AUXILIARY_PAGE_ENTRY` (
    public var `Address`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `BasicInformation`: `super`.`super`.`Memory`.`MEMORY_BASIC_INFORMATION`,
    public var `CaptureTime`: `super`.`super`.`super`.`Foundation`.`FILETIME`,
    public var `PageContents`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `PageSize`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PSS_AUXILIARY_PAGE_ENTRY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Memory")]

    public fun `PSS_AUXILIARY_PAGE_ENTRY`.Companion.`default`() : `PSS_AUXILIARY_PAGE_ENTRY` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `PSS_CAPTURE_FLAGS` = UInt;
public const val `PSS_CAPTURE_HANDLES`: `PSS_CAPTURE_FLAGS` = 4u;
public const val `PSS_CAPTURE_HANDLE_BASIC_INFORMATION`: `PSS_CAPTURE_FLAGS` = 16u;
public const val `PSS_CAPTURE_HANDLE_NAME_INFORMATION`: `PSS_CAPTURE_FLAGS` = 8u;
public const val `PSS_CAPTURE_HANDLE_TRACE`: `PSS_CAPTURE_FLAGS` = 64u;
public const val `PSS_CAPTURE_HANDLE_TYPE_SPECIFIC_INFORMATION`: `PSS_CAPTURE_FLAGS` = 32u;
public const val `PSS_CAPTURE_IPT_TRACE`: `PSS_CAPTURE_FLAGS` = 8192u;
public const val `PSS_CAPTURE_NONE`: `PSS_CAPTURE_FLAGS` = 0u;
public const val `PSS_CAPTURE_RESERVED_00000002`: `PSS_CAPTURE_FLAGS` = 2u;
public const val `PSS_CAPTURE_RESERVED_00000400`: `PSS_CAPTURE_FLAGS` = 1024u;
public const val `PSS_CAPTURE_RESERVED_00004000`: `PSS_CAPTURE_FLAGS` = 16384u;
public const val `PSS_CAPTURE_THREADS`: `PSS_CAPTURE_FLAGS` = 128u;
public const val `PSS_CAPTURE_THREAD_CONTEXT`: `PSS_CAPTURE_FLAGS` = 256u;
public const val `PSS_CAPTURE_THREAD_CONTEXT_EXTENDED`: `PSS_CAPTURE_FLAGS` = 512u;
public const val `PSS_CAPTURE_VA_CLONE`: `PSS_CAPTURE_FLAGS` = 1u;
public const val `PSS_CAPTURE_VA_SPACE`: `PSS_CAPTURE_FLAGS` = 2048u;
public const val `PSS_CAPTURE_VA_SPACE_SECTION_INFORMATION`: `PSS_CAPTURE_FLAGS` = 4096u;
public const val `PSS_CREATE_BREAKAWAY`: `PSS_CAPTURE_FLAGS` = 134217728u;
public const val `PSS_CREATE_BREAKAWAY_OPTIONAL`: `PSS_CAPTURE_FLAGS` = 67108864u;
public const val `PSS_CREATE_FORCE_BREAKAWAY`: `PSS_CAPTURE_FLAGS` = 268435456u;
public const val `PSS_CREATE_MEASURE_PERFORMANCE`: `PSS_CAPTURE_FLAGS` = 1073741824u;
public const val `PSS_CREATE_RELEASE_SECTION`: `PSS_CAPTURE_FLAGS` = 2147483648u;
public const val `PSS_CREATE_USE_VM_ALLOCATIONS`: `PSS_CAPTURE_FLAGS` = 536870912u;
public const val `PSS_DUPLICATE_CLOSE_SOURCE`: `PSS_DUPLICATE_FLAGS` = 1;
public typealias `PSS_DUPLICATE_FLAGS` = Int;
public const val `PSS_DUPLICATE_NONE`: `PSS_DUPLICATE_FLAGS` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PSS_HANDLE_ENTRY` (
    public var `Handle`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `Flags`: `PSS_HANDLE_FLAGS`,
    public var `ObjectType`: `PSS_OBJECT_TYPE`,
    public var `CaptureTime`: `super`.`super`.`super`.`Foundation`.`FILETIME`,
    public var `Attributes`: UInt,
    public var `GrantedAccess`: UInt,
    public var `HandleCount`: UInt,
    public var `PointerCount`: UInt,
    public var `PagedPoolCharge`: UInt,
    public var `NonPagedPoolCharge`: UInt,
    public var `CreationTime`: `super`.`super`.`super`.`Foundation`.`FILETIME`,
    public var `TypeNameLength`: UShort,
    public var `TypeName`: `windows_sys`.`core`.`PCWSTR`,
    public var `ObjectNameLength`: UShort,
    public var `ObjectName`: `windows_sys`.`core`.`PCWSTR`,
    public var `TypeSpecificInformation`: `PSS_HANDLE_ENTRY_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PSS_HANDLE_ENTRY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PSS_HANDLE_ENTRY`.Companion.`default`() : `PSS_HANDLE_ENTRY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 97:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PSS_HANDLE_ENTRY_0 {
//     pub Process: PSS_HANDLE_ENTRY_0_0,
//     pub Thread: PSS_HANDLE_ENTRY_0_1,
//     pub Mutant: PSS_HANDLE_ENTRY_0_2,
//     pub Event: PSS_HANDLE_ENTRY_0_3,
//     pub Section: PSS_HANDLE_ENTRY_0_4,
//     pub Semaphore: PSS_HANDLE_ENTRY_0_5,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PSS_HANDLE_ENTRY_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PSS_HANDLE_ENTRY_0`.Companion.`default`() : `PSS_HANDLE_ENTRY_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PSS_HANDLE_ENTRY_0_3` (
    public var `ManualReset`: `windows_sys`.`core`.`BOOL`,
    public var `Signaled`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PSS_HANDLE_ENTRY_0_2` (
    public var `CurrentCount`: Int,
    public var `Abandoned`: `windows_sys`.`core`.`BOOL`,
    public var `OwnerProcessId`: UInt,
    public var `OwnerThreadId`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PSS_HANDLE_ENTRY_0_0` (
    public var `ExitStatus`: UInt,
    public var `PebBaseAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `AffinityMask`: ULong,
    public var `BasePriority`: Int,
    public var `ProcessId`: UInt,
    public var `ParentProcessId`: UInt,
    public var `Flags`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PSS_HANDLE_ENTRY_0_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PSS_HANDLE_ENTRY_0_0`.Companion.`default`() : `PSS_HANDLE_ENTRY_0_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PSS_HANDLE_ENTRY_0_4` (
    public var `BaseAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `AllocationAttributes`: UInt,
    public var `MaximumSize`: Long,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PSS_HANDLE_ENTRY_0_4`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PSS_HANDLE_ENTRY_0_4`.Companion.`default`() : `PSS_HANDLE_ENTRY_0_4` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PSS_HANDLE_ENTRY_0_5` (
    public var `CurrentCount`: Int,
    public var `MaximumCount`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PSS_HANDLE_ENTRY_0_1` (
    public var `ExitStatus`: UInt,
    public var `TebBaseAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ProcessId`: UInt,
    public var `ThreadId`: UInt,
    public var `AffinityMask`: ULong,
    public var `Priority`: Int,
    public var `BasePriority`: Int,
    public var `Win32StartAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PSS_HANDLE_ENTRY_0_1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PSS_HANDLE_ENTRY_0_1`.Companion.`default`() : `PSS_HANDLE_ENTRY_0_1` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `PSS_HANDLE_FLAGS` = Int;
public const val `PSS_HANDLE_HAVE_BASIC_INFORMATION`: `PSS_HANDLE_FLAGS` = 4;
public const val `PSS_HANDLE_HAVE_NAME`: `PSS_HANDLE_FLAGS` = 2;
public const val `PSS_HANDLE_HAVE_TYPE`: `PSS_HANDLE_FLAGS` = 1;
public const val `PSS_HANDLE_HAVE_TYPE_SPECIFIC_INFORMATION`: `PSS_HANDLE_FLAGS` = 8;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PSS_HANDLE_INFORMATION` (
    public var `HandlesCaptured`: UInt,
)
public const val `PSS_HANDLE_NONE`: `PSS_HANDLE_FLAGS` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PSS_HANDLE_TRACE_INFORMATION` (
    public var `SectionHandle`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `Size`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PSS_HANDLE_TRACE_INFORMATION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PSS_HANDLE_TRACE_INFORMATION`.Companion.`default`() : `PSS_HANDLE_TRACE_INFORMATION` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `PSS_OBJECT_TYPE` = Int;
public const val `PSS_OBJECT_TYPE_EVENT`: `PSS_OBJECT_TYPE` = 4;
public const val `PSS_OBJECT_TYPE_MUTANT`: `PSS_OBJECT_TYPE` = 3;
public const val `PSS_OBJECT_TYPE_PROCESS`: `PSS_OBJECT_TYPE` = 1;
public const val `PSS_OBJECT_TYPE_SECTION`: `PSS_OBJECT_TYPE` = 5;
public const val `PSS_OBJECT_TYPE_SEMAPHORE`: `PSS_OBJECT_TYPE` = 6;
public const val `PSS_OBJECT_TYPE_THREAD`: `PSS_OBJECT_TYPE` = 2;
public const val `PSS_OBJECT_TYPE_UNKNOWN`: `PSS_OBJECT_TYPE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PSS_PERFORMANCE_COUNTERS` (
    public var `TotalCycleCount`: ULong,
    public var `TotalWallClockPeriod`: ULong,
    public var `VaCloneCycleCount`: ULong,
    public var `VaCloneWallClockPeriod`: ULong,
    public var `VaSpaceCycleCount`: ULong,
    public var `VaSpaceWallClockPeriod`: ULong,
    public var `AuxPagesCycleCount`: ULong,
    public var `AuxPagesWallClockPeriod`: ULong,
    public var `HandlesCycleCount`: ULong,
    public var `HandlesWallClockPeriod`: ULong,
    public var `ThreadsCycleCount`: ULong,
    public var `ThreadsWallClockPeriod`: ULong,
)
public const val `PSS_PERF_RESOLUTION`: UInt = 1000000u;
public typealias `PSS_PROCESS_FLAGS` = Int;
public const val `PSS_PROCESS_FLAGS_FROZEN`: `PSS_PROCESS_FLAGS` = 16;
public const val `PSS_PROCESS_FLAGS_NONE`: `PSS_PROCESS_FLAGS` = 0;
public const val `PSS_PROCESS_FLAGS_PROTECTED`: `PSS_PROCESS_FLAGS` = 1;
public const val `PSS_PROCESS_FLAGS_RESERVED_03`: `PSS_PROCESS_FLAGS` = 4;
public const val `PSS_PROCESS_FLAGS_RESERVED_04`: `PSS_PROCESS_FLAGS` = 8;
public const val `PSS_PROCESS_FLAGS_WOW64`: `PSS_PROCESS_FLAGS` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PSS_PROCESS_INFORMATION` (
    public var `ExitStatus`: UInt,
    public var `PebBaseAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `AffinityMask`: ULong,
    public var `BasePriority`: Int,
    public var `ProcessId`: UInt,
    public var `ParentProcessId`: UInt,
    public var `Flags`: `PSS_PROCESS_FLAGS`,
    public var `CreateTime`: `super`.`super`.`super`.`Foundation`.`FILETIME`,
    public var `ExitTime`: `super`.`super`.`super`.`Foundation`.`FILETIME`,
    public var `KernelTime`: `super`.`super`.`super`.`Foundation`.`FILETIME`,
    public var `UserTime`: `super`.`super`.`super`.`Foundation`.`FILETIME`,
    public var `PriorityClass`: UInt,
    public var `PeakVirtualSize`: ULong,
    public var `VirtualSize`: ULong,
    public var `PageFaultCount`: UInt,
    public var `PeakWorkingSetSize`: ULong,
    public var `WorkingSetSize`: ULong,
    public var `QuotaPeakPagedPoolUsage`: ULong,
    public var `QuotaPagedPoolUsage`: ULong,
    public var `QuotaPeakNonPagedPoolUsage`: ULong,
    public var `QuotaNonPagedPoolUsage`: ULong,
    public var `PagefileUsage`: ULong,
    public var `PeakPagefileUsage`: ULong,
    public var `PrivateUsage`: ULong,
    public var `ExecuteFlags`: UInt,
    public var `ImageFileName`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PSS_PROCESS_INFORMATION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PSS_PROCESS_INFORMATION`.Companion.`default`() : `PSS_PROCESS_INFORMATION` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PSS_QUERY_AUXILIARY_PAGES_INFORMATION`: `PSS_QUERY_INFORMATION_CLASS` = 2;
public const val `PSS_QUERY_HANDLE_INFORMATION`: `PSS_QUERY_INFORMATION_CLASS` = 4;
public const val `PSS_QUERY_HANDLE_TRACE_INFORMATION`: `PSS_QUERY_INFORMATION_CLASS` = 6;
public typealias `PSS_QUERY_INFORMATION_CLASS` = Int;
public const val `PSS_QUERY_PERFORMANCE_COUNTERS`: `PSS_QUERY_INFORMATION_CLASS` = 7;
public const val `PSS_QUERY_PROCESS_INFORMATION`: `PSS_QUERY_INFORMATION_CLASS` = 0;
public const val `PSS_QUERY_THREAD_INFORMATION`: `PSS_QUERY_INFORMATION_CLASS` = 5;
public const val `PSS_QUERY_VA_CLONE_INFORMATION`: `PSS_QUERY_INFORMATION_CLASS` = 1;
public const val `PSS_QUERY_VA_SPACE_INFORMATION`: `PSS_QUERY_INFORMATION_CLASS` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PSS_THREAD_ENTRY` (
    public var `ExitStatus`: UInt,
    public var `TebBaseAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ProcessId`: UInt,
    public var `ThreadId`: UInt,
    public var `AffinityMask`: ULong,
    public var `Priority`: Int,
    public var `BasePriority`: Int,
    public var `LastSyscallFirstArgument`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `LastSyscallNumber`: UShort,
    public var `CreateTime`: `super`.`super`.`super`.`Foundation`.`FILETIME`,
    public var `ExitTime`: `super`.`super`.`super`.`Foundation`.`FILETIME`,
    public var `KernelTime`: `super`.`super`.`super`.`Foundation`.`FILETIME`,
    public var `UserTime`: `super`.`super`.`super`.`Foundation`.`FILETIME`,
    public var `Win32StartAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `CaptureTime`: `super`.`super`.`super`.`Foundation`.`FILETIME`,
    public var `Flags`: `PSS_THREAD_FLAGS`,
    public var `SuspendCount`: UShort,
    public var `SizeOfContextRecord`: UShort,
    public var `ContextRecord`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Debug`.`CONTEXT`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PSS_THREAD_ENTRY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]

    public fun `PSS_THREAD_ENTRY`.Companion.`default`() : `PSS_THREAD_ENTRY` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `PSS_THREAD_FLAGS` = Int;
public const val `PSS_THREAD_FLAGS_NONE`: `PSS_THREAD_FLAGS` = 0;
public const val `PSS_THREAD_FLAGS_TERMINATED`: `PSS_THREAD_FLAGS` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PSS_THREAD_INFORMATION` (
    public var `ThreadsCaptured`: UInt,
    public var `ContextLength`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PSS_VA_CLONE_INFORMATION` (
    public var `VaCloneHandle`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PSS_VA_CLONE_INFORMATION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PSS_VA_CLONE_INFORMATION`.Companion.`default`() : `PSS_VA_CLONE_INFORMATION` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PSS_VA_SPACE_ENTRY` (
    public var `BaseAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `AllocationBase`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `AllocationProtect`: UInt,
    public var `RegionSize`: ULong,
    public var `State`: UInt,
    public var `Protect`: UInt,
    public var `Type`: UInt,
    public var `TimeDateStamp`: UInt,
    public var `SizeOfImage`: UInt,
    public var `ImageBase`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `CheckSum`: UInt,
    public var `MappedFileNameLength`: UShort,
    public var `MappedFileName`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PSS_VA_SPACE_ENTRY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PSS_VA_SPACE_ENTRY`.Companion.`default`() : `PSS_VA_SPACE_ENTRY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PSS_VA_SPACE_INFORMATION` (
    public var `RegionCount`: UInt,
)
public const val `PSS_WALK_AUXILIARY_PAGES`: `PSS_WALK_INFORMATION_CLASS` = 0;
public const val `PSS_WALK_HANDLES`: `PSS_WALK_INFORMATION_CLASS` = 2;
public typealias `PSS_WALK_INFORMATION_CLASS` = Int;
public const val `PSS_WALK_THREADS`: `PSS_WALK_INFORMATION_CLASS` = 3;
public const val `PSS_WALK_VA_SPACE`: `PSS_WALK_INFORMATION_CLASS` = 1;
