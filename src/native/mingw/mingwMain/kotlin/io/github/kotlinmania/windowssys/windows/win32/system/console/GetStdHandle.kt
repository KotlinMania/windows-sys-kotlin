// port-lint: source Windows/Win32/System/Console/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_std_handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.toLong

public fun GetStdHandle(nstdhandle: STD_HANDLE): HANDLE =
    windows_sys_get_std_handle(nstdhandle)?.toLong() ?: 0L
