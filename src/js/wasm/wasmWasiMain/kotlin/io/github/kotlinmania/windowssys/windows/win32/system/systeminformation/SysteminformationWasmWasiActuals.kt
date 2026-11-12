@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun dnsHostnameToComputerNameExW(hostname: Pcwstr, computername: Pwstr, nsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationDnsHostnameToComputerNameExW")

public actual fun enumSystemFirmwareTables(firmwaretableprovidersignature: FirmwareTableProvider, pfirmwaretableenumbuffer: MutPtr<UByte>, buffersize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationEnumSystemFirmwareTables")

public actual fun getComputerNameExA(nametype: ComputerNameFormat, lpbuffer: Pstr, nsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetComputerNameExA")

public actual fun getComputerNameExW(nametype: ComputerNameFormat, lpbuffer: Pwstr, nsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetComputerNameExW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemSysteminformationGetDeveloperDriveEnablementState")
private external fun wasiWindowssysWindowsWin32SystemSysteminformationGetDeveloperDriveEnablementState(): Int

public actual fun getDeveloperDriveEnablementState(): DeveloperDriveEnablementState =
    wasiWindowssysWindowsWin32SystemSysteminformationGetDeveloperDriveEnablementState().toInt()

public actual fun getFirmwareType(firmwaretype: MutPtr<FirmwareType>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetFirmwareType")

public actual fun getIntegratedDisplaySize(sizeininches: MutPtr<Double>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetIntegratedDisplaySize")

public actual fun getLocalTime(lpsystemtime: MutPtr<Systemtime>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetLocalTime")

public actual fun getLogicalProcessorInformation(buffer: MutPtr<SystemLogicalProcessorInformation>, returnedlength: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetLogicalProcessorInformation")

public actual fun getLogicalProcessorInformationEx(relationshiptype: LogicalProcessorRelationship, buffer: MutPtr<SystemLogicalProcessorInformationEx>, returnedlength: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetLogicalProcessorInformationEx")

public actual fun getNativeSystemInfo(lpsysteminfo: MutPtr<SystemInfo>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetNativeSystemInfo")

public actual fun getOsManufacturingMode(pbenabled: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetOsManufacturingMode")

public actual fun getOsSafeBootMode(flags: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetOsSafeBootMode")

public actual fun getPhysicallyInstalledSystemMemory(totalmemoryinkilobytes: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetPhysicallyInstalledSystemMemory")

public actual fun getProcessorSystemCycleTime(group: UShort, buffer: MutPtr<SystemProcessorCycleTimeInformation>, returnedlength: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetProcessorSystemCycleTime")

public actual fun getProductInfo(dwosmajorversion: UInt, dwosminorversion: UInt, dwspmajorversion: UInt, dwspminorversion: UInt, pdwreturnedproducttype: MutPtr<OsProductType>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetProductInfo")

public actual fun getSystemCpuSetInformation(information: MutPtr<SystemCpuSetInformation>, bufferlength: UInt, returnedlength: MutPtr<UInt>, process: Handle, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetSystemCpuSetInformation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemSysteminformationGetSystemDEPPolicy")
private external fun wasiWindowssysWindowsWin32SystemSysteminformationGetSystemDEPPolicy(): Int

public actual fun getSystemDEPPolicy(): DepSystemPolicyType =
    wasiWindowssysWindowsWin32SystemSysteminformationGetSystemDEPPolicy().toInt()

public actual fun getSystemDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetSystemDirectoryA")

public actual fun getSystemDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetSystemDirectoryW")

public actual fun getSystemFirmwareTable(firmwaretableprovidersignature: FirmwareTableProvider, firmwaretableid: UInt, pfirmwaretablebuffer: MutPtr<UByte>, buffersize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetSystemFirmwareTable")

public actual fun getSystemInfo(lpsysteminfo: MutPtr<SystemInfo>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetSystemInfo")

public actual fun getSystemLeapSecondInformation(enabled: MutPtr<Bool>, flags: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetSystemLeapSecondInformation")

public actual fun getSystemTime(lpsystemtime: MutPtr<Systemtime>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetSystemTime")

public actual fun getSystemTimeAdjustment(lptimeadjustment: MutPtr<UInt>, lptimeincrement: MutPtr<UInt>, lptimeadjustmentdisabled: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetSystemTimeAdjustment")

public actual fun getSystemTimeAdjustmentPrecise(lptimeadjustment: MutPtr<ULong>, lptimeincrement: MutPtr<ULong>, lptimeadjustmentdisabled: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetSystemTimeAdjustmentPrecise")

public actual fun getSystemTimeAsFileTime(lpsystemtimeasfiletime: MutPtr<Filetime>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetSystemTimeAsFileTime")

public actual fun getSystemTimePreciseAsFileTime(lpsystemtimeasfiletime: MutPtr<Filetime>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetSystemTimePreciseAsFileTime")

public actual fun getSystemWindowsDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetSystemWindowsDirectoryA")

public actual fun getSystemWindowsDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetSystemWindowsDirectoryW")

public actual fun getSystemWow64Directory2A(lpbuffer: Pstr, usize: UInt, imagefilemachinetype: ImageFileMachine): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetSystemWow64Directory2A")

public actual fun getSystemWow64Directory2W(lpbuffer: Pwstr, usize: UInt, imagefilemachinetype: ImageFileMachine): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetSystemWow64Directory2W")

public actual fun getSystemWow64DirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetSystemWow64DirectoryA")

public actual fun getSystemWow64DirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetSystemWow64DirectoryW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemSysteminformationGetTickCount")
private external fun wasiWindowssysWindowsWin32SystemSysteminformationGetTickCount(): Int

public actual fun getTickCount(): UInt =
    wasiWindowssysWindowsWin32SystemSysteminformationGetTickCount().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemSysteminformationGetTickCount64")
private external fun wasiWindowssysWindowsWin32SystemSysteminformationGetTickCount64(): Long

public actual fun getTickCount64(): ULong =
    wasiWindowssysWindowsWin32SystemSysteminformationGetTickCount64().toULong()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemSysteminformationGetVersion")
private external fun wasiWindowssysWindowsWin32SystemSysteminformationGetVersion(): Int

public actual fun getVersion(): UInt =
    wasiWindowssysWindowsWin32SystemSysteminformationGetVersion().toUInt()

public actual fun getVersionExA(lpversioninformation: MutPtr<Osversioninfoa>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetVersionExA")

public actual fun getVersionExW(lpversioninformation: MutPtr<Osversioninfow>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetVersionExW")

public actual fun getWindowsDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetWindowsDirectoryA")

public actual fun getWindowsDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGetWindowsDirectoryW")

public actual fun globalMemoryStatus(lpbuffer: MutPtr<Memorystatus>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGlobalMemoryStatus")

public actual fun globalMemoryStatusEx(lpbuffer: MutPtr<Memorystatusex>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationGlobalMemoryStatusEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemSysteminformationIsUserCetAvailableInEnvironment")
private external fun wasiWindowssysWindowsWin32SystemSysteminformationIsUserCetAvailableInEnvironment(usercetenvironment: Int): Int

public actual fun isUserCetAvailableInEnvironment(usercetenvironment: UserCetEnvironment): Bool =
    wasiWindowssysWindowsWin32SystemSysteminformationIsUserCetAvailableInEnvironment(usercetenvironment.toInt()).toInt()

public actual fun isWow64GuestMachineSupported(wowguestmachine: ImageFileMachine, machineissupported: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationIsWow64GuestMachineSupported")

public actual fun rtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize: MutPtr<UInt>, puldeviceformbuffersize: MutPtr<UInt>, devicefamily: Pwstr, deviceform: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationRtlConvertDeviceFamilyInfoToString")

public actual fun rtlGetDeviceFamilyInfoEnum(pulluapinfo: MutPtr<ULong>, puldevicefamily: MutPtr<Devicefamilyinfoenum>, puldeviceform: MutPtr<Devicefamilydeviceform>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationRtlGetDeviceFamilyInfoEnum")

public actual fun rtlGetProductInfo(osmajorversion: UInt, osminorversion: UInt, spmajorversion: UInt, spminorversion: UInt, returnedproducttype: MutPtr<UInt>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationRtlGetProductInfo")

public actual fun rtlGetSystemGlobalData(dataid: RtlSystemGlobalDataId, buffer: MutPtr<CVoid>, size: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationRtlGetSystemGlobalData")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemSysteminformationRtlOsDeploymentState")
private external fun wasiWindowssysWindowsWin32SystemSysteminformationRtlOsDeploymentState(flags: Int): Int

public actual fun rtlOsDeploymentState(flags: UInt): OsDeployementStateValues =
    wasiWindowssysWindowsWin32SystemSysteminformationRtlOsDeploymentState(flags.toInt()).toInt()

public actual fun rtlSwitchedVVI(versioninfo: ConstPtr<Osversioninfoexw>, typemask: UInt, conditionmask: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationRtlSwitchedVVI")

public actual fun setComputerNameA(lpcomputername: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationSetComputerNameA")

public actual fun setComputerNameEx2W(nametype: ComputerNameFormat, flags: UInt, lpbuffer: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationSetComputerNameEx2W")

public actual fun setComputerNameExA(nametype: ComputerNameFormat, lpbuffer: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationSetComputerNameExA")

public actual fun setComputerNameExW(nametype: ComputerNameFormat, lpbuffer: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationSetComputerNameExW")

public actual fun setComputerNameW(lpcomputername: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationSetComputerNameW")

public actual fun setLocalTime(lpsystemtime: ConstPtr<Systemtime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationSetLocalTime")

public actual fun setSystemTime(lpsystemtime: ConstPtr<Systemtime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationSetSystemTime")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustment")
private external fun wasiWindowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustment(dwtimeadjustment: Int, btimeadjustmentdisabled: Int): Int

public actual fun setSystemTimeAdjustment(dwtimeadjustment: UInt, btimeadjustmentdisabled: Bool): Bool =
    wasiWindowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustment(dwtimeadjustment.toInt(), btimeadjustmentdisabled).toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustmentPrecise")
private external fun wasiWindowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustmentPrecise(dwtimeadjustment: Long, btimeadjustmentdisabled: Int): Int

public actual fun setSystemTimeAdjustmentPrecise(dwtimeadjustment: ULong, btimeadjustmentdisabled: Bool): Bool =
    wasiWindowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustmentPrecise(dwtimeadjustment.toLong(), btimeadjustmentdisabled).toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemSysteminformationVerSetConditionMask")
private external fun wasiWindowssysWindowsWin32SystemSysteminformationVerSetConditionMask(conditionmask: Long, typemask: Int, condition: Int): Long

public actual fun verSetConditionMask(conditionmask: ULong, typemask: VerFlags, condition: UByte): ULong =
    wasiWindowssysWindowsWin32SystemSysteminformationVerSetConditionMask(conditionmask.toLong(), typemask.toInt(), condition.toInt()).toULong()

public actual fun verifyVersionInfoA(lpversioninformation: MutPtr<Osversioninfoexa>, dwtypemask: VerFlags, dwlconditionmask: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationVerifyVersionInfoA")

public actual fun verifyVersionInfoW(lpversioninformation: MutPtr<Osversioninfoexw>, dwtypemask: VerFlags, dwlconditionmask: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSysteminformationVerifyVersionInfoW")
