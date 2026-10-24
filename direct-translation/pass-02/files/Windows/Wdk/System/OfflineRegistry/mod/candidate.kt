// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("offreg.dll" "system" fn ORCloseHive(handle : ORHKEY) -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("offreg.dll" "system" fn ORCloseKey(keyhandle : ORHKEY) -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("offreg.dll" "system" fn ORCreateHive(horkey : *mut ORHKEY) -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("offreg.dll" "system" fn ORCreateKey(keyhandle : ORHKEY, lpsubkey : windows_sys::core::PCWSTR, lpclass : windows_sys::core::PCWSTR, dwoptions : u32, psecuritydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, phkresult : *mut ORHKEY, pdwdisposition : *mut u32) -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("offreg.dll" "system" fn ORDeleteKey(handle : ORHKEY, lpsubkey : windows_sys::core::PCWSTR) -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("offreg.dll" "system" fn ORDeleteValue(handle : ORHKEY, lpvaluename : windows_sys::core::PCWSTR) -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("offreg.dll" "system" fn OREnumKey(handle : ORHKEY, dwindex : u32, lpname : windows_sys::core::PWSTR, lpcname : *mut u32, lpclass : windows_sys::core::PWSTR, lpcclass : *mut u32, lpftlastwritetime : *mut super::super::super::Win32::Foundation:: FILETIME) -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("offreg.dll" "system" fn OREnumValue(handle : ORHKEY, dwindex : u32, lpvaluename : windows_sys::core::PWSTR, lpcvaluename : *mut u32, lptype : *mut u32, lpdata : *mut u8, lpcbdata : *mut u32) -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("offreg.dll" "system" fn ORGetKeySecurity(handle : ORHKEY, securityinformation : u32, psecuritydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor : *mut u32) -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("offreg.dll" "system" fn ORGetValue(handle : ORHKEY, lpsubkey : windows_sys::core::PCWSTR, lpvalue : windows_sys::core::PCWSTR, pdwtype : *mut u32, pvdata : *mut core::ffi::c_void, pcbdata : *mut u32) -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("offreg.dll" "system" fn ORGetVersion(pdwmajorversion : *mut u32, pdwminorversion : *mut u32) -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("offreg.dll" "system" fn ORGetVirtualFlags(handle : ORHKEY, pdwflags : *mut u32) -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("offreg.dll" "system" fn ORMergeHives(hivehandles : *const ORHKEY, hivecount : u32, phkresult : *mut ORHKEY) -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("offreg.dll" "system" fn OROpenHive(filepath : windows_sys::core::PCWSTR, horkey : *mut ORHKEY) -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("offreg.dll" "system" fn OROpenHiveByHandle(filehandle : super::super::super::Win32::Foundation:: HANDLE, horkey : *mut ORHKEY) -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("offreg.dll" "system" fn OROpenKey(handle : ORHKEY, lpsubkey : windows_sys::core::PCWSTR, phkresult : *mut ORHKEY) -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("offreg.dll" "system" fn ORQueryInfoKey(handle : ORHKEY, lpclass : windows_sys::core::PWSTR, lpcclass : *mut u32, lpcsubkeys : *mut u32, lpcmaxsubkeylen : *mut u32, lpcmaxclasslen : *mut u32, lpcvalues : *mut u32, lpcmaxvaluenamelen : *mut u32, lpcmaxvaluelen : *mut u32, lpcbsecuritydescriptor : *mut u32, lpftlastwritetime : *mut super::super::super::Win32::Foundation:: FILETIME) -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("offreg.dll" "system" fn ORRenameKey(handle : ORHKEY, lpnewname : windows_sys::core::PCWSTR) -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("offreg.dll" "system" fn ORSaveHive(horkey : ORHKEY, hivepath : windows_sys::core::PCWSTR, osmajorversion : u32, osminorversion : u32) -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("offreg.dll" "system" fn ORSetKeySecurity(handle : ORHKEY, securityinformation : u32, psecuritydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("offreg.dll" "system" fn ORSetValue(handle : ORHKEY, lpvaluename : windows_sys::core::PCWSTR, dwtype : u32, lpdata : *const u8, cbdata : u32) -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("offreg.dll" "system" fn ORSetVirtualFlags(handle : ORHKEY, dwflags : u32) -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("offreg.dll" "system" fn ORShutdown() -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("offreg.dll" "system" fn ORStart() -> super::super::super::Win32::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 28:1: non-scalar type Ptr unsupported
// pub type ORHKEY = *mut core::ffi::c_void;

