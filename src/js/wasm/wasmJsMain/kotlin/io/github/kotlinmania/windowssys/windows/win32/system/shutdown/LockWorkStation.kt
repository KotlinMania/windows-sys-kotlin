// port-lint: source Windows/Win32/System/Shutdown/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.shutdown

import io.github.kotlinmania.windowssys.core.BOOL

public fun LockWorkStation(): BOOL =
    throw UnsupportedOperationException("LockWorkStation requires Windows N-API addon")
