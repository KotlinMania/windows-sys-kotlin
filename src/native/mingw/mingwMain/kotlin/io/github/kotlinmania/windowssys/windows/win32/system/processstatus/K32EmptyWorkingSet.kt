// port-lint: source Windows/Win32/System/ProcessStatus/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.windowssys.cinterop.windows_sys_k32_empty_working_set
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.toCPointer

public fun K32EmptyWorkingSet(hprocess: HANDLE): BOOL =
    windows_sys_k32_empty_working_set(hprocess.toCPointer())
