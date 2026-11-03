// port-lint: source Windows/Win32/System/Threading/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun TerminateProcess(hprocess: HANDLE, uexitcode: UInt): BOOL =
    WindowsSysNative.TerminateProcess(hprocess.toDouble(), uexitcode.toInt())
