// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlExtendCorrelationVector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlExtendCorrelationVector`(`correlationvector` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CORRELATION_VECTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlIncrementCorrelationVector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlIncrementCorrelationVector`(`correlationvector` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CORRELATION_VECTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlInitializeCorrelationVector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlInitializeCorrelationVector`(`correlationvector` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CORRELATION_VECTOR`>?, `version` : Int, `guid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlValidateCorrelationVector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlValidateCorrelationVector`(`vector` : /* Rust *const */ kotlinx.cinterop.CPointer<`CORRELATION_VECTOR`>?) : UInt
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CORRELATION_VECTOR` (
    public var `Version`: Byte,
    public var `Vector`: ByteArray,
)
// UNSUPPORTED Rust 11:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CORRELATION_VECTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RTL_CORRELATION_VECTOR_STRING_LENGTH`: UInt = 129u;
public const val `RTL_CORRELATION_VECTOR_V1_LENGTH`: UInt = 64u;
public const val `RTL_CORRELATION_VECTOR_V1_PREFIX_LENGTH`: UInt = 16u;
public const val `RTL_CORRELATION_VECTOR_V2_LENGTH`: UInt = 128u;
public const val `RTL_CORRELATION_VECTOR_V2_PREFIX_LENGTH`: UInt = 22u;
