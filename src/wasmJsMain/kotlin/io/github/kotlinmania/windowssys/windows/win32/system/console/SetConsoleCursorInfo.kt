// port-lint: source Windows/Win32/System/Console/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun SetConsoleCursorInfo(
    hconsoleoutput: HANDLE,
    lpconsolecursorinfo: Long,
): BOOL =
    throw UnsupportedOperationException("SetConsoleCursorInfo requires Windows N-API addon")

public fun SetConsoleCursorInfo(
    hconsoleoutput: HANDLE,
    lpconsolecursorinfo: CONSOLE_CURSOR_INFO,
): BOOL =
    throw UnsupportedOperationException("SetConsoleCursorInfo requires Windows N-API addon")
