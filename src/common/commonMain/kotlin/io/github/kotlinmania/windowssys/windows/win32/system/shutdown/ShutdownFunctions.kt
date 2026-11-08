package io.github.kotlinmania.windowssys.windows.win32.system.shutdown

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public fun AbortSystemShutdownA(lpmachinename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AbortSystemShutdownA", longArrayOf(lpmachinename)).toInt()
}

public fun AbortSystemShutdownW(lpmachinename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "AbortSystemShutdownW", longArrayOf(lpmachinename)).toInt()
}

public fun CheckForHiberboot(phiberboot: Long, bclearflag: Boolean): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "CheckForHiberboot", longArrayOf(phiberboot, if (bclearflag) 1L else 0L)).toUInt()
}

public fun ExitWindowsEx(uflags: EXIT_WINDOWS_FLAGS, dwreason: SHUTDOWN_REASON): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ExitWindowsEx", longArrayOf(uflags.toLong(), dwreason.toLong())).toInt()
}

public fun InitiateShutdownA(lpmachinename: PCSTR, lpmessage: PCSTR, dwgraceperiod: UInt, dwshutdownflags: SHUTDOWN_FLAGS, dwreason: SHUTDOWN_REASON): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "InitiateShutdownA", longArrayOf(lpmachinename, lpmessage, dwgraceperiod.toLong(), dwshutdownflags.toLong(), dwreason.toLong())).toUInt()
}

public fun InitiateShutdownW(lpmachinename: PCWSTR, lpmessage: PCWSTR, dwgraceperiod: UInt, dwshutdownflags: SHUTDOWN_FLAGS, dwreason: SHUTDOWN_REASON): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "InitiateShutdownW", longArrayOf(lpmachinename, lpmessage, dwgraceperiod.toLong(), dwshutdownflags.toLong(), dwreason.toLong())).toUInt()
}

public fun InitiateSystemShutdownA(lpmachinename: PCSTR, lpmessage: PCSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "InitiateSystemShutdownA", longArrayOf(lpmachinename, lpmessage, dwtimeout.toLong(), bforceappsclosed.toLong(), brebootaftershutdown.toLong())).toInt()
}

public fun InitiateSystemShutdownExA(lpmachinename: PCSTR, lpmessage: PCSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL, dwreason: SHUTDOWN_REASON): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "InitiateSystemShutdownExA", longArrayOf(lpmachinename, lpmessage, dwtimeout.toLong(), bforceappsclosed.toLong(), brebootaftershutdown.toLong(), dwreason.toLong())).toInt()
}

public fun InitiateSystemShutdownExW(lpmachinename: PCWSTR, lpmessage: PCWSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL, dwreason: SHUTDOWN_REASON): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "InitiateSystemShutdownExW", longArrayOf(lpmachinename, lpmessage, dwtimeout.toLong(), bforceappsclosed.toLong(), brebootaftershutdown.toLong(), dwreason.toLong())).toInt()
}

public fun InitiateSystemShutdownW(lpmachinename: PCWSTR, lpmessage: PCWSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "InitiateSystemShutdownW", longArrayOf(lpmachinename, lpmessage, dwtimeout.toLong(), bforceappsclosed.toLong(), brebootaftershutdown.toLong())).toInt()
}

public fun LockWorkStation(): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "LockWorkStation", longArrayOf()).toInt()
}

public fun ShutdownBlockReasonCreate(hwnd: HWND, pwszreason: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ShutdownBlockReasonCreate", longArrayOf(hwnd, pwszreason)).toInt()
}

public fun ShutdownBlockReasonDestroy(hwnd: HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ShutdownBlockReasonDestroy", longArrayOf(hwnd)).toInt()
}

public fun ShutdownBlockReasonQuery(hwnd: HWND, pwszbuff: PWSTR, pcchbuff: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ShutdownBlockReasonQuery", longArrayOf(hwnd, pwszbuff, pcchbuff)).toInt()
}
