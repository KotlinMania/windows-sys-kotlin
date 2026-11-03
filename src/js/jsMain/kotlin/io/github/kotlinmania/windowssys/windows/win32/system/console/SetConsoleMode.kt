// port-lint: source Windows/Win32/System/Console/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun SetConsoleMode(
    hconsolehandle: HANDLE,
    dwmode: CONSOLE_MODE,
): BOOL = WindowsSysNative.SetConsoleMode(hconsolehandle.toDouble(), dwmode.toInt())
