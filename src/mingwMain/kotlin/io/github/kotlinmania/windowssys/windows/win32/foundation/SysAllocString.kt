// port-lint: source windows-sys/src/Windows/Win32/Foundation/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import io.github.kotlinmania.windowssys.cinterop.SysAllocString as winSysAllocString

// Upstream line 14 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("oleaut32.dll" "system"
//       fn SysAllocString(psz : windows_sys::core::PCWSTR)
//           -> windows_sys::core::BSTR);
//
// Allocates and copies a BSTR from a wide string pointer.

public fun SysAllocString(psz: PCWSTR): BSTR =
    winSysAllocString(psz.toCPointer<UShortVar>())?.toLong() ?: 0L
