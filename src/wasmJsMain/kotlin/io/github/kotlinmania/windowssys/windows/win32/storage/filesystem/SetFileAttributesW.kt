// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun SetFileAttributesW(
    lpfilename: PCWSTR,
    dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES,
): BOOL =
    throw UnsupportedOperationException("SetFileAttributesW requires Windows N-API addon")
