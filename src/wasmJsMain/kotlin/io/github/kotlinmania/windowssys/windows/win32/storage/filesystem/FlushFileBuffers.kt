// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun FlushFileBuffers(hfile: HANDLE): BOOL =
    throw UnsupportedOperationException("FlushFileBuffers requires Windows N-API addon")
