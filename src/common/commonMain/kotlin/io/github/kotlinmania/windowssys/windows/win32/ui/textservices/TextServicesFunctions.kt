package io.github.kotlinmania.windowssys.windows.win32.ui.textservices

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT

public fun DoMsCtfMonitor(dwflags: UInt, heventforservicestop: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("msctfmonitor.dll", "DoMsCtfMonitor", longArrayOf(dwflags.toLong(), Win32DynamicFfi.objectSlot(heventforservicestop))).toInt()
}

public fun InitLocalMsCtfMonitor(dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("msctfmonitor.dll", "InitLocalMsCtfMonitor", longArrayOf(dwflags.toLong())).toInt()
}

public fun UninitLocalMsCtfMonitor(): HRESULT {
    return Win32DynamicFfi.invoke("msctfmonitor.dll", "UninitLocalMsCtfMonitor", longArrayOf()).toInt()
}
