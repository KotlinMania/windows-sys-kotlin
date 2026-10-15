// port-lint: source Windows/Win32/System/Environment/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR

public fun SetEnvironmentVariableA(lpname: PCSTR, lpvalue: PCSTR): BOOL =
    throw UnsupportedOperationException("SetEnvironmentVariableA requires Windows N-API addon")

public fun SetEnvironmentVariableA(lpname: ByteArray, lpvalue: ByteArray?): BOOL =
    throw UnsupportedOperationException("SetEnvironmentVariableA requires Windows N-API addon")
