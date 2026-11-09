@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun DisableThreadProfiling(performancedatahandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling.cinterop.windowssys_windows_win32_system_performance_hardwarecounterprofiling_DisableThreadProfiling(performancedatahandle.toCPointer<ByteVar>())

public actual fun EnableThreadProfiling(threadhandle: HANDLE, flags: UInt, hardwarecounters: ULong, performancedatahandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling.cinterop.windowssys_windows_win32_system_performance_hardwarecounterprofiling_EnableThreadProfiling(threadhandle.toCPointer<ByteVar>(), flags, hardwarecounters, performancedatahandle.toCPointer<ByteVar>())

public actual fun QueryThreadProfiling(threadhandle: HANDLE, enabled: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling.cinterop.windowssys_windows_win32_system_performance_hardwarecounterprofiling_QueryThreadProfiling(threadhandle.toCPointer<ByteVar>(), enabled.toCPointer<ByteVar>())

public actual fun ReadThreadProfilingData(performancedatahandle: HANDLE, flags: UInt, performancedata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling.cinterop.windowssys_windows_win32_system_performance_hardwarecounterprofiling_ReadThreadProfilingData(performancedatahandle.toCPointer<ByteVar>(), flags, performancedata.toCPointer<ByteVar>())
