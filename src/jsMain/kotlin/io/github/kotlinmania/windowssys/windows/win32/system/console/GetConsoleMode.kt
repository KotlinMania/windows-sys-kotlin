// port-lint: source Windows/Win32/System/Console/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun GetConsoleMode(
    hconsolehandle: HANDLE,
    lpmode: Long,
): BOOL {
    val res = WindowsSysNative.GetConsoleMode(hconsolehandle.toDouble())
    return (res.success as? Number)?.toInt() ?: 0
}

public fun GetConsoleMode(
    hconsolehandle: HANDLE,
    lpmode: UIntArray,
): BOOL {
    if (lpmode.isEmpty()) return 0
    val res = WindowsSysNative.GetConsoleMode(hconsolehandle.toDouble())
    lpmode[0] = ((res.mode as? Number)?.toInt() ?: 0).toUInt()
    return (res.success as? Number)?.toInt() ?: 0
}
