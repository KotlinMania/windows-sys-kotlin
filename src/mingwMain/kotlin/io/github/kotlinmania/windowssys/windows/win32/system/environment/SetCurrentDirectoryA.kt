// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.cinterop.windows_sys_set_current_directory_a
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.usePinned

public fun SetCurrentDirectoryA(lppathname: PCSTR): BOOL =
    windows_sys_set_current_directory_a(lppathname.toCPointer<ByteVar>())

public fun SetCurrentDirectoryA(lppathname: ByteArray): BOOL {
    if (lppathname.isEmpty()) return 0
    return lppathname.usePinned { pinned ->
        windows_sys_set_current_directory_a(pinned.addressOf(0))
    }
}
