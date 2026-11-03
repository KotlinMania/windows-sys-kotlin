// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

public fun SetEnvironmentVariableW(lpname: PCWSTR, lpvalue: PCWSTR): BOOL =
    Kernel32Jni.SetEnvironmentVariableW(lpname, lpvalue)

public fun SetEnvironmentVariableW(lpname: UShortArray, lpvalue: UShortArray?): BOOL {
    if (lpname.isEmpty()) return 0
    val nameShorts = ShortArray(lpname.size) { lpname[it].toShort() }
    val valShorts = if (lpvalue != null) ShortArray(lpvalue.size) { lpvalue[it].toShort() } else null
    return Kernel32Jni.SetEnvironmentVariableWBuffer(nameShorts, valShorts)
}
