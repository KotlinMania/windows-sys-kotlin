// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

public fun NeedCurrentDirectoryForExePathW(exename: PCWSTR): BOOL =
    Kernel32Jni.NeedCurrentDirectoryForExePathW(exename)

public fun NeedCurrentDirectoryForExePathW(exename: UShortArray): BOOL = 0
