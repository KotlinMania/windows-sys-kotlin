// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.cinterop.windows_sys_are_file_apis_ansi
import io.github.kotlinmania.windowssys.core.BOOL

// Upstream in Windows/Win32/Storage/FileSystem/mod.rs:
//   windows_link::link!("kernel32.dll" "system" fn AreFileApisANSI() -> windows_sys::core::BOOL);

public fun AreFileApisANSI(): BOOL = windows_sys_are_file_apis_ansi()
