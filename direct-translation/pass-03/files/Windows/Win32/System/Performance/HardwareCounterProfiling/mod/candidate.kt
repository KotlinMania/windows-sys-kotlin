// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DisableThreadProfiling; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DisableThreadProfiling`(`performancedatahandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=EnableThreadProfiling; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnableThreadProfiling`(`threadhandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `flags` : UInt, `hardwarecounters` : ULong, `performancedatahandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=QueryThreadProfiling; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryThreadProfiling`(`threadhandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `enabled` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=ReadThreadProfilingData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReadThreadProfilingData`(`performancedatahandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `flags` : UInt, `performancedata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PERFORMANCE_DATA`>?) : UInt
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HARDWARE_COUNTER_DATA` (
    public var `Type`: `HARDWARE_COUNTER_TYPE`,
    public var `Reserved`: UInt,
    public var `Value`: ULong,
)
public typealias `HARDWARE_COUNTER_TYPE` = Int;
public const val `MaxHardwareCounterType`: `HARDWARE_COUNTER_TYPE` = 1;
// UNSUPPORTED Rust 14:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PERFORMANCE_DATA {
//     pub Size: u16,
//     pub Version: u8,
//     pub HwCountersCount: u8,
//     pub ContextSwitchCount: u32,
//     pub WaitReasonBitMap: u64,
//     pub CycleTime: u64,
//     pub RetryCount: u32,
//     pub Reserved: u32,
//     pub HwCounters: [HARDWARE_COUNTER_DATA; 16],
// }

// UNSUPPORTED Rust 27:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PERFORMANCE_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PMCCounter`: `HARDWARE_COUNTER_TYPE` = 0;
