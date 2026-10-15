// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PSTR

public fun ExpandEnvironmentStringsA(lpsrc: PCSTR, lpdst: PSTR, nsize: UInt): UInt =
    throw UnsupportedOperationException("ExpandEnvironmentStringsA requires Windows N-API addon")

public fun ExpandEnvironmentStringsA(lpsrc: ByteArray, lpdst: ByteArray?, nsize: UInt): UInt =
    throw UnsupportedOperationException("ExpandEnvironmentStringsA requires Windows N-API addon")
