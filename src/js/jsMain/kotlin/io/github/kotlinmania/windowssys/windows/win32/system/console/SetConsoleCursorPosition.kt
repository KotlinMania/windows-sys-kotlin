// port-lint: source Windows/Win32/System/Console/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun SetConsoleCursorPosition(
    hconsoleoutput: HANDLE,
    dwcursorposition: COORD,
): BOOL =
    WindowsSysNative.SetConsoleCursorPosition(
        hconsoleoutput.toDouble(),
        dwcursorposition.X.toInt(),
        dwcursorposition.Y.toInt(),
    )
