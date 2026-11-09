@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.systeminformation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32SystemSysteminformationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_DnsHostnameToComputerNameExW(hostname: Long, computername: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_EnumSystemFirmwareTables(firmwaretableprovidersignature: Int, pfirmwaretableenumbuffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetComputerNameExA(nametype: Int, lpbuffer: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetComputerNameExW(nametype: Int, lpbuffer: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetDeveloperDriveEnablementState(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetFirmwareType(firmwaretype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetIntegratedDisplaySize(sizeininches: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetLocalTime(lpsystemtime: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetLogicalProcessorInformation(buffer: Long, returnedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetLogicalProcessorInformationEx(relationshiptype: Int, buffer: Long, returnedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetNativeSystemInfo(lpsysteminfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetOsManufacturingMode(pbenabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetOsSafeBootMode(flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetPhysicallyInstalledSystemMemory(totalmemoryinkilobytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetProcessorSystemCycleTime(group: Short, buffer: Long, returnedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetProductInfo(dwosmajorversion: Int, dwosminorversion: Int, dwspmajorversion: Int, dwspminorversion: Int, pdwreturnedproducttype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetSystemCpuSetInformation(information: Long, bufferlength: Int, returnedlength: Long, process: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetSystemDEPPolicy(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetSystemDirectoryA(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetSystemDirectoryW(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetSystemFirmwareTable(firmwaretableprovidersignature: Int, firmwaretableid: Int, pfirmwaretablebuffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetSystemInfo(lpsysteminfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetSystemLeapSecondInformation(enabled: Long, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetSystemTime(lpsystemtime: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetSystemTimeAdjustment(lptimeadjustment: Long, lptimeincrement: Long, lptimeadjustmentdisabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetSystemTimeAdjustmentPrecise(lptimeadjustment: Long, lptimeincrement: Long, lptimeadjustmentdisabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetSystemTimeAsFileTime(lpsystemtimeasfiletime: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetSystemTimePreciseAsFileTime(lpsystemtimeasfiletime: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetSystemWindowsDirectoryA(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetSystemWindowsDirectoryW(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetSystemWow64Directory2A(lpbuffer: Long, usize: Int, imagefilemachinetype: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetSystemWow64Directory2W(lpbuffer: Long, usize: Int, imagefilemachinetype: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetSystemWow64DirectoryA(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetSystemWow64DirectoryW(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetTickCount(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetTickCount64(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetVersion(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetVersionExA(lpversioninformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetVersionExW(lpversioninformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetWindowsDirectoryA(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GetWindowsDirectoryW(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GlobalMemoryStatus(lpbuffer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_GlobalMemoryStatusEx(lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_IsUserCetAvailableInEnvironment(usercetenvironment: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_IsWow64GuestMachineSupported(wowguestmachine: Short, machineissupported: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_RtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize: Long, puldeviceformbuffersize: Long, devicefamily: Long, deviceform: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_RtlGetDeviceFamilyInfoEnum(pulluapinfo: Long, puldevicefamily: Long, puldeviceform: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_RtlGetProductInfo(osmajorversion: Int, osminorversion: Int, spmajorversion: Int, spminorversion: Int, returnedproducttype: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_RtlGetSystemGlobalData(dataid: Int, buffer: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_RtlOsDeploymentState(flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_RtlSwitchedVVI(versioninfo: Long, typemask: Int, conditionmask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_SetComputerNameA(lpcomputername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_SetComputerNameEx2W(nametype: Int, flags: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_SetComputerNameExA(nametype: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_SetComputerNameExW(nametype: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_SetComputerNameW(lpcomputername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_SetLocalTime(lpsystemtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_SetSystemTime(lpsystemtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_SetSystemTimeAdjustment(dwtimeadjustment: Int, btimeadjustmentdisabled: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_SetSystemTimeAdjustmentPrecise(dwtimeadjustment: Long, btimeadjustmentdisabled: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_VerSetConditionMask(conditionmask: Long, typemask: Int, condition: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_VerifyVersionInfoA(lpversioninformation: Long, dwtypemask: Int, dwlconditionmask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_VerifyVersionInfoW(lpversioninformation: Long, dwtypemask: Int, dwlconditionmask: Long): Int
}

public actual fun DnsHostnameToComputerNameExW(hostname: PCWSTR, computername: PWSTR, nsize: Long): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_DnsHostnameToComputerNameExW(hostname, computername, nsize)

public actual fun EnumSystemFirmwareTables(firmwaretableprovidersignature: FIRMWARE_TABLE_PROVIDER, pfirmwaretableenumbuffer: Long, buffersize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_EnumSystemFirmwareTables(firmwaretableprovidersignature.toInt(), pfirmwaretableenumbuffer, buffersize.toInt()).toUInt()

public actual fun GetComputerNameExA(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PSTR, nsize: Long): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetComputerNameExA(nametype, lpbuffer, nsize)

public actual fun GetComputerNameExW(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PWSTR, nsize: Long): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetComputerNameExW(nametype, lpbuffer, nsize)

public actual fun GetDeveloperDriveEnablementState(): DEVELOPER_DRIVE_ENABLEMENT_STATE =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetDeveloperDriveEnablementState()

public actual fun GetFirmwareType(firmwaretype: Long): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetFirmwareType(firmwaretype)

public actual fun GetIntegratedDisplaySize(sizeininches: Long): HRESULT =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetIntegratedDisplaySize(sizeininches)

public actual fun GetLocalTime(lpsystemtime: Long) {
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetLocalTime(lpsystemtime)
}

public actual fun GetLogicalProcessorInformation(buffer: Long, returnedlength: Long): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetLogicalProcessorInformation(buffer, returnedlength)

public actual fun GetLogicalProcessorInformationEx(relationshiptype: LOGICAL_PROCESSOR_RELATIONSHIP, buffer: Long, returnedlength: Long): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetLogicalProcessorInformationEx(relationshiptype, buffer, returnedlength)

public actual fun GetNativeSystemInfo(lpsysteminfo: Long) {
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetNativeSystemInfo(lpsysteminfo)
}

public actual fun GetOsManufacturingMode(pbenabled: Long): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetOsManufacturingMode(pbenabled)

public actual fun GetOsSafeBootMode(flags: Long): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetOsSafeBootMode(flags)

public actual fun GetPhysicallyInstalledSystemMemory(totalmemoryinkilobytes: Long): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetPhysicallyInstalledSystemMemory(totalmemoryinkilobytes)

public actual fun GetProcessorSystemCycleTime(group: UShort, buffer: Long, returnedlength: Long): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetProcessorSystemCycleTime(group.toShort(), buffer, returnedlength)

public actual fun GetProductInfo(dwosmajorversion: UInt, dwosminorversion: UInt, dwspmajorversion: UInt, dwspminorversion: UInt, pdwreturnedproducttype: Long): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetProductInfo(dwosmajorversion.toInt(), dwosminorversion.toInt(), dwspmajorversion.toInt(), dwspminorversion.toInt(), pdwreturnedproducttype)

public actual fun GetSystemCpuSetInformation(information: Long, bufferlength: UInt, returnedlength: Long, process: HANDLE, flags: UInt): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetSystemCpuSetInformation(information, bufferlength.toInt(), returnedlength, process, flags.toInt())

public actual fun GetSystemDEPPolicy(): DEP_SYSTEM_POLICY_TYPE =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetSystemDEPPolicy()

public actual fun GetSystemDirectoryA(lpbuffer: PSTR, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetSystemDirectoryA(lpbuffer, usize.toInt()).toUInt()

public actual fun GetSystemDirectoryW(lpbuffer: PWSTR, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetSystemDirectoryW(lpbuffer, usize.toInt()).toUInt()

public actual fun GetSystemFirmwareTable(firmwaretableprovidersignature: FIRMWARE_TABLE_PROVIDER, firmwaretableid: UInt, pfirmwaretablebuffer: Long, buffersize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetSystemFirmwareTable(firmwaretableprovidersignature.toInt(), firmwaretableid.toInt(), pfirmwaretablebuffer, buffersize.toInt()).toUInt()

public actual fun GetSystemInfo(lpsysteminfo: Long) {
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetSystemInfo(lpsysteminfo)
}

public actual fun GetSystemLeapSecondInformation(enabled: Long, flags: Long): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetSystemLeapSecondInformation(enabled, flags)

public actual fun GetSystemTime(lpsystemtime: Long) {
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetSystemTime(lpsystemtime)
}

public actual fun GetSystemTimeAdjustment(lptimeadjustment: Long, lptimeincrement: Long, lptimeadjustmentdisabled: Long): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetSystemTimeAdjustment(lptimeadjustment, lptimeincrement, lptimeadjustmentdisabled)

public actual fun GetSystemTimeAdjustmentPrecise(lptimeadjustment: Long, lptimeincrement: Long, lptimeadjustmentdisabled: Long): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetSystemTimeAdjustmentPrecise(lptimeadjustment, lptimeincrement, lptimeadjustmentdisabled)

public actual fun GetSystemTimeAsFileTime(lpsystemtimeasfiletime: Long) {
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetSystemTimeAsFileTime(lpsystemtimeasfiletime)
}

public actual fun GetSystemTimePreciseAsFileTime(lpsystemtimeasfiletime: Long) {
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetSystemTimePreciseAsFileTime(lpsystemtimeasfiletime)
}

public actual fun GetSystemWindowsDirectoryA(lpbuffer: PSTR, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetSystemWindowsDirectoryA(lpbuffer, usize.toInt()).toUInt()

public actual fun GetSystemWindowsDirectoryW(lpbuffer: PWSTR, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetSystemWindowsDirectoryW(lpbuffer, usize.toInt()).toUInt()

public actual fun GetSystemWow64Directory2A(lpbuffer: PSTR, usize: UInt, imagefilemachinetype: IMAGE_FILE_MACHINE): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetSystemWow64Directory2A(lpbuffer, usize.toInt(), imagefilemachinetype.toShort()).toUInt()

public actual fun GetSystemWow64Directory2W(lpbuffer: PWSTR, usize: UInt, imagefilemachinetype: IMAGE_FILE_MACHINE): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetSystemWow64Directory2W(lpbuffer, usize.toInt(), imagefilemachinetype.toShort()).toUInt()

public actual fun GetSystemWow64DirectoryA(lpbuffer: PSTR, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetSystemWow64DirectoryA(lpbuffer, usize.toInt()).toUInt()

public actual fun GetSystemWow64DirectoryW(lpbuffer: PWSTR, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetSystemWow64DirectoryW(lpbuffer, usize.toInt()).toUInt()

public actual fun GetTickCount(): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetTickCount().toUInt()

public actual fun GetTickCount64(): ULong =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetTickCount64().toULong()

public actual fun GetVersion(): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetVersion().toUInt()

public actual fun GetVersionExA(lpversioninformation: Long): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetVersionExA(lpversioninformation)

public actual fun GetVersionExW(lpversioninformation: Long): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetVersionExW(lpversioninformation)

public actual fun GetWindowsDirectoryA(lpbuffer: PSTR, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetWindowsDirectoryA(lpbuffer, usize.toInt()).toUInt()

public actual fun GetWindowsDirectoryW(lpbuffer: PWSTR, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GetWindowsDirectoryW(lpbuffer, usize.toInt()).toUInt()

public actual fun GlobalMemoryStatus(lpbuffer: Long) {
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GlobalMemoryStatus(lpbuffer)
}

public actual fun GlobalMemoryStatusEx(lpbuffer: Long): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_GlobalMemoryStatusEx(lpbuffer)

public actual fun IsUserCetAvailableInEnvironment(usercetenvironment: USER_CET_ENVIRONMENT): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_IsUserCetAvailableInEnvironment(usercetenvironment.toInt())

public actual fun IsWow64GuestMachineSupported(wowguestmachine: IMAGE_FILE_MACHINE, machineissupported: Long): HRESULT =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_IsWow64GuestMachineSupported(wowguestmachine.toShort(), machineissupported)

public actual fun RtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize: Long, puldeviceformbuffersize: Long, devicefamily: PWSTR, deviceform: PWSTR): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_RtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize, puldeviceformbuffersize, devicefamily, deviceform).toUInt()

public actual fun RtlGetDeviceFamilyInfoEnum(pulluapinfo: Long, puldevicefamily: Long, puldeviceform: Long) {
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_RtlGetDeviceFamilyInfoEnum(pulluapinfo, puldevicefamily, puldeviceform)
}

public actual fun RtlGetProductInfo(osmajorversion: UInt, osminorversion: UInt, spmajorversion: UInt, spminorversion: UInt, returnedproducttype: Long): Boolean =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_RtlGetProductInfo(osmajorversion.toInt(), osminorversion.toInt(), spmajorversion.toInt(), spminorversion.toInt(), returnedproducttype)

public actual fun RtlGetSystemGlobalData(dataid: RTL_SYSTEM_GLOBAL_DATA_ID, buffer: Long, size: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_RtlGetSystemGlobalData(dataid, buffer, size.toInt()).toUInt()

public actual fun RtlOsDeploymentState(flags: UInt): OS_DEPLOYEMENT_STATE_VALUES =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_RtlOsDeploymentState(flags.toInt())

public actual fun RtlSwitchedVVI(versioninfo: Long, typemask: UInt, conditionmask: ULong): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_RtlSwitchedVVI(versioninfo, typemask.toInt(), conditionmask.toLong()).toUInt()

public actual fun SetComputerNameA(lpcomputername: PCSTR): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_SetComputerNameA(lpcomputername)

public actual fun SetComputerNameEx2W(nametype: COMPUTER_NAME_FORMAT, flags: UInt, lpbuffer: PCWSTR): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_SetComputerNameEx2W(nametype, flags.toInt(), lpbuffer)

public actual fun SetComputerNameExA(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PCSTR): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_SetComputerNameExA(nametype, lpbuffer)

public actual fun SetComputerNameExW(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PCWSTR): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_SetComputerNameExW(nametype, lpbuffer)

public actual fun SetComputerNameW(lpcomputername: PCWSTR): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_SetComputerNameW(lpcomputername)

public actual fun SetLocalTime(lpsystemtime: Long): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_SetLocalTime(lpsystemtime)

public actual fun SetSystemTime(lpsystemtime: Long): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_SetSystemTime(lpsystemtime)

public actual fun SetSystemTimeAdjustment(dwtimeadjustment: UInt, btimeadjustmentdisabled: BOOL): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_SetSystemTimeAdjustment(dwtimeadjustment.toInt(), btimeadjustmentdisabled)

public actual fun SetSystemTimeAdjustmentPrecise(dwtimeadjustment: ULong, btimeadjustmentdisabled: BOOL): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_SetSystemTimeAdjustmentPrecise(dwtimeadjustment.toLong(), btimeadjustmentdisabled)

public actual fun VerSetConditionMask(conditionmask: ULong, typemask: VER_FLAGS, condition: UByte): ULong =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_VerSetConditionMask(conditionmask.toLong(), typemask.toInt(), condition.toByte()).toULong()

public actual fun VerifyVersionInfoA(lpversioninformation: Long, dwtypemask: VER_FLAGS, dwlconditionmask: ULong): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_VerifyVersionInfoA(lpversioninformation, dwtypemask.toInt(), dwlconditionmask.toLong())

public actual fun VerifyVersionInfoW(lpversioninformation: Long, dwtypemask: VER_FLAGS, dwlconditionmask: ULong): BOOL =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_VerifyVersionInfoW(lpversioninformation, dwtypemask.toInt(), dwlconditionmask.toLong())
