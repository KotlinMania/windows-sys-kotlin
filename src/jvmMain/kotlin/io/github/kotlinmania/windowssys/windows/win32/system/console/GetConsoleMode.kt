// port-lint: source Windows/Win32/System/Console/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.internal.Kernel32Jni
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun GetConsoleMode(
    hconsolehandle: HANDLE,
    lpmode: Long,
): BOOL = Kernel32Jni.GetConsoleModePtr(hconsolehandle, lpmode)

public fun GetConsoleMode(
    hconsolehandle: HANDLE,
    lpmode: UIntArray,
): BOOL {
    if (lpmode.isEmpty()) return 0
    val outMode = IntArray(1) { lpmode[0].toInt() }
    val res = Kernel32Jni.GetConsoleMode(hconsolehandle, outMode)
    lpmode[0] = outMode[0].toUInt()
    return res
}
