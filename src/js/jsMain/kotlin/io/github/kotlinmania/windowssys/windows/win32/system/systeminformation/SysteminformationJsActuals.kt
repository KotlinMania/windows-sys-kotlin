@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32SystemSysteminformationNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun dnsHostnameToComputerNameExW(hostname: Pcwstr, computername: Pwstr, nsize: MutPtr<UInt>): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationDnsHostnameToComputerNameExW(hostname.rawAddress.toString(), computername.rawAddress.toString(), nsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemFirmwareTables(firmwaretableprovidersignature: FirmwareTableProvider, pfirmwaretableenumbuffer: MutPtr<UByte>, buffersize: UInt): UInt =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationEnumSystemFirmwareTables(firmwaretableprovidersignature.toInt(), pfirmwaretableenumbuffer.rawAddress.toString(), buffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComputerNameExA(nametype: ComputerNameFormat, lpbuffer: Pstr, nsize: MutPtr<UInt>): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetComputerNameExA(nametype, lpbuffer.rawAddress.toString(), nsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComputerNameExW(nametype: ComputerNameFormat, lpbuffer: Pwstr, nsize: MutPtr<UInt>): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetComputerNameExW(nametype, lpbuffer.rawAddress.toString(), nsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeveloperDriveEnablementState(): DeveloperDriveEnablementState =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetDeveloperDriveEnablementState() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFirmwareType(firmwaretype: MutPtr<FirmwareType>): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetFirmwareType(firmwaretype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIntegratedDisplaySize(sizeininches: MutPtr<Double>): Hresult =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetIntegratedDisplaySize(sizeininches.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLocalTime(lpsystemtime: MutPtr<Systemtime>) {
    if (windowsWin32SystemSysteminformationNapiAddon != null) {
        windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetLocalTime(lpsystemtime.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getLogicalProcessorInformation(buffer: MutPtr<SystemLogicalProcessorInformation>, returnedlength: MutPtr<UInt>): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetLogicalProcessorInformation(buffer.rawAddress.toString(), returnedlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogicalProcessorInformationEx(relationshiptype: LogicalProcessorRelationship, buffer: MutPtr<SystemLogicalProcessorInformationEx>, returnedlength: MutPtr<UInt>): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetLogicalProcessorInformationEx(relationshiptype, buffer.rawAddress.toString(), returnedlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNativeSystemInfo(lpsysteminfo: MutPtr<SystemInfo>) {
    if (windowsWin32SystemSysteminformationNapiAddon != null) {
        windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetNativeSystemInfo(lpsysteminfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getOsManufacturingMode(pbenabled: MutPtr<Bool>): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetOsManufacturingMode(pbenabled.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOsSafeBootMode(flags: MutPtr<UInt>): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetOsSafeBootMode(flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPhysicallyInstalledSystemMemory(totalmemoryinkilobytes: MutPtr<ULong>): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetPhysicallyInstalledSystemMemory(totalmemoryinkilobytes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessorSystemCycleTime(group: UShort, buffer: MutPtr<SystemProcessorCycleTimeInformation>, returnedlength: MutPtr<UInt>): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetProcessorSystemCycleTime(group.toInt(), buffer.rawAddress.toString(), returnedlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProductInfo(dwosmajorversion: UInt, dwosminorversion: UInt, dwspmajorversion: UInt, dwspminorversion: UInt, pdwreturnedproducttype: MutPtr<OsProductType>): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetProductInfo(dwosmajorversion.toInt(), dwosminorversion.toInt(), dwspmajorversion.toInt(), dwspminorversion.toInt(), pdwreturnedproducttype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemCpuSetInformation(information: MutPtr<SystemCpuSetInformation>, bufferlength: UInt, returnedlength: MutPtr<UInt>, process: Handle, flags: UInt): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetSystemCpuSetInformation(information.rawAddress.toString(), bufferlength.toInt(), returnedlength.rawAddress.toString(), process.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDEPPolicy(): DepSystemPolicyType =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetSystemDEPPolicy() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetSystemDirectoryA(lpbuffer.rawAddress.toString(), usize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetSystemDirectoryW(lpbuffer.rawAddress.toString(), usize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemFirmwareTable(firmwaretableprovidersignature: FirmwareTableProvider, firmwaretableid: UInt, pfirmwaretablebuffer: MutPtr<UByte>, buffersize: UInt): UInt =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetSystemFirmwareTable(firmwaretableprovidersignature.toInt(), firmwaretableid.toInt(), pfirmwaretablebuffer.rawAddress.toString(), buffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemInfo(lpsysteminfo: MutPtr<SystemInfo>) {
    if (windowsWin32SystemSysteminformationNapiAddon != null) {
        windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetSystemInfo(lpsysteminfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getSystemLeapSecondInformation(enabled: MutPtr<Bool>, flags: MutPtr<UInt>): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetSystemLeapSecondInformation(enabled.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemTime(lpsystemtime: MutPtr<Systemtime>) {
    if (windowsWin32SystemSysteminformationNapiAddon != null) {
        windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetSystemTime(lpsystemtime.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getSystemTimeAdjustment(lptimeadjustment: MutPtr<UInt>, lptimeincrement: MutPtr<UInt>, lptimeadjustmentdisabled: MutPtr<Bool>): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetSystemTimeAdjustment(lptimeadjustment.rawAddress.toString(), lptimeincrement.rawAddress.toString(), lptimeadjustmentdisabled.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemTimeAdjustmentPrecise(lptimeadjustment: MutPtr<ULong>, lptimeincrement: MutPtr<ULong>, lptimeadjustmentdisabled: MutPtr<Bool>): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetSystemTimeAdjustmentPrecise(lptimeadjustment.rawAddress.toString(), lptimeincrement.rawAddress.toString(), lptimeadjustmentdisabled.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemTimeAsFileTime(lpsystemtimeasfiletime: MutPtr<Filetime>) {
    if (windowsWin32SystemSysteminformationNapiAddon != null) {
        windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetSystemTimeAsFileTime(lpsystemtimeasfiletime.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getSystemTimePreciseAsFileTime(lpsystemtimeasfiletime: MutPtr<Filetime>) {
    if (windowsWin32SystemSysteminformationNapiAddon != null) {
        windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetSystemTimePreciseAsFileTime(lpsystemtimeasfiletime.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getSystemWindowsDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetSystemWindowsDirectoryA(lpbuffer.rawAddress.toString(), usize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemWindowsDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetSystemWindowsDirectoryW(lpbuffer.rawAddress.toString(), usize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemWow64Directory2A(lpbuffer: Pstr, usize: UInt, imagefilemachinetype: ImageFileMachine): UInt =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetSystemWow64Directory2A(lpbuffer.rawAddress.toString(), usize.toInt(), imagefilemachinetype.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemWow64Directory2W(lpbuffer: Pwstr, usize: UInt, imagefilemachinetype: ImageFileMachine): UInt =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetSystemWow64Directory2W(lpbuffer.rawAddress.toString(), usize.toInt(), imagefilemachinetype.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemWow64DirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetSystemWow64DirectoryA(lpbuffer.rawAddress.toString(), usize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemWow64DirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetSystemWow64DirectoryW(lpbuffer.rawAddress.toString(), usize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTickCount(): UInt =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetTickCount() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTickCount64(): ULong =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetTickCount64() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersion(): UInt =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetVersion() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersionExA(lpversioninformation: MutPtr<Osversioninfoa>): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetVersionExA(lpversioninformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersionExW(lpversioninformation: MutPtr<Osversioninfow>): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetVersionExW(lpversioninformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowsDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetWindowsDirectoryA(lpbuffer.rawAddress.toString(), usize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowsDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGetWindowsDirectoryW(lpbuffer.rawAddress.toString(), usize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalMemoryStatus(lpbuffer: MutPtr<Memorystatus>) {
    if (windowsWin32SystemSysteminformationNapiAddon != null) {
        windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGlobalMemoryStatus(lpbuffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun globalMemoryStatusEx(lpbuffer: MutPtr<Memorystatusex>): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationGlobalMemoryStatusEx(lpbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isUserCetAvailableInEnvironment(usercetenvironment: UserCetEnvironment): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationIsUserCetAvailableInEnvironment(usercetenvironment.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWow64GuestMachineSupported(wowguestmachine: ImageFileMachine, machineissupported: MutPtr<Bool>): Hresult =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationIsWow64GuestMachineSupported(wowguestmachine.toInt(), machineissupported.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize: MutPtr<UInt>, puldeviceformbuffersize: MutPtr<UInt>, devicefamily: Pwstr, deviceform: Pwstr): UInt =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationRtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize.rawAddress.toString(), puldeviceformbuffersize.rawAddress.toString(), devicefamily.rawAddress.toString(), deviceform.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetDeviceFamilyInfoEnum(pulluapinfo: MutPtr<ULong>, puldevicefamily: MutPtr<Devicefamilyinfoenum>, puldeviceform: MutPtr<Devicefamilydeviceform>) {
    if (windowsWin32SystemSysteminformationNapiAddon != null) {
        windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationRtlGetDeviceFamilyInfoEnum(pulluapinfo.rawAddress.toString(), puldevicefamily.rawAddress.toString(), puldeviceform.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlGetProductInfo(osmajorversion: UInt, osminorversion: UInt, spmajorversion: UInt, spminorversion: UInt, returnedproducttype: MutPtr<UInt>): Boolean =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationRtlGetProductInfo(osmajorversion.toInt(), osminorversion.toInt(), spmajorversion.toInt(), spminorversion.toInt(), returnedproducttype.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetSystemGlobalData(dataid: RtlSystemGlobalDataId, buffer: MutPtr<CVoid>, size: UInt): UInt =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationRtlGetSystemGlobalData(dataid, buffer.rawAddress.toString(), size.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlOsDeploymentState(flags: UInt): OsDeployementStateValues =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationRtlOsDeploymentState(flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSwitchedVVI(versioninfo: ConstPtr<Osversioninfoexw>, typemask: UInt, conditionmask: ULong): UInt =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationRtlSwitchedVVI(versioninfo.rawAddress.toString(), typemask.toInt(), conditionmask.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setComputerNameA(lpcomputername: Pcstr): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationSetComputerNameA(lpcomputername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setComputerNameEx2W(nametype: ComputerNameFormat, flags: UInt, lpbuffer: Pcwstr): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationSetComputerNameEx2W(nametype, flags.toInt(), lpbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setComputerNameExA(nametype: ComputerNameFormat, lpbuffer: Pcstr): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationSetComputerNameExA(nametype, lpbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setComputerNameExW(nametype: ComputerNameFormat, lpbuffer: Pcwstr): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationSetComputerNameExW(nametype, lpbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setComputerNameW(lpcomputername: Pcwstr): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationSetComputerNameW(lpcomputername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLocalTime(lpsystemtime: ConstPtr<Systemtime>): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationSetLocalTime(lpsystemtime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemTime(lpsystemtime: ConstPtr<Systemtime>): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationSetSystemTime(lpsystemtime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemTimeAdjustment(dwtimeadjustment: UInt, btimeadjustmentdisabled: Bool): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustment(dwtimeadjustment.toInt(), btimeadjustmentdisabled) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemTimeAdjustmentPrecise(dwtimeadjustment: ULong, btimeadjustmentdisabled: Bool): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustmentPrecise(dwtimeadjustment.toString(), btimeadjustmentdisabled) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verSetConditionMask(conditionmask: ULong, typemask: VerFlags, condition: UByte): ULong =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationVerSetConditionMask(conditionmask.toString(), typemask.toInt(), condition.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyVersionInfoA(lpversioninformation: MutPtr<Osversioninfoexa>, dwtypemask: VerFlags, dwlconditionmask: ULong): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationVerifyVersionInfoA(lpversioninformation.rawAddress.toString(), dwtypemask.toInt(), dwlconditionmask.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyVersionInfoW(lpversioninformation: MutPtr<Osversioninfoexw>, dwtypemask: VerFlags, dwlconditionmask: ULong): Bool =
    if (windowsWin32SystemSysteminformationNapiAddon != null) (windowsWin32SystemSysteminformationNapiAddon.windowssysWindowsWin32SystemSysteminformationVerifyVersionInfoW(lpversioninformation.rawAddress.toString(), dwtypemask.toInt(), dwlconditionmask.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
