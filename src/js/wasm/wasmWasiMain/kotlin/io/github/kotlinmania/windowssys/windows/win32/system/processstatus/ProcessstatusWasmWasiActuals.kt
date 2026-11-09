@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE

public actual fun EmptyWorkingSet(hprocess: HANDLE): BOOL =
    0

public actual fun EnumDeviceDrivers(lpimagebase: Long, cb: UInt, lpcbneeded: Long): BOOL =
    0

public actual fun EnumPageFilesA(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKA, pcontext: Long): BOOL =
    0

public actual fun EnumPageFilesW(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKW, pcontext: Long): BOOL =
    0

public actual fun EnumProcessModules(hprocess: HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long): BOOL =
    0

public actual fun EnumProcessModulesEx(hprocess: HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long, dwfilterflag: ENUM_PROCESS_MODULES_EX_FLAGS): BOOL =
    0

public actual fun EnumProcesses(lpidprocess: Long, cb: UInt, lpcbneeded: Long): BOOL =
    0

public actual fun GetDeviceDriverBaseNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt =
    0u

public actual fun GetDeviceDriverBaseNameW(imagebase: Long, lpbasename: PWSTR, nsize: UInt): UInt =
    0u

public actual fun GetDeviceDriverFileNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt =
    0u

public actual fun GetDeviceDriverFileNameW(imagebase: Long, lpfilename: PWSTR, nsize: UInt): UInt =
    0u

public actual fun GetMappedFileNameA(hprocess: HANDLE, lpv: Long, lpfilename: PSTR, nsize: UInt): UInt =
    0u

public actual fun GetMappedFileNameW(hprocess: HANDLE, lpv: Long, lpfilename: PWSTR, nsize: UInt): UInt =
    0u

public actual fun GetModuleBaseNameA(hprocess: HANDLE, hmodule: HMODULE, lpbasename: PSTR, nsize: UInt): UInt =
    0u

public actual fun GetModuleBaseNameW(hprocess: HANDLE, hmodule: HMODULE, lpbasename: PWSTR, nsize: UInt): UInt =
    0u

public actual fun GetModuleFileNameExA(hprocess: HANDLE, hmodule: HMODULE, lpfilename: PSTR, nsize: UInt): UInt =
    0u

public actual fun GetModuleFileNameExW(hprocess: HANDLE, hmodule: HMODULE, lpfilename: PWSTR, nsize: UInt): UInt =
    0u

public actual fun GetModuleInformation(hprocess: HANDLE, hmodule: HMODULE, lpmodinfo: Long, cb: UInt): BOOL =
    0

public actual fun GetPerformanceInfo(pperformanceinformation: Long, cb: UInt): BOOL =
    0

public actual fun GetProcessImageFileNameA(hprocess: HANDLE, lpimagefilename: PSTR, nsize: UInt): UInt =
    0u

public actual fun GetProcessImageFileNameW(hprocess: HANDLE, lpimagefilename: PWSTR, nsize: UInt): UInt =
    0u

public actual fun GetProcessMemoryInfo(process: HANDLE, ppsmemcounters: Long, cb: UInt): BOOL =
    0

public actual fun GetWsChanges(hprocess: HANDLE, lpwatchinfo: Long, cb: UInt): BOOL =
    0

public actual fun GetWsChangesEx(hprocess: HANDLE, lpwatchinfoex: Long, cb: Long): BOOL =
    0

public actual fun InitializeProcessForWsWatch(hprocess: HANDLE): BOOL =
    0

public actual fun K32EmptyWorkingSet(hprocess: HANDLE): BOOL =
    0

public actual fun K32EnumDeviceDrivers(lpimagebase: Long, cb: UInt, lpcbneeded: Long): BOOL =
    0

public actual fun K32EnumPageFilesA(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKA, pcontext: Long): BOOL =
    0

public actual fun K32EnumPageFilesW(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKW, pcontext: Long): BOOL =
    0

public actual fun K32EnumProcessModules(hprocess: HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long): BOOL =
    0

public actual fun K32EnumProcessModulesEx(hprocess: HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long, dwfilterflag: UInt): BOOL =
    0

public actual fun K32EnumProcesses(lpidprocess: Long, cb: UInt, lpcbneeded: Long): BOOL =
    0

public actual fun K32GetDeviceDriverBaseNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt =
    0u

public actual fun K32GetDeviceDriverBaseNameW(imagebase: Long, lpbasename: PWSTR, nsize: UInt): UInt =
    0u

public actual fun K32GetDeviceDriverFileNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt =
    0u

public actual fun K32GetDeviceDriverFileNameW(imagebase: Long, lpfilename: PWSTR, nsize: UInt): UInt =
    0u

public actual fun K32GetMappedFileNameA(hprocess: HANDLE, lpv: Long, lpfilename: PSTR, nsize: UInt): UInt =
    0u

public actual fun K32GetMappedFileNameW(hprocess: HANDLE, lpv: Long, lpfilename: PWSTR, nsize: UInt): UInt =
    0u

public actual fun K32GetModuleBaseNameA(hprocess: HANDLE, hmodule: HMODULE, lpbasename: PSTR, nsize: UInt): UInt =
    0u

public actual fun K32GetModuleBaseNameW(hprocess: HANDLE, hmodule: HMODULE, lpbasename: PWSTR, nsize: UInt): UInt =
    0u

public actual fun K32GetModuleFileNameExA(hprocess: HANDLE, hmodule: HMODULE, lpfilename: PSTR, nsize: UInt): UInt =
    0u

public actual fun K32GetModuleFileNameExW(hprocess: HANDLE, hmodule: HMODULE, lpfilename: PWSTR, nsize: UInt): UInt =
    0u

public actual fun K32GetModuleInformation(hprocess: HANDLE, hmodule: HMODULE, lpmodinfo: Long, cb: UInt): BOOL =
    0

public actual fun K32GetPerformanceInfo(pperformanceinformation: Long, cb: UInt): BOOL =
    0

public actual fun K32GetProcessImageFileNameA(hprocess: HANDLE, lpimagefilename: PSTR, nsize: UInt): UInt =
    0u

public actual fun K32GetProcessImageFileNameW(hprocess: HANDLE, lpimagefilename: PWSTR, nsize: UInt): UInt =
    0u

public actual fun K32GetProcessMemoryInfo(process: HANDLE, ppsmemcounters: Long, cb: UInt): BOOL =
    0

public actual fun K32GetWsChanges(hprocess: HANDLE, lpwatchinfo: Long, cb: UInt): BOOL =
    0

public actual fun K32GetWsChangesEx(hprocess: HANDLE, lpwatchinfoex: Long, cb: Long): BOOL =
    0

public actual fun K32InitializeProcessForWsWatch(hprocess: HANDLE): BOOL =
    0

public actual fun K32QueryWorkingSet(hprocess: HANDLE, pv: Long, cb: UInt): BOOL =
    0

public actual fun K32QueryWorkingSetEx(hprocess: HANDLE, pv: Long, cb: UInt): BOOL =
    0

public actual fun QueryWorkingSet(hprocess: HANDLE, pv: Long, cb: UInt): BOOL =
    0

public actual fun QueryWorkingSetEx(hprocess: HANDLE, pv: Long, cb: UInt): BOOL =
    0
