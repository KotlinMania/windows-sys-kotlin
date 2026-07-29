// port-lint: source Windows/Win32/Foundation/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import platform.windows.GlobalFree as winGlobalFree

// Upstream line 7 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn GlobalFree(hmem : HGLOBAL) -> HGLOBAL);
//
// Frees a global memory block and returns a null handle on success.
// Direct wrapper around `platform.windows.GlobalFree` (kernel32.dll).

public fun GlobalFree(hmem: HGLOBAL): HGLOBAL =
    winGlobalFree(hmem.toCPointer())?.toLong() ?: 0L