@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE

private val _windowsWin32SystemProcessstatusNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun EmptyWorkingSet(hprocess: HANDLE): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_EmptyWorkingSet(hprocess.toString()) as Int) else 0

public actual fun EnumDeviceDrivers(lpimagebase: Long, cb: UInt, lpcbneeded: Long): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_EnumDeviceDrivers(lpimagebase.toString(), cb.toInt(), lpcbneeded.toString()) as Int) else 0

public actual fun EnumPageFilesA(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKA, pcontext: Long): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_EnumPageFilesA(pcallbackroutine.toLong().toString(), pcontext.toString()) as Int) else 0

public actual fun EnumPageFilesW(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKW, pcontext: Long): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_EnumPageFilesW(pcallbackroutine.toLong().toString(), pcontext.toString()) as Int) else 0

public actual fun EnumProcessModules(hprocess: HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_EnumProcessModules(hprocess.toString(), lphmodule.toString(), cb.toInt(), lpcbneeded.toString()) as Int) else 0

public actual fun EnumProcessModulesEx(hprocess: HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long, dwfilterflag: ENUM_PROCESS_MODULES_EX_FLAGS): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_EnumProcessModulesEx(hprocess.toString(), lphmodule.toString(), cb.toInt(), lpcbneeded.toString(), dwfilterflag.toInt()) as Int) else 0

public actual fun EnumProcesses(lpidprocess: Long, cb: UInt, lpcbneeded: Long): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_EnumProcesses(lpidprocess.toString(), cb.toInt(), lpcbneeded.toString()) as Int) else 0

public actual fun GetDeviceDriverBaseNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_GetDeviceDriverBaseNameA(imagebase.toString(), lpfilename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetDeviceDriverBaseNameW(imagebase: Long, lpbasename: PWSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_GetDeviceDriverBaseNameW(imagebase.toString(), lpbasename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetDeviceDriverFileNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_GetDeviceDriverFileNameA(imagebase.toString(), lpfilename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetDeviceDriverFileNameW(imagebase: Long, lpfilename: PWSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_GetDeviceDriverFileNameW(imagebase.toString(), lpfilename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetMappedFileNameA(hprocess: HANDLE, lpv: Long, lpfilename: PSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_GetMappedFileNameA(hprocess.toString(), lpv.toString(), lpfilename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetMappedFileNameW(hprocess: HANDLE, lpv: Long, lpfilename: PWSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_GetMappedFileNameW(hprocess.toString(), lpv.toString(), lpfilename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetModuleBaseNameA(hprocess: HANDLE, hmodule: HMODULE, lpbasename: PSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_GetModuleBaseNameA(hprocess.toString(), hmodule.toString(), lpbasename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetModuleBaseNameW(hprocess: HANDLE, hmodule: HMODULE, lpbasename: PWSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_GetModuleBaseNameW(hprocess.toString(), hmodule.toString(), lpbasename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetModuleFileNameExA(hprocess: HANDLE, hmodule: HMODULE, lpfilename: PSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_GetModuleFileNameExA(hprocess.toString(), hmodule.toString(), lpfilename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetModuleFileNameExW(hprocess: HANDLE, hmodule: HMODULE, lpfilename: PWSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_GetModuleFileNameExW(hprocess.toString(), hmodule.toString(), lpfilename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetModuleInformation(hprocess: HANDLE, hmodule: HMODULE, lpmodinfo: Long, cb: UInt): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_GetModuleInformation(hprocess.toString(), hmodule.toString(), lpmodinfo.toString(), cb.toInt()) as Int) else 0

public actual fun GetPerformanceInfo(pperformanceinformation: Long, cb: UInt): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_GetPerformanceInfo(pperformanceinformation.toString(), cb.toInt()) as Int) else 0

public actual fun GetProcessImageFileNameA(hprocess: HANDLE, lpimagefilename: PSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_GetProcessImageFileNameA(hprocess.toString(), lpimagefilename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetProcessImageFileNameW(hprocess: HANDLE, lpimagefilename: PWSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_GetProcessImageFileNameW(hprocess.toString(), lpimagefilename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetProcessMemoryInfo(process: HANDLE, ppsmemcounters: Long, cb: UInt): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_GetProcessMemoryInfo(process.toString(), ppsmemcounters.toString(), cb.toInt()) as Int) else 0

public actual fun GetWsChanges(hprocess: HANDLE, lpwatchinfo: Long, cb: UInt): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_GetWsChanges(hprocess.toString(), lpwatchinfo.toString(), cb.toInt()) as Int) else 0

public actual fun GetWsChangesEx(hprocess: HANDLE, lpwatchinfoex: Long, cb: Long): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_GetWsChangesEx(hprocess.toString(), lpwatchinfoex.toString(), cb.toString()) as Int) else 0

public actual fun InitializeProcessForWsWatch(hprocess: HANDLE): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_InitializeProcessForWsWatch(hprocess.toString()) as Int) else 0

public actual fun K32EmptyWorkingSet(hprocess: HANDLE): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32EmptyWorkingSet(hprocess.toString()) as Int) else 0

public actual fun K32EnumDeviceDrivers(lpimagebase: Long, cb: UInt, lpcbneeded: Long): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32EnumDeviceDrivers(lpimagebase.toString(), cb.toInt(), lpcbneeded.toString()) as Int) else 0

public actual fun K32EnumPageFilesA(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKA, pcontext: Long): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32EnumPageFilesA(pcallbackroutine.toLong().toString(), pcontext.toString()) as Int) else 0

public actual fun K32EnumPageFilesW(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKW, pcontext: Long): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32EnumPageFilesW(pcallbackroutine.toLong().toString(), pcontext.toString()) as Int) else 0

public actual fun K32EnumProcessModules(hprocess: HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32EnumProcessModules(hprocess.toString(), lphmodule.toString(), cb.toInt(), lpcbneeded.toString()) as Int) else 0

public actual fun K32EnumProcessModulesEx(hprocess: HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long, dwfilterflag: UInt): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32EnumProcessModulesEx(hprocess.toString(), lphmodule.toString(), cb.toInt(), lpcbneeded.toString(), dwfilterflag.toInt()) as Int) else 0

public actual fun K32EnumProcesses(lpidprocess: Long, cb: UInt, lpcbneeded: Long): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32EnumProcesses(lpidprocess.toString(), cb.toInt(), lpcbneeded.toString()) as Int) else 0

public actual fun K32GetDeviceDriverBaseNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32GetDeviceDriverBaseNameA(imagebase.toString(), lpfilename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun K32GetDeviceDriverBaseNameW(imagebase: Long, lpbasename: PWSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32GetDeviceDriverBaseNameW(imagebase.toString(), lpbasename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun K32GetDeviceDriverFileNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32GetDeviceDriverFileNameA(imagebase.toString(), lpfilename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun K32GetDeviceDriverFileNameW(imagebase: Long, lpfilename: PWSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32GetDeviceDriverFileNameW(imagebase.toString(), lpfilename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun K32GetMappedFileNameA(hprocess: HANDLE, lpv: Long, lpfilename: PSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32GetMappedFileNameA(hprocess.toString(), lpv.toString(), lpfilename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun K32GetMappedFileNameW(hprocess: HANDLE, lpv: Long, lpfilename: PWSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32GetMappedFileNameW(hprocess.toString(), lpv.toString(), lpfilename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun K32GetModuleBaseNameA(hprocess: HANDLE, hmodule: HMODULE, lpbasename: PSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32GetModuleBaseNameA(hprocess.toString(), hmodule.toString(), lpbasename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun K32GetModuleBaseNameW(hprocess: HANDLE, hmodule: HMODULE, lpbasename: PWSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32GetModuleBaseNameW(hprocess.toString(), hmodule.toString(), lpbasename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun K32GetModuleFileNameExA(hprocess: HANDLE, hmodule: HMODULE, lpfilename: PSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32GetModuleFileNameExA(hprocess.toString(), hmodule.toString(), lpfilename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun K32GetModuleFileNameExW(hprocess: HANDLE, hmodule: HMODULE, lpfilename: PWSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32GetModuleFileNameExW(hprocess.toString(), hmodule.toString(), lpfilename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun K32GetModuleInformation(hprocess: HANDLE, hmodule: HMODULE, lpmodinfo: Long, cb: UInt): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32GetModuleInformation(hprocess.toString(), hmodule.toString(), lpmodinfo.toString(), cb.toInt()) as Int) else 0

public actual fun K32GetPerformanceInfo(pperformanceinformation: Long, cb: UInt): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32GetPerformanceInfo(pperformanceinformation.toString(), cb.toInt()) as Int) else 0

public actual fun K32GetProcessImageFileNameA(hprocess: HANDLE, lpimagefilename: PSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32GetProcessImageFileNameA(hprocess.toString(), lpimagefilename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun K32GetProcessImageFileNameW(hprocess: HANDLE, lpimagefilename: PWSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32GetProcessImageFileNameW(hprocess.toString(), lpimagefilename.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun K32GetProcessMemoryInfo(process: HANDLE, ppsmemcounters: Long, cb: UInt): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32GetProcessMemoryInfo(process.toString(), ppsmemcounters.toString(), cb.toInt()) as Int) else 0

public actual fun K32GetWsChanges(hprocess: HANDLE, lpwatchinfo: Long, cb: UInt): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32GetWsChanges(hprocess.toString(), lpwatchinfo.toString(), cb.toInt()) as Int) else 0

public actual fun K32GetWsChangesEx(hprocess: HANDLE, lpwatchinfoex: Long, cb: Long): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32GetWsChangesEx(hprocess.toString(), lpwatchinfoex.toString(), cb.toString()) as Int) else 0

public actual fun K32InitializeProcessForWsWatch(hprocess: HANDLE): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32InitializeProcessForWsWatch(hprocess.toString()) as Int) else 0

public actual fun K32QueryWorkingSet(hprocess: HANDLE, pv: Long, cb: UInt): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32QueryWorkingSet(hprocess.toString(), pv.toString(), cb.toInt()) as Int) else 0

public actual fun K32QueryWorkingSetEx(hprocess: HANDLE, pv: Long, cb: UInt): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_K32QueryWorkingSetEx(hprocess.toString(), pv.toString(), cb.toInt()) as Int) else 0

public actual fun QueryWorkingSet(hprocess: HANDLE, pv: Long, cb: UInt): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_QueryWorkingSet(hprocess.toString(), pv.toString(), cb.toInt()) as Int) else 0

public actual fun QueryWorkingSetEx(hprocess: HANDLE, pv: Long, cb: UInt): BOOL =
    if (_windowsWin32SystemProcessstatusNapiAddon != null) (_windowsWin32SystemProcessstatusNapiAddon.windowssys_windows_win32_system_processstatus_QueryWorkingSetEx(hprocess.toString(), pv.toString(), cb.toInt()) as Int) else 0
