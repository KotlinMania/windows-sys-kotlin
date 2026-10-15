// port-lint: source Windows/Win32/System/Console/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun GetNumberOfConsoleInputEvents(
    hconsoleinput: HANDLE,
    lpnumberofevents: Long,
): BOOL =
    throw UnsupportedOperationException("GetNumberOfConsoleInputEvents requires Windows N-API addon")

public fun GetNumberOfConsoleInputEvents(
    hconsoleinput: HANDLE,
    lpnumberofevents: UIntArray,
): BOOL =
    throw UnsupportedOperationException("GetNumberOfConsoleInputEvents requires Windows N-API addon")
