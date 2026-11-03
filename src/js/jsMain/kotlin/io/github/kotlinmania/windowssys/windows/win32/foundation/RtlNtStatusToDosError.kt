// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.WindowsSysNative

// Upstream line 9 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("ntdll.dll" "system"
//       fn RtlNtStatusToDosError(status : NTSTATUS) -> u32);

public fun RtlNtStatusToDosError(status: NTSTATUS): UInt =
    WindowsSysNative.RtlNtStatusToDosError(status).toUInt()
