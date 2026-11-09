@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.shutdown

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public actual fun AbortSystemShutdownA(lpmachinename: PCSTR): BOOL =
    0

public actual fun AbortSystemShutdownW(lpmachinename: PCWSTR): BOOL =
    0

public actual fun CheckForHiberboot(phiberboot: Long, bclearflag: Boolean): UInt =
    0u

public actual fun ExitWindowsEx(uflags: EXIT_WINDOWS_FLAGS, dwreason: SHUTDOWN_REASON): BOOL =
    0

public actual fun InitiateShutdownA(lpmachinename: PCSTR, lpmessage: PCSTR, dwgraceperiod: UInt, dwshutdownflags: SHUTDOWN_FLAGS, dwreason: SHUTDOWN_REASON): UInt =
    0u

public actual fun InitiateShutdownW(lpmachinename: PCWSTR, lpmessage: PCWSTR, dwgraceperiod: UInt, dwshutdownflags: SHUTDOWN_FLAGS, dwreason: SHUTDOWN_REASON): UInt =
    0u

public actual fun InitiateSystemShutdownA(lpmachinename: PCSTR, lpmessage: PCSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL): BOOL =
    0

public actual fun InitiateSystemShutdownExA(lpmachinename: PCSTR, lpmessage: PCSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL, dwreason: SHUTDOWN_REASON): BOOL =
    0

public actual fun InitiateSystemShutdownExW(lpmachinename: PCWSTR, lpmessage: PCWSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL, dwreason: SHUTDOWN_REASON): BOOL =
    0

public actual fun InitiateSystemShutdownW(lpmachinename: PCWSTR, lpmessage: PCWSTR, dwtimeout: UInt, bforceappsclosed: BOOL, brebootaftershutdown: BOOL): BOOL =
    0

public actual fun LockWorkStation(): BOOL =
    0

public actual fun ShutdownBlockReasonCreate(hwnd: HWND, pwszreason: PCWSTR): BOOL =
    0

public actual fun ShutdownBlockReasonDestroy(hwnd: HWND): BOOL =
    0

public actual fun ShutdownBlockReasonQuery(hwnd: HWND, pwszbuff: PWSTR, pcchbuff: Long): BOOL =
    0
