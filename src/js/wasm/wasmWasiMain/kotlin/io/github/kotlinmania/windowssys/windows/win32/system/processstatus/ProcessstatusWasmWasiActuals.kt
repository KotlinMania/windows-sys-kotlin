@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun emptyWorkingSet(hprocess: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusEmptyWorkingSet")

public actual fun enumDeviceDrivers(lpimagebase: MutPtr<MutPtr<CVoid>>, cb: UInt, lpcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusEnumDeviceDrivers")

public actual fun enumPageFilesA(pcallbackroutine: PenumPageFileCallbacka, pcontext: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusEnumPageFilesA")

public actual fun enumPageFilesW(pcallbackroutine: PenumPageFileCallbackw, pcontext: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusEnumPageFilesW")

public actual fun enumProcessModules(hprocess: Handle, lphmodule: MutPtr<Hmodule>, cb: UInt, lpcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusEnumProcessModules")

public actual fun enumProcessModulesEx(hprocess: Handle, lphmodule: MutPtr<Hmodule>, cb: UInt, lpcbneeded: MutPtr<UInt>, dwfilterflag: EnumProcessModulesExFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusEnumProcessModulesEx")

public actual fun enumProcesses(lpidprocess: MutPtr<UInt>, cb: UInt, lpcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusEnumProcesses")

public actual fun getDeviceDriverBaseNameA(imagebase: ConstPtr<CVoid>, lpfilename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusGetDeviceDriverBaseNameA")

public actual fun getDeviceDriverBaseNameW(imagebase: ConstPtr<CVoid>, lpbasename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusGetDeviceDriverBaseNameW")

public actual fun getDeviceDriverFileNameA(imagebase: ConstPtr<CVoid>, lpfilename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusGetDeviceDriverFileNameA")

public actual fun getDeviceDriverFileNameW(imagebase: ConstPtr<CVoid>, lpfilename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusGetDeviceDriverFileNameW")

public actual fun getMappedFileNameA(hprocess: Handle, lpv: ConstPtr<CVoid>, lpfilename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusGetMappedFileNameA")

public actual fun getMappedFileNameW(hprocess: Handle, lpv: ConstPtr<CVoid>, lpfilename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusGetMappedFileNameW")

public actual fun getModuleBaseNameA(hprocess: Handle, hmodule: Hmodule, lpbasename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusGetModuleBaseNameA")

public actual fun getModuleBaseNameW(hprocess: Handle, hmodule: Hmodule, lpbasename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusGetModuleBaseNameW")

public actual fun getModuleFileNameExA(hprocess: Handle, hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusGetModuleFileNameExA")

public actual fun getModuleFileNameExW(hprocess: Handle, hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusGetModuleFileNameExW")

public actual fun getModuleInformation(hprocess: Handle, hmodule: Hmodule, lpmodinfo: MutPtr<Moduleinfo>, cb: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusGetModuleInformation")

public actual fun getPerformanceInfo(pperformanceinformation: MutPtr<PerformanceInformation>, cb: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusGetPerformanceInfo")

public actual fun getProcessImageFileNameA(hprocess: Handle, lpimagefilename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusGetProcessImageFileNameA")

public actual fun getProcessImageFileNameW(hprocess: Handle, lpimagefilename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusGetProcessImageFileNameW")

public actual fun getProcessMemoryInfo(process: Handle, ppsmemcounters: MutPtr<ProcessMemoryCounters>, cb: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusGetProcessMemoryInfo")

public actual fun getWsChanges(hprocess: Handle, lpwatchinfo: MutPtr<PsapiWsWatchInformation>, cb: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusGetWsChanges")

public actual fun getWsChangesEx(hprocess: Handle, lpwatchinfoex: MutPtr<PsapiWsWatchInformationEx>, cb: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusGetWsChangesEx")

public actual fun initializeProcessForWsWatch(hprocess: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusInitializeProcessForWsWatch")

public actual fun k32EmptyWorkingSet(hprocess: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32EmptyWorkingSet")

public actual fun k32EnumDeviceDrivers(lpimagebase: MutPtr<MutPtr<CVoid>>, cb: UInt, lpcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32EnumDeviceDrivers")

public actual fun k32EnumPageFilesA(pcallbackroutine: PenumPageFileCallbacka, pcontext: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32EnumPageFilesA")

public actual fun k32EnumPageFilesW(pcallbackroutine: PenumPageFileCallbackw, pcontext: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32EnumPageFilesW")

public actual fun k32EnumProcessModules(hprocess: Handle, lphmodule: MutPtr<Hmodule>, cb: UInt, lpcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32EnumProcessModules")

public actual fun k32EnumProcessModulesEx(hprocess: Handle, lphmodule: MutPtr<Hmodule>, cb: UInt, lpcbneeded: MutPtr<UInt>, dwfilterflag: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32EnumProcessModulesEx")

public actual fun k32EnumProcesses(lpidprocess: MutPtr<UInt>, cb: UInt, lpcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32EnumProcesses")

public actual fun k32GetDeviceDriverBaseNameA(imagebase: ConstPtr<CVoid>, lpfilename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverBaseNameA")

public actual fun k32GetDeviceDriverBaseNameW(imagebase: ConstPtr<CVoid>, lpbasename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverBaseNameW")

public actual fun k32GetDeviceDriverFileNameA(imagebase: ConstPtr<CVoid>, lpfilename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverFileNameA")

public actual fun k32GetDeviceDriverFileNameW(imagebase: ConstPtr<CVoid>, lpfilename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverFileNameW")

public actual fun k32GetMappedFileNameA(hprocess: Handle, lpv: ConstPtr<CVoid>, lpfilename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32GetMappedFileNameA")

public actual fun k32GetMappedFileNameW(hprocess: Handle, lpv: ConstPtr<CVoid>, lpfilename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32GetMappedFileNameW")

public actual fun k32GetModuleBaseNameA(hprocess: Handle, hmodule: Hmodule, lpbasename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32GetModuleBaseNameA")

public actual fun k32GetModuleBaseNameW(hprocess: Handle, hmodule: Hmodule, lpbasename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32GetModuleBaseNameW")

public actual fun k32GetModuleFileNameExA(hprocess: Handle, hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32GetModuleFileNameExA")

public actual fun k32GetModuleFileNameExW(hprocess: Handle, hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32GetModuleFileNameExW")

public actual fun k32GetModuleInformation(hprocess: Handle, hmodule: Hmodule, lpmodinfo: MutPtr<Moduleinfo>, cb: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32GetModuleInformation")

public actual fun k32GetPerformanceInfo(pperformanceinformation: MutPtr<PerformanceInformation>, cb: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32GetPerformanceInfo")

public actual fun k32GetProcessImageFileNameA(hprocess: Handle, lpimagefilename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32GetProcessImageFileNameA")

public actual fun k32GetProcessImageFileNameW(hprocess: Handle, lpimagefilename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32GetProcessImageFileNameW")

public actual fun k32GetProcessMemoryInfo(process: Handle, ppsmemcounters: MutPtr<ProcessMemoryCounters>, cb: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32GetProcessMemoryInfo")

public actual fun k32GetWsChanges(hprocess: Handle, lpwatchinfo: MutPtr<PsapiWsWatchInformation>, cb: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32GetWsChanges")

public actual fun k32GetWsChangesEx(hprocess: Handle, lpwatchinfoex: MutPtr<PsapiWsWatchInformationEx>, cb: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32GetWsChangesEx")

public actual fun k32InitializeProcessForWsWatch(hprocess: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32InitializeProcessForWsWatch")

public actual fun k32QueryWorkingSet(hprocess: Handle, pv: MutPtr<CVoid>, cb: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32QueryWorkingSet")

public actual fun k32QueryWorkingSetEx(hprocess: Handle, pv: MutPtr<CVoid>, cb: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusK32QueryWorkingSetEx")

public actual fun queryWorkingSet(hprocess: Handle, pv: MutPtr<CVoid>, cb: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusQueryWorkingSet")

public actual fun queryWorkingSetEx(hprocess: Handle, pv: MutPtr<CVoid>, cb: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemProcessstatusQueryWorkingSetEx")
