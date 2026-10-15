// port-lint: source Windows/Win32/System/Console/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.cinterop.windows_sys_set_console_cursor_position
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.toCPointer

public fun SetConsoleCursorPosition(
    hconsoleoutput: HANDLE,
    dwcursorposition: COORD,
): BOOL =
    windows_sys_set_console_cursor_position(
        hconsoleoutput.toCPointer(),
        dwcursorposition.X,
        dwcursorposition.Y,
    )
