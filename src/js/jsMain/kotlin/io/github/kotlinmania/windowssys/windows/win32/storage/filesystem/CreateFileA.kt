// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun CreateFileA(
    lpfilename: PCSTR,
    dwdesiredaccess: UInt,
    dwsharemode: FILE_SHARE_MODE,
    lpsecurityattributes: Long,
    dwcreationdisposition: FILE_CREATION_DISPOSITION,
    dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES,
    htemplatefile: HANDLE,
): HANDLE = 0L
