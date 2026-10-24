// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("ualapi.dll" "system" fn UalInstrument(data : *const UAL_DATA_BLOB) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("ualapi.dll" "system" fn UalRegisterProduct(wszproductname : windows_sys::core::PCWSTR, wszrolename : windows_sys::core::PCWSTR, wszguid : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("ualapi.dll" "system" fn UalStart(data : *const UAL_DATA_BLOB) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("ualapi.dll" "system" fn UalStop(data : *const UAL_DATA_BLOB) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 18:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for UAL_DATA_BLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

