// port-lint: source Windows/Win32/Foundation/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BOOL
import kotlinx.cinterop.toCPointer
import platform.windows.SetHandleInformation as winSetHandleInformation

// Upstream line 10 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn SetHandleInformation(hobject : HANDLE, dwmask : u32,
//                               dwflags : HANDLE_FLAGS)
//           -> windows_sys::core::BOOL);
//
// Sets certain properties of an object handle. Direct wrapper around
// `platform.windows.SetHandleInformation` (kernel32.dll).

public fun SetHandleInformation(
    hobject: HANDLE,
    dwmask: UInt,
    dwflags: HANDLE_FLAGS,
): BOOL = winSetHandleInformation(hobject.toCPointer(), dwmask, dwflags)
