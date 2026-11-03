// port-lint: source Windows/Win32/System/Console/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_console_cursor_info
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toCPointer
import platform.windows.CONSOLE_CURSOR_INFO as CConsoleCursorInfo

public fun GetConsoleCursorInfo(
    hconsoleoutput: HANDLE,
    lpconsolecursorinfo: Long,
): BOOL =
    windows_sys_get_console_cursor_info(
        hconsoleoutput.toCPointer(),
        lpconsolecursorinfo.toCPointer(),
    )

public fun GetConsoleCursorInfo(
    hconsoleoutput: HANDLE,
    lpconsolecursorinfo: CONSOLE_CURSOR_INFO,
): BOOL =
    memScoped {
        val nativeCci = alloc<CConsoleCursorInfo>()
        val res = windows_sys_get_console_cursor_info(hconsoleoutput.toCPointer(), nativeCci.ptr)
        if (res != 0) {
            lpconsolecursorinfo.dwSize = nativeCci.dwSize
            lpconsolecursorinfo.bVisible = nativeCci.bVisible
        }
        res
    }
