// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=OperationEnd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OperationEnd`(`operationendparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`OPERATION_END_PARAMETERS`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=OperationStart; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OperationStart`(`operationstartparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`OPERATION_START_PARAMETERS`>?) : `windows_sys`.`core`.`BOOL`
public const val `OPERATION_END_DISCARD`: `OPERATION_END_PARAMETERS_FLAGS` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OPERATION_END_PARAMETERS` (
    public var `Version`: UInt,
    public var `OperationId`: UInt,
    public var `Flags`: `OPERATION_END_PARAMETERS_FLAGS`,
)
public typealias `OPERATION_END_PARAMETERS_FLAGS` = UInt;
public typealias `OPERATION_START_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OPERATION_START_PARAMETERS` (
    public var `Version`: UInt,
    public var `OperationId`: UInt,
    public var `Flags`: `OPERATION_START_FLAGS`,
)
public const val `OPERATION_START_TRACE_CURRENT_THREAD`: `OPERATION_START_FLAGS` = 1u;
