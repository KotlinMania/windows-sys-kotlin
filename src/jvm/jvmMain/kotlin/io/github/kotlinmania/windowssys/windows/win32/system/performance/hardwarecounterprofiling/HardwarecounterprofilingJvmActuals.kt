@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_hardwarecounterprofiling_disableThreadProfiling(performancedatahandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_hardwarecounterprofiling_enableThreadProfiling(threadhandle: Long, flags: Int, hardwarecounters: Long, performancedatahandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_hardwarecounterprofiling_queryThreadProfiling(threadhandle: Long, enabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_hardwarecounterprofiling_readThreadProfilingData(performancedatahandle: Long, flags: Int, performancedata: Long): Int
}

public actual fun disableThreadProfiling(performancedatahandle: Handle): UInt =
    WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge.windowssys_windows_win32_system_performance_hardwarecounterprofiling_disableThreadProfiling((performancedatahandle?.value ?: 0L)).toUInt()

public actual fun enableThreadProfiling(threadhandle: Handle, flags: UInt, hardwarecounters: ULong, performancedatahandle: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge.windowssys_windows_win32_system_performance_hardwarecounterprofiling_enableThreadProfiling((threadhandle?.value ?: 0L), flags.toInt(), hardwarecounters.toLong(), (performancedatahandle?.value ?: 0L)).toUInt()

public actual fun queryThreadProfiling(threadhandle: Handle, enabled: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge.windowssys_windows_win32_system_performance_hardwarecounterprofiling_queryThreadProfiling((threadhandle?.value ?: 0L), (enabled?.value ?: 0L)).toUInt()

public actual fun readThreadProfilingData(performancedatahandle: Handle, flags: UInt, performancedata: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge.windowssys_windows_win32_system_performance_hardwarecounterprofiling_readThreadProfilingData((performancedatahandle?.value ?: 0L), flags.toInt(), (performancedata?.value ?: 0L)).toUInt()
