package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public typealias NS_CMD_FLAGS = Int

public typealias NS_EVENTS = Int

public typealias NS_MODE_CHANGE = Int

public typealias NS_REQS = Int

public fun interface PFN_CUSTOM_HELPFn {
    public operator fun invoke(hmodule: HANDLE, pwszcmdtoken: PCWSTR)
}

public typealias PFN_CUSTOM_HELP = PFN_CUSTOM_HELPFn?

public fun interface PFN_HANDLE_CMDFn {
    public operator fun invoke(pwszmachine: PCWSTR, ppwcarguments: Long, dwcurrentindex: UInt, dwargcount: UInt, dwflags: UInt, pvdata: Long, pbdone: Long): UInt
}

public typealias PFN_HANDLE_CMD = PFN_HANDLE_CMDFn?

public fun interface PGET_RESOURCE_STRING_FNFn {
    public operator fun invoke(dwmsgid: UInt, lpbuffer: PCWSTR, nbuffermax: UInt): UInt
}

public typealias PGET_RESOURCE_STRING_FN = PGET_RESOURCE_STRING_FNFn?

public fun interface PNS_CONTEXT_COMMIT_FNFn {
    public operator fun invoke(dwaction: UInt): UInt
}

public typealias PNS_CONTEXT_COMMIT_FN = PNS_CONTEXT_COMMIT_FNFn?

public fun interface PNS_CONTEXT_CONNECT_FNFn {
    public operator fun invoke(pwszmachine: PCWSTR): UInt
}

public typealias PNS_CONTEXT_CONNECT_FN = PNS_CONTEXT_CONNECT_FNFn?

public fun interface PNS_CONTEXT_DUMP_FNFn {
    public operator fun invoke(pwszrouter: PCWSTR, ppwcarguments: Long, dwargcount: UInt, pvdata: Long): UInt
}

public typealias PNS_CONTEXT_DUMP_FN = PNS_CONTEXT_DUMP_FNFn?

public fun interface PNS_DLL_INIT_FNFn {
    public operator fun invoke(dwnetshversion: UInt, preserved: Long): UInt
}

public typealias PNS_DLL_INIT_FN = PNS_DLL_INIT_FNFn?

public fun interface PNS_DLL_STOP_FNFn {
    public operator fun invoke(dwreserved: UInt): UInt
}

public typealias PNS_DLL_STOP_FN = PNS_DLL_STOP_FNFn?

public fun interface PNS_HELPER_START_FNFn {
    public operator fun invoke(pguidparent: Long, dwversion: UInt): UInt
}

public typealias PNS_HELPER_START_FN = PNS_HELPER_START_FNFn?

public fun interface PNS_HELPER_STOP_FNFn {
    public operator fun invoke(dwreserved: UInt): UInt
}

public typealias PNS_HELPER_STOP_FN = PNS_HELPER_STOP_FNFn?

public fun interface PNS_OSVERSIONCHECKFn {
    public operator fun invoke(cimostype: UInt, cimosproductsuite: UInt, cimosversion: PCWSTR, cimosbuildnumber: PCWSTR, cimservicepackmajorversion: PCWSTR, cimservicepackminorversion: PCWSTR, uireserved: UInt, dwreserved: UInt): BOOL
}

public typealias PNS_OSVERSIONCHECK = PNS_OSVERSIONCHECKFn?
