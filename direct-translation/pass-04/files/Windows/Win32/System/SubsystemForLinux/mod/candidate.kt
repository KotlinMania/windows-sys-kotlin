// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-wsl-api-l1-1-0.dll, ABI=system, export=WslConfigureDistribution; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WslConfigureDistribution`(`distributionname` : `windows_sys`.`core`.`PCWSTR`, `defaultuid` : UInt, `wsldistributionflags` : `WSL_DISTRIBUTION_FLAGS`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-wsl-api-l1-1-0.dll, ABI=system, export=WslGetDistributionConfiguration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WslGetDistributionConfiguration`(`distributionname` : `windows_sys`.`core`.`PCWSTR`, `distributionversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `defaultuid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wsldistributionflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WSL_DISTRIBUTION_FLAGS`>?, `defaultenvironmentvariables` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PSTR`>>?, `defaultenvironmentvariablecount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-wsl-api-l1-1-0.dll, ABI=system, export=WslIsDistributionRegistered; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WslIsDistributionRegistered`(`distributionname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-wsl-api-l1-1-0.dll, ABI=system, export=WslLaunch; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WslLaunch`(`distributionname` : `windows_sys`.`core`.`PCWSTR`, `command` : `windows_sys`.`core`.`PCWSTR`, `usecurrentworkingdirectory` : `windows_sys`.`core`.`BOOL`, `stdin` : `super`.`super`.`Foundation`.`HANDLE`, `stdout` : `super`.`super`.`Foundation`.`HANDLE`, `stderr` : `super`.`super`.`Foundation`.`HANDLE`, `process` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-wsl-api-l1-1-0.dll, ABI=system, export=WslLaunchInteractive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WslLaunchInteractive`(`distributionname` : `windows_sys`.`core`.`PCWSTR`, `command` : `windows_sys`.`core`.`PCWSTR`, `usecurrentworkingdirectory` : `windows_sys`.`core`.`BOOL`, `exitcode` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-wsl-api-l1-1-0.dll, ABI=system, export=WslRegisterDistribution; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WslRegisterDistribution`(`distributionname` : `windows_sys`.`core`.`PCWSTR`, `targzfilename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-wsl-api-l1-1-0.dll, ABI=system, export=WslUnregisterDistribution; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WslUnregisterDistribution`(`distributionname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
public typealias `WSL_DISTRIBUTION_FLAGS` = Int;
public const val `WSL_DISTRIBUTION_FLAGS_APPEND_NT_PATH`: `WSL_DISTRIBUTION_FLAGS` = 2;
public const val `WSL_DISTRIBUTION_FLAGS_ENABLE_DRIVE_MOUNTING`: `WSL_DISTRIBUTION_FLAGS` = 4;
public const val `WSL_DISTRIBUTION_FLAGS_ENABLE_INTEROP`: `WSL_DISTRIBUTION_FLAGS` = 1;
public const val `WSL_DISTRIBUTION_FLAGS_NONE`: `WSL_DISTRIBUTION_FLAGS` = 0;
