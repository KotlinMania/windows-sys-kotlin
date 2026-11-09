@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun EmptyWorkingSet(hprocess: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_EmptyWorkingSet(hprocess.toCPointer<ByteVar>())

public actual fun EnumDeviceDrivers(lpimagebase: Long, cb: UInt, lpcbneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_EnumDeviceDrivers(lpimagebase.toCPointer<ByteVar>(), cb, lpcbneeded.toCPointer<ByteVar>())

public actual fun EnumPageFilesA(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKA, pcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_EnumPageFilesA(pcallbackroutine.toLong().toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>())

public actual fun EnumPageFilesW(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKW, pcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_EnumPageFilesW(pcallbackroutine.toLong().toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>())

public actual fun EnumProcessModules(hprocess: HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_EnumProcessModules(hprocess.toCPointer<ByteVar>(), lphmodule.toCPointer<ByteVar>(), cb, lpcbneeded.toCPointer<ByteVar>())

public actual fun EnumProcessModulesEx(hprocess: HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long, dwfilterflag: ENUM_PROCESS_MODULES_EX_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_EnumProcessModulesEx(hprocess.toCPointer<ByteVar>(), lphmodule.toCPointer<ByteVar>(), cb, lpcbneeded.toCPointer<ByteVar>(), dwfilterflag)

public actual fun EnumProcesses(lpidprocess: Long, cb: UInt, lpcbneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_EnumProcesses(lpidprocess.toCPointer<ByteVar>(), cb, lpcbneeded.toCPointer<ByteVar>())

public actual fun GetDeviceDriverBaseNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_GetDeviceDriverBaseNameA(imagebase.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>(), nsize)

public actual fun GetDeviceDriverBaseNameW(imagebase: Long, lpbasename: PWSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_GetDeviceDriverBaseNameW(imagebase.toCPointer<ByteVar>(), lpbasename.toCPointer<ByteVar>(), nsize)

public actual fun GetDeviceDriverFileNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_GetDeviceDriverFileNameA(imagebase.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>(), nsize)

public actual fun GetDeviceDriverFileNameW(imagebase: Long, lpfilename: PWSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_GetDeviceDriverFileNameW(imagebase.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>(), nsize)

public actual fun GetMappedFileNameA(hprocess: HANDLE, lpv: Long, lpfilename: PSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_GetMappedFileNameA(hprocess.toCPointer<ByteVar>(), lpv.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>(), nsize)

public actual fun GetMappedFileNameW(hprocess: HANDLE, lpv: Long, lpfilename: PWSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_GetMappedFileNameW(hprocess.toCPointer<ByteVar>(), lpv.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>(), nsize)

public actual fun GetModuleBaseNameA(hprocess: HANDLE, hmodule: HMODULE, lpbasename: PSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_GetModuleBaseNameA(hprocess.toCPointer<ByteVar>(), hmodule.toCPointer<ByteVar>(), lpbasename.toCPointer<ByteVar>(), nsize)

public actual fun GetModuleBaseNameW(hprocess: HANDLE, hmodule: HMODULE, lpbasename: PWSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_GetModuleBaseNameW(hprocess.toCPointer<ByteVar>(), hmodule.toCPointer<ByteVar>(), lpbasename.toCPointer<ByteVar>(), nsize)

public actual fun GetModuleFileNameExA(hprocess: HANDLE, hmodule: HMODULE, lpfilename: PSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_GetModuleFileNameExA(hprocess.toCPointer<ByteVar>(), hmodule.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>(), nsize)

public actual fun GetModuleFileNameExW(hprocess: HANDLE, hmodule: HMODULE, lpfilename: PWSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_GetModuleFileNameExW(hprocess.toCPointer<ByteVar>(), hmodule.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>(), nsize)

public actual fun GetModuleInformation(hprocess: HANDLE, hmodule: HMODULE, lpmodinfo: Long, cb: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_GetModuleInformation(hprocess.toCPointer<ByteVar>(), hmodule.toCPointer<ByteVar>(), lpmodinfo.toCPointer<ByteVar>(), cb)

public actual fun GetPerformanceInfo(pperformanceinformation: Long, cb: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_GetPerformanceInfo(pperformanceinformation.toCPointer<ByteVar>(), cb)

public actual fun GetProcessImageFileNameA(hprocess: HANDLE, lpimagefilename: PSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_GetProcessImageFileNameA(hprocess.toCPointer<ByteVar>(), lpimagefilename.toCPointer<ByteVar>(), nsize)

public actual fun GetProcessImageFileNameW(hprocess: HANDLE, lpimagefilename: PWSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_GetProcessImageFileNameW(hprocess.toCPointer<ByteVar>(), lpimagefilename.toCPointer<ByteVar>(), nsize)

public actual fun GetProcessMemoryInfo(process: HANDLE, ppsmemcounters: Long, cb: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_GetProcessMemoryInfo(process.toCPointer<ByteVar>(), ppsmemcounters.toCPointer<ByteVar>(), cb)

public actual fun GetWsChanges(hprocess: HANDLE, lpwatchinfo: Long, cb: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_GetWsChanges(hprocess.toCPointer<ByteVar>(), lpwatchinfo.toCPointer<ByteVar>(), cb)

public actual fun GetWsChangesEx(hprocess: HANDLE, lpwatchinfoex: Long, cb: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_GetWsChangesEx(hprocess.toCPointer<ByteVar>(), lpwatchinfoex.toCPointer<ByteVar>(), cb.toCPointer<ByteVar>())

public actual fun InitializeProcessForWsWatch(hprocess: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_InitializeProcessForWsWatch(hprocess.toCPointer<ByteVar>())

public actual fun K32EmptyWorkingSet(hprocess: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32EmptyWorkingSet(hprocess.toCPointer<ByteVar>())

public actual fun K32EnumDeviceDrivers(lpimagebase: Long, cb: UInt, lpcbneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32EnumDeviceDrivers(lpimagebase.toCPointer<ByteVar>(), cb, lpcbneeded.toCPointer<ByteVar>())

public actual fun K32EnumPageFilesA(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKA, pcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32EnumPageFilesA(pcallbackroutine.toLong().toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>())

public actual fun K32EnumPageFilesW(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKW, pcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32EnumPageFilesW(pcallbackroutine.toLong().toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>())

public actual fun K32EnumProcessModules(hprocess: HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32EnumProcessModules(hprocess.toCPointer<ByteVar>(), lphmodule.toCPointer<ByteVar>(), cb, lpcbneeded.toCPointer<ByteVar>())

public actual fun K32EnumProcessModulesEx(hprocess: HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long, dwfilterflag: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32EnumProcessModulesEx(hprocess.toCPointer<ByteVar>(), lphmodule.toCPointer<ByteVar>(), cb, lpcbneeded.toCPointer<ByteVar>(), dwfilterflag)

public actual fun K32EnumProcesses(lpidprocess: Long, cb: UInt, lpcbneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32EnumProcesses(lpidprocess.toCPointer<ByteVar>(), cb, lpcbneeded.toCPointer<ByteVar>())

public actual fun K32GetDeviceDriverBaseNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32GetDeviceDriverBaseNameA(imagebase.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>(), nsize)

public actual fun K32GetDeviceDriverBaseNameW(imagebase: Long, lpbasename: PWSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32GetDeviceDriverBaseNameW(imagebase.toCPointer<ByteVar>(), lpbasename.toCPointer<ByteVar>(), nsize)

public actual fun K32GetDeviceDriverFileNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32GetDeviceDriverFileNameA(imagebase.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>(), nsize)

public actual fun K32GetDeviceDriverFileNameW(imagebase: Long, lpfilename: PWSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32GetDeviceDriverFileNameW(imagebase.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>(), nsize)

public actual fun K32GetMappedFileNameA(hprocess: HANDLE, lpv: Long, lpfilename: PSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32GetMappedFileNameA(hprocess.toCPointer<ByteVar>(), lpv.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>(), nsize)

public actual fun K32GetMappedFileNameW(hprocess: HANDLE, lpv: Long, lpfilename: PWSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32GetMappedFileNameW(hprocess.toCPointer<ByteVar>(), lpv.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>(), nsize)

public actual fun K32GetModuleBaseNameA(hprocess: HANDLE, hmodule: HMODULE, lpbasename: PSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32GetModuleBaseNameA(hprocess.toCPointer<ByteVar>(), hmodule.toCPointer<ByteVar>(), lpbasename.toCPointer<ByteVar>(), nsize)

public actual fun K32GetModuleBaseNameW(hprocess: HANDLE, hmodule: HMODULE, lpbasename: PWSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32GetModuleBaseNameW(hprocess.toCPointer<ByteVar>(), hmodule.toCPointer<ByteVar>(), lpbasename.toCPointer<ByteVar>(), nsize)

public actual fun K32GetModuleFileNameExA(hprocess: HANDLE, hmodule: HMODULE, lpfilename: PSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32GetModuleFileNameExA(hprocess.toCPointer<ByteVar>(), hmodule.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>(), nsize)

public actual fun K32GetModuleFileNameExW(hprocess: HANDLE, hmodule: HMODULE, lpfilename: PWSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32GetModuleFileNameExW(hprocess.toCPointer<ByteVar>(), hmodule.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>(), nsize)

public actual fun K32GetModuleInformation(hprocess: HANDLE, hmodule: HMODULE, lpmodinfo: Long, cb: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32GetModuleInformation(hprocess.toCPointer<ByteVar>(), hmodule.toCPointer<ByteVar>(), lpmodinfo.toCPointer<ByteVar>(), cb)

public actual fun K32GetPerformanceInfo(pperformanceinformation: Long, cb: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32GetPerformanceInfo(pperformanceinformation.toCPointer<ByteVar>(), cb)

public actual fun K32GetProcessImageFileNameA(hprocess: HANDLE, lpimagefilename: PSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32GetProcessImageFileNameA(hprocess.toCPointer<ByteVar>(), lpimagefilename.toCPointer<ByteVar>(), nsize)

public actual fun K32GetProcessImageFileNameW(hprocess: HANDLE, lpimagefilename: PWSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32GetProcessImageFileNameW(hprocess.toCPointer<ByteVar>(), lpimagefilename.toCPointer<ByteVar>(), nsize)

public actual fun K32GetProcessMemoryInfo(process: HANDLE, ppsmemcounters: Long, cb: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32GetProcessMemoryInfo(process.toCPointer<ByteVar>(), ppsmemcounters.toCPointer<ByteVar>(), cb)

public actual fun K32GetWsChanges(hprocess: HANDLE, lpwatchinfo: Long, cb: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32GetWsChanges(hprocess.toCPointer<ByteVar>(), lpwatchinfo.toCPointer<ByteVar>(), cb)

public actual fun K32GetWsChangesEx(hprocess: HANDLE, lpwatchinfoex: Long, cb: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32GetWsChangesEx(hprocess.toCPointer<ByteVar>(), lpwatchinfoex.toCPointer<ByteVar>(), cb.toCPointer<ByteVar>())

public actual fun K32InitializeProcessForWsWatch(hprocess: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32InitializeProcessForWsWatch(hprocess.toCPointer<ByteVar>())

public actual fun K32QueryWorkingSet(hprocess: HANDLE, pv: Long, cb: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32QueryWorkingSet(hprocess.toCPointer<ByteVar>(), pv.toCPointer<ByteVar>(), cb)

public actual fun K32QueryWorkingSetEx(hprocess: HANDLE, pv: Long, cb: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_K32QueryWorkingSetEx(hprocess.toCPointer<ByteVar>(), pv.toCPointer<ByteVar>(), cb)

public actual fun QueryWorkingSet(hprocess: HANDLE, pv: Long, cb: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_QueryWorkingSet(hprocess.toCPointer<ByteVar>(), pv.toCPointer<ByteVar>(), cb)

public actual fun QueryWorkingSetEx(hprocess: HANDLE, pv: Long, cb: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_QueryWorkingSetEx(hprocess.toCPointer<ByteVar>(), pv.toCPointer<ByteVar>(), cb)
