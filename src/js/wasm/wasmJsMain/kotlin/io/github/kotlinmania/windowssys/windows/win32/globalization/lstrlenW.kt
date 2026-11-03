// port-lint: source Windows/Win32/Globalization/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.windowssys.core.PCWSTR

public fun lstrlenW(lpstring: PCWSTR): Int =
    throw UnsupportedOperationException("lstrlenW requires Windows N-API addon")
