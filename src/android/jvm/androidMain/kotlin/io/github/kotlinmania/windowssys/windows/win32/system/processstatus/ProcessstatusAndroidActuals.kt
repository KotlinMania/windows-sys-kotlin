@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
    external fun windowssysWindowsWin32SystemProcessstatusEmptyWorkingSet(hprocess: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusEnumDeviceDrivers(lpimagebase: Long, cb: Int, lpcbneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusEnumPageFilesA(pcallbackroutine: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusEnumPageFilesW(pcallbackroutine: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusEnumProcessModules(hprocess: Long, lphmodule: Long, cb: Int, lpcbneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusEnumProcessModulesEx(hprocess: Long, lphmodule: Long, cb: Int, lpcbneeded: Long, dwfilterflag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusEnumProcesses(lpidprocess: Long, cb: Int, lpcbneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusGetDeviceDriverBaseNameA(imagebase: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusGetDeviceDriverBaseNameW(imagebase: Long, lpbasename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusGetDeviceDriverFileNameA(imagebase: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusGetDeviceDriverFileNameW(imagebase: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusGetMappedFileNameA(hprocess: Long, lpv: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusGetMappedFileNameW(hprocess: Long, lpv: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusGetModuleBaseNameA(hprocess: Long, hmodule: Long, lpbasename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusGetModuleBaseNameW(hprocess: Long, hmodule: Long, lpbasename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusGetModuleFileNameExA(hprocess: Long, hmodule: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusGetModuleFileNameExW(hprocess: Long, hmodule: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusGetModuleInformation(hprocess: Long, hmodule: Long, lpmodinfo: Long, cb: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusGetPerformanceInfo(pperformanceinformation: Long, cb: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusGetProcessImageFileNameA(hprocess: Long, lpimagefilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusGetProcessImageFileNameW(hprocess: Long, lpimagefilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusGetProcessMemoryInfo(process: Long, ppsmemcounters: Long, cb: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusGetWsChanges(hprocess: Long, lpwatchinfo: Long, cb: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusGetWsChangesEx(hprocess: Long, lpwatchinfoex: Long, cb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusInitializeProcessForWsWatch(hprocess: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32EmptyWorkingSet(hprocess: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32EnumDeviceDrivers(lpimagebase: Long, cb: Int, lpcbneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32EnumPageFilesA(pcallbackroutine: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32EnumPageFilesW(pcallbackroutine: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32EnumProcessModules(hprocess: Long, lphmodule: Long, cb: Int, lpcbneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32EnumProcessModulesEx(hprocess: Long, lphmodule: Long, cb: Int, lpcbneeded: Long, dwfilterflag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32EnumProcesses(lpidprocess: Long, cb: Int, lpcbneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverBaseNameA(imagebase: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverBaseNameW(imagebase: Long, lpbasename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverFileNameA(imagebase: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverFileNameW(imagebase: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32GetMappedFileNameA(hprocess: Long, lpv: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32GetMappedFileNameW(hprocess: Long, lpv: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32GetModuleBaseNameA(hprocess: Long, hmodule: Long, lpbasename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32GetModuleBaseNameW(hprocess: Long, hmodule: Long, lpbasename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32GetModuleFileNameExA(hprocess: Long, hmodule: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32GetModuleFileNameExW(hprocess: Long, hmodule: Long, lpfilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32GetModuleInformation(hprocess: Long, hmodule: Long, lpmodinfo: Long, cb: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32GetPerformanceInfo(pperformanceinformation: Long, cb: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32GetProcessImageFileNameA(hprocess: Long, lpimagefilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32GetProcessImageFileNameW(hprocess: Long, lpimagefilename: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32GetProcessMemoryInfo(process: Long, ppsmemcounters: Long, cb: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32GetWsChanges(hprocess: Long, lpwatchinfo: Long, cb: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32GetWsChangesEx(hprocess: Long, lpwatchinfoex: Long, cb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32InitializeProcessForWsWatch(hprocess: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32QueryWorkingSet(hprocess: Long, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusK32QueryWorkingSetEx(hprocess: Long, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusQueryWorkingSet(hprocess: Long, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemProcessstatusQueryWorkingSetEx(hprocess: Long, pv: Long, cb: Int): Int
}

public actual fun emptyWorkingSet(hprocess: Handle): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusEmptyWorkingSet(hprocess.rawAddress)

public actual fun enumDeviceDrivers(lpimagebase: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusEnumDeviceDrivers(lpimagebase.rawAddress, cb.toInt(), lpcbneeded.rawAddress)

public actual fun enumPageFilesA(pcallbackroutine: PenumPageFileCallbacka, pcontext: MutPtr): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusEnumPageFilesA(0L, pcontext.rawAddress)

public actual fun enumPageFilesW(pcallbackroutine: PenumPageFileCallbackw, pcontext: MutPtr): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusEnumPageFilesW(0L, pcontext.rawAddress)

public actual fun enumProcessModules(hprocess: Handle, lphmodule: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusEnumProcessModules(hprocess.rawAddress, lphmodule.rawAddress, cb.toInt(), lpcbneeded.rawAddress)

public actual fun enumProcessModulesEx(hprocess: Handle, lphmodule: MutPtr, cb: UInt, lpcbneeded: MutPtr, dwfilterflag: EnumProcessModulesExFlags): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusEnumProcessModulesEx(hprocess.rawAddress, lphmodule.rawAddress, cb.toInt(), lpcbneeded.rawAddress, dwfilterflag.toInt())

public actual fun enumProcesses(lpidprocess: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusEnumProcesses(lpidprocess.rawAddress, cb.toInt(), lpcbneeded.rawAddress)

public actual fun getDeviceDriverBaseNameA(imagebase: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusGetDeviceDriverBaseNameA(imagebase.rawAddress, lpfilename.rawAddress, nsize.toInt()).toUInt()

public actual fun getDeviceDriverBaseNameW(imagebase: ConstPtr, lpbasename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusGetDeviceDriverBaseNameW(imagebase.rawAddress, lpbasename.rawAddress, nsize.toInt()).toUInt()

public actual fun getDeviceDriverFileNameA(imagebase: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusGetDeviceDriverFileNameA(imagebase.rawAddress, lpfilename.rawAddress, nsize.toInt()).toUInt()

public actual fun getDeviceDriverFileNameW(imagebase: ConstPtr, lpfilename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusGetDeviceDriverFileNameW(imagebase.rawAddress, lpfilename.rawAddress, nsize.toInt()).toUInt()

public actual fun getMappedFileNameA(hprocess: Handle, lpv: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusGetMappedFileNameA(hprocess.rawAddress, lpv.rawAddress, lpfilename.rawAddress, nsize.toInt()).toUInt()

public actual fun getMappedFileNameW(hprocess: Handle, lpv: ConstPtr, lpfilename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusGetMappedFileNameW(hprocess.rawAddress, lpv.rawAddress, lpfilename.rawAddress, nsize.toInt()).toUInt()

public actual fun getModuleBaseNameA(hprocess: Handle, hmodule: Hmodule, lpbasename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusGetModuleBaseNameA(hprocess.rawAddress, hmodule.rawAddress, lpbasename.rawAddress, nsize.toInt()).toUInt()

public actual fun getModuleBaseNameW(hprocess: Handle, hmodule: Hmodule, lpbasename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusGetModuleBaseNameW(hprocess.rawAddress, hmodule.rawAddress, lpbasename.rawAddress, nsize.toInt()).toUInt()

public actual fun getModuleFileNameExA(hprocess: Handle, hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusGetModuleFileNameExA(hprocess.rawAddress, hmodule.rawAddress, lpfilename.rawAddress, nsize.toInt()).toUInt()

public actual fun getModuleFileNameExW(hprocess: Handle, hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusGetModuleFileNameExW(hprocess.rawAddress, hmodule.rawAddress, lpfilename.rawAddress, nsize.toInt()).toUInt()

public actual fun getModuleInformation(hprocess: Handle, hmodule: Hmodule, lpmodinfo: MutPtr, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusGetModuleInformation(hprocess.rawAddress, hmodule.rawAddress, lpmodinfo.rawAddress, cb.toInt())

public actual fun getPerformanceInfo(pperformanceinformation: MutPtr, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusGetPerformanceInfo(pperformanceinformation.rawAddress, cb.toInt())

public actual fun getProcessImageFileNameA(hprocess: Handle, lpimagefilename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusGetProcessImageFileNameA(hprocess.rawAddress, lpimagefilename.rawAddress, nsize.toInt()).toUInt()

public actual fun getProcessImageFileNameW(hprocess: Handle, lpimagefilename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusGetProcessImageFileNameW(hprocess.rawAddress, lpimagefilename.rawAddress, nsize.toInt()).toUInt()

public actual fun getProcessMemoryInfo(process: Handle, ppsmemcounters: MutPtr, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusGetProcessMemoryInfo(process.rawAddress, ppsmemcounters.rawAddress, cb.toInt())

public actual fun getWsChanges(hprocess: Handle, lpwatchinfo: MutPtr, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusGetWsChanges(hprocess.rawAddress, lpwatchinfo.rawAddress, cb.toInt())

public actual fun getWsChangesEx(hprocess: Handle, lpwatchinfoex: MutPtr, cb: MutPtr): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusGetWsChangesEx(hprocess.rawAddress, lpwatchinfoex.rawAddress, cb.rawAddress)

public actual fun initializeProcessForWsWatch(hprocess: Handle): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusInitializeProcessForWsWatch(hprocess.rawAddress)

public actual fun k32EmptyWorkingSet(hprocess: Handle): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32EmptyWorkingSet(hprocess.rawAddress)

public actual fun k32EnumDeviceDrivers(lpimagebase: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32EnumDeviceDrivers(lpimagebase.rawAddress, cb.toInt(), lpcbneeded.rawAddress)

public actual fun k32EnumPageFilesA(pcallbackroutine: PenumPageFileCallbacka, pcontext: MutPtr): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32EnumPageFilesA(0L, pcontext.rawAddress)

public actual fun k32EnumPageFilesW(pcallbackroutine: PenumPageFileCallbackw, pcontext: MutPtr): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32EnumPageFilesW(0L, pcontext.rawAddress)

public actual fun k32EnumProcessModules(hprocess: Handle, lphmodule: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32EnumProcessModules(hprocess.rawAddress, lphmodule.rawAddress, cb.toInt(), lpcbneeded.rawAddress)

public actual fun k32EnumProcessModulesEx(hprocess: Handle, lphmodule: MutPtr, cb: UInt, lpcbneeded: MutPtr, dwfilterflag: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32EnumProcessModulesEx(hprocess.rawAddress, lphmodule.rawAddress, cb.toInt(), lpcbneeded.rawAddress, dwfilterflag.toInt())

public actual fun k32EnumProcesses(lpidprocess: MutPtr, cb: UInt, lpcbneeded: MutPtr): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32EnumProcesses(lpidprocess.rawAddress, cb.toInt(), lpcbneeded.rawAddress)

public actual fun k32GetDeviceDriverBaseNameA(imagebase: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverBaseNameA(imagebase.rawAddress, lpfilename.rawAddress, nsize.toInt()).toUInt()

public actual fun k32GetDeviceDriverBaseNameW(imagebase: ConstPtr, lpbasename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverBaseNameW(imagebase.rawAddress, lpbasename.rawAddress, nsize.toInt()).toUInt()

public actual fun k32GetDeviceDriverFileNameA(imagebase: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverFileNameA(imagebase.rawAddress, lpfilename.rawAddress, nsize.toInt()).toUInt()

public actual fun k32GetDeviceDriverFileNameW(imagebase: ConstPtr, lpfilename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverFileNameW(imagebase.rawAddress, lpfilename.rawAddress, nsize.toInt()).toUInt()

public actual fun k32GetMappedFileNameA(hprocess: Handle, lpv: ConstPtr, lpfilename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32GetMappedFileNameA(hprocess.rawAddress, lpv.rawAddress, lpfilename.rawAddress, nsize.toInt()).toUInt()

public actual fun k32GetMappedFileNameW(hprocess: Handle, lpv: ConstPtr, lpfilename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32GetMappedFileNameW(hprocess.rawAddress, lpv.rawAddress, lpfilename.rawAddress, nsize.toInt()).toUInt()

public actual fun k32GetModuleBaseNameA(hprocess: Handle, hmodule: Hmodule, lpbasename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32GetModuleBaseNameA(hprocess.rawAddress, hmodule.rawAddress, lpbasename.rawAddress, nsize.toInt()).toUInt()

public actual fun k32GetModuleBaseNameW(hprocess: Handle, hmodule: Hmodule, lpbasename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32GetModuleBaseNameW(hprocess.rawAddress, hmodule.rawAddress, lpbasename.rawAddress, nsize.toInt()).toUInt()

public actual fun k32GetModuleFileNameExA(hprocess: Handle, hmodule: Hmodule, lpfilename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32GetModuleFileNameExA(hprocess.rawAddress, hmodule.rawAddress, lpfilename.rawAddress, nsize.toInt()).toUInt()

public actual fun k32GetModuleFileNameExW(hprocess: Handle, hmodule: Hmodule, lpfilename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32GetModuleFileNameExW(hprocess.rawAddress, hmodule.rawAddress, lpfilename.rawAddress, nsize.toInt()).toUInt()

public actual fun k32GetModuleInformation(hprocess: Handle, hmodule: Hmodule, lpmodinfo: MutPtr, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32GetModuleInformation(hprocess.rawAddress, hmodule.rawAddress, lpmodinfo.rawAddress, cb.toInt())

public actual fun k32GetPerformanceInfo(pperformanceinformation: MutPtr, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32GetPerformanceInfo(pperformanceinformation.rawAddress, cb.toInt())

public actual fun k32GetProcessImageFileNameA(hprocess: Handle, lpimagefilename: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32GetProcessImageFileNameA(hprocess.rawAddress, lpimagefilename.rawAddress, nsize.toInt()).toUInt()

public actual fun k32GetProcessImageFileNameW(hprocess: Handle, lpimagefilename: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32GetProcessImageFileNameW(hprocess.rawAddress, lpimagefilename.rawAddress, nsize.toInt()).toUInt()

public actual fun k32GetProcessMemoryInfo(process: Handle, ppsmemcounters: MutPtr, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32GetProcessMemoryInfo(process.rawAddress, ppsmemcounters.rawAddress, cb.toInt())

public actual fun k32GetWsChanges(hprocess: Handle, lpwatchinfo: MutPtr, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32GetWsChanges(hprocess.rawAddress, lpwatchinfo.rawAddress, cb.toInt())

public actual fun k32GetWsChangesEx(hprocess: Handle, lpwatchinfoex: MutPtr, cb: MutPtr): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32GetWsChangesEx(hprocess.rawAddress, lpwatchinfoex.rawAddress, cb.rawAddress)

public actual fun k32InitializeProcessForWsWatch(hprocess: Handle): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32InitializeProcessForWsWatch(hprocess.rawAddress)

public actual fun k32QueryWorkingSet(hprocess: Handle, pv: MutPtr, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32QueryWorkingSet(hprocess.rawAddress, pv.rawAddress, cb.toInt())

public actual fun k32QueryWorkingSetEx(hprocess: Handle, pv: MutPtr, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusK32QueryWorkingSetEx(hprocess.rawAddress, pv.rawAddress, cb.toInt())

public actual fun queryWorkingSet(hprocess: Handle, pv: MutPtr, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusQueryWorkingSet(hprocess.rawAddress, pv.rawAddress, cb.toInt())

public actual fun queryWorkingSetEx(hprocess: Handle, pv: MutPtr, cb: UInt): Bool =
    WindowsWin32SystemProcessstatusJniBridge.windowssysWindowsWin32SystemProcessstatusQueryWorkingSetEx(hprocess.rawAddress, pv.rawAddress, cb.toInt())
