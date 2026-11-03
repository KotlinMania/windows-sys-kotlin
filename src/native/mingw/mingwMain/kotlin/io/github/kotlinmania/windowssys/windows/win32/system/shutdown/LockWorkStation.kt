// port-lint: source Windows/Win32/System/Shutdown/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.shutdown

import io.github.kotlinmania.windowssys.cinterop.windows_sys_lock_work_station
import io.github.kotlinmania.windowssys.core.BOOL

public fun LockWorkStation(): BOOL =
    windows_sys_lock_work_station()
