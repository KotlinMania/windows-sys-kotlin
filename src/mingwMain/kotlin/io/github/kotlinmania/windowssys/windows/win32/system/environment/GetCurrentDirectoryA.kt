// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_current_directory_a
import io.github.kotlinmania.windowssys.core.PSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.usePinned

public fun GetCurrentDirectoryA(nbufferlength: UInt, lpbuffer: PSTR): UInt =
    windows_sys_get_current_directory_a(nbufferlength, lpbuffer.toCPointer<ByteVar>())

public fun GetCurrentDirectoryA(nbufferlength: UInt, lpbuffer: ByteArray?): UInt {
    if (lpbuffer == null || lpbuffer.isEmpty()) {
        return windows_sys_get_current_directory_a(nbufferlength, null)
    }
    return lpbuffer.usePinned { pinned ->
        windows_sys_get_current_directory_a(nbufferlength, pinned.addressOf(0))
    }
}
