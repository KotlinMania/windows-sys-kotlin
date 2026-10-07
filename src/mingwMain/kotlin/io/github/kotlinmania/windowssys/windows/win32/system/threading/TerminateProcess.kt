// port-lint: source Windows/Win32/System/Threading/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.windowssys.cinterop.windows_sys_terminate_process
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.toCPointer

// Upstream in Windows/Win32/System/Threading/mod.rs:
//   windows_link::link!("kernel32.dll" "system" fn TerminateProcess(hprocess : super::super::Foundation:: HANDLE, uexitcode : u32) -> windows_sys::core::BOOL);

public fun TerminateProcess(hprocess: HANDLE, uexitcode: UInt): BOOL =
    windows_sys_terminate_process(hprocess.toCPointer(), uexitcode)
