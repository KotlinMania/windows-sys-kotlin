// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.cinterop.windows_sys_delete_file_a
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

// Upstream in Windows/Win32/Storage/FileSystem/mod.rs:
//   windows_link::link!("kernel32.dll" "system" fn DeleteFileA(lpfilename : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

public fun DeleteFileA(lpfilename: PCSTR): BOOL =
    windows_sys_delete_file_a(lpfilename.toCPointer<ByteVar>())
