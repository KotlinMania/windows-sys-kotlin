package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public typealias NsCmdFlags = Int

public typealias NsEvents = Int

public typealias NsModeChange = Int

public typealias NsReqs = Int

public fun interface PfnCustomHelpFn {
    public operator fun invoke(hmodule: Handle, pwszcmdtoken: Pcwstr)
}

public typealias PfnCustomHelp = PfnCustomHelpFn?

public fun interface PfnHandleCmdFn {
    public operator fun invoke(pwszmachine: Pcwstr, ppwcarguments: MutPtr, dwcurrentindex: UInt, dwargcount: UInt, dwflags: UInt, pvdata: ConstPtr, pbdone: MutPtr): UInt
}

public typealias PfnHandleCmd = PfnHandleCmdFn?

public fun interface PgetResourceStringFnFn {
    public operator fun invoke(dwmsgid: UInt, lpbuffer: Pcwstr, nbuffermax: UInt): UInt
}

public typealias PgetResourceStringFn = PgetResourceStringFnFn?

public fun interface PnsContextCommitFnFn {
    public operator fun invoke(dwaction: UInt): UInt
}

public typealias PnsContextCommitFn = PnsContextCommitFnFn?

public fun interface PnsContextConnectFnFn {
    public operator fun invoke(pwszmachine: Pcwstr): UInt
}

public typealias PnsContextConnectFn = PnsContextConnectFnFn?

public fun interface PnsContextDumpFnFn {
    public operator fun invoke(pwszrouter: Pcwstr, ppwcarguments: ConstPtr, dwargcount: UInt, pvdata: ConstPtr): UInt
}

public typealias PnsContextDumpFn = PnsContextDumpFnFn?

public fun interface PnsDllInitFnFn {
    public operator fun invoke(dwnetshversion: UInt, preserved: MutPtr): UInt
}

public typealias PnsDllInitFn = PnsDllInitFnFn?

public fun interface PnsDllStopFnFn {
    public operator fun invoke(dwreserved: UInt): UInt
}

public typealias PnsDllStopFn = PnsDllStopFnFn?

public fun interface PnsHelperStartFnFn {
    public operator fun invoke(pguidparent: ConstPtr, dwversion: UInt): UInt
}

public typealias PnsHelperStartFn = PnsHelperStartFnFn?

public fun interface PnsHelperStopFnFn {
    public operator fun invoke(dwreserved: UInt): UInt
}

public typealias PnsHelperStopFn = PnsHelperStopFnFn?

public fun interface PnsOsversioncheckFn {
    public operator fun invoke(cimostype: UInt, cimosproductsuite: UInt, cimosversion: Pcwstr, cimosbuildnumber: Pcwstr, cimservicepackmajorversion: Pcwstr, cimservicepackminorversion: Pcwstr, uireserved: UInt, dwreserved: UInt): Bool
}

public typealias PnsOsversioncheck = PnsOsversioncheckFn?
