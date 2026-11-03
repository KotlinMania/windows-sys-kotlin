// port-lint: source Windows/Win32/System/Console/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun SetConsoleTextAttribute(
    hconsoleoutput: HANDLE,
    wattributes: CONSOLE_CHARACTER_ATTRIBUTES,
): BOOL = WindowsSysNative.SetConsoleTextAttribute(hconsoleoutput.toDouble(), wattributes.toInt())
