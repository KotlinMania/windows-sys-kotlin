@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun emptyWorkingSet(hprocess: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_emptyWorkingSet(hprocess?.value?.toCPointer<ByteVar>())

public actual fun enumDeviceDrivers(lpimagebase: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_enumDeviceDrivers(lpimagebase?.value?.toCPointer<ByteVar>(), cb, lpcbneeded?.value?.toCPointer<ByteVar>())

public actual fun enumPageFilesA(pcallbackroutine: PenumPageFileCallbacka, pcontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_enumPageFilesA(0L.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>())

public actual fun enumPageFilesW(pcallbackroutine: PenumPageFileCallbackw, pcontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_enumPageFilesW(0L.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>())

public actual fun enumProcessModules(hprocess: Handle, lphmodule: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_enumProcessModules(hprocess?.value?.toCPointer<ByteVar>(), lphmodule?.value?.toCPointer<ByteVar>(), cb, lpcbneeded?.value?.toCPointer<ByteVar>())

public actual fun enumProcessModulesEx(hprocess: Handle, lphmodule: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?, dwfilterflag: EnumProcessModulesExFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_enumProcessModulesEx(hprocess?.value?.toCPointer<ByteVar>(), lphmodule?.value?.toCPointer<ByteVar>(), cb, lpcbneeded?.value?.toCPointer<ByteVar>(), dwfilterflag)

public actual fun enumProcesses(lpidprocess: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_enumProcesses(lpidprocess?.value?.toCPointer<ByteVar>(), cb, lpcbneeded?.value?.toCPointer<ByteVar>())

public actual fun getDeviceDriverBaseNameA(imagebase: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_getDeviceDriverBaseNameA(imagebase?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getDeviceDriverBaseNameW(imagebase: COpaquePointer?, lpbasename: Pwstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_getDeviceDriverBaseNameW(imagebase?.value?.toCPointer<ByteVar>(), lpbasename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getDeviceDriverFileNameA(imagebase: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_getDeviceDriverFileNameA(imagebase?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getDeviceDriverFileNameW(imagebase: COpaquePointer?, lpfilename: Pwstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_getDeviceDriverFileNameW(imagebase?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getMappedFileNameA(hprocess: Handle, lpv: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_getMappedFileNameA(hprocess?.value?.toCPointer<ByteVar>(), lpv?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getMappedFileNameW(hprocess: Handle, lpv: COpaquePointer?, lpfilename: Pwstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_getMappedFileNameW(hprocess?.value?.toCPointer<ByteVar>(), lpv?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getModuleBaseNameA(hprocess: Handle, hmodule: Hmodule, lpbasename: Pstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_getModuleBaseNameA(hprocess?.value?.toCPointer<ByteVar>(), hmodule?.value?.toCPointer<ByteVar>(), lpbasename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getModuleBaseNameW(hprocess: Handle, hmodule: Hmodule, lpbasename: Pwstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_getModuleBaseNameW(hprocess?.value?.toCPointer<ByteVar>(), hmodule?.value?.toCPointer<ByteVar>(), lpbasename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getModuleFileNameExA(hprocess: Handle, hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_getModuleFileNameExA(hprocess?.value?.toCPointer<ByteVar>(), hmodule?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getModuleFileNameExW(hprocess: Handle, hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_getModuleFileNameExW(hprocess?.value?.toCPointer<ByteVar>(), hmodule?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getModuleInformation(hprocess: Handle, hmodule: Hmodule, lpmodinfo: COpaquePointer?, cb: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_getModuleInformation(hprocess?.value?.toCPointer<ByteVar>(), hmodule?.value?.toCPointer<ByteVar>(), lpmodinfo?.value?.toCPointer<ByteVar>(), cb)

public actual fun getPerformanceInfo(pperformanceinformation: COpaquePointer?, cb: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_getPerformanceInfo(pperformanceinformation?.value?.toCPointer<ByteVar>(), cb)

public actual fun getProcessImageFileNameA(hprocess: Handle, lpimagefilename: Pstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_getProcessImageFileNameA(hprocess?.value?.toCPointer<ByteVar>(), lpimagefilename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getProcessImageFileNameW(hprocess: Handle, lpimagefilename: Pwstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_getProcessImageFileNameW(hprocess?.value?.toCPointer<ByteVar>(), lpimagefilename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getProcessMemoryInfo(process: Handle, ppsmemcounters: COpaquePointer?, cb: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_getProcessMemoryInfo(process?.value?.toCPointer<ByteVar>(), ppsmemcounters?.value?.toCPointer<ByteVar>(), cb)

public actual fun getWsChanges(hprocess: Handle, lpwatchinfo: COpaquePointer?, cb: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_getWsChanges(hprocess?.value?.toCPointer<ByteVar>(), lpwatchinfo?.value?.toCPointer<ByteVar>(), cb)

public actual fun getWsChangesEx(hprocess: Handle, lpwatchinfoex: COpaquePointer?, cb: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_getWsChangesEx(hprocess?.value?.toCPointer<ByteVar>(), lpwatchinfoex?.value?.toCPointer<ByteVar>(), cb?.value?.toCPointer<ByteVar>())

public actual fun initializeProcessForWsWatch(hprocess: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_initializeProcessForWsWatch(hprocess?.value?.toCPointer<ByteVar>())

public actual fun k32EmptyWorkingSet(hprocess: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32EmptyWorkingSet(hprocess?.value?.toCPointer<ByteVar>())

public actual fun k32EnumDeviceDrivers(lpimagebase: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32EnumDeviceDrivers(lpimagebase?.value?.toCPointer<ByteVar>(), cb, lpcbneeded?.value?.toCPointer<ByteVar>())

public actual fun k32EnumPageFilesA(pcallbackroutine: PenumPageFileCallbacka, pcontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32EnumPageFilesA(0L.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>())

public actual fun k32EnumPageFilesW(pcallbackroutine: PenumPageFileCallbackw, pcontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32EnumPageFilesW(0L.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>())

public actual fun k32EnumProcessModules(hprocess: Handle, lphmodule: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32EnumProcessModules(hprocess?.value?.toCPointer<ByteVar>(), lphmodule?.value?.toCPointer<ByteVar>(), cb, lpcbneeded?.value?.toCPointer<ByteVar>())

public actual fun k32EnumProcessModulesEx(hprocess: Handle, lphmodule: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?, dwfilterflag: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32EnumProcessModulesEx(hprocess?.value?.toCPointer<ByteVar>(), lphmodule?.value?.toCPointer<ByteVar>(), cb, lpcbneeded?.value?.toCPointer<ByteVar>(), dwfilterflag)

public actual fun k32EnumProcesses(lpidprocess: COpaquePointer?, cb: UInt, lpcbneeded: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32EnumProcesses(lpidprocess?.value?.toCPointer<ByteVar>(), cb, lpcbneeded?.value?.toCPointer<ByteVar>())

public actual fun k32GetDeviceDriverBaseNameA(imagebase: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32GetDeviceDriverBaseNameA(imagebase?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun k32GetDeviceDriverBaseNameW(imagebase: COpaquePointer?, lpbasename: Pwstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32GetDeviceDriverBaseNameW(imagebase?.value?.toCPointer<ByteVar>(), lpbasename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun k32GetDeviceDriverFileNameA(imagebase: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32GetDeviceDriverFileNameA(imagebase?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun k32GetDeviceDriverFileNameW(imagebase: COpaquePointer?, lpfilename: Pwstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32GetDeviceDriverFileNameW(imagebase?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun k32GetMappedFileNameA(hprocess: Handle, lpv: COpaquePointer?, lpfilename: Pstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32GetMappedFileNameA(hprocess?.value?.toCPointer<ByteVar>(), lpv?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun k32GetMappedFileNameW(hprocess: Handle, lpv: COpaquePointer?, lpfilename: Pwstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32GetMappedFileNameW(hprocess?.value?.toCPointer<ByteVar>(), lpv?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun k32GetModuleBaseNameA(hprocess: Handle, hmodule: Hmodule, lpbasename: Pstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32GetModuleBaseNameA(hprocess?.value?.toCPointer<ByteVar>(), hmodule?.value?.toCPointer<ByteVar>(), lpbasename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun k32GetModuleBaseNameW(hprocess: Handle, hmodule: Hmodule, lpbasename: Pwstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32GetModuleBaseNameW(hprocess?.value?.toCPointer<ByteVar>(), hmodule?.value?.toCPointer<ByteVar>(), lpbasename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun k32GetModuleFileNameExA(hprocess: Handle, hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32GetModuleFileNameExA(hprocess?.value?.toCPointer<ByteVar>(), hmodule?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun k32GetModuleFileNameExW(hprocess: Handle, hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32GetModuleFileNameExW(hprocess?.value?.toCPointer<ByteVar>(), hmodule?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun k32GetModuleInformation(hprocess: Handle, hmodule: Hmodule, lpmodinfo: COpaquePointer?, cb: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32GetModuleInformation(hprocess?.value?.toCPointer<ByteVar>(), hmodule?.value?.toCPointer<ByteVar>(), lpmodinfo?.value?.toCPointer<ByteVar>(), cb)

public actual fun k32GetPerformanceInfo(pperformanceinformation: COpaquePointer?, cb: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32GetPerformanceInfo(pperformanceinformation?.value?.toCPointer<ByteVar>(), cb)

public actual fun k32GetProcessImageFileNameA(hprocess: Handle, lpimagefilename: Pstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32GetProcessImageFileNameA(hprocess?.value?.toCPointer<ByteVar>(), lpimagefilename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun k32GetProcessImageFileNameW(hprocess: Handle, lpimagefilename: Pwstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32GetProcessImageFileNameW(hprocess?.value?.toCPointer<ByteVar>(), lpimagefilename?.value?.toCPointer<ByteVar>(), nsize)

public actual fun k32GetProcessMemoryInfo(process: Handle, ppsmemcounters: COpaquePointer?, cb: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32GetProcessMemoryInfo(process?.value?.toCPointer<ByteVar>(), ppsmemcounters?.value?.toCPointer<ByteVar>(), cb)

public actual fun k32GetWsChanges(hprocess: Handle, lpwatchinfo: COpaquePointer?, cb: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32GetWsChanges(hprocess?.value?.toCPointer<ByteVar>(), lpwatchinfo?.value?.toCPointer<ByteVar>(), cb)

public actual fun k32GetWsChangesEx(hprocess: Handle, lpwatchinfoex: COpaquePointer?, cb: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32GetWsChangesEx(hprocess?.value?.toCPointer<ByteVar>(), lpwatchinfoex?.value?.toCPointer<ByteVar>(), cb?.value?.toCPointer<ByteVar>())

public actual fun k32InitializeProcessForWsWatch(hprocess: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32InitializeProcessForWsWatch(hprocess?.value?.toCPointer<ByteVar>())

public actual fun k32QueryWorkingSet(hprocess: Handle, pv: COpaquePointer?, cb: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32QueryWorkingSet(hprocess?.value?.toCPointer<ByteVar>(), pv?.value?.toCPointer<ByteVar>(), cb)

public actual fun k32QueryWorkingSetEx(hprocess: Handle, pv: COpaquePointer?, cb: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_k32QueryWorkingSetEx(hprocess?.value?.toCPointer<ByteVar>(), pv?.value?.toCPointer<ByteVar>(), cb)

public actual fun queryWorkingSet(hprocess: Handle, pv: COpaquePointer?, cb: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_queryWorkingSet(hprocess?.value?.toCPointer<ByteVar>(), pv?.value?.toCPointer<ByteVar>(), cb)

public actual fun queryWorkingSetEx(hprocess: Handle, pv: COpaquePointer?, cb: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssys_windows_win32_system_processstatus_queryWorkingSetEx(hprocess?.value?.toCPointer<ByteVar>(), pv?.value?.toCPointer<ByteVar>(), cb)
