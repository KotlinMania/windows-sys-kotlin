// port-lint: source Windows/Win32/Foundation/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BOOL
import kotlinx.cinterop.toCPointer
import platform.windows.CloseHandle as winCloseHandle

// Upstream line 1 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn CloseHandle(hobject : HANDLE) -> windows_sys::core::BOOL);
//
// Kotlin/Native ships `platform.windows.CloseHandle` from the
// MinGW-w64 import library for kernel32.dll, generated from the
// Windows SDK headers. This file is the Kotlin-named facade that
// bridges between this port's `Long`-based [HANDLE] typealias and
// `platform.windows.HANDLE` (`CPointer<…>?`). The conversion is a
// `nativeNullPtr`-aware pointer interpretation: a `0L` HANDLE
// corresponds to a null pointer, anything else to the address as an
// opaque `CPointer<*>`.

public fun CloseHandle(hobject: HANDLE): BOOL =
    winCloseHandle(hobject.toCPointer())
