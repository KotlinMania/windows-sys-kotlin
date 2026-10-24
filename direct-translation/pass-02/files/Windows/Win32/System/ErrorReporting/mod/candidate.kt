// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("faultrep.dll" "system" fn AddERExcludedApplicationA(szapplication : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("faultrep.dll" "system" fn AddERExcludedApplicationW(wszapplication : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
// windows_link::link!("faultrep.dll" "system" fn ReportFault(pep : *const super::Diagnostics::Debug:: EXCEPTION_POINTERS, dwopt : u32) -> EFaultRepRetVal);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("wer.dll" "system" fn WerAddExcludedApplication(pwzexename : windows_sys::core::PCWSTR, ballusers : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("wer.dll" "system" fn WerFreeString(pwszstr : windows_sys::core::PCWSTR));

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WerGetFlags(hprocess : super::super::Foundation:: HANDLE, pdwflags : *mut WER_FAULT_REPORTING) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WerRegisterAdditionalProcess(processid : u32, captureextrainfoforthreadid : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WerRegisterAppLocalDump(localappdatarelativepath : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WerRegisterCustomMetadata(key : windows_sys::core::PCWSTR, value : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WerRegisterExcludedMemoryBlock(address : *const core::ffi::c_void, size : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WerRegisterFile(pwzfile : windows_sys::core::PCWSTR, regfiletype : WER_REGISTER_FILE_TYPE, dwflags : WER_FILE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WerRegisterMemoryBlock(pvaddress : *const core::ffi::c_void, dwsize : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WerRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll : windows_sys::core::PCWSTR, pcontext : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("wer.dll" "system" fn WerRemoveExcludedApplication(pwzexename : windows_sys::core::PCWSTR, ballusers : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
// windows_link::link!("wer.dll" "system" fn WerReportAddDump(hreporthandle : HREPORT, hprocess : super::super::Foundation:: HANDLE, hthread : super::super::Foundation:: HANDLE, dumptype : WER_DUMP_TYPE, pexceptionparam : *const WER_EXCEPTION_INFORMATION, pdumpcustomoptions : *const WER_DUMP_CUSTOM_OPTIONS, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("wer.dll" "system" fn WerReportAddFile(hreporthandle : HREPORT, pwzpath : windows_sys::core::PCWSTR, repfiletype : WER_FILE_TYPE, dwfileflags : WER_FILE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("wer.dll" "system" fn WerReportCloseHandle(hreporthandle : HREPORT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("wer.dll" "system" fn WerReportCreate(pwzeventtype : windows_sys::core::PCWSTR, reptype : WER_REPORT_TYPE, preportinformation : *const WER_REPORT_INFORMATION, phreporthandle : *mut HREPORT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("faultrep.dll" "system" fn WerReportHang(hwndhungapp : super::super::Foundation:: HWND, pwzhungapplicationname : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("wer.dll" "system" fn WerReportSetParameter(hreporthandle : HREPORT, dwparamid : u32, pwzname : windows_sys::core::PCWSTR, pwzvalue : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("wer.dll" "system" fn WerReportSetUIOption(hreporthandle : HREPORT, repuitypeid : WER_REPORT_UI, pwzvalue : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("wer.dll" "system" fn WerReportSubmit(hreporthandle : HREPORT, consent : WER_CONSENT, dwflags : WER_SUBMIT_FLAGS, psubmitresult : *mut WER_SUBMIT_RESULT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WerSetFlags(dwflags : WER_FAULT_REPORTING) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("wer.dll" "system" fn WerStoreClose(hreportstore : HREPORTSTORE));

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("wer.dll" "system" fn WerStoreGetFirstReportKey(hreportstore : HREPORTSTORE, ppszreportkey : *mut windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("wer.dll" "system" fn WerStoreGetNextReportKey(hreportstore : HREPORTSTORE, ppszreportkey : *mut windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("wer.dll" "system" fn WerStoreGetReportCount(hreportstore : HREPORTSTORE, pdwreportcount : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("wer.dll" "system" fn WerStoreGetSizeOnDisk(hreportstore : HREPORTSTORE, pqwsizeinbytes : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("wer.dll" "system" fn WerStoreOpen(repstoretype : REPORT_STORE_TYPES, phreportstore : *mut HREPORTSTORE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("wer.dll" "system" fn WerStorePurge() -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("wer.dll" "system" fn WerStoreQueryReportMetadataV1(hreportstore : HREPORTSTORE, pszreportkey : windows_sys::core::PCWSTR, preportmetadata : *mut WER_REPORT_METADATA_V1) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("wer.dll" "system" fn WerStoreQueryReportMetadataV2(hreportstore : HREPORTSTORE, pszreportkey : windows_sys::core::PCWSTR, preportmetadata : *mut WER_REPORT_METADATA_V2) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("wer.dll" "system" fn WerStoreQueryReportMetadataV3(hreportstore : HREPORTSTORE, pszreportkey : windows_sys::core::PCWSTR, preportmetadata : *mut WER_REPORT_METADATA_V3) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("wer.dll" "system" fn WerStoreUploadReport(hreportstore : HREPORTSTORE, pszreportkey : windows_sys::core::PCWSTR, dwflags : u32, psubmitresult : *mut WER_SUBMIT_RESULT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WerUnregisterAdditionalProcess(processid : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WerUnregisterAppLocalDump() -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WerUnregisterCustomMetadata(key : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WerUnregisterExcludedMemoryBlock(address : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WerUnregisterFile(pwzfilepath : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WerUnregisterMemoryBlock(pvaddress : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WerUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll : windows_sys::core::PCWSTR, pcontext : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 44:1: non-scalar type Ptr unsupported
// pub const APPCRASH_EVENT: windows_sys::core::PCWSTR = windows_sys::core::w!("APPCRASH");

public typealias `EFaultRepRetVal` = Int;
public const val `E_STORE_INVALID`: `REPORT_STORE_TYPES` = 4;
public const val `E_STORE_MACHINE_ARCHIVE`: `REPORT_STORE_TYPES` = 2;
public const val `E_STORE_MACHINE_QUEUE`: `REPORT_STORE_TYPES` = 3;
public const val `E_STORE_USER_ARCHIVE`: `REPORT_STORE_TYPES` = 0;
public const val `E_STORE_USER_QUEUE`: `REPORT_STORE_TYPES` = 1;
// UNSUPPORTED Rust 51:1: non-scalar type Ptr unsupported
// pub type HREPORT = *mut core::ffi::c_void;

// UNSUPPORTED Rust 52:1: non-scalar type Ptr unsupported
// pub type HREPORTSTORE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 53:1: non-scalar type Ptr unsupported
// pub const PACKAGED_APPCRASH_EVENT: windows_sys::core::PCWSTR = windows_sys::core::w!("MoAppCrash");

// UNSUPPORTED Rust 54:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
// pub type PFN_WER_RUNTIME_EXCEPTION_DEBUGGER_LAUNCH = Option<unsafe extern "system" fn(pcontext: *const core::ffi::c_void, pexceptioninformation: *const WER_RUNTIME_EXCEPTION_INFORMATION, pbiscustomdebugger: *mut windows_sys::core::BOOL, pwszdebuggerlaunch: windows_sys::core::PWSTR, pchdebuggerlaunch: *mut u32, pbisdebuggerautolaunch: *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 56:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
// pub type PFN_WER_RUNTIME_EXCEPTION_EVENT = Option<unsafe extern "system" fn(pcontext: *const core::ffi::c_void, pexceptioninformation: *const WER_RUNTIME_EXCEPTION_INFORMATION, pbownershipclaimed: *mut windows_sys::core::BOOL, pwszeventname: windows_sys::core::PWSTR, pchsize: *mut u32, pdwsignaturecount: *mut u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 58:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
// pub type PFN_WER_RUNTIME_EXCEPTION_EVENT_SIGNATURE = Option<unsafe extern "system" fn(pcontext: *const core::ffi::c_void, pexceptioninformation: *const WER_RUNTIME_EXCEPTION_INFORMATION, dwindex: u32, pwszname: windows_sys::core::PWSTR, pchname: *mut u32, pwszvalue: windows_sys::core::PWSTR, pchvalue: *mut u32) -> windows_sys::core::HRESULT>;

public typealias `REPORT_STORE_TYPES` = Int;
public typealias `WER_CONSENT` = Int;
public const val `WER_DUMP_AUXILIARY`: UInt = 2u;
// UNSUPPORTED Rust 63:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WER_DUMP_CUSTOM_OPTIONS {
//     pub dwSize: u32,
//     pub dwMask: u32,
//     pub dwDumpFlags: u32,
//     pub bOnlyThisThread: windows_sys::core::BOOL,
//     pub dwExceptionThreadFlags: u32,
//     pub dwOtherThreadFlags: u32,
//     pub dwExceptionThreadExFlags: u32,
//     pub dwOtherThreadExFlags: u32,
//     pub dwPreferredModuleFlags: u32,
//     pub dwOtherModuleFlags: u32,
//     pub wzPreferredModuleList: [u16; 256],
// }

// UNSUPPORTED Rust 78:1: declaration Impl has no candidate rule
// impl Default for WER_DUMP_CUSTOM_OPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 83:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WER_DUMP_CUSTOM_OPTIONS_V2 {
//     pub dwSize: u32,
//     pub dwMask: u32,
//     pub dwDumpFlags: u32,
//     pub bOnlyThisThread: windows_sys::core::BOOL,
//     pub dwExceptionThreadFlags: u32,
//     pub dwOtherThreadFlags: u32,
//     pub dwExceptionThreadExFlags: u32,
//     pub dwOtherThreadExFlags: u32,
//     pub dwPreferredModuleFlags: u32,
//     pub dwOtherModuleFlags: u32,
//     pub wzPreferredModuleList: [u16; 256],
//     pub dwPreferredModuleResetFlags: u32,
//     pub dwOtherModuleResetFlags: u32,
// }

// UNSUPPORTED Rust 100:1: declaration Impl has no candidate rule
// impl Default for WER_DUMP_CUSTOM_OPTIONS_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 105:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WER_DUMP_CUSTOM_OPTIONS_V3 {
//     pub dwSize: u32,
//     pub dwMask: u32,
//     pub dwDumpFlags: u32,
//     pub bOnlyThisThread: windows_sys::core::BOOL,
//     pub dwExceptionThreadFlags: u32,
//     pub dwOtherThreadFlags: u32,
//     pub dwExceptionThreadExFlags: u32,
//     pub dwOtherThreadExFlags: u32,
//     pub dwPreferredModuleFlags: u32,
//     pub dwOtherModuleFlags: u32,
//     pub wzPreferredModuleList: [u16; 256],
//     pub dwPreferredModuleResetFlags: u32,
//     pub dwOtherModuleResetFlags: u32,
//     pub pvDumpKey: *mut core::ffi::c_void,
//     pub hSnapshot: super::super::Foundation::HANDLE,
//     pub dwThreadID: u32,
// }

// UNSUPPORTED Rust 125:1: declaration Impl has no candidate rule
// impl Default for WER_DUMP_CUSTOM_OPTIONS_V3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WER_DUMP_MASK_START`: UInt = 1u;
public const val `WER_DUMP_NOHEAP_ONQUEUE`: UInt = 1u;
public typealias `WER_DUMP_TYPE` = Int;
// UNSUPPORTED Rust 133:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
// #[derive(Clone, Copy)]
// pub struct WER_EXCEPTION_INFORMATION {
//     pub pExceptionPointers: *mut super::Diagnostics::Debug::EXCEPTION_POINTERS,
//     pub bClientPointers: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 140:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
// impl Default for WER_EXCEPTION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WER_FAULT_REPORTING` = UInt;
public const val `WER_FAULT_REPORTING_ALWAYS_SHOW_UI`: `WER_FAULT_REPORTING` = 16u;
public const val `WER_FAULT_REPORTING_CRITICAL`: UInt = 512u;
public const val `WER_FAULT_REPORTING_DISABLE_SNAPSHOT_CRASH`: UInt = 128u;
public const val `WER_FAULT_REPORTING_DISABLE_SNAPSHOT_HANG`: UInt = 256u;
public const val `WER_FAULT_REPORTING_DURABLE`: UInt = 1024u;
public const val `WER_FAULT_REPORTING_FLAG_DISABLE_THREAD_SUSPENSION`: `WER_FAULT_REPORTING` = 4u;
public const val `WER_FAULT_REPORTING_FLAG_NOHEAP`: `WER_FAULT_REPORTING` = 1u;
public const val `WER_FAULT_REPORTING_FLAG_NO_HEAP_ON_QUEUE`: UInt = 64u;
public const val `WER_FAULT_REPORTING_FLAG_QUEUE`: `WER_FAULT_REPORTING` = 2u;
public const val `WER_FAULT_REPORTING_FLAG_QUEUE_UPLOAD`: `WER_FAULT_REPORTING` = 8u;
public const val `WER_FAULT_REPORTING_NO_UI`: UInt = 32u;
public typealias `WER_FILE` = UInt;
public const val `WER_FILE_ANONYMOUS_DATA`: `WER_FILE` = 2u;
public const val `WER_FILE_COMPRESSED`: UInt = 4u;
public const val `WER_FILE_DELETE_WHEN_DONE`: `WER_FILE` = 1u;
public typealias `WER_FILE_TYPE` = Int;
public const val `WER_MAX_APPLICATION_NAME_LENGTH`: UInt = 128u;
public const val `WER_MAX_BUCKET_ID_STRING_LENGTH`: UInt = 260u;
public const val `WER_MAX_DESCRIPTION_LENGTH`: UInt = 512u;
public const val `WER_MAX_EVENT_NAME_LENGTH`: UInt = 64u;
public const val `WER_MAX_FRIENDLY_EVENT_NAME_LENGTH`: UInt = 128u;
public const val `WER_MAX_LOCAL_DUMP_SUBPATH_LENGTH`: UInt = 64u;
public const val `WER_MAX_PARAM_COUNT`: UInt = 10u;
public const val `WER_MAX_PARAM_LENGTH`: UInt = 260u;
public const val `WER_MAX_PREFERRED_MODULES`: UInt = 128u;
public const val `WER_MAX_PREFERRED_MODULES_BUFFER`: UInt = 256u;
public const val `WER_MAX_REGISTERED_DUMPCOLLECTION`: UInt = 4u;
public const val `WER_MAX_REGISTERED_ENTRIES`: UInt = 512u;
public const val `WER_MAX_REGISTERED_METADATA`: UInt = 8u;
public const val `WER_MAX_REGISTERED_RUNTIME_EXCEPTION_MODULES`: UInt = 16u;
public const val `WER_MAX_SIGNATURE_NAME_LENGTH`: UInt = 128u;
public const val `WER_MAX_TOTAL_PARAM_LENGTH`: UInt = 1720u;
public const val `WER_METADATA_KEY_MAX_LENGTH`: UInt = 64u;
public const val `WER_METADATA_VALUE_MAX_LENGTH`: UInt = 128u;
public const val `WER_P0`: UInt = 0u;
public const val `WER_P1`: UInt = 1u;
public const val `WER_P2`: UInt = 2u;
public const val `WER_P3`: UInt = 3u;
public const val `WER_P4`: UInt = 4u;
public const val `WER_P5`: UInt = 5u;
public const val `WER_P6`: UInt = 6u;
public const val `WER_P7`: UInt = 7u;
public const val `WER_P8`: UInt = 8u;
public const val `WER_P9`: UInt = 9u;
public typealias `WER_REGISTER_FILE_TYPE` = Int;
// UNSUPPORTED Rust 192:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WER_REPORT_INFORMATION {
//     pub dwSize: u32,
//     pub hProcess: super::super::Foundation::HANDLE,
//     pub wzConsentKey: [u16; 64],
//     pub wzFriendlyEventName: [u16; 128],
//     pub wzApplicationName: [u16; 128],
//     pub wzApplicationPath: [u16; 260],
//     pub wzDescription: [u16; 512],
//     pub hwndParent: super::super::Foundation::HWND,
// }

// UNSUPPORTED Rust 204:1: declaration Impl has no candidate rule
// impl Default for WER_REPORT_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 209:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WER_REPORT_INFORMATION_V3 {
//     pub dwSize: u32,
//     pub hProcess: super::super::Foundation::HANDLE,
//     pub wzConsentKey: [u16; 64],
//     pub wzFriendlyEventName: [u16; 128],
//     pub wzApplicationName: [u16; 128],
//     pub wzApplicationPath: [u16; 260],
//     pub wzDescription: [u16; 512],
//     pub hwndParent: super::super::Foundation::HWND,
//     pub wzNamespacePartner: [u16; 64],
//     pub wzNamespaceGroup: [u16; 64],
// }

// UNSUPPORTED Rust 223:1: declaration Impl has no candidate rule
// impl Default for WER_REPORT_INFORMATION_V3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 228:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WER_REPORT_INFORMATION_V4 {
//     pub dwSize: u32,
//     pub hProcess: super::super::Foundation::HANDLE,
//     pub wzConsentKey: [u16; 64],
//     pub wzFriendlyEventName: [u16; 128],
//     pub wzApplicationName: [u16; 128],
//     pub wzApplicationPath: [u16; 260],
//     pub wzDescription: [u16; 512],
//     pub hwndParent: super::super::Foundation::HWND,
//     pub wzNamespacePartner: [u16; 64],
//     pub wzNamespaceGroup: [u16; 64],
//     pub rgbApplicationIdentity: [u8; 16],
//     pub hSnapshot: super::super::Foundation::HANDLE,
//     pub hDeleteFilesImpersonationToken: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 245:1: declaration Impl has no candidate rule
// impl Default for WER_REPORT_INFORMATION_V4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 250:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WER_REPORT_INFORMATION_V5 {
//     pub dwSize: u32,
//     pub hProcess: super::super::Foundation::HANDLE,
//     pub wzConsentKey: [u16; 64],
//     pub wzFriendlyEventName: [u16; 128],
//     pub wzApplicationName: [u16; 128],
//     pub wzApplicationPath: [u16; 260],
//     pub wzDescription: [u16; 512],
//     pub hwndParent: super::super::Foundation::HWND,
//     pub wzNamespacePartner: [u16; 64],
//     pub wzNamespaceGroup: [u16; 64],
//     pub rgbApplicationIdentity: [u8; 16],
//     pub hSnapshot: super::super::Foundation::HANDLE,
//     pub hDeleteFilesImpersonationToken: super::super::Foundation::HANDLE,
//     pub submitResultMax: WER_SUBMIT_RESULT,
// }

// UNSUPPORTED Rust 268:1: declaration Impl has no candidate rule
// impl Default for WER_REPORT_INFORMATION_V5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 273:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WER_REPORT_METADATA_V1 {
//     pub Signature: WER_REPORT_SIGNATURE,
//     pub BucketId: windows_sys::core::GUID,
//     pub ReportId: windows_sys::core::GUID,
//     pub CreationTime: super::super::Foundation::FILETIME,
//     pub SizeInBytes: u64,
// }

// UNSUPPORTED Rust 282:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WER_REPORT_METADATA_V2 {
//     pub Signature: WER_REPORT_SIGNATURE,
//     pub BucketId: windows_sys::core::GUID,
//     pub ReportId: windows_sys::core::GUID,
//     pub CreationTime: super::super::Foundation::FILETIME,
//     pub SizeInBytes: u64,
//     pub CabId: [u16; 260],
//     pub ReportStatus: u32,
//     pub ReportIntegratorId: windows_sys::core::GUID,
//     pub NumberOfFiles: u32,
//     pub SizeOfFileNames: u32,
//     pub FileNames: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 297:1: declaration Impl has no candidate rule
// impl Default for WER_REPORT_METADATA_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 302:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WER_REPORT_METADATA_V3 {
//     pub Signature: WER_REPORT_SIGNATURE,
//     pub BucketId: windows_sys::core::GUID,
//     pub ReportId: windows_sys::core::GUID,
//     pub CreationTime: super::super::Foundation::FILETIME,
//     pub SizeInBytes: u64,
//     pub CabId: [u16; 260],
//     pub ReportStatus: u32,
//     pub ReportIntegratorId: windows_sys::core::GUID,
//     pub NumberOfFiles: u32,
//     pub SizeOfFileNames: u32,
//     pub FileNames: windows_sys::core::PWSTR,
//     pub FriendlyEventName: [u16; 128],
//     pub ApplicationName: [u16; 128],
//     pub ApplicationPath: [u16; 260],
//     pub Description: [u16; 512],
//     pub BucketIdString: [u16; 260],
//     pub LegacyBucketId: u64,
// }

// UNSUPPORTED Rust 323:1: declaration Impl has no candidate rule
// impl Default for WER_REPORT_METADATA_V3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 328:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WER_REPORT_PARAMETER {
//     pub Name: [u16; 129],
//     pub Value: [u16; 260],
// }

// UNSUPPORTED Rust 334:1: declaration Impl has no candidate rule
// impl Default for WER_REPORT_PARAMETER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 339:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WER_REPORT_SIGNATURE {
//     pub EventName: [u16; 65],
//     pub Parameters: [WER_REPORT_PARAMETER; 10],
// }

// UNSUPPORTED Rust 345:1: declaration Impl has no candidate rule
// impl Default for WER_REPORT_SIGNATURE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WER_REPORT_TYPE` = Int;
public typealias `WER_REPORT_UI` = Int;
// UNSUPPORTED Rust 352:1: non-scalar type Ptr unsupported
// pub const WER_RUNTIME_EXCEPTION_DEBUGGER_LAUNCH: windows_sys::core::PCSTR = windows_sys::core::s!("OutOfProcessExceptionEventDebuggerLaunchCallback");

// UNSUPPORTED Rust 353:1: non-scalar type Ptr unsupported
// pub const WER_RUNTIME_EXCEPTION_EVENT_FUNCTION: windows_sys::core::PCSTR = windows_sys::core::s!("OutOfProcessExceptionEventCallback");

// UNSUPPORTED Rust 354:1: non-scalar type Ptr unsupported
// pub const WER_RUNTIME_EXCEPTION_EVENT_SIGNATURE_FUNCTION: windows_sys::core::PCSTR = windows_sys::core::s!("OutOfProcessExceptionEventSignatureCallback");

// UNSUPPORTED Rust 355:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
// #[derive(Clone, Copy)]
// pub struct WER_RUNTIME_EXCEPTION_INFORMATION {
//     pub dwSize: u32,
//     pub hProcess: super::super::Foundation::HANDLE,
//     pub hThread: super::super::Foundation::HANDLE,
//     pub exceptionRecord: super::Diagnostics::Debug::EXCEPTION_RECORD,
//     pub context: super::Diagnostics::Debug::CONTEXT,
//     pub pwszReportId: windows_sys::core::PCWSTR,
//     pub bIsFatal: windows_sys::core::BOOL,
//     pub dwReserved: u32,
// }

// UNSUPPORTED Rust 368:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
// impl Default for WER_RUNTIME_EXCEPTION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WER_SUBMIT_ADD_REGISTERED_DATA`: `WER_SUBMIT_FLAGS` = 16u;
public const val `WER_SUBMIT_ARCHIVE_PARAMETERS_ONLY`: `WER_SUBMIT_FLAGS` = 4096u;
public const val `WER_SUBMIT_BYPASS_DATA_THROTTLING`: `WER_SUBMIT_FLAGS` = 2048u;
public const val `WER_SUBMIT_BYPASS_NETWORK_COST_THROTTLING`: UInt = 32768u;
public const val `WER_SUBMIT_BYPASS_POWER_THROTTLING`: UInt = 16384u;
public typealias `WER_SUBMIT_FLAGS` = UInt;
public const val `WER_SUBMIT_HONOR_RECOVERY`: `WER_SUBMIT_FLAGS` = 1u;
public const val `WER_SUBMIT_HONOR_RESTART`: `WER_SUBMIT_FLAGS` = 2u;
public const val `WER_SUBMIT_NO_ARCHIVE`: `WER_SUBMIT_FLAGS` = 256u;
public const val `WER_SUBMIT_NO_CLOSE_UI`: `WER_SUBMIT_FLAGS` = 64u;
public const val `WER_SUBMIT_NO_QUEUE`: `WER_SUBMIT_FLAGS` = 128u;
public const val `WER_SUBMIT_OUTOFPROCESS`: `WER_SUBMIT_FLAGS` = 32u;
public const val `WER_SUBMIT_OUTOFPROCESS_ASYNC`: `WER_SUBMIT_FLAGS` = 1024u;
public const val `WER_SUBMIT_QUEUE`: `WER_SUBMIT_FLAGS` = 4u;
public const val `WER_SUBMIT_REPORT_MACHINE_ID`: `WER_SUBMIT_FLAGS` = 8192u;
public typealias `WER_SUBMIT_RESULT` = Int;
public const val `WER_SUBMIT_SHOW_DEBUG`: `WER_SUBMIT_FLAGS` = 8u;
public const val `WER_SUBMIT_START_MINIMIZED`: `WER_SUBMIT_FLAGS` = 512u;
public const val `WerConsentAlwaysPrompt`: `WER_CONSENT` = 4;
public const val `WerConsentApproved`: `WER_CONSENT` = 2;
public const val `WerConsentDenied`: `WER_CONSENT` = 3;
public const val `WerConsentMax`: `WER_CONSENT` = 5;
public const val `WerConsentNotAsked`: `WER_CONSENT` = 1;
public const val `WerCustomAction`: `WER_SUBMIT_RESULT` = 9;
public const val `WerDisabled`: `WER_SUBMIT_RESULT` = 5;
public const val `WerDisabledQueue`: `WER_SUBMIT_RESULT` = 7;
public const val `WerDumpTypeHeapDump`: `WER_DUMP_TYPE` = 3;
public const val `WerDumpTypeMax`: `WER_DUMP_TYPE` = 5;
public const val `WerDumpTypeMicroDump`: `WER_DUMP_TYPE` = 1;
public const val `WerDumpTypeMiniDump`: `WER_DUMP_TYPE` = 2;
public const val `WerDumpTypeNone`: `WER_DUMP_TYPE` = 0;
public const val `WerDumpTypeTriageDump`: `WER_DUMP_TYPE` = 4;
public const val `WerFileTypeAuxiliaryDump`: `WER_FILE_TYPE` = 8;
public const val `WerFileTypeCustomDump`: `WER_FILE_TYPE` = 7;
public const val `WerFileTypeEtlTrace`: `WER_FILE_TYPE` = 9;
public const val `WerFileTypeHeapdump`: `WER_FILE_TYPE` = 3;
public const val `WerFileTypeMax`: `WER_FILE_TYPE` = 10;
public const val `WerFileTypeMicrodump`: `WER_FILE_TYPE` = 1;
public const val `WerFileTypeMinidump`: `WER_FILE_TYPE` = 2;
public const val `WerFileTypeOther`: `WER_FILE_TYPE` = 5;
public const val `WerFileTypeTriagedump`: `WER_FILE_TYPE` = 6;
public const val `WerFileTypeUserDocument`: `WER_FILE_TYPE` = 4;
public const val `WerRegFileTypeMax`: `WER_REGISTER_FILE_TYPE` = 3;
public const val `WerRegFileTypeOther`: `WER_REGISTER_FILE_TYPE` = 2;
public const val `WerRegFileTypeUserDocument`: `WER_REGISTER_FILE_TYPE` = 1;
public const val `WerReportApplicationCrash`: `WER_REPORT_TYPE` = 2;
public const val `WerReportApplicationHang`: `WER_REPORT_TYPE` = 3;
public const val `WerReportAsync`: `WER_SUBMIT_RESULT` = 8;
public const val `WerReportCancelled`: `WER_SUBMIT_RESULT` = 6;
public const val `WerReportCritical`: `WER_REPORT_TYPE` = 1;
public const val `WerReportDebug`: `WER_SUBMIT_RESULT` = 3;
public const val `WerReportFailed`: `WER_SUBMIT_RESULT` = 4;
public const val `WerReportInvalid`: `WER_REPORT_TYPE` = 5;
public const val `WerReportKernel`: `WER_REPORT_TYPE` = 4;
public const val `WerReportNonCritical`: `WER_REPORT_TYPE` = 0;
public const val `WerReportQueued`: `WER_SUBMIT_RESULT` = 1;
public const val `WerReportUploaded`: `WER_SUBMIT_RESULT` = 2;
public const val `WerReportUploadedCab`: `WER_SUBMIT_RESULT` = 11;
public const val `WerStorageLocationNotFound`: `WER_SUBMIT_RESULT` = 12;
public const val `WerSubmitResultMax`: `WER_SUBMIT_RESULT` = 13;
public const val `WerThrottled`: `WER_SUBMIT_RESULT` = 10;
public const val `WerUIAdditionalDataDlgHeader`: `WER_REPORT_UI` = 1;
public const val `WerUICloseDlgBody`: `WER_REPORT_UI` = 9;
public const val `WerUICloseDlgButtonText`: `WER_REPORT_UI` = 10;
public const val `WerUICloseDlgHeader`: `WER_REPORT_UI` = 8;
public const val `WerUICloseText`: `WER_REPORT_UI` = 7;
public const val `WerUIConsentDlgBody`: `WER_REPORT_UI` = 4;
public const val `WerUIConsentDlgHeader`: `WER_REPORT_UI` = 3;
public const val `WerUIIconFilePath`: `WER_REPORT_UI` = 2;
public const val `WerUIMax`: `WER_REPORT_UI` = 11;
public const val `WerUIOfflineSolutionCheckText`: `WER_REPORT_UI` = 6;
public const val `WerUIOnlineSolutionCheckText`: `WER_REPORT_UI` = 5;
public const val `frrvErr`: `EFaultRepRetVal` = 3;
public const val `frrvErrAnotherInstance`: `EFaultRepRetVal` = 8;
public const val `frrvErrDoubleFault`: `EFaultRepRetVal` = 10;
public const val `frrvErrNoDW`: `EFaultRepRetVal` = 4;
public const val `frrvErrNoMemory`: `EFaultRepRetVal` = 9;
public const val `frrvErrTimeout`: `EFaultRepRetVal` = 5;
public const val `frrvLaunchDebugger`: `EFaultRepRetVal` = 6;
public const val `frrvOk`: `EFaultRepRetVal` = 0;
public const val `frrvOkHeadless`: `EFaultRepRetVal` = 7;
public const val `frrvOkManifest`: `EFaultRepRetVal` = 1;
public const val `frrvOkQueued`: `EFaultRepRetVal` = 2;
// UNSUPPORTED Rust 457:1: generic scalar type unsupported
// pub type pfn_ADDEREXCLUDEDAPPLICATIONA = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR) -> EFaultRepRetVal>;

// UNSUPPORTED Rust 458:1: generic scalar type unsupported
// pub type pfn_ADDEREXCLUDEDAPPLICATIONW = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR) -> EFaultRepRetVal>;

// UNSUPPORTED Rust 459:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
// pub type pfn_REPORTFAULT = Option<unsafe extern "system" fn(param0: *const super::Diagnostics::Debug::EXCEPTION_POINTERS, param1: u32) -> EFaultRepRetVal>;

