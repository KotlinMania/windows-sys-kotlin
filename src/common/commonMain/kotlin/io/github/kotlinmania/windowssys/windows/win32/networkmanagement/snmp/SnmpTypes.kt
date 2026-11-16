package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam

public fun interface PfnsnmpcleanupexFn {
    public operator fun invoke(): UInt
}

public typealias Pfnsnmpcleanupex = PfnsnmpcleanupexFn?

public fun interface PfnsnmpextensioncloseFn {
    public operator fun invoke()
}

public typealias Pfnsnmpextensionclose = PfnsnmpextensioncloseFn?

public fun interface PfnsnmpextensioninitFn {
    public operator fun invoke(dwuptimereference: UInt, phsubagenttrapevent: MutPtr, pfirstsupportedregion: MutPtr): Bool
}

public typealias Pfnsnmpextensioninit = PfnsnmpextensioninitFn?

public fun interface PfnsnmpextensioninitexFn {
    public operator fun invoke(pnextsupportedregion: MutPtr): Bool
}

public typealias Pfnsnmpextensioninitex = PfnsnmpextensioninitexFn?

public fun interface PfnsnmpextensionmonitorFn {
    public operator fun invoke(pagentmgmtdata: MutPtr): Bool
}

public typealias Pfnsnmpextensionmonitor = PfnsnmpextensionmonitorFn?

public fun interface PfnsnmpextensionqueryFn {
    public operator fun invoke(bpdutype: UByte, pvarbindlist: MutPtr, perrorstatus: MutPtr, perrorindex: MutPtr): Bool
}

public typealias Pfnsnmpextensionquery = PfnsnmpextensionqueryFn?

public fun interface PfnsnmpextensionqueryexFn {
    public operator fun invoke(nrequesttype: UInt, ntransactionid: UInt, pvarbindlist: MutPtr, pcontextinfo: MutPtr, perrorstatus: MutPtr, perrorindex: MutPtr): Bool
}

public typealias Pfnsnmpextensionqueryex = PfnsnmpextensionqueryexFn?

public fun interface PfnsnmpextensiontrapFn {
    public operator fun invoke(penterpriseoid: MutPtr, pgenerictrapid: MutPtr, pspecifictrapid: MutPtr, ptimestamp: MutPtr, pvarbindlist: MutPtr): Bool
}

public typealias Pfnsnmpextensiontrap = PfnsnmpextensiontrapFn?

public fun interface PfnsnmpstartupexFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr, param2: MutPtr, param3: MutPtr, param4: MutPtr): UInt
}

public typealias Pfnsnmpstartupex = PfnsnmpstartupexFn?

public fun interface SnmpapiCallbackFn {
    public operator fun invoke(hsession: Long, hwnd: Hwnd, wmsg: UInt, wparam: Wparam, lparam: Lparam, lpclientdata: MutPtr): UInt
}

public typealias SnmpapiCallback = SnmpapiCallbackFn?

public typealias SnmpApiTranslateMode = UInt

public typealias SnmpError = UInt

public typealias SnmpErrorStatus = UInt

public typealias SnmpExtensionRequestType = UInt

public typealias SnmpGenerictrap = UInt

public typealias SnmpLog = Int

public typealias SnmpOutputLogType = UInt

public typealias SnmpPduType = UInt

public typealias SnmpStatus = UInt
