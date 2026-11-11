@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.systeminformation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_dnsHostnameToComputerNameExW
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_enumSystemFirmwareTables
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getComputerNameExA
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getComputerNameExW
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getDeveloperDriveEnablementState
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getFirmwareType
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getIntegratedDisplaySize
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getLocalTime
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getLogicalProcessorInformation
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getLogicalProcessorInformationEx
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getNativeSystemInfo
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getOsManufacturingMode
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getOsSafeBootMode
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getPhysicallyInstalledSystemMemory
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getProcessorSystemCycleTime
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getProductInfo
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getSystemCpuSetInformation
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getSystemDEPPolicy
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getSystemDirectoryA
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getSystemDirectoryW
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getSystemFirmwareTable
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getSystemInfo
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getSystemLeapSecondInformation
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getSystemTime
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getSystemTimeAdjustment
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getSystemTimeAdjustmentPrecise
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getSystemTimeAsFileTime
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getSystemTimePreciseAsFileTime
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getSystemWindowsDirectoryA
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getSystemWindowsDirectoryW
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getSystemWow64Directory2A
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getSystemWow64Directory2W
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getSystemWow64DirectoryA
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getSystemWow64DirectoryW
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getTickCount
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getTickCount64
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getVersion
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getVersionExA
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getVersionExW
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getWindowsDirectoryA
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_getWindowsDirectoryW
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_globalMemoryStatus
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_globalMemoryStatusEx
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_isUserCetAvailableInEnvironment
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_isWow64GuestMachineSupported
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_rtlConvertDeviceFamilyInfoToString
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_rtlGetDeviceFamilyInfoEnum
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_rtlGetProductInfo
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_rtlGetSystemGlobalData
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_rtlOsDeploymentState
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_rtlSwitchedVVI
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_setComputerNameA
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_setComputerNameEx2W
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_setComputerNameExA
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_setComputerNameExW
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_setComputerNameW
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_setLocalTime
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_setSystemTime
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_setSystemTimeAdjustment
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_setSystemTimeAdjustmentPrecise
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_verSetConditionMask
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_verifyVersionInfoA
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssys_windows_win32_system_systeminformation_verifyVersionInfoW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun dnsHostnameToComputerNameExW(hostname: Pcwstr, computername: Pwstr, nsize: COpaquePointer?): Bool =
    windowssys_windows_win32_system_systeminformation_dnsHostnameToComputerNameExW(hostname?.value?.toCPointer<ByteVar>(), computername?.value?.toCPointer<ByteVar>(), nsize?.value?.toCPointer<ByteVar>())

public actual fun enumSystemFirmwareTables(firmwaretableprovidersignature: FirmwareTableProvider, pfirmwaretableenumbuffer: COpaquePointer?, buffersize: UInt): UInt =
    windowssys_windows_win32_system_systeminformation_enumSystemFirmwareTables(firmwaretableprovidersignature, pfirmwaretableenumbuffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun getComputerNameExA(nametype: ComputerNameFormat, lpbuffer: Pstr, nsize: COpaquePointer?): Bool =
    windowssys_windows_win32_system_systeminformation_getComputerNameExA(nametype, lpbuffer?.value?.toCPointer<ByteVar>(), nsize?.value?.toCPointer<ByteVar>())

public actual fun getComputerNameExW(nametype: ComputerNameFormat, lpbuffer: Pwstr, nsize: COpaquePointer?): Bool =
    windowssys_windows_win32_system_systeminformation_getComputerNameExW(nametype, lpbuffer?.value?.toCPointer<ByteVar>(), nsize?.value?.toCPointer<ByteVar>())

public actual fun getDeveloperDriveEnablementState(): DeveloperDriveEnablementState =
    windowssys_windows_win32_system_systeminformation_getDeveloperDriveEnablementState()

public actual fun getFirmwareType(firmwaretype: COpaquePointer?): Bool =
    windowssys_windows_win32_system_systeminformation_getFirmwareType(firmwaretype?.value?.toCPointer<ByteVar>())

public actual fun getIntegratedDisplaySize(sizeininches: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_systeminformation_getIntegratedDisplaySize(sizeininches?.value?.toCPointer<ByteVar>())

public actual fun getLocalTime(lpsystemtime: COpaquePointer?) {
    windowssys_windows_win32_system_systeminformation_getLocalTime(lpsystemtime?.value?.toCPointer<ByteVar>())
}

public actual fun getLogicalProcessorInformation(buffer: COpaquePointer?, returnedlength: COpaquePointer?): Bool =
    windowssys_windows_win32_system_systeminformation_getLogicalProcessorInformation(buffer?.value?.toCPointer<ByteVar>(), returnedlength?.value?.toCPointer<ByteVar>())

public actual fun getLogicalProcessorInformationEx(relationshiptype: LogicalProcessorRelationship, buffer: COpaquePointer?, returnedlength: COpaquePointer?): Bool =
    windowssys_windows_win32_system_systeminformation_getLogicalProcessorInformationEx(relationshiptype, buffer?.value?.toCPointer<ByteVar>(), returnedlength?.value?.toCPointer<ByteVar>())

public actual fun getNativeSystemInfo(lpsysteminfo: COpaquePointer?) {
    windowssys_windows_win32_system_systeminformation_getNativeSystemInfo(lpsysteminfo?.value?.toCPointer<ByteVar>())
}

public actual fun getOsManufacturingMode(pbenabled: COpaquePointer?): Bool =
    windowssys_windows_win32_system_systeminformation_getOsManufacturingMode(pbenabled?.value?.toCPointer<ByteVar>())

public actual fun getOsSafeBootMode(flags: COpaquePointer?): Bool =
    windowssys_windows_win32_system_systeminformation_getOsSafeBootMode(flags?.value?.toCPointer<ByteVar>())

public actual fun getPhysicallyInstalledSystemMemory(totalmemoryinkilobytes: COpaquePointer?): Bool =
    windowssys_windows_win32_system_systeminformation_getPhysicallyInstalledSystemMemory(totalmemoryinkilobytes?.value?.toCPointer<ByteVar>())

public actual fun getProcessorSystemCycleTime(group: UShort, buffer: COpaquePointer?, returnedlength: COpaquePointer?): Bool =
    windowssys_windows_win32_system_systeminformation_getProcessorSystemCycleTime(group, buffer?.value?.toCPointer<ByteVar>(), returnedlength?.value?.toCPointer<ByteVar>())

public actual fun getProductInfo(dwosmajorversion: UInt, dwosminorversion: UInt, dwspmajorversion: UInt, dwspminorversion: UInt, pdwreturnedproducttype: COpaquePointer?): Bool =
    windowssys_windows_win32_system_systeminformation_getProductInfo(dwosmajorversion, dwosminorversion, dwspmajorversion, dwspminorversion, pdwreturnedproducttype?.value?.toCPointer<ByteVar>())

public actual fun getSystemCpuSetInformation(information: COpaquePointer?, bufferlength: UInt, returnedlength: COpaquePointer?, process: Handle, flags: UInt): Bool =
    windowssys_windows_win32_system_systeminformation_getSystemCpuSetInformation(information?.value?.toCPointer<ByteVar>(), bufferlength, returnedlength?.value?.toCPointer<ByteVar>(), process?.value?.toCPointer<ByteVar>(), flags)

public actual fun getSystemDEPPolicy(): DepSystemPolicyType =
    windowssys_windows_win32_system_systeminformation_getSystemDEPPolicy()

public actual fun getSystemDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    windowssys_windows_win32_system_systeminformation_getSystemDirectoryA(lpbuffer?.value?.toCPointer<ByteVar>(), usize)

public actual fun getSystemDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    windowssys_windows_win32_system_systeminformation_getSystemDirectoryW(lpbuffer?.value?.toCPointer<ByteVar>(), usize)

public actual fun getSystemFirmwareTable(firmwaretableprovidersignature: FirmwareTableProvider, firmwaretableid: UInt, pfirmwaretablebuffer: COpaquePointer?, buffersize: UInt): UInt =
    windowssys_windows_win32_system_systeminformation_getSystemFirmwareTable(firmwaretableprovidersignature, firmwaretableid, pfirmwaretablebuffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun getSystemInfo(lpsysteminfo: COpaquePointer?) {
    windowssys_windows_win32_system_systeminformation_getSystemInfo(lpsysteminfo?.value?.toCPointer<ByteVar>())
}

public actual fun getSystemLeapSecondInformation(enabled: COpaquePointer?, flags: COpaquePointer?): Bool =
    windowssys_windows_win32_system_systeminformation_getSystemLeapSecondInformation(enabled?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun getSystemTime(lpsystemtime: COpaquePointer?) {
    windowssys_windows_win32_system_systeminformation_getSystemTime(lpsystemtime?.value?.toCPointer<ByteVar>())
}

public actual fun getSystemTimeAdjustment(lptimeadjustment: COpaquePointer?, lptimeincrement: COpaquePointer?, lptimeadjustmentdisabled: COpaquePointer?): Bool =
    windowssys_windows_win32_system_systeminformation_getSystemTimeAdjustment(lptimeadjustment?.value?.toCPointer<ByteVar>(), lptimeincrement?.value?.toCPointer<ByteVar>(), lptimeadjustmentdisabled?.value?.toCPointer<ByteVar>())

public actual fun getSystemTimeAdjustmentPrecise(lptimeadjustment: COpaquePointer?, lptimeincrement: COpaquePointer?, lptimeadjustmentdisabled: COpaquePointer?): Bool =
    windowssys_windows_win32_system_systeminformation_getSystemTimeAdjustmentPrecise(lptimeadjustment?.value?.toCPointer<ByteVar>(), lptimeincrement?.value?.toCPointer<ByteVar>(), lptimeadjustmentdisabled?.value?.toCPointer<ByteVar>())

public actual fun getSystemTimeAsFileTime(lpsystemtimeasfiletime: COpaquePointer?) {
    windowssys_windows_win32_system_systeminformation_getSystemTimeAsFileTime(lpsystemtimeasfiletime?.value?.toCPointer<ByteVar>())
}

public actual fun getSystemTimePreciseAsFileTime(lpsystemtimeasfiletime: COpaquePointer?) {
    windowssys_windows_win32_system_systeminformation_getSystemTimePreciseAsFileTime(lpsystemtimeasfiletime?.value?.toCPointer<ByteVar>())
}

public actual fun getSystemWindowsDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    windowssys_windows_win32_system_systeminformation_getSystemWindowsDirectoryA(lpbuffer?.value?.toCPointer<ByteVar>(), usize)

public actual fun getSystemWindowsDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    windowssys_windows_win32_system_systeminformation_getSystemWindowsDirectoryW(lpbuffer?.value?.toCPointer<ByteVar>(), usize)

public actual fun getSystemWow64Directory2A(lpbuffer: Pstr, usize: UInt, imagefilemachinetype: ImageFileMachine): UInt =
    windowssys_windows_win32_system_systeminformation_getSystemWow64Directory2A(lpbuffer?.value?.toCPointer<ByteVar>(), usize, imagefilemachinetype)

public actual fun getSystemWow64Directory2W(lpbuffer: Pwstr, usize: UInt, imagefilemachinetype: ImageFileMachine): UInt =
    windowssys_windows_win32_system_systeminformation_getSystemWow64Directory2W(lpbuffer?.value?.toCPointer<ByteVar>(), usize, imagefilemachinetype)

public actual fun getSystemWow64DirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    windowssys_windows_win32_system_systeminformation_getSystemWow64DirectoryA(lpbuffer?.value?.toCPointer<ByteVar>(), usize)

public actual fun getSystemWow64DirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    windowssys_windows_win32_system_systeminformation_getSystemWow64DirectoryW(lpbuffer?.value?.toCPointer<ByteVar>(), usize)

public actual fun getTickCount(): UInt =
    windowssys_windows_win32_system_systeminformation_getTickCount()

public actual fun getTickCount64(): ULong =
    windowssys_windows_win32_system_systeminformation_getTickCount64()

public actual fun getVersion(): UInt =
    windowssys_windows_win32_system_systeminformation_getVersion()

public actual fun getVersionExA(lpversioninformation: COpaquePointer?): Bool =
    windowssys_windows_win32_system_systeminformation_getVersionExA(lpversioninformation?.value?.toCPointer<ByteVar>())

public actual fun getVersionExW(lpversioninformation: COpaquePointer?): Bool =
    windowssys_windows_win32_system_systeminformation_getVersionExW(lpversioninformation?.value?.toCPointer<ByteVar>())

public actual fun getWindowsDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    windowssys_windows_win32_system_systeminformation_getWindowsDirectoryA(lpbuffer?.value?.toCPointer<ByteVar>(), usize)

public actual fun getWindowsDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    windowssys_windows_win32_system_systeminformation_getWindowsDirectoryW(lpbuffer?.value?.toCPointer<ByteVar>(), usize)

public actual fun globalMemoryStatus(lpbuffer: COpaquePointer?) {
    windowssys_windows_win32_system_systeminformation_globalMemoryStatus(lpbuffer?.value?.toCPointer<ByteVar>())
}

public actual fun globalMemoryStatusEx(lpbuffer: COpaquePointer?): Bool =
    windowssys_windows_win32_system_systeminformation_globalMemoryStatusEx(lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun isUserCetAvailableInEnvironment(usercetenvironment: UserCetEnvironment): Bool =
    windowssys_windows_win32_system_systeminformation_isUserCetAvailableInEnvironment(usercetenvironment)

public actual fun isWow64GuestMachineSupported(wowguestmachine: ImageFileMachine, machineissupported: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_systeminformation_isWow64GuestMachineSupported(wowguestmachine, machineissupported?.value?.toCPointer<ByteVar>())

public actual fun rtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize: COpaquePointer?, puldeviceformbuffersize: COpaquePointer?, devicefamily: Pwstr, deviceform: Pwstr): UInt =
    windowssys_windows_win32_system_systeminformation_rtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize?.value?.toCPointer<ByteVar>(), puldeviceformbuffersize?.value?.toCPointer<ByteVar>(), devicefamily?.value?.toCPointer<ByteVar>(), deviceform?.value?.toCPointer<ByteVar>())

public actual fun rtlGetDeviceFamilyInfoEnum(pulluapinfo: COpaquePointer?, puldevicefamily: COpaquePointer?, puldeviceform: COpaquePointer?) {
    windowssys_windows_win32_system_systeminformation_rtlGetDeviceFamilyInfoEnum(pulluapinfo?.value?.toCPointer<ByteVar>(), puldevicefamily?.value?.toCPointer<ByteVar>(), puldeviceform?.value?.toCPointer<ByteVar>())
}

public actual fun rtlGetProductInfo(osmajorversion: UInt, osminorversion: UInt, spmajorversion: UInt, spminorversion: UInt, returnedproducttype: COpaquePointer?): Boolean =
    windowssys_windows_win32_system_systeminformation_rtlGetProductInfo(osmajorversion, osminorversion, spmajorversion, spminorversion, returnedproducttype?.value?.toCPointer<ByteVar>())

public actual fun rtlGetSystemGlobalData(dataid: RtlSystemGlobalDataId, buffer: COpaquePointer?, size: UInt): UInt =
    windowssys_windows_win32_system_systeminformation_rtlGetSystemGlobalData(dataid, buffer?.value?.toCPointer<ByteVar>(), size)

public actual fun rtlOsDeploymentState(flags: UInt): OsDeployementStateValues =
    windowssys_windows_win32_system_systeminformation_rtlOsDeploymentState(flags)

public actual fun rtlSwitchedVVI(versioninfo: COpaquePointer?, typemask: UInt, conditionmask: ULong): UInt =
    windowssys_windows_win32_system_systeminformation_rtlSwitchedVVI(versioninfo?.value?.toCPointer<ByteVar>(), typemask, conditionmask)

public actual fun setComputerNameA(lpcomputername: Pcstr): Bool =
    windowssys_windows_win32_system_systeminformation_setComputerNameA(lpcomputername?.value?.toCPointer<ByteVar>())

public actual fun setComputerNameEx2W(nametype: ComputerNameFormat, flags: UInt, lpbuffer: Pcwstr): Bool =
    windowssys_windows_win32_system_systeminformation_setComputerNameEx2W(nametype, flags, lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun setComputerNameExA(nametype: ComputerNameFormat, lpbuffer: Pcstr): Bool =
    windowssys_windows_win32_system_systeminformation_setComputerNameExA(nametype, lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun setComputerNameExW(nametype: ComputerNameFormat, lpbuffer: Pcwstr): Bool =
    windowssys_windows_win32_system_systeminformation_setComputerNameExW(nametype, lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun setComputerNameW(lpcomputername: Pcwstr): Bool =
    windowssys_windows_win32_system_systeminformation_setComputerNameW(lpcomputername?.value?.toCPointer<ByteVar>())

public actual fun setLocalTime(lpsystemtime: COpaquePointer?): Bool =
    windowssys_windows_win32_system_systeminformation_setLocalTime(lpsystemtime?.value?.toCPointer<ByteVar>())

public actual fun setSystemTime(lpsystemtime: COpaquePointer?): Bool =
    windowssys_windows_win32_system_systeminformation_setSystemTime(lpsystemtime?.value?.toCPointer<ByteVar>())

public actual fun setSystemTimeAdjustment(dwtimeadjustment: UInt, btimeadjustmentdisabled: Bool): Bool =
    windowssys_windows_win32_system_systeminformation_setSystemTimeAdjustment(dwtimeadjustment, btimeadjustmentdisabled)

public actual fun setSystemTimeAdjustmentPrecise(dwtimeadjustment: ULong, btimeadjustmentdisabled: Bool): Bool =
    windowssys_windows_win32_system_systeminformation_setSystemTimeAdjustmentPrecise(dwtimeadjustment, btimeadjustmentdisabled)

public actual fun verSetConditionMask(conditionmask: ULong, typemask: VerFlags, condition: UByte): ULong =
    windowssys_windows_win32_system_systeminformation_verSetConditionMask(conditionmask, typemask, condition)

public actual fun verifyVersionInfoA(lpversioninformation: COpaquePointer?, dwtypemask: VerFlags, dwlconditionmask: ULong): Bool =
    windowssys_windows_win32_system_systeminformation_verifyVersionInfoA(lpversioninformation?.value?.toCPointer<ByteVar>(), dwtypemask, dwlconditionmask)

public actual fun verifyVersionInfoW(lpversioninformation: COpaquePointer?, dwtypemask: VerFlags, dwlconditionmask: ULong): Bool =
    windowssys_windows_win32_system_systeminformation_verifyVersionInfoW(lpversioninformation?.value?.toCPointer<ByteVar>(), dwtypemask, dwlconditionmask)
