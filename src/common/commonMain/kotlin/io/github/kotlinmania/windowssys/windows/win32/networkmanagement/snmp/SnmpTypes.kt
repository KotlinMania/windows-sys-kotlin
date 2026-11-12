package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
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
    public operator fun invoke(dwuptimereference: UInt, phsubagenttrapevent: MutPtr<Handle>, pfirstsupportedregion: MutPtr<AsnObjectIdentifier>): Bool
}

public typealias Pfnsnmpextensioninit = PfnsnmpextensioninitFn?

public fun interface PfnsnmpextensioninitexFn {
    public operator fun invoke(pnextsupportedregion: MutPtr<AsnObjectIdentifier>): Bool
}

public typealias Pfnsnmpextensioninitex = PfnsnmpextensioninitexFn?

public fun interface PfnsnmpextensionmonitorFn {
    public operator fun invoke(pagentmgmtdata: MutPtr<CVoid>): Bool
}

public typealias Pfnsnmpextensionmonitor = PfnsnmpextensionmonitorFn?

public fun interface PfnsnmpextensionqueryFn {
    public operator fun invoke(bpdutype: UByte, pvarbindlist: MutPtr<SnmpVarBindList>, perrorstatus: MutPtr<Int>, perrorindex: MutPtr<Int>): Bool
}

public typealias Pfnsnmpextensionquery = PfnsnmpextensionqueryFn?

public fun interface PfnsnmpextensionqueryexFn {
    public operator fun invoke(nrequesttype: UInt, ntransactionid: UInt, pvarbindlist: MutPtr<SnmpVarBindList>, pcontextinfo: MutPtr<AsnOctetString>, perrorstatus: MutPtr<Int>, perrorindex: MutPtr<Int>): Bool
}

public typealias Pfnsnmpextensionqueryex = PfnsnmpextensionqueryexFn?

public fun interface PfnsnmpextensiontrapFn {
    public operator fun invoke(penterpriseoid: MutPtr<AsnObjectIdentifier>, pgenerictrapid: MutPtr<Int>, pspecifictrapid: MutPtr<Int>, ptimestamp: MutPtr<UInt>, pvarbindlist: MutPtr<SnmpVarBindList>): Bool
}

public typealias Pfnsnmpextensiontrap = PfnsnmpextensiontrapFn?

public fun interface PfnsnmpstartupexFn {
    public operator fun invoke(param0: MutPtr<UInt>, param1: MutPtr<UInt>, param2: MutPtr<UInt>, param3: MutPtr<UInt>, param4: MutPtr<UInt>): UInt
}

public typealias Pfnsnmpstartupex = PfnsnmpstartupexFn?

public fun interface SnmpapiCallbackFn {
    public operator fun invoke(hsession: Long, hwnd: Hwnd, wmsg: UInt, wparam: Wparam, lparam: Lparam, lpclientdata: MutPtr<CVoid>): UInt
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
