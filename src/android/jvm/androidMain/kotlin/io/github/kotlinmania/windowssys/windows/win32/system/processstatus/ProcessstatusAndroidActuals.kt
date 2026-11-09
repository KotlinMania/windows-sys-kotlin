@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE

private object WindowsWin32SystemProcessstatusJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_EmptyWorkingSet(hprocess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_EnumDeviceDrivers(lpimagebase: Long, cb: Int, lpcbneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_EnumPageFilesA(pcallbackroutine: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_EnumPageFilesW(pcallbackroutine: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_EnumProcessModules(hprocess: Long, lphmodule: Long, cb: Int, lpcbneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_EnumProcessModulesEx(hprocess: Long, lphmodule: Long, cb: Int, lpcbneeded: Long, dwfilterflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_EnumProcesses(lpidprocess: Long, cb: Int, lpcbneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_GetDeviceDriverBaseNameA(imagebase: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_GetDeviceDriverBaseNameW(imagebase: Long, lpbasename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_GetDeviceDriverFileNameA(imagebase: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_GetDeviceDriverFileNameW(imagebase: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_GetMappedFileNameA(hprocess: Long, lpv: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_GetMappedFileNameW(hprocess: Long, lpv: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_GetModuleBaseNameA(hprocess: Long, hmodule: Long, lpbasename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_GetModuleBaseNameW(hprocess: Long, hmodule: Long, lpbasename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_GetModuleFileNameExA(hprocess: Long, hmodule: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_GetModuleFileNameExW(hprocess: Long, hmodule: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_GetModuleInformation(hprocess: Long, hmodule: Long, lpmodinfo: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_GetPerformanceInfo(pperformanceinformation: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_GetProcessImageFileNameA(hprocess: Long, lpimagefilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_GetProcessImageFileNameW(hprocess: Long, lpimagefilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_GetProcessMemoryInfo(process: Long, ppsmemcounters: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_GetWsChanges(hprocess: Long, lpwatchinfo: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_GetWsChangesEx(hprocess: Long, lpwatchinfoex: Long, cb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_InitializeProcessForWsWatch(hprocess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32EmptyWorkingSet(hprocess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32EnumDeviceDrivers(lpimagebase: Long, cb: Int, lpcbneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32EnumPageFilesA(pcallbackroutine: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32EnumPageFilesW(pcallbackroutine: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32EnumProcessModules(hprocess: Long, lphmodule: Long, cb: Int, lpcbneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32EnumProcessModulesEx(hprocess: Long, lphmodule: Long, cb: Int, lpcbneeded: Long, dwfilterflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32EnumProcesses(lpidprocess: Long, cb: Int, lpcbneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32GetDeviceDriverBaseNameA(imagebase: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32GetDeviceDriverBaseNameW(imagebase: Long, lpbasename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32GetDeviceDriverFileNameA(imagebase: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32GetDeviceDriverFileNameW(imagebase: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32GetMappedFileNameA(hprocess: Long, lpv: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32GetMappedFileNameW(hprocess: Long, lpv: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32GetModuleBaseNameA(hprocess: Long, hmodule: Long, lpbasename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32GetModuleBaseNameW(hprocess: Long, hmodule: Long, lpbasename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32GetModuleFileNameExA(hprocess: Long, hmodule: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32GetModuleFileNameExW(hprocess: Long, hmodule: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32GetModuleInformation(hprocess: Long, hmodule: Long, lpmodinfo: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32GetPerformanceInfo(pperformanceinformation: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32GetProcessImageFileNameA(hprocess: Long, lpimagefilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32GetProcessImageFileNameW(hprocess: Long, lpimagefilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32GetProcessMemoryInfo(process: Long, ppsmemcounters: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32GetWsChanges(hprocess: Long, lpwatchinfo: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32GetWsChangesEx(hprocess: Long, lpwatchinfoex: Long, cb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32InitializeProcessForWsWatch(hprocess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32QueryWorkingSet(hprocess: Long, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_K32QueryWorkingSetEx(hprocess: Long, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_QueryWorkingSet(hprocess: Long, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_QueryWorkingSetEx(hprocess: Long, pv: Long, cb: Int): Int
}

public actual fun EmptyWorkingSet(hprocess: HANDLE): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_EmptyWorkingSet(hprocess)

public actual fun EnumDeviceDrivers(lpimagebase: Long, cb: UInt, lpcbneeded: Long): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_EnumDeviceDrivers(lpimagebase, cb.toInt(), lpcbneeded)

public actual fun EnumPageFilesA(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKA, pcontext: Long): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_EnumPageFilesA(pcallbackroutine.toLong(), pcontext)

public actual fun EnumPageFilesW(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKW, pcontext: Long): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_EnumPageFilesW(pcallbackroutine.toLong(), pcontext)

public actual fun EnumProcessModules(hprocess: HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_EnumProcessModules(hprocess, lphmodule, cb.toInt(), lpcbneeded)

public actual fun EnumProcessModulesEx(hprocess: HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long, dwfilterflag: ENUM_PROCESS_MODULES_EX_FLAGS): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_EnumProcessModulesEx(hprocess, lphmodule, cb.toInt(), lpcbneeded, dwfilterflag.toInt())

public actual fun EnumProcesses(lpidprocess: Long, cb: UInt, lpcbneeded: Long): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_EnumProcesses(lpidprocess, cb.toInt(), lpcbneeded)

public actual fun GetDeviceDriverBaseNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_GetDeviceDriverBaseNameA(imagebase, lpfilename, nsize.toInt()).toUInt()

public actual fun GetDeviceDriverBaseNameW(imagebase: Long, lpbasename: PWSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_GetDeviceDriverBaseNameW(imagebase, lpbasename, nsize.toInt()).toUInt()

public actual fun GetDeviceDriverFileNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_GetDeviceDriverFileNameA(imagebase, lpfilename, nsize.toInt()).toUInt()

public actual fun GetDeviceDriverFileNameW(imagebase: Long, lpfilename: PWSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_GetDeviceDriverFileNameW(imagebase, lpfilename, nsize.toInt()).toUInt()

public actual fun GetMappedFileNameA(hprocess: HANDLE, lpv: Long, lpfilename: PSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_GetMappedFileNameA(hprocess, lpv, lpfilename, nsize.toInt()).toUInt()

public actual fun GetMappedFileNameW(hprocess: HANDLE, lpv: Long, lpfilename: PWSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_GetMappedFileNameW(hprocess, lpv, lpfilename, nsize.toInt()).toUInt()

public actual fun GetModuleBaseNameA(hprocess: HANDLE, hmodule: HMODULE, lpbasename: PSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_GetModuleBaseNameA(hprocess, hmodule, lpbasename, nsize.toInt()).toUInt()

public actual fun GetModuleBaseNameW(hprocess: HANDLE, hmodule: HMODULE, lpbasename: PWSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_GetModuleBaseNameW(hprocess, hmodule, lpbasename, nsize.toInt()).toUInt()

public actual fun GetModuleFileNameExA(hprocess: HANDLE, hmodule: HMODULE, lpfilename: PSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_GetModuleFileNameExA(hprocess, hmodule, lpfilename, nsize.toInt()).toUInt()

public actual fun GetModuleFileNameExW(hprocess: HANDLE, hmodule: HMODULE, lpfilename: PWSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_GetModuleFileNameExW(hprocess, hmodule, lpfilename, nsize.toInt()).toUInt()

public actual fun GetModuleInformation(hprocess: HANDLE, hmodule: HMODULE, lpmodinfo: Long, cb: UInt): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_GetModuleInformation(hprocess, hmodule, lpmodinfo, cb.toInt())

public actual fun GetPerformanceInfo(pperformanceinformation: Long, cb: UInt): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_GetPerformanceInfo(pperformanceinformation, cb.toInt())

public actual fun GetProcessImageFileNameA(hprocess: HANDLE, lpimagefilename: PSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_GetProcessImageFileNameA(hprocess, lpimagefilename, nsize.toInt()).toUInt()

public actual fun GetProcessImageFileNameW(hprocess: HANDLE, lpimagefilename: PWSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_GetProcessImageFileNameW(hprocess, lpimagefilename, nsize.toInt()).toUInt()

public actual fun GetProcessMemoryInfo(process: HANDLE, ppsmemcounters: Long, cb: UInt): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_GetProcessMemoryInfo(process, ppsmemcounters, cb.toInt())

public actual fun GetWsChanges(hprocess: HANDLE, lpwatchinfo: Long, cb: UInt): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_GetWsChanges(hprocess, lpwatchinfo, cb.toInt())

public actual fun GetWsChangesEx(hprocess: HANDLE, lpwatchinfoex: Long, cb: Long): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_GetWsChangesEx(hprocess, lpwatchinfoex, cb)

public actual fun InitializeProcessForWsWatch(hprocess: HANDLE): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_InitializeProcessForWsWatch(hprocess)

public actual fun K32EmptyWorkingSet(hprocess: HANDLE): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32EmptyWorkingSet(hprocess)

public actual fun K32EnumDeviceDrivers(lpimagebase: Long, cb: UInt, lpcbneeded: Long): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32EnumDeviceDrivers(lpimagebase, cb.toInt(), lpcbneeded)

public actual fun K32EnumPageFilesA(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKA, pcontext: Long): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32EnumPageFilesA(pcallbackroutine.toLong(), pcontext)

public actual fun K32EnumPageFilesW(pcallbackroutine: PENUM_PAGE_FILE_CALLBACKW, pcontext: Long): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32EnumPageFilesW(pcallbackroutine.toLong(), pcontext)

public actual fun K32EnumProcessModules(hprocess: HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32EnumProcessModules(hprocess, lphmodule, cb.toInt(), lpcbneeded)

public actual fun K32EnumProcessModulesEx(hprocess: HANDLE, lphmodule: Long, cb: UInt, lpcbneeded: Long, dwfilterflag: UInt): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32EnumProcessModulesEx(hprocess, lphmodule, cb.toInt(), lpcbneeded, dwfilterflag.toInt())

public actual fun K32EnumProcesses(lpidprocess: Long, cb: UInt, lpcbneeded: Long): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32EnumProcesses(lpidprocess, cb.toInt(), lpcbneeded)

public actual fun K32GetDeviceDriverBaseNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32GetDeviceDriverBaseNameA(imagebase, lpfilename, nsize.toInt()).toUInt()

public actual fun K32GetDeviceDriverBaseNameW(imagebase: Long, lpbasename: PWSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32GetDeviceDriverBaseNameW(imagebase, lpbasename, nsize.toInt()).toUInt()

public actual fun K32GetDeviceDriverFileNameA(imagebase: Long, lpfilename: PSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32GetDeviceDriverFileNameA(imagebase, lpfilename, nsize.toInt()).toUInt()

public actual fun K32GetDeviceDriverFileNameW(imagebase: Long, lpfilename: PWSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32GetDeviceDriverFileNameW(imagebase, lpfilename, nsize.toInt()).toUInt()

public actual fun K32GetMappedFileNameA(hprocess: HANDLE, lpv: Long, lpfilename: PSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32GetMappedFileNameA(hprocess, lpv, lpfilename, nsize.toInt()).toUInt()

public actual fun K32GetMappedFileNameW(hprocess: HANDLE, lpv: Long, lpfilename: PWSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32GetMappedFileNameW(hprocess, lpv, lpfilename, nsize.toInt()).toUInt()

public actual fun K32GetModuleBaseNameA(hprocess: HANDLE, hmodule: HMODULE, lpbasename: PSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32GetModuleBaseNameA(hprocess, hmodule, lpbasename, nsize.toInt()).toUInt()

public actual fun K32GetModuleBaseNameW(hprocess: HANDLE, hmodule: HMODULE, lpbasename: PWSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32GetModuleBaseNameW(hprocess, hmodule, lpbasename, nsize.toInt()).toUInt()

public actual fun K32GetModuleFileNameExA(hprocess: HANDLE, hmodule: HMODULE, lpfilename: PSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32GetModuleFileNameExA(hprocess, hmodule, lpfilename, nsize.toInt()).toUInt()

public actual fun K32GetModuleFileNameExW(hprocess: HANDLE, hmodule: HMODULE, lpfilename: PWSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32GetModuleFileNameExW(hprocess, hmodule, lpfilename, nsize.toInt()).toUInt()

public actual fun K32GetModuleInformation(hprocess: HANDLE, hmodule: HMODULE, lpmodinfo: Long, cb: UInt): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32GetModuleInformation(hprocess, hmodule, lpmodinfo, cb.toInt())

public actual fun K32GetPerformanceInfo(pperformanceinformation: Long, cb: UInt): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32GetPerformanceInfo(pperformanceinformation, cb.toInt())

public actual fun K32GetProcessImageFileNameA(hprocess: HANDLE, lpimagefilename: PSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32GetProcessImageFileNameA(hprocess, lpimagefilename, nsize.toInt()).toUInt()

public actual fun K32GetProcessImageFileNameW(hprocess: HANDLE, lpimagefilename: PWSTR, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32GetProcessImageFileNameW(hprocess, lpimagefilename, nsize.toInt()).toUInt()

public actual fun K32GetProcessMemoryInfo(process: HANDLE, ppsmemcounters: Long, cb: UInt): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32GetProcessMemoryInfo(process, ppsmemcounters, cb.toInt())

public actual fun K32GetWsChanges(hprocess: HANDLE, lpwatchinfo: Long, cb: UInt): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32GetWsChanges(hprocess, lpwatchinfo, cb.toInt())

public actual fun K32GetWsChangesEx(hprocess: HANDLE, lpwatchinfoex: Long, cb: Long): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32GetWsChangesEx(hprocess, lpwatchinfoex, cb)

public actual fun K32InitializeProcessForWsWatch(hprocess: HANDLE): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32InitializeProcessForWsWatch(hprocess)

public actual fun K32QueryWorkingSet(hprocess: HANDLE, pv: Long, cb: UInt): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32QueryWorkingSet(hprocess, pv, cb.toInt())

public actual fun K32QueryWorkingSetEx(hprocess: HANDLE, pv: Long, cb: UInt): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_K32QueryWorkingSetEx(hprocess, pv, cb.toInt())

public actual fun QueryWorkingSet(hprocess: HANDLE, pv: Long, cb: UInt): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_QueryWorkingSet(hprocess, pv, cb.toInt())

public actual fun QueryWorkingSetEx(hprocess: HANDLE, pv: Long, cb: UInt): BOOL =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_QueryWorkingSetEx(hprocess, pv, cb.toInt())
