// port-lint: source Windows/Win32/Foundation/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import platform.windows.LocalFree as winLocalFree

// Upstream line 8 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn LocalFree(hmem : HLOCAL) -> HLOCAL);
//
// Frees the specified local memory object and invalidates its handle.
// Upstream returns `HLOCAL` — null on success, the original handle on
// failure. Direct wrapper around `platform.windows.LocalFree`
// (kernel32.dll) with the same `Long ↔ CPointer<*>` bridge used by
// CloseHandle.

public fun LocalFree(hmem: HLOCAL): HLOCAL =
    winLocalFree(hmem.toCPointer())?.toLong() ?: 0L
