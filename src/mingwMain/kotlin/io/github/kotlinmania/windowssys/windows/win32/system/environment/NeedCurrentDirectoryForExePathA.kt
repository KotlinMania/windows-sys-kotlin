// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.cinterop.windows_sys_need_current_directory_for_exe_path_a
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.usePinned

public fun NeedCurrentDirectoryForExePathA(exename: PCSTR): BOOL =
    windows_sys_need_current_directory_for_exe_path_a(exename.toCPointer<ByteVar>())

public fun NeedCurrentDirectoryForExePathA(exename: ByteArray): BOOL {
    if (exename.isEmpty()) return 0
    return exename.usePinned { pinned ->
        windows_sys_need_current_directory_for_exe_path_a(pinned.addressOf(0))
    }
}
