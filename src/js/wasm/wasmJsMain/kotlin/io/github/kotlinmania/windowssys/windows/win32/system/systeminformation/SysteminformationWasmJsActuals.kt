@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.systeminformation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemSysteminformationNapiAddon(): Boolean

private val _windowsWin32SystemSysteminformationNapiAvailable: Boolean = _initWindowsWin32SystemSysteminformationNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_dnsHostnameToComputerNameExW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_dnsHostnameToComputerNameExW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_enumSystemFirmwareTables(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_enumSystemFirmwareTables(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getComputerNameExA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getComputerNameExA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getComputerNameExW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getComputerNameExW(p0: Int, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getDeveloperDriveEnablementState()")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getDeveloperDriveEnablementState(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getFirmwareType(p0)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getFirmwareType(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getIntegratedDisplaySize(p0)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getIntegratedDisplaySize(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getLocalTime(p0)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getLocalTime(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getLogicalProcessorInformation(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getLogicalProcessorInformation(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getLogicalProcessorInformationEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getLogicalProcessorInformationEx(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getNativeSystemInfo(p0)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getNativeSystemInfo(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getOsManufacturingMode(p0)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getOsManufacturingMode(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getOsSafeBootMode(p0)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getOsSafeBootMode(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getPhysicallyInstalledSystemMemory(p0)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getPhysicallyInstalledSystemMemory(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getProcessorSystemCycleTime(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getProcessorSystemCycleTime(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getProductInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getProductInfo(p0: Int, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getSystemCpuSetInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getSystemCpuSetInformation(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getSystemDEPPolicy()")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getSystemDEPPolicy(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getSystemDirectoryA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getSystemDirectoryA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getSystemDirectoryW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getSystemDirectoryW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getSystemFirmwareTable(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getSystemFirmwareTable(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getSystemInfo(p0)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getSystemInfo(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getSystemLeapSecondInformation(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getSystemLeapSecondInformation(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getSystemTime(p0)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getSystemTime(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getSystemTimeAdjustment(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getSystemTimeAdjustment(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getSystemTimeAdjustmentPrecise(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getSystemTimeAdjustmentPrecise(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getSystemTimeAsFileTime(p0)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getSystemTimeAsFileTime(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getSystemTimePreciseAsFileTime(p0)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getSystemTimePreciseAsFileTime(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getSystemWindowsDirectoryA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getSystemWindowsDirectoryA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getSystemWindowsDirectoryW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getSystemWindowsDirectoryW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getSystemWow64Directory2A(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getSystemWow64Directory2A(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getSystemWow64Directory2W(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getSystemWow64Directory2W(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getSystemWow64DirectoryA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getSystemWow64DirectoryA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getSystemWow64DirectoryW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getSystemWow64DirectoryW(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getTickCount()")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getTickCount(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getTickCount64()")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getTickCount64(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getVersion()")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getVersion(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getVersionExA(p0)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getVersionExA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getVersionExW(p0)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getVersionExW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getWindowsDirectoryA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getWindowsDirectoryA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_getWindowsDirectoryW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_getWindowsDirectoryW(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_globalMemoryStatus(p0)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_globalMemoryStatus(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_globalMemoryStatusEx(p0)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_globalMemoryStatusEx(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_isUserCetAvailableInEnvironment(p0)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_isUserCetAvailableInEnvironment(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_isWow64GuestMachineSupported(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_isWow64GuestMachineSupported(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_rtlConvertDeviceFamilyInfoToString(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_rtlConvertDeviceFamilyInfoToString(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_rtlGetDeviceFamilyInfoEnum(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_rtlGetDeviceFamilyInfoEnum(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_rtlGetProductInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_rtlGetProductInfo(p0: Int, p1: Int, p2: Int, p3: Int, p4: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_rtlGetSystemGlobalData(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_rtlGetSystemGlobalData(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_rtlOsDeploymentState(p0)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_rtlOsDeploymentState(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_rtlSwitchedVVI(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_rtlSwitchedVVI(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_setComputerNameA(p0)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_setComputerNameA(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_setComputerNameEx2W(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_setComputerNameEx2W(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_setComputerNameExA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_setComputerNameExA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_setComputerNameExW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_setComputerNameExW(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_setComputerNameW(p0)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_setComputerNameW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_setLocalTime(p0)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_setLocalTime(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_setSystemTime(p0)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_setSystemTime(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_setSystemTimeAdjustment(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_setSystemTimeAdjustment(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_setSystemTimeAdjustmentPrecise(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_setSystemTimeAdjustmentPrecise(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_verSetConditionMask(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_verSetConditionMask(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_verifyVersionInfoA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_verifyVersionInfoA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_systeminformation_verifyVersionInfoW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_systeminformation_verifyVersionInfoW(p0: String, p1: Int, p2: String): Int

public actual fun dnsHostnameToComputerNameExW(hostname: Pcwstr, computername: Pwstr, nsize: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_dnsHostnameToComputerNameExW((hostname?.value ?: 0L).toString(), (computername?.value ?: 0L).toString(), (nsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemFirmwareTables(firmwaretableprovidersignature: FirmwareTableProvider, pfirmwaretableenumbuffer: COpaquePointer?, buffersize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_enumSystemFirmwareTables(firmwaretableprovidersignature.toInt(), (pfirmwaretableenumbuffer?.value ?: 0L).toString(), buffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComputerNameExA(nametype: ComputerNameFormat, lpbuffer: Pstr, nsize: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getComputerNameExA(nametype, (lpbuffer?.value ?: 0L).toString(), (nsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComputerNameExW(nametype: ComputerNameFormat, lpbuffer: Pwstr, nsize: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getComputerNameExW(nametype, (lpbuffer?.value ?: 0L).toString(), (nsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeveloperDriveEnablementState(): DeveloperDriveEnablementState =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getDeveloperDriveEnablementState() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFirmwareType(firmwaretype: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getFirmwareType((firmwaretype?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIntegratedDisplaySize(sizeininches: COpaquePointer?): Hresult =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getIntegratedDisplaySize((sizeininches?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLocalTime(lpsystemtime: COpaquePointer?) {
    if (_windowsWin32SystemSysteminformationNapiAvailable) {
        _wasm_windowssys_windows_win32_system_systeminformation_getLocalTime((lpsystemtime?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getLogicalProcessorInformation(buffer: COpaquePointer?, returnedlength: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getLogicalProcessorInformation((buffer?.value ?: 0L).toString(), (returnedlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogicalProcessorInformationEx(relationshiptype: LogicalProcessorRelationship, buffer: COpaquePointer?, returnedlength: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getLogicalProcessorInformationEx(relationshiptype, (buffer?.value ?: 0L).toString(), (returnedlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNativeSystemInfo(lpsysteminfo: COpaquePointer?) {
    if (_windowsWin32SystemSysteminformationNapiAvailable) {
        _wasm_windowssys_windows_win32_system_systeminformation_getNativeSystemInfo((lpsysteminfo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getOsManufacturingMode(pbenabled: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getOsManufacturingMode((pbenabled?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOsSafeBootMode(flags: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getOsSafeBootMode((flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPhysicallyInstalledSystemMemory(totalmemoryinkilobytes: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getPhysicallyInstalledSystemMemory((totalmemoryinkilobytes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessorSystemCycleTime(group: UShort, buffer: COpaquePointer?, returnedlength: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getProcessorSystemCycleTime(group.toInt(), (buffer?.value ?: 0L).toString(), (returnedlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProductInfo(dwosmajorversion: UInt, dwosminorversion: UInt, dwspmajorversion: UInt, dwspminorversion: UInt, pdwreturnedproducttype: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getProductInfo(dwosmajorversion.toInt(), dwosminorversion.toInt(), dwspmajorversion.toInt(), dwspminorversion.toInt(), (pdwreturnedproducttype?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemCpuSetInformation(information: COpaquePointer?, bufferlength: UInt, returnedlength: COpaquePointer?, process: Handle, flags: UInt): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getSystemCpuSetInformation((information?.value ?: 0L).toString(), bufferlength.toInt(), (returnedlength?.value ?: 0L).toString(), (process?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDEPPolicy(): DepSystemPolicyType =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getSystemDEPPolicy() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getSystemDirectoryA((lpbuffer?.value ?: 0L).toString(), usize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getSystemDirectoryW((lpbuffer?.value ?: 0L).toString(), usize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemFirmwareTable(firmwaretableprovidersignature: FirmwareTableProvider, firmwaretableid: UInt, pfirmwaretablebuffer: COpaquePointer?, buffersize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getSystemFirmwareTable(firmwaretableprovidersignature.toInt(), firmwaretableid.toInt(), (pfirmwaretablebuffer?.value ?: 0L).toString(), buffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemInfo(lpsysteminfo: COpaquePointer?) {
    if (_windowsWin32SystemSysteminformationNapiAvailable) {
        _wasm_windowssys_windows_win32_system_systeminformation_getSystemInfo((lpsysteminfo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getSystemLeapSecondInformation(enabled: COpaquePointer?, flags: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getSystemLeapSecondInformation((enabled?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemTime(lpsystemtime: COpaquePointer?) {
    if (_windowsWin32SystemSysteminformationNapiAvailable) {
        _wasm_windowssys_windows_win32_system_systeminformation_getSystemTime((lpsystemtime?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getSystemTimeAdjustment(lptimeadjustment: COpaquePointer?, lptimeincrement: COpaquePointer?, lptimeadjustmentdisabled: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getSystemTimeAdjustment((lptimeadjustment?.value ?: 0L).toString(), (lptimeincrement?.value ?: 0L).toString(), (lptimeadjustmentdisabled?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemTimeAdjustmentPrecise(lptimeadjustment: COpaquePointer?, lptimeincrement: COpaquePointer?, lptimeadjustmentdisabled: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getSystemTimeAdjustmentPrecise((lptimeadjustment?.value ?: 0L).toString(), (lptimeincrement?.value ?: 0L).toString(), (lptimeadjustmentdisabled?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemTimeAsFileTime(lpsystemtimeasfiletime: COpaquePointer?) {
    if (_windowsWin32SystemSysteminformationNapiAvailable) {
        _wasm_windowssys_windows_win32_system_systeminformation_getSystemTimeAsFileTime((lpsystemtimeasfiletime?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getSystemTimePreciseAsFileTime(lpsystemtimeasfiletime: COpaquePointer?) {
    if (_windowsWin32SystemSysteminformationNapiAvailable) {
        _wasm_windowssys_windows_win32_system_systeminformation_getSystemTimePreciseAsFileTime((lpsystemtimeasfiletime?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getSystemWindowsDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getSystemWindowsDirectoryA((lpbuffer?.value ?: 0L).toString(), usize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemWindowsDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getSystemWindowsDirectoryW((lpbuffer?.value ?: 0L).toString(), usize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemWow64Directory2A(lpbuffer: Pstr, usize: UInt, imagefilemachinetype: ImageFileMachine): UInt =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getSystemWow64Directory2A((lpbuffer?.value ?: 0L).toString(), usize.toInt(), imagefilemachinetype.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemWow64Directory2W(lpbuffer: Pwstr, usize: UInt, imagefilemachinetype: ImageFileMachine): UInt =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getSystemWow64Directory2W((lpbuffer?.value ?: 0L).toString(), usize.toInt(), imagefilemachinetype.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemWow64DirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getSystemWow64DirectoryA((lpbuffer?.value ?: 0L).toString(), usize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemWow64DirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getSystemWow64DirectoryW((lpbuffer?.value ?: 0L).toString(), usize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTickCount(): UInt =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getTickCount().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTickCount64(): ULong =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getTickCount64().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersion(): UInt =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getVersion().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersionExA(lpversioninformation: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getVersionExA((lpversioninformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersionExW(lpversioninformation: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getVersionExW((lpversioninformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowsDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getWindowsDirectoryA((lpbuffer?.value ?: 0L).toString(), usize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowsDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_getWindowsDirectoryW((lpbuffer?.value ?: 0L).toString(), usize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalMemoryStatus(lpbuffer: COpaquePointer?) {
    if (_windowsWin32SystemSysteminformationNapiAvailable) {
        _wasm_windowssys_windows_win32_system_systeminformation_globalMemoryStatus((lpbuffer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun globalMemoryStatusEx(lpbuffer: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_globalMemoryStatusEx((lpbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isUserCetAvailableInEnvironment(usercetenvironment: UserCetEnvironment): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_isUserCetAvailableInEnvironment(usercetenvironment.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWow64GuestMachineSupported(wowguestmachine: ImageFileMachine, machineissupported: COpaquePointer?): Hresult =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_isWow64GuestMachineSupported(wowguestmachine.toInt(), (machineissupported?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize: COpaquePointer?, puldeviceformbuffersize: COpaquePointer?, devicefamily: Pwstr, deviceform: Pwstr): UInt =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_rtlConvertDeviceFamilyInfoToString((puldevicefamilybuffersize?.value ?: 0L).toString(), (puldeviceformbuffersize?.value ?: 0L).toString(), (devicefamily?.value ?: 0L).toString(), (deviceform?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetDeviceFamilyInfoEnum(pulluapinfo: COpaquePointer?, puldevicefamily: COpaquePointer?, puldeviceform: COpaquePointer?) {
    if (_windowsWin32SystemSysteminformationNapiAvailable) {
        _wasm_windowssys_windows_win32_system_systeminformation_rtlGetDeviceFamilyInfoEnum((pulluapinfo?.value ?: 0L).toString(), (puldevicefamily?.value ?: 0L).toString(), (puldeviceform?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlGetProductInfo(osmajorversion: UInt, osminorversion: UInt, spmajorversion: UInt, spminorversion: UInt, returnedproducttype: COpaquePointer?): Boolean =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_rtlGetProductInfo(osmajorversion.toInt(), osminorversion.toInt(), spmajorversion.toInt(), spminorversion.toInt(), (returnedproducttype?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetSystemGlobalData(dataid: RtlSystemGlobalDataId, buffer: COpaquePointer?, size: UInt): UInt =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_rtlGetSystemGlobalData(dataid, (buffer?.value ?: 0L).toString(), size.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlOsDeploymentState(flags: UInt): OsDeployementStateValues =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_rtlOsDeploymentState(flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSwitchedVVI(versioninfo: COpaquePointer?, typemask: UInt, conditionmask: ULong): UInt =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_rtlSwitchedVVI((versioninfo?.value ?: 0L).toString(), typemask.toInt(), conditionmask.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setComputerNameA(lpcomputername: Pcstr): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_setComputerNameA((lpcomputername?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setComputerNameEx2W(nametype: ComputerNameFormat, flags: UInt, lpbuffer: Pcwstr): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_setComputerNameEx2W(nametype, flags.toInt(), (lpbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setComputerNameExA(nametype: ComputerNameFormat, lpbuffer: Pcstr): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_setComputerNameExA(nametype, (lpbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setComputerNameExW(nametype: ComputerNameFormat, lpbuffer: Pcwstr): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_setComputerNameExW(nametype, (lpbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setComputerNameW(lpcomputername: Pcwstr): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_setComputerNameW((lpcomputername?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLocalTime(lpsystemtime: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_setLocalTime((lpsystemtime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemTime(lpsystemtime: COpaquePointer?): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_setSystemTime((lpsystemtime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemTimeAdjustment(dwtimeadjustment: UInt, btimeadjustmentdisabled: Bool): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_setSystemTimeAdjustment(dwtimeadjustment.toInt(), btimeadjustmentdisabled) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemTimeAdjustmentPrecise(dwtimeadjustment: ULong, btimeadjustmentdisabled: Bool): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_setSystemTimeAdjustmentPrecise(dwtimeadjustment.toString(), btimeadjustmentdisabled) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verSetConditionMask(conditionmask: ULong, typemask: VerFlags, condition: UByte): ULong =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_verSetConditionMask(conditionmask.toString(), typemask.toInt(), condition.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyVersionInfoA(lpversioninformation: COpaquePointer?, dwtypemask: VerFlags, dwlconditionmask: ULong): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_verifyVersionInfoA((lpversioninformation?.value ?: 0L).toString(), dwtypemask.toInt(), dwlconditionmask.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyVersionInfoW(lpversioninformation: COpaquePointer?, dwtypemask: VerFlags, dwlconditionmask: ULong): Bool =
    if (_windowsWin32SystemSysteminformationNapiAvailable) _wasm_windowssys_windows_win32_system_systeminformation_verifyVersionInfoW((lpversioninformation?.value ?: 0L).toString(), dwtypemask.toInt(), dwlconditionmask.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
