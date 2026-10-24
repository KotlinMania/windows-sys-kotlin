// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=CallNtPowerInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CallNtPowerInformation`(`informationlevel` : `POWER_INFORMATION_LEVEL`, `inputbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `inputbufferlength` : UInt, `outputbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `outputbufferlength` : UInt) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=CanUserWritePwrScheme; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CanUserWritePwrScheme`() : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=DeletePwrScheme; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePwrScheme`(`uiid` : UInt) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=DevicePowerClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DevicePowerClose`() : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=DevicePowerEnumDevices; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DevicePowerEnumDevices`(`queryindex` : UInt, `queryinterpretationflags` : UInt, `queryflags` : UInt, `preturnbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=DevicePowerOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DevicePowerOpen`(`debugmask` : UInt) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=DevicePowerSetDeviceState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DevicePowerSetDeviceState`(`devicedescription` : `windows_sys`.`core`.`PCWSTR`, `setflags` : UInt, `setdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=EnumPwrSchemes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumPwrSchemes`(`lpfn` : `PWRSCHEMESENUMPROC`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=GetActivePwrScheme; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetActivePwrScheme`(`puiid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=GetCurrentPowerPolicies; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCurrentPowerPolicies`(`pglobalpowerpolicy` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLOBAL_POWER_POLICY`>?, `ppowerpolicy` : /* Rust *mut */ kotlinx.cinterop.CPointer<`POWER_POLICY`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetDevicePowerState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDevicePowerState`(`hdevice` : `super`.`super`.`Foundation`.`HANDLE`, `pfon` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=GetPwrCapabilities; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPwrCapabilities`(`lpspc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYSTEM_POWER_CAPABILITIES`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=GetPwrDiskSpindownRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPwrDiskSpindownRange`(`puimax` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `puimin` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetSystemPowerStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemPowerStatus`(`lpsystempowerstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYSTEM_POWER_STATUS`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=IsAdminOverrideActive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsAdminOverrideActive`(`papp` : /* Rust *const */ kotlinx.cinterop.CPointer<`ADMINISTRATOR_POWER_POLICY`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=IsPwrHibernateAllowed; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsPwrHibernateAllowed`() : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=IsPwrShutdownAllowed; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsPwrShutdownAllowed`() : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=IsPwrSuspendAllowed; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsPwrSuspendAllowed`() : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=IsSystemResumeAutomatic; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsSystemResumeAutomatic`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerCanRestoreIndividualDefaultPowerScheme; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PowerCanRestoreIndividualDefaultPowerScheme`(`schemeguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=PowerClearRequest; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PowerClearRequest`(`powerrequest` : `super`.`super`.`Foundation`.`HANDLE`, `requesttype` : `POWER_REQUEST_TYPE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerCreatePossibleSetting; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerCreatePossibleSetting`(`rootsystempowerkey` : `super`.`Registry`.`HKEY`, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `possiblesettingindex` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=PowerCreateRequest; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Threading")]
public external fun `PowerCreateRequest`(`context` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Threading`.`REASON_CONTEXT`>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerCreateSetting; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerCreateSetting`(`rootsystempowerkey` : `super`.`Registry`.`HKEY`, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerDeleteScheme; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerDeleteScheme`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `schemeguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerDeterminePlatformRole; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PowerDeterminePlatformRole`() : `POWER_PLATFORM_ROLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerDeterminePlatformRoleEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PowerDeterminePlatformRoleEx`(`version` : `POWER_PLATFORM_ROLE_VERSION`) : `POWER_PLATFORM_ROLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerDuplicateScheme; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerDuplicateScheme`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `sourceschemeguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `destinationschemeguid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`GUID`>>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerEnumerate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerEnumerate`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `schemeguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `accessflags` : `POWER_DATA_ACCESSOR`, `index` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerGetActiveScheme; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerGetActiveScheme`(`userrootpowerkey` : `super`.`Registry`.`HKEY`, `activepolicyguid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`GUID`>>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerImportPowerScheme; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerImportPowerScheme`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `importfilenamepath` : `windows_sys`.`core`.`PCWSTR`, `destinationschemeguid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`GUID`>>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerIsSettingRangeDefined; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PowerIsSettingRangeDefined`(`subkeyguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `settingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerOpenSystemPowerKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerOpenSystemPowerKey`(`phsystempowerkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Registry`.`HKEY`>?, `access` : UInt, `openexisting` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerOpenUserPowerKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerOpenUserPowerKey`(`phuserpowerkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Registry`.`HKEY`>?, `access` : UInt, `openexisting` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerReadACDefaultIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerReadACDefaultIndex`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `schemepersonalityguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `acdefaultindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerReadACValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerReadACValue`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `schemeguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `type` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerReadACValueIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerReadACValueIndex`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `schemeguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `acvalueindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerReadDCDefaultIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerReadDCDefaultIndex`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `schemepersonalityguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dcdefaultindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerReadDCValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerReadDCValue`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `schemeguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `type` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerReadDCValueIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerReadDCValueIndex`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `schemeguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dcvalueindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerReadDescription; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerReadDescription`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `schemeguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerReadFriendlyName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerReadFriendlyName`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `schemeguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerReadIconResourceSpecifier; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerReadIconResourceSpecifier`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `schemeguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerReadPossibleDescription; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerReadPossibleDescription`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `possiblesettingindex` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerReadPossibleFriendlyName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerReadPossibleFriendlyName`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `possiblesettingindex` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerReadPossibleValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerReadPossibleValue`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `type` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `possiblesettingindex` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerReadSettingAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PowerReadSettingAttributes`(`subgroupguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerReadValueIncrement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerReadValueIncrement`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `valueincrement` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerReadValueMax; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerReadValueMax`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `valuemaximum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerReadValueMin; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerReadValueMin`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `valueminimum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerReadValueUnitsSpecifier; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerReadValueUnitsSpecifier`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerRegisterForEffectivePowerModeNotifications; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PowerRegisterForEffectivePowerModeNotifications`(`version` : UInt, `callback` : `EFFECTIVE_POWER_MODE_CALLBACK`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `registrationhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerRegisterSuspendResumeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `PowerRegisterSuspendResumeNotification`(`flags` : `super`.`super`.`UI`.`WindowsAndMessaging`.`REGISTER_NOTIFICATION_FLAGS`, `recipient` : `super`.`super`.`Foundation`.`HANDLE`, `registrationhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerRemovePowerSetting; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PowerRemovePowerSetting`(`powersettingsubkeyguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerReplaceDefaultPowerSchemes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PowerReplaceDefaultPowerSchemes`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerReportThermalEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PowerReportThermalEvent`(`event` : /* Rust *const */ kotlinx.cinterop.CPointer<`THERMAL_EVENT`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerRestoreDefaultPowerSchemes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PowerRestoreDefaultPowerSchemes`() : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerRestoreIndividualDefaultPowerScheme; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PowerRestoreIndividualDefaultPowerScheme`(`schemeguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerSetActiveScheme; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerSetActiveScheme`(`userrootpowerkey` : `super`.`Registry`.`HKEY`, `schemeguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=PowerSetRequest; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PowerSetRequest`(`powerrequest` : `super`.`super`.`Foundation`.`HANDLE`, `requesttype` : `POWER_REQUEST_TYPE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerSettingAccessCheck; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PowerSettingAccessCheck`(`accessflags` : `POWER_DATA_ACCESSOR`, `powerguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerSettingAccessCheckEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerSettingAccessCheckEx`(`accessflags` : `POWER_DATA_ACCESSOR`, `powerguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `accesstype` : `super`.`Registry`.`REG_SAM_FLAGS`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerSettingRegisterNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `PowerSettingRegisterNotification`(`settingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `flags` : `super`.`super`.`UI`.`WindowsAndMessaging`.`REGISTER_NOTIFICATION_FLAGS`, `recipient` : `super`.`super`.`Foundation`.`HANDLE`, `registrationhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerSettingUnregisterNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PowerSettingUnregisterNotification`(`registrationhandle` : `HPOWERNOTIFY`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerUnregisterFromEffectivePowerModeNotifications; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PowerUnregisterFromEffectivePowerModeNotifications`(`registrationhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerUnregisterSuspendResumeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PowerUnregisterSuspendResumeNotification`(`registrationhandle` : `HPOWERNOTIFY`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerWriteACDefaultIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerWriteACDefaultIndex`(`rootsystempowerkey` : `super`.`Registry`.`HKEY`, `schemepersonalityguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `defaultacindex` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerWriteACValueIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerWriteACValueIndex`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `schemeguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `acvalueindex` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerWriteDCDefaultIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerWriteDCDefaultIndex`(`rootsystempowerkey` : `super`.`Registry`.`HKEY`, `schemepersonalityguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `defaultdcindex` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerWriteDCValueIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerWriteDCValueIndex`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `schemeguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dcvalueindex` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerWriteDescription; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerWriteDescription`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `schemeguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `buffersize` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerWriteFriendlyName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerWriteFriendlyName`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `schemeguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `buffersize` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerWriteIconResourceSpecifier; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerWriteIconResourceSpecifier`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `schemeguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `buffersize` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerWritePossibleDescription; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerWritePossibleDescription`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `possiblesettingindex` : UInt, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `buffersize` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerWritePossibleFriendlyName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerWritePossibleFriendlyName`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `possiblesettingindex` : UInt, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `buffersize` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerWritePossibleValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerWritePossibleValue`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `type` : UInt, `possiblesettingindex` : UInt, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `buffersize` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerWriteSettingAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PowerWriteSettingAttributes`(`subgroupguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `attributes` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerWriteValueIncrement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerWriteValueIncrement`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `valueincrement` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerWriteValueMax; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerWriteValueMax`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `valuemaximum` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerWriteValueMin; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerWriteValueMin`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `valueminimum` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=PowerWriteValueUnitsSpecifier; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `PowerWriteValueUnitsSpecifier`(`rootpowerkey` : `super`.`Registry`.`HKEY`, `subgroupofpowersettingsguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `buffersize` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=ReadGlobalPwrPolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReadGlobalPwrPolicy`(`pglobalpowerpolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`GLOBAL_POWER_POLICY`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=ReadProcessorPwrScheme; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReadProcessorPwrScheme`(`uiid` : UInt, `pmachineprocessorpowerpolicy` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MACHINE_PROCESSOR_POWER_POLICY`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=ReadPwrScheme; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReadPwrScheme`(`uiid` : UInt, `ppowerpolicy` : /* Rust *mut */ kotlinx.cinterop.CPointer<`POWER_POLICY`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RegisterPowerSettingNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `RegisterPowerSettingNotification`(`hrecipient` : `super`.`super`.`Foundation`.`HANDLE`, `powersettingguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `flags` : `super`.`super`.`UI`.`WindowsAndMessaging`.`REGISTER_NOTIFICATION_FLAGS`) : `HPOWERNOTIFY`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RegisterSuspendResumeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `RegisterSuspendResumeNotification`(`hrecipient` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : `super`.`super`.`UI`.`WindowsAndMessaging`.`REGISTER_NOTIFICATION_FLAGS`) : `HPOWERNOTIFY`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RequestWakeupLatency; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RequestWakeupLatency`(`latency` : `LATENCY_TIME`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=SetActivePwrScheme; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetActivePwrScheme`(`uiid` : UInt, `pglobalpowerpolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`GLOBAL_POWER_POLICY`>?, `ppowerpolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`POWER_POLICY`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=SetSuspendState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetSuspendState`(`bhibernate` : Boolean, `bforce` : Boolean, `bwakeupeventsdisabled` : Boolean) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetSystemPowerState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetSystemPowerState`(`fsuspend` : `windows_sys`.`core`.`BOOL`, `fforce` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetThreadExecutionState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetThreadExecutionState`(`esflags` : `EXECUTION_STATE`) : `EXECUTION_STATE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=UnregisterPowerSettingNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnregisterPowerSettingNotification`(`handle` : `HPOWERNOTIFY`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=UnregisterSuspendResumeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnregisterSuspendResumeNotification`(`handle` : `HPOWERNOTIFY`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=ValidatePowerPolicies; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ValidatePowerPolicies`(`pglobalpowerpolicy` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLOBAL_POWER_POLICY`>?, `ppowerpolicy` : /* Rust *mut */ kotlinx.cinterop.CPointer<`POWER_POLICY`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=WriteGlobalPwrPolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WriteGlobalPwrPolicy`(`pglobalpowerpolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`GLOBAL_POWER_POLICY`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=WriteProcessorPwrScheme; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WriteProcessorPwrScheme`(`uiid` : UInt, `pmachineprocessorpowerpolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`MACHINE_PROCESSOR_POWER_POLICY`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=powrprof.dll, ABI=system, export=WritePwrScheme; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WritePwrScheme`(`puiid` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpszschemename` : `windows_sys`.`core`.`PCWSTR`, `lpszdescription` : `windows_sys`.`core`.`PCWSTR`, `lpscheme` : /* Rust *const */ kotlinx.cinterop.CPointer<`POWER_POLICY`>?) : Boolean
public const val `ACCESS_ACTIVE_OVERLAY_SCHEME`: `POWER_DATA_ACCESSOR` = 27;
public const val `ACCESS_ACTIVE_SCHEME`: `POWER_DATA_ACCESSOR` = 19;
public const val `ACCESS_AC_POWER_SETTING_INDEX`: `POWER_DATA_ACCESSOR` = 0;
public const val `ACCESS_AC_POWER_SETTING_MAX`: `POWER_DATA_ACCESSOR` = 21;
public const val `ACCESS_AC_POWER_SETTING_MIN`: `POWER_DATA_ACCESSOR` = 23;
public const val `ACCESS_ATTRIBUTES`: `POWER_DATA_ACCESSOR` = 15;
public const val `ACCESS_CREATE_SCHEME`: `POWER_DATA_ACCESSOR` = 20;
public const val `ACCESS_DC_POWER_SETTING_INDEX`: `POWER_DATA_ACCESSOR` = 1;
public const val `ACCESS_DC_POWER_SETTING_MAX`: `POWER_DATA_ACCESSOR` = 22;
public const val `ACCESS_DC_POWER_SETTING_MIN`: `POWER_DATA_ACCESSOR` = 24;
public const val `ACCESS_DEFAULT_AC_POWER_SETTING`: `POWER_DATA_ACCESSOR` = 7;
public const val `ACCESS_DEFAULT_DC_POWER_SETTING`: `POWER_DATA_ACCESSOR` = 8;
public const val `ACCESS_DEFAULT_SECURITY_DESCRIPTOR`: `POWER_DATA_ACCESSOR` = 14;
public const val `ACCESS_DESCRIPTION`: `POWER_DATA_ACCESSOR` = 3;
public const val `ACCESS_FRIENDLY_NAME`: `POWER_DATA_ACCESSOR` = 2;
public const val `ACCESS_ICON_RESOURCE`: `POWER_DATA_ACCESSOR` = 13;
public const val `ACCESS_INDIVIDUAL_SETTING`: `POWER_DATA_ACCESSOR` = 18;
public const val `ACCESS_OVERLAY_SCHEME`: `POWER_DATA_ACCESSOR` = 26;
public const val `ACCESS_POSSIBLE_POWER_SETTING`: `POWER_DATA_ACCESSOR` = 4;
public const val `ACCESS_POSSIBLE_POWER_SETTING_DESCRIPTION`: `POWER_DATA_ACCESSOR` = 6;
public const val `ACCESS_POSSIBLE_POWER_SETTING_FRIENDLY_NAME`: `POWER_DATA_ACCESSOR` = 5;
public const val `ACCESS_POSSIBLE_VALUE_INCREMENT`: `POWER_DATA_ACCESSOR` = 11;
public const val `ACCESS_POSSIBLE_VALUE_MAX`: `POWER_DATA_ACCESSOR` = 10;
public const val `ACCESS_POSSIBLE_VALUE_MIN`: `POWER_DATA_ACCESSOR` = 9;
public const val `ACCESS_POSSIBLE_VALUE_UNITS`: `POWER_DATA_ACCESSOR` = 12;
public const val `ACCESS_PROFILE`: `POWER_DATA_ACCESSOR` = 25;
public const val `ACCESS_SCHEME`: `POWER_DATA_ACCESSOR` = 16;
public const val `ACCESS_SUBGROUP`: `POWER_DATA_ACCESSOR` = 17;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACPI_REAL_TIME` (
    public var `Year`: UShort,
    public var `Month`: UByte,
    public var `Day`: UByte,
    public var `Hour`: UByte,
    public var `Minute`: UByte,
    public var `Second`: UByte,
    public var `Valid`: UByte,
    public var `Milliseconds`: UShort,
    public var `TimeZone`: Short,
    public var `DayLight`: UByte,
    public var `Reserved1`: UByteArray,
)
// UNSUPPORTED Rust 187:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ACPI_REAL_TIME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ACPI_TIME_ADJUST_DAYLIGHT`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ACPI_TIME_AND_ALARM_CAPABILITIES` (
    public var `AcWakeSupported`: Boolean,
    public var `DcWakeSupported`: Boolean,
    public var `S4AcWakeSupported`: Boolean,
    public var `S4DcWakeSupported`: Boolean,
    public var `S5AcWakeSupported`: Boolean,
    public var `S5DcWakeSupported`: Boolean,
    public var `S4S5WakeStatusSupported`: Boolean,
    public var `DeepestWakeSystemState`: UInt,
    public var `RealTimeFeaturesSupported`: Boolean,
    public var `RealTimeResolution`: `ACPI_TIME_RESOLUTION`,
)
public const val `ACPI_TIME_IN_DAYLIGHT`: UInt = 2u;
public typealias `ACPI_TIME_RESOLUTION` = Int;
public const val `ACPI_TIME_ZONE_UNKNOWN`: UInt = 2047u;
public const val `ACTIVE_COOLING`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ADMINISTRATOR_POWER_POLICY` (
    public var `MinSleep`: `SYSTEM_POWER_STATE`,
    public var `MaxSleep`: `SYSTEM_POWER_STATE`,
    public var `MinVideoTimeout`: UInt,
    public var `MaxVideoTimeout`: UInt,
    public var `MinSpindownTimeout`: UInt,
    public var `MaxSpindownTimeout`: UInt,
)
public const val `ALTITUDE_GROUP_POLICY`: `POWER_SETTING_ALTITUDE` = 0;
public const val `ALTITUDE_INTERNAL_OVERRIDE`: `POWER_SETTING_ALTITUDE` = 5;
public const val `ALTITUDE_OEM_CUSTOMIZATION`: `POWER_SETTING_ALTITUDE` = 4;
public const val `ALTITUDE_OS_DEFAULT`: `POWER_SETTING_ALTITUDE` = 6;
public const val `ALTITUDE_PROVISIONING`: `POWER_SETTING_ALTITUDE` = 3;
public const val `ALTITUDE_RUNTIME_OVERRIDE`: `POWER_SETTING_ALTITUDE` = 2;
public const val `ALTITUDE_USER`: `POWER_SETTING_ALTITUDE` = 1;
public const val `AcpiTimeResolutionMax`: `ACPI_TIME_RESOLUTION` = 2;
public const val `AcpiTimeResolutionMilliseconds`: `ACPI_TIME_RESOLUTION` = 0;
public const val `AcpiTimeResolutionSeconds`: `ACPI_TIME_RESOLUTION` = 1;
public const val `AdministratorPowerPolicy`: `POWER_INFORMATION_LEVEL` = 9;
public const val `BATTERY_CAPACITY_RELATIVE`: UInt = 1073741824u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BATTERY_CHARGER_STATUS` (
    public var `Type`: `BATTERY_CHARGING_SOURCE_TYPE`,
    public var `VaData`: UIntArray,
)
// UNSUPPORTED Rust 239:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BATTERY_CHARGER_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BATTERY_CHARGING`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BATTERY_CHARGING_SOURCE` (
    public var `Type`: `BATTERY_CHARGING_SOURCE_TYPE`,
    public var `MaxCurrent`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BATTERY_CHARGING_SOURCE_INFORMATION` (
    public var `Type`: `BATTERY_CHARGING_SOURCE_TYPE`,
    public var `SourceOnline`: Boolean,
)
public typealias `BATTERY_CHARGING_SOURCE_TYPE` = Int;
public const val `BATTERY_CLASS_MAJOR_VERSION`: UInt = 1u;
public const val `BATTERY_CLASS_MINOR_VERSION`: UInt = 0u;
public const val `BATTERY_CLASS_MINOR_VERSION_1`: UInt = 1u;
public const val `BATTERY_CRITICAL`: UInt = 8u;
// UNSUPPORTED Rust 262:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const BATTERY_CYCLE_COUNT_WMI_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xef98db24_0014_4c25_a50b_c724ae5cd371);

public const val `BATTERY_DISCHARGING`: UInt = 2u;
// UNSUPPORTED Rust 264:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const BATTERY_FULL_CHARGED_CAPACITY_WMI_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x40b40565_96f7_4435_8694_97e0e4395905);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BATTERY_INFORMATION` (
    public var `Capabilities`: UInt,
    public var `Technology`: UByte,
    public var `Reserved`: UByteArray,
    public var `Chemistry`: UByteArray,
    public var `DesignedCapacity`: UInt,
    public var `FullChargedCapacity`: UInt,
    public var `DefaultAlert1`: UInt,
    public var `DefaultAlert2`: UInt,
    public var `CriticalBias`: UInt,
    public var `CycleCount`: UInt,
)
// UNSUPPORTED Rust 279:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BATTERY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BATTERY_IS_SHORT_TERM`: UInt = 536870912u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BATTERY_MANUFACTURE_DATE` (
    public var `Day`: UByte,
    public var `Month`: UByte,
    public var `Year`: UShort,
)
public const val `BATTERY_MINIPORT_UPDATE_DATA_VER_1`: UInt = 1u;
public const val `BATTERY_MINIPORT_UPDATE_DATA_VER_2`: UInt = 2u;
public const val `BATTERY_POWER_ON_LINE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BATTERY_QUERY_INFORMATION` (
    public var `BatteryTag`: UInt,
    public var `InformationLevel`: `BATTERY_QUERY_INFORMATION_LEVEL`,
    public var `AtRate`: UInt,
)
public typealias `BATTERY_QUERY_INFORMATION_LEVEL` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BATTERY_REPORTING_SCALE` (
    public var `Granularity`: UInt,
    public var `Capacity`: UInt,
)
// UNSUPPORTED Rust 309:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const BATTERY_RUNTIME_WMI_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x535a3767_1ac2_49bc_a077_3f7a02e40aec);

public const val `BATTERY_SEALED`: UInt = 268435456u;
public const val `BATTERY_SET_CHARGER_ID_SUPPORTED`: UInt = 8u;
public const val `BATTERY_SET_CHARGE_SUPPORTED`: UInt = 1u;
public const val `BATTERY_SET_CHARGINGSOURCE_SUPPORTED`: UInt = 4u;
public const val `BATTERY_SET_DISCHARGE_SUPPORTED`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BATTERY_SET_INFORMATION` (
    public var `BatteryTag`: UInt,
    public var `InformationLevel`: `BATTERY_SET_INFORMATION_LEVEL`,
    public var `Buffer`: UByteArray,
)
// UNSUPPORTED Rust 322:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BATTERY_SET_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `BATTERY_SET_INFORMATION_LEVEL` = Int;
// UNSUPPORTED Rust 328:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const BATTERY_STATIC_DATA_WMI_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x05e1e463_e4e2_4ea9_80cb_9bd4b3ca0655);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BATTERY_STATUS` (
    public var `PowerState`: UInt,
    public var `Capacity`: UInt,
    public var `Voltage`: UInt,
    public var `Rate`: Int,
)
// UNSUPPORTED Rust 337:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const BATTERY_STATUS_CHANGE_WMI_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcddfa0c3_7c5b_4e43_a034_059fa5b84364);

// UNSUPPORTED Rust 338:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const BATTERY_STATUS_WMI_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfc4670d1_ebbf_416e_87ce_374a4ebc111a);

public const val `BATTERY_SYSTEM_BATTERY`: UInt = 2147483648u;
// UNSUPPORTED Rust 340:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const BATTERY_TAG_CHANGE_WMI_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5e1f6e19_8786_4d23_94fc_9e746bd5d888);

public const val `BATTERY_TAG_INVALID`: UInt = 0u;
// UNSUPPORTED Rust 342:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const BATTERY_TEMPERATURE_WMI_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1a52a14d_adce_4a44_9a3e_c8d8f15ff2c2);

public const val `BATTERY_UNKNOWN_CAPACITY`: UInt = 4294967295u;
public const val `BATTERY_UNKNOWN_CURRENT`: UInt = 4294967295u;
public const val `BATTERY_UNKNOWN_RATE`: UInt = 2147483648u;
public const val `BATTERY_UNKNOWN_TIME`: UInt = 4294967295u;
public const val `BATTERY_UNKNOWN_VOLTAGE`: UInt = 4294967295u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BATTERY_USB_CHARGER_STATUS` (
    public var `Type`: `BATTERY_CHARGING_SOURCE_TYPE`,
    public var `Reserved`: UInt,
    public var `Flags`: UInt,
    public var `MaxCurrent`: UInt,
    public var `Voltage`: UInt,
    public var `PortType`: `USB_CHARGER_PORT`,
    public var `PortId`: ULong,
    public var `PowerSourceInformation`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `OemCharger`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 361:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BATTERY_USB_CHARGER_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BATTERY_USB_CHARGER_STATUS_FN_DEFAULT_USB`: UInt = 1u;
public const val `BATTERY_USB_CHARGER_STATUS_UCM_PD`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BATTERY_WAIT_STATUS` (
    public var `BatteryTag`: UInt,
    public var `Timeout`: UInt,
    public var `PowerState`: UInt,
    public var `LowCapacity`: UInt,
    public var `HighCapacity`: UInt,
)
public const val `BatteryCharge`: `BATTERY_SET_INFORMATION_LEVEL` = 1;
public const val `BatteryChargerId`: `BATTERY_SET_INFORMATION_LEVEL` = 4;
public const val `BatteryChargerStatus`: `BATTERY_SET_INFORMATION_LEVEL` = 5;
public const val `BatteryChargingSource`: `BATTERY_SET_INFORMATION_LEVEL` = 3;
public const val `BatteryChargingSourceType_AC`: `BATTERY_CHARGING_SOURCE_TYPE` = 1;
public const val `BatteryChargingSourceType_Max`: `BATTERY_CHARGING_SOURCE_TYPE` = 4;
public const val `BatteryChargingSourceType_USB`: `BATTERY_CHARGING_SOURCE_TYPE` = 2;
public const val `BatteryChargingSourceType_Wireless`: `BATTERY_CHARGING_SOURCE_TYPE` = 3;
public const val `BatteryCriticalBias`: `BATTERY_SET_INFORMATION_LEVEL` = 0;
public const val `BatteryDeviceName`: `BATTERY_QUERY_INFORMATION_LEVEL` = 4;
public const val `BatteryDeviceState`: `POWER_INFORMATION_LEVEL` = 86;
public const val `BatteryDischarge`: `BATTERY_SET_INFORMATION_LEVEL` = 2;
public const val `BatteryEstimatedTime`: `BATTERY_QUERY_INFORMATION_LEVEL` = 3;
public const val `BatteryGranularityInformation`: `BATTERY_QUERY_INFORMATION_LEVEL` = 1;
public const val `BatteryInformation`: `BATTERY_QUERY_INFORMATION_LEVEL` = 0;
public const val `BatteryManufactureDate`: `BATTERY_QUERY_INFORMATION_LEVEL` = 5;
public const val `BatteryManufactureName`: `BATTERY_QUERY_INFORMATION_LEVEL` = 6;
public const val `BatterySerialNumber`: `BATTERY_QUERY_INFORMATION_LEVEL` = 8;
public const val `BatteryTemperature`: `BATTERY_QUERY_INFORMATION_LEVEL` = 2;
public const val `BatteryUniqueID`: `BATTERY_QUERY_INFORMATION_LEVEL` = 7;
public const val `BlackBoxRecorderDirectAccessBuffer`: `POWER_INFORMATION_LEVEL` = 97;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 7 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CM_POWER_DATA` (
    public var `PD_Size`: UInt,
    public var `PD_MostRecentPowerState`: `DEVICE_POWER_STATE`,
    public var `PD_Capabilities`: UInt,
    public var `PD_D1Latency`: UInt,
    public var `PD_D2Latency`: UInt,
    public var `PD_D3Latency`: UInt,
    public var `PD_PowerStateMapping`: Array<`DEVICE_POWER_STATE`>,
    public var `PD_DeepestSystemWake`: `SYSTEM_POWER_STATE`,
)
// UNSUPPORTED Rust 410:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CM_POWER_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CsDeviceNotification`: `POWER_INFORMATION_LEVEL` = 74;
public const val `DEVICEPOWER_AND_OPERATION`: UInt = 1073741824u;
public const val `DEVICEPOWER_CLEAR_WAKEENABLED`: UInt = 2u;
public const val `DEVICEPOWER_FILTER_DEVICES_PRESENT`: UInt = 536870912u;
public const val `DEVICEPOWER_FILTER_HARDWARE`: UInt = 268435456u;
public const val `DEVICEPOWER_FILTER_ON_NAME`: UInt = 33554432u;
public const val `DEVICEPOWER_FILTER_WAKEENABLED`: UInt = 134217728u;
public const val `DEVICEPOWER_FILTER_WAKEPROGRAMMABLE`: UInt = 67108864u;
public const val `DEVICEPOWER_HARDWAREID`: UInt = 2147483648u;
public const val `DEVICEPOWER_SET_WAKEENABLED`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_NOTIFY_SUBSCRIBE_PARAMETERS` (
    public var `Callback`: `PDEVICE_NOTIFY_CALLBACK_ROUTINE`,
    public var `Context`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 431:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_NOTIFY_SUBSCRIBE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DEVICE_POWER_CAPABILITIES` = UInt;
public typealias `DEVICE_POWER_STATE` = Int;
public const val `DisplayBurst`: `POWER_INFORMATION_LEVEL` = 77;
public typealias `EFFECTIVE_POWER_MODE` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `EFFECTIVE_POWER_MODE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`EFFECTIVE_POWER_MODE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public const val `EFFECTIVE_POWER_MODE_V1`: UInt = 1u;
public const val `EFFECTIVE_POWER_MODE_V2`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMI_CHANNEL_MEASUREMENT_DATA` (
    public var `AbsoluteEnergy`: ULong,
    public var `AbsoluteTime`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMI_CHANNEL_V2` (
    public var `MeasurementUnit`: `EMI_MEASUREMENT_UNIT`,
    public var `ChannelNameSize`: UShort,
    public var `ChannelName`: UShortArray,
)
// UNSUPPORTED Rust 456:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EMI_CHANNEL_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMI_MEASUREMENT_DATA_V2` (
    public var `ChannelData`: Array<`EMI_CHANNEL_MEASUREMENT_DATA`>,
)
// UNSUPPORTED Rust 466:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EMI_MEASUREMENT_DATA_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `EMI_MEASUREMENT_UNIT` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMI_METADATA_SIZE` (
    public var `MetadataSize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMI_METADATA_V1` (
    public var `MeasurementUnit`: `EMI_MEASUREMENT_UNIT`,
    public var `HardwareOEM`: UShortArray,
    public var `HardwareModel`: UShortArray,
    public var `HardwareRevision`: UShort,
    public var `MeteredHardwareNameSize`: UShort,
    public var `MeteredHardwareName`: UShortArray,
)
// UNSUPPORTED Rust 487:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EMI_METADATA_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMI_METADATA_V2` (
    public var `HardwareOEM`: UShortArray,
    public var `HardwareModel`: UShortArray,
    public var `HardwareRevision`: UShort,
    public var `ChannelCount`: UShort,
    public var `Channels`: Array<`EMI_CHANNEL_V2`>,
)
// UNSUPPORTED Rust 501:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EMI_METADATA_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EMI_NAME_MAX`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMI_VERSION` (
    public var `EmiVersion`: UShort,
)
public const val `EMI_VERSION_V1`: UInt = 1u;
public const val `EMI_VERSION_V2`: UInt = 2u;
public const val `ES_AWAYMODE_REQUIRED`: `EXECUTION_STATE` = 64u;
public const val `ES_CONTINUOUS`: `EXECUTION_STATE` = 2147483648u;
public const val `ES_DISPLAY_REQUIRED`: `EXECUTION_STATE` = 2u;
public const val `ES_SYSTEM_REQUIRED`: `EXECUTION_STATE` = 1u;
public const val `ES_USER_PRESENT`: `EXECUTION_STATE` = 4u;
public typealias `EXECUTION_STATE` = UInt;
public const val `EffectivePowerModeBalanced`: `EFFECTIVE_POWER_MODE` = 2;
public const val `EffectivePowerModeBatterySaver`: `EFFECTIVE_POWER_MODE` = 0;
public const val `EffectivePowerModeBetterBattery`: `EFFECTIVE_POWER_MODE` = 1;
public const val `EffectivePowerModeGameMode`: `EFFECTIVE_POWER_MODE` = 5;
public const val `EffectivePowerModeHighPerformance`: `EFFECTIVE_POWER_MODE` = 3;
public const val `EffectivePowerModeMaxPerformance`: `EFFECTIVE_POWER_MODE` = 4;
public const val `EffectivePowerModeMixedReality`: `EFFECTIVE_POWER_MODE` = 6;
public const val `EmiMeasurementUnitPicowattHours`: `EMI_MEASUREMENT_UNIT` = 0;
public const val `EnableMultiBatteryDisplay`: UInt = 2u;
public const val `EnablePasswordLogon`: UInt = 4u;
public const val `EnableSysTrayBatteryMeter`: UInt = 1u;
public const val `EnableVideoDimDisplay`: UInt = 16u;
public const val `EnableWakeOnRing`: UInt = 8u;
public const val `EnergyTrackerCreate`: `POWER_INFORMATION_LEVEL` = 92;
public const val `EnergyTrackerQuery`: `POWER_INFORMATION_LEVEL` = 93;
public const val `ExitLatencySamplingPercentage`: `POWER_INFORMATION_LEVEL` = 78;
public const val `FirmwareTableInformationRegistered`: `POWER_INFORMATION_LEVEL` = 69;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GLOBAL_MACHINE_POWER_POLICY` (
    public var `Revision`: UInt,
    public var `LidOpenWakeAc`: `SYSTEM_POWER_STATE`,
    public var `LidOpenWakeDc`: `SYSTEM_POWER_STATE`,
    public var `BroadcastCapacityResolution`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GLOBAL_POWER_POLICY` (
    public var `user`: `GLOBAL_USER_POWER_POLICY`,
    public var `mach`: `GLOBAL_MACHINE_POWER_POLICY`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GLOBAL_USER_POWER_POLICY` (
    public var `Revision`: UInt,
    public var `PowerButtonAc`: `POWER_ACTION_POLICY`,
    public var `PowerButtonDc`: `POWER_ACTION_POLICY`,
    public var `SleepButtonAc`: `POWER_ACTION_POLICY`,
    public var `SleepButtonDc`: `POWER_ACTION_POLICY`,
    public var `LidCloseAc`: `POWER_ACTION_POLICY`,
    public var `LidCloseDc`: `POWER_ACTION_POLICY`,
    public var `DischargePolicy`: Array<`SYSTEM_POWER_LEVEL`>,
    public var `GlobalFlags`: UInt,
)
// UNSUPPORTED Rust 564:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GLOBAL_USER_POWER_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 569:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_CLASS_INPUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d1e55b2_f16f_11cf_88cb_001111000030);

// UNSUPPORTED Rust 570:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVICE_ACPI_TIME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x97f99bf6_4497_4f18_bb22_4b9fb2fbef9c);

// UNSUPPORTED Rust 571:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVICE_APPLICATIONLAUNCH_BUTTON: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x629758ee_986e_4d9e_8e47_de27f8ab054d);

// UNSUPPORTED Rust 572:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVICE_BATTERY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x72631e54_78a4_11d0_bcf7_00aa00b7b32a);

// UNSUPPORTED Rust 573:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVICE_ENERGY_METER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x45bd8344_7ed6_49cf_a440_c276c933b053);

// UNSUPPORTED Rust 574:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVICE_FAN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x05ecd13d_81da_4a2a_8a4c_524f23dd4dc9);

// UNSUPPORTED Rust 575:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVICE_LID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4afa3d52_74a7_11d0_be5e_00a0c9062857);

// UNSUPPORTED Rust 576:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVICE_MEMORY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3fd0f03d_92e0_45fb_b75c_5ed8ffb01021);

// UNSUPPORTED Rust 577:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVICE_MESSAGE_INDICATOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcd48a365_fa94_4ce2_a232_a1b764e5d8b4);

// UNSUPPORTED Rust 578:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVICE_PROCESSOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x97fadb10_4e33_40ae_359c_8bef029dbdd0);

// UNSUPPORTED Rust 579:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVICE_SYS_BUTTON: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4afa3d53_74a7_11d0_be5e_00a0c9062857);

// UNSUPPORTED Rust 580:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVICE_THERMAL_ZONE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4afa3d51_74a7_11d0_be5e_00a0c9062857);

// UNSUPPORTED Rust 581:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVINTERFACE_THERMAL_COOLING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdbe4373d_3c81_40cb_ace4_e0e5d05f0c9f);

// UNSUPPORTED Rust 582:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVINTERFACE_THERMAL_MANAGER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x927ec093_69a4_4bc0_bd02_711664714463);

public const val `GetPowerRequestList`: `POWER_INFORMATION_LEVEL` = 45;
public const val `GetPowerSettingValue`: `POWER_INFORMATION_LEVEL` = 59;
public const val `GroupPark`: `POWER_INFORMATION_LEVEL` = 48;
public typealias `HPOWERNOTIFY` = Long;
public const val `IOCTL_ACPI_GET_REAL_TIME`: UInt = 2703888u;
public const val `IOCTL_ACPI_SET_REAL_TIME`: UInt = 2720276u;
public const val `IOCTL_BATTERY_CHARGING_SOURCE_CHANGE`: UInt = 2703440u;
public const val `IOCTL_BATTERY_QUERY_INFORMATION`: UInt = 2703428u;
public const val `IOCTL_BATTERY_QUERY_STATUS`: UInt = 2703436u;
public const val `IOCTL_BATTERY_QUERY_TAG`: UInt = 2703424u;
public const val `IOCTL_BATTERY_SET_INFORMATION`: UInt = 2719816u;
public const val `IOCTL_EMI_GET_MEASUREMENT`: UInt = 2244620u;
public const val `IOCTL_EMI_GET_METADATA`: UInt = 2244616u;
public const val `IOCTL_EMI_GET_METADATA_SIZE`: UInt = 2244612u;
public const val `IOCTL_EMI_GET_VERSION`: UInt = 2244608u;
public const val `IOCTL_GET_ACPI_TIME_AND_ALARM_CAPABILITIES`: UInt = 2703900u;
public const val `IOCTL_GET_PROCESSOR_OBJ_INFO`: UInt = 2703744u;
public const val `IOCTL_GET_SYS_BUTTON_CAPS`: UInt = 2703680u;
public const val `IOCTL_GET_SYS_BUTTON_EVENT`: UInt = 2703684u;
public const val `IOCTL_GET_WAKE_ALARM_POLICY`: UInt = 2736652u;
public const val `IOCTL_GET_WAKE_ALARM_SYSTEM_POWERSTATE`: UInt = 2703896u;
public const val `IOCTL_GET_WAKE_ALARM_VALUE`: UInt = 2736648u;
public const val `IOCTL_NOTIFY_SWITCH_EVENT`: UInt = 2703616u;
public const val `IOCTL_QUERY_LID`: UInt = 2703552u;
public const val `IOCTL_RUN_ACTIVE_COOLING_METHOD`: UInt = 2719880u;
public const val `IOCTL_SET_SYS_MESSAGE_INDICATOR`: UInt = 2720192u;
public const val `IOCTL_SET_WAKE_ALARM_POLICY`: UInt = 2720260u;
public const val `IOCTL_SET_WAKE_ALARM_VALUE`: UInt = 2720256u;
public const val `IOCTL_THERMAL_QUERY_INFORMATION`: UInt = 2703488u;
public const val `IOCTL_THERMAL_READ_POLICY`: UInt = 2703508u;
public const val `IOCTL_THERMAL_READ_TEMPERATURE`: UInt = 2703504u;
public const val `IOCTL_THERMAL_SET_COOLING_POLICY`: UInt = 2719876u;
public const val `IOCTL_THERMAL_SET_PASSIVE_LIMIT`: UInt = 2719884u;
public const val `IdleResiliency`: `POWER_INFORMATION_LEVEL` = 60;
public typealias `LATENCY_TIME` = Int;
public const val `LT_DONT_CARE`: `LATENCY_TIME` = 0;
public const val `LT_LOWEST_LATENCY`: `LATENCY_TIME` = 1;
public const val `LastResumePerformance`: `POWER_INFORMATION_LEVEL` = 76;
public const val `LastSleepTime`: `POWER_INFORMATION_LEVEL` = 15;
public const val `LastWakeTime`: `POWER_INFORMATION_LEVEL` = 14;
public const val `LogicalProcessorIdling`: `POWER_INFORMATION_LEVEL` = 56;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MACHINE_POWER_POLICY` (
    public var `Revision`: UInt,
    public var `MinSleepAc`: `SYSTEM_POWER_STATE`,
    public var `MinSleepDc`: `SYSTEM_POWER_STATE`,
    public var `ReducedLatencySleepAc`: `SYSTEM_POWER_STATE`,
    public var `ReducedLatencySleepDc`: `SYSTEM_POWER_STATE`,
    public var `DozeTimeoutAc`: UInt,
    public var `DozeTimeoutDc`: UInt,
    public var `DozeS4TimeoutAc`: UInt,
    public var `DozeS4TimeoutDc`: UInt,
    public var `MinThrottleAc`: UByte,
    public var `MinThrottleDc`: UByte,
    public var `pad1`: UByteArray,
    public var `OverThrottledAc`: `POWER_ACTION_POLICY`,
    public var `OverThrottledDc`: `POWER_ACTION_POLICY`,
)
// UNSUPPORTED Rust 642:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MACHINE_POWER_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MACHINE_PROCESSOR_POWER_POLICY` (
    public var `Revision`: UInt,
    public var `ProcessorPolicyAc`: `PROCESSOR_POWER_POLICY`,
    public var `ProcessorPolicyDc`: `PROCESSOR_POWER_POLICY`,
)
public const val `MAX_ACTIVE_COOLING_LEVELS`: UInt = 10u;
public const val `MAX_BATTERY_STRING_SIZE`: UInt = 128u;
public const val `MonitorCapabilities`: `POWER_INFORMATION_LEVEL` = 40;
public const val `MonitorInvocation`: `POWER_INFORMATION_LEVEL` = 68;
public const val `MonitorRequestReasonAcDcDisplayBurst`: `POWER_MONITOR_REQUEST_REASON` = 5;
public const val `MonitorRequestReasonAcDcDisplayBurstSuppressed`: `POWER_MONITOR_REQUEST_REASON` = 28;
public const val `MonitorRequestReasonBatteryCountChange`: `POWER_MONITOR_REQUEST_REASON` = 16;
public const val `MonitorRequestReasonBatteryCountChangeSuppressed`: `POWER_MONITOR_REQUEST_REASON` = 49;
public const val `MonitorRequestReasonBatteryPreCritical`: `POWER_MONITOR_REQUEST_REASON` = 53;
public const val `MonitorRequestReasonBuiltinPanel`: `POWER_MONITOR_REQUEST_REASON` = 47;
public const val `MonitorRequestReasonDP`: `POWER_MONITOR_REQUEST_REASON` = 19;
public const val `MonitorRequestReasonDim`: `POWER_MONITOR_REQUEST_REASON` = 46;
public const val `MonitorRequestReasonDirectedDrips`: `POWER_MONITOR_REQUEST_REASON` = 45;
public const val `MonitorRequestReasonDisplayRequiredUnDim`: `POWER_MONITOR_REQUEST_REASON` = 48;
public const val `MonitorRequestReasonFullWake`: `POWER_MONITOR_REQUEST_REASON` = 9;
public const val `MonitorRequestReasonGracePeriod`: `POWER_MONITOR_REQUEST_REASON` = 17;
public const val `MonitorRequestReasonIdleTimeout`: `POWER_MONITOR_REQUEST_REASON` = 12;
public const val `MonitorRequestReasonLid`: `POWER_MONITOR_REQUEST_REASON` = 15;
public const val `MonitorRequestReasonMax`: `POWER_MONITOR_REQUEST_REASON` = 55;
public const val `MonitorRequestReasonNearProximity`: `POWER_MONITOR_REQUEST_REASON` = 22;
public const val `MonitorRequestReasonPdcSignal`: `POWER_MONITOR_REQUEST_REASON` = 27;
public const val `MonitorRequestReasonPdcSignalFingerprint`: `POWER_MONITOR_REQUEST_REASON` = 44;
public const val `MonitorRequestReasonPdcSignalHeyCortana`: `POWER_MONITOR_REQUEST_REASON` = 42;
public const val `MonitorRequestReasonPdcSignalHolographicShell`: `POWER_MONITOR_REQUEST_REASON` = 43;
public const val `MonitorRequestReasonPdcSignalSensorsHumanPresence`: `POWER_MONITOR_REQUEST_REASON` = 52;
public const val `MonitorRequestReasonPdcSignalWindowsMobilePwrNotif`: `POWER_MONITOR_REQUEST_REASON` = 40;
public const val `MonitorRequestReasonPdcSignalWindowsMobileShell`: `POWER_MONITOR_REQUEST_REASON` = 41;
public const val `MonitorRequestReasonPnP`: `POWER_MONITOR_REQUEST_REASON` = 18;
public const val `MonitorRequestReasonPoSetSystemState`: `POWER_MONITOR_REQUEST_REASON` = 7;
public const val `MonitorRequestReasonPolicyChange`: `POWER_MONITOR_REQUEST_REASON` = 13;
public const val `MonitorRequestReasonPowerButton`: `POWER_MONITOR_REQUEST_REASON` = 1;
public const val `MonitorRequestReasonRemoteConnection`: `POWER_MONITOR_REQUEST_REASON` = 2;
public const val `MonitorRequestReasonResumeModernStandby`: `POWER_MONITOR_REQUEST_REASON` = 50;
public const val `MonitorRequestReasonResumePdc`: `POWER_MONITOR_REQUEST_REASON` = 24;
public const val `MonitorRequestReasonResumeS4`: `POWER_MONITOR_REQUEST_REASON` = 25;
public const val `MonitorRequestReasonScMonitorpower`: `POWER_MONITOR_REQUEST_REASON` = 3;
public const val `MonitorRequestReasonScreenOffRequest`: `POWER_MONITOR_REQUEST_REASON` = 11;
public const val `MonitorRequestReasonSessionUnlock`: `POWER_MONITOR_REQUEST_REASON` = 10;
public const val `MonitorRequestReasonSetThreadExecutionState`: `POWER_MONITOR_REQUEST_REASON` = 8;
public const val `MonitorRequestReasonSleepButton`: `POWER_MONITOR_REQUEST_REASON` = 14;
public const val `MonitorRequestReasonSxTransition`: `POWER_MONITOR_REQUEST_REASON` = 20;
public const val `MonitorRequestReasonSystemIdle`: `POWER_MONITOR_REQUEST_REASON` = 21;
public const val `MonitorRequestReasonSystemStateEntered`: `POWER_MONITOR_REQUEST_REASON` = 29;
public const val `MonitorRequestReasonTerminal`: `POWER_MONITOR_REQUEST_REASON` = 26;
public const val `MonitorRequestReasonTerminalInit`: `POWER_MONITOR_REQUEST_REASON` = 51;
public const val `MonitorRequestReasonThermalStandby`: `POWER_MONITOR_REQUEST_REASON` = 23;
public const val `MonitorRequestReasonUnknown`: `POWER_MONITOR_REQUEST_REASON` = 0;
public const val `MonitorRequestReasonUserDisplayBurst`: `POWER_MONITOR_REQUEST_REASON` = 6;
public const val `MonitorRequestReasonUserInput`: `POWER_MONITOR_REQUEST_REASON` = 4;
public const val `MonitorRequestReasonUserInputAccelerometer`: `POWER_MONITOR_REQUEST_REASON` = 35;
public const val `MonitorRequestReasonUserInputHid`: `POWER_MONITOR_REQUEST_REASON` = 36;
public const val `MonitorRequestReasonUserInputInitialization`: `POWER_MONITOR_REQUEST_REASON` = 39;
public const val `MonitorRequestReasonUserInputKeyboard`: `POWER_MONITOR_REQUEST_REASON` = 31;
public const val `MonitorRequestReasonUserInputMouse`: `POWER_MONITOR_REQUEST_REASON` = 32;
public const val `MonitorRequestReasonUserInputPen`: `POWER_MONITOR_REQUEST_REASON` = 34;
public const val `MonitorRequestReasonUserInputPoUserPresent`: `POWER_MONITOR_REQUEST_REASON` = 37;
public const val `MonitorRequestReasonUserInputSessionSwitch`: `POWER_MONITOR_REQUEST_REASON` = 38;
public const val `MonitorRequestReasonUserInputTouch`: `POWER_MONITOR_REQUEST_REASON` = 54;
public const val `MonitorRequestReasonUserInputTouchpad`: `POWER_MONITOR_REQUEST_REASON` = 33;
public const val `MonitorRequestReasonWinrt`: `POWER_MONITOR_REQUEST_REASON` = 30;
public const val `MonitorRequestTypeOff`: `POWER_MONITOR_REQUEST_TYPE` = 0;
public const val `MonitorRequestTypeOnAndPresent`: `POWER_MONITOR_REQUEST_TYPE` = 1;
public const val `MonitorRequestTypeToggleOn`: `POWER_MONITOR_REQUEST_TYPE` = 2;
public const val `NotifyUserModeLegacyPowerEvent`: `POWER_INFORMATION_LEVEL` = 47;
public const val `NotifyUserPowerSetting`: `POWER_INFORMATION_LEVEL` = 26;
public const val `PASSIVE_COOLING`: UInt = 1u;
public const val `PDCAP_D0_SUPPORTED`: `DEVICE_POWER_CAPABILITIES` = 1u;
public const val `PDCAP_D1_SUPPORTED`: `DEVICE_POWER_CAPABILITIES` = 2u;
public const val `PDCAP_D2_SUPPORTED`: `DEVICE_POWER_CAPABILITIES` = 4u;
public const val `PDCAP_D3_SUPPORTED`: `DEVICE_POWER_CAPABILITIES` = 8u;
public const val `PDCAP_S0_SUPPORTED`: `DEVICE_POWER_CAPABILITIES` = 65536u;
public const val `PDCAP_S1_SUPPORTED`: `DEVICE_POWER_CAPABILITIES` = 131072u;
public const val `PDCAP_S2_SUPPORTED`: `DEVICE_POWER_CAPABILITIES` = 262144u;
public const val `PDCAP_S3_SUPPORTED`: `DEVICE_POWER_CAPABILITIES` = 524288u;
public const val `PDCAP_S4_SUPPORTED`: `DEVICE_POWER_CAPABILITIES` = 16777216u;
public const val `PDCAP_S5_SUPPORTED`: `DEVICE_POWER_CAPABILITIES` = 33554432u;
public const val `PDCAP_WAKE_FROM_D0_SUPPORTED`: `DEVICE_POWER_CAPABILITIES` = 16u;
public const val `PDCAP_WAKE_FROM_D1_SUPPORTED`: `DEVICE_POWER_CAPABILITIES` = 32u;
public const val `PDCAP_WAKE_FROM_D2_SUPPORTED`: `DEVICE_POWER_CAPABILITIES` = 64u;
public const val `PDCAP_WAKE_FROM_D3_SUPPORTED`: `DEVICE_POWER_CAPABILITIES` = 128u;
public const val `PDCAP_WAKE_FROM_S0_SUPPORTED`: `DEVICE_POWER_CAPABILITIES` = 1048576u;
public const val `PDCAP_WAKE_FROM_S1_SUPPORTED`: `DEVICE_POWER_CAPABILITIES` = 2097152u;
public const val `PDCAP_WAKE_FROM_S2_SUPPORTED`: `DEVICE_POWER_CAPABILITIES` = 4194304u;
public const val `PDCAP_WAKE_FROM_S3_SUPPORTED`: `DEVICE_POWER_CAPABILITIES` = 8388608u;
public const val `PDCAP_WARM_EJECT_SUPPORTED`: `DEVICE_POWER_CAPABILITIES` = 256u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PDEVICE_NOTIFY_CALLBACK_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `POWERBROADCAST_SETTING` (
    public var `PowerSetting`: `windows_sys`.`core`.`GUID`,
    public var `DataLength`: UInt,
    public var `Data`: UByteArray,
)
// UNSUPPORTED Rust 747:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for POWERBROADCAST_SETTING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `POWER_ACTION` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POWER_ACTION_POLICY` (
    public var `Action`: `POWER_ACTION`,
    public var `Flags`: UInt,
    public var `EventCode`: `POWER_ACTION_POLICY_EVENT_CODE`,
)
public typealias `POWER_ACTION_POLICY_EVENT_CODE` = UInt;
public const val `POWER_ATTRIBUTE_HIDE`: UInt = 1u;
public const val `POWER_ATTRIBUTE_SHOW_AOAC`: UInt = 2u;
public typealias `POWER_COOLING_MODE` = UShort;
public typealias `POWER_DATA_ACCESSOR` = Int;
public const val `POWER_FORCE_TRIGGER_RESET`: `POWER_ACTION_POLICY_EVENT_CODE` = 2147483648u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POWER_IDLE_RESILIENCY` (
    public var `CoalescingTimeout`: UInt,
    public var `IdleResiliencyPeriod`: UInt,
)
public typealias `POWER_INFORMATION_LEVEL` = Int;
public const val `POWER_LEVEL_USER_NOTIFY_EXEC`: `POWER_ACTION_POLICY_EVENT_CODE` = 4u;
public const val `POWER_LEVEL_USER_NOTIFY_SOUND`: `POWER_ACTION_POLICY_EVENT_CODE` = 2u;
public const val `POWER_LEVEL_USER_NOTIFY_TEXT`: `POWER_ACTION_POLICY_EVENT_CODE` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POWER_MONITOR_INVOCATION` (
    public var `Console`: Boolean,
    public var `RequestReason`: `POWER_MONITOR_REQUEST_REASON`,
)
public typealias `POWER_MONITOR_REQUEST_REASON` = Int;
public typealias `POWER_MONITOR_REQUEST_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POWER_PLATFORM_INFORMATION` (
    public var `AoAc`: Boolean,
)
public typealias `POWER_PLATFORM_ROLE` = Int;
public const val `POWER_PLATFORM_ROLE_V1`: `POWER_PLATFORM_ROLE_VERSION` = 1u;
public const val `POWER_PLATFORM_ROLE_V2`: `POWER_PLATFORM_ROLE_VERSION` = 2u;
public typealias `POWER_PLATFORM_ROLE_VERSION` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POWER_POLICY` (
    public var `user`: `USER_POWER_POLICY`,
    public var `mach`: `MACHINE_POWER_POLICY`,
)
public typealias `POWER_REQUEST_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POWER_SESSION_ALLOW_EXTERNAL_DMA_DEVICES` (
    public var `IsAllowed`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POWER_SESSION_CONNECT` (
    public var `Connected`: Boolean,
    public var `Console`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POWER_SESSION_RIT_STATE` (
    public var `Active`: Boolean,
    public var `LastInputTime`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POWER_SESSION_TIMEOUTS` (
    public var `InputTimeout`: UInt,
    public var `DisplayTimeout`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POWER_SESSION_WINLOGON` (
    public var `SessionId`: UInt,
    public var `Console`: Boolean,
    public var `Locked`: Boolean,
)
public typealias `POWER_SETTING_ALTITUDE` = Int;
public const val `POWER_USER_NOTIFY_BUTTON`: `POWER_ACTION_POLICY_EVENT_CODE` = 8u;
public const val `POWER_USER_NOTIFY_SHUTDOWN`: `POWER_ACTION_POLICY_EVENT_CODE` = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POWER_USER_PRESENCE` (
    public var `UserPresence`: `POWER_USER_PRESENCE_TYPE`,
)
public typealias `POWER_USER_PRESENCE_TYPE` = Int;
public const val `PO_TZ_ACTIVE`: `POWER_COOLING_MODE` = 0u;
public const val `PO_TZ_INVALID_MODE`: `POWER_COOLING_MODE` = 2u;
public const val `PO_TZ_PASSIVE`: `POWER_COOLING_MODE` = 1u;
public const val `PPM_FIRMWARE_ACPI1C2`: UInt = 1u;
public const val `PPM_FIRMWARE_ACPI1C3`: UInt = 2u;
public const val `PPM_FIRMWARE_ACPI1TSTATES`: UInt = 4u;
public const val `PPM_FIRMWARE_CPC`: UInt = 262144u;
public const val `PPM_FIRMWARE_CSD`: UInt = 16u;
public const val `PPM_FIRMWARE_CST`: UInt = 8u;
public const val `PPM_FIRMWARE_LPI`: UInt = 524288u;
public const val `PPM_FIRMWARE_OSC`: UInt = 65536u;
public const val `PPM_FIRMWARE_PCCH`: UInt = 16384u;
public const val `PPM_FIRMWARE_PCCP`: UInt = 32768u;
public const val `PPM_FIRMWARE_PCT`: UInt = 32u;
public const val `PPM_FIRMWARE_PDC`: UInt = 131072u;
public const val `PPM_FIRMWARE_PPC`: UInt = 256u;
public const val `PPM_FIRMWARE_PSD`: UInt = 512u;
public const val `PPM_FIRMWARE_PSS`: UInt = 64u;
public const val `PPM_FIRMWARE_PTC`: UInt = 1024u;
public const val `PPM_FIRMWARE_TPC`: UInt = 4096u;
public const val `PPM_FIRMWARE_TSD`: UInt = 8192u;
public const val `PPM_FIRMWARE_TSS`: UInt = 2048u;
public const val `PPM_FIRMWARE_XPSS`: UInt = 128u;
// UNSUPPORTED Rust 862:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PPM_IDLESTATES_DATA_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba138e10_e250_4ad7_8616_cf1a7ad410e7);

// UNSUPPORTED Rust 863:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PPM_IDLESTATE_CHANGE_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4838fe4f_f71c_4e51_9ecc_8430a7ac4c6c);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PPM_IDLESTATE_EVENT` (
    public var `NewState`: UInt,
    public var `OldState`: UInt,
    public var `Processors`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PPM_IDLE_ACCOUNTING` (
    public var `StateCount`: UInt,
    public var `TotalTransitions`: UInt,
    public var `ResetCount`: UInt,
    public var `StartTime`: ULong,
    public var `State`: Array<`PPM_IDLE_STATE_ACCOUNTING`>,
)
// UNSUPPORTED Rust 880:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PPM_IDLE_ACCOUNTING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PPM_IDLE_ACCOUNTING_EX` (
    public var `StateCount`: UInt,
    public var `TotalTransitions`: UInt,
    public var `ResetCount`: UInt,
    public var `AbortCount`: UInt,
    public var `StartTime`: ULong,
    public var `State`: Array<`PPM_IDLE_STATE_ACCOUNTING_EX`>,
)
// UNSUPPORTED Rust 895:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PPM_IDLE_ACCOUNTING_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 900:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PPM_IDLE_ACCOUNTING_EX_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd67abd39_81f8_4a5e_8152_72e31ec912ee);

// UNSUPPORTED Rust 901:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PPM_IDLE_ACCOUNTING_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe2a26f78_ae07_4ee0_a30f_ce54f55a94cd);

public const val `PPM_IDLE_IMPLEMENTATION_CSTATES`: UInt = 1u;
public const val `PPM_IDLE_IMPLEMENTATION_LPISTATES`: UInt = 4u;
public const val `PPM_IDLE_IMPLEMENTATION_MICROPEP`: UInt = 3u;
public const val `PPM_IDLE_IMPLEMENTATION_NONE`: UInt = 0u;
public const val `PPM_IDLE_IMPLEMENTATION_PEP`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PPM_IDLE_STATE_ACCOUNTING` (
    public var `IdleTransitions`: UInt,
    public var `FailedTransitions`: UInt,
    public var `InvalidBucketIndex`: UInt,
    public var `TotalTime`: ULong,
    public var `IdleTimeBuckets`: UIntArray,
)
// UNSUPPORTED Rust 916:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PPM_IDLE_STATE_ACCOUNTING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PPM_IDLE_STATE_ACCOUNTING_EX` (
    public var `TotalTime`: ULong,
    public var `IdleTransitions`: UInt,
    public var `FailedTransitions`: UInt,
    public var `InvalidBucketIndex`: UInt,
    public var `MinTimeUs`: UInt,
    public var `MaxTimeUs`: UInt,
    public var `CancelledTransitions`: UInt,
    public var `IdleTimeBuckets`: Array<`PPM_IDLE_STATE_BUCKET_EX`>,
)
// UNSUPPORTED Rust 933:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PPM_IDLE_STATE_ACCOUNTING_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PPM_IDLE_STATE_BUCKET_EX` (
    public var `TotalTimeUs`: ULong,
    public var `MinTimeUs`: UInt,
    public var `MaxTimeUs`: UInt,
    public var `Count`: UInt,
)
// UNSUPPORTED Rust 946:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PPM_PERFMON_PERFSTATE_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7fd18652_0cfe_40d2_b0a1_0b066a87759e);

public const val `PPM_PERFORMANCE_IMPLEMENTATION_CPPC`: UInt = 3u;
public const val `PPM_PERFORMANCE_IMPLEMENTATION_NONE`: UInt = 0u;
public const val `PPM_PERFORMANCE_IMPLEMENTATION_PCCV1`: UInt = 2u;
public const val `PPM_PERFORMANCE_IMPLEMENTATION_PEP`: UInt = 4u;
public const val `PPM_PERFORMANCE_IMPLEMENTATION_PSTATES`: UInt = 1u;
// UNSUPPORTED Rust 952:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PPM_PERFSTATES_DATA_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5708cc20_7d40_4bf4_b4aa_2b01338d0126);

// UNSUPPORTED Rust 953:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PPM_PERFSTATE_CHANGE_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa5b32ddd_7f39_4abc_b892_900e43b59ebb);

// UNSUPPORTED Rust 954:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PPM_PERFSTATE_DOMAIN_CHANGE_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x995e6b7f_d653_497a_b978_36a30c29bf01);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PPM_PERFSTATE_DOMAIN_EVENT` (
    public var `State`: UInt,
    public var `Latency`: UInt,
    public var `Speed`: UInt,
    public var `Processors`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PPM_PERFSTATE_EVENT` (
    public var `State`: UInt,
    public var `Status`: UInt,
    public var `Latency`: UInt,
    public var `Speed`: UInt,
    public var `Processor`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PPM_THERMALCHANGE_EVENT` (
    public var `ThermalConstraint`: UInt,
    public var `Processors`: ULong,
)
// UNSUPPORTED Rust 978:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PPM_THERMALCONSTRAINT_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa852c2c8_1a4c_423b_8c2c_f30d82931a88);

// UNSUPPORTED Rust 979:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PPM_THERMAL_POLICY_CHANGE_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x48f377b8_6880_4c7b_8bdc_380176c6654d);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PPM_THERMAL_POLICY_EVENT` (
    public var `Mode`: UByte,
    public var `Processors`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PPM_WMI_IDLE_STATE` (
    public var `Latency`: UInt,
    public var `Power`: UInt,
    public var `TimeCheck`: UInt,
    public var `PromotePercent`: UByte,
    public var `DemotePercent`: UByte,
    public var `StateType`: UByte,
    public var `Reserved`: UByte,
    public var `StateFlags`: UInt,
    public var `Context`: UInt,
    public var `IdleHandler`: UInt,
    public var `Reserved1`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PPM_WMI_IDLE_STATES` (
    public var `Type`: UInt,
    public var `Count`: UInt,
    public var `TargetState`: UInt,
    public var `OldState`: UInt,
    public var `TargetProcessors`: ULong,
    public var `State`: Array<`PPM_WMI_IDLE_STATE`>,
)
// UNSUPPORTED Rust 1011:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PPM_WMI_IDLE_STATES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PPM_WMI_IDLE_STATES_EX` (
    public var `Type`: UInt,
    public var `Count`: UInt,
    public var `TargetState`: UInt,
    public var `OldState`: UInt,
    public var `TargetProcessors`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `State`: Array<`PPM_WMI_IDLE_STATE`>,
)
// UNSUPPORTED Rust 1026:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PPM_WMI_IDLE_STATES_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PPM_WMI_LEGACY_PERFSTATE` (
    public var `Frequency`: UInt,
    public var `Flags`: UInt,
    public var `PercentFrequency`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PPM_WMI_PERF_STATE` (
    public var `Frequency`: UInt,
    public var `Power`: UInt,
    public var `PercentFrequency`: UByte,
    public var `IncreaseLevel`: UByte,
    public var `DecreaseLevel`: UByte,
    public var `Type`: UByte,
    public var `IncreaseTime`: UInt,
    public var `DecreaseTime`: UInt,
    public var `Control`: ULong,
    public var `Status`: ULong,
    public var `HitCount`: UInt,
    public var `Reserved1`: UInt,
    public var `Reserved2`: ULong,
    public var `Reserved3`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PPM_WMI_PERF_STATES` (
    public var `Count`: UInt,
    public var `MaxFrequency`: UInt,
    public var `CurrentState`: UInt,
    public var `MaxPerfState`: UInt,
    public var `MinPerfState`: UInt,
    public var `LowestPerfState`: UInt,
    public var `ThermalConstraint`: UInt,
    public var `BusyAdjThreshold`: UByte,
    public var `PolicyType`: UByte,
    public var `Type`: UByte,
    public var `Reserved`: UByte,
    public var `TimerInterval`: UInt,
    public var `TargetProcessors`: ULong,
    public var `PStateHandler`: UInt,
    public var `PStateContext`: UInt,
    public var `TStateHandler`: UInt,
    public var `TStateContext`: UInt,
    public var `FeedbackHandler`: UInt,
    public var `Reserved1`: UInt,
    public var `Reserved2`: ULong,
    public var `State`: Array<`PPM_WMI_PERF_STATE`>,
)
// UNSUPPORTED Rust 1081:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PPM_WMI_PERF_STATES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PPM_WMI_PERF_STATES_EX` (
    public var `Count`: UInt,
    public var `MaxFrequency`: UInt,
    public var `CurrentState`: UInt,
    public var `MaxPerfState`: UInt,
    public var `MinPerfState`: UInt,
    public var `LowestPerfState`: UInt,
    public var `ThermalConstraint`: UInt,
    public var `BusyAdjThreshold`: UByte,
    public var `PolicyType`: UByte,
    public var `Type`: UByte,
    public var `Reserved`: UByte,
    public var `TimerInterval`: UInt,
    public var `TargetProcessors`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `PStateHandler`: UInt,
    public var `PStateContext`: UInt,
    public var `TStateHandler`: UInt,
    public var `TStateContext`: UInt,
    public var `FeedbackHandler`: UInt,
    public var `Reserved1`: UInt,
    public var `Reserved2`: ULong,
    public var `State`: Array<`PPM_WMI_PERF_STATE`>,
)
// UNSUPPORTED Rust 1111:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PPM_WMI_PERF_STATES_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1116:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const PROCESSOR_NUMBER_PKEY: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x5724c81d_d5af_4c1f_a103_a06e28f204c6), pid: 1 };

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESSOR_OBJECT_INFO` (
    public var `PhysicalID`: UInt,
    public var `PBlkAddress`: UInt,
    public var `PBlkLength`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESSOR_OBJECT_INFO_EX` (
    public var `PhysicalID`: UInt,
    public var `PBlkAddress`: UInt,
    public var `PBlkLength`: UByte,
    public var `InitialApicId`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESSOR_POWER_INFORMATION` (
    public var `Number`: UInt,
    public var `MaxMhz`: UInt,
    public var `CurrentMhz`: UInt,
    public var `MhzLimit`: UInt,
    public var `MaxIdleState`: UInt,
    public var `CurrentIdleState`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESSOR_POWER_POLICY` (
    public var `Revision`: UInt,
    public var `DynamicThrottle`: UByte,
    public var `Spare`: UByteArray,
    public var `_bitfield`: UInt,
    public var `PolicyCount`: UInt,
    public var `Policy`: Array<`PROCESSOR_POWER_POLICY_INFO`>,
)
// UNSUPPORTED Rust 1152:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESSOR_POWER_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESSOR_POWER_POLICY_INFO` (
    public var `TimeCheck`: UInt,
    public var `DemoteLimit`: UInt,
    public var `PromoteLimit`: UInt,
    public var `DemotePercent`: UByte,
    public var `PromotePercent`: UByte,
    public var `Spare`: UByteArray,
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1168:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESSOR_POWER_POLICY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWRSCHEMESENUMPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, `windows_sys`.`core`.`PCWSTR`, UInt, `windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`POWER_POLICY`>?, `super`.`super`.`Foundation`.`LPARAM`) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWRSCHEMESENUMPROC_V1` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`POWER_POLICY`>?, `super`.`super`.`Foundation`.`LPARAM`) -> Boolean>>>;
public const val `PdcInvocation`: `POWER_INFORMATION_LEVEL` = 67;
public const val `PhysicalPowerButtonPress`: `POWER_INFORMATION_LEVEL` = 90;
public const val `PlatformIdleStates`: `POWER_INFORMATION_LEVEL` = 80;
public const val `PlatformIdleVeto`: `POWER_INFORMATION_LEVEL` = 82;
public const val `PlatformInformation`: `POWER_INFORMATION_LEVEL` = 66;
public const val `PlatformRole`: `POWER_INFORMATION_LEVEL` = 75;
public const val `PlatformRoleAppliancePC`: `POWER_PLATFORM_ROLE` = 6;
public const val `PlatformRoleDesktop`: `POWER_PLATFORM_ROLE` = 1;
public const val `PlatformRoleEnterpriseServer`: `POWER_PLATFORM_ROLE` = 4;
public const val `PlatformRoleMaximum`: `POWER_PLATFORM_ROLE` = 9;
public const val `PlatformRoleMobile`: `POWER_PLATFORM_ROLE` = 2;
public const val `PlatformRolePerformanceServer`: `POWER_PLATFORM_ROLE` = 7;
public const val `PlatformRoleSOHOServer`: `POWER_PLATFORM_ROLE` = 5;
public const val `PlatformRoleSlate`: `POWER_PLATFORM_ROLE` = 8;
public const val `PlatformRoleUnspecified`: `POWER_PLATFORM_ROLE` = 0;
public const val `PlatformRoleWorkstation`: `POWER_PLATFORM_ROLE` = 3;
public const val `PlmPowerRequestCreate`: `POWER_INFORMATION_LEVEL` = 72;
public const val `PoAc`: `SYSTEM_POWER_CONDITION` = 0;
public const val `PoConditionMaximum`: `SYSTEM_POWER_CONDITION` = 3;
public const val `PoDc`: `SYSTEM_POWER_CONDITION` = 1;
public const val `PoHot`: `SYSTEM_POWER_CONDITION` = 2;
public const val `PowerActionDisplayOff`: `POWER_ACTION` = 8;
public const val `PowerActionHibernate`: `POWER_ACTION` = 3;
public const val `PowerActionNone`: `POWER_ACTION` = 0;
public const val `PowerActionReserved`: `POWER_ACTION` = 1;
public const val `PowerActionShutdown`: `POWER_ACTION` = 4;
public const val `PowerActionShutdownOff`: `POWER_ACTION` = 6;
public const val `PowerActionShutdownReset`: `POWER_ACTION` = 5;
public const val `PowerActionSleep`: `POWER_ACTION` = 2;
public const val `PowerActionWarmEject`: `POWER_ACTION` = 7;
public const val `PowerDeviceD0`: `DEVICE_POWER_STATE` = 1;
public const val `PowerDeviceD1`: `DEVICE_POWER_STATE` = 2;
public const val `PowerDeviceD2`: `DEVICE_POWER_STATE` = 3;
public const val `PowerDeviceD3`: `DEVICE_POWER_STATE` = 4;
public const val `PowerDeviceMaximum`: `DEVICE_POWER_STATE` = 5;
public const val `PowerDeviceUnspecified`: `DEVICE_POWER_STATE` = 0;
public const val `PowerInformationInternal`: `POWER_INFORMATION_LEVEL` = 87;
public const val `PowerInformationLevelMaximum`: `POWER_INFORMATION_LEVEL` = 98;
public const val `PowerInformationLevelUnused0`: `POWER_INFORMATION_LEVEL` = 27;
public const val `PowerRequestAction`: `POWER_INFORMATION_LEVEL` = 44;
public const val `PowerRequestActionInternal`: `POWER_INFORMATION_LEVEL` = 85;
public const val `PowerRequestAwayModeRequired`: `POWER_REQUEST_TYPE` = 2;
public const val `PowerRequestCreate`: `POWER_INFORMATION_LEVEL` = 43;
public const val `PowerRequestDisplayRequired`: `POWER_REQUEST_TYPE` = 0;
public const val `PowerRequestExecutionRequired`: `POWER_REQUEST_TYPE` = 3;
public const val `PowerRequestSystemRequired`: `POWER_REQUEST_TYPE` = 1;
public const val `PowerSettingNotificationName`: `POWER_INFORMATION_LEVEL` = 58;
public const val `PowerShutdownNotification`: `POWER_INFORMATION_LEVEL` = 39;
public const val `PowerSystemHibernate`: `SYSTEM_POWER_STATE` = 5;
public const val `PowerSystemMaximum`: `SYSTEM_POWER_STATE` = 7;
public const val `PowerSystemShutdown`: `SYSTEM_POWER_STATE` = 6;
public const val `PowerSystemSleeping1`: `SYSTEM_POWER_STATE` = 2;
public const val `PowerSystemSleeping2`: `SYSTEM_POWER_STATE` = 3;
public const val `PowerSystemSleeping3`: `SYSTEM_POWER_STATE` = 4;
public const val `PowerSystemUnspecified`: `SYSTEM_POWER_STATE` = 0;
public const val `PowerSystemWorking`: `SYSTEM_POWER_STATE` = 1;
public const val `PowerUserInactive`: `USER_ACTIVITY_PRESENCE` = 2;
public const val `PowerUserInvalid`: `USER_ACTIVITY_PRESENCE` = 3;
public const val `PowerUserMaximum`: `USER_ACTIVITY_PRESENCE` = 3;
public const val `PowerUserNotPresent`: `USER_ACTIVITY_PRESENCE` = 1;
public const val `PowerUserPresent`: `USER_ACTIVITY_PRESENCE` = 0;
public const val `ProcessorCap`: `POWER_INFORMATION_LEVEL` = 34;
public const val `ProcessorIdleDomains`: `POWER_INFORMATION_LEVEL` = 49;
public const val `ProcessorIdleStates`: `POWER_INFORMATION_LEVEL` = 33;
public const val `ProcessorIdleStatesHv`: `POWER_INFORMATION_LEVEL` = 52;
public const val `ProcessorIdleVeto`: `POWER_INFORMATION_LEVEL` = 81;
public const val `ProcessorInformation`: `POWER_INFORMATION_LEVEL` = 11;
public const val `ProcessorInformationEx`: `POWER_INFORMATION_LEVEL` = 46;
public const val `ProcessorLoad`: `POWER_INFORMATION_LEVEL` = 38;
public const val `ProcessorPerfCapHv`: `POWER_INFORMATION_LEVEL` = 54;
public const val `ProcessorPerfStates`: `POWER_INFORMATION_LEVEL` = 32;
public const val `ProcessorPerfStatesHv`: `POWER_INFORMATION_LEVEL` = 53;
public const val `ProcessorPowerPolicyAc`: `POWER_INFORMATION_LEVEL` = 18;
public const val `ProcessorPowerPolicyCurrent`: `POWER_INFORMATION_LEVEL` = 22;
public const val `ProcessorPowerPolicyDc`: `POWER_INFORMATION_LEVEL` = 19;
public const val `ProcessorSetIdle`: `POWER_INFORMATION_LEVEL` = 55;
public const val `ProcessorStateHandler`: `POWER_INFORMATION_LEVEL` = 7;
public const val `ProcessorStateHandler2`: `POWER_INFORMATION_LEVEL` = 13;
public const val `QueryPotentialDripsConstraint`: `POWER_INFORMATION_LEVEL` = 91;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RESUME_PERFORMANCE` (
    public var `PostTimeMs`: UInt,
    public var `TotalResumeTimeMs`: ULong,
    public var `ResumeCompleteTimestamp`: ULong,
)
public const val `RegisterSpmPowerSettings`: `POWER_INFORMATION_LEVEL` = 79;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SET_POWER_SETTING_VALUE` (
    public var `Version`: UInt,
    public var `Guid`: `windows_sys`.`core`.`GUID`,
    public var `PowerCondition`: `SYSTEM_POWER_CONDITION`,
    public var `DataLength`: UInt,
    public var `Data`: UByteArray,
)
// UNSUPPORTED Rust 1271:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SET_POWER_SETTING_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYSTEM_BATTERY_STATE` (
    public var `AcOnLine`: Boolean,
    public var `BatteryPresent`: Boolean,
    public var `Charging`: Boolean,
    public var `Discharging`: Boolean,
    public var `Spare1`: BooleanArray,
    public var `Tag`: UByte,
    public var `MaxCapacity`: UInt,
    public var `RemainingCapacity`: UInt,
    public var `Rate`: UInt,
    public var `EstimatedTime`: UInt,
    public var `DefaultAlert1`: UInt,
    public var `DefaultAlert2`: UInt,
)
// UNSUPPORTED Rust 1292:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_BATTERY_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYSTEM_POWER_CAPABILITIES` (
    public var `PowerButtonPresent`: Boolean,
    public var `SleepButtonPresent`: Boolean,
    public var `LidPresent`: Boolean,
    public var `SystemS1`: Boolean,
    public var `SystemS2`: Boolean,
    public var `SystemS3`: Boolean,
    public var `SystemS4`: Boolean,
    public var `SystemS5`: Boolean,
    public var `HiberFilePresent`: Boolean,
    public var `FullWake`: Boolean,
    public var `VideoDimPresent`: Boolean,
    public var `ApmPresent`: Boolean,
    public var `UpsPresent`: Boolean,
    public var `ThermalControl`: Boolean,
    public var `ProcessorThrottle`: Boolean,
    public var `ProcessorMinThrottle`: UByte,
    public var `ProcessorMaxThrottle`: UByte,
    public var `FastSystemS4`: Boolean,
    public var `Hiberboot`: Boolean,
    public var `WakeAlarmPresent`: Boolean,
    public var `AoAc`: Boolean,
    public var `DiskSpinDown`: Boolean,
    public var `HiberFileType`: UByte,
    public var `AoAcConnectivitySupported`: Boolean,
    public var `spare3`: UByteArray,
    public var `SystemBatteriesPresent`: Boolean,
    public var `BatteriesAreShortTerm`: Boolean,
    public var `BatteryScale`: Array<`BATTERY_REPORTING_SCALE`>,
    public var `AcOnLineWake`: `SYSTEM_POWER_STATE`,
    public var `SoftLidWake`: `SYSTEM_POWER_STATE`,
    public var `RtcWake`: `SYSTEM_POWER_STATE`,
    public var `MinDeviceWakeState`: `SYSTEM_POWER_STATE`,
    public var `DefaultLowLatencyWake`: `SYSTEM_POWER_STATE`,
)
// UNSUPPORTED Rust 1334:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_POWER_CAPABILITIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SYSTEM_POWER_CONDITION` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SYSTEM_POWER_INFORMATION` (
    public var `MaxIdlenessAllowed`: UInt,
    public var `Idleness`: UInt,
    public var `TimeRemaining`: UInt,
    public var `CoolingMode`: `POWER_COOLING_MODE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYSTEM_POWER_LEVEL` (
    public var `Enable`: Boolean,
    public var `Spare`: UByteArray,
    public var `BatteryLevel`: UInt,
    public var `PowerPolicy`: `POWER_ACTION_POLICY`,
    public var `MinSystemState`: `SYSTEM_POWER_STATE`,
)
// UNSUPPORTED Rust 1357:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_POWER_LEVEL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYSTEM_POWER_POLICY` (
    public var `Revision`: UInt,
    public var `PowerButton`: `POWER_ACTION_POLICY`,
    public var `SleepButton`: `POWER_ACTION_POLICY`,
    public var `LidClose`: `POWER_ACTION_POLICY`,
    public var `LidOpenWake`: `SYSTEM_POWER_STATE`,
    public var `Reserved`: UInt,
    public var `Idle`: `POWER_ACTION_POLICY`,
    public var `IdleTimeout`: UInt,
    public var `IdleSensitivity`: UByte,
    public var `DynamicThrottle`: UByte,
    public var `Spare2`: UByteArray,
    public var `MinSleep`: `SYSTEM_POWER_STATE`,
    public var `MaxSleep`: `SYSTEM_POWER_STATE`,
    public var `ReducedLatencySleep`: `SYSTEM_POWER_STATE`,
    public var `WinLogonFlags`: UInt,
    public var `Spare3`: UInt,
    public var `DozeS4Timeout`: UInt,
    public var `BroadcastCapacityResolution`: UInt,
    public var `DischargePolicy`: Array<`SYSTEM_POWER_LEVEL`>,
    public var `VideoTimeout`: UInt,
    public var `VideoDimDisplay`: Boolean,
    public var `VideoReserved`: UIntArray,
    public var `SpindownTimeout`: UInt,
    public var `OptimizeForPower`: Boolean,
    public var `FanThrottleTolerance`: UByte,
    public var `ForcedThrottle`: UByte,
    public var `MinThrottle`: UByte,
    public var `OverThrottled`: `POWER_ACTION_POLICY`,
)
// UNSUPPORTED Rust 1394:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_POWER_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SYSTEM_POWER_STATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SYSTEM_POWER_STATUS` (
    public var `ACLineStatus`: UByte,
    public var `BatteryFlag`: UByte,
    public var `BatteryLifePercent`: UByte,
    public var `SystemStatusFlag`: UByte,
    public var `BatteryLifeTime`: UInt,
    public var `BatteryFullLifeTime`: UInt,
)
public const val `SYS_BUTTON_LID`: UInt = 4u;
public const val `SYS_BUTTON_LID_CHANGED`: UInt = 524288u;
public const val `SYS_BUTTON_LID_CLOSED`: UInt = 131072u;
public const val `SYS_BUTTON_LID_INITIAL`: UInt = 262144u;
public const val `SYS_BUTTON_LID_OPEN`: UInt = 65536u;
public const val `SYS_BUTTON_LID_STATE_MASK`: UInt = 196608u;
public const val `SYS_BUTTON_POWER`: UInt = 1u;
public const val `SYS_BUTTON_SLEEP`: UInt = 2u;
public const val `SYS_BUTTON_WAKE`: UInt = 2147483648u;
public const val `ScreenOff`: `POWER_INFORMATION_LEVEL` = 73;
public const val `SendSuspendResumeNotification`: `POWER_INFORMATION_LEVEL` = 96;
public const val `SessionAllowExternalDmaDevices`: `POWER_INFORMATION_LEVEL` = 95;
public const val `SessionConnectNotification`: `POWER_INFORMATION_LEVEL` = 62;
public const val `SessionDisplayState`: `POWER_INFORMATION_LEVEL` = 42;
public const val `SessionLockState`: `POWER_INFORMATION_LEVEL` = 64;
public const val `SessionPowerCleanup`: `POWER_INFORMATION_LEVEL` = 63;
public const val `SessionPowerInit`: `POWER_INFORMATION_LEVEL` = 41;
public const val `SessionRITState`: `POWER_INFORMATION_LEVEL` = 61;
public const val `SetPowerSettingValue`: `POWER_INFORMATION_LEVEL` = 25;
public const val `SetShutdownSelectedTime`: `POWER_INFORMATION_LEVEL` = 70;
public const val `SuspendResumeInvocation`: `POWER_INFORMATION_LEVEL` = 71;
public const val `SystemBatteryState`: `POWER_INFORMATION_LEVEL` = 5;
public const val `SystemBatteryStatePrecise`: `POWER_INFORMATION_LEVEL` = 83;
public const val `SystemExecutionState`: `POWER_INFORMATION_LEVEL` = 16;
public const val `SystemHiberFileInformation`: `POWER_INFORMATION_LEVEL` = 36;
public const val `SystemHiberFileSize`: `POWER_INFORMATION_LEVEL` = 51;
public const val `SystemHiberFileType`: `POWER_INFORMATION_LEVEL` = 89;
public const val `SystemHiberbootState`: `POWER_INFORMATION_LEVEL` = 65;
public const val `SystemMonitorHiberBootPowerOff`: `POWER_INFORMATION_LEVEL` = 28;
public const val `SystemPowerCapabilities`: `POWER_INFORMATION_LEVEL` = 4;
public const val `SystemPowerInformation`: `POWER_INFORMATION_LEVEL` = 12;
public const val `SystemPowerLoggingEntry`: `POWER_INFORMATION_LEVEL` = 24;
public const val `SystemPowerPolicyAc`: `POWER_INFORMATION_LEVEL` = 0;
public const val `SystemPowerPolicyCurrent`: `POWER_INFORMATION_LEVEL` = 8;
public const val `SystemPowerPolicyDc`: `POWER_INFORMATION_LEVEL` = 1;
public const val `SystemPowerStateHandler`: `POWER_INFORMATION_LEVEL` = 6;
public const val `SystemPowerStateLogging`: `POWER_INFORMATION_LEVEL` = 23;
public const val `SystemPowerStateNotifyHandler`: `POWER_INFORMATION_LEVEL` = 17;
public const val `SystemReserveHiberFile`: `POWER_INFORMATION_LEVEL` = 10;
public const val `SystemVideoState`: `POWER_INFORMATION_LEVEL` = 29;
public const val `SystemWakeSource`: `POWER_INFORMATION_LEVEL` = 35;
public const val `THERMAL_COOLING_INTERFACE_VERSION`: UInt = 1u;
public const val `THERMAL_DEVICE_INTERFACE_VERSION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `THERMAL_EVENT` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Type`: UInt,
    public var `Temperature`: UInt,
    public var `TripPointTemperature`: UInt,
    public var `Initiator`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1463:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for THERMAL_EVENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `THERMAL_EVENT_VERSION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 10 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `THERMAL_INFORMATION` (
    public var `ThermalStamp`: UInt,
    public var `ThermalConstant1`: UInt,
    public var `ThermalConstant2`: UInt,
    public var `Processors`: ULong,
    public var `SamplingPeriod`: UInt,
    public var `CurrentTemperature`: UInt,
    public var `PassiveTripPoint`: UInt,
    public var `CriticalTripPoint`: UInt,
    public var `ActiveTripPointCount`: UByte,
    public var `ActiveTripPoint`: UIntArray,
)
// UNSUPPORTED Rust 1483:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for THERMAL_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `THERMAL_POLICY` (
    public var `Version`: UInt,
    public var `WaitForUpdate`: Boolean,
    public var `Hibernate`: Boolean,
    public var `Critical`: Boolean,
    public var `ThermalStandby`: Boolean,
    public var `ActivationReasons`: UInt,
    public var `PassiveLimit`: UInt,
    public var `ActiveLevel`: UInt,
    public var `OverThrottled`: Boolean,
)
public const val `THERMAL_POLICY_VERSION_1`: UInt = 1u;
public const val `THERMAL_POLICY_VERSION_2`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `THERMAL_WAIT_READ` (
    public var `Timeout`: UInt,
    public var `LowTemperature`: UInt,
    public var `HighTemperature`: UInt,
)
public const val `TZ_ACTIVATION_REASON_CURRENT`: UInt = 2u;
public const val `TZ_ACTIVATION_REASON_THERMAL`: UInt = 1u;
public const val `ThermalEvent`: `POWER_INFORMATION_LEVEL` = 84;
public const val `ThermalStandby`: `POWER_INFORMATION_LEVEL` = 88;
public const val `TraceApplicationPowerMessage`: `POWER_INFORMATION_LEVEL` = 30;
public const val `TraceApplicationPowerMessageEnd`: `POWER_INFORMATION_LEVEL` = 31;
public const val `TraceServicePowerMessage`: `POWER_INFORMATION_LEVEL` = 37;
public const val `UNKNOWN_CAPACITY`: UInt = 4294967295u;
public const val `UNKNOWN_CURRENT`: UInt = 4294967295u;
public const val `UNKNOWN_RATE`: UInt = 2147483648u;
public const val `UNKNOWN_VOLTAGE`: UInt = 4294967295u;
public typealias `USB_CHARGER_PORT` = Int;
public typealias `USER_ACTIVITY_PRESENCE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USER_POWER_POLICY` (
    public var `Revision`: UInt,
    public var `IdleAc`: `POWER_ACTION_POLICY`,
    public var `IdleDc`: `POWER_ACTION_POLICY`,
    public var `IdleTimeoutAc`: UInt,
    public var `IdleTimeoutDc`: UInt,
    public var `IdleSensitivityAc`: UByte,
    public var `IdleSensitivityDc`: UByte,
    public var `ThrottlePolicyAc`: UByte,
    public var `ThrottlePolicyDc`: UByte,
    public var `MaxSleepAc`: `SYSTEM_POWER_STATE`,
    public var `MaxSleepDc`: `SYSTEM_POWER_STATE`,
    public var `Reserved`: UIntArray,
    public var `VideoTimeoutAc`: UInt,
    public var `VideoTimeoutDc`: UInt,
    public var `SpindownTimeoutAc`: UInt,
    public var `SpindownTimeoutDc`: UInt,
    public var `OptimizeForPowerAc`: Boolean,
    public var `OptimizeForPowerDc`: Boolean,
    public var `FanThrottleToleranceAc`: UByte,
    public var `FanThrottleToleranceDc`: UByte,
    public var `ForcedThrottleAc`: UByte,
    public var `ForcedThrottleDc`: UByte,
)
// UNSUPPORTED Rust 1549:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USER_POWER_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `UpdateBlackBoxRecorder`: `POWER_INFORMATION_LEVEL` = 94;
public const val `UsbChargerPort_Legacy`: `USB_CHARGER_PORT` = 0;
public const val `UsbChargerPort_Max`: `USB_CHARGER_PORT` = 2;
public const val `UsbChargerPort_TypeC`: `USB_CHARGER_PORT` = 1;
public const val `UserNotPresent`: `POWER_USER_PRESENCE_TYPE` = 0;
public const val `UserPresence`: `POWER_INFORMATION_LEVEL` = 57;
public const val `UserPresent`: `POWER_USER_PRESENCE_TYPE` = 1;
public const val `UserUnknown`: `POWER_USER_PRESENCE_TYPE` = 255;
public const val `VerifyProcessorPowerPolicyAc`: `POWER_INFORMATION_LEVEL` = 20;
public const val `VerifyProcessorPowerPolicyDc`: `POWER_INFORMATION_LEVEL` = 21;
public const val `VerifySystemPolicyAc`: `POWER_INFORMATION_LEVEL` = 2;
public const val `VerifySystemPolicyDc`: `POWER_INFORMATION_LEVEL` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WAKE_ALARM_INFORMATION` (
    public var `TimerIdentifier`: UInt,
    public var `Timeout`: UInt,
)
public const val `WakeTimerList`: `POWER_INFORMATION_LEVEL` = 50;
