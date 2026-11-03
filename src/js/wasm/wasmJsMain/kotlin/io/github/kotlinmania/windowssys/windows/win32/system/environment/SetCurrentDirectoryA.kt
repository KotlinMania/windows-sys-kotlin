// port-lint: source Windows/Win32/System/Environment/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR

public fun SetCurrentDirectoryA(lppathname: PCSTR): BOOL =
    throw UnsupportedOperationException("SetCurrentDirectoryA requires Windows N-API addon")

public fun SetCurrentDirectoryA(lppathname: ByteArray): BOOL =
    throw UnsupportedOperationException("SetCurrentDirectoryA requires Windows N-API addon")
