// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=MSChapSrvChangePassword; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MSChapSrvChangePassword`(`servername` : `windows_sys`.`core`.`PCWSTR`, `username` : `windows_sys`.`core`.`PCWSTR`, `lmoldpresent` : Boolean, `lmoldowfpassword` : /* Rust *const */ kotlinx.cinterop.CPointer<`LM_OWF_PASSWORD`>?, `lmnewowfpassword` : /* Rust *const */ kotlinx.cinterop.CPointer<`LM_OWF_PASSWORD`>?, `ntoldowfpassword` : /* Rust *const */ kotlinx.cinterop.CPointer<`LM_OWF_PASSWORD`>?, `ntnewowfpassword` : /* Rust *const */ kotlinx.cinterop.CPointer<`LM_OWF_PASSWORD`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=MSChapSrvChangePassword2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MSChapSrvChangePassword2`(`servername` : `windows_sys`.`core`.`PCWSTR`, `username` : `windows_sys`.`core`.`PCWSTR`, `newpasswordencryptedwitholdnt` : /* Rust *const */ kotlinx.cinterop.CPointer<`SAMPR_ENCRYPTED_USER_PASSWORD`>?, `oldntowfpasswordencryptedwithnewnt` : /* Rust *const */ kotlinx.cinterop.CPointer<`ENCRYPTED_LM_OWF_PASSWORD`>?, `lmpresent` : Boolean, `newpasswordencryptedwitholdlm` : /* Rust *const */ kotlinx.cinterop.CPointer<`SAMPR_ENCRYPTED_USER_PASSWORD`>?, `oldlmowfpasswordencryptedwithnewlmornt` : /* Rust *const */ kotlinx.cinterop.CPointer<`ENCRYPTED_LM_OWF_PASSWORD`>?) : UInt
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CYPHER_BLOCK` (
    public var `data`: ByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CYPHER_BLOCK`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `CYPHER_BLOCK`.Companion.`default`() : `CYPHER_BLOCK` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENCRYPTED_LM_OWF_PASSWORD` (
    public var `data`: Array<`CYPHER_BLOCK`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ENCRYPTED_LM_OWF_PASSWORD`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ENCRYPTED_LM_OWF_PASSWORD`.Companion.`default`() : `ENCRYPTED_LM_OWF_PASSWORD` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LM_OWF_PASSWORD` (
    public var `data`: Array<`CYPHER_BLOCK`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `LM_OWF_PASSWORD`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `LM_OWF_PASSWORD`.Companion.`default`() : `LM_OWF_PASSWORD` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 516 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SAMPR_ENCRYPTED_USER_PASSWORD` (
    public var `Buffer`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SAMPR_ENCRYPTED_USER_PASSWORD`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SAMPR_ENCRYPTED_USER_PASSWORD`.Companion.`default`() : `SAMPR_ENCRYPTED_USER_PASSWORD` {
        return run { `core`.`mem`.`zeroed`() }
    }

