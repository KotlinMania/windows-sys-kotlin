// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// field positions matter
// UNSUPPORTED Rust 2:1: declaration Struct has no candidate rule
// #[repr(C)]
// pub struct Example {
//  // flags
//  pub flags: u32,
//  // bytes
//  pub bytes: [u8; 8],
// }

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=example.dll, ABI=system, export=F; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `F`(`input`: /* Rust *mut */ kotlinx.cinterop.CPointer<`Example`>?) : UInt
