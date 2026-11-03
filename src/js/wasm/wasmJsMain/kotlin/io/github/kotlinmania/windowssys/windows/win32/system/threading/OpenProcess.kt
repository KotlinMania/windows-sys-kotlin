// port-lint: source Windows/Win32/System/Threading/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun OpenProcess(
    dwdesiredaccess: PROCESS_ACCESS_RIGHTS,
    binherithandle: BOOL,
    dwprocessid: UInt,
): HANDLE =
    throw UnsupportedOperationException("OpenProcess requires Windows N-API addon")
