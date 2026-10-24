// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=verifier.dll, ABI=system, export=VerifierEnumerateResource; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VerifierEnumerateResource`(`process` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : `VERIFIER_ENUM_RESOURCE_FLAGS`, `resourcetype` : UInt, `resourcecallback` : `AVRF_RESOURCE_ENUMERATE_CALLBACK`, `enumerationcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// UNSUPPORTED Rust 2:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AVRF_BACKTRACE_INFORMATION {
//     pub Depth: u32,
//     pub Index: u32,
//     pub ReturnAddresses: [u64; 32],
// }

// UNSUPPORTED Rust 9:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AVRF_BACKTRACE_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AVRF_ENUM_RESOURCES_FLAGS_DONT_RESOLVE_TRACES`: `VERIFIER_ENUM_RESOURCE_FLAGS` = 2u;
public const val `AVRF_ENUM_RESOURCES_FLAGS_SUSPEND`: `VERIFIER_ENUM_RESOURCE_FLAGS` = 1u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `AVRF_HANDLEOPERATION_ENUMERATE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`AVRF_HANDLE_OPERATION`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `AVRF_HANDLE_OPERATION` (
    public var `Handle`: ULong,
    public var `ProcessId`: UInt,
    public var `ThreadId`: UInt,
    public var `OperationType`: UInt,
    public var `Spare0`: UInt,
    public var `BackTraceInformation`: `AVRF_BACKTRACE_INFORMATION`,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `AVRF_HEAPALLOCATION_ENUMERATE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`AVRF_HEAP_ALLOCATION`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AVRF_HEAP_ALLOCATION` (
    public var `HeapHandle`: ULong,
    public var `UserAllocation`: ULong,
    public var `UserAllocationSize`: ULong,
    public var `Allocation`: ULong,
    public var `AllocationSize`: ULong,
    public var `UserAllocationState`: UInt,
    public var `HeapState`: UInt,
    public var `HeapContext`: ULong,
    public var `BackTraceInformation`: /* Rust *mut */ kotlinx.cinterop.CPointer<`AVRF_BACKTRACE_INFORMATION`>?,
)
// UNSUPPORTED Rust 41:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AVRF_HEAP_ALLOCATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AVRF_MAX_TRACES`: UInt = 32u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `AVRF_RESOURCE_ENUMERATE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
public const val `AllocationStateBusy`: `eUserAllocationState` = 1;
public const val `AllocationStateFree`: `eUserAllocationState` = 2;
public const val `AllocationStateUnknown`: `eUserAllocationState` = 0;
public const val `AvrfResourceHandleTrace`: `eAvrfResourceTypes` = 1;
public const val `AvrfResourceHeapAllocation`: `eAvrfResourceTypes` = 0;
public const val `AvrfResourceMax`: `eAvrfResourceTypes` = 2;
public const val `HeapEnumerationEverything`: `eHeapEnumerationLevel` = 0;
public const val `HeapEnumerationStop`: `eHeapEnumerationLevel` = -1;
public const val `HeapFullPageHeap`: `eHeapAllocationState` = 1073741824;
public const val `HeapMetadata`: `eHeapAllocationState` = -2147483648;
public const val `HeapStateMask`: `eHeapAllocationState` = -65536;
public const val `OperationDbBADREF`: `eHANDLE_TRACE_OPERATIONS` = 3;
public const val `OperationDbCLOSE`: `eHANDLE_TRACE_OPERATIONS` = 2;
public const val `OperationDbOPEN`: `eHANDLE_TRACE_OPERATIONS` = 1;
public const val `OperationDbUnused`: `eHANDLE_TRACE_OPERATIONS` = 0;
public typealias `VERIFIER_ENUM_RESOURCE_FLAGS` = UInt;
public typealias `eAvrfResourceTypes` = Int;
public typealias `eHANDLE_TRACE_OPERATIONS` = Int;
public typealias `eHeapAllocationState` = Int;
public typealias `eHeapEnumerationLevel` = Int;
public typealias `eUserAllocationState` = Int;
