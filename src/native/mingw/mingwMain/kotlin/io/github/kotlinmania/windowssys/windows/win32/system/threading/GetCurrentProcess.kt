// port-lint: source Windows/Win32/System/Threading/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_current_process
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.toLong

// Upstream in Windows/Win32/System/Threading/mod.rs:
//   windows_link::link!("kernel32.dll" "system" fn GetCurrentProcess() -> super::super::Foundation:: HANDLE);

public fun GetCurrentProcess(): HANDLE =
    windows_sys_get_current_process()?.toLong() ?: -1L
