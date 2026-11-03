package io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling

import io.github.kotlinmania.windowssys.Win32DynamicFfi

public fun DisableThreadProfiling(performancedatahandle: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "DisableThreadProfiling", longArrayOf(Win32DynamicFfi.objectSlot(performancedatahandle))).toUInt()
}

public fun EnableThreadProfiling(threadhandle: Foundation.HANDLE, flags: UInt, hardwarecounters: ULong, performancedatahandle: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnableThreadProfiling", longArrayOf(Win32DynamicFfi.objectSlot(threadhandle), flags.toLong(), hardwarecounters.toLong(), performancedatahandle)).toUInt()
}

public fun QueryThreadProfiling(threadhandle: Foundation.HANDLE, enabled: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryThreadProfiling", longArrayOf(Win32DynamicFfi.objectSlot(threadhandle), enabled)).toUInt()
}

public fun ReadThreadProfilingData(performancedatahandle: Foundation.HANDLE, flags: UInt, performancedata: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadThreadProfilingData", longArrayOf(Win32DynamicFfi.objectSlot(performancedatahandle), flags.toLong(), performancedata)).toUInt()
}
