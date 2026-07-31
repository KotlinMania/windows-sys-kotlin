// port-lint: source Windows/Win32/Foundation/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BOOL
import kotlinx.cinterop.UIntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.value
import platform.windows.GetHandleInformation as winGetHandleInformation

// Upstream line 5 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn GetHandleInformation(hobject : HANDLE, lpdwflags : *mut u32)
//           -> windows_sys::core::BOOL);
//
// Retrieves flags for an object handle. The `lpdwflags` out-param is
// `*mut u32`; the Kotlin wrapper accepts a `UIntArray` of size 1 —
// the caller reads the flags from index 0 after the call returns.

public fun GetHandleInformation(hobject: HANDLE, lpdwflags: UIntArray): BOOL =
    memScoped {
        val flags = alloc<UIntVar>()
        val result = winGetHandleInformation(hobject.toCPointer(), flags.ptr)
        lpdwflags[0] = flags.value
        result
    }
