// port-lint: source Windows/Win32/System/ProcessStatus/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public typealias ENUM_PROCESS_MODULES_EX_FLAGS = UInt

public fun interface PENUM_PAGE_FILE_CALLBACKA {
    public fun invoke(
        pcontext: Long,
        ppagefileinfo: ENUM_PAGE_FILE_INFORMATION?,
        lpfilename: PCSTR,
    ): BOOL
}

public fun interface PENUM_PAGE_FILE_CALLBACKW {
    public fun invoke(
        pcontext: Long,
        ppagefileinfo: ENUM_PAGE_FILE_INFORMATION?,
        lpfilename: PCWSTR,
    ): BOOL
}
