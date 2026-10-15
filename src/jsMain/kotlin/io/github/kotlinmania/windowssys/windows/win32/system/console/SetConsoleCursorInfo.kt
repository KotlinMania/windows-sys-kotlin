// port-lint: source Windows/Win32/System/Console/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun SetConsoleCursorInfo(
    hconsoleoutput: HANDLE,
    lpconsolecursorinfo: Long,
): BOOL =
    WindowsSysNative.SetConsoleCursorInfo(
        hconsoleoutput.toDouble(),
        lpconsolecursorinfo.toDouble(),
    )

public fun SetConsoleCursorInfo(
    hconsoleoutput: HANDLE,
    lpconsolecursorinfo: CONSOLE_CURSOR_INFO,
): BOOL =
    WindowsSysNative.SetConsoleCursorInfo(
        hconsoleoutput.toDouble(),
        0.0,
    )
