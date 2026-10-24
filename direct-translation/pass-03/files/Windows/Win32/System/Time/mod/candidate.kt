// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EnumDynamicTimeZoneInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumDynamicTimeZoneInformation`(`dwindex` : UInt, `lptimezoneinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DYNAMIC_TIME_ZONE_INFORMATION`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FileTimeToSystemTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FileTimeToSystemTime`(`lpfiletime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `lpsystemtime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetDynamicTimeZoneInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDynamicTimeZoneInformation`(`ptimezoneinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DYNAMIC_TIME_ZONE_INFORMATION`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetDynamicTimeZoneInformationEffectiveYears; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDynamicTimeZoneInformationEffectiveYears`(`lptimezoneinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`DYNAMIC_TIME_ZONE_INFORMATION`>?, `firstyear` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lastyear` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetTimeZoneInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTimeZoneInformation`(`lptimezoneinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TIME_ZONE_INFORMATION`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetTimeZoneInformationForYear; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTimeZoneInformationForYear`(`wyear` : UShort, `pdtzi` : /* Rust *const */ kotlinx.cinterop.CPointer<`DYNAMIC_TIME_ZONE_INFORMATION`>?, `ptzi` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TIME_ZONE_INFORMATION`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LocalFileTimeToLocalSystemTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LocalFileTimeToLocalSystemTime`(`timezoneinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`TIME_ZONE_INFORMATION`>?, `localfiletime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `localsystemtime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LocalSystemTimeToLocalFileTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LocalSystemTimeToLocalFileTime`(`timezoneinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`TIME_ZONE_INFORMATION`>?, `localsystemtime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?, `localfiletime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetDynamicTimeZoneInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetDynamicTimeZoneInformation`(`lptimezoneinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`DYNAMIC_TIME_ZONE_INFORMATION`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetTimeZoneInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetTimeZoneInformation`(`lptimezoneinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`TIME_ZONE_INFORMATION`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SystemTimeToFileTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SystemTimeToFileTime`(`lpsystemtime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?, `lpfiletime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SystemTimeToTzSpecificLocalTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SystemTimeToTzSpecificLocalTime`(`lptimezoneinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`TIME_ZONE_INFORMATION`>?, `lpuniversaltime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?, `lplocaltime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SystemTimeToTzSpecificLocalTimeEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SystemTimeToTzSpecificLocalTimeEx`(`lptimezoneinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`DYNAMIC_TIME_ZONE_INFORMATION`>?, `lpuniversaltime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?, `lplocaltime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=TzSpecificLocalTimeToSystemTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TzSpecificLocalTimeToSystemTime`(`lptimezoneinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`TIME_ZONE_INFORMATION`>?, `lplocaltime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?, `lpuniversaltime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=TzSpecificLocalTimeToSystemTimeEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TzSpecificLocalTimeToSystemTimeEx`(`lptimezoneinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`DYNAMIC_TIME_ZONE_INFORMATION`>?, `lplocaltime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?, `lpuniversaltime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?) : `windows_sys`.`core`.`BOOL`
// UNSUPPORTED Rust 16:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DYNAMIC_TIME_ZONE_INFORMATION {
//     pub Bias: i32,
//     pub StandardName: [u16; 32],
//     pub StandardDate: super::super::Foundation::SYSTEMTIME,
//     pub StandardBias: i32,
//     pub DaylightName: [u16; 32],
//     pub DaylightDate: super::super::Foundation::SYSTEMTIME,
//     pub DaylightBias: i32,
//     pub TimeZoneKeyName: [u16; 128],
//     pub DynamicDaylightTimeDisabled: bool,
// }

// UNSUPPORTED Rust 29:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DYNAMIC_TIME_ZONE_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TIME_ZONE_ID_INVALID`: UInt = 4294967295u;
// UNSUPPORTED Rust 35:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TIME_ZONE_INFORMATION {
//     pub Bias: i32,
//     pub StandardName: [u16; 32],
//     pub StandardDate: super::super::Foundation::SYSTEMTIME,
//     pub StandardBias: i32,
//     pub DaylightName: [u16; 32],
//     pub DaylightDate: super::super::Foundation::SYSTEMTIME,
//     pub DaylightBias: i32,
// }

// UNSUPPORTED Rust 46:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TIME_ZONE_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TSF_Authenticated`: UInt = 2u;
public const val `TSF_Hardware`: UInt = 1u;
public const val `TSF_IPv6`: UInt = 4u;
public const val `TSF_SignatureAuthenticated`: UInt = 8u;
// UNSUPPORTED Rust 55:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const wszW32TimeRegKeyPolicyTimeProviders: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Policies\\Microsoft\\W32Time\\TimeProviders");

// UNSUPPORTED Rust 56:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const wszW32TimeRegKeyTimeProviders: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Services\\W32Time\\TimeProviders");

// UNSUPPORTED Rust 57:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const wszW32TimeRegValueDllName: windows_sys::core::PCWSTR = windows_sys::core::w!("DllName");

// UNSUPPORTED Rust 58:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const wszW32TimeRegValueEnabled: windows_sys::core::PCWSTR = windows_sys::core::w!("Enabled");

// UNSUPPORTED Rust 59:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const wszW32TimeRegValueInputProvider: windows_sys::core::PCWSTR = windows_sys::core::w!("InputProvider");

// UNSUPPORTED Rust 60:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const wszW32TimeRegValueMetaDataProvider: windows_sys::core::PCWSTR = windows_sys::core::w!("MetaDataProvider");

