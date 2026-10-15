// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun NeedCurrentDirectoryForExePathW(exename: PCWSTR): BOOL =
    throw UnsupportedOperationException("NeedCurrentDirectoryForExePathW requires Windows N-API addon")

public fun NeedCurrentDirectoryForExePathW(exename: UShortArray): BOOL =
    throw UnsupportedOperationException("NeedCurrentDirectoryForExePathW requires Windows N-API addon")
