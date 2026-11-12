@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusEmptyWorkingSet
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusEnumDeviceDrivers
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusEnumPageFilesA
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusEnumPageFilesW
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusEnumProcessModules
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusEnumProcessModulesEx
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusEnumProcesses
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusGetDeviceDriverBaseNameA
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusGetDeviceDriverBaseNameW
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusGetDeviceDriverFileNameA
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusGetDeviceDriverFileNameW
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusGetMappedFileNameA
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusGetMappedFileNameW
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusGetModuleBaseNameA
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusGetModuleBaseNameW
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusGetModuleFileNameExA
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusGetModuleFileNameExW
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusGetModuleInformation
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusGetPerformanceInfo
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusGetProcessImageFileNameA
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusGetProcessImageFileNameW
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusGetProcessMemoryInfo
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusGetWsChanges
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusGetWsChangesEx
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusInitializeProcessForWsWatch
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32EmptyWorkingSet
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32EnumDeviceDrivers
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32EnumPageFilesA
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32EnumPageFilesW
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32EnumProcessModules
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32EnumProcessModulesEx
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32EnumProcesses
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverBaseNameA
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverBaseNameW
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverFileNameA
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverFileNameW
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32GetMappedFileNameA
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32GetMappedFileNameW
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32GetModuleBaseNameA
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32GetModuleBaseNameW
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32GetModuleFileNameExA
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32GetModuleFileNameExW
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32GetModuleInformation
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32GetPerformanceInfo
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32GetProcessImageFileNameA
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32GetProcessImageFileNameW
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32GetProcessMemoryInfo
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32GetWsChanges
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32GetWsChangesEx
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32InitializeProcessForWsWatch
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32QueryWorkingSet
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusK32QueryWorkingSetEx
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusQueryWorkingSet
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.cinterop.windowssysWindowsWin32SystemProcessstatusQueryWorkingSetEx
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun emptyWorkingSet(hprocess: Handle): Bool =
    windowssysWindowsWin32SystemProcessstatusEmptyWorkingSet(hprocess.rawAddress.toCPointer<ByteVar>())

public actual fun enumDeviceDrivers(lpimagebase: MutPtr<MutPtr<CVoid>>, cb: UInt, lpcbneeded: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemProcessstatusEnumDeviceDrivers(lpimagebase.rawAddress.toCPointer<ByteVar>(), cb, lpcbneeded.rawAddress.toCPointer<ByteVar>())

public actual fun enumPageFilesA(pcallbackroutine: PenumPageFileCallbacka, pcontext: MutPtr<CVoid>): Bool =
    windowssysWindowsWin32SystemProcessstatusEnumPageFilesA(0L.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>())

public actual fun enumPageFilesW(pcallbackroutine: PenumPageFileCallbackw, pcontext: MutPtr<CVoid>): Bool =
    windowssysWindowsWin32SystemProcessstatusEnumPageFilesW(0L.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>())

public actual fun enumProcessModules(hprocess: Handle, lphmodule: MutPtr<Hmodule>, cb: UInt, lpcbneeded: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemProcessstatusEnumProcessModules(hprocess.rawAddress.toCPointer<ByteVar>(), lphmodule.rawAddress.toCPointer<ByteVar>(), cb, lpcbneeded.rawAddress.toCPointer<ByteVar>())

public actual fun enumProcessModulesEx(hprocess: Handle, lphmodule: MutPtr<Hmodule>, cb: UInt, lpcbneeded: MutPtr<UInt>, dwfilterflag: EnumProcessModulesExFlags): Bool =
    windowssysWindowsWin32SystemProcessstatusEnumProcessModulesEx(hprocess.rawAddress.toCPointer<ByteVar>(), lphmodule.rawAddress.toCPointer<ByteVar>(), cb, lpcbneeded.rawAddress.toCPointer<ByteVar>(), dwfilterflag)

public actual fun enumProcesses(lpidprocess: MutPtr<UInt>, cb: UInt, lpcbneeded: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemProcessstatusEnumProcesses(lpidprocess.rawAddress.toCPointer<ByteVar>(), cb, lpcbneeded.rawAddress.toCPointer<ByteVar>())

public actual fun getDeviceDriverBaseNameA(imagebase: ConstPtr<CVoid>, lpfilename: Pstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusGetDeviceDriverBaseNameA(imagebase.rawAddress.toCPointer<ByteVar>(), lpfilename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun getDeviceDriverBaseNameW(imagebase: ConstPtr<CVoid>, lpbasename: Pwstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusGetDeviceDriverBaseNameW(imagebase.rawAddress.toCPointer<ByteVar>(), lpbasename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun getDeviceDriverFileNameA(imagebase: ConstPtr<CVoid>, lpfilename: Pstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusGetDeviceDriverFileNameA(imagebase.rawAddress.toCPointer<ByteVar>(), lpfilename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun getDeviceDriverFileNameW(imagebase: ConstPtr<CVoid>, lpfilename: Pwstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusGetDeviceDriverFileNameW(imagebase.rawAddress.toCPointer<ByteVar>(), lpfilename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun getMappedFileNameA(hprocess: Handle, lpv: ConstPtr<CVoid>, lpfilename: Pstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusGetMappedFileNameA(hprocess.rawAddress.toCPointer<ByteVar>(), lpv.rawAddress.toCPointer<ByteVar>(), lpfilename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun getMappedFileNameW(hprocess: Handle, lpv: ConstPtr<CVoid>, lpfilename: Pwstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusGetMappedFileNameW(hprocess.rawAddress.toCPointer<ByteVar>(), lpv.rawAddress.toCPointer<ByteVar>(), lpfilename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun getModuleBaseNameA(hprocess: Handle, hmodule: Hmodule, lpbasename: Pstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusGetModuleBaseNameA(hprocess.rawAddress.toCPointer<ByteVar>(), hmodule.rawAddress.toCPointer<ByteVar>(), lpbasename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun getModuleBaseNameW(hprocess: Handle, hmodule: Hmodule, lpbasename: Pwstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusGetModuleBaseNameW(hprocess.rawAddress.toCPointer<ByteVar>(), hmodule.rawAddress.toCPointer<ByteVar>(), lpbasename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun getModuleFileNameExA(hprocess: Handle, hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusGetModuleFileNameExA(hprocess.rawAddress.toCPointer<ByteVar>(), hmodule.rawAddress.toCPointer<ByteVar>(), lpfilename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun getModuleFileNameExW(hprocess: Handle, hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusGetModuleFileNameExW(hprocess.rawAddress.toCPointer<ByteVar>(), hmodule.rawAddress.toCPointer<ByteVar>(), lpfilename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun getModuleInformation(hprocess: Handle, hmodule: Hmodule, lpmodinfo: MutPtr<Moduleinfo>, cb: UInt): Bool =
    windowssysWindowsWin32SystemProcessstatusGetModuleInformation(hprocess.rawAddress.toCPointer<ByteVar>(), hmodule.rawAddress.toCPointer<ByteVar>(), lpmodinfo.rawAddress.toCPointer<ByteVar>(), cb)

public actual fun getPerformanceInfo(pperformanceinformation: MutPtr<PerformanceInformation>, cb: UInt): Bool =
    windowssysWindowsWin32SystemProcessstatusGetPerformanceInfo(pperformanceinformation.rawAddress.toCPointer<ByteVar>(), cb)

public actual fun getProcessImageFileNameA(hprocess: Handle, lpimagefilename: Pstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusGetProcessImageFileNameA(hprocess.rawAddress.toCPointer<ByteVar>(), lpimagefilename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun getProcessImageFileNameW(hprocess: Handle, lpimagefilename: Pwstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusGetProcessImageFileNameW(hprocess.rawAddress.toCPointer<ByteVar>(), lpimagefilename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun getProcessMemoryInfo(process: Handle, ppsmemcounters: MutPtr<ProcessMemoryCounters>, cb: UInt): Bool =
    windowssysWindowsWin32SystemProcessstatusGetProcessMemoryInfo(process.rawAddress.toCPointer<ByteVar>(), ppsmemcounters.rawAddress.toCPointer<ByteVar>(), cb)

public actual fun getWsChanges(hprocess: Handle, lpwatchinfo: MutPtr<PsapiWsWatchInformation>, cb: UInt): Bool =
    windowssysWindowsWin32SystemProcessstatusGetWsChanges(hprocess.rawAddress.toCPointer<ByteVar>(), lpwatchinfo.rawAddress.toCPointer<ByteVar>(), cb)

public actual fun getWsChangesEx(hprocess: Handle, lpwatchinfoex: MutPtr<PsapiWsWatchInformationEx>, cb: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemProcessstatusGetWsChangesEx(hprocess.rawAddress.toCPointer<ByteVar>(), lpwatchinfoex.rawAddress.toCPointer<ByteVar>(), cb.rawAddress.toCPointer<ByteVar>())

public actual fun initializeProcessForWsWatch(hprocess: Handle): Bool =
    windowssysWindowsWin32SystemProcessstatusInitializeProcessForWsWatch(hprocess.rawAddress.toCPointer<ByteVar>())

public actual fun k32EmptyWorkingSet(hprocess: Handle): Bool =
    windowssysWindowsWin32SystemProcessstatusK32EmptyWorkingSet(hprocess.rawAddress.toCPointer<ByteVar>())

public actual fun k32EnumDeviceDrivers(lpimagebase: MutPtr<MutPtr<CVoid>>, cb: UInt, lpcbneeded: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemProcessstatusK32EnumDeviceDrivers(lpimagebase.rawAddress.toCPointer<ByteVar>(), cb, lpcbneeded.rawAddress.toCPointer<ByteVar>())

public actual fun k32EnumPageFilesA(pcallbackroutine: PenumPageFileCallbacka, pcontext: MutPtr<CVoid>): Bool =
    windowssysWindowsWin32SystemProcessstatusK32EnumPageFilesA(0L.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>())

public actual fun k32EnumPageFilesW(pcallbackroutine: PenumPageFileCallbackw, pcontext: MutPtr<CVoid>): Bool =
    windowssysWindowsWin32SystemProcessstatusK32EnumPageFilesW(0L.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>())

public actual fun k32EnumProcessModules(hprocess: Handle, lphmodule: MutPtr<Hmodule>, cb: UInt, lpcbneeded: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemProcessstatusK32EnumProcessModules(hprocess.rawAddress.toCPointer<ByteVar>(), lphmodule.rawAddress.toCPointer<ByteVar>(), cb, lpcbneeded.rawAddress.toCPointer<ByteVar>())

public actual fun k32EnumProcessModulesEx(hprocess: Handle, lphmodule: MutPtr<Hmodule>, cb: UInt, lpcbneeded: MutPtr<UInt>, dwfilterflag: UInt): Bool =
    windowssysWindowsWin32SystemProcessstatusK32EnumProcessModulesEx(hprocess.rawAddress.toCPointer<ByteVar>(), lphmodule.rawAddress.toCPointer<ByteVar>(), cb, lpcbneeded.rawAddress.toCPointer<ByteVar>(), dwfilterflag)

public actual fun k32EnumProcesses(lpidprocess: MutPtr<UInt>, cb: UInt, lpcbneeded: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemProcessstatusK32EnumProcesses(lpidprocess.rawAddress.toCPointer<ByteVar>(), cb, lpcbneeded.rawAddress.toCPointer<ByteVar>())

public actual fun k32GetDeviceDriverBaseNameA(imagebase: ConstPtr<CVoid>, lpfilename: Pstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverBaseNameA(imagebase.rawAddress.toCPointer<ByteVar>(), lpfilename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun k32GetDeviceDriverBaseNameW(imagebase: ConstPtr<CVoid>, lpbasename: Pwstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverBaseNameW(imagebase.rawAddress.toCPointer<ByteVar>(), lpbasename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun k32GetDeviceDriverFileNameA(imagebase: ConstPtr<CVoid>, lpfilename: Pstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverFileNameA(imagebase.rawAddress.toCPointer<ByteVar>(), lpfilename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun k32GetDeviceDriverFileNameW(imagebase: ConstPtr<CVoid>, lpfilename: Pwstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverFileNameW(imagebase.rawAddress.toCPointer<ByteVar>(), lpfilename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun k32GetMappedFileNameA(hprocess: Handle, lpv: ConstPtr<CVoid>, lpfilename: Pstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusK32GetMappedFileNameA(hprocess.rawAddress.toCPointer<ByteVar>(), lpv.rawAddress.toCPointer<ByteVar>(), lpfilename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun k32GetMappedFileNameW(hprocess: Handle, lpv: ConstPtr<CVoid>, lpfilename: Pwstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusK32GetMappedFileNameW(hprocess.rawAddress.toCPointer<ByteVar>(), lpv.rawAddress.toCPointer<ByteVar>(), lpfilename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun k32GetModuleBaseNameA(hprocess: Handle, hmodule: Hmodule, lpbasename: Pstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusK32GetModuleBaseNameA(hprocess.rawAddress.toCPointer<ByteVar>(), hmodule.rawAddress.toCPointer<ByteVar>(), lpbasename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun k32GetModuleBaseNameW(hprocess: Handle, hmodule: Hmodule, lpbasename: Pwstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusK32GetModuleBaseNameW(hprocess.rawAddress.toCPointer<ByteVar>(), hmodule.rawAddress.toCPointer<ByteVar>(), lpbasename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun k32GetModuleFileNameExA(hprocess: Handle, hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusK32GetModuleFileNameExA(hprocess.rawAddress.toCPointer<ByteVar>(), hmodule.rawAddress.toCPointer<ByteVar>(), lpfilename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun k32GetModuleFileNameExW(hprocess: Handle, hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusK32GetModuleFileNameExW(hprocess.rawAddress.toCPointer<ByteVar>(), hmodule.rawAddress.toCPointer<ByteVar>(), lpfilename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun k32GetModuleInformation(hprocess: Handle, hmodule: Hmodule, lpmodinfo: MutPtr<Moduleinfo>, cb: UInt): Bool =
    windowssysWindowsWin32SystemProcessstatusK32GetModuleInformation(hprocess.rawAddress.toCPointer<ByteVar>(), hmodule.rawAddress.toCPointer<ByteVar>(), lpmodinfo.rawAddress.toCPointer<ByteVar>(), cb)

public actual fun k32GetPerformanceInfo(pperformanceinformation: MutPtr<PerformanceInformation>, cb: UInt): Bool =
    windowssysWindowsWin32SystemProcessstatusK32GetPerformanceInfo(pperformanceinformation.rawAddress.toCPointer<ByteVar>(), cb)

public actual fun k32GetProcessImageFileNameA(hprocess: Handle, lpimagefilename: Pstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusK32GetProcessImageFileNameA(hprocess.rawAddress.toCPointer<ByteVar>(), lpimagefilename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun k32GetProcessImageFileNameW(hprocess: Handle, lpimagefilename: Pwstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemProcessstatusK32GetProcessImageFileNameW(hprocess.rawAddress.toCPointer<ByteVar>(), lpimagefilename.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun k32GetProcessMemoryInfo(process: Handle, ppsmemcounters: MutPtr<ProcessMemoryCounters>, cb: UInt): Bool =
    windowssysWindowsWin32SystemProcessstatusK32GetProcessMemoryInfo(process.rawAddress.toCPointer<ByteVar>(), ppsmemcounters.rawAddress.toCPointer<ByteVar>(), cb)

public actual fun k32GetWsChanges(hprocess: Handle, lpwatchinfo: MutPtr<PsapiWsWatchInformation>, cb: UInt): Bool =
    windowssysWindowsWin32SystemProcessstatusK32GetWsChanges(hprocess.rawAddress.toCPointer<ByteVar>(), lpwatchinfo.rawAddress.toCPointer<ByteVar>(), cb)

public actual fun k32GetWsChangesEx(hprocess: Handle, lpwatchinfoex: MutPtr<PsapiWsWatchInformationEx>, cb: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemProcessstatusK32GetWsChangesEx(hprocess.rawAddress.toCPointer<ByteVar>(), lpwatchinfoex.rawAddress.toCPointer<ByteVar>(), cb.rawAddress.toCPointer<ByteVar>())

public actual fun k32InitializeProcessForWsWatch(hprocess: Handle): Bool =
    windowssysWindowsWin32SystemProcessstatusK32InitializeProcessForWsWatch(hprocess.rawAddress.toCPointer<ByteVar>())

public actual fun k32QueryWorkingSet(hprocess: Handle, pv: MutPtr<CVoid>, cb: UInt): Bool =
    windowssysWindowsWin32SystemProcessstatusK32QueryWorkingSet(hprocess.rawAddress.toCPointer<ByteVar>(), pv.rawAddress.toCPointer<ByteVar>(), cb)

public actual fun k32QueryWorkingSetEx(hprocess: Handle, pv: MutPtr<CVoid>, cb: UInt): Bool =
    windowssysWindowsWin32SystemProcessstatusK32QueryWorkingSetEx(hprocess.rawAddress.toCPointer<ByteVar>(), pv.rawAddress.toCPointer<ByteVar>(), cb)

public actual fun queryWorkingSet(hprocess: Handle, pv: MutPtr<CVoid>, cb: UInt): Bool =
    windowssysWindowsWin32SystemProcessstatusQueryWorkingSet(hprocess.rawAddress.toCPointer<ByteVar>(), pv.rawAddress.toCPointer<ByteVar>(), cb)

public actual fun queryWorkingSetEx(hprocess: Handle, pv: MutPtr<CVoid>, cb: UInt): Bool =
    windowssysWindowsWin32SystemProcessstatusQueryWorkingSetEx(hprocess.rawAddress.toCPointer<ByteVar>(), pv.rawAddress.toCPointer<ByteVar>(), cb)
