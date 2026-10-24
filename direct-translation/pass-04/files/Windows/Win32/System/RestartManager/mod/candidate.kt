// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rstrtmgr.dll, ABI=system, export=RmAddFilter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RmAddFilter`(`dwsessionhandle` : UInt, `strmodulename` : `windows_sys`.`core`.`PCWSTR`, `pprocess` : /* Rust *const */ kotlinx.cinterop.CPointer<`RM_UNIQUE_PROCESS`>?, `strserviceshortname` : `windows_sys`.`core`.`PCWSTR`, `filteraction` : `RM_FILTER_ACTION`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rstrtmgr.dll, ABI=system, export=RmCancelCurrentTask; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RmCancelCurrentTask`(`dwsessionhandle` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rstrtmgr.dll, ABI=system, export=RmEndSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RmEndSession`(`dwsessionhandle` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rstrtmgr.dll, ABI=system, export=RmGetFilterList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RmGetFilterList`(`dwsessionhandle` : UInt, `pbfilterbuf` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbfilterbuf` : UInt, `cbfilterbufneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rstrtmgr.dll, ABI=system, export=RmGetList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RmGetList`(`dwsessionhandle` : UInt, `pnprocinfoneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pnprocinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `rgaffectedapps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RM_PROCESS_INFO`>?, `lpdwrebootreasons` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rstrtmgr.dll, ABI=system, export=RmJoinSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RmJoinSession`(`psessionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `strsessionkey` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rstrtmgr.dll, ABI=system, export=RmRegisterResources; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RmRegisterResources`(`dwsessionhandle` : UInt, `nfiles` : UInt, `rgsfilenames` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `napplications` : UInt, `rgapplications` : /* Rust *const */ kotlinx.cinterop.CPointer<`RM_UNIQUE_PROCESS`>?, `nservices` : UInt, `rgsservicenames` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rstrtmgr.dll, ABI=system, export=RmRemoveFilter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RmRemoveFilter`(`dwsessionhandle` : UInt, `strmodulename` : `windows_sys`.`core`.`PCWSTR`, `pprocess` : /* Rust *const */ kotlinx.cinterop.CPointer<`RM_UNIQUE_PROCESS`>?, `strserviceshortname` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rstrtmgr.dll, ABI=system, export=RmRestart; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RmRestart`(`dwsessionhandle` : UInt, `dwrestartflags` : UInt, `fnstatus` : `RM_WRITE_STATUS_CALLBACK`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rstrtmgr.dll, ABI=system, export=RmShutdown; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RmShutdown`(`dwsessionhandle` : UInt, `lactionflags` : UInt, `fnstatus` : `RM_WRITE_STATUS_CALLBACK`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rstrtmgr.dll, ABI=system, export=RmStartSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RmStartSession`(`psessionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwsessionflags` : UInt, `strsessionkey` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
public const val `CCH_RM_MAX_APP_NAME`: UInt = 255u;
public const val `CCH_RM_MAX_SVC_NAME`: UInt = 63u;
public const val `CCH_RM_SESSION_KEY`: UInt = 32u;
public typealias `RM_APP_STATUS` = Int;
public typealias `RM_APP_TYPE` = Int;
public typealias `RM_FILTER_ACTION` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RM_FILTER_INFO` (
    public var `FilterAction`: `RM_FILTER_ACTION`,
    public var `FilterTrigger`: `RM_FILTER_TRIGGER`,
    public var `cbNextOffset`: UInt,
    public var `Anonymous`: `RM_FILTER_INFO_0`,
)
// UNSUPPORTED Rust 26:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RM_FILTER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 31:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RM_FILTER_INFO_0 {
//     pub strFilename: windows_sys::core::PWSTR,
//     pub Process: RM_UNIQUE_PROCESS,
//     pub strServiceShortName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 38:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RM_FILTER_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RM_FILTER_TRIGGER` = Int;
public const val `RM_INVALID_PROCESS`: Int = -1;
public const val `RM_INVALID_TS_SESSION`: Int = -1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RM_PROCESS_INFO` (
    public var `Process`: `RM_UNIQUE_PROCESS`,
    public var `strAppName`: UShortArray,
    public var `strServiceShortName`: UShortArray,
    public var `ApplicationType`: `RM_APP_TYPE`,
    public var `AppStatus`: UInt,
    public var `TSSessionId`: UInt,
    public var `bRestartable`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 57:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RM_PROCESS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RM_REBOOT_REASON` = Int;
public typealias `RM_SHUTDOWN_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RM_UNIQUE_PROCESS` (
    public var `dwProcessId`: UInt,
    public var `ProcessStartTime`: `super`.`super`.`Foundation`.`FILETIME`,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RM_WRITE_STATUS_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt) -> Unit>>>;
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
