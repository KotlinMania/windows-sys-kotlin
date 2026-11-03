// port-lint: source Windows/Win32/System/Console/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun GetConsoleScreenBufferInfo(
    hconsoleoutput: HANDLE,
    lpconsolescreenbufferinfo: Long,
): BOOL =
    WindowsSysNative.GetConsoleScreenBufferInfo(
        hconsoleoutput.toDouble(),
        lpconsolescreenbufferinfo.toDouble(),
    )

public fun GetConsoleScreenBufferInfo(
    hconsoleoutput: HANDLE,
    lpconsolescreenbufferinfo: CONSOLE_SCREEN_BUFFER_INFO,
): BOOL =
    WindowsSysNative.GetConsoleScreenBufferInfo(
        hconsoleoutput.toDouble(),
        0.0,
    )
