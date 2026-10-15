// port-lint: source Windows/Win32/System/Console/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.internal.Kernel32Jni
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun ReadConsoleInputW(
    hconsoleinput: HANDLE,
    lpbuffer: Long,
    nlength: UInt,
    lpnumberofeventsread: Long,
): BOOL {
    if (lpbuffer == 0L || lpnumberofeventsread == 0L) return 0
    val outRead = IntArray(1)
    return Kernel32Jni.ReadConsoleInputW(hconsoleinput, lpbuffer, nlength.toInt(), outRead)
}

public fun ReadConsoleInputW(
    hconsoleinput: HANDLE,
    lpbuffer: Long,
    nlength: UInt,
    lpnumberofeventsread: UIntArray,
): BOOL {
    if (lpnumberofeventsread.isEmpty()) return 0
    val outRead = IntArray(1) { lpnumberofeventsread[0].toInt() }
    val res = Kernel32Jni.ReadConsoleInputW(hconsoleinput, lpbuffer, nlength.toInt(), outRead)
    lpnumberofeventsread[0] = outRead[0].toUInt()
    return res
}
