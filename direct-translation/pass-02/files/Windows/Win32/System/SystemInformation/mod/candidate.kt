// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn DnsHostnameToComputerNameExW(hostname : windows_sys::core::PCWSTR, computername : windows_sys::core::PWSTR, nsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EnumSystemFirmwareTables(firmwaretableprovidersignature : FIRMWARE_TABLE_PROVIDER, pfirmwaretableenumbuffer : *mut u8, buffersize : u32) -> u32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetComputerNameExA(nametype : COMPUTER_NAME_FORMAT, lpbuffer : windows_sys::core::PSTR, nsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetComputerNameExW(nametype : COMPUTER_NAME_FORMAT, lpbuffer : windows_sys::core::PWSTR, nsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-sysinfo-l1-2-6.dll" "system" fn GetDeveloperDriveEnablementState() -> DEVELOPER_DRIVE_ENABLEMENT_STATE);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetFirmwareType(firmwaretype : *mut FIRMWARE_TYPE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-sysinfo-l1-2-3.dll" "system" fn GetIntegratedDisplaySize(sizeininches : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetLocalTime(lpsystemtime : *mut super::super::Foundation:: SYSTEMTIME));

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetLogicalProcessorInformation(buffer : *mut SYSTEM_LOGICAL_PROCESSOR_INFORMATION, returnedlength : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetLogicalProcessorInformationEx(relationshiptype : LOGICAL_PROCESSOR_RELATIONSHIP, buffer : *mut SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX, returnedlength : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetNativeSystemInfo(lpsysteminfo : *mut SYSTEM_INFO));

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-sysinfo-l1-2-3.dll" "system" fn GetOsManufacturingMode(pbenabled : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-sysinfo-l1-2-0.dll" "system" fn GetOsSafeBootMode(flags : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetPhysicallyInstalledSystemMemory(totalmemoryinkilobytes : *mut u64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetProcessorSystemCycleTime(group : u16, buffer : *mut SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION, returnedlength : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetProductInfo(dwosmajorversion : u32, dwosminorversion : u32, dwspmajorversion : u32, dwspminorversion : u32, pdwreturnedproducttype : *mut OS_PRODUCT_TYPE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetSystemCpuSetInformation(information : *mut SYSTEM_CPU_SET_INFORMATION, bufferlength : u32, returnedlength : *mut u32, process : super::super::Foundation:: HANDLE, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetSystemDEPPolicy() -> DEP_SYSTEM_POLICY_TYPE);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetSystemDirectoryA(lpbuffer : windows_sys::core::PSTR, usize : u32) -> u32);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetSystemDirectoryW(lpbuffer : windows_sys::core::PWSTR, usize : u32) -> u32);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetSystemFirmwareTable(firmwaretableprovidersignature : FIRMWARE_TABLE_PROVIDER, firmwaretableid : u32, pfirmwaretablebuffer : *mut u8, buffersize : u32) -> u32);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetSystemInfo(lpsysteminfo : *mut SYSTEM_INFO));

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetSystemLeapSecondInformation(enabled : *mut windows_sys::core::BOOL, flags : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetSystemTime(lpsystemtime : *mut super::super::Foundation:: SYSTEMTIME));

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetSystemTimeAdjustment(lptimeadjustment : *mut u32, lptimeincrement : *mut u32, lptimeadjustmentdisabled : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-sysinfo-l1-2-4.dll" "system" fn GetSystemTimeAdjustmentPrecise(lptimeadjustment : *mut u64, lptimeincrement : *mut u64, lptimeadjustmentdisabled : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetSystemTimeAsFileTime(lpsystemtimeasfiletime : *mut super::super::Foundation:: FILETIME));

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetSystemTimePreciseAsFileTime(lpsystemtimeasfiletime : *mut super::super::Foundation:: FILETIME));

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetSystemWindowsDirectoryA(lpbuffer : windows_sys::core::PSTR, usize : u32) -> u32);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetSystemWindowsDirectoryW(lpbuffer : windows_sys::core::PWSTR, usize : u32) -> u32);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-wow64-l1-1-1.dll" "system" fn GetSystemWow64Directory2A(lpbuffer : windows_sys::core::PSTR, usize : u32, imagefilemachinetype : IMAGE_FILE_MACHINE) -> u32);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-wow64-l1-1-1.dll" "system" fn GetSystemWow64Directory2W(lpbuffer : windows_sys::core::PWSTR, usize : u32, imagefilemachinetype : IMAGE_FILE_MACHINE) -> u32);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetSystemWow64DirectoryA(lpbuffer : windows_sys::core::PSTR, usize : u32) -> u32);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetSystemWow64DirectoryW(lpbuffer : windows_sys::core::PWSTR, usize : u32) -> u32);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetTickCount() -> u32);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetTickCount64() -> u64);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetVersion() -> u32);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetVersionExA(lpversioninformation : *mut OSVERSIONINFOA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetVersionExW(lpversioninformation : *mut OSVERSIONINFOW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetWindowsDirectoryA(lpbuffer : windows_sys::core::PSTR, usize : u32) -> u32);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetWindowsDirectoryW(lpbuffer : windows_sys::core::PWSTR, usize : u32) -> u32);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GlobalMemoryStatus(lpbuffer : *mut MEMORYSTATUS));

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GlobalMemoryStatusEx(lpbuffer : *mut MEMORYSTATUSEX) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn IsUserCetAvailableInEnvironment(usercetenvironment : USER_CET_ENVIRONMENT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn IsWow64GuestMachineSupported(wowguestmachine : IMAGE_FILE_MACHINE, machineissupported : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize : *mut u32, puldeviceformbuffersize : *mut u32, devicefamily : windows_sys::core::PWSTR, deviceform : windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlGetDeviceFamilyInfoEnum(pulluapinfo : *mut u64, puldevicefamily : *mut DEVICEFAMILYINFOENUM, puldeviceform : *mut DEVICEFAMILYDEVICEFORM));

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlGetProductInfo(osmajorversion : u32, osminorversion : u32, spmajorversion : u32, spminorversion : u32, returnedproducttype : *mut u32) -> bool);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("ntdllk.dll" "system" fn RtlGetSystemGlobalData(dataid : RTL_SYSTEM_GLOBAL_DATA_ID, buffer : *mut core::ffi::c_void, size : u32) -> u32);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlOsDeploymentState(flags : u32) -> OS_DEPLOYEMENT_STATE_VALUES);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlSwitchedVVI(versioninfo : *const OSVERSIONINFOEXW, typemask : u32, conditionmask : u64) -> u32);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetComputerNameA(lpcomputername : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetComputerNameEx2W(nametype : COMPUTER_NAME_FORMAT, flags : u32, lpbuffer : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetComputerNameExA(nametype : COMPUTER_NAME_FORMAT, lpbuffer : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetComputerNameExW(nametype : COMPUTER_NAME_FORMAT, lpbuffer : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetComputerNameW(lpcomputername : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetLocalTime(lpsystemtime : *const super::super::Foundation:: SYSTEMTIME) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetSystemTime(lpsystemtime : *const super::super::Foundation:: SYSTEMTIME) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetSystemTimeAdjustment(dwtimeadjustment : u32, btimeadjustmentdisabled : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-sysinfo-l1-2-4.dll" "system" fn SetSystemTimeAdjustmentPrecise(dwtimeadjustment : u64, btimeadjustmentdisabled : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn VerSetConditionMask(conditionmask : u64, typemask : VER_FLAGS, condition : u8) -> u64);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn VerifyVersionInfoA(lpversioninformation : *mut OSVERSIONINFOEXA, dwtypemask : VER_FLAGS, dwlconditionmask : u64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn VerifyVersionInfoW(lpversioninformation : *mut OSVERSIONINFOEXW, dwtypemask : VER_FLAGS, dwlconditionmask : u64) -> windows_sys::core::BOOL);

public const val `ACPI`: `FIRMWARE_TABLE_PROVIDER` = 1094930505u;
// UNSUPPORTED Rust 65:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CACHE_DESCRIPTOR {
//     pub Level: u8,
//     pub Associativity: u8,
//     pub LineSize: u16,
//     pub Size: u32,
//     pub Type: PROCESSOR_CACHE_TYPE,
// }

// UNSUPPORTED Rust 74:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 86:1: declaration Impl has no candidate rule
// impl Default for CACHE_RELATIONSHIP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 91:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CACHE_RELATIONSHIP_0 {
//     pub GroupMask: GROUP_AFFINITY,
//     pub GroupMasks: [GROUP_AFFINITY; 1],
// }

// UNSUPPORTED Rust 97:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 204:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GROUP_AFFINITY {
//     pub Mask: usize,
//     pub Group: u16,
//     pub Reserved: [u16; 3],
// }

// UNSUPPORTED Rust 211:1: declaration Impl has no candidate rule
// impl Default for GROUP_AFFINITY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 216:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GROUP_RELATIONSHIP {
//     pub MaximumGroupCount: u16,
//     pub ActiveGroupCount: u16,
//     pub Reserved: [u8; 20],
//     pub GroupInfo: [PROCESSOR_GROUP_INFO; 1],
// }

// UNSUPPORTED Rust 224:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 283:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MEMORYSTATUS {
//     pub dwLength: u32,
//     pub dwMemoryLoad: u32,
//     pub dwTotalPhys: usize,
//     pub dwAvailPhys: usize,
//     pub dwTotalPageFile: usize,
//     pub dwAvailPageFile: usize,
//     pub dwTotalVirtual: usize,
//     pub dwAvailVirtual: usize,
// }

// UNSUPPORTED Rust 295:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MEMORYSTATUSEX {
//     pub dwLength: u32,
//     pub dwMemoryLoad: u32,
//     pub ullTotalPhys: u64,
//     pub ullAvailPhys: u64,
//     pub ullTotalPageFile: u64,
//     pub ullAvailPageFile: u64,
//     pub ullTotalVirtual: u64,
//     pub ullAvailVirtual: u64,
//     pub ullAvailExtendedVirtual: u64,
// }

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
// UNSUPPORTED Rust 357:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NUMA_NODE_RELATIONSHIP {
//     pub NodeNumber: u32,
//     pub Reserved: [u8; 18],
//     pub GroupCount: u16,
//     pub Anonymous: NUMA_NODE_RELATIONSHIP_0,
// }

// UNSUPPORTED Rust 365:1: declaration Impl has no candidate rule
// impl Default for NUMA_NODE_RELATIONSHIP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 370:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NUMA_NODE_RELATIONSHIP_0 {
//     pub GroupMask: GROUP_AFFINITY,
//     pub GroupMasks: [GROUP_AFFINITY; 1],
// }

// UNSUPPORTED Rust 376:1: declaration Impl has no candidate rule
// impl Default for NUMA_NODE_RELATIONSHIP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 381:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 391:1: declaration Impl has no candidate rule
// impl Default for OSVERSIONINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 396:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 411:1: declaration Impl has no candidate rule
// impl Default for OSVERSIONINFOEXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 416:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 431:1: declaration Impl has no candidate rule
// impl Default for OSVERSIONINFOEXW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 436:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 446:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 456:1: generic scalar type unsupported
// pub type PGET_SYSTEM_WOW64_DIRECTORY_A = Option<unsafe extern "system" fn(lpbuffer: windows_sys::core::PSTR, usize: u32) -> u32>;

// UNSUPPORTED Rust 457:1: generic scalar type unsupported
// pub type PGET_SYSTEM_WOW64_DIRECTORY_W = Option<unsafe extern "system" fn(lpbuffer: windows_sys::core::PWSTR, usize: u32) -> u32>;

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
// UNSUPPORTED Rust 476:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROCESSOR_GROUP_INFO {
//     pub MaximumProcessorCount: u8,
//     pub ActiveProcessorCount: u8,
//     pub Reserved: [u8; 38],
//     pub ActiveProcessorMask: usize,
// }

// UNSUPPORTED Rust 484:1: declaration Impl has no candidate rule
// impl Default for PROCESSOR_GROUP_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 489:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROCESSOR_RELATIONSHIP {
//     pub Flags: u8,
//     pub EfficiencyClass: u8,
//     pub Reserved: [u8; 20],
//     pub GroupCount: u16,
//     pub GroupMask: [GROUP_AFFINITY; 1],
// }

// UNSUPPORTED Rust 498:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 613:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYSTEM_CPU_SET_INFORMATION {
//     pub Size: u32,
//     pub Type: CPU_SET_INFORMATION_TYPE,
//     pub Anonymous: SYSTEM_CPU_SET_INFORMATION_0,
// }

// UNSUPPORTED Rust 620:1: declaration Impl has no candidate rule
// impl Default for SYSTEM_CPU_SET_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 625:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SYSTEM_CPU_SET_INFORMATION_0 {
//     pub CpuSet: SYSTEM_CPU_SET_INFORMATION_0_0,
// }

// UNSUPPORTED Rust 630:1: declaration Impl has no candidate rule
// impl Default for SYSTEM_CPU_SET_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 635:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYSTEM_CPU_SET_INFORMATION_0_0 {
//     pub Id: u32,
//     pub Group: u16,
//     pub LogicalProcessorIndex: u8,
//     pub CoreIndex: u8,
//     pub LastLevelCacheIndex: u8,
//     pub NumaNodeIndex: u8,
//     pub EfficiencyClass: u8,
//     pub Anonymous1: SYSTEM_CPU_SET_INFORMATION_0_0_0,
//     pub Anonymous2: SYSTEM_CPU_SET_INFORMATION_0_0_1,
//     pub AllocationTag: u64,
// }

// UNSUPPORTED Rust 649:1: declaration Impl has no candidate rule
// impl Default for SYSTEM_CPU_SET_INFORMATION_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 654:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SYSTEM_CPU_SET_INFORMATION_0_0_0 {
//     pub AllFlags: u8,
//     pub Anonymous: SYSTEM_CPU_SET_INFORMATION_0_0_0_0,
// }

// UNSUPPORTED Rust 660:1: declaration Impl has no candidate rule
// impl Default for SYSTEM_CPU_SET_INFORMATION_0_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 665:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SYSTEM_CPU_SET_INFORMATION_0_0_0_0 {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 670:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SYSTEM_CPU_SET_INFORMATION_0_0_1 {
//     pub Reserved: u32,
//     pub SchedulingClass: u8,
// }

// UNSUPPORTED Rust 676:1: declaration Impl has no candidate rule
// impl Default for SYSTEM_CPU_SET_INFORMATION_0_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SYSTEM_CPU_SET_INFORMATION_ALLOCATED`: UInt = 2u;
public const val `SYSTEM_CPU_SET_INFORMATION_ALLOCATED_TO_TARGET_PROCESS`: UInt = 4u;
public const val `SYSTEM_CPU_SET_INFORMATION_PARKED`: UInt = 1u;
public const val `SYSTEM_CPU_SET_INFORMATION_REALTIME`: UInt = 8u;
// UNSUPPORTED Rust 685:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYSTEM_INFO {
//     pub Anonymous: SYSTEM_INFO_0,
//     pub dwPageSize: u32,
//     pub lpMinimumApplicationAddress: *mut core::ffi::c_void,
//     pub lpMaximumApplicationAddress: *mut core::ffi::c_void,
//     pub dwActiveProcessorMask: usize,
//     pub dwNumberOfProcessors: u32,
//     pub dwProcessorType: u32,
//     pub dwAllocationGranularity: u32,
//     pub wProcessorLevel: u16,
//     pub wProcessorRevision: u16,
// }

// UNSUPPORTED Rust 699:1: declaration Impl has no candidate rule
// impl Default for SYSTEM_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 704:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SYSTEM_INFO_0 {
//     pub dwOemId: u32,
//     pub Anonymous: SYSTEM_INFO_0_0,
// }

// UNSUPPORTED Rust 710:1: declaration Impl has no candidate rule
// impl Default for SYSTEM_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 715:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SYSTEM_INFO_0_0 {
//     pub wProcessorArchitecture: PROCESSOR_ARCHITECTURE,
//     pub wReserved: u16,
// }

// UNSUPPORTED Rust 721:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYSTEM_LOGICAL_PROCESSOR_INFORMATION {
//     pub ProcessorMask: usize,
//     pub Relationship: LOGICAL_PROCESSOR_RELATIONSHIP,
//     pub Anonymous: SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0,
// }

// UNSUPPORTED Rust 728:1: declaration Impl has no candidate rule
// impl Default for SYSTEM_LOGICAL_PROCESSOR_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 733:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0 {
//     pub ProcessorCore: SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0_0,
//     pub NumaNode: SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0_1,
//     pub Cache: CACHE_DESCRIPTOR,
//     pub Reserved: [u64; 2],
// }

// UNSUPPORTED Rust 741:1: declaration Impl has no candidate rule
// impl Default for SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 746:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0_1 {
//     pub NodeNumber: u32,
// }

// UNSUPPORTED Rust 751:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0_0 {
//     pub Flags: u8,
// }

// UNSUPPORTED Rust 756:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX {
//     pub Relationship: LOGICAL_PROCESSOR_RELATIONSHIP,
//     pub Size: u32,
//     pub Anonymous: SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX_0,
// }

// UNSUPPORTED Rust 763:1: declaration Impl has no candidate rule
// impl Default for SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 768:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX_0 {
//     pub Processor: PROCESSOR_RELATIONSHIP,
//     pub NumaNode: NUMA_NODE_RELATIONSHIP,
//     pub Cache: CACHE_RELATIONSHIP,
//     pub Group: GROUP_RELATIONSHIP,
// }

// UNSUPPORTED Rust 776:1: declaration Impl has no candidate rule
// impl Default for SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 781:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SYSTEM_POOL_ZEROING_INFORMATION {
//     pub PoolZeroingSupportPresent: bool,
// }

// UNSUPPORTED Rust 786:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION {
//     pub CycleTime: u64,
// }

// UNSUPPORTED Rust 791:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SYSTEM_SUPPORTED_PROCESSOR_ARCHITECTURES_INFORMATION {
//     pub _bitfield: u32,
// }

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
