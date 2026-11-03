// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.cinterop.windows_sys_delete_file_w
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.toCPointer

// Upstream in Windows/Win32/Storage/FileSystem/mod.rs:
//   windows_link::link!("kernel32.dll" "system" fn DeleteFileW(lpfilename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

public fun DeleteFileW(lpfilename: PCWSTR): BOOL =
    windows_sys_delete_file_w(lpfilename.toCPointer<UShortVar>())
