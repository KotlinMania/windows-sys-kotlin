// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

public fun GetEnvironmentVariableA(lpname: PCSTR, lpbuffer: PSTR, nsize: UInt): UInt =
    Kernel32Jni.GetEnvironmentVariableA(lpname, lpbuffer, nsize.toInt()).toUInt()

public fun GetEnvironmentVariableA(lpname: ByteArray, lpbuffer: ByteArray?, nsize: UInt): UInt = 0u
