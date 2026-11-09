package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE

public expect fun EmptyWorkingSet(hprocess: HANDLE): BOOL

public expect fun EnumDeviceDrivers(lpimagebase: Long, cb: UInt, lpcbneeded: Long): BOOL

public expect fun EnumPageFilesA(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKA, pcontext: Long): BOOL

public expect fun EnumPageFilesW(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKW, pcontext: Long): BOOL

public expect fun EnumProcessModules(hprocess: HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long): BOOL

public expect fun EnumProcessModulesEx(hprocess: HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long, dwfilterflag: ENUM_PROCESS_MODULES_EX_FLAGS): BOOL

public expect fun EnumProcesses(lpidprocess: Long, cb: UInt, lpcbneeded: Long): BOOL

public expect fun GetDeviceDriverBaseNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt

public expect fun GetDeviceDriverBaseNameW(imagebase: Long, lpbasename: PWSTR, nsize: UInt): UInt

public expect fun GetDeviceDriverFileNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt

public expect fun GetDeviceDriverFileNameW(imagebase: Long, lpfilename: PWSTR, nsize: UInt): UInt

public expect fun GetMappedFileNameA(hprocess: HANDLE, lpv: Long, lpfilename: PSTR, nsize: UInt): UInt

public expect fun GetMappedFileNameW(hprocess: HANDLE, lpv: Long, lpfilename: PWSTR, nsize: UInt): UInt

public expect fun GetModuleBaseNameA(hprocess: HANDLE, hmodule: HMODULE, lpbasename: PSTR, nsize: UInt): UInt

public expect fun GetModuleBaseNameW(hprocess: HANDLE, hmodule: HMODULE, lpbasename: PWSTR, nsize: UInt): UInt

public expect fun GetModuleFileNameExA(hprocess: HANDLE, hmodule: HMODULE, lpfilename: PSTR, nsize: UInt): UInt

public expect fun GetModuleFileNameExW(hprocess: HANDLE, hmodule: HMODULE, lpfilename: PWSTR, nsize: UInt): UInt

public expect fun GetModuleInformation(hprocess: HANDLE, hmodule: HMODULE, lpmodinfo: Long, cb: UInt): BOOL

public expect fun GetPerformanceInfo(pperformanceinformation: Long, cb: UInt): BOOL

public expect fun GetProcessImageFileNameA(hprocess: HANDLE, lpimagefilename: PSTR, nsize: UInt): UInt

public expect fun GetProcessImageFileNameW(hprocess: HANDLE, lpimagefilename: PWSTR, nsize: UInt): UInt

public expect fun GetProcessMemoryInfo(process: HANDLE, ppsmemcounters: Long, cb: UInt): BOOL

public expect fun GetWsChanges(hprocess: HANDLE, lpwatchinfo: Long, cb: UInt): BOOL

public expect fun GetWsChangesEx(hprocess: HANDLE, lpwatchinfoex: Long, cb: Long): BOOL

public expect fun InitializeProcessForWsWatch(hprocess: HANDLE): BOOL

public expect fun K32EmptyWorkingSet(hprocess: HANDLE): BOOL

public expect fun K32EnumDeviceDrivers(lpimagebase: Long, cb: UInt, lpcbneeded: Long): BOOL

public expect fun K32EnumPageFilesA(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKA, pcontext: Long): BOOL

public expect fun K32EnumPageFilesW(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKW, pcontext: Long): BOOL

public expect fun K32EnumProcessModules(hprocess: HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long): BOOL

public expect fun K32EnumProcessModulesEx(hprocess: HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long, dwfilterflag: UInt): BOOL

public expect fun K32EnumProcesses(lpidprocess: Long, cb: UInt, lpcbneeded: Long): BOOL

public expect fun K32GetDeviceDriverBaseNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt

public expect fun K32GetDeviceDriverBaseNameW(imagebase: Long, lpbasename: PWSTR, nsize: UInt): UInt

public expect fun K32GetDeviceDriverFileNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt

public expect fun K32GetDeviceDriverFileNameW(imagebase: Long, lpfilename: PWSTR, nsize: UInt): UInt

public expect fun K32GetMappedFileNameA(hprocess: HANDLE, lpv: Long, lpfilename: PSTR, nsize: UInt): UInt

public expect fun K32GetMappedFileNameW(hprocess: HANDLE, lpv: Long, lpfilename: PWSTR, nsize: UInt): UInt

public expect fun K32GetModuleBaseNameA(hprocess: HANDLE, hmodule: HMODULE, lpbasename: PSTR, nsize: UInt): UInt

public expect fun K32GetModuleBaseNameW(hprocess: HANDLE, hmodule: HMODULE, lpbasename: PWSTR, nsize: UInt): UInt

public expect fun K32GetModuleFileNameExA(hprocess: HANDLE, hmodule: HMODULE, lpfilename: PSTR, nsize: UInt): UInt

public expect fun K32GetModuleFileNameExW(hprocess: HANDLE, hmodule: HMODULE, lpfilename: PWSTR, nsize: UInt): UInt

public expect fun K32GetModuleInformation(hprocess: HANDLE, hmodule: HMODULE, lpmodinfo: Long, cb: UInt): BOOL

public expect fun K32GetPerformanceInfo(pperformanceinformation: Long, cb: UInt): BOOL

public expect fun K32GetProcessImageFileNameA(hprocess: HANDLE, lpimagefilename: PSTR, nsize: UInt): UInt

public expect fun K32GetProcessImageFileNameW(hprocess: HANDLE, lpimagefilename: PWSTR, nsize: UInt): UInt

public expect fun K32GetProcessMemoryInfo(process: HANDLE, ppsmemcounters: Long, cb: UInt): BOOL

public expect fun K32GetWsChanges(hprocess: HANDLE, lpwatchinfo: Long, cb: UInt): BOOL

public expect fun K32GetWsChangesEx(hprocess: HANDLE, lpwatchinfoex: Long, cb: Long): BOOL

public expect fun K32InitializeProcessForWsWatch(hprocess: HANDLE): BOOL

public expect fun K32QueryWorkingSet(hprocess: HANDLE, pv: Long, cb: UInt): BOOL

public expect fun K32QueryWorkingSetEx(hprocess: HANDLE, pv: Long, cb: UInt): BOOL

public expect fun QueryWorkingSet(hprocess: HANDLE, pv: Long, cb: UInt): BOOL

public expect fun QueryWorkingSetEx(hprocess: HANDLE, pv: Long, cb: UInt): BOOL
