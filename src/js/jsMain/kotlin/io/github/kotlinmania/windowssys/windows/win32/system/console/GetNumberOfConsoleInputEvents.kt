// port-lint: source Windows/Win32/System/Console/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun GetNumberOfConsoleInputEvents(
    hconsoleinput: HANDLE,
    lpnumberofevents: Long,
): BOOL {
    val res = WindowsSysNative.GetNumberOfConsoleInputEvents(hconsoleinput.toDouble())
    return (res.success as? Number)?.toInt() ?: 0
}

public fun GetNumberOfConsoleInputEvents(
    hconsoleinput: HANDLE,
    lpnumberofevents: UIntArray,
): BOOL {
    if (lpnumberofevents.isEmpty()) return 0
    val res = WindowsSysNative.GetNumberOfConsoleInputEvents(hconsoleinput.toDouble())
    lpnumberofevents[0] = ((res.events as? Number)?.toInt() ?: 0).toUInt()
    return (res.success as? Number)?.toInt() ?: 0
}
