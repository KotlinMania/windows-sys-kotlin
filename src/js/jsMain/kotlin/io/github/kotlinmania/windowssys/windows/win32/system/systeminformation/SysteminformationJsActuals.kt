@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.systeminformation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32SystemSysteminformationNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun DnsHostnameToComputerNameExW(hostname: PCWSTR, computername: PWSTR, nsize: Long): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_DnsHostnameToComputerNameExW(hostname.toString(), computername.toString(), nsize.toString()) as Int) else 0

public actual fun EnumSystemFirmwareTables(firmwaretableprovidersignature: FIRMWARE_TABLE_PROVIDER, pfirmwaretableenumbuffer: Long, buffersize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_EnumSystemFirmwareTables(firmwaretableprovidersignature.toInt(), pfirmwaretableenumbuffer.toString(), buffersize.toInt()) as Int).toUInt() else 0u

public actual fun GetComputerNameExA(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PSTR, nsize: Long): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetComputerNameExA(nametype, lpbuffer.toString(), nsize.toString()) as Int) else 0

public actual fun GetComputerNameExW(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PWSTR, nsize: Long): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetComputerNameExW(nametype, lpbuffer.toString(), nsize.toString()) as Int) else 0

public actual fun GetDeveloperDriveEnablementState(): DEVELOPER_DRIVE_ENABLEMENT_STATE =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetDeveloperDriveEnablementState() as Int) else 0

public actual fun GetFirmwareType(firmwaretype: Long): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetFirmwareType(firmwaretype.toString()) as Int) else 0

public actual fun GetIntegratedDisplaySize(sizeininches: Long): HRESULT =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetIntegratedDisplaySize(sizeininches.toString()) as Int) else 0

public actual fun GetLocalTime(lpsystemtime: Long) {
    if (_windowsWin32SystemSysteminformationNapiAddon != null) {
        _windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetLocalTime(lpsystemtime.toString())
    }
}

public actual fun GetLogicalProcessorInformation(buffer: Long, returnedlength: Long): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetLogicalProcessorInformation(buffer.toString(), returnedlength.toString()) as Int) else 0

public actual fun GetLogicalProcessorInformationEx(relationshiptype: LOGICAL_PROCESSOR_RELATIONSHIP, buffer: Long, returnedlength: Long): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetLogicalProcessorInformationEx(relationshiptype, buffer.toString(), returnedlength.toString()) as Int) else 0

public actual fun GetNativeSystemInfo(lpsysteminfo: Long) {
    if (_windowsWin32SystemSysteminformationNapiAddon != null) {
        _windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetNativeSystemInfo(lpsysteminfo.toString())
    }
}

public actual fun GetOsManufacturingMode(pbenabled: Long): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetOsManufacturingMode(pbenabled.toString()) as Int) else 0

public actual fun GetOsSafeBootMode(flags: Long): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetOsSafeBootMode(flags.toString()) as Int) else 0

public actual fun GetPhysicallyInstalledSystemMemory(totalmemoryinkilobytes: Long): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetPhysicallyInstalledSystemMemory(totalmemoryinkilobytes.toString()) as Int) else 0

public actual fun GetProcessorSystemCycleTime(group: UShort, buffer: Long, returnedlength: Long): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetProcessorSystemCycleTime(group.toInt(), buffer.toString(), returnedlength.toString()) as Int) else 0

public actual fun GetProductInfo(dwosmajorversion: UInt, dwosminorversion: UInt, dwspmajorversion: UInt, dwspminorversion: UInt, pdwreturnedproducttype: Long): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetProductInfo(dwosmajorversion.toInt(), dwosminorversion.toInt(), dwspmajorversion.toInt(), dwspminorversion.toInt(), pdwreturnedproducttype.toString()) as Int) else 0

public actual fun GetSystemCpuSetInformation(information: Long, bufferlength: UInt, returnedlength: Long, process: HANDLE, flags: UInt): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetSystemCpuSetInformation(information.toString(), bufferlength.toInt(), returnedlength.toString(), process.toString(), flags.toInt()) as Int) else 0

public actual fun GetSystemDEPPolicy(): DEP_SYSTEM_POLICY_TYPE =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetSystemDEPPolicy() as Int) else 0

public actual fun GetSystemDirectoryA(lpbuffer: PSTR, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetSystemDirectoryA(lpbuffer.toString(), usize.toInt()) as Int).toUInt() else 0u

public actual fun GetSystemDirectoryW(lpbuffer: PWSTR, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetSystemDirectoryW(lpbuffer.toString(), usize.toInt()) as Int).toUInt() else 0u

public actual fun GetSystemFirmwareTable(firmwaretableprovidersignature: FIRMWARE_TABLE_PROVIDER, firmwaretableid: UInt, pfirmwaretablebuffer: Long, buffersize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetSystemFirmwareTable(firmwaretableprovidersignature.toInt(), firmwaretableid.toInt(), pfirmwaretablebuffer.toString(), buffersize.toInt()) as Int).toUInt() else 0u

public actual fun GetSystemInfo(lpsysteminfo: Long) {
    if (_windowsWin32SystemSysteminformationNapiAddon != null) {
        _windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetSystemInfo(lpsysteminfo.toString())
    }
}

public actual fun GetSystemLeapSecondInformation(enabled: Long, flags: Long): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetSystemLeapSecondInformation(enabled.toString(), flags.toString()) as Int) else 0

public actual fun GetSystemTime(lpsystemtime: Long) {
    if (_windowsWin32SystemSysteminformationNapiAddon != null) {
        _windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetSystemTime(lpsystemtime.toString())
    }
}

public actual fun GetSystemTimeAdjustment(lptimeadjustment: Long, lptimeincrement: Long, lptimeadjustmentdisabled: Long): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetSystemTimeAdjustment(lptimeadjustment.toString(), lptimeincrement.toString(), lptimeadjustmentdisabled.toString()) as Int) else 0

public actual fun GetSystemTimeAdjustmentPrecise(lptimeadjustment: Long, lptimeincrement: Long, lptimeadjustmentdisabled: Long): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetSystemTimeAdjustmentPrecise(lptimeadjustment.toString(), lptimeincrement.toString(), lptimeadjustmentdisabled.toString()) as Int) else 0

public actual fun GetSystemTimeAsFileTime(lpsystemtimeasfiletime: Long) {
    if (_windowsWin32SystemSysteminformationNapiAddon != null) {
        _windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetSystemTimeAsFileTime(lpsystemtimeasfiletime.toString())
    }
}

public actual fun GetSystemTimePreciseAsFileTime(lpsystemtimeasfiletime: Long) {
    if (_windowsWin32SystemSysteminformationNapiAddon != null) {
        _windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetSystemTimePreciseAsFileTime(lpsystemtimeasfiletime.toString())
    }
}

public actual fun GetSystemWindowsDirectoryA(lpbuffer: PSTR, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetSystemWindowsDirectoryA(lpbuffer.toString(), usize.toInt()) as Int).toUInt() else 0u

public actual fun GetSystemWindowsDirectoryW(lpbuffer: PWSTR, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetSystemWindowsDirectoryW(lpbuffer.toString(), usize.toInt()) as Int).toUInt() else 0u

public actual fun GetSystemWow64Directory2A(lpbuffer: PSTR, usize: UInt, imagefilemachinetype: IMAGE_FILE_MACHINE): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetSystemWow64Directory2A(lpbuffer.toString(), usize.toInt(), imagefilemachinetype.toInt()) as Int).toUInt() else 0u

public actual fun GetSystemWow64Directory2W(lpbuffer: PWSTR, usize: UInt, imagefilemachinetype: IMAGE_FILE_MACHINE): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetSystemWow64Directory2W(lpbuffer.toString(), usize.toInt(), imagefilemachinetype.toInt()) as Int).toUInt() else 0u

public actual fun GetSystemWow64DirectoryA(lpbuffer: PSTR, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetSystemWow64DirectoryA(lpbuffer.toString(), usize.toInt()) as Int).toUInt() else 0u

public actual fun GetSystemWow64DirectoryW(lpbuffer: PWSTR, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetSystemWow64DirectoryW(lpbuffer.toString(), usize.toInt()) as Int).toUInt() else 0u

public actual fun GetTickCount(): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetTickCount() as Int).toUInt() else 0u

public actual fun GetTickCount64(): ULong =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetTickCount64() as String).toULong() else 0uL

public actual fun GetVersion(): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetVersion() as Int).toUInt() else 0u

public actual fun GetVersionExA(lpversioninformation: Long): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetVersionExA(lpversioninformation.toString()) as Int) else 0

public actual fun GetVersionExW(lpversioninformation: Long): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetVersionExW(lpversioninformation.toString()) as Int) else 0

public actual fun GetWindowsDirectoryA(lpbuffer: PSTR, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetWindowsDirectoryA(lpbuffer.toString(), usize.toInt()) as Int).toUInt() else 0u

public actual fun GetWindowsDirectoryW(lpbuffer: PWSTR, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GetWindowsDirectoryW(lpbuffer.toString(), usize.toInt()) as Int).toUInt() else 0u

public actual fun GlobalMemoryStatus(lpbuffer: Long) {
    if (_windowsWin32SystemSysteminformationNapiAddon != null) {
        _windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GlobalMemoryStatus(lpbuffer.toString())
    }
}

public actual fun GlobalMemoryStatusEx(lpbuffer: Long): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_GlobalMemoryStatusEx(lpbuffer.toString()) as Int) else 0

public actual fun IsUserCetAvailableInEnvironment(usercetenvironment: USER_CET_ENVIRONMENT): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_IsUserCetAvailableInEnvironment(usercetenvironment.toInt()) as Int) else 0

public actual fun IsWow64GuestMachineSupported(wowguestmachine: IMAGE_FILE_MACHINE, machineissupported: Long): HRESULT =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_IsWow64GuestMachineSupported(wowguestmachine.toInt(), machineissupported.toString()) as Int) else 0

public actual fun RtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize: Long, puldeviceformbuffersize: Long, devicefamily: PWSTR, deviceform: PWSTR): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_RtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize.toString(), puldeviceformbuffersize.toString(), devicefamily.toString(), deviceform.toString()) as Int).toUInt() else 0u

public actual fun RtlGetDeviceFamilyInfoEnum(pulluapinfo: Long, puldevicefamily: Long, puldeviceform: Long) {
    if (_windowsWin32SystemSysteminformationNapiAddon != null) {
        _windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_RtlGetDeviceFamilyInfoEnum(pulluapinfo.toString(), puldevicefamily.toString(), puldeviceform.toString())
    }
}

public actual fun RtlGetProductInfo(osmajorversion: UInt, osminorversion: UInt, spmajorversion: UInt, spminorversion: UInt, returnedproducttype: Long): Boolean =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_RtlGetProductInfo(osmajorversion.toInt(), osminorversion.toInt(), spmajorversion.toInt(), spminorversion.toInt(), returnedproducttype.toString()) as Boolean) else false

public actual fun RtlGetSystemGlobalData(dataid: RTL_SYSTEM_GLOBAL_DATA_ID, buffer: Long, size: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_RtlGetSystemGlobalData(dataid, buffer.toString(), size.toInt()) as Int).toUInt() else 0u

public actual fun RtlOsDeploymentState(flags: UInt): OS_DEPLOYEMENT_STATE_VALUES =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_RtlOsDeploymentState(flags.toInt()) as Int) else 0

public actual fun RtlSwitchedVVI(versioninfo: Long, typemask: UInt, conditionmask: ULong): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_RtlSwitchedVVI(versioninfo.toString(), typemask.toInt(), conditionmask.toString()) as Int).toUInt() else 0u

public actual fun SetComputerNameA(lpcomputername: PCSTR): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_SetComputerNameA(lpcomputername.toString()) as Int) else 0

public actual fun SetComputerNameEx2W(nametype: COMPUTER_NAME_FORMAT, flags: UInt, lpbuffer: PCWSTR): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_SetComputerNameEx2W(nametype, flags.toInt(), lpbuffer.toString()) as Int) else 0

public actual fun SetComputerNameExA(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PCSTR): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_SetComputerNameExA(nametype, lpbuffer.toString()) as Int) else 0

public actual fun SetComputerNameExW(nametype: COMPUTER_NAME_FORMAT, lpbuffer: PCWSTR): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_SetComputerNameExW(nametype, lpbuffer.toString()) as Int) else 0

public actual fun SetComputerNameW(lpcomputername: PCWSTR): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_SetComputerNameW(lpcomputername.toString()) as Int) else 0

public actual fun SetLocalTime(lpsystemtime: Long): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_SetLocalTime(lpsystemtime.toString()) as Int) else 0

public actual fun SetSystemTime(lpsystemtime: Long): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_SetSystemTime(lpsystemtime.toString()) as Int) else 0

public actual fun SetSystemTimeAdjustment(dwtimeadjustment: UInt, btimeadjustmentdisabled: BOOL): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_SetSystemTimeAdjustment(dwtimeadjustment.toInt(), btimeadjustmentdisabled) as Int) else 0

public actual fun SetSystemTimeAdjustmentPrecise(dwtimeadjustment: ULong, btimeadjustmentdisabled: BOOL): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_SetSystemTimeAdjustmentPrecise(dwtimeadjustment.toString(), btimeadjustmentdisabled) as Int) else 0

public actual fun VerSetConditionMask(conditionmask: ULong, typemask: VER_FLAGS, condition: UByte): ULong =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_VerSetConditionMask(conditionmask.toString(), typemask.toInt(), condition.toInt()) as String).toULong() else 0uL

public actual fun VerifyVersionInfoA(lpversioninformation: Long, dwtypemask: VER_FLAGS, dwlconditionmask: ULong): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_VerifyVersionInfoA(lpversioninformation.toString(), dwtypemask.toInt(), dwlconditionmask.toString()) as Int) else 0

public actual fun VerifyVersionInfoW(lpversioninformation: Long, dwtypemask: VER_FLAGS, dwlconditionmask: ULong): BOOL =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_VerifyVersionInfoW(lpversioninformation.toString(), dwtypemask.toInt(), dwlconditionmask.toString()) as Int) else 0
