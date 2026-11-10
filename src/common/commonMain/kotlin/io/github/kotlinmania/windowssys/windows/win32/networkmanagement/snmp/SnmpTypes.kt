package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp

import io.github.kotlinmania.windowssys.COpaquePointer
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
    public operator fun invoke(dwuptimereference: UInt, phsubagenttrapevent: COpaquePointer?, pfirstsupportedregion: COpaquePointer?): Bool
}

public typealias Pfnsnmpextensioninit = PfnsnmpextensioninitFn?

public fun interface PfnsnmpextensioninitexFn {
    public operator fun invoke(pnextsupportedregion: COpaquePointer?): Bool
}

public typealias Pfnsnmpextensioninitex = PfnsnmpextensioninitexFn?

public fun interface PfnsnmpextensionmonitorFn {
    public operator fun invoke(pagentmgmtdata: COpaquePointer?): Bool
}

public typealias Pfnsnmpextensionmonitor = PfnsnmpextensionmonitorFn?

public fun interface PfnsnmpextensionqueryFn {
    public operator fun invoke(bpdutype: UByte, pvarbindlist: COpaquePointer?, perrorstatus: COpaquePointer?, perrorindex: COpaquePointer?): Bool
}

public typealias Pfnsnmpextensionquery = PfnsnmpextensionqueryFn?

public fun interface PfnsnmpextensionqueryexFn {
    public operator fun invoke(nrequesttype: UInt, ntransactionid: UInt, pvarbindlist: COpaquePointer?, pcontextinfo: COpaquePointer?, perrorstatus: COpaquePointer?, perrorindex: COpaquePointer?): Bool
}

public typealias Pfnsnmpextensionqueryex = PfnsnmpextensionqueryexFn?

public fun interface PfnsnmpextensiontrapFn {
    public operator fun invoke(penterpriseoid: COpaquePointer?, pgenerictrapid: COpaquePointer?, pspecifictrapid: COpaquePointer?, ptimestamp: COpaquePointer?, pvarbindlist: COpaquePointer?): Bool
}

public typealias Pfnsnmpextensiontrap = PfnsnmpextensiontrapFn?

public fun interface PfnsnmpstartupexFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?): UInt
}

public typealias Pfnsnmpstartupex = PfnsnmpstartupexFn?

public fun interface SnmpapiCallbackFn {
    public operator fun invoke(hsession: Long, hwnd: Hwnd, wmsg: UInt, wparam: Wparam, lparam: Lparam, lpclientdata: COpaquePointer?): UInt
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
