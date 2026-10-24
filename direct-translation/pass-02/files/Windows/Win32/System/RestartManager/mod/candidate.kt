// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("rstrtmgr.dll" "system" fn RmAddFilter(dwsessionhandle : u32, strmodulename : windows_sys::core::PCWSTR, pprocess : *const RM_UNIQUE_PROCESS, strserviceshortname : windows_sys::core::PCWSTR, filteraction : RM_FILTER_ACTION) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("rstrtmgr.dll" "system" fn RmCancelCurrentTask(dwsessionhandle : u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("rstrtmgr.dll" "system" fn RmEndSession(dwsessionhandle : u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("rstrtmgr.dll" "system" fn RmGetFilterList(dwsessionhandle : u32, pbfilterbuf : *mut u8, cbfilterbuf : u32, cbfilterbufneeded : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("rstrtmgr.dll" "system" fn RmGetList(dwsessionhandle : u32, pnprocinfoneeded : *mut u32, pnprocinfo : *mut u32, rgaffectedapps : *mut RM_PROCESS_INFO, lpdwrebootreasons : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("rstrtmgr.dll" "system" fn RmJoinSession(psessionhandle : *mut u32, strsessionkey : windows_sys::core::PCWSTR) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("rstrtmgr.dll" "system" fn RmRegisterResources(dwsessionhandle : u32, nfiles : u32, rgsfilenames : *const windows_sys::core::PCWSTR, napplications : u32, rgapplications : *const RM_UNIQUE_PROCESS, nservices : u32, rgsservicenames : *const windows_sys::core::PCWSTR) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("rstrtmgr.dll" "system" fn RmRemoveFilter(dwsessionhandle : u32, strmodulename : windows_sys::core::PCWSTR, pprocess : *const RM_UNIQUE_PROCESS, strserviceshortname : windows_sys::core::PCWSTR) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("rstrtmgr.dll" "system" fn RmRestart(dwsessionhandle : u32, dwrestartflags : u32, fnstatus : RM_WRITE_STATUS_CALLBACK) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("rstrtmgr.dll" "system" fn RmShutdown(dwsessionhandle : u32, lactionflags : u32, fnstatus : RM_WRITE_STATUS_CALLBACK) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("rstrtmgr.dll" "system" fn RmStartSession(psessionhandle : *mut u32, dwsessionflags : u32, strsessionkey : windows_sys::core::PWSTR) -> super::super::Foundation:: WIN32_ERROR);

public const val `CCH_RM_MAX_APP_NAME`: UInt = 255u;
public const val `CCH_RM_MAX_SVC_NAME`: UInt = 63u;
public const val `CCH_RM_SESSION_KEY`: UInt = 32u;
public typealias `RM_APP_STATUS` = Int;
public typealias `RM_APP_TYPE` = Int;
public typealias `RM_FILTER_ACTION` = Int;
// UNSUPPORTED Rust 18:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RM_FILTER_INFO {
//     pub FilterAction: RM_FILTER_ACTION,
//     pub FilterTrigger: RM_FILTER_TRIGGER,
//     pub cbNextOffset: u32,
//     pub Anonymous: RM_FILTER_INFO_0,
// }

// UNSUPPORTED Rust 26:1: declaration Impl has no candidate rule
// impl Default for RM_FILTER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 31:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RM_FILTER_INFO_0 {
//     pub strFilename: windows_sys::core::PWSTR,
//     pub Process: RM_UNIQUE_PROCESS,
//     pub strServiceShortName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 38:1: declaration Impl has no candidate rule
// impl Default for RM_FILTER_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RM_FILTER_TRIGGER` = Int;
public const val `RM_INVALID_PROCESS`: Int = -1;
public const val `RM_INVALID_TS_SESSION`: Int = -1;
// UNSUPPORTED Rust 46:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RM_PROCESS_INFO {
//     pub Process: RM_UNIQUE_PROCESS,
//     pub strAppName: [u16; 256],
//     pub strServiceShortName: [u16; 64],
//     pub ApplicationType: RM_APP_TYPE,
//     pub AppStatus: u32,
//     pub TSSessionId: u32,
//     pub bRestartable: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 57:1: declaration Impl has no candidate rule
// impl Default for RM_PROCESS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RM_REBOOT_REASON` = Int;
public typealias `RM_SHUTDOWN_TYPE` = Int;
// UNSUPPORTED Rust 64:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RM_UNIQUE_PROCESS {
//     pub dwProcessId: u32,
//     pub ProcessStartTime: super::super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 70:1: generic scalar type unsupported
// pub type RM_WRITE_STATUS_CALLBACK = Option<unsafe extern "system" fn(npercentcomplete: u32)>;

public const val `RmConsole`: `RM_APP_TYPE` = 5;
public const val `RmCritical`: `RM_APP_TYPE` = 1000;
public const val `RmExplorer`: `RM_APP_TYPE` = 4;
public const val `RmFilterTriggerFile`: `RM_FILTER_TRIGGER` = 1;
public const val `RmFilterTriggerInvalid`: `RM_FILTER_TRIGGER` = 0;
public const val `RmFilterTriggerProcess`: `RM_FILTER_TRIGGER` = 2;
public const val `RmFilterTriggerService`: `RM_FILTER_TRIGGER` = 3;
public const val `RmForceShutdown`: `RM_SHUTDOWN_TYPE` = 1;
public const val `RmInvalidFilterAction`: `RM_FILTER_ACTION` = 0;
public const val `RmMainWindow`: `RM_APP_TYPE` = 1;
public const val `RmNoRestart`: `RM_FILTER_ACTION` = 1;
public const val `RmNoShutdown`: `RM_FILTER_ACTION` = 2;
public const val `RmOtherWindow`: `RM_APP_TYPE` = 2;
public const val `RmRebootReasonCriticalProcess`: `RM_REBOOT_REASON` = 4;
public const val `RmRebootReasonCriticalService`: `RM_REBOOT_REASON` = 8;
public const val `RmRebootReasonDetectedSelf`: `RM_REBOOT_REASON` = 16;
public const val `RmRebootReasonNone`: `RM_REBOOT_REASON` = 0;
public const val `RmRebootReasonPermissionDenied`: `RM_REBOOT_REASON` = 1;
public const val `RmRebootReasonSessionMismatch`: `RM_REBOOT_REASON` = 2;
public const val `RmService`: `RM_APP_TYPE` = 3;
public const val `RmShutdownOnlyRegistered`: `RM_SHUTDOWN_TYPE` = 16;
public const val `RmStatusErrorOnRestart`: `RM_APP_STATUS` = 32;
public const val `RmStatusErrorOnStop`: `RM_APP_STATUS` = 16;
public const val `RmStatusRestartMasked`: `RM_APP_STATUS` = 128;
public const val `RmStatusRestarted`: `RM_APP_STATUS` = 8;
public const val `RmStatusRunning`: `RM_APP_STATUS` = 1;
public const val `RmStatusShutdownMasked`: `RM_APP_STATUS` = 64;
public const val `RmStatusStopped`: `RM_APP_STATUS` = 2;
public const val `RmStatusStoppedOther`: `RM_APP_STATUS` = 4;
public const val `RmStatusUnknown`: `RM_APP_STATUS` = 0;
public const val `RmUnknownApp`: `RM_APP_TYPE` = 0;
