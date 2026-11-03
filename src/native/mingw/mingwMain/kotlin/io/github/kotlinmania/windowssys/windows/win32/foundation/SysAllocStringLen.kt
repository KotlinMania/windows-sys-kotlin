// port-lint: source Windows/Win32/Foundation/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import io.github.kotlinmania.windowssys.cinterop.SysAllocStringLen as winSysAllocStringLen

// Upstream line 16 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("oleaut32.dll" "system"
//       fn SysAllocStringLen(strin : windows_sys::core::PCWSTR,
//                            ui : u32)
//           -> windows_sys::core::BSTR);

public fun SysAllocStringLen(strin: PCWSTR, ui: UInt): BSTR =
    winSysAllocStringLen(strin.toCPointer<UShortVar>(), ui)?.toLong() ?: 0L
