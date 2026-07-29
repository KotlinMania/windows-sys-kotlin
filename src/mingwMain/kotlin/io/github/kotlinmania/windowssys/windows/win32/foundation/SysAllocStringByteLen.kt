// port-lint: source Windows/Win32/Foundation/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.cinterop.SysAllocStringByteLen as winSysAllocStringByteLen
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

// Upstream line 15 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("oleaut32.dll" "system"
//       fn SysAllocStringByteLen(psz : windows_sys::core::PCSTR,
//                                len : u32)
//           -> windows_sys::core::BSTR);

public fun SysAllocStringByteLen(psz: PCSTR, len: UInt): BSTR =
    winSysAllocStringByteLen(psz.toCPointer<ByteVar>(), len)?.toLong() ?: 0L