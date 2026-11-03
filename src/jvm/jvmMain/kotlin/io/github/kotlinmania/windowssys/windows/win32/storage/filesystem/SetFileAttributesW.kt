// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

// Upstream line 392 in Windows/Win32/Storage/FileSystem/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn SetFileAttributesW(lpfilename : windows_sys::core::PCWSTR,
//                             dwfileattributes : FILE_FLAGS_AND_ATTRIBUTES)
//           -> windows_sys::core::BOOL);

public fun SetFileAttributesW(
    lpfilename: PCWSTR,
    dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES,
): BOOL =
    Kernel32Jni.SetFileAttributesW(lpfilename, dwfileattributes.toInt())
