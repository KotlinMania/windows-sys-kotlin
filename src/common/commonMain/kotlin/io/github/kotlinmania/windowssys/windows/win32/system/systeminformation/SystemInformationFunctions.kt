package io.github.kotlinmania.windowssys.windows.win32.system.systeminformation

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun dnsHostnameToComputerNameExW(hostname: Pcwstr, computername: Pwstr, nsize: MutPtr): Bool

public expect fun enumSystemFirmwareTables(firmwaretableprovidersignature: FirmwareTableProvider, pfirmwaretableenumbuffer: MutPtr, buffersize: UInt): UInt

public expect fun getComputerNameExA(nametype: ComputerNameFormat, lpbuffer: Pstr, nsize: MutPtr): Bool

public expect fun getComputerNameExW(nametype: ComputerNameFormat, lpbuffer: Pwstr, nsize: MutPtr): Bool

public expect fun getDeveloperDriveEnablementState(): DeveloperDriveEnablementState

public expect fun getFirmwareType(firmwaretype: MutPtr): Bool

public expect fun getIntegratedDisplaySize(sizeininches: MutPtr): Hresult

public expect fun getLocalTime(lpsystemtime: MutPtr)

public expect fun getLogicalProcessorInformation(buffer: MutPtr, returnedlength: MutPtr): Bool

public expect fun getLogicalProcessorInformationEx(relationshiptype: LogicalProcessorRelationship, buffer: MutPtr, returnedlength: MutPtr): Bool

public expect fun getNativeSystemInfo(lpsysteminfo: MutPtr)

public expect fun getOsManufacturingMode(pbenabled: MutPtr): Bool

public expect fun getOsSafeBootMode(flags: MutPtr): Bool

public expect fun getPhysicallyInstalledSystemMemory(totalmemoryinkilobytes: MutPtr): Bool

public expect fun getProcessorSystemCycleTime(group: UShort, buffer: MutPtr, returnedlength: MutPtr): Bool

public expect fun getProductInfo(dwosmajorversion: UInt, dwosminorversion: UInt, dwspmajorversion: UInt, dwspminorversion: UInt, pdwreturnedproducttype: MutPtr): Bool

public expect fun getSystemCpuSetInformation(information: MutPtr, bufferlength: UInt, returnedlength: MutPtr, process: Handle, flags: UInt): Bool

public expect fun getSystemDEPPolicy(): DepSystemPolicyType

public expect fun getSystemDirectoryA(lpbuffer: Pstr, usize: UInt): UInt

public expect fun getSystemDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt

public expect fun getSystemFirmwareTable(firmwaretableprovidersignature: FirmwareTableProvider, firmwaretableid: UInt, pfirmwaretablebuffer: MutPtr, buffersize: UInt): UInt

public expect fun getSystemInfo(lpsysteminfo: MutPtr)

public expect fun getSystemLeapSecondInformation(enabled: MutPtr, flags: MutPtr): Bool

public expect fun getSystemTime(lpsystemtime: MutPtr)

public expect fun getSystemTimeAdjustment(lptimeadjustment: MutPtr, lptimeincrement: MutPtr, lptimeadjustmentdisabled: MutPtr): Bool

public expect fun getSystemTimeAdjustmentPrecise(lptimeadjustment: MutPtr, lptimeincrement: MutPtr, lptimeadjustmentdisabled: MutPtr): Bool

public expect fun getSystemTimeAsFileTime(lpsystemtimeasfiletime: MutPtr)

public expect fun getSystemTimePreciseAsFileTime(lpsystemtimeasfiletime: MutPtr)

public expect fun getSystemWindowsDirectoryA(lpbuffer: Pstr, usize: UInt): UInt

public expect fun getSystemWindowsDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt

public expect fun getSystemWow64Directory2A(lpbuffer: Pstr, usize: UInt, imagefilemachinetype: ImageFileMachine): UInt

public expect fun getSystemWow64Directory2W(lpbuffer: Pwstr, usize: UInt, imagefilemachinetype: ImageFileMachine): UInt

public expect fun getSystemWow64DirectoryA(lpbuffer: Pstr, usize: UInt): UInt

public expect fun getSystemWow64DirectoryW(lpbuffer: Pwstr, usize: UInt): UInt

public expect fun getTickCount(): UInt

public expect fun getTickCount64(): ULong

public expect fun getVersion(): UInt

public expect fun getVersionExA(lpversioninformation: MutPtr): Bool

public expect fun getVersionExW(lpversioninformation: MutPtr): Bool

public expect fun getWindowsDirectoryA(lpbuffer: Pstr, usize: UInt): UInt

public expect fun getWindowsDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt

public expect fun globalMemoryStatus(lpbuffer: MutPtr)

public expect fun globalMemoryStatusEx(lpbuffer: MutPtr): Bool

public expect fun isUserCetAvailableInEnvironment(usercetenvironment: UserCetEnvironment): Bool

public expect fun isWow64GuestMachineSupported(wowguestmachine: ImageFileMachine, machineissupported: MutPtr): Hresult

public expect fun rtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize: MutPtr, puldeviceformbuffersize: MutPtr, devicefamily: Pwstr, deviceform: Pwstr): UInt

public expect fun rtlGetDeviceFamilyInfoEnum(pulluapinfo: MutPtr, puldevicefamily: MutPtr, puldeviceform: MutPtr)

public expect fun rtlGetProductInfo(osmajorversion: UInt, osminorversion: UInt, spmajorversion: UInt, spminorversion: UInt, returnedproducttype: MutPtr): Boolean

public expect fun rtlGetSystemGlobalData(dataid: RtlSystemGlobalDataId, buffer: MutPtr, size: UInt): UInt

public expect fun rtlOsDeploymentState(flags: UInt): OsDeployementStateValues

public expect fun rtlSwitchedVVI(versioninfo: ConstPtr, typemask: UInt, conditionmask: ULong): UInt

public expect fun setComputerNameA(lpcomputername: Pcstr): Bool

public expect fun setComputerNameEx2W(nametype: ComputerNameFormat, flags: UInt, lpbuffer: Pcwstr): Bool

public expect fun setComputerNameExA(nametype: ComputerNameFormat, lpbuffer: Pcstr): Bool

public expect fun setComputerNameExW(nametype: ComputerNameFormat, lpbuffer: Pcwstr): Bool

public expect fun setComputerNameW(lpcomputername: Pcwstr): Bool

public expect fun setLocalTime(lpsystemtime: ConstPtr): Bool

public expect fun setSystemTime(lpsystemtime: ConstPtr): Bool

public expect fun setSystemTimeAdjustment(dwtimeadjustment: UInt, btimeadjustmentdisabled: Bool): Bool

public expect fun setSystemTimeAdjustmentPrecise(dwtimeadjustment: ULong, btimeadjustmentdisabled: Bool): Bool

public expect fun verSetConditionMask(conditionmask: ULong, typemask: VerFlags, condition: UByte): ULong

public expect fun verifyVersionInfoA(lpversioninformation: MutPtr, dwtypemask: VerFlags, dwlconditionmask: ULong): Bool

public expect fun verifyVersionInfoW(lpversioninformation: MutPtr, dwtypemask: VerFlags, dwlconditionmask: ULong): Bool
