// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.core.PCSTR

public fun GetFileAttributesA(lpfilename: PCSTR): UInt =
    throw UnsupportedOperationException("GetFileAttributesA requires Windows N-API addon")
