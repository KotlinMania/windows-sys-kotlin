// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ChangeServiceConfig2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ChangeServiceConfig2A`(`hservice` : `SC_HANDLE`, `dwinfolevel` : `SERVICE_CONFIG`, `lpinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ChangeServiceConfig2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ChangeServiceConfig2W`(`hservice` : `SC_HANDLE`, `dwinfolevel` : `SERVICE_CONFIG`, `lpinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ChangeServiceConfigA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ChangeServiceConfigA`(`hservice` : `SC_HANDLE`, `dwservicetype` : `ENUM_SERVICE_TYPE`, `dwstarttype` : `SERVICE_START_TYPE`, `dwerrorcontrol` : `SERVICE_ERROR`, `lpbinarypathname` : `windows_sys`.`core`.`PCSTR`, `lploadordergroup` : `windows_sys`.`core`.`PCSTR`, `lpdwtagid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdependencies` : `windows_sys`.`core`.`PCSTR`, `lpservicestartname` : `windows_sys`.`core`.`PCSTR`, `lppassword` : `windows_sys`.`core`.`PCSTR`, `lpdisplayname` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ChangeServiceConfigW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ChangeServiceConfigW`(`hservice` : `SC_HANDLE`, `dwservicetype` : `ENUM_SERVICE_TYPE`, `dwstarttype` : `SERVICE_START_TYPE`, `dwerrorcontrol` : `SERVICE_ERROR`, `lpbinarypathname` : `windows_sys`.`core`.`PCWSTR`, `lploadordergroup` : `windows_sys`.`core`.`PCWSTR`, `lpdwtagid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdependencies` : `windows_sys`.`core`.`PCWSTR`, `lpservicestartname` : `windows_sys`.`core`.`PCWSTR`, `lppassword` : `windows_sys`.`core`.`PCWSTR`, `lpdisplayname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CloseServiceHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CloseServiceHandle`(`hscobject` : `SC_HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ControlService; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ControlService`(`hservice` : `SC_HANDLE`, `dwcontrol` : UInt, `lpservicestatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SERVICE_STATUS`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ControlServiceExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ControlServiceExA`(`hservice` : `SC_HANDLE`, `dwcontrol` : UInt, `dwinfolevel` : UInt, `pcontrolparams` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ControlServiceExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ControlServiceExW`(`hservice` : `SC_HANDLE`, `dwcontrol` : UInt, `dwinfolevel` : UInt, `pcontrolparams` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CreateServiceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateServiceA`(`hscmanager` : `SC_HANDLE`, `lpservicename` : `windows_sys`.`core`.`PCSTR`, `lpdisplayname` : `windows_sys`.`core`.`PCSTR`, `dwdesiredaccess` : UInt, `dwservicetype` : `ENUM_SERVICE_TYPE`, `dwstarttype` : `SERVICE_START_TYPE`, `dwerrorcontrol` : `SERVICE_ERROR`, `lpbinarypathname` : `windows_sys`.`core`.`PCSTR`, `lploadordergroup` : `windows_sys`.`core`.`PCSTR`, `lpdwtagid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdependencies` : `windows_sys`.`core`.`PCSTR`, `lpservicestartname` : `windows_sys`.`core`.`PCSTR`, `lppassword` : `windows_sys`.`core`.`PCSTR`) : `SC_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CreateServiceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateServiceW`(`hscmanager` : `SC_HANDLE`, `lpservicename` : `windows_sys`.`core`.`PCWSTR`, `lpdisplayname` : `windows_sys`.`core`.`PCWSTR`, `dwdesiredaccess` : UInt, `dwservicetype` : `ENUM_SERVICE_TYPE`, `dwstarttype` : `SERVICE_START_TYPE`, `dwerrorcontrol` : `SERVICE_ERROR`, `lpbinarypathname` : `windows_sys`.`core`.`PCWSTR`, `lploadordergroup` : `windows_sys`.`core`.`PCWSTR`, `lpdwtagid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdependencies` : `windows_sys`.`core`.`PCWSTR`, `lpservicestartname` : `windows_sys`.`core`.`PCWSTR`, `lppassword` : `windows_sys`.`core`.`PCWSTR`) : `SC_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=DeleteService; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteService`(`hservice` : `SC_HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EnumDependentServicesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumDependentServicesA`(`hservice` : `SC_HANDLE`, `dwservicestate` : `ENUM_SERVICE_STATE`, `lpservices` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ENUM_SERVICE_STATUSA`>?, `cbbufsize` : UInt, `pcbbytesneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpservicesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EnumDependentServicesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumDependentServicesW`(`hservice` : `SC_HANDLE`, `dwservicestate` : `ENUM_SERVICE_STATE`, `lpservices` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ENUM_SERVICE_STATUSW`>?, `cbbufsize` : UInt, `pcbbytesneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpservicesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EnumServicesStatusA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumServicesStatusA`(`hscmanager` : `SC_HANDLE`, `dwservicetype` : `ENUM_SERVICE_TYPE`, `dwservicestate` : `ENUM_SERVICE_STATE`, `lpservices` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ENUM_SERVICE_STATUSA`>?, `cbbufsize` : UInt, `pcbbytesneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpservicesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpresumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EnumServicesStatusExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumServicesStatusExA`(`hscmanager` : `SC_HANDLE`, `infolevel` : `SC_ENUM_TYPE`, `dwservicetype` : `ENUM_SERVICE_TYPE`, `dwservicestate` : `ENUM_SERVICE_STATE`, `lpservices` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbufsize` : UInt, `pcbbytesneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpservicesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpresumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pszgroupname` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EnumServicesStatusExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumServicesStatusExW`(`hscmanager` : `SC_HANDLE`, `infolevel` : `SC_ENUM_TYPE`, `dwservicetype` : `ENUM_SERVICE_TYPE`, `dwservicestate` : `ENUM_SERVICE_STATE`, `lpservices` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbufsize` : UInt, `pcbbytesneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpservicesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpresumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pszgroupname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EnumServicesStatusW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumServicesStatusW`(`hscmanager` : `SC_HANDLE`, `dwservicetype` : `ENUM_SERVICE_TYPE`, `dwservicestate` : `ENUM_SERVICE_STATE`, `lpservices` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ENUM_SERVICE_STATUSW`>?, `cbbufsize` : UInt, `pcbbytesneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpservicesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpresumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-service-core-l1-1-4.dll, ABI=system, export=GetServiceDirectory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetServiceDirectory`(`hservicestatus` : `SERVICE_STATUS_HANDLE`, `edirectorytype` : `SERVICE_DIRECTORY_TYPE`, `lppathbuffer` : `windows_sys`.`core`.`PWSTR`, `cchpathbufferlength` : UInt, `lpcchrequiredbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetServiceDisplayNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetServiceDisplayNameA`(`hscmanager` : `SC_HANDLE`, `lpservicename` : `windows_sys`.`core`.`PCSTR`, `lpdisplayname` : `windows_sys`.`core`.`PSTR`, `lpcchbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetServiceDisplayNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetServiceDisplayNameW`(`hscmanager` : `SC_HANDLE`, `lpservicename` : `windows_sys`.`core`.`PCWSTR`, `lpdisplayname` : `windows_sys`.`core`.`PWSTR`, `lpcchbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetServiceKeyNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetServiceKeyNameA`(`hscmanager` : `SC_HANDLE`, `lpdisplayname` : `windows_sys`.`core`.`PCSTR`, `lpservicename` : `windows_sys`.`core`.`PSTR`, `lpcchbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetServiceKeyNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetServiceKeyNameW`(`hscmanager` : `SC_HANDLE`, `lpdisplayname` : `windows_sys`.`core`.`PCWSTR`, `lpservicename` : `windows_sys`.`core`.`PWSTR`, `lpcchbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-service-core-l1-1-3.dll, ABI=system, export=GetServiceRegistryStateKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `GetServiceRegistryStateKey`(`servicestatushandle` : `SERVICE_STATUS_HANDLE`, `statetype` : `SERVICE_REGISTRY_STATE_TYPE`, `accessmask` : UInt, `servicestatekey` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Registry`.`HKEY`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-service-core-l1-1-5.dll, ABI=system, export=GetSharedServiceDirectory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSharedServiceDirectory`(`servicehandle` : `SC_HANDLE`, `directorytype` : `SERVICE_SHARED_DIRECTORY_TYPE`, `pathbuffer` : `windows_sys`.`core`.`PWSTR`, `pathbufferlength` : UInt, `requiredbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-service-core-l1-1-5.dll, ABI=system, export=GetSharedServiceRegistryStateKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `GetSharedServiceRegistryStateKey`(`servicehandle` : `SC_HANDLE`, `statetype` : `SERVICE_SHARED_REGISTRY_STATE_TYPE`, `accessmask` : UInt, `servicestatekey` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Registry`.`HKEY`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=LockServiceDatabase; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LockServiceDatabase`(`hscmanager` : `SC_HANDLE`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=NotifyBootConfigStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NotifyBootConfigStatus`(`bootacceptable` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=NotifyServiceStatusChangeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NotifyServiceStatusChangeA`(`hservice` : `SC_HANDLE`, `dwnotifymask` : `SERVICE_NOTIFY`, `pnotifybuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`SERVICE_NOTIFY_2A`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=NotifyServiceStatusChangeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NotifyServiceStatusChangeW`(`hservice` : `SC_HANDLE`, `dwnotifymask` : `SERVICE_NOTIFY`, `pnotifybuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`SERVICE_NOTIFY_2W`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=OpenSCManagerA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenSCManagerA`(`lpmachinename` : `windows_sys`.`core`.`PCSTR`, `lpdatabasename` : `windows_sys`.`core`.`PCSTR`, `dwdesiredaccess` : UInt) : `SC_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=OpenSCManagerW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenSCManagerW`(`lpmachinename` : `windows_sys`.`core`.`PCWSTR`, `lpdatabasename` : `windows_sys`.`core`.`PCWSTR`, `dwdesiredaccess` : UInt) : `SC_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=OpenServiceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenServiceA`(`hscmanager` : `SC_HANDLE`, `lpservicename` : `windows_sys`.`core`.`PCSTR`, `dwdesiredaccess` : UInt) : `SC_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=OpenServiceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenServiceW`(`hscmanager` : `SC_HANDLE`, `lpservicename` : `windows_sys`.`core`.`PCWSTR`, `dwdesiredaccess` : UInt) : `SC_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=QueryServiceConfig2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryServiceConfig2A`(`hservice` : `SC_HANDLE`, `dwinfolevel` : `SERVICE_CONFIG`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbufsize` : UInt, `pcbbytesneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=QueryServiceConfig2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryServiceConfig2W`(`hservice` : `SC_HANDLE`, `dwinfolevel` : `SERVICE_CONFIG`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbufsize` : UInt, `pcbbytesneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=QueryServiceConfigA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryServiceConfigA`(`hservice` : `SC_HANDLE`, `lpserviceconfig` : /* Rust *mut */ kotlinx.cinterop.CPointer<`QUERY_SERVICE_CONFIGA`>?, `cbbufsize` : UInt, `pcbbytesneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=QueryServiceConfigW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryServiceConfigW`(`hservice` : `SC_HANDLE`, `lpserviceconfig` : /* Rust *mut */ kotlinx.cinterop.CPointer<`QUERY_SERVICE_CONFIGW`>?, `cbbufsize` : UInt, `pcbbytesneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=QueryServiceDynamicInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryServiceDynamicInformation`(`hservicestatus` : `SERVICE_STATUS_HANDLE`, `dwinfolevel` : UInt, `ppdynamicinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=QueryServiceLockStatusA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryServiceLockStatusA`(`hscmanager` : `SC_HANDLE`, `lplockstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`QUERY_SERVICE_LOCK_STATUSA`>?, `cbbufsize` : UInt, `pcbbytesneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=QueryServiceLockStatusW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryServiceLockStatusW`(`hscmanager` : `SC_HANDLE`, `lplockstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`QUERY_SERVICE_LOCK_STATUSW`>?, `cbbufsize` : UInt, `pcbbytesneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=QueryServiceObjectSecurity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `QueryServiceObjectSecurity`(`hservice` : `SC_HANDLE`, `dwsecurityinformation` : UInt, `lpsecuritydescriptor` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`, `cbbufsize` : UInt, `pcbbytesneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=QueryServiceStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryServiceStatus`(`hservice` : `SC_HANDLE`, `lpservicestatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SERVICE_STATUS`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=QueryServiceStatusEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryServiceStatusEx`(`hservice` : `SC_HANDLE`, `infolevel` : `SC_STATUS_TYPE`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbbufsize` : UInt, `pcbbytesneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegisterServiceCtrlHandlerA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterServiceCtrlHandlerA`(`lpservicename` : `windows_sys`.`core`.`PCSTR`, `lphandlerproc` : `LPHANDLER_FUNCTION`) : `SERVICE_STATUS_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegisterServiceCtrlHandlerExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterServiceCtrlHandlerExA`(`lpservicename` : `windows_sys`.`core`.`PCSTR`, `lphandlerproc` : `LPHANDLER_FUNCTION_EX`, `lpcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `SERVICE_STATUS_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegisterServiceCtrlHandlerExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterServiceCtrlHandlerExW`(`lpservicename` : `windows_sys`.`core`.`PCWSTR`, `lphandlerproc` : `LPHANDLER_FUNCTION_EX`, `lpcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `SERVICE_STATUS_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegisterServiceCtrlHandlerW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterServiceCtrlHandlerW`(`lpservicename` : `windows_sys`.`core`.`PCWSTR`, `lphandlerproc` : `LPHANDLER_FUNCTION`) : `SERVICE_STATUS_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SetServiceBits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetServiceBits`(`hservicestatus` : `SERVICE_STATUS_HANDLE`, `dwservicebits` : UInt, `bsetbitson` : `windows_sys`.`core`.`BOOL`, `bupdateimmediately` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SetServiceObjectSecurity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `SetServiceObjectSecurity`(`hservice` : `SC_HANDLE`, `dwsecurityinformation` : `super`.`super`.`Security`.`OBJECT_SECURITY_INFORMATION`, `lpsecuritydescriptor` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SetServiceStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetServiceStatus`(`hservicestatus` : `SERVICE_STATUS_HANDLE`, `lpservicestatus` : /* Rust *const */ kotlinx.cinterop.CPointer<`SERVICE_STATUS`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=StartServiceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StartServiceA`(`hservice` : `SC_HANDLE`, `dwnumserviceargs` : UInt, `lpserviceargvectors` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCSTR`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=StartServiceCtrlDispatcherA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StartServiceCtrlDispatcherA`(`lpservicestarttable` : /* Rust *const */ kotlinx.cinterop.CPointer<`SERVICE_TABLE_ENTRYA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=StartServiceCtrlDispatcherW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StartServiceCtrlDispatcherW`(`lpservicestarttable` : /* Rust *const */ kotlinx.cinterop.CPointer<`SERVICE_TABLE_ENTRYW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=StartServiceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StartServiceW`(`hservice` : `SC_HANDLE`, `dwnumserviceargs` : UInt, `lpserviceargvectors` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sechost.dll, ABI=system, export=SubscribeServiceChangeNotifications; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SubscribeServiceChangeNotifications`(`hservice` : `SC_HANDLE`, `eeventtype` : `SC_EVENT_TYPE`, `pcallback` : `PSC_NOTIFICATION_CALLBACK`, `pcallbackcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `psubscription` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PSC_NOTIFICATION_REGISTRATION`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=UnlockServiceDatabase; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnlockServiceDatabase`(`sclock` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sechost.dll, ABI=system, export=UnsubscribeServiceChangeNotifications; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnsubscribeServiceChangeNotifications`(`psubscription` : `PSC_NOTIFICATION_REGISTRATION`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=WaitServiceState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WaitServiceState`(`hservice` : `SC_HANDLE`, `dwnotify` : UInt, `dwtimeout` : UInt, `hcancelevent` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// UNSUPPORTED Rust 63:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CUSTOM_SYSTEM_STATE_CHANGE_EVENT_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2d7a2816_0c5e_45fc_9ce7_570e5ecde9c9);

// UNSUPPORTED Rust 64:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DOMAIN_JOIN_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1ce20aba_9851_4421_9430_1ddeb766e809);

// UNSUPPORTED Rust 65:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DOMAIN_LEAVE_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xddaf516e_58c2_4866_9574_c3b615d42ea1);

public typealias `ENUM_SERVICE_STATE` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENUM_SERVICE_STATUSA` (
    public var `lpServiceName`: `windows_sys`.`core`.`PSTR`,
    public var `lpDisplayName`: `windows_sys`.`core`.`PSTR`,
    public var `ServiceStatus`: `SERVICE_STATUS`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ENUM_SERVICE_STATUSA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ENUM_SERVICE_STATUSA`.Companion.`default`() : `ENUM_SERVICE_STATUSA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENUM_SERVICE_STATUSW` (
    public var `lpServiceName`: `windows_sys`.`core`.`PWSTR`,
    public var `lpDisplayName`: `windows_sys`.`core`.`PWSTR`,
    public var `ServiceStatus`: `SERVICE_STATUS`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ENUM_SERVICE_STATUSW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ENUM_SERVICE_STATUSW`.Companion.`default`() : `ENUM_SERVICE_STATUSW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENUM_SERVICE_STATUS_PROCESSA` (
    public var `lpServiceName`: `windows_sys`.`core`.`PSTR`,
    public var `lpDisplayName`: `windows_sys`.`core`.`PSTR`,
    public var `ServiceStatusProcess`: `SERVICE_STATUS_PROCESS`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ENUM_SERVICE_STATUS_PROCESSA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ENUM_SERVICE_STATUS_PROCESSA`.Companion.`default`() : `ENUM_SERVICE_STATUS_PROCESSA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENUM_SERVICE_STATUS_PROCESSW` (
    public var `lpServiceName`: `windows_sys`.`core`.`PWSTR`,
    public var `lpDisplayName`: `windows_sys`.`core`.`PWSTR`,
    public var `ServiceStatusProcess`: `SERVICE_STATUS_PROCESS`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ENUM_SERVICE_STATUS_PROCESSW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ENUM_SERVICE_STATUS_PROCESSW`.Companion.`default`() : `ENUM_SERVICE_STATUS_PROCESSW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `ENUM_SERVICE_TYPE` = UInt;
// UNSUPPORTED Rust 116:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FIREWALL_PORT_CLOSE_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa144ed38_8e12_4de4_9d96_e64740b1a524);

// UNSUPPORTED Rust 117:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FIREWALL_PORT_OPEN_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb7569e07_8421_4ee0_ad10_86915afdad09);

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HANDLER_FUNCTION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HANDLER_FUNCTION_EX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPHANDLER_FUNCTION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPHANDLER_FUNCTION_EX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPSERVICE_MAIN_FUNCTIONA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPSERVICE_MAIN_FUNCTIONW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) -> Unit>>>;
// UNSUPPORTED Rust 124:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MACHINE_POLICY_PRESENT_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x659fcae6_5bdb_4da9_b1ff_ca2a178d46e0);

public const val `MaxServiceRegistryStateType`: `SERVICE_REGISTRY_STATE_TYPE` = 2;
// UNSUPPORTED Rust 126:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const NAMED_PIPE_EVENT_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1f81d131_3fac_4537_9e0c_7e7b0c2f4b55);

// UNSUPPORTED Rust 127:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const NETWORK_MANAGER_FIRST_IP_ADDRESS_ARRIVAL_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4f27f2de_14e2_430b_a549_7cd48cbc8245);

// UNSUPPORTED Rust 128:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const NETWORK_MANAGER_LAST_IP_ADDRESS_REMOVAL_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcc4ba62a_162e_4648_847a_b6bdf993e335);

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_SC_NOTIFY_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSC_NOTIFICATION_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public typealias `PSC_NOTIFICATION_REGISTRATION` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `QUERY_SERVICE_CONFIGA` (
    public var `dwServiceType`: `ENUM_SERVICE_TYPE`,
    public var `dwStartType`: `SERVICE_START_TYPE`,
    public var `dwErrorControl`: `SERVICE_ERROR`,
    public var `lpBinaryPathName`: `windows_sys`.`core`.`PSTR`,
    public var `lpLoadOrderGroup`: `windows_sys`.`core`.`PSTR`,
    public var `dwTagId`: UInt,
    public var `lpDependencies`: `windows_sys`.`core`.`PSTR`,
    public var `lpServiceStartName`: `windows_sys`.`core`.`PSTR`,
    public var `lpDisplayName`: `windows_sys`.`core`.`PSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `QUERY_SERVICE_CONFIGA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `QUERY_SERVICE_CONFIGA`.Companion.`default`() : `QUERY_SERVICE_CONFIGA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `QUERY_SERVICE_CONFIGW` (
    public var `dwServiceType`: `ENUM_SERVICE_TYPE`,
    public var `dwStartType`: `SERVICE_START_TYPE`,
    public var `dwErrorControl`: `SERVICE_ERROR`,
    public var `lpBinaryPathName`: `windows_sys`.`core`.`PWSTR`,
    public var `lpLoadOrderGroup`: `windows_sys`.`core`.`PWSTR`,
    public var `dwTagId`: UInt,
    public var `lpDependencies`: `windows_sys`.`core`.`PWSTR`,
    public var `lpServiceStartName`: `windows_sys`.`core`.`PWSTR`,
    public var `lpDisplayName`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `QUERY_SERVICE_CONFIGW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `QUERY_SERVICE_CONFIGW`.Companion.`default`() : `QUERY_SERVICE_CONFIGW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `QUERY_SERVICE_LOCK_STATUSA` (
    public var `fIsLocked`: UInt,
    public var `lpLockOwner`: `windows_sys`.`core`.`PSTR`,
    public var `dwLockDuration`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `QUERY_SERVICE_LOCK_STATUSA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `QUERY_SERVICE_LOCK_STATUSA`.Companion.`default`() : `QUERY_SERVICE_LOCK_STATUSA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `QUERY_SERVICE_LOCK_STATUSW` (
    public var `fIsLocked`: UInt,
    public var `lpLockOwner`: `windows_sys`.`core`.`PWSTR`,
    public var `dwLockDuration`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `QUERY_SERVICE_LOCK_STATUSW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `QUERY_SERVICE_LOCK_STATUSW`.Companion.`default`() : `QUERY_SERVICE_LOCK_STATUSW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 192:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const RPC_INTERFACE_EVENT_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbc90d167_9470_4139_a9ba_be0bbbf5b74d);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SC_ACTION` (
    public var `Type`: `SC_ACTION_TYPE`,
    public var `Delay`: UInt,
)
public const val `SC_ACTION_NONE`: `SC_ACTION_TYPE` = 0;
public const val `SC_ACTION_OWN_RESTART`: `SC_ACTION_TYPE` = 4;
public const val `SC_ACTION_REBOOT`: `SC_ACTION_TYPE` = 2;
public const val `SC_ACTION_RESTART`: `SC_ACTION_TYPE` = 1;
public const val `SC_ACTION_RUN_COMMAND`: `SC_ACTION_TYPE` = 3;
public typealias `SC_ACTION_TYPE` = Int;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SC_AGGREGATE_STORAGE_KEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("System\\CurrentControlSet\\Control\\ServiceAggregatedEvents");
public const val `SC_ENUM_PROCESS_INFO`: `SC_ENUM_TYPE` = 0;
public typealias `SC_ENUM_TYPE` = Int;
public const val `SC_EVENT_DATABASE_CHANGE`: `SC_EVENT_TYPE` = 0;
public const val `SC_EVENT_PROPERTY_CHANGE`: `SC_EVENT_TYPE` = 1;
public const val `SC_EVENT_STATUS_CHANGE`: `SC_EVENT_TYPE` = 2;
public typealias `SC_EVENT_TYPE` = Int;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SC_HANDLE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `SC_MANAGER_ALL_ACCESS`: UInt = 983103u;
public const val `SC_MANAGER_CONNECT`: UInt = 1u;
public const val `SC_MANAGER_CREATE_SERVICE`: UInt = 2u;
public const val `SC_MANAGER_ENUMERATE_SERVICE`: UInt = 4u;
public const val `SC_MANAGER_LOCK`: UInt = 8u;
public const val `SC_MANAGER_MODIFY_BOOT_CONFIG`: UInt = 32u;
public const val `SC_MANAGER_QUERY_LOCK_STATUS`: UInt = 16u;
public const val `SC_STATUS_PROCESS_INFO`: `SC_STATUS_TYPE` = 0;
public typealias `SC_STATUS_TYPE` = Int;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SERVICES_ACTIVE_DATABASE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ServicesActive");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SERVICES_ACTIVE_DATABASEA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("ServicesActive");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SERVICES_ACTIVE_DATABASEW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ServicesActive");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SERVICES_FAILED_DATABASE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ServicesFailed");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SERVICES_FAILED_DATABASEA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("ServicesFailed");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SERVICES_FAILED_DATABASEW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ServicesFailed");
public const val `SERVICE_ACCEPT_HARDWAREPROFILECHANGE`: UInt = 32u;
public const val `SERVICE_ACCEPT_LOWRESOURCES`: UInt = 8192u;
public const val `SERVICE_ACCEPT_NETBINDCHANGE`: UInt = 16u;
public const val `SERVICE_ACCEPT_PARAMCHANGE`: UInt = 8u;
public const val `SERVICE_ACCEPT_PAUSE_CONTINUE`: UInt = 2u;
public const val `SERVICE_ACCEPT_POWEREVENT`: UInt = 64u;
public const val `SERVICE_ACCEPT_PRESHUTDOWN`: UInt = 256u;
public const val `SERVICE_ACCEPT_SESSIONCHANGE`: UInt = 128u;
public const val `SERVICE_ACCEPT_SHUTDOWN`: UInt = 4u;
public const val `SERVICE_ACCEPT_STOP`: UInt = 1u;
public const val `SERVICE_ACCEPT_SYSTEMLOWRESOURCES`: UInt = 16384u;
public const val `SERVICE_ACCEPT_TIMECHANGE`: UInt = 512u;
public const val `SERVICE_ACCEPT_TRIGGEREVENT`: UInt = 1024u;
public const val `SERVICE_ACCEPT_USER_LOGOFF`: UInt = 2048u;
public const val `SERVICE_ACTIVE`: `ENUM_SERVICE_STATE` = 1u;
public const val `SERVICE_ADAPTER`: `ENUM_SERVICE_TYPE` = 4u;
public const val `SERVICE_ALL_ACCESS`: UInt = 983551u;
public const val `SERVICE_AUTO_START`: `SERVICE_START_TYPE` = 2u;
public const val `SERVICE_BOOT_START`: `SERVICE_START_TYPE` = 0u;
public const val `SERVICE_CHANGE_CONFIG`: UInt = 2u;
public typealias `SERVICE_CONFIG` = UInt;
public const val `SERVICE_CONFIG_DELAYED_AUTO_START_INFO`: `SERVICE_CONFIG` = 3u;
public const val `SERVICE_CONFIG_DESCRIPTION`: `SERVICE_CONFIG` = 1u;
public const val `SERVICE_CONFIG_FAILURE_ACTIONS`: `SERVICE_CONFIG` = 2u;
public const val `SERVICE_CONFIG_FAILURE_ACTIONS_FLAG`: `SERVICE_CONFIG` = 4u;
public const val `SERVICE_CONFIG_LAUNCH_PROTECTED`: `SERVICE_CONFIG` = 12u;
public const val `SERVICE_CONFIG_PREFERRED_NODE`: `SERVICE_CONFIG` = 9u;
public const val `SERVICE_CONFIG_PRESHUTDOWN_INFO`: `SERVICE_CONFIG` = 7u;
public const val `SERVICE_CONFIG_REQUIRED_PRIVILEGES_INFO`: `SERVICE_CONFIG` = 6u;
public const val `SERVICE_CONFIG_SERVICE_SID_INFO`: `SERVICE_CONFIG` = 5u;
public const val `SERVICE_CONFIG_TRIGGER_INFO`: `SERVICE_CONFIG` = 8u;
public const val `SERVICE_CONTINUE_PENDING`: `SERVICE_STATUS_CURRENT_STATE` = 5u;
public const val `SERVICE_CONTROL_CONTINUE`: UInt = 3u;
public const val `SERVICE_CONTROL_DEVICEEVENT`: UInt = 11u;
public const val `SERVICE_CONTROL_HARDWAREPROFILECHANGE`: UInt = 12u;
public const val `SERVICE_CONTROL_INTERROGATE`: UInt = 4u;
public const val `SERVICE_CONTROL_LOWRESOURCES`: UInt = 96u;
public const val `SERVICE_CONTROL_NETBINDADD`: UInt = 7u;
public const val `SERVICE_CONTROL_NETBINDDISABLE`: UInt = 10u;
public const val `SERVICE_CONTROL_NETBINDENABLE`: UInt = 9u;
public const val `SERVICE_CONTROL_NETBINDREMOVE`: UInt = 8u;
public const val `SERVICE_CONTROL_PARAMCHANGE`: UInt = 6u;
public const val `SERVICE_CONTROL_PAUSE`: UInt = 2u;
public const val `SERVICE_CONTROL_POWEREVENT`: UInt = 13u;
public const val `SERVICE_CONTROL_PRESHUTDOWN`: UInt = 15u;
public const val `SERVICE_CONTROL_SESSIONCHANGE`: UInt = 14u;
public const val `SERVICE_CONTROL_SHUTDOWN`: UInt = 5u;
public const val `SERVICE_CONTROL_STATUS_REASON_INFO`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERVICE_CONTROL_STATUS_REASON_PARAMSA` (
    public var `dwReason`: UInt,
    public var `pszComment`: `windows_sys`.`core`.`PSTR`,
    public var `ServiceStatus`: `SERVICE_STATUS_PROCESS`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERVICE_CONTROL_STATUS_REASON_PARAMSA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERVICE_CONTROL_STATUS_REASON_PARAMSA`.Companion.`default`() : `SERVICE_CONTROL_STATUS_REASON_PARAMSA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERVICE_CONTROL_STATUS_REASON_PARAMSW` (
    public var `dwReason`: UInt,
    public var `pszComment`: `windows_sys`.`core`.`PWSTR`,
    public var `ServiceStatus`: `SERVICE_STATUS_PROCESS`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERVICE_CONTROL_STATUS_REASON_PARAMSW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERVICE_CONTROL_STATUS_REASON_PARAMSW`.Companion.`default`() : `SERVICE_CONTROL_STATUS_REASON_PARAMSW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `SERVICE_CONTROL_STOP`: UInt = 1u;
public const val `SERVICE_CONTROL_SYSTEMLOWRESOURCES`: UInt = 97u;
public const val `SERVICE_CONTROL_TIMECHANGE`: UInt = 16u;
public const val `SERVICE_CONTROL_TRIGGEREVENT`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM` (
    public var `u`: `SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM`.Companion.`default`() : `SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 314:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM_0 {
//     pub CustomStateId: SERVICE_TRIGGER_CUSTOM_STATE_ID,
//     pub s: SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM_0`.Companion.`default`() : `SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM_0_0` (
    public var `DataOffset`: UInt,
    public var `Data`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM_0_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM_0_0`.Companion.`default`() : `SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM_0_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SERVICE_DELAYED_AUTO_START_INFO` (
    public var `fDelayedAutostart`: `windows_sys`.`core`.`BOOL`,
)
public const val `SERVICE_DEMAND_START`: `SERVICE_START_TYPE` = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERVICE_DESCRIPTIONA` (
    public var `lpDescription`: `windows_sys`.`core`.`PSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERVICE_DESCRIPTIONA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERVICE_DESCRIPTIONA`.Companion.`default`() : `SERVICE_DESCRIPTIONA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERVICE_DESCRIPTIONW` (
    public var `lpDescription`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERVICE_DESCRIPTIONW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERVICE_DESCRIPTIONW`.Companion.`default`() : `SERVICE_DESCRIPTIONW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `SERVICE_DIRECTORY_TYPE` = Int;
public const val `SERVICE_DISABLED`: `SERVICE_START_TYPE` = 4u;
public const val `SERVICE_DRIVER`: `ENUM_SERVICE_TYPE` = 11u;
public const val `SERVICE_DYNAMIC_INFORMATION_LEVEL_START_REASON`: UInt = 1u;
public const val `SERVICE_ENUMERATE_DEPENDENTS`: UInt = 8u;
public typealias `SERVICE_ERROR` = UInt;
public const val `SERVICE_ERROR_CRITICAL`: `SERVICE_ERROR` = 3u;
public const val `SERVICE_ERROR_IGNORE`: `SERVICE_ERROR` = 0u;
public const val `SERVICE_ERROR_NORMAL`: `SERVICE_ERROR` = 1u;
public const val `SERVICE_ERROR_SEVERE`: `SERVICE_ERROR` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERVICE_FAILURE_ACTIONSA` (
    public var `dwResetPeriod`: UInt,
    public var `lpRebootMsg`: `windows_sys`.`core`.`PSTR`,
    public var `lpCommand`: `windows_sys`.`core`.`PSTR`,
    public var `cActions`: UInt,
    public var `lpsaActions`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SC_ACTION`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERVICE_FAILURE_ACTIONSA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERVICE_FAILURE_ACTIONSA`.Companion.`default`() : `SERVICE_FAILURE_ACTIONSA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERVICE_FAILURE_ACTIONSW` (
    public var `dwResetPeriod`: UInt,
    public var `lpRebootMsg`: `windows_sys`.`core`.`PWSTR`,
    public var `lpCommand`: `windows_sys`.`core`.`PWSTR`,
    public var `cActions`: UInt,
    public var `lpsaActions`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SC_ACTION`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERVICE_FAILURE_ACTIONSW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERVICE_FAILURE_ACTIONSW`.Companion.`default`() : `SERVICE_FAILURE_ACTIONSW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SERVICE_FAILURE_ACTIONS_FLAG` (
    public var `fFailureActionsOnNonCrashFailures`: `windows_sys`.`core`.`BOOL`,
)
public const val `SERVICE_FILE_SYSTEM_DRIVER`: `ENUM_SERVICE_TYPE` = 2u;
public const val `SERVICE_INACTIVE`: `ENUM_SERVICE_STATE` = 2u;
public const val `SERVICE_INTERROGATE`: UInt = 128u;
public const val `SERVICE_KERNEL_DRIVER`: `ENUM_SERVICE_TYPE` = 1u;
public const val `SERVICE_LAUNCH_PROTECTED_ANTIMALWARE_LIGHT`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SERVICE_LAUNCH_PROTECTED_INFO` (
    public var `dwLaunchProtected`: UInt,
)
public const val `SERVICE_LAUNCH_PROTECTED_NONE`: UInt = 0u;
public const val `SERVICE_LAUNCH_PROTECTED_WINDOWS`: UInt = 1u;
public const val `SERVICE_LAUNCH_PROTECTED_WINDOWS_LIGHT`: UInt = 2u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SERVICE_MAIN_FUNCTIONA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SERVICE_MAIN_FUNCTIONW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) -> Unit>>>;
public typealias `SERVICE_NOTIFY` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERVICE_NOTIFY_1` (
    public var `dwVersion`: UInt,
    public var `pfnNotifyCallback`: `PFN_SC_NOTIFY_CALLBACK`,
    public var `pContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwNotificationStatus`: UInt,
    public var `ServiceStatus`: `SERVICE_STATUS_PROCESS`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERVICE_NOTIFY_1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERVICE_NOTIFY_1`.Companion.`default`() : `SERVICE_NOTIFY_1` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERVICE_NOTIFY_2A` (
    public var `dwVersion`: UInt,
    public var `pfnNotifyCallback`: `PFN_SC_NOTIFY_CALLBACK`,
    public var `pContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwNotificationStatus`: UInt,
    public var `ServiceStatus`: `SERVICE_STATUS_PROCESS`,
    public var `dwNotificationTriggered`: UInt,
    public var `pszServiceNames`: `windows_sys`.`core`.`PSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERVICE_NOTIFY_2A`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERVICE_NOTIFY_2A`.Companion.`default`() : `SERVICE_NOTIFY_2A` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERVICE_NOTIFY_2W` (
    public var `dwVersion`: UInt,
    public var `pfnNotifyCallback`: `PFN_SC_NOTIFY_CALLBACK`,
    public var `pContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwNotificationStatus`: UInt,
    public var `ServiceStatus`: `SERVICE_STATUS_PROCESS`,
    public var `dwNotificationTriggered`: UInt,
    public var `pszServiceNames`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERVICE_NOTIFY_2W`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERVICE_NOTIFY_2W`.Companion.`default`() : `SERVICE_NOTIFY_2W` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `SERVICE_NOTIFY_CONTINUE_PENDING`: `SERVICE_NOTIFY` = 16u;
public const val `SERVICE_NOTIFY_CREATED`: `SERVICE_NOTIFY` = 128u;
public const val `SERVICE_NOTIFY_DELETED`: `SERVICE_NOTIFY` = 256u;
public const val `SERVICE_NOTIFY_DELETE_PENDING`: `SERVICE_NOTIFY` = 512u;
public const val `SERVICE_NOTIFY_PAUSED`: `SERVICE_NOTIFY` = 64u;
public const val `SERVICE_NOTIFY_PAUSE_PENDING`: `SERVICE_NOTIFY` = 32u;
public const val `SERVICE_NOTIFY_RUNNING`: `SERVICE_NOTIFY` = 8u;
public const val `SERVICE_NOTIFY_START_PENDING`: `SERVICE_NOTIFY` = 2u;
public const val `SERVICE_NOTIFY_STATUS_CHANGE`: UInt = 2u;
public const val `SERVICE_NOTIFY_STATUS_CHANGE_1`: UInt = 1u;
public const val `SERVICE_NOTIFY_STATUS_CHANGE_2`: UInt = 2u;
public const val `SERVICE_NOTIFY_STOPPED`: `SERVICE_NOTIFY` = 1u;
public const val `SERVICE_NOTIFY_STOP_PENDING`: `SERVICE_NOTIFY` = 4u;
public const val `SERVICE_NO_CHANGE`: UInt = 4294967295u;
public const val `SERVICE_PAUSED`: `SERVICE_STATUS_CURRENT_STATE` = 7u;
public const val `SERVICE_PAUSE_CONTINUE`: UInt = 64u;
public const val `SERVICE_PAUSE_PENDING`: `SERVICE_STATUS_CURRENT_STATE` = 6u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SERVICE_PREFERRED_NODE_INFO` (
    public var `usPreferredNode`: UShort,
    public var `fDelete`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SERVICE_PRESHUTDOWN_INFO` (
    public var `dwPreshutdownTimeout`: UInt,
)
public const val `SERVICE_QUERY_CONFIG`: UInt = 1u;
public const val `SERVICE_QUERY_STATUS`: UInt = 4u;
public const val `SERVICE_RECOGNIZER_DRIVER`: `ENUM_SERVICE_TYPE` = 8u;
public typealias `SERVICE_REGISTRY_STATE_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERVICE_REQUIRED_PRIVILEGES_INFOA` (
    public var `pmszRequiredPrivileges`: `windows_sys`.`core`.`PSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERVICE_REQUIRED_PRIVILEGES_INFOA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERVICE_REQUIRED_PRIVILEGES_INFOA`.Companion.`default`() : `SERVICE_REQUIRED_PRIVILEGES_INFOA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERVICE_REQUIRED_PRIVILEGES_INFOW` (
    public var `pmszRequiredPrivileges`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERVICE_REQUIRED_PRIVILEGES_INFOW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERVICE_REQUIRED_PRIVILEGES_INFOW`.Companion.`default`() : `SERVICE_REQUIRED_PRIVILEGES_INFOW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `SERVICE_RUNNING`: `SERVICE_STATUS_CURRENT_STATE` = 4u;
public const val `SERVICE_RUNS_IN_NON_SYSTEM_OR_NOT_RUNNING`: `SERVICE_RUNS_IN_PROCESS` = 0u;
public typealias `SERVICE_RUNS_IN_PROCESS` = UInt;
public const val `SERVICE_RUNS_IN_SYSTEM_PROCESS`: `SERVICE_RUNS_IN_PROCESS` = 1u;
public typealias `SERVICE_SHARED_DIRECTORY_TYPE` = Int;
public typealias `SERVICE_SHARED_REGISTRY_STATE_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SERVICE_SID_INFO` (
    public var `dwServiceSidType`: UInt,
)
public const val `SERVICE_SID_TYPE_NONE`: UInt = 0u;
public const val `SERVICE_SID_TYPE_UNRESTRICTED`: UInt = 1u;
public const val `SERVICE_START`: UInt = 16u;
public const val `SERVICE_START_PENDING`: `SERVICE_STATUS_CURRENT_STATE` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SERVICE_START_REASON` (
    public var `dwReason`: UInt,
)
public const val `SERVICE_START_REASON_AUTO`: UInt = 2u;
public const val `SERVICE_START_REASON_DELAYEDAUTO`: UInt = 16u;
public const val `SERVICE_START_REASON_DEMAND`: UInt = 1u;
public const val `SERVICE_START_REASON_RESTART_ON_FAILURE`: UInt = 8u;
public const val `SERVICE_START_REASON_TRIGGER`: UInt = 4u;
public typealias `SERVICE_START_TYPE` = UInt;
public const val `SERVICE_STATE_ALL`: `ENUM_SERVICE_STATE` = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SERVICE_STATUS` (
    public var `dwServiceType`: `ENUM_SERVICE_TYPE`,
    public var `dwCurrentState`: `SERVICE_STATUS_CURRENT_STATE`,
    public var `dwControlsAccepted`: UInt,
    public var `dwWin32ExitCode`: UInt,
    public var `dwServiceSpecificExitCode`: UInt,
    public var `dwCheckPoint`: UInt,
    public var `dwWaitHint`: UInt,
)
public typealias `SERVICE_STATUS_CURRENT_STATE` = UInt;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SERVICE_STATUS_HANDLE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SERVICE_STATUS_PROCESS` (
    public var `dwServiceType`: `ENUM_SERVICE_TYPE`,
    public var `dwCurrentState`: `SERVICE_STATUS_CURRENT_STATE`,
    public var `dwControlsAccepted`: UInt,
    public var `dwWin32ExitCode`: UInt,
    public var `dwServiceSpecificExitCode`: UInt,
    public var `dwCheckPoint`: UInt,
    public var `dwWaitHint`: UInt,
    public var `dwProcessId`: UInt,
    public var `dwServiceFlags`: `SERVICE_RUNS_IN_PROCESS`,
)
public const val `SERVICE_STOP`: UInt = 32u;
public const val `SERVICE_STOPPED`: `SERVICE_STATUS_CURRENT_STATE` = 1u;
public const val `SERVICE_STOP_PENDING`: `SERVICE_STATUS_CURRENT_STATE` = 3u;
public const val `SERVICE_STOP_REASON_FLAG_CUSTOM`: UInt = 536870912u;
public const val `SERVICE_STOP_REASON_FLAG_MAX`: UInt = 2147483648u;
public const val `SERVICE_STOP_REASON_FLAG_MIN`: UInt = 0u;
public const val `SERVICE_STOP_REASON_FLAG_PLANNED`: UInt = 1073741824u;
public const val `SERVICE_STOP_REASON_FLAG_UNPLANNED`: UInt = 268435456u;
public const val `SERVICE_STOP_REASON_MAJOR_APPLICATION`: UInt = 327680u;
public const val `SERVICE_STOP_REASON_MAJOR_HARDWARE`: UInt = 131072u;
public const val `SERVICE_STOP_REASON_MAJOR_MAX`: UInt = 458752u;
public const val `SERVICE_STOP_REASON_MAJOR_MAX_CUSTOM`: UInt = 16711680u;
public const val `SERVICE_STOP_REASON_MAJOR_MIN`: UInt = 0u;
public const val `SERVICE_STOP_REASON_MAJOR_MIN_CUSTOM`: UInt = 4194304u;
public const val `SERVICE_STOP_REASON_MAJOR_NONE`: UInt = 393216u;
public const val `SERVICE_STOP_REASON_MAJOR_OPERATINGSYSTEM`: UInt = 196608u;
public const val `SERVICE_STOP_REASON_MAJOR_OTHER`: UInt = 65536u;
public const val `SERVICE_STOP_REASON_MAJOR_SOFTWARE`: UInt = 262144u;
public const val `SERVICE_STOP_REASON_MINOR_DISK`: UInt = 8u;
public const val `SERVICE_STOP_REASON_MINOR_ENVIRONMENT`: UInt = 10u;
public const val `SERVICE_STOP_REASON_MINOR_HARDWARE_DRIVER`: UInt = 11u;
public const val `SERVICE_STOP_REASON_MINOR_HUNG`: UInt = 6u;
public const val `SERVICE_STOP_REASON_MINOR_INSTALLATION`: UInt = 3u;
public const val `SERVICE_STOP_REASON_MINOR_MAINTENANCE`: UInt = 2u;
public const val `SERVICE_STOP_REASON_MINOR_MAX`: UInt = 25u;
public const val `SERVICE_STOP_REASON_MINOR_MAX_CUSTOM`: UInt = 65535u;
public const val `SERVICE_STOP_REASON_MINOR_MEMOTYLIMIT`: UInt = 24u;
public const val `SERVICE_STOP_REASON_MINOR_MIN`: UInt = 0u;
public const val `SERVICE_STOP_REASON_MINOR_MIN_CUSTOM`: UInt = 256u;
public const val `SERVICE_STOP_REASON_MINOR_MMC`: UInt = 22u;
public const val `SERVICE_STOP_REASON_MINOR_NETWORKCARD`: UInt = 9u;
public const val `SERVICE_STOP_REASON_MINOR_NETWORK_CONNECTIVITY`: UInt = 17u;
public const val `SERVICE_STOP_REASON_MINOR_NONE`: UInt = 23u;
public const val `SERVICE_STOP_REASON_MINOR_OTHER`: UInt = 1u;
public const val `SERVICE_STOP_REASON_MINOR_OTHERDRIVER`: UInt = 12u;
public const val `SERVICE_STOP_REASON_MINOR_RECONFIG`: UInt = 5u;
public const val `SERVICE_STOP_REASON_MINOR_SECURITY`: UInt = 16u;
public const val `SERVICE_STOP_REASON_MINOR_SECURITYFIX`: UInt = 15u;
public const val `SERVICE_STOP_REASON_MINOR_SECURITYFIX_UNINSTALL`: UInt = 21u;
public const val `SERVICE_STOP_REASON_MINOR_SERVICEPACK`: UInt = 13u;
public const val `SERVICE_STOP_REASON_MINOR_SERVICEPACK_UNINSTALL`: UInt = 19u;
public const val `SERVICE_STOP_REASON_MINOR_SOFTWARE_UPDATE`: UInt = 14u;
public const val `SERVICE_STOP_REASON_MINOR_SOFTWARE_UPDATE_UNINSTALL`: UInt = 20u;
public const val `SERVICE_STOP_REASON_MINOR_UNSTABLE`: UInt = 7u;
public const val `SERVICE_STOP_REASON_MINOR_UPGRADE`: UInt = 4u;
public const val `SERVICE_STOP_REASON_MINOR_WMI`: UInt = 18u;
public const val `SERVICE_SYSTEM_START`: `SERVICE_START_TYPE` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERVICE_TABLE_ENTRYA` (
    public var `lpServiceName`: `windows_sys`.`core`.`PSTR`,
    public var `lpServiceProc`: `LPSERVICE_MAIN_FUNCTIONA`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERVICE_TABLE_ENTRYA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERVICE_TABLE_ENTRYA`.Companion.`default`() : `SERVICE_TABLE_ENTRYA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERVICE_TABLE_ENTRYW` (
    public var `lpServiceName`: `windows_sys`.`core`.`PWSTR`,
    public var `lpServiceProc`: `LPSERVICE_MAIN_FUNCTIONW`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERVICE_TABLE_ENTRYW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERVICE_TABLE_ENTRYW`.Companion.`default`() : `SERVICE_TABLE_ENTRYW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SERVICE_TIMECHANGE_INFO` (
    public var `liNewTime`: Long,
    public var `liOldTime`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERVICE_TRIGGER` (
    public var `dwTriggerType`: `SERVICE_TRIGGER_TYPE`,
    public var `dwAction`: `SERVICE_TRIGGER_ACTION`,
    public var `pTriggerSubtype`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `cDataItems`: UInt,
    public var `pDataItems`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SERVICE_TRIGGER_SPECIFIC_DATA_ITEM`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERVICE_TRIGGER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERVICE_TRIGGER`.Companion.`default`() : `SERVICE_TRIGGER` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `SERVICE_TRIGGER_ACTION` = UInt;
public const val `SERVICE_TRIGGER_ACTION_SERVICE_START`: `SERVICE_TRIGGER_ACTION` = 1u;
public const val `SERVICE_TRIGGER_ACTION_SERVICE_STOP`: `SERVICE_TRIGGER_ACTION` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERVICE_TRIGGER_CUSTOM_STATE_ID` (
    public var `Data`: UIntArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERVICE_TRIGGER_CUSTOM_STATE_ID`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERVICE_TRIGGER_CUSTOM_STATE_ID`.Companion.`default`() : `SERVICE_TRIGGER_CUSTOM_STATE_ID` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `SERVICE_TRIGGER_DATA_TYPE_BINARY`: `SERVICE_TRIGGER_SPECIFIC_DATA_ITEM_DATA_TYPE` = 1u;
public const val `SERVICE_TRIGGER_DATA_TYPE_KEYWORD_ALL`: `SERVICE_TRIGGER_SPECIFIC_DATA_ITEM_DATA_TYPE` = 5u;
public const val `SERVICE_TRIGGER_DATA_TYPE_KEYWORD_ANY`: `SERVICE_TRIGGER_SPECIFIC_DATA_ITEM_DATA_TYPE` = 4u;
public const val `SERVICE_TRIGGER_DATA_TYPE_LEVEL`: `SERVICE_TRIGGER_SPECIFIC_DATA_ITEM_DATA_TYPE` = 3u;
public const val `SERVICE_TRIGGER_DATA_TYPE_STRING`: `SERVICE_TRIGGER_SPECIFIC_DATA_ITEM_DATA_TYPE` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERVICE_TRIGGER_INFO` (
    public var `cTriggers`: UInt,
    public var `pTriggers`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SERVICE_TRIGGER`>?,
    public var `pReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERVICE_TRIGGER_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERVICE_TRIGGER_INFO`.Companion.`default`() : `SERVICE_TRIGGER_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERVICE_TRIGGER_SPECIFIC_DATA_ITEM` (
    public var `dwDataType`: `SERVICE_TRIGGER_SPECIFIC_DATA_ITEM_DATA_TYPE`,
    public var `cbData`: UInt,
    public var `pData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERVICE_TRIGGER_SPECIFIC_DATA_ITEM`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERVICE_TRIGGER_SPECIFIC_DATA_ITEM`.Companion.`default`() : `SERVICE_TRIGGER_SPECIFIC_DATA_ITEM` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `SERVICE_TRIGGER_SPECIFIC_DATA_ITEM_DATA_TYPE` = UInt;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SERVICE_TRIGGER_STARTED_ARGUMENT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TriggerStarted");
public typealias `SERVICE_TRIGGER_TYPE` = UInt;
public const val `SERVICE_TRIGGER_TYPE_AGGREGATE`: UInt = 30u;
public const val `SERVICE_TRIGGER_TYPE_CUSTOM`: `SERVICE_TRIGGER_TYPE` = 20u;
public const val `SERVICE_TRIGGER_TYPE_CUSTOM_SYSTEM_STATE_CHANGE`: UInt = 7u;
public const val `SERVICE_TRIGGER_TYPE_DEVICE_INTERFACE_ARRIVAL`: `SERVICE_TRIGGER_TYPE` = 1u;
public const val `SERVICE_TRIGGER_TYPE_DOMAIN_JOIN`: `SERVICE_TRIGGER_TYPE` = 3u;
public const val `SERVICE_TRIGGER_TYPE_FIREWALL_PORT_EVENT`: `SERVICE_TRIGGER_TYPE` = 4u;
public const val `SERVICE_TRIGGER_TYPE_GROUP_POLICY`: `SERVICE_TRIGGER_TYPE` = 5u;
public const val `SERVICE_TRIGGER_TYPE_IP_ADDRESS_AVAILABILITY`: `SERVICE_TRIGGER_TYPE` = 2u;
public const val `SERVICE_TRIGGER_TYPE_NETWORK_ENDPOINT`: `SERVICE_TRIGGER_TYPE` = 6u;
public const val `SERVICE_USER_DEFINED_CONTROL`: UInt = 256u;
public const val `SERVICE_USER_OWN_PROCESS`: `ENUM_SERVICE_TYPE` = 80u;
public const val `SERVICE_USER_SHARE_PROCESS`: `ENUM_SERVICE_TYPE` = 96u;
public const val `SERVICE_WIN32`: `ENUM_SERVICE_TYPE` = 48u;
public const val `SERVICE_WIN32_OWN_PROCESS`: `ENUM_SERVICE_TYPE` = 16u;
public const val `SERVICE_WIN32_SHARE_PROCESS`: `ENUM_SERVICE_TYPE` = 32u;
public const val `ServiceDirectoryPersistentState`: `SERVICE_DIRECTORY_TYPE` = 0;
public const val `ServiceDirectoryTypeMax`: `SERVICE_DIRECTORY_TYPE` = 1;
public const val `ServiceRegistryStateParameters`: `SERVICE_REGISTRY_STATE_TYPE` = 0;
public const val `ServiceRegistryStatePersistent`: `SERVICE_REGISTRY_STATE_TYPE` = 1;
public const val `ServiceSharedDirectoryPersistentState`: `SERVICE_SHARED_DIRECTORY_TYPE` = 0;
public const val `ServiceSharedRegistryPersistentState`: `SERVICE_SHARED_REGISTRY_STATE_TYPE` = 0;
// UNSUPPORTED Rust 727:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const USER_POLICY_PRESENT_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x54fb46c8_f089_464c_b1fd_59d1b62c3b50);

