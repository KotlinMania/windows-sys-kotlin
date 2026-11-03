// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun GetFileInformationByHandle(
    hfile: HANDLE,
    lpfileinformation: Long,
): BOOL =
    throw UnsupportedOperationException("GetFileInformationByHandle requires Windows N-API addon")

public fun GetFileInformationByHandle(
    hfile: HANDLE,
    lpfileinformation: BY_HANDLE_FILE_INFORMATION,
): BOOL =
    throw UnsupportedOperationException("GetFileInformationByHandle requires Windows N-API addon")
