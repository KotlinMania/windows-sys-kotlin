// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import com.sun.jna.Pointer
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.internal.Kernel32Jna

// Upstream line 10 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn SetHandleInformation(hobject : HANDLE, dwmask : u32,
//                               dwflags : HANDLE_FLAGS)
//           -> windows_sys::core::BOOL);

public fun SetHandleInformation(
    hobject: HANDLE,
    dwmask: UInt,
    dwflags: HANDLE_FLAGS,
): BOOL = Kernel32Jna.INSTANCE.SetHandleInformation(
    Pointer(hobject),
    dwmask.toInt(),
    dwflags.toInt(),
)
