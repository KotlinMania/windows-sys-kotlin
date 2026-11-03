package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(pcontext: Long, ppagefileinfo: Long, lpfilename: PCSTR): BOOL
}

public fun interface FnCallback1 {
    public operator fun invoke(pcontext: Long, ppagefileinfo: Long, lpfilename: PCWSTR): BOOL
}

public fun EmptyWorkingSet(hprocess: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("psapi.dll", "EmptyWorkingSet", longArrayOf(Win32DynamicFfi.objectSlot(hprocess))).toInt()
}

public fun EnumDeviceDrivers(lpimagebase: Long, cb: UInt, lpcbneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("psapi.dll", "EnumDeviceDrivers", longArrayOf(lpimagebase, cb.toLong(), lpcbneeded)).toInt()
}

public fun EnumPageFilesA(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKA, pcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("psapi.dll", "EnumPageFilesA", longArrayOf(Win32DynamicFfi.objectSlot(pcallbackroutine), pcontext)).toInt()
}

public fun EnumPageFilesW(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKW, pcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("psapi.dll", "EnumPageFilesW", longArrayOf(Win32DynamicFfi.objectSlot(pcallbackroutine), pcontext)).toInt()
}

public fun EnumProcessModules(hprocess: Foundation.HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("psapi.dll", "EnumProcessModules", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lphmodule, cb.toLong(), lpcbneeded)).toInt()
}

public fun EnumProcessModulesEx(hprocess: Foundation.HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long, dwfilterflag: ENUM_PROCESS_MODULES_EX_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("psapi.dll", "EnumProcessModulesEx", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lphmodule, cb.toLong(), lpcbneeded, dwfilterflag.toLong())).toInt()
}

public fun EnumProcesses(lpidprocess: Long, cb: UInt, lpcbneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("psapi.dll", "EnumProcesses", longArrayOf(lpidprocess, cb.toLong(), lpcbneeded)).toInt()
}

public fun GetDeviceDriverBaseNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("psapi.dll", "GetDeviceDriverBaseNameA", longArrayOf(imagebase, lpfilename, nsize.toLong())).toUInt()
}

public fun GetDeviceDriverBaseNameW(imagebase: Long, lpbasename: PWSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("psapi.dll", "GetDeviceDriverBaseNameW", longArrayOf(imagebase, lpbasename, nsize.toLong())).toUInt()
}

public fun GetDeviceDriverFileNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("psapi.dll", "GetDeviceDriverFileNameA", longArrayOf(imagebase, lpfilename, nsize.toLong())).toUInt()
}

public fun GetDeviceDriverFileNameW(imagebase: Long, lpfilename: PWSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("psapi.dll", "GetDeviceDriverFileNameW", longArrayOf(imagebase, lpfilename, nsize.toLong())).toUInt()
}

public fun GetMappedFileNameA(hprocess: Foundation.HANDLE, lpv: Long, lpfilename: PSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("psapi.dll", "GetMappedFileNameA", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lpv, lpfilename, nsize.toLong())).toUInt()
}

public fun GetMappedFileNameW(hprocess: Foundation.HANDLE, lpv: Long, lpfilename: PWSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("psapi.dll", "GetMappedFileNameW", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lpv, lpfilename, nsize.toLong())).toUInt()
}

public fun GetModuleBaseNameA(hprocess: Foundation.HANDLE, hmodule: Foundation.HMODULE, lpbasename: PSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("psapi.dll", "GetModuleBaseNameA", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), Win32DynamicFfi.objectSlot(hmodule), lpbasename, nsize.toLong())).toUInt()
}

public fun GetModuleBaseNameW(hprocess: Foundation.HANDLE, hmodule: Foundation.HMODULE, lpbasename: PWSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("psapi.dll", "GetModuleBaseNameW", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), Win32DynamicFfi.objectSlot(hmodule), lpbasename, nsize.toLong())).toUInt()
}

public fun GetModuleFileNameExA(hprocess: Foundation.HANDLE, hmodule: Foundation.HMODULE, lpfilename: PSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("psapi.dll", "GetModuleFileNameExA", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), Win32DynamicFfi.objectSlot(hmodule), lpfilename, nsize.toLong())).toUInt()
}

public fun GetModuleFileNameExW(hprocess: Foundation.HANDLE, hmodule: Foundation.HMODULE, lpfilename: PWSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("psapi.dll", "GetModuleFileNameExW", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), Win32DynamicFfi.objectSlot(hmodule), lpfilename, nsize.toLong())).toUInt()
}

public fun GetModuleInformation(hprocess: Foundation.HANDLE, hmodule: Foundation.HMODULE, lpmodinfo: Long, cb: UInt): BOOL {
    return Win32DynamicFfi.invoke("psapi.dll", "GetModuleInformation", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), Win32DynamicFfi.objectSlot(hmodule), lpmodinfo, cb.toLong())).toInt()
}

public fun GetPerformanceInfo(pperformanceinformation: Long, cb: UInt): BOOL {
    return Win32DynamicFfi.invoke("psapi.dll", "GetPerformanceInfo", longArrayOf(pperformanceinformation, cb.toLong())).toInt()
}

public fun GetProcessImageFileNameA(hprocess: Foundation.HANDLE, lpimagefilename: PSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("psapi.dll", "GetProcessImageFileNameA", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lpimagefilename, nsize.toLong())).toUInt()
}

public fun GetProcessImageFileNameW(hprocess: Foundation.HANDLE, lpimagefilename: PWSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("psapi.dll", "GetProcessImageFileNameW", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lpimagefilename, nsize.toLong())).toUInt()
}

public fun GetProcessMemoryInfo(process: Foundation.HANDLE, ppsmemcounters: Long, cb: UInt): BOOL {
    return Win32DynamicFfi.invoke("psapi.dll", "GetProcessMemoryInfo", longArrayOf(Win32DynamicFfi.objectSlot(process), ppsmemcounters, cb.toLong())).toInt()
}

public fun GetWsChanges(hprocess: Foundation.HANDLE, lpwatchinfo: Long, cb: UInt): BOOL {
    return Win32DynamicFfi.invoke("psapi.dll", "GetWsChanges", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lpwatchinfo, cb.toLong())).toInt()
}

public fun GetWsChangesEx(hprocess: Foundation.HANDLE, lpwatchinfoex: Long, cb: Long): BOOL {
    return Win32DynamicFfi.invoke("psapi.dll", "GetWsChangesEx", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lpwatchinfoex, cb)).toInt()
}

public fun InitializeProcessForWsWatch(hprocess: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("psapi.dll", "InitializeProcessForWsWatch", longArrayOf(Win32DynamicFfi.objectSlot(hprocess))).toInt()
}

public fun K32EmptyWorkingSet(hprocess: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32EmptyWorkingSet", longArrayOf(Win32DynamicFfi.objectSlot(hprocess))).toInt()
}

public fun K32EnumDeviceDrivers(lpimagebase: Long, cb: UInt, lpcbneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32EnumDeviceDrivers", longArrayOf(lpimagebase, cb.toLong(), lpcbneeded)).toInt()
}

public fun K32EnumPageFilesA(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKA, pcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32EnumPageFilesA", longArrayOf(Win32DynamicFfi.objectSlot(pcallbackroutine), pcontext)).toInt()
}

public fun K32EnumPageFilesW(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKW, pcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32EnumPageFilesW", longArrayOf(Win32DynamicFfi.objectSlot(pcallbackroutine), pcontext)).toInt()
}

public fun K32EnumProcessModules(hprocess: Foundation.HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32EnumProcessModules", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lphmodule, cb.toLong(), lpcbneeded)).toInt()
}

public fun K32EnumProcessModulesEx(hprocess: Foundation.HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long, dwfilterflag: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32EnumProcessModulesEx", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lphmodule, cb.toLong(), lpcbneeded, dwfilterflag.toLong())).toInt()
}

public fun K32EnumProcesses(lpidprocess: Long, cb: UInt, lpcbneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32EnumProcesses", longArrayOf(lpidprocess, cb.toLong(), lpcbneeded)).toInt()
}

public fun K32GetDeviceDriverBaseNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32GetDeviceDriverBaseNameA", longArrayOf(imagebase, lpfilename, nsize.toLong())).toUInt()
}

public fun K32GetDeviceDriverBaseNameW(imagebase: Long, lpbasename: PWSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32GetDeviceDriverBaseNameW", longArrayOf(imagebase, lpbasename, nsize.toLong())).toUInt()
}

public fun K32GetDeviceDriverFileNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32GetDeviceDriverFileNameA", longArrayOf(imagebase, lpfilename, nsize.toLong())).toUInt()
}

public fun K32GetDeviceDriverFileNameW(imagebase: Long, lpfilename: PWSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32GetDeviceDriverFileNameW", longArrayOf(imagebase, lpfilename, nsize.toLong())).toUInt()
}

public fun K32GetMappedFileNameA(hprocess: Foundation.HANDLE, lpv: Long, lpfilename: PSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32GetMappedFileNameA", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lpv, lpfilename, nsize.toLong())).toUInt()
}

public fun K32GetMappedFileNameW(hprocess: Foundation.HANDLE, lpv: Long, lpfilename: PWSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32GetMappedFileNameW", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lpv, lpfilename, nsize.toLong())).toUInt()
}

public fun K32GetModuleBaseNameA(hprocess: Foundation.HANDLE, hmodule: Foundation.HMODULE, lpbasename: PSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32GetModuleBaseNameA", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), Win32DynamicFfi.objectSlot(hmodule), lpbasename, nsize.toLong())).toUInt()
}

public fun K32GetModuleBaseNameW(hprocess: Foundation.HANDLE, hmodule: Foundation.HMODULE, lpbasename: PWSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32GetModuleBaseNameW", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), Win32DynamicFfi.objectSlot(hmodule), lpbasename, nsize.toLong())).toUInt()
}

public fun K32GetModuleFileNameExA(hprocess: Foundation.HANDLE, hmodule: Foundation.HMODULE, lpfilename: PSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32GetModuleFileNameExA", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), Win32DynamicFfi.objectSlot(hmodule), lpfilename, nsize.toLong())).toUInt()
}

public fun K32GetModuleFileNameExW(hprocess: Foundation.HANDLE, hmodule: Foundation.HMODULE, lpfilename: PWSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32GetModuleFileNameExW", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), Win32DynamicFfi.objectSlot(hmodule), lpfilename, nsize.toLong())).toUInt()
}

public fun K32GetModuleInformation(hprocess: Foundation.HANDLE, hmodule: Foundation.HMODULE, lpmodinfo: Long, cb: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32GetModuleInformation", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), Win32DynamicFfi.objectSlot(hmodule), lpmodinfo, cb.toLong())).toInt()
}

public fun K32GetPerformanceInfo(pperformanceinformation: Long, cb: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32GetPerformanceInfo", longArrayOf(pperformanceinformation, cb.toLong())).toInt()
}

public fun K32GetProcessImageFileNameA(hprocess: Foundation.HANDLE, lpimagefilename: PSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32GetProcessImageFileNameA", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lpimagefilename, nsize.toLong())).toUInt()
}

public fun K32GetProcessImageFileNameW(hprocess: Foundation.HANDLE, lpimagefilename: PWSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32GetProcessImageFileNameW", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lpimagefilename, nsize.toLong())).toUInt()
}

public fun K32GetProcessMemoryInfo(process: Foundation.HANDLE, ppsmemcounters: Long, cb: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32GetProcessMemoryInfo", longArrayOf(Win32DynamicFfi.objectSlot(process), ppsmemcounters, cb.toLong())).toInt()
}

public fun K32GetWsChanges(hprocess: Foundation.HANDLE, lpwatchinfo: Long, cb: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32GetWsChanges", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lpwatchinfo, cb.toLong())).toInt()
}

public fun K32GetWsChangesEx(hprocess: Foundation.HANDLE, lpwatchinfoex: Long, cb: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32GetWsChangesEx", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lpwatchinfoex, cb)).toInt()
}

public fun K32InitializeProcessForWsWatch(hprocess: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32InitializeProcessForWsWatch", longArrayOf(Win32DynamicFfi.objectSlot(hprocess))).toInt()
}

public fun K32QueryWorkingSet(hprocess: Foundation.HANDLE, pv: Long, cb: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32QueryWorkingSet", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), pv, cb.toLong())).toInt()
}

public fun K32QueryWorkingSetEx(hprocess: Foundation.HANDLE, pv: Long, cb: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "K32QueryWorkingSetEx", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), pv, cb.toLong())).toInt()
}

public fun QueryWorkingSet(hprocess: Foundation.HANDLE, pv: Long, cb: UInt): BOOL {
    return Win32DynamicFfi.invoke("psapi.dll", "QueryWorkingSet", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), pv, cb.toLong())).toInt()
}

public fun QueryWorkingSetEx(hprocess: Foundation.HANDLE, pv: Long, cb: UInt): BOOL {
    return Win32DynamicFfi.invoke("psapi.dll", "QueryWorkingSetEx", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), pv, cb.toLong())).toInt()
}
