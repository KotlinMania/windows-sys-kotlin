// port-lint: source Windows/Win32/System/Console/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.cinterop.windows_sys_set_console_text_attribute
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.toCPointer

public fun SetConsoleTextAttribute(
    hconsoleoutput: HANDLE,
    wattributes: CONSOLE_CHARACTER_ATTRIBUTES,
): BOOL =
    windows_sys_set_console_text_attribute(
        hconsoleoutput.toCPointer(),
        wattributes,
    )
