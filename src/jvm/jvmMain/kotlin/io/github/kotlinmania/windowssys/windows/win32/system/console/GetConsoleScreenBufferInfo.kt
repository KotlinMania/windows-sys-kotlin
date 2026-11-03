// port-lint: source Windows/Win32/System/Console/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.internal.Kernel32Jni
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun GetConsoleScreenBufferInfo(
    hconsoleoutput: HANDLE,
    lpconsolescreenbufferinfo: Long,
): BOOL = Kernel32Jni.GetConsoleScreenBufferInfo(hconsoleoutput, lpconsolescreenbufferinfo)

public fun GetConsoleScreenBufferInfo(
    hconsoleoutput: HANDLE,
    lpconsolescreenbufferinfo: CONSOLE_SCREEN_BUFFER_INFO,
): BOOL {
    val outFields = IntArray(11)
    val res = Kernel32Jni.GetConsoleScreenBufferInfoStruct(hconsoleoutput, outFields)
    if (res != 0) {
        lpconsolescreenbufferinfo.dwSize = COORD(outFields[0].toShort(), outFields[1].toShort())
        lpconsolescreenbufferinfo.dwCursorPosition = COORD(outFields[2].toShort(), outFields[3].toShort())
        lpconsolescreenbufferinfo.wAttributes = outFields[4].toUShort()
        lpconsolescreenbufferinfo.srWindow =
            SMALL_RECT(
                Left = outFields[5].toShort(),
                Top = outFields[6].toShort(),
                Right = outFields[7].toShort(),
                Bottom = outFields[8].toShort(),
            )
        lpconsolescreenbufferinfo.dwMaximumWindowSize = COORD(outFields[9].toShort(), outFields[10].toShort())
    }
    return res
}
