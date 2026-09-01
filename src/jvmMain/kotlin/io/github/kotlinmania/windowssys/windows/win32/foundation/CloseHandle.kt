// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import com.sun.jna.Pointer
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.internal.Kernel32Jna

// Upstream line 1 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn CloseHandle(hobject : HANDLE) -> windows_sys::core::BOOL);
//
// JVM-on-Windows wrapper. Same public signature as the mingwMain
// cinterop wrapper; routes through the JNA-loaded kernel32.dll.

public fun CloseHandle(hobject: HANDLE): BOOL =
    Kernel32Jna.INSTANCE.CloseHandle(Pointer(hobject))
