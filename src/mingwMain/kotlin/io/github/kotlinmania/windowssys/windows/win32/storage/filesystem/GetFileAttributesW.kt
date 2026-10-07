// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_file_attributes_w
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.toCPointer

// Upstream in Windows/Win32/Storage/FileSystem/mod.rs:
//   windows_link::link!("kernel32.dll" "system" fn GetFileAttributesW(lpfilename : windows_sys::core::PCWSTR) -> u32);

public fun GetFileAttributesW(lpfilename: PCWSTR): UInt =
    windows_sys_get_file_attributes_w(lpfilename.toCPointer<UShortVar>())
