// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun GetEnvironmentVariableW(lpname: PCWSTR, lpbuffer: PWSTR, nsize: UInt): UInt =
    WindowsSysNative.GetEnvironmentVariableW(lpname.toDouble(), lpbuffer.toDouble(), nsize.toInt()).toUInt()

public fun GetEnvironmentVariableW(lpname: UShortArray, lpbuffer: UShortArray?, nsize: UInt): UInt = 0u
