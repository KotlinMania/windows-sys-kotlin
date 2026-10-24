// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("ndfapi.dll" "system" fn NdfCancelIncident(handle : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("ndfapi.dll" "system" fn NdfCloseIncident(handle : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("ndfapi.dll" "system" fn NdfCreateConnectivityIncident(handle : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("ndfapi.dll" "system" fn NdfCreateDNSIncident(hostname : windows_sys::core::PCWSTR, querytype : u16, handle : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("ndfapi.dll" "system" fn NdfCreateGroupingIncident(cloudname : windows_sys::core::PCWSTR, groupname : windows_sys::core::PCWSTR, identity : windows_sys::core::PCWSTR, invitation : windows_sys::core::PCWSTR, addresses : *const super::super::Networking::WinSock:: SOCKET_ADDRESS_LIST, appid : windows_sys::core::PCWSTR, handle : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("ndfapi.dll" "system" fn NdfCreateIncident(helperclassname : windows_sys::core::PCWSTR, celt : u32, attributes : *const HELPER_ATTRIBUTE, handle : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("ndfapi.dll" "system" fn NdfCreateNetConnectionIncident(handle : *mut *mut core::ffi::c_void, id : windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("ndfapi.dll" "system" fn NdfCreatePnrpIncident(cloudname : windows_sys::core::PCWSTR, peername : windows_sys::core::PCWSTR, diagnosepublish : windows_sys::core::BOOL, appid : windows_sys::core::PCWSTR, handle : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("ndfapi.dll" "system" fn NdfCreateSharingIncident(uncpath : windows_sys::core::PCWSTR, handle : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("ndfapi.dll" "system" fn NdfCreateWebIncident(url : windows_sys::core::PCWSTR, handle : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("ndfapi.dll" "system" fn NdfCreateWebIncidentEx(url : windows_sys::core::PCWSTR, usewinhttp : windows_sys::core::BOOL, modulename : windows_sys::core::PCWSTR, handle : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_Security"))]
// windows_link::link!("ndfapi.dll" "system" fn NdfCreateWinSockIncident(sock : super::super::Networking::WinSock:: SOCKET, host : windows_sys::core::PCWSTR, port : u16, appid : windows_sys::core::PCWSTR, userid : *const super::super::Security:: SID, handle : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("ndfapi.dll" "system" fn NdfDiagnoseIncident(handle : *const core::ffi::c_void, rootcausecount : *mut u32, rootcauses : *mut *mut RootCauseInfo, dwwait : u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("ndfapi.dll" "system" fn NdfExecuteDiagnosis(handle : *const core::ffi::c_void, hwnd : super::super::Foundation:: HWND) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("ndfapi.dll" "system" fn NdfGetTraceFile(handle : *const core::ffi::c_void, tracefilelocation : *mut windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("ndfapi.dll" "system" fn NdfRepairIncident(handle : *const core::ffi::c_void, repairex : *const RepairInfoEx, dwwait : u32) -> windows_sys::core::HRESULT);

public typealias `ATTRIBUTE_TYPE` = Int;
public const val `AT_BOOLEAN`: `ATTRIBUTE_TYPE` = 1;
public const val `AT_GUID`: `ATTRIBUTE_TYPE` = 11;
public const val `AT_INT16`: `ATTRIBUTE_TYPE` = 4;
public const val `AT_INT32`: `ATTRIBUTE_TYPE` = 6;
public const val `AT_INT64`: `ATTRIBUTE_TYPE` = 8;
public const val `AT_INT8`: `ATTRIBUTE_TYPE` = 2;
public const val `AT_INVALID`: `ATTRIBUTE_TYPE` = 0;
public const val `AT_LIFE_TIME`: `ATTRIBUTE_TYPE` = 12;
public const val `AT_OCTET_STRING`: `ATTRIBUTE_TYPE` = 14;
public const val `AT_SOCKADDR`: `ATTRIBUTE_TYPE` = 13;
public const val `AT_STRING`: `ATTRIBUTE_TYPE` = 10;
public const val `AT_UINT16`: `ATTRIBUTE_TYPE` = 5;
public const val `AT_UINT32`: `ATTRIBUTE_TYPE` = 7;
public const val `AT_UINT64`: `ATTRIBUTE_TYPE` = 9;
public const val `AT_UINT8`: `ATTRIBUTE_TYPE` = 3;
public const val `DF_IMPERSONATION`: UInt = 2147483648u;
public const val `DF_TRACELESS`: UInt = 1073741824u;
public typealias `DIAGNOSIS_STATUS` = Int;
// UNSUPPORTED Rust 38:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DIAG_SOCKADDR {
//     pub family: u16,
//     pub data: [i8; 126],
// }

// UNSUPPORTED Rust 44:1: declaration Impl has no candidate rule
// impl Default for DIAG_SOCKADDR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DS_CONFIRMED`: `DIAGNOSIS_STATUS` = 1;
public const val `DS_DEFERRED`: `DIAGNOSIS_STATUS` = 4;
public const val `DS_INDETERMINATE`: `DIAGNOSIS_STATUS` = 3;
public const val `DS_NOT_IMPLEMENTED`: `DIAGNOSIS_STATUS` = 0;
public const val `DS_PASSTHROUGH`: `DIAGNOSIS_STATUS` = 5;
public const val `DS_REJECTED`: `DIAGNOSIS_STATUS` = 2;
// UNSUPPORTED Rust 55:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DiagnosticsInfo {
//     pub cost: i32,
//     pub flags: u32,
// }

// UNSUPPORTED Rust 61:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HELPER_ATTRIBUTE {
//     pub pwszName: windows_sys::core::PWSTR,
//     pub r#type: ATTRIBUTE_TYPE,
//     pub Anonymous: HELPER_ATTRIBUTE_0,
// }

// UNSUPPORTED Rust 68:1: declaration Impl has no candidate rule
// impl Default for HELPER_ATTRIBUTE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 73:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union HELPER_ATTRIBUTE_0 {
//     pub Boolean: windows_sys::core::BOOL,
//     pub Char: u8,
//     pub Byte: u8,
//     pub Short: i16,
//     pub Word: u16,
//     pub Int: i32,
//     pub DWord: u32,
//     pub Int64: i64,
//     pub UInt64: u64,
//     pub PWStr: windows_sys::core::PWSTR,
//     pub Guid: windows_sys::core::GUID,
//     pub LifeTime: LIFE_TIME,
//     pub Address: DIAG_SOCKADDR,
//     pub OctetString: OCTET_STRING,
// }

// UNSUPPORTED Rust 91:1: declaration Impl has no candidate rule
// impl Default for HELPER_ATTRIBUTE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 96:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HYPOTHESIS {
//     pub pwszClassName: windows_sys::core::PWSTR,
//     pub pwszDescription: windows_sys::core::PWSTR,
//     pub celt: u32,
//     pub rgAttributes: *mut HELPER_ATTRIBUTE,
// }

// UNSUPPORTED Rust 104:1: declaration Impl has no candidate rule
// impl Default for HYPOTHESIS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 109:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HelperAttributeInfo {
//     pub pwszName: windows_sys::core::PWSTR,
//     pub r#type: ATTRIBUTE_TYPE,
// }

// UNSUPPORTED Rust 115:1: declaration Impl has no candidate rule
// impl Default for HelperAttributeInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 120:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HypothesisResult {
//     pub hypothesis: HYPOTHESIS,
//     pub pathStatus: DIAGNOSIS_STATUS,
// }

// UNSUPPORTED Rust 126:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct LIFE_TIME {
//     pub startTime: super::super::Foundation::FILETIME,
//     pub endTime: super::super::Foundation::FILETIME,
// }

public const val `NDF_ADD_CAPTURE_TRACE`: UInt = 1u;
public const val `NDF_APPLY_INCLUSION_LIST_FILTER`: UInt = 2u;
public const val `NDF_ERROR_START`: UInt = 63744u;
public const val `NDF_E_BAD_PARAM`: Int = -2146895611;
public const val `NDF_E_CANCELLED`: Int = -2146895614;
public const val `NDF_E_DISABLED`: Int = -2146895612;
public const val `NDF_E_LENGTH_EXCEEDED`: Int = -2146895616;
public const val `NDF_E_NOHELPERCLASS`: Int = -2146895615;
public const val `NDF_E_PROBLEM_PRESENT`: Int = -2146895608;
public const val `NDF_E_UNKNOWN`: Int = -2146895609;
public const val `NDF_E_VALIDATION`: Int = -2146895610;
public const val `NDF_INBOUND_FLAG_EDGETRAVERSAL`: UInt = 1u;
public const val `NDF_INBOUND_FLAG_HEALTHCHECK`: UInt = 2u;
// UNSUPPORTED Rust 145:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OCTET_STRING {
//     pub dwLength: u32,
//     pub lpValue: *mut u8,
// }

// UNSUPPORTED Rust 151:1: declaration Impl has no candidate rule
// impl Default for OCTET_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PROBLEM_TYPE` = Int;
public const val `PT_DOWN_STREAM_HEALTH`: `PROBLEM_TYPE` = 4;
public const val `PT_HIGHER_UTILIZATION`: `PROBLEM_TYPE` = 16;
public const val `PT_HIGH_UTILIZATION`: `PROBLEM_TYPE` = 8;
public const val `PT_INVALID`: `PROBLEM_TYPE` = 0;
public const val `PT_LOWER_HEALTH`: `PROBLEM_TYPE` = 2;
public const val `PT_LOW_HEALTH`: `PROBLEM_TYPE` = 1;
public const val `PT_UP_STREAM_UTILIZATION`: `PROBLEM_TYPE` = 32;
public const val `RCF_ISCONFIRMED`: UInt = 2u;
public const val `RCF_ISLEAF`: UInt = 1u;
public const val `RCF_ISTHIRDPARTY`: UInt = 4u;
public typealias `REPAIR_RISK` = Int;
public typealias `REPAIR_SCOPE` = Int;
public typealias `REPAIR_STATUS` = Int;
public const val `RF_CONTACT_ADMIN`: UInt = 131072u;
public const val `RF_INFORMATION_ONLY`: UInt = 33554432u;
public const val `RF_REPRO`: UInt = 2097152u;
public const val `RF_RESERVED`: UInt = 1073741824u;
public const val `RF_RESERVED_CA`: UInt = 2147483648u;
public const val `RF_RESERVED_LNI`: UInt = 65536u;
public const val `RF_SHOW_EVENTS`: UInt = 8388608u;
public const val `RF_UI_ONLY`: UInt = 16777216u;
public const val `RF_USER_ACTION`: UInt = 268435456u;
public const val `RF_USER_CONFIRMATION`: UInt = 134217728u;
public const val `RF_VALIDATE_HELPTOPIC`: UInt = 4194304u;
public const val `RF_WORKAROUND`: UInt = 536870912u;
public const val `RR_NORISK`: `REPAIR_RISK` = 2;
public const val `RR_NOROLLBACK`: `REPAIR_RISK` = 0;
public const val `RR_ROLLBACK`: `REPAIR_RISK` = 1;
public const val `RS_APPLICATION`: `REPAIR_SCOPE` = 2;
public const val `RS_DEFERRED`: `REPAIR_STATUS` = 3;
public const val `RS_NOT_IMPLEMENTED`: `REPAIR_STATUS` = 0;
public const val `RS_PROCESS`: `REPAIR_SCOPE` = 3;
public const val `RS_REPAIRED`: `REPAIR_STATUS` = 1;
public const val `RS_SYSTEM`: `REPAIR_SCOPE` = 0;
public const val `RS_UNREPAIRED`: `REPAIR_STATUS` = 2;
public const val `RS_USER`: `REPAIR_SCOPE` = 1;
public const val `RS_USER_ACTION`: `REPAIR_STATUS` = 4;
// UNSUPPORTED Rust 194:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RepairInfo {
//     pub guid: windows_sys::core::GUID,
//     pub pwszClassName: windows_sys::core::PWSTR,
//     pub pwszDescription: windows_sys::core::PWSTR,
//     pub sidType: u32,
//     pub cost: i32,
//     pub flags: u32,
//     pub scope: REPAIR_SCOPE,
//     pub risk: REPAIR_RISK,
//     pub UiInfo: UiInfo,
//     pub rootCauseIndex: i32,
// }

// UNSUPPORTED Rust 208:1: declaration Impl has no candidate rule
// impl Default for RepairInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 213:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RepairInfoEx {
//     pub repair: RepairInfo,
//     pub repairRank: u16,
// }

// UNSUPPORTED Rust 219:1: declaration Impl has no candidate rule
// impl Default for RepairInfoEx {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 224:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RootCauseInfo {
//     pub pwszDescription: windows_sys::core::PWSTR,
//     pub rootCauseID: windows_sys::core::GUID,
//     pub rootCauseFlags: u32,
//     pub networkInterfaceID: windows_sys::core::GUID,
//     pub pRepairs: *mut RepairInfoEx,
//     pub repairCount: u16,
// }

// UNSUPPORTED Rust 234:1: declaration Impl has no candidate rule
// impl Default for RootCauseInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 239:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ShellCommandInfo {
//     pub pwszOperation: windows_sys::core::PWSTR,
//     pub pwszFile: windows_sys::core::PWSTR,
//     pub pwszParameters: windows_sys::core::PWSTR,
//     pub pwszDirectory: windows_sys::core::PWSTR,
//     pub nShowCmd: u32,
// }

// UNSUPPORTED Rust 248:1: declaration Impl has no candidate rule
// impl Default for ShellCommandInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `UIT_DUI`: `UI_INFO_TYPE` = 4;
public const val `UIT_HELP_PANE`: `UI_INFO_TYPE` = 3;
public const val `UIT_INVALID`: `UI_INFO_TYPE` = 0;
public const val `UIT_NONE`: `UI_INFO_TYPE` = 1;
public const val `UIT_SHELL_COMMAND`: `UI_INFO_TYPE` = 2;
public typealias `UI_INFO_TYPE` = Int;
// UNSUPPORTED Rust 259:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct UiInfo {
//     pub r#type: UI_INFO_TYPE,
//     pub Anonymous: UiInfo_0,
// }

// UNSUPPORTED Rust 265:1: declaration Impl has no candidate rule
// impl Default for UiInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 270:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union UiInfo_0 {
//     pub pwzNull: windows_sys::core::PWSTR,
//     pub ShellInfo: ShellCommandInfo,
//     pub pwzHelpUrl: windows_sys::core::PWSTR,
//     pub pwzDui: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 278:1: declaration Impl has no candidate rule
// impl Default for UiInfo_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

