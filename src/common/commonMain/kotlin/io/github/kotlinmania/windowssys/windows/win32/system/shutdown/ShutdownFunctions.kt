package io.github.kotlinmania.windowssys.windows.win32.system.shutdown

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public expect fun AbortSystemShutdownA(lpmachinename: PCSTR): BOOL

public expect fun AbortSystemShutdownW(lpmachinename: PCWSTR): BOOL

public expect fun CheckForHiberboot(phiberboot: Long, bclearflag: Boolean): UInt

public expect fun ExitWindowsEx(uflags: EXIT_WINDOWS_FLAGS, dwreason: SHUTDOWN_REASON): BOOL

public expect fun InitiateShutdownA(lpmachinename: PCSTR, lpmessage: PCSTR, dwgraceperiod: UInt, dwshutdownflags: SHUTDOWN_FLAGS, dwreason: SHUTDOWN_REASON): UInt

public expect fun InitiateShutdownW(lpmachinename: PCWSTR, lpmessage: PCWSTR, dwgraceperiod: UInt, dwshutdownflags: SHUTDOWN_FLAGS, dwreason: SHUTDOWN_REASON): UInt

public expect fun InitiateSystemShutdownA(lpmachinename: PCSTR, lpmessage: PCSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL): BOOL

public expect fun InitiateSystemShutdownExA(lpmachinename: PCSTR, lpmessage: PCSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL, dwreason: SHUTDOWN_REASON): BOOL

public expect fun InitiateSystemShutdownExW(lpmachinename: PCWSTR, lpmessage: PCWSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL, dwreason: SHUTDOWN_REASON): BOOL

public expect fun InitiateSystemShutdownW(lpmachinename: PCWSTR, lpmessage: PCWSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL): BOOL

public expect fun LockWorkStation(): BOOL

public expect fun ShutdownBlockReasonCreate(hwnd: HWND, pwszreason: PCWSTR): BOOL

public expect fun ShutdownBlockReasonDestroy(hwnd: HWND): BOOL

public expect fun ShutdownBlockReasonQuery(hwnd: HWND, pwszbuff: PWSTR, pcchbuff: Long): BOOL
