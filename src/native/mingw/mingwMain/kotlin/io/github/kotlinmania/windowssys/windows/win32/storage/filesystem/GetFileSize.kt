// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_file_size
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.UIntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.value

// Upstream in Windows/Win32/Storage/FileSystem/mod.rs:
//   windows_link::link!("kernel32.dll" "system" fn GetFileSize(hfile : super::super::Foundation:: HANDLE, lpfilesizehigh : *mut u32) -> u32);

public fun GetFileSize(hfile: HANDLE, lpfilesizehigh: UIntArray?): UInt {
    if (lpfilesizehigh == null) {
        return windows_sys_get_file_size(hfile.toCPointer(), null)
    }
    return memScoped {
        val high = alloc<UIntVar>()
        high.value = lpfilesizehigh[0]
        val res = windows_sys_get_file_size(hfile.toCPointer(), high.ptr)
        lpfilesizehigh[0] = high.value
        res
    }
}
