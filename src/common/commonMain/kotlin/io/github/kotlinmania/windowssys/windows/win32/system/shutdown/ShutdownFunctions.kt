package io.github.kotlinmania.windowssys.windows.win32.system.shutdown

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun abortSystemShutdownA(lpmachinename: Pcstr): Bool

public expect fun abortSystemShutdownW(lpmachinename: Pcwstr): Bool

public expect fun checkForHiberboot(phiberboot: MutPtr, bclearflag: Boolean): UInt

public expect fun exitWindowsEx(uflags: ExitWindowsFlags, dwreason: ShutdownReason): Bool

public expect fun initiateShutdownA(lpmachinename: Pcstr, lpmessage: Pcstr, dwgraceperiod: UInt, dwshutdownflags: ShutdownFlags, dwreason: ShutdownReason): UInt

public expect fun initiateShutdownW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwgraceperiod: UInt, dwshutdownflags: ShutdownFlags, dwreason: ShutdownReason): UInt

public expect fun initiateSystemShutdownA(lpmachinename: Pcstr, lpmessage: Pcstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool): Bool

public expect fun initiateSystemShutdownExA(lpmachinename: Pcstr, lpmessage: Pcstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool, dwreason: ShutdownReason): Bool

public expect fun initiateSystemShutdownExW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool, dwreason: ShutdownReason): Bool

public expect fun initiateSystemShutdownW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool): Bool

public expect fun lockWorkStation(): Bool

public expect fun shutdownBlockReasonCreate(hwnd: Hwnd, pwszreason: Pcwstr): Bool

public expect fun shutdownBlockReasonDestroy(hwnd: Hwnd): Bool

public expect fun shutdownBlockReasonQuery(hwnd: Hwnd, pwszbuff: Pwstr, pcchbuff: MutPtr): Bool
