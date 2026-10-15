// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun SetEnvironmentVariableW(lpname: PCWSTR, lpvalue: PCWSTR): BOOL =
    throw UnsupportedOperationException("SetEnvironmentVariableW requires Windows N-API addon")

public fun SetEnvironmentVariableW(lpname: UShortArray, lpvalue: UShortArray?): BOOL =
    throw UnsupportedOperationException("SetEnvironmentVariableW requires Windows N-API addon")
