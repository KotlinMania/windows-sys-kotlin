// port-lint: source Windows/Win32/System/Console/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_number_of_console_input_events
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.UIntVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.usePinned

public fun GetNumberOfConsoleInputEvents(
    hconsoleinput: HANDLE,
    lpnumberofevents: Long,
): BOOL =
    windows_sys_get_number_of_console_input_events(
        hconsoleinput.toCPointer(),
        lpnumberofevents.toCPointer<UIntVar>(),
    )

public fun GetNumberOfConsoleInputEvents(
    hconsoleinput: HANDLE,
    lpnumberofevents: UIntArray,
): BOOL {
    if (lpnumberofevents.isEmpty()) return 0
    return lpnumberofevents.usePinned { pinned ->
        windows_sys_get_number_of_console_input_events(
            hconsoleinput.toCPointer(),
            pinned.addressOf(0),
        )
    }
}
