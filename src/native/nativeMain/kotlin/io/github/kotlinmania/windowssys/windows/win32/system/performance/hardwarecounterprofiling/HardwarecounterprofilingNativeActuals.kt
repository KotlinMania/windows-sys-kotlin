@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling.cinterop.windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingDisableThreadProfiling
import io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling.cinterop.windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingEnableThreadProfiling
import io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling.cinterop.windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingQueryThreadProfiling
import io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling.cinterop.windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingReadThreadProfilingData
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun disableThreadProfiling(performancedatahandle: Handle): UInt =
    windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingDisableThreadProfiling(performancedatahandle.rawAddress.toCPointer<ByteVar>())

public actual fun enableThreadProfiling(threadhandle: Handle, flags: UInt, hardwarecounters: ULong, performancedatahandle: MutPtr<Handle>): UInt =
    windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingEnableThreadProfiling(threadhandle.rawAddress.toCPointer<ByteVar>(), flags, hardwarecounters, performancedatahandle.rawAddress.toCPointer<ByteVar>())

public actual fun queryThreadProfiling(threadhandle: Handle, enabled: MutPtr<Boolean>): UInt =
    windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingQueryThreadProfiling(threadhandle.rawAddress.toCPointer<ByteVar>(), enabled.rawAddress.toCPointer<ByteVar>())

public actual fun readThreadProfilingData(performancedatahandle: Handle, flags: UInt, performancedata: MutPtr<PerformanceData>): UInt =
    windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingReadThreadProfilingData(performancedatahandle.rawAddress.toCPointer<ByteVar>(), flags, performancedata.rawAddress.toCPointer<ByteVar>())
