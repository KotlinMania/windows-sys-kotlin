// port-lint: source Windows/Win32/Foundation/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.cinterop.SysReAllocStringLen as winSysReAllocStringLen
import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import kotlinx.cinterop.value
import platform.windows.HANDLEVar

// Upstream line 19 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("oleaut32.dll" "system"
//       fn SysReAllocStringLen(pbstr : *mut windows_sys::core::BSTR,
//                            psz : windows_sys::core::PCWSTR,
//                            len : u32) -> i32);

public fun SysReAllocStringLen(pbstr: LongArray, psz: PCWSTR, len: UInt): Int =
    memScoped {
        val bstrVar = alloc<HANDLEVar>()
        bstrVar.value = pbstr[0].toCPointer()
        val result = winSysReAllocStringLen(bstrVar.ptr, psz, len)
        pbstr[0] = bstrVar.value?.toLong() ?: 0L
        result
    }