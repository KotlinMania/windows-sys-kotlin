package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog

import io.github.kotlinmania.windowssys.core.PCWSTR

public typealias CRYPTCATATTRIBUTE_FLAGS = UInt

public typealias CRYPTCAT_OPEN_FLAGS = UInt

public typealias CRYPTCAT_VERSION = UInt

public fun interface PFN_CDF_PARSE_ERROR_CALLBACKFn {
    public operator fun invoke(dwerrorarea: UInt, dwlocalerror: UInt, pwszline: PCWSTR)
}

public typealias PFN_CDF_PARSE_ERROR_CALLBACK = PFN_CDF_PARSE_ERROR_CALLBACKFn?
