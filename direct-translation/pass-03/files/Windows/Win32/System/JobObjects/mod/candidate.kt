// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=AssignProcessToJobObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AssignProcessToJobObject`(`hjob` : `super`.`super`.`Foundation`.`HANDLE`, `hprocess` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateJobObjectA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateJobObjectA`(`lpjobattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `lpname` : `windows_sys`.`core`.`PCSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateJobObjectW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateJobObjectW`(`lpjobattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `lpname` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateJobSet; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateJobSet`(`numjob` : UInt, `userjobset` : /* Rust *const */ kotlinx.cinterop.CPointer<`JOB_SET_ARRAY`>?, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FreeMemoryJobObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FreeMemoryJobObject`(`buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=IsProcessInJob; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsProcessInJob`(`processhandle` : `super`.`super`.`Foundation`.`HANDLE`, `jobhandle` : `super`.`super`.`Foundation`.`HANDLE`, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=OpenJobObjectA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenJobObjectA`(`dwdesiredaccess` : UInt, `binherithandle` : `windows_sys`.`core`.`BOOL`, `lpname` : `windows_sys`.`core`.`PCSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=OpenJobObjectW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenJobObjectW`(`dwdesiredaccess` : UInt, `binherithandle` : `windows_sys`.`core`.`BOOL`, `lpname` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=QueryInformationJobObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryInformationJobObject`(`hjob` : `super`.`super`.`Foundation`.`HANDLE`, `jobobjectinformationclass` : `JOBOBJECTINFOCLASS`, `lpjobobjectinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbjobobjectinformationlength` : UInt, `lpreturnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=QueryIoRateControlInformationJobObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryIoRateControlInformationJobObject`(`hjob` : `super`.`super`.`Foundation`.`HANDLE`, `volumename` : `windows_sys`.`core`.`PCWSTR`, `infoblocks` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`JOBOBJECT_IO_RATE_CONTROL_INFORMATION`>>?, `infoblockcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetInformationJobObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetInformationJobObject`(`hjob` : `super`.`super`.`Foundation`.`HANDLE`, `jobobjectinformationclass` : `JOBOBJECTINFOCLASS`, `lpjobobjectinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbjobobjectinformationlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetIoRateControlInformationJobObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetIoRateControlInformationJobObject`(`hjob` : `super`.`super`.`Foundation`.`HANDLE`, `ioratecontrolinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`JOBOBJECT_IO_RATE_CONTROL_INFORMATION`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=TerminateJobObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TerminateJobObject`(`hjob` : `super`.`super`.`Foundation`.`HANDLE`, `uexitcode` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=UserHandleGrantAccess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UserHandleGrantAccess`(`huserhandle` : `super`.`super`.`Foundation`.`HANDLE`, `hjob` : `super`.`super`.`Foundation`.`HANDLE`, `bgrant` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
public typealias `JOBOBJECTINFOCLASS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JOBOBJECT_ASSOCIATE_COMPLETION_PORT` (
    public var `CompletionKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `CompletionPort`: `super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 24:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JOBOBJECT_ASSOCIATE_COMPLETION_PORT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JOBOBJECT_BASIC_ACCOUNTING_INFORMATION` (
    public var `TotalUserTime`: Long,
    public var `TotalKernelTime`: Long,
    public var `ThisPeriodTotalUserTime`: Long,
    public var `ThisPeriodTotalKernelTime`: Long,
    public var `TotalPageFaultCount`: UInt,
    public var `TotalProcesses`: UInt,
    public var `ActiveProcesses`: UInt,
    public var `TotalTerminatedProcesses`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Threading")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JOBOBJECT_BASIC_AND_IO_ACCOUNTING_INFORMATION` (
    public var `BasicInfo`: `JOBOBJECT_BASIC_ACCOUNTING_INFORMATION`,
    public var `IoInfo`: `super`.`Threading`.`IO_COUNTERS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JOBOBJECT_BASIC_LIMIT_INFORMATION` (
    public var `PerProcessUserTimeLimit`: Long,
    public var `PerJobUserTimeLimit`: Long,
    public var `LimitFlags`: `JOB_OBJECT_LIMIT`,
    public var `MinimumWorkingSetSize`: ULong,
    public var `MaximumWorkingSetSize`: ULong,
    public var `ActiveProcessLimit`: UInt,
    public var `Affinity`: ULong,
    public var `PriorityClass`: UInt,
    public var `SchedulingClass`: UInt,
)
// UNSUPPORTED Rust 61:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct JOBOBJECT_BASIC_PROCESS_ID_LIST {
//     pub NumberOfAssignedProcesses: u32,
//     pub NumberOfProcessIdsInList: u32,
//     pub ProcessIdList: [usize; 1],
// }

// UNSUPPORTED Rust 68:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JOBOBJECT_BASIC_PROCESS_ID_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JOBOBJECT_BASIC_UI_RESTRICTIONS` (
    public var `UIRestrictionsClass`: `JOB_OBJECT_UILIMIT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JOBOBJECT_CPU_RATE_CONTROL_INFORMATION` (
    public var `ControlFlags`: `JOB_OBJECT_CPU_RATE_CONTROL`,
    public var `Anonymous`: `JOBOBJECT_CPU_RATE_CONTROL_INFORMATION_0`,
)
// UNSUPPORTED Rust 84:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JOBOBJECT_CPU_RATE_CONTROL_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 89:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JOBOBJECT_CPU_RATE_CONTROL_INFORMATION_0 {
//     pub CpuRate: u32,
//     pub Weight: u32,
//     pub Anonymous: JOBOBJECT_CPU_RATE_CONTROL_INFORMATION_0_0,
// }

// UNSUPPORTED Rust 96:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JOBOBJECT_CPU_RATE_CONTROL_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JOBOBJECT_CPU_RATE_CONTROL_INFORMATION_0_0` (
    public var `MinRate`: UShort,
    public var `MaxRate`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JOBOBJECT_END_OF_JOB_TIME_INFORMATION` (
    public var `EndOfJobTimeAction`: `JOB_OBJECT_TERMINATE_AT_END_ACTION`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Threading")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JOBOBJECT_EXTENDED_LIMIT_INFORMATION` (
    public var `BasicLimitInformation`: `JOBOBJECT_BASIC_LIMIT_INFORMATION`,
    public var `IoInfo`: `super`.`Threading`.`IO_COUNTERS`,
    public var `ProcessMemoryLimit`: ULong,
    public var `JobMemoryLimit`: ULong,
    public var `PeakProcessMemoryUsed`: ULong,
    public var `PeakJobMemoryUsed`: ULong,
)
public const val `JOBOBJECT_IO_ATTRIBUTION_CONTROL_DISABLE`: `JOBOBJECT_IO_ATTRIBUTION_CONTROL_FLAGS` = 2;
public const val `JOBOBJECT_IO_ATTRIBUTION_CONTROL_ENABLE`: `JOBOBJECT_IO_ATTRIBUTION_CONTROL_FLAGS` = 1;
public typealias `JOBOBJECT_IO_ATTRIBUTION_CONTROL_FLAGS` = Int;
public const val `JOBOBJECT_IO_ATTRIBUTION_CONTROL_VALID_FLAGS`: `JOBOBJECT_IO_ATTRIBUTION_CONTROL_FLAGS` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JOBOBJECT_IO_ATTRIBUTION_INFORMATION` (
    public var `ControlFlags`: UInt,
    public var `ReadStats`: `JOBOBJECT_IO_ATTRIBUTION_STATS`,
    public var `WriteStats`: `JOBOBJECT_IO_ATTRIBUTION_STATS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JOBOBJECT_IO_ATTRIBUTION_STATS` (
    public var `IoCount`: ULong,
    public var `TotalNonOverlappedQueueTime`: ULong,
    public var `TotalNonOverlappedServiceTime`: ULong,
    public var `TotalSize`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JOBOBJECT_IO_RATE_CONTROL_INFORMATION` (
    public var `MaxIops`: Long,
    public var `MaxBandwidth`: Long,
    public var `ReservationIops`: Long,
    public var `VolumeName`: `windows_sys`.`core`.`PCWSTR`,
    public var `BaseIoSize`: UInt,
    public var `ControlFlags`: UInt,
)
// UNSUPPORTED Rust 152:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JOBOBJECT_IO_RATE_CONTROL_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V1` (
    public var `MaxIops`: Long,
    public var `MaxBandwidth`: Long,
    public var `ReservationIops`: Long,
    public var `VolumeName`: `windows_sys`.`core`.`PWSTR`,
    public var `BaseIoSize`: UInt,
    public var `ControlFlags`: `JOB_OBJECT_IO_RATE_CONTROL_FLAGS`,
    public var `VolumeNameLength`: UShort,
)
// UNSUPPORTED Rust 168:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V2` (
    public var `MaxIops`: Long,
    public var `MaxBandwidth`: Long,
    public var `ReservationIops`: Long,
    public var `VolumeName`: `windows_sys`.`core`.`PWSTR`,
    public var `BaseIoSize`: UInt,
    public var `ControlFlags`: `JOB_OBJECT_IO_RATE_CONTROL_FLAGS`,
    public var `VolumeNameLength`: UShort,
    public var `CriticalReservationIops`: Long,
    public var `ReservationBandwidth`: Long,
    public var `CriticalReservationBandwidth`: Long,
    public var `MaxTimePercent`: Long,
    public var `ReservationTimePercent`: Long,
    public var `CriticalReservationTimePercent`: Long,
)
// UNSUPPORTED Rust 190:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3` (
    public var `MaxIops`: Long,
    public var `MaxBandwidth`: Long,
    public var `ReservationIops`: Long,
    public var `VolumeName`: `windows_sys`.`core`.`PWSTR`,
    public var `BaseIoSize`: UInt,
    public var `ControlFlags`: `JOB_OBJECT_IO_RATE_CONTROL_FLAGS`,
    public var `VolumeNameLength`: UShort,
    public var `CriticalReservationIops`: Long,
    public var `ReservationBandwidth`: Long,
    public var `CriticalReservationBandwidth`: Long,
    public var `MaxTimePercent`: Long,
    public var `ReservationTimePercent`: Long,
    public var `CriticalReservationTimePercent`: Long,
    public var `SoftMaxIops`: Long,
    public var `SoftMaxBandwidth`: Long,
    public var `SoftMaxTimePercent`: Long,
    public var `LimitExcessNotifyIops`: Long,
    public var `LimitExcessNotifyBandwidth`: Long,
    public var `LimitExcessNotifyTimePercent`: Long,
)
// UNSUPPORTED Rust 218:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JOBOBJECT_JOBSET_INFORMATION` (
    public var `MemberLevel`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JOBOBJECT_LIMIT_VIOLATION_INFORMATION` (
    public var `LimitFlags`: `JOB_OBJECT_LIMIT`,
    public var `ViolationLimitFlags`: `JOB_OBJECT_LIMIT`,
    public var `IoReadBytes`: ULong,
    public var `IoReadBytesLimit`: ULong,
    public var `IoWriteBytes`: ULong,
    public var `IoWriteBytesLimit`: ULong,
    public var `PerJobUserTime`: Long,
    public var `PerJobUserTimeLimit`: Long,
    public var `JobMemory`: ULong,
    public var `JobMemoryLimit`: ULong,
    public var `RateControlTolerance`: `JOBOBJECT_RATE_CONTROL_TOLERANCE`,
    public var `RateControlToleranceLimit`: `JOBOBJECT_RATE_CONTROL_TOLERANCE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2` (
    public var `LimitFlags`: `JOB_OBJECT_LIMIT`,
    public var `ViolationLimitFlags`: `JOB_OBJECT_LIMIT`,
    public var `IoReadBytes`: ULong,
    public var `IoReadBytesLimit`: ULong,
    public var `IoWriteBytes`: ULong,
    public var `IoWriteBytesLimit`: ULong,
    public var `PerJobUserTime`: Long,
    public var `PerJobUserTimeLimit`: Long,
    public var `JobMemory`: ULong,
    public var `Anonymous1`: `JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_0`,
    public var `Anonymous2`: `JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_1`,
    public var `Anonymous3`: `JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_2`,
    public var `JobLowMemoryLimit`: ULong,
    public var `IoRateControlTolerance`: `JOBOBJECT_RATE_CONTROL_TOLERANCE`,
    public var `IoRateControlToleranceLimit`: `JOBOBJECT_RATE_CONTROL_TOLERANCE`,
    public var `NetRateControlTolerance`: `JOBOBJECT_RATE_CONTROL_TOLERANCE`,
    public var `NetRateControlToleranceLimit`: `JOBOBJECT_RATE_CONTROL_TOLERANCE`,
)
// UNSUPPORTED Rust 265:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 270:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_0 {
//     pub JobHighMemoryLimit: u64,
//     pub JobMemoryLimit: u64,
// }

// UNSUPPORTED Rust 276:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 281:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_1 {
//     pub RateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE,
//     pub CpuRateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE,
// }

// UNSUPPORTED Rust 287:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 292:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_2 {
//     pub RateControlToleranceLimit: JOBOBJECT_RATE_CONTROL_TOLERANCE,
//     pub CpuRateControlToleranceLimit: JOBOBJECT_RATE_CONTROL_TOLERANCE,
// }

// UNSUPPORTED Rust 298:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JOBOBJECT_NET_RATE_CONTROL_INFORMATION` (
    public var `MaxBandwidth`: ULong,
    public var `ControlFlags`: `JOB_OBJECT_NET_RATE_CONTROL_FLAGS`,
    public var `DscpTag`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION` (
    public var `IoReadBytesLimit`: ULong,
    public var `IoWriteBytesLimit`: ULong,
    public var `PerJobUserTimeLimit`: Long,
    public var `JobMemoryLimit`: ULong,
    public var `RateControlTolerance`: `JOBOBJECT_RATE_CONTROL_TOLERANCE`,
    public var `RateControlToleranceInterval`: `JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL`,
    public var `LimitFlags`: `JOB_OBJECT_LIMIT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2` (
    public var `IoReadBytesLimit`: ULong,
    public var `IoWriteBytesLimit`: ULong,
    public var `PerJobUserTimeLimit`: Long,
    public var `Anonymous1`: `JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_0`,
    public var `Anonymous2`: `JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_1`,
    public var `Anonymous3`: `JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_2`,
    public var `LimitFlags`: `JOB_OBJECT_LIMIT`,
    public var `IoRateControlTolerance`: `JOBOBJECT_RATE_CONTROL_TOLERANCE`,
    public var `JobLowMemoryLimit`: ULong,
    public var `IoRateControlToleranceInterval`: `JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL`,
    public var `NetRateControlTolerance`: `JOBOBJECT_RATE_CONTROL_TOLERANCE`,
    public var `NetRateControlToleranceInterval`: `JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL`,
)
// UNSUPPORTED Rust 337:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 342:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_0 {
//     pub JobHighMemoryLimit: u64,
//     pub JobMemoryLimit: u64,
// }

// UNSUPPORTED Rust 348:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 353:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_1 {
//     pub RateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE,
//     pub CpuRateControlTolerance: JOBOBJECT_RATE_CONTROL_TOLERANCE,
// }

// UNSUPPORTED Rust 359:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 364:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_2 {
//     pub RateControlToleranceInterval: JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL,
//     pub CpuRateControlToleranceInterval: JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL,
// }

// UNSUPPORTED Rust 370:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `JOBOBJECT_RATE_CONTROL_TOLERANCE` = Int;
public typealias `JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JOBOBJECT_SECURITY_LIMIT_INFORMATION` (
    public var `SecurityLimitFlags`: `JOB_OBJECT_SECURITY`,
    public var `JobToken`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `SidsToDisable`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`TOKEN_GROUPS`>?,
    public var `PrivilegesToDelete`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`TOKEN_PRIVILEGES`>?,
    public var `RestrictedSids`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`TOKEN_GROUPS`>?,
)
// UNSUPPORTED Rust 387:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JOB_SET_ARRAY` (
    public var `JobHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `MemberLevel`: UInt,
    public var `Flags`: UInt,
)
// UNSUPPORTED Rust 465:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
