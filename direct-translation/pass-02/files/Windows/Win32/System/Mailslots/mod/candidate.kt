// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("kernel32.dll" "system" fn CreateMailslotA(lpname : windows_sys::core::PCSTR, nmaxmessagesize : u32, lreadtimeout : u32, lpsecurityattributes : *const super::super::Security:: SECURITY_ATTRIBUTES) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("kernel32.dll" "system" fn CreateMailslotW(lpname : windows_sys::core::PCWSTR, nmaxmessagesize : u32, lreadtimeout : u32, lpsecurityattributes : *const super::super::Security:: SECURITY_ATTRIBUTES) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetMailslotInfo(hmailslot : super::super::Foundation:: HANDLE, lpmaxmessagesize : *mut u32, lpnextsize : *mut u32, lpmessagecount : *mut u32, lpreadtimeout : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetMailslotInfo(hmailslot : super::super::Foundation:: HANDLE, lreadtimeout : u32) -> windows_sys::core::BOOL);

