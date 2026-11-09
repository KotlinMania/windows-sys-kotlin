package io.github.kotlinmania.windowssys.windows.win32.system.systeminformation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public expect fun DnsHostnameToComputerNameExW(hostname: PCWSTR, computername: PWSTR, nsize: Long): BOOL

public expect fun EnumSystemFirmwareTables(firmwaretableprovidersignature: FIRMWARE_TABLE_PROVIDER, pfirmwaretableenumbuffer: Long, buffersize: UInt): UInt

public expect fun GetComputerNameExA(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PSTR, nsize: Long): BOOL

public expect fun GetComputerNameExW(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PWSTR, nsize: Long): BOOL

public expect fun GetDeveloperDriveEnablementState(): DEVELOPER_DRIVE_ENABLEMENT_STATE

public expect fun GetFirmwareType(firmwaretype: Long): BOOL

public expect fun GetIntegratedDisplaySize(sizeininches: Long): HRESULT

public expect fun GetLocalTime(lpsystemtime: Long)

public expect fun GetLogicalProcessorInformation(buffer: Long, returnedlength: Long): BOOL

public expect fun GetLogicalProcessorInformationEx(relationshiptype: LOGICAL_PROCESSOR_RELATIONSHIP, buffer: Long, returnedlength: Long): BOOL

public expect fun GetNativeSystemInfo(lpsysteminfo: Long)

public expect fun GetOsManufacturingMode(pbenabled: Long): BOOL

public expect fun GetOsSafeBootMode(flags: Long): BOOL

public expect fun GetPhysicallyInstalledSystemMemory(totalmemoryinkilobytes: Long): BOOL

public expect fun GetProcessorSystemCycleTime(group: UShort, buffer: Long, returnedlength: Long): BOOL

public expect fun GetProductInfo(dwosmajorversion: UInt, dwosminorversion: UInt, dwspmajorversion: UInt, dwspminorversion: UInt, pdwreturnedproducttype: Long): BOOL

public expect fun GetSystemCpuSetInformation(information: Long, bufferlength: UInt, returnedlength: Long, process: HANDLE, flags: UInt): BOOL

public expect fun GetSystemDEPPolicy(): DEP_SYSTEM_POLICY_TYPE

public expect fun GetSystemDirectoryA(lpbuffer: PSTR, usize: UInt): UInt

public expect fun GetSystemDirectoryW(lpbuffer: PWSTR, usize: UInt): UInt

public expect fun GetSystemFirmwareTable(firmwaretableprovidersignature: FIRMWARE_TABLE_PROVIDER, firmwaretableid: UInt, pfirmwaretablebuffer: Long, buffersize: UInt): UInt

public expect fun GetSystemInfo(lpsysteminfo: Long)

public expect fun GetSystemLeapSecondInformation(enabled: Long, flags: Long): BOOL

public expect fun GetSystemTime(lpsystemtime: Long)

public expect fun GetSystemTimeAdjustment(lptimeadjustment: Long, lptimeincrement: Long, lptimeadjustmentdisabled: Long): BOOL

public expect fun GetSystemTimeAdjustmentPrecise(lptimeadjustment: Long, lptimeincrement: Long, lptimeadjustmentdisabled: Long): BOOL

public expect fun GetSystemTimeAsFileTime(lpsystemtimeasfiletime: Long)

public expect fun GetSystemTimePreciseAsFileTime(lpsystemtimeasfiletime: Long)

public expect fun GetSystemWindowsDirectoryA(lpbuffer: PSTR, usize: UInt): UInt

public expect fun GetSystemWindowsDirectoryW(lpbuffer: PWSTR, usize: UInt): UInt

public expect fun GetSystemWow64Directory2A(lpbuffer: PSTR, usize: UInt, imagefilemachinetype: IMAGE_FILE_MACHINE): UInt

public expect fun GetSystemWow64Directory2W(lpbuffer: PWSTR, usize: UInt, imagefilemachinetype: IMAGE_FILE_MACHINE): UInt

public expect fun GetSystemWow64DirectoryA(lpbuffer: PSTR, usize: UInt): UInt

public expect fun GetSystemWow64DirectoryW(lpbuffer: PWSTR, usize: UInt): UInt

public expect fun GetTickCount(): UInt

public expect fun GetTickCount64(): ULong

public expect fun GetVersion(): UInt

public expect fun GetVersionExA(lpversioninformation: Long): BOOL

public expect fun GetVersionExW(lpversioninformation: Long): BOOL

public expect fun GetWindowsDirectoryA(lpbuffer: PSTR, usize: UInt): UInt

public expect fun GetWindowsDirectoryW(lpbuffer: PWSTR, usize: UInt): UInt

public expect fun GlobalMemoryStatus(lpbuffer: Long)

public expect fun GlobalMemoryStatusEx(lpbuffer: Long): BOOL

public expect fun IsUserCetAvailableInEnvironment(usercetenvironment: USER_CET_ENVIRONMENT): BOOL

public expect fun IsWow64GuestMachineSupported(wowguestmachine: IMAGE_FILE_MACHINE, machineissupported: Long): HRESULT

public expect fun RtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize: Long, puldeviceformbuffersize: Long, devicefamily: PWSTR, deviceform: PWSTR): UInt

public expect fun RtlGetDeviceFamilyInfoEnum(pulluapinfo: Long, puldevicefamily: Long, puldeviceform: Long)

public expect fun RtlGetProductInfo(osmajorversion: UInt, osminorversion: UInt, spmajorversion: UInt, spminorversion: UInt, returnedproducttype: Long): Boolean

public expect fun RtlGetSystemGlobalData(dataid: RTL_SYSTEM_GLOBAL_DATA_ID, buffer: Long, size: UInt): UInt

public expect fun RtlOsDeploymentState(flags: UInt): OS_DEPLOYEMENT_STATE_VALUES

public expect fun RtlSwitchedVVI(versioninfo: Long, typemask: UInt, conditionmask: ULong): UInt

public expect fun SetComputerNameA(lpcomputername: PCSTR): BOOL

public expect fun SetComputerNameEx2W(nametype: COMPUTER_NAME_FORMAT, flags: UInt, lpbuffer: PCWSTR): BOOL

public expect fun SetComputerNameExA(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PCSTR): BOOL

public expect fun SetComputerNameExW(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PCWSTR): BOOL

public expect fun SetComputerNameW(lpcomputername: PCWSTR): BOOL

public expect fun SetLocalTime(lpsystemtime: Long): BOOL

public expect fun SetSystemTime(lpsystemtime: Long): BOOL

public expect fun SetSystemTimeAdjustment(dwtimeadjustment: UInt, btimeadjustmentdisabled: BOOL): BOOL

public expect fun SetSystemTimeAdjustmentPrecise(dwtimeadjustment: ULong, btimeadjustmentdisabled: BOOL): BOOL

public expect fun VerSetConditionMask(conditionmask: ULong, typemask: VER_FLAGS, condition: UByte): ULong

public expect fun VerifyVersionInfoA(lpversioninformation: Long, dwtypemask: VER_FLAGS, dwlconditionmask: ULong): BOOL

public expect fun VerifyVersionInfoW(lpversioninformation: Long, dwtypemask: VER_FLAGS, dwlconditionmask: ULong): BOOL
