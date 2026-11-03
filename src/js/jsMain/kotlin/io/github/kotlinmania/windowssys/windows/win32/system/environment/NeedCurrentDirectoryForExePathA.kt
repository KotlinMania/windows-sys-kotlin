// port-lint: source Windows/Win32/System/Environment/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR

public fun NeedCurrentDirectoryForExePathA(exename: PCSTR): BOOL =
    WindowsSysNative.NeedCurrentDirectoryForExePathA(exename.toDouble())

public fun NeedCurrentDirectoryForExePathA(exename: ByteArray): BOOL = 0
