// port-lint: source Windows/Win32/System/Environment/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.PSTR

public fun GetEnvironmentStrings(): PSTR =
    throw UnsupportedOperationException("GetEnvironmentStrings requires Windows N-API addon")
