// port-lint: source Windows/Win32/System/Com/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com

import io.github.kotlinmania.windowssys.cinterop.windows_sys_co_task_mem_free
import kotlinx.cinterop.toCPointer

public fun CoTaskMemFree(pv: Long) {
    windows_sys_co_task_mem_free(pv.toCPointer())
}
