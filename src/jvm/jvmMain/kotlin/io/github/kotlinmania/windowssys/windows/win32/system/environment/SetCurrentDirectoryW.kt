// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

public fun SetCurrentDirectoryW(lppathname: PCWSTR): BOOL =
    Kernel32Jni.SetCurrentDirectoryW(lppathname)

public fun SetCurrentDirectoryW(lppathname: UShortArray): BOOL {
    if (lppathname.isEmpty()) return 0
    val pathShorts = ShortArray(lppathname.size) { lppathname[it].toShort() }
    return Kernel32Jni.SetCurrentDirectoryWBuffer(pathShorts)
}
