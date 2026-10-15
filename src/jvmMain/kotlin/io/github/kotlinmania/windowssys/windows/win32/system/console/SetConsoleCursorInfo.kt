// port-lint: source Windows/Win32/System/Console/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.internal.Kernel32Jni
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun SetConsoleCursorInfo(
    hconsoleoutput: HANDLE,
    lpconsolecursorinfo: Long,
): BOOL = Kernel32Jni.SetConsoleCursorInfo(hconsoleoutput, lpconsolecursorinfo)

public fun SetConsoleCursorInfo(
    hconsoleoutput: HANDLE,
    lpconsolecursorinfo: CONSOLE_CURSOR_INFO,
): BOOL =
    Kernel32Jni.SetConsoleCursorInfoStruct(
        hconsoleoutput,
        lpconsolecursorinfo.dwSize.toInt(),
        lpconsolecursorinfo.bVisible,
    )
