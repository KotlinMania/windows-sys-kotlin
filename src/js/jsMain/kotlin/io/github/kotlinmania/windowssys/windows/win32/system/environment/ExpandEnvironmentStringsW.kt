// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun ExpandEnvironmentStringsW(lpsrc: PCWSTR, lpdst: PWSTR, nsize: UInt): UInt =
    WindowsSysNative.ExpandEnvironmentStringsW(lpsrc.toDouble(), lpdst.toDouble(), nsize.toInt()).toUInt()

public fun ExpandEnvironmentStringsW(lpsrc: UShortArray, lpdst: UShortArray?, nsize: UInt): UInt = 0u
