@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule

private object WindowsWin32SystemProcessstatusJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_emptyWorkingSet(hprocess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_enumDeviceDrivers(lpimagebase: Long, cb: Int, lpcbneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_enumPageFilesA(pcallbackroutine: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_enumPageFilesW(pcallbackroutine: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_enumProcessModules(hprocess: Long, lphmodule: Long, cb: Int, lpcbneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_enumProcessModulesEx(hprocess: Long, lphmodule: Long, cb: Int, lpcbneeded: Long, dwfilterflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_enumProcesses(lpidprocess: Long, cb: Int, lpcbneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_getDeviceDriverBaseNameA(imagebase: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_getDeviceDriverBaseNameW(imagebase: Long, lpbasename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_getDeviceDriverFileNameA(imagebase: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_getDeviceDriverFileNameW(imagebase: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_getMappedFileNameA(hprocess: Long, lpv: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_getMappedFileNameW(hprocess: Long, lpv: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_getModuleBaseNameA(hprocess: Long, hmodule: Long, lpbasename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_getModuleBaseNameW(hprocess: Long, hmodule: Long, lpbasename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_getModuleFileNameExA(hprocess: Long, hmodule: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_getModuleFileNameExW(hprocess: Long, hmodule: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_getModuleInformation(hprocess: Long, hmodule: Long, lpmodinfo: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_getPerformanceInfo(pperformanceinformation: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_getProcessImageFileNameA(hprocess: Long, lpimagefilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_getProcessImageFileNameW(hprocess: Long, lpimagefilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_getProcessMemoryInfo(process: Long, ppsmemcounters: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_getWsChanges(hprocess: Long, lpwatchinfo: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_getWsChangesEx(hprocess: Long, lpwatchinfoex: Long, cb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_initializeProcessForWsWatch(hprocess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32EmptyWorkingSet(hprocess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32EnumDeviceDrivers(lpimagebase: Long, cb: Int, lpcbneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32EnumPageFilesA(pcallbackroutine: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32EnumPageFilesW(pcallbackroutine: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32EnumProcessModules(hprocess: Long, lphmodule: Long, cb: Int, lpcbneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32EnumProcessModulesEx(hprocess: Long, lphmodule: Long, cb: Int, lpcbneeded: Long, dwfilterflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32EnumProcesses(lpidprocess: Long, cb: Int, lpcbneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32GetDeviceDriverBaseNameA(imagebase: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32GetDeviceDriverBaseNameW(imagebase: Long, lpbasename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32GetDeviceDriverFileNameA(imagebase: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32GetDeviceDriverFileNameW(imagebase: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32GetMappedFileNameA(hprocess: Long, lpv: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32GetMappedFileNameW(hprocess: Long, lpv: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32GetModuleBaseNameA(hprocess: Long, hmodule: Long, lpbasename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32GetModuleBaseNameW(hprocess: Long, hmodule: Long, lpbasename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32GetModuleFileNameExA(hprocess: Long, hmodule: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32GetModuleFileNameExW(hprocess: Long, hmodule: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32GetModuleInformation(hprocess: Long, hmodule: Long, lpmodinfo: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32GetPerformanceInfo(pperformanceinformation: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32GetProcessImageFileNameA(hprocess: Long, lpimagefilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32GetProcessImageFileNameW(hprocess: Long, lpimagefilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32GetProcessMemoryInfo(process: Long, ppsmemcounters: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32GetWsChanges(hprocess: Long, lpwatchinfo: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32GetWsChangesEx(hprocess: Long, lpwatchinfoex: Long, cb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32InitializeProcessForWsWatch(hprocess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32QueryWorkingSet(hprocess: Long, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_k32QueryWorkingSetEx(hprocess: Long, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_queryWorkingSet(hprocess: Long, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_processstatus_queryWorkingSetEx(hprocess: Long, pv: Long, cb: Int): Int
}

public actual fun emptyWorkingSet(hprocess: Handle): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_emptyWorkingSet((hprocess?.value ?: 0L))

public actual fun enumDeviceDrivers(lpimagebase: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_enumDeviceDrivers((lpimagebase?.value ?: 0L), cb.toInt(), (lpcbneeded?.value ?: 0L))

public actual fun enumPageFilesA(pcallbackroutine: PenumPageFileCallbacka, pcontext: COpaquePointer?): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_enumPageFilesA(0L, (pcontext?.value ?: 0L))

public actual fun enumPageFilesW(pcallbackroutine: PenumPageFileCallbackw, pcontext: COpaquePointer?): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_enumPageFilesW(0L, (pcontext?.value ?: 0L))

public actual fun enumProcessModules(hprocess: Handle, lphmodule: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_enumProcessModules((hprocess?.value ?: 0L), (lphmodule?.value ?: 0L), cb.toInt(), (lpcbneeded?.value ?: 0L))

public actual fun enumProcessModulesEx(hprocess: Handle, lphmodule: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?, dwfilterflag: EnumProcessModulesExFlags): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_enumProcessModulesEx((hprocess?.value ?: 0L), (lphmodule?.value ?: 0L), cb.toInt(), (lpcbneeded?.value ?: 0L), dwfilterflag.toInt())

public actual fun enumProcesses(lpidprocess: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_enumProcesses((lpidprocess?.value ?: 0L), cb.toInt(), (lpcbneeded?.value ?: 0L))

public actual fun getDeviceDriverBaseNameA(imagebase: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_getDeviceDriverBaseNameA((imagebase?.value ?: 0L), (lpfilename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getDeviceDriverBaseNameW(imagebase: COpaquePointer?, lpbasename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_getDeviceDriverBaseNameW((imagebase?.value ?: 0L), (lpbasename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getDeviceDriverFileNameA(imagebase: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_getDeviceDriverFileNameA((imagebase?.value ?: 0L), (lpfilename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getDeviceDriverFileNameW(imagebase: COpaquePointer?, lpfilename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_getDeviceDriverFileNameW((imagebase?.value ?: 0L), (lpfilename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getMappedFileNameA(hprocess: Handle, lpv: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_getMappedFileNameA((hprocess?.value ?: 0L), (lpv?.value ?: 0L), (lpfilename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getMappedFileNameW(hprocess: Handle, lpv: COpaquePointer?, lpfilename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_getMappedFileNameW((hprocess?.value ?: 0L), (lpv?.value ?: 0L), (lpfilename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getModuleBaseNameA(hprocess: Handle, hmodule: Hmodule, lpbasename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_getModuleBaseNameA((hprocess?.value ?: 0L), (hmodule?.value ?: 0L), (lpbasename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getModuleBaseNameW(hprocess: Handle, hmodule: Hmodule, lpbasename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_getModuleBaseNameW((hprocess?.value ?: 0L), (hmodule?.value ?: 0L), (lpbasename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getModuleFileNameExA(hprocess: Handle, hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_getModuleFileNameExA((hprocess?.value ?: 0L), (hmodule?.value ?: 0L), (lpfilename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getModuleFileNameExW(hprocess: Handle, hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_getModuleFileNameExW((hprocess?.value ?: 0L), (hmodule?.value ?: 0L), (lpfilename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getModuleInformation(hprocess: Handle, hmodule: Hmodule, lpmodinfo: COpaquePointer?, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_getModuleInformation((hprocess?.value ?: 0L), (hmodule?.value ?: 0L), (lpmodinfo?.value ?: 0L), cb.toInt())

public actual fun getPerformanceInfo(pperformanceinformation: COpaquePointer?, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_getPerformanceInfo((pperformanceinformation?.value ?: 0L), cb.toInt())

public actual fun getProcessImageFileNameA(hprocess: Handle, lpimagefilename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_getProcessImageFileNameA((hprocess?.value ?: 0L), (lpimagefilename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getProcessImageFileNameW(hprocess: Handle, lpimagefilename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_getProcessImageFileNameW((hprocess?.value ?: 0L), (lpimagefilename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getProcessMemoryInfo(process: Handle, ppsmemcounters: COpaquePointer?, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_getProcessMemoryInfo((process?.value ?: 0L), (ppsmemcounters?.value ?: 0L), cb.toInt())

public actual fun getWsChanges(hprocess: Handle, lpwatchinfo: COpaquePointer?, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_getWsChanges((hprocess?.value ?: 0L), (lpwatchinfo?.value ?: 0L), cb.toInt())

public actual fun getWsChangesEx(hprocess: Handle, lpwatchinfoex: COpaquePointer?, cb: COpaquePointer?): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_getWsChangesEx((hprocess?.value ?: 0L), (lpwatchinfoex?.value ?: 0L), (cb?.value ?: 0L))

public actual fun initializeProcessForWsWatch(hprocess: Handle): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_initializeProcessForWsWatch((hprocess?.value ?: 0L))

public actual fun k32EmptyWorkingSet(hprocess: Handle): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32EmptyWorkingSet((hprocess?.value ?: 0L))

public actual fun k32EnumDeviceDrivers(lpimagebase: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32EnumDeviceDrivers((lpimagebase?.value ?: 0L), cb.toInt(), (lpcbneeded?.value ?: 0L))

public actual fun k32EnumPageFilesA(pcallbackroutine: PenumPageFileCallbacka, pcontext: COpaquePointer?): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32EnumPageFilesA(0L, (pcontext?.value ?: 0L))

public actual fun k32EnumPageFilesW(pcallbackroutine: PenumPageFileCallbackw, pcontext: COpaquePointer?): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32EnumPageFilesW(0L, (pcontext?.value ?: 0L))

public actual fun k32EnumProcessModules(hprocess: Handle, lphmodule: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32EnumProcessModules((hprocess?.value ?: 0L), (lphmodule?.value ?: 0L), cb.toInt(), (lpcbneeded?.value ?: 0L))

public actual fun k32EnumProcessModulesEx(hprocess: Handle, lphmodule: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?, dwfilterflag: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32EnumProcessModulesEx((hprocess?.value ?: 0L), (lphmodule?.value ?: 0L), cb.toInt(), (lpcbneeded?.value ?: 0L), dwfilterflag.toInt())

public actual fun k32EnumProcesses(lpidprocess: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32EnumProcesses((lpidprocess?.value ?: 0L), cb.toInt(), (lpcbneeded?.value ?: 0L))

public actual fun k32GetDeviceDriverBaseNameA(imagebase: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32GetDeviceDriverBaseNameA((imagebase?.value ?: 0L), (lpfilename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun k32GetDeviceDriverBaseNameW(imagebase: COpaquePointer?, lpbasename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32GetDeviceDriverBaseNameW((imagebase?.value ?: 0L), (lpbasename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun k32GetDeviceDriverFileNameA(imagebase: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32GetDeviceDriverFileNameA((imagebase?.value ?: 0L), (lpfilename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun k32GetDeviceDriverFileNameW(imagebase: COpaquePointer?, lpfilename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32GetDeviceDriverFileNameW((imagebase?.value ?: 0L), (lpfilename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun k32GetMappedFileNameA(hprocess: Handle, lpv: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32GetMappedFileNameA((hprocess?.value ?: 0L), (lpv?.value ?: 0L), (lpfilename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun k32GetMappedFileNameW(hprocess: Handle, lpv: COpaquePointer?, lpfilename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32GetMappedFileNameW((hprocess?.value ?: 0L), (lpv?.value ?: 0L), (lpfilename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun k32GetModuleBaseNameA(hprocess: Handle, hmodule: Hmodule, lpbasename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32GetModuleBaseNameA((hprocess?.value ?: 0L), (hmodule?.value ?: 0L), (lpbasename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun k32GetModuleBaseNameW(hprocess: Handle, hmodule: Hmodule, lpbasename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32GetModuleBaseNameW((hprocess?.value ?: 0L), (hmodule?.value ?: 0L), (lpbasename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun k32GetModuleFileNameExA(hprocess: Handle, hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32GetModuleFileNameExA((hprocess?.value ?: 0L), (hmodule?.value ?: 0L), (lpfilename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun k32GetModuleFileNameExW(hprocess: Handle, hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32GetModuleFileNameExW((hprocess?.value ?: 0L), (hmodule?.value ?: 0L), (lpfilename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun k32GetModuleInformation(hprocess: Handle, hmodule: Hmodule, lpmodinfo: COpaquePointer?, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32GetModuleInformation((hprocess?.value ?: 0L), (hmodule?.value ?: 0L), (lpmodinfo?.value ?: 0L), cb.toInt())

public actual fun k32GetPerformanceInfo(pperformanceinformation: COpaquePointer?, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32GetPerformanceInfo((pperformanceinformation?.value ?: 0L), cb.toInt())

public actual fun k32GetProcessImageFileNameA(hprocess: Handle, lpimagefilename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32GetProcessImageFileNameA((hprocess?.value ?: 0L), (lpimagefilename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun k32GetProcessImageFileNameW(hprocess: Handle, lpimagefilename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32GetProcessImageFileNameW((hprocess?.value ?: 0L), (lpimagefilename?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun k32GetProcessMemoryInfo(process: Handle, ppsmemcounters: COpaquePointer?, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32GetProcessMemoryInfo((process?.value ?: 0L), (ppsmemcounters?.value ?: 0L), cb.toInt())

public actual fun k32GetWsChanges(hprocess: Handle, lpwatchinfo: COpaquePointer?, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32GetWsChanges((hprocess?.value ?: 0L), (lpwatchinfo?.value ?: 0L), cb.toInt())

public actual fun k32GetWsChangesEx(hprocess: Handle, lpwatchinfoex: COpaquePointer?, cb: COpaquePointer?): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32GetWsChangesEx((hprocess?.value ?: 0L), (lpwatchinfoex?.value ?: 0L), (cb?.value ?: 0L))

public actual fun k32InitializeProcessForWsWatch(hprocess: Handle): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32InitializeProcessForWsWatch((hprocess?.value ?: 0L))

public actual fun k32QueryWorkingSet(hprocess: Handle, pv: COpaquePointer?, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32QueryWorkingSet((hprocess?.value ?: 0L), (pv?.value ?: 0L), cb.toInt())

public actual fun k32QueryWorkingSetEx(hprocess: Handle, pv: COpaquePointer?, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_k32QueryWorkingSetEx((hprocess?.value ?: 0L), (pv?.value ?: 0L), cb.toInt())

public actual fun queryWorkingSet(hprocess: Handle, pv: COpaquePointer?, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_queryWorkingSet((hprocess?.value ?: 0L), (pv?.value ?: 0L), cb.toInt())

public actual fun queryWorkingSetEx(hprocess: Handle, pv: COpaquePointer?, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssys_windows_win32_system_processstatus_queryWorkingSetEx((hprocess?.value ?: 0L), (pv?.value ?: 0L), cb.toInt())
