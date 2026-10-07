// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.cinterop.windows_sys_set_file_pointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.value

// Upstream in Windows/Win32/Storage/FileSystem/mod.rs:
//   windows_link::link!("kernel32.dll" "system" fn SetFilePointer(hfile : super::super::Foundation:: HANDLE, ldistancetomove : i32, lpdistancetomovehigh : *mut i32, dwmovemethod : SET_FILE_POINTER_MOVE_METHOD) -> u32);

public fun SetFilePointer(
    hfile: HANDLE,
    ldistancetomove: Int,
    lpdistancetomovehigh: IntArray?,
    dwmovemethod: SET_FILE_POINTER_MOVE_METHOD,
): UInt {
    if (lpdistancetomovehigh == null) {
        return windows_sys_set_file_pointer(hfile.toCPointer(), ldistancetomove, null, dwmovemethod)
    }
    return memScoped {
        val high = alloc<IntVar>()
        high.value = lpdistancetomovehigh[0]
        val res = windows_sys_set_file_pointer(hfile.toCPointer(), ldistancetomove, high.ptr, dwmovemethod)
        lpdistancetomovehigh[0] = high.value
        res
    }
}
