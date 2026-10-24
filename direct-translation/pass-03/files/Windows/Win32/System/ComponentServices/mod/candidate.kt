// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comsvcs.dll, ABI=system, export=CoCreateActivity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoCreateActivity`(`piunknown` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comsvcs.dll, ABI=system, export=CoEnterServiceDomain; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoEnterServiceDomain`(`pconfigobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CoGetDefaultContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `CoGetDefaultContext`(`apttype` : `super`.`Com`.`APTTYPE`, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comsvcs.dll, ABI=system, export=CoLeaveServiceDomain; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoLeaveServiceDomain`(`punkstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mtxdm.dll, ABI=C, export=GetDispenserManager; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDispenserManager`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comsvcs.dll, ABI=system, export=GetManagedExtensions; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetManagedExtensions`(`dwexts` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comsvcs.dll, ABI=system, export=MTSCreateActivity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MTSCreateActivity`(`riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comsvcs.dll, ABI=C, export=RecycleSurrogate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RecycleSurrogate`(`lreasoncode` : Int) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comsvcs.dll, ABI=C, export=SafeRef; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SafeRef`(`rid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `punk` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// UNSUPPORTED Rust 11:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct APPDATA {
//     pub m_idApp: u32,
//     pub m_szAppGuid: [u16; 40],
//     pub m_dwAppProcessId: u32,
//     pub m_AppStatistics: APPSTATISTICS,
// }

// UNSUPPORTED Rust 19:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for APPDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `APPSTATISTICS` (
    public var `m_cTotalCalls`: UInt,
    public var `m_cTotalInstances`: UInt,
    public var `m_cTotalClasses`: UInt,
    public var `m_cCallsPerSecond`: UInt,
)
public const val `APPTYPE_LIBRARY`: `COMPLUS_APPTYPE` = 0;
public const val `APPTYPE_SERVER`: `COMPLUS_APPTYPE` = 1;
public const val `APPTYPE_SWC`: `COMPLUS_APPTYPE` = 2;
public const val `APPTYPE_UNKNOWN`: `COMPLUS_APPTYPE` = -1;
// UNSUPPORTED Rust 36:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AppDomainHelper: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xef24f689_14f8_4d92_b4af_d7b1f0e70fd4);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ApplicationProcessRecycleInfo` (
    public var `IsRecyclable`: `windows_sys`.`core`.`BOOL`,
    public var `IsRecycled`: `windows_sys`.`core`.`BOOL`,
    public var `TimeRecycled`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `TimeToTerminate`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `RecycleReasonCode`: Int,
    public var `IsPendingRecycle`: `windows_sys`.`core`.`BOOL`,
    public var `HasAutomaticLifetimeRecycling`: `windows_sys`.`core`.`BOOL`,
    public var `TimeForAutomaticRecycling`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `MemoryLimitInKB`: UInt,
    public var `MemoryUsageInKBLastCheck`: UInt,
    public var `ActivationLimit`: UInt,
    public var `NumActivationsLastReported`: UInt,
    public var `CallLimit`: UInt,
    public var `NumCallsLastReported`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ApplicationProcessStatistics` (
    public var `NumCallsOutstanding`: UInt,
    public var `NumTrackedComponents`: UInt,
    public var `NumComponentInstances`: UInt,
    public var `AvgCallsPerSecond`: UInt,
    public var `Reserved1`: UInt,
    public var `Reserved2`: UInt,
    public var `Reserved3`: UInt,
    public var `Reserved4`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ApplicationProcessSummary` (
    public var `PartitionIdPrimaryApplication`: `windows_sys`.`core`.`GUID`,
    public var `ApplicationIdPrimaryApplication`: `windows_sys`.`core`.`GUID`,
    public var `ApplicationInstanceId`: `windows_sys`.`core`.`GUID`,
    public var `ProcessId`: UInt,
    public var `Type`: `COMPLUS_APPTYPE`,
    public var `ProcessExeName`: `windows_sys`.`core`.`PWSTR`,
    public var `IsService`: `windows_sys`.`core`.`BOOL`,
    public var `IsPaused`: `windows_sys`.`core`.`BOOL`,
    public var `IsRecycled`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 80:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ApplicationProcessSummary {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ApplicationSummary` (
    public var `ApplicationInstanceId`: `windows_sys`.`core`.`GUID`,
    public var `PartitionId`: `windows_sys`.`core`.`GUID`,
    public var `ApplicationId`: `windows_sys`.`core`.`GUID`,
    public var `Type`: `COMPLUS_APPTYPE`,
    public var `ApplicationName`: `windows_sys`.`core`.`PWSTR`,
    public var `NumTrackedComponents`: UInt,
    public var `NumComponentInstances`: UInt,
)
// UNSUPPORTED Rust 96:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ApplicationSummary {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `AutoSvcs_Error_Constants` = UInt;
// UNSUPPORTED Rust 102:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ByotServerEx: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecabb0aa_7f19_11d2_978e_0000f8757e2a);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CLSIDDATA` (
    public var `m_clsid`: `windows_sys`.`core`.`GUID`,
    public var `m_cReferences`: UInt,
    public var `m_cBound`: UInt,
    public var `m_cPooled`: UInt,
    public var `m_cInCall`: UInt,
    public var `m_dwRespTime`: UInt,
    public var `m_cCallsCompleted`: UInt,
    public var `m_cCallsFailed`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CLSIDDATA2` (
    public var `m_clsid`: `windows_sys`.`core`.`GUID`,
    public var `m_appid`: `windows_sys`.`core`.`GUID`,
    public var `m_partid`: `windows_sys`.`core`.`GUID`,
    public var `m_pwszAppName`: `windows_sys`.`core`.`PWSTR`,
    public var `m_pwszCtxName`: `windows_sys`.`core`.`PWSTR`,
    public var `m_eAppType`: `COMPLUS_APPTYPE`,
    public var `m_cReferences`: UInt,
    public var `m_cBound`: UInt,
    public var `m_cPooled`: UInt,
    public var `m_cInCall`: UInt,
    public var `m_dwRespTime`: UInt,
    public var `m_cCallsCompleted`: UInt,
    public var `m_cCallsFailed`: UInt,
)
// UNSUPPORTED Rust 132:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CLSIDDATA2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `COMAdmin32BitComponent`: `COMAdminComponentType` = 1;
public const val `COMAdmin64BitComponent`: `COMAdminComponentType` = 2;
public const val `COMAdminAccessChecksApplicationComponentLevel`: `COMAdminAccessChecksLevelOptions` = 1;
public const val `COMAdminAccessChecksApplicationLevel`: `COMAdminAccessChecksLevelOptions` = 0;
public typealias `COMAdminAccessChecksLevelOptions` = Int;
public const val `COMAdminActivationInproc`: `COMAdminActivationOptions` = 0;
public const val `COMAdminActivationLocal`: `COMAdminActivationOptions` = 1;
public typealias `COMAdminActivationOptions` = Int;
public typealias `COMAdminApplicationExportOptions` = Int;
public typealias `COMAdminApplicationInstallOptions` = Int;
public const val `COMAdminAuthenticationCall`: `COMAdminAuthenticationLevelOptions` = 3;
public const val `COMAdminAuthenticationCapabilitiesDynamicCloaking`: `COMAdminAuthenticationCapabilitiesOptions` = 64;
public const val `COMAdminAuthenticationCapabilitiesNone`: `COMAdminAuthenticationCapabilitiesOptions` = 0;
public typealias `COMAdminAuthenticationCapabilitiesOptions` = Int;
public const val `COMAdminAuthenticationCapabilitiesSecureReference`: `COMAdminAuthenticationCapabilitiesOptions` = 2;
public const val `COMAdminAuthenticationCapabilitiesStaticCloaking`: `COMAdminAuthenticationCapabilitiesOptions` = 32;
public const val `COMAdminAuthenticationConnect`: `COMAdminAuthenticationLevelOptions` = 2;
public const val `COMAdminAuthenticationDefault`: `COMAdminAuthenticationLevelOptions` = 0;
public const val `COMAdminAuthenticationIntegrity`: `COMAdminAuthenticationLevelOptions` = 5;
public typealias `COMAdminAuthenticationLevelOptions` = Int;
public const val `COMAdminAuthenticationNone`: `COMAdminAuthenticationLevelOptions` = 1;
public const val `COMAdminAuthenticationPacket`: `COMAdminAuthenticationLevelOptions` = 4;
public const val `COMAdminAuthenticationPrivacy`: `COMAdminAuthenticationLevelOptions` = 6;
// UNSUPPORTED Rust 160:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const COMAdminCatalog: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf618c514_dfb8_11d1_a2cf_00805fc79235);

// UNSUPPORTED Rust 161:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const COMAdminCatalogCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf618c516_dfb8_11d1_a2cf_00805fc79235);

// UNSUPPORTED Rust 162:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const COMAdminCatalogObject: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf618c515_dfb8_11d1_a2cf_00805fc79235);

public const val `COMAdminCompFlagAlreadyInstalled`: `COMAdminComponentFlags` = 16;
public const val `COMAdminCompFlagCOMPlusPropertiesFound`: `COMAdminComponentFlags` = 2;
public const val `COMAdminCompFlagInterfacesFound`: `COMAdminComponentFlags` = 8;
public const val `COMAdminCompFlagNotInApplication`: `COMAdminComponentFlags` = 32;
public const val `COMAdminCompFlagProxyFound`: `COMAdminComponentFlags` = 4;
public const val `COMAdminCompFlagTypeInfoFound`: `COMAdminComponentFlags` = 1;
public typealias `COMAdminComponentFlags` = Int;
public typealias `COMAdminComponentType` = Int;
public const val `COMAdminErrAlreadyInstalled`: `COMAdminErrorCodes` = -2146368508;
public const val `COMAdminErrAppDirNotFound`: `COMAdminErrorCodes` = -2146368481;
public const val `COMAdminErrAppFileReadFail`: `COMAdminErrorCodes` = -2146368504;
public const val `COMAdminErrAppFileVersion`: `COMAdminErrorCodes` = -2146368503;
public const val `COMAdminErrAppFileWriteFail`: `COMAdminErrorCodes` = -2146368505;
public const val `COMAdminErrAppNotRunning`: `COMAdminErrorCodes` = -2146367478;
public const val `COMAdminErrApplicationExists`: `COMAdminErrorCodes` = -2146368501;
public const val `COMAdminErrApplidMatchesClsid`: `COMAdminErrorCodes` = -2146368442;
public const val `COMAdminErrAuthenticationLevel`: `COMAdminErrorCodes` = -2146368493;
public const val `COMAdminErrBadPath`: `COMAdminErrorCodes` = -2146368502;
public const val `COMAdminErrBadRegistryLibID`: `COMAdminErrorCodes` = -2146368482;
public const val `COMAdminErrBadRegistryProgID`: `COMAdminErrorCodes` = -2146368494;
public const val `COMAdminErrBasePartitionOnly`: `COMAdminErrorCodes` = -2146368432;
public const val `COMAdminErrCLSIDOrIIDMismatch`: `COMAdminErrorCodes` = -2146368488;
public const val `COMAdminErrCanNotExportAppProxy`: `COMAdminErrorCodes` = -2146368438;
public const val `COMAdminErrCanNotExportSystemApp`: `COMAdminErrorCodes` = -2146368436;
public const val `COMAdminErrCanNotStartApp`: `COMAdminErrorCodes` = -2146368437;
public const val `COMAdminErrCanNotSubscribeToComponent`: `COMAdminErrorCodes` = -2146368435;
public const val `COMAdminErrCannotCopyEventClass`: `COMAdminErrorCodes` = -2146367456;
public const val `COMAdminErrCantCopyFile`: `COMAdminErrorCodes` = -2146368499;
public const val `COMAdminErrCantRecycleLibraryApps`: `COMAdminErrorCodes` = -2146367473;
public const val `COMAdminErrCantRecycleServiceApps`: `COMAdminErrorCodes` = -2146367471;
public const val `COMAdminErrCatBitnessMismatch`: `COMAdminErrorCodes` = -2146368382;
public const val `COMAdminErrCatPauseResumeNotSupported`: `COMAdminErrorCodes` = -2146368379;
public const val `COMAdminErrCatServerFault`: `COMAdminErrorCodes` = -2146368378;
public const val `COMAdminErrCatUnacceptableBitness`: `COMAdminErrorCodes` = -2146368381;
public const val `COMAdminErrCatWrongAppBitnessBitness`: `COMAdminErrorCodes` = -2146368380;
public const val `COMAdminErrCoReqCompInstalled`: `COMAdminErrorCodes` = -2146368459;
public const val `COMAdminErrCompFileBadTLB`: `COMAdminErrorCodes` = -2146368472;
public const val `COMAdminErrCompFileClassNotAvail`: `COMAdminErrorCodes` = -2146368473;
public const val `COMAdminErrCompFileDoesNotExist`: `COMAdminErrorCodes` = -2146368476;
public const val `COMAdminErrCompFileGetClassObj`: `COMAdminErrorCodes` = -2146368474;
public const val `COMAdminErrCompFileLoadDLLFail`: `COMAdminErrorCodes` = -2146368475;
public const val `COMAdminErrCompFileNoRegistrar`: `COMAdminErrorCodes` = -2146368460;
public const val `COMAdminErrCompFileNotInstallable`: `COMAdminErrorCodes` = -2146368471;
public const val `COMAdminErrCompMoveBadDest`: `COMAdminErrorCodes` = -2146368466;
public const val `COMAdminErrCompMoveDest`: `COMAdminErrorCodes` = -2146367459;
public const val `COMAdminErrCompMoveLocked`: `COMAdminErrorCodes` = -2146368467;
public const val `COMAdminErrCompMovePrivate`: `COMAdminErrorCodes` = -2146367458;
public const val `COMAdminErrCompMoveSource`: `COMAdminErrorCodes` = -2146367460;
public const val `COMAdminErrComponentExists`: `COMAdminErrorCodes` = -2146368455;
public const val `COMAdminErrDllLoadFailed`: `COMAdminErrorCodes` = -2146368483;
public const val `COMAdminErrDllRegisterServer`: `COMAdminErrorCodes` = -2146368486;
public const val `COMAdminErrDuplicatePartitionName`: `COMAdminErrorCodes` = -2146368425;
public const val `COMAdminErrEventClassCannotBeSubscriber`: `COMAdminErrorCodes` = -2146368434;
public const val `COMAdminErrImportedComponentsNotAllowed`: `COMAdminErrorCodes` = -2146368421;
public const val `COMAdminErrInvalidPartition`: `COMAdminErrorCodes` = -2146367477;
public const val `COMAdminErrInvalidUserids`: `COMAdminErrorCodes` = -2146368496;
public const val `COMAdminErrKeyMissing`: `COMAdminErrorCodes` = -2146368509;
public const val `COMAdminErrLibAppProxyIncompatible`: `COMAdminErrorCodes` = -2146368433;
public const val `COMAdminErrMigSchemaNotFound`: `COMAdminErrorCodes` = -2146368383;
public const val `COMAdminErrMigVersionNotSupported`: `COMAdminErrorCodes` = -2146368384;
public const val `COMAdminErrNoRegistryCLSID`: `COMAdminErrorCodes` = -2146368495;
public const val `COMAdminErrNoServerShare`: `COMAdminErrorCodes` = -2146368485;
public const val `COMAdminErrNoUser`: `COMAdminErrorCodes` = -2146368497;
public const val `COMAdminErrNotChangeable`: `COMAdminErrorCodes` = -2146368470;
public const val `COMAdminErrNotDeletable`: `COMAdminErrorCodes` = -2146368469;
public const val `COMAdminErrNotInRegistry`: `COMAdminErrorCodes` = -2146368450;
public const val `COMAdminErrObjectDoesNotExist`: `COMAdminErrorCodes` = -2146367479;
public const val `COMAdminErrObjectErrors`: `COMAdminErrorCodes` = -2146368511;
public const val `COMAdminErrObjectExists`: `COMAdminErrorCodes` = -2146368456;
public const val `COMAdminErrObjectInvalid`: `COMAdminErrorCodes` = -2146368510;
public const val `COMAdminErrObjectNotPoolable`: `COMAdminErrorCodes` = -2146368449;
public const val `COMAdminErrObjectParentMissing`: `COMAdminErrorCodes` = -2146367480;
public const val `COMAdminErrPartitionInUse`: `COMAdminErrorCodes` = -2146368423;
public const val `COMAdminErrPartitionMsiOnly`: `COMAdminErrorCodes` = -2146367463;
public const val `COMAdminErrPausedProcessMayNotBeRecycled`: `COMAdminErrorCodes` = -2146367469;
public const val `COMAdminErrProcessAlreadyRecycled`: `COMAdminErrorCodes` = -2146367470;
public const val `COMAdminErrPropertyOverflow`: `COMAdminErrorCodes` = -2146368452;
public const val `COMAdminErrPropertySaveFailed`: `COMAdminErrorCodes` = -2146368457;
public const val `COMAdminErrQueuingServiceNotAvailable`: `COMAdminErrorCodes` = -2146367998;
public const val `COMAdminErrRegFileCorrupt`: `COMAdminErrorCodes` = -2146368453;
public const val `COMAdminErrRegdbAlreadyRunning`: `COMAdminErrorCodes` = -2146368395;
public const val `COMAdminErrRegdbNotInitialized`: `COMAdminErrorCodes` = -2146368398;
public const val `COMAdminErrRegdbNotOpen`: `COMAdminErrorCodes` = -2146368397;
public const val `COMAdminErrRegdbSystemErr`: `COMAdminErrorCodes` = -2146368396;
public const val `COMAdminErrRegisterTLB`: `COMAdminErrorCodes` = -2146368464;
public const val `COMAdminErrRegistrarFailed`: `COMAdminErrorCodes` = -2146368477;
public const val `COMAdminErrRemoteInterface`: `COMAdminErrorCodes` = -2146368487;
public const val `COMAdminErrRequiresDifferentPlatform`: `COMAdminErrorCodes` = -2146368439;
public const val `COMAdminErrRoleDoesNotExist`: `COMAdminErrorCodes` = -2146368441;
public const val `COMAdminErrRoleExists`: `COMAdminErrorCodes` = -2146368500;
public const val `COMAdminErrServiceNotInstalled`: `COMAdminErrorCodes` = -2146368458;
public const val `COMAdminErrSession`: `COMAdminErrorCodes` = -2146368468;
public const val `COMAdminErrStartAppDisabled`: `COMAdminErrorCodes` = -2146368431;
public const val `COMAdminErrStartAppNeedsComponents`: `COMAdminErrorCodes` = -2146368440;
public const val `COMAdminErrSystemApp`: `COMAdminErrorCodes` = -2146368461;
public const val `COMAdminErrUserPasswdNotValid`: `COMAdminErrorCodes` = -2146368492;
public typealias `COMAdminErrorCodes` = Int;
public const val `COMAdminExportApplicationProxy`: `COMAdminApplicationExportOptions` = 2;
public const val `COMAdminExportForceOverwriteOfFiles`: `COMAdminApplicationExportOptions` = 4;
public const val `COMAdminExportIn10Format`: `COMAdminApplicationExportOptions` = 16;
public const val `COMAdminExportNoUsers`: `COMAdminApplicationExportOptions` = 0;
public const val `COMAdminExportUsers`: `COMAdminApplicationExportOptions` = 1;
public const val `COMAdminFileFlagAlreadyInstalled`: `COMAdminFileFlags` = 512;
public const val `COMAdminFileFlagBadTLB`: `COMAdminFileFlags` = 1024;
public const val `COMAdminFileFlagCOM`: `COMAdminFileFlags` = 2;
public const val `COMAdminFileFlagClassNotAvailable`: `COMAdminFileFlags` = 4096;
public const val `COMAdminFileFlagContainsComp`: `COMAdminFileFlags` = 8;
public const val `COMAdminFileFlagContainsPS`: `COMAdminFileFlags` = 4;
public const val `COMAdminFileFlagContainsTLB`: `COMAdminFileFlags` = 16;
public const val `COMAdminFileFlagDLLRegsvrFailed`: `COMAdminFileFlags` = 32768;
public const val `COMAdminFileFlagDoesNotExist`: `COMAdminFileFlags` = 256;
public const val `COMAdminFileFlagError`: `COMAdminFileFlags` = 262144;
public const val `COMAdminFileFlagGetClassObjFailed`: `COMAdminFileFlags` = 2048;
public const val `COMAdminFileFlagLoadable`: `COMAdminFileFlags` = 1;
public const val `COMAdminFileFlagNoRegistrar`: `COMAdminFileFlags` = 16384;
public const val `COMAdminFileFlagRegTLBFailed`: `COMAdminFileFlags` = 65536;
public const val `COMAdminFileFlagRegistrar`: `COMAdminFileFlags` = 8192;
public const val `COMAdminFileFlagRegistrarFailed`: `COMAdminFileFlags` = 131072;
public const val `COMAdminFileFlagSelfReg`: `COMAdminFileFlags` = 32;
public const val `COMAdminFileFlagSelfUnReg`: `COMAdminFileFlags` = 64;
public const val `COMAdminFileFlagUnloadableDLL`: `COMAdminFileFlags` = 128;
public typealias `COMAdminFileFlags` = Int;
public const val `COMAdminImpersonationAnonymous`: `COMAdminImpersonationLevelOptions` = 1;
public const val `COMAdminImpersonationDelegate`: `COMAdminImpersonationLevelOptions` = 4;
public const val `COMAdminImpersonationIdentify`: `COMAdminImpersonationLevelOptions` = 2;
public const val `COMAdminImpersonationImpersonate`: `COMAdminImpersonationLevelOptions` = 3;
public typealias `COMAdminImpersonationLevelOptions` = Int;
public typealias `COMAdminInUse` = Int;
public const val `COMAdminInUseByCatalog`: `COMAdminInUse` = 1;
public const val `COMAdminInUseByRegistryClsid`: `COMAdminInUse` = 5;
public const val `COMAdminInUseByRegistryProxyStub`: `COMAdminInUse` = 3;
public const val `COMAdminInUseByRegistryTypeLib`: `COMAdminInUse` = 4;
public const val `COMAdminInUseByRegistryUnknown`: `COMAdminInUse` = 2;
public const val `COMAdminInstallForceOverwriteOfFiles`: `COMAdminApplicationInstallOptions` = 2;
public const val `COMAdminInstallNoUsers`: `COMAdminApplicationInstallOptions` = 0;
public const val `COMAdminInstallUsers`: `COMAdminApplicationInstallOptions` = 1;
public const val `COMAdminNotInUse`: `COMAdminInUse` = 0;
public typealias `COMAdminOS` = Int;
public const val `COMAdminOSNotInitialized`: `COMAdminOS` = 0;
public const val `COMAdminOSUnknown`: `COMAdminOS` = 6;
public const val `COMAdminOSWindows2000`: `COMAdminOS` = 3;
public const val `COMAdminOSWindows2000AdvancedServer`: `COMAdminOS` = 4;
public const val `COMAdminOSWindows2000Unknown`: `COMAdminOS` = 5;
public const val `COMAdminOSWindows3_1`: `COMAdminOS` = 1;
public const val `COMAdminOSWindows7DatacenterServer`: `COMAdminOS` = 27;
public const val `COMAdminOSWindows7EnterpriseServer`: `COMAdminOS` = 26;
public const val `COMAdminOSWindows7Personal`: `COMAdminOS` = 23;
public const val `COMAdminOSWindows7Professional`: `COMAdminOS` = 24;
public const val `COMAdminOSWindows7StandardServer`: `COMAdminOS` = 25;
public const val `COMAdminOSWindows7WebServer`: `COMAdminOS` = 28;
public const val `COMAdminOSWindows8DatacenterServer`: `COMAdminOS` = 33;
public const val `COMAdminOSWindows8EnterpriseServer`: `COMAdminOS` = 32;
public const val `COMAdminOSWindows8Personal`: `COMAdminOS` = 29;
public const val `COMAdminOSWindows8Professional`: `COMAdminOS` = 30;
public const val `COMAdminOSWindows8StandardServer`: `COMAdminOS` = 31;
public const val `COMAdminOSWindows8WebServer`: `COMAdminOS` = 34;
public const val `COMAdminOSWindows9x`: `COMAdminOS` = 2;
public const val `COMAdminOSWindowsBlueDatacenterServer`: `COMAdminOS` = 39;
public const val `COMAdminOSWindowsBlueEnterpriseServer`: `COMAdminOS` = 38;
public const val `COMAdminOSWindowsBluePersonal`: `COMAdminOS` = 35;
public const val `COMAdminOSWindowsBlueProfessional`: `COMAdminOS` = 36;
public const val `COMAdminOSWindowsBlueStandardServer`: `COMAdminOS` = 37;
public const val `COMAdminOSWindowsBlueWebServer`: `COMAdminOS` = 40;
public const val `COMAdminOSWindowsLonghornDatacenterServer`: `COMAdminOS` = 21;
public const val `COMAdminOSWindowsLonghornEnterpriseServer`: `COMAdminOS` = 20;
public const val `COMAdminOSWindowsLonghornPersonal`: `COMAdminOS` = 17;
public const val `COMAdminOSWindowsLonghornProfessional`: `COMAdminOS` = 18;
public const val `COMAdminOSWindowsLonghornStandardServer`: `COMAdminOS` = 19;
public const val `COMAdminOSWindowsLonghornWebServer`: `COMAdminOS` = 22;
public const val `COMAdminOSWindowsNETDatacenterServer`: `COMAdminOS` = 15;
public const val `COMAdminOSWindowsNETEnterpriseServer`: `COMAdminOS` = 14;
public const val `COMAdminOSWindowsNETStandardServer`: `COMAdminOS` = 13;
public const val `COMAdminOSWindowsNETWebServer`: `COMAdminOS` = 16;
public const val `COMAdminOSWindowsXPPersonal`: `COMAdminOS` = 11;
public const val `COMAdminOSWindowsXPProfessional`: `COMAdminOS` = 12;
public const val `COMAdminQCMessageAuthenticateOff`: `COMAdminQCMessageAuthenticateOptions` = 1;
public const val `COMAdminQCMessageAuthenticateOn`: `COMAdminQCMessageAuthenticateOptions` = 2;
public typealias `COMAdminQCMessageAuthenticateOptions` = Int;
public const val `COMAdminQCMessageAuthenticateSecureApps`: `COMAdminQCMessageAuthenticateOptions` = 0;
public const val `COMAdminServiceContinuePending`: `COMAdminServiceStatusOptions` = 4;
public const val `COMAdminServiceLoadBalanceRouter`: `COMAdminServiceOptions` = 1;
public typealias `COMAdminServiceOptions` = Int;
public const val `COMAdminServicePausePending`: `COMAdminServiceStatusOptions` = 5;
public const val `COMAdminServicePaused`: `COMAdminServiceStatusOptions` = 6;
public const val `COMAdminServiceRunning`: `COMAdminServiceStatusOptions` = 3;
public const val `COMAdminServiceStartPending`: `COMAdminServiceStatusOptions` = 1;
public typealias `COMAdminServiceStatusOptions` = Int;
public const val `COMAdminServiceStopPending`: `COMAdminServiceStatusOptions` = 2;
public const val `COMAdminServiceStopped`: `COMAdminServiceStatusOptions` = 0;
public const val `COMAdminServiceUnknownState`: `COMAdminServiceStatusOptions` = 7;
public const val `COMAdminSynchronizationIgnored`: `COMAdminSynchronizationOptions` = 0;
public const val `COMAdminSynchronizationNone`: `COMAdminSynchronizationOptions` = 1;
public typealias `COMAdminSynchronizationOptions` = Int;
public const val `COMAdminSynchronizationRequired`: `COMAdminSynchronizationOptions` = 3;
public const val `COMAdminSynchronizationRequiresNew`: `COMAdminSynchronizationOptions` = 4;
public const val `COMAdminSynchronizationSupported`: `COMAdminSynchronizationOptions` = 2;
public const val `COMAdminThreadingModelApartment`: `COMAdminThreadingModels` = 0;
public const val `COMAdminThreadingModelBoth`: `COMAdminThreadingModels` = 3;
public const val `COMAdminThreadingModelFree`: `COMAdminThreadingModels` = 1;
public const val `COMAdminThreadingModelMain`: `COMAdminThreadingModels` = 2;
public const val `COMAdminThreadingModelNeutral`: `COMAdminThreadingModels` = 4;
public const val `COMAdminThreadingModelNotSpecified`: `COMAdminThreadingModels` = 5;
public typealias `COMAdminThreadingModels` = Int;
public const val `COMAdminTransactionIgnored`: `COMAdminTransactionOptions` = 0;
public const val `COMAdminTransactionNone`: `COMAdminTransactionOptions` = 1;
public typealias `COMAdminTransactionOptions` = Int;
public const val `COMAdminTransactionRequired`: `COMAdminTransactionOptions` = 3;
public const val `COMAdminTransactionRequiresNew`: `COMAdminTransactionOptions` = 4;
public const val `COMAdminTransactionSupported`: `COMAdminTransactionOptions` = 2;
public const val `COMAdminTxIsolationLevelAny`: `COMAdminTxIsolationLevelOptions` = 0;
public typealias `COMAdminTxIsolationLevelOptions` = Int;
public const val `COMAdminTxIsolationLevelReadCommitted`: `COMAdminTxIsolationLevelOptions` = 2;
public const val `COMAdminTxIsolationLevelReadUnCommitted`: `COMAdminTxIsolationLevelOptions` = 1;
public const val `COMAdminTxIsolationLevelRepeatableRead`: `COMAdminTxIsolationLevelOptions` = 3;
public const val `COMAdminTxIsolationLevelSerializable`: `COMAdminTxIsolationLevelOptions` = 4;
// UNSUPPORTED Rust 378:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const COMEvents: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecabb0ab_7f19_11d2_978e_0000f8757e2a);

public typealias `COMPLUS_APPTYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COMSVCSEVENTINFO` (
    public var `cbSize`: UInt,
    public var `dwPid`: UInt,
    public var `lTime`: Long,
    public var `lMicroTime`: Int,
    public var `perfCount`: Long,
    public var `guidApp`: `windows_sys`.`core`.`GUID`,
    public var `sMachineName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 391:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COMSVCSEVENTINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 396:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CRMClerk: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecabb0bd_7f19_11d2_978e_0000f8757e2a);

public typealias `CRMFLAGS` = Int;
public const val `CRMFLAG_FORGETTARGET`: `CRMFLAGS` = 1;
public const val `CRMFLAG_REPLAYINPROGRESS`: `CRMFLAGS` = 64;
public const val `CRMFLAG_WRITTENDURINGABORT`: `CRMFLAGS` = 8;
public const val `CRMFLAG_WRITTENDURINGCOMMIT`: `CRMFLAGS` = 4;
public const val `CRMFLAG_WRITTENDURINGPREPARE`: `CRMFLAGS` = 2;
public const val `CRMFLAG_WRITTENDURINGRECOVERY`: `CRMFLAGS` = 16;
public const val `CRMFLAG_WRITTENDURINGREPLAY`: `CRMFLAGS` = 32;
public typealias `CRMREGFLAGS` = Int;
public const val `CRMREGFLAG_ABORTPHASE`: `CRMREGFLAGS` = 4;
public const val `CRMREGFLAG_ALLPHASES`: `CRMREGFLAGS` = 7;
public const val `CRMREGFLAG_COMMITPHASE`: `CRMREGFLAGS` = 2;
public const val `CRMREGFLAG_FAILIFINDOUBTSREMAIN`: `CRMREGFLAGS` = 16;
public const val `CRMREGFLAG_PREPAREPHASE`: `CRMREGFLAGS` = 1;
// UNSUPPORTED Rust 411:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CRMRecoveryClerk: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecabb0be_7f19_11d2_978e_0000f8757e2a);

public const val `CRR_ACTIVATION_LIMIT`: UInt = 4294967294u;
public const val `CRR_CALL_LIMIT`: UInt = 4294967293u;
public const val `CRR_LIFETIME_LIMIT`: UInt = 4294967295u;
public const val `CRR_MEMORY_LIMIT`: UInt = 4294967292u;
public const val `CRR_NO_REASON_SUPPLIED`: UInt = 0u;
public const val `CRR_RECYCLED_FROM_UI`: UInt = 4294967291u;
public const val `CSC_BindToPoolThread`: `CSC_Binding` = 1;
public typealias `CSC_Binding` = Int;
public typealias `CSC_COMTIIntrinsicsConfig` = Int;
public const val `CSC_CreateTransactionIfNecessary`: `CSC_TransactionConfig` = 2;
public const val `CSC_DontUseTracker`: `CSC_TrackerConfig` = 0;
public typealias `CSC_IISIntrinsicsConfig` = Int;
public const val `CSC_IfContainerIsSynchronized`: `CSC_SynchronizationConfig` = 1;
public const val `CSC_IfContainerIsTransactional`: `CSC_TransactionConfig` = 1;
public const val `CSC_Ignore`: `CSC_InheritanceConfig` = 1;
public const val `CSC_Inherit`: `CSC_InheritanceConfig` = 0;
public const val `CSC_InheritCOMTIIntrinsics`: `CSC_COMTIIntrinsicsConfig` = 1;
public const val `CSC_InheritIISIntrinsics`: `CSC_IISIntrinsicsConfig` = 1;
public const val `CSC_InheritPartition`: `CSC_PartitionConfig` = 1;
public const val `CSC_InheritSxs`: `CSC_SxsConfig` = 1;
public typealias `CSC_InheritanceConfig` = Int;
public const val `CSC_MTAThreadPool`: `CSC_ThreadPool` = 3;
public const val `CSC_NewPartition`: `CSC_PartitionConfig` = 2;
public const val `CSC_NewSxs`: `CSC_SxsConfig` = 2;
public const val `CSC_NewSynchronization`: `CSC_SynchronizationConfig` = 3;
public const val `CSC_NewSynchronizationIfNecessary`: `CSC_SynchronizationConfig` = 2;
public const val `CSC_NewTransaction`: `CSC_TransactionConfig` = 3;
public const val `CSC_NoBinding`: `CSC_Binding` = 0;
public const val `CSC_NoCOMTIIntrinsics`: `CSC_COMTIIntrinsicsConfig` = 0;
public const val `CSC_NoIISIntrinsics`: `CSC_IISIntrinsicsConfig` = 0;
public const val `CSC_NoPartition`: `CSC_PartitionConfig` = 0;
public const val `CSC_NoSxs`: `CSC_SxsConfig` = 0;
public const val `CSC_NoSynchronization`: `CSC_SynchronizationConfig` = 0;
public const val `CSC_NoTransaction`: `CSC_TransactionConfig` = 0;
public typealias `CSC_PartitionConfig` = Int;
public const val `CSC_STAThreadPool`: `CSC_ThreadPool` = 2;
public typealias `CSC_SxsConfig` = Int;
public typealias `CSC_SynchronizationConfig` = Int;
public typealias `CSC_ThreadPool` = Int;
public const val `CSC_ThreadPoolInherit`: `CSC_ThreadPool` = 1;
public const val `CSC_ThreadPoolNone`: `CSC_ThreadPool` = 0;
public typealias `CSC_TrackerConfig` = Int;
public typealias `CSC_TransactionConfig` = Int;
public const val `CSC_UseTracker`: `CSC_TrackerConfig` = 1;
// UNSUPPORTED Rust 456:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CServiceConfig: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecabb0c8_7f19_11d2_978e_0000f8757e2a);

// UNSUPPORTED Rust 457:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ClrAssemblyLocator: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x458aa3b5_265a_4b75_bc05_9bea4630cf18);

// UNSUPPORTED Rust 458:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CoMTSLocator: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecabb0ac_7f19_11d2_978e_0000f8757e2a);

// UNSUPPORTED Rust 459:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ComServiceEvents: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecabb0c3_7f19_11d2_978e_0000f8757e2a);

// UNSUPPORTED Rust 460:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ComSystemAppEventData: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecabb0c6_7f19_11d2_978e_0000f8757e2a);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ComponentHangMonitorInfo` (
    public var `IsMonitored`: `windows_sys`.`core`.`BOOL`,
    public var `TerminateOnHang`: `windows_sys`.`core`.`BOOL`,
    public var `AvgCallThresholdInMs`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ComponentStatistics` (
    public var `NumInstances`: UInt,
    public var `NumBoundReferences`: UInt,
    public var `NumPooledObjects`: UInt,
    public var `NumObjectsInCall`: UInt,
    public var `AvgResponseTimeInMs`: UInt,
    public var `NumCallsCompletedRecent`: UInt,
    public var `NumCallsFailedRecent`: UInt,
    public var `NumCallsCompletedTotal`: UInt,
    public var `NumCallsFailedTotal`: UInt,
    public var `Reserved1`: UInt,
    public var `Reserved2`: UInt,
    public var `Reserved3`: UInt,
    public var `Reserved4`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ComponentSummary` (
    public var `ApplicationInstanceId`: `windows_sys`.`core`.`GUID`,
    public var `PartitionId`: `windows_sys`.`core`.`GUID`,
    public var `ApplicationId`: `windows_sys`.`core`.`GUID`,
    public var `Clsid`: `windows_sys`.`core`.`GUID`,
    public var `ClassName`: `windows_sys`.`core`.`PWSTR`,
    public var `ApplicationName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 495:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ComponentSummary {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CrmLogRecordRead` (
    public var `dwCrmFlags`: UInt,
    public var `dwSequenceNumber`: UInt,
    public var `blobUserData`: `super`.`Com`.`BLOB`,
)
public typealias `CrmTransactionState` = Int;
public const val `DATA_NOT_AVAILABLE`: UInt = 4294967295u;
public typealias `DUMPTYPE` = Int;
public const val `DUMPTYPE_FULL`: `DUMPTYPE` = 0;
public const val `DUMPTYPE_MINI`: `DUMPTYPE` = 1;
public const val `DUMPTYPE_NONE`: `DUMPTYPE` = 2;
// UNSUPPORTED Rust 514:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DispenserManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecabb0c0_7f19_11d2_978e_0000f8757e2a);

// UNSUPPORTED Rust 515:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Dummy30040732: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecabb0a9_7f19_11d2_978e_0000f8757e2a);

// UNSUPPORTED Rust 516:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const EventServer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecabafbc_7f19_11d2_978e_0000f8757e2a);

public const val `GATD_INCLUDE_APPLICATION_NAME`: `GetAppTrackerDataFlags` = 16;
public const val `GATD_INCLUDE_CLASS_NAME`: `GetAppTrackerDataFlags` = 8;
public const val `GATD_INCLUDE_LIBRARY_APPS`: `GetAppTrackerDataFlags` = 2;
public const val `GATD_INCLUDE_PROCESS_EXE_NAME`: `GetAppTrackerDataFlags` = 1;
public const val `GATD_INCLUDE_SWC`: `GetAppTrackerDataFlags` = 4;
public const val `GUID_STRING_SIZE`: UInt = 40u;
public typealias `GetAppTrackerDataFlags` = Int;
// UNSUPPORTED Rust 524:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GetSecurityCallContextAppObject: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecabb0a8_7f19_11d2_978e_0000f8757e2a);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HANG_INFO` (
    public var `fAppHangMonitorEnabled`: `windows_sys`.`core`.`BOOL`,
    public var `fTerminateOnHang`: `windows_sys`.`core`.`BOOL`,
    public var `DumpType`: `DUMPTYPE`,
    public var `dwHangTimeout`: UInt,
    public var `dwDumpCount`: UInt,
    public var `dwInfoMsgCount`: UInt,
)
// UNSUPPORTED Rust 535:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LBEvents: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecabb0c1_7f19_11d2_978e_0000f8757e2a);

public const val `LockMethod`: `LockModes` = 1;
public typealias `LockModes` = Int;
public const val `LockSetGet`: `LockModes` = 0;
public const val `MTXDM_E_ENLISTRESOURCEFAILED`: UInt = 2147803392u;
// UNSUPPORTED Rust 540:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MessageMover: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecabb0bf_7f19_11d2_978e_0000f8757e2a);

// UNSUPPORTED Rust 541:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MtsGrp: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4b2e958d_0393_11d1_b1ab_00aa00ba3258);

// UNSUPPORTED Rust 542:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PoolMgr: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecabafb5_7f19_11d2_978e_0000f8757e2a);

public const val `Process`: `ReleaseModes` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RECYCLE_INFO` (
    public var `guidCombaseProcessIdentifier`: `windows_sys`.`core`.`GUID`,
    public var `ProcessStartTime`: Long,
    public var `dwRecycleLifetimeLimit`: UInt,
    public var `dwRecycleMemoryLimit`: UInt,
    public var `dwRecycleExpirationTimeout`: UInt,
)
public typealias `ReleaseModes` = Int;
// UNSUPPORTED Rust 554:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SecurityCallContext: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecabb0a7_7f19_11d2_978e_0000f8757e2a);

// UNSUPPORTED Rust 555:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SecurityCallers: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecabb0a6_7f19_11d2_978e_0000f8757e2a);

// UNSUPPORTED Rust 556:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SecurityIdentity: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecabb0a5_7f19_11d2_978e_0000f8757e2a);

// UNSUPPORTED Rust 557:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ServicePool: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecabb0c9_7f19_11d2_978e_0000f8757e2a);

// UNSUPPORTED Rust 558:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ServicePoolConfig: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecabb0ca_7f19_11d2_978e_0000f8757e2a);

// UNSUPPORTED Rust 559:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SharedProperty: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2a005c05_a5de_11cf_9e66_00aa00a3f464);

// UNSUPPORTED Rust 560:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SharedPropertyGroup: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2a005c0b_a5de_11cf_9e66_00aa00a3f464);

// UNSUPPORTED Rust 561:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SharedPropertyGroupManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2a005c11_a5de_11cf_9e66_00aa00a3f464);

public const val `Standard`: `ReleaseModes` = 0;
// UNSUPPORTED Rust 563:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const TRACKER_INIT_EVENT: windows_sys::core::PCWSTR = windows_sys::core::w!("Global\\COM+ Tracker Init Event");

// UNSUPPORTED Rust 564:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const TRACKER_STARTSTOP_EVENT: windows_sys::core::PCWSTR = windows_sys::core::w!("Global\\COM+ Tracker Push Event");

public typealias `TRACKING_COLL_TYPE` = Int;
public const val `TRKCOLL_APPLICATIONS`: `TRACKING_COLL_TYPE` = 1;
public const val `TRKCOLL_COMPONENTS`: `TRACKING_COLL_TYPE` = 2;
public const val `TRKCOLL_PROCESSES`: `TRACKING_COLL_TYPE` = 0;
// UNSUPPORTED Rust 569:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const TrackerServer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecabafb9_7f19_11d2_978e_0000f8757e2a);

// UNSUPPORTED Rust 570:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const TransactionContext: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7999fc25_d3c6_11cf_acab_00a024a55aef);

// UNSUPPORTED Rust 571:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const TransactionContextEx: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5cb66670_d3d4_11cf_acab_00a024a55aef);

public typealias `TransactionVote` = Int;
public const val `TxAbort`: `TransactionVote` = 1;
public const val `TxCommit`: `TransactionVote` = 0;
public const val `TxState_Aborted`: `CrmTransactionState` = 2;
public const val `TxState_Active`: `CrmTransactionState` = 0;
public const val `TxState_Committed`: `CrmTransactionState` = 1;
public const val `TxState_Indoubt`: `CrmTransactionState` = 3;
public const val `comQCErrApplicationNotQueued`: `AutoSvcs_Error_Constants` = 2148599296u;
public const val `comQCErrNoQueueableInterfaces`: `AutoSvcs_Error_Constants` = 2148599297u;
public const val `comQCErrQueueTransactMismatch`: `AutoSvcs_Error_Constants` = 2148599299u;
public const val `comQCErrQueuingServiceNotAvailable`: `AutoSvcs_Error_Constants` = 2148599298u;
public const val `comqcErrBadMarshaledObject`: `AutoSvcs_Error_Constants` = 2148599382u;
public const val `comqcErrInvalidMessage`: `AutoSvcs_Error_Constants` = 2148599376u;
public const val `comqcErrMarshaledObjSameTxn`: `AutoSvcs_Error_Constants` = 2148599304u;
public const val `comqcErrMsgNotAuthenticated`: `AutoSvcs_Error_Constants` = 2148599380u;
public const val `comqcErrMsmqConnectorUsed`: `AutoSvcs_Error_Constants` = 2148599381u;
public const val `comqcErrMsmqServiceUnavailable`: `AutoSvcs_Error_Constants` = 2148599379u;
public const val `comqcErrMsmqSidUnavailable`: `AutoSvcs_Error_Constants` = 2148599377u;
public const val `comqcErrOutParam`: `AutoSvcs_Error_Constants` = 2148599301u;
public const val `comqcErrPSLoad`: `AutoSvcs_Error_Constants` = 2148599303u;
public const val `comqcErrRecorderMarshalled`: `AutoSvcs_Error_Constants` = 2148599300u;
public const val `comqcErrRecorderNotTrusted`: `AutoSvcs_Error_Constants` = 2148599302u;
public const val `comqcErrWrongMsgExtension`: `AutoSvcs_Error_Constants` = 2148599378u;
public const val `mtsErrCtxAborted`: `AutoSvcs_Error_Constants` = 2147803138u;
public const val `mtsErrCtxAborting`: `AutoSvcs_Error_Constants` = 2147803139u;
public const val `mtsErrCtxNoContext`: `AutoSvcs_Error_Constants` = 2147803140u;
public const val `mtsErrCtxNoSecurity`: `AutoSvcs_Error_Constants` = 2147803149u;
public const val `mtsErrCtxNotRegistered`: `AutoSvcs_Error_Constants` = 2147803141u;
public const val `mtsErrCtxOldReference`: `AutoSvcs_Error_Constants` = 2147803143u;
public const val `mtsErrCtxRoleNotFound`: `AutoSvcs_Error_Constants` = 2147803148u;
public const val `mtsErrCtxSynchTimeout`: `AutoSvcs_Error_Constants` = 2147803142u;
public const val `mtsErrCtxTMNotAvailable`: `AutoSvcs_Error_Constants` = 2147803151u;
public const val `mtsErrCtxWrongThread`: `AutoSvcs_Error_Constants` = 2147803150u;
