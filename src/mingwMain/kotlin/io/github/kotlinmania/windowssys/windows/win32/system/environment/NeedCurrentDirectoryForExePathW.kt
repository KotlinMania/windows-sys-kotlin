// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.cinterop.windows_sys_need_current_directory_for_exe_path_w
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.usePinned

public fun NeedCurrentDirectoryForExePathW(exename: PCWSTR): BOOL =
    windows_sys_need_current_directory_for_exe_path_w(exename.toCPointer<UShortVar>())

public fun NeedCurrentDirectoryForExePathW(exename: UShortArray): BOOL {
    if (exename.isEmpty()) return 0
    return exename.usePinned { pinned ->
        windows_sys_need_current_directory_for_exe_path_w(pinned.addressOf(0))
    }
}
