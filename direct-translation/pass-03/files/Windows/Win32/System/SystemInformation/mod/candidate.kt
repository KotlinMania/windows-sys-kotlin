// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DnsHostnameToComputerNameExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DnsHostnameToComputerNameExW`(`hostname` : `windows_sys`.`core`.`PCWSTR`, `computername` : `windows_sys`.`core`.`PWSTR`, `nsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=EnumSystemFirmwareTables; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumSystemFirmwareTables`(`firmwaretableprovidersignature` : `FIRMWARE_TABLE_PROVIDER`, `pfirmwaretableenumbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `buffersize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetComputerNameExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetComputerNameExA`(`nametype` : `COMPUTER_NAME_FORMAT`, `lpbuffer` : `windows_sys`.`core`.`PSTR`, `nsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetComputerNameExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetComputerNameExW`(`nametype` : `COMPUTER_NAME_FORMAT`, `lpbuffer` : `windows_sys`.`core`.`PWSTR`, `nsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-sysinfo-l1-2-6.dll, ABI=system, export=GetDeveloperDriveEnablementState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDeveloperDriveEnablementState`() : `DEVELOPER_DRIVE_ENABLEMENT_STATE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFirmwareType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFirmwareType`(`firmwaretype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FIRMWARE_TYPE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-sysinfo-l1-2-3.dll, ABI=system, export=GetIntegratedDisplaySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetIntegratedDisplaySize`(`sizeininches` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetLocalTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetLocalTime`(`lpsystemtime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetLogicalProcessorInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetLogicalProcessorInformation`(`buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYSTEM_LOGICAL_PROCESSOR_INFORMATION`>?, `returnedlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetLogicalProcessorInformationEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetLogicalProcessorInformationEx`(`relationshiptype` : `LOGICAL_PROCESSOR_RELATIONSHIP`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX`>?, `returnedlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetNativeSystemInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetNativeSystemInfo`(`lpsysteminfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYSTEM_INFO`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-sysinfo-l1-2-3.dll, ABI=system, export=GetOsManufacturingMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetOsManufacturingMode`(`pbenabled` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-sysinfo-l1-2-0.dll, ABI=system, export=GetOsSafeBootMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetOsSafeBootMode`(`flags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetPhysicallyInstalledSystemMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPhysicallyInstalledSystemMemory`(`totalmemoryinkilobytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetProcessorSystemCycleTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetProcessorSystemCycleTime`(`group` : UShort, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION`>?, `returnedlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetProductInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetProductInfo`(`dwosmajorversion` : UInt, `dwosminorversion` : UInt, `dwspmajorversion` : UInt, `dwspminorversion` : UInt, `pdwreturnedproducttype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`OS_PRODUCT_TYPE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetSystemCpuSetInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemCpuSetInformation`(`information` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYSTEM_CPU_SET_INFORMATION`>?, `bufferlength` : UInt, `returnedlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `process` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetSystemDEPPolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemDEPPolicy`() : `DEP_SYSTEM_POLICY_TYPE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetSystemDirectoryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemDirectoryA`(`lpbuffer` : `windows_sys`.`core`.`PSTR`, `usize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetSystemDirectoryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemDirectoryW`(`lpbuffer` : `windows_sys`.`core`.`PWSTR`, `usize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetSystemFirmwareTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemFirmwareTable`(`firmwaretableprovidersignature` : `FIRMWARE_TABLE_PROVIDER`, `firmwaretableid` : UInt, `pfirmwaretablebuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `buffersize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetSystemInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemInfo`(`lpsysteminfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYSTEM_INFO`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetSystemLeapSecondInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemLeapSecondInformation`(`enabled` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `flags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetSystemTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemTime`(`lpsystemtime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetSystemTimeAdjustment; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemTimeAdjustment`(`lptimeadjustment` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lptimeincrement` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lptimeadjustmentdisabled` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-sysinfo-l1-2-4.dll, ABI=system, export=GetSystemTimeAdjustmentPrecise; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemTimeAdjustmentPrecise`(`lptimeadjustment` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `lptimeincrement` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `lptimeadjustmentdisabled` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetSystemTimeAsFileTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemTimeAsFileTime`(`lpsystemtimeasfiletime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetSystemTimePreciseAsFileTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemTimePreciseAsFileTime`(`lpsystemtimeasfiletime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetSystemWindowsDirectoryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemWindowsDirectoryA`(`lpbuffer` : `windows_sys`.`core`.`PSTR`, `usize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetSystemWindowsDirectoryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemWindowsDirectoryW`(`lpbuffer` : `windows_sys`.`core`.`PWSTR`, `usize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-wow64-l1-1-1.dll, ABI=system, export=GetSystemWow64Directory2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemWow64Directory2A`(`lpbuffer` : `windows_sys`.`core`.`PSTR`, `usize` : UInt, `imagefilemachinetype` : `IMAGE_FILE_MACHINE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-wow64-l1-1-1.dll, ABI=system, export=GetSystemWow64Directory2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemWow64Directory2W`(`lpbuffer` : `windows_sys`.`core`.`PWSTR`, `usize` : UInt, `imagefilemachinetype` : `IMAGE_FILE_MACHINE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetSystemWow64DirectoryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemWow64DirectoryA`(`lpbuffer` : `windows_sys`.`core`.`PSTR`, `usize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetSystemWow64DirectoryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemWow64DirectoryW`(`lpbuffer` : `windows_sys`.`core`.`PWSTR`, `usize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetTickCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTickCount`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetTickCount64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTickCount64`() : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetVersion`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetVersionExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetVersionExA`(`lpversioninformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`OSVERSIONINFOA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetVersionExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetVersionExW`(`lpversioninformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`OSVERSIONINFOW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetWindowsDirectoryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowsDirectoryA`(`lpbuffer` : `windows_sys`.`core`.`PSTR`, `usize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetWindowsDirectoryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowsDirectoryW`(`lpbuffer` : `windows_sys`.`core`.`PWSTR`, `usize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GlobalMemoryStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GlobalMemoryStatus`(`lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MEMORYSTATUS`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GlobalMemoryStatusEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GlobalMemoryStatusEx`(`lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MEMORYSTATUSEX`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=IsUserCetAvailableInEnvironment; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsUserCetAvailableInEnvironment`(`usercetenvironment` : `USER_CET_ENVIRONMENT`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=IsWow64GuestMachineSupported; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsWow64GuestMachineSupported`(`wowguestmachine` : `IMAGE_FILE_MACHINE`, `machineissupported` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlConvertDeviceFamilyInfoToString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlConvertDeviceFamilyInfoToString`(`puldevicefamilybuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `puldeviceformbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `devicefamily` : `windows_sys`.`core`.`PWSTR`, `deviceform` : `windows_sys`.`core`.`PWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlGetDeviceFamilyInfoEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlGetDeviceFamilyInfoEnum`(`pulluapinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `puldevicefamily` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVICEFAMILYINFOENUM`>?, `puldeviceform` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVICEFAMILYDEVICEFORM`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlGetProductInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlGetProductInfo`(`osmajorversion` : UInt, `osminorversion` : UInt, `spmajorversion` : UInt, `spminorversion` : UInt, `returnedproducttype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdllk.dll, ABI=system, export=RtlGetSystemGlobalData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlGetSystemGlobalData`(`dataid` : `RTL_SYSTEM_GLOBAL_DATA_ID`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlOsDeploymentState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlOsDeploymentState`(`flags` : UInt) : `OS_DEPLOYEMENT_STATE_VALUES`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlSwitchedVVI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlSwitchedVVI`(`versioninfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`OSVERSIONINFOEXW`>?, `typemask` : UInt, `conditionmask` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetComputerNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetComputerNameA`(`lpcomputername` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetComputerNameEx2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetComputerNameEx2W`(`nametype` : `COMPUTER_NAME_FORMAT`, `flags` : UInt, `lpbuffer` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetComputerNameExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetComputerNameExA`(`nametype` : `COMPUTER_NAME_FORMAT`, `lpbuffer` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetComputerNameExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetComputerNameExW`(`nametype` : `COMPUTER_NAME_FORMAT`, `lpbuffer` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetComputerNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetComputerNameW`(`lpcomputername` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetLocalTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetLocalTime`(`lpsystemtime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetSystemTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetSystemTime`(`lpsystemtime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetSystemTimeAdjustment; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetSystemTimeAdjustment`(`dwtimeadjustment` : UInt, `btimeadjustmentdisabled` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-sysinfo-l1-2-4.dll, ABI=system, export=SetSystemTimeAdjustmentPrecise; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetSystemTimeAdjustmentPrecise`(`dwtimeadjustment` : ULong, `btimeadjustmentdisabled` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=VerSetConditionMask; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VerSetConditionMask`(`conditionmask` : ULong, `typemask` : `VER_FLAGS`, `condition` : UByte) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=VerifyVersionInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VerifyVersionInfoA`(`lpversioninformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`OSVERSIONINFOEXA`>?, `dwtypemask` : `VER_FLAGS`, `dwlconditionmask` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=VerifyVersionInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VerifyVersionInfoW`(`lpversioninformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`OSVERSIONINFOEXW`>?, `dwtypemask` : `VER_FLAGS`, `dwlconditionmask` : ULong) : `windows_sys`.`core`.`BOOL`
public const val `ACPI`: `FIRMWARE_TABLE_PROVIDER` = 1094930505u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CACHE_DESCRIPTOR` (
    public var `Level`: UByte,
    public var `Associativity`: UByte,
    public var `LineSize`: UShort,
    public var `Size`: UInt,
    public var `Type`: `PROCESSOR_CACHE_TYPE`,
)
// UNSUPPORTED Rust 74:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CACHE_RELATIONSHIP {
//     pub Level: u8,
//     pub Associativity: u8,
//     pub LineSize: u16,
//     pub CacheSize: u32,
//     pub Type: PROCESSOR_CACHE_TYPE,
//     pub Reserved: [u8; 18],
//     pub GroupCount: u16,
//     pub Anonymous: CACHE_RELATIONSHIP_0,
// }

// UNSUPPORTED Rust 86:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CACHE_RELATIONSHIP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 91:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CACHE_RELATIONSHIP_0 {
//     pub GroupMask: GROUP_AFFINITY,
//     pub GroupMasks: [GROUP_AFFINITY; 1],
// }

// UNSUPPORTED Rust 97:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CACHE_RELATIONSHIP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `COMPUTER_NAME_FORMAT` = Int;
public typealias `CPU_SET_INFORMATION_TYPE` = Int;
public const val `CacheData`: `PROCESSOR_CACHE_TYPE` = 2;
public const val `CacheInstruction`: `PROCESSOR_CACHE_TYPE` = 1;
public const val `CacheTrace`: `PROCESSOR_CACHE_TYPE` = 3;
public const val `CacheUnified`: `PROCESSOR_CACHE_TYPE` = 0;
public const val `ComputerNameDnsDomain`: `COMPUTER_NAME_FORMAT` = 2;
public const val `ComputerNameDnsFullyQualified`: `COMPUTER_NAME_FORMAT` = 3;
public const val `ComputerNameDnsHostname`: `COMPUTER_NAME_FORMAT` = 1;
public const val `ComputerNameMax`: `COMPUTER_NAME_FORMAT` = 8;
public const val `ComputerNameNetBIOS`: `COMPUTER_NAME_FORMAT` = 0;
public const val `ComputerNamePhysicalDnsDomain`: `COMPUTER_NAME_FORMAT` = 6;
public const val `ComputerNamePhysicalDnsFullyQualified`: `COMPUTER_NAME_FORMAT` = 7;
public const val `ComputerNamePhysicalDnsHostname`: `COMPUTER_NAME_FORMAT` = 5;
public const val `ComputerNamePhysicalNetBIOS`: `COMPUTER_NAME_FORMAT` = 4;
public const val `CpuSetInformation`: `CPU_SET_INFORMATION_TYPE` = 0;
public const val `DEPPolicyAlwaysOff`: `DEP_SYSTEM_POLICY_TYPE` = 0;
public const val `DEPPolicyAlwaysOn`: `DEP_SYSTEM_POLICY_TYPE` = 1;
public const val `DEPPolicyOptIn`: `DEP_SYSTEM_POLICY_TYPE` = 2;
public const val `DEPPolicyOptOut`: `DEP_SYSTEM_POLICY_TYPE` = 3;
public const val `DEPTotalPolicyCount`: `DEP_SYSTEM_POLICY_TYPE` = 4;
public typealias `DEP_SYSTEM_POLICY_TYPE` = Int;
public typealias `DEVELOPER_DRIVE_ENABLEMENT_STATE` = Int;
public typealias `DEVICEFAMILYDEVICEFORM` = UInt;
public const val `DEVICEFAMILYDEVICEFORM_ALLINONE`: `DEVICEFAMILYDEVICEFORM` = 7u;
public const val `DEVICEFAMILYDEVICEFORM_BANKING`: `DEVICEFAMILYDEVICEFORM` = 14u;
public const val `DEVICEFAMILYDEVICEFORM_BUILDING_AUTOMATION`: `DEVICEFAMILYDEVICEFORM` = 15u;
public const val `DEVICEFAMILYDEVICEFORM_CONVERTIBLE`: `DEVICEFAMILYDEVICEFORM` = 5u;
public const val `DEVICEFAMILYDEVICEFORM_DESKTOP`: `DEVICEFAMILYDEVICEFORM` = 3u;
public const val `DEVICEFAMILYDEVICEFORM_DETACHABLE`: `DEVICEFAMILYDEVICEFORM` = 6u;
public const val `DEVICEFAMILYDEVICEFORM_DIGITAL_SIGNAGE`: `DEVICEFAMILYDEVICEFORM` = 16u;
public const val `DEVICEFAMILYDEVICEFORM_GAMING`: `DEVICEFAMILYDEVICEFORM` = 17u;
public const val `DEVICEFAMILYDEVICEFORM_HMD`: `DEVICEFAMILYDEVICEFORM` = 11u;
public const val `DEVICEFAMILYDEVICEFORM_HOME_AUTOMATION`: `DEVICEFAMILYDEVICEFORM` = 18u;
public const val `DEVICEFAMILYDEVICEFORM_INDUSTRIAL_AUTOMATION`: `DEVICEFAMILYDEVICEFORM` = 19u;
public const val `DEVICEFAMILYDEVICEFORM_INDUSTRY_HANDHELD`: `DEVICEFAMILYDEVICEFORM` = 12u;
public const val `DEVICEFAMILYDEVICEFORM_INDUSTRY_OTHER`: `DEVICEFAMILYDEVICEFORM` = 29u;
public const val `DEVICEFAMILYDEVICEFORM_INDUSTRY_TABLET`: `DEVICEFAMILYDEVICEFORM` = 13u;
public const val `DEVICEFAMILYDEVICEFORM_KIOSK`: `DEVICEFAMILYDEVICEFORM` = 20u;
public const val `DEVICEFAMILYDEVICEFORM_LARGESCREEN`: `DEVICEFAMILYDEVICEFORM` = 10u;
public const val `DEVICEFAMILYDEVICEFORM_MAKER_BOARD`: `DEVICEFAMILYDEVICEFORM` = 21u;
public const val `DEVICEFAMILYDEVICEFORM_MAX`: `DEVICEFAMILYDEVICEFORM` = 45u;
public const val `DEVICEFAMILYDEVICEFORM_MEDICAL`: `DEVICEFAMILYDEVICEFORM` = 22u;
public const val `DEVICEFAMILYDEVICEFORM_NETWORKING`: `DEVICEFAMILYDEVICEFORM` = 23u;
public const val `DEVICEFAMILYDEVICEFORM_NOTEBOOK`: `DEVICEFAMILYDEVICEFORM` = 4u;
public const val `DEVICEFAMILYDEVICEFORM_PHONE`: `DEVICEFAMILYDEVICEFORM` = 1u;
public const val `DEVICEFAMILYDEVICEFORM_POINT_OF_SERVICE`: `DEVICEFAMILYDEVICEFORM` = 24u;
public const val `DEVICEFAMILYDEVICEFORM_PRINTING`: `DEVICEFAMILYDEVICEFORM` = 25u;
public const val `DEVICEFAMILYDEVICEFORM_PUCK`: `DEVICEFAMILYDEVICEFORM` = 9u;
public const val `DEVICEFAMILYDEVICEFORM_STICKPC`: `DEVICEFAMILYDEVICEFORM` = 8u;
public const val `DEVICEFAMILYDEVICEFORM_TABLET`: `DEVICEFAMILYDEVICEFORM` = 2u;
public const val `DEVICEFAMILYDEVICEFORM_THIN_CLIENT`: `DEVICEFAMILYDEVICEFORM` = 26u;
public const val `DEVICEFAMILYDEVICEFORM_TOY`: `DEVICEFAMILYDEVICEFORM` = 27u;
public const val `DEVICEFAMILYDEVICEFORM_UNKNOWN`: `DEVICEFAMILYDEVICEFORM` = 0u;
public const val `DEVICEFAMILYDEVICEFORM_VENDING`: `DEVICEFAMILYDEVICEFORM` = 28u;
public const val `DEVICEFAMILYDEVICEFORM_XBOX_ONE`: `DEVICEFAMILYDEVICEFORM` = 30u;
public const val `DEVICEFAMILYDEVICEFORM_XBOX_ONE_S`: `DEVICEFAMILYDEVICEFORM` = 31u;
public const val `DEVICEFAMILYDEVICEFORM_XBOX_ONE_X`: `DEVICEFAMILYDEVICEFORM` = 32u;
public const val `DEVICEFAMILYDEVICEFORM_XBOX_ONE_X_DEVKIT`: `DEVICEFAMILYDEVICEFORM` = 33u;
public const val `DEVICEFAMILYDEVICEFORM_XBOX_RESERVED_01`: `DEVICEFAMILYDEVICEFORM` = 37u;
public const val `DEVICEFAMILYDEVICEFORM_XBOX_RESERVED_02`: `DEVICEFAMILYDEVICEFORM` = 38u;
public const val `DEVICEFAMILYDEVICEFORM_XBOX_RESERVED_03`: `DEVICEFAMILYDEVICEFORM` = 39u;
public const val `DEVICEFAMILYDEVICEFORM_XBOX_RESERVED_04`: `DEVICEFAMILYDEVICEFORM` = 40u;
public const val `DEVICEFAMILYDEVICEFORM_XBOX_RESERVED_05`: `DEVICEFAMILYDEVICEFORM` = 41u;
public const val `DEVICEFAMILYDEVICEFORM_XBOX_RESERVED_06`: `DEVICEFAMILYDEVICEFORM` = 42u;
public const val `DEVICEFAMILYDEVICEFORM_XBOX_RESERVED_07`: `DEVICEFAMILYDEVICEFORM` = 43u;
public const val `DEVICEFAMILYDEVICEFORM_XBOX_RESERVED_08`: `DEVICEFAMILYDEVICEFORM` = 44u;
public const val `DEVICEFAMILYDEVICEFORM_XBOX_RESERVED_09`: `DEVICEFAMILYDEVICEFORM` = 45u;
public const val `DEVICEFAMILYDEVICEFORM_XBOX_SERIES_S`: `DEVICEFAMILYDEVICEFORM` = 36u;
public const val `DEVICEFAMILYDEVICEFORM_XBOX_SERIES_X`: `DEVICEFAMILYDEVICEFORM` = 34u;
public const val `DEVICEFAMILYDEVICEFORM_XBOX_SERIES_X_DEVKIT`: `DEVICEFAMILYDEVICEFORM` = 35u;
public typealias `DEVICEFAMILYINFOENUM` = UInt;
public const val `DEVICEFAMILYINFOENUM_7067329`: `DEVICEFAMILYINFOENUM` = 15u;
public const val `DEVICEFAMILYINFOENUM_8828080`: `DEVICEFAMILYINFOENUM` = 14u;
public const val `DEVICEFAMILYINFOENUM_DESKTOP`: `DEVICEFAMILYINFOENUM` = 3u;
public const val `DEVICEFAMILYINFOENUM_HOLOGRAPHIC`: `DEVICEFAMILYINFOENUM` = 10u;
public const val `DEVICEFAMILYINFOENUM_IOT`: `DEVICEFAMILYINFOENUM` = 7u;
public const val `DEVICEFAMILYINFOENUM_IOT_HEADLESS`: `DEVICEFAMILYINFOENUM` = 8u;
public const val `DEVICEFAMILYINFOENUM_MAX`: `DEVICEFAMILYINFOENUM` = 17u;
public const val `DEVICEFAMILYINFOENUM_MOBILE`: `DEVICEFAMILYINFOENUM` = 4u;
public const val `DEVICEFAMILYINFOENUM_SERVER`: `DEVICEFAMILYINFOENUM` = 9u;
public const val `DEVICEFAMILYINFOENUM_SERVER_NANO`: `DEVICEFAMILYINFOENUM` = 13u;
public const val `DEVICEFAMILYINFOENUM_TEAM`: `DEVICEFAMILYINFOENUM` = 6u;
public const val `DEVICEFAMILYINFOENUM_UAP`: `DEVICEFAMILYINFOENUM` = 0u;
public const val `DEVICEFAMILYINFOENUM_WINDOWS_8X`: `DEVICEFAMILYINFOENUM` = 1u;
public const val `DEVICEFAMILYINFOENUM_WINDOWS_CORE`: `DEVICEFAMILYINFOENUM` = 16u;
public const val `DEVICEFAMILYINFOENUM_WINDOWS_CORE_HEADLESS`: `DEVICEFAMILYINFOENUM` = 17u;
public const val `DEVICEFAMILYINFOENUM_WINDOWS_PHONE_8X`: `DEVICEFAMILYINFOENUM` = 2u;
public const val `DEVICEFAMILYINFOENUM_XBOX`: `DEVICEFAMILYINFOENUM` = 5u;
public const val `DEVICEFAMILYINFOENUM_XBOXERA`: `DEVICEFAMILYINFOENUM` = 12u;
public const val `DEVICEFAMILYINFOENUM_XBOXSRA`: `DEVICEFAMILYINFOENUM` = 11u;
public const val `DeveloperDriveDisabledByGroupPolicy`: `DEVELOPER_DRIVE_ENABLEMENT_STATE` = 3;
public const val `DeveloperDriveDisabledBySystemPolicy`: `DEVELOPER_DRIVE_ENABLEMENT_STATE` = 2;
public const val `DeveloperDriveEnabled`: `DEVELOPER_DRIVE_ENABLEMENT_STATE` = 1;
public const val `DeveloperDriveEnablementStateError`: `DEVELOPER_DRIVE_ENABLEMENT_STATE` = 0;
public const val `FIRM`: `FIRMWARE_TABLE_PROVIDER` = 1179210317u;
public typealias `FIRMWARE_TABLE_PROVIDER` = UInt;
public typealias `FIRMWARE_TYPE` = Int;
public const val `FirmwareTypeBios`: `FIRMWARE_TYPE` = 1;
public const val `FirmwareTypeMax`: `FIRMWARE_TYPE` = 3;
public const val `FirmwareTypeUefi`: `FIRMWARE_TYPE` = 2;
public const val `FirmwareTypeUnknown`: `FIRMWARE_TYPE` = 0;
// UNSUPPORTED Rust 204:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GROUP_AFFINITY {
//     pub Mask: usize,
//     pub Group: u16,
//     pub Reserved: [u16; 3],
// }

// UNSUPPORTED Rust 211:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GROUP_AFFINITY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 216:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GROUP_RELATIONSHIP {
//     pub MaximumGroupCount: u16,
//     pub ActiveGroupCount: u16,
//     pub Reserved: [u8; 20],
//     pub GroupInfo: [PROCESSOR_GROUP_INFO; 1],
// }

// UNSUPPORTED Rust 224:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GROUP_RELATIONSHIP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GlobalDataIdConsoleSharedDataFlags`: `RTL_SYSTEM_GLOBAL_DATA_ID` = 14;
public const val `GlobalDataIdCyclesPerYield`: `RTL_SYSTEM_GLOBAL_DATA_ID` = 11;
public const val `GlobalDataIdImageNumberHigh`: `RTL_SYSTEM_GLOBAL_DATA_ID` = 5;
public const val `GlobalDataIdImageNumberLow`: `RTL_SYSTEM_GLOBAL_DATA_ID` = 4;
public const val `GlobalDataIdInterruptTime`: `RTL_SYSTEM_GLOBAL_DATA_ID` = 2;
public const val `GlobalDataIdKdDebuggerEnabled`: `RTL_SYSTEM_GLOBAL_DATA_ID` = 10;
public const val `GlobalDataIdLastSystemRITEventTickCount`: `RTL_SYSTEM_GLOBAL_DATA_ID` = 13;
public const val `GlobalDataIdNtMajorVersion`: `RTL_SYSTEM_GLOBAL_DATA_ID` = 7;
public const val `GlobalDataIdNtMinorVersion`: `RTL_SYSTEM_GLOBAL_DATA_ID` = 8;
public const val `GlobalDataIdNtSystemRootDrive`: `RTL_SYSTEM_GLOBAL_DATA_ID` = 15;
public const val `GlobalDataIdQpcBias`: `RTL_SYSTEM_GLOBAL_DATA_ID` = 19;
public const val `GlobalDataIdQpcBypassEnabled`: `RTL_SYSTEM_GLOBAL_DATA_ID` = 17;
public const val `GlobalDataIdQpcData`: `RTL_SYSTEM_GLOBAL_DATA_ID` = 18;
public const val `GlobalDataIdQpcShift`: `RTL_SYSTEM_GLOBAL_DATA_ID` = 16;
public const val `GlobalDataIdRngSeedVersion`: `RTL_SYSTEM_GLOBAL_DATA_ID` = 1;
public const val `GlobalDataIdSafeBootMode`: `RTL_SYSTEM_GLOBAL_DATA_ID` = 12;
public const val `GlobalDataIdSystemExpirationDate`: `RTL_SYSTEM_GLOBAL_DATA_ID` = 9;
public const val `GlobalDataIdTimeZoneBias`: `RTL_SYSTEM_GLOBAL_DATA_ID` = 3;
public const val `GlobalDataIdTimeZoneId`: `RTL_SYSTEM_GLOBAL_DATA_ID` = 6;
public const val `GlobalDataIdUnknown`: `RTL_SYSTEM_GLOBAL_DATA_ID` = 0;
public typealias `IMAGE_FILE_MACHINE` = UShort;
public const val `IMAGE_FILE_MACHINE_ALPHA`: `IMAGE_FILE_MACHINE` = 388u;
public const val `IMAGE_FILE_MACHINE_ALPHA64`: `IMAGE_FILE_MACHINE` = 644u;
public const val `IMAGE_FILE_MACHINE_AM33`: `IMAGE_FILE_MACHINE` = 467u;
public const val `IMAGE_FILE_MACHINE_AMD64`: `IMAGE_FILE_MACHINE` = 34404u;
public const val `IMAGE_FILE_MACHINE_ARM`: `IMAGE_FILE_MACHINE` = 448u;
public const val `IMAGE_FILE_MACHINE_ARM64`: `IMAGE_FILE_MACHINE` = 43620u;
public const val `IMAGE_FILE_MACHINE_ARMNT`: `IMAGE_FILE_MACHINE` = 452u;
public const val `IMAGE_FILE_MACHINE_AXP64`: `IMAGE_FILE_MACHINE` = 644u;
public const val `IMAGE_FILE_MACHINE_CEE`: `IMAGE_FILE_MACHINE` = 49390u;
public const val `IMAGE_FILE_MACHINE_CEF`: `IMAGE_FILE_MACHINE` = 3311u;
public const val `IMAGE_FILE_MACHINE_EBC`: `IMAGE_FILE_MACHINE` = 3772u;
public const val `IMAGE_FILE_MACHINE_I386`: `IMAGE_FILE_MACHINE` = 332u;
public const val `IMAGE_FILE_MACHINE_IA64`: `IMAGE_FILE_MACHINE` = 512u;
public const val `IMAGE_FILE_MACHINE_M32R`: `IMAGE_FILE_MACHINE` = 36929u;
public const val `IMAGE_FILE_MACHINE_MIPS16`: `IMAGE_FILE_MACHINE` = 614u;
public const val `IMAGE_FILE_MACHINE_MIPSFPU`: `IMAGE_FILE_MACHINE` = 870u;
public const val `IMAGE_FILE_MACHINE_MIPSFPU16`: `IMAGE_FILE_MACHINE` = 1126u;
public const val `IMAGE_FILE_MACHINE_POWERPC`: `IMAGE_FILE_MACHINE` = 496u;
public const val `IMAGE_FILE_MACHINE_POWERPCFP`: `IMAGE_FILE_MACHINE` = 497u;
public const val `IMAGE_FILE_MACHINE_R10000`: `IMAGE_FILE_MACHINE` = 360u;
public const val `IMAGE_FILE_MACHINE_R3000`: `IMAGE_FILE_MACHINE` = 354u;
public const val `IMAGE_FILE_MACHINE_R4000`: `IMAGE_FILE_MACHINE` = 358u;
public const val `IMAGE_FILE_MACHINE_SH3`: `IMAGE_FILE_MACHINE` = 418u;
public const val `IMAGE_FILE_MACHINE_SH3DSP`: `IMAGE_FILE_MACHINE` = 419u;
public const val `IMAGE_FILE_MACHINE_SH3E`: `IMAGE_FILE_MACHINE` = 420u;
public const val `IMAGE_FILE_MACHINE_SH4`: `IMAGE_FILE_MACHINE` = 422u;
public const val `IMAGE_FILE_MACHINE_SH5`: `IMAGE_FILE_MACHINE` = 424u;
public const val `IMAGE_FILE_MACHINE_TARGET_HOST`: `IMAGE_FILE_MACHINE` = 1u;
public const val `IMAGE_FILE_MACHINE_THUMB`: `IMAGE_FILE_MACHINE` = 450u;
public const val `IMAGE_FILE_MACHINE_TRICORE`: `IMAGE_FILE_MACHINE` = 1312u;
public const val `IMAGE_FILE_MACHINE_UNKNOWN`: `IMAGE_FILE_MACHINE` = 0u;
public const val `IMAGE_FILE_MACHINE_WCEMIPSV2`: `IMAGE_FILE_MACHINE` = 361u;
public typealias `LOGICAL_PROCESSOR_RELATIONSHIP` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MEMORYSTATUS` (
    public var `dwLength`: UInt,
    public var `dwMemoryLoad`: UInt,
    public var `dwTotalPhys`: ULong,
    public var `dwAvailPhys`: ULong,
    public var `dwTotalPageFile`: ULong,
    public var `dwAvailPageFile`: ULong,
    public var `dwTotalVirtual`: ULong,
    public var `dwAvailVirtual`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MEMORYSTATUSEX` (
    public var `dwLength`: UInt,
    public var `dwMemoryLoad`: UInt,
    public var `ullTotalPhys`: ULong,
    public var `ullAvailPhys`: ULong,
    public var `ullTotalPageFile`: ULong,
    public var `ullAvailPageFile`: ULong,
    public var `ullTotalVirtual`: ULong,
    public var `ullAvailVirtual`: ULong,
    public var `ullAvailExtendedVirtual`: ULong,
)
public const val `NTDDI_LONGHORN`: UInt = 100663296u;
public const val `NTDDI_VERSION`: UInt = 167772172u;
public const val `NTDDI_VISTA`: UInt = 100663296u;
public const val `NTDDI_VISTASP1`: UInt = 100663552u;
public const val `NTDDI_VISTASP2`: UInt = 100663808u;
public const val `NTDDI_VISTASP3`: UInt = 100664064u;
public const val `NTDDI_VISTASP4`: UInt = 100664320u;
public const val `NTDDI_WIN10`: UInt = 167772160u;
public const val `NTDDI_WIN10_19H1`: UInt = 167772167u;
public const val `NTDDI_WIN10_CO`: UInt = 167772171u;
public const val `NTDDI_WIN10_FE`: UInt = 167772170u;
public const val `NTDDI_WIN10_MN`: UInt = 167772169u;
public const val `NTDDI_WIN10_NI`: UInt = 167772172u;
public const val `NTDDI_WIN10_RS1`: UInt = 167772162u;
public const val `NTDDI_WIN10_RS2`: UInt = 167772163u;
public const val `NTDDI_WIN10_RS3`: UInt = 167772164u;
public const val `NTDDI_WIN10_RS4`: UInt = 167772165u;
public const val `NTDDI_WIN10_RS5`: UInt = 167772166u;
public const val `NTDDI_WIN10_TH2`: UInt = 167772161u;
public const val `NTDDI_WIN10_VB`: UInt = 167772168u;
public const val `NTDDI_WIN2K`: UInt = 83886080u;
public const val `NTDDI_WIN2KSP1`: UInt = 83886336u;
public const val `NTDDI_WIN2KSP2`: UInt = 83886592u;
public const val `NTDDI_WIN2KSP3`: UInt = 83886848u;
public const val `NTDDI_WIN2KSP4`: UInt = 83887104u;
public const val `NTDDI_WIN4`: UInt = 67108864u;
public const val `NTDDI_WIN6`: UInt = 100663296u;
public const val `NTDDI_WIN6SP1`: UInt = 100663552u;
public const val `NTDDI_WIN6SP2`: UInt = 100663808u;
public const val `NTDDI_WIN6SP3`: UInt = 100664064u;
public const val `NTDDI_WIN6SP4`: UInt = 100664320u;
public const val `NTDDI_WIN7`: UInt = 100728832u;
public const val `NTDDI_WIN8`: UInt = 100794368u;
public const val `NTDDI_WINBLUE`: UInt = 100859904u;
public const val `NTDDI_WINTHRESHOLD`: UInt = 167772160u;
public const val `NTDDI_WINXP`: UInt = 83951616u;
public const val `NTDDI_WINXPSP1`: UInt = 83951872u;
public const val `NTDDI_WINXPSP2`: UInt = 83952128u;
public const val `NTDDI_WINXPSP3`: UInt = 83952384u;
public const val `NTDDI_WINXPSP4`: UInt = 83952640u;
public const val `NTDDI_WS03`: UInt = 84017152u;
public const val `NTDDI_WS03SP1`: UInt = 84017408u;
public const val `NTDDI_WS03SP2`: UInt = 84017664u;
public const val `NTDDI_WS03SP3`: UInt = 84017920u;
public const val `NTDDI_WS03SP4`: UInt = 84018176u;
public const val `NTDDI_WS08`: UInt = 100663552u;
public const val `NTDDI_WS08SP2`: UInt = 100663808u;
public const val `NTDDI_WS08SP3`: UInt = 100664064u;
public const val `NTDDI_WS08SP4`: UInt = 100664320u;
// UNSUPPORTED Rust 357:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NUMA_NODE_RELATIONSHIP {
//     pub NodeNumber: u32,
//     pub Reserved: [u8; 18],
//     pub GroupCount: u16,
//     pub Anonymous: NUMA_NODE_RELATIONSHIP_0,
// }

// UNSUPPORTED Rust 365:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NUMA_NODE_RELATIONSHIP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 370:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NUMA_NODE_RELATIONSHIP_0 {
//     pub GroupMask: GROUP_AFFINITY,
//     pub GroupMasks: [GROUP_AFFINITY; 1],
// }

// UNSUPPORTED Rust 376:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NUMA_NODE_RELATIONSHIP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 381:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OSVERSIONINFOA {
//     pub dwOSVersionInfoSize: u32,
//     pub dwMajorVersion: u32,
//     pub dwMinorVersion: u32,
//     pub dwBuildNumber: u32,
//     pub dwPlatformId: u32,
//     pub szCSDVersion: [i8; 128],
// }

// UNSUPPORTED Rust 391:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OSVERSIONINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 396:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OSVERSIONINFOEXA {
//     pub dwOSVersionInfoSize: u32,
//     pub dwMajorVersion: u32,
//     pub dwMinorVersion: u32,
//     pub dwBuildNumber: u32,
//     pub dwPlatformId: u32,
//     pub szCSDVersion: [i8; 128],
//     pub wServicePackMajor: u16,
//     pub wServicePackMinor: u16,
//     pub wSuiteMask: u16,
//     pub wProductType: u8,
//     pub wReserved: u8,
// }

// UNSUPPORTED Rust 411:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OSVERSIONINFOEXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 416:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OSVERSIONINFOEXW {
//     pub dwOSVersionInfoSize: u32,
//     pub dwMajorVersion: u32,
//     pub dwMinorVersion: u32,
//     pub dwBuildNumber: u32,
//     pub dwPlatformId: u32,
//     pub szCSDVersion: [u16; 128],
//     pub wServicePackMajor: u16,
//     pub wServicePackMinor: u16,
//     pub wSuiteMask: u16,
//     pub wProductType: u8,
//     pub wReserved: u8,
// }

// UNSUPPORTED Rust 431:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OSVERSIONINFOEXW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 436:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OSVERSIONINFOW {
//     pub dwOSVersionInfoSize: u32,
//     pub dwMajorVersion: u32,
//     pub dwMinorVersion: u32,
//     pub dwBuildNumber: u32,
//     pub dwPlatformId: u32,
//     pub szCSDVersion: [u16; 128],
// }

// UNSUPPORTED Rust 446:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OSVERSIONINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OSVERSION_MASK`: UInt = 4294901760u;
public typealias `OS_DEPLOYEMENT_STATE_VALUES` = Int;
public const val `OS_DEPLOYMENT_COMPACT`: `OS_DEPLOYEMENT_STATE_VALUES` = 2;
public const val `OS_DEPLOYMENT_STANDARD`: `OS_DEPLOYEMENT_STATE_VALUES` = 1;
public typealias `OS_PRODUCT_TYPE` = UInt;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PGET_SYSTEM_WOW64_DIRECTORY_A` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PSTR`, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PGET_SYSTEM_WOW64_DIRECTORY_W` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PWSTR`, UInt) -> UInt>>>;
public typealias `PROCESSOR_ARCHITECTURE` = UShort;
public const val `PROCESSOR_ARCHITECTURE_ALPHA`: `PROCESSOR_ARCHITECTURE` = 2u;
public const val `PROCESSOR_ARCHITECTURE_ALPHA64`: `PROCESSOR_ARCHITECTURE` = 7u;
public const val `PROCESSOR_ARCHITECTURE_AMD64`: `PROCESSOR_ARCHITECTURE` = 9u;
public const val `PROCESSOR_ARCHITECTURE_ARM`: `PROCESSOR_ARCHITECTURE` = 5u;
public const val `PROCESSOR_ARCHITECTURE_ARM32_ON_WIN64`: `PROCESSOR_ARCHITECTURE` = 13u;
public const val `PROCESSOR_ARCHITECTURE_ARM64`: `PROCESSOR_ARCHITECTURE` = 12u;
public const val `PROCESSOR_ARCHITECTURE_IA32_ON_ARM64`: `PROCESSOR_ARCHITECTURE` = 14u;
public const val `PROCESSOR_ARCHITECTURE_IA32_ON_WIN64`: `PROCESSOR_ARCHITECTURE` = 10u;
public const val `PROCESSOR_ARCHITECTURE_IA64`: `PROCESSOR_ARCHITECTURE` = 6u;
public const val `PROCESSOR_ARCHITECTURE_INTEL`: `PROCESSOR_ARCHITECTURE` = 0u;
public const val `PROCESSOR_ARCHITECTURE_MIPS`: `PROCESSOR_ARCHITECTURE` = 1u;
public const val `PROCESSOR_ARCHITECTURE_MSIL`: `PROCESSOR_ARCHITECTURE` = 8u;
public const val `PROCESSOR_ARCHITECTURE_NEUTRAL`: `PROCESSOR_ARCHITECTURE` = 11u;
public const val `PROCESSOR_ARCHITECTURE_PPC`: `PROCESSOR_ARCHITECTURE` = 3u;
public const val `PROCESSOR_ARCHITECTURE_SHX`: `PROCESSOR_ARCHITECTURE` = 4u;
public const val `PROCESSOR_ARCHITECTURE_UNKNOWN`: `PROCESSOR_ARCHITECTURE` = 65535u;
public typealias `PROCESSOR_CACHE_TYPE` = Int;
// UNSUPPORTED Rust 476:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROCESSOR_GROUP_INFO {
//     pub MaximumProcessorCount: u8,
//     pub ActiveProcessorCount: u8,
//     pub Reserved: [u8; 38],
//     pub ActiveProcessorMask: usize,
// }

// UNSUPPORTED Rust 484:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESSOR_GROUP_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 489:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROCESSOR_RELATIONSHIP {
//     pub Flags: u8,
//     pub EfficiencyClass: u8,
//     pub Reserved: [u8; 20],
//     pub GroupCount: u16,
//     pub GroupMask: [GROUP_AFFINITY; 1],
// }

// UNSUPPORTED Rust 498:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESSOR_RELATIONSHIP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PRODUCT_BUSINESS`: `OS_PRODUCT_TYPE` = 6u;
public const val `PRODUCT_BUSINESS_N`: `OS_PRODUCT_TYPE` = 16u;
public const val `PRODUCT_CLUSTER_SERVER`: `OS_PRODUCT_TYPE` = 18u;
public const val `PRODUCT_CLUSTER_SERVER_V`: `OS_PRODUCT_TYPE` = 64u;
public const val `PRODUCT_CORE`: `OS_PRODUCT_TYPE` = 101u;
public const val `PRODUCT_CORE_COUNTRYSPECIFIC`: `OS_PRODUCT_TYPE` = 99u;
public const val `PRODUCT_CORE_N`: `OS_PRODUCT_TYPE` = 98u;
public const val `PRODUCT_CORE_SINGLELANGUAGE`: `OS_PRODUCT_TYPE` = 100u;
public const val `PRODUCT_DATACENTER_A_SERVER_CORE`: `OS_PRODUCT_TYPE` = 145u;
public const val `PRODUCT_DATACENTER_EVALUATION_SERVER`: `OS_PRODUCT_TYPE` = 80u;
public const val `PRODUCT_DATACENTER_SERVER`: `OS_PRODUCT_TYPE` = 8u;
public const val `PRODUCT_DATACENTER_SERVER_CORE`: `OS_PRODUCT_TYPE` = 12u;
public const val `PRODUCT_DATACENTER_SERVER_CORE_V`: `OS_PRODUCT_TYPE` = 39u;
public const val `PRODUCT_DATACENTER_SERVER_V`: `OS_PRODUCT_TYPE` = 37u;
public const val `PRODUCT_EDUCATION`: `OS_PRODUCT_TYPE` = 121u;
public const val `PRODUCT_EDUCATION_N`: `OS_PRODUCT_TYPE` = 122u;
public const val `PRODUCT_ENTERPRISE`: `OS_PRODUCT_TYPE` = 4u;
public const val `PRODUCT_ENTERPRISE_E`: `OS_PRODUCT_TYPE` = 70u;
public const val `PRODUCT_ENTERPRISE_EVALUATION`: `OS_PRODUCT_TYPE` = 72u;
public const val `PRODUCT_ENTERPRISE_N`: `OS_PRODUCT_TYPE` = 27u;
public const val `PRODUCT_ENTERPRISE_N_EVALUATION`: `OS_PRODUCT_TYPE` = 84u;
public const val `PRODUCT_ENTERPRISE_S`: `OS_PRODUCT_TYPE` = 125u;
public const val `PRODUCT_ENTERPRISE_SERVER`: `OS_PRODUCT_TYPE` = 10u;
public const val `PRODUCT_ENTERPRISE_SERVER_CORE`: `OS_PRODUCT_TYPE` = 14u;
public const val `PRODUCT_ENTERPRISE_SERVER_CORE_V`: `OS_PRODUCT_TYPE` = 41u;
public const val `PRODUCT_ENTERPRISE_SERVER_IA64`: `OS_PRODUCT_TYPE` = 15u;
public const val `PRODUCT_ENTERPRISE_SERVER_V`: `OS_PRODUCT_TYPE` = 38u;
public const val `PRODUCT_ENTERPRISE_S_EVALUATION`: `OS_PRODUCT_TYPE` = 129u;
public const val `PRODUCT_ENTERPRISE_S_N`: `OS_PRODUCT_TYPE` = 126u;
public const val `PRODUCT_ENTERPRISE_S_N_EVALUATION`: `OS_PRODUCT_TYPE` = 130u;
public const val `PRODUCT_ESSENTIALBUSINESS_SERVER_ADDL`: `OS_PRODUCT_TYPE` = 60u;
public const val `PRODUCT_ESSENTIALBUSINESS_SERVER_ADDLSVC`: `OS_PRODUCT_TYPE` = 62u;
public const val `PRODUCT_ESSENTIALBUSINESS_SERVER_MGMT`: `OS_PRODUCT_TYPE` = 59u;
public const val `PRODUCT_ESSENTIALBUSINESS_SERVER_MGMTSVC`: `OS_PRODUCT_TYPE` = 61u;
public const val `PRODUCT_HOME_BASIC`: `OS_PRODUCT_TYPE` = 2u;
public const val `PRODUCT_HOME_BASIC_E`: `OS_PRODUCT_TYPE` = 67u;
public const val `PRODUCT_HOME_BASIC_N`: `OS_PRODUCT_TYPE` = 5u;
public const val `PRODUCT_HOME_PREMIUM`: `OS_PRODUCT_TYPE` = 3u;
public const val `PRODUCT_HOME_PREMIUM_E`: `OS_PRODUCT_TYPE` = 68u;
public const val `PRODUCT_HOME_PREMIUM_N`: `OS_PRODUCT_TYPE` = 26u;
public const val `PRODUCT_HOME_PREMIUM_SERVER`: `OS_PRODUCT_TYPE` = 34u;
public const val `PRODUCT_HOME_SERVER`: `OS_PRODUCT_TYPE` = 19u;
public const val `PRODUCT_HYPERV`: `OS_PRODUCT_TYPE` = 42u;
public const val `PRODUCT_IOTUAP`: `OS_PRODUCT_TYPE` = 123u;
public const val `PRODUCT_IOTUAPCOMMERCIAL`: `OS_PRODUCT_TYPE` = 131u;
public const val `PRODUCT_MEDIUMBUSINESS_SERVER_MANAGEMENT`: `OS_PRODUCT_TYPE` = 30u;
public const val `PRODUCT_MEDIUMBUSINESS_SERVER_MESSAGING`: `OS_PRODUCT_TYPE` = 32u;
public const val `PRODUCT_MEDIUMBUSINESS_SERVER_SECURITY`: `OS_PRODUCT_TYPE` = 31u;
public const val `PRODUCT_MOBILE_CORE`: `OS_PRODUCT_TYPE` = 104u;
public const val `PRODUCT_MOBILE_ENTERPRISE`: `OS_PRODUCT_TYPE` = 133u;
public const val `PRODUCT_MULTIPOINT_PREMIUM_SERVER`: `OS_PRODUCT_TYPE` = 77u;
public const val `PRODUCT_MULTIPOINT_STANDARD_SERVER`: `OS_PRODUCT_TYPE` = 76u;
public const val `PRODUCT_PROFESSIONAL`: `OS_PRODUCT_TYPE` = 48u;
public const val `PRODUCT_PROFESSIONAL_E`: `OS_PRODUCT_TYPE` = 69u;
public const val `PRODUCT_PROFESSIONAL_N`: `OS_PRODUCT_TYPE` = 49u;
public const val `PRODUCT_PROFESSIONAL_WMC`: `OS_PRODUCT_TYPE` = 103u;
public const val `PRODUCT_PRO_WORKSTATION`: `OS_PRODUCT_TYPE` = 161u;
public const val `PRODUCT_PRO_WORKSTATION_N`: `OS_PRODUCT_TYPE` = 162u;
public const val `PRODUCT_SB_SOLUTION_SERVER`: `OS_PRODUCT_TYPE` = 50u;
public const val `PRODUCT_SB_SOLUTION_SERVER_EM`: `OS_PRODUCT_TYPE` = 54u;
public const val `PRODUCT_SERVER_FOR_SB_SOLUTIONS`: `OS_PRODUCT_TYPE` = 51u;
public const val `PRODUCT_SERVER_FOR_SB_SOLUTIONS_EM`: `OS_PRODUCT_TYPE` = 55u;
public const val `PRODUCT_SERVER_FOR_SMALLBUSINESS`: `OS_PRODUCT_TYPE` = 24u;
public const val `PRODUCT_SERVER_FOR_SMALLBUSINESS_V`: `OS_PRODUCT_TYPE` = 35u;
public const val `PRODUCT_SERVER_FOUNDATION`: `OS_PRODUCT_TYPE` = 33u;
public const val `PRODUCT_SMALLBUSINESS_SERVER`: `OS_PRODUCT_TYPE` = 9u;
public const val `PRODUCT_SMALLBUSINESS_SERVER_PREMIUM`: `OS_PRODUCT_TYPE` = 25u;
public const val `PRODUCT_SMALLBUSINESS_SERVER_PREMIUM_CORE`: `OS_PRODUCT_TYPE` = 63u;
public const val `PRODUCT_SOLUTION_EMBEDDEDSERVER`: `OS_PRODUCT_TYPE` = 56u;
public const val `PRODUCT_STANDARD_A_SERVER_CORE`: `OS_PRODUCT_TYPE` = 146u;
public const val `PRODUCT_STANDARD_EVALUATION_SERVER`: `OS_PRODUCT_TYPE` = 79u;
public const val `PRODUCT_STANDARD_SERVER`: `OS_PRODUCT_TYPE` = 7u;
public const val `PRODUCT_STANDARD_SERVER_CORE_`: `OS_PRODUCT_TYPE` = 13u;
public const val `PRODUCT_STANDARD_SERVER_CORE_V`: `OS_PRODUCT_TYPE` = 40u;
public const val `PRODUCT_STANDARD_SERVER_SOLUTIONS`: `OS_PRODUCT_TYPE` = 52u;
public const val `PRODUCT_STANDARD_SERVER_SOLUTIONS_CORE`: `OS_PRODUCT_TYPE` = 53u;
public const val `PRODUCT_STANDARD_SERVER_V`: `OS_PRODUCT_TYPE` = 36u;
public const val `PRODUCT_STARTER`: `OS_PRODUCT_TYPE` = 11u;
public const val `PRODUCT_STARTER_E`: `OS_PRODUCT_TYPE` = 66u;
public const val `PRODUCT_STARTER_N`: `OS_PRODUCT_TYPE` = 47u;
public const val `PRODUCT_STORAGE_ENTERPRISE_SERVER`: `OS_PRODUCT_TYPE` = 23u;
public const val `PRODUCT_STORAGE_ENTERPRISE_SERVER_CORE`: `OS_PRODUCT_TYPE` = 46u;
public const val `PRODUCT_STORAGE_EXPRESS_SERVER`: `OS_PRODUCT_TYPE` = 20u;
public const val `PRODUCT_STORAGE_EXPRESS_SERVER_CORE`: `OS_PRODUCT_TYPE` = 43u;
public const val `PRODUCT_STORAGE_STANDARD_EVALUATION_SERVER`: `OS_PRODUCT_TYPE` = 96u;
public const val `PRODUCT_STORAGE_STANDARD_SERVER`: `OS_PRODUCT_TYPE` = 21u;
public const val `PRODUCT_STORAGE_STANDARD_SERVER_CORE`: `OS_PRODUCT_TYPE` = 44u;
public const val `PRODUCT_STORAGE_WORKGROUP_EVALUATION_SERVER`: `OS_PRODUCT_TYPE` = 95u;
public const val `PRODUCT_STORAGE_WORKGROUP_SERVER`: `OS_PRODUCT_TYPE` = 22u;
public const val `PRODUCT_STORAGE_WORKGROUP_SERVER_CORE`: `OS_PRODUCT_TYPE` = 45u;
public const val `PRODUCT_ULTIMATE`: `OS_PRODUCT_TYPE` = 1u;
public const val `PRODUCT_ULTIMATE_E`: `OS_PRODUCT_TYPE` = 71u;
public const val `PRODUCT_ULTIMATE_N`: `OS_PRODUCT_TYPE` = 28u;
public const val `PRODUCT_UNDEFINED`: `OS_PRODUCT_TYPE` = 0u;
public const val `PRODUCT_WEB_SERVER`: `OS_PRODUCT_TYPE` = 17u;
public const val `PRODUCT_WEB_SERVER_CORE`: `OS_PRODUCT_TYPE` = 29u;
public const val `RSMB`: `FIRMWARE_TABLE_PROVIDER` = 1381190978u;
public typealias `RTL_SYSTEM_GLOBAL_DATA_ID` = Int;
public const val `RelationAll`: `LOGICAL_PROCESSOR_RELATIONSHIP` = 65535;
public const val `RelationCache`: `LOGICAL_PROCESSOR_RELATIONSHIP` = 2;
public const val `RelationGroup`: `LOGICAL_PROCESSOR_RELATIONSHIP` = 4;
public const val `RelationNumaNode`: `LOGICAL_PROCESSOR_RELATIONSHIP` = 1;
public const val `RelationNumaNodeEx`: `LOGICAL_PROCESSOR_RELATIONSHIP` = 6;
public const val `RelationProcessorCore`: `LOGICAL_PROCESSOR_RELATIONSHIP` = 0;
public const val `RelationProcessorDie`: `LOGICAL_PROCESSOR_RELATIONSHIP` = 5;
public const val `RelationProcessorModule`: `LOGICAL_PROCESSOR_RELATIONSHIP` = 7;
public const val `RelationProcessorPackage`: `LOGICAL_PROCESSOR_RELATIONSHIP` = 3;
public const val `SCEX2_ALT_NETBIOS_NAME`: UInt = 1u;
public const val `SPVERSION_MASK`: UInt = 65280u;
public const val `SUBVERSION_MASK`: UInt = 255u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYSTEM_CPU_SET_INFORMATION` (
    public var `Size`: UInt,
    public var `Type`: `CPU_SET_INFORMATION_TYPE`,
    public var `Anonymous`: `SYSTEM_CPU_SET_INFORMATION_0`,
)
// UNSUPPORTED Rust 620:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_CPU_SET_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 625:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SYSTEM_CPU_SET_INFORMATION_0 {
//     pub CpuSet: SYSTEM_CPU_SET_INFORMATION_0_0,
// }

// UNSUPPORTED Rust 630:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_CPU_SET_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYSTEM_CPU_SET_INFORMATION_0_0` (
    public var `Id`: UInt,
    public var `Group`: UShort,
    public var `LogicalProcessorIndex`: UByte,
    public var `CoreIndex`: UByte,
    public var `LastLevelCacheIndex`: UByte,
    public var `NumaNodeIndex`: UByte,
    public var `EfficiencyClass`: UByte,
    public var `Anonymous1`: `SYSTEM_CPU_SET_INFORMATION_0_0_0`,
    public var `Anonymous2`: `SYSTEM_CPU_SET_INFORMATION_0_0_1`,
    public var `AllocationTag`: ULong,
)
// UNSUPPORTED Rust 649:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_CPU_SET_INFORMATION_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 654:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SYSTEM_CPU_SET_INFORMATION_0_0_0 {
//     pub AllFlags: u8,
//     pub Anonymous: SYSTEM_CPU_SET_INFORMATION_0_0_0_0,
// }

// UNSUPPORTED Rust 660:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_CPU_SET_INFORMATION_0_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SYSTEM_CPU_SET_INFORMATION_0_0_0_0` (
    public var `_bitfield`: UByte,
)
// UNSUPPORTED Rust 670:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SYSTEM_CPU_SET_INFORMATION_0_0_1 {
//     pub Reserved: u32,
//     pub SchedulingClass: u8,
// }

// UNSUPPORTED Rust 676:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_CPU_SET_INFORMATION_0_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SYSTEM_CPU_SET_INFORMATION_ALLOCATED`: UInt = 2u;
public const val `SYSTEM_CPU_SET_INFORMATION_ALLOCATED_TO_TARGET_PROCESS`: UInt = 4u;
public const val `SYSTEM_CPU_SET_INFORMATION_PARKED`: UInt = 1u;
public const val `SYSTEM_CPU_SET_INFORMATION_REALTIME`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYSTEM_INFO` (
    public var `Anonymous`: `SYSTEM_INFO_0`,
    public var `dwPageSize`: UInt,
    public var `lpMinimumApplicationAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `lpMaximumApplicationAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwActiveProcessorMask`: ULong,
    public var `dwNumberOfProcessors`: UInt,
    public var `dwProcessorType`: UInt,
    public var `dwAllocationGranularity`: UInt,
    public var `wProcessorLevel`: UShort,
    public var `wProcessorRevision`: UShort,
)
// UNSUPPORTED Rust 699:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 704:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SYSTEM_INFO_0 {
//     pub dwOemId: u32,
//     pub Anonymous: SYSTEM_INFO_0_0,
// }

// UNSUPPORTED Rust 710:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SYSTEM_INFO_0_0` (
    public var `wProcessorArchitecture`: `PROCESSOR_ARCHITECTURE`,
    public var `wReserved`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYSTEM_LOGICAL_PROCESSOR_INFORMATION` (
    public var `ProcessorMask`: ULong,
    public var `Relationship`: `LOGICAL_PROCESSOR_RELATIONSHIP`,
    public var `Anonymous`: `SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0`,
)
// UNSUPPORTED Rust 728:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_LOGICAL_PROCESSOR_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 733:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0 {
//     pub ProcessorCore: SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0_0,
//     pub NumaNode: SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0_1,
//     pub Cache: CACHE_DESCRIPTOR,
//     pub Reserved: [u64; 2],
// }

// UNSUPPORTED Rust 741:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0_1` (
    public var `NodeNumber`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0_0` (
    public var `Flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX` (
    public var `Relationship`: `LOGICAL_PROCESSOR_RELATIONSHIP`,
    public var `Size`: UInt,
    public var `Anonymous`: `SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX_0`,
)
// UNSUPPORTED Rust 763:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 768:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX_0 {
//     pub Processor: PROCESSOR_RELATIONSHIP,
//     pub NumaNode: NUMA_NODE_RELATIONSHIP,
//     pub Cache: CACHE_RELATIONSHIP,
//     pub Group: GROUP_RELATIONSHIP,
// }

// UNSUPPORTED Rust 776:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SYSTEM_POOL_ZEROING_INFORMATION` (
    public var `PoolZeroingSupportPresent`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION` (
    public var `CycleTime`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SYSTEM_SUPPORTED_PROCESSOR_ARCHITECTURES_INFORMATION` (
    public var `_bitfield`: UInt,
)
public typealias `USER_CET_ENVIRONMENT` = UInt;
public const val `USER_CET_ENVIRONMENT_SGX2_ENCLAVE`: `USER_CET_ENVIRONMENT` = 2u;
public const val `USER_CET_ENVIRONMENT_VBS_BASIC_ENCLAVE`: `USER_CET_ENVIRONMENT` = 17u;
public const val `USER_CET_ENVIRONMENT_VBS_ENCLAVE`: `USER_CET_ENVIRONMENT` = 16u;
public const val `USER_CET_ENVIRONMENT_WIN32_PROCESS`: `USER_CET_ENVIRONMENT` = 0u;
public const val `VER_BUILDNUMBER`: `VER_FLAGS` = 4u;
public typealias `VER_FLAGS` = UInt;
public const val `VER_MAJORVERSION`: `VER_FLAGS` = 2u;
public const val `VER_MINORVERSION`: `VER_FLAGS` = 1u;
public const val `VER_PLATFORMID`: `VER_FLAGS` = 8u;
public const val `VER_PRODUCT_TYPE`: `VER_FLAGS` = 128u;
public const val `VER_SERVICEPACKMAJOR`: `VER_FLAGS` = 32u;
public const val `VER_SERVICEPACKMINOR`: `VER_FLAGS` = 16u;
public const val `VER_SUITENAME`: `VER_FLAGS` = 64u;
public const val `WDK_NTDDI_VERSION`: UInt = 167772172u;
public const val `_WIN32_IE_IE100`: UInt = 2560u;
public const val `_WIN32_IE_IE110`: UInt = 2560u;
public const val `_WIN32_IE_IE20`: UInt = 512u;
public const val `_WIN32_IE_IE30`: UInt = 768u;
public const val `_WIN32_IE_IE302`: UInt = 770u;
public const val `_WIN32_IE_IE40`: UInt = 1024u;
public const val `_WIN32_IE_IE401`: UInt = 1025u;
public const val `_WIN32_IE_IE50`: UInt = 1280u;
public const val `_WIN32_IE_IE501`: UInt = 1281u;
public const val `_WIN32_IE_IE55`: UInt = 1360u;
public const val `_WIN32_IE_IE60`: UInt = 1536u;
public const val `_WIN32_IE_IE60SP1`: UInt = 1537u;
public const val `_WIN32_IE_IE60SP2`: UInt = 1539u;
public const val `_WIN32_IE_IE70`: UInt = 1792u;
public const val `_WIN32_IE_IE80`: UInt = 2048u;
public const val `_WIN32_IE_IE90`: UInt = 2304u;
public const val `_WIN32_IE_LONGHORN`: UInt = 1792u;
public const val `_WIN32_IE_NT4`: UInt = 512u;
public const val `_WIN32_IE_NT4SP1`: UInt = 512u;
public const val `_WIN32_IE_NT4SP2`: UInt = 512u;
public const val `_WIN32_IE_NT4SP3`: UInt = 770u;
public const val `_WIN32_IE_NT4SP4`: UInt = 1025u;
public const val `_WIN32_IE_NT4SP5`: UInt = 1025u;
public const val `_WIN32_IE_NT4SP6`: UInt = 1280u;
public const val `_WIN32_IE_WIN10`: UInt = 2560u;
public const val `_WIN32_IE_WIN2K`: UInt = 1281u;
public const val `_WIN32_IE_WIN2KSP1`: UInt = 1281u;
public const val `_WIN32_IE_WIN2KSP2`: UInt = 1281u;
public const val `_WIN32_IE_WIN2KSP3`: UInt = 1281u;
public const val `_WIN32_IE_WIN2KSP4`: UInt = 1281u;
public const val `_WIN32_IE_WIN6`: UInt = 1792u;
public const val `_WIN32_IE_WIN7`: UInt = 2048u;
public const val `_WIN32_IE_WIN8`: UInt = 2560u;
public const val `_WIN32_IE_WIN98`: UInt = 1025u;
public const val `_WIN32_IE_WIN98SE`: UInt = 1280u;
public const val `_WIN32_IE_WINBLUE`: UInt = 2560u;
public const val `_WIN32_IE_WINME`: UInt = 1360u;
public const val `_WIN32_IE_WINTHRESHOLD`: UInt = 2560u;
public const val `_WIN32_IE_WS03`: UInt = 1538u;
public const val `_WIN32_IE_WS03SP1`: UInt = 1539u;
public const val `_WIN32_IE_XP`: UInt = 1536u;
public const val `_WIN32_IE_XPSP1`: UInt = 1537u;
public const val `_WIN32_IE_XPSP2`: UInt = 1539u;
public const val `_WIN32_WINNT_LONGHORN`: UInt = 1536u;
public const val `_WIN32_WINNT_NT4`: UInt = 1024u;
public const val `_WIN32_WINNT_VISTA`: UInt = 1536u;
public const val `_WIN32_WINNT_WIN10`: UInt = 2560u;
public const val `_WIN32_WINNT_WIN2K`: UInt = 1280u;
public const val `_WIN32_WINNT_WIN6`: UInt = 1536u;
public const val `_WIN32_WINNT_WIN7`: UInt = 1537u;
public const val `_WIN32_WINNT_WIN8`: UInt = 1538u;
public const val `_WIN32_WINNT_WINBLUE`: UInt = 1539u;
public const val `_WIN32_WINNT_WINTHRESHOLD`: UInt = 2560u;
public const val `_WIN32_WINNT_WINXP`: UInt = 1281u;
public const val `_WIN32_WINNT_WS03`: UInt = 1282u;
public const val `_WIN32_WINNT_WS08`: UInt = 1536u;
