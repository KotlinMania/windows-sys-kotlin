// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtQuerySystemInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtQuerySystemInformation`(`systeminformationclass` : `SYSTEM_INFORMATION_CLASS`, `systeminformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `systeminformationlength` : UInt, `returnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtQuerySystemTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtQuerySystemTime`(`systemtime` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtQueryTimerResolution; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtQueryTimerResolution`(`maximumtime` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `minimumtime` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `currenttime` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwQuerySystemInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwQuerySystemInformation`(`systeminformationclass` : `SYSTEM_INFORMATION_CLASS`, `systeminformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `systeminformationlength` : UInt, `returnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwQuerySystemTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwQuerySystemTime`(`systemtime` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwQueryTimerResolution; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwQueryTimerResolution`(`maximumtime` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `minimumtime` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `currenttime` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
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
