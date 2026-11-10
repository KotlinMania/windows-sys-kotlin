package io.github.kotlinmania.windowssys.windows.win32.system.systeminformation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun dnsHostnameToComputerNameExW(hostname: Pcwstr, computername: Pwstr, nsize: COpaquePointer?): Bool

public expect fun enumSystemFirmwareTables(firmwaretableprovidersignature: FirmwareTableProvider, pfirmwaretableenumbuffer: COpaquePointer?, buffersize: UInt): UInt

public expect fun getComputerNameExA(nametype: ComputerNameFormat, lpbuffer: Pstr, nsize: COpaquePointer?): Bool

public expect fun getComputerNameExW(nametype: ComputerNameFormat, lpbuffer: Pwstr, nsize: COpaquePointer?): Bool

public expect fun getDeveloperDriveEnablementState(): DeveloperDriveEnablementState

public expect fun getFirmwareType(firmwaretype: COpaquePointer?): Bool

public expect fun getIntegratedDisplaySize(sizeininches: COpaquePointer?): Hresult

public expect fun getLocalTime(lpsystemtime: COpaquePointer?)

public expect fun getLogicalProcessorInformation(buffer: COpaquePointer?, returnedlength: COpaquePointer?): Bool

public expect fun getLogicalProcessorInformationEx(relationshiptype: LogicalProcessorRelationship, buffer: COpaquePointer?, returnedlength: COpaquePointer?): Bool

public expect fun getNativeSystemInfo(lpsysteminfo: COpaquePointer?)

public expect fun getOsManufacturingMode(pbenabled: COpaquePointer?): Bool

public expect fun getOsSafeBootMode(flags: COpaquePointer?): Bool

public expect fun getPhysicallyInstalledSystemMemory(totalmemoryinkilobytes: COpaquePointer?): Bool

public expect fun getProcessorSystemCycleTime(group: UShort, buffer: COpaquePointer?, returnedlength: COpaquePointer?): Bool

public expect fun getProductInfo(dwosmajorversion: UInt, dwosminorversion: UInt, dwspmajorversion: UInt, dwspminorversion: UInt, pdwreturnedproducttype: COpaquePointer?): Bool

public expect fun getSystemCpuSetInformation(information: COpaquePointer?, bufferlength: UInt, returnedlength: COpaquePointer?, process: Handle, flags: UInt): Bool

public expect fun getSystemDEPPolicy(): DepSystemPolicyType

public expect fun getSystemDirectoryA(lpbuffer: Pstr, usize: UInt): UInt

public expect fun getSystemDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt

public expect fun getSystemFirmwareTable(firmwaretableprovidersignature: FirmwareTableProvider, firmwaretableid: UInt, pfirmwaretablebuffer: COpaquePointer?, buffersize: UInt): UInt

public expect fun getSystemInfo(lpsysteminfo: COpaquePointer?)

public expect fun getSystemLeapSecondInformation(enabled: COpaquePointer?, flags: COpaquePointer?): Bool

public expect fun getSystemTime(lpsystemtime: COpaquePointer?)

public expect fun getSystemTimeAdjustment(lptimeadjustment: COpaquePointer?, lptimeincrement: COpaquePointer?, lptimeadjustmentdisabled: COpaquePointer?): Bool

public expect fun getSystemTimeAdjustmentPrecise(lptimeadjustment: COpaquePointer?, lptimeincrement: COpaquePointer?, lptimeadjustmentdisabled: COpaquePointer?): Bool

public expect fun getSystemTimeAsFileTime(lpsystemtimeasfiletime: COpaquePointer?)

public expect fun getSystemTimePreciseAsFileTime(lpsystemtimeasfiletime: COpaquePointer?)

public expect fun getSystemWindowsDirectoryA(lpbuffer: Pstr, usize: UInt): UInt

public expect fun getSystemWindowsDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt

public expect fun getSystemWow64Directory2A(lpbuffer: Pstr, usize: UInt, imagefilemachinetype: ImageFileMachine): UInt

public expect fun getSystemWow64Directory2W(lpbuffer: Pwstr, usize: UInt, imagefilemachinetype: ImageFileMachine): UInt

public expect fun getSystemWow64DirectoryA(lpbuffer: Pstr, usize: UInt): UInt

public expect fun getSystemWow64DirectoryW(lpbuffer: Pwstr, usize: UInt): UInt

public expect fun getTickCount(): UInt

public expect fun getTickCount64(): ULong

public expect fun getVersion(): UInt

public expect fun getVersionExA(lpversioninformation: COpaquePointer?): Bool

public expect fun getVersionExW(lpversioninformation: COpaquePointer?): Bool

public expect fun getWindowsDirectoryA(lpbuffer: Pstr, usize: UInt): UInt

public expect fun getWindowsDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt

public expect fun globalMemoryStatus(lpbuffer: COpaquePointer?)

public expect fun globalMemoryStatusEx(lpbuffer: COpaquePointer?): Bool

public expect fun isUserCetAvailableInEnvironment(usercetenvironment: UserCetEnvironment): Bool

public expect fun isWow64GuestMachineSupported(wowguestmachine: ImageFileMachine, machineissupported: COpaquePointer?): Hresult

public expect fun rtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize: COpaquePointer?, puldeviceformbuffersize: COpaquePointer?, devicefamily: Pwstr, deviceform: Pwstr): UInt

public expect fun rtlGetDeviceFamilyInfoEnum(pulluapinfo: COpaquePointer?, puldevicefamily: COpaquePointer?, puldeviceform: COpaquePointer?)

public expect fun rtlGetProductInfo(osmajorversion: UInt, osminorversion: UInt, spmajorversion: UInt, spminorversion: UInt, returnedproducttype: COpaquePointer?): Boolean

public expect fun rtlGetSystemGlobalData(dataid: RtlSystemGlobalDataId, buffer: COpaquePointer?, size: UInt): UInt

public expect fun rtlOsDeploymentState(flags: UInt): OsDeployementStateValues

public expect fun rtlSwitchedVVI(versioninfo: COpaquePointer?, typemask: UInt, conditionmask: ULong): UInt

public expect fun setComputerNameA(lpcomputername: Pcstr): Bool

public expect fun setComputerNameEx2W(nametype: ComputerNameFormat, flags: UInt, lpbuffer: Pcwstr): Bool

public expect fun setComputerNameExA(nametype: ComputerNameFormat, lpbuffer: Pcstr): Bool

public expect fun setComputerNameExW(nametype: ComputerNameFormat, lpbuffer: Pcwstr): Bool

public expect fun setComputerNameW(lpcomputername: Pcwstr): Bool

public expect fun setLocalTime(lpsystemtime: COpaquePointer?): Bool

public expect fun setSystemTime(lpsystemtime: COpaquePointer?): Bool

public expect fun setSystemTimeAdjustment(dwtimeadjustment: UInt, btimeadjustmentdisabled: Bool): Bool

public expect fun setSystemTimeAdjustmentPrecise(dwtimeadjustment: ULong, btimeadjustmentdisabled: Bool): Bool

public expect fun verSetConditionMask(conditionmask: ULong, typemask: VerFlags, condition: UByte): ULong

public expect fun verifyVersionInfoA(lpversioninformation: COpaquePointer?, dwtypemask: VerFlags, dwlconditionmask: ULong): Bool

public expect fun verifyVersionInfoW(lpversioninformation: COpaquePointer?, dwtypemask: VerFlags, dwlconditionmask: ULong): Bool
