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
)
// UNSUPPORTED Rust 8:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CYPHER_BLOCK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENCRYPTED_LM_OWF_PASSWORD` (
    public var `data`: Array<`CYPHER_BLOCK`>,
)
// UNSUPPORTED Rust 18:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ENCRYPTED_LM_OWF_PASSWORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LM_OWF_PASSWORD` (
    public var `data`: Array<`CYPHER_BLOCK`>,
)
// UNSUPPORTED Rust 28:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LM_OWF_PASSWORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 516 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SAMPR_ENCRYPTED_USER_PASSWORD` (
    public var `Buffer`: UByteArray,
)
// UNSUPPORTED Rust 38:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SAMPR_ENCRYPTED_USER_PASSWORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

