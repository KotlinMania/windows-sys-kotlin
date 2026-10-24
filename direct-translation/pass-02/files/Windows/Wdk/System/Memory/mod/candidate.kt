// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtMapViewOfSection(sectionhandle : super::super::super::Win32::Foundation:: HANDLE, processhandle : super::super::super::Win32::Foundation:: HANDLE, baseaddress : *mut *mut core::ffi::c_void, zerobits : usize, commitsize : usize, sectionoffset : *mut i64, viewsize : *mut usize, inheritdisposition : SECTION_INHERIT, allocationtype : u32, win32protect : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn NtOpenSection(sectionhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtUnmapViewOfSection(processhandle : super::super::super::Win32::Foundation:: HANDLE, baseaddress : *const core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwMapViewOfSection(sectionhandle : super::super::super::Win32::Foundation:: HANDLE, processhandle : super::super::super::Win32::Foundation:: HANDLE, baseaddress : *mut *mut core::ffi::c_void, zerobits : usize, commitsize : usize, sectionoffset : *mut i64, viewsize : *mut usize, inheritdisposition : SECTION_INHERIT, allocationtype : u32, win32protect : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn ZwOpenSection(sectionhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwUnmapViewOfSection(processhandle : super::super::super::Win32::Foundation:: HANDLE, baseaddress : *const core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

public typealias `SECTION_INHERIT` = Int;
public const val `ViewShare`: `SECTION_INHERIT` = 1;
public const val `ViewUnmap`: `SECTION_INHERIT` = 2;
