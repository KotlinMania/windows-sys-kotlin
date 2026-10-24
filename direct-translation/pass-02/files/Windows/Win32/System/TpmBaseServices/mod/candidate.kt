// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("tbs.dll" "system" fn GetDeviceID(pbwindowsaik : *mut u8, cbwindowsaik : u32, pcbresult : *mut u32, pfprotectedbytpm : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("tbs.dll" "system" fn GetDeviceIDString(pszwindowsaik : windows_sys::core::PWSTR, cchwindowsaik : u32, pcchresult : *mut u32, pfprotectedbytpm : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("tbs.dll" "system" fn Tbsi_Context_Create(pcontextparams : *const TBS_CONTEXT_PARAMS, phcontext : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("tbs.dll" "system" fn Tbsi_Create_Windows_Key(keyhandle : u32) -> u32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("tbs.dll" "system" fn Tbsi_GetDeviceInfo(size : u32, info : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("tbs.dll" "system" fn Tbsi_Get_OwnerAuth(hcontext : *const core::ffi::c_void, ownerauthtype : u32, poutputbuf : *mut u8, poutputbuflen : *mut u32) -> u32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("tbs.dll" "system" fn Tbsi_Get_TCG_Log(hcontext : *const core::ffi::c_void, poutputbuf : *mut u8, poutputbuflen : *mut u32) -> u32);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("tbs.dll" "system" fn Tbsi_Get_TCG_Log_Ex(logtype : u32, pboutput : *mut u8, pcboutput : *mut u32) -> u32);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("tbs.dll" "system" fn Tbsi_Is_Tpm_Present() -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("tbs.dll" "system" fn Tbsi_Physical_Presence_Command(hcontext : *const core::ffi::c_void, pabinput : *const u8, cbinput : u32, paboutput : *mut u8, pcboutput : *mut u32) -> u32);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("tbs.dll" "system" fn Tbsi_Revoke_Attestation() -> u32);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("tbs.dll" "system" fn Tbsip_Cancel_Commands(hcontext : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("tbs.dll" "system" fn Tbsip_Context_Close(hcontext : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("tbs.dll" "system" fn Tbsip_Submit_Command(hcontext : *const core::ffi::c_void, locality : TBS_COMMAND_LOCALITY, priority : TBS_COMMAND_PRIORITY, pabcommand : *const u8, cbcommand : u32, pabresult : *mut u8, pcbresult : *mut u32) -> u32);

public typealias `TBS_COMMAND_LOCALITY` = UInt;
public const val `TBS_COMMAND_LOCALITY_FOUR`: `TBS_COMMAND_LOCALITY` = 4u;
public const val `TBS_COMMAND_LOCALITY_ONE`: `TBS_COMMAND_LOCALITY` = 1u;
public const val `TBS_COMMAND_LOCALITY_THREE`: `TBS_COMMAND_LOCALITY` = 3u;
public const val `TBS_COMMAND_LOCALITY_TWO`: `TBS_COMMAND_LOCALITY` = 2u;
public const val `TBS_COMMAND_LOCALITY_ZERO`: `TBS_COMMAND_LOCALITY` = 0u;
public typealias `TBS_COMMAND_PRIORITY` = UInt;
public const val `TBS_COMMAND_PRIORITY_HIGH`: `TBS_COMMAND_PRIORITY` = 300u;
public const val `TBS_COMMAND_PRIORITY_LOW`: `TBS_COMMAND_PRIORITY` = 100u;
public const val `TBS_COMMAND_PRIORITY_MAX`: `TBS_COMMAND_PRIORITY` = 2147483648u;
public const val `TBS_COMMAND_PRIORITY_NORMAL`: `TBS_COMMAND_PRIORITY` = 200u;
public const val `TBS_COMMAND_PRIORITY_SYSTEM`: `TBS_COMMAND_PRIORITY` = 400u;
// UNSUPPORTED Rust 27:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TBS_CONTEXT_PARAMS {
//     pub version: u32,
// }

// UNSUPPORTED Rust 32:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TBS_CONTEXT_PARAMS2 {
//     pub version: u32,
//     pub Anonymous: TBS_CONTEXT_PARAMS2_0,
// }

// UNSUPPORTED Rust 38:1: declaration Impl has no candidate rule
// impl Default for TBS_CONTEXT_PARAMS2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 43:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union TBS_CONTEXT_PARAMS2_0 {
//     pub Anonymous: TBS_CONTEXT_PARAMS2_0_0,
//     pub asUINT32: u32,
// }

// UNSUPPORTED Rust 49:1: declaration Impl has no candidate rule
// impl Default for TBS_CONTEXT_PARAMS2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 54:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TBS_CONTEXT_PARAMS2_0_0 {
//     pub _bitfield: u32,
// }

public const val `TBS_CONTEXT_VERSION_ONE`: UInt = 1u;
public const val `TBS_CONTEXT_VERSION_TWO`: UInt = 2u;
public const val `TBS_OWNERAUTH_TYPE_ADMIN`: UInt = 2u;
public const val `TBS_OWNERAUTH_TYPE_ENDORSEMENT`: UInt = 4u;
public const val `TBS_OWNERAUTH_TYPE_ENDORSEMENT_20`: UInt = 12u;
public const val `TBS_OWNERAUTH_TYPE_FULL`: UInt = 1u;
public const val `TBS_OWNERAUTH_TYPE_STORAGE_20`: UInt = 13u;
public const val `TBS_OWNERAUTH_TYPE_USER`: UInt = 3u;
public const val `TBS_SUCCESS`: UInt = 0u;
public const val `TBS_TCGLOG_DRTM_BOOT`: UInt = 4u;
public const val `TBS_TCGLOG_DRTM_CURRENT`: UInt = 1u;
public const val `TBS_TCGLOG_DRTM_RESUME`: UInt = 5u;
public const val `TBS_TCGLOG_SRTM_BOOT`: UInt = 2u;
public const val `TBS_TCGLOG_SRTM_CURRENT`: UInt = 0u;
public const val `TBS_TCGLOG_SRTM_RESUME`: UInt = 3u;
// UNSUPPORTED Rust 74:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TPM_DEVICE_INFO {
//     pub structVersion: u32,
//     pub tpmVersion: u32,
//     pub tpmInterfaceType: u32,
//     pub tpmImpRevision: u32,
// }

public const val `TPM_IFTYPE_1`: UInt = 1u;
public const val `TPM_IFTYPE_EMULATOR`: UInt = 4u;
public const val `TPM_IFTYPE_HW`: UInt = 3u;
public const val `TPM_IFTYPE_SPB`: UInt = 5u;
public const val `TPM_IFTYPE_TRUSTZONE`: UInt = 2u;
public const val `TPM_IFTYPE_UNKNOWN`: UInt = 0u;
public const val `TPM_VERSION_12`: UInt = 1u;
public const val `TPM_VERSION_20`: UInt = 2u;
public const val `TPM_VERSION_UNKNOWN`: UInt = 0u;
public const val `TPM_WNF_INFO_CLEAR_SUCCESSFUL`: UInt = 1u;
public const val `TPM_WNF_INFO_NO_REBOOT_REQUIRED`: UInt = 1u;
public const val `TPM_WNF_INFO_OWNERSHIP_SUCCESSFUL`: UInt = 2u;
// UNSUPPORTED Rust 94:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TPM_WNF_PROVISIONING {
//     pub status: u32,
//     pub message: [u8; 28],
// }

// UNSUPPORTED Rust 100:1: declaration Impl has no candidate rule
// impl Default for TPM_WNF_PROVISIONING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

