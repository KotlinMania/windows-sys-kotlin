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
// UNSUPPORTED Rust 3:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CYPHER_BLOCK {
//     pub data: [i8; 8],
// }

// UNSUPPORTED Rust 8:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CYPHER_BLOCK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 13:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ENCRYPTED_LM_OWF_PASSWORD {
//     pub data: [CYPHER_BLOCK; 2],
// }

// UNSUPPORTED Rust 18:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ENCRYPTED_LM_OWF_PASSWORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 23:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LM_OWF_PASSWORD {
//     pub data: [CYPHER_BLOCK; 2],
// }

// UNSUPPORTED Rust 28:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LM_OWF_PASSWORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 33:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SAMPR_ENCRYPTED_USER_PASSWORD {
//     pub Buffer: [u8; 516],
// }

// UNSUPPORTED Rust 38:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SAMPR_ENCRYPTED_USER_PASSWORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

