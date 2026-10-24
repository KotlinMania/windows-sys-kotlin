// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_Controls")]
// windows_link::link!("dssec.dll" "system" fn DSCreateSecurityPage(pwszobjectpath : windows_sys::core::PCWSTR, pwszobjectclass : windows_sys::core::PCWSTR, dwflags : u32, phpage : *mut super::super::UI::Controls:: HPROPSHEETPAGE, pfnreadsd : PFNREADOBJECTSECURITY, pfnwritesd : PFNWRITEOBJECTSECURITY, lpcontext : super::super::Foundation:: LPARAM) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("dssec.dll" "system" fn DSEditSecurity(hwndowner : super::super::Foundation:: HWND, pwszobjectpath : windows_sys::core::PCWSTR, pwszobjectclass : windows_sys::core::PCWSTR, dwflags : u32, pwszcaption : windows_sys::core::PCWSTR, pfnreadsd : PFNREADOBJECTSECURITY, pfnwritesd : PFNWRITEOBJECTSECURITY, lpcontext : super::super::Foundation:: LPARAM) -> windows_sys::core::HRESULT);

public const val `DSSI_IS_ROOT`: UInt = 16u;
public const val `DSSI_NO_ACCESS_CHECK`: UInt = 2u;
public const val `DSSI_NO_EDIT_OWNER`: UInt = 8u;
public const val `DSSI_NO_EDIT_SACL`: UInt = 4u;
public const val `DSSI_NO_FILTER`: UInt = 32u;
public const val `DSSI_NO_READONLY_MESSAGE`: UInt = 64u;
public const val `DSSI_READ_ONLY`: UInt = 1u;
// UNSUPPORTED Rust 11:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_UI_Controls")]
// pub type PFNDSCREATESECPAGE = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: windows_sys::core::PCWSTR, param2: u32, param3: *mut super::super::UI::Controls::HPROPSHEETPAGE, param4: PFNREADOBJECTSECURITY, param5: PFNWRITEOBJECTSECURITY, param6: super::super::Foundation::LPARAM) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 13:1: generic scalar type unsupported
// pub type PFNDSEDITSECURITY = Option<unsafe extern "system" fn(param0: super::super::Foundation::HWND, param1: windows_sys::core::PCWSTR, param2: windows_sys::core::PCWSTR, param3: u32, param4: windows_sys::core::PCWSTR, param5: PFNREADOBJECTSECURITY, param6: PFNWRITEOBJECTSECURITY, param7: super::super::Foundation::LPARAM) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 14:1: generic scalar type unsupported
// pub type PFNREADOBJECTSECURITY = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: u32, param2: *mut super::PSECURITY_DESCRIPTOR, param3: super::super::Foundation::LPARAM) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 15:1: generic scalar type unsupported
// pub type PFNWRITEOBJECTSECURITY = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: u32, param2: super::PSECURITY_DESCRIPTOR, param3: super::super::Foundation::LPARAM) -> windows_sys::core::HRESULT>;

