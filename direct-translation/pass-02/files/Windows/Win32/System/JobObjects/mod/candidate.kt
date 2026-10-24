// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn AssignProcessToJobObject(hjob : super::super::Foundation:: HANDLE, hprocess : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("kernel32.dll" "system" fn CreateJobObjectA(lpjobattributes : *const super::super::Security:: SECURITY_ATTRIBUTES, lpname : windows_sys::core::PCSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("kernel32.dll" "system" fn CreateJobObjectW(lpjobattributes : *const super::super::Security:: SECURITY_ATTRIBUTES, lpname : windows_sys::core::PCWSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn CreateJobSet(numjob : u32, userjobset : *const JOB_SET_ARRAY, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn FreeMemoryJobObject(buffer : *const core::ffi::c_void));

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn IsProcessInJob(processhandle : super::super::Foundation:: HANDLE, jobhandle : super::super::Foundation:: HANDLE, result : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn OpenJobObjectA(dwdesiredaccess : u32, binherithandle : windows_sys::core::BOOL, lpname : windows_sys::core::PCSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn OpenJobObjectW(dwdesiredaccess : u32, binherithandle : windows_sys::core::BOOL, lpname : windows_sys::core::PCWSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn QueryInformationJobObject(hjob : super::super::Foundation:: HANDLE, jobobjectinformationclass : JOBOBJECTINFOCLASS, lpjobobjectinformation : *mut core::ffi::c_void, cbjobobjectinformationlength : u32, lpreturnlength : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn QueryIoRateControlInformationJobObject(hjob : super::super::Foundation:: HANDLE, volumename : windows_sys::core::PCWSTR, infoblocks : *mut *mut JOBOBJECT_IO_RATE_CONTROL_INFORMATION, infoblockcount : *mut u32) -> u32);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetInformationJobObject(hjob : super::super::Foundation:: HANDLE, jobobjectinformationclass : JOBOBJECTINFOCLASS, lpjobobjectinformation : *const core::ffi::c_void, cbjobobjectinformationlength : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetIoRateControlInformationJobObject(hjob : super::super::Foundation:: HANDLE, ioratecontrolinfo : *const JOBOBJECT_IO_RATE_CONTROL_INFORMATION) -> u32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn TerminateJobObject(hjob : super::super::Foundation:: HANDLE, uexitcode : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn UserHandleGrantAccess(huserhandle : super::super::Foundation:: HANDLE, hjob : super::super::Foundation:: HANDLE, bgrant : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

public typealias `JOBOBJECTINFOCLASS` = Int;
// UNSUPPORTED Rust 18:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct JOBOBJECT_ASSOCIATE_COMPLETION_PORT {
//     pub CompletionKey: *mut core::ffi::c_void,
//     pub CompletionPort: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 24:1: declaration Impl has no candidate rule
// impl Default for JOBOBJECT_ASSOCIATE_COMPLETION_PORT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 29:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct JOBOBJECT_BASIC_ACCOUNTING_INFORMATION {
//     pub TotalUserTime: i64,
//     pub TotalKernelTime: i64,
//     pub ThisPeriodTotalUserTime: i64,
//     pub ThisPeriodTotalKernelTime: i64,
//     pub TotalPageFaultCount: u32,
//     pub TotalProcesses: u32,
//     pub ActiveProcesses: u32,
//     pub TotalTerminatedProcesses: u32,
// }

// UNSUPPORTED Rust 41:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Threading")]
// #[derive(Clone, Copy, Default)]
// pub struct JOBOBJECT_BASIC_AND_IO_ACCOUNTING_INFORMATION {
//     pub BasicInfo: JOBOBJECT_BASIC_ACCOUNTING_INFORMATION,
//     pub IoInfo: super::Threading::IO_COUNTERS,
// }

// UNSUPPORTED Rust 48:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct JOBOBJECT_BASIC_LIMIT_INFORMATION {
//     pub PerProcessUserTimeLimit: i64,
//     pub PerJobUserTimeLimit: i64,
//     pub LimitFlags: JOB_OBJECT_LIMIT,
//     pub MinimumWorkingSetSize: usize,
//     pub MaximumWorkingSetSize: usize,
//     pub ActiveProcessLimit: u32,
//     pub Affinity: usize,
//     pub PriorityClass: u32,
//     pub SchedulingClass: u32,
// }

// UNSUPPORTED Rust 61:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct JOBOBJECT_BASIC_PROCESS_ID_LIST {
//     pub NumberOfAssignedProcesses: u32,
//     pub NumberOfProcessIdsInList: u32,
//     pub ProcessIdList: [usize; 1],
// }

// UNSUPPORTED Rust 68:1: declaration Impl has no candidate rule
// impl Default for JOBOBJECT_BASIC_PROCESS_ID_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 73:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct JOBOBJECT_BASIC_UI_RESTRICTIONS {
//     pub UIRestrictionsClass: JOB_OBJECT_UILIMIT,
// }

// UNSUPPORTED Rust 78:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct JOBOBJECT_CPU_RATE_CONTROL_INFORMATION {
//     pub ControlFlags: JOB_OBJECT_CPU_RATE_CONTROL,
//     pub Anonymous: JOBOBJECT_CPU_RATE_CONTROL_INFORMATION_0,
// }

// UNSUPPORTED Rust 84:1: declaration Impl has no candidate rule
// impl Default for JOBOBJECT_CPU_RATE_CONTROL_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 89:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JOBOBJECT_CPU_RATE_CONTROL_INFORMATION_0 {
//     pub CpuRate: u32,
//     pub Weight: u32,
//     pub Anonymous: JOBOBJECT_CPU_RATE_CONTROL_INFORMATION_0_0,
// }

// UNSUPPORTED Rust 96:1: declaration Impl has no candidate rule
// impl Default for JOBOBJECT_CPU_RATE_CONTROL_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 101:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct JOBOBJECT_CPU_RATE_CONTROL_INFORMATION_0_0 {
//     pub MinRate: u16,
//     pub MaxRate: u16,
// }

// UNSUPPORTED Rust 107:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct JOBOBJECT_END_OF_JOB_TIME_INFORMATION {
//     pub EndOfJobTimeAction: JOB_OBJECT_TERMINATE_AT_END_ACTION,
// }

// UNSUPPORTED Rust 112:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Threading")]
// #[derive(Clone, Copy, Default)]
// pub struct JOBOBJECT_EXTENDED_LIMIT_INFORMATION {
//     pub BasicLimitInformation: JOBOBJECT_BASIC_LIMIT_INFORMATION,
//     pub IoInfo: super::Threading::IO_COUNTERS,
//     pub ProcessMemoryLimit: usize,
//     pub JobMemoryLimit: usize,
//     pub PeakProcessMemoryUsed: usize,
//     pub PeakJobMemoryUsed: usize,
// }

public const val `JOBOBJECT_IO_ATTRIBUTION_CONTROL_DISABLE`: `JOBOBJECT_IO_ATTRIBUTION_CONTROL_FLAGS` = 2;
public const val `JOBOBJECT_IO_ATTRIBUTION_CONTROL_ENABLE`: `JOBOBJECT_IO_ATTRIBUTION_CONTROL_FLAGS` = 1;
public typealias `JOBOBJECT_IO_ATTRIBUTION_CONTROL_FLAGS` = Int;
public const val `JOBOBJECT_IO_ATTRIBUTION_CONTROL_VALID_FLAGS`: `JOBOBJECT_IO_ATTRIBUTION_CONTROL_FLAGS` = 3;
// UNSUPPORTED Rust 127:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct JOBOBJECT_IO_ATTRIBUTION_INFORMATION {
//     pub ControlFlags: u32,
//     pub ReadStats: JOBOBJECT_IO_ATTRIBUTION_STATS,
//     pub WriteStats: JOBOBJECT_IO_ATTRIBUTION_STATS,
// }

// UNSUPPORTED Rust 134:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct JOBOBJECT_IO_ATTRIBUTION_STATS {
//     pub IoCount: usize,
//     pub TotalNonOverlappedQueueTime: u64,
//     pub TotalNonOverlappedServiceTime: u64,
//     pub TotalSize: u64,
// }

// UNSUPPORTED Rust 142:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct JOBOBJECT_IO_RATE_CONTROL_INFORMATION {
//     pub MaxIops: i64,
//     pub MaxBandwidth: i64,
//     pub ReservationIops: i64,
//     pub VolumeName: windows_sys::core::PCWSTR,
//     pub BaseIoSize: u32,
//     pub ControlFlags: u32,
// }

// UNSUPPORTED Rust 152:1: declaration Impl has no candidate rule
// impl Default for JOBOBJECT_IO_RATE_CONTROL_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 157:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V1 {
//     pub MaxIops: i64,
//     pub MaxBandwidth: i64,
//     pub ReservationIops: i64,
//     pub VolumeName: windows_sys::core::PWSTR,
//     pub BaseIoSize: u32,
//     pub ControlFlags: JOB_OBJECT_IO_RATE_CONTROL_FLAGS,
//     pub VolumeNameLength: u16,
// }

// UNSUPPORTED Rust 168:1: declaration Impl has no candidate rule
// impl Default for JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 173:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V2 {
//     pub MaxIops: i64,
//     pub MaxBandwidth: i64,
//     pub ReservationIops: i64,
//     pub VolumeName: windows_sys::core::PWSTR,
//     pub BaseIoSize: u32,
//     pub ControlFlags: JOB_OBJECT_IO_RATE_CONTROL_FLAGS,
//     pub VolumeNameLength: u16,
//     pub CriticalReservationIops: i64,
//     pub ReservationBandwidth: i64,
//     pub CriticalReservationBandwidth: i64,
//     pub MaxTimePercent: i64,
//     pub ReservationTimePercent: i64,
//     pub CriticalReservationTimePercent: i64,
// }

// UNSUPPORTED Rust 190:1: declaration Impl has no candidate rule
// impl Default for JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 195:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3 {
//     pub MaxIops: i64,
//     pub MaxBandwidth: i64,
//     pub ReservationIops: i64,
//     pub VolumeName: windows_sys::core::PWSTR,
//     pub BaseIoSize: u32,
//     pub ControlFlags: JOB_OBJECT_IO_RATE_CONTROL_FLAGS,
//     pub VolumeNameLength: u16,
//     pub CriticalReservationIops: i64,
//     pub ReservationBandwidth: i64,
//     pub CriticalReservationBandwidth: i64,
//     pub MaxTimePercent: i64,
//     pub ReservationTimePercent: i64,
//     pub CriticalReservationTimePercent: i64,
//     pub SoftMaxIops: i64,
//     pub SoftMaxBandwidth: i64,
//     pub SoftMaxTimePercent: i64,
//     pub LimitExcessNotifyIops: i64,
//     pub LimitExcessNotifyBandwidth: i64,
//     pub LimitExcessNotifyTimePercent: i64,
// }

// UNSUPPORTED Rust 218:1: declaration Impl has no candidate rule
// impl Default for JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 223:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct JOBOBJECT_JOBSET_INFORMATION {
//     pub MemberLevel: u32,
// }

// UNSUPPORTED Rust 228:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct JOBOBJECT_LIMIT_VIOLATION_INFORMATION {
//     pub LimitFlags: JOB_OBJECT_LIMIT,
//     pub ViolationLimitFlags: JOB_OBJECT_LIMIT,
//     pub IoReadBytes: u64,
//     pub IoReadBytesLimit: u64,
//     pub IoWriteBytes: u64,
//     pub IoWriteBytesLimit: u64,
//     pub PerJobUserTime: i64,
//     pub PerJobUserTimeLimit: i64,
//     pub JobMemory: u64,
//     pub JobMemoryLimit: u64,
//     pub RateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE,
//     pub RateControlToleranceLimit: JOBOBJECT_RATE_CONTROL_TOLERANCE,
// }

// UNSUPPORTED Rust 244:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2 {
//     pub LimitFlags: JOB_OBJECT_LIMIT,
//     pub ViolationLimitFlags: JOB_OBJECT_LIMIT,
//     pub IoReadBytes: u64,
//     pub IoReadBytesLimit: u64,
//     pub IoWriteBytes: u64,
//     pub IoWriteBytesLimit: u64,
//     pub PerJobUserTime: i64,
//     pub PerJobUserTimeLimit: i64,
//     pub JobMemory: u64,
//     pub Anonymous1: JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_0,
//     pub Anonymous2: JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_1,
//     pub Anonymous3: JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_2,
//     pub JobLowMemoryLimit: u64,
//     pub IoRateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE,
//     pub IoRateControlToleranceLimit: JOBOBJECT_RATE_CONTROL_TOLERANCE,
//     pub NetRateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE,
//     pub NetRateControlToleranceLimit: JOBOBJECT_RATE_CONTROL_TOLERANCE,
// }

// UNSUPPORTED Rust 265:1: declaration Impl has no candidate rule
// impl Default for JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 270:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_0 {
//     pub JobHighMemoryLimit: u64,
//     pub JobMemoryLimit: u64,
// }

// UNSUPPORTED Rust 276:1: declaration Impl has no candidate rule
// impl Default for JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 281:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_1 {
//     pub RateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE,
//     pub CpuRateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE,
// }

// UNSUPPORTED Rust 287:1: declaration Impl has no candidate rule
// impl Default for JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 292:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_2 {
//     pub RateControlToleranceLimit: JOBOBJECT_RATE_CONTROL_TOLERANCE,
//     pub CpuRateControlToleranceLimit: JOBOBJECT_RATE_CONTROL_TOLERANCE,
// }

// UNSUPPORTED Rust 298:1: declaration Impl has no candidate rule
// impl Default for JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 303:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct JOBOBJECT_NET_RATE_CONTROL_INFORMATION {
//     pub MaxBandwidth: u64,
//     pub ControlFlags: JOB_OBJECT_NET_RATE_CONTROL_FLAGS,
//     pub DscpTag: u8,
// }

// UNSUPPORTED Rust 310:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION {
//     pub IoReadBytesLimit: u64,
//     pub IoWriteBytesLimit: u64,
//     pub PerJobUserTimeLimit: i64,
//     pub JobMemoryLimit: u64,
//     pub RateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE,
//     pub RateControlToleranceInterval: JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL,
//     pub LimitFlags: JOB_OBJECT_LIMIT,
// }

// UNSUPPORTED Rust 321:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2 {
//     pub IoReadBytesLimit: u64,
//     pub IoWriteBytesLimit: u64,
//     pub PerJobUserTimeLimit: i64,
//     pub Anonymous1: JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_0,
//     pub Anonymous2: JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_1,
//     pub Anonymous3: JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_2,
//     pub LimitFlags: JOB_OBJECT_LIMIT,
//     pub IoRateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE,
//     pub JobLowMemoryLimit: u64,
//     pub IoRateControlToleranceInterval: JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL,
//     pub NetRateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE,
//     pub NetRateControlToleranceInterval: JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL,
// }

// UNSUPPORTED Rust 337:1: declaration Impl has no candidate rule
// impl Default for JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 342:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_0 {
//     pub JobHighMemoryLimit: u64,
//     pub JobMemoryLimit: u64,
// }

// UNSUPPORTED Rust 348:1: declaration Impl has no candidate rule
// impl Default for JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 353:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_1 {
//     pub RateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE,
//     pub CpuRateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE,
// }

// UNSUPPORTED Rust 359:1: declaration Impl has no candidate rule
// impl Default for JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 364:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_2 {
//     pub RateControlToleranceInterval: JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL,
//     pub CpuRateControlToleranceInterval: JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL,
// }

// UNSUPPORTED Rust 370:1: declaration Impl has no candidate rule
// impl Default for JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `JOBOBJECT_RATE_CONTROL_TOLERANCE` = Int;
public typealias `JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL` = Int;
// UNSUPPORTED Rust 377:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct JOBOBJECT_SECURITY_LIMIT_INFORMATION {
//     pub SecurityLimitFlags: JOB_OBJECT_SECURITY,
//     pub JobToken: super::super::Foundation::HANDLE,
//     pub SidsToDisable: *mut super::super::Security::TOKEN_GROUPS,
//     pub PrivilegesToDelete: *mut super::super::Security::TOKEN_PRIVILEGES,
//     pub RestrictedSids: *mut super::super::Security::TOKEN_GROUPS,
// }

// UNSUPPORTED Rust 387:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for JOBOBJECT_SECURITY_LIMIT_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `JOB_OBJECT_BASIC_LIMIT_VALID_FLAGS`: `JOB_OBJECT_LIMIT` = 255u;
public typealias `JOB_OBJECT_CPU_RATE_CONTROL` = UInt;
public const val `JOB_OBJECT_CPU_RATE_CONTROL_ENABLE`: `JOB_OBJECT_CPU_RATE_CONTROL` = 1u;
public const val `JOB_OBJECT_CPU_RATE_CONTROL_HARD_CAP`: `JOB_OBJECT_CPU_RATE_CONTROL` = 4u;
public const val `JOB_OBJECT_CPU_RATE_CONTROL_MIN_MAX_RATE`: `JOB_OBJECT_CPU_RATE_CONTROL` = 16u;
public const val `JOB_OBJECT_CPU_RATE_CONTROL_NOTIFY`: `JOB_OBJECT_CPU_RATE_CONTROL` = 8u;
public const val `JOB_OBJECT_CPU_RATE_CONTROL_VALID_FLAGS`: `JOB_OBJECT_CPU_RATE_CONTROL` = 31u;
public const val `JOB_OBJECT_CPU_RATE_CONTROL_WEIGHT_BASED`: `JOB_OBJECT_CPU_RATE_CONTROL` = 2u;
public const val `JOB_OBJECT_EXTENDED_LIMIT_VALID_FLAGS`: `JOB_OBJECT_LIMIT` = 32767u;
public const val `JOB_OBJECT_IO_RATE_CONTROL_ENABLE`: `JOB_OBJECT_IO_RATE_CONTROL_FLAGS` = 1;
public typealias `JOB_OBJECT_IO_RATE_CONTROL_FLAGS` = Int;
public const val `JOB_OBJECT_IO_RATE_CONTROL_FORCE_UNIT_ACCESS_ALL`: `JOB_OBJECT_IO_RATE_CONTROL_FLAGS` = 4;
public const val `JOB_OBJECT_IO_RATE_CONTROL_FORCE_UNIT_ACCESS_ON_SOFT_CAP`: `JOB_OBJECT_IO_RATE_CONTROL_FLAGS` = 8;
public const val `JOB_OBJECT_IO_RATE_CONTROL_STANDALONE_VOLUME`: `JOB_OBJECT_IO_RATE_CONTROL_FLAGS` = 2;
public const val `JOB_OBJECT_IO_RATE_CONTROL_VALID_FLAGS`: `JOB_OBJECT_IO_RATE_CONTROL_FLAGS` = 15;
public typealias `JOB_OBJECT_LIMIT` = UInt;
public const val `JOB_OBJECT_LIMIT_ACTIVE_PROCESS`: `JOB_OBJECT_LIMIT` = 8u;
public const val `JOB_OBJECT_LIMIT_AFFINITY`: `JOB_OBJECT_LIMIT` = 16u;
public const val `JOB_OBJECT_LIMIT_BREAKAWAY_OK`: `JOB_OBJECT_LIMIT` = 2048u;
public const val `JOB_OBJECT_LIMIT_CPU_RATE_CONTROL`: `JOB_OBJECT_LIMIT` = 262144u;
public const val `JOB_OBJECT_LIMIT_DIE_ON_UNHANDLED_EXCEPTION`: `JOB_OBJECT_LIMIT` = 1024u;
public const val `JOB_OBJECT_LIMIT_IO_RATE_CONTROL`: `JOB_OBJECT_LIMIT` = 524288u;
public const val `JOB_OBJECT_LIMIT_JOB_MEMORY`: `JOB_OBJECT_LIMIT` = 512u;
public const val `JOB_OBJECT_LIMIT_JOB_MEMORY_HIGH`: `JOB_OBJECT_LIMIT` = 512u;
public const val `JOB_OBJECT_LIMIT_JOB_MEMORY_LOW`: `JOB_OBJECT_LIMIT` = 32768u;
public const val `JOB_OBJECT_LIMIT_JOB_READ_BYTES`: `JOB_OBJECT_LIMIT` = 65536u;
public const val `JOB_OBJECT_LIMIT_JOB_TIME`: `JOB_OBJECT_LIMIT` = 4u;
public const val `JOB_OBJECT_LIMIT_JOB_WRITE_BYTES`: `JOB_OBJECT_LIMIT` = 131072u;
public const val `JOB_OBJECT_LIMIT_KILL_ON_JOB_CLOSE`: `JOB_OBJECT_LIMIT` = 8192u;
public const val `JOB_OBJECT_LIMIT_NET_RATE_CONTROL`: `JOB_OBJECT_LIMIT` = 1048576u;
public const val `JOB_OBJECT_LIMIT_PRESERVE_JOB_TIME`: `JOB_OBJECT_LIMIT` = 64u;
public const val `JOB_OBJECT_LIMIT_PRIORITY_CLASS`: `JOB_OBJECT_LIMIT` = 32u;
public const val `JOB_OBJECT_LIMIT_PROCESS_MEMORY`: `JOB_OBJECT_LIMIT` = 256u;
public const val `JOB_OBJECT_LIMIT_PROCESS_TIME`: `JOB_OBJECT_LIMIT` = 2u;
public const val `JOB_OBJECT_LIMIT_RATE_CONTROL`: `JOB_OBJECT_LIMIT` = 262144u;
public const val `JOB_OBJECT_LIMIT_SCHEDULING_CLASS`: `JOB_OBJECT_LIMIT` = 128u;
public const val `JOB_OBJECT_LIMIT_SILENT_BREAKAWAY_OK`: `JOB_OBJECT_LIMIT` = 4096u;
public const val `JOB_OBJECT_LIMIT_SUBSET_AFFINITY`: `JOB_OBJECT_LIMIT` = 16384u;
public const val `JOB_OBJECT_LIMIT_VALID_FLAGS`: `JOB_OBJECT_LIMIT` = 524287u;
public const val `JOB_OBJECT_LIMIT_WORKINGSET`: `JOB_OBJECT_LIMIT` = 1u;
public const val `JOB_OBJECT_NET_RATE_CONTROL_DSCP_TAG`: `JOB_OBJECT_NET_RATE_CONTROL_FLAGS` = 4;
public const val `JOB_OBJECT_NET_RATE_CONTROL_ENABLE`: `JOB_OBJECT_NET_RATE_CONTROL_FLAGS` = 1;
public typealias `JOB_OBJECT_NET_RATE_CONTROL_FLAGS` = Int;
public const val `JOB_OBJECT_NET_RATE_CONTROL_MAX_BANDWIDTH`: `JOB_OBJECT_NET_RATE_CONTROL_FLAGS` = 2;
public const val `JOB_OBJECT_NET_RATE_CONTROL_VALID_FLAGS`: `JOB_OBJECT_NET_RATE_CONTROL_FLAGS` = 7;
public const val `JOB_OBJECT_NOTIFICATION_LIMIT_VALID_FLAGS`: `JOB_OBJECT_LIMIT` = 2064900u;
public const val `JOB_OBJECT_POST_AT_END_OF_JOB`: `JOB_OBJECT_TERMINATE_AT_END_ACTION` = 1u;
public typealias `JOB_OBJECT_SECURITY` = UInt;
public const val `JOB_OBJECT_SECURITY_FILTER_TOKENS`: `JOB_OBJECT_SECURITY` = 8u;
public const val `JOB_OBJECT_SECURITY_NO_ADMIN`: `JOB_OBJECT_SECURITY` = 1u;
public const val `JOB_OBJECT_SECURITY_ONLY_TOKEN`: `JOB_OBJECT_SECURITY` = 4u;
public const val `JOB_OBJECT_SECURITY_RESTRICTED_TOKEN`: `JOB_OBJECT_SECURITY` = 2u;
public const val `JOB_OBJECT_SECURITY_VALID_FLAGS`: `JOB_OBJECT_SECURITY` = 15u;
public typealias `JOB_OBJECT_TERMINATE_AT_END_ACTION` = UInt;
public const val `JOB_OBJECT_TERMINATE_AT_END_OF_JOB`: `JOB_OBJECT_TERMINATE_AT_END_ACTION` = 0u;
public typealias `JOB_OBJECT_UILIMIT` = UInt;
public const val `JOB_OBJECT_UILIMIT_DESKTOP`: `JOB_OBJECT_UILIMIT` = 64u;
public const val `JOB_OBJECT_UILIMIT_DISPLAYSETTINGS`: `JOB_OBJECT_UILIMIT` = 16u;
public const val `JOB_OBJECT_UILIMIT_EXITWINDOWS`: `JOB_OBJECT_UILIMIT` = 128u;
public const val `JOB_OBJECT_UILIMIT_GLOBALATOMS`: `JOB_OBJECT_UILIMIT` = 32u;
public const val `JOB_OBJECT_UILIMIT_HANDLES`: `JOB_OBJECT_UILIMIT` = 1u;
public const val `JOB_OBJECT_UILIMIT_NONE`: `JOB_OBJECT_UILIMIT` = 0u;
public const val `JOB_OBJECT_UILIMIT_READCLIPBOARD`: `JOB_OBJECT_UILIMIT` = 2u;
public const val `JOB_OBJECT_UILIMIT_SYSTEMPARAMETERS`: `JOB_OBJECT_UILIMIT` = 8u;
public const val `JOB_OBJECT_UILIMIT_WRITECLIPBOARD`: `JOB_OBJECT_UILIMIT` = 4u;
// UNSUPPORTED Rust 458:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct JOB_SET_ARRAY {
//     pub JobHandle: super::super::Foundation::HANDLE,
//     pub MemberLevel: u32,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 465:1: declaration Impl has no candidate rule
// impl Default for JOB_SET_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `JobObjectAssociateCompletionPortInformation`: `JOBOBJECTINFOCLASS` = 7;
public const val `JobObjectBasicAccountingInformation`: `JOBOBJECTINFOCLASS` = 1;
public const val `JobObjectBasicAndIoAccountingInformation`: `JOBOBJECTINFOCLASS` = 8;
public const val `JobObjectBasicLimitInformation`: `JOBOBJECTINFOCLASS` = 2;
public const val `JobObjectBasicProcessIdList`: `JOBOBJECTINFOCLASS` = 3;
public const val `JobObjectBasicUIRestrictions`: `JOBOBJECTINFOCLASS` = 4;
public const val `JobObjectCompletionCounter`: `JOBOBJECTINFOCLASS` = 17;
public const val `JobObjectCompletionFilter`: `JOBOBJECTINFOCLASS` = 16;
public const val `JobObjectCpuRateControlInformation`: `JOBOBJECTINFOCLASS` = 15;
public const val `JobObjectCreateSilo`: `JOBOBJECTINFOCLASS` = 35;
public const val `JobObjectEndOfJobTimeInformation`: `JOBOBJECTINFOCLASS` = 6;
public const val `JobObjectExtendedLimitInformation`: `JOBOBJECTINFOCLASS` = 9;
public const val `JobObjectGroupInformation`: `JOBOBJECTINFOCLASS` = 11;
public const val `JobObjectGroupInformationEx`: `JOBOBJECTINFOCLASS` = 14;
public const val `JobObjectJobSetInformation`: `JOBOBJECTINFOCLASS` = 10;
public const val `JobObjectLimitViolationInformation`: `JOBOBJECTINFOCLASS` = 13;
public const val `JobObjectLimitViolationInformation2`: `JOBOBJECTINFOCLASS` = 34;
public const val `JobObjectNetRateControlInformation`: `JOBOBJECTINFOCLASS` = 32;
public const val `JobObjectNotificationLimitInformation`: `JOBOBJECTINFOCLASS` = 12;
public const val `JobObjectNotificationLimitInformation2`: `JOBOBJECTINFOCLASS` = 33;
public const val `JobObjectReserved10Information`: `JOBOBJECTINFOCLASS` = 27;
public const val `JobObjectReserved11Information`: `JOBOBJECTINFOCLASS` = 28;
public const val `JobObjectReserved12Information`: `JOBOBJECTINFOCLASS` = 29;
public const val `JobObjectReserved13Information`: `JOBOBJECTINFOCLASS` = 30;
public const val `JobObjectReserved14Information`: `JOBOBJECTINFOCLASS` = 31;
public const val `JobObjectReserved15Information`: `JOBOBJECTINFOCLASS` = 37;
public const val `JobObjectReserved16Information`: `JOBOBJECTINFOCLASS` = 38;
public const val `JobObjectReserved17Information`: `JOBOBJECTINFOCLASS` = 39;
public const val `JobObjectReserved18Information`: `JOBOBJECTINFOCLASS` = 40;
public const val `JobObjectReserved19Information`: `JOBOBJECTINFOCLASS` = 41;
public const val `JobObjectReserved1Information`: `JOBOBJECTINFOCLASS` = 18;
public const val `JobObjectReserved20Information`: `JOBOBJECTINFOCLASS` = 42;
public const val `JobObjectReserved21Information`: `JOBOBJECTINFOCLASS` = 43;
public const val `JobObjectReserved22Information`: `JOBOBJECTINFOCLASS` = 44;
public const val `JobObjectReserved23Information`: `JOBOBJECTINFOCLASS` = 45;
public const val `JobObjectReserved24Information`: `JOBOBJECTINFOCLASS` = 46;
public const val `JobObjectReserved25Information`: `JOBOBJECTINFOCLASS` = 47;
public const val `JobObjectReserved26Information`: `JOBOBJECTINFOCLASS` = 48;
public const val `JobObjectReserved27Information`: `JOBOBJECTINFOCLASS` = 49;
public const val `JobObjectReserved2Information`: `JOBOBJECTINFOCLASS` = 19;
public const val `JobObjectReserved3Information`: `JOBOBJECTINFOCLASS` = 20;
public const val `JobObjectReserved4Information`: `JOBOBJECTINFOCLASS` = 21;
public const val `JobObjectReserved5Information`: `JOBOBJECTINFOCLASS` = 22;
public const val `JobObjectReserved6Information`: `JOBOBJECTINFOCLASS` = 23;
public const val `JobObjectReserved7Information`: `JOBOBJECTINFOCLASS` = 24;
public const val `JobObjectReserved8Information`: `JOBOBJECTINFOCLASS` = 25;
public const val `JobObjectReserved9Information`: `JOBOBJECTINFOCLASS` = 26;
public const val `JobObjectSecurityLimitInformation`: `JOBOBJECTINFOCLASS` = 5;
public const val `JobObjectSiloBasicInformation`: `JOBOBJECTINFOCLASS` = 36;
public const val `MaxJobObjectInfoClass`: `JOBOBJECTINFOCLASS` = 50;
public const val `ToleranceHigh`: `JOBOBJECT_RATE_CONTROL_TOLERANCE` = 3;
public const val `ToleranceIntervalLong`: `JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL` = 3;
public const val `ToleranceIntervalMedium`: `JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL` = 2;
public const val `ToleranceIntervalShort`: `JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL` = 1;
public const val `ToleranceLow`: `JOBOBJECT_RATE_CONTROL_TOLERANCE` = 1;
public const val `ToleranceMedium`: `JOBOBJECT_RATE_CONTROL_TOLERANCE` = 2;
