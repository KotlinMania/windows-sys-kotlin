// port-lint: source Windows/Win32/System/Console/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun SetConsoleCursorPosition(
    hconsoleoutput: HANDLE,
    dwcursorposition: COORD,
): BOOL =
    throw UnsupportedOperationException("SetConsoleCursorPosition requires Windows N-API addon")
