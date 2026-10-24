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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CORRELATION_VECTOR`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `CORRELATION_VECTOR`.Companion.`default`() : `CORRELATION_VECTOR` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `RTL_CORRELATION_VECTOR_STRING_LENGTH`: UInt = 129u;
public const val `RTL_CORRELATION_VECTOR_V1_LENGTH`: UInt = 64u;
public const val `RTL_CORRELATION_VECTOR_V1_PREFIX_LENGTH`: UInt = 16u;
public const val `RTL_CORRELATION_VECTOR_V2_LENGTH`: UInt = 128u;
public const val `RTL_CORRELATION_VECTOR_V2_PREFIX_LENGTH`: UInt = 22u;
