// port-lint: source Windows/Win32/System/Console/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun GetConsoleCursorInfo(
    hconsoleoutput: HANDLE,
    lpconsolecursorinfo: Long,
): BOOL =
    WindowsSysNative.GetConsoleCursorInfo(
        hconsoleoutput.toDouble(),
        lpconsolecursorinfo.toDouble(),
    )

public fun GetConsoleCursorInfo(
    hconsoleoutput: HANDLE,
    lpconsolecursorinfo: CONSOLE_CURSOR_INFO,
): BOOL =
    WindowsSysNative.GetConsoleCursorInfo(
        hconsoleoutput.toDouble(),
        0.0,
    )
