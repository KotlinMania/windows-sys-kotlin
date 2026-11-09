@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.systeminformation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public actual fun DnsHostnameToComputerNameExW(hostname: PCWSTR, computername: PWSTR, nsize: Long): BOOL =
    0

public actual fun EnumSystemFirmwareTables(firmwaretableprovidersignature: FIRMWARE_TABLE_PROVIDER, pfirmwaretableenumbuffer: Long, buffersize: UInt): UInt =
    0u

public actual fun GetComputerNameExA(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PSTR, nsize: Long): BOOL =
    0

public actual fun GetComputerNameExW(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PWSTR, nsize: Long): BOOL =
    0

public actual fun GetDeveloperDriveEnablementState(): DEVELOPER_DRIVE_ENABLEMENT_STATE =
    0

public actual fun GetFirmwareType(firmwaretype: Long): BOOL =
    0

public actual fun GetIntegratedDisplaySize(sizeininches: Long): HRESULT =
    0

public actual fun GetLocalTime(lpsystemtime: Long) {
}

public actual fun GetLogicalProcessorInformation(buffer: Long, returnedlength: Long): BOOL =
    0

public actual fun GetLogicalProcessorInformationEx(relationshiptype: LOGICAL_PROCESSOR_RELATIONSHIP, buffer: Long, returnedlength: Long): BOOL =
    0

public actual fun GetNativeSystemInfo(lpsysteminfo: Long) {
}

public actual fun GetOsManufacturingMode(pbenabled: Long): BOOL =
    0

public actual fun GetOsSafeBootMode(flags: Long): BOOL =
    0

public actual fun GetPhysicallyInstalledSystemMemory(totalmemoryinkilobytes: Long): BOOL =
    0

public actual fun GetProcessorSystemCycleTime(group: UShort, buffer: Long, returnedlength: Long): BOOL =
    0

public actual fun GetProductInfo(dwosmajorversion: UInt, dwosminorversion: UInt, dwspmajorversion: UInt, dwspminorversion: UInt, pdwreturnedproducttype: Long): BOOL =
    0

public actual fun GetSystemCpuSetInformation(information: Long, bufferlength: UInt, returnedlength: Long, process: HANDLE, flags: UInt): BOOL =
    0

public actual fun GetSystemDEPPolicy(): DEP_SYSTEM_POLICY_TYPE =
    0

public actual fun GetSystemDirectoryA(lpbuffer: PSTR, usize: UInt): UInt =
    0u

public actual fun GetSystemDirectoryW(lpbuffer: PWSTR, usize: UInt): UInt =
    0u

public actual fun GetSystemFirmwareTable(firmwaretableprovidersignature: FIRMWARE_TABLE_PROVIDER, firmwaretableid: UInt, pfirmwaretablebuffer: Long, buffersize: UInt): UInt =
    0u

public actual fun GetSystemInfo(lpsysteminfo: Long) {
}

public actual fun GetSystemLeapSecondInformation(enabled: Long, flags: Long): BOOL =
    0

public actual fun GetSystemTime(lpsystemtime: Long) {
}

public actual fun GetSystemTimeAdjustment(lptimeadjustment: Long, lptimeincrement: Long, lptimeadjustmentdisabled: Long): BOOL =
    0

public actual fun GetSystemTimeAdjustmentPrecise(lptimeadjustment: Long, lptimeincrement: Long, lptimeadjustmentdisabled: Long): BOOL =
    0

public actual fun GetSystemTimeAsFileTime(lpsystemtimeasfiletime: Long) {
}

public actual fun GetSystemTimePreciseAsFileTime(lpsystemtimeasfiletime: Long) {
}

public actual fun GetSystemWindowsDirectoryA(lpbuffer: PSTR, usize: UInt): UInt =
    0u

public actual fun GetSystemWindowsDirectoryW(lpbuffer: PWSTR, usize: UInt): UInt =
    0u

public actual fun GetSystemWow64Directory2A(lpbuffer: PSTR, usize: UInt, imagefilemachinetype: IMAGE_FILE_MACHINE): UInt =
    0u

public actual fun GetSystemWow64Directory2W(lpbuffer: PWSTR, usize: UInt, imagefilemachinetype: IMAGE_FILE_MACHINE): UInt =
    0u

public actual fun GetSystemWow64DirectoryA(lpbuffer: PSTR, usize: UInt): UInt =
    0u

public actual fun GetSystemWow64DirectoryW(lpbuffer: PWSTR, usize: UInt): UInt =
    0u

public actual fun GetTickCount(): UInt =
    0u

public actual fun GetTickCount64(): ULong =
    0uL

public actual fun GetVersion(): UInt =
    0u

public actual fun GetVersionExA(lpversioninformation: Long): BOOL =
    0

public actual fun GetVersionExW(lpversioninformation: Long): BOOL =
    0

public actual fun GetWindowsDirectoryA(lpbuffer: PSTR, usize: UInt): UInt =
    0u

public actual fun GetWindowsDirectoryW(lpbuffer: PWSTR, usize: UInt): UInt =
    0u

public actual fun GlobalMemoryStatus(lpbuffer: Long) {
}

public actual fun GlobalMemoryStatusEx(lpbuffer: Long): BOOL =
    0

public actual fun IsUserCetAvailableInEnvironment(usercetenvironment: USER_CET_ENVIRONMENT): BOOL =
    0

public actual fun IsWow64GuestMachineSupported(wowguestmachine: IMAGE_FILE_MACHINE, machineissupported: Long): HRESULT =
    0

public actual fun RtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize: Long, puldeviceformbuffersize: Long, devicefamily: PWSTR, deviceform: PWSTR): UInt =
    0u

public actual fun RtlGetDeviceFamilyInfoEnum(pulluapinfo: Long, puldevicefamily: Long, puldeviceform: Long) {
}

public actual fun RtlGetProductInfo(osmajorversion: UInt, osminorversion: UInt, spmajorversion: UInt, spminorversion: UInt, returnedproducttype: Long): Boolean =
    false

public actual fun RtlGetSystemGlobalData(dataid: RTL_SYSTEM_GLOBAL_DATA_ID, buffer: Long, size: UInt): UInt =
    0u

public actual fun RtlOsDeploymentState(flags: UInt): OS_DEPLOYEMENT_STATE_VALUES =
    0

public actual fun RtlSwitchedVVI(versioninfo: Long, typemask: UInt, conditionmask: ULong): UInt =
    0u

public actual fun SetComputerNameA(lpcomputername: PCSTR): BOOL =
    0

public actual fun SetComputerNameEx2W(nametype: COMPUTER_NAME_FORMAT, flags: UInt, lpbuffer: PCWSTR): BOOL =
    0

public actual fun SetComputerNameExA(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PCSTR): BOOL =
    0

public actual fun SetComputerNameExW(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PCWSTR): BOOL =
    0

public actual fun SetComputerNameW(lpcomputername: PCWSTR): BOOL =
    0

public actual fun SetLocalTime(lpsystemtime: Long): BOOL =
    0

public actual fun SetSystemTime(lpsystemtime: Long): BOOL =
    0

public actual fun SetSystemTimeAdjustment(dwtimeadjustment: UInt, btimeadjustmentdisabled: BOOL): BOOL =
    0

public actual fun SetSystemTimeAdjustmentPrecise(dwtimeadjustment: ULong, btimeadjustmentdisabled: BOOL): BOOL =
    0

public actual fun VerSetConditionMask(conditionmask: ULong, typemask: VER_FLAGS, condition: UByte): ULong =
    0uL

public actual fun VerifyVersionInfoA(lpversioninformation: Long, dwtypemask: VER_FLAGS, dwlconditionmask: ULong): BOOL =
    0

public actual fun VerifyVersionInfoW(lpversioninformation: Long, dwtypemask: VER_FLAGS, dwlconditionmask: ULong): BOOL =
    0
