// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("srclient.dll" "system" fn SRRemoveRestorePoint(dwrpnum : u32) -> u32);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("sfc.dll" "system" fn SRSetRestorePointA(prestoreptspec : *const RESTOREPOINTINFOA, psmgrstatus : *mut STATEMGRSTATUS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("sfc.dll" "system" fn SRSetRestorePointW(prestoreptspec : *const RESTOREPOINTINFOW, psmgrstatus : *mut STATEMGRSTATUS) -> windows_sys::core::BOOL);

public const val `ACCESSIBILITY_SETTING`: UInt = 3u;
public const val `APPLICATION_INSTALL`: `RESTOREPOINTINFO_TYPE` = 0u;
public const val `APPLICATION_RUN`: UInt = 5u;
public const val `APPLICATION_UNINSTALL`: `RESTOREPOINTINFO_TYPE` = 1u;
public const val `BACKUP`: UInt = 15u;
public const val `BACKUP_RECOVERY`: UInt = 14u;
public const val `BEGIN_NESTED_SYSTEM_CHANGE`: `RESTOREPOINTINFO_EVENT_TYPE` = 102u;
public const val `BEGIN_NESTED_SYSTEM_CHANGE_NORP`: UInt = 104u;
public const val `BEGIN_SYSTEM_CHANGE`: `RESTOREPOINTINFO_EVENT_TYPE` = 100u;
public const val `CANCELLED_OPERATION`: `RESTOREPOINTINFO_TYPE` = 13u;
public const val `CHECKPOINT`: UInt = 7u;
public const val `CRITICAL_UPDATE`: UInt = 18u;
public const val `DESKTOP_SETTING`: UInt = 2u;
public const val `DEVICE_DRIVER_INSTALL`: `RESTOREPOINTINFO_TYPE` = 10u;
public const val `END_NESTED_SYSTEM_CHANGE`: `RESTOREPOINTINFO_EVENT_TYPE` = 103u;
public const val `END_SYSTEM_CHANGE`: `RESTOREPOINTINFO_EVENT_TYPE` = 101u;
public const val `FIRSTRUN`: UInt = 11u;
public const val `MANUAL_CHECKPOINT`: UInt = 16u;
public const val `MAX_DESC`: UInt = 64u;
public const val `MAX_DESC_W`: UInt = 256u;
public const val `MAX_EVENT`: UInt = 104u;
public const val `MAX_RPT`: UInt = 18u;
public const val `MIN_EVENT`: UInt = 100u;
public const val `MIN_RPT`: UInt = 0u;
public const val `MODIFY_SETTINGS`: `RESTOREPOINTINFO_TYPE` = 12u;
public const val `OE_SETTING`: UInt = 4u;
public const val `RESTORE`: UInt = 6u;
// UNSUPPORTED Rust 31:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct RESTOREPOINTINFOA {
//     pub dwEventType: RESTOREPOINTINFO_EVENT_TYPE,
//     pub dwRestorePtType: RESTOREPOINTINFO_TYPE,
//     pub llSequenceNumber: i64,
//     pub szDescription: [i8; 64],
// }

// UNSUPPORTED Rust 39:1: declaration Impl has no candidate rule
// impl Default for RESTOREPOINTINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 44:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct RESTOREPOINTINFOEX {
//     pub ftCreation: super::super::Foundation::FILETIME,
//     pub dwEventType: u32,
//     pub dwRestorePtType: u32,
//     pub dwRPNum: u32,
//     pub szDescription: [u16; 256],
// }

// UNSUPPORTED Rust 53:1: declaration Impl has no candidate rule
// impl Default for RESTOREPOINTINFOEX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 58:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct RESTOREPOINTINFOW {
//     pub dwEventType: RESTOREPOINTINFO_EVENT_TYPE,
//     pub dwRestorePtType: RESTOREPOINTINFO_TYPE,
//     pub llSequenceNumber: i64,
//     pub szDescription: [u16; 256],
// }

// UNSUPPORTED Rust 66:1: declaration Impl has no candidate rule
// impl Default for RESTOREPOINTINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RESTOREPOINTINFO_EVENT_TYPE` = UInt;
public typealias `RESTOREPOINTINFO_TYPE` = UInt;
// UNSUPPORTED Rust 73:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct STATEMGRSTATUS {
//     pub nStatus: super::super::Foundation::WIN32_ERROR,
//     pub llSequenceNumber: i64,
// }

public const val `WINDOWS_BOOT`: UInt = 9u;
public const val `WINDOWS_SHUTDOWN`: UInt = 8u;
public const val `WINDOWS_UPDATE`: UInt = 17u;
