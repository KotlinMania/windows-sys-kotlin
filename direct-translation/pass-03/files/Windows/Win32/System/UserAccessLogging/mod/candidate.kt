// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ualapi.dll, ABI=system, export=UalInstrument; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `UalInstrument`(`data` : /* Rust *const */ kotlinx.cinterop.CPointer<`UAL_DATA_BLOB`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ualapi.dll, ABI=system, export=UalRegisterProduct; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UalRegisterProduct`(`wszproductname` : `windows_sys`.`core`.`PCWSTR`, `wszrolename` : `windows_sys`.`core`.`PCWSTR`, `wszguid` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ualapi.dll, ABI=system, export=UalStart; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `UalStart`(`data` : /* Rust *const */ kotlinx.cinterop.CPointer<`UAL_DATA_BLOB`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ualapi.dll, ABI=system, export=UalStop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `UalStop`(`data` : /* Rust *const */ kotlinx.cinterop.CPointer<`UAL_DATA_BLOB`>?) : `windows_sys`.`core`.`HRESULT`
// UNSUPPORTED Rust 8:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct UAL_DATA_BLOB {
//     pub Size: u32,
//     pub RoleGuid: windows_sys::core::GUID,
//     pub TenantId: windows_sys::core::GUID,
//     pub Address: super::super::Networking::WinSock::SOCKADDR_STORAGE,
//     pub UserName: [u16; 260],
// }

// UNSUPPORTED Rust 18:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for UAL_DATA_BLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

