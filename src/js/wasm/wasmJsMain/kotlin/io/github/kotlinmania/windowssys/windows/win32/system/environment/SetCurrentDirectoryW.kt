// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun SetCurrentDirectoryW(lppathname: PCWSTR): BOOL =
    throw UnsupportedOperationException("SetCurrentDirectoryW requires Windows N-API addon")

public fun SetCurrentDirectoryW(lppathname: UShortArray): BOOL =
    throw UnsupportedOperationException("SetCurrentDirectoryW requires Windows N-API addon")
