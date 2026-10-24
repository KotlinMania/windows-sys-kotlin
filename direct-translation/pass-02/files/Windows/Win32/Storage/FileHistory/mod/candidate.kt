// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("fhsvcctl.dll" "system" fn FhServiceBlockBackup(pipe : FH_SERVICE_PIPE_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("fhsvcctl.dll" "system" fn FhServiceClosePipe(pipe : FH_SERVICE_PIPE_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("fhsvcctl.dll" "system" fn FhServiceOpenPipe(startserviceifstopped : windows_sys::core::BOOL, pipe : *mut FH_SERVICE_PIPE_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("fhsvcctl.dll" "system" fn FhServiceReloadConfiguration(pipe : FH_SERVICE_PIPE_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("fhsvcctl.dll" "system" fn FhServiceStartBackup(pipe : FH_SERVICE_PIPE_HANDLE, lowpriorityio : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("fhsvcctl.dll" "system" fn FhServiceStopBackup(pipe : FH_SERVICE_PIPE_HANDLE, stoptracking : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("fhsvcctl.dll" "system" fn FhServiceUnblockBackup(pipe : FH_SERVICE_PIPE_HANDLE) -> windows_sys::core::HRESULT);

public const val `BackupCancelled`: `FhBackupStopReason` = 4;
public const val `BackupInvalidStopReason`: `FhBackupStopReason` = 0;
public const val `BackupLimitUserBusyMachineOnAC`: `FhBackupStopReason` = 1;
public const val `BackupLimitUserBusyMachineOnDC`: `FhBackupStopReason` = 3;
public const val `BackupLimitUserIdleMachineOnDC`: `FhBackupStopReason` = 2;
public const val `FHCFG_E_CONFIGURATION_PREVIOUSLY_LOADED`: Int = -2147220731;
public const val `FHCFG_E_CONFIG_ALREADY_EXISTS`: Int = -2147220734;
public const val `FHCFG_E_CONFIG_FILE_NOT_FOUND`: Int = -2147220735;
public const val `FHCFG_E_CORRUPT_CONFIG_FILE`: Int = -2147220736;
public const val `FHCFG_E_INVALID_REHYDRATION_STATE`: Int = -2147220726;
public const val `FHCFG_E_LEGACY_BACKUP_NOT_FOUND`: Int = -2147220715;
public const val `FHCFG_E_LEGACY_BACKUP_USER_EXCLUDED`: Int = -2147220716;
public const val `FHCFG_E_LEGACY_TARGET_UNSUPPORTED`: Int = -2147220718;
public const val `FHCFG_E_LEGACY_TARGET_VALIDATION_UNSUPPORTED`: Int = -2147220717;
public const val `FHCFG_E_NO_VALID_CONFIGURATION_LOADED`: Int = -2147220733;
public const val `FHCFG_E_RECOMMENDATION_CHANGE_NOT_ALLOWED`: Int = -2147220720;
public const val `FHCFG_E_TARGET_CANNOT_BE_USED`: Int = -2147220727;
public const val `FHCFG_E_TARGET_NOT_CONFIGURED`: Int = -2147220729;
public const val `FHCFG_E_TARGET_NOT_CONNECTED`: Int = -2147220732;
public const val `FHCFG_E_TARGET_NOT_ENOUGH_FREE_SPACE`: Int = -2147220728;
public const val `FHCFG_E_TARGET_REHYDRATED_ELSEWHERE`: Int = -2147220719;
public const val `FHCFG_E_TARGET_VERIFICATION_FAILED`: Int = -2147220730;
public const val `FHSVC_E_BACKUP_BLOCKED`: Int = -2147219968;
public const val `FHSVC_E_CONFIG_DISABLED`: Int = -2147219966;
public const val `FHSVC_E_CONFIG_DISABLED_GP`: Int = -2147219965;
public const val `FHSVC_E_CONFIG_REHYDRATING`: Int = -2147219963;
public const val `FHSVC_E_FATAL_CONFIG_ERROR`: Int = -2147219964;
public const val `FHSVC_E_NOT_CONFIGURED`: Int = -2147219967;
public const val `FH_ACCESS_DENIED`: `FH_DEVICE_VALIDATION_RESULT` = 0;
public typealias `FH_BACKUP_STATUS` = Int;
public const val `FH_CURRENT_DEFAULT`: `FH_DEVICE_VALIDATION_RESULT` = 3;
public typealias `FH_DEVICE_VALIDATION_RESULT` = Int;
public const val `FH_DRIVE_FIXED`: `FH_TARGET_DRIVE_TYPES` = 3;
public const val `FH_DRIVE_REMOTE`: `FH_TARGET_DRIVE_TYPES` = 4;
public const val `FH_DRIVE_REMOVABLE`: `FH_TARGET_DRIVE_TYPES` = 2;
public const val `FH_DRIVE_UNKNOWN`: `FH_TARGET_DRIVE_TYPES` = 0;
public const val `FH_FOLDER`: `FH_PROTECTED_ITEM_CATEGORY` = 0;
public const val `FH_FREQUENCY`: `FH_LOCAL_POLICY_TYPE` = 0;
public const val `FH_INVALID_DRIVE_TYPE`: `FH_DEVICE_VALIDATION_RESULT` = 1;
public const val `FH_LIBRARY`: `FH_PROTECTED_ITEM_CATEGORY` = 1;
public typealias `FH_LOCAL_POLICY_TYPE` = Int;
public const val `FH_NAMESPACE_EXISTS`: `FH_DEVICE_VALIDATION_RESULT` = 4;
public typealias `FH_PROTECTED_ITEM_CATEGORY` = Int;
public const val `FH_READ_ONLY_PERMISSION`: `FH_DEVICE_VALIDATION_RESULT` = 2;
public const val `FH_RETENTION_AGE`: `FH_LOCAL_POLICY_TYPE` = 2;
public const val `FH_RETENTION_AGE_BASED`: `FH_RETENTION_TYPES` = 2;
public const val `FH_RETENTION_DISABLED`: `FH_RETENTION_TYPES` = 0;
public const val `FH_RETENTION_TYPE`: `FH_LOCAL_POLICY_TYPE` = 1;
public typealias `FH_RETENTION_TYPES` = Int;
public const val `FH_RETENTION_UNLIMITED`: `FH_RETENTION_TYPES` = 1;
// UNSUPPORTED Rust 58:1: non-scalar type Ptr unsupported
// pub type FH_SERVICE_PIPE_HANDLE = *mut core::ffi::c_void;

public const val `FH_STATE_BACKUP_NOT_SUPPORTED`: UInt = 2064u;
public const val `FH_STATE_DISABLED_BY_GP`: UInt = 2u;
public const val `FH_STATE_FATAL_CONFIG_ERROR`: UInt = 3u;
public const val `FH_STATE_MIGRATING`: UInt = 4u;
public const val `FH_STATE_NOT_TRACKED`: UInt = 0u;
public const val `FH_STATE_NO_ERROR`: UInt = 255u;
public const val `FH_STATE_OFF`: UInt = 1u;
public const val `FH_STATE_REHYDRATING`: UInt = 5u;
public const val `FH_STATE_RUNNING`: UInt = 256u;
public const val `FH_STATE_STAGING_FULL`: UInt = 18u;
public const val `FH_STATE_TARGET_ABSENT`: UInt = 21u;
public const val `FH_STATE_TARGET_ACCESS_DENIED`: UInt = 14u;
public const val `FH_STATE_TARGET_FS_LIMITATION`: UInt = 13u;
public const val `FH_STATE_TARGET_FULL`: UInt = 17u;
public const val `FH_STATE_TARGET_FULL_RETENTION_MAX`: UInt = 16u;
public const val `FH_STATE_TARGET_LOW_SPACE`: UInt = 20u;
public const val `FH_STATE_TARGET_LOW_SPACE_RETENTION_MAX`: UInt = 19u;
public const val `FH_STATE_TARGET_VOLUME_DIRTY`: UInt = 15u;
public const val `FH_STATE_TOO_MUCH_BEHIND`: UInt = 240u;
public const val `FH_STATUS_DISABLED`: `FH_BACKUP_STATUS` = 0;
public const val `FH_STATUS_DISABLED_BY_GP`: `FH_BACKUP_STATUS` = 1;
public const val `FH_STATUS_ENABLED`: `FH_BACKUP_STATUS` = 2;
public const val `FH_STATUS_REHYDRATING`: `FH_BACKUP_STATUS` = 3;
public const val `FH_TARGET_DRIVE_TYPE`: `FH_TARGET_PROPERTY_TYPE` = 2;
public typealias `FH_TARGET_DRIVE_TYPES` = Int;
public const val `FH_TARGET_NAME`: `FH_TARGET_PROPERTY_TYPE` = 0;
public const val `FH_TARGET_PART_OF_LIBRARY`: `FH_DEVICE_VALIDATION_RESULT` = 5;
public typealias `FH_TARGET_PROPERTY_TYPE` = Int;
public const val `FH_TARGET_URL`: `FH_TARGET_PROPERTY_TYPE` = 1;
public const val `FH_VALID_TARGET`: `FH_DEVICE_VALIDATION_RESULT` = 6;
public typealias `FhBackupStopReason` = Int;
// UNSUPPORTED Rust 90:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FhConfigMgr: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xed43bb3c_09e9_498a_9df6_2177244c6db4);

// UNSUPPORTED Rust 91:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FhReassociation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d728e35_16fa_4320_9e8b_bfd7100a8846);

public const val `MAX_BACKUP_STATUS`: `FH_BACKUP_STATUS` = 4;
public const val `MAX_LOCAL_POLICY`: `FH_LOCAL_POLICY_TYPE` = 3;
public const val `MAX_PROTECTED_ITEM_CATEGORY`: `FH_PROTECTED_ITEM_CATEGORY` = 2;
public const val `MAX_RETENTION_TYPE`: `FH_RETENTION_TYPES` = 3;
public const val `MAX_TARGET_PROPERTY`: `FH_TARGET_PROPERTY_TYPE` = 3;
public const val `MAX_VALIDATION_RESULT`: `FH_DEVICE_VALIDATION_RESULT` = 7;
