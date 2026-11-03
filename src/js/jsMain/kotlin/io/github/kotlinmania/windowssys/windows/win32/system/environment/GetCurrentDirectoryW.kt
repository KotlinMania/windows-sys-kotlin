// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.PWSTR

public fun GetCurrentDirectoryW(nbufferlength: UInt, lpbuffer: PWSTR): UInt =
    WindowsSysNative.GetCurrentDirectoryW(nbufferlength.toInt(), lpbuffer.toDouble()).toUInt()

public fun GetCurrentDirectoryW(nbufferlength: UInt, lpbuffer: UShortArray?): UInt = 0u
