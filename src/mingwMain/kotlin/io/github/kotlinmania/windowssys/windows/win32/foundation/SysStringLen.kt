// port-lint: source windows-sys/src/Windows/Win32/Foundation/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BSTR
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.toCPointer
import io.github.kotlinmania.windowssys.cinterop.SysStringLen as winSysStringLen

// Upstream line 22 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("oleaut32.dll" "system"
//       fn SysStringLen(pbstr : windows_sys::core::BSTR) -> u32);
//
// Returns the length in characters (not bytes) of a BSTR.

public fun SysStringLen(pbstr: BSTR): UInt =
    winSysStringLen(pbstr.toCPointer<UShortVar>())
