// port-lint: source Windows/Win32/System/Threading/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.windowssys.cinterop.windows_sys_open_process
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.toLong

// Upstream in Windows/Win32/System/Threading/mod.rs:
//   windows_link::link!("kernel32.dll" "system" fn OpenProcess(dwdesiredaccess : PROCESS_ACCESS_RIGHTS, binherithandle : windows_sys::core::BOOL, dwprocessid : u32) -> super::super::Foundation:: HANDLE);

public fun OpenProcess(
    dwdesiredaccess: PROCESS_ACCESS_RIGHTS,
    binherithandle: BOOL,
    dwprocessid: UInt,
): HANDLE =
    windows_sys_open_process(dwdesiredaccess, binherithandle, dwprocessid)?.toLong() ?: 0L
