// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("efswrt.dll" "system" fn ProtectFileToEnterpriseIdentity(fileorfolderpath : windows_sys::core::PCWSTR, identity : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("srpapi.dll" "system" fn SrpCloseThreadNetworkContext(threadnetworkcontext : *mut HTHREAD_NETWORK_CONTEXT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("srpapi.dll" "system" fn SrpCreateThreadNetworkContext(enterpriseid : windows_sys::core::PCWSTR, threadnetworkcontext : *mut HTHREAD_NETWORK_CONTEXT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("srpapi.dll" "system" fn SrpDisablePermissiveModeFileEncryption() -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Storage_Packaging_Appx")]
// windows_link::link!("srpapi.dll" "system" fn SrpDoesPolicyAllowAppExecution(packageid : *const super::super::Storage::Packaging::Appx:: PACKAGE_ID, isallowed : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("srpapi.dll" "system" fn SrpEnablePermissiveModeFileEncryption(enterpriseid : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("srpapi.dll" "system" fn SrpGetEnterpriseIds(tokenhandle : super::super::Foundation:: HANDLE, numberofbytes : *mut u32, enterpriseids : *mut windows_sys::core::PCWSTR, enterpriseidcount : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("srpapi.dll" "system" fn SrpGetEnterprisePolicy(tokenhandle : super::super::Foundation:: HANDLE, policyflags : *mut ENTERPRISE_DATA_POLICIES) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("srpapi.dll" "system" fn SrpHostingInitialize(version : SRPHOSTING_VERSION, r#type : SRPHOSTING_TYPE, pvdata : *const core::ffi::c_void, cbdata : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("srpapi.dll" "system" fn SrpHostingTerminate(r#type : SRPHOSTING_TYPE));

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("srpapi.dll" "system" fn SrpIsTokenService(tokenhandle : super::super::Foundation:: HANDLE, istokenservice : *mut u8) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("srpapi.dll" "system" fn SrpSetTokenEnterpriseId(tokenhandle : super::super::Foundation:: HANDLE, enterpriseid : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("efswrt.dll" "system" fn UnprotectFile(fileorfolderpath : windows_sys::core::PCWSTR, options : *const FILE_UNPROTECT_OPTIONS) -> windows_sys::core::HRESULT);

public typealias `ENTERPRISE_DATA_POLICIES` = Int;
public const val `ENTERPRISE_POLICY_ALLOWED`: `ENTERPRISE_DATA_POLICIES` = 1;
public const val `ENTERPRISE_POLICY_ENLIGHTENED`: `ENTERPRISE_DATA_POLICIES` = 2;
public const val `ENTERPRISE_POLICY_EXEMPT`: `ENTERPRISE_DATA_POLICIES` = 4;
public const val `ENTERPRISE_POLICY_NONE`: `ENTERPRISE_DATA_POLICIES` = 0;
// UNSUPPORTED Rust 20:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_UNPROTECT_OPTIONS {
//     pub audit: u8,
// }

// UNSUPPORTED Rust 25:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTHREAD_NETWORK_CONTEXT {
//     pub ThreadId: u32,
//     pub ThreadContext: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 31:1: declaration Impl has no candidate rule
// impl Default for HTHREAD_NETWORK_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SRPHOSTING_TYPE` = Int;
public const val `SRPHOSTING_TYPE_NONE`: `SRPHOSTING_TYPE` = 0;
public const val `SRPHOSTING_TYPE_WINHTTP`: `SRPHOSTING_TYPE` = 1;
public const val `SRPHOSTING_TYPE_WININET`: `SRPHOSTING_TYPE` = 2;
public typealias `SRPHOSTING_VERSION` = Int;
public const val `SRPHOSTING_VERSION1`: `SRPHOSTING_VERSION` = 1;
