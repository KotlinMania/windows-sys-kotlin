@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public actual fun DisableThreadProfiling(performancedatahandle: HANDLE): UInt =
    0u

public actual fun EnableThreadProfiling(threadhandle: HANDLE, flags: UInt, hardwarecounters: ULong, performancedatahandle: Long): UInt =
    0u

public actual fun QueryThreadProfiling(threadhandle: HANDLE, enabled: Long): UInt =
    0u

public actual fun ReadThreadProfilingData(performancedatahandle: HANDLE, flags: UInt, performancedata: Long): UInt =
    0u
