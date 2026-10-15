// port-lint: source Windows/Win32/System/LibraryLoader/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.libraryloader

import io.github.kotlinmania.windowssys.cinterop.windows_sys_load_library_w
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import kotlinx.cinterop.usePinned

public fun LoadLibraryW(lplibfilename: PCWSTR): HMODULE =
    windows_sys_load_library_w(lplibfilename.toCPointer<UShortVar>())?.toLong() ?: 0L

public fun LoadLibraryW(lplibfilename: UShortArray): HMODULE {
    if (lplibfilename.isEmpty()) return 0L
    return lplibfilename.usePinned { pinned ->
        windows_sys_load_library_w(pinned.addressOf(0))?.toLong() ?: 0L
    }
}
