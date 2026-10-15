// port-lint: source Windows/Win32/System/Console/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.cinterop.windows_sys_set_console_cursor_info
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toCPointer
import platform.windows.CONSOLE_CURSOR_INFO as CConsoleCursorInfo

public fun SetConsoleCursorInfo(
    hconsoleoutput: HANDLE,
    lpconsolecursorinfo: Long,
): BOOL =
    windows_sys_set_console_cursor_info(
        hconsoleoutput.toCPointer(),
        lpconsolecursorinfo.toCPointer(),
    )

public fun SetConsoleCursorInfo(
    hconsoleoutput: HANDLE,
    lpconsolecursorinfo: CONSOLE_CURSOR_INFO,
): BOOL =
    memScoped {
        val nativeCci = alloc<CConsoleCursorInfo>()
        nativeCci.dwSize = lpconsolecursorinfo.dwSize
        nativeCci.bVisible = lpconsolecursorinfo.bVisible
        windows_sys_set_console_cursor_info(hconsoleoutput.toCPointer(), nativeCci.ptr)
    }
