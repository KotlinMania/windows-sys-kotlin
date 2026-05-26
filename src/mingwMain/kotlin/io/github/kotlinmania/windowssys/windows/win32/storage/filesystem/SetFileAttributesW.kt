// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toKStringFromUtf16
import platform.windows.SetFileAttributesW as winSetFileAttributesW

// Upstream line 392 in Windows/Win32/Storage/FileSystem/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn SetFileAttributesW(lpfilename : windows_sys::core::PCWSTR,
//                             dwfileattributes : FILE_FLAGS_AND_ATTRIBUTES)
//           -> windows_sys::core::BOOL);
//
// Sets the attributes of a file (or directory). The upstream Rust
// signature takes a `*const u16` wide-string pointer. Kotlin/Native's
// MinGW interop binding wraps the same Win32 entry point but exposes
// the wide-string parameter as a Kotlin `String?` (auto-converted to
// UTF-16). We bridge between this port's `Long`-typealiased `PCWSTR`
// (the raw pointer value) and the cinterop binding by reading the
// UTF-16 string out of the pointer and re-passing it.

public fun SetFileAttributesW(
    lpfilename: PCWSTR,
    dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES,
): BOOL = winSetFileAttributesW(
    lpfilename.toCPointer<UShortVar>()?.toKStringFromUtf16(),
    dwfileattributes,
)
