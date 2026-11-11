@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling.cinterop.windowssys_windows_win32_system_performance_hardwarecounterprofiling_disableThreadProfiling
import io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling.cinterop.windowssys_windows_win32_system_performance_hardwarecounterprofiling_enableThreadProfiling
import io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling.cinterop.windowssys_windows_win32_system_performance_hardwarecounterprofiling_queryThreadProfiling
import io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling.cinterop.windowssys_windows_win32_system_performance_hardwarecounterprofiling_readThreadProfilingData
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun disableThreadProfiling(performancedatahandle: Handle): UInt =
    windowssys_windows_win32_system_performance_hardwarecounterprofiling_disableThreadProfiling(performancedatahandle?.value?.toCPointer<ByteVar>())

public actual fun enableThreadProfiling(threadhandle: Handle, flags: UInt, hardwarecounters: ULong, performancedatahandle: COpaquePointer?): UInt =
    windowssys_windows_win32_system_performance_hardwarecounterprofiling_enableThreadProfiling(threadhandle?.value?.toCPointer<ByteVar>(), flags, hardwarecounters, performancedatahandle?.value?.toCPointer<ByteVar>())

public actual fun queryThreadProfiling(threadhandle: Handle, enabled: COpaquePointer?): UInt =
    windowssys_windows_win32_system_performance_hardwarecounterprofiling_queryThreadProfiling(threadhandle?.value?.toCPointer<ByteVar>(), enabled?.value?.toCPointer<ByteVar>())

public actual fun readThreadProfilingData(performancedatahandle: Handle, flags: UInt, performancedata: COpaquePointer?): UInt =
    windowssys_windows_win32_system_performance_hardwarecounterprofiling_readThreadProfilingData(performancedatahandle?.value?.toCPointer<ByteVar>(), flags, performancedata?.value?.toCPointer<ByteVar>())
