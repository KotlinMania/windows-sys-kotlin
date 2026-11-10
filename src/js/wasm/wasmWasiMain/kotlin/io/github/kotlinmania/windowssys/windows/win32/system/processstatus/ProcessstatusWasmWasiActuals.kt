@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule

public actual fun emptyWorkingSet(hprocess: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumDeviceDrivers(lpimagebase: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumPageFilesA(pcallbackroutine: PenumPageFileCallbacka, pcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumPageFilesW(pcallbackroutine: PenumPageFileCallbackw, pcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumProcessModules(hprocess: Handle, lphmodule: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumProcessModulesEx(hprocess: Handle, lphmodule: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?, dwfilterflag: EnumProcessModulesExFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumProcesses(lpidprocess: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDeviceDriverBaseNameA(imagebase: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDeviceDriverBaseNameW(imagebase: COpaquePointer?, lpbasename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDeviceDriverFileNameA(imagebase: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDeviceDriverFileNameW(imagebase: COpaquePointer?, lpfilename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMappedFileNameA(hprocess: Handle, lpv: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMappedFileNameW(hprocess: Handle, lpv: COpaquePointer?, lpfilename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getModuleBaseNameA(hprocess: Handle, hmodule: Hmodule, lpbasename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getModuleBaseNameW(hprocess: Handle, hmodule: Hmodule, lpbasename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getModuleFileNameExA(hprocess: Handle, hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getModuleFileNameExW(hprocess: Handle, hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getModuleInformation(hprocess: Handle, hmodule: Hmodule, lpmodinfo: COpaquePointer?, cb: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPerformanceInfo(pperformanceinformation: COpaquePointer?, cb: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getProcessImageFileNameA(hprocess: Handle, lpimagefilename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getProcessImageFileNameW(hprocess: Handle, lpimagefilename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getProcessMemoryInfo(process: Handle, ppsmemcounters: COpaquePointer?, cb: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWsChanges(hprocess: Handle, lpwatchinfo: COpaquePointer?, cb: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWsChangesEx(hprocess: Handle, lpwatchinfoex: COpaquePointer?, cb: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initializeProcessForWsWatch(hprocess: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32EmptyWorkingSet(hprocess: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32EnumDeviceDrivers(lpimagebase: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32EnumPageFilesA(pcallbackroutine: PenumPageFileCallbacka, pcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32EnumPageFilesW(pcallbackroutine: PenumPageFileCallbackw, pcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32EnumProcessModules(hprocess: Handle, lphmodule: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32EnumProcessModulesEx(hprocess: Handle, lphmodule: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?, dwfilterflag: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32EnumProcesses(lpidprocess: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32GetDeviceDriverBaseNameA(imagebase: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32GetDeviceDriverBaseNameW(imagebase: COpaquePointer?, lpbasename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32GetDeviceDriverFileNameA(imagebase: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32GetDeviceDriverFileNameW(imagebase: COpaquePointer?, lpfilename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32GetMappedFileNameA(hprocess: Handle, lpv: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32GetMappedFileNameW(hprocess: Handle, lpv: COpaquePointer?, lpfilename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32GetModuleBaseNameA(hprocess: Handle, hmodule: Hmodule, lpbasename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32GetModuleBaseNameW(hprocess: Handle, hmodule: Hmodule, lpbasename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32GetModuleFileNameExA(hprocess: Handle, hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32GetModuleFileNameExW(hprocess: Handle, hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32GetModuleInformation(hprocess: Handle, hmodule: Hmodule, lpmodinfo: COpaquePointer?, cb: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32GetPerformanceInfo(pperformanceinformation: COpaquePointer?, cb: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32GetProcessImageFileNameA(hprocess: Handle, lpimagefilename: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32GetProcessImageFileNameW(hprocess: Handle, lpimagefilename: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32GetProcessMemoryInfo(process: Handle, ppsmemcounters: COpaquePointer?, cb: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32GetWsChanges(hprocess: Handle, lpwatchinfo: COpaquePointer?, cb: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32GetWsChangesEx(hprocess: Handle, lpwatchinfoex: COpaquePointer?, cb: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32InitializeProcessForWsWatch(hprocess: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32QueryWorkingSet(hprocess: Handle, pv: COpaquePointer?, cb: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun k32QueryWorkingSetEx(hprocess: Handle, pv: COpaquePointer?, cb: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryWorkingSet(hprocess: Handle, pv: COpaquePointer?, cb: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryWorkingSetEx(hprocess: Handle, pv: COpaquePointer?, cb: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
