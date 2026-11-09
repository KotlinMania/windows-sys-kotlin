package io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public expect fun DisableThreadProfiling(performancedatahandle: HANDLE): UInt

public expect fun EnableThreadProfiling(threadhandle: HANDLE, flags: UInt, hardwarecounters: ULong, performancedatahandle: Long): UInt

public expect fun QueryThreadProfiling(threadhandle: HANDLE, enabled: Long): UInt

public expect fun ReadThreadProfilingData(performancedatahandle: HANDLE, flags: UInt, performancedata: Long): UInt
