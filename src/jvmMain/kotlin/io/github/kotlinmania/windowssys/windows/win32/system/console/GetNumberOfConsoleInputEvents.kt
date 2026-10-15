// port-lint: source Windows/Win32/System/Console/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.internal.Kernel32Jni
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun GetNumberOfConsoleInputEvents(
    hconsoleinput: HANDLE,
    lpnumberofevents: Long,
): BOOL = Kernel32Jni.GetNumberOfConsoleInputEventsPtr(hconsoleinput, lpnumberofevents)

public fun GetNumberOfConsoleInputEvents(
    hconsoleinput: HANDLE,
    lpnumberofevents: UIntArray,
): BOOL {
    if (lpnumberofevents.isEmpty()) return 0
    val outCount = IntArray(1) { lpnumberofevents[0].toInt() }
    val res = Kernel32Jni.GetNumberOfConsoleInputEvents(hconsoleinput, outCount)
    lpnumberofevents[0] = outCount[0].toUInt()
    return res
}
