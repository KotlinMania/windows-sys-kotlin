// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtQuerySystemInformation(systeminformationclass : SYSTEM_INFORMATION_CLASS, systeminformation : *mut core::ffi::c_void, systeminformationlength : u32, returnlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtQuerySystemTime(systemtime : *mut i64) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtQueryTimerResolution(maximumtime : *mut u32, minimumtime : *mut u32, currenttime : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwQuerySystemInformation(systeminformationclass : SYSTEM_INFORMATION_CLASS, systeminformation : *mut core::ffi::c_void, systeminformationlength : u32, returnlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwQuerySystemTime(systemtime : *mut i64) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwQueryTimerResolution(maximumtime : *mut u32, minimumtime : *mut u32, currenttime : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

public typealias `SYSTEM_INFORMATION_CLASS` = Int;
public const val `SystemBasicInformation`: `SYSTEM_INFORMATION_CLASS` = 0;
public const val `SystemCodeIntegrityInformation`: `SYSTEM_INFORMATION_CLASS` = 103;
public const val `SystemExceptionInformation`: `SYSTEM_INFORMATION_CLASS` = 33;
public const val `SystemInterruptInformation`: `SYSTEM_INFORMATION_CLASS` = 23;
public const val `SystemLookasideInformation`: `SYSTEM_INFORMATION_CLASS` = 45;
public const val `SystemPerformanceInformation`: `SYSTEM_INFORMATION_CLASS` = 2;
public const val `SystemPolicyInformation`: `SYSTEM_INFORMATION_CLASS` = 134;
public const val `SystemProcessInformation`: `SYSTEM_INFORMATION_CLASS` = 5;
public const val `SystemProcessorPerformanceInformation`: `SYSTEM_INFORMATION_CLASS` = 8;
public const val `SystemRegistryQuotaInformation`: `SYSTEM_INFORMATION_CLASS` = 37;
public const val `SystemTimeOfDayInformation`: `SYSTEM_INFORMATION_CLASS` = 3;
