// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("userenv.dll" "system" fn CreateAppContainerProfile(pszappcontainername : windows_sys::core::PCWSTR, pszdisplayname : windows_sys::core::PCWSTR, pszdescription : windows_sys::core::PCWSTR, pcapabilities : *const super:: SID_AND_ATTRIBUTES, dwcapabilitycount : u32, ppsidappcontainersid : *mut super:: PSID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("userenv.dll" "system" fn DeleteAppContainerProfile(pszappcontainername : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("userenv.dll" "system" fn DeriveAppContainerSidFromAppContainerName(pszappcontainername : windows_sys::core::PCWSTR, ppsidappcontainersid : *mut super:: PSID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("userenv.dll" "system" fn DeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid : super:: PSID, pszrestrictedappcontainername : windows_sys::core::PCWSTR, ppsidrestrictedappcontainersid : *mut super:: PSID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("userenv.dll" "system" fn GetAppContainerFolderPath(pszappcontainersid : windows_sys::core::PCWSTR, ppszpath : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetAppContainerNamedObjectPath(token : super::super::Foundation:: HANDLE, appcontainersid : super:: PSID, objectpathlength : u32, objectpath : windows_sys::core::PWSTR, returnlength : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("userenv.dll" "system" fn GetAppContainerRegistryLocation(desiredaccess : u32, phappcontainerkey : *mut super::super::System::Registry:: HKEY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("isolatedwindowsenvironmentutils.dll" "system" fn IsCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-security-isolatedcontainer-l1-1-0.dll" "system" fn IsProcessInIsolatedContainer(isprocessinisolatedcontainer : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("isolatedwindowsenvironmentutils.dll" "system" fn IsProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-security-isolatedcontainer-l1-1-1.dll" "system" fn IsProcessInWDAGContainer(reserved : *const core::ffi::c_void, isprocessinwdagcontainer : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 13:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const IsolatedAppLauncher: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbc812430_e75e_4fd1_9641_1f9f1e2d9a1f);

// UNSUPPORTED Rust 14:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IsolatedAppLauncherTelemetryParameters {
//     pub EnableForLaunch: windows_sys::core::BOOL,
//     pub CorrelationGUID: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 20:1: non-scalar type Ptr unsupported
// pub const WDAG_CLIPBOARD_TAG: windows_sys::core::PCWSTR = windows_sys::core::w!("CrossIsolatedEnvironmentContent");

