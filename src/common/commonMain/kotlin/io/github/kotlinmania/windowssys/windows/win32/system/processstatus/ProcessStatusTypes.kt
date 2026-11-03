package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public typealias ENUM_PROCESS_MODULES_EX_FLAGS = UInt

public fun interface PENUM_PAGE_FILE_CALLBACKAFn {
    public operator fun invoke(pcontext: Long, ppagefileinfo: Long, lpfilename: PCSTR): BOOL
}

public typealias PENUM_PAGE_FILE_CALLBACKA = PENUM_PAGE_FILE_CALLBACKAFn?

public fun interface PENUM_PAGE_FILE_CALLBACKWFn {
    public operator fun invoke(pcontext: Long, ppagefileinfo: Long, lpfilename: PCWSTR): BOOL
}

public typealias PENUM_PAGE_FILE_CALLBACKW = PENUM_PAGE_FILE_CALLBACKWFn?
