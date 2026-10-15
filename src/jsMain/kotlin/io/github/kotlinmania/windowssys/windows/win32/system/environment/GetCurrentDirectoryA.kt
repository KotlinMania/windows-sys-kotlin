// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.PSTR

public fun GetCurrentDirectoryA(nbufferlength: UInt, lpbuffer: PSTR): UInt =
    WindowsSysNative.GetCurrentDirectoryA(nbufferlength.toInt(), lpbuffer.toDouble()).toUInt()

public fun GetCurrentDirectoryA(nbufferlength: UInt, lpbuffer: ByteArray?): UInt = 0u
