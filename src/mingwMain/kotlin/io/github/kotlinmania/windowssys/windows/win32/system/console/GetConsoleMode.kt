// port-lint: source Windows/Win32/System/Console/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_console_mode
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.UIntVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.usePinned

public fun GetConsoleMode(
    hconsolehandle: HANDLE,
    lpmode: Long,
): BOOL =
    windows_sys_get_console_mode(
        hconsolehandle.toCPointer(),
        lpmode.toCPointer<UIntVar>(),
    )

public fun GetConsoleMode(
    hconsolehandle: HANDLE,
    lpmode: UIntArray,
): BOOL {
    if (lpmode.isEmpty()) return 0
    return lpmode.usePinned { pinned ->
        windows_sys_get_console_mode(
            hconsolehandle.toCPointer(),
            pinned.addressOf(0),
        )
    }
}
