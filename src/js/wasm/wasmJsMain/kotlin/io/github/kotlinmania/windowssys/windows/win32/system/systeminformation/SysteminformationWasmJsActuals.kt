@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemSysteminformationNapiAddon(): Boolean

private val windowsWin32SystemSysteminformationNapiAvailable: Boolean = initWindowsWin32SystemSysteminformationNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationDnsHostnameToComputerNameExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationDnsHostnameToComputerNameExW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationEnumSystemFirmwareTables(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationEnumSystemFirmwareTables(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetComputerNameExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetComputerNameExA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetComputerNameExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetComputerNameExW(p0: Int, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetDeveloperDriveEnablementState()")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetDeveloperDriveEnablementState(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetFirmwareType(p0)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetFirmwareType(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetIntegratedDisplaySize(p0)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetIntegratedDisplaySize(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetLocalTime(p0)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetLocalTime(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetLogicalProcessorInformation(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetLogicalProcessorInformation(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetLogicalProcessorInformationEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetLogicalProcessorInformationEx(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetNativeSystemInfo(p0)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetNativeSystemInfo(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetOsManufacturingMode(p0)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetOsManufacturingMode(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetOsSafeBootMode(p0)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetOsSafeBootMode(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetPhysicallyInstalledSystemMemory(p0)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetPhysicallyInstalledSystemMemory(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetProcessorSystemCycleTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetProcessorSystemCycleTime(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetProductInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetProductInfo(p0: Int, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetSystemCpuSetInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetSystemCpuSetInformation(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetSystemDEPPolicy()")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetSystemDEPPolicy(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetSystemDirectoryA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetSystemDirectoryA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetSystemDirectoryW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetSystemDirectoryW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetSystemFirmwareTable(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetSystemFirmwareTable(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetSystemInfo(p0)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetSystemInfo(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetSystemLeapSecondInformation(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetSystemLeapSecondInformation(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetSystemTime(p0)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetSystemTime(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetSystemTimeAdjustment(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetSystemTimeAdjustment(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetSystemTimeAdjustmentPrecise(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetSystemTimeAdjustmentPrecise(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetSystemTimeAsFileTime(p0)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetSystemTimeAsFileTime(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetSystemTimePreciseAsFileTime(p0)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetSystemTimePreciseAsFileTime(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetSystemWindowsDirectoryA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetSystemWindowsDirectoryA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetSystemWindowsDirectoryW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetSystemWindowsDirectoryW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetSystemWow64Directory2A(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetSystemWow64Directory2A(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetSystemWow64Directory2W(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetSystemWow64Directory2W(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetSystemWow64DirectoryA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetSystemWow64DirectoryA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetSystemWow64DirectoryW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetSystemWow64DirectoryW(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetTickCount()")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetTickCount(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetTickCount64()")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetTickCount64(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetVersion()")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetVersion(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetVersionExA(p0)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetVersionExA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetVersionExW(p0)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetVersionExW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetWindowsDirectoryA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetWindowsDirectoryA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGetWindowsDirectoryW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGetWindowsDirectoryW(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGlobalMemoryStatus(p0)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGlobalMemoryStatus(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationGlobalMemoryStatusEx(p0)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationGlobalMemoryStatusEx(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationIsUserCetAvailableInEnvironment(p0)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationIsUserCetAvailableInEnvironment(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationIsWow64GuestMachineSupported(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationIsWow64GuestMachineSupported(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationRtlConvertDeviceFamilyInfoToString(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationRtlConvertDeviceFamilyInfoToString(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationRtlGetDeviceFamilyInfoEnum(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationRtlGetDeviceFamilyInfoEnum(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationRtlGetProductInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationRtlGetProductInfo(p0: Int, p1: Int, p2: Int, p3: Int, p4: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationRtlGetSystemGlobalData(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationRtlGetSystemGlobalData(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationRtlOsDeploymentState(p0)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationRtlOsDeploymentState(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationRtlSwitchedVVI(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationRtlSwitchedVVI(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationSetComputerNameA(p0)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationSetComputerNameA(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationSetComputerNameEx2W(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationSetComputerNameEx2W(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationSetComputerNameExA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationSetComputerNameExA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationSetComputerNameExW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationSetComputerNameExW(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationSetComputerNameW(p0)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationSetComputerNameW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationSetLocalTime(p0)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationSetLocalTime(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationSetSystemTime(p0)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationSetSystemTime(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustment(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustment(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustmentPrecise(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustmentPrecise(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationVerSetConditionMask(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationVerSetConditionMask(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationVerifyVersionInfoA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationVerifyVersionInfoA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSysteminformationVerifyVersionInfoW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSysteminformationVerifyVersionInfoW(p0: String, p1: Int, p2: String): Int

public actual fun dnsHostnameToComputerNameExW(hostname: Pcwstr, computername: Pwstr, nsize: MutPtr<UInt>): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationDnsHostnameToComputerNameExW(hostname.rawAddress.toString(), computername.rawAddress.toString(), nsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemFirmwareTables(firmwaretableprovidersignature: FirmwareTableProvider, pfirmwaretableenumbuffer: MutPtr<UByte>, buffersize: UInt): UInt =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationEnumSystemFirmwareTables(firmwaretableprovidersignature.toInt(), pfirmwaretableenumbuffer.rawAddress.toString(), buffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComputerNameExA(nametype: ComputerNameFormat, lpbuffer: Pstr, nsize: MutPtr<UInt>): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetComputerNameExA(nametype, lpbuffer.rawAddress.toString(), nsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComputerNameExW(nametype: ComputerNameFormat, lpbuffer: Pwstr, nsize: MutPtr<UInt>): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetComputerNameExW(nametype, lpbuffer.rawAddress.toString(), nsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeveloperDriveEnablementState(): DeveloperDriveEnablementState =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetDeveloperDriveEnablementState() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFirmwareType(firmwaretype: MutPtr<FirmwareType>): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetFirmwareType(firmwaretype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIntegratedDisplaySize(sizeininches: MutPtr<Double>): Hresult =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetIntegratedDisplaySize(sizeininches.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLocalTime(lpsystemtime: MutPtr<Systemtime>) {
    if (windowsWin32SystemSysteminformationNapiAvailable) {
        wasmWindowssysWindowsWin32SystemSysteminformationGetLocalTime(lpsystemtime.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getLogicalProcessorInformation(buffer: MutPtr<SystemLogicalProcessorInformation>, returnedlength: MutPtr<UInt>): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetLogicalProcessorInformation(buffer.rawAddress.toString(), returnedlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogicalProcessorInformationEx(relationshiptype: LogicalProcessorRelationship, buffer: MutPtr<SystemLogicalProcessorInformationEx>, returnedlength: MutPtr<UInt>): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetLogicalProcessorInformationEx(relationshiptype, buffer.rawAddress.toString(), returnedlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNativeSystemInfo(lpsysteminfo: MutPtr<SystemInfo>) {
    if (windowsWin32SystemSysteminformationNapiAvailable) {
        wasmWindowssysWindowsWin32SystemSysteminformationGetNativeSystemInfo(lpsysteminfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getOsManufacturingMode(pbenabled: MutPtr<Bool>): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetOsManufacturingMode(pbenabled.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOsSafeBootMode(flags: MutPtr<UInt>): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetOsSafeBootMode(flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPhysicallyInstalledSystemMemory(totalmemoryinkilobytes: MutPtr<ULong>): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetPhysicallyInstalledSystemMemory(totalmemoryinkilobytes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessorSystemCycleTime(group: UShort, buffer: MutPtr<SystemProcessorCycleTimeInformation>, returnedlength: MutPtr<UInt>): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetProcessorSystemCycleTime(group.toInt(), buffer.rawAddress.toString(), returnedlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProductInfo(dwosmajorversion: UInt, dwosminorversion: UInt, dwspmajorversion: UInt, dwspminorversion: UInt, pdwreturnedproducttype: MutPtr<OsProductType>): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetProductInfo(dwosmajorversion.toInt(), dwosminorversion.toInt(), dwspmajorversion.toInt(), dwspminorversion.toInt(), pdwreturnedproducttype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemCpuSetInformation(information: MutPtr<SystemCpuSetInformation>, bufferlength: UInt, returnedlength: MutPtr<UInt>, process: Handle, flags: UInt): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetSystemCpuSetInformation(information.rawAddress.toString(), bufferlength.toInt(), returnedlength.rawAddress.toString(), process.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDEPPolicy(): DepSystemPolicyType =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetSystemDEPPolicy() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetSystemDirectoryA(lpbuffer.rawAddress.toString(), usize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetSystemDirectoryW(lpbuffer.rawAddress.toString(), usize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemFirmwareTable(firmwaretableprovidersignature: FirmwareTableProvider, firmwaretableid: UInt, pfirmwaretablebuffer: MutPtr<UByte>, buffersize: UInt): UInt =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetSystemFirmwareTable(firmwaretableprovidersignature.toInt(), firmwaretableid.toInt(), pfirmwaretablebuffer.rawAddress.toString(), buffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemInfo(lpsysteminfo: MutPtr<SystemInfo>) {
    if (windowsWin32SystemSysteminformationNapiAvailable) {
        wasmWindowssysWindowsWin32SystemSysteminformationGetSystemInfo(lpsysteminfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getSystemLeapSecondInformation(enabled: MutPtr<Bool>, flags: MutPtr<UInt>): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetSystemLeapSecondInformation(enabled.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemTime(lpsystemtime: MutPtr<Systemtime>) {
    if (windowsWin32SystemSysteminformationNapiAvailable) {
        wasmWindowssysWindowsWin32SystemSysteminformationGetSystemTime(lpsystemtime.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getSystemTimeAdjustment(lptimeadjustment: MutPtr<UInt>, lptimeincrement: MutPtr<UInt>, lptimeadjustmentdisabled: MutPtr<Bool>): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetSystemTimeAdjustment(lptimeadjustment.rawAddress.toString(), lptimeincrement.rawAddress.toString(), lptimeadjustmentdisabled.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemTimeAdjustmentPrecise(lptimeadjustment: MutPtr<ULong>, lptimeincrement: MutPtr<ULong>, lptimeadjustmentdisabled: MutPtr<Bool>): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetSystemTimeAdjustmentPrecise(lptimeadjustment.rawAddress.toString(), lptimeincrement.rawAddress.toString(), lptimeadjustmentdisabled.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemTimeAsFileTime(lpsystemtimeasfiletime: MutPtr<Filetime>) {
    if (windowsWin32SystemSysteminformationNapiAvailable) {
        wasmWindowssysWindowsWin32SystemSysteminformationGetSystemTimeAsFileTime(lpsystemtimeasfiletime.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getSystemTimePreciseAsFileTime(lpsystemtimeasfiletime: MutPtr<Filetime>) {
    if (windowsWin32SystemSysteminformationNapiAvailable) {
        wasmWindowssysWindowsWin32SystemSysteminformationGetSystemTimePreciseAsFileTime(lpsystemtimeasfiletime.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getSystemWindowsDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetSystemWindowsDirectoryA(lpbuffer.rawAddress.toString(), usize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemWindowsDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetSystemWindowsDirectoryW(lpbuffer.rawAddress.toString(), usize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemWow64Directory2A(lpbuffer: Pstr, usize: UInt, imagefilemachinetype: ImageFileMachine): UInt =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetSystemWow64Directory2A(lpbuffer.rawAddress.toString(), usize.toInt(), imagefilemachinetype.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemWow64Directory2W(lpbuffer: Pwstr, usize: UInt, imagefilemachinetype: ImageFileMachine): UInt =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetSystemWow64Directory2W(lpbuffer.rawAddress.toString(), usize.toInt(), imagefilemachinetype.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemWow64DirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetSystemWow64DirectoryA(lpbuffer.rawAddress.toString(), usize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemWow64DirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetSystemWow64DirectoryW(lpbuffer.rawAddress.toString(), usize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTickCount(): UInt =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetTickCount().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTickCount64(): ULong =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetTickCount64().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersion(): UInt =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetVersion().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersionExA(lpversioninformation: MutPtr<Osversioninfoa>): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetVersionExA(lpversioninformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersionExW(lpversioninformation: MutPtr<Osversioninfow>): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetVersionExW(lpversioninformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowsDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetWindowsDirectoryA(lpbuffer.rawAddress.toString(), usize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowsDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGetWindowsDirectoryW(lpbuffer.rawAddress.toString(), usize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalMemoryStatus(lpbuffer: MutPtr<Memorystatus>) {
    if (windowsWin32SystemSysteminformationNapiAvailable) {
        wasmWindowssysWindowsWin32SystemSysteminformationGlobalMemoryStatus(lpbuffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun globalMemoryStatusEx(lpbuffer: MutPtr<Memorystatusex>): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationGlobalMemoryStatusEx(lpbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isUserCetAvailableInEnvironment(usercetenvironment: UserCetEnvironment): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationIsUserCetAvailableInEnvironment(usercetenvironment.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWow64GuestMachineSupported(wowguestmachine: ImageFileMachine, machineissupported: MutPtr<Bool>): Hresult =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationIsWow64GuestMachineSupported(wowguestmachine.toInt(), machineissupported.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize: MutPtr<UInt>, puldeviceformbuffersize: MutPtr<UInt>, devicefamily: Pwstr, deviceform: Pwstr): UInt =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationRtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize.rawAddress.toString(), puldeviceformbuffersize.rawAddress.toString(), devicefamily.rawAddress.toString(), deviceform.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetDeviceFamilyInfoEnum(pulluapinfo: MutPtr<ULong>, puldevicefamily: MutPtr<Devicefamilyinfoenum>, puldeviceform: MutPtr<Devicefamilydeviceform>) {
    if (windowsWin32SystemSysteminformationNapiAvailable) {
        wasmWindowssysWindowsWin32SystemSysteminformationRtlGetDeviceFamilyInfoEnum(pulluapinfo.rawAddress.toString(), puldevicefamily.rawAddress.toString(), puldeviceform.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlGetProductInfo(osmajorversion: UInt, osminorversion: UInt, spmajorversion: UInt, spminorversion: UInt, returnedproducttype: MutPtr<UInt>): Boolean =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationRtlGetProductInfo(osmajorversion.toInt(), osminorversion.toInt(), spmajorversion.toInt(), spminorversion.toInt(), returnedproducttype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetSystemGlobalData(dataid: RtlSystemGlobalDataId, buffer: MutPtr<CVoid>, size: UInt): UInt =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationRtlGetSystemGlobalData(dataid, buffer.rawAddress.toString(), size.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlOsDeploymentState(flags: UInt): OsDeployementStateValues =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationRtlOsDeploymentState(flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSwitchedVVI(versioninfo: ConstPtr<Osversioninfoexw>, typemask: UInt, conditionmask: ULong): UInt =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationRtlSwitchedVVI(versioninfo.rawAddress.toString(), typemask.toInt(), conditionmask.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setComputerNameA(lpcomputername: Pcstr): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationSetComputerNameA(lpcomputername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setComputerNameEx2W(nametype: ComputerNameFormat, flags: UInt, lpbuffer: Pcwstr): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationSetComputerNameEx2W(nametype, flags.toInt(), lpbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setComputerNameExA(nametype: ComputerNameFormat, lpbuffer: Pcstr): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationSetComputerNameExA(nametype, lpbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setComputerNameExW(nametype: ComputerNameFormat, lpbuffer: Pcwstr): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationSetComputerNameExW(nametype, lpbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setComputerNameW(lpcomputername: Pcwstr): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationSetComputerNameW(lpcomputername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLocalTime(lpsystemtime: ConstPtr<Systemtime>): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationSetLocalTime(lpsystemtime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemTime(lpsystemtime: ConstPtr<Systemtime>): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationSetSystemTime(lpsystemtime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemTimeAdjustment(dwtimeadjustment: UInt, btimeadjustmentdisabled: Bool): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustment(dwtimeadjustment.toInt(), btimeadjustmentdisabled) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemTimeAdjustmentPrecise(dwtimeadjustment: ULong, btimeadjustmentdisabled: Bool): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustmentPrecise(dwtimeadjustment.toString(), btimeadjustmentdisabled) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verSetConditionMask(conditionmask: ULong, typemask: VerFlags, condition: UByte): ULong =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationVerSetConditionMask(conditionmask.toString(), typemask.toInt(), condition.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyVersionInfoA(lpversioninformation: MutPtr<Osversioninfoexa>, dwtypemask: VerFlags, dwlconditionmask: ULong): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationVerifyVersionInfoA(lpversioninformation.rawAddress.toString(), dwtypemask.toInt(), dwlconditionmask.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyVersionInfoW(lpversioninformation: MutPtr<Osversioninfoexw>, dwtypemask: VerFlags, dwlconditionmask: ULong): Bool =
    if (windowsWin32SystemSysteminformationNapiAvailable) wasmWindowssysWindowsWin32SystemSysteminformationVerifyVersionInfoW(lpversioninformation.rawAddress.toString(), dwtypemask.toInt(), dwlconditionmask.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
