// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("verifier.dll" "system" fn VerifierEnumerateResource(process : super::super::Foundation:: HANDLE, flags : VERIFIER_ENUM_RESOURCE_FLAGS, resourcetype : u32, resourcecallback : AVRF_RESOURCE_ENUMERATE_CALLBACK, enumerationcontext : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 2:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AVRF_BACKTRACE_INFORMATION {
//     pub Depth: u32,
//     pub Index: u32,
//     pub ReturnAddresses: [u64; 32],
// }

// UNSUPPORTED Rust 9:1: declaration Impl has no candidate rule
// impl Default for AVRF_BACKTRACE_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AVRF_ENUM_RESOURCES_FLAGS_DONT_RESOLVE_TRACES`: `VERIFIER_ENUM_RESOURCE_FLAGS` = 2u;
public const val `AVRF_ENUM_RESOURCES_FLAGS_SUSPEND`: `VERIFIER_ENUM_RESOURCE_FLAGS` = 1u;
// UNSUPPORTED Rust 16:1: generic scalar type unsupported
// pub type AVRF_HANDLEOPERATION_ENUMERATE_CALLBACK = Option<unsafe extern "system" fn(handleoperation: *mut AVRF_HANDLE_OPERATION, enumerationcontext: *mut core::ffi::c_void, enumerationlevel: *mut u32) -> u32>;

// UNSUPPORTED Rust 17:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AVRF_HANDLE_OPERATION {
//     pub Handle: u64,
//     pub ProcessId: u32,
//     pub ThreadId: u32,
//     pub OperationType: u32,
//     pub Spare0: u32,
//     pub BackTraceInformation: AVRF_BACKTRACE_INFORMATION,
// }

// UNSUPPORTED Rust 27:1: generic scalar type unsupported
// pub type AVRF_HEAPALLOCATION_ENUMERATE_CALLBACK = Option<unsafe extern "system" fn(heapallocation: *mut AVRF_HEAP_ALLOCATION, enumerationcontext: *mut core::ffi::c_void, enumerationlevel: *mut u32) -> u32>;

// UNSUPPORTED Rust 28:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AVRF_HEAP_ALLOCATION {
//     pub HeapHandle: u64,
//     pub UserAllocation: u64,
//     pub UserAllocationSize: u64,
//     pub Allocation: u64,
//     pub AllocationSize: u64,
//     pub UserAllocationState: u32,
//     pub HeapState: u32,
//     pub HeapContext: u64,
//     pub BackTraceInformation: *mut AVRF_BACKTRACE_INFORMATION,
// }

// UNSUPPORTED Rust 41:1: declaration Impl has no candidate rule
// impl Default for AVRF_HEAP_ALLOCATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AVRF_MAX_TRACES`: UInt = 32u;
// UNSUPPORTED Rust 47:1: generic scalar type unsupported
// pub type AVRF_RESOURCE_ENUMERATE_CALLBACK = Option<unsafe extern "system" fn(resourcedescription: *mut core::ffi::c_void, enumerationcontext: *mut core::ffi::c_void, enumerationlevel: *mut u32) -> u32>;

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
