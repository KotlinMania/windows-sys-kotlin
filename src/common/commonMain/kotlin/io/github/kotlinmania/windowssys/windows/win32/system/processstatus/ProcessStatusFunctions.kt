package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule

public expect fun emptyWorkingSet(hprocess: Handle): Bool

public expect fun enumDeviceDrivers(lpimagebase: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool

public expect fun enumPageFilesA(pcallbackroutine: PenumPageFileCallbacka, pcontext: MutPtr): Bool

public expect fun enumPageFilesW(pcallbackroutine: PenumPageFileCallbackw, pcontext: MutPtr): Bool

public expect fun enumProcessModules(hprocess: Handle, lphmodule: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool

public expect fun enumProcessModulesEx(hprocess: Handle, lphmodule: MutPtr, cb: UInt, lpcbneeded: MutPtr, dwfilterflag: EnumProcessModulesExFlags): Bool

public expect fun enumProcesses(lpidprocess: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool

public expect fun getDeviceDriverBaseNameA(imagebase: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt

public expect fun getDeviceDriverBaseNameW(imagebase: ConstPtr, lpbasename: Pwstr, nsize: UInt): UInt

public expect fun getDeviceDriverFileNameA(imagebase: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt

public expect fun getDeviceDriverFileNameW(imagebase: ConstPtr, lpfilename: Pwstr, nsize: UInt): UInt

public expect fun getMappedFileNameA(hprocess: Handle, lpv: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt

public expect fun getMappedFileNameW(hprocess: Handle, lpv: ConstPtr, lpfilename: Pwstr, nsize: UInt): UInt

public expect fun getModuleBaseNameA(hprocess: Handle, hmodule: Hmodule, lpbasename: Pstr, nsize: UInt): UInt

public expect fun getModuleBaseNameW(hprocess: Handle, hmodule: Hmodule, lpbasename: Pwstr, nsize: UInt): UInt

public expect fun getModuleFileNameExA(hprocess: Handle, hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt

public expect fun getModuleFileNameExW(hprocess: Handle, hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt

public expect fun getModuleInformation(hprocess: Handle, hmodule: Hmodule, lpmodinfo: MutPtr, cb: UInt): Bool

public expect fun getPerformanceInfo(pperformanceinformation: MutPtr, cb: UInt): Bool

public expect fun getProcessImageFileNameA(hprocess: Handle, lpimagefilename: Pstr, nsize: UInt): UInt

public expect fun getProcessImageFileNameW(hprocess: Handle, lpimagefilename: Pwstr, nsize: UInt): UInt

public expect fun getProcessMemoryInfo(process: Handle, ppsmemcounters: MutPtr, cb: UInt): Bool

public expect fun getWsChanges(hprocess: Handle, lpwatchinfo: MutPtr, cb: UInt): Bool

public expect fun getWsChangesEx(hprocess: Handle, lpwatchinfoex: MutPtr, cb: MutPtr): Bool

public expect fun initializeProcessForWsWatch(hprocess: Handle): Bool

public expect fun k32EmptyWorkingSet(hprocess: Handle): Bool

public expect fun k32EnumDeviceDrivers(lpimagebase: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool

public expect fun k32EnumPageFilesA(pcallbackroutine: PenumPageFileCallbacka, pcontext: MutPtr): Bool

public expect fun k32EnumPageFilesW(pcallbackroutine: PenumPageFileCallbackw, pcontext: MutPtr): Bool

public expect fun k32EnumProcessModules(hprocess: Handle, lphmodule: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool

public expect fun k32EnumProcessModulesEx(hprocess: Handle, lphmodule: MutPtr, cb: UInt, lpcbneeded: MutPtr, dwfilterflag: UInt): Bool

public expect fun k32EnumProcesses(lpidprocess: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool

public expect fun k32GetDeviceDriverBaseNameA(imagebase: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt

public expect fun k32GetDeviceDriverBaseNameW(imagebase: ConstPtr, lpbasename: Pwstr, nsize: UInt): UInt

public expect fun k32GetDeviceDriverFileNameA(imagebase: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt

public expect fun k32GetDeviceDriverFileNameW(imagebase: ConstPtr, lpfilename: Pwstr, nsize: UInt): UInt

public expect fun k32GetMappedFileNameA(hprocess: Handle, lpv: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt

public expect fun k32GetMappedFileNameW(hprocess: Handle, lpv: ConstPtr, lpfilename: Pwstr, nsize: UInt): UInt

public expect fun k32GetModuleBaseNameA(hprocess: Handle, hmodule: Hmodule, lpbasename: Pstr, nsize: UInt): UInt

public expect fun k32GetModuleBaseNameW(hprocess: Handle, hmodule: Hmodule, lpbasename: Pwstr, nsize: UInt): UInt

public expect fun k32GetModuleFileNameExA(hprocess: Handle, hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt

public expect fun k32GetModuleFileNameExW(hprocess: Handle, hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt

public expect fun k32GetModuleInformation(hprocess: Handle, hmodule: Hmodule, lpmodinfo: MutPtr, cb: UInt): Bool

public expect fun k32GetPerformanceInfo(pperformanceinformation: MutPtr, cb: UInt): Bool

public expect fun k32GetProcessImageFileNameA(hprocess: Handle, lpimagefilename: Pstr, nsize: UInt): UInt

public expect fun k32GetProcessImageFileNameW(hprocess: Handle, lpimagefilename: Pwstr, nsize: UInt): UInt

public expect fun k32GetProcessMemoryInfo(process: Handle, ppsmemcounters: MutPtr, cb: UInt): Bool

public expect fun k32GetWsChanges(hprocess: Handle, lpwatchinfo: MutPtr, cb: UInt): Bool

public expect fun k32GetWsChangesEx(hprocess: Handle, lpwatchinfoex: MutPtr, cb: MutPtr): Bool

public expect fun k32InitializeProcessForWsWatch(hprocess: Handle): Bool

public expect fun k32QueryWorkingSet(hprocess: Handle, pv: MutPtr, cb: UInt): Bool

public expect fun k32QueryWorkingSetEx(hprocess: Handle, pv: MutPtr, cb: UInt): Bool

public expect fun queryWorkingSet(hprocess: Handle, pv: MutPtr, cb: UInt): Bool

public expect fun queryWorkingSetEx(hprocess: Handle, pv: MutPtr, cb: UInt): Bool
