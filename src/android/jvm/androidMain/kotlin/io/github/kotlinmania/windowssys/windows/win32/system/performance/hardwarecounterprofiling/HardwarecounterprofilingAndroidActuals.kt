@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_hardwarecounterprofiling_DisableThreadProfiling(performancedatahandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_hardwarecounterprofiling_EnableThreadProfiling(threadhandle: Long, flags: Int, hardwarecounters: Long, performancedatahandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_hardwarecounterprofiling_QueryThreadProfiling(threadhandle: Long, enabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_hardwarecounterprofiling_ReadThreadProfilingData(performancedatahandle: Long, flags: Int, performancedata: Long): Int
}

public actual fun DisableThreadProfiling(performancedatahandle: HANDLE): UInt =
    WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge.windowssys_windows_win32_system_performance_hardwarecounterprofiling_DisableThreadProfiling(performancedatahandle).toUInt()

public actual fun EnableThreadProfiling(threadhandle: HANDLE, flags: UInt, hardwarecounters: ULong, performancedatahandle: Long): UInt =
    WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge.windowssys_windows_win32_system_performance_hardwarecounterprofiling_EnableThreadProfiling(threadhandle, flags.toInt(), hardwarecounters.toLong(), performancedatahandle).toUInt()

public actual fun QueryThreadProfiling(threadhandle: HANDLE, enabled: Long): UInt =
    WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge.windowssys_windows_win32_system_performance_hardwarecounterprofiling_QueryThreadProfiling(threadhandle, enabled).toUInt()

public actual fun ReadThreadProfilingData(performancedatahandle: HANDLE, flags: UInt, performancedata: Long): UInt =
    WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge.windowssys_windows_win32_system_performance_hardwarecounterprofiling_ReadThreadProfilingData(performancedatahandle, flags.toInt(), performancedata).toUInt()
