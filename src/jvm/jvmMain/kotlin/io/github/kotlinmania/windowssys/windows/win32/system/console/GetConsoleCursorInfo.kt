// port-lint: source Windows/Win32/System/Console/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.internal.Kernel32Jni
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun GetConsoleCursorInfo(
    hconsoleoutput: HANDLE,
    lpconsolecursorinfo: Long,
): BOOL = Kernel32Jni.GetConsoleCursorInfo(hconsoleoutput, lpconsolecursorinfo)

public fun GetConsoleCursorInfo(
    hconsoleoutput: HANDLE,
    lpconsolecursorinfo: CONSOLE_CURSOR_INFO,
): BOOL {
    val outFields = IntArray(2)
    val res = Kernel32Jni.GetConsoleCursorInfoStruct(hconsoleoutput, outFields)
    if (res != 0) {
        lpconsolecursorinfo.dwSize = outFields[0].toUInt()
        lpconsolecursorinfo.bVisible = outFields[1]
    }
    return res
}
