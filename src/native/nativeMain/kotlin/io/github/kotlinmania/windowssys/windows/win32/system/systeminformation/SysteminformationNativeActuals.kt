@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.systeminformation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun DnsHostnameToComputerNameExW(hostname: PCWSTR, computername: PWSTR, nsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_DnsHostnameToComputerNameExW(hostname.toCPointer<ByteVar>(), computername.toCPointer<ByteVar>(), nsize.toCPointer<ByteVar>())

public actual fun EnumSystemFirmwareTables(firmwaretableprovidersignature: FIRMWARE_TABLE_PROVIDER, pfirmwaretableenumbuffer: Long, buffersize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_EnumSystemFirmwareTables(firmwaretableprovidersignature, pfirmwaretableenumbuffer.toCPointer<ByteVar>(), buffersize)

public actual fun GetComputerNameExA(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PSTR, nsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetComputerNameExA(nametype, lpbuffer.toCPointer<ByteVar>(), nsize.toCPointer<ByteVar>())

public actual fun GetComputerNameExW(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PWSTR, nsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetComputerNameExW(nametype, lpbuffer.toCPointer<ByteVar>(), nsize.toCPointer<ByteVar>())

public actual fun GetDeveloperDriveEnablementState(): DEVELOPER_DRIVE_ENABLEMENT_STATE =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetDeveloperDriveEnablementState()

public actual fun GetFirmwareType(firmwaretype: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetFirmwareType(firmwaretype.toCPointer<ByteVar>())

public actual fun GetIntegratedDisplaySize(sizeininches: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetIntegratedDisplaySize(sizeininches.toCPointer<ByteVar>())

public actual fun GetLocalTime(lpsystemtime: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetLocalTime(lpsystemtime.toCPointer<ByteVar>())
}

public actual fun GetLogicalProcessorInformation(buffer: Long, returnedlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetLogicalProcessorInformation(buffer.toCPointer<ByteVar>(), returnedlength.toCPointer<ByteVar>())

public actual fun GetLogicalProcessorInformationEx(relationshiptype: LOGICAL_PROCESSOR_RELATIONSHIP, buffer: Long, returnedlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetLogicalProcessorInformationEx(relationshiptype, buffer.toCPointer<ByteVar>(), returnedlength.toCPointer<ByteVar>())

public actual fun GetNativeSystemInfo(lpsysteminfo: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetNativeSystemInfo(lpsysteminfo.toCPointer<ByteVar>())
}

public actual fun GetOsManufacturingMode(pbenabled: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetOsManufacturingMode(pbenabled.toCPointer<ByteVar>())

public actual fun GetOsSafeBootMode(flags: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetOsSafeBootMode(flags.toCPointer<ByteVar>())

public actual fun GetPhysicallyInstalledSystemMemory(totalmemoryinkilobytes: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetPhysicallyInstalledSystemMemory(totalmemoryinkilobytes.toCPointer<ByteVar>())

public actual fun GetProcessorSystemCycleTime(group: UShort, buffer: Long, returnedlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetProcessorSystemCycleTime(group, buffer.toCPointer<ByteVar>(), returnedlength.toCPointer<ByteVar>())

public actual fun GetProductInfo(dwosmajorversion: UInt, dwosminorversion: UInt, dwspmajorversion: UInt, dwspminorversion: UInt, pdwreturnedproducttype: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetProductInfo(dwosmajorversion, dwosminorversion, dwspmajorversion, dwspminorversion, pdwreturnedproducttype.toCPointer<ByteVar>())

public actual fun GetSystemCpuSetInformation(information: Long, bufferlength: UInt, returnedlength: Long, process: HANDLE, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetSystemCpuSetInformation(information.toCPointer<ByteVar>(), bufferlength, returnedlength.toCPointer<ByteVar>(), process.toCPointer<ByteVar>(), flags)

public actual fun GetSystemDEPPolicy(): DEP_SYSTEM_POLICY_TYPE =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetSystemDEPPolicy()

public actual fun GetSystemDirectoryA(lpbuffer: PSTR, usize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetSystemDirectoryA(lpbuffer.toCPointer<ByteVar>(), usize)

public actual fun GetSystemDirectoryW(lpbuffer: PWSTR, usize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetSystemDirectoryW(lpbuffer.toCPointer<ByteVar>(), usize)

public actual fun GetSystemFirmwareTable(firmwaretableprovidersignature: FIRMWARE_TABLE_PROVIDER, firmwaretableid: UInt, pfirmwaretablebuffer: Long, buffersize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetSystemFirmwareTable(firmwaretableprovidersignature, firmwaretableid, pfirmwaretablebuffer.toCPointer<ByteVar>(), buffersize)

public actual fun GetSystemInfo(lpsysteminfo: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetSystemInfo(lpsysteminfo.toCPointer<ByteVar>())
}

public actual fun GetSystemLeapSecondInformation(enabled: Long, flags: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetSystemLeapSecondInformation(enabled.toCPointer<ByteVar>(), flags.toCPointer<ByteVar>())

public actual fun GetSystemTime(lpsystemtime: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetSystemTime(lpsystemtime.toCPointer<ByteVar>())
}

public actual fun GetSystemTimeAdjustment(lptimeadjustment: Long, lptimeincrement: Long, lptimeadjustmentdisabled: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetSystemTimeAdjustment(lptimeadjustment.toCPointer<ByteVar>(), lptimeincrement.toCPointer<ByteVar>(), lptimeadjustmentdisabled.toCPointer<ByteVar>())

public actual fun GetSystemTimeAdjustmentPrecise(lptimeadjustment: Long, lptimeincrement: Long, lptimeadjustmentdisabled: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetSystemTimeAdjustmentPrecise(lptimeadjustment.toCPointer<ByteVar>(), lptimeincrement.toCPointer<ByteVar>(), lptimeadjustmentdisabled.toCPointer<ByteVar>())

public actual fun GetSystemTimeAsFileTime(lpsystemtimeasfiletime: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetSystemTimeAsFileTime(lpsystemtimeasfiletime.toCPointer<ByteVar>())
}

public actual fun GetSystemTimePreciseAsFileTime(lpsystemtimeasfiletime: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetSystemTimePreciseAsFileTime(lpsystemtimeasfiletime.toCPointer<ByteVar>())
}

public actual fun GetSystemWindowsDirectoryA(lpbuffer: PSTR, usize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetSystemWindowsDirectoryA(lpbuffer.toCPointer<ByteVar>(), usize)

public actual fun GetSystemWindowsDirectoryW(lpbuffer: PWSTR, usize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetSystemWindowsDirectoryW(lpbuffer.toCPointer<ByteVar>(), usize)

public actual fun GetSystemWow64Directory2A(lpbuffer: PSTR, usize: UInt, imagefilemachinetype: IMAGE_FILE_MACHINE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetSystemWow64Directory2A(lpbuffer.toCPointer<ByteVar>(), usize, imagefilemachinetype)

public actual fun GetSystemWow64Directory2W(lpbuffer: PWSTR, usize: UInt, imagefilemachinetype: IMAGE_FILE_MACHINE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetSystemWow64Directory2W(lpbuffer.toCPointer<ByteVar>(), usize, imagefilemachinetype)

public actual fun GetSystemWow64DirectoryA(lpbuffer: PSTR, usize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetSystemWow64DirectoryA(lpbuffer.toCPointer<ByteVar>(), usize)

public actual fun GetSystemWow64DirectoryW(lpbuffer: PWSTR, usize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetSystemWow64DirectoryW(lpbuffer.toCPointer<ByteVar>(), usize)

public actual fun GetTickCount(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetTickCount()

public actual fun GetTickCount64(): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetTickCount64()

public actual fun GetVersion(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetVersion()

public actual fun GetVersionExA(lpversioninformation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetVersionExA(lpversioninformation.toCPointer<ByteVar>())

public actual fun GetVersionExW(lpversioninformation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetVersionExW(lpversioninformation.toCPointer<ByteVar>())

public actual fun GetWindowsDirectoryA(lpbuffer: PSTR, usize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetWindowsDirectoryA(lpbuffer.toCPointer<ByteVar>(), usize)

public actual fun GetWindowsDirectoryW(lpbuffer: PWSTR, usize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GetWindowsDirectoryW(lpbuffer.toCPointer<ByteVar>(), usize)

public actual fun GlobalMemoryStatus(lpbuffer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GlobalMemoryStatus(lpbuffer.toCPointer<ByteVar>())
}

public actual fun GlobalMemoryStatusEx(lpbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_GlobalMemoryStatusEx(lpbuffer.toCPointer<ByteVar>())

public actual fun IsUserCetAvailableInEnvironment(usercetenvironment: USER_CET_ENVIRONMENT): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_IsUserCetAvailableInEnvironment(usercetenvironment)

public actual fun IsWow64GuestMachineSupported(wowguestmachine: IMAGE_FILE_MACHINE, machineissupported: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_IsWow64GuestMachineSupported(wowguestmachine, machineissupported.toCPointer<ByteVar>())

public actual fun RtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize: Long, puldeviceformbuffersize: Long, devicefamily: PWSTR, deviceform: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_RtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize.toCPointer<ByteVar>(), puldeviceformbuffersize.toCPointer<ByteVar>(), devicefamily.toCPointer<ByteVar>(), deviceform.toCPointer<ByteVar>())

public actual fun RtlGetDeviceFamilyInfoEnum(pulluapinfo: Long, puldevicefamily: Long, puldeviceform: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_RtlGetDeviceFamilyInfoEnum(pulluapinfo.toCPointer<ByteVar>(), puldevicefamily.toCPointer<ByteVar>(), puldeviceform.toCPointer<ByteVar>())
}

public actual fun RtlGetProductInfo(osmajorversion: UInt, osminorversion: UInt, spmajorversion: UInt, spminorversion: UInt, returnedproducttype: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_RtlGetProductInfo(osmajorversion, osminorversion, spmajorversion, spminorversion, returnedproducttype.toCPointer<ByteVar>())

public actual fun RtlGetSystemGlobalData(dataid: RTL_SYSTEM_GLOBAL_DATA_ID, buffer: Long, size: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_RtlGetSystemGlobalData(dataid, buffer.toCPointer<ByteVar>(), size)

public actual fun RtlOsDeploymentState(flags: UInt): OS_DEPLOYEMENT_STATE_VALUES =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_RtlOsDeploymentState(flags)

public actual fun RtlSwitchedVVI(versioninfo: Long, typemask: UInt, conditionmask: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_RtlSwitchedVVI(versioninfo.toCPointer<ByteVar>(), typemask, conditionmask)

public actual fun SetComputerNameA(lpcomputername: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_SetComputerNameA(lpcomputername.toCPointer<ByteVar>())

public actual fun SetComputerNameEx2W(nametype: COMPUTER_NAME_FORMAT, flags: UInt, lpbuffer: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_SetComputerNameEx2W(nametype, flags, lpbuffer.toCPointer<ByteVar>())

public actual fun SetComputerNameExA(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_SetComputerNameExA(nametype, lpbuffer.toCPointer<ByteVar>())

public actual fun SetComputerNameExW(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_SetComputerNameExW(nametype, lpbuffer.toCPointer<ByteVar>())

public actual fun SetComputerNameW(lpcomputername: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_SetComputerNameW(lpcomputername.toCPointer<ByteVar>())

public actual fun SetLocalTime(lpsystemtime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_SetLocalTime(lpsystemtime.toCPointer<ByteVar>())

public actual fun SetSystemTime(lpsystemtime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_SetSystemTime(lpsystemtime.toCPointer<ByteVar>())

public actual fun SetSystemTimeAdjustment(dwtimeadjustment: UInt, btimeadjustmentdisabled: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_SetSystemTimeAdjustment(dwtimeadjustment, btimeadjustmentdisabled)

public actual fun SetSystemTimeAdjustmentPrecise(dwtimeadjustment: ULong, btimeadjustmentdisabled: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_SetSystemTimeAdjustmentPrecise(dwtimeadjustment, btimeadjustmentdisabled)

public actual fun VerSetConditionMask(conditionmask: ULong, typemask: VER_FLAGS, condition: UByte): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_VerSetConditionMask(conditionmask, typemask, condition)

public actual fun VerifyVersionInfoA(lpversioninformation: Long, dwtypemask: VER_FLAGS, dwlconditionmask: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_VerifyVersionInfoA(lpversioninformation.toCPointer<ByteVar>(), dwtypemask, dwlconditionmask)

public actual fun VerifyVersionInfoW(lpversioninformation: Long, dwtypemask: VER_FLAGS, dwlconditionmask: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_VerifyVersionInfoW(lpversioninformation.toCPointer<ByteVar>(), dwtypemask, dwlconditionmask)
