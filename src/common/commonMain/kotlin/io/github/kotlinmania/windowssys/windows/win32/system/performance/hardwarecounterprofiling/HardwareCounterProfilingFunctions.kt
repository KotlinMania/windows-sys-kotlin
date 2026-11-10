package io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun disableThreadProfiling(performancedatahandle: Handle): UInt

public expect fun enableThreadProfiling(threadhandle: Handle, flags: UInt, hardwarecounters: ULong, performancedatahandle: COpaquePointer?): UInt

public expect fun queryThreadProfiling(threadhandle: Handle, enabled: COpaquePointer?): UInt

public expect fun readThreadProfilingData(performancedatahandle: Handle, flags: UInt, performancedata: COpaquePointer?): UInt
