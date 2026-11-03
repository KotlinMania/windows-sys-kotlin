// port-lint: source Windows/Win32/UI/Shell/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.ui.shell

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun SHGetKnownFolderPath(
    rfid: Long,
    dwflags: UInt,
    htoken: HANDLE,
    ppszpath: LongArray,
): HRESULT =
    throw UnsupportedOperationException("SHGetKnownFolderPath requires Windows N-API addon")

public fun SHGetKnownFolderPath(
    rfid: GUID,
    dwflags: UInt,
    htoken: HANDLE,
    ppszpath: LongArray,
): HRESULT =
    throw UnsupportedOperationException("SHGetKnownFolderPath requires Windows N-API addon")
