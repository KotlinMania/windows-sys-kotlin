@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingDisableThreadProfiling(performancedatahandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingEnableThreadProfiling(threadhandle: Long, flags: Int, hardwarecounters: Long, performancedatahandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingQueryThreadProfiling(threadhandle: Long, enabled: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingReadThreadProfilingData(performancedatahandle: Long, flags: Int, performancedata: Long): Int
}

public actual fun disableThreadProfiling(performancedatahandle: Handle): UInt =
    WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge.windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingDisableThreadProfiling(performancedatahandle.rawAddress).toUInt()

public actual fun enableThreadProfiling(threadhandle: Handle, flags: UInt, hardwarecounters: ULong, performancedatahandle: MutPtr): UInt =
    WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge.windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingEnableThreadProfiling(threadhandle.rawAddress, flags.toInt(), hardwarecounters.toLong(), performancedatahandle.rawAddress).toUInt()

public actual fun queryThreadProfiling(threadhandle: Handle, enabled: MutPtr): UInt =
    WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge.windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingQueryThreadProfiling(threadhandle.rawAddress, enabled.rawAddress).toUInt()

public actual fun readThreadProfilingData(performancedatahandle: Handle, flags: UInt, performancedata: MutPtr): UInt =
    WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge.windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingReadThreadProfilingData(performancedatahandle.rawAddress, flags.toInt(), performancedata.rawAddress).toUInt()
