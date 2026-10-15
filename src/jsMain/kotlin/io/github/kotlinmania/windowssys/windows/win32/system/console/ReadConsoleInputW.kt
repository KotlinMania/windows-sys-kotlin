// port-lint: source Windows/Win32/System/Console/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun ReadConsoleInputW(
    hconsoleinput: HANDLE,
    lpbuffer: Long,
    nlength: UInt,
    lpnumberofeventsread: Long,
): BOOL {
    val res = WindowsSysNative.ReadConsoleInputW(hconsoleinput.toDouble(), lpbuffer.toDouble(), nlength.toInt())
    return (res.success as? Number)?.toInt() ?: 0
}

public fun ReadConsoleInputW(
    hconsoleinput: HANDLE,
    lpbuffer: Long,
    nlength: UInt,
    lpnumberofeventsread: UIntArray,
): BOOL {
    if (lpnumberofeventsread.isEmpty()) return 0
    val res = WindowsSysNative.ReadConsoleInputW(hconsoleinput.toDouble(), lpbuffer.toDouble(), nlength.toInt())
    lpnumberofeventsread[0] = ((res.eventsRead as? Number)?.toInt() ?: 0).toUInt()
    return (res.success as? Number)?.toInt() ?: 0
}
