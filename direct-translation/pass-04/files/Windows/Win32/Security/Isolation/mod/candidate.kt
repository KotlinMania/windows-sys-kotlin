// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=CreateAppContainerProfile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateAppContainerProfile`(`pszappcontainername` : `windows_sys`.`core`.`PCWSTR`, `pszdisplayname` : `windows_sys`.`core`.`PCWSTR`, `pszdescription` : `windows_sys`.`core`.`PCWSTR`, `pcapabilities` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`SID_AND_ATTRIBUTES`>?, `dwcapabilitycount` : UInt, `ppsidappcontainersid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`PSID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=DeleteAppContainerProfile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteAppContainerProfile`(`pszappcontainername` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=DeriveAppContainerSidFromAppContainerName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeriveAppContainerSidFromAppContainerName`(`pszappcontainername` : `windows_sys`.`core`.`PCWSTR`, `ppsidappcontainersid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`PSID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=DeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName`(`psidappcontainersid` : `super`.`PSID`, `pszrestrictedappcontainername` : `windows_sys`.`core`.`PCWSTR`, `ppsidrestrictedappcontainersid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`PSID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=GetAppContainerFolderPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetAppContainerFolderPath`(`pszappcontainersid` : `windows_sys`.`core`.`PCWSTR`, `ppszpath` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetAppContainerNamedObjectPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetAppContainerNamedObjectPath`(`token` : `super`.`super`.`Foundation`.`HANDLE`, `appcontainersid` : `super`.`PSID`, `objectpathlength` : UInt, `objectpath` : `windows_sys`.`core`.`PWSTR`, `returnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=GetAppContainerRegistryLocation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `GetAppContainerRegistryLocation`(`desiredaccess` : UInt, `phappcontainerkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Registry`.`HKEY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=isolatedwindowsenvironmentutils.dll, ABI=system, export=IsCrossIsolatedEnvironmentClipboardContent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsCrossIsolatedEnvironmentClipboardContent`(`iscrossisolatedenvironmentclipboardcontent` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-security-isolatedcontainer-l1-1-0.dll, ABI=system, export=IsProcessInIsolatedContainer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsProcessInIsolatedContainer`(`isprocessinisolatedcontainer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=isolatedwindowsenvironmentutils.dll, ABI=system, export=IsProcessInIsolatedWindowsEnvironment; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsProcessInIsolatedWindowsEnvironment`(`isprocessinisolatedwindowsenvironment` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-security-isolatedcontainer-l1-1-1.dll, ABI=system, export=IsProcessInWDAGContainer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsProcessInWDAGContainer`(`reserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `isprocessinwdagcontainer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// UNSUPPORTED Rust 13:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsolatedAppLauncher: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbc812430_e75e_4fd1_9641_1f9f1e2d9a1f);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IsolatedAppLauncherTelemetryParameters` (
    public var `EnableForLaunch`: `windows_sys`.`core`.`BOOL`,
    public var `CorrelationGUID`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 20:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WDAG_CLIPBOARD_TAG: windows_sys::core::PCWSTR = windows_sys::core::w!("CrossIsolatedEnvironmentContent");

