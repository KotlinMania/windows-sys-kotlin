// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun GetFileInformationByHandle(
    hfile: HANDLE,
    lpfileinformation: Long,
): BOOL =
    WindowsSysNative.GetFileInformationByHandle(
        hfile.toDouble(),
        lpfileinformation.toDouble(),
    )

public fun GetFileInformationByHandle(
    hfile: HANDLE,
    lpfileinformation: BY_HANDLE_FILE_INFORMATION,
): BOOL =
    WindowsSysNative.GetFileInformationByHandle(
        hfile.toDouble(),
        0.0,
    )
