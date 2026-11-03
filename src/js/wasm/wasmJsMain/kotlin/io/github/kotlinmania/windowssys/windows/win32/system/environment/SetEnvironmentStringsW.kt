// port-lint: source Windows/Win32/System/Environment/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun SetEnvironmentStringsW(newenvironment: PCWSTR): BOOL =
    throw UnsupportedOperationException("SetEnvironmentStringsW requires Windows N-API addon")
