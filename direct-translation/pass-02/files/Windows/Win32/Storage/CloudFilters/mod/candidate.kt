// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("cldapi.dll" "system" fn CfCloseHandle(filehandle : super::super::Foundation:: HANDLE));

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_CorrelationVector")]
// windows_link::link!("cldapi.dll" "system" fn CfConnectSyncRoot(syncrootpath : windows_sys::core::PCWSTR, callbacktable : *const CF_CALLBACK_REGISTRATION, callbackcontext : *const core::ffi::c_void, connectflags : CF_CONNECT_FLAGS, connectionkey : *mut CF_CONNECTION_KEY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("cldapi.dll" "system" fn CfConvertToPlaceholder(filehandle : super::super::Foundation:: HANDLE, fileidentity : *const core::ffi::c_void, fileidentitylength : u32, convertflags : CF_CONVERT_FLAGS, convertusn : *mut i64, overlapped : *mut super::super::System::IO:: OVERLAPPED) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Storage_FileSystem")]
// windows_link::link!("cldapi.dll" "system" fn CfCreatePlaceholders(basedirectorypath : windows_sys::core::PCWSTR, placeholderarray : *mut CF_PLACEHOLDER_CREATE_INFO, placeholdercount : u32, createflags : CF_CREATE_FLAGS, entriesprocessed : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("cldapi.dll" "system" fn CfDehydratePlaceholder(filehandle : super::super::Foundation:: HANDLE, startingoffset : i64, length : i64, dehydrateflags : CF_DEHYDRATE_FLAGS, overlapped : *mut super::super::System::IO:: OVERLAPPED) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("cldapi.dll" "system" fn CfDisconnectSyncRoot(connectionkey : CF_CONNECTION_KEY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Storage_FileSystem", feature = "Win32_System_CorrelationVector"))]
// windows_link::link!("cldapi.dll" "system" fn CfExecute(opinfo : *const CF_OPERATION_INFO, opparams : *mut CF_OPERATION_PARAMETERS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_CorrelationVector")]
// windows_link::link!("cldapi.dll" "system" fn CfGetCorrelationVector(filehandle : super::super::Foundation:: HANDLE, correlationvector : *mut super::super::System::CorrelationVector:: CORRELATION_VECTOR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("cldapi.dll" "system" fn CfGetPlaceholderInfo(filehandle : super::super::Foundation:: HANDLE, infoclass : CF_PLACEHOLDER_INFO_CLASS, infobuffer : *mut core::ffi::c_void, infobufferlength : u32, returnedlength : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("cldapi.dll" "system" fn CfGetPlaceholderRangeInfo(filehandle : super::super::Foundation:: HANDLE, infoclass : CF_PLACEHOLDER_RANGE_INFO_CLASS, startingoffset : i64, length : i64, infobuffer : *mut core::ffi::c_void, infobufferlength : u32, returnedlength : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("cldapi.dll" "system" fn CfGetPlaceholderRangeInfoForHydration(connectionkey : CF_CONNECTION_KEY, transferkey : i64, fileid : i64, infoclass : CF_PLACEHOLDER_RANGE_INFO_CLASS, startingoffset : i64, rangelength : i64, infobuffer : *mut core::ffi::c_void, infobuffersize : u32, infobufferwritten : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("cldapi.dll" "system" fn CfGetPlaceholderStateFromAttributeTag(fileattributes : u32, reparsetag : u32) -> CF_PLACEHOLDER_STATE);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Storage_FileSystem")]
// windows_link::link!("cldapi.dll" "system" fn CfGetPlaceholderStateFromFileInfo(infobuffer : *const core::ffi::c_void, infoclass : super::FileSystem:: FILE_INFO_BY_HANDLE_CLASS) -> CF_PLACEHOLDER_STATE);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Storage_FileSystem")]
// windows_link::link!("cldapi.dll" "system" fn CfGetPlaceholderStateFromFindData(finddata : *const super::FileSystem:: WIN32_FIND_DATAA) -> CF_PLACEHOLDER_STATE);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("cldapi.dll" "system" fn CfGetPlatformInfo(platformversion : *mut CF_PLATFORM_INFO) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("cldapi.dll" "system" fn CfGetSyncRootInfoByHandle(filehandle : super::super::Foundation:: HANDLE, infoclass : CF_SYNC_ROOT_INFO_CLASS, infobuffer : *mut core::ffi::c_void, infobufferlength : u32, returnedlength : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("cldapi.dll" "system" fn CfGetSyncRootInfoByPath(filepath : windows_sys::core::PCWSTR, infoclass : CF_SYNC_ROOT_INFO_CLASS, infobuffer : *mut core::ffi::c_void, infobufferlength : u32, returnedlength : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("cldapi.dll" "system" fn CfGetTransferKey(filehandle : super::super::Foundation:: HANDLE, transferkey : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("cldapi.dll" "system" fn CfGetWin32HandleFromProtectedHandle(protectedhandle : super::super::Foundation:: HANDLE) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("cldapi.dll" "system" fn CfHydratePlaceholder(filehandle : super::super::Foundation:: HANDLE, startingoffset : i64, length : i64, hydrateflags : CF_HYDRATE_FLAGS, overlapped : *mut super::super::System::IO:: OVERLAPPED) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("cldapi.dll" "system" fn CfOpenFileWithOplock(filepath : windows_sys::core::PCWSTR, flags : CF_OPEN_FILE_FLAGS, protectedhandle : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("cldapi.dll" "system" fn CfQuerySyncProviderStatus(connectionkey : CF_CONNECTION_KEY, providerstatus : *mut CF_SYNC_PROVIDER_STATUS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("cldapi.dll" "system" fn CfReferenceProtectedHandle(protectedhandle : super::super::Foundation:: HANDLE) -> bool);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("cldapi.dll" "system" fn CfRegisterSyncRoot(syncrootpath : windows_sys::core::PCWSTR, registration : *const CF_SYNC_REGISTRATION, policies : *const CF_SYNC_POLICIES, registerflags : CF_REGISTER_FLAGS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("cldapi.dll" "system" fn CfReleaseProtectedHandle(protectedhandle : super::super::Foundation:: HANDLE));

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("cldapi.dll" "system" fn CfReleaseTransferKey(filehandle : super::super::Foundation:: HANDLE, transferkey : *const i64));

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("cldapi.dll" "system" fn CfReportProviderProgress(connectionkey : CF_CONNECTION_KEY, transferkey : i64, providerprogresstotal : i64, providerprogresscompleted : i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("cldapi.dll" "system" fn CfReportProviderProgress2(connectionkey : CF_CONNECTION_KEY, transferkey : i64, requestkey : i64, providerprogresstotal : i64, providerprogresscompleted : i64, targetsessionid : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("cldapi.dll" "system" fn CfReportSyncStatus(syncrootpath : windows_sys::core::PCWSTR, syncstatus : *const CF_SYNC_STATUS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("cldapi.dll" "system" fn CfRevertPlaceholder(filehandle : super::super::Foundation:: HANDLE, revertflags : CF_REVERT_FLAGS, overlapped : *mut super::super::System::IO:: OVERLAPPED) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_CorrelationVector")]
// windows_link::link!("cldapi.dll" "system" fn CfSetCorrelationVector(filehandle : super::super::Foundation:: HANDLE, correlationvector : *const super::super::System::CorrelationVector:: CORRELATION_VECTOR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("cldapi.dll" "system" fn CfSetInSyncState(filehandle : super::super::Foundation:: HANDLE, insyncstate : CF_IN_SYNC_STATE, insyncflags : CF_SET_IN_SYNC_FLAGS, insyncusn : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("cldapi.dll" "system" fn CfSetPinState(filehandle : super::super::Foundation:: HANDLE, pinstate : CF_PIN_STATE, pinflags : CF_SET_PIN_FLAGS, overlapped : *mut super::super::System::IO:: OVERLAPPED) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("cldapi.dll" "system" fn CfUnregisterSyncRoot(syncrootpath : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Storage_FileSystem", feature = "Win32_System_IO"))]
// windows_link::link!("cldapi.dll" "system" fn CfUpdatePlaceholder(filehandle : super::super::Foundation:: HANDLE, fsmetadata : *const CF_FS_METADATA, fileidentity : *const core::ffi::c_void, fileidentitylength : u32, dehydraterangearray : *const CF_FILE_RANGE, dehydraterangecount : u32, updateflags : CF_UPDATE_FLAGS, updateusn : *mut i64, overlapped : *mut super::super::System::IO:: OVERLAPPED) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("cldapi.dll" "system" fn CfUpdateSyncProviderStatus(connectionkey : CF_CONNECTION_KEY, providerstatus : CF_SYNC_PROVIDER_STATUS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 50:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_CorrelationVector")]
// pub type CF_CALLBACK = Option<unsafe extern "system" fn(callbackinfo: *const CF_CALLBACK_INFO, callbackparameters: *const CF_CALLBACK_PARAMETERS)>;

public typealias `CF_CALLBACK_CANCEL_FLAGS` = Int;
public const val `CF_CALLBACK_CANCEL_FLAG_IO_ABORTED`: `CF_CALLBACK_CANCEL_FLAGS` = 2;
public const val `CF_CALLBACK_CANCEL_FLAG_IO_TIMEOUT`: `CF_CALLBACK_CANCEL_FLAGS` = 1;
public const val `CF_CALLBACK_CANCEL_FLAG_NONE`: `CF_CALLBACK_CANCEL_FLAGS` = 0;
public typealias `CF_CALLBACK_CLOSE_COMPLETION_FLAGS` = Int;
public const val `CF_CALLBACK_CLOSE_COMPLETION_FLAG_DELETED`: `CF_CALLBACK_CLOSE_COMPLETION_FLAGS` = 1;
public const val `CF_CALLBACK_CLOSE_COMPLETION_FLAG_NONE`: `CF_CALLBACK_CLOSE_COMPLETION_FLAGS` = 0;
public typealias `CF_CALLBACK_DEHYDRATE_COMPLETION_FLAGS` = Int;
public const val `CF_CALLBACK_DEHYDRATE_COMPLETION_FLAG_BACKGROUND`: `CF_CALLBACK_DEHYDRATE_COMPLETION_FLAGS` = 1;
public const val `CF_CALLBACK_DEHYDRATE_COMPLETION_FLAG_DEHYDRATED`: `CF_CALLBACK_DEHYDRATE_COMPLETION_FLAGS` = 2;
public const val `CF_CALLBACK_DEHYDRATE_COMPLETION_FLAG_NONE`: `CF_CALLBACK_DEHYDRATE_COMPLETION_FLAGS` = 0;
public typealias `CF_CALLBACK_DEHYDRATE_FLAGS` = Int;
public const val `CF_CALLBACK_DEHYDRATE_FLAG_BACKGROUND`: `CF_CALLBACK_DEHYDRATE_FLAGS` = 1;
public const val `CF_CALLBACK_DEHYDRATE_FLAG_NONE`: `CF_CALLBACK_DEHYDRATE_FLAGS` = 0;
public typealias `CF_CALLBACK_DEHYDRATION_REASON` = Int;
public const val `CF_CALLBACK_DEHYDRATION_REASON_NONE`: `CF_CALLBACK_DEHYDRATION_REASON` = 0;
public const val `CF_CALLBACK_DEHYDRATION_REASON_SYSTEM_INACTIVITY`: `CF_CALLBACK_DEHYDRATION_REASON` = 3;
public const val `CF_CALLBACK_DEHYDRATION_REASON_SYSTEM_LOW_SPACE`: `CF_CALLBACK_DEHYDRATION_REASON` = 2;
public const val `CF_CALLBACK_DEHYDRATION_REASON_SYSTEM_OS_UPGRADE`: `CF_CALLBACK_DEHYDRATION_REASON` = 4;
public const val `CF_CALLBACK_DEHYDRATION_REASON_USER_MANUAL`: `CF_CALLBACK_DEHYDRATION_REASON` = 1;
public typealias `CF_CALLBACK_DELETE_COMPLETION_FLAGS` = Int;
public const val `CF_CALLBACK_DELETE_COMPLETION_FLAG_NONE`: `CF_CALLBACK_DELETE_COMPLETION_FLAGS` = 0;
public typealias `CF_CALLBACK_DELETE_FLAGS` = Int;
public const val `CF_CALLBACK_DELETE_FLAG_IS_DIRECTORY`: `CF_CALLBACK_DELETE_FLAGS` = 1;
public const val `CF_CALLBACK_DELETE_FLAG_IS_UNDELETE`: `CF_CALLBACK_DELETE_FLAGS` = 2;
public const val `CF_CALLBACK_DELETE_FLAG_NONE`: `CF_CALLBACK_DELETE_FLAGS` = 0;
public typealias `CF_CALLBACK_FETCH_DATA_FLAGS` = Int;
public const val `CF_CALLBACK_FETCH_DATA_FLAG_EXPLICIT_HYDRATION`: `CF_CALLBACK_FETCH_DATA_FLAGS` = 2;
public const val `CF_CALLBACK_FETCH_DATA_FLAG_NONE`: `CF_CALLBACK_FETCH_DATA_FLAGS` = 0;
public const val `CF_CALLBACK_FETCH_DATA_FLAG_RECOVERY`: `CF_CALLBACK_FETCH_DATA_FLAGS` = 1;
public typealias `CF_CALLBACK_FETCH_PLACEHOLDERS_FLAGS` = Int;
public const val `CF_CALLBACK_FETCH_PLACEHOLDERS_FLAG_NONE`: `CF_CALLBACK_FETCH_PLACEHOLDERS_FLAGS` = 0;
// UNSUPPORTED Rust 84:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_CorrelationVector")]
// #[derive(Clone, Copy)]
// pub struct CF_CALLBACK_INFO {
//     pub StructSize: u32,
//     pub ConnectionKey: CF_CONNECTION_KEY,
//     pub CallbackContext: *mut core::ffi::c_void,
//     pub VolumeGuidName: windows_sys::core::PCWSTR,
//     pub VolumeDosName: windows_sys::core::PCWSTR,
//     pub VolumeSerialNumber: u32,
//     pub SyncRootFileId: i64,
//     pub SyncRootIdentity: *const core::ffi::c_void,
//     pub SyncRootIdentityLength: u32,
//     pub FileId: i64,
//     pub FileSize: i64,
//     pub FileIdentity: *const core::ffi::c_void,
//     pub FileIdentityLength: u32,
//     pub NormalizedPath: windows_sys::core::PCWSTR,
//     pub TransferKey: i64,
//     pub PriorityHint: u8,
//     pub CorrelationVector: *mut super::super::System::CorrelationVector::CORRELATION_VECTOR,
//     pub ProcessInfo: *mut CF_PROCESS_INFO,
//     pub RequestKey: i64,
// }

// UNSUPPORTED Rust 108:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_CorrelationVector")]
// impl Default for CF_CALLBACK_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CF_CALLBACK_OPEN_COMPLETION_FLAGS` = Int;
public const val `CF_CALLBACK_OPEN_COMPLETION_FLAG_NONE`: `CF_CALLBACK_OPEN_COMPLETION_FLAGS` = 0;
public const val `CF_CALLBACK_OPEN_COMPLETION_FLAG_PLACEHOLDER_UNKNOWN`: `CF_CALLBACK_OPEN_COMPLETION_FLAGS` = 1;
public const val `CF_CALLBACK_OPEN_COMPLETION_FLAG_PLACEHOLDER_UNSUPPORTED`: `CF_CALLBACK_OPEN_COMPLETION_FLAGS` = 2;
// UNSUPPORTED Rust 118:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CF_CALLBACK_PARAMETERS {
//     pub ParamSize: u32,
//     pub Anonymous: CF_CALLBACK_PARAMETERS_0,
// }

// UNSUPPORTED Rust 124:1: declaration Impl has no candidate rule
// impl Default for CF_CALLBACK_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 129:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CF_CALLBACK_PARAMETERS_0 {
//     pub Cancel: CF_CALLBACK_PARAMETERS_0_0,
//     pub FetchData: CF_CALLBACK_PARAMETERS_0_1,
//     pub ValidateData: CF_CALLBACK_PARAMETERS_0_2,
//     pub FetchPlaceholders: CF_CALLBACK_PARAMETERS_0_3,
//     pub OpenCompletion: CF_CALLBACK_PARAMETERS_0_4,
//     pub CloseCompletion: CF_CALLBACK_PARAMETERS_0_5,
//     pub Dehydrate: CF_CALLBACK_PARAMETERS_0_6,
//     pub DehydrateCompletion: CF_CALLBACK_PARAMETERS_0_7,
//     pub Delete: CF_CALLBACK_PARAMETERS_0_8,
//     pub DeleteCompletion: CF_CALLBACK_PARAMETERS_0_9,
//     pub Rename: CF_CALLBACK_PARAMETERS_0_10,
//     pub RenameCompletion: CF_CALLBACK_PARAMETERS_0_11,
// }

// UNSUPPORTED Rust 145:1: declaration Impl has no candidate rule
// impl Default for CF_CALLBACK_PARAMETERS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 150:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CF_CALLBACK_PARAMETERS_0_0 {
//     pub Flags: CF_CALLBACK_CANCEL_FLAGS,
//     pub Anonymous: CF_CALLBACK_PARAMETERS_0_0_0,
// }

// UNSUPPORTED Rust 156:1: declaration Impl has no candidate rule
// impl Default for CF_CALLBACK_PARAMETERS_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 161:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CF_CALLBACK_PARAMETERS_0_0_0 {
//     pub FetchData: CF_CALLBACK_PARAMETERS_0_0_0_0,
// }

// UNSUPPORTED Rust 166:1: declaration Impl has no candidate rule
// impl Default for CF_CALLBACK_PARAMETERS_0_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 171:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CF_CALLBACK_PARAMETERS_0_0_0_0 {
//     pub FileOffset: i64,
//     pub Length: i64,
// }

// UNSUPPORTED Rust 177:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CF_CALLBACK_PARAMETERS_0_5 {
//     pub Flags: CF_CALLBACK_CLOSE_COMPLETION_FLAGS,
// }

// UNSUPPORTED Rust 182:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CF_CALLBACK_PARAMETERS_0_7 {
//     pub Flags: CF_CALLBACK_DEHYDRATE_COMPLETION_FLAGS,
//     pub Reason: CF_CALLBACK_DEHYDRATION_REASON,
// }

// UNSUPPORTED Rust 188:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CF_CALLBACK_PARAMETERS_0_6 {
//     pub Flags: CF_CALLBACK_DEHYDRATE_FLAGS,
//     pub Reason: CF_CALLBACK_DEHYDRATION_REASON,
// }

// UNSUPPORTED Rust 194:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CF_CALLBACK_PARAMETERS_0_9 {
//     pub Flags: CF_CALLBACK_DELETE_COMPLETION_FLAGS,
// }

// UNSUPPORTED Rust 199:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CF_CALLBACK_PARAMETERS_0_8 {
//     pub Flags: CF_CALLBACK_DELETE_FLAGS,
// }

// UNSUPPORTED Rust 204:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CF_CALLBACK_PARAMETERS_0_1 {
//     pub Flags: CF_CALLBACK_FETCH_DATA_FLAGS,
//     pub RequiredFileOffset: i64,
//     pub RequiredLength: i64,
//     pub OptionalFileOffset: i64,
//     pub OptionalLength: i64,
//     pub LastDehydrationTime: i64,
//     pub LastDehydrationReason: CF_CALLBACK_DEHYDRATION_REASON,
// }

// UNSUPPORTED Rust 215:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CF_CALLBACK_PARAMETERS_0_3 {
//     pub Flags: CF_CALLBACK_FETCH_PLACEHOLDERS_FLAGS,
//     pub Pattern: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 221:1: declaration Impl has no candidate rule
// impl Default for CF_CALLBACK_PARAMETERS_0_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 226:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CF_CALLBACK_PARAMETERS_0_4 {
//     pub Flags: CF_CALLBACK_OPEN_COMPLETION_FLAGS,
// }

// UNSUPPORTED Rust 231:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CF_CALLBACK_PARAMETERS_0_11 {
//     pub Flags: CF_CALLBACK_RENAME_COMPLETION_FLAGS,
//     pub SourcePath: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 237:1: declaration Impl has no candidate rule
// impl Default for CF_CALLBACK_PARAMETERS_0_11 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 242:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CF_CALLBACK_PARAMETERS_0_10 {
//     pub Flags: CF_CALLBACK_RENAME_FLAGS,
//     pub TargetPath: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 248:1: declaration Impl has no candidate rule
// impl Default for CF_CALLBACK_PARAMETERS_0_10 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 253:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CF_CALLBACK_PARAMETERS_0_2 {
//     pub Flags: CF_CALLBACK_VALIDATE_DATA_FLAGS,
//     pub RequiredFileOffset: i64,
//     pub RequiredLength: i64,
// }

// UNSUPPORTED Rust 260:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_CorrelationVector")]
// #[derive(Clone, Copy, Default)]
// pub struct CF_CALLBACK_REGISTRATION {
//     pub Type: CF_CALLBACK_TYPE,
//     pub Callback: CF_CALLBACK,
// }

public typealias `CF_CALLBACK_RENAME_COMPLETION_FLAGS` = Int;
public const val `CF_CALLBACK_RENAME_COMPLETION_FLAG_NONE`: `CF_CALLBACK_RENAME_COMPLETION_FLAGS` = 0;
public typealias `CF_CALLBACK_RENAME_FLAGS` = Int;
public const val `CF_CALLBACK_RENAME_FLAG_IS_DIRECTORY`: `CF_CALLBACK_RENAME_FLAGS` = 1;
public const val `CF_CALLBACK_RENAME_FLAG_NONE`: `CF_CALLBACK_RENAME_FLAGS` = 0;
public const val `CF_CALLBACK_RENAME_FLAG_SOURCE_IN_SCOPE`: `CF_CALLBACK_RENAME_FLAGS` = 2;
public const val `CF_CALLBACK_RENAME_FLAG_TARGET_IN_SCOPE`: `CF_CALLBACK_RENAME_FLAGS` = 4;
public typealias `CF_CALLBACK_TYPE` = Int;
public const val `CF_CALLBACK_TYPE_CANCEL_FETCH_DATA`: `CF_CALLBACK_TYPE` = 2;
public const val `CF_CALLBACK_TYPE_CANCEL_FETCH_PLACEHOLDERS`: `CF_CALLBACK_TYPE` = 4;
public const val `CF_CALLBACK_TYPE_FETCH_DATA`: `CF_CALLBACK_TYPE` = 0;
public const val `CF_CALLBACK_TYPE_FETCH_PLACEHOLDERS`: `CF_CALLBACK_TYPE` = 3;
public const val `CF_CALLBACK_TYPE_NONE`: `CF_CALLBACK_TYPE` = -1;
public const val `CF_CALLBACK_TYPE_NOTIFY_DEHYDRATE`: `CF_CALLBACK_TYPE` = 7;
public const val `CF_CALLBACK_TYPE_NOTIFY_DEHYDRATE_COMPLETION`: `CF_CALLBACK_TYPE` = 8;
public const val `CF_CALLBACK_TYPE_NOTIFY_DELETE`: `CF_CALLBACK_TYPE` = 9;
public const val `CF_CALLBACK_TYPE_NOTIFY_DELETE_COMPLETION`: `CF_CALLBACK_TYPE` = 10;
public const val `CF_CALLBACK_TYPE_NOTIFY_FILE_CLOSE_COMPLETION`: `CF_CALLBACK_TYPE` = 6;
public const val `CF_CALLBACK_TYPE_NOTIFY_FILE_OPEN_COMPLETION`: `CF_CALLBACK_TYPE` = 5;
public const val `CF_CALLBACK_TYPE_NOTIFY_RENAME`: `CF_CALLBACK_TYPE` = 11;
public const val `CF_CALLBACK_TYPE_NOTIFY_RENAME_COMPLETION`: `CF_CALLBACK_TYPE` = 12;
public const val `CF_CALLBACK_TYPE_VALIDATE_DATA`: `CF_CALLBACK_TYPE` = 1;
public typealias `CF_CALLBACK_VALIDATE_DATA_FLAGS` = Int;
public const val `CF_CALLBACK_VALIDATE_DATA_FLAG_EXPLICIT_HYDRATION`: `CF_CALLBACK_VALIDATE_DATA_FLAGS` = 2;
public const val `CF_CALLBACK_VALIDATE_DATA_FLAG_NONE`: `CF_CALLBACK_VALIDATE_DATA_FLAGS` = 0;
public typealias `CF_CONNECTION_KEY` = Long;
public typealias `CF_CONNECT_FLAGS` = Int;
public const val `CF_CONNECT_FLAG_BLOCK_SELF_IMPLICIT_HYDRATION`: `CF_CONNECT_FLAGS` = 8;
public const val `CF_CONNECT_FLAG_NONE`: `CF_CONNECT_FLAGS` = 0;
public const val `CF_CONNECT_FLAG_REQUIRE_FULL_FILE_PATH`: `CF_CONNECT_FLAGS` = 4;
public const val `CF_CONNECT_FLAG_REQUIRE_PROCESS_INFO`: `CF_CONNECT_FLAGS` = 2;
public typealias `CF_CONVERT_FLAGS` = Int;
public const val `CF_CONVERT_FLAG_ALWAYS_FULL`: `CF_CONVERT_FLAGS` = 8;
public const val `CF_CONVERT_FLAG_DEHYDRATE`: `CF_CONVERT_FLAGS` = 2;
public const val `CF_CONVERT_FLAG_ENABLE_ON_DEMAND_POPULATION`: `CF_CONVERT_FLAGS` = 4;
public const val `CF_CONVERT_FLAG_FORCE_CONVERT_TO_CLOUD_FILE`: `CF_CONVERT_FLAGS` = 16;
public const val `CF_CONVERT_FLAG_MARK_IN_SYNC`: `CF_CONVERT_FLAGS` = 1;
public const val `CF_CONVERT_FLAG_NONE`: `CF_CONVERT_FLAGS` = 0;
public typealias `CF_CREATE_FLAGS` = Int;
public const val `CF_CREATE_FLAG_NONE`: `CF_CREATE_FLAGS` = 0;
public const val `CF_CREATE_FLAG_STOP_ON_ERROR`: `CF_CREATE_FLAGS` = 1;
public typealias `CF_DEHYDRATE_FLAGS` = Int;
public const val `CF_DEHYDRATE_FLAG_BACKGROUND`: `CF_DEHYDRATE_FLAGS` = 1;
public const val `CF_DEHYDRATE_FLAG_NONE`: `CF_DEHYDRATE_FLAGS` = 0;
// UNSUPPORTED Rust 311:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CF_FILE_RANGE {
//     pub StartingOffset: i64,
//     pub Length: i64,
// }

// UNSUPPORTED Rust 317:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy, Default)]
// pub struct CF_FS_METADATA {
//     pub BasicInfo: super::FileSystem::FILE_BASIC_INFO,
//     pub FileSize: i64,
// }

public typealias `CF_HARDLINK_POLICY` = Int;
public const val `CF_HARDLINK_POLICY_ALLOWED`: `CF_HARDLINK_POLICY` = 1;
public const val `CF_HARDLINK_POLICY_NONE`: `CF_HARDLINK_POLICY` = 0;
public typealias `CF_HYDRATE_FLAGS` = Int;
public const val `CF_HYDRATE_FLAG_NONE`: `CF_HYDRATE_FLAGS` = 0;
// UNSUPPORTED Rust 329:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CF_HYDRATION_POLICY {
//     pub Primary: CF_HYDRATION_POLICY_PRIMARY,
//     pub Modifier: CF_HYDRATION_POLICY_MODIFIER,
// }

public const val `CF_HYDRATION_POLICY_ALWAYS_FULL`: `CF_HYDRATION_POLICY_PRIMARY` = 3u;
public const val `CF_HYDRATION_POLICY_FULL`: `CF_HYDRATION_POLICY_PRIMARY` = 2u;
public typealias `CF_HYDRATION_POLICY_MODIFIER` = UShort;
public const val `CF_HYDRATION_POLICY_MODIFIER_ALLOW_FULL_RESTART_HYDRATION`: `CF_HYDRATION_POLICY_MODIFIER` = 8u;
public const val `CF_HYDRATION_POLICY_MODIFIER_AUTO_DEHYDRATION_ALLOWED`: `CF_HYDRATION_POLICY_MODIFIER` = 4u;
public const val `CF_HYDRATION_POLICY_MODIFIER_NONE`: `CF_HYDRATION_POLICY_MODIFIER` = 0u;
public const val `CF_HYDRATION_POLICY_MODIFIER_STREAMING_ALLOWED`: `CF_HYDRATION_POLICY_MODIFIER` = 2u;
public const val `CF_HYDRATION_POLICY_MODIFIER_VALIDATION_REQUIRED`: `CF_HYDRATION_POLICY_MODIFIER` = 1u;
public const val `CF_HYDRATION_POLICY_PARTIAL`: `CF_HYDRATION_POLICY_PRIMARY` = 0u;
public typealias `CF_HYDRATION_POLICY_PRIMARY` = UShort;
public const val `CF_HYDRATION_POLICY_PROGRESSIVE`: `CF_HYDRATION_POLICY_PRIMARY` = 1u;
public typealias `CF_INSYNC_POLICY` = UInt;
public const val `CF_INSYNC_POLICY_NONE`: `CF_INSYNC_POLICY` = 0u;
public const val `CF_INSYNC_POLICY_PRESERVE_INSYNC_FOR_SYNC_ENGINE`: `CF_INSYNC_POLICY` = 2147483648u;
public const val `CF_INSYNC_POLICY_TRACK_ALL`: `CF_INSYNC_POLICY` = 16777215u;
public const val `CF_INSYNC_POLICY_TRACK_DIRECTORY_ALL`: `CF_INSYNC_POLICY` = 11184880u;
public const val `CF_INSYNC_POLICY_TRACK_DIRECTORY_CREATION_TIME`: `CF_INSYNC_POLICY` = 16u;
public const val `CF_INSYNC_POLICY_TRACK_DIRECTORY_HIDDEN_ATTRIBUTE`: `CF_INSYNC_POLICY` = 64u;
public const val `CF_INSYNC_POLICY_TRACK_DIRECTORY_LAST_WRITE_TIME`: `CF_INSYNC_POLICY` = 512u;
public const val `CF_INSYNC_POLICY_TRACK_DIRECTORY_READONLY_ATTRIBUTE`: `CF_INSYNC_POLICY` = 32u;
public const val `CF_INSYNC_POLICY_TRACK_DIRECTORY_SYSTEM_ATTRIBUTE`: `CF_INSYNC_POLICY` = 128u;
public const val `CF_INSYNC_POLICY_TRACK_FILE_ALL`: `CF_INSYNC_POLICY` = 5592335u;
public const val `CF_INSYNC_POLICY_TRACK_FILE_CREATION_TIME`: `CF_INSYNC_POLICY` = 1u;
public const val `CF_INSYNC_POLICY_TRACK_FILE_HIDDEN_ATTRIBUTE`: `CF_INSYNC_POLICY` = 4u;
public const val `CF_INSYNC_POLICY_TRACK_FILE_LAST_WRITE_TIME`: `CF_INSYNC_POLICY` = 256u;
public const val `CF_INSYNC_POLICY_TRACK_FILE_READONLY_ATTRIBUTE`: `CF_INSYNC_POLICY` = 2u;
public const val `CF_INSYNC_POLICY_TRACK_FILE_SYSTEM_ATTRIBUTE`: `CF_INSYNC_POLICY` = 8u;
public typealias `CF_IN_SYNC_STATE` = Int;
public const val `CF_IN_SYNC_STATE_IN_SYNC`: `CF_IN_SYNC_STATE` = 1;
public const val `CF_IN_SYNC_STATE_NOT_IN_SYNC`: `CF_IN_SYNC_STATE` = 0;
public const val `CF_MAX_PRIORITY_HINT`: UInt = 15u;
public const val `CF_MAX_PROVIDER_NAME_LENGTH`: UInt = 255u;
public const val `CF_MAX_PROVIDER_VERSION_LENGTH`: UInt = 255u;
public typealias `CF_OPEN_FILE_FLAGS` = Int;
public const val `CF_OPEN_FILE_FLAG_DELETE_ACCESS`: `CF_OPEN_FILE_FLAGS` = 4;
public const val `CF_OPEN_FILE_FLAG_EXCLUSIVE`: `CF_OPEN_FILE_FLAGS` = 1;
public const val `CF_OPEN_FILE_FLAG_FOREGROUND`: `CF_OPEN_FILE_FLAGS` = 8;
public const val `CF_OPEN_FILE_FLAG_NONE`: `CF_OPEN_FILE_FLAGS` = 0;
public const val `CF_OPEN_FILE_FLAG_WRITE_ACCESS`: `CF_OPEN_FILE_FLAGS` = 2;
public typealias `CF_OPERATION_ACK_DATA_FLAGS` = Int;
public const val `CF_OPERATION_ACK_DATA_FLAG_NONE`: `CF_OPERATION_ACK_DATA_FLAGS` = 0;
public typealias `CF_OPERATION_ACK_DEHYDRATE_FLAGS` = Int;
public const val `CF_OPERATION_ACK_DEHYDRATE_FLAG_NONE`: `CF_OPERATION_ACK_DEHYDRATE_FLAGS` = 0;
public typealias `CF_OPERATION_ACK_DELETE_FLAGS` = Int;
public const val `CF_OPERATION_ACK_DELETE_FLAG_NONE`: `CF_OPERATION_ACK_DELETE_FLAGS` = 0;
public typealias `CF_OPERATION_ACK_RENAME_FLAGS` = Int;
public const val `CF_OPERATION_ACK_RENAME_FLAG_NONE`: `CF_OPERATION_ACK_RENAME_FLAGS` = 0;
// UNSUPPORTED Rust 382:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_CorrelationVector")]
// #[derive(Clone, Copy)]
// pub struct CF_OPERATION_INFO {
//     pub StructSize: u32,
//     pub Type: CF_OPERATION_TYPE,
//     pub ConnectionKey: CF_CONNECTION_KEY,
//     pub TransferKey: i64,
//     pub CorrelationVector: *const super::super::System::CorrelationVector::CORRELATION_VECTOR,
//     pub SyncStatus: *const CF_SYNC_STATUS,
//     pub RequestKey: i64,
// }

// UNSUPPORTED Rust 394:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_CorrelationVector")]
// impl Default for CF_OPERATION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 400:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy)]
// pub struct CF_OPERATION_PARAMETERS {
//     pub ParamSize: u32,
//     pub Anonymous: CF_OPERATION_PARAMETERS_0,
// }

// UNSUPPORTED Rust 407:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for CF_OPERATION_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 413:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy)]
// pub union CF_OPERATION_PARAMETERS_0 {
//     pub TransferData: CF_OPERATION_PARAMETERS_0_0,
//     pub RetrieveData: CF_OPERATION_PARAMETERS_0_1,
//     pub AckData: CF_OPERATION_PARAMETERS_0_2,
//     pub RestartHydration: CF_OPERATION_PARAMETERS_0_3,
//     pub TransferPlaceholders: CF_OPERATION_PARAMETERS_0_4,
//     pub AckDehydrate: CF_OPERATION_PARAMETERS_0_5,
//     pub AckRename: CF_OPERATION_PARAMETERS_0_6,
//     pub AckDelete: CF_OPERATION_PARAMETERS_0_7,
// }

// UNSUPPORTED Rust 426:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for CF_OPERATION_PARAMETERS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 432:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy, Default)]
// pub struct CF_OPERATION_PARAMETERS_0_2 {
//     pub Flags: CF_OPERATION_ACK_DATA_FLAGS,
//     pub CompletionStatus: super::super::Foundation::NTSTATUS,
//     pub Offset: i64,
//     pub Length: i64,
// }

// UNSUPPORTED Rust 441:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy)]
// pub struct CF_OPERATION_PARAMETERS_0_5 {
//     pub Flags: CF_OPERATION_ACK_DEHYDRATE_FLAGS,
//     pub CompletionStatus: super::super::Foundation::NTSTATUS,
//     pub FileIdentity: *const core::ffi::c_void,
//     pub FileIdentityLength: u32,
// }

// UNSUPPORTED Rust 450:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for CF_OPERATION_PARAMETERS_0_5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 456:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy, Default)]
// pub struct CF_OPERATION_PARAMETERS_0_7 {
//     pub Flags: CF_OPERATION_ACK_DELETE_FLAGS,
//     pub CompletionStatus: super::super::Foundation::NTSTATUS,
// }

// UNSUPPORTED Rust 463:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy, Default)]
// pub struct CF_OPERATION_PARAMETERS_0_6 {
//     pub Flags: CF_OPERATION_ACK_RENAME_FLAGS,
//     pub CompletionStatus: super::super::Foundation::NTSTATUS,
// }

// UNSUPPORTED Rust 470:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy)]
// pub struct CF_OPERATION_PARAMETERS_0_3 {
//     pub Flags: CF_OPERATION_RESTART_HYDRATION_FLAGS,
//     pub FsMetadata: *const CF_FS_METADATA,
//     pub FileIdentity: *const core::ffi::c_void,
//     pub FileIdentityLength: u32,
// }

// UNSUPPORTED Rust 479:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for CF_OPERATION_PARAMETERS_0_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 485:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy)]
// pub struct CF_OPERATION_PARAMETERS_0_1 {
//     pub Flags: CF_OPERATION_RETRIEVE_DATA_FLAGS,
//     pub Buffer: *mut core::ffi::c_void,
//     pub Offset: i64,
//     pub Length: i64,
//     pub ReturnedLength: i64,
// }

// UNSUPPORTED Rust 495:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for CF_OPERATION_PARAMETERS_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 501:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy)]
// pub struct CF_OPERATION_PARAMETERS_0_0 {
//     pub Flags: CF_OPERATION_TRANSFER_DATA_FLAGS,
//     pub CompletionStatus: super::super::Foundation::NTSTATUS,
//     pub Buffer: *const core::ffi::c_void,
//     pub Offset: i64,
//     pub Length: i64,
// }

// UNSUPPORTED Rust 511:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for CF_OPERATION_PARAMETERS_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 517:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy)]
// pub struct CF_OPERATION_PARAMETERS_0_4 {
//     pub Flags: CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAGS,
//     pub CompletionStatus: super::super::Foundation::NTSTATUS,
//     pub PlaceholderTotalCount: i64,
//     pub PlaceholderArray: *mut CF_PLACEHOLDER_CREATE_INFO,
//     pub PlaceholderCount: u32,
//     pub EntriesProcessed: u32,
// }

// UNSUPPORTED Rust 528:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for CF_OPERATION_PARAMETERS_0_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CF_OPERATION_RESTART_HYDRATION_FLAGS` = Int;
public const val `CF_OPERATION_RESTART_HYDRATION_FLAG_MARK_IN_SYNC`: `CF_OPERATION_RESTART_HYDRATION_FLAGS` = 1;
public const val `CF_OPERATION_RESTART_HYDRATION_FLAG_NONE`: `CF_OPERATION_RESTART_HYDRATION_FLAGS` = 0;
public typealias `CF_OPERATION_RETRIEVE_DATA_FLAGS` = Int;
public const val `CF_OPERATION_RETRIEVE_DATA_FLAG_NONE`: `CF_OPERATION_RETRIEVE_DATA_FLAGS` = 0;
public typealias `CF_OPERATION_TRANSFER_DATA_FLAGS` = Int;
public const val `CF_OPERATION_TRANSFER_DATA_FLAG_NONE`: `CF_OPERATION_TRANSFER_DATA_FLAGS` = 0;
public typealias `CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAGS` = Int;
public const val `CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAG_DISABLE_ON_DEMAND_POPULATION`: `CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAGS` = 2;
public const val `CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAG_NONE`: `CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAGS` = 0;
public const val `CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAG_STOP_ON_ERROR`: `CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAGS` = 1;
public typealias `CF_OPERATION_TYPE` = Int;
public const val `CF_OPERATION_TYPE_ACK_DATA`: `CF_OPERATION_TYPE` = 2;
public const val `CF_OPERATION_TYPE_ACK_DEHYDRATE`: `CF_OPERATION_TYPE` = 5;
public const val `CF_OPERATION_TYPE_ACK_DELETE`: `CF_OPERATION_TYPE` = 6;
public const val `CF_OPERATION_TYPE_ACK_RENAME`: `CF_OPERATION_TYPE` = 7;
public const val `CF_OPERATION_TYPE_RESTART_HYDRATION`: `CF_OPERATION_TYPE` = 3;
public const val `CF_OPERATION_TYPE_RETRIEVE_DATA`: `CF_OPERATION_TYPE` = 1;
public const val `CF_OPERATION_TYPE_TRANSFER_DATA`: `CF_OPERATION_TYPE` = 0;
public const val `CF_OPERATION_TYPE_TRANSFER_PLACEHOLDERS`: `CF_OPERATION_TYPE` = 4;
public typealias `CF_PIN_STATE` = Int;
public const val `CF_PIN_STATE_EXCLUDED`: `CF_PIN_STATE` = 3;
public const val `CF_PIN_STATE_INHERIT`: `CF_PIN_STATE` = 4;
public const val `CF_PIN_STATE_PINNED`: `CF_PIN_STATE` = 1;
public const val `CF_PIN_STATE_UNPINNED`: `CF_PIN_STATE` = 2;
public const val `CF_PIN_STATE_UNSPECIFIED`: `CF_PIN_STATE` = 0;
// UNSUPPORTED Rust 560:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CF_PLACEHOLDER_BASIC_INFO {
//     pub PinState: CF_PIN_STATE,
//     pub InSyncState: CF_IN_SYNC_STATE,
//     pub FileId: i64,
//     pub SyncRootFileId: i64,
//     pub FileIdentityLength: u32,
//     pub FileIdentity: [u8; 1],
// }

// UNSUPPORTED Rust 570:1: declaration Impl has no candidate rule
// impl Default for CF_PLACEHOLDER_BASIC_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CF_PLACEHOLDER_CREATE_FLAGS` = Int;
public const val `CF_PLACEHOLDER_CREATE_FLAG_ALWAYS_FULL`: `CF_PLACEHOLDER_CREATE_FLAGS` = 8;
public const val `CF_PLACEHOLDER_CREATE_FLAG_DISABLE_ON_DEMAND_POPULATION`: `CF_PLACEHOLDER_CREATE_FLAGS` = 1;
public const val `CF_PLACEHOLDER_CREATE_FLAG_MARK_IN_SYNC`: `CF_PLACEHOLDER_CREATE_FLAGS` = 2;
public const val `CF_PLACEHOLDER_CREATE_FLAG_NONE`: `CF_PLACEHOLDER_CREATE_FLAGS` = 0;
public const val `CF_PLACEHOLDER_CREATE_FLAG_SUPERSEDE`: `CF_PLACEHOLDER_CREATE_FLAGS` = 4;
// UNSUPPORTED Rust 581:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy)]
// pub struct CF_PLACEHOLDER_CREATE_INFO {
//     pub RelativeFileName: windows_sys::core::PCWSTR,
//     pub FsMetadata: CF_FS_METADATA,
//     pub FileIdentity: *const core::ffi::c_void,
//     pub FileIdentityLength: u32,
//     pub Flags: CF_PLACEHOLDER_CREATE_FLAGS,
//     pub Result: windows_sys::core::HRESULT,
//     pub CreateUsn: i64,
// }

// UNSUPPORTED Rust 593:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for CF_PLACEHOLDER_CREATE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CF_PLACEHOLDER_INFO_BASIC`: `CF_PLACEHOLDER_INFO_CLASS` = 0;
public typealias `CF_PLACEHOLDER_INFO_CLASS` = Int;
public const val `CF_PLACEHOLDER_INFO_STANDARD`: `CF_PLACEHOLDER_INFO_CLASS` = 1;
public typealias `CF_PLACEHOLDER_MANAGEMENT_POLICY` = Int;
public const val `CF_PLACEHOLDER_MANAGEMENT_POLICY_CONVERT_TO_UNRESTRICTED`: `CF_PLACEHOLDER_MANAGEMENT_POLICY` = 2;
public const val `CF_PLACEHOLDER_MANAGEMENT_POLICY_CREATE_UNRESTRICTED`: `CF_PLACEHOLDER_MANAGEMENT_POLICY` = 1;
public const val `CF_PLACEHOLDER_MANAGEMENT_POLICY_DEFAULT`: `CF_PLACEHOLDER_MANAGEMENT_POLICY` = 0;
public const val `CF_PLACEHOLDER_MANAGEMENT_POLICY_UPDATE_UNRESTRICTED`: `CF_PLACEHOLDER_MANAGEMENT_POLICY` = 4;
public const val `CF_PLACEHOLDER_MAX_FILE_IDENTITY_LENGTH`: UInt = 4096u;
public typealias `CF_PLACEHOLDER_RANGE_INFO_CLASS` = Int;
public const val `CF_PLACEHOLDER_RANGE_INFO_MODIFIED`: `CF_PLACEHOLDER_RANGE_INFO_CLASS` = 3;
public const val `CF_PLACEHOLDER_RANGE_INFO_ONDISK`: `CF_PLACEHOLDER_RANGE_INFO_CLASS` = 1;
public const val `CF_PLACEHOLDER_RANGE_INFO_VALIDATED`: `CF_PLACEHOLDER_RANGE_INFO_CLASS` = 2;
// UNSUPPORTED Rust 612:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CF_PLACEHOLDER_STANDARD_INFO {
//     pub OnDiskDataSize: i64,
//     pub ValidatedDataSize: i64,
//     pub ModifiedDataSize: i64,
//     pub PropertiesSize: i64,
//     pub PinState: CF_PIN_STATE,
//     pub InSyncState: CF_IN_SYNC_STATE,
//     pub FileId: i64,
//     pub SyncRootFileId: i64,
//     pub FileIdentityLength: u32,
//     pub FileIdentity: [u8; 1],
// }

// UNSUPPORTED Rust 626:1: declaration Impl has no candidate rule
// impl Default for CF_PLACEHOLDER_STANDARD_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CF_PLACEHOLDER_STATE` = UInt;
public const val `CF_PLACEHOLDER_STATE_ESSENTIAL_PROP_PRESENT`: `CF_PLACEHOLDER_STATE` = 4u;
public const val `CF_PLACEHOLDER_STATE_INVALID`: `CF_PLACEHOLDER_STATE` = 4294967295u;
public const val `CF_PLACEHOLDER_STATE_IN_SYNC`: `CF_PLACEHOLDER_STATE` = 8u;
public const val `CF_PLACEHOLDER_STATE_NO_STATES`: `CF_PLACEHOLDER_STATE` = 0u;
public const val `CF_PLACEHOLDER_STATE_PARTIAL`: `CF_PLACEHOLDER_STATE` = 16u;
public const val `CF_PLACEHOLDER_STATE_PARTIALLY_ON_DISK`: `CF_PLACEHOLDER_STATE` = 32u;
public const val `CF_PLACEHOLDER_STATE_PLACEHOLDER`: `CF_PLACEHOLDER_STATE` = 1u;
public const val `CF_PLACEHOLDER_STATE_SYNC_ROOT`: `CF_PLACEHOLDER_STATE` = 2u;
// UNSUPPORTED Rust 640:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CF_PLATFORM_INFO {
//     pub BuildNumber: u32,
//     pub RevisionNumber: u32,
//     pub IntegrationNumber: u32,
// }

// UNSUPPORTED Rust 647:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CF_POPULATION_POLICY {
//     pub Primary: CF_POPULATION_POLICY_PRIMARY,
//     pub Modifier: CF_POPULATION_POLICY_MODIFIER,
// }

public const val `CF_POPULATION_POLICY_ALWAYS_FULL`: `CF_POPULATION_POLICY_PRIMARY` = 3u;
public const val `CF_POPULATION_POLICY_FULL`: `CF_POPULATION_POLICY_PRIMARY` = 2u;
public typealias `CF_POPULATION_POLICY_MODIFIER` = UShort;
public const val `CF_POPULATION_POLICY_MODIFIER_NONE`: `CF_POPULATION_POLICY_MODIFIER` = 0u;
public const val `CF_POPULATION_POLICY_PARTIAL`: `CF_POPULATION_POLICY_PRIMARY` = 0u;
public typealias `CF_POPULATION_POLICY_PRIMARY` = UShort;
// UNSUPPORTED Rust 659:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CF_PROCESS_INFO {
//     pub StructSize: u32,
//     pub ProcessId: u32,
//     pub ImagePath: windows_sys::core::PCWSTR,
//     pub PackageName: windows_sys::core::PCWSTR,
//     pub ApplicationId: windows_sys::core::PCWSTR,
//     pub CommandLine: windows_sys::core::PCWSTR,
//     pub SessionId: u32,
// }

// UNSUPPORTED Rust 670:1: declaration Impl has no candidate rule
// impl Default for CF_PROCESS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CF_PROVIDER_STATUS_CLEAR_FLAGS`: `CF_SYNC_PROVIDER_STATUS` = 2147483648u;
public const val `CF_PROVIDER_STATUS_CONNECTIVITY_LOST`: `CF_SYNC_PROVIDER_STATUS` = 64u;
public const val `CF_PROVIDER_STATUS_DISCONNECTED`: `CF_SYNC_PROVIDER_STATUS` = 0u;
public const val `CF_PROVIDER_STATUS_ERROR`: `CF_SYNC_PROVIDER_STATUS` = 3221225474u;
public const val `CF_PROVIDER_STATUS_IDLE`: `CF_SYNC_PROVIDER_STATUS` = 1u;
public const val `CF_PROVIDER_STATUS_POPULATE_CONTENT`: `CF_SYNC_PROVIDER_STATUS` = 8u;
public const val `CF_PROVIDER_STATUS_POPULATE_METADATA`: `CF_SYNC_PROVIDER_STATUS` = 4u;
public const val `CF_PROVIDER_STATUS_POPULATE_NAMESPACE`: `CF_SYNC_PROVIDER_STATUS` = 2u;
public const val `CF_PROVIDER_STATUS_SYNC_FULL`: `CF_SYNC_PROVIDER_STATUS` = 32u;
public const val `CF_PROVIDER_STATUS_SYNC_INCREMENTAL`: `CF_SYNC_PROVIDER_STATUS` = 16u;
public const val `CF_PROVIDER_STATUS_TERMINATED`: `CF_SYNC_PROVIDER_STATUS` = 3221225473u;
public typealias `CF_REGISTER_FLAGS` = Int;
public const val `CF_REGISTER_FLAG_DISABLE_ON_DEMAND_POPULATION_ON_ROOT`: `CF_REGISTER_FLAGS` = 2;
public const val `CF_REGISTER_FLAG_MARK_IN_SYNC_ON_ROOT`: `CF_REGISTER_FLAGS` = 4;
public const val `CF_REGISTER_FLAG_NONE`: `CF_REGISTER_FLAGS` = 0;
public const val `CF_REGISTER_FLAG_UPDATE`: `CF_REGISTER_FLAGS` = 1;
public const val `CF_REQUEST_KEY_DEFAULT`: UInt = 0u;
public typealias `CF_REVERT_FLAGS` = Int;
public const val `CF_REVERT_FLAG_NONE`: `CF_REVERT_FLAGS` = 0;
public typealias `CF_SET_IN_SYNC_FLAGS` = Int;
public const val `CF_SET_IN_SYNC_FLAG_NONE`: `CF_SET_IN_SYNC_FLAGS` = 0;
public typealias `CF_SET_PIN_FLAGS` = Int;
public const val `CF_SET_PIN_FLAG_NONE`: `CF_SET_PIN_FLAGS` = 0;
public const val `CF_SET_PIN_FLAG_RECURSE`: `CF_SET_PIN_FLAGS` = 1;
public const val `CF_SET_PIN_FLAG_RECURSE_ONLY`: `CF_SET_PIN_FLAGS` = 2;
public const val `CF_SET_PIN_FLAG_RECURSE_STOP_ON_ERROR`: `CF_SET_PIN_FLAGS` = 4;
// UNSUPPORTED Rust 701:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CF_SYNC_POLICIES {
//     pub StructSize: u32,
//     pub Hydration: CF_HYDRATION_POLICY,
//     pub Population: CF_POPULATION_POLICY,
//     pub InSync: CF_INSYNC_POLICY,
//     pub HardLink: CF_HARDLINK_POLICY,
//     pub PlaceholderManagement: CF_PLACEHOLDER_MANAGEMENT_POLICY,
// }

public typealias `CF_SYNC_PROVIDER_STATUS` = UInt;
// UNSUPPORTED Rust 712:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CF_SYNC_REGISTRATION {
//     pub StructSize: u32,
//     pub ProviderName: windows_sys::core::PCWSTR,
//     pub ProviderVersion: windows_sys::core::PCWSTR,
//     pub SyncRootIdentity: *const core::ffi::c_void,
//     pub SyncRootIdentityLength: u32,
//     pub FileIdentity: *const core::ffi::c_void,
//     pub FileIdentityLength: u32,
//     pub ProviderId: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 724:1: declaration Impl has no candidate rule
// impl Default for CF_SYNC_REGISTRATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 729:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CF_SYNC_ROOT_BASIC_INFO {
//     pub SyncRootFileId: i64,
// }

public const val `CF_SYNC_ROOT_INFO_BASIC`: `CF_SYNC_ROOT_INFO_CLASS` = 0;
public typealias `CF_SYNC_ROOT_INFO_CLASS` = Int;
public const val `CF_SYNC_ROOT_INFO_PROVIDER`: `CF_SYNC_ROOT_INFO_CLASS` = 2;
public const val `CF_SYNC_ROOT_INFO_STANDARD`: `CF_SYNC_ROOT_INFO_CLASS` = 1;
// UNSUPPORTED Rust 738:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CF_SYNC_ROOT_PROVIDER_INFO {
//     pub ProviderStatus: CF_SYNC_PROVIDER_STATUS,
//     pub ProviderName: [u16; 256],
//     pub ProviderVersion: [u16; 256],
// }

// UNSUPPORTED Rust 745:1: declaration Impl has no candidate rule
// impl Default for CF_SYNC_ROOT_PROVIDER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 750:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CF_SYNC_ROOT_STANDARD_INFO {
//     pub SyncRootFileId: i64,
//     pub HydrationPolicy: CF_HYDRATION_POLICY,
//     pub PopulationPolicy: CF_POPULATION_POLICY,
//     pub InSyncPolicy: CF_INSYNC_POLICY,
//     pub HardLinkPolicy: CF_HARDLINK_POLICY,
//     pub ProviderStatus: CF_SYNC_PROVIDER_STATUS,
//     pub ProviderName: [u16; 256],
//     pub ProviderVersion: [u16; 256],
//     pub SyncRootIdentityLength: u32,
//     pub SyncRootIdentity: [u8; 1],
// }

// UNSUPPORTED Rust 764:1: declaration Impl has no candidate rule
// impl Default for CF_SYNC_ROOT_STANDARD_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 769:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CF_SYNC_STATUS {
//     pub StructSize: u32,
//     pub Code: u32,
//     pub DescriptionOffset: u32,
//     pub DescriptionLength: u32,
//     pub DeviceIdOffset: u32,
//     pub DeviceIdLength: u32,
// }

public typealias `CF_UPDATE_FLAGS` = Int;
public const val `CF_UPDATE_FLAG_ALLOW_PARTIAL`: `CF_UPDATE_FLAGS` = 1024;
public const val `CF_UPDATE_FLAG_ALWAYS_FULL`: `CF_UPDATE_FLAGS` = 512;
public const val `CF_UPDATE_FLAG_CLEAR_IN_SYNC`: `CF_UPDATE_FLAGS` = 64;
public const val `CF_UPDATE_FLAG_DEHYDRATE`: `CF_UPDATE_FLAGS` = 4;
public const val `CF_UPDATE_FLAG_DISABLE_ON_DEMAND_POPULATION`: `CF_UPDATE_FLAGS` = 16;
public const val `CF_UPDATE_FLAG_ENABLE_ON_DEMAND_POPULATION`: `CF_UPDATE_FLAGS` = 8;
public const val `CF_UPDATE_FLAG_MARK_IN_SYNC`: `CF_UPDATE_FLAGS` = 2;
public const val `CF_UPDATE_FLAG_NONE`: `CF_UPDATE_FLAGS` = 0;
public const val `CF_UPDATE_FLAG_PASSTHROUGH_FS_METADATA`: `CF_UPDATE_FLAGS` = 256;
public const val `CF_UPDATE_FLAG_REMOVE_FILE_IDENTITY`: `CF_UPDATE_FLAGS` = 32;
public const val `CF_UPDATE_FLAG_REMOVE_PROPERTY`: `CF_UPDATE_FLAGS` = 128;
public const val `CF_UPDATE_FLAG_VERIFY_IN_SYNC`: `CF_UPDATE_FLAGS` = 1;
