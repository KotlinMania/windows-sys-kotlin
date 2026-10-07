// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.core.PCWSTR

public fun GetFileAttributesW(lpfilename: PCWSTR): UInt =
    throw UnsupportedOperationException("GetFileAttributesW requires Windows N-API addon")
