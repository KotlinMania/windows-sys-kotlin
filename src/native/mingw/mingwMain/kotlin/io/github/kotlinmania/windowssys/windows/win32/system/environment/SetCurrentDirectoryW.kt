// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.cinterop.windows_sys_set_current_directory_w
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.usePinned

public fun SetCurrentDirectoryW(lppathname: PCWSTR): BOOL =
    windows_sys_set_current_directory_w(lppathname.toCPointer<UShortVar>())

public fun SetCurrentDirectoryW(lppathname: UShortArray): BOOL {
    if (lppathname.isEmpty()) return 0
    return lppathname.usePinned { pinned ->
        windows_sys_set_current_directory_w(pinned.addressOf(0))
    }
}
