package io.github.kotlinmania.windowssys.windows.win32.system.systeminformation

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun DnsHostnameToComputerNameExW(hostname: PCWSTR, computername: PWSTR, nsize: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DnsHostnameToComputerNameExW", longArrayOf(hostname, computername, nsize)).toInt()
}

public fun EnumSystemFirmwareTables(firmwaretableprovidersignature: FIRMWARE_TABLE_PROVIDER, pfirmwaretableenumbuffer: Long, buffersize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumSystemFirmwareTables", longArrayOf(firmwaretableprovidersignature.toLong(), pfirmwaretableenumbuffer, buffersize.toLong())).toUInt()
}

public fun GetComputerNameExA(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PSTR, nsize: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetComputerNameExA", longArrayOf(nametype.toLong(), lpbuffer, nsize)).toInt()
}

public fun GetComputerNameExW(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PWSTR, nsize: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetComputerNameExW", longArrayOf(nametype.toLong(), lpbuffer, nsize)).toInt()
}

public fun GetDeveloperDriveEnablementState(): DEVELOPER_DRIVE_ENABLEMENT_STATE {
    return Win32DynamicFfi.invoke("api-ms-win-core-sysinfo-l1-2-6.dll", "GetDeveloperDriveEnablementState", longArrayOf()).toInt()
}

public fun GetFirmwareType(firmwaretype: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFirmwareType", longArrayOf(firmwaretype)).toInt()
}

public fun GetIntegratedDisplaySize(sizeininches: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-sysinfo-l1-2-3.dll", "GetIntegratedDisplaySize", longArrayOf(sizeininches)).toInt()
}

public fun GetLocalTime(lpsystemtime: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "GetLocalTime", longArrayOf(lpsystemtime))
}

public fun GetLogicalProcessorInformation(buffer: Long, returnedlength: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetLogicalProcessorInformation", longArrayOf(buffer, returnedlength)).toInt()
}

public fun GetLogicalProcessorInformationEx(relationshiptype: LOGICAL_PROCESSOR_RELATIONSHIP, buffer: Long, returnedlength: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetLogicalProcessorInformationEx", longArrayOf(relationshiptype.toLong(), buffer, returnedlength)).toInt()
}

public fun GetNativeSystemInfo(lpsysteminfo: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "GetNativeSystemInfo", longArrayOf(lpsysteminfo))
}

public fun GetOsManufacturingMode(pbenabled: Long): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-sysinfo-l1-2-3.dll", "GetOsManufacturingMode", longArrayOf(pbenabled)).toInt()
}

public fun GetOsSafeBootMode(flags: Long): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-sysinfo-l1-2-0.dll", "GetOsSafeBootMode", longArrayOf(flags)).toInt()
}

public fun GetPhysicallyInstalledSystemMemory(totalmemoryinkilobytes: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetPhysicallyInstalledSystemMemory", longArrayOf(totalmemoryinkilobytes)).toInt()
}

public fun GetProcessorSystemCycleTime(group: UShort, buffer: Long, returnedlength: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessorSystemCycleTime", longArrayOf(group.toLong(), buffer, returnedlength)).toInt()
}

public fun GetProductInfo(dwosmajorversion: UInt, dwosminorversion: UInt, dwspmajorversion: UInt, dwspminorversion: UInt, pdwreturnedproducttype: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProductInfo", longArrayOf(dwosmajorversion.toLong(), dwosminorversion.toLong(), dwspmajorversion.toLong(), dwspminorversion.toLong(), pdwreturnedproducttype)).toInt()
}

public fun GetSystemCpuSetInformation(information: Long, bufferlength: UInt, returnedlength: Long, process: HANDLE, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetSystemCpuSetInformation", longArrayOf(information, bufferlength.toLong(), returnedlength, process, flags.toLong())).toInt()
}

public fun GetSystemDEPPolicy(): DEP_SYSTEM_POLICY_TYPE {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetSystemDEPPolicy", longArrayOf()).toInt()
}

public fun GetSystemDirectoryA(lpbuffer: PSTR, usize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetSystemDirectoryA", longArrayOf(lpbuffer, usize.toLong())).toUInt()
}

public fun GetSystemDirectoryW(lpbuffer: PWSTR, usize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetSystemDirectoryW", longArrayOf(lpbuffer, usize.toLong())).toUInt()
}

public fun GetSystemFirmwareTable(firmwaretableprovidersignature: FIRMWARE_TABLE_PROVIDER, firmwaretableid: UInt, pfirmwaretablebuffer: Long, buffersize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetSystemFirmwareTable", longArrayOf(firmwaretableprovidersignature.toLong(), firmwaretableid.toLong(), pfirmwaretablebuffer, buffersize.toLong())).toUInt()
}

public fun GetSystemInfo(lpsysteminfo: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "GetSystemInfo", longArrayOf(lpsysteminfo))
}

public fun GetSystemLeapSecondInformation(enabled: Long, flags: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetSystemLeapSecondInformation", longArrayOf(enabled, flags)).toInt()
}

public fun GetSystemTime(lpsystemtime: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "GetSystemTime", longArrayOf(lpsystemtime))
}

public fun GetSystemTimeAdjustment(lptimeadjustment: Long, lptimeincrement: Long, lptimeadjustmentdisabled: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetSystemTimeAdjustment", longArrayOf(lptimeadjustment, lptimeincrement, lptimeadjustmentdisabled)).toInt()
}

public fun GetSystemTimeAdjustmentPrecise(lptimeadjustment: Long, lptimeincrement: Long, lptimeadjustmentdisabled: Long): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-sysinfo-l1-2-4.dll", "GetSystemTimeAdjustmentPrecise", longArrayOf(lptimeadjustment, lptimeincrement, lptimeadjustmentdisabled)).toInt()
}

public fun GetSystemTimeAsFileTime(lpsystemtimeasfiletime: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "GetSystemTimeAsFileTime", longArrayOf(lpsystemtimeasfiletime))
}

public fun GetSystemTimePreciseAsFileTime(lpsystemtimeasfiletime: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "GetSystemTimePreciseAsFileTime", longArrayOf(lpsystemtimeasfiletime))
}

public fun GetSystemWindowsDirectoryA(lpbuffer: PSTR, usize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetSystemWindowsDirectoryA", longArrayOf(lpbuffer, usize.toLong())).toUInt()
}

public fun GetSystemWindowsDirectoryW(lpbuffer: PWSTR, usize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetSystemWindowsDirectoryW", longArrayOf(lpbuffer, usize.toLong())).toUInt()
}

public fun GetSystemWow64Directory2A(lpbuffer: PSTR, usize: UInt, imagefilemachinetype: IMAGE_FILE_MACHINE): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-core-wow64-l1-1-1.dll", "GetSystemWow64Directory2A", longArrayOf(lpbuffer, usize.toLong(), imagefilemachinetype.toLong())).toUInt()
}

public fun GetSystemWow64Directory2W(lpbuffer: PWSTR, usize: UInt, imagefilemachinetype: IMAGE_FILE_MACHINE): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-core-wow64-l1-1-1.dll", "GetSystemWow64Directory2W", longArrayOf(lpbuffer, usize.toLong(), imagefilemachinetype.toLong())).toUInt()
}

public fun GetSystemWow64DirectoryA(lpbuffer: PSTR, usize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetSystemWow64DirectoryA", longArrayOf(lpbuffer, usize.toLong())).toUInt()
}

public fun GetSystemWow64DirectoryW(lpbuffer: PWSTR, usize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetSystemWow64DirectoryW", longArrayOf(lpbuffer, usize.toLong())).toUInt()
}

public fun GetTickCount(): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetTickCount", longArrayOf()).toUInt()
}

public fun GetTickCount64(): ULong {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetTickCount64", longArrayOf()).toULong()
}

public fun GetVersion(): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetVersion", longArrayOf()).toUInt()
}

public fun GetVersionExA(lpversioninformation: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetVersionExA", longArrayOf(lpversioninformation)).toInt()
}

public fun GetVersionExW(lpversioninformation: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetVersionExW", longArrayOf(lpversioninformation)).toInt()
}

public fun GetWindowsDirectoryA(lpbuffer: PSTR, usize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetWindowsDirectoryA", longArrayOf(lpbuffer, usize.toLong())).toUInt()
}

public fun GetWindowsDirectoryW(lpbuffer: PWSTR, usize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetWindowsDirectoryW", longArrayOf(lpbuffer, usize.toLong())).toUInt()
}

public fun GlobalMemoryStatus(lpbuffer: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "GlobalMemoryStatus", longArrayOf(lpbuffer))
}

public fun GlobalMemoryStatusEx(lpbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GlobalMemoryStatusEx", longArrayOf(lpbuffer)).toInt()
}

public fun IsUserCetAvailableInEnvironment(usercetenvironment: USER_CET_ENVIRONMENT): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsUserCetAvailableInEnvironment", longArrayOf(usercetenvironment.toLong())).toInt()
}

public fun IsWow64GuestMachineSupported(wowguestmachine: IMAGE_FILE_MACHINE, machineissupported: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsWow64GuestMachineSupported", longArrayOf(wowguestmachine.toLong(), machineissupported)).toInt()
}

public fun RtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize: Long, puldeviceformbuffersize: Long, devicefamily: PWSTR, deviceform: PWSTR): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlConvertDeviceFamilyInfoToString", longArrayOf(puldevicefamilybuffersize, puldeviceformbuffersize, devicefamily, deviceform)).toUInt()
}

public fun RtlGetDeviceFamilyInfoEnum(pulluapinfo: Long, puldevicefamily: Long, puldeviceform: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlGetDeviceFamilyInfoEnum", longArrayOf(pulluapinfo, puldevicefamily, puldeviceform))
}

public fun RtlGetProductInfo(osmajorversion: UInt, osminorversion: UInt, spmajorversion: UInt, spminorversion: UInt, returnedproducttype: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlGetProductInfo", longArrayOf(osmajorversion.toLong(), osminorversion.toLong(), spmajorversion.toLong(), spminorversion.toLong(), returnedproducttype))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlGetSystemGlobalData(dataid: RTL_SYSTEM_GLOBAL_DATA_ID, buffer: Long, size: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdllk.dll", "RtlGetSystemGlobalData", longArrayOf(dataid.toLong(), buffer, size.toLong())).toUInt()
}

public fun RtlOsDeploymentState(flags: UInt): OS_DEPLOYEMENT_STATE_VALUES {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlOsDeploymentState", longArrayOf(flags.toLong())).toInt()
}

public fun RtlSwitchedVVI(versioninfo: Long, typemask: UInt, conditionmask: ULong): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlSwitchedVVI", longArrayOf(versioninfo, typemask.toLong(), conditionmask.toLong())).toUInt()
}

public fun SetComputerNameA(lpcomputername: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetComputerNameA", longArrayOf(lpcomputername)).toInt()
}

public fun SetComputerNameEx2W(nametype: COMPUTER_NAME_FORMAT, flags: UInt, lpbuffer: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetComputerNameEx2W", longArrayOf(nametype.toLong(), flags.toLong(), lpbuffer)).toInt()
}

public fun SetComputerNameExA(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetComputerNameExA", longArrayOf(nametype.toLong(), lpbuffer)).toInt()
}

public fun SetComputerNameExW(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetComputerNameExW", longArrayOf(nametype.toLong(), lpbuffer)).toInt()
}

public fun SetComputerNameW(lpcomputername: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetComputerNameW", longArrayOf(lpcomputername)).toInt()
}

public fun SetLocalTime(lpsystemtime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetLocalTime", longArrayOf(lpsystemtime)).toInt()
}

public fun SetSystemTime(lpsystemtime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetSystemTime", longArrayOf(lpsystemtime)).toInt()
}

public fun SetSystemTimeAdjustment(dwtimeadjustment: UInt, btimeadjustmentdisabled: BOOL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetSystemTimeAdjustment", longArrayOf(dwtimeadjustment.toLong(), btimeadjustmentdisabled.toLong())).toInt()
}

public fun SetSystemTimeAdjustmentPrecise(dwtimeadjustment: ULong, btimeadjustmentdisabled: BOOL): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-sysinfo-l1-2-4.dll", "SetSystemTimeAdjustmentPrecise", longArrayOf(dwtimeadjustment.toLong(), btimeadjustmentdisabled.toLong())).toInt()
}

public fun VerSetConditionMask(conditionmask: ULong, typemask: VER_FLAGS, condition: UByte): ULong {
    return Win32DynamicFfi.invoke("kernel32.dll", "VerSetConditionMask", longArrayOf(conditionmask.toLong(), typemask.toLong(), condition.toLong())).toULong()
}

public fun VerifyVersionInfoA(lpversioninformation: Long, dwtypemask: VER_FLAGS, dwlconditionmask: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "VerifyVersionInfoA", longArrayOf(lpversioninformation, dwtypemask.toLong(), dwlconditionmask.toLong())).toInt()
}

public fun VerifyVersionInfoW(lpversioninformation: Long, dwtypemask: VER_FLAGS, dwlconditionmask: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "VerifyVersionInfoW", longArrayOf(lpversioninformation, dwtypemask.toLong(), dwlconditionmask.toLong())).toInt()
}
