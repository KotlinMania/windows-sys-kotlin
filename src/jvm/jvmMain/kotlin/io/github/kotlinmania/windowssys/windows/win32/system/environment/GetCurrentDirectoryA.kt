// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

public fun GetCurrentDirectoryA(nbufferlength: UInt, lpbuffer: PSTR): UInt =
    Kernel32Jni.GetCurrentDirectoryA(nbufferlength.toInt(), lpbuffer).toUInt()

public fun GetCurrentDirectoryA(nbufferlength: UInt, lpbuffer: ByteArray?): UInt = 0u
