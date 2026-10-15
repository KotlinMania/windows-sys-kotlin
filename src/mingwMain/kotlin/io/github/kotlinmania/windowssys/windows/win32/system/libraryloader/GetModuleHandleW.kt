// port-lint: source Windows/Win32/System/LibraryLoader/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.libraryloader

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_module_handle_w
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import kotlinx.cinterop.usePinned

public fun GetModuleHandleW(lpmodulename: PCWSTR): HMODULE =
    windows_sys_get_module_handle_w(lpmodulename.toCPointer<UShortVar>())?.toLong() ?: 0L

public fun GetModuleHandleW(lpmodulename: UShortArray?): HMODULE {
    if (lpmodulename == null || lpmodulename.isEmpty()) {
        return windows_sys_get_module_handle_w(null)?.toLong() ?: 0L
    }
    return lpmodulename.usePinned { pinned ->
        windows_sys_get_module_handle_w(pinned.addressOf(0))?.toLong() ?: 0L
    }
}
