// port-lint: source Windows/Win32/Foundation/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.cinterop.SysReAllocString as winSysReAllocString
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.UShortVarOf
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import kotlinx.cinterop.value

// Upstream line 18 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("oleaut32.dll" "system"
//       fn SysReAllocString(pbstr : *mut windows_sys::core::BSTR,
//                           psz : windows_sys::core::PCWSTR) -> i32);
//
// Reallocates a BSTR to hold a copy of the given wide string. The
// `pbstr` in-out parameter is a pointer to a BSTR; the Kotlin wrapper
// accepts a `LongArray` of size 1 holding the BSTR handle.

public fun SysReAllocString(pbstr: LongArray, psz: PCWSTR): Int =
    memScoped {
        val bstrVar = alloc<UShortVarOf<UShort>>()
        bstrVar.value = (pbstr[0].toCPointer<UShortVar>()?.reinterpret())?.pointed?.value ?: 0.toUShort()
        val bstrPtr = alloc<UShortVarOf<UShort>>()
        val result = winSysReAllocString(bstrPtr.ptr, psz.toCPointer<UShortVar>())
        pbstr[0] = bstrPtr.value.toLong()
        result
    }