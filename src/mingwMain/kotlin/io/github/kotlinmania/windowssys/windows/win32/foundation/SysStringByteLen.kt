// port-lint: source Windows/Win32/Foundation/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.cinterop.SysStringByteLen as winSysStringByteLen
import io.github.kotlinmania.windowssys.core.BSTR

// Upstream line 21 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("oleaut32.dll" "system"
//       fn SysStringByteLen(bstr : windows_sys::core::BSTR) -> u32);

public fun SysStringByteLen(bstr: BSTR): UInt = winSysStringByteLen(bstr)