@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.systeminformation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemSysteminformationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_dnsHostnameToComputerNameExW(hostname: Long, computername: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_enumSystemFirmwareTables(firmwaretableprovidersignature: Int, pfirmwaretableenumbuffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getComputerNameExA(nametype: Int, lpbuffer: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getComputerNameExW(nametype: Int, lpbuffer: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getDeveloperDriveEnablementState(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getFirmwareType(firmwaretype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getIntegratedDisplaySize(sizeininches: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getLocalTime(lpsystemtime: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getLogicalProcessorInformation(buffer: Long, returnedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getLogicalProcessorInformationEx(relationshiptype: Int, buffer: Long, returnedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getNativeSystemInfo(lpsysteminfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getOsManufacturingMode(pbenabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getOsSafeBootMode(flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getPhysicallyInstalledSystemMemory(totalmemoryinkilobytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getProcessorSystemCycleTime(group: Short, buffer: Long, returnedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getProductInfo(dwosmajorversion: Int, dwosminorversion: Int, dwspmajorversion: Int, dwspminorversion: Int, pdwreturnedproducttype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getSystemCpuSetInformation(information: Long, bufferlength: Int, returnedlength: Long, process: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getSystemDEPPolicy(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getSystemDirectoryA(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getSystemDirectoryW(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getSystemFirmwareTable(firmwaretableprovidersignature: Int, firmwaretableid: Int, pfirmwaretablebuffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getSystemInfo(lpsysteminfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getSystemLeapSecondInformation(enabled: Long, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getSystemTime(lpsystemtime: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getSystemTimeAdjustment(lptimeadjustment: Long, lptimeincrement: Long, lptimeadjustmentdisabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getSystemTimeAdjustmentPrecise(lptimeadjustment: Long, lptimeincrement: Long, lptimeadjustmentdisabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getSystemTimeAsFileTime(lpsystemtimeasfiletime: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getSystemTimePreciseAsFileTime(lpsystemtimeasfiletime: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getSystemWindowsDirectoryA(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getSystemWindowsDirectoryW(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getSystemWow64Directory2A(lpbuffer: Long, usize: Int, imagefilemachinetype: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getSystemWow64Directory2W(lpbuffer: Long, usize: Int, imagefilemachinetype: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getSystemWow64DirectoryA(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getSystemWow64DirectoryW(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getTickCount(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getTickCount64(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getVersion(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getVersionExA(lpversioninformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getVersionExW(lpversioninformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getWindowsDirectoryA(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_getWindowsDirectoryW(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_globalMemoryStatus(lpbuffer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_globalMemoryStatusEx(lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_isUserCetAvailableInEnvironment(usercetenvironment: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_isWow64GuestMachineSupported(wowguestmachine: Short, machineissupported: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_rtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize: Long, puldeviceformbuffersize: Long, devicefamily: Long, deviceform: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_rtlGetDeviceFamilyInfoEnum(pulluapinfo: Long, puldevicefamily: Long, puldeviceform: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_rtlGetProductInfo(osmajorversion: Int, osminorversion: Int, spmajorversion: Int, spminorversion: Int, returnedproducttype: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_rtlGetSystemGlobalData(dataid: Int, buffer: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_rtlOsDeploymentState(flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_rtlSwitchedVVI(versioninfo: Long, typemask: Int, conditionmask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_setComputerNameA(lpcomputername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_setComputerNameEx2W(nametype: Int, flags: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_setComputerNameExA(nametype: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_setComputerNameExW(nametype: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_setComputerNameW(lpcomputername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_setLocalTime(lpsystemtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_setSystemTime(lpsystemtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_setSystemTimeAdjustment(dwtimeadjustment: Int, btimeadjustmentdisabled: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_setSystemTimeAdjustmentPrecise(dwtimeadjustment: Long, btimeadjustmentdisabled: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_verSetConditionMask(conditionmask: Long, typemask: Int, condition: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_verifyVersionInfoA(lpversioninformation: Long, dwtypemask: Int, dwlconditionmask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_systeminformation_verifyVersionInfoW(lpversioninformation: Long, dwtypemask: Int, dwlconditionmask: Long): Int
}

public actual fun dnsHostnameToComputerNameExW(hostname: Pcwstr, computername: Pwstr, nsize: COpaquePointer?): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_dnsHostnameToComputerNameExW((hostname?.value ?: 0L), (computername?.value ?: 0L), (nsize?.value ?: 0L))

public actual fun enumSystemFirmwareTables(firmwaretableprovidersignature: FirmwareTableProvider, pfirmwaretableenumbuffer: COpaquePointer?, buffersize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_enumSystemFirmwareTables(firmwaretableprovidersignature.toInt(), (pfirmwaretableenumbuffer?.value ?: 0L), buffersize.toInt()).toUInt()

public actual fun getComputerNameExA(nametype: ComputerNameFormat, lpbuffer: Pstr, nsize: COpaquePointer?): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getComputerNameExA(nametype, (lpbuffer?.value ?: 0L), (nsize?.value ?: 0L))

public actual fun getComputerNameExW(nametype: ComputerNameFormat, lpbuffer: Pwstr, nsize: COpaquePointer?): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getComputerNameExW(nametype, (lpbuffer?.value ?: 0L), (nsize?.value ?: 0L))

public actual fun getDeveloperDriveEnablementState(): DeveloperDriveEnablementState =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getDeveloperDriveEnablementState()

public actual fun getFirmwareType(firmwaretype: COpaquePointer?): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getFirmwareType((firmwaretype?.value ?: 0L))

public actual fun getIntegratedDisplaySize(sizeininches: COpaquePointer?): Hresult =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getIntegratedDisplaySize((sizeininches?.value ?: 0L))

public actual fun getLocalTime(lpsystemtime: COpaquePointer?) {
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getLocalTime((lpsystemtime?.value ?: 0L))
}

public actual fun getLogicalProcessorInformation(buffer: COpaquePointer?, returnedlength: COpaquePointer?): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getLogicalProcessorInformation((buffer?.value ?: 0L), (returnedlength?.value ?: 0L))

public actual fun getLogicalProcessorInformationEx(relationshiptype: LogicalProcessorRelationship, buffer: COpaquePointer?, returnedlength: COpaquePointer?): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getLogicalProcessorInformationEx(relationshiptype, (buffer?.value ?: 0L), (returnedlength?.value ?: 0L))

public actual fun getNativeSystemInfo(lpsysteminfo: COpaquePointer?) {
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getNativeSystemInfo((lpsysteminfo?.value ?: 0L))
}

public actual fun getOsManufacturingMode(pbenabled: COpaquePointer?): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getOsManufacturingMode((pbenabled?.value ?: 0L))

public actual fun getOsSafeBootMode(flags: COpaquePointer?): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getOsSafeBootMode((flags?.value ?: 0L))

public actual fun getPhysicallyInstalledSystemMemory(totalmemoryinkilobytes: COpaquePointer?): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getPhysicallyInstalledSystemMemory((totalmemoryinkilobytes?.value ?: 0L))

public actual fun getProcessorSystemCycleTime(group: UShort, buffer: COpaquePointer?, returnedlength: COpaquePointer?): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getProcessorSystemCycleTime(group.toShort(), (buffer?.value ?: 0L), (returnedlength?.value ?: 0L))

public actual fun getProductInfo(dwosmajorversion: UInt, dwosminorversion: UInt, dwspmajorversion: UInt, dwspminorversion: UInt, pdwreturnedproducttype: COpaquePointer?): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getProductInfo(dwosmajorversion.toInt(), dwosminorversion.toInt(), dwspmajorversion.toInt(), dwspminorversion.toInt(), (pdwreturnedproducttype?.value ?: 0L))

public actual fun getSystemCpuSetInformation(information: COpaquePointer?, bufferlength: UInt, returnedlength: COpaquePointer?, process: Handle, flags: UInt): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getSystemCpuSetInformation((information?.value ?: 0L), bufferlength.toInt(), (returnedlength?.value ?: 0L), (process?.value ?: 0L), flags.toInt())

public actual fun getSystemDEPPolicy(): DepSystemPolicyType =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getSystemDEPPolicy()

public actual fun getSystemDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getSystemDirectoryA((lpbuffer?.value ?: 0L), usize.toInt()).toUInt()

public actual fun getSystemDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getSystemDirectoryW((lpbuffer?.value ?: 0L), usize.toInt()).toUInt()

public actual fun getSystemFirmwareTable(firmwaretableprovidersignature: FirmwareTableProvider, firmwaretableid: UInt, pfirmwaretablebuffer: COpaquePointer?, buffersize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getSystemFirmwareTable(firmwaretableprovidersignature.toInt(), firmwaretableid.toInt(), (pfirmwaretablebuffer?.value ?: 0L), buffersize.toInt()).toUInt()

public actual fun getSystemInfo(lpsysteminfo: COpaquePointer?) {
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getSystemInfo((lpsysteminfo?.value ?: 0L))
}

public actual fun getSystemLeapSecondInformation(enabled: COpaquePointer?, flags: COpaquePointer?): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getSystemLeapSecondInformation((enabled?.value ?: 0L), (flags?.value ?: 0L))

public actual fun getSystemTime(lpsystemtime: COpaquePointer?) {
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getSystemTime((lpsystemtime?.value ?: 0L))
}

public actual fun getSystemTimeAdjustment(lptimeadjustment: COpaquePointer?, lptimeincrement: COpaquePointer?, lptimeadjustmentdisabled: COpaquePointer?): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getSystemTimeAdjustment((lptimeadjustment?.value ?: 0L), (lptimeincrement?.value ?: 0L), (lptimeadjustmentdisabled?.value ?: 0L))

public actual fun getSystemTimeAdjustmentPrecise(lptimeadjustment: COpaquePointer?, lptimeincrement: COpaquePointer?, lptimeadjustmentdisabled: COpaquePointer?): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getSystemTimeAdjustmentPrecise((lptimeadjustment?.value ?: 0L), (lptimeincrement?.value ?: 0L), (lptimeadjustmentdisabled?.value ?: 0L))

public actual fun getSystemTimeAsFileTime(lpsystemtimeasfiletime: COpaquePointer?) {
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getSystemTimeAsFileTime((lpsystemtimeasfiletime?.value ?: 0L))
}

public actual fun getSystemTimePreciseAsFileTime(lpsystemtimeasfiletime: COpaquePointer?) {
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getSystemTimePreciseAsFileTime((lpsystemtimeasfiletime?.value ?: 0L))
}

public actual fun getSystemWindowsDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getSystemWindowsDirectoryA((lpbuffer?.value ?: 0L), usize.toInt()).toUInt()

public actual fun getSystemWindowsDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getSystemWindowsDirectoryW((lpbuffer?.value ?: 0L), usize.toInt()).toUInt()

public actual fun getSystemWow64Directory2A(lpbuffer: Pstr, usize: UInt, imagefilemachinetype: ImageFileMachine): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getSystemWow64Directory2A((lpbuffer?.value ?: 0L), usize.toInt(), imagefilemachinetype.toShort()).toUInt()

public actual fun getSystemWow64Directory2W(lpbuffer: Pwstr, usize: UInt, imagefilemachinetype: ImageFileMachine): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getSystemWow64Directory2W((lpbuffer?.value ?: 0L), usize.toInt(), imagefilemachinetype.toShort()).toUInt()

public actual fun getSystemWow64DirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getSystemWow64DirectoryA((lpbuffer?.value ?: 0L), usize.toInt()).toUInt()

public actual fun getSystemWow64DirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getSystemWow64DirectoryW((lpbuffer?.value ?: 0L), usize.toInt()).toUInt()

public actual fun getTickCount(): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getTickCount().toUInt()

public actual fun getTickCount64(): ULong =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getTickCount64().toULong()

public actual fun getVersion(): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getVersion().toUInt()

public actual fun getVersionExA(lpversioninformation: COpaquePointer?): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getVersionExA((lpversioninformation?.value ?: 0L))

public actual fun getVersionExW(lpversioninformation: COpaquePointer?): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getVersionExW((lpversioninformation?.value ?: 0L))

public actual fun getWindowsDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getWindowsDirectoryA((lpbuffer?.value ?: 0L), usize.toInt()).toUInt()

public actual fun getWindowsDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_getWindowsDirectoryW((lpbuffer?.value ?: 0L), usize.toInt()).toUInt()

public actual fun globalMemoryStatus(lpbuffer: COpaquePointer?) {
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_globalMemoryStatus((lpbuffer?.value ?: 0L))
}

public actual fun globalMemoryStatusEx(lpbuffer: COpaquePointer?): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_globalMemoryStatusEx((lpbuffer?.value ?: 0L))

public actual fun isUserCetAvailableInEnvironment(usercetenvironment: UserCetEnvironment): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_isUserCetAvailableInEnvironment(usercetenvironment.toInt())

public actual fun isWow64GuestMachineSupported(wowguestmachine: ImageFileMachine, machineissupported: COpaquePointer?): Hresult =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_isWow64GuestMachineSupported(wowguestmachine.toShort(), (machineissupported?.value ?: 0L))

public actual fun rtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize: COpaquePointer?, puldeviceformbuffersize: COpaquePointer?, devicefamily: Pwstr, deviceform: Pwstr): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_rtlConvertDeviceFamilyInfoToString((puldevicefamilybuffersize?.value ?: 0L), (puldeviceformbuffersize?.value ?: 0L), (devicefamily?.value ?: 0L), (deviceform?.value ?: 0L)).toUInt()

public actual fun rtlGetDeviceFamilyInfoEnum(pulluapinfo: COpaquePointer?, puldevicefamily: COpaquePointer?, puldeviceform: COpaquePointer?) {
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_rtlGetDeviceFamilyInfoEnum((pulluapinfo?.value ?: 0L), (puldevicefamily?.value ?: 0L), (puldeviceform?.value ?: 0L))
}

public actual fun rtlGetProductInfo(osmajorversion: UInt, osminorversion: UInt, spmajorversion: UInt, spminorversion: UInt, returnedproducttype: COpaquePointer?): Boolean =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_rtlGetProductInfo(osmajorversion.toInt(), osminorversion.toInt(), spmajorversion.toInt(), spminorversion.toInt(), (returnedproducttype?.value ?: 0L))

public actual fun rtlGetSystemGlobalData(dataid: RtlSystemGlobalDataId, buffer: COpaquePointer?, size: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_rtlGetSystemGlobalData(dataid, (buffer?.value ?: 0L), size.toInt()).toUInt()

public actual fun rtlOsDeploymentState(flags: UInt): OsDeployementStateValues =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_rtlOsDeploymentState(flags.toInt())

public actual fun rtlSwitchedVVI(versioninfo: COpaquePointer?, typemask: UInt, conditionmask: ULong): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_rtlSwitchedVVI((versioninfo?.value ?: 0L), typemask.toInt(), conditionmask.toLong()).toUInt()

public actual fun setComputerNameA(lpcomputername: Pcstr): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_setComputerNameA((lpcomputername?.value ?: 0L))

public actual fun setComputerNameEx2W(nametype: ComputerNameFormat, flags: UInt, lpbuffer: Pcwstr): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_setComputerNameEx2W(nametype, flags.toInt(), (lpbuffer?.value ?: 0L))

public actual fun setComputerNameExA(nametype: ComputerNameFormat, lpbuffer: Pcstr): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_setComputerNameExA(nametype, (lpbuffer?.value ?: 0L))

public actual fun setComputerNameExW(nametype: ComputerNameFormat, lpbuffer: Pcwstr): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_setComputerNameExW(nametype, (lpbuffer?.value ?: 0L))

public actual fun setComputerNameW(lpcomputername: Pcwstr): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_setComputerNameW((lpcomputername?.value ?: 0L))

public actual fun setLocalTime(lpsystemtime: COpaquePointer?): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_setLocalTime((lpsystemtime?.value ?: 0L))

public actual fun setSystemTime(lpsystemtime: COpaquePointer?): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_setSystemTime((lpsystemtime?.value ?: 0L))

public actual fun setSystemTimeAdjustment(dwtimeadjustment: UInt, btimeadjustmentdisabled: Bool): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_setSystemTimeAdjustment(dwtimeadjustment.toInt(), btimeadjustmentdisabled)

public actual fun setSystemTimeAdjustmentPrecise(dwtimeadjustment: ULong, btimeadjustmentdisabled: Bool): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_setSystemTimeAdjustmentPrecise(dwtimeadjustment.toLong(), btimeadjustmentdisabled)

public actual fun verSetConditionMask(conditionmask: ULong, typemask: VerFlags, condition: UByte): ULong =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_verSetConditionMask(conditionmask.toLong(), typemask.toInt(), condition.toByte()).toULong()

public actual fun verifyVersionInfoA(lpversioninformation: COpaquePointer?, dwtypemask: VerFlags, dwlconditionmask: ULong): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_verifyVersionInfoA((lpversioninformation?.value ?: 0L), dwtypemask.toInt(), dwlconditionmask.toLong())

public actual fun verifyVersionInfoW(lpversioninformation: COpaquePointer?, dwtypemask: VerFlags, dwlconditionmask: ULong): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssys_windows_win32_system_systeminformation_verifyVersionInfoW((lpversioninformation?.value ?: 0L), dwtypemask.toInt(), dwlconditionmask.toLong())
