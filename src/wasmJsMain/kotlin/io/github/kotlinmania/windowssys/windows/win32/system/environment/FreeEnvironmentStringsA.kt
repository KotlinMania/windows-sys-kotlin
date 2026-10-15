// port-lint: source Windows/Win32/System/Environment/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR

public fun FreeEnvironmentStringsA(penv: PCSTR): BOOL =
    throw UnsupportedOperationException("FreeEnvironmentStringsA requires Windows N-API addon")
