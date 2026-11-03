// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_current_directory_w
import io.github.kotlinmania.windowssys.core.PWSTR
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.usePinned

public fun GetCurrentDirectoryW(nbufferlength: UInt, lpbuffer: PWSTR): UInt =
    windows_sys_get_current_directory_w(nbufferlength, lpbuffer.toCPointer<UShortVar>())

public fun GetCurrentDirectoryW(nbufferlength: UInt, lpbuffer: UShortArray?): UInt {
    if (lpbuffer == null || lpbuffer.isEmpty()) {
        return windows_sys_get_current_directory_w(nbufferlength, null)
    }
    return lpbuffer.usePinned { pinned ->
        windows_sys_get_current_directory_w(nbufferlength, pinned.addressOf(0))
    }
}
