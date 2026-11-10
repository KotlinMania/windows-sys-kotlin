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

private val _windowsWin32SystemSysteminformationNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun dnsHostnameToComputerNameExW(hostname: Pcwstr, computername: Pwstr, nsize: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_dnsHostnameToComputerNameExW((hostname?.value ?: 0L).toString(), (computername?.value ?: 0L).toString(), (nsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemFirmwareTables(firmwaretableprovidersignature: FirmwareTableProvider, pfirmwaretableenumbuffer: COpaquePointer?, buffersize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_enumSystemFirmwareTables(firmwaretableprovidersignature.toInt(), (pfirmwaretableenumbuffer?.value ?: 0L).toString(), buffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComputerNameExA(nametype: ComputerNameFormat, lpbuffer: Pstr, nsize: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getComputerNameExA(nametype, (lpbuffer?.value ?: 0L).toString(), (nsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComputerNameExW(nametype: ComputerNameFormat, lpbuffer: Pwstr, nsize: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getComputerNameExW(nametype, (lpbuffer?.value ?: 0L).toString(), (nsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeveloperDriveEnablementState(): DeveloperDriveEnablementState =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getDeveloperDriveEnablementState() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFirmwareType(firmwaretype: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getFirmwareType((firmwaretype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIntegratedDisplaySize(sizeininches: COpaquePointer?): Hresult =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getIntegratedDisplaySize((sizeininches?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLocalTime(lpsystemtime: COpaquePointer?) {
    if (_windowsWin32SystemSysteminformationNapiAddon != null) {
        _windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getLocalTime((lpsystemtime?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getLogicalProcessorInformation(buffer: COpaquePointer?, returnedlength: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getLogicalProcessorInformation((buffer?.value ?: 0L).toString(), (returnedlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogicalProcessorInformationEx(relationshiptype: LogicalProcessorRelationship, buffer: COpaquePointer?, returnedlength: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getLogicalProcessorInformationEx(relationshiptype, (buffer?.value ?: 0L).toString(), (returnedlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNativeSystemInfo(lpsysteminfo: COpaquePointer?) {
    if (_windowsWin32SystemSysteminformationNapiAddon != null) {
        _windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getNativeSystemInfo((lpsysteminfo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getOsManufacturingMode(pbenabled: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getOsManufacturingMode((pbenabled?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOsSafeBootMode(flags: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getOsSafeBootMode((flags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPhysicallyInstalledSystemMemory(totalmemoryinkilobytes: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getPhysicallyInstalledSystemMemory((totalmemoryinkilobytes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessorSystemCycleTime(group: UShort, buffer: COpaquePointer?, returnedlength: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getProcessorSystemCycleTime(group.toInt(), (buffer?.value ?: 0L).toString(), (returnedlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProductInfo(dwosmajorversion: UInt, dwosminorversion: UInt, dwspmajorversion: UInt, dwspminorversion: UInt, pdwreturnedproducttype: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getProductInfo(dwosmajorversion.toInt(), dwosminorversion.toInt(), dwspmajorversion.toInt(), dwspminorversion.toInt(), (pdwreturnedproducttype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemCpuSetInformation(information: COpaquePointer?, bufferlength: UInt, returnedlength: COpaquePointer?, process: Handle, flags: UInt): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getSystemCpuSetInformation((information?.value ?: 0L).toString(), bufferlength.toInt(), (returnedlength?.value ?: 0L).toString(), (process?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDEPPolicy(): DepSystemPolicyType =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getSystemDEPPolicy() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getSystemDirectoryA((lpbuffer?.value ?: 0L).toString(), usize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getSystemDirectoryW((lpbuffer?.value ?: 0L).toString(), usize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemFirmwareTable(firmwaretableprovidersignature: FirmwareTableProvider, firmwaretableid: UInt, pfirmwaretablebuffer: COpaquePointer?, buffersize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getSystemFirmwareTable(firmwaretableprovidersignature.toInt(), firmwaretableid.toInt(), (pfirmwaretablebuffer?.value ?: 0L).toString(), buffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemInfo(lpsysteminfo: COpaquePointer?) {
    if (_windowsWin32SystemSysteminformationNapiAddon != null) {
        _windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getSystemInfo((lpsysteminfo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getSystemLeapSecondInformation(enabled: COpaquePointer?, flags: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getSystemLeapSecondInformation((enabled?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemTime(lpsystemtime: COpaquePointer?) {
    if (_windowsWin32SystemSysteminformationNapiAddon != null) {
        _windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getSystemTime((lpsystemtime?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getSystemTimeAdjustment(lptimeadjustment: COpaquePointer?, lptimeincrement: COpaquePointer?, lptimeadjustmentdisabled: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getSystemTimeAdjustment((lptimeadjustment?.value ?: 0L).toString(), (lptimeincrement?.value ?: 0L).toString(), (lptimeadjustmentdisabled?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemTimeAdjustmentPrecise(lptimeadjustment: COpaquePointer?, lptimeincrement: COpaquePointer?, lptimeadjustmentdisabled: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getSystemTimeAdjustmentPrecise((lptimeadjustment?.value ?: 0L).toString(), (lptimeincrement?.value ?: 0L).toString(), (lptimeadjustmentdisabled?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemTimeAsFileTime(lpsystemtimeasfiletime: COpaquePointer?) {
    if (_windowsWin32SystemSysteminformationNapiAddon != null) {
        _windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getSystemTimeAsFileTime((lpsystemtimeasfiletime?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getSystemTimePreciseAsFileTime(lpsystemtimeasfiletime: COpaquePointer?) {
    if (_windowsWin32SystemSysteminformationNapiAddon != null) {
        _windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getSystemTimePreciseAsFileTime((lpsystemtimeasfiletime?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getSystemWindowsDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getSystemWindowsDirectoryA((lpbuffer?.value ?: 0L).toString(), usize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemWindowsDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getSystemWindowsDirectoryW((lpbuffer?.value ?: 0L).toString(), usize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemWow64Directory2A(lpbuffer: Pstr, usize: UInt, imagefilemachinetype: ImageFileMachine): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getSystemWow64Directory2A((lpbuffer?.value ?: 0L).toString(), usize.toInt(), imagefilemachinetype.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemWow64Directory2W(lpbuffer: Pwstr, usize: UInt, imagefilemachinetype: ImageFileMachine): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getSystemWow64Directory2W((lpbuffer?.value ?: 0L).toString(), usize.toInt(), imagefilemachinetype.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemWow64DirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getSystemWow64DirectoryA((lpbuffer?.value ?: 0L).toString(), usize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemWow64DirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getSystemWow64DirectoryW((lpbuffer?.value ?: 0L).toString(), usize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTickCount(): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getTickCount() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTickCount64(): ULong =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getTickCount64() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersion(): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getVersion() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersionExA(lpversioninformation: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getVersionExA((lpversioninformation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersionExW(lpversioninformation: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getVersionExW((lpversioninformation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowsDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getWindowsDirectoryA((lpbuffer?.value ?: 0L).toString(), usize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowsDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_getWindowsDirectoryW((lpbuffer?.value ?: 0L).toString(), usize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalMemoryStatus(lpbuffer: COpaquePointer?) {
    if (_windowsWin32SystemSysteminformationNapiAddon != null) {
        _windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_globalMemoryStatus((lpbuffer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun globalMemoryStatusEx(lpbuffer: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_globalMemoryStatusEx((lpbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isUserCetAvailableInEnvironment(usercetenvironment: UserCetEnvironment): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_isUserCetAvailableInEnvironment(usercetenvironment.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWow64GuestMachineSupported(wowguestmachine: ImageFileMachine, machineissupported: COpaquePointer?): Hresult =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_isWow64GuestMachineSupported(wowguestmachine.toInt(), (machineissupported?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize: COpaquePointer?, puldeviceformbuffersize: COpaquePointer?, devicefamily: Pwstr, deviceform: Pwstr): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_rtlConvertDeviceFamilyInfoToString((puldevicefamilybuffersize?.value ?: 0L).toString(), (puldeviceformbuffersize?.value ?: 0L).toString(), (devicefamily?.value ?: 0L).toString(), (deviceform?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetDeviceFamilyInfoEnum(pulluapinfo: COpaquePointer?, puldevicefamily: COpaquePointer?, puldeviceform: COpaquePointer?) {
    if (_windowsWin32SystemSysteminformationNapiAddon != null) {
        _windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_rtlGetDeviceFamilyInfoEnum((pulluapinfo?.value ?: 0L).toString(), (puldevicefamily?.value ?: 0L).toString(), (puldeviceform?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlGetProductInfo(osmajorversion: UInt, osminorversion: UInt, spmajorversion: UInt, spminorversion: UInt, returnedproducttype: COpaquePointer?): Boolean =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_rtlGetProductInfo(osmajorversion.toInt(), osminorversion.toInt(), spmajorversion.toInt(), spminorversion.toInt(), (returnedproducttype?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetSystemGlobalData(dataid: RtlSystemGlobalDataId, buffer: COpaquePointer?, size: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_rtlGetSystemGlobalData(dataid, (buffer?.value ?: 0L).toString(), size.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlOsDeploymentState(flags: UInt): OsDeployementStateValues =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_rtlOsDeploymentState(flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSwitchedVVI(versioninfo: COpaquePointer?, typemask: UInt, conditionmask: ULong): UInt =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_rtlSwitchedVVI((versioninfo?.value ?: 0L).toString(), typemask.toInt(), conditionmask.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setComputerNameA(lpcomputername: Pcstr): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_setComputerNameA((lpcomputername?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setComputerNameEx2W(nametype: ComputerNameFormat, flags: UInt, lpbuffer: Pcwstr): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_setComputerNameEx2W(nametype, flags.toInt(), (lpbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setComputerNameExA(nametype: ComputerNameFormat, lpbuffer: Pcstr): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_setComputerNameExA(nametype, (lpbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setComputerNameExW(nametype: ComputerNameFormat, lpbuffer: Pcwstr): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_setComputerNameExW(nametype, (lpbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setComputerNameW(lpcomputername: Pcwstr): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_setComputerNameW((lpcomputername?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLocalTime(lpsystemtime: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_setLocalTime((lpsystemtime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemTime(lpsystemtime: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_setSystemTime((lpsystemtime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemTimeAdjustment(dwtimeadjustment: UInt, btimeadjustmentdisabled: Bool): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_setSystemTimeAdjustment(dwtimeadjustment.toInt(), btimeadjustmentdisabled) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemTimeAdjustmentPrecise(dwtimeadjustment: ULong, btimeadjustmentdisabled: Bool): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_setSystemTimeAdjustmentPrecise(dwtimeadjustment.toString(), btimeadjustmentdisabled) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verSetConditionMask(conditionmask: ULong, typemask: VerFlags, condition: UByte): ULong =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_verSetConditionMask(conditionmask.toString(), typemask.toInt(), condition.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyVersionInfoA(lpversioninformation: COpaquePointer?, dwtypemask: VerFlags, dwlconditionmask: ULong): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_verifyVersionInfoA((lpversioninformation?.value ?: 0L).toString(), dwtypemask.toInt(), dwlconditionmask.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyVersionInfoW(lpversioninformation: COpaquePointer?, dwtypemask: VerFlags, dwlconditionmask: ULong): Bool =
    if (_windowsWin32SystemSysteminformationNapiAddon != null) (_windowsWin32SystemSysteminformationNapiAddon.windowssys_windows_win32_system_systeminformation_verifyVersionInfoW((lpversioninformation?.value ?: 0L).toString(), dwtypemask.toInt(), dwlconditionmask.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
