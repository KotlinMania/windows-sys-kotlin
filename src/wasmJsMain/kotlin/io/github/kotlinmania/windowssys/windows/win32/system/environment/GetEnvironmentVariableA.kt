// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PSTR

public fun GetEnvironmentVariableA(lpname: PCSTR, lpbuffer: PSTR, nsize: UInt): UInt =
    throw UnsupportedOperationException("GetEnvironmentVariableA requires Windows N-API addon")

public fun GetEnvironmentVariableA(lpname: ByteArray, lpbuffer: ByteArray?, nsize: UInt): UInt =
    throw UnsupportedOperationException("GetEnvironmentVariableA requires Windows N-API addon")
