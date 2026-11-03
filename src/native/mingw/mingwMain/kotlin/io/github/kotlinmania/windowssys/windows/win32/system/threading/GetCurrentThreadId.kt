// port-lint: source Windows/Win32/System/Threading/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_current_thread_id

// Upstream in Windows/Win32/System/Threading/mod.rs:
//   windows_link::link!("kernel32.dll" "system" fn GetCurrentThreadId() -> u32);

public fun GetCurrentThreadId(): UInt = windows_sys_get_current_thread_id()
