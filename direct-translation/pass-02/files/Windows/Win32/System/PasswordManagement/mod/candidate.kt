// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn MSChapSrvChangePassword(servername : windows_sys::core::PCWSTR, username : windows_sys::core::PCWSTR, lmoldpresent : bool, lmoldowfpassword : *const LM_OWF_PASSWORD, lmnewowfpassword : *const LM_OWF_PASSWORD, ntoldowfpassword : *const LM_OWF_PASSWORD, ntnewowfpassword : *const LM_OWF_PASSWORD) -> u32);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn MSChapSrvChangePassword2(servername : windows_sys::core::PCWSTR, username : windows_sys::core::PCWSTR, newpasswordencryptedwitholdnt : *const SAMPR_ENCRYPTED_USER_PASSWORD, oldntowfpasswordencryptedwithnewnt : *const ENCRYPTED_LM_OWF_PASSWORD, lmpresent : bool, newpasswordencryptedwitholdlm : *const SAMPR_ENCRYPTED_USER_PASSWORD, oldlmowfpasswordencryptedwithnewlmornt : *const ENCRYPTED_LM_OWF_PASSWORD) -> u32);

// UNSUPPORTED Rust 3:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CYPHER_BLOCK {
//     pub data: [i8; 8],
// }

// UNSUPPORTED Rust 8:1: declaration Impl has no candidate rule
// impl Default for CYPHER_BLOCK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 13:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ENCRYPTED_LM_OWF_PASSWORD {
//     pub data: [CYPHER_BLOCK; 2],
// }

// UNSUPPORTED Rust 18:1: declaration Impl has no candidate rule
// impl Default for ENCRYPTED_LM_OWF_PASSWORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 23:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LM_OWF_PASSWORD {
//     pub data: [CYPHER_BLOCK; 2],
// }

// UNSUPPORTED Rust 28:1: declaration Impl has no candidate rule
// impl Default for LM_OWF_PASSWORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 33:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SAMPR_ENCRYPTED_USER_PASSWORD {
//     pub Buffer: [u8; 516],
// }

// UNSUPPORTED Rust 38:1: declaration Impl has no candidate rule
// impl Default for SAMPR_ENCRYPTED_USER_PASSWORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

