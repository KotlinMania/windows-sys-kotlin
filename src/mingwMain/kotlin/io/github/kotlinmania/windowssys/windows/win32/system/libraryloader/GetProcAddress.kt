// port-lint: source Windows/Win32/System/LibraryLoader/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.libraryloader

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_proc_address
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FARPROC
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import kotlinx.cinterop.usePinned

public fun GetProcAddress(
    hmodule: HMODULE,
    lpprocname: PCSTR,
): FARPROC? {
    val addr =
        windows_sys_get_proc_address(
            hmodule.toCPointer(),
            lpprocname.toCPointer<ByteVar>(),
        )?.toLong() ?: 0L
    return if (addr == 0L) null else FARPROC { addr }
}

public fun GetProcAddress(
    hmodule: HMODULE,
    lpprocname: ByteArray,
): FARPROC? {
    if (lpprocname.isEmpty()) return null
    val addr =
        lpprocname.usePinned { pinned ->
            windows_sys_get_proc_address(
                hmodule.toCPointer(),
                pinned.addressOf(0),
            )?.toLong() ?: 0L
        }
    return if (addr == 0L) null else FARPROC { addr }
}
