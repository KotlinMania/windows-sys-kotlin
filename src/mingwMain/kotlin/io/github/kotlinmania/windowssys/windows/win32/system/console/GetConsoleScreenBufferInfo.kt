// port-lint: source Windows/Win32/System/Console/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_console_screen_buffer_info
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toCPointer
import platform.windows.CONSOLE_SCREEN_BUFFER_INFO as CConsoleScreenBufferInfo

public fun GetConsoleScreenBufferInfo(
    hconsoleoutput: HANDLE,
    lpconsolescreenbufferinfo: Long,
): BOOL =
    windows_sys_get_console_screen_buffer_info(
        hconsoleoutput.toCPointer(),
        lpconsolescreenbufferinfo.toCPointer(),
    )

public fun GetConsoleScreenBufferInfo(
    hconsoleoutput: HANDLE,
    lpconsolescreenbufferinfo: CONSOLE_SCREEN_BUFFER_INFO,
): BOOL =
    memScoped {
        val nativeCsbi = alloc<CConsoleScreenBufferInfo>()
        val res = windows_sys_get_console_screen_buffer_info(hconsoleoutput.toCPointer(), nativeCsbi.ptr)
        if (res != 0) {
            lpconsolescreenbufferinfo.dwSize = COORD(nativeCsbi.dwSize.X, nativeCsbi.dwSize.Y)
            lpconsolescreenbufferinfo.dwCursorPosition = COORD(nativeCsbi.dwCursorPosition.X, nativeCsbi.dwCursorPosition.Y)
            lpconsolescreenbufferinfo.wAttributes = nativeCsbi.wAttributes
            lpconsolescreenbufferinfo.srWindow =
                SMALL_RECT(
                    Left = nativeCsbi.srWindow.Left,
                    Top = nativeCsbi.srWindow.Top,
                    Right = nativeCsbi.srWindow.Right,
                    Bottom = nativeCsbi.srWindow.Bottom,
                )
            lpconsolescreenbufferinfo.dwMaximumWindowSize =
                COORD(
                    nativeCsbi.dwMaximumWindowSize.X,
                    nativeCsbi.dwMaximumWindowSize.Y,
                )
        }
        res
    }
