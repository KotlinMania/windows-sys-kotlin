// port-lint: source Windows/Win32/System/Threading/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun GetCurrentThread(): HANDLE =
    throw UnsupportedOperationException("GetCurrentThread requires Windows N-API addon")
