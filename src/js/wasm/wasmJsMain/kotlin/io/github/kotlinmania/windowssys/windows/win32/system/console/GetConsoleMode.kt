// port-lint: source Windows/Win32/System/Console/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun GetConsoleMode(
    hconsolehandle: HANDLE,
    lpmode: Long,
): BOOL =
    throw UnsupportedOperationException("GetConsoleMode requires Windows N-API addon")

public fun GetConsoleMode(
    hconsolehandle: HANDLE,
    lpmode: UIntArray,
): BOOL =
    throw UnsupportedOperationException("GetConsoleMode requires Windows N-API addon")
