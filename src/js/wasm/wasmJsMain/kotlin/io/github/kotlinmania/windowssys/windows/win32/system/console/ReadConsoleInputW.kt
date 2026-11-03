// port-lint: source Windows/Win32/System/Console/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun ReadConsoleInputW(
    hconsoleinput: HANDLE,
    lpbuffer: Long,
    nlength: UInt,
    lpnumberofeventsread: Long,
): BOOL =
    throw UnsupportedOperationException("ReadConsoleInputW requires Windows N-API addon")

public fun ReadConsoleInputW(
    hconsoleinput: HANDLE,
    lpbuffer: Long,
    nlength: UInt,
    lpnumberofeventsread: UIntArray,
): BOOL =
    throw UnsupportedOperationException("ReadConsoleInputW requires Windows N-API addon")
