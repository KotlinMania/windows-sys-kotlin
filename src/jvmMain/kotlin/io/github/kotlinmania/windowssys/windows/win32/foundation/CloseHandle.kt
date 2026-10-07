// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

// Upstream line 1 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn CloseHandle(hobject : HANDLE) -> windows_sys::core::BOOL);
//
// JVM-on-Windows wrapper routing through the custom JNI C bridge.

public fun CloseHandle(hobject: HANDLE): BOOL =
    Kernel32Jni.CloseHandle(hobject)
