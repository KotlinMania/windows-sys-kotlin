// port-lint: source windows-sys/src/Windows/Win32/Foundation/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.cinterop.RtlNtStatusToDosError as winRtlNtStatusToDosError

// Upstream line 9 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("ntdll.dll" "system"
//       fn RtlNtStatusToDosError(status : NTSTATUS) -> u32);
//
// Converts an NTSTATUS code to a Win32 error code. The function is
// declared in winternl.h but not included in the default platform.windows
// cinterop; it is provided through the win32extras cinterop def.

public fun RtlNtStatusToDosError(status: NTSTATUS): UInt = winRtlNtStatusToDosError(status)
