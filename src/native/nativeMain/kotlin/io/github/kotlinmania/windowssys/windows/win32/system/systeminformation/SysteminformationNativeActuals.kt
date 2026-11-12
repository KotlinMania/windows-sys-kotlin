@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.systeminformation

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationDnsHostnameToComputerNameExW
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationEnumSystemFirmwareTables
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetComputerNameExA
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetComputerNameExW
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetDeveloperDriveEnablementState
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetFirmwareType
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetIntegratedDisplaySize
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetLocalTime
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetLogicalProcessorInformation
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetLogicalProcessorInformationEx
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetNativeSystemInfo
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetOsManufacturingMode
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetOsSafeBootMode
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetPhysicallyInstalledSystemMemory
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetProcessorSystemCycleTime
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetProductInfo
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetSystemCpuSetInformation
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetSystemDEPPolicy
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetSystemDirectoryA
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetSystemDirectoryW
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetSystemFirmwareTable
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetSystemInfo
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetSystemLeapSecondInformation
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetSystemTime
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetSystemTimeAdjustment
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetSystemTimeAdjustmentPrecise
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetSystemTimeAsFileTime
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetSystemTimePreciseAsFileTime
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetSystemWindowsDirectoryA
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetSystemWindowsDirectoryW
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetSystemWow64Directory2A
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetSystemWow64Directory2W
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetSystemWow64DirectoryA
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetSystemWow64DirectoryW
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetTickCount
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetTickCount64
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetVersion
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetVersionExA
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetVersionExW
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetWindowsDirectoryA
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGetWindowsDirectoryW
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGlobalMemoryStatus
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationGlobalMemoryStatusEx
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationIsUserCetAvailableInEnvironment
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationIsWow64GuestMachineSupported
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationRtlConvertDeviceFamilyInfoToString
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationRtlGetDeviceFamilyInfoEnum
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationRtlGetProductInfo
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationRtlGetSystemGlobalData
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationRtlOsDeploymentState
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationRtlSwitchedVVI
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationSetComputerNameA
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationSetComputerNameEx2W
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationSetComputerNameExA
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationSetComputerNameExW
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationSetComputerNameW
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationSetLocalTime
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationSetSystemTime
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustment
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustmentPrecise
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationVerSetConditionMask
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationVerifyVersionInfoA
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.cinterop.windowssysWindowsWin32SystemSysteminformationVerifyVersionInfoW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun dnsHostnameToComputerNameExW(hostname: Pcwstr, computername: Pwstr, nsize: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemSysteminformationDnsHostnameToComputerNameExW(hostname.rawAddress.toCPointer<ByteVar>(), computername.rawAddress.toCPointer<ByteVar>(), nsize.rawAddress.toCPointer<ByteVar>())

public actual fun enumSystemFirmwareTables(firmwaretableprovidersignature: FirmwareTableProvider, pfirmwaretableenumbuffer: MutPtr<UByte>, buffersize: UInt): UInt =
    windowssysWindowsWin32SystemSysteminformationEnumSystemFirmwareTables(firmwaretableprovidersignature, pfirmwaretableenumbuffer.rawAddress.toCPointer<ByteVar>(), buffersize)

public actual fun getComputerNameExA(nametype: ComputerNameFormat, lpbuffer: Pstr, nsize: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemSysteminformationGetComputerNameExA(nametype, lpbuffer.rawAddress.toCPointer<ByteVar>(), nsize.rawAddress.toCPointer<ByteVar>())

public actual fun getComputerNameExW(nametype: ComputerNameFormat, lpbuffer: Pwstr, nsize: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemSysteminformationGetComputerNameExW(nametype, lpbuffer.rawAddress.toCPointer<ByteVar>(), nsize.rawAddress.toCPointer<ByteVar>())

public actual fun getDeveloperDriveEnablementState(): DeveloperDriveEnablementState =
    windowssysWindowsWin32SystemSysteminformationGetDeveloperDriveEnablementState()

public actual fun getFirmwareType(firmwaretype: MutPtr<FirmwareType>): Bool =
    windowssysWindowsWin32SystemSysteminformationGetFirmwareType(firmwaretype.rawAddress.toCPointer<ByteVar>())

public actual fun getIntegratedDisplaySize(sizeininches: MutPtr<Double>): Hresult =
    windowssysWindowsWin32SystemSysteminformationGetIntegratedDisplaySize(sizeininches.rawAddress.toCPointer<ByteVar>())

public actual fun getLocalTime(lpsystemtime: MutPtr<Systemtime>) {
    windowssysWindowsWin32SystemSysteminformationGetLocalTime(lpsystemtime.rawAddress.toCPointer<ByteVar>())
}

public actual fun getLogicalProcessorInformation(buffer: MutPtr<SystemLogicalProcessorInformation>, returnedlength: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemSysteminformationGetLogicalProcessorInformation(buffer.rawAddress.toCPointer<ByteVar>(), returnedlength.rawAddress.toCPointer<ByteVar>())

public actual fun getLogicalProcessorInformationEx(relationshiptype: LogicalProcessorRelationship, buffer: MutPtr<SystemLogicalProcessorInformationEx>, returnedlength: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemSysteminformationGetLogicalProcessorInformationEx(relationshiptype, buffer.rawAddress.toCPointer<ByteVar>(), returnedlength.rawAddress.toCPointer<ByteVar>())

public actual fun getNativeSystemInfo(lpsysteminfo: MutPtr<SystemInfo>) {
    windowssysWindowsWin32SystemSysteminformationGetNativeSystemInfo(lpsysteminfo.rawAddress.toCPointer<ByteVar>())
}

public actual fun getOsManufacturingMode(pbenabled: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SystemSysteminformationGetOsManufacturingMode(pbenabled.rawAddress.toCPointer<ByteVar>())

public actual fun getOsSafeBootMode(flags: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemSysteminformationGetOsSafeBootMode(flags.rawAddress.toCPointer<ByteVar>())

public actual fun getPhysicallyInstalledSystemMemory(totalmemoryinkilobytes: MutPtr<ULong>): Bool =
    windowssysWindowsWin32SystemSysteminformationGetPhysicallyInstalledSystemMemory(totalmemoryinkilobytes.rawAddress.toCPointer<ByteVar>())

public actual fun getProcessorSystemCycleTime(group: UShort, buffer: MutPtr<SystemProcessorCycleTimeInformation>, returnedlength: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemSysteminformationGetProcessorSystemCycleTime(group, buffer.rawAddress.toCPointer<ByteVar>(), returnedlength.rawAddress.toCPointer<ByteVar>())

public actual fun getProductInfo(dwosmajorversion: UInt, dwosminorversion: UInt, dwspmajorversion: UInt, dwspminorversion: UInt, pdwreturnedproducttype: MutPtr<OsProductType>): Bool =
    windowssysWindowsWin32SystemSysteminformationGetProductInfo(dwosmajorversion, dwosminorversion, dwspmajorversion, dwspminorversion, pdwreturnedproducttype.rawAddress.toCPointer<ByteVar>())

public actual fun getSystemCpuSetInformation(information: MutPtr<SystemCpuSetInformation>, bufferlength: UInt, returnedlength: MutPtr<UInt>, process: Handle, flags: UInt): Bool =
    windowssysWindowsWin32SystemSysteminformationGetSystemCpuSetInformation(information.rawAddress.toCPointer<ByteVar>(), bufferlength, returnedlength.rawAddress.toCPointer<ByteVar>(), process.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun getSystemDEPPolicy(): DepSystemPolicyType =
    windowssysWindowsWin32SystemSysteminformationGetSystemDEPPolicy()

public actual fun getSystemDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    windowssysWindowsWin32SystemSysteminformationGetSystemDirectoryA(lpbuffer.rawAddress.toCPointer<ByteVar>(), usize)

public actual fun getSystemDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    windowssysWindowsWin32SystemSysteminformationGetSystemDirectoryW(lpbuffer.rawAddress.toCPointer<ByteVar>(), usize)

public actual fun getSystemFirmwareTable(firmwaretableprovidersignature: FirmwareTableProvider, firmwaretableid: UInt, pfirmwaretablebuffer: MutPtr<UByte>, buffersize: UInt): UInt =
    windowssysWindowsWin32SystemSysteminformationGetSystemFirmwareTable(firmwaretableprovidersignature, firmwaretableid, pfirmwaretablebuffer.rawAddress.toCPointer<ByteVar>(), buffersize)

public actual fun getSystemInfo(lpsysteminfo: MutPtr<SystemInfo>) {
    windowssysWindowsWin32SystemSysteminformationGetSystemInfo(lpsysteminfo.rawAddress.toCPointer<ByteVar>())
}

public actual fun getSystemLeapSecondInformation(enabled: MutPtr<Bool>, flags: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemSysteminformationGetSystemLeapSecondInformation(enabled.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun getSystemTime(lpsystemtime: MutPtr<Systemtime>) {
    windowssysWindowsWin32SystemSysteminformationGetSystemTime(lpsystemtime.rawAddress.toCPointer<ByteVar>())
}

public actual fun getSystemTimeAdjustment(lptimeadjustment: MutPtr<UInt>, lptimeincrement: MutPtr<UInt>, lptimeadjustmentdisabled: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SystemSysteminformationGetSystemTimeAdjustment(lptimeadjustment.rawAddress.toCPointer<ByteVar>(), lptimeincrement.rawAddress.toCPointer<ByteVar>(), lptimeadjustmentdisabled.rawAddress.toCPointer<ByteVar>())

public actual fun getSystemTimeAdjustmentPrecise(lptimeadjustment: MutPtr<ULong>, lptimeincrement: MutPtr<ULong>, lptimeadjustmentdisabled: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SystemSysteminformationGetSystemTimeAdjustmentPrecise(lptimeadjustment.rawAddress.toCPointer<ByteVar>(), lptimeincrement.rawAddress.toCPointer<ByteVar>(), lptimeadjustmentdisabled.rawAddress.toCPointer<ByteVar>())

public actual fun getSystemTimeAsFileTime(lpsystemtimeasfiletime: MutPtr<Filetime>) {
    windowssysWindowsWin32SystemSysteminformationGetSystemTimeAsFileTime(lpsystemtimeasfiletime.rawAddress.toCPointer<ByteVar>())
}

public actual fun getSystemTimePreciseAsFileTime(lpsystemtimeasfiletime: MutPtr<Filetime>) {
    windowssysWindowsWin32SystemSysteminformationGetSystemTimePreciseAsFileTime(lpsystemtimeasfiletime.rawAddress.toCPointer<ByteVar>())
}

public actual fun getSystemWindowsDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    windowssysWindowsWin32SystemSysteminformationGetSystemWindowsDirectoryA(lpbuffer.rawAddress.toCPointer<ByteVar>(), usize)

public actual fun getSystemWindowsDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    windowssysWindowsWin32SystemSysteminformationGetSystemWindowsDirectoryW(lpbuffer.rawAddress.toCPointer<ByteVar>(), usize)

public actual fun getSystemWow64Directory2A(lpbuffer: Pstr, usize: UInt, imagefilemachinetype: ImageFileMachine): UInt =
    windowssysWindowsWin32SystemSysteminformationGetSystemWow64Directory2A(lpbuffer.rawAddress.toCPointer<ByteVar>(), usize, imagefilemachinetype)

public actual fun getSystemWow64Directory2W(lpbuffer: Pwstr, usize: UInt, imagefilemachinetype: ImageFileMachine): UInt =
    windowssysWindowsWin32SystemSysteminformationGetSystemWow64Directory2W(lpbuffer.rawAddress.toCPointer<ByteVar>(), usize, imagefilemachinetype)

public actual fun getSystemWow64DirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    windowssysWindowsWin32SystemSysteminformationGetSystemWow64DirectoryA(lpbuffer.rawAddress.toCPointer<ByteVar>(), usize)

public actual fun getSystemWow64DirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    windowssysWindowsWin32SystemSysteminformationGetSystemWow64DirectoryW(lpbuffer.rawAddress.toCPointer<ByteVar>(), usize)

public actual fun getTickCount(): UInt =
    windowssysWindowsWin32SystemSysteminformationGetTickCount()

public actual fun getTickCount64(): ULong =
    windowssysWindowsWin32SystemSysteminformationGetTickCount64()

public actual fun getVersion(): UInt =
    windowssysWindowsWin32SystemSysteminformationGetVersion()

public actual fun getVersionExA(lpversioninformation: MutPtr<Osversioninfoa>): Bool =
    windowssysWindowsWin32SystemSysteminformationGetVersionExA(lpversioninformation.rawAddress.toCPointer<ByteVar>())

public actual fun getVersionExW(lpversioninformation: MutPtr<Osversioninfow>): Bool =
    windowssysWindowsWin32SystemSysteminformationGetVersionExW(lpversioninformation.rawAddress.toCPointer<ByteVar>())

public actual fun getWindowsDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    windowssysWindowsWin32SystemSysteminformationGetWindowsDirectoryA(lpbuffer.rawAddress.toCPointer<ByteVar>(), usize)

public actual fun getWindowsDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    windowssysWindowsWin32SystemSysteminformationGetWindowsDirectoryW(lpbuffer.rawAddress.toCPointer<ByteVar>(), usize)

public actual fun globalMemoryStatus(lpbuffer: MutPtr<Memorystatus>) {
    windowssysWindowsWin32SystemSysteminformationGlobalMemoryStatus(lpbuffer.rawAddress.toCPointer<ByteVar>())
}

public actual fun globalMemoryStatusEx(lpbuffer: MutPtr<Memorystatusex>): Bool =
    windowssysWindowsWin32SystemSysteminformationGlobalMemoryStatusEx(lpbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun isUserCetAvailableInEnvironment(usercetenvironment: UserCetEnvironment): Bool =
    windowssysWindowsWin32SystemSysteminformationIsUserCetAvailableInEnvironment(usercetenvironment)

public actual fun isWow64GuestMachineSupported(wowguestmachine: ImageFileMachine, machineissupported: MutPtr<Bool>): Hresult =
    windowssysWindowsWin32SystemSysteminformationIsWow64GuestMachineSupported(wowguestmachine, machineissupported.rawAddress.toCPointer<ByteVar>())

public actual fun rtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize: MutPtr<UInt>, puldeviceformbuffersize: MutPtr<UInt>, devicefamily: Pwstr, deviceform: Pwstr): UInt =
    windowssysWindowsWin32SystemSysteminformationRtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize.rawAddress.toCPointer<ByteVar>(), puldeviceformbuffersize.rawAddress.toCPointer<ByteVar>(), devicefamily.rawAddress.toCPointer<ByteVar>(), deviceform.rawAddress.toCPointer<ByteVar>())

public actual fun rtlGetDeviceFamilyInfoEnum(pulluapinfo: MutPtr<ULong>, puldevicefamily: MutPtr<Devicefamilyinfoenum>, puldeviceform: MutPtr<Devicefamilydeviceform>) {
    windowssysWindowsWin32SystemSysteminformationRtlGetDeviceFamilyInfoEnum(pulluapinfo.rawAddress.toCPointer<ByteVar>(), puldevicefamily.rawAddress.toCPointer<ByteVar>(), puldeviceform.rawAddress.toCPointer<ByteVar>())
}

public actual fun rtlGetProductInfo(osmajorversion: UInt, osminorversion: UInt, spmajorversion: UInt, spminorversion: UInt, returnedproducttype: MutPtr<UInt>): Boolean =
    windowssysWindowsWin32SystemSysteminformationRtlGetProductInfo(osmajorversion, osminorversion, spmajorversion, spminorversion, returnedproducttype.rawAddress.toCPointer<ByteVar>())

public actual fun rtlGetSystemGlobalData(dataid: RtlSystemGlobalDataId, buffer: MutPtr<CVoid>, size: UInt): UInt =
    windowssysWindowsWin32SystemSysteminformationRtlGetSystemGlobalData(dataid, buffer.rawAddress.toCPointer<ByteVar>(), size)

public actual fun rtlOsDeploymentState(flags: UInt): OsDeployementStateValues =
    windowssysWindowsWin32SystemSysteminformationRtlOsDeploymentState(flags)

public actual fun rtlSwitchedVVI(versioninfo: ConstPtr<Osversioninfoexw>, typemask: UInt, conditionmask: ULong): UInt =
    windowssysWindowsWin32SystemSysteminformationRtlSwitchedVVI(versioninfo.rawAddress.toCPointer<ByteVar>(), typemask, conditionmask)

public actual fun setComputerNameA(lpcomputername: Pcstr): Bool =
    windowssysWindowsWin32SystemSysteminformationSetComputerNameA(lpcomputername.rawAddress.toCPointer<ByteVar>())

public actual fun setComputerNameEx2W(nametype: ComputerNameFormat, flags: UInt, lpbuffer: Pcwstr): Bool =
    windowssysWindowsWin32SystemSysteminformationSetComputerNameEx2W(nametype, flags, lpbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun setComputerNameExA(nametype: ComputerNameFormat, lpbuffer: Pcstr): Bool =
    windowssysWindowsWin32SystemSysteminformationSetComputerNameExA(nametype, lpbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun setComputerNameExW(nametype: ComputerNameFormat, lpbuffer: Pcwstr): Bool =
    windowssysWindowsWin32SystemSysteminformationSetComputerNameExW(nametype, lpbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun setComputerNameW(lpcomputername: Pcwstr): Bool =
    windowssysWindowsWin32SystemSysteminformationSetComputerNameW(lpcomputername.rawAddress.toCPointer<ByteVar>())

public actual fun setLocalTime(lpsystemtime: ConstPtr<Systemtime>): Bool =
    windowssysWindowsWin32SystemSysteminformationSetLocalTime(lpsystemtime.rawAddress.toCPointer<ByteVar>())

public actual fun setSystemTime(lpsystemtime: ConstPtr<Systemtime>): Bool =
    windowssysWindowsWin32SystemSysteminformationSetSystemTime(lpsystemtime.rawAddress.toCPointer<ByteVar>())

public actual fun setSystemTimeAdjustment(dwtimeadjustment: UInt, btimeadjustmentdisabled: Bool): Bool =
    windowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustment(dwtimeadjustment, btimeadjustmentdisabled)

public actual fun setSystemTimeAdjustmentPrecise(dwtimeadjustment: ULong, btimeadjustmentdisabled: Bool): Bool =
    windowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustmentPrecise(dwtimeadjustment, btimeadjustmentdisabled)

public actual fun verSetConditionMask(conditionmask: ULong, typemask: VerFlags, condition: UByte): ULong =
    windowssysWindowsWin32SystemSysteminformationVerSetConditionMask(conditionmask, typemask, condition)

public actual fun verifyVersionInfoA(lpversioninformation: MutPtr<Osversioninfoexa>, dwtypemask: VerFlags, dwlconditionmask: ULong): Bool =
    windowssysWindowsWin32SystemSysteminformationVerifyVersionInfoA(lpversioninformation.rawAddress.toCPointer<ByteVar>(), dwtypemask, dwlconditionmask)

public actual fun verifyVersionInfoW(lpversioninformation: MutPtr<Osversioninfoexw>, dwtypemask: VerFlags, dwlconditionmask: ULong): Bool =
    windowssysWindowsWin32SystemSysteminformationVerifyVersionInfoW(lpversioninformation.rawAddress.toCPointer<ByteVar>(), dwtypemask, dwlconditionmask)
