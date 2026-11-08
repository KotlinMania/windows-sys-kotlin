package io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun DisableThreadProfiling(performancedatahandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "DisableThreadProfiling", longArrayOf(performancedatahandle)).toUInt()
}

public fun EnableThreadProfiling(threadhandle: HANDLE, flags: UInt, hardwarecounters: ULong, performancedatahandle: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnableThreadProfiling", longArrayOf(threadhandle, flags.toLong(), hardwarecounters.toLong(), performancedatahandle)).toUInt()
}

public fun QueryThreadProfiling(threadhandle: HANDLE, enabled: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryThreadProfiling", longArrayOf(threadhandle, enabled)).toUInt()
}

public fun ReadThreadProfilingData(performancedatahandle: HANDLE, flags: UInt, performancedata: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadThreadProfilingData", longArrayOf(performancedatahandle, flags.toLong(), performancedata)).toUInt()
}
