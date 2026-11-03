// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PSTR

public fun ExpandEnvironmentStringsA(lpsrc: PCSTR, lpdst: PSTR, nsize: UInt): UInt =
    WindowsSysNative.ExpandEnvironmentStringsA(lpsrc.toDouble(), lpdst.toDouble(), nsize.toInt()).toUInt()

public fun ExpandEnvironmentStringsA(lpsrc: ByteArray, lpdst: ByteArray?, nsize: UInt): UInt = 0u
